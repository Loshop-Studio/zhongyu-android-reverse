package androidx.compose.p013ui.platform;

import android.graphics.Outline;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m13558d2 = {"Landroidx/compose/ui/platform/OutlineVerificationHelper;", "", "()V", "setPath", "", "outline", "Landroid/graphics/Outline;", "path", "Landroidx/compose/ui/graphics/Path;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@RequiresApi(30)
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineVerificationHelper\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,322:1\n36#2,5:323\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineVerificationHelper\n*L\n319#1:323,5\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlineVerificationHelper {
    public static final int $stable = 0;
    public static final OutlineVerificationHelper INSTANCE = new OutlineVerificationHelper();

    private OutlineVerificationHelper() {
    }

    @DoNotInline
    public final void setPath(Outline outline, Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((AndroidPath) path).getInternalPath());
    }
}
