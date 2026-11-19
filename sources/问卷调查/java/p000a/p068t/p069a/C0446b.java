package p000a.p068t.p069a;

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
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p033c.C0192a;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0277z;
import p000a.p031h.p043j.InterfaceC0262k;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.t.a.b */
/* loaded from: classes.dex */
public class C0446b extends ViewGroup {

    /* renamed from: W */
    public static final int[] f2584W = {R.attr.layout_gravity};

    /* renamed from: a0 */
    public static final Comparator<f> f2585a0 = new a();

    /* renamed from: b0 */
    public static final Interpolator f2586b0 = new b();

    /* renamed from: c0 */
    public static final l f2587c0 = new l();

    /* renamed from: A */
    public int f2588A;

    /* renamed from: B */
    public int f2589B;

    /* renamed from: C */
    public int f2590C;

    /* renamed from: D */
    public float f2591D;

    /* renamed from: E */
    public float f2592E;

    /* renamed from: F */
    public float f2593F;

    /* renamed from: G */
    public float f2594G;

    /* renamed from: H */
    public int f2595H;

    /* renamed from: I */
    public VelocityTracker f2596I;

    /* renamed from: J */
    public int f2597J;

    /* renamed from: K */
    public int f2598K;

    /* renamed from: L */
    public int f2599L;

    /* renamed from: M */
    public int f2600M;

    /* renamed from: N */
    public EdgeEffect f2601N;

    /* renamed from: O */
    public EdgeEffect f2602O;

    /* renamed from: P */
    public boolean f2603P;

    /* renamed from: Q */
    public boolean f2604Q;

    /* renamed from: R */
    public int f2605R;

    /* renamed from: S */
    public List<i> f2606S;

    /* renamed from: T */
    public i f2607T;

    /* renamed from: U */
    public final Runnable f2608U;

    /* renamed from: V */
    public int f2609V;

    /* renamed from: b */
    public int f2610b;

    /* renamed from: c */
    public final ArrayList<f> f2611c;

    /* renamed from: d */
    public final f f2612d;

    /* renamed from: e */
    public final Rect f2613e;

    /* renamed from: f */
    public AbstractC0445a f2614f;

    /* renamed from: g */
    public int f2615g;

    /* renamed from: h */
    public int f2616h;

    /* renamed from: i */
    public Parcelable f2617i;

    /* renamed from: j */
    public ClassLoader f2618j;

    /* renamed from: k */
    public Scroller f2619k;

    /* renamed from: l */
    public boolean f2620l;

    /* renamed from: m */
    public j f2621m;

    /* renamed from: n */
    public int f2622n;

    /* renamed from: o */
    public Drawable f2623o;

    /* renamed from: p */
    public int f2624p;

    /* renamed from: q */
    public int f2625q;

    /* renamed from: r */
    public float f2626r;

    /* renamed from: s */
    public float f2627s;

    /* renamed from: t */
    public int f2628t;

    /* renamed from: u */
    public boolean f2629u;

    /* renamed from: v */
    public boolean f2630v;

    /* renamed from: w */
    public boolean f2631w;

    /* renamed from: x */
    public int f2632x;

    /* renamed from: y */
    public boolean f2633y;

    /* renamed from: z */
    public boolean f2634z;

