package p103o0;

import android.R;
import android.content.Context;
import android.content.res.Resources;
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
import com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p082k0.AbstractC3857c;
import p107p0.C4447a;

/* renamed from: o0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4420a extends RelativeLayout implements HasTypeface {

    /* renamed from: a */
    public ScheduledExecutorService f4981a;

    /* renamed from: b */
    public Context f4982b;

    /* renamed from: c */
    public DisplayMetrics f4983c;

    /* renamed from: d */
    public ViewPager f4984d;

    /* renamed from: e */
    public List f4985e;

    /* renamed from: f */
    public int f4986f;

    /* renamed from: g */
    public int f4987g;

    /* renamed from: h */
    public long f4988h;

    /* renamed from: i */
    public long f4989i;

    /* renamed from: j */
    public boolean f4990j;

    /* renamed from: k */
    public boolean f4991k;

    /* renamed from: l */
    public int f4992l;

    /* renamed from: m */
    public Class f4993m;

    /* renamed from: n */
    public int f4994n;

    /* renamed from: o */
    public int f4995o;

    /* renamed from: p */
    public LinearLayout f4996p;

    /* renamed from: q */
    public boolean f4997q;

    /* renamed from: r */
    public LinearLayout f4998r;

    /* renamed from: s */
    public TextView f4999s;

    /* renamed from: t */
    public boolean f5000t;

    /* renamed from: u */
    public boolean f5001u;

    /* renamed from: v */
    public float f5002v;

    /* renamed from: w */
    public Handler f5003w;

    /* renamed from: x */
    public ViewPager.OnPageChangeListener f5004x;

    /* renamed from: y */
    public ViewPager.OnPageChangeListener f5005y;

    /* renamed from: o0.a$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Resources.NotFoundException {
            AbstractC4420a abstractC4420a = AbstractC4420a.this;
            abstractC4420a.m5543r(abstractC4420a.f4986f);
            return true;
        }
    }

    /* renamed from: o0.a$b */
    public class b implements ViewPager.OnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            if (AbstractC4420a.this.f5005y != null) {
                AbstractC4420a.this.f5005y.onPageScrollStateChanged(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f4, int i5) {
            if (AbstractC4420a.this.f5005y != null) {
                AbstractC4420a.this.f5005y.onPageScrolled(i4, f4, i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            AbstractC4420a abstractC4420a = AbstractC4420a.this;
            abstractC4420a.f4986f = i4 % abstractC4420a.f4985e.size();
            AbstractC4420a abstractC4420a2 = AbstractC4420a.this;
            abstractC4420a2.setCurrentIndicator(abstractC4420a2.f4986f);
            AbstractC4420a abstractC4420a3 = AbstractC4420a.this;
            abstractC4420a3.m5541p(abstractC4420a3.f4999s, AbstractC4420a.this.f4986f);
            LinearLayout linearLayout = AbstractC4420a.this.f4996p;
            AbstractC4420a abstractC4420a4 = AbstractC4420a.this;
            linearLayout.setVisibility((abstractC4420a4.f4986f != abstractC4420a4.f4985e.size() + (-1) || AbstractC4420a.this.f4997q) ? 0 : 8);
            AbstractC4420a abstractC4420a5 = AbstractC4420a.this;
            abstractC4420a5.f4987g = abstractC4420a5.f4986f;
            if (abstractC4420a5.f5005y != null) {
                AbstractC4420a.this.f5005y.onPageSelected(i4);
            }
        }
    }

    /* renamed from: o0.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4420a.this.f5003w.obtainMessage().sendToTarget();
        }
    }

    /* renamed from: o0.a$d */
    public class d extends PagerAdapter {

        /* renamed from: o0.a$d$a */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ int f5010a;

            public a(int i4) {
                this.f5010a = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC4420a.m5531g(AbstractC4420a.this);
            }
        }

        public d() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List list = AbstractC4420a.this.f4985e;
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
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            View viewMo4190o = AbstractC4420a.this.mo4190o(i4);
            viewMo4190o.setOnClickListener(new a(i4));
            viewGroup.addView(viewMo4190o);
            return viewMo4190o;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public /* synthetic */ d(AbstractC4420a abstractC4420a, a aVar) {
            this();
        }
    }

    /* renamed from: o0.a$e */
    public interface e {
    }

    public AbstractC4420a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4985e = new ArrayList();
        this.f4992l = 450;
        this.f5000t = false;
        this.f5001u = true;
        this.f5003w = new Handler(new a());
        this.f5004x = new b();
        m5537k(context, attributeSet);
    }

    /* renamed from: g */
    public static /* synthetic */ e m5531g(AbstractC4420a abstractC4420a) {
        abstractC4420a.getClass();
        return null;
    }

    /* renamed from: A */
    public final void m5532A() {
        ScheduledExecutorService scheduledExecutorService = this.f4981a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f4981a = null;
        }
    }

    /* renamed from: B */
    public final void m5533B() {
        if (m5538l()) {
            ((LoopViewPager) this.f4984d).getPageAdapterWrapper().notifyDataSetChanged();
        } else if (this.f4984d.getAdapter() != null) {
            this.f4984d.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m5542q();
        } else if (action == 1 || action == 3) {
            m5536j();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getContainerScale() {
        return this.f5002v;
    }

    public int getItemHeight() {
        return this.f4995o;
    }

    public int getItemWidth() {
        return this.f4994n;
    }

    public ViewPager getViewPager() {
        return this.f4984d;
    }

    /* renamed from: h */
    public AbstractC4420a m5534h(float f4, float f5, float f6, float f7) {
        this.f4996p.setPadding(m5535i(f4), m5535i(f5), m5535i(f6), m5535i(f7));
        return this;
    }

    /* renamed from: i */
    public int m5535i(float f4) {
        return (int) ((f4 * this.f4982b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: j */
    public void m5536j() {
        if (m5539m() && !this.f4991k) {
            if (!m5538l() || !this.f4990j) {
                this.f4991k = false;
                return;
            }
            m5542q();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.f4981a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new c(), this.f4988h, this.f4989i, TimeUnit.SECONDS);
            this.f4991k = true;
            AbstractC3857c.m5159a(getClass().getSimpleName() + "--->goOnScroll()");
        }
    }

    /* renamed from: k */
    public final void m5537k(Context context, AttributeSet attributeSet) {
        this.f4982b = context;
        this.f4983c = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseBanner);
        this.f5002v = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseBanner_bb_scale, -1.0f);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isLoopEnable, true);
        this.f4988h = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_delay, 5);
        this.f4989i = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_period, 5);
        this.f4990j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isAutoScrollEnable, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_barColor, 0);
        this.f4997q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isBarShowWhenLast, true);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_indicatorGravity, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingLeft, m5535i(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingTop, m5535i(i4 == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingRight, m5535i(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingBottom, m5535i(i4 == 17 ? 6.0f : 2.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_textColor, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_textSize, m5550y(12.5f));
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isTitleShow, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isIndicatorShow, true);
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        ViewPager loopViewPager = z3 ? new LoopViewPager(context) : new ViewPager(context);
        this.f4984d = loopViewPager;
        loopViewPager.setOverScrollMode(2);
        int i5 = this.f4983c.widthPixels;
        this.f4994n = i5;
        float f4 = this.f5002v;
        if (f4 >= 0.0f) {
            if (f4 > 1.0f) {
                this.f5002v = 1.0f;
            }
            this.f4995o = (int) (i5 * this.f5002v);
        } else if (attributeValue.equals("-1")) {
            this.f4995o = -1;
        } else if (attributeValue.equals("-2")) {
            this.f4995o = -2;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes2.recycle();
            this.f4995o = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f4994n, this.f4995o);
        addView(this.f4984d, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        addView(relativeLayout, layoutParams);
        this.f4996p = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f4994n, -2);
        layoutParams2.addRule(12, -1);
        relativeLayout.addView(this.f4996p, layoutParams2);
        this.f4996p.setBackgroundColor(color);
        this.f4996p.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.f4996p.setClipChildren(false);
        this.f4996p.setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4998r = linearLayout;
        linearLayout.setGravity(17);
        this.f4998r.setVisibility(z5 ? 0 : 4);
        this.f4998r.setClipChildren(false);
        this.f4998r.setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f4999s = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f4999s.setSingleLine(true);
        this.f4999s.setTextColor(color2);
        this.f4999s.setTextSize(0, dimension5);
        this.f4999s.setVisibility(z4 ? 0 : 4);
        if (i4 == 17) {
            this.f4996p.setGravity(17);
            this.f4996p.addView(this.f4998r);
            return;
        }
        if (i4 == 5) {
            this.f4996p.setGravity(16);
            this.f4996p.addView(this.f4999s);
            this.f4996p.addView(this.f4998r);
            this.f4999s.setPadding(0, 0, m5535i(7.0f), 0);
            this.f4999s.setEllipsize(TextUtils.TruncateAt.END);
            this.f4999s.setGravity(3);
            return;
        }
        if (i4 == 3) {
            this.f4996p.setGravity(16);
            this.f4996p.addView(this.f4998r);
            this.f4996p.addView(this.f4999s);
            this.f4999s.setPadding(m5535i(7.0f), 0, 0, 0);
            this.f4999s.setEllipsize(TextUtils.TruncateAt.END);
            this.f4999s.setGravity(5);
        }
    }

    /* renamed from: l */
    public boolean m5538l() {
        return this.f4984d instanceof LoopViewPager;
    }

    /* renamed from: m */
    public boolean m5539m() {
        if (this.f4984d == null) {
            AbstractC3857c.m5161c("ViewPager is not exist!");
            return false;
        }
        List list = this.f4985e;
        if (list != null && list.size() > 0) {
            return this.f5001u || this.f4985e.size() != 1;
        }
        AbstractC3857c.m5161c("DataList must be not empty!");
        return false;
    }

    /* renamed from: n */
    public abstract View mo5540n();

    /* renamed from: o */
    public abstract View mo4190o(int i4);

    /* renamed from: p */
    public void m5541p(TextView textView, int i4) {
    }

    /* renamed from: q */
    public void m5542q() {
        m5532A();
        AbstractC3857c.m5159a(getClass().getSimpleName() + "--->pauseScroll()");
        this.f4991k = false;
    }

    /* renamed from: r */
    public final void m5543r(int i4) throws Resources.NotFoundException {
        if (m5539m()) {
            if (this.f5000t) {
                m5533B();
            }
            this.f4984d.setCurrentItem(i4 + 1);
        }
    }

    /* renamed from: s */
    public AbstractC4420a m5544s(boolean z3) {
        this.f4990j = z3;
        return this;
    }

    public abstract void setCurrentIndicator(int i4);

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f4999s;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public AbstractC4420a m5545t(boolean z3) {
        this.f4997q = z3;
        return this;
    }

    /* renamed from: u */
    public final void m5546u() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f4984d, new C4447a(this.f4982b, new AccelerateDecelerateInterpolator(), this.f4992l));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: v */
    public AbstractC4420a m5547v(List list) {
        this.f4985e = list;
        this.f5000t = true;
        return this;
    }

    /* renamed from: w */
    public AbstractC4420a m5548w(Class cls) {
        this.f4993m = cls;
        return this;
    }

    /* renamed from: x */
    public final void m5549x() throws Resources.NotFoundException {
        this.f4984d.setAdapter(new d(this, null));
        this.f4984d.setOffscreenPageLimit(this.f4985e.size() - 1);
        try {
            Class cls = this.f4993m;
            if (cls != null) {
                this.f4984d.setPageTransformer(true, (ViewPager.PageTransformer) cls.newInstance());
                if (m5538l()) {
                    this.f4992l = 550;
                    m5546u();
                }
            } else if (m5538l()) {
                this.f4992l = 450;
                m5546u();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f5004x;
        if (onPageChangeListener != null) {
            this.f4984d.removeOnPageChangeListener(onPageChangeListener);
        }
        this.f4984d.addOnPageChangeListener(this.f5004x);
    }

    /* renamed from: y */
    public final float m5550y(float f4) {
        return f4 * this.f4982b.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: z */
    public void m5551z() throws Resources.NotFoundException {
        List list = this.f4985e;
        if (list == null) {
            throw new IllegalStateException("Data source is empty,you must setSource() before startScroll()");
        }
        if (list.size() > 0 && this.f4986f > this.f4985e.size() - 1) {
            this.f4986f = 0;
        }
        m5541p(this.f4999s, this.f4986f);
        m5549x();
        View viewMo5540n = mo5540n();
        if (viewMo5540n != null) {
            this.f4998r.removeAllViews();
            this.f4998r.addView(viewMo5540n);
        }
        m5536j();
    }
}
