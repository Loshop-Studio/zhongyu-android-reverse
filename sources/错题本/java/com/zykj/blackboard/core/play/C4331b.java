package com.zykj.blackboard.core.play;

import android.media.MediaPlayer;

/* renamed from: com.zykj.blackboard.core.play.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4331b implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ int f5259a;

    /* renamed from: b */
    public final /* synthetic */ AudioCommandThread f5260b;

    public /* synthetic */ C4331b(AudioCommandThread audioCommandThread, int i) {
        this.f5259a = i;
        this.f5260b = audioCommandThread;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
        switch (this.f5259a) {
            case 0:
                AudioCommandThread.m13781syncExecuteCommand$lambda9$lambda8(this.f5260b, mediaPlayer);
                break;
            default:
                AudioCommandThread.m13783syncExecuteCommandWithPause$lambda14$lambda13(this.f5260b, mediaPlayer);
                break;
        }
    }
}
