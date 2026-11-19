package io.microshow.rxffmpeg.player;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public abstract class RxFFmpegPlayerController extends FrameLayout {

    /* renamed from: c */
    public RxFFmpegPlayerView f22179c;

    /* renamed from: d */
    public AbstractC9644a f22180d;

    public RxFFmpegPlayerController(Context context) {
        super(context);
        m18903a();
    }

    /* renamed from: a */
    public final void m18903a() {
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        mo18905c();
    }

    /* renamed from: b */
    public abstract void mo18904b();

    /* renamed from: c */
    public abstract void mo18905c();

    /* renamed from: d */
    public abstract void mo18906d();

    /* renamed from: e */
    public abstract void mo18907e();

    public abstract int getLayoutId();

    public void setPlayerView(RxFFmpegPlayerView rxFFmpegPlayerView) {
        if (rxFFmpegPlayerView != null) {
            this.f22179c = rxFFmpegPlayerView;
            this.f22180d = rxFFmpegPlayerView.f22205i;
            mo18904b();
        }
    }
}
