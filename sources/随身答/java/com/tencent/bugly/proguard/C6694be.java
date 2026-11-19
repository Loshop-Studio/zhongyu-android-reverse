package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.efs.sdk.base.protocol.file.section.AbsSection;
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
/* loaded from: classes4.dex */
public final class C6694be {

    /* renamed from: a */
    private static List<File> f6044a = new ArrayList();

    /* renamed from: a */
    public static String m5290a(String str) {
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split(AbsSection.SEP_ORIGIN_LINE_BREAK);
        if (strArrSplit == null || strArrSplit.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb.append(str2);
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m5297b(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM5158b = C6678ap.m5158b(str, "reg_record.txt");
        if (bufferedReaderM5158b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM5158b.readLine();
            if (line != null && line.startsWith(str2)) {
                int i9 = 18;
                int i10 = 0;
                int length = 0;
                while (true) {
                    String line2 = bufferedReaderM5158b.readLine();
                    if (line2 == null) {
                        sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                        String string = sb.toString();
                        try {
                            return string;
                        } catch (Exception e10) {
                            return string;
                        }
                    }
                    if (i10 % 4 == 0) {
                        if (i10 > 0) {
                            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                        }
                        sb.append("  ");
                    } else {
                        if (line2.length() > 16) {
                            i9 = 28;
                        }
                        sb.append("                ".substring(0, i9 - length));
                    }
                    length = line2.length();
                    sb.append(line2);
                    i10++;
                }
            }
            try {
                bufferedReaderM5158b.close();
            } catch (Exception e11) {
                C6674al.m5103a(e11);
            }
            return null;
        } catch (Throwable th) {
            try {
                C6674al.m5103a(th);
                try {
                    bufferedReaderM5158b.close();
                } catch (Exception e12) {
                    C6674al.m5103a(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM5158b.close();
                } catch (Exception e102) {
                    C6674al.m5103a(e102);
                }
            }
        }
    }

    /* renamed from: c */
    private static String m5298c(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM5158b = C6678ap.m5158b(str, "map_record.txt");
        if (bufferedReaderM5158b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM5158b.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderM5158b.readLine();
                    if (line2 == null) {
                        String string = sb.toString();
                        try {
                            return string;
                        } catch (Exception e10) {
                            return string;
                        }
                    }
                    sb.append("  ");
                    sb.append(line2);
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            }
            try {
                bufferedReaderM5158b.close();
            } catch (Exception e11) {
                C6674al.m5103a(e11);
            }
            return null;
        } catch (Throwable th) {
            try {
                C6674al.m5103a(th);
                try {
                    bufferedReaderM5158b.close();
                } catch (Exception e12) {
                    C6674al.m5103a(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM5158b.close();
                } catch (Exception e102) {
                    C6674al.m5103a(e102);
                }
            }
        }
    }

    /* renamed from: d */
    private static Map<String, Integer> m5300d(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    C6674al.m5108e("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e10) {
            C6674al.m5108e("error format intStateStr %s", str);
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static <KeyT, ValueT> ValueT m5288a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e10) {
            C6674al.m5103a(e10);
            return valuet;
        }
    }

    /* renamed from: a */
    private static String m5289a(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            while (true) {
                try {
                    int i9 = bufferedInputStream.read();
                    if (i9 == -1) {
                        break;
                    }
                    if (i9 == 0) {
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTf-8");
                        byteArrayOutputStream.close();
                        return str;
                    }
                    byteArrayOutputStream.write(i9);
                } catch (Throwable th) {
                    th = th;
                    try {
                        C6674al.m5103a(th);
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
    public static CrashDetailBean m5286a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strM5289a;
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
                                String strM5289a2 = m5289a(bufferedInputStream);
                                if (strM5289a2 != null && strM5289a2.equals("NATIVE_RQD_REPORT")) {
                                    HashMap map = new HashMap();
                                    loop0: while (true) {
                                        str2 = null;
                                        while (true) {
                                            strM5289a = m5289a(bufferedInputStream);
                                            if (strM5289a == null) {
                                                break loop0;
                                            }
                                            if (str2 == null) {
                                                str2 = strM5289a;
                                            }
                                        }
                                        map.put(str2, strM5289a);
                                    }
                                    if (str2 != null) {
                                        C6674al.m5108e("record not pair! drop! %s", str2);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                        }
                                        return null;
                                    }
                                    CrashDetailBean crashDetailBeanM5287a = m5287a(context, map, nativeExceptionHandler);
                                    try {
                                        bufferedInputStream.close();
                                        return crashDetailBeanM5287a;
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        return crashDetailBeanM5287a;
                                    }
                                }
                                C6674al.m5108e("record read fail! %s", strM5289a2);
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                                return null;
                            } catch (IOException e13) {
                                e = e13;
                                e.printStackTrace();
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                    }
                                }
                                return null;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            bufferedInputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException e16) {
                                    e16.printStackTrace();
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
        C6674al.m5108e("get eup record file args error", new Object[0]);
        return null;
    }

    /* renamed from: c */
    public static void m5299c(String str) {
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
                        C6674al.m5106c("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th) {
            C6674al.m5103a(th);
        }
    }

    /* renamed from: b */
    public static String m5296b(String str) {
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
    private static long m5295b(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        C6674al.m5106c("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            if (C6674al.m5103a(e10)) {
                return -1L;
            }
            e10.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: a */
    public static String m5292a(String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String strM5297b = m5297b(str, str2);
        if (strM5297b != null && !strM5297b.isEmpty()) {
            sb.append("Register infos:\n");
            sb.append(strM5297b);
        }
        String strM5298c = m5298c(str, str2);
        if (strM5298c != null && !strM5298c.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            }
            sb.append("System SO infos:\n");
            sb.append(strM5298c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m5294a(boolean z9, String str) {
        if (str != null) {
            f6044a.add(new File(str, "rqd_record.eup"));
            f6044a.add(new File(str, "reg_record.txt"));
            f6044a.add(new File(str, "map_record.txt"));
            f6044a.add(new File(str, "backup_record.txt"));
            if (z9) {
                m5299c(str);
            }
        }
        List<File> list = f6044a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f6044a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                C6674al.m5106c("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* renamed from: a */
    public static String m5291a(String str, int i9, String str2, boolean z9) throws IOException {
        BufferedReader bufferedReader = null;
        if (str != null && i9 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                C6674al.m5102a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f6044a.add(file);
                C6674al.m5106c("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return C6678ap.m5140a(new File(str), i9, z9);
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
                                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                                }
                                if (i9 > 0 && sb.length() > i9) {
                                    if (z9) {
                                        sb.delete(i9, sb.length());
                                        break;
                                    }
                                    sb.delete(0, sb.length() - i9);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    C6674al.m5103a(th);
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
                                        } catch (Exception e10) {
                                            C6674al.m5103a(e10);
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
                } catch (Exception e11) {
                    C6674al.m5103a(e11);
                }
                return sb;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m5293a(Map<String, String> map) {
        String str = map.get("key-value");
        if (str == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (String str2 : str.split(AbsSection.SEP_ORIGIN_LINE_BREAK)) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                map2.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return map2;
    }

    /* renamed from: a */
    private static CrashDetailBean m5287a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) throws NumberFormatException {
        boolean zEqualsIgnoreCase;
        if (C6663aa.m4967a(context) == null) {
            C6674al.m5108e("abnormal com info not created", new Object[0]);
        } else {
            String str = map.get("intStateStr");
            if (str != null && str.trim().length() > 0) {
                Map<String, Integer> mapM5300d = m5300d(map.get("intStateStr"));
                if (mapM5300d == null) {
                    C6674al.m5108e("parse intSateMap fail", Integer.valueOf(map.size()));
                    return null;
                }
                try {
                    mapM5300d.get("sino").getClass();
                    mapM5300d.get("sud").getClass();
                    String str2 = map.get("soVersion");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = (String) m5288a(map, "codeMsg", EnvironmentCompat.MEDIA_UNKNOWN);
                        String str4 = (String) m5288a(map, "signalName", EnvironmentCompat.MEDIA_UNKNOWN);
                        map.get("errnoMsg");
                        String str5 = (String) m5288a(map, "stack", EnvironmentCompat.MEDIA_UNKNOWN);
                        String str6 = map.get("jstack");
                        if (str6 != null) {
                            str5 = str5 + "java:\n" + str6;
                        }
                        Integer num = mapM5300d.get("sico");
                        if (num != null && num.intValue() > 0) {
                            str4 = str4 + "(" + str3 + ")";
                            str3 = "KERNEL";
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = map.get("nativeLog");
                        byte[] bArrM5155a = (str9 == null || str9.isEmpty()) ? null : C6678ap.m5155a(str9, "BuglyNativeLog.txt");
                        String str10 = (String) m5288a(map, "sendingProcess", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num2 = mapM5300d.get("spd");
                        if (num2 != null) {
                            str10 = str10 + "(" + num2 + ")";
                        }
                        String str11 = str10;
                        String str12 = (String) m5288a(map, "threadName", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num3 = mapM5300d.get("et");
                        if (num3 != null) {
                            str12 = str12 + "(" + num3 + ")";
                        }
                        String str13 = str12;
                        String str14 = (String) m5288a(map, "processName", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num4 = mapM5300d.get("ep");
                        if (num4 != null) {
                            str14 = str14 + "(" + num4 + ")";
                        }
                        CrashDetailBean crashDetailBeanPackageCrashDatas = nativeExceptionHandler.packageCrashDatas(str14, str13, (mapM5300d.get("ets").intValue() * 1000) + (mapM5300d.get("etms").intValue() / 1000), str8, (String) m5288a(map, "errorAddr", EnvironmentCompat.MEDIA_UNKNOWN), m5290a(str5), str7, str11, (String) m5288a(map, "tombPath", EnvironmentCompat.MEDIA_UNKNOWN), map.get("sysLogPath"), map.get("jniLogPath"), str2, bArrM5155a, m5293a(map), false, false);
                        if (crashDetailBeanPackageCrashDatas != null) {
                            String str15 = (String) m5288a(map, "userId", crashDetailBeanPackageCrashDatas.f5674m);
                            crashDetailBeanPackageCrashDatas.f5674m = str15;
                            C6674al.m5106c("[Native record info] userId: %s", str15);
                            String str16 = (String) m5288a(map, "sysLog", crashDetailBeanPackageCrashDatas.f5684w);
                            crashDetailBeanPackageCrashDatas.f5684w = str16;
                            String str17 = (String) m5288a(map, "appVersion", str16);
                            crashDetailBeanPackageCrashDatas.f5667f = str17;
                            C6674al.m5106c("[Native record info] appVersion: %s", str17);
                            String str18 = map.get("isAppForeground");
                            if (str18 != null) {
                                C6674al.m5106c("[Native record info] isAppForeground: %s", str18);
                                zEqualsIgnoreCase = str18.equalsIgnoreCase("true");
                            } else {
                                zEqualsIgnoreCase = false;
                            }
                            crashDetailBeanPackageCrashDatas.f5652R = zEqualsIgnoreCase;
                            crashDetailBeanPackageCrashDatas.f5651Q = m5295b(map);
                            crashDetailBeanPackageCrashDatas.f5687z = null;
                            crashDetailBeanPackageCrashDatas.f5672k = true;
                        }
                        return crashDetailBeanPackageCrashDatas;
                    }
                    C6674al.m5108e("error format at version", new Object[0]);
                    return null;
                } catch (Throwable th) {
                    C6674al.m5108e("error format", new Object[0]);
                    th.printStackTrace();
                    return null;
                }
            }
            C6674al.m5108e("no intStateStr", new Object[0]);
        }
        return null;
    }
}
