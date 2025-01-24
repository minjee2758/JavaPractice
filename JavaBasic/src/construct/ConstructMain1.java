package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("u2", 16, 80);


        MemberConstruct[] memberConstructs = {member1, member2};

        for (MemberConstruct memberConstruct : memberConstructs) {
            System.out.println(memberConstruct.name + memberConstruct.age + memberConstruct.grade);

        }
    }
}
