package p063g1;

import com.google.gson.AbstractC3863j;
import com.google.gson.AbstractC3869p;
import com.google.gson.C3843i;
import com.google.gson.C3864k;
import com.google.gson.C3865l;
import com.google.gson.C3866m;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.n */
/* loaded from: classes2.dex */
public class C5573n extends AbstractC3869p {

    /* renamed from: a */
    public static final C5573n f8650a = new C5573n();

    private C5573n() {
    }

    /* renamed from: d */
    public static AbstractC3863j m4905d(C6046a c6046a, JsonToken jsonToken) {
        int i = AbstractC5571m.f8649a[jsonToken.ordinal()];
        if (i == 3) {
            return new C3866m(c6046a.m5762v());
        }
        if (i == 4) {
            return new C3866m(new LazilyParsedNumber(c6046a.m5762v()));
        }
        if (i == 5) {
            return new C3866m(Boolean.valueOf(c6046a.m5754n()));
        }
        if (i == 6) {
            c6046a.m5760t();
            return C3864k.f3056a;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    /* renamed from: e */
    public static AbstractC3863j m4906e(C6046a c6046a, JsonToken jsonToken) throws IOException {
        int i = AbstractC5571m.f8649a[jsonToken.ordinal()];
        if (i == 1) {
            c6046a.m5743a();
            return new C3843i();
        }
        if (i != 2) {
            return null;
        }
        c6046a.m5744b();
        return new C3865l();
    }

    /* renamed from: f */
    public static void m4907f(C6047b c6047b, AbstractC3863j abstractC3863j) throws IOException {
        if (abstractC3863j == null || (abstractC3863j instanceof C3864k)) {
            c6047b.m5775k();
            return;
        }
        boolean z8 = abstractC3863j instanceof C3866m;
        if (z8) {
            if (!z8) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC3863j);
            }
            C3866m c3866m = (C3866m) abstractC3863j;
            Serializable serializable = c3866m.f3058a;
            if (serializable instanceof Number) {
                c6047b.m5782r(c3866m.m2818b());
                return;
            } else if (serializable instanceof Boolean) {
                c6047b.m5784t(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c3866m.m2819c()));
                return;
            } else {
                c6047b.m5783s(c3866m.m2819c());
                return;
            }
        }
        boolean z9 = abstractC3863j instanceof C3843i;
        if (z9) {
            c6047b.m5768b();
            if (!z9) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC3863j);
            }
            ArrayList arrayList = ((C3843i) abstractC3863j).f3013a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                m4907f(c6047b, (AbstractC3863j) obj);
            }
            c6047b.m5771e();
            return;
        }
        boolean z10 = abstractC3863j instanceof C3865l;
        if (!z10) {
            throw new IllegalArgumentException("Couldn't write " + abstractC3863j.getClass());
        }
        c6047b.m5769c();
        if (!z10) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC3863j);
        }
        for (Map.Entry entry : ((C3865l) abstractC3863j).f3057a.entrySet()) {
            c6047b.m5773g((String) entry.getKey());
            m4907f(c6047b, (AbstractC3863j) entry.getValue());
        }
        c6047b.m5772f();
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        JsonToken jsonTokenM5764x = c6046a.m5764x();
        AbstractC3863j abstractC3863jM4906e = m4906e(c6046a, jsonTokenM5764x);
        if (abstractC3863jM4906e == null) {
            return m4905d(c6046a, jsonTokenM5764x);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c6046a.m5751k()) {
                String strM5758r = abstractC3863jM4906e instanceof C3865l ? c6046a.m5758r() : null;
                JsonToken jsonTokenM5764x2 = c6046a.m5764x();
                AbstractC3863j abstractC3863jM4906e2 = m4906e(c6046a, jsonTokenM5764x2);
                boolean z8 = abstractC3863jM4906e2 != null;
                if (abstractC3863jM4906e2 == null) {
                    abstractC3863jM4906e2 = m4905d(c6046a, jsonTokenM5764x2);
                }
                if (abstractC3863jM4906e instanceof C3843i) {
                    ((C3843i) abstractC3863jM4906e).f3013a.add(abstractC3863jM4906e2);
                } else {
                    ((C3865l) abstractC3863jM4906e).f3057a.put(strM5758r, abstractC3863jM4906e2);
                }
                if (z8) {
                    arrayDeque.addLast(abstractC3863jM4906e);
                    abstractC3863jM4906e = abstractC3863jM4906e2;
                }
            } else {
                if (abstractC3863jM4906e instanceof C3843i) {
                    c6046a.m5747e();
                } else {
                    c6046a.m5748f();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC3863jM4906e;
                }
                abstractC3863jM4906e = (AbstractC3863j) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo2780c(C6047b c6047b, Object obj) throws IOException {
        m4907f(c6047b, (AbstractC3863j) obj);
    }
}
