class Person{
	private String name;
	private int age;
	private String address;
	
	Person(){
        this.name = "모름";
        this.age = -1;
        this.address = "모름";
	}
	
	Person(String name){
        this.name = name;
        this.age = -1;
        this.address = "모름";
	}
	
	Person(String name, int age){
        this.name = name;
        this.age = age;
        this.address = "모름";
	}
	
	Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
	}
	   // name 필드의 접근자 (Getter)
    public String getName() {
        return name;
    }

    // name 필드의 설정자 (Setter)
    public void setName(String name) {
        this.name = name;
    }

    // age 필드의 접근자 (Getter)
    public int getAge() {
        return age;
    }

    // age 필드의 설정자 (Setter)
    public void setAge(int age) {
        this.age = age;
    }

    // address 필드의 접근자 (Getter)
    public String getAddress() {
        return address;
    }

    // address 필드의 설정자 (Setter)
    public void setAddress(String address) {
        this.address = address;
    }

    
	
    public String toString() {
        return "이름: "+name+ ", 나이: "+(age == -1 ? "모름" : age + "세")+ ", 주소: "+address;
    }
}

public class Practice29 {

	public static void main(String[] args) {
        Person person1 = new Person("김동덕", 22, "서울시");
        Person person2 = new Person("홍길동", 30, "제주시");
        Person person3 = new Person("성춘향", 16, "남원시");

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

	}

}
