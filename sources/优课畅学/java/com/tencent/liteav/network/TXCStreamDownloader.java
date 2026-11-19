package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.liteav.basic.datareport.C6574a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C6584a;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.structs.C6585a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.C6641d;
import com.tencent.liteav.network.C6648k;
import com.tencent.liteav.network.TXIStreamDownloader;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes4.dex */
public class TXCStreamDownloader extends C6584a implements InterfaceC6559b, TXIStreamDownloader.InterfaceC6628a, C6641d.a, InterfaceC6645h {
    public static final String TAG = "TXCStreamDownloader";
    private C6648k mAccUrlFetcher;
    private Context mApplicationContext;
    private int mDownloadFormat;
    private TXIStreamDownloader mDownloader;
    private Handler mHandler;
    protected Map<String, String> mHeaders;
    private InterfaceC6645h mListener = null;
    private byte[] mListenerLock = new byte[0];
    private InterfaceC6559b mNotifyListener = null;
    private boolean mDownloaderRunning = false;
    private String mOriginPlayUrl = "";
    private boolean mEnableNearestIP = false;
    private int mChannelType = 0;
    private boolean mEnableMessage = false;
    private boolean mEnableMetaData = false;
    private String mFlvSessionKey = "";
    private long mLastTimeStamp = 0;
    private DownloadStats mLastDownloadStats = null;
    private boolean mRecvFirstNal = false;
    private long mSwitchStartTime = 0;
    private long mCurrentNalTs = 0;
    private long mLastIFramelTs = 0;
    private C6641d mStreamSwitcher = null;
    private Runnable mReportNetStatusRunnalbe = new Runnable() { // from class: com.tencent.liteav.network.TXCStreamDownloader.3
        @Override // java.lang.Runnable
        public void run() {
            TXCStreamDownloader.this.reportNetStatus();
        }
    };

    public static class DownloadStats {
        public long afterParseAudioBytes;
        public long afterParseVideoBytes;
        public long beforeParseAudioBytes;
        public long beforeParseVideoBytes;
        public long connTS;
        public long dnsTS;
        public int errorCode;
        public String errorInfo;
        public long firstAudioTS;
        public long firstVideoTS;
        public String flvSessionKey;
        public String serverIP;
        public long startTS;
        public long videoGop;
    }

    /* renamed from: com.tencent.liteav.network.TXCStreamDownloader$a */
    public static class C6622a {

        /* renamed from: a */
        public String f5742a;

        /* renamed from: b */
        public String f5743b;

        /* renamed from: c */
        public String f5744c;

        /* renamed from: d */
        public int f5745d;

        /* renamed from: e */
        public String f5746e;

        /* renamed from: f */
        public boolean f5747f;
    }

    static {
        C6592e.m5058f();
    }

