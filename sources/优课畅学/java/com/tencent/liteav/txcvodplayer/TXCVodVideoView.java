package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.collection.SieveCacheKt;
import androidx.core.app.NotificationManagerCompat;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.IjkBitrateItem;
import com.tencent.ijk.media.player.IjkLibLoader;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.ijk.media.player.IjkTimedText;
import com.tencent.ijk.media.player.MediaInfo;
import com.tencent.ijk.media.player.TextureMediaPlayer;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.txcvodplayer.InterfaceC6704a;
import com.tencent.liteav.txcvodplayer.p054a.C6705a;
import com.tencent.liteav.txcvodplayer.p054a.C6706b;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public class TXCVodVideoView extends FrameLayout {

    /* renamed from: A */
    private int f6212A;

    /* renamed from: B */
    private String f6213B;

    /* renamed from: C */
    private float f6214C;

    /* renamed from: D */
    private C6705a f6215D;

    /* renamed from: E */
    private C6706b f6216E;

    /* renamed from: F */
    private long f6217F;

    /* renamed from: G */
    private boolean f6218G;

    /* renamed from: H */
    private int f6219H;

    /* renamed from: I */
    private float f6220I;

    /* renamed from: J */
    private float f6221J;

    /* renamed from: K */
    private boolean f6222K;

    /* renamed from: L */
    private int f6223L;

    /* renamed from: M */
    private boolean f6224M;

    /* renamed from: N */
    private C6707b f6225N;

    /* renamed from: O */
    private IMediaPlayer.OnCompletionListener f6226O;

    /* renamed from: P */
    private IMediaPlayer.OnInfoListener f6227P;

    /* renamed from: Q */
    private int f6228Q;

    /* renamed from: R */
    private IMediaPlayer.OnErrorListener f6229R;

    /* renamed from: S */
    private IMediaPlayer.OnHevcVideoDecoderErrorListener f6230S;

    /* renamed from: T */
    private IMediaPlayer.OnVideoDecoderErrorListener f6231T;

    /* renamed from: U */
    private IMediaPlayer.OnBufferingUpdateListener f6232U;

    /* renamed from: V */
    private IMediaPlayer.OnSeekCompleteListener f6233V;

    /* renamed from: W */
    private IMediaPlayer.OnTimedTextListener f6234W;

    /* renamed from: a */
    protected boolean f6235a;

    /* renamed from: aa */
    private IjkMediaPlayer.OnNativeInvokeListener f6236aa;

    /* renamed from: ab */
    private IMediaPlayer.OnHLSKeyErrorListener f6237ab;

    /* renamed from: ac */
    private int f6238ac;

    /* renamed from: ad */
    private InterfaceC6710e f6239ad;

    /* renamed from: ae */
    private Handler f6240ae;

    /* renamed from: af */
    private boolean f6241af;

    /* renamed from: b */
    protected boolean f6242b;

    /* renamed from: c */
    protected boolean f6243c;

    /* renamed from: d */
    protected final int f6244d;

    /* renamed from: e */
    IMediaPlayer.OnVideoSizeChangedListener f6245e;

    /* renamed from: f */
    IMediaPlayer.OnPreparedListener f6246f;

    /* renamed from: g */
    InterfaceC6704a.a f6247g;

    /* renamed from: h */
    private String f6248h;

    /* renamed from: i */
    private Uri f6249i;

    /* renamed from: j */
    private int f6250j;

    /* renamed from: k */
    private int f6251k;

    /* renamed from: l */
    private InterfaceC6704a.b f6252l;

    /* renamed from: m */
    private IMediaPlayer f6253m;

    /* renamed from: n */
    private int f6254n;

    /* renamed from: o */
    private int f6255o;

    /* renamed from: p */
    private int f6256p;

    /* renamed from: q */
    private int f6257q;

    /* renamed from: r */
    private int f6258r;

    /* renamed from: s */
    private int f6259s;

    /* renamed from: t */
    private int f6260t;

    /* renamed from: u */
    private int f6261u;

    /* renamed from: v */
    private int f6262v;

    /* renamed from: w */
    private Context f6263w;

    /* renamed from: x */
    private C6709d f6264x;

    /* renamed from: y */
    private InterfaceC6704a f6265y;

    /* renamed from: z */
    private int f6266z;

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$a */
    public static class HandlerC6701a extends Handler {

        /* renamed from: a */
        private final WeakReference<TXCVodVideoView> f6283a;

        /* renamed from: b */
        private final int f6284b;

        public HandlerC6701a(TXCVodVideoView tXCVodVideoView, Looper looper) {
            super(looper);
            this.f6284b = TbsListener.ErrorCode.INFO_CODE_MINIQB;
            this.f6283a = new WeakReference<>(tXCVodVideoView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TXCVodVideoView tXCVodVideoView = this.f6283a.get();
            if (tXCVodVideoView == null || tXCVodVideoView.f6239ad == null) {
                return;
            }
            switch (message.what) {
                case 100:
                    IMediaPlayer unwrappedMediaPlayer = tXCVodVideoView.getUnwrappedMediaPlayer();
                    if (unwrappedMediaPlayer != null) {
                        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) unwrappedMediaPlayer;
                        float videoOutputFramesPerSecond = ijkMediaPlayer.getVideoOutputFramesPerSecond();
                        float videoDecodeFramesPerSecond = ijkMediaPlayer.getVideoDecodeFramesPerSecond();
                        long videoCachedBytes = ijkMediaPlayer.getVideoCachedBytes() + ijkMediaPlayer.getAudioCachedBytes();
                        long bitRate = ijkMediaPlayer.getBitRate();
                        long tcpSpeed = ijkMediaPlayer.getTcpSpeed();
                        Bundle bundle = new Bundle();
                        bundle.putFloat("fps", videoOutputFramesPerSecond);
                        bundle.putFloat("dps", videoDecodeFramesPerSecond);
                        bundle.putLong("cachedBytes", videoCachedBytes);
                        bundle.putLong("bitRate", bitRate);
                        bundle.putLong("tcpSpeed", tcpSpeed);
                        tXCVodVideoView.f6239ad.mo5183a(bundle);
                        removeMessages(100);
                        sendEmptyMessageDelayed(100, 500L);
                        break;
                    }
                    break;
                case 101:
                    tXCVodVideoView.f6239ad.mo5182a(message.arg1, message.getData());
                    break;
                case 102:
                    tXCVodVideoView.m5574g();
                    tXCVodVideoView.m5554a(2103, "VOD network reconnected", "reconnect");
                    break;
                case TbsListener.ErrorCode.READ_RESPONSE_ERROR /* 103 */:
                    long currentPosition = tXCVodVideoView.getCurrentPosition();
                    Bundle bundle2 = new Bundle();
                    long bufferDuration = tXCVodVideoView.getBufferDuration();
                    long duration = tXCVodVideoView.getDuration();
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (currentPosition / 1000));
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_DURATION, (int) (duration / 1000));
                    bundle2.putInt("EVT_PLAYABLE_DURATION", (int) (bufferDuration / 1000));
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) currentPosition);
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_DURATION_MS, (int) duration);
                    bundle2.putInt(TXLiveConstants.EVT_PLAYABLE_DURATION_MS, (int) bufferDuration);
                    tXCVodVideoView.f6239ad.mo5182a(2005, bundle2);
                    if (tXCVodVideoView.f6253m != null) {
                        removeMessages(TbsListener.ErrorCode.READ_RESPONSE_ERROR);
                        if (tXCVodVideoView.f6264x.f6334l <= 0) {
                            tXCVodVideoView.f6264x.f6334l = TbsListener.ErrorCode.INFO_CODE_MINIQB;
                        }
                        sendEmptyMessageDelayed(TbsListener.ErrorCode.READ_RESPONSE_ERROR, tXCVodVideoView.f6264x.f6334l);
                        break;
                    }
                    break;
            }
        }
    }

    public TXCVodVideoView(Context context) {
        super(context);
        this.f6248h = "TXCVodVideoView";
        this.f6250j = 0;
        this.f6251k = 0;
        this.f6252l = null;
        this.f6253m = null;
        this.f6235a = true;
        this.f6214C = 1.0f;
        this.f6216E = C6706b.m5623a();
        this.f6242b = true;
        this.f6243c = true;
        this.f6244d = 0;
        this.f6218G = false;
        this.f6219H = -1;
        this.f6220I = 1.0f;
        this.f6221J = 1.0f;
        this.f6222K = false;
        this.f6245e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
                boolean z10 = (TXCVodVideoView.this.f6255o != i11 && Math.abs(TXCVodVideoView.this.f6255o - i11) > 16) || (TXCVodVideoView.this.f6254n != i10 && Math.abs(TXCVodVideoView.this.f6254n - i10) > 16);
                TXCVodVideoView.this.f6254n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f6255o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.f6266z = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.f6212A = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.f6254n != 0 && TXCVodVideoView.this.f6255o != 0) {
                    if (TXCVodVideoView.this.f6265y != null) {
                        TXCVodVideoView.this.f6265y.setVideoSize(TXCVodVideoView.this.f6254n, TXCVodVideoView.this.f6255o);
                        TXCVodVideoView.this.f6265y.setVideoSampleAspectRatio(TXCVodVideoView.this.f6266z, TXCVodVideoView.this.f6212A);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z10) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f6254n + Marker.ANY_MARKER + TXCVodVideoView.this.f6255o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f6254n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f6255o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f6240ae != null) {
                        TXCVodVideoView.this.f6240ae.sendMessage(message);
                    }
                }
            }
        };
        this.f6246f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.f6250j == 1) {
                    TXCVodVideoView.this.m5554a(2013, "VOD ready", "prepared");
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    if (!tXCVodVideoView.f6243c) {
                        tXCVodVideoView.f6251k = 4;
                        TXCVodVideoView.this.f6243c = true;
                    }
                    TXCVodVideoView.this.f6250j = 2;
                }
                TXCVodVideoView.this.f6261u = 0;
                if (TXCVodVideoView.this.f6250j == -1) {
                    TXCVodVideoView.this.f6250j = 3;
                    TXCVodVideoView.this.f6251k = 3;
                }
                if (TXCVodVideoView.this.f6240ae != null) {
                    TXCVodVideoView.this.f6240ae.sendEmptyMessage(100);
                    TXCVodVideoView.this.f6240ae.sendEmptyMessage(TbsListener.ErrorCode.READ_RESPONSE_ERROR);
                }
                TXCVodVideoView.this.f6254n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f6255o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.f6254n == 0 || TXCVodVideoView.this.f6255o == 0) {
                    if (TXCVodVideoView.this.f6251k == 3) {
                        TXCVodVideoView.this.m5603b();
                    }
                } else if (TXCVodVideoView.this.f6265y != null) {
                    TXCVodVideoView.this.f6265y.setVideoSize(TXCVodVideoView.this.f6254n, TXCVodVideoView.this.f6255o);
                    TXCVodVideoView.this.f6265y.setVideoSampleAspectRatio(TXCVodVideoView.this.f6266z, TXCVodVideoView.this.f6212A);
                    if ((!TXCVodVideoView.this.f6265y.shouldWaitForResize() || (TXCVodVideoView.this.f6256p == TXCVodVideoView.this.f6254n && TXCVodVideoView.this.f6257q == TXCVodVideoView.this.f6255o)) && TXCVodVideoView.this.f6251k == 3) {
                        TXCVodVideoView.this.m5603b();
                    }
                }
            }
        };
        this.f6226O = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.f6250j = 5;
                TXCVodVideoView.this.f6251k = 5;
                TXCVodVideoView.this.m5554a(2006, "Playback completed", "play end");
            }
        };
        this.f6227P = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
                if (i10 == 3) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                    if (!TXCVodVideoView.this.f6224M) {
                        TXCVodVideoView.this.m5554a(2003, "VOD displayed the first frame", "render start");
                    }
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.setRate(tXCVodVideoView.f6214C);
                    TXCVodVideoView.this.f6224M = true;
                } else if (i10 == 10011) {
                    TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                } else if (i10 == 901) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                } else if (i10 == 902) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                } else if (i10 == 10001) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    TXCVodVideoView.this.f6259s = i11;
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    if (tXCVodVideoView2.f6235a && tXCVodVideoView2.f6259s > 0) {
                        TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                        tXCVodVideoView3.f6258r = tXCVodVideoView3.f6259s;
                        if (TXCVodVideoView.this.f6265y != null) {
                            TXCVodVideoView.this.f6265y.setVideoRotation(TXCVodVideoView.this.f6258r);
                        }
                    }
                    TXCVodVideoView.this.m5554a(2011, "Video angle " + TXCVodVideoView.this.f6259s, "rotation " + TXCVodVideoView.this.f6259s);
                } else if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                            break;
                        case 701:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BUFFERING_START:");
                            TXCVodVideoView.this.m5554a(2007, "Buffer started", "loading start");
                            break;
                        case 702:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BUFFERING_END: eof " + i11);
                            TXCVodVideoView.this.m5554a(2014, "Buffer ended", "loading end");
                            if ((i11 == 0 || TXCVodVideoView.this.f6249i == null || TXCVodVideoView.this.f6249i.getPath() == null || !TXCVodVideoView.this.f6249i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.f6251k == 3) {
                                TXCVodVideoView.this.m5554a(2004, "Playback started", "playing");
                                break;
                            }
                            break;
                        case 703:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11);
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BAD_INTERLEAVING:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_NOT_SEEKABLE:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_METADATA_UPDATE:");
                                    break;
                            }
                    }
                } else {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                }
                return true;
            }
        };
        this.f6229R = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
                TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onError: " + i10 + "," + i11);
                TXCVodVideoView.this.f6250j = -1;
                TXCVodVideoView.this.f6251k = -1;
                if (i10 == -1004 && i11 == -2303) {
                    TXCVodVideoView.this.m5554a(i11, "The file does not exist", "file not exist");
                    TXCVodVideoView.this.m5605c();
                    return true;
                }
                if (TXCVodVideoView.this.f6217F != TXCVodVideoView.this.getCurrentPosition()) {
                    TXCVodVideoView.this.f6228Q = 0;
                }
                TXCVodVideoView.this.f6217F = r4.getCurrentPosition();
                if (TXCVodVideoView.m5593r(TXCVodVideoView.this) >= TXCVodVideoView.this.f6264x.f6323a) {
                    TXCVodVideoView.this.m5554a(-2301, "Disconnected from the network. Playback error", "disconnect");
                    TXCVodVideoView.this.m5605c();
                } else if (TXCVodVideoView.this.f6240ae != null) {
                    TXCVodVideoView.this.f6240ae.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f6264x.f6324b * 1000.0f));
                }
                return true;
            }
        };
        this.f6230S = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.f6248h;
                TXCVodVideoView.this.m5554a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.f6231T = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.f6248h;
                if (TXCVodVideoView.this.f6250j != 4) {
                    TXCVodVideoView.this.m5554a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.f6224M || !TXCVodVideoView.this.f6264x.f6326d || Math.min(TXCVodVideoView.this.f6255o, TXCVodVideoView.this.f6254n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.f6264x.f6326d = false;
                TXCVodVideoView.this.m5574g();
            }
        };
        this.f6232U = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
                TXCVodVideoView.this.f6260t = i10;
            }
        };
        this.f6233V = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.m4996v(TXCVodVideoView.this.f6248h, "seek complete");
                TXCVodVideoView.this.f6218G = false;
                if (TXCVodVideoView.this.f6219H >= 0) {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m5601a(tXCVodVideoView.f6219H);
                }
            }
        };
        this.f6234W = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.f6236aa = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i10, Bundle bundle) {
                if (i10 != 131074) {
                    if (i10 != 131106) {
                        return false;
                    }
                    TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, "PLAYER_EVENT_DNS_RESOLVED", "dns resolved");
                    return true;
                }
                TXCVodVideoView.this.f6213B = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC, "CTRL_DID_TCP_OPEN", "tcp open");
                return true;
            }
        };
        this.f6237ab = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.f6248h, "onHLSKeyError");
                TXCVodVideoView.this.m5554a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.f6253m != null) {
                    TXCVodVideoView.this.f6253m.stop();
                    TXCVodVideoView.this.f6253m.release();
                    TXCVodVideoView.this.f6253m = null;
                }
                TXCVodVideoView.this.f6250j = -1;
                TXCVodVideoView.this.f6251k = -1;
            }
        };
        this.f6247g = new InterfaceC6704a.a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5610a(@NonNull InterfaceC6704a.b bVar, int i10, int i11, int i12) {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceChanged");
                TXCVodVideoView.this.f6256p = i11;
                TXCVodVideoView.this.f6257q = i12;
                boolean z10 = false;
                boolean z11 = TXCVodVideoView.this.f6251k == 3;
                if (!TXCVodVideoView.this.f6265y.shouldWaitForResize() || (TXCVodVideoView.this.f6254n == i11 && TXCVodVideoView.this.f6255o == i12)) {
                    z10 = true;
                }
                if (TXCVodVideoView.this.f6253m != null && z11 && z10 && TXCVodVideoView.this.f6251k == 3) {
                    TXCVodVideoView.this.m5603b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5609a(@NonNull InterfaceC6704a.b bVar, int i10, int i11) throws FileNotFoundException {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceCreated");
                TXCVodVideoView.this.f6252l = bVar;
                if (TXCVodVideoView.this.f6253m == null) {
                    TXCVodVideoView.this.m5571f();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m5556a(tXCVodVideoView.f6253m, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5608a(@NonNull InterfaceC6704a.b bVar) {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceDestroyed");
                TXCVodVideoView.this.f6252l = null;
                if (TXCVodVideoView.this.f6253m != null) {
                    TXCVodVideoView.this.f6253m.setSurface(null);
                }
                TXCVodVideoView.this.m5600a();
            }
        };
        this.f6238ac = 0;
        this.f6241af = false;
        m5555a(context);
    }

    /* renamed from: r */
    public static /* synthetic */ int m5593r(TXCVodVideoView tXCVodVideoView) {
        int i10 = tXCVodVideoView.f6228Q;
        tXCVodVideoView.f6228Q = i10 + 1;
        return i10;
    }

    public int getBitrateIndex() {
        IMediaPlayer iMediaPlayer = this.f6253m;
        return iMediaPlayer != null ? iMediaPlayer.getBitrateIndex() : this.f6223L;
    }

    public int getBufferDuration() {
        if (this.f6253m == null) {
            return 0;
        }
        getUnwrappedMediaPlayer();
        int duration = (this.f6260t * getDuration()) / 100;
        if (duration < getCurrentPosition()) {
            duration = getCurrentPosition();
        }
        return Math.abs(getDuration() - duration) < 1000 ? getDuration() : duration;
    }

    public int getCurrentPosition() {
        int i10;
        if (this.f6218G && (i10 = this.f6219H) >= 0) {
            return i10;
        }
        int i11 = this.f6261u;
        if (i11 > 0) {
            return i11;
        }
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer != null) {
            return (int) iMediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer != null && this.f6262v < 1) {
            this.f6262v = (int) iMediaPlayer.getDuration();
        }
        return this.f6262v;
    }

    public MediaInfo getMediaInfo() {
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getMediaInfo();
    }

    public int getMetaRotationDegree() {
        return this.f6259s;
    }

    public int getPlayerType() {
        return 0;
    }

    public String getServerIp() {
        return this.f6213B;
    }

    public ArrayList<IjkBitrateItem> getSupportedBitrates() {
        IMediaPlayer iMediaPlayer = this.f6253m;
        return iMediaPlayer != null ? iMediaPlayer.getSupportedBitrates() : new ArrayList<>();
    }

    public IMediaPlayer getUnwrappedMediaPlayer() {
        IMediaPlayer iMediaPlayer = this.f6253m;
        return iMediaPlayer instanceof TextureMediaPlayer ? ((TextureMediaPlayer) iMediaPlayer).getBackEndMediaPlayer() : iMediaPlayer;
    }

    @NonNull
    public String getUrlPathExtention() {
        Uri uri = this.f6249i;
        if (uri == null || uri.getPath() == null) {
            return "";
        }
        String path = this.f6249i.getPath();
        return path.substring(path.lastIndexOf(".") + 1, path.length());
    }

    public int getVideoHeight() {
        return this.f6255o;
    }

    public int getVideoRotationDegree() {
        return this.f6258r;
    }

    public int getVideoWidth() {
        return this.f6254n;
    }

    public void setAutoPlay(boolean z10) {
        this.f6243c = z10;
    }

    public void setAutoRotate(boolean z10) {
        this.f6235a = z10;
    }

    public void setBitrateIndex(int i10) {
        TXCLog.m4994i(this.f6248h, "setBitrateIndex " + i10);
        if (this.f6223L == i10) {
            return;
        }
        this.f6223L = i10;
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer != null) {
            if (this.f6264x.f6332j) {
                iMediaPlayer.setBitrateIndex(i10);
            } else {
                m5574g();
            }
        }
    }

    public void setConfig(C6709d c6709d) {
        if (c6709d != null) {
            this.f6264x = c6709d;
            this.f6216E.m5631a(c6709d.f6333k);
        }
    }

    public void setListener(InterfaceC6710e interfaceC6710e) {
        this.f6239ad = interfaceC6710e;
    }

    public void setMute(boolean z10) {
        this.f6222K = z10;
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer == null) {
            return;
        }
        if (z10) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            iMediaPlayer.setVolume(this.f6220I, this.f6221J);
        }
    }

    public void setPlayerType(int i10) {
    }

    public void setRate(float f10) {
        TXCLog.m4994i(this.f6248h, "setRate " + f10);
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer != null) {
            iMediaPlayer.setRate(f10);
        }
        this.f6214C = f10;
    }

    public void setRender(int i10) {
        if (i10 == 0) {
            setRenderView(null);
            return;
        }
        if (i10 == 1) {
            setRenderView(new SurfaceRenderView(this.f6263w));
            return;
        }
        if (i10 != 2) {
            TXCLog.m4991e(this.f6248h, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
            return;
        }
        TextureRenderView textureRenderView = new TextureRenderView(this.f6263w);
        if (this.f6253m != null) {
            textureRenderView.getSurfaceHolder().mo5545a(this.f6253m);
            textureRenderView.setVideoSize(this.f6253m.getVideoWidth(), this.f6253m.getVideoHeight());
            textureRenderView.setVideoSampleAspectRatio(this.f6253m.getVideoSarNum(), this.f6253m.getVideoSarDen());
            textureRenderView.setAspectRatio(this.f6238ac);
        }
        setRenderView(textureRenderView);
    }

    public void setRenderMode(int i10) {
        this.f6238ac = i10;
        InterfaceC6704a interfaceC6704a = this.f6265y;
        if (interfaceC6704a != null) {
            interfaceC6704a.setAspectRatio(i10);
        }
        InterfaceC6704a interfaceC6704a2 = this.f6265y;
        if (interfaceC6704a2 != null) {
            interfaceC6704a2.setVideoRotation(this.f6258r);
        }
    }

    public void setRenderSurface(final Surface surface) {
        InterfaceC6704a.b bVar = new InterfaceC6704a.b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.1
            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.b
            /* renamed from: a */
            public void mo5545a(IMediaPlayer iMediaPlayer) {
                iMediaPlayer.setSurface(surface);
            }

            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.b
            @NonNull
            /* renamed from: a */
            public InterfaceC6704a mo5544a() {
                return TXCVodVideoView.this.f6265y;
            }
        };
        this.f6252l = bVar;
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer != null) {
            m5556a(iMediaPlayer, bVar);
        }
    }

    public void setRenderView(InterfaceC6704a interfaceC6704a) {
        int i10;
        int i11;
        TXCLog.m4994i(this.f6248h, "setRenderView " + interfaceC6704a);
        if (this.f6265y != null) {
            IMediaPlayer iMediaPlayer = this.f6253m;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f6265y.getView();
            this.f6265y.removeRenderCallback(this.f6247g);
            this.f6265y = null;
            if (view.getParent() == this) {
                removeView(view);
            }
        }
        if (interfaceC6704a == null) {
            return;
        }
        this.f6265y = interfaceC6704a;
        interfaceC6704a.setAspectRatio(this.f6238ac);
        int i12 = this.f6254n;
        if (i12 > 0 && (i11 = this.f6255o) > 0) {
            interfaceC6704a.setVideoSize(i12, i11);
        }
        int i13 = this.f6266z;
        if (i13 > 0 && (i10 = this.f6212A) > 0) {
            interfaceC6704a.setVideoSampleAspectRatio(i13, i10);
        }
        View view2 = this.f6265y.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        if (view2.getParent() == null) {
            addView(view2);
        }
        this.f6265y.addRenderCallback(this.f6247g);
        this.f6265y.setVideoRotation(this.f6258r);
    }

    public void setStartTime(float f10) {
        this.f6261u = (int) (f10 * 1000.0f);
    }

    public void setTextureRenderView(TextureRenderView textureRenderView) {
        TXCLog.m4994i(this.f6248h, "setTextureRenderView " + textureRenderView);
        if (this.f6253m != null) {
            textureRenderView.getSurfaceHolder().mo5545a(this.f6253m);
            textureRenderView.setVideoSize(this.f6253m.getVideoWidth(), this.f6253m.getVideoHeight());
            textureRenderView.setVideoSampleAspectRatio(this.f6253m.getVideoSarNum(), this.f6253m.getVideoSarDen());
            textureRenderView.setAspectRatio(this.f6238ac);
        }
        setRenderView(textureRenderView);
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoRotationDegree(int i10) {
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            if (i10 != 360) {
                TXCLog.m4991e(this.f6248h, "not support degree " + i10);
                return;
            }
            i10 = 0;
        }
        this.f6258r = i10;
        InterfaceC6704a interfaceC6704a = this.f6265y;
        if (interfaceC6704a != null) {
            interfaceC6704a.setVideoRotation(i10);
        }
        InterfaceC6704a interfaceC6704a2 = this.f6265y;
        if (interfaceC6704a2 != null) {
            interfaceC6704a2.setAspectRatio(this.f6238ac);
        }
    }

    public void setVideoURI(Uri uri) throws FileNotFoundException {
        this.f6249i = uri;
        this.f6262v = 0;
        this.f6228Q = 0;
        this.f6213B = null;
        TXCLog.m4994i(this.f6248h, "setVideoURI " + uri);
        m5571f();
        requestLayout();
        invalidate();
    }

    public void setVolume(int i10) {
        float f10 = i10 / 100.0f;
        this.f6220I = f10;
        this.f6221J = f10;
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(f10, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: f */
    public boolean m5571f() throws FileNotFoundException {
        boolean z10;
        IjkMediaPlayer ijkMediaPlayer;
        TXCLog.m4994i(this.f6248h, "openVideo");
        if (this.f6249i == null) {
            return false;
        }
        m5602a(false);
        if (this.f6242b) {
            ((AudioManager) this.f6263w.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        }
        try {
            try {
                String string = this.f6249i.toString();
                if (string.startsWith("/") && !new File(string).exists()) {
                    throw new FileNotFoundException();
                }
                if (this.f6249i != null) {
                    ijkMediaPlayer = new IjkMediaPlayer(new IjkLibLoader() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
                        @Override // com.tencent.ijk.media.player.IjkLibLoader
                        public void loadLibrary(String str) {
                            C6592e.m5044a(str);
                        }
                    });
                    IjkMediaPlayer.native_setLogLevel(3);
                    ijkMediaPlayer.setOnNativeInvokeListener(this.f6236aa);
                    if (this.f6264x.f6326d) {
                        ijkMediaPlayer.setOption(4, "mediacodec", 1L);
                        ijkMediaPlayer.setOption(4, "mediacodec-hevc", 1L);
                    } else {
                        ijkMediaPlayer.setOption(4, "mediacodec", 0L);
                    }
                    TXCLog.m4994i(this.f6248h, "ijk mediacodec " + this.f6264x.f6326d);
                    ijkMediaPlayer.setOption(4, "mediacodec-auto-rotate", 0L);
                    ijkMediaPlayer.setOption(4, "mediacodec-handle-resolution-change", 0L);
                    ijkMediaPlayer.setOption(4, "opensles", 0L);
                    ijkMediaPlayer.setOption(4, "overlay-format", 842225234L);
                    ijkMediaPlayer.setOption(4, "framedrop", 1L);
                    ijkMediaPlayer.setOption(4, "soundtouch", 1L);
                    try {
                        ijkMediaPlayer.setOption(4, "max-fps", 30L);
                        if (this.f6243c && this.f6251k != 4) {
                            ijkMediaPlayer.setOption(4, "start-on-prepared", 1L);
                        } else {
                            ijkMediaPlayer.setOption(4, "start-on-prepared", 0L);
                        }
                        ijkMediaPlayer.setOption(4, "load-on-prepared", 1L);
                        ijkMediaPlayer.setOption(1, "http-detect-range-support", 0L);
                        ijkMediaPlayer.setOption(2, "skip_loop_filter", 0L);
                        ijkMediaPlayer.setOption(2, "skip_frame", 0L);
                        ijkMediaPlayer.setOption(1, "timeout", (int) (this.f6264x.f6325c * 1000.0f * 1000.0f));
                        ijkMediaPlayer.setOption(1, "reconnect", 1L);
                        ijkMediaPlayer.setOption(1, "analyzeduration", 90000000L);
                        ijkMediaPlayer.setOption(4, "enable-accurate-seek", this.f6264x.f6331i ? 1L : 0L);
                        ijkMediaPlayer.setOption(4, "disable-bitrate-sync", this.f6264x.f6332j ? 0L : 1L);
                        ijkMediaPlayer.setOption(1, "dns_cache_timeout", 0L);
                        ijkMediaPlayer.setOption(1, "cache_max_capacity", SieveCacheKt.NodeLinkMask);
                        int i10 = this.f6261u;
                        if (i10 > 0) {
                            ijkMediaPlayer.setOption(4, "seek-at-start", i10);
                            TXCLog.m4994i(this.f6248h, "ijk start time " + this.f6261u);
                        }
                        if (this.f6264x.f6335m > 0) {
                            ijkMediaPlayer.setOption(4, "max-buffer-size", r3 * 1048576);
                            TXCLog.m4994i(this.f6248h, "ijk max buffer size " + this.f6264x.f6335m);
                        }
                        Map<String, String> map = this.f6264x.f6330h;
                        if (map != null) {
                            String str = null;
                            for (String str2 : map.keySet()) {
                                str = str == null ? String.format("%s: %s", str2, this.f6264x.f6330h.get(str2)) : str + "\r\n" + String.format("%s: %s", str2, this.f6264x.f6330h.get(str2));
                            }
                            ijkMediaPlayer.setOption(1, "headers", str);
                        }
                        ijkMediaPlayer.setBitrateIndex(this.f6223L);
                        IjkMediaPlayer.native_setLogLevel(5);
                        if (this.f6264x.f6327e != null && this.f6216E.m5638e(string)) {
                            this.f6216E.m5633b(this.f6264x.f6327e);
                            this.f6216E.m5629a(this.f6264x.f6328f);
                            C6705a c6705aM5637d = this.f6216E.m5637d(string);
                            this.f6215D = c6705aM5637d;
                            if (c6705aM5637d != null) {
                                if (c6705aM5637d.m5619a() != null) {
                                    ijkMediaPlayer.setOption(1, "cache_file_path", this.f6215D.m5619a());
                                    string = "ijkio:cache:ffio:" + this.f6249i.toString();
                                } else if (this.f6215D.m5620b() != null) {
                                    ijkMediaPlayer.setOption(1, "cache_db_path", this.f6215D.m5620b());
                                    string = "ijkhlscache:" + this.f6249i.toString();
                                }
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        z10 = true;
                        this.f6250j = -1;
                        this.f6251k = -1;
                        this.f6229R.onError(this.f6253m, IMediaPlayer.MEDIA_ERROR_IO, -2303);
                        return z10;
                    }
                } else {
                    ijkMediaPlayer = null;
                }
                TXCLog.m4994i(this.f6248h, "ijk media player " + ijkMediaPlayer);
                TextureMediaPlayer textureMediaPlayer = new TextureMediaPlayer(ijkMediaPlayer);
                this.f6253m = textureMediaPlayer;
                textureMediaPlayer.setDataSource(string);
                this.f6253m.setOnPreparedListener(this.f6246f);
                this.f6253m.setOnVideoSizeChangedListener(this.f6245e);
                this.f6253m.setOnCompletionListener(this.f6226O);
                this.f6253m.setOnErrorListener(this.f6229R);
                this.f6253m.setOnInfoListener(this.f6227P);
                this.f6253m.setOnBufferingUpdateListener(this.f6232U);
                this.f6253m.setOnSeekCompleteListener(this.f6233V);
                this.f6253m.setOnTimedTextListener(this.f6234W);
                this.f6253m.setOnHLSKeyErrorListener(this.f6237ab);
                this.f6253m.setOnHevcVideoDecoderErrorListener(this.f6230S);
                this.f6253m.setOnVideoDecoderErrorListener(this.f6231T);
                this.f6260t = 0;
                m5556a(this.f6253m, this.f6252l);
                this.f6253m.setAudioStreamType(3);
                this.f6253m.setScreenOnWhilePlaying(true);
                this.f6253m.prepareAsync();
                this.f6253m.setVolume(this.f6220I, this.f6221J);
                setMute(this.f6222K);
                C6707b c6707b = this.f6225N;
                if (c6707b != null) {
                    c6707b.m5650a(this.f6253m);
                }
                this.f6250j = 1;
                return true;
            } catch (FileNotFoundException unused2) {
                z10 = true;
            }
        } catch (Exception e10) {
            TXCLog.m4998w(this.f6248h, e10.toString());
            this.f6250j = -1;
            this.f6251k = -1;
            this.f6229R.onError(this.f6253m, 1, 0);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m5574g() {
        IMediaPlayer iMediaPlayer;
        TXCLog.m4994i(this.f6248h, "replay");
        if (this.f6261u == 0 && (iMediaPlayer = this.f6253m) != null && this.f6262v > 0) {
            this.f6261u = (int) iMediaPlayer.getCurrentPosition();
        }
        if (m5571f()) {
            return;
        }
        m5602a(false);
    }

    /* renamed from: h */
    private boolean m5577h() {
        int i10;
        return (this.f6253m == null || (i10 = this.f6250j) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    /* renamed from: i */
    private void m5580i() {
        setRender(0);
    }

    /* renamed from: c */
    public void m5605c() {
        if (this.f6253m != null) {
            if (this.f6215D != null) {
                if (getDuration() <= 0) {
                    this.f6216E.m5632a(this.f6215D.m5622d(), true);
                } else {
                    this.f6216E.m5632a(this.f6215D.m5622d(), false);
                }
                this.f6215D = null;
            }
            this.f6253m.stop();
            this.f6253m.release();
            this.f6253m = null;
            this.f6249i = null;
            this.f6254n = 0;
            this.f6255o = 0;
            this.f6214C = 1.0f;
            this.f6218G = false;
            this.f6219H = -1;
            this.f6250j = 0;
            this.f6251k = 0;
            this.f6224M = false;
            this.f6223L = 0;
            C6707b c6707b = this.f6225N;
            if (c6707b != null) {
                c6707b.m5650a((IMediaPlayer) null);
            }
            if (this.f6242b) {
                ((AudioManager) this.f6263w.getSystemService("audio")).abandonAudioFocus(null);
            }
        }
        Handler handler = this.f6240ae;
        if (handler != null) {
            handler.removeMessages(102);
        }
        TXCLog.m4994i(this.f6248h, "stop");
    }

    /* renamed from: d */
    public void m5606d() {
        this.f6251k = 4;
        TXCLog.m4994i(this.f6248h, "pause");
        if (m5577h() && this.f6253m.isPlaying()) {
            this.f6253m.pause();
            this.f6250j = 4;
        }
    }

    /* renamed from: e */
    public boolean m5607e() {
        return m5577h() && this.f6253m.isPlaying() && this.f6250j != 4;
    }

    /* renamed from: b */
    public void m5603b() {
        TXCLog.m4994i(this.f6248h, "start");
        if (m5577h()) {
            this.f6253m.start();
            if (this.f6250j != 3 && !this.f6218G) {
                this.f6250j = 3;
                m5554a(2004, "Playback started", "playing");
            }
        }
        this.f6251k = 3;
    }

    /* renamed from: a */
    private void m5555a(Context context) {
        this.f6263w = context.getApplicationContext();
        this.f6264x = new C6709d();
        m5580i();
        this.f6254n = 0;
        this.f6255o = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f6250j = 0;
        this.f6251k = 0;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.f6240ae = new HandlerC6701a(this, mainLooper);
        } else {
            this.f6240ae = null;
        }
        this.f6225N = new C6707b();
    }

    /* renamed from: b */
    public boolean m5604b(boolean z10) {
        if (this.f6250j != 0) {
            return false;
        }
        this.f6242b = z10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5556a(IMediaPlayer iMediaPlayer, InterfaceC6704a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            TXCLog.m4994i(this.f6248h, "bindSurfaceHolder");
            bVar.mo5545a(iMediaPlayer);
        }
    }

    /* renamed from: a */
    public void m5600a() {
        IMediaPlayer iMediaPlayer = this.f6253m;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: a */
    public void m5602a(boolean z10) {
        if (this.f6253m != null) {
            TXCLog.m4994i(this.f6248h, "release player " + this.f6253m);
            this.f6253m.release();
            this.f6253m = null;
            this.f6250j = 0;
            if (z10) {
                this.f6251k = 0;
                this.f6254n = 0;
                this.f6255o = 0;
            }
            if (this.f6242b) {
                ((AudioManager) this.f6263w.getSystemService("audio")).abandonAudioFocus(null);
            }
        }
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6248h = "TXCVodVideoView";
        this.f6250j = 0;
        this.f6251k = 0;
        this.f6252l = null;
        this.f6253m = null;
        this.f6235a = true;
        this.f6214C = 1.0f;
        this.f6216E = C6706b.m5623a();
        this.f6242b = true;
        this.f6243c = true;
        this.f6244d = 0;
        this.f6218G = false;
        this.f6219H = -1;
        this.f6220I = 1.0f;
        this.f6221J = 1.0f;
        this.f6222K = false;
        this.f6245e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
                boolean z10 = (TXCVodVideoView.this.f6255o != i11 && Math.abs(TXCVodVideoView.this.f6255o - i11) > 16) || (TXCVodVideoView.this.f6254n != i10 && Math.abs(TXCVodVideoView.this.f6254n - i10) > 16);
                TXCVodVideoView.this.f6254n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f6255o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.f6266z = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.f6212A = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.f6254n != 0 && TXCVodVideoView.this.f6255o != 0) {
                    if (TXCVodVideoView.this.f6265y != null) {
                        TXCVodVideoView.this.f6265y.setVideoSize(TXCVodVideoView.this.f6254n, TXCVodVideoView.this.f6255o);
                        TXCVodVideoView.this.f6265y.setVideoSampleAspectRatio(TXCVodVideoView.this.f6266z, TXCVodVideoView.this.f6212A);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z10) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f6254n + Marker.ANY_MARKER + TXCVodVideoView.this.f6255o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f6254n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f6255o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f6240ae != null) {
                        TXCVodVideoView.this.f6240ae.sendMessage(message);
                    }
                }
            }
        };
        this.f6246f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.f6250j == 1) {
                    TXCVodVideoView.this.m5554a(2013, "VOD ready", "prepared");
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    if (!tXCVodVideoView.f6243c) {
                        tXCVodVideoView.f6251k = 4;
                        TXCVodVideoView.this.f6243c = true;
                    }
                    TXCVodVideoView.this.f6250j = 2;
                }
                TXCVodVideoView.this.f6261u = 0;
                if (TXCVodVideoView.this.f6250j == -1) {
                    TXCVodVideoView.this.f6250j = 3;
                    TXCVodVideoView.this.f6251k = 3;
                }
                if (TXCVodVideoView.this.f6240ae != null) {
                    TXCVodVideoView.this.f6240ae.sendEmptyMessage(100);
                    TXCVodVideoView.this.f6240ae.sendEmptyMessage(TbsListener.ErrorCode.READ_RESPONSE_ERROR);
                }
                TXCVodVideoView.this.f6254n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f6255o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.f6254n == 0 || TXCVodVideoView.this.f6255o == 0) {
                    if (TXCVodVideoView.this.f6251k == 3) {
                        TXCVodVideoView.this.m5603b();
                    }
                } else if (TXCVodVideoView.this.f6265y != null) {
                    TXCVodVideoView.this.f6265y.setVideoSize(TXCVodVideoView.this.f6254n, TXCVodVideoView.this.f6255o);
                    TXCVodVideoView.this.f6265y.setVideoSampleAspectRatio(TXCVodVideoView.this.f6266z, TXCVodVideoView.this.f6212A);
                    if ((!TXCVodVideoView.this.f6265y.shouldWaitForResize() || (TXCVodVideoView.this.f6256p == TXCVodVideoView.this.f6254n && TXCVodVideoView.this.f6257q == TXCVodVideoView.this.f6255o)) && TXCVodVideoView.this.f6251k == 3) {
                        TXCVodVideoView.this.m5603b();
                    }
                }
            }
        };
        this.f6226O = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.f6250j = 5;
                TXCVodVideoView.this.f6251k = 5;
                TXCVodVideoView.this.m5554a(2006, "Playback completed", "play end");
            }
        };
        this.f6227P = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
                if (i10 == 3) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                    if (!TXCVodVideoView.this.f6224M) {
                        TXCVodVideoView.this.m5554a(2003, "VOD displayed the first frame", "render start");
                    }
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.setRate(tXCVodVideoView.f6214C);
                    TXCVodVideoView.this.f6224M = true;
                } else if (i10 == 10011) {
                    TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                } else if (i10 == 901) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                } else if (i10 == 902) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                } else if (i10 == 10001) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    TXCVodVideoView.this.f6259s = i11;
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    if (tXCVodVideoView2.f6235a && tXCVodVideoView2.f6259s > 0) {
                        TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                        tXCVodVideoView3.f6258r = tXCVodVideoView3.f6259s;
                        if (TXCVodVideoView.this.f6265y != null) {
                            TXCVodVideoView.this.f6265y.setVideoRotation(TXCVodVideoView.this.f6258r);
                        }
                    }
                    TXCVodVideoView.this.m5554a(2011, "Video angle " + TXCVodVideoView.this.f6259s, "rotation " + TXCVodVideoView.this.f6259s);
                } else if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                            break;
                        case 701:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BUFFERING_START:");
                            TXCVodVideoView.this.m5554a(2007, "Buffer started", "loading start");
                            break;
                        case 702:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BUFFERING_END: eof " + i11);
                            TXCVodVideoView.this.m5554a(2014, "Buffer ended", "loading end");
                            if ((i11 == 0 || TXCVodVideoView.this.f6249i == null || TXCVodVideoView.this.f6249i.getPath() == null || !TXCVodVideoView.this.f6249i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.f6251k == 3) {
                                TXCVodVideoView.this.m5554a(2004, "Playback started", "playing");
                                break;
                            }
                            break;
                        case 703:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11);
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BAD_INTERLEAVING:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_NOT_SEEKABLE:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_METADATA_UPDATE:");
                                    break;
                            }
                    }
                } else {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                }
                return true;
            }
        };
        this.f6229R = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
                TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onError: " + i10 + "," + i11);
                TXCVodVideoView.this.f6250j = -1;
                TXCVodVideoView.this.f6251k = -1;
                if (i10 == -1004 && i11 == -2303) {
                    TXCVodVideoView.this.m5554a(i11, "The file does not exist", "file not exist");
                    TXCVodVideoView.this.m5605c();
                    return true;
                }
                if (TXCVodVideoView.this.f6217F != TXCVodVideoView.this.getCurrentPosition()) {
                    TXCVodVideoView.this.f6228Q = 0;
                }
                TXCVodVideoView.this.f6217F = r4.getCurrentPosition();
                if (TXCVodVideoView.m5593r(TXCVodVideoView.this) >= TXCVodVideoView.this.f6264x.f6323a) {
                    TXCVodVideoView.this.m5554a(-2301, "Disconnected from the network. Playback error", "disconnect");
                    TXCVodVideoView.this.m5605c();
                } else if (TXCVodVideoView.this.f6240ae != null) {
                    TXCVodVideoView.this.f6240ae.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f6264x.f6324b * 1000.0f));
                }
                return true;
            }
        };
        this.f6230S = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.f6248h;
                TXCVodVideoView.this.m5554a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.f6231T = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.f6248h;
                if (TXCVodVideoView.this.f6250j != 4) {
                    TXCVodVideoView.this.m5554a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.f6224M || !TXCVodVideoView.this.f6264x.f6326d || Math.min(TXCVodVideoView.this.f6255o, TXCVodVideoView.this.f6254n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.f6264x.f6326d = false;
                TXCVodVideoView.this.m5574g();
            }
        };
        this.f6232U = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
                TXCVodVideoView.this.f6260t = i10;
            }
        };
        this.f6233V = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.m4996v(TXCVodVideoView.this.f6248h, "seek complete");
                TXCVodVideoView.this.f6218G = false;
                if (TXCVodVideoView.this.f6219H >= 0) {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m5601a(tXCVodVideoView.f6219H);
                }
            }
        };
        this.f6234W = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.f6236aa = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i10, Bundle bundle) {
                if (i10 != 131074) {
                    if (i10 != 131106) {
                        return false;
                    }
                    TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, "PLAYER_EVENT_DNS_RESOLVED", "dns resolved");
                    return true;
                }
                TXCVodVideoView.this.f6213B = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC, "CTRL_DID_TCP_OPEN", "tcp open");
                return true;
            }
        };
        this.f6237ab = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.f6248h, "onHLSKeyError");
                TXCVodVideoView.this.m5554a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.f6253m != null) {
                    TXCVodVideoView.this.f6253m.stop();
                    TXCVodVideoView.this.f6253m.release();
                    TXCVodVideoView.this.f6253m = null;
                }
                TXCVodVideoView.this.f6250j = -1;
                TXCVodVideoView.this.f6251k = -1;
            }
        };
        this.f6247g = new InterfaceC6704a.a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5610a(@NonNull InterfaceC6704a.b bVar, int i10, int i11, int i12) {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceChanged");
                TXCVodVideoView.this.f6256p = i11;
                TXCVodVideoView.this.f6257q = i12;
                boolean z10 = false;
                boolean z11 = TXCVodVideoView.this.f6251k == 3;
                if (!TXCVodVideoView.this.f6265y.shouldWaitForResize() || (TXCVodVideoView.this.f6254n == i11 && TXCVodVideoView.this.f6255o == i12)) {
                    z10 = true;
                }
                if (TXCVodVideoView.this.f6253m != null && z11 && z10 && TXCVodVideoView.this.f6251k == 3) {
                    TXCVodVideoView.this.m5603b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5609a(@NonNull InterfaceC6704a.b bVar, int i10, int i11) throws FileNotFoundException {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceCreated");
                TXCVodVideoView.this.f6252l = bVar;
                if (TXCVodVideoView.this.f6253m == null) {
                    TXCVodVideoView.this.m5571f();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m5556a(tXCVodVideoView.f6253m, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5608a(@NonNull InterfaceC6704a.b bVar) {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceDestroyed");
                TXCVodVideoView.this.f6252l = null;
                if (TXCVodVideoView.this.f6253m != null) {
                    TXCVodVideoView.this.f6253m.setSurface(null);
                }
                TXCVodVideoView.this.m5600a();
            }
        };
        this.f6238ac = 0;
        this.f6241af = false;
        m5555a(context);
    }

    /* renamed from: a */
    public void m5601a(int i10) {
        TXCLog.m4994i(this.f6248h, "seek to " + i10);
        if (getUrlPathExtention().equals(IjkMediaMeta.IJKM_KEY_M3U8)) {
            i10 = Math.min(i10, getDuration() + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        }
        if (i10 >= 0 && m5577h()) {
            if (i10 > getDuration()) {
                i10 = getDuration();
            }
            if (this.f6218G) {
                this.f6219H = i10;
            } else {
                this.f6219H = -1;
                this.f6253m.seekTo(i10);
            }
            this.f6218G = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5554a(int i10, String str, String str2) {
        if ((i10 == -2304 || i10 == 2106) && this.f6241af) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        Bundle bundle = new Bundle();
        message.arg1 = i10;
        bundle.putString("description", str);
        message.setData(bundle);
        Handler handler = this.f6240ae;
        if (handler != null) {
            handler.sendMessage(message);
        }
        if (i10 != 2018 && i10 != 2016) {
            TXCLog.m4994i(this.f6248h, "sendSimpleEvent " + i10 + " " + str2);
        }
        this.f6241af = i10 == -2304 || i10 == 2106;
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6248h = "TXCVodVideoView";
        this.f6250j = 0;
        this.f6251k = 0;
        this.f6252l = null;
        this.f6253m = null;
        this.f6235a = true;
        this.f6214C = 1.0f;
        this.f6216E = C6706b.m5623a();
        this.f6242b = true;
        this.f6243c = true;
        this.f6244d = 0;
        this.f6218G = false;
        this.f6219H = -1;
        this.f6220I = 1.0f;
        this.f6221J = 1.0f;
        this.f6222K = false;
        this.f6245e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i102, int i11, int i12, int i13) {
                boolean z10 = (TXCVodVideoView.this.f6255o != i11 && Math.abs(TXCVodVideoView.this.f6255o - i11) > 16) || (TXCVodVideoView.this.f6254n != i102 && Math.abs(TXCVodVideoView.this.f6254n - i102) > 16);
                TXCVodVideoView.this.f6254n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f6255o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.f6266z = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.f6212A = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.f6254n != 0 && TXCVodVideoView.this.f6255o != 0) {
                    if (TXCVodVideoView.this.f6265y != null) {
                        TXCVodVideoView.this.f6265y.setVideoSize(TXCVodVideoView.this.f6254n, TXCVodVideoView.this.f6255o);
                        TXCVodVideoView.this.f6265y.setVideoSampleAspectRatio(TXCVodVideoView.this.f6266z, TXCVodVideoView.this.f6212A);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z10) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f6254n + Marker.ANY_MARKER + TXCVodVideoView.this.f6255o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f6254n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f6255o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f6240ae != null) {
                        TXCVodVideoView.this.f6240ae.sendMessage(message);
                    }
                }
            }
        };
        this.f6246f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.f6250j == 1) {
                    TXCVodVideoView.this.m5554a(2013, "VOD ready", "prepared");
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    if (!tXCVodVideoView.f6243c) {
                        tXCVodVideoView.f6251k = 4;
                        TXCVodVideoView.this.f6243c = true;
                    }
                    TXCVodVideoView.this.f6250j = 2;
                }
                TXCVodVideoView.this.f6261u = 0;
                if (TXCVodVideoView.this.f6250j == -1) {
                    TXCVodVideoView.this.f6250j = 3;
                    TXCVodVideoView.this.f6251k = 3;
                }
                if (TXCVodVideoView.this.f6240ae != null) {
                    TXCVodVideoView.this.f6240ae.sendEmptyMessage(100);
                    TXCVodVideoView.this.f6240ae.sendEmptyMessage(TbsListener.ErrorCode.READ_RESPONSE_ERROR);
                }
                TXCVodVideoView.this.f6254n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f6255o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.f6254n == 0 || TXCVodVideoView.this.f6255o == 0) {
                    if (TXCVodVideoView.this.f6251k == 3) {
                        TXCVodVideoView.this.m5603b();
                    }
                } else if (TXCVodVideoView.this.f6265y != null) {
                    TXCVodVideoView.this.f6265y.setVideoSize(TXCVodVideoView.this.f6254n, TXCVodVideoView.this.f6255o);
                    TXCVodVideoView.this.f6265y.setVideoSampleAspectRatio(TXCVodVideoView.this.f6266z, TXCVodVideoView.this.f6212A);
                    if ((!TXCVodVideoView.this.f6265y.shouldWaitForResize() || (TXCVodVideoView.this.f6256p == TXCVodVideoView.this.f6254n && TXCVodVideoView.this.f6257q == TXCVodVideoView.this.f6255o)) && TXCVodVideoView.this.f6251k == 3) {
                        TXCVodVideoView.this.m5603b();
                    }
                }
            }
        };
        this.f6226O = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.f6250j = 5;
                TXCVodVideoView.this.f6251k = 5;
                TXCVodVideoView.this.m5554a(2006, "Playback completed", "play end");
            }
        };
        this.f6227P = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i102, int i11) {
                if (i102 == 3) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                    if (!TXCVodVideoView.this.f6224M) {
                        TXCVodVideoView.this.m5554a(2003, "VOD displayed the first frame", "render start");
                    }
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.setRate(tXCVodVideoView.f6214C);
                    TXCVodVideoView.this.f6224M = true;
                } else if (i102 == 10011) {
                    TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                } else if (i102 == 901) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                } else if (i102 == 902) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                } else if (i102 == 10001) {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    TXCVodVideoView.this.f6259s = i11;
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    if (tXCVodVideoView2.f6235a && tXCVodVideoView2.f6259s > 0) {
                        TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                        tXCVodVideoView3.f6258r = tXCVodVideoView3.f6259s;
                        if (TXCVodVideoView.this.f6265y != null) {
                            TXCVodVideoView.this.f6265y.setVideoRotation(TXCVodVideoView.this.f6258r);
                        }
                    }
                    TXCVodVideoView.this.m5554a(2011, "Video angle " + TXCVodVideoView.this.f6259s, "rotation " + TXCVodVideoView.this.f6259s);
                } else if (i102 != 10002) {
                    switch (i102) {
                        case 700:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                            break;
                        case 701:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BUFFERING_START:");
                            TXCVodVideoView.this.m5554a(2007, "Buffer started", "loading start");
                            break;
                        case 702:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BUFFERING_END: eof " + i11);
                            TXCVodVideoView.this.m5554a(2014, "Buffer ended", "loading end");
                            if ((i11 == 0 || TXCVodVideoView.this.f6249i == null || TXCVodVideoView.this.f6249i.getPath() == null || !TXCVodVideoView.this.f6249i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.f6251k == 3) {
                                TXCVodVideoView.this.m5554a(2004, "Playback started", "playing");
                                break;
                            }
                            break;
                        case 703:
                            TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11);
                            break;
                        default:
                            switch (i102) {
                                case 800:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_BAD_INTERLEAVING:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_NOT_SEEKABLE:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_METADATA_UPDATE:");
                                    break;
                            }
                    }
                } else {
                    TXCLog.m4994i(TXCVodVideoView.this.f6248h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                }
                return true;
            }
        };
        this.f6229R = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i102, int i11) {
                TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onError: " + i102 + "," + i11);
                TXCVodVideoView.this.f6250j = -1;
                TXCVodVideoView.this.f6251k = -1;
                if (i102 == -1004 && i11 == -2303) {
                    TXCVodVideoView.this.m5554a(i11, "The file does not exist", "file not exist");
                    TXCVodVideoView.this.m5605c();
                    return true;
                }
                if (TXCVodVideoView.this.f6217F != TXCVodVideoView.this.getCurrentPosition()) {
                    TXCVodVideoView.this.f6228Q = 0;
                }
                TXCVodVideoView.this.f6217F = r4.getCurrentPosition();
                if (TXCVodVideoView.m5593r(TXCVodVideoView.this) >= TXCVodVideoView.this.f6264x.f6323a) {
                    TXCVodVideoView.this.m5554a(-2301, "Disconnected from the network. Playback error", "disconnect");
                    TXCVodVideoView.this.m5605c();
                } else if (TXCVodVideoView.this.f6240ae != null) {
                    TXCVodVideoView.this.f6240ae.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f6264x.f6324b * 1000.0f));
                }
                return true;
            }
        };
        this.f6230S = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.f6248h;
                TXCVodVideoView.this.m5554a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.f6231T = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                String unused = TXCVodVideoView.this.f6248h;
                if (TXCVodVideoView.this.f6250j != 4) {
                    TXCVodVideoView.this.m5554a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.f6224M || !TXCVodVideoView.this.f6264x.f6326d || Math.min(TXCVodVideoView.this.f6255o, TXCVodVideoView.this.f6254n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.f6264x.f6326d = false;
                TXCVodVideoView.this.m5574g();
            }
        };
        this.f6232U = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i102) {
                TXCVodVideoView.this.f6260t = i102;
            }
        };
        this.f6233V = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.m4996v(TXCVodVideoView.this.f6248h, "seek complete");
                TXCVodVideoView.this.f6218G = false;
                if (TXCVodVideoView.this.f6219H >= 0) {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m5601a(tXCVodVideoView.f6219H);
                }
            }
        };
        this.f6234W = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.f6236aa = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i102, Bundle bundle) {
                if (i102 != 131074) {
                    if (i102 != 131106) {
                        return false;
                    }
                    TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, "PLAYER_EVENT_DNS_RESOLVED", "dns resolved");
                    return true;
                }
                TXCVodVideoView.this.f6213B = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                TXCVodVideoView.this.m5554a(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC, "CTRL_DID_TCP_OPEN", "tcp open");
                return true;
            }
        };
        this.f6237ab = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.f6248h, "onHLSKeyError");
                TXCVodVideoView.this.m5554a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.f6253m != null) {
                    TXCVodVideoView.this.f6253m.stop();
                    TXCVodVideoView.this.f6253m.release();
                    TXCVodVideoView.this.f6253m = null;
                }
                TXCVodVideoView.this.f6250j = -1;
                TXCVodVideoView.this.f6251k = -1;
            }
        };
        this.f6247g = new InterfaceC6704a.a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5610a(@NonNull InterfaceC6704a.b bVar, int i102, int i11, int i12) {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceChanged");
                TXCVodVideoView.this.f6256p = i11;
                TXCVodVideoView.this.f6257q = i12;
                boolean z10 = false;
                boolean z11 = TXCVodVideoView.this.f6251k == 3;
                if (!TXCVodVideoView.this.f6265y.shouldWaitForResize() || (TXCVodVideoView.this.f6254n == i11 && TXCVodVideoView.this.f6255o == i12)) {
                    z10 = true;
                }
                if (TXCVodVideoView.this.f6253m != null && z11 && z10 && TXCVodVideoView.this.f6251k == 3) {
                    TXCVodVideoView.this.m5603b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5609a(@NonNull InterfaceC6704a.b bVar, int i102, int i11) throws FileNotFoundException {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceCreated");
                TXCVodVideoView.this.f6252l = bVar;
                if (TXCVodVideoView.this.f6253m == null) {
                    TXCVodVideoView.this.m5571f();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m5556a(tXCVodVideoView.f6253m, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6704a.a
            /* renamed from: a */
            public void mo5608a(@NonNull InterfaceC6704a.b bVar) {
                if (bVar.mo5544a() != TXCVodVideoView.this.f6265y) {
                    TXCLog.m4991e(TXCVodVideoView.this.f6248h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.m4994i(TXCVodVideoView.this.f6248h, "onSurfaceDestroyed");
                TXCVodVideoView.this.f6252l = null;
                if (TXCVodVideoView.this.f6253m != null) {
                    TXCVodVideoView.this.f6253m.setSurface(null);
                }
                TXCVodVideoView.this.m5600a();
            }
        };
        this.f6238ac = 0;
        this.f6241af = false;
        m5555a(context);
    }
}
