package p000a.p005b.p014h;

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
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p005b.p012g.p013i.InterfaceC0063p;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.h.h0 */
/* loaded from: classes.dex */
public class C0084h0 implements InterfaceC0063p {

    /* renamed from: B */
    public static Method f641B;

    /* renamed from: C */
    public static Method f642C;

    /* renamed from: D */
    public static Method f643D;

    /* renamed from: A */
    public PopupWindow f644A;

    /* renamed from: b */
    public Context f645b;

    /* renamed from: c */
    public ListAdapter f646c;

    /* renamed from: d */
    public C0074c0 f647d;

    /* renamed from: g */
    public int f650g;

    /* renamed from: h */
    public int f651h;

    /* renamed from: j */
    public boolean f653j;

    /* renamed from: k */
    public boolean f654k;

    /* renamed from: l */
    public boolean f655l;

    /* renamed from: p */
    public DataSetObserver f659p;

    /* renamed from: q */
    public View f660q;

    /* renamed from: r */
    public AdapterView.OnItemClickListener f661r;

    /* renamed from: w */
    public final Handler f666w;

    /* renamed from: y */
    public Rect f668y;

    /* renamed from: z */
    public boolean f669z;

    /* renamed from: e */
    public int f648e = -2;

    /* renamed from: f */
    public int f649f = -2;

    /* renamed from: i */
    public int f652i = 1002;

    /* renamed from: m */
    public int f656m = 0;

    /* renamed from: n */
    public int f657n = Integer.MAX_VALUE;

    /* renamed from: o */
    public int f658o = 0;

    /* renamed from: s */
    public final e f662s = new e();

    /* renamed from: t */
    public final d f663t = new d();

    /* renamed from: u */
    public final c f664u = new c();

    /* renamed from: v */
    public final a f665v = new a();

    /* renamed from: x */
    public final Rect f667x = new Rect();

