package ge;

import de.AbstractC9025a;
import gd.AbstractC9293a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.C9956a0;
import kotlin.jvm.internal.C9960c0;
import kotlin.jvm.internal.C9966h;
import kotlin.jvm.internal.C9967i;
import kotlin.jvm.internal.C9968j;
import kotlin.jvm.internal.C9973o;
import kotlin.jvm.internal.C9974p;
import kotlin.jvm.internal.C9978t;
import kotlin.jvm.internal.C9980v;
import kotlin.uuid.Uuid;
import p049ce.C5436f;
import p049ce.InterfaceC5432b;
import p049ce.InterfaceC5433c;
import p049ce.InterfaceC5438h;
import p280od.InterfaceC10469c;
import p309qc.C10777h;
import p309qc.C10778i;
import p309qc.C10779j;
import p309qc.C10780k;
import p309qc.C10781l;
import p309qc.C10782m;
import p309qc.C10784o;
import p309qc.C10785p;
import p309qc.C10786q;
import p325rc.AbstractC10967q0;
import p326rd.C10986a;

/* renamed from: ge.w1 */
/* loaded from: classes6.dex */
public abstract class AbstractC9394w1 {
    /* renamed from: a */
    public static final Object m18571a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final InterfaceC5432b m18572b(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        return m18574d(interfaceC10469c, new InterfaceC5432b[0]);
    }

