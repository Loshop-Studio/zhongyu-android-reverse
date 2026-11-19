package p000a.p005b.p014h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import io.github.inflationx.calligraphy3.C1088R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p009e.p010a.C0035a;
import p000a.p005b.p014h.C0085i;
import p000a.p021e.C0132d;
import p000a.p021e.C0133e;
import p000a.p021e.C0134f;
import p000a.p021e.C0136h;
import p000a.p021e.C0137i;
import p000a.p064r.p065a.p066a.C0437b;
import p000a.p064r.p065a.p066a.C0441f;

/* renamed from: a.b.h.k0 */
/* loaded from: classes.dex */
public final class C0090k0 {

    /* renamed from: i */
    public static C0090k0 f696i;

    /* renamed from: a */
    public WeakHashMap<Context, C0137i<ColorStateList>> f698a;

    /* renamed from: b */
    public C0136h<String, e> f699b;

    /* renamed from: c */
    public C0137i<String> f700c;

    /* renamed from: d */
    public final WeakHashMap<Context, C0133e<WeakReference<Drawable.ConstantState>>> f701d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f702e;

    /* renamed from: f */
    public boolean f703f;

    /* renamed from: g */
    public f f704g;

    /* renamed from: h */
    public static final PorterDuff.Mode f695h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final c f697j = new c(6);

    /* renamed from: a.b.h.k0$a */
    public static class a implements e {
        @Override // p000a.p005b.p014h.C0090k0.e
        /* renamed from: a */
        public Drawable mo362a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0035a.m130g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* renamed from: a.b.h.k0$b */
    public static class b implements e {
        @Override // p000a.p005b.p014h.C0090k0.e
        /* renamed from: a */
        public Drawable mo362a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C0437b c0437b = new C0437b(context, null, null);
                c0437b.inflate(resources, xmlPullParser, attributeSet, theme);
                return c0437b;
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: a.b.h.k0$c */
    public static class c extends C0134f<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }
    }

