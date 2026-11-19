package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.cq */
/* loaded from: classes5.dex */
public class C7912cq {

    /* renamed from: a */
    public static final boolean f14608a = false;

    /* renamed from: b */
    public static String f14609b = "TDLog";

    /* renamed from: c */
    public static boolean f14610c = false;

    /* renamed from: d */
    static final /* synthetic */ boolean f14611d = true;

    /* renamed from: e */
    private static volatile int f14612e = -1;

    /* renamed from: f */
    private static final String f14613f = "UTF-8";

    /* renamed from: g */
    private static final String f14614g = "ge";

    /* renamed from: h */
    private static final String f14615h = "tp";

    /* renamed from: i */
    private static final String f14616i = "rop";

    /* renamed from: l */
    private static final byte f14619l = 61;

    /* renamed from: m */
    private static final String f14620m = "US-ASCII";

    /* renamed from: q */
    private static final String f14624q = "00:00:00:00:00:00";

    /* renamed from: r */
    private static final String f14625r = "02:00:00:00:00:00";

    /* renamed from: j */
    private static final ExecutorService f14617j = Executors.newSingleThreadExecutor();

    /* renamed from: k */
    private static final HashMap<String, Boolean> f14618k = new HashMap<>();

    /* renamed from: n */
    private static final byte[] f14621n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: o */
    private static byte[] f14622o = {1, 2, 3, 4, 5, 6, 7, 8};

    /* renamed from: p */
    private static final SecureRandom f14623p = new SecureRandom();

