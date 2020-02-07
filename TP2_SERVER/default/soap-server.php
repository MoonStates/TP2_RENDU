<?php
ini_set("soap.wsdl_cache_enabled", "0");

class Server{

    protected $class_name = '';

    public function __construct($class_name)
    {
        $this->class_name = $class_name;
    }
    public function AuthHeader($Header)
    {
        //if($Header->username == 'foo' && $Header->password == 'bar')
        //   $this->authenticated = true;

    }

    public function log($method_name,$data)
    {
        $filename = 'log.txt';
        $handle = fopen($filename, 'a+');
        fwrite($handle, date("l dS of F Y h:i:s A").' - '.$_SERVER['REMOTE_ADDR']."\r\n".$method_name."\r\n".print_r($data,true));
        fclose($handle);
    }

    public function __call($method_name, $parameters)
    {
        $this->log($method_name,$parameters); //  log
        //if($arguments[0]!=AUTH) return 'Authorization required'; // auth check
        if(!method_exists($this->class_name, $method_name )) return 'Method '.$method_name.' not found'; // methot exist check
        return call_user_func_array(array($this->class_name, $method_name ), $parameters); //call method
    }
}

 function Calculator ($parameters) {
    $num1 = $parameters->num1;
    $num2 = $parameters->num2;

    return AverageResponse(($num1 + $num2) / 2);
}

function AverageResponse ($message)
{
    return ['Result' => $message];
}

$Service = new Server('Calculator');
$classmap=[
    'in' => 'in'
];
$server = new SOAPServer('HealthCareInteropService.wsdl', array(
    'soap_version' => SOAP_1_2,
    'style' => SOAP_RPC,
    'use' => SOAP_LITERAL,
    'classmap'=>$classmap
));

$server->addFunction('Calculator');
$server->handle();
MathisHier à 10:58
<?php
ini_set("soap.wsdl_cache_enabled", "0");

class Server{

    protected $class_name = '';

    public function __construct($class_name)
    {
        $this->class_name = $class_name;
    }
    

    public function log($method_name,$data)
    {
        $filename = 'log.txt';
        $handle = fopen($filename, 'a+');
        fwrite($handle, date("l dS of F Y h:i:s A").' - '.$_SERVER['REMOTE_ADDR']."\r\n".$method_name."\r\n".print_r($data,true));
        fclose($handle);
    }

    public function __call($method_name, $parameters)
    {
        $this->log($method_name,$parameters); //  log
        //if($arguments[0]!=AUTH) return 'Authorization required'; // auth check
        if(!method_exists($this->class_name, $method_name )) return 'Method '.$method_name.' not found'; // methot exist check
        return call_user_func_array(array($this->class_name, $method_name ), $parameters); //call method
    }
}

function Calculator ($param) {
    switch ($param->operator) {
        case 'add':
            return $param->val1 + $param->val2;
            break;
        case 'substract':
            return $param->val1 - $param->val2;
            break;
        default:
        return 4;
            break;
    }
}

function AverageResponse ($message)
{
    return ['Result' => $message];
}

$Service = new Server('Calculator');
$classmap=[
    'in' => 'in'
];
$server = new SOAPServer('HealthCareInteropService.wsdl', array(
    'soap_version' => SOAP_1_2,
    'style' => SOAP_RPC,
    'use' => SOAP_LITERAL,
    'classmap'=>$classmap
));

$server->addFunction('Calculator');
$server->handle();
?>