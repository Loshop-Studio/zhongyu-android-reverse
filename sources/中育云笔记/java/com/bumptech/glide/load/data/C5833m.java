package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
/* loaded from: classes3.dex */
public class C5833m extends AbstractC5822b {
    public C5833m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: a */
    public Class mo4051a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5822b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo4056b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5822b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream mo4058d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
