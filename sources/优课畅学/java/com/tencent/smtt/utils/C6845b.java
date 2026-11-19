package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* renamed from: com.tencent.smtt.utils.b */
/* loaded from: classes4.dex */
public class C6845b {

    /* renamed from: a */
    public static String f6958a = "";

    /* renamed from: b */
    public static String f6959b = "";

    /* renamed from: c */
    public static String f6960c = "";

    /* renamed from: d */
    public static String f6961d = "";

    /* renamed from: e */
    public static String f6962e = "";

    /* renamed from: a */
    private static PackageInfo m6265a(String str, int i10) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls;
        int i11 = 0;
        try {
            Class<?> cls2 = Class.forName("android.content.pm.PackageParser");
            Class<?>[] declaredClasses = cls2.getDeclaredClasses();
            int length = declaredClasses.length;
            while (true) {
                if (i11 >= length) {
                    cls = null;
                    break;
                }
                cls = declaredClasses[i11];
                if (cls.getName().compareTo("android.content.pm.PackageParser$Package") == 0) {
                    break;
                }
                i11++;
            }
            Constructor<?> constructor = cls2.getConstructor(String.class);
            Class cls3 = Integer.TYPE;
            Method declaredMethod = cls2.getDeclaredMethod("parsePackage", File.class, String.class, DisplayMetrics.class, cls3);
            Method declaredMethod2 = cls2.getDeclaredMethod("collectCertificates", cls, cls3);
            Class cls4 = Long.TYPE;
            Method declaredMethod3 = cls2.getDeclaredMethod("generatePackageInfo", cls, int[].class, cls3, cls4, cls4);
            constructor.setAccessible(true);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            declaredMethod3.setAccessible(true);
            Object objNewInstance = constructor.newInstance(str);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayMetrics.setToDefaults();
            Object objInvoke = declaredMethod.invoke(objNewInstance, new File(str), str, displayMetrics, 0);
            if (objInvoke == null) {
                return null;
            }
            if ((i10 & 64) != 0) {
                declaredMethod2.invoke(objNewInstance, objInvoke, 0);
            }
            return (PackageInfo) declaredMethod3.invoke(null, objInvoke, null, Integer.valueOf(i10), 0, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static int m6275b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static String m6276c(Context context) {
        if (!TextUtils.isEmpty(f6958a)) {
            return f6958a;
        }
        try {
            return ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getDeviceId();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m6277d(Context context) {
        if (!TextUtils.isEmpty(f6959b)) {
            return f6959b;
        }
        try {
            return ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSubscriberId();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public static String m6278e(Context context) {
        if (!TextUtils.isEmpty(f6961d)) {
            return f6961d;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            WifiInfo connectionInfo = wifiManager == null ? null : wifiManager.getConnectionInfo();
            return connectionInfo == null ? "" : connectionInfo.getMacAddress();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: f */
    public static String m6279f(Context context) {
        if (!TextUtils.isEmpty(f6962e)) {
            return f6962e;
        }
        try {
            f6962e = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return f6962e;
    }

    /* renamed from: g */
    public static String m6280g(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    /* renamed from: a */
    public static String m6266a() throws IOException {
        InputStreamReader inputStreamReader;
        Throwable th;
        BufferedReader bufferedReader;
        String strM6272a = "os.arch";
        if (!TextUtils.isEmpty(f6960c)) {
            return f6960c;
        }
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
            }
            try {
                strM6272a = m6272a(bufferedReader.readLine().contains("x86") ? "i686" : System.getProperty("os.arch"));
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    strM6272a = m6272a(System.getProperty(strM6272a));
                    th.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return strM6272a;
                } finally {
                }
            }
        } catch (Throwable th4) {
            inputStreamReader = null;
            th = th4;
            bufferedReader = null;
        }
        try {
            inputStreamReader.close();
        } catch (IOException unused3) {
        }
        return strM6272a;
    }

    /* renamed from: a */
    public static String m6267a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m6268a(Context context, File file) {
        String strM6269a = m6269a(context, file, false);
        if (strM6269a == null) {
            strM6269a = m6271a(file);
        }
        return strM6269a == null ? m6269a(context, file, true) : strM6269a;
    }

    /* renamed from: a */
    private static String m6269a(Context context, File file, boolean z10) {
        Signature signature;
        PackageInfo packageInfoM6265a = z10 ? m6265a(file.getAbsolutePath(), 65) : context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 65);
        if (packageInfoM6265a == null) {
            signature = null;
        } else {
            Signature[] signatureArr = packageInfoM6265a.signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                TbsLog.m6252w("AppUtil", "[getSignatureFromApk] pkgInfo is not null BUT signatures is null!");
                signature = null;
            } else {
                signature = signatureArr[0];
            }
        }
        if (signature != null) {
            return signature.toCharsString();
        }
        return null;
    }

    /* renamed from: a */
    public static String m6270a(Context context, String str) {
        try {
            String strValueOf = String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
            try {
                return String.valueOf(Integer.toHexString(Integer.parseInt(strValueOf)));
            } catch (Exception unused) {
                return strValueOf;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m6271a(File file) {
        try {
            JarFile jarFile = new JarFile(file);
            byte[] bArr = new byte[8192];
            String strM6273a = m6273a(m6274a(jarFile, jarFile.getJarEntry("AndroidManifest.xml"), bArr)[0].getEncoded());
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                String name = jarEntryNextElement.getName();
                if (name != null) {
                    Certificate[] certificateArrM6274a = m6274a(jarFile, jarEntryNextElement, bArr);
                    String strM6273a2 = certificateArrM6274a != null ? m6273a(certificateArrM6274a[0].getEncoded()) : null;
                    if (strM6273a2 == null) {
                        if (!name.startsWith("META-INF/")) {
                            return null;
                        }
                    } else if (!strM6273a2.equals(strM6273a)) {
                        return null;
                    }
                }
            }
            return strM6273a;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static String m6272a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    private static String m6273a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            int i11 = (b10 >> 4) & 15;
            int i12 = i10 * 2;
            cArr[i12] = (char) (i11 >= 10 ? i11 + 87 : i11 + 48);
            int i13 = b10 & 15;
            cArr[i12 + 1] = (char) (i13 >= 10 ? i13 + 87 : i13 + 48);
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static Certificate[] m6274a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) throws IOException {
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        while (inputStream.read(bArr, 0, bArr.length) != -1) {
        }
        inputStream.close();
        if (jarEntry != null) {
            return jarEntry.getCertificates();
        }
        return null;
    }
}
