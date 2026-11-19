package com.efs.sdk.base.p039a.p050h;

import com.efs.sdk.base.p039a.p040a.C5641a;
import com.efs.sdk.base.p039a.p047f.C5670b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: com.efs.sdk.base.a.h.b */
/* loaded from: classes3.dex */
public final class C5689b {

    /* renamed from: a */
    private static final Random f4743a = new Random();

    /* renamed from: a */
    public static boolean m4154a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m4151a(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    C5697d.m4183b("efs.util.file", "write file error, filename is " + file.getName(), th);
                    m4151a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    m4151a(fileOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: b */
    public static void m4157b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                m4157b(file2);
            }
        }
        file.delete();
    }

    /* renamed from: c */
    public static long m4158c(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jM4158c = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jM4158c += m4158c(file2);
        }
        return jM4158c;
    }

    /* renamed from: d */
    public static List<File> m4159d(File file) {
        if (file.isFile()) {
            return Collections.EMPTY_LIST;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(m4159d(file2));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private static String m4160e(File file) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            return "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i9 = fileInputStream.read(bArr);
                if (i9 <= 0) {
                    String string = sb.toString();
                    m4151a(fileInputStream);
                    return string;
                }
                sb.append(new String(bArr, 0, i9));
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            try {
                C5697d.m4183b("efs.util.file", "read file error", th);
                return "";
            } finally {
                m4151a(fileInputStream2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m4153a(File file, String str) {
        return m4154a(file, str.getBytes());
    }

    /* renamed from: a */
    public static String m4150a(File file) {
        return m4160e(file);
    }

    /* renamed from: b */
    public static C5670b m4156b(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 7) {
            C5697d.m4182a("efs.util.file", "File name error, name is ".concat(str), null);
            return null;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        byte bByteValue = Byte.valueOf(strArrSplit[2]).byteValue();
        C5670b c5670b = new C5670b(str2, Byte.valueOf(strArrSplit[3]).byteValue());
        c5670b.m4123a(str3);
        c5670b.m4122a(bByteValue);
        return c5670b;
    }

    /* renamed from: a */
    public static byte[] m4155a(String str) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[0];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            m4151a(fileInputStream);
            return bArr;
        } catch (Exception e11) {
            e = e11;
            fileInputStream2 = fileInputStream;
            C5697d.m4183b("efs.util.file", "read data error", e);
            m4151a(fileInputStream2);
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            m4151a(fileInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m4151a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                C5697d.m4183b("efs.util.file", "safe close error", th);
            }
        }
    }

    /* renamed from: a */
    public static String m4149a(C5670b c5670b) {
        StringBuilder sb = new StringBuilder();
        sb.append(c5670b.f4723a.f4716a);
        sb.append("_");
        sb.append(c5670b.f4723a.f4719d);
        sb.append("_");
        sb.append(c5670b.f4723a.f4720e);
        sb.append("_");
        sb.append((int) c5670b.f4723a.f4717b);
        sb.append("_");
        sb.append(C5700g.m4190a());
        sb.append("_");
        sb.append(f4743a.nextInt(10000));
        sb.append("_");
        C5641a.m4024a();
        sb.append(C5641a.m4027b());
        return sb.toString();
    }

    /* renamed from: a */
    public static void m4152a(File file, File file2) throws Throwable {
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
                        int i9 = fileInputStream2.read(bArr);
                        if (i9 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i9);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        try {
                            C5697d.m4183b("efs.util.file", "error when copy", e);
                            m4151a(fileInputStream);
                            m4151a(fileOutputStream);
                            m4157b(file);
                        } catch (Throwable th) {
                            th = th;
                            m4151a(fileInputStream);
                            m4151a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        m4151a(fileInputStream);
                        m4151a(fileOutputStream);
                        throw th;
                    }
                }
                m4151a(fileInputStream2);
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        m4151a(fileOutputStream);
        m4157b(file);
    }
}
