package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9980v;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;

/* renamed from: ge.d1 */
/* loaded from: classes6.dex */
public final class C9311d1 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9311d1 f21689c = new C9311d1();

    public C9311d1() {
        super(AbstractC9025a.m17633A(C9980v.f23426a));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo18332e(long[] jArr) {
        AbstractC9979u.m20294g(jArr, "<this>");
        return jArr.length;
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] mo18351r() {
        return new long[0];
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9306c1 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18373e(decoder.decodeLongElement(getDescriptor(), i10));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9306c1 mo18337k(long[] jArr) {
        AbstractC9979u.m20294g(jArr, "<this>");
        return new C9306c1(jArr);
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo18352u(InterfaceC9227d encoder, long[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeLongElement(getDescriptor(), i11, content[i11]);
        }
    }
}
