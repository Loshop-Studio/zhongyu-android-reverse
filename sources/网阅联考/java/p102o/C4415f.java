package p102o;

import android.content.Context;
import java.io.File;
import p102o.AbstractC4413d;

/* renamed from: o.f */
/* loaded from: classes2.dex */
public final class C4415f extends AbstractC4413d {

    /* renamed from: o.f$a */
    public class a implements AbstractC4413d.a {

        /* renamed from: a */
        public final /* synthetic */ Context f4959a;

        /* renamed from: b */
        public final /* synthetic */ String f4960b;

        public a(Context context, String str) {
            this.f4959a = context;
            this.f4960b = str;
        }

        @Override // p102o.AbstractC4413d.a
        /* renamed from: a */
        public File mo5503a() {
            File cacheDir = this.f4959a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f4960b != null ? new File(cacheDir, this.f4960b) : cacheDir;
        }
    }

    public C4415f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C4415f(Context context, String str, long j4) {
        super(new a(context, str), j4);
    }
}
