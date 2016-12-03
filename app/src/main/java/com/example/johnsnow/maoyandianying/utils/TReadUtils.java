package com.example.johnsnow.maoyandianying.utils;

/**
 * Created by JohnSnow on 2016/12/3.
 */

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class TReadUtils {
    private Context mContext;

    public TReadUtils(Context mContext) {
        this.mContext = mContext;
    }
    public String readJson() {
        try {
            InputStream mInputStream = mContext.getAssets().open("city_name.xml");
            return inputStream2String(mInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String inputStream2String(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i = -1;
        while ((i = is.read()) != -1) {
            baos.write(i);
        }
        return baos.toString();
    }
}
