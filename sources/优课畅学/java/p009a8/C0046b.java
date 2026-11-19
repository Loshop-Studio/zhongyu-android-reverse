package p009a8;

import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8383k;

/* renamed from: a8.b */
/* loaded from: classes5.dex */
public final class C0046b implements InterfaceC0049e {

    /* renamed from: a */
    public Object f111a;

    @Override // p009a8.InterfaceC0049e, p009a8.InterfaceC0048d
    public Object getValue(Object obj, InterfaceC8383k property) {
        AbstractC9133u.m16133g(property, "property");
        Object obj2 = this.f111a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // p009a8.InterfaceC0049e
    public void setValue(Object obj, InterfaceC8383k property, Object value) {
        AbstractC9133u.m16133g(property, "property");
        AbstractC9133u.m16133g(value, "value");
        this.f111a = value;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.f111a != null) {
            str = "value=" + this.f111a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
