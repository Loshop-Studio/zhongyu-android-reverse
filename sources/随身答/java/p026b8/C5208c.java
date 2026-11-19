package p026b8;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.flatbuffers.FlatBufferBuilder;
import io.objectbox.BoxStore;
import io.objectbox.EntityInfo;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p087d8.AbstractC7788a;

/* renamed from: b8.c */
/* loaded from: classes5.dex */
public class C5208c {

    /* renamed from: a */
    public final byte[] f2377a;

    /* renamed from: b */
    public File f2378b;

    /* renamed from: c */
    public File f2379c;

    /* renamed from: d */
    public String f2380d;

    /* renamed from: f */
    public Object f2382f;

    /* renamed from: g */
    public Object f2383g;

    /* renamed from: h */
    public int f2384h;

    /* renamed from: i */
    public boolean f2385i;

    /* renamed from: j */
    public boolean f2386j;

    /* renamed from: k */
    public int f2387k;

    /* renamed from: l */
    public int f2388l;

    /* renamed from: m */
    public int f2389m;

    /* renamed from: n */
    public boolean f2390n;

    /* renamed from: o */
    public boolean f2391o;

    /* renamed from: p */
    public boolean f2392p;

    /* renamed from: q */
    public short f2393q;

    /* renamed from: r */
    public long f2394r;

    /* renamed from: e */
    public long f2381e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;

    /* renamed from: s */
    public final List f2395s = new ArrayList();

    public C5208c(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Model may not be null");
        }
        this.f2377a = Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: e */
    public static String m2265e(String str) {
        return str != null ? str : "objectbox";
    }

    /* renamed from: g */
    public static File m2266g(Object obj) {
        return new File(m2267h(obj), "objectbox");
    }

    /* renamed from: h */
    public static File m2267h(Object obj) throws NoSuchMethodException, SecurityException {
        try {
            Method method = obj.getClass().getMethod("getFilesDir", null);
            File file = (File) method.invoke(obj, null);
            if (file == null) {
                System.err.println("getFilesDir() returned null - retrying once...");
                file = (File) method.invoke(obj, null);
            }
            if (file == null) {
                throw new IllegalStateException("Android files dir is null");
            }
            if (file.exists()) {
                return file;
            }
            throw new IllegalStateException("Android files dir does not exist");
        } catch (Exception e10) {
            throw new RuntimeException("Could not init with given Android context (must be sub class of android.content.Context)", e10);
        }
    }

    /* renamed from: j */
    public static File m2268j(File file, String str) {
        String strM2265e = m2265e(str);
        return file != null ? new File(file, strM2265e) : new File(strM2265e);
    }

    /* renamed from: a */
    public C5208c m2269a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Context may not be null");
        }
        this.f2382f = m2274i(obj);
        File fileM2266g = m2266g(obj);
        if (!fileM2266g.exists()) {
            fileM2266g.mkdir();
            if (!fileM2266g.exists()) {
                throw new RuntimeException("Could not init Android base dir at " + fileM2266g.getAbsolutePath());
            }
        }
        if (fileM2266g.isDirectory()) {
            this.f2379c = fileM2266g;
            this.f2385i = true;
            return this;
        }
        throw new RuntimeException("Android base dir is not a dir: " + fileM2266g.getAbsolutePath());
    }

    /* renamed from: b */
    public BoxStore m2270b() {
        if (this.f2378b == null) {
            String strM2265e = m2265e(this.f2380d);
            this.f2380d = strM2265e;
            this.f2378b = m2268j(this.f2379c, strM2265e);
        }
        m2272d();
        return new BoxStore(this);
    }

    /* renamed from: c */
    public byte[] m2271c(String str) {
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder();
        flatBufferBuilder.forceDefaults(true);
        int iCreateString = flatBufferBuilder.createString(str);
        AbstractC7788a.m12123l(flatBufferBuilder);
        AbstractC7788a.m12113b(flatBufferBuilder, iCreateString);
        AbstractC7788a.m12115d(flatBufferBuilder, this.f2381e);
        AbstractC7788a.m12114c(flatBufferBuilder, this.f2387k);
        AbstractC7788a.m12116e(flatBufferBuilder, this.f2388l);
        short s9 = this.f2393q;
        if (s9 != 0) {
            AbstractC7788a.m12120i(flatBufferBuilder, s9);
            long j9 = this.f2394r;
            if (j9 != 0) {
                AbstractC7788a.m12121j(flatBufferBuilder, j9);
            }
        }
        boolean z9 = this.f2390n;
        if (z9) {
            AbstractC7788a.m12118g(flatBufferBuilder, z9);
        }
        boolean z10 = this.f2392p;
        if (z10) {
            AbstractC7788a.m12119h(flatBufferBuilder, z10);
        }
        boolean z11 = this.f2391o;
        if (z11) {
            AbstractC7788a.m12117f(flatBufferBuilder, z11);
        }
        int i9 = this.f2384h;
        if (i9 != 0) {
            AbstractC7788a.m12112a(flatBufferBuilder, i9);
        }
        flatBufferBuilder.finish(AbstractC7788a.m12122k(flatBufferBuilder));
        return flatBufferBuilder.sizedByteArray();
    }

    /* renamed from: f */
    public void m2273f(EntityInfo entityInfo) {
        this.f2395s.add(entityInfo);
    }

    /* renamed from: i */
    public final Object m2274i(Object obj) {
        try {
            return obj.getClass().getMethod("getApplicationContext", null).invoke(obj, null);
        } catch (Exception e10) {
            throw new RuntimeException("context must be a valid Android Context", e10);
        }
    }

    /* renamed from: k */
    public C5208c m2275k(long j9) {
        this.f2381e = j9;
        return this;
    }

    /* renamed from: d */
    public final void m2272d() {
    }
}
