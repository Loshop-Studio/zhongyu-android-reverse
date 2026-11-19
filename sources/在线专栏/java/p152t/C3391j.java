package p152t;

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
import java.util.Map;
import p148s.C3365c;
import p176z.C3504f;

/* renamed from: t.j */
/* loaded from: classes.dex */
public class C3391j extends C3389h {

    /* renamed from: g */
    protected final Class<?> f11920g;

    /* renamed from: h */
    protected final Constructor<?> f11921h;

    /* renamed from: i */
    protected final Method f11922i;

    /* renamed from: j */
    protected final Method f11923j;

    /* renamed from: k */
    protected final Method f11924k;

    /* renamed from: l */
    protected final Method f11925l;

    /* renamed from: m */
    protected final Method f11926m;

    public C3391j() throws NoSuchMethodException, SecurityException {
        Method methodMo10355t;
        Constructor<?> constructorM10357v;
        Method methodM10353r;
        Method methodM10354s;
        Method methodM10358w;
        Method methodM10352q;
        Class<?> cls = null;
        try {
            Class<?> clsM10356u = m10356u();
            constructorM10357v = m10357v(clsM10356u);
            methodM10353r = m10353r(clsM10356u);
            methodM10354s = m10354s(clsM10356u);
            methodM10358w = m10358w(clsM10356u);
            methodM10352q = m10352q(clsM10356u);
            methodMo10355t = mo10355t(clsM10356u);
            cls = clsM10356u;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e4.getClass().getName(), e4);
            methodMo10355t = null;
            constructorM10357v = null;
            methodM10353r = null;
            methodM10354s = null;
            methodM10358w = null;
            methodM10352q = null;
        }
        this.f11920g = cls;
        this.f11921h = constructorM10357v;
        this.f11922i = methodM10353r;
        this.f11923j = methodM10354s;
        this.f11924k = methodM10358w;
        this.f11925l = methodM10352q;
        this.f11926m = methodMo10355t;
    }

    /* renamed from: k */
    private Object m10344k() {
        try {
            return this.f11921h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private void m10345l(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f11925l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: m */
    private boolean m10346m(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f11922i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: n */
    private boolean m10347n(Object obj, ByteBuffer byteBuffer, int i4, int i5, int i6) {
        try {
            return ((Boolean) this.f11923j.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Integer.valueOf(i6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m10348o(Object obj) {
        try {
            return ((Boolean) this.f11924k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m10349p() {
        if (this.f11922i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f11922i != null;
    }

    @Override // p152t.C3389h, p152t.C3394m
    /* renamed from: a */
    public Typeface mo10338a(Context context, C3365c.b bVar, Resources resources, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m10349p()) {
            return super.mo10338a(context, bVar, resources, i4);
        }
        Object objM10344k = m10344k();
        if (objM10344k == null) {
            return null;
        }
        for (C3365c.c cVar : bVar.m10212a()) {
            if (!m10346m(context, objM10344k, cVar.m10213a(), cVar.m10215c(), cVar.m10217e(), cVar.m10218f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m10216d()))) {
                m10345l(objM10344k);
                return null;
            }
        }
        if (m10348o(objM10344k)) {
            return mo10351h(objM10344k);
        }
        return null;
    }

    @Override // p152t.C3389h, p152t.C3394m
    /* renamed from: b */
    public Typeface mo10339b(Context context, CancellationSignal cancellationSignal, C3504f.b[] bVarArr, int i4) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceMo10351h;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m10349p()) {
            C3504f.b bVarMo10359f = mo10359f(bVarArr, i4);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarMo10359f.m10674d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarMo10359f.m10675e()).setItalic(bVarMo10359f.m10676f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapM10373h = C3395n.m10373h(context, bVarArr, cancellationSignal);
        Object objM10344k = m10344k();
        if (objM10344k == null) {
            return null;
        }
        boolean z3 = false;
        for (C3504f.b bVar : bVarArr) {
            ByteBuffer byteBuffer = mapM10373h.get(bVar.m10674d());
            if (byteBuffer != null) {
                if (!m10347n(objM10344k, byteBuffer, bVar.m10673c(), bVar.m10675e(), bVar.m10676f() ? 1 : 0)) {
                    m10345l(objM10344k);
                    return null;
                }
                z3 = true;
            }
        }
        if (!z3) {
            m10345l(objM10344k);
            return null;
        }
        if (m10348o(objM10344k) && (typefaceMo10351h = mo10351h(objM10344k)) != null) {
            return Typeface.create(typefaceMo10351h, i4);
        }
        return null;
    }

    @Override // p152t.C3394m
    /* renamed from: d */
    public Typeface mo10350d(Context context, Resources resources, int i4, String str, int i5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m10349p()) {
            return super.mo10350d(context, resources, i4, str, i5);
        }
        Object objM10344k = m10344k();
        if (objM10344k == null) {
            return null;
        }
        if (!m10346m(context, objM10344k, str, 0, -1, -1, null)) {
            m10345l(objM10344k);
            return null;
        }
        if (m10348o(objM10344k)) {
            return mo10351h(objM10344k);
        }
        return null;
    }

    /* renamed from: h */
    protected Typeface mo10351h(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f11920g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f11926m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: q */
    protected Method m10352q(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: r */
    protected Method m10353r(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: s */
    protected Method m10354s(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: t */
    protected Method mo10355t(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: u */
    protected Class<?> m10356u() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: v */
    protected Constructor<?> m10357v(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: w */
    protected Method m10358w(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}
