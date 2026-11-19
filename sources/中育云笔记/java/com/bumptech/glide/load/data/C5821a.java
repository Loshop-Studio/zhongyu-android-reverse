package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.a */
/* loaded from: classes3.dex */
public final class C5821a extends AbstractC5832l {
    public C5821a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: a */
    public Class mo4051a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5832l
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo4052b(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5832l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo4053d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
