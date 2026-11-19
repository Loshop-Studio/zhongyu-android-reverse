package p070b.p074b.p105b.p106a0;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p070b.p071a.p072a.p073a.C0561a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: b.b.b.a0.f */
/* loaded from: classes.dex */
public class C0716f<T> implements InterfaceC0730t<T> {

    /* renamed from: a */
    public final AbstractC0735y f4212a;

    /* renamed from: b */
    public final /* synthetic */ Class f4213b;

    /* renamed from: c */
    public final /* synthetic */ Type f4214c;

    public C0716f(C0717g c0717g, Class cls, Type type) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        AbstractC0735y c0734x;
        this.f4213b = cls;
        this.f4214c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            c0734x = new C0731u(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    c0734x = new C0732v(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    c0734x = new C0733w(declaredMethod3);
                }
            } catch (Exception unused3) {
                c0734x = new C0734x();
            }
        }
        this.f4212a = c0734x;
    }

    @Override // p070b.p074b.p105b.p106a0.InterfaceC0730t
    /* renamed from: a */
    public T mo2365a() {
        try {
            return (T) this.f4212a.mo2381b(this.f4213b);
        } catch (Exception e2) {
            StringBuilder sbM2079g = C0561a.m2079g("Unable to invoke no-args constructor for ");
            sbM2079g.append(this.f4214c);
            sbM2079g.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(sbM2079g.toString(), e2);
        }
    }
}
