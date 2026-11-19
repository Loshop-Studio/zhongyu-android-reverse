package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.InterfaceC3854k;
import com.google.gson.stream.JsonToken;
import io.reactivex.internal.operators.observable.C5711g;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import p104l1.C6046a;

/* renamed from: g1.o */
/* loaded from: classes2.dex */
public final class C5575o extends AbstractC3869p {

    /* renamed from: a */
    public final /* synthetic */ int f8651a = 1;

    /* renamed from: b */
    public final Object f8652b;

    /* renamed from: c */
    public final AbstractC3869p f8653c;

    /* renamed from: d */
    public final Object f8654d;

    public C5575o(C3841g c3841g, AbstractC3869p abstractC3869p, Type type) {
        this.f8652b = c3841g;
        this.f8653c = abstractC3869p;
        this.f8654d = type;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        switch (this.f8651a) {
            case 0:
                JsonToken jsonTokenM5764x = c6046a.m5764x();
                if (jsonTokenM5764x == JsonToken.NULL) {
                    c6046a.m5760t();
                    return null;
                }
                Map map = (Map) ((InterfaceC3854k) this.f8654d).mo671a();
                if (jsonTokenM5764x == JsonToken.BEGIN_ARRAY) {
                    c6046a.m5743a();
                    while (c6046a.m5751k()) {
                        c6046a.m5743a();
                        Object objMo2779b = ((C5575o) this.f8652b).f8653c.mo2779b(c6046a);
                        if (map.put(objMo2779b, ((C5575o) this.f8653c).f8653c.mo2779b(c6046a)) != null) {
                            throw new JsonSyntaxException(AbstractC0037f.m84i(objMo2779b, "duplicate key: "));
                        }
                        c6046a.m5747e();
                    }
                    c6046a.m5747e();
                } else {
                    c6046a.m5744b();
                    while (c6046a.m5751k()) {
                        C5711g.f9009b.getClass();
                        int iM5746d = c6046a.f9617h;
                        if (iM5746d == 0) {
                            iM5746d = c6046a.m5746d();
                        }
                        if (iM5746d == 13) {
                            c6046a.f9617h = 9;
                        } else if (iM5746d == 12) {
                            c6046a.f9617h = 8;
                        } else {
                            if (iM5746d != 14) {
                                throw c6046a.m5742G("a name");
                            }
                            c6046a.f9617h = 10;
                        }
                        Object objMo2779b2 = ((C5575o) this.f8652b).f8653c.mo2779b(c6046a);
                        if (map.put(objMo2779b2, ((C5575o) this.f8653c).f8653c.mo2779b(c6046a)) != null) {
                            throw new JsonSyntaxException(AbstractC0037f.m84i(objMo2779b2, "duplicate key: "));
                        }
                    }
                    c6046a.m5748f();
                }
                return map;
            default:
                return this.f8653c.mo2779b(c6046a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2780c(p104l1.C6047b r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f8651a
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f8654d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L18
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L18
        L13:
            java.lang.Class r1 = r6.getClass()
            goto L19
        L18:
            r1 = r0
        L19:
            com.google.gson.p r2 = r4.f8653c
            if (r1 == r0) goto L46
            java.lang.Object r0 = r4.f8652b
            com.google.gson.g r0 = (com.google.gson.C3841g) r0
            k1.a r3 = new k1.a
            r3.<init>(r1)
            com.google.gson.p r0 = r0.m2785d(r3)
            boolean r1 = r0 instanceof p063g1.AbstractC5589v
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r2
        L30:
            boolean r3 = r1 instanceof p063g1.AbstractC5542a0
            if (r3 == 0) goto L40
            r3 = r1
            g1.a0 r3 = (p063g1.AbstractC5542a0) r3
            com.google.gson.p r3 = r3.mo2781d()
            if (r3 != r1) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L30
        L40:
            boolean r1 = r1 instanceof p063g1.AbstractC5589v
            if (r1 != 0) goto L45
            goto L46
        L45:
            r2 = r0
        L46:
            r2.mo2780c(r5, r6)
            return
        L4a:
            java.util.Map r6 = (java.util.Map) r6
            com.google.gson.p r0 = r4.f8653c
            g1.o r0 = (p063g1.C5575o) r0
            if (r6 != 0) goto L56
            r5.m5775k()
            goto L83
        L56:
            r5.m5769c()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.m5773g(r2)
            java.lang.Object r1 = r1.getValue()
            r0.mo2780c(r5, r1)
            goto L61
        L80:
            r5.m5772f()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p063g1.C5575o.mo2780c(l1.b, java.lang.Object):void");
    }

    public C5575o(C5550d c5550d, C5575o c5575o, C5575o c5575o2, InterfaceC3854k interfaceC3854k) {
        this.f8652b = c5575o;
        this.f8653c = c5575o2;
        this.f8654d = interfaceC3854k;
    }
}
