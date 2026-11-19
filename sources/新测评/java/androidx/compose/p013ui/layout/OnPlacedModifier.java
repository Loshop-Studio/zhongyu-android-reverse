package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, m13558d2 = {"Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/Modifier$Element;", "onPlaced", "", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public interface OnPlacedModifier extends Modifier.Element {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnPlacedModifier onPlacedModifier, Function1<? super Modifier.Element, Boolean> function1) {
            return OnPlacedModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(OnPlacedModifier onPlacedModifier, Function1<? super Modifier.Element, Boolean> function1) {
            return OnPlacedModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(OnPlacedModifier onPlacedModifier, R r10, Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) OnPlacedModifier.super.foldIn(r10, function2);
        }

        @Deprecated
        public static <R> R foldOut(OnPlacedModifier onPlacedModifier, R r10, Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) OnPlacedModifier.super.foldOut(r10, function2);
        }

        @Deprecated
        public static Modifier then(OnPlacedModifier onPlacedModifier, Modifier modifier) {
            return OnPlacedModifier.super.then(modifier);
        }
    }

    void onPlaced(LayoutCoordinates coordinates);
}
