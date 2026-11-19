package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.InterfaceC3854k;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.c */
/* loaded from: classes2.dex */
public final class C5547c extends AbstractC3869p {

    /* renamed from: a */
    public final /* synthetic */ int f8602a = 0;

    /* renamed from: b */
    public final Object f8603b;

    /* renamed from: c */
    public final Object f8604c;

    public C5547c(C5575o c5575o, InterfaceC3854k interfaceC3854k) {
        this.f8603b = c5575o;
        this.f8604c = interfaceC3854k;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        switch (this.f8602a) {
            case 0:
                if (c6046a.m5764x() == JsonToken.NULL) {
                    c6046a.m5760t();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC3854k) this.f8604c).mo671a();
                c6046a.m5743a();
                while (c6046a.m5751k()) {
                    collection.add(((C5575o) this.f8603b).f8653c.mo2779b(c6046a));
                }
                c6046a.m5747e();
                return collection;
            default:
                Class cls = (Class) this.f8603b;
                Object objMo2779b = ((C5588u0) this.f8604c).f8675c.mo2779b(c6046a);
                if (objMo2779b == null || cls.isInstance(objMo2779b)) {
                    return objMo2779b;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objMo2779b.getClass().getName() + "; at path " + c6046a.m5750h(true));
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        switch (this.f8602a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c6047b.m5768b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C5575o) this.f8603b).mo2780c(c6047b, it.next());
                    }
                    c6047b.m5771e();
                    break;
                } else {
                    c6047b.m5775k();
                    break;
                }
            default:
                ((C5588u0) this.f8604c).f8675c.mo2780c(c6047b, obj);
                break;
        }
    }

    public C5547c(C5588u0 c5588u0, Class cls) {
        this.f8604c = c5588u0;
        this.f8603b = cls;
    }
}
