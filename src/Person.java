/**
 * Created by Jack on 10/8/15.
 */
public class Person {
    public String name;
    public int age;
    public double height;

    public void setName(String name) {
        this.name = name;  // Keyword this refers to the object you are currently inside of.  this.name refers to the name field above, not the argument within the method.  The = name refers to the argument
    }

    public String getName() {
        return name;  // Again, name here refers to the field, not the argument.
    }

}