    /* renamed from: a.b.h.k0$d */
    public static class d implements e {
        @Override // p000a.p005b.p014h.C0090k0.e
        /* renamed from: a */
        public Drawable mo362a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e2) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                return null;
            }
        }
    }

    /* renamed from: a.b.h.k0$e */
    public interface e {
        /* renamed from: a */
        Drawable mo362a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: a.b.h.k0$f */
    public interface f {
    }

    /* renamed from: a.b.h.k0$g */
    public static class g implements e {
        @Override // p000a.p005b.p014h.C0090k0.e
        /* renamed from: a */
        public Drawable mo362a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0441f.m1492a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: d */
    public static synchronized C0090k0 m349d() {
        if (f696i == null) {
            C0090k0 c0090k0 = new C0090k0();
            f696i = c0090k0;
            m351j(c0090k0);
        }
        return f696i;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m350h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM500a;
        c cVar = f697j;
        Objects.requireNonNull(cVar);
        int i2 = (i + 31) * 31;
        porterDuffColorFilterM500a = cVar.m500a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilterM500a == null) {
            porterDuffColorFilterM500a = new PorterDuffColorFilter(i, mode);
            Objects.requireNonNull(cVar);
            cVar.m501b(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilterM500a);
        }
        return porterDuffColorFilterM500a;
    }

    /* renamed from: j */
    public static void m351j(C0090k0 c0090k0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0090k0.m352a("vector", new g());
            c0090k0.m352a("animated-vector", new b());
            c0090k0.m352a("animated-selector", new a());
            c0090k0.m352a("drawable", new d());
        }
    }

    /* renamed from: a */
    public final void m352a(String str, e eVar) {
        if (this.f699b == null) {
            this.f699b = new C0136h<>();
        }
        this.f699b.put(str, eVar);
    }

    /* renamed from: b */
    public final synchronized boolean m353b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0133e<WeakReference<Drawable.ConstantState>> c0133e = this.f701d.get(context);
            if (c0133e == null) {
                c0133e = new C0133e<>();
                this.f701d.put(context, c0133e);
            }
            c0133e.m497g(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final Drawable m354c(Context context, int i) throws Resources.NotFoundException {
        int i2;
        if (this.f702e == null) {
            this.f702e = new TypedValue();
        }
        TypedValue typedValue = this.f702e;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableM355e = m355e(context, j);
        if (drawableM355e != null) {
            return drawableM355e;
        }
        f fVar = this.f704g;
        LayerDrawable layerDrawableM341c = null;
        if (fVar != null) {
            C0085i.a aVar = (C0085i.a) fVar;
            if (i == C1088R.drawable.abc_cab_background_top_material) {
                layerDrawableM341c = new LayerDrawable(new Drawable[]{m356f(context, C1088R.drawable.abc_cab_background_internal_bg), m356f(context, C1088R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i == C1088R.drawable.abc_ratingbar_material) {
                    i2 = C1088R.dimen.abc_star_big;
                } else if (i == C1088R.drawable.abc_ratingbar_indicator_material) {
                    i2 = C1088R.dimen.abc_star_medium;
                } else if (i == C1088R.drawable.abc_ratingbar_small_material) {
                    i2 = C1088R.dimen.abc_star_small;
                }
                layerDrawableM341c = aVar.m341c(this, context, i2);
            }
        }
        if (layerDrawableM341c != null) {
            layerDrawableM341c.setChangingConfigurations(typedValue.changingConfigurations);
            m353b(context, j, layerDrawableM341c);
        }
        return layerDrawableM341c;
    }

    /* renamed from: e */
    public final synchronized Drawable m355e(Context context, long j) {
        C0133e<WeakReference<Drawable.ConstantState>> c0133e = this.f701d.get(context);
        if (c0133e == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM496f = c0133e.m496f(j, null);
        if (weakReferenceM496f != null) {
            Drawable.ConstantState constantState = weakReferenceM496f.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM486b = C0132d.m486b(c0133e.f919c, c0133e.f921e, j);
            if (iM486b >= 0) {
                Object[] objArr = c0133e.f920d;
                Object obj = objArr[iM486b];
                Object obj2 = C0133e.f917f;
                if (obj != obj2) {
                    objArr[iM486b] = obj2;
                    c0133e.f918b = true;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public synchronized Drawable m356f(Context context, int i) {
        return m357g(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r0 != false) goto L15;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.drawable.Drawable m357g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f703f     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L6
            goto L2b
        L6:
            r0 = 1
            r4.f703f = r0     // Catch: java.lang.Throwable -> L49
            r1 = 2131230804(0x7f080054, float:1.8077671E38)
            android.graphics.drawable.Drawable r1 = r4.m356f(r5, r1)     // Catch: java.lang.Throwable -> L49
            r2 = 0
            if (r1 == 0) goto L4b
            boolean r3 = r1 instanceof p000a.p064r.p065a.p066a.C0441f     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L29
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L49
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L28
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L4b
        L2b:
            android.graphics.drawable.Drawable r0 = r4.m359k(r5, r6)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L35
            android.graphics.drawable.Drawable r0 = r4.m354c(r5, r6)     // Catch: java.lang.Throwable -> L49
        L35:
            if (r0 != 0) goto L3d
            java.lang.Object r0 = p000a.p031h.p033c.C0192a.f1425a     // Catch: java.lang.Throwable -> L49
            android.graphics.drawable.Drawable r0 = p000a.p031h.p033c.C0192a.c.m739b(r5, r6)     // Catch: java.lang.Throwable -> L49
        L3d:
            if (r0 == 0) goto L43
            android.graphics.drawable.Drawable r0 = r4.m360l(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L49
        L43:
            if (r0 == 0) goto L47
            int[] r5 = p000a.p005b.p014h.C0071b0.f554a     // Catch: java.lang.Throwable -> L49
        L47:
            monitor-exit(r4)
            return r0
        L49:
            r5 = move-exception
            goto L55
        L4b:
            r4.f703f = r2     // Catch: java.lang.Throwable -> L49
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L49
            throw r5     // Catch: java.lang.Throwable -> L49
        L55:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0090k0.m357g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: i */
    public synchronized ColorStateList m358i(Context context, int i) {
        ColorStateList colorStateListM521d;
        C0137i<ColorStateList> c0137i;
        WeakHashMap<Context, C0137i<ColorStateList>> weakHashMap = this.f698a;
        colorStateListM521d = (weakHashMap == null || (c0137i = weakHashMap.get(context)) == null) ? null : c0137i.m521d(i, null);
        if (colorStateListM521d == null) {
            f fVar = this.f704g;
            ColorStateList colorStateListM342d = fVar != null ? ((C0085i.a) fVar).m342d(context, i) : null;
            if (colorStateListM342d != null) {
                if (this.f698a == null) {
                    this.f698a = new WeakHashMap<>();
                }
                C0137i<ColorStateList> c0137i2 = this.f698a.get(context);
                if (c0137i2 == null) {
                    c0137i2 = new C0137i<>();
                    this.f698a.put(context, c0137i2);
                }
                c0137i2.m518a(i, colorStateListM342d);
            }
            colorStateListM521d = colorStateListM342d;
        }
        return colorStateListM521d;
    }

    /* renamed from: k */
    public final Drawable m359k(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        C0136h<String, e> c0136h = this.f699b;
        if (c0136h == null || c0136h.isEmpty()) {
            return null;
        }
        C0137i<String> c0137i = this.f700c;
        if (c0137i != null) {
            String strM521d = c0137i.m521d(i, null);
            if ("appcompat_skip_skip".equals(strM521d) || (strM521d != null && this.f699b.getOrDefault(strM521d, null) == null)) {
                return null;
            }
        } else {
            this.f700c = new C0137i<>();
        }
        if (this.f702e == null) {
            this.f702e = new TypedValue();
        }
        TypedValue typedValue = this.f702e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableM355e = m355e(context, j);
        if (drawableM355e != null) {
            return drawableM355e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
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
                this.f700c.m518a(i, name);
                e eVar = this.f699b.get(name);
                if (eVar != null) {
                    drawableM355e = eVar.mo362a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM355e != null) {
                    drawableM355e.setChangingConfigurations(typedValue.changingConfigurations);
                    m353b(context, j, drawableM355e);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableM355e == null) {
            this.f700c.m518a(i, "appcompat_skip_skip");
        }
        return drawableM355e;
    }

    /* renamed from: l */
    public final Drawable m360l(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListM358i = m358i(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM358i != null) {
            if (C0071b0.m282a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(colorStateListM358i);
            f fVar = this.f704g;
            if (fVar != null) {
                if (i == C1088R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        f fVar2 = this.f704g;
        if (fVar2 != null) {
            C0085i.a aVar = (C0085i.a) fVar2;
            Objects.requireNonNull(aVar);
            boolean z2 = true;
            if (i == C1088R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iM378c = C0100p0.m378c(context, C1088R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0085i.f675b;
                aVar.m343e(drawableFindDrawableByLayerId, iM378c, mode2);
                aVar.m343e(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0100p0.m378c(context, C1088R.attr.colorControlNormal), mode2);
                aVar.m343e(layerDrawable.findDrawableByLayerId(R.id.progress), C0100p0.m378c(context, C1088R.attr.colorControlActivated), mode2);
            } else if (i == C1088R.drawable.abc_ratingbar_material || i == C1088R.drawable.abc_ratingbar_indicator_material || i == C1088R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iM377b = C0100p0.m377b(context, C1088R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0085i.f675b;
                aVar.m343e(drawableFindDrawableByLayerId2, iM377b, mode3);
                aVar.m343e(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), C0100p0.m378c(context, C1088R.attr.colorControlActivated), mode3);
                aVar.m343e(layerDrawable2.findDrawableByLayerId(R.id.progress), C0100p0.m378c(context, C1088R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (m361m(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m361m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            a.b.h.k0$f r0 = r7.f704g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L72
            a.b.h.i$a r0 = (p000a.p005b.p014h.C0085i.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = p000a.p005b.p014h.C0085i.f675b
            int[] r4 = r0.f678a
            boolean r4 = r0.m339a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1d
            r5 = 2130968929(0x7f040161, float:1.7546526E38)
            goto L49
        L1d:
            int[] r4 = r0.f680c
            boolean r4 = r0.m339a(r4, r9)
            if (r4 == 0) goto L29
            r5 = 2130968927(0x7f04015f, float:1.7546521E38)
            goto L49
        L29:
            int[] r4 = r0.f681d
            boolean r0 = r0.m339a(r4, r9)
            if (r0 == 0) goto L34
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L49
        L34:
            r0 = 2131230763(0x7f08002b, float:1.8077588E38)
            if (r9 != r0) goto L44
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L4b
        L44:
            r0 = 2131230745(0x7f080019, float:1.8077551E38)
            if (r9 != r0) goto L4d
        L49:
            r9 = r5
            r0 = r6
        L4b:
            r4 = r1
            goto L50
        L4d:
            r9 = r2
            r4 = r9
            r0 = r6
        L50:
            if (r4 == 0) goto L6e
            boolean r4 = p000a.p005b.p014h.C0071b0.m282a(r10)
            if (r4 == 0) goto L5c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L5c:
            int r8 = p000a.p005b.p014h.C0100p0.m378c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = p000a.p005b.p014h.C0085i.m334c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L6c
            r10.setAlpha(r0)
        L6c:
            r8 = r1
            goto L6f
        L6e:
            r8 = r2
        L6f:
            if (r8 == 0) goto L72
            goto L73
        L72:
            r1 = r2
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0090k0.m361m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
