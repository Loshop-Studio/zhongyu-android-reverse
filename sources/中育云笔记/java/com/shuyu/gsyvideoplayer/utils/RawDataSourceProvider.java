package com.shuyu.gsyvideoplayer.utils;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* loaded from: classes5.dex */
public class RawDataSourceProvider implements IMediaDataSource {
    private AssetFileDescriptor mDescriptor;
    private byte[] mMediaBytes;

    public RawDataSourceProvider(AssetFileDescriptor assetFileDescriptor) {
        this.mDescriptor = assetFileDescriptor;
    }

    public static RawDataSourceProvider create(Context context, Uri uri) {
        try {
            return uri.getScheme().equals("assets") ? new RawDataSourceProvider(context.getApplicationContext().getResources().getAssets().openFd(uri.getPathSegments().get(0))) : new RawDataSourceProvider(context.getApplicationContext().getContentResolver().openAssetFileDescriptor(uri, "r"));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private byte[] readBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public void close() throws IOException {
        AssetFileDescriptor assetFileDescriptor = this.mDescriptor;
        if (assetFileDescriptor != null) {
            assetFileDescriptor.close();
        }
        this.mDescriptor = null;
        this.mMediaBytes = null;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public long getSize() {
        long length = this.mDescriptor.getLength();
        if (this.mMediaBytes == null) {
            this.mMediaBytes = readBytes(this.mDescriptor.createInputStream());
        }
        return length;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        long j11 = 1 + j10;
        byte[] bArr2 = this.mMediaBytes;
        if (j11 >= bArr2.length) {
            return -1;
        }
        if (i11 + j10 >= bArr2.length) {
            int length = (int) (bArr2.length - j10);
            if (length > bArr.length) {
                length = bArr.length;
            }
            i11 = length - 1;
        }
        System.arraycopy(bArr2, (int) j10, bArr, i10, i11);
        return i11;
    }
}
