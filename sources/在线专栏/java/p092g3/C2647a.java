package p092g3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1037f;
import p087f3.C2591q1;
import p087f3.C2605v0;
import p087f3.InterfaceC2572l;
import p128o2.C2925r;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3470l;

/* renamed from: g3.a */
/* loaded from: classes.dex */
public final class C2647a extends AbstractC2648b {

    @Nullable
    private volatile C2647a _immediate;

    /* renamed from: b */
    @NotNull
    private final Handler f10463b;

    /* renamed from: c */
    @Nullable
    private final String f10464c;

    /* renamed from: d */
    private final boolean f10465d;

    /* renamed from: e */
    @NotNull
    private final C2647a f10466e;

    /* renamed from: g3.a$a */
    public static final class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2572l f10467a;

        /* renamed from: b */
        final /* synthetic */ C2647a f10468b;

        public a(InterfaceC2572l interfaceC2572l, C2647a c2647a) {
            this.f10467a = interfaceC2572l;
            this.f10468b = c2647a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10467a.mo8588f(this.f10468b, C2925r.f11415a);
        }
    }

    /* renamed from: g3.a$b */
    static final class b extends AbstractC2770m implements InterfaceC3470l<Throwable, C2925r> {

        /* renamed from: b */
        final /* synthetic */ Runnable f10470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f10470b = runnable;
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
            invoke2(th);
            return C2925r.f11415a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            C2647a.this.f10463b.removeCallbacks(this.f10470b);
        }
    }

    private C2647a(Handler handler, String str, boolean z3) {
        super(null);
        this.f10463b = handler;
        this.f10464c = str;
        this.f10465d = z3;
        this._immediate = z3 ? this : null;
        C2647a c2647a = this._immediate;
        if (c2647a == null) {
            c2647a = new C2647a(handler, str, true);
            this._immediate = c2647a;
            C2925r c2925r = C2925r.f11415a;
        }
        this.f10466e = c2647a;
    }

    /* renamed from: O */
    private final void m8857O(InterfaceC3015g interfaceC3015g, Runnable runnable) {
        C2591q1.m8650c(interfaceC3015g, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C2605v0.m8751b().mo2905J(interfaceC3015g, runnable);
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: J */
    public void mo2905J(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Runnable runnable) {
        if (this.f10463b.post(runnable)) {
            return;
        }
        m8857O(interfaceC3015g, runnable);
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: K */
    public boolean mo2906K(@NotNull InterfaceC3015g interfaceC3015g) {
        return (this.f10465d && C2769l.m9237a(Looper.myLooper(), this.f10463b.getLooper())) ? false : true;
    }

    @Override // p087f3.AbstractC2612x1
    @NotNull
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public C2647a mo8757L() {
        return this.f10466e;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C2647a) && ((C2647a) obj).f10463b == this.f10463b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f10463b);
    }

    @Override // p087f3.AbstractC2612x1, p087f3.AbstractC2545e0
    @NotNull
    public String toString() {
        String strM8758M = m8758M();
        if (strM8758M != null) {
            return strM8758M;
        }
        String string = this.f10464c;
        if (string == null) {
            string = this.f10463b.toString();
        }
        return this.f10465d ? C2769l.m9248l(string, ".immediate") : string;
    }

    @Override // p087f3.InterfaceC2590q0
    /* renamed from: y */
    public void mo8518y(long j4, @NotNull InterfaceC2572l<? super C2925r> interfaceC2572l) {
        a aVar = new a(interfaceC2572l, this);
        if (this.f10463b.postDelayed(aVar, C1037f.m4824e(j4, 4611686018427387903L))) {
            interfaceC2572l.mo8590h(new b(aVar));
        } else {
            m8857O(interfaceC2572l.getContext(), aVar);
        }
    }

    public /* synthetic */ C2647a(Handler handler, String str, int i4, C2764g c2764g) {
        this(handler, (i4 & 2) != 0 ? null : str);
    }

    public C2647a(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}
