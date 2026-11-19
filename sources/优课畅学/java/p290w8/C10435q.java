package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9122j;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.q */
/* loaded from: classes5.dex */
public final class C10435q extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10435q f20756c = new C10435q();

    public C10435q() {
        super(AbstractC10124a.m18881B(C9122j.f17489a));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19306e(char[] cArr) {
        AbstractC9133u.m16133g(cArr, "<this>");
        return cArr.length;
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] mo19325r() {
        return new char[0];
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10431p builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19483e(decoder.decodeCharElement(getDescriptor(), i10));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C10431p mo19311k(char[] cArr) {
        AbstractC9133u.m16133g(cArr, "<this>");
        return new C10431p(cArr);
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19326u(InterfaceC10255d encoder, char[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeCharElement(getDescriptor(), i11, content[i11]);
        }
    }
}
