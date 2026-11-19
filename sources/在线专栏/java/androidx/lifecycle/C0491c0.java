package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.c0 */
/* loaded from: classes.dex */
public class C0491c0 {

    /* renamed from: a */
    private final b f3411a;

    /* renamed from: b */
    private final C0493d0 f3412b;

    /* renamed from: androidx.lifecycle.c0$a */
    public static class a extends d {

        /* renamed from: c */
        private static a f3413c;

        /* renamed from: b */
        private Application f3414b;

        public a(Application application) {
            this.f3414b = application;
        }

        /* renamed from: c */
        public static a m2852c(Application application) {
            if (f3413c == null) {
                f3413c = new a(application);
            }
            return f3413c;
        }

        @Override // androidx.lifecycle.C0491c0.d, androidx.lifecycle.C0491c0.b
        /* renamed from: a */
        public <T extends AbstractC0489b0> T mo2650a(Class<T> cls) {
            if (!C0486a.class.isAssignableFrom(cls)) {
                return (T) super.mo2650a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f3414b);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            }
        }
    }

    /* renamed from: androidx.lifecycle.c0$b */
    public interface b {
        /* renamed from: a */
        <T extends AbstractC0489b0> T mo2650a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.c0$c */
    static abstract class c extends e implements b {
        c() {
        }

        @Override // androidx.lifecycle.C0491c0.b
        /* renamed from: a */
        public <T extends AbstractC0489b0> T mo2650a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends AbstractC0489b0> T mo2853c(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.c0$d */
    public static class d implements b {

        /* renamed from: a */
        private static d f3415a;

        /* renamed from: b */
        static d m2854b() {
            if (f3415a == null) {
                f3415a = new d();
            }
            return f3415a;
        }

        @Override // androidx.lifecycle.C0491c0.b
        /* renamed from: a */
        public <T extends AbstractC0489b0> T mo2650a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
    }

    /* renamed from: androidx.lifecycle.c0$e */
    static class e {
        e() {
        }

        /* renamed from: b */
        void mo2855b(AbstractC0489b0 abstractC0489b0) {
        }
    }

    public C0491c0(C0493d0 c0493d0, b bVar) {
        this.f3411a = bVar;
        this.f3412b = c0493d0;
    }

    /* renamed from: a */
    public <T extends AbstractC0489b0> T m2850a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m2851b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* renamed from: b */
    public <T extends AbstractC0489b0> T m2851b(String str, Class<T> cls) {
        T t3 = (T) this.f3412b.m2863b(str);
        if (cls.isInstance(t3)) {
            Object obj = this.f3411a;
            if (obj instanceof e) {
                ((e) obj).mo2855b(t3);
            }
            return t3;
        }
        b bVar = this.f3411a;
        T t4 = bVar instanceof c ? (T) ((c) bVar).mo2853c(str, cls) : (T) bVar.mo2650a(cls);
        this.f3412b.m2865d(str, t4);
        return t4;
    }
}
