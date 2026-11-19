package com.shuyu.gsyvideoplayer.utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* loaded from: classes5.dex */
public class StreamDataSourceProvider implements IMediaDataSource {
    private final BufferedInputStream bufferedInputStream;

    public StreamDataSourceProvider(BufferedInputStream bufferedInputStream) {
        this.bufferedInputStream = bufferedInputStream;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public void close() throws IOException {
        this.bufferedInputStream.close();
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public long getSize() {
        return this.bufferedInputStream.available();
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return this.bufferedInputStream.read(bArr, i10, i11);
    }
}
