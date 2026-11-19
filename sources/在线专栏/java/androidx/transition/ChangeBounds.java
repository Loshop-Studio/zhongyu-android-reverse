package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Map;
import p148s.C3369g;

/* loaded from: classes.dex */
public class ChangeBounds extends Transition {

    /* renamed from: d */
    private static final String[] f4264d = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: e */
    private static final Property<Drawable, PointF> f4265e = new C0671b(PointF.class, "boundsOrigin");

    /* renamed from: f */
    private static final Property<C0680k, PointF> f4266f = new C0672c(PointF.class, "topLeft");

    /* renamed from: g */
    private static final Property<C0680k, PointF> f4267g = new C0673d(PointF.class, "bottomRight");

    /* renamed from: h */
    private static final Property<View, PointF> f4268h = new C0674e(PointF.class, "bottomRight");

    /* renamed from: i */
    private static final Property<View, PointF> f4269i = new C0675f(PointF.class, "topLeft");

    /* renamed from: j */
    private static final Property<View, PointF> f4270j = new C0676g(PointF.class, RequestParameters.POSITION);

    /* renamed from: k */
    private static C0744p f4271k = new C0744p();

    /* renamed from: a */
    private int[] f4272a;

    /* renamed from: b */
    private boolean f4273b;

    /* renamed from: c */
    private boolean f4274c;

    /* renamed from: androidx.transition.ChangeBounds$a */
    class C0670a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4275a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f4276b;

        /* renamed from: c */
        final /* synthetic */ View f4277c;

        /* renamed from: d */
        final /* synthetic */ float f4278d;

