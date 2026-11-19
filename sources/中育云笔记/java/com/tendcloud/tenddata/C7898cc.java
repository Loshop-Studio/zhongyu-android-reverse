package com.tendcloud.tenddata;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Environment;
import android.preference.PreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;
import java.util.regex.Pattern;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.tendcloud.tenddata.cc */
/* loaded from: classes5.dex */
public class C7898cc {

    /* renamed from: a */
    private static final String f14511a = "pref.deviceid.key";

    /* renamed from: d */
    private static final String f14514d = ".tcookieid";

    /* renamed from: e */
    private static final String f14515e = ".tlocalcookieid";

    /* renamed from: f */
    private static volatile String f14516f;

    /* renamed from: b */
    private static final Pattern f14512b = Pattern.compile("[0-4][0-9a-f]{24,32}");

    /* renamed from: c */
    private static final Pattern f14513c = Pattern.compile("[0-4][0-9a-f]{32}");

    /* renamed from: g */
    private static String f14517g = "TD_Custom_Dev_Id";

    /* renamed from: h */
    private static String f14518h = null;

    /* renamed from: a */
    public static synchronized String m11411a(Context context) {
        try {
            if (f14516f == null) {
                f14516f = m11423d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14516f;
    }

    /* renamed from: b */
    public static String m11420b(Context context) {
        try {
            String strM11569b = C7906ck.m11569b(context, "tdid", f14511a, (String) null);
            return C7912cq.m11608b(strM11569b) ? PreferenceManager.getDefaultSharedPreferences(context).getString(f14511a, null) : strM11569b;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m11422c(Context context) {
        if (f14518h == null) {
            try {
                Sensor[] sensorArr = new Sensor[64];
                for (Sensor sensor : ((SensorManager) context.getSystemService("sensor")).getSensorList(-1)) {
                    if (sensor.getType() < 64 && sensor.getType() >= 0) {
                        sensorArr[sensor.getType()] = sensor;
                    }
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (int i10 = 0; i10 < 64; i10++) {
                    if (sensorArr[i10] != null) {
                        stringBuffer.append(i10);
                        stringBuffer.append('.');
                        stringBuffer.append(sensorArr[i10].getVendor());
                        stringBuffer.append('-');
                        stringBuffer.append(sensorArr[i10].getName());
                        stringBuffer.append('-');
                        stringBuffer.append(sensorArr[i10].getVersion());
                        stringBuffer.append('\n');
                    }
                }
                f14518h = String.valueOf(stringBuffer.toString().hashCode());
            } catch (Throwable unused) {
            }
        }
        return f14518h;
    }

    /* renamed from: d */
    private static String m11423d(Context context) {
        String strM11419b;
        String strM11420b = m11420b(context);
        boolean zM11418a = m11418a();
        String strM11412a = m11412a(context, zM11418a, f14515e);
        if (!C7912cq.m11608b(strM11420b) && f14513c.matcher(strM11420b).matches()) {
            strM11419b = strM11420b;
        } else if (C7912cq.m11608b(strM11412a) || !f14513c.matcher(strM11412a).matches()) {
            String[] strArr = {m11414a(f14514d), m11412a(context, zM11418a, f14514d)};
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    strM11419b = null;
                    break;
                }
                strM11419b = strArr[i10];
                if (!C7912cq.m11608b(strM11419b) && f14513c.matcher(strM11419b).matches()) {
                    break;
                }
                i10++;
            }
        } else {
            strM11419b = strM11412a;
        }
        if (C7912cq.m11608b(strM11419b)) {
            strM11419b = C7912cq.m11595a(29) ? m11419b() : m11424e(context);
        }
        if (!strM11419b.equals(strM11420b)) {
            m11421b(context, strM11419b);
        }
        if (C7912cq.m11608b(strM11412a)) {
            m11416a(context, strM11419b, zM11418a);
        }
        return strM11419b;
    }

    /* renamed from: e */
    private static String m11424e(Context context) {
        return "3" + C7912cq.m11612c(m11425f(context));
    }

    /* renamed from: f */
    private static String m11425f(Context context) {
        try {
            return C7900ce.m11496f(context) + '-' + C7900ce.m11481a("mac") + '-' + C7900ce.m11481a("androidId");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m11412a(Context context, boolean z10, String str) {
        if (C7912cq.m11595a(23) && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return null;
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!z10) {
                str = str + m11422c(context);
            }
            String strM11413a = m11413a(new File(externalStorageDirectory, str));
            if (!C7912cq.m11608b(strM11413a)) {
                return strM11413a;
            }
            return m11413a(new File(Environment.getExternalStorageDirectory(), ".tid" + m11422c(context)));
        }
        return "";
    }

    /* renamed from: b */
    private static void m11421b(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("tdid", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(f14511a, str);
                editorEdit.apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static String m11419b() {
        String strM11481a = C7900ce.m11481a("mac");
        if (C7912cq.m11608b(strM11481a)) {
            strM11481a = C7900ce.m11481a("androidId");
        }
        if (C7912cq.m11608b(strM11481a)) {
            strM11481a = UUID.randomUUID().toString();
        }
        return "4" + C7912cq.m11612c(3 + strM11481a);
    }

    /* renamed from: a */
    public static String m11414a(String str) {
        String strM11413a = null;
        try {
            File[] fileArrListFiles = new File(MqttTopic.TOPIC_LEVEL_SEPARATOR).listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && !"/sdcard".equals(file.getAbsolutePath())) {
                        if (file.canWrite()) {
                            strM11413a = m11413a(new File(file, str));
                            if (!C7912cq.m11608b(strM11413a)) {
                                return strM11413a;
                            }
                        }
                        if (file.listFiles() != null) {
                            for (File file2 : file.listFiles()) {
                                if (file2.isDirectory()) {
                                    strM11413a = m11413a(new File(file2, str));
                                    if (!C7912cq.m11608b(strM11413a)) {
                                        return strM11413a;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return strM11413a;
    }

    /* renamed from: a */
    private static String m11413a(File file) {
        FileInputStream fileInputStream;
        try {
            if (file.exists() && file.canRead()) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[128];
                        String str = new String(bArr, 0, fileInputStream.read(bArr));
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return str;
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                }
            } else {
                fileInputStream = null;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    /* renamed from: a */
    private static void m11416a(Context context, String str, boolean z10) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            String str2 = f14515e;
            if (!z10) {
                str2 = f14515e + m11422c(context);
            }
            m11417a(new File(externalStorageDirectory, str2), str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m11415a(Context context, String str) {
        try {
            File[] fileArrListFiles = new File(MqttTopic.TOPIC_LEVEL_SEPARATOR).listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && !"/sdcard".equals(file.getAbsolutePath())) {
                        if (file.canWrite()) {
                            if (!new File(file, f14514d + m11422c(context)).exists()) {
                                m11417a(new File(file, f14514d), str);
                            }
                        }
                        if (file.listFiles() != null) {
                            for (File file2 : file.listFiles()) {
                                if (file2.isDirectory() && file2.canWrite()) {
                                    if (!new File(file2, f14514d + m11422c(context)).exists()) {
                                        m11417a(new File(file2, f14514d), str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m11417a(File file, String str) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file.exists() || !C7912cq.m11607b(C7843ab.f14307g, "android.permission.WRITE_EXTERNAL_STORAGE") || ((C7912cq.m11597a(C7843ab.f14307g, 29) && C7912cq.m11595a(29)) || file.createNewFile())) {
                    if (file.canWrite()) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            fileOutputStream2.write(str.getBytes());
                            if (C7912cq.m11595a(9)) {
                                Class<?> cls = file.getClass();
                                Class cls2 = Boolean.TYPE;
                                cls.getMethod("setReadable", cls2, cls2).invoke(file, Boolean.TRUE, Boolean.FALSE);
                            } else {
                                Runtime.getRuntime().exec("chmod 444 " + file.getAbsolutePath());
                            }
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable unused) {
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                return;
                            }
                            return;
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public static boolean m11418a() {
        return !(C7912cq.m11595a(9) ? Environment.isExternalStorageRemovable() : true);
    }
}
