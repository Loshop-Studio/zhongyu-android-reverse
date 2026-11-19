package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9127o;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.b0 */
/* loaded from: classes5.dex */
public final class C10367b0 extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10367b0 f20647c = new C10367b0();

    public C10367b0() {
        super(AbstractC10124a.m18882C(C9127o.f17494a));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19306e(double[] dArr) {
        AbstractC9133u.m16133g(dArr, "<this>");
        return dArr.length;
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] mo19325r() {
        return new double[0];
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10362a0 builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19316e(decoder.decodeDoubleElement(getDescriptor(), i10));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C10362a0 mo19311k(double[] dArr) {
        AbstractC9133u.m16133g(dArr, "<this>");
        return new C10362a0(dArr);
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19326u(InterfaceC10255d encoder, double[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeDoubleElement(getDescriptor(), i11, content[i11]);
        }
    }
}
