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
public final class C5811be {

    /* renamed from: a */
    private static List<File> f4188a = new ArrayList();

    /* renamed from: a */
    public static String m4116a(String str) {
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
    private static String m4123b(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM3984b = C5795ap.m3984b(str, "reg_record.txt");
        if (bufferedReaderM3984b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM3984b.readLine();
            if (line != null && line.startsWith(str2)) {
                int i6 = 18;
                int i7 = 0;
                int length = 0;
                while (true) {
                    String line2 = bufferedReaderM3984b.readLine();
                    if (line2 == null) {
                        sb.append(SignParameters.NEW_LINE);
                        String string = sb.toString();
                        try {
                            return string;
                        } catch (Exception e6) {
                            return string;
                        }
                    }
                    if (i7 % 4 == 0) {
                        if (i7 > 0) {
                            sb.append(SignParameters.NEW_LINE);
                        }
                        sb.append("  ");
                    } else {
                        if (line2.length() > 16) {
                            i6 = 28;
                        }
                        sb.append("                ".substring(0, i6 - length));
                    }
                    length = line2.length();
                    sb.append(line2);
                    i7++;
                }
            }
            try {
                bufferedReaderM3984b.close();
            } catch (Exception e7) {
                C5791al.m3929a(e7);
            }
            return null;
        } catch (Throwable th) {
            try {
                C5791al.m3929a(th);
                try {
                    bufferedReaderM3984b.close();
                } catch (Exception e8) {
                    C5791al.m3929a(e8);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM3984b.close();
                } catch (Exception e62) {
                    C5791al.m3929a(e62);
                }
            }
        }
    }

    /* renamed from: c */
    private static String m4124c(String str, String str2) throws IOException {
        BufferedReader bufferedReaderM3984b = C5795ap.m3984b(str, "map_record.txt");
        if (bufferedReaderM3984b == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderM3984b.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderM3984b.readLine();
                    if (line2 == null) {
                        String string = sb.toString();
                        try {
                            return string;
                        } catch (Exception e6) {
                            return string;
                        }
                    }
                    sb.append("  ");
                    sb.append(line2);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            try {
                bufferedReaderM3984b.close();
            } catch (Exception e7) {
                C5791al.m3929a(e7);
            }
            return null;
        } catch (Throwable th) {
            try {
                C5791al.m3929a(th);
                try {
                    bufferedReaderM3984b.close();
                } catch (Exception e8) {
                    C5791al.m3929a(e8);
                }
                return null;
            } finally {
                try {
                    bufferedReaderM3984b.close();
                } catch (Exception e62) {
                    C5791al.m3929a(e62);
                }
            }
        }
    }

    /* renamed from: d */
    private static Map<String, Integer> m4126d(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    C5791al.m3934e("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e6) {
            C5791al.m3934e("error format intStateStr %s", str);
            e6.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static <KeyT, ValueT> ValueT m4114a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e6) {
            C5791al.m3929a(e6);
            return valuet;
        }
    }

    /* renamed from: a */
    private static String m4115a(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            while (true) {
                try {
                    int i6 = bufferedInputStream.read();
                    if (i6 == -1) {
                        break;
                    }
                    if (i6 == 0) {
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTf-8");
                        byteArrayOutputStream.close();
                        return str;
                    }
                    byteArrayOutputStream.write(i6);
                } catch (Throwable th) {
                    th = th;
                    try {
                        C5791al.m3929a(th);
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
    public static CrashDetailBean m4112a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strM4115a;
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
                                String strM4115a2 = m4115a(bufferedInputStream);
                                if (strM4115a2 != null && strM4115a2.equals("NATIVE_RQD_REPORT")) {
                                    HashMap map = new HashMap();
                                    loop0: while (true) {
                                        str2 = null;
                                        while (true) {
                                            strM4115a = m4115a(bufferedInputStream);
                                            if (strM4115a == null) {
                                                break loop0;
                                            }
                                            if (str2 == null) {
                                                str2 = strM4115a;
                                            }
                                        }
                                        map.put(str2, strM4115a);
                                    }
                                    if (str2 != null) {
                                        C5791al.m3934e("record not pair! drop! %s", str2);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e6) {
                                            e6.printStackTrace();
                                        }
                                        return null;
                                    }
                                    CrashDetailBean crashDetailBeanM4113a = m4113a(context, map, nativeExceptionHandler);
                                    try {
                                        bufferedInputStream.close();
                                        return crashDetailBeanM4113a;
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                        return crashDetailBeanM4113a;
                                    }
                                }
                                C5791al.m3934e("record read fail! %s", strM4115a2);
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
        C5791al.m3934e("get eup record file args error", new Object[0]);
        return null;
    }

    /* renamed from: c */
    public static void m4125c(String str) {
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
                        C5791al.m3932c("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th) {
            C5791al.m3929a(th);
        }
    }

    /* renamed from: b */
    public static String m4122b(String str) {
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
    private static long m4121b(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        C5791al.m3932c("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e6) {
            if (C5791al.m3929a(e6)) {
                return -1L;
            }
            e6.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: a */
    public static String m4118a(String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String strM4123b = m4123b(str, str2);
        if (strM4123b != null && !strM4123b.isEmpty()) {
            sb.append("Register infos:\n");
            sb.append(strM4123b);
        }
        String strM4124c = m4124c(str, str2);
        if (strM4124c != null && !strM4124c.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(SignParameters.NEW_LINE);
            }
            sb.append("System SO infos:\n");
            sb.append(strM4124c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m4120a(boolean z6, String str) {
        if (str != null) {
            f4188a.add(new File(str, "rqd_record.eup"));
            f4188a.add(new File(str, "reg_record.txt"));
            f4188a.add(new File(str, "map_record.txt"));
            f4188a.add(new File(str, "backup_record.txt"));
            if (z6) {
                m4125c(str);
            }
        }
        List<File> list = f4188a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f4188a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                C5791al.m3932c("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* renamed from: a */
    public static String m4117a(String str, int i6, String str2, boolean z6) throws IOException {
        BufferedReader bufferedReader = null;
        if (str != null && i6 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                C5791al.m3928a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f4188a.add(file);
                C5791al.m3932c("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return C5795ap.m3966a(new File(str), i6, z6);
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
                                if (i6 > 0 && sb.length() > i6) {
                                    if (z6) {
                                        sb.delete(i6, sb.length());
                                        break;
                                    }
                                    sb.delete(0, sb.length() - i6);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    C5791al.m3929a(th);
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
                                        } catch (Exception e6) {
                                            C5791al.m3929a(e6);
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
                } catch (Exception e7) {
                    C5791al.m3929a(e7);
                }
                return sb;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m4119a(Map<String, String> map) {
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
    private static CrashDetailBean m4113a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) throws NumberFormatException {
        boolean zEqualsIgnoreCase;
        if (C5780aa.m3793a(context) == null) {
            C5791al.m3934e("abnormal com info not created", new Object[0]);
        } else {
            String str = map.get("intStateStr");
            if (str != null && str.trim().length() > 0) {
                Map<String, Integer> mapM4126d = m4126d(map.get("intStateStr"));
                if (mapM4126d == null) {
                    C5791al.m3934e("parse intSateMap fail", Integer.valueOf(map.size()));
                    return null;
                }
                try {
                    mapM4126d.get("sino").getClass();
                    mapM4126d.get("sud").getClass();
                    String str2 = map.get("soVersion");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = (String) m4114a(map, "codeMsg", EnvironmentCompat.MEDIA_UNKNOWN);
                        String str4 = (String) m4114a(map, "signalName", EnvironmentCompat.MEDIA_UNKNOWN);
                        map.get("errnoMsg");
                        String str5 = (String) m4114a(map, "stack", EnvironmentCompat.MEDIA_UNKNOWN);
                        String str6 = map.get("jstack");
                        if (str6 != null) {
                            str5 = str5 + "java:\n" + str6;
                        }
                        Integer num = mapM4126d.get("sico");
                        if (num != null && num.intValue() > 0) {
                            str4 = str4 + "(" + str3 + ")";
                            str3 = "KERNEL";
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = map.get("nativeLog");
                        byte[] bArrM3981a = (str9 == null || str9.isEmpty()) ? null : C5795ap.m3981a(str9, "BuglyNativeLog.txt");
                        String str10 = (String) m4114a(map, "sendingProcess", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num2 = mapM4126d.get("spd");
                        if (num2 != null) {
                            str10 = str10 + "(" + num2 + ")";
                        }
                        String str11 = str10;
                        String str12 = (String) m4114a(map, "threadName", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num3 = mapM4126d.get("et");
                        if (num3 != null) {
                            str12 = str12 + "(" + num3 + ")";
                        }
                        String str13 = str12;
                        String str14 = (String) m4114a(map, "processName", EnvironmentCompat.MEDIA_UNKNOWN);
                        Integer num4 = mapM4126d.get("ep");
                        if (num4 != null) {
                            str14 = str14 + "(" + num4 + ")";
                        }
                        CrashDetailBean crashDetailBeanPackageCrashDatas = nativeExceptionHandler.packageCrashDatas(str14, str13, (mapM4126d.get("ets").intValue() * 1000) + (mapM4126d.get("etms").intValue() / 1000), str8, (String) m4114a(map, "errorAddr", EnvironmentCompat.MEDIA_UNKNOWN), m4116a(str5), str7, str11, (String) m4114a(map, "tombPath", EnvironmentCompat.MEDIA_UNKNOWN), map.get("sysLogPath"), map.get("jniLogPath"), str2, bArrM3981a, m4119a(map), false, false);
                        if (crashDetailBeanPackageCrashDatas != null) {
                            String str15 = (String) m4114a(map, "userId", crashDetailBeanPackageCrashDatas.f3818m);
                            crashDetailBeanPackageCrashDatas.f3818m = str15;
                            C5791al.m3932c("[Native record info] userId: %s", str15);
                            String str16 = (String) m4114a(map, "sysLog", crashDetailBeanPackageCrashDatas.f3828w);
                            crashDetailBeanPackageCrashDatas.f3828w = str16;
                            String str17 = (String) m4114a(map, "appVersion", str16);
                            crashDetailBeanPackageCrashDatas.f3811f = str17;
                            C5791al.m3932c("[Native record info] appVersion: %s", str17);
                            String str18 = map.get("isAppForeground");
                            if (str18 != null) {
                                C5791al.m3932c("[Native record info] isAppForeground: %s", str18);
                                zEqualsIgnoreCase = str18.equalsIgnoreCase("true");
                            } else {
                                zEqualsIgnoreCase = false;
                            }
                            crashDetailBeanPackageCrashDatas.f3796R = zEqualsIgnoreCase;
                            crashDetailBeanPackageCrashDatas.f3795Q = m4121b(map);
                            crashDetailBeanPackageCrashDatas.f3831z = null;
                            crashDetailBeanPackageCrashDatas.f3816k = true;
                        }
                        return crashDetailBeanPackageCrashDatas;
                    }
                    C5791al.m3934e("error format at version", new Object[0]);
                    return null;
                } catch (Throwable th) {
                    C5791al.m3934e("error format", new Object[0]);
                    th.printStackTrace();
                    return null;
                }
            }
            C5791al.m3934e("no intStateStr", new Object[0]);
        }
        return null;
    }
}
