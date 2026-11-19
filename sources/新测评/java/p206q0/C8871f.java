package p206q0;

import android.content.Context;
import java.io.File;
import p206q0.AbstractC8869d;

/* renamed from: q0.f */
/* loaded from: classes3.dex */
public final class C8871f extends AbstractC8869d {

    /* renamed from: q0.f$a */
    public class a implements AbstractC8869d.a {

        /* renamed from: a */
        public final /* synthetic */ Context f15083a;

        /* renamed from: b */
        public final /* synthetic */ String f15084b;

        public a(Context context, String str) {
            this.f15083a = context;
            this.f15084b = str;
        }

        @Override // p206q0.AbstractC8869d.a
        /* renamed from: a */
        public File mo14874a() {
            File cacheDir = this.f15083a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f15084b != null ? new File(cacheDir, this.f15084b) : cacheDir;
        }
    }

    public C8871f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C8871f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
