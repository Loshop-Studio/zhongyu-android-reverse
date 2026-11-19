package p049ce;

import de.AbstractC9025a;
import ee.AbstractC9125b;
import ee.AbstractC9127d;
import ee.AbstractC9136m;
import ee.AbstractC9137n;
import ee.C9124a;
import ee.InterfaceC9129f;
import ge.AbstractC9299b;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;

/* renamed from: ce.f */
/* loaded from: classes6.dex */
public final class C5436f extends AbstractC9299b {

    /* renamed from: a */
    public final InterfaceC10469c f3529a;

    /* renamed from: b */
    public List f3530b;

    /* renamed from: c */
    public final InterfaceC10773d f3531c;

    public C5436f(InterfaceC10469c baseClass) {
        AbstractC9979u.m20294g(baseClass, "baseClass");
        this.f3529a = baseClass;
        this.f3530b = AbstractC10978w.m24136n();
        this.f3531c = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23257d, new InterfaceC9529a() { // from class: ce.d
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C5436f.m2932h(this.f3527c);
            }
        });
    }

    /* renamed from: h */
    public static final InterfaceC9129f m2932h(final C5436f c5436f) {
        return AbstractC9125b.m17956b(AbstractC9136m.m17982h("kotlinx.serialization.Polymorphic", AbstractC9127d.a.f21300a, new InterfaceC9129f[0], new InterfaceC9540l() { // from class: ce.e
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C5436f.m2933i(this.f3528c, (C9124a) obj);
            }
        }), c5436f.mo2934e());
    }

    /* renamed from: i */
    public static final C10786q m2933i(C5436f c5436f, C9124a buildSerialDescriptor) {
        AbstractC9979u.m20294g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C9124a.m17947b(buildSerialDescriptor, "type", AbstractC9025a.m17635C(C9960c0.f23411a).getDescriptor(), null, false, 12, null);
        C9124a.m17947b(buildSerialDescriptor, "value", AbstractC9136m.m17983i("kotlinx.serialization.Polymorphic<" + c5436f.mo2934e().mo20277f() + '>', AbstractC9137n.a.f21330a, new InterfaceC9129f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.m17954h(c5436f.f3530b);
        return C10786q.f26013a;
    }

    @Override // ge.AbstractC9299b
    /* renamed from: e */
    public InterfaceC10469c mo2934e() {
        return this.f3529a;
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return (InterfaceC9129f) this.f3531c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo2934e() + ')';
    }
}
