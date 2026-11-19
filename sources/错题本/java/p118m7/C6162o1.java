package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5435k;

/* renamed from: m7.o1 */
/* loaded from: classes4.dex */
public final class C6162o1 extends AbstractC6122b1 {

    /* renamed from: a */
    public byte[] f9841a;

    /* renamed from: b */
    public int f9842b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f9841a, this.f9842b);
        AbstractC5830k.m5329f(bArrCopyOf, "copyOf(...)");
        return new C5435k(bArrCopyOf);
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        byte[] bArr = this.f9841a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            AbstractC5830k.m5329f(bArrCopyOf, "copyOf(...)");
            this.f9841a = bArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9842b;
    }
}
