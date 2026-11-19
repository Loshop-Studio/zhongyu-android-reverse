package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: m7.s */
/* loaded from: classes4.dex */
public final class C6172s extends AbstractC6122b1 {

    /* renamed from: a */
    public double[] f9860a;

    /* renamed from: b */
    public int f9861b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f9860a, this.f9861b);
        AbstractC5830k.m5329f(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        double[] dArr = this.f9860a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            AbstractC5830k.m5329f(dArrCopyOf, "copyOf(...)");
            this.f9860a = dArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9861b;
    }
}
