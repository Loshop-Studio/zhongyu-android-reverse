package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.structs.C6585a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes4.dex */
public abstract class TXIStreamDownloader {
    protected Context mApplicationContext;
    protected Map<String, String> mHeaders;
    protected InterfaceC6645h mListener = null;
    protected InterfaceC6559b mNotifyListener = null;
    protected InterfaceC6628a mRestartListener = null;
    protected boolean mIsRunning = false;
    protected String mOriginUrl = "";
    public int connectRetryTimes = 0;
    public int connectRetryLimit = 3;
    public int connectRetryInterval = 3;
    protected boolean mEnableMessage = false;
    protected boolean mEnableMetaData = false;
    protected String mFlvSessionKey = "";
    protected String mUserID = "";

    /* renamed from: com.tencent.liteav.network.TXIStreamDownloader$a */
    public interface InterfaceC6628a {
        void onOldStreamStop();

        void onRestartDownloader();
    }

    public TXIStreamDownloader(Context context) {
        this.mApplicationContext = context;
    }

    public void PushAudioFrame(byte[] bArr, int i10, long j10, int i11) {
    }

    public void PushVideoFrame(byte[] bArr, int i10, long j10, long j11, int i11) {
    }

    public int getConnectCountQuic() {
        return 0;
    }

    public int getConnectCountTcp() {
        return 0;
    }

    public String getCurrentStreamUrl() {
        return null;
    }

    public long getCurrentTS() {
        return 0L;
    }

    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        return null;
    }

    public String getFlvSessionKey() {
        return this.mFlvSessionKey;
    }

    public long getLastIFrameTS() {
        return 0L;
    }

    public String getRealStreamUrl() {
        return null;
    }

    public boolean isQuicChannel() {
        return false;
    }

    public void onRecvAudioData(byte[] bArr, int i10, int i11, int i12) {
        if (this.mListener != null) {
            C6585a c6585a = new C6585a();
            c6585a.f5492f = bArr;
            c6585a.f5491e = i10;
            if (i11 == 10) {
                if (i12 == 1) {
                    c6585a.f5490d = 2;
                } else {
                    c6585a.f5490d = 3;
                }
                if (c6585a.f5490d == 2) {
                    c6585a.f5489c = 16;
                }
            }
            if (i11 == 2) {
                c6585a.f5490d = 5;
            }
            c6585a.f5494h = i11;
            c6585a.f5493g = i12;
            this.mListener.onPullAudio(c6585a);
        }
    }

    public void onRecvMetaData(HashMap<String, String> map) {
        if (map == null || map.size() <= 0 || this.mNotifyListener == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("EVT_GET_METADATA", map);
        this.mNotifyListener.onNotifyEvent(2028, bundle);
    }

    public void onRecvSEIData(byte[] bArr) {
        if (bArr == null || bArr.length <= 0 || this.mNotifyListener == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray(TXLiveConstants.EVT_GET_MSG, bArr);
        this.mNotifyListener.onNotifyEvent(2012, bundle);
    }

    public void onRecvVideoData(byte[] bArr, int i10, long j10, long j11, int i11) {
        if (this.mListener != null) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.nalType = i10;
            tXSNALPacket.dts = j10;
            tXSNALPacket.pts = j11;
            tXSNALPacket.codecId = i11;
            this.mListener.onPullNAL(tXSNALPacket);
        }
    }

    public void requestKeyFrame(String str) {
    }

    public void sendNotifyEvent(int i10) {
        InterfaceC6559b interfaceC6559b = this.mNotifyListener;
        if (interfaceC6559b != null) {
            interfaceC6559b.onNotifyEvent(i10, null);
        }
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setListener(InterfaceC6645h interfaceC6645h) {
        this.mListener = interfaceC6645h;
    }

    public void setNotifyListener(InterfaceC6559b interfaceC6559b) {
        this.mNotifyListener = interfaceC6559b;
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
    }

    public void setRestartListener(InterfaceC6628a interfaceC6628a) {
        this.mRestartListener = interfaceC6628a;
    }

    public void setUserID(String str) {
        this.mUserID = str;
    }

    public abstract void startDownload(Vector<C6642e> vector, boolean z10, boolean z11, boolean z12, boolean z13);

    public abstract void stopDownload();

    public void sendNotifyEvent(int i10, String str) {
        if (this.mNotifyListener != null) {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
            this.mNotifyListener.onNotifyEvent(i10, bundle);
        }
    }
}
