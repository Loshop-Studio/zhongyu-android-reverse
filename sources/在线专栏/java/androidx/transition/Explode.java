package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class Explode extends Visibility {

    /* renamed from: b */
    private static final TimeInterpolator f4339b = new DecelerateInterpolator();

    /* renamed from: c */
    private static final TimeInterpolator f4340c = new AccelerateInterpolator();

    /* renamed from: a */
    private int[] f4341a;

    public Explode() {
        this.f4341a = new int[2];
        setPropagation(new C0718c());
    }

    /* renamed from: a */
    private static float m3806a(float f4, float f5) {
        return (float) Math.sqrt((f4 * f4) + (f5 * f5));
    }

    /* renamed from: b */
    private static float m3807b(View view, int i4, int i5) {
        return m3806a(Math.max(i4, view.getWidth() - i4), Math.max(i5, view.getHeight() - i5));
    }

    /* renamed from: c */
    private void m3808c(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.f4341a);
        int[] iArr2 = this.f4341a;
        int i4 = iArr2[0];
        int i5 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            width = (view.getWidth() / 2) + i4 + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i5 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == IGoodView.DEFAULT_TO_ALPHA && fCenterY == IGoodView.DEFAULT_TO_ALPHA) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fM3806a = m3806a(fCenterX, fCenterY);
        float fM3807b = m3807b(view, width - i4, iCenterY - i5);
        iArr[0] = Math.round((fCenterX / fM3806a) * fM3807b);
        iArr[1] = Math.round(fM3807b * (fCenterY / fM3806a));
    }

    private void captureValues(C0752x c0752x) {
        View view = c0752x.f4483b;
        view.getLocationOnScreen(this.f4341a);
        int[] iArr = this.f4341a;
        int i4 = iArr[0];
        int i5 = iArr[1];
        c0752x.f4482a.put("android:explode:screenBounds", new Rect(i4, i5, view.getWidth() + i4, view.getHeight() + i5));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(C0752x c0752x) {
        super.captureEndValues(c0752x);
        captureValues(c0752x);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(C0752x c0752x) {
        super.captureStartValues(c0752x);
        captureValues(c0752x);
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        if (c0752x2 == null) {
            return null;
        }
        Rect rect = (Rect) c0752x2.f4482a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m3808c(viewGroup, rect, this.f4341a);
        int[] iArr = this.f4341a;
        return C0754z.m3927a(view, c0752x2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f4339b, this);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        float f4;
        float f5;
        if (c0752x == null) {
            return null;
        }
        Rect rect = (Rect) c0752x.f4482a.get("android:explode:screenBounds");
        int i4 = rect.left;
        int i5 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c0752x.f4483b.getTag(C0742o.f4451f);
        if (iArr != null) {
            f4 = (iArr[0] - rect.left) + translationX;
            f5 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f4 = translationX;
            f5 = translationY;
        }
        m3808c(viewGroup, rect, this.f4341a);
        int[] iArr2 = this.f4341a;
        return C0754z.m3927a(view, c0752x, i4, i5, translationX, translationY, f4 + iArr2[0], f5 + iArr2[1], f4340c, this);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4341a = new int[2];
        setPropagation(new C0718c());
    }
}
