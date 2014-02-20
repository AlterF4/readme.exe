package Trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class BinaryTreeTest {

   
    public void test() {
        BinaryTree Testtree = new BinaryTree();
       
        Testtree.insert(50);
        Testtree.insert(25);
        Testtree.insert(75);
        Testtree.insert(10);
        Testtree.insert(30);
        Testtree.insert(60);
        Testtree.insert(65);
        Testtree.insert(80);
        Testtree.insert(85);
        Testtree.insert(1);

       // Testtree.delete(60);
        Testtree.traverse();
      
        System.out.println(  Testtree.find(10).getKey());
        DbConnection dbc=new DbConnection();
        try {
            dbc.getConnectiontoSqlServer();
            System.out.println("System is updated");
        }
        catch(Exception e){
            System.out.printf(e.getMessage());
        }
        
       
    }

}
