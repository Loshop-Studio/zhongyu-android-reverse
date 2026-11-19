package com.tencent.ijk.media.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.ijk.media.player.annotations.CalledByNative;
import com.tencent.liteav.basic.util.C6592e;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes4.dex */
public final class IjkDownloadCenter {
    private static final int DC_PROP_LONG_DOWNLOAD_SIZE = 1003;
    private static final int DC_PROP_LONG_SIZE = 1002;
    private static final int DC_PROP_LONG_SPEED = 1004;
    private static final int DC_PROP_STRING_URL = 1001;
    private static final int MSG_ERROR = 500;
    private static final int MSG_FINISH = 600;
    private static final int MSG_PROGRESS = 900;
    private static final int MSG_RESUME = 100;
    private static final int MSG_STOP = 300;
    private static final String TAG = "IjkDownloadCenter";
    private static IjkDownloadCenter instance = null;
    private static volatile boolean mIsLibLoaded = false;
    private static final IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: com.tencent.ijk.media.player.IjkDownloadCenter.1
        @Override // com.tencent.ijk.media.player.IjkLibLoader
        public void loadLibrary(String str) {
            C6592e.m5044a(str);
        }
    };
    private EventHandler mEventHandler;
    protected Map<String, String> mHeaders;
    private OnDownloadListener mListener;

    public static class EventHandler extends Handler {
        private final WeakReference<IjkDownloadCenter> mWeakCenter;

        public EventHandler(IjkDownloadCenter ijkDownloadCenter, Looper looper) {
            super(looper);
            this.mWeakCenter = new WeakReference<>(ijkDownloadCenter);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            NativeEvent nativeEvent;
            IjkDownloadMedia ijkDownloadMedia;
            IjkDownloadCenter ijkDownloadCenter = this.mWeakCenter.get();
            if (ijkDownloadCenter == null || ijkDownloadCenter.mListener == null || (ijkDownloadMedia = (nativeEvent = (NativeEvent) message.obj).media) == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 100) {
                ijkDownloadCenter.mListener.downloadBegin(ijkDownloadCenter, ijkDownloadMedia);
                return;
            }
            if (i10 == 300) {
                ijkDownloadCenter.mListener.downloadEnd(ijkDownloadCenter, ijkDownloadMedia);
                return;
            }
            if (i10 == 500) {
                ijkDownloadCenter.mListener.downloadError(ijkDownloadCenter, ijkDownloadMedia, nativeEvent.error, nativeEvent.reason);
            } else if (i10 == 600) {
                ijkDownloadCenter.mListener.downloadFinish(ijkDownloadCenter, ijkDownloadMedia);
            } else {
                if (i10 != 900) {
                    return;
                }
                ijkDownloadCenter.mListener.downloadProgress(ijkDownloadCenter, ijkDownloadMedia);
            }
        }
    }

    public static class NativeEvent {
        int error;
        IjkDownloadMedia media;
        String reason;

        private NativeEvent() {
        }
    }

    public interface OnDownloadListener {
        void downloadBegin(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadEnd(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadError(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, int i10, String str);

        void downloadFinish(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadProgress(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        int hlsKeyVerify(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, String str, byte[] bArr);
    }

    public IjkDownloadCenter(IjkLibLoader ijkLibLoader) {
        loadLibrariesOnce(ijkLibLoader);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.mEventHandler = new EventHandler(this, mainLooper);
        } else {
            this.mEventHandler = null;
        }
        native_download_setup(new WeakReference(this));
    }

    private native int download_get_task_prop_long(int i10, int i11);

    private native String download_get_task_prop_string(int i10, int i11);

    public static IjkDownloadCenter getInstance() {
        if (instance == null) {
            instance = new IjkDownloadCenter();
        }
        return instance;
    }

    @CalledByNative
    private static int hlsVerifyForNative(Object obj, int i10, String str, byte[] bArr) {
        IjkDownloadCenter ijkDownloadCenter;
        if (obj == null || (ijkDownloadCenter = (IjkDownloadCenter) ((WeakReference) obj).get()) == null) {
            return 0;
        }
        return ijkDownloadCenter.mListener.hlsKeyVerify(ijkDownloadCenter, ijkDownloadCenter.convertMedia(i10), str, bArr);
    }

    public static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        synchronized (IjkMediaPlayer.class) {
            try {
                if (!mIsLibLoaded) {
                    if (ijkLibLoader == null) {
                        ijkLibLoader = sLocalLibLoader;
                    }
                    ijkLibLoader.loadLibrary("txffmpeg");
                    ijkLibLoader.loadLibrary("txsdl");
                    ijkLibLoader.loadLibrary("txplayer");
                    mIsLibLoaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void native_download_free();

    private native int native_download_hls_start(String str, String str2, String str3);

    private native void native_download_setup(Object obj);

    private native void native_download_stop(int i10);

    @CalledByNative
    private static void postEventFromNative(Object obj, int i10, int i11, int i12, Object obj2) {
        IjkDownloadCenter ijkDownloadCenter;
        if (obj == null || (ijkDownloadCenter = (IjkDownloadCenter) ((WeakReference) obj).get()) == null || ijkDownloadCenter.mEventHandler == null) {
            return;
        }
        NativeEvent nativeEvent = new NativeEvent();
        nativeEvent.media = ijkDownloadCenter.convertMedia(i11);
        nativeEvent.error = i12;
        if (obj2 != null) {
            nativeEvent.reason = (String) obj2;
        }
        ijkDownloadCenter.mEventHandler.sendMessage(ijkDownloadCenter.mEventHandler.obtainMessage(i10, i11, i12, nativeEvent));
    }

    public IjkDownloadMedia convertMedia(int i10) {
        String strDownload_get_task_prop_string = download_get_task_prop_string(1001, i10);
        if (strDownload_get_task_prop_string == null) {
            return null;
        }
        IjkDownloadMedia ijkDownloadMedia = new IjkDownloadMedia();
        ijkDownloadMedia.size = download_get_task_prop_long(1002, i10);
        ijkDownloadMedia.downloadSize = download_get_task_prop_long(1003, i10);
        ijkDownloadMedia.speed = download_get_task_prop_long(1004, i10);
        ijkDownloadMedia.url = strDownload_get_task_prop_string;
        ijkDownloadMedia.tid = i10;
        return ijkDownloadMedia;
    }

    public int downloadHls(String str, String str2) {
        Map<String, String> map = this.mHeaders;
        String str3 = "";
        if (map != null) {
            for (String str4 : map.keySet()) {
                str3 = str3 == null ? String.format("%s: %s", str4, this.mHeaders.get(str4)) : str3 + "\r\n" + String.format("%s: %s", str4, this.mHeaders.get(str4));
            }
        }
        return native_download_hls_start(str, str2, str3);
    }

    public void finalize() throws Throwable {
        try {
            native_download_free();
        } finally {
            super.finalize();
        }
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public IjkDownloadCenter setListener(OnDownloadListener onDownloadListener) {
        this.mListener = onDownloadListener;
        return this;
    }

    public void stop(int i10) {
        native_download_stop(i10);
    }

    public IjkDownloadCenter() {
        this(sLocalLibLoader);
    }
}
