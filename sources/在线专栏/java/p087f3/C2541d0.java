package p087f3;

import kotlin.coroutines.jvm.internal.InterfaceC2749e;
import kotlinx.coroutines.scheduling.C2813b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3013e;
import p142q2.InterfaceC3015g;

/* renamed from: f3.d0 */
/* loaded from: classes.dex */
public final class C2541d0 {

    /* renamed from: a */
    private static final boolean f10231a;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r0.equals("") != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C2806u.m9346d(r0)
            if (r0 == 0) goto L53
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L21
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L33
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r0 = 0
            goto L54
        L21:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L2a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L53:
            r0 = 1
        L54:
            p087f3.C2541d0.f10231a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087f3.C2541d0.<clinit>():void");
    }

    @NotNull
    /* renamed from: a */
    public static final AbstractC2545e0 m8536a() {
        return f10231a ? C2813b.f10824h : C2604v.f10300c;
    }

    @Nullable
    /* renamed from: b */
    public static final String m8537b(@NotNull InterfaceC3015g interfaceC3015g) {
        return null;
    }

    @NotNull
    /* renamed from: c */
    public static final InterfaceC3015g m8538c(@NotNull InterfaceC2557h0 interfaceC2557h0, @NotNull InterfaceC3015g interfaceC3015g) {
        InterfaceC3015g interfaceC3015gPlus = interfaceC2557h0.mo2809e().plus(interfaceC3015g);
        return (interfaceC3015gPlus == C2605v0.m8750a() || interfaceC3015gPlus.get(InterfaceC3013e.f11675R) != null) ? interfaceC3015gPlus : interfaceC3015gPlus.plus(C2605v0.m8750a());
    }

    @Nullable
    /* renamed from: d */
    public static final C2571k2<?> m8539d(@NotNull InterfaceC2749e interfaceC2749e) {
        while (!(interfaceC2749e instanceof C2596s0) && (interfaceC2749e = interfaceC2749e.getCallerFrame()) != null) {
            if (interfaceC2749e instanceof C2571k2) {
                return (C2571k2) interfaceC2749e;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static final C2571k2<?> m8540e(@NotNull InterfaceC3012d<?> interfaceC3012d, @NotNull InterfaceC3015g interfaceC3015g, @Nullable Object obj) {
        if (!(interfaceC3012d instanceof InterfaceC2749e)) {
            return null;
        }
        if (!(interfaceC3015g.get(C2575l2.f10260a) != null)) {
            return null;
        }
        C2571k2<?> c2571k2M8539d = m8539d((InterfaceC2749e) interfaceC3012d);
        if (c2571k2M8539d != null) {
            c2571k2M8539d.m8587z0(interfaceC3015g, obj);
        }
        return c2571k2M8539d;
    }
}
