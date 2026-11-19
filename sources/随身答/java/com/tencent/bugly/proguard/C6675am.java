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
/* loaded from: classes4.dex */
public final class C6675am {
    /* renamed from: a */
    public static boolean m5112a(File file, String str, long j9, boolean z9) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z9));
            boolean zM5113a = m5113a(bufferedWriter, str.toCharArray(), str.length(), file.length(), j9);
            bufferedWriter.close();
            return zM5113a;
        } catch (Throwable th) {
            C6674al.m5103a(th);
            return false;
        }
    }

    /* renamed from: b */
    private static List<File> m5115b(String str, final String str2, final String str3, long j9) {
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str3 == null) {
            C6674al.m5107d("prefix %s and/or postfix %s is null.", str2, str3);
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
                    return m5110a(fileArrListFiles, str2, str3, jCurrentTimeMillis - j9);
                }
            } catch (Throwable th) {
                C6674al.m5103a(th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m5113a(Writer writer, char[] cArr, int i9, long j9, long j10) throws IOException {
        if (j9 >= j10) {
            return false;
        }
        try {
            if ((i9 * 2) + j9 <= j10) {
                writer.write(cArr, 0, i9);
            } else {
                writer.write(cArr, 0, (int) ((j10 - j9) / 2));
            }
            writer.flush();
            return true;
        } catch (IOException e10) {
            C6674al.m5103a(e10);
            return false;
        }
    }

    /* renamed from: a */
    public static void m5111a(String str, String str2, String str3, long j9) {
        try {
            int i9 = 0;
            for (File file : m5115b(str, str2, str3, j9)) {
                C6674al.m5106c("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i9++;
                }
            }
            C6674al.m5106c("Number of overdue trace files that has deleted: ".concat(String.valueOf(i9)), new Object[0]);
        } catch (Throwable th) {
            C6674al.m5103a(th);
        }
    }

    /* renamed from: a */
    private static List<File> m5110a(File[] fileArr, String str, String str2, long j9) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long jM5109a = m5109a(file.getName(), str, str2);
            if (jM5109a >= 0 && 0 <= jM5109a && jM5109a <= j9) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static long m5109a(String str, String str2, String str3) {
        if (str == null) {
            C6674al.m5107d("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th) {
            C6674al.m5103a(th);
        }
        return -1L;
    }

    /* renamed from: a */
    public static boolean m5114a(String str, String str2, int i9) {
        C6674al.m5106c("rqdp{  sv sd start} %s", str);
        if (str2 != null && str2.trim().length() > 0) {
            File file = new File(str);
            try {
                if (!file.exists()) {
                    if (file.getParentFile() != null) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                long j9 = i9;
                return m5112a(file, str2, j9, file.length() < j9);
            } catch (Throwable th) {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }
}
