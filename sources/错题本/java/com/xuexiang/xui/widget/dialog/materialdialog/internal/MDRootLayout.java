package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.StackingBehavior;
import kotlin.collections.AbstractC5806u;
import p088j2.AbstractC5741d;
import p088j2.C5739b;
import p088j2.ViewTreeObserverOnPreDrawListenerC5738a;
import p088j2.ViewTreeObserverOnScrollChangedListenerC5740c;

/* loaded from: classes3.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: s */
    public static final /* synthetic */ int f4262s = 0;

    /* renamed from: a */
    public final MDButton[] f4263a;

    /* renamed from: b */
    public int f4264b;

    /* renamed from: c */
    public View f4265c;

    /* renamed from: d */
    public View f4266d;

    /* renamed from: e */
    public boolean f4267e;

    /* renamed from: f */
    public boolean f4268f;

    /* renamed from: g */
    public StackingBehavior f4269g;

    /* renamed from: h */
    public boolean f4270h;

    /* renamed from: i */
    public boolean f4271i;

    /* renamed from: j */
    public boolean f4272j;

    /* renamed from: k */
    public int f4273k;

    /* renamed from: l */
    public int f4274l;

    /* renamed from: m */
    public int f4275m;

    /* renamed from: n */
    public GravityEnum f4276n;

    /* renamed from: o */
    public int f4277o;

    /* renamed from: p */
    public Paint f4278p;

    /* renamed from: q */
    public ViewTreeObserverOnScrollChangedListenerC5740c f4279q;

    /* renamed from: r */
    public int f4280r;

    public MDRootLayout(Context context) {
        super(context, null);
        this.f4263a = new MDButton[3];
        this.f4267e = false;
        this.f4268f = false;
        this.f4269g = StackingBehavior.ADAPTIVE;
        this.f4270h = false;
        this.f4271i = true;
        this.f4276n = GravityEnum.START;
        m3481c(context, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3478a(com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout r3, android.view.ViewGroup r4, boolean r5, boolean r6) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2e
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto L2e
            android.view.View r5 = r3.f4265c
            if (r5 == 0) goto L2b
            int r5 = r5.getVisibility()
            r2 = 8
            if (r5 == r2) goto L2b
            int r5 = r4.getScrollY()
            int r2 = r4.getPaddingTop()
            int r2 = r2 + r5
            android.view.View r5 = r4.getChildAt(r1)
            int r5 = r5.getTop()
            if (r2 <= r5) goto L2b
            r5 = r0
            goto L2c
        L2b:
            r5 = r1
        L2c:
            r3.f4267e = r5
        L2e:
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto L57
            if (r6 == 0) goto L54
            int r5 = r4.getScrollY()
            int r6 = r4.getHeight()
            int r6 = r6 + r5
            int r5 = r4.getPaddingBottom()
            int r6 = r6 - r5
            int r5 = r4.getChildCount()
            int r5 = r5 - r0
            android.view.View r4 = r4.getChildAt(r5)
            int r4 = r4.getBottom()
            if (r6 >= r4) goto L54
            goto L55
        L54:
            r0 = r1
        L55:
            r3.f4268f = r0
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.m3478a(com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout, android.view.ViewGroup, boolean, boolean):void");
    }

    /* renamed from: d */
    public static boolean m3479d(View view) {
        boolean z8 = (view == null || view.getVisibility() == 8) ? false : true;
        return (z8 && (view instanceof MDButton)) ? ((MDButton) view).getText().toString().trim().length() > 0 : z8;
    }

    /* renamed from: b */
    public final void m3480b(ViewGroup viewGroup, boolean z8) {
        if (this.f4279q == null) {
            if (viewGroup instanceof RecyclerView) {
                C5739b c5739b = new C5739b(this, viewGroup, z8);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.addOnScrollListener(c5739b);
                c5739b.onScrolled(recyclerView, 0, 0);
                return;
            }
            ViewTreeObserverOnScrollChangedListenerC5740c viewTreeObserverOnScrollChangedListenerC5740c = new ViewTreeObserverOnScrollChangedListenerC5740c(this, viewGroup, z8);
            this.f4279q = viewTreeObserverOnScrollChangedListenerC5740c;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f4279q);
            viewTreeObserverOnScrollChangedListenerC5740c.onScrollChanged();
        }
    }

    /* renamed from: c */
    public final void m3481c(Context context, AttributeSet attributeSet, int i) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i, 0);
        this.f4272j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f4273k = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.f4274l = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.f4277o = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.f4275m = AbstractC5806u.m5253G(context, R$attr.md_button_height, resources.getDimensionPixelSize(R$dimen.default_md_button_height_phone));
        this.f4278p = new Paint();
        this.f4280r = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.f4278p.setColor(AbstractC5806u.m5252F(context, R$attr.md_divider_color, 0));
        setWillNotDraw(false);
    }

    /* renamed from: e */
    public final void m3482e(View view, boolean z8) {
        View childAt;
        if (view == null) {
            return;
        }
        boolean z9 = false;
        if (view instanceof ScrollView) {
            ViewGroup viewGroup = (ScrollView) view;
            if (viewGroup.getChildCount() != 0) {
                if ((viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(0).getMeasuredHeight()) {
                    m3480b(viewGroup, z8);
                    return;
                }
            }
            if (z8) {
                this.f4267e = false;
            }
            this.f4268f = false;
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (adapterView.getLastVisiblePosition() != -1) {
                boolean z10 = adapterView.getFirstVisiblePosition() == 0;
                boolean z11 = adapterView.getLastVisiblePosition() == adapterView.getCount() - 1;
                if (!z10 || !z11 || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom()) {
                    m3480b(adapterView, z8);
                    return;
                }
            }
            if (z8) {
                this.f4267e = false;
            }
            this.f4268f = false;
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC5738a(this, view, z8));
            return;
        }
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null && recyclerView.getLayoutManager().canScrollVertically()) {
                z9 = true;
            }
            if (z8) {
                this.f4267e = z9;
            }
            this.f4268f = z9;
            if (z9) {
                m3480b((ViewGroup) view, z8);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            View view2 = null;
            if (viewGroup2.getChildCount() == 0) {
                childAt = null;
            } else {
                for (int childCount = viewGroup2.getChildCount() - 1; childCount >= 0; childCount--) {
                    childAt = viewGroup2.getChildAt(childCount);
                    if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                        break;
                    }
                }
                childAt = null;
            }
            m3482e(childAt, z8);
            if (viewGroup2.getChildCount() != 0) {
                int childCount2 = viewGroup2.getChildCount() - 1;
                while (true) {
                    if (childCount2 < 0) {
                        break;
                    }
                    View childAt2 = viewGroup2.getChildAt(childCount2);
                    if (childAt2.getVisibility() == 0 && childAt2.getBottom() == viewGroup2.getMeasuredHeight()) {
                        view2 = childAt2;
                        break;
                    }
                    childCount2--;
                }
            }
            if (view2 != childAt) {
                m3482e(view2, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        View view = this.f4266d;
        if (view != null) {
            if (this.f4267e) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, r0 - this.f4280r, getMeasuredWidth(), view.getTop(), this.f4278p);
            } else {
                canvas2 = canvas;
            }
            if (this.f4268f) {
                canvas2.drawRect(0.0f, this.f4266d.getBottom(), getMeasuredWidth(), r15 + this.f4280r, this.f4278p);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.f4265c = childAt;
            } else {
                int id = childAt.getId();
                int i8 = R$id.md_buttonDefaultNeutral;
                MDButton[] mDButtonArr = this.f4263a;
                if (id == i8) {
                    mDButtonArr[0] = (MDButton) childAt;
                } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                    mDButtonArr[1] = (MDButton) childAt;
                } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                    mDButtonArr[2] = (MDButton) childAt;
                } else {
                    this.f4266d = childAt;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        int i11;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        if (m3479d(this.f4265c)) {
            int measuredHeight = this.f4265c.getMeasuredHeight() + i8;
            this.f4265c.layout(i, i8, i9, measuredHeight);
            i8 = measuredHeight;
        } else if (this.f4271i) {
            i8 += this.f4273k;
        }
        if (m3479d(this.f4266d)) {
            View view = this.f4266d;
            view.layout(i, i8, i9, view.getMeasuredHeight() + i8);
        }
        boolean z9 = this.f4270h;
        MDButton[] mDButtonArr = this.f4263a;
        if (z9) {
            int measuredHeight2 = i10 - this.f4274l;
            for (MDButton mDButton : mDButtonArr) {
                if (m3479d(mDButton)) {
                    mDButton.layout(i, measuredHeight2 - mDButton.getMeasuredHeight(), i9, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f4271i) {
                i10 -= this.f4274l;
            }
            int i12 = i10 - this.f4275m;
            int measuredWidth9 = this.f4277o;
            if (m3479d(mDButtonArr[2])) {
                if (this.f4276n == GravityEnum.END) {
                    measuredWidth7 = i + measuredWidth9;
                    measuredWidth8 = mDButtonArr[2].getMeasuredWidth() + measuredWidth7;
                    i11 = -1;
                } else {
                    int i13 = i9 - measuredWidth9;
                    measuredWidth7 = i13 - mDButtonArr[2].getMeasuredWidth();
                    measuredWidth8 = i13;
                    i11 = measuredWidth7;
                }
                mDButtonArr[2].layout(measuredWidth7, i12, measuredWidth8, i10);
                measuredWidth9 += mDButtonArr[2].getMeasuredWidth();
            } else {
                i11 = -1;
            }
            if (m3479d(mDButtonArr[1])) {
                GravityEnum gravityEnum = this.f4276n;
                if (gravityEnum == GravityEnum.END) {
                    measuredWidth5 = measuredWidth9 + i;
                    measuredWidth6 = mDButtonArr[1].getMeasuredWidth() + measuredWidth5;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth6 = i9 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - mDButtonArr[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f4277o + i;
                    measuredWidth6 = mDButtonArr[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth = measuredWidth6;
                    mDButtonArr[1].layout(measuredWidth5, i12, measuredWidth6, i10);
                }
                measuredWidth = -1;
                mDButtonArr[1].layout(measuredWidth5, i12, measuredWidth6, i10);
            } else {
                measuredWidth = -1;
            }
            if (m3479d(mDButtonArr[0])) {
                GravityEnum gravityEnum2 = this.f4276n;
                if (gravityEnum2 == GravityEnum.END) {
                    measuredWidth3 = i9 - this.f4277o;
                    measuredWidth4 = measuredWidth3 - mDButtonArr[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    measuredWidth4 = i + this.f4277o;
                    measuredWidth3 = mDButtonArr[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i11 == -1) {
                        if (i11 == -1 && measuredWidth != -1) {
                            measuredWidth2 = mDButtonArr[0].getMeasuredWidth();
                        } else if (i11 == -1) {
                            measuredWidth = ((i9 - i) / 2) - (mDButtonArr[0].getMeasuredWidth() / 2);
                            measuredWidth2 = mDButtonArr[0].getMeasuredWidth();
                        }
                        i11 = measuredWidth2 + measuredWidth;
                    } else {
                        measuredWidth = i11 - mDButtonArr[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i11;
                    measuredWidth4 = measuredWidth;
                }
                mDButtonArr[0].layout(measuredWidth4, i12, measuredWidth3, i10);
            }
        }
        m3482e(this.f4266d, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f4276n = gravityEnum;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i = AbstractC5741d.f9087a[this.f4276n.ordinal()];
            if (i == 1) {
                this.f4276n = GravityEnum.END;
            } else {
                if (i != 2) {
                    return;
                }
                this.f4276n = GravityEnum.START;
            }
        }
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.f4263a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i) {
        this.f4278p.setColor(i);
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.f4264b = i;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f4269g = stackingBehavior;
        invalidate();
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4263a = new MDButton[3];
        this.f4267e = false;
        this.f4268f = false;
        this.f4269g = StackingBehavior.ADAPTIVE;
        this.f4270h = false;
        this.f4271i = true;
        this.f4276n = GravityEnum.START;
        m3481c(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4263a = new MDButton[3];
        this.f4267e = false;
        this.f4268f = false;
        this.f4269g = StackingBehavior.ADAPTIVE;
        this.f4270h = false;
        this.f4271i = true;
        this.f4276n = GravityEnum.START;
        m3481c(context, attributeSet, i);
    }
}
