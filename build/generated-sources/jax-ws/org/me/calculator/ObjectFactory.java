
package org.me.calculator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.calculator package. 
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

    private final static QName _Multiply_QNAME = new QName("http://calculator.me.org/", "multiply");
    private final static QName _AddResponse_QNAME = new QName("http://calculator.me.org/", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://calculator.me.org/", "multiplyResponse");
    private final static QName _SaisieErroneeException_QNAME = new QName("http://calculator.me.org/", "SaisieErroneeException");
    private final static QName _DivisionResponse_QNAME = new QName("http://calculator.me.org/", "divisionResponse");
    private final static QName _Substitution_QNAME = new QName("http://calculator.me.org/", "substitution");
    private final static QName _Add_QNAME = new QName("http://calculator.me.org/", "add");
    private final static QName _Division_QNAME = new QName("http://calculator.me.org/", "division");
    private final static QName _SubstitutionResponse_QNAME = new QName("http://calculator.me.org/", "substitutionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.calculator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link SubstitutionResponse }
     * 
     */
    public SubstitutionResponse createSubstitutionResponse() {
        return new SubstitutionResponse();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Substitution }
     * 
     */
    public Substitution createSubstitution() {
        return new Substitution();
    }

    /**
     * Create an instance of {@link SaisieErroneeException }
     * 
     */
    public SaisieErroneeException createSaisieErroneeException() {
        return new SaisieErroneeException();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaisieErroneeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "SaisieErroneeException")
    public JAXBElement<SaisieErroneeException> createSaisieErroneeException(SaisieErroneeException value) {
        return new JAXBElement<SaisieErroneeException>(_SaisieErroneeException_QNAME, SaisieErroneeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substitution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "substitution")
    public JAXBElement<Substitution> createSubstitution(Substitution value) {
        return new JAXBElement<Substitution>(_Substitution_QNAME, Substitution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstitutionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "substitutionResponse")
    public JAXBElement<SubstitutionResponse> createSubstitutionResponse(SubstitutionResponse value) {
        return new JAXBElement<SubstitutionResponse>(_SubstitutionResponse_QNAME, SubstitutionResponse.class, null, value);
    }

}
