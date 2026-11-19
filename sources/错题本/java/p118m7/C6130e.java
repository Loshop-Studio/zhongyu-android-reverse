package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: m7.e */
/* loaded from: classes4.dex */
public final class C6130e extends AbstractC6122b1 {

    /* renamed from: a */
    public boolean[] f9789a;

    /* renamed from: b */
    public int f9790b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f9789a, this.f9790b);
        AbstractC5830k.m5329f(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        boolean[] zArr = this.f9789a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            AbstractC5830k.m5329f(zArrCopyOf, "copyOf(...)");
            this.f9789a = zArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9790b;
    }
}
