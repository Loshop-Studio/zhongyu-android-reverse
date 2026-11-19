package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;
import p152r6.InterfaceC6476h;

@Metadata(m5109d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0080\u0001\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u001a\u001a\u008c\u0001\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0080\u0001\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\"\u0010#\u001a-\u0010)\u001a\b\u0012\u0004\u0012\u00020$0(2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b)\u0010*\u001aÝ\u0001\u0010,\u001a\u00020\u0015\"\u0004\b\u0000\u0010+*\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000(2%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001320\b\n\u00105\u001a*\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u000102¢\u0006\u0002\b\u00162%\b\n\u00106\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001323\b\u0004\u00109\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u001502¢\u0006\u0002\b8¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b,\u0010:\u001a±\u0002\u0010=\u001a\u00020\u0015\"\u0004\b\u0000\u0010+*\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000(2:\b\n\u00101\u001a4\u0012\u0013\u0012\u00110$¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u0001022E\b\n\u00105\u001a?\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110$¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u00010<¢\u0006\u0002\b\u00162:\b\u0006\u00106\u001a4\u0012\u0013\u0012\u00110$¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u000100022H\b\u0004\u00109\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110$¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00150<¢\u0006\u0002\b8¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b=\u0010>\u001aÝ\u0001\u0010,\u001a\u00020\u0015\"\u0004\b\u0000\u0010+*\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000?2%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001320\b\n\u00105\u001a*\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u000102¢\u0006\u0002\b\u00162%\b\n\u00106\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001323\b\u0004\u00109\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u001502¢\u0006\u0002\b8¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b,\u0010@\u001a±\u0002\u0010=\u001a\u00020\u0015\"\u0004\b\u0000\u0010+*\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000?2:\b\n\u00101\u001a4\u0012\u0013\u0012\u00110$¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u0001022E\b\n\u00105\u001a?\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110$¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u00010<¢\u0006\u0002\b\u00162:\b\u0006\u00106\u001a4\u0012\u0013\u0012\u00110$¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u000100022H\b\u0004\u00109\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110$¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00150<¢\u0006\u0002\b8¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b=\u0010A¨\u0006B"}, m5110d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "content", "LazyVerticalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V", "rows", "LazyHorizontalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "rememberColumnWidthSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "", "gridSize", "slotCount", "spacing", "", "calculateCellsCrossAxisSizeImpl", "(III)Ljava/util/List;", ExifInterface.GPS_DIRECTION_TRUE, "items", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lr6/c;Lr6/e;Lr6/c;Lr6/g;)V", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lr6/e;Lr6/f;Lr6/e;Lr6/h;)V", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lr6/c;Lr6/e;Lr6/c;Lr6/g;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lr6/e;Lr6/f;Lr6/e;Lr6/h;)V", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,656:1\n113#2:657\n113#2:658\n113#2:659\n113#2:660\n1247#3,6:661\n1247#3,6:667\n1#4:673\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n71#1:657\n103#1:658\n160#1:659\n192#1:660\n222#1:661,6\n249#1:667,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridDslKt {

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10 */
    public static final class C107810 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6475g $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107810(InterfaceC6475g interfaceC6475g, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC6475g;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 48) == 0) {
                i9 |= composer.changed(i) ? 32 : 16;
            }
            if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407562193, i9, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:616)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items[i], composer, Integer.valueOf(i9 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2 */
    public static final class C10792 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC6471c $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10792(InterfaceC6471c interfaceC6471c, List<? extends T> list) {
            super(1);
            this.$key = interfaceC6471c;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$key.invoke(this.$items.get(i));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m5110d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3 */
    public static final class C10803 extends Lambda implements InterfaceC6473e {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC6473e $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10803(InterfaceC6473e interfaceC6473e, List<? extends T> list) {
            super(2);
            this.$span = interfaceC6473e;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m7383boximpl(m7392invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m7392invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i))).getPackedValue();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4 */
    public static final class C10814 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10814(InterfaceC6471c interfaceC6471c, List<? extends T> list) {
            super(1);
            this.$contentType = interfaceC6471c;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(this.$items.get(i));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5 */
    public static final class C10825 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6475g $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10825(InterfaceC6475g interfaceC6475g, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC6475g;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 48) == 0) {
                i9 |= composer.changed(i) ? 32 : 16;
            }
            if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(699646206, i9, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items.get(i), composer, Integer.valueOf(i9 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7 */
    public static final class C10847 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC6471c $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10847(InterfaceC6471c interfaceC6471c, T[] tArr) {
            super(1);
            this.$key = interfaceC6471c;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$key.invoke(this.$items[i]);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m5110d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8 */
    public static final class C10858 extends Lambda implements InterfaceC6473e {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC6473e $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10858(InterfaceC6473e interfaceC6473e, T[] tArr) {
            super(2);
            this.$span = interfaceC6473e;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m7383boximpl(m7393invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m7393invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items[i])).getPackedValue();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9 */
    public static final class C10869 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10869(InterfaceC6471c interfaceC6471c, T[] tArr) {
            super(1);
            this.$contentType = interfaceC6471c;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(this.$items[i]);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10 */
    public static final class C108810 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6476h $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108810(InterfaceC6476h interfaceC6476h, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC6476h;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 48) == 0) {
                i9 |= composer.changed(i) ? 32 : 16;
            }
            if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-911455938, i9, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:653)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf(i9 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2 */
    public static final class C10892 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC6473e $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10892(InterfaceC6473e interfaceC6473e, List<? extends T> list) {
            super(1);
            this.$key = interfaceC6473e;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items.get(i));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m5110d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3 */
    public static final class C10903 extends Lambda implements InterfaceC6473e {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC6474f $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10903(InterfaceC6474f interfaceC6474f, List<? extends T> list) {
            super(2);
            this.$span = interfaceC6474f;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m7383boximpl(m7394invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m7394invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.$items.get(i))).getPackedValue();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4 */
    public static final class C10914 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6473e $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10914(InterfaceC6473e interfaceC6473e, List<? extends T> list) {
            super(1);
            this.$contentType = interfaceC6473e;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items.get(i));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5 */
    public static final class C10925 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6476h $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10925(InterfaceC6476h interfaceC6476h, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC6476h;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 48) == 0) {
                i9 |= composer.changed(i) ? 32 : 16;
            }
            if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1229287273, i9, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:579)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i), this.$items.get(i), composer, Integer.valueOf(i9 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7 */
    public static final class C10947 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC6473e $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10947(InterfaceC6473e interfaceC6473e, T[] tArr) {
            super(1);
            this.$key = interfaceC6473e;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m5110d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8 */
    public static final class C10958 extends Lambda implements InterfaceC6473e {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC6474f $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10958(InterfaceC6474f interfaceC6474f, T[] tArr) {
            super(2);
            this.$span = interfaceC6474f;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m7383boximpl(m7395invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m7395invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.$items[i])).getPackedValue();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9 */
    public static final class C10969 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6473e $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10969(InterfaceC6473e interfaceC6473e, T[] tArr) {
            super(1);
            this.$contentType = interfaceC6473e;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items[i]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyHorizontalGrid(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.grid.GridCells r31, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.grid.LazyGridState r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r34, boolean r35, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.OverscrollEffect r40, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, r6.c, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyVerticalGrid(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.grid.GridCells r31, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.grid.LazyGridState r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r34, boolean r35, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.OverscrollEffect r40, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, r6.c, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i, int i8, int i9) {
        int i10 = i - ((i8 - 1) * i9);
        int i11 = i10 / i8;
        int i12 = i10 % i8;
        ArrayList arrayList = new ArrayList(i8);
        int i13 = 0;
        while (i13 < i8) {
            arrayList.add(Integer.valueOf((i13 < i12 ? 1 : 0) + i11));
            i13++;
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> list, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC6475g interfaceC6475g) {
        lazyGridScope.items(list.size(), interfaceC6471c != null ? new C10792(interfaceC6471c, list) : null, interfaceC6473e != null ? new C10803(interfaceC6473e, list) : null, new C10814(interfaceC6471c2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new C10825(interfaceC6475g, list)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List list, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c2, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            interfaceC6473e = null;
        }
        if ((i & 8) != 0) {
            interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1
                @Override // p152r6.InterfaceC6471c
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(list.size(), interfaceC6471c != null ? new C10792(interfaceC6471c, list) : null, interfaceC6473e != null ? new C10803(interfaceC6473e, list) : null, new C10814(interfaceC6471c2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new C10825(interfaceC6475g, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> list, @Nullable InterfaceC6473e interfaceC6473e, @Nullable InterfaceC6474f interfaceC6474f, @NotNull InterfaceC6473e interfaceC6473e2, @NotNull InterfaceC6476h interfaceC6476h) {
        lazyGridScope.items(list.size(), interfaceC6473e != null ? new C10892(interfaceC6473e, list) : null, interfaceC6474f != null ? new C10903(interfaceC6474f, list) : null, new C10914(interfaceC6473e2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C10925(interfaceC6476h, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List list, InterfaceC6473e interfaceC6473e, InterfaceC6474f interfaceC6474f, InterfaceC6473e interfaceC6473e2, InterfaceC6476h interfaceC6476h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = null;
        }
        if ((i & 4) != 0) {
            interfaceC6474f = null;
        }
        if ((i & 8) != 0) {
            interfaceC6473e2 = new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1
                public final Void invoke(int i8, Object obj2) {
                    return null;
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyGridScope.items(list.size(), interfaceC6473e != null ? new C10892(interfaceC6473e, list) : null, interfaceC6474f != null ? new C10903(interfaceC6474f, list) : null, new C10914(interfaceC6473e2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C10925(interfaceC6476h, list)));
    }

    @Composable
    private static final LazyGridSlotsProvider rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-76500289, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z8 = ((((i & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GridSlotCache(new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m7396invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m7396invoke0kLqBqw(Density density, long j7) {
                    if (Constraints.m13258getMaxWidthimpl(j7) == Integer.MAX_VALUE) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                    }
                    int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
                    GridCells gridCells2 = gridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] iArrM5216C0 = AbstractC5805t.m5216C0(gridCells2.calculateCrossAxisCellSizes(density, iM13258getMaxWidthimpl, density.mo6897roundToPx0680j_4(horizontal2.getSpacing())));
                    int[] iArr = new int[iArrM5216C0.length];
                    horizontal2.arrange(density, iM13258getMaxWidthimpl, iArrM5216C0, LayoutDirection.Ltr, iArr);
                    return new LazyGridSlots(iArrM5216C0, iArr);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    @Composable
    private static final LazyGridSlotsProvider rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-150818144, i, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:248)");
        }
        boolean z8 = ((((i & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GridSlotCache(new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m7397invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m7397invoke0kLqBqw(Density density, long j7) {
                    if (Constraints.m13257getMaxHeightimpl(j7) == Integer.MAX_VALUE) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
                    }
                    int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
                    GridCells gridCells2 = gridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrM5216C0 = AbstractC5805t.m5216C0(gridCells2.calculateCrossAxisCellSizes(density, iM13257getMaxHeightimpl, density.mo6897roundToPx0680j_4(vertical2.getSpacing())));
                    int[] iArr = new int[iArrM5216C0.length];
                    vertical2.arrange(density, iM13257getMaxHeightimpl, iArrM5216C0, iArr);
                    return new LazyGridSlots(iArrM5216C0, iArr);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull T[] tArr, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC6475g interfaceC6475g) {
        lazyGridScope.items(tArr.length, interfaceC6471c != null ? new C10847(interfaceC6471c, tArr) : null, interfaceC6473e != null ? new C10858(interfaceC6473e, tArr) : null, new C10869(interfaceC6471c2, tArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new C107810(interfaceC6475g, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull T[] tArr, @Nullable InterfaceC6473e interfaceC6473e, @Nullable InterfaceC6474f interfaceC6474f, @NotNull InterfaceC6473e interfaceC6473e2, @NotNull InterfaceC6476h interfaceC6476h) {
        lazyGridScope.items(tArr.length, interfaceC6473e != null ? new C10947(interfaceC6473e, tArr) : null, interfaceC6474f != null ? new C10958(interfaceC6474f, tArr) : null, new C10969(interfaceC6473e2, tArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C108810(interfaceC6476h, tArr)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] objArr, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c2, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            interfaceC6473e = null;
        }
        if ((i & 8) != 0) {
            interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6
                @Override // p152r6.InterfaceC6471c
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(objArr.length, interfaceC6471c != null ? new C10847(interfaceC6471c, objArr) : null, interfaceC6473e != null ? new C10858(interfaceC6473e, objArr) : null, new C10869(interfaceC6471c2, objArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new C107810(interfaceC6475g, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] objArr, InterfaceC6473e interfaceC6473e, InterfaceC6474f interfaceC6474f, InterfaceC6473e interfaceC6473e2, InterfaceC6476h interfaceC6476h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = null;
        }
        if ((i & 4) != 0) {
            interfaceC6474f = null;
        }
        if ((i & 8) != 0) {
            interfaceC6473e2 = new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6
                public final Void invoke(int i8, Object obj2) {
                    return null;
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyGridScope.items(objArr.length, interfaceC6473e != null ? new C10947(interfaceC6473e, objArr) : null, interfaceC6474f != null ? new C10958(interfaceC6474f, objArr) : null, new C10969(interfaceC6473e2, objArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C108810(interfaceC6476h, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.p011ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Horizontal r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final p152r6.InterfaceC6471c r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.p011ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final p152r6.InterfaceC6471c r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }
}
