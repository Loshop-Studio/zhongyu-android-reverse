package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.work.WorkRequest;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C6584a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TXCStreamUploader extends C6584a implements InterfaceC6639b {
    public static final int RTMPSENDSTRATEGY_LIVE = 1;
    public static final int RTMPSENDSTRATEGY_REALTIME_QUIC = 3;
    public static final int RTMPSENDSTRATEGY_REALTIME_TCP = 2;
    static final String TAG = "TXCStreamUploader";
    public static final int TXE_UPLOAD_MODE_AUDIO_ONLY = 1;
    public static final int TXE_UPLOAD_MODE_LINK_MIC = 2;
    public static final int TXE_UPLOAD_MODE_REAL_TIME = 0;
    public static final int TXE_UPLOAD_PROTOCOL_AV = 1;
    public static final int TXE_UPLOAD_PROTOCOL_RTMP = 0;
    private Context mContext;
    private int mCurrentRecordIdx;
    private HandlerThread mHandlerThread;
    private C6640c mIntelligentRoute;
    private ArrayList<C6629a> mIpList;
    private boolean mIsPushing;
    private int mLastNetworkType;
    HashMap<String, String> mMetaData;
    private C6649l mParam;
    private int mRetryCount;
    private String mRtmpUrl;
    private Thread mThread;
    private Object mThreadLock;
    private C6651n mUploadQualityReport;
    private long mUploaderInstance;
    private boolean mQuicChannel = false;
    private int mChannelType = 0;
    private boolean mEnableNearestIP = true;
    private WeakReference<InterfaceC6559b> mNotifyListener = null;
    private long mConnectSuccessTimeStamps = 0;
    private long mGoodPushTime = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    private Handler mHandler = null;
    private final int MSG_RECONNECT = 101;
    private final int MSG_EVENT = 102;
    private final int MSG_REPORT_STATUS = TbsListener.ErrorCode.READ_RESPONSE_ERROR;
    private final int MSG_RTMPPROXY_HEARTBEAT = 104;
    private long mLastTimeStamp = 0;
    private UploadStats mLastUploadStats = null;
    private Vector<TXSNALPacket> mVecPendingNAL = new Vector<>();
    private int mConnectCountQuic = 0;
    private int mConnectCountTcp = 0;
    private boolean mRtmpProxyEnable = false;
    private boolean mAudioMuted = false;
    private C6626a mRtmpProxyParam = new C6626a();
    private Vector<String> mRtmpProxyIPList = new Vector<>();
    private int mRtmpProxyIPIndex = 0;
    private long mRtmpProxyInstance = 0;
    private long mRtmpMsgRecvThreadInstance = 0;
    private Object mRtmpProxyLock = new Object();
    private Object mRtmpMsgRecvThreadLock = new Object();

    public class RtmpProxyUserInfo {
        public String account = "";
        public String playUrl = "";
        public int stmType = 0;

        public RtmpProxyUserInfo() {
        }
    }

    public class UploadStats {
        public long audioCacheLen;
        public long audioDropCount;
        public long bandwidthEst;
        public long channelType;
        public long connTS;
        public long connectTimeCost;
        public String connectionID;
        public String connectionStats;
        public long dnsTS;
        public long dnsparseTimeCost;
        public long handshakeTimeCost;
        public long inAudioBytes;
        public long inVideoBytes;
        public long outAudioBytes;
        public long outVideoBytes;
        public String serverIP;
        public long startTS;
        public long videoCacheLen;
        public long videoDropCount;

        public UploadStats() {
        }
    }

    /* renamed from: com.tencent.liteav.network.TXCStreamUploader$a */
    public class C6626a {

        /* renamed from: a */
        public long f5754a;

        /* renamed from: b */
        public long f5755b;

        /* renamed from: c */
        public String f5756c;

        /* renamed from: d */
        public long f5757d;

        /* renamed from: e */
        public String f5758e;

        /* renamed from: f */
        public long f5759f;

        /* renamed from: g */
        public long f5760g;

        /* renamed from: h */
        public String f5761h;

        /* renamed from: i */
        public boolean f5762i;

        /* renamed from: j */
        public String f5763j;

        public C6626a() {
        }

        /* renamed from: a */
        public void m5237a() {
            this.f5754a = 0L;
            this.f5755b = 0L;
            this.f5756c = "";
            this.f5757d = 0L;
            this.f5758e = "";
            this.f5759f = 0L;
            this.f5760g = 0L;
            this.f5762i = false;
            this.f5763j = "";
        }
    }

    /* renamed from: com.tencent.liteav.network.TXCStreamUploader$b */
    public class C6627b {

        /* renamed from: a */
        public String f5765a;

        /* renamed from: b */
        public boolean f5766b;

        public C6627b(String str, boolean z10) {
            this.f5765a = str;
            this.f5766b = z10;
        }
    }

    static {
        C6592e.m5058f();
    }

    public TXCStreamUploader(Context context, C6649l c6649l) {
        this.mUploaderInstance = 0L;
        this.mThread = null;
        this.mThreadLock = null;
        this.mIsPushing = false;
        this.mRtmpUrl = "";
        this.mIntelligentRoute = null;
        this.mLastNetworkType = 0;
        this.mContext = null;
        this.mIpList = null;
        this.mCurrentRecordIdx = 0;
        this.mRetryCount = 0;
        this.mHandlerThread = null;
        this.mParam = null;
        this.mUploadQualityReport = null;
        this.mContext = context;
        if (c6649l == null) {
            c6649l = new C6649l();
            c6649l.f5891a = 0;
            c6649l.f5896f = 3;
            c6649l.f5895e = 3;
            c6649l.f5897g = 40;
            c6649l.f5898h = 1000;
            c6649l.f5899i = true;
        }
        this.mParam = c6649l;
        this.mThreadLock = new Object();
        C6640c c6640c = new C6640c();
        this.mIntelligentRoute = c6640c;
        c6640c.f5793a = this;
        this.mUploaderInstance = 0L;
        this.mRetryCount = 0;
        this.mCurrentRecordIdx = 0;
        this.mIpList = null;
        this.mIsPushing = false;
        this.mThread = null;
        this.mRtmpUrl = null;
        this.mLastNetworkType = 0;
        this.mHandlerThread = null;
        this.mUploadQualityReport = new C6651n(context);
        C6650m.m5328a().m5333a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAddressFromUrl(String str) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        return (str == null || (iIndexOf = str.indexOf("://")) == -1 || (iIndexOf2 = (strSubstring = str.substring(iIndexOf + 3)).indexOf("/")) == -1) ? "" : strSubstring.substring(0, iIndexOf2);
    }

    private boolean getNextRtmpProxyIP() {
        C6626a c6626a = this.mRtmpProxyParam;
        c6626a.f5759f = 234L;
        c6626a.f5760g = 80L;
        Vector<String> vector = this.mRtmpProxyIPList;
        if (vector == null || vector.size() <= 0) {
            return false;
        }
        if (this.mRtmpProxyIPIndex >= this.mRtmpProxyIPList.size()) {
            this.mRtmpProxyIPIndex = 0;
            return false;
        }
        String[] strArrSplit = this.mRtmpUrl.split("://");
        if (strArrSplit.length < 2) {
            return false;
        }
        String str = strArrSplit[1];
        String strSubstring = str.substring(str.indexOf("/"));
        String str2 = this.mRtmpProxyIPList.get(this.mRtmpProxyIPIndex);
        this.mRtmpProxyParam.f5761h = str2;
        this.mRtmpUrl = "room://" + str2 + strSubstring;
        this.mQuicChannel = true;
        this.mRtmpProxyIPIndex = this.mRtmpProxyIPIndex + 1;
        return true;
    }

    private HashMap getParamsFromUrl(String str) {
        String str2;
        HashMap map = new HashMap();
        String[] strArrSplit = str.split("[?]");
        if (strArrSplit != null && strArrSplit.length >= 2 && (str2 = strArrSplit[1]) != null && str2.length() != 0) {
            for (String str3 : strArrSplit[1].split("[&]")) {
                if (str3.indexOf("=") != -1) {
                    String[] strArrSplit2 = str3.split("[=]");
                    if (strArrSplit2.length == 2) {
                        map.put(strArrSplit2[0], strArrSplit2[1]);
                    }
                }
            }
        }
        return map;
    }

    private C6627b getRtmpRealConnectInfo() {
        int i10;
        if (!this.mEnableNearestIP) {
            return new C6627b(this.mRtmpUrl, false);
        }
        ArrayList<C6629a> arrayList = this.mIpList;
        if (arrayList == null) {
            return new C6627b(this.mRtmpUrl, false);
        }
        if (this.mCurrentRecordIdx >= arrayList.size() || (i10 = this.mCurrentRecordIdx) < 0) {
            return new C6627b(this.mRtmpUrl, false);
        }
        C6629a c6629a = this.mIpList.get(i10);
        String[] strArrSplit = this.mRtmpUrl.split("://");
        if (strArrSplit.length < 2) {
            return new C6627b(this.mRtmpUrl, false);
        }
        String[] strArrSplit2 = strArrSplit[1].split("/");
        if (c6629a.f5768a.split(":").length <= 1 || c6629a.f5768a.startsWith("[")) {
            strArrSplit2[0] = c6629a.f5768a + ":" + c6629a.f5769b;
        } else {
            strArrSplit2[0] = "[" + c6629a.f5768a + "]:" + c6629a.f5769b;
        }
        StringBuilder sb = new StringBuilder(strArrSplit2[0]);
        for (int i11 = 1; i11 < strArrSplit2.length; i11++) {
            sb.append("/");
            sb.append(strArrSplit2[i11]);
        }
        return new C6627b(strArrSplit[0] + "://" + sb.toString(), c6629a.f5770c);
    }

    private Long getSpeed(long j10, long j11, long j12) {
        if (j10 <= j11) {
            j11 -= j10;
        }
        return Long.valueOf(j12 > 0 ? (j11 * 8000) / (j12 * 1024) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalReconnect(boolean z10) throws JSONException {
        if (this.mIsPushing) {
            if (this.mRtmpProxyEnable) {
                if (this.mLastNetworkType != C6592e.m5053c(this.mContext)) {
                    TXCLog.m4991e(TAG, "reconnect network switch from " + this.mLastNetworkType + " to " + C6592e.m5053c(this.mContext));
                    this.mLastNetworkType = C6592e.m5053c(this.mContext);
                    this.mRetryCount = 0;
                    Monitor.m5001a(2, "WebrtcRoom: need enter again by user", "", 0);
                    sendNotifyEvent(1021, String.format("Network type has changed. Need to re-enter the room", new Object[0]));
                    return;
                }
                int i10 = this.mRetryCount;
                if (i10 >= this.mParam.f5895e) {
                    if (!getNextRtmpProxyIP()) {
                        TXCEventRecorderProxy.m5002a(this.mRtmpUrl, 91002, -1L, -1L, "connect rtmp-proxy server failed(try all addresses)", 0);
                        sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL);
                        return;
                    } else {
                        this.mRetryCount = 0;
                        Monitor.m5001a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]", this.mRtmpProxyParam.f5761h, 0, Integer.valueOf(this.mParam.f5895e)), "", 0);
                        sendNotifyEvent(1102);
                        startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
                        return;
                    }
                }
                int i11 = i10 + 1;
                this.mRetryCount = i11;
                Monitor.m5001a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]", this.mRtmpProxyParam.f5761h, Integer.valueOf(i11), Integer.valueOf(this.mParam.f5895e)), "", 0);
                TXCEventRecorderProxy.m5002a(this.mRtmpUrl, 91003, -1L, -1L, "reconnect rtmp-proxy server(econnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f5895e + ")", 0);
                sendNotifyEvent(1102);
                startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
                return;
            }
            this.mUploadQualityReport.m5350c();
            if (this.mEnableNearestIP && this.mLastNetworkType != C6592e.m5053c(this.mContext)) {
                TXCLog.m4991e(TAG, "reconnect network switch from " + this.mLastNetworkType + " to " + C6592e.m5053c(this.mContext));
                this.mLastNetworkType = C6592e.m5053c(this.mContext);
                this.mIntelligentRoute.m5266a(this.mRtmpUrl, this.mChannelType);
                this.mRetryCount = 0;
                return;
            }
            boolean z11 = !this.mEnableNearestIP ? false : z10;
            if (this.mQuicChannel) {
                z11 = true;
            }
            if (z11 && !nextRecordIdx(true)) {
                TXCLog.m4991e(TAG, "reconnect: try all addresses failed");
                TXCEventRecorderProxy.m5002a(this.mRtmpUrl, 91002, -1L, -1L, "connect upload server failed(try all addresses failed)", 0);
            }
            C6627b rtmpRealConnectInfo = getRtmpRealConnectInfo();
            String addressFromUrl = getAddressFromUrl(rtmpRealConnectInfo.f5765a);
            StringBuilder sb = new StringBuilder();
            sb.append("reconnect change ip: ");
            sb.append(addressFromUrl);
            sb.append(" enableNearestIP: ");
            sb.append(this.mEnableNearestIP);
            sb.append(" last channel type: ");
            sb.append(this.mQuicChannel ? "Q Channel" : "TCP");
            TXCLog.m4991e(TAG, sb.toString());
            if (this.mQuicChannel) {
                TXCLog.m4991e(TAG, "reconnect last channel type is Q Channel，ignore retry limit");
                Monitor.m5001a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s]", addressFromUrl), "", 0);
                startPushTask(rtmpRealConnectInfo.f5765a, rtmpRealConnectInfo.f5766b, 0);
                sendNotifyEvent(1102);
                return;
            }
            TXCLog.m4991e(TAG, "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f5895e);
            int i12 = this.mRetryCount;
            if (i12 >= this.mParam.f5895e) {
                TXCLog.m4991e(TAG, "reconnect: try all times failed");
                TXCEventRecorderProxy.m5002a(this.mRtmpUrl, 91002, -1L, -1L, "connect upload server failed(try all times failed)", 0);
                sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL);
                return;
            }
            int i13 = i12 + 1;
            this.mRetryCount = i13;
            Monitor.m5001a(2, String.format("Network: reconnecting to upload server with tcp.[addr:%s][retryCount:%d][retryLimit:%d]", addressFromUrl, Integer.valueOf(i13), Integer.valueOf(this.mParam.f5895e)), "", 0);
            TXCEventRecorderProxy.m5002a(this.mRtmpUrl, 91003, -1L, -1L, "reconnect upload server:(retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f5895e + ")", 0);
            startPushTask(rtmpRealConnectInfo.f5765a, rtmpRealConnectInfo.f5766b, 0);
            sendNotifyEvent(1102);
        }
    }

    private boolean isQCloudStreamUrl(String str) {
        int iIndexOf;
        String strSubstring;
        return (str == null || str.length() == 0 || (iIndexOf = str.indexOf("://")) == -1 || (strSubstring = str.substring(iIndexOf + 3)) == null || !strSubstring.startsWith("cloud.tencent.com")) ? false : true;
    }

    private native void nativeCacheJNIParams();

    private native void nativeEnableDrop(long j10, boolean z10);

    private native UploadStats nativeGetStats(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpMsgRecvThreadInstance(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpProxyInstance(long j10, long j11, String str, long j12, String str2, long j13, long j14, String str3, boolean z10, String str4);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitUploader(String str, String str2, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, int i17, HashMap<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnThreadRun(long j10);

    private native void nativePushAAC(long j10, byte[] bArr, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativePushNAL(long j10, byte[] bArr, int i10, long j11, long j12, long j13);

    private native void nativeReleaseJNIParams();

    private native void nativeRtmpMsgRecvThreadStart(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRtmpMsgRecvThreadStop(long j10);

    private native void nativeRtmpProxyEnterRoom(long j10);

    private native void nativeRtmpProxyLeaveRoom(long j10);

    private native void nativeRtmpProxySendHeartBeat(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20);

    private native void nativeSendRtmpProxyMsg(long j10, byte[] bArr);

    private native void nativeSetSendStrategy(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetVideoDropParams(long j10, boolean z10, int i10, int i11);

    private native void nativeStopPush(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpMsgRecvThreadInstance(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpProxyInstance(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitUploader(long j10);

    private boolean nextRecordIdx(boolean z10) {
        ArrayList<C6629a> arrayList = this.mIpList;
        if (arrayList != null && arrayList.size() != 0) {
            if (z10) {
                this.mIpList.get(this.mCurrentRecordIdx).f5772e++;
            }
            if (this.mCurrentRecordIdx + 1 < this.mIpList.size()) {
                this.mCurrentRecordIdx++;
                return true;
            }
        }
        return false;
    }

    private void onRtmpProxyRoomEvent(int i10, int i11) {
        if (i10 == 1) {
            sendNotifyEvent(1018, String.format("Already in room，[%d]", Integer.valueOf(i11)));
        } else if (i10 == 2) {
            sendNotifyEvent(1019, String.format("Not in the room，[%d]", Integer.valueOf(i11)));
        }
    }

    private void onRtmpProxyUserListPushed(RtmpProxyUserInfo[] rtmpProxyUserInfoArr) throws JSONException {
        if (rtmpProxyUserInfoArr != null && this.mIsPushing && this.mRtmpProxyEnable && this.mRtmpProxyParam != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i10 = 0; i10 < rtmpProxyUserInfoArr.length; i10++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("userid", rtmpProxyUserInfoArr[i10].account);
                    jSONObject.put("playurl", rtmpProxyUserInfoArr[i10].playUrl);
                    if (rtmpProxyUserInfoArr[i10].stmType == 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("userlist", jSONArray);
                jSONObject2.put("userlist_aux", jSONArray2);
                sendNotifyEvent(1020, jSONObject2.toString());
            } catch (Exception e10) {
                TXCLog.m4992e(TAG, "build json object failed.", e10);
            }
        }
    }

    private void onSendRtmpProxyMsg(byte[] bArr) {
        synchronized (this.mThreadLock) {
            try {
                long j10 = this.mUploaderInstance;
                if (j10 != 0) {
                    nativeSendRtmpProxyMsg(j10, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void parseProxyInfo(String str) throws JSONException {
        if (str == null || str.length() == 0 || !str.startsWith("room")) {
            return;
        }
        this.mRtmpProxyParam.f5762i = isQCloudStreamUrl(str);
        HashMap paramsFromUrl = getParamsFromUrl(str);
        if (paramsFromUrl == null) {
            return;
        }
        if (paramsFromUrl.containsKey("sdkappid")) {
            this.mRtmpProxyParam.f5754a = Long.valueOf((String) paramsFromUrl.get("sdkappid")).longValue();
        }
        if (paramsFromUrl.containsKey("roomid") && paramsFromUrl.containsKey("userid") && paramsFromUrl.containsKey("roomsig")) {
            this.mRtmpProxyParam.f5757d = Long.valueOf((String) paramsFromUrl.get("roomid")).longValue();
            this.mRtmpProxyParam.f5756c = (String) paramsFromUrl.get("userid");
            if (paramsFromUrl.containsKey("bizbuf")) {
                try {
                    this.mRtmpProxyParam.f5763j = URLDecoder.decode((String) paramsFromUrl.get("bizbuf"), "UTF-8");
                } catch (Exception e10) {
                    TXCLog.m4992e(TAG, "decode bizbuf failed.", e10);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(URLDecoder.decode((String) paramsFromUrl.get("roomsig"), "UTF-8"));
                this.mRtmpProxyParam.f5755b = 0L;
                if (jSONObject.has("Key")) {
                    this.mRtmpProxyParam.f5758e = jSONObject.optString("Key");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("RtmpProxy");
                    if (jSONObjectOptJSONObject == null || (jSONObjectOptJSONObject.has("Ip") && jSONObjectOptJSONObject.has("Port") && jSONObjectOptJSONObject.has("Type"))) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("AccessList");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                                if (jSONObject2 != null && jSONObject2.has("Ip") && jSONObject2.has("Port") && jSONObject2.has("Type")) {
                                    String strOptString = jSONObject2.optString("Ip");
                                    long jOptLong = jSONObject2.optLong("Port");
                                    if (jSONObject2.optLong("Type") == 2) {
                                        this.mRtmpProxyIPList.add(strOptString + ":" + jOptLong);
                                    }
                                }
                            }
                        }
                        if (!this.mRtmpProxyParam.f5762i) {
                            this.mRtmpUrl = str;
                            this.mQuicChannel = false;
                        } else {
                            if (jSONObjectOptJSONObject == null) {
                                return;
                            }
                            this.mRtmpUrl = str.substring(0, str.indexOf("?")) + "/webrtc/" + (this.mRtmpProxyParam.f5754a + "_" + this.mRtmpProxyParam.f5757d + "_" + this.mRtmpProxyParam.f5756c) + "?real_rtmp_ip=" + jSONObjectOptJSONObject.optString("Ip") + "&real_rtmp_port=" + jSONObjectOptJSONObject.optLong("Port") + "&tinyid=" + this.mRtmpProxyParam.f5755b + "&srctinyid=0";
                            getNextRtmpProxyIP();
                        }
                        this.mRtmpProxyEnable = true;
                    }
                }
            } catch (Exception e11) {
                TXCLog.m4992e(TAG, "parse proxy info failed.", e11);
            }
        }
    }

    private void postReconnectMsg(String str, boolean z10, int i10) {
        Message message = new Message();
        message.what = 101;
        message.obj = str;
        message.arg1 = z10 ? 2 : 1;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessageDelayed(message, i10);
        }
    }

    private void reconnect(final boolean z10) {
        stopPushTask();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.network.TXCStreamUploader.3
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    TXCStreamUploader.this.internalReconnect(z10);
                }
            }, this.mParam.f5896f * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetStatus() {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long timeTick = TXCTimeUtil.getTimeTick();
        long j10 = timeTick - this.mLastTimeStamp;
        UploadStats uploadStats = getUploadStats();
        long j11 = 0;
        if (uploadStats != null) {
            UploadStats uploadStats2 = this.mLastUploadStats;
            if (uploadStats2 != null) {
                long jLongValue4 = getSpeed(uploadStats2.inVideoBytes, uploadStats.inVideoBytes, j10).longValue();
                jLongValue2 = getSpeed(this.mLastUploadStats.inAudioBytes, uploadStats.inAudioBytes, j10).longValue();
                jLongValue3 = getSpeed(this.mLastUploadStats.outVideoBytes, uploadStats.outVideoBytes, j10).longValue();
                jLongValue = getSpeed(this.mLastUploadStats.outAudioBytes, uploadStats.outAudioBytes, j10).longValue();
                j11 = jLongValue4;
            } else {
                jLongValue = 0;
                jLongValue2 = 0;
                jLongValue3 = 0;
            }
            setStatusValue(7005, Long.valueOf(uploadStats.videoCacheLen));
            setStatusValue(7006, Long.valueOf(uploadStats.audioCacheLen));
            setStatusValue(7007, Long.valueOf(uploadStats.videoDropCount));
            setStatusValue(7008, Long.valueOf(uploadStats.audioDropCount));
            setStatusValue(7021, Long.valueOf(uploadStats.bandwidthEst));
            setStatusValue(7009, Long.valueOf(uploadStats.startTS));
            setStatusValue(7010, Long.valueOf(uploadStats.dnsTS));
            setStatusValue(7011, Long.valueOf(uploadStats.connTS));
            setStatusValue(7012, String.valueOf(uploadStats.serverIP));
            setStatusValue(7013, Long.valueOf(this.mQuicChannel ? 2L : 1L));
            setStatusValue(7014, uploadStats.connectionID);
            setStatusValue(7015, uploadStats.connectionStats);
            this.mUploadQualityReport.m5343a(uploadStats.videoDropCount, uploadStats.audioDropCount);
            this.mUploadQualityReport.m5349b(uploadStats.videoCacheLen, uploadStats.audioCacheLen);
        } else {
            setStatusValue(7005, 0L);
            setStatusValue(7006, 0L);
            setStatusValue(7007, 0L);
            setStatusValue(7008, 0L);
            jLongValue = 0;
            jLongValue2 = 0;
            jLongValue3 = 0;
        }
        setStatusValue(TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL, Long.valueOf(j11));
        setStatusValue(7002, Long.valueOf(jLongValue2));
        setStatusValue(7003, Long.valueOf(jLongValue3));
        setStatusValue(7004, Long.valueOf(jLongValue));
        this.mLastTimeStamp = timeTick;
        this.mLastUploadStats = uploadStats;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(TbsListener.ErrorCode.READ_RESPONSE_ERROR, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rtmpProxySendHeartBeat() {
        int[] iArrM5047a = C6592e.m5047a();
        long j10 = iArrM5047a[0] / 10;
        long j11 = iArrM5047a[1] / 10;
        long jM5012c = TXCStatus.m5012c(getID(), 7004);
        long jM5012c2 = TXCStatus.m5012c(getID(), 7003);
        long jM5012c3 = TXCStatus.m5012c(getID(), 1001);
        long jM5012c4 = TXCStatus.m5012c(getID(), 4001);
        long jM5012c5 = TXCStatus.m5012c(getID(), 7006);
        long jM5012c6 = TXCStatus.m5012c(getID(), 7005);
        long jM5012c7 = TXCStatus.m5012c(getID(), 7008);
        long jM5012c8 = TXCStatus.m5012c(getID(), 7007);
        synchronized (this.mRtmpProxyLock) {
            nativeRtmpProxySendHeartBeat(this.mRtmpProxyInstance, j10, j11, jM5012c, jM5012c2, jM5012c3, jM5012c4, jM5012c5, jM5012c6, jM5012c7, jM5012c8);
        }
    }

    private void sendNotifyEvent(int i10, String str) {
        if (str == null || str.isEmpty()) {
            sendNotifyEvent(i10);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            C6592e.m5040a(this.mNotifyListener, i10, bundle);
        }
        if (i10 != 1002) {
            if (i10 == 1101) {
                this.mUploadQualityReport.m5351d();
            }
        } else {
            UploadStats uploadStats = getUploadStats();
            if (uploadStats != null) {
                this.mUploadQualityReport.m5344a(uploadStats.dnsparseTimeCost, uploadStats.connectTimeCost, uploadStats.handshakeTimeCost);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPushTask(final String str, final boolean z10, int i10) {
        TXCLog.m4994i(TAG, "start push task");
        boolean z11 = this.mQuicChannel;
        if (z11 != z10 && z11) {
            Monitor.m5001a(2, String.format("Network: switch push channel from quic to tcp.[retryCount:%d][retryLimit:%d]", Integer.valueOf(this.mRetryCount), Integer.valueOf(this.mParam.f5895e)), "", 0);
        }
        if (z10) {
            int i11 = this.mConnectCountQuic + 1;
            this.mConnectCountQuic = i11;
            setStatusValue(7017, Long.valueOf(i11));
        } else {
            int i12 = this.mConnectCountTcp + 1;
            this.mConnectCountTcp = i12;
            setStatusValue(7018, Long.valueOf(i12));
        }
        Thread thread = new Thread("RTMPUpload") { // from class: com.tencent.liteav.network.TXCStreamUploader.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws InterruptedException {
                while (TXCStreamUploader.this.mUploaderInstance != 0) {
                    try {
                        Thread.sleep(100L, 0);
                    } catch (InterruptedException unused) {
                    }
                }
                TXCStreamUploader.this.mUploadQualityReport.m5348b();
                TXCStreamUploader.this.mUploadQualityReport.m5346a(TXCStreamUploader.this.mParam.f5900j);
                TXCStreamUploader.this.mUploadQualityReport.m5345a(TXCStreamUploader.this.mRtmpUrl);
                TXCStreamUploader.this.mUploadQualityReport.m5347a(z10, TXCStreamUploader.this.getAddressFromUrl(str));
                synchronized (TXCStreamUploader.this.mThreadLock) {
                    try {
                        TXCStreamUploader.this.mQuicChannel = z10;
                        int i13 = TXCStreamUploader.this.mParam.f5900j ? TXCStreamUploader.this.mQuicChannel ? 3 : 2 : 1;
                        if (TXCStreamUploader.this.mRtmpProxyEnable) {
                            if (TXCStreamUploader.this.mAudioMuted) {
                                TXCStreamUploader.this.mParam.f5901k = false;
                            }
                        } else if (TXCStreamUploader.this.mIpList == null || TXCStreamUploader.this.mIpList.size() == 0) {
                            i13 = 1;
                        }
                        TXCStreamUploader.this.setStatusValue(7020, Long.valueOf(i13));
                        TXCStreamUploader tXCStreamUploader = TXCStreamUploader.this;
                        tXCStreamUploader.mUploaderInstance = tXCStreamUploader.nativeInitUploader(tXCStreamUploader.mRtmpUrl, str, z10, TXCStreamUploader.this.mParam.f5894d, TXCStreamUploader.this.mParam.f5893c, TXCStreamUploader.this.mParam.f5891a, TXCStreamUploader.this.mParam.f5892b, TXCStreamUploader.this.mParam.f5897g, 16, i13, TXCStreamUploader.this.mParam.f5901k, TXCStreamUploader.this.mParam.f5902l, TXCStreamUploader.this.mMetaData);
                        if (TXCStreamUploader.this.mUploaderInstance != 0) {
                            TXCStreamUploader tXCStreamUploader2 = TXCStreamUploader.this;
                            tXCStreamUploader2.nativeSetVideoDropParams(tXCStreamUploader2.mUploaderInstance, TXCStreamUploader.this.mParam.f5899i, TXCStreamUploader.this.mParam.f5897g, TXCStreamUploader.this.mParam.f5898h);
                            Iterator it = TXCStreamUploader.this.mVecPendingNAL.iterator();
                            boolean z12 = false;
                            while (it.hasNext()) {
                                TXSNALPacket tXSNALPacket = (TXSNALPacket) it.next();
                                if (!z12 && tXSNALPacket.nalType == 0) {
                                    z12 = true;
                                }
                                if (z12) {
                                    TXCStreamUploader tXCStreamUploader3 = TXCStreamUploader.this;
                                    tXCStreamUploader3.nativePushNAL(tXCStreamUploader3.mUploaderInstance, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.frameIndex, tXSNALPacket.pts, tXSNALPacket.dts);
                                }
                            }
                            TXCStreamUploader.this.mVecPendingNAL.removeAllElements();
                        }
                    } finally {
                    }
                }
                if (TXCStreamUploader.this.mRtmpProxyEnable) {
                    synchronized (TXCStreamUploader.this.mRtmpProxyLock) {
                        TXCStreamUploader tXCStreamUploader4 = TXCStreamUploader.this;
                        tXCStreamUploader4.mRtmpProxyInstance = tXCStreamUploader4.nativeInitRtmpProxyInstance(tXCStreamUploader4.mRtmpProxyParam.f5754a, TXCStreamUploader.this.mRtmpProxyParam.f5755b, TXCStreamUploader.this.mRtmpProxyParam.f5756c, TXCStreamUploader.this.mRtmpProxyParam.f5757d, TXCStreamUploader.this.mRtmpProxyParam.f5758e, TXCStreamUploader.this.mRtmpProxyParam.f5759f, TXCStreamUploader.this.mRtmpProxyParam.f5760g, TXCStreamUploader.this.mRtmpProxyParam.f5761h, TXCStreamUploader.this.mRtmpProxyParam.f5762i, TXCStreamUploader.this.mRtmpProxyParam.f5763j);
                    }
                    synchronized (TXCStreamUploader.this.mRtmpMsgRecvThreadLock) {
                        TXCStreamUploader tXCStreamUploader5 = TXCStreamUploader.this;
                        tXCStreamUploader5.mRtmpMsgRecvThreadInstance = tXCStreamUploader5.nativeInitRtmpMsgRecvThreadInstance(tXCStreamUploader5.mRtmpProxyInstance, TXCStreamUploader.this.mUploaderInstance);
                    }
                }
                TXCStreamUploader tXCStreamUploader6 = TXCStreamUploader.this;
                tXCStreamUploader6.nativeOnThreadRun(tXCStreamUploader6.mUploaderInstance);
                if (TXCStreamUploader.this.mRtmpProxyEnable) {
                    synchronized (TXCStreamUploader.this.mRtmpMsgRecvThreadLock) {
                        TXCStreamUploader tXCStreamUploader7 = TXCStreamUploader.this;
                        tXCStreamUploader7.nativeRtmpMsgRecvThreadStop(tXCStreamUploader7.mRtmpMsgRecvThreadInstance);
                        TXCStreamUploader tXCStreamUploader8 = TXCStreamUploader.this;
                        tXCStreamUploader8.nativeUninitRtmpMsgRecvThreadInstance(tXCStreamUploader8.mRtmpMsgRecvThreadInstance);
                        TXCStreamUploader.this.mRtmpMsgRecvThreadInstance = 0L;
                    }
                    synchronized (TXCStreamUploader.this.mRtmpProxyLock) {
                        TXCStreamUploader tXCStreamUploader9 = TXCStreamUploader.this;
                        tXCStreamUploader9.nativeUninitRtmpProxyInstance(tXCStreamUploader9.mRtmpProxyInstance);
                        TXCStreamUploader.this.mRtmpProxyInstance = 0L;
                    }
                }
                synchronized (TXCStreamUploader.this.mThreadLock) {
                    TXCStreamUploader tXCStreamUploader10 = TXCStreamUploader.this;
                    tXCStreamUploader10.nativeUninitUploader(tXCStreamUploader10.mUploaderInstance);
                    TXCStreamUploader.this.mUploaderInstance = 0L;
                }
            }
        };
        this.mThread = thread;
        thread.start();
    }

    private void stopPushTask() {
        TXCLog.m4994i(TAG, "stop push task");
        synchronized (this.mThreadLock) {
            this.mVecPendingNAL.removeAllElements();
            nativeStopPush(this.mUploaderInstance);
        }
    }

    private void tryResetRetryCount() {
        if (this.mConnectSuccessTimeStamps != 0) {
            long timeTick = TXCTimeUtil.getTimeTick() - this.mConnectSuccessTimeStamps;
            C6649l c6649l = this.mParam;
            if (timeTick > c6649l.f5895e * (c6649l.f5896f + 13) * 1000) {
                this.mRetryCount = 0;
                this.mConnectSuccessTimeStamps = 0L;
                TXCLog.m4994i(TAG, "reset retry count");
            }
        }
    }

    public String getConfusionIP(String str) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        if (str == null || (iIndexOf = str.indexOf(".")) == -1 || (iIndexOf2 = (strSubstring = str.substring(iIndexOf + 1)).indexOf(".")) == -1) {
            return str;
        }
        return "A.B." + strSubstring.substring(iIndexOf2 + 1);
    }

    public UploadStats getUploadStats() {
        UploadStats uploadStatsNativeGetStats;
        synchronized (this.mThreadLock) {
            try {
                uploadStatsNativeGetStats = nativeGetStats(this.mUploaderInstance);
                if (uploadStatsNativeGetStats != null) {
                    uploadStatsNativeGetStats.channelType = this.mQuicChannel ? 2L : 1L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uploadStatsNativeGetStats;
    }

    public int init() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    @Override // com.tencent.liteav.network.InterfaceC6639b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFetchDone(int r5, java.util.ArrayList<com.tencent.liteav.network.C6629a> r6) {
        /*
            r4 = this;
            boolean r0 = r4.mIsPushing
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            if (r6 == 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onFetchDone: code = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " ip count = "
            r1.append(r2)
            int r2 = r6.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TXCStreamUploader"
            com.tencent.liteav.basic.log.TXCLog.m4991e(r2, r1)
            if (r5 != 0) goto L35
            r4.mIpList = r6
            int r5 = r6.size()
            r4.mCurrentRecordIdx = r0
            goto L36
        L35:
            r5 = r0
        L36:
            if (r5 <= 0) goto Lab
            java.util.ArrayList<com.tencent.liteav.network.a> r5 = r4.mIpList
            java.util.Iterator r5 = r5.iterator()
            java.lang.String r6 = ""
            r1 = r0
        L41:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r5.next()
            com.tencent.liteav.network.a r2 = (com.tencent.liteav.network.C6629a) r2
            if (r2 == 0) goto L5f
            boolean r3 = r2.f5770c
            if (r3 == 0) goto L5f
            java.lang.String r3 = r2.f5768a
            if (r3 == 0) goto L5f
            int r3 = r3.length()
            if (r3 <= 0) goto L5f
            int r1 = r1 + 1
        L5f:
            if (r2 == 0) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r6 = " "
            r3.append(r6)
            java.lang.String r6 = r2.f5768a
            java.lang.String r6 = r4.getConfusionIP(r6)
            r3.append(r6)
            java.lang.String r6 = ":"
            r3.append(r6)
            java.lang.String r6 = r2.f5769b
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            goto L41
        L86:
            long r1 = (long) r1
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r1 = 7016(0x1b68, float:9.832E-42)
            r4.setStatusValue(r1, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "{"
            r5.append(r1)
            r5.append(r6)
            java.lang.String r6 = " }"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = 7019(0x1b6b, float:9.836E-42)
            r4.setStatusValue(r6, r5)
        Lab:
            com.tencent.liteav.network.TXCStreamUploader$b r5 = r4.getRtmpRealConnectInfo()
            java.lang.String r6 = r5.f5765a
            boolean r5 = r5.f5766b
            r4.postReconnectMsg(r6, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.network.TXCStreamUploader.onFetchDone(int, java.util.ArrayList):void");
    }

    public void pushAAC(byte[] bArr, long j10) {
        tryResetRetryCount();
        synchronized (this.mThreadLock) {
            try {
                if (!this.mAudioMuted || !this.mRtmpProxyEnable) {
                    nativePushAAC(this.mUploaderInstance, bArr, j10);
                }
            } finally {
            }
        }
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) throws Throwable {
        byte[] bArr;
        tryResetRetryCount();
        synchronized (this.mThreadLock) {
            try {
                try {
                    long j10 = this.mUploaderInstance;
                    if (j10 == 0) {
                        if (tXSNALPacket.nalType == 0) {
                            this.mVecPendingNAL.removeAllElements();
                        }
                        this.mVecPendingNAL.add(tXSNALPacket);
                    } else if (tXSNALPacket != null && (bArr = tXSNALPacket.nalData) != null && bArr.length > 0) {
                        nativePushNAL(j10, bArr, tXSNALPacket.nalType, tXSNALPacket.frameIndex, tXSNALPacket.pts, tXSNALPacket.dts);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public void setAudioInfo(int i10, int i11) {
        C6649l c6649l = this.mParam;
        if (c6649l != null) {
            c6649l.f5893c = i11;
            c6649l.f5894d = i10;
        }
    }

    public void setAudioMute(boolean z10) {
        synchronized (this.mThreadLock) {
            try {
                this.mAudioMuted = z10;
                if (this.mRtmpProxyEnable) {
                    long j10 = this.mUploaderInstance;
                    if (j10 != 0) {
                        nativeSetSendStrategy(j10, this.mParam.f5900j ? this.mQuicChannel ? 3 : 2 : 1, false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDropEanble(boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append("drop enable ");
        sb.append(z10 ? "yes" : "no");
        TXCLog.m4994i(TAG, sb.toString());
        synchronized (this.mThreadLock) {
            nativeEnableDrop(this.mUploaderInstance, z10);
        }
    }

    public void setMetaData(HashMap<String, String> map) {
        this.mMetaData = map;
    }

    public void setMode(int i10) {
        C6649l c6649l = this.mParam;
        if (c6649l != null) {
            c6649l.f5891a = i10;
        }
    }

    public void setNotifyListener(InterfaceC6559b interfaceC6559b) {
        this.mNotifyListener = new WeakReference<>(interfaceC6559b);
    }

    public void setRetryInterval(int i10) {
        C6649l c6649l = this.mParam;
        if (c6649l != null) {
            c6649l.f5896f = i10;
        }
    }

    public void setRetryTimes(int i10) {
        C6649l c6649l = this.mParam;
        if (c6649l != null) {
            c6649l.f5895e = i10;
        }
    }

    public void setSendStrategy(boolean z10, boolean z11) {
        ArrayList<C6629a> arrayList;
        C6649l c6649l = this.mParam;
        c6649l.f5900j = z10;
        c6649l.f5901k = z11;
        this.mUploadQualityReport.m5346a(z10);
        int i10 = 1;
        int i11 = z10 ? this.mQuicChannel ? 3 : 2 : 1;
        if (this.mRtmpProxyEnable || ((arrayList = this.mIpList) != null && arrayList.size() != 0)) {
            i10 = i11;
        }
        synchronized (this.mThreadLock) {
            try {
                long j10 = this.mUploaderInstance;
                if (j10 != 0) {
                    nativeSetSendStrategy(j10, i10, z11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        setStatusValue(7020, Long.valueOf(i10));
    }

    public void setVideoDropParams(boolean z10, int i10, int i11) {
        StringBuilder sb = new StringBuilder();
        sb.append("drop params wait i frame:");
        sb.append(z10 ? "yes" : "no");
        sb.append(" max video count:");
        sb.append(i10);
        sb.append(" max video cache time: ");
        sb.append(i11);
        sb.append(" ms");
        TXCLog.m4994i(TAG, sb.toString());
        synchronized (this.mThreadLock) {
            try {
                C6649l c6649l = this.mParam;
                c6649l.f5899i = z10;
                c6649l.f5897g = i10;
                c6649l.f5898h = i11;
                long j10 = this.mUploaderInstance;
                if (j10 != 0) {
                    nativeSetVideoDropParams(j10, z10, i10, i11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String start(String str, boolean z10, int i10) throws JSONException {
        if (this.mIsPushing) {
            return this.mRtmpUrl;
        }
        this.mIsPushing = true;
        this.mConnectSuccessTimeStamps = 0L;
        this.mRetryCount = 0;
        this.mRtmpUrl = str;
        this.mChannelType = i10;
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.mRtmpProxyEnable = false;
        this.mRtmpProxyParam.m5237a();
        this.mRtmpProxyIPList.clear();
        this.mRtmpProxyIPIndex = 0;
        this.mRtmpProxyInstance = 0L;
        this.mRtmpMsgRecvThreadInstance = 0L;
        setStatusValue(7016, 0L);
        setStatusValue(7017, 0L);
        setStatusValue(7018, 0L);
        this.mUploadQualityReport.m5342a();
        StringBuilder sb = new StringBuilder();
        sb.append("start push with url:");
        sb.append(this.mRtmpUrl);
        sb.append(" enable nearest ip:");
        sb.append(z10 ? "yes" : "no");
        sb.append("channel type:");
        sb.append(i10);
        TXCLog.m4994i(TAG, sb.toString());
        if (C6592e.m5053c(this.mContext) == 0) {
            sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NO_NETWORK);
            return this.mRtmpUrl;
        }
        this.mEnableNearestIP = z10;
        if (this.mHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread("RTMP_PUSH");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
        }
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: com.tencent.liteav.network.TXCStreamUploader.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i11 = message.what;
                if (i11 == 101) {
                    TXCStreamUploader.this.startPushTask((String) message.obj, message.arg1 == 2, 0);
                    return;
                }
                if (i11 == 103) {
                    TXCStreamUploader.this.reportNetStatus();
                } else {
                    if (i11 != 104) {
                        return;
                    }
                    TXCStreamUploader.this.rtmpProxySendHeartBeat();
                    if (TXCStreamUploader.this.mHandler != null) {
                        TXCStreamUploader.this.mHandler.sendEmptyMessageDelayed(104, 2000L);
                    }
                }
            }
        };
        parseProxyInfo(str);
        if (this.mRtmpProxyEnable) {
            this.mLastNetworkType = C6592e.m5053c(this.mContext);
            nativeCacheJNIParams();
            startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
        } else if (!this.mEnableNearestIP || this.mLastNetworkType == C6592e.m5053c(this.mContext)) {
            startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
        } else {
            TXCLog.m4994i(TAG, "fetching nearest ip list");
            this.mLastNetworkType = C6592e.m5053c(this.mContext);
            this.mIntelligentRoute.m5266a(str, i10);
        }
        this.mHandler.sendEmptyMessageDelayed(TbsListener.ErrorCode.READ_RESPONSE_ERROR, 2000L);
        return this.mRtmpUrl;
    }

    public void stop() throws JSONException {
        if (this.mIsPushing) {
            this.mIsPushing = false;
            TXCLog.m4994i(TAG, "stop push");
            if (this.mRtmpProxyEnable) {
                synchronized (this.mRtmpProxyLock) {
                    nativeRtmpProxyLeaveRoom(this.mRtmpProxyInstance);
                }
            }
            synchronized (this.mThreadLock) {
                nativeStopPush(this.mUploaderInstance);
            }
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.getLooper().quit();
                this.mHandlerThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
            if (this.mRtmpProxyEnable) {
                nativeReleaseJNIParams();
            }
            this.mUploadQualityReport.m5350c();
            this.mUploadQualityReport.m5342a();
        }
    }

    private void sendNotifyEvent(int i10) {
        if (i10 == 0) {
            reconnect(false);
            return;
        }
        if (i10 == 1) {
            reconnect(true);
            return;
        }
        if (i10 == 1001) {
            this.mConnectSuccessTimeStamps = TXCTimeUtil.getTimeTick();
        }
        if (i10 == 1026) {
            if (this.mRtmpProxyEnable) {
                synchronized (this.mRtmpMsgRecvThreadLock) {
                    nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
                }
                synchronized (this.mRtmpProxyLock) {
                    nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
                }
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(104, 2000L);
                    return;
                }
                return;
            }
            return;
        }
        if (this.mNotifyListener != null) {
            Bundle bundle = new Bundle();
            if (i10 == -2308) {
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "The server rejects the connection request. It may be that the push URL has been occupied or expired, or the anti-leech link is wrong.");
            } else if (i10 == -1307) {
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "failed to connect server for several times, abort connection");
            } else {
                if (i10 == 1026) {
                    if (this.mRtmpProxyEnable) {
                        synchronized (this.mRtmpMsgRecvThreadLock) {
                            nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
                        }
                        synchronized (this.mRtmpProxyLock) {
                            nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
                        }
                        Handler handler2 = this.mHandler;
                        if (handler2 != null) {
                            handler2.sendEmptyMessageDelayed(104, 2000L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == 3003) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "RTMP servers handshake failed");
                } else if (i10 == -1325) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "No internet. Please check if WiFi or mobile data is turned on");
                } else if (i10 == -1324) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect all IPs, abort connection.");
                } else if (i10 == 1001) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Already connected to rtmp server");
                } else if (i10 == 1002) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "rtmp start push stream");
                } else if (i10 == 1101) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Insufficient upstream bandwidth. Data transmission is not timely");
                } else if (i10 == 1102) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Enables network reconnection");
                } else if (i10 == 3008) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "No data is sent for more than 30s. Actively disconnect");
                } else if (i10 != 3009) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "UNKNOWN");
                } else {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect server");
                }
            }
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            C6592e.m5040a(this.mNotifyListener, i10, bundle);
        }
    }
}
