package p404x7;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.material3.MenuKt;
import java.util.ArrayList;
import p388w7.AbstractC11710a;

/* renamed from: x7.a */
/* loaded from: classes5.dex */
public class C11810a extends AbstractC11710a {

    /* renamed from: j */
    public float[] f28040j = {1.0f, 1.0f, 1.0f};

    /* renamed from: x7.a$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ int f28041a;

        public a(int i10) {
            this.f28041a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C11810a.this.f28040j[this.f28041a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C11810a.this.m25896h();
        }
    }

    @Override // p388w7.AbstractC11710a
    /* renamed from: b */
    public void mo25890b(Canvas canvas, Paint paint) {
        float fMin = (Math.min(m25893e(), m25892d()) - 8.0f) / 6.0f;
        float f10 = 2.0f * fMin;
        float fM25893e = (m25893e() / 2) - (f10 + 4.0f);
        float fM25892d = m25892d() / 2;
        for (int i10 = 0; i10 < 3; i10++) {
            canvas.save();
            float f11 = i10;
            canvas.translate((f10 * f11) + fM25893e + (f11 * 4.0f), fM25892d);
            float f12 = this.f28040j[i10];
            canvas.scale(f12, f12);
            canvas.drawCircle(0.0f, 0.0f, fMin, paint);
            canvas.restore();
        }
    }

    @Override // p388w7.AbstractC11710a
    /* renamed from: g */
    public ArrayList mo25895g() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {MenuKt.InTransitionDuration, 240, 360};
        for (int i10 = 0; i10 < 3; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i10]);
            m25889a(valueAnimatorOfFloat, new a(i10));
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
