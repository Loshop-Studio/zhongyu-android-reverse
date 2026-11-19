package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
/* loaded from: classes3.dex */
public class C4701m extends AbstractC4690b {
    public C4701m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: a */
    public Class mo2580a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC4690b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo2586c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC4690b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo2589f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
