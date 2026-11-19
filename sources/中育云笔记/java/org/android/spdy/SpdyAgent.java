package org.android.spdy;

import android.content.Context;
import com.tendcloud.tenddata.C7863av;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okio.Utf8;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes6.dex */
public final class SpdyAgent {
    public static final int ACCS_ONLINE_SERVER = 1;
    public static final int ACCS_TEST_SERVER = 0;
    private static final boolean HAVE_CLOSE = false;
    private static final int KB32 = 32768;
    private static final int KB8 = 8192;
    private static final int MAX_SPDY_SESSION_COUNT = 50;
    private static final int MB5 = 5242880;
    static final int MODE_QUIC = 256;
    static final int SPDY_CUSTOM_CONTROL_FRAME_RECV = 4106;
    static final int SPDY_DATA_CHUNK_RECV = 4097;
    static final int SPDY_DATA_RECV = 4098;
    static final int SPDY_DATA_SEND = 4099;
    static final int SPDY_PING_RECV = 4101;
    static final int SPDY_REQUEST_RECV = 4102;
    static final int SPDY_SESSION_CLOSE = 4103;
    static final int SPDY_SESSION_CREATE = 4096;
    static final int SPDY_SESSION_FAILED_ERROR = 4105;
    static final int SPDY_STREAM_CLOSE = 4100;
    static final int SPDY_STREAM_RESPONSE_RECV = 4104;
    private static final String TNET_SO_VERSION = "tnet-3.1.14";
    private static Object domainHashLock = null;
    private static HashMap<String, Integer> domainHashMap = null;
    public static volatile boolean enableDebug = false;
    public static volatile boolean enableTimeGaurd = false;
    private static volatile SpdyAgent gSingleInstance;
    private static volatile boolean loadSucc;
    private static Object lock;

    /* renamed from: r */
    private static final Lock f25347r;
    private static final ReentrantReadWriteLock rwLock;
    private static int totalDomain;

