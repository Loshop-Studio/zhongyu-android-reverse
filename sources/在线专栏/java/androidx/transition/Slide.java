package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.C0358u;
import org.xmlpull.v1.XmlPullParser;
import p148s.C3369g;

/* loaded from: classes.dex */
public class Slide extends Visibility {

    /* renamed from: c */
    private static final TimeInterpolator f4349c = new DecelerateInterpolator();

    /* renamed from: d */
    private static final TimeInterpolator f4350d = new AccelerateInterpolator();

    /* renamed from: e */
    private static final InterfaceC0699g f4351e = new C0693a();

    /* renamed from: f */
    private static final InterfaceC0699g f4352f = new C0694b();

    /* renamed from: g */
    private static final InterfaceC0699g f4353g = new C0695c();

    /* renamed from: h */
    private static final InterfaceC0699g f4354h = new C0696d();

    /* renamed from: i */
    private static final InterfaceC0699g f4355i = new C0697e();

    /* renamed from: j */
    private static final InterfaceC0699g f4356j = new C0698f();

    /* renamed from: a */
    private InterfaceC0699g f4357a;

    /* renamed from: b */
    private int f4358b;

    /* renamed from: androidx.transition.Slide$a */
    static class C0693a extends AbstractC0700h {
        C0693a() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0699g
        /* renamed from: b */
        public float mo3814b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    static class C0694b extends AbstractC0700h {
        C0694b() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0699g
        /* renamed from: b */
        public float mo3814b(ViewGroup viewGroup, View view) {
            return C0358u.m1978A(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    static class C0695c extends AbstractC0701i {
        C0695c() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0699g
        /* renamed from: a */
        public float mo3815a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    static class C0696d extends AbstractC0700h {
        C0696d() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0699g
        /* renamed from: b */
        public float mo3814b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    static class C0697e extends AbstractC0700h {
        C0697e() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0699g
        /* renamed from: b */
        public float mo3814b(ViewGroup viewGroup, View view) {
            return C0358u.m1978A(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    static class C0698f extends AbstractC0701i {
        C0698f() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0699g
        /* renamed from: a */
        public float mo3815a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    private interface InterfaceC0699g {
        /* renamed from: a */
        float mo3815a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo3814b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    private static abstract class AbstractC0700h implements InterfaceC0699g {
        private AbstractC0700h() {
        }

        /* synthetic */ AbstractC0700h(C0693a c0693a) {
            this();
        }

        @Override // androidx.transition.Slide.InterfaceC0699g
        /* renamed from: a */
        public float mo3815a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    private static abstract class AbstractC0701i implements InterfaceC0699g {
        private AbstractC0701i() {
        }

        /* synthetic */ AbstractC0701i(C0693a c0693a) {
            this();
        }

        @Override // androidx.transition.Slide.InterfaceC0699g
        /* renamed from: b */
        public float mo3814b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.f4357a = f4356j;
        this.f4358b = 80;
        m3813a(80);
    }

    private void captureValues(C0752x c0752x) {
        int[] iArr = new int[2];
        c0752x.f4483b.getLocationOnScreen(iArr);
        c0752x.f4482a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: a */
    public void m3813a(int i4) {
        if (i4 == 3) {
            this.f4357a = f4351e;
        } else if (i4 == 5) {
            this.f4357a = f4354h;
        } else if (i4 == 48) {
            this.f4357a = f4353g;
        } else if (i4 == 80) {
            this.f4357a = f4356j;
        } else if (i4 == 8388611) {
            this.f4357a = f4352f;
        } else {
            if (i4 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f4357a = f4355i;
        }
        this.f4358b = i4;
        C0746r c0746r = new C0746r();
        c0746r.m3917j(i4);
        setPropagation(c0746r);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(C0752x c0752x) {
        super.captureEndValues(c0752x);
        captureValues(c0752x);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(C0752x c0752x) {
        super.captureStartValues(c0752x);
        captureValues(c0752x);
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        if (c0752x2 == null) {
            return null;
        }
        int[] iArr = (int[]) c0752x2.f4482a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C0754z.m3927a(view, c0752x2, iArr[0], iArr[1], this.f4357a.mo3814b(viewGroup, view), this.f4357a.mo3815a(viewGroup, view), translationX, translationY, f4349c, this);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        if (c0752x == null) {
            return null;
        }
        int[] iArr = (int[]) c0752x.f4482a.get("android:slide:screenPosition");
        return C0754z.m3927a(view, c0752x, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f4357a.mo3814b(viewGroup, view), this.f4357a.mo3815a(viewGroup, view), f4350d, this);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4357a = f4356j;
        this.f4358b = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4465h);
        int iM10251g = C3369g.m10251g(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        m3813a(iM10251g);
    }
}
