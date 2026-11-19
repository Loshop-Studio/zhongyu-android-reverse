package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.C6601d;
import com.tencent.liteav.C6604g;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.C6643f;
import com.tencent.liteav.network.C6646i;
import com.tencent.liteav.network.InterfaceC6644g;
import com.tencent.liteav.txcvodplayer.TextureRenderView;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p056ui.TXCloudVideoView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class TXVodPlayer implements InterfaceC6559b, InterfaceC6644g {
    public static final int PLAYER_TYPE_EXO = 1;
    public static final int PLAYER_TYPE_FFPLAY = 0;
    public static final String TAG = "TXVodPlayer";
    private int mBitrateIndex;
    private TXVodPlayConfig mConfig;
    private Context mContext;
    private boolean mIsGetPlayInfo;
    private boolean mLoop;
    private boolean mMirror;
    private C6643f mNetApi;
    private C6604g mPlayer;
    private int mRenderMode;
    private int mRenderRotation;
    protected float mStartTime;
    private Surface mSurface;
    private TXCloudVideoView mTXCloudVideoView;
    private TextureRenderView mTextureView;
    private String mToken;
    private boolean mEnableHWDec = false;
    private String mPlayUrl = "";
    private boolean mMute = false;
    private boolean mIsGainAudioFocus = true;
    private boolean mAutoPlay = true;
    private float mRate = 1.0f;
    private boolean mSnapshotRunning = false;
    private ITXLivePlayListener mListener = null;
    private ITXVodPlayListener mNewListener = null;

    public TXVodPlayer(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        TXCCommonUtil.setAppContext(applicationContext);
        TXCLog.init();
    }

    private String checkPlayUrl(String str) throws UnsupportedEncodingException {
        if (str.startsWith("http")) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                StringBuilder sb = new StringBuilder(bytes.length);
                for (int i10 = 0; i10 < bytes.length; i10++) {
                    int i11 = bytes[i10];
                    if (i11 < 0) {
                        i11 += 256;
                    }
                    if (i11 <= 32 || i11 >= 127 || i11 == 34 || i11 == 37 || i11 == 60 || i11 == 62 || i11 == 91 || i11 == 125 || i11 == 92 || i11 == 93 || i11 == 94 || i11 == 96 || i11 == 123 || i11 == 124) {
                        if (i11 == 37) {
                            TXCLog.m4998w(TAG, "URL has been transcoded");
                            return str;
                        }
                        sb.append(String.format("%%%02X", Integer.valueOf(i11)));
                    } else {
                        sb.append((char) i11);
                    }
                }
                str = sb.toString();
            } catch (Exception e10) {
                TXCLog.m4992e(TAG, "get utf-8 string failed.", e10);
            }
        }
        return str.trim();
    }

    private boolean isAVCDecBlacklistDevices() {
        return Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Build.MODEL.equalsIgnoreCase("Che2-TL00");
    }

    private void postBitmapToMainThread(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
        if (iTXSnapshotListener == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.TXVodPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                TXLivePlayer.ITXSnapshotListener iTXSnapshotListener2 = iTXSnapshotListener;
                if (iTXSnapshotListener2 != null) {
                    iTXSnapshotListener2.onSnapshot(bitmap);
                }
                TXVodPlayer.this.mSnapshotRunning = false;
            }
        });
    }

    public boolean enableHardwareDecode(boolean z10) {
        if (!z10 || !isAVCDecBlacklistDevices()) {
            this.mEnableHWDec = z10;
            updateConfig();
            return true;
        }
        TXCLog.m4991e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + Build.MANUFACTURER + ", MODEL" + Build.MODEL);
        return false;
    }

    public int getBitrateIndex() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.m5180o();
        }
        return 0;
    }

    public float getBufferDuration() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.m5175j();
        }
        return 0.0f;
    }

    public float getCurrentPlaybackTime() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.m5174h();
        }
        return 0.0f;
    }

    public float getDuration() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.m5176k();
        }
        return 0.0f;
    }

    public int getHeight() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.m5179n();
        }
        return 0;
    }

    public float getPlayableDuration() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.m5177l();
        }
        return 0.0f;
    }

    public ArrayList<TXBitrateItem> getSupportedBitrates() {
        C6604g c6604g = this.mPlayer;
        return c6604g != null ? c6604g.m5181p() : new ArrayList<>();
    }

    public int getWidth() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.m5178m();
        }
        return 0;
    }

    public boolean isLoop() {
        return this.mLoop;
    }

    public boolean isPlaying() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.mo5116c();
        }
        return false;
    }

    @Override // com.tencent.liteav.network.InterfaceC6644g
    public void onNetFailed(C6643f c6643f, String str, int i10) {
        if (c6643f != this.mNetApi) {
            return;
        }
        this.mIsGetPlayInfo = false;
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", 2010);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
        bundle.putInt("EVT_PARAM1", i10);
        onNotifyEvent(-2306, bundle);
    }

    @Override // com.tencent.liteav.network.InterfaceC6644g
    public void onNetSuccess(C6643f c6643f) throws ClassNotFoundException {
        if (c6643f != this.mNetApi) {
            return;
        }
        C6646i c6646iM5289a = c6643f.m5289a();
        if (!this.mIsGetPlayInfo) {
            startPlay(c6646iM5289a.m5294a());
        }
        this.mIsGetPlayInfo = false;
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", 2010);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Requested file information successfully");
        bundle.putString(TXLiveConstants.EVT_PLAY_URL, c6646iM5289a.m5294a());
        bundle.putString(TXLiveConstants.EVT_PLAY_COVER_URL, c6646iM5289a.m5296b());
        bundle.putString(TXLiveConstants.EVT_PLAY_NAME, c6646iM5289a.m5300f());
        bundle.putString(TXLiveConstants.EVT_PLAY_DESCRIPTION, c6646iM5289a.m5301g());
        if (c6646iM5289a.m5298d() != null) {
            bundle.putInt(TXLiveConstants.EVT_PLAY_DURATION, c6646iM5289a.m5298d().m5307c());
        }
        onNotifyEvent(2010, bundle);
    }

    @Override // com.tencent.liteav.basic.p047b.InterfaceC6559b
    public void onNotifyEvent(int i10, Bundle bundle) {
        if (i10 == 15001) {
            TXCloudVideoView tXCloudVideoView = this.mTXCloudVideoView;
            if (tXCloudVideoView != null) {
                tXCloudVideoView.setLogText(bundle, null, 0);
            }
            ITXLivePlayListener iTXLivePlayListener = this.mListener;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onNetStatus(bundle);
            }
            ITXVodPlayListener iTXVodPlayListener = this.mNewListener;
            if (iTXVodPlayListener != null) {
                iTXVodPlayListener.onNetStatus(this, bundle);
                return;
            }
            return;
        }
        TXCloudVideoView tXCloudVideoView2 = this.mTXCloudVideoView;
        if (tXCloudVideoView2 != null) {
            tXCloudVideoView2.setLogText(null, bundle, i10);
        }
        ITXLivePlayListener iTXLivePlayListener2 = this.mListener;
        if (iTXLivePlayListener2 != null) {
            iTXLivePlayListener2.onPlayEvent(i10, bundle);
        }
        ITXVodPlayListener iTXVodPlayListener2 = this.mNewListener;
        if (iTXVodPlayListener2 != null) {
            iTXVodPlayListener2.onPlayEvent(this, i10, bundle);
        }
    }

    public void pause() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5099a();
        }
    }

    public void resume() {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5111b();
        }
    }

    public void seek(int i10) {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5169e(i10);
        }
    }

    public void setAutoPlay(boolean z10) {
        this.mAutoPlay = z10;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5170e(z10);
        }
    }

    public void setBitrateIndex(int i10) {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.m5171f(i10);
        }
        this.mBitrateIndex = i10;
    }

    public void setConfig(TXVodPlayConfig tXVodPlayConfig) {
        this.mConfig = tXVodPlayConfig;
        if (tXVodPlayConfig == null) {
            this.mConfig = new TXVodPlayConfig();
        }
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            C6601d c6601dM5188q = c6604g.m5188q();
            if (c6601dM5188q == null) {
                c6601dM5188q = new C6601d();
            }
            TXVodPlayConfig tXVodPlayConfig2 = this.mConfig;
            c6601dM5188q.f5608e = tXVodPlayConfig2.mConnectRetryCount;
            c6601dM5188q.f5609f = tXVodPlayConfig2.mConnectRetryInterval;
            c6601dM5188q.f5621r = tXVodPlayConfig2.mTimeout;
            c6601dM5188q.f5611h = this.mEnableHWDec;
            c6601dM5188q.f5617n = tXVodPlayConfig2.mCacheFolderPath;
            c6601dM5188q.f5618o = tXVodPlayConfig2.mMaxCacheItems;
            c6601dM5188q.f5619p = tXVodPlayConfig2.mPlayerType;
            c6601dM5188q.f5620q = tXVodPlayConfig2.mHeaders;
            c6601dM5188q.f5622s = tXVodPlayConfig2.enableAccurateSeek;
            c6601dM5188q.f5623t = tXVodPlayConfig2.autoRotate;
            c6601dM5188q.f5624u = tXVodPlayConfig2.smoothSwitchBitrate;
            c6601dM5188q.f5625v = tXVodPlayConfig2.cacheMp4ExtName;
            c6601dM5188q.f5626w = tXVodPlayConfig2.progressInterval;
            c6601dM5188q.f5627x = tXVodPlayConfig2.maxBufferSize;
            this.mPlayer.mo5105a(c6601dM5188q);
        }
    }

    public void setLoop(boolean z10) {
        this.mLoop = z10;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.m5172f(z10);
        }
    }

    public void setMirror(boolean z10) {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.m5173g(z10);
        }
        this.mMirror = z10;
    }

    public void setMute(boolean z10) {
        this.mMute = z10;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5113b(z10);
        }
    }

    @Deprecated
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mListener = iTXLivePlayListener;
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        this.mTXCloudVideoView = tXCloudVideoView;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5108a(tXCloudVideoView);
        }
    }

    public void setRate(float f10) {
        this.mRate = f10;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5166b(f10);
        }
    }

    public void setRenderMode(int i10) {
        this.mRenderMode = i10;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5100a(i10);
        }
    }

    public void setRenderRotation(int i10) {
        this.mRenderRotation = i10;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5112b(i10);
        }
    }

    public boolean setRequestAudioFocus(boolean z10) {
        this.mIsGainAudioFocus = z10;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            return c6604g.mo5168d(z10);
        }
        return true;
    }

    public void setStartTime(float f10) {
        this.mStartTime = f10;
    }

    public void setSurface(Surface surface) {
        this.mSurface = surface;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5103a(surface);
        }
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void setVodListener(ITXVodPlayListener iTXVodPlayListener) {
        this.mNewListener = iTXVodPlayListener;
    }

    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        if (this.mSnapshotRunning || iTXSnapshotListener == null) {
            return;
        }
        this.mSnapshotRunning = true;
        C6604g c6604g = this.mPlayer;
        TextureView textureViewMo5118d = c6604g != null ? c6604g.mo5118d() : null;
        if (textureViewMo5118d == null) {
            this.mSnapshotRunning = false;
            return;
        }
        Bitmap bitmap = textureViewMo5118d.getBitmap();
        if (bitmap != null) {
            Matrix transform = textureViewMo5118d.getTransform(null);
            if (this.mMirror) {
                transform.postScale(-1.0f, 1.0f);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), transform, true);
            bitmap.recycle();
            bitmap = bitmapCreateBitmap;
        }
        postBitmapToMainThread(iTXSnapshotListener, bitmap);
    }

    public int startPlay(String str) throws ClassNotFoundException {
        String path;
        if (str == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        TXCDRApi.initCrashReport(this.mContext);
        int i10 = this.mBitrateIndex;
        stopPlay(false);
        this.mBitrateIndex = i10;
        if (this.mToken != null && (path = Uri.parse(str).getPath()) != null) {
            String[] strArrSplit = path.split("/");
            if (strArrSplit.length > 0) {
                int iLastIndexOf = str.lastIndexOf(strArrSplit[strArrSplit.length - 1]);
                str = str.substring(0, iLastIndexOf) + "voddrm.token." + this.mToken + "." + str.substring(iLastIndexOf);
            }
        }
        this.mPlayUrl = checkPlayUrl(str);
        TXCLog.m4994i(TAG, "===========================================================================================================================================================");
        TXCLog.m4994i(TAG, "===========================================================================================================================================================");
        TXCLog.m4994i(TAG, "=====  StartPlay url = " + this.mPlayUrl + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.m4994i(TAG, "===========================================================================================================================================================");
        TXCLog.m4994i(TAG, "===========================================================================================================================================================");
        if (this.mPlayer == null) {
            this.mPlayer = new C6604g(this.mContext);
        }
        updateConfig();
        TXCloudVideoView tXCloudVideoView = this.mTXCloudVideoView;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.mTXCloudVideoView.setVisibility(0);
            this.mPlayer.mo5108a(this.mTXCloudVideoView);
        } else {
            Surface surface = this.mSurface;
            if (surface != null) {
                this.mPlayer.mo5103a(surface);
            } else {
                TextureRenderView textureRenderView = this.mTextureView;
                if (textureRenderView != null) {
                    this.mPlayer.m5165a(textureRenderView);
                }
            }
        }
        this.mPlayer.m5171f(this.mBitrateIndex);
        this.mPlayer.m5187a(this);
        this.mPlayer.mo5168d(this.mIsGainAudioFocus);
        this.mPlayer.mo5170e(this.mAutoPlay);
        this.mPlayer.m5167c(this.mStartTime);
        this.mPlayer.mo5097a(this.mPlayUrl, 0);
        this.mPlayer.mo5113b(this.mMute);
        this.mPlayer.mo5166b(this.mRate);
        this.mPlayer.mo5112b(this.mRenderRotation);
        this.mPlayer.mo5100a(this.mRenderMode);
        this.mPlayer.m5172f(this.mLoop);
        setMirror(this.mMirror);
        return 0;
    }

    public int stopPlay(boolean z10) {
        TXCloudVideoView tXCloudVideoView;
        if (z10 && (tXCloudVideoView = this.mTXCloudVideoView) != null) {
            tXCloudVideoView.setVisibility(8);
        }
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.mo5098a(z10);
        }
        this.mPlayUrl = "";
        C6643f c6643f = this.mNetApi;
        if (c6643f != null) {
            c6643f.m5290a((InterfaceC6644g) null);
            this.mNetApi = null;
        }
        this.mBitrateIndex = 0;
        this.mIsGetPlayInfo = false;
        return 0;
    }

    public void updateConfig() {
        setConfig(this.mConfig);
    }

    public void seek(float f10) {
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.m5164a(f10);
        }
    }

    public void setPlayerView(TextureRenderView textureRenderView) {
        this.mTextureView = textureRenderView;
        C6604g c6604g = this.mPlayer;
        if (c6604g != null) {
            c6604g.m5165a(textureRenderView);
        }
    }

    public int startPlay(TXPlayerAuthBuilder tXPlayerAuthBuilder) {
        C6643f c6643f = new C6643f();
        this.mNetApi = c6643f;
        c6643f.m5292a(tXPlayerAuthBuilder.isHttps);
        this.mNetApi.m5290a(this);
        return this.mNetApi.m5288a(tXPlayerAuthBuilder.appId, tXPlayerAuthBuilder.fileId, tXPlayerAuthBuilder.timeout, tXPlayerAuthBuilder.f6454us, tXPlayerAuthBuilder.exper, tXPlayerAuthBuilder.sign);
    }
}
