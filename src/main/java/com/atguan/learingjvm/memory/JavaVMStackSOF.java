package com.atguan.learingjvm.memory;

/**
 * @author qingtian
 * @date 2020-12-11 13:21
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF sof = new JavaVMStackSOF();

        try {
            sof.stackLeak();
        } catch (Exception e) {
            System.out.println("stack length:"+sof.stackLength);
            e.printStackTrace();
        }

    }

}
