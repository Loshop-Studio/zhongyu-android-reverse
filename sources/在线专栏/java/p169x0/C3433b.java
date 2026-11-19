package p169x0;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p173y0.C3486a;

/* renamed from: x0.b */
/* loaded from: classes.dex */
public final class C3433b {

    /* renamed from: a */
    final Executor f12014a;

    /* renamed from: b */
    final Executor f12015b;

    /* renamed from: c */
    final AbstractC3457z f12016c;

    /* renamed from: d */
    final AbstractC3444m f12017d;

    /* renamed from: e */
    final InterfaceC3451t f12018e;

    /* renamed from: f */
    final InterfaceC3442k f12019f;

    /* renamed from: g */
    final String f12020g;

    /* renamed from: h */
    final int f12021h;

    /* renamed from: i */
    final int f12022i;

    /* renamed from: j */
    final int f12023j;

    /* renamed from: k */
    final int f12024k;

    /* renamed from: l */
    private final boolean f12025l;

    /* renamed from: x0.b$a */
    public static final class a {

        /* renamed from: a */
        Executor f12026a;

        /* renamed from: b */
        AbstractC3457z f12027b;

        /* renamed from: c */
        AbstractC3444m f12028c;

        /* renamed from: d */
        Executor f12029d;

        /* renamed from: e */
        InterfaceC3451t f12030e;

        /* renamed from: f */
        InterfaceC3442k f12031f;

        /* renamed from: g */
        String f12032g;

        /* renamed from: h */
        int f12033h = 4;

        /* renamed from: i */
        int f12034i = 0;

        /* renamed from: j */
        int f12035j = Integer.MAX_VALUE;

        /* renamed from: k */
        int f12036k = 20;

        /* renamed from: a */
        public C3433b m10460a() {
            return new C3433b(this);
        }
    }

    /* renamed from: x0.b$b */
    public interface b {
        /* renamed from: a */
        C3433b m10461a();
    }

    C3433b(a aVar) {
        Executor executor = aVar.f12026a;
        if (executor == null) {
            this.f12014a = m10448a();
        } else {
            this.f12014a = executor;
        }
        Executor executor2 = aVar.f12029d;
        if (executor2 == null) {
            this.f12025l = true;
            this.f12015b = m10448a();
        } else {
            this.f12025l = false;
            this.f12015b = executor2;
        }
        AbstractC3457z abstractC3457z = aVar.f12027b;
        if (abstractC3457z == null) {
            this.f12016c = AbstractC3457z.m10549c();
        } else {
            this.f12016c = abstractC3457z;
        }
        AbstractC3444m abstractC3444m = aVar.f12028c;
        if (abstractC3444m == null) {
            this.f12017d = AbstractC3444m.m10498c();
        } else {
            this.f12017d = abstractC3444m;
        }
        InterfaceC3451t interfaceC3451t = aVar.f12030e;
        if (interfaceC3451t == null) {
            this.f12018e = new C3486a();
        } else {
            this.f12018e = interfaceC3451t;
        }
        this.f12021h = aVar.f12033h;
        this.f12022i = aVar.f12034i;
        this.f12023j = aVar.f12035j;
        this.f12024k = aVar.f12036k;
        this.f12019f = aVar.f12031f;
        this.f12020g = aVar.f12032g;
    }

    /* renamed from: a */
    private Executor m10448a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    /* renamed from: b */
    public String m10449b() {
        return this.f12020g;
    }

    /* renamed from: c */
    public InterfaceC3442k m10450c() {
        return this.f12019f;
    }

    /* renamed from: d */
    public Executor m10451d() {
        return this.f12014a;
    }

    /* renamed from: e */
    public AbstractC3444m m10452e() {
        return this.f12017d;
    }

    /* renamed from: f */
    public int m10453f() {
        return this.f12023j;
    }

    /* renamed from: g */
    public int m10454g() {
        return Build.VERSION.SDK_INT == 23 ? this.f12024k / 2 : this.f12024k;
    }

    /* renamed from: h */
    public int m10455h() {
        return this.f12022i;
    }

    /* renamed from: i */
    public int m10456i() {
        return this.f12021h;
    }

    /* renamed from: j */
    public InterfaceC3451t m10457j() {
        return this.f12018e;
    }

    /* renamed from: k */
    public Executor m10458k() {
        return this.f12015b;
    }

    /* renamed from: l */
    public AbstractC3457z m10459l() {
        return this.f12016c;
    }
}
