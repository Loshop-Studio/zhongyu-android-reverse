package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.network.TXIStreamDownloader;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.ugc.TXRecordCommon;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import java.util.Vector;
import javax.net.ssl.SSLException;

/* loaded from: classes4.dex */
public class TXCFLVDownloader extends TXIStreamDownloader {
    private final int CONNECT_TIMEOUT;
    private final int FLV_HEAD_SIZE;
    private final int MAX_FRAME_SIZE;
    private final int MSG_CONNECT;
    private final int MSG_DISCONNECT;
    private final int MSG_QUIT;
    private final int MSG_RECONNECT;
    private final int MSG_RECV_DATA;
    private final int MSG_RESUME;
    private final int MSG_SEEK;
    private final int READ_STREAM_SIZE;
    public final String TAG;
    private HttpURLConnection mConnection;
    private long mContentLength;
    private long mCurrentNalTs;
    private long mDownloadedSize;
    private long mFLVParser;
    private Handler mFlvHandler;
    private HandlerThread mFlvThread;
    private boolean mHandleDataInJava;
    private boolean mHasReceivedFirstAudio;
    private boolean mHasReceivedFirstVideo;
    private InputStream mInputStream;
    private long mLastIFramelTs;
    private byte[] mPacketBytes;
    private String mPlayUrl;
    private boolean mRecvData;
    private long mRefFLVParser;
    private TXCStreamDownloader.DownloadStats mStats;
    private boolean mStopJitter;

    public TXCFLVDownloader(Context context) {
        super(context);
        this.TAG = "network.TXCFLVDownloader";
        this.FLV_HEAD_SIZE = 9;
        this.MAX_FRAME_SIZE = 1048576;
        this.MSG_CONNECT = 100;
        this.MSG_RECV_DATA = 101;
        this.MSG_DISCONNECT = 102;
        this.MSG_RECONNECT = TbsListener.ErrorCode.READ_RESPONSE_ERROR;
        this.MSG_SEEK = 104;
        this.MSG_RESUME = TbsListener.ErrorCode.DISK_FULL;
        this.MSG_QUIT = TbsListener.ErrorCode.FILE_DELETED;
        this.CONNECT_TIMEOUT = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.READ_STREAM_SIZE = 1388;
        this.mFlvThread = null;
        this.mFlvHandler = null;
        this.mInputStream = null;
        this.mConnection = null;
        this.mPacketBytes = null;
        this.mRecvData = false;
        this.mContentLength = 0L;
        this.mDownloadedSize = 0L;
        this.mHandleDataInJava = false;
        this.mFLVParser = 0L;
        this.mRefFLVParser = 0L;
        this.mCurrentNalTs = 0L;
        this.mLastIFramelTs = 0L;
        this.mStopJitter = true;
        this.mPlayUrl = "";
        this.mHasReceivedFirstVideo = false;
        this.mHasReceivedFirstAudio = false;
        this.mStats = null;
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        this.mStats = downloadStats;
        downloadStats.afterParseAudioBytes = 0L;
        downloadStats.dnsTS = 0L;
        downloadStats.startTS = TXCTimeUtil.getTimeTick();
        TXCLog.m4994i("network.TXCFLVDownloader", "new flv download " + this);
    }

    private void connect() throws IOException {
        String headerField;
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        this.mConnection = (HttpURLConnection) new URL(this.mPlayUrl).openConnection();
        this.mStats.dnsTS = TXCTimeUtil.getTimeTick();
        this.mConnection.setConnectTimeout(TXRecordCommon.AUDIO_SAMPLERATE_8000);
        this.mConnection.setReadTimeout(TXRecordCommon.AUDIO_SAMPLERATE_8000);
        this.mConnection.setRequestProperty("Accept-Encoding", "identity");
        this.mConnection.setInstanceFollowRedirects(true);
        Map<String, String> map = this.mHeaders;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.mConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        this.mConnection.connect();
        if (200 == this.mConnection.getResponseCode()) {
            this.mStats.connTS = TXCTimeUtil.getTimeTick();
        } else {
            this.mStats.errorCode = this.mConnection.getResponseCode();
        }
        this.mInputStream = this.mConnection.getInputStream();
        this.mPacketBytes = new byte[1388];
        this.mRecvData = false;
        this.mContentLength = this.mConnection.getContentLength();
        this.mDownloadedSize = 0L;
        this.mStats.serverIP = InetAddress.getByName(this.mConnection.getURL().getHost()).getHostAddress();
        sendNotifyEvent(2001);
        this.mStats.flvSessionKey = this.mConnection.getHeaderField("X-Tlive-SpanId");
        if (TextUtils.isEmpty(this.mFlvSessionKey) || (headerField = this.mConnection.getHeaderField(this.mFlvSessionKey)) == null) {
            return;
        }
        TXCLog.m4994i("network.TXCFLVDownloader", "receive flvSessionKey " + headerField);
        sendNotifyEvent(2031, headerField);
    }

