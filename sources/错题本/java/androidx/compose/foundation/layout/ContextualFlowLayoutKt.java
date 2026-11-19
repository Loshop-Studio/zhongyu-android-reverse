package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5109d1 = {"\u0000\u0082\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0090\u0001\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0090\u0001\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u001c21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a¯\u0001\u0010,\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130$¢\u0006\u0002\b\u00140#2;\u0010(\u001a7\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0004\b,\u0010-\u001a¯\u0001\u0010.\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130$¢\u0006\u0002\b\u00140#2;\u0010(\u001a7\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0004\b.\u0010/¨\u00060"}, m5110d2 = {"", "itemCount", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "itemVerticalAlignment", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "overflow", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ContextualFlowRow", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lr6/g;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment$Horizontal;", "itemHorizontalAlignment", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "ContextualFlowColumn", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lr6/g;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowState", "", "Lkotlin/Function0;", "overflowComposables", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "getComposable", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "contextualRowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lr6/g;Landroidx/compose/runtime/Composer;I)Lr6/e;", "contextualColumnMeasureHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lr6/g;Landroidx/compose/runtime/Composer;I)Lr6/e;", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,594:1\n1247#2,6:595\n1247#2,6:601\n1247#2,6:607\n1247#2,6:613\n1247#2,6:619\n1247#2,6:625\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n*L\n81#1:595,6\n83#1:601,6\n156#1:607,6\n158#1:613,6\n396#1:619,6\n436#1:625,6\n*E\n"})
/* loaded from: classes.dex */
public final class ContextualFlowLayoutKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(message = "ContextualFlowLayouts are no longer maintained")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextualFlowColumn(final int r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r28, int r29, int r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.ContextualFlowColumnOverflow r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6475g r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.ContextualFlowColumn(int, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.ContextualFlowColumnOverflow, r6.g, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(message = "ContextualFlowLayouts are no longer maintained")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextualFlowRow(final int r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r28, int r29, int r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.ContextualFlowRowOverflow r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6475g r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.ContextualFlowRow(int, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.ContextualFlowRowOverflow, r6.g, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072 A[PHI: r4
      0x0072: PHI (r4v16 int) = (r4v14 int), (r4v17 int) binds: [B:36:0x0070, B:32:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p152r6.InterfaceC6473e contextualColumnMeasureHelper(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.Arrangement.Vertical r21, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.Arrangement.Horizontal r22, @org.jetbrains.annotations.NotNull androidx.compose.ui.Alignment.Horizontal r23, int r24, int r25, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.FlowLayoutOverflowState r26, int r27, @org.jetbrains.annotations.NotNull java.util.List<? extends p152r6.InterfaceC6473e> r28, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6475g r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.contextualColumnMeasureHelper(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, int, java.util.List, r6.g, androidx.compose.runtime.Composer, int):r6.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072 A[PHI: r4
      0x0072: PHI (r4v16 int) = (r4v14 int), (r4v17 int) binds: [B:36:0x0070, B:32:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p152r6.InterfaceC6473e contextualRowMeasurementHelper(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.Arrangement.Horizontal r21, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.Arrangement.Vertical r22, @org.jetbrains.annotations.NotNull androidx.compose.ui.Alignment.Vertical r23, int r24, int r25, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.FlowLayoutOverflowState r26, int r27, @org.jetbrains.annotations.NotNull java.util.List<? extends p152r6.InterfaceC6473e> r28, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6475g r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.contextualRowMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, int, java.util.List, r6.g, androidx.compose.runtime.Composer, int):r6.e");
    }
}
