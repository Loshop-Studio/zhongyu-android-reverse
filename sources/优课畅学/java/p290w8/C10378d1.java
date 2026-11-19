package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9134v;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.d1 */
/* loaded from: classes5.dex */
public final class C10378d1 extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10378d1 f20662c = new C10378d1();

    public C10378d1() {
        super(AbstractC10124a.m18885F(C9134v.f17497a));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19306e(long[] jArr) {
        AbstractC9133u.m16133g(jArr, "<this>");
        return jArr.length;
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] mo19325r() {
        return new long[0];
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10373c1 builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19347e(decoder.decodeLongElement(getDescriptor(), i10));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C10373c1 mo19311k(long[] jArr) {
        AbstractC9133u.m16133g(jArr, "<this>");
        return new C10373c1(jArr);
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19326u(InterfaceC10255d encoder, long[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeLongElement(getDescriptor(), i11, content[i11]);
        }
    }
}
