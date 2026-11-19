package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0134p;
import androidx.core.view.AbstractC0337b;
import androidx.core.view.C0358u;
import p015c.C1041d;
import p015c.C1043f;
import p015c.C1044g;
import p015c.C1045h;
import p015c.C1047j;
import p016c0.C1050c;

/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0159f f805a;

    /* renamed from: b */
    private final ViewOnClickListenerC0160g f806b;

    /* renamed from: c */
    private final View f807c;

    /* renamed from: d */
    private final Drawable f808d;

    /* renamed from: e */
    final FrameLayout f809e;

    /* renamed from: f */
    private final ImageView f810f;

    /* renamed from: g */
    final FrameLayout f811g;

    /* renamed from: h */
    private final ImageView f812h;

    /* renamed from: i */
    private final int f813i;

    /* renamed from: j */
    AbstractC0337b f814j;

    /* renamed from: k */
    final DataSetObserver f815k;

    /* renamed from: l */
    private final ViewTreeObserver.OnGlobalLayoutListener f816l;

    /* renamed from: m */
    private ListPopupWindow f817m;

    /* renamed from: n */
    PopupWindow.OnDismissListener f818n;

    /* renamed from: o */
    boolean f819o;

    /* renamed from: p */
    int f820p;

    /* renamed from: q */
    private boolean f821q;

    /* renamed from: r */
    private int f822r;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f823a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0214g0 c0214g0M814u = C0214g0.m814u(context, attributeSet, f823a);
            setBackgroundDrawable(c0214g0M814u.m822g(0));
            c0214g0M814u.m835w();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    class C0154a extends DataSetObserver {
        C0154a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f805a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f805a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    class ViewTreeObserverOnGlobalLayoutListenerC0155b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC0155b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.m605b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                AbstractC0337b abstractC0337b = ActivityChooserView.this.f814j;
                if (abstractC0337b != null) {
                    abstractC0337b.m1850k(true);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    class C0156c extends View.AccessibilityDelegate {
        C0156c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C1050c.m4832H0(accessibilityNodeInfo).m4873Z(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    class C0157d extends AbstractViewOnTouchListenerC0234t {
        C0157d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
        /* renamed from: b */
        public InterfaceC0134p mo413b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
        /* renamed from: c */
        protected boolean mo414c() {
            ActivityChooserView.this.m606c();
            return true;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
        /* renamed from: d */
        protected boolean mo588d() {
            ActivityChooserView.this.m604a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    class C0158e extends DataSetObserver {
        C0158e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m608e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    private class C0159f extends BaseAdapter {

        /* renamed from: a */
        private int f829a = 4;

        /* renamed from: b */
        private boolean f830b;

        /* renamed from: c */
        private boolean f831c;

        /* renamed from: d */
        private boolean f832d;

        C0159f() {
        }

        /* renamed from: a */
        public int m609a() {
            throw null;
        }

        /* renamed from: b */
        public C0205c m610b() {
            return null;
        }

        /* renamed from: c */
        public ResolveInfo m611c() {
            throw null;
        }

        /* renamed from: d */
        public int m612d() {
            throw null;
        }

        /* renamed from: e */
        public boolean m613e() {
            return this.f830b;
        }

        /* renamed from: f */
        public void m614f(C0205c c0205c) {
            ActivityChooserView.this.f805a.m610b();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (this.f830b) {
                throw null;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return (this.f832d && i4 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C1044g.f5885f, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(C1043f.f5850S)).setText(ActivityChooserView.this.getContext().getString(C1045h.f5903b));
                return viewInflate;
            }
            if (view == null || view.getId() != C1043f.f5877x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C1044g.f5885f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C1043f.f5875v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i4);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C1043f.f5850S)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f830b && i4 == 0 && this.f831c) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    private class ViewOnClickListenerC0160g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        ViewOnClickListenerC0160g() {
        }

        /* renamed from: a */
        private void m615a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f818n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f811g) {
                activityChooserView.m604a();
                ActivityChooserView.this.f805a.m611c();
                ActivityChooserView.this.f805a.m610b();
                throw null;
            }
            if (view != activityChooserView.f809e) {
                throw new IllegalArgumentException();
            }
            activityChooserView.f819o = false;
            activityChooserView.m607d(activityChooserView.f820p);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m615a();
            AbstractC0337b abstractC0337b = ActivityChooserView.this.f814j;
            if (abstractC0337b != null) {
                abstractC0337b.m1850k(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int itemViewType = ((C0159f) adapterView.getAdapter()).getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.m607d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.m604a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (!activityChooserView.f819o) {
                activityChooserView.f805a.m613e();
                ActivityChooserView.this.f805a.m610b();
                throw null;
            }
            if (i4 <= 0) {
                return;
            }
            activityChooserView.f805a.m610b();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f811g) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f805a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f819o = true;
                activityChooserView2.m607d(activityChooserView2.f820p);
            }
            return true;
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean m604a() {
        if (!m605b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f816l);
        return true;
    }

    /* renamed from: b */
    public boolean m605b() {
        return getListPopupWindow().mo450a();
    }

    /* renamed from: c */
    public boolean m606c() {
        if (m605b() || !this.f821q) {
            return false;
        }
        this.f819o = false;
        m607d(this.f820p);
        return true;
    }

    /* renamed from: d */
    void m607d(int i4) {
        this.f805a.m610b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: e */
    void m608e() {
        if (this.f805a.getCount() > 0) {
            this.f809e.setEnabled(true);
        } else {
            this.f809e.setEnabled(false);
        }
        int iM609a = this.f805a.m609a();
        int iM612d = this.f805a.m612d();
        if (iM609a == 1 || (iM609a > 1 && iM612d > 0)) {
            this.f811g.setVisibility(0);
            ResolveInfo resolveInfoM611c = this.f805a.m611c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f812h.setImageDrawable(resolveInfoM611c.loadIcon(packageManager));
            if (this.f822r != 0) {
                this.f811g.setContentDescription(getContext().getString(this.f822r, resolveInfoM611c.loadLabel(packageManager)));
            }
        } else {
            this.f811g.setVisibility(8);
        }
        if (this.f811g.getVisibility() == 0) {
            this.f807c.setBackgroundDrawable(this.f808d);
        } else {
            this.f807c.setBackgroundDrawable(null);
        }
    }

    public C0205c getDataModel() {
        this.f805a.m610b();
        return null;
    }

    ListPopupWindow getListPopupWindow() {
        if (this.f817m == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f817m = listPopupWindow;
            listPopupWindow.mo634n(this.f805a);
            this.f817m.m646B(this);
            this.f817m.m652H(true);
            this.f817m.m654J(this.f806b);
            this.f817m.m653I(this.f806b);
        }
        return this.f817m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f805a.m610b();
        this.f821q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f805a.m610b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f816l);
        }
        if (m605b()) {
            m604a();
        }
        this.f821q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        this.f807c.layout(0, 0, i6 - i4, i7 - i5);
        if (m605b()) {
            return;
        }
        m604a();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        View view = this.f807c;
        if (this.f811g.getVisibility() != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), 1073741824);
        }
        measureChild(view, i4, i5);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0205c c0205c) {
        this.f805a.m614f(c0205c);
        if (m605b()) {
            m604a();
            m606c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i4) {
        this.f822r = i4;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i4) {
        this.f810f.setContentDescription(getContext().getString(i4));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f810f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i4) {
        this.f820p = i4;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f818n = onDismissListener;
    }

    public void setProvider(AbstractC0337b abstractC0337b) {
        this.f814j = abstractC0337b;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f815k = new C0154a();
        this.f816l = new ViewTreeObserverOnGlobalLayoutListenerC0155b();
        this.f820p = 4;
        int[] iArr = C1047j.f5942E;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        C0358u.m2047o0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i4, 0);
        this.f820p = typedArrayObtainStyledAttributes.getInt(C1047j.f5952G, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C1047j.f5947F);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C1044g.f5884e, (ViewGroup) this, true);
        ViewOnClickListenerC0160g viewOnClickListenerC0160g = new ViewOnClickListenerC0160g();
        this.f806b = viewOnClickListenerC0160g;
        View viewFindViewById = findViewById(C1043f.f5863j);
        this.f807c = viewFindViewById;
        this.f808d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C1043f.f5871r);
        this.f811g = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC0160g);
        frameLayout.setOnLongClickListener(viewOnClickListenerC0160g);
        int i5 = C1043f.f5876w;
        this.f812h = (ImageView) frameLayout.findViewById(i5);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C1043f.f5873t);
        frameLayout2.setOnClickListener(viewOnClickListenerC0160g);
        frameLayout2.setAccessibilityDelegate(new C0156c());
        frameLayout2.setOnTouchListener(new C0157d(frameLayout2));
        this.f809e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i5);
        this.f810f = imageView;
        imageView.setImageDrawable(drawable);
        C0159f c0159f = new C0159f();
        this.f805a = c0159f;
        c0159f.registerDataSetObserver(new C0158e());
        Resources resources = context.getResources();
        this.f813i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1041d.f5775d));
    }
}
