.class public final Landroidx/compose/material3/NavigationBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001ae\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00130\u001d\u00a2\u0006\u0002\u0008\u001f\u00a2\u0006\u0002\u0008 H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"\u001ak\u0010#\u001a\u00020\u00132\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00130%\u00a2\u0006\u0002\u0008\u001f2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00130%\u00a2\u0006\u0002\u0008\u001f2\u0011\u0010\'\u001a\r\u0012\u0004\u0012\u00020\u00130%\u00a2\u0006\u0002\u0008\u001f2\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010%\u00a2\u0006\u0002\u0008\u001f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0003\u00a2\u0006\u0002\u0010-\u001a\u0083\u0001\u0010.\u001a\u00020\u0013*\u00020\u001e2\u0006\u0010/\u001a\u00020*2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00130%2\u0011\u0010\'\u001a\r\u0012\u0004\u0012\u00020\u00130%\u00a2\u0006\u0002\u0008\u001f2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u00101\u001a\u00020*2\u0015\u0008\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010%\u00a2\u0006\u0002\u0008\u001f2\u0008\u0008\u0002\u0010)\u001a\u00020*2\u0008\u0008\u0002\u00102\u001a\u0002032\u0008\u0008\u0002\u00104\u001a\u000205H\u0007\u00a2\u0006\u0002\u00106\u001a;\u00107\u001a\u000208*\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0008\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010A\u001aS\u0010B\u001a\u000208*\u0002092\u0006\u0010C\u001a\u00020;2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0008\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u0010E\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0008\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u000c\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\r\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0011\u0010\u000f\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006F"
    }
    d2 = {
        "IconLayoutIdTag",
        "",
        "IndicatorHorizontalPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "IndicatorLayoutIdTag",
        "IndicatorRippleLayoutIdTag",
        "IndicatorVerticalOffset",
        "IndicatorVerticalPadding",
        "ItemAnimationDurationMillis",
        "",
        "LabelLayoutIdTag",
        "NavigationBarHeight",
        "NavigationBarItemHorizontalPadding",
        "getNavigationBarItemHorizontalPadding",
        "()F",
        "NavigationBarItemVerticalPadding",
        "getNavigationBarItemVerticalPadding",
        "NavigationBar",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "tonalElevation",
        "windowInsets",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "NavigationBar-HsRjFd4",
        "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "NavigationBarItemBaselineLayout",
        "indicatorRipple",
        "Lkotlin/Function0;",
        "indicator",
        "icon",
        "label",
        "alwaysShowLabel",
        "",
        "animationProgress",
        "",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V",
        "NavigationBarItem",
        "selected",
        "onClick",
        "enabled",
        "colors",
        "Landroidx/compose/material3/NavigationBarItemColors;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "placeIcon",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "iconPlaceable",
        "Landroidx/compose/ui/layout/Placeable;",
        "indicatorRipplePlaceable",
        "indicatorPlaceable",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "placeIcon-X9ElhV4",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;",
        "placeLabelAndIcon",
        "labelPlaceable",
        "placeLabelAndIcon-zUg2_y0",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final IconLayoutIdTag:Ljava/lang/String; = "icon"

.field private static final IndicatorHorizontalPadding:F

.field private static final IndicatorLayoutIdTag:Ljava/lang/String; = "indicator"

.field private static final IndicatorRippleLayoutIdTag:Ljava/lang/String; = "indicatorRipple"

.field private static final IndicatorVerticalOffset:F

.field private static final IndicatorVerticalPadding:F

.field private static final ItemAnimationDurationMillis:I = 0x64

.field private static final LabelLayoutIdTag:Ljava/lang/String; = "label"

.field private static final NavigationBarHeight:F

.field private static final NavigationBarItemHorizontalPadding:F

.field private static final NavigationBarItemVerticalPadding:F


# direct methods
.method public static constructor <clinit>()V
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
    const/16 v1, 0x10

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sput v1, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemVerticalPadding:F

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getIconSize-D9Ej5fM()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    sub-float/2addr v1, v2

    .line 36
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x2

    .line 41
    int-to-float v2, v2

    .line 42
    div-float/2addr v1, v2

    .line 43
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sput v1, Landroidx/compose/material3/NavigationBarKt;->IndicatorHorizontalPadding:F

    .line 48
    .line 49
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorHeight-D9Ej5fM()F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getIconSize-D9Ej5fM()F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sub-float/2addr v1, v0

    .line 58
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    div-float/2addr v0, v2

    .line 63
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sput v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

    .line 68
    .line 69
    const/16 v0, 0xc

    .line 70
    .line 71
    int-to-float v0, v0

    .line 72
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    sput v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalOffset:F

    .line 77
    .line 78
    return-void
.end method

.method public static final NavigationBar-HsRjFd4(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 25
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
    move-object/from16 v8, p7

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    const-string v0, "content"

    .line 6
    .line 7
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, 0x5f2d444b

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p8

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    and-int/lit8 v2, p10, 0x1

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    or-int/lit8 v3, v9, 0x6

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
    and-int/lit8 v3, v9, 0xe

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
    or-int/2addr v4, v9

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object/from16 v3, p0

    .line 47
    .line 48
    move v4, v9

    .line 49
    :goto_1
    and-int/lit8 v5, v9, 0x70

    .line 50
    .line 51
    if-nez v5, :cond_5

    .line 52
    .line 53
    and-int/lit8 v5, p10, 0x2

    .line 54
    .line 55
    if-nez v5, :cond_3

    .line 56
    .line 57
    move-wide/from16 v5, p1

    .line 58
    .line 59
    invoke-interface {v1, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    const/16 v7, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move-wide/from16 v5, p1

    .line 69
    .line 70
    :cond_4
    const/16 v7, 0x10

    .line 71
    .line 72
    :goto_2
    or-int/2addr v4, v7

    .line 73
    goto :goto_3

    .line 74
    :cond_5
    move-wide/from16 v5, p1

    .line 75
    .line 76
    :goto_3
    and-int/lit16 v7, v9, 0x380

    .line 77
    .line 78
    if-nez v7, :cond_7

    .line 79
    .line 80
    and-int/lit8 v7, p10, 0x4

    .line 81
    .line 82
    move-wide/from16 v10, p3

    .line 83
    .line 84
    if-nez v7, :cond_6

    .line 85
    .line 86
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_6

    .line 91
    .line 92
    const/16 v7, 0x100

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    const/16 v7, 0x80

    .line 96
    .line 97
    :goto_4
    or-int/2addr v4, v7

    .line 98
    goto :goto_5

    .line 99
    :cond_7
    move-wide/from16 v10, p3

    .line 100
    .line 101
    :goto_5
    and-int/lit8 v7, p10, 0x8

    .line 102
    .line 103
    if-eqz v7, :cond_8

    .line 104
    .line 105
    or-int/lit16 v4, v4, 0xc00

    .line 106
    .line 107
    goto :goto_7

    .line 108
    :cond_8
    and-int/lit16 v12, v9, 0x1c00

    .line 109
    .line 110
    if-nez v12, :cond_a

    .line 111
    .line 112
    move/from16 v12, p5

    .line 113
    .line 114
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-eqz v13, :cond_9

    .line 119
    .line 120
    const/16 v13, 0x800

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_9
    const/16 v13, 0x400

    .line 124
    .line 125
    :goto_6
    or-int/2addr v4, v13

    .line 126
    goto :goto_8

    .line 127
    :cond_a
    :goto_7
    move/from16 v12, p5

    .line 128
    .line 129
    :goto_8
    const v13, 0xe000

    .line 130
    .line 131
    .line 132
    and-int v14, v9, v13

    .line 133
    .line 134
    if-nez v14, :cond_d

    .line 135
    .line 136
    and-int/lit8 v14, p10, 0x10

    .line 137
    .line 138
    if-nez v14, :cond_b

    .line 139
    .line 140
    move-object/from16 v14, p6

    .line 141
    .line 142
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    if-eqz v15, :cond_c

    .line 147
    .line 148
    const/16 v15, 0x4000

    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_b
    move-object/from16 v14, p6

    .line 152
    .line 153
    :cond_c
    const/16 v15, 0x2000

    .line 154
    .line 155
    :goto_9
    or-int/2addr v4, v15

    .line 156
    goto :goto_a

    .line 157
    :cond_d
    move-object/from16 v14, p6

    .line 158
    .line 159
    :goto_a
    and-int/lit8 v15, p10, 0x20

    .line 160
    .line 161
    if-eqz v15, :cond_e

    .line 162
    .line 163
    const/high16 v15, 0x30000

    .line 164
    .line 165
    :goto_b
    or-int/2addr v4, v15

    .line 166
    goto :goto_c

    .line 167
    :cond_e
    const/high16 v15, 0x70000

    .line 168
    .line 169
    and-int/2addr v15, v9

    .line 170
    if-nez v15, :cond_10

    .line 171
    .line 172
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    if-eqz v15, :cond_f

    .line 177
    .line 178
    const/high16 v15, 0x20000

    .line 179
    .line 180
    goto :goto_b

    .line 181
    :cond_f
    const/high16 v15, 0x10000

    .line 182
    .line 183
    goto :goto_b

    .line 184
    :cond_10
    :goto_c
    const v15, 0x5b6db

    .line 185
    .line 186
    .line 187
    and-int/2addr v15, v4

    .line 188
    const v13, 0x12492

    .line 189
    .line 190
    .line 191
    if-ne v15, v13, :cond_12

    .line 192
    .line 193
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    if-nez v13, :cond_11

    .line 198
    .line 199
    goto :goto_d

    .line 200
    :cond_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 201
    .line 202
    .line 203
    move-object v2, v3

    .line 204
    move v7, v12

    .line 205
    goto/16 :goto_12

    .line 206
    .line 207
    :cond_12
    :goto_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 208
    .line 209
    .line 210
    and-int/lit8 v13, v9, 0x1

    .line 211
    .line 212
    const v15, -0xe001

    .line 213
    .line 214
    .line 215
    if-eqz v13, :cond_18

    .line 216
    .line 217
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    if-eqz v13, :cond_13

    .line 222
    .line 223
    goto :goto_f

    .line 224
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 225
    .line 226
    .line 227
    and-int/lit8 v2, p10, 0x2

    .line 228
    .line 229
    if-eqz v2, :cond_14

    .line 230
    .line 231
    and-int/lit8 v4, v4, -0x71

    .line 232
    .line 233
    :cond_14
    and-int/lit8 v2, p10, 0x4

    .line 234
    .line 235
    if-eqz v2, :cond_15

    .line 236
    .line 237
    and-int/lit16 v4, v4, -0x381

    .line 238
    .line 239
    :cond_15
    and-int/lit8 v2, p10, 0x10

    .line 240
    .line 241
    if-eqz v2, :cond_16

    .line 242
    .line 243
    and-int/2addr v4, v15

    .line 244
    :cond_16
    move-object v2, v3

    .line 245
    :cond_17
    :goto_e
    move v7, v12

    .line 246
    move-wide/from16 v23, v10

    .line 247
    .line 248
    move v10, v4

    .line 249
    move-wide/from16 v3, v23

    .line 250
    .line 251
    goto :goto_11

    .line 252
    :cond_18
    :goto_f
    if-eqz v2, :cond_19

    .line 253
    .line 254
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 255
    .line 256
    goto :goto_10

    .line 257
    :cond_19
    move-object v2, v3

    .line 258
    :goto_10
    and-int/lit8 v3, p10, 0x2

    .line 259
    .line 260
    const/4 v13, 0x6

    .line 261
    if-eqz v3, :cond_1a

    .line 262
    .line 263
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 264
    .line 265
    invoke-virtual {v3, v1, v13}, Landroidx/compose/material3/NavigationBarDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 266
    .line 267
    .line 268
    move-result-wide v5

    .line 269
    and-int/lit8 v4, v4, -0x71

    .line 270
    .line 271
    :cond_1a
    and-int/lit8 v3, p10, 0x4

    .line 272
    .line 273
    if-eqz v3, :cond_1b

    .line 274
    .line 275
    sget-object v3, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 276
    .line 277
    invoke-virtual {v3, v1, v13}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-static {v3, v5, v6}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-4WTKRHQ(Landroidx/compose/material3/ColorScheme;J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v10

    .line 285
    and-int/lit16 v3, v4, -0x381

    .line 286
    .line 287
    move v4, v3

    .line 288
    :cond_1b
    if-eqz v7, :cond_1c

    .line 289
    .line 290
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 291
    .line 292
    invoke-virtual {v3}, Landroidx/compose/material3/NavigationBarDefaults;->getElevation-D9Ej5fM()F

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    move v12, v3

    .line 297
    :cond_1c
    and-int/lit8 v3, p10, 0x10

    .line 298
    .line 299
    if-eqz v3, :cond_17

    .line 300
    .line 301
    sget-object v3, Landroidx/compose/material3/NavigationBarDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarDefaults;

    .line 302
    .line 303
    invoke-virtual {v3, v1, v13}, Landroidx/compose/material3/NavigationBarDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    and-int/2addr v4, v15

    .line 308
    move-object v14, v3

    .line 309
    goto :goto_e

    .line 310
    :goto_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 311
    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    if-eqz v11, :cond_1d

    .line 318
    .line 319
    const/4 v11, -0x1

    .line 320
    const-string v12, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)"

    .line 321
    .line 322
    invoke-static {v0, v10, v11, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    :cond_1d
    const/4 v11, 0x0

    .line 326
    const/16 v17, 0x0

    .line 327
    .line 328
    const/16 v18, 0x0

    .line 329
    .line 330
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBar$1;

    .line 331
    .line 332
    invoke-direct {v0, v14, v8, v10}, Landroidx/compose/material3/NavigationBarKt$NavigationBar$1;-><init>(Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;I)V

    .line 333
    .line 334
    .line 335
    const v12, 0x64c4a90

    .line 336
    .line 337
    .line 338
    const/4 v13, 0x1

    .line 339
    invoke-static {v1, v12, v13, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 340
    .line 341
    .line 342
    move-result-object v19

    .line 343
    const/high16 v0, 0xc00000

    .line 344
    .line 345
    and-int/lit8 v12, v10, 0xe

    .line 346
    .line 347
    or-int/2addr v0, v12

    .line 348
    shl-int/lit8 v10, v10, 0x3

    .line 349
    .line 350
    and-int/lit16 v12, v10, 0x380

    .line 351
    .line 352
    or-int/2addr v0, v12

    .line 353
    and-int/lit16 v12, v10, 0x1c00

    .line 354
    .line 355
    or-int/2addr v0, v12

    .line 356
    const v12, 0xe000

    .line 357
    .line 358
    .line 359
    and-int/2addr v10, v12

    .line 360
    or-int v21, v0, v10

    .line 361
    .line 362
    const/16 v22, 0x62

    .line 363
    .line 364
    move-object v10, v2

    .line 365
    move-wide v12, v5

    .line 366
    move-object v0, v14

    .line 367
    move-wide v14, v3

    .line 368
    move/from16 v16, v7

    .line 369
    .line 370
    move-object/from16 v20, v1

    .line 371
    .line 372
    invoke-static/range {v10 .. v22}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 373
    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    if-eqz v10, :cond_1e

    .line 380
    .line 381
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 382
    .line 383
    .line 384
    :cond_1e
    move-object v14, v0

    .line 385
    move-wide v10, v3

    .line 386
    :goto_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 387
    .line 388
    .line 389
    move-result-object v12

    .line 390
    if-nez v12, :cond_1f

    .line 391
    .line 392
    goto :goto_13

    .line 393
    :cond_1f
    new-instance v13, Landroidx/compose/material3/NavigationBarKt$NavigationBar$2;

    .line 394
    .line 395
    move-object v0, v13

    .line 396
    move-object v1, v2

    .line 397
    move-wide v2, v5

    .line 398
    move-wide v4, v10

    .line 399
    move v6, v7

    .line 400
    move-object v7, v14

    .line 401
    move-object/from16 v8, p7

    .line 402
    .line 403
    move/from16 v9, p9

    .line 404
    .line 405
    move/from16 v10, p10

    .line 406
    .line 407
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/NavigationBarKt$NavigationBar$2;-><init>(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;II)V

    .line 408
    .line 409
    .line 410
    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 411
    .line 412
    .line 413
    :goto_13
    return-void
.end method

.method public static final NavigationBarItem(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 30
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
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/material3/NavigationBarItemColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v11, p11

    .line 10
    .line 11
    move/from16 v12, p12

    .line 12
    .line 13
    const-string v0, "<this>"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "onClick"

    .line 19
    .line 20
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "icon"

    .line 24
    .line 25
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const v0, -0x278c5fbe

    .line 29
    .line 30
    .line 31
    move-object/from16 v5, p10

    .line 32
    .line 33
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const/high16 v6, -0x80000000

    .line 38
    .line 39
    and-int/2addr v6, v12

    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    or-int/lit8 v6, v11, 0x6

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    and-int/lit8 v6, v11, 0xe

    .line 46
    .line 47
    if-nez v6, :cond_2

    .line 48
    .line 49
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    const/4 v6, 0x4

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v6, 0x2

    .line 58
    :goto_0
    or-int/2addr v6, v11

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v6, v11

    .line 61
    :goto_1
    and-int/lit8 v8, v12, 0x1

    .line 62
    .line 63
    if-eqz v8, :cond_3

    .line 64
    .line 65
    or-int/lit8 v6, v6, 0x30

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    and-int/lit8 v8, v11, 0x70

    .line 69
    .line 70
    if-nez v8, :cond_5

    .line 71
    .line 72
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_4

    .line 77
    .line 78
    const/16 v8, 0x20

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const/16 v8, 0x10

    .line 82
    .line 83
    :goto_2
    or-int/2addr v6, v8

    .line 84
    :cond_5
    :goto_3
    and-int/lit8 v8, v12, 0x2

    .line 85
    .line 86
    if-eqz v8, :cond_6

    .line 87
    .line 88
    or-int/lit16 v6, v6, 0x180

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_6
    and-int/lit16 v8, v11, 0x380

    .line 92
    .line 93
    if-nez v8, :cond_8

    .line 94
    .line 95
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_7

    .line 100
    .line 101
    const/16 v8, 0x100

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_7
    const/16 v8, 0x80

    .line 105
    .line 106
    :goto_4
    or-int/2addr v6, v8

    .line 107
    :cond_8
    :goto_5
    and-int/lit8 v8, v12, 0x4

    .line 108
    .line 109
    if-eqz v8, :cond_9

    .line 110
    .line 111
    or-int/lit16 v6, v6, 0xc00

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_9
    and-int/lit16 v8, v11, 0x1c00

    .line 115
    .line 116
    if-nez v8, :cond_b

    .line 117
    .line 118
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_a

    .line 123
    .line 124
    const/16 v8, 0x800

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_a
    const/16 v8, 0x400

    .line 128
    .line 129
    :goto_6
    or-int/2addr v6, v8

    .line 130
    :cond_b
    :goto_7
    and-int/lit8 v8, v12, 0x8

    .line 131
    .line 132
    const v9, 0xe000

    .line 133
    .line 134
    .line 135
    if-eqz v8, :cond_c

    .line 136
    .line 137
    or-int/lit16 v6, v6, 0x6000

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_c
    and-int v10, v11, v9

    .line 141
    .line 142
    if-nez v10, :cond_e

    .line 143
    .line 144
    move-object/from16 v10, p4

    .line 145
    .line 146
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    goto :goto_8

    .line 155
    :cond_d
    const/16 v13, 0x2000

    .line 156
    .line 157
    :goto_8
    or-int/2addr v6, v13

    .line 158
    goto :goto_a

    .line 159
    :cond_e
    :goto_9
    move-object/from16 v10, p4

    .line 160
    .line 161
    :goto_a
    and-int/lit8 v13, v12, 0x10

    .line 162
    .line 163
    if-eqz v13, :cond_f

    .line 164
    .line 165
    const/high16 v14, 0x30000

    .line 166
    .line 167
    or-int/2addr v6, v14

    .line 168
    goto :goto_c

    .line 169
    :cond_f
    const/high16 v14, 0x70000

    .line 170
    .line 171
    and-int/2addr v14, v11

    .line 172
    if-nez v14, :cond_11

    .line 173
    .line 174
    move/from16 v14, p5

    .line 175
    .line 176
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-eqz v15, :cond_10

    .line 181
    .line 182
    const/high16 v15, 0x20000

    .line 183
    .line 184
    goto :goto_b

    .line 185
    :cond_10
    const/high16 v15, 0x10000

    .line 186
    .line 187
    :goto_b
    or-int/2addr v6, v15

    .line 188
    goto :goto_d

    .line 189
    :cond_11
    :goto_c
    move/from16 v14, p5

    .line 190
    .line 191
    :goto_d
    and-int/lit8 v15, v12, 0x20

    .line 192
    .line 193
    if-eqz v15, :cond_12

    .line 194
    .line 195
    const/high16 v16, 0x180000

    .line 196
    .line 197
    or-int v6, v6, v16

    .line 198
    .line 199
    move-object/from16 v9, p6

    .line 200
    .line 201
    goto :goto_f

    .line 202
    :cond_12
    const/high16 v16, 0x380000

    .line 203
    .line 204
    and-int v16, v11, v16

    .line 205
    .line 206
    move-object/from16 v9, p6

    .line 207
    .line 208
    if-nez v16, :cond_14

    .line 209
    .line 210
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v16

    .line 214
    if-eqz v16, :cond_13

    .line 215
    .line 216
    const/high16 v16, 0x100000

    .line 217
    .line 218
    goto :goto_e

    .line 219
    :cond_13
    const/high16 v16, 0x80000

    .line 220
    .line 221
    :goto_e
    or-int v6, v6, v16

    .line 222
    .line 223
    :cond_14
    :goto_f
    and-int/lit8 v16, v12, 0x40

    .line 224
    .line 225
    if-eqz v16, :cond_15

    .line 226
    .line 227
    const/high16 v17, 0xc00000

    .line 228
    .line 229
    or-int v6, v6, v17

    .line 230
    .line 231
    move/from16 v7, p7

    .line 232
    .line 233
    goto :goto_11

    .line 234
    :cond_15
    const/high16 v17, 0x1c00000

    .line 235
    .line 236
    and-int v17, v11, v17

    .line 237
    .line 238
    move/from16 v7, p7

    .line 239
    .line 240
    if-nez v17, :cond_17

    .line 241
    .line 242
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 243
    .line 244
    .line 245
    move-result v17

    .line 246
    if-eqz v17, :cond_16

    .line 247
    .line 248
    const/high16 v17, 0x800000

    .line 249
    .line 250
    goto :goto_10

    .line 251
    :cond_16
    const/high16 v17, 0x400000

    .line 252
    .line 253
    :goto_10
    or-int v6, v6, v17

    .line 254
    .line 255
    :cond_17
    :goto_11
    const/high16 v17, 0xe000000

    .line 256
    .line 257
    and-int v17, v11, v17

    .line 258
    .line 259
    if-nez v17, :cond_1a

    .line 260
    .line 261
    and-int/lit16 v0, v12, 0x100

    .line 262
    .line 263
    if-nez v0, :cond_18

    .line 264
    .line 265
    move-object/from16 v0, p8

    .line 266
    .line 267
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v17

    .line 271
    if-eqz v17, :cond_19

    .line 272
    .line 273
    const/high16 v17, 0x4000000

    .line 274
    .line 275
    goto :goto_12

    .line 276
    :cond_18
    move-object/from16 v0, p8

    .line 277
    .line 278
    :cond_19
    const/high16 v17, 0x2000000

    .line 279
    .line 280
    :goto_12
    or-int v6, v6, v17

    .line 281
    .line 282
    goto :goto_13

    .line 283
    :cond_1a
    move-object/from16 v0, p8

    .line 284
    .line 285
    :goto_13
    and-int/lit16 v14, v12, 0x100

    .line 286
    .line 287
    if-eqz v14, :cond_1b

    .line 288
    .line 289
    const/high16 v17, 0x30000000

    .line 290
    .line 291
    or-int v6, v6, v17

    .line 292
    .line 293
    goto :goto_15

    .line 294
    :cond_1b
    const/high16 v17, 0x70000000

    .line 295
    .line 296
    and-int v17, v11, v17

    .line 297
    .line 298
    if-nez v17, :cond_1d

    .line 299
    .line 300
    move/from16 v17, v14

    .line 301
    .line 302
    move-object/from16 v14, p9

    .line 303
    .line 304
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v18

    .line 308
    if-eqz v18, :cond_1c

    .line 309
    .line 310
    const/high16 v18, 0x20000000

    .line 311
    .line 312
    goto :goto_14

    .line 313
    :cond_1c
    const/high16 v18, 0x10000000

    .line 314
    .line 315
    :goto_14
    or-int v6, v6, v18

    .line 316
    .line 317
    goto :goto_16

    .line 318
    :cond_1d
    :goto_15
    move/from16 v17, v14

    .line 319
    .line 320
    move-object/from16 v14, p9

    .line 321
    .line 322
    :goto_16
    const v18, 0x5b6db6db

    .line 323
    .line 324
    .line 325
    and-int v0, v6, v18

    .line 326
    .line 327
    const v1, 0x12492492

    .line 328
    .line 329
    .line 330
    if-ne v0, v1, :cond_1f

    .line 331
    .line 332
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-nez v0, :cond_1e

    .line 337
    .line 338
    goto :goto_17

    .line 339
    :cond_1e
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 340
    .line 341
    .line 342
    move/from16 v6, p5

    .line 343
    .line 344
    move v8, v7

    .line 345
    move-object v7, v9

    .line 346
    move-object/from16 v23, v10

    .line 347
    .line 348
    move-object v10, v14

    .line 349
    move-object/from16 v9, p8

    .line 350
    .line 351
    goto/16 :goto_1f

    .line 352
    .line 353
    :cond_1f
    :goto_17
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 354
    .line 355
    .line 356
    and-int/lit8 v0, v11, 0x1

    .line 357
    .line 358
    const v27, -0xe000001

    .line 359
    .line 360
    .line 361
    if-eqz v0, :cond_22

    .line 362
    .line 363
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_20

    .line 368
    .line 369
    goto :goto_18

    .line 370
    :cond_20
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 371
    .line 372
    .line 373
    and-int/lit16 v0, v12, 0x80

    .line 374
    .line 375
    if-eqz v0, :cond_21

    .line 376
    .line 377
    and-int v6, v6, v27

    .line 378
    .line 379
    :cond_21
    move/from16 v0, p5

    .line 380
    .line 381
    move-object/from16 v8, p8

    .line 382
    .line 383
    move v13, v6

    .line 384
    move-object v6, v14

    .line 385
    goto/16 :goto_1b

    .line 386
    .line 387
    :cond_22
    :goto_18
    if-eqz v8, :cond_23

    .line 388
    .line 389
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 390
    .line 391
    move-object v10, v0

    .line 392
    :cond_23
    if-eqz v13, :cond_24

    .line 393
    .line 394
    const/4 v0, 0x1

    .line 395
    goto :goto_19

    .line 396
    :cond_24
    move/from16 v0, p5

    .line 397
    .line 398
    :goto_19
    if-eqz v15, :cond_25

    .line 399
    .line 400
    const/4 v9, 0x0

    .line 401
    :cond_25
    if-eqz v16, :cond_26

    .line 402
    .line 403
    const/4 v7, 0x1

    .line 404
    :cond_26
    and-int/lit16 v8, v12, 0x80

    .line 405
    .line 406
    if-eqz v8, :cond_27

    .line 407
    .line 408
    sget-object v13, Landroidx/compose/material3/NavigationBarItemDefaults;->INSTANCE:Landroidx/compose/material3/NavigationBarItemDefaults;

    .line 409
    .line 410
    const-wide/16 v15, 0x0

    .line 411
    .line 412
    const-wide/16 v18, 0x0

    .line 413
    .line 414
    const-wide/16 v20, 0x0

    .line 415
    .line 416
    const-wide/16 v22, 0x0

    .line 417
    .line 418
    const-wide/16 v24, 0x0

    .line 419
    .line 420
    const/high16 v8, 0x30000

    .line 421
    .line 422
    const/16 v26, 0x1f

    .line 423
    .line 424
    move/from16 v28, v17

    .line 425
    .line 426
    move-wide v14, v15

    .line 427
    move-wide/from16 v16, v18

    .line 428
    .line 429
    move-wide/from16 v18, v20

    .line 430
    .line 431
    move-wide/from16 v20, v22

    .line 432
    .line 433
    move-wide/from16 v22, v24

    .line 434
    .line 435
    move-object/from16 v24, v5

    .line 436
    .line 437
    move/from16 v25, v8

    .line 438
    .line 439
    invoke-virtual/range {v13 .. v26}, Landroidx/compose/material3/NavigationBarItemDefaults;->colors-zjMxDiM(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    and-int v6, v6, v27

    .line 444
    .line 445
    goto :goto_1a

    .line 446
    :cond_27
    move/from16 v28, v17

    .line 447
    .line 448
    move-object/from16 v8, p8

    .line 449
    .line 450
    :goto_1a
    if-eqz v28, :cond_29

    .line 451
    .line 452
    const v13, -0x1d58f75c

    .line 453
    .line 454
    .line 455
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 456
    .line 457
    .line 458
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v13

    .line 462
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 463
    .line 464
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v14

    .line 468
    if-ne v13, v14, :cond_28

    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 471
    .line 472
    .line 473
    move-result-object v13

    .line 474
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :cond_28
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 478
    .line 479
    .line 480
    check-cast v13, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 481
    .line 482
    move-object/from16 v29, v13

    .line 483
    .line 484
    move v13, v6

    .line 485
    move-object/from16 v6, v29

    .line 486
    .line 487
    goto :goto_1b

    .line 488
    :cond_29
    move v13, v6

    .line 489
    move-object/from16 v6, p9

    .line 490
    .line 491
    :goto_1b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 492
    .line 493
    .line 494
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 495
    .line 496
    .line 497
    move-result v14

    .line 498
    if-eqz v14, :cond_2a

    .line 499
    .line 500
    const/4 v14, -0x1

    .line 501
    const-string v15, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)"

    .line 502
    .line 503
    const v1, -0x278c5fbe

    .line 504
    .line 505
    .line 506
    invoke-static {v1, v13, v14, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 507
    .line 508
    .line 509
    :cond_2a
    new-instance v1, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1;

    .line 510
    .line 511
    move-object/from16 p4, v1

    .line 512
    .line 513
    move-object/from16 p5, v8

    .line 514
    .line 515
    move/from16 p6, p1

    .line 516
    .line 517
    move/from16 p7, v13

    .line 518
    .line 519
    move-object/from16 p8, v9

    .line 520
    .line 521
    move/from16 p9, v7

    .line 522
    .line 523
    move-object/from16 p10, p3

    .line 524
    .line 525
    invoke-direct/range {p4 .. p10}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1;-><init>(Landroidx/compose/material3/NavigationBarItemColors;ZILkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;)V

    .line 526
    .line 527
    .line 528
    const v14, -0x549d0324

    .line 529
    .line 530
    .line 531
    const/4 v15, 0x1

    .line 532
    invoke-static {v5, v14, v15, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    if-eqz v9, :cond_2b

    .line 537
    .line 538
    new-instance v14, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1;

    .line 539
    .line 540
    invoke-direct {v14, v8, v2, v13, v9}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1;-><init>(Landroidx/compose/material3/NavigationBarItemColors;ZILkotlin/jvm/functions/Function2;)V

    .line 541
    .line 542
    .line 543
    const v3, 0x620c84c8

    .line 544
    .line 545
    .line 546
    invoke-static {v5, v3, v15, v14}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    goto :goto_1c

    .line 551
    :cond_2b
    const/4 v3, 0x0

    .line 552
    :goto_1c
    const v14, -0x1d58f75c

    .line 553
    .line 554
    .line 555
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 556
    .line 557
    .line 558
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v14

    .line 562
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 563
    .line 564
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    move-object/from16 v21, v9

    .line 569
    .line 570
    const/4 v9, 0x0

    .line 571
    if-ne v14, v4, :cond_2c

    .line 572
    .line 573
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    const/4 v9, 0x0

    .line 578
    const/4 v14, 0x2

    .line 579
    invoke-static {v4, v9, v14, v9}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    move-object v14, v4

    .line 587
    :cond_2c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 588
    .line 589
    .line 590
    check-cast v14, Landroidx/compose/runtime/MutableState;

    .line 591
    .line 592
    sget-object v4, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 593
    .line 594
    invoke-virtual {v4}, Landroidx/compose/ui/semantics/Role$Companion;->getTab-o7Vup1c()I

    .line 595
    .line 596
    .line 597
    move-result v4

    .line 598
    const/4 v9, 0x0

    .line 599
    invoke-static {v4}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    move-object/from16 p4, v10

    .line 604
    .line 605
    move/from16 p5, p1

    .line 606
    .line 607
    move-object/from16 p6, v6

    .line 608
    .line 609
    move-object/from16 p7, v9

    .line 610
    .line 611
    move/from16 p8, v0

    .line 612
    .line 613
    move-object/from16 p9, v4

    .line 614
    .line 615
    move-object/from16 p10, p2

    .line 616
    .line 617
    invoke-static/range {p4 .. p10}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-O2vRcR0(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    const/high16 v9, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/16 v18, 0x0

    .line 624
    .line 625
    const/16 v19, 0x2

    .line 626
    .line 627
    const/16 v20, 0x0

    .line 628
    .line 629
    move-object/from16 p4, p0

    .line 630
    .line 631
    move-object/from16 p5, v4

    .line 632
    .line 633
    move/from16 p6, v9

    .line 634
    .line 635
    move/from16 p7, v18

    .line 636
    .line 637
    move/from16 p8, v19

    .line 638
    .line 639
    move-object/from16 p9, v20

    .line 640
    .line 641
    invoke-static/range {p4 .. p9}, Landroidx/compose/foundation/layout/e;->a(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    const v9, 0x44faf204

    .line 646
    .line 647
    .line 648
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 649
    .line 650
    .line 651
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v9

    .line 655
    move/from16 v22, v0

    .line 656
    .line 657
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    if-nez v9, :cond_2d

    .line 662
    .line 663
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v9

    .line 667
    if-ne v0, v9, :cond_2e

    .line 668
    .line 669
    :cond_2d
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$1;

    .line 670
    .line 671
    invoke-direct {v0, v14}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$2$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 672
    .line 673
    .line 674
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    :cond_2e
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 678
    .line 679
    .line 680
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 681
    .line 682
    invoke-static {v4, v0}, Landroidx/compose/ui/layout/OnRemeasuredModifierKt;->onSizeChanged(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 687
    .line 688
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    const v9, 0x2bb5b5d7

    .line 693
    .line 694
    .line 695
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 696
    .line 697
    .line 698
    const/4 v9, 0x6

    .line 699
    move-object/from16 v23, v10

    .line 700
    .line 701
    const/4 v10, 0x0

    .line 702
    invoke-static {v4, v10, v5, v9}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    const v10, -0x4ee9b9da

    .line 707
    .line 708
    .line 709
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 710
    .line 711
    .line 712
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 713
    .line 714
    .line 715
    move-result-object v10

    .line 716
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v10

    .line 720
    check-cast v10, Landroidx/compose/ui/unit/Density;

    .line 721
    .line 722
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 723
    .line 724
    .line 725
    move-result-object v9

    .line 726
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v9

    .line 730
    check-cast v9, Landroidx/compose/ui/unit/LayoutDirection;

    .line 731
    .line 732
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 733
    .line 734
    .line 735
    move-result-object v11

    .line 736
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v11

    .line 740
    check-cast v11, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 741
    .line 742
    sget-object v18, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 743
    .line 744
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 745
    .line 746
    .line 747
    move-result-object v12

    .line 748
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    move/from16 v24, v7

    .line 753
    .line 754
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 755
    .line 756
    .line 757
    move-result-object v7

    .line 758
    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    .line 759
    .line 760
    if-nez v7, :cond_2f

    .line 761
    .line 762
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 763
    .line 764
    .line 765
    :cond_2f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 766
    .line 767
    .line 768
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 769
    .line 770
    .line 771
    move-result v7

    .line 772
    if-eqz v7, :cond_30

    .line 773
    .line 774
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 775
    .line 776
    .line 777
    goto :goto_1d

    .line 778
    :cond_30
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 779
    .line 780
    .line 781
    :goto_1d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 782
    .line 783
    .line 784
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 785
    .line 786
    .line 787
    move-result-object v7

    .line 788
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 789
    .line 790
    .line 791
    move-result-object v12

    .line 792
    invoke-static {v7, v4, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    invoke-static {v7, v10, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    invoke-static {v7, v9, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    invoke-static {v7, v11, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 814
    .line 815
    .line 816
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 817
    .line 818
    .line 819
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 820
    .line 821
    .line 822
    move-result-object v4

    .line 823
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 824
    .line 825
    .line 826
    move-result-object v4

    .line 827
    const/4 v7, 0x0

    .line 828
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 829
    .line 830
    .line 831
    move-result-object v9

    .line 832
    invoke-interface {v0, v4, v5, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    const v0, 0x7ab4aae9

    .line 836
    .line 837
    .line 838
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 839
    .line 840
    .line 841
    const v0, -0x7f65a980

    .line 842
    .line 843
    .line 844
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 845
    .line 846
    .line 847
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 848
    .line 849
    const v0, 0x6b107e7c

    .line 850
    .line 851
    .line 852
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 853
    .line 854
    .line 855
    if-eqz v2, :cond_31

    .line 856
    .line 857
    const/high16 v0, 0x3f800000    # 1.0f

    .line 858
    .line 859
    goto :goto_1e

    .line 860
    :cond_31
    const/4 v0, 0x0

    .line 861
    :goto_1e
    const/16 v4, 0x64

    .line 862
    .line 863
    const/4 v7, 0x6

    .line 864
    const/4 v9, 0x0

    .line 865
    const/4 v10, 0x0

    .line 866
    invoke-static {v4, v9, v10, v7, v10}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    const/4 v7, 0x0

    .line 871
    const/4 v9, 0x0

    .line 872
    const/16 v10, 0x30

    .line 873
    .line 874
    const/16 v11, 0xc

    .line 875
    .line 876
    move/from16 p4, v0

    .line 877
    .line 878
    move-object/from16 p5, v4

    .line 879
    .line 880
    move/from16 p6, v7

    .line 881
    .line 882
    move-object/from16 p7, v9

    .line 883
    .line 884
    move-object/from16 p8, v5

    .line 885
    .line 886
    move/from16 p9, v10

    .line 887
    .line 888
    move/from16 p10, v11

    .line 889
    .line 890
    invoke-static/range {p4 .. p10}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v4

    .line 902
    check-cast v4, Landroidx/compose/ui/unit/Density;

    .line 903
    .line 904
    sget-object v7, Landroidx/compose/material3/tokens/NavigationBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationBarTokens;

    .line 905
    .line 906
    invoke-virtual {v7}, Landroidx/compose/material3/tokens/NavigationBarTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 907
    .line 908
    .line 909
    move-result v7

    .line 910
    invoke-interface {v4, v7}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 911
    .line 912
    .line 913
    move-result v7

    .line 914
    invoke-static {v14}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem$lambda-3(Landroidx/compose/runtime/MutableState;)I

    .line 915
    .line 916
    .line 917
    move-result v9

    .line 918
    sub-int/2addr v9, v7

    .line 919
    int-to-float v7, v9

    .line 920
    const/4 v9, 0x2

    .line 921
    int-to-float v9, v9

    .line 922
    div-float/2addr v7, v9

    .line 923
    sget v9, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalOffset:F

    .line 924
    .line 925
    invoke-interface {v4, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 926
    .line 927
    .line 928
    move-result v4

    .line 929
    invoke-static {v7, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 930
    .line 931
    .line 932
    move-result-wide v9

    .line 933
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 934
    .line 935
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 936
    .line 937
    .line 938
    move-result-object v4

    .line 939
    const v7, 0x1e7b2b64

    .line 940
    .line 941
    .line 942
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 943
    .line 944
    .line 945
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v7

    .line 949
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v4

    .line 953
    or-int/2addr v4, v7

    .line 954
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v7

    .line 958
    if-nez v4, :cond_32

    .line 959
    .line 960
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v4

    .line 964
    if-ne v7, v4, :cond_33

    .line 965
    .line 966
    :cond_32
    new-instance v7, Landroidx/compose/material3/MappedInteractionSource;

    .line 967
    .line 968
    const/4 v4, 0x0

    .line 969
    invoke-direct {v7, v6, v9, v10, v4}, Landroidx/compose/material3/MappedInteractionSource;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 970
    .line 971
    .line 972
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    :cond_33
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 976
    .line 977
    .line 978
    check-cast v7, Landroidx/compose/material3/MappedInteractionSource;

    .line 979
    .line 980
    new-instance v4, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$3$indicatorRipple$1;

    .line 981
    .line 982
    invoke-direct {v4, v7}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$3$indicatorRipple$1;-><init>(Landroidx/compose/material3/MappedInteractionSource;)V

    .line 983
    .line 984
    .line 985
    const v7, 0x293afa35

    .line 986
    .line 987
    .line 988
    const/4 v9, 0x1

    .line 989
    invoke-static {v5, v7, v9, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    new-instance v7, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$3$indicator$1;

    .line 994
    .line 995
    invoke-direct {v7, v8, v0}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$3$indicator$1;-><init>(Landroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/runtime/State;)V

    .line 996
    .line 997
    .line 998
    const v10, -0x1c472dfb

    .line 999
    .line 1000
    .line 1001
    invoke-static {v5, v10, v9, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v14

    .line 1005
    invoke-static {v0}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem$lambda-9$lambda-6(Landroidx/compose/runtime/State;)F

    .line 1006
    .line 1007
    .line 1008
    move-result v18

    .line 1009
    shr-int/lit8 v0, v13, 0x9

    .line 1010
    .line 1011
    const v7, 0xe000

    .line 1012
    .line 1013
    .line 1014
    and-int/2addr v0, v7

    .line 1015
    or-int/lit16 v0, v0, 0x1b6

    .line 1016
    .line 1017
    move-object v13, v4

    .line 1018
    move-object v15, v1

    .line 1019
    move-object/from16 v16, v3

    .line 1020
    .line 1021
    move/from16 v17, v24

    .line 1022
    .line 1023
    move-object/from16 v19, v5

    .line 1024
    .line 1025
    move/from16 v20, v0

    .line 1026
    .line 1027
    invoke-static/range {v13 .. v20}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V

    .line 1028
    .line 1029
    .line 1030
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1031
    .line 1032
    .line 1033
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1034
    .line 1035
    .line 1036
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1037
    .line 1038
    .line 1039
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1040
    .line 1041
    .line 1042
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1043
    .line 1044
    .line 1045
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1046
    .line 1047
    .line 1048
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v0

    .line 1052
    if-eqz v0, :cond_34

    .line 1053
    .line 1054
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1055
    .line 1056
    .line 1057
    :cond_34
    move-object v10, v6

    .line 1058
    move-object v9, v8

    .line 1059
    move-object/from16 v7, v21

    .line 1060
    .line 1061
    move/from16 v6, v22

    .line 1062
    .line 1063
    move/from16 v8, v24

    .line 1064
    .line 1065
    :goto_1f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v13

    .line 1069
    if-nez v13, :cond_35

    .line 1070
    .line 1071
    goto :goto_20

    .line 1072
    :cond_35
    new-instance v14, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;

    .line 1073
    .line 1074
    move-object v0, v14

    .line 1075
    move-object/from16 v1, p0

    .line 1076
    .line 1077
    move/from16 v2, p1

    .line 1078
    .line 1079
    move-object/from16 v3, p2

    .line 1080
    .line 1081
    move-object/from16 v4, p3

    .line 1082
    .line 1083
    move-object/from16 v5, v23

    .line 1084
    .line 1085
    move/from16 v11, p11

    .line 1086
    .line 1087
    move/from16 v12, p12

    .line 1088
    .line 1089
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItem$4;-><init>(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 1090
    .line 1091
    .line 1092
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1093
    .line 1094
    .line 1095
    :goto_20
    return-void
.end method

.method private static final NavigationBarItem$lambda-3(Landroidx/compose/runtime/MutableState;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final NavigationBarItem$lambda-4(Landroidx/compose/runtime/MutableState;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final NavigationBarItem$lambda-9$lambda-6(Landroidx/compose/runtime/State;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final NavigationBarItemBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;ZF",
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
    move/from16 v6, p5

    .line 12
    .line 13
    move/from16 v7, p7

    .line 14
    .line 15
    const v0, 0x233ba47b

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
    and-int/lit8 v9, v7, 0xe

    .line 25
    .line 26
    if-nez v9, :cond_1

    .line 27
    .line 28
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit8 v11, v7, 0x70

    .line 41
    .line 42
    if-nez v11, :cond_3

    .line 43
    .line 44
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-eqz v11, :cond_2

    .line 49
    .line 50
    const/16 v11, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v11, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v9, v11

    .line 56
    :cond_3
    and-int/lit16 v11, v7, 0x380

    .line 57
    .line 58
    if-nez v11, :cond_5

    .line 59
    .line 60
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_4

    .line 65
    .line 66
    const/16 v11, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v11, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v9, v11

    .line 72
    :cond_5
    and-int/lit16 v11, v7, 0x1c00

    .line 73
    .line 74
    if-nez v11, :cond_7

    .line 75
    .line 76
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-eqz v11, :cond_6

    .line 81
    .line 82
    const/16 v11, 0x800

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    const/16 v11, 0x400

    .line 86
    .line 87
    :goto_4
    or-int/2addr v9, v11

    .line 88
    :cond_7
    const v11, 0xe000

    .line 89
    .line 90
    .line 91
    and-int/2addr v11, v7

    .line 92
    if-nez v11, :cond_9

    .line 93
    .line 94
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_8

    .line 99
    .line 100
    const/16 v11, 0x4000

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v11, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v9, v11

    .line 106
    :cond_9
    const/high16 v11, 0x70000

    .line 107
    .line 108
    and-int/2addr v11, v7

    .line 109
    if-nez v11, :cond_b

    .line 110
    .line 111
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-eqz v11, :cond_a

    .line 116
    .line 117
    const/high16 v11, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v11, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v9, v11

    .line 123
    :cond_b
    const v11, 0x5b6db

    .line 124
    .line 125
    .line 126
    and-int/2addr v11, v9

    .line 127
    const v12, 0x12492

    .line 128
    .line 129
    .line 130
    if-ne v11, v12, :cond_d

    .line 131
    .line 132
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-nez v11, :cond_c

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_c

    .line 143
    .line 144
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    if-eqz v11, :cond_e

    .line 149
    .line 150
    const/4 v11, -0x1

    .line 151
    const-string v12, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:381)"

    .line 152
    .line 153
    invoke-static {v0, v9, v11, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_e
    new-instance v0, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemBaselineLayout$2;

    .line 157
    .line 158
    invoke-direct {v0, v6, v4, v5}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemBaselineLayout$2;-><init>(FLkotlin/jvm/functions/Function2;Z)V

    .line 159
    .line 160
    .line 161
    const v11, -0x4ee9b9da

    .line 162
    .line 163
    .line 164
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 165
    .line 166
    .line 167
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 168
    .line 169
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v13

    .line 177
    check-cast v13, Landroidx/compose/ui/unit/Density;

    .line 178
    .line 179
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    check-cast v14, Landroidx/compose/ui/unit/LayoutDirection;

    .line 188
    .line 189
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    check-cast v15, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 198
    .line 199
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 200
    .line 201
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-static {v12}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    .line 214
    .line 215
    if-nez v7, :cond_f

    .line 216
    .line 217
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 218
    .line 219
    .line 220
    :cond_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 221
    .line 222
    .line 223
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_10

    .line 228
    .line 229
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 230
    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_10
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 234
    .line 235
    .line 236
    :goto_8
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 237
    .line 238
    .line 239
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    invoke-static {v7, v0, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v7, v13, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v7, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v7, v15, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 272
    .line 273
    .line 274
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    const/4 v7, 0x0

    .line 283
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    invoke-interface {v11, v0, v8, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    const v0, 0x7ab4aae9

    .line 291
    .line 292
    .line 293
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 294
    .line 295
    .line 296
    const v10, 0x45c7e0b2

    .line 297
    .line 298
    .line 299
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 300
    .line 301
    .line 302
    and-int/lit8 v10, v9, 0xe

    .line 303
    .line 304
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    invoke-interface {v1, v8, v10}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    const v10, -0x1294b95b

    .line 312
    .line 313
    .line 314
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 315
    .line 316
    .line 317
    const/4 v10, 0x0

    .line 318
    cmpl-float v11, v6, v10

    .line 319
    .line 320
    if-lez v11, :cond_11

    .line 321
    .line 322
    shr-int/lit8 v11, v9, 0x3

    .line 323
    .line 324
    and-int/lit8 v11, v11, 0xe

    .line 325
    .line 326
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v11

    .line 330
    invoke-interface {v2, v8, v11}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    :cond_11
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 334
    .line 335
    .line 336
    const-string v11, "icon"

    .line 337
    .line 338
    invoke-static {v12, v11}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    const v13, 0x2bb5b5d7

    .line 343
    .line 344
    .line 345
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 346
    .line 347
    .line 348
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 349
    .line 350
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 351
    .line 352
    .line 353
    move-result-object v15

    .line 354
    invoke-static {v15, v7, v8, v7}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 355
    .line 356
    .line 357
    move-result-object v15

    .line 358
    const v13, -0x4ee9b9da

    .line 359
    .line 360
    .line 361
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 362
    .line 363
    .line 364
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 365
    .line 366
    .line 367
    move-result-object v13

    .line 368
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v13

    .line 372
    check-cast v13, Landroidx/compose/ui/unit/Density;

    .line 373
    .line 374
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v10

    .line 382
    check-cast v10, Landroidx/compose/ui/unit/LayoutDirection;

    .line 383
    .line 384
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    check-cast v0, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 393
    .line 394
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    invoke-static {v11}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    instance-of v1, v1, Landroidx/compose/runtime/Applier;

    .line 407
    .line 408
    if-nez v1, :cond_12

    .line 409
    .line 410
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 411
    .line 412
    .line 413
    :cond_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 414
    .line 415
    .line 416
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    if-eqz v1, :cond_13

    .line 421
    .line 422
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 423
    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_13
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 427
    .line 428
    .line 429
    :goto_9
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 430
    .line 431
    .line 432
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    invoke-static {v1, v15, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    invoke-static {v1, v13, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    invoke-static {v1, v10, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    invoke-static {v1, v0, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 465
    .line 466
    .line 467
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    const/4 v1, 0x0

    .line 476
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object v7

    .line 480
    invoke-interface {v11, v0, v8, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    const v0, 0x7ab4aae9

    .line 484
    .line 485
    .line 486
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 487
    .line 488
    .line 489
    const v0, -0x7f65a980

    .line 490
    .line 491
    .line 492
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 493
    .line 494
    .line 495
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 496
    .line 497
    const v1, -0x49c393c8

    .line 498
    .line 499
    .line 500
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 501
    .line 502
    .line 503
    shr-int/lit8 v1, v9, 0x6

    .line 504
    .line 505
    and-int/lit8 v1, v1, 0xe

    .line 506
    .line 507
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-interface {v3, v8, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 515
    .line 516
    .line 517
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 518
    .line 519
    .line 520
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 521
    .line 522
    .line 523
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 524
    .line 525
    .line 526
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 527
    .line 528
    .line 529
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 530
    .line 531
    .line 532
    if-eqz v4, :cond_17

    .line 533
    .line 534
    const-string v1, "label"

    .line 535
    .line 536
    invoke-static {v12, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    if-eqz v5, :cond_14

    .line 541
    .line 542
    const/high16 v7, 0x3f800000    # 1.0f

    .line 543
    .line 544
    goto :goto_a

    .line 545
    :cond_14
    move v7, v6

    .line 546
    :goto_a
    invoke-static {v1, v7}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    sget v7, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemHorizontalPadding:F

    .line 551
    .line 552
    const/4 v10, 0x2

    .line 553
    int-to-float v11, v10

    .line 554
    div-float/2addr v7, v11

    .line 555
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 556
    .line 557
    .line 558
    move-result v7

    .line 559
    const/4 v11, 0x0

    .line 560
    const/4 v12, 0x0

    .line 561
    invoke-static {v1, v7, v12, v10, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    const v7, 0x2bb5b5d7

    .line 566
    .line 567
    .line 568
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    const/4 v10, 0x0

    .line 576
    invoke-static {v7, v10, v8, v10}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    const v10, -0x4ee9b9da

    .line 581
    .line 582
    .line 583
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 584
    .line 585
    .line 586
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 587
    .line 588
    .line 589
    move-result-object v10

    .line 590
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v10

    .line 594
    check-cast v10, Landroidx/compose/ui/unit/Density;

    .line 595
    .line 596
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 597
    .line 598
    .line 599
    move-result-object v11

    .line 600
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v11

    .line 604
    check-cast v11, Landroidx/compose/ui/unit/LayoutDirection;

    .line 605
    .line 606
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 607
    .line 608
    .line 609
    move-result-object v12

    .line 610
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v12

    .line 614
    check-cast v12, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 615
    .line 616
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 617
    .line 618
    .line 619
    move-result-object v13

    .line 620
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 625
    .line 626
    .line 627
    move-result-object v14

    .line 628
    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    .line 629
    .line 630
    if-nez v14, :cond_15

    .line 631
    .line 632
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 633
    .line 634
    .line 635
    :cond_15
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 636
    .line 637
    .line 638
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 639
    .line 640
    .line 641
    move-result v14

    .line 642
    if-eqz v14, :cond_16

    .line 643
    .line 644
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 645
    .line 646
    .line 647
    goto :goto_b

    .line 648
    :cond_16
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 649
    .line 650
    .line 651
    :goto_b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 652
    .line 653
    .line 654
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 655
    .line 656
    .line 657
    move-result-object v13

    .line 658
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 659
    .line 660
    .line 661
    move-result-object v14

    .line 662
    invoke-static {v13, v7, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 666
    .line 667
    .line 668
    move-result-object v7

    .line 669
    invoke-static {v13, v10, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 673
    .line 674
    .line 675
    move-result-object v7

    .line 676
    invoke-static {v13, v11, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 680
    .line 681
    .line 682
    move-result-object v7

    .line 683
    invoke-static {v13, v12, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 684
    .line 685
    .line 686
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 687
    .line 688
    .line 689
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 690
    .line 691
    .line 692
    move-result-object v7

    .line 693
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    const/4 v10, 0x0

    .line 698
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 699
    .line 700
    .line 701
    move-result-object v10

    .line 702
    invoke-interface {v1, v7, v8, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    const v1, 0x7ab4aae9

    .line 706
    .line 707
    .line 708
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 709
    .line 710
    .line 711
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 712
    .line 713
    .line 714
    const v0, 0x156f7b8a

    .line 715
    .line 716
    .line 717
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 718
    .line 719
    .line 720
    shr-int/lit8 v0, v9, 0x9

    .line 721
    .line 722
    and-int/lit8 v0, v0, 0xe

    .line 723
    .line 724
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-interface {v4, v8, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 732
    .line 733
    .line 734
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 735
    .line 736
    .line 737
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 738
    .line 739
    .line 740
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 741
    .line 742
    .line 743
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 744
    .line 745
    .line 746
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 747
    .line 748
    .line 749
    :cond_17
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 750
    .line 751
    .line 752
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 753
    .line 754
    .line 755
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 756
    .line 757
    .line 758
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 759
    .line 760
    .line 761
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-eqz v0, :cond_18

    .line 766
    .line 767
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 768
    .line 769
    .line 770
    :cond_18
    :goto_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 771
    .line 772
    .line 773
    move-result-object v8

    .line 774
    if-nez v8, :cond_19

    .line 775
    .line 776
    goto :goto_d

    .line 777
    :cond_19
    new-instance v9, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemBaselineLayout$3;

    .line 778
    .line 779
    move-object v0, v9

    .line 780
    move-object/from16 v1, p0

    .line 781
    .line 782
    move-object/from16 v2, p1

    .line 783
    .line 784
    move-object/from16 v3, p2

    .line 785
    .line 786
    move-object/from16 v4, p3

    .line 787
    .line 788
    move/from16 v5, p4

    .line 789
    .line 790
    move/from16 v6, p5

    .line 791
    .line 792
    move/from16 v7, p7

    .line 793
    .line 794
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/NavigationBarKt$NavigationBarItemBaselineLayout$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFI)V

    .line 795
    .line 796
    .line 797
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 798
    .line 799
    .line 800
    :goto_d
    return-void
.end method

.method public static final synthetic access$NavigationBarItem$lambda-4(Landroidx/compose/runtime/MutableState;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem$lambda-4(Landroidx/compose/runtime/MutableState;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$NavigationBarItem$lambda-9$lambda-6(Landroidx/compose/runtime/State;)F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItem$lambda-9$lambda-6(Landroidx/compose/runtime/State;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$NavigationBarItemBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V

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

.method public static final synthetic access$getIndicatorVerticalPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

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

.method public static final getNavigationBarItemHorizontalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationBarItemVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method private static final placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 14

    .line 1
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 2
    .line 3
    .line 4
    move-result v10

    .line 5
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 6
    .line 7
    .line 8
    move-result v11

    .line 9
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sub-int v0, v10, v0

    .line 14
    .line 15
    div-int/lit8 v3, v0, 0x2

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sub-int v0, v11, v0

    .line 22
    .line 23
    div-int/lit8 v4, v0, 0x2

    .line 24
    .line 25
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int v0, v10, v0

    .line 30
    .line 31
    div-int/lit8 v6, v0, 0x2

    .line 32
    .line 33
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sub-int v0, v11, v0

    .line 38
    .line 39
    div-int/lit8 v7, v0, 0x2

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    new-instance v13, Landroidx/compose/material3/NavigationBarKt$placeIcon$1;

    .line 43
    .line 44
    move-object v0, v13

    .line 45
    move-object/from16 v1, p3

    .line 46
    .line 47
    move-object v2, p1

    .line 48
    move-object/from16 v5, p2

    .line 49
    .line 50
    move v8, v10

    .line 51
    move v9, v11

    .line 52
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/NavigationBarKt$placeIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IIII)V

    .line 53
    .line 54
    .line 55
    const/4 v5, 0x4

    .line 56
    const/4 v6, 0x0

    .line 57
    move-object v0, p0

    .line 58
    move v1, v10

    .line 59
    move v2, v11

    .line 60
    move-object v3, v12

    .line 61
    move-object v4, v13

    .line 62
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope$-CC;->p(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
.end method

.method private static final placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 20

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 4
    .line 5
    .line 6
    move-result v16

    .line 7
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sub-int v0, v16, v0

    .line 12
    .line 13
    sget v1, Landroidx/compose/material3/NavigationBarKt;->NavigationBarItemVerticalPadding:F

    .line 14
    .line 15
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sub-int v6, v0, v2

    .line 20
    .line 21
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    if-eqz p7, :cond_0

    .line 26
    .line 27
    move v0, v10

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-int v0, v16, v0

    .line 34
    .line 35
    div-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    :goto_0
    sub-int/2addr v0, v10

    .line 38
    int-to-float v0, v0

    .line 39
    const/4 v1, 0x1

    .line 40
    int-to-float v1, v1

    .line 41
    sub-float v1, v1, p8

    .line 42
    .line 43
    mul-float/2addr v0, v1

    .line 44
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 49
    .line 50
    .line 51
    move-result v17

    .line 52
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-int v0, v17, v0

    .line 57
    .line 58
    div-int/lit8 v5, v0, 0x2

    .line 59
    .line 60
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sub-int v0, v17, v0

    .line 65
    .line 66
    div-int/lit8 v9, v0, 0x2

    .line 67
    .line 68
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    sub-int v0, v17, v0

    .line 73
    .line 74
    div-int/lit8 v12, v0, 0x2

    .line 75
    .line 76
    sget v0, Landroidx/compose/material3/NavigationBarKt;->IndicatorVerticalPadding:F

    .line 77
    .line 78
    invoke-interface {v15, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    sub-int v13, v10, v0

    .line 83
    .line 84
    const/16 v18, 0x0

    .line 85
    .line 86
    new-instance v19, Landroidx/compose/material3/NavigationBarKt$placeLabelAndIcon$1;

    .line 87
    .line 88
    move-object/from16 v0, v19

    .line 89
    .line 90
    move-object/from16 v1, p4

    .line 91
    .line 92
    move/from16 v2, p7

    .line 93
    .line 94
    move/from16 v3, p8

    .line 95
    .line 96
    move-object/from16 v4, p1

    .line 97
    .line 98
    move-object/from16 v8, p2

    .line 99
    .line 100
    move-object/from16 v11, p3

    .line 101
    .line 102
    move/from16 v14, v17

    .line 103
    .line 104
    move-object/from16 v15, p0

    .line 105
    .line 106
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/NavigationBarKt$placeLabelAndIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/ui/layout/Placeable;IIILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IIILandroidx/compose/ui/layout/MeasureScope;)V

    .line 107
    .line 108
    .line 109
    const/4 v0, 0x4

    .line 110
    const/4 v1, 0x0

    .line 111
    move/from16 p1, v17

    .line 112
    .line 113
    move/from16 p2, v16

    .line 114
    .line 115
    move-object/from16 p3, v18

    .line 116
    .line 117
    move-object/from16 p4, v19

    .line 118
    .line 119
    move/from16 p5, v0

    .line 120
    .line 121
    move-object/from16 p6, v1

    .line 122
    .line 123
    invoke-static/range {p0 .. p6}, Landroidx/compose/ui/layout/MeasureScope$-CC;->p(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0
.end method
