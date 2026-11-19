package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: m7.m0 */
/* loaded from: classes4.dex */
public final class C6155m0 extends AbstractC6122b1 {

    /* renamed from: a */
    public long[] f9827a;

    /* renamed from: b */
    public int f9828b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f9827a, this.f9828b);
        AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        long[] jArr = this.f9827a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
            this.f9827a = jArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9828b;
    }
}
