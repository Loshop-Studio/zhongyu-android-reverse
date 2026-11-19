package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m13558d2 = {"collectIsHoveredAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nHoverInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoverInteraction.kt\nandroidx/compose/foundation/interaction/HoverInteractionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,78:1\n1247#2,6:79\n1247#2,6:85\n*S KotlinDebug\n*F\n+ 1 HoverInteraction.kt\nandroidx/compose/foundation/interaction/HoverInteractionKt\n*L\n65#1:79,6\n66#1:85,6\n*E\n"})
/* loaded from: classes.dex */
public final class HoverInteractionKt {
    @Composable
    public static final State<Boolean> collectIsHoveredAsState(InteractionSource interactionSource, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1206586544, i10, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:63)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        int i11 = i10 & 14;
        boolean z9 = ((i11 ^ 6) > 4 && composer.changed(interactionSource)) || (i10 & 6) == 4;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z9 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new HoverInteractionKt$collectIsHoveredAsState$1$1(interactionSource, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
