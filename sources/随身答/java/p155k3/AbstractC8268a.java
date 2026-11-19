package p155k3;

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
import p104f3.AbstractC7919c;
import p167l3.C8883a;

/* renamed from: k3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8268a extends RelativeLayout implements HasTypeface {

    /* renamed from: a */
    public ScheduledExecutorService f14380a;

    /* renamed from: b */
    public Context f14381b;

    /* renamed from: c */
    public DisplayMetrics f14382c;

    /* renamed from: d */
    public ViewPager f14383d;

    /* renamed from: e */
    public List f14384e;

    /* renamed from: f */
    public int f14385f;

    /* renamed from: g */
    public int f14386g;

    /* renamed from: h */
    public long f14387h;

    /* renamed from: i */
    public long f14388i;

    /* renamed from: j */
    public boolean f14389j;

    /* renamed from: k */
    public boolean f14390k;

    /* renamed from: l */
    public int f14391l;

    /* renamed from: m */
    public Class f14392m;

    /* renamed from: n */
    public int f14393n;

    /* renamed from: o */
    public int f14394o;

    /* renamed from: p */
    public LinearLayout f14395p;

    /* renamed from: q */
    public boolean f14396q;

    /* renamed from: r */
    public LinearLayout f14397r;

    /* renamed from: s */
    public TextView f14398s;

    /* renamed from: t */
    public boolean f14399t;

    /* renamed from: u */
    public boolean f14400u;

    /* renamed from: v */
    public float f14401v;

    /* renamed from: w */
    public Handler f14402w;

    /* renamed from: x */
    public ViewPager.OnPageChangeListener f14403x;

    /* renamed from: y */
    public ViewPager.OnPageChangeListener f14404y;

    /* renamed from: k3.a$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Resources.NotFoundException {
            AbstractC8268a abstractC8268a = AbstractC8268a.this;
            abstractC8268a.m13356r(abstractC8268a.f14385f);
            return true;
        }
    }

    /* renamed from: k3.a$b */
    public class b implements ViewPager.OnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i9) {
            if (AbstractC8268a.this.f14404y != null) {
                AbstractC8268a.this.f14404y.onPageScrollStateChanged(i9);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i9, float f10, int i10) {
            if (AbstractC8268a.this.f14404y != null) {
                AbstractC8268a.this.f14404y.onPageScrolled(i9, f10, i10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i9) {
            AbstractC8268a abstractC8268a = AbstractC8268a.this;
            abstractC8268a.f14385f = i9 % abstractC8268a.f14384e.size();
            AbstractC8268a abstractC8268a2 = AbstractC8268a.this;
            abstractC8268a2.setCurrentIndicator(abstractC8268a2.f14385f);
            AbstractC8268a abstractC8268a3 = AbstractC8268a.this;
            abstractC8268a3.m13354p(abstractC8268a3.f14398s, AbstractC8268a.this.f14385f);
            LinearLayout linearLayout = AbstractC8268a.this.f14395p;
            AbstractC8268a abstractC8268a4 = AbstractC8268a.this;
            linearLayout.setVisibility((abstractC8268a4.f14385f != abstractC8268a4.f14384e.size() + (-1) || AbstractC8268a.this.f14396q) ? 0 : 8);
            AbstractC8268a abstractC8268a5 = AbstractC8268a.this;
            abstractC8268a5.f14386g = abstractC8268a5.f14385f;
            if (abstractC8268a5.f14404y != null) {
                AbstractC8268a.this.f14404y.onPageSelected(i9);
            }
        }
    }

    /* renamed from: k3.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8268a.this.f14402w.obtainMessage().sendToTarget();
        }
    }

    /* renamed from: k3.a$d */
    public class d extends PagerAdapter {

        /* renamed from: k3.a$d$a */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ int f14409a;

            public a(int i9) {
                this.f14409a = i9;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC8268a.m13345g(AbstractC8268a.this);
            }
        }

        public d() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i9, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List list = AbstractC8268a.this.f14384e;
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
        public Object instantiateItem(ViewGroup viewGroup, int i9) {
            View viewMo6600o = AbstractC8268a.this.mo6600o(i9);
            viewMo6600o.setOnClickListener(new a(i9));
            viewGroup.addView(viewMo6600o);
            return viewMo6600o;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public /* synthetic */ d(AbstractC8268a abstractC8268a, a aVar) {
            this();
        }
    }

    /* renamed from: k3.a$e */
    public interface e {
    }

    public AbstractC8268a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14384e = new ArrayList();
        this.f14391l = 450;
        this.f14399t = false;
        this.f14400u = true;
        this.f14402w = new Handler(new a());
        this.f14403x = new b();
        m13346k(context, attributeSet);
    }

    /* renamed from: A */
    private void m13338A() {
        ScheduledExecutorService scheduledExecutorService = this.f14380a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f14380a = null;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ e m13345g(AbstractC8268a abstractC8268a) {
        abstractC8268a.getClass();
        return null;
    }

    /* renamed from: k */
    private void m13346k(Context context, AttributeSet attributeSet) {
        this.f14381b = context;
        this.f14382c = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseBanner);
        this.f14401v = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseBanner_bb_scale, -1.0f);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isLoopEnable, true);
        this.f14387h = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_delay, 5);
        this.f14388i = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_period, 5);
        this.f14389j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isAutoScrollEnable, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_barColor, 0);
        this.f14396q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isBarShowWhenLast, true);
        int i9 = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_indicatorGravity, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingLeft, m13349i(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingTop, m13349i(i9 == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingRight, m13349i(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingBottom, m13349i(i9 != 17 ? 2.0f : 6.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_textColor, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_textSize, m13363y(12.5f));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isTitleShow, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isIndicatorShow, true);
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        ViewPager loopViewPager = z9 ? new LoopViewPager(context) : new ViewPager(context);
        this.f14383d = loopViewPager;
        loopViewPager.setOverScrollMode(2);
        int i10 = this.f14382c.widthPixels;
        this.f14393n = i10;
        float f10 = this.f14401v;
        if (f10 >= 0.0f) {
            if (f10 > 1.0f) {
                this.f14401v = 1.0f;
            }
            this.f14394o = (int) (i10 * this.f14401v);
        } else if (attributeValue.equals("-1")) {
            this.f14394o = -1;
        } else if (attributeValue.equals("-2")) {
            this.f14394o = -2;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes2.recycle();
            this.f14394o = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f14393n, this.f14394o);
        addView(this.f14383d, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        addView(relativeLayout, layoutParams);
        this.f14395p = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f14393n, -2);
        layoutParams2.addRule(12, -1);
        relativeLayout.addView(this.f14395p, layoutParams2);
        this.f14395p.setBackgroundColor(color);
        this.f14395p.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.f14395p.setClipChildren(false);
        this.f14395p.setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f14397r = linearLayout;
        linearLayout.setGravity(17);
        this.f14397r.setVisibility(z11 ? 0 : 4);
        this.f14397r.setClipChildren(false);
        this.f14397r.setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f14398s = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f14398s.setSingleLine(true);
        this.f14398s.setTextColor(color2);
        this.f14398s.setTextSize(0, dimension5);
        this.f14398s.setVisibility(z10 ? 0 : 4);
        if (i9 == 17) {
            this.f14395p.setGravity(17);
            this.f14395p.addView(this.f14397r);
            return;
        }
        if (i9 == 5) {
            this.f14395p.setGravity(16);
            this.f14395p.addView(this.f14398s);
            this.f14395p.addView(this.f14397r);
            this.f14398s.setPadding(0, 0, m13349i(7.0f), 0);
            this.f14398s.setEllipsize(TextUtils.TruncateAt.END);
            this.f14398s.setGravity(3);
            return;
        }
        if (i9 == 3) {
            this.f14395p.setGravity(16);
            this.f14395p.addView(this.f14397r);
            this.f14395p.addView(this.f14398s);
            this.f14398s.setPadding(m13349i(7.0f), 0, 0, 0);
            this.f14398s.setEllipsize(TextUtils.TruncateAt.END);
            this.f14398s.setGravity(5);
        }
    }

    /* renamed from: B */
    public final void m13347B() {
        if (m13351l()) {
            ((LoopViewPager) this.f14383d).getPageAdapterWrapper().notifyDataSetChanged();
        } else if (this.f14383d.getAdapter() != null) {
            this.f14383d.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m13355q();
        } else if (action == 1 || action == 3) {
            m13350j();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getContainerScale() {
        return this.f14401v;
    }

    public int getItemHeight() {
        return this.f14394o;
    }

    public int getItemWidth() {
        return this.f14393n;
    }

    public ViewPager getViewPager() {
        return this.f14383d;
    }

    /* renamed from: h */
    public AbstractC8268a m13348h(float f10, float f11, float f12, float f13) {
        this.f14395p.setPadding(m13349i(f10), m13349i(f11), m13349i(f12), m13349i(f13));
        return this;
    }

    /* renamed from: i */
    public int m13349i(float f10) {
        return (int) ((f10 * this.f14381b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: j */
    public void m13350j() {
        if (m13352m() && !this.f14390k) {
            if (!m13351l() || !this.f14389j) {
                this.f14390k = false;
                return;
            }
            m13355q();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.f14380a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new c(), this.f14387h, this.f14388i, TimeUnit.SECONDS);
            this.f14390k = true;
            AbstractC7919c.m12468a(getClass().getSimpleName() + "--->goOnScroll()");
        }
    }

    /* renamed from: l */
    public boolean m13351l() {
        return this.f14383d instanceof LoopViewPager;
    }

    /* renamed from: m */
    public boolean m13352m() {
        if (this.f14383d == null) {
            AbstractC7919c.m12470c("ViewPager is not exist!");
            return false;
        }
        List list = this.f14384e;
        if (list != null && list.size() > 0) {
            return this.f14400u || this.f14384e.size() != 1;
        }
        AbstractC7919c.m12470c("DataList must be not empty!");
        return false;
    }

    /* renamed from: n */
    public abstract View mo13353n();

    /* renamed from: o */
    public abstract View mo6600o(int i9);

    /* renamed from: q */
    public void m13355q() {
        m13338A();
        AbstractC7919c.m12468a(getClass().getSimpleName() + "--->pauseScroll()");
        this.f14390k = false;
    }

    /* renamed from: r */
    public final void m13356r(int i9) throws Resources.NotFoundException {
        if (m13352m()) {
            if (this.f14399t) {
                m13347B();
            }
            this.f14383d.setCurrentItem(i9 + 1);
        }
    }

    /* renamed from: s */
    public AbstractC8268a m13357s(boolean z9) {
        this.f14389j = z9;
        return this;
    }

    public abstract void setCurrentIndicator(int i9);

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f14398s;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public AbstractC8268a m13358t(boolean z9) {
        this.f14396q = z9;
        return this;
    }

    /* renamed from: u */
    public final void m13359u() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f14383d, new C8883a(this.f14381b, new AccelerateDecelerateInterpolator(), this.f14391l));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: v */
    public AbstractC8268a m13360v(List list) {
        this.f14384e = list;
        this.f14399t = true;
        return this;
    }

    /* renamed from: w */
    public AbstractC8268a m13361w(Class cls) {
        this.f14392m = cls;
        return this;
    }

    /* renamed from: x */
    public final void m13362x() throws Resources.NotFoundException {
        this.f14383d.setAdapter(new d(this, null));
        this.f14383d.setOffscreenPageLimit(this.f14384e.size() - 1);
        try {
            Class cls = this.f14392m;
            if (cls != null) {
                this.f14383d.setPageTransformer(true, (ViewPager.PageTransformer) cls.newInstance());
                if (m13351l()) {
                    this.f14391l = 550;
                    m13359u();
                }
            } else if (m13351l()) {
                this.f14391l = 450;
                m13359u();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f14403x;
        if (onPageChangeListener != null) {
            this.f14383d.removeOnPageChangeListener(onPageChangeListener);
        }
        this.f14383d.addOnPageChangeListener(this.f14403x);
    }

    /* renamed from: y */
    public final float m13363y(float f10) {
        return f10 * this.f14381b.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: z */
    public void m13364z() throws Resources.NotFoundException {
        List list = this.f14384e;
        if (list == null) {
            throw new IllegalStateException("Data source is empty,you must setSource() before startScroll()");
        }
        if (list.size() > 0 && this.f14385f > this.f14384e.size() - 1) {
            this.f14385f = 0;
        }
        m13354p(this.f14398s, this.f14385f);
        m13362x();
        View viewMo13353n = mo13353n();
        if (viewMo13353n != null) {
            this.f14397r.removeAllViews();
            this.f14397r.addView(viewMo13353n);
        }
        m13350j();
    }

    /* renamed from: p */
    public void m13354p(TextView textView, int i9) {
    }
}
