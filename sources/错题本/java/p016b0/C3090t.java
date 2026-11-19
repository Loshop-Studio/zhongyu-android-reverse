package p016b0;

import io.reactivex.internal.operators.observable.C5711g;
import java.io.File;
import p039d0.C5401d;
import p039d0.C5402e;
import p039d0.InterfaceC5398a;
import p129o2.C6268a;

/* renamed from: b0.t */
/* loaded from: classes2.dex */
public final class C3090t {

    /* renamed from: a */
    public final C6268a f1495a;

    /* renamed from: b */
    public volatile InterfaceC5398a f1496b;

    public C3090t(C6268a c6268a) {
        this.f1495a = c6268a;
    }

    /* renamed from: a */
    public final InterfaceC5398a m2053a() {
        if (this.f1496b == null) {
            synchronized (this) {
                try {
                    if (this.f1496b == null) {
                        File cacheDir = ((C5402e) this.f1495a.f10022b).f8354b.getCacheDir();
                        C5401d c5401d = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.mkdirs() || (file.exists() && file.isDirectory()))) {
                            c5401d = new C5401d(file);
                        }
                        this.f1496b = c5401d;
                    }
                    if (this.f1496b == null) {
                        this.f1496b = new C5711g(3);
                    }
                } finally {
                }
            }
        }
        return this.f1496b;
    }
}
