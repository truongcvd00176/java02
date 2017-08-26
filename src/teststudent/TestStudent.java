/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

/**
 *
 * @author ASUS
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names = "Nam, Truong, Dung, Danh, Tung, Khanh, Linh, Dong, Chien, Truong, Ngoc, Toan, Toan";
        String[] arrayName = names.split(",");
        for (int i = 0; i < arrayName.length; i++) {
         
            System.out.println(i + 1 +". " + arrayName[i].trim());
        }
//        for(String name : arrayName){
//            System.out.println(name);
//        }
    }
;

}
