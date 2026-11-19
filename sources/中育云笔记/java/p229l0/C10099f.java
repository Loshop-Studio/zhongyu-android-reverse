package p229l0;

import android.content.Context;
import java.io.File;
import p229l0.AbstractC10097d;

/* renamed from: l0.f */
/* loaded from: classes3.dex */
public final class C10099f extends AbstractC10097d {

    /* renamed from: l0.f$a */
    public class a implements AbstractC10097d.a {

        /* renamed from: a */
        public final /* synthetic */ Context f24127a;

        /* renamed from: b */
        public final /* synthetic */ String f24128b;

        public a(Context context, String str) {
            this.f24127a = context;
            this.f24128b = str;
        }

        @Override // p229l0.AbstractC10097d.a
        /* renamed from: a */
        public File mo21112a() {
            File cacheDir = this.f24127a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f24128b != null ? new File(cacheDir, this.f24128b) : cacheDir;
        }
    }

    public C10099f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C10099f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
