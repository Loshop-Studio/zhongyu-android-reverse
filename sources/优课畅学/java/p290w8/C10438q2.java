package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9110a0;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.q2 */
/* loaded from: classes5.dex */
public final class C10438q2 extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10438q2 f20759c = new C10438q2();

    public C10438q2() {
        super(AbstractC10124a.m18886G(C9110a0.f17476a));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19306e(short[] sArr) {
        AbstractC9133u.m16133g(sArr, "<this>");
        return sArr.length;
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] mo19325r() {
        return new short[0];
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10434p2 builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19491e(decoder.decodeShortElement(getDescriptor(), i10));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C10434p2 mo19311k(short[] sArr) {
        AbstractC9133u.m16133g(sArr, "<this>");
        return new C10434p2(sArr);
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19326u(InterfaceC10255d encoder, short[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeShortElement(getDescriptor(), i11, content[i11]);
        }
    }
}
