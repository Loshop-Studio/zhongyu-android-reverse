.class public final Landroidx/compose/material3/NavigationItemKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u001a\u00cd\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00002\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00052\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u0090\u0001\u0010\'\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0008\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\u00052\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u00022\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008%\u0010&\u001a6\u00102\u001a\u00020/*\u00020(2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010.\u001a\u00020-H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u00101\u001aV\u00106\u001a\u00020/*\u00020(2\u0006\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00105\u001aF\u00109\u001a\u00020/*\u00020(2\u0006\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00087\u00108\"\u001a\u0010:\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=\"\u001a\u0010>\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008>\u0010;\u001a\u0004\u0008?\u0010=\"\u0014\u0010A\u001a\u00020@8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008A\u0010B\"\u0014\u0010C\u001a\u00020@8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008C\u0010B\"\u0014\u0010D\u001a\u00020@8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008D\u0010B\"\u0014\u0010E\u001a\u00020@8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008E\u0010B\"\u0014\u0010G\u001a\u00020F8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008G\u0010H\"\u0014\u0010I\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010;\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006K\u00b2\u0006\u000e\u0010J\u001a\u00020F8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "selected",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "onClick",
        "Landroidx/compose/runtime/Composable;",
        "icon",
        "Landroidx/compose/ui/text/TextStyle;",
        "labelTextStyle",
        "Landroidx/compose/ui/graphics/Shape;",
        "indicatorShape",
        "Landroidx/compose/ui/unit/Dp;",
        "indicatorWidth",
        "indicatorHorizontalPadding",
        "indicatorVerticalPadding",
        "indicatorToLabelVerticalPadding",
        "startIconToLabelHorizontalPadding",
        "topIconItemVerticalPadding",
        "Landroidx/compose/material3/NavigationItemColors;",
        "colors",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "enabled",
        "label",
        "badge",
        "Landroidx/compose/material3/NavigationItemIconPosition;",
        "iconPosition",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "NavigationItem-SHbi2eg",
        "(ZLr6/a;Lr6/e;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "NavigationItem",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "Landroidx/compose/ui/graphics/Color;",
        "indicatorColor",
        "",
        "animationProgress",
        "NavigationItemLayout-KmRX-Dg",
        "(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lr6/e;ILr6/e;Lr6/a;FFFFFLandroidx/compose/runtime/Composer;II)V",
        "NavigationItemLayout",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Placeable;",
        "iconPlaceable",
        "indicatorRipplePlaceable",
        "indicatorPlaceable",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "placeIcon-X9ElhV4",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;",
        "placeIcon",
        "labelPlaceable",
        "placeLabelAndTopIcon-qoqLrGI",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;",
        "placeLabelAndTopIcon",
        "placeLabelAndStartIcon-nru01g4",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;",
        "placeLabelAndStartIcon",
        "NavigationItemMinWidth",
        "F",
        "getNavigationItemMinWidth",
        "()F",
        "NavigationItemMinHeight",
        "getNavigationItemMinHeight",
        "",
        "IndicatorRippleLayoutIdTag",
        "Ljava/lang/String;",
        "IndicatorLayoutIdTag",
        "IconLayoutIdTag",
        "LabelLayoutIdTag",
        "",
        "ItemAnimationDurationMillis",
        "I",
        "IndicatorVerticalOffset",
        "itemWidth",
        "material3_release"
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
        "SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,731:1\n1223#2,6:732\n1223#2,6:738\n1223#2,6:777\n1223#2,6:783\n1223#2,6:824\n71#3,3:744\n74#3:775\n78#3:792\n71#3:830\n68#3,6:831\n74#3:865\n78#3:869\n71#3:870\n68#3,6:871\n74#3:905\n78#3:909\n78#4,6:747\n85#4,4:762\n89#4,2:772\n93#4:791\n78#4:793\n76#4,8:794\n85#4,4:811\n89#4,2:821\n78#4,6:837\n85#4,4:852\n89#4,2:862\n93#4:868\n78#4,6:877\n85#4,4:892\n89#4,2:902\n93#4:908\n93#4:912\n368#5,9:753\n377#5:774\n378#5,2:789\n368#5,9:802\n377#5:823\n368#5,9:843\n377#5:864\n378#5,2:866\n368#5,9:883\n377#5:904\n378#5,2:906\n378#5,2:910\n4032#6,6:766\n4032#6,6:815\n4032#6,6:856\n4032#6,6:896\n77#7:776\n50#8:913\n50#8:914\n75#9:915\n108#9,2:916\n148#10:918\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n*L\n282#1:732,6\n295#1:738,6\n319#1:777,6\n331#1:783,6\n370#1:824,6\n284#1:744,3\n284#1:775\n284#1:792\n376#1:830\n376#1:831,6\n376#1:865\n376#1:869\n378#1:870\n378#1:871,6\n378#1:905\n378#1:909\n284#1:747,6\n284#1:762,4\n284#1:772,2\n284#1:791\n357#1:793\n357#1:794,8\n357#1:811,4\n357#1:821,2\n376#1:837,6\n376#1:852,4\n376#1:862,2\n376#1:868\n378#1:877,6\n378#1:892,4\n378#1:902,2\n378#1:908\n357#1:912\n284#1:753,9\n284#1:774\n284#1:789,2\n357#1:802,9\n357#1:823\n376#1:843,9\n376#1:864\n376#1:866,2\n378#1:883,9\n378#1:904\n378#1:906,2\n357#1:910,2\n284#1:766,6\n357#1:815,6\n376#1:856,6\n378#1:896,6\n311#1:776\n657#1:913\n666#1:914\n282#1:915\n282#1:916,2\n730#1:918\n*E\n"
    }
.end annotation


# static fields
.field private static final IconLayoutIdTag:Ljava/lang/String; = "icon"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorLayoutIdTag:Ljava/lang/String; = "indicator"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorRippleLayoutIdTag:Ljava/lang/String; = "indicatorRipple"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorVerticalOffset:F

.field private static final ItemAnimationDurationMillis:I = 0x64

.field private static final LabelLayoutIdTag:Ljava/lang/String; = "label"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final NavigationItemMinHeight:F

