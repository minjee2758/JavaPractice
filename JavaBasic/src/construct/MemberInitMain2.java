package construct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 16,80);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 10,90);


        MemberInit[] memberInits = {member1, member2};

        for (MemberInit memberInit : memberInits) {
            System.out.println("name : " +memberInit.name+", age : " + memberInit.age +", grade : " + memberInit.grade);

        }
    }
    static void initMember(MemberInit memberInit, String name, int age, int grade){
        memberInit.name = name;
        memberInit.age =age;
        memberInit.grade = grade;
    }
}
