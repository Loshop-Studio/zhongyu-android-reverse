package androidx.documentfile.provider;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.documentfile.provider.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3881a {
    /* renamed from: a */
    public static /* synthetic */ void m1684a(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            AbstractC3882b.m1685a((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
        } else if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else {
            AbstractC3883c.m1686a(obj);
        }
    }
}
