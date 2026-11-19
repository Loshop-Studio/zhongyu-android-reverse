package androidx.documentfile.provider;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.documentfile.provider.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3754a {
    /* renamed from: a */
    public static /* synthetic */ void m1748a(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            AbstractC3755b.m1749a((ExecutorService) obj);
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
            AbstractC3756c.m1750a(obj);
        }
    }
}