.field private static final NavigationItemMinWidth:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/material3/NavigationRailKt;->getNavigationRailItemWidth()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Landroidx/compose/material3/NavigationItemKt;->NavigationItemMinWidth:F

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/material3/NavigationRailKt;->getNavigationRailItemHeight()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Landroidx/compose/material3/NavigationItemKt;->NavigationItemMinHeight:F

    .line 12
    .line 13
    const/16 v0, 0xc

    .line 14
    .line 15
    int-to-float v0, v0

    .line 16
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sput v0, Landroidx/compose/material3/NavigationItemKt;->IndicatorVerticalOffset:F

    .line 21
    .line 22
    return-void
.end method

.method public static final NavigationItem-SHbi2eg(ZLr6/a;Lr6/e;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/material3/NavigationItemColors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p18    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lr6/a;",
            "Lr6/e;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/ui/graphics/Shape;",
            "FFFFFF",
            "Landroidx/compose/material3/NavigationItemColors;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lr6/e;",
            "Lr6/e;",
            "I",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v7, p5

    move-object/from16 v15, p14

    move-object/from16 v8, p15

    move/from16 v14, p16

    move-object/from16 v6, p17

    move/from16 v9, p19

    move/from16 v10, p20

    const v0, 0x20a982b4

    move-object/from16 v2, p18

    .line 1
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_1

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_2

    :cond_2
    const/16 v16, 0x10

    :goto_2
    or-int v2, v2, v16

    goto :goto_3

    :cond_3
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v3, v9, 0x180

    const/16 v16, 0x80

    const/16 v17, 0x100

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_4

    move/from16 v18, v17

    goto :goto_4

    :cond_4
    move/from16 v18, v16

    :goto_4
    or-int v2, v2, v18

    goto :goto_5

    :cond_5
    move-object/from16 v3, p2

    :goto_5
    and-int/lit16 v5, v9, 0xc00

    const/16 v19, 0x400

    const/16 v20, 0x800

    if-nez v5, :cond_7

    move-object/from16 v5, p3

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_6

    move/from16 v21, v20

    goto :goto_6

    :cond_6
    move/from16 v21, v19

    :goto_6
    or-int v2, v2, v21

    goto :goto_7

    :cond_7
    move-object/from16 v5, p3

    :goto_7
    and-int/lit16 v13, v9, 0x6000

    const/16 v22, 0x2000

    const/16 v23, 0x4000

    if-nez v13, :cond_9

    move-object/from16 v13, p4

    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_8

    move/from16 v24, v23

    goto :goto_8

    :cond_8
    move/from16 v24, v22

    :goto_8
    or-int v2, v2, v24

    goto :goto_9

    :cond_9
    move-object/from16 v13, p4

    :goto_9
    const/high16 v24, 0x30000

    and-int v25, v9, v24

    const/high16 v26, 0x10000

    const/high16 v27, 0x20000

    if-nez v25, :cond_b

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v25

    if-eqz v25, :cond_a

    move/from16 v25, v27

    goto :goto_a

    :cond_a
    move/from16 v25, v26

    :goto_a
    or-int v2, v2, v25

    :cond_b
    const/high16 v25, 0x180000

    and-int v28, v9, v25

    const/high16 v29, 0x80000

    const/high16 v30, 0x100000

    move/from16 v12, p6

    if-nez v28, :cond_d

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v31

    if-eqz v31, :cond_c

    move/from16 v31, v30

    goto :goto_b

    :cond_c
    move/from16 v31, v29

    :goto_b
    or-int v2, v2, v31

    :cond_d
    const/high16 v31, 0xc00000

    and-int v32, v9, v31

    const/high16 v33, 0x400000

    move/from16 v9, p7

    if-nez v32, :cond_f

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v32

    if-eqz v32, :cond_e

    const/high16 v32, 0x800000

    goto :goto_c

    :cond_e
    move/from16 v32, v33

    :goto_c
    or-int v2, v2, v32

    :cond_f
    const/high16 v32, 0x6000000

    and-int v32, p19, v32

    move/from16 v9, p8

    if-nez v32, :cond_11

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v32

    if-eqz v32, :cond_10

    const/high16 v32, 0x4000000

    goto :goto_d

    :cond_10
    const/high16 v32, 0x2000000

    :goto_d
    or-int v2, v2, v32

    :cond_11
    const/high16 v32, 0x30000000

    and-int v32, p19, v32

    move/from16 v9, p9

    if-nez v32, :cond_13

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v32

    if-eqz v32, :cond_12

    const/high16 v32, 0x20000000

    goto :goto_e

    :cond_12
    const/high16 v32, 0x10000000

    :goto_e
    or-int v2, v2, v32

    :cond_13
    and-int/lit8 v32, v10, 0x6

    move/from16 v9, p10

    if-nez v32, :cond_15

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v32

    if-eqz v32, :cond_14

    const/16 v32, 0x4

    goto :goto_f

    :cond_14
    const/16 v32, 0x2

    :goto_f
    or-int v32, v10, v32

    goto :goto_10

    :cond_15
    move/from16 v32, v10

    :goto_10
    and-int/lit8 v34, v10, 0x30

    move-object/from16 v0, p11

    if-nez v34, :cond_17

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_16

    const/16 v18, 0x20

    goto :goto_11

    :cond_16
    const/16 v18, 0x10

    :goto_11
    or-int v32, v32, v18

    :cond_17
    and-int/lit16 v0, v10, 0x180

    if-nez v0, :cond_19

    move-object/from16 v0, p12

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_18

    move/from16 v16, v17

    :cond_18
    or-int v32, v32, v16

    goto :goto_12

    :cond_19
    move-object/from16 v0, p12

    :goto_12
    and-int/lit16 v0, v10, 0xc00

    if-nez v0, :cond_1b

    move/from16 v0, p13

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_1a

    move/from16 v19, v20

    :cond_1a
    or-int v32, v32, v19

    goto :goto_13

    :cond_1b
    move/from16 v0, p13

    :goto_13
    and-int/lit16 v0, v10, 0x6000

    if-nez v0, :cond_1d

    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    move/from16 v22, v23

    :cond_1c
    or-int v32, v32, v22

    :cond_1d
    and-int v0, v10, v24

    if-nez v0, :cond_1f

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    move/from16 v26, v27

    :cond_1e
    or-int v32, v32, v26

    :cond_1f
    and-int v0, v10, v25

    if-nez v0, :cond_21

    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v0

    if-eqz v0, :cond_20

    move/from16 v29, v30

    :cond_20
    or-int v32, v32, v29

    :cond_21
    and-int v0, v10, v31

    if-nez v0, :cond_23

    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    const/high16 v33, 0x800000

    :cond_22
    or-int v32, v32, v33

    :cond_23
    move/from16 v0, v32

    const v16, 0x12492493

    and-int v1, v2, v16

    const v3, 0x12492492

    if-ne v1, v3, :cond_25

    const v1, 0x492493

    and-int/2addr v1, v0

    const v3, 0x492492

    if-ne v1, v3, :cond_25

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_24

    goto :goto_14

    .line 2
    :cond_24
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v2, v6

    move-object/from16 v20, v11

    goto/16 :goto_1c

    .line 3
    :cond_25
    :goto_14
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_26

    const-string v1, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)"

    const v3, 0x20a982b4

    invoke-static {v3, v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_26
    move/from16 v32, v0

    .line 4
    new-instance v0, Landroidx/compose/material3/NavigationItemKt$NavigationItem$styledIcon$1;

    move-object/from16 v5, p2

    move-object/from16 v1, p11

    move/from16 v3, p13

    move/from16 v23, v2

    move-object v4, v15

    const/high16 v15, 0x800000

    move/from16 v2, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/NavigationItemKt$NavigationItem$styledIcon$1;-><init>(Landroidx/compose/material3/NavigationItemColors;ZZLr6/e;Lr6/e;)V

    const v1, -0x2a46aa6

    const/4 v2, 0x1

    const/16 v3, 0x36

    invoke-static {v1, v2, v0, v11, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    const v1, -0x67702290

    .line 5
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz v8, :cond_27

    .line 6
    new-instance v1, Landroidx/compose/material3/NavigationItemKt$NavigationItem$iconWithBadge$1;

    invoke-direct {v1, v8, v0}, Landroidx/compose/material3/NavigationItemKt$NavigationItem$iconWithBadge$1;-><init>(Lr6/e;Lr6/e;)V

    const v0, 0x6d71f51b

    invoke-static {v0, v2, v1, v11, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    :cond_27
    move-object/from16 v24, v0

    .line 7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, -0x677008c4

    .line 8
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v0, 0x0

    if-nez p14, :cond_28

    move v8, v2

    :goto_15
    move-object/from16 v25, v0

    goto :goto_16

    :cond_28
    move-object v1, v0

    .line 9
    new-instance v0, Landroidx/compose/material3/NavigationItemKt$NavigationItem$styledLabel$1$1;

    move-object/from16 v4, p3

    move-object/from16 v1, p11

    move-object/from16 v5, p14

    move v8, v2

    move v15, v3

    move/from16 v2, p0

    move/from16 v3, p13

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/NavigationItemKt$NavigationItem$styledLabel$1$1;-><init>(Landroidx/compose/material3/NavigationItemColors;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;)V

    const v1, -0xf2ded12

    invoke-static {v1, v8, v0, v11, v15}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    goto :goto_15

    .line 10
    :goto_16
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 12
    sget-object v26, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v26 .. v26}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    const/4 v15, 0x0

    if-ne v0, v1, :cond_29

    .line 13
    invoke-static {v15}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    move-result-object v0

    .line 14
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_29
    check-cast v0, Landroidx/compose/runtime/MutableIntState;

    .line 16
    sget-object v1, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/semantics/Role$Companion;->getTab-o7Vup1c()I

    move-result v1

    const/4 v3, 0x0

    invoke-static {v1}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    move-result-object v5

    move/from16 v1, p0

    move/from16 v4, p13

    move-object v15, v0

    move-object v2, v6

    move-object/from16 v6, p1

    move-object/from16 v0, p12

    .line 17
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-O2vRcR0(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lr6/a;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 18
    sget v0, Landroidx/compose/material3/NavigationItemKt;->NavigationItemMinWidth:F

    sget v1, Landroidx/compose/material3/NavigationItemKt;->NavigationItemMinHeight:F

    invoke-static {v3, v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 20
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_2a

    .line 21
    new-instance v1, Landroidx/compose/material3/NavigationItemKt$NavigationItem$1$1;

    invoke-direct {v1, v15}, Landroidx/compose/material3/NavigationItemKt$NavigationItem$1$1;-><init>(Landroidx/compose/runtime/MutableIntState;)V

    .line 22
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 23
    :cond_2a
    check-cast v1, Lr6/c;

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/OnRemeasuredModifierKt;->onSizeChanged(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 24
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v1

    .line 25
    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    const/4 v3, 0x0

    .line 26
    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 27
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v3

    .line 28
    invoke-static {v11, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 29
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v6

    .line 30
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v17

    if-nez v17, :cond_2b

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 31
    :cond_2b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 32
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v17

    if-eqz v17, :cond_2c

    .line 33
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_17

    .line 34
    :cond_2c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 35
    :goto_17
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .line 36
    invoke-static {v5, v6, v1, v6, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v1

    .line 37
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v3

    if-nez v3, :cond_2d

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2e

    .line 38
    :cond_2d
    invoke-static {v4, v6, v4, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 39
    :cond_2e
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v1

    invoke-static {v6, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 40
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    if-eqz p0, :cond_2f

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_18

    :cond_2f
    const/4 v0, 0x0

    :goto_18
    const/16 v1, 0x64

    const/4 v3, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 41
    invoke-static {v1, v4, v5, v3, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v16

    const/16 v21, 0x30

    const/16 v22, 0x1c

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v1, v15

    move v15, v0

    move-object v0, v1

    move v3, v4

    move-object/from16 v20, v11

    const/high16 v1, 0x800000

    .line 42
    invoke-static/range {v15 .. v22}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lr6/c;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v4

    move-object/from16 v6, v20

    const v8, -0x616afa1b

    .line 43
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 44
    sget-object v8, Landroidx/compose/material3/NavigationItemIconPosition;->Companion:Landroidx/compose/material3/NavigationItemIconPosition$Companion;

    invoke-virtual {v8}, Landroidx/compose/material3/NavigationItemIconPosition$Companion;->getTop--xw1Ddg()I

    move-result v8

    invoke-static {v14, v8}, Landroidx/compose/material3/NavigationItemIconPosition;->equals-impl0(II)Z

    move-result v8

    if-eqz v8, :cond_33

    .line 45
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    .line 46
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    .line 47
    check-cast v8, Landroidx/compose/ui/unit/Density;

    .line 48
    invoke-static {v0}, Landroidx/compose/material3/NavigationItemKt;->NavigationItem_SHbi2eg$lambda$2(Landroidx/compose/runtime/MutableIntState;)I

    move-result v0

    invoke-interface {v8, v7}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v15

    sub-int/2addr v0, v15

    int-to-float v0, v0

    const/4 v15, 0x2

    int-to-float v15, v15

    div-float/2addr v0, v15

    .line 49
    sget v15, Landroidx/compose/material3/NavigationItemKt;->IndicatorVerticalOffset:F

    invoke-interface {v8, v15}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v8

    const/high16 p18, 0x1c00000

    .line 50
    invoke-static {v0, v8}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v11

    and-int v0, v32, p18

    if-ne v0, v1, :cond_30

    const/16 v27, 0x1

    goto :goto_19

    :cond_30
    move/from16 v27, v3

    .line 51
    :goto_19
    invoke-interface {v6, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v0

    or-int v0, v27, v0

    .line 52
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_31

    .line 53
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_32

    .line 54
    :cond_31
    new-instance v1, Landroidx/compose/material3/internal/MappedInteractionSource;

    invoke-direct {v1, v2, v11, v12, v5}, Landroidx/compose/material3/internal/MappedInteractionSource;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/e;)V

    .line 55
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 56
    :cond_32
    check-cast v1, Landroidx/compose/material3/internal/MappedInteractionSource;

    goto :goto_1a

    :cond_33
    const/high16 p18, 0x1c00000

    move-object v1, v5

    .line 57
    :goto_1a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v1, :cond_34

    move-object v9, v1

    goto :goto_1b

    :cond_34
    move-object v9, v2

    .line 58
    :goto_1b
    invoke-virtual/range {p11 .. p11}, Landroidx/compose/material3/NavigationItemColors;->getSelectedIndicatorColor-0d7_KjU()J

    move-result-wide v10

    .line 59
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .line 60
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_35

    .line 61
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_36

    .line 62
    :cond_35
    new-instance v1, Landroidx/compose/material3/NavigationItemKt$NavigationItem$2$3$1;

    invoke-direct {v1, v4}, Landroidx/compose/material3/NavigationItemKt$NavigationItem$2$3$1;-><init>(Landroidx/compose/runtime/State;)V

    .line 63
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 64
    :cond_36
    move-object/from16 v16, v1

    check-cast v16, Lr6/a;

    shr-int/lit8 v0, v23, 0x6

    and-int/lit16 v0, v0, 0x380

    shr-int/lit8 v1, v32, 0x6

    const v3, 0xe000

    and-int/2addr v1, v3

    or-int/2addr v0, v1

    shl-int/lit8 v1, v23, 0x3

    and-int v3, v1, p18

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v1

    or-int/2addr v0, v3

    const/high16 v3, 0x70000000

    and-int/2addr v1, v3

    or-int/2addr v0, v1

    shr-int/lit8 v1, v23, 0x1b

    and-int/lit8 v1, v1, 0xe

    shl-int/lit8 v3, v32, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v1, v3

    move/from16 v17, p6

    move/from16 v18, p7

    move/from16 v19, p8

    move/from16 v20, p9

    move/from16 v21, p10

    move/from16 v23, v0

    move-object/from16 v22, v6

    move-object v12, v13

    move-object/from16 v13, v24

    move-object/from16 v15, v25

    move/from16 v24, v1

    .line 65
    invoke-static/range {v9 .. v24}, Landroidx/compose/material3/NavigationItemKt;->NavigationItemLayout-KmRX-Dg(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lr6/e;ILr6/e;Lr6/a;FFFFFLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v20, v22

    .line 66
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_37

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 68
    :cond_37
    :goto_1c
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_38

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/NavigationItemKt$NavigationItem$3;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v35, v1

    move-object/from16 v18, v2

    move v6, v7

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v7, p6

    invoke-direct/range {v0 .. v20}, Landroidx/compose/material3/NavigationItemKt$NavigationItem$3;-><init>(ZLr6/a;Lr6/e;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;ILandroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    move-object/from16 v1, v35

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_38
    return-void
.end method

.method private static final NavigationItemLayout-KmRX-Dg(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lr6/e;ILr6/e;Lr6/a;FFFFFLandroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "J",
            "Landroidx/compose/ui/graphics/Shape;",
            "Lr6/e;",
            "I",
            "Lr6/e;",
            "Lr6/a;",
            "FFFFF",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move/from16 v6, p5

    .line 10
    .line 11
    move-object/from16 v7, p6

    .line 12
    .line 13
    move-object/from16 v8, p7

    .line 14
    .line 15
    move/from16 v0, p14

    .line 16
    .line 17
    const v9, 0x68c42e79

    .line 18
    .line 19
    .line 20
    move-object/from16 v10, p13

    .line 21
    .line 22
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v14

    .line 26
    and-int/lit8 v10, v0, 0x6

    .line 27
    .line 28
    if-nez v10, :cond_1

    .line 29
    .line 30
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    if-eqz v10, :cond_0

    .line 35
    .line 36
    const/4 v10, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v10, 0x2

    .line 39
    :goto_0
    or-int/2addr v10, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v10, v0

    .line 42
    :goto_1
    and-int/lit8 v13, v0, 0x30

    .line 43
    .line 44
    const/16 v16, 0x20

    .line 45
    .line 46
    if-nez v13, :cond_3

    .line 47
    .line 48
    invoke-interface {v14, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    if-eqz v13, :cond_2

    .line 53
    .line 54
    move/from16 v13, v16

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v13, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v10, v13

    .line 60
    :cond_3
    and-int/lit16 v13, v0, 0x180

    .line 61
    .line 62
    if-nez v13, :cond_5

    .line 63
    .line 64
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    if-eqz v13, :cond_4

    .line 69
    .line 70
    const/16 v13, 0x100

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/16 v13, 0x80

    .line 74
    .line 75
    :goto_3
    or-int/2addr v10, v13

    .line 76
    :cond_5
    and-int/lit16 v13, v0, 0xc00

    .line 77
    .line 78
    if-nez v13, :cond_7

    .line 79
    .line 80
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    if-eqz v13, :cond_6

    .line 85
    .line 86
    const/16 v13, 0x800

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    const/16 v13, 0x400

    .line 90
    .line 91
    :goto_4
    or-int/2addr v10, v13

    .line 92
    :cond_7
    and-int/lit16 v13, v0, 0x6000

    .line 93
    .line 94
    if-nez v13, :cond_9

    .line 95
    .line 96
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-eqz v13, :cond_8

    .line 101
    .line 102
    const/16 v13, 0x4000

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_8
    const/16 v13, 0x2000

    .line 106
    .line 107
    :goto_5
    or-int/2addr v10, v13

    .line 108
    :cond_9
    const/high16 v13, 0x30000

    .line 109
    .line 110
    and-int/2addr v13, v0

    .line 111
    if-nez v13, :cond_b

    .line 112
    .line 113
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    if-eqz v13, :cond_a

    .line 118
    .line 119
    const/high16 v13, 0x20000

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    const/high16 v13, 0x10000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v10, v13

    .line 125
    :cond_b
    const/high16 v13, 0x180000

    .line 126
    .line 127
    and-int/2addr v13, v0

    .line 128
    if-nez v13, :cond_d

    .line 129
    .line 130
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v13

    .line 134
    if-eqz v13, :cond_c

    .line 135
    .line 136
    const/high16 v13, 0x100000

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    const/high16 v13, 0x80000

    .line 140
    .line 141
    :goto_7
    or-int/2addr v10, v13

    .line 142
    :cond_d
    const/high16 v13, 0xc00000

    .line 143
    .line 144
    and-int/2addr v13, v0

    .line 145
    if-nez v13, :cond_f

    .line 146
    .line 147
    move/from16 v13, p8

    .line 148
    .line 149
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 150
    .line 151
    .line 152
    move-result v17

    .line 153
    if-eqz v17, :cond_e

    .line 154
    .line 155
    const/high16 v17, 0x800000

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_e
    const/high16 v17, 0x400000

    .line 159
    .line 160
    :goto_8
    or-int v10, v10, v17

    .line 161
    .line 162
    goto :goto_9

    .line 163
    :cond_f
    move/from16 v13, p8

    .line 164
    .line 165
    :goto_9
    const/high16 v17, 0x6000000

    .line 166
    .line 167
    and-int v17, v0, v17

    .line 168
    .line 169
    move/from16 v11, p9

    .line 170
    .line 171
    if-nez v17, :cond_11

    .line 172
    .line 173
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 174
    .line 175
    .line 176
    move-result v18

    .line 177
    if-eqz v18, :cond_10

    .line 178
    .line 179
    const/high16 v18, 0x4000000

    .line 180
    .line 181
    goto :goto_a

    .line 182
    :cond_10
    const/high16 v18, 0x2000000

    .line 183
    .line 184
    :goto_a
    or-int v10, v10, v18

    .line 185
    .line 186
    :cond_11
    const/high16 v18, 0x30000000

    .line 187
    .line 188
    and-int v18, v0, v18

    .line 189
    .line 190
    move/from16 v15, p10

    .line 191
    .line 192
    if-nez v18, :cond_13

    .line 193
    .line 194
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 195
    .line 196
    .line 197
    move-result v19

    .line 198
    if-eqz v19, :cond_12

    .line 199
    .line 200
    const/high16 v19, 0x20000000

    .line 201
    .line 202
    goto :goto_b

    .line 203
    :cond_12
    const/high16 v19, 0x10000000

    .line 204
    .line 205
    :goto_b
    or-int v10, v10, v19

    .line 206
    .line 207
    :cond_13
    and-int/lit8 v19, p15, 0x6

    .line 208
    .line 209
    move/from16 v12, p11

    .line 210
    .line 211
    if-nez v19, :cond_15

    .line 212
    .line 213
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 214
    .line 215
    .line 216
    move-result v20

    .line 217
    if-eqz v20, :cond_14

    .line 218
    .line 219
    const/16 v17, 0x4

    .line 220
    .line 221
    goto :goto_c

    .line 222
    :cond_14
    const/16 v17, 0x2

    .line 223
    .line 224
    :goto_c
    or-int v17, p15, v17

    .line 225
    .line 226
    goto :goto_d

    .line 227
    :cond_15
    move/from16 v17, p15

    .line 228
    .line 229
    :goto_d
    and-int/lit8 v19, p15, 0x30

    .line 230
    .line 231
    move/from16 v13, p12

    .line 232
    .line 233
    if-nez v19, :cond_17

    .line 234
    .line 235
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 236
    .line 237
    .line 238
    move-result v19

    .line 239
    if-eqz v19, :cond_16

    .line 240
    .line 241
    goto :goto_e

    .line 242
    :cond_16
    const/16 v16, 0x10

    .line 243
    .line 244
    :goto_e
    or-int v17, v17, v16

    .line 245
    .line 246
    :cond_17
    move/from16 v9, v17

    .line 247
    .line 248
    const v17, 0x12492493

    .line 249
    .line 250
    .line 251
    and-int v0, v10, v17

    .line 252
    .line 253
    const v8, 0x12492492

    .line 254
    .line 255
    .line 256
    if-ne v0, v8, :cond_19

    .line 257
    .line 258
    and-int/lit8 v0, v9, 0x13

    .line 259
    .line 260
    const/16 v8, 0x12

    .line 261
    .line 262
    if-ne v0, v8, :cond_19

    .line 263
    .line 264
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-nez v0, :cond_18

    .line 269
    .line 270
    goto :goto_f

    .line 271
    :cond_18
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 272
    .line 273
    .line 274
    move-object/from16 v9, p7

    .line 275
    .line 276
    goto/16 :goto_17

    .line 277
    .line 278
    :cond_19
    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_1a

    .line 283
    .line 284
    const-string v0, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:355)"

    .line 285
    .line 286
    const v8, 0x68c42e79

    .line 287
    .line 288
    .line 289
    invoke-static {v8, v10, v9, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 290
    .line 291
    .line 292
    :cond_1a
    const/4 v8, 0x0

    .line 293
    if-eqz v7, :cond_1b

    .line 294
    .line 295
    sget-object v9, Landroidx/compose/material3/NavigationItemIconPosition;->Companion:Landroidx/compose/material3/NavigationItemIconPosition$Companion;

    .line 296
    .line 297
    invoke-virtual {v9}, Landroidx/compose/material3/NavigationItemIconPosition$Companion;->getTop--xw1Ddg()I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    invoke-static {v6, v9}, Landroidx/compose/material3/NavigationItemIconPosition;->equals-impl0(II)Z

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    if-eqz v9, :cond_1c

    .line 306
    .line 307
    :cond_1b
    move v0, v8

    .line 308
    move/from16 v17, v10

    .line 309
    .line 310
    goto :goto_10

    .line 311
    :cond_1c
    move v9, v8

    .line 312
    new-instance v8, Landroidx/compose/material3/StartIconMeasurePolicy;

    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    move v0, v9

    .line 316
    move/from16 v17, v10

    .line 317
    .line 318
    move-object/from16 v9, p7

    .line 319
    .line 320
    move/from16 v10, p8

    .line 321
    .line 322
    invoke-direct/range {v8 .. v13}, Landroidx/compose/material3/StartIconMeasurePolicy;-><init>(Lr6/a;FFFLkotlin/jvm/internal/e;)V

    .line 323
    .line 324
    .line 325
    move-object v6, v14

    .line 326
    goto :goto_12

    .line 327
    :goto_10
    new-instance v8, Landroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy;

    .line 328
    .line 329
    if-eqz v7, :cond_1d

    .line 330
    .line 331
    const/4 v9, 0x1

    .line 332
    goto :goto_11

    .line 333
    :cond_1d
    move v9, v0

    .line 334
    :goto_11
    const/4 v15, 0x0

    .line 335
    move-object/from16 v10, p7

    .line 336
    .line 337
    move/from16 v11, p8

    .line 338
    .line 339
    move/from16 v12, p9

    .line 340
    .line 341
    move/from16 v13, p10

    .line 342
    .line 343
    move-object v6, v14

    .line 344
    move/from16 v14, p12

    .line 345
    .line 346
    invoke-direct/range {v8 .. v15}, Landroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy;-><init>(ZLr6/a;FFFFLkotlin/jvm/internal/e;)V

    .line 347
    .line 348
    .line 349
    move-object v9, v10

    .line 350
    :goto_12
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 351
    .line 352
    invoke-static {v6, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    invoke-static {v6, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 365
    .line 366
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 367
    .line 368
    .line 369
    move-result-object v15

    .line 370
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 371
    .line 372
    .line 373
    move-result-object v16

    .line 374
    if-nez v16, :cond_1e

    .line 375
    .line 376
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 377
    .line 378
    .line 379
    :cond_1e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 380
    .line 381
    .line 382
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 383
    .line 384
    .line 385
    move-result v16

    .line 386
    if-eqz v16, :cond_1f

    .line 387
    .line 388
    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 389
    .line 390
    .line 391
    goto :goto_13

    .line 392
    :cond_1f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 393
    .line 394
    .line 395
    :goto_13
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 396
    .line 397
    .line 398
    move-result-object v15

    .line 399
    invoke-static {v14, v15, v8, v15, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 404
    .line 405
    .line 406
    move-result v12

    .line 407
    if-nez v12, :cond_20

    .line 408
    .line 409
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v12

    .line 413
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-nez v0, :cond_21

    .line 422
    .line 423
    :cond_20
    invoke-static {v11, v15, v11, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 424
    .line 425
    .line 426
    :cond_21
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-static {v15, v13, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 431
    .line 432
    .line 433
    const-string v0, "indicatorRipple"

    .line 434
    .line 435
    invoke-static {v10, v0}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {v0, v4}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const/4 v15, 0x0

    .line 444
    const/16 v16, 0x7

    .line 445
    .line 446
    move-object v8, v10

    .line 447
    const/4 v10, 0x0

    .line 448
    const/4 v11, 0x0

    .line 449
    const-wide/16 v12, 0x0

    .line 450
    .line 451
    move-object/from16 v22, v14

    .line 452
    .line 453
    move-object v14, v6

    .line 454
    move-object/from16 v6, v22

    .line 455
    .line 456
    invoke-static/range {v10 .. v16}, Landroidx/compose/material3/RippleKt;->rippleOrFallbackImplementation-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 457
    .line 458
    .line 459
    move-result-object v10

    .line 460
    invoke-static {v0, v1, v10}, Landroidx/compose/foundation/IndicationKt;->indication(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/Indication;)Landroidx/compose/ui/Modifier;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    const/4 v10, 0x0

    .line 465
    invoke-static {v0, v14, v10}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 466
    .line 467
    .line 468
    const-string v0, "indicator"

    .line 469
    .line 470
    invoke-static {v8, v0}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    const/high16 v10, 0x380000

    .line 475
    .line 476
    and-int v10, v17, v10

    .line 477
    .line 478
    const/high16 v11, 0x100000

    .line 479
    .line 480
    if-ne v10, v11, :cond_22

    .line 481
    .line 482
    const/4 v10, 0x1

    .line 483
    goto :goto_14

    .line 484
    :cond_22
    const/4 v10, 0x0

    .line 485
    :goto_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v11

    .line 489
    if-nez v10, :cond_23

    .line 490
    .line 491
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 492
    .line 493
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v10

    .line 497
    if-ne v11, v10, :cond_24

    .line 498
    .line 499
    :cond_23
    new-instance v11, Landroidx/compose/material3/NavigationItemKt$NavigationItemLayout$1$1$1;

    .line 500
    .line 501
    invoke-direct {v11, v9}, Landroidx/compose/material3/NavigationItemKt$NavigationItemLayout$1$1$1;-><init>(Lr6/a;)V

    .line 502
    .line 503
    .line 504
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    :cond_24
    check-cast v11, Lr6/c;

    .line 508
    .line 509
    invoke-static {v0, v11}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-static {v0, v2, v3, v4}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    const/4 v10, 0x0

    .line 518
    invoke-static {v0, v14, v10}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 519
    .line 520
    .line 521
    const-string v0, "icon"

    .line 522
    .line 523
    invoke-static {v8, v0}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 528
    .line 529
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 530
    .line 531
    .line 532
    move-result-object v12

    .line 533
    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 534
    .line 535
    .line 536
    move-result-object v12

    .line 537
    invoke-static {v14, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 538
    .line 539
    .line 540
    move-result v13

    .line 541
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 542
    .line 543
    .line 544
    move-result-object v10

    .line 545
    invoke-static {v14, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 550
    .line 551
    .line 552
    move-result-object v15

    .line 553
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 554
    .line 555
    .line 556
    move-result-object v16

    .line 557
    if-nez v16, :cond_25

    .line 558
    .line 559
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 560
    .line 561
    .line 562
    :cond_25
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 563
    .line 564
    .line 565
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 566
    .line 567
    .line 568
    move-result v16

    .line 569
    if-eqz v16, :cond_26

    .line 570
    .line 571
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 572
    .line 573
    .line 574
    goto :goto_15

    .line 575
    :cond_26
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 576
    .line 577
    .line 578
    :goto_15
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 579
    .line 580
    .line 581
    move-result-object v15

    .line 582
    invoke-static {v6, v15, v12, v15, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 583
    .line 584
    .line 585
    move-result-object v10

    .line 586
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 587
    .line 588
    .line 589
    move-result v12

    .line 590
    if-nez v12, :cond_27

    .line 591
    .line 592
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v12

    .line 596
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    if-nez v1, :cond_28

    .line 605
    .line 606
    :cond_27
    invoke-static {v13, v15, v13, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 607
    .line 608
    .line 609
    :cond_28
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-static {v15, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 614
    .line 615
    .line 616
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 617
    .line 618
    shr-int/lit8 v0, v17, 0x9

    .line 619
    .line 620
    and-int/lit8 v0, v0, 0xe

    .line 621
    .line 622
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-interface {v5, v14, v0}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 630
    .line 631
    .line 632
    const v0, -0x2e4c22e6

    .line 633
    .line 634
    .line 635
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 636
    .line 637
    .line 638
    if-eqz v7, :cond_2d

    .line 639
    .line 640
    const-string v0, "label"

    .line 641
    .line 642
    invoke-static {v8, v0}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    const/4 v10, 0x0

    .line 651
    invoke-static {v1, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-static {v14, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 656
    .line 657
    .line 658
    move-result v8

    .line 659
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 660
    .line 661
    .line 662
    move-result-object v10

    .line 663
    invoke-static {v14, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 668
    .line 669
    .line 670
    move-result-object v11

    .line 671
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 672
    .line 673
    .line 674
    move-result-object v12

    .line 675
    if-nez v12, :cond_29

    .line 676
    .line 677
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 678
    .line 679
    .line 680
    :cond_29
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 681
    .line 682
    .line 683
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 684
    .line 685
    .line 686
    move-result v12

    .line 687
    if-eqz v12, :cond_2a

    .line 688
    .line 689
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 690
    .line 691
    .line 692
    goto :goto_16

    .line 693
    :cond_2a
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 694
    .line 695
    .line 696
    :goto_16
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 697
    .line 698
    .line 699
    move-result-object v11

    .line 700
    invoke-static {v6, v11, v1, v11, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 705
    .line 706
    .line 707
    move-result v10

    .line 708
    if-nez v10, :cond_2b

    .line 709
    .line 710
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v10

    .line 714
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 715
    .line 716
    .line 717
    move-result-object v12

    .line 718
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v10

    .line 722
    if-nez v10, :cond_2c

    .line 723
    .line 724
    :cond_2b
    invoke-static {v8, v11, v8, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 725
    .line 726
    .line 727
    :cond_2c
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    invoke-static {v11, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 732
    .line 733
    .line 734
    shr-int/lit8 v0, v17, 0xf

    .line 735
    .line 736
    and-int/lit8 v0, v0, 0xe

    .line 737
    .line 738
    invoke-static {v14, v0, v7}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 739
    .line 740
    .line 741
    :cond_2d
    invoke-static {v14}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-eqz v0, :cond_2e

    .line 746
    .line 747
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 748
    .line 749
    .line 750
    :cond_2e
    :goto_17
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    if-eqz v0, :cond_2f

    .line 755
    .line 756
    move-object v1, v0

    .line 757
    new-instance v0, Landroidx/compose/material3/NavigationItemKt$NavigationItemLayout$2;

    .line 758
    .line 759
    move/from16 v6, p5

    .line 760
    .line 761
    move/from16 v10, p9

    .line 762
    .line 763
    move/from16 v11, p10

    .line 764
    .line 765
    move/from16 v12, p11

    .line 766
    .line 767
    move/from16 v13, p12

    .line 768
    .line 769
    move/from16 v14, p14

    .line 770
    .line 771
    move/from16 v15, p15

    .line 772
    .line 773
    move-object/from16 v21, v1

    .line 774
    .line 775
    move-object v8, v9

    .line 776
    move-object/from16 v1, p0

    .line 777
    .line 778
    move/from16 v9, p8

    .line 779
    .line 780
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/NavigationItemKt$NavigationItemLayout$2;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lr6/e;ILr6/e;Lr6/a;FFFFFII)V

    .line 781
    .line 782
    .line 783
    move-object/from16 v1, v21

    .line 784
    .line 785
    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 786
    .line 787
    .line 788
    :cond_2f
    return-void
.end method

.method private static final NavigationItem_SHbi2eg$lambda$2(Landroidx/compose/runtime/MutableIntState;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final NavigationItem_SHbi2eg$lambda$3(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$NavigationItemLayout-KmRX-Dg(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lr6/e;ILr6/e;Lr6/a;FFFFFLandroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p15}, Landroidx/compose/material3/NavigationItemKt;->NavigationItemLayout-KmRX-Dg(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lr6/e;ILr6/e;Lr6/a;FFFFFLandroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$NavigationItem_SHbi2eg$lambda$3(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/NavigationItemKt;->NavigationItem_SHbi2eg$lambda$3(Landroidx/compose/runtime/MutableIntState;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/NavigationItemKt;->placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$placeLabelAndStartIcon-nru01g4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/NavigationItemKt;->placeLabelAndStartIcon-nru01g4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$placeLabelAndTopIcon-qoqLrGI(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/NavigationItemKt;->placeLabelAndTopIcon-qoqLrGI(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final getNavigationItemMinHeight()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationItemKt;->NavigationItemMinHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationItemMinWidth()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationItemKt;->NavigationItemMinWidth:F

    .line 2
    .line 3
    return v0
.end method

.method private static final placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 12

    .line 1
    move-wide/from16 v2, p4

    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v2, v3, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 8
    .line 9
    .line 10
    move-result v10

    .line 11
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v2, v3, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    .line 16
    .line 17
    .line 18
    move-result v11

    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {p3, v10, v0}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {p3, v11, v0}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {p1, v10, v0}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {p1, v11, v0}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-static {p2, v10, v0}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    invoke-static {p2, v11, v0}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    new-instance v0, Landroidx/compose/material3/NavigationItemKt$placeIcon$1;

    .line 45
    .line 46
    move-object v4, p1

    .line 47
    move-object v7, p2

    .line 48
    move-object v1, p3

    .line 49
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/NavigationItemKt$placeIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;II)V

    .line 50
    .line 51
    .line 52
    const/4 v6, 0x4

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    move-object v1, p0

    .line 56
    move-object v5, v0

    .line 57
    move v2, v10

    .line 58
    move v3, v11

    .line 59
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method

.method private static final placeLabelAndStartIcon-nru01g4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-wide/from16 v3, p5

    .line 8
    .line 9
    move/from16 v1, p7

    .line 10
    .line 11
    invoke-virtual {v11}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-static {v3, v4, v5}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 16
    .line 17
    .line 18
    move-result v14

    .line 19
    invoke-virtual {v11}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-static {v3, v4, v5}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    .line 24
    .line 25
    .line 26
    move-result v15

    .line 27
    const/4 v3, 0x2

    .line 28
    invoke-static {v2, v14, v3}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    move v5, v4

    .line 33
    invoke-static {v2, v15, v3}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    move-object/from16 v8, p2

    .line 38
    .line 39
    invoke-static {v8, v15, v3}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    move-object/from16 v6, p1

    .line 44
    .line 45
    invoke-static {v6, v15, v3}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-interface {v0, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    add-int/2addr v12, v9

    .line 58
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    add-int/2addr v9, v12

    .line 63
    sub-int v9, v14, v9

    .line 64
    .line 65
    div-int/2addr v9, v3

    .line 66
    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    add-int/2addr v12, v9

    .line 71
    invoke-interface {v0, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/2addr v1, v12

    .line 76
    invoke-static {v11, v14, v3}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    invoke-static {v11, v15, v3}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    move v6, v1

    .line 85
    new-instance v1, Landroidx/compose/material3/NavigationItemKt$placeLabelAndStartIcon$1;

    .line 86
    .line 87
    move v3, v5

    .line 88
    move-object/from16 v5, p1

    .line 89
    .line 90
    invoke-direct/range {v1 .. v13}, Landroidx/compose/material3/NavigationItemKt$placeLabelAndStartIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;II)V

    .line 91
    .line 92
    .line 93
    const/4 v2, 0x4

    .line 94
    const/4 v3, 0x0

    .line 95
    const/4 v4, 0x0

    .line 96
    move-object/from16 p1, v0

    .line 97
    .line 98
    move-object/from16 p5, v1

    .line 99
    .line 100
    move/from16 p6, v2

    .line 101
    .line 102
    move-object/from16 p7, v3

    .line 103
    .line 104
    move-object/from16 p4, v4

    .line 105
    .line 106
    move/from16 p2, v14

    .line 107
    .line 108
    move/from16 p3, v15

    .line 109
    .line 110
    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0
.end method

.method private static final placeLabelAndTopIcon-qoqLrGI(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p5

    .line 4
    .line 5
    move/from16 v3, p7

    .line 6
    .line 7
    move/from16 v4, p8

    .line 8
    .line 9
    move/from16 v5, p9

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    invoke-static {v1, v2, v6}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    int-to-float v7, v7

    .line 32
    invoke-interface {v0, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    add-float/2addr v8, v7

    .line 37
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    int-to-float v7, v7

    .line 42
    add-float/2addr v8, v7

    .line 43
    invoke-interface {v0, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const/4 v9, 0x2

    .line 48
    int-to-float v10, v9

    .line 49
    mul-float/2addr v7, v10

    .line 50
    add-float/2addr v7, v8

    .line 51
    invoke-static {v7}, Lt6/a;->q(F)I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-static {v1, v2, v7}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-float v2, v5, v4

    .line 60
    .line 61
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-interface {v0, v2}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 66
    .line 67
    .line 68
    move-result v19

    .line 69
    move-object/from16 v2, p2

    .line 70
    .line 71
    invoke-static {v2, v6, v9}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 72
    .line 73
    .line 74
    move-result v18

    .line 75
    move-object/from16 v11, p4

    .line 76
    .line 77
    invoke-static {v11, v6, v9}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    invoke-interface {v0, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    sub-int v13, v19, v5

    .line 86
    .line 87
    move-object/from16 v14, p1

    .line 88
    .line 89
    invoke-static {v14, v6, v9}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    add-int v5, v5, v19

    .line 98
    .line 99
    add-float/2addr v3, v4

    .line 100
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    invoke-interface {v0, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    add-int v16, v3, v5

    .line 109
    .line 110
    move-object/from16 v3, p3

    .line 111
    .line 112
    invoke-static {v3, v6, v9}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 113
    .line 114
    .line 115
    move-result v21

    .line 116
    new-instance v10, Landroidx/compose/material3/NavigationItemKt$placeLabelAndTopIcon$1;

    .line 117
    .line 118
    move/from16 v22, v13

    .line 119
    .line 120
    move-object/from16 v17, v2

    .line 121
    .line 122
    move-object/from16 v20, v3

    .line 123
    .line 124
    invoke-direct/range {v10 .. v22}, Landroidx/compose/material3/NavigationItemKt$placeLabelAndTopIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;II)V

    .line 125
    .line 126
    .line 127
    const/4 v2, 0x4

    .line 128
    const/4 v3, 0x0

    .line 129
    const/4 v4, 0x0

    .line 130
    move-object/from16 p1, v0

    .line 131
    .line 132
    move/from16 p3, v1

    .line 133
    .line 134
    move/from16 p6, v2

    .line 135
    .line 136
    move-object/from16 p7, v3

    .line 137
    .line 138
    move-object/from16 p4, v4

    .line 139
    .line 140
    move/from16 p2, v6

    .line 141
    .line 142
    move-object/from16 p5, v10

    .line 143
    .line 144
    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    return-object v0
.end method
