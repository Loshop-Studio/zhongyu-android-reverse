package p081k;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: k.h */
/* loaded from: classes2.dex */
public class C3847h extends AbstractC3841b {
    public C3847h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: a */
    public Class mo5114a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p081k.AbstractC3841b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo5120c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p081k.AbstractC3841b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo5122e(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
