package com.tencent.bugly.proguard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.am */
/* loaded from: classes3.dex */
public final class C4056am {
    /* renamed from: a */
    public static boolean m3031a(File file, String str, long j7, boolean z8) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z8));
            boolean zM3032a = m3032a(bufferedWriter, str.toCharArray(), str.length(), file.length(), j7);
            bufferedWriter.close();
            return zM3032a;
        } catch (Throwable th) {
            C4055al.m3022a(th);
            return false;
        }
    }

    /* renamed from: b */
    private static List<File> m3034b(String str, String str2, String str3, long j7) {
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str3 == null) {
            C4055al.m3026d("prefix %s and/or postfix %s is null.", str2, str3);
            return arrayList;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles(new C4126n0(str2, str3));
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    return m3029a(fileArrListFiles, str2, str3, jCurrentTimeMillis - j7);
                }
            } catch (Throwable th) {
                C4055al.m3022a(th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m3032a(Writer writer, char[] cArr, int i, long j7, long j8) throws IOException {
        if (j7 >= j8) {
            return false;
        }
        try {
            if ((i * 2) + j7 <= j8) {
                writer.write(cArr, 0, i);
            } else {
                writer.write(cArr, 0, (int) ((j8 - j7) / 2));
            }
            writer.flush();
            return true;
        } catch (IOException e) {
            C4055al.m3022a(e);
            return false;
        }
    }

    /* renamed from: a */
    public static void m3030a(String str, String str2, String str3, long j7) {
        try {
            int i = 0;
            for (File file : m3034b(str, str2, str3, j7)) {
                C4055al.m3025c("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i++;
                }
            }
            C4055al.m3025c("Number of overdue trace files that has deleted: ".concat(String.valueOf(i)), new Object[0]);
        } catch (Throwable th) {
            C4055al.m3022a(th);
        }
    }

    /* renamed from: a */
    private static List<File> m3029a(File[] fileArr, String str, String str2, long j7) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long jM3028a = m3028a(file.getName(), str, str2);
            if (jM3028a >= 0 && 0 <= jM3028a && jM3028a <= j7) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static long m3028a(String str, String str2, String str3) {
        if (str == null) {
            C4055al.m3026d("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th) {
            C4055al.m3022a(th);
        }
        return -1L;
    }

    /* renamed from: a */
    public static boolean m3033a(String str, String str2, int i) {
        C4055al.m3025c("rqdp{  sv sd start} %s", str);
        if (str2 != null && str2.trim().length() > 0) {
            File file = new File(str);
            try {
                if (!file.exists()) {
                    if (file.getParentFile() != null) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                long j7 = i;
                return m3031a(file, str2, j7, file.length() < j7);
            } catch (Throwable th) {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }
}
