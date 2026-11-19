package p146f7;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* renamed from: f7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9203b {
    /* renamed from: a */
    public static void m18102a(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e10) {
            AbstractC9204c.m18111a(e10);
        }
    }

    /* renamed from: b */
    public static boolean m18103b(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            }
            file.delete();
        }
        return file.mkdirs();
    }

    /* renamed from: c */
    public static boolean m18104c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m18103b(new File(str));
    }

    /* renamed from: d */
    public static boolean m18105d(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            file.delete();
            return true;
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m18105d(file2);
            }
        }
        file.delete();
        return true;
    }

    /* renamed from: e */
    public static boolean m18106e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m18105d(new File(str));
    }

    /* renamed from: f */
    public static byte[] m18107f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m18110i(inputStream, byteArrayOutputStream);
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: g */
    public static byte[] m18108g(Object obj) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException e10) {
            e = e10;
            byteArrayOutputStream = null;
            objectOutputStream = null;
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = null;
        }
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m18102a(objectOutputStream);
                    m18102a(byteArrayOutputStream);
                    return byteArray;
                } catch (IOException e11) {
                    e = e11;
                    AbstractC9204c.m18111a(e);
                    m18102a(objectOutputStream);
                    m18102a(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                m18102a(objectOutputStream2);
                m18102a(byteArrayOutputStream);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            objectOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            m18102a(objectOutputStream2);
            m18102a(byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: h */
    public static Object m18109h(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        Object object = null;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
        } catch (Exception e10) {
            e = e10;
            objectInputStream = null;
            byteArrayInputStream = null;
        } catch (Throwable th2) {
            byteArrayInputStream = null;
            th = th2;
            objectInputStream = null;
        }
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                try {
                    object = objectInputStream.readObject();
                } catch (Exception e11) {
                    e = e11;
                    AbstractC9204c.m18111a(e);
                    m18102a(objectInputStream);
                    m18102a(byteArrayInputStream);
                    return object;
                }
            } catch (Throwable th3) {
                th = th3;
                m18102a(objectInputStream);
                m18102a(byteArrayInputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            objectInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            objectInputStream = null;
            m18102a(objectInputStream);
            m18102a(byteArrayInputStream);
            throw th;
        }
        m18102a(objectInputStream);
        m18102a(byteArrayInputStream);
        return object;
    }

    /* renamed from: i */
    public static void m18110i(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }
}
