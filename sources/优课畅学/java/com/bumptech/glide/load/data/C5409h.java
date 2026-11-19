package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes3.dex */
public class C5409h extends AbstractC5403b {
    public C5409h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: a */
    public Class mo2846a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5403b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo2852c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5403b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo2854e(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
