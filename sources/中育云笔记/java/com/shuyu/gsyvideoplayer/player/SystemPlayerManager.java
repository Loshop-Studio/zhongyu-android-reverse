package com.shuyu.gsyvideoplayer.player;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Message;
import android.view.Surface;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import com.shuyu.gsyvideoplayer.placeholder.PlaceholderSurface;
import java.io.IOException;
import java.util.List;
import p249m7.C10207a;
import p249m7.C10209c;
import tv.danmaku.ijk.media.player.AndroidMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class SystemPlayerManager extends BasePlayerManager {
    private Context context;
    private PlaceholderSurface dummySurface;
    private AndroidMediaPlayer mediaPlayer;
    private boolean release;
    private Surface surface;
    private long lastTotalRxBytes = 0;
    private long lastTimeStamp = 0;
    private boolean isPlaying = false;

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getBufferedPercentage() {
        return -1;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getCurrentPosition() {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getDuration() {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public IMediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getNetSpeed() {
        if (this.mediaPlayer != null) {
            return getNetSpeed(this.context);
        }
        return 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoHeight() {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoSarDen() {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getVideoSarDen();
        }
        return 1;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoSarNum() {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getVideoSarNum();
        }
        return 1;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoWidth() {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void initVideoPlayer(Context context, Message message, List<C10209c> list, ICacheManager iCacheManager) {
        this.context = context.getApplicationContext();
        this.mediaPlayer = new AndroidMediaPlayer();
        if (this.dummySurface == null) {
            this.dummySurface = PlaceholderSurface.m9731a(context, false);
        }
        this.mediaPlayer.setAudioStreamType(3);
        this.release = false;
        C10207a c10207a = (C10207a) message.obj;
        try {
            if (!c10207a.m21340f() || iCacheManager == null) {
                this.mediaPlayer.setDataSource(context, Uri.parse(c10207a.m21338d()), c10207a.m21336b());
            } else {
                iCacheManager.doCacheLogic(context, this.mediaPlayer, c10207a.m21338d(), c10207a.m21336b(), c10207a.m21335a());
            }
            this.mediaPlayer.setLooping(c10207a.m21341g());
            if (c10207a.m21337c() != 1.0f && c10207a.m21337c() > 0.0f) {
                setSpeed(c10207a.m21337c());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        initSuccess(c10207a);
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public boolean isPlaying() {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public boolean isSurfaceSupportLockCanvas() {
        return false;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void pause() throws IllegalStateException {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.pause();
            this.isPlaying = false;
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void release() throws IOException {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            this.release = true;
            androidMediaPlayer.release();
            this.mediaPlayer = null;
        }
        PlaceholderSurface placeholderSurface = this.dummySurface;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.dummySurface = null;
        }
        this.lastTotalRxBytes = 0L;
        this.lastTimeStamp = 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void releaseSurface() {
        if (this.surface != null) {
            this.surface = null;
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void seekTo(long j10) throws IllegalStateException {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.seekTo(j10);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setNeedMute(boolean z10) {
        try {
            AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
            if (androidMediaPlayer == null || this.release) {
                return;
            }
            if (z10) {
                androidMediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                androidMediaPlayer.setVolume(1.0f, 1.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setSpeed(float f10, boolean z10) {
        setSpeed(f10);
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setSpeedPlaying(float f10, boolean z10) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setVolume(float f10, float f11) {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.setVolume(f10, f11);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void showDisplay(Message message) throws IllegalStateException {
        AndroidMediaPlayer androidMediaPlayer;
        Object obj = message.obj;
        if (obj == null && (androidMediaPlayer = this.mediaPlayer) != null && !this.release) {
            PlaceholderSurface placeholderSurface = this.dummySurface;
            if (placeholderSurface != null) {
                androidMediaPlayer.setSurface(placeholderSurface);
            } else {
                androidMediaPlayer.setSurface(null);
            }
        } else if (obj != null) {
            Surface surface = (Surface) obj;
            this.surface = surface;
            if (this.mediaPlayer != null && surface.isValid() && !this.release) {
                this.mediaPlayer.setSurface(surface);
            }
        }
        if (this.isPlaying) {
            return;
        }
        pause();
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void start() throws IllegalStateException {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.start();
            this.isPlaying = true;
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void stop() throws IllegalStateException {
        AndroidMediaPlayer androidMediaPlayer = this.mediaPlayer;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.stop();
            this.isPlaying = false;
        }
    }

    private void setSpeed(float f10) {
        AndroidMediaPlayer androidMediaPlayer;
        if (this.release || (androidMediaPlayer = this.mediaPlayer) == null || androidMediaPlayer.getInternalMediaPlayer() == null || !this.mediaPlayer.isPlayable()) {
            return;
        }
        try {
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f10);
            this.mediaPlayer.getInternalMediaPlayer().setPlaybackParams(playbackParams);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private long getNetSpeed(Context context) {
        if (context == null) {
            return 0L;
        }
        long totalRxBytes = TrafficStats.getUidRxBytes(context.getApplicationInfo().uid) == -1 ? 0L : TrafficStats.getTotalRxBytes() / 1024;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.lastTimeStamp;
        if (j10 == 0) {
            return j10;
        }
        long j11 = ((totalRxBytes - this.lastTotalRxBytes) * 1000) / j10;
        this.lastTimeStamp = jCurrentTimeMillis;
        this.lastTotalRxBytes = totalRxBytes;
        return j11;
    }
}
