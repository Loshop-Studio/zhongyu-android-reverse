package io.objectbox;

import android.content.Context;
import com.google.flatbuffers.C3821a;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: io.objectbox.b */
/* loaded from: classes3.dex */
public final class C5698b {

    /* renamed from: a */
    public final byte[] f8928a;

    /* renamed from: b */
    public File f8929b;

    /* renamed from: c */
    public File f8930c;

    /* renamed from: d */
    public String f8931d;

    /* renamed from: f */
    public Object f8933f;

    /* renamed from: g */
    public boolean f8934g;

    /* renamed from: e */
    public long f8932e = 1048576;

    /* renamed from: h */
    public final ArrayList f8935h = new ArrayList();

    public C5698b(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Model may not be null");
        }
        this.f8928a = Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: a */
    public final void m5043a(Context context) throws NoSuchMethodException, SecurityException {
        if (context == null) {
            throw new NullPointerException("Context may not be null");
        }
        try {
            this.f8933f = context.getClass().getMethod("getApplicationContext", null).invoke(context, null);
            try {
                Method method = context.getClass().getMethod("getFilesDir", null);
                File file = (File) method.invoke(context, null);
                if (file == null) {
                    System.err.println("getFilesDir() returned null - retrying once...");
                    file = (File) method.invoke(context, null);
                }
                if (file == null) {
                    throw new IllegalStateException("Android files dir is null");
                }
                if (!file.exists()) {
                    throw new IllegalStateException("Android files dir does not exist");
                }
                File file2 = new File(file, "objectbox");
                if (!file2.exists()) {
                    file2.mkdir();
                    if (!file2.exists()) {
                        throw new RuntimeException("Could not init Android base dir at " + file2.getAbsolutePath());
                    }
                }
                if (file2.isDirectory()) {
                    this.f8930c = file2;
                    this.f8934g = true;
                } else {
                    throw new RuntimeException("Android base dir is not a dir: " + file2.getAbsolutePath());
                }
            } catch (Exception e) {
                throw new RuntimeException("Could not init with given Android context (must be sub class of android.content.Context)", e);
            }
        } catch (Exception e4) {
            throw new RuntimeException("context must be a valid Android Context", e4);
        }
    }

    /* renamed from: b */
    public final BoxStore m5044b() {
        if (this.f8929b == null) {
            String str = this.f8931d;
            if (str == null) {
                str = "objectbox";
            }
            this.f8931d = str;
            File file = this.f8930c;
            this.f8929b = file != null ? new File(file, str) : new File(str);
        }
        return new BoxStore(this);
    }

    /* renamed from: c */
    public final byte[] m5045c(String str) {
        C3821a c3821a = new C3821a();
        c3821a.f2965l = true;
        int iM2770e = c3821a.m2770e(str);
        c3821a.m2777l(13);
        c3821a.m2767b(0, iM2770e);
        long j7 = this.f8932e;
        if (c3821a.f2965l || j7 != 0) {
            c3821a.m2773h(8, 0);
            ByteBuffer byteBuffer = c3821a.f2954a;
            int i = c3821a.f2955b - 8;
            c3821a.f2955b = i;
            byteBuffer.putLong(i, j7);
            c3821a.m2776k(2);
        }
        int i8 = 0;
        c3821a.m2766a(3, i8);
        c3821a.m2766a(4, i8);
        int iM2771f = c3821a.m2771f();
        c3821a.m2773h(c3821a.f2956c, 4);
        c3821a.m2773h(4, 0);
        c3821a.m2774i((c3821a.m2772g() - iM2771f) + 4);
        c3821a.f2954a.position(c3821a.f2955b);
        c3821a.f2960g = true;
        return c3821a.m2775j();
    }

    /* renamed from: d */
    public final void m5046d(EntityInfo entityInfo) {
        this.f8935h.add(entityInfo);
    }
}
