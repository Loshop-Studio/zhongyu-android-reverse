package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¨\u0006\u0006"}, m13558d2 = {"excludeFromSystemGesture", "Landroidx/compose/ui/Modifier;", "exclusion", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmName(name = "ExcludeFromSystemGestureKt")
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    @Deprecated(message = "Use systemGestureExclusion", replaceWith = @ReplaceWith(expression = "systemGestureExclusion", imports = {}))
    public static final Modifier excludeFromSystemGesture(Modifier modifier) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    @Deprecated(message = "Use systemGestureExclusion", replaceWith = @ReplaceWith(expression = "systemGestureExclusion", imports = {}))
    public static final Modifier excludeFromSystemGesture(Modifier modifier, Function1<? super LayoutCoordinates, Rect> function1) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, function1);
    }
}
