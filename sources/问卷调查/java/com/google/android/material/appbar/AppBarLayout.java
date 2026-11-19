package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.InterfaceC0257f;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p080c.C0570a;
import p070b.p074b.p075a.p076a.p081d.AbstractC0584e;
import p070b.p074b.p075a.p076a.p081d.AbstractC0585f;
import p070b.p074b.p075a.p076a.p081d.C0580a;
import p070b.p074b.p075a.p076a.p081d.C0581b;
import p070b.p074b.p075a.p076a.p081d.C0582c;
import p070b.p074b.p075a.p076a.p081d.C0583d;
import p070b.p074b.p075a.p076a.p101w.C0675g;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0502b {

    /* renamed from: b */
    public int f4771b;

    /* renamed from: c */
    public int f4772c;

    /* renamed from: d */
    public int f4773d;

    /* renamed from: e */
    public int f4774e;

    /* renamed from: f */
    public boolean f4775f;

    /* renamed from: g */
    public int f4776g;

    /* renamed from: h */
    public boolean f4777h;

    /* renamed from: i */
    public boolean f4778i;

    /* renamed from: j */
    public boolean f4779j;

    /* renamed from: k */
    public int f4780k;

    /* renamed from: l */
    public WeakReference<View> f4781l;

    /* renamed from: m */
    public ValueAnimator f4782m;

    /* renamed from: n */
    public int[] f4783n;

    /* renamed from: o */
    public Drawable f4784o;

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC0584e<T> {

        /* renamed from: j */
        public int f4785j;

        /* renamed from: k */
        public int f4786k;

        /* renamed from: l */
        public ValueAnimator f4787l;

        /* renamed from: m */
        public int f4788m;

        /* renamed from: n */
        public boolean f4789n;

        /* renamed from: o */
        public float f4790o;

        /* renamed from: p */
        public WeakReference<View> f4791p;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static class C0911a extends AbstractC0287a {
            public static final Parcelable.Creator<C0911a> CREATOR = new a();

            /* renamed from: d */
            public int f4792d;

            /* renamed from: e */
            public float f4793e;

            /* renamed from: f */
            public boolean f4794f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            public static class a implements Parcelable.ClassLoaderCreator<C0911a> {
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new C0911a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new C0911a[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public C0911a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0911a(parcel, classLoader);
                }
            }

            public C0911a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f4792d = parcel.readInt();
                this.f4793e = parcel.readFloat();
                this.f4794f = parcel.readByte() != 0;
            }

            public C0911a(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f1718b, i);
                parcel.writeInt(this.f4792d);
                parcel.writeFloat(this.f4793e);
                parcel.writeByte(this.f4794f ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f4788m = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4788m = -1;
        }

        /* renamed from: J */
        public static boolean m2600J(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // p070b.p074b.p075a.p076a.p081d.AbstractC0584e
        /* renamed from: E */
        public int mo2109E() {
            return m2115B() + this.f4785j;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
        @Override // p070b.p074b.p075a.p076a.p081d.AbstractC0584e
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo2112H(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo2112H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: I */
        public final void m2601I(CoordinatorLayout coordinatorLayout, T t, int i, float f2) {
            int iAbs = Math.abs(mo2109E() - i);
            float fAbs = Math.abs(f2);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f);
            int iMo2109E = mo2109E();
            if (iMo2109E == i) {
                ValueAnimator valueAnimator = this.f4787l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f4787l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f4787l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f4787l = valueAnimator3;
                valueAnimator3.setInterpolator(C0570a.f3538e);
                this.f4787l.addUpdateListener(new C0581b(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f4787l.setDuration(Math.min(iRound, 600));
            this.f4787l.setIntValues(iMo2109E, i);
            this.f4787l.start();
        }

        /* renamed from: K */
        public final View m2602K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0257f) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: L */
        public void m2603L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int downNestedPreScrollRange;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    iArr[1] = m2110F(coordinatorLayout, appBarLayout, i, i3, i4);
                }
            }
            if (appBarLayout.f4779j) {
                appBarLayout.m2597c(appBarLayout.m2598d(view));
            }
        }

        /* renamed from: M */
        public void m2604M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            if (i < 0) {
                iArr[1] = m2110F(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i == 0) {
                m2607P(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m2605N(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L2a
                boolean r6 = r4.f4779j
                if (r6 != 0) goto L2b
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L12
                r6 = r0
                goto L13
            L12:
                r6 = r1
            L13:
                if (r6 == 0) goto L26
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L26
                r3 = r0
                goto L27
            L26:
                r3 = r1
            L27:
                if (r3 == 0) goto L2a
                goto L2b
            L2a:
                r0 = r1
            L2b:
                if (r0 == 0) goto L34
                android.animation.ValueAnimator r3 = r2.f4787l
                if (r3 == 0) goto L34
                r3.cancel()
            L34:
                r3 = 0
                r2.f4791p = r3
                r2.f4786k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m2605N(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int):boolean");
        }

        /* renamed from: O */
        public final void m2606O(CoordinatorLayout coordinatorLayout, T t) {
            int iMo2109E = mo2109E();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0912a c0912a = (C0912a) childAt.getLayoutParams();
                if (m2600J(c0912a.f4795a, 32)) {
                    top -= ((LinearLayout.LayoutParams) c0912a).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c0912a).bottomMargin;
                }
                int i2 = -iMo2109E;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                C0912a c0912a2 = (C0912a) childAt2.getLayoutParams();
                int i3 = c0912a2.f4795a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        minimumHeight += t.getTopInset();
                    }
                    if (m2600J(i3, 2)) {
                        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (m2600J(i3, 5)) {
                        WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iMo2109E < minimumHeight2) {
                            i4 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (m2600J(i3, 32)) {
                        i4 += ((LinearLayout.LayoutParams) c0912a2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c0912a2).bottomMargin;
                    }
                    if (iMo2109E < (minimumHeight + i4) / 2) {
                        i4 = minimumHeight;
                    }
                    m2601I(coordinatorLayout, t, C0190e.m713h(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: P */
        public final void m2607P(CoordinatorLayout coordinatorLayout, T t) {
            C0245b.a aVar = C0245b.a.f1567f;
            C0266o.m872k(aVar.m827a(), coordinatorLayout);
            C0266o.m869h(coordinatorLayout, 0);
            C0245b.a aVar2 = C0245b.a.f1568g;
            C0266o.m872k(aVar2.m827a(), coordinatorLayout);
            C0266o.m869h(coordinatorLayout, 0);
            View viewM2602K = m2602K(coordinatorLayout);
            if (viewM2602K == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0506f) viewM2602K.getLayoutParams()).f3114a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (mo2109E() != (-t.getTotalScrollRange()) && viewM2602K.canScrollVertically(1)) {
                C0266o.m873l(coordinatorLayout, aVar, null, new C0583d(this, t, false));
            }
            if (mo2109E() != 0) {
                if (!viewM2602K.canScrollVertically(-1)) {
                    C0266o.m873l(coordinatorLayout, aVar2, null, new C0583d(this, t, true));
                    return;
                }
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    C0266o.m873l(coordinatorLayout, aVar2, null, new C0582c(this, coordinatorLayout, t, viewM2602K, i));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
        /* renamed from: Q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m2608Q(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L9f
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.C0912a) r0
                int r0 = r0.f4795a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L5d
                java.util.WeakHashMap<android.view.View, a.h.j.v> r1 = p000a.p031h.p043j.C0266o.f1616a
                int r1 = r4.getMinimumHeight()
                if (r10 <= 0) goto L4a
                r10 = r0 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5d
                goto L5b
            L4a:
                r10 = r0 & 2
                if (r10 == 0) goto L5d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5d
            L5b:
                r9 = r3
                goto L5e
            L5d:
                r9 = r2
            L5e:
                boolean r10 = r8.f4779j
                if (r10 == 0) goto L6a
                android.view.View r9 = r6.m2602K(r7)
                boolean r9 = r8.m2598d(r9)
            L6a:
                boolean r9 = r8.m2597c(r9)
                if (r11 != 0) goto L9c
                if (r9 == 0) goto L9f
                java.util.List r7 = r7.m1648e(r8)
                int r9 = r7.size()
                r10 = r2
            L7b:
                if (r10 >= r9) goto L9a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0506f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f3114a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L97
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f3578f
                if (r7 == 0) goto L9a
                r2 = r3
                goto L9a
            L97:
                int r10 = r10 + 1
                goto L7b
            L9a:
                if (r2 == 0) goto L9f
            L9c:
                r8.jumpDrawablesToCurrentState()
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m2608Q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // p070b.p074b.p075a.p076a.p081d.C0586g, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: k */
        public boolean mo1674k(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo1674k(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.f4788m;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.f4789n) {
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f4790o) + i3;
                }
                m2111G(coordinatorLayout, appBarLayout, iRound);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m2601I(coordinatorLayout, appBarLayout, i4, 0.0f);
                    } else {
                        m2111G(coordinatorLayout, appBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m2601I(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        m2111G(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f4776g = 0;
            this.f4788m = -1;
            m2116D(C0190e.m713h(m2115B(), -appBarLayout.getTotalScrollRange(), 0));
            m2608Q(coordinatorLayout, appBarLayout, m2115B(), 0, true);
            appBarLayout.f4771b = m2115B();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                appBarLayout.postInvalidateOnAnimation();
            }
            m2607P(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: l */
        public boolean mo1675l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0506f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m1656s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: p */
        public /* bridge */ /* synthetic */ void mo1679p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m2603L(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: r */
        public /* bridge */ /* synthetic */ void mo1681r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            m2604M(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: u */
        public void mo1684u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (!(parcelable instanceof C0911a)) {
                this.f4788m = -1;
                return;
            }
            C0911a c0911a = (C0911a) parcelable;
            this.f4788m = c0911a.f4792d;
            this.f4790o = c0911a.f4793e;
            this.f4789n = c0911a.f4794f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: v */
        public Parcelable mo1685v(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iM2115B = m2115B();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iM2115B;
                if (childAt.getTop() + iM2115B <= 0 && bottom >= 0) {
                    C0911a c0911a = new C0911a(absSavedState);
                    c0911a.f4792d = i;
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    c0911a.f4794f = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    c0911a.f4793e = bottom / childAt.getHeight();
                    return c0911a;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: x */
        public /* bridge */ /* synthetic */ boolean mo1687x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return m2605N(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: z */
        public void mo1689z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f4786k == 0 || i == 1) {
                m2606O(coordinatorLayout, appBarLayout);
                if (appBarLayout.f4779j) {
                    appBarLayout.m2597c(appBarLayout.m2598d(view2));
                }
            }
            this.f4791p = new WeakReference<>(view2);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC0585f {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3523r);
            this.f3578f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: F */
        public AppBarLayout m2609F(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: d */
        public boolean mo1667d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: g */
        public boolean mo1670g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.AbstractC0503c abstractC0503c = ((CoordinatorLayout.C0506f) view2.getLayoutParams()).f3114a;
            if (abstractC0503c instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0503c).f4785j) + this.f3577e) - m2114E(view2);
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f4779j) {
                return false;
            }
            appBarLayout.m2597c(appBarLayout.m2598d(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: h */
        public void mo1671h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C0266o.m872k(C0245b.a.f1567f.m827a(), coordinatorLayout);
                C0266o.m869h(coordinatorLayout, 0);
                C0266o.m872k(C0245b.a.f1568g.m827a(), coordinatorLayout);
                C0266o.m869h(coordinatorLayout, 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
        /* renamed from: t */
        public boolean mo1683t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutM2609F = m2609F(coordinatorLayout.m1647d(view));
            if (appBarLayoutM2609F != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f3575c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutM2609F.m2596b(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public static class C0912a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f4795a;

        /* renamed from: b */
        public Interpolator f4796b;

        public C0912a(int i, int i2) {
            super(i, i2);
            this.f4795a = 1;
        }

        public C0912a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4795a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3506a);
            this.f4795a = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.f4796b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0912a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4795a = 1;
        }

        public C0912a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4795a = 1;
        }

        public C0912a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4795a = 1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0912a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C0912a((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0912a((ViewGroup.MarginLayoutParams) layoutParams) : new C0912a(layoutParams);
    }

    /* renamed from: b */
    public void m2596b(boolean z, boolean z2) {
        this.f4776g = (z ? 1 : 2) | (z2 ? 4 : 0) | 8;
        requestLayout();
    }

    /* renamed from: c */
    public boolean m2597c(boolean z) {
        if (this.f4778i == z) {
            return false;
        }
        this.f4778i = z;
        refreshDrawableState();
        if (this.f4779j && (getBackground() instanceof C0675g)) {
            C0675g c0675g = (C0675g) getBackground();
            float dimension = getResources().getDimension(C1088R.dimen.design_appbar_elevation);
            float f2 = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f4782m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, dimension);
            this.f4782m = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(C1088R.integer.app_bar_elevation_anim_duration));
            this.f4782m.setInterpolator(C0570a.f3534a);
            this.f4782m.addUpdateListener(new C0580a(this, c0675g));
            this.f4782m.start();
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0912a;
    }

    /* renamed from: d */
    public boolean m2598d(View view) {
        int i;
        if (this.f4781l == null && (i = this.f4780k) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f4780k);
            }
            if (viewFindViewById != null) {
                this.f4781l = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f4781l;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f4784o != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f4771b);
            this.f4784o.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4784o;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public final boolean m2599e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return !childAt.getFitsSystemWindows();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0912a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0912a(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0502b
    public CoordinatorLayout.AbstractC0503c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int minimumHeight;
        int i = this.f4773d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0912a c0912a = (C0912a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c0912a.f4795a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) c0912a).topMargin + ((LinearLayout.LayoutParams) c0912a).bottomMargin;
                if ((i3 & 8) != 0) {
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    minimumHeight = i4 + childAt.getMinimumHeight();
                } else if ((i3 & 2) != 0) {
                    WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                    minimumHeight = i4 + (measuredHeight - childAt.getMinimumHeight());
                } else {
                    minimumHeight = i4 + measuredHeight;
                }
                if (childCount == 0) {
                    WeakHashMap<View, C0273v> weakHashMap3 = C0266o.f1616a;
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight = Math.min(minimumHeight, measuredHeight - getTopInset());
                    }
                }
                i2 += minimumHeight;
            }
        }
        int iMax = Math.max(0, i2);
        this.f4773d = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f4774e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0912a c0912a = (C0912a) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) c0912a).topMargin + ((LinearLayout.LayoutParams) c0912a).bottomMargin + childAt.getMeasuredHeight();
            int i3 = c0912a.f4795a;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f4774e = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f4780k;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f4776g;
    }

    public Drawable getStatusBarForeground() {
        return this.f4784o;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f4772c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0912a c0912a = (C0912a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c0912a.f4795a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) c0912a).topMargin + ((LinearLayout.LayoutParams) c0912a).bottomMargin + minimumHeight;
            if (i2 == 0) {
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                if (childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
            }
            minimumHeight = topInset;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f4772c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0675g) {
            C0562a.m2098s(this, (C0675g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f4783n == null) {
            this.f4783n = new int[4];
        }
        int[] iArr = this.f4783n;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f4777h;
        iArr[0] = z ? C1088R.attr.state_liftable : -2130970030;
        iArr[1] = (z && this.f4778i) ? C1088R.attr.state_lifted : -2130970031;
        iArr[2] = z ? C1088R.attr.state_collapsible : -2130970028;
        iArr[3] = (z && this.f4778i) ? C1088R.attr.state_collapsed : -2130970027;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f4781l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f4781l = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        boolean z3 = true;
        if (getFitsSystemWindows() && m2599e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        this.f4772c = -1;
        this.f4773d = -1;
        this.f4774e = -1;
        this.f4775f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C0912a) getChildAt(i5).getLayoutParams()).f4796b != null) {
                this.f4775f = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.f4784o;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f4779j) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C0912a) getChildAt(i6).getLayoutParams()).f4795a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f4777h != z3) {
            this.f4777h = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (getFitsSystemWindows() && m2599e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C0190e.m713h(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.f4772c = -1;
        this.f4773d = -1;
        this.f4774e = -1;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C0562a.m2097r(this, f2);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        m2596b(z, isLaidOut());
    }

    public void setLiftOnScroll(boolean z) {
        this.f4779j = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f4780k = i;
        WeakReference<View> weakReference = this.f4781l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f4781l = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f4784o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f4784o = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f4784o.setState(getDrawableState());
                }
                Drawable drawable3 = this.f4784o;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f4784o.setVisible(getVisibility() == 0, false);
                this.f4784o.setCallback(this);
            }
            if (this.f4784o != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0034a.m129a(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) throws Resources.NotFoundException {
        int integer = getResources().getInteger(C1088R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, C1088R.attr.state_liftable, -2130970031}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(this, "elevation", f2).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f4784o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4784o;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C0912a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0912a(getContext(), attributeSet);
    }
}
