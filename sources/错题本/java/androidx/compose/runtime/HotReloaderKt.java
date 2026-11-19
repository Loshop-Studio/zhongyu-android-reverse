package androidx.compose.runtime;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n0\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\n0\tH\u0007¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"", "context", "Ld6/s;", "simulateHotReload", "(Ljava/lang/Object;)V", "", "key", "invalidateGroupsWithKey", "(I)V", "", "Lkotlin/Pair;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "currentCompositionErrors", "()Ljava/util/List;", "", "getCurrentCompositionErrors", "clearCompositionErrors", "()V", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHotReloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1603#2,9:119\n1855#2:128\n1856#2:130\n1612#2:131\n1549#2:132\n1620#2,3:133\n1#3:129\n*S KotlinDebug\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n*L\n97#1:119,9\n97#1:128\n97#1:130\n97#1:131\n112#1:132\n112#1:133,3\n97#1:129\n*E\n"})
/* loaded from: classes.dex */
public final class HotReloaderKt {
    @TestOnly
    public static final void clearCompositionErrors() {
        HotReloader.INSTANCE.clearErrors$runtime_release();
    }

    @Deprecated(message = "currentCompositionErrors only reports errors that extend from Exception. This method is unsupported outside of Compose runtime tests. Internally, getCurrentCompositionErrors should be used instead.")
    @TestOnly
    @NotNull
    public static final List<Pair<Exception, Boolean>> currentCompositionErrors() {
        List<Pair<Throwable, Boolean>> currentCompositionErrors = getCurrentCompositionErrors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = currentCompositionErrors.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Throwable th = (Throwable) pair.component1();
            Boolean bool = (Boolean) pair.component2();
            bool.booleanValue();
            Exception exc = th instanceof Exception ? (Exception) th : null;
            Pair pair2 = exc != null ? new Pair(exc, bool) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        return arrayList;
    }

    @TestOnly
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final List<Pair<Throwable, Boolean>> getCurrentCompositionErrors() {
        List<RecomposerErrorInfo> currentErrors$runtime_release = HotReloader.INSTANCE.getCurrentErrors$runtime_release();
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(currentErrors$runtime_release, 10));
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(new Pair(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    @TestOnly
    public static final void invalidateGroupsWithKey(int i) {
        HotReloader.INSTANCE.invalidateGroupsWithKey$runtime_release(i);
    }

    @TestOnly
    public static final void simulateHotReload(@NotNull Object obj) {
        HotReloader.INSTANCE.simulateHotReload$runtime_release(obj);
    }
}
