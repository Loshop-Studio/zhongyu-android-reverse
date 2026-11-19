package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.work.WorkRequest;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.zykj.student.dialogue.bean.resp.CollectSessionRespKt;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.UByte;

/* renamed from: com.tencent.bugly.proguard.ap */
/* loaded from: classes4.dex */
public final class C6678ap {

    /* renamed from: a */
    private static Map<String, String> f5900a;

    /* renamed from: a */
    public static String m5143a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.getBuffer().toString();
        } catch (Throwable th2) {
            if (C6674al.m5103a(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static byte[] m5166b(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        C6674al.m5106c("[Util] Unzip %d bytes data with type %s", Integer.valueOf(bArr.length), "Gzip");
        try {
            return C6697bh.m5311a().mo5313b(bArr);
        } catch (Throwable th) {
            if (th.getMessage() != null && th.getMessage().contains("Not in GZIP format")) {
                C6674al.m5107d(th.getMessage(), new Object[0]);
                return null;
            }
            if (C6674al.m5103a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m5167c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "NULL";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArrDigest) {
                String hexString = Integer.toHexString(b10 & UByte.MAX_VALUE);
                if (hexString.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString().toUpperCase();
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static long m5171d(byte[] bArr) {
        if (bArr == null) {
            return -1L;
        }
        try {
            return Long.parseLong(new String(bArr, "utf-8"));
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: d */
    public static boolean m5173d(String str) {
        if (m5165b(str)) {
            return false;
        }
        if (str.length() > 255) {
            C6674al.m5102a("URL(%s)'s length is larger than 255.", str);
            return false;
        }
        if (str.toLowerCase().startsWith("http")) {
            return true;
        }
        C6674al.m5102a("URL(%s) is not start with \"http\".", str);
        return false;
    }

    /* renamed from: a */
    public static String m5137a() {
        return m5139a(System.currentTimeMillis());
    }

    /* renamed from: b */
    public static long m5157b() {
        try {
            return (((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / CalendarModelKt.MillisecondsIn24Hours) * CalendarModelKt.MillisecondsIn24Hours) - TimeZone.getDefault().getRawOffset();
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: d */
    public static String m5172d(String str, String str2) {
        if (C6663aa.m4969b() != null && C6663aa.m4969b().f5734O != null) {
            return C6663aa.m4969b().f5734O.getString(str, str2);
        }
        return "";
    }

    /* renamed from: a */
    public static String m5139a(long j9) {
        try {
            return new SimpleDateFormat(CollectSessionRespKt.SDF_WITH_SECONDS, Locale.US).format(new Date(j9));
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    /* renamed from: a */
    public static String m5144a(Date date) {
        try {
            return new SimpleDateFormat(CollectSessionRespKt.SDF_WITH_SECONDS, Locale.US).format(date);
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    /* renamed from: b */
    private static boolean m5164b(File file, File file2) {
        if (file != null && file2 != null && !file.equals(file2)) {
            if (file.exists() && file.canRead()) {
                try {
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                } catch (Throwable th) {
                    if (!C6674al.m5103a(th)) {
                        th.printStackTrace();
                    }
                }
                return file2.exists() && file2.canWrite();
            }
            C6674al.m5107d("rqdp{  !sFile.exists() || !sFile.canRead(),pls check ,return!}", new Object[0]);
            return false;
        }
        C6674al.m5107d("rqdp{  err ZF 1R!}", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public static byte[] m5155a(String str, String str2) throws IOException {
        ZipOutputStream zipOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        if (str == null || str.length() == 0) {
            return null;
        }
        C6674al.m5106c("rqdp{  ZF start}", new Object[0]);
        try {
            byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            byteArrayOutputStream = new ByteArrayOutputStream();
            zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
            zipOutputStream = null;
        }
        try {
            zipOutputStream.setMethod(8);
            zipOutputStream.putNextEntry(new ZipEntry(str2));
            byte[] bArr = new byte[1024];
            while (true) {
                int i9 = byteArrayInputStream.read(bArr);
                if (i9 <= 0) {
                    break;
                }
                zipOutputStream.write(bArr, 0, i9);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.flush();
            zipOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                zipOutputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            C6674al.m5106c("rqdp{  ZF end}", new Object[0]);
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            try {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                C6674al.m5106c("rqdp{  ZF end}", new Object[0]);
                return null;
            } catch (Throwable th3) {
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                C6674al.m5106c("rqdp{  ZF end}", new Object[0]);
                throw th3;
            }
        }
    }

    /* renamed from: c */
    public static void m5168c(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.isFile() && file.exists() && file.canWrite()) {
            file.delete();
        }
    }

    /* renamed from: c */
    public static byte[] m5170c(long j9) {
        try {
            return String.valueOf(j9).getBytes("utf-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static void m5169c(String str, String str2) {
        if (C6663aa.m4969b() == null || C6663aa.m4969b().f5734O == null) {
            return;
        }
        C6663aa.m4969b().f5734O.edit().putString(str, str2).apply();
    }

    /* renamed from: b */
    public static void m5161b(long j9) throws InterruptedException {
        try {
            Thread.sleep(j9);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    public static boolean m5165b(String str) {
        return str == null || str.trim().length() <= 0;
    }

    /* renamed from: b */
    public static String m5159b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static void m5162b(Parcel parcel, Map<String, String> map) {
        if (map != null && map.size() > 0) {
            int size = map.size();
            ArrayList<String> arrayList = new ArrayList<>(size);
            ArrayList<String> arrayList2 = new ArrayList<>(size);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("keys", arrayList);
            bundle.putStringArrayList("values", arrayList2);
            parcel.writeBundle(bundle);
            return;
        }
        parcel.writeBundle(null);
    }

    /* renamed from: a */
    public static byte[] m5156a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        C6674al.m5106c("[Util] Zip %d bytes data with type %s", Integer.valueOf(bArr.length), "Gzip");
        try {
            return C6697bh.m5311a().mo5312a(bArr);
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static Map<String, String> m5160b(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("keys");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("values");
        if (stringArrayList != null && stringArrayList2 != null && stringArrayList.size() == stringArrayList2.size()) {
            HashMap map = new HashMap(stringArrayList.size());
            for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
                map.put(stringArrayList.get(i9), stringArrayList2.get(i9));
            }
            return map;
        }
        C6674al.m5108e("map parcel error!", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static boolean m5152a(File file, File file2) throws IOException {
        ZipOutputStream zipOutputStream;
        C6674al.m5106c("rqdp{  ZF start}", new Object[0]);
        if (!m5164b(file, file2)) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                try {
                    zipOutputStream.setMethod(8);
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    byte[] bArr = new byte[Math.max(5000, 1000)];
                    while (true) {
                        int i9 = fileInputStream2.read(bArr);
                        if (i9 <= 0) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, i9);
                    }
                    zipOutputStream.flush();
                    zipOutputStream.closeEntry();
                    try {
                        fileInputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    try {
                        zipOutputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    C6674al.m5106c("rqdp{  ZF end}", new Object[0]);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    try {
                        if (!C6674al.m5103a(th)) {
                            th.printStackTrace();
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        C6674al.m5106c("rqdp{  ZF end}", new Object[0]);
                        return false;
                    } catch (Throwable th2) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        C6674al.m5106c("rqdp{  ZF end}", new Object[0]);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                zipOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            zipOutputStream = null;
        }
    }

    /* renamed from: b */
    public static boolean m5163b(Context context, String str) {
        C6674al.m5106c("[Util] Try to unlock file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (!file.exists()) {
                return true;
            }
            if (!file.delete()) {
                return false;
            }
            C6674al.m5106c("[Util] Successfully unlocked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return true;
        } catch (Throwable th) {
            C6674al.m5103a(th);
            return false;
        }
    }

    /* renamed from: b */
    public static BufferedReader m5158b(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            File file = new File(str, str2);
            if (file.exists() && file.canRead()) {
                return m5134a(file);
            }
            return null;
        } catch (NullPointerException e10) {
            C6674al.m5103a(e10);
            return null;
        }
    }

    /* renamed from: a */
    public static String m5141a(String str) {
        if (str.trim().equals("")) {
            return "";
        }
        try {
            if (f5900a == null) {
                f5900a = new HashMap();
            }
            if (f5900a.containsKey(str)) {
                return f5900a.get(str);
            }
            String systemProperty = NativeCrashHandler.getInstance().getSystemProperty(str);
            if (!TextUtils.isEmpty(systemProperty) && !systemProperty.equals("fail")) {
                f5900a.put(str, systemProperty);
            }
            return systemProperty;
        } catch (Throwable th) {
            C6674al.m5105b(th);
            return "fail";
        }
    }

    /* renamed from: a */
    public static Context m5132a(Context context) {
        Context applicationContext;
        return (context == null || (applicationContext = context.getApplicationContext()) == null) ? context : applicationContext;
    }

    /* renamed from: a */
    public static void m5150a(Class<?> cls, String str, Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(null, obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static Object m5135a(String str, String str2, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m5149a(Parcel parcel, Map<String, PlugInBean> map) {
        if (map != null && map.size() > 0) {
            int size = map.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (Map.Entry<String, PlugInBean> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            Bundle bundle = new Bundle();
            bundle.putInt("pluginNum", arrayList.size());
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                bundle.putString("pluginKey".concat(String.valueOf(i9)), (String) arrayList.get(i9));
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                bundle.putString("pluginVal" + i10 + "plugInId", ((PlugInBean) arrayList2.get(i10)).f5609a);
                bundle.putString("pluginVal" + i10 + "plugInUUID", ((PlugInBean) arrayList2.get(i10)).f5611c);
                bundle.putString("pluginVal" + i10 + "plugInVersion", ((PlugInBean) arrayList2.get(i10)).f5610b);
            }
            parcel.writeBundle(bundle);
            return;
        }
        parcel.writeBundle(null);
    }

    /* renamed from: a */
    public static Map<String, PlugInBean> m5147a(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iIntValue = ((Integer) bundle.get("pluginNum")).intValue();
        for (int i9 = 0; i9 < iIntValue; i9++) {
            arrayList.add(bundle.getString("pluginKey".concat(String.valueOf(i9))));
        }
        for (int i10 = 0; i10 < iIntValue; i10++) {
            arrayList2.add(new PlugInBean(bundle.getString("pluginVal" + i10 + "plugInId"), bundle.getString("pluginVal" + i10 + "plugInVersion"), bundle.getString("pluginVal" + i10 + "plugInUUID")));
        }
        if (arrayList.size() == arrayList2.size()) {
            HashMap map = new HashMap(arrayList.size());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                map.put(arrayList.get(i11), PlugInBean.class.cast(arrayList2.get(i11)));
            }
            return map;
        }
        C6674al.m5108e("map plugin parcel error!", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static byte[] m5154a(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* renamed from: a */
    public static String m5138a(int i9, String str) throws IOException {
        String[] strArr;
        if (str == null) {
            strArr = new String[]{"logcat", "-d", "-v", "threadtime"};
        } else {
            strArr = new String[]{"logcat", "-d", "-v", "threadtime", "-s", str};
        }
        StringBuilder sb = new StringBuilder();
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(strArr);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                if (i9 > 0 && sb.length() > i9) {
                    sb.delete(0, sb.length() - i9);
                }
            }
            String string = sb.toString();
            try {
                processExec.getOutputStream().close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                processExec.getInputStream().close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            try {
                processExec.getErrorStream().close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            return string;
        } catch (Throwable th) {
            try {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
                sb.append("\n[error:");
                sb.append(th.toString());
                sb.append("]");
                String string2 = sb.toString();
                if (processExec != null) {
                    try {
                        processExec.getOutputStream().close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    try {
                        processExec.getInputStream().close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                    try {
                        processExec.getErrorStream().close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                return string2;
            } catch (Throwable th2) {
                if (processExec != null) {
                    try {
                        processExec.getOutputStream().close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                    try {
                        processExec.getInputStream().close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                    try {
                        processExec.getErrorStream().close();
                    } catch (IOException e18) {
                        e18.printStackTrace();
                    }
                }
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public static Map<String, String> m5148a(boolean z9, int i9) {
        if (!z9) {
            C6674al.m5106c("get all thread stack not enable", new Object[0]);
            return new HashMap();
        }
        Map<String, String> mapM5146a = m5146a(i9);
        return mapM5146a == null ? new HashMap() : mapM5146a;
    }

    /* renamed from: a */
    private static Map<String, String> m5146a(int i9) {
        HashMap map = new HashMap(12);
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null) {
            return null;
        }
        Thread thread = Looper.getMainLooper().getThread();
        if (!allStackTraces.containsKey(thread)) {
            allStackTraces.put(thread, thread.getStackTrace());
        }
        Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            int i10 = 0;
            sb.setLength(0);
            if (entry.getValue() != null && entry.getValue().length != 0) {
                StackTraceElement[] value = entry.getValue();
                int length = value.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = value[i10];
                    if (i9 > 0 && sb.length() >= i9) {
                        sb.append("\n[Stack over limit size :" + i9 + " , has been cut!]");
                        break;
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                    i10++;
                }
                map.put(entry.getKey().getName() + "(" + entry.getKey().getId() + ")", sb.toString());
            }
        }
        return map;
    }

    /* renamed from: a */
    public static String m5142a(Thread thread) {
        if (thread == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m5151a(Context context, String str) {
        C6674al.m5106c("[Util] Try to lock file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (file.exists()) {
                if (System.currentTimeMillis() - file.lastModified() < WorkRequest.MIN_BACKOFF_MILLIS) {
                    return false;
                }
                C6674al.m5106c("[Util] Lock file (%s) is expired, unlock it.", str);
                m5163b(context, str);
            }
            if (file.createNewFile()) {
                C6674al.m5106c("[Util] Successfully locked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                return true;
            }
            C6674al.m5106c("[Util] Failed to locked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return false;
        } catch (Throwable th) {
            C6674al.m5103a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static String m5140a(File file, int i9, boolean z9) throws IOException {
        BufferedReader bufferedReader;
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                    if (i9 > 0 && sb.length() > i9) {
                        if (z9) {
                            sb.delete(i9, sb.length());
                            break;
                        }
                        sb.delete(0, sb.length() - i9);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C6674al.m5103a(th);
                        return null;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e10) {
                                C6674al.m5103a(e10);
                            }
                        }
                    }
                }
            }
            String string = sb.toString();
            try {
                bufferedReader.close();
                return string;
            } catch (Exception e11) {
                C6674al.m5103a(e11);
                return string;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    /* renamed from: a */
    public static BufferedReader m5134a(File file) {
        if (file.exists() && file.canRead()) {
            try {
                return new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            } catch (Throwable th) {
                C6674al.m5103a(th);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Thread m5145a(Runnable runnable, String str) {
        try {
            Thread thread = new Thread(runnable);
            thread.setName(str);
            thread.start();
            return thread;
        } catch (Throwable th) {
            C6674al.m5108e("[Util] Failed to start a thread to execute task with message: %s", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m5153a(Runnable runnable) {
        C6673ak c6673akM5093a = C6673ak.m5093a();
        if (c6673akM5093a != null) {
            return c6673akM5093a.m5095a(runnable);
        }
        String[] strArrSplit = runnable.getClass().getName().split("\\.");
        return m5145a(runnable, strArrSplit[strArrSplit.length - 1]) != null;
    }

    /* renamed from: a */
    public static SharedPreferences m5133a(String str, Context context) {
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m5136a(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        try {
            return creator.createFromParcel(parcelObtain);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                parcelObtain.recycle();
                return null;
            } finally {
                parcelObtain.recycle();
            }
        }
    }
}
