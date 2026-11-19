package androidx.constraintlayout.compose;

import androidx.compose.p013ui.node.Ref;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13558d2 = {"<anonymous>", "", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "invoke", "(Landroidx/constraintlayout/compose/MotionLayoutScope;Landroidx/compose/runtime/Composer;I)V", "androidx/constraintlayout/compose/MotionLayoutKt$MotionLayout$contentDelegate$1"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 176)
@SourceDebugExtension({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt$MotionLayout$contentDelegate$1\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n1#1,166:1\n800#2:167\n*E\n"})
/* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout-T3LJ6Qw$1 */
/* loaded from: classes2.dex */
public final class C3167x96520c53 extends Lambda implements Function3<MotionLayoutScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$changed$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ Function2 $content$inlined;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ InvalidationStrategy $invalidationStrategy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3167x96520c53(MutableState mutableState, InvalidationStrategy invalidationStrategy, Ref ref, Function2 function2, int i10) {
        super(3);
        this.$contentTracker = mutableState;
        this.$invalidationStrategy = invalidationStrategy;
        this.$compositionSource = ref;
        this.$content$inlined = function2;
        this.$$changed$inlined = i10;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer, Integer num) {
        invoke(motionLayoutScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(284503157, i10, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$invalidationStrategy.getOnObservedStateChange() == null && this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        composer.startReplaceGroup(-2075780874);
        this.$content$inlined.invoke(composer, Integer.valueOf((this.$$changed$inlined >> 15) & 14));
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
