package p210jc;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.flatbuffers.FlatBufferBuilder;
import io.objectbox.BoxStore;
import io.objectbox.EntityInfo;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lc.AbstractC10177a;

/* renamed from: jc.c */
/* loaded from: classes6.dex */
public class C9712c {

    /* renamed from: a */
    public final byte[] f22605a;

    /* renamed from: b */
    public File f22606b;

    /* renamed from: c */
    public File f22607c;

    /* renamed from: d */
    public String f22608d;

    /* renamed from: f */
    public Object f22610f;

    /* renamed from: g */
    public Object f22611g;

    /* renamed from: h */
    public int f22612h;

    /* renamed from: i */
    public boolean f22613i;

    /* renamed from: j */
    public boolean f22614j;

    /* renamed from: k */
    public int f22615k;

    /* renamed from: l */
    public int f22616l;

    /* renamed from: m */
    public int f22617m;

    /* renamed from: n */
    public boolean f22618n;

    /* renamed from: o */
    public boolean f22619o;

    /* renamed from: p */
    public boolean f22620p;

    /* renamed from: q */
    public short f22621q;

    /* renamed from: r */
    public long f22622r;

    /* renamed from: e */
    public long f22609e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;

    /* renamed from: s */
    public final List f22623s = new ArrayList();

    public C9712c(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Model may not be null");
        }
        this.f22605a = Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: e */
    public static String m19237e(String str) {
        return str != null ? str : "objectbox";
    }

    /* renamed from: h */
    public static File m19238h(Object obj) {
        return new File(m19239i(obj), "objectbox");
    }

    /* renamed from: i */
    public static File m19239i(Object obj) throws NoSuchMethodException, SecurityException {
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

    /* renamed from: k */
    public static File m19240k(File file, String str) {
        String strM19237e = m19237e(str);
        return file != null ? new File(file, strM19237e) : new File(strM19237e);
    }

    /* renamed from: a */
    public C9712c m19241a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Context may not be null");
        }
        this.f22610f = m19247j(obj);
        File fileM19238h = m19238h(obj);
        if (!fileM19238h.exists()) {
            fileM19238h.mkdir();
            if (!fileM19238h.exists()) {
                throw new RuntimeException("Could not init Android base dir at " + fileM19238h.getAbsolutePath());
            }
        }
        if (fileM19238h.isDirectory()) {
            this.f22607c = fileM19238h;
            this.f22613i = true;
            return this;
        }
        throw new RuntimeException("Android base dir is not a dir: " + fileM19238h.getAbsolutePath());
    }

    /* renamed from: b */
    public BoxStore m19242b() {
        if (this.f22606b == null) {
            String strM19237e = m19237e(this.f22608d);
            this.f22608d = strM19237e;
            this.f22606b = m19240k(this.f22607c, strM19237e);
        }
        m19244d();
        return new BoxStore(this);
    }

    /* renamed from: c */
    public byte[] m19243c(String str) {
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder();
        flatBufferBuilder.forceDefaults(true);
        int iCreateString = flatBufferBuilder.createString(str);
        AbstractC10177a.m21223l(flatBufferBuilder);
        AbstractC10177a.m21213b(flatBufferBuilder, iCreateString);
        AbstractC10177a.m21215d(flatBufferBuilder, this.f22609e);
        AbstractC10177a.m21214c(flatBufferBuilder, this.f22615k);
        AbstractC10177a.m21216e(flatBufferBuilder, this.f22616l);
        short s10 = this.f22621q;
        if (s10 != 0) {
            AbstractC10177a.m21220i(flatBufferBuilder, s10);
            long j10 = this.f22622r;
            if (j10 != 0) {
                AbstractC10177a.m21221j(flatBufferBuilder, j10);
            }
        }
        boolean z10 = this.f22618n;
        if (z10) {
            AbstractC10177a.m21218g(flatBufferBuilder, z10);
        }
        boolean z11 = this.f22620p;
        if (z11) {
            AbstractC10177a.m21219h(flatBufferBuilder, z11);
        }
        boolean z12 = this.f22619o;
        if (z12) {
            AbstractC10177a.m21217f(flatBufferBuilder, z12);
        }
        int i10 = this.f22612h;
        if (i10 != 0) {
            AbstractC10177a.m21212a(flatBufferBuilder, i10);
        }
        flatBufferBuilder.finish(AbstractC10177a.m21222k(flatBufferBuilder));
        return flatBufferBuilder.sizedByteArray();
    }

    /* renamed from: f */
    public C9712c m19245f(File file) {
        if (this.f22608d != null) {
            throw new IllegalArgumentException("Already has name, cannot assign directory");
        }
        if (!this.f22613i && this.f22607c != null) {
            throw new IllegalArgumentException("Already has base directory, cannot assign directory");
        }
        this.f22606b = file;
        return this;
    }

    /* renamed from: g */
    public void m19246g(EntityInfo entityInfo) {
        this.f22623s.add(entityInfo);
    }

    /* renamed from: j */
    public final Object m19247j(Object obj) {
        try {
            return obj.getClass().getMethod("getApplicationContext", null).invoke(obj, null);
        } catch (Exception e10) {
            throw new RuntimeException("context must be a valid Android Context", e10);
        }
    }

    /* renamed from: l */
    public C9712c m19248l(long j10) {
        this.f22609e = j10;
        return this;
    }

    /* renamed from: d */
    public final void m19244d() {
    }
}
