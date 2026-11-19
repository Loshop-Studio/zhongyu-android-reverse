package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.r */
/* loaded from: classes.dex */
public class C0746r extends AbstractC0739m0 {

    /* renamed from: b */
    private float f4456b = 3.0f;

    /* renamed from: c */
    private int f4457c = 80;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m3915h(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f4457c
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L19
            int r7 = androidx.core.view.C0358u.m1978A(r7)
            if (r7 != r4) goto L12
            goto L13
        L12:
            r4 = 0
        L13:
            if (r4 == 0) goto L17
        L15:
            r0 = 5
            goto L29
        L17:
            r0 = 3
            goto L29
        L19:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L29
            int r7 = androidx.core.view.C0358u.m1978A(r7)
            if (r7 != r4) goto L25
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L15
            goto L17
        L29:
            if (r0 == r2) goto L51
            if (r0 == r1) goto L48
            r7 = 48
            if (r0 == r7) goto L3f
            r7 = 80
            if (r0 == r7) goto L36
            goto L59
        L36:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L59
        L3f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L59
        L48:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L59
        L51:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C0746r.m3915h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    /* renamed from: i */
    private int m3916i(ViewGroup viewGroup) {
        int i4 = this.f4457c;
        return (i4 == 3 || i4 == 5 || i4 == 8388611 || i4 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.AbstractC0750v
    /* renamed from: c */
    public long mo3847c(ViewGroup viewGroup, Transition transition, C0752x c0752x, C0752x c0752x2) {
        int i4;
        int iCenterX;
        int iCenterY;
        C0752x c0752x3 = c0752x;
        if (c0752x3 == null && c0752x2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (c0752x2 == null || m3907e(c0752x3) == 0) {
            i4 = -1;
        } else {
            c0752x3 = c0752x2;
            i4 = 1;
        }
        int iM3908f = m3908f(c0752x3);
        int iM3909g = m3909g(c0752x3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fM3915h = m3915h(viewGroup, iM3908f, iM3909g, iCenterX, iCenterY, iRound, iRound2, width, height) / m3916i(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * i4) / this.f4456b) * fM3915h);
    }

    /* renamed from: j */
    public void m3917j(int i4) {
        this.f4457c = i4;
    }
}
