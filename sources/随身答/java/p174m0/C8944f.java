package p174m0;

import android.content.Context;
import java.io.File;
import p174m0.AbstractC8942d;

/* renamed from: m0.f */
/* loaded from: classes3.dex */
public final class C8944f extends AbstractC8942d {

    /* renamed from: m0.f$a */
    public class a implements AbstractC8942d.a {

        /* renamed from: a */
        public final /* synthetic */ Context f14987a;

        /* renamed from: b */
        public final /* synthetic */ String f14988b;

        public a(Context context, String str) {
            this.f14987a = context;
            this.f14988b = str;
        }

        @Override // p174m0.AbstractC8942d.a
        /* renamed from: a */
        public File mo14256a() {
            File cacheDir = this.f14987a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f14988b != null ? new File(cacheDir, this.f14988b) : cacheDir;
        }
    }

    public C8944f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C8944f(Context context, String str, long j9) {
        super(new a(context, str), j9);
    }
}
