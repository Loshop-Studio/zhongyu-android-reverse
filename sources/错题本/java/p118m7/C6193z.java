package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: m7.z */
/* loaded from: classes4.dex */
public final class C6193z extends AbstractC6122b1 {

    /* renamed from: a */
    public float[] f9900a;

    /* renamed from: b */
    public int f9901b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f9900a, this.f9901b);
        AbstractC5830k.m5329f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        float[] fArr = this.f9900a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            AbstractC5830k.m5329f(fArrCopyOf, "copyOf(...)");
            this.f9900a = fArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9901b;
    }
}
