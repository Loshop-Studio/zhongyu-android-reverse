.class public final Landroidx/compose/foundation/layout/FlowLayoutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0002\u0008\u0013H\u0007\u00a2\u0006\u0002\u0010\u0014\u001aS\u0010\u0015\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00022\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0010\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0002\u0008\u0013H\u0007\u00a2\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0002H\u0003\u00a2\u0006\u0002\u0010 \u001a\u008f\u0001\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2*\u0010$\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2$\u0010.\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008/\u00100\u001ax\u00101\u001a\u00020\u00022\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206\u00a2\u0006\u0002\u0008\u00132#\u0010*\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206\u00a2\u0006\u0002\u0008\u00132\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a>\u00101\u001a\u00020\u00022\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u000204032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a9\u0010;\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0002\u0010<\u001a9\u0010=\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003\u00a2\u0006\u0002\u0010>\u001aS\u0010?\u001a\u00020\u00022\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206\u00a2\u0006\u0002\u0008\u00132\u0006\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001ax\u0010A\u001a\u00020\u00022\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206\u00a2\u0006\u0002\u0008\u00132#\u0010*\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206\u00a2\u0006\u0002\u0008\u00132\u0006\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a)\u0010B\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0002H\u0003\u00a2\u0006\u0002\u0010C\u001a,\u0010D\u001a\u00020E*\u00020\u00042\u0006\u0010F\u001a\u00020G2\u0006\u0010\"\u001a\u00020#2\u0006\u0010H\u001a\u00020I2\u0006\u0010\u001f\u001a\u00020\u0002H\u0000\u001a\u001c\u0010J\u001a\u00020\u0002*\u00020K2\u0006\u0010\"\u001a\u00020#2\u0006\u00105\u001a\u00020\u0002H\u0000\u001a\u0014\u0010*\u001a\u00020\u0002*\u00020L2\u0006\u0010\"\u001a\u00020#H\u0000\u001a\u001c\u0010M\u001a\u00020\u0002*\u00020K2\u0006\u0010\"\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0002H\u0000\u001a\u0014\u00105\u001a\u00020\u0002*\u00020L2\u0006\u0010\"\u001a\u00020#H\u0000\u001a2\u0010N\u001a\u00020\u0002*\u00020K2\u0006\u0010H\u001a\u00020I2\u0006\u0010\"\u001a\u00020#2\u0014\u0010O\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010L\u0012\u0004\u0012\u00020\u00050\u0010H\u0002\",\u0010\u0000\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006P"
    }
    d2 = {
        "crossAxisColumnArrangement",
        "Lkotlin/Function4;",
        "",
        "",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "",
        "crossAxisRowArrangement",
        "FlowColumn",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "maxItemsInEachColumn",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "FlowRow",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "maxItemsInEachRow",
        "Landroidx/compose/foundation/layout/RowScope;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "columnMeasurementHelper",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "maxItemsInMainAxis",
        "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;",
        "flowMeasurePolicy",
        "orientation",
        "Landroidx/compose/foundation/layout/LayoutOrientation;",
        "mainAxisArrangement",
        "Lkotlin/Function5;",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "Landroidx/compose/ui/unit/Density;",
        "arrangementSpacing",
        "Landroidx/compose/ui/unit/Dp;",
        "crossAxisSize",
        "Landroidx/compose/foundation/layout/SizeMode;",
        "crossAxisAlignment",
        "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "crossAxisArrangement",
        "flowMeasurePolicy-942rkJo",
        "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function4;I)Landroidx/compose/ui/layout/MeasurePolicy;",
        "intrinsicCrossAxisSize",
        "children",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "mainAxisSize",
        "Lkotlin/Function3;",
        "mainAxisAvailable",
        "mainAxisSpacing",
        "mainAxisSizes",
        "crossAxisSizes",
        "mainAxisColumnArrangement",
        "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;",
        "mainAxisRowArrangement",
        "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;",
        "maxIntrinsicMainAxisSize",
        "crossAxisAvailable",
        "minIntrinsicMainAxisSize",
        "rowMeasurementHelper",
        "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;",
        "breakDownItems",
        "Landroidx/compose/foundation/layout/FlowResult;",
        "measureHelper",
        "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;",
        "constraints",
        "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;",
        "crossAxisMin",
        "Landroidx/compose/ui/layout/Measurable;",
        "Landroidx/compose/ui/layout/Placeable;",
        "mainAxisMin",
        "measureAndCache",
        "storePlaceable",
        "foundation-layout_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,724:1\n75#2:725\n76#2,11:727\n89#2:754\n75#2:755\n76#2,11:757\n89#2:784\n76#3:726\n76#3:756\n460#4,16:738\n460#4,16:768\n36#4:785\n36#4:792\n36#4:799\n67#4,3:806\n66#4:809\n36#4:816\n67#4,3:823\n66#4:826\n1057#5,6:786\n1057#5,6:793\n1057#5,6:800\n1057#5,6:810\n1057#5,6:817\n1057#5,6:827\n49#6,6:833\n49#6,6:840\n1#7:839\n1182#8:846\n1161#8,2:847\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n66#1:725\n66#1:727,11\n66#1:754\n116#1:755\n116#1:757,11\n116#1:784\n66#1:726\n116#1:756\n66#1:738,16\n116#1:768,16\n126#1:785\n137#1:792\n165#1:799\n168#1:806,3\n168#1:809\n188#1:816\n191#1:823,3\n191#1:826\n126#1:786,6\n137#1:793,6\n165#1:800,6\n168#1:810,6\n188#1:817,6\n191#1:827,6\n427#1:833,6\n542#1:840,6\n580#1:846\n580#1:847,2\n*E\n"
    }
.end annotation


# static fields
.field private static final crossAxisColumnArrangement:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Ljava/lang/Integer;",
            "[I",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private static final crossAxisRowArrangement:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Ljava/lang/Integer;",
            "[I",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$crossAxisRowArrangement$1;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$crossAxisRowArrangement$1;

    .line 2
    .line 3
    sput-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->crossAxisRowArrangement:Lkotlin/jvm/functions/Function4;

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt$crossAxisColumnArrangement$1;->INSTANCE:Landroidx/compose/foundation/layout/FlowLayoutKt$crossAxisColumnArrangement$1;

    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->crossAxisColumnArrangement:Lkotlin/jvm/functions/Function4;

    .line 8
    .line 9
    return-void
