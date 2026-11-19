package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
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
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.github.inflationx.calligraphy3.C1088R;
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
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p029g.C0182a;
import p000a.p029g.p030b.C0183a;
import p000a.p029g.p030b.C0184b;
import p000a.p031h.p033c.C0192a;
import p000a.p031h.p042i.C0241c;
import p000a.p031h.p042i.C0242d;
import p000a.p031h.p043j.C0261j;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0277z;
import p000a.p031h.p043j.InterfaceC0259h;
import p000a.p031h.p043j.InterfaceC0260i;
import p000a.p031h.p043j.InterfaceC0262k;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0259h, InterfaceC0260i {

    /* renamed from: v */
    public static final String f3087v;

    /* renamed from: w */
    public static final Class<?>[] f3088w;

    /* renamed from: x */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0503c>>> f3089x;

    /* renamed from: y */
    public static final Comparator<View> f3090y;

    /* renamed from: z */
    public static final C0241c<Rect> f3091z;

    /* renamed from: b */
    public final List<View> f3092b;

    /* renamed from: c */
    public final C0183a<View> f3093c;

    /* renamed from: d */
    public final List<View> f3094d;

    /* renamed from: e */
    public final List<View> f3095e;

    /* renamed from: f */
    public Paint f3096f;

    /* renamed from: g */
    public final int[] f3097g;

    /* renamed from: h */
    public final int[] f3098h;

    /* renamed from: i */
    public boolean f3099i;

    /* renamed from: j */
    public boolean f3100j;

    /* renamed from: k */
    public int[] f3101k;

    /* renamed from: l */
    public View f3102l;

    /* renamed from: m */
    public View f3103m;

    /* renamed from: n */
    public ViewTreeObserverOnPreDrawListenerC0507g f3104n;

    /* renamed from: o */
    public boolean f3105o;

    /* renamed from: p */
    public C0277z f3106p;

    /* renamed from: q */
    public boolean f3107q;

    /* renamed from: r */
    public Drawable f3108r;

    /* renamed from: s */
    public ViewGroup.OnHierarchyChangeListener f3109s;

    /* renamed from: t */
    public InterfaceC0262k f3110t;

    /* renamed from: u */
    public final C0261j f3111u;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0501a implements InterfaceC0262k {
        public C0501a() {
        }

        @Override // p000a.p031h.p043j.InterfaceC0262k
        /* renamed from: a */
        public C0277z mo96a(View view, C0277z c0277z) {
            AbstractC0503c abstractC0503c;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f3106p, c0277z)) {
                coordinatorLayout.f3106p = c0277z;
                boolean z = c0277z.m899d() > 0;
                coordinatorLayout.f3107q = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!c0277z.m900f()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                        if (childAt.getFitsSystemWindows() && (abstractC0503c = ((C0506f) childAt.getLayoutParams()).f3114a) != null) {
                            c0277z = abstractC0503c.m1668e(c0277z);
                            if (c0277z.m900f()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return c0277z;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0502b {
        AbstractC0503c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0503c<V extends View> {
        public AbstractC0503c() {
        }

        public AbstractC0503c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo1663A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1664a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: b */
        public int m1665b() {
            return -16777216;
        }

        /* renamed from: c */
        public float m1666c() {
            return 0.0f;
        }

        /* renamed from: d */
        public boolean mo1667d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: e */
        public C0277z m1668e(C0277z c0277z) {
            return c0277z;
        }

        /* renamed from: f */
        public void mo1669f(C0506f c0506f) {
        }

        /* renamed from: g */
        public boolean mo1670g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: h */
        public void mo1671h(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: i */
        public void mo1672i() {
        }

        /* renamed from: j */
        public boolean mo1673j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: k */
        public boolean mo1674k(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: l */
        public boolean mo1675l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: m */
        public boolean m1676m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo1677n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        /* renamed from: o */
        public void mo1678o(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: p */
        public void mo1679p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo1678o(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: q */
        public void m1680q() {
        }

        /* renamed from: r */
        public void mo1681r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                m1680q();
            }
        }

        @Deprecated
        /* renamed from: s */
        public void m1682s() {
        }

        /* renamed from: t */
        public boolean mo1683t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: u */
        public void mo1684u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: v */
        public Parcelable mo1685v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: w */
        public boolean mo1686w(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: x */
        public boolean mo1687x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo1686w(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: y */
        public void m1688y() {
        }

        /* renamed from: z */
        public void mo1689z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m1688y();
            }
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface InterfaceC0504d {
        Class<? extends AbstractC0503c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC0505e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC0505e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3109s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m1654q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3109s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0506f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0503c f3114a;

        /* renamed from: b */
        public boolean f3115b;

        /* renamed from: c */
        public int f3116c;

        /* renamed from: d */
        public int f3117d;

        /* renamed from: e */
        public int f3118e;

        /* renamed from: f */
        public int f3119f;

        /* renamed from: g */
        public int f3120g;

        /* renamed from: h */
        public int f3121h;

        /* renamed from: i */
        public int f3122i;

        /* renamed from: j */
        public int f3123j;

        /* renamed from: k */
        public View f3124k;

        /* renamed from: l */
        public View f3125l;

        /* renamed from: m */
        public boolean f3126m;

        /* renamed from: n */
        public boolean f3127n;

        /* renamed from: o */
        public boolean f3128o;

        /* renamed from: p */
        public boolean f3129p;

        /* renamed from: q */
        public final Rect f3130q;

        public C0506f(int i, int i2) {
            super(i, i2);
            this.f3115b = false;
            this.f3116c = 0;
            this.f3117d = 0;
            this.f3118e = -1;
            this.f3119f = -1;
            this.f3120g = 0;
            this.f3121h = 0;
            this.f3130q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0506f(Context context, AttributeSet attributeSet) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            AbstractC0503c abstractC0503cNewInstance;
            super(context, attributeSet);
            this.f3115b = false;
            this.f3116c = 0;
            this.f3117d = 0;
            this.f3118e = -1;
            this.f3119f = -1;
            this.f3120g = 0;
            this.f3121h = 0;
            this.f3130q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0182a.f1389b);
            this.f3116c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f3119f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f3117d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f3118e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f3120g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f3121h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f3115b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f3087v;
                if (TextUtils.isEmpty(string)) {
                    abstractC0503cNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f3087v;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<AbstractC0503c>>> threadLocal = CoordinatorLayout.f3089x;
                        Map<String, Constructor<AbstractC0503c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<AbstractC0503c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f3088w);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        abstractC0503cNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(C0561a.m2076d("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.f3114a = abstractC0503cNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC0503c abstractC0503c = this.f3114a;
            if (abstractC0503c != null) {
                abstractC0503c.mo1669f(this);
            }
        }

        public C0506f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3115b = false;
            this.f3116c = 0;
            this.f3117d = 0;
            this.f3118e = -1;
            this.f3119f = -1;
            this.f3120g = 0;
            this.f3121h = 0;
            this.f3130q = new Rect();
        }

        public C0506f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3115b = false;
            this.f3116c = 0;
            this.f3117d = 0;
            this.f3118e = -1;
            this.f3119f = -1;
            this.f3120g = 0;
            this.f3121h = 0;
            this.f3130q = new Rect();
        }

        public C0506f(C0506f c0506f) {
            super((ViewGroup.MarginLayoutParams) c0506f);
            this.f3115b = false;
            this.f3116c = 0;
            this.f3117d = 0;
            this.f3118e = -1;
            this.f3119f = -1;
            this.f3120g = 0;
            this.f3121h = 0;
            this.f3130q = new Rect();
        }

        /* renamed from: a */
        public boolean m1690a(int i) {
            if (i == 0) {
                return this.f3127n;
            }
            if (i != 1) {
                return false;
            }
            return this.f3128o;
        }

        /* renamed from: b */
        public void m1691b(int i, boolean z) {
            if (i == 0) {
                this.f3127n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f3128o = z;
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC0507g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0507g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m1654q(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0508h extends AbstractC0287a {
        public static final Parcelable.Creator<C0508h> CREATOR = new a();

        /* renamed from: d */
        public SparseArray<Parcelable> f3132d;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0508h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0508h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0508h[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0508h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0508h(parcel, classLoader);
            }
        }

        public C0508h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f3132d = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f3132d.append(iArr[i2], parcelableArray[i2]);
            }
        }

        public C0508h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            SparseArray<Parcelable> sparseArray = this.f3132d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f3132d.keyAt(i2);
                parcelableArr[i2] = this.f3132d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0509i implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            float z = view.getZ();
            float z2 = view2.getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f3087v = r0 != null ? r0.getName() : null;
        f3090y = new C0509i();
        f3088w = new Class[]{Context.class, AttributeSet.class};
        f3089x = new ThreadLocal<>();
        f3091z = new C0242d(12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1088R.attr.coordinatorLayoutStyle);
        int[] iArr = C0182a.f1388a;
        this.f3092b = new ArrayList();
        this.f3093c = new C0183a<>();
        this.f3094d = new ArrayList();
        this.f3095e = new ArrayList();
        this.f3097g = new int[2];
        this.f3098h = new int[2];
        this.f3111u = new C0261j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C1088R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, C1088R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3101k = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.f3101k.length;
            for (int i = 0; i < length; i++) {
                this.f3101k[i] = (int) (r0[i] * f2);
            }
        }
        this.f3108r = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m1662y();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0505e());
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    public static Rect m1644a() {
        Rect rectMo805a = f3091z.mo805a();
        return rectMo805a == null ? new Rect() : rectMo805a;
    }

    /* renamed from: b */
    public final void m1645b(C0506f c0506f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0506f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0506f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0506f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0506f).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* renamed from: c */
    public void m1646c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m1649f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0506f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public List<View> m1647d(View view) {
        C0183a<View> c0183a = this.f3093c;
        int i = c0183a.f1391b.f950d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> arrayListM517k = c0183a.f1391b.m517k(i2);
            if (arrayListM517k != null && arrayListM517k.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0183a.f1391b.m514h(i2));
            }
        }
        this.f3095e.clear();
        if (arrayList != null) {
            this.f3095e.addAll(arrayList);
        }
        return this.f3095e;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0506f c0506f = (C0506f) view.getLayoutParams();
        AbstractC0503c abstractC0503c = c0506f.f3114a;
        if (abstractC0503c != null) {
            float fM1666c = abstractC0503c.m1666c();
            if (fM1666c > 0.0f) {
                if (this.f3096f == null) {
                    this.f3096f = new Paint();
                }
                this.f3096f.setColor(c0506f.f3114a.m1665b());
                Paint paint = this.f3096f;
                int iRound = Math.round(fM1666c * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3096f);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3108r;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* renamed from: e */
    public List<View> m1648e(View view) {
        ArrayList<View> orDefault = this.f3093c.f1391b.getOrDefault(view, null);
        this.f3095e.clear();
        if (orDefault != null) {
            this.f3095e.addAll(orDefault);
        }
        return this.f3095e;
    }

    /* renamed from: f */
    public void m1649f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C0184b.f1394a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C0184b.f1394a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C0184b.m685a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C0184b.f1395b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: g */
    public final void m1650g(int i, Rect rect, Rect rect2, C0506f c0506f, int i2, int i3) {
        int i4 = c0506f.f3116c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0506f.f3117d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0506f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0506f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        m1658u();
        return Collections.unmodifiableList(this.f3092b);
    }

    public final C0277z getLastWindowInsets() {
        return this.f3106p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3111u.m858a();
    }

    public Drawable getStatusBarBackground() {
        return this.f3108r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final int m1651h(int i) {
        StringBuilder sb;
        int[] iArr = this.f3101k;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: i */
    public void mo852i(View view, View view2, int i, int i2) {
        AbstractC0503c abstractC0503c;
        C0261j c0261j = this.f3111u;
        if (i2 == 1) {
            c0261j.f1612b = i;
        } else {
            c0261j.f1611a = i;
        }
        this.f3103m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0506f c0506f = (C0506f) getChildAt(i3).getLayoutParams();
            if (c0506f.m1690a(i2) && (abstractC0503c = c0506f.f3114a) != null && i2 == 0) {
                abstractC0503c.m1682s();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public C0506f m1652j(View view) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        C0506f c0506f = (C0506f) view.getLayoutParams();
        if (!c0506f.f3115b) {
            if (view instanceof InterfaceC0502b) {
                AbstractC0503c behavior = ((InterfaceC0502b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                AbstractC0503c abstractC0503c = c0506f.f3114a;
                if (abstractC0503c != behavior) {
                    if (abstractC0503c != null) {
                        abstractC0503c.mo1672i();
                    }
                    c0506f.f3114a = behavior;
                    c0506f.f3115b = true;
                    if (behavior != null) {
                        behavior.mo1669f(c0506f);
                    }
                }
            } else {
                InterfaceC0504d interfaceC0504d = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC0504d = (InterfaceC0504d) superclass.getAnnotation(InterfaceC0504d.class);
                    if (interfaceC0504d != null) {
                        break;
                    }
                }
                if (interfaceC0504d != null) {
                    try {
                        AbstractC0503c abstractC0503cNewInstance = interfaceC0504d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        AbstractC0503c abstractC0503c2 = c0506f.f3114a;
                        if (abstractC0503c2 != abstractC0503cNewInstance) {
                            if (abstractC0503c2 != null) {
                                abstractC0503c2.mo1672i();
                            }
                            c0506f.f3114a = abstractC0503cNewInstance;
                            c0506f.f3115b = true;
                            if (abstractC0503cNewInstance != null) {
                                abstractC0503cNewInstance.mo1669f(c0506f);
                            }
                        }
                    } catch (Exception e2) {
                        StringBuilder sbM2079g = C0561a.m2079g("Default behavior class ");
                        sbM2079g.append(interfaceC0504d.value().getName());
                        sbM2079g.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sbM2079g.toString(), e2);
                    }
                }
            }
            c0506f.f3115b = true;
        }
        return c0506f;
    }

    @Override // p000a.p031h.p043j.InterfaceC0260i
    /* renamed from: k */
    public void mo857k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0503c abstractC0503c;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0506f c0506f = (C0506f) childAt.getLayoutParams();
                if (c0506f.m1690a(i5) && (abstractC0503c = c0506f.f3114a) != null) {
                    int[] iArr2 = this.f3097g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0503c.mo1681r(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f3097g;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = Math.max(i6, this.f3097g[1]);
                    } else {
                        z = true;
                        iMin = Math.min(i6, this.f3097g[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            m1654q(1);
        }
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: l */
    public void mo853l(View view, int i, int i2, int i3, int i4, int i5) {
        mo857k(view, i, i2, i3, i4, 0, this.f3098h);
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: m */
    public void mo854m(View view, int i) {
        C0261j c0261j = this.f3111u;
        if (i == 1) {
            c0261j.f1612b = 0;
        } else {
            c0261j.f1611a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0506f c0506f = (C0506f) childAt.getLayoutParams();
            if (c0506f.m1690a(i)) {
                AbstractC0503c abstractC0503c = c0506f.f3114a;
                if (abstractC0503c != null) {
                    abstractC0503c.mo1689z(this, childAt, view, i);
                }
                c0506f.m1691b(i, false);
                c0506f.f3129p = false;
            }
        }
        this.f3103m = null;
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: n */
    public void mo855n(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0503c abstractC0503c;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0506f c0506f = (C0506f) childAt.getLayoutParams();
                if (c0506f.m1690a(i3) && (abstractC0503c = c0506f.f3114a) != null) {
                    int[] iArr2 = this.f3097g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0503c.mo1679p(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f3097g;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f3097g;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m1654q(1);
        }
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: o */
    public boolean mo856o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0506f c0506f = (C0506f) childAt.getLayoutParams();
                AbstractC0503c abstractC0503c = c0506f.f3114a;
                if (abstractC0503c != null) {
                    boolean zMo1687x = abstractC0503c.mo1687x(this, childAt, view, view2, i, i2);
                    z |= zMo1687x;
                    c0506f.m1691b(i2, zMo1687x);
                } else {
                    c0506f.m1691b(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1659v(false);
        if (this.f3105o) {
            if (this.f3104n == null) {
                this.f3104n = new ViewTreeObserverOnPreDrawListenerC0507g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3104n);
        }
        if (this.f3106p == null) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f3100j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1659v(false);
        if (this.f3105o && this.f3104n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3104n);
        }
        View view = this.f3103m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3100j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3107q || this.f3108r == null) {
            return;
        }
        C0277z c0277z = this.f3106p;
        int iM899d = c0277z != null ? c0277z.m899d() : 0;
        if (iM899d > 0) {
            this.f3108r.setBounds(0, 0, getWidth(), iM899d);
            this.f3108r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1659v(true);
        }
        boolean zM1657t = m1657t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1659v(true);
        }
        return zM1657t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0503c abstractC0503c;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        int layoutDirection = getLayoutDirection();
        int size = this.f3092b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f3092b.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0503c = ((C0506f) view.getLayoutParams()).f3114a) == null || !abstractC0503c.mo1674k(this, view, layoutDirection))) {
                m1655r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        AbstractC0503c abstractC0503c;
        int childCount = getChildCount();
        boolean zM1676m = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0506f c0506f = (C0506f) childAt.getLayoutParams();
                if (c0506f.m1690a(0) && (abstractC0503c = c0506f.f3114a) != null) {
                    zM1676m |= abstractC0503c.m1676m();
                }
            }
        }
        if (zM1676m) {
            m1654q(1);
        }
        return zM1676m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC0503c abstractC0503c;
        int childCount = getChildCount();
        boolean zMo1677n = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0506f c0506f = (C0506f) childAt.getLayoutParams();
                if (c0506f.m1690a(0) && (abstractC0503c = c0506f.f3114a) != null) {
                    zMo1677n |= abstractC0503c.mo1677n(this, childAt, view, f2, f3);
                }
            }
        }
        return zMo1677n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo855n(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo857k(view, i, i2, i3, i4, 0, this.f3098h);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo852i(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0508h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0508h c0508h = (C0508h) parcelable;
        super.onRestoreInstanceState(c0508h.f1718b);
        SparseArray<Parcelable> sparseArray = c0508h.f3132d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0503c abstractC0503c = m1652j(childAt).f3114a;
            if (id != -1 && abstractC0503c != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0503c.mo1684u(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1685v;
        C0508h c0508h = new C0508h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0503c abstractC0503c = ((C0506f) childAt.getLayoutParams()).f3114a;
            if (id != -1 && abstractC0503c != null && (parcelableMo1685v = abstractC0503c.mo1685v(this, childAt)) != null) {
                sparseArray.append(id, parcelableMo1685v);
            }
        }
        c0508h.f3132d = sparseArray;
        return c0508h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo856o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo854m(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r3
      0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
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
            android.view.View r3 = r0.f3102l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m1657t(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f3102l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0506f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f3114a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f3102l
            boolean r6 = r6.mo1663A(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f3102l
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m1659v(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean m1653p(View view, int i, int i2) {
        Rect rectM1644a = m1644a();
        m1649f(view, rectM1644a);
        try {
            return rectM1644a.contains(i, i2);
        } finally {
            rectM1644a.setEmpty();
            f3091z.mo806b(rectM1644a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1654q(int r25) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1654q(int):void");
    }

    /* renamed from: r */
    public void m1655r(View view, int i) {
        Rect rectM1644a;
        Rect rectM1644a2;
        C0241c<Rect> c0241c;
        C0506f c0506f = (C0506f) view.getLayoutParams();
        View view2 = c0506f.f3124k;
        int i2 = 0;
        if (view2 == null && c0506f.f3119f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            rectM1644a = m1644a();
            rectM1644a2 = m1644a();
            try {
                m1649f(view2, rectM1644a);
                C0506f c0506f2 = (C0506f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1650g(i, rectM1644a, rectM1644a2, c0506f2, measuredWidth, measuredHeight);
                m1645b(c0506f2, rectM1644a2, measuredWidth, measuredHeight);
                view.layout(rectM1644a2.left, rectM1644a2.top, rectM1644a2.right, rectM1644a2.bottom);
                return;
            } finally {
                rectM1644a.setEmpty();
                c0241c = f3091z;
                c0241c.mo806b(rectM1644a);
                rectM1644a2.setEmpty();
                c0241c.mo806b(rectM1644a2);
            }
        }
        int i3 = c0506f.f3118e;
        if (i3 < 0) {
            C0506f c0506f3 = (C0506f) view.getLayoutParams();
            rectM1644a = m1644a();
            rectM1644a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0506f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0506f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0506f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0506f3).bottomMargin);
            if (this.f3106p != null) {
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM1644a.left = this.f3106p.m897b() + rectM1644a.left;
                    rectM1644a.top = this.f3106p.m899d() + rectM1644a.top;
                    rectM1644a.right -= this.f3106p.m898c();
                    rectM1644a.bottom -= this.f3106p.m896a();
                }
            }
            rectM1644a2 = m1644a();
            int i4 = c0506f3.f3116c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM1644a, rectM1644a2, i);
            view.layout(rectM1644a2.left, rectM1644a2.top, rectM1644a2.right, rectM1644a2.bottom);
            return;
        }
        C0506f c0506f4 = (C0506f) view.getLayoutParams();
        int i5 = c0506f4.f3116c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM1651h = m1651h(i3) - measuredWidth2;
        if (i6 == 1) {
            iM1651h += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM1651h += measuredWidth2;
        }
        if (i7 == 16) {
            i2 = 0 + (measuredHeight2 / 2);
        } else if (i7 == 80) {
            i2 = measuredHeight2 + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0506f4).leftMargin, Math.min(iM1651h, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0506f4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0506f4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0506f4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0503c abstractC0503c = ((C0506f) view.getLayoutParams()).f3114a;
        if (abstractC0503c == null || !abstractC0503c.mo1683t(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f3099i) {
            return;
        }
        m1659v(false);
        this.f3099i = true;
    }

    /* renamed from: s */
    public void m1656s(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1662y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3109s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3108r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f3108r = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f3108r.setState(getDrawableState());
                }
                Drawable drawable3 = this.f3108r;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f3108r.setVisible(getVisibility() == 0, false);
                this.f3108r.setCallback(this);
            }
            WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawableM739b;
        if (i != 0) {
            Context context = getContext();
            Object obj = C0192a.f1425a;
            drawableM739b = C0192a.c.m739b(context, i);
        } else {
            drawableM739b = null;
        }
        setStatusBarBackground(drawableM739b);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3108r;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f3108r.setVisible(z, false);
    }

    /* renamed from: t */
    public final boolean m1657t(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3094d;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = f3090y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zMo1673j = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0506f c0506f = (C0506f) view.getLayoutParams();
            AbstractC0503c abstractC0503c = c0506f.f3114a;
            if (!(zMo1673j || z2) || actionMasked == 0) {
                if (!zMo1673j && abstractC0503c != null) {
                    if (i == 0) {
                        zMo1673j = abstractC0503c.mo1673j(this, view, motionEvent);
                    } else if (i == 1) {
                        zMo1673j = abstractC0503c.mo1663A(this, view, motionEvent);
                    }
                    if (zMo1673j) {
                        this.f3102l = view;
                    }
                }
                AbstractC0503c abstractC0503c2 = c0506f.f3114a;
                if (abstractC0503c2 == null) {
                    c0506f.f3126m = false;
                }
                boolean z3 = c0506f.f3126m;
                if (z3) {
                    z = true;
                } else {
                    z = (abstractC0503c2 != null && abstractC0503c2.m1666c() > 0.0f) | z3;
                    c0506f.f3126m = z;
                }
                boolean z4 = z && !z3;
                if (z && !z4) {
                    break;
                }
                z2 = z4;
            } else if (abstractC0503c != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC0503c.mo1673j(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC0503c.mo1663A(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zMo1673j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1658u() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1658u():void");
    }

    /* renamed from: v */
    public final void m1659v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0503c abstractC0503c = ((C0506f) childAt.getLayoutParams()).f3114a;
            if (abstractC0503c != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0503c.mo1673j(this, childAt, motionEventObtain);
                } else {
                    abstractC0503c.mo1663A(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0506f) getChildAt(i2).getLayoutParams()).f3126m = false;
        }
        this.f3102l = null;
        this.f3099i = false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3108r;
    }

    /* renamed from: w */
    public final void m1660w(View view, int i) {
        C0506f c0506f = (C0506f) view.getLayoutParams();
        int i2 = c0506f.f3122i;
        if (i2 != i) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            view.offsetLeftAndRight(i - i2);
            c0506f.f3122i = i;
        }
    }

    /* renamed from: x */
    public final void m1661x(View view, int i) {
        C0506f c0506f = (C0506f) view.getLayoutParams();
        int i2 = c0506f.f3123j;
        if (i2 != i) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            view.offsetTopAndBottom(i - i2);
            c0506f.f3123j = i;
        }
    }

    /* renamed from: y */
    public final void m1662y() {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (!getFitsSystemWindows()) {
            C0266o.m876o(this, null);
            return;
        }
        if (this.f3110t == null) {
            this.f3110t = new C0501a();
        }
        C0266o.m876o(this, this.f3110t);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0506f ? new C0506f((C0506f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0506f((ViewGroup.MarginLayoutParams) layoutParams) : new C0506f(layoutParams);
    }
}
