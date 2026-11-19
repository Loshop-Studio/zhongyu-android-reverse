package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
/* loaded from: classes3.dex */
public class C5365m extends AbstractC5354b {
    public C5365m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: a */
    public Class mo3399a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5354b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo3405c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5354b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo3408f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
