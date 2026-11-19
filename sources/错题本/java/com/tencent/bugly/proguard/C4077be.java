package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.bugly.proguard.be */
/* loaded from: classes3.dex */
public final class C4077be {

    /* renamed from: a */
    private static List<File> f3669a = new ArrayList();

    /* renamed from: a */
    public static String m3208a(String str) {
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split(SignParameters.NEW_LINE);
        if (strArrSplit == null || strArrSplit.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb.append(str2);
                sb.append(SignParameters.NEW_LINE);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m3215b(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM3077b = C4059ap.m3077b(str, "reg_record.txt");
        if (bufferedReaderM3077b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM3077b.readLine();
            if (line != null && line.startsWith(str2)) {
                int i = 18;
                int i8 = 0;
                int length = 0;
                while (true) {
                    String line2 = bufferedReaderM3077b.readLine();
                    if (line2 == null) {
                        sb.append(SignParameters.NEW_LINE);
                        String string = sb.toString();
                        try {
                            return string;
                        } catch (Exception e) {
                            return string;
                        }
                    }
                    if (i8 % 4 == 0) {
                        if (i8 > 0) {
                            sb.append(SignParameters.NEW_LINE);
                        }
                        sb.append("  ");
                    } else {
                        if (line2.length() > 16) {
                            i = 28;
                        }
                        sb.append("                ".substring(0, i - length));
                    }
                    length = line2.length();
                    sb.append(line2);
                    i8++;
                }
            }
            try {
                bufferedReaderM3077b.close();
            } catch (Exception e4) {
                C4055al.m3022a(e4);
            }
            return null;
        } catch (Throwable th) {
            try {
                C4055al.m3022a(th);
                try {
                    bufferedReaderM3077b.close();
                } catch (Exception e8) {
                    C4055al.m3022a(e8);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM3077b.close();
                } catch (Exception e9) {
                    C4055al.m3022a(e9);
                }
            }
        }
    }

    /* renamed from: c */
    private static String m3216c(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM3077b = C4059ap.m3077b(str, "map_record.txt");
        if (bufferedReaderM3077b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM3077b.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderM3077b.readLine();
                    if (line2 == null) {
                        String string = sb.toString();
                        try {
                            return string;
                        } catch (Exception e) {
                            return string;
                        }
                    }
                    sb.append("  ");
                    sb.append(line2);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            try {
                bufferedReaderM3077b.close();
            } catch (Exception e4) {
                C4055al.m3022a(e4);
            }
            return null;
        } catch (Throwable th) {
            try {
                C4055al.m3022a(th);
                try {
                    bufferedReaderM3077b.close();
                } catch (Exception e8) {
                    C4055al.m3022a(e8);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM3077b.close();
                } catch (Exception e9) {
                    C4055al.m3022a(e9);
                }
            }
        }
    }

    /* renamed from: d */
    private static Map<String, Integer> m3218d(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    C4055al.m3027e("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e) {
            C4055al.m3027e("error format intStateStr %s", str);
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static <KeyT, ValueT> ValueT m3206a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e) {
            C4055al.m3022a(e);
            return valuet;
        }
    }

    /* renamed from: a */
    private static String m3207a(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            while (true) {
                try {
                    int i = bufferedInputStream.read();
                    if (i == -1) {
                        break;
                    }
                    if (i == 0) {
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTf-8");
                        byteArrayOutputStream.close();
                        return str;
                    }
                    byteArrayOutputStream.write(i);
                } catch (Throwable th) {
                    th = th;
                    try {
                        C4055al.m3022a(th);
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* renamed from: a */
    public static CrashDetailBean m3204a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) throws Throwable {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strM3207a;
        BufferedInputStream bufferedInputStream2 = null;
        if (context != null && str != null && nativeExceptionHandler != null) {
            File file = new File(str, "rqd_record.eup");
            if (file.exists()) {
                ?? CanRead = file.canRead();
                try {
                    if (CanRead != 0) {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                            try {
                                String strM3207a2 = m3207a(bufferedInputStream);
                                if (strM3207a2 != null && strM3207a2.equals("NATIVE_RQD_REPORT")) {
                                    HashMap map = new HashMap();
                                    loop0: while (true) {
                                        str2 = null;
                                        while (true) {
                                            strM3207a = m3207a(bufferedInputStream);
                                            if (strM3207a == null) {
                                                break loop0;
                                            }
                                            if (str2 == null) {
                                                str2 = strM3207a;
                                            }
                                        }
                                        map.put(str2, strM3207a);
                                    }
                                    if (str2 != null) {
                                        C4055al.m3027e("record not pair! drop! %s", str2);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        return null;
                                    }
                                    CrashDetailBean crashDetailBeanM3205a = m3205a(context, map, nativeExceptionHandler);
                                    try {
                                        bufferedInputStream.close();
                                        return crashDetailBeanM3205a;
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                        return crashDetailBeanM3205a;
                                    }
                                }
                                C4055al.m3027e("record read fail! %s", strM3207a2);
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e8) {
                                    e8.printStackTrace();
                                }
                                return null;
                            } catch (IOException e9) {
                                e = e9;
                                e.printStackTrace();
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                }
                                return null;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            bufferedInputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = CanRead;
                }
            }
            return null;
        }
        C4055al.m3027e("get eup record file args error", new Object[0]);
        return null;
    }

    /* renamed from: c */
    public static void m3217c(String str) {
        File[] fileArrListFiles;
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.canRead() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.canRead() && file2.canWrite() && file2.length() == 0) {
                        file2.delete();
                        C4055al.m3025c("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th) {
            C4055al.m3022a(th);
        }
    }

    /* renamed from: b */
    public static String m3214b(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str, "backup_record.txt");
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: b */
    private static long m3213b(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        C4055al.m3025c("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            if (C4055al.m3022a(e)) {
                return -1L;
            }
            e.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: a */
    public static String m3210a(String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String strM3215b = m3215b(str, str2);
        if (strM3215b != null && !strM3215b.isEmpty()) {
            sb.append("Register infos:\n");
            sb.append(strM3215b);
        }
        String strM3216c = m3216c(str, str2);
        if (strM3216c != null && !strM3216c.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(SignParameters.NEW_LINE);
            }
            sb.append("System SO infos:\n");
            sb.append(strM3216c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m3212a(boolean z8, String str) {
        if (str != null) {
            f3669a.add(new File(str, "rqd_record.eup"));
            f3669a.add(new File(str, "reg_record.txt"));
            f3669a.add(new File(str, "map_record.txt"));
            f3669a.add(new File(str, "backup_record.txt"));
            if (z8) {
                m3217c(str);
            }
        }
        List<File> list = f3669a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f3669a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                C4055al.m3025c("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* renamed from: a */
    public static String m3209a(String str, int i, String str2, boolean z8) throws IOException {
        BufferedReader bufferedReader = null;
        if (str != null && i > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                C4055al.m3021a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f3669a.add(file);
                C4055al.m3025c("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return C4059ap.m3059a(new File(str), i, z8);
                }
                String sb = new StringBuilder();
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                if (Pattern.compile(str2 + "[ ]*:").matcher(line).find()) {
                                    sb.append(line);
                                    sb.append(SignParameters.NEW_LINE);
                                }
                                if (i > 0 && sb.length() > i) {
                                    if (z8) {
                                        sb.delete(i, sb.length());
                                        break;
                                    }
                                    sb.delete(0, sb.length() - i);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    C4055al.m3022a(th);
                                    sb.append("\n[error:" + th.toString() + "]");
                                    sb = sb.toString();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        sb = sb;
                                    }
                                    return sb;
                                } catch (Throwable th2) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e) {
                                            C4055al.m3022a(e);
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                        String string = sb.toString();
                        bufferedReader2.close();
                        sb = string;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e4) {
                    C4055al.m3022a(e4);
                }
                return sb;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m3211a(Map<String, String> map) {
        String str = map.get("key-value");
        if (str == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (String str2 : str.split(SignParameters.NEW_LINE)) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                map2.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return map2;
    }

    /* renamed from: a */
    private static CrashDetailBean m3205a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) throws NumberFormatException {
        boolean zEqualsIgnoreCase;
        if (C4044aa.m2888a(context) == null) {
            C4055al.m3027e("abnormal com info not created", new Object[0]);
        } else {
            String str = map.get("intStateStr");
            if (str != null && str.trim().length() > 0) {
                Map<String, Integer> mapM3218d = m3218d(map.get("intStateStr"));
                if (mapM3218d == null) {
                    C4055al.m3027e("parse intSateMap fail", Integer.valueOf(map.size()));
                    return null;
                }
                try {
                    mapM3218d.get("sino").getClass();
                    mapM3218d.get("sud").getClass();
                    String str2 = map.get("soVersion");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = (String) m3206a(map, "codeMsg", EnvironmentCompat.MEDIA_UNKNOWN);
                        String str4 = (String) m3206a(map, "signalName", EnvironmentCompat.MEDIA_UNKNOWN);
                        map.get("errnoMsg");
                        String str5 = (String) m3206a(map, "stack", EnvironmentCompat.MEDIA_UNKNOWN);
                        String str6 = map.get("jstack");
                        if (str6 != null) {
                            str5 = str5 + "java:\n" + str6;
                        }
                        Integer num = mapM3218d.get("sico");
                        if (num != null && num.intValue() > 0) {
                            str4 = str4 + "(" + str3 + ")";
                            str3 = "KERNEL";
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = map.get("nativeLog");
                        byte[] bArrM3074a = (str9 == null || str9.isEmpty()) ? null : C4059ap.m3074a(str9, "BuglyNativeLog.txt");
                        String str10 = (String) m3206a(map, "sendingProcess", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num2 = mapM3218d.get("spd");
                        if (num2 != null) {
                            str10 = str10 + "(" + num2 + ")";
                        }
                        String str11 = str10;
                        String str12 = (String) m3206a(map, "threadName", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num3 = mapM3218d.get("et");
                        if (num3 != null) {
                            str12 = str12 + "(" + num3 + ")";
                        }
                        String str13 = str12;
                        String str14 = (String) m3206a(map, "processName", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num4 = mapM3218d.get("ep");
                        if (num4 != null) {
                            str14 = str14 + "(" + num4 + ")";
                        }
                        CrashDetailBean crashDetailBeanPackageCrashDatas = nativeExceptionHandler.packageCrashDatas(str14, str13, (mapM3218d.get("ets").intValue() * 1000) + (mapM3218d.get("etms").intValue() / 1000), str8, (String) m3206a(map, "errorAddr", EnvironmentCompat.MEDIA_UNKNOWN), m3208a(str5), str7, str11, (String) m3206a(map, "tombPath", EnvironmentCompat.MEDIA_UNKNOWN), map.get("sysLogPath"), map.get("jniLogPath"), str2, bArrM3074a, m3211a(map), false, false);
                        if (crashDetailBeanPackageCrashDatas != null) {
                            String str15 = (String) m3206a(map, "userId", crashDetailBeanPackageCrashDatas.f3331m);
                            crashDetailBeanPackageCrashDatas.f3331m = str15;
                            C4055al.m3025c("[Native record info] userId: %s", str15);
                            String str16 = (String) m3206a(map, "sysLog", crashDetailBeanPackageCrashDatas.f3341w);
                            crashDetailBeanPackageCrashDatas.f3341w = str16;
                            String str17 = (String) m3206a(map, "appVersion", str16);
                            crashDetailBeanPackageCrashDatas.f3324f = str17;
                            C4055al.m3025c("[Native record info] appVersion: %s", str17);
                            String str18 = map.get("isAppForeground");
                            if (str18 != null) {
                                C4055al.m3025c("[Native record info] isAppForeground: %s", str18);
                                zEqualsIgnoreCase = str18.equalsIgnoreCase("true");
                            } else {
                                zEqualsIgnoreCase = false;
                            }
                            crashDetailBeanPackageCrashDatas.f3309R = zEqualsIgnoreCase;
                            crashDetailBeanPackageCrashDatas.f3308Q = m3213b(map);
                            crashDetailBeanPackageCrashDatas.f3344z = null;
                            crashDetailBeanPackageCrashDatas.f3329k = true;
                        }
                        return crashDetailBeanPackageCrashDatas;
                    }
                    C4055al.m3027e("error format at version", new Object[0]);
                    return null;
                } catch (Throwable th) {
                    C4055al.m3027e("error format", new Object[0]);
                    th.printStackTrace();
                    return null;
                }
            }
            C4055al.m3027e("no intStateStr", new Object[0]);
        }
        return null;
    }
}
