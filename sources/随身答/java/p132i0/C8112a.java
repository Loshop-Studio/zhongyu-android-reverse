package p132i0;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: i0.a */
/* loaded from: classes3.dex */
public final class C8112a extends AbstractC8123l {
    public C8112a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: a */
    public Class mo12978a() {
        return AssetFileDescriptor.class;
    }

    @Override // p132i0.AbstractC8123l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo12979c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // p132i0.AbstractC8123l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo12980f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
