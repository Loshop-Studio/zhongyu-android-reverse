package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.JsonIOException;
import com.google.gson.internal.InterfaceC3854k;
import java.lang.reflect.Field;
import p078i1.AbstractC5673c;
import p104l1.C6046a;

/* renamed from: g1.w */
/* loaded from: classes2.dex */
public final class C5591w extends AbstractC5589v {

    /* renamed from: b */
    public final InterfaceC3854k f8677b;

    public C5591w(InterfaceC3854k interfaceC3854k, C5593x c5593x) {
        super(c5593x);
        this.f8677b = interfaceC3854k;
    }

    @Override // p063g1.AbstractC5589v
    /* renamed from: d */
    public final Object mo4911d() {
        return this.f8677b.mo671a();
    }

    @Override // p063g1.AbstractC5589v
    /* renamed from: f */
    public final void mo4913f(Object obj, C6046a c6046a, C5587u c5587u) throws IllegalAccessException, IllegalArgumentException {
        Field field = c5587u.f8665b;
        Object objMo2779b = c5587u.f8670g.mo2779b(c6046a);
        if (objMo2779b == null && c5587u.f8671h) {
            return;
        }
        if (c5587u.f8667d) {
            C5597z.m4914a(obj, field);
        } else if (c5587u.f8672i) {
            throw new JsonIOException(AbstractC0037f.m85j("Cannot set value of 'static final' ", AbstractC5673c.m5008d(field, false)));
        }
        field.set(obj, objMo2779b);
    }

    @Override // p063g1.AbstractC5589v
    /* renamed from: e */
    public final Object mo4912e(Object obj) {
        return obj;
    }
}
