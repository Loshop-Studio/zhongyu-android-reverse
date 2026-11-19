package p239s1;

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
import p184n1.AbstractC9363c;
import p250t1.C10088a;

/* renamed from: s1.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9968a extends RelativeLayout implements HasTypeface {

    /* renamed from: a */
    public ScheduledExecutorService f19965a;

    /* renamed from: b */
    public Context f19966b;

    /* renamed from: c */
    public DisplayMetrics f19967c;

    /* renamed from: d */
    public ViewPager f19968d;

    /* renamed from: e */
    public RelativeLayout f19969e;

    /* renamed from: f */
    public List f19970f;

    /* renamed from: g */
    public int f19971g;

    /* renamed from: h */
    public int f19972h;

    /* renamed from: i */
    public long f19973i;

    /* renamed from: j */
    public long f19974j;

    /* renamed from: k */
    public boolean f19975k;

    /* renamed from: l */
    public boolean f19976l;

    /* renamed from: m */
    public int f19977m;

    /* renamed from: n */
    public Class f19978n;

    /* renamed from: o */
    public int f19979o;

    /* renamed from: p */
    public int f19980p;

    /* renamed from: q */
    public LinearLayout f19981q;

    /* renamed from: r */
    public boolean f19982r;

    /* renamed from: s */
    public LinearLayout f19983s;

    /* renamed from: t */
    public TextView f19984t;

    /* renamed from: u */
    public boolean f19985u;

    /* renamed from: v */
    public boolean f19986v;

    /* renamed from: w */
    public float f19987w;

    /* renamed from: x */
    public Handler f19988x;

    /* renamed from: y */
    public ViewPager.OnPageChangeListener f19989y;

    /* renamed from: z */
    public ViewPager.OnPageChangeListener f19990z;

    /* renamed from: s1.a$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Resources.NotFoundException {
            AbstractC9968a abstractC9968a = AbstractC9968a.this;
            abstractC9968a.m18639u(abstractC9968a.f19971g);
            return true;
        }
    }

    /* renamed from: s1.a$b */
    public class b implements ViewPager.OnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            if (AbstractC9968a.this.f19990z != null) {
                AbstractC9968a.this.f19990z.onPageScrollStateChanged(i10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            if (AbstractC9968a.this.f19990z != null) {
                AbstractC9968a.this.f19990z.onPageScrolled(i10, f10, i11);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            AbstractC9968a abstractC9968a = AbstractC9968a.this;
            abstractC9968a.f19971g = i10 % abstractC9968a.f19970f.size();
            AbstractC9968a abstractC9968a2 = AbstractC9968a.this;
            abstractC9968a2.setCurrentIndicator(abstractC9968a2.f19971g);
            AbstractC9968a abstractC9968a3 = AbstractC9968a.this;
            abstractC9968a3.m18637s(abstractC9968a3.f19984t, AbstractC9968a.this.f19971g);
            LinearLayout linearLayout = AbstractC9968a.this.f19981q;
            AbstractC9968a abstractC9968a4 = AbstractC9968a.this;
            linearLayout.setVisibility((abstractC9968a4.f19971g != abstractC9968a4.f19970f.size() + (-1) || AbstractC9968a.this.f19982r) ? 0 : 8);
            AbstractC9968a abstractC9968a5 = AbstractC9968a.this;
            abstractC9968a5.f19972h = abstractC9968a5.f19971g;
            if (abstractC9968a5.f19990z != null) {
                AbstractC9968a.this.f19990z.onPageSelected(i10);
            }
        }
    }

    /* renamed from: s1.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9968a.this.f19988x.obtainMessage().sendToTarget();
        }
    }

    /* renamed from: s1.a$d */
    public class d extends PagerAdapter {

        /* renamed from: s1.a$d$a */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ int f19995a;

            public a(int i10) {
                this.f19995a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC9968a.m18622g(AbstractC9968a.this);
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
            List list = AbstractC9968a.this.f19970f;
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
            View viewMo6625r = AbstractC9968a.this.mo6625r(i10);
            viewMo6625r.setOnClickListener(new a(i10));
            viewGroup.addView(viewMo6625r);
            return viewMo6625r;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public /* synthetic */ d(AbstractC9968a abstractC9968a, a aVar) {
            this();
        }
    }

    /* renamed from: s1.a$e */
    public interface e {
    }

    public AbstractC9968a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19970f = new ArrayList();
        this.f19977m = 450;
        this.f19985u = false;
        this.f19986v = true;
        this.f19988x = new Handler(new a());
        this.f19989y = new b();
        m18623k(context, attributeSet);
    }

    /* renamed from: D */
    private void m18615D() {
        ScheduledExecutorService scheduledExecutorService = this.f19965a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f19965a = null;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ e m18622g(AbstractC9968a abstractC9968a) {
        abstractC9968a.getClass();
        return null;
    }

    /* renamed from: k */
    private void m18623k(Context context, AttributeSet attributeSet) {
        boolean z10;
        int attributeIntValue;
        this.f19966b = context;
        this.f19967c = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseBanner);
        this.f19987w = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseBanner_bb_scale, -1.0f);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isLoopEnable, true);
        this.f19973i = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_delay, 5);
        this.f19974j = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_period, 5);
        this.f19975k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isAutoScrollEnable, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_barColor, 0);
        this.f19982r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isBarShowWhenLast, true);
        int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_indicatorGravity, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingLeft, m18629i(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingTop, m18629i(i10 == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingRight, m18629i(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingBottom, m18629i(i10 != 17 ? 2.0f : 6.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_textColor, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_textSize, m18625B(12.5f));
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isTitleShow, true);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isIndicatorShow, true);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeSet != null) {
            z10 = z11;
            attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "layout_height", -2);
        } else {
            z10 = z11;
            attributeIntValue = -2;
        }
        ViewPager loopViewPager = z10 ? new LoopViewPager(context) : new ViewPager(context);
        this.f19968d = loopViewPager;
        loopViewPager.setOverScrollMode(2);
        this.f19979o = this.f19967c.widthPixels;
        m18631l(context, attributeIntValue, attributeSet);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f19979o, this.f19980p);
        addView(this.f19968d, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f19969e = relativeLayout;
        addView(relativeLayout, layoutParams);
        this.f19981q = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f19979o, -2);
        layoutParams2.addRule(12, -1);
        this.f19969e.addView(this.f19981q, layoutParams2);
        this.f19981q.setBackgroundColor(color);
        this.f19981q.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.f19981q.setClipChildren(false);
        this.f19981q.setClipToPadding(false);
        m18632m(context, z13);
        m18633n(context, color2, dimension5, z12);
        if (i10 == 17) {
            this.f19981q.setGravity(17);
            this.f19981q.addView(this.f19983s);
            return;
        }
        if (i10 == 5) {
            this.f19981q.setGravity(16);
            this.f19981q.addView(this.f19984t);
            this.f19981q.addView(this.f19983s);
            this.f19984t.setPadding(0, 0, m18629i(7.0f), 0);
            this.f19984t.setEllipsize(TextUtils.TruncateAt.END);
            this.f19984t.setGravity(3);
            return;
        }
        if (i10 == 3) {
            this.f19981q.setGravity(16);
            this.f19981q.addView(this.f19983s);
            this.f19981q.addView(this.f19984t);
            this.f19984t.setPadding(m18629i(7.0f), 0, 0, 0);
            this.f19984t.setEllipsize(TextUtils.TruncateAt.END);
            this.f19984t.setGravity(5);
        }
    }

    /* renamed from: A */
    public final void m18624A() throws Resources.NotFoundException {
        this.f19968d.setAdapter(new d(this, null));
        this.f19968d.setOffscreenPageLimit(this.f19970f.size() - 1);
        try {
            Class cls = this.f19978n;
            if (cls != null) {
                this.f19968d.setPageTransformer(true, (ViewPager.PageTransformer) cls.newInstance());
                if (m18634o()) {
                    this.f19977m = 550;
                    m18642x();
                }
            } else if (m18634o()) {
                this.f19977m = 450;
                m18642x();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f19989y;
        if (onPageChangeListener != null) {
            this.f19968d.removeOnPageChangeListener(onPageChangeListener);
            this.f19968d.addOnPageChangeListener(this.f19989y);
        }
    }

    /* renamed from: B */
    public final float m18625B(float f10) {
        return f10 * this.f19966b.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: C */
    public void m18626C() throws Resources.NotFoundException {
        List list = this.f19970f;
        if (list == null) {
            throw new IllegalStateException("Data source is empty,you must setSource() before startScroll()");
        }
        if (list.size() > 0 && this.f19971g > this.f19970f.size() - 1) {
            this.f19971g = 0;
        }
        m18637s(this.f19984t, this.f19971g);
        m18624A();
        View viewMo18636q = mo18636q();
        if (viewMo18636q != null) {
            this.f19983s.removeAllViews();
            this.f19983s.addView(viewMo18636q);
        }
        m18630j();
    }

    /* renamed from: E */
    public final void m18627E() {
        if (m18634o()) {
            ((LoopViewPager) this.f19968d).getPageAdapterWrapper().notifyDataSetChanged();
        } else if (this.f19968d.getAdapter() != null) {
            this.f19968d.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m18638t();
        } else if (action == 1 || action == 3) {
            m18630j();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getContainerScale() {
        return this.f19987w;
    }

    public int getItemHeight() {
        return this.f19980p;
    }

    public int getItemWidth() {
        return this.f19979o;
    }

    public ViewPager getViewPager() {
        return this.f19968d;
    }

    /* renamed from: h */
    public AbstractC9968a m18628h(float f10, float f11, float f12, float f13) {
        this.f19981q.setPadding(m18629i(f10), m18629i(f11), m18629i(f12), m18629i(f13));
        return this;
    }

    /* renamed from: i */
    public int m18629i(float f10) {
        return (int) ((f10 * this.f19966b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: j */
    public void m18630j() {
        if (m18635p() && !this.f19976l) {
            if (!m18634o() || !this.f19975k) {
                this.f19976l = false;
                return;
            }
            m18638t();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.f19965a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new c(), this.f19973i, this.f19974j, TimeUnit.SECONDS);
            this.f19976l = true;
            AbstractC9363c.m17247a(getClass().getSimpleName() + "--->goOnScroll()");
        }
    }

    /* renamed from: l */
    public final void m18631l(Context context, int i10, AttributeSet attributeSet) {
        float f10 = this.f19987w;
        if (f10 >= 0.0f) {
            if (f10 > 1.0f) {
                this.f19987w = 1.0f;
            }
            this.f19980p = (int) (this.f19979o * this.f19987w);
        } else {
            if (i10 == -1 || i10 == -2) {
                this.f19980p = i10;
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes.recycle();
            this.f19980p = dimensionPixelSize;
        }
    }

    /* renamed from: m */
    public final void m18632m(Context context, boolean z10) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f19983s = linearLayout;
        linearLayout.setGravity(17);
        this.f19983s.setVisibility(z10 ? 0 : 4);
        this.f19983s.setClipChildren(false);
        this.f19983s.setClipToPadding(false);
    }

    /* renamed from: n */
    public final void m18633n(Context context, int i10, float f10, boolean z10) {
        TextView textView = new TextView(context);
        this.f19984t = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f19984t.setSingleLine(true);
        this.f19984t.setTextColor(i10);
        this.f19984t.setTextSize(0, f10);
        this.f19984t.setVisibility(z10 ? 0 : 4);
    }

    /* renamed from: o */
    public boolean m18634o() {
        return this.f19968d instanceof LoopViewPager;
    }

    /* renamed from: p */
    public boolean m18635p() {
        if (this.f19968d == null) {
            AbstractC9363c.m17249c("ViewPager is not exist!");
            return false;
        }
        List list = this.f19970f;
        if (list != null && list.size() > 0) {
            return this.f19986v || this.f19970f.size() != 1;
        }
        AbstractC9363c.m17249c("DataList must be not empty!");
        return false;
    }

    /* renamed from: q */
    public abstract View mo18636q();

    /* renamed from: r */
    public abstract View mo6625r(int i10);

    public void setContainerScale(float f10) {
        this.f19987w = f10;
        if (f10 > 1.0f) {
            this.f19987w = 1.0f;
        }
        this.f19980p = (int) (this.f19979o * this.f19987w);
        removeView(this.f19968d);
        removeView(this.f19969e);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f19979o, this.f19980p);
        addView(this.f19968d, layoutParams);
        addView(this.f19969e, layoutParams);
    }

    public abstract void setCurrentIndicator(int i10);

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f19984t;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public void m18638t() {
        m18615D();
        AbstractC9363c.m17247a(getClass().getSimpleName() + "--->pauseScroll()");
        this.f19976l = false;
    }

    /* renamed from: u */
    public final void m18639u(int i10) throws Resources.NotFoundException {
        if (m18635p()) {
            if (this.f19985u) {
                m18627E();
            }
            this.f19968d.setCurrentItem(i10 + 1);
        }
    }

    /* renamed from: v */
    public AbstractC9968a m18640v(boolean z10) {
        this.f19975k = z10;
        return this;
    }

    /* renamed from: w */
    public AbstractC9968a m18641w(boolean z10) {
        this.f19982r = z10;
        return this;
    }

    /* renamed from: x */
    public final void m18642x() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f19968d, new C10088a(this.f19966b, new AccelerateDecelerateInterpolator(), this.f19977m));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: y */
    public AbstractC9968a m18643y(List list) {
        this.f19970f = list;
        this.f19985u = true;
        return this;
    }

    /* renamed from: z */
    public AbstractC9968a m18644z(Class cls) {
        this.f19978n = cls;
        return this;
    }

    /* renamed from: s */
    public void m18637s(TextView textView, int i10) {
    }
}
