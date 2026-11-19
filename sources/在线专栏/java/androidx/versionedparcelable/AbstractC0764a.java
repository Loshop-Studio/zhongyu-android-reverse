package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.C0247a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p161v0.InterfaceC3417a;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC0764a {

    /* renamed from: a */
    protected final C0247a<String, Method> f4596a;

    /* renamed from: b */
    protected final C0247a<String, Method> f4597b;

    /* renamed from: c */
    protected final C0247a<String, Class> f4598c;

    public AbstractC0764a(C0247a<String, Method> c0247a, C0247a<String, Method> c0247a2, C0247a<String, Class> c0247a3) {
        this.f4596a = c0247a;
        this.f4597b = c0247a2;
        this.f4598c = c0247a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m3996N(InterfaceC3417a interfaceC3417a) {
        try {
            mo4008I(m3997c(interfaceC3417a.getClass()).getName());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(interfaceC3417a.getClass().getSimpleName() + " does not have a Parcelizer", e4);
        }
    }

    /* renamed from: c */
    private Class m3997c(Class<? extends InterfaceC3417a> cls) throws ClassNotFoundException {
        Class cls2 = this.f4598c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f4598c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m3998d(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method method = this.f4596a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0764a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0764a.class);
        this.f4596a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private Method m3999e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = this.f4597b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM3997c = m3997c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM3997c.getDeclaredMethod("write", cls, AbstractC0764a.class);
        this.f4597b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: A */
    protected abstract void mo4000A(byte[] bArr);

    /* renamed from: B */
    public void m4001B(byte[] bArr, int i4) {
        mo4032w(i4);
        mo4000A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo4002C(CharSequence charSequence);

    /* renamed from: D */
    public void m4003D(CharSequence charSequence, int i4) {
        mo4032w(i4);
        mo4002C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo4004E(int i4);

    /* renamed from: F */
    public void m4005F(int i4, int i5) {
        mo4032w(i5);
        mo4004E(i4);
    }

    /* renamed from: G */
    protected abstract void mo4006G(Parcelable parcelable);

    /* renamed from: H */
    public void m4007H(Parcelable parcelable, int i4) {
        mo4032w(i4);
        mo4006G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo4008I(String str);

    /* renamed from: J */
    public void m4009J(String str, int i4) {
        mo4032w(i4);
        mo4008I(str);
    }

    /* renamed from: K */
    protected <T extends InterfaceC3417a> void m4010K(T t3, AbstractC0764a abstractC0764a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            m3999e(t3.getClass()).invoke(null, t3, abstractC0764a);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (!(e7.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
            }
            throw ((RuntimeException) e7.getCause());
        }
    }

    /* renamed from: L */
    protected void m4011L(InterfaceC3417a interfaceC3417a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC3417a == null) {
            mo4008I(null);
            return;
        }
        m3996N(interfaceC3417a);
        AbstractC0764a abstractC0764aMo4014b = mo4014b();
        m4010K(interfaceC3417a, abstractC0764aMo4014b);
        abstractC0764aMo4014b.mo4013a();
    }

    /* renamed from: M */
    public void m4012M(InterfaceC3417a interfaceC3417a, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mo4032w(i4);
        m4011L(interfaceC3417a);
    }

    /* renamed from: a */
    protected abstract void mo4013a();

    /* renamed from: b */
    protected abstract AbstractC0764a mo4014b();

    /* renamed from: f */
    public boolean m4015f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo4016g();

    /* renamed from: h */
    public boolean m4017h(boolean z3, int i4) {
        return !mo4022m(i4) ? z3 : mo4016g();
    }

    /* renamed from: i */
    protected abstract byte[] mo4018i();

    /* renamed from: j */
    public byte[] m4019j(byte[] bArr, int i4) {
        return !mo4022m(i4) ? bArr : mo4018i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo4020k();

    /* renamed from: l */
    public CharSequence m4021l(CharSequence charSequence, int i4) {
        return !mo4022m(i4) ? charSequence : mo4020k();
    }

    /* renamed from: m */
    protected abstract boolean mo4022m(int i4);

    /* renamed from: n */
    protected <T extends InterfaceC3417a> T m4023n(String str, AbstractC0764a abstractC0764a) {
        try {
            return (T) m3998d(str).invoke(null, abstractC0764a);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    /* renamed from: o */
    protected abstract int mo4024o();

    /* renamed from: p */
    public int m4025p(int i4, int i5) {
        return !mo4022m(i5) ? i4 : mo4024o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo4026q();

    /* renamed from: r */
    public <T extends Parcelable> T m4027r(T t3, int i4) {
        return !mo4022m(i4) ? t3 : (T) mo4026q();
    }

    /* renamed from: s */
    protected abstract String mo4028s();

    /* renamed from: t */
    public String m4029t(String str, int i4) {
        return !mo4022m(i4) ? str : mo4028s();
    }

    /* renamed from: u */
    protected <T extends InterfaceC3417a> T m4030u() {
        String strMo4028s = mo4028s();
        if (strMo4028s == null) {
            return null;
        }
        return (T) m4023n(strMo4028s, mo4014b());
    }

    /* renamed from: v */
    public <T extends InterfaceC3417a> T m4031v(T t3, int i4) {
        return !mo4022m(i4) ? t3 : (T) m4030u();
    }

    /* renamed from: w */
    protected abstract void mo4032w(int i4);

    /* renamed from: x */
    public void m4033x(boolean z3, boolean z4) {
    }

    /* renamed from: y */
    protected abstract void mo4034y(boolean z3);

    /* renamed from: z */
    public void m4035z(boolean z3, int i4) {
        mo4032w(i4);
        mo4034y(z3);
    }
}
