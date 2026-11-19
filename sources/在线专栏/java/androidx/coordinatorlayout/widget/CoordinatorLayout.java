package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0332a;
import androidx.core.view.C0340c0;
import androidx.core.view.C0342e;
import androidx.core.view.C0352o;
import androidx.core.view.C0358u;
import androidx.core.view.InterfaceC0350m;
import androidx.core.view.InterfaceC0351n;
import androidx.core.view.InterfaceC0353p;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.p068uc.crashsdk.export.LogType;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p011b0.C1020c;
import p011b0.C1024g;
import p011b0.InterfaceC1022e;
import p135p.C2981a;
import p135p.C2982b;
import p135p.C2983c;
import p156u.C3403a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0350m, InterfaceC0351n {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors;
    private static final InterfaceC1022e<Rect> sRectPool;
    private InterfaceC0353p mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final C0308a<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private C0340c0 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final C0352o mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private ViewTreeObserverOnPreDrawListenerC0306f mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public static Object getTag(View view) {
            return ((C0305e) view.getLayoutParams()).f2596r;
        }

        public static void setTag(View view, Object obj) {
            ((C0305e) view.getLayoutParams()).f2596r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v3) {
            return getScrimOpacity(coordinatorLayout, v3) > IGoodView.DEFAULT_TO_ALPHA;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v3, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v3) {
            return IGoodView.DEFAULT_TEXT_COLOR;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v3) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v3, View view) {
            return false;
        }

        public C0340c0 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v3, C0340c0 c0340c0) {
            return c0340c0;
        }

        public void onAttachedToLayoutParams(C0305e c0305e) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v3, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v3, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v3, int i4) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v3, int i4, int i5, int i6, int i7) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v3, View view, float f4, float f5, boolean z3) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v3, View view, float f4, float f5) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4, int i5, int[] iArr) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4, int i5, int[] iArr, int i6) {
            if (i6 == 0) {
                onNestedPreScroll(coordinatorLayout, v3, view, i4, i5, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4, int i5, int i6, int i7) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4, int i5, int i6, int i7, int i8) {
            if (i8 == 0) {
                onNestedScroll(coordinatorLayout, v3, view, i4, i5, i6, i7);
            }
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i4) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i4, int i5) {
            if (i5 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v3, view, view2, i4);
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v3, Rect rect, boolean z3) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v3, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v3) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i4) {
            return false;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i4, int i5) {
            if (i5 == 0) {
                return onStartNestedScroll(coordinatorLayout, v3, view, view2, i4);
            }
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4) {
            if (i4 == 0) {
                onStopNestedScroll(coordinatorLayout, v3, view);
            }
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v3, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
            onNestedScroll(coordinatorLayout, v3, view, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0301a implements InterfaceC0353p {
        C0301a() {
        }

        @Override // androidx.core.view.InterfaceC0353p
        public C0340c0 onApplyWindowInsets(View view, C0340c0 c0340c0) {
            return CoordinatorLayout.this.setWindowInsets(c0340c0);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0302b {
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface InterfaceC0303c {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    private class ViewGroupOnHierarchyChangeListenerC0304d implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC0304d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    class ViewTreeObserverOnPreDrawListenerC0306f implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC0306f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    static class C0307g implements Comparator<View> {
        C0307g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM2007P = C0358u.m2007P(view);
            float fM2007P2 = C0358u.m2007P(view2);
            if (fM2007P > fM2007P2) {
                return -1;
            }
            return fM2007P < fM2007P2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r02 != null ? r02.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new C0307g();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new C1024g(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static Rect acquireTempRect() {
        Rect rectAcquire = sRectPool.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    private static int clamp(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    private void constrainChildRect(C0305e c0305e, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0305e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) c0305e).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0305e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) c0305e).bottomMargin));
        rect.set(iMax, iMax2, i4 + iMax, i5 + iMax2);
    }

    private C0340c0 dispatchApplyWindowInsetsToBehaviors(C0340c0 c0340c0) {
        Behavior behaviorM1709f;
        if (c0340c0.m1877p()) {
            return c0340c0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (C0358u.m2064x(childAt) && (behaviorM1709f = ((C0305e) childAt.getLayoutParams()).m1709f()) != null) {
                c0340c0 = behaviorM1709f.onApplyWindowInsets(this, childAt, c0340c0);
                if (c0340c0.m1877p()) {
                    break;
                }
            }
        }
        return c0340c0;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i4, Rect rect, Rect rect2, C0305e c0305e, int i5, int i6) {
        int iM1928b = C0342e.m1928b(resolveAnchoredChildGravity(c0305e.f2581c), i4);
        int iM1928b2 = C0342e.m1928b(resolveGravity(c0305e.f2582d), i4);
        int i7 = iM1928b & 7;
        int i8 = iM1928b & 112;
        int i9 = iM1928b2 & 7;
        int i10 = iM1928b2 & 112;
        int iWidth = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            iWidth -= i5 / 2;
        } else if (i7 != 5) {
            iWidth -= i5;
        }
        if (i8 == 16) {
            iHeight -= i6 / 2;
        } else if (i8 != 80) {
            iHeight -= i6;
        }
        rect2.set(iWidth, iHeight, i5 + iWidth, i6 + iHeight);
    }

    private int getKeyline(int i4) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e(TAG, "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.m1732j(view);
    }

    private void layoutChild(View view, int i4) {
        C0305e c0305e = (C0305e) view.getLayoutParams();
        Rect rectAcquireTempRect = acquireTempRect();
        rectAcquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0305e).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0305e).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0305e).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0305e).bottomMargin);
        if (this.mLastInsets != null && C0358u.m2064x(this) && !C0358u.m2064x(view)) {
            rectAcquireTempRect.left += this.mLastInsets.m1872j();
            rectAcquireTempRect.top += this.mLastInsets.m1874l();
            rectAcquireTempRect.right -= this.mLastInsets.m1873k();
            rectAcquireTempRect.bottom -= this.mLastInsets.m1871i();
        }
        Rect rectAcquireTempRect2 = acquireTempRect();
        C0342e.m1927a(resolveGravity(c0305e.f2581c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectAcquireTempRect, rectAcquireTempRect2, i4);
        view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i4) {
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, rectAcquireTempRect);
            getDesiredAnchoredChildRect(view, i4, rectAcquireTempRect, rectAcquireTempRect2);
            view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i4, int i5) {
        C0305e c0305e = (C0305e) view.getLayoutParams();
        int iM1928b = C0342e.m1928b(resolveKeylineGravity(c0305e.f2581c), i5);
        int i6 = iM1928b & 7;
        int i7 = iM1928b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i5 == 1) {
            i4 = width - i4;
        }
        int keyline = getKeyline(i4) - measuredWidth;
        int i8 = 0;
        if (i6 == 1) {
            keyline += measuredWidth / 2;
        } else if (i6 == 5) {
            keyline += measuredWidth;
        }
        if (i7 == 16) {
            i8 = 0 + (measuredHeight / 2);
        } else if (i7 == 80) {
            i8 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0305e).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0305e).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0305e).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0305e).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void offsetChildByInset(View view, Rect rect, int i4) {
        boolean z3;
        boolean z4;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        if (C0358u.m2013V(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0305e c0305e = (C0305e) view.getLayoutParams();
            Behavior behaviorM1709f = c0305e.m1709f();
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            rectAcquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behaviorM1709f == null || !behaviorM1709f.getInsetDodgeRect(this, view, rectAcquireTempRect)) {
                rectAcquireTempRect.set(rectAcquireTempRect2);
            } else if (!rectAcquireTempRect2.contains(rectAcquireTempRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectAcquireTempRect.toShortString() + " | Bounds:" + rectAcquireTempRect2.toShortString());
            }
            releaseTempRect(rectAcquireTempRect2);
            if (rectAcquireTempRect.isEmpty()) {
                releaseTempRect(rectAcquireTempRect);
                return;
            }
            int iM1928b = C0342e.m1928b(c0305e.f2586h, i4);
            boolean z5 = true;
            if ((iM1928b & 48) != 48 || (i9 = (rectAcquireTempRect.top - ((ViewGroup.MarginLayoutParams) c0305e).topMargin) - c0305e.f2588j) >= (i10 = rect.top)) {
                z3 = false;
            } else {
                setInsetOffsetY(view, i10 - i9);
                z3 = true;
            }
            if ((iM1928b & 80) == 80 && (height = ((getHeight() - rectAcquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) c0305e).bottomMargin) + c0305e.f2588j) < (i8 = rect.bottom)) {
                setInsetOffsetY(view, height - i8);
                z3 = true;
            }
            if (!z3) {
                setInsetOffsetY(view, 0);
            }
            if ((iM1928b & 3) != 3 || (i6 = (rectAcquireTempRect.left - ((ViewGroup.MarginLayoutParams) c0305e).leftMargin) - c0305e.f2587i) >= (i7 = rect.left)) {
                z4 = false;
            } else {
                setInsetOffsetX(view, i7 - i6);
                z4 = true;
            }
            if ((iM1928b & 5) != 5 || (width = ((getWidth() - rectAcquireTempRect.right) - ((ViewGroup.MarginLayoutParams) c0305e).rightMargin) + c0305e.f2587i) >= (i5 = rect.right)) {
                z5 = z4;
            } else {
                setInsetOffsetX(view, width - i5);
            }
            if (!z5) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(rectAcquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = sConstructors;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e4) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e4);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i4) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            C0305e c0305e = (C0305e) view.getLayoutParams();
            Behavior behaviorM1709f = c0305e.m1709f();
            if (!(zOnInterceptTouchEvent || z3) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behaviorM1709f != null) {
                    if (i4 == 0) {
                        zOnInterceptTouchEvent = behaviorM1709f.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i4 == 1) {
                        zOnInterceptTouchEvent = behaviorM1709f.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zM1706c = c0305e.m1706c();
                boolean zM1712i = c0305e.m1712i(this, view);
                z3 = zM1712i && !zM1706c;
                if (zM1712i && !z3) {
                    break;
                }
            } else if (behaviorM1709f != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0);
                }
                if (i4 == 0) {
                    behaviorM1709f.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i4 == 1) {
                    behaviorM1709f.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.m1727c();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C0305e resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.m1707d(this, childAt);
            this.mChildDag.m1726b(childAt);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i4) {
                    View childAt2 = getChildAt(i5);
                    if (resolvedLayoutParams.m1705b(this, childAt, childAt2)) {
                        if (!this.mChildDag.m1728d(childAt2)) {
                            this.mChildDag.m1726b(childAt2);
                        }
                        this.mChildDag.m1725a(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.m1731i());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.release(rect);
    }

    private void resetTouchBehaviors(boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            Behavior behaviorM1709f = ((C0305e) childAt.getLayoutParams()).m1709f();
            if (behaviorM1709f != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0);
                if (z3) {
                    behaviorM1709f.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behaviorM1709f.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((C0305e) getChildAt(i5).getLayoutParams()).m1716m();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i4) {
        if (i4 == 0) {
            return 17;
        }
        return i4;
    }

    private static int resolveGravity(int i4) {
        if ((i4 & 7) == 0) {
            i4 |= 8388611;
        }
        return (i4 & 112) == 0 ? i4 | 48 : i4;
    }

    private static int resolveKeylineGravity(int i4) {
        return i4 == 0 ? BadgeDrawable.TOP_END : i4;
    }

    private void setInsetOffsetX(View view, int i4) {
        C0305e c0305e = (C0305e) view.getLayoutParams();
        int i5 = c0305e.f2587i;
        if (i5 != i4) {
            C0358u.m2019a0(view, i4 - i5);
            c0305e.f2587i = i4;
        }
    }

    private void setInsetOffsetY(View view, int i4) {
        C0305e c0305e = (C0305e) view.getLayoutParams();
        int i5 = c0305e.f2588j;
        if (i5 != i4) {
            C0358u.m2021b0(view, i4 - i5);
            c0305e.f2588j = i4;
        }
    }

    private void setupForInsets() {
        if (!C0358u.m2064x(this)) {
            C0358u.m1985D0(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new C0301a();
        }
        C0358u.m1985D0(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(LogType.UNEXP_ANR);
    }

    void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC0306f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0305e) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view) {
        List listM1729g = this.mChildDag.m1729g(view);
        if (listM1729g == null || listM1729g.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < listM1729g.size(); i4++) {
            View view2 = (View) listM1729g.get(i4);
            Behavior behaviorM1709f = ((C0305e) view2.getLayoutParams()).m1709f();
            if (behaviorM1709f != null) {
                behaviorM1709f.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z3 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectAcquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, rectAcquireTempRect);
        Rect rectAcquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, rectAcquireTempRect2);
        try {
            if (rectAcquireTempRect.left <= rectAcquireTempRect2.right && rectAcquireTempRect.top <= rectAcquireTempRect2.bottom && rectAcquireTempRect.right >= rectAcquireTempRect2.left) {
                if (rectAcquireTempRect.bottom >= rectAcquireTempRect2.top) {
                    z3 = true;
                }
            }
            return z3;
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        C0305e c0305e = (C0305e) view.getLayoutParams();
        Behavior behavior = c0305e.f2579a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > IGoodView.DEFAULT_TO_ALPHA) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(c0305e.f2579a.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (hasDependencies(getChildAt(i4))) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (z3 != this.mNeedsPreDrawListener) {
            if (z3) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    void getChildRect(View view, boolean z3, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> getDependencies(View view) {
        List<View> listM1730h = this.mChildDag.m1730h(view);
        this.mTempDependenciesList.clear();
        if (listM1730h != null) {
            this.mTempDependenciesList.addAll(listM1730h);
        }
        return this.mTempDependenciesList;
    }

    final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view) {
        List listM1729g = this.mChildDag.m1729g(view);
        this.mTempDependenciesList.clear();
        if (listM1729g != null) {
            this.mTempDependenciesList.addAll(listM1729g);
        }
        return this.mTempDependenciesList;
    }

    void getDescendantRect(View view, Rect rect) {
        C0309b.m1733a(this, view, rect);
    }

    void getDesiredAnchoredChildRect(View view, int i4, Rect rect, Rect rect2) {
        C0305e c0305e = (C0305e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i4, rect, rect2, c0305e, measuredWidth, measuredHeight);
        constrainChildRect(c0305e, rect2, measuredWidth, measuredHeight);
    }

    void getLastChildRect(View view, Rect rect) {
        rect.set(((C0305e) view.getLayoutParams()).m1711h());
    }

    public final C0340c0 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m1968a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    C0305e getResolvedLayoutParams(View view) {
        C0305e c0305e = (C0305e) view.getLayoutParams();
        if (!c0305e.f2580b) {
            if (view instanceof InterfaceC0302b) {
                Behavior behavior = ((InterfaceC0302b) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                c0305e.m1717o(behavior);
                c0305e.f2580b = true;
            } else {
                InterfaceC0303c interfaceC0303c = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC0303c = (InterfaceC0303c) superclass.getAnnotation(InterfaceC0303c.class);
                    if (interfaceC0303c != null) {
                        break;
                    }
                }
                if (interfaceC0303c != null) {
                    try {
                        c0305e.m1717o(interfaceC0303c.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e4) {
                        Log.e(TAG, "Default behavior class " + interfaceC0303c.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                    }
                }
                c0305e.f2580b = true;
            }
        }
        return c0305e;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(View view, int i4, int i5) {
        Rect rectAcquireTempRect = acquireTempRect();
        getDescendantRect(view, rectAcquireTempRect);
        try {
            return rectAcquireTempRect.contains(i4, i5);
        } finally {
            releaseTempRect(rectAcquireTempRect);
        }
    }

    void offsetChildToAnchor(View view, int i4) {
        Behavior behaviorM1709f;
        C0305e c0305e = (C0305e) view.getLayoutParams();
        if (c0305e.f2589k != null) {
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            Rect rectAcquireTempRect3 = acquireTempRect();
            getDescendantRect(c0305e.f2589k, rectAcquireTempRect);
            getChildRect(view, false, rectAcquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i4, rectAcquireTempRect, rectAcquireTempRect3, c0305e, measuredWidth, measuredHeight);
            boolean z3 = (rectAcquireTempRect3.left == rectAcquireTempRect2.left && rectAcquireTempRect3.top == rectAcquireTempRect2.top) ? false : true;
            constrainChildRect(c0305e, rectAcquireTempRect3, measuredWidth, measuredHeight);
            int i5 = rectAcquireTempRect3.left - rectAcquireTempRect2.left;
            int i6 = rectAcquireTempRect3.top - rectAcquireTempRect2.top;
            if (i5 != 0) {
                C0358u.m2019a0(view, i5);
            }
            if (i6 != 0) {
                C0358u.m2021b0(view, i6);
            }
            if (z3 && (behaviorM1709f = c0305e.m1709f()) != null) {
                behaviorM1709f.onDependentViewChanged(this, view, c0305e.f2589k);
            }
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
            releaseTempRect(rectAcquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC0306f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && C0358u.m2064x(this)) {
            C0358u.m2045n0(this);
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void onChildViewsChanged(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onChildViewsChanged(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        C0340c0 c0340c0 = this.mLastInsets;
        int iM1874l = c0340c0 != null ? c0340c0.m1874l() : 0;
        if (iM1874l > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM1874l);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean zPerformIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return zPerformIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        Behavior behaviorM1709f;
        int iM1978A = C0358u.m1978A(this);
        int size = this.mDependencySortedChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = this.mDependencySortedChildren.get(i8);
            if (view.getVisibility() != 8 && ((behaviorM1709f = ((C0305e) view.getLayoutParams()).m1709f()) == null || !behaviorM1709f.onLayoutChild(this, view, iM1978A))) {
                onLayoutChild(view, iM1978A);
            }
        }
    }

    public void onLayoutChild(View view, int i4) {
        C0305e c0305e = (C0305e) view.getLayoutParams();
        if (c0305e.m1704a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c0305e.f2589k;
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i4);
            return;
        }
        int i5 = c0305e.f2583e;
        if (i5 >= 0) {
            layoutChildWithKeyline(view, i5, i4);
        } else {
            layoutChild(view, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        Behavior behaviorM1709f;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0305e c0305e = (C0305e) childAt.getLayoutParams();
                if (c0305e.m1713j(0) && (behaviorM1709f = c0305e.m1709f()) != null) {
                    zOnNestedFling |= behaviorM1709f.onNestedFling(this, childAt, view, f4, f5, z3);
                }
            }
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        Behavior behaviorM1709f;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0305e c0305e = (C0305e) childAt.getLayoutParams();
                if (c0305e.m1713j(0) && (behaviorM1709f = c0305e.m1709f()) != null) {
                    zOnNestedPreFling |= behaviorM1709f.onNestedPreFling(this, childAt, view, f4, f5);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        onNestedPreScroll(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        onNestedScroll(view, i4, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        onNestedScrollAccepted(view, view2, i4, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f2576a;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            Behavior behaviorM1709f = getResolvedLayoutParams(childAt).m1709f();
            if (id != -1 && behaviorM1709f != null && (parcelable2 = sparseArray.get(id)) != null) {
                behaviorM1709f.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            Behavior behaviorM1709f = ((C0305e) childAt.getLayoutParams()).m1709f();
            if (id != -1 && behaviorM1709f != null && (parcelableOnSaveInstanceState = behaviorM1709f.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.f2576a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return onStartNestedScroll(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
      0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0305e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.m1709f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.resetTouchBehaviors(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void recordLastChildRect(View view, Rect rect) {
        ((C0305e) view.getLayoutParams()).m1719q(rect);
    }

    void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        Behavior behaviorM1709f = ((C0305e) view.getLayoutParams()).m1709f();
        if (behaviorM1709f == null || !behaviorM1709f.onRequestChildRectangleOnScreen(this, view, rect, z3)) {
            return super.requestChildRectangleOnScreen(view, rect, z3);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                C3403a.m10396m(this.mStatusBarBackground, C0358u.m1978A(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            C0358u.m2033h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(i4 != 0 ? C0332a.m1806d(getContext(), i4) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.mStatusBarBackground.setVisible(z3, false);
    }

    final C0340c0 setWindowInsets(C0340c0 c0340c0) {
        if (C1020c.m4773a(this.mLastInsets, c0340c0)) {
            return c0340c0;
        }
        this.mLastInsets = c0340c0;
        boolean z3 = c0340c0 != null && c0340c0.m1874l() > 0;
        this.mDrawStatusBarBackground = z3;
        setWillNotDraw(!z3 && getBackground() == null);
        C0340c0 c0340c0DispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(c0340c0);
        requestLayout();
        return c0340c0DispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2981a.f11541a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0305e generateDefaultLayoutParams() {
        return new C0305e(-2, -2);
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i6) {
        Behavior behaviorM1709f;
        int childCount = getChildCount();
        boolean z3 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0305e c0305e = (C0305e) childAt.getLayoutParams();
                if (c0305e.m1713j(i6) && (behaviorM1709f = c0305e.m1709f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorM1709f.onNestedPreScroll(this, childAt, view, i4, i5, iArr2, i6);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i4 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z3) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8) {
        onNestedScroll(view, i4, i5, i6, i7, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        Behavior behaviorM1709f;
        this.mNestedScrollingParentHelper.m1970c(view, view2, i4, i5);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C0305e c0305e = (C0305e) childAt.getLayoutParams();
            if (c0305e.m1713j(i5) && (behaviorM1709f = c0305e.m1709f()) != null) {
                behaviorM1709f.onNestedScrollAccepted(this, childAt, view, view2, i4, i5);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC0350m
    public boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0305e c0305e = (C0305e) childAt.getLayoutParams();
                Behavior behaviorM1709f = c0305e.m1709f();
                if (behaviorM1709f != null) {
                    boolean zOnStartNestedScroll = behaviorM1709f.onStartNestedScroll(this, childAt, view, view2, i4, i5);
                    z3 |= zOnStartNestedScroll;
                    c0305e.m1720r(i5, zOnStartNestedScroll);
                } else {
                    c0305e.m1720r(i5, false);
                }
            }
        }
        return z3;
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onStopNestedScroll(View view, int i4) {
        this.mNestedScrollingParentHelper.m1972e(view, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0305e c0305e = (C0305e) childAt.getLayoutParams();
            if (c0305e.m1713j(i4)) {
                Behavior behaviorM1709f = c0305e.m1709f();
                if (behaviorM1709f != null) {
                    behaviorM1709f.onStopNestedScroll(this, childAt, view, i4);
                }
                c0305e.m1715l(i4);
                c0305e.m1714k();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i4);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new C0308a<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new C0352o(this);
        if (i4 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2983c.f11544b, 0, C2982b.f11542a);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2983c.f11544b, i4, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i4 == 0) {
                saveAttributeDataForStyleable(context, C2983c.f11544b, attributeSet, typedArrayObtainStyledAttributes, 0, C2982b.f11542a);
            } else {
                saveAttributeDataForStyleable(context, C2983c.f11544b, attributeSet, typedArrayObtainStyledAttributes, i4, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2983c.f11545c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f4 = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i5 = 0; i5 < length; i5++) {
                this.mKeylines[i5] = (int) (r12[i5] * f4);
            }
        }
        this.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(C2983c.f11546d);
        typedArrayObtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0304d());
        if (C0358u.m2066y(this) == 0) {
            C0358u.m1979A0(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public C0305e generateLayoutParams(AttributeSet attributeSet) {
        return new C0305e(getContext(), attributeSet);
    }

    @Override // androidx.core.view.InterfaceC0351n
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        Behavior behaviorM1709f;
        int iMin;
        int childCount = getChildCount();
        boolean z3 = false;
        int iMax = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0305e c0305e = (C0305e) childAt.getLayoutParams();
                if (c0305e.m1713j(i8) && (behaviorM1709f = c0305e.m1709f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorM1709f.onNestedScroll(this, childAt, view, i4, i5, i6, i7, i8, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i6 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i7 > 0) {
                        iMin = Math.max(i9, this.mBehaviorConsumed[1]);
                    } else {
                        iMin = Math.min(i9, this.mBehaviorConsumed[1]);
                    }
                    i9 = iMin;
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i9;
        if (z3) {
            onChildViewsChanged(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0305e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0305e) {
            return new C0305e((C0305e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0305e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0305e(layoutParams);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0300a();

        /* renamed from: a */
        SparseArray<Parcelable> f2576a;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0300a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0300a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i4 = parcel.readInt();
            int[] iArr = new int[i4];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f2576a = new SparseArray<>(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                this.f2576a.append(iArr[i5], parcelableArray[i5]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            SparseArray<Parcelable> sparseArray = this.f2576a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = this.f2576a.keyAt(i5);
                parcelableArr[i5] = this.f2576a.valueAt(i5);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i4);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public static class C0305e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        Behavior f2579a;

        /* renamed from: b */
        boolean f2580b;

        /* renamed from: c */
        public int f2581c;

        /* renamed from: d */
        public int f2582d;

        /* renamed from: e */
        public int f2583e;

        /* renamed from: f */
        int f2584f;

        /* renamed from: g */
        public int f2585g;

        /* renamed from: h */
        public int f2586h;

        /* renamed from: i */
        int f2587i;

        /* renamed from: j */
        int f2588j;

        /* renamed from: k */
        View f2589k;

        /* renamed from: l */
        View f2590l;

        /* renamed from: m */
        private boolean f2591m;

        /* renamed from: n */
        private boolean f2592n;

        /* renamed from: o */
        private boolean f2593o;

        /* renamed from: p */
        private boolean f2594p;

        /* renamed from: q */
        final Rect f2595q;

        /* renamed from: r */
        Object f2596r;

        public C0305e(int i4, int i5) {
            super(i4, i5);
            this.f2580b = false;
            this.f2581c = 0;
            this.f2582d = 0;
            this.f2583e = -1;
            this.f2584f = -1;
            this.f2585g = 0;
            this.f2586h = 0;
            this.f2595q = new Rect();
        }

        /* renamed from: n */
        private void m1701n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f2584f);
            this.f2589k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2590l = null;
                    this.f2589k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2584f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f2590l = null;
                this.f2589k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f2590l = null;
                    this.f2589k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f2590l = viewFindViewById;
        }

        /* renamed from: s */
        private boolean m1702s(View view, int i4) {
            int iM1928b = C0342e.m1928b(((C0305e) view.getLayoutParams()).f2585g, i4);
            return iM1928b != 0 && (C0342e.m1928b(this.f2586h, i4) & iM1928b) == iM1928b;
        }

        /* renamed from: t */
        private boolean m1703t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2589k.getId() != this.f2584f) {
                return false;
            }
            View view2 = this.f2589k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2590l = null;
                    this.f2589k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f2590l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m1704a() {
            return this.f2589k == null && this.f2584f != -1;
        }

        /* renamed from: b */
        boolean m1705b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            return view2 == this.f2590l || m1702s(view2, C0358u.m1978A(coordinatorLayout)) || ((behavior = this.f2579a) != null && behavior.layoutDependsOn(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        boolean m1706c() {
            if (this.f2579a == null) {
                this.f2591m = false;
            }
            return this.f2591m;
        }

        /* renamed from: d */
        View m1707d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2584f == -1) {
                this.f2590l = null;
                this.f2589k = null;
                return null;
            }
            if (this.f2589k == null || !m1703t(view, coordinatorLayout)) {
                m1701n(view, coordinatorLayout);
            }
            return this.f2589k;
        }

        /* renamed from: e */
        public int m1708e() {
            return this.f2584f;
        }

        /* renamed from: f */
        public Behavior m1709f() {
            return this.f2579a;
        }

        /* renamed from: g */
        boolean m1710g() {
            return this.f2594p;
        }

        /* renamed from: h */
        Rect m1711h() {
            return this.f2595q;
        }

        /* renamed from: i */
        boolean m1712i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z3 = this.f2591m;
            if (z3) {
                return true;
            }
            Behavior behavior = this.f2579a;
            boolean zBlocksInteractionBelow = (behavior != null ? behavior.blocksInteractionBelow(coordinatorLayout, view) : false) | z3;
            this.f2591m = zBlocksInteractionBelow;
            return zBlocksInteractionBelow;
        }

        /* renamed from: j */
        boolean m1713j(int i4) {
            if (i4 == 0) {
                return this.f2592n;
            }
            if (i4 != 1) {
                return false;
            }
            return this.f2593o;
        }

        /* renamed from: k */
        void m1714k() {
            this.f2594p = false;
        }

        /* renamed from: l */
        void m1715l(int i4) {
            m1720r(i4, false);
        }

        /* renamed from: m */
        void m1716m() {
            this.f2591m = false;
        }

        /* renamed from: o */
        public void m1717o(Behavior behavior) {
            Behavior behavior2 = this.f2579a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f2579a = behavior;
                this.f2596r = null;
                this.f2580b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        /* renamed from: p */
        void m1718p(boolean z3) {
            this.f2594p = z3;
        }

        /* renamed from: q */
        void m1719q(Rect rect) {
            this.f2595q.set(rect);
        }

        /* renamed from: r */
        void m1720r(int i4, boolean z3) {
            if (i4 == 0) {
                this.f2592n = z3;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f2593o = z3;
            }
        }

        C0305e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2580b = false;
            this.f2581c = 0;
            this.f2582d = 0;
            this.f2583e = -1;
            this.f2584f = -1;
            this.f2585g = 0;
            this.f2586h = 0;
            this.f2595q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2983c.f11547e);
            this.f2581c = typedArrayObtainStyledAttributes.getInteger(C2983c.f11548f, 0);
            this.f2584f = typedArrayObtainStyledAttributes.getResourceId(C2983c.f11549g, -1);
            this.f2582d = typedArrayObtainStyledAttributes.getInteger(C2983c.f11550h, 0);
            this.f2583e = typedArrayObtainStyledAttributes.getInteger(C2983c.f11554l, -1);
            this.f2585g = typedArrayObtainStyledAttributes.getInt(C2983c.f11553k, 0);
            this.f2586h = typedArrayObtainStyledAttributes.getInt(C2983c.f11552j, 0);
            int i4 = C2983c.f11551i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i4);
            this.f2580b = zHasValue;
            if (zHasValue) {
                this.f2579a = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(i4));
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f2579a;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public C0305e(C0305e c0305e) {
            super((ViewGroup.MarginLayoutParams) c0305e);
            this.f2580b = false;
            this.f2581c = 0;
            this.f2582d = 0;
            this.f2583e = -1;
            this.f2584f = -1;
            this.f2585g = 0;
            this.f2586h = 0;
            this.f2595q = new Rect();
        }

        public C0305e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2580b = false;
            this.f2581c = 0;
            this.f2582d = 0;
            this.f2583e = -1;
            this.f2584f = -1;
            this.f2585g = 0;
            this.f2586h = 0;
            this.f2595q = new Rect();
        }

        public C0305e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2580b = false;
            this.f2581c = 0;
            this.f2582d = 0;
            this.f2583e = -1;
            this.f2584f = -1;
            this.f2585g = 0;
            this.f2586h = 0;
            this.f2595q = new Rect();
        }
    }
}
