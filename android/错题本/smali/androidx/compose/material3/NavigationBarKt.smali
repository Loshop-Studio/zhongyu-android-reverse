.class public final Landroidx/compose/material3/NavigationBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u001ab\u0010\u0011\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0008\u000c\u00a2\u0006\u0002\u0008\rH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0087\u0001\u0010\u001e\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00142\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00122\u0015\u0008\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001as\u0010$\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014\u00a2\u0006\u0002\u0008\u000c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014\u00a2\u0006\u0002\u0008\u000c2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014\u00a2\u0006\u0002\u0008\u000c2\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u000c2\u0006\u0010\u0019\u001a\u00020\u00122\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0014H\u0003\u00a2\u0006\u0004\u0008$\u0010%\u001a8\u00100\u001a\u00020-*\u00020&2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'2\u0008\u0010*\u001a\u0004\u0018\u00010\'2\u0006\u0010,\u001a\u00020+H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010/\u001aP\u00104\u001a\u00020-*\u00020&2\u0006\u00101\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'2\u0008\u0010*\u001a\u0004\u0018\u00010\'2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00082\u00103\"\u0014\u00106\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00086\u00107\"\u0014\u00108\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00088\u00107\"\u0014\u00109\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00089\u00107\"\u0014\u0010:\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008:\u00107\"\u0014\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<\"\u0014\u0010>\u001a\u00020=8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008>\u0010?\"\u001a\u0010@\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010<\u001a\u0004\u0008A\u0010B\"\u001a\u0010C\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008C\u0010<\u001a\u0004\u0008D\u0010B\"\u0014\u0010E\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010<\"\u001a\u0010F\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010<\u001a\u0004\u0008G\u0010B\"\u0014\u0010H\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010<\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006L\u00b2\u0006\u000c\u0010I\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010J\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010K\u001a\u00020=8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/ui/graphics/Color;",
        "containerColor",
        "contentColor",
        "Landroidx/compose/ui/unit/Dp;",
        "tonalElevation",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "windowInsets",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Ld6/s;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "NavigationBar-HsRjFd4",
        "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V",
        "NavigationBar",
        "",
        "selected",
        "Lkotlin/Function0;",
        "onClick",
        "icon",
        "enabled",
        "label",
        "alwaysShowLabel",
        "Landroidx/compose/material3/NavigationBarItemColors;",
        "colors",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "NavigationBarItem",
        "(Landroidx/compose/foundation/layout/RowScope;ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "indicatorRipple",
        "indicator",
        "",
        "animationProgress",
        "NavigationBarItemLayout",
        "(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V",
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
        "placeLabelAndIcon-zUg2_y0",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;",
        "placeLabelAndIcon",
        "",
        "IndicatorRippleLayoutIdTag",
        "Ljava/lang/String;",
        "IndicatorLayoutIdTag",
        "IconLayoutIdTag",
        "LabelLayoutIdTag",
        "NavigationBarHeight",
        "F",
        "",
        "ItemAnimationDurationMillis",
        "I",
        "NavigationBarItemHorizontalPadding",
        "getNavigationBarItemHorizontalPadding",
        "()F",
        "NavigationBarIndicatorToLabelPadding",
        "getNavigationBarIndicatorToLabelPadding",
        "IndicatorHorizontalPadding",
        "IndicatorVerticalPadding",
        "getIndicatorVerticalPadding",
        "IndicatorVerticalOffset",
        "iconColor",
        "textColor",
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
        "SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,717:1\n1223#2,6:718\n1223#2,6:724\n1223#2,6:730\n1223#2,6:769\n1223#2,6:775\n1223#2,6:785\n1223#2,6:862\n71#3,3:736\n74#3:767\n78#3:784\n71#3:822\n68#3,6:823\n74#3:857\n78#3:861\n71#3:868\n68#3,6:869\n74#3:903\n78#3:907\n78#4,6:739\n85#4,4:754\n89#4,2:764\n93#4:783\n78#4:791\n76#4,8:792\n85#4,4:809\n89#4,2:819\n78#4,6:829\n85#4,4:844\n89#4,2:854\n93#4:860\n78#4,6:875\n85#4,4:890\n89#4,2:900\n93#4:906\n93#4:910\n368#5,9:745\n377#5:766\n378#5,2:781\n368#5,9:800\n377#5:821\n368#5,9:835\n377#5:856\n378#5,2:858\n368#5,9:881\n377#5:902\n378#5,2:904\n378#5,2:908\n4032#6,6:758\n4032#6,6:813\n4032#6,6:848\n4032#6,6:894\n77#7:768\n75#8:911\n108#8,2:912\n148#9:914\n148#9:915\n148#9:920\n56#10:916\n71#10:917\n56#10:918\n71#10:919\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n183#1:718,6\n215#1:724,6\n229#1:730,6\n249#1:769,6\n281#1:775,6\n532#1:785,6\n525#1:862,6\n217#1:736,3\n217#1:767\n217#1:784\n521#1:822\n521#1:823,6\n521#1:857\n521#1:861\n524#1:868\n524#1:869,6\n524#1:903\n524#1:907\n217#1:739,6\n217#1:754,4\n217#1:764,2\n217#1:783\n517#1:791\n517#1:792,8\n517#1:809,4\n517#1:819,2\n521#1:829,6\n521#1:844,4\n521#1:854,2\n521#1:860\n524#1:875,6\n524#1:890,4\n524#1:900,2\n524#1:906\n517#1:910\n217#1:745,9\n217#1:766\n217#1:781,2\n517#1:800,9\n517#1:821\n521#1:835,9\n521#1:856\n521#1:858,2\n524#1:881,9\n524#1:902\n524#1:904,2\n517#1:908,2\n217#1:758,6\n517#1:813,6\n521#1:848,6\n524#1:894,6\n243#1:768\n215#1:911\n215#1:912,2\n704#1:914\n707#1:915\n716#1:920\n710#1:916\n710#1:917\n714#1:918\n714#1:919\n*E\n"
    }
.end annotation


# static fields
.field private static final IconLayoutIdTag:Ljava/lang/String; = "icon"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorHorizontalPadding:F

.field private static final IndicatorLayoutIdTag:Ljava/lang/String; = "indicator"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorRippleLayoutIdTag:Ljava/lang/String; = "indicatorRipple"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorVerticalOffset:F

.field private static final IndicatorVerticalPadding:F

.field private static final ItemAnimationDurationMillis:I = 0x64

.field private static final LabelLayoutIdTag:Ljava/lang/String; = "label"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final NavigationBarHeight:F

.field private static final NavigationBarIndicatorToLabelPadding:F

.field private static final NavigationBarItemHorizontalPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/material3/tokens/NavigationBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationBarTokens;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getContainerHeight-D9Ej5fM()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sput v1, Landroidx/compose/material3/NavigationBarKt;->NavigationBarHeight:F

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sput v1, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemHorizontalPadding:F

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    int-to-float v1, v1

    .line 20
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    sput v1, Landroidx/compose/material3/NavigationBarKt;->NavigationBarIndicatorToLabelPadding:F

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getIconSize-D9Ej5fM()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-float/2addr v1, v2

    .line 35
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x2

    .line 40
    int-to-float v2, v2

    .line 41
    div-float/2addr v1, v2

    .line 42
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sput v1, Landroidx/compose/material3/NavigationBarKt;->IndicatorHorizontalPadding:F

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorHeight-D9Ej5fM()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getIconSize-D9Ej5fM()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-float/2addr v1, v0

    .line 57
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    div-float/2addr v0, v2

    .line 62
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    sput v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

    .line 67
    .line 68
    const/16 v0, 0xc

    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    sput v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalOffset:F

    .line 76
    .line 77
    return-void
