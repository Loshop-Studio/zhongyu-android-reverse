package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: m7.h0 */
/* loaded from: classes4.dex */
public final class C6140h0 extends AbstractC6122b1 {

    /* renamed from: a */
    public int[] f9807a;

    /* renamed from: b */
    public int f9808b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f9807a, this.f9808b);
        AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        int[] iArr = this.f9807a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            this.f9807a = iArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9808b;
    }
}