    /* renamed from: w */
    private static final Lock f25348w;
    private AccsSSLCallback accsSSLCallback;
    private long agentNativePtr;
    private HashMap<String, SpdySession> sessionMgr = new HashMap<>(5);
    private LinkedList<SpdySession> sessionQueue = new LinkedList<>();
    private AtomicBoolean closed = new AtomicBoolean();
    private String proxyUsername = null;
    private String proxyPassword = null;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        rwLock = reentrantReadWriteLock;
        f25347r = reentrantReadWriteLock.readLock();
        f25348w = reentrantReadWriteLock.writeLock();
        loadSucc = false;
        gSingleInstance = null;
        lock = new Object();
        domainHashLock = new Object();
        domainHashMap = new HashMap<>();
        totalDomain = 0;
    }

    private SpdyAgent(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback) {
        try {
            SoInstallMgrSdk.init(context);
            loadSucc = SoInstallMgrSdk.initSo(TNET_SO_VERSION, 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            this.agentNativePtr = initAgent(spdyVersion.getInt(), spdySessionKind.getint(), SslVersion.SLIGHT_VERSION_V1.getint());
            this.accsSSLCallback = accsSSLCallback;
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
        }
        this.closed.set(false);
    }

    public static void InvlidCharJudge(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            if ((b10 & C7863av.f14384i) < 32 || (b10 & C7863av.f14384i) > 126) {
                bArr[i10] = Utf8.REPLACEMENT_BYTE;
            }
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            byte b11 = bArr2[i11];
            if ((b11 & C7863av.f14384i) < 32 || (b11 & C7863av.f14384i) > 126) {
                bArr2[i11] = Utf8.REPLACEMENT_BYTE;
            }
        }
    }

    private void agentIsOpen() {
        if (this.closed.get()) {
            throw new SpdyErrorException("SPDY_JNI_ERR_ASYNC_CLOSE", TnetStatusCode.TNET_JNI_ERR_ASYNC_CLOSE);
        }
        checkLoadSo();
    }

    private void bioPingRecvCallback(SpdySession spdySession, int i10) {
        spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.bioPingRecvCallback(spdySession, i10);
        }
    }

    private void checkLoadSo() {
        if (loadSucc) {
            return;
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (lock) {
            try {
                if (loadSucc) {
                    return;
                }
                loadSucc = SoInstallMgrSdk.initSo(TNET_SO_VERSION, 1);
                this.agentNativePtr = initAgent(0, 0, 0);
                if (!loadSucc) {
                    throw new SpdyErrorException("TNET_JNI_ERR_LOAD_SO_FAIL", TnetStatusCode.TNET_JNI_ERR_LOAD_SO_FAIL);
                }
            } finally {
            }
        }
    }

    public static boolean checkLoadSucc() {
        return loadSucc;
    }

    private native int closeSessionN(long j10);

    public static int configIpStackMode(int i10) {
        spduLog.Logi("tnet-jni", "[configIpStackMode] - " + i10);
        return configIpStackModeN(i10);
    }

    private static native int configIpStackModeN(int i10);

    private native int configLogFileN(String str, int i10, int i11);

    private native int configLogFileN(String str, int i10, int i11, int i12);

    private static void crashReporter(int i10) {
    }

    private native long createSessionN(long j10, SpdySession spdySession, int i10, byte[] bArr, char c10, byte[] bArr2, char c11, byte[] bArr3, byte[] bArr4, Object obj, int i11, int i12, int i13, byte[] bArr5);

    public static byte[] dataproviderToByteArray(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider) {
        headJudge(spdyRequest.getHeaders());
        if (spdyDataProvider == null) {
            return null;
        }
        String strMapBodyToString = mapBodyToString(spdyDataProvider.postBody);
        byte[] bytes = strMapBodyToString != null ? strMapBodyToString.getBytes() : spdyDataProvider.data;
        if (bytes == null || bytes.length < 5242880) {
            return bytes;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + bytes.length, TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    private native int freeAgent(long j10);

    private int getDomainHashIndex(String str) {
        Integer numValueOf;
        synchronized (domainHashLock) {
            try {
                numValueOf = domainHashMap.get(str);
                if (numValueOf == null) {
                    HashMap<String, Integer> map = domainHashMap;
                    int i10 = totalDomain + 1;
                    totalDomain = i10;
                    map.put(str, Integer.valueOf(i10));
                    numValueOf = Integer.valueOf(totalDomain);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    public static SpdyAgent getInstance(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind) {
        if (gSingleInstance == null) {
            synchronized (lock) {
                try {
                    if (gSingleInstance == null) {
                        gSingleInstance = new SpdyAgent(context, spdyVersion, spdySessionKind, null);
                    }
                } finally {
                }
            }
        }
        return gSingleInstance;
    }

    private void getPerformance(SpdySession spdySession, SslPermData sslPermData) {
    }

    private byte[] getSSLMeta(SpdySession spdySession) {
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[getSSLMeta] - session is null");
            return null;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb != null) {
            return intenalcb.getSSLMeta(spdySession);
        }
        spduLog.Logi("tnet-jni", "[getSSLMeta] - session.intenalcb is null");
        return null;
    }

    private byte[] getSSLPublicKey(int i10, byte[] bArr) {
        AccsSSLCallback accsSSLCallback = this.accsSSLCallback;
        if (accsSSLCallback != null) {
            return accsSSLCallback.getSSLPublicKey(i10, bArr);
        }
        spduLog.Logd("tnet-jni", "[getSSLPublicKey] - accsSSLCallback is null.");
        return null;
    }

    private native long getSession(long j10, byte[] bArr, char c10);

    public static void headJudge(Map<String, String> map) {
        if (map != null) {
            int length = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                InvlidCharJudge(key.getBytes(), value.getBytes());
                length += key.length() + 1 + value.length();
                securityCheck(length, value.length());
            }
        }
    }

    private native long initAgent(int i10, int i11, int i12);

    @Deprecated
    public static void inspect(String str) {
    }

    private native void logFileCloseN();

    private native void logFileFlushN();

    public static String mapBodyToString(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        if (map == null) {
            return null;
        }
        int length = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb2.append(key);
            sb2.append('=');
            sb2.append(value);
            sb2.append('&');
            length += key.length() + 1 + value.length();
            tableListJudge(length);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static String[] mapToByteArray(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        String[] strArr = new String[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i10] = entry.getKey();
            strArr[i10 + 1] = entry.getValue();
            i10 += 2;
        }
        return strArr;
    }

    private int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[putSSLMeta] - session is null");
            return -1;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb != null) {
            return intenalcb.putSSLMeta(spdySession, bArr);
        }
        spduLog.Logi("tnet-jni", "[putSSLMeta] - session.intenalcb is null");
        return -1;
    }

    public static void securityCheck(int i10, int i11) {
        if (i10 >= 32768) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + i10, TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
        if (i11 < 8192) {
            return;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:value=" + i11, TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    private native int setConTimeout(long j10, int i10);

    private native int setSessionKind(long j10, int i10);

    private void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyCustomControlFrameFailCallback(spdySession, obj, i10, i11);
        }
    }

    private void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyCustomControlFrameRecvCallback(spdySession, obj, i10, i11, i12, i13, bArr);
        }
    }

    private void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, int i10, SpdyByteArray spdyByteArray, int i11) {
        spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - ");
        long j10 = i10 & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataChunkRecvCB(spdySession, z10, j10, spdyByteArray, i11);
        }
    }

    private void spdyDataRecvCallback(SpdySession spdySession, boolean z10, int i10, int i11, int i12) {
        spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - ");
        long j10 = i10 & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataRecvCallback(spdySession, z10, j10, i11, i12);
        }
    }

    private void spdyDataSendCallback(SpdySession spdySession, boolean z10, int i10, int i11, int i12) {
        long j10 = i10 & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataSendCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataSendCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataSendCallback(spdySession, z10, j10, i11, i12);
        }
    }

    private void spdyPingRecvCallback(SpdySession spdySession, int i10, Object obj) {
        spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyPingRecvCallback(spdySession, i10, obj);
        }
    }

    private void spdyRequestRecvCallback(SpdySession spdySession, int i10, int i11) {
        long j10 = i10 & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyRequestRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyRequestRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyRequestRecvCallback(spdySession, j10, i11);
        }
    }

    private void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - errorCode = " + i10);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - session is null");
        } else {
            try {
                Intenalcb intenalcb = spdySession.intenalcb;
                if (intenalcb == null) {
                    spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - session.intenalcb is null");
                } else {
                    intenalcb.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i10);
                }
                spdySession.cleanUp();
            } catch (Throwable th) {
                spdySession.cleanUp();
                throw th;
            }
        }
        spdySession.releasePptr();
    }

    private void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - session.intenalcb is null");
        } else {
            intenalcb.spdySessionConnectCB(spdySession, superviseConnectInfo);
        }
    }

    private void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        spduLog.Logi("tnet-jni", "[spdySessionFailedError] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionFailedError] - session is null");
        } else {
            try {
                Intenalcb intenalcb = spdySession.intenalcb;
                if (intenalcb == null) {
                    spduLog.Logi("tnet-jni", "[spdySessionFailedError] - session.intenalcb is null");
                } else {
                    intenalcb.spdySessionFailedError(spdySession, i10, obj);
                }
                spdySession.cleanUp();
            } catch (Throwable th) {
                spdySession.cleanUp();
                throw th;
            }
        }
        spdySession.releasePptr();
    }

    private void spdySessionOnWritable(SpdySession spdySession, Object obj, int i10) {
        spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - session is null");
            return;
        }
        try {
            Intenalcb intenalcb = spdySession.intenalcb;
            if (intenalcb == null) {
                spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - session.intenalcb is null");
            } else {
                intenalcb.spdySessionOnWritable(spdySession, obj, i10);
            }
        } catch (Throwable th) {
            spduLog.Loge("tnet-jni", "[spdySessionOnWritable] - exception:" + th);
        }
    }

    private void spdyStreamCloseCallback(SpdySession spdySession, int i10, int i11, int i12, SuperviseData superviseData) {
        spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - ");
        long j10 = i10 & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyStreamCloseCallback(spdySession, j10, i11, i12, superviseData);
        }
    }

    private void spdyStreamResponseRecv(SpdySession spdySession, int i10, String[] strArr, int i11) {
        spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - ");
        Map<String, List<String>> mapStringArrayToMap = stringArrayToMap(strArr);
        long j10 = i10 & 4294967295L;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - session.intenalcb is null");
        } else {
            intenalcb.spdyOnStreamResponse(spdySession, j10, mapStringArrayToMap, i11);
        }
    }

    public static Map<String, List<String>> stringArrayToMap(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        HashMap map = new HashMap(5);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 2;
            if (i11 > strArr.length) {
                return map;
            }
            String str = strArr[i10];
            if (str == null) {
                break;
            }
            int i12 = i10 + 1;
            if (strArr[i12] == null) {
                break;
            }
            List arrayList = (List) map.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(strArr[i10], arrayList);
            }
            arrayList.add(strArr[i12]);
            i10 = i11;
        }
        return null;
    }

    public static void tableListJudge(int i10) {
        if (i10 < 5242880) {
            return;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + i10, TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    public void clearSpdySession(String str, String str2, int i10) {
        if (str != null) {
            Lock lock2 = f25348w;
            lock2.lock();
            try {
                this.sessionMgr.remove(str + str2 + i10);
                lock2.unlock();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f25348w.unlock();
                }
            }
        }
    }

    public void close() {
    }

    public int closeSession(long j10) {
        return closeSessionN(j10);
    }

    public int configLogFile(String str, int i10, int i11) {
        if (loadSucc) {
            return configLogFileN(str, i10, i11);
        }
        return -1;
    }

    @Deprecated
    public SpdySession createSession(String str, Object obj, SessionCb sessionCb, int i10) {
        return createSession(str, "", obj, sessionCb, null, i10, 0);
    }

    public HashMap<String, SpdySession> getAllSession() {
        return this.sessionMgr;
    }

    public void logFileClose() {
        if (loadSucc) {
            logFileFlushN();
            logFileCloseN();
        }
    }

    public void logFileFlush() {
        if (loadSucc) {
            logFileFlushN();
        }
    }

    public void removeSession(SpdySession spdySession) {
        Lock lock2 = f25348w;
        lock2.lock();
        try {
            this.sessionQueue.remove(spdySession);
            lock2.unlock();
        } catch (Throwable th) {
            f25348w.unlock();
            throw th;
        }
    }

    public void setAccsSslCallback(AccsSSLCallback accsSSLCallback) {
        spduLog.Logi("tnet-jni", "[setAccsSslCallback] - " + accsSSLCallback.getClass());
        this.accsSSLCallback = accsSSLCallback;
    }

    @Deprecated
    public int setConnectTimeOut(int i10) {
        agentIsOpen();
        try {
            return setConTimeout(this.agentNativePtr, i10);
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void setProxyUsernamePassword(String str, String str2) {
        this.proxyUsername = str;
        this.proxyPassword = str2;
    }

    @Deprecated
    public int setSessionKind(SpdySessionKind spdySessionKind) {
        agentIsOpen();
        try {
            return setSessionKind(this.agentNativePtr, spdySessionKind.getint());
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i10) {
        SpdySession spdySessionCreateSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i10, 0, spdyRequest.getConnectionTimeoutMs());
        spdySessionCreateSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return spdySessionCreateSession;
    }

    @Deprecated
    public void switchAccsServer(int i10) {
    }

    public int configLogFile(String str, int i10, int i11, int i12) {
        if (loadSucc) {
            return configLogFileN(str, i10, i11, i12);
        }
        return -1;
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, int i10) {
        return createSession(str, str2, obj, sessionCb, null, i10, 0);
    }

    @Deprecated
    public SpdySession createSession(String str, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i10) {
        return createSession(str, "", obj, sessionCb, sslCertcb, i10, 0);
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i10, int i11) {
        SpdySession spdySessionCreateSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i10, i11, spdyRequest.getConnectionTimeoutMs());
        spdySessionCreateSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return spdySessionCreateSession;
    }

    public SpdySession createSession(SessionInfo sessionInfo) {
        return createSession(sessionInfo.getAuthority(), sessionInfo.getDomain(), sessionInfo.getSessonUserData(), sessionInfo.getSessionCb(), null, sessionInfo.getMode(), sessionInfo.getPubKeySeqNum(), sessionInfo.getConnectionTimeoutMs(), sessionInfo.getCertHost());
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i10, int i11) {
        return createSession(str, str2, obj, sessionCb, sslCertcb, i10, i11, -1);
    }

    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i10, int i11) {
        return submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, null, i10, i11);
    }

    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i10, int i11, int i12) {
        return createSession(str, str2, obj, sessionCb, sslCertcb, i10, i11, i12, null);
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i10) {
        return submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, (SslCertcb) null, i10);
    }

    @Deprecated
    public static SpdyAgent getInstance(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback) {
        if (gSingleInstance == null) {
            synchronized (lock) {
                try {
                    if (gSingleInstance == null) {
                        gSingleInstance = new SpdyAgent(context, spdyVersion, spdySessionKind, accsSSLCallback);
                    }
                } finally {
                }
            }
        }
        return gSingleInstance;
    }

    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i10, int i11, int i12, String str3) {
        String str4;
        boolean z10;
        SpdySession spdySession;
        String str5;
        char c10;
        int i13;
        long jCreateSessionN;
        int i14;
        if (str != null) {
            String[] strArrSplit = str.split(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            char c11 = 0;
            int iLastIndexOf = strArrSplit[0].lastIndexOf(58);
            String strSubstring = strArrSplit[0].substring(0, iLastIndexOf);
            String strSubstring2 = strArrSplit[0].substring(iLastIndexOf + 1);
            byte[] bytes = "0.0.0.0".getBytes();
            if (strArrSplit.length != 1) {
                String[] strArrSplit2 = strArrSplit[1].split(":");
                bytes = strArrSplit2[0].getBytes();
                str4 = str;
                z10 = false;
                c11 = (char) Integer.parseInt(strArrSplit2[1]);
            } else {
                str4 = str + "/0.0.0.0:0";
                z10 = false;
            }
            byte[] bArr = bytes;
            agentIsOpen();
            Lock lock2 = f25347r;
            lock2.lock();
            try {
                SpdySession spdySession2 = this.sessionMgr.get(str4 + str2 + i10);
                boolean z11 = this.sessionMgr.size() >= 50 ? true : z10;
                lock2.unlock();
                if (z11) {
                    throw new SpdyErrorException("SPDY_SESSION_EXCEED_MAXED: session count exceed max", TnetStatusCode.TNET_SESSION_EXCEED_MAXED);
                }
                if (spdySession2 != null) {
                    spdySession2.increRefCount();
                    return spdySession2;
                }
                f25348w.lock();
                SpdySession spdySession3 = null;
                try {
                    spdySession = this.sessionMgr.get(str4 + str2 + i10);
                } catch (Throwable unused) {
                    spdySession = null;
                }
                if (spdySession != null) {
                    f25348w.unlock();
                    spdySession.increRefCount();
                    return spdySession;
                }
                try {
                    SpdySession spdySession4 = new SpdySession(0L, this, str4, str2, sessionCb, i10, i11, obj);
                    String str6 = str4;
                    byte[] bytes2 = str3 == null ? null : str3.getBytes();
                    int domainHashIndex = getDomainHashIndex(str2 + i10);
                    if (this.proxyUsername != null && this.proxyPassword != null) {
                        c10 = 1;
                        str5 = str;
                        jCreateSessionN = createSessionN(this.agentNativePtr, spdySession4, domainHashIndex, strSubstring.getBytes(), (char) Integer.parseInt(strSubstring2), bArr, c11, this.proxyUsername.getBytes(), this.proxyPassword.getBytes(), obj, i10, i11, i12, bytes2);
                        i13 = i10;
                    } else {
                        str5 = str;
                        c10 = 1;
                        i13 = i10;
                        jCreateSessionN = createSessionN(this.agentNativePtr, spdySession4, domainHashIndex, strSubstring.getBytes(), (char) Integer.parseInt(strSubstring2), bArr, c11, null, null, obj, i13, i11, i12, bytes2);
                    }
                    spduLog.Logi("tnet-jni", " create new session: " + str5);
                    if ((jCreateSessionN & 1) == 1) {
                        i14 = (int) (jCreateSessionN >> c10);
                        jCreateSessionN = 0;
                    } else {
                        i14 = 0;
                    }
                    if (jCreateSessionN != 0) {
                        spdySession4.setSessionNativePtr(jCreateSessionN);
                        this.sessionMgr.put(str6 + str2 + i13, spdySession4);
                        this.sessionQueue.add(spdySession4);
                        spdySession3 = spdySession4;
                    } else if (i14 != 0) {
                        throw new SpdyErrorException("create session error: " + i14, i14);
                    }
                    f25348w.unlock();
                    return spdySession3;
                } catch (Throwable th) {
                    f25348w.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                f25347r.unlock();
                throw th2;
            }
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM", TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }
}
