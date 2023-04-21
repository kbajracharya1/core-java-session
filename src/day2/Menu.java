package day2;

public class Menu {
    long menuId;
    String menuName;
    long parentMenuId;
    boolean isLeaf;
    String slug;
}


    //UUID - Unique String ID 32 characters

    /*
    Menu Name (String)
    Menu ID (long)
    Parent Menu ID (long)
    Is Leaf(boolean, last menu) - False
    Slug (String, unique URL, auto generated)
     */


    /*
    Women Fashion
    Menu ID - 1
    Menu Name - Women Fashion
    Parent Menu ID - 0
    Is Leaf - false
    Slug - Women-Fashion

    Men Fashion
    Menu ID - 2
    Menu Name - Men Fashion
    Parent Menu ID - 0
    Is Leaf - false
    Slug - Men-Fashion

    Women Fashion -> Clothing
    Menu ID - 3
    Menu Name - Clothing
    Parent Menu ID - 1
    Is Leaf - false
    Slug - Women-Fashion-Clothing

    Men Fashion -> Clothing
    Menu ID - 4
    Menu Name - Clothing
    Parent Menu ID - 2
    Is Leaf - false
    Slug - Men-Fashion-Clothing

    Women Fashion -> Clothing -> Tops and T-shirt's
    Menu ID - 5
    Menu Name - Tops and T-shirt's
    Parent Menu ID - 3
    Is Leaf - true
    Slug - Women-Fashion-Clothing-Tops-and-T-shirt's

    Men Fashion -> Clothing -> Tops and T-shirts
    Menu ID - 6
    Menu Name - Tops and T-shirts
    Parent Menu ID - 4
    Is Leaf - true
    Slug - Men-Fashion-Clothing-Tops-and-T-shirt's
     */





