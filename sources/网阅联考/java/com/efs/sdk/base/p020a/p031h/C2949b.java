package com.efs.sdk.base.p020a.p031h;

import com.efs.sdk.base.p020a.p021a.C2901a;
import com.efs.sdk.base.p020a.p028f.C2930b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: com.efs.sdk.base.a.h.b */
/* loaded from: classes2.dex */
public final class C2949b {

    /* renamed from: a */
    private static final Random f1139a = new Random();

    /* renamed from: a */
    public static boolean m2185a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m2182a(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    C2957d.m2214b("efs.util.file", "write file error, filename is " + file.getName(), th);
                    m2182a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    m2182a(fileOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: b */
    public static void m2188b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                m2188b(file2);
            }
        }
        file.delete();
    }

    /* renamed from: c */
    public static long m2189c(File file) {
        long jM2189c = 0;
        if (!file.isDirectory()) {
            return 0 + file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jM2189c += m2189c(file2);
        }
        return jM2189c;
    }

    /* renamed from: d */
    public static List<File> m2190d(File file) {
        if (file.isFile()) {
            return Collections.emptyList();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(m2190d(file2));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private static String m2191e(File file) {
        String string = "";
        if (!file.exists()) {
            return "";
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i4 = fileInputStream2.read(bArr);
                    if (i4 <= 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, i4));
                }
                string = sb.toString();
                m2182a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    C2957d.m2214b("efs.util.file", "read file error", th);
                    return string;
                } finally {
                    m2182a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return string;
    }

    /* renamed from: a */
    public static boolean m2184a(File file, String str) {
        return m2185a(file, str.getBytes());
    }

    /* renamed from: a */
    public static String m2181a(File file) {
        return m2191e(file);
    }

    /* renamed from: b */
    public static C2930b m2187b(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 7) {
            C2957d.m2213a("efs.util.file", "File name error, name is ".concat(str), null);
            return null;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        byte bByteValue = Byte.valueOf(strArrSplit[2]).byteValue();
        C2930b c2930b = new C2930b(str2, Byte.valueOf(strArrSplit[3]).byteValue());
        c2930b.m2154a(str3);
        c2930b.m2153a(bByteValue);
        return c2930b;
    }

    /* renamed from: a */
    public static byte[] m2186a(String str) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[0];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            m2182a(fileInputStream);
        } catch (Exception e5) {
            e = e5;
            fileInputStream2 = fileInputStream;
            C2957d.m2214b("efs.util.file", "read data error", e);
            m2182a(fileInputStream2);
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            m2182a(fileInputStream2);
            throw th;
        }
        return bArr;
    }

    /* renamed from: a */
    public static void m2182a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                C2957d.m2214b("efs.util.file", "safe close error", th);
            }
        }
    }

    /* renamed from: a */
    public static String m2180a(C2930b c2930b) {
        StringBuilder sb = new StringBuilder();
        sb.append(c2930b.f1119a.f1112a);
        sb.append("_");
        sb.append(c2930b.f1119a.f1115d);
        sb.append("_");
        sb.append(c2930b.f1119a.f1116e);
        sb.append("_");
        sb.append((int) c2930b.f1119a.f1113b);
        sb.append("_");
        sb.append(C2960g.m2221a());
        sb.append("_");
        sb.append(f1139a.nextInt(10000));
        sb.append("_");
        C2901a.m2055a();
        sb.append(C2901a.m2058b());
        return sb.toString();
    }

    /* renamed from: a */
    public static void m2183a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[524288];
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int i4 = fileInputStream2.read(bArr);
                        if (i4 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i4);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        fileInputStream = fileInputStream2;
                        try {
                            C2957d.m2214b("efs.util.file", "error when copy", e);
                            m2182a(fileInputStream);
                            m2182a(fileOutputStream);
                            m2188b(file);
                        } catch (Throwable th) {
                            th = th;
                            m2182a(fileInputStream);
                            m2182a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        m2182a(fileInputStream);
                        m2182a(fileOutputStream);
                        throw th;
                    }
                }
                m2182a(fileInputStream2);
            } catch (Exception e5) {
                e = e5;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e6) {
            e = e6;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        m2182a(fileOutputStream);
        m2188b(file);
    }
}
