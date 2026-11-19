package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.graphics.drawable.C0113a;
import androidx.collection.C0250d;
import androidx.collection.C0251e;
import androidx.collection.C0253g;
import androidx.collection.C0254h;
import androidx.core.content.C0332a;
import androidx.vectordrawable.graphics.drawable.C0757c;
import androidx.vectordrawable.graphics.drawable.C0762h;
import com.alibaba.sdk.android.push.notification.CustomNotificationBuilder;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p078e.C2466a;
import p156u.C3403a;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public final class C0237w {

    /* renamed from: i */
    private static C0237w f1228i;

    /* renamed from: a */
    private WeakHashMap<Context, C0254h<ColorStateList>> f1230a;

    /* renamed from: b */
    private C0253g<String, e> f1231b;

    /* renamed from: c */
    private C0254h<String> f1232c;

    /* renamed from: d */
    private final WeakHashMap<Context, C0250d<WeakReference<Drawable.ConstantState>>> f1233d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1234e;

    /* renamed from: f */
    private boolean f1235f;

    /* renamed from: g */
    private f f1236g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1227h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final c f1229j = new c(6);

    /* renamed from: androidx.appcompat.widget.w$a */
    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.C0237w.e
        /* renamed from: a */
        public Drawable mo1034a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0113a.m342m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.C0237w.e
        /* renamed from: a */
        public Drawable mo1034a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0757c.m3929a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    private static class c extends C0251e<Integer, PorterDuffColorFilter> {
        public c(int i4) {
            super(i4);
        }

        /* renamed from: h */
        private static int m1035h(int i4, PorterDuff.Mode mode) {
            return ((i4 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: i */
        PorterDuffColorFilter m1036i(int i4, PorterDuff.Mode mode) {
            return m1125c(Integer.valueOf(m1035h(i4, mode)));
        }

        /* renamed from: j */
        PorterDuffColorFilter m1037j(int i4, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m1126d(Integer.valueOf(m1035h(i4, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$d */
    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.C0237w.e
        /* renamed from: a */
        public Drawable mo1034a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e4) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e4);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    private interface e {
        /* renamed from: a */
        Drawable mo1034a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.w$f */
    public interface f {
        /* renamed from: a */
        boolean mo807a(Context context, int i4, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo808b(int i4);

        /* renamed from: c */
        Drawable mo809c(C0237w c0237w, Context context, int i4);

        /* renamed from: d */
        ColorStateList mo810d(Context context, int i4);

        /* renamed from: e */
        boolean mo811e(Context context, int i4, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.w$g */
    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.C0237w.e
        /* renamed from: a */
        public Drawable mo1034a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0762h.m3956c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m1010a(String str, e eVar) {
        if (this.f1231b == null) {
            this.f1231b = new C0253g<>();
        }
        this.f1231b.put(str, eVar);
    }

    /* renamed from: b */
    private synchronized boolean m1011b(Context context, long j4, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0250d<WeakReference<Drawable.ConstantState>> c0250d = this.f1233d.get(context);
        if (c0250d == null) {
            c0250d = new C0250d<>();
            this.f1233d.put(context, c0250d);
        }
        c0250d.m1117i(j4, new WeakReference<>(constantState));
        return true;
    }

    /* renamed from: c */
    private void m1012c(Context context, int i4, ColorStateList colorStateList) {
        if (this.f1230a == null) {
            this.f1230a = new WeakHashMap<>();
        }
        C0254h<ColorStateList> c0254h = this.f1230a.get(context);
        if (c0254h == null) {
            c0254h = new C0254h<>();
            this.f1230a.put(context, c0254h);
        }
        c0254h.m1141a(i4, colorStateList);
    }

    /* renamed from: d */
    private void m1013d(Context context) {
        if (this.f1235f) {
            return;
        }
        this.f1235f = true;
        Drawable drawableM1026j = m1026j(context, C2466a.f10044a);
        if (drawableM1026j == null || !m1022q(drawableM1026j)) {
            this.f1235f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: e */
    private static long m1014e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m1015f(Context context, int i4) throws Resources.NotFoundException {
        if (this.f1234e == null) {
            this.f1234e = new TypedValue();
        }
        TypedValue typedValue = this.f1234e;
        context.getResources().getValue(i4, typedValue, true);
        long jM1014e = m1014e(typedValue);
        Drawable drawableM1018i = m1018i(context, jM1014e);
        if (drawableM1018i != null) {
            return drawableM1018i;
        }
        f fVar = this.f1236g;
        Drawable drawableMo809c = fVar == null ? null : fVar.mo809c(this, context, i4);
        if (drawableMo809c != null) {
            drawableMo809c.setChangingConfigurations(typedValue.changingConfigurations);
            m1011b(context, jM1014e, drawableMo809c);
        }
        return drawableMo809c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m1016g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1019l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0237w m1017h() {
        if (f1228i == null) {
            C0237w c0237w = new C0237w();
            f1228i = c0237w;
            m1021p(c0237w);
        }
        return f1228i;
    }

    /* renamed from: i */
    private synchronized Drawable m1018i(Context context, long j4) {
        C0250d<WeakReference<Drawable.ConstantState>> c0250d = this.f1233d.get(context);
        if (c0250d == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM1113e = c0250d.m1113e(j4);
        if (weakReferenceM1113e != null) {
            Drawable.ConstantState constantState = weakReferenceM1113e.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0250d.m1118j(j4);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m1019l(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM1036i;
        c cVar = f1229j;
        porterDuffColorFilterM1036i = cVar.m1036i(i4, mode);
        if (porterDuffColorFilterM1036i == null) {
            porterDuffColorFilterM1036i = new PorterDuffColorFilter(i4, mode);
            cVar.m1037j(i4, mode, porterDuffColorFilterM1036i);
        }
        return porterDuffColorFilterM1036i;
    }

    /* renamed from: n */
    private ColorStateList m1020n(Context context, int i4) {
        C0254h<ColorStateList> c0254h;
        WeakHashMap<Context, C0254h<ColorStateList>> weakHashMap = this.f1230a;
        if (weakHashMap == null || (c0254h = weakHashMap.get(context)) == null) {
            return null;
        }
        return c0254h.m1144e(i4);
    }

    /* renamed from: p */
    private static void m1021p(C0237w c0237w) {
        if (Build.VERSION.SDK_INT < 24) {
            c0237w.m1010a("vector", new g());
            c0237w.m1010a("animated-vector", new b());
            c0237w.m1010a("animated-selector", new a());
            c0237w.m1010a(CustomNotificationBuilder.NOTIFICATION_ICON_RES_TYPE, new d());
        }
    }

    /* renamed from: q */
    private static boolean m1022q(Drawable drawable) {
        return (drawable instanceof C0762h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: r */
    private Drawable m1023r(Context context, int i4) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        C0253g<String, e> c0253g = this.f1231b;
        if (c0253g == null || c0253g.isEmpty()) {
            return null;
        }
        C0254h<String> c0254h = this.f1232c;
        if (c0254h != null) {
            String strM1144e = c0254h.m1144e(i4);
            if ("appcompat_skip_skip".equals(strM1144e) || (strM1144e != null && this.f1231b.get(strM1144e) == null)) {
                return null;
            }
        } else {
            this.f1232c = new C0254h<>();
        }
        if (this.f1234e == null) {
            this.f1234e = new TypedValue();
        }
        TypedValue typedValue = this.f1234e;
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        long jM1014e = m1014e(typedValue);
        Drawable drawableM1018i = m1018i(context, jM1014e);
        if (drawableM1018i != null) {
            return drawableM1018i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i4);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1232c.m1141a(i4, name);
                e eVar = this.f1231b.get(name);
                if (eVar != null) {
                    drawableM1018i = eVar.mo1034a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM1018i != null) {
                    drawableM1018i.setChangingConfigurations(typedValue.changingConfigurations);
                    m1011b(context, jM1014e, drawableM1018i);
                }
            } catch (Exception e4) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e4);
            }
        }
        if (drawableM1018i == null) {
            this.f1232c.m1141a(i4, "appcompat_skip_skip");
        }
        return drawableM1018i;
    }

    /* renamed from: v */
    private Drawable m1024v(Context context, int i4, boolean z3, Drawable drawable) {
        ColorStateList colorStateListM1028m = m1028m(context, i4);
        if (colorStateListM1028m == null) {
            f fVar = this.f1236g;
            if ((fVar == null || !fVar.mo811e(context, i4, drawable)) && !m1033x(context, i4, drawable) && z3) {
                return null;
            }
            return drawable;
        }
        if (C0231q.m980a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableM10401r = C3403a.m10401r(drawable);
        C3403a.m10398o(drawableM10401r, colorStateListM1028m);
        PorterDuff.Mode modeM1029o = m1029o(i4);
        if (modeM1029o == null) {
            return drawableM10401r;
        }
        C3403a.m10399p(drawableM10401r, modeM1029o);
        return drawableM10401r;
    }

    /* renamed from: w */
    static void m1025w(Drawable drawable, C0210e0 c0210e0, int[] iArr) {
        if (C0231q.m980a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z3 = c0210e0.f1080d;
        if (z3 || c0210e0.f1079c) {
            drawable.setColorFilter(m1016g(z3 ? c0210e0.f1077a : null, c0210e0.f1079c ? c0210e0.f1078b : f1227h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable m1026j(Context context, int i4) {
        return m1027k(context, i4, false);
    }

    /* renamed from: k */
    synchronized Drawable m1027k(Context context, int i4, boolean z3) {
        Drawable drawableM1023r;
        m1013d(context);
        drawableM1023r = m1023r(context, i4);
        if (drawableM1023r == null) {
            drawableM1023r = m1015f(context, i4);
        }
        if (drawableM1023r == null) {
            drawableM1023r = C0332a.m1806d(context, i4);
        }
        if (drawableM1023r != null) {
            drawableM1023r = m1024v(context, i4, z3, drawableM1023r);
        }
        if (drawableM1023r != null) {
            C0231q.m981b(drawableM1023r);
        }
        return drawableM1023r;
    }

    /* renamed from: m */
    synchronized ColorStateList m1028m(Context context, int i4) {
        ColorStateList colorStateListM1020n;
        colorStateListM1020n = m1020n(context, i4);
        if (colorStateListM1020n == null) {
            f fVar = this.f1236g;
            colorStateListM1020n = fVar == null ? null : fVar.mo810d(context, i4);
            if (colorStateListM1020n != null) {
                m1012c(context, i4, colorStateListM1020n);
            }
        }
        return colorStateListM1020n;
    }

    /* renamed from: o */
    PorterDuff.Mode m1029o(int i4) {
        f fVar = this.f1236g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo808b(i4);
    }

    /* renamed from: s */
    public synchronized void m1030s(Context context) {
        C0250d<WeakReference<Drawable.ConstantState>> c0250d = this.f1233d.get(context);
        if (c0250d != null) {
            c0250d.m1111b();
        }
    }

    /* renamed from: t */
    synchronized Drawable m1031t(Context context, C0224l0 c0224l0, int i4) {
        Drawable drawableM1023r = m1023r(context, i4);
        if (drawableM1023r == null) {
            drawableM1023r = c0224l0.m916c(i4);
        }
        if (drawableM1023r == null) {
            return null;
        }
        return m1024v(context, i4, false, drawableM1023r);
    }

    /* renamed from: u */
    public synchronized void m1032u(f fVar) {
        this.f1236g = fVar;
    }

    /* renamed from: x */
    boolean m1033x(Context context, int i4, Drawable drawable) {
        f fVar = this.f1236g;
        return fVar != null && fVar.mo807a(context, i4, drawable);
    }
}
