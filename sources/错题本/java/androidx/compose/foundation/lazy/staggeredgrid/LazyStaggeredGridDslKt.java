package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.unit.C2331Dp;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;
import p152r6.InterfaceC6476h;

@Metadata(m5109d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0083\u0001\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008f\u0001\u0010&\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u0083\u0001\u0010&\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a'\u0010)\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b)\u0010*\u001aÒ\u0001\u0010-\u001a\u00020\u0015\"\u0004\b\u0000\u0010+*\u00020\u00142\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2%\b\n\u00102\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000201\u0018\u00010\u00132%\b\u0006\u00103\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0006\u0012\u0004\u0018\u0001010\u00132%\b\n\u00105\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000204\u0018\u00010\u001323\b\u0004\u00109\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u001506¢\u0006\u0002\b8¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b-\u0010:\u001a¦\u0002\u0010>\u001a\u00020\u0015\"\u0004\b\u0000\u0010+*\u00020\u00142\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2:\b\n\u00102\u001a4\u0012\u0013\u0012\u00110;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000201\u0018\u0001062:\b\u0006\u00103\u001a4\u0012\u0013\u0012\u00110;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0006\u0012\u0004\u0018\u000101062:\b\n\u00105\u001a4\u0012\u0013\u0012\u00110;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000204\u0018\u0001062H\b\u0004\u00109\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00150=¢\u0006\u0002\b8¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b>\u0010?\u001aÒ\u0001\u0010-\u001a\u00020\u0015\"\u0004\b\u0000\u0010+*\u00020\u00142\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000@2%\b\n\u00102\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000201\u0018\u00010\u00132%\b\u0006\u00103\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0006\u0012\u0004\u0018\u0001010\u00132%\b\n\u00105\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000204\u0018\u00010\u001323\b\u0004\u00109\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u001506¢\u0006\u0002\b8¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b-\u0010A\u001a¦\u0002\u0010>\u001a\u00020\u0015\"\u0004\b\u0000\u0010+*\u00020\u00142\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000@2:\b\n\u00102\u001a4\u0012\u0013\u0012\u00110;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000201\u0018\u0001062:\b\u0006\u00103\u001a4\u0012\u0013\u0012\u00110;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0006\u0012\u0004\u0018\u000101062:\b\n\u00105\u001a4\u0012\u0013\u0012\u00110;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000204\u0018\u0001062H\b\u0004\u00109\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110;¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00150=¢\u0006\u0002\b8¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b>\u0010B\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, m5110d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "content", "LazyVerticalStaggeredGrid-6qCrX9Q", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V", "LazyVerticalStaggeredGrid", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberColumnSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rows", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "horizontalItemSpacing", "LazyHorizontalStaggeredGrid-121YqSk", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V", "LazyHorizontalStaggeredGrid", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", ExifInterface.GPS_DIRECTION_TRUE, "", "items", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V", "", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lr6/e;Lr6/e;Lr6/e;Lr6/h;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lr6/e;Lr6/e;Lr6/e;Lr6/h;)V", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,520:1\n113#2:521\n113#2:522\n113#2:523\n113#2:524\n113#2:525\n113#2:526\n113#2:533\n113#2:534\n113#2:535\n113#2:536\n113#2:537\n113#2:538\n1247#3,6:527\n1247#3,6:539\n1#4:545\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n74#1:521\n76#1:522\n77#1:523\n105#1:524\n107#1:525\n108#1:526\n199#1:533\n201#1:534\n202#1:535\n230#1:536\n232#1:537\n233#1:538\n135#1:527,6\n260#1:539,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10 */
    public static final class C115010 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6475g $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115010(InterfaceC6475g interfaceC6475g, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC6475g;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i8;
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
                ComposerKt.traceEventStart(2101296000, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:480)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items[i], composer, Integer.valueOf(i9 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3 */
    public static final class C11513 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11513(InterfaceC6471c interfaceC6471c, List<? extends T> list) {
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

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5 */
    public static final class C11525 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6475g $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11525(InterfaceC6475g interfaceC6475g, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC6475g;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i8;
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
                ComposerKt.traceEventStart(-886456479, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:408)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items.get(i), composer, Integer.valueOf(i9 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8 */
    public static final class C11548 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11548(InterfaceC6471c interfaceC6471c, T[] tArr) {
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

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10 */
    public static final class C115610 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6476h $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115610(InterfaceC6476h interfaceC6476h, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC6476h;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i8;
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
                ComposerKt.traceEventStart(-804487775, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:516)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf(i9 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3 */
    public static final class C11573 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6473e $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11573(InterfaceC6473e interfaceC6473e, List<? extends T> list) {
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

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "index", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5 */
    public static final class C11585 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6476h $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11585(InterfaceC6476h interfaceC6476h, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC6476h;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i8;
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
                ComposerKt.traceEventStart(284833944, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:444)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i), this.$items.get(i), composer, Integer.valueOf(i9 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8 */
    public static final class C11608 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6473e $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11608(InterfaceC6473e interfaceC6473e, T[] tArr) {
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyHorizontalStaggeredGrid-121YqSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7464LazyHorizontalStaggeredGrid121YqSk(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r31, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r34, boolean r35, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r36, float r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.OverscrollEffect r40, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m7464LazyHorizontalStaggeredGrid121YqSk(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, r6.c, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m7465LazyHorizontalStaggeredGridcJHQLPU(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.p011ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final p152r6.InterfaceC6471c r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m7465LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyVerticalStaggeredGrid-6qCrX9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7466LazyVerticalStaggeredGrid6qCrX9Q(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r31, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r34, boolean r35, float r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.OverscrollEffect r40, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m7466LazyVerticalStaggeredGrid6qCrX9Q(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, r6.c, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m7467LazyVerticalStaggeredGridzadm560(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.p011ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final p152r6.InterfaceC6471c r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m7467LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull List<? extends T> list, @Nullable InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, @NotNull InterfaceC6475g interfaceC6475g) {
        lazyStaggeredGridScope.items(list.size(), interfaceC6471c != null ? new LazyStaggeredGridDslKt$items$2$1(interfaceC6471c, list) : null, new C11513(interfaceC6471c2, list), interfaceC6471c3 != null ? new LazyStaggeredGridDslKt$items$4$1(interfaceC6471c3, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new C11525(interfaceC6475g, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                @Override // p152r6.InterfaceC6471c
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i & 8) != 0) {
            interfaceC6471c3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), interfaceC6471c != null ? new LazyStaggeredGridDslKt$items$2$1(interfaceC6471c, list) : null, new C11513(interfaceC6471c2, list), interfaceC6471c3 != null ? new LazyStaggeredGridDslKt$items$4$1(interfaceC6471c3, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new C11525(interfaceC6475g, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull List<? extends T> list, @Nullable InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6473e interfaceC6473e2, @Nullable InterfaceC6473e interfaceC6473e3, @NotNull InterfaceC6476h interfaceC6476h) {
        lazyStaggeredGridScope.items(list.size(), interfaceC6473e != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(interfaceC6473e, list) : null, new C11573(interfaceC6473e2, list), interfaceC6473e3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(interfaceC6473e3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C11585(interfaceC6476h, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, InterfaceC6473e interfaceC6473e3, InterfaceC6476h interfaceC6476h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = null;
        }
        if ((i & 4) != 0) {
            interfaceC6473e2 = new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
                public final Void invoke(int i8, Object obj2) {
                    return null;
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            interfaceC6473e3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), interfaceC6473e != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(interfaceC6473e, list) : null, new C11573(interfaceC6473e2, list), interfaceC6473e3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(interfaceC6473e3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C11585(interfaceC6476h, list)));
    }

    @Composable
    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
        }
        boolean z8 = ((((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m7468invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m7468invoke0kLqBqw(Density density, long j7) {
                    if (!(Constraints.m13258getMaxWidthimpl(j7) != Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7) - density.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues2, layoutDirection)));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, iM13258getMaxWidthimpl, density.mo6897roundToPx0680j_4(horizontal2.getSpacing()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    horizontal2.arrange(density, iM13258getMaxWidthimpl, iArrCalculateCrossAxisCellSizes, layoutDirection, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    @Composable
    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:259)");
        }
        boolean z8 = ((((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m7469invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m7469invoke0kLqBqw(Density density, long j7) {
                    if (!(Constraints.m13257getMaxHeightimpl(j7) != Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
                    }
                    int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7) - density.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(paddingValues.getBottom() + paddingValues.getTop()));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, iM13257getMaxHeightimpl, density.mo6897roundToPx0680j_4(vertical2.getSpacing()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    vertical2.arrange(density, iM13257getMaxHeightimpl, iArrCalculateCrossAxisCellSizes, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull T[] tArr, @Nullable InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, @NotNull InterfaceC6475g interfaceC6475g) {
        lazyStaggeredGridScope.items(tArr.length, interfaceC6471c != null ? new LazyStaggeredGridDslKt$items$7$1(interfaceC6471c, tArr) : null, new C11548(interfaceC6471c2, tArr), interfaceC6471c3 != null ? new LazyStaggeredGridDslKt$items$9$1(interfaceC6471c3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new C115010(interfaceC6475g, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull T[] tArr, @Nullable InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6473e interfaceC6473e2, @Nullable InterfaceC6473e interfaceC6473e3, @NotNull InterfaceC6476h interfaceC6476h) {
        lazyStaggeredGridScope.items(tArr.length, interfaceC6473e != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(interfaceC6473e, tArr) : null, new C11608(interfaceC6473e2, tArr), interfaceC6473e3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(interfaceC6473e3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C115610(interfaceC6476h, tArr)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                @Override // p152r6.InterfaceC6471c
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i & 8) != 0) {
            interfaceC6471c3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, interfaceC6471c != null ? new LazyStaggeredGridDslKt$items$7$1(interfaceC6471c, objArr) : null, new C11548(interfaceC6471c2, objArr), interfaceC6471c3 != null ? new LazyStaggeredGridDslKt$items$9$1(interfaceC6471c3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new C115010(interfaceC6475g, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, InterfaceC6473e interfaceC6473e3, InterfaceC6476h interfaceC6476h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = null;
        }
        if ((i & 4) != 0) {
            interfaceC6473e2 = new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
                public final Void invoke(int i8, Object obj2) {
                    return null;
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            interfaceC6473e3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, interfaceC6473e != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(interfaceC6473e, objArr) : null, new C11608(interfaceC6473e2, objArr), interfaceC6473e3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(interfaceC6473e3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C115610(interfaceC6476h, objArr)));
    }
}