    /* renamed from: a.t.a.b$a */
    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        public int compare(f fVar, f fVar2) {
            return fVar.f2639b - fVar2.f2639b;
        }
    }

    /* renamed from: a.t.a.b$b */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* renamed from: a.t.a.b$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            C0446b.this.setScrollState(0);
            C0446b c0446b = C0446b.this;
            c0446b.m1544s(c0446b.f2615g);
        }
    }

    /* renamed from: a.t.a.b$d */
    public class d implements InterfaceC0262k {

        /* renamed from: a */
        public final Rect f2636a = new Rect();

        public d() {
        }

        @Override // p000a.p031h.p043j.InterfaceC0262k
        /* renamed from: a */
        public C0277z mo96a(View view, C0277z c0277z) {
            C0277z c0277zM870i = C0266o.m870i(view, c0277z);
            if (c0277zM870i.m900f()) {
                return c0277zM870i;
            }
            Rect rect = this.f2636a;
            rect.left = c0277zM870i.m897b();
            rect.top = c0277zM870i.m899d();
            rect.right = c0277zM870i.m898c();
            rect.bottom = c0277zM870i.m896a();
            int childCount = C0446b.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0277z c0277zM863b = C0266o.m863b(C0446b.this.getChildAt(i), c0277zM870i);
                rect.left = Math.min(c0277zM863b.m897b(), rect.left);
                rect.top = Math.min(c0277zM863b.m899d(), rect.top);
                rect.right = Math.min(c0277zM863b.m898c(), rect.right);
                rect.bottom = Math.min(c0277zM863b.m896a(), rect.bottom);
            }
            return c0277zM870i.m901g(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: a.t.a.b$e */
    public @interface e {
    }

    /* renamed from: a.t.a.b$f */
    public static class f {

        /* renamed from: a */
        public Object f2638a;

        /* renamed from: b */
        public int f2639b;

        /* renamed from: c */
        public boolean f2640c;

        /* renamed from: d */
        public float f2641d;

        /* renamed from: e */
        public float f2642e;
    }

    /* renamed from: a.t.a.b$g */
    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f2643a;

        /* renamed from: b */
        public int f2644b;

        /* renamed from: c */
        public float f2645c;

        /* renamed from: d */
        public boolean f2646d;

        /* renamed from: e */
        public int f2647e;

        /* renamed from: f */
        public int f2648f;

        public g() {
            super(-1, -1);
            this.f2645c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2645c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0446b.f2584W);
            this.f2644b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.t.a.b$h */
    public class h extends C0243a {
        public h() {
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: c */
        public void mo809c(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0445a abstractC0445a;
            this.f1556a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(C0446b.class.getName());
            AbstractC0445a abstractC0445a2 = C0446b.this.f2614f;
            accessibilityEvent.setScrollable(abstractC0445a2 != null && abstractC0445a2.mo1525c() > 1);
            if (accessibilityEvent.getEventType() != 4096 || (abstractC0445a = C0446b.this.f2614f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC0445a.mo1525c());
            accessibilityEvent.setFromIndex(C0446b.this.f2615g);
            accessibilityEvent.setToIndex(C0446b.this.f2615g);
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: d */
        public void mo810d(View view, C0245b c0245b) {
            this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
            c0245b.f1563a.setClassName(C0446b.class.getName());
            AbstractC0445a abstractC0445a = C0446b.this.f2614f;
            c0245b.f1563a.setScrollable(abstractC0445a != null && abstractC0445a.mo1525c() > 1);
            if (C0446b.this.canScrollHorizontally(1)) {
                c0245b.f1563a.addAction(4096);
            }
            if (C0446b.this.canScrollHorizontally(-1)) {
                c0245b.f1563a.addAction(8192);
            }
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: g */
        public boolean mo813g(View view, int i, Bundle bundle) throws Resources.NotFoundException {
            C0446b c0446b;
            int i2;
            if (super.mo813g(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !C0446b.this.canScrollHorizontally(-1)) {
                    return false;
                }
                c0446b = C0446b.this;
                i2 = c0446b.f2615g - 1;
            } else {
                if (!C0446b.this.canScrollHorizontally(1)) {
                    return false;
                }
                c0446b = C0446b.this;
                i2 = c0446b.f2615g + 1;
            }
            c0446b.setCurrentItem(i2);
            return true;
        }
    }

    /* renamed from: a.t.a.b$i */
    public interface i {
        /* renamed from: a */
        void mo1551a(int i);

        /* renamed from: b */
        void mo1552b(int i, float f2, int i2);

        /* renamed from: c */
        void mo1553c(int i);
    }

    /* renamed from: a.t.a.b$j */
    public class j extends DataSetObserver {
        public j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            C0446b.this.m1531f();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            C0446b.this.m1531f();
        }
    }

    /* renamed from: a.t.a.b$k */
    public static class k extends AbstractC0287a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: d */
        public int f2651d;

        /* renamed from: e */
        public Parcelable f2652e;

        /* renamed from: f */
        public ClassLoader f2653f;

        /* renamed from: a.t.a.b$k$a */
        public static class a implements Parcelable.ClassLoaderCreator<k> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new k(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new k[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.f2651d = parcel.readInt();
            this.f2652e = parcel.readParcelable(classLoader);
            this.f2653f = classLoader;
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM2079g = C0561a.m2079g("FragmentPager.SavedState{");
            sbM2079g.append(Integer.toHexString(System.identityHashCode(this)));
            sbM2079g.append(" position=");
            sbM2079g.append(this.f2651d);
            sbM2079g.append("}");
            return sbM2079g.toString();
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            parcel.writeInt(this.f2651d);
            parcel.writeParcelable(this.f2652e, i);
        }
    }

    /* renamed from: a.t.a.b$l */
    public static class l implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.f2643a;
            return z != gVar2.f2643a ? z ? 1 : -1 : gVar.f2647e - gVar2.f2647e;
        }
    }

    public C0446b(Context context) {
        super(context);
        this.f2611c = new ArrayList<>();
        this.f2612d = new f();
        this.f2613e = new Rect();
        this.f2616h = -1;
        this.f2617i = null;
        this.f2618j = null;
        this.f2626r = -3.4028235E38f;
        this.f2627s = Float.MAX_VALUE;
        this.f2632x = 1;
        this.f2595H = -1;
        this.f2603P = true;
        this.f2608U = new c();
        this.f2609V = 0;
        m1537l();
    }

    public C0446b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2611c = new ArrayList<>();
        this.f2612d = new f();
        this.f2613e = new Rect();
        this.f2616h = -1;
        this.f2617i = null;
        this.f2618j = null;
        this.f2626r = -3.4028235E38f;
        this.f2627s = Float.MAX_VALUE;
        this.f2632x = 1;
        this.f2595H = -1;
        this.f2603P = true;
        this.f2608U = new c();
        this.f2609V = 0;
        m1537l();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f2630v != z) {
            this.f2630v = z;
        }
    }

    /* renamed from: a */
    public f m1526a(int i2, int i3) {
        f fVar = new f();
        fVar.f2639b = i2;
        fVar.f2638a = this.f2614f.mo1078d(this, i2);
        Objects.requireNonNull(this.f2614f);
        fVar.f2641d = 1.0f;
        if (i3 < 0 || i3 >= this.f2611c.size()) {
            this.f2611c.add(fVar);
        } else {
            this.f2611c.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarM1534i;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarM1534i = m1534i(childAt)) != null && fVarM1534i.f2639b == this.f2615g) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarM1534i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarM1534i = m1534i(childAt)) != null && fVarM1534i.f2639b == this.f2615g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean z = gVar.f2643a | (view.getClass().getAnnotation(e.class) != null);
        gVar.f2643a = z;
        if (!this.f2629u) {
            super.addView(view, i2, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f2646d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* renamed from: b */
    public void mo1527b(i iVar) {
        if (this.f2606S == null) {
            this.f2606S = new ArrayList();
        }
        this.f2606S.add(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m1528c(int r7) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto La
            goto L63
        La:
            if (r0 == 0) goto L64
            android.view.ViewParent r4 = r0.getParent()
        L10:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1d
            if (r4 != r6) goto L18
            r4 = r1
            goto L1e
        L18:
            android.view.ViewParent r4 = r4.getParent()
            goto L10
        L1d:
            r4 = r2
        L1e:
            if (r4 != 0) goto L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L34:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L34
        L4d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = p070b.p071a.p072a.p073a.C0561a.m2079g(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L63:
            r0 = r3
        L64:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb0
            if (r3 == r0) goto Lb0
            if (r7 != r5) goto L8f
            android.graphics.Rect r1 = r6.f2613e
            android.graphics.Rect r1 = r6.m1533h(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2613e
            android.graphics.Rect r2 = r6.m1533h(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Laa
            if (r1 < r2) goto Laa
            boolean r0 = r6.m1540o()
            goto Lae
        L8f:
            if (r7 != r4) goto Lc3
            android.graphics.Rect r1 = r6.f2613e
            android.graphics.Rect r1 = r6.m1533h(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2613e
            android.graphics.Rect r2 = r6.m1533h(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Laa
            if (r1 > r2) goto Laa
            boolean r0 = r6.m1541p()
            goto Lae
        Laa:
            boolean r0 = r3.requestFocus()
        Lae:
            r2 = r0
            goto Lc3
        Lb0:
            if (r7 == r5) goto Lbf
            if (r7 != r1) goto Lb5
            goto Lbf
        Lb5:
            if (r7 == r4) goto Lba
            r0 = 2
            if (r7 != r0) goto Lc3
        Lba:
            boolean r2 = r6.m1541p()
            goto Lc3
        Lbf:
            boolean r2 = r6.m1540o()
        Lc3:
            if (r2 == 0) goto Lcc
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p068t.p069a.C0446b.m1528c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f2614f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f2626r)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.f2627s));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f2620l = true;
        if (this.f2619k.isFinished() || !this.f2619k.computeScrollOffset()) {
            m1530e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2619k.getCurrX();
        int currY = this.f2619k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m1542q(currX)) {
                this.f2619k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        postInvalidateOnAnimation();
    }

    /* renamed from: d */
    public boolean m1529d(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && m1529d(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L59
            int r0 = r6.getAction()
            if (r0 != 0) goto L56
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L44
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L56
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.m1528c(r4)
            goto L57
        L2b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L56
            boolean r6 = r5.m1528c(r2)
            goto L57
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.m1541p()
            goto L57
        L41:
            r6 = 66
            goto L51
        L44:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L4f
            boolean r6 = r5.m1540o()
            goto L57
        L4f:
            r6 = 17
        L51:
            boolean r6 = r5.m1528c(r6)
            goto L57
        L56:
            r6 = r1
        L57:
            if (r6 == 0) goto L5a
        L59:
            r1 = r2
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p068t.p069a.C0446b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarM1534i;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarM1534i = m1534i(childAt)) != null && fVarM1534i.f2639b == this.f2615g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC0445a abstractC0445a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC0445a = this.f2614f) != null && abstractC0445a.mo1525c() > 1)) {
            if (!this.f2601N.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f2626r * width);
                this.f2601N.setSize(height, width);
                zDraw = false | this.f2601N.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f2602O.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f2627s + 1.0f)) * width2);
                this.f2602O.setSize(height2, width2);
                zDraw |= this.f2602O.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f2601N.finish();
            this.f2602O.finish();
        }
        if (zDraw) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2623o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public final void m1530e(boolean z) {
        boolean z2 = this.f2609V == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f2619k.isFinished()) {
                this.f2619k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2619k.getCurrX();
                int currY = this.f2619k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m1542q(currX);
                    }
                }
            }
        }
        this.f2631w = false;
        for (int i2 = 0; i2 < this.f2611c.size(); i2++) {
            f fVar = this.f2611c.get(i2);
            if (fVar.f2640c) {
                fVar.f2640c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (!z) {
                this.f2608U.run();
                return;
            }
            Runnable runnable = this.f2608U;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            postOnAnimation(runnable);
        }
    }

    /* renamed from: f */
    public void m1531f() throws Resources.NotFoundException {
        int iMo1525c = this.f2614f.mo1525c();
        this.f2610b = iMo1525c;
        boolean z = this.f2611c.size() < (this.f2632x * 2) + 1 && this.f2611c.size() < iMo1525c;
        int i2 = this.f2615g;
        for (int i3 = 0; i3 < this.f2611c.size(); i3++) {
            f fVar = this.f2611c.get(i3);
            AbstractC0445a abstractC0445a = this.f2614f;
            Object obj = fVar.f2638a;
            Objects.requireNonNull(abstractC0445a);
        }
        Collections.sort(this.f2611c, f2585a0);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                g gVar = (g) getChildAt(i4).getLayoutParams();
                if (!gVar.f2643a) {
                    gVar.f2645c = 0.0f;
                }
            }
            m1550y(i2, false, true, 0);
            requestLayout();
        }
    }

    /* renamed from: g */
    public final void m1532g(int i2) {
        i iVar = this.f2607T;
        if (iVar != null) {
            iVar.mo1551a(i2);
        }
        List<i> list = this.f2606S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.f2606S.get(i3);
                if (iVar2 != null) {
                    iVar2.mo1551a(i2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0445a getAdapter() {
        return this.f2614f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f2615g;
    }

    public int getOffscreenPageLimit() {
        return this.f2632x;
    }

    public int getPageMargin() {
        return this.f2622n;
    }

    /* renamed from: h */
    public final Rect m1533h(Rect rect, View view) {
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
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: i */
    public f m1534i(View view) {
        for (int i2 = 0; i2 < this.f2611c.size(); i2++) {
            f fVar = this.f2611c.get(i2);
            if (this.f2614f.mo1079e(view, fVar.f2638a)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    public final f m1535j() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.f2622n / clientWidth : 0.0f;
        f fVar = null;
        int i3 = 0;
        int i4 = -1;
        boolean z = true;
        float f4 = 0.0f;
        while (i3 < this.f2611c.size()) {
            f fVar2 = this.f2611c.get(i3);
            if (!z && fVar2.f2639b != (i2 = i4 + 1)) {
                fVar2 = this.f2612d;
                fVar2.f2642e = f2 + f4 + f3;
                fVar2.f2639b = i2;
                Objects.requireNonNull(this.f2614f);
                fVar2.f2641d = 1.0f;
                i3--;
            }
            f2 = fVar2.f2642e;
            float f5 = fVar2.f2641d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i3 == this.f2611c.size() - 1) {
                return fVar2;
            }
            i4 = fVar2.f2639b;
            f4 = fVar2.f2641d;
            i3++;
            z = false;
            fVar = fVar2;
        }
        return fVar;
    }

    /* renamed from: k */
    public f m1536k(int i2) {
        for (int i3 = 0; i3 < this.f2611c.size(); i3++) {
            f fVar = this.f2611c.get(i3);
            if (fVar.f2639b == i2) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: l */
    public void m1537l() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f2619k = new Scroller(context, f2586b0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f2590C = viewConfiguration.getScaledPagingTouchSlop();
        this.f2597J = (int) (400.0f * f2);
        this.f2598K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2601N = new EdgeEffect(context);
        this.f2602O = new EdgeEffect(context);
        this.f2599L = (int) (25.0f * f2);
        this.f2600M = (int) (2.0f * f2);
        this.f2588A = (int) (f2 * 16.0f);
        C0266o.m875n(this, new h());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C0266o.m876o(this, new d());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1538m(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f2605R
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            a.t.a.b$g r9 = (p000a.p068t.p069a.C0446b.g) r9
            boolean r10 = r9.f2643a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f2644b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            a.t.a.b$i r0 = r12.f2607T
            if (r0 == 0) goto L72
            r0.mo1552b(r13, r14, r15)
        L72:
            java.util.List<a.t.a.b$i> r0 = r12.f2606S
            if (r0 == 0) goto L8c
            int r0 = r0.size()
        L7a:
            if (r1 >= r0) goto L8c
            java.util.List<a.t.a.b$i> r3 = r12.f2606S
            java.lang.Object r3 = r3.get(r1)
            a.t.a.b$i r3 = (p000a.p068t.p069a.C0446b.i) r3
            if (r3 == 0) goto L89
            r3.mo1552b(r13, r14, r15)
        L89:
            int r1 = r1 + 1
            goto L7a
        L8c:
            r12.f2604Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p068t.p069a.C0446b.m1538m(int, float, int):void");
    }

    /* renamed from: n */
    public final void m1539n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2595H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f2591D = motionEvent.getX(i2);
            this.f2595H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f2596I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: o */
    public boolean m1540o() throws Resources.NotFoundException {
        int i2 = this.f2615g;
        if (i2 <= 0) {
            return false;
        }
        mo1549x(i2 - 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2603P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2608U);
        Scroller scroller = this.f2619k;
        if (scroller != null && !scroller.isFinished()) {
            this.f2619k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f2622n <= 0 || this.f2623o == null || this.f2611c.size() <= 0 || this.f2614f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f2622n / width;
        int i3 = 0;
        f fVar = this.f2611c.get(0);
        float f5 = fVar.f2642e;
        int size = this.f2611c.size();
        int i4 = fVar.f2639b;
        int i5 = this.f2611c.get(size - 1).f2639b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.f2639b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.f2611c.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.f2642e;
                float f7 = fVar.f2641d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                Objects.requireNonNull(this.f2614f);
                f2 = (f5 + 1.0f) * width;
                f5 = 1.0f + f4 + f5;
            }
            if (this.f2622n + f2 > scrollX) {
                f3 = f4;
                this.f2623o.setBounds(Math.round(f2), this.f2624p, Math.round(this.f2622n + f2), this.f2625q);
                this.f2623o.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m1547v();
            return false;
        }
        if (action != 0) {
            if (this.f2633y) {
                return true;
            }
            if (this.f2634z) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f2593F = x;
            this.f2591D = x;
            float y = motionEvent.getY();
            this.f2594G = y;
            this.f2592E = y;
            this.f2595H = motionEvent.getPointerId(0);
            this.f2634z = false;
            this.f2620l = true;
            this.f2619k.computeScrollOffset();
            if (this.f2609V != 2 || Math.abs(this.f2619k.getFinalX() - this.f2619k.getCurrX()) <= this.f2600M) {
                m1530e(false);
                this.f2633y = false;
            } else {
                this.f2619k.abortAnimation();
                this.f2631w = false;
                m1544s(this.f2615g);
                this.f2633y = true;
                m1546u(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.f2595H;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.f2591D;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f2594G);
                if (f2 != 0.0f) {
                    float f3 = this.f2591D;
                    if (!((f3 < ((float) this.f2589B) && f2 > 0.0f) || (f3 > ((float) (getWidth() - this.f2589B)) && f2 < 0.0f)) && m1529d(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.f2591D = x2;
                        this.f2592E = y2;
                        this.f2634z = true;
                        return false;
                    }
                }
                int i3 = this.f2590C;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.f2633y = true;
                    m1546u(true);
                    setScrollState(1);
                    float f4 = this.f2593F;
                    float f5 = this.f2590C;
                    this.f2591D = f2 > 0.0f ? f4 + f5 : f4 - f5;
                    this.f2592E = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.f2634z = true;
                }
                if (this.f2633y && m1543r(x2)) {
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m1539n(motionEvent);
        }
        if (this.f2596I == null) {
            this.f2596I = VelocityTracker.obtain();
        }
        this.f2596I.addMovement(motionEvent);
        return this.f2633y;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p068t.p069a.C0446b.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        g gVar;
        g gVar2;
        int i4;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i2), ViewGroup.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.f2589B = Math.min(measuredWidth / 10, this.f2588A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f2643a) {
                int i7 = gVar2.f2644b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f2628t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f2629u = true;
        m1544s(this.f2615g);
        this.f2629u = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f2643a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f2645c), 1073741824), this.f2628t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f fVarM1534i;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarM1534i = m1534i(childAt)) != null && fVarM1534i.f2639b == this.f2615g && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f1718b);
        AbstractC0445a abstractC0445a = this.f2614f;
        if (abstractC0445a != null) {
            abstractC0445a.mo1080f(kVar.f2652e, kVar.f2653f);
            m1550y(kVar.f2651d, false, true, 0);
        } else {
            this.f2616h = kVar.f2651d;
            this.f2617i = kVar.f2652e;
            this.f2618j = kVar.f2653f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f2651d = this.f2615g;
        AbstractC0445a abstractC0445a = this.f2614f;
        if (abstractC0445a != null) {
            kVar.f2652e = abstractC0445a.mo1081g();
        }
        return kVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f2622n;
            m1545t(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p068t.p069a.C0446b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean m1541p() throws Resources.NotFoundException {
        AbstractC0445a abstractC0445a = this.f2614f;
        if (abstractC0445a == null || this.f2615g >= abstractC0445a.mo1525c() - 1) {
            return false;
        }
        mo1549x(this.f2615g + 1, true);
        return true;
    }

    /* renamed from: q */
    public final boolean m1542q(int i2) {
        if (this.f2611c.size() == 0) {
            if (this.f2603P) {
                return false;
            }
            this.f2604Q = false;
            m1538m(0, 0.0f, 0);
            if (this.f2604Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarM1535j = m1535j();
        int clientWidth = getClientWidth();
        int i3 = this.f2622n;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarM1535j.f2639b;
        float f3 = ((i2 / f2) - fVarM1535j.f2642e) / (fVarM1535j.f2641d + (i3 / f2));
        this.f2604Q = false;
        m1538m(i5, f3, (int) (i4 * f3));
        if (this.f2604Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: r */
    public final boolean m1543r(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.f2591D - f2;
        this.f2591D = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.f2626r * clientWidth;
        float f5 = this.f2627s * clientWidth;
        boolean z3 = false;
        f fVar = this.f2611c.get(0);
        ArrayList<f> arrayList = this.f2611c;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f2639b != 0) {
            f4 = fVar.f2642e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f2639b != this.f2614f.mo1525c() - 1) {
            f5 = fVar2.f2642e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.f2601N.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.f2602O.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.f2591D = (scrollX - i2) + this.f2591D;
        scrollTo(i2, getScrollY());
        m1542q(i2);
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f2629u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3 A[PHI: r2 r6 r12
      0x00d3: PHI (r2v20 int) = (r2v19 int), (r2v8 int), (r2v23 int) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r6v6 int) = (r6v1 int), (r6v5 int), (r6v9 int) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r12v5 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc A[PHI: r2 r6 r12
      0x00dc: PHI (r2v22 int) = (r2v19 int), (r2v8 int), (r2v23 int) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r6v8 int) = (r6v1 int), (r6v5 int), (r6v9 int) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r12v7 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158 A[PHI: r1 r9
      0x0158: PHI (r1v19 float) = (r1v17 float), (r1v18 float), (r1v16 float) binds: [B:93:0x0156, B:90:0x0144, B:84:0x0130] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r9v28 int) = (r9v26 int), (r9v27 int), (r9v25 int) binds: [B:93:0x0156, B:90:0x0144, B:84:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161 A[PHI: r1 r9
      0x0161: PHI (r1v21 float) = (r1v17 float), (r1v18 float), (r1v16 float) binds: [B:93:0x0156, B:90:0x0144, B:84:0x0130] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r9v30 int) = (r9v26 int), (r9v27 int), (r9v25 int) binds: [B:93:0x0156, B:90:0x0144, B:84:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1544s(int r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p068t.p069a.C0446b.m1544s(int):void");
    }

    public void setAdapter(AbstractC0445a abstractC0445a) throws Resources.NotFoundException {
        AbstractC0445a abstractC0445a2 = this.f2614f;
        if (abstractC0445a2 != null) {
            synchronized (abstractC0445a2) {
                abstractC0445a2.f2583b = null;
            }
            this.f2614f.mo1083i(this);
            for (int i2 = 0; i2 < this.f2611c.size(); i2++) {
                f fVar = this.f2611c.get(i2);
                this.f2614f.mo1524a(this, fVar.f2639b, fVar.f2638a);
            }
            this.f2614f.mo1077b(this);
            this.f2611c.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((g) getChildAt(i3).getLayoutParams()).f2643a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f2615g = 0;
            scrollTo(0, 0);
        }
        this.f2614f = abstractC0445a;
        this.f2610b = 0;
        if (abstractC0445a != null) {
            if (this.f2621m == null) {
                this.f2621m = new j();
            }
            AbstractC0445a abstractC0445a3 = this.f2614f;
            j jVar = this.f2621m;
            synchronized (abstractC0445a3) {
                abstractC0445a3.f2583b = jVar;
            }
            this.f2631w = false;
            boolean z = this.f2603P;
            this.f2603P = true;
            this.f2610b = this.f2614f.mo1525c();
            if (this.f2616h < 0) {
                if (z) {
                    requestLayout();
                    return;
                } else {
                    m1544s(this.f2615g);
                    return;
                }
            }
            this.f2614f.mo1080f(this.f2617i, this.f2618j);
            m1550y(this.f2616h, false, true, 0);
            this.f2616h = -1;
            this.f2617i = null;
            this.f2618j = null;
        }
    }

    public void setCurrentItem(int i2) throws Resources.NotFoundException {
        this.f2631w = false;
        m1550y(i2, !this.f2603P, false, 0);
    }

    public void setOffscreenPageLimit(int i2) throws Resources.NotFoundException {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.f2632x) {
            this.f2632x = i2;
            m1544s(this.f2615g);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f2607T = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f2622n;
        this.f2622n = i2;
        int width = getWidth();
        m1545t(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        Context context = getContext();
        Object obj = C0192a.f1425a;
        setPageMarginDrawable(C0192a.c.m739b(context, i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2623o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.f2609V == i2) {
            return;
        }
        this.f2609V = i2;
        i iVar = this.f2607T;
        if (iVar != null) {
            iVar.mo1553c(i2);
        }
        List<i> list = this.f2606S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.f2606S.get(i3);
                if (iVar2 != null) {
                    iVar2.mo1553c(i2);
                }
            }
        }
    }

    /* renamed from: t */
    public final void m1545t(int i2, int i3, int i4, int i5) {
        int iMin;
        if (i3 <= 0 || this.f2611c.isEmpty()) {
            f fVarM1536k = m1536k(this.f2615g);
            iMin = (int) ((fVarM1536k != null ? Math.min(fVarM1536k.f2642e, this.f2627s) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                m1530e(false);
            }
        } else if (!this.f2619k.isFinished()) {
            this.f2619k.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4));
        }
        scrollTo(iMin, getScrollY());
    }

    /* renamed from: u */
    public final void m1546u(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: v */
    public final boolean m1547v() {
        this.f2595H = -1;
        this.f2633y = false;
        this.f2634z = false;
        VelocityTracker velocityTracker = this.f2596I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2596I = null;
        }
        this.f2601N.onRelease();
        this.f2602O.onRelease();
        return this.f2601N.isFinished() || this.f2602O.isFinished();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2623o;
    }

    /* renamed from: w */
    public final void m1548w(int i2, boolean z, int i3, boolean z2) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        f fVarM1536k = m1536k(i2);
        int iMax = fVarM1536k != null ? (int) (Math.max(this.f2626r, Math.min(fVarM1536k.f2642e, this.f2627s)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                m1532g(i2);
            }
            m1530e(false);
            scrollTo(iMax, 0);
            m1542q(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f2619k;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f2620l ? this.f2619k.getCurrX() : this.f2619k.getStartX();
                this.f2619k.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = iMax - i4;
            int i6 = 0 - scrollY;
            if (i5 == 0 && i6 == 0) {
                m1530e(false);
                m1544s(this.f2615g);
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i7 = clientWidth / 2;
                float f2 = clientWidth;
                float f3 = i7;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
                int iAbs2 = Math.abs(i3);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    Objects.requireNonNull(this.f2614f);
                    iAbs = (int) (((Math.abs(i5) / ((f2 * 1.0f) + this.f2622n)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f2620l = false;
                this.f2619k.startScroll(i4, scrollY, i5, i6, iMin);
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m1532g(i2);
        }
    }

    /* renamed from: x */
    public void mo1549x(int i2, boolean z) throws Resources.NotFoundException {
        this.f2631w = false;
        m1550y(i2, z, false, 0);
    }

    /* renamed from: y */
    public void m1550y(int i2, boolean z, boolean z2, int i3) throws Resources.NotFoundException {
        AbstractC0445a abstractC0445a = this.f2614f;
        if (abstractC0445a == null || abstractC0445a.mo1525c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f2615g == i2 && this.f2611c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f2614f.mo1525c()) {
            i2 = this.f2614f.mo1525c() - 1;
        }
        int i4 = this.f2632x;
        int i5 = this.f2615g;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f2611c.size(); i6++) {
                this.f2611c.get(i6).f2640c = true;
            }
        }
        boolean z3 = this.f2615g != i2;
        if (!this.f2603P) {
            m1544s(i2);
            m1548w(i2, z, i3, z3);
        } else {
            this.f2615g = i2;
            if (z3) {
                m1532g(i2);
            }
            requestLayout();
        }
    }
}
