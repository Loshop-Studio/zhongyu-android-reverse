package com.efs.sdk.base.p035a.p046h;

import anet.channel.bytes.C0860a;
import com.efs.sdk.base.p035a.p036a.C1273a;
import com.efs.sdk.base.p035a.p043f.C1302b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: com.efs.sdk.base.a.h.b */
/* loaded from: classes.dex */
public final class C1321b {

    /* renamed from: a */
    private static final Random f7109a = new Random();

    /* renamed from: a */
    public static boolean m5544a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m5541a(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    C1329d.m5573b("efs.util.file", "write file error, filename is " + file.getName(), th);
                    m5541a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    m5541a(fileOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: b */
    public static void m5547b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                m5547b(file2);
            }
        }
        file.delete();
    }

    /* renamed from: c */
    public static long m5548c(File file) {
        long jM5548c = 0;
        if (!file.isDirectory()) {
            return 0 + file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jM5548c += m5548c(file2);
        }
        return jM5548c;
    }

    /* renamed from: d */
    public static List<File> m5549d(File file) {
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
                arrayList.addAll(m5549d(file2));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private static String m5550e(File file) {
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
                m5541a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    C1329d.m5573b("efs.util.file", "read file error", th);
                    return string;
                } finally {
                    m5541a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return string;
    }

    /* renamed from: a */
    public static boolean m5543a(File file, String str) {
        return m5544a(file, str.getBytes());
    }

    /* renamed from: a */
    public static String m5540a(File file) {
        return m5550e(file);
    }

    /* renamed from: b */
    public static C1302b m5546b(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 7) {
            C1329d.m5572a("efs.util.file", "File name error, name is ".concat(str), null);
            return null;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        byte bByteValue = Byte.valueOf(strArrSplit[2]).byteValue();
        C1302b c1302b = new C1302b(str2, Byte.valueOf(strArrSplit[3]).byteValue());
        c1302b.m5513a(str3);
        c1302b.m5512a(bByteValue);
        return c1302b;
    }

    /* renamed from: a */
    public static byte[] m5545a(String str) throws Throwable {
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
            m5541a(fileInputStream);
        } catch (Exception e5) {
            e = e5;
            fileInputStream2 = fileInputStream;
            C1329d.m5573b("efs.util.file", "read data error", e);
            m5541a(fileInputStream2);
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            m5541a(fileInputStream2);
            throw th;
        }
        return bArr;
    }

    /* renamed from: a */
    public static void m5541a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                C1329d.m5573b("efs.util.file", "safe close error", th);
            }
        }
    }

    /* renamed from: a */
    public static String m5539a(C1302b c1302b) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1302b.f7089a.f7082a);
        sb.append("_");
        sb.append(c1302b.f7089a.f7085d);
        sb.append("_");
        sb.append(c1302b.f7089a.f7086e);
        sb.append("_");
        sb.append((int) c1302b.f7089a.f7083b);
        sb.append("_");
        sb.append(C1332g.m5580a());
        sb.append("_");
        sb.append(f7109a.nextInt(10000));
        sb.append("_");
        C1273a.m5414a();
        sb.append(C1273a.m5417b());
        return sb.toString();
    }

    /* renamed from: a */
    public static void m5542a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[C0860a.MAX_POOL_SIZE];
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
                            C1329d.m5573b("efs.util.file", "error when copy", e);
                            m5541a(fileInputStream);
                            m5541a(fileOutputStream);
                            m5547b(file);
                        } catch (Throwable th) {
                            th = th;
                            m5541a(fileInputStream);
                            m5541a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        m5541a(fileInputStream);
                        m5541a(fileOutputStream);
                        throw th;
                    }
                }
                m5541a(fileInputStream2);
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
        m5541a(fileOutputStream);
        m5547b(file);
    }
}
