package p001a0;

import coil3.InterfaceC5328e;
import coil3.decode.InterfaceC5319a;
import kotlin.ExceptionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.InterruptibleKt;
import okio.BufferedSource;
import p018b0.AbstractC5087d;
import p018b0.AbstractC5089f;
import p018b0.InterfaceC5085b;
import p090e0.AbstractC7816n;
import p151k.AbstractC8243n;
import p151k.InterfaceC8239j;
import p183n.C9058g;
import p183n.C9060h;
import p183n.InterfaceC9073r;
import p207p.C9303p;
import p297y.AbstractC9925f;
import p297y.C9932m;
import p307z.AbstractC9976f;

/* renamed from: a0.d */
/* loaded from: classes3.dex */
public final class C0007d implements InterfaceC5319a {

    /* renamed from: a */
    public final InterfaceC9073r f5a;

    /* renamed from: b */
    public final C9932m f6b;

    /* renamed from: c */
    public final boolean f7c;

    /* renamed from: d */
    public final boolean f8d;

    /* renamed from: e */
    public final boolean f9e;

    public C0007d(InterfaceC9073r interfaceC9073r, C9932m c9932m, boolean z9, boolean z10, boolean z11) {
        this.f5a = interfaceC9073r;
        this.f6b = c9932m;
        this.f7c = z9;
        this.f8d = z10;
        this.f9e = z11;
    }

    /* renamed from: c */
    public static final C9058g m8c(C0007d c0007d) throws Throwable {
        Throwable th;
        InterfaceC5085b interfaceC5085bM2129a;
        float width;
        float height;
        BufferedSource bufferedSourceSource = c0007d.f5a.source();
        try {
            interfaceC5085bM2129a = AbstractC5087d.m2129a(bufferedSourceSource);
            if (bufferedSourceSource != null) {
                try {
                    bufferedSourceSource.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                th = null;
            }
        } catch (Throwable th3) {
            if (bufferedSourceSource != null) {
                try {
                    bufferedSourceSource.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            interfaceC5085bM2129a = null;
        }
        if (th != null) {
            throw th;
        }
        float[] fArrMo2126e = interfaceC5085bM2129a.mo2126e();
        if (!c0007d.f7c || fArrMo2126e == null) {
            width = interfaceC5085bM2129a.getWidth();
            height = interfaceC5085bM2129a.getHeight();
        } else {
            width = fArrMo2126e[2] - fArrMo2126e[0];
            height = fArrMo2126e[3] - fArrMo2126e[1];
        }
        if (c0007d.f9e && AbstractC9976f.m17261b(c0007d.f6b.m17116k())) {
            float fM2131a = AbstractC5089f.m2131a(c0007d.f6b.m17108c());
            if (width > 0.0f) {
                width *= fM2131a;
            }
            if (height > 0.0f) {
                height *= fM2131a;
            }
        }
        long jM14525b = C9060h.m14525b(width > 0.0f ? MathKt.roundToInt(width) : 512, height > 0.0f ? MathKt.roundToInt(height) : 512, c0007d.f6b.m17116k(), c0007d.f6b.m17115j(), AbstractC9925f.m17086d(c0007d.f6b));
        int iM12201c = AbstractC7816n.m12201c(jM14525b);
        int iM12202d = AbstractC7816n.m12202d(jM14525b);
        if (width > 0.0f && height > 0.0f) {
            float fM14528e = C9060h.m14528e(width, height, iM12201c, iM12202d, c0007d.f6b.m17115j());
            int i9 = (int) (fM14528e * width);
            iM12202d = (int) (fM14528e * height);
            if (fArrMo2126e == null) {
                interfaceC5085bM2129a.mo2125d(new float[]{0.0f, 0.0f, width, height});
            }
            iM12201c = i9;
        }
        interfaceC5085bM2129a.mo2122a("100%");
        interfaceC5085bM2129a.mo2124c("100%");
        interfaceC5085bM2129a.mo2123b(c0007d.f6b);
        InterfaceC8239j interfaceC8239jMo2127f = interfaceC5085bM2129a.mo2127f(iM12201c, iM12202d);
        if (c0007d.f8d) {
            interfaceC8239jMo2127f = AbstractC8243n.m13271d(AbstractC8243n.m13274g(interfaceC8239jMo2127f, 0, 0, 3, null), false, 1, null);
        }
        return new C9058g(interfaceC8239jMo2127f, c0007d.f8d);
    }

    @Override // coil3.decode.InterfaceC5319a
    /* renamed from: a */
    public Object mo9a(Continuation continuation) {
        return InterruptibleKt.runInterruptible(EmptyCoroutineContext.INSTANCE, new Function0() { // from class: a0.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0007d.m8c(this.f4a);
            }
        }, continuation);
    }

    /* renamed from: a0.d$a */
    public static final class a implements InterfaceC5319a.a {

        /* renamed from: a */
        public final boolean f10a;

        /* renamed from: b */
        public final boolean f11b;

        /* renamed from: c */
        public final boolean f12c;

        public a(boolean z9, boolean z10, boolean z11) {
            this.f10a = z9;
            this.f11b = z10;
            this.f12c = z11;
        }

        @Override // coil3.decode.InterfaceC5319a.a
        /* renamed from: a */
        public InterfaceC5319a mo10a(C9303p c9303p, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            if (m11b(c9303p)) {
                return new C0007d(c9303p.m15152c(), c9932m, this.f10a, this.f11b, this.f12c);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m11b(C9303p c9303p) {
            return Intrinsics.areEqual(c9303p.m15151b(), "image/svg+xml") || AbstractC0004a.m5a(C9060h.f15240a, c9303p.m15152c().source());
        }

        public /* synthetic */ a(boolean z9, boolean z10, boolean z11, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? true : z9, (i9 & 2) != 0 ? true : z10, (i9 & 4) != 0 ? false : z11);
        }
    }

    public /* synthetic */ C0007d(InterfaceC9073r interfaceC9073r, C9932m c9932m, boolean z9, boolean z10, boolean z11, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC9073r, c9932m, (i9 & 4) != 0 ? true : z9, (i9 & 8) != 0 ? true : z10, (i9 & 16) != 0 ? false : z11);
    }
}
