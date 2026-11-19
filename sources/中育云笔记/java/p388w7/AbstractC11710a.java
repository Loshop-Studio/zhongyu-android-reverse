package p388w7;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: w7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11710a extends Drawable implements Animatable {

    /* renamed from: i */
    public static final Rect f27820i = new Rect();

    /* renamed from: d */
    public ArrayList f27822d;

    /* renamed from: g */
    public boolean f27825g;

    /* renamed from: h */
    public Paint f27826h;

    /* renamed from: c */
    public HashMap f27821c = new HashMap();

    /* renamed from: e */
    public int f27823e = 255;

    /* renamed from: f */
    public Rect f27824f = f27820i;

    public AbstractC11710a() {
        Paint paint = new Paint();
        this.f27826h = paint;
        paint.setColor(-1);
        this.f27826h.setStyle(Paint.Style.FILL);
        this.f27826h.setAntiAlias(true);
    }

    /* renamed from: a */
    public void m25889a(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f27821c.put(valueAnimator, animatorUpdateListener);
    }

    /* renamed from: b */
    public abstract void mo25890b(Canvas canvas, Paint paint);

    /* renamed from: c */
    public final void m25891c() {
        if (this.f27825g) {
            return;
        }
        this.f27822d = mo25895g();
        this.f27825g = true;
    }

    /* renamed from: d */
    public int m25892d() {
        return this.f27824f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        mo25890b(canvas, this.f27826h);
    }

    /* renamed from: e */
    public int m25893e() {
        return this.f27824f.width();
    }

    /* renamed from: f */
    public final boolean m25894f() {
        Iterator it = this.f27822d.iterator();
        if (it.hasNext()) {
            return ((ValueAnimator) it.next()).isStarted();
        }
        return false;
    }

    /* renamed from: g */
    public abstract ArrayList mo25895g();

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27823e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* renamed from: h */
    public void m25896h() {
        invalidateSelf();
    }

    /* renamed from: i */
    public void m25897i(int i10) {
        this.f27826h.setColor(i10);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator it = this.f27822d.iterator();
        if (it.hasNext()) {
            return ((ValueAnimator) it.next()).isRunning();
        }
        return false;
    }

    /* renamed from: j */
    public void m25898j(int i10, int i11, int i12, int i13) {
        this.f27824f = new Rect(i10, i11, i12, i13);
    }

    /* renamed from: k */
    public void m25899k(Rect rect) {
        m25898j(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: l */
    public final void m25900l() {
        for (int i10 = 0; i10 < this.f27822d.size(); i10++) {
            ValueAnimator valueAnimator = (ValueAnimator) this.f27822d.get(i10);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) this.f27821c.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    /* renamed from: m */
    public final void m25901m() {
        ArrayList arrayList = this.f27822d;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m25899k(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f27823e = i10;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        m25891c();
        if (this.f27822d == null || m25894f()) {
            return;
        }
        m25900l();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m25901m();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
