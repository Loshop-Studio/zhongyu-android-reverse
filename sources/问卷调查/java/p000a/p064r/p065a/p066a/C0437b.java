package p000a.p064r.p065a.p066a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p021e.C0129a;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p033c.p034b.C0200h;
import p000a.p064r.p065a.p066a.C0441f;

/* renamed from: a.r.a.a.b */
/* loaded from: classes.dex */
public class C0437b extends AbstractC0440e implements Animatable {

    /* renamed from: c */
    public b f2489c;

    /* renamed from: d */
    public Context f2490d;

    /* renamed from: e */
    public ArgbEvaluator f2491e;

    /* renamed from: f */
    public final Drawable.Callback f2492f;

    /* renamed from: a.r.a.a.b$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0437b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0437b.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0437b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a.r.a.a.b$b */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f2494a;

        /* renamed from: b */
        public C0441f f2495b;

        /* renamed from: c */
        public AnimatorSet f2496c;

        /* renamed from: d */
        public ArrayList<Animator> f2497d;

        /* renamed from: e */
        public C0129a<Animator, String> f2498e;

        public b(b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f2494a = bVar.f2494a;
                C0441f c0441f = bVar.f2495b;
                if (c0441f != null) {
                    Drawable.ConstantState constantState = c0441f.getConstantState();
                    C0441f c0441f2 = (C0441f) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f2495b = c0441f2;
                    c0441f2.mutate();
                    this.f2495b = c0441f2;
                    c0441f2.setCallback(callback);
                    this.f2495b.setBounds(bVar.f2495b.getBounds());
                    this.f2495b.f2508g = false;
                }
                ArrayList<Animator> arrayList = bVar.f2497d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f2497d = new ArrayList<>(size);
                    this.f2498e = new C0129a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f2497d.get(i);
                        Animator animatorClone = animator.clone();
                        String orDefault = bVar.f2498e.getOrDefault(animator, null);
                        animatorClone.setTarget(this.f2495b.f2504c.f2559b.f2557p.getOrDefault(orDefault, null));
                        this.f2497d.add(animatorClone);
                        this.f2498e.put(animatorClone, orDefault);
                    }
                    if (this.f2496c == null) {
                        this.f2496c = new AnimatorSet();
                    }
                    this.f2496c.playTogether(this.f2497d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2494a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C0437b() {
        this(null, null, null);
    }

    public C0437b(Context context, b bVar, Resources resources) {
        this.f2491e = null;
        a aVar = new a();
        this.f2492f = aVar;
        this.f2490d = context;
        this.f2489c = new b(null, aVar, null);
    }

    @Override // p000a.p064r.p065a.p066a.AbstractC0440e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2489c.f2495b.draw(canvas);
        if (this.f2489c.f2496c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getAlpha() : this.f2489c.f2495b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2489c.f2494a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getColorFilter() : this.f2489c.f2495b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2502b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f2502b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2489c.f2495b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2489c.f2495b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getOpacity() : this.f2489c.f2495b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator animatorM1487a;
        C0441f c0441fM1492a;
        int next;
        int i = Build.VERSION.SDK_INT;
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM693F = C0190e.m693F(resources, theme, attributeSet, C0436a.f2481e);
                    int resourceId = typedArrayM693F.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C0441f.f2503k;
                        if (i >= 24) {
                            c0441fM1492a = new C0441f();
                            ThreadLocal<TypedValue> threadLocal = C0200h.f1443a;
                            c0441fM1492a.f2502b = resources.getDrawable(resourceId, theme);
                            new C0441f.i(c0441fM1492a.f2502b.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
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
                                c0441fM1492a = C0441f.m1492a(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException | XmlPullParserException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                c0441fM1492a = null;
                            }
                        }
                        c0441fM1492a.f2508g = false;
                        c0441fM1492a.setCallback(this.f2492f);
                        C0441f c0441f = this.f2489c.f2495b;
                        if (c0441f != null) {
                            c0441f.setCallback(null);
                        }
                        this.f2489c.f2495b = c0441fM1492a;
                    }
                    typedArrayM693F.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C0436a.f2482f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2490d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (i >= 24) {
                            animatorM1487a = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                } catch (Throwable th) {
                                    th = th;
                                    animation = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                            } catch (XmlPullParserException e4) {
                                e = e4;
                            }
                            try {
                                animatorM1487a = C0438c.m1487a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                animation.close();
                            } catch (IOException e5) {
                                e = e5;
                                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException.initCause(e);
                                throw notFoundException;
                            } catch (XmlPullParserException e6) {
                                e = e6;
                                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException2.initCause(e);
                                throw notFoundException2;
                            } catch (Throwable th2) {
                                th = th2;
                                if (animation != null) {
                                    animation.close();
                                }
                                throw th;
                            }
                        }
                        animatorM1487a.setTarget(this.f2489c.f2495b.f2504c.f2559b.f2557p.getOrDefault(string, null));
                        b bVar = this.f2489c;
                        if (bVar.f2497d == null) {
                            bVar.f2497d = new ArrayList<>();
                            this.f2489c.f2498e = new C0129a<>();
                        }
                        this.f2489c.f2497d.add(animatorM1487a);
                        this.f2489c.f2498e.put(animatorM1487a, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        b bVar2 = this.f2489c;
        if (bVar2.f2496c == null) {
            bVar2.f2496c = new AnimatorSet();
        }
        bVar2.f2496c.playTogether(bVar2.f2497d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.isAutoMirrored() : this.f2489c.f2495b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f2502b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2489c.f2496c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.isStateful() : this.f2489c.f2495b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2489c.f2495b.setBounds(rect);
        }
    }

    @Override // p000a.p064r.p065a.p066a.AbstractC0440e, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.setLevel(i) : this.f2489c.f2495b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.setState(iArr) : this.f2489c.f2495b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f2489c.f2495b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        C0441f c0441f = this.f2489c.f2495b;
        Drawable drawable2 = c0441f.f2502b;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            c0441f.f2504c.f2562e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        C0441f c0441f = this.f2489c.f2495b;
        Drawable drawable2 = c0441f.f2502b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        } else {
            c0441f.f2506e = colorFilter;
            c0441f.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            C0190e.m700M(drawable, i);
        } else {
            this.f2489c.f2495b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            C0190e.m701N(drawable, colorStateList);
        } else {
            this.f2489c.f2495b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            C0190e.m702O(drawable, mode);
        } else {
            this.f2489c.f2495b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f2489c.f2495b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f2489c.f2496c.isStarted()) {
                return;
            }
            this.f2489c.f2496c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2489c.f2496c.end();
        }
    }

    /* renamed from: a.r.a.a.b$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f2499a;

        public c(Drawable.ConstantState constantState) {
            this.f2499a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2499a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2499a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0437b c0437b = new C0437b(null, null, null);
            Drawable drawableNewDrawable = this.f2499a.newDrawable();
            c0437b.f2502b = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0437b.f2492f);
            return c0437b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0437b c0437b = new C0437b(null, null, null);
            Drawable drawableNewDrawable = this.f2499a.newDrawable(resources);
            c0437b.f2502b = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0437b.f2492f);
            return c0437b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0437b c0437b = new C0437b(null, null, null);
            Drawable drawableNewDrawable = this.f2499a.newDrawable(resources, theme);
            c0437b.f2502b = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0437b.f2492f);
            return c0437b;
        }
    }
}
