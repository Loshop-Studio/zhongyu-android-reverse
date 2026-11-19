package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9973o;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;

/* renamed from: ge.b0 */
/* loaded from: classes6.dex */
public final class C9300b0 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9300b0 f21674c = new C9300b0();

    public C9300b0() {
        super(AbstractC9025a.m17666x(C9973o.f23423a));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo18332e(double[] dArr) {
        AbstractC9979u.m20294g(dArr, "<this>");
        return dArr.length;
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] mo18351r() {
        return new double[0];
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9295a0 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18342e(decoder.decodeDoubleElement(getDescriptor(), i10));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9295a0 mo18337k(double[] dArr) {
        AbstractC9979u.m20294g(dArr, "<this>");
        return new C9295a0(dArr);
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo18352u(InterfaceC9227d encoder, double[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeDoubleElement(getDescriptor(), i11, content[i11]);
        }
    }
}
