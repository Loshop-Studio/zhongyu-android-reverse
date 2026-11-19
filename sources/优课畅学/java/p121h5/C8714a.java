package p121h5;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.C8660c;

/* renamed from: h5.a */
/* loaded from: classes5.dex */
public final class C8714a {

    /* renamed from: a */
    public static final C8714a f16338a = new C8714a();

    /* renamed from: a */
    public final String m14216a(String fileName) throws IOException {
        AbstractC9133u.m16134h(fileName, "fileName");
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        File file = new File(fileName);
        if (!file.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            for (int i10 = fileInputStream.read(bArr); i10 > 0; i10 = fileInputStream.read(bArr)) {
                sb.append(new String(bArr, 0, i10, C8660c.f16206b));
            }
            fileInputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean m14217b(String path, String name, String content) throws Throwable {
        FileOutputStream fileOutputStream;
        AbstractC9133u.m16134h(path, "path");
        AbstractC9133u.m16134h(name, "name");
        AbstractC9133u.m16134h(content, "content");
        if (TextUtils.isEmpty(content)) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(path);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(path, name);
                if (file2.exists()) {
                    file2.delete();
                    file2.createNewFile();
                } else {
                    file2.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            byte[] bytes = content.getBytes(C8660c.f16206b);
            AbstractC9133u.m16129c(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (Exception e11) {
            fileOutputStream2 = fileOutputStream;
            e = e11;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
                return false;
            }
            fileOutputStream2.close();
            return false;
        } catch (Throwable th2) {
            fileOutputStream2 = fileOutputStream;
            th = th2;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }
}
