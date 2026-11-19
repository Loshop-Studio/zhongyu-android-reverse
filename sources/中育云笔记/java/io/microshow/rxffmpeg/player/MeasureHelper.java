package io.microshow.rxffmpeg.player;

import android.view.View;
import java.lang.ref.WeakReference;
import p196ic.AbstractC9623a;

/* loaded from: classes6.dex */
public abstract class MeasureHelper {

    /* renamed from: a */
    public WeakReference f22164a;

    /* renamed from: b */
    public C9635a f22165b;

    /* renamed from: c */
    public int f22166c;

    /* renamed from: d */
    public FitModel f22167d = FitModel.FM_DEFAULT;

    public enum FitModel {
        FM_DEFAULT,
        FM_FULL_SCREEN_WIDTH,
        FM_FULL_SCREEN_HEIGHT,
        FM_WH_16X9
    }

    /* renamed from: io.microshow.rxffmpeg.player.MeasureHelper$a */
    public static class C9635a {

        /* renamed from: a */
        public int f22173a;

        /* renamed from: b */
        public int f22174b;

        /* renamed from: c */
        public float f22175c;

        public C9635a(int i10, int i11, float f10) {
            this.f22173a = i10;
            this.f22174b = i11;
            this.f22175c = f10;
        }

        /* renamed from: a */
        public float m18895a() {
            return this.f22175c;
        }

        /* renamed from: b */
        public int m18896b() {
            return this.f22174b;
        }

        /* renamed from: c */
        public int m18897c() {
            return this.f22173a;
        }
    }

    public MeasureHelper(View view) {
        this.f22164a = new WeakReference(view);
    }

    /* renamed from: a */
    public int[] m18887a(int i10, int i11) {
        FitModel fitModel = this.f22167d;
        if (fitModel == FitModel.FM_DEFAULT || fitModel == FitModel.FM_FULL_SCREEN_HEIGHT) {
            i11 = this.f22166c;
        }
        return new int[]{i10, i11};
    }

    /* renamed from: b */
    public C9635a m18888b() {
        return this.f22165b;
    }

    /* renamed from: c */
    public View m18889c() {
        View view;
        WeakReference weakReference = this.f22164a;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return null;
        }
        return view;
    }

    /* renamed from: d */
    public abstract boolean mo18890d();

    /* renamed from: e */
    public void m18891e() {
        View viewM18889c = m18889c();
        if (viewM18889c instanceof RxFFmpegPlayerView) {
            RxFFmpegPlayerView rxFFmpegPlayerView = (RxFFmpegPlayerView) viewM18889c;
            int iM18879d = AbstractC9623a.m18879d(viewM18889c.getContext());
            int i10 = (iM18879d * 9) / 16;
            m18894h(new C9635a(iM18879d, i10, iM18879d / i10));
            m18893g(rxFFmpegPlayerView.getTextureView(), rxFFmpegPlayerView.getContainerView());
        }
    }

    /* renamed from: f */
    public void m18892f(FitModel fitModel) {
        this.f22167d = fitModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m18893g(android.view.TextureView r8, android.widget.FrameLayout r9) {
        /*
            r7 = this;
            if (r8 == 0) goto L9f
            if (r9 == 0) goto L9f
            io.microshow.rxffmpeg.player.MeasureHelper$a r0 = r7.m18888b()
            if (r0 != 0) goto Lc
            goto L9f
        Lc:
            io.microshow.rxffmpeg.player.MeasureHelper$a r0 = r7.m18888b()
            int r0 = r0.m18897c()
            io.microshow.rxffmpeg.player.MeasureHelper$a r1 = r7.m18888b()
            int r1 = r1.m18896b()
            io.microshow.rxffmpeg.player.MeasureHelper$a r2 = r7.m18888b()
            r2.m18895a()
            float r2 = (float) r0
            float r3 = (float) r1
            float r2 = r2 / r3
            android.view.View r3 = r7.m18889c()
            android.content.Context r3 = r3.getContext()
            int r3 = p196ic.AbstractC9623a.m18879d(r3)
            boolean r4 = r7.mo18890d()
            if (r4 == 0) goto L4b
            android.view.View r0 = r7.m18889c()
            android.content.Context r0 = r0.getContext()
            int r3 = p196ic.AbstractC9623a.m18878c(r0)
        L44:
            float r0 = (float) r3
            float r0 = r0 * r2
            int r0 = (int) r0
            r6 = r3
            r3 = r0
            r0 = r6
            goto L76
        L4b:
            io.microshow.rxffmpeg.player.MeasureHelper$FitModel r4 = r7.f22167d
            io.microshow.rxffmpeg.player.MeasureHelper$FitModel r5 = io.microshow.rxffmpeg.player.MeasureHelper.FitModel.FM_FULL_SCREEN_WIDTH
            if (r4 != r5) goto L55
        L51:
            float r0 = (float) r3
            float r0 = r0 / r2
            int r0 = (int) r0
            goto L76
        L55:
            io.microshow.rxffmpeg.player.MeasureHelper$FitModel r5 = io.microshow.rxffmpeg.player.MeasureHelper.FitModel.FM_FULL_SCREEN_HEIGHT
            if (r4 != r5) goto L66
            android.view.View r0 = r7.m18889c()
            android.content.Context r0 = r0.getContext()
            int r3 = p196ic.AbstractC9623a.m18877b(r0)
            goto L44
        L66:
            io.microshow.rxffmpeg.player.MeasureHelper$FitModel r5 = io.microshow.rxffmpeg.player.MeasureHelper.FitModel.FM_WH_16X9
            if (r4 != r5) goto L6f
            int r3 = r3 * 9
            int r3 = r3 / 16
            goto L44
        L6f:
            if (r0 <= r1) goto L72
            goto L51
        L72:
            if (r0 >= r1) goto L75
            goto L44
        L75:
            r0 = r3
        L76:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r3, r0)
            r2 = 17
            r1.gravity = r2
            r8.setLayoutParams(r1)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            android.view.View r1 = r7.m18889c()
            android.content.Context r1 = r1.getContext()
            int r1 = p196ic.AbstractC9623a.m18879d(r1)
            r8.<init>(r1, r0)
            r9.setLayoutParams(r8)
            r7.f22166c = r0
            android.view.View r8 = r7.m18889c()
            r8.requestLayout()
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.microshow.rxffmpeg.player.MeasureHelper.m18893g(android.view.TextureView, android.widget.FrameLayout):void");
    }

    /* renamed from: h */
    public void m18894h(C9635a c9635a) {
        this.f22165b = c9635a;
    }
}
