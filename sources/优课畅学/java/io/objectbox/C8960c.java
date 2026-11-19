package io.objectbox;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.flatbuffers.FlatBufferBuilder;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p200o6.AbstractC9530a;

/* renamed from: io.objectbox.c */
/* loaded from: classes5.dex */
public class C8960c {

    /* renamed from: a */
    public final byte[] f16901a;

    /* renamed from: b */
    public File f16902b;

    /* renamed from: c */
    public File f16903c;

    /* renamed from: d */
    public String f16904d;

    /* renamed from: f */
    public Object f16906f;

    /* renamed from: g */
    public Object f16907g;

    /* renamed from: h */
    public int f16908h;

    /* renamed from: i */
    public boolean f16909i;

    /* renamed from: j */
    public boolean f16910j;

    /* renamed from: k */
    public int f16911k;

    /* renamed from: l */
    public int f16912l;

    /* renamed from: m */
    public int f16913m;

    /* renamed from: n */
    public boolean f16914n;

    /* renamed from: o */
    public boolean f16915o;

    /* renamed from: p */
    public boolean f16916p;

    /* renamed from: q */
    public short f16917q;

    /* renamed from: r */
    public long f16918r;

    /* renamed from: e */
    public long f16905e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;

    /* renamed from: s */
    public final List f16919s = new ArrayList();

    public C8960c(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Model may not be null");
        }
        this.f16901a = Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: e */
    public static String m15426e(String str) {
        return str != null ? str : "objectbox";
    }

    /* renamed from: i */
    public static File m15427i(Object obj) {
        return new File(m15428j(obj), "objectbox");
    }

    /* renamed from: j */
    public static File m15428j(Object obj) throws NoSuchMethodException, SecurityException {
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

    /* renamed from: l */
    public static File m15429l(File file, String str) {
        String strM15426e = m15426e(str);
        return file != null ? new File(file, strM15426e) : new File(strM15426e);
    }

    /* renamed from: a */
    public C8960c m15430a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Context may not be null");
        }
        this.f16906f = m15437k(obj);
        File fileM15427i = m15427i(obj);
        if (!fileM15427i.exists()) {
            fileM15427i.mkdir();
            if (!fileM15427i.exists()) {
                throw new RuntimeException("Could not init Android base dir at " + fileM15427i.getAbsolutePath());
            }
        }
        if (fileM15427i.isDirectory()) {
            this.f16903c = fileM15427i;
            this.f16909i = true;
            return this;
        }
        throw new RuntimeException("Android base dir is not a dir: " + fileM15427i.getAbsolutePath());
    }

    /* renamed from: b */
    public BoxStore m15431b() {
        if (this.f16902b == null) {
            String strM15426e = m15426e(this.f16904d);
            this.f16904d = strM15426e;
            this.f16902b = m15429l(this.f16903c, strM15426e);
        }
        m15433d();
        return new BoxStore(this);
    }

    /* renamed from: c */
    public byte[] m15432c(String str) {
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder();
        flatBufferBuilder.forceDefaults(true);
        int iCreateString = flatBufferBuilder.createString(str);
        AbstractC9530a.m17761l(flatBufferBuilder);
        AbstractC9530a.m17751b(flatBufferBuilder, iCreateString);
        AbstractC9530a.m17753d(flatBufferBuilder, this.f16905e);
        AbstractC9530a.m17752c(flatBufferBuilder, this.f16911k);
        AbstractC9530a.m17754e(flatBufferBuilder, this.f16912l);
        short s10 = this.f16917q;
        if (s10 != 0) {
            AbstractC9530a.m17758i(flatBufferBuilder, s10);
            long j10 = this.f16918r;
            if (j10 != 0) {
                AbstractC9530a.m17759j(flatBufferBuilder, j10);
            }
        }
        boolean z10 = this.f16914n;
        if (z10) {
            AbstractC9530a.m17756g(flatBufferBuilder, z10);
        }
        boolean z11 = this.f16916p;
        if (z11) {
            AbstractC9530a.m17757h(flatBufferBuilder, z11);
        }
        boolean z12 = this.f16915o;
        if (z12) {
            AbstractC9530a.m17755f(flatBufferBuilder, z12);
        }
        int i10 = this.f16908h;
        if (i10 != 0) {
            AbstractC9530a.m17750a(flatBufferBuilder, i10);
        }
        flatBufferBuilder.finish(AbstractC9530a.m17760k(flatBufferBuilder));
        return flatBufferBuilder.sizedByteArray();
    }

    /* renamed from: d */
    public final void m15433d() {
    }

    /* renamed from: f */
    public C8960c m15434f(int i10) {
        this.f16908h = i10;
        return this;
    }

    /* renamed from: g */
    public C8960c m15435g(File file) {
        if (this.f16904d != null) {
            throw new IllegalArgumentException("Already has name, cannot assign directory");
        }
        if (!this.f16909i && this.f16903c != null) {
            throw new IllegalArgumentException("Already has base directory, cannot assign directory");
        }
        this.f16902b = file;
        return this;
    }

    /* renamed from: h */
    public void m15436h(EntityInfo entityInfo) {
        this.f16919s.add(entityInfo);
    }

    /* renamed from: k */
    public final Object m15437k(Object obj) {
        try {
            return obj.getClass().getMethod("getApplicationContext", null).invoke(obj, null);
        } catch (Exception e10) {
            throw new RuntimeException("context must be a valid Android Context", e10);
        }
    }

    /* renamed from: m */
    public C8960c m15438m(long j10) {
        this.f16905e = j10;
        return this;
    }
}
