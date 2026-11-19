package p318r5;

import anet.channel.request.Request;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.Deflater;

/* renamed from: r5.g0 */
/* loaded from: classes5.dex */
public abstract class AbstractC10863g0 {
    /* renamed from: a */
    public static String m23448a(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            C10903x c10903x = new C10903x(1024);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    break;
                }
                c10903x.m23696a(bArr, i10);
            }
            if (c10903x.m23698c() == 0) {
                m23450c(fileInputStream);
                return "";
            }
            String str = new String(c10903x.m23697b(), Request.DEFAULT_CHARSET);
            m23450c(fileInputStream);
            return str;
        } catch (FileNotFoundException unused3) {
            fileInputStream2 = fileInputStream;
            AbstractC10861f1.m23441m("hmsSdk", "getInfoFromFile(): No files need to be read");
            m23450c(fileInputStream2);
            return "";
        } catch (IOException unused4) {
            fileInputStream2 = fileInputStream;
            AbstractC10861f1.m23441m("hmsSdk", "getInfoFromFile(): stream.read or new string exception");
            m23450c(fileInputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            m23450c(fileInputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public static String m23449b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    String string = byteArrayOutputStream.toString(Request.DEFAULT_CHARSET);
                    m23450c(byteArrayOutputStream);
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            m23450c(byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public static void m23450c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                AbstractC10861f1.m23441m("hmsSdk", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    /* renamed from: d */
    public static void m23451d(File file, String str) throws Throwable {
        String str2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes(Request.DEFAULT_CHARSET));
                    fileOutputStream.flush();
                } catch (FileNotFoundException unused) {
                    fileOutputStream2 = fileOutputStream;
                    str2 = "saveInfoToFile(): No files need to be read";
                    fileOutputStream = fileOutputStream2;
                    AbstractC10861f1.m23441m("hmsSdk", str2);
                    m23450c(fileOutputStream);
                } catch (IOException unused2) {
                    fileOutputStream2 = fileOutputStream;
                    str2 = "saveInfoToFile(): io exc from write info to file!";
                    fileOutputStream = fileOutputStream2;
                    AbstractC10861f1.m23441m("hmsSdk", str2);
                    m23450c(fileOutputStream);
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                m23450c(fileOutputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
            m23450c(fileOutputStream2);
            throw th;
        }
        m23450c(fileOutputStream);
    }

    /* renamed from: e */
    public static void m23452e(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                AbstractC10861f1.m23441m("hmsSdk", "closeStream(): Exception: close OutputStream error!");
            }
        }
    }

    /* renamed from: f */
    public static void m23453f(HttpURLConnection httpURLConnection) throws IOException {
        try {
            httpURLConnection.getInputStream().close();
        } catch (Exception unused) {
            AbstractC10861f1.m23441m("hmsSdk", "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission");
        }
        httpURLConnection.disconnect();
        AbstractC10861f1.m23430b("hmsSdk", " connHttp disconnect");
    }

    /* renamed from: g */
    public static byte[] m23454g(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        m23452e(byteArrayOutputStream);
        return byteArray;
    }
}
