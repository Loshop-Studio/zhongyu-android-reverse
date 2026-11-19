package p251m9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.xuexiang.xui.widget.textview.badge.BadgeView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Random;

/* renamed from: m9.a */
/* loaded from: classes5.dex */
public class C10211a extends ValueAnimator {

    /* renamed from: c */
    public c[][] f24326c;

    /* renamed from: d */
    public WeakReference f24327d;

    /* renamed from: m9.a$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BadgeView badgeView = (BadgeView) C10211a.this.f24327d.get();
            if (badgeView == null || !badgeView.isShown()) {
                C10211a.this.cancel();
            } else {
                badgeView.invalidate();
            }
        }
    }

    /* renamed from: m9.a$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BadgeView badgeView = (BadgeView) C10211a.this.f24327d.get();
            if (badgeView != null) {
                badgeView.m13551B();
            }
        }
    }

    /* renamed from: m9.a$c */
    public static class c {

        /* renamed from: a */
        public Random f24330a;

        /* renamed from: b */
        public float f24331b;

        /* renamed from: c */
        public float f24332c;

        /* renamed from: d */
        public float f24333d;

        /* renamed from: e */
        public int f24334e;

        /* renamed from: f */
        public int f24335f;

        /* renamed from: g */
        public Paint f24336g;

        public c() {
            Paint paint = new Paint();
            this.f24336g = paint;
            paint.setAntiAlias(true);
            this.f24336g.setStyle(Paint.Style.FILL);
            this.f24330a = new Random();
        }

        /* renamed from: a */
        public void m21352a(float f10, Canvas canvas) {
            this.f24336g.setColor(this.f24334e);
            this.f24331b += this.f24330a.nextInt(this.f24335f) * 0.1f * (this.f24330a.nextFloat() - 0.5f);
            float fNextInt = this.f24332c + (this.f24330a.nextInt(this.f24335f) * 0.1f * (this.f24330a.nextFloat() - 0.5f));
            this.f24332c = fNextInt;
            float f11 = this.f24331b;
            float f12 = this.f24333d;
            canvas.drawCircle(f11, fNextInt, f12 - (f10 * f12), this.f24336g);
        }
    }

    public C10211a(Bitmap bitmap, PointF pointF, BadgeView badgeView) {
        this.f24327d = new WeakReference(badgeView);
        setFloatValues(0.0f, 1.0f);
        setDuration(500L);
        this.f24326c = m21351e(bitmap, pointF);
        addUpdateListener(new a());
        addListener(new b());
    }

    /* renamed from: d */
    public void m21350d(Canvas canvas) {
        for (c[] cVarArr : this.f24326c) {
            for (c cVar : cVarArr) {
                cVar.m21352a(Float.parseFloat(getAnimatedValue().toString()), canvas);
            }
        }
    }

    /* renamed from: e */
    public final c[][] m21351e(Bitmap bitmap, PointF pointF) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float fMin = Math.min(width, height) / 6.0f;
        float width2 = pointF.x - (bitmap.getWidth() / 2.0f);
        float height2 = pointF.y - (bitmap.getHeight() / 2.0f);
        c[][] cVarArr = (c[][]) Array.newInstance((Class<?>) c.class, (int) (height / fMin), (int) (width / fMin));
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            for (int i11 = 0; i11 < cVarArr[i10].length; i11++) {
                c cVar = new c();
                float f10 = i11 * fMin;
                float f11 = i10 * fMin;
                cVar.f24334e = bitmap.getPixel((int) f10, (int) f11);
                cVar.f24331b = f10 + width2;
                cVar.f24332c = f11 + height2;
                cVar.f24333d = fMin;
                cVar.f24335f = Math.max(width, height);
                cVarArr[i10][i11] = cVar;
            }
        }
        bitmap.recycle();
        return cVarArr;
    }
}
