package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import com.google.gson.internal.AbstractC3848e;
import com.google.gson.internal.C3845b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p095k1.C5752a;

/* renamed from: g1.d */
/* loaded from: classes2.dex */
public final class C5550d implements InterfaceC3870q {

    /* renamed from: a */
    public final /* synthetic */ int f8605a;

    /* renamed from: b */
    public final C3845b f8606b;

    public /* synthetic */ C5550d(C3845b c3845b, int i) {
        this.f8605a = i;
        this.f8606b = c3845b;
    }

    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.f8605a;
        C3845b c3845b = this.f8606b;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = c5752a.f9104b;
                Class cls2 = c5752a.f9103a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC3848e.m2801b(Collection.class.isAssignableFrom(cls2));
                Type typeM2809j = AbstractC3848e.m2809j(type, cls2, AbstractC3848e.m2806g(type, cls2, Collection.class), new HashMap());
                cls = typeM2809j instanceof ParameterizedType ? ((ParameterizedType) typeM2809j).getActualTypeArguments()[0] : Object.class;
                return new C5547c(new C5575o(c3841g, c3841g.m2785d(new C5752a(cls)), cls), c3845b.m2797c(c5752a, false));
            default:
                Type type2 = c5752a.f9104b;
                Class cls3 = c5752a.f9103a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC3848e.m2801b(Map.class.isAssignableFrom(cls3));
                    Type typeM2809j2 = AbstractC3848e.m2809j(type2, cls3, AbstractC3848e.m2806g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeM2809j2 instanceof ParameterizedType ? ((ParameterizedType) typeM2809j2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C5575o(this, new C5575o(c3841g, (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC5558f1.f8613c : c3841g.m2785d(new C5752a(type3)), type3), new C5575o(c3841g, c3841g.m2785d(new C5752a(type4)), type4), c3845b.m2797c(c5752a, false));
        }
    }
}
