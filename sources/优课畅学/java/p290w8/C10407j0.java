package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9128p;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.j0 */
/* loaded from: classes5.dex */
public final class C10407j0 extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10407j0 f20720c = new C10407j0();

    public C10407j0() {
        super(AbstractC10124a.m18883D(C9128p.f17495a));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19306e(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        return fArr.length;
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] mo19325r() {
        return new float[0];
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10402i0 builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19423e(decoder.decodeFloatElement(getDescriptor(), i10));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C10402i0 mo19311k(float[] fArr) {
        AbstractC9133u.m16133g(fArr, "<this>");
        return new C10402i0(fArr);
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19326u(InterfaceC10255d encoder, float[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeFloatElement(getDescriptor(), i11, content[i11]);
        }
    }
}
