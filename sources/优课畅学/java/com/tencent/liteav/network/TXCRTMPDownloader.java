package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.network.TXIStreamDownloader;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Vector;

/* loaded from: classes4.dex */
public class TXCRTMPDownloader extends TXIStreamDownloader {
    private final int MSG_EVENT;
    private final int MSG_RECONNECT;
    private final String TAG;
    private int mConnectCountQuic;
    private int mConnectCountTcp;
    private C6618a mCurrentThread;
    private boolean mEnableNearestIP;
    private Handler mHandler;
    private boolean mHasTcpPlayUrl;
    private boolean mIsPlayRtmpAccStream;
    private int mLastNetworkType;
    private String mPlayUrl;
    private boolean mQuicChannel;
    private Object mRTMPThreadLock;
    private String mServerIp;
    private HandlerThread mThread;
    private Vector<C6642e> mVecPlayUrls;

    public TXCRTMPDownloader(Context context) {
        super(context);
        this.TAG = "network.TXCRTMPDownloader";
        this.MSG_RECONNECT = 101;
        this.MSG_EVENT = 102;
        this.mPlayUrl = "";
        this.mQuicChannel = false;
        this.mServerIp = "";
        this.mCurrentThread = null;
        this.mThread = null;
        this.mHandler = null;
        this.mIsPlayRtmpAccStream = false;
        this.mEnableNearestIP = false;
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.mLastNetworkType = 0;
        this.mRTMPThreadLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalReconnect(boolean z10) {
        Vector<C6642e> vector;
        if (this.mIsRunning) {
            if (this.mIsPlayRtmpAccStream && this.mLastNetworkType != C6592e.m5053c(this.mApplicationContext)) {
                this.mLastNetworkType = C6592e.m5053c(this.mApplicationContext);
                TXIStreamDownloader.InterfaceC6628a interfaceC6628a = this.mRestartListener;
                if (interfaceC6628a != null) {
                    interfaceC6628a.onRestartDownloader();
                    return;
                }
                return;
            }
            boolean z11 = this.mQuicChannel;
            if (this.mIsPlayRtmpAccStream) {
                if (!this.mEnableNearestIP) {
                    z10 = false;
                }
                if (z11) {
                    z10 = true;
                }
                if (z10 && (vector = this.mVecPlayUrls) != null && !vector.isEmpty()) {
                    C6642e c6642e = this.mVecPlayUrls.get(0);
                    this.mVecPlayUrls.remove(0);
                    this.mPlayUrl = c6642e.f5829a;
                    this.mQuicChannel = c6642e.f5830b;
                }
            }
            if (z11 && this.mHasTcpPlayUrl) {
                sendNotifyEvent(2103);
                startInternal();
                return;
            }
            int i10 = this.connectRetryTimes;
            if (i10 >= this.connectRetryLimit) {
                TXCLog.m4991e("network.TXCRTMPDownloader", "reconnect all times retried, send failed event ");
                sendNotifyEvent(-2301);
                return;
            }
            this.connectRetryTimes = i10 + 1;
            TXCLog.m4994i("network.TXCRTMPDownloader", "reconnect retry count:" + this.connectRetryTimes + " limit:" + this.connectRetryLimit);
            sendNotifyEvent(2103);
            startInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native TXCStreamDownloader.DownloadStats nativeGetStats(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpHandler(String str, String str2, String str3, boolean z10, boolean z11, boolean z12);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRequestKeyFrame(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStart(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStop(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpHandler(long j10);

    private void postReconnectMsg() {
        Message message = new Message();
        message.what = 101;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessageDelayed(message, this.connectRetryInterval * 1000);
        }
    }

    private void reconnect(final boolean z10) {
        synchronized (this.mRTMPThreadLock) {
            try {
                C6618a c6618a = this.mCurrentThread;
                if (c6618a != null) {
                    c6618a.m5233a();
                    this.mCurrentThread = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.network.TXCRTMPDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCRTMPDownloader.this.internalReconnect(z10);
                }
            }, this.connectRetryInterval * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal() {
        if (this.mQuicChannel) {
            this.mConnectCountQuic++;
        } else {
            this.mConnectCountTcp++;
        }
        synchronized (this.mRTMPThreadLock) {
            C6618a c6618a = new C6618a(this.mPlayUrl, this.mQuicChannel);
            this.mCurrentThread = c6618a;
            c6618a.start();
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public int getConnectCountQuic() {
        return this.mConnectCountQuic;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public int getConnectCountTcp() {
        return this.mConnectCountTcp;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public String getCurrentStreamUrl() {
        return this.mPlayUrl;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        synchronized (this.mRTMPThreadLock) {
            try {
                C6618a c6618a = this.mCurrentThread;
                if (c6618a == null) {
                    return null;
                }
                return c6618a.m5235b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public boolean isQuicChannel() {
        return this.mQuicChannel;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void requestKeyFrame(String str) {
        synchronized (this.mRTMPThreadLock) {
            try {
                C6618a c6618a = this.mCurrentThread;
                if (c6618a != null) {
                    c6618a.m5234a(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void sendNotifyEvent(int i10, String str) {
        if (str.isEmpty()) {
            sendNotifyEvent(i10);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        InterfaceC6559b interfaceC6559b = this.mNotifyListener;
        if (interfaceC6559b != null) {
            interfaceC6559b.onNotifyEvent(i10, bundle);
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void startDownload(Vector<C6642e> vector, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.mIsRunning || vector == null || vector.isEmpty()) {
            return;
        }
        this.mEnableMessage = z12;
        this.mEnableMetaData = z13;
        this.mIsPlayRtmpAccStream = z10;
        this.mEnableNearestIP = z11;
        this.mVecPlayUrls = vector;
        this.mHasTcpPlayUrl = false;
        int i10 = 0;
        while (true) {
            if (i10 >= this.mVecPlayUrls.size()) {
                break;
            }
            if (!this.mVecPlayUrls.elementAt(i10).f5830b) {
                this.mHasTcpPlayUrl = true;
                break;
            }
            i10++;
        }
        C6642e c6642e = this.mVecPlayUrls.get(0);
        this.mVecPlayUrls.remove(0);
        this.mPlayUrl = c6642e.f5829a;
        this.mQuicChannel = c6642e.f5830b;
        this.mIsRunning = true;
        StringBuilder sb = new StringBuilder();
        sb.append("start pull with url:");
        sb.append(this.mPlayUrl);
        sb.append(" quic:");
        sb.append(this.mQuicChannel ? "yes" : "no");
        TXCLog.m4994i("network.TXCRTMPDownloader", sb.toString());
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.connectRetryTimes = 0;
        if (this.mThread == null) {
            HandlerThread handlerThread = new HandlerThread("RTMP_PULL");
            this.mThread = handlerThread;
            handlerThread.start();
        }
        this.mHandler = new Handler(this.mThread.getLooper()) { // from class: com.tencent.liteav.network.TXCRTMPDownloader.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 101) {
                    TXCRTMPDownloader.this.startInternal();
                }
            }
        };
        startInternal();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void stopDownload() {
        if (this.mIsRunning) {
            this.mIsRunning = false;
            this.mVecPlayUrls.removeAllElements();
            this.mVecPlayUrls = null;
            this.mIsPlayRtmpAccStream = false;
            this.mEnableNearestIP = false;
            TXCLog.m4994i("network.TXCRTMPDownloader", "stop pull");
            synchronized (this.mRTMPThreadLock) {
                try {
                    C6618a c6618a = this.mCurrentThread;
                    if (c6618a != null) {
                        c6618a.m5233a();
                        this.mCurrentThread = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            HandlerThread handlerThread = this.mThread;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
        }
    }

    /* renamed from: com.tencent.liteav.network.TXCRTMPDownloader$a */
    public class C6618a extends Thread {

        /* renamed from: b */
        private long f5733b;

        /* renamed from: c */
        private String f5734c;

        /* renamed from: d */
        private boolean f5735d;

        public C6618a(String str, boolean z10) {
            super("RTMPDownLoad");
            this.f5733b = 0L;
            this.f5734c = str;
            this.f5735d = z10;
        }

        /* renamed from: a */
        public void m5233a() {
            synchronized (this) {
                try {
                    long j10 = this.f5733b;
                    if (j10 != 0) {
                        TXCRTMPDownloader.this.nativeStop(j10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: b */
        public TXCStreamDownloader.DownloadStats m5235b() {
            TXCStreamDownloader.DownloadStats downloadStatsNativeGetStats;
            synchronized (this) {
                try {
                    long j10 = this.f5733b;
                    downloadStatsNativeGetStats = j10 != 0 ? TXCRTMPDownloader.this.nativeGetStats(j10) : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return downloadStatsNativeGetStats;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long jNativeInitRtmpHandler;
            synchronized (this) {
                TXCRTMPDownloader tXCRTMPDownloader = TXCRTMPDownloader.this;
                jNativeInitRtmpHandler = tXCRTMPDownloader.nativeInitRtmpHandler(tXCRTMPDownloader.mUserID, tXCRTMPDownloader.mOriginUrl, this.f5734c, this.f5735d, tXCRTMPDownloader.mEnableMessage, tXCRTMPDownloader.mEnableMetaData);
                this.f5733b = jNativeInitRtmpHandler;
            }
            TXCRTMPDownloader.this.nativeStart(jNativeInitRtmpHandler);
            synchronized (this) {
                TXCRTMPDownloader.this.nativeUninitRtmpHandler(this.f5733b);
                this.f5733b = 0L;
            }
        }

        /* renamed from: a */
        public void m5234a(String str) {
            synchronized (this) {
                try {
                    long j10 = this.f5733b;
                    if (j10 != 0) {
                        TXCRTMPDownloader.this.nativeRequestKeyFrame(j10, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void sendNotifyEvent(int i10) {
        if (i10 != 0 && i10 != 1) {
            super.sendNotifyEvent(i10);
        } else {
            reconnect(i10 == 1);
        }
    }
}
