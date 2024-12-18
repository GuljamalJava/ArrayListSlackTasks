public class Student {
    private String name;
    private int age;
    private String group;

    public Student() {
    }

    public Student(String name,int age, String group) {
        this.age = age;
        this.group = group;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

}
