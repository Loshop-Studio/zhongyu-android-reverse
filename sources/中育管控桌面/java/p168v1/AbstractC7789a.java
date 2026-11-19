package p168v1;

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
import p133q1.AbstractC7620c;
import p175w1.C7809a;

/* renamed from: v1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7789a extends RelativeLayout implements HasTypeface {

    /* renamed from: a */
    public ScheduledExecutorService f10308a;

    /* renamed from: b */
    public Context f10309b;

    /* renamed from: c */
    public DisplayMetrics f10310c;

    /* renamed from: d */
    public ViewPager f10311d;

    /* renamed from: e */
    public RelativeLayout f10312e;

    /* renamed from: f */
    public List f10313f;

    /* renamed from: g */
    public int f10314g;

    /* renamed from: h */
    public int f10315h;

    /* renamed from: i */
    public long f10316i;

    /* renamed from: j */
    public long f10317j;

    /* renamed from: k */
    public boolean f10318k;

    /* renamed from: l */
    public boolean f10319l;

    /* renamed from: m */
    public int f10320m;

    /* renamed from: n */
    public Class f10321n;

    /* renamed from: o */
    public int f10322o;

    /* renamed from: p */
    public int f10323p;

    /* renamed from: q */
    public LinearLayout f10324q;

    /* renamed from: r */
    public boolean f10325r;

    /* renamed from: s */
    public LinearLayout f10326s;

    /* renamed from: t */
    public TextView f10327t;

    /* renamed from: u */
    public boolean f10328u;

    /* renamed from: v */
    public boolean f10329v;

    /* renamed from: w */
    public float f10330w;

    /* renamed from: x */
    public Handler f10331x;

    /* renamed from: y */
    public ViewPager.OnPageChangeListener f10332y;

    /* renamed from: z */
    public ViewPager.OnPageChangeListener f10333z;

    /* renamed from: v1.a$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Resources.NotFoundException {
            AbstractC7789a abstractC7789a = AbstractC7789a.this;
            abstractC7789a.m9349u(abstractC7789a.f10314g);
            return true;
        }
    }

    /* renamed from: v1.a$b */
    public class b implements ViewPager.OnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i6) {
            if (AbstractC7789a.this.f10333z != null) {
                AbstractC7789a.this.f10333z.onPageScrollStateChanged(i6);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i6, float f6, int i7) {
            if (AbstractC7789a.this.f10333z != null) {
                AbstractC7789a.this.f10333z.onPageScrolled(i6, f6, i7);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i6) {
            AbstractC7789a abstractC7789a = AbstractC7789a.this;
            abstractC7789a.f10314g = i6 % abstractC7789a.f10313f.size();
            AbstractC7789a abstractC7789a2 = AbstractC7789a.this;
            abstractC7789a2.setCurrentIndicator(abstractC7789a2.f10314g);
            AbstractC7789a abstractC7789a3 = AbstractC7789a.this;
            abstractC7789a3.m9347s(abstractC7789a3.f10327t, AbstractC7789a.this.f10314g);
            LinearLayout linearLayout = AbstractC7789a.this.f10324q;
            AbstractC7789a abstractC7789a4 = AbstractC7789a.this;
            linearLayout.setVisibility((abstractC7789a4.f10314g != abstractC7789a4.f10313f.size() + (-1) || AbstractC7789a.this.f10325r) ? 0 : 8);
            AbstractC7789a abstractC7789a5 = AbstractC7789a.this;
            abstractC7789a5.f10315h = abstractC7789a5.f10314g;
            if (abstractC7789a5.f10333z != null) {
                AbstractC7789a.this.f10333z.onPageSelected(i6);
            }
        }
    }

    /* renamed from: v1.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7789a.this.f10331x.obtainMessage().sendToTarget();
        }
    }

    /* renamed from: v1.a$d */
    public class d extends PagerAdapter {

        /* renamed from: v1.a$d$a */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ int f10338a;

            public a(int i6) {
                this.f10338a = i6;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC7789a.m9332g(AbstractC7789a.this);
            }
        }

        public d() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List list = AbstractC7789a.this.f10313f;
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
        public Object instantiateItem(ViewGroup viewGroup, int i6) {
            View viewMo4514r = AbstractC7789a.this.mo4514r(i6);
            viewMo4514r.setOnClickListener(new a(i6));
            viewGroup.addView(viewMo4514r);
            return viewMo4514r;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public /* synthetic */ d(AbstractC7789a abstractC7789a, a aVar) {
            this();
        }
    }

    /* renamed from: v1.a$e */
    public interface e {
    }

    public AbstractC7789a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10313f = new ArrayList();
        this.f10320m = 450;
        this.f10328u = false;
        this.f10329v = true;
        this.f10331x = new Handler(new a());
        this.f10332y = new b();
        m9333k(context, attributeSet);
    }

    /* renamed from: D */
    private void m9325D() {
        ScheduledExecutorService scheduledExecutorService = this.f10308a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f10308a = null;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ e m9332g(AbstractC7789a abstractC7789a) {
        abstractC7789a.getClass();
        return null;
    }

    /* renamed from: k */
    private void m9333k(Context context, AttributeSet attributeSet) {
        boolean z6;
        int attributeIntValue;
        this.f10309b = context;
        this.f10310c = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseBanner);
        this.f10330w = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseBanner_bb_scale, -1.0f);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isLoopEnable, true);
        this.f10316i = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_delay, 5);
        this.f10317j = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_period, 5);
        this.f10318k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isAutoScrollEnable, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_barColor, 0);
        this.f10325r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isBarShowWhenLast, true);
        int i6 = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseBanner_bb_indicatorGravity, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingLeft, m9339i(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingTop, m9339i(i6 == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingRight, m9339i(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_barPaddingBottom, m9339i(i6 != 17 ? 2.0f : 6.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseBanner_bb_textColor, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.BaseBanner_bb_textSize, m9335B(12.5f));
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isTitleShow, true);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BaseBanner_bb_isIndicatorShow, true);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeSet != null) {
            z6 = z7;
            attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "layout_height", -2);
        } else {
            z6 = z7;
            attributeIntValue = -2;
        }
        ViewPager loopViewPager = z6 ? new LoopViewPager(context) : new ViewPager(context);
        this.f10311d = loopViewPager;
        loopViewPager.setOverScrollMode(2);
        this.f10322o = this.f10310c.widthPixels;
        m9341l(context, attributeIntValue, attributeSet);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f10322o, this.f10323p);
        addView(this.f10311d, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f10312e = relativeLayout;
        addView(relativeLayout, layoutParams);
        this.f10324q = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f10322o, -2);
        layoutParams2.addRule(12, -1);
        this.f10312e.addView(this.f10324q, layoutParams2);
        this.f10324q.setBackgroundColor(color);
        this.f10324q.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.f10324q.setClipChildren(false);
        this.f10324q.setClipToPadding(false);
        m9342m(context, z9);
        m9343n(context, color2, dimension5, z8);
        if (i6 == 17) {
            this.f10324q.setGravity(17);
            this.f10324q.addView(this.f10326s);
            return;
        }
        if (i6 == 5) {
            this.f10324q.setGravity(16);
            this.f10324q.addView(this.f10327t);
            this.f10324q.addView(this.f10326s);
            this.f10327t.setPadding(0, 0, m9339i(7.0f), 0);
            this.f10327t.setEllipsize(TextUtils.TruncateAt.END);
            this.f10327t.setGravity(3);
            return;
        }
        if (i6 == 3) {
            this.f10324q.setGravity(16);
            this.f10324q.addView(this.f10326s);
            this.f10324q.addView(this.f10327t);
            this.f10327t.setPadding(m9339i(7.0f), 0, 0, 0);
            this.f10327t.setEllipsize(TextUtils.TruncateAt.END);
            this.f10327t.setGravity(5);
        }
    }

    /* renamed from: A */
    public final void m9334A() throws Resources.NotFoundException {
        this.f10311d.setAdapter(new d(this, null));
        this.f10311d.setOffscreenPageLimit(this.f10313f.size() - 1);
        try {
            Class cls = this.f10321n;
            if (cls != null) {
                this.f10311d.setPageTransformer(true, (ViewPager.PageTransformer) cls.newInstance());
                if (m9344o()) {
                    this.f10320m = 550;
                    m9352x();
                }
            } else if (m9344o()) {
                this.f10320m = 450;
                m9352x();
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f10332y;
        if (onPageChangeListener != null) {
            this.f10311d.removeOnPageChangeListener(onPageChangeListener);
            this.f10311d.addOnPageChangeListener(this.f10332y);
        }
    }

    /* renamed from: B */
    public final float m9335B(float f6) {
        return f6 * this.f10309b.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: C */
    public void m9336C() throws Resources.NotFoundException {
        List list = this.f10313f;
        if (list == null) {
            throw new IllegalStateException("Data source is empty,you must setSource() before startScroll()");
        }
        if (list.size() > 0 && this.f10314g > this.f10313f.size() - 1) {
            this.f10314g = 0;
        }
        m9347s(this.f10327t, this.f10314g);
        m9334A();
        View viewMo9346q = mo9346q();
        if (viewMo9346q != null) {
            this.f10326s.removeAllViews();
            this.f10326s.addView(viewMo9346q);
        }
        m9340j();
    }

    /* renamed from: E */
    public final void m9337E() {
        if (m9344o()) {
            ((LoopViewPager) this.f10311d).getPageAdapterWrapper().notifyDataSetChanged();
        } else if (this.f10311d.getAdapter() != null) {
            this.f10311d.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m9348t();
        } else if (action == 1 || action == 3) {
            m9340j();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getContainerScale() {
        return this.f10330w;
    }

    public int getItemHeight() {
        return this.f10323p;
    }

    public int getItemWidth() {
        return this.f10322o;
    }

    public ViewPager getViewPager() {
        return this.f10311d;
    }

    /* renamed from: h */
    public AbstractC7789a m9338h(float f6, float f7, float f8, float f9) {
        this.f10324q.setPadding(m9339i(f6), m9339i(f7), m9339i(f8), m9339i(f9));
        return this;
    }

    /* renamed from: i */
    public int m9339i(float f6) {
        return (int) ((f6 * this.f10309b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: j */
    public void m9340j() {
        if (m9345p() && !this.f10319l) {
            if (!m9344o() || !this.f10318k) {
                this.f10319l = false;
                return;
            }
            m9348t();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.f10308a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new c(), this.f10316i, this.f10317j, TimeUnit.SECONDS);
            this.f10319l = true;
            AbstractC7620c.m9059a(getClass().getSimpleName() + "--->goOnScroll()");
        }
    }

    /* renamed from: l */
    public final void m9341l(Context context, int i6, AttributeSet attributeSet) {
        float f6 = this.f10330w;
        if (f6 >= 0.0f) {
            if (f6 > 1.0f) {
                this.f10330w = 1.0f;
            }
            this.f10323p = (int) (this.f10322o * this.f10330w);
        } else {
            if (i6 == -1 || i6 == -2) {
                this.f10323p = i6;
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes.recycle();
            this.f10323p = dimensionPixelSize;
        }
    }

    /* renamed from: m */
    public final void m9342m(Context context, boolean z6) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10326s = linearLayout;
        linearLayout.setGravity(17);
        this.f10326s.setVisibility(z6 ? 0 : 4);
        this.f10326s.setClipChildren(false);
        this.f10326s.setClipToPadding(false);
    }

    /* renamed from: n */
    public final void m9343n(Context context, int i6, float f6, boolean z6) {
        TextView textView = new TextView(context);
        this.f10327t = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f10327t.setSingleLine(true);
        this.f10327t.setTextColor(i6);
        this.f10327t.setTextSize(0, f6);
        this.f10327t.setVisibility(z6 ? 0 : 4);
    }

    /* renamed from: o */
    public boolean m9344o() {
        return this.f10311d instanceof LoopViewPager;
    }

    /* renamed from: p */
    public boolean m9345p() {
        if (this.f10311d == null) {
            AbstractC7620c.m9061c("ViewPager is not exist!");
            return false;
        }
        List list = this.f10313f;
        if (list != null && list.size() > 0) {
            return this.f10329v || this.f10313f.size() != 1;
        }
        AbstractC7620c.m9061c("DataList must be not empty!");
        return false;
    }

    /* renamed from: q */
    public abstract View mo9346q();

    /* renamed from: r */
    public abstract View mo4514r(int i6);

    public void setContainerScale(float f6) {
        this.f10330w = f6;
        if (f6 > 1.0f) {
            this.f10330w = 1.0f;
        }
        this.f10323p = (int) (this.f10322o * this.f10330w);
        removeView(this.f10311d);
        removeView(this.f10312e);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f10322o, this.f10323p);
        addView(this.f10311d, layoutParams);
        addView(this.f10312e, layoutParams);
    }

    public abstract void setCurrentIndicator(int i6);

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f10327t;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public void m9348t() {
        m9325D();
        AbstractC7620c.m9059a(getClass().getSimpleName() + "--->pauseScroll()");
        this.f10319l = false;
    }

    /* renamed from: u */
    public final void m9349u(int i6) throws Resources.NotFoundException {
        if (m9345p()) {
            if (this.f10328u) {
                m9337E();
            }
            this.f10311d.setCurrentItem(i6 + 1);
        }
    }

    /* renamed from: v */
    public AbstractC7789a m9350v(boolean z6) {
        this.f10318k = z6;
        return this;
    }

    /* renamed from: w */
    public AbstractC7789a m9351w(boolean z6) {
        this.f10325r = z6;
        return this;
    }

    /* renamed from: x */
    public final void m9352x() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f10311d, new C7809a(this.f10309b, new AccelerateDecelerateInterpolator(), this.f10320m));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* renamed from: y */
    public AbstractC7789a m9353y(List list) {
        this.f10313f = list;
        this.f10328u = true;
        return this;
    }

    /* renamed from: z */
    public AbstractC7789a m9354z(Class cls) {
        this.f10321n = cls;
        return this;
    }

    /* renamed from: s */
    public void m9347s(TextView textView, int i6) {
    }
}
