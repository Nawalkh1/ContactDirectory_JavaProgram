/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactdirectory;

/**
 *
 * @author Nawal khan 
 */
public class Directory {
    private Contact dir[];
    private int num;
    
    public Directory(Contact directory[], int num){
        dir = directory;
        this.num = num;
    }
    public Directory(int cap){
        dir = new Contact[cap];
        num = 0;
    }
}
