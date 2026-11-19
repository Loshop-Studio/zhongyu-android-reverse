package moe.codeest.enviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.camera.video.AudioStats;
import com.shuyu.gsyvideoplayer.R$styleable;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoView;

/* loaded from: classes6.dex */
public class ENDownloadView extends View {

    /* renamed from: y */
    public static final DownloadUnit f24394y = DownloadUnit.B;

    /* renamed from: c */
    public int f24395c;

    /* renamed from: d */
    public float f24396d;

    /* renamed from: e */
    public double f24397e;

    /* renamed from: f */
    public double f24398f;

    /* renamed from: g */
    public int f24399g;

    /* renamed from: h */
    public int f24400h;

    /* renamed from: i */
    public DownloadUnit f24401i;

    /* renamed from: j */
    public Paint f24402j;

    /* renamed from: k */
    public Paint f24403k;

    /* renamed from: l */
    public Paint f24404l;

    /* renamed from: m */
    public Path f24405m;

    /* renamed from: n */
    public RectF f24406n;

    /* renamed from: o */
    public RectF f24407o;

    /* renamed from: p */
    public ValueAnimator f24408p;

    /* renamed from: q */
    public float f24409q;

    /* renamed from: r */
    public float f24410r;

    /* renamed from: s */
    public float f24411s;

    /* renamed from: t */
    public float f24412t;

    /* renamed from: u */
    public float f24413u;

    /* renamed from: v */
    public float f24414v;

    /* renamed from: w */
    public float f24415w;

    /* renamed from: x */
    public float f24416x;

    public enum DownloadUnit {
        GB,
        MB,
        KB,
        B,
        NONE
    }

