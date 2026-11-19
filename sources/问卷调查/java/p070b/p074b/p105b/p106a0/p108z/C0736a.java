package p070b.p074b.p105b.p106a0.p108z;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p106a0.C0708a;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* renamed from: b.b.b.a0.z.a */
/* loaded from: classes.dex */
public final class C0736a<E> extends AbstractC0783x<Object> {

    /* renamed from: c */
    public static final InterfaceC0784y f4262c = new a();

    /* renamed from: a */
    public final Class<E> f4263a;

    /* renamed from: b */
    public final AbstractC0783x<E> f4264b;

    /* renamed from: b.b.b.a0.z.a$a */
    public class a implements InterfaceC0784y {
        @Override // p070b.p074b.p105b.InterfaceC0784y
        /* renamed from: a */
        public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
            Type type = c0757a.f4387b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new C0736a(c0768i, c0768i.m2451c(new C0757a<>(genericComponentType)), C0708a.m2359e(genericComponentType));
        }
    }

    public C0736a(C0768i c0768i, AbstractC0783x<E> abstractC0783x, Class<E> cls) {
        this.f4264b = new C0749n(c0768i, abstractC0783x, cls);
        this.f4263a = cls;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public Object mo2370a(C0759a c0759a) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (c0759a.mo2403v() == EnumC0760b.NULL) {
            c0759a.mo2401r();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c0759a.mo2390a();
        while (c0759a.mo2395i()) {
            arrayList.add(this.f4264b.mo2370a(c0759a));
        }
        c0759a.mo2392e();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f4263a, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            c0761c.mo2409h();
            return;
        }
        c0761c.mo2404b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f4264b.mo2371b(c0761c, Array.get(obj, i));
        }
        c0761c.mo2406e();
    }
}
