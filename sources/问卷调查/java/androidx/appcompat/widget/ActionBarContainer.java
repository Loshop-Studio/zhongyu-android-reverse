package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p005b.p014h.C0070b;
import p000a.p005b.p014h.C0096n0;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f2769b;

    /* renamed from: c */
    public View f2770c;

    /* renamed from: d */
    public View f2771d;

    /* renamed from: e */
    public View f2772e;

    /* renamed from: f */
    public Drawable f2773f;

    /* renamed from: g */
    public Drawable f2774g;

    /* renamed from: h */
    public Drawable f2775h;

    /* renamed from: i */
    public boolean f2776i;

    /* renamed from: j */
    public boolean f2777j;

    /* renamed from: k */
    public int f2778k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0070b c0070b = new C0070b(this);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        setBackground(c0070b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014b.f26a);
        boolean z = false;
        this.f2773f = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f2774g = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f2778k = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C1088R.id.split_action_bar) {
            this.f2776i = true;
            this.f2775h = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f2776i ? !(this.f2773f != null || this.f2774g != null) : this.f2775h == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int m1569a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m1570b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2773f;
        if (drawable != null && drawable.isStateful()) {
            this.f2773f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2774g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2774g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2775h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2775h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2770c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2773f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2774g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2775h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2771d = findViewById(C1088R.id.action_bar);
        this.f2772e = findViewById(C1088R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2769b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:32:0x009d, B:34:0x00a1, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f2770c
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f2776i
            if (r6 == 0) goto L4a
            android.graphics.drawable.Drawable r5 = r4.f2775h
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lb6
        L48:
            r9 = r0
            goto Lb6
        L4a:
            android.graphics.drawable.Drawable r6 = r4.f2773f
            if (r6 == 0) goto L9b
            android.view.View r6 = r4.f2771d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L74
            android.graphics.drawable.Drawable r6 = r4.f2773f
            android.view.View r7 = r4.f2771d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f2771d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f2771d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f2771d
        L6c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L9a
        L74:
            android.view.View r6 = r4.f2772e
            if (r6 == 0) goto L95
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L95
            android.graphics.drawable.Drawable r6 = r4.f2773f
            android.view.View r7 = r4.f2772e
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f2772e
            int r8 = r8.getTop()
            android.view.View r0 = r4.f2772e
            int r0 = r0.getRight()
            android.view.View r2 = r4.f2772e
            goto L6c
        L95:
            android.graphics.drawable.Drawable r6 = r4.f2773f
            r6.setBounds(r0, r0, r0, r0)
        L9a:
            r0 = r9
        L9b:
            r4.f2777j = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f2774g
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lb6:
            if (r9 == 0) goto Lbb
            r4.invalidate()
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f2771d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f2778k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f2771d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f2770c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f2771d
            boolean r0 = r3.m1570b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f2771d
        L42:
            int r0 = r3.m1569a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f2772e
            boolean r0 = r3.m1570b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f2772e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f2770c
            int r1 = r3.m1569a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2773f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2773f);
        }
        this.f2773f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2771d;
            if (view != null) {
                this.f2773f.setBounds(view.getLeft(), this.f2771d.getTop(), this.f2771d.getRight(), this.f2771d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2776i ? this.f2773f != null || this.f2774g != null : this.f2775h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2775h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2775h);
        }
        this.f2775h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2776i && (drawable2 = this.f2775h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2776i ? !(this.f2773f != null || this.f2774g != null) : this.f2775h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2774g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2774g);
        }
        this.f2774g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2777j && (drawable2 = this.f2774g) != null) {
                drawable2.setBounds(this.f2770c.getLeft(), this.f2770c.getTop(), this.f2770c.getRight(), this.f2770c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2776i ? this.f2773f != null || this.f2774g != null : this.f2775h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0096n0 c0096n0) {
        View view = this.f2770c;
        if (view != null) {
            removeView(view);
        }
        this.f2770c = c0096n0;
        if (c0096n0 != null) {
            addView(c0096n0);
            ViewGroup.LayoutParams layoutParams = c0096n0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0096n0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f2769b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2773f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2774g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f2775h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2773f && !this.f2776i) || (drawable == this.f2774g && this.f2777j) || ((drawable == this.f2775h && this.f2776i) || super.verifyDrawable(drawable));
    }
}
