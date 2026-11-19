package p132i0;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i0.n */
/* loaded from: classes3.dex */
public class C8125n extends AbstractC8113b {
    public C8125n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: a */
    public Class mo12978a() {
        return InputStream.class;
    }

    @Override // p132i0.AbstractC8113b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo12984c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p132i0.AbstractC8113b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo12987f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
