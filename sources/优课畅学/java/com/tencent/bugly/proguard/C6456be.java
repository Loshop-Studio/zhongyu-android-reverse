package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
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
public final class C6456be {

    /* renamed from: a */
    private static List<File> f4810a = new ArrayList();

    /* renamed from: a */
    public static String m4471a(String str) {
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
    private static String m4478b(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM4339b = C6440ap.m4339b(str, "reg_record.txt");
        if (bufferedReaderM4339b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM4339b.readLine();
            if (line != null && line.startsWith(str2)) {
                int i10 = 18;
                int i11 = 0;
                int length = 0;
                while (true) {
                    String line2 = bufferedReaderM4339b.readLine();
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
                bufferedReaderM4339b.close();
            } catch (Exception e11) {
                C6436al.m4284a(e11);
            }
            return null;
        } catch (Throwable th) {
            try {
                C6436al.m4284a(th);
                try {
                    bufferedReaderM4339b.close();
                } catch (Exception e12) {
                    C6436al.m4284a(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM4339b.close();
                } catch (Exception e102) {
                    C6436al.m4284a(e102);
                }
            }
        }
    }

    /* renamed from: c */
    private static String m4479c(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM4339b = C6440ap.m4339b(str, "map_record.txt");
        if (bufferedReaderM4339b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM4339b.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderM4339b.readLine();
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
                bufferedReaderM4339b.close();
            } catch (Exception e11) {
                C6436al.m4284a(e11);
            }
            return null;
        } catch (Throwable th) {
            try {
                C6436al.m4284a(th);
                try {
                    bufferedReaderM4339b.close();
                } catch (Exception e12) {
                    C6436al.m4284a(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM4339b.close();
                } catch (Exception e102) {
                    C6436al.m4284a(e102);
                }
            }
        }
    }

    /* renamed from: d */
    private static Map<String, Integer> m4481d(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    C6436al.m4289e("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e10) {
            C6436al.m4289e("error format intStateStr %s", str);
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static <KeyT, ValueT> ValueT m4469a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e10) {
            C6436al.m4284a(e10);
            return valuet;
        }
    }

    /* renamed from: a */
    private static String m4470a(BufferedInputStream bufferedInputStream) throws IOException {
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
                        C6436al.m4284a(th);
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
    public static CrashDetailBean m4467a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strM4470a;
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
                                String strM4470a2 = m4470a(bufferedInputStream);
                                if (strM4470a2 != null && strM4470a2.equals("NATIVE_RQD_REPORT")) {
                                    HashMap map = new HashMap();
                                    loop0: while (true) {
                                        str2 = null;
                                        while (true) {
                                            strM4470a = m4470a(bufferedInputStream);
                                            if (strM4470a == null) {
                                                break loop0;
                                            }
                                            if (str2 == null) {
                                                str2 = strM4470a;
                                            }
                                        }
                                        map.put(str2, strM4470a);
                                    }
                                    if (str2 != null) {
                                        C6436al.m4289e("record not pair! drop! %s", str2);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                        }
                                        return null;
                                    }
                                    CrashDetailBean crashDetailBeanM4468a = m4468a(context, map, nativeExceptionHandler);
                                    try {
                                        bufferedInputStream.close();
                                        return crashDetailBeanM4468a;
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        return crashDetailBeanM4468a;
                                    }
                                }
                                C6436al.m4289e("record read fail! %s", strM4470a2);
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
        C6436al.m4289e("get eup record file args error", new Object[0]);
        return null;
    }

    /* renamed from: c */
    public static void m4480c(String str) {
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
                        C6436al.m4287c("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th) {
            C6436al.m4284a(th);
        }
    }

    /* renamed from: b */
    public static String m4477b(String str) {
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
    private static long m4476b(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        C6436al.m4287c("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            if (C6436al.m4284a(e10)) {
                return -1L;
            }
            e10.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: a */
    public static String m4473a(String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String strM4478b = m4478b(str, str2);
        if (strM4478b != null && !strM4478b.isEmpty()) {
            sb.append("Register infos:\n");
            sb.append(strM4478b);
        }
        String strM4479c = m4479c(str, str2);
        if (strM4479c != null && !strM4479c.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(SignParameters.NEW_LINE);
            }
            sb.append("System SO infos:\n");
            sb.append(strM4479c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m4475a(boolean z10, String str) {
        if (str != null) {
            f4810a.add(new File(str, "rqd_record.eup"));
            f4810a.add(new File(str, "reg_record.txt"));
            f4810a.add(new File(str, "map_record.txt"));
            f4810a.add(new File(str, "backup_record.txt"));
            if (z10) {
                m4480c(str);
            }
        }
        List<File> list = f4810a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f4810a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                C6436al.m4287c("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* renamed from: a */
    public static String m4472a(String str, int i10, String str2, boolean z10) throws IOException {
        BufferedReader bufferedReader = null;
        if (str != null && i10 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                C6436al.m4283a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f4810a.add(file);
                C6436al.m4287c("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return C6440ap.m4321a(new File(str), i10, z10);
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
                                    if (z10) {
                                        sb.delete(i10, sb.length());
                                        break;
                                    }
                                    sb.delete(0, sb.length() - i10);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    C6436al.m4284a(th);
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
                                            C6436al.m4284a(e10);
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
                    C6436al.m4284a(e11);
                }
                return sb;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m4474a(Map<String, String> map) {
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
    private static CrashDetailBean m4468a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) throws NumberFormatException {
        boolean zEqualsIgnoreCase;
        if (C6425aa.m4148a(context) == null) {
            C6436al.m4289e("abnormal com info not created", new Object[0]);
        } else {
            String str = map.get("intStateStr");
            if (str != null && str.trim().length() > 0) {
                Map<String, Integer> mapM4481d = m4481d(map.get("intStateStr"));
                if (mapM4481d == null) {
                    C6436al.m4289e("parse intSateMap fail", Integer.valueOf(map.size()));
                    return null;
                }
                try {
                    mapM4481d.get("sino").getClass();
                    mapM4481d.get("sud").getClass();
                    String str2 = map.get("soVersion");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = (String) m4469a(map, "codeMsg", "unknown");
                        String str4 = (String) m4469a(map, "signalName", "unknown");
                        map.get("errnoMsg");
                        String str5 = (String) m4469a(map, "stack", "unknown");
                        String str6 = map.get("jstack");
                        if (str6 != null) {
                            str5 = str5 + "java:\n" + str6;
                        }
                        Integer num = mapM4481d.get("sico");
                        if (num != null && num.intValue() > 0) {
                            str4 = str4 + "(" + str3 + ")";
                            str3 = "KERNEL";
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = map.get("nativeLog");
                        byte[] bArrM4336a = (str9 == null || str9.isEmpty()) ? null : C6440ap.m4336a(str9, "BuglyNativeLog.txt");
                        String str10 = (String) m4469a(map, "sendingProcess", "unknown");
                        Integer num2 = mapM4481d.get("spd");
                        if (num2 != null) {
                            str10 = str10 + "(" + num2 + ")";
                        }
                        String str11 = str10;
                        String str12 = (String) m4469a(map, "threadName", "unknown");
                        Integer num3 = mapM4481d.get("et");
                        if (num3 != null) {
                            str12 = str12 + "(" + num3 + ")";
                        }
                        String str13 = str12;
                        String str14 = (String) m4469a(map, "processName", "unknown");
                        Integer num4 = mapM4481d.get("ep");
                        if (num4 != null) {
                            str14 = str14 + "(" + num4 + ")";
                        }
                        CrashDetailBean crashDetailBeanPackageCrashDatas = nativeExceptionHandler.packageCrashDatas(str14, str13, (mapM4481d.get("ets").intValue() * 1000) + (mapM4481d.get("etms").intValue() / 1000), str8, (String) m4469a(map, "errorAddr", "unknown"), m4471a(str5), str7, str11, (String) m4469a(map, "tombPath", "unknown"), map.get("sysLogPath"), map.get("jniLogPath"), str2, bArrM4336a, m4474a(map), false, false);
                        if (crashDetailBeanPackageCrashDatas != null) {
                            String str15 = (String) m4469a(map, "userId", crashDetailBeanPackageCrashDatas.f4440m);
                            crashDetailBeanPackageCrashDatas.f4440m = str15;
                            C6436al.m4287c("[Native record info] userId: %s", str15);
                            String str16 = (String) m4469a(map, "sysLog", crashDetailBeanPackageCrashDatas.f4450w);
                            crashDetailBeanPackageCrashDatas.f4450w = str16;
                            String str17 = (String) m4469a(map, "appVersion", str16);
                            crashDetailBeanPackageCrashDatas.f4433f = str17;
                            C6436al.m4287c("[Native record info] appVersion: %s", str17);
                            String str18 = map.get("isAppForeground");
                            if (str18 != null) {
                                C6436al.m4287c("[Native record info] isAppForeground: %s", str18);
                                zEqualsIgnoreCase = str18.equalsIgnoreCase("true");
                            } else {
                                zEqualsIgnoreCase = false;
                            }
                            crashDetailBeanPackageCrashDatas.f4418R = zEqualsIgnoreCase;
                            crashDetailBeanPackageCrashDatas.f4417Q = m4476b(map);
                            crashDetailBeanPackageCrashDatas.f4453z = null;
                            crashDetailBeanPackageCrashDatas.f4438k = true;
                        }
                        return crashDetailBeanPackageCrashDatas;
                    }
                    C6436al.m4289e("error format at version", new Object[0]);
                    return null;
                } catch (Throwable th) {
                    C6436al.m4289e("error format", new Object[0]);
                    th.printStackTrace();
                    return null;
                }
            }
            C6436al.m4289e("no intStateStr", new Object[0]);
        }
        return null;
    }
}
