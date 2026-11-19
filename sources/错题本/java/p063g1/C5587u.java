package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p078i1.AbstractC5673c;
import p104l1.C6047b;

/* renamed from: g1.u */
/* loaded from: classes2.dex */
public final class C5587u {

    /* renamed from: a */
    public final String f8664a;

    /* renamed from: b */
    public final Field f8665b;

    /* renamed from: c */
    public final String f8666c;

    /* renamed from: d */
    public final /* synthetic */ boolean f8667d;

    /* renamed from: e */
    public final /* synthetic */ Method f8668e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC3869p f8669f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3869p f8670g;

    /* renamed from: h */
    public final /* synthetic */ boolean f8671h;

    /* renamed from: i */
    public final /* synthetic */ boolean f8672i;

    public C5587u(String str, Field field, boolean z8, Method method, AbstractC3869p abstractC3869p, AbstractC3869p abstractC3869p2, boolean z9, boolean z10) {
        this.f8667d = z8;
        this.f8668e = method;
        this.f8669f = abstractC3869p;
        this.f8670g = abstractC3869p2;
        this.f8671h = z9;
        this.f8672i = z10;
        this.f8664a = str;
        this.f8665b = field;
        this.f8666c = field.getName();
    }

    /* renamed from: a */
    public final void m4910a(C6047b c6047b, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        boolean z8 = this.f8667d;
        Field field = this.f8665b;
        Method method = this.f8668e;
        if (z8) {
            if (method == null) {
                C5597z.m4914a(obj, field);
            } else {
                C5597z.m4914a(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(AbstractC0037f.m86k("Accessor ", AbstractC5673c.m5008d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c6047b.m5773g(this.f8664a);
        this.f8669f.mo2780c(c6047b, objInvoke);
    }
}
