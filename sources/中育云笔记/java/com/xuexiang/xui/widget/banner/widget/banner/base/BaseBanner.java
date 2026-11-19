package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
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
import p034b8.AbstractC5175c;
import p147f8.C9205a;

/* loaded from: classes5.dex */
public abstract class BaseBanner<E, T extends BaseBanner<E, T>> extends RelativeLayout implements HasTypeface {

    /* renamed from: A */
    public ViewPager.OnPageChangeListener f15474A;

    /* renamed from: c */
    public ScheduledExecutorService f15475c;

    /* renamed from: d */
    public Context f15476d;

    /* renamed from: e */
    public DisplayMetrics f15477e;

    /* renamed from: f */
    public ViewPager f15478f;

    /* renamed from: g */
    public List f15479g;

    /* renamed from: h */
    public int f15480h;

    /* renamed from: i */
    public int f15481i;

    /* renamed from: j */
    public long f15482j;

    /* renamed from: k */
    public long f15483k;

    /* renamed from: l */
    public boolean f15484l;

    /* renamed from: m */
    public boolean f15485m;

    /* renamed from: n */
    public int f15486n;

    /* renamed from: o */
    public Class f15487o;

    /* renamed from: p */
    public int f15488p;

    /* renamed from: q */
    public int f15489q;

    /* renamed from: r */
    public LinearLayout f15490r;

    /* renamed from: s */
    public boolean f15491s;

    /* renamed from: t */
    public LinearLayout f15492t;

    /* renamed from: u */
    public TextView f15493u;

    /* renamed from: v */
    public boolean f15494v;

    /* renamed from: w */
    public boolean f15495w;

    /* renamed from: x */
    public float f15496x;

    /* renamed from: y */
    public Handler f15497y;

