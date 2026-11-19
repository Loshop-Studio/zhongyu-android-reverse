package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner;
import com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p016b0.RunnableC3059a;
import p018b2.C3101a;
import p018b2.C3102b;
import p026c2.C3217a;

/* loaded from: classes3.dex */
public abstract class BaseBanner<E, T extends BaseBanner<E, T>> extends RelativeLayout implements HasTypeface {

    /* renamed from: y */
    public static final /* synthetic */ int f4025y = 0;

    /* renamed from: a */
    public ScheduledExecutorService f4026a;

    /* renamed from: b */
    public Context f4027b;

    /* renamed from: c */
    public DisplayMetrics f4028c;

    /* renamed from: d */
    public ViewPager f4029d;

    /* renamed from: e */
    public List f4030e;

    /* renamed from: f */
    public int f4031f;

    /* renamed from: g */
    public int f4032g;

    /* renamed from: h */
    public long f4033h;

    /* renamed from: i */
    public long f4034i;

    /* renamed from: j */
    public boolean f4035j;

    /* renamed from: k */
    public boolean f4036k;

    /* renamed from: l */
    public int f4037l;

    /* renamed from: m */
    public Class f4038m;

    /* renamed from: n */
    public int f4039n;

    /* renamed from: o */
    public int f4040o;

    /* renamed from: p */
    public LinearLayout f4041p;

    /* renamed from: q */
    public boolean f4042q;

    /* renamed from: r */
    public LinearLayout f4043r;

    /* renamed from: s */
    public TextView f4044s;

    /* renamed from: t */
    public boolean f4045t;

    /* renamed from: u */
    public final boolean f4046u;

    /* renamed from: v */
    public float f4047v;

    /* renamed from: w */
    public final Handler f4048w;

    /* renamed from: x */
    public final C3102b f4049x;

    public BaseBanner(Context context) {
        super(context);
        this.f4030e = new ArrayList();
        this.f4037l = 450;
        this.f4045t = false;
        this.f4046u = true;
        this.f4048w = new Handler(new C3101a(this, 0));
        this.f4049x = new C3102b(this);
        m3454c(context, null);
    }

    /* renamed from: a */
    public final int m3452a(float f) {
        return (int) ((f * this.f4027b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public final void m3453b() {
        if (m3455d() && !this.f4036k) {
            if (!(this.f4029d instanceof LoopViewPager) || !this.f4035j) {
                this.f4036k = false;
                return;
            }
            m3456f();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.f4026a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC3059a(this, 2), this.f4033h, this.f4034i, TimeUnit.SECONDS);
            this.f4036k = true;
        }
    }

    /* renamed from: c */
    public final void m3454c(Context context, AttributeSet attributeSet) {
        this.f4027b = context;
        this.f4028c = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseBanner);
        this.f4047v = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseBanner_bb_scale, -1.0f);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isLoopEnable, true);
        this.f4033h = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_delay, 5);
        this.f4034i = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_period, 5);
        this.f4035j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isAutoScrollEnable, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_barColor, 0);
        this.f4042q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isBarShowWhenLast, true);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_indicatorGravity, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingLeft, m3452a(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingTop, m3452a(i == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingRight, m3452a(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingBottom, m3452a(i != 17 ? 2.0f : 6.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_textColor, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_textSize, this.f4027b.getResources().getDisplayMetrics().scaledDensity * 12.5f);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isTitleShow, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isIndicatorShow, true);
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        ViewPager loopViewPager = z8 ? new LoopViewPager(context) : new ViewPager(context);
        this.f4029d = loopViewPager;
        loopViewPager.setOverScrollMode(2);
        int i8 = this.f4028c.widthPixels;
        this.f4039n = i8;
        float f = this.f4047v;
        if (f >= 0.0f) {
            if (f > 1.0f) {
                this.f4047v = 1.0f;
            }
            this.f4040o = (int) (i8 * this.f4047v);
        } else if (attributeValue.equals("-1")) {
            this.f4040o = -1;
        } else if (attributeValue.equals("-2")) {
            this.f4040o = -2;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes2.recycle();
            this.f4040o = dimensionPixelSize;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f4039n, this.f4040o);
        addView(this.f4029d, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        addView(relativeLayout, layoutParams);
        this.f4041p = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f4039n, -2);
        layoutParams2.addRule(12, -1);
        relativeLayout.addView(this.f4041p, layoutParams2);
        this.f4041p.setBackgroundColor(color);
        this.f4041p.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.f4041p.setClipChildren(false);
        this.f4041p.setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4043r = linearLayout;
        linearLayout.setGravity(17);
        this.f4043r.setVisibility(z10 ? 0 : 4);
        this.f4043r.setClipChildren(false);
        this.f4043r.setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f4044s = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f4044s.setSingleLine(true);
        this.f4044s.setTextColor(color2);
        this.f4044s.setTextSize(0, dimension5);
        this.f4044s.setVisibility(z9 ? 0 : 4);
        if (i == 17) {
            this.f4041p.setGravity(17);
            this.f4041p.addView(this.f4043r);
            return;
        }
        if (i == 5) {
            this.f4041p.setGravity(16);
            this.f4041p.addView(this.f4044s);
            this.f4041p.addView(this.f4043r);
            this.f4044s.setPadding(0, 0, m3452a(7.0f), 0);
            this.f4044s.setEllipsize(TextUtils.TruncateAt.END);
            this.f4044s.setGravity(3);
            return;
        }
        if (i == 3) {
            this.f4041p.setGravity(16);
            this.f4041p.addView(this.f4043r);
            this.f4041p.addView(this.f4044s);
            this.f4044s.setPadding(m3452a(7.0f), 0, 0, 0);
            this.f4044s.setEllipsize(TextUtils.TruncateAt.END);
            this.f4044s.setGravity(5);
        }
    }

    /* renamed from: d */
    public final boolean m3455d() {
        List list;
        if (this.f4029d == null || (list = this.f4030e) == null || list.size() <= 0) {
            return false;
        }
        return this.f4046u || this.f4030e.size() != 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m3456f();
        } else if (action == 1 || action == 3) {
            m3453b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: f */
    public final void m3456f() {
        ScheduledExecutorService scheduledExecutorService = this.f4026a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f4026a = null;
        }
        this.f4036k = false;
    }

    /* renamed from: g */
    public final void m3457g() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            Context context = this.f4027b;
            int i = this.f4037l;
            C3217a c3217a = new C3217a(context, accelerateDecelerateInterpolator);
            c3217a.f1778a = i;
            declaredField.set(this.f4029d, c3217a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float getContainerScale() {
        return this.f4047v;
    }

    public int getItemHeight() {
        return this.f4040o;
    }

    public int getItemWidth() {
        return this.f4039n;
    }

    public ViewPager getViewPager() {
        return this.f4029d;
    }

    public abstract void setCurrentIndicator(int i);

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f4044s;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public BaseBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4030e = new ArrayList();
        this.f4037l = 450;
        this.f4045t = false;
        this.f4046u = true;
        this.f4048w = new Handler(new C3101a(this, 0));
        this.f4049x = new C3102b(this);
        m3454c(context, attributeSet);
    }

    public BaseBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4030e = new ArrayList();
        this.f4037l = 450;
        this.f4045t = false;
        this.f4046u = true;
        this.f4048w = new Handler(new C3101a(this, 0));
        this.f4049x = new C3102b(this);
        m3454c(context, attributeSet);
    }

    /* renamed from: e */
    public void mo3451e(int i) {
    }
}
