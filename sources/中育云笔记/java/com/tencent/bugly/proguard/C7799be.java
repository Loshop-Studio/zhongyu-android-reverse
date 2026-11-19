package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.util.RequestConstant;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.huawei.hms.framework.common.ContainerUtils;
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
/* loaded from: classes5.dex */
public final class C7799be {

    /* renamed from: a */
    private static List<File> f13909a = new ArrayList();

    /* renamed from: a */
    public static String m10801a(String str) {
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split(SignParameters.NEW_LINE);
        if (strArrSplit == null || strArrSplit.length == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb2.append(str2);
                sb2.append(SignParameters.NEW_LINE);
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private static String m10808b(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM10669b = C7783ap.m10669b(str, "reg_record.txt");
        if (bufferedReaderM10669b == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String line = bufferedReaderM10669b.readLine();
            if (line != null && line.startsWith(str2)) {
                int i10 = 18;
                int i11 = 0;
                int length = 0;
                while (true) {
                    String line2 = bufferedReaderM10669b.readLine();
                    if (line2 == null) {
                        sb2.append(SignParameters.NEW_LINE);
                        String string = sb2.toString();
                        try {
                            return string;
                        } catch (Exception e10) {
                            return string;
                        }
                    }
                    if (i11 % 4 == 0) {
                        if (i11 > 0) {
                            sb2.append(SignParameters.NEW_LINE);
                        }
                        sb2.append("  ");
                    } else {
                        if (line2.length() > 16) {
                            i10 = 28;
                        }
                        sb2.append("                ".substring(0, i10 - length));
                    }
                    length = line2.length();
                    sb2.append(line2);
                    i11++;
                }
            }
            try {
                bufferedReaderM10669b.close();
            } catch (Exception e11) {
                C7779al.m10614a(e11);
            }
            return null;
        } catch (Throwable th) {
            try {
                C7779al.m10614a(th);
                try {
                    bufferedReaderM10669b.close();
                } catch (Exception e12) {
                    C7779al.m10614a(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM10669b.close();
                } catch (Exception e102) {
                    C7779al.m10614a(e102);
                }
            }
        }
    }

    /* renamed from: c */
    private static String m10809c(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM10669b = C7783ap.m10669b(str, "map_record.txt");
        if (bufferedReaderM10669b == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String line = bufferedReaderM10669b.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderM10669b.readLine();
                    if (line2 == null) {
                        String string = sb2.toString();
                        try {
                            return string;
                        } catch (Exception e10) {
                            return string;
                        }
                    }
                    sb2.append("  ");
                    sb2.append(line2);
                    sb2.append(SignParameters.NEW_LINE);
                }
            }
            try {
                bufferedReaderM10669b.close();
            } catch (Exception e11) {
                C7779al.m10614a(e11);
            }
            return null;
        } catch (Throwable th) {
            try {
                C7779al.m10614a(th);
                try {
                    bufferedReaderM10669b.close();
                } catch (Exception e12) {
                    C7779al.m10614a(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM10669b.close();
                } catch (Exception e102) {
                    C7779al.m10614a(e102);
                }
            }
        }
    }

    /* renamed from: d */
    private static Map<String, Integer> m10811d(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    C7779al.m10619e("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e10) {
            C7779al.m10619e("error format intStateStr %s", str);
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static <KeyT, ValueT> ValueT m10799a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e10) {
            C7779al.m10614a(e10);
            return valuet;
        }
    }

    /* renamed from: a */
    private static String m10800a(BufferedInputStream bufferedInputStream) throws IOException {
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
                        C7779al.m10614a(th);
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
    public static CrashDetailBean m10797a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strM10800a;
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
                                String strM10800a2 = m10800a(bufferedInputStream);
                                if (strM10800a2 != null && strM10800a2.equals("NATIVE_RQD_REPORT")) {
                                    HashMap map = new HashMap();
                                    loop0: while (true) {
                                        str2 = null;
                                        while (true) {
                                            strM10800a = m10800a(bufferedInputStream);
                                            if (strM10800a == null) {
                                                break loop0;
                                            }
                                            if (str2 == null) {
                                                str2 = strM10800a;
                                            }
                                        }
                                        map.put(str2, strM10800a);
                                    }
                                    if (str2 != null) {
                                        C7779al.m10619e("record not pair! drop! %s", str2);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                        }
                                        return null;
                                    }
                                    CrashDetailBean crashDetailBeanM10798a = m10798a(context, map, nativeExceptionHandler);
                                    try {
                                        bufferedInputStream.close();
                                        return crashDetailBeanM10798a;
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        return crashDetailBeanM10798a;
                                    }
                                }
                                C7779al.m10619e("record read fail! %s", strM10800a2);
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
        C7779al.m10619e("get eup record file args error", new Object[0]);
        return null;
    }

    /* renamed from: c */
    public static void m10810c(String str) {
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
                        C7779al.m10617c("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th) {
            C7779al.m10614a(th);
        }
    }

    /* renamed from: b */
    public static String m10807b(String str) {
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
    private static long m10806b(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        C7779al.m10617c("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            if (C7779al.m10614a(e10)) {
                return -1L;
            }
            e10.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: a */
    public static String m10803a(String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String strM10808b = m10808b(str, str2);
        if (strM10808b != null && !strM10808b.isEmpty()) {
            sb2.append("Register infos:\n");
            sb2.append(strM10808b);
        }
        String strM10809c = m10809c(str, str2);
        if (strM10809c != null && !strM10809c.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append(SignParameters.NEW_LINE);
            }
            sb2.append("System SO infos:\n");
            sb2.append(strM10809c);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m10805a(boolean z10, String str) {
        if (str != null) {
            f13909a.add(new File(str, "rqd_record.eup"));
            f13909a.add(new File(str, "reg_record.txt"));
            f13909a.add(new File(str, "map_record.txt"));
            f13909a.add(new File(str, "backup_record.txt"));
            if (z10) {
                m10810c(str);
            }
        }
        List<File> list = f13909a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f13909a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                C7779al.m10617c("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* renamed from: a */
    public static String m10802a(String str, int i10, String str2, boolean z10) throws IOException {
        BufferedReader bufferedReader = null;
        if (str != null && i10 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                C7779al.m10613a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f13909a.add(file);
                C7779al.m10617c("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return C7783ap.m10651a(new File(str), i10, z10);
                }
                String sb2 = new StringBuilder();
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
                                    sb2.append(line);
                                    sb2.append(SignParameters.NEW_LINE);
                                }
                                if (i10 > 0 && sb2.length() > i10) {
                                    if (z10) {
                                        sb2.delete(i10, sb2.length());
                                        break;
                                    }
                                    sb2.delete(0, sb2.length() - i10);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    C7779al.m10614a(th);
                                    sb2.append("\n[error:" + th.toString() + "]");
                                    sb2 = sb2.toString();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        sb2 = sb2;
                                    }
                                    return sb2;
                                } catch (Throwable th2) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e10) {
                                            C7779al.m10614a(e10);
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                        String string = sb2.toString();
                        bufferedReader2.close();
                        sb2 = string;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e11) {
                    C7779al.m10614a(e11);
                }
                return sb2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m10804a(Map<String, String> map) {
        String str = map.get("key-value");
        if (str == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (String str2 : str.split(SignParameters.NEW_LINE)) {
            String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit.length == 2) {
                map2.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return map2;
    }

    /* renamed from: a */
    private static CrashDetailBean m10798a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) throws NumberFormatException {
        boolean zEqualsIgnoreCase;
        if (C7768aa.m10478a(context) == null) {
            C7779al.m10619e("abnormal com info not created", new Object[0]);
        } else {
            String str = map.get("intStateStr");
            if (str != null && str.trim().length() > 0) {
                Map<String, Integer> mapM10811d = m10811d(map.get("intStateStr"));
                if (mapM10811d == null) {
                    C7779al.m10619e("parse intSateMap fail", Integer.valueOf(map.size()));
                    return null;
                }
                try {
                    mapM10811d.get("sino").getClass();
                    mapM10811d.get("sud").getClass();
                    String str2 = map.get("soVersion");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = (String) m10799a(map, "codeMsg", "unknown");
                        String str4 = (String) m10799a(map, "signalName", "unknown");
                        map.get("errnoMsg");
                        String str5 = (String) m10799a(map, "stack", "unknown");
                        String str6 = map.get("jstack");
                        if (str6 != null) {
                            str5 = str5 + "java:\n" + str6;
                        }
                        Integer num = mapM10811d.get("sico");
                        if (num != null && num.intValue() > 0) {
                            str4 = str4 + "(" + str3 + ")";
                            str3 = "KERNEL";
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = map.get("nativeLog");
                        byte[] bArrM10666a = (str9 == null || str9.isEmpty()) ? null : C7783ap.m10666a(str9, "BuglyNativeLog.txt");
                        String str10 = (String) m10799a(map, "sendingProcess", "unknown");
                        Integer num2 = mapM10811d.get("spd");
                        if (num2 != null) {
                            str10 = str10 + "(" + num2 + ")";
                        }
                        String str11 = str10;
                        String str12 = (String) m10799a(map, "threadName", "unknown");
                        Integer num3 = mapM10811d.get("et");
                        if (num3 != null) {
                            str12 = str12 + "(" + num3 + ")";
                        }
                        String str13 = str12;
                        String str14 = (String) m10799a(map, "processName", "unknown");
                        Integer num4 = mapM10811d.get("ep");
                        if (num4 != null) {
                            str14 = str14 + "(" + num4 + ")";
                        }
                        CrashDetailBean crashDetailBeanPackageCrashDatas = nativeExceptionHandler.packageCrashDatas(str14, str13, (mapM10811d.get("ets").intValue() * 1000) + (mapM10811d.get("etms").intValue() / 1000), str8, (String) m10799a(map, "errorAddr", "unknown"), m10801a(str5), str7, str11, (String) m10799a(map, "tombPath", "unknown"), map.get("sysLogPath"), map.get("jniLogPath"), str2, bArrM10666a, m10804a(map), false, false);
                        if (crashDetailBeanPackageCrashDatas != null) {
                            String str15 = (String) m10799a(map, "userId", crashDetailBeanPackageCrashDatas.f13539m);
                            crashDetailBeanPackageCrashDatas.f13539m = str15;
                            C7779al.m10617c("[Native record info] userId: %s", str15);
                            String str16 = (String) m10799a(map, "sysLog", crashDetailBeanPackageCrashDatas.f13549w);
                            crashDetailBeanPackageCrashDatas.f13549w = str16;
                            String str17 = (String) m10799a(map, "appVersion", str16);
                            crashDetailBeanPackageCrashDatas.f13532f = str17;
                            C7779al.m10617c("[Native record info] appVersion: %s", str17);
                            String str18 = map.get("isAppForeground");
                            if (str18 != null) {
                                C7779al.m10617c("[Native record info] isAppForeground: %s", str18);
                                zEqualsIgnoreCase = str18.equalsIgnoreCase(RequestConstant.TRUE);
                            } else {
                                zEqualsIgnoreCase = false;
                            }
                            crashDetailBeanPackageCrashDatas.f13517R = zEqualsIgnoreCase;
                            crashDetailBeanPackageCrashDatas.f13516Q = m10806b(map);
                            crashDetailBeanPackageCrashDatas.f13552z = null;
                            crashDetailBeanPackageCrashDatas.f13537k = true;
                        }
                        return crashDetailBeanPackageCrashDatas;
                    }
                    C7779al.m10619e("error format at version", new Object[0]);
                    return null;
                } catch (Throwable th) {
                    C7779al.m10619e("error format", new Object[0]);
                    th.printStackTrace();
                    return null;
                }
            }
            C7779al.m10619e("no intStateStr", new Object[0]);
        }
        return null;
    }
}
