package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes3.dex */
public class C5360h extends AbstractC5354b {
    public C5360h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: a */
    public Class mo3399a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5354b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo3405c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5354b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo3408f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
