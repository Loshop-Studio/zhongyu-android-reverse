package p007a6;

import android.net.Uri;
import com.blankj.utilcode.util.AbstractC5364g0;
import com.blankj.utilcode.util.AbstractC5366h0;
import com.blankj.utilcode.util.AbstractC5371k;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;

/* renamed from: a6.m */
/* loaded from: classes5.dex */
public abstract class AbstractC0039m {
    /* renamed from: a */
    public static final Uri m96a() {
        File externalCacheDir = AbstractC5366h0.m2478a().getExternalCacheDir();
        String string = UUID.randomUUID().toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        File file = new File(externalCacheDir, AbstractC8687z.m14101I(string, "-", "", false, 4, null) + ".webp");
        AbstractC5371k.m2521c(file);
        Uri uriM2469b = AbstractC5364g0.m2469b(file);
        AbstractC9133u.m16132f(uriM2469b, "let(...)");
        return uriM2469b;
    }
}
