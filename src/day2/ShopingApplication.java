package day2;

import javax.swing.*;

public class ShopingApplication {
    public static void main(String[] args) {
        Menu womenFashion = new Menu();
        womenFashion.menuId = 1;
        womenFashion.menuName = "Women's Fashion";
        //womenFashion.parentMenuId = 0; this does not needs to be passed because it is by default 0.
        womenFashion.isLeaf = false;

        Menu womenClothing = new Menu();
        womenClothing.menuId = 3;
        womenClothing.menuName = "Clothing";
        womenClothing.parentMenuId = 1;
        womenClothing.isLeaf = false;
        womenClothing.slug = "womens-clothing";

        Menu topAndTshirt = new Menu();
        topAndTshirt.menuId = 4;
        topAndTshirt.menuName = "Top's & T-shirts";
        topAndTshirt.parentMenuId = 3;
        topAndTshirt.isLeaf = true;
        topAndTshirt.slug = "tops";


        Menu menFashion = new Menu();
        menFashion.menuId = 2;
        menFashion.menuName = "Men's Fashion";
        //menFashion.parentMenuId = 0;
        menFashion.isLeaf = false;

        Menu menClothing = new Menu();
        menClothing.menuId = 5;
        menClothing.menuName = "Men's Clothing";
        menClothing.parentMenuId = 2;
        menClothing.isLeaf = false;
        menClothing.slug = "mens-clothing";

        Menu casualTops =new Menu();
        casualTops.menuId = 6;
        casualTops.menuName = "Casual Tops";
        casualTops.parentMenuId = 5;
        casualTops.isLeaf = true;
        casualTops.slug = "mens-casual-tops";


        Menu healthAndBeauty = new Menu();
        healthAndBeauty.menuId = 7;
        healthAndBeauty.menuName = "Health and Beauty";
        //healthAndBeauty.parentMenuId = 0;
        healthAndBeauty.isLeaf = false;

        Menu bathAndBody = new Menu();
        bathAndBody.menuId = 8;
        bathAndBody.menuName = "Bath and Body";
        bathAndBody.parentMenuId = 7;
        bathAndBody.isLeaf = false;
        bathAndBody.slug = "bath-body";

        Menu bodyAndMassageOils = new Menu();
        bodyAndMassageOils.menuId = 9;
        bodyAndMassageOils.menuName = "Body and Massage Oils";
        bodyAndMassageOils.parentMenuId = 8;
        bodyAndMassageOils.isLeaf = true;
        bodyAndMassageOils.slug = "body-oils";


    }
}
