import dto.Person;
import jdevhl.lang.EasyObject;

public class EasyObjectExample {

    public static void main(String[] args) {
        Person person = null;
        boolean isNull = EasyObject.isNull(person);
        System.out.println("The person is null: " + isNull);

        Person person2 = new Person();
        boolean isNull2 = EasyObject.isNull(person2);

        System.out.println("The person is null: " + isNull2);

    }

}
