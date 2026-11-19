package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9120h;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.h */
/* loaded from: classes5.dex */
public final class C10396h extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10396h f20698c = new C10396h();

    public C10396h() {
        super(AbstractC10124a.m18914z(C9120h.f17487a));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19306e(boolean[] zArr) {
        AbstractC9133u.m16133g(zArr, "<this>");
        return zArr.length;
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] mo19325r() {
        return new boolean[0];
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10391g builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19393e(decoder.decodeBooleanElement(getDescriptor(), i10));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C10391g mo19311k(boolean[] zArr) {
        AbstractC9133u.m16133g(zArr, "<this>");
        return new C10391g(zArr);
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19326u(InterfaceC10255d encoder, boolean[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeBooleanElement(getDescriptor(), i11, content[i11]);
        }
    }
}
