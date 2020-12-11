package com.atguan.learingjvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingtian
 * @date 2020-12-11 10:46
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }

}
