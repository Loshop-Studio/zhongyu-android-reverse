package com.xuexiang.xui.widget.picker.wheelview;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p070b.p113c.p114a.p116e.p138g.p139a.p140b.InterfaceC0848a;
import p070b.p113c.p114a.p116e.p138g.p139a.p141c.InterfaceC0849a;
import p070b.p113c.p114a.p116e.p138g.p139a.p142d.InterfaceC0851b;
import p070b.p113c.p114a.p116e.p138g.p139a.p143e.C0854c;

/* loaded from: classes.dex */
public class WheelView extends View implements HasTypeface {

    /* renamed from: A */
    public float f5313A;

    /* renamed from: B */
    public float f5314B;

    /* renamed from: C */
    public float f5315C;

    /* renamed from: D */
    public float f5316D;

    /* renamed from: E */
    public int f5317E;

    /* renamed from: F */
    public int f5318F;

    /* renamed from: G */
    public int f5319G;

    /* renamed from: H */
    public int f5320H;

    /* renamed from: I */
    public int f5321I;

    /* renamed from: J */
    public int f5322J;

    /* renamed from: K */
    public int f5323K;

    /* renamed from: L */
    public int f5324L;

    /* renamed from: M */
    public float f5325M;

    /* renamed from: N */
    public long f5326N;

    /* renamed from: O */
    public int f5327O;

    /* renamed from: P */
    public int f5328P;

    /* renamed from: Q */
    public int f5329Q;

    /* renamed from: R */
    public int f5330R;

    /* renamed from: S */
    public float f5331S;

    /* renamed from: b */
    public EnumC0978b f5332b;

    /* renamed from: c */
    public Context f5333c;

    /* renamed from: d */
    public Handler f5334d;

    /* renamed from: e */
    public GestureDetector f5335e;

    /* renamed from: f */
    public InterfaceC0851b f5336f;

    /* renamed from: g */
    public boolean f5337g;

    /* renamed from: h */
    public boolean f5338h;

    /* renamed from: i */
    public ScheduledExecutorService f5339i;

    /* renamed from: j */
    public ScheduledFuture<?> f5340j;

    /* renamed from: k */
    public TextPaint f5341k;

    /* renamed from: l */
    public TextPaint f5342l;

    /* renamed from: m */
    public Paint f5343m;

    /* renamed from: n */
    public InterfaceC0848a f5344n;

    /* renamed from: o */
    public String f5345o;

    /* renamed from: p */
    public int f5346p;

    /* renamed from: q */
    public int f5347q;

    /* renamed from: r */
    public int f5348r;

    /* renamed from: s */
    public int f5349s;

    /* renamed from: t */
    public float f5350t;

    /* renamed from: u */
    public Typeface f5351u;

    /* renamed from: v */
    public int f5352v;

    /* renamed from: w */
    public int f5353w;

    /* renamed from: x */
    public int f5354x;

    /* renamed from: y */
    public float f5355y;

    /* renamed from: z */
    public boolean f5356z;

    /* renamed from: com.xuexiang.xui.widget.picker.wheelview.WheelView$a */
    public enum EnumC0977a {
        CLICK,
        FLING,
        DAGGLE
    }

