package p070b.p074b.p105b.p106a0.p108z;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p106a0.C0708a;
import p070b.p074b.p105b.p106a0.C0717g;
import p070b.p074b.p105b.p106a0.InterfaceC0730t;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* renamed from: b.b.b.a0.z.b */
/* loaded from: classes.dex */
public final class C0737b implements InterfaceC0784y {

    /* renamed from: b */
    public final C0717g f4265b;

    /* renamed from: b.b.b.a0.z.b$a */
    public static final class a<E> extends AbstractC0783x<Collection<E>> {

        /* renamed from: a */
        public final AbstractC0783x<E> f4266a;

        /* renamed from: b */
        public final InterfaceC0730t<? extends Collection<E>> f4267b;

        public a(C0768i c0768i, Type type, AbstractC0783x<E> abstractC0783x, InterfaceC0730t<? extends Collection<E>> interfaceC0730t) {
            this.f4266a = new C0749n(c0768i, abstractC0783x, type);
            this.f4267b = interfaceC0730t;
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: a */
        public Object mo2370a(C0759a c0759a) {
            if (c0759a.mo2403v() == EnumC0760b.NULL) {
                c0759a.mo2401r();
                return null;
            }
            Collection<E> collectionMo2365a = this.f4267b.mo2365a();
            c0759a.mo2390a();
            while (c0759a.mo2395i()) {
                collectionMo2365a.add(this.f4266a.mo2370a(c0759a));
            }
            c0759a.mo2392e();
            return collectionMo2365a;
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: b */
        public void mo2371b(C0761c c0761c, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                c0761c.mo2409h();
                return;
            }
            c0761c.mo2404b();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f4266a.mo2371b(c0761c, it.next());
            }
            c0761c.mo2406e();
        }
    }

    public C0737b(C0717g c0717g) {
        this.f4265b = c0717g;
    }

    @Override // p070b.p074b.p105b.InterfaceC0784y
    /* renamed from: a */
    public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
        Type type = c0757a.f4387b;
        Class<? super T> cls = c0757a.f4386a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type typeM2360f = C0708a.m2360f(type, cls, Collection.class);
        if (typeM2360f instanceof WildcardType) {
            typeM2360f = ((WildcardType) typeM2360f).getUpperBounds()[0];
        }
        Class cls2 = typeM2360f instanceof ParameterizedType ? ((ParameterizedType) typeM2360f).getActualTypeArguments()[0] : Object.class;
        return new a(c0768i, cls2, c0768i.m2451c(new C0757a<>(cls2)), this.f4265b.m2366a(c0757a));
    }
}
