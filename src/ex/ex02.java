﻿package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
      int n =scn.nextInt();
      int a = 1,b =1;
      while(a<=n){
    	  b=b*a;
    	  a++;
      }System.out.println(b);
	}

}
