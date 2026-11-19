package androidx.compose.runtime;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import p123h7.AbstractC8726f;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8811w;

/* loaded from: classes2.dex */
public final class HotReloaderKt {
    public static final void clearCompositionErrors() {
        HotReloader.Companion.clearErrors$runtime_release();
    }

    @InterfaceC8721a
    public static final List<Pair<Exception, Boolean>> currentCompositionErrors() {
        List<Pair<Throwable, Boolean>> currentCompositionErrors = getCurrentCompositionErrors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = currentCompositionErrors.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Throwable th = (Throwable) pair.m15903a();
            Boolean bool = (Boolean) pair.m15904b();
            bool.booleanValue();
            Exception exc = th instanceof Exception ? (Exception) th : null;
            Pair pairM14230a = exc != null ? AbstractC8726f.m14230a(exc, bool) : null;
            if (pairM14230a != null) {
                arrayList.add(pairM14230a);
            }
        }
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final List<Pair<Throwable, Boolean>> getCurrentCompositionErrors() {
        List<RecomposerErrorInfo> currentErrors$runtime_release = HotReloader.Companion.getCurrentErrors$runtime_release();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(currentErrors$runtime_release, 10));
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(AbstractC8726f.m14230a(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
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
