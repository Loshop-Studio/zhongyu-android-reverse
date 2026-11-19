package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.C0114b;
import androidx.appcompat.graphics.drawable.C0116d;
import androidx.appcompat.widget.C0237w;
import androidx.collection.C0250d;
import androidx.collection.C0254h;
import androidx.vectordrawable.graphics.drawable.C0757c;
import androidx.vectordrawable.graphics.drawable.C0762h;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p078e.C2467b;
import p148s.C3369g;
import p156u.InterfaceC3404b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.graphics.drawable.a */
/* loaded from: classes.dex */
public class C0113a extends C0116d implements InterfaceC3404b {

    /* renamed from: t */
    private static final String f424t = C0113a.class.getSimpleName();

    /* renamed from: o */
    private c f425o;

    /* renamed from: p */
    private g f426p;

    /* renamed from: q */
    private int f427q;

    /* renamed from: r */
    private int f428r;

    /* renamed from: s */
    private boolean f429s;

    /* renamed from: androidx.appcompat.graphics.drawable.a$b */
    private static class b extends g {

        /* renamed from: a */
        private final Animatable f430a;

        b(Animatable animatable) {
            super();
            this.f430a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.C0113a.g
        /* renamed from: c */
        public void mo354c() {
            this.f430a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0113a.g
        /* renamed from: d */
        public void mo355d() {
            this.f430a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$c */
    static class c extends C0116d.a {

        /* renamed from: K */
        C0250d<Long> f431K;

        /* renamed from: L */
        C0254h<Integer> f432L;

        c(c cVar, C0113a c0113a, Resources resources) {
            super(cVar, c0113a, resources);
            if (cVar != null) {
                this.f431K = cVar.f431K;
                this.f432L = cVar.f432L;
            } else {
                this.f431K = new C0250d<>();
                this.f432L = new C0254h<>();
            }
        }

        /* renamed from: D */
        private static long m356D(int i4, int i5) {
            return i5 | (i4 << 32);
        }

        /* renamed from: B */
        int m357B(int[] iArr, Drawable drawable, int i4) {
            int iM407z = super.m407z(iArr, drawable);
            this.f432L.m1148i(iM407z, Integer.valueOf(i4));
            return iM407z;
        }

        /* renamed from: C */
        int m358C(int i4, int i5, Drawable drawable, boolean z3) {
            int iM383a = super.m383a(drawable);
            long jM356D = m356D(i4, i5);
            long j4 = z3 ? 8589934592L : 0L;
            long j5 = iM383a;
            this.f431K.m1110a(jM356D, Long.valueOf(j5 | j4));
            if (z3) {
                this.f431K.m1110a(m356D(i5, i4), Long.valueOf(4294967296L | j5 | j4));
            }
            return iM383a;
        }

        /* renamed from: E */
        int m359E(int i4) {
            if (i4 < 0) {
                return 0;
            }
            return this.f432L.m1145f(i4, 0).intValue();
        }

        /* renamed from: F */
        int m360F(int[] iArr) {
            int iM406A = super.m406A(iArr);
            return iM406A >= 0 ? iM406A : super.m406A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m361G(int i4, int i5) {
            return (int) this.f431K.m1114f(m356D(i4, i5), -1L).longValue();
        }

        /* renamed from: H */
        boolean m362H(int i4, int i5) {
            return (this.f431K.m1114f(m356D(i4, i5), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        boolean m363I(int i4, int i5) {
            return (this.f431K.m1114f(m356D(i4, i5), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.C0116d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0113a(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.C0116d.a, androidx.appcompat.graphics.drawable.C0114b.d
        /* renamed from: r */
        void mo364r() {
            this.f431K = this.f431K.clone();
            this.f432L = this.f432L.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.C0116d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0113a(this, resources);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$d */
    private static class d extends g {

        /* renamed from: a */
        private final C0757c f433a;

        d(C0757c c0757c) {
            super();
            this.f433a = c0757c;
        }

        @Override // androidx.appcompat.graphics.drawable.C0113a.g
        /* renamed from: c */
        public void mo354c() {
            this.f433a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0113a.g
        /* renamed from: d */
        public void mo355d() {
            this.f433a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$e */
    private static class e extends g {

        /* renamed from: a */
        private final ObjectAnimator f434a;

        /* renamed from: b */
        private final boolean f435b;

        e(AnimationDrawable animationDrawable, boolean z3, boolean z4) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i4 = z3 ? numberOfFrames - 1 : 0;
            int i5 = z3 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z3);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i4, i5);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.m367a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f435b = z4;
            this.f434a = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.C0113a.g
        /* renamed from: a */
        public boolean mo365a() {
            return this.f435b;
        }

        @Override // androidx.appcompat.graphics.drawable.C0113a.g
        /* renamed from: b */
        public void mo366b() {
            this.f434a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.C0113a.g
        /* renamed from: c */
        public void mo354c() {
            this.f434a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.C0113a.g
        /* renamed from: d */
        public void mo355d() {
            this.f434a.cancel();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$f */
    private static class f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f436a;

        /* renamed from: b */
        private int f437b;

        /* renamed from: c */
        private int f438c;

        f(AnimationDrawable animationDrawable, boolean z3) {
            m368b(animationDrawable, z3);
        }

        /* renamed from: a */
        int m367a() {
            return this.f438c;
        }

        /* renamed from: b */
        int m368b(AnimationDrawable animationDrawable, boolean z3) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f437b = numberOfFrames;
            int[] iArr = this.f436a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f436a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f436a;
            int i4 = 0;
            for (int i5 = 0; i5 < numberOfFrames; i5++) {
                int duration = animationDrawable.getDuration(z3 ? (numberOfFrames - i5) - 1 : i5);
                iArr2[i5] = duration;
                i4 += duration;
            }
            this.f438c = i4;
            return i4;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            int i4 = (int) ((f4 * this.f438c) + 0.5f);
            int i5 = this.f437b;
            int[] iArr = this.f436a;
            int i6 = 0;
            while (i6 < i5 && i4 >= iArr[i6]) {
                i4 -= iArr[i6];
                i6++;
            }
            return (i6 / i5) + (i6 < i5 ? i4 / this.f438c : IGoodView.DEFAULT_TO_ALPHA);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$g */
    private static abstract class g {
        private g() {
        }

        /* renamed from: a */
        public boolean mo365a() {
            return false;
        }

        /* renamed from: b */
        public void mo366b() {
        }

        /* renamed from: c */
        public abstract void mo354c();

        /* renamed from: d */
        public abstract void mo355d();
    }

    public C0113a() {
        this(null, null);
    }

    /* renamed from: m */
    public static C0113a m342m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IllegalAccessException, NoSuchMethodException, SecurityException, IOException, IllegalArgumentException, InvocationTargetException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0113a c0113a = new C0113a();
            c0113a.m353n(context, resources, xmlPullParser, attributeSet, theme);
            return c0113a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m343o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m345q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m346r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: p */
    private void m344p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m345q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C2467b.f10052h);
        int resourceId = typedArrayM10255k.getResourceId(C2467b.f10053i, 0);
        int resourceId2 = typedArrayM10255k.getResourceId(C2467b.f10054j, -1);
        Drawable drawableM1026j = resourceId2 > 0 ? C0237w.m1017h().m1026j(context, resourceId2) : null;
        typedArrayM10255k.recycle();
        int[] iArrM405k = m405k(attributeSet);
        if (drawableM1026j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableM1026j = xmlPullParser.getName().equals("vector") ? C0762h.m3956c(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableM1026j != null) {
            return this.f425o.m357B(iArrM405k, drawableM1026j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m346r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C2467b.f10055k);
        int resourceId = typedArrayM10255k.getResourceId(C2467b.f10058n, -1);
        int resourceId2 = typedArrayM10255k.getResourceId(C2467b.f10057m, -1);
        int resourceId3 = typedArrayM10255k.getResourceId(C2467b.f10056l, -1);
        Drawable drawableM1026j = resourceId3 > 0 ? C0237w.m1017h().m1026j(context, resourceId3) : null;
        boolean z3 = typedArrayM10255k.getBoolean(C2467b.f10059o, false);
        typedArrayM10255k.recycle();
        if (drawableM1026j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableM1026j = xmlPullParser.getName().equals("animated-vector") ? C0757c.m3929a(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableM1026j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f425o.m358C(resourceId, resourceId2, drawableM1026j, z3);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* renamed from: s */
    private boolean m347s(int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iM373c;
        int iM361G;
        g bVar;
        g gVar = this.f426p;
        if (gVar == null) {
            iM373c = m373c();
        } else {
            if (i4 == this.f427q) {
                return true;
            }
            if (i4 == this.f428r && gVar.mo365a()) {
                gVar.mo366b();
                this.f427q = this.f428r;
                this.f428r = i4;
                return true;
            }
            iM373c = this.f427q;
            gVar.mo355d();
        }
        this.f426p = null;
        this.f428r = -1;
        this.f427q = -1;
        c cVar = this.f425o;
        int iM359E = cVar.m359E(iM373c);
        int iM359E2 = cVar.m359E(i4);
        if (iM359E2 == 0 || iM359E == 0 || (iM361G = cVar.m361G(iM359E, iM359E2)) < 0) {
            return false;
        }
        boolean zM363I = cVar.m363I(iM359E, iM359E2);
        m374g(iM361G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m362H(iM359E, iM359E2), zM363I);
        } else {
            if (!(current instanceof C0757c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C0757c) current);
        }
        bVar.mo354c();
        this.f426p = bVar;
        this.f428r = iM373c;
        this.f427q = i4;
        return true;
    }

    /* renamed from: t */
    private void m348t(TypedArray typedArray) {
        c cVar = this.f425o;
        cVar.f465d |= typedArray.getChangingConfigurations();
        cVar.m403x(typedArray.getBoolean(C2467b.f10048d, cVar.f470i));
        cVar.m399t(typedArray.getBoolean(C2467b.f10049e, cVar.f473l));
        cVar.m400u(typedArray.getInt(C2467b.f10050f, cVar.f453A));
        cVar.m401v(typedArray.getInt(C2467b.f10051g, cVar.f454B));
        setDither(typedArray.getBoolean(C2467b.f10046b, cVar.f485x));
    }

    @Override // androidx.appcompat.graphics.drawable.C0116d, androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.C0116d, androidx.appcompat.graphics.drawable.C0114b
    /* renamed from: h */
    void mo350h(C0114b.d dVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.mo350h(dVar);
        if (dVar instanceof c) {
            this.f425o = (c) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // androidx.appcompat.graphics.drawable.C0116d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.jumpToCurrentState();
        g gVar = this.f426p;
        if (gVar != null) {
            gVar.mo355d();
            this.f426p = null;
            m374g(this.f427q);
            this.f427q = -1;
            this.f428r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.C0116d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c mo349b() {
        return new c(this.f425o, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.C0116d, androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f429s && super.mutate() == this) {
            this.f425o.mo364r();
            this.f429s = true;
        }
        return this;
    }

    /* renamed from: n */
    public void m353n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IllegalAccessException, NoSuchMethodException, SecurityException, IOException, IllegalArgumentException, InvocationTargetException {
        TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C2467b.f10045a);
        setVisible(typedArrayM10255k.getBoolean(C2467b.f10047c, true), true);
        m348t(typedArrayM10255k);
        m375i(resources);
        typedArrayM10255k.recycle();
        m343o(context, resources, xmlPullParser, attributeSet, theme);
        m344p();
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i4) {
        return super.onLayoutDirectionChanged(i4);
    }

    @Override // androidx.appcompat.graphics.drawable.C0116d, androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iM360F = this.f425o.m360F(iArr);
        boolean z3 = iM360F != m373c() && (m347s(iM360F) || m374g(iM360F));
        Drawable current = getCurrent();
        return current != null ? z3 | current.setState(iArr) : z3;
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        super.scheduleDrawable(drawable, runnable, j4);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i4) {
        super.setAlpha(i4);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z3) {
        super.setAutoMirrored(z3);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z3) {
        super.setDither(z3);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean visible = super.setVisible(z3, z4);
        g gVar = this.f426p;
        if (gVar != null && (visible || z4)) {
            if (z3) {
                gVar.mo354c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.C0114b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C0113a(c cVar, Resources resources) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(null);
        this.f427q = -1;
        this.f428r = -1;
        mo350h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