    /* renamed from: c */
    public static final InterfaceC5432b m18573c(Class cls, InterfaceC5432b... args) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(cls, "<this>");
        AbstractC9979u.m20294g(args, "args");
        if (cls.isEnum() && m18583m(cls)) {
            return m18575e(cls);
        }
        InterfaceC5432b interfaceC5432bM18581k = m18581k(cls, (InterfaceC5432b[]) Arrays.copyOf(args, args.length));
        if (interfaceC5432bM18581k != null) {
            return interfaceC5432bM18581k;
        }
        InterfaceC5432b interfaceC5432bM18578h = m18578h(cls);
        if (interfaceC5432bM18578h != null) {
            return interfaceC5432bM18578h;
        }
        InterfaceC5432b interfaceC5432bM18576f = m18576f(cls, (InterfaceC5432b[]) Arrays.copyOf(args, args.length));
        if (interfaceC5432bM18576f != null) {
            return interfaceC5432bM18576f;
        }
        if (m18584n(cls)) {
            return new C5436f(AbstractC9293a.m18326c(cls));
        }
        return null;
    }

    /* renamed from: d */
    public static final InterfaceC5432b m18574d(InterfaceC10469c interfaceC10469c, InterfaceC5432b... args) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        AbstractC9979u.m20294g(args, "args");
        return m18573c(AbstractC9293a.m18324a(interfaceC10469c), (InterfaceC5432b[]) Arrays.copyOf(args, args.length));
    }

    /* renamed from: e */
    public static final InterfaceC5432b m18575e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        AbstractC9979u.m20293f(canonicalName, "getCanonicalName(...)");
        AbstractC9979u.m20292e(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C9330h0(canonicalName, (Enum[]) enumConstants);
    }

    /* renamed from: f */
    public static final InterfaceC5432b m18576f(Class cls, InterfaceC5432b... interfaceC5432bArr) {
        Field field;
        InterfaceC5432b interfaceC5432bM18580j;
        Object objM18577g = m18577g(cls);
        if (objM18577g != null && (interfaceC5432bM18580j = m18580j(objM18577g, (InterfaceC5432b[]) Arrays.copyOf(interfaceC5432bArr, interfaceC5432bArr.length))) != null) {
            return interfaceC5432bM18580j;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            AbstractC9979u.m20293f(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class<?> cls3 = declaredClasses[i10];
                    if (AbstractC9979u.m20289b(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof InterfaceC5432b) {
                return (InterfaceC5432b) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    /* renamed from: g */
    public static final Object m18577g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        AbstractC9979u.m20293f(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(InterfaceC9346k1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        AbstractC9979u.m20293f(simpleName, "getSimpleName(...)");
        return m18571a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r5 = null;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p049ce.InterfaceC5432b m18578h(java.lang.Class r11) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = p310qd.AbstractC10819z.m23242O(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = p310qd.AbstractC10819z.m23242O(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L28:
            r7 = 1
            if (r4 >= r2) goto L56
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.AbstractC9979u.m20289b(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.AbstractC9979u.m20289b(r9, r11)
            if (r9 == 0) goto L53
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L53
            if (r5 == 0) goto L51
        L4f:
            r6 = r1
            goto L59
        L51:
            r5 = r7
            r6 = r8
        L53:
            int r4 = r4 + 1
            goto L28
        L56:
            if (r5 != 0) goto L59
            goto L4f
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.AbstractC9979u.m20289b(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<ce.b> r9 = p049ce.InterfaceC5432b.class
            boolean r8 = kotlin.jvm.internal.AbstractC9979u.m20289b(r8, r9)
            if (r8 == 0) goto L9a
            if (r4 == 0) goto L98
        L96:
            r5 = r1
            goto La0
        L98:
            r5 = r6
            r4 = r7
        L9a:
            int r3 = r3 + 1
            goto L6c
        L9d:
            if (r4 != 0) goto La0
            goto L96
        La0:
            if (r5 != 0) goto La3
            return r1
        La3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof p049ce.InterfaceC5432b
            if (r0 == 0) goto Lae
            ce.b r11 = (p049ce.InterfaceC5432b) r11
            return r11
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.AbstractC9394w1.m18578h(java.lang.Class):ce.b");
    }

    /* renamed from: i */
    public static final Map m18579i() {
        Map mapM24036c = AbstractC10967q0.m24036c();
        mapM24036c.put(AbstractC9983y.m20315b(String.class), AbstractC9025a.m17635C(C9960c0.f23411a));
        mapM24036c.put(AbstractC9983y.m20315b(Character.TYPE), AbstractC9025a.m17665w(C9968j.f23418a));
        mapM24036c.put(AbstractC9983y.m20315b(char[].class), AbstractC9025a.m17646d());
        mapM24036c.put(AbstractC9983y.m20315b(Double.TYPE), AbstractC9025a.m17666x(C9973o.f23423a));
        mapM24036c.put(AbstractC9983y.m20315b(double[].class), AbstractC9025a.m17647e());
        mapM24036c.put(AbstractC9983y.m20315b(Float.TYPE), AbstractC9025a.m17667y(C9974p.f23424a));
        mapM24036c.put(AbstractC9983y.m20315b(float[].class), AbstractC9025a.m17648f());
        mapM24036c.put(AbstractC9983y.m20315b(Long.TYPE), AbstractC9025a.m17633A(C9980v.f23426a));
        mapM24036c.put(AbstractC9983y.m20315b(long[].class), AbstractC9025a.m17651i());
        mapM24036c.put(AbstractC9983y.m20315b(C10781l.class), AbstractC9025a.m17639G(C10781l.f26002d));
        mapM24036c.put(AbstractC9983y.m20315b(Integer.TYPE), AbstractC9025a.m17668z(C9978t.f23425a));
        mapM24036c.put(AbstractC9983y.m20315b(int[].class), AbstractC9025a.m17649g());
        mapM24036c.put(AbstractC9983y.m20315b(C10779j.class), AbstractC9025a.m17638F(C10779j.f25997d));
        mapM24036c.put(AbstractC9983y.m20315b(Short.TYPE), AbstractC9025a.m17634B(C9956a0.f23405a));
        mapM24036c.put(AbstractC9983y.m20315b(short[].class), AbstractC9025a.m17656n());
        mapM24036c.put(AbstractC9983y.m20315b(C10784o.class), AbstractC9025a.m17640H(C10784o.f26008d));
        mapM24036c.put(AbstractC9983y.m20315b(Byte.TYPE), AbstractC9025a.m17664v(C9967i.f23417a));
        mapM24036c.put(AbstractC9983y.m20315b(byte[].class), AbstractC9025a.m17645c());
        mapM24036c.put(AbstractC9983y.m20315b(C10777h.class), AbstractC9025a.m17637E(C10777h.f25992d));
        mapM24036c.put(AbstractC9983y.m20315b(Boolean.TYPE), AbstractC9025a.m17663u(C9966h.f23416a));
        mapM24036c.put(AbstractC9983y.m20315b(boolean[].class), AbstractC9025a.m17644b());
        mapM24036c.put(AbstractC9983y.m20315b(C10786q.class), AbstractC9025a.m17641I(C10786q.f26013a));
        mapM24036c.put(AbstractC9983y.m20315b(Void.class), AbstractC9025a.m17654l());
        try {
            mapM24036c.put(AbstractC9983y.m20315b(C10986a.class), AbstractC9025a.m17642J(C10986a.f26491d));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapM24036c.put(AbstractC9983y.m20315b(C10782m.class), AbstractC9025a.m17660r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapM24036c.put(AbstractC9983y.m20315b(C10780k.class), AbstractC9025a.m17659q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapM24036c.put(AbstractC9983y.m20315b(C10785p.class), AbstractC9025a.m17661s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapM24036c.put(AbstractC9983y.m20315b(C10778i.class), AbstractC9025a.m17658p());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapM24036c.put(AbstractC9983y.m20315b(Uuid.class), AbstractC9025a.m17636D(Uuid.f23466e));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return AbstractC10967q0.m24035b(mapM24036c);
    }

    /* renamed from: j */
    public static final InterfaceC5432b m18580j(Object obj, InterfaceC5432b... interfaceC5432bArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC5432bArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC5432bArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = InterfaceC5432b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC5432bArr, interfaceC5432bArr.length));
            if (objInvoke instanceof InterfaceC5432b) {
                return (InterfaceC5432b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* renamed from: k */
    public static final InterfaceC5432b m18581k(Class cls, InterfaceC5432b... interfaceC5432bArr) {
        Object objM18571a = m18571a(cls, "Companion");
        if (objM18571a == null) {
            return null;
        }
        return m18580j(objM18571a, (InterfaceC5432b[]) Arrays.copyOf(interfaceC5432bArr, interfaceC5432bArr.length));
    }

    /* renamed from: l */
    public static final boolean m18582l(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        return AbstractC9293a.m18324a(interfaceC10469c).isInterface();
    }

    /* renamed from: m */
    public static final boolean m18583m(Class cls) {
        return cls.getAnnotation(InterfaceC5438h.class) == null && cls.getAnnotation(InterfaceC5433c.class) == null;
    }

    /* renamed from: n */
    public static final boolean m18584n(Class cls) {
        if (cls.getAnnotation(InterfaceC5433c.class) != null) {
            return true;
        }
        InterfaceC5438h interfaceC5438h = (InterfaceC5438h) cls.getAnnotation(InterfaceC5438h.class);
        return interfaceC5438h != null && AbstractC9979u.m20289b(AbstractC9983y.m20315b(interfaceC5438h.with()), AbstractC9983y.m20315b(C5436f.class));
    }

    /* renamed from: o */
    public static final boolean m18585o(InterfaceC10469c rootClass) {
        AbstractC9979u.m20294g(rootClass, "rootClass");
        return AbstractC9293a.m18324a(rootClass).isArray();
    }

    /* renamed from: p */
    public static final Void m18586p(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        AbstractC9398x1.m18597f(interfaceC10469c);
        throw new KotlinNothingValueException();
    }

    /* renamed from: q */
    public static final Object[] m18587q(ArrayList arrayList, InterfaceC10469c eClass) throws NegativeArraySizeException {
        AbstractC9979u.m20294g(arrayList, "<this>");
        AbstractC9979u.m20294g(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC9293a.m18324a(eClass), arrayList.size());
        AbstractC9979u.m20292e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        AbstractC9979u.m20293f(array, "toArray(...)");
        return array;
    }
}
