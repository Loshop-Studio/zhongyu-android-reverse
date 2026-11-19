package p000a.p067s;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p021e.C0129a;

/* renamed from: a.s.a */
/* loaded from: classes.dex */
public abstract class AbstractC0442a {

    /* renamed from: a */
    public final C0129a<String, Method> f2571a;

    /* renamed from: b */
    public final C0129a<String, Method> f2572b;

    /* renamed from: c */
    public final C0129a<String, Class> f2573c;

    public AbstractC0442a(C0129a<String, Method> c0129a, C0129a<String, Method> c0129a2, C0129a<String, Class> c0129a3) {
        this.f2571a = c0129a;
        this.f2572b = c0129a2;
        this.f2573c = c0129a3;
    }

    /* renamed from: a */
    public abstract void mo1501a();

    /* renamed from: b */
    public abstract AbstractC0442a mo1502b();

    /* renamed from: c */
    public final Class m1503c(Class<? extends InterfaceC0444c> cls) throws ClassNotFoundException {
        Class orDefault = this.f2573c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f2573c.put(cls.getName(), cls2);
        return cls2;
    }

    /* renamed from: d */
    public final Method m1504d(String str) throws NoSuchMethodException, SecurityException {
        Method orDefault = this.f2571a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0442a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0442a.class);
        this.f2571a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final Method m1505e(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method orDefault = this.f2572b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsM1503c = m1503c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM1503c.getDeclaredMethod("write", cls, AbstractC0442a.class);
        this.f2572b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public abstract boolean mo1506f();

    /* renamed from: g */
    public abstract byte[] mo1507g();

    /* renamed from: h */
    public abstract CharSequence mo1508h();

    /* renamed from: i */
    public abstract boolean mo1509i(int i);

    /* renamed from: j */
    public abstract int mo1510j();

    /* renamed from: k */
    public int m1511k(int i, int i2) {
        return !mo1509i(i2) ? i : mo1510j();
    }

    /* renamed from: l */
    public abstract <T extends Parcelable> T mo1512l();

    /* renamed from: m */
    public <T extends Parcelable> T m1513m(T t, int i) {
        return !mo1509i(i) ? t : (T) mo1512l();
    }

    /* renamed from: n */
    public abstract String mo1514n();

    /* renamed from: o */
    public <T extends InterfaceC0444c> T m1515o() {
        String strMo1514n = mo1514n();
        if (strMo1514n == null) {
            return null;
        }
        try {
            return (T) m1504d(strMo1514n).invoke(null, mo1502b());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* renamed from: p */
    public abstract void mo1516p(int i);

    /* renamed from: q */
    public abstract void mo1517q(boolean z);

    /* renamed from: r */
    public abstract void mo1518r(byte[] bArr);

    /* renamed from: s */
    public abstract void mo1519s(CharSequence charSequence);

    /* renamed from: t */
    public abstract void mo1520t(int i);

    /* renamed from: u */
    public abstract void mo1521u(Parcelable parcelable);

    /* renamed from: v */
    public abstract void mo1522v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public void m1523w(InterfaceC0444c interfaceC0444c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC0444c == null) {
            mo1522v(null);
            return;
        }
        try {
            mo1522v(m1503c(interfaceC0444c.getClass()).getName());
            AbstractC0442a abstractC0442aMo1502b = mo1502b();
            try {
                m1505e(interfaceC0444c.getClass()).invoke(null, interfaceC0444c, abstractC0442aMo1502b);
                abstractC0442aMo1502b.mo1501a();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(interfaceC0444c.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }
}
