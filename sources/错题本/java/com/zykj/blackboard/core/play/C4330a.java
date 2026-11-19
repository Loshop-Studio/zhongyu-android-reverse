package com.zykj.blackboard.core.play;

import android.media.MediaPlayer;

/* renamed from: com.zykj.blackboard.core.play.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4330a implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ int f5258a;

    public /* synthetic */ C4330a(int i) {
        this.f5258a = i;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) throws IllegalStateException {
        switch (this.f5258a) {
            case 0:
                mediaPlayer.start();
                break;
            default:
                mediaPlayer.start();
                break;
        }
    }
}
