package com.tencent.ijk.media.player.misc;

/* loaded from: classes4.dex */
public interface IMediaDataSource {
    void close();

    long getSize();

    int readAt(long j10, byte[] bArr, int i10, int i11);
}
