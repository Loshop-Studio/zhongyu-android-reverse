package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.collection.C0247a;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p148s.C3369g;
import p156u.C3403a;

/* renamed from: androidx.vectordrawable.graphics.drawable.c */
/* loaded from: classes.dex */
public class C0757c extends AbstractC0761g implements Animatable {

    /* renamed from: b */
    private b f4510b;

    /* renamed from: c */
    private Context f4511c;

    /* renamed from: d */
    private ArgbEvaluator f4512d;

    /* renamed from: e */
    private Animator.AnimatorListener f4513e;

    /* renamed from: f */
    ArrayList<AbstractC0756b> f4514f;

    /* renamed from: g */
    final Drawable.Callback f4515g;

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0757c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            C0757c.this.scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0757c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    private static class b extends Drawable.ConstantState {

        /* renamed from: a */
        int f4517a;

        /* renamed from: b */
        C0762h f4518b;

        /* renamed from: c */
        AnimatorSet f4519c;

        /* renamed from: d */
        ArrayList<Animator> f4520d;

        /* renamed from: e */
        C0247a<Animator, String> f4521e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f4517a = bVar.f4517a;
                C0762h c0762h = bVar.f4518b;
                if (c0762h != null) {
                    Drawable.ConstantState constantState = c0762h.getConstantState();
                    if (resources != null) {
                        this.f4518b = (C0762h) constantState.newDrawable(resources);
                    } else {
                        this.f4518b = (C0762h) constantState.newDrawable();
                    }
                    C0762h c0762h2 = (C0762h) this.f4518b.mutate();
                    this.f4518b = c0762h2;
                    c0762h2.setCallback(callback);
                    this.f4518b.setBounds(bVar.f4518b.getBounds());
                    this.f4518b.m3962h(false);
                }
                ArrayList<Animator> arrayList = bVar.f4520d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4520d = new ArrayList<>(size);
                    this.f4521e = new C0247a<>(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        Animator animator = bVar.f4520d.get(i4);
                        Animator animatorClone = animator.clone();
                        String str = bVar.f4521e.get(animator);
                        animatorClone.setTarget(this.f4518b.m3961d(str));
                        this.f4520d.add(animatorClone);
                        this.f4521e.put(animatorClone, str);
                    }
                    m3931a();
                }
            }
        }

        /* renamed from: a */
        public void m3931a() {
            if (this.f4519c == null) {
                this.f4519c = new AnimatorSet();
            }
            this.f4519c.playTogether(this.f4520d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4517a;
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

    C0757c() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C0757c m3929a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        C0757c c0757c = new C0757c(context);
        c0757c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0757c;
    }

    /* renamed from: b */
    private void m3930b(String str, Animator animator) {
        animator.setTarget(this.f4510b.f4518b.m3961d(str));
        b bVar = this.f4510b;
        if (bVar.f4520d == null) {
            bVar.f4520d = new ArrayList<>();
            this.f4510b.f4521e = new C0247a<>();
        }
        this.f4510b.f4520d.add(animator);
        this.f4510b.f4521e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10384a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            return C3403a.m10385b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4510b.f4518b.draw(canvas);
        if (this.f4510b.f4519c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4525a;
        return drawable != null ? C3403a.m10387d(drawable) : this.f4510b.f4518b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4510b.f4517a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4525a;
        return drawable != null ? C3403a.m10388e(drawable) : this.f4510b.f4518b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4525a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f4525a.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4510b.f4518b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4510b.f4518b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.getOpacity() : this.f4510b.f4518b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10390g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM10255k = C3369g.m10255k(resources, theme, attributeSet, C0755a.f4502e);
                    int resourceId = typedArrayM10255k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0762h c0762hM3955b = C0762h.m3955b(resources, resourceId, theme);
                        c0762hM3955b.m3962h(false);
                        c0762hM3955b.setCallback(this.f4515g);
                        C0762h c0762h = this.f4510b.f4518b;
                        if (c0762h != null) {
                            c0762h.setCallback(null);
                        }
                        this.f4510b.f4518b = c0762hM3955b;
                    }
                    typedArrayM10255k.recycle();
                } else if (Constants.KEY_TARGET.equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C0755a.f4503f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4511c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m3930b(string, C0759e.m3941i(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4510b.m3931a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4525a;
        return drawable != null ? C3403a.m10391h(drawable) : this.f4510b.f4518b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f4525a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4510b.f4519c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.isStateful() : this.f4510b.f4518b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4510b.f4518b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.setLevel(i4) : this.f4510b.f4518b.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4525a;
        return drawable != null ? drawable.setState(iArr) : this.f4510b.f4518b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f4510b.f4518b.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10393j(drawable, z3);
        } else {
            this.f4510b.f4518b.setAutoMirrored(z3);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
        super.setFilterBitmap(z3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0761g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i4) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10397n(drawable, i4);
        } else {
            this.f4510b.f4518b.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10398o(drawable, colorStateList);
        } else {
            this.f4510b.f4518b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            C3403a.m10399p(drawable, mode);
        } else {
            this.f4510b.f4518b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f4510b.f4518b.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f4510b.f4519c.isStarted()) {
                return;
            }
            this.f4510b.f4519c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4510b.f4519c.end();
        }
    }

    private C0757c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4525a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4510b.f4518b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4522a;

        public c(Drawable.ConstantState constantState) {
            this.f4522a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f4522a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4522a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0757c c0757c = new C0757c();
            Drawable drawableNewDrawable = this.f4522a.newDrawable();
            c0757c.f4525a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0757c.f4515g);
            return c0757c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0757c c0757c = new C0757c();
            Drawable drawableNewDrawable = this.f4522a.newDrawable(resources);
            c0757c.f4525a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0757c.f4515g);
            return c0757c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0757c c0757c = new C0757c();
            Drawable drawableNewDrawable = this.f4522a.newDrawable(resources, theme);
            c0757c.f4525a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0757c.f4515g);
            return c0757c;
        }
    }

    private C0757c(Context context, b bVar, Resources resources) {
        this.f4512d = null;
        this.f4513e = null;
        this.f4514f = null;
        a aVar = new a();
        this.f4515g = aVar;
        this.f4511c = context;
        if (bVar != null) {
            this.f4510b = bVar;
        } else {
            this.f4510b = new b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
