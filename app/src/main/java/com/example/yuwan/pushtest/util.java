package com.example.yuwan.pushtest;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Created by YuWan on 2018/4/8.
 */

public class util {
    public static final String LOG_TAG = "TESTINFO";

    public static void HClient(String token) {
        try {
            Socket socket = new Socket("10.10.2.8", 9050);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(token);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