    /* renamed from: z */
    public ViewPager.OnPageChangeListener f15498z;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner$a */
    public class C8062a implements Handler.Callback {
        public C8062a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            BaseBanner baseBanner = BaseBanner.this;
            baseBanner.m12394s(baseBanner.f15480h);
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner$b */
    public class C8063b implements ViewPager.OnPageChangeListener {
        public C8063b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            if (BaseBanner.this.f15474A != null) {
                BaseBanner.this.f15474A.onPageScrollStateChanged(i10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            if (BaseBanner.this.f15474A != null) {
                BaseBanner.this.f15474A.onPageScrolled(i10, f10, i11);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            BaseBanner baseBanner = BaseBanner.this;
            baseBanner.f15480h = i10 % baseBanner.f15479g.size();
            BaseBanner baseBanner2 = BaseBanner.this;
            baseBanner2.setCurrentIndicator(baseBanner2.f15480h);
            BaseBanner baseBanner3 = BaseBanner.this;
            baseBanner3.mo12373q(baseBanner3.f15493u, BaseBanner.this.f15480h);
            LinearLayout linearLayout = BaseBanner.this.f15490r;
            BaseBanner baseBanner4 = BaseBanner.this;
            linearLayout.setVisibility((baseBanner4.f15480h != baseBanner4.f15479g.size() + (-1) || BaseBanner.this.f15491s) ? 0 : 8);
            BaseBanner baseBanner5 = BaseBanner.this;
            baseBanner5.f15481i = baseBanner5.f15480h;
            if (baseBanner5.f15474A != null) {
                BaseBanner.this.f15474A.onPageSelected(i10);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner$c */
    public class RunnableC8064c implements Runnable {
        public RunnableC8064c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseBanner.this.f15497y.obtainMessage().sendToTarget();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner$d */
    public class C8065d extends PagerAdapter {

        /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner$d$a */
        public class a implements View.OnClickListener {

            /* renamed from: c */
            public final /* synthetic */ int f15503c;

            public a(int i10) {
                this.f15503c = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseBanner.m12381g(BaseBanner.this);
            }
        }

        public C8065d() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List list = BaseBanner.this.f15479g;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i10) {
            View viewMo12372p = BaseBanner.this.mo12372p(i10);
            viewMo12372p.setOnClickListener(new a(i10));
            viewGroup.addView(viewMo12372p);
            return viewMo12372p;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public /* synthetic */ C8065d(BaseBanner baseBanner, C8062a c8062a) {
            this();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner$e */
    public interface InterfaceC8066e {
    }

    public BaseBanner(Context context) {
        super(context);
        this.f15479g = new ArrayList();
        this.f15486n = 450;
        this.f15494v = false;
        this.f15495w = true;
        this.f15497y = new Handler(new C8062a());
        this.f15498z = new C8063b();
        m12382l(context, null);
    }

    /* renamed from: C */
    private void m12374C() {
        ScheduledExecutorService scheduledExecutorService = this.f15475c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f15475c = null;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC8066e m12381g(BaseBanner baseBanner) {
        baseBanner.getClass();
        return null;
    }

    /* renamed from: l */
    private void m12382l(Context context, AttributeSet attributeSet) {
        this.f15476d = context;
        this.f15477e = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseBanner);
        this.f15496x = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseBanner_bb_scale, -1.0f);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isLoopEnable, true);
        this.f15482j = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_delay, 5);
        this.f15483k = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_period, 5);
        this.f15484l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isAutoScrollEnable, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_barColor, 0);
        this.f15491s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isBarShowWhenLast, true);
        int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_indicatorGravity, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingLeft, m12387i(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingTop, m12387i(i10 == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingRight, m12387i(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingBottom, m12387i(i10 != 17 ? 2.0f : 6.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_textColor, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_textSize, m12383A(12.5f));
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isTitleShow, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isIndicatorShow, true);
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        ViewPager loopViewPager = z10 ? new LoopViewPager(context) : new ViewPager(context);
        this.f15478f = loopViewPager;
        loopViewPager.setOverScrollMode(2);
        int i11 = this.f15477e.widthPixels;
        this.f15488p = i11;
        float f10 = this.f15496x;
        if (f10 >= 0.0f) {
            if (f10 > 1.0f) {
                this.f15496x = 1.0f;
            }
            this.f15489q = (int) (i11 * this.f15496x);
        } else if (attributeValue.equals("-1")) {
            this.f15489q = -1;
        } else if (attributeValue.equals("-2")) {
            this.f15489q = -2;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes2.recycle();
            this.f15489q = dimensionPixelSize;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f15488p, this.f15489q);
        addView(this.f15478f, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        addView(relativeLayout, layoutParams);
        this.f15490r = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f15488p, -2);
        layoutParams2.addRule(12, -1);
        relativeLayout.addView(this.f15490r, layoutParams2);
        this.f15490r.setBackgroundColor(color);
        this.f15490r.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.f15490r.setClipChildren(false);
        this.f15490r.setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f15492t = linearLayout;
        linearLayout.setGravity(17);
        this.f15492t.setVisibility(z12 ? 0 : 4);
        this.f15492t.setClipChildren(false);
        this.f15492t.setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f15493u = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f15493u.setSingleLine(true);
        this.f15493u.setTextColor(color2);
        this.f15493u.setTextSize(0, dimension5);
        this.f15493u.setVisibility(z11 ? 0 : 4);
        if (i10 == 17) {
            this.f15490r.setGravity(17);
            this.f15490r.addView(this.f15492t);
            return;
        }
        if (i10 == 5) {
            this.f15490r.setGravity(16);
            this.f15490r.addView(this.f15493u);
            this.f15490r.addView(this.f15492t);
            this.f15493u.setPadding(0, 0, m12387i(7.0f), 0);
            this.f15493u.setEllipsize(TextUtils.TruncateAt.END);
            this.f15493u.setGravity(3);
            return;
        }
        if (i10 == 3) {
            this.f15490r.setGravity(16);
            this.f15490r.addView(this.f15492t);
            this.f15490r.addView(this.f15493u);
            this.f15493u.setPadding(m12387i(7.0f), 0, 0, 0);
            this.f15493u.setEllipsize(TextUtils.TruncateAt.END);
            this.f15493u.setGravity(5);
        }
    }

    /* renamed from: A */
    public final float m12383A(float f10) {
        return f10 * this.f15476d.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: B */
    public void m12384B() {
        List list = this.f15479g;
        if (list == null) {
            throw new IllegalStateException("Data source is empty,you must setSource() before startScroll()");
        }
        if (list.size() > 0 && this.f15480h > this.f15479g.size() - 1) {
            this.f15480h = 0;
        }
        mo12373q(this.f15493u, this.f15480h);
        m12400y();
        View viewMo12392o = mo12392o();
        if (viewMo12392o != null) {
            this.f15492t.removeAllViews();
            this.f15492t.addView(viewMo12392o);
        }
        m12389k();
    }

    /* renamed from: D */
    public final void m12385D() {
        if (m12390m()) {
            ((LoopViewPager) this.f15478f).getPageAdapterWrapper().notifyDataSetChanged();
        } else if (this.f15478f.getAdapter() != null) {
            this.f15478f.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m12393r();
        } else if (action == 1 || action == 3) {
            m12389k();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getContainerScale() {
        return this.f15496x;
    }

    public int getItemHeight() {
        return this.f15489q;
    }

    public int getItemWidth() {
        return this.f15488p;
    }

    public ViewPager getViewPager() {
        return this.f15478f;
    }

    /* renamed from: h */
    public BaseBanner m12386h(float f10, float f11, float f12, float f13) {
        this.f15490r.setPadding(m12387i(f10), m12387i(f11), m12387i(f12), m12387i(f13));
        return this;
    }

    /* renamed from: i */
    public int m12387i(float f10) {
        return (int) ((f10 * this.f15476d.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: j */
    public Object m12388j(int i10) {
        if (m12401z() > 0) {
            return this.f15479g.get(i10);
        }
        return null;
    }

    /* renamed from: k */
    public void m12389k() {
        if (m12391n() && !this.f15485m) {
            if (!m12390m() || !this.f15484l) {
                this.f15485m = false;
                return;
            }
            m12393r();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.f15475c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC8064c(), this.f15482j, this.f15483k, TimeUnit.SECONDS);
            this.f15485m = true;
            AbstractC5175c.m2707a(getClass().getSimpleName() + "--->goOnScroll()");
        }
    }

    /* renamed from: m */
    public boolean m12390m() {
        return this.f15478f instanceof LoopViewPager;
    }

    /* renamed from: n */
    public boolean m12391n() {
        if (this.f15478f == null) {
            AbstractC5175c.m2709c("ViewPager is not exist!");
            return false;
        }
        List list = this.f15479g;
        if (list != null && list.size() > 0) {
            return this.f15495w || this.f15479g.size() != 1;
        }
        AbstractC5175c.m2709c("DataList must be not empty!");
        return false;
    }

    /* renamed from: o */
    public abstract View mo12392o();

    /* renamed from: p */
    public abstract View mo12372p(int i10);

    /* renamed from: q */
    public void mo12373q(TextView textView, int i10) {
    }

    /* renamed from: r */
    public void m12393r() {
        m12374C();
        AbstractC5175c.m2707a(getClass().getSimpleName() + "--->pauseScroll()");
        this.f15485m = false;
    }

    /* renamed from: s */
    public final void m12394s(int i10) {
        if (m12391n()) {
            if (this.f15494v) {
                m12385D();
            }
            this.f15478f.setCurrentItem(i10 + 1);
        }
    }

    public abstract void setCurrentIndicator(int i10);

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f15493u;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public BaseBanner m12395t(boolean z10) {
        this.f15484l = z10;
        return this;
    }

    /* renamed from: u */
    public BaseBanner m12396u(boolean z10) {
        this.f15491s = z10;
        return this;
    }

    /* renamed from: v */
    public final void m12397v() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f15478f, new C9205a(this.f15476d, new AccelerateDecelerateInterpolator(), this.f15486n));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: w */
    public BaseBanner m12398w(List list) {
        this.f15479g = list;
        this.f15494v = true;
        return this;
    }

    /* renamed from: x */
    public BaseBanner m12399x(Class cls) {
        this.f15487o = cls;
        return this;
    }

    /* renamed from: y */
    public final void m12400y() {
        this.f15478f.setAdapter(new C8065d(this, null));
        this.f15478f.setOffscreenPageLimit(this.f15479g.size() - 1);
        try {
            Class cls = this.f15487o;
            if (cls != null) {
                this.f15478f.setPageTransformer(true, (ViewPager.PageTransformer) cls.newInstance());
                if (m12390m()) {
                    this.f15486n = 550;
                    m12397v();
                }
            } else if (m12390m()) {
                this.f15486n = 450;
                m12397v();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f15498z;
        if (onPageChangeListener != null) {
            this.f15478f.removeOnPageChangeListener(onPageChangeListener);
        }
        this.f15478f.addOnPageChangeListener(this.f15498z);
    }

    /* renamed from: z */
    public int m12401z() {
        List list = this.f15479g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public BaseBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15479g = new ArrayList();
        this.f15486n = 450;
        this.f15494v = false;
        this.f15495w = true;
        this.f15497y = new Handler(new C8062a());
        this.f15498z = new C8063b();
        m12382l(context, attributeSet);
    }

    public BaseBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15479g = new ArrayList();
        this.f15486n = 450;
        this.f15494v = false;
        this.f15495w = true;
        this.f15497y = new Handler(new C8062a());
        this.f15498z = new C8063b();
        m12382l(context, attributeSet);
    }
}
