package ge;

import ee.AbstractC9136m;
import ee.C9124a;
import ee.InterfaceC9129f;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p309qc.C10786q;

/* renamed from: ge.t1 */
/* loaded from: classes6.dex */
public final class C9382t1 extends AbstractC9393w0 {

    /* renamed from: c */
    public final InterfaceC9129f f21806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9382t1(final InterfaceC5432b keySerializer, final InterfaceC5432b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        AbstractC9979u.m20294g(keySerializer, "keySerializer");
        AbstractC9979u.m20294g(valueSerializer, "valueSerializer");
        this.f21806c = AbstractC9136m.m17979e("kotlin.Pair", new InterfaceC9129f[0], new InterfaceC9540l() { // from class: ge.s1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C9382t1.m18550g(keySerializer, valueSerializer, (C9124a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final C10786q m18550g(InterfaceC5432b interfaceC5432b, InterfaceC5432b interfaceC5432b2, C9124a buildClassSerialDescriptor) {
        AbstractC9979u.m20294g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C9124a.m17947b(buildClassSerialDescriptor, "first", interfaceC5432b.getDescriptor(), null, false, 12, null);
        C9124a.m17947b(buildClassSerialDescriptor, "second", interfaceC5432b2.getDescriptor(), null, false, 12, null);
        return C10786q.f26013a;
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21806c;
    }

    @Override // ge.AbstractC9393w0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo18423a(Pair pair) {
        AbstractC9979u.m20294g(pair, "<this>");
        return pair.m20051f();
    }

    @Override // ge.AbstractC9393w0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object mo18424c(Pair pair) {
        AbstractC9979u.m20294g(pair, "<this>");
        return pair.m20052g();
    }

    @Override // ge.AbstractC9393w0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Pair mo18425e(Object obj, Object obj2) {
        return AbstractC10776g.m22975a(obj, obj2);
    }
}
