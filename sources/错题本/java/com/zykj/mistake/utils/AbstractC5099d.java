package com.zykj.mistake.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import coil3.AbstractC3336u;
import coil3.InterfaceC3308n;
import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import p068g7.C5609e;
import p068g7.ExecutorC5608d;
import p075h6.InterfaceC5631c;

/* renamed from: com.zykj.mistake.utils.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5099d {

    /* renamed from: a */
    public static final String[] f8030a = {"简单", "一般", "困难"};

    /* renamed from: b */
    public static final String[] f8031b = {"不懂", "基本懂", "完全懂"};

    /* renamed from: c */
    public static final String[] f8032c = {"概念", "审题", "运算", "粗心"};

    /* renamed from: d */
    public static final String[] f8033d = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "√", "×"};

    /* renamed from: e */
    public static Toast f8034e;

    /* renamed from: a */
    public static void m4451a(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                if (System.currentTimeMillis() - file.lastModified() >= 604800000) {
                    file.delete();
                    Log.i("clean", "当前清除的是文件---->" + file.getAbsolutePath());
                    return;
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    AbstractC5830k.m5327d(file2);
                    m4451a(file2);
                }
            }
            File[] fileArrListFiles2 = file.listFiles();
            if (fileArrListFiles2 == null || fileArrListFiles2.length != 0) {
                return;
            }
            file.delete();
            Log.i("clean", "当前清除的是文件夹---->" + file.getAbsolutePath());
        }
    }

    /* renamed from: b */
    public static final Object m4452b(Context context, InterfaceC5631c interfaceC5631c) {
        Context applicationContext = context.getApplicationContext();
        AbstractC5830k.m5329f(applicationContext, "getApplicationContext(...)");
        InterfaceC3308n interfaceC3308nM2283a = AbstractC3336u.m2283a(applicationContext);
        C5609e c5609e = AbstractC5896f0.f9343a;
        return AbstractC6014x.m5626F(ExecutorC5608d.f8730a, new CoilImageRequestsKt$clearCoilDiskCache$2(interfaceC3308nM2283a, null), interfaceC5631c);
    }

    /* renamed from: c */
    public static boolean m4453c(Context context, String str, boolean z8) {
        return context.getSharedPreferences("zykjMistake", 0).getBoolean(str, z8);
    }

    /* renamed from: d */
    public static boolean m4454d(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isAvailable();
    }

    /* renamed from: e */
    public static void m4455e(Context context, String str, boolean z8) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("zykjMistake", 0).edit();
        editorEdit.putBoolean(str, z8);
        editorEdit.commit();
    }

    /* renamed from: f */
    public static void m4456f(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("zykjMistake", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    /* renamed from: g */
    public static Bitmap m4457g(Bitmap bitmap) {
        AbstractC5830k.m5330g(bitmap, "<this>");
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = iArr[i8];
            if (Color.red(i9) >= 245 && Color.green(i9) >= 245 && Color.blue(i9) >= 245) {
                iArr[i8] = 0;
            }
        }
        bitmapCopy.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCopy;
    }
}
