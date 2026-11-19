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
/* loaded from: classes5.dex */
public final class C7780am {

    /* renamed from: com.tencent.bugly.proguard.am$a */
    public static class a implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ String f13734a;

        /* renamed from: b */
        public final /* synthetic */ String f13735b;

        public a(String str, String str2) {
            this.f13734a = str;
            this.f13735b = str2;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str != null && str.startsWith(this.f13734a) && str.endsWith(this.f13735b);
        }
    }

    /* renamed from: a */
    public static boolean m10623a(File file, String str, long j10, boolean z10) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z10));
            boolean zM10624a = m10624a(bufferedWriter, str.toCharArray(), str.length(), file.length(), j10);
            bufferedWriter.close();
            return zM10624a;
        } catch (Throwable th) {
            C7779al.m10614a(th);
            return false;
        }
    }

    /* renamed from: b */
    private static List<File> m10626b(String str, String str2, String str3, long j10) {
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str3 == null) {
            C7779al.m10618d("prefix %s and/or postfix %s is null.", str2, str3);
            return arrayList;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles(new a(str2, str3));
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    return m10621a(fileArrListFiles, str2, str3, jCurrentTimeMillis - j10);
                }
            } catch (Throwable th) {
                C7779al.m10614a(th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m10624a(Writer writer, char[] cArr, int i10, long j10, long j11) throws IOException {
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
            C7779al.m10614a(e10);
            return false;
        }
    }

    /* renamed from: a */
    public static void m10622a(String str, String str2, String str3, long j10) {
        try {
            int i10 = 0;
            for (File file : m10626b(str, str2, str3, j10)) {
                C7779al.m10617c("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i10++;
                }
            }
            C7779al.m10617c("Number of overdue trace files that has deleted: ".concat(String.valueOf(i10)), new Object[0]);
        } catch (Throwable th) {
            C7779al.m10614a(th);
        }
    }

    /* renamed from: a */
    private static List<File> m10621a(File[] fileArr, String str, String str2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long jM10620a = m10620a(file.getName(), str, str2);
            if (jM10620a >= 0 && 0 <= jM10620a && jM10620a <= j10) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static long m10620a(String str, String str2, String str3) {
        if (str == null) {
            C7779al.m10618d("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th) {
            C7779al.m10614a(th);
        }
        return -1L;
    }

    /* renamed from: a */
    public static boolean m10625a(String str, String str2, int i10) {
        C7779al.m10617c("rqdp{  sv sd start} %s", str);
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
                return m10623a(file, str2, j10, file.length() < j10);
            } catch (Throwable th) {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return false;
    }
}
