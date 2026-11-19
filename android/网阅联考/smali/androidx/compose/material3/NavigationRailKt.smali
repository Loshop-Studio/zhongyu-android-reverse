.class public final Landroidx/compose/material3/NavigationRailKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a}\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b2 \u0008\u0002\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001e\u00a2\u0006\u0002\u0008 \u00a2\u0006\u0002\u0008!2\u0008\u0008\u0002\u0010\"\u001a\u00020#2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u001e\u00a2\u0006\u0002\u0008 \u00a2\u0006\u0002\u0008!H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008%\u0010&\u001a\u007f\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00170+2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00170+\u00a2\u0006\u0002\u0008 2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010-\u001a\u00020)2\u0015\u0008\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010+\u00a2\u0006\u0002\u0008 2\u0008\u0008\u0002\u0010/\u001a\u00020)2\u0008\u0008\u0002\u00100\u001a\u0002012\u0008\u0008\u0002\u00102\u001a\u000203H\u0007\u00a2\u0006\u0002\u00104\u001ak\u00105\u001a\u00020\u00172\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00170+\u00a2\u0006\u0002\u0008 2\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00170+\u00a2\u0006\u0002\u0008 2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00170+\u00a2\u0006\u0002\u0008 2\u0013\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010+\u00a2\u0006\u0002\u0008 2\u0006\u0010/\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0003\u00a2\u0006\u0002\u0010:\u001a;\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0008\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020CH\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u0010E\u001aS\u0010F\u001a\u00020<*\u00020=2\u0006\u0010G\u001a\u00020?2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0008\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020C2\u0006\u0010/\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008H\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0008\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u000c\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\r\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0011\u0010\u000f\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0013\u0010\u000f\"\u0019\u0010\u0014\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0015\u0010\u000f\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006J"
    }
    d2 = {
        "IconLayoutIdTag",
        "",
        "IndicatorHorizontalPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "IndicatorLayoutIdTag",
        "IndicatorRippleLayoutIdTag",
        "IndicatorVerticalPaddingNoLabel",
        "IndicatorVerticalPaddingWithLabel",
        "ItemAnimationDurationMillis",
        "",
        "LabelLayoutIdTag",
        "NavigationRailHeaderPadding",
        "NavigationRailItemHeight",
        "getNavigationRailItemHeight",
        "()F",
        "NavigationRailItemVerticalPadding",
        "getNavigationRailItemVerticalPadding",
        "NavigationRailItemWidth",
        "getNavigationRailItemWidth",
        "NavigationRailVerticalPadding",
        "getNavigationRailVerticalPadding",
        "NavigationRail",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "header",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "windowInsets",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "content",
        "NavigationRail-qi6gXK8",
        "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "NavigationRailItem",
        "selected",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "icon",
        "enabled",
        "label",
        "alwaysShowLabel",
        "colors",
        "Landroidx/compose/material3/NavigationRailItemColors;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "NavigationRailItemBaselineLayout",
        "indicatorRipple",
        "indicator",
        "animationProgress",
        "",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V",
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

.field private static final IndicatorVerticalPaddingNoLabel:F

.field private static final IndicatorVerticalPaddingWithLabel:F

.field private static final ItemAnimationDurationMillis:I = 0x96

.field private static final LabelLayoutIdTag:Ljava/lang/String; = "label"

.field private static final NavigationRailHeaderPadding:F

.field private static final NavigationRailItemHeight:F

.field private static final NavigationRailItemVerticalPadding:F

.field private static final NavigationRailItemWidth:F

.field private static final NavigationRailVerticalPadding:F


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sput v1, Landroidx/compose/material3/NavigationRailKt;->NavigationRailVerticalPadding:F

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
    sput v1, Landroidx/compose/material3/NavigationRailKt;->NavigationRailHeaderPadding:F

    .line 17
    .line 18
    sget-object v1, Landroidx/compose/material3/tokens/NavigationRailTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationRailTokens;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getContainerWidth-D9Ej5fM()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    sput v2, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemWidth:F

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getNoLabelActiveIndicatorHeight-D9Ej5fM()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    sput v2, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemHeight:F

    .line 31
    .line 32
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sput v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemVerticalPadding:F

    .line 37
    .line 38
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getIconSize-D9Ej5fM()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    sub-float/2addr v0, v2

    .line 47
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v2, 0x2

    .line 52
    int-to-float v2, v2

    .line 53
    div-float/2addr v0, v2

    .line 54
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sput v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorHorizontalPadding:F

    .line 59
    .line 60
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getActiveIndicatorHeight-D9Ej5fM()F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getIconSize-D9Ej5fM()F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    sub-float/2addr v0, v3

    .line 69
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    div-float/2addr v0, v2

    .line 74
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    sput v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingWithLabel:F

    .line 79
    .line 80
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getNoLabelActiveIndicatorHeight-D9Ej5fM()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getIconSize-D9Ej5fM()F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    sub-float/2addr v0, v1

    .line 89
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    div-float/2addr v0, v2

    .line 94
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    sput v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingNoLabel:F

    .line 99
    .line 100
    return-void
.end method

.method public static final NavigationRail-qi6gXK8(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/layout/WindowInsets;",
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
    const v0, 0x710f848

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
    move-object/from16 v12, p5

    .line 113
    .line 114
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v12, p5

    .line 128
    .line 129
    :goto_8
    const v13, 0xe000

    .line 130
    .line 131
    .line 132
    and-int/2addr v13, v9

    .line 133
    if-nez v13, :cond_d

    .line 134
    .line 135
    and-int/lit8 v13, p10, 0x10

    .line 136
    .line 137
    if-nez v13, :cond_b

    .line 138
    .line 139
    move-object/from16 v13, p6

    .line 140
    .line 141
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    if-eqz v14, :cond_c

    .line 146
    .line 147
    const/16 v14, 0x4000

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_b
    move-object/from16 v13, p6

    .line 151
    .line 152
    :cond_c
    const/16 v14, 0x2000

    .line 153
    .line 154
    :goto_9
    or-int/2addr v4, v14

    .line 155
    goto :goto_a

    .line 156
    :cond_d
    move-object/from16 v13, p6

    .line 157
    .line 158
    :goto_a
    and-int/lit8 v14, p10, 0x20

    .line 159
    .line 160
    if-eqz v14, :cond_e

    .line 161
    .line 162
    const/high16 v14, 0x30000

    .line 163
    .line 164
    :goto_b
    or-int/2addr v4, v14

    .line 165
    goto :goto_c

    .line 166
    :cond_e
    const/high16 v14, 0x70000

    .line 167
    .line 168
    and-int/2addr v14, v9

    .line 169
    if-nez v14, :cond_10

    .line 170
    .line 171
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    if-eqz v14, :cond_f

    .line 176
    .line 177
    const/high16 v14, 0x20000

    .line 178
    .line 179
    goto :goto_b

    .line 180
    :cond_f
    const/high16 v14, 0x10000

    .line 181
    .line 182
    goto :goto_b

    .line 183
    :cond_10
    :goto_c
    const v14, 0x5b6db

    .line 184
    .line 185
    .line 186
    and-int/2addr v14, v4

    .line 187
    const v15, 0x12492

    .line 188
    .line 189
    .line 190
    if-ne v14, v15, :cond_12

    .line 191
    .line 192
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    if-nez v14, :cond_11

    .line 197
    .line 198
    goto :goto_d

    .line 199
    :cond_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 200
    .line 201
    .line 202
    move-object v2, v3

    .line 203
    move-object v7, v12

    .line 204
    goto/16 :goto_12

    .line 205
    .line 206
    :cond_12
    :goto_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 207
    .line 208
    .line 209
    and-int/lit8 v14, v9, 0x1

    .line 210
    .line 211
    const v15, -0xe001

    .line 212
    .line 213
    .line 214
    if-eqz v14, :cond_18

    .line 215
    .line 216
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    if-eqz v14, :cond_13

    .line 221
    .line 222
    goto :goto_f

    .line 223
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 224
    .line 225
    .line 226
    and-int/lit8 v2, p10, 0x2

    .line 227
    .line 228
    if-eqz v2, :cond_14

    .line 229
    .line 230
    and-int/lit8 v4, v4, -0x71

    .line 231
    .line 232
    :cond_14
    and-int/lit8 v2, p10, 0x4

    .line 233
    .line 234
    if-eqz v2, :cond_15

    .line 235
    .line 236
    and-int/lit16 v4, v4, -0x381

    .line 237
    .line 238
    :cond_15
    and-int/lit8 v2, p10, 0x10

    .line 239
    .line 240
    if-eqz v2, :cond_16

    .line 241
    .line 242
    and-int/2addr v4, v15

    .line 243
    :cond_16
    move-object v2, v3

    .line 244
    :cond_17
    move-object v7, v12

    .line 245
    move-object v14, v13

    .line 246
    :goto_e
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
    const/4 v14, 0x6

    .line 261
    if-eqz v3, :cond_1a

    .line 262
    .line 263
    sget-object v3, Landroidx/compose/material3/NavigationRailDefaults;->INSTANCE:Landroidx/compose/material3/NavigationRailDefaults;

    .line 264
    .line 265
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/NavigationRailDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

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
    shr-int/lit8 v3, v4, 0x3

    .line 276
    .line 277
    and-int/lit8 v3, v3, 0xe

    .line 278
    .line 279
    invoke-static {v5, v6, v1, v3}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 280
    .line 281
    .line 282
    move-result-wide v10

    .line 283
    and-int/lit16 v3, v4, -0x381

    .line 284
    .line 285
    move v4, v3

    .line 286
    :cond_1b
    if-eqz v7, :cond_1c

    .line 287
    .line 288
    const/4 v3, 0x0

    .line 289
    move-object v12, v3

    .line 290
    :cond_1c
    and-int/lit8 v3, p10, 0x10

    .line 291
    .line 292
    if-eqz v3, :cond_17

    .line 293
    .line 294
    sget-object v3, Landroidx/compose/material3/NavigationRailDefaults;->INSTANCE:Landroidx/compose/material3/NavigationRailDefaults;

    .line 295
    .line 296
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/NavigationRailDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    and-int/2addr v4, v15

    .line 301
    move-object v14, v3

    .line 302
    move-object v7, v12

    .line 303
    goto :goto_e

    .line 304
    :goto_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 305
    .line 306
    .line 307
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    if-eqz v11, :cond_1d

    .line 312
    .line 313
    const/4 v11, -0x1

    .line 314
    const-string v12, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)"

    .line 315
    .line 316
    invoke-static {v0, v10, v11, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 317
    .line 318
    .line 319
    :cond_1d
    const/4 v11, 0x0

    .line 320
    const/16 v16, 0x0

    .line 321
    .line 322
    const/16 v17, 0x0

    .line 323
    .line 324
    const/16 v18, 0x0

    .line 325
    .line 326
    new-instance v0, Landroidx/compose/material3/NavigationRailKt$NavigationRail$1;

    .line 327
    .line 328
    invoke-direct {v0, v14, v7, v10, v8}, Landroidx/compose/material3/NavigationRailKt$NavigationRail$1;-><init>(Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/functions/Function3;)V

    .line 329
    .line 330
    .line 331
    const v12, -0x7cbbd05d

    .line 332
    .line 333
    .line 334
    const/4 v13, 0x1

    .line 335
    invoke-static {v1, v12, v13, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 336
    .line 337
    .line 338
    move-result-object v19

    .line 339
    and-int/lit8 v0, v10, 0xe

    .line 340
    .line 341
    const/high16 v12, 0xc00000

    .line 342
    .line 343
    or-int/2addr v0, v12

    .line 344
    shl-int/lit8 v10, v10, 0x3

    .line 345
    .line 346
    and-int/lit16 v12, v10, 0x380

    .line 347
    .line 348
    or-int/2addr v0, v12

    .line 349
    and-int/lit16 v10, v10, 0x1c00

    .line 350
    .line 351
    or-int v21, v0, v10

    .line 352
    .line 353
    const/16 v22, 0x72

    .line 354
    .line 355
    move-object v10, v2

    .line 356
    move-wide v12, v5

    .line 357
    move-object v0, v14

    .line 358
    move-wide v14, v3

    .line 359
    move-object/from16 v20, v1

    .line 360
    .line 361
    invoke-static/range {v10 .. v22}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 362
    .line 363
    .line 364
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    if-eqz v10, :cond_1e

    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 371
    .line 372
    .line 373
    :cond_1e
    move-object v13, v0

    .line 374
    move-wide v10, v3

    .line 375
    :goto_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    if-nez v12, :cond_1f

    .line 380
    .line 381
    goto :goto_13

    .line 382
    :cond_1f
    new-instance v14, Landroidx/compose/material3/NavigationRailKt$NavigationRail$2;

    .line 383
    .line 384
    move-object v0, v14

    .line 385
    move-object v1, v2

    .line 386
    move-wide v2, v5

    .line 387
    move-wide v4, v10

    .line 388
    move-object v6, v7

    .line 389
    move-object v7, v13

    .line 390
    move-object/from16 v8, p7

    .line 391
    .line 392
    move/from16 v9, p9

    .line 393
    .line 394
    move/from16 v10, p10

    .line 395
    .line 396
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/NavigationRailKt$NavigationRail$2;-><init>(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;II)V

    .line 397
    .line 398
    .line 399
    invoke-interface {v12, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 400
    .line 401
    .line 402
    :goto_13
    return-void
.end method

.method public static final NavigationRailItem(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
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
            "Landroidx/compose/material3/NavigationRailItemColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move/from16 v10, p10

    .line 8
    .line 9
    move/from16 v11, p11

    .line 10
    .line 11
    const-string v0, "onClick"

    .line 12
    .line 13
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "icon"

    .line 17
    .line 18
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const v0, -0x5b6e8a65

    .line 22
    .line 23
    .line 24
    move-object/from16 v4, p9

    .line 25
    .line 26
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    and-int/lit8 v5, v11, 0x1

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    or-int/lit8 v5, v10, 0x6

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    and-int/lit8 v5, v10, 0xe

    .line 38
    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    const/4 v5, 0x4

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v5, 0x2

    .line 50
    :goto_0
    or-int/2addr v5, v10

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v5, v10

    .line 53
    :goto_1
    and-int/lit8 v7, v11, 0x2

    .line 54
    .line 55
    if-eqz v7, :cond_3

    .line 56
    .line 57
    or-int/lit8 v5, v5, 0x30

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    and-int/lit8 v7, v10, 0x70

    .line 61
    .line 62
    if-nez v7, :cond_5

    .line 63
    .line 64
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_4

    .line 69
    .line 70
    const/16 v7, 0x20

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/16 v7, 0x10

    .line 74
    .line 75
    :goto_2
    or-int/2addr v5, v7

    .line 76
    :cond_5
    :goto_3
    and-int/lit8 v7, v11, 0x4

    .line 77
    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    or-int/lit16 v5, v5, 0x180

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_6
    and-int/lit16 v7, v10, 0x380

    .line 84
    .line 85
    if-nez v7, :cond_8

    .line 86
    .line 87
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_7

    .line 92
    .line 93
    const/16 v7, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    const/16 v7, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v5, v7

    .line 99
    :cond_8
    :goto_5
    and-int/lit8 v7, v11, 0x8

    .line 100
    .line 101
    if-eqz v7, :cond_9

    .line 102
    .line 103
    or-int/lit16 v5, v5, 0xc00

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_9
    and-int/lit16 v8, v10, 0x1c00

    .line 107
    .line 108
    if-nez v8, :cond_b

    .line 109
    .line 110
    move-object/from16 v8, p3

    .line 111
    .line 112
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-eqz v9, :cond_a

    .line 117
    .line 118
    const/16 v9, 0x800

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_a
    const/16 v9, 0x400

    .line 122
    .line 123
    :goto_6
    or-int/2addr v5, v9

    .line 124
    goto :goto_8

    .line 125
    :cond_b
    :goto_7
    move-object/from16 v8, p3

    .line 126
    .line 127
    :goto_8
    and-int/lit8 v9, v11, 0x10

    .line 128
    .line 129
    const v26, 0xe000

    .line 130
    .line 131
    .line 132
    if-eqz v9, :cond_c

    .line 133
    .line 134
    or-int/lit16 v5, v5, 0x6000

    .line 135
    .line 136
    goto :goto_a

    .line 137
    :cond_c
    and-int v12, v10, v26

    .line 138
    .line 139
    if-nez v12, :cond_e

    .line 140
    .line 141
    move/from16 v12, p4

    .line 142
    .line 143
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    if-eqz v13, :cond_d

    .line 148
    .line 149
    const/16 v13, 0x4000

    .line 150
    .line 151
    goto :goto_9

    .line 152
    :cond_d
    const/16 v13, 0x2000

    .line 153
    .line 154
    :goto_9
    or-int/2addr v5, v13

    .line 155
    goto :goto_b

    .line 156
    :cond_e
    :goto_a
    move/from16 v12, p4

    .line 157
    .line 158
    :goto_b
    and-int/lit8 v13, v11, 0x20

    .line 159
    .line 160
    if-eqz v13, :cond_f

    .line 161
    .line 162
    const/high16 v14, 0x30000

    .line 163
    .line 164
    or-int/2addr v5, v14

    .line 165
    goto :goto_d

    .line 166
    :cond_f
    const/high16 v14, 0x70000

    .line 167
    .line 168
    and-int/2addr v14, v10

    .line 169
    if-nez v14, :cond_11

    .line 170
    .line 171
    move-object/from16 v14, p5

    .line 172
    .line 173
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    if-eqz v15, :cond_10

    .line 178
    .line 179
    const/high16 v15, 0x20000

    .line 180
    .line 181
    goto :goto_c

    .line 182
    :cond_10
    const/high16 v15, 0x10000

    .line 183
    .line 184
    :goto_c
    or-int/2addr v5, v15

    .line 185
    goto :goto_e

    .line 186
    :cond_11
    :goto_d
    move-object/from16 v14, p5

    .line 187
    .line 188
    :goto_e
    and-int/lit8 v15, v11, 0x40

    .line 189
    .line 190
    if-eqz v15, :cond_12

    .line 191
    .line 192
    const/high16 v16, 0x180000

    .line 193
    .line 194
    or-int v5, v5, v16

    .line 195
    .line 196
    move/from16 v6, p6

    .line 197
    .line 198
    goto :goto_10

    .line 199
    :cond_12
    const/high16 v16, 0x380000

    .line 200
    .line 201
    and-int v16, v10, v16

    .line 202
    .line 203
    move/from16 v6, p6

    .line 204
    .line 205
    if-nez v16, :cond_14

    .line 206
    .line 207
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 208
    .line 209
    .line 210
    move-result v16

    .line 211
    if-eqz v16, :cond_13

    .line 212
    .line 213
    const/high16 v16, 0x100000

    .line 214
    .line 215
    goto :goto_f

    .line 216
    :cond_13
    const/high16 v16, 0x80000

    .line 217
    .line 218
    :goto_f
    or-int v5, v5, v16

    .line 219
    .line 220
    :cond_14
    :goto_10
    const/high16 v16, 0x1c00000

    .line 221
    .line 222
    and-int v16, v10, v16

    .line 223
    .line 224
    if-nez v16, :cond_17

    .line 225
    .line 226
    and-int/lit16 v0, v11, 0x80

    .line 227
    .line 228
    if-nez v0, :cond_15

    .line 229
    .line 230
    move-object/from16 v0, p7

    .line 231
    .line 232
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v16

    .line 236
    if-eqz v16, :cond_16

    .line 237
    .line 238
    const/high16 v16, 0x800000

    .line 239
    .line 240
    goto :goto_11

    .line 241
    :cond_15
    move-object/from16 v0, p7

    .line 242
    .line 243
    :cond_16
    const/high16 v16, 0x400000

    .line 244
    .line 245
    :goto_11
    or-int v5, v5, v16

    .line 246
    .line 247
    goto :goto_12

    .line 248
    :cond_17
    move-object/from16 v0, p7

    .line 249
    .line 250
    :goto_12
    and-int/lit16 v14, v11, 0x100

    .line 251
    .line 252
    if-eqz v14, :cond_18

    .line 253
    .line 254
    const/high16 v16, 0x6000000

    .line 255
    .line 256
    or-int v5, v5, v16

    .line 257
    .line 258
    goto :goto_14

    .line 259
    :cond_18
    const/high16 v16, 0xe000000

    .line 260
    .line 261
    and-int v16, v10, v16

    .line 262
    .line 263
    if-nez v16, :cond_1a

    .line 264
    .line 265
    move/from16 v16, v14

    .line 266
    .line 267
    move-object/from16 v14, p8

    .line 268
    .line 269
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v17

    .line 273
    if-eqz v17, :cond_19

    .line 274
    .line 275
    const/high16 v17, 0x4000000

    .line 276
    .line 277
    goto :goto_13

    .line 278
    :cond_19
    const/high16 v17, 0x2000000

    .line 279
    .line 280
    :goto_13
    or-int v5, v5, v17

    .line 281
    .line 282
    goto :goto_15

    .line 283
    :cond_1a
    :goto_14
    move/from16 v16, v14

    .line 284
    .line 285
    move-object/from16 v14, p8

    .line 286
    .line 287
    :goto_15
    const v17, 0xb6db6db

    .line 288
    .line 289
    .line 290
    and-int v0, v5, v17

    .line 291
    .line 292
    const v2, 0x2492492

    .line 293
    .line 294
    .line 295
    if-ne v0, v2, :cond_1c

    .line 296
    .line 297
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-nez v0, :cond_1b

    .line 302
    .line 303
    goto :goto_16

    .line 304
    :cond_1b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 305
    .line 306
    .line 307
    move v7, v6

    .line 308
    move-object/from16 v21, v8

    .line 309
    .line 310
    move v5, v12

    .line 311
    move-object v9, v14

    .line 312
    move-object/from16 v6, p5

    .line 313
    .line 314
    move-object/from16 v8, p7

    .line 315
    .line 316
    goto/16 :goto_20

    .line 317
    .line 318
    :cond_1c
    :goto_16
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 319
    .line 320
    .line 321
    and-int/lit8 v0, v10, 0x1

    .line 322
    .line 323
    const v2, -0x1c00001

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x1

    .line 327
    if-eqz v0, :cond_1f

    .line 328
    .line 329
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_1d

    .line 334
    .line 335
    goto :goto_17

    .line 336
    :cond_1d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 337
    .line 338
    .line 339
    and-int/lit16 v0, v11, 0x80

    .line 340
    .line 341
    if-eqz v0, :cond_1e

    .line 342
    .line 343
    and-int/2addr v5, v2

    .line 344
    :cond_1e
    move-object/from16 v7, p5

    .line 345
    .line 346
    move-object/from16 v9, p7

    .line 347
    .line 348
    move-object/from16 v2, p8

    .line 349
    .line 350
    move v0, v12

    .line 351
    goto/16 :goto_1b

    .line 352
    .line 353
    :cond_1f
    :goto_17
    if-eqz v7, :cond_20

    .line 354
    .line 355
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 356
    .line 357
    move-object v8, v0

    .line 358
    :cond_20
    if-eqz v9, :cond_21

    .line 359
    .line 360
    move v0, v14

    .line 361
    goto :goto_18

    .line 362
    :cond_21
    move v0, v12

    .line 363
    :goto_18
    if-eqz v13, :cond_22

    .line 364
    .line 365
    const/4 v7, 0x0

    .line 366
    goto :goto_19

    .line 367
    :cond_22
    move-object/from16 v7, p5

    .line 368
    .line 369
    :goto_19
    if-eqz v15, :cond_23

    .line 370
    .line 371
    move v6, v14

    .line 372
    :cond_23
    and-int/lit16 v9, v11, 0x80

    .line 373
    .line 374
    if-eqz v9, :cond_24

    .line 375
    .line 376
    sget-object v12, Landroidx/compose/material3/NavigationRailItemDefaults;->INSTANCE:Landroidx/compose/material3/NavigationRailItemDefaults;

    .line 377
    .line 378
    const-wide/16 v17, 0x0

    .line 379
    .line 380
    const-wide/16 v19, 0x0

    .line 381
    .line 382
    const-wide/16 v21, 0x0

    .line 383
    .line 384
    const-wide/16 v23, 0x0

    .line 385
    .line 386
    const-wide/16 v27, 0x0

    .line 387
    .line 388
    const/high16 v9, 0x30000

    .line 389
    .line 390
    const/16 v25, 0x1f

    .line 391
    .line 392
    move/from16 v29, v16

    .line 393
    .line 394
    const/4 v15, 0x0

    .line 395
    move-wide/from16 v13, v17

    .line 396
    .line 397
    move-wide/from16 v15, v19

    .line 398
    .line 399
    move-wide/from16 v17, v21

    .line 400
    .line 401
    move-wide/from16 v19, v23

    .line 402
    .line 403
    move-wide/from16 v21, v27

    .line 404
    .line 405
    move-object/from16 v23, v4

    .line 406
    .line 407
    move/from16 v24, v9

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v25}, Landroidx/compose/material3/NavigationRailItemDefaults;->colors-zjMxDiM(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    and-int/2addr v5, v2

    .line 414
    goto :goto_1a

    .line 415
    :cond_24
    move/from16 v29, v16

    .line 416
    .line 417
    move-object/from16 v9, p7

    .line 418
    .line 419
    :goto_1a
    if-eqz v29, :cond_26

    .line 420
    .line 421
    const v2, -0x1d58f75c

    .line 422
    .line 423
    .line 424
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 425
    .line 426
    .line 427
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v12

    .line 437
    if-ne v2, v12, :cond_25

    .line 438
    .line 439
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    :cond_25
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 447
    .line 448
    .line 449
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 450
    .line 451
    goto :goto_1b

    .line 452
    :cond_26
    move-object/from16 v2, p8

    .line 453
    .line 454
    :goto_1b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 455
    .line 456
    .line 457
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 458
    .line 459
    .line 460
    move-result v12

    .line 461
    if-eqz v12, :cond_27

    .line 462
    .line 463
    const/4 v12, -0x1

    .line 464
    const-string v13, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)"

    .line 465
    .line 466
    const v14, -0x5b6e8a65

    .line 467
    .line 468
    .line 469
    invoke-static {v14, v5, v12, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :cond_27
    new-instance v12, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1;

    .line 473
    .line 474
    move-object/from16 p3, v12

    .line 475
    .line 476
    move-object/from16 p4, v9

    .line 477
    .line 478
    move/from16 p5, p0

    .line 479
    .line 480
    move/from16 p6, v5

    .line 481
    .line 482
    move-object/from16 p7, v7

    .line 483
    .line 484
    move/from16 p8, v6

    .line 485
    .line 486
    move-object/from16 p9, p2

    .line 487
    .line 488
    invoke-direct/range {p3 .. p9}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1;-><init>(Landroidx/compose/material3/NavigationRailItemColors;ZILkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;)V

    .line 489
    .line 490
    .line 491
    const v13, -0x3cff324b

    .line 492
    .line 493
    .line 494
    const/4 v14, 0x1

    .line 495
    invoke-static {v4, v13, v14, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 496
    .line 497
    .line 498
    move-result-object v15

    .line 499
    if-eqz v7, :cond_28

    .line 500
    .line 501
    new-instance v12, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1;

    .line 502
    .line 503
    invoke-direct {v12, v9, v1, v5, v7}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1;-><init>(Landroidx/compose/material3/NavigationRailItemColors;ZILkotlin/jvm/functions/Function2;)V

    .line 504
    .line 505
    .line 506
    const v13, -0x646495f

    .line 507
    .line 508
    .line 509
    invoke-static {v4, v13, v14, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 510
    .line 511
    .line 512
    move-result-object v12

    .line 513
    move-object/from16 v16, v12

    .line 514
    .line 515
    goto :goto_1c

    .line 516
    :cond_28
    const/16 v16, 0x0

    .line 517
    .line 518
    :goto_1c
    sget-object v12, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/semantics/Role$Companion;->getTab-o7Vup1c()I

    .line 521
    .line 522
    .line 523
    move-result v12

    .line 524
    const/4 v13, 0x0

    .line 525
    invoke-static {v12}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    .line 526
    .line 527
    .line 528
    move-result-object v12

    .line 529
    move-object/from16 p3, v8

    .line 530
    .line 531
    move/from16 p4, p0

    .line 532
    .line 533
    move-object/from16 p5, v2

    .line 534
    .line 535
    move-object/from16 p6, v13

    .line 536
    .line 537
    move/from16 p7, v0

    .line 538
    .line 539
    move-object/from16 p8, v12

    .line 540
    .line 541
    move-object/from16 p9, p1

    .line 542
    .line 543
    invoke-static/range {p3 .. p9}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-O2vRcR0(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    .line 544
    .line 545
    .line 546
    move-result-object v12

    .line 547
    sget v13, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemHeight:F

    .line 548
    .line 549
    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 550
    .line 551
    .line 552
    move-result-object v12

    .line 553
    sget v13, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemWidth:F

    .line 554
    .line 555
    const/4 v14, 0x0

    .line 556
    move/from16 v20, v0

    .line 557
    .line 558
    const/4 v0, 0x2

    .line 559
    const/4 v3, 0x0

    .line 560
    invoke-static {v12, v13, v14, v0, v3}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 561
    .line 562
    .line 563
    move-result-object v12

    .line 564
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 565
    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    const v14, 0x2bb5b5d7

    .line 571
    .line 572
    .line 573
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 574
    .line 575
    .line 576
    const/4 v14, 0x0

    .line 577
    const/4 v3, 0x6

    .line 578
    invoke-static {v0, v14, v4, v3}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    const v3, -0x4ee9b9da

    .line 583
    .line 584
    .line 585
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 586
    .line 587
    .line 588
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    check-cast v3, Landroidx/compose/ui/unit/Density;

    .line 597
    .line 598
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 599
    .line 600
    .line 601
    move-result-object v14

    .line 602
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v14

    .line 606
    check-cast v14, Landroidx/compose/ui/unit/LayoutDirection;

    .line 607
    .line 608
    move-object/from16 v21, v8

    .line 609
    .line 610
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 611
    .line 612
    .line 613
    move-result-object v8

    .line 614
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v8

    .line 618
    check-cast v8, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 619
    .line 620
    sget-object v19, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 621
    .line 622
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 623
    .line 624
    .line 625
    move-result-object v10

    .line 626
    invoke-static {v12}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 627
    .line 628
    .line 629
    move-result-object v12

    .line 630
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 631
    .line 632
    .line 633
    move-result-object v11

    .line 634
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 635
    .line 636
    if-nez v11, :cond_29

    .line 637
    .line 638
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 639
    .line 640
    .line 641
    :cond_29
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 642
    .line 643
    .line 644
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 645
    .line 646
    .line 647
    move-result v11

    .line 648
    if-eqz v11, :cond_2a

    .line 649
    .line 650
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 651
    .line 652
    .line 653
    goto :goto_1d

    .line 654
    :cond_2a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 655
    .line 656
    .line 657
    :goto_1d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 658
    .line 659
    .line 660
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 661
    .line 662
    .line 663
    move-result-object v10

    .line 664
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 665
    .line 666
    .line 667
    move-result-object v11

    .line 668
    invoke-static {v10, v0, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-static {v10, v3, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-static {v10, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-static {v10, v8, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 690
    .line 691
    .line 692
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 693
    .line 694
    .line 695
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    const/4 v3, 0x0

    .line 704
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 705
    .line 706
    .line 707
    move-result-object v8

    .line 708
    invoke-interface {v12, v0, v4, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    const v0, 0x7ab4aae9

    .line 712
    .line 713
    .line 714
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 715
    .line 716
    .line 717
    const v0, -0x7f65a980

    .line 718
    .line 719
    .line 720
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 721
    .line 722
    .line 723
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 724
    .line 725
    const v0, 0x2cd80755

    .line 726
    .line 727
    .line 728
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 729
    .line 730
    .line 731
    if-eqz v1, :cond_2b

    .line 732
    .line 733
    const/high16 v0, 0x3f800000    # 1.0f

    .line 734
    .line 735
    goto :goto_1e

    .line 736
    :cond_2b
    const/4 v0, 0x0

    .line 737
    :goto_1e
    const/16 v3, 0x96

    .line 738
    .line 739
    const/4 v8, 0x0

    .line 740
    const/4 v10, 0x0

    .line 741
    const/4 v11, 0x6

    .line 742
    invoke-static {v3, v8, v10, v11, v10}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    const/4 v8, 0x0

    .line 747
    const/4 v10, 0x0

    .line 748
    const/16 v11, 0x30

    .line 749
    .line 750
    const/16 v12, 0xc

    .line 751
    .line 752
    move/from16 p3, v0

    .line 753
    .line 754
    move-object/from16 p4, v3

    .line 755
    .line 756
    move/from16 p5, v8

    .line 757
    .line 758
    move-object/from16 p6, v10

    .line 759
    .line 760
    move-object/from16 p7, v4

    .line 761
    .line 762
    move/from16 p8, v11

    .line 763
    .line 764
    move/from16 p9, v12

    .line 765
    .line 766
    invoke-static/range {p3 .. p9}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    check-cast v3, Landroidx/compose/ui/unit/Density;

    .line 779
    .line 780
    invoke-interface {v3, v13}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 781
    .line 782
    .line 783
    move-result v8

    .line 784
    sget-object v10, Landroidx/compose/material3/tokens/NavigationRailTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationRailTokens;

    .line 785
    .line 786
    invoke-virtual {v10}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 787
    .line 788
    .line 789
    move-result v11

    .line 790
    invoke-interface {v3, v11}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 791
    .line 792
    .line 793
    move-result v3

    .line 794
    sub-int/2addr v8, v3

    .line 795
    int-to-float v3, v8

    .line 796
    const/4 v8, 0x2

    .line 797
    int-to-float v8, v8

    .line 798
    div-float/2addr v3, v8

    .line 799
    const/4 v8, 0x0

    .line 800
    invoke-static {v3, v8}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 801
    .line 802
    .line 803
    move-result-wide v11

    .line 804
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 805
    .line 806
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    const v8, 0x1e7b2b64

    .line 811
    .line 812
    .line 813
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 814
    .line 815
    .line 816
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v8

    .line 820
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v3

    .line 824
    or-int/2addr v3, v8

    .line 825
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v8

    .line 829
    if-nez v3, :cond_2c

    .line 830
    .line 831
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 832
    .line 833
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v3

    .line 837
    if-ne v8, v3, :cond_2d

    .line 838
    .line 839
    :cond_2c
    new-instance v8, Landroidx/compose/material3/MappedInteractionSource;

    .line 840
    .line 841
    const/4 v3, 0x0

    .line 842
    invoke-direct {v8, v2, v11, v12, v3}, Landroidx/compose/material3/MappedInteractionSource;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 843
    .line 844
    .line 845
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    :cond_2d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 849
    .line 850
    .line 851
    check-cast v8, Landroidx/compose/material3/MappedInteractionSource;

    .line 852
    .line 853
    if-eqz v7, :cond_2e

    .line 854
    .line 855
    const v3, 0x41d59749

    .line 856
    .line 857
    .line 858
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v10}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getActiveIndicatorShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    const/4 v11, 0x6

    .line 866
    invoke-static {v3, v4, v11}, Landroidx/compose/material3/ShapesKt;->toShape(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 871
    .line 872
    .line 873
    goto :goto_1f

    .line 874
    :cond_2e
    const/4 v11, 0x6

    .line 875
    const v3, 0x41d5979a

    .line 876
    .line 877
    .line 878
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v10}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getNoLabelActiveIndicatorShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    invoke-static {v3, v4, v11}, Landroidx/compose/material3/ShapesKt;->toShape(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 886
    .line 887
    .line 888
    move-result-object v3

    .line 889
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 890
    .line 891
    .line 892
    :goto_1f
    new-instance v10, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$2$indicatorRipple$1;

    .line 893
    .line 894
    invoke-direct {v10, v3, v8}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$2$indicatorRipple$1;-><init>(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/MappedInteractionSource;)V

    .line 895
    .line 896
    .line 897
    const v8, 0xc9401ce

    .line 898
    .line 899
    .line 900
    const/4 v11, 0x1

    .line 901
    invoke-static {v4, v8, v11, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 902
    .line 903
    .line 904
    move-result-object v12

    .line 905
    new-instance v8, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$2$indicator$1;

    .line 906
    .line 907
    invoke-direct {v8, v9, v5, v3, v0}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$2$indicator$1;-><init>(Landroidx/compose/material3/NavigationRailItemColors;ILandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/State;)V

    .line 908
    .line 909
    .line 910
    const v3, -0x6efc0a62

    .line 911
    .line 912
    .line 913
    invoke-static {v4, v3, v11, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 914
    .line 915
    .line 916
    move-result-object v13

    .line 917
    invoke-static {v0}, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItem$lambda-5$lambda-2(Landroidx/compose/runtime/State;)F

    .line 918
    .line 919
    .line 920
    move-result v17

    .line 921
    const/4 v0, 0x6

    .line 922
    shr-int/lit8 v0, v5, 0x6

    .line 923
    .line 924
    and-int v0, v0, v26

    .line 925
    .line 926
    or-int/lit16 v0, v0, 0x1b6

    .line 927
    .line 928
    move-object v14, v15

    .line 929
    move-object/from16 v15, v16

    .line 930
    .line 931
    move/from16 v16, v6

    .line 932
    .line 933
    move-object/from16 v18, v4

    .line 934
    .line 935
    move/from16 v19, v0

    .line 936
    .line 937
    invoke-static/range {v12 .. v19}, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V

    .line 938
    .line 939
    .line 940
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 941
    .line 942
    .line 943
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 944
    .line 945
    .line 946
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 947
    .line 948
    .line 949
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 950
    .line 951
    .line 952
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 953
    .line 954
    .line 955
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 956
    .line 957
    .line 958
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 959
    .line 960
    .line 961
    move-result v0

    .line 962
    if-eqz v0, :cond_2f

    .line 963
    .line 964
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 965
    .line 966
    .line 967
    :cond_2f
    move-object v8, v9

    .line 968
    move/from16 v5, v20

    .line 969
    .line 970
    move-object v9, v2

    .line 971
    move-object/from16 v30, v7

    .line 972
    .line 973
    move v7, v6

    .line 974
    move-object/from16 v6, v30

    .line 975
    .line 976
    :goto_20
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 977
    .line 978
    .line 979
    move-result-object v12

    .line 980
    if-nez v12, :cond_30

    .line 981
    .line 982
    goto :goto_21

    .line 983
    :cond_30
    new-instance v13, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$3;

    .line 984
    .line 985
    move-object v0, v13

    .line 986
    move/from16 v1, p0

    .line 987
    .line 988
    move-object/from16 v2, p1

    .line 989
    .line 990
    move-object/from16 v3, p2

    .line 991
    .line 992
    move-object/from16 v4, v21

    .line 993
    .line 994
    move/from16 v10, p10

    .line 995
    .line 996
    move/from16 v11, p11

    .line 997
    .line 998
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$3;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 999
    .line 1000
    .line 1001
    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1002
    .line 1003
    .line 1004
    :goto_21
    return-void
.end method

.method private static final NavigationRailItem$lambda-5$lambda-2(Landroidx/compose/runtime/State;)F
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

.method private static final NavigationRailItemBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V
    .locals 16
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
    const v0, -0x343d3695    # -2.5531094E7f

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
    and-int/lit8 v10, v7, 0x70

    .line 41
    .line 42
    if-nez v10, :cond_3

    .line 43
    .line 44
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit16 v10, v7, 0x380

    .line 57
    .line 58
    if-nez v10, :cond_5

    .line 59
    .line 60
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit16 v10, v7, 0x1c00

    .line 73
    .line 74
    if-nez v10, :cond_7

    .line 75
    .line 76
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-eqz v10, :cond_6

    .line 81
    .line 82
    const/16 v10, 0x800

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    const/16 v10, 0x400

    .line 86
    .line 87
    :goto_4
    or-int/2addr v9, v10

    .line 88
    :cond_7
    const v10, 0xe000

    .line 89
    .line 90
    .line 91
    and-int/2addr v10, v7

    .line 92
    if-nez v10, :cond_9

    .line 93
    .line 94
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_8

    .line 99
    .line 100
    const/16 v10, 0x4000

    .line 101
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
    const/high16 v10, 0x70000

    .line 107
    .line 108
    and-int/2addr v10, v7

    .line 109
    if-nez v10, :cond_b

    .line 110
    .line 111
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-eqz v10, :cond_a

    .line 116
    .line 117
    const/high16 v10, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v10, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v9, v10

    .line 123
    :cond_b
    const v10, 0x5b6db

    .line 124
    .line 125
    .line 126
    and-int/2addr v10, v9

    .line 127
    const v11, 0x12492

    .line 128
    .line 129
    .line 130
    if-ne v10, v11, :cond_d

    .line 131
    .line 132
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-nez v10, :cond_c

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
    move-result v10

    .line 148
    if-eqz v10, :cond_e

    .line 149
    .line 150
    const/4 v10, -0x1

    .line 151
    const-string v11, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:381)"

    .line 152
    .line 153
    invoke-static {v0, v9, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_e
    new-instance v0, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemBaselineLayout$2;

    .line 157
    .line 158
    invoke-direct {v0, v6, v4, v5}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemBaselineLayout$2;-><init>(FLkotlin/jvm/functions/Function2;Z)V

    .line 159
    .line 160
    .line 161
    const v10, -0x4ee9b9da

    .line 162
    .line 163
    .line 164
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 165
    .line 166
    .line 167
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 168
    .line 169
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    check-cast v12, Landroidx/compose/ui/unit/Density;

    .line 178
    .line 179
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    check-cast v13, Landroidx/compose/ui/unit/LayoutDirection;

    .line 188
    .line 189
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    check-cast v14, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 198
    .line 199
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 200
    .line 201
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-static {v11}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    instance-of v5, v5, Landroidx/compose/runtime/Applier;

    .line 214
    .line 215
    if-nez v5, :cond_f

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
    move-result v5

    .line 227
    if-eqz v5, :cond_10

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
    move-result-object v5

    .line 243
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    invoke-static {v5, v0, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v5, v12, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v5, v13, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v5, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

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
    const/4 v5, 0x0

    .line 283
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    invoke-interface {v7, v0, v8, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    const v7, 0x7c30d3e2

    .line 297
    .line 298
    .line 299
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 300
    .line 301
    .line 302
    and-int/lit8 v7, v9, 0xe

    .line 303
    .line 304
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    invoke-interface {v1, v8, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    const v7, 0x37c67c98

    .line 312
    .line 313
    .line 314
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 315
    .line 316
    .line 317
    const/4 v7, 0x0

    .line 318
    cmpl-float v7, v6, v7

    .line 319
    .line 320
    if-lez v7, :cond_11

    .line 321
    .line 322
    shr-int/lit8 v7, v9, 0x3

    .line 323
    .line 324
    and-int/lit8 v7, v7, 0xe

    .line 325
    .line 326
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    invoke-interface {v2, v8, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    :cond_11
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 334
    .line 335
    .line 336
    const-string v7, "icon"

    .line 337
    .line 338
    invoke-static {v11, v7}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    const v10, 0x2bb5b5d7

    .line 343
    .line 344
    .line 345
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 346
    .line 347
    .line 348
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 349
    .line 350
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 351
    .line 352
    .line 353
    move-result-object v13

    .line 354
    invoke-static {v13, v5, v8, v5}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 355
    .line 356
    .line 357
    move-result-object v13

    .line 358
    const v14, -0x4ee9b9da

    .line 359
    .line 360
    .line 361
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 362
    .line 363
    .line 364
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 365
    .line 366
    .line 367
    move-result-object v14

    .line 368
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    check-cast v14, Landroidx/compose/ui/unit/Density;

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
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 399
    .line 400
    .line 401
    move-result-object v7

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
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

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
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    invoke-static {v1, v13, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    invoke-static {v1, v14, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    invoke-static {v1, v10, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    invoke-static {v1, v0, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

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
    move-result-object v5

    .line 480
    invoke-interface {v7, v0, v8, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    const v1, -0x5e4f6a18

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
    invoke-static {v11, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    if-eqz p4, :cond_14

    .line 541
    .line 542
    const/high16 v5, 0x3f800000    # 1.0f

    .line 543
    .line 544
    goto :goto_a

    .line 545
    :cond_14
    move v5, v6

    .line 546
    :goto_a
    invoke-static {v1, v5}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    const v5, 0x2bb5b5d7

    .line 551
    .line 552
    .line 553
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 557
    .line 558
    .line 559
    move-result-object v5

    .line 560
    const/4 v7, 0x0

    .line 561
    invoke-static {v5, v7, v8, v7}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 562
    .line 563
    .line 564
    move-result-object v5

    .line 565
    const v7, -0x4ee9b9da

    .line 566
    .line 567
    .line 568
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 569
    .line 570
    .line 571
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v7

    .line 579
    check-cast v7, Landroidx/compose/ui/unit/Density;

    .line 580
    .line 581
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 582
    .line 583
    .line 584
    move-result-object v10

    .line 585
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v10

    .line 589
    check-cast v10, Landroidx/compose/ui/unit/LayoutDirection;

    .line 590
    .line 591
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 592
    .line 593
    .line 594
    move-result-object v11

    .line 595
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v11

    .line 599
    check-cast v11, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 600
    .line 601
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 602
    .line 603
    .line 604
    move-result-object v12

    .line 605
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 610
    .line 611
    .line 612
    move-result-object v13

    .line 613
    instance-of v13, v13, Landroidx/compose/runtime/Applier;

    .line 614
    .line 615
    if-nez v13, :cond_15

    .line 616
    .line 617
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 618
    .line 619
    .line 620
    :cond_15
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 621
    .line 622
    .line 623
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 624
    .line 625
    .line 626
    move-result v13

    .line 627
    if-eqz v13, :cond_16

    .line 628
    .line 629
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 630
    .line 631
    .line 632
    goto :goto_b

    .line 633
    :cond_16
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 634
    .line 635
    .line 636
    :goto_b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 637
    .line 638
    .line 639
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 640
    .line 641
    .line 642
    move-result-object v12

    .line 643
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 644
    .line 645
    .line 646
    move-result-object v13

    .line 647
    invoke-static {v12, v5, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 651
    .line 652
    .line 653
    move-result-object v5

    .line 654
    invoke-static {v12, v7, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    invoke-static {v12, v10, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    invoke-static {v12, v11, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 669
    .line 670
    .line 671
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 672
    .line 673
    .line 674
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 675
    .line 676
    .line 677
    move-result-object v5

    .line 678
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    const/4 v7, 0x0

    .line 683
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 684
    .line 685
    .line 686
    move-result-object v7

    .line 687
    invoke-interface {v1, v5, v8, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    const v1, 0x7ab4aae9

    .line 691
    .line 692
    .line 693
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 694
    .line 695
    .line 696
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 697
    .line 698
    .line 699
    const v0, 0x5d18ba

    .line 700
    .line 701
    .line 702
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 703
    .line 704
    .line 705
    shr-int/lit8 v0, v9, 0x9

    .line 706
    .line 707
    and-int/lit8 v0, v0, 0xe

    .line 708
    .line 709
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-interface {v4, v8, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 717
    .line 718
    .line 719
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 720
    .line 721
    .line 722
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 723
    .line 724
    .line 725
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 726
    .line 727
    .line 728
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 729
    .line 730
    .line 731
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 732
    .line 733
    .line 734
    :cond_17
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
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    if-eqz v0, :cond_18

    .line 751
    .line 752
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 753
    .line 754
    .line 755
    :cond_18
    :goto_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 756
    .line 757
    .line 758
    move-result-object v8

    .line 759
    if-nez v8, :cond_19

    .line 760
    .line 761
    goto :goto_d

    .line 762
    :cond_19
    new-instance v9, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemBaselineLayout$3;

    .line 763
    .line 764
    move-object v0, v9

    .line 765
    move-object/from16 v1, p0

    .line 766
    .line 767
    move-object/from16 v2, p1

    .line 768
    .line 769
    move-object/from16 v3, p2

    .line 770
    .line 771
    move-object/from16 v4, p3

    .line 772
    .line 773
    move/from16 v5, p4

    .line 774
    .line 775
    move/from16 v6, p5

    .line 776
    .line 777
    move/from16 v7, p7

    .line 778
    .line 779
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemBaselineLayout$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFI)V

    .line 780
    .line 781
    .line 782
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 783
    .line 784
    .line 785
    :goto_d
    return-void
.end method

.method public static final synthetic access$NavigationRailItem$lambda-5$lambda-2(Landroidx/compose/runtime/State;)F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItem$lambda-5$lambda-2(Landroidx/compose/runtime/State;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$NavigationRailItemBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getIndicatorHorizontalPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getIndicatorVerticalPaddingNoLabel$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingNoLabel:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getIndicatorVerticalPaddingWithLabel$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingWithLabel:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getNavigationRailHeaderPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailHeaderPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/NavigationRailKt;->placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;

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
    invoke-static/range {p0 .. p8}, Landroidx/compose/material3/NavigationRailKt;->placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final getNavigationRailItemHeight()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationRailItemVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationRailItemWidth()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationRailVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method private static final placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 15

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    move-wide/from16 v1, p4

    .line 26
    .line 27
    invoke-static {v1, v2, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sub-int v1, v0, v1

    .line 40
    .line 41
    div-int/lit8 v5, v1, 0x2

    .line 42
    .line 43
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sub-int v1, v12, v1

    .line 48
    .line 49
    div-int/lit8 v6, v1, 0x2

    .line 50
    .line 51
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sub-int v1, v0, v1

    .line 56
    .line 57
    div-int/lit8 v8, v1, 0x2

    .line 58
    .line 59
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    sub-int v1, v12, v1

    .line 64
    .line 65
    div-int/lit8 v9, v1, 0x2

    .line 66
    .line 67
    const/4 v13, 0x0

    .line 68
    new-instance v14, Landroidx/compose/material3/NavigationRailKt$placeIcon$1;

    .line 69
    .line 70
    move-object v2, v14

    .line 71
    move-object/from16 v3, p3

    .line 72
    .line 73
    move-object/from16 v4, p1

    .line 74
    .line 75
    move-object/from16 v7, p2

    .line 76
    .line 77
    move v10, v0

    .line 78
    move v11, v12

    .line 79
    invoke-direct/range {v2 .. v11}, Landroidx/compose/material3/NavigationRailKt$placeIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IIII)V

    .line 80
    .line 81
    .line 82
    const/4 v6, 0x4

    .line 83
    const/4 v7, 0x0

    .line 84
    move-object v1, p0

    .line 85
    move v2, v0

    .line 86
    move v3, v12

    .line 87
    move-object v4, v13

    .line 88
    move-object v5, v14

    .line 89
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope$-CC;->p(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
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
    sget v1, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemVerticalPadding:F

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
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz p4, :cond_1

    .line 57
    .line 58
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const/4 v2, 0x0

    .line 64
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    move-wide/from16 v1, p5

    .line 73
    .line 74
    invoke-static {v1, v2, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 75
    .line 76
    .line 77
    move-result v17

    .line 78
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    sub-int v0, v17, v0

    .line 83
    .line 84
    div-int/lit8 v5, v0, 0x2

    .line 85
    .line 86
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    sub-int v0, v17, v0

    .line 91
    .line 92
    div-int/lit8 v9, v0, 0x2

    .line 93
    .line 94
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    sub-int v0, v17, v0

    .line 99
    .line 100
    div-int/lit8 v12, v0, 0x2

    .line 101
    .line 102
    sget v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingWithLabel:F

    .line 103
    .line 104
    invoke-interface {v15, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    sub-int v13, v10, v0

    .line 109
    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    new-instance v19, Landroidx/compose/material3/NavigationRailKt$placeLabelAndIcon$1;

    .line 113
    .line 114
    move-object/from16 v0, v19

    .line 115
    .line 116
    move-object/from16 v1, p4

    .line 117
    .line 118
    move/from16 v2, p7

    .line 119
    .line 120
    move/from16 v3, p8

    .line 121
    .line 122
    move-object/from16 v4, p1

    .line 123
    .line 124
    move-object/from16 v8, p2

    .line 125
    .line 126
    move-object/from16 v11, p3

    .line 127
    .line 128
    move/from16 v14, v17

    .line 129
    .line 130
    move-object/from16 v15, p0

    .line 131
    .line 132
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/NavigationRailKt$placeLabelAndIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/ui/layout/Placeable;IIILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IIILandroidx/compose/ui/layout/MeasureScope;)V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x4

    .line 136
    const/4 v1, 0x0

    .line 137
    move/from16 p1, v17

    .line 138
    .line 139
    move/from16 p2, v16

    .line 140
    .line 141
    move-object/from16 p3, v18

    .line 142
    .line 143
    move-object/from16 p4, v19

    .line 144
    .line 145
    move/from16 p5, v0

    .line 146
    .line 147
    move-object/from16 p6, v1

    .line 148
    .line 149
    invoke-static/range {p0 .. p6}, Landroidx/compose/ui/layout/MeasureScope$-CC;->p(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0
.end method
