package p070b.p074b.p105b.p106a0.p108z;

import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.C0782w;
import p070b.p074b.p105b.InterfaceC0772m;
import p070b.p074b.p105b.InterfaceC0780u;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p106a0.C0717g;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p112z.InterfaceC0785a;

/* renamed from: b.b.b.a0.z.d */
/* loaded from: classes.dex */
public final class C0739d implements InterfaceC0784y {

    /* renamed from: b */
    public final C0717g f4270b;

    public C0739d(C0717g c0717g) {
        this.f4270b = c0717g;
    }

    @Override // p070b.p074b.p105b.InterfaceC0784y
    /* renamed from: a */
    public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
        InterfaceC0785a interfaceC0785a = (InterfaceC0785a) c0757a.f4386a.getAnnotation(InterfaceC0785a.class);
        if (interfaceC0785a == null) {
            return null;
        }
        return (AbstractC0783x<T>) m2383b(this.f4270b, c0768i, c0757a, interfaceC0785a);
    }

    /* renamed from: b */
    public AbstractC0783x<?> m2383b(C0717g c0717g, C0768i c0768i, C0757a<?> c0757a, InterfaceC0785a interfaceC0785a) {
        AbstractC0783x<?> c0748m;
        Object objMo2365a = c0717g.m2366a(new C0757a(interfaceC0785a.value())).mo2365a();
        if (objMo2365a instanceof AbstractC0783x) {
            c0748m = (AbstractC0783x) objMo2365a;
        } else if (objMo2365a instanceof InterfaceC0784y) {
            c0748m = ((InterfaceC0784y) objMo2365a).mo2367a(c0768i, c0757a);
        } else {
            boolean z = objMo2365a instanceof InterfaceC0780u;
            if (!z && !(objMo2365a instanceof InterfaceC0772m)) {
                StringBuilder sbM2079g = C0561a.m2079g("Invalid attempt to bind an instance of ");
                sbM2079g.append(objMo2365a.getClass().getName());
                sbM2079g.append(" as a @JsonAdapter for ");
                sbM2079g.append(c0757a.toString());
                sbM2079g.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sbM2079g.toString());
            }
            c0748m = new C0748m<>(z ? (InterfaceC0780u) objMo2365a : null, objMo2365a instanceof InterfaceC0772m ? (InterfaceC0772m) objMo2365a : null, c0768i, c0757a, null);
        }
        return (c0748m == null || !interfaceC0785a.nullSafe()) ? c0748m : new C0782w(c0748m);
    }
}