.end method

.method public static final FlowColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation build Landroidx/compose/foundation/layout/ExperimentalLayoutApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "I",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    move/from16 v6, p6

    .line 4
    .line 5
    const-string v0, "content"

    .line 6
    .line 7
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, -0x127ea9d5

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p5

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    and-int/lit8 v2, p7, 0x1

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    or-int/lit8 v3, v6, 0x6

    .line 24
    .line 25
    move v4, v3

    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v3, v6, 0xe

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    move-object/from16 v3, p0

    .line 34
    .line 35
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    const/4 v4, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v4, 0x2

    .line 44
    :goto_0
    or-int/2addr v4, v6

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object/from16 v3, p0

    .line 47
    .line 48
    move v4, v6

    .line 49
    :goto_1
    and-int/lit8 v7, p7, 0x2

    .line 50
    .line 51
    if-eqz v7, :cond_3

    .line 52
    .line 53
    or-int/lit8 v4, v4, 0x30

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    and-int/lit8 v8, v6, 0x70

    .line 57
    .line 58
    if-nez v8, :cond_5

    .line 59
    .line 60
    move-object/from16 v8, p1

    .line 61
    .line 62
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eqz v9, :cond_4

    .line 67
    .line 68
    const/16 v9, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/16 v9, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v4, v9

    .line 74
    goto :goto_4

    .line 75
    :cond_5
    :goto_3
    move-object/from16 v8, p1

    .line 76
    .line 77
    :goto_4
    and-int/lit8 v9, p7, 0x4

    .line 78
    .line 79
    if-eqz v9, :cond_6

    .line 80
    .line 81
    or-int/lit16 v4, v4, 0x180

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    and-int/lit16 v10, v6, 0x380

    .line 85
    .line 86
    if-nez v10, :cond_8

    .line 87
    .line 88
    move-object/from16 v10, p2

    .line 89
    .line 90
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_7

    .line 95
    .line 96
    const/16 v11, 0x100

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_7
    const/16 v11, 0x80

    .line 100
    .line 101
    :goto_5
    or-int/2addr v4, v11

    .line 102
    goto :goto_7

    .line 103
    :cond_8
    :goto_6
    move-object/from16 v10, p2

    .line 104
    .line 105
    :goto_7
    and-int/lit8 v11, p7, 0x8

    .line 106
    .line 107
    if-eqz v11, :cond_9

    .line 108
    .line 109
    or-int/lit16 v4, v4, 0xc00

    .line 110
    .line 111
    goto :goto_9

    .line 112
    :cond_9
    and-int/lit16 v12, v6, 0x1c00

    .line 113
    .line 114
    if-nez v12, :cond_b

    .line 115
    .line 116
    move/from16 v12, p3

    .line 117
    .line 118
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-eqz v13, :cond_a

    .line 123
    .line 124
    const/16 v13, 0x800

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_a
    const/16 v13, 0x400

    .line 128
    .line 129
    :goto_8
    or-int/2addr v4, v13

    .line 130
    goto :goto_a

    .line 131
    :cond_b
    :goto_9
    move/from16 v12, p3

    .line 132
    .line 133
    :goto_a
    and-int/lit8 v13, p7, 0x10

    .line 134
    .line 135
    if-eqz v13, :cond_c

    .line 136
    .line 137
    or-int/lit16 v4, v4, 0x6000

    .line 138
    .line 139
    goto :goto_c

    .line 140
    :cond_c
    const v13, 0xe000

    .line 141
    .line 142
    .line 143
    and-int/2addr v13, v6

    .line 144
    if-nez v13, :cond_e

    .line 145
    .line 146
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    if-eqz v13, :cond_d

    .line 151
    .line 152
    const/16 v13, 0x4000

    .line 153
    .line 154
    goto :goto_b

    .line 155
    :cond_d
    const/16 v13, 0x2000

    .line 156
    .line 157
    :goto_b
    or-int/2addr v4, v13

    .line 158
    :cond_e
    :goto_c
    const v13, 0xb6db

    .line 159
    .line 160
    .line 161
    and-int/2addr v13, v4

    .line 162
    const/16 v14, 0x2492

    .line 163
    .line 164
    if-ne v13, v14, :cond_10

    .line 165
    .line 166
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    if-nez v13, :cond_f

    .line 171
    .line 172
    goto :goto_d

    .line 173
    :cond_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 174
    .line 175
    .line 176
    move-object v2, v8

    .line 177
    move v4, v12

    .line 178
    goto/16 :goto_13

    .line 179
    .line 180
    :cond_10
    :goto_d
    if-eqz v2, :cond_11

    .line 181
    .line 182
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 183
    .line 184
    goto :goto_e

    .line 185
    :cond_11
    move-object v2, v3

    .line 186
    :goto_e
    if-eqz v7, :cond_12

    .line 187
    .line 188
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 189
    .line 190
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    goto :goto_f

    .line 195
    :cond_12
    move-object v3, v8

    .line 196
    :goto_f
    if-eqz v9, :cond_13

    .line 197
    .line 198
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 199
    .line 200
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    move-object v13, v7

    .line 205
    goto :goto_10

    .line 206
    :cond_13
    move-object v13, v10

    .line 207
    :goto_10
    if-eqz v11, :cond_14

    .line 208
    .line 209
    const v7, 0x7fffffff

    .line 210
    .line 211
    .line 212
    move v14, v7

    .line 213
    goto :goto_11

    .line 214
    :cond_14
    move v14, v12

    .line 215
    :goto_11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-eqz v7, :cond_15

    .line 220
    .line 221
    const/4 v7, -0x1

    .line 222
    const-string v8, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:103)"

    .line 223
    .line 224
    invoke-static {v0, v4, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :cond_15
    shr-int/lit8 v0, v4, 0x3

    .line 228
    .line 229
    and-int/lit8 v7, v0, 0xe

    .line 230
    .line 231
    and-int/lit8 v8, v0, 0x70

    .line 232
    .line 233
    or-int/2addr v7, v8

    .line 234
    and-int/lit16 v0, v0, 0x380

    .line 235
    .line 236
    or-int v11, v7, v0

    .line 237
    .line 238
    const/4 v12, 0x0

    .line 239
    move-object v7, v3

    .line 240
    move-object v8, v13

    .line 241
    move v9, v14

    .line 242
    move-object v10, v1

    .line 243
    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/FlowLayoutKt;->columnMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    shl-int/lit8 v7, v4, 0x3

    .line 248
    .line 249
    and-int/lit8 v7, v7, 0x70

    .line 250
    .line 251
    const v8, -0x4ee9b9da

    .line 252
    .line 253
    .line 254
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 255
    .line 256
    .line 257
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    check-cast v8, Landroidx/compose/ui/unit/Density;

    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    check-cast v9, Landroidx/compose/ui/unit/LayoutDirection;

    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    check-cast v10, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 286
    .line 287
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 288
    .line 289
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 290
    .line 291
    .line 292
    move-result-object v12

    .line 293
    invoke-static {v2}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    shl-int/lit8 v7, v7, 0x9

    .line 298
    .line 299
    and-int/lit16 v7, v7, 0x1c00

    .line 300
    .line 301
    or-int/lit8 v7, v7, 0x6

    .line 302
    .line 303
    move-object/from16 p0, v2

    .line 304
    .line 305
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    .line 310
    .line 311
    if-nez v2, :cond_16

    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 314
    .line 315
    .line 316
    :cond_16
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 317
    .line 318
    .line 319
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-eqz v2, :cond_17

    .line 324
    .line 325
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 326
    .line 327
    .line 328
    goto :goto_12

    .line 329
    :cond_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 330
    .line 331
    .line 332
    :goto_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 333
    .line 334
    .line 335
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    invoke-static {v2, v0, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v2, v8, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v2, v9, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v2, v10, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 368
    .line 369
    .line 370
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    shr-int/lit8 v2, v7, 0x3

    .line 379
    .line 380
    and-int/lit8 v2, v2, 0x70

    .line 381
    .line 382
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    invoke-interface {v15, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    const v0, 0x7ab4aae9

    .line 390
    .line 391
    .line 392
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 396
    .line 397
    shr-int/lit8 v2, v4, 0x9

    .line 398
    .line 399
    and-int/lit8 v2, v2, 0x70

    .line 400
    .line 401
    or-int/lit8 v2, v2, 0x6

    .line 402
    .line 403
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-interface {v5, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 411
    .line 412
    .line 413
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 414
    .line 415
    .line 416
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 417
    .line 418
    .line 419
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_18

    .line 424
    .line 425
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 426
    .line 427
    .line 428
    :cond_18
    move-object v2, v3

    .line 429
    move-object v10, v13

    .line 430
    move v4, v14

    .line 431
    move-object/from16 v3, p0

    .line 432
    .line 433
    :goto_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    if-nez v8, :cond_19

    .line 438
    .line 439
    goto :goto_14

    .line 440
    :cond_19
    new-instance v9, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$2;

    .line 441
    .line 442
    move-object v0, v9

    .line 443
    move-object v1, v3

    .line 444
    move-object v3, v10

    .line 445
    move-object/from16 v5, p4

    .line 446
    .line 447
    move/from16 v6, p6

    .line 448
    .line 449
    move/from16 v7, p7

    .line 450
    .line 451
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILkotlin/jvm/functions/Function3;II)V

    .line 452
    .line 453
    .line 454
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 455
    .line 456
    .line 457
    :goto_14
    return-void
.end method

.method public static final FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation build Landroidx/compose/foundation/layout/ExperimentalLayoutApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "I",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/RowScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    move/from16 v6, p6

    .line 4
    .line 5
    const-string v0, "content"

    .line 6
    .line 7
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, 0x417969d3

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p5

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    and-int/lit8 v2, p7, 0x1

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    or-int/lit8 v3, v6, 0x6

    .line 24
    .line 25
    move v4, v3

    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v3, v6, 0xe

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    move-object/from16 v3, p0

    .line 34
    .line 35
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    const/4 v4, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v4, 0x2

    .line 44
    :goto_0
    or-int/2addr v4, v6

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object/from16 v3, p0

    .line 47
    .line 48
    move v4, v6

    .line 49
    :goto_1
    and-int/lit8 v7, p7, 0x2

    .line 50
    .line 51
    if-eqz v7, :cond_3

    .line 52
    .line 53
    or-int/lit8 v4, v4, 0x30

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    and-int/lit8 v8, v6, 0x70

    .line 57
    .line 58
    if-nez v8, :cond_5

    .line 59
    .line 60
    move-object/from16 v8, p1

    .line 61
    .line 62
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eqz v9, :cond_4

    .line 67
    .line 68
    const/16 v9, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/16 v9, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v4, v9

    .line 74
    goto :goto_4

    .line 75
    :cond_5
    :goto_3
    move-object/from16 v8, p1

    .line 76
    .line 77
    :goto_4
    and-int/lit8 v9, p7, 0x4

    .line 78
    .line 79
    if-eqz v9, :cond_6

    .line 80
    .line 81
    or-int/lit16 v4, v4, 0x180

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    and-int/lit16 v10, v6, 0x380

    .line 85
    .line 86
    if-nez v10, :cond_8

    .line 87
    .line 88
    move-object/from16 v10, p2

    .line 89
    .line 90
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_7

    .line 95
    .line 96
    const/16 v11, 0x100

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_7
    const/16 v11, 0x80

    .line 100
    .line 101
    :goto_5
    or-int/2addr v4, v11

    .line 102
    goto :goto_7

    .line 103
    :cond_8
    :goto_6
    move-object/from16 v10, p2

    .line 104
    .line 105
    :goto_7
    and-int/lit8 v11, p7, 0x8

    .line 106
    .line 107
    if-eqz v11, :cond_9

    .line 108
    .line 109
    or-int/lit16 v4, v4, 0xc00

    .line 110
    .line 111
    goto :goto_9

    .line 112
    :cond_9
    and-int/lit16 v12, v6, 0x1c00

    .line 113
    .line 114
    if-nez v12, :cond_b

    .line 115
    .line 116
    move/from16 v12, p3

    .line 117
    .line 118
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-eqz v13, :cond_a

    .line 123
    .line 124
    const/16 v13, 0x800

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_a
    const/16 v13, 0x400

    .line 128
    .line 129
    :goto_8
    or-int/2addr v4, v13

    .line 130
    goto :goto_a

    .line 131
    :cond_b
    :goto_9
    move/from16 v12, p3

    .line 132
    .line 133
    :goto_a
    and-int/lit8 v13, p7, 0x10

    .line 134
    .line 135
    if-eqz v13, :cond_c

    .line 136
    .line 137
    or-int/lit16 v4, v4, 0x6000

    .line 138
    .line 139
    goto :goto_c

    .line 140
    :cond_c
    const v13, 0xe000

    .line 141
    .line 142
    .line 143
    and-int/2addr v13, v6

    .line 144
    if-nez v13, :cond_e

    .line 145
    .line 146
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    if-eqz v13, :cond_d

    .line 151
    .line 152
    const/16 v13, 0x4000

    .line 153
    .line 154
    goto :goto_b

    .line 155
    :cond_d
    const/16 v13, 0x2000

    .line 156
    .line 157
    :goto_b
    or-int/2addr v4, v13

    .line 158
    :cond_e
    :goto_c
    const v13, 0xb6db

    .line 159
    .line 160
    .line 161
    and-int/2addr v13, v4

    .line 162
    const/16 v14, 0x2492

    .line 163
    .line 164
    if-ne v13, v14, :cond_10

    .line 165
    .line 166
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    if-nez v13, :cond_f

    .line 171
    .line 172
    goto :goto_d

    .line 173
    :cond_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 174
    .line 175
    .line 176
    move-object v2, v8

    .line 177
    move v4, v12

    .line 178
    goto/16 :goto_13

    .line 179
    .line 180
    :cond_10
    :goto_d
    if-eqz v2, :cond_11

    .line 181
    .line 182
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 183
    .line 184
    goto :goto_e

    .line 185
    :cond_11
    move-object v2, v3

    .line 186
    :goto_e
    if-eqz v7, :cond_12

    .line 187
    .line 188
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 189
    .line 190
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    goto :goto_f

    .line 195
    :cond_12
    move-object v3, v8

    .line 196
    :goto_f
    if-eqz v9, :cond_13

    .line 197
    .line 198
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 199
    .line 200
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    move-object v13, v7

    .line 205
    goto :goto_10

    .line 206
    :cond_13
    move-object v13, v10

    .line 207
    :goto_10
    if-eqz v11, :cond_14

    .line 208
    .line 209
    const v7, 0x7fffffff

    .line 210
    .line 211
    .line 212
    move v14, v7

    .line 213
    goto :goto_11

    .line 214
    :cond_14
    move v14, v12

    .line 215
    :goto_11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-eqz v7, :cond_15

    .line 220
    .line 221
    const/4 v7, -0x1

    .line 222
    const-string v8, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:53)"

    .line 223
    .line 224
    invoke-static {v0, v4, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :cond_15
    shr-int/lit8 v0, v4, 0x3

    .line 228
    .line 229
    and-int/lit8 v7, v0, 0xe

    .line 230
    .line 231
    and-int/lit8 v8, v0, 0x70

    .line 232
    .line 233
    or-int/2addr v7, v8

    .line 234
    and-int/lit16 v0, v0, 0x380

    .line 235
    .line 236
    or-int v11, v7, v0

    .line 237
    .line 238
    const/4 v12, 0x0

    .line 239
    move-object v7, v3

    .line 240
    move-object v8, v13

    .line 241
    move v9, v14

    .line 242
    move-object v10, v1

    .line 243
    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/FlowLayoutKt;->rowMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    shl-int/lit8 v7, v4, 0x3

    .line 248
    .line 249
    and-int/lit8 v7, v7, 0x70

    .line 250
    .line 251
    const v8, -0x4ee9b9da

    .line 252
    .line 253
    .line 254
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 255
    .line 256
    .line 257
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    check-cast v8, Landroidx/compose/ui/unit/Density;

    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    check-cast v9, Landroidx/compose/ui/unit/LayoutDirection;

    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    check-cast v10, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 286
    .line 287
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 288
    .line 289
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 290
    .line 291
    .line 292
    move-result-object v12

    .line 293
    invoke-static {v2}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    shl-int/lit8 v7, v7, 0x9

    .line 298
    .line 299
    and-int/lit16 v7, v7, 0x1c00

    .line 300
    .line 301
    or-int/lit8 v7, v7, 0x6

    .line 302
    .line 303
    move-object/from16 p0, v2

    .line 304
    .line 305
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    .line 310
    .line 311
    if-nez v2, :cond_16

    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 314
    .line 315
    .line 316
    :cond_16
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 317
    .line 318
    .line 319
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-eqz v2, :cond_17

    .line 324
    .line 325
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 326
    .line 327
    .line 328
    goto :goto_12

    .line 329
    :cond_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 330
    .line 331
    .line 332
    :goto_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 333
    .line 334
    .line 335
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    invoke-static {v2, v0, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v2, v8, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v2, v9, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v2, v10, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 368
    .line 369
    .line 370
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    shr-int/lit8 v2, v7, 0x3

    .line 379
    .line 380
    and-int/lit8 v2, v2, 0x70

    .line 381
    .line 382
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    invoke-interface {v15, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    const v0, 0x7ab4aae9

    .line 390
    .line 391
    .line 392
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 396
    .line 397
    shr-int/lit8 v2, v4, 0x9

    .line 398
    .line 399
    and-int/lit8 v2, v2, 0x70

    .line 400
    .line 401
    or-int/lit8 v2, v2, 0x6

    .line 402
    .line 403
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-interface {v5, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 411
    .line 412
    .line 413
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 414
    .line 415
    .line 416
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 417
    .line 418
    .line 419
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_18

    .line 424
    .line 425
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 426
    .line 427
    .line 428
    :cond_18
    move-object v2, v3

    .line 429
    move-object v10, v13

    .line 430
    move v4, v14

    .line 431
    move-object/from16 v3, p0

    .line 432
    .line 433
    :goto_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    if-nez v8, :cond_19

    .line 438
    .line 439
    goto :goto_14

    .line 440
    :cond_19
    new-instance v9, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$2;

    .line 441
    .line 442
    move-object v0, v9

    .line 443
    move-object v1, v3

    .line 444
    move-object v3, v10

    .line 445
    move-object/from16 v5, p4

    .line 446
    .line 447
    move/from16 v6, p6

    .line 448
    .line 449
    move/from16 v7, p7

    .line 450
    .line 451
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILkotlin/jvm/functions/Function3;II)V

    .line 452
    .line 453
    .line 454
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 455
    .line 456
    .line 457
    :goto_14
    return-void
.end method

.method public static final synthetic access$intrinsicCrossAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)I
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/FlowLayoutKt;->intrinsicCrossAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$maxIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;III)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/FlowLayoutKt;->maxIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$minIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)I
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/FlowLayoutKt;->minIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final breakDownItems(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/OrientationIndependentConstraints;I)Landroidx/compose/foundation/layout/FlowResult;
    .locals 22

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const-string v1, "<this>"

    .line 6
    .line 7
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "measureHelper"

    .line 11
    .line 12
    move-object/from16 v7, p1

    .line 13
    .line 14
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "orientation"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "constraints"

    .line 23
    .line 24
    move-object/from16 v8, p3

    .line 25
    .line 26
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v9, Landroidx/compose/runtime/collection/MutableVector;

    .line 30
    .line 31
    const/16 v1, 0x10

    .line 32
    .line 33
    new-array v1, v1, [Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v9, v1, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMax()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMin()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getCrossAxisMax()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->getMeasurables()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->getPlaceables()[Landroidx/compose/ui/layout/Placeable;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->getArrangementSpacing-D9Ej5fM()F

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    invoke-interface {v6, v11}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    float-to-double v11, v11

    .line 68
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v11

    .line 72
    double-to-float v11, v11

    .line 73
    float-to-int v11, v11

    .line 74
    new-instance v12, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;

    .line 75
    .line 76
    invoke-direct {v12, v3, v1, v2, v4}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;-><init>(IIII)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    .line 84
    .line 85
    if-eqz v4, :cond_0

    .line 86
    .line 87
    new-instance v14, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$nextSize$1;

    .line 88
    .line 89
    invoke-direct {v14, v10}, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$nextSize$1;-><init>([Landroidx/compose/ui/layout/Placeable;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v12, v0, v14}, Landroidx/compose/foundation/layout/FlowLayoutKt;->measureAndCache(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/OrientationIndependentConstraints;Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function1;)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    const/4 v4, 0x0

    .line 102
    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result v14

    .line 106
    new-array v15, v14, [Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    move/from16 v18, v1

    .line 113
    .line 114
    move v13, v2

    .line 115
    move/from16 v17, v13

    .line 116
    .line 117
    move/from16 v19, v17

    .line 118
    .line 119
    move/from16 v20, v19

    .line 120
    .line 121
    :goto_1
    if-ge v13, v14, :cond_7

    .line 122
    .line 123
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    add-int v2, v17, v4

    .line 131
    .line 132
    sub-int v18, v18, v4

    .line 133
    .line 134
    add-int/lit8 v4, v13, 0x1

    .line 135
    .line 136
    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v17

    .line 140
    move/from16 v21, v1

    .line 141
    .line 142
    move-object/from16 v1, v17

    .line 143
    .line 144
    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    .line 145
    .line 146
    if-eqz v1, :cond_1

    .line 147
    .line 148
    new-instance v6, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$1;

    .line 149
    .line 150
    invoke-direct {v6, v10, v13}, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$1;-><init>([Landroidx/compose/ui/layout/Placeable;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v12, v0, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->measureAndCache(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/OrientationIndependentConstraints;Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function1;)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    add-int/2addr v1, v11

    .line 158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    goto :goto_2

    .line 163
    :cond_1
    const/4 v1, 0x0

    .line 164
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-ge v4, v6, :cond_4

    .line 169
    .line 170
    sub-int v6, v4, v19

    .line 171
    .line 172
    move/from16 v13, p4

    .line 173
    .line 174
    if-ge v6, v13, :cond_5

    .line 175
    .line 176
    if-eqz v1, :cond_2

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    goto :goto_3

    .line 183
    :cond_2
    const/4 v6, 0x0

    .line 184
    :goto_3
    sub-int v6, v18, v6

    .line 185
    .line 186
    if-gez v6, :cond_3

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_3
    move/from16 v17, v2

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_4
    move/from16 v13, p4

    .line 193
    .line 194
    :cond_5
    :goto_4
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    aput-object v3, v15, v20

    .line 203
    .line 204
    add-int/lit8 v20, v20, 0x1

    .line 205
    .line 206
    if-eqz v1, :cond_6

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    sub-int/2addr v1, v11

    .line 213
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    goto :goto_5

    .line 218
    :cond_6
    const/4 v1, 0x0

    .line 219
    :goto_5
    move v3, v2

    .line 220
    move/from16 v19, v4

    .line 221
    .line 222
    move/from16 v18, v21

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    :goto_6
    const/4 v2, 0x0

    .line 227
    move-object/from16 v6, p0

    .line 228
    .line 229
    move v13, v4

    .line 230
    move-object v4, v1

    .line 231
    move/from16 v1, v21

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_7
    const/4 v14, 0x0

    .line 235
    const/4 v1, 0x0

    .line 236
    const/16 v16, 0x0

    .line 237
    .line 238
    const/16 v17, 0xe

    .line 239
    .line 240
    const/16 v18, 0x0

    .line 241
    .line 242
    move v13, v3

    .line 243
    move-object v6, v15

    .line 244
    move v15, v1

    .line 245
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->copy$default(Landroidx/compose/foundation/layout/OrientationIndependentConstraints;IIIIILjava/lang/Object;)Landroidx/compose/foundation/layout/OrientationIndependentConstraints;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v1, v0}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(Landroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 250
    .line 251
    .line 252
    move-result-wide v10

    .line 253
    const/4 v0, 0x0

    .line 254
    invoke-static {v6, v0}, Lkotlin/collections/ArraysKt;->getOrNull([Ljava/lang/Object;I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Ljava/lang/Integer;

    .line 259
    .line 260
    move v4, v0

    .line 261
    move v13, v4

    .line 262
    move v14, v13

    .line 263
    move-object v12, v1

    .line 264
    move v15, v3

    .line 265
    :goto_7
    if-eqz v12, :cond_8

    .line 266
    .line 267
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    move-object/from16 v0, p1

    .line 272
    .line 273
    move-object/from16 v1, p0

    .line 274
    .line 275
    move-wide v2, v10

    .line 276
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measureWithoutPlacing-_EkL_-Y(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getCrossAxisSize()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    add-int/2addr v13, v1

    .line 285
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getMainAxisSize()I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    .line 290
    .line 291
    .line 292
    move-result v15

    .line 293
    invoke-virtual {v9, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    add-int/lit8 v14, v14, 0x1

    .line 301
    .line 302
    invoke-static {v6, v14}, Lkotlin/collections/ArraysKt;->getOrNull([Ljava/lang/Object;I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    move-object v12, v0

    .line 307
    check-cast v12, Ljava/lang/Integer;

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_8
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getCrossAxisMin()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMin()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    new-instance v2, Landroidx/compose/foundation/layout/FlowResult;

    .line 327
    .line 328
    invoke-direct {v2, v1, v0, v9}, Landroidx/compose/foundation/layout/FlowResult;-><init>(IILandroidx/compose/runtime/collection/MutableVector;)V

    .line 329
    .line 330
    .line 331
    return-object v2
.end method

.method private static final columnMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 7
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const v0, -0x77fd7175

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p5, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    and-int/lit8 p5, p5, 0x2

    .line 18
    .line 19
    if-eqz p5, :cond_1

    .line 20
    .line 21
    sget-object p1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    if-eqz p5, :cond_2

    .line 32
    .line 33
    const/4 p5, -0x1

    .line 34
    const-string v1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:181)"

    .line 35
    .line 36
    invoke-static {v0, p4, p5, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    and-int/lit8 p4, p4, 0xe

    .line 40
    .line 41
    invoke-static {p0, p3, p4}, Landroidx/compose/foundation/layout/FlowLayoutKt;->mainAxisColumnArrangement(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const p4, 0x44faf204

    .line 46
    .line 47
    .line 48
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p4

    .line 55
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p5

    .line 59
    if-nez p4, :cond_3

    .line 60
    .line 61
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 62
    .line 63
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    if-ne p5, p4, :cond_4

    .line 68
    .line 69
    :cond_3
    sget-object p4, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    .line 70
    .line 71
    invoke-virtual {p4, p1}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->horizontal$foundation_layout_release(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 72
    .line 73
    .line 74
    move-result-object p5

    .line 75
    invoke-interface {p3, p5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 79
    .line 80
    .line 81
    move-object v4, p5

    .line 82
    check-cast v4, Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 83
    .line 84
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    const p5, 0x607fb4c4

    .line 89
    .line 90
    .line 91
    invoke-interface {p3, p5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p5

    .line 98
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    or-int/2addr p1, p5

    .line 103
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p4

    .line 107
    or-int/2addr p1, p4

    .line 108
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p4

    .line 112
    if-nez p1, :cond_5

    .line 113
    .line 114
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 115
    .line 116
    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p4, p1, :cond_6

    .line 121
    .line 122
    :cond_5
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Vertical:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 123
    .line 124
    invoke-interface {p0}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    sget-object v5, Landroidx/compose/foundation/layout/FlowLayoutKt;->crossAxisColumnArrangement:Lkotlin/jvm/functions/Function4;

    .line 129
    .line 130
    sget-object v3, Landroidx/compose/foundation/layout/SizeMode;->Wrap:Landroidx/compose/foundation/layout/SizeMode;

    .line 131
    .line 132
    move v6, p2

    .line 133
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->flowMeasurePolicy-942rkJo(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function4;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 141
    .line 142
    .line 143
    check-cast p4, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 144
    .line 145
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eqz p0, :cond_7

    .line 150
    .line 151
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 152
    .line 153
    .line 154
    :cond_7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 155
    .line 156
    .line 157
    return-object p4
.end method

.method public static final crossAxisMin(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/LayoutOrientation;I)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "orientation"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    :goto_0
    return p0
.end method

.method public static final crossAxisSize(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/LayoutOrientation;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "orientation"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    :goto_0
    return p0
.end method

.method private static final flowMeasurePolicy-942rkJo(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function4;I)Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/LayoutOrientation;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Ljava/lang/Integer;",
            "-[I-",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-[I",
            "Lkotlin/Unit;",
            ">;F",
            "Landroidx/compose/foundation/layout/SizeMode;",
            "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/Integer;",
            "-[I-",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "-[I",
            "Lkotlin/Unit;",
            ">;I)",
            "Landroidx/compose/ui/layout/MeasurePolicy;"
        }
    .end annotation

    .line 1
    new-instance v8, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;

    .line 2
    .line 3
    move-object v0, v8

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move v6, p6

    .line 10
    move-object v7, p5

    .line 11
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1;-><init>(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;ILkotlin/jvm/functions/Function4;)V

    .line 12
    .line 13
    .line 14
    return-object v8
.end method

.method private static final intrinsicCrossAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;III)I"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 2
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    .line 3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v3, :cond_0

    return v4

    .line 4
    :cond_0
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    .line 5
    move-object v6, v3

    check-cast v6, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v6, :cond_1

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v6, v5, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    goto :goto_0

    :cond_1
    move v7, v4

    :goto_0
    if-eqz v6, :cond_2

    .line 6
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v6, v5, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    goto :goto_1

    :cond_2
    move v5, v4

    .line 7
    :goto_1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v6

    move/from16 v10, p3

    move v8, v4

    move v9, v8

    move v11, v9

    move v12, v11

    :goto_2
    if-ge v8, v6, :cond_8

    .line 8
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 9
    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 10
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sub-int/2addr v10, v5

    .line 11
    invoke-static {v11, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v8, v8, 0x1

    .line 12
    invoke-static {v0, v8}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    .line 13
    move-object v7, v5

    check-cast v7, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v7, :cond_3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v2, v7, v11, v13}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    goto :goto_3

    :cond_3
    move v11, v4

    :goto_3
    if-eqz v7, :cond_4

    .line 14
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v1, v7, v13, v14}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    add-int v7, v7, p4

    goto :goto_4

    :cond_4
    move v7, v4

    :goto_4
    if-ltz v10, :cond_5

    .line 15
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v13

    if-eq v8, v13, :cond_5

    sub-int v13, v8, v12

    move/from16 v14, p5

    if-eq v13, v14, :cond_6

    sub-int v13, v10, v7

    if-gez v13, :cond_7

    goto :goto_5

    :cond_5
    move/from16 v14, p5

    :cond_6
    :goto_5
    add-int/2addr v9, v3

    sub-int v7, v7, p4

    move/from16 v10, p3

    move v3, v4

    move v12, v8

    :cond_7
    move v15, v11

    move v11, v3

    move-object v3, v5

    move v5, v7

    move v7, v15

    goto :goto_2

    :cond_8
    return v9
.end method

.method private static final intrinsicCrossAxisSize(Ljava/util/List;[I[IIII)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;[I[IIII)I"
        }
    .end annotation

    .line 1
    new-instance v1, Landroidx/compose/foundation/layout/FlowLayoutKt$intrinsicCrossAxisSize$1;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/layout/FlowLayoutKt$intrinsicCrossAxisSize$1;-><init>([I)V

    new-instance v2, Landroidx/compose/foundation/layout/FlowLayoutKt$intrinsicCrossAxisSize$2;

    invoke-direct {v2, p2}, Landroidx/compose/foundation/layout/FlowLayoutKt$intrinsicCrossAxisSize$2;-><init>([I)V

    move-object v0, p0

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/FlowLayoutKt;->intrinsicCrossAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)I

    move-result p0

    return p0
.end method

.method private static final mainAxisColumnArrangement(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lkotlin/jvm/functions/Function5<",
            "Ljava/lang/Integer;",
            "[I",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/unit/Density;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    const v0, -0x61e8c291

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.foundation.layout.mainAxisColumnArrangement (FlowLayout.kt:134)"

    .line 15
    .line 16
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const p2, 0x44faf204

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 36
    .line 37
    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-ne v0, p2, :cond_2

    .line 42
    .line 43
    :cond_1
    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$mainAxisColumnArrangement$1$1;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Landroidx/compose/foundation/layout/FlowLayoutKt$mainAxisColumnArrangement$1$1;-><init>(Landroidx/compose/foundation/layout/Arrangement$Vertical;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 52
    .line 53
    .line 54
    check-cast v0, Lkotlin/jvm/functions/Function5;

    .line 55
    .line 56
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public static final mainAxisMin(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/LayoutOrientation;I)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "orientation"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    :goto_0
    return p0
.end method

.method private static final mainAxisRowArrangement(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lkotlin/jvm/functions/Function5<",
            "Ljava/lang/Integer;",
            "[I",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/unit/Density;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    const v0, 0x2c7d5351    # 3.5999712E-12f

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.foundation.layout.mainAxisRowArrangement (FlowLayout.kt:123)"

    .line 15
    .line 16
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const p2, 0x44faf204

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 36
    .line 37
    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-ne v0, p2, :cond_2

    .line 42
    .line 43
    :cond_1
    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$mainAxisRowArrangement$1$1;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Landroidx/compose/foundation/layout/FlowLayoutKt$mainAxisRowArrangement$1$1;-><init>(Landroidx/compose/foundation/layout/Arrangement$Horizontal;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 52
    .line 53
    .line 54
    check-cast v0, Lkotlin/jvm/functions/Function5;

    .line 55
    .line 56
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public static final mainAxisSize(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/LayoutOrientation;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "orientation"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    :goto_0
    return p0
.end method

.method private static final maxIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;III)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;III)I"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    move v4, v3

    .line 9
    move v5, v4

    .line 10
    :goto_0
    if-ge v2, v0, :cond_2

    .line 11
    .line 12
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    check-cast v6, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    invoke-interface {p1, v6, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    add-int/2addr v6, p3

    .line 37
    add-int/lit8 v7, v2, 0x1

    .line 38
    .line 39
    sub-int v8, v7, v4

    .line 40
    .line 41
    if-eq v8, p4, :cond_1

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-ne v7, v8, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    add-int/2addr v5, v6

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    :goto_1
    add-int/2addr v5, v6

    .line 53
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    move v5, v1

    .line 58
    move v4, v2

    .line 59
    :goto_2
    move v2, v7

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return v3
.end method

.method private static final measureAndCache(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/OrientationIndependentConstraints;Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function1;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;",
            "Landroidx/compose/foundation/layout/LayoutOrientation;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v0, v0, v1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/16 v6, 0xe

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->copy$default(Landroidx/compose/foundation/layout/OrientationIndependentConstraints;IIIIILjava/lang/Object;)Landroidx/compose/foundation/layout/OrientationIndependentConstraints;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(Landroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-interface {p0, v0, v1}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {p0, p2}, Landroidx/compose/foundation/layout/FlowLayoutKt;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/LayoutOrientation;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const p1, 0x7fffffff

    .line 48
    .line 49
    .line 50
    invoke-static {p0, p2, p1}, Landroidx/compose/foundation/layout/FlowLayoutKt;->mainAxisMin(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/LayoutOrientation;I)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    :goto_1
    return p0
.end method

.method private static final minIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;III)I"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v7, v0, [I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    aput v1, v7, v2

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    new-array v8, v2, [I

    .line 21
    .line 22
    move v3, v1

    .line 23
    :goto_1
    if-ge v3, v2, :cond_1

    .line 24
    .line 25
    aput v1, v8, v3

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    move v4, v1

    .line 35
    :goto_2
    if-ge v4, v3, :cond_2

    .line 36
    .line 37
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 42
    .line 43
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-interface {p1, v5, v6, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    aput v6, v7, v4

    .line 62
    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-interface {p2, v5, v9, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    aput v5, v8, v4

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    invoke-static {v7}, Lkotlin/collections/ArraysKt;->sum([I)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const/4 p2, 0x1

    .line 91
    if-nez v2, :cond_3

    .line 92
    .line 93
    move v2, p2

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    move v2, v1

    .line 96
    :goto_3
    if-nez v2, :cond_e

    .line 97
    .line 98
    aget v2, v8, v1

    .line 99
    .line 100
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 101
    .line 102
    invoke-static {v8}, Lkotlin/collections/ArraysKt;->getLastIndex([I)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-direct {v3, p2, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->iterator()Lkotlin/collections/IntIterator;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :cond_4
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_5

    .line 118
    .line 119
    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    aget v4, v8, v4

    .line 124
    .line 125
    if-ge v2, v4, :cond_4

    .line 126
    .line 127
    move v2, v4

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    if-nez v0, :cond_6

    .line 130
    .line 131
    move v0, p2

    .line 132
    goto :goto_5

    .line 133
    :cond_6
    move v0, v1

    .line 134
    :goto_5
    if-nez v0, :cond_d

    .line 135
    .line 136
    aget v0, v7, v1

    .line 137
    .line 138
    new-instance v1, Lkotlin/ranges/IntRange;

    .line 139
    .line 140
    invoke-static {v7}, Lkotlin/collections/ArraysKt;->getLastIndex([I)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-direct {v1, p2, v3}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Lkotlin/ranges/IntProgression;->iterator()Lkotlin/collections/IntIterator;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    :cond_7
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_8

    .line 156
    .line 157
    invoke-virtual {p2}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    aget v1, v7, v1

    .line 162
    .line 163
    if-ge v0, v1, :cond_7

    .line 164
    .line 165
    move v0, v1

    .line 166
    goto :goto_6

    .line 167
    :cond_8
    move p2, p1

    .line 168
    :goto_7
    if-ge v0, p1, :cond_c

    .line 169
    .line 170
    if-ne v2, p3, :cond_9

    .line 171
    .line 172
    return p2

    .line 173
    :cond_9
    add-int p2, v0, p1

    .line 174
    .line 175
    div-int/lit8 p2, p2, 0x2

    .line 176
    .line 177
    move-object v1, p0

    .line 178
    move-object v2, v7

    .line 179
    move-object v3, v8

    .line 180
    move v4, p2

    .line 181
    move v5, p4

    .line 182
    move v6, p5

    .line 183
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->intrinsicCrossAxisSize(Ljava/util/List;[I[IIII)I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-ne v2, p3, :cond_a

    .line 188
    .line 189
    return p2

    .line 190
    :cond_a
    if-le v2, p3, :cond_b

    .line 191
    .line 192
    add-int/lit8 v0, p2, 0x1

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_b
    add-int/lit8 p1, p2, -0x1

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_c
    return p2

    .line 199
    :cond_d
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 200
    .line 201
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 202
    .line 203
    .line 204
    throw p0

    .line 205
    :cond_e
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 206
    .line 207
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 208
    .line 209
    .line 210
    throw p0
.end method

.method private static final rowMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 7
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const v0, 0x582ba447

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p5, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/foundation/layout/Arrangement;->getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    and-int/lit8 p5, p5, 0x2

    .line 18
    .line 19
    if-eqz p5, :cond_1

    .line 20
    .line 21
    sget-object p1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    if-eqz p5, :cond_2

    .line 32
    .line 33
    const/4 p5, -0x1

    .line 34
    const-string v1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:158)"

    .line 35
    .line 36
    invoke-static {v0, p4, p5, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    and-int/lit8 p4, p4, 0xe

    .line 40
    .line 41
    invoke-static {p0, p3, p4}, Landroidx/compose/foundation/layout/FlowLayoutKt;->mainAxisRowArrangement(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const p4, 0x44faf204

    .line 46
    .line 47
    .line 48
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p4

    .line 55
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p5

    .line 59
    if-nez p4, :cond_3

    .line 60
    .line 61
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 62
    .line 63
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    if-ne p5, p4, :cond_4

    .line 68
    .line 69
    :cond_3
    sget-object p4, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    .line 70
    .line 71
    invoke-virtual {p4, p1}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->vertical$foundation_layout_release(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 72
    .line 73
    .line 74
    move-result-object p5

    .line 75
    invoke-interface {p3, p5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 79
    .line 80
    .line 81
    move-object v4, p5

    .line 82
    check-cast v4, Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 83
    .line 84
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    const p5, 0x607fb4c4

    .line 89
    .line 90
    .line 91
    invoke-interface {p3, p5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p5

    .line 98
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    or-int/2addr p1, p5

    .line 103
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p4

    .line 107
    or-int/2addr p1, p4

    .line 108
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p4

    .line 112
    if-nez p1, :cond_5

    .line 113
    .line 114
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 115
    .line 116
    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p4, p1, :cond_6

    .line 121
    .line 122
    :cond_5
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 123
    .line 124
    invoke-interface {p0}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    sget-object v3, Landroidx/compose/foundation/layout/SizeMode;->Wrap:Landroidx/compose/foundation/layout/SizeMode;

    .line 129
    .line 130
    sget-object v5, Landroidx/compose/foundation/layout/FlowLayoutKt;->crossAxisRowArrangement:Lkotlin/jvm/functions/Function4;

    .line 131
    .line 132
    move v6, p2

    .line 133
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->flowMeasurePolicy-942rkJo(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function4;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 141
    .line 142
    .line 143
    check-cast p4, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 144
    .line 145
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eqz p0, :cond_7

    .line 150
    .line 151
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 152
    .line 153
    .line 154
    :cond_7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 155
    .line 156
    .line 157
    return-object p4
.end method