    /* renamed from: moe.codeest.enviews.ENDownloadView$a */
    public class C10263a implements ValueAnimator.AnimatorUpdateListener {
        public C10263a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENDownloadView.this.f24409q = valueAnimator.getAnimatedFraction();
            ENDownloadView.this.invalidate();
        }
    }

    /* renamed from: moe.codeest.enviews.ENDownloadView$b */
    public class C10264b extends AnimatorListenerAdapter {
        public C10264b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ENDownloadView.this.f24395c = 1;
            ENDownloadView.this.m21387h();
        }
    }

    /* renamed from: moe.codeest.enviews.ENDownloadView$c */
    public class C10265c implements ValueAnimator.AnimatorUpdateListener {
        public C10265c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ENDownloadView.this.f24409q = valueAnimator.getAnimatedFraction();
            if (ENDownloadView.this.f24401i != DownloadUnit.NONE && ENDownloadView.this.f24398f > AudioStats.AUDIO_AMPLITUDE_NONE) {
                ENDownloadView.this.f24397e = r5.f24409q * ENDownloadView.this.f24398f;
            }
            ENDownloadView.this.invalidate();
        }
    }

    /* renamed from: moe.codeest.enviews.ENDownloadView$d */
    public class C10266d extends AnimatorListenerAdapter {
        public C10266d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ENDownloadView.this.f24395c = 1;
            ENDownloadView.this.m21387h();
        }
    }

    /* renamed from: moe.codeest.enviews.ENDownloadView$e */
    public static /* synthetic */ class C10267e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24427a;

        static {
            int[] iArr = new int[DownloadUnit.values().length];
            f24427a = iArr;
            try {
                iArr[DownloadUnit.GB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24427a[DownloadUnit.MB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24427a[DownloadUnit.KB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24427a[DownloadUnit.B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: moe.codeest.enviews.ENDownloadView$f */
    public interface InterfaceC10268f {
    }

    public ENDownloadView(Context context) {
        super(context);
    }

    public int getCurrentState() {
        return this.f24395c;
    }

    /* renamed from: h */
    public final void m21387h() {
        ValueAnimator valueAnimator = this.f24408p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f24408p.removeAllUpdateListeners();
            if (this.f24408p.isRunning()) {
                this.f24408p.cancel();
            }
            this.f24408p = null;
        }
        if (this.f24395c != 1) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        this.f24408p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f24400h);
        this.f24408p.setInterpolator(new LinearInterpolator());
        this.f24408p.addUpdateListener(new C10265c());
        this.f24408p.addListener(new C10266d());
        this.f24408p.start();
    }

    /* renamed from: i */
    public final String m21388i(DownloadUnit downloadUnit) {
        int i10 = C10267e.f24427a[downloadUnit.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? " b" : " kb" : " mb" : " gb";
    }

    /* renamed from: j */
    public void m21389j() {
        this.f24409q = 0.0f;
        this.f24395c = 0;
        ValueAnimator valueAnimator = this.f24408p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f24408p.removeAllUpdateListeners();
            if (this.f24408p.isRunning()) {
                this.f24408p.cancel();
            }
            this.f24408p = null;
        }
    }

    /* renamed from: k */
    public void m21390k() {
        ValueAnimator valueAnimator = this.f24408p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f24408p.removeAllUpdateListeners();
            if (this.f24408p.isRunning()) {
                this.f24408p.cancel();
            }
            this.f24408p = null;
        }
        this.f24395c = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        this.f24408p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1500L);
        this.f24408p.setInterpolator(new OvershootInterpolator());
        this.f24408p.addUpdateListener(new C10263a());
        this.f24408p.addListener(new C10264b());
        this.f24408p.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = this.f24395c;
        if (i10 == 0) {
            float f10 = this.f24409q;
            if (f10 <= 0.4d) {
                canvas.drawCircle(this.f24412t, this.f24413u, this.f24415w, this.f24403k);
                float f11 = this.f24412t;
                float f12 = this.f24414v;
                float f13 = this.f24413u;
                canvas.drawLine(f11 - f12, f13, f11, f12 + f13, this.f24402j);
                float f14 = this.f24412t;
                float f15 = this.f24413u;
                float f16 = this.f24414v;
                canvas.drawLine(f14, f15 + f16, f14 + f16, f15, this.f24402j);
                float f17 = this.f24412t;
                float f18 = this.f24413u;
                float f19 = this.f24414v;
                float f20 = this.f24409q;
                canvas.drawLine(f17, (f18 + f19) - (((f19 * 1.3f) / 0.4f) * f20), f17, (f18 - (1.6f * f19)) + (((f19 * 1.3f) / 0.4f) * f20), this.f24402j);
                return;
            }
            if (f10 <= 0.6d) {
                canvas.drawCircle(this.f24412t, this.f24413u, this.f24415w, this.f24403k);
                canvas.drawCircle(this.f24412t, this.f24413u - (this.f24414v * 0.3f), 2.0f, this.f24402j);
                float f21 = this.f24412t;
                float f22 = this.f24414v;
                float f23 = this.f24409q;
                float f24 = this.f24413u;
                canvas.drawLine((f21 - f22) - (((f22 * 1.2f) / 0.2f) * (f23 - 0.4f)), f24, f21, (f24 + f22) - ((f22 / 0.2f) * (f23 - 0.4f)), this.f24402j);
                float f25 = this.f24412t;
                float f26 = this.f24413u;
                float f27 = this.f24414v;
                float f28 = this.f24409q;
                canvas.drawLine(f25, (f26 + f27) - ((f27 / 0.2f) * (f28 - 0.4f)), f25 + f27 + (((f27 * 1.2f) / 0.2f) * (f28 - 0.4f)), f26, this.f24402j);
                return;
            }
            if (f10 > 1.0f) {
                canvas.drawCircle(this.f24412t, this.f24413u, this.f24415w, this.f24403k);
                canvas.drawCircle(this.f24412t, (this.f24413u - this.f24415w) - ((this.f24414v * 3.0f) * (this.f24409q - 1.0f)), 3.0f, this.f24402j);
                float f29 = this.f24412t;
                float f30 = this.f24414v;
                float f31 = f29 - (f30 * 2.2f);
                float f32 = this.f24413u;
                canvas.drawLine(f31, f32, f29 + (f30 * 2.2f), f32, this.f24402j);
                return;
            }
            canvas.drawCircle(this.f24412t, this.f24413u, this.f24415w, this.f24403k);
            float f33 = this.f24412t;
            float f34 = this.f24413u;
            float f35 = this.f24414v;
            canvas.drawCircle(f33, (f34 - (f35 * 0.3f)) - (((this.f24415w - (f35 * 0.3f)) / 0.4f) * (this.f24409q - 0.6f)), 2.0f, this.f24402j);
            float f36 = this.f24412t;
            float f37 = this.f24414v;
            float f38 = f36 - (f37 * 2.2f);
            float f39 = this.f24413u;
            canvas.drawLine(f38, f39, f36 + (f37 * 2.2f), f39, this.f24402j);
            return;
        }
        if (i10 == 1) {
            float f40 = this.f24409q;
            if (f40 <= 0.2d) {
                this.f24404l.setTextSize((this.f24399g / 0.2f) * f40);
            }
            canvas.drawCircle(this.f24412t, this.f24413u, this.f24415w, this.f24403k);
            canvas.drawArc(this.f24406n, -90.0f, this.f24409q * 359.99f, false, this.f24402j);
            this.f24405m.reset();
            float f41 = this.f24396d + 2.0f;
            this.f24396d = f41;
            float f42 = this.f24412t;
            float f43 = this.f24416x;
            if (f41 > f42 - (6.0f * f43)) {
                this.f24396d = f42 - (f43 * 10.0f);
            }
            this.f24405m.moveTo(this.f24396d, this.f24413u);
            for (int i11 = 0; i11 < 4; i11++) {
                Path path = this.f24405m;
                float f44 = this.f24416x;
                path.rQuadTo(f44, (-(1.0f - this.f24409q)) * f44, f44 * 2.0f, 0.0f);
                Path path2 = this.f24405m;
                float f45 = this.f24416x;
                path2.rQuadTo(f45, (1.0f - this.f24409q) * f45, f45 * 2.0f, 0.0f);
            }
            canvas.save();
            canvas.clipRect(this.f24407o);
            canvas.drawPath(this.f24405m, this.f24402j);
            canvas.restore();
            DownloadUnit downloadUnit = DownloadUnit.GB;
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            canvas.drawCircle(this.f24412t, this.f24413u, this.f24415w, this.f24403k);
            float f46 = this.f24412t;
            float f47 = this.f24414v;
            float f48 = f46 - f47;
            float f49 = this.f24413u;
            float f50 = this.f24409q;
            canvas.drawLine(f48, f49, (f46 - (f47 * 0.5f)) + (f47 * 0.5f * f50), (f47 * 0.35f * f50) + (f47 * 0.65f) + f49, this.f24402j);
            float f51 = this.f24412t;
            float f52 = this.f24414v;
            float f53 = this.f24409q;
            float f54 = this.f24413u;
            canvas.drawLine((f51 - (f52 * 0.5f)) + (f52 * 0.5f * f53), (f52 * 0.65f) + f54 + (f52 * 0.35f * f53), (f51 + (1.2f * f52)) - ((0.2f * f52) * f53), (f54 - (f52 * 1.3f)) + (f52 * 1.3f * f53), this.f24402j);
            float f55 = this.f24412t;
            float f56 = this.f24414v;
            float f57 = this.f24409q;
            float f58 = this.f24413u;
            canvas.drawLine((f55 - (f56 * 0.5f)) + (f56 * 0.5f * f57), (f56 * 0.65f) + f58 + (0.35f * f56 * f57), (f55 - (f56 * 0.5f)) + (0.5f * f56 * f57), (f58 + (0.65f * f56)) - ((f56 * 2.25f) * f57), this.f24402j);
            return;
        }
        canvas.drawCircle(this.f24412t, this.f24413u, this.f24415w, this.f24402j);
        float f59 = this.f24409q;
        if (f59 <= 0.5d) {
            Paint paint = this.f24404l;
            int i12 = this.f24399g;
            paint.setTextSize(i12 - ((i12 / 0.2f) * f59));
        } else {
            this.f24404l.setTextSize(0.0f);
        }
        if (this.f24401i != DownloadUnit.NONE && this.f24397e > AudioStats.AUDIO_AMPLITUDE_NONE) {
            canvas.drawText(String.format("%.2f", Double.valueOf(this.f24397e)) + m21388i(this.f24401i), this.f24412t, this.f24413u + (this.f24414v * 1.4f), this.f24404l);
        }
        float f60 = this.f24412t;
        float f61 = this.f24414v;
        float f62 = this.f24409q;
        float f63 = (f60 - (f61 * 2.2f)) + (1.2f * f61 * f62);
        float f64 = this.f24413u;
        canvas.drawLine(f63, f64, f60 - (f61 * 0.5f), f64 + (f61 * 0.5f * f62 * 1.3f), this.f24402j);
        float f65 = this.f24412t;
        float f66 = this.f24414v;
        float f67 = this.f24413u;
        float f68 = this.f24409q;
        canvas.drawLine(f65 - (f66 * 0.5f), (0.5f * f66 * f68 * 1.3f) + f67, (f65 + (2.2f * f66)) - (f66 * f68), f67 - ((f66 * f68) * 1.3f), this.f24402j);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10;
        this.f24410r = f10;
        float f11 = i11;
        this.f24411s = f11;
        float f12 = f10 / 2.0f;
        this.f24412t = f12;
        this.f24413u = f11 / 2.0f;
        float f13 = (f10 * 5.0f) / 12.0f;
        this.f24415w = f13;
        float f14 = f13 / 3.0f;
        this.f24414v = f14;
        float f15 = (f14 * 4.4f) / 12.0f;
        this.f24416x = f15;
        this.f24396d = f12 - (f15 * 10.0f);
        float f16 = this.f24412t;
        float f17 = this.f24415w;
        float f18 = this.f24413u;
        this.f24406n = new RectF(f16 - f17, f18 - f17, f16 + f17, f18 + f17);
        float f19 = this.f24412t;
        float f20 = this.f24416x;
        this.f24407o = new RectF(f19 - (f20 * 6.0f), 0.0f, f19 + (f20 * 6.0f), this.f24411s);
    }

    public void setOnDownloadStateListener(InterfaceC10268f interfaceC10268f) {
    }

    public ENDownloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.download);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.download_download_line_color, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.download_download_bg_line_color, -12959931);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.download_download_text_color, -1);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.download_download_line_width, 9);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.download_download_bg_line_width, 9);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(R$styleable.download_download_text_size, 14);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f24402j = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f24402j;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f24402j.setStrokeWidth(integer);
        this.f24402j.setColor(color);
        Paint paint3 = new Paint(1);
        this.f24403k = paint3;
        paint3.setStyle(style);
        this.f24403k.setStrokeCap(cap);
        this.f24403k.setStrokeWidth(integer2);
        this.f24403k.setColor(color2);
        Paint paint4 = new Paint(1);
        this.f24404l = paint4;
        paint4.setColor(color3);
        this.f24404l.setTextSize(integer3);
        this.f24404l.setTextAlign(Paint.Align.CENTER);
        this.f24405m = new Path();
        this.f24399g = integer3;
        this.f24395c = 0;
        this.f24401i = f24394y;
        this.f24400h = GSYVideoView.CHANGE_DELAY_TIME;
    }
}
