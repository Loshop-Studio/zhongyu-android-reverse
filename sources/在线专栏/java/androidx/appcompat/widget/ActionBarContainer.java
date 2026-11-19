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
import androidx.core.view.C0358u;
import p015c.C1043f;
import p015c.C1047j;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    private boolean f697a;

    /* renamed from: b */
    private View f698b;

    /* renamed from: c */
    private View f699c;

    /* renamed from: d */
    private View f700d;

    /* renamed from: e */
    Drawable f701e;

    /* renamed from: f */
    Drawable f702f;

    /* renamed from: g */
    Drawable f703g;

    /* renamed from: h */
    boolean f704h;

    /* renamed from: i */
    boolean f705i;

    /* renamed from: j */
    private int f706j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0358u.m2057t0(this, new C0203b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1047j.f6052a);
        this.f701e = typedArrayObtainStyledAttributes.getDrawable(C1047j.f6058b);
        this.f702f = typedArrayObtainStyledAttributes.getDrawable(C1047j.f6068d);
        this.f706j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1047j.f6098j, -1);
        boolean z3 = true;
        if (getId() == C1043f.f5845N) {
            this.f704h = true;
            this.f703g = typedArrayObtainStyledAttributes.getDrawable(C1047j.f6063c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f704h ? this.f701e != null || this.f702f != null : this.f703g != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    /* renamed from: a */
    private int m534a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m535b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f701e;
        if (drawable != null && drawable.isStateful()) {
            this.f701e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f702f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f702f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f703g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f703g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f698b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f701e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f702f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f703g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f699c = findViewById(C1043f.f5854a);
        this.f700d = findViewById(C1043f.f5859f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f697a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        Drawable drawable;
        super.onLayout(z3, i4, i5, i6, i7);
        View view = this.f698b;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i8 = layoutParams.bottomMargin;
            view.layout(i4, measuredHeight2 - i8, i6, measuredHeight - i8);
        }
        if (this.f704h) {
            Drawable drawable2 = this.f703g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f701e != null) {
                if (this.f699c.getVisibility() == 0) {
                    this.f701e.setBounds(this.f699c.getLeft(), this.f699c.getTop(), this.f699c.getRight(), this.f699c.getBottom());
                } else {
                    View view2 = this.f700d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f701e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f701e.setBounds(this.f700d.getLeft(), this.f700d.getTop(), this.f700d.getRight(), this.f700d.getBottom());
                    }
                }
                z5 = true;
            }
            this.f705i = z6;
            if (!z6 || (drawable = this.f702f) == null) {
                z4 = z5;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        if (this.f699c == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f706j) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f699c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        View view = this.f698b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!m535b(this.f699c) ? m534a(this.f699c) : !m535b(this.f700d) ? m534a(this.f700d) : 0) + m534a(this.f698b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i5) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f701e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f701e);
        }
        this.f701e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f699c;
            if (view != null) {
                this.f701e.setBounds(view.getLeft(), this.f699c.getTop(), this.f699c.getRight(), this.f699c.getBottom());
            }
        }
        boolean z3 = true;
        if (!this.f704h ? this.f701e != null || this.f702f != null : this.f703g != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f703g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f703g);
        }
        this.f703g = drawable;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f704h && (drawable2 = this.f703g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f704h ? !(this.f701e != null || this.f702f != null) : this.f703g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f702f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f702f);
        }
        this.f702f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f705i && (drawable2 = this.f702f) != null) {
                drawable2.setBounds(this.f698b.getLeft(), this.f698b.getTop(), this.f698b.getRight(), this.f698b.getBottom());
            }
        }
        boolean z3 = true;
        if (!this.f704h ? this.f701e != null || this.f702f != null : this.f703g != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0240z c0240z) {
        View view = this.f698b;
        if (view != null) {
            removeView(view);
        }
        this.f698b = c0240z;
        if (c0240z != null) {
            addView(c0240z);
            ViewGroup.LayoutParams layoutParams = c0240z.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0240z.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z3) {
        this.f697a = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.f701e;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f702f;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f703g;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f701e && !this.f704h) || (drawable == this.f702f && this.f705i) || ((drawable == this.f703g && this.f704h) || super.verifyDrawable(drawable));
    }
}
