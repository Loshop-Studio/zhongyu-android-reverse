package p087f3;

import kotlin.jvm.internal.C2769l;
import kotlinx.coroutines.scheduling.AbstractRunnableC2820i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2909b;
import p142q2.InterfaceC3012d;

/* renamed from: f3.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC2599t0<T> extends AbstractRunnableC2820i {

    /* renamed from: c */
    public int f10281c;

    public AbstractC2599t0(int i4) {
        this.f10281c = i4;
    }

    /* renamed from: a */
    public void mo8612a(@Nullable Object obj, @NotNull Throwable th) {
    }

    @NotNull
    /* renamed from: b */
    public abstract InterfaceC3012d<T> mo8613b();

    @Nullable
    /* renamed from: c */
    public Throwable mo8614c(@Nullable Object obj) {
        C2613y c2613y = obj instanceof C2613y ? (C2613y) obj : null;
        if (c2613y == null) {
            return null;
        }
        return c2613y.f10316a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public <T> T mo8615d(@Nullable Object obj) {
        return obj;
    }

    /* renamed from: e */
    public final void m8668e(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C2909b.m9982a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C2769l.m9239c(th);
        C2553g0.m8561a(mo8613b().getContext(), new C2569k0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    /* renamed from: i */
    public abstract Object mo8616i();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[Catch: all -> 0x00b0, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x00b0, blocks: (B:3:0x0002, B:5:0x0019, B:23:0x007d, B:25:0x0083, B:33:0x00a6, B:36:0x00af, B:35:0x00ac, B:8:0x001f, B:10:0x002d, B:12:0x0035, B:15:0x0041, B:17:0x0047, B:21:0x0079, B:19:0x005e, B:20:0x006c), top: B:46:0x0002, inners: #2 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.j r0 = r10.f10841b
            q2.d r1 = r10.mo8613b()     // Catch: java.lang.Throwable -> Lb0
            kotlinx.coroutines.internal.e r1 = (kotlinx.coroutines.internal.C2790e) r1     // Catch: java.lang.Throwable -> Lb0
            q2.d<T> r2 = r1.f10755e     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r1 = r1.f10757g     // Catch: java.lang.Throwable -> Lb0
            q2.g r3 = r2.getContext()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r1 = kotlinx.coroutines.internal.C2809x.m9359c(r3, r1)     // Catch: java.lang.Throwable -> Lb0
            kotlinx.coroutines.internal.t r4 = kotlinx.coroutines.internal.C2809x.f10789a     // Catch: java.lang.Throwable -> Lb0
            r5 = 0
            if (r1 == r4) goto L1e
            f3.k2 r4 = p087f3.C2541d0.m8540e(r2, r3, r1)     // Catch: java.lang.Throwable -> Lb0
            goto L1f
        L1e:
            r4 = r5
        L1f:
            q2.g r6 = r2.getContext()     // Catch: java.lang.Throwable -> La3
            java.lang.Object r7 = r10.mo8616i()     // Catch: java.lang.Throwable -> La3
            java.lang.Throwable r8 = r10.mo8614c(r7)     // Catch: java.lang.Throwable -> La3
            if (r8 != 0) goto L3e
            int r9 = r10.f10281c     // Catch: java.lang.Throwable -> La3
            boolean r9 = p087f3.C2602u0.m8729b(r9)     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto L3e
            f3.m1$b r9 = p087f3.InterfaceC2578m1.f10268P     // Catch: java.lang.Throwable -> La3
            q2.g$b r6 = r6.get(r9)     // Catch: java.lang.Throwable -> La3
            f3.m1 r6 = (p087f3.InterfaceC2578m1) r6     // Catch: java.lang.Throwable -> La3
            goto L3f
        L3e:
            r6 = r5
        L3f:
            if (r6 == 0) goto L5c
            boolean r9 = r6.isActive()     // Catch: java.lang.Throwable -> La3
            if (r9 != 0) goto L5c
            java.util.concurrent.CancellationException r6 = r6.mo8632u()     // Catch: java.lang.Throwable -> La3
            r10.mo8612a(r7, r6)     // Catch: java.lang.Throwable -> La3
            o2.l$a r7 = p128o2.C2919l.f11409a     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = p128o2.C2920m.m9993a(r6)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = p128o2.C2919l.m9989a(r6)     // Catch: java.lang.Throwable -> La3
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La3
            goto L79
        L5c:
            if (r8 == 0) goto L6c
            o2.l$a r6 = p128o2.C2919l.f11409a     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = p128o2.C2920m.m9993a(r8)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = p128o2.C2919l.m9989a(r6)     // Catch: java.lang.Throwable -> La3
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La3
            goto L79
        L6c:
            java.lang.Object r6 = r10.mo8615d(r7)     // Catch: java.lang.Throwable -> La3
            o2.l$a r7 = p128o2.C2919l.f11409a     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = p128o2.C2919l.m9989a(r6)     // Catch: java.lang.Throwable -> La3
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La3
        L79:
            o2.r r2 = p128o2.C2925r.f11415a     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L83
            boolean r4 = r4.m8586y0()     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L86
        L83:
            kotlinx.coroutines.internal.C2809x.m9357a(r3, r1)     // Catch: java.lang.Throwable -> Lb0
        L86:
            o2.l$a r1 = p128o2.C2919l.f11409a     // Catch: java.lang.Throwable -> L90
            r0.mo9420q()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = p128o2.C2919l.m9989a(r2)     // Catch: java.lang.Throwable -> L90
            goto L9b
        L90:
            r0 = move-exception
            o2.l$a r1 = p128o2.C2919l.f11409a
            java.lang.Object r0 = p128o2.C2920m.m9993a(r0)
            java.lang.Object r0 = p128o2.C2919l.m9989a(r0)
        L9b:
            java.lang.Throwable r0 = p128o2.C2919l.m9990b(r0)
            r10.m8668e(r5, r0)
            goto Lcf
        La3:
            r2 = move-exception
            if (r4 == 0) goto Lac
            boolean r4 = r4.m8586y0()     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto Laf
        Lac:
            kotlinx.coroutines.internal.C2809x.m9357a(r3, r1)     // Catch: java.lang.Throwable -> Lb0
        Laf:
            throw r2     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r1 = move-exception
            o2.l$a r2 = p128o2.C2919l.f11409a     // Catch: java.lang.Throwable -> Lbd
            r0.mo9420q()     // Catch: java.lang.Throwable -> Lbd
            o2.r r0 = p128o2.C2925r.f11415a     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = p128o2.C2919l.m9989a(r0)     // Catch: java.lang.Throwable -> Lbd
            goto Lc8
        Lbd:
            r0 = move-exception
            o2.l$a r2 = p128o2.C2919l.f11409a
            java.lang.Object r0 = p128o2.C2920m.m9993a(r0)
            java.lang.Object r0 = p128o2.C2919l.m9989a(r0)
        Lc8:
            java.lang.Throwable r0 = p128o2.C2919l.m9990b(r0)
            r10.m8668e(r1, r0)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087f3.AbstractC2599t0.run():void");
    }
}
