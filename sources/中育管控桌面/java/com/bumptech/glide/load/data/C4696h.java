package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes3.dex */
public class C4696h extends AbstractC4690b {
    public C4696h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: a */
    public Class mo2580a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC4690b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo2586c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC4690b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo2589f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
