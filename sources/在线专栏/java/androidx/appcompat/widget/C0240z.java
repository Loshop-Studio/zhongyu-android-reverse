package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import p015c.C1038a;
import p088g.C2619a;

/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
public class C0240z extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: j */
    private static final Interpolator f1246j = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f1247a;

    /* renamed from: b */
    private c f1248b;

    /* renamed from: c */
    LinearLayoutCompat f1249c;

    /* renamed from: d */
    private Spinner f1250d;

    /* renamed from: e */
    private boolean f1251e;

    /* renamed from: f */
    int f1252f;

    /* renamed from: g */
    int f1253g;

    /* renamed from: h */
    private int f1254h;

    /* renamed from: i */
    private int f1255i;

    /* renamed from: androidx.appcompat.widget.z$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1256a;

        a(View view) {
            this.f1256a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0240z.this.smoothScrollTo(this.f1256a.getLeft() - ((C0240z.this.getWidth() - this.f1256a.getWidth()) / 2), 0);
            C0240z.this.f1247a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0240z.this.f1249c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return ((d) C0240z.this.f1249c.getChildAt(i4)).m1052b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0240z.this.m1050c((ActionBar.AbstractC0069b) getItem(i4), true);
            }
            ((d) view).m1051a((ActionBar.AbstractC0069b) getItem(i4));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$c */
    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).m1052b().m127e();
            int childCount = C0240z.this.f1249c.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = C0240z.this.f1249c.getChildAt(i4);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$d */
    private class d extends LinearLayout {

        /* renamed from: a */
        private final int[] f1260a;

        /* renamed from: b */
        private ActionBar.AbstractC0069b f1261b;

        /* renamed from: c */
        private TextView f1262c;

        /* renamed from: d */
        private ImageView f1263d;

        /* renamed from: e */
        private View f1264e;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, ActionBar.AbstractC0069b abstractC0069b, boolean z3) {
            int i4 = C1038a.f5740d;
            super(context, null, i4);
            int[] iArr = {R.attr.background};
            this.f1260a = iArr;
            this.f1261b = abstractC0069b;
            C0214g0 c0214g0M815v = C0214g0.m815v(context, null, iArr, i4, 0);
            if (c0214g0M815v.m834s(0)) {
                setBackgroundDrawable(c0214g0M815v.m822g(0));
            }
            c0214g0M815v.m835w();
            if (z3) {
                setGravity(8388627);
            }
            m1053c();
        }

        /* renamed from: a */
        public void m1051a(ActionBar.AbstractC0069b abstractC0069b) {
            this.f1261b = abstractC0069b;
            m1053c();
        }

        /* renamed from: b */
        public ActionBar.AbstractC0069b m1052b() {
            return this.f1261b;
        }

        /* renamed from: c */
        public void m1053c() {
            ActionBar.AbstractC0069b abstractC0069b = this.f1261b;
            View viewM124b = abstractC0069b.m124b();
            if (viewM124b != null) {
                ViewParent parent = viewM124b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM124b);
                    }
                    addView(viewM124b);
                }
                this.f1264e = viewM124b;
                TextView textView = this.f1262c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1263d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1263d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1264e;
            if (view != null) {
                removeView(view);
                this.f1264e = null;
            }
            Drawable drawableM125c = abstractC0069b.m125c();
            CharSequence charSequenceM126d = abstractC0069b.m126d();
            if (drawableM125c != null) {
                if (this.f1263d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1263d = appCompatImageView;
                }
                this.f1263d.setImageDrawable(drawableM125c);
                this.f1263d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1263d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1263d.setImageDrawable(null);
                }
            }
            boolean z3 = !TextUtils.isEmpty(charSequenceM126d);
            if (z3) {
                if (this.f1262c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C1038a.f5741e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1262c = appCompatTextView;
                }
                this.f1262c.setText(charSequenceM126d);
                this.f1262c.setVisibility(0);
            } else {
                TextView textView2 = this.f1262c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1262c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1263d;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC0069b.m123a());
            }
            C0218i0.m886a(this, z3 ? null : abstractC0069b.m123a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (C0240z.this.f1252f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i6 = C0240z.this.f1252f;
                if (measuredWidth > i6) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z3) {
            boolean z4 = isSelected() != z3;
            super.setSelected(z3);
            if (z4 && z3) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m1045b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C1038a.f5744h);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: d */
    private boolean m1046d() {
        Spinner spinner = this.f1250d;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m1047e() {
        if (m1046d()) {
            return;
        }
        if (this.f1250d == null) {
            this.f1250d = m1045b();
        }
        removeView(this.f1249c);
        addView(this.f1250d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1250d.getAdapter() == null) {
            this.f1250d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1247a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1247a = null;
        }
        this.f1250d.setSelection(this.f1255i);
    }

    /* renamed from: f */
    private boolean m1048f() {
        if (!m1046d()) {
            return false;
        }
        removeView(this.f1250d);
        addView(this.f1249c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1250d.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void m1049a(int i4) {
        View childAt = this.f1249c.getChildAt(i4);
        Runnable runnable = this.f1247a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1247a = aVar;
        post(aVar);
    }

    /* renamed from: c */
    d m1050c(ActionBar.AbstractC0069b abstractC0069b, boolean z3) {
        d dVar = new d(getContext(), abstractC0069b, z3);
        if (z3) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1254h));
        } else {
            dVar.setFocusable(true);
            if (this.f1248b == null) {
                this.f1248b = new c();
            }
            dVar.setOnClickListener(this.f1248b);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1247a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2619a c2619aM8771b = C2619a.m8771b(getContext());
        setContentHeight(c2619aM8771b.m8776f());
        this.f1253g = c2619aM8771b.m8775e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1247a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
        ((d) view).m1052b().m127e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        boolean z3 = mode == 1073741824;
        setFillViewport(z3);
        int childCount = this.f1249c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1252f = -1;
        } else {
            if (childCount > 2) {
                this.f1252f = (int) (View.MeasureSpec.getSize(i4) * 0.4f);
            } else {
                this.f1252f = View.MeasureSpec.getSize(i4) / 2;
            }
            this.f1252f = Math.min(this.f1252f, this.f1253g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1254h, 1073741824);
        if (!z3 && this.f1251e) {
            this.f1249c.measure(0, iMakeMeasureSpec);
            if (this.f1249c.getMeasuredWidth() > View.MeasureSpec.getSize(i4)) {
                m1047e();
            } else {
                m1048f();
            }
        } else {
            m1048f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i4, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z3 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1255i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z3) {
        this.f1251e = z3;
    }

    public void setContentHeight(int i4) {
        this.f1254h = i4;
        requestLayout();
    }

    public void setTabSelected(int i4) {
        this.f1255i = i4;
        int childCount = this.f1249c.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.f1249c.getChildAt(i5);
            boolean z3 = i5 == i4;
            childAt.setSelected(z3);
            if (z3) {
                m1049a(i4);
            }
            i5++;
        }
        Spinner spinner = this.f1250d;
        if (spinner == null || i4 < 0) {
            return;
        }
        spinner.setSelection(i4);
    }
}
