package p070b.p113c.p114a.p116e.p118b.p119a.p120a.p121a;

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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p000a.p068t.p069a.C0446b;
import p070b.p113c.p114a.C0788b;
import p070b.p113c.p114a.p116e.p118b.p119a.p120a.p121a.AbstractC0794a;
import p070b.p113c.p114a.p116e.p118b.p119a.p122b.C0797b;

/* renamed from: b.c.a.e.b.a.a.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0794a<E, T extends AbstractC0794a<E, T>> extends RelativeLayout implements HasTypeface {

    /* renamed from: b */
    public ScheduledExecutorService f4465b;

    /* renamed from: c */
    public Context f4466c;

    /* renamed from: d */
    public DisplayMetrics f4467d;

    /* renamed from: e */
    public C0446b f4468e;

    /* renamed from: f */
    public List<E> f4469f;

    /* renamed from: g */
    public long f4470g;

    /* renamed from: h */
    public long f4471h;

    /* renamed from: i */
    public boolean f4472i;

    /* renamed from: j */
    public boolean f4473j;

    /* renamed from: k */
    public int f4474k;

    /* renamed from: l */
    public int f4475l;

    /* renamed from: m */
    public LinearLayout f4476m;

    /* renamed from: n */
    public boolean f4477n;

    /* renamed from: o */
    public LinearLayout f4478o;

    /* renamed from: p */
    public TextView f4479p;

    /* renamed from: q */
    public boolean f4480q;

    /* renamed from: r */
    public float f4481r;

    /* renamed from: s */
    public Handler f4482s;

    /* renamed from: b.c.a.e.b.a.a.a.a$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Resources.NotFoundException {
            AbstractC0794a abstractC0794a = AbstractC0794a.this;
            Objects.requireNonNull(abstractC0794a);
            if (abstractC0794a.m2499c()) {
                abstractC0794a.f4468e.setCurrentItem(1);
            }
            return true;
        }
    }

    /* renamed from: b.c.a.e.b.a.a.a.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0794a.this.f4482s.obtainMessage().sendToTarget();
        }
    }

    public AbstractC0794a(Context context, AttributeSet attributeSet) {
        int dimensionPixelSize;
        super(context, attributeSet);
        this.f4469f = new ArrayList();
        this.f4480q = true;
        this.f4482s = new Handler(new a());
        this.f4466c = context;
        this.f4467d = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0788b.f4447a);
        this.f4481r = typedArrayObtainStyledAttributes.getFloat(13, -1.0f);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, true);
        this.f4470g = typedArrayObtainStyledAttributes.getInt(5, 5);
        this.f4471h = typedArrayObtainStyledAttributes.getInt(12, 5);
        this.f4472i = typedArrayObtainStyledAttributes.getBoolean(7, true);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.f4477n = typedArrayObtainStyledAttributes.getBoolean(8, true);
        int i = typedArrayObtainStyledAttributes.getInt(6, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(2, m2497a(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, m2497a(i == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(3, m2497a(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(1, m2497a(i == 17 ? 6.0f : 2.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(14, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(15, this.f4466c.getResources().getDisplayMetrics().scaledDensity * 12.5f);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(11, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(9, true);
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        C0446b c0797b = z ? new C0797b(context) : new C0446b(context);
        this.f4468e = c0797b;
        c0797b.setOverScrollMode(2);
        int i2 = this.f4467d.widthPixels;
        this.f4474k = i2;
        float f2 = this.f4481r;
        if (f2 < 0.0f) {
            if (attributeValue.equals("-1")) {
                dimensionPixelSize = -1;
            } else if (attributeValue.equals("-2")) {
                this.f4475l = -2;
            } else {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
                dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
                typedArrayObtainStyledAttributes2.recycle();
            }
            this.f4475l = dimensionPixelSize;
        } else {
            if (f2 > 1.0f) {
                this.f4481r = 1.0f;
            }
            this.f4475l = (int) (i2 * this.f4481r);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f4474k, this.f4475l);
        addView(this.f4468e, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        addView(relativeLayout, layoutParams);
        this.f4476m = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f4474k, -2);
        layoutParams2.addRule(12, -1);
        relativeLayout.addView(this.f4476m, layoutParams2);
        this.f4476m.setBackgroundColor(color);
        this.f4476m.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.f4476m.setClipChildren(false);
        this.f4476m.setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4478o = linearLayout;
        linearLayout.setGravity(17);
        this.f4478o.setVisibility(z3 ? 0 : 4);
        this.f4478o.setClipChildren(false);
        this.f4478o.setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f4479p = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f4479p.setSingleLine(true);
        this.f4479p.setTextColor(color2);
        this.f4479p.setTextSize(0, dimension5);
        this.f4479p.setVisibility(z2 ? 0 : 4);
        if (i == 17) {
            this.f4476m.setGravity(17);
            this.f4476m.addView(this.f4478o);
            return;
        }
        if (i == 5) {
            this.f4476m.setGravity(16);
            this.f4476m.addView(this.f4479p);
            this.f4476m.addView(this.f4478o);
            this.f4479p.setPadding(0, 0, m2497a(7.0f), 0);
            this.f4479p.setEllipsize(TextUtils.TruncateAt.END);
            this.f4479p.setGravity(3);
            return;
        }
        if (i == 3) {
            this.f4476m.setGravity(16);
            this.f4476m.addView(this.f4478o);
            this.f4476m.addView(this.f4479p);
            this.f4479p.setPadding(m2497a(7.0f), 0, 0, 0);
            this.f4479p.setEllipsize(TextUtils.TruncateAt.END);
            this.f4479p.setGravity(5);
        }
    }

    /* renamed from: a */
    public int m2497a(float f2) {
        return (int) ((f2 * this.f4466c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public void m2498b() {
        if (m2499c() && !this.f4473j) {
            if (!(this.f4468e instanceof C0797b) || !this.f4472i) {
                this.f4473j = false;
                return;
            }
            m2500d();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.f4465b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new b(), this.f4470g, this.f4471h, TimeUnit.SECONDS);
            this.f4473j = true;
            getClass().getSimpleName();
        }
    }

    /* renamed from: c */
    public boolean m2499c() {
        List<E> list;
        if (this.f4468e == null || (list = this.f4469f) == null || list.size() <= 0) {
            return false;
        }
        return this.f4480q || this.f4469f.size() != 1;
    }

    /* renamed from: d */
    public void m2500d() {
        ScheduledExecutorService scheduledExecutorService = this.f4465b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f4465b = null;
        }
        getClass().getSimpleName();
        this.f4473j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m2500d();
        } else if (action == 1 || action == 3) {
            m2498b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getContainerScale() {
        return this.f4481r;
    }

    public int getItemHeight() {
        return this.f4475l;
    }

    public int getItemWidth() {
        return this.f4474k;
    }

    public C0446b getViewPager() {
        return this.f4468e;
    }

    public abstract void setCurrentIndicator(int i);

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f4479p;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }
}
