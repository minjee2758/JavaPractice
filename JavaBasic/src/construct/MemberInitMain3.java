package construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("u1", 15,80);

        MemberInit member2 = new MemberInit();
        member2.initMember("u2", 16,90);


        MemberInit[] memberInits = {member1, member2};

        for (MemberInit memberInit : memberInits) {
            System.out.println("name : " +memberInit.name+", age : " + memberInit.age +", grade : " + memberInit.grade);

        }
    }
}
