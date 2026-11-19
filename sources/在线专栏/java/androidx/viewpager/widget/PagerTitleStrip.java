package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.C0377k;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.InterfaceC0775e
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: o */
    private static final int[] f4625o = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: p */
    private static final int[] f4626p = {R.attr.textAllCaps};

    /* renamed from: a */
    ViewPager f4627a;

    /* renamed from: b */
    TextView f4628b;

    /* renamed from: c */
    TextView f4629c;

    /* renamed from: d */
    TextView f4630d;

    /* renamed from: e */
    private int f4631e;

    /* renamed from: f */
    float f4632f;

    /* renamed from: g */
    private int f4633g;

    /* renamed from: h */
    private int f4634h;

    /* renamed from: i */
    private boolean f4635i;

    /* renamed from: j */
    private boolean f4636j;

    /* renamed from: k */
    private final C0768a f4637k;

    /* renamed from: l */
    private WeakReference<AbstractC0783a> f4638l;

    /* renamed from: m */
    private int f4639m;

    /* renamed from: n */
    int f4640n;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    private class C0768a extends DataSetObserver implements ViewPager.InterfaceC0779i, ViewPager.InterfaceC0778h {

        /* renamed from: a */
        private int f4641a;

        C0768a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0778h
        public void onAdapterChanged(ViewPager viewPager, AbstractC0783a abstractC0783a, AbstractC0783a abstractC0783a2) {
            PagerTitleStrip.this.m4038b(abstractC0783a, abstractC0783a2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.m4039c(pagerTitleStrip.f4627a.getCurrentItem(), PagerTitleStrip.this.f4627a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f4 = pagerTitleStrip2.f4632f;
            if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
                f4 = IGoodView.DEFAULT_TO_ALPHA;
            }
            pagerTitleStrip2.mo4036d(pagerTitleStrip2.f4627a.getCurrentItem(), f4, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageScrollStateChanged(int i4) {
            this.f4641a = i4;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageScrolled(int i4, float f4, int i5) {
            if (f4 > 0.5f) {
                i4++;
            }
            PagerTitleStrip.this.mo4036d(i4, f4, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageSelected(int i4) {
            if (this.f4641a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.m4039c(pagerTitleStrip.f4627a.getCurrentItem(), PagerTitleStrip.this.f4627a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f4 = pagerTitleStrip2.f4632f;
                if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
                    f4 = IGoodView.DEFAULT_TO_ALPHA;
                }
                pagerTitleStrip2.mo4036d(pagerTitleStrip2.f4627a.getCurrentItem(), f4, true);
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    private static class C0769b extends SingleLineTransformationMethod {

        /* renamed from: a */
        private Locale f4643a;

        C0769b(Context context) {
            this.f4643a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f4643a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f4631e = -1;
        this.f4632f = -1.0f;
        this.f4637k = new C0768a();
        TextView textView = new TextView(context);
        this.f4628b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f4629c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f4630d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4625o);
        boolean z3 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C0377k.m2201o(this.f4628b, resourceId);
            C0377k.m2201o(this.f4629c, resourceId);
            C0377k.m2201o(this.f4630d, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            m4037a(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f4628b.setTextColor(color);
            this.f4629c.setTextColor(color);
            this.f4630d.setTextColor(color);
        }
        this.f4634h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f4640n = this.f4629c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f4628b.setEllipsize(TextUtils.TruncateAt.END);
        this.f4629c.setEllipsize(TextUtils.TruncateAt.END);
        this.f4630d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f4626p);
            z3 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z3) {
            setSingleLineAllCaps(this.f4628b);
            setSingleLineAllCaps(this.f4629c);
            setSingleLineAllCaps(this.f4630d);
        } else {
            this.f4628b.setSingleLine();
            this.f4629c.setSingleLine();
            this.f4630d.setSingleLine();
        }
        this.f4633g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C0769b(textView.getContext()));
    }

    /* renamed from: a */
    public void m4037a(int i4, float f4) {
        this.f4628b.setTextSize(i4, f4);
        this.f4629c.setTextSize(i4, f4);
        this.f4630d.setTextSize(i4, f4);
    }

    /* renamed from: b */
    void m4038b(AbstractC0783a abstractC0783a, AbstractC0783a abstractC0783a2) {
        if (abstractC0783a != null) {
            abstractC0783a.unregisterDataSetObserver(this.f4637k);
            this.f4638l = null;
        }
        if (abstractC0783a2 != null) {
            abstractC0783a2.registerDataSetObserver(this.f4637k);
            this.f4638l = new WeakReference<>(abstractC0783a2);
        }
        ViewPager viewPager = this.f4627a;
        if (viewPager != null) {
            this.f4631e = -1;
            this.f4632f = -1.0f;
            m4039c(viewPager.getCurrentItem(), abstractC0783a2);
            requestLayout();
        }
    }

    /* renamed from: c */
    void m4039c(int i4, AbstractC0783a abstractC0783a) {
        int count = abstractC0783a != null ? abstractC0783a.getCount() : 0;
        this.f4635i = true;
        CharSequence pageTitle = null;
        this.f4628b.setText((i4 < 1 || abstractC0783a == null) ? null : abstractC0783a.getPageTitle(i4 - 1));
        this.f4629c.setText((abstractC0783a == null || i4 >= count) ? null : abstractC0783a.getPageTitle(i4));
        int i5 = i4 + 1;
        if (i5 < count && abstractC0783a != null) {
            pageTitle = abstractC0783a.getPageTitle(i5);
        }
        this.f4630d.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f4628b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f4629c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f4630d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f4631e = i4;
        if (!this.f4636j) {
            mo4036d(i4, this.f4632f, false);
        }
        this.f4635i = false;
    }

    /* renamed from: d */
    void mo4036d(int i4, float f4, boolean z3) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (i4 != this.f4631e) {
            m4039c(i4, this.f4627a.getAdapter());
        } else if (!z3 && f4 == this.f4632f) {
            return;
        }
        this.f4636j = true;
        int measuredWidth = this.f4628b.getMeasuredWidth();
        int measuredWidth2 = this.f4629c.getMeasuredWidth();
        int measuredWidth3 = this.f4630d.getMeasuredWidth();
        int i9 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i10 = paddingRight + i9;
        int i11 = (width - (paddingLeft + i9)) - i10;
        float f5 = 0.5f + f4;
        if (f5 > 1.0f) {
            f5 -= 1.0f;
        }
        int i12 = ((width - i10) - ((int) (i11 * f5))) - i9;
        int i13 = measuredWidth2 + i12;
        int baseline = this.f4628b.getBaseline();
        int baseline2 = this.f4629c.getBaseline();
        int baseline3 = this.f4630d.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i14 = iMax - baseline;
        int i15 = iMax - baseline2;
        int i16 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f4628b.getMeasuredHeight() + i14, this.f4629c.getMeasuredHeight() + i15), this.f4630d.getMeasuredHeight() + i16);
        int i17 = this.f4634h & 112;
        if (i17 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i17 != 80) {
                i6 = i14 + paddingTop;
                i7 = i15 + paddingTop;
                i8 = paddingTop + i16;
                TextView textView = this.f4629c;
                textView.layout(i12, i7, i13, textView.getMeasuredHeight() + i7);
                int iMin = Math.min(paddingLeft, (i12 - this.f4633g) - measuredWidth);
                TextView textView2 = this.f4628b;
                textView2.layout(iMin, i6, measuredWidth + iMin, textView2.getMeasuredHeight() + i6);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i13 + this.f4633g);
                TextView textView3 = this.f4630d;
                textView3.layout(iMax3, i8, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i8);
                this.f4632f = f4;
                this.f4636j = false;
            }
            i5 = (height - paddingBottom) - iMax2;
        }
        i6 = i14 + i5;
        i7 = i15 + i5;
        i8 = i5 + i16;
        TextView textView4 = this.f4629c;
        textView4.layout(i12, i7, i13, textView4.getMeasuredHeight() + i7);
        int iMin2 = Math.min(paddingLeft, (i12 - this.f4633g) - measuredWidth);
        TextView textView22 = this.f4628b;
        textView22.layout(iMin2, i6, measuredWidth + iMin2, textView22.getMeasuredHeight() + i6);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i13 + this.f4633g);
        TextView textView32 = this.f4630d;
        textView32.layout(iMax32, i8, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i8);
        this.f4632f = f4;
        this.f4636j = false;
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f4633g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        AbstractC0783a adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.f4637k);
        viewPager.addOnAdapterChangeListener(this.f4637k);
        this.f4627a = viewPager;
        WeakReference<AbstractC0783a> weakReference = this.f4638l;
        m4038b(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f4627a;
        if (viewPager != null) {
            m4038b(viewPager.getAdapter(), null);
            this.f4627a.setInternalPageChangeListener(null);
            this.f4627a.removeOnAdapterChangeListener(this.f4637k);
            this.f4627a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (this.f4627a != null) {
            float f4 = this.f4632f;
            if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
                f4 = IGoodView.DEFAULT_TO_ALPHA;
            }
            mo4036d(this.f4631e, f4, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int iMax;
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i4);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, (int) (size * 0.2f), -2);
        this.f4628b.measure(childMeasureSpec2, childMeasureSpec);
        this.f4629c.measure(childMeasureSpec2, childMeasureSpec);
        this.f4630d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i5) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i5);
        } else {
            iMax = Math.max(getMinHeight(), this.f4629c.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i5, this.f4629c.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4635i) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i4) {
        this.f4634h = i4;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f4) {
        int i4 = ((int) (f4 * 255.0f)) & 255;
        this.f4639m = i4;
        int i5 = (i4 << 24) | (this.f4640n & 16777215);
        this.f4628b.setTextColor(i5);
        this.f4630d.setTextColor(i5);
    }

    public void setTextColor(int i4) {
        this.f4640n = i4;
        this.f4629c.setTextColor(i4);
        int i5 = (this.f4639m << 24) | (this.f4640n & 16777215);
        this.f4628b.setTextColor(i5);
        this.f4630d.setTextColor(i5);
    }

    public void setTextSpacing(int i4) {
        this.f4633g = i4;
        requestLayout();
    }
}
