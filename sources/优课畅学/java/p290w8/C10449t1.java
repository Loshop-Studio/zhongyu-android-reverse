package p290w8;

import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10217m;
import p268u8.C10205a;
import p268u8.InterfaceC10210f;
import p300x7.InterfaceC10570l;

/* renamed from: w8.t1 */
/* loaded from: classes5.dex */
public final class C10449t1 extends AbstractC10460w0 {

    /* renamed from: c */
    public final InterfaceC10210f f20779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10449t1(final InterfaceC10052b keySerializer, final InterfaceC10052b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        AbstractC9133u.m16133g(keySerializer, "keySerializer");
        AbstractC9133u.m16133g(valueSerializer, "valueSerializer");
        this.f20779c = AbstractC10217m.m19107e("kotlin.Pair", new InterfaceC10210f[0], new InterfaceC10570l() { // from class: w8.s1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C10449t1.m19524g(keySerializer, valueSerializer, (C10205a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final C8736p m19524g(InterfaceC10052b interfaceC10052b, InterfaceC10052b interfaceC10052b2, C10205a buildClassSerialDescriptor) {
        AbstractC9133u.m16133g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C10205a.m19075b(buildClassSerialDescriptor, "first", interfaceC10052b.getDescriptor(), null, false, 12, null);
        C10205a.m19075b(buildClassSerialDescriptor, "second", interfaceC10052b2.getDescriptor(), null, false, 12, null);
        return C8736p.f16368a;
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20779c;
    }

    @Override // p290w8.AbstractC10460w0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo19397a(Pair pair) {
        AbstractC9133u.m16133g(pair, "<this>");
        return pair.m15906e();
    }

    @Override // p290w8.AbstractC10460w0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object mo19398c(Pair pair) {
        AbstractC9133u.m16133g(pair, "<this>");
        return pair.m15907g();
    }

    @Override // p290w8.AbstractC10460w0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Pair mo19399e(Object obj, Object obj2) {
        return AbstractC8726f.m14230a(obj, obj2);
    }
}
