package p134p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import coil3.AbstractC3330o;
import coil3.C3351x;
import java.io.File;
import okio.Path;
import p154s.C6538l;

/* renamed from: p.a */
/* loaded from: classes2.dex */
public final class C6357a {

    /* renamed from: a */
    public final /* synthetic */ int f10395a;

    public /* synthetic */ C6357a(int i) {
        this.f10395a = i;
    }

    /* renamed from: a */
    public final C3351x m6025a(Object obj, C6538l c6538l) {
        switch (this.f10395a) {
            case 0:
                return AbstractC3330o.m2273k(((Uri) obj).toString());
            case 1:
                return AbstractC3330o.m2263a(((File) obj).getPath());
            case 2:
                return AbstractC3330o.m2263a(((Path) obj).toString());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = c6538l.f10894a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return AbstractC3330o.m2273k("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return AbstractC3330o.m2273k((String) obj);
        }
    }
}