        C0670a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f4) {
            this.f4275a = viewGroup;
            this.f4276b = bitmapDrawable;
            this.f4277c = view;
            this.f4278d = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0725f0.m3856b(this.f4275a).remove(this.f4276b);
            C0725f0.m3862h(this.f4277c, this.f4278d);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    static class C0671b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f4280a;

        C0671b(Class cls, String str) {
            super(cls, str);
            this.f4280a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f4280a);
            Rect rect = this.f4280a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f4280a);
            this.f4280a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4280a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    static class C0672c extends Property<C0680k, PointF> {
        C0672c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C0680k c0680k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0680k c0680k, PointF pointF) {
            c0680k.m3781c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    static class C0673d extends Property<C0680k, PointF> {
        C0673d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C0680k c0680k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0680k c0680k, PointF pointF) {
            c0680k.m3780a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    static class C0674e extends Property<View, PointF> {
        C0674e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C0725f0.m3861g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    static class C0675f extends Property<View, PointF> {
        C0675f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C0725f0.m3861g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    static class C0676g extends Property<View, PointF> {
        C0676g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            C0725f0.m3861g(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    class C0677h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0680k f4281a;
        private C0680k mViewBounds;

        C0677h(C0680k c0680k) {
            this.f4281a = c0680k;
            this.mViewBounds = c0680k;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    class C0678i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4283a;

        /* renamed from: b */
        final /* synthetic */ View f4284b;

        /* renamed from: c */
        final /* synthetic */ Rect f4285c;

        /* renamed from: d */
        final /* synthetic */ int f4286d;

        /* renamed from: e */
        final /* synthetic */ int f4287e;

        /* renamed from: f */
        final /* synthetic */ int f4288f;

        /* renamed from: g */
        final /* synthetic */ int f4289g;

        C0678i(View view, Rect rect, int i4, int i5, int i6, int i7) {
            this.f4284b = view;
            this.f4285c = rect;
            this.f4286d = i4;
            this.f4287e = i5;
            this.f4288f = i6;
            this.f4289g = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4283a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4283a) {
                return;
            }
            C0358u.m2063w0(this.f4284b, this.f4285c);
            C0725f0.m3861g(this.f4284b, this.f4286d, this.f4287e, this.f4288f, this.f4289g);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    class C0679j extends C0748t {

        /* renamed from: a */
        boolean f4291a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4292b;

        C0679j(ViewGroup viewGroup) {
            this.f4292b = viewGroup;
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionCancel(Transition transition) {
            C0719c0.m3851d(this.f4292b, false);
            this.f4291a = true;
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) {
            if (!this.f4291a) {
                C0719c0.m3851d(this.f4292b, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionPause(Transition transition) {
            C0719c0.m3851d(this.f4292b, false);
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionResume(Transition transition) {
            C0719c0.m3851d(this.f4292b, true);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$k */
    private static class C0680k {

        /* renamed from: a */
        private int f4294a;

        /* renamed from: b */
        private int f4295b;

        /* renamed from: c */
        private int f4296c;

        /* renamed from: d */
        private int f4297d;

        /* renamed from: e */
        private View f4298e;

        /* renamed from: f */
        private int f4299f;

        /* renamed from: g */
        private int f4300g;

        C0680k(View view) {
            this.f4298e = view;
        }

        /* renamed from: b */
        private void m3779b() {
            C0725f0.m3861g(this.f4298e, this.f4294a, this.f4295b, this.f4296c, this.f4297d);
            this.f4299f = 0;
            this.f4300g = 0;
        }

        /* renamed from: a */
        void m3780a(PointF pointF) {
            this.f4296c = Math.round(pointF.x);
            this.f4297d = Math.round(pointF.y);
            int i4 = this.f4300g + 1;
            this.f4300g = i4;
            if (this.f4299f == i4) {
                m3779b();
            }
        }

        /* renamed from: c */
        void m3781c(PointF pointF) {
            this.f4294a = Math.round(pointF.x);
            this.f4295b = Math.round(pointF.y);
            int i4 = this.f4299f + 1;
            this.f4299f = i4;
            if (i4 == this.f4300g) {
                m3779b();
            }
        }
    }

    public ChangeBounds() {
        this.f4272a = new int[2];
        this.f4273b = false;
        this.f4274c = false;
    }

    /* renamed from: a */
    private boolean m3765a(View view, View view2) {
        if (!this.f4274c) {
            return true;
        }
        C0752x matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == matchedTransitionValues.f4483b) {
            return true;
        }
        return false;
    }

    private void captureValues(C0752x c0752x) {
        View view = c0752x.f4483b;
        if (!C0358u.m2013V(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c0752x.f4482a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c0752x.f4482a.put("android:changeBounds:parent", c0752x.f4483b.getParent());
        if (this.f4274c) {
            c0752x.f4483b.getLocationInWindow(this.f4272a);
            c0752x.f4482a.put("android:changeBounds:windowX", Integer.valueOf(this.f4272a[0]));
            c0752x.f4482a.put("android:changeBounds:windowY", Integer.valueOf(this.f4272a[1]));
        }
        if (this.f4273b) {
            c0752x.f4482a.put("android:changeBounds:clip", C0358u.m2054s(view));
        }
    }

    /* renamed from: b */
    public void m3766b(boolean z3) {
        this.f4273b = z3;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C0752x c0752x) {
        captureValues(c0752x);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C0752x c0752x) {
        captureValues(c0752x);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C0752x c0752x, C0752x c0752x2) {
        int i4;
        View view;
        int i5;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorM3925c;
        if (c0752x == null || c0752x2 == null) {
            return null;
        }
        Map<String, Object> map = c0752x.f4482a;
        Map<String, Object> map2 = c0752x2.f4482a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c0752x2.f4483b;
        if (!m3765a(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) c0752x.f4482a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) c0752x.f4482a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) c0752x2.f4482a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) c0752x2.f4482a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f4272a);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fM3857c = C0725f0.m3857c(view2);
            C0725f0.m3862h(view2, IGoodView.DEFAULT_TO_ALPHA);
            C0725f0.m3856b(viewGroup).add(bitmapDrawable);
            PathMotion pathMotion = getPathMotion();
            int[] iArr = this.f4272a;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C0740n.m3910a(f4265e, pathMotion.getPath(iIntValue - iArr[0], iIntValue2 - iArr[1], iIntValue3 - iArr[0], iIntValue4 - iArr[1])));
            objectAnimatorOfPropertyValuesHolder.addListener(new C0670a(viewGroup, bitmapDrawable, view2, fM3857c));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) c0752x.f4482a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c0752x2.f4482a.get("android:changeBounds:bounds");
        int i6 = rect2.left;
        int i7 = rect3.left;
        int i8 = rect2.top;
        int i9 = rect3.top;
        int i10 = rect2.right;
        int i11 = rect3.right;
        int i12 = rect2.bottom;
        int i13 = rect3.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect4 = (Rect) c0752x.f4482a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c0752x2.f4482a.get("android:changeBounds:clip");
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i4 = 0;
        } else {
            i4 = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i4++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i4++;
        }
        if (i4 <= 0) {
            return null;
        }
        if (this.f4273b) {
            view = view2;
            C0725f0.m3861g(view, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
            ObjectAnimator objectAnimatorM3903a = (i6 == i7 && i8 == i9) ? null : C0738m.m3903a(view, f4270j, getPathMotion().getPath(i6, i8, i7, i9));
            if (rect4 == null) {
                i5 = 0;
                rect = new Rect(0, 0, i14, i15);
            } else {
                i5 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i5, i5, i16, i17) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                C0358u.m2063w0(view, rect);
                C0744p c0744p = f4271k;
                Object[] objArr = new Object[2];
                objArr[i5] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", c0744p, objArr);
                objectAnimatorOfObject.addListener(new C0678i(view, rect5, i7, i9, i11, i13));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorM3925c = C0751w.m3925c(objectAnimatorM3903a, objectAnimator);
        } else {
            view = view2;
            C0725f0.m3861g(view, i6, i8, i10, i12);
            if (i4 != 2) {
                animatorM3925c = (i6 == i7 && i8 == i9) ? C0738m.m3903a(view, f4268h, getPathMotion().getPath(i10, i12, i11, i13)) : C0738m.m3903a(view, f4269i, getPathMotion().getPath(i6, i8, i7, i9));
            } else if (i14 == i16 && i15 == i17) {
                animatorM3925c = C0738m.m3903a(view, f4270j, getPathMotion().getPath(i6, i8, i7, i9));
            } else {
                C0680k c0680k = new C0680k(view);
                ObjectAnimator objectAnimatorM3903a2 = C0738m.m3903a(c0680k, f4266f, getPathMotion().getPath(i6, i8, i7, i9));
                ObjectAnimator objectAnimatorM3903a3 = C0738m.m3903a(c0680k, f4267g, getPathMotion().getPath(i10, i12, i11, i13));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM3903a2, objectAnimatorM3903a3);
                animatorSet.addListener(new C0677h(c0680k));
                animatorM3925c = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C0719c0.m3851d(viewGroup4, true);
            addListener(new C0679j(viewGroup4));
        }
        return animatorM3925c;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f4264d;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4272a = new int[2];
        this.f4273b = false;
        this.f4274c = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4461d);
        boolean zM10245a = C3369g.m10245a(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        m3766b(zM10245a);
    }
}