    public TXCStreamDownloader(Context context, int i10) {
        this.mDownloader = null;
        this.mDownloadFormat = 1;
        this.mHandler = null;
        if (i10 == 0) {
            TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(context);
            this.mDownloader = tXCFLVDownloader;
            tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
        } else if (i10 == 1 || i10 == 4) {
            this.mDownloader = new TXCRTMPDownloader(context);
        }
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setListener(this);
            this.mDownloader.setNotifyListener(this);
            this.mDownloader.setRestartListener(this);
        }
        this.mDownloadFormat = i10;
        this.mAccUrlFetcher = new C6648k(context);
        this.mApplicationContext = context;
        if (context != null) {
            this.mHandler = new Handler(this.mApplicationContext.getMainLooper());
        }
    }

    private DownloadStats getDownloadStats() {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            return tXIStreamDownloader.getDownloadStats();
        }
        return null;
    }

    private C6622a getRealTimeStreamInfo() {
        C6622a c6622a;
        C6648k c6648k = this.mAccUrlFetcher;
        if (c6648k == null || TextUtils.isEmpty(c6648k.m5323a())) {
            c6622a = null;
        } else {
            c6622a = new C6622a();
            c6622a.f5743b = this.mAccUrlFetcher.m5323a();
            c6622a.f5744c = this.mAccUrlFetcher.m5324b();
            c6622a.f5745d = this.mAccUrlFetcher.m5325c();
            c6622a.f5746e = this.mAccUrlFetcher.m5326d();
        }
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null && c6622a != null) {
            c6622a.f5742a = tXIStreamDownloader.getCurrentStreamUrl();
            c6622a.f5747f = this.mDownloader.isQuicChannel();
        }
        return c6622a;
    }

    private Long getSpeed(long j10, long j11, long j12) {
        if (j10 <= j11) {
            j11 -= j10;
        }
        return Long.valueOf(j12 > 0 ? (j11 * 8000) / (j12 * 1024) : 0L);
    }

    private native String nativeGetRTMPProxyUserId();

    private void playStreamWithRawUrl(String str, boolean z10) {
        if (this.mDownloader != null) {
            if (str != null && ((str.startsWith("http://") || str.startsWith("https://")) && str.contains(".flv"))) {
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                int i10 = tXIStreamDownloader.connectRetryLimit;
                int i11 = tXIStreamDownloader.connectRetryInterval;
                this.mDownloader = null;
                TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(this.mApplicationContext);
                this.mDownloader = tXCFLVDownloader;
                tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
                this.mDownloader.setListener(this);
                this.mDownloader.setNotifyListener(this);
                this.mDownloader.setRestartListener(this);
                TXIStreamDownloader tXIStreamDownloader2 = this.mDownloader;
                tXIStreamDownloader2.connectRetryLimit = i10;
                tXIStreamDownloader2.connectRetryInterval = i11;
                tXIStreamDownloader2.setHeaders(this.mHeaders);
                this.mDownloader.setUserID(getID());
            }
            setStatusValue(7112, 1L);
            Vector<C6642e> vector = new Vector<>();
            vector.add(new C6642e(str, false));
            this.mDownloader.setOriginUrl(str);
            this.mDownloader.startDownload(vector, false, false, z10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetStatus() {
        reportNetStatusInternal();
        this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
    }

    private void reportNetStatusInternal() {
        TXCStreamDownloader tXCStreamDownloader;
        long jLongValue;
        long jLongValue2;
        long timeTick = TXCTimeUtil.getTimeTick();
        long j10 = timeTick - this.mLastTimeStamp;
        DownloadStats downloadStats = getDownloadStats();
        C6622a realTimeStreamInfo = getRealTimeStreamInfo();
        if (downloadStats != null) {
            DownloadStats downloadStats2 = this.mLastDownloadStats;
            if (downloadStats2 != null) {
                tXCStreamDownloader = this;
                jLongValue2 = tXCStreamDownloader.getSpeed(downloadStats2.afterParseVideoBytes, downloadStats.afterParseVideoBytes, j10).longValue();
                jLongValue = tXCStreamDownloader.getSpeed(tXCStreamDownloader.mLastDownloadStats.afterParseAudioBytes, downloadStats.afterParseAudioBytes, j10).longValue();
            } else {
                tXCStreamDownloader = this;
                jLongValue = 0;
                jLongValue2 = 0;
            }
            if (jLongValue2 > 0 || jLongValue > 0) {
                tXCStreamDownloader.mDownloader.connectRetryTimes = 0;
            }
            setStatusValue(7101, Long.valueOf(jLongValue2));
            setStatusValue(7102, Long.valueOf(jLongValue));
            setStatusValue(7103, Long.valueOf(downloadStats.firstVideoTS));
            setStatusValue(7104, Long.valueOf(downloadStats.firstAudioTS));
            setStatusValue(7120, Long.valueOf(downloadStats.videoGop));
            if (realTimeStreamInfo != null) {
                setStatusValue(7105, Long.valueOf(realTimeStreamInfo.f5745d));
                setStatusValue(7106, realTimeStreamInfo.f5746e);
                setStatusValue(7111, Long.valueOf(realTimeStreamInfo.f5747f ? 2L : 1L));
                setStatusValue(7116, realTimeStreamInfo.f5742a);
                setStatusValue(7117, realTimeStreamInfo.f5743b);
                setStatusValue(7118, realTimeStreamInfo.f5744c);
            } else {
                setStatusValue(7105, Long.valueOf(downloadStats.errorCode));
                setStatusValue(7106, downloadStats.errorInfo);
                setStatusValue(7111, 1L);
            }
            setStatusValue(7107, Long.valueOf(downloadStats.startTS));
            setStatusValue(7108, Long.valueOf(downloadStats.dnsTS));
            setStatusValue(7109, Long.valueOf(downloadStats.connTS));
            setStatusValue(7110, String.valueOf(downloadStats.serverIP));
        } else {
            tXCStreamDownloader = this;
        }
        TXIStreamDownloader tXIStreamDownloader = tXCStreamDownloader.mDownloader;
        if (tXIStreamDownloader != null) {
            int connectCountQuic = tXIStreamDownloader.getConnectCountQuic();
            int connectCountTcp = tXCStreamDownloader.mDownloader.getConnectCountTcp();
            setStatusValue(7114, Long.valueOf(connectCountQuic + 1));
            setStatusValue(7115, Long.valueOf(connectCountTcp + 1));
            setStatusValue(7119, tXCStreamDownloader.mDownloader.getRealStreamUrl());
            setStatusValue(7121, String.valueOf(tXCStreamDownloader.mDownloader.getFlvSessionKey()));
        }
        tXCStreamDownloader.mLastTimeStamp = timeTick;
        tXCStreamDownloader.mLastDownloadStats = downloadStats;
    }

    private void tryResetRetryCount() {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryTimes = 0;
        }
    }

    public String getRTMPProxyUserId() {
        return nativeGetRTMPProxyUserId();
    }

    @Override // com.tencent.liteav.basic.p047b.InterfaceC6559b
    public void onNotifyEvent(int i10, Bundle bundle) {
        synchronized (this.mListenerLock) {
            try {
                if (this.mNotifyListener != null) {
                    Bundle bundle2 = new Bundle();
                    if (i10 == -2308) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "The server rejected the connection request");
                    } else if (i10 == 2012) {
                        byte[] byteArray = bundle.getByteArray(TXLiveConstants.EVT_GET_MSG);
                        if (byteArray != null && byteArray.length > 0) {
                            bundle2.putByteArray(TXLiveConstants.EVT_GET_MSG, byteArray);
                        }
                    } else if (i10 == 2028 || i10 == 2031) {
                        bundle2 = bundle;
                    } else if (i10 == 2103) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "retry connecting stream server");
                    } else if (i10 == 3010) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "No video at this stream address");
                    } else if (i10 == -2302) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to get accelerated pull address");
                    } else if (i10 == -2301) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "failed to connect server for several times, abort connection");
                    } else if (i10 == 2001) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "connection SUCCESS");
                    } else if (i10 == 2002) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "begine receiving stream");
                    } else if (i10 == 3002) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect server");
                    } else if (i10 == 3003) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "RTMP handshake failed");
                    } else if (i10 == 3006) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Write data error");
                    } else if (i10 != 3007) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "UNKNOWN event = " + i10);
                    } else {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Read data error");
                    }
                    String string = bundle != null ? bundle.getString(TXLiveConstants.EVT_DESCRIPTION, "") : "";
                    if (string != null && !string.isEmpty()) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, string);
                    }
                    bundle2.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    this.mNotifyListener.onNotifyEvent(i10, bundle2);
                    if (i10 == 3001 || i10 == 3002 || i10 == 3003 || i10 == 3004 || i10 == 3005 || i10 == 3006 || i10 == 3007 || i10 == 3008 || i10 == 3009 || i10 == 3010 || i10 == 2101 || i10 == 2102 || i10 == 2109 || i10 == 2110 || i10 == -2301 || i10 == -2304 || i10 == -2308 || i10 == -2309) {
                        setStatusValue(7105, Integer.valueOf(i10));
                        setStatusValue(7106, bundle2.getString(TXLiveConstants.EVT_DESCRIPTION));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == 2001) {
            reportNetStatusInternal();
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader.InterfaceC6628a
    public void onOldStreamStop() {
        synchronized (this.mListenerLock) {
            try {
                C6641d c6641d = this.mStreamSwitcher;
                if (c6641d != null) {
                    c6641d.m5273b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC6645h
    public void onPullAudio(C6585a c6585a) {
        tryResetRetryCount();
        synchronized (this.mListenerLock) {
            try {
                InterfaceC6645h interfaceC6645h = this.mListener;
                if (interfaceC6645h != null) {
                    interfaceC6645h.onPullAudio(c6585a);
                }
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                if (tXIStreamDownloader != null) {
                    tXIStreamDownloader.PushAudioFrame(c6585a.f5492f, c6585a.f5494h, c6585a.f5491e, c6585a.f5493g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC6645h
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        tryResetRetryCount();
        if (!this.mRecvFirstNal) {
            reportNetStatusInternal();
            this.mRecvFirstNal = true;
        }
        synchronized (this.mListenerLock) {
            try {
                long j10 = tXSNALPacket.pts;
                this.mCurrentNalTs = j10;
                if (tXSNALPacket.nalType == 0) {
                    this.mLastIFramelTs = j10;
                }
                InterfaceC6645h interfaceC6645h = this.mListener;
                if (interfaceC6645h != null) {
                    interfaceC6645h.onPullNAL(tXSNALPacket);
                }
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                if (tXIStreamDownloader != null) {
                    tXIStreamDownloader.PushVideoFrame(tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.dts, tXSNALPacket.pts, tXSNALPacket.codecId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader.InterfaceC6628a
    public void onRestartDownloader() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.liteav.network.TXCStreamDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCStreamDownloader.this.stop();
                    TXCStreamDownloader tXCStreamDownloader = TXCStreamDownloader.this;
                    tXCStreamDownloader.start(tXCStreamDownloader.mOriginPlayUrl, TXCStreamDownloader.this.mEnableNearestIP, TXCStreamDownloader.this.mChannelType, TXCStreamDownloader.this.mEnableMessage, TXCStreamDownloader.this.mEnableMetaData);
                }
            });
        }
    }

    @Override // com.tencent.liteav.network.C6641d.a
    public void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z10) {
        synchronized (this.mListenerLock) {
            try {
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.mSwitchStartTime);
                this.mSwitchStartTime = 0L;
                Bundle bundle = new Bundle();
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                if (z10) {
                    this.mDownloader = tXIStreamDownloader;
                    tXIStreamDownloader.setListener(this);
                    this.mDownloader.setNotifyListener(this);
                    this.mDownloader.setRestartListener(this);
                    bundle.putInt("EVT_ID", 2015);
                    bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Switched resolution successfully");
                    InterfaceC6559b interfaceC6559b = this.mNotifyListener;
                    if (interfaceC6559b != null) {
                        interfaceC6559b.onNotifyEvent(2015, bundle);
                    }
                    TXCDRApi.txReportDAU(this.mApplicationContext, C6574a.f5428bw, iCurrentTimeMillis, "");
                } else {
                    bundle.putInt("EVT_ID", 2015);
                    bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Failed to switch resolution");
                    InterfaceC6559b interfaceC6559b2 = this.mNotifyListener;
                    if (interfaceC6559b2 != null) {
                        interfaceC6559b2.onNotifyEvent(2015, bundle);
                    }
                    TXCDRApi.txReportDAU(this.mApplicationContext, C6574a.f5429bx);
                }
                this.mStreamSwitcher = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void requestKeyFrame(String str) {
        TXIStreamDownloader tXIStreamDownloader;
        if (!this.mDownloaderRunning || str == null || !str.startsWith("room") || (tXIStreamDownloader = this.mDownloader) == null) {
            return;
        }
        tXIStreamDownloader.requestKeyFrame(str);
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setFlvSessionKey(str);
        }
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setHeaders(map);
        }
    }

    @Override // com.tencent.liteav.basic.module.C6584a
    public void setID(String str) {
        super.setID(str);
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setUserID(str);
        }
    }

    public void setListener(InterfaceC6645h interfaceC6645h) {
        synchronized (this.mListenerLock) {
            this.mListener = interfaceC6645h;
        }
    }

    public void setNotifyListener(InterfaceC6559b interfaceC6559b) {
        synchronized (this.mListenerLock) {
            this.mNotifyListener = interfaceC6559b;
        }
    }

    public void setRetryInterval(int i10) {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryInterval = i10;
        }
    }

    public void setRetryTimes(int i10) {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryLimit = i10;
        }
    }

    public int start(final String str, boolean z10, int i10, final boolean z11, final boolean z12) {
        this.mDownloaderRunning = true;
        this.mRecvFirstNal = false;
        this.mOriginPlayUrl = str;
        this.mEnableNearestIP = z10;
        this.mChannelType = i10;
        this.mEnableMessage = z11;
        this.mEnableMetaData = z12;
        setStatusValue(7113, 0L);
        setStatusValue(7114, 0L);
        setStatusValue(7115, 0L);
        if (str.startsWith("room")) {
            setStatusValue(7113, 1L);
            setStatusValue(7112, 2L);
            if (this.mDownloader != null) {
                Vector<C6642e> vector = new Vector<>();
                vector.add(new C6642e(str, true));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.setUserID(getID());
                this.mDownloader.startDownload(vector, false, false, z11, z12);
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
            }
            return 0;
        }
        if (!z10 || this.mDownloadFormat != 4) {
            if (this.mDownloader != null) {
                setStatusValue(7112, 1L);
                Vector<C6642e> vector2 = new Vector<>();
                vector2.add(new C6642e(str, false));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.startDownload(vector2, this.mDownloadFormat == 4, z10, z11, z12);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
                }
            }
            return 0;
        }
        int iM5322a = this.mAccUrlFetcher.m5322a(str, i10, new C6648k.a() { // from class: com.tencent.liteav.network.TXCStreamDownloader.2
            @Override // com.tencent.liteav.network.C6648k.a
            /* renamed from: a */
            public void mo5236a(int i11, String str2, Vector<C6642e> vector3) {
                String str3;
                if (i11 != 0 || vector3 == null || vector3.isEmpty()) {
                    TXCStreamDownloader.this.onNotifyEvent(-2302, null);
                    TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, C6574a.f5389at, i11, str2);
                    TXCLog.m4991e(TXCStreamDownloader.TAG, "getAccelerateStreamPlayUrl failed, play stream with raw url");
                    if (TXCStreamDownloader.this.mDownloaderRunning) {
                        TXCStreamDownloader.this.onNotifyEvent(-2301, null);
                        return;
                    }
                    return;
                }
                if (!TXCStreamDownloader.this.mDownloaderRunning) {
                    TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, C6574a.f5389at, -4, "livePlayer have been stopped");
                    return;
                }
                if (TXCStreamDownloader.this.mDownloader != null) {
                    Iterator<C6642e> it = vector3.iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        C6642e next = it.next();
                        if (next != null && next.f5830b && (str3 = next.f5829a) != null && str3.length() > 0) {
                            i12++;
                        }
                    }
                    TXCStreamDownloader.this.setStatusValue(7113, Long.valueOf(i12));
                    TXCStreamDownloader.this.setStatusValue(7112, 2L);
                    TXCStreamDownloader.this.mDownloader.setOriginUrl(str);
                    TXCStreamDownloader.this.mDownloader.startDownload(vector3, true, true, z11, z12);
                }
                if (TXCStreamDownloader.this.mHandler != null) {
                    TXCStreamDownloader.this.mHandler.postDelayed(TXCStreamDownloader.this.mReportNetStatusRunnalbe, 2000L);
                }
                TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, C6574a.f5389at, i11, TXCStreamDownloader.this.mAccUrlFetcher.m5324b());
            }
        });
        if (iM5322a != 0) {
            if (iM5322a == -1) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C6574a.f5389at, iM5322a, "invalid playUrl");
            } else if (iM5322a == -2) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C6574a.f5389at, iM5322a, "invalid streamID");
            } else if (iM5322a == -3) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C6574a.f5389at, iM5322a, "invalid signature");
            }
            TXCLog.m4991e(TAG, "getAccelerateStreamPlayUrl failed, result = " + iM5322a + ", play stream with raw url");
            onNotifyEvent(-2302, null);
            onNotifyEvent(-2301, null);
        }
        return 0;
    }

    public void stop() {
        this.mDownloaderRunning = false;
        this.mRecvFirstNal = false;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.stopDownload();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mReportNetStatusRunnalbe);
        }
        synchronized (this.mListenerLock) {
            try {
                C6641d c6641d = this.mStreamSwitcher;
                if (c6641d != null) {
                    c6641d.m5272a((InterfaceC6645h) null);
                    this.mStreamSwitcher.m5269a();
                    this.mStreamSwitcher = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean switchStream(String str) {
        TXIStreamDownloader tXIStreamDownloader;
        synchronized (this.mListenerLock) {
            try {
                if (this.mStreamSwitcher == null && (tXIStreamDownloader = this.mDownloader) != null && (tXIStreamDownloader instanceof TXCFLVDownloader)) {
                    TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(this.mApplicationContext, (TXCFLVDownloader) tXIStreamDownloader);
                    TXIStreamDownloader tXIStreamDownloader2 = this.mDownloader;
                    tXCFLVDownloader.connectRetryLimit = tXIStreamDownloader2.connectRetryLimit;
                    tXCFLVDownloader.connectRetryInterval = tXIStreamDownloader2.connectRetryInterval;
                    tXCFLVDownloader.setHeaders(this.mHeaders);
                    tXCFLVDownloader.setUserID(getID());
                    tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
                    C6641d c6641d = new C6641d(this);
                    this.mStreamSwitcher = c6641d;
                    c6641d.m5272a(this);
                    this.mStreamSwitcher.m5270a(this.mDownloader, tXCFLVDownloader, this.mCurrentNalTs, this.mLastIFramelTs, str);
                    this.mSwitchStartTime = System.currentTimeMillis();
                    return true;
                }
                TXCLog.m4998w(TAG, "stream_switch stream is changing ignore this change");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
