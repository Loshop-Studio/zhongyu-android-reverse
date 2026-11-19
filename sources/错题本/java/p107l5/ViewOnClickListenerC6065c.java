package p107l5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.microshow.rxffmpeg.R$mipmap;
import io.microshow.rxffmpeg.player.RxFFmpegPlayerControllerImpl;
import io.microshow.rxffmpeg.player.RxFFmpegPlayerView;
import p169t6.AbstractC6600a;

/* renamed from: l5.c */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC6065c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f9667a;

    /* renamed from: b */
    public final /* synthetic */ RxFFmpegPlayerControllerImpl f9668b;

    public /* synthetic */ ViewOnClickListenerC6065c(RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl, int i) {
        this.f9667a = i;
        this.f9668b = rxFFmpegPlayerControllerImpl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewGroup viewGroupM6244u;
        ViewGroup viewGroupM6244u2;
        switch (this.f9667a) {
            case 0:
                RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl = this.f9668b;
                rxFFmpegPlayerControllerImpl.f8873a.getClass();
                rxFFmpegPlayerControllerImpl.f8876d.setVisibility(8);
                break;
            case 1:
                RxFFmpegPlayerView rxFFmpegPlayerView = this.f9668b.f8873a;
                if (rxFFmpegPlayerView != null) {
                    Context context = rxFFmpegPlayerView.f8878a;
                    int i = rxFFmpegPlayerView.f8881d;
                    if (i != 1) {
                        if (i != 1 && (viewGroupM6244u = AbstractC6600a.m6244u(context, true)) != null) {
                            rxFFmpegPlayerView.removeView(rxFFmpegPlayerView.f8880c);
                            viewGroupM6244u.addView(rxFFmpegPlayerView.f8880c, new FrameLayout.LayoutParams(-1, -1));
                            rxFFmpegPlayerView.f8881d = 1;
                            break;
                        }
                    } else if (i == 1 && (viewGroupM6244u2 = AbstractC6600a.m6244u(context, false)) != null) {
                        viewGroupM6244u2.removeView(rxFFmpegPlayerView.f8880c);
                        rxFFmpegPlayerView.addView(rxFFmpegPlayerView.f8880c, new FrameLayout.LayoutParams(-1, -1));
                        rxFFmpegPlayerView.f8881d = 0;
                        break;
                    }
                }
                break;
            case 2:
                RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl2 = this.f9668b;
                RxFFmpegPlayerView rxFFmpegPlayerView2 = rxFFmpegPlayerControllerImpl2.f8873a;
                if (rxFFmpegPlayerView2 != null) {
                    if (rxFFmpegPlayerView2.getVolume() != 0) {
                        rxFFmpegPlayerControllerImpl2.f8873a.setVolume(0);
                        rxFFmpegPlayerControllerImpl2.f8877e.setImageResource(R$mipmap.rxffmpeg_player_mute);
                        break;
                    } else {
                        rxFFmpegPlayerControllerImpl2.f8873a.setVolume(100);
                        rxFFmpegPlayerControllerImpl2.f8877e.setImageResource(R$mipmap.rxffmpeg_player_unmute);
                        break;
                    }
                }
                break;
            default:
                RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl3 = this.f9668b;
                RxFFmpegPlayerView rxFFmpegPlayerView3 = rxFFmpegPlayerControllerImpl3.f8873a;
                if (rxFFmpegPlayerView3 != null) {
                    rxFFmpegPlayerView3.getClass();
                    rxFFmpegPlayerControllerImpl3.f8873a.getClass();
                    break;
                }
                break;
        }
    }
}
