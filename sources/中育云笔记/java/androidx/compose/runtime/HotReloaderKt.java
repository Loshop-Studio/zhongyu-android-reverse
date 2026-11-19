package androidx.compose.runtime;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import p309qc.AbstractC10776g;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10980x;

/* loaded from: classes2.dex */
public final class HotReloaderKt {
    public static final void clearCompositionErrors() {
        HotReloader.Companion.clearErrors$runtime_release();
    }

    @InterfaceC10770a
    public static final List<Pair<Exception, Boolean>> currentCompositionErrors() {
        List<Pair<Throwable, Boolean>> currentCompositionErrors = getCurrentCompositionErrors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = currentCompositionErrors.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Throwable th = (Throwable) pair.m20048a();
            Boolean bool = (Boolean) pair.m20049c();
            bool.booleanValue();
            Exception exc = th instanceof Exception ? (Exception) th : null;
            Pair pairM22975a = exc != null ? AbstractC10776g.m22975a(exc, bool) : null;
            if (pairM22975a != null) {
                arrayList.add(pairM22975a);
            }
        }
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final List<Pair<Throwable, Boolean>> getCurrentCompositionErrors() {
        List<RecomposerErrorInfo> currentErrors$runtime_release = HotReloader.Companion.getCurrentErrors$runtime_release();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(currentErrors$runtime_release, 10));
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(AbstractC10776g.m22975a(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    public static final void invalidateGroupsWithKey(int i10) {
        HotReloader.Companion.invalidateGroupsWithKey$runtime_release(i10);
    }

    public static final void simulateHotReload(Object obj) {
        HotReloader.Companion.simulateHotReload$runtime_release(obj);
    }
}
