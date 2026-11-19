package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5437m;

/* renamed from: m7.r1 */
/* loaded from: classes4.dex */
public final class C6171r1 extends AbstractC6122b1 {

    /* renamed from: a */
    public int[] f9858a;

    /* renamed from: b */
    public int f9859b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f9858a, this.f9859b);
        AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
        return new C5437m(iArrCopyOf);
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        int[] iArr = this.f9858a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            this.f9858a = iArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9859b;
    }
}
