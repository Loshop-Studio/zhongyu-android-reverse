package p107j3;

import java.util.Arrays;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p102i3.C2679l;
import p102i3.InterfaceC2673f;
import p107j3.AbstractC2696c;
import p128o2.C2919l;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;

/* renamed from: j3.a */
/* loaded from: classes.dex */
public abstract class AbstractC2694a<S extends AbstractC2696c<?>> {

    /* renamed from: a */
    @Nullable
    private S[] f10654a;

    /* renamed from: b */
    private int f10655b;

    /* renamed from: c */
    private int f10656c;

    /* renamed from: d */
    @Nullable
    private InterfaceC2673f<Integer> f10657d;

    @NotNull
    /* renamed from: f */
    protected final S m9015f() {
        S s3;
        InterfaceC2673f<Integer> interfaceC2673f;
        synchronized (this) {
            S[] sArr = (S[]) m9018k();
            if (sArr == null) {
                sArr = (S[]) mo8987h(2);
                this.f10654a = sArr;
            } else if (m9017j() >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C2769l.m9240d(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                this.f10654a = (S[]) ((AbstractC2696c[]) objArrCopyOf);
                sArr = (S[]) ((AbstractC2696c[]) objArrCopyOf);
            }
            int i4 = this.f10656c;
            do {
                s3 = sArr[i4];
                if (s3 == null) {
                    s3 = (S) mo8986g();
                    sArr[i4] = s3;
                }
                i4++;
                if (i4 >= sArr.length) {
                    i4 = 0;
                }
            } while (!s3.mo8995a(this));
            this.f10656c = i4;
            this.f10655b = m9017j() + 1;
            interfaceC2673f = this.f10657d;
        }
        if (interfaceC2673f != null) {
            C2679l.m8999a(interfaceC2673f, 1);
        }
        return s3;
    }

    @NotNull
    /* renamed from: g */
    protected abstract S mo8986g();

    @NotNull
    /* renamed from: h */
    protected abstract S[] mo8987h(int i4);

    /* renamed from: i */
    protected final void m9016i(@NotNull S s3) {
        InterfaceC2673f<Integer> interfaceC2673f;
        int i4;
        InterfaceC3012d<C2925r>[] interfaceC3012dArrMo8996b;
        synchronized (this) {
            this.f10655b = m9017j() - 1;
            interfaceC2673f = this.f10657d;
            i4 = 0;
            if (m9017j() == 0) {
                this.f10656c = 0;
            }
            interfaceC3012dArrMo8996b = s3.mo8996b(this);
        }
        int length = interfaceC3012dArrMo8996b.length;
        while (i4 < length) {
            InterfaceC3012d<C2925r> interfaceC3012d = interfaceC3012dArrMo8996b[i4];
            i4++;
            if (interfaceC3012d != null) {
                C2925r c2925r = C2925r.f11415a;
                C2919l.a aVar = C2919l.f11409a;
                interfaceC3012d.resumeWith(C2919l.m9989a(c2925r));
            }
        }
        if (interfaceC2673f == null) {
            return;
        }
        C2679l.m8999a(interfaceC2673f, -1);
    }

    /* renamed from: j */
    protected final int m9017j() {
        return this.f10655b;
    }

    @Nullable
    /* renamed from: k */
    protected final S[] m9018k() {
        return this.f10654a;
    }
}
