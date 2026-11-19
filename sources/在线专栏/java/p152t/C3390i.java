package p152t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.C0253g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p148s.C3365c;
import p176z.C3504f;

/* renamed from: t.i */
/* loaded from: classes.dex */
class C3390i extends C3394m {

    /* renamed from: b */
    private static final Class<?> f11916b;

    /* renamed from: c */
    private static final Constructor<?> f11917c;

    /* renamed from: d */
    private static final Method f11918d;

    /* renamed from: e */
    private static final Method f11919e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            method2 = null;
        }
        f11917c = constructor;
        f11916b = cls;
        f11918d = method2;
        f11919e = method;
    }

    C3390i() {
    }

    /* renamed from: g */
    private static boolean m10340g(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z3) {
        try {
            return ((Boolean) f11918d.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: h */
    private static Typeface m10341h(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(f11916b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f11919e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m10342i() {
        Method method = f11918d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: j */
    private static Object m10343j() {
        try {
            return f11917c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p152t.C3394m
    /* renamed from: a */
    public Typeface mo10338a(Context context, C3365c.b bVar, Resources resources, int i4) {
        Object objM10343j = m10343j();
        if (objM10343j == null) {
            return null;
        }
        for (C3365c.c cVar : bVar.m10212a()) {
            ByteBuffer byteBufferM10367b = C3395n.m10367b(context, resources, cVar.m10214b());
            if (byteBufferM10367b == null || !m10340g(objM10343j, byteBufferM10367b, cVar.m10215c(), cVar.m10217e(), cVar.m10218f())) {
                return null;
            }
        }
        return m10341h(objM10343j);
    }

    @Override // p152t.C3394m
    /* renamed from: b */
    public Typeface mo10339b(Context context, CancellationSignal cancellationSignal, C3504f.b[] bVarArr, int i4) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objM10343j = m10343j();
        if (objM10343j == null) {
            return null;
        }
        C0253g c0253g = new C0253g();
        for (C3504f.b bVar : bVarArr) {
            Uri uriM10674d = bVar.m10674d();
            ByteBuffer byteBufferM10371f = (ByteBuffer) c0253g.get(uriM10674d);
            if (byteBufferM10371f == null) {
                byteBufferM10371f = C3395n.m10371f(context, cancellationSignal, uriM10674d);
                c0253g.put(uriM10674d, byteBufferM10371f);
            }
            if (byteBufferM10371f == null || !m10340g(objM10343j, byteBufferM10371f, bVar.m10673c(), bVar.m10675e(), bVar.m10676f())) {
                return null;
            }
        }
        Typeface typefaceM10341h = m10341h(objM10343j);
        if (typefaceM10341h == null) {
            return null;
        }
        return Typeface.create(typefaceM10341h, i4);
    }
}
