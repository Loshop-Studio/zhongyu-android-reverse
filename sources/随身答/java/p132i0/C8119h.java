package p132i0;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: i0.h */
/* loaded from: classes3.dex */
public class C8119h extends AbstractC8113b {
    public C8119h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: a */
    public Class mo12978a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p132i0.AbstractC8113b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo12984c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p132i0.AbstractC8113b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo12987f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
