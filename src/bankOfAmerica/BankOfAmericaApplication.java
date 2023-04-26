package bankOfAmerica;

public class BankOfAmericaApplication {
    public static void main(String[] args) {
        Menu personal = new Menu();
        personal.menuId = 1;
        personal.menuName = "Personal";
        personal.parentMenuId = 0;
        personal.isLeaf = false;

        Menu checking = new Menu();
        checking.menuId = 2;
        checking.menuName = "Checking";
        checking.parentMenuId = 1;
        checking.isLeaf = false;

        Menu advantageBanking = new Menu();
        advantageBanking.menuId = 3;
        advantageBanking.menuName = "Advantage Banking";
        advantageBanking.parentMenuId = 2;
        advantageBanking.isLeaf = true;

        Menu studentBanking = new Menu();
        studentBanking.menuId = 4;
        studentBanking.menuName = "Student Banking";
        studentBanking.parentMenuId = 2;
        studentBanking.isLeaf = true;

        Menu businessChecking = new Menu();
        businessChecking.menuId = 5;
        businessChecking.menuName = "Business Checking";
        businessChecking.parentMenuId = 2;
        businessChecking.isLeaf = true;


    }
}
