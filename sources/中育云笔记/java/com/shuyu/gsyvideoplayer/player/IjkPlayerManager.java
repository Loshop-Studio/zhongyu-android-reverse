package com.shuyu.gsyvideoplayer.player;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.utils.RawDataSourceProvider;
import com.shuyu.gsyvideoplayer.utils.StreamDataSourceProvider;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p249m7.C10207a;
import p249m7.C10209c;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkLibLoader;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.misc.IjkTrackInfo;

/* loaded from: classes5.dex */
public class IjkPlayerManager extends BasePlayerManager {
    private static IjkLibLoader ijkLibLoader = null;
    private static int logLevel = 1;
    private IjkMediaPlayer mediaPlayer;
    private List<C10209c> optionModelList;
    private Surface surface;

    public static IjkLibLoader getIjkLibLoader() {
        return ijkLibLoader;
    }

    public static int getLogLevel() {
        return logLevel;
    }

    private void initIJKOption(IjkMediaPlayer ijkMediaPlayer, List<C10209c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C10209c c10209c : list) {
            if (c10209c.m21346e() == 0) {
                ijkMediaPlayer.setOption(c10209c.m21342a(), c10209c.m21343b(), c10209c.m21344c());
            } else {
                ijkMediaPlayer.setOption(c10209c.m21342a(), c10209c.m21343b(), c10209c.m21345d());
            }
        }
    }

    public static void setIjkLibLoader(IjkLibLoader ijkLibLoader2) {
        ijkLibLoader = ijkLibLoader2;
    }

    public static void setLogLevel(int i10) {
        logLevel = i10;
    }

    public void deselectTrack(int i10) {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.deselectTrack(i10);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getBufferedPercentage() {
        return -1;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getCurrentPosition() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getDuration() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public IMediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getNetSpeed() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getTcpSpeed();
        }
        return 0L;
    }

    public List<C10209c> getOptionModelList() {
        return this.optionModelList;
    }

    public int getSelectedTrack(int i10) {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getSelectedTrack(i10);
        }
        return -1;
    }

    public IjkTrackInfo[] getTrackInfo() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getTrackInfo();
        }
        return null;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoHeight() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoSarDen() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getVideoSarDen();
        }
        return 1;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoSarNum() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getVideoSarNum();
        }
        return 1;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoWidth() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void initVideoPlayer(Context context, Message message, List<C10209c> list, ICacheManager iCacheManager) {
        IjkMediaPlayer ijkMediaPlayer = ijkLibLoader == null ? new IjkMediaPlayer() : new IjkMediaPlayer(ijkLibLoader);
        this.mediaPlayer = ijkMediaPlayer;
        ijkMediaPlayer.setAudioStreamType(3);
        this.mediaPlayer.setOnNativeInvokeListener(new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.shuyu.gsyvideoplayer.player.IjkPlayerManager.1
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i10, Bundle bundle) {
                return true;
            }
        });
        C10207a c10207a = (C10207a) message.obj;
        String strM21338d = c10207a.m21338d();
        BufferedInputStream bufferedInputStreamM21339e = c10207a.m21339e();
        try {
            if (GSYVideoType.isMediaCodec()) {
                Debuger.printfLog("enable mediaCodec");
                this.mediaPlayer.setOption(4, "mediacodec", 1L);
                this.mediaPlayer.setOption(4, "mediacodec-auto-rotate", 1L);
                this.mediaPlayer.setOption(4, "mediacodec-handle-resolution-change", 1L);
            }
            if (c10207a.m21340f() && iCacheManager != null) {
                iCacheManager.doCacheLogic(context, this.mediaPlayer, strM21338d, c10207a.m21336b(), c10207a.m21335a());
            } else if (!TextUtils.isEmpty(strM21338d)) {
                Uri uri = Uri.parse(strM21338d);
                if (uri != null && uri.getScheme() != null && (uri.getScheme().equals("android.resource") || uri.getScheme().equals("assets"))) {
                    this.mediaPlayer.setDataSource(RawDataSourceProvider.create(context, uri));
                } else if (uri == null || uri.getScheme() == null || !uri.getScheme().equals("content")) {
                    this.mediaPlayer.setDataSource(strM21338d, c10207a.m21336b());
                } else {
                    try {
                        this.mediaPlayer.setDataSource(context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor());
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            } else if (bufferedInputStreamM21339e != null) {
                this.mediaPlayer.setDataSource(new StreamDataSourceProvider(bufferedInputStreamM21339e));
            } else {
                this.mediaPlayer.setDataSource(strM21338d, c10207a.m21336b());
            }
            this.mediaPlayer.setLooping(c10207a.m21341g());
            if (c10207a.m21337c() != 1.0f && c10207a.m21337c() > 0.0f) {
                this.mediaPlayer.setSpeed(c10207a.m21337c());
            }
            IjkMediaPlayer.native_setLogLevel(logLevel);
            initIJKOption(this.mediaPlayer, list);
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        initSuccess(c10207a);
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public boolean isPlaying() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public boolean isSurfaceSupportLockCanvas() {
        return true;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void pause() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.pause();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void release() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void releaseSurface() {
        if (this.surface != null) {
            this.surface = null;
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void seekTo(long j10) {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.seekTo(j10);
        }
    }

    public void selectTrack(int i10) {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.selectTrack(i10);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setNeedMute(boolean z10) {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            if (z10) {
                ijkMediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                ijkMediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    public void setOptionModelList(List<C10209c> list) {
        this.optionModelList = list;
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setSpeed(float f10, boolean z10) {
        if (f10 > 0.0f) {
            try {
                IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
                if (ijkMediaPlayer != null) {
                    ijkMediaPlayer.setSpeed(f10);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (z10) {
                C10209c c10209c = new C10209c(4, "soundtouch", 1);
                List<C10209c> optionModelList = getOptionModelList();
                if (optionModelList != null) {
                    optionModelList.add(c10209c);
                } else {
                    optionModelList = new ArrayList<>();
                    optionModelList.add(c10209c);
                }
                setOptionModelList(optionModelList);
            }
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setSpeedPlaying(float f10, boolean z10) {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setSpeed(f10);
            this.mediaPlayer.setOption(4, "soundtouch", z10 ? 1L : 0L);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setVolume(float f10, float f11) {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setVolume(f10, f11);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void showDisplay(Message message) {
        IjkMediaPlayer ijkMediaPlayer;
        Object obj = message.obj;
        if (obj == null && (ijkMediaPlayer = this.mediaPlayer) != null) {
            ijkMediaPlayer.setSurface(null);
            return;
        }
        Surface surface = (Surface) obj;
        this.surface = surface;
        if (this.mediaPlayer == null || !surface.isValid()) {
            return;
        }
        this.mediaPlayer.setSurface(surface);
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void start() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.start();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void stop() {
        IjkMediaPlayer ijkMediaPlayer = this.mediaPlayer;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
        }
    }
}
