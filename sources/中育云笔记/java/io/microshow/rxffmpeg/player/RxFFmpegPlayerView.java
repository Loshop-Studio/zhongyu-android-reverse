package io.microshow.rxffmpeg.player;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import io.microshow.rxffmpeg.player.InterfaceC9645b;
import io.microshow.rxffmpeg.player.MeasureHelper;
import p196ic.AbstractC9623a;

/* loaded from: classes6.dex */
public class RxFFmpegPlayerView extends FrameLayout {

    /* renamed from: c */
    public PlayerCoreType f22199c;

    /* renamed from: d */
    public Context f22200d;

    /* renamed from: e */
    public MeasureHelper f22201e;

    /* renamed from: f */
    public FrameLayout f22202f;

    /* renamed from: g */
    public RxFFmpegPlayerController f22203g;

    /* renamed from: h */
    public TextureView f22204h;

    /* renamed from: i */
    public AbstractC9644a f22205i;

    /* renamed from: j */
    public int f22206j;

    public enum PlayerCoreType {
        PCT_RXFFMPEG_PLAYER,
        PCT_SYSTEM_MEDIA_PLAYER
    }

    /* renamed from: io.microshow.rxffmpeg.player.RxFFmpegPlayerView$a */
    public class C9643a extends MeasureHelper {
        public C9643a(View view) {
            super(view);
        }

        @Override // io.microshow.rxffmpeg.player.MeasureHelper
        /* renamed from: d */
        public boolean mo18890d() {
            return RxFFmpegPlayerView.this.f22206j == 1;
        }
    }

    public RxFFmpegPlayerView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public boolean m18917b() {
        ViewGroup viewGroupM18883h;
        if (this.f22206j == 1 || (viewGroupM18883h = AbstractC9623a.m18883h(this.f22200d, true)) == null) {
            return false;
        }
        removeView(this.f22202f);
        viewGroupM18883h.addView(this.f22202f, new FrameLayout.LayoutParams(-1, -1));
        this.f22206j = 1;
        return true;
    }

    /* renamed from: c */
    public boolean m18918c() {
        ViewGroup viewGroupM18883h;
        if (this.f22206j != 1 || (viewGroupM18883h = AbstractC9623a.m18883h(this.f22200d, false)) == null) {
            return false;
        }
        viewGroupM18883h.removeView(this.f22202f);
        addView(this.f22202f, new FrameLayout.LayoutParams(-1, -1));
        this.f22206j = 0;
        return false;
    }

    /* renamed from: d */
    public final void m18919d() {
        FrameLayout frameLayout = new FrameLayout(this.f22200d);
        this.f22202f = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        addView(this.f22202f, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: e */
    public boolean m18920e() {
        return this.f22206j == 1;
    }

    /* renamed from: f */
    public boolean m18921f() {
        AbstractC9644a abstractC9644a = this.f22205i;
        return abstractC9644a != null && abstractC9644a.isPlaying();
    }

    /* renamed from: g */
    public void m18922g() {
        AbstractC9644a abstractC9644a = this.f22205i;
        if (abstractC9644a != null) {
            abstractC9644a.pause();
            RxFFmpegPlayerController rxFFmpegPlayerController = this.f22203g;
            if (rxFFmpegPlayerController != null) {
                rxFFmpegPlayerController.mo18906d();
            }
        }
    }

    public FrameLayout getContainerView() {
        return this.f22202f;
    }

    public int getMuteSolo() {
        AbstractC9644a abstractC9644a = this.f22205i;
        if (abstractC9644a == null || abstractC9644a.mo18898a() == -1) {
            return 0;
        }
        return this.f22205i.mo18898a();
    }

    public TextureView getTextureView() {
        return this.f22204h;
    }

    public int getVolume() {
        AbstractC9644a abstractC9644a = this.f22205i;
        if (abstractC9644a == null || abstractC9644a.mo18899b() == -1) {
            return 100;
        }
        return this.f22205i.mo18899b();
    }

    /* renamed from: h */
    public void m18923h() {
        AbstractC9644a abstractC9644a = this.f22205i;
        if (abstractC9644a != null) {
            abstractC9644a.mo18902f();
        }
    }

    /* renamed from: i */
    public void m18924i() {
        AbstractC9644a abstractC9644a = this.f22205i;
        if (abstractC9644a != null) {
            abstractC9644a.resume();
            RxFFmpegPlayerController rxFFmpegPlayerController = this.f22203g;
            if (rxFFmpegPlayerController != null) {
                rxFFmpegPlayerController.mo18907e();
            }
        }
    }

    /* renamed from: j */
    public boolean m18925j() {
        return m18920e() ? m18918c() : m18917b();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MeasureHelper measureHelper = this.f22201e;
        if (measureHelper != null) {
            measureHelper.m18893g(this.f22204h, this.f22202f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int[] iArrM18887a = this.f22201e.m18887a(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(iArrM18887a[0], iArrM18887a[1]);
    }

    public void setFitModel(MeasureHelper.FitModel fitModel) {
        MeasureHelper measureHelper = this.f22201e;
        if (measureHelper == null || fitModel == null) {
            return;
        }
        measureHelper.m18892f(fitModel);
        this.f22201e.m18891e();
    }

    public void setMuteSolo(int i10) {
        AbstractC9644a abstractC9644a = this.f22205i;
        if (abstractC9644a != null) {
            abstractC9644a.mo18901d(i10);
        }
    }

    public void setOnCompleteListener(InterfaceC9645b.a aVar) {
        AbstractC9644a abstractC9644a = this.f22205i;
        if (abstractC9644a != null) {
            abstractC9644a.m18929g(aVar);
        }
    }

    public void setPlayerBackgroundColor(int i10) {
        FrameLayout frameLayout = this.f22202f;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(i10);
        }
    }

    public void setTextureViewEnabledTouch(boolean z10) {
        TextureView textureView = this.f22204h;
        if (textureView == null || !(textureView instanceof ScaleTextureView)) {
            return;
        }
        ((ScaleTextureView) textureView).setEnabledTouch(z10);
    }

    public void setVolume(int i10) {
        AbstractC9644a abstractC9644a = this.f22205i;
        if (abstractC9644a != null) {
            abstractC9644a.mo18900c(i10);
        }
    }

    public RxFFmpegPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22199c = PlayerCoreType.PCT_RXFFMPEG_PLAYER;
        this.f22206j = 0;
        this.f22200d = context;
        this.f22201e = new C9643a(this);
        m18919d();
        setKeepScreenOn(true);
    }
}
