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
/* loaded from: classes4.dex */
public final class C6434be {

    /* renamed from: a */
    private static List<File> f5467a = new ArrayList();

    /* renamed from: a */
    public static String m5111a(String str) {
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
    private static String m5118b(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM4979b = C6418ap.m4979b(str, "reg_record.txt");
        if (bufferedReaderM4979b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM4979b.readLine();
            if (line != null && line.startsWith(str2)) {
                int i10 = 18;
                int i11 = 0;
                int length = 0;
                while (true) {
                    String line2 = bufferedReaderM4979b.readLine();
                    if (line2 == null) {
                        sb.append(SignParameters.NEW_LINE);
                        String string = sb.toString();
                        try {
                            return string;
                        } catch (Exception e10) {
                            return string;
                        }
                    }
                    if (i11 % 4 == 0) {
                        if (i11 > 0) {
                            sb.append(SignParameters.NEW_LINE);
                        }
                        sb.append("  ");
                    } else {
                        if (line2.length() > 16) {
                            i10 = 28;
                        }
                        sb.append("                ".substring(0, i10 - length));
                    }
                    length = line2.length();
                    sb.append(line2);
                    i11++;
                }
            }
            try {
                bufferedReaderM4979b.close();
            } catch (Exception e11) {
                C6414al.m4924a(e11);
            }
            return null;
        } catch (Throwable th) {
            try {
                C6414al.m4924a(th);
                try {
                    bufferedReaderM4979b.close();
                } catch (Exception e12) {
                    C6414al.m4924a(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM4979b.close();
                } catch (Exception e102) {
                    C6414al.m4924a(e102);
                }
            }
        }
    }

    /* renamed from: c */
    private static String m5119c(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM4979b = C6418ap.m4979b(str, "map_record.txt");
        if (bufferedReaderM4979b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM4979b.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderM4979b.readLine();
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
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            try {
                bufferedReaderM4979b.close();
            } catch (Exception e11) {
                C6414al.m4924a(e11);
            }
            return null;
        } catch (Throwable th) {
            try {
                C6414al.m4924a(th);
                try {
                    bufferedReaderM4979b.close();
                } catch (Exception e12) {
                    C6414al.m4924a(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM4979b.close();
                } catch (Exception e102) {
                    C6414al.m4924a(e102);
                }
            }
        }
    }

    /* renamed from: d */
    private static Map<String, Integer> m5121d(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    C6414al.m4929e("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e10) {
            C6414al.m4929e("error format intStateStr %s", str);
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static <KeyT, ValueT> ValueT m5109a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e10) {
            C6414al.m4924a(e10);
            return valuet;
        }
    }

    /* renamed from: a */
    private static String m5110a(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            while (true) {
                try {
                    int i10 = bufferedInputStream.read();
                    if (i10 == -1) {
                        break;
                    }
                    if (i10 == 0) {
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTf-8");
                        byteArrayOutputStream.close();
                        return str;
                    }
                    byteArrayOutputStream.write(i10);
                } catch (Throwable th) {
                    th = th;
                    try {
                        C6414al.m4924a(th);
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
    public static CrashDetailBean m5107a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strM5110a;
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
                                String strM5110a2 = m5110a(bufferedInputStream);
                                if (strM5110a2 != null && strM5110a2.equals("NATIVE_RQD_REPORT")) {
                                    HashMap map = new HashMap();
                                    loop0: while (true) {
                                        str2 = null;
                                        while (true) {
                                            strM5110a = m5110a(bufferedInputStream);
                                            if (strM5110a == null) {
                                                break loop0;
                                            }
                                            if (str2 == null) {
                                                str2 = strM5110a;
                                            }
                                        }
                                        map.put(str2, strM5110a);
                                    }
                                    if (str2 != null) {
                                        C6414al.m4929e("record not pair! drop! %s", str2);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                        }
                                        return null;
                                    }
                                    CrashDetailBean crashDetailBeanM5108a = m5108a(context, map, nativeExceptionHandler);
                                    try {
                                        bufferedInputStream.close();
                                        return crashDetailBeanM5108a;
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        return crashDetailBeanM5108a;
                                    }
                                }
                                C6414al.m4929e("record read fail! %s", strM5110a2);
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
        C6414al.m4929e("get eup record file args error", new Object[0]);
        return null;
    }

    /* renamed from: c */
    public static void m5120c(String str) {
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
                        C6414al.m4927c("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th) {
            C6414al.m4924a(th);
        }
    }

    /* renamed from: b */
    public static String m5117b(String str) {
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
    private static long m5116b(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        C6414al.m4927c("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            if (C6414al.m4924a(e10)) {
                return -1L;
            }
            e10.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: a */
    public static String m5113a(String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String strM5118b = m5118b(str, str2);
        if (strM5118b != null && !strM5118b.isEmpty()) {
            sb.append("Register infos:\n");
            sb.append(strM5118b);
        }
        String strM5119c = m5119c(str, str2);
        if (strM5119c != null && !strM5119c.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(SignParameters.NEW_LINE);
            }
            sb.append("System SO infos:\n");
            sb.append(strM5119c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m5115a(boolean z9, String str) {
        if (str != null) {
            f5467a.add(new File(str, "rqd_record.eup"));
            f5467a.add(new File(str, "reg_record.txt"));
            f5467a.add(new File(str, "map_record.txt"));
            f5467a.add(new File(str, "backup_record.txt"));
            if (z9) {
                m5120c(str);
            }
        }
        List<File> list = f5467a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f5467a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                C6414al.m4927c("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* renamed from: a */
    public static String m5112a(String str, int i10, String str2, boolean z9) throws IOException {
        BufferedReader bufferedReader = null;
        if (str != null && i10 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                C6414al.m4923a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f5467a.add(file);
                C6414al.m4927c("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return C6418ap.m4961a(new File(str), i10, z9);
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
                                if (i10 > 0 && sb.length() > i10) {
                                    if (z9) {
                                        sb.delete(i10, sb.length());
                                        break;
                                    }
                                    sb.delete(0, sb.length() - i10);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    C6414al.m4924a(th);
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
                                            C6414al.m4924a(e10);
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
                    C6414al.m4924a(e11);
                }
                return sb;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m5114a(Map<String, String> map) {
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
    private static CrashDetailBean m5108a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) throws NumberFormatException {
        boolean zEqualsIgnoreCase;
        if (C6403aa.m4788a(context) == null) {
            C6414al.m4929e("abnormal com info not created", new Object[0]);
        } else {
            String str = map.get("intStateStr");
            if (str != null && str.trim().length() > 0) {
                Map<String, Integer> mapM5121d = m5121d(map.get("intStateStr"));
                if (mapM5121d == null) {
                    C6414al.m4929e("parse intSateMap fail", Integer.valueOf(map.size()));
                    return null;
                }
                try {
                    mapM5121d.get("sino").getClass();
                    mapM5121d.get("sud").getClass();
                    String str2 = map.get("soVersion");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = (String) m5109a(map, "codeMsg", EnvironmentCompat.MEDIA_UNKNOWN);
                        String str4 = (String) m5109a(map, "signalName", EnvironmentCompat.MEDIA_UNKNOWN);
                        map.get("errnoMsg");
                        String str5 = (String) m5109a(map, "stack", EnvironmentCompat.MEDIA_UNKNOWN);
                        String str6 = map.get("jstack");
                        if (str6 != null) {
                            str5 = str5 + "java:\n" + str6;
                        }
                        Integer num = mapM5121d.get("sico");
                        if (num != null && num.intValue() > 0) {
                            str4 = str4 + "(" + str3 + ")";
                            str3 = "KERNEL";
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = map.get("nativeLog");
                        byte[] bArrM4976a = (str9 == null || str9.isEmpty()) ? null : C6418ap.m4976a(str9, "BuglyNativeLog.txt");
                        String str10 = (String) m5109a(map, "sendingProcess", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num2 = mapM5121d.get("spd");
                        if (num2 != null) {
                            str10 = str10 + "(" + num2 + ")";
                        }
                        String str11 = str10;
                        String str12 = (String) m5109a(map, "threadName", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num3 = mapM5121d.get("et");
                        if (num3 != null) {
                            str12 = str12 + "(" + num3 + ")";
                        }
                        String str13 = str12;
                        String str14 = (String) m5109a(map, "processName", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num4 = mapM5121d.get("ep");
                        if (num4 != null) {
                            str14 = str14 + "(" + num4 + ")";
                        }
                        CrashDetailBean crashDetailBeanPackageCrashDatas = nativeExceptionHandler.packageCrashDatas(str14, str13, (mapM5121d.get("ets").intValue() * 1000) + (mapM5121d.get("etms").intValue() / 1000), str8, (String) m5109a(map, "errorAddr", EnvironmentCompat.MEDIA_UNKNOWN), m5111a(str5), str7, str11, (String) m5109a(map, "tombPath", EnvironmentCompat.MEDIA_UNKNOWN), map.get("sysLogPath"), map.get("jniLogPath"), str2, bArrM4976a, m5114a(map), false, false);
                        if (crashDetailBeanPackageCrashDatas != null) {
                            String str15 = (String) m5109a(map, "userId", crashDetailBeanPackageCrashDatas.f5097m);
                            crashDetailBeanPackageCrashDatas.f5097m = str15;
                            C6414al.m4927c("[Native record info] userId: %s", str15);
                            String str16 = (String) m5109a(map, "sysLog", crashDetailBeanPackageCrashDatas.f5107w);
                            crashDetailBeanPackageCrashDatas.f5107w = str16;
                            String str17 = (String) m5109a(map, "appVersion", str16);
                            crashDetailBeanPackageCrashDatas.f5090f = str17;
                            C6414al.m4927c("[Native record info] appVersion: %s", str17);
                            String str18 = map.get("isAppForeground");
                            if (str18 != null) {
                                C6414al.m4927c("[Native record info] isAppForeground: %s", str18);
                                zEqualsIgnoreCase = str18.equalsIgnoreCase("true");
                            } else {
                                zEqualsIgnoreCase = false;
                            }
                            crashDetailBeanPackageCrashDatas.f5075R = zEqualsIgnoreCase;
                            crashDetailBeanPackageCrashDatas.f5074Q = m5116b(map);
                            crashDetailBeanPackageCrashDatas.f5110z = null;
                            crashDetailBeanPackageCrashDatas.f5095k = true;
                        }
                        return crashDetailBeanPackageCrashDatas;
                    }
                    C6414al.m4929e("error format at version", new Object[0]);
                    return null;
                } catch (Throwable th) {
                    C6414al.m4929e("error format", new Object[0]);
                    th.printStackTrace();
                    return null;
                }
            }
            C6414al.m4929e("no intStateStr", new Object[0]);
        }
        return null;
    }
}
