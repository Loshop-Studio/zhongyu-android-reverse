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
public final class C6437am {
    /* renamed from: a */
    public static boolean m4293a(File file, String str, long j10, boolean z10) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z10));
            boolean zM4294a = m4294a(bufferedWriter, str.toCharArray(), str.length(), file.length(), j10);
            bufferedWriter.close();
            return zM4294a;
        } catch (Throwable th) {
            C6436al.m4284a(th);
            return false;
        }
    }

    /* renamed from: b */
    private static List<File> m4296b(String str, final String str2, final String str3, long j10) {
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str3 == null) {
            C6436al.m4288d("prefix %s and/or postfix %s is null.", str2, str3);
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
                    return m4291a(fileArrListFiles, str2, str3, jCurrentTimeMillis - j10);
                }
            } catch (Throwable th) {
                C6436al.m4284a(th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m4294a(Writer writer, char[] cArr, int i10, long j10, long j11) throws IOException {
        if (j10 >= j11) {
            return false;
        }
        try {
            if ((i10 * 2) + j10 <= j11) {
                writer.write(cArr, 0, i10);
            } else {
                writer.write(cArr, 0, (int) ((j11 - j10) / 2));
            }
            writer.flush();
            return true;
        } catch (IOException e10) {
            C6436al.m4284a(e10);
            return false;
        }
    }

    /* renamed from: a */
    public static void m4292a(String str, String str2, String str3, long j10) {
        try {
            int i10 = 0;
            for (File file : m4296b(str, str2, str3, j10)) {
                C6436al.m4287c("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i10++;
                }
            }
            C6436al.m4287c("Number of overdue trace files that has deleted: ".concat(String.valueOf(i10)), new Object[0]);
        } catch (Throwable th) {
            C6436al.m4284a(th);
        }
    }

    /* renamed from: a */
    private static List<File> m4291a(File[] fileArr, String str, String str2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long jM4290a = m4290a(file.getName(), str, str2);
            if (jM4290a >= 0 && 0 <= jM4290a && jM4290a <= j10) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static long m4290a(String str, String str2, String str3) {
        if (str == null) {
            C6436al.m4288d("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th) {
            C6436al.m4284a(th);
        }
        return -1L;
    }

    /* renamed from: a */
    public static boolean m4295a(String str, String str2, int i10) {
        C6436al.m4287c("rqdp{  sv sd start} %s", str);
        if (str2 != null && str2.trim().length() > 0) {
            File file = new File(str);
            try {
                if (!file.exists()) {
                    if (file.getParentFile() != null) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                long j10 = i10;
                return m4293a(file, str2, j10, file.length() < j10);
            } catch (Throwable th) {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }
}
