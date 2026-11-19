package io.microshow.rxffmpeg.player;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public abstract class RxFFmpegPlayerController extends FrameLayout {

    /* renamed from: a */
    public RxFFmpegPlayerView f8873a;

    public RxFFmpegPlayerController(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) this, true);
        mo5012b();
    }

    /* renamed from: a */
    public abstract void mo5011a();

    /* renamed from: b */
    public abstract void mo5012b();

    public abstract int getLayoutId();

    public void setPlayerView(RxFFmpegPlayerView rxFFmpegPlayerView) {
        if (rxFFmpegPlayerView == null) {
            return;
        }
        this.f8873a = rxFFmpegPlayerView;
        mo5011a();
        throw null;
    }
}
