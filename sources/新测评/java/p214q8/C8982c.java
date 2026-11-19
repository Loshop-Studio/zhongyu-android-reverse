package p214q8;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.flatbuffers.FlatBufferBuilder;
import io.objectbox.BoxStore;
import io.objectbox.EntityInfo;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p236s8.AbstractC9350a;

/* renamed from: q8.c */
/* loaded from: classes5.dex */
public class C8982c {

    /* renamed from: a */
    public final byte[] f15319a;

    /* renamed from: b */
    public File f15320b;

    /* renamed from: c */
    public File f15321c;

    /* renamed from: d */
    public String f15322d;

    /* renamed from: f */
    public Object f15324f;

    /* renamed from: g */
    public Object f15325g;

    /* renamed from: h */
    public int f15326h;

    /* renamed from: i */
    public boolean f15327i;

    /* renamed from: j */
    public boolean f15328j;

    /* renamed from: k */
    public int f15329k;

    /* renamed from: l */
    public int f15330l;

    /* renamed from: m */
    public int f15331m;

    /* renamed from: n */
    public boolean f15332n;

    /* renamed from: o */
    public boolean f15333o;

    /* renamed from: p */
    public boolean f15334p;

    /* renamed from: q */
    public short f15335q;

    /* renamed from: r */
    public long f15336r;

    /* renamed from: e */
    public long f15323e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;

    /* renamed from: s */
    public final List f15337s = new ArrayList();

    public C8982c(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Model may not be null");
        }
        this.f15319a = Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: e */
    public static String m15054e(String str) {
        return str != null ? str : "objectbox";
    }

    /* renamed from: g */
    public static File m15055g(Object obj) {
        return new File(m15056h(obj), "objectbox");
    }

    /* renamed from: h */
    public static File m15056h(Object obj) throws NoSuchMethodException, SecurityException {
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
    public static File m15057j(File file, String str) {
        String strM15054e = m15054e(str);
        return file != null ? new File(file, strM15054e) : new File(strM15054e);
    }

    /* renamed from: a */
    public C8982c m15058a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Context may not be null");
        }
        this.f15324f = m15063i(obj);
        File fileM15055g = m15055g(obj);
        if (!fileM15055g.exists()) {
            fileM15055g.mkdir();
            if (!fileM15055g.exists()) {
                throw new RuntimeException("Could not init Android base dir at " + fileM15055g.getAbsolutePath());
            }
        }
        if (fileM15055g.isDirectory()) {
            this.f15321c = fileM15055g;
            this.f15327i = true;
            return this;
        }
        throw new RuntimeException("Android base dir is not a dir: " + fileM15055g.getAbsolutePath());
    }

    /* renamed from: b */
    public BoxStore m15059b() {
        if (this.f15320b == null) {
            String strM15054e = m15054e(this.f15322d);
            this.f15322d = strM15054e;
            this.f15320b = m15057j(this.f15321c, strM15054e);
        }
        m15061d();
        return new BoxStore(this);
    }

    /* renamed from: c */
    public byte[] m15060c(String str) {
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder();
        flatBufferBuilder.forceDefaults(true);
        int iCreateString = flatBufferBuilder.createString(str);
        AbstractC9350a.m15572l(flatBufferBuilder);
        AbstractC9350a.m15562b(flatBufferBuilder, iCreateString);
        AbstractC9350a.m15564d(flatBufferBuilder, this.f15323e);
        AbstractC9350a.m15563c(flatBufferBuilder, this.f15329k);
        AbstractC9350a.m15565e(flatBufferBuilder, this.f15330l);
        short s10 = this.f15335q;
        if (s10 != 0) {
            AbstractC9350a.m15569i(flatBufferBuilder, s10);
            long j10 = this.f15336r;
            if (j10 != 0) {
                AbstractC9350a.m15570j(flatBufferBuilder, j10);
            }
        }
        boolean z9 = this.f15332n;
        if (z9) {
            AbstractC9350a.m15567g(flatBufferBuilder, z9);
        }
        boolean z10 = this.f15334p;
        if (z10) {
            AbstractC9350a.m15568h(flatBufferBuilder, z10);
        }
        boolean z11 = this.f15333o;
        if (z11) {
            AbstractC9350a.m15566f(flatBufferBuilder, z11);
        }
        int i10 = this.f15326h;
        if (i10 != 0) {
            AbstractC9350a.m15561a(flatBufferBuilder, i10);
        }
        flatBufferBuilder.finish(AbstractC9350a.m15571k(flatBufferBuilder));
        return flatBufferBuilder.sizedByteArray();
    }

    /* renamed from: f */
    public void m15062f(EntityInfo entityInfo) {
        this.f15337s.add(entityInfo);
    }

    /* renamed from: i */
    public final Object m15063i(Object obj) {
        try {
            return obj.getClass().getMethod("getApplicationContext", null).invoke(obj, null);
        } catch (Exception e10) {
            throw new RuntimeException("context must be a valid Android Context", e10);
        }
    }

    /* renamed from: k */
    public C8982c m15064k(long j10) {
        this.f15323e = j10;
        return this;
    }

    /* renamed from: d */
    public final void m15061d() {
    }
}
