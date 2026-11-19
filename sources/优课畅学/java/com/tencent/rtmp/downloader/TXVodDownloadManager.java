package com.tencent.rtmp.downloader;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.ijk.media.player.IjkDownloadCenter;
import com.tencent.ijk.media.player.IjkDownloadMedia;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.network.C6643f;
import com.tencent.liteav.network.C6646i;
import com.tencent.liteav.network.C6647j;
import com.tencent.liteav.network.InterfaceC6644g;
import com.tencent.rtmp.TXPlayerAuthBuilder;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class TXVodDownloadManager {
    public static final int DOWNLOAD_AUTH_FAILED = -5001;
    public static final int DOWNLOAD_DISCONNECT = -5005;
    public static final int DOWNLOAD_FORMAT_ERROR = -5004;
    public static final int DOWNLOAD_HLS_KEY_ERROR = -5006;
    public static final int DOWNLOAD_NO_FILE = -5003;
    public static final int DOWNLOAD_PATH_ERROR = -5007;
    public static final int DOWNLOAD_SUCCESS = 0;
    private static final int IJKDM_EVT_FILE_OPEN_ERROR = 1008;
    private static final int IJKDM_EVT_HLS_KEY_ERROR = 1008;
    private static final int IJKDM_EVT_NET_DISCONNECT = 1001;
    private static final String TAG = "TXVodDownloadManager";
    private static TXVodDownloadManager instance;
    protected IjkDownloadCenter mDownloadCenter;
    IjkDownloadCenter.OnDownloadListener mDownloadCenterListener = new IjkDownloadCenter.OnDownloadListener() { // from class: com.tencent.rtmp.downloader.TXVodDownloadManager.2
        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadBegin(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia) {
            TXVodDownloadMediaInfo tXVodDownloadMediaInfoConvertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (tXVodDownloadMediaInfoConvertMedia != null) {
                TXCLog.m4994i(TXVodDownloadManager.TAG, "downloadBegin " + tXVodDownloadMediaInfoConvertMedia.playPath);
                TXVodDownloadManager.this.mListener.onDownloadStart(tXVodDownloadMediaInfoConvertMedia);
                if (new File(tXVodDownloadMediaInfoConvertMedia.playPath).isFile()) {
                    TXCLog.m4989d(TXVodDownloadManager.TAG, "file state ok");
                } else {
                    TXCLog.m4991e(TXVodDownloadManager.TAG, "file not create!");
                }
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadEnd(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia) {
            TXVodDownloadMediaInfo tXVodDownloadMediaInfoConvertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (tXVodDownloadMediaInfoConvertMedia != null) {
                TXCLog.m4994i(TXVodDownloadManager.TAG, "downloadEnd " + tXVodDownloadMediaInfoConvertMedia.playPath);
                TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfoConvertMedia);
                TXVodDownloadManager.this.mListener.onDownloadStop(tXVodDownloadMediaInfoConvertMedia);
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadError(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, int i10, String str) {
            TXVodDownloadMediaInfo tXVodDownloadMediaInfoConvertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (tXVodDownloadMediaInfoConvertMedia != null) {
                TXCLog.m4991e(TXVodDownloadManager.TAG, "downloadError " + tXVodDownloadMediaInfoConvertMedia.playPath + " " + str);
                TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfoConvertMedia);
                if (tXVodDownloadMediaInfoConvertMedia.isStop) {
                    TXVodDownloadManager.this.mListener.onDownloadStop(tXVodDownloadMediaInfoConvertMedia);
                } else if (i10 == 1008) {
                    TXVodDownloadManager.this.mListener.onDownloadError(tXVodDownloadMediaInfoConvertMedia, TXVodDownloadManager.DOWNLOAD_HLS_KEY_ERROR, str);
                } else {
                    TXVodDownloadManager.this.mListener.onDownloadError(tXVodDownloadMediaInfoConvertMedia, TXVodDownloadManager.DOWNLOAD_DISCONNECT, str);
                }
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadFinish(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia) {
            TXVodDownloadMediaInfo tXVodDownloadMediaInfoConvertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (tXVodDownloadMediaInfoConvertMedia != null) {
                TXCLog.m4994i(TXVodDownloadManager.TAG, "downloadFinish " + tXVodDownloadMediaInfoConvertMedia.playPath);
                TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfoConvertMedia);
                if (new File(tXVodDownloadMediaInfoConvertMedia.playPath).isFile()) {
                    TXVodDownloadManager.this.mListener.onDownloadFinish(tXVodDownloadMediaInfoConvertMedia);
                } else {
                    TXVodDownloadManager.this.mListener.onDownloadError(tXVodDownloadMediaInfoConvertMedia, TXVodDownloadManager.DOWNLOAD_NO_FILE, "The file has been deleted");
                }
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadProgress(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia) {
            TXVodDownloadMediaInfo tXVodDownloadMediaInfoConvertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (tXVodDownloadMediaInfoConvertMedia != null) {
                TXVodDownloadManager.this.mListener.onDownloadProgress(tXVodDownloadMediaInfoConvertMedia);
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public int hlsKeyVerify(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, String str, byte[] bArr) {
            TXVodDownloadMediaInfo tXVodDownloadMediaInfoConvertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (tXVodDownloadMediaInfoConvertMedia != null) {
                return TXVodDownloadManager.this.mListener.hlsKeyVerify(tXVodDownloadMediaInfoConvertMedia, str, bArr);
            }
            return 0;
        }
    };
    protected String mDownloadPath;
    protected Map<String, String> mHeaders;
    protected ITXVodDownloadListener mListener;
    protected ArrayList<TXVodDownloadMediaInfo> mMediaInfoArray;

    private TXVodDownloadManager() {
        IjkDownloadCenter ijkDownloadCenter = IjkDownloadCenter.getInstance();
        this.mDownloadCenter = ijkDownloadCenter;
        ijkDownloadCenter.setListener(this.mDownloadCenterListener);
        this.mMediaInfoArray = new ArrayList<>();
    }

    public static TXVodDownloadManager getInstance() {
        if (instance == null) {
            instance = new TXVodDownloadManager();
        }
        return instance;
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b10 : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e10) {
            TXCLog.m4992e(TAG, "md5 failed.", e10);
            return "";
        }
    }

    public TXVodDownloadMediaInfo convertMedia(IjkDownloadMedia ijkDownloadMedia) {
        Iterator<TXVodDownloadMediaInfo> it = this.mMediaInfoArray.iterator();
        while (it.hasNext()) {
            TXVodDownloadMediaInfo next = it.next();
            if (next.tid == ijkDownloadMedia.tid) {
                next.downloadSize = ijkDownloadMedia.downloadSize;
                if (next.size == 0) {
                    next.size = ijkDownloadMedia.size;
                }
                return next;
            }
        }
        return null;
    }

    public boolean deleteDownloadFile(String str) {
        TXCLog.m4989d(TAG, "delete file " + str);
        Iterator<TXVodDownloadMediaInfo> it = this.mMediaInfoArray.iterator();
        while (it.hasNext()) {
            String str2 = it.next().playPath;
            if (str2 != null && str2.equals(str)) {
                TXCLog.m4991e(TAG, "file is downloading, can not be delete");
                return false;
            }
        }
        new File(str).delete();
        TXCLog.m4991e(TAG, "delete success");
        return true;
    }

    public void downloadMedia(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        String str = tXVodDownloadMediaInfo.url;
        if (str == null) {
            return;
        }
        if (!Uri.parse(str).getPath().endsWith(".m3u8")) {
            TXCLog.m4991e(TAG, "format error: " + str);
            ITXVodDownloadListener iTXVodDownloadListener = this.mListener;
            if (iTXVodDownloadListener != null) {
                iTXVodDownloadListener.onDownloadError(tXVodDownloadMediaInfo, DOWNLOAD_FORMAT_ERROR, "No support format");
                return;
            }
            return;
        }
        String strMakePlayPath = makePlayPath(str);
        tXVodDownloadMediaInfo.playPath = strMakePlayPath;
        if (strMakePlayPath == null) {
            ITXVodDownloadListener iTXVodDownloadListener2 = this.mListener;
            if (iTXVodDownloadListener2 != null) {
                iTXVodDownloadListener2.onDownloadError(tXVodDownloadMediaInfo, DOWNLOAD_PATH_ERROR, "Failed to create local path");
                return;
            }
            return;
        }
        TXVodDownloadDataSource tXVodDownloadDataSource = tXVodDownloadMediaInfo.dataSource;
        if (tXVodDownloadDataSource != null && tXVodDownloadDataSource.token != null) {
            String[] strArrSplit = str.split("/");
            if (strArrSplit.length > 0) {
                int iLastIndexOf = str.lastIndexOf(strArrSplit[strArrSplit.length - 1]);
                str = str.substring(0, iLastIndexOf) + "voddrm.token." + tXVodDownloadMediaInfo.dataSource.token + "." + str.substring(iLastIndexOf);
            }
        }
        TXCLog.m4989d(TAG, "download hls " + str + " to " + tXVodDownloadMediaInfo.playPath);
        int iDownloadHls = this.mDownloadCenter.downloadHls(str, tXVodDownloadMediaInfo.playPath);
        tXVodDownloadMediaInfo.tid = iDownloadHls;
        if (iDownloadHls < 0) {
            TXCLog.m4991e(TAG, "start download failed");
            ITXVodDownloadListener iTXVodDownloadListener3 = this.mListener;
            if (iTXVodDownloadListener3 != null) {
                iTXVodDownloadListener3.onDownloadError(tXVodDownloadMediaInfo, DOWNLOAD_FORMAT_ERROR, "Internal error");
            }
        }
    }

    public C6647j getClassificationSource(C6646i c6646i, int i10) {
        return i10 == 0 ? c6646i.m5298d() : c6646i.m5293a(TXVodDownloadDataSource.qualityToId(i10), "hls");
    }

    public C6647j getTemplateSource(C6646i c6646i, String str) {
        return c6646i.m5295b(str, "hls");
    }

    public String makePlayPath(String str) {
        String str2 = this.mDownloadPath + "/txdownload";
        File file = new File(str2);
        if ((!file.exists() || !file.isDirectory()) && !file.mkdir()) {
            TXCLog.m4991e(TAG, "Failed to create download path" + str2);
            return null;
        }
        if (!Uri.parse(str).getPath().endsWith(".m3u8")) {
            TXCLog.m4991e(TAG, "Unsupported format");
            return null;
        }
        return str2 + "/" + md5(str) + ".m3u8.sqlite";
    }

    public void setDownloadPath(String str) {
        if (str == null) {
            return;
        }
        new File(str).mkdirs();
        this.mDownloadPath = str;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
        this.mDownloadCenter.setHeaders(map);
    }

    public void setListener(ITXVodDownloadListener iTXVodDownloadListener) {
        this.mListener = iTXVodDownloadListener;
    }

    public TXVodDownloadMediaInfo startDownload(final TXVodDownloadDataSource tXVodDownloadDataSource) {
        final TXVodDownloadMediaInfo tXVodDownloadMediaInfo = new TXVodDownloadMediaInfo();
        tXVodDownloadMediaInfo.dataSource = tXVodDownloadDataSource;
        TXPlayerAuthBuilder tXPlayerAuthBuilder = tXVodDownloadDataSource.authBuilder;
        if (tXPlayerAuthBuilder == null) {
            return null;
        }
        C6643f c6643f = new C6643f();
        c6643f.m5292a(tXPlayerAuthBuilder.isHttps());
        c6643f.m5290a(new InterfaceC6644g() { // from class: com.tencent.rtmp.downloader.TXVodDownloadManager.1
            @Override // com.tencent.liteav.network.InterfaceC6644g
            public void onNetFailed(C6643f c6643f2, String str, int i10) {
                TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfo);
                ITXVodDownloadListener iTXVodDownloadListener = TXVodDownloadManager.this.mListener;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadError(tXVodDownloadMediaInfo, TXVodDownloadManager.DOWNLOAD_AUTH_FAILED, str);
                }
            }

            @Override // com.tencent.liteav.network.InterfaceC6644g
            public void onNetSuccess(C6643f c6643f2) {
                C6647j templateSource;
                TXVodDownloadMediaInfo tXVodDownloadMediaInfo2 = tXVodDownloadMediaInfo;
                if (tXVodDownloadMediaInfo2.isStop) {
                    TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfo2);
                    ITXVodDownloadListener iTXVodDownloadListener = TXVodDownloadManager.this.mListener;
                    if (iTXVodDownloadListener != null) {
                        iTXVodDownloadListener.onDownloadStop(tXVodDownloadMediaInfo);
                    }
                    TXCLog.m4998w(TXVodDownloadManager.TAG, "Download task canceled");
                    return;
                }
                C6646i c6646iM5289a = c6643f2.m5289a();
                TXVodDownloadDataSource tXVodDownloadDataSource2 = tXVodDownloadDataSource;
                int i10 = tXVodDownloadDataSource2.quality;
                if (i10 != 1000) {
                    templateSource = TXVodDownloadManager.this.getClassificationSource(c6646iM5289a, i10);
                } else {
                    String str = tXVodDownloadDataSource2.templateName;
                    templateSource = str != null ? TXVodDownloadManager.this.getTemplateSource(c6646iM5289a, str) : null;
                }
                if (templateSource != null) {
                    tXVodDownloadMediaInfo.url = templateSource.m5306b();
                    tXVodDownloadMediaInfo.size = templateSource.m5308d();
                    tXVodDownloadMediaInfo.duration = templateSource.m5307c();
                    TXVodDownloadManager.this.downloadMedia(tXVodDownloadMediaInfo);
                    return;
                }
                TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfo);
                ITXVodDownloadListener iTXVodDownloadListener2 = TXVodDownloadManager.this.mListener;
                if (iTXVodDownloadListener2 != null) {
                    iTXVodDownloadListener2.onDownloadError(tXVodDownloadMediaInfo, TXVodDownloadManager.DOWNLOAD_NO_FILE, "No such resolution");
                }
            }
        });
        if (c6643f.m5288a(tXPlayerAuthBuilder.getAppId(), tXPlayerAuthBuilder.getFileId(), tXPlayerAuthBuilder.getTimeout(), tXPlayerAuthBuilder.getUs(), tXPlayerAuthBuilder.getExper(), tXPlayerAuthBuilder.getSign()) != 0) {
            TXCLog.m4991e(TAG, "unable to getPlayInfo");
            return null;
        }
        tXVodDownloadMediaInfo.netApi = c6643f;
        this.mMediaInfoArray.add(tXVodDownloadMediaInfo);
        return tXVodDownloadMediaInfo;
    }

    public TXVodDownloadMediaInfo startDownloadUrl(String str) {
        TXVodDownloadMediaInfo tXVodDownloadMediaInfo = new TXVodDownloadMediaInfo();
        tXVodDownloadMediaInfo.url = str;
        this.mMediaInfoArray.add(tXVodDownloadMediaInfo);
        downloadMedia(tXVodDownloadMediaInfo);
        return tXVodDownloadMediaInfo;
    }

    public void stopDownload(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        if (tXVodDownloadMediaInfo == null) {
            return;
        }
        tXVodDownloadMediaInfo.isStop = true;
        int i10 = tXVodDownloadMediaInfo.tid;
        if (i10 < 0) {
            TXCLog.m4998w(TAG, "stop download not start task");
            return;
        }
        this.mDownloadCenter.stop(i10);
        TXCLog.m4989d(TAG, "stop download " + tXVodDownloadMediaInfo.url);
    }
}
