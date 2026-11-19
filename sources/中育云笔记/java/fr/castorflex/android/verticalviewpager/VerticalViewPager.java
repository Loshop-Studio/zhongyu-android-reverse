package fr.castorflex.android.verticalviewpager;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.KeyEventCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes6.dex */
public class VerticalViewPager extends ViewGroup {

    /* renamed from: k0 */
    public static final int[] f21477k0 = {R.attr.layout_gravity};

    /* renamed from: l0 */
    public static final Comparator f21478l0 = new C9242a();

    /* renamed from: m0 */
    public static final Interpolator f21479m0 = new InterpolatorC9243b();

    /* renamed from: n0 */
    public static final C9250i f21480n0 = new C9250i();

    /* renamed from: A */
    public boolean f21481A;

    /* renamed from: B */
    public int f21482B;

    /* renamed from: C */
    public int f21483C;

    /* renamed from: D */
    public int f21484D;

    /* renamed from: E */
    public float f21485E;

    /* renamed from: F */
    public float f21486F;

    /* renamed from: G */
    public float f21487G;

    /* renamed from: H */
    public float f21488H;

    /* renamed from: I */
    public int f21489I;

    /* renamed from: J */
    public VelocityTracker f21490J;

    /* renamed from: K */
    public int f21491K;

    /* renamed from: L */
    public int f21492L;

    /* renamed from: M */
    public int f21493M;

    /* renamed from: N */
    public int f21494N;

    /* renamed from: O */
    public boolean f21495O;

    /* renamed from: P */
    public EdgeEffectCompat f21496P;

    /* renamed from: Q */
    public EdgeEffectCompat f21497Q;

    /* renamed from: R */
    public boolean f21498R;

    /* renamed from: S */
    public boolean f21499S;

    /* renamed from: T */
    public boolean f21500T;

    /* renamed from: U */
    public int f21501U;

    /* renamed from: V */
    public ViewPager.OnPageChangeListener f21502V;

    /* renamed from: W */
    public ViewPager.OnPageChangeListener f21503W;

    /* renamed from: c */
    public int f21504c;

    /* renamed from: d */
    public final ArrayList f21505d;

    /* renamed from: e */
    public final C9245d f21506e;

    /* renamed from: e0 */
    public ViewPager.PageTransformer f21507e0;

    /* renamed from: f */
    public final Rect f21508f;

    /* renamed from: f0 */
    public Method f21509f0;

    /* renamed from: g */
    public PagerAdapter f21510g;

    /* renamed from: g0 */
    public int f21511g0;

    /* renamed from: h */
    public int f21512h;

    /* renamed from: h0 */
    public ArrayList f21513h0;

    /* renamed from: i */
    public int f21514i;

    /* renamed from: i0 */
    public final Runnable f21515i0;

    /* renamed from: j */
    public Parcelable f21516j;

    /* renamed from: j0 */
    public int f21517j0;

    /* renamed from: k */
    public ClassLoader f21518k;

    /* renamed from: l */
    public Scroller f21519l;

    /* renamed from: m */
    public C9249h f21520m;

    /* renamed from: n */
    public int f21521n;

    /* renamed from: o */
    public Drawable f21522o;

    /* renamed from: p */
    public int f21523p;

    /* renamed from: q */
    public int f21524q;

    /* renamed from: r */
    public float f21525r;

    /* renamed from: s */
    public float f21526s;

    /* renamed from: t */
    public int f21527t;

    /* renamed from: u */
    public int f21528u;

    /* renamed from: v */
    public boolean f21529v;

    /* renamed from: w */
    public boolean f21530w;

    /* renamed from: x */
    public boolean f21531x;

    /* renamed from: y */
    public int f21532y;

