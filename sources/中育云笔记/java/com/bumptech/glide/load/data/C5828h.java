package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes3.dex */
public class C5828h extends AbstractC5822b {
    public C5828h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: a */
    public Class mo4051a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5822b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo4056b(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5822b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo4058d(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
