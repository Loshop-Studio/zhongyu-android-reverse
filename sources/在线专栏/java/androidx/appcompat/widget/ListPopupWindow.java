package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0134p;
import androidx.core.view.C0358u;
import androidx.core.widget.C0376j;
import com.p071ut.device.AidConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p015c.C1038a;
import p015c.C1047j;

/* loaded from: classes.dex */
public class ListPopupWindow implements InterfaceC0134p {

    /* renamed from: G */
    private static Method f888G;

    /* renamed from: H */
    private static Method f889H;

    /* renamed from: I */
    private static Method f890I;

    /* renamed from: A */
    private Runnable f891A;

    /* renamed from: B */
    final Handler f892B;

    /* renamed from: C */
    private final Rect f893C;

    /* renamed from: D */
    private Rect f894D;

    /* renamed from: E */
    private boolean f895E;

    /* renamed from: F */
    PopupWindow f896F;

    /* renamed from: a */
    private Context f897a;

    /* renamed from: b */
    private ListAdapter f898b;

    /* renamed from: c */
    C0232r f899c;

    /* renamed from: d */
    private int f900d;

    /* renamed from: e */
    private int f901e;

    /* renamed from: f */
    private int f902f;

    /* renamed from: g */
    private int f903g;

    /* renamed from: h */
    private int f904h;

    /* renamed from: i */
    private boolean f905i;

    /* renamed from: j */
    private boolean f906j;

    /* renamed from: k */
    private boolean f907k;

    /* renamed from: l */
    private int f908l;

    /* renamed from: m */
    private boolean f909m;

    /* renamed from: n */
    private boolean f910n;

    /* renamed from: o */
    int f911o;

    /* renamed from: p */
    private View f912p;

    /* renamed from: q */
    private int f913q;

    /* renamed from: r */
    private DataSetObserver f914r;

    /* renamed from: s */
    private View f915s;

    /* renamed from: t */
    private Drawable f916t;

    /* renamed from: u */
    private AdapterView.OnItemClickListener f917u;

    /* renamed from: v */
    private AdapterView.OnItemSelectedListener f918v;

    /* renamed from: w */
    final RunnableC0175g f919w;

    /* renamed from: x */
    private final ViewOnTouchListenerC0174f f920x;

    /* renamed from: y */
    private final C0173e f921y;