.end method

.method public static final NavigationBar-HsRjFd4(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/layout/WindowInsets;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "JJF",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            "Lr6/f;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p7

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    const v0, 0x5f2d444b

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p8

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, p10, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v9, 0x6

    .line 19
    .line 20
    move v4, v3

    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v9, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v4, 0x2

    .line 39
    :goto_0
    or-int/2addr v4, v9

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v3, p0

    .line 42
    .line 43
    move v4, v9

    .line 44
    :goto_1
    and-int/lit8 v5, v9, 0x30

    .line 45
    .line 46
    if-nez v5, :cond_5

    .line 47
    .line 48
    and-int/lit8 v5, p10, 0x2

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    move-wide/from16 v5, p1

    .line 53
    .line 54
    invoke-interface {v1, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    const/16 v7, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-wide/from16 v5, p1

    .line 64
    .line 65
    :cond_4
    const/16 v7, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v4, v7

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    move-wide/from16 v5, p1

    .line 70
    .line 71
    :goto_3
    and-int/lit16 v7, v9, 0x180

    .line 72
    .line 73
    if-nez v7, :cond_7

    .line 74
    .line 75
    and-int/lit8 v7, p10, 0x4

    .line 76
    .line 77
    move-wide/from16 v10, p3

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_6

    .line 86
    .line 87
    const/16 v7, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    const/16 v7, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v4, v7

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    move-wide/from16 v10, p3

    .line 95
    .line 96
    :goto_5
    and-int/lit8 v7, p10, 0x8

    .line 97
    .line 98
    if-eqz v7, :cond_9

    .line 99
    .line 100
    or-int/lit16 v4, v4, 0xc00

    .line 101
    .line 102
    :cond_8
    move/from16 v12, p5

    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_9
    and-int/lit16 v12, v9, 0xc00

    .line 106
    .line 107
    if-nez v12, :cond_8

    .line 108
    .line 109
    move/from16 v12, p5

    .line 110
    .line 111
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-eqz v13, :cond_a

    .line 116
    .line 117
    const/16 v13, 0x800

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/16 v13, 0x400

    .line 121
    .line 122
    :goto_6
    or-int/2addr v4, v13

    .line 123
    :goto_7
    and-int/lit16 v13, v9, 0x6000

    .line 124
    .line 125
    if-nez v13, :cond_d

    .line 126
    .line 127
    and-int/lit8 v13, p10, 0x10

    .line 128
    .line 129
    if-nez v13, :cond_b

    .line 130
    .line 131
    move-object/from16 v13, p6

    .line 132
    .line 133
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-eqz v14, :cond_c

    .line 138
    .line 139
    const/16 v14, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_b
    move-object/from16 v13, p6

    .line 143
    .line 144
    :cond_c
    const/16 v14, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v4, v14

    .line 147
    goto :goto_9

    .line 148
    :cond_d
    move-object/from16 v13, p6

    .line 149
    .line 150
    :goto_9
    and-int/lit8 v14, p10, 0x20

    .line 151
    .line 152
    const/high16 v15, 0x30000

    .line 153
    .line 154
    if-eqz v14, :cond_e

    .line 155
    .line 156
    or-int/2addr v4, v15

    .line 157
    goto :goto_b

    .line 158
    :cond_e
    and-int v14, v9, v15

    .line 159
    .line 160
    if-nez v14, :cond_10

    .line 161
    .line 162
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    if-eqz v14, :cond_f

    .line 167
    .line 168
    const/high16 v14, 0x20000

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_f
    const/high16 v14, 0x10000

    .line 172
    .line 173
    :goto_a
    or-int/2addr v4, v14

    .line 174
    :cond_10
    :goto_b
    const v14, 0x12493

    .line 175
    .line 176
    .line 177
    and-int/2addr v14, v4

    .line 178
    const v15, 0x12492

    .line 179
    .line 180
    .line 181
    if-ne v14, v15, :cond_12

    .line 182
    .line 183
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    if-nez v14, :cond_11

    .line 188
    .line 189
    goto :goto_c

    .line 190
    :cond_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 191
    .line 192
    .line 193
    move-object/from16 v20, v1

    .line 194
    .line 195
    move-object v1, v3

    .line 196
    move-wide v2, v5

    .line 197
    move-wide v4, v10

    .line 198
    move v6, v12

    .line 199
    move-object v7, v13

    .line 200
    goto/16 :goto_12

    .line 201
    .line 202
    :cond_12
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 203
    .line 204
    .line 205
    and-int/lit8 v14, v9, 0x1

    .line 206
    .line 207
    const v15, -0xe001

    .line 208
    .line 209
    .line 210
    if-eqz v14, :cond_17

    .line 211
    .line 212
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    if-eqz v14, :cond_13

    .line 217
    .line 218
    goto :goto_e

    .line 219
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 220
    .line 221
    .line 222
    and-int/lit8 v2, p10, 0x2

    .line 223
    .line 224
    if-eqz v2, :cond_14

    .line 225
    .line 226
    and-int/lit8 v4, v4, -0x71

    .line 227
    .line 228
    :cond_14
    and-int/lit8 v2, p10, 0x4

    .line 229
    .line 230
    if-eqz v2, :cond_15

    .line 231
    .line 232
    and-int/lit16 v4, v4, -0x381

    .line 233
    .line 234
    :cond_15
    and-int/lit8 v2, p10, 0x10

    .line 235
    .line 236
    if-eqz v2, :cond_16

    .line 237
    .line 238
    and-int/2addr v4, v15

    .line 239
    :cond_16
    move-wide v14, v10

    .line 240
    move/from16 v16, v12

    .line 241
    .line 242
    move-object v10, v3

    .line 243
    move-object v3, v13

    .line 244
    :goto_d
    move-wide v12, v5

    .line 245
    goto :goto_11

    .line 246
    :cond_17
    :goto_e
    if-eqz v2, :cond_18

    .line 247
    .line 248
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 249
    .line 250
    goto :goto_f

    .line 251
    :cond_18
    move-object v2, v3

    .line 252
    :goto_f
    and-int/lit8 v3, p10, 0x2

    .line 253
    .line 254
    const/4 v14, 0x6

    .line 255
    if-eqz v3, :cond_19

    .line 256
    .line 257
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 258
    .line 259
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/NavigationBarDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 260
    .line 261
    .line 262
    move-result-wide v5

    .line 263
    and-int/lit8 v4, v4, -0x71

    .line 264
    .line 265
    :cond_19
    and-int/lit8 v3, p10, 0x4

    .line 266
    .line 267
    if-eqz v3, :cond_1a

    .line 268
    .line 269
    sget-object v3, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 270
    .line 271
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-static {v3, v5, v6}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-4WTKRHQ(Landroidx/compose/material3/ColorScheme;J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v10

    .line 279
    and-int/lit16 v3, v4, -0x381

    .line 280
    .line 281
    move v4, v3

    .line 282
    :cond_1a
    if-eqz v7, :cond_1b

    .line 283
    .line 284
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 285
    .line 286
    invoke-virtual {v3}, Landroidx/compose/material3/NavigationBarDefaults;->getElevation-D9Ej5fM()F

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    move v12, v3

    .line 291
    :cond_1b
    and-int/lit8 v3, p10, 0x10

    .line 292
    .line 293
    if-eqz v3, :cond_1c

    .line 294
    .line 295
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 296
    .line 297
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/NavigationBarDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    and-int/2addr v4, v15

    .line 302
    move-wide v14, v10

    .line 303
    move/from16 v16, v12

    .line 304
    .line 305
    :goto_10
    move-object v10, v2

    .line 306
    goto :goto_d

    .line 307
    :cond_1c
    move-wide v14, v10

    .line 308
    move/from16 v16, v12

    .line 309
    .line 310
    move-object v3, v13

    .line 311
    goto :goto_10

    .line 312
    :goto_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 313
    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_1d

    .line 320
    .line 321
    const/4 v2, -0x1

    .line 322
    const-string v5, "androidx.compose.material3.NavigationBar (NavigationBar.kt:115)"

    .line 323
    .line 324
    invoke-static {v0, v4, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 325
    .line 326
    .line 327
    :cond_1d
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBar$1;

    .line 328
    .line 329
    invoke-direct {v0, v3, v8}, Landroidx/compose/material3/NavigationBarKt$NavigationBar$1;-><init>(Landroidx/compose/foundation/layout/WindowInsets;Lr6/f;)V

    .line 330
    .line 331
    .line 332
    const/16 v2, 0x36

    .line 333
    .line 334
    const v5, 0x64c4a90

    .line 335
    .line 336
    .line 337
    const/4 v6, 0x1

    .line 338
    invoke-static {v5, v6, v0, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 339
    .line 340
    .line 341
    move-result-object v19

    .line 342
    and-int/lit8 v0, v4, 0xe

    .line 343
    .line 344
    const/high16 v2, 0xc00000

    .line 345
    .line 346
    or-int/2addr v0, v2

    .line 347
    shl-int/lit8 v2, v4, 0x3

    .line 348
    .line 349
    and-int/lit16 v4, v2, 0x380

    .line 350
    .line 351
    or-int/2addr v0, v4

    .line 352
    and-int/lit16 v4, v2, 0x1c00

    .line 353
    .line 354
    or-int/2addr v0, v4

    .line 355
    const v4, 0xe000

    .line 356
    .line 357
    .line 358
    and-int/2addr v2, v4

    .line 359
    or-int v21, v0, v2

    .line 360
    .line 361
    const/16 v22, 0x62

    .line 362
    .line 363
    const/4 v11, 0x0

    .line 364
    const/16 v17, 0x0

    .line 365
    .line 366
    const/16 v18, 0x0

    .line 367
    .line 368
    move-object/from16 v20, v1

    .line 369
    .line 370
    invoke-static/range {v10 .. v22}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 371
    .line 372
    .line 373
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_1e

    .line 378
    .line 379
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 380
    .line 381
    .line 382
    :cond_1e
    move-object v7, v3

    .line 383
    move-object v1, v10

    .line 384
    move-wide v2, v12

    .line 385
    move-wide v4, v14

    .line 386
    move/from16 v6, v16

    .line 387
    .line 388
    :goto_12
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    if-eqz v11, :cond_1f

    .line 393
    .line 394
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBar$2;

    .line 395
    .line 396
    move/from16 v10, p10

    .line 397
    .line 398
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/NavigationBarKt$NavigationBar$2;-><init>(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;II)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 402
    .line 403
    .line 404
    :cond_1f
    return-void
.end method

.method public static final NavigationBarItem(Landroidx/compose/foundation/layout/RowScope;ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .param p0    # Landroidx/compose/foundation/layout/RowScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/material3/NavigationBarItemColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Z",
            "Lr6/a;",
            "Lr6/e;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lr6/e;",
            "Z",
            "Landroidx/compose/material3/NavigationBarItemColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v2, p1

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    const v0, -0x278c5fbe

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p10

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    const/high16 v1, -0x80000000

    .line 17
    .line 18
    and-int/2addr v1, v12

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    or-int/lit8 v1, v11, 0x6

    .line 22
    .line 23
    move v3, v1

    .line 24
    move-object/from16 v1, p0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    move-object/from16 v1, p0

    .line 32
    .line 33
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const/4 v3, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v3, 0x2

    .line 42
    :goto_0
    or-int/2addr v3, v11

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object/from16 v1, p0

    .line 45
    .line 46
    move v3, v11

    .line 47
    :goto_1
    and-int/lit8 v4, v12, 0x1

    .line 48
    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    or-int/lit8 v3, v3, 0x30

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_3
    and-int/lit8 v4, v11, 0x30

    .line 55
    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    const/16 v4, 0x20

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    const/16 v4, 0x10

    .line 68
    .line 69
    :goto_2
    or-int/2addr v3, v4

    .line 70
    :cond_5
    :goto_3
    and-int/lit8 v4, v12, 0x2

    .line 71
    .line 72
    if-eqz v4, :cond_7

    .line 73
    .line 74
    or-int/lit16 v3, v3, 0x180

    .line 75
    .line 76
    :cond_6
    move-object/from16 v4, p2

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_7
    and-int/lit16 v4, v11, 0x180

    .line 80
    .line 81
    if-nez v4, :cond_6

    .line 82
    .line 83
    move-object/from16 v4, p2

    .line 84
    .line 85
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_8

    .line 90
    .line 91
    const/16 v5, 0x100

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_8
    const/16 v5, 0x80

    .line 95
    .line 96
    :goto_4
    or-int/2addr v3, v5

    .line 97
    :goto_5
    and-int/lit8 v5, v12, 0x4

    .line 98
    .line 99
    if-eqz v5, :cond_a

    .line 100
    .line 101
    or-int/lit16 v3, v3, 0xc00

    .line 102
    .line 103
    :cond_9
    move-object/from16 v5, p3

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_a
    and-int/lit16 v5, v11, 0xc00

    .line 107
    .line 108
    if-nez v5, :cond_9

    .line 109
    .line 110
    move-object/from16 v5, p3

    .line 111
    .line 112
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_b

    .line 117
    .line 118
    const/16 v7, 0x800

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_b
    const/16 v7, 0x400

    .line 122
    .line 123
    :goto_6
    or-int/2addr v3, v7

    .line 124
    :goto_7
    and-int/lit8 v7, v12, 0x8

    .line 125
    .line 126
    if-eqz v7, :cond_d

    .line 127
    .line 128
    or-int/lit16 v3, v3, 0x6000

    .line 129
    .line 130
    :cond_c
    move-object/from16 v8, p4

    .line 131
    .line 132
    goto :goto_9

    .line 133
    :cond_d
    and-int/lit16 v8, v11, 0x6000

    .line 134
    .line 135
    if-nez v8, :cond_c

    .line 136
    .line 137
    move-object/from16 v8, p4

    .line 138
    .line 139
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    if-eqz v10, :cond_e

    .line 144
    .line 145
    const/16 v10, 0x4000

    .line 146
    .line 147
    goto :goto_8

    .line 148
    :cond_e
    const/16 v10, 0x2000

    .line 149
    .line 150
    :goto_8
    or-int/2addr v3, v10

    .line 151
    :goto_9
    and-int/lit8 v10, v12, 0x10

    .line 152
    .line 153
    const/high16 v13, 0x30000

    .line 154
    .line 155
    if-eqz v10, :cond_10

    .line 156
    .line 157
    or-int/2addr v3, v13

    .line 158
    :cond_f
    move/from16 v13, p5

    .line 159
    .line 160
    goto :goto_b

    .line 161
    :cond_10
    and-int/2addr v13, v11

    .line 162
    if-nez v13, :cond_f

    .line 163
    .line 164
    move/from16 v13, p5

    .line 165
    .line 166
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-eqz v14, :cond_11

    .line 171
    .line 172
    const/high16 v14, 0x20000

    .line 173
    .line 174
    goto :goto_a

    .line 175
    :cond_11
    const/high16 v14, 0x10000

    .line 176
    .line 177
    :goto_a
    or-int/2addr v3, v14

    .line 178
    :goto_b
    and-int/lit8 v14, v12, 0x20

    .line 179
    .line 180
    const/high16 v15, 0x180000

    .line 181
    .line 182
    if-eqz v14, :cond_13

    .line 183
    .line 184
    or-int/2addr v3, v15

    .line 185
    :cond_12
    move-object/from16 v15, p6

    .line 186
    .line 187
    goto :goto_d

    .line 188
    :cond_13
    and-int/2addr v15, v11

    .line 189
    if-nez v15, :cond_12

    .line 190
    .line 191
    move-object/from16 v15, p6

    .line 192
    .line 193
    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v16

    .line 197
    if-eqz v16, :cond_14

    .line 198
    .line 199
    const/high16 v16, 0x100000

    .line 200
    .line 201
    goto :goto_c

    .line 202
    :cond_14
    const/high16 v16, 0x80000

    .line 203
    .line 204
    :goto_c
    or-int v3, v3, v16

    .line 205
    .line 206
    :goto_d
    and-int/lit8 v16, v12, 0x40

    .line 207
    .line 208
    const/high16 v17, 0xc00000

    .line 209
    .line 210
    if-eqz v16, :cond_15

    .line 211
    .line 212
    or-int v3, v3, v17

    .line 213
    .line 214
    move/from16 v9, p7

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_15
    and-int v17, v11, v17

    .line 218
    .line 219
    move/from16 v9, p7

    .line 220
    .line 221
    if-nez v17, :cond_17

    .line 222
    .line 223
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 224
    .line 225
    .line 226
    move-result v18

    .line 227
    if-eqz v18, :cond_16

    .line 228
    .line 229
    const/high16 v18, 0x800000

    .line 230
    .line 231
    goto :goto_e

    .line 232
    :cond_16
    const/high16 v18, 0x400000

    .line 233
    .line 234
    :goto_e
    or-int v3, v3, v18

    .line 235
    .line 236
    :cond_17
    :goto_f
    const/high16 v18, 0x6000000

    .line 237
    .line 238
    and-int v18, v11, v18

    .line 239
    .line 240
    if-nez v18, :cond_1a

    .line 241
    .line 242
    and-int/lit16 v0, v12, 0x80

    .line 243
    .line 244
    if-nez v0, :cond_18

    .line 245
    .line 246
    move-object/from16 v0, p8

    .line 247
    .line 248
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v19

    .line 252
    if-eqz v19, :cond_19

    .line 253
    .line 254
    const/high16 v19, 0x4000000

    .line 255
    .line 256
    goto :goto_10

    .line 257
    :cond_18
    move-object/from16 v0, p8

    .line 258
    .line 259
    :cond_19
    const/high16 v19, 0x2000000

    .line 260
    .line 261
    :goto_10
    or-int v3, v3, v19

    .line 262
    .line 263
    goto :goto_11

    .line 264
    :cond_1a
    move-object/from16 v0, p8

    .line 265
    .line 266
    :goto_11
    and-int/lit16 v0, v12, 0x100

    .line 267
    .line 268
    const/high16 v19, 0x30000000

    .line 269
    .line 270
    if-eqz v0, :cond_1c

    .line 271
    .line 272
    or-int v3, v3, v19

    .line 273
    .line 274
    :cond_1b
    move/from16 v19, v0

    .line 275
    .line 276
    move-object/from16 v0, p9

    .line 277
    .line 278
    goto :goto_13

    .line 279
    :cond_1c
    and-int v19, v11, v19

    .line 280
    .line 281
    if-nez v19, :cond_1b

    .line 282
    .line 283
    move/from16 v19, v0

    .line 284
    .line 285
    move-object/from16 v0, p9

    .line 286
    .line 287
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v20

    .line 291
    if-eqz v20, :cond_1d

    .line 292
    .line 293
    const/high16 v20, 0x20000000

    .line 294
    .line 295
    goto :goto_12

    .line 296
    :cond_1d
    const/high16 v20, 0x10000000

    .line 297
    .line 298
    :goto_12
    or-int v3, v3, v20

    .line 299
    .line 300
    :goto_13
    const v20, 0x12492493

    .line 301
    .line 302
    .line 303
    and-int v0, v3, v20

    .line 304
    .line 305
    const v1, 0x12492492

    .line 306
    .line 307
    .line 308
    if-ne v0, v1, :cond_1f

    .line 309
    .line 310
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-nez v0, :cond_1e

    .line 315
    .line 316
    goto :goto_15

    .line 317
    :cond_1e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 318
    .line 319
    .line 320
    move-object/from16 v10, p9

    .line 321
    .line 322
    move-object v5, v8

    .line 323
    move v8, v9

    .line 324
    move-object/from16 v9, p8

    .line 325
    .line 326
    :goto_14
    move-object v0, v6

    .line 327
    move v6, v13

    .line 328
    move-object v7, v15

    .line 329
    goto/16 :goto_1e

    .line 330
    .line 331
    :cond_1f
    :goto_15
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 332
    .line 333
    .line 334
    and-int/lit8 v0, v11, 0x1

    .line 335
    .line 336
    const p10, -0xe000001

    .line 337
    .line 338
    .line 339
    const/4 v1, 0x6

    .line 340
    move/from16 v20, v3

    .line 341
    .line 342
    const/4 v4, 0x1

    .line 343
    if-eqz v0, :cond_23

    .line 344
    .line 345
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_20

    .line 350
    .line 351
    goto :goto_16

    .line 352
    :cond_20
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 353
    .line 354
    .line 355
    and-int/lit16 v0, v12, 0x80

    .line 356
    .line 357
    if-eqz v0, :cond_21

    .line 358
    .line 359
    and-int v0, v20, p10

    .line 360
    .line 361
    move-object/from16 v10, p9

    .line 362
    .line 363
    move v14, v0

    .line 364
    move-object/from16 v0, p8

    .line 365
    .line 366
    goto :goto_18

    .line 367
    :cond_21
    move-object/from16 v0, p8

    .line 368
    .line 369
    :cond_22
    move-object/from16 v10, p9

    .line 370
    .line 371
    move/from16 v14, v20

    .line 372
    .line 373
    goto :goto_18

    .line 374
    :cond_23
    :goto_16
    if-eqz v7, :cond_24

    .line 375
    .line 376
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 377
    .line 378
    move-object v8, v0

    .line 379
    :cond_24
    if-eqz v10, :cond_25

    .line 380
    .line 381
    move v13, v4

    .line 382
    :cond_25
    if-eqz v14, :cond_26

    .line 383
    .line 384
    const/4 v15, 0x0

    .line 385
    :cond_26
    if-eqz v16, :cond_27

    .line 386
    .line 387
    move v9, v4

    .line 388
    :cond_27
    and-int/lit16 v0, v12, 0x80

    .line 389
    .line 390
    if-eqz v0, :cond_28

    .line 391
    .line 392
    sget-object v0, Landroidx/compose/material3/NavigationBarItemDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarItemDefaults;

    .line 393
    .line 394
    invoke-virtual {v0, v6, v1}, Landroidx/compose/material3/NavigationBarItemDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationBarItemColors;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    and-int v7, v20, p10

    .line 399
    .line 400
    move/from16 v20, v7

    .line 401
    .line 402
    goto :goto_17

    .line 403
    :cond_28
    move-object/from16 v0, p8

    .line 404
    .line 405
    :goto_17
    if-eqz v19, :cond_22

    .line 406
    .line 407
    move/from16 v14, v20

    .line 408
    .line 409
    const/4 v10, 0x0

    .line 410
    :goto_18
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 411
    .line 412
    .line 413
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    if-eqz v7, :cond_29

    .line 418
    .line 419
    const/4 v7, -0x1

    .line 420
    const-string v1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:180)"

    .line 421
    .line 422
    const v3, -0x278c5fbe

    .line 423
    .line 424
    .line 425
    invoke-static {v3, v14, v7, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 426
    .line 427
    .line 428
    :cond_29
    const v1, -0x62744f5

    .line 429
    .line 430
    .line 431
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 432
    .line 433
    .line 434
    if-nez v10, :cond_2b

    .line 435
    .line 436
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 441
    .line 442
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    if-ne v1, v3, :cond_2a

    .line 447
    .line 448
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    :cond_2a
    check-cast v1, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 456
    .line 457
    goto :goto_19

    .line 458
    :cond_2b
    move-object v1, v10

    .line 459
    :goto_19
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 460
    .line 461
    .line 462
    new-instance v3, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1;

    .line 463
    .line 464
    move-object/from16 p5, v0

    .line 465
    .line 466
    move/from16 p6, v2

    .line 467
    .line 468
    move-object/from16 p4, v3

    .line 469
    .line 470
    move-object/from16 p10, v5

    .line 471
    .line 472
    move/from16 p9, v9

    .line 473
    .line 474
    move/from16 p7, v13

    .line 475
    .line 476
    move-object/from16 p8, v15

    .line 477
    .line 478
    invoke-direct/range {p4 .. p10}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1;-><init>(Landroidx/compose/material3/NavigationBarItemColors;ZZLr6/e;ZLr6/e;)V

    .line 479
    .line 480
    .line 481
    const v5, -0x549d0324

    .line 482
    .line 483
    .line 484
    const/16 v7, 0x36

    .line 485
    .line 486
    invoke-static {v5, v4, v3, v6, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 487
    .line 488
    .line 489
    move-result-object v18

    .line 490
    const v3, -0x626ded2

    .line 491
    .line 492
    .line 493
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 494
    .line 495
    .line 496
    if-nez v15, :cond_2c

    .line 497
    .line 498
    const/16 v20, 0x0

    .line 499
    .line 500
    goto :goto_1a

    .line 501
    :cond_2c
    new-instance v3, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1;

    .line 502
    .line 503
    invoke-direct {v3, v0, v2, v13, v15}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1;-><init>(Landroidx/compose/material3/NavigationBarItemColors;ZZLr6/e;)V

    .line 504
    .line 505
    .line 506
    const v5, 0x620c84c8

    .line 507
    .line 508
    .line 509
    invoke-static {v5, v4, v3, v6, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    move-object/from16 v20, v3

    .line 514
    .line 515
    :goto_1a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 516
    .line 517
    .line 518
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 523
    .line 524
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    const/4 v7, 0x0

    .line 529
    if-ne v3, v5, :cond_2d

    .line 530
    .line 531
    invoke-static {v7}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :cond_2d
    check-cast v3, Landroidx/compose/runtime/MutableIntState;

    .line 539
    .line 540
    sget-object v5, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 541
    .line 542
    invoke-virtual {v5}, Landroidx/compose/ui/semantics/Role$Companion;->getTab-o7Vup1c()I

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    const/16 v22, 0x0

    .line 547
    .line 548
    invoke-static {v5}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    move-object/from16 p10, p2

    .line 553
    .line 554
    move-object/from16 p6, v1

    .line 555
    .line 556
    move/from16 p5, v2

    .line 557
    .line 558
    move-object/from16 p9, v5

    .line 559
    .line 560
    move-object/from16 p4, v8

    .line 561
    .line 562
    move/from16 p8, v13

    .line 563
    .line 564
    move-object/from16 p7, v22

    .line 565
    .line 566
    invoke-static/range {p4 .. p10}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-O2vRcR0(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lr6/a;)Landroidx/compose/ui/Modifier;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    move-object/from16 v22, p4

    .line 571
    .line 572
    move-object/from16 v2, p6

    .line 573
    .line 574
    sget v5, Landroidx/compose/material3/NavigationBarKt;->NavigationBarHeight:F

    .line 575
    .line 576
    const/4 v8, 0x0

    .line 577
    const/4 v7, 0x0

    .line 578
    invoke-static {v1, v8, v5, v4, v7}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    const/4 v5, 0x2

    .line 583
    const/4 v7, 0x0

    .line 584
    const/high16 v23, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/16 v24, 0x0

    .line 587
    .line 588
    move-object/from16 p4, p0

    .line 589
    .line 590
    move-object/from16 p5, v1

    .line 591
    .line 592
    move/from16 p8, v5

    .line 593
    .line 594
    move-object/from16 p9, v7

    .line 595
    .line 596
    move/from16 p6, v23

    .line 597
    .line 598
    move/from16 p7, v24

    .line 599
    .line 600
    invoke-static/range {p4 .. p9}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v7

    .line 612
    if-ne v5, v7, :cond_2e

    .line 613
    .line 614
    new-instance v5, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$1$1;

    .line 615
    .line 616
    invoke-direct {v5, v3}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$1$1;-><init>(Landroidx/compose/runtime/MutableIntState;)V

    .line 617
    .line 618
    .line 619
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    :cond_2e
    check-cast v5, Lr6/c;

    .line 623
    .line 624
    invoke-static {v1, v5}, Landroidx/compose/ui/layout/OnRemeasuredModifierKt;->onSizeChanged(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 629
    .line 630
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 635
    .line 636
    .line 637
    move-result-object v5

    .line 638
    const/4 v7, 0x0

    .line 639
    invoke-static {v6, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 640
    .line 641
    .line 642
    move-result v4

    .line 643
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    invoke-static {v6, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 652
    .line 653
    move-object/from16 p6, v2

    .line 654
    .line 655
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 660
    .line 661
    .line 662
    move-result-object v24

    .line 663
    if-nez v24, :cond_2f

    .line 664
    .line 665
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 666
    .line 667
    .line 668
    :cond_2f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 669
    .line 670
    .line 671
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 672
    .line 673
    .line 674
    move-result v24

    .line 675
    if-eqz v24, :cond_30

    .line 676
    .line 677
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 678
    .line 679
    .line 680
    goto :goto_1b

    .line 681
    :cond_30
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 682
    .line 683
    .line 684
    :goto_1b
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-static {v8, v2, v5, v2, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 689
    .line 690
    .line 691
    move-result-object v5

    .line 692
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 693
    .line 694
    .line 695
    move-result v7

    .line 696
    if-nez v7, :cond_31

    .line 697
    .line 698
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v7

    .line 702
    move-object/from16 p5, v3

    .line 703
    .line 704
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    if-nez v3, :cond_32

    .line 713
    .line 714
    goto :goto_1c

    .line 715
    :cond_31
    move-object/from16 p5, v3

    .line 716
    .line 717
    :goto_1c
    invoke-static {v4, v2, v4, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 718
    .line 719
    .line 720
    :cond_32
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    invoke-static {v2, v1, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 725
    .line 726
    .line 727
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 728
    .line 729
    if-eqz p1, :cond_33

    .line 730
    .line 731
    const/high16 v8, 0x3f800000    # 1.0f

    .line 732
    .line 733
    move v1, v8

    .line 734
    goto :goto_1d

    .line 735
    :cond_33
    const/4 v1, 0x0

    .line 736
    :goto_1d
    const/16 v2, 0x64

    .line 737
    .line 738
    const/4 v3, 0x6

    .line 739
    const/4 v4, 0x0

    .line 740
    const/4 v7, 0x0

    .line 741
    invoke-static {v2, v7, v4, v3, v4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    const/16 v7, 0x30

    .line 746
    .line 747
    const/16 v8, 0x1c

    .line 748
    .line 749
    const/4 v3, 0x0

    .line 750
    move-object/from16 v19, v4

    .line 751
    .line 752
    const/4 v4, 0x0

    .line 753
    const/4 v5, 0x0

    .line 754
    move-object/from16 v16, p5

    .line 755
    .line 756
    move/from16 p9, v9

    .line 757
    .line 758
    move-object/from16 p4, v10

    .line 759
    .line 760
    move-object/from16 v10, v19

    .line 761
    .line 762
    move-object/from16 v9, p6

    .line 763
    .line 764
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lr6/c;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    check-cast v2, Landroidx/compose/ui/unit/Density;

    .line 777
    .line 778
    sget-object v3, Landroidx/compose/material3/tokens/NavigationBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationBarTokens;

    .line 779
    .line 780
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    invoke-interface {v2, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 785
    .line 786
    .line 787
    move-result v3

    .line 788
    invoke-static/range {v16 .. v16}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem$lambda$3(Landroidx/compose/runtime/MutableIntState;)I

    .line 789
    .line 790
    .line 791
    move-result v4

    .line 792
    sub-int/2addr v4, v3

    .line 793
    int-to-float v3, v4

    .line 794
    const/4 v4, 0x2

    .line 795
    int-to-float v4, v4

    .line 796
    div-float/2addr v3, v4

    .line 797
    sget v4, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalOffset:F

    .line 798
    .line 799
    invoke-interface {v2, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 800
    .line 801
    .line 802
    move-result v2

    .line 803
    invoke-static {v3, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 804
    .line 805
    .line 806
    move-result-wide v2

    .line 807
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    invoke-interface {v6, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 812
    .line 813
    .line 814
    move-result v5

    .line 815
    or-int/2addr v4, v5

    .line 816
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v5

    .line 820
    if-nez v4, :cond_34

    .line 821
    .line 822
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v4

    .line 826
    if-ne v5, v4, :cond_35

    .line 827
    .line 828
    :cond_34
    new-instance v5, Landroidx/compose/material3/internal/MappedInteractionSource;

    .line 829
    .line 830
    invoke-direct {v5, v9, v2, v3, v10}, Landroidx/compose/material3/internal/MappedInteractionSource;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/e;)V

    .line 831
    .line 832
    .line 833
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    :cond_35
    check-cast v5, Landroidx/compose/material3/internal/MappedInteractionSource;

    .line 837
    .line 838
    new-instance v2, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicatorRipple$1;

    .line 839
    .line 840
    invoke-direct {v2, v5}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicatorRipple$1;-><init>(Landroidx/compose/material3/internal/MappedInteractionSource;)V

    .line 841
    .line 842
    .line 843
    const v3, 0x293afa35

    .line 844
    .line 845
    .line 846
    const/16 v4, 0x36

    .line 847
    .line 848
    const/4 v5, 0x1

    .line 849
    invoke-static {v3, v5, v2, v6, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    new-instance v3, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicator$1;

    .line 854
    .line 855
    invoke-direct {v3, v1, v0}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$indicator$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/material3/NavigationBarItemColors;)V

    .line 856
    .line 857
    .line 858
    const v7, -0x1c472dfb

    .line 859
    .line 860
    .line 861
    invoke-static {v7, v5, v3, v6, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v4

    .line 869
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v5

    .line 873
    if-nez v4, :cond_36

    .line 874
    .line 875
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    if-ne v5, v4, :cond_37

    .line 880
    .line 881
    :cond_36
    new-instance v5, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$2$1;

    .line 882
    .line 883
    invoke-direct {v5, v1}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$2$1;-><init>(Landroidx/compose/runtime/State;)V

    .line 884
    .line 885
    .line 886
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 887
    .line 888
    .line 889
    :cond_37
    check-cast v5, Lr6/a;

    .line 890
    .line 891
    shr-int/lit8 v1, v14, 0x9

    .line 892
    .line 893
    const v4, 0xe000

    .line 894
    .line 895
    .line 896
    and-int/2addr v1, v4

    .line 897
    or-int/lit16 v8, v1, 0x1b6

    .line 898
    .line 899
    move-object v1, v2

    .line 900
    move-object v2, v3

    .line 901
    move-object v7, v6

    .line 902
    move-object/from16 v3, v18

    .line 903
    .line 904
    move-object/from16 v4, v20

    .line 905
    .line 906
    move-object v6, v5

    .line 907
    move/from16 v5, p9

    .line 908
    .line 909
    invoke-static/range {v1 .. v8}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemLayout(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 910
    .line 911
    .line 912
    move-object v6, v7

    .line 913
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 914
    .line 915
    .line 916
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 917
    .line 918
    .line 919
    move-result v1

    .line 920
    if-eqz v1, :cond_38

    .line 921
    .line 922
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 923
    .line 924
    .line 925
    :cond_38
    move-object/from16 v10, p4

    .line 926
    .line 927
    move-object v9, v0

    .line 928
    move v8, v5

    .line 929
    move-object/from16 v5, v22

    .line 930
    .line 931
    goto/16 :goto_14

    .line 932
    .line 933
    :goto_1e
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 934
    .line 935
    .line 936
    move-result-object v13

    .line 937
    if-eqz v13, :cond_39

    .line 938
    .line 939
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$3;

    .line 940
    .line 941
    move-object/from16 v1, p0

    .line 942
    .line 943
    move/from16 v2, p1

    .line 944
    .line 945
    move-object/from16 v3, p2

    .line 946
    .line 947
    move-object/from16 v4, p3

    .line 948
    .line 949
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$3;-><init>(Landroidx/compose/foundation/layout/RowScope;ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 950
    .line 951
    .line 952
    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 953
    .line 954
    .line 955
    :cond_39
    return-void
.end method

.method private static final NavigationBarItem$lambda$3(Landroidx/compose/runtime/MutableIntState;)I
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

.method private static final NavigationBarItem$lambda$4(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final NavigationBarItemLayout(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Z",
            "Lr6/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move/from16 v7, p7

    .line 14
    .line 15
    const v0, -0x550f732e

    .line 16
    .line 17
    .line 18
    move-object/from16 v8, p6

    .line 19
    .line 20
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    and-int/lit8 v9, v7, 0x6

    .line 25
    .line 26
    if-nez v9, :cond_1

    .line 27
    .line 28
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    if-eqz v9, :cond_0

    .line 33
    .line 34
    const/4 v9, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v9, 0x2

    .line 37
    :goto_0
    or-int/2addr v9, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v9, v7

    .line 40
    :goto_1
    and-int/lit8 v10, v7, 0x30

    .line 41
    .line 42
    if-nez v10, :cond_3

    .line 43
    .line 44
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-eqz v10, :cond_2

    .line 49
    .line 50
    const/16 v10, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v10, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v9, v10

    .line 56
    :cond_3
    and-int/lit16 v10, v7, 0x180

    .line 57
    .line 58
    if-nez v10, :cond_5

    .line 59
    .line 60
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eqz v10, :cond_4

    .line 65
    .line 66
    const/16 v10, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v10, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v9, v10

    .line 72
    :cond_5
    and-int/lit16 v10, v7, 0xc00

    .line 73
    .line 74
    const/16 v11, 0x800

    .line 75
    .line 76
    if-nez v10, :cond_7

    .line 77
    .line 78
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_6

    .line 83
    .line 84
    move v10, v11

    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v10, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v9, v10

    .line 89
    :cond_7
    and-int/lit16 v10, v7, 0x6000

    .line 90
    .line 91
    const/16 v12, 0x4000

    .line 92
    .line 93
    if-nez v10, :cond_9

    .line 94
    .line 95
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_8

    .line 100
    .line 101
    move v10, v12

    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v10, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v9, v10

    .line 106
    :cond_9
    const/high16 v10, 0x30000

    .line 107
    .line 108
    and-int/2addr v10, v7

    .line 109
    const/high16 v13, 0x20000

    .line 110
    .line 111
    if-nez v10, :cond_b

    .line 112
    .line 113
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_a

    .line 118
    .line 119
    move v10, v13

    .line 120
    goto :goto_6

    .line 121
    :cond_a
    const/high16 v10, 0x10000

    .line 122
    .line 123
    :goto_6
    or-int/2addr v9, v10

    .line 124
    :cond_b
    const v10, 0x12493

    .line 125
    .line 126
    .line 127
    and-int/2addr v10, v9

    .line 128
    const v14, 0x12492

    .line 129
    .line 130
    .line 131
    if-ne v10, v14, :cond_d

    .line 132
    .line 133
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-nez v10, :cond_c

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_12

    .line 144
    .line 145
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_e

    .line 150
    .line 151
    const/4 v10, -0x1

    .line 152
    const-string v14, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:515)"

    .line 153
    .line 154
    invoke-static {v0, v9, v10, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_e
    const/high16 v0, 0x70000

    .line 158
    .line 159
    and-int/2addr v0, v9

    .line 160
    const/4 v14, 0x0

    .line 161
    if-ne v0, v13, :cond_f

    .line 162
    .line 163
    const/4 v15, 0x1

    .line 164
    goto :goto_8

    .line 165
    :cond_f
    move v15, v14

    .line 166
    :goto_8
    and-int/lit16 v10, v9, 0x1c00

    .line 167
    .line 168
    if-ne v10, v11, :cond_10

    .line 169
    .line 170
    const/4 v10, 0x1

    .line 171
    goto :goto_9

    .line 172
    :cond_10
    move v10, v14

    .line 173
    :goto_9
    or-int/2addr v10, v15

    .line 174
    const v11, 0xe000

    .line 175
    .line 176
    .line 177
    and-int/2addr v11, v9

    .line 178
    if-ne v11, v12, :cond_11

    .line 179
    .line 180
    const/4 v15, 0x1

    .line 181
    goto :goto_a

    .line 182
    :cond_11
    move v15, v14

    .line 183
    :goto_a
    or-int/2addr v10, v15

    .line 184
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v15

    .line 188
    if-nez v10, :cond_12

    .line 189
    .line 190
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 191
    .line 192
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    if-ne v15, v10, :cond_13

    .line 197
    .line 198
    :cond_12
    new-instance v15, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$2$1;

    .line 199
    .line 200
    invoke-direct {v15, v6, v4, v5}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$2$1;-><init>(Lr6/a;Lr6/e;Z)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_13
    check-cast v15, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 207
    .line 208
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 209
    .line 210
    invoke-static {v8, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    invoke-static {v8, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 223
    .line 224
    move/from16 v16, v9

    .line 225
    .line 226
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 231
    .line 232
    .line 233
    move-result-object v17

    .line 234
    if-nez v17, :cond_14

    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 237
    .line 238
    .line 239
    :cond_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 240
    .line 241
    .line 242
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 243
    .line 244
    .line 245
    move-result v17

    .line 246
    if-eqz v17, :cond_15

    .line 247
    .line 248
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 249
    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_15
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 253
    .line 254
    .line 255
    :goto_b
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-static {v7, v9, v15, v9, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    if-nez v15, :cond_16

    .line 268
    .line 269
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v15

    .line 273
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-nez v4, :cond_17

    .line 282
    .line 283
    :cond_16
    invoke-static {v13, v9, v13, v12}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 284
    .line 285
    .line 286
    :cond_17
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-static {v9, v14, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 291
    .line 292
    .line 293
    and-int/lit8 v4, v16, 0xe

    .line 294
    .line 295
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-interface {v1, v8, v4}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    shr-int/lit8 v4, v16, 0x3

    .line 303
    .line 304
    and-int/lit8 v4, v4, 0xe

    .line 305
    .line 306
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-interface {v2, v8, v4}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    const-string v4, "icon"

    .line 314
    .line 315
    invoke-static {v10, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 320
    .line 321
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    const/4 v13, 0x0

    .line 326
    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    invoke-static {v8, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    invoke-static {v8, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 347
    .line 348
    .line 349
    move-result-object v17

    .line 350
    if-nez v17, :cond_18

    .line 351
    .line 352
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 353
    .line 354
    .line 355
    :cond_18
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 359
    .line 360
    .line 361
    move-result v17

    .line 362
    if-eqz v17, :cond_19

    .line 363
    .line 364
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 365
    .line 366
    .line 367
    goto :goto_c

    .line 368
    :cond_19
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 369
    .line 370
    .line 371
    :goto_c
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 372
    .line 373
    .line 374
    move-result-object v15

    .line 375
    invoke-static {v7, v15, v12, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 380
    .line 381
    .line 382
    move-result v13

    .line 383
    if-nez v13, :cond_1a

    .line 384
    .line 385
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v13

    .line 389
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-nez v1, :cond_1b

    .line 398
    .line 399
    :cond_1a
    invoke-static {v14, v15, v14, v12}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 400
    .line 401
    .line 402
    :cond_1b
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-static {v15, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 407
    .line 408
    .line 409
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 410
    .line 411
    shr-int/lit8 v1, v16, 0x6

    .line 412
    .line 413
    and-int/lit8 v1, v1, 0xe

    .line 414
    .line 415
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-interface {v3, v8, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 423
    .line 424
    .line 425
    const v1, 0x40cd4da0

    .line 426
    .line 427
    .line 428
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 429
    .line 430
    .line 431
    if-eqz p3, :cond_24

    .line 432
    .line 433
    const-string v1, "label"

    .line 434
    .line 435
    invoke-static {v10, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    const/16 v4, 0x4000

    .line 440
    .line 441
    if-ne v11, v4, :cond_1c

    .line 442
    .line 443
    const/4 v13, 0x1

    .line 444
    :goto_d
    const/high16 v4, 0x20000

    .line 445
    .line 446
    goto :goto_e

    .line 447
    :cond_1c
    const/4 v13, 0x0

    .line 448
    goto :goto_d

    .line 449
    :goto_e
    if-ne v0, v4, :cond_1d

    .line 450
    .line 451
    const/4 v10, 0x1

    .line 452
    goto :goto_f

    .line 453
    :cond_1d
    const/4 v10, 0x0

    .line 454
    :goto_f
    or-int v0, v13, v10

    .line 455
    .line 456
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    if-nez v0, :cond_1e

    .line 461
    .line 462
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 463
    .line 464
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    if-ne v4, v0, :cond_1f

    .line 469
    .line 470
    :cond_1e
    new-instance v4, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$1$2$1;

    .line 471
    .line 472
    invoke-direct {v4, v5, v6}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$1$2$1;-><init>(ZLr6/a;)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    :cond_1f
    check-cast v4, Lr6/c;

    .line 479
    .line 480
    invoke-static {v1, v4}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    const/4 v13, 0x0

    .line 489
    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    invoke-static {v8, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    invoke-static {v8, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 506
    .line 507
    .line 508
    move-result-object v10

    .line 509
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 510
    .line 511
    .line 512
    move-result-object v11

    .line 513
    if-nez v11, :cond_20

    .line 514
    .line 515
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 516
    .line 517
    .line 518
    :cond_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 519
    .line 520
    .line 521
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 522
    .line 523
    .line 524
    move-result v11

    .line 525
    if-eqz v11, :cond_21

    .line 526
    .line 527
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 528
    .line 529
    .line 530
    goto :goto_10

    .line 531
    :cond_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 532
    .line 533
    .line 534
    :goto_10
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 535
    .line 536
    .line 537
    move-result-object v10

    .line 538
    invoke-static {v7, v10, v1, v10, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 543
    .line 544
    .line 545
    move-result v9

    .line 546
    if-nez v9, :cond_22

    .line 547
    .line 548
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v9

    .line 552
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 553
    .line 554
    .line 555
    move-result-object v11

    .line 556
    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v9

    .line 560
    if-nez v9, :cond_23

    .line 561
    .line 562
    :cond_22
    invoke-static {v4, v10, v4, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 563
    .line 564
    .line 565
    :cond_23
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-static {v10, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 570
    .line 571
    .line 572
    shr-int/lit8 v0, v16, 0x9

    .line 573
    .line 574
    and-int/lit8 v0, v0, 0xe

    .line 575
    .line 576
    move-object/from16 v4, p3

    .line 577
    .line 578
    invoke-static {v8, v0, v4}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 579
    .line 580
    .line 581
    goto :goto_11

    .line 582
    :cond_24
    move-object/from16 v4, p3

    .line 583
    .line 584
    :goto_11
    invoke-static {v8}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-eqz v0, :cond_25

    .line 589
    .line 590
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 591
    .line 592
    .line 593
    :cond_25
    :goto_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 594
    .line 595
    .line 596
    move-result-object v8

    .line 597
    if-eqz v8, :cond_26

    .line 598
    .line 599
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;

    .line 600
    .line 601
    move-object/from16 v1, p0

    .line 602
    .line 603
    move/from16 v7, p7

    .line 604
    .line 605
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemLayout$3;-><init>(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;I)V

    .line 606
    .line 607
    .line 608
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 609
    .line 610
    .line 611
    :cond_26
    return-void
.end method

.method public static final synthetic access$NavigationBarItem$lambda$4(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem$lambda$4(Landroidx/compose/runtime/MutableIntState;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$NavigationBarItemLayout(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemLayout(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getIndicatorHorizontalPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getNavigationBarHeight$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/NavigationBarKt;->placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Landroidx/compose/material3/NavigationBarKt;->placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final getIndicatorVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationBarIndicatorToLabelPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarIndicatorToLabelPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationBarItemHorizontalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method private static final placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 10

    .line 1
    invoke-static {p4, p5}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarHeight:F

    .line 6
    .line 7
    invoke-interface {p0, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p4, p5, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 p4, 0x2

    .line 16
    invoke-static {p1, v1, p4}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {p1, v2, p4}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-static {p2, v1, p4}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-static {p2, v2, p4}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$placeIcon$1;

    .line 33
    .line 34
    move-object v5, p2

    .line 35
    move v8, v1

    .line 36
    move v9, v2

    .line 37
    move-object v2, p1

    .line 38
    move-object v1, p3

    .line 39
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/NavigationBarKt$placeIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IIII)V

    .line 40
    .line 41
    .line 42
    move v1, v8

    .line 43
    move v2, v9

    .line 44
    const/4 v5, 0x4

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v4, v0

    .line 48
    move-object v0, p0

    .line 49
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method private static final placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 17

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    sget v1, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

    .line 9
    .line 10
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-float/2addr v2, v0

    .line 15
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarIndicatorToLabelPadding:F

    .line 16
    .line 17
    invoke-interface {v15, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-float/2addr v3, v2

    .line 22
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-float v2, v2

    .line 27
    add-float/2addr v3, v2

    .line 28
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    sub-float/2addr v2, v3

    .line 34
    const/4 v4, 0x2

    .line 35
    int-to-float v5, v4

    .line 36
    div-float/2addr v2, v5

    .line 37
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    cmpg-float v7, v2, v6

    .line 42
    .line 43
    if-gez v7, :cond_0

    .line 44
    .line 45
    move v10, v6

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v10, v2

    .line 48
    :goto_0
    mul-float v2, v10, v5

    .line 49
    .line 50
    add-float/2addr v2, v3

    .line 51
    if-eqz p7, :cond_1

    .line 52
    .line 53
    move v3, v10

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    int-to-float v3, v3

    .line 60
    sub-float v3, v2, v3

    .line 61
    .line 62
    div-float/2addr v3, v5

    .line 63
    :goto_1
    sub-float/2addr v3, v10

    .line 64
    const/4 v5, 0x1

    .line 65
    int-to-float v5, v5

    .line 66
    sub-float v5, v5, p8

    .line 67
    .line 68
    mul-float v7, v5, v3

    .line 69
    .line 70
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    int-to-float v3, v3

    .line 75
    add-float/2addr v3, v10

    .line 76
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    add-float/2addr v5, v3

    .line 81
    invoke-interface {v15, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    add-float v6, v0, v5

    .line 86
    .line 87
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    move-object/from16 v0, p1

    .line 92
    .line 93
    invoke-static {v0, v14, v4}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    move-object/from16 v8, p2

    .line 98
    .line 99
    invoke-static {v8, v14, v4}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    move-object/from16 v11, p3

    .line 104
    .line 105
    invoke-static {v11, v14, v4}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    sub-float v13, v10, v1

    .line 114
    .line 115
    invoke-static {v2}, Lt6/a;->q(F)I

    .line 116
    .line 117
    .line 118
    move-result v16

    .line 119
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$placeLabelAndIcon$1;

    .line 120
    .line 121
    move-object/from16 v4, p1

    .line 122
    .line 123
    move-object/from16 v1, p4

    .line 124
    .line 125
    move/from16 v2, p7

    .line 126
    .line 127
    move/from16 v3, p8

    .line 128
    .line 129
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/NavigationBarKt$placeLabelAndIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/ui/layout/Placeable;IFFLandroidx/compose/ui/layout/Placeable;IFLandroidx/compose/ui/layout/Placeable;IFILandroidx/compose/ui/layout/MeasureScope;)V

    .line 130
    .line 131
    .line 132
    const/4 v1, 0x4

    .line 133
    const/4 v2, 0x0

    .line 134
    const/4 v3, 0x0

    .line 135
    move-object/from16 p1, p0

    .line 136
    .line 137
    move-object/from16 p5, v0

    .line 138
    .line 139
    move/from16 p6, v1

    .line 140
    .line 141
    move-object/from16 p7, v2

    .line 142
    .line 143
    move-object/from16 p4, v3

    .line 144
    .line 145
    move/from16 p2, v14

    .line 146
    .line 147
    move/from16 p3, v16

    .line 148
    .line 149
    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0
.end method
