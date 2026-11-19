package p208z;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: z.j */
/* loaded from: classes2.dex */
public final class C6805j extends AbstractC6797b {

    /* renamed from: e */
    public final /* synthetic */ int f11480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6805j(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.f11480e = i;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: b */
    public final Class mo22b() {
        switch (this.f11480e) {
            case 0:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p208z.AbstractC6797b
    /* renamed from: g */
    public final void mo6462g(Object obj) throws IOException {
        switch (this.f11480e) {
            case 0:
                ((ParcelFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // p208z.AbstractC6797b
    /* renamed from: i */
    public final Object mo6466i(AssetManager assetManager, String str) {
        switch (this.f11480e) {
            case 0:
                return assetManager.openFd(str).getParcelFileDescriptor();
            default:
                return assetManager.open(str);
        }
    }
}
