package p246s8;

import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import p089e8.InterfaceC8375c;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8809v;
import p257t8.AbstractC10124a;
import p268u8.AbstractC10206b;
import p268u8.AbstractC10208d;
import p268u8.AbstractC10217m;
import p268u8.AbstractC10218n;
import p268u8.C10205a;
import p268u8.InterfaceC10210f;
import p290w8.AbstractC10366b;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: s8.f */
/* loaded from: classes5.dex */
public final class C10056f extends AbstractC10366b {

    /* renamed from: a */
    public final InterfaceC8375c f20108a;

    /* renamed from: b */
    public List f20109b;

    /* renamed from: c */
    public final InterfaceC8724d f20110c;

    public C10056f(InterfaceC8375c baseClass) {
        AbstractC9133u.m16133g(baseClass, "baseClass");
        this.f20108a = baseClass;
        this.f20109b = AbstractC8809v.m14771n();
        this.f20110c = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17344b, new InterfaceC10559a() { // from class: s8.d
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C10056f.m18758h(this.f20106a);
            }
        });
    }

    /* renamed from: h */
    public static final InterfaceC10210f m18758h(final C10056f c10056f) {
        return AbstractC10206b.m19084b(AbstractC10217m.m19110h("kotlinx.serialization.Polymorphic", AbstractC10208d.a.f20361a, new InterfaceC10210f[0], new InterfaceC10570l() { // from class: s8.e
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C10056f.m18759i(this.f20107a, (C10205a) obj);
            }
        }), c10056f.mo18760e());
    }

    /* renamed from: i */
    public static final C8736p m18759i(C10056f c10056f, C10205a buildSerialDescriptor) {
        AbstractC9133u.m16133g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C10205a.m19075b(buildSerialDescriptor, "type", AbstractC10124a.m18887H(C9114c0.f17482a).getDescriptor(), null, false, 12, null);
        C10205a.m19075b(buildSerialDescriptor, "value", AbstractC10217m.m19111i("kotlinx.serialization.Polymorphic<" + c10056f.mo18760e().mo13672g() + '>', AbstractC10218n.a.f20391a, new InterfaceC10210f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.m19082h(c10056f.f20109b);
        return C8736p.f16368a;
    }

    @Override // p290w8.AbstractC10366b
    /* renamed from: e */
    public InterfaceC8375c mo18760e() {
        return this.f20108a;
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return (InterfaceC10210f) this.f20110c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo18760e() + ')';
    }
}
