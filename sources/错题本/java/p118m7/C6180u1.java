package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5439o;

/* renamed from: m7.u1 */
/* loaded from: classes4.dex */
public final class C6180u1 extends AbstractC6122b1 {

    /* renamed from: a */
    public long[] f9872a;

    /* renamed from: b */
    public int f9873b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f9872a, this.f9873b);
        AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
        return new C5439o(jArrCopyOf);
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        long[] jArr = this.f9872a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
            this.f9872a = jArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9873b;
    }
}
