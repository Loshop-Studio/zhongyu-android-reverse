package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3867n;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p095k1.C5752a;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.t */
/* loaded from: classes2.dex */
public final class C5585t extends AbstractC3869p {

    /* renamed from: c */
    public static final C5577p f8661c = new C5577p(ToNumberPolicy.DOUBLE, 1);

    /* renamed from: a */
    public final C3841g f8662a;

    /* renamed from: b */
    public final InterfaceC3867n f8663b;

    public C5585t(C3841g c3841g, InterfaceC3867n interfaceC3867n) {
        this.f8662a = c3841g;
        this.f8663b = interfaceC3867n;
    }

    /* renamed from: e */
    public static Serializable m4908e(C6046a c6046a, JsonToken jsonToken) throws IOException {
        int i = AbstractC5583s.f8660a[jsonToken.ordinal()];
        if (i == 1) {
            c6046a.m5743a();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        c6046a.m5744b();
        return new LinkedTreeMap();
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        JsonToken jsonTokenM5764x = c6046a.m5764x();
        Object objM4908e = m4908e(c6046a, jsonTokenM5764x);
        if (objM4908e == null) {
            return m4909d(c6046a, jsonTokenM5764x);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c6046a.m5751k()) {
                String strM5758r = objM4908e instanceof Map ? c6046a.m5758r() : null;
                JsonToken jsonTokenM5764x2 = c6046a.m5764x();
                Serializable serializableM4908e = m4908e(c6046a, jsonTokenM5764x2);
                boolean z8 = serializableM4908e != null;
                if (serializableM4908e == null) {
                    serializableM4908e = m4909d(c6046a, jsonTokenM5764x2);
                }
                if (objM4908e instanceof List) {
                    ((List) objM4908e).add(serializableM4908e);
                } else {
                    ((Map) objM4908e).put(strM5758r, serializableM4908e);
                }
                if (z8) {
                    arrayDeque.addLast(objM4908e);
                    objM4908e = serializableM4908e;
                }
            } else {
                if (objM4908e instanceof List) {
                    c6046a.m5747e();
                } else {
                    c6046a.m5748f();
                }
                if (arrayDeque.isEmpty()) {
                    return objM4908e;
                }
                objM4908e = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        if (obj == null) {
            c6047b.m5775k();
            return;
        }
        Class<?> cls = obj.getClass();
        C3841g c3841g = this.f8662a;
        c3841g.getClass();
        AbstractC3869p abstractC3869pM2785d = c3841g.m2785d(new C5752a(cls));
        if (!(abstractC3869pM2785d instanceof C5585t)) {
            abstractC3869pM2785d.mo2780c(c6047b, obj);
        } else {
            c6047b.m5769c();
            c6047b.m5772f();
        }
    }

    /* renamed from: d */
    public final Serializable m4909d(C6046a c6046a, JsonToken jsonToken) {
        int i = AbstractC5583s.f8660a[jsonToken.ordinal()];
        if (i == 3) {
            return c6046a.m5762v();
        }
        if (i == 4) {
            return this.f8663b.readNumber(c6046a);
        }
        if (i == 5) {
            return Boolean.valueOf(c6046a.m5754n());
        }
        if (i == 6) {
            c6046a.m5760t();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }
}
