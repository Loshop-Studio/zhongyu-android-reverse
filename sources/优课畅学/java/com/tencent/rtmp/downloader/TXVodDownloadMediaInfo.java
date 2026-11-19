package com.tencent.rtmp.downloader;

import com.tencent.liteav.network.C6643f;

/* loaded from: classes4.dex */
public class TXVodDownloadMediaInfo {
    protected TXVodDownloadDataSource dataSource;
    protected int downloadSize;
    protected int duration;
    protected boolean isStop;
    protected C6643f netApi;
    protected String playPath;
    protected float progress;
    protected int size;
    protected int tid = -1;
    protected String url;

    public TXVodDownloadDataSource getDataSource() {
        return this.dataSource;
    }

    public int getDownloadSize() {
        return this.downloadSize;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getPlayPath() {
        return this.playPath;
    }

    public float getProgress() {
        int i10 = this.size;
        if (i10 > 0) {
            return this.downloadSize / i10;
        }
        return 0.0f;
    }

    public int getSize() {
        return this.size;
    }

    public int getTaskId() {
        return this.tid;
    }

    public String getUrl() {
        return this.url;
    }
}
