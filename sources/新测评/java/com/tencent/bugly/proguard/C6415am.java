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
public final class C6415am {
    /* renamed from: a */
    public static boolean m4933a(File file, String str, long j10, boolean z9) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z9));
            boolean zM4934a = m4934a(bufferedWriter, str.toCharArray(), str.length(), file.length(), j10);
            bufferedWriter.close();
            return zM4934a;
        } catch (Throwable th) {
            C6414al.m4924a(th);
            return false;
        }
    }

    /* renamed from: b */
    private static List<File> m4936b(String str, final String str2, final String str3, long j10) {
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str3 == null) {
            C6414al.m4928d("prefix %s and/or postfix %s is null.", str2, str3);
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
                    return m4931a(fileArrListFiles, str2, str3, jCurrentTimeMillis - j10);
                }
            } catch (Throwable th) {
                C6414al.m4924a(th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m4934a(Writer writer, char[] cArr, int i10, long j10, long j11) throws IOException {
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
            C6414al.m4924a(e10);
            return false;
        }
    }

    /* renamed from: a */
    public static void m4932a(String str, String str2, String str3, long j10) {
        try {
            int i10 = 0;
            for (File file : m4936b(str, str2, str3, j10)) {
                C6414al.m4927c("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i10++;
                }
            }
            C6414al.m4927c("Number of overdue trace files that has deleted: ".concat(String.valueOf(i10)), new Object[0]);
        } catch (Throwable th) {
            C6414al.m4924a(th);
        }
    }

    /* renamed from: a */
    private static List<File> m4931a(File[] fileArr, String str, String str2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long jM4930a = m4930a(file.getName(), str, str2);
            if (jM4930a >= 0 && 0 <= jM4930a && jM4930a <= j10) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static long m4930a(String str, String str2, String str3) {
        if (str == null) {
            C6414al.m4928d("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th) {
            C6414al.m4924a(th);
        }
        return -1L;
    }

    /* renamed from: a */
    public static boolean m4935a(String str, String str2, int i10) {
        C6414al.m4927c("rqdp{  sv sd start} %s", str);
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
                return m4933a(file, str2, j10, file.length() < j10);
            } catch (Throwable th) {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }
}
