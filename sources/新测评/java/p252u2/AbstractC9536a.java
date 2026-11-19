package p252u2;

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
import p197p2.AbstractC8819c;
import p263v2.C9661a;

/* renamed from: u2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9536a extends RelativeLayout implements HasTypeface {

    /* renamed from: a */
    public ScheduledExecutorService f16698a;

    /* renamed from: b */
    public Context f16699b;

    /* renamed from: c */
    public DisplayMetrics f16700c;

    /* renamed from: d */
    public ViewPager f16701d;

    /* renamed from: e */
    public RelativeLayout f16702e;

    /* renamed from: f */
    public List f16703f;

    /* renamed from: g */
    public int f16704g;

    /* renamed from: h */
    public int f16705h;

    /* renamed from: i */
    public long f16706i;

    /* renamed from: j */
    public long f16707j;

    /* renamed from: k */
    public boolean f16708k;

    /* renamed from: l */
    public boolean f16709l;

    /* renamed from: m */
    public int f16710m;

    /* renamed from: n */
    public Class f16711n;

    /* renamed from: o */
    public int f16712o;

    /* renamed from: p */
    public int f16713p;

    /* renamed from: q */
    public LinearLayout f16714q;

    /* renamed from: r */
    public boolean f16715r;

    /* renamed from: s */
    public LinearLayout f16716s;

    /* renamed from: t */
    public TextView f16717t;

    /* renamed from: u */
    public boolean f16718u;

    /* renamed from: v */
    public boolean f16719v;

    /* renamed from: w */
    public float f16720w;

    /* renamed from: x */
    public Handler f16721x;

    /* renamed from: y */
    public ViewPager.OnPageChangeListener f16722y;

    /* renamed from: z */
    public ViewPager.OnPageChangeListener f16723z;

    /* renamed from: u2.a$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Resources.NotFoundException {
            AbstractC9536a abstractC9536a = AbstractC9536a.this;
            abstractC9536a.m15960u(abstractC9536a.f16704g);
            return true;
        }
    }

    /* renamed from: u2.a$b */
    public class b implements ViewPager.OnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            if (AbstractC9536a.this.f16723z != null) {
                AbstractC9536a.this.f16723z.onPageScrollStateChanged(i10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            if (AbstractC9536a.this.f16723z != null) {
                AbstractC9536a.this.f16723z.onPageScrolled(i10, f10, i11);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            AbstractC9536a abstractC9536a = AbstractC9536a.this;
            abstractC9536a.f16704g = i10 % abstractC9536a.f16703f.size();
            AbstractC9536a abstractC9536a2 = AbstractC9536a.this;
            abstractC9536a2.setCurrentIndicator(abstractC9536a2.f16704g);
            AbstractC9536a abstractC9536a3 = AbstractC9536a.this;
            abstractC9536a3.m15958s(abstractC9536a3.f16717t, AbstractC9536a.this.f16704g);
            LinearLayout linearLayout = AbstractC9536a.this.f16714q;
            AbstractC9536a abstractC9536a4 = AbstractC9536a.this;
            linearLayout.setVisibility((abstractC9536a4.f16704g != abstractC9536a4.f16703f.size() + (-1) || AbstractC9536a.this.f16715r) ? 0 : 8);
            AbstractC9536a abstractC9536a5 = AbstractC9536a.this;
            abstractC9536a5.f16705h = abstractC9536a5.f16704g;
            if (abstractC9536a5.f16723z != null) {
                AbstractC9536a.this.f16723z.onPageSelected(i10);
            }
        }
    }

    /* renamed from: u2.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9536a.this.f16721x.obtainMessage().sendToTarget();
        }
    }

    /* renamed from: u2.a$d */
    public class d extends PagerAdapter {

        /* renamed from: u2.a$d$a */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ int f16728a;

            public a(int i10) {
                this.f16728a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC9536a.m15943g(AbstractC9536a.this);
            }
        }

        public d() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List list = AbstractC9536a.this.f16703f;
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
            View viewMo5504r = AbstractC9536a.this.mo5504r(i10);
            viewMo5504r.setOnClickListener(new a(i10));
            viewGroup.addView(viewMo5504r);
            return viewMo5504r;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public /* synthetic */ d(AbstractC9536a abstractC9536a, a aVar) {
            this();
        }
    }

    /* renamed from: u2.a$e */
    public interface e {
    }

    public AbstractC9536a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16703f = new ArrayList();
        this.f16710m = 450;
        this.f16718u = false;
        this.f16719v = true;
        this.f16721x = new Handler(new a());
        this.f16722y = new b();
        m15944k(context, attributeSet);
    }

    /* renamed from: D */
    private void m15936D() {
        ScheduledExecutorService scheduledExecutorService = this.f16698a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f16698a = null;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ e m15943g(AbstractC9536a abstractC9536a) {
        abstractC9536a.getClass();
        return null;
    }

    /* renamed from: k */
    private void m15944k(Context context, AttributeSet attributeSet) {
        boolean z9;
        int attributeIntValue;
        this.f16699b = context;
        this.f16700c = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseBanner);
        this.f16720w = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseBanner_bb_scale, -1.0f);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isLoopEnable, true);
        this.f16706i = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_delay, 5);
        this.f16707j = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_period, 5);
        this.f16708k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isAutoScrollEnable, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_barColor, 0);
        this.f16715r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isBarShowWhenLast, true);
        int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_indicatorGravity, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingLeft, m15950i(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingTop, m15950i(i10 == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingRight, m15950i(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingBottom, m15950i(i10 != 17 ? 2.0f : 6.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_textColor, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_textSize, m15946B(12.5f));
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isTitleShow, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isIndicatorShow, true);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeSet != null) {
            z9 = z10;
            attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "layout_height", -2);
        } else {
            z9 = z10;
            attributeIntValue = -2;
        }
        ViewPager loopViewPager = z9 ? new LoopViewPager(context) : new ViewPager(context);
        this.f16701d = loopViewPager;
        loopViewPager.setOverScrollMode(2);
        this.f16712o = this.f16700c.widthPixels;
        m15952l(context, attributeIntValue, attributeSet);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f16712o, this.f16713p);
        addView(this.f16701d, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f16702e = relativeLayout;
        addView(relativeLayout, layoutParams);
        this.f16714q = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f16712o, -2);
        layoutParams2.addRule(12, -1);
        this.f16702e.addView(this.f16714q, layoutParams2);
        this.f16714q.setBackgroundColor(color);
        this.f16714q.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.f16714q.setClipChildren(false);
        this.f16714q.setClipToPadding(false);
        m15953m(context, z12);
        m15954n(context, color2, dimension5, z11);
        if (i10 == 17) {
            this.f16714q.setGravity(17);
            this.f16714q.addView(this.f16716s);
            return;
        }
        if (i10 == 5) {
            this.f16714q.setGravity(16);
            this.f16714q.addView(this.f16717t);
            this.f16714q.addView(this.f16716s);
            this.f16717t.setPadding(0, 0, m15950i(7.0f), 0);
            this.f16717t.setEllipsize(TextUtils.TruncateAt.END);
            this.f16717t.setGravity(3);
            return;
        }
        if (i10 == 3) {
            this.f16714q.setGravity(16);
            this.f16714q.addView(this.f16716s);
            this.f16714q.addView(this.f16717t);
            this.f16717t.setPadding(m15950i(7.0f), 0, 0, 0);
            this.f16717t.setEllipsize(TextUtils.TruncateAt.END);
            this.f16717t.setGravity(5);
        }
    }

    /* renamed from: A */
    public final void m15945A() throws Resources.NotFoundException {
        this.f16701d.setAdapter(new d(this, null));
        this.f16701d.setOffscreenPageLimit(this.f16703f.size() - 1);
        try {
            Class cls = this.f16711n;
            if (cls != null) {
                this.f16701d.setPageTransformer(true, (ViewPager.PageTransformer) cls.newInstance());
                if (m15955o()) {
                    this.f16710m = 550;
                    m15963x();
                }
            } else if (m15955o()) {
                this.f16710m = 450;
                m15963x();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f16722y;
        if (onPageChangeListener != null) {
            this.f16701d.removeOnPageChangeListener(onPageChangeListener);
            this.f16701d.addOnPageChangeListener(this.f16722y);
        }
    }

    /* renamed from: B */
    public final float m15946B(float f10) {
        return f10 * this.f16699b.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: C */
    public void m15947C() throws Resources.NotFoundException {
        List list = this.f16703f;
        if (list == null) {
            throw new IllegalStateException("Data source is empty,you must setSource() before startScroll()");
        }
        if (list.size() > 0 && this.f16704g > this.f16703f.size() - 1) {
            this.f16704g = 0;
        }
        m15958s(this.f16717t, this.f16704g);
        m15945A();
        View viewMo15957q = mo15957q();
        if (viewMo15957q != null) {
            this.f16716s.removeAllViews();
            this.f16716s.addView(viewMo15957q);
        }
        m15951j();
    }

    /* renamed from: E */
    public final void m15948E() {
        if (m15955o()) {
            ((LoopViewPager) this.f16701d).getPageAdapterWrapper().notifyDataSetChanged();
        } else if (this.f16701d.getAdapter() != null) {
            this.f16701d.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m15959t();
        } else if (action == 1 || action == 3) {
            m15951j();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getContainerScale() {
        return this.f16720w;
    }

    public int getItemHeight() {
        return this.f16713p;
    }

    public int getItemWidth() {
        return this.f16712o;
    }

    public ViewPager getViewPager() {
        return this.f16701d;
    }

    /* renamed from: h */
    public AbstractC9536a m15949h(float f10, float f11, float f12, float f13) {
        this.f16714q.setPadding(m15950i(f10), m15950i(f11), m15950i(f12), m15950i(f13));
        return this;
    }

    /* renamed from: i */
    public int m15950i(float f10) {
        return (int) ((f10 * this.f16699b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: j */
    public void m15951j() {
        if (m15956p() && !this.f16709l) {
            if (!m15955o() || !this.f16708k) {
                this.f16709l = false;
                return;
            }
            m15959t();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.f16698a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new c(), this.f16706i, this.f16707j, TimeUnit.SECONDS);
            this.f16709l = true;
            AbstractC8819c.m14777a(getClass().getSimpleName() + "--->goOnScroll()");
        }
    }

    /* renamed from: l */
    public final void m15952l(Context context, int i10, AttributeSet attributeSet) {
        float f10 = this.f16720w;
        if (f10 >= 0.0f) {
            if (f10 > 1.0f) {
                this.f16720w = 1.0f;
            }
            this.f16713p = (int) (this.f16712o * this.f16720w);
        } else {
            if (i10 == -1 || i10 == -2) {
                this.f16713p = i10;
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes.recycle();
            this.f16713p = dimensionPixelSize;
        }
    }

    /* renamed from: m */
    public final void m15953m(Context context, boolean z9) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f16716s = linearLayout;
        linearLayout.setGravity(17);
        this.f16716s.setVisibility(z9 ? 0 : 4);
        this.f16716s.setClipChildren(false);
        this.f16716s.setClipToPadding(false);
    }

    /* renamed from: n */
    public final void m15954n(Context context, int i10, float f10, boolean z9) {
        TextView textView = new TextView(context);
        this.f16717t = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f16717t.setSingleLine(true);
        this.f16717t.setTextColor(i10);
        this.f16717t.setTextSize(0, f10);
        this.f16717t.setVisibility(z9 ? 0 : 4);
    }

    /* renamed from: o */
    public boolean m15955o() {
        return this.f16701d instanceof LoopViewPager;
    }

    /* renamed from: p */
    public boolean m15956p() {
        if (this.f16701d == null) {
            AbstractC8819c.m14779c("ViewPager is not exist!");
            return false;
        }
        List list = this.f16703f;
        if (list != null && list.size() > 0) {
            return this.f16719v || this.f16703f.size() != 1;
        }
        AbstractC8819c.m14779c("DataList must be not empty!");
        return false;
    }

    /* renamed from: q */
    public abstract View mo15957q();

    /* renamed from: r */
    public abstract View mo5504r(int i10);

    public void setContainerScale(float f10) {
        this.f16720w = f10;
        if (f10 > 1.0f) {
            this.f16720w = 1.0f;
        }
        this.f16713p = (int) (this.f16712o * this.f16720w);
        removeView(this.f16701d);
        removeView(this.f16702e);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f16712o, this.f16713p);
        addView(this.f16701d, layoutParams);
        addView(this.f16702e, layoutParams);
    }

    public abstract void setCurrentIndicator(int i10);

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f16717t;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public void m15959t() {
        m15936D();
        AbstractC8819c.m14777a(getClass().getSimpleName() + "--->pauseScroll()");
        this.f16709l = false;
    }

    /* renamed from: u */
    public final void m15960u(int i10) throws Resources.NotFoundException {
        if (m15956p()) {
            if (this.f16718u) {
                m15948E();
            }
            this.f16701d.setCurrentItem(i10 + 1);
        }
    }

    /* renamed from: v */
    public AbstractC9536a m15961v(boolean z9) {
        this.f16708k = z9;
        return this;
    }

    /* renamed from: w */
    public AbstractC9536a m15962w(boolean z9) {
        this.f16715r = z9;
        return this;
    }

    /* renamed from: x */
    public final void m15963x() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f16701d, new C9661a(this.f16699b, new AccelerateDecelerateInterpolator(), this.f16710m));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: y */
    public AbstractC9536a m15964y(List list) {
        this.f16703f = list;
        this.f16718u = true;
        return this;
    }

    /* renamed from: z */
    public AbstractC9536a m15965z(Class cls) {
        this.f16711n = cls;
        return this;
    }

    /* renamed from: s */
    public void m15958s(TextView textView, int i10) {
    }
}
