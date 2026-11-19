package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9974p;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;

/* renamed from: ge.j0 */
/* loaded from: classes6.dex */
public final class C9340j0 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9340j0 f21747c = new C9340j0();

    public C9340j0() {
        super(AbstractC9025a.m17667y(C9974p.f23424a));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo18332e(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        return fArr.length;
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] mo18351r() {
        return new float[0];
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9335i0 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18449e(decoder.decodeFloatElement(getDescriptor(), i10));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9335i0 mo18337k(float[] fArr) {
        AbstractC9979u.m20294g(fArr, "<this>");
        return new C9335i0(fArr);
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo18352u(InterfaceC9227d encoder, float[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeFloatElement(getDescriptor(), i11, content[i11]);
        }
    }
}