    /* renamed from: z */
    private final RunnableC0171c f922z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    class RunnableC0169a implements Runnable {
        RunnableC0169a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewM666r = ListPopupWindow.this.m666r();
            if (viewM666r == null || viewM666r.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.show();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    class C0170b implements AdapterView.OnItemSelectedListener {
        C0170b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            C0232r c0232r;
            if (i4 == -1 || (c0232r = ListPopupWindow.this.f899c) == null) {
                return;
            }
            c0232r.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    private class RunnableC0171c implements Runnable {
        RunnableC0171c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.m664p();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    private class C0172d extends DataSetObserver {
        C0172d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.mo450a()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    private class C0173e implements AbsListView.OnScrollListener {
        C0173e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 != 1 || ListPopupWindow.this.m672y() || ListPopupWindow.this.f896F.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.f892B.removeCallbacks(listPopupWindow.f919w);
            ListPopupWindow.this.f919w.run();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    private class ViewOnTouchListenerC0174f implements View.OnTouchListener {
        ViewOnTouchListenerC0174f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f896F) != null && popupWindow.isShowing() && x3 >= 0 && x3 < ListPopupWindow.this.f896F.getWidth() && y3 >= 0 && y3 < ListPopupWindow.this.f896F.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f892B.postDelayed(listPopupWindow.f919w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.f892B.removeCallbacks(listPopupWindow2.f919w);
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    private class RunnableC0175g implements Runnable {
        RunnableC0175g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0232r c0232r = ListPopupWindow.this.f899c;
            if (c0232r == null || !C0358u.m2012U(c0232r) || ListPopupWindow.this.f899c.getCount() <= ListPopupWindow.this.f899c.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f899c.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f911o) {
                listPopupWindow.f896F.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f888G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f890I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f889H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, C1038a.f5726E);
    }

    /* renamed from: A */
    private void m642A() {
        View view = this.f912p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f912p);
            }
        }
    }

    /* renamed from: L */
    private void m643L(boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.f896F.setIsClippedToScreen(z3);
            return;
        }
        Method method = f888G;
        if (method != null) {
            try {
                method.invoke(this.f896F, Boolean.valueOf(z3));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: o */
    private int m644o() {
        int measuredHeight;
        int i4;
        int iMakeMeasureSpec;
        int i5;
        if (this.f899c == null) {
            Context context = this.f897a;
            this.f891A = new RunnableC0169a();
            C0232r c0232rMo665q = mo665q(context, !this.f895E);
            this.f899c = c0232rMo665q;
            Drawable drawable = this.f916t;
            if (drawable != null) {
                c0232rMo665q.setSelector(drawable);
            }
            this.f899c.setAdapter(this.f898b);
            this.f899c.setOnItemClickListener(this.f917u);
            this.f899c.setFocusable(true);
            this.f899c.setFocusableInTouchMode(true);
            this.f899c.setOnItemSelectedListener(new C0170b());
            this.f899c.setOnScrollListener(this.f921y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f918v;
            if (onItemSelectedListener != null) {
                this.f899c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f899c;
            View view2 = this.f912p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i6 = this.f913q;
                if (i6 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i6 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f913q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i7 = this.f901e;
                if (i7 >= 0) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    i7 = 0;
                    i5 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i7, i5), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.f896F.setContentView(view);
        } else {
            View view3 = this.f912p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f896F.getBackground();
        if (background != null) {
            background.getPadding(this.f893C);
            Rect rect = this.f893C;
            int i8 = rect.top;
            i4 = rect.bottom + i8;
            if (!this.f905i) {
                this.f903g = -i8;
            }
        } else {
            this.f893C.setEmpty();
            i4 = 0;
        }
        int iM645s = m645s(m666r(), this.f903g, this.f896F.getInputMethodMode() == 2);
        if (this.f909m || this.f900d == -1) {
            return iM645s + i4;
        }
        int i9 = this.f901e;
        if (i9 == -2) {
            int i10 = this.f897a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f893C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i9 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else {
            int i11 = this.f897a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f893C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - (rect3.left + rect3.right), 1073741824);
        }
        int iMo993d = this.f899c.mo993d(iMakeMeasureSpec, 0, -1, iM645s - measuredHeight, -1);
        if (iMo993d > 0) {
            measuredHeight += i4 + this.f899c.getPaddingTop() + this.f899c.getPaddingBottom();
        }
        return iMo993d + measuredHeight;
    }

    /* renamed from: s */
    private int m645s(View view, int i4, boolean z3) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f896F.getMaxAvailableHeight(view, i4, z3);
        }
        Method method = f889H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f896F, view, Integer.valueOf(i4), Boolean.valueOf(z3))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f896F.getMaxAvailableHeight(view, i4);
    }

    /* renamed from: B */
    public void m646B(View view) {
        this.f915s = view;
    }

    /* renamed from: C */
    public void m647C(int i4) {
        this.f896F.setAnimationStyle(i4);
    }

    /* renamed from: D */
    public void m648D(int i4) {
        Drawable background = this.f896F.getBackground();
        if (background == null) {
            m658O(i4);
            return;
        }
        background.getPadding(this.f893C);
        Rect rect = this.f893C;
        this.f901e = rect.left + rect.right + i4;
    }

    /* renamed from: E */
    public void m649E(int i4) {
        this.f908l = i4;
    }

    /* renamed from: F */
    public void m650F(Rect rect) {
        this.f894D = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: G */
    public void m651G(int i4) {
        this.f896F.setInputMethodMode(i4);
    }

    /* renamed from: H */
    public void m652H(boolean z3) {
        this.f895E = z3;
        this.f896F.setFocusable(z3);
    }

    /* renamed from: I */
    public void m653I(PopupWindow.OnDismissListener onDismissListener) {
        this.f896F.setOnDismissListener(onDismissListener);
    }

    /* renamed from: J */
    public void m654J(AdapterView.OnItemClickListener onItemClickListener) {
        this.f917u = onItemClickListener;
    }

    /* renamed from: K */
    public void m655K(boolean z3) {
        this.f907k = true;
        this.f906j = z3;
    }

    /* renamed from: M */
    public void m656M(int i4) {
        this.f913q = i4;
    }

    /* renamed from: N */
    public void m657N(int i4) {
        C0232r c0232r = this.f899c;
        if (!mo450a() || c0232r == null) {
            return;
        }
        c0232r.setListSelectionHidden(false);
        c0232r.setSelection(i4);
        if (c0232r.getChoiceMode() != 0) {
            c0232r.setItemChecked(i4, true);
        }
    }

    /* renamed from: O */
    public void m658O(int i4) {
        this.f901e = i4;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    /* renamed from: a */
    public boolean mo450a() {
        return this.f896F.isShowing();
    }

    /* renamed from: b */
    public int m659b() {
        return this.f902f;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    public void dismiss() {
        this.f896F.dismiss();
        m642A();
        this.f896F.setContentView(null);
        this.f899c = null;
        this.f892B.removeCallbacks(this.f919w);
    }

    /* renamed from: e */
    public Drawable m660e() {
        return this.f896F.getBackground();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    /* renamed from: f */
    public ListView mo453f() {
        return this.f899c;
    }

    /* renamed from: h */
    public void m661h(int i4) {
        this.f903g = i4;
        this.f905i = true;
    }

    /* renamed from: j */
    public void m662j(int i4) {
        this.f902f = i4;
    }

    /* renamed from: l */
    public int m663l() {
        if (this.f905i) {
            return this.f903g;
        }
        return 0;
    }

    /* renamed from: n */
    public void mo634n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f914r;
        if (dataSetObserver == null) {
            this.f914r = new C0172d();
        } else {
            ListAdapter listAdapter2 = this.f898b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f898b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f914r);
        }
        C0232r c0232r = this.f899c;
        if (c0232r != null) {
            c0232r.setAdapter(this.f898b);
        }
    }

    /* renamed from: p */
    public void m664p() {
        C0232r c0232r = this.f899c;
        if (c0232r != null) {
            c0232r.setListSelectionHidden(true);
            c0232r.requestLayout();
        }
    }

    /* renamed from: q */
    C0232r mo665q(Context context, boolean z3) {
        return new C0232r(context, z3);
    }

    /* renamed from: r */
    public View m666r() {
        return this.f915s;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.f896F.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    public void show() {
        int iM644o = m644o();
        boolean zM672y = m672y();
        C0376j.m2185b(this.f896F, this.f904h);
        if (this.f896F.isShowing()) {
            if (C0358u.m2012U(m666r())) {
                int width = this.f901e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = m666r().getWidth();
                }
                int i4 = this.f900d;
                if (i4 == -1) {
                    if (!zM672y) {
                        iM644o = -1;
                    }
                    if (zM672y) {
                        this.f896F.setWidth(this.f901e == -1 ? -1 : 0);
                        this.f896F.setHeight(0);
                    } else {
                        this.f896F.setWidth(this.f901e == -1 ? -1 : 0);
                        this.f896F.setHeight(-1);
                    }
                } else if (i4 != -2) {
                    iM644o = i4;
                }
                this.f896F.setOutsideTouchable((this.f910n || this.f909m) ? false : true);
                this.f896F.update(m666r(), this.f902f, this.f903g, width < 0 ? -1 : width, iM644o < 0 ? -1 : iM644o);
                return;
            }
            return;
        }
        int width2 = this.f901e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = m666r().getWidth();
        }
        int i5 = this.f900d;
        if (i5 == -1) {
            iM644o = -1;
        } else if (i5 != -2) {
            iM644o = i5;
        }
        this.f896F.setWidth(width2);
        this.f896F.setHeight(iM644o);
        m643L(true);
        this.f896F.setOutsideTouchable((this.f910n || this.f909m) ? false : true);
        this.f896F.setTouchInterceptor(this.f920x);
        if (this.f907k) {
            C0376j.m2184a(this.f896F, this.f906j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f890I;
            if (method != null) {
                try {
                    method.invoke(this.f896F, this.f894D);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            this.f896F.setEpicenterBounds(this.f894D);
        }
        C0376j.m2186c(this.f896F, m666r(), this.f902f, this.f903g, this.f908l);
        this.f899c.setSelection(-1);
        if (!this.f895E || this.f899c.isInTouchMode()) {
            m664p();
        }
        if (this.f895E) {
            return;
        }
        this.f892B.post(this.f922z);
    }

    /* renamed from: t */
    public Object m667t() {
        if (mo450a()) {
            return this.f899c.getSelectedItem();
        }
        return null;
    }

    /* renamed from: u */
    public long m668u() {
        if (mo450a()) {
            return this.f899c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: v */
    public int m669v() {
        if (mo450a()) {
            return this.f899c.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: w */
    public View m670w() {
        if (mo450a()) {
            return this.f899c.getSelectedView();
        }
        return null;
    }

    /* renamed from: x */
    public int m671x() {
        return this.f901e;
    }

    /* renamed from: y */
    public boolean m672y() {
        return this.f896F.getInputMethodMode() == 2;
    }

    /* renamed from: z */
    public boolean m673z() {
        return this.f895E;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5726E);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f900d = -2;
        this.f901e = -2;
        this.f904h = AidConstants.EVENT_REQUEST_FAILED;
        this.f908l = 0;
        this.f909m = false;
        this.f910n = false;
        this.f911o = Integer.MAX_VALUE;
        this.f913q = 0;
        this.f919w = new RunnableC0175g();
        this.f920x = new ViewOnTouchListenerC0174f();
        this.f921y = new C0173e();
        this.f922z = new RunnableC0171c();
        this.f893C = new Rect();
        this.f897a = context;
        this.f892B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1047j.f6135q1, i4, i5);
        this.f902f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1047j.f6140r1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1047j.f6145s1, 0);
        this.f903g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f905i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i4, i5);
        this.f896F = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
