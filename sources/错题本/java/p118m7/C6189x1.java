package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5442r;

/* renamed from: m7.x1 */
/* loaded from: classes4.dex */
public final class C6189x1 extends AbstractC6122b1 {

    /* renamed from: a */
    public short[] f9891a;

    /* renamed from: b */
    public int f9892b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f9891a, this.f9892b);
        AbstractC5830k.m5329f(sArrCopyOf, "copyOf(...)");
        return new C5442r(sArrCopyOf);
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        short[] sArr = this.f9891a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            AbstractC5830k.m5329f(sArrCopyOf, "copyOf(...)");
            this.f9891a = sArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9892b;
    }
}
