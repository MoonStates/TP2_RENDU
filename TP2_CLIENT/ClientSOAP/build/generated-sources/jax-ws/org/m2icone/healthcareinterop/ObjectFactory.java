
package org.m2icone.healthcareinterop;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.m2icone.healthcareinterop package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EventResponse_QNAME = new QName("http://healthcareinterop.m2icone.org/", "eventResponse");
    private final static QName _Event_QNAME = new QName("http://healthcareinterop.m2icone.org/", "event");
    private final static QName _Calculator_QNAME = new QName("http://healthcareinterop.m2icone.org/", "calculator");
    private final static QName _CalculatorResponse_QNAME = new QName("http://healthcareinterop.m2icone.org/", "calculatorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.m2icone.healthcareinterop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calculator }
     * 
     */
    public Calculator createCalculator() {
        return new Calculator();
    }

    /**
     * Create an instance of {@link CalculatorResponse }
     * 
     */
    public CalculatorResponse createCalculatorResponse() {
        return new CalculatorResponse();
    }

    /**
     * Create an instance of {@link EventResponse }
     * 
     */
    public EventResponse createEventResponse() {
        return new EventResponse();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcareinterop.m2icone.org/", name = "eventResponse")
    public JAXBElement<EventResponse> createEventResponse(EventResponse value) {
        return new JAXBElement<EventResponse>(_EventResponse_QNAME, EventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Event }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcareinterop.m2icone.org/", name = "event")
    public JAXBElement<Event> createEvent(Event value) {
        return new JAXBElement<Event>(_Event_QNAME, Event.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcareinterop.m2icone.org/", name = "calculator")
    public JAXBElement<Calculator> createCalculator(Calculator value) {
        return new JAXBElement<Calculator>(_Calculator_QNAME, Calculator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcareinterop.m2icone.org/", name = "calculatorResponse")
    public JAXBElement<CalculatorResponse> createCalculatorResponse(CalculatorResponse value) {
        return new JAXBElement<CalculatorResponse>(_CalculatorResponse_QNAME, CalculatorResponse.class, null, value);
    }

}
