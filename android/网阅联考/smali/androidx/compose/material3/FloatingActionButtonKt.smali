.class public final Landroidx/compose/material3/FloatingActionButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\n\u001a}\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a\u00a2\u0006\u0002\u0008\u001c\u00a2\u0006\u0002\u0008\u001dH\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a\u008f\u0001\u0010\n\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u001c2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\"\u001a\u00020#2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008$\u0010%\u001ar\u0010&\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u001cH\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(\u001ar\u0010)\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u001cH\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008*\u0010(\u001ar\u0010+\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u001cH\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010(\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0008\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006-"
    }
    d2 = {
        "ExtendedFabCollapseAnimation",
        "Landroidx/compose/animation/ExitTransition;",
        "ExtendedFabEndIconPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "ExtendedFabExpandAnimation",
        "Landroidx/compose/animation/EnterTransition;",
        "ExtendedFabMinimumWidth",
        "ExtendedFabStartIconPadding",
        "ExtendedFabTextPadding",
        "ExtendedFloatingActionButton",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "elevation",
        "Landroidx/compose/material3/FloatingActionButtonElevation;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "ExtendedFloatingActionButton-X-z6DiA",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "text",
        "icon",
        "expanded",
        "",
        "ExtendedFloatingActionButton-ElI5-7k",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "FloatingActionButton",
        "FloatingActionButton-X-z6DiA",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "LargeFloatingActionButton",
        "LargeFloatingActionButton-X-z6DiA",
        "SmallFloatingActionButton",
        "SmallFloatingActionButton-X-z6DiA",
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
.field private static final ExtendedFabCollapseAnimation:Landroidx/compose/animation/ExitTransition;

.field private static final ExtendedFabEndIconPadding:F

.field private static final ExtendedFabExpandAnimation:Landroidx/compose/animation/EnterTransition;

.field private static final ExtendedFabMinimumWidth:F

.field private static final ExtendedFabStartIconPadding:F

.field private static final ExtendedFabTextPadding:F


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabStartIconPadding:F

    .line 9
    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabEndIconPadding:F

    .line 18
    .line 19
    const/16 v0, 0x14

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sput v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabTextPadding:F

    .line 27
    .line 28
    const/16 v0, 0x50

    .line 29
    .line 30
    int-to-float v0, v0

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sput v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabMinimumWidth:F

    .line 36
    .line 37
    sget-object v0, Landroidx/compose/material3/tokens/MotionTokens;->INSTANCE:Landroidx/compose/material3/tokens/MotionTokens;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingLinearCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/16 v2, 0x64

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static {v2, v3, v1, v4, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/4 v6, 0x0

    .line 53
    invoke-static {v1, v6, v4, v5}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingEmphasizedCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const/16 v8, 0x1f4

    .line 62
    .line 63
    invoke-static {v8, v3, v7, v4, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 68
    .line 69
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v12, 0x0

    .line 75
    const/16 v13, 0xc

    .line 76
    .line 77
    const/4 v14, 0x0

    .line 78
    invoke-static/range {v9 .. v14}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkHorizontally$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v1, v9}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sput-object v1, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabCollapseAnimation:Landroidx/compose/animation/ExitTransition;

    .line 87
    .line 88
    const/16 v1, 0xc8

    .line 89
    .line 90
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingLinearCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    invoke-static {v1, v2, v9}, Landroidx/compose/animation/core/AnimationSpecKt;->tween(IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1, v6, v4, v5}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingEmphasizedCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v8, v3, v0, v4, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    invoke-static/range {v9 .. v14}, Landroidx/compose/animation/EnterExitTransitionKt;->expandHorizontally$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v1, v0}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sput-object v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabExpandAnimation:Landroidx/compose/animation/EnterTransition;

    .line 123
    .line 124
    return-void
.end method

.method public static final ExtendedFloatingActionButton-ElI5-7k(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move/from16 v15, p13

    .line 8
    .line 9
    move/from16 v14, p14

    .line 10
    .line 11
    const-string/jumbo v3, "text"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "icon"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v3, "onClick"

    .line 23
    .line 24
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const v3, -0x52b21272

    .line 28
    .line 29
    .line 30
    move-object/from16 v4, p12

    .line 31
    .line 32
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 33
    .line 34
    .line 35
    move-result-object v13

    .line 36
    and-int/lit8 v4, v14, 0x1

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    or-int/lit8 v4, v15, 0x6

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    and-int/lit8 v4, v15, 0xe

    .line 44
    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    const/4 v4, 0x4

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v4, 0x2

    .line 56
    :goto_0
    or-int/2addr v4, v15

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v4, v15

    .line 59
    :goto_1
    and-int/lit8 v5, v14, 0x2

    .line 60
    .line 61
    if-eqz v5, :cond_3

    .line 62
    .line 63
    or-int/lit8 v4, v4, 0x30

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    and-int/lit8 v5, v15, 0x70

    .line 67
    .line 68
    if-nez v5, :cond_5

    .line 69
    .line 70
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_4

    .line 75
    .line 76
    const/16 v5, 0x20

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    const/16 v5, 0x10

    .line 80
    .line 81
    :goto_2
    or-int/2addr v4, v5

    .line 82
    :cond_5
    :goto_3
    and-int/lit8 v5, v14, 0x4

    .line 83
    .line 84
    if-eqz v5, :cond_6

    .line 85
    .line 86
    or-int/lit16 v4, v4, 0x180

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_6
    and-int/lit16 v5, v15, 0x380

    .line 90
    .line 91
    if-nez v5, :cond_8

    .line 92
    .line 93
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_7

    .line 98
    .line 99
    const/16 v5, 0x100

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_7
    const/16 v5, 0x80

    .line 103
    .line 104
    :goto_4
    or-int/2addr v4, v5

    .line 105
    :cond_8
    :goto_5
    and-int/lit8 v5, v14, 0x8

    .line 106
    .line 107
    if-eqz v5, :cond_9

    .line 108
    .line 109
    or-int/lit16 v4, v4, 0xc00

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_9
    and-int/lit16 v6, v15, 0x1c00

    .line 113
    .line 114
    if-nez v6, :cond_b

    .line 115
    .line 116
    move-object/from16 v6, p3

    .line 117
    .line 118
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_a

    .line 123
    .line 124
    const/16 v7, 0x800

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_a
    const/16 v7, 0x400

    .line 128
    .line 129
    :goto_6
    or-int/2addr v4, v7

    .line 130
    goto :goto_8

    .line 131
    :cond_b
    :goto_7
    move-object/from16 v6, p3

    .line 132
    .line 133
    :goto_8
    and-int/lit8 v7, v14, 0x10

    .line 134
    .line 135
    const v8, 0xe000

    .line 136
    .line 137
    .line 138
    if-eqz v7, :cond_c

    .line 139
    .line 140
    or-int/lit16 v4, v4, 0x6000

    .line 141
    .line 142
    goto :goto_a

    .line 143
    :cond_c
    and-int v9, v15, v8

    .line 144
    .line 145
    if-nez v9, :cond_e

    .line 146
    .line 147
    move/from16 v9, p4

    .line 148
    .line 149
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_d

    .line 154
    .line 155
    const/16 v10, 0x4000

    .line 156
    .line 157
    goto :goto_9

    .line 158
    :cond_d
    const/16 v10, 0x2000

    .line 159
    .line 160
    :goto_9
    or-int/2addr v4, v10

    .line 161
    goto :goto_b

    .line 162
    :cond_e
    :goto_a
    move/from16 v9, p4

    .line 163
    .line 164
    :goto_b
    const/high16 v10, 0x70000

    .line 165
    .line 166
    and-int v11, v15, v10

    .line 167
    .line 168
    if-nez v11, :cond_11

    .line 169
    .line 170
    and-int/lit8 v11, v14, 0x20

    .line 171
    .line 172
    if-nez v11, :cond_f

    .line 173
    .line 174
    move-object/from16 v11, p5

    .line 175
    .line 176
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    if-eqz v12, :cond_10

    .line 181
    .line 182
    const/high16 v12, 0x20000

    .line 183
    .line 184
    goto :goto_c

    .line 185
    :cond_f
    move-object/from16 v11, p5

    .line 186
    .line 187
    :cond_10
    const/high16 v12, 0x10000

    .line 188
    .line 189
    :goto_c
    or-int/2addr v4, v12

    .line 190
    goto :goto_d

    .line 191
    :cond_11
    move-object/from16 v11, p5

    .line 192
    .line 193
    :goto_d
    const/high16 v12, 0x380000

    .line 194
    .line 195
    and-int v16, v15, v12

    .line 196
    .line 197
    if-nez v16, :cond_13

    .line 198
    .line 199
    and-int/lit8 v16, v14, 0x40

    .line 200
    .line 201
    move-wide/from16 v10, p6

    .line 202
    .line 203
    if-nez v16, :cond_12

    .line 204
    .line 205
    invoke-interface {v13, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 206
    .line 207
    .line 208
    move-result v16

    .line 209
    if-eqz v16, :cond_12

    .line 210
    .line 211
    const/high16 v16, 0x100000

    .line 212
    .line 213
    goto :goto_e

    .line 214
    :cond_12
    const/high16 v16, 0x80000

    .line 215
    .line 216
    :goto_e
    or-int v4, v4, v16

    .line 217
    .line 218
    goto :goto_f

    .line 219
    :cond_13
    move-wide/from16 v10, p6

    .line 220
    .line 221
    :goto_f
    const/high16 v16, 0x1c00000

    .line 222
    .line 223
    and-int v16, v15, v16

    .line 224
    .line 225
    if-nez v16, :cond_15

    .line 226
    .line 227
    and-int/lit16 v12, v14, 0x80

    .line 228
    .line 229
    move-wide/from16 v8, p8

    .line 230
    .line 231
    if-nez v12, :cond_14

    .line 232
    .line 233
    invoke-interface {v13, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 234
    .line 235
    .line 236
    move-result v17

    .line 237
    if-eqz v17, :cond_14

    .line 238
    .line 239
    const/high16 v17, 0x800000

    .line 240
    .line 241
    goto :goto_10

    .line 242
    :cond_14
    const/high16 v17, 0x400000

    .line 243
    .line 244
    :goto_10
    or-int v4, v4, v17

    .line 245
    .line 246
    goto :goto_11

    .line 247
    :cond_15
    move-wide/from16 v8, p8

    .line 248
    .line 249
    :goto_11
    const/high16 v17, 0xe000000

    .line 250
    .line 251
    and-int v17, v15, v17

    .line 252
    .line 253
    if-nez v17, :cond_18

    .line 254
    .line 255
    and-int/lit16 v12, v14, 0x100

    .line 256
    .line 257
    if-nez v12, :cond_16

    .line 258
    .line 259
    move-object/from16 v12, p10

    .line 260
    .line 261
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v18

    .line 265
    if-eqz v18, :cond_17

    .line 266
    .line 267
    const/high16 v18, 0x4000000

    .line 268
    .line 269
    goto :goto_12

    .line 270
    :cond_16
    move-object/from16 v12, p10

    .line 271
    .line 272
    :cond_17
    const/high16 v18, 0x2000000

    .line 273
    .line 274
    :goto_12
    or-int v4, v4, v18

    .line 275
    .line 276
    goto :goto_13

    .line 277
    :cond_18
    move-object/from16 v12, p10

    .line 278
    .line 279
    :goto_13
    and-int/lit16 v3, v14, 0x200

    .line 280
    .line 281
    if-eqz v3, :cond_19

    .line 282
    .line 283
    const/high16 v19, 0x30000000

    .line 284
    .line 285
    or-int v4, v4, v19

    .line 286
    .line 287
    move-object/from16 v0, p11

    .line 288
    .line 289
    goto :goto_15

    .line 290
    :cond_19
    const/high16 v19, 0x70000000

    .line 291
    .line 292
    and-int v19, v15, v19

    .line 293
    .line 294
    move-object/from16 v0, p11

    .line 295
    .line 296
    if-nez v19, :cond_1b

    .line 297
    .line 298
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v19

    .line 302
    if-eqz v19, :cond_1a

    .line 303
    .line 304
    const/high16 v19, 0x20000000

    .line 305
    .line 306
    goto :goto_14

    .line 307
    :cond_1a
    const/high16 v19, 0x10000000

    .line 308
    .line 309
    :goto_14
    or-int v4, v4, v19

    .line 310
    .line 311
    :cond_1b
    :goto_15
    const v19, 0x5b6db6db

    .line 312
    .line 313
    .line 314
    and-int v0, v4, v19

    .line 315
    .line 316
    const v6, 0x12492492

    .line 317
    .line 318
    .line 319
    if-ne v0, v6, :cond_1d

    .line 320
    .line 321
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-nez v0, :cond_1c

    .line 326
    .line 327
    goto :goto_16

    .line 328
    :cond_1c
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 329
    .line 330
    .line 331
    move-object/from16 v4, p3

    .line 332
    .line 333
    move/from16 v5, p4

    .line 334
    .line 335
    move-object/from16 v6, p5

    .line 336
    .line 337
    move-object/from16 v18, v13

    .line 338
    .line 339
    move-object/from16 v28, v12

    .line 340
    .line 341
    move-object/from16 v12, p11

    .line 342
    .line 343
    move-wide/from16 v29, v10

    .line 344
    .line 345
    move-object/from16 v11, v28

    .line 346
    .line 347
    move-wide v9, v8

    .line 348
    move-wide/from16 v7, v29

    .line 349
    .line 350
    goto/16 :goto_1e

    .line 351
    .line 352
    :cond_1d
    :goto_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 353
    .line 354
    .line 355
    and-int/lit8 v0, v15, 0x1

    .line 356
    .line 357
    const v19, -0x1c00001

    .line 358
    .line 359
    .line 360
    const v20, -0x380001

    .line 361
    .line 362
    .line 363
    const v21, -0x70001

    .line 364
    .line 365
    .line 366
    if-eqz v0, :cond_23

    .line 367
    .line 368
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_1e

    .line 373
    .line 374
    goto :goto_17

    .line 375
    :cond_1e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 376
    .line 377
    .line 378
    and-int/lit8 v0, v14, 0x20

    .line 379
    .line 380
    if-eqz v0, :cond_1f

    .line 381
    .line 382
    and-int v4, v4, v21

    .line 383
    .line 384
    :cond_1f
    and-int/lit8 v0, v14, 0x40

    .line 385
    .line 386
    if-eqz v0, :cond_20

    .line 387
    .line 388
    and-int v4, v4, v20

    .line 389
    .line 390
    :cond_20
    and-int/lit16 v0, v14, 0x80

    .line 391
    .line 392
    if-eqz v0, :cond_21

    .line 393
    .line 394
    and-int v4, v4, v19

    .line 395
    .line 396
    :cond_21
    and-int/lit16 v0, v14, 0x100

    .line 397
    .line 398
    if-eqz v0, :cond_22

    .line 399
    .line 400
    const v0, -0xe000001

    .line 401
    .line 402
    .line 403
    and-int/2addr v4, v0

    .line 404
    :cond_22
    move-object/from16 v0, p3

    .line 405
    .line 406
    move-object/from16 v19, p5

    .line 407
    .line 408
    move-object/from16 v26, p11

    .line 409
    .line 410
    move-wide/from16 v24, v8

    .line 411
    .line 412
    move-wide/from16 v20, v10

    .line 413
    .line 414
    move-object/from16 v22, v12

    .line 415
    .line 416
    move/from16 v12, p4

    .line 417
    .line 418
    goto/16 :goto_1d

    .line 419
    .line 420
    :cond_23
    :goto_17
    if-eqz v5, :cond_24

    .line 421
    .line 422
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 423
    .line 424
    goto :goto_18

    .line 425
    :cond_24
    move-object/from16 v0, p3

    .line 426
    .line 427
    :goto_18
    if-eqz v7, :cond_25

    .line 428
    .line 429
    const/4 v5, 0x1

    .line 430
    goto :goto_19

    .line 431
    :cond_25
    move/from16 v5, p4

    .line 432
    .line 433
    :goto_19
    and-int/lit8 v7, v14, 0x20

    .line 434
    .line 435
    const/4 v6, 0x6

    .line 436
    if-eqz v7, :cond_26

    .line 437
    .line 438
    sget-object v7, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 439
    .line 440
    invoke-virtual {v7, v13, v6}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getExtendedFabShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    and-int v4, v4, v21

    .line 445
    .line 446
    goto :goto_1a

    .line 447
    :cond_26
    move-object/from16 v7, p5

    .line 448
    .line 449
    :goto_1a
    and-int/lit8 v21, v14, 0x40

    .line 450
    .line 451
    if-eqz v21, :cond_27

    .line 452
    .line 453
    sget-object v10, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 454
    .line 455
    invoke-virtual {v10, v13, v6}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 456
    .line 457
    .line 458
    move-result-wide v10

    .line 459
    and-int v4, v4, v20

    .line 460
    .line 461
    :cond_27
    and-int/lit16 v6, v14, 0x80

    .line 462
    .line 463
    if-eqz v6, :cond_28

    .line 464
    .line 465
    shr-int/lit8 v6, v4, 0x12

    .line 466
    .line 467
    and-int/lit8 v6, v6, 0xe

    .line 468
    .line 469
    invoke-static {v10, v11, v13, v6}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 470
    .line 471
    .line 472
    move-result-wide v8

    .line 473
    and-int v4, v4, v19

    .line 474
    .line 475
    :cond_28
    and-int/lit16 v6, v14, 0x100

    .line 476
    .line 477
    if-eqz v6, :cond_29

    .line 478
    .line 479
    sget-object v6, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 480
    .line 481
    const/4 v12, 0x0

    .line 482
    const/16 v19, 0x0

    .line 483
    .line 484
    const/16 v20, 0x0

    .line 485
    .line 486
    const/16 v21, 0x0

    .line 487
    .line 488
    const/16 v24, 0x6000

    .line 489
    .line 490
    const/16 v25, 0xf

    .line 491
    .line 492
    move-object/from16 p3, v6

    .line 493
    .line 494
    move/from16 p4, v12

    .line 495
    .line 496
    move/from16 p5, v19

    .line 497
    .line 498
    move/from16 p6, v20

    .line 499
    .line 500
    move/from16 p7, v21

    .line 501
    .line 502
    move-object/from16 p8, v13

    .line 503
    .line 504
    move/from16 p9, v24

    .line 505
    .line 506
    move/from16 p10, v25

    .line 507
    .line 508
    invoke-virtual/range {p3 .. p10}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    const v12, -0xe000001

    .line 513
    .line 514
    .line 515
    and-int/2addr v4, v12

    .line 516
    goto :goto_1b

    .line 517
    :cond_29
    move-object v6, v12

    .line 518
    :goto_1b
    if-eqz v3, :cond_2b

    .line 519
    .line 520
    const v3, -0x1d58f75c

    .line 521
    .line 522
    .line 523
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 524
    .line 525
    .line 526
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v12

    .line 536
    if-ne v3, v12, :cond_2a

    .line 537
    .line 538
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    :cond_2a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 546
    .line 547
    .line 548
    check-cast v3, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 549
    .line 550
    move-object/from16 v26, v3

    .line 551
    .line 552
    goto :goto_1c

    .line 553
    :cond_2b
    move-object/from16 v26, p11

    .line 554
    .line 555
    :goto_1c
    move v12, v5

    .line 556
    move-object/from16 v22, v6

    .line 557
    .line 558
    move-object/from16 v19, v7

    .line 559
    .line 560
    move-wide/from16 v24, v8

    .line 561
    .line 562
    move-wide/from16 v20, v10

    .line 563
    .line 564
    :goto_1d
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 565
    .line 566
    .line 567
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    if-eqz v3, :cond_2c

    .line 572
    .line 573
    const/4 v3, -0x1

    .line 574
    const-string v5, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)"

    .line 575
    .line 576
    const v6, -0x52b21272

    .line 577
    .line 578
    .line 579
    invoke-static {v6, v4, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 580
    .line 581
    .line 582
    :cond_2c
    new-instance v3, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5;

    .line 583
    .line 584
    invoke-direct {v3, v12, v2, v4, v1}, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5;-><init>(ZLkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;)V

    .line 585
    .line 586
    .line 587
    const v5, 0x45dd1a10

    .line 588
    .line 589
    .line 590
    const/4 v6, 0x1

    .line 591
    invoke-static {v13, v5, v6, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 592
    .line 593
    .line 594
    move-result-object v18

    .line 595
    shr-int/lit8 v3, v4, 0x6

    .line 596
    .line 597
    and-int/lit8 v5, v3, 0xe

    .line 598
    .line 599
    const/high16 v6, 0xc00000

    .line 600
    .line 601
    or-int/2addr v5, v6

    .line 602
    and-int/lit8 v3, v3, 0x70

    .line 603
    .line 604
    or-int/2addr v3, v5

    .line 605
    shr-int/lit8 v4, v4, 0x9

    .line 606
    .line 607
    and-int/lit16 v5, v4, 0x380

    .line 608
    .line 609
    or-int/2addr v3, v5

    .line 610
    and-int/lit16 v5, v4, 0x1c00

    .line 611
    .line 612
    or-int/2addr v3, v5

    .line 613
    const v5, 0xe000

    .line 614
    .line 615
    .line 616
    and-int/2addr v5, v4

    .line 617
    or-int/2addr v3, v5

    .line 618
    const/high16 v5, 0x70000

    .line 619
    .line 620
    and-int/2addr v5, v4

    .line 621
    or-int/2addr v3, v5

    .line 622
    const/high16 v5, 0x380000

    .line 623
    .line 624
    and-int/2addr v4, v5

    .line 625
    or-int v16, v3, v4

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    move-object/from16 v3, p2

    .line 630
    .line 631
    move-object v4, v0

    .line 632
    move-object/from16 v5, v19

    .line 633
    .line 634
    move-wide/from16 v6, v20

    .line 635
    .line 636
    move-wide/from16 v8, v24

    .line 637
    .line 638
    move-object/from16 v10, v22

    .line 639
    .line 640
    move-object/from16 v11, v26

    .line 641
    .line 642
    move/from16 v23, v12

    .line 643
    .line 644
    move-object/from16 v12, v18

    .line 645
    .line 646
    move-object/from16 v18, v13

    .line 647
    .line 648
    move/from16 v14, v16

    .line 649
    .line 650
    move/from16 v15, v17

    .line 651
    .line 652
    invoke-static/range {v3 .. v15}, Landroidx/compose/material3/FloatingActionButtonKt;->FloatingActionButton-X-z6DiA(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 653
    .line 654
    .line 655
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    if-eqz v3, :cond_2d

    .line 660
    .line 661
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 662
    .line 663
    .line 664
    :cond_2d
    move-object v4, v0

    .line 665
    move-object/from16 v6, v19

    .line 666
    .line 667
    move-wide/from16 v7, v20

    .line 668
    .line 669
    move-object/from16 v11, v22

    .line 670
    .line 671
    move/from16 v5, v23

    .line 672
    .line 673
    move-wide/from16 v9, v24

    .line 674
    .line 675
    move-object/from16 v12, v26

    .line 676
    .line 677
    :goto_1e
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 678
    .line 679
    .line 680
    move-result-object v15

    .line 681
    if-nez v15, :cond_2e

    .line 682
    .line 683
    goto :goto_1f

    .line 684
    :cond_2e
    new-instance v14, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$6;

    .line 685
    .line 686
    move-object v0, v14

    .line 687
    move-object/from16 v1, p0

    .line 688
    .line 689
    move-object/from16 v2, p1

    .line 690
    .line 691
    move-object/from16 v3, p2

    .line 692
    .line 693
    move/from16 v13, p13

    .line 694
    .line 695
    move-object/from16 v27, v14

    .line 696
    .line 697
    move/from16 v14, p14

    .line 698
    .line 699
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$6;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 700
    .line 701
    .line 702
    move-object/from16 v0, v27

    .line 703
    .line 704
    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 705
    .line 706
    .line 707
    :goto_1f
    return-void
.end method

.method public static final ExtendedFloatingActionButton-X-z6DiA(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
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
    move-object/from16 v13, p0

    .line 2
    .line 3
    move-object/from16 v14, p9

    .line 4
    .line 5
    move/from16 v15, p11

    .line 6
    .line 7
    move/from16 v12, p12

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "content"

    .line 15
    .line 16
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, -0x1372af63

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p10

    .line 23
    .line 24
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    and-int/lit8 v1, v12, 0x1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    or-int/lit8 v1, v15, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v1, v15, 0xe

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v1, 0x2

    .line 48
    :goto_0
    or-int/2addr v1, v15

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v15

    .line 51
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    or-int/lit8 v1, v1, 0x30

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    and-int/lit8 v3, v15, 0x70

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    move-object/from16 v3, p1

    .line 63
    .line 64
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    const/16 v4, 0x20

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/16 v4, 0x10

    .line 74
    .line 75
    :goto_2
    or-int/2addr v1, v4

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 78
    .line 79
    :goto_4
    and-int/lit16 v4, v15, 0x380

    .line 80
    .line 81
    if-nez v4, :cond_8

    .line 82
    .line 83
    and-int/lit8 v4, v12, 0x4

    .line 84
    .line 85
    if-nez v4, :cond_6

    .line 86
    .line 87
    move-object/from16 v4, p2

    .line 88
    .line 89
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_7

    .line 94
    .line 95
    const/16 v5, 0x100

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_6
    move-object/from16 v4, p2

    .line 99
    .line 100
    :cond_7
    const/16 v5, 0x80

    .line 101
    .line 102
    :goto_5
    or-int/2addr v1, v5

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    move-object/from16 v4, p2

    .line 105
    .line 106
    :goto_6
    and-int/lit16 v5, v15, 0x1c00

    .line 107
    .line 108
    if-nez v5, :cond_b

    .line 109
    .line 110
    and-int/lit8 v5, v12, 0x8

    .line 111
    .line 112
    if-nez v5, :cond_9

    .line 113
    .line 114
    move-wide/from16 v5, p3

    .line 115
    .line 116
    invoke-interface {v11, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_a

    .line 121
    .line 122
    const/16 v7, 0x800

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_9
    move-wide/from16 v5, p3

    .line 126
    .line 127
    :cond_a
    const/16 v7, 0x400

    .line 128
    .line 129
    :goto_7
    or-int/2addr v1, v7

    .line 130
    goto :goto_8

    .line 131
    :cond_b
    move-wide/from16 v5, p3

    .line 132
    .line 133
    :goto_8
    const v9, 0xe000

    .line 134
    .line 135
    .line 136
    and-int v7, v15, v9

    .line 137
    .line 138
    if-nez v7, :cond_e

    .line 139
    .line 140
    and-int/lit8 v7, v12, 0x10

    .line 141
    .line 142
    if-nez v7, :cond_c

    .line 143
    .line 144
    move-wide/from16 v7, p5

    .line 145
    .line 146
    invoke-interface {v11, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-eqz v10, :cond_d

    .line 151
    .line 152
    const/16 v10, 0x4000

    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_c
    move-wide/from16 v7, p5

    .line 156
    .line 157
    :cond_d
    const/16 v10, 0x2000

    .line 158
    .line 159
    :goto_9
    or-int/2addr v1, v10

    .line 160
    goto :goto_a

    .line 161
    :cond_e
    move-wide/from16 v7, p5

    .line 162
    .line 163
    :goto_a
    const/high16 v10, 0x70000

    .line 164
    .line 165
    and-int v16, v15, v10

    .line 166
    .line 167
    if-nez v16, :cond_10

    .line 168
    .line 169
    and-int/lit8 v16, v12, 0x20

    .line 170
    .line 171
    move-object/from16 v10, p7

    .line 172
    .line 173
    if-nez v16, :cond_f

    .line 174
    .line 175
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v16

    .line 179
    if-eqz v16, :cond_f

    .line 180
    .line 181
    const/high16 v16, 0x20000

    .line 182
    .line 183
    goto :goto_b

    .line 184
    :cond_f
    const/high16 v16, 0x10000

    .line 185
    .line 186
    :goto_b
    or-int v1, v1, v16

    .line 187
    .line 188
    goto :goto_c

    .line 189
    :cond_10
    move-object/from16 v10, p7

    .line 190
    .line 191
    :goto_c
    and-int/lit8 v16, v12, 0x40

    .line 192
    .line 193
    const/high16 v17, 0x380000

    .line 194
    .line 195
    if-eqz v16, :cond_11

    .line 196
    .line 197
    const/high16 v18, 0x180000

    .line 198
    .line 199
    or-int v1, v1, v18

    .line 200
    .line 201
    move-object/from16 v9, p8

    .line 202
    .line 203
    goto :goto_e

    .line 204
    :cond_11
    and-int v18, v15, v17

    .line 205
    .line 206
    move-object/from16 v9, p8

    .line 207
    .line 208
    if-nez v18, :cond_13

    .line 209
    .line 210
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v19

    .line 214
    if-eqz v19, :cond_12

    .line 215
    .line 216
    const/high16 v19, 0x100000

    .line 217
    .line 218
    goto :goto_d

    .line 219
    :cond_12
    const/high16 v19, 0x80000

    .line 220
    .line 221
    :goto_d
    or-int v1, v1, v19

    .line 222
    .line 223
    :cond_13
    :goto_e
    and-int/lit16 v0, v12, 0x80

    .line 224
    .line 225
    const/high16 v20, 0xc00000

    .line 226
    .line 227
    if-eqz v0, :cond_14

    .line 228
    .line 229
    or-int v1, v1, v20

    .line 230
    .line 231
    goto :goto_10

    .line 232
    :cond_14
    const/high16 v0, 0x1c00000

    .line 233
    .line 234
    and-int/2addr v0, v15

    .line 235
    if-nez v0, :cond_16

    .line 236
    .line 237
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_15

    .line 242
    .line 243
    const/high16 v0, 0x800000

    .line 244
    .line 245
    goto :goto_f

    .line 246
    :cond_15
    const/high16 v0, 0x400000

    .line 247
    .line 248
    :goto_f
    or-int/2addr v1, v0

    .line 249
    :cond_16
    :goto_10
    const v0, 0x16db6db

    .line 250
    .line 251
    .line 252
    and-int/2addr v0, v1

    .line 253
    const v3, 0x492492

    .line 254
    .line 255
    .line 256
    if-ne v0, v3, :cond_18

    .line 257
    .line 258
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-nez v0, :cond_17

    .line 263
    .line 264
    goto :goto_11

    .line 265
    :cond_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 266
    .line 267
    .line 268
    move-object/from16 v2, p1

    .line 269
    .line 270
    move-object v3, v4

    .line 271
    move-wide v4, v5

    .line 272
    move-wide v6, v7

    .line 273
    move-object v8, v10

    .line 274
    move-object/from16 v19, v11

    .line 275
    .line 276
    goto/16 :goto_1a

    .line 277
    .line 278
    :cond_18
    :goto_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 279
    .line 280
    .line 281
    and-int/lit8 v0, v15, 0x1

    .line 282
    .line 283
    const v21, -0x70001

    .line 284
    .line 285
    .line 286
    const v3, -0xe001

    .line 287
    .line 288
    .line 289
    if-eqz v0, :cond_1e

    .line 290
    .line 291
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_19

    .line 296
    .line 297
    goto :goto_14

    .line 298
    :cond_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 299
    .line 300
    .line 301
    and-int/lit8 v0, v12, 0x4

    .line 302
    .line 303
    if-eqz v0, :cond_1a

    .line 304
    .line 305
    and-int/lit16 v1, v1, -0x381

    .line 306
    .line 307
    :cond_1a
    and-int/lit8 v0, v12, 0x8

    .line 308
    .line 309
    if-eqz v0, :cond_1b

    .line 310
    .line 311
    and-int/lit16 v1, v1, -0x1c01

    .line 312
    .line 313
    :cond_1b
    and-int/lit8 v0, v12, 0x10

    .line 314
    .line 315
    if-eqz v0, :cond_1c

    .line 316
    .line 317
    and-int/2addr v1, v3

    .line 318
    :cond_1c
    and-int/lit8 v0, v12, 0x20

    .line 319
    .line 320
    if-eqz v0, :cond_1d

    .line 321
    .line 322
    and-int v1, v1, v21

    .line 323
    .line 324
    :cond_1d
    move-object/from16 v16, p1

    .line 325
    .line 326
    move-object/from16 v23, v4

    .line 327
    .line 328
    move-wide/from16 v26, v5

    .line 329
    .line 330
    move-wide/from16 v24, v7

    .line 331
    .line 332
    :goto_12
    move-object/from16 v22, v9

    .line 333
    .line 334
    :goto_13
    move-object/from16 v21, v10

    .line 335
    .line 336
    goto/16 :goto_19

    .line 337
    .line 338
    :cond_1e
    :goto_14
    if-eqz v2, :cond_1f

    .line 339
    .line 340
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 341
    .line 342
    goto :goto_15

    .line 343
    :cond_1f
    move-object/from16 v0, p1

    .line 344
    .line 345
    :goto_15
    and-int/lit8 v2, v12, 0x4

    .line 346
    .line 347
    const/4 v3, 0x6

    .line 348
    if-eqz v2, :cond_20

    .line 349
    .line 350
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 351
    .line 352
    invoke-virtual {v2, v11, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getExtendedFabShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    and-int/lit16 v1, v1, -0x381

    .line 357
    .line 358
    move-object/from16 v23, v2

    .line 359
    .line 360
    goto :goto_16

    .line 361
    :cond_20
    move-object/from16 v23, v4

    .line 362
    .line 363
    :goto_16
    and-int/lit8 v2, v12, 0x8

    .line 364
    .line 365
    if-eqz v2, :cond_21

    .line 366
    .line 367
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 368
    .line 369
    invoke-virtual {v2, v11, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    and-int/lit16 v1, v1, -0x1c01

    .line 374
    .line 375
    move-wide v5, v2

    .line 376
    :cond_21
    and-int/lit8 v2, v12, 0x10

    .line 377
    .line 378
    if-eqz v2, :cond_22

    .line 379
    .line 380
    shr-int/lit8 v2, v1, 0x9

    .line 381
    .line 382
    and-int/lit8 v2, v2, 0xe

    .line 383
    .line 384
    invoke-static {v5, v6, v11, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 385
    .line 386
    .line 387
    move-result-wide v2

    .line 388
    const v4, -0xe001

    .line 389
    .line 390
    .line 391
    and-int/2addr v1, v4

    .line 392
    move/from16 v22, v1

    .line 393
    .line 394
    move-wide/from16 v24, v2

    .line 395
    .line 396
    goto :goto_17

    .line 397
    :cond_22
    move/from16 v22, v1

    .line 398
    .line 399
    move-wide/from16 v24, v7

    .line 400
    .line 401
    :goto_17
    and-int/lit8 v1, v12, 0x20

    .line 402
    .line 403
    if-eqz v1, :cond_23

    .line 404
    .line 405
    sget-object v1, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 406
    .line 407
    const/4 v2, 0x0

    .line 408
    const/4 v3, 0x0

    .line 409
    const/4 v4, 0x0

    .line 410
    const/4 v7, 0x0

    .line 411
    const/16 v8, 0x6000

    .line 412
    .line 413
    const/16 v10, 0xf

    .line 414
    .line 415
    move-wide/from16 v26, v5

    .line 416
    .line 417
    move v5, v7

    .line 418
    move-object v6, v11

    .line 419
    move v7, v8

    .line 420
    move v8, v10

    .line 421
    invoke-virtual/range {v1 .. v8}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    and-int v2, v22, v21

    .line 426
    .line 427
    move-object v10, v1

    .line 428
    move v1, v2

    .line 429
    goto :goto_18

    .line 430
    :cond_23
    move-wide/from16 v26, v5

    .line 431
    .line 432
    move/from16 v1, v22

    .line 433
    .line 434
    :goto_18
    if-eqz v16, :cond_25

    .line 435
    .line 436
    const v2, -0x1d58f75c

    .line 437
    .line 438
    .line 439
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 447
    .line 448
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    if-ne v2, v3, :cond_24

    .line 453
    .line 454
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    :cond_24
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 462
    .line 463
    .line 464
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 465
    .line 466
    move-object/from16 v16, v0

    .line 467
    .line 468
    move-object/from16 v22, v2

    .line 469
    .line 470
    goto/16 :goto_13

    .line 471
    .line 472
    :cond_25
    move-object/from16 v16, v0

    .line 473
    .line 474
    goto/16 :goto_12

    .line 475
    .line 476
    :goto_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 477
    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-eqz v0, :cond_26

    .line 484
    .line 485
    const/4 v0, -0x1

    .line 486
    const-string v2, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:268)"

    .line 487
    .line 488
    const v3, -0x1372af63

    .line 489
    .line 490
    .line 491
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :cond_26
    new-instance v0, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$2;

    .line 495
    .line 496
    invoke-direct {v0, v14, v1}, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$2;-><init>(Lkotlin/jvm/functions/Function3;I)V

    .line 497
    .line 498
    .line 499
    const v2, 0x17bff99f

    .line 500
    .line 501
    .line 502
    const/4 v3, 0x1

    .line 503
    invoke-static {v11, v2, v3, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 504
    .line 505
    .line 506
    move-result-object v9

    .line 507
    and-int/lit8 v0, v1, 0xe

    .line 508
    .line 509
    or-int v0, v0, v20

    .line 510
    .line 511
    and-int/lit8 v2, v1, 0x70

    .line 512
    .line 513
    or-int/2addr v0, v2

    .line 514
    and-int/lit16 v2, v1, 0x380

    .line 515
    .line 516
    or-int/2addr v0, v2

    .line 517
    and-int/lit16 v2, v1, 0x1c00

    .line 518
    .line 519
    or-int/2addr v0, v2

    .line 520
    const v2, 0xe000

    .line 521
    .line 522
    .line 523
    and-int/2addr v2, v1

    .line 524
    or-int/2addr v0, v2

    .line 525
    const/high16 v2, 0x70000

    .line 526
    .line 527
    and-int/2addr v2, v1

    .line 528
    or-int/2addr v0, v2

    .line 529
    and-int v1, v1, v17

    .line 530
    .line 531
    or-int v17, v0, v1

    .line 532
    .line 533
    const/16 v18, 0x0

    .line 534
    .line 535
    move-object/from16 v0, p0

    .line 536
    .line 537
    move-object/from16 v1, v16

    .line 538
    .line 539
    move-object/from16 v2, v23

    .line 540
    .line 541
    move-wide/from16 v3, v26

    .line 542
    .line 543
    move-wide/from16 v5, v24

    .line 544
    .line 545
    move-object/from16 v7, v21

    .line 546
    .line 547
    move-object/from16 v8, v22

    .line 548
    .line 549
    move-object v10, v11

    .line 550
    move-object/from16 v19, v11

    .line 551
    .line 552
    move/from16 v11, v17

    .line 553
    .line 554
    move/from16 v12, v18

    .line 555
    .line 556
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt;->FloatingActionButton-X-z6DiA(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 557
    .line 558
    .line 559
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-eqz v0, :cond_27

    .line 564
    .line 565
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 566
    .line 567
    .line 568
    :cond_27
    move-object/from16 v2, v16

    .line 569
    .line 570
    move-object/from16 v8, v21

    .line 571
    .line 572
    move-object/from16 v9, v22

    .line 573
    .line 574
    move-object/from16 v3, v23

    .line 575
    .line 576
    move-wide/from16 v6, v24

    .line 577
    .line 578
    move-wide/from16 v4, v26

    .line 579
    .line 580
    :goto_1a
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 581
    .line 582
    .line 583
    move-result-object v12

    .line 584
    if-nez v12, :cond_28

    .line 585
    .line 586
    goto :goto_1b

    .line 587
    :cond_28
    new-instance v11, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$3;

    .line 588
    .line 589
    move-object v0, v11

    .line 590
    move-object/from16 v1, p0

    .line 591
    .line 592
    move-object/from16 v10, p9

    .line 593
    .line 594
    move-object v13, v11

    .line 595
    move/from16 v11, p11

    .line 596
    .line 597
    move-object v14, v12

    .line 598
    move/from16 v12, p12

    .line 599
    .line 600
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;II)V

    .line 601
    .line 602
    .line 603
    invoke-interface {v14, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 604
    .line 605
    .line 606
    :goto_1b
    return-void
.end method

.method public static final FloatingActionButton-X-z6DiA(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lkotlin/jvm/functions/Function2<",
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
    move-object/from16 v13, p0

    .line 2
    .line 3
    move-object/from16 v11, p9

    .line 4
    .line 5
    move/from16 v6, p11

    .line 6
    .line 7
    move/from16 v7, p12

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "content"

    .line 15
    .line 16
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, -0x2b9d3889

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p10

    .line 23
    .line 24
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    and-int/lit8 v1, v7, 0x1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    or-int/lit8 v1, v6, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v1, v6, 0xe

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v1, 0x2

    .line 48
    :goto_0
    or-int/2addr v1, v6

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v6

    .line 51
    :goto_1
    and-int/lit8 v2, v7, 0x2

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    or-int/lit8 v1, v1, 0x30

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    and-int/lit8 v3, v6, 0x70

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    move-object/from16 v3, p1

    .line 63
    .line 64
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    const/16 v5, 0x20

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/16 v5, 0x10

    .line 74
    .line 75
    :goto_2
    or-int/2addr v1, v5

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 78
    .line 79
    :goto_4
    and-int/lit16 v5, v6, 0x380

    .line 80
    .line 81
    if-nez v5, :cond_8

    .line 82
    .line 83
    and-int/lit8 v5, v7, 0x4

    .line 84
    .line 85
    if-nez v5, :cond_6

    .line 86
    .line 87
    move-object/from16 v5, p2

    .line 88
    .line 89
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_7

    .line 94
    .line 95
    const/16 v8, 0x100

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_6
    move-object/from16 v5, p2

    .line 99
    .line 100
    :cond_7
    const/16 v8, 0x80

    .line 101
    .line 102
    :goto_5
    or-int/2addr v1, v8

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    move-object/from16 v5, p2

    .line 105
    .line 106
    :goto_6
    and-int/lit16 v8, v6, 0x1c00

    .line 107
    .line 108
    if-nez v8, :cond_b

    .line 109
    .line 110
    and-int/lit8 v8, v7, 0x8

    .line 111
    .line 112
    if-nez v8, :cond_9

    .line 113
    .line 114
    move-wide/from16 v8, p3

    .line 115
    .line 116
    invoke-interface {v4, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    if-eqz v10, :cond_a

    .line 121
    .line 122
    const/16 v10, 0x800

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_9
    move-wide/from16 v8, p3

    .line 126
    .line 127
    :cond_a
    const/16 v10, 0x400

    .line 128
    .line 129
    :goto_7
    or-int/2addr v1, v10

    .line 130
    goto :goto_8

    .line 131
    :cond_b
    move-wide/from16 v8, p3

    .line 132
    .line 133
    :goto_8
    const v22, 0xe000

    .line 134
    .line 135
    .line 136
    and-int v10, v6, v22

    .line 137
    .line 138
    if-nez v10, :cond_d

    .line 139
    .line 140
    and-int/lit8 v10, v7, 0x10

    .line 141
    .line 142
    move-wide/from16 v14, p5

    .line 143
    .line 144
    if-nez v10, :cond_c

    .line 145
    .line 146
    invoke-interface {v4, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-eqz v10, :cond_c

    .line 151
    .line 152
    const/16 v10, 0x4000

    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_c
    const/16 v10, 0x2000

    .line 156
    .line 157
    :goto_9
    or-int/2addr v1, v10

    .line 158
    goto :goto_a

    .line 159
    :cond_d
    move-wide/from16 v14, p5

    .line 160
    .line 161
    :goto_a
    const/high16 v23, 0x70000

    .line 162
    .line 163
    and-int v10, v6, v23

    .line 164
    .line 165
    if-nez v10, :cond_10

    .line 166
    .line 167
    and-int/lit8 v10, v7, 0x20

    .line 168
    .line 169
    if-nez v10, :cond_e

    .line 170
    .line 171
    move-object/from16 v10, p7

    .line 172
    .line 173
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-eqz v12, :cond_f

    .line 178
    .line 179
    const/high16 v12, 0x20000

    .line 180
    .line 181
    goto :goto_b

    .line 182
    :cond_e
    move-object/from16 v10, p7

    .line 183
    .line 184
    :cond_f
    const/high16 v12, 0x10000

    .line 185
    .line 186
    :goto_b
    or-int/2addr v1, v12

    .line 187
    goto :goto_c

    .line 188
    :cond_10
    move-object/from16 v10, p7

    .line 189
    .line 190
    :goto_c
    and-int/lit8 v12, v7, 0x40

    .line 191
    .line 192
    if-eqz v12, :cond_11

    .line 193
    .line 194
    const/high16 v16, 0x180000

    .line 195
    .line 196
    or-int v1, v1, v16

    .line 197
    .line 198
    move-object/from16 v0, p8

    .line 199
    .line 200
    goto :goto_e

    .line 201
    :cond_11
    const/high16 v16, 0x380000

    .line 202
    .line 203
    and-int v16, v6, v16

    .line 204
    .line 205
    move-object/from16 v0, p8

    .line 206
    .line 207
    if-nez v16, :cond_13

    .line 208
    .line 209
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v16

    .line 213
    if-eqz v16, :cond_12

    .line 214
    .line 215
    const/high16 v16, 0x100000

    .line 216
    .line 217
    goto :goto_d

    .line 218
    :cond_12
    const/high16 v16, 0x80000

    .line 219
    .line 220
    :goto_d
    or-int v1, v1, v16

    .line 221
    .line 222
    :cond_13
    :goto_e
    and-int/lit16 v0, v7, 0x80

    .line 223
    .line 224
    if-eqz v0, :cond_14

    .line 225
    .line 226
    const/high16 v0, 0xc00000

    .line 227
    .line 228
    :goto_f
    or-int/2addr v1, v0

    .line 229
    goto :goto_10

    .line 230
    :cond_14
    const/high16 v0, 0x1c00000

    .line 231
    .line 232
    and-int/2addr v0, v6

    .line 233
    if-nez v0, :cond_16

    .line 234
    .line 235
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_15

    .line 240
    .line 241
    const/high16 v0, 0x800000

    .line 242
    .line 243
    goto :goto_f

    .line 244
    :cond_15
    const/high16 v0, 0x400000

    .line 245
    .line 246
    goto :goto_f

    .line 247
    :cond_16
    :goto_10
    const v0, 0x16db6db

    .line 248
    .line 249
    .line 250
    and-int/2addr v0, v1

    .line 251
    const v3, 0x492492

    .line 252
    .line 253
    .line 254
    if-ne v0, v3, :cond_18

    .line 255
    .line 256
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_17

    .line 261
    .line 262
    goto :goto_11

    .line 263
    :cond_17
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 264
    .line 265
    .line 266
    move-object/from16 v2, p1

    .line 267
    .line 268
    move-object/from16 v24, v4

    .line 269
    .line 270
    move-object v3, v5

    .line 271
    move-wide v4, v8

    .line 272
    move-object v8, v10

    .line 273
    move-wide v6, v14

    .line 274
    move-object/from16 v9, p8

    .line 275
    .line 276
    goto/16 :goto_16

    .line 277
    .line 278
    :cond_18
    :goto_11
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 279
    .line 280
    .line 281
    and-int/lit8 v0, v6, 0x1

    .line 282
    .line 283
    const v3, -0x70001

    .line 284
    .line 285
    .line 286
    const v16, -0xe001

    .line 287
    .line 288
    .line 289
    if-eqz v0, :cond_1e

    .line 290
    .line 291
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_19

    .line 296
    .line 297
    goto :goto_12

    .line 298
    :cond_19
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 299
    .line 300
    .line 301
    and-int/lit8 v0, v7, 0x4

    .line 302
    .line 303
    if-eqz v0, :cond_1a

    .line 304
    .line 305
    and-int/lit16 v1, v1, -0x381

    .line 306
    .line 307
    :cond_1a
    and-int/lit8 v0, v7, 0x8

    .line 308
    .line 309
    if-eqz v0, :cond_1b

    .line 310
    .line 311
    and-int/lit16 v1, v1, -0x1c01

    .line 312
    .line 313
    :cond_1b
    and-int/lit8 v0, v7, 0x10

    .line 314
    .line 315
    if-eqz v0, :cond_1c

    .line 316
    .line 317
    and-int v1, v1, v16

    .line 318
    .line 319
    :cond_1c
    and-int/lit8 v0, v7, 0x20

    .line 320
    .line 321
    if-eqz v0, :cond_1d

    .line 322
    .line 323
    and-int/2addr v1, v3

    .line 324
    :cond_1d
    move-object/from16 v17, p1

    .line 325
    .line 326
    move-object/from16 v3, p8

    .line 327
    .line 328
    move-object/from16 v18, v5

    .line 329
    .line 330
    move-wide/from16 v19, v8

    .line 331
    .line 332
    move-object v5, v10

    .line 333
    move-wide/from16 v26, v14

    .line 334
    .line 335
    move v14, v1

    .line 336
    move-wide/from16 v0, v26

    .line 337
    .line 338
    goto/16 :goto_15

    .line 339
    .line 340
    :cond_1e
    :goto_12
    if-eqz v2, :cond_1f

    .line 341
    .line 342
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 343
    .line 344
    goto :goto_13

    .line 345
    :cond_1f
    move-object/from16 v0, p1

    .line 346
    .line 347
    :goto_13
    and-int/lit8 v2, v7, 0x4

    .line 348
    .line 349
    const/4 v3, 0x6

    .line 350
    if-eqz v2, :cond_20

    .line 351
    .line 352
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 353
    .line 354
    invoke-virtual {v2, v4, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    and-int/lit16 v1, v1, -0x381

    .line 359
    .line 360
    move-object v5, v2

    .line 361
    :cond_20
    and-int/lit8 v2, v7, 0x8

    .line 362
    .line 363
    if-eqz v2, :cond_21

    .line 364
    .line 365
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 366
    .line 367
    invoke-virtual {v2, v4, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 368
    .line 369
    .line 370
    move-result-wide v2

    .line 371
    and-int/lit16 v1, v1, -0x1c01

    .line 372
    .line 373
    move-wide v8, v2

    .line 374
    :cond_21
    and-int/lit8 v2, v7, 0x10

    .line 375
    .line 376
    if-eqz v2, :cond_22

    .line 377
    .line 378
    shr-int/lit8 v2, v1, 0x9

    .line 379
    .line 380
    and-int/lit8 v2, v2, 0xe

    .line 381
    .line 382
    invoke-static {v8, v9, v4, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 383
    .line 384
    .line 385
    move-result-wide v2

    .line 386
    and-int v1, v1, v16

    .line 387
    .line 388
    goto :goto_14

    .line 389
    :cond_22
    move-wide v2, v14

    .line 390
    :goto_14
    and-int/lit8 v14, v7, 0x20

    .line 391
    .line 392
    if-eqz v14, :cond_23

    .line 393
    .line 394
    sget-object v14, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 395
    .line 396
    const/4 v15, 0x0

    .line 397
    const/16 v16, 0x0

    .line 398
    .line 399
    const/16 v17, 0x0

    .line 400
    .line 401
    const/16 v18, 0x0

    .line 402
    .line 403
    const/16 v20, 0x6000

    .line 404
    .line 405
    const/16 v21, 0xf

    .line 406
    .line 407
    move-object/from16 v19, v4

    .line 408
    .line 409
    invoke-virtual/range {v14 .. v21}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 410
    .line 411
    .line 412
    move-result-object v10

    .line 413
    const v14, -0x70001

    .line 414
    .line 415
    .line 416
    and-int/2addr v1, v14

    .line 417
    :cond_23
    if-eqz v12, :cond_25

    .line 418
    .line 419
    const v12, -0x1d58f75c

    .line 420
    .line 421
    .line 422
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 423
    .line 424
    .line 425
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 430
    .line 431
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v14

    .line 435
    if-ne v12, v14, :cond_24

    .line 436
    .line 437
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 438
    .line 439
    .line 440
    move-result-object v12

    .line 441
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_24
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 445
    .line 446
    .line 447
    check-cast v12, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 448
    .line 449
    move-object/from16 v17, v0

    .line 450
    .line 451
    move v14, v1

    .line 452
    move-wide v0, v2

    .line 453
    move-object/from16 v18, v5

    .line 454
    .line 455
    move-wide/from16 v19, v8

    .line 456
    .line 457
    move-object v5, v10

    .line 458
    move-object v3, v12

    .line 459
    goto :goto_15

    .line 460
    :cond_25
    move-object/from16 v17, v0

    .line 461
    .line 462
    move v14, v1

    .line 463
    move-wide v0, v2

    .line 464
    move-object/from16 v18, v5

    .line 465
    .line 466
    move-wide/from16 v19, v8

    .line 467
    .line 468
    move-object v5, v10

    .line 469
    move-object/from16 v3, p8

    .line 470
    .line 471
    :goto_15
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 472
    .line 473
    .line 474
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_26

    .line 479
    .line 480
    const/4 v2, -0x1

    .line 481
    const-string v8, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)"

    .line 482
    .line 483
    const v9, -0x2b9d3889

    .line 484
    .line 485
    .line 486
    invoke-static {v9, v14, v2, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 487
    .line 488
    .line 489
    :cond_26
    const/4 v2, 0x0

    .line 490
    shr-int/lit8 v8, v14, 0x12

    .line 491
    .line 492
    and-int/lit8 v8, v8, 0xe

    .line 493
    .line 494
    shr-int/lit8 v9, v14, 0xc

    .line 495
    .line 496
    and-int/lit8 v9, v9, 0x70

    .line 497
    .line 498
    or-int/2addr v9, v8

    .line 499
    invoke-virtual {v5, v3, v4, v9}, Landroidx/compose/material3/FloatingActionButtonElevation;->tonalElevation$material3_release(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    invoke-interface {v8}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    check-cast v8, Landroidx/compose/ui/unit/Dp;

    .line 508
    .line 509
    invoke-virtual {v8}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 510
    .line 511
    .line 512
    move-result v8

    .line 513
    invoke-virtual {v5, v3, v4, v9}, Landroidx/compose/material3/FloatingActionButtonElevation;->shadowElevation$material3_release(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 514
    .line 515
    .line 516
    move-result-object v9

    .line 517
    invoke-interface {v9}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v9

    .line 521
    check-cast v9, Landroidx/compose/ui/unit/Dp;

    .line 522
    .line 523
    invoke-virtual {v9}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 524
    .line 525
    .line 526
    move-result v9

    .line 527
    const/4 v10, 0x0

    .line 528
    new-instance v12, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$2;

    .line 529
    .line 530
    invoke-direct {v12, v0, v1, v11, v14}, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$2;-><init>(JLkotlin/jvm/functions/Function2;I)V

    .line 531
    .line 532
    .line 533
    const v15, 0x4a770e02    # 4047744.5f

    .line 534
    .line 535
    .line 536
    const/4 v2, 0x1

    .line 537
    invoke-static {v4, v15, v2, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 538
    .line 539
    .line 540
    move-result-object v12

    .line 541
    and-int/lit8 v2, v14, 0xe

    .line 542
    .line 543
    and-int/lit8 v15, v14, 0x70

    .line 544
    .line 545
    or-int/2addr v2, v15

    .line 546
    shl-int/lit8 v15, v14, 0x3

    .line 547
    .line 548
    and-int/lit16 v10, v15, 0x1c00

    .line 549
    .line 550
    or-int/2addr v2, v10

    .line 551
    and-int v10, v15, v22

    .line 552
    .line 553
    or-int/2addr v2, v10

    .line 554
    and-int v10, v15, v23

    .line 555
    .line 556
    or-int/2addr v2, v10

    .line 557
    const/high16 v10, 0x70000000

    .line 558
    .line 559
    shl-int/lit8 v14, v14, 0x9

    .line 560
    .line 561
    and-int/2addr v10, v14

    .line 562
    or-int v14, v2, v10

    .line 563
    .line 564
    const/4 v15, 0x6

    .line 565
    const/16 v16, 0x104

    .line 566
    .line 567
    move-wide/from16 v21, v0

    .line 568
    .line 569
    move-object/from16 v0, p0

    .line 570
    .line 571
    move-object/from16 v1, v17

    .line 572
    .line 573
    move-object/from16 v23, v3

    .line 574
    .line 575
    move-object/from16 v3, v18

    .line 576
    .line 577
    move-object/from16 v24, v4

    .line 578
    .line 579
    move-object/from16 v25, v5

    .line 580
    .line 581
    move-wide/from16 v4, v19

    .line 582
    .line 583
    move-wide/from16 v6, v21

    .line 584
    .line 585
    move-object/from16 v11, v23

    .line 586
    .line 587
    move-object/from16 v13, v24

    .line 588
    .line 589
    const/4 v2, 0x0

    .line 590
    const/4 v10, 0x0

    .line 591
    invoke-static/range {v0 .. v16}, Landroidx/compose/material3/SurfaceKt;->Surface-o_FOJdg(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V

    .line 592
    .line 593
    .line 594
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-eqz v0, :cond_27

    .line 599
    .line 600
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 601
    .line 602
    .line 603
    :cond_27
    move-object/from16 v2, v17

    .line 604
    .line 605
    move-object/from16 v3, v18

    .line 606
    .line 607
    move-wide/from16 v4, v19

    .line 608
    .line 609
    move-wide/from16 v6, v21

    .line 610
    .line 611
    move-object/from16 v9, v23

    .line 612
    .line 613
    move-object/from16 v8, v25

    .line 614
    .line 615
    :goto_16
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 616
    .line 617
    .line 618
    move-result-object v13

    .line 619
    if-nez v13, :cond_28

    .line 620
    .line 621
    goto :goto_17

    .line 622
    :cond_28
    new-instance v14, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$3;

    .line 623
    .line 624
    move-object v0, v14

    .line 625
    move-object/from16 v1, p0

    .line 626
    .line 627
    move-object/from16 v10, p9

    .line 628
    .line 629
    move/from16 v11, p11

    .line 630
    .line 631
    move/from16 v12, p12

    .line 632
    .line 633
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)V

    .line 634
    .line 635
    .line 636
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 637
    .line 638
    .line 639
    :goto_17
    return-void
.end method

.method public static final LargeFloatingActionButton-X-z6DiA(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lkotlin/jvm/functions/Function2<",
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
    move-object/from16 v13, p0

    .line 2
    .line 3
    move-object/from16 v14, p9

    .line 4
    .line 5
    move/from16 v15, p11

    .line 6
    .line 7
    move/from16 v12, p12

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "content"

    .line 15
    .line 16
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, -0x62663aa8

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p10

    .line 23
    .line 24
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    and-int/lit8 v1, v12, 0x1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    or-int/lit8 v1, v15, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v1, v15, 0xe

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v1, 0x2

    .line 48
    :goto_0
    or-int/2addr v1, v15

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v15

    .line 51
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    or-int/lit8 v1, v1, 0x30

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    and-int/lit8 v3, v15, 0x70

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    move-object/from16 v3, p1

    .line 63
    .line 64
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    const/16 v4, 0x20

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/16 v4, 0x10

    .line 74
    .line 75
    :goto_2
    or-int/2addr v1, v4

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 78
    .line 79
    :goto_4
    and-int/lit16 v4, v15, 0x380

    .line 80
    .line 81
    if-nez v4, :cond_8

    .line 82
    .line 83
    and-int/lit8 v4, v12, 0x4

    .line 84
    .line 85
    if-nez v4, :cond_6

    .line 86
    .line 87
    move-object/from16 v4, p2

    .line 88
    .line 89
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_7

    .line 94
    .line 95
    const/16 v5, 0x100

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_6
    move-object/from16 v4, p2

    .line 99
    .line 100
    :cond_7
    const/16 v5, 0x80

    .line 101
    .line 102
    :goto_5
    or-int/2addr v1, v5

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    move-object/from16 v4, p2

    .line 105
    .line 106
    :goto_6
    and-int/lit16 v5, v15, 0x1c00

    .line 107
    .line 108
    if-nez v5, :cond_b

    .line 109
    .line 110
    and-int/lit8 v5, v12, 0x8

    .line 111
    .line 112
    if-nez v5, :cond_9

    .line 113
    .line 114
    move-wide/from16 v5, p3

    .line 115
    .line 116
    invoke-interface {v11, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_a

    .line 121
    .line 122
    const/16 v7, 0x800

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_9
    move-wide/from16 v5, p3

    .line 126
    .line 127
    :cond_a
    const/16 v7, 0x400

    .line 128
    .line 129
    :goto_7
    or-int/2addr v1, v7

    .line 130
    goto :goto_8

    .line 131
    :cond_b
    move-wide/from16 v5, p3

    .line 132
    .line 133
    :goto_8
    const v9, 0xe000

    .line 134
    .line 135
    .line 136
    and-int v7, v15, v9

    .line 137
    .line 138
    if-nez v7, :cond_e

    .line 139
    .line 140
    and-int/lit8 v7, v12, 0x10

    .line 141
    .line 142
    if-nez v7, :cond_c

    .line 143
    .line 144
    move-wide/from16 v7, p5

    .line 145
    .line 146
    invoke-interface {v11, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-eqz v10, :cond_d

    .line 151
    .line 152
    const/16 v10, 0x4000

    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_c
    move-wide/from16 v7, p5

    .line 156
    .line 157
    :cond_d
    const/16 v10, 0x2000

    .line 158
    .line 159
    :goto_9
    or-int/2addr v1, v10

    .line 160
    goto :goto_a

    .line 161
    :cond_e
    move-wide/from16 v7, p5

    .line 162
    .line 163
    :goto_a
    const/high16 v10, 0x70000

    .line 164
    .line 165
    and-int v16, v15, v10

    .line 166
    .line 167
    if-nez v16, :cond_10

    .line 168
    .line 169
    and-int/lit8 v16, v12, 0x20

    .line 170
    .line 171
    move-object/from16 v10, p7

    .line 172
    .line 173
    if-nez v16, :cond_f

    .line 174
    .line 175
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v16

    .line 179
    if-eqz v16, :cond_f

    .line 180
    .line 181
    const/high16 v16, 0x20000

    .line 182
    .line 183
    goto :goto_b

    .line 184
    :cond_f
    const/high16 v16, 0x10000

    .line 185
    .line 186
    :goto_b
    or-int v1, v1, v16

    .line 187
    .line 188
    goto :goto_c

    .line 189
    :cond_10
    move-object/from16 v10, p7

    .line 190
    .line 191
    :goto_c
    and-int/lit8 v16, v12, 0x40

    .line 192
    .line 193
    const/high16 v17, 0x380000

    .line 194
    .line 195
    if-eqz v16, :cond_11

    .line 196
    .line 197
    const/high16 v18, 0x180000

    .line 198
    .line 199
    or-int v1, v1, v18

    .line 200
    .line 201
    move-object/from16 v9, p8

    .line 202
    .line 203
    goto :goto_e

    .line 204
    :cond_11
    and-int v18, v15, v17

    .line 205
    .line 206
    move-object/from16 v9, p8

    .line 207
    .line 208
    if-nez v18, :cond_13

    .line 209
    .line 210
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v19

    .line 214
    if-eqz v19, :cond_12

    .line 215
    .line 216
    const/high16 v19, 0x100000

    .line 217
    .line 218
    goto :goto_d

    .line 219
    :cond_12
    const/high16 v19, 0x80000

    .line 220
    .line 221
    :goto_d
    or-int v1, v1, v19

    .line 222
    .line 223
    :cond_13
    :goto_e
    and-int/lit16 v0, v12, 0x80

    .line 224
    .line 225
    const/high16 v20, 0x1c00000

    .line 226
    .line 227
    if-eqz v0, :cond_14

    .line 228
    .line 229
    const/high16 v0, 0xc00000

    .line 230
    .line 231
    :goto_f
    or-int/2addr v1, v0

    .line 232
    goto :goto_10

    .line 233
    :cond_14
    and-int v0, v15, v20

    .line 234
    .line 235
    if-nez v0, :cond_16

    .line 236
    .line 237
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_15

    .line 242
    .line 243
    const/high16 v0, 0x800000

    .line 244
    .line 245
    goto :goto_f

    .line 246
    :cond_15
    const/high16 v0, 0x400000

    .line 247
    .line 248
    goto :goto_f

    .line 249
    :cond_16
    :goto_10
    const v0, 0x16db6db

    .line 250
    .line 251
    .line 252
    and-int/2addr v0, v1

    .line 253
    const v3, 0x492492

    .line 254
    .line 255
    .line 256
    if-ne v0, v3, :cond_18

    .line 257
    .line 258
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-nez v0, :cond_17

    .line 263
    .line 264
    goto :goto_11

    .line 265
    :cond_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 266
    .line 267
    .line 268
    move-object/from16 v2, p1

    .line 269
    .line 270
    move-object v3, v4

    .line 271
    move-wide v4, v5

    .line 272
    move-wide v6, v7

    .line 273
    move-object v8, v10

    .line 274
    move-object/from16 v19, v11

    .line 275
    .line 276
    goto/16 :goto_1a

    .line 277
    .line 278
    :cond_18
    :goto_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 279
    .line 280
    .line 281
    and-int/lit8 v0, v15, 0x1

    .line 282
    .line 283
    const v21, -0x70001

    .line 284
    .line 285
    .line 286
    const v3, -0xe001

    .line 287
    .line 288
    .line 289
    if-eqz v0, :cond_1e

    .line 290
    .line 291
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_19

    .line 296
    .line 297
    goto :goto_14

    .line 298
    :cond_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 299
    .line 300
    .line 301
    and-int/lit8 v0, v12, 0x4

    .line 302
    .line 303
    if-eqz v0, :cond_1a

    .line 304
    .line 305
    and-int/lit16 v1, v1, -0x381

    .line 306
    .line 307
    :cond_1a
    and-int/lit8 v0, v12, 0x8

    .line 308
    .line 309
    if-eqz v0, :cond_1b

    .line 310
    .line 311
    and-int/lit16 v1, v1, -0x1c01

    .line 312
    .line 313
    :cond_1b
    and-int/lit8 v0, v12, 0x10

    .line 314
    .line 315
    if-eqz v0, :cond_1c

    .line 316
    .line 317
    and-int/2addr v1, v3

    .line 318
    :cond_1c
    and-int/lit8 v0, v12, 0x20

    .line 319
    .line 320
    if-eqz v0, :cond_1d

    .line 321
    .line 322
    and-int v1, v1, v21

    .line 323
    .line 324
    :cond_1d
    move-object/from16 v16, p1

    .line 325
    .line 326
    move-object/from16 v23, v4

    .line 327
    .line 328
    move-wide/from16 v26, v5

    .line 329
    .line 330
    move-wide/from16 v24, v7

    .line 331
    .line 332
    :goto_12
    move-object/from16 v22, v9

    .line 333
    .line 334
    :goto_13
    move-object/from16 v21, v10

    .line 335
    .line 336
    goto/16 :goto_19

    .line 337
    .line 338
    :cond_1e
    :goto_14
    if-eqz v2, :cond_1f

    .line 339
    .line 340
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 341
    .line 342
    goto :goto_15

    .line 343
    :cond_1f
    move-object/from16 v0, p1

    .line 344
    .line 345
    :goto_15
    and-int/lit8 v2, v12, 0x4

    .line 346
    .line 347
    const/4 v3, 0x6

    .line 348
    if-eqz v2, :cond_20

    .line 349
    .line 350
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 351
    .line 352
    invoke-virtual {v2, v11, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getLargeShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    and-int/lit16 v1, v1, -0x381

    .line 357
    .line 358
    move-object/from16 v23, v2

    .line 359
    .line 360
    goto :goto_16

    .line 361
    :cond_20
    move-object/from16 v23, v4

    .line 362
    .line 363
    :goto_16
    and-int/lit8 v2, v12, 0x8

    .line 364
    .line 365
    if-eqz v2, :cond_21

    .line 366
    .line 367
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 368
    .line 369
    invoke-virtual {v2, v11, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    and-int/lit16 v1, v1, -0x1c01

    .line 374
    .line 375
    move-wide v5, v2

    .line 376
    :cond_21
    and-int/lit8 v2, v12, 0x10

    .line 377
    .line 378
    if-eqz v2, :cond_22

    .line 379
    .line 380
    shr-int/lit8 v2, v1, 0x9

    .line 381
    .line 382
    and-int/lit8 v2, v2, 0xe

    .line 383
    .line 384
    invoke-static {v5, v6, v11, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 385
    .line 386
    .line 387
    move-result-wide v2

    .line 388
    const v4, -0xe001

    .line 389
    .line 390
    .line 391
    and-int/2addr v1, v4

    .line 392
    move/from16 v22, v1

    .line 393
    .line 394
    move-wide/from16 v24, v2

    .line 395
    .line 396
    goto :goto_17

    .line 397
    :cond_22
    move/from16 v22, v1

    .line 398
    .line 399
    move-wide/from16 v24, v7

    .line 400
    .line 401
    :goto_17
    and-int/lit8 v1, v12, 0x20

    .line 402
    .line 403
    if-eqz v1, :cond_23

    .line 404
    .line 405
    sget-object v1, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 406
    .line 407
    const/4 v2, 0x0

    .line 408
    const/4 v3, 0x0

    .line 409
    const/4 v4, 0x0

    .line 410
    const/4 v7, 0x0

    .line 411
    const/16 v8, 0x6000

    .line 412
    .line 413
    const/16 v10, 0xf

    .line 414
    .line 415
    move-wide/from16 v26, v5

    .line 416
    .line 417
    move v5, v7

    .line 418
    move-object v6, v11

    .line 419
    move v7, v8

    .line 420
    move v8, v10

    .line 421
    invoke-virtual/range {v1 .. v8}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    and-int v2, v22, v21

    .line 426
    .line 427
    move-object v10, v1

    .line 428
    move v1, v2

    .line 429
    goto :goto_18

    .line 430
    :cond_23
    move-wide/from16 v26, v5

    .line 431
    .line 432
    move/from16 v1, v22

    .line 433
    .line 434
    :goto_18
    if-eqz v16, :cond_25

    .line 435
    .line 436
    const v2, -0x1d58f75c

    .line 437
    .line 438
    .line 439
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 447
    .line 448
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    if-ne v2, v3, :cond_24

    .line 453
    .line 454
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    :cond_24
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 462
    .line 463
    .line 464
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 465
    .line 466
    move-object/from16 v16, v0

    .line 467
    .line 468
    move-object/from16 v22, v2

    .line 469
    .line 470
    goto/16 :goto_13

    .line 471
    .line 472
    :cond_25
    move-object/from16 v16, v0

    .line 473
    .line 474
    goto/16 :goto_12

    .line 475
    .line 476
    :goto_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 477
    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-eqz v0, :cond_26

    .line 484
    .line 485
    const/4 v0, -0x1

    .line 486
    const-string v2, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)"

    .line 487
    .line 488
    const v3, -0x62663aa8

    .line 489
    .line 490
    .line 491
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :cond_26
    sget-object v0, Landroidx/compose/material3/tokens/FabPrimaryLargeTokens;->INSTANCE:Landroidx/compose/material3/tokens/FabPrimaryLargeTokens;

    .line 495
    .line 496
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/FabPrimaryLargeTokens;->getContainerWidth-D9Ej5fM()F

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/FabPrimaryLargeTokens;->getContainerHeight-D9Ej5fM()F

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    const/4 v3, 0x0

    .line 505
    const/4 v4, 0x0

    .line 506
    const/16 v5, 0xc

    .line 507
    .line 508
    const/4 v6, 0x0

    .line 509
    move-object/from16 p1, v16

    .line 510
    .line 511
    move/from16 p2, v2

    .line 512
    .line 513
    move/from16 p3, v0

    .line 514
    .line 515
    move/from16 p4, v3

    .line 516
    .line 517
    move/from16 p5, v4

    .line 518
    .line 519
    move/from16 p6, v5

    .line 520
    .line 521
    move-object/from16 p7, v6

    .line 522
    .line 523
    invoke-static/range {p1 .. p7}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    and-int/lit8 v0, v1, 0xe

    .line 528
    .line 529
    and-int/lit16 v3, v1, 0x380

    .line 530
    .line 531
    or-int/2addr v0, v3

    .line 532
    and-int/lit16 v3, v1, 0x1c00

    .line 533
    .line 534
    or-int/2addr v0, v3

    .line 535
    const v3, 0xe000

    .line 536
    .line 537
    .line 538
    and-int/2addr v3, v1

    .line 539
    or-int/2addr v0, v3

    .line 540
    const/high16 v3, 0x70000

    .line 541
    .line 542
    and-int/2addr v3, v1

    .line 543
    or-int/2addr v0, v3

    .line 544
    and-int v3, v1, v17

    .line 545
    .line 546
    or-int/2addr v0, v3

    .line 547
    and-int v1, v1, v20

    .line 548
    .line 549
    or-int v17, v0, v1

    .line 550
    .line 551
    const/16 v18, 0x0

    .line 552
    .line 553
    move-object/from16 v0, p0

    .line 554
    .line 555
    move-object v1, v2

    .line 556
    move-object/from16 v2, v23

    .line 557
    .line 558
    move-wide/from16 v3, v26

    .line 559
    .line 560
    move-wide/from16 v5, v24

    .line 561
    .line 562
    move-object/from16 v7, v21

    .line 563
    .line 564
    move-object/from16 v8, v22

    .line 565
    .line 566
    move-object/from16 v9, p9

    .line 567
    .line 568
    move-object v10, v11

    .line 569
    move-object/from16 v19, v11

    .line 570
    .line 571
    move/from16 v11, v17

    .line 572
    .line 573
    move/from16 v12, v18

    .line 574
    .line 575
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt;->FloatingActionButton-X-z6DiA(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 576
    .line 577
    .line 578
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    if-eqz v0, :cond_27

    .line 583
    .line 584
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 585
    .line 586
    .line 587
    :cond_27
    move-object/from16 v2, v16

    .line 588
    .line 589
    move-object/from16 v8, v21

    .line 590
    .line 591
    move-object/from16 v9, v22

    .line 592
    .line 593
    move-object/from16 v3, v23

    .line 594
    .line 595
    move-wide/from16 v6, v24

    .line 596
    .line 597
    move-wide/from16 v4, v26

    .line 598
    .line 599
    :goto_1a
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 600
    .line 601
    .line 602
    move-result-object v12

    .line 603
    if-nez v12, :cond_28

    .line 604
    .line 605
    goto :goto_1b

    .line 606
    :cond_28
    new-instance v11, Landroidx/compose/material3/FloatingActionButtonKt$LargeFloatingActionButton$2;

    .line 607
    .line 608
    move-object v0, v11

    .line 609
    move-object/from16 v1, p0

    .line 610
    .line 611
    move-object/from16 v10, p9

    .line 612
    .line 613
    move-object v13, v11

    .line 614
    move/from16 v11, p11

    .line 615
    .line 616
    move-object v14, v12

    .line 617
    move/from16 v12, p12

    .line 618
    .line 619
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt$LargeFloatingActionButton$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)V

    .line 620
    .line 621
    .line 622
    invoke-interface {v14, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 623
    .line 624
    .line 625
    :goto_1b
    return-void
.end method

.method public static final SmallFloatingActionButton-X-z6DiA(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lkotlin/jvm/functions/Function2<",
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
    move-object/from16 v13, p0

    .line 2
    .line 3
    move-object/from16 v14, p9

    .line 4
    .line 5
    move/from16 v15, p11

    .line 6
    .line 7
    move/from16 v12, p12

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "content"

    .line 15
    .line 16
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, 0x561d1c0c

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p10

    .line 23
    .line 24
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    and-int/lit8 v1, v12, 0x1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    or-int/lit8 v1, v15, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v1, v15, 0xe

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v1, 0x2

    .line 48
    :goto_0
    or-int/2addr v1, v15

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v15

    .line 51
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    or-int/lit8 v1, v1, 0x30

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    and-int/lit8 v3, v15, 0x70

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    move-object/from16 v3, p1

    .line 63
    .line 64
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    const/16 v4, 0x20

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/16 v4, 0x10

    .line 74
    .line 75
    :goto_2
    or-int/2addr v1, v4

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 78
    .line 79
    :goto_4
    and-int/lit16 v4, v15, 0x380

    .line 80
    .line 81
    if-nez v4, :cond_8

    .line 82
    .line 83
    and-int/lit8 v4, v12, 0x4

    .line 84
    .line 85
    if-nez v4, :cond_6

    .line 86
    .line 87
    move-object/from16 v4, p2

    .line 88
    .line 89
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_7

    .line 94
    .line 95
    const/16 v5, 0x100

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_6
    move-object/from16 v4, p2

    .line 99
    .line 100
    :cond_7
    const/16 v5, 0x80

    .line 101
    .line 102
    :goto_5
    or-int/2addr v1, v5

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    move-object/from16 v4, p2

    .line 105
    .line 106
    :goto_6
    and-int/lit16 v5, v15, 0x1c00

    .line 107
    .line 108
    if-nez v5, :cond_b

    .line 109
    .line 110
    and-int/lit8 v5, v12, 0x8

    .line 111
    .line 112
    if-nez v5, :cond_9

    .line 113
    .line 114
    move-wide/from16 v5, p3

    .line 115
    .line 116
    invoke-interface {v11, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_a

    .line 121
    .line 122
    const/16 v7, 0x800

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_9
    move-wide/from16 v5, p3

    .line 126
    .line 127
    :cond_a
    const/16 v7, 0x400

    .line 128
    .line 129
    :goto_7
    or-int/2addr v1, v7

    .line 130
    goto :goto_8

    .line 131
    :cond_b
    move-wide/from16 v5, p3

    .line 132
    .line 133
    :goto_8
    const v9, 0xe000

    .line 134
    .line 135
    .line 136
    and-int v7, v15, v9

    .line 137
    .line 138
    if-nez v7, :cond_e

    .line 139
    .line 140
    and-int/lit8 v7, v12, 0x10

    .line 141
    .line 142
    if-nez v7, :cond_c

    .line 143
    .line 144
    move-wide/from16 v7, p5

    .line 145
    .line 146
    invoke-interface {v11, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-eqz v10, :cond_d

    .line 151
    .line 152
    const/16 v10, 0x4000

    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_c
    move-wide/from16 v7, p5

    .line 156
    .line 157
    :cond_d
    const/16 v10, 0x2000

    .line 158
    .line 159
    :goto_9
    or-int/2addr v1, v10

    .line 160
    goto :goto_a

    .line 161
    :cond_e
    move-wide/from16 v7, p5

    .line 162
    .line 163
    :goto_a
    const/high16 v10, 0x70000

    .line 164
    .line 165
    and-int v16, v15, v10

    .line 166
    .line 167
    if-nez v16, :cond_10

    .line 168
    .line 169
    and-int/lit8 v16, v12, 0x20

    .line 170
    .line 171
    move-object/from16 v10, p7

    .line 172
    .line 173
    if-nez v16, :cond_f

    .line 174
    .line 175
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v16

    .line 179
    if-eqz v16, :cond_f

    .line 180
    .line 181
    const/high16 v16, 0x20000

    .line 182
    .line 183
    goto :goto_b

    .line 184
    :cond_f
    const/high16 v16, 0x10000

    .line 185
    .line 186
    :goto_b
    or-int v1, v1, v16

    .line 187
    .line 188
    goto :goto_c

    .line 189
    :cond_10
    move-object/from16 v10, p7

    .line 190
    .line 191
    :goto_c
    and-int/lit8 v16, v12, 0x40

    .line 192
    .line 193
    const/high16 v17, 0x380000

    .line 194
    .line 195
    if-eqz v16, :cond_11

    .line 196
    .line 197
    const/high16 v18, 0x180000

    .line 198
    .line 199
    or-int v1, v1, v18

    .line 200
    .line 201
    move-object/from16 v9, p8

    .line 202
    .line 203
    goto :goto_e

    .line 204
    :cond_11
    and-int v18, v15, v17

    .line 205
    .line 206
    move-object/from16 v9, p8

    .line 207
    .line 208
    if-nez v18, :cond_13

    .line 209
    .line 210
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v19

    .line 214
    if-eqz v19, :cond_12

    .line 215
    .line 216
    const/high16 v19, 0x100000

    .line 217
    .line 218
    goto :goto_d

    .line 219
    :cond_12
    const/high16 v19, 0x80000

    .line 220
    .line 221
    :goto_d
    or-int v1, v1, v19

    .line 222
    .line 223
    :cond_13
    :goto_e
    and-int/lit16 v0, v12, 0x80

    .line 224
    .line 225
    const/high16 v20, 0x1c00000

    .line 226
    .line 227
    if-eqz v0, :cond_14

    .line 228
    .line 229
    const/high16 v0, 0xc00000

    .line 230
    .line 231
    :goto_f
    or-int/2addr v1, v0

    .line 232
    goto :goto_10

    .line 233
    :cond_14
    and-int v0, v15, v20

    .line 234
    .line 235
    if-nez v0, :cond_16

    .line 236
    .line 237
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_15

    .line 242
    .line 243
    const/high16 v0, 0x800000

    .line 244
    .line 245
    goto :goto_f

    .line 246
    :cond_15
    const/high16 v0, 0x400000

    .line 247
    .line 248
    goto :goto_f

    .line 249
    :cond_16
    :goto_10
    const v0, 0x16db6db

    .line 250
    .line 251
    .line 252
    and-int/2addr v0, v1

    .line 253
    const v3, 0x492492

    .line 254
    .line 255
    .line 256
    if-ne v0, v3, :cond_18

    .line 257
    .line 258
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-nez v0, :cond_17

    .line 263
    .line 264
    goto :goto_11

    .line 265
    :cond_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 266
    .line 267
    .line 268
    move-object/from16 v2, p1

    .line 269
    .line 270
    move-object v3, v4

    .line 271
    move-wide v4, v5

    .line 272
    move-wide v6, v7

    .line 273
    move-object v8, v10

    .line 274
    move-object/from16 v19, v11

    .line 275
    .line 276
    goto/16 :goto_1a

    .line 277
    .line 278
    :cond_18
    :goto_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 279
    .line 280
    .line 281
    and-int/lit8 v0, v15, 0x1

    .line 282
    .line 283
    const v21, -0x70001

    .line 284
    .line 285
    .line 286
    const v3, -0xe001

    .line 287
    .line 288
    .line 289
    if-eqz v0, :cond_1e

    .line 290
    .line 291
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_19

    .line 296
    .line 297
    goto :goto_14

    .line 298
    :cond_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 299
    .line 300
    .line 301
    and-int/lit8 v0, v12, 0x4

    .line 302
    .line 303
    if-eqz v0, :cond_1a

    .line 304
    .line 305
    and-int/lit16 v1, v1, -0x381

    .line 306
    .line 307
    :cond_1a
    and-int/lit8 v0, v12, 0x8

    .line 308
    .line 309
    if-eqz v0, :cond_1b

    .line 310
    .line 311
    and-int/lit16 v1, v1, -0x1c01

    .line 312
    .line 313
    :cond_1b
    and-int/lit8 v0, v12, 0x10

    .line 314
    .line 315
    if-eqz v0, :cond_1c

    .line 316
    .line 317
    and-int/2addr v1, v3

    .line 318
    :cond_1c
    and-int/lit8 v0, v12, 0x20

    .line 319
    .line 320
    if-eqz v0, :cond_1d

    .line 321
    .line 322
    and-int v1, v1, v21

    .line 323
    .line 324
    :cond_1d
    move-object/from16 v16, p1

    .line 325
    .line 326
    move-object/from16 v23, v4

    .line 327
    .line 328
    move-wide/from16 v26, v5

    .line 329
    .line 330
    move-wide/from16 v24, v7

    .line 331
    .line 332
    :goto_12
    move-object/from16 v22, v9

    .line 333
    .line 334
    :goto_13
    move-object/from16 v21, v10

    .line 335
    .line 336
    goto/16 :goto_19

    .line 337
    .line 338
    :cond_1e
    :goto_14
    if-eqz v2, :cond_1f

    .line 339
    .line 340
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 341
    .line 342
    goto :goto_15

    .line 343
    :cond_1f
    move-object/from16 v0, p1

    .line 344
    .line 345
    :goto_15
    and-int/lit8 v2, v12, 0x4

    .line 346
    .line 347
    const/4 v3, 0x6

    .line 348
    if-eqz v2, :cond_20

    .line 349
    .line 350
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 351
    .line 352
    invoke-virtual {v2, v11, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getSmallShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    and-int/lit16 v1, v1, -0x381

    .line 357
    .line 358
    move-object/from16 v23, v2

    .line 359
    .line 360
    goto :goto_16

    .line 361
    :cond_20
    move-object/from16 v23, v4

    .line 362
    .line 363
    :goto_16
    and-int/lit8 v2, v12, 0x8

    .line 364
    .line 365
    if-eqz v2, :cond_21

    .line 366
    .line 367
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 368
    .line 369
    invoke-virtual {v2, v11, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    and-int/lit16 v1, v1, -0x1c01

    .line 374
    .line 375
    move-wide v5, v2

    .line 376
    :cond_21
    and-int/lit8 v2, v12, 0x10

    .line 377
    .line 378
    if-eqz v2, :cond_22

    .line 379
    .line 380
    shr-int/lit8 v2, v1, 0x9

    .line 381
    .line 382
    and-int/lit8 v2, v2, 0xe

    .line 383
    .line 384
    invoke-static {v5, v6, v11, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 385
    .line 386
    .line 387
    move-result-wide v2

    .line 388
    const v4, -0xe001

    .line 389
    .line 390
    .line 391
    and-int/2addr v1, v4

    .line 392
    move/from16 v22, v1

    .line 393
    .line 394
    move-wide/from16 v24, v2

    .line 395
    .line 396
    goto :goto_17

    .line 397
    :cond_22
    move/from16 v22, v1

    .line 398
    .line 399
    move-wide/from16 v24, v7

    .line 400
    .line 401
    :goto_17
    and-int/lit8 v1, v12, 0x20

    .line 402
    .line 403
    if-eqz v1, :cond_23

    .line 404
    .line 405
    sget-object v1, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 406
    .line 407
    const/4 v2, 0x0

    .line 408
    const/4 v3, 0x0

    .line 409
    const/4 v4, 0x0

    .line 410
    const/4 v7, 0x0

    .line 411
    const/16 v8, 0x6000

    .line 412
    .line 413
    const/16 v10, 0xf

    .line 414
    .line 415
    move-wide/from16 v26, v5

    .line 416
    .line 417
    move v5, v7

    .line 418
    move-object v6, v11

    .line 419
    move v7, v8

    .line 420
    move v8, v10

    .line 421
    invoke-virtual/range {v1 .. v8}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    and-int v2, v22, v21

    .line 426
    .line 427
    move-object v10, v1

    .line 428
    move v1, v2

    .line 429
    goto :goto_18

    .line 430
    :cond_23
    move-wide/from16 v26, v5

    .line 431
    .line 432
    move/from16 v1, v22

    .line 433
    .line 434
    :goto_18
    if-eqz v16, :cond_25

    .line 435
    .line 436
    const v2, -0x1d58f75c

    .line 437
    .line 438
    .line 439
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 447
    .line 448
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    if-ne v2, v3, :cond_24

    .line 453
    .line 454
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    :cond_24
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 462
    .line 463
    .line 464
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 465
    .line 466
    move-object/from16 v16, v0

    .line 467
    .line 468
    move-object/from16 v22, v2

    .line 469
    .line 470
    goto/16 :goto_13

    .line 471
    .line 472
    :cond_25
    move-object/from16 v16, v0

    .line 473
    .line 474
    goto/16 :goto_12

    .line 475
    .line 476
    :goto_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 477
    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-eqz v0, :cond_26

    .line 484
    .line 485
    const/4 v0, -0x1

    .line 486
    const-string v2, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)"

    .line 487
    .line 488
    const v3, 0x561d1c0c

    .line 489
    .line 490
    .line 491
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :cond_26
    sget-object v0, Landroidx/compose/material3/tokens/FabPrimarySmallTokens;->INSTANCE:Landroidx/compose/material3/tokens/FabPrimarySmallTokens;

    .line 495
    .line 496
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/FabPrimarySmallTokens;->getContainerWidth-D9Ej5fM()F

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/FabPrimarySmallTokens;->getContainerHeight-D9Ej5fM()F

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    const/4 v3, 0x0

    .line 505
    const/4 v4, 0x0

    .line 506
    const/16 v5, 0xc

    .line 507
    .line 508
    const/4 v6, 0x0

    .line 509
    move-object/from16 p1, v16

    .line 510
    .line 511
    move/from16 p2, v2

    .line 512
    .line 513
    move/from16 p3, v0

    .line 514
    .line 515
    move/from16 p4, v3

    .line 516
    .line 517
    move/from16 p5, v4

    .line 518
    .line 519
    move/from16 p6, v5

    .line 520
    .line 521
    move-object/from16 p7, v6

    .line 522
    .line 523
    invoke-static/range {p1 .. p7}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    and-int/lit8 v0, v1, 0xe

    .line 528
    .line 529
    and-int/lit16 v3, v1, 0x380

    .line 530
    .line 531
    or-int/2addr v0, v3

    .line 532
    and-int/lit16 v3, v1, 0x1c00

    .line 533
    .line 534
    or-int/2addr v0, v3

    .line 535
    const v3, 0xe000

    .line 536
    .line 537
    .line 538
    and-int/2addr v3, v1

    .line 539
    or-int/2addr v0, v3

    .line 540
    const/high16 v3, 0x70000

    .line 541
    .line 542
    and-int/2addr v3, v1

    .line 543
    or-int/2addr v0, v3

    .line 544
    and-int v3, v1, v17

    .line 545
    .line 546
    or-int/2addr v0, v3

    .line 547
    and-int v1, v1, v20

    .line 548
    .line 549
    or-int v17, v0, v1

    .line 550
    .line 551
    const/16 v18, 0x0

    .line 552
    .line 553
    move-object/from16 v0, p0

    .line 554
    .line 555
    move-object v1, v2

    .line 556
    move-object/from16 v2, v23

    .line 557
    .line 558
    move-wide/from16 v3, v26

    .line 559
    .line 560
    move-wide/from16 v5, v24

    .line 561
    .line 562
    move-object/from16 v7, v21

    .line 563
    .line 564
    move-object/from16 v8, v22

    .line 565
    .line 566
    move-object/from16 v9, p9

    .line 567
    .line 568
    move-object v10, v11

    .line 569
    move-object/from16 v19, v11

    .line 570
    .line 571
    move/from16 v11, v17

    .line 572
    .line 573
    move/from16 v12, v18

    .line 574
    .line 575
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt;->FloatingActionButton-X-z6DiA(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 576
    .line 577
    .line 578
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    if-eqz v0, :cond_27

    .line 583
    .line 584
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 585
    .line 586
    .line 587
    :cond_27
    move-object/from16 v2, v16

    .line 588
    .line 589
    move-object/from16 v8, v21

    .line 590
    .line 591
    move-object/from16 v9, v22

    .line 592
    .line 593
    move-object/from16 v3, v23

    .line 594
    .line 595
    move-wide/from16 v6, v24

    .line 596
    .line 597
    move-wide/from16 v4, v26

    .line 598
    .line 599
    :goto_1a
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 600
    .line 601
    .line 602
    move-result-object v12

    .line 603
    if-nez v12, :cond_28

    .line 604
    .line 605
    goto :goto_1b

    .line 606
    :cond_28
    new-instance v11, Landroidx/compose/material3/FloatingActionButtonKt$SmallFloatingActionButton$2;

    .line 607
    .line 608
    move-object v0, v11

    .line 609
    move-object/from16 v1, p0

    .line 610
    .line 611
    move-object/from16 v10, p9

    .line 612
    .line 613
    move-object v13, v11

    .line 614
    move/from16 v11, p11

    .line 615
    .line 616
    move-object v14, v12

    .line 617
    move/from16 v12, p12

    .line 618
    .line 619
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt$SmallFloatingActionButton$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)V

    .line 620
    .line 621
    .line 622
    invoke-interface {v14, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 623
    .line 624
    .line 625
    :goto_1b
    return-void
.end method

.method public static final synthetic access$getExtendedFabCollapseAnimation$p()Landroidx/compose/animation/ExitTransition;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabCollapseAnimation:Landroidx/compose/animation/ExitTransition;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getExtendedFabEndIconPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabEndIconPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getExtendedFabExpandAnimation$p()Landroidx/compose/animation/EnterTransition;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabExpandAnimation:Landroidx/compose/animation/EnterTransition;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getExtendedFabMinimumWidth$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabMinimumWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getExtendedFabStartIconPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabStartIconPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getExtendedFabTextPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabTextPadding:F

    .line 2
    .line 3
    return v0
.end method
