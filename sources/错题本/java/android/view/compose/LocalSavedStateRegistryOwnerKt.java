package android.view.compose;

import android.view.SavedStateRegistryOwner;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.play.C5353b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"LocalSavedStateRegistryOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/savedstate/SavedStateRegistryOwner;", "getLocalSavedStateRegistryOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "savedstate-compose_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "LocalSavedStateRegistryOwnerKt")
@SourceDebugExtension({"SMAP\nLocalSavedStateRegistryOwner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSavedStateRegistryOwner.android.kt\nandroidx/savedstate/compose/LocalSavedStateRegistryOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,68:1\n12574#2,2:69\n*S KotlinDebug\n*F\n+ 1 LocalSavedStateRegistryOwner.android.kt\nandroidx/savedstate/compose/LocalSavedStateRegistryOwnerKt\n*L\n51#1:69,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LocalSavedStateRegistryOwnerKt {

    @NotNull
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner;

    static {
        Object objM13956constructorimpl;
        ProvidableCompositionLocal providableCompositionLocal;
        try {
            ClassLoader classLoader = SavedStateRegistryOwner.class.getClassLoader();
            AbstractC5830k.m5327d(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            AbstractC5830k.m5329f(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof ProvidableCompositionLocal) {
                        providableCompositionLocal = (ProvidableCompositionLocal) objInvoke;
                    }
                } else if (annotations[i] instanceof Deprecated) {
                    break;
                } else {
                    i++;
                }
            }
            providableCompositionLocal = null;
            objM13956constructorimpl = Result.m13956constructorimpl(providableCompositionLocal);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        ProvidableCompositionLocal<SavedStateRegistryOwner> providableCompositionLocalStaticCompositionLocalOf = (ProvidableCompositionLocal) (Result.m13961isFailureimpl(objM13956constructorimpl) ? null : objM13956constructorimpl);
        if (providableCompositionLocalStaticCompositionLocalOf == null) {
            providableCompositionLocalStaticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(new C5353b(7));
        }
        LocalSavedStateRegistryOwner = providableCompositionLocalStaticCompositionLocalOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateRegistryOwner LocalSavedStateRegistryOwner$lambda$3$lambda$2() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }

    @NotNull
    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }
}
