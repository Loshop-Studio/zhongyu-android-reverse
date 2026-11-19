package androidx.compose.foundation;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, m7880d2 = {"onFocusedBoundsChanged", "Landroidx/compose/ui/Modifier;", "onPositioned", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class FocusedBoundsKt {
    public static final Modifier onFocusedBoundsChanged(Modifier modifier, Function1<? super LayoutCoordinates, Unit> function1) {
        return modifier.then(new FocusedBoundsObserverElement(function1));
    }
}