    private void disconnect() throws IOException {
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            inputStream.close();
            this.mInputStream = null;
        }
    }

    private native void nativeCleanData(long j10);

    private native int nativeGetAudioBytes(long j10);

    private native int nativeGetVideoBytes(long j10);

    private native int nativeGetVideoGop(long j10);

    private native long nativeInitFlvHander(String str, int i10, boolean z10, boolean z11);

    private native long nativeInitFlvHanderByRef(long j10);

    private native int nativeParseData(long j10, byte[] bArr, int i10);

    private native void nativeUninitFlvhander(long j10, boolean z10);

    private void onRecvFirstAudioData() {
        if (this.mHasReceivedFirstAudio) {
            return;
        }
        this.mHasReceivedFirstAudio = true;
        this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
        TXCLog.m4994i("network.TXCFLVDownloader", "onRecvData: receive first audio with ts " + this.mStats.firstAudioTS);
    }

    private void onRecvFirstVideoData() {
        if (this.mHasReceivedFirstVideo) {
            return;
        }
        this.mHasReceivedFirstVideo = true;
        this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
        TXCLog.m4994i("network.TXCFLVDownloader", "onRecvData: receive first video with ts " + this.mStats.firstVideoTS);
    }

    private void postConnectMsg() {
        this.mInputStream = null;
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        Message message = new Message();
        message.what = 100;
        message.arg1 = 0;
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    private void postDisconnectMsg() {
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendEmptyMessage(102);
        }
    }

    private void postReconnectMsg() {
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(TbsListener.ErrorCode.READ_RESPONSE_ERROR, this.connectRetryInterval * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgConnect() {
        try {
            connect();
            if (this.mFLVParser == 0) {
                long j10 = this.mRefFLVParser;
                if (j10 != 0) {
                    this.mFLVParser = nativeInitFlvHanderByRef(j10);
                    this.mRefFLVParser = 0L;
                } else {
                    this.mFLVParser = nativeInitFlvHander(this.mUserID, 0, this.mEnableMessage, this.mEnableMetaData);
                }
            }
            Handler handler = this.mFlvHandler;
            if (handler != null) {
                handler.sendEmptyMessage(101);
            }
        } catch (FileNotFoundException e10) {
            TXCLog.m4991e("network.TXCFLVDownloader", "file not found, reconnect");
            e10.printStackTrace();
            postReconnectMsg();
        } catch (Error e11) {
            TXCLog.m4991e("network.TXCFLVDownloader", "error, reconnect");
            e11.printStackTrace();
            postReconnectMsg();
        } catch (SocketTimeoutException unused) {
            TXCLog.m4991e("network.TXCFLVDownloader", "socket timeout, reconnect");
            postReconnectMsg();
        } catch (Exception e12) {
            TXCLog.m4991e("network.TXCFLVDownloader", "exception, reconnect");
            e12.printStackTrace();
            postReconnectMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgDisConnect() {
        try {
            disconnect();
        } catch (Exception e10) {
            TXCLog.m4992e("network.TXCFLVDownloader", "disconnect failed.", e10);
        }
        long j10 = this.mFLVParser;
        if (j10 != 0) {
            nativeUninitFlvhander(j10, this.mStopJitter);
            this.mFLVParser = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgReconnect() {
        if (this.mStopJitter) {
            reconnect();
            return;
        }
        TXCLog.m4994i("network.TXCFLVDownloader", "ignore processMsgReconnect when start multi stream switch" + this);
        TXIStreamDownloader.InterfaceC6628a interfaceC6628a = this.mRestartListener;
        if (interfaceC6628a != null) {
            interfaceC6628a.onOldStreamStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgRecvData() throws IOException {
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            try {
                int iNativeParseData = 0;
                int i10 = inputStream.read(this.mPacketBytes, 0, 1388);
                if (i10 > 0) {
                    long j10 = i10;
                    this.mDownloadedSize += j10;
                    if (!this.mRecvData) {
                        TXCLog.m4998w("network.TXCFLVDownloader", "flv play receive first data " + this);
                        this.mRecvData = true;
                    }
                    long j11 = this.mFLVParser;
                    if (j11 != 0) {
                        this.mStats.beforeParseVideoBytes += j10;
                        iNativeParseData = nativeParseData(j11, this.mPacketBytes, i10);
                        this.mStats.afterParseVideoBytes = nativeGetVideoBytes(this.mFLVParser);
                        this.mStats.afterParseAudioBytes = nativeGetAudioBytes(this.mFLVParser);
                        this.mStats.videoGop = nativeGetVideoGop(this.mFLVParser);
                    }
                    if (iNativeParseData > 1048576) {
                        TXCLog.m4991e("network.TXCFLVDownloader", "flv play parse frame: " + iNativeParseData + " > 1048576,sart reconnect");
                        postReconnectMsg();
                        return;
                    }
                } else if (i10 < 0) {
                    TXCLog.m4998w("network.TXCFLVDownloader", "http read: " + i10 + " < 0, start reconnect");
                    postReconnectMsg();
                    return;
                }
                Handler handler = this.mFlvHandler;
                if (handler != null) {
                    handler.sendEmptyMessage(101);
                }
            } catch (EOFException unused) {
                TXCLog.m4998w("network.TXCFLVDownloader", "eof exception start reconnect");
                postReconnectMsg();
            } catch (Error e10) {
                TXCLog.m4991e("network.TXCFLVDownloader", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                e10.printStackTrace();
                this.mInputStream = null;
                this.mConnection = null;
            } catch (SocketException unused2) {
                TXCLog.m4998w("network.TXCFLVDownloader", "socket exception start reconnect");
                postReconnectMsg();
            } catch (SocketTimeoutException unused3) {
                TXCLog.m4998w("network.TXCFLVDownloader", "socket timeout start reconnect");
                postReconnectMsg();
            } catch (SSLException unused4) {
                TXCLog.m4998w("network.TXCFLVDownloader", "ssl exception start reconnect");
                postReconnectMsg();
            } catch (Exception e11) {
                TXCLog.m4991e("network.TXCFLVDownloader", "exception");
                e11.printStackTrace();
                this.mInputStream = null;
                this.mConnection = null;
            }
        }
    }

    private void reconnect() {
        processMsgDisConnect();
        int i10 = this.connectRetryTimes;
        if (i10 >= this.connectRetryLimit) {
            TXCLog.m4991e("network.TXCFLVDownloader", "reconnect all times retried, send failed event ");
            sendNotifyEvent(-2301);
            return;
        }
        this.connectRetryTimes = i10 + 1;
        TXCLog.m4994i("network.TXCFLVDownloader", "reconnect retry time:" + this.connectRetryTimes + ", limit:" + this.connectRetryLimit);
        processMsgConnect();
        sendNotifyEvent(2103);
    }

    private void startInternal() {
        if (this.mFlvThread == null) {
            HandlerThread handlerThread = new HandlerThread("FlvThread");
            this.mFlvThread = handlerThread;
            handlerThread.start();
        }
        if (this.mFlvHandler == null) {
            this.mFlvHandler = new Handler(this.mFlvThread.getLooper()) { // from class: com.tencent.liteav.network.TXCFLVDownloader.1
                @Override // android.os.Handler
                public void handleMessage(Message message) throws IOException {
                    int i10 = message.what;
                    if (i10 == 106) {
                        try {
                            Looper.myLooper().quit();
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    switch (i10) {
                        case 100:
                            TXCFLVDownloader.this.processMsgConnect();
                            break;
                        case 101:
                            TXCFLVDownloader.this.processMsgRecvData();
                            break;
                        case 102:
                            TXCFLVDownloader.this.processMsgDisConnect();
                            break;
                        case TbsListener.ErrorCode.READ_RESPONSE_ERROR /* 103 */:
                            TXCFLVDownloader.this.processMsgReconnect();
                            break;
                    }
                }
            };
        }
        postConnectMsg();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void PushAudioFrame(byte[] bArr, int i10, long j10, int i11) {
        nativePushAudioFrame(this.mFLVParser, bArr, i10, j10, i11);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void PushVideoFrame(byte[] bArr, int i10, long j10, long j11, int i11) {
        nativePushVideoFrame(this.mFLVParser, bArr, i10, j10, j11, i11);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public long getCurrentTS() {
        return this.mCurrentNalTs;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        TXCStreamDownloader.DownloadStats downloadStats2 = this.mStats;
        downloadStats.afterParseAudioBytes = downloadStats2.afterParseAudioBytes;
        downloadStats.afterParseVideoBytes = downloadStats2.afterParseVideoBytes;
        downloadStats.beforeParseVideoBytes = downloadStats2.beforeParseVideoBytes;
        downloadStats.beforeParseAudioBytes = downloadStats2.beforeParseAudioBytes;
        downloadStats.videoGop = downloadStats2.videoGop;
        downloadStats.startTS = downloadStats2.startTS;
        downloadStats.dnsTS = downloadStats2.dnsTS;
        downloadStats.connTS = downloadStats2.connTS;
        downloadStats.firstAudioTS = downloadStats2.firstAudioTS;
        downloadStats.firstVideoTS = downloadStats2.firstVideoTS;
        downloadStats.serverIP = downloadStats2.serverIP;
        downloadStats.flvSessionKey = downloadStats2.flvSessionKey;
        downloadStats.errorCode = downloadStats2.errorCode;
        downloadStats.errorInfo = downloadStats2.errorInfo;
        return downloadStats;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public long getLastIFrameTS() {
        return this.mLastIFramelTs;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public String getRealStreamUrl() {
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            return httpURLConnection.getURL().toString();
        }
        return null;
    }

    public native void nativePushAudioFrame(long j10, byte[] bArr, int i10, long j11, int i11);

    public native void nativePushVideoFrame(long j10, byte[] bArr, int i10, long j11, long j12, int i11);

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void onRecvAudioData(byte[] bArr, int i10, int i11, int i12) {
        if (!this.mHasReceivedFirstAudio) {
            this.mHasReceivedFirstAudio = true;
            this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
            TXCLog.m4994i("network.TXCFLVDownloader", "receive first audio with ts " + this.mStats.firstAudioTS);
        }
        this.mStats.afterParseAudioBytes += bArr.length;
        super.onRecvAudioData(bArr, i10, i11, i12);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void onRecvVideoData(byte[] bArr, int i10, long j10, long j11, int i11) {
        if (!this.mHasReceivedFirstVideo) {
            this.mHasReceivedFirstVideo = true;
            this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
            TXCLog.m4994i("network.TXCFLVDownloader", "receive first video with ts " + this.mStats.firstVideoTS);
        }
        this.mStats.afterParseVideoBytes += bArr.length;
        super.onRecvVideoData(bArr, i10, j10, j11, i11);
    }

    public void recvData(boolean z10) {
        this.mHandleDataInJava = z10;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void startDownload(Vector<C6642e> vector, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.mIsRunning || vector == null || vector.isEmpty()) {
            return;
        }
        this.mEnableMessage = z12;
        this.mEnableMetaData = z13;
        this.mIsRunning = true;
        this.mPlayUrl = vector.get(0).f5829a;
        TXCLog.m4994i("network.TXCFLVDownloader", "start pull with url " + this.mPlayUrl);
        startInternal();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void stopDownload() {
        if (this.mIsRunning) {
            this.mIsRunning = false;
            TXCLog.m4994i("network.TXCFLVDownloader", "stop pull");
            try {
                Handler handler = this.mFlvHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.mFlvHandler.sendEmptyMessage(102);
                    this.mFlvHandler.sendEmptyMessage(TbsListener.ErrorCode.FILE_DELETED);
                    this.mFlvHandler = null;
                }
            } catch (Exception e10) {
                TXCLog.m4992e("network.TXCFLVDownloader", "stop download failed.", e10);
            }
        }
    }

    public TXCFLVDownloader(Context context, TXCFLVDownloader tXCFLVDownloader) {
        super(context);
        this.TAG = "network.TXCFLVDownloader";
        this.FLV_HEAD_SIZE = 9;
        this.MAX_FRAME_SIZE = 1048576;
        this.MSG_CONNECT = 100;
        this.MSG_RECV_DATA = 101;
        this.MSG_DISCONNECT = 102;
        this.MSG_RECONNECT = TbsListener.ErrorCode.READ_RESPONSE_ERROR;
        this.MSG_SEEK = 104;
        this.MSG_RESUME = TbsListener.ErrorCode.DISK_FULL;
        this.MSG_QUIT = TbsListener.ErrorCode.FILE_DELETED;
        this.CONNECT_TIMEOUT = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.READ_STREAM_SIZE = 1388;
        this.mFlvThread = null;
        this.mFlvHandler = null;
        this.mInputStream = null;
        this.mConnection = null;
        this.mPacketBytes = null;
        this.mRecvData = false;
        this.mContentLength = 0L;
        this.mDownloadedSize = 0L;
        this.mHandleDataInJava = false;
        this.mFLVParser = 0L;
        this.mRefFLVParser = 0L;
        this.mCurrentNalTs = 0L;
        this.mLastIFramelTs = 0L;
        this.mStopJitter = true;
        this.mPlayUrl = "";
        this.mHasReceivedFirstVideo = false;
        this.mHasReceivedFirstAudio = false;
        this.mStats = null;
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        this.mStats = downloadStats;
        downloadStats.afterParseAudioBytes = 0L;
        downloadStats.dnsTS = 0L;
        downloadStats.startTS = TXCTimeUtil.getTimeTick();
        if (tXCFLVDownloader != null) {
            this.mRefFLVParser = tXCFLVDownloader.mFLVParser;
            tXCFLVDownloader.mStopJitter = false;
        }
        TXCLog.m4994i("network.TXCFLVDownloader", "new multi flv download " + this);
    }
}
