package io.microshow.rxffmpeg.player;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import io.microshow.rxffmpeg.R$id;
import io.microshow.rxffmpeg.R$layout;
import io.microshow.rxffmpeg.R$mipmap;
import io.microshow.rxffmpeg.player.InterfaceC9645b;
import io.microshow.rxffmpeg.player.RxFFmpegPlayerView;
import java.lang.ref.WeakReference;
import p196ic.AbstractC9623a;

/* loaded from: classes6.dex */
public class RxFFmpegPlayerControllerImpl extends RxFFmpegPlayerController {

    /* renamed from: e */
    public TextView f22181e;

    /* renamed from: f */
    public SeekBar f22182f;

    /* renamed from: g */
    public ProgressBar f22183g;

    /* renamed from: h */
    public View f22184h;

    /* renamed from: i */
    public ImageView f22185i;

    /* renamed from: j */
    public View f22186j;

    /* renamed from: k */
    public ImageView f22187k;

    /* renamed from: l */
    public boolean f22188l;

    /* renamed from: m */
    public int f22189m;

    /* renamed from: io.microshow.rxffmpeg.player.RxFFmpegPlayerControllerImpl$a */
    public class ViewOnClickListenerC9636a implements View.OnClickListener {
        public ViewOnClickListenerC9636a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RxFFmpegPlayerControllerImpl.this.f22179c.m18923h();
            RxFFmpegPlayerControllerImpl.this.f22186j.setVisibility(8);
        }
    }

    /* renamed from: io.microshow.rxffmpeg.player.RxFFmpegPlayerControllerImpl$b */
    public class ViewOnClickListenerC9637b implements View.OnClickListener {
        public ViewOnClickListenerC9637b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RxFFmpegPlayerView rxFFmpegPlayerView = RxFFmpegPlayerControllerImpl.this.f22179c;
            if (rxFFmpegPlayerView != null) {
                rxFFmpegPlayerView.m18925j();
            }
        }
    }

    /* renamed from: io.microshow.rxffmpeg.player.RxFFmpegPlayerControllerImpl$c */
    public class ViewOnClickListenerC9638c implements View.OnClickListener {
        public ViewOnClickListenerC9638c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RxFFmpegPlayerControllerImpl.this.m18915m();
        }
    }

    /* renamed from: io.microshow.rxffmpeg.player.RxFFmpegPlayerControllerImpl$d */
    public class ViewOnClickListenerC9639d implements View.OnClickListener {
        public ViewOnClickListenerC9639d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RxFFmpegPlayerView rxFFmpegPlayerView = RxFFmpegPlayerControllerImpl.this.f22179c;
            if (rxFFmpegPlayerView != null) {
                if (rxFFmpegPlayerView.m18921f()) {
                    RxFFmpegPlayerControllerImpl.this.f22179c.m18922g();
                } else {
                    RxFFmpegPlayerControllerImpl.this.f22179c.m18924i();
                }
            }
        }
    }

    /* renamed from: io.microshow.rxffmpeg.player.RxFFmpegPlayerControllerImpl$e */
    public class C9640e implements SeekBar.OnSeekBarChangeListener {
        public C9640e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl = RxFFmpegPlayerControllerImpl.this;
            rxFFmpegPlayerControllerImpl.f22189m = (i10 * rxFFmpegPlayerControllerImpl.f22180d.getDuration()) / 100;
            if (RxFFmpegPlayerControllerImpl.this.f22188l) {
                RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl2 = RxFFmpegPlayerControllerImpl.this;
                RxFFmpegPlayerView.PlayerCoreType playerCoreType = rxFFmpegPlayerControllerImpl2.f22179c.f22199c;
                if (playerCoreType == RxFFmpegPlayerView.PlayerCoreType.PCT_RXFFMPEG_PLAYER) {
                    rxFFmpegPlayerControllerImpl2.m18914l(null, rxFFmpegPlayerControllerImpl2.f22189m, rxFFmpegPlayerControllerImpl2.f22180d.getDuration());
                } else if (playerCoreType == RxFFmpegPlayerView.PlayerCoreType.PCT_SYSTEM_MEDIA_PLAYER) {
                    rxFFmpegPlayerControllerImpl2.m18914l(null, rxFFmpegPlayerControllerImpl2.f22189m / 1000, rxFFmpegPlayerControllerImpl2.f22180d.getDuration() / 1000);
                }
                RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl3 = RxFFmpegPlayerControllerImpl.this;
                rxFFmpegPlayerControllerImpl3.f22180d.seekTo(rxFFmpegPlayerControllerImpl3.f22189m);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            RxFFmpegPlayerControllerImpl.this.f22188l = true;
            RxFFmpegPlayerControllerImpl.this.f22180d.pause();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            RxFFmpegPlayerControllerImpl.this.f22180d.resume();
            RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl = RxFFmpegPlayerControllerImpl.this;
            rxFFmpegPlayerControllerImpl.f22180d.seekTo(rxFFmpegPlayerControllerImpl.f22189m);
            RxFFmpegPlayerControllerImpl.this.f22188l = false;
        }
    }

    /* renamed from: io.microshow.rxffmpeg.player.RxFFmpegPlayerControllerImpl$f */
    public class RunnableC9641f implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f22195c;

        /* renamed from: d */
        public final /* synthetic */ int f22196d;

        public RunnableC9641f(int i10, int i11) {
            this.f22195c = i10;
            this.f22196d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22195c <= 0) {
                RxFFmpegPlayerControllerImpl.this.f22184h.setVisibility(8);
                return;
            }
            RxFFmpegPlayerControllerImpl.this.f22184h.setVisibility(0);
            TextView textView = RxFFmpegPlayerControllerImpl.this.f22181e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC9623a.m18882g(this.f22196d, this.f22195c));
            sb2.append(" / ");
            int i10 = this.f22195c;
            sb2.append(AbstractC9623a.m18882g(i10, i10));
            textView.setText(sb2.toString());
            if (RxFFmpegPlayerControllerImpl.this.f22188l || this.f22195c <= 0) {
                return;
            }
            RxFFmpegPlayerControllerImpl.this.f22182f.setProgress((this.f22196d * 100) / this.f22195c);
        }
    }

    /* renamed from: io.microshow.rxffmpeg.player.RxFFmpegPlayerControllerImpl$g */
    public static class C9642g implements InterfaceC9645b.a, InterfaceC9645b.b, InterfaceC9645b.c, InterfaceC9645b.d {

        /* renamed from: a */
        public WeakReference f22198a;

        public C9642g(RxFFmpegPlayerControllerImpl rxFFmpegPlayerControllerImpl) {
            this.f22198a = new WeakReference(rxFFmpegPlayerControllerImpl);
        }
    }

    public RxFFmpegPlayerControllerImpl(Context context) {
        super(context);
        this.f22188l = false;
    }

    @Override // io.microshow.rxffmpeg.player.RxFFmpegPlayerController
    /* renamed from: b */
    public void mo18904b() {
        C9642g c9642g = new C9642g(this);
        this.f22180d.m18931i(c9642g);
        this.f22180d.m18932j(c9642g);
        this.f22180d.m18930h(c9642g);
        this.f22180d.m18929g(c9642g);
        this.f22182f.setOnSeekBarChangeListener(new C9640e());
    }

    @Override // io.microshow.rxffmpeg.player.RxFFmpegPlayerController
    /* renamed from: c */
    public void mo18905c() {
        this.f22184h = findViewById(R$id.bottomPanel);
        this.f22182f = (SeekBar) findViewById(R$id.progress_view);
        this.f22181e = (TextView) findViewById(R$id.time_view);
        this.f22183g = (ProgressBar) findViewById(R$id.progressBar);
        this.f22185i = (ImageView) findViewById(R$id.iv_play);
        View viewFindViewById = findViewById(R$id.repeatPlay);
        this.f22186j = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC9636a());
        findViewById(R$id.iv_fullscreen).setOnClickListener(new ViewOnClickListenerC9637b());
        ImageView imageView = (ImageView) findViewById(R$id.iv_mute);
        this.f22187k = imageView;
        imageView.setOnClickListener(new ViewOnClickListenerC9638c());
        this.f22185i.setOnClickListener(new ViewOnClickListenerC9639d());
    }

    @Override // io.microshow.rxffmpeg.player.RxFFmpegPlayerController
    /* renamed from: d */
    public void mo18906d() {
        this.f22185i.setImageResource(R$mipmap.rxffmpeg_player_start);
        this.f22185i.animate().alpha(1.0f).start();
    }

    @Override // io.microshow.rxffmpeg.player.RxFFmpegPlayerController
    /* renamed from: e */
    public void mo18907e() {
        this.f22185i.setImageResource(R$mipmap.rxffmpeg_player_pause);
        this.f22185i.animate().alpha(1.0f).start();
        RxFFmpegPlayerView rxFFmpegPlayerView = this.f22179c;
        if (rxFFmpegPlayerView != null) {
            this.f22187k.setImageResource(rxFFmpegPlayerView.getVolume() == 0 ? R$mipmap.rxffmpeg_player_mute : R$mipmap.rxffmpeg_player_unmute);
        }
    }

    @Override // io.microshow.rxffmpeg.player.RxFFmpegPlayerController
    public int getLayoutId() {
        return R$layout.rxffmpeg_player_controller;
    }

    /* renamed from: l */
    public void m18914l(InterfaceC9645b interfaceC9645b, int i10, int i11) {
        post(new RunnableC9641f(i11, i10));
    }

    /* renamed from: m */
    public void m18915m() {
        RxFFmpegPlayerView rxFFmpegPlayerView = this.f22179c;
        if (rxFFmpegPlayerView != null) {
            if (rxFFmpegPlayerView.getVolume() == 0) {
                this.f22179c.setVolume(100);
                this.f22187k.setImageResource(R$mipmap.rxffmpeg_player_unmute);
            } else {
                this.f22179c.setVolume(0);
                this.f22187k.setImageResource(R$mipmap.rxffmpeg_player_mute);
            }
        }
    }
}
