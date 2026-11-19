package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9966h;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;

/* renamed from: ge.h */
/* loaded from: classes6.dex */
public final class C9329h extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9329h f21725c = new C9329h();

    public C9329h() {
        super(AbstractC9025a.m17663u(C9966h.f23416a));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo18332e(boolean[] zArr) {
        AbstractC9979u.m20294g(zArr, "<this>");
        return zArr.length;
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] mo18351r() {
        return new boolean[0];
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9324g builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18419e(decoder.decodeBooleanElement(getDescriptor(), i10));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9324g mo18337k(boolean[] zArr) {
        AbstractC9979u.m20294g(zArr, "<this>");
        return new C9324g(zArr);
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo18352u(InterfaceC9227d encoder, boolean[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeBooleanElement(getDescriptor(), i11, content[i11]);
        }
    }
}
