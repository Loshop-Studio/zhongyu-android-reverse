package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.C3837c;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3835a;
import com.google.gson.InterfaceC3870q;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.AbstractC3848e;
import com.google.gson.internal.AbstractC3857n;
import com.google.gson.internal.C3845b;
import com.google.gson.internal.C3847d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import p078i1.AbstractC5673c;
import p095k1.C5752a;
import p185v7.AbstractC6675d;

/* renamed from: g1.z */
/* loaded from: classes2.dex */
public final class C5597z implements InterfaceC3870q {

    /* renamed from: a */
    public final C3845b f8689a;

    /* renamed from: b */
    public final InterfaceC3835a f8690b;

    /* renamed from: c */
    public final C3847d f8691c;

    /* renamed from: d */
    public final C5569l f8692d;

    /* renamed from: e */
    public final List f8693e;

    public C5597z(C3845b c3845b, InterfaceC3835a interfaceC3835a, C3847d c3847d, C5569l c5569l, List list) {
        this.f8689a = c3845b;
        this.f8690b = interfaceC3835a;
        this.f8691c = c3847d;
        this.f8692d = c5569l;
        this.f8693e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m4914a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!AbstractC3857n.f3049a.mo2814a(obj, accessibleObject)) {
            throw new JsonIOException(AbstractC0037f.m74C(AbstractC5673c.m5008d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* renamed from: b */
    public static void m4915b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC5673c.m5007c(field) + " and " + AbstractC5673c.m5007c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        Class cls = c5752a.f9103a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC6675d abstractC6675d = AbstractC5673c.f8842a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C3837c(2);
        }
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResultM2805f = AbstractC3848e.m2805f(this.f8693e);
        if (reflectionAccessFilter$FilterResultM2805f != ReflectionAccessFilter$FilterResult.BLOCK_ALL) {
            boolean z8 = reflectionAccessFilter$FilterResultM2805f == ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
            return AbstractC5673c.f8842a.mo5004p(cls) ? new C5595y(cls, m4916d(c3841g, c5752a, cls, z8, true), z8) : new C5591w(this.f8689a.m2797c(c5752a, true), m4916d(c3841g, c5752a, cls, z8, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p063g1.C5593x m4916d(com.google.gson.C3841g r29, p095k1.C5752a r30, java.lang.Class r31, boolean r32, boolean r33) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p063g1.C5597z.m4916d(com.google.gson.g, k1.a, java.lang.Class, boolean, boolean):g1.x");
    }

    /* renamed from: e */
    public final boolean m4917e(Field field, boolean z8) {
        boolean z9;
        C3847d c3847d = this.f8691c;
        c3847d.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c3847d.m2799e(field.getType(), z8)) {
            z9 = true;
        } else {
            List list = z8 ? c3847d.f3028a : c3847d.f3029b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z9 = false;
        }
        return !z9;
    }
}
