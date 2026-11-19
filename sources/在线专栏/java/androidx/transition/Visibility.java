package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import p148s.C3369g;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* renamed from: androidx.transition.Visibility$a */
    class C0711a extends C0748t {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4375a;

        /* renamed from: b */
        final /* synthetic */ View f4376b;

        /* renamed from: c */
        final /* synthetic */ View f4377c;

        C0711a(ViewGroup viewGroup, View view, View view2) {
            this.f4375a = viewGroup;
            this.f4376b = view;
            this.f4377c = view2;
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) {
            this.f4377c.setTag(C0742o.f4449d, null);
            C0719c0.m3849b(this.f4375a).remove(this.f4376b);
            transition.removeListener(this);
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionPause(Transition transition) {
            C0719c0.m3849b(this.f4375a).remove(this.f4376b);
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionResume(Transition transition) {
            if (this.f4376b.getParent() == null) {
                C0719c0.m3849b(this.f4375a).add(this.f4376b);
            } else {
                Visibility.this.cancel();
            }
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    private static class C0712b extends AnimatorListenerAdapter implements Transition.InterfaceC0708g {

        /* renamed from: a */
        private final View f4379a;

        /* renamed from: b */
        private final int f4380b;

        /* renamed from: c */
        private final ViewGroup f4381c;

        /* renamed from: d */
        private final boolean f4382d;

        /* renamed from: e */
        private boolean f4383e;

        /* renamed from: f */
        boolean f4384f = false;

        C0712b(View view, int i4, boolean z3) {
            this.f4379a = view;
            this.f4380b = i4;
            this.f4381c = (ViewGroup) view.getParent();
            this.f4382d = z3;
            m3841b(true);
        }

        /* renamed from: a */
        private void m3840a() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (!this.f4384f) {
                C0725f0.m3863i(this.f4379a, this.f4380b);
                ViewGroup viewGroup = this.f4381c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m3841b(false);
        }

        /* renamed from: b */
        private void m3841b(boolean z3) {
            ViewGroup viewGroup;
            if (!this.f4382d || this.f4383e == z3 || (viewGroup = this.f4381c) == null) {
                return;
            }
            this.f4383e = z3;
            C0719c0.m3851d(viewGroup, z3);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4384f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            m3840a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f4384f) {
                return;
            }
            C0725f0.m3863i(this.f4379a, this.f4380b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f4384f) {
                return;
            }
            C0725f0.m3863i(this.f4379a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            m3840a();
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionPause(Transition transition) {
            m3841b(false);
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionResume(Transition transition) {
            m3841b(true);
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.Visibility$c */
    private static class C0713c {

        /* renamed from: a */
        boolean f4385a;

        /* renamed from: b */
        boolean f4386b;

        /* renamed from: c */
        int f4387c;

        /* renamed from: d */
        int f4388d;

        /* renamed from: e */
        ViewGroup f4389e;

        /* renamed from: f */
        ViewGroup f4390f;

        C0713c() {
        }
    }

    public Visibility() {
        this.mMode = 3;
    }

    private void captureValues(C0752x c0752x) {
        c0752x.f4482a.put(PROPNAME_VISIBILITY, Integer.valueOf(c0752x.f4483b.getVisibility()));
        c0752x.f4482a.put(PROPNAME_PARENT, c0752x.f4483b.getParent());
        int[] iArr = new int[2];
        c0752x.f4483b.getLocationOnScreen(iArr);
        c0752x.f4482a.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    private C0713c getVisibilityChangeInfo(C0752x c0752x, C0752x c0752x2) {
        C0713c c0713c = new C0713c();
        c0713c.f4385a = false;
        c0713c.f4386b = false;
        if (c0752x == null || !c0752x.f4482a.containsKey(PROPNAME_VISIBILITY)) {
            c0713c.f4387c = -1;
            c0713c.f4389e = null;
        } else {
            c0713c.f4387c = ((Integer) c0752x.f4482a.get(PROPNAME_VISIBILITY)).intValue();
            c0713c.f4389e = (ViewGroup) c0752x.f4482a.get(PROPNAME_PARENT);
        }
        if (c0752x2 == null || !c0752x2.f4482a.containsKey(PROPNAME_VISIBILITY)) {
            c0713c.f4388d = -1;
            c0713c.f4390f = null;
        } else {
            c0713c.f4388d = ((Integer) c0752x2.f4482a.get(PROPNAME_VISIBILITY)).intValue();
            c0713c.f4390f = (ViewGroup) c0752x2.f4482a.get(PROPNAME_PARENT);
        }
        if (c0752x != null && c0752x2 != null) {
            int i4 = c0713c.f4387c;
            int i5 = c0713c.f4388d;
            if (i4 == i5 && c0713c.f4389e == c0713c.f4390f) {
                return c0713c;
            }
            if (i4 != i5) {
                if (i4 == 0) {
                    c0713c.f4386b = false;
                    c0713c.f4385a = true;
                } else if (i5 == 0) {
                    c0713c.f4386b = true;
                    c0713c.f4385a = true;
                }
            } else if (c0713c.f4390f == null) {
                c0713c.f4386b = false;
                c0713c.f4385a = true;
            } else if (c0713c.f4389e == null) {
                c0713c.f4386b = true;
                c0713c.f4385a = true;
            }
        } else if (c0752x == null && c0713c.f4388d == 0) {
            c0713c.f4386b = true;
            c0713c.f4385a = true;
        } else if (c0752x2 == null && c0713c.f4387c == 0) {
            c0713c.f4386b = false;
            c0713c.f4385a = true;
        }
        return c0713c;
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
        C0713c visibilityChangeInfo = getVisibilityChangeInfo(c0752x, c0752x2);
        if (!visibilityChangeInfo.f4385a) {
            return null;
        }
        if (visibilityChangeInfo.f4389e == null && visibilityChangeInfo.f4390f == null) {
            return null;
        }
        return visibilityChangeInfo.f4386b ? onAppear(viewGroup, c0752x, visibilityChangeInfo.f4387c, c0752x2, visibilityChangeInfo.f4388d) : onDisappear(viewGroup, c0752x, visibilityChangeInfo.f4387c, c0752x2, visibilityChangeInfo.f4388d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(C0752x c0752x, C0752x c0752x2) {
        if (c0752x == null && c0752x2 == null) {
            return false;
        }
        if (c0752x != null && c0752x2 != null && c0752x2.f4482a.containsKey(PROPNAME_VISIBILITY) != c0752x.f4482a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        C0713c visibilityChangeInfo = getVisibilityChangeInfo(c0752x, c0752x2);
        if (visibilityChangeInfo.f4385a) {
            return visibilityChangeInfo.f4387c == 0 || visibilityChangeInfo.f4388d == 0;
        }
        return false;
    }

    public boolean isVisible(C0752x c0752x) {
        if (c0752x == null) {
            return false;
        }
        return ((Integer) c0752x.f4482a.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) c0752x.f4482a.get(PROPNAME_PARENT)) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        return null;
    }

    public Animator onAppear(ViewGroup viewGroup, C0752x c0752x, int i4, C0752x c0752x2, int i5) {
        if ((this.mMode & 1) != 1 || c0752x2 == null) {
            return null;
        }
        if (c0752x == null) {
            View view = (View) c0752x2.f4483b.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f4385a) {
                return null;
            }
        }
        return onAppear(viewGroup, c0752x2.f4483b, c0752x, c0752x2);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[PHI: r8
      0x008f: PHI (r8v3 android.view.View) = 
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v6 android.view.View)
     binds: [B:26:0x0048, B:31:0x0057, B:36:0x007c, B:38:0x007f, B:40:0x0085, B:42:0x0089, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r18, androidx.transition.C0752x r19, int r20, androidx.transition.C0752x r21, int r22) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.onDisappear(android.view.ViewGroup, androidx.transition.x, int, androidx.transition.x, int):android.animation.Animator");
    }

    public void setMode(int i4) {
        if ((i4 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i4;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4462e);
        int iM10251g = C3369g.m10251g(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM10251g != 0) {
            setMode(iM10251g);
        }
    }
}
