package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import p078i1.AbstractC5673c;
import p104l1.C6046a;
import p104l1.C6047b;
import p185v7.AbstractC6675d;

/* renamed from: g1.v */
/* loaded from: classes2.dex */
public abstract class AbstractC5589v extends AbstractC3869p {

    /* renamed from: a */
    public final C5593x f8676a;

    public AbstractC5589v(C5593x c5593x) {
        this.f8676a = c5593x;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        Object objMo4911d = mo4911d();
        Map map = this.f8676a.f8682a;
        try {
            c6046a.m5744b();
            while (c6046a.m5751k()) {
                C5587u c5587u = (C5587u) map.get(c6046a.m5758r());
                if (c5587u == null) {
                    c6046a.m5740E();
                } else {
                    mo4913f(objMo4911d, c6046a, c5587u);
                }
            }
            c6046a.m5748f();
            return mo4912e(objMo4911d);
        } catch (IllegalAccessException e) {
            AbstractC6675d abstractC6675d = AbstractC5673c.f8842a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e4) {
            throw new JsonSyntaxException(e4);
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c6047b.m5775k();
            return;
        }
        c6047b.m5769c();
        try {
            Iterator it = this.f8676a.f8683b.iterator();
            while (it.hasNext()) {
                ((C5587u) it.next()).m4910a(c6047b, obj);
            }
            c6047b.m5772f();
        } catch (IllegalAccessException e) {
            AbstractC6675d abstractC6675d = AbstractC5673c.f8842a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    /* renamed from: d */
    public abstract Object mo4911d();

    /* renamed from: e */
    public abstract Object mo4912e(Object obj);

    /* renamed from: f */
    public abstract void mo4913f(Object obj, C6046a c6046a, C5587u c5587u);
}
