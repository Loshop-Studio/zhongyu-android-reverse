package p204p;

import android.content.Context;
import java.io.File;
import p204p.AbstractC9627d;

/* renamed from: p.f */
/* loaded from: classes3.dex */
public final class C9629f extends AbstractC9627d {

    /* renamed from: p.f$a */
    public class a implements AbstractC9627d.a {

        /* renamed from: a */
        public final /* synthetic */ Context f19256a;

        /* renamed from: b */
        public final /* synthetic */ String f19257b;

        public a(Context context, String str) {
            this.f19256a = context;
            this.f19257b = str;
        }

        @Override // p204p.AbstractC9627d.a
        /* renamed from: a */
        public File mo18176a() {
            File cacheDir = this.f19256a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f19257b != null ? new File(cacheDir, this.f19257b) : cacheDir;
        }
    }

    public C9629f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C9629f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
