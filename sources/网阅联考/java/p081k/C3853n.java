package p081k;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: k.n */
/* loaded from: classes2.dex */
public class C3853n extends AbstractC3841b {
    public C3853n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: a */
    public Class mo5114a() {
        return InputStream.class;
    }

    @Override // p081k.AbstractC3841b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo5120c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p081k.AbstractC3841b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo5122e(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
