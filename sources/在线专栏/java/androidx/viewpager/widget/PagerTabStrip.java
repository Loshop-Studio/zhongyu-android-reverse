package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0332a;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: A */
    private boolean f4607A;

    /* renamed from: B */
    private int f4608B;

    /* renamed from: C */
    private boolean f4609C;

    /* renamed from: D */
    private float f4610D;

    /* renamed from: E */
    private float f4611E;

    /* renamed from: F */
    private int f4612F;

    /* renamed from: q */
    private int f4613q;

    /* renamed from: r */
    private int f4614r;

    /* renamed from: s */
    private int f4615s;

    /* renamed from: t */
    private int f4616t;

    /* renamed from: u */
    private int f4617u;

    /* renamed from: v */
    private int f4618v;

    /* renamed from: w */
    private final Paint f4619w;

    /* renamed from: x */
    private final Rect f4620x;

    /* renamed from: y */
    private int f4621y;

    /* renamed from: z */
    private boolean f4622z;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    class ViewOnClickListenerC0766a implements View.OnClickListener {
        ViewOnClickListenerC0766a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            PagerTabStrip.this.f4627a.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    class ViewOnClickListenerC0767b implements View.OnClickListener {
        ViewOnClickListenerC0767b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            ViewPager viewPager = PagerTabStrip.this.f4627a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f4619w = paint;
        this.f4620x = new Rect();
        this.f4621y = 255;
        this.f4622z = false;
        this.f4607A = false;
        int i4 = this.f4640n;
        this.f4613q = i4;
        paint.setColor(i4);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f4614r = (int) ((3.0f * f4) + 0.5f);
        this.f4615s = (int) ((6.0f * f4) + 0.5f);
        this.f4616t = (int) (64.0f * f4);
        this.f4618v = (int) ((16.0f * f4) + 0.5f);
        this.f4608B = (int) ((1.0f * f4) + 0.5f);
        this.f4617u = (int) ((f4 * 32.0f) + 0.5f);
        this.f4612F = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f4628b.setFocusable(true);
        this.f4628b.setOnClickListener(new ViewOnClickListenerC0766a());
        this.f4630d.setFocusable(true);
        this.f4630d.setOnClickListener(new ViewOnClickListenerC0767b());
        if (getBackground() == null) {
            this.f4622z = true;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: d */
    void mo4036d(int i4, float f4, boolean z3) {
        Rect rect = this.f4620x;
        int height = getHeight();
        int left = this.f4629c.getLeft() - this.f4618v;
        int right = this.f4629c.getRight() + this.f4618v;
        int i5 = height - this.f4614r;
        rect.set(left, i5, right, height);
        super.mo4036d(i4, f4, z3);
        this.f4621y = (int) (Math.abs(f4 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f4629c.getLeft() - this.f4618v, i5, this.f4629c.getRight() + this.f4618v, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f4622z;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f4617u);
    }

    public int getTabIndicatorColor() {
        return this.f4613q;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f4629c.getLeft() - this.f4618v;
        int right = this.f4629c.getRight() + this.f4618v;
        int i4 = height - this.f4614r;
        this.f4619w.setColor((this.f4621y << 24) | (this.f4613q & 16777215));
        float f4 = height;
        canvas.drawRect(left, i4, right, f4, this.f4619w);
        if (this.f4622z) {
            this.f4619w.setColor((-16777216) | (this.f4613q & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f4608B, getWidth() - getPaddingRight(), f4, this.f4619w);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction();
        if (action != 0 && this.f4609C) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (action == 0) {
            this.f4610D = x3;
            this.f4611E = y3;
            this.f4609C = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x3 - this.f4610D) > this.f4612F || Math.abs(y3 - this.f4611E) > this.f4612F)) {
                this.f4609C = true;
            }
        } else if (x3 < this.f4629c.getLeft() - this.f4618v) {
            ViewPager viewPager = this.f4627a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x3 > this.f4629c.getRight() + this.f4618v) {
            ViewPager viewPager2 = this.f4627a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        super.setBackgroundColor(i4);
        if (this.f4607A) {
            return;
        }
        this.f4622z = (i4 & IGoodView.DEFAULT_TEXT_COLOR) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4607A) {
            return;
        }
        this.f4622z = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        if (this.f4607A) {
            return;
        }
        this.f4622z = i4 == 0;
    }

    public void setDrawFullUnderline(boolean z3) {
        this.f4622z = z3;
        this.f4607A = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        int i8 = this.f4615s;
        if (i7 < i8) {
            i7 = i8;
        }
        super.setPadding(i4, i5, i6, i7);
    }

    public void setTabIndicatorColor(int i4) {
        this.f4613q = i4;
        this.f4619w.setColor(i4);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i4) {
        setTabIndicatorColor(C0332a.m1804b(getContext(), i4));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i4) {
        int i5 = this.f4616t;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setTextSpacing(i4);
    }
}
