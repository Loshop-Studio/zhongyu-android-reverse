.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u0083\u0001\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a\u008f\u0001\u0010&\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\"\u001a\u00020!2\u0008\u0008\u0002\u0010#\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008$\u0010%\u001a\u0083\u0001\u0010&\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\"\u001a\u00020!2\u0008\u0008\u0002\u0010#\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(\u001a\'\u0010)\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008)\u0010*\u001a\u00d2\u0001\u0010-\u001a\u00020\u0015\"\u0004\u0008\u0000\u0010+*\u00020\u00142\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000,2%\u0008\n\u00102\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000201\u0018\u00010\u00132%\u0008\u0006\u00103\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0006\u0012\u0004\u0018\u0001010\u00132%\u0008\n\u00105\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000204\u0018\u00010\u001323\u0008\u0004\u00109\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00020\u001506\u00a2\u0006\u0002\u00088\u00a2\u0006\u0002\u0008\u0016H\u0086\u0008\u00a2\u0006\u0004\u0008-\u0010:\u001a\u00a6\u0002\u0010>\u001a\u00020\u0015\"\u0004\u0008\u0000\u0010+*\u00020\u00142\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000,2:\u0008\n\u00102\u001a4\u0012\u0013\u0012\u00110;\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(<\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000201\u0018\u0001062:\u0008\u0006\u00103\u001a4\u0012\u0013\u0012\u00110;\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(<\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0006\u0012\u0004\u0018\u000101062:\u0008\n\u00105\u001a4\u0012\u0013\u0012\u00110;\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(<\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000204\u0018\u0001062H\u0008\u0004\u00109\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110;\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(<\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00020\u00150=\u00a2\u0006\u0002\u00088\u00a2\u0006\u0002\u0008\u0016H\u0086\u0008\u00a2\u0006\u0004\u0008>\u0010?\u001a\u00d2\u0001\u0010-\u001a\u00020\u0015\"\u0004\u0008\u0000\u0010+*\u00020\u00142\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000@2%\u0008\n\u00102\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000201\u0018\u00010\u00132%\u0008\u0006\u00103\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0006\u0012\u0004\u0018\u0001010\u00132%\u0008\n\u00105\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000204\u0018\u00010\u001323\u0008\u0004\u00109\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00020\u001506\u00a2\u0006\u0002\u00088\u00a2\u0006\u0002\u0008\u0016H\u0086\u0008\u00a2\u0006\u0004\u0008-\u0010A\u001a\u00a6\u0002\u0010>\u001a\u00020\u0015\"\u0004\u0008\u0000\u0010+*\u00020\u00142\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000@2:\u0008\n\u00102\u001a4\u0012\u0013\u0012\u00110;\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(<\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000201\u0018\u0001062:\u0008\u0006\u00103\u001a4\u0012\u0013\u0012\u00110;\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(<\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0006\u0012\u0004\u0018\u000101062:\u0008\n\u00105\u001a4\u0012\u0013\u0012\u00110;\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(<\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u000204\u0018\u0001062H\u0008\u0004\u00109\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110;\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(<\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00020\u00150=\u00a2\u0006\u0002\u00088\u00a2\u0006\u0002\u0008\u0016H\u0086\u0008\u00a2\u0006\u0004\u0008>\u0010B\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006C"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;",
        "columns",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
        "state",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "contentPadding",
        "",
        "reverseLayout",
        "Landroidx/compose/ui/unit/Dp;",
        "verticalItemSpacing",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "flingBehavior",
        "userScrollEnabled",
        "Landroidx/compose/foundation/OverscrollEffect;",
        "overscrollEffect",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
        "Ld6/s;",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "LazyVerticalStaggeredGrid-6qCrX9Q",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V",
        "LazyVerticalStaggeredGrid",
        "LazyVerticalStaggeredGrid-zadm560",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
        "rememberColumnSlots",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
        "rows",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "verticalArrangement",
        "horizontalItemSpacing",
        "LazyHorizontalStaggeredGrid-121YqSk",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V",
        "LazyHorizontalStaggeredGrid",
        "LazyHorizontalStaggeredGrid-cJHQLPU",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V",
        "rememberRowSlots",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
        "T",
        "",
        "items",
        "Lkotlin/ParameterName;",
        "name",
        "item",
        "",
        "key",
        "contentType",
        "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;",
        "span",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;",
        "Landroidx/compose/runtime/Composable;",
        "itemContent",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V",
        "",
        "index",
        "Lkotlin/Function3;",
        "itemsIndexed",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lr6/e;Lr6/e;Lr6/e;Lr6/h;)V",
        "",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lr6/e;Lr6/e;Lr6/e;Lr6/h;)V",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,520:1\n113#2:521\n113#2:522\n113#2:523\n113#2:524\n113#2:525\n113#2:526\n113#2:533\n113#2:534\n113#2:535\n113#2:536\n113#2:537\n113#2:538\n1247#3,6:527\n1247#3,6:539\n1#4:545\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n74#1:521\n76#1:522\n77#1:523\n105#1:524\n107#1:525\n108#1:526\n199#1:533\n201#1:534\n202#1:535\n230#1:536\n232#1:537\n233#1:538\n135#1:527,6\n260#1:539,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final LazyHorizontalStaggeredGrid-121YqSk(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V
    .locals 31
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/foundation/OverscrollEffect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "F",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "Lr6/c;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v12, p12

    .line 4
    .line 5
    move/from16 v14, p14

    .line 6
    .line 7
    const v0, -0x27fa9d1c

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p11

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, v14, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v12, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v12, 0x6

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v12

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v12

    .line 39
    :goto_1
    and-int/lit8 v6, v14, 0x2

    .line 40
    .line 41
    if-eqz v6, :cond_4

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v7, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v7, v12, 0x30

    .line 49
    .line 50
    if-nez v7, :cond_3

    .line 51
    .line 52
    move-object/from16 v7, p1

    .line 53
    .line 54
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_5

    .line 59
    .line 60
    const/16 v8, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v8, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v3, v8

    .line 66
    :goto_3
    and-int/lit16 v8, v12, 0x180

    .line 67
    .line 68
    if-nez v8, :cond_8

    .line 69
    .line 70
    and-int/lit8 v8, v14, 0x4

    .line 71
    .line 72
    if-nez v8, :cond_6

    .line 73
    .line 74
    move-object/from16 v8, p2

    .line 75
    .line 76
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v9, :cond_7

    .line 81
    .line 82
    const/16 v9, 0x100

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move-object/from16 v8, p2

    .line 86
    .line 87
    :cond_7
    const/16 v9, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v3, v9

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    move-object/from16 v8, p2

    .line 92
    .line 93
    :goto_5
    and-int/lit8 v9, v14, 0x8

    .line 94
    .line 95
    if-eqz v9, :cond_a

    .line 96
    .line 97
    or-int/lit16 v3, v3, 0xc00

    .line 98
    .line 99
    :cond_9
    move-object/from16 v10, p3

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_a
    and-int/lit16 v10, v12, 0xc00

    .line 103
    .line 104
    if-nez v10, :cond_9

    .line 105
    .line 106
    move-object/from16 v10, p3

    .line 107
    .line 108
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-eqz v11, :cond_b

    .line 113
    .line 114
    const/16 v11, 0x800

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_b
    const/16 v11, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v3, v11

    .line 120
    :goto_7
    and-int/lit8 v11, v14, 0x10

    .line 121
    .line 122
    if-eqz v11, :cond_d

    .line 123
    .line 124
    or-int/lit16 v3, v3, 0x6000

    .line 125
    .line 126
    :cond_c
    move/from16 v13, p4

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_d
    and-int/lit16 v13, v12, 0x6000

    .line 130
    .line 131
    if-nez v13, :cond_c

    .line 132
    .line 133
    move/from16 v13, p4

    .line 134
    .line 135
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    if-eqz v15, :cond_e

    .line 140
    .line 141
    const/16 v15, 0x4000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_e
    const/16 v15, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v3, v15

    .line 147
    :goto_9
    and-int/lit8 v15, v14, 0x20

    .line 148
    .line 149
    const/high16 v16, 0x30000

    .line 150
    .line 151
    if-eqz v15, :cond_f

    .line 152
    .line 153
    or-int v3, v3, v16

    .line 154
    .line 155
    move-object/from16 v5, p5

    .line 156
    .line 157
    goto :goto_b

    .line 158
    :cond_f
    and-int v16, v12, v16

    .line 159
    .line 160
    move-object/from16 v5, p5

    .line 161
    .line 162
    if-nez v16, :cond_11

    .line 163
    .line 164
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v16

    .line 168
    if-eqz v16, :cond_10

    .line 169
    .line 170
    const/high16 v16, 0x20000

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_10
    const/high16 v16, 0x10000

    .line 174
    .line 175
    :goto_a
    or-int v3, v3, v16

    .line 176
    .line 177
    :cond_11
    :goto_b
    and-int/lit8 v16, v14, 0x40

    .line 178
    .line 179
    const/high16 v17, 0x180000

    .line 180
    .line 181
    if-eqz v16, :cond_12

    .line 182
    .line 183
    or-int v3, v3, v17

    .line 184
    .line 185
    move/from16 v0, p6

    .line 186
    .line 187
    goto :goto_d

    .line 188
    :cond_12
    and-int v17, v12, v17

    .line 189
    .line 190
    move/from16 v0, p6

    .line 191
    .line 192
    if-nez v17, :cond_14

    .line 193
    .line 194
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 195
    .line 196
    .line 197
    move-result v18

    .line 198
    if-eqz v18, :cond_13

    .line 199
    .line 200
    const/high16 v18, 0x100000

    .line 201
    .line 202
    goto :goto_c

    .line 203
    :cond_13
    const/high16 v18, 0x80000

    .line 204
    .line 205
    :goto_c
    or-int v3, v3, v18

    .line 206
    .line 207
    :cond_14
    :goto_d
    const/high16 v18, 0xc00000

    .line 208
    .line 209
    and-int v18, v12, v18

    .line 210
    .line 211
    if-nez v18, :cond_17

    .line 212
    .line 213
    and-int/lit16 v4, v14, 0x80

    .line 214
    .line 215
    if-nez v4, :cond_15

    .line 216
    .line 217
    move-object/from16 v4, p7

    .line 218
    .line 219
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v19

    .line 223
    if-eqz v19, :cond_16

    .line 224
    .line 225
    const/high16 v19, 0x800000

    .line 226
    .line 227
    goto :goto_e

    .line 228
    :cond_15
    move-object/from16 v4, p7

    .line 229
    .line 230
    :cond_16
    const/high16 v19, 0x400000

    .line 231
    .line 232
    :goto_e
    or-int v3, v3, v19

    .line 233
    .line 234
    goto :goto_f

    .line 235
    :cond_17
    move-object/from16 v4, p7

    .line 236
    .line 237
    :goto_f
    and-int/lit16 v0, v14, 0x100

    .line 238
    .line 239
    const/high16 v19, 0x6000000

    .line 240
    .line 241
    if-eqz v0, :cond_19

    .line 242
    .line 243
    or-int v3, v3, v19

    .line 244
    .line 245
    :cond_18
    move/from16 v19, v0

    .line 246
    .line 247
    move/from16 v0, p8

    .line 248
    .line 249
    goto :goto_11

    .line 250
    :cond_19
    and-int v19, v12, v19

    .line 251
    .line 252
    if-nez v19, :cond_18

    .line 253
    .line 254
    move/from16 v19, v0

    .line 255
    .line 256
    move/from16 v0, p8

    .line 257
    .line 258
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 259
    .line 260
    .line 261
    move-result v20

    .line 262
    if-eqz v20, :cond_1a

    .line 263
    .line 264
    const/high16 v20, 0x4000000

    .line 265
    .line 266
    goto :goto_10

    .line 267
    :cond_1a
    const/high16 v20, 0x2000000

    .line 268
    .line 269
    :goto_10
    or-int v3, v3, v20

    .line 270
    .line 271
    :goto_11
    const/high16 v20, 0x30000000

    .line 272
    .line 273
    and-int v20, v12, v20

    .line 274
    .line 275
    if-nez v20, :cond_1d

    .line 276
    .line 277
    and-int/lit16 v0, v14, 0x200

    .line 278
    .line 279
    if-nez v0, :cond_1b

    .line 280
    .line 281
    move-object/from16 v0, p9

    .line 282
    .line 283
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v20

    .line 287
    if-eqz v20, :cond_1c

    .line 288
    .line 289
    const/high16 v20, 0x20000000

    .line 290
    .line 291
    goto :goto_12

    .line 292
    :cond_1b
    move-object/from16 v0, p9

    .line 293
    .line 294
    :cond_1c
    const/high16 v20, 0x10000000

    .line 295
    .line 296
    :goto_12
    or-int v3, v3, v20

    .line 297
    .line 298
    goto :goto_13

    .line 299
    :cond_1d
    move-object/from16 v0, p9

    .line 300
    .line 301
    :goto_13
    and-int/lit16 v0, v14, 0x400

    .line 302
    .line 303
    if-eqz v0, :cond_1e

    .line 304
    .line 305
    or-int/lit8 v0, p13, 0x6

    .line 306
    .line 307
    goto :goto_15

    .line 308
    :cond_1e
    and-int/lit8 v0, p13, 0x6

    .line 309
    .line 310
    if-nez v0, :cond_20

    .line 311
    .line 312
    move-object/from16 v0, p10

    .line 313
    .line 314
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v20

    .line 318
    if-eqz v20, :cond_1f

    .line 319
    .line 320
    const/16 v20, 0x4

    .line 321
    .line 322
    goto :goto_14

    .line 323
    :cond_1f
    const/16 v20, 0x2

    .line 324
    .line 325
    :goto_14
    or-int v20, p13, v20

    .line 326
    .line 327
    move/from16 v0, v20

    .line 328
    .line 329
    goto :goto_15

    .line 330
    :cond_20
    move-object/from16 v0, p10

    .line 331
    .line 332
    move/from16 v0, p13

    .line 333
    .line 334
    :goto_15
    const v20, 0x12492493

    .line 335
    .line 336
    .line 337
    and-int v4, v3, v20

    .line 338
    .line 339
    const v5, 0x12492492

    .line 340
    .line 341
    .line 342
    move/from16 p11, v6

    .line 343
    .line 344
    const/4 v6, 0x0

    .line 345
    const/16 v20, 0x1

    .line 346
    .line 347
    if-ne v4, v5, :cond_22

    .line 348
    .line 349
    and-int/lit8 v4, v0, 0x3

    .line 350
    .line 351
    const/4 v5, 0x2

    .line 352
    if-eq v4, v5, :cond_21

    .line 353
    .line 354
    goto :goto_16

    .line 355
    :cond_21
    move v4, v6

    .line 356
    goto :goto_17

    .line 357
    :cond_22
    :goto_16
    move/from16 v4, v20

    .line 358
    .line 359
    :goto_17
    and-int/lit8 v5, v3, 0x1

    .line 360
    .line 361
    invoke-interface {v2, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-eqz v4, :cond_33

    .line 366
    .line 367
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 368
    .line 369
    .line 370
    and-int/lit8 v4, v12, 0x1

    .line 371
    .line 372
    const v18, -0x1c00001

    .line 373
    .line 374
    .line 375
    const v21, -0x70000001

    .line 376
    .line 377
    .line 378
    const/4 v5, 0x3

    .line 379
    if-eqz v4, :cond_27

    .line 380
    .line 381
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    if-eqz v4, :cond_23

    .line 386
    .line 387
    goto :goto_19

    .line 388
    :cond_23
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 389
    .line 390
    .line 391
    and-int/lit8 v4, v14, 0x4

    .line 392
    .line 393
    if-eqz v4, :cond_24

    .line 394
    .line 395
    and-int/lit16 v3, v3, -0x381

    .line 396
    .line 397
    :cond_24
    and-int/lit16 v4, v14, 0x80

    .line 398
    .line 399
    if-eqz v4, :cond_25

    .line 400
    .line 401
    and-int v3, v3, v18

    .line 402
    .line 403
    :cond_25
    and-int/lit16 v4, v14, 0x200

    .line 404
    .line 405
    if-eqz v4, :cond_26

    .line 406
    .line 407
    and-int v3, v3, v21

    .line 408
    .line 409
    :cond_26
    move-object/from16 v9, p5

    .line 410
    .line 411
    move/from16 v24, p6

    .line 412
    .line 413
    move-object/from16 v21, p7

    .line 414
    .line 415
    move/from16 v22, p8

    .line 416
    .line 417
    move-object/from16 v23, p9

    .line 418
    .line 419
    move-object/from16 v18, v7

    .line 420
    .line 421
    move-object v15, v8

    .line 422
    move-object v8, v10

    .line 423
    :goto_18
    move/from16 v20, v13

    .line 424
    .line 425
    goto/16 :goto_22

    .line 426
    .line 427
    :cond_27
    :goto_19
    if-eqz p11, :cond_28

    .line 428
    .line 429
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 430
    .line 431
    goto :goto_1a

    .line 432
    :cond_28
    move-object v4, v7

    .line 433
    :goto_1a
    and-int/lit8 v7, v14, 0x4

    .line 434
    .line 435
    if-eqz v7, :cond_29

    .line 436
    .line 437
    invoke-static {v6, v6, v2, v6, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt;->rememberLazyStaggeredGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 438
    .line 439
    .line 440
    move-result-object v7

    .line 441
    and-int/lit16 v3, v3, -0x381

    .line 442
    .line 443
    goto :goto_1b

    .line 444
    :cond_29
    move-object v7, v8

    .line 445
    :goto_1b
    if-eqz v9, :cond_2a

    .line 446
    .line 447
    int-to-float v8, v6

    .line 448
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    invoke-static {v8}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    goto :goto_1c

    .line 457
    :cond_2a
    move-object v8, v10

    .line 458
    :goto_1c
    if-eqz v11, :cond_2b

    .line 459
    .line 460
    move v13, v6

    .line 461
    :cond_2b
    if-eqz v15, :cond_2c

    .line 462
    .line 463
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 464
    .line 465
    int-to-float v10, v6

    .line 466
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    invoke-virtual {v9, v10}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    goto :goto_1d

    .line 475
    :cond_2c
    move-object/from16 v9, p5

    .line 476
    .line 477
    :goto_1d
    if-eqz v16, :cond_2d

    .line 478
    .line 479
    int-to-float v10, v6

    .line 480
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 481
    .line 482
    .line 483
    move-result v10

    .line 484
    goto :goto_1e

    .line 485
    :cond_2d
    move/from16 v10, p6

    .line 486
    .line 487
    :goto_1e
    and-int/lit16 v11, v14, 0x80

    .line 488
    .line 489
    if-eqz v11, :cond_2e

    .line 490
    .line 491
    sget-object v11, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 492
    .line 493
    const/4 v15, 0x6

    .line 494
    invoke-virtual {v11, v2, v15}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 495
    .line 496
    .line 497
    move-result-object v11

    .line 498
    and-int v3, v3, v18

    .line 499
    .line 500
    goto :goto_1f

    .line 501
    :cond_2e
    move-object/from16 v11, p7

    .line 502
    .line 503
    :goto_1f
    if-eqz v19, :cond_2f

    .line 504
    .line 505
    goto :goto_20

    .line 506
    :cond_2f
    move/from16 v20, p8

    .line 507
    .line 508
    :goto_20
    and-int/lit16 v15, v14, 0x200

    .line 509
    .line 510
    if-eqz v15, :cond_30

    .line 511
    .line 512
    invoke-static {v2, v6}, Landroidx/compose/foundation/OverscrollKt;->rememberOverscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    and-int v3, v3, v21

    .line 517
    .line 518
    move-object/from16 v18, v4

    .line 519
    .line 520
    move-object/from16 v23, v6

    .line 521
    .line 522
    :goto_21
    move-object v15, v7

    .line 523
    move/from16 v24, v10

    .line 524
    .line 525
    move-object/from16 v21, v11

    .line 526
    .line 527
    move/from16 v22, v20

    .line 528
    .line 529
    goto :goto_18

    .line 530
    :cond_30
    move-object/from16 v23, p9

    .line 531
    .line 532
    move-object/from16 v18, v4

    .line 533
    .line 534
    goto :goto_21

    .line 535
    :goto_22
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 536
    .line 537
    .line 538
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 539
    .line 540
    .line 541
    move-result v4

    .line 542
    if-eqz v4, :cond_31

    .line 543
    .line 544
    const-string v4, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:206)"

    .line 545
    .line 546
    const v6, -0x27fa9d1c

    .line 547
    .line 548
    .line 549
    invoke-static {v6, v3, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 550
    .line 551
    .line 552
    :cond_31
    sget-object v16, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 553
    .line 554
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 555
    .line 556
    .line 557
    move-result v25

    .line 558
    and-int/lit8 v4, v3, 0xe

    .line 559
    .line 560
    shr-int/lit8 v6, v3, 0xc

    .line 561
    .line 562
    and-int/lit8 v6, v6, 0x70

    .line 563
    .line 564
    or-int/2addr v4, v6

    .line 565
    shr-int/lit8 v6, v3, 0x3

    .line 566
    .line 567
    and-int/lit16 v7, v6, 0x380

    .line 568
    .line 569
    or-int/2addr v4, v7

    .line 570
    invoke-static {v1, v9, v8, v2, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt;->rememberRowSlots(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 571
    .line 572
    .line 573
    move-result-object v17

    .line 574
    shr-int/lit8 v4, v3, 0x6

    .line 575
    .line 576
    and-int/lit8 v4, v4, 0xe

    .line 577
    .line 578
    or-int/lit8 v4, v4, 0x30

    .line 579
    .line 580
    shl-int/lit8 v7, v3, 0x6

    .line 581
    .line 582
    and-int/lit16 v7, v7, 0x1c00

    .line 583
    .line 584
    or-int/2addr v4, v7

    .line 585
    shl-int/lit8 v7, v3, 0x3

    .line 586
    .line 587
    const v10, 0xe000

    .line 588
    .line 589
    .line 590
    and-int/2addr v10, v7

    .line 591
    or-int/2addr v4, v10

    .line 592
    const/high16 v10, 0x70000

    .line 593
    .line 594
    and-int/2addr v7, v10

    .line 595
    or-int/2addr v4, v7

    .line 596
    const/high16 v7, 0x380000

    .line 597
    .line 598
    and-int/2addr v7, v6

    .line 599
    or-int/2addr v4, v7

    .line 600
    const/high16 v7, 0x1c00000

    .line 601
    .line 602
    and-int/2addr v7, v6

    .line 603
    or-int/2addr v4, v7

    .line 604
    const/high16 v7, 0xe000000

    .line 605
    .line 606
    and-int/2addr v6, v7

    .line 607
    or-int/2addr v4, v6

    .line 608
    shl-int/lit8 v3, v3, 0x9

    .line 609
    .line 610
    const/high16 v6, 0x70000000

    .line 611
    .line 612
    and-int/2addr v3, v6

    .line 613
    or-int v28, v4, v3

    .line 614
    .line 615
    shl-int/2addr v0, v5

    .line 616
    and-int/lit8 v29, v0, 0x70

    .line 617
    .line 618
    const/16 v30, 0x0

    .line 619
    .line 620
    move-object/from16 v26, p10

    .line 621
    .line 622
    move-object/from16 v27, v2

    .line 623
    .line 624
    move-object/from16 v19, v8

    .line 625
    .line 626
    invoke-static/range {v15 .. v30}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt;->LazyStaggeredGrid-w41Enmo(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 627
    .line 628
    .line 629
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    if-eqz v0, :cond_32

    .line 634
    .line 635
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 636
    .line 637
    .line 638
    :cond_32
    move-object v6, v9

    .line 639
    move-object v3, v15

    .line 640
    move-object/from16 v2, v18

    .line 641
    .line 642
    move-object/from16 v4, v19

    .line 643
    .line 644
    move/from16 v5, v20

    .line 645
    .line 646
    move-object/from16 v8, v21

    .line 647
    .line 648
    move/from16 v9, v22

    .line 649
    .line 650
    move-object/from16 v10, v23

    .line 651
    .line 652
    move/from16 v7, v24

    .line 653
    .line 654
    goto :goto_23

    .line 655
    :cond_33
    move-object/from16 v27, v2

    .line 656
    .line 657
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 658
    .line 659
    .line 660
    move-object/from16 v6, p5

    .line 661
    .line 662
    move/from16 v9, p8

    .line 663
    .line 664
    move-object v2, v7

    .line 665
    move-object v3, v8

    .line 666
    move-object v4, v10

    .line 667
    move v5, v13

    .line 668
    move/from16 v7, p6

    .line 669
    .line 670
    move-object/from16 v8, p7

    .line 671
    .line 672
    move-object/from16 v10, p9

    .line 673
    .line 674
    :goto_23
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 675
    .line 676
    .line 677
    move-result-object v15

    .line 678
    if-eqz v15, :cond_34

    .line 679
    .line 680
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1;

    .line 681
    .line 682
    move-object/from16 v11, p10

    .line 683
    .line 684
    move/from16 v13, p13

    .line 685
    .line 686
    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;III)V

    .line 687
    .line 688
    .line 689
    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 690
    .line 691
    .line 692
    :cond_34
    return-void
.end method

.method public static final synthetic LazyHorizontalStaggeredGrid-cJHQLPU(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Use the non deprecated overload"
    .end annotation

    .line 1
    move/from16 v11, p11

    .line 2
    .line 3
    move/from16 v12, p12

    .line 4
    .line 5
    const v0, -0x843bda

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p10

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v12, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v2, v11, 0x6

    .line 19
    .line 20
    move-object/from16 v13, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v11, 0x6

    .line 24
    .line 25
    move-object/from16 v13, p0

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x2

    .line 38
    :goto_0
    or-int/2addr v2, v11

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v2, v11

    .line 41
    :goto_1
    and-int/lit8 v3, v12, 0x2

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    or-int/lit8 v2, v2, 0x30

    .line 46
    .line 47
    :cond_3
    move-object/from16 v4, p1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    and-int/lit8 v4, v11, 0x30

    .line 51
    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    move-object/from16 v4, p1

    .line 55
    .line 56
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    const/16 v5, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_5
    const/16 v5, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v2, v5

    .line 68
    :goto_3
    and-int/lit16 v5, v11, 0x180

    .line 69
    .line 70
    if-nez v5, :cond_8

    .line 71
    .line 72
    and-int/lit8 v5, v12, 0x4

    .line 73
    .line 74
    if-nez v5, :cond_6

    .line 75
    .line 76
    move-object/from16 v5, p2

    .line 77
    .line 78
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_7

    .line 83
    .line 84
    const/16 v6, 0x100

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    move-object/from16 v5, p2

    .line 88
    .line 89
    :cond_7
    const/16 v6, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr v2, v6

    .line 92
    goto :goto_5

    .line 93
    :cond_8
    move-object/from16 v5, p2

    .line 94
    .line 95
    :goto_5
    and-int/lit8 v6, v12, 0x8

    .line 96
    .line 97
    if-eqz v6, :cond_a

    .line 98
    .line 99
    or-int/lit16 v2, v2, 0xc00

    .line 100
    .line 101
    :cond_9
    move-object/from16 v7, p3

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_a
    and-int/lit16 v7, v11, 0xc00

    .line 105
    .line 106
    if-nez v7, :cond_9

    .line 107
    .line 108
    move-object/from16 v7, p3

    .line 109
    .line 110
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-eqz v8, :cond_b

    .line 115
    .line 116
    const/16 v8, 0x800

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_b
    const/16 v8, 0x400

    .line 120
    .line 121
    :goto_6
    or-int/2addr v2, v8

    .line 122
    :goto_7
    and-int/lit8 v8, v12, 0x10

    .line 123
    .line 124
    if-eqz v8, :cond_d

    .line 125
    .line 126
    or-int/lit16 v2, v2, 0x6000

    .line 127
    .line 128
    :cond_c
    move/from16 v9, p4

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_d
    and-int/lit16 v9, v11, 0x6000

    .line 132
    .line 133
    if-nez v9, :cond_c

    .line 134
    .line 135
    move/from16 v9, p4

    .line 136
    .line 137
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_e

    .line 142
    .line 143
    const/16 v10, 0x4000

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_e
    const/16 v10, 0x2000

    .line 147
    .line 148
    :goto_8
    or-int/2addr v2, v10

    .line 149
    :goto_9
    and-int/lit8 v10, v12, 0x20

    .line 150
    .line 151
    const/high16 v14, 0x30000

    .line 152
    .line 153
    if-eqz v10, :cond_10

    .line 154
    .line 155
    or-int/2addr v2, v14

    .line 156
    :cond_f
    move-object/from16 v14, p5

    .line 157
    .line 158
    goto :goto_b

    .line 159
    :cond_10
    and-int/2addr v14, v11

    .line 160
    if-nez v14, :cond_f

    .line 161
    .line 162
    move-object/from16 v14, p5

    .line 163
    .line 164
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v15

    .line 168
    if-eqz v15, :cond_11

    .line 169
    .line 170
    const/high16 v15, 0x20000

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_11
    const/high16 v15, 0x10000

    .line 174
    .line 175
    :goto_a
    or-int/2addr v2, v15

    .line 176
    :goto_b
    and-int/lit8 v15, v12, 0x40

    .line 177
    .line 178
    const/high16 v16, 0x180000

    .line 179
    .line 180
    if-eqz v15, :cond_12

    .line 181
    .line 182
    or-int v2, v2, v16

    .line 183
    .line 184
    move/from16 v0, p6

    .line 185
    .line 186
    goto :goto_d

    .line 187
    :cond_12
    and-int v16, v11, v16

    .line 188
    .line 189
    move/from16 v0, p6

    .line 190
    .line 191
    if-nez v16, :cond_14

    .line 192
    .line 193
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 194
    .line 195
    .line 196
    move-result v17

    .line 197
    if-eqz v17, :cond_13

    .line 198
    .line 199
    const/high16 v17, 0x100000

    .line 200
    .line 201
    goto :goto_c

    .line 202
    :cond_13
    const/high16 v17, 0x80000

    .line 203
    .line 204
    :goto_c
    or-int v2, v2, v17

    .line 205
    .line 206
    :cond_14
    :goto_d
    const/high16 v17, 0xc00000

    .line 207
    .line 208
    and-int v17, v11, v17

    .line 209
    .line 210
    if-nez v17, :cond_17

    .line 211
    .line 212
    and-int/lit16 v0, v12, 0x80

    .line 213
    .line 214
    if-nez v0, :cond_15

    .line 215
    .line 216
    move-object/from16 v0, p7

    .line 217
    .line 218
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v17

    .line 222
    if-eqz v17, :cond_16

    .line 223
    .line 224
    const/high16 v17, 0x800000

    .line 225
    .line 226
    goto :goto_e

    .line 227
    :cond_15
    move-object/from16 v0, p7

    .line 228
    .line 229
    :cond_16
    const/high16 v17, 0x400000

    .line 230
    .line 231
    :goto_e
    or-int v2, v2, v17

    .line 232
    .line 233
    goto :goto_f

    .line 234
    :cond_17
    move-object/from16 v0, p7

    .line 235
    .line 236
    :goto_f
    and-int/lit16 v0, v12, 0x100

    .line 237
    .line 238
    const/high16 v17, 0x6000000

    .line 239
    .line 240
    if-eqz v0, :cond_19

    .line 241
    .line 242
    or-int v2, v2, v17

    .line 243
    .line 244
    :cond_18
    move/from16 v17, v0

    .line 245
    .line 246
    move/from16 v0, p8

    .line 247
    .line 248
    goto :goto_11

    .line 249
    :cond_19
    and-int v17, v11, v17

    .line 250
    .line 251
    if-nez v17, :cond_18

    .line 252
    .line 253
    move/from16 v17, v0

    .line 254
    .line 255
    move/from16 v0, p8

    .line 256
    .line 257
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 258
    .line 259
    .line 260
    move-result v18

    .line 261
    if-eqz v18, :cond_1a

    .line 262
    .line 263
    const/high16 v18, 0x4000000

    .line 264
    .line 265
    goto :goto_10

    .line 266
    :cond_1a
    const/high16 v18, 0x2000000

    .line 267
    .line 268
    :goto_10
    or-int v2, v2, v18

    .line 269
    .line 270
    :goto_11
    and-int/lit16 v0, v12, 0x200

    .line 271
    .line 272
    const/high16 v18, 0x30000000

    .line 273
    .line 274
    if-eqz v0, :cond_1c

    .line 275
    .line 276
    or-int v2, v2, v18

    .line 277
    .line 278
    :cond_1b
    move-object/from16 v0, p9

    .line 279
    .line 280
    goto :goto_13

    .line 281
    :cond_1c
    and-int v0, v11, v18

    .line 282
    .line 283
    if-nez v0, :cond_1b

    .line 284
    .line 285
    move-object/from16 v0, p9

    .line 286
    .line 287
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v18

    .line 291
    if-eqz v18, :cond_1d

    .line 292
    .line 293
    const/high16 v18, 0x20000000

    .line 294
    .line 295
    goto :goto_12

    .line 296
    :cond_1d
    const/high16 v18, 0x10000000

    .line 297
    .line 298
    :goto_12
    or-int v2, v2, v18

    .line 299
    .line 300
    :goto_13
    const v18, 0x12492493

    .line 301
    .line 302
    .line 303
    and-int v0, v2, v18

    .line 304
    .line 305
    move/from16 p10, v3

    .line 306
    .line 307
    const v3, 0x12492492

    .line 308
    .line 309
    .line 310
    const/4 v4, 0x0

    .line 311
    const/16 v18, 0x1

    .line 312
    .line 313
    if-eq v0, v3, :cond_1e

    .line 314
    .line 315
    move/from16 v0, v18

    .line 316
    .line 317
    goto :goto_14

    .line 318
    :cond_1e
    move v0, v4

    .line 319
    :goto_14
    and-int/lit8 v3, v2, 0x1

    .line 320
    .line 321
    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_2d

    .line 326
    .line 327
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 328
    .line 329
    .line 330
    and-int/lit8 v0, v11, 0x1

    .line 331
    .line 332
    const v3, -0x1c00001

    .line 333
    .line 334
    .line 335
    if-eqz v0, :cond_22

    .line 336
    .line 337
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_1f

    .line 342
    .line 343
    goto :goto_15

    .line 344
    :cond_1f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 345
    .line 346
    .line 347
    and-int/lit8 v0, v12, 0x4

    .line 348
    .line 349
    if-eqz v0, :cond_20

    .line 350
    .line 351
    and-int/lit16 v2, v2, -0x381

    .line 352
    .line 353
    :cond_20
    and-int/lit16 v0, v12, 0x80

    .line 354
    .line 355
    if-eqz v0, :cond_21

    .line 356
    .line 357
    and-int/2addr v2, v3

    .line 358
    :cond_21
    move/from16 v19, p6

    .line 359
    .line 360
    move-object/from16 v20, p7

    .line 361
    .line 362
    move/from16 v21, p8

    .line 363
    .line 364
    move-object v15, v5

    .line 365
    move-object/from16 v16, v7

    .line 366
    .line 367
    move/from16 v17, v9

    .line 368
    .line 369
    move-object/from16 v18, v14

    .line 370
    .line 371
    const v0, -0x843bda

    .line 372
    .line 373
    .line 374
    move-object/from16 v14, p1

    .line 375
    .line 376
    goto/16 :goto_1b

    .line 377
    .line 378
    :cond_22
    :goto_15
    if-eqz p10, :cond_23

    .line 379
    .line 380
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 381
    .line 382
    goto :goto_16

    .line 383
    :cond_23
    move-object/from16 v0, p1

    .line 384
    .line 385
    :goto_16
    and-int/lit8 v19, v12, 0x4

    .line 386
    .line 387
    if-eqz v19, :cond_24

    .line 388
    .line 389
    const/4 v5, 0x3

    .line 390
    invoke-static {v4, v4, v1, v4, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt;->rememberLazyStaggeredGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    and-int/lit16 v2, v2, -0x381

    .line 395
    .line 396
    :cond_24
    if-eqz v6, :cond_25

    .line 397
    .line 398
    int-to-float v6, v4

    .line 399
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    invoke-static {v6}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    goto :goto_17

    .line 408
    :cond_25
    move-object v6, v7

    .line 409
    :goto_17
    if-eqz v8, :cond_26

    .line 410
    .line 411
    move v9, v4

    .line 412
    :cond_26
    if-eqz v10, :cond_27

    .line 413
    .line 414
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 415
    .line 416
    int-to-float v8, v4

    .line 417
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 418
    .line 419
    .line 420
    move-result v8

    .line 421
    invoke-virtual {v7, v8}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 422
    .line 423
    .line 424
    move-result-object v7

    .line 425
    goto :goto_18

    .line 426
    :cond_27
    move-object v7, v14

    .line 427
    :goto_18
    if-eqz v15, :cond_28

    .line 428
    .line 429
    int-to-float v8, v4

    .line 430
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 431
    .line 432
    .line 433
    move-result v8

    .line 434
    goto :goto_19

    .line 435
    :cond_28
    move/from16 v8, p6

    .line 436
    .line 437
    :goto_19
    and-int/lit16 v10, v12, 0x80

    .line 438
    .line 439
    if-eqz v10, :cond_29

    .line 440
    .line 441
    sget-object v10, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 442
    .line 443
    const/4 v14, 0x6

    .line 444
    invoke-virtual {v10, v1, v14}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    and-int/2addr v2, v3

    .line 449
    goto :goto_1a

    .line 450
    :cond_29
    move-object/from16 v10, p7

    .line 451
    .line 452
    :goto_1a
    if-eqz v17, :cond_2a

    .line 453
    .line 454
    move-object v14, v0

    .line 455
    move-object v15, v5

    .line 456
    move-object/from16 v16, v6

    .line 457
    .line 458
    move/from16 v19, v8

    .line 459
    .line 460
    move/from16 v17, v9

    .line 461
    .line 462
    move-object/from16 v20, v10

    .line 463
    .line 464
    move/from16 v21, v18

    .line 465
    .line 466
    const v0, -0x843bda

    .line 467
    .line 468
    .line 469
    move-object/from16 v18, v7

    .line 470
    .line 471
    goto :goto_1b

    .line 472
    :cond_2a
    move/from16 v21, p8

    .line 473
    .line 474
    move-object v14, v0

    .line 475
    move-object v15, v5

    .line 476
    move-object/from16 v16, v6

    .line 477
    .line 478
    move-object/from16 v18, v7

    .line 479
    .line 480
    move/from16 v19, v8

    .line 481
    .line 482
    move/from16 v17, v9

    .line 483
    .line 484
    move-object/from16 v20, v10

    .line 485
    .line 486
    const v0, -0x843bda

    .line 487
    .line 488
    .line 489
    :goto_1b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 490
    .line 491
    .line 492
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    if-eqz v3, :cond_2b

    .line 497
    .line 498
    const/4 v3, -0x1

    .line 499
    const-string v5, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:236)"

    .line 500
    .line 501
    invoke-static {v0, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 502
    .line 503
    .line 504
    :cond_2b
    invoke-static {v1, v4}, Landroidx/compose/foundation/OverscrollKt;->rememberOverscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    .line 505
    .line 506
    .line 507
    move-result-object v22

    .line 508
    const v0, 0xffffffe

    .line 509
    .line 510
    .line 511
    and-int v25, v2, v0

    .line 512
    .line 513
    shr-int/lit8 v0, v2, 0x1b

    .line 514
    .line 515
    and-int/lit8 v26, v0, 0xe

    .line 516
    .line 517
    const/16 v27, 0x0

    .line 518
    .line 519
    move-object/from16 v23, p9

    .line 520
    .line 521
    move-object/from16 v24, v1

    .line 522
    .line 523
    invoke-static/range {v13 .. v27}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt;->LazyHorizontalStaggeredGrid-121YqSk(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 524
    .line 525
    .line 526
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-eqz v0, :cond_2c

    .line 531
    .line 532
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 533
    .line 534
    .line 535
    :cond_2c
    move-object v2, v14

    .line 536
    move-object v3, v15

    .line 537
    move-object/from16 v4, v16

    .line 538
    .line 539
    move/from16 v5, v17

    .line 540
    .line 541
    move-object/from16 v6, v18

    .line 542
    .line 543
    move/from16 v7, v19

    .line 544
    .line 545
    move-object/from16 v8, v20

    .line 546
    .line 547
    move/from16 v9, v21

    .line 548
    .line 549
    goto :goto_1c

    .line 550
    :cond_2d
    move-object/from16 v24, v1

    .line 551
    .line 552
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 553
    .line 554
    .line 555
    move-object/from16 v2, p1

    .line 556
    .line 557
    move-object/from16 v8, p7

    .line 558
    .line 559
    move-object v3, v5

    .line 560
    move-object v4, v7

    .line 561
    move v5, v9

    .line 562
    move-object v6, v14

    .line 563
    move/from16 v7, p6

    .line 564
    .line 565
    move/from16 v9, p8

    .line 566
    .line 567
    :goto_1c
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 568
    .line 569
    .line 570
    move-result-object v13

    .line 571
    if-eqz v13, :cond_2e

    .line 572
    .line 573
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$2;

    .line 574
    .line 575
    move-object/from16 v1, p0

    .line 576
    .line 577
    move-object/from16 v10, p9

    .line 578
    .line 579
    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$2;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;II)V

    .line 580
    .line 581
    .line 582
    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 583
    .line 584
    .line 585
    :cond_2e
    return-void
.end method

.method public static final LazyVerticalStaggeredGrid-6qCrX9Q(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V
    .locals 31
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/foundation/OverscrollEffect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZF",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "Lr6/c;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v12, p12

    .line 4
    .line 5
    move/from16 v14, p14

    .line 6
    .line 7
    const v0, -0x2281ca08

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p11

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, v14, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v12, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v12, 0x6

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v12

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v12

    .line 39
    :goto_1
    and-int/lit8 v6, v14, 0x2

    .line 40
    .line 41
    if-eqz v6, :cond_4

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v7, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v7, v12, 0x30

    .line 49
    .line 50
    if-nez v7, :cond_3

    .line 51
    .line 52
    move-object/from16 v7, p1

    .line 53
    .line 54
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_5

    .line 59
    .line 60
    const/16 v8, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v8, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v3, v8

    .line 66
    :goto_3
    and-int/lit16 v8, v12, 0x180

    .line 67
    .line 68
    if-nez v8, :cond_8

    .line 69
    .line 70
    and-int/lit8 v8, v14, 0x4

    .line 71
    .line 72
    if-nez v8, :cond_6

    .line 73
    .line 74
    move-object/from16 v8, p2

    .line 75
    .line 76
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v9, :cond_7

    .line 81
    .line 82
    const/16 v9, 0x100

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move-object/from16 v8, p2

    .line 86
    .line 87
    :cond_7
    const/16 v9, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v3, v9

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    move-object/from16 v8, p2

    .line 92
    .line 93
    :goto_5
    and-int/lit8 v9, v14, 0x8

    .line 94
    .line 95
    if-eqz v9, :cond_a

    .line 96
    .line 97
    or-int/lit16 v3, v3, 0xc00

    .line 98
    .line 99
    :cond_9
    move-object/from16 v10, p3

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_a
    and-int/lit16 v10, v12, 0xc00

    .line 103
    .line 104
    if-nez v10, :cond_9

    .line 105
    .line 106
    move-object/from16 v10, p3

    .line 107
    .line 108
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-eqz v11, :cond_b

    .line 113
    .line 114
    const/16 v11, 0x800

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_b
    const/16 v11, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v3, v11

    .line 120
    :goto_7
    and-int/lit8 v11, v14, 0x10

    .line 121
    .line 122
    if-eqz v11, :cond_d

    .line 123
    .line 124
    or-int/lit16 v3, v3, 0x6000

    .line 125
    .line 126
    :cond_c
    move/from16 v13, p4

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_d
    and-int/lit16 v13, v12, 0x6000

    .line 130
    .line 131
    if-nez v13, :cond_c

    .line 132
    .line 133
    move/from16 v13, p4

    .line 134
    .line 135
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    if-eqz v15, :cond_e

    .line 140
    .line 141
    const/16 v15, 0x4000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_e
    const/16 v15, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v3, v15

    .line 147
    :goto_9
    and-int/lit8 v15, v14, 0x20

    .line 148
    .line 149
    const/high16 v16, 0x30000

    .line 150
    .line 151
    if-eqz v15, :cond_f

    .line 152
    .line 153
    or-int v3, v3, v16

    .line 154
    .line 155
    move/from16 v5, p5

    .line 156
    .line 157
    goto :goto_b

    .line 158
    :cond_f
    and-int v16, v12, v16

    .line 159
    .line 160
    move/from16 v5, p5

    .line 161
    .line 162
    if-nez v16, :cond_11

    .line 163
    .line 164
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 165
    .line 166
    .line 167
    move-result v16

    .line 168
    if-eqz v16, :cond_10

    .line 169
    .line 170
    const/high16 v16, 0x20000

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_10
    const/high16 v16, 0x10000

    .line 174
    .line 175
    :goto_a
    or-int v3, v3, v16

    .line 176
    .line 177
    :cond_11
    :goto_b
    and-int/lit8 v16, v14, 0x40

    .line 178
    .line 179
    const/high16 v17, 0x180000

    .line 180
    .line 181
    if-eqz v16, :cond_12

    .line 182
    .line 183
    or-int v3, v3, v17

    .line 184
    .line 185
    move-object/from16 v0, p6

    .line 186
    .line 187
    goto :goto_d

    .line 188
    :cond_12
    and-int v17, v12, v17

    .line 189
    .line 190
    move-object/from16 v0, p6

    .line 191
    .line 192
    if-nez v17, :cond_14

    .line 193
    .line 194
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v18

    .line 198
    if-eqz v18, :cond_13

    .line 199
    .line 200
    const/high16 v18, 0x100000

    .line 201
    .line 202
    goto :goto_c

    .line 203
    :cond_13
    const/high16 v18, 0x80000

    .line 204
    .line 205
    :goto_c
    or-int v3, v3, v18

    .line 206
    .line 207
    :cond_14
    :goto_d
    const/high16 v18, 0xc00000

    .line 208
    .line 209
    and-int v18, v12, v18

    .line 210
    .line 211
    if-nez v18, :cond_17

    .line 212
    .line 213
    and-int/lit16 v4, v14, 0x80

    .line 214
    .line 215
    if-nez v4, :cond_15

    .line 216
    .line 217
    move-object/from16 v4, p7

    .line 218
    .line 219
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v19

    .line 223
    if-eqz v19, :cond_16

    .line 224
    .line 225
    const/high16 v19, 0x800000

    .line 226
    .line 227
    goto :goto_e

    .line 228
    :cond_15
    move-object/from16 v4, p7

    .line 229
    .line 230
    :cond_16
    const/high16 v19, 0x400000

    .line 231
    .line 232
    :goto_e
    or-int v3, v3, v19

    .line 233
    .line 234
    goto :goto_f

    .line 235
    :cond_17
    move-object/from16 v4, p7

    .line 236
    .line 237
    :goto_f
    and-int/lit16 v0, v14, 0x100

    .line 238
    .line 239
    const/high16 v19, 0x6000000

    .line 240
    .line 241
    if-eqz v0, :cond_19

    .line 242
    .line 243
    or-int v3, v3, v19

    .line 244
    .line 245
    :cond_18
    move/from16 v19, v0

    .line 246
    .line 247
    move/from16 v0, p8

    .line 248
    .line 249
    goto :goto_11

    .line 250
    :cond_19
    and-int v19, v12, v19

    .line 251
    .line 252
    if-nez v19, :cond_18

    .line 253
    .line 254
    move/from16 v19, v0

    .line 255
    .line 256
    move/from16 v0, p8

    .line 257
    .line 258
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 259
    .line 260
    .line 261
    move-result v20

    .line 262
    if-eqz v20, :cond_1a

    .line 263
    .line 264
    const/high16 v20, 0x4000000

    .line 265
    .line 266
    goto :goto_10

    .line 267
    :cond_1a
    const/high16 v20, 0x2000000

    .line 268
    .line 269
    :goto_10
    or-int v3, v3, v20

    .line 270
    .line 271
    :goto_11
    const/high16 v20, 0x30000000

    .line 272
    .line 273
    and-int v20, v12, v20

    .line 274
    .line 275
    if-nez v20, :cond_1d

    .line 276
    .line 277
    and-int/lit16 v0, v14, 0x200

    .line 278
    .line 279
    if-nez v0, :cond_1b

    .line 280
    .line 281
    move-object/from16 v0, p9

    .line 282
    .line 283
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v20

    .line 287
    if-eqz v20, :cond_1c

    .line 288
    .line 289
    const/high16 v20, 0x20000000

    .line 290
    .line 291
    goto :goto_12

    .line 292
    :cond_1b
    move-object/from16 v0, p9

    .line 293
    .line 294
    :cond_1c
    const/high16 v20, 0x10000000

    .line 295
    .line 296
    :goto_12
    or-int v3, v3, v20

    .line 297
    .line 298
    goto :goto_13

    .line 299
    :cond_1d
    move-object/from16 v0, p9

    .line 300
    .line 301
    :goto_13
    and-int/lit16 v0, v14, 0x400

    .line 302
    .line 303
    if-eqz v0, :cond_1e

    .line 304
    .line 305
    or-int/lit8 v0, p13, 0x6

    .line 306
    .line 307
    goto :goto_15

    .line 308
    :cond_1e
    and-int/lit8 v0, p13, 0x6

    .line 309
    .line 310
    if-nez v0, :cond_20

    .line 311
    .line 312
    move-object/from16 v0, p10

    .line 313
    .line 314
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v20

    .line 318
    if-eqz v20, :cond_1f

    .line 319
    .line 320
    const/16 v20, 0x4

    .line 321
    .line 322
    goto :goto_14

    .line 323
    :cond_1f
    const/16 v20, 0x2

    .line 324
    .line 325
    :goto_14
    or-int v20, p13, v20

    .line 326
    .line 327
    move/from16 v0, v20

    .line 328
    .line 329
    goto :goto_15

    .line 330
    :cond_20
    move-object/from16 v0, p10

    .line 331
    .line 332
    move/from16 v0, p13

    .line 333
    .line 334
    :goto_15
    const v20, 0x12492493

    .line 335
    .line 336
    .line 337
    and-int v4, v3, v20

    .line 338
    .line 339
    const v5, 0x12492492

    .line 340
    .line 341
    .line 342
    move/from16 p11, v6

    .line 343
    .line 344
    const/4 v6, 0x0

    .line 345
    const/16 v20, 0x1

    .line 346
    .line 347
    if-ne v4, v5, :cond_22

    .line 348
    .line 349
    and-int/lit8 v4, v0, 0x3

    .line 350
    .line 351
    const/4 v5, 0x2

    .line 352
    if-eq v4, v5, :cond_21

    .line 353
    .line 354
    goto :goto_16

    .line 355
    :cond_21
    move v4, v6

    .line 356
    goto :goto_17

    .line 357
    :cond_22
    :goto_16
    move/from16 v4, v20

    .line 358
    .line 359
    :goto_17
    and-int/lit8 v5, v3, 0x1

    .line 360
    .line 361
    invoke-interface {v2, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-eqz v4, :cond_33

    .line 366
    .line 367
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 368
    .line 369
    .line 370
    and-int/lit8 v4, v12, 0x1

    .line 371
    .line 372
    const v18, -0x1c00001

    .line 373
    .line 374
    .line 375
    const v21, -0x70000001

    .line 376
    .line 377
    .line 378
    const/4 v5, 0x3

    .line 379
    if-eqz v4, :cond_27

    .line 380
    .line 381
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    if-eqz v4, :cond_23

    .line 386
    .line 387
    goto :goto_18

    .line 388
    :cond_23
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 389
    .line 390
    .line 391
    and-int/lit8 v4, v14, 0x4

    .line 392
    .line 393
    if-eqz v4, :cond_24

    .line 394
    .line 395
    and-int/lit16 v3, v3, -0x381

    .line 396
    .line 397
    :cond_24
    and-int/lit16 v4, v14, 0x80

    .line 398
    .line 399
    if-eqz v4, :cond_25

    .line 400
    .line 401
    and-int v3, v3, v18

    .line 402
    .line 403
    :cond_25
    and-int/lit16 v4, v14, 0x200

    .line 404
    .line 405
    if-eqz v4, :cond_26

    .line 406
    .line 407
    and-int v3, v3, v21

    .line 408
    .line 409
    :cond_26
    move/from16 v24, p5

    .line 410
    .line 411
    move-object/from16 v21, p7

    .line 412
    .line 413
    move/from16 v22, p8

    .line 414
    .line 415
    move-object/from16 v23, p9

    .line 416
    .line 417
    move-object/from16 v18, v7

    .line 418
    .line 419
    move-object v15, v8

    .line 420
    move-object v8, v10

    .line 421
    move/from16 v20, v13

    .line 422
    .line 423
    move-object/from16 v10, p6

    .line 424
    .line 425
    goto/16 :goto_21

    .line 426
    .line 427
    :cond_27
    :goto_18
    if-eqz p11, :cond_28

    .line 428
    .line 429
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 430
    .line 431
    goto :goto_19

    .line 432
    :cond_28
    move-object v4, v7

    .line 433
    :goto_19
    and-int/lit8 v7, v14, 0x4

    .line 434
    .line 435
    if-eqz v7, :cond_29

    .line 436
    .line 437
    invoke-static {v6, v6, v2, v6, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt;->rememberLazyStaggeredGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 438
    .line 439
    .line 440
    move-result-object v7

    .line 441
    and-int/lit16 v3, v3, -0x381

    .line 442
    .line 443
    goto :goto_1a

    .line 444
    :cond_29
    move-object v7, v8

    .line 445
    :goto_1a
    if-eqz v9, :cond_2a

    .line 446
    .line 447
    int-to-float v8, v6

    .line 448
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    invoke-static {v8}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    goto :goto_1b

    .line 457
    :cond_2a
    move-object v8, v10

    .line 458
    :goto_1b
    if-eqz v11, :cond_2b

    .line 459
    .line 460
    move v13, v6

    .line 461
    :cond_2b
    if-eqz v15, :cond_2c

    .line 462
    .line 463
    int-to-float v9, v6

    .line 464
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 465
    .line 466
    .line 467
    move-result v9

    .line 468
    goto :goto_1c

    .line 469
    :cond_2c
    move/from16 v9, p5

    .line 470
    .line 471
    :goto_1c
    if-eqz v16, :cond_2d

    .line 472
    .line 473
    sget-object v10, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 474
    .line 475
    int-to-float v11, v6

    .line 476
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    invoke-virtual {v10, v11}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 481
    .line 482
    .line 483
    move-result-object v10

    .line 484
    goto :goto_1d

    .line 485
    :cond_2d
    move-object/from16 v10, p6

    .line 486
    .line 487
    :goto_1d
    and-int/lit16 v11, v14, 0x80

    .line 488
    .line 489
    if-eqz v11, :cond_2e

    .line 490
    .line 491
    sget-object v11, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 492
    .line 493
    const/4 v15, 0x6

    .line 494
    invoke-virtual {v11, v2, v15}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 495
    .line 496
    .line 497
    move-result-object v11

    .line 498
    and-int v3, v3, v18

    .line 499
    .line 500
    goto :goto_1e

    .line 501
    :cond_2e
    move-object/from16 v11, p7

    .line 502
    .line 503
    :goto_1e
    if-eqz v19, :cond_2f

    .line 504
    .line 505
    goto :goto_1f

    .line 506
    :cond_2f
    move/from16 v20, p8

    .line 507
    .line 508
    :goto_1f
    and-int/lit16 v15, v14, 0x200

    .line 509
    .line 510
    if-eqz v15, :cond_30

    .line 511
    .line 512
    invoke-static {v2, v6}, Landroidx/compose/foundation/OverscrollKt;->rememberOverscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    and-int v3, v3, v21

    .line 517
    .line 518
    move-object/from16 v18, v4

    .line 519
    .line 520
    move-object/from16 v23, v6

    .line 521
    .line 522
    :goto_20
    move-object v15, v7

    .line 523
    move/from16 v24, v9

    .line 524
    .line 525
    move-object/from16 v21, v11

    .line 526
    .line 527
    move/from16 v22, v20

    .line 528
    .line 529
    move/from16 v20, v13

    .line 530
    .line 531
    goto :goto_21

    .line 532
    :cond_30
    move-object/from16 v23, p9

    .line 533
    .line 534
    move-object/from16 v18, v4

    .line 535
    .line 536
    goto :goto_20

    .line 537
    :goto_21
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 538
    .line 539
    .line 540
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    if-eqz v4, :cond_31

    .line 545
    .line 546
    const-string v4, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)"

    .line 547
    .line 548
    const v6, -0x2281ca08

    .line 549
    .line 550
    .line 551
    invoke-static {v6, v3, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 552
    .line 553
    .line 554
    :cond_31
    sget-object v16, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 555
    .line 556
    invoke-interface {v10}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 557
    .line 558
    .line 559
    move-result v25

    .line 560
    and-int/lit8 v4, v3, 0xe

    .line 561
    .line 562
    shr-int/lit8 v6, v3, 0xf

    .line 563
    .line 564
    and-int/lit8 v6, v6, 0x70

    .line 565
    .line 566
    or-int/2addr v4, v6

    .line 567
    shr-int/lit8 v6, v3, 0x3

    .line 568
    .line 569
    and-int/lit16 v7, v6, 0x380

    .line 570
    .line 571
    or-int/2addr v4, v7

    .line 572
    invoke-static {v1, v10, v8, v2, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt;->rememberColumnSlots(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 573
    .line 574
    .line 575
    move-result-object v17

    .line 576
    shr-int/lit8 v4, v3, 0x6

    .line 577
    .line 578
    and-int/lit8 v4, v4, 0xe

    .line 579
    .line 580
    or-int/lit8 v4, v4, 0x30

    .line 581
    .line 582
    shl-int/lit8 v7, v3, 0x6

    .line 583
    .line 584
    and-int/lit16 v7, v7, 0x1c00

    .line 585
    .line 586
    or-int/2addr v4, v7

    .line 587
    shl-int/lit8 v7, v3, 0x3

    .line 588
    .line 589
    const v9, 0xe000

    .line 590
    .line 591
    .line 592
    and-int/2addr v9, v7

    .line 593
    or-int/2addr v4, v9

    .line 594
    const/high16 v9, 0x70000

    .line 595
    .line 596
    and-int/2addr v7, v9

    .line 597
    or-int/2addr v4, v7

    .line 598
    const/high16 v7, 0x380000

    .line 599
    .line 600
    and-int/2addr v7, v6

    .line 601
    or-int/2addr v4, v7

    .line 602
    const/high16 v7, 0x1c00000

    .line 603
    .line 604
    and-int/2addr v7, v6

    .line 605
    or-int/2addr v4, v7

    .line 606
    const/high16 v7, 0xe000000

    .line 607
    .line 608
    and-int/2addr v6, v7

    .line 609
    or-int/2addr v4, v6

    .line 610
    shl-int/lit8 v3, v3, 0xc

    .line 611
    .line 612
    const/high16 v6, 0x70000000

    .line 613
    .line 614
    and-int/2addr v3, v6

    .line 615
    or-int v28, v4, v3

    .line 616
    .line 617
    shl-int/2addr v0, v5

    .line 618
    and-int/lit8 v29, v0, 0x70

    .line 619
    .line 620
    const/16 v30, 0x0

    .line 621
    .line 622
    move-object/from16 v26, p10

    .line 623
    .line 624
    move-object/from16 v27, v2

    .line 625
    .line 626
    move-object/from16 v19, v8

    .line 627
    .line 628
    invoke-static/range {v15 .. v30}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt;->LazyStaggeredGrid-w41Enmo(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 629
    .line 630
    .line 631
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    if-eqz v0, :cond_32

    .line 636
    .line 637
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 638
    .line 639
    .line 640
    :cond_32
    move-object v7, v10

    .line 641
    move-object v3, v15

    .line 642
    move-object/from16 v2, v18

    .line 643
    .line 644
    move-object/from16 v4, v19

    .line 645
    .line 646
    move/from16 v5, v20

    .line 647
    .line 648
    move-object/from16 v8, v21

    .line 649
    .line 650
    move/from16 v9, v22

    .line 651
    .line 652
    move-object/from16 v10, v23

    .line 653
    .line 654
    move/from16 v6, v24

    .line 655
    .line 656
    goto :goto_22

    .line 657
    :cond_33
    move-object/from16 v27, v2

    .line 658
    .line 659
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 660
    .line 661
    .line 662
    move/from16 v6, p5

    .line 663
    .line 664
    move/from16 v9, p8

    .line 665
    .line 666
    move-object v2, v7

    .line 667
    move-object v3, v8

    .line 668
    move-object v4, v10

    .line 669
    move v5, v13

    .line 670
    move-object/from16 v7, p6

    .line 671
    .line 672
    move-object/from16 v8, p7

    .line 673
    .line 674
    move-object/from16 v10, p9

    .line 675
    .line 676
    :goto_22
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 677
    .line 678
    .line 679
    move-result-object v15

    .line 680
    if-eqz v15, :cond_34

    .line 681
    .line 682
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1;

    .line 683
    .line 684
    move-object/from16 v11, p10

    .line 685
    .line 686
    move/from16 v13, p13

    .line 687
    .line 688
    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;III)V

    .line 689
    .line 690
    .line 691
    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 692
    .line 693
    .line 694
    :cond_34
    return-void
.end method

.method public static final synthetic LazyVerticalStaggeredGrid-zadm560(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Use the non deprecated overload"
    .end annotation

    .line 1
    move/from16 v11, p11

    .line 2
    .line 3
    move/from16 v12, p12

    .line 4
    .line 5
    const v0, 0x650c9692

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p10

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v12, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v2, v11, 0x6

    .line 19
    .line 20
    move-object/from16 v13, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v11, 0x6

    .line 24
    .line 25
    move-object/from16 v13, p0

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x2

    .line 38
    :goto_0
    or-int/2addr v2, v11

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v2, v11

    .line 41
    :goto_1
    and-int/lit8 v3, v12, 0x2

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    or-int/lit8 v2, v2, 0x30

    .line 46
    .line 47
    :cond_3
    move-object/from16 v4, p1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    and-int/lit8 v4, v11, 0x30

    .line 51
    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    move-object/from16 v4, p1

    .line 55
    .line 56
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    const/16 v5, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_5
    const/16 v5, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v2, v5

    .line 68
    :goto_3
    and-int/lit16 v5, v11, 0x180

    .line 69
    .line 70
    if-nez v5, :cond_8

    .line 71
    .line 72
    and-int/lit8 v5, v12, 0x4

    .line 73
    .line 74
    if-nez v5, :cond_6

    .line 75
    .line 76
    move-object/from16 v5, p2

    .line 77
    .line 78
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_7

    .line 83
    .line 84
    const/16 v6, 0x100

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    move-object/from16 v5, p2

    .line 88
    .line 89
    :cond_7
    const/16 v6, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr v2, v6

    .line 92
    goto :goto_5

    .line 93
    :cond_8
    move-object/from16 v5, p2

    .line 94
    .line 95
    :goto_5
    and-int/lit8 v6, v12, 0x8

    .line 96
    .line 97
    if-eqz v6, :cond_a

    .line 98
    .line 99
    or-int/lit16 v2, v2, 0xc00

    .line 100
    .line 101
    :cond_9
    move-object/from16 v7, p3

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_a
    and-int/lit16 v7, v11, 0xc00

    .line 105
    .line 106
    if-nez v7, :cond_9

    .line 107
    .line 108
    move-object/from16 v7, p3

    .line 109
    .line 110
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-eqz v8, :cond_b

    .line 115
    .line 116
    const/16 v8, 0x800

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_b
    const/16 v8, 0x400

    .line 120
    .line 121
    :goto_6
    or-int/2addr v2, v8

    .line 122
    :goto_7
    and-int/lit8 v8, v12, 0x10

    .line 123
    .line 124
    if-eqz v8, :cond_d

    .line 125
    .line 126
    or-int/lit16 v2, v2, 0x6000

    .line 127
    .line 128
    :cond_c
    move/from16 v9, p4

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_d
    and-int/lit16 v9, v11, 0x6000

    .line 132
    .line 133
    if-nez v9, :cond_c

    .line 134
    .line 135
    move/from16 v9, p4

    .line 136
    .line 137
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_e

    .line 142
    .line 143
    const/16 v10, 0x4000

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_e
    const/16 v10, 0x2000

    .line 147
    .line 148
    :goto_8
    or-int/2addr v2, v10

    .line 149
    :goto_9
    and-int/lit8 v10, v12, 0x20

    .line 150
    .line 151
    const/high16 v14, 0x30000

    .line 152
    .line 153
    if-eqz v10, :cond_10

    .line 154
    .line 155
    or-int/2addr v2, v14

    .line 156
    :cond_f
    move/from16 v14, p5

    .line 157
    .line 158
    goto :goto_b

    .line 159
    :cond_10
    and-int/2addr v14, v11

    .line 160
    if-nez v14, :cond_f

    .line 161
    .line 162
    move/from16 v14, p5

    .line 163
    .line 164
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 165
    .line 166
    .line 167
    move-result v15

    .line 168
    if-eqz v15, :cond_11

    .line 169
    .line 170
    const/high16 v15, 0x20000

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_11
    const/high16 v15, 0x10000

    .line 174
    .line 175
    :goto_a
    or-int/2addr v2, v15

    .line 176
    :goto_b
    and-int/lit8 v15, v12, 0x40

    .line 177
    .line 178
    const/high16 v16, 0x180000

    .line 179
    .line 180
    if-eqz v15, :cond_12

    .line 181
    .line 182
    or-int v2, v2, v16

    .line 183
    .line 184
    move-object/from16 v0, p6

    .line 185
    .line 186
    goto :goto_d

    .line 187
    :cond_12
    and-int v16, v11, v16

    .line 188
    .line 189
    move-object/from16 v0, p6

    .line 190
    .line 191
    if-nez v16, :cond_14

    .line 192
    .line 193
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v17

    .line 197
    if-eqz v17, :cond_13

    .line 198
    .line 199
    const/high16 v17, 0x100000

    .line 200
    .line 201
    goto :goto_c

    .line 202
    :cond_13
    const/high16 v17, 0x80000

    .line 203
    .line 204
    :goto_c
    or-int v2, v2, v17

    .line 205
    .line 206
    :cond_14
    :goto_d
    const/high16 v17, 0xc00000

    .line 207
    .line 208
    and-int v17, v11, v17

    .line 209
    .line 210
    if-nez v17, :cond_17

    .line 211
    .line 212
    and-int/lit16 v0, v12, 0x80

    .line 213
    .line 214
    if-nez v0, :cond_15

    .line 215
    .line 216
    move-object/from16 v0, p7

    .line 217
    .line 218
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v17

    .line 222
    if-eqz v17, :cond_16

    .line 223
    .line 224
    const/high16 v17, 0x800000

    .line 225
    .line 226
    goto :goto_e

    .line 227
    :cond_15
    move-object/from16 v0, p7

    .line 228
    .line 229
    :cond_16
    const/high16 v17, 0x400000

    .line 230
    .line 231
    :goto_e
    or-int v2, v2, v17

    .line 232
    .line 233
    goto :goto_f

    .line 234
    :cond_17
    move-object/from16 v0, p7

    .line 235
    .line 236
    :goto_f
    and-int/lit16 v0, v12, 0x100

    .line 237
    .line 238
    const/high16 v17, 0x6000000

    .line 239
    .line 240
    if-eqz v0, :cond_19

    .line 241
    .line 242
    or-int v2, v2, v17

    .line 243
    .line 244
    :cond_18
    move/from16 v17, v0

    .line 245
    .line 246
    move/from16 v0, p8

    .line 247
    .line 248
    goto :goto_11

    .line 249
    :cond_19
    and-int v17, v11, v17

    .line 250
    .line 251
    if-nez v17, :cond_18

    .line 252
    .line 253
    move/from16 v17, v0

    .line 254
    .line 255
    move/from16 v0, p8

    .line 256
    .line 257
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 258
    .line 259
    .line 260
    move-result v18

    .line 261
    if-eqz v18, :cond_1a

    .line 262
    .line 263
    const/high16 v18, 0x4000000

    .line 264
    .line 265
    goto :goto_10

    .line 266
    :cond_1a
    const/high16 v18, 0x2000000

    .line 267
    .line 268
    :goto_10
    or-int v2, v2, v18

    .line 269
    .line 270
    :goto_11
    and-int/lit16 v0, v12, 0x200

    .line 271
    .line 272
    const/high16 v18, 0x30000000

    .line 273
    .line 274
    if-eqz v0, :cond_1c

    .line 275
    .line 276
    or-int v2, v2, v18

    .line 277
    .line 278
    :cond_1b
    move-object/from16 v0, p9

    .line 279
    .line 280
    goto :goto_13

    .line 281
    :cond_1c
    and-int v0, v11, v18

    .line 282
    .line 283
    if-nez v0, :cond_1b

    .line 284
    .line 285
    move-object/from16 v0, p9

    .line 286
    .line 287
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v18

    .line 291
    if-eqz v18, :cond_1d

    .line 292
    .line 293
    const/high16 v18, 0x20000000

    .line 294
    .line 295
    goto :goto_12

    .line 296
    :cond_1d
    const/high16 v18, 0x10000000

    .line 297
    .line 298
    :goto_12
    or-int v2, v2, v18

    .line 299
    .line 300
    :goto_13
    const v18, 0x12492493

    .line 301
    .line 302
    .line 303
    and-int v0, v2, v18

    .line 304
    .line 305
    move/from16 p10, v3

    .line 306
    .line 307
    const v3, 0x12492492

    .line 308
    .line 309
    .line 310
    const/4 v4, 0x0

    .line 311
    const/16 v18, 0x1

    .line 312
    .line 313
    if-eq v0, v3, :cond_1e

    .line 314
    .line 315
    move/from16 v0, v18

    .line 316
    .line 317
    goto :goto_14

    .line 318
    :cond_1e
    move v0, v4

    .line 319
    :goto_14
    and-int/lit8 v3, v2, 0x1

    .line 320
    .line 321
    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_2d

    .line 326
    .line 327
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 328
    .line 329
    .line 330
    and-int/lit8 v0, v11, 0x1

    .line 331
    .line 332
    const v3, -0x1c00001

    .line 333
    .line 334
    .line 335
    if-eqz v0, :cond_22

    .line 336
    .line 337
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_1f

    .line 342
    .line 343
    goto :goto_15

    .line 344
    :cond_1f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 345
    .line 346
    .line 347
    and-int/lit8 v0, v12, 0x4

    .line 348
    .line 349
    if-eqz v0, :cond_20

    .line 350
    .line 351
    and-int/lit16 v2, v2, -0x381

    .line 352
    .line 353
    :cond_20
    and-int/lit16 v0, v12, 0x80

    .line 354
    .line 355
    if-eqz v0, :cond_21

    .line 356
    .line 357
    and-int/2addr v2, v3

    .line 358
    :cond_21
    move-object/from16 v19, p6

    .line 359
    .line 360
    move-object/from16 v20, p7

    .line 361
    .line 362
    move/from16 v21, p8

    .line 363
    .line 364
    move-object v15, v5

    .line 365
    move-object/from16 v16, v7

    .line 366
    .line 367
    move/from16 v17, v9

    .line 368
    .line 369
    move/from16 v18, v14

    .line 370
    .line 371
    const v0, 0x650c9692

    .line 372
    .line 373
    .line 374
    move-object/from16 v14, p1

    .line 375
    .line 376
    goto/16 :goto_1b

    .line 377
    .line 378
    :cond_22
    :goto_15
    if-eqz p10, :cond_23

    .line 379
    .line 380
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 381
    .line 382
    goto :goto_16

    .line 383
    :cond_23
    move-object/from16 v0, p1

    .line 384
    .line 385
    :goto_16
    and-int/lit8 v19, v12, 0x4

    .line 386
    .line 387
    if-eqz v19, :cond_24

    .line 388
    .line 389
    const/4 v5, 0x3

    .line 390
    invoke-static {v4, v4, v1, v4, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt;->rememberLazyStaggeredGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    and-int/lit16 v2, v2, -0x381

    .line 395
    .line 396
    :cond_24
    if-eqz v6, :cond_25

    .line 397
    .line 398
    int-to-float v6, v4

    .line 399
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    invoke-static {v6}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    goto :goto_17

    .line 408
    :cond_25
    move-object v6, v7

    .line 409
    :goto_17
    if-eqz v8, :cond_26

    .line 410
    .line 411
    move v9, v4

    .line 412
    :cond_26
    if-eqz v10, :cond_27

    .line 413
    .line 414
    int-to-float v7, v4

    .line 415
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    goto :goto_18

    .line 420
    :cond_27
    move v7, v14

    .line 421
    :goto_18
    if-eqz v15, :cond_28

    .line 422
    .line 423
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 424
    .line 425
    int-to-float v10, v4

    .line 426
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 427
    .line 428
    .line 429
    move-result v10

    .line 430
    invoke-virtual {v8, v10}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    goto :goto_19

    .line 435
    :cond_28
    move-object/from16 v8, p6

    .line 436
    .line 437
    :goto_19
    and-int/lit16 v10, v12, 0x80

    .line 438
    .line 439
    if-eqz v10, :cond_29

    .line 440
    .line 441
    sget-object v10, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 442
    .line 443
    const/4 v14, 0x6

    .line 444
    invoke-virtual {v10, v1, v14}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    and-int/2addr v2, v3

    .line 449
    goto :goto_1a

    .line 450
    :cond_29
    move-object/from16 v10, p7

    .line 451
    .line 452
    :goto_1a
    if-eqz v17, :cond_2a

    .line 453
    .line 454
    move-object v14, v0

    .line 455
    move-object v15, v5

    .line 456
    move-object/from16 v16, v6

    .line 457
    .line 458
    move-object/from16 v19, v8

    .line 459
    .line 460
    move/from16 v17, v9

    .line 461
    .line 462
    move-object/from16 v20, v10

    .line 463
    .line 464
    move/from16 v21, v18

    .line 465
    .line 466
    const v0, 0x650c9692

    .line 467
    .line 468
    .line 469
    move/from16 v18, v7

    .line 470
    .line 471
    goto :goto_1b

    .line 472
    :cond_2a
    move/from16 v21, p8

    .line 473
    .line 474
    move-object v14, v0

    .line 475
    move-object v15, v5

    .line 476
    move-object/from16 v16, v6

    .line 477
    .line 478
    move/from16 v18, v7

    .line 479
    .line 480
    move-object/from16 v19, v8

    .line 481
    .line 482
    move/from16 v17, v9

    .line 483
    .line 484
    move-object/from16 v20, v10

    .line 485
    .line 486
    const v0, 0x650c9692

    .line 487
    .line 488
    .line 489
    :goto_1b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 490
    .line 491
    .line 492
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    if-eqz v3, :cond_2b

    .line 497
    .line 498
    const/4 v3, -0x1

    .line 499
    const-string v5, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:111)"

    .line 500
    .line 501
    invoke-static {v0, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 502
    .line 503
    .line 504
    :cond_2b
    invoke-static {v1, v4}, Landroidx/compose/foundation/OverscrollKt;->rememberOverscrollEffect(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;

    .line 505
    .line 506
    .line 507
    move-result-object v22

    .line 508
    const v0, 0xffffffe

    .line 509
    .line 510
    .line 511
    and-int v25, v2, v0

    .line 512
    .line 513
    shr-int/lit8 v0, v2, 0x1b

    .line 514
    .line 515
    and-int/lit8 v26, v0, 0xe

    .line 516
    .line 517
    const/16 v27, 0x0

    .line 518
    .line 519
    move-object/from16 v23, p9

    .line 520
    .line 521
    move-object/from16 v24, v1

    .line 522
    .line 523
    invoke-static/range {v13 .. v27}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt;->LazyVerticalStaggeredGrid-6qCrX9Q(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 524
    .line 525
    .line 526
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-eqz v0, :cond_2c

    .line 531
    .line 532
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 533
    .line 534
    .line 535
    :cond_2c
    move-object v2, v14

    .line 536
    move-object v3, v15

    .line 537
    move-object/from16 v4, v16

    .line 538
    .line 539
    move/from16 v5, v17

    .line 540
    .line 541
    move/from16 v6, v18

    .line 542
    .line 543
    move-object/from16 v7, v19

    .line 544
    .line 545
    move-object/from16 v8, v20

    .line 546
    .line 547
    move/from16 v9, v21

    .line 548
    .line 549
    goto :goto_1c

    .line 550
    :cond_2d
    move-object/from16 v24, v1

    .line 551
    .line 552
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 553
    .line 554
    .line 555
    move-object/from16 v2, p1

    .line 556
    .line 557
    move-object/from16 v8, p7

    .line 558
    .line 559
    move-object v3, v5

    .line 560
    move-object v4, v7

    .line 561
    move v5, v9

    .line 562
    move v6, v14

    .line 563
    move-object/from16 v7, p6

    .line 564
    .line 565
    move/from16 v9, p8

    .line 566
    .line 567
    :goto_1c
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 568
    .line 569
    .line 570
    move-result-object v13

    .line 571
    if-eqz v13, :cond_2e

    .line 572
    .line 573
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$2;

    .line 574
    .line 575
    move-object/from16 v1, p0

    .line 576
    .line 577
    move-object/from16 v10, p9

    .line 578
    .line 579
    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$2;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;II)V

    .line 580
    .line 581
    .line 582
    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 583
    .line 584
    .line 585
    :cond_2e
    return-void
.end method

.method public static final items(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/g;",
            ")V"
        }
    .end annotation

    move-object v0, p1

    .line 1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 2
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1;

    invoke-direct {v2, p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1;-><init>(Lr6/c;Ljava/util/List;)V

    move-object p2, v2

    :goto_0
    move-object v2, p3

    goto :goto_1

    :cond_0
    move-object p2, v1

    goto :goto_0

    .line 3
    :goto_1
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3;

    invoke-direct {p3, v2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3;-><init>(Lr6/c;Ljava/util/List;)V

    if-eqz p4, :cond_1

    .line 4
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1;

    invoke-direct {v1, p4, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1;-><init>(Lr6/c;Ljava/util/List;)V

    :cond_1
    move-object p4, v1

    .line 5
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5;

    invoke-direct {v1, p5, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5;-><init>(Lr6/g;Ljava/util/List;)V

    const p5, -0x34d6409f    # -1.1124577E7f

    const/4 v0, 0x1

    invoke-static {p5, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p5

    .line 6
    invoke-interface/range {p0 .. p5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static final items(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "[TT;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/g;",
            ")V"
        }
    .end annotation

    move-object v0, p1

    .line 7
    array-length p1, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 8
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1;

    invoke-direct {v2, p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1;-><init>(Lr6/c;[Ljava/lang/Object;)V

    move-object p2, v2

    :goto_0
    move-object v2, p3

    goto :goto_1

    :cond_0
    move-object p2, v1

    goto :goto_0

    .line 9
    :goto_1
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8;

    invoke-direct {p3, v2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8;-><init>(Lr6/c;[Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    .line 10
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1;

    invoke-direct {v1, p4, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1;-><init>(Lr6/c;[Ljava/lang/Object;)V

    :cond_1
    move-object p4, v1

    .line 11
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10;

    invoke-direct {v1, p5, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10;-><init>(Lr6/g;[Ljava/lang/Object;)V

    const p5, 0x7d3f3b80

    const/4 v0, 0x1

    invoke-static {p5, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p5

    .line 12
    invoke-interface/range {p0 .. p5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static synthetic items$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/g;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 1
    sget-object p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$1;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$1;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 2
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-eqz p2, :cond_3

    .line 3
    new-instance p6, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1;

    invoke-direct {p6, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1;-><init>(Lr6/c;Ljava/util/List;)V

    move-object v3, p6

    goto :goto_0

    :cond_3
    move-object v3, v0

    .line 4
    :goto_0
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3;

    invoke-direct {v4, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3;-><init>(Lr6/c;Ljava/util/List;)V

    if-eqz p4, :cond_4

    .line 5
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1;

    invoke-direct {v0, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1;-><init>(Lr6/c;Ljava/util/List;)V

    :cond_4
    move-object v5, v0

    .line 6
    new-instance p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5;

    invoke-direct {p2, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5;-><init>(Lr6/g;Ljava/util/List;)V

    const p1, -0x34d6409f    # -1.1124577E7f

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v1, p0

    .line 7
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static synthetic items$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lr6/c;Lr6/c;Lr6/c;Lr6/g;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 8
    sget-object p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$6;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$6;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 9
    :cond_2
    array-length v2, p1

    if-eqz p2, :cond_3

    .line 10
    new-instance p6, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1;

    invoke-direct {p6, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1;-><init>(Lr6/c;[Ljava/lang/Object;)V

    move-object v3, p6

    goto :goto_0

    :cond_3
    move-object v3, v0

    .line 11
    :goto_0
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8;

    invoke-direct {v4, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8;-><init>(Lr6/c;[Ljava/lang/Object;)V

    if-eqz p4, :cond_4

    .line 12
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1;

    invoke-direct {v0, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1;-><init>(Lr6/c;[Ljava/lang/Object;)V

    :cond_4
    move-object v5, v0

    .line 13
    new-instance p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10;

    invoke-direct {p2, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10;-><init>(Lr6/g;[Ljava/lang/Object;)V

    const p1, 0x7d3f3b80

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v1, p0

    .line 14
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static final itemsIndexed(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lr6/e;Lr6/e;Lr6/e;Lr6/h;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/h;",
            ")V"
        }
    .end annotation

    move-object v0, p1

    .line 1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 2
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1;

    invoke-direct {v2, p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1;-><init>(Lr6/e;Ljava/util/List;)V

    move-object p2, v2

    :goto_0
    move-object v2, p3

    goto :goto_1

    :cond_0
    move-object p2, v1

    goto :goto_0

    .line 3
    :goto_1
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3;

    invoke-direct {p3, v2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3;-><init>(Lr6/e;Ljava/util/List;)V

    if-eqz p4, :cond_1

    .line 4
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1;

    invoke-direct {v1, p4, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1;-><init>(Lr6/e;Ljava/util/List;)V

    :cond_1
    move-object p4, v1

    .line 5
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5;

    invoke-direct {v1, p5, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5;-><init>(Lr6/h;Ljava/util/List;)V

    const p5, 0x10fa3898

    const/4 v0, 0x1

    invoke-static {p5, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p5

    .line 6
    invoke-interface/range {p0 .. p5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static final itemsIndexed(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lr6/e;Lr6/e;Lr6/e;Lr6/h;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "[TT;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/h;",
            ")V"
        }
    .end annotation

    move-object v0, p1

    .line 7
    array-length p1, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 8
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1;

    invoke-direct {v2, p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1;-><init>(Lr6/e;[Ljava/lang/Object;)V

    move-object p2, v2

    :goto_0
    move-object v2, p3

    goto :goto_1

    :cond_0
    move-object p2, v1

    goto :goto_0

    .line 9
    :goto_1
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8;

    invoke-direct {p3, v2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8;-><init>(Lr6/e;[Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    .line 10
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1;

    invoke-direct {v1, p4, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1;-><init>(Lr6/e;[Ljava/lang/Object;)V

    :cond_1
    move-object p4, v1

    .line 11
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10;

    invoke-direct {v1, p5, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10;-><init>(Lr6/h;[Ljava/lang/Object;)V

    const p5, -0x2ff3825f

    const/4 v0, 0x1

    invoke-static {p5, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p5

    .line 12
    invoke-interface/range {p0 .. p5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static synthetic itemsIndexed$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lr6/e;Lr6/e;Lr6/e;Lr6/h;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 1
    sget-object p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$1;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$1;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 2
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-eqz p2, :cond_3

    .line 3
    new-instance p6, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1;

    invoke-direct {p6, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1;-><init>(Lr6/e;Ljava/util/List;)V

    move-object v3, p6

    goto :goto_0

    :cond_3
    move-object v3, v0

    .line 4
    :goto_0
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3;

    invoke-direct {v4, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3;-><init>(Lr6/e;Ljava/util/List;)V

    if-eqz p4, :cond_4

    .line 5
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1;

    invoke-direct {v0, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1;-><init>(Lr6/e;Ljava/util/List;)V

    :cond_4
    move-object v5, v0

    .line 6
    new-instance p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5;

    invoke-direct {p2, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5;-><init>(Lr6/h;Ljava/util/List;)V

    const p1, 0x10fa3898

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v1, p0

    .line 7
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static synthetic itemsIndexed$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lr6/e;Lr6/e;Lr6/e;Lr6/h;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 8
    sget-object p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$6;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$6;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 9
    :cond_2
    array-length v2, p1

    if-eqz p2, :cond_3

    .line 10
    new-instance p6, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1;

    invoke-direct {p6, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1;-><init>(Lr6/e;[Ljava/lang/Object;)V

    move-object v3, p6

    goto :goto_0

    :cond_3
    move-object v3, v0

    .line 11
    :goto_0
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8;

    invoke-direct {v4, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8;-><init>(Lr6/e;[Ljava/lang/Object;)V

    if-eqz p4, :cond_4

    .line 12
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1;

    invoke-direct {v0, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1;-><init>(Lr6/e;[Ljava/lang/Object;)V

    :cond_4
    move-object v5, v0

    .line 13
    new-instance p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10;

    invoke-direct {p2, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10;-><init>(Lr6/h;[Ljava/lang/Object;)V

    const p1, -0x2ff3825f

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v1, p0

    .line 14
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method private static final rememberColumnSlots(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;
    .locals 5
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)"

    .line 9
    .line 10
    const v2, -0x4b860ee9

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 v0, p4, 0xe

    .line 17
    .line 18
    xor-int/lit8 v0, v0, 0x6

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-le v0, v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    :cond_1
    and-int/lit8 v0, p4, 0x6

    .line 32
    .line 33
    if-ne v0, v1, :cond_3

    .line 34
    .line 35
    :cond_2
    move v0, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move v0, v2

    .line 38
    :goto_0
    and-int/lit8 v1, p4, 0x70

    .line 39
    .line 40
    xor-int/lit8 v1, v1, 0x30

    .line 41
    .line 42
    const/16 v4, 0x20

    .line 43
    .line 44
    if-le v1, v4, :cond_4

    .line 45
    .line 46
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    :cond_4
    and-int/lit8 v1, p4, 0x30

    .line 53
    .line 54
    if-ne v1, v4, :cond_6

    .line 55
    .line 56
    :cond_5
    move v1, v3

    .line 57
    goto :goto_1

    .line 58
    :cond_6
    move v1, v2

    .line 59
    :goto_1
    or-int/2addr v0, v1

    .line 60
    and-int/lit16 v1, p4, 0x380

    .line 61
    .line 62
    xor-int/lit16 v1, v1, 0x180

    .line 63
    .line 64
    const/16 v4, 0x100

    .line 65
    .line 66
    if-le v1, v4, :cond_7

    .line 67
    .line 68
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_8

    .line 73
    .line 74
    :cond_7
    and-int/lit16 p4, p4, 0x180

    .line 75
    .line 76
    if-ne p4, v4, :cond_9

    .line 77
    .line 78
    :cond_8
    move v2, v3

    .line 79
    :cond_9
    or-int p4, v0, v2

    .line 80
    .line 81
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez p4, :cond_a

    .line 86
    .line 87
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 88
    .line 89
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    if-ne v0, p4, :cond_b

    .line 94
    .line 95
    :cond_a
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;

    .line 96
    .line 97
    new-instance p4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnSlots$1$1;

    .line 98
    .line 99
    invoke-direct {p4, p2, p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnSlots$1$1;-><init>(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, p4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;-><init>(Lr6/e;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_b
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 109
    .line 110
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_c

    .line 115
    .line 116
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 117
    .line 118
    .line 119
    :cond_c
    return-object v0
.end method

.method private static final rememberRowSlots(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;
    .locals 5
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:259)"

    .line 9
    .line 10
    const v2, -0x5b564f4d

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 v0, p4, 0xe

    .line 17
    .line 18
    xor-int/lit8 v0, v0, 0x6

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-le v0, v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    :cond_1
    and-int/lit8 v0, p4, 0x6

    .line 32
    .line 33
    if-ne v0, v1, :cond_3

    .line 34
    .line 35
    :cond_2
    move v0, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move v0, v2

    .line 38
    :goto_0
    and-int/lit8 v1, p4, 0x70

    .line 39
    .line 40
    xor-int/lit8 v1, v1, 0x30

    .line 41
    .line 42
    const/16 v4, 0x20

    .line 43
    .line 44
    if-le v1, v4, :cond_4

    .line 45
    .line 46
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    :cond_4
    and-int/lit8 v1, p4, 0x30

    .line 53
    .line 54
    if-ne v1, v4, :cond_6

    .line 55
    .line 56
    :cond_5
    move v1, v3

    .line 57
    goto :goto_1

    .line 58
    :cond_6
    move v1, v2

    .line 59
    :goto_1
    or-int/2addr v0, v1

    .line 60
    and-int/lit16 v1, p4, 0x380

    .line 61
    .line 62
    xor-int/lit16 v1, v1, 0x180

    .line 63
    .line 64
    const/16 v4, 0x100

    .line 65
    .line 66
    if-le v1, v4, :cond_7

    .line 67
    .line 68
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_8

    .line 73
    .line 74
    :cond_7
    and-int/lit16 p4, p4, 0x180

    .line 75
    .line 76
    if-ne p4, v4, :cond_9

    .line 77
    .line 78
    :cond_8
    move v2, v3

    .line 79
    :cond_9
    or-int p4, v0, v2

    .line 80
    .line 81
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez p4, :cond_a

    .line 86
    .line 87
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 88
    .line 89
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    if-ne v0, p4, :cond_b

    .line 94
    .line 95
    :cond_a
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;

    .line 96
    .line 97
    new-instance p4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1;

    .line 98
    .line 99
    invoke-direct {p4, p2, p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1;-><init>(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, p4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;-><init>(Lr6/e;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_b
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 109
    .line 110
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_c

    .line 115
    .line 116
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 117
    .line 118
    .line 119
    :cond_c
    return-object v0
.end method
