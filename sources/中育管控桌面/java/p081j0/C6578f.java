package p081j0;

import android.content.Context;
import java.io.File;
import p081j0.AbstractC6576d;

/* renamed from: j0.f */
/* loaded from: classes3.dex */
public final class C6578f extends AbstractC6576d {

    /* renamed from: j0.f$a */
    public class a implements AbstractC6576d.a {

        /* renamed from: a */
        public final /* synthetic */ Context f8528a;

        /* renamed from: b */
        public final /* synthetic */ String f8529b;

        public a(Context context, String str) {
            this.f8528a = context;
            this.f8529b = str;
        }

        @Override // p081j0.AbstractC6576d.a
        /* renamed from: a */
        public File mo7445a() {
            File cacheDir = this.f8528a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f8529b != null ? new File(cacheDir, this.f8529b) : cacheDir;
        }
    }

    public C6578f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C6578f(Context context, String str, long j6) {
        super(new a(context, str), j6);
    }
}
