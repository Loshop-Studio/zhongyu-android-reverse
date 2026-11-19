package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.rtmp.p056ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class TXLivePlayer {
    public static final int PLAY_TYPE_LIVE_FLV = 1;
    public static final int PLAY_TYPE_LIVE_RTMP = 0;
    public static final int PLAY_TYPE_LIVE_RTMP_ACC = 5;
    public static final int PLAY_TYPE_LOCAL_VIDEO = 6;
    public static final int PLAY_TYPE_VOD_FLV = 2;
    public static final int PLAY_TYPE_VOD_HLS = 3;
    public static final int PLAY_TYPE_VOD_MP4 = 4;
    public static final String TAG = "TXLivePlayer";
    private C6727a mTXLivePlayerImpl;

    public interface ITXAudioRawDataListener {
        void onAudioInfoChanged(int i10, int i11, int i12);

        void onPcmDataAvailable(byte[] bArr, long j10);
    }

    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i10);
    }

    public interface ITXLivePlayVideoRenderListener {
        void onRenderVideoFrame(TXLiteAVTexture tXLiteAVTexture);
    }

    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    public interface ITXVideoRawDataListener {
        void onVideoRawDataAvailable(byte[] bArr, int i10, int i11, int i12);
    }

    public static class TXLiteAVTexture {
        public Object eglContext;
        public int height;
        public int textureId;
        public int width;
    }

    public TXLivePlayer(Context context) {
        this.mTXLivePlayerImpl = new C6727a(context);
    }

    public boolean addVideoRawData(byte[] bArr) {
        return this.mTXLivePlayerImpl.m5793a(bArr);
    }

    public void callExperimentalAPI(String str) throws JSONException {
        this.mTXLivePlayerImpl.m5797b(str);
    }

    public void enableAudioVolumeEvaluation(int i10) {
        this.mTXLivePlayerImpl.m5806e(i10);
    }

    public boolean enableHardwareDecode(boolean z10) {
        return this.mTXLivePlayerImpl.m5798b(z10);
    }

    public boolean isPlaying() {
        return this.mTXLivePlayerImpl.m5792a();
    }

    public void pause() {
        this.mTXLivePlayerImpl.m5795b();
    }

    public int prepareLiveSeek(String str, int i10) {
        return this.mTXLivePlayerImpl.m5794b(str, i10);
    }

    public void resume() {
        this.mTXLivePlayerImpl.m5799c();
    }

    public int resumeLive() {
        return this.mTXLivePlayerImpl.m5805e();
    }

    public void seek(int i10) {
        this.mTXLivePlayerImpl.m5808g(i10);
    }

    public void setAudioRawDataListener(ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mTXLivePlayerImpl.m5786a(iTXAudioRawDataListener);
    }

    public void setAudioRoute(int i10) {
        this.mTXLivePlayerImpl.m5803d(i10);
    }

    public void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mTXLivePlayerImpl.m5787a(iTXAudioVolumeEvaluationListener);
    }

    @Deprecated
    public void setAutoPlay(boolean z10) {
        this.mTXLivePlayerImpl.m5804d(z10);
    }

    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
        this.mTXLivePlayerImpl.m5785a(tXLivePlayConfig);
    }

    public void setMute(boolean z10) {
        this.mTXLivePlayerImpl.m5801c(z10);
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mTXLivePlayerImpl.m5784a(iTXLivePlayListener);
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        this.mTXLivePlayerImpl.m5790a(tXCloudVideoView);
    }

    @Deprecated
    public void setRate(float f10) {
        this.mTXLivePlayerImpl.m5780a(f10);
    }

    public void setRenderMode(int i10) {
        this.mTXLivePlayerImpl.m5781a(i10);
    }

    public void setRenderRotation(int i10) {
        this.mTXLivePlayerImpl.m5796b(i10);
    }

    public void setSurface(Surface surface) {
        this.mTXLivePlayerImpl.m5783a(surface);
    }

    public void setSurfaceSize(int i10, int i11) {
        this.mTXLivePlayerImpl.m5782a(i10, i11);
    }

    public void setVideoRawDataListener(ITXVideoRawDataListener iTXVideoRawDataListener) {
        this.mTXLivePlayerImpl.m5789a(iTXVideoRawDataListener);
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mTXLivePlayerImpl.m5791a(iTXVideoRecordListener);
    }

    public int setVideoRenderListener(ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        return this.mTXLivePlayerImpl.m5776a(iTXLivePlayVideoRenderListener, obj);
    }

    public void setVolume(int i10) {
        this.mTXLivePlayerImpl.m5800c(i10);
    }

    public void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        this.mTXLivePlayerImpl.m5788a(iTXSnapshotListener);
    }

    public int startPlay(String str, int i10) {
        return this.mTXLivePlayerImpl.m5778a(str, i10);
    }

    public int startRecord(int i10) {
        return this.mTXLivePlayerImpl.m5807f(i10);
    }

    public int stopPlay(boolean z10) {
        return this.mTXLivePlayerImpl.m5779a(z10);
    }

    public int stopRecord() {
        return this.mTXLivePlayerImpl.m5802d();
    }

    public int switchStream(String str) {
        return this.mTXLivePlayerImpl.m5777a(str);
    }
}
