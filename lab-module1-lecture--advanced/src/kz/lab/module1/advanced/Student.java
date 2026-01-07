package kz.lab.module1.advanced;

public final class Student {

    private final int id;
    private final String name;
    private final String phone;

    public Student (int id, String name, String phone) {
        if(id < 0){throw new IllegalArgumentException("id can't be negative");}
        if(name == null || name.isBlank()){throw new IllegalArgumentException("Name is empty");}
        if(phone == null || phone.isBlank()){throw new IllegalArgumentException("Phone is empty");}

        this.id = id;
        this.name = name;
        this.phone =phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "Имя: " + name + "\n" +
                "Телефон: " + phone + "\n";
    }
}
