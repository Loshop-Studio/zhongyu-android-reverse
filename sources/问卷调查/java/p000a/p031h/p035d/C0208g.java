package p000a.p031h.p035d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p033c.p034b.C0196d;
import p000a.p031h.p033c.p034b.C0197e;
import p000a.p031h.p040g.C0230l;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.d.g */
/* loaded from: classes.dex */
public class C0208g extends C0206e {

    /* renamed from: g */
    public final Class<?> f1472g;

    /* renamed from: h */
    public final Constructor<?> f1473h;

    /* renamed from: i */
    public final Method f1474i;

    /* renamed from: j */
    public final Method f1475j;

    /* renamed from: k */
    public final Method f1476k;

    /* renamed from: l */
    public final Method f1477l;

    /* renamed from: m */
    public final Method f1478m;

    public C0208g() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodMo781p;
        Method method;
        Constructor<?> constructor;
        Method methodM779n;
        Method methodM780o;
        Method method2;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            methodM779n = m779n(cls2);
            methodM780o = m780o(cls2);
            method2 = cls2.getMethod("freeze", new Class[0]);
            method = cls2.getMethod("abortCreation", new Class[0]);
            methodMo781p = mo781p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder sbM2079g = C0561a.m2079g("Unable to collect necessary methods for class ");
            sbM2079g.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sbM2079g.toString(), e2);
            methodMo781p = null;
            method = null;
            constructor = null;
            methodM779n = null;
            methodM780o = null;
            method2 = null;
        }
        this.f1472g = cls;
        this.f1473h = constructor;
        this.f1474i = methodM779n;
        this.f1475j = methodM780o;
        this.f1476k = method2;
        this.f1477l = method;
        this.f1478m = methodMo781p;
    }

    /* renamed from: m */
    private Object m772m() {
        try {
            return this.f1473h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p000a.p031h.p035d.C0206e, p000a.p031h.p035d.C0212k
    /* renamed from: a */
    public Typeface mo768a(Context context, C0196d c0196d, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m778l()) {
            return super.mo768a(context, c0196d, resources, i);
        }
        Object objM772m = m772m();
        if (objM772m == null) {
            return null;
        }
        for (C0197e c0197e : c0196d.f1430a) {
            if (!m775i(context, objM772m, c0197e.f1431a, c0197e.f1435e, c0197e.f1432b, c0197e.f1433c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0197e.f1434d))) {
                m774h(objM772m);
                return null;
            }
        }
        if (m777k(objM772m)) {
            return mo776j(objM772m);
        }
        return null;
    }

    @Override // p000a.p031h.p035d.C0206e, p000a.p031h.p035d.C0212k
    /* renamed from: b */
    public Typeface mo769b(Context context, CancellationSignal cancellationSignal, C0230l[] c0230lArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceMo776j;
        boolean zBooleanValue;
        if (c0230lArr.length < 1) {
            return null;
        }
        if (!m778l()) {
            C0230l c0230l = (C0230l) C0212k.m785e(c0230lArr, i, new C0211j(this));
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0230l.f1514a, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0230l.f1516c).setItalic(c0230l.f1517d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C0230l c0230l2 : c0230lArr) {
            if (c0230l2.f1518e == 0) {
                Uri uri = c0230l2.f1514a;
                if (!map.containsKey(uri)) {
                    map.put(uri, C0190e.m692E(context, cancellationSignal, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM772m = m772m();
        if (objM772m == null) {
            return null;
        }
        int length = c0230lArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            C0230l c0230l3 = c0230lArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0230l3.f1514a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f1475j.invoke(objM772m, byteBuffer, Integer.valueOf(c0230l3.f1515b), null, Integer.valueOf(c0230l3.f1516c), Integer.valueOf(c0230l3.f1517d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m774h(objM772m);
                    return null;
                }
                z = true;
            }
            i2++;
            z = z;
        }
        if (!z) {
            m774h(objM772m);
            return null;
        }
        if (m777k(objM772m) && (typefaceMo776j = mo776j(objM772m)) != null) {
            return Typeface.create(typefaceMo776j, i);
        }
        return null;
    }

    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: d */
    public Typeface mo773d(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m778l()) {
            return super.mo773d(context, resources, i, str, i2);
        }
        Object objM772m = m772m();
        if (objM772m == null) {
            return null;
        }
        if (!m775i(context, objM772m, str, 0, -1, -1, null)) {
            m774h(objM772m);
            return null;
        }
        if (m777k(objM772m)) {
            return mo776j(objM772m);
        }
        return null;
    }

    /* renamed from: h */
    public final void m774h(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f1477l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: i */
    public final boolean m775i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1474i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public Typeface mo776j(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f1472g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f1478m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final boolean m777k(Object obj) {
        try {
            return ((Boolean) this.f1476k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m778l() {
        if (this.f1474i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1474i != null;
    }

    /* renamed from: n */
    public Method m779n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: o */
    public Method m780o(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: p */
    public Method mo781p(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