    /* renamed from: s */
    private static final Pattern f14626s = Pattern.compile("^([0-9A-F]{2}:){5}([0-9A-F]{2})$");

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:22|3)|(3:24|4|(4:6|20|7|8))|18|9|14|(1:(0))) */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m11586a(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 0
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Throwable -> L2d
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> L2d
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L2e
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L2e
            int r1 = r2.read(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 <= 0) goto L29
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "td_channel_id"
            java.lang.String r3 = r3.getString(r1)     // Catch: java.lang.Throwable -> L2e
            r2.close()     // Catch: java.lang.Throwable -> L28
        L28:
            return r3
        L29:
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L31
        L2d:
            r2 = r0
        L2e:
            if (r2 == 0) goto L31
            goto L29
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7912cq.m11586a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m11606b(Context context) {
        return false;
    }

    /* renamed from: c */
    public static String m11612c(String str) {
        try {
            return m11589a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m11616d(String str) {
        try {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
            }
            return bArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m11618e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m11589a(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void execute(Runnable runnable) {
        ExecutorService executorService = f14617j;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }

    /* renamed from: f */
    public static byte[] m11620f(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(9, true);
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                try {
                    deflaterOutputStream2.write(str.getBytes("UTF-8"));
                    deflaterOutputStream2.close();
                } catch (Throwable unused) {
                    deflaterOutputStream = deflaterOutputStream2;
                    if (deflaterOutputStream != null) {
                        deflaterOutputStream.close();
                    }
                    deflater.end();
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: g */
    public static Long m11621g(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* renamed from: h */
    public static Integer m11622h(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: i */
    public static boolean m11623i(String str) {
        return !m11608b(str) && C7905cj.f14576h.matcher(str).matches();
    }

    /* renamed from: j */
    public static boolean m11624j(String str) {
        try {
            if (m11608b(str) || !f14626s.matcher(str).matches() || f14625r.equals(str)) {
                return true;
            }
            return f14624q.equals(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m11608b(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m11607b(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.tendcloud.tenddata.C7912cq.f14618k     // Catch: java.lang.Throwable -> L34
            boolean r2 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L14
            java.lang.Object r4 = r1.get(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L34
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L34
            return r4
        L14:
            r2 = 23
            boolean r2 = m11595a(r2)     // Catch: java.lang.Throwable -> L34
            r3 = 1
            if (r2 == 0) goto L26
            int r4 = r4.checkSelfPermission(r5)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L24
            goto L2c
        L24:
            r3 = r0
            goto L2c
        L26:
            int r4 = r4.checkCallingOrSelfPermission(r5)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L24
        L2c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L34
            r1.put(r5, r4)     // Catch: java.lang.Throwable -> L34
            return r3
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7912cq.m11607b(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: c */
    public static boolean m11614c(Context context, String str) {
        return m11595a(23) ? context.checkSelfPermission(str) == 0 : context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: d */
    public static String m11615d(Context context, String str) {
        try {
            return m11587a(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData, str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static FileChannel m11619e(Context context, String str) {
        RandomAccessFile randomAccessFile;
        try {
            File file = new File(context.getFilesDir(), str + "td.lock");
            if (!file.exists()) {
                file.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                return randomAccessFile.getChannel();
            } catch (Throwable unused) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable unused2) {
                    }
                }
                return null;
            }
        } catch (Throwable unused3) {
            randomAccessFile = null;
        }
    }

    /* renamed from: c */
    public static String m11613c(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        String str;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byte[] bArr2 = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i10 = gZIPInputStream.read(bArr2, 0, 1024);
                        if (i10 == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr2, 0, i10);
                    } catch (Throwable unused) {
                        str = null;
                    }
                }
                str = new String(byteArrayOutputStream2.toByteArray());
                try {
                    byteArrayOutputStream2.flush();
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    return str;
                }
            } catch (Throwable unused5) {
                str = null;
            }
        } catch (Throwable unused6) {
            gZIPInputStream = null;
            str = null;
        }
        try {
            gZIPInputStream.close();
        } catch (Throwable unused7) {
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m11596a(Context context) {
        if (f14612e == -1) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
                String str = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).processName;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.processName.equals(str)) {
                            f14612e = 0;
                            return true;
                        }
                    }
                } else {
                    f14612e = 1;
                }
            } catch (Throwable unused) {
            }
            return false;
        }
        if (f14612e == 0) {
            return true;
        }
        f14612e = -1;
        return false;
    }

    /* renamed from: b */
    public static boolean m11605b(int i10) {
        return Build.VERSION.SDK_INT < i10;
    }

    /* renamed from: b */
    public static String m11602b(byte[] bArr) {
        String strM11590a;
        try {
            strM11590a = m11590a(bArr, 0, bArr.length);
        } catch (Throwable th) {
            if (!f14611d) {
                throw new AssertionError(th.getMessage());
            }
            strM11590a = null;
        }
        if (f14611d || strM11590a != null) {
            return strM11590a;
        }
        throw new AssertionError();
    }

    /* renamed from: d */
    public static byte[] m11617d(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.reset();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            }
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Throwable unused) {
        }
        try {
            byteArrayOutputStream.close();
        } catch (Throwable unused2) {
        }
        inflater.end();
        return bArr;
    }

    /* renamed from: b */
    public static byte[] m11609b(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i10);
        }
        if (i11 >= 0) {
            if (i10 + i11 <= bArr.length) {
                int i12 = ((i11 / 3) * 4) + (i11 % 3 <= 0 ? 0 : 4);
                byte[] bArr2 = new byte[i12];
                int i13 = i11 - 2;
                int i14 = 0;
                int i15 = 0;
                while (i14 < i13) {
                    m11598a(bArr, i14 + i10, 3, bArr2, i15);
                    i14 += 3;
                    i15 += 4;
                }
                if (i14 < i11) {
                    m11598a(bArr, i10 + i14, i11 - i14, bArr2, i15);
                    i15 += 4;
                }
                if (i15 > i12 - 1) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i15];
                System.arraycopy(bArr2, 0, bArr3, 0, i15);
                return bArr3;
            }
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
        }
        throw new IllegalArgumentException("Cannot have length offset: " + i11);
    }

    /* renamed from: c */
    public static int m11611c(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo != null) {
                return applicationInfo.targetSdkVersion;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static void m11594a(Object obj, final InterfaceC7909cn interfaceC7909cn, String str, String str2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            final Object obj2 = declaredField.get(obj);
            Class<?> cls = Class.forName(str2);
            declaredField.set(obj, Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.tendcloud.tenddata.cq.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj3, Method method, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    interfaceC7909cn.beforeMethodInvoke(obj3, method, objArr);
                    Object objInvoke = method.invoke(obj2, objArr);
                    interfaceC7909cn.afterMethodInvoked(obj3, method, objArr, objInvoke);
                    return objInvoke;
                }
            }));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static byte[] m11610b(byte[] bArr, byte[] bArr2) {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr2));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(2, secretKeyGenerateSecret, new IvParameterSpec(f14622o));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m11593a(Class<?> cls, final InterfaceC7909cn interfaceC7909cn, String str, String str2) throws IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        final Object obj = declaredField.get(null);
        Class<?> cls2 = Class.forName(str2);
        declaredField.set(null, Proxy.newProxyInstance(cls.getClass().getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.tendcloud.tenddata.cq.2
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                interfaceC7909cn.beforeMethodInvoke(obj2, method, objArr);
                Object objInvoke = method.invoke(obj, objArr);
                interfaceC7909cn.afterMethodInvoked(obj2, method, objArr, objInvoke);
                return objInvoke;
            }
        }));
    }

    /* renamed from: b */
    public static String m11601b(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int i10 = byteArrayInputStream.read(bArr2);
                            if (i10 != -1) {
                                fileOutputStream.write(bArr2, 0, i10);
                                messageDigest.update(bArr2, 0, i10);
                            } else {
                                try {
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        fileOutputStream.close();
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable unused2) {
                        }
                        return m11589a(messageDigest.digest());
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                                throw th;
                            } catch (Throwable unused4) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                byteArrayInputStream = null;
            }
        } catch (Throwable unused5) {
            return null;
        }
    }

    /* renamed from: a */
    public static final String m11588a(String str) {
        if (str == null) {
            return null;
        }
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    /* renamed from: a */
    public static Map<String, Object> m11591a(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                treeMap.put(next, jSONObject.get(next));
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    /* renamed from: a */
    public static boolean m11595a(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }

    /* renamed from: a */
    public static boolean m11597a(Context context, int i10) {
        return m11611c(context) >= i10;
    }

    /* renamed from: b */
    public static SecureRandom m11603b() {
        return f14623p;
    }

    /* renamed from: a */
    public static String m11589a(byte[] bArr) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArr) {
                int i10 = b10 & C7863av.f14384i;
                if (i10 < 16) {
                    sb2.append('0');
                }
                sb2.append(Integer.toHexString(i10));
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Map<String, Object> m11604b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
            return map;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m11598a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        try {
            byte[] bArr3 = f14621n;
            int i13 = (i11 > 0 ? (bArr[i10] << 24) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0) | (i11 > 2 ? (bArr[i10 + 2] << 24) >>> 24 : 0);
            if (i11 == 1) {
                bArr2[i12] = bArr3[i13 >>> 18];
                bArr2[i12 + 1] = bArr3[(i13 >>> 12) & 63];
                bArr2[i12 + 2] = f14619l;
                bArr2[i12 + 3] = f14619l;
                return bArr2;
            }
            if (i11 == 2) {
                bArr2[i12] = bArr3[i13 >>> 18];
                bArr2[i12 + 1] = bArr3[(i13 >>> 12) & 63];
                bArr2[i12 + 2] = bArr3[(i13 >>> 6) & 63];
                bArr2[i12 + 3] = f14619l;
                return bArr2;
            }
            if (i11 != 3) {
                return bArr2;
            }
            bArr2[i12] = bArr3[i13 >>> 18];
            bArr2[i12 + 1] = bArr3[(i13 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i13 >>> 6) & 63];
            bArr2[i12 + 3] = bArr3[i13 & 63];
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m11600b(Context context, int i10) {
        try {
            return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m11590a(byte[] bArr, int i10, int i11) {
        byte[] bArrM11609b = m11609b(bArr, i10, i11);
        try {
            return new String(bArrM11609b, f14620m);
        } catch (Throwable unused) {
            return new String(bArrM11609b);
        }
    }

    /* renamed from: a */
    public static String m11587a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(str)) {
                    return String.valueOf(bundle.get(str));
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m11599a(byte[] bArr, byte[] bArr2) {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr2));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(1, secretKeyGenerateSecret, new IvParameterSpec(f14622o));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m11585a() {
        BufferedReader bufferedReader;
        String line;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream(), "UTF-8"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            do {
                try {
                    line = bufferedReader.readLine();
                } catch (Throwable unused2) {
                }
                if (line != null) {
                    sb2.append(line);
                    sb2.append(SignParameters.NEW_LINE);
                } else {
                    String string = sb2.toString();
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                    return string;
                }
            } while (sb2.length() <= 104857600);
            throw new RuntimeException("Input stream more than 100 MB size limit");
        } catch (Throwable unused4) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused5) {
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m11592a(File file, byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i10 = byteArrayInputStream.read(bArr2);
                    if (i10 == -1) {
                        return;
                    } else {
                        fileOutputStream.write(bArr2, 0, i10);
                    }
                }
            } finally {
                fileOutputStream.close();
                byteArrayInputStream.close();
            }
        } catch (Throwable unused) {
        }
    }
}
