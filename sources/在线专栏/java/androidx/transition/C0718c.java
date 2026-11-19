package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: androidx.transition.c */
/* loaded from: classes.dex */
public class C0718c extends AbstractC0739m0 {

    /* renamed from: b */
    private float f4395b = 3.0f;

    /* renamed from: h */
    private static float m3846h(float f4, float f5, float f6, float f7) {
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        return (float) Math.sqrt((f8 * f8) + (f9 * f9));
    }

    @Override // androidx.transition.AbstractC0750v
    /* renamed from: c */
    public long mo3847c(ViewGroup viewGroup, Transition transition, C0752x c0752x, C0752x c0752x2) {
        int i4;
        int iRound;
        int iCenterX;
        if (c0752x == null && c0752x2 == null) {
            return 0L;
        }
        if (c0752x2 == null || m3907e(c0752x) == 0) {
            i4 = -1;
        } else {
            c0752x = c0752x2;
            i4 = 1;
        }
        int iM3908f = m3908f(c0752x);
        int iM3909g = m3909g(c0752x);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iRound = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fM3846h = m3846h(iM3908f, iM3909g, iCenterX, iRound) / m3846h(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * i4) / this.f4395b) * fM3846h);
    }
}
