package com.tencent.liteav.txcvodplayer;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.ijk.media.player.MediaPlayerProxy;

/* renamed from: com.tencent.liteav.txcvodplayer.b */
/* loaded from: classes4.dex */
public class C6707b {

    /* renamed from: a */
    private IMediaPlayer f6311a;

    /* renamed from: b */
    private Handler f6312b = new Handler() { // from class: com.tencent.liteav.txcvodplayer.b.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IMediaPlayer internalMediaPlayer;
            if (message.what == 1 && C6707b.this.f6311a != null) {
                IjkMediaPlayer ijkMediaPlayer = C6707b.this.f6311a instanceof IjkMediaPlayer ? (IjkMediaPlayer) C6707b.this.f6311a : ((C6707b.this.f6311a instanceof MediaPlayerProxy) && (internalMediaPlayer = ((MediaPlayerProxy) C6707b.this.f6311a).getInternalMediaPlayer()) != null && (internalMediaPlayer instanceof IjkMediaPlayer)) ? (IjkMediaPlayer) internalMediaPlayer : null;
                if (ijkMediaPlayer == null) {
                    return;
                }
                float rate = ijkMediaPlayer.getRate();
                if (Math.abs(ijkMediaPlayer.getAVDiff()) <= 0.5f || rate <= 1.0f) {
                    C6707b.this.f6312b.removeMessages(1);
                    C6707b.this.f6312b.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
                double d10 = rate;
                float fMin = (float) (d10 - Math.min((d10 - 1.0d) / 2.0d, 0.25d));
                ijkMediaPlayer.setRate(fMin);
                Log.w("RateHelper", "downside rate " + fMin);
                C6707b.this.f6312b.removeMessages(1);
                C6707b.this.f6312b.sendEmptyMessageDelayed(1, 3000L);
            }
        }
    };

    /* renamed from: a */
    public void m5650a(IMediaPlayer iMediaPlayer) {
        this.f6311a = iMediaPlayer;
        if (iMediaPlayer != null) {
            this.f6312b.sendEmptyMessageDelayed(1, 500L);
        } else {
            this.f6312b.removeMessages(1);
        }
    }
}