    /* renamed from: a.b.h.h0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0074c0 c0074c0 = C0084h0.this.f647d;
            if (c0074c0 != null) {
                c0074c0.setListSelectionHidden(true);
                c0074c0.requestLayout();
            }
        }
    }

    /* renamed from: a.b.h.h0$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (C0084h0.this.mo171a()) {
                C0084h0.this.mo172b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0084h0.this.dismiss();
        }
    }

    /* renamed from: a.b.h.h0$c */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (i == 1) {
                if ((C0084h0.this.f644A.getInputMethodMode() == 2) || C0084h0.this.f644A.getContentView() == null) {
                    return;
                }
                C0084h0 c0084h0 = C0084h0.this;
                c0084h0.f666w.removeCallbacks(c0084h0.f662s);
                C0084h0.this.f662s.run();
            }
        }
    }

    /* renamed from: a.b.h.h0$d */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0084h0.this.f644A) != null && popupWindow.isShowing() && x >= 0 && x < C0084h0.this.f644A.getWidth() && y >= 0 && y < C0084h0.this.f644A.getHeight()) {
                C0084h0 c0084h0 = C0084h0.this;
                c0084h0.f666w.postDelayed(c0084h0.f662s, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0084h0 c0084h02 = C0084h0.this;
            c0084h02.f666w.removeCallbacks(c0084h02.f662s);
            return false;
        }
    }

    /* renamed from: a.b.h.h0$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C0074c0 c0074c0 = C0084h0.this.f647d;
            if (c0074c0 != null) {
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                if (!c0074c0.isAttachedToWindow() || C0084h0.this.f647d.getCount() <= C0084h0.this.f647d.getChildCount()) {
                    return;
                }
                int childCount = C0084h0.this.f647d.getChildCount();
                C0084h0 c0084h0 = C0084h0.this;
                if (childCount <= c0084h0.f657n) {
                    c0084h0.f644A.setInputMethodMode(2);
                    C0084h0.this.mo172b();
                }
            }
        }
    }

    static {
        Class cls = Boolean.TYPE;
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            try {
                f641B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f643D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (i <= 23) {
            try {
                f642C = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0084h0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f645b = context;
        this.f666w = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014b.f39n, i, i2);
        this.f650g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f651h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f653j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0091l c0091l = new C0091l(context, attributeSet, i, i2);
        this.f644A = c0091l;
        c0091l.setInputMethodMode(1);
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: a */
    public boolean mo171a() {
        return this.f644A.isShowing();
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: b */
    public void mo172b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i;
        int maxAvailableHeight;
        int i2;
        int paddingBottom;
        C0074c0 c0074c0;
        int i3 = Build.VERSION.SDK_INT;
        if (this.f647d == null) {
            C0074c0 c0074c0Mo330q = mo330q(this.f645b, !this.f669z);
            this.f647d = c0074c0Mo330q;
            c0074c0Mo330q.setAdapter(this.f646c);
            this.f647d.setOnItemClickListener(this.f661r);
            this.f647d.setFocusable(true);
            this.f647d.setFocusableInTouchMode(true);
            this.f647d.setOnItemSelectedListener(new C0082g0(this));
            this.f647d.setOnScrollListener(this.f664u);
            this.f644A.setContentView(this.f647d);
        }
        Drawable background = this.f644A.getBackground();
        if (background != null) {
            background.getPadding(this.f667x);
            Rect rect = this.f667x;
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.f653j) {
                this.f651h = -i4;
            }
        } else {
            this.f667x.setEmpty();
            i = 0;
        }
        boolean z = this.f644A.getInputMethodMode() == 2;
        View view = this.f660q;
        int i5 = this.f651h;
        if (i3 <= 23) {
            Method method = f642C;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.f644A, view, Integer.valueOf(i5), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            } else {
                maxAvailableHeight = this.f644A.getMaxAvailableHeight(view, i5);
            }
        } else {
            maxAvailableHeight = this.f644A.getMaxAvailableHeight(view, i5, z);
        }
        if (this.f648e == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i6 = this.f649f;
            if (i6 != -2) {
                i2 = 1073741824;
                if (i6 == -1) {
                    int i7 = this.f645b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f667x;
                    i6 = i7 - (rect2.left + rect2.right);
                }
            } else {
                int i8 = this.f645b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f667x;
                i6 = i8 - (rect3.left + rect3.right);
                i2 = Integer.MIN_VALUE;
            }
            int iM296a = this.f647d.m296a(View.MeasureSpec.makeMeasureSpec(i6, i2), maxAvailableHeight - 0, -1);
            paddingBottom = iM296a + (iM296a > 0 ? this.f647d.getPaddingBottom() + this.f647d.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = this.f644A.getInputMethodMode() == 2;
        this.f644A.setWindowLayoutType(this.f652i);
        if (this.f644A.isShowing()) {
            View view2 = this.f660q;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (view2.isAttachedToWindow()) {
                int width = this.f649f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f660q.getWidth();
                }
                int i9 = this.f648e;
                if (i9 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.f644A.setWidth(this.f649f == -1 ? -1 : 0);
                        this.f644A.setHeight(0);
                    } else {
                        this.f644A.setWidth(this.f649f == -1 ? -1 : 0);
                        this.f644A.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    paddingBottom = i9;
                }
                this.f644A.setOutsideTouchable(true);
                this.f644A.update(this.f660q, this.f650g, this.f651h, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f649f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f660q.getWidth();
        }
        int i10 = this.f648e;
        if (i10 == -1) {
            paddingBottom = -1;
        } else if (i10 != -2) {
            paddingBottom = i10;
        }
        this.f644A.setWidth(width2);
        this.f644A.setHeight(paddingBottom);
        if (i3 <= 28) {
            Method method2 = f641B;
            if (method2 != null) {
                try {
                    method2.invoke(this.f644A, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f644A.setIsClippedToScreen(true);
        }
        this.f644A.setOutsideTouchable(true);
        this.f644A.setTouchInterceptor(this.f663t);
        if (this.f655l) {
            this.f644A.setOverlapAnchor(this.f654k);
        }
        if (i3 <= 28) {
            Method method3 = f643D;
            if (method3 != null) {
                try {
                    method3.invoke(this.f644A, this.f668y);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.f644A.setEpicenterBounds(this.f668y);
        }
        this.f644A.showAsDropDown(this.f660q, this.f650g, this.f651h, this.f656m);
        this.f647d.setSelection(-1);
        if ((!this.f669z || this.f647d.isInTouchMode()) && (c0074c0 = this.f647d) != null) {
            c0074c0.setListSelectionHidden(true);
            c0074c0.requestLayout();
        }
        if (this.f669z) {
            return;
        }
        this.f666w.post(this.f665v);
    }

    /* renamed from: d */
    public void m323d(int i) {
        this.f650g = i;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    public void dismiss() {
        this.f644A.dismiss();
        this.f644A.setContentView(null);
        this.f647d = null;
        this.f666w.removeCallbacks(this.f662s);
    }

    /* renamed from: e */
    public int m324e() {
        return this.f650g;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: f */
    public ListView mo174f() {
        return this.f647d;
    }

    /* renamed from: j */
    public int m325j() {
        if (this.f653j) {
            return this.f651h;
        }
        return 0;
    }

    /* renamed from: l */
    public void m326l(Drawable drawable) {
        this.f644A.setBackgroundDrawable(drawable);
    }

    /* renamed from: m */
    public void m327m(int i) {
        this.f651h = i;
        this.f653j = true;
    }

    /* renamed from: n */
    public Drawable m328n() {
        return this.f644A.getBackground();
    }

    /* renamed from: o */
    public void mo329o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f659p;
        if (dataSetObserver == null) {
            this.f659p = new b();
        } else {
            ListAdapter listAdapter2 = this.f646c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f646c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f659p);
        }
        C0074c0 c0074c0 = this.f647d;
        if (c0074c0 != null) {
            c0074c0.setAdapter(this.f646c);
        }
    }

    /* renamed from: q */
    public C0074c0 mo330q(Context context, boolean z) {
        return new C0074c0(context, z);
    }

    /* renamed from: r */
    public void m331r(int i) {
        Drawable background = this.f644A.getBackground();
        if (background == null) {
            this.f649f = i;
            return;
        }
        background.getPadding(this.f667x);
        Rect rect = this.f667x;
        this.f649f = rect.left + rect.right + i;
    }

    /* renamed from: s */
    public void m332s(boolean z) {
        this.f669z = z;
        this.f644A.setFocusable(z);
    }
}
