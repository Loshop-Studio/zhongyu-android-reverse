package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.ERROR, message = "Please use BringIntoViewResponder instead.")
@ExperimentalComposeUiApi
@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, m5175d2 = {"Landroidx/compose/ui/layout/RelocationModifier;", "Landroidx/compose/ui/Modifier$Element;", "computeDestination", "Landroidx/compose/ui/geometry/Rect;", "source", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "performRelocation", "", "destination", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface RelocationModifier extends Modifier.Element {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RelocationModifier relocationModifier, Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return AbstractC1267b.m309a(relocationModifier, predicate);
        }

        @Deprecated
        public static boolean any(RelocationModifier relocationModifier, Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return AbstractC1267b.m310b(relocationModifier, predicate);
        }

        @Deprecated
        public static <R> R foldIn(RelocationModifier relocationModifier, R r3, Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) AbstractC1267b.m311c(relocationModifier, r3, operation);
        }

        @Deprecated
        public static <R> R foldOut(RelocationModifier relocationModifier, R r3, Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) AbstractC1267b.m312d(relocationModifier, r3, operation);
        }

        @Deprecated
        public static Modifier then(RelocationModifier relocationModifier, Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return AbstractC1266a.m307a(relocationModifier, other);
        }
    }

    Rect computeDestination(Rect source, LayoutCoordinates layoutCoordinates);

    Object performRelocation(Rect rect, Rect rect2, Continuation<? super Unit> continuation);
}