    /* renamed from: z */
    public boolean f21533z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new C9241a());

        /* renamed from: c */
        public int f21534c;

        /* renamed from: d */
        public Parcelable f21535d;

        /* renamed from: e */
        public ClassLoader f21536e;

        /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$SavedState$a */
        public static class C9241a implements ParcelableCompatCreatorCallbacks {
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f21534c + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21534c);
            parcel.writeParcelable(this.f21535d, i10);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f21534c = parcel.readInt();
            this.f21535d = parcel.readParcelable(classLoader);
            this.f21536e = classLoader;
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$a */
    public static class C9242a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C9245d c9245d, C9245d c9245d2) {
            return c9245d.f21539b - c9245d2.f21539b;
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$b */
    public static class InterpolatorC9243b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$c */
    public class RunnableC9244c implements Runnable {
        public RunnableC9244c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.m18171D();
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$d */
    public static class C9245d {

        /* renamed from: a */
        public Object f21538a;

        /* renamed from: b */
        public int f21539b;

        /* renamed from: c */
        public boolean f21540c;

        /* renamed from: d */
        public float f21541d;

        /* renamed from: e */
        public float f21542e;
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$f */
    public class C9247f extends AccessibilityDelegateCompat {
        public C9247f() {
        }

        public final boolean canScroll() {
            return VerticalViewPager.this.f21510g != null && VerticalViewPager.this.f21510g.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat accessibilityRecordCompatObtain = AccessibilityRecordCompat.obtain();
            accessibilityRecordCompatObtain.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() != 4096 || VerticalViewPager.this.f21510g == null) {
                return;
            }
            accessibilityRecordCompatObtain.setItemCount(VerticalViewPager.this.f21510g.getCount());
            accessibilityRecordCompatObtain.setFromIndex(VerticalViewPager.this.f21512h);
            accessibilityRecordCompatObtain.setToIndex(VerticalViewPager.this.f21512h);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (VerticalViewPager.this.m18199v(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (VerticalViewPager.this.m18199v(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) throws Resources.NotFoundException {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (!VerticalViewPager.this.m18199v(1)) {
                    return false;
                }
                VerticalViewPager verticalViewPager = VerticalViewPager.this;
                verticalViewPager.setCurrentItem(verticalViewPager.f21512h + 1);
                return true;
            }
            if (i10 != 8192 || !VerticalViewPager.this.m18199v(-1)) {
                return false;
            }
            VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
            verticalViewPager2.setCurrentItem(verticalViewPager2.f21512h - 1);
            return true;
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$g */
    public interface InterfaceC9248g {
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$h */
    public class C9249h extends DataSetObserver {
        public C9249h() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            VerticalViewPager.this.m18187j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            VerticalViewPager.this.m18187j();
        }

        public /* synthetic */ C9249h(VerticalViewPager verticalViewPager, C9242a c9242a) {
            this();
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$i */
    public static class C9250i implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C9246e c9246e = (C9246e) view.getLayoutParams();
            C9246e c9246e2 = (C9246e) view2.getLayoutParams();
            boolean z10 = c9246e.f21543a;
            return z10 != c9246e2.f21543a ? z10 ? 1 : -1 : c9246e.f21547e - c9246e2.f21547e;
        }
    }

    public VerticalViewPager(Context context) {
        super(context);
        this.f21505d = new ArrayList();
        this.f21506e = new C9245d();
        this.f21508f = new Rect();
        this.f21514i = -1;
        this.f21516j = null;
        this.f21518k = null;
        this.f21525r = -3.4028235E38f;
        this.f21526s = Float.MAX_VALUE;
        this.f21532y = 1;
        this.f21489I = -1;
        this.f21498R = true;
        this.f21499S = false;
        this.f21515i0 = new RunnableC9244c();
        this.f21517j0 = 0;
        m18198u();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i10) {
        if (this.f21517j0 == i10) {
            return;
        }
        this.f21517j0 = i10;
        if (this.f21507e0 != null) {
            m18190m(i10 != 0);
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f21502V;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i10);
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f21530w != z10) {
            this.f21530w = z10;
        }
    }

    /* renamed from: A */
    public final boolean m18168A(int i10) {
        if (this.f21505d.size() == 0) {
            this.f21500T = false;
            m18201x(0, 0.0f, 0);
            if (this.f21500T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C9245d c9245dM18196s = m18196s();
        int clientHeight = getClientHeight();
        int i11 = this.f21521n;
        int i12 = clientHeight + i11;
        float f10 = clientHeight;
        int i13 = c9245dM18196s.f21539b;
        float f11 = ((i10 / f10) - c9245dM18196s.f21542e) / (c9245dM18196s.f21541d + (i11 / f10));
        this.f21500T = false;
        m18201x(i13, f11, (int) (i12 * f11));
        if (this.f21500T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: B */
    public boolean m18169B() throws Resources.NotFoundException {
        int i10 = this.f21512h;
        if (i10 <= 0) {
            return false;
        }
        m18177J(i10 - 1, true);
        return true;
    }

    /* renamed from: C */
    public final boolean m18170C(float f10) {
        boolean z10;
        float f11 = this.f21486F - f10;
        this.f21486F = f10;
        float scrollY = getScrollY() + f11;
        float clientHeight = getClientHeight();
        float f12 = this.f21525r * clientHeight;
        float f13 = this.f21526s * clientHeight;
        C9245d c9245d = (C9245d) this.f21505d.get(0);
        ArrayList arrayList = this.f21505d;
        boolean z11 = true;
        C9245d c9245d2 = (C9245d) arrayList.get(arrayList.size() - 1);
        if (c9245d.f21539b != 0) {
            f12 = c9245d.f21542e * clientHeight;
            z10 = false;
        } else {
            z10 = true;
        }
        if (c9245d2.f21539b != this.f21510g.getCount() - 1) {
            f13 = c9245d2.f21542e * clientHeight;
            z11 = false;
        }
        if (scrollY < f12) {
            zOnPull = z10 ? this.f21496P.onPull(Math.abs(f12 - scrollY) / clientHeight) : false;
            scrollY = f12;
        } else if (scrollY > f13) {
            zOnPull = z11 ? this.f21497Q.onPull(Math.abs(scrollY - f13) / clientHeight) : false;
            scrollY = f13;
        }
        int i10 = (int) scrollY;
        this.f21485E += scrollY - i10;
        scrollTo(getScrollX(), i10);
        m18168A(i10);
        return zOnPull;
    }

    /* renamed from: D */
    public void m18171D() throws Resources.NotFoundException {
        m18172E(this.f21512h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7 A[PHI: r6 r8 r11
      0x00d7: PHI (r6v43 float) = (r6v41 float), (r6v42 float), (r6v10 float) binds: [B:67:0x00fd, B:64:0x00e7, B:55:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r8v6 int) = (r8v5 int), (r8v4 int), (r8v9 int) binds: [B:67:0x00fd, B:64:0x00e7, B:55:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r11v7 int) = (r11v1 int), (r11v6 int), (r11v10 int) binds: [B:67:0x00fd, B:64:0x00e7, B:55:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m18172E(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.castorflex.android.verticalviewpager.VerticalViewPager.m18172E(int):void");
    }

    /* renamed from: F */
    public final void m18173F(int i10, int i11, int i12, int i13) {
        if (i11 <= 0 || this.f21505d.isEmpty()) {
            C9245d c9245dM18197t = m18197t(this.f21512h);
            int iMin = (int) ((c9245dM18197t != null ? Math.min(c9245dM18197t.f21542e, this.f21526s) : 0.0f) * ((i10 - getPaddingTop()) - getPaddingBottom()));
            if (iMin != getScrollY()) {
                m18186i(false);
                scrollTo(getScrollX(), iMin);
                return;
            }
            return;
        }
        int scrollY = (int) ((getScrollY() / (((i11 - getPaddingTop()) - getPaddingBottom()) + i13)) * (((i10 - getPaddingTop()) - getPaddingBottom()) + i12));
        scrollTo(getScrollX(), scrollY);
        if (this.f21519l.isFinished()) {
            return;
        }
        this.f21519l.startScroll(0, scrollY, 0, (int) (m18197t(this.f21512h).f21542e * i10), this.f21519l.getDuration() - this.f21519l.timePassed());
    }

    /* renamed from: G */
    public final void m18174G() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C9246e) getChildAt(i10).getLayoutParams()).f21543a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    /* renamed from: H */
    public final void m18175H(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* renamed from: I */
    public final void m18176I(int i10, boolean z10, int i11, boolean z11) throws Resources.NotFoundException {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        ViewPager.OnPageChangeListener onPageChangeListener3;
        ViewPager.OnPageChangeListener onPageChangeListener4;
        C9245d c9245dM18197t = m18197t(i10);
        int clientHeight = c9245dM18197t != null ? (int) (getClientHeight() * Math.max(this.f21525r, Math.min(c9245dM18197t.f21542e, this.f21526s))) : 0;
        if (z10) {
            m18180M(0, clientHeight, i11);
            if (z11 && (onPageChangeListener4 = this.f21502V) != null) {
                onPageChangeListener4.onPageSelected(i10);
            }
            if (!z11 || (onPageChangeListener3 = this.f21503W) == null) {
                return;
            }
            onPageChangeListener3.onPageSelected(i10);
            return;
        }
        if (z11 && (onPageChangeListener2 = this.f21502V) != null) {
            onPageChangeListener2.onPageSelected(i10);
        }
        if (z11 && (onPageChangeListener = this.f21503W) != null) {
            onPageChangeListener.onPageSelected(i10);
        }
        m18186i(false);
        scrollTo(0, clientHeight);
        m18168A(clientHeight);
    }

    /* renamed from: J */
    public void m18177J(int i10, boolean z10) throws Resources.NotFoundException {
        this.f21531x = false;
        m18178K(i10, z10, false);
    }

    /* renamed from: K */
    public void m18178K(int i10, boolean z10, boolean z11) throws Resources.NotFoundException {
        m18179L(i10, z10, z11, 0);
    }

    /* renamed from: L */
    public void m18179L(int i10, boolean z10, boolean z11, int i11) throws Resources.NotFoundException {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        PagerAdapter pagerAdapter = this.f21510g;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f21512h == i10 && this.f21505d.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f21510g.getCount()) {
            i10 = this.f21510g.getCount() - 1;
        }
        int i12 = this.f21532y;
        int i13 = this.f21512h;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f21505d.size(); i14++) {
                ((C9245d) this.f21505d.get(i14)).f21540c = true;
            }
        }
        boolean z12 = this.f21512h != i10;
        if (!this.f21498R) {
            m18172E(i10);
            m18176I(i10, z10, i11, z12);
            return;
        }
        this.f21512h = i10;
        if (z12 && (onPageChangeListener2 = this.f21502V) != null) {
            onPageChangeListener2.onPageSelected(i10);
        }
        if (z12 && (onPageChangeListener = this.f21503W) != null) {
            onPageChangeListener.onPageSelected(i10);
        }
        requestLayout();
    }

    /* renamed from: M */
    public void m18180M(int i10, int i11, int i12) throws Resources.NotFoundException {
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i13 = i10 - scrollX;
        int i14 = i11 - scrollY;
        if (i13 == 0 && i14 == 0) {
            m18186i(false);
            m18171D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i15 = clientHeight / 2;
        float f10 = clientHeight;
        float f11 = i15;
        float fM18189l = f11 + (m18189l(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fM18189l / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i13) / ((f10 * this.f21510g.getPageWidth(this.f21512h)) + this.f21521n)) + 1.0f) * 100.0f);
        }
        this.f21519l.startScroll(scrollX, scrollY, i13, i14, Math.min(iAbs, 600));
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* renamed from: N */
    public final void m18181N() {
        if (this.f21511g0 != 0) {
            ArrayList arrayList = this.f21513h0;
            if (arrayList == null) {
                this.f21513h0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f21513h0.add(getChildAt(i10));
            }
            Collections.sort(this.f21513h0, f21480n0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        C9245d c9245dM18195r;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (c9245dM18195r = m18195r(childAt)) != null && c9245dM18195r.f21539b == this.f21512h) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        C9245d c9245dM18195r;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (c9245dM18195r = m18195r(childAt)) != null && c9245dM18195r.f21539b == this.f21512h) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C9246e c9246e = (C9246e) layoutParams;
        boolean z10 = c9246e.f21543a;
        c9246e.f21543a = z10;
        if (!this.f21529v) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c9246e.f21546d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C9246e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f21519l.isFinished() || !this.f21519l.computeScrollOffset()) {
            m18186i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f21519l.getCurrX();
        int currY = this.f21519l.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m18168A(currY)) {
                this.f21519l.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m18192o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C9245d c9245dM18195r;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (c9245dM18195r = m18195r(childAt)) != null && c9245dM18195r.f21539b == this.f21512h && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f21510g) != null && pagerAdapter.getCount() > 1)) {
            if (!this.f21496P.isFinished()) {
                int iSave = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), this.f21525r * height);
                this.f21496P.setSize(width, height);
                zDraw = this.f21496P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f21497Q.isFinished()) {
                int iSave2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((-width2) - getPaddingLeft(), (-(this.f21526s + 1.0f)) * height2);
                this.f21497Q.setSize(width2, height2);
                zDraw |= this.f21497Q.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f21496P.finish();
            this.f21497Q.finish();
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f21522o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public C9245d m18182e(int i10, int i11) {
        C9245d c9245d = new C9245d();
        c9245d.f21539b = i10;
        c9245d.f21538a = this.f21510g.instantiateItem((ViewGroup) this, i10);
        c9245d.f21541d = this.f21510g.getPageWidth(i10);
        if (i11 < 0 || i11 >= this.f21505d.size()) {
            this.f21505d.add(c9245d);
            return c9245d;
        }
        this.f21505d.add(i11, c9245d);
        return c9245d;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m18183f(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 130(0x82, float:1.82E-43)
            r3 = 33
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            if (r5 != r3) goto L93
            android.graphics.Rect r2 = r4.f21508f
            android.graphics.Rect r2 = r4.m18193p(r2, r1)
            int r2 = r2.top
            android.graphics.Rect r3 = r4.f21508f
            android.graphics.Rect r3 = r4.m18193p(r3, r0)
            int r3 = r3.top
            if (r0 == 0) goto L8e
            if (r2 < r3) goto L8e
            boolean r0 = r4.m18169B()
            goto Lca
        L8e:
            boolean r0 = r1.requestFocus()
            goto Lca
        L93:
            if (r5 != r2) goto Lbf
            android.graphics.Rect r2 = r4.f21508f
            android.graphics.Rect r2 = r4.m18193p(r2, r1)
            int r2 = r2.bottom
            android.graphics.Rect r3 = r4.f21508f
            android.graphics.Rect r3 = r4.m18193p(r3, r0)
            int r3 = r3.bottom
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r4.m18203z()
            goto Lca
        Lae:
            boolean r0 = r1.requestFocus()
            goto Lca
        Lb3:
            if (r5 == r3) goto Lc6
            r0 = 1
            if (r5 != r0) goto Lb9
            goto Lc6
        Lb9:
            if (r5 == r2) goto Lc1
            r0 = 2
            if (r5 != r0) goto Lbf
            goto Lc1
        Lbf:
            r0 = 0
            goto Lca
        Lc1:
            boolean r0 = r4.m18203z()
            goto Lca
        Lc6:
            boolean r0 = r4.m18169B()
        Lca:
            if (r0 == 0) goto Ld3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.castorflex.android.verticalviewpager.VerticalViewPager.m18183f(int):boolean");
    }

    /* renamed from: g */
    public final void m18184g(C9245d c9245d, int i10, C9245d c9245d2) {
        int i11;
        int i12;
        C9245d c9245d3;
        C9245d c9245d4;
        int count = this.f21510g.getCount();
        int clientHeight = getClientHeight();
        float f10 = clientHeight > 0 ? this.f21521n / clientHeight : 0.0f;
        if (c9245d2 != null) {
            int i13 = c9245d2.f21539b;
            int i14 = c9245d.f21539b;
            if (i13 < i14) {
                float pageWidth = c9245d2.f21542e + c9245d2.f21541d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= c9245d.f21539b && i16 < this.f21505d.size()) {
                    Object obj = this.f21505d.get(i16);
                    while (true) {
                        c9245d4 = (C9245d) obj;
                        if (i15 <= c9245d4.f21539b || i16 >= this.f21505d.size() - 1) {
                            break;
                        }
                        i16++;
                        obj = this.f21505d.get(i16);
                    }
                    while (i15 < c9245d4.f21539b) {
                        pageWidth += this.f21510g.getPageWidth(i15) + f10;
                        i15++;
                    }
                    c9245d4.f21542e = pageWidth;
                    pageWidth += c9245d4.f21541d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f21505d.size() - 1;
                float pageWidth2 = c9245d2.f21542e;
                while (true) {
                    i13--;
                    if (i13 < c9245d.f21539b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f21505d.get(size);
                    while (true) {
                        c9245d3 = (C9245d) obj2;
                        if (i13 >= c9245d3.f21539b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f21505d.get(size);
                    }
                    while (i13 > c9245d3.f21539b) {
                        pageWidth2 -= this.f21510g.getPageWidth(i13) + f10;
                        i13--;
                    }
                    pageWidth2 -= c9245d3.f21541d + f10;
                    c9245d3.f21542e = pageWidth2;
                }
            }
        }
        int size2 = this.f21505d.size();
        float pageWidth3 = c9245d.f21542e;
        int i17 = c9245d.f21539b;
        int i18 = i17 - 1;
        this.f21525r = i17 == 0 ? pageWidth3 : -3.4028235E38f;
        int i19 = count - 1;
        this.f21526s = i17 == i19 ? (c9245d.f21541d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            C9245d c9245d5 = (C9245d) this.f21505d.get(i20);
            while (true) {
                i12 = c9245d5.f21539b;
                if (i18 <= i12) {
                    break;
                }
                pageWidth3 -= this.f21510g.getPageWidth(i18) + f10;
                i18--;
            }
            pageWidth3 -= c9245d5.f21541d + f10;
            c9245d5.f21542e = pageWidth3;
            if (i12 == 0) {
                this.f21525r = pageWidth3;
            }
            i20--;
            i18--;
        }
        float pageWidth4 = c9245d.f21542e + c9245d.f21541d + f10;
        int i21 = c9245d.f21539b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            C9245d c9245d6 = (C9245d) this.f21505d.get(i22);
            while (true) {
                i11 = c9245d6.f21539b;
                if (i21 >= i11) {
                    break;
                }
                pageWidth4 += this.f21510g.getPageWidth(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f21526s = (c9245d6.f21541d + pageWidth4) - 1.0f;
            }
            c9245d6.f21542e = pageWidth4;
            pageWidth4 += c9245d6.f21541d + f10;
            i22++;
            i21++;
        }
        this.f21499S = false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C9246e();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.f21510g;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f21511g0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C9246e) ((View) this.f21513h0.get(i11)).getLayoutParams()).f21548f;
    }

    public int getCurrentItem() {
        return this.f21512h;
    }

    public int getOffscreenPageLimit() {
        return this.f21532y;
    }

    public int getPageMargin() {
        return this.f21521n;
    }

    /* renamed from: h */
    public boolean m18185h(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i12 + scrollY;
                if (i14 >= childAt.getTop() && i14 < childAt.getBottom() && (i13 = i11 + scrollX) >= childAt.getLeft() && i13 < childAt.getRight() && m18185h(childAt, true, i10, i13 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && ViewCompat.canScrollVertically(view, -i10);
    }

    /* renamed from: i */
    public final void m18186i(boolean z10) {
        boolean z11 = this.f21517j0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            this.f21519l.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f21519l.getCurrX();
            int currY = this.f21519l.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f21531x = false;
        for (int i10 = 0; i10 < this.f21505d.size(); i10++) {
            C9245d c9245d = (C9245d) this.f21505d.get(i10);
            if (c9245d.f21540c) {
                c9245d.f21540c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                ViewCompat.postOnAnimation(this, this.f21515i0);
            } else {
                this.f21515i0.run();
            }
        }
    }

    /* renamed from: j */
    public void m18187j() throws Resources.NotFoundException {
        int count = this.f21510g.getCount();
        this.f21504c = count;
        boolean z10 = this.f21505d.size() < (this.f21532y * 2) + 1 && this.f21505d.size() < count;
        int iMax = this.f21512h;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.f21505d.size()) {
            C9245d c9245d = (C9245d) this.f21505d.get(i10);
            int itemPosition = this.f21510g.getItemPosition(c9245d.f21538a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f21505d.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f21510g.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f21510g.destroyItem((ViewGroup) this, c9245d.f21539b, c9245d.f21538a);
                    int i11 = this.f21512h;
                    if (i11 == c9245d.f21539b) {
                        iMax = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = c9245d.f21539b;
                    if (i12 != itemPosition) {
                        if (i12 == this.f21512h) {
                            iMax = itemPosition;
                        }
                        c9245d.f21539b = itemPosition;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f21510g.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f21505d, f21478l0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C9246e c9246e = (C9246e) getChildAt(i13).getLayoutParams();
                if (!c9246e.f21543a) {
                    c9246e.f21545c = 0.0f;
                }
            }
            m18178K(iMax, false, true);
            requestLayout();
        }
    }

    /* renamed from: k */
    public final int m18188k(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f21493M || Math.abs(i11) <= this.f21491K) {
            i10 = (int) (i10 + f10 + (i10 >= this.f21512h ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f21505d.size() <= 0) {
            return i10;
        }
        return Math.max(((C9245d) this.f21505d.get(0)).f21539b, Math.min(i10, ((C9245d) this.f21505d.get(r4.size() - 1)).f21539b));
    }

    /* renamed from: l */
    public float m18189l(float f10) {
        return (float) Math.sin((float) ((f10 - 0.5f) * 0.4712389167638204d));
    }

    /* renamed from: m */
    public final void m18190m(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ViewCompat.setLayerType(getChildAt(i10), z10 ? 2 : 0, null);
        }
    }

    /* renamed from: n */
    public final void m18191n() {
        this.f21533z = false;
        this.f21481A = false;
        VelocityTracker velocityTracker = this.f21490J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21490J = null;
        }
    }

    /* renamed from: o */
    public boolean m18192o(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return m18183f(17);
        }
        if (keyCode == 22) {
            return m18183f(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (KeyEventCompat.hasNoModifiers(keyEvent)) {
            return m18183f(2);
        }
        if (KeyEventCompat.hasModifiers(keyEvent, 1)) {
            return m18183f(1);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21498R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f21515i0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.f21521n <= 0 || this.f21522o == null || this.f21505d.size() <= 0 || this.f21510g == null) {
            return;
        }
        int scrollY = getScrollY();
        float height = getHeight();
        float f11 = this.f21521n / height;
        int i12 = 0;
        C9245d c9245d = (C9245d) this.f21505d.get(0);
        float f12 = c9245d.f21542e;
        int size = this.f21505d.size();
        int i13 = c9245d.f21539b;
        int i14 = ((C9245d) this.f21505d.get(size - 1)).f21539b;
        while (i13 < i14) {
            while (true) {
                i10 = c9245d.f21539b;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                c9245d = (C9245d) this.f21505d.get(i12);
            }
            if (i13 == i10) {
                float f13 = c9245d.f21542e;
                float f14 = c9245d.f21541d;
                f10 = (f13 + f14) * height;
                f12 = f13 + f14 + f11;
            } else {
                float pageWidth = this.f21510g.getPageWidth(i13);
                f10 = (f12 + pageWidth) * height;
                f12 += pageWidth + f11;
            }
            int i15 = this.f21521n;
            if (i15 + f10 > scrollY) {
                i11 = scrollY;
                this.f21522o.setBounds(this.f21523p, (int) f10, this.f21524q, (int) (i15 + f10 + 0.5f));
                this.f21522o.draw(canvas);
            } else {
                i11 = scrollY;
            }
            if (f10 > i11 + r2) {
                return;
            }
            i13++;
            scrollY = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f21533z = false;
            this.f21481A = false;
            this.f21489I = -1;
            VelocityTracker velocityTracker = this.f21490J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f21490J = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.f21533z) {
                return true;
            }
            if (this.f21481A) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f21487G = x10;
            this.f21485E = x10;
            float y10 = motionEvent.getY();
            this.f21488H = y10;
            this.f21486F = y10;
            this.f21489I = MotionEventCompat.getPointerId(motionEvent, 0);
            this.f21481A = false;
            this.f21519l.computeScrollOffset();
            if (this.f21517j0 != 2 || Math.abs(this.f21519l.getFinalY() - this.f21519l.getCurrY()) <= this.f21494N) {
                m18186i(false);
                this.f21533z = false;
            } else {
                this.f21519l.abortAnimation();
                this.f21531x = false;
                m18171D();
                this.f21533z = true;
                m18175H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f21489I;
            if (i10 != -1) {
                int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i10);
                float y11 = MotionEventCompat.getY(motionEvent, iFindPointerIndex);
                float f10 = y11 - this.f21486F;
                float fAbs = Math.abs(f10);
                float x11 = MotionEventCompat.getX(motionEvent, iFindPointerIndex);
                float fAbs2 = Math.abs(x11 - this.f21487G);
                if (f10 != 0.0f && !m18200w(this.f21486F, f10) && m18185h(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f21485E = x11;
                    this.f21486F = y11;
                    this.f21481A = true;
                    return false;
                }
                int i11 = this.f21484D;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f21533z = true;
                    m18175H(true);
                    setScrollState(1);
                    float f11 = this.f21488H;
                    float f12 = this.f21484D;
                    this.f21486F = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f21485E = x11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.f21481A = true;
                }
                if (this.f21533z && m18170C(y11)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            m18202y(motionEvent);
        }
        if (this.f21490J == null) {
            this.f21490J = VelocityTracker.obtain();
        }
        this.f21490J.addMovement(motionEvent);
        return this.f21533z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.castorflex.android.verticalviewpager.VerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        C9246e c9246e;
        C9246e c9246e2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredHeight = getMeasuredHeight();
        this.f21483C = Math.min(measuredHeight / 10, this.f21482B);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c9246e2 = (C9246e) childAt.getLayoutParams()) != null && c9246e2.f21543a) {
                int i15 = c9246e2.f21544b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c9246e2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = measuredWidth;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = measuredWidth;
                }
                int i20 = ((ViewGroup.LayoutParams) c9246e2).height;
                if (i20 == -2) {
                    i20 = paddingTop;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = paddingTop;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    paddingTop -= childAt.getMeasuredHeight();
                } else if (z10) {
                    measuredWidth -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f21527t = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.f21528u = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.f21529v = true;
        m18171D();
        this.f21529v = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c9246e = (C9246e) childAt2.getLayoutParams()) == null || !c9246e.f21543a)) {
                childAt2.measure(this.f21527t, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * c9246e.f21545c), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        C9245d c9245dM18195r;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (c9245dM18195r = m18195r(childAt)) != null && c9245dM18195r.f21539b == this.f21512h && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f21510g;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f21535d, savedState.f21536e);
            m18178K(savedState.f21534c, false, true);
        } else {
            this.f21514i = savedState.f21534c;
            this.f21516j = savedState.f21535d;
            this.f21518k = savedState.f21536e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f21534c = this.f21512h;
        PagerAdapter pagerAdapter = this.f21510g;
        if (pagerAdapter != null) {
            savedState.f21535d = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i11 != i13) {
            int i14 = this.f21521n;
            m18173F(i11, i13, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        PagerAdapter pagerAdapter;
        boolean zOnRelease;
        boolean zOnRelease2;
        if (this.f21495O) {
            return true;
        }
        boolean zM18170C = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f21510g) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.f21490J == null) {
            this.f21490J = VelocityTracker.obtain();
        }
        this.f21490J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f21519l.abortAnimation();
            this.f21531x = false;
            m18171D();
            float x10 = motionEvent.getX();
            this.f21487G = x10;
            this.f21485E = x10;
            float y10 = motionEvent.getY();
            this.f21488H = y10;
            this.f21486F = y10;
            this.f21489I = MotionEventCompat.getPointerId(motionEvent, 0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f21533z) {
                    int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.f21489I);
                    float y11 = MotionEventCompat.getY(motionEvent, iFindPointerIndex);
                    float fAbs = Math.abs(y11 - this.f21486F);
                    float x11 = MotionEventCompat.getX(motionEvent, iFindPointerIndex);
                    float fAbs2 = Math.abs(x11 - this.f21485E);
                    if (fAbs > this.f21484D && fAbs > fAbs2) {
                        this.f21533z = true;
                        m18175H(true);
                        float f10 = this.f21488H;
                        this.f21486F = y11 - f10 > 0.0f ? f10 + this.f21484D : f10 - this.f21484D;
                        this.f21485E = x11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f21533z) {
                    zM18170C = m18170C(MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.f21489I)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.f21486F = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.f21489I = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                } else if (action == 6) {
                    m18202y(motionEvent);
                    this.f21486F = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.f21489I));
                }
            } else if (this.f21533z) {
                m18176I(this.f21512h, true, 0, false);
                this.f21489I = -1;
                m18191n();
                zOnRelease = this.f21496P.onRelease();
                zOnRelease2 = this.f21497Q.onRelease();
                zM18170C = zOnRelease | zOnRelease2;
            }
        } else if (this.f21533z) {
            VelocityTracker velocityTracker = this.f21490J;
            velocityTracker.computeCurrentVelocity(1000, this.f21492L);
            int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.f21489I);
            this.f21531x = true;
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            C9245d c9245dM18196s = m18196s();
            m18179L(m18188k(c9245dM18196s.f21539b, ((scrollY / clientHeight) - c9245dM18196s.f21542e) / c9245dM18196s.f21541d, yVelocity, (int) (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.f21489I)) - this.f21488H)), true, true, yVelocity);
            this.f21489I = -1;
            m18191n();
            zOnRelease = this.f21496P.onRelease();
            zOnRelease2 = this.f21497Q.onRelease();
            zM18170C = zOnRelease | zOnRelease2;
        }
        if (zM18170C) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    /* renamed from: p */
    public final Rect m18193p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: q */
    public C9245d m18194q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m18195r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: r */
    public C9245d m18195r(View view) {
        for (int i10 = 0; i10 < this.f21505d.size(); i10++) {
            C9245d c9245d = (C9245d) this.f21505d.get(i10);
            if (this.f21510g.isViewFromObject(view, c9245d.f21538a)) {
                return c9245d;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f21529v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public final C9245d m18196s() {
        int i10;
        int clientHeight = getClientHeight();
        float f10 = 0.0f;
        float scrollY = clientHeight > 0 ? getScrollY() / clientHeight : 0.0f;
        float f11 = clientHeight > 0 ? this.f21521n / clientHeight : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        C9245d c9245d = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f21505d.size()) {
            C9245d c9245d2 = (C9245d) this.f21505d.get(i11);
            if (!z10 && c9245d2.f21539b != (i10 = i12 + 1)) {
                c9245d2 = this.f21506e;
                c9245d2.f21542e = f10 + f12 + f11;
                c9245d2.f21539b = i10;
                c9245d2.f21541d = this.f21510g.getPageWidth(i10);
                i11--;
            }
            C9245d c9245d3 = c9245d2;
            f10 = c9245d3.f21542e;
            float f13 = c9245d3.f21541d + f10 + f11;
            if (!z10 && scrollY < f10) {
                break;
            }
            if (scrollY < f13 || i11 == this.f21505d.size() - 1) {
                return c9245d3;
            }
            int i13 = c9245d3.f21539b;
            float f14 = c9245d3.f21541d;
            i11++;
            i12 = i13;
            f12 = f14;
            c9245d = c9245d3;
            z10 = false;
        }
        return c9245d;
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f21510g;
        if (pagerAdapter2 != null) {
            pagerAdapter2.unregisterDataSetObserver(this.f21520m);
            this.f21510g.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.f21505d.size(); i10++) {
                C9245d c9245d = (C9245d) this.f21505d.get(i10);
                this.f21510g.destroyItem((ViewGroup) this, c9245d.f21539b, c9245d.f21538a);
            }
            this.f21510g.finishUpdate((ViewGroup) this);
            this.f21505d.clear();
            m18174G();
            this.f21512h = 0;
            scrollTo(0, 0);
        }
        this.f21510g = pagerAdapter;
        this.f21504c = 0;
        if (pagerAdapter != null) {
            C9242a c9242a = null;
            if (this.f21520m == null) {
                this.f21520m = new C9249h(this, c9242a);
            }
            this.f21510g.registerDataSetObserver(this.f21520m);
            this.f21531x = false;
            boolean z10 = this.f21498R;
            this.f21498R = true;
            this.f21504c = this.f21510g.getCount();
            if (this.f21514i < 0) {
                if (z10) {
                    requestLayout();
                    return;
                } else {
                    m18171D();
                    return;
                }
            }
            this.f21510g.restoreState(this.f21516j, this.f21518k);
            m18178K(this.f21514i, false, true);
            this.f21514i = -1;
            this.f21516j = null;
            this.f21518k = null;
        }
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f21509f0 == null) {
            try {
                this.f21509f0 = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e10) {
                Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e10);
            }
        }
        try {
            this.f21509f0.invoke(this, Boolean.valueOf(z10));
        } catch (Exception e11) {
            Log.e("ViewPager", "Error changing children drawing order", e11);
        }
    }

    public void setCurrentItem(int i10) throws Resources.NotFoundException {
        this.f21531x = false;
        m18178K(i10, !this.f21498R, false);
    }

    public void setOffscreenPageLimit(int i10) throws Resources.NotFoundException {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f21532y) {
            this.f21532y = i10;
            m18171D();
        }
    }

    public void setOnAdapterChangeListener(InterfaceC9248g interfaceC9248g) {
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f21502V = onPageChangeListener;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f21521n;
        this.f21521n = i10;
        int height = getHeight();
        m18173F(height, height, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f21522o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* renamed from: t */
    public C9245d m18197t(int i10) {
        for (int i11 = 0; i11 < this.f21505d.size(); i11++) {
            C9245d c9245d = (C9245d) this.f21505d.get(i11);
            if (c9245d.f21539b == i10) {
                return c9245d;
            }
        }
        return null;
    }

    /* renamed from: u */
    public void m18198u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f21519l = new Scroller(context, f21479m0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f21484D = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.f21491K = (int) (400.0f * f10);
        this.f21492L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f21496P = new EdgeEffectCompat(context);
        this.f21497Q = new EdgeEffectCompat(context);
        this.f21493M = (int) (25.0f * f10);
        this.f21494N = (int) (2.0f * f10);
        this.f21482B = (int) (f10 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new C9247f());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    /* renamed from: v */
    public boolean m18199v(int i10) {
        if (this.f21510g == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        return i10 < 0 ? scrollY > ((int) (((float) clientHeight) * this.f21525r)) : i10 > 0 && scrollY < ((int) (((float) clientHeight) * this.f21526s));
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21522o;
    }

    /* renamed from: w */
    public final boolean m18200w(float f10, float f11) {
        if (f10 >= this.f21483C || f11 <= 0.0f) {
            return f10 > ((float) (getHeight() - this.f21483C)) && f11 < 0.0f;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m18201x(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f21501U
            r1 = 0
            if (r0 <= 0) goto L6f
            int r0 = r11.getScrollY()
            int r2 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r4 = r11.getHeight()
            int r5 = r11.getChildCount()
            r6 = r1
        L1a:
            if (r6 >= r5) goto L6f
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            fr.castorflex.android.verticalviewpager.VerticalViewPager$e r8 = (fr.castorflex.android.verticalviewpager.VerticalViewPager.C9246e) r8
            boolean r9 = r8.f21543a
            if (r9 != 0) goto L2b
            goto L6c
        L2b:
            int r8 = r8.f21544b
            r8 = r8 & 112(0x70, float:1.57E-43)
            r9 = 16
            if (r8 == r9) goto L53
            r9 = 48
            if (r8 == r9) goto L4d
            r9 = 80
            if (r8 == r9) goto L3d
            r8 = r2
            goto L60
        L3d:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredHeight()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredHeight()
            int r3 = r3 + r9
        L49:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L60
        L4d:
            int r8 = r7.getHeight()
            int r8 = r8 + r2
            goto L60
        L53:
            int r8 = r7.getMeasuredHeight()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L49
        L60:
            int r2 = r2 + r0
            int r9 = r7.getTop()
            int r2 = r2 - r9
            if (r2 == 0) goto L6b
            r7.offsetTopAndBottom(r2)
        L6b:
            r2 = r8
        L6c:
            int r6 = r6 + 1
            goto L1a
        L6f:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r11.f21502V
            if (r0 == 0) goto L76
            r0.onPageScrolled(r12, r13, r14)
        L76:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r11.f21503W
            if (r0 == 0) goto L7d
            r0.onPageScrolled(r12, r13, r14)
        L7d:
            androidx.viewpager.widget.ViewPager$PageTransformer r12 = r11.f21507e0
            if (r12 == 0) goto Lae
            int r12 = r11.getScrollY()
            int r13 = r11.getChildCount()
        L89:
            if (r1 >= r13) goto Lae
            android.view.View r14 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            fr.castorflex.android.verticalviewpager.VerticalViewPager$e r0 = (fr.castorflex.android.verticalviewpager.VerticalViewPager.C9246e) r0
            boolean r0 = r0.f21543a
            if (r0 == 0) goto L9a
            goto Lab
        L9a:
            int r0 = r14.getTop()
            int r0 = r0 - r12
            float r0 = (float) r0
            int r2 = r11.getClientHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.viewpager.widget.ViewPager$PageTransformer r2 = r11.f21507e0
            r2.transformPage(r14, r0)
        Lab:
            int r1 = r1 + 1
            goto L89
        Lae:
            r12 = 1
            r11.f21500T = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.castorflex.android.verticalviewpager.VerticalViewPager.m18201x(int, float, int):void");
    }

    /* renamed from: y */
    public final void m18202y(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.f21489I) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f21486F = MotionEventCompat.getY(motionEvent, i10);
            this.f21489I = MotionEventCompat.getPointerId(motionEvent, i10);
            VelocityTracker velocityTracker = this.f21490J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: z */
    public boolean m18203z() throws Resources.NotFoundException {
        PagerAdapter pagerAdapter = this.f21510g;
        if (pagerAdapter == null || this.f21512h >= pagerAdapter.getCount() - 1) {
            return false;
        }
        m18177J(this.f21512h + 1, true);
        return true;
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$e */
    public static class C9246e extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f21543a;

        /* renamed from: b */
        public int f21544b;

        /* renamed from: c */
        public float f21545c;

        /* renamed from: d */
        public boolean f21546d;

        /* renamed from: e */
        public int f21547e;

        /* renamed from: f */
        public int f21548f;

        public C9246e() {
            super(-1, -1);
            this.f21545c = 0.0f;
        }

        public C9246e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21545c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f21477k0);
            this.f21544b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C9246e(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21505d = new ArrayList();
        this.f21506e = new C9245d();
        this.f21508f = new Rect();
        this.f21514i = -1;
        this.f21516j = null;
        this.f21518k = null;
        this.f21525r = -3.4028235E38f;
        this.f21526s = Float.MAX_VALUE;
        this.f21532y = 1;
        this.f21489I = -1;
        this.f21498R = true;
        this.f21499S = false;
        this.f21515i0 = new RunnableC9244c();
        this.f21517j0 = 0;
        m18198u();
    }
}
