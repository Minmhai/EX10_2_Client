
package servicedclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicedclient package. 
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

    private final static QName _DeleteStudent_QNAME = new QName("http://services/", "deleteStudent");
    private final static QName _FindStudentbyId_QNAME = new QName("http://services/", "findStudentbyId");
    private final static QName _FindAllStudent_QNAME = new QName("http://services/", "findAllStudent");
    private final static QName _FindStudentbyIdResponse_QNAME = new QName("http://services/", "findStudentbyIdResponse");
    private final static QName _InsertStudent_QNAME = new QName("http://services/", "insertStudent");
    private final static QName _InsertStudentResponse_QNAME = new QName("http://services/", "insertStudentResponse");
    private final static QName _UpdateStudent_QNAME = new QName("http://services/", "updateStudent");
    private final static QName _FindAllStudentResponse_QNAME = new QName("http://services/", "findAllStudentResponse");
    private final static QName _Student_QNAME = new QName("http://services/", "student");
    private final static QName _UpdateStudentResponse_QNAME = new QName("http://services/", "updateStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicedclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertStudentResponse }
     * 
     */
    public InsertStudentResponse createInsertStudentResponse() {
        return new InsertStudentResponse();
    }

    /**
     * Create an instance of {@link FindAllStudent }
     * 
     */
    public FindAllStudent createFindAllStudent() {
        return new FindAllStudent();
    }

    /**
     * Create an instance of {@link FindStudentbyIdResponse }
     * 
     */
    public FindStudentbyIdResponse createFindStudentbyIdResponse() {
        return new FindStudentbyIdResponse();
    }

    /**
     * Create an instance of {@link InsertStudent }
     * 
     */
    public InsertStudent createInsertStudent() {
        return new InsertStudent();
    }

    /**
     * Create an instance of {@link FindAllStudentResponse }
     * 
     */
    public FindAllStudentResponse createFindAllStudentResponse() {
        return new FindAllStudentResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link UpdateStudentResponse }
     * 
     */
    public UpdateStudentResponse createUpdateStudentResponse() {
        return new UpdateStudentResponse();
    }

    /**
     * Create an instance of {@link UpdateStudent }
     * 
     */
    public UpdateStudent createUpdateStudent() {
        return new UpdateStudent();
    }

    /**
     * Create an instance of {@link DeleteStudent }
     * 
     */
    public DeleteStudent createDeleteStudent() {
        return new DeleteStudent();
    }

    /**
     * Create an instance of {@link FindStudentbyId }
     * 
     */
    public FindStudentbyId createFindStudentbyId() {
        return new FindStudentbyId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteStudent")
    public JAXBElement<DeleteStudent> createDeleteStudent(DeleteStudent value) {
        return new JAXBElement<DeleteStudent>(_DeleteStudent_QNAME, DeleteStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentbyId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentbyId")
    public JAXBElement<FindStudentbyId> createFindStudentbyId(FindStudentbyId value) {
        return new JAXBElement<FindStudentbyId>(_FindStudentbyId_QNAME, FindStudentbyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllStudent")
    public JAXBElement<FindAllStudent> createFindAllStudent(FindAllStudent value) {
        return new JAXBElement<FindAllStudent>(_FindAllStudent_QNAME, FindAllStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentbyIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentbyIdResponse")
    public JAXBElement<FindStudentbyIdResponse> createFindStudentbyIdResponse(FindStudentbyIdResponse value) {
        return new JAXBElement<FindStudentbyIdResponse>(_FindStudentbyIdResponse_QNAME, FindStudentbyIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertStudent")
    public JAXBElement<InsertStudent> createInsertStudent(InsertStudent value) {
        return new JAXBElement<InsertStudent>(_InsertStudent_QNAME, InsertStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertStudentResponse")
    public JAXBElement<InsertStudentResponse> createInsertStudentResponse(InsertStudentResponse value) {
        return new JAXBElement<InsertStudentResponse>(_InsertStudentResponse_QNAME, InsertStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudent")
    public JAXBElement<UpdateStudent> createUpdateStudent(UpdateStudent value) {
        return new JAXBElement<UpdateStudent>(_UpdateStudent_QNAME, UpdateStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllStudentResponse")
    public JAXBElement<FindAllStudentResponse> createFindAllStudentResponse(FindAllStudentResponse value) {
        return new JAXBElement<FindAllStudentResponse>(_FindAllStudentResponse_QNAME, FindAllStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudentResponse")
    public JAXBElement<UpdateStudentResponse> createUpdateStudentResponse(UpdateStudentResponse value) {
        return new JAXBElement<UpdateStudentResponse>(_UpdateStudentResponse_QNAME, UpdateStudentResponse.class, null, value);
    }

}
