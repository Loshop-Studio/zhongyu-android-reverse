package com.tencent.bugly.proguard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.am */
/* loaded from: classes3.dex */
public final class C5792am {
    /* renamed from: a */
    public static boolean m3938a(File file, String str, long j6, boolean z6) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z6));
            boolean zM3939a = m3939a(bufferedWriter, str.toCharArray(), str.length(), file.length(), j6);
            bufferedWriter.close();
            return zM3939a;
        } catch (Throwable th) {
            C5791al.m3929a(th);
            return false;
        }
    }

    /* renamed from: b */
    private static List<File> m3941b(String str, final String str2, final String str3, long j6) {
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str3 == null) {
            C5791al.m3933d("prefix %s and/or postfix %s is null.", str2, str3);
            return arrayList;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.tencent.bugly.proguard.am.1
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str4) {
                        return str4 != null && str4.startsWith(str2) && str4.endsWith(str3);
                    }
                });
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    return m3936a(fileArrListFiles, str2, str3, jCurrentTimeMillis - j6);
                }
            } catch (Throwable th) {
                C5791al.m3929a(th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m3939a(Writer writer, char[] cArr, int i6, long j6, long j7) throws IOException {
        if (j6 >= j7) {
            return false;
        }
        try {
            if ((i6 * 2) + j6 <= j7) {
                writer.write(cArr, 0, i6);
            } else {
                writer.write(cArr, 0, (int) ((j7 - j6) / 2));
            }
            writer.flush();
            return true;
        } catch (IOException e6) {
            C5791al.m3929a(e6);
            return false;
        }
    }

    /* renamed from: a */
    public static void m3937a(String str, String str2, String str3, long j6) {
        try {
            int i6 = 0;
            for (File file : m3941b(str, str2, str3, j6)) {
                C5791al.m3932c("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i6++;
                }
            }
            C5791al.m3932c("Number of overdue trace files that has deleted: ".concat(String.valueOf(i6)), new Object[0]);
        } catch (Throwable th) {
            C5791al.m3929a(th);
        }
    }

    /* renamed from: a */
    private static List<File> m3936a(File[] fileArr, String str, String str2, long j6) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long jM3935a = m3935a(file.getName(), str, str2);
            if (jM3935a >= 0 && 0 <= jM3935a && jM3935a <= j6) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static long m3935a(String str, String str2, String str3) {
        if (str == null) {
            C5791al.m3933d("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th) {
            C5791al.m3929a(th);
        }
        return -1L;
    }

    /* renamed from: a */
    public static boolean m3940a(String str, String str2, int i6) {
        C5791al.m3932c("rqdp{  sv sd start} %s", str);
        if (str2 != null && str2.trim().length() > 0) {
            File file = new File(str);
            try {
                if (!file.exists()) {
                    if (file.getParentFile() != null) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                long j6 = i6;
                return m3938a(file, str2, j6, file.length() < j6);
            } catch (Throwable th) {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }
}
