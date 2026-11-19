package p290w8;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.C9110a0;
import kotlin.jvm.internal.C9114c0;
import kotlin.jvm.internal.C9120h;
import kotlin.jvm.internal.C9121i;
import kotlin.jvm.internal.C9122j;
import kotlin.jvm.internal.C9127o;
import kotlin.jvm.internal.C9128p;
import kotlin.jvm.internal.C9132t;
import kotlin.jvm.internal.C9134v;
import kotlin.uuid.Uuid;
import p089e8.InterfaceC8375c;
import p123h7.C8727g;
import p123h7.C8728h;
import p123h7.C8729i;
import p123h7.C8730j;
import p123h7.C8731k;
import p123h7.C8732l;
import p123h7.C8734n;
import p123h7.C8735o;
import p123h7.C8736p;
import p124h8.C8738a;
import p134i7.AbstractC8798p0;
import p246s8.C10056f;
import p246s8.InterfaceC10052b;
import p246s8.InterfaceC10053c;
import p246s8.InterfaceC10058h;
import p257t8.AbstractC10124a;
import p289w7.AbstractC10360a;

/* renamed from: w8.w1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10461w1 {
    /* renamed from: a */
    public static final Object m19543a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final InterfaceC10052b m19544b(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        return m19545c(interfaceC8375c, new InterfaceC10052b[0]);
    }

    /* renamed from: c */
    public static final InterfaceC10052b m19545c(InterfaceC8375c interfaceC8375c, InterfaceC10052b... args) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        AbstractC9133u.m16133g(args, "args");
        return m19546d(AbstractC10360a.m19298a(interfaceC8375c), (InterfaceC10052b[]) Arrays.copyOf(args, args.length));
    }

    /* renamed from: d */
    public static final InterfaceC10052b m19546d(Class cls, InterfaceC10052b... args) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(cls, "<this>");
        AbstractC9133u.m16133g(args, "args");
        if (cls.isEnum() && m19555m(cls)) {
            return m19547e(cls);
        }
        InterfaceC10052b interfaceC10052bM19553k = m19553k(cls, (InterfaceC10052b[]) Arrays.copyOf(args, args.length));
        if (interfaceC10052bM19553k != null) {
            return interfaceC10052bM19553k;
        }
        InterfaceC10052b interfaceC10052bM19550h = m19550h(cls);
        if (interfaceC10052bM19550h != null) {
            return interfaceC10052bM19550h;
        }
        InterfaceC10052b interfaceC10052bM19548f = m19548f(cls, (InterfaceC10052b[]) Arrays.copyOf(args, args.length));
        if (interfaceC10052bM19548f != null) {
            return interfaceC10052bM19548f;
        }
        if (m19556n(cls)) {
            return new C10056f(AbstractC10360a.m19300c(cls));
        }
        return null;
    }

    /* renamed from: e */
    public static final InterfaceC10052b m19547e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        AbstractC9133u.m16132f(canonicalName, "getCanonicalName(...)");
        AbstractC9133u.m16131e(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C10397h0(canonicalName, (Enum[]) enumConstants);
    }

    /* renamed from: f */
    public static final InterfaceC10052b m19548f(Class cls, InterfaceC10052b... interfaceC10052bArr) {
        Field field;
        InterfaceC10052b interfaceC10052bM19552j;
        Object objM19549g = m19549g(cls);
        if (objM19549g != null && (interfaceC10052bM19552j = m19552j(objM19549g, (InterfaceC10052b[]) Arrays.copyOf(interfaceC10052bArr, interfaceC10052bArr.length))) != null) {
            return interfaceC10052bM19552j;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            AbstractC9133u.m16132f(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class<?> cls3 = declaredClasses[i10];
                    if (AbstractC9133u.m16128b(cls3.getSimpleName(), "$serializer")) {
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
            if (obj instanceof InterfaceC10052b) {
                return (InterfaceC10052b) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    /* renamed from: g */
    public static final Object m19549g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        AbstractC9133u.m16132f(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(InterfaceC10413k1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        AbstractC9133u.m16132f(simpleName, "getSimpleName(...)");
        return m19543a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r5 = null;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p246s8.InterfaceC10052b m19550h(java.lang.Class r11) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = p113g8.AbstractC8687z.m14105M(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = p113g8.AbstractC8687z.m14105M(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r0, r2)
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
            boolean r9 = kotlin.jvm.internal.AbstractC9133u.m16128b(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.AbstractC9133u.m16128b(r9, r11)
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
            kotlin.jvm.internal.AbstractC9133u.m16132f(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.AbstractC9133u.m16128b(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<s8.b> r9 = p246s8.InterfaceC10052b.class
            boolean r8 = kotlin.jvm.internal.AbstractC9133u.m16128b(r8, r9)
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
            boolean r0 = r11 instanceof p246s8.InterfaceC10052b
            if (r0 == 0) goto Lae
            s8.b r11 = (p246s8.InterfaceC10052b) r11
            return r11
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p290w8.AbstractC10461w1.m19550h(java.lang.Class):s8.b");
    }

    /* renamed from: i */
    public static final Map m19551i() {
        Map mapM14661c = AbstractC8798p0.m14661c();
        mapM14661c.put(AbstractC9137y.m16154b(String.class), AbstractC10124a.m18887H(C9114c0.f17482a));
        mapM14661c.put(AbstractC9137y.m16154b(Character.TYPE), AbstractC10124a.m18881B(C9122j.f17489a));
        mapM14661c.put(AbstractC9137y.m16154b(char[].class), AbstractC10124a.m18892d());
        mapM14661c.put(AbstractC9137y.m16154b(Double.TYPE), AbstractC10124a.m18882C(C9127o.f17494a));
        mapM14661c.put(AbstractC9137y.m16154b(double[].class), AbstractC10124a.m18893e());
        mapM14661c.put(AbstractC9137y.m16154b(Float.TYPE), AbstractC10124a.m18883D(C9128p.f17495a));
        mapM14661c.put(AbstractC9137y.m16154b(float[].class), AbstractC10124a.m18894f());
        mapM14661c.put(AbstractC9137y.m16154b(Long.TYPE), AbstractC10124a.m18885F(C9134v.f17497a));
        mapM14661c.put(AbstractC9137y.m16154b(long[].class), AbstractC10124a.m18897i());
        mapM14661c.put(AbstractC9137y.m16154b(C8731k.class), AbstractC10124a.m18910v(C8731k.f16357b));
        mapM14661c.put(AbstractC9137y.m16154b(Integer.TYPE), AbstractC10124a.m18884E(C9132t.f17496a));
        mapM14661c.put(AbstractC9137y.m16154b(int[].class), AbstractC10124a.m18895g());
        mapM14661c.put(AbstractC9137y.m16154b(C8729i.class), AbstractC10124a.m18909u(C8729i.f16352b));
        mapM14661c.put(AbstractC9137y.m16154b(Short.TYPE), AbstractC10124a.m18886G(C9110a0.f17476a));
        mapM14661c.put(AbstractC9137y.m16154b(short[].class), AbstractC10124a.m18901m());
        mapM14661c.put(AbstractC9137y.m16154b(C8734n.class), AbstractC10124a.m18911w(C8734n.f16363b));
        mapM14661c.put(AbstractC9137y.m16154b(Byte.TYPE), AbstractC10124a.m18880A(C9121i.f17488a));
        mapM14661c.put(AbstractC9137y.m16154b(byte[].class), AbstractC10124a.m18891c());
        mapM14661c.put(AbstractC9137y.m16154b(C8727g.class), AbstractC10124a.m18908t(C8727g.f16347b));
        mapM14661c.put(AbstractC9137y.m16154b(Boolean.TYPE), AbstractC10124a.m18914z(C9120h.f17487a));
        mapM14661c.put(AbstractC9137y.m16154b(boolean[].class), AbstractC10124a.m18890b());
        mapM14661c.put(AbstractC9137y.m16154b(C8736p.class), AbstractC10124a.m18912x(C8736p.f16368a));
        mapM14661c.put(AbstractC9137y.m16154b(Void.class), AbstractC10124a.m18899k());
        try {
            mapM14661c.put(AbstractC9137y.m16154b(C8738a.class), AbstractC10124a.m18913y(C8738a.f16369b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapM14661c.put(AbstractC9137y.m16154b(C8732l.class), AbstractC10124a.m18905q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapM14661c.put(AbstractC9137y.m16154b(C8730j.class), AbstractC10124a.m18904p());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapM14661c.put(AbstractC9137y.m16154b(C8735o.class), AbstractC10124a.m18906r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapM14661c.put(AbstractC9137y.m16154b(C8728h.class), AbstractC10124a.m18903o());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapM14661c.put(AbstractC9137y.m16154b(Uuid.class), AbstractC10124a.m18888I(Uuid.f17537c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return AbstractC8798p0.m14660b(mapM14661c);
    }

    /* renamed from: j */
    public static final InterfaceC10052b m19552j(Object obj, InterfaceC10052b... interfaceC10052bArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC10052bArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC10052bArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = InterfaceC10052b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC10052bArr, interfaceC10052bArr.length));
            if (objInvoke instanceof InterfaceC10052b) {
                return (InterfaceC10052b) objInvoke;
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
    public static final InterfaceC10052b m19553k(Class cls, InterfaceC10052b... interfaceC10052bArr) {
        Object objM19543a = m19543a(cls, "Companion");
        if (objM19543a == null) {
            return null;
        }
        return m19552j(objM19543a, (InterfaceC10052b[]) Arrays.copyOf(interfaceC10052bArr, interfaceC10052bArr.length));
    }

    /* renamed from: l */
    public static final boolean m19554l(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        return AbstractC10360a.m19298a(interfaceC8375c).isInterface();
    }

    /* renamed from: m */
    public static final boolean m19555m(Class cls) {
        return cls.getAnnotation(InterfaceC10058h.class) == null && cls.getAnnotation(InterfaceC10053c.class) == null;
    }

    /* renamed from: n */
    public static final boolean m19556n(Class cls) {
        if (cls.getAnnotation(InterfaceC10053c.class) != null) {
            return true;
        }
        InterfaceC10058h interfaceC10058h = (InterfaceC10058h) cls.getAnnotation(InterfaceC10058h.class);
        return interfaceC10058h != null && AbstractC9133u.m16128b(AbstractC9137y.m16154b(interfaceC10058h.with()), AbstractC9137y.m16154b(C10056f.class));
    }

    /* renamed from: o */
    public static final boolean m19557o(InterfaceC8375c rootClass) {
        AbstractC9133u.m16133g(rootClass, "rootClass");
        return AbstractC10360a.m19298a(rootClass).isArray();
    }

    /* renamed from: p */
    public static final Void m19558p(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        AbstractC10465x1.m19569f(interfaceC8375c);
        throw new KotlinNothingValueException();
    }

    /* renamed from: q */
    public static final Object[] m19559q(ArrayList arrayList, InterfaceC8375c eClass) throws NegativeArraySizeException {
        AbstractC9133u.m16133g(arrayList, "<this>");
        AbstractC9133u.m16133g(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC10360a.m19298a(eClass), arrayList.size());
        AbstractC9133u.m16131e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        AbstractC9133u.m16132f(array, "toArray(...)");
        return array;
    }
}
