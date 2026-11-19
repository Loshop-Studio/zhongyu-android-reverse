package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
/* loaded from: classes3.dex */
public class C5414m extends AbstractC5403b {
    public C5414m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: a */
    public Class mo2846a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5403b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo2852c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5403b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public InputStream mo2854e(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