    /* renamed from: com.xuexiang.xui.widget.picker.wheelview.WheelView$b */
    public enum EnumC0978b {
        FILL,
        WRAP
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WheelView(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.picker.wheelview.WheelView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public void m2774a() {
        ScheduledFuture<?> scheduledFuture = this.f5340j;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f5340j.cancel(true);
        this.f5340j = null;
    }

    /* renamed from: b */
    public final String m2775b(Object obj) {
        return obj == null ? BuildConfig.FLAVOR : obj instanceof InterfaceC0849a ? ((InterfaceC0849a) obj).m2559a() : obj instanceof Integer ? String.format(Locale.getDefault(), "%02d", obj) : obj.toString();
    }

    /* renamed from: c */
    public final int m2776c(int i) {
        int iM2558a = this.f5344n.m2558a();
        return i < 0 ? m2776c(iM2558a + i) : i > iM2558a + (-1) ? m2776c(i - this.f5344n.m2558a()) : i;
    }

    /* renamed from: d */
    public final void m2777d() {
        float f2 = this.f5355y;
        float f3 = 1.0f;
        if (f2 >= 1.0f) {
            f3 = 4.0f;
            if (f2 <= 4.0f) {
                return;
            }
        }
        this.f5355y = f3;
    }

    /* renamed from: e */
    public final void m2778e() {
        if (this.f5344n == null) {
            return;
        }
        Rect rect = new Rect();
        for (int i = 0; i < this.f5344n.m2558a(); i++) {
            String strM2775b = m2775b(this.f5344n.getItem(i));
            this.f5342l.getTextBounds(strM2775b, 0, strM2775b.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.f5347q) {
                this.f5347q = iWidth;
            }
            this.f5342l.getTextBounds("星期", 0, 2, rect);
            this.f5348r = rect.height() + 2;
        }
        float f2 = this.f5355y * this.f5348r;
        this.f5350t = f2;
        this.f5321I = (int) ((r0 * 2) / 3.141592653589793d);
        this.f5323K = (int) (((int) (f2 * (this.f5320H - 1))) / 3.141592653589793d);
        this.f5322J = View.MeasureSpec.getSize(this.f5327O);
        int i2 = this.f5321I;
        float f3 = this.f5350t;
        this.f5313A = (i2 - f3) / 2.0f;
        float f4 = (i2 + f3) / 2.0f;
        this.f5314B = f4;
        this.f5315C = (f4 - ((f3 - this.f5348r) / 2.0f)) - this.f5331S;
        if (this.f5317E == -1) {
            if (this.f5356z) {
                this.f5317E = (this.f5344n.m2558a() + 1) / 2;
            } else {
                this.f5317E = 0;
            }
        }
        this.f5319G = this.f5317E;
    }

    /* renamed from: f */
    public void m2779f(EnumC0977a enumC0977a) {
        m2774a();
        if (enumC0977a == EnumC0977a.FLING || enumC0977a == EnumC0977a.DAGGLE) {
            float f2 = this.f5316D;
            float f3 = this.f5350t;
            int i = (int) (((f2 % f3) + f3) % f3);
            this.f5324L = i;
            float f4 = i;
            this.f5324L = f4 > f3 / 2.0f ? (int) (f3 - f4) : -i;
        }
        this.f5340j = this.f5339i.scheduleWithFixedDelay(new C0854c(this, this.f5324L), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public final InterfaceC0848a getAdapter() {
        return this.f5344n;
    }

    public final int getCurrentItem() {
        int i;
        InterfaceC0848a interfaceC0848a = this.f5344n;
        if (interfaceC0848a == null) {
            return 0;
        }
        return Math.max(0, Math.min((!this.f5356z || ((i = this.f5318F) >= 0 && i < interfaceC0848a.m2558a())) ? this.f5318F : Math.abs(Math.abs(this.f5318F) - this.f5344n.m2558a()), this.f5344n.m2558a() - 1));
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f5334d;
    }

    public int getInitPosition() {
        return this.f5317E;
    }

    public float getItemHeight() {
        return this.f5350t;
    }

    public int getItemsCount() {
        InterfaceC0848a interfaceC0848a = this.f5344n;
        if (interfaceC0848a != null) {
            return interfaceC0848a.m2558a();
        }
        return 0;
    }

    public float getTotalScrollY() {
        return this.f5316D;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03dd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.picker.wheelview.WheelView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f5327O = i;
        m2778e();
        setMeasuredDimension(this.f5322J, this.f5321I);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.f5335e.onTouchEvent(motionEvent);
        float f2 = (-this.f5317E) * this.f5350t;
        float fM2558a = ((this.f5344n.m2558a() - 1) - this.f5317E) * this.f5350t;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f5326N = System.currentTimeMillis();
            m2774a();
            this.f5325M = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f5325M - motionEvent.getRawY();
            this.f5325M = motionEvent.getRawY();
            float f3 = this.f5316D + rawY;
            this.f5316D = f3;
            if (!this.f5356z) {
                float f4 = this.f5350t;
                if ((f3 - (f4 * 0.25f) < f2 && rawY < 0.0f) || ((f4 * 0.25f) + f3 > fM2558a && rawY > 0.0f)) {
                    this.f5316D = f3 - rawY;
                    z = true;
                }
            }
        } else if (!zOnTouchEvent) {
            float y = motionEvent.getY();
            int i = this.f5323K;
            double dAcos = Math.acos((i - y) / i) * this.f5323K;
            float f5 = this.f5350t;
            this.f5324L = (int) (((((int) ((dAcos + (f5 / 2.0f)) / f5)) - (this.f5320H / 2)) * f5) - (((this.f5316D % f5) + f5) % f5));
            m2779f(System.currentTimeMillis() - this.f5326N > 120 ? EnumC0977a.DAGGLE : EnumC0977a.CLICK);
        }
        if (!z && motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(InterfaceC0848a interfaceC0848a) {
        this.f5344n = interfaceC0848a;
        m2778e();
        invalidate();
    }

    public final void setCurrentItem(int i) {
        this.f5318F = i;
        this.f5317E = i;
        this.f5316D = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z) {
        this.f5356z = z;
    }

    public void setDividerColor(int i) {
        this.f5354x = i;
        this.f5343m.setColor(i);
    }

    public void setDividerType(EnumC0978b enumC0978b) {
        this.f5332b = enumC0978b;
    }

    public void setGravity(int i) {
        this.f5328P = i;
    }

    public void setIsOptions(boolean z) {
        this.f5337g = z;
    }

    public void setLabel(String str) {
        this.f5345o = str;
    }

    public void setLineSpacingMultiplier(float f2) {
        if (f2 != 0.0f) {
            this.f5355y = f2;
            m2777d();
        }
    }

    public final void setOnItemSelectedListener(InterfaceC0851b interfaceC0851b) {
        this.f5336f = interfaceC0851b;
    }

    public void setTextColorCenter(int i) {
        this.f5353w = i;
        this.f5342l.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.f5352v = i;
        this.f5341k.setColor(i);
    }

    public final void setTextSize(float f2) {
        if (f2 > 0.0f) {
            int i = (int) (this.f5333c.getResources().getDisplayMetrics().density * f2);
            this.f5346p = i;
            this.f5341k.setTextSize(i);
            this.f5342l.setTextSize(this.f5346p);
        }
    }

    public void setTextXOffset(int i) {
        this.f5349s = i;
        if (i != 0) {
            this.f5342l.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f2) {
        this.f5316D = f2;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.f5351u = typeface;
        this.f5341k.setTypeface(typeface);
        this.f5342l.setTypeface(this.f5351u);
    }
}
