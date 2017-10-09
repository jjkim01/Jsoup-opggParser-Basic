/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opggparse;

import java.io.IOException;
import java.util.Scanner;
import static opggparse.parse.Parse;

/**
 *
 * @author jaejin
 */
public class OpggParse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 플레이어 명을 입력하세요 : ");
        String userName = sc.nextLine();
        Parse(userName);
    }
}
