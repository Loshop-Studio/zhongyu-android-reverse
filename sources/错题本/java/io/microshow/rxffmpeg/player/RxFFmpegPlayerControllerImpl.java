package io.microshow.rxffmpeg.player;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import io.microshow.rxffmpeg.R$id;
import io.microshow.rxffmpeg.R$layout;
import java.lang.ref.WeakReference;
import p107l5.ViewOnClickListenerC6065c;

/* loaded from: classes3.dex */
public class RxFFmpegPlayerControllerImpl extends RxFFmpegPlayerController {

    /* renamed from: b */
    public View f8874b;

    /* renamed from: c */
    public ImageView f8875c;

    /* renamed from: d */
    public View f8876d;

    /* renamed from: e */
    public ImageView f8877e;

    public RxFFmpegPlayerControllerImpl(Context context) {
        super(context);
    }

    @Override // io.microshow.rxffmpeg.player.RxFFmpegPlayerController
    /* renamed from: a */
    public final void mo5011a() {
        new WeakReference(this);
        throw null;
    }

    @Override // io.microshow.rxffmpeg.player.RxFFmpegPlayerController
    /* renamed from: b */
    public final void mo5012b() {
        this.f8874b = findViewById(R$id.bottomPanel);
        this.f8875c = (ImageView) findViewById(R$id.iv_play);
        View viewFindViewById = findViewById(R$id.repeatPlay);
        this.f8876d = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC6065c(this, 0));
        findViewById(R$id.iv_fullscreen).setOnClickListener(new ViewOnClickListenerC6065c(this, 1));
        ImageView imageView = (ImageView) findViewById(R$id.iv_mute);
        this.f8877e = imageView;
        imageView.setOnClickListener(new ViewOnClickListenerC6065c(this, 2));
        this.f8875c.setOnClickListener(new ViewOnClickListenerC6065c(this, 3));
    }

    @Override // io.microshow.rxffmpeg.player.RxFFmpegPlayerController
    public int getLayoutId() {
        return R$layout.rxffmpeg_player_controller;
    }
}
