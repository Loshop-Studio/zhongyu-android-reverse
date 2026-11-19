.class public final Landroidx/compose/material3/ProgressIndicatorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a3\u0010\"\u001a\u00020#2\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\'2\u0008\u0008\u0002\u0010(\u001a\u00020\u0005H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a;\u0010\"\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00012\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\'2\u0008\u0008\u0002\u0010(\u001a\u00020\u0005H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010-\u001a3\u0010.\u001a\u00020#2\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\'2\u0008\u0008\u0002\u0010/\u001a\u00020\'H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u00101\u001a;\u0010.\u001a\u00020#2\u0006\u0010+\u001a\u00020\u00012\u0008\u0008\u0002\u0010$\u001a\u00020%2\u0008\u0008\u0002\u0010&\u001a\u00020\'2\u0008\u0008\u0002\u0010/\u001a\u00020\'H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00082\u00103\u001a9\u00104\u001a\u00020#*\u0002052\u0006\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\'2\u0006\u00108\u001a\u000209H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008:\u0010;\u001a9\u0010<\u001a\u00020#*\u0002052\u0006\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\'2\u0006\u00108\u001a\u000209H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008=\u0010;\u001aA\u0010>\u001a\u00020#*\u0002052\u0006\u00106\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\'2\u0006\u00108\u001a\u000209H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008?\u0010@\u001a9\u0010A\u001a\u00020#*\u0002052\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0001H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u0010E\u001a)\u0010F\u001a\u00020#*\u0002052\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0001H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008G\u0010H\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\"\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0014\u001a\u00020\u0005X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0015\u0010\u0007\"\u0019\u0010\u0016\u001a\u00020\u0005X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0017\u0010\u0007\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006I"
    }
    d2 = {
        "BaseRotationAngle",
        "",
        "CircularEasing",
        "Landroidx/compose/animation/core/CubicBezierEasing;",
        "CircularIndicatorDiameter",
        "Landroidx/compose/ui/unit/Dp;",
        "getCircularIndicatorDiameter",
        "()F",
        "F",
        "FirstLineHeadDelay",
        "",
        "FirstLineHeadDuration",
        "FirstLineHeadEasing",
        "FirstLineTailDelay",
        "FirstLineTailDuration",
        "FirstLineTailEasing",
        "HeadAndTailAnimationDuration",
        "HeadAndTailDelayDuration",
        "JumpRotationAngle",
        "LinearAnimationDuration",
        "LinearIndicatorHeight",
        "getLinearIndicatorHeight",
        "LinearIndicatorWidth",
        "getLinearIndicatorWidth",
        "RotationAngleOffset",
        "RotationDuration",
        "RotationsPerCycle",
        "SecondLineHeadDelay",
        "SecondLineHeadDuration",
        "SecondLineHeadEasing",
        "SecondLineTailDelay",
        "SecondLineTailDuration",
        "SecondLineTailEasing",
        "StartAngleOffset",
        "CircularProgressIndicator",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "color",
        "Landroidx/compose/ui/graphics/Color;",
        "strokeWidth",
        "CircularProgressIndicator-aM-cp0Q",
        "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V",
        "progress",
        "CircularProgressIndicator-MBs18nI",
        "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V",
        "LinearProgressIndicator",
        "trackColor",
        "LinearProgressIndicator-RIQooxk",
        "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V",
        "LinearProgressIndicator-eaDK9VM",
        "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V",
        "drawCircularIndicator",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "startAngle",
        "sweep",
        "stroke",
        "Landroidx/compose/ui/graphics/drawscope/Stroke;",
        "drawCircularIndicator-42QJj7c",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V",
        "drawDeterminateCircularIndicator",
        "drawDeterminateCircularIndicator-42QJj7c",
        "drawIndeterminateCircularIndicator",
        "drawIndeterminateCircularIndicator-hrjfTZI",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V",
        "drawLinearIndicator",
        "startFraction",
        "endFraction",
        "drawLinearIndicator-42QJj7c",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V",
        "drawLinearIndicatorTrack",
        "drawLinearIndicatorTrack-bw27NRU",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V",
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
.field private static final BaseRotationAngle:F = 286.0f

.field private static final CircularEasing:Landroidx/compose/animation/core/CubicBezierEasing;

.field private static final CircularIndicatorDiameter:F

.field private static final FirstLineHeadDelay:I = 0x0

.field private static final FirstLineHeadDuration:I = 0x2ee

.field private static final FirstLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

.field private static final FirstLineTailDelay:I = 0x14d

.field private static final FirstLineTailDuration:I = 0x352

.field private static final FirstLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

.field private static final HeadAndTailAnimationDuration:I = 0x29a

.field private static final HeadAndTailDelayDuration:I = 0x29a

.field private static final JumpRotationAngle:F = 290.0f

.field private static final LinearAnimationDuration:I = 0x708

.field private static final LinearIndicatorHeight:F

.field private static final LinearIndicatorWidth:F

.field private static final RotationAngleOffset:F = 216.0f

.field private static final RotationDuration:I = 0x534

.field private static final RotationsPerCycle:I = 0x5

.field private static final SecondLineHeadDelay:I = 0x3e8

.field private static final SecondLineHeadDuration:I = 0x237

.field private static final SecondLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

.field private static final SecondLineTailDelay:I = 0x4f3

.field private static final SecondLineTailDuration:I = 0x215

.field private static final SecondLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

.field private static final StartAngleOffset:F = -90.0f


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0xf0

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
    sput v0, Landroidx/compose/material3/ProgressIndicatorKt;->LinearIndicatorWidth:F

    .line 9
    .line 10
    sget-object v0, Landroidx/compose/material3/tokens/LinearProgressIndicatorTokens;->INSTANCE:Landroidx/compose/material3/tokens/LinearProgressIndicatorTokens;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/LinearProgressIndicatorTokens;->getTrackHeight-D9Ej5fM()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sput v0, Landroidx/compose/material3/ProgressIndicatorKt;->LinearIndicatorHeight:F

    .line 17
    .line 18
    sget-object v0, Landroidx/compose/material3/tokens/CircularProgressIndicatorTokens;->INSTANCE:Landroidx/compose/material3/tokens/CircularProgressIndicatorTokens;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/CircularProgressIndicatorTokens;->getSize-D9Ej5fM()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/CircularProgressIndicatorTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v2, 0x2

    .line 29
    int-to-float v2, v2

    .line 30
    mul-float/2addr v0, v2

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sub-float/2addr v1, v0

    .line 36
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sput v0, Landroidx/compose/material3/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 41
    .line 42
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 43
    .line 44
    const v1, 0x3e4ccccd    # 0.2f

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    const v3, 0x3f4ccccd    # 0.8f

    .line 49
    .line 50
    .line 51
    const/high16 v4, 0x3f800000    # 1.0f

    .line 52
    .line 53
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->FirstLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 57
    .line 58
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 59
    .line 60
    const v3, 0x3ecccccd    # 0.4f

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v3, v2, v4, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->FirstLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 67
    .line 68
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 69
    .line 70
    const v5, 0x3f266666    # 0.65f

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v2, v2, v5, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 74
    .line 75
    .line 76
    sput-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->SecondLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 77
    .line 78
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 79
    .line 80
    const v5, 0x3dcccccd    # 0.1f

    .line 81
    .line 82
    .line 83
    const v6, 0x3ee66666    # 0.45f

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v5, v2, v6, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->SecondLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 90
    .line 91
    new-instance v0, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 92
    .line 93
    invoke-direct {v0, v3, v2, v1, v4}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 94
    .line 95
    .line 96
    sput-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->CircularEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 97
    .line 98
    return-void
.end method

.method public static final CircularProgressIndicator-MBs18nI(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p6

    .line 4
    .line 5
    const v0, 0x1802de6c

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p5

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    and-int/lit8 v1, p7, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    or-int/lit8 v1, v7, 0x6

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v1, v7, 0xe

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x2

    .line 34
    :goto_0
    or-int/2addr v1, v7

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v1, v7

    .line 37
    :goto_1
    and-int/lit8 v2, p7, 0x2

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    or-int/lit8 v1, v1, 0x30

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    and-int/lit8 v3, v7, 0x70

    .line 45
    .line 46
    if-nez v3, :cond_5

    .line 47
    .line 48
    move-object/from16 v3, p1

    .line 49
    .line 50
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    const/16 v4, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const/16 v4, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v1, v4

    .line 62
    goto :goto_4

    .line 63
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 64
    .line 65
    :goto_4
    and-int/lit16 v4, v7, 0x380

    .line 66
    .line 67
    if-nez v4, :cond_8

    .line 68
    .line 69
    and-int/lit8 v4, p7, 0x4

    .line 70
    .line 71
    if-nez v4, :cond_6

    .line 72
    .line 73
    move-wide/from16 v4, p2

    .line 74
    .line 75
    invoke-interface {v8, v4, v5}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_7

    .line 80
    .line 81
    const/16 v9, 0x100

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_6
    move-wide/from16 v4, p2

    .line 85
    .line 86
    :cond_7
    const/16 v9, 0x80

    .line 87
    .line 88
    :goto_5
    or-int/2addr v1, v9

    .line 89
    goto :goto_6

    .line 90
    :cond_8
    move-wide/from16 v4, p2

    .line 91
    .line 92
    :goto_6
    and-int/lit8 v9, p7, 0x8

    .line 93
    .line 94
    if-eqz v9, :cond_9

    .line 95
    .line 96
    or-int/lit16 v1, v1, 0xc00

    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_9
    and-int/lit16 v10, v7, 0x1c00

    .line 100
    .line 101
    if-nez v10, :cond_b

    .line 102
    .line 103
    move/from16 v10, p4

    .line 104
    .line 105
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    if-eqz v11, :cond_a

    .line 110
    .line 111
    const/16 v11, 0x800

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_a
    const/16 v11, 0x400

    .line 115
    .line 116
    :goto_7
    or-int/2addr v1, v11

    .line 117
    goto :goto_9

    .line 118
    :cond_b
    :goto_8
    move/from16 v10, p4

    .line 119
    .line 120
    :goto_9
    and-int/lit16 v1, v1, 0x16db

    .line 121
    .line 122
    const/16 v11, 0x492

    .line 123
    .line 124
    if-ne v1, v11, :cond_d

    .line 125
    .line 126
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_c

    .line 131
    .line 132
    goto :goto_a

    .line 133
    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 134
    .line 135
    .line 136
    move-object v2, v3

    .line 137
    move-wide v3, v4

    .line 138
    move v5, v10

    .line 139
    goto/16 :goto_f

    .line 140
    .line 141
    :cond_d
    :goto_a
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 142
    .line 143
    .line 144
    and-int/lit8 v1, v7, 0x1

    .line 145
    .line 146
    if-eqz v1, :cond_f

    .line 147
    .line 148
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_e

    .line 153
    .line 154
    goto :goto_b

    .line 155
    :cond_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 156
    .line 157
    .line 158
    move-object v9, v3

    .line 159
    move v12, v10

    .line 160
    move-wide v10, v4

    .line 161
    goto :goto_e

    .line 162
    :cond_f
    :goto_b
    if-eqz v2, :cond_10

    .line 163
    .line 164
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 165
    .line 166
    goto :goto_c

    .line 167
    :cond_10
    move-object v1, v3

    .line 168
    :goto_c
    and-int/lit8 v2, p7, 0x4

    .line 169
    .line 170
    if-eqz v2, :cond_11

    .line 171
    .line 172
    sget-object v2, Landroidx/compose/material3/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorDefaults;

    .line 173
    .line 174
    const/4 v3, 0x6

    .line 175
    invoke-virtual {v2, v8, v3}, Landroidx/compose/material3/ProgressIndicatorDefaults;->getCircularColor(Landroidx/compose/runtime/Composer;I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v2

    .line 179
    goto :goto_d

    .line 180
    :cond_11
    move-wide v2, v4

    .line 181
    :goto_d
    if-eqz v9, :cond_12

    .line 182
    .line 183
    sget-object v4, Landroidx/compose/material3/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorDefaults;

    .line 184
    .line 185
    invoke-virtual {v4}, Landroidx/compose/material3/ProgressIndicatorDefaults;->getCircularStrokeWidth-D9Ej5fM()F

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    move-object v9, v1

    .line 190
    move-wide v10, v2

    .line 191
    move v12, v4

    .line 192
    goto :goto_e

    .line 193
    :cond_12
    move-object v9, v1

    .line 194
    move v12, v10

    .line 195
    move-wide v10, v2

    .line 196
    :goto_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 197
    .line 198
    .line 199
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_13

    .line 204
    .line 205
    const/4 v1, -0x1

    .line 206
    const-string v2, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:226)"

    .line 207
    .line 208
    invoke-static {v0, v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :cond_13
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 220
    .line 221
    new-instance v5, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 222
    .line 223
    invoke-interface {v0, v12}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    const/4 v15, 0x0

    .line 228
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 229
    .line 230
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 231
    .line 232
    .line 233
    move-result v16

    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    const/16 v18, 0x0

    .line 237
    .line 238
    const/16 v19, 0x1a

    .line 239
    .line 240
    const/16 v20, 0x0

    .line 241
    .line 242
    move-object v13, v5

    .line 243
    invoke-direct/range {v13 .. v20}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    .line 245
    .line 246
    const/4 v2, 0x0

    .line 247
    const/4 v3, 0x0

    .line 248
    const/4 v4, 0x6

    .line 249
    const/4 v13, 0x0

    .line 250
    move-object v0, v9

    .line 251
    move/from16 v1, p0

    .line 252
    .line 253
    move-object v14, v5

    .line 254
    move-object v5, v13

    .line 255
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics$default(Landroidx/compose/ui/Modifier;FLkotlin/ranges/ClosedFloatingPointRange;IILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sget v1, Landroidx/compose/material3/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 260
    .line 261
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    new-instance v1, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$1;

    .line 266
    .line 267
    invoke-direct {v1, v6, v10, v11, v14}, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$1;-><init>(FJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    .line 268
    .line 269
    .line 270
    const/4 v2, 0x0

    .line 271
    invoke-static {v0, v1, v8, v2}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 272
    .line 273
    .line 274
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_14

    .line 279
    .line 280
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 281
    .line 282
    .line 283
    :cond_14
    move-object v2, v9

    .line 284
    move-wide v3, v10

    .line 285
    move v5, v12

    .line 286
    :goto_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    if-nez v8, :cond_15

    .line 291
    .line 292
    goto :goto_10

    .line 293
    :cond_15
    new-instance v9, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$2;

    .line 294
    .line 295
    move-object v0, v9

    .line 296
    move/from16 v1, p0

    .line 297
    .line 298
    move/from16 v6, p6

    .line 299
    .line 300
    move/from16 v7, p7

    .line 301
    .line 302
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$2;-><init>(FLandroidx/compose/ui/Modifier;JFII)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 306
    .line 307
    .line 308
    :goto_10
    return-void
.end method

.method public static final CircularProgressIndicator-aM-cp0Q(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v5, p5

    .line 2
    .line 3
    const v0, 0x3875079c

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p4

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p6, 0x1

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    or-int/lit8 v4, v5, 0x6

    .line 18
    .line 19
    move v6, v4

    .line 20
    move-object/from16 v4, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v4, v5, 0xe

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    move-object/from16 v4, p0

    .line 28
    .line 29
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    const/4 v6, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v6, v3

    .line 38
    :goto_0
    or-int/2addr v6, v5

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object/from16 v4, p0

    .line 41
    .line 42
    move v6, v5

    .line 43
    :goto_1
    and-int/lit8 v7, v5, 0x70

    .line 44
    .line 45
    if-nez v7, :cond_5

    .line 46
    .line 47
    and-int/lit8 v7, p6, 0x2

    .line 48
    .line 49
    if-nez v7, :cond_3

    .line 50
    .line 51
    move-wide/from16 v7, p1

    .line 52
    .line 53
    invoke-interface {v1, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_4

    .line 58
    .line 59
    const/16 v9, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move-wide/from16 v7, p1

    .line 63
    .line 64
    :cond_4
    const/16 v9, 0x10

    .line 65
    .line 66
    :goto_2
    or-int/2addr v6, v9

    .line 67
    goto :goto_3

    .line 68
    :cond_5
    move-wide/from16 v7, p1

    .line 69
    .line 70
    :goto_3
    and-int/lit8 v9, p6, 0x4

    .line 71
    .line 72
    if-eqz v9, :cond_6

    .line 73
    .line 74
    or-int/lit16 v6, v6, 0x180

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_6
    and-int/lit16 v10, v5, 0x380

    .line 78
    .line 79
    if-nez v10, :cond_8

    .line 80
    .line 81
    move/from16 v10, p3

    .line 82
    .line 83
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    if-eqz v11, :cond_7

    .line 88
    .line 89
    const/16 v11, 0x100

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    const/16 v11, 0x80

    .line 93
    .line 94
    :goto_4
    or-int/2addr v6, v11

    .line 95
    goto :goto_6

    .line 96
    :cond_8
    :goto_5
    move/from16 v10, p3

    .line 97
    .line 98
    :goto_6
    and-int/lit16 v6, v6, 0x2db

    .line 99
    .line 100
    const/16 v11, 0x92

    .line 101
    .line 102
    if-ne v6, v11, :cond_a

    .line 103
    .line 104
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-nez v6, :cond_9

    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 112
    .line 113
    .line 114
    move-object v2, v4

    .line 115
    move-wide v15, v7

    .line 116
    move v4, v10

    .line 117
    goto/16 :goto_d

    .line 118
    .line 119
    :cond_a
    :goto_7
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 120
    .line 121
    .line 122
    and-int/lit8 v6, v5, 0x1

    .line 123
    .line 124
    if-eqz v6, :cond_c

    .line 125
    .line 126
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_b

    .line 131
    .line 132
    goto :goto_9

    .line 133
    :cond_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 134
    .line 135
    .line 136
    move-object v2, v4

    .line 137
    move-wide v15, v7

    .line 138
    :goto_8
    move v4, v10

    .line 139
    goto :goto_c

    .line 140
    :cond_c
    :goto_9
    if-eqz v2, :cond_d

    .line 141
    .line 142
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 143
    .line 144
    goto :goto_a

    .line 145
    :cond_d
    move-object v2, v4

    .line 146
    :goto_a
    and-int/lit8 v4, p6, 0x2

    .line 147
    .line 148
    if-eqz v4, :cond_e

    .line 149
    .line 150
    sget-object v4, Landroidx/compose/material3/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorDefaults;

    .line 151
    .line 152
    const/4 v6, 0x6

    .line 153
    invoke-virtual {v4, v1, v6}, Landroidx/compose/material3/ProgressIndicatorDefaults;->getCircularColor(Landroidx/compose/runtime/Composer;I)J

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    goto :goto_b

    .line 158
    :cond_e
    move-wide v6, v7

    .line 159
    :goto_b
    if-eqz v9, :cond_f

    .line 160
    .line 161
    sget-object v4, Landroidx/compose/material3/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorDefaults;

    .line 162
    .line 163
    invoke-virtual {v4}, Landroidx/compose/material3/ProgressIndicatorDefaults;->getCircularStrokeWidth-D9Ej5fM()F

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    move-wide v15, v6

    .line 168
    goto :goto_c

    .line 169
    :cond_f
    move-wide v15, v6

    .line 170
    goto :goto_8

    .line 171
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 172
    .line 173
    .line 174
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-eqz v6, :cond_10

    .line 179
    .line 180
    const/4 v6, -0x1

    .line 181
    const-string v7, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:261)"

    .line 182
    .line 183
    invoke-static {v0, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :cond_10
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 195
    .line 196
    new-instance v14, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 197
    .line 198
    invoke-interface {v0, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    const/4 v8, 0x0

    .line 203
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getSquare-KaPHkGw()I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    const/4 v10, 0x0

    .line 210
    const/4 v11, 0x0

    .line 211
    const/16 v12, 0x1a

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    move-object v6, v14

    .line 215
    invoke-direct/range {v6 .. v13}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 216
    .line 217
    .line 218
    const/4 v0, 0x0

    .line 219
    invoke-static {v1, v0}, Landroidx/compose/animation/core/InfiniteTransitionKt;->rememberInfiniteTransition(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    const/4 v6, 0x5

    .line 228
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    sget-object v6, Lkotlin/jvm/internal/IntCompanionObject;->INSTANCE:Lkotlin/jvm/internal/IntCompanionObject;

    .line 233
    .line 234
    invoke-static {v6}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    const/16 v6, 0x1a04

    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    const/4 v12, 0x0

    .line 245
    invoke-static {v6, v0, v10, v3, v12}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 246
    .line 247
    .line 248
    move-result-object v17

    .line 249
    const/16 v18, 0x0

    .line 250
    .line 251
    const-wide/16 v19, 0x0

    .line 252
    .line 253
    const/16 v21, 0x6

    .line 254
    .line 255
    const/16 v22, 0x0

    .line 256
    .line 257
    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    sget v11, Landroidx/compose/animation/core/InfiniteTransition;->$stable:I

    .line 262
    .line 263
    or-int/lit16 v6, v11, 0x11b0

    .line 264
    .line 265
    sget v17, Landroidx/compose/animation/core/InfiniteRepeatableSpec;->$stable:I

    .line 266
    .line 267
    shl-int/lit8 v18, v17, 0xc

    .line 268
    .line 269
    or-int v18, v6, v18

    .line 270
    .line 271
    move-object v6, v13

    .line 272
    move/from16 v23, v11

    .line 273
    .line 274
    move-object v11, v1

    .line 275
    move-object v5, v12

    .line 276
    move/from16 v12, v18

    .line 277
    .line 278
    invoke-static/range {v6 .. v12}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateValue(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    const/4 v7, 0x0

    .line 283
    const/high16 v8, 0x438f0000    # 286.0f

    .line 284
    .line 285
    const/16 v6, 0x534

    .line 286
    .line 287
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-static {v6, v0, v9, v3, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 292
    .line 293
    .line 294
    move-result-object v24

    .line 295
    const/16 v25, 0x0

    .line 296
    .line 297
    const-wide/16 v26, 0x0

    .line 298
    .line 299
    const/16 v28, 0x6

    .line 300
    .line 301
    const/16 v29, 0x0

    .line 302
    .line 303
    invoke-static/range {v24 .. v29}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    move/from16 v3, v23

    .line 308
    .line 309
    or-int/lit16 v5, v3, 0x1b0

    .line 310
    .line 311
    shl-int/lit8 v6, v17, 0x9

    .line 312
    .line 313
    or-int v11, v5, v6

    .line 314
    .line 315
    move-object v6, v13

    .line 316
    move-object v10, v1

    .line 317
    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    const/high16 v8, 0x43910000    # 290.0f

    .line 322
    .line 323
    sget-object v6, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$endAngle$1;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$endAngle$1;

    .line 324
    .line 325
    invoke-static {v6}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 326
    .line 327
    .line 328
    move-result-object v18

    .line 329
    const/16 v19, 0x0

    .line 330
    .line 331
    const-wide/16 v20, 0x0

    .line 332
    .line 333
    const/16 v22, 0x6

    .line 334
    .line 335
    const/16 v23, 0x0

    .line 336
    .line 337
    invoke-static/range {v18 .. v23}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 338
    .line 339
    .line 340
    move-result-object v9

    .line 341
    or-int/lit16 v6, v3, 0x1b0

    .line 342
    .line 343
    shl-int/lit8 v10, v17, 0x9

    .line 344
    .line 345
    or-int v11, v6, v10

    .line 346
    .line 347
    move-object v6, v13

    .line 348
    move-object v10, v1

    .line 349
    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 350
    .line 351
    .line 352
    move-result-object v18

    .line 353
    sget-object v6, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$startAngle$1;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$startAngle$1;

    .line 354
    .line 355
    invoke-static {v6}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 356
    .line 357
    .line 358
    move-result-object v19

    .line 359
    const/16 v20, 0x0

    .line 360
    .line 361
    const-wide/16 v21, 0x0

    .line 362
    .line 363
    const/16 v23, 0x6

    .line 364
    .line 365
    const/16 v24, 0x0

    .line 366
    .line 367
    invoke-static/range {v19 .. v24}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    or-int/lit16 v3, v3, 0x1b0

    .line 372
    .line 373
    shl-int/lit8 v6, v17, 0x9

    .line 374
    .line 375
    or-int v11, v3, v6

    .line 376
    .line 377
    move-object v6, v13

    .line 378
    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    invoke-static {v2}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    sget v6, Landroidx/compose/material3/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 387
    .line 388
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    new-instance v13, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$3;

    .line 393
    .line 394
    move-object v6, v13

    .line 395
    move-object v7, v12

    .line 396
    move-object/from16 v8, v18

    .line 397
    .line 398
    move-object v10, v5

    .line 399
    move v11, v4

    .line 400
    move-object v5, v13

    .line 401
    move-wide v12, v15

    .line 402
    invoke-direct/range {v6 .. v14}, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$3;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;FJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v3, v5, v1, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 406
    .line 407
    .line 408
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_11

    .line 413
    .line 414
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 415
    .line 416
    .line 417
    :cond_11
    :goto_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    if-nez v7, :cond_12

    .line 422
    .line 423
    goto :goto_e

    .line 424
    :cond_12
    new-instance v8, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$4;

    .line 425
    .line 426
    move-object v0, v8

    .line 427
    move-object v1, v2

    .line 428
    move-wide v2, v15

    .line 429
    move/from16 v5, p5

    .line 430
    .line 431
    move/from16 v6, p6

    .line 432
    .line 433
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/ProgressIndicatorKt$CircularProgressIndicator$4;-><init>(Landroidx/compose/ui/Modifier;JFII)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 437
    .line 438
    .line 439
    :goto_e
    return-void
.end method

.method public static final LinearProgressIndicator-RIQooxk(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v6, p6

    .line 2
    .line 3
    const v0, 0x22e72f03

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p5

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p7, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v5, v6, 0x6

    .line 17
    .line 18
    move v7, v5

    .line 19
    move-object/from16 v5, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v5, v6, 0xe

    .line 23
    .line 24
    if-nez v5, :cond_2

    .line 25
    .line 26
    move-object/from16 v5, p0

    .line 27
    .line 28
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    const/4 v7, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v7, 0x2

    .line 37
    :goto_0
    or-int/2addr v7, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v5, p0

    .line 40
    .line 41
    move v7, v6

    .line 42
    :goto_1
    and-int/lit8 v8, v6, 0x70

    .line 43
    .line 44
    if-nez v8, :cond_5

    .line 45
    .line 46
    and-int/lit8 v8, p7, 0x2

    .line 47
    .line 48
    if-nez v8, :cond_3

    .line 49
    .line 50
    move-wide/from16 v8, p1

    .line 51
    .line 52
    invoke-interface {v1, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    if-eqz v10, :cond_4

    .line 57
    .line 58
    const/16 v10, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-wide/from16 v8, p1

    .line 62
    .line 63
    :cond_4
    const/16 v10, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v7, v10

    .line 66
    goto :goto_3

    .line 67
    :cond_5
    move-wide/from16 v8, p1

    .line 68
    .line 69
    :goto_3
    and-int/lit16 v10, v6, 0x380

    .line 70
    .line 71
    if-nez v10, :cond_8

    .line 72
    .line 73
    and-int/lit8 v10, p7, 0x4

    .line 74
    .line 75
    if-nez v10, :cond_6

    .line 76
    .line 77
    move-wide/from16 v10, p3

    .line 78
    .line 79
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    if-eqz v12, :cond_7

    .line 84
    .line 85
    const/16 v12, 0x100

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    move-wide/from16 v10, p3

    .line 89
    .line 90
    :cond_7
    const/16 v12, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v7, v12

    .line 93
    goto :goto_5

    .line 94
    :cond_8
    move-wide/from16 v10, p3

    .line 95
    .line 96
    :goto_5
    and-int/lit16 v7, v7, 0x2db

    .line 97
    .line 98
    const/16 v12, 0x92

    .line 99
    .line 100
    if-ne v7, v12, :cond_b

    .line 101
    .line 102
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_9

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 110
    .line 111
    .line 112
    move-object v2, v5

    .line 113
    :cond_a
    :goto_6
    move-wide v4, v10

    .line 114
    goto/16 :goto_c

    .line 115
    .line 116
    :cond_b
    :goto_7
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 117
    .line 118
    .line 119
    and-int/lit8 v7, v6, 0x1

    .line 120
    .line 121
    const/4 v12, 0x6

    .line 122
    if-eqz v7, :cond_d

    .line 123
    .line 124
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-eqz v7, :cond_c

    .line 129
    .line 130
    goto :goto_8

    .line 131
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 132
    .line 133
    .line 134
    move-object v2, v5

    .line 135
    goto :goto_a

    .line 136
    :cond_d
    :goto_8
    if-eqz v2, :cond_e

    .line 137
    .line 138
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 139
    .line 140
    goto :goto_9

    .line 141
    :cond_e
    move-object v2, v5

    .line 142
    :goto_9
    and-int/lit8 v5, p7, 0x2

    .line 143
    .line 144
    if-eqz v5, :cond_f

    .line 145
    .line 146
    sget-object v5, Landroidx/compose/material3/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorDefaults;

    .line 147
    .line 148
    invoke-virtual {v5, v1, v12}, Landroidx/compose/material3/ProgressIndicatorDefaults;->getLinearColor(Landroidx/compose/runtime/Composer;I)J

    .line 149
    .line 150
    .line 151
    move-result-wide v7

    .line 152
    move-wide v8, v7

    .line 153
    :cond_f
    and-int/lit8 v5, p7, 0x4

    .line 154
    .line 155
    if-eqz v5, :cond_10

    .line 156
    .line 157
    sget-object v5, Landroidx/compose/material3/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorDefaults;

    .line 158
    .line 159
    invoke-virtual {v5, v1, v12}, Landroidx/compose/material3/ProgressIndicatorDefaults;->getLinearTrackColor(Landroidx/compose/runtime/Composer;I)J

    .line 160
    .line 161
    .line 162
    move-result-wide v10

    .line 163
    :cond_10
    :goto_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 164
    .line 165
    .line 166
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_11

    .line 171
    .line 172
    const/4 v5, -0x1

    .line 173
    const-string v7, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:103)"

    .line 174
    .line 175
    invoke-static {v0, v6, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :cond_11
    const/4 v0, 0x0

    .line 179
    invoke-static {v1, v0}, Landroidx/compose/animation/core/InfiniteTransitionKt;->rememberInfiniteTransition(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    const/4 v7, 0x0

    .line 184
    const/high16 v13, 0x3f800000    # 1.0f

    .line 185
    .line 186
    sget-object v14, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1;

    .line 187
    .line 188
    invoke-static {v14}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    const/4 v15, 0x0

    .line 193
    const-wide/16 v16, 0x0

    .line 194
    .line 195
    const/16 v18, 0x6

    .line 196
    .line 197
    const/16 v19, 0x0

    .line 198
    .line 199
    move-object/from16 p0, v14

    .line 200
    .line 201
    move-object/from16 p1, v15

    .line 202
    .line 203
    move-wide/from16 p2, v16

    .line 204
    .line 205
    move/from16 p4, v18

    .line 206
    .line 207
    move-object/from16 p5, v19

    .line 208
    .line 209
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    sget v15, Landroidx/compose/animation/core/InfiniteTransition;->$stable:I

    .line 214
    .line 215
    or-int/lit16 v3, v15, 0x1b0

    .line 216
    .line 217
    sget v17, Landroidx/compose/animation/core/InfiniteRepeatableSpec;->$stable:I

    .line 218
    .line 219
    shl-int/lit8 v18, v17, 0x9

    .line 220
    .line 221
    or-int v3, v3, v18

    .line 222
    .line 223
    move-object/from16 p0, v5

    .line 224
    .line 225
    move/from16 p1, v7

    .line 226
    .line 227
    move/from16 p2, v13

    .line 228
    .line 229
    move-object/from16 p3, v14

    .line 230
    .line 231
    move-object/from16 p4, v1

    .line 232
    .line 233
    move/from16 p5, v3

    .line 234
    .line 235
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    sget-object v14, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1;

    .line 240
    .line 241
    invoke-static {v14}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    const/16 v18, 0x0

    .line 246
    .line 247
    const-wide/16 v19, 0x0

    .line 248
    .line 249
    const/16 v21, 0x6

    .line 250
    .line 251
    const/16 v22, 0x0

    .line 252
    .line 253
    move-object/from16 p0, v14

    .line 254
    .line 255
    move-object/from16 p1, v18

    .line 256
    .line 257
    move-wide/from16 p2, v19

    .line 258
    .line 259
    move/from16 p4, v21

    .line 260
    .line 261
    move-object/from16 p5, v22

    .line 262
    .line 263
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 264
    .line 265
    .line 266
    move-result-object v14

    .line 267
    or-int/lit16 v4, v15, 0x1b0

    .line 268
    .line 269
    shl-int/lit8 v19, v17, 0x9

    .line 270
    .line 271
    or-int v4, v4, v19

    .line 272
    .line 273
    move-object/from16 p0, v5

    .line 274
    .line 275
    move/from16 p1, v7

    .line 276
    .line 277
    move/from16 p2, v13

    .line 278
    .line 279
    move-object/from16 p3, v14

    .line 280
    .line 281
    move-object/from16 p4, v1

    .line 282
    .line 283
    move/from16 p5, v4

    .line 284
    .line 285
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    sget-object v14, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1;

    .line 290
    .line 291
    invoke-static {v14}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 292
    .line 293
    .line 294
    move-result-object v14

    .line 295
    const/16 v19, 0x0

    .line 296
    .line 297
    const-wide/16 v20, 0x0

    .line 298
    .line 299
    const/16 v22, 0x6

    .line 300
    .line 301
    const/16 v23, 0x0

    .line 302
    .line 303
    move-object/from16 p0, v14

    .line 304
    .line 305
    move-object/from16 p1, v19

    .line 306
    .line 307
    move-wide/from16 p2, v20

    .line 308
    .line 309
    move/from16 p4, v22

    .line 310
    .line 311
    move-object/from16 p5, v23

    .line 312
    .line 313
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    or-int/lit16 v0, v15, 0x1b0

    .line 318
    .line 319
    shl-int/lit8 v19, v17, 0x9

    .line 320
    .line 321
    or-int v0, v0, v19

    .line 322
    .line 323
    move-object/from16 p0, v5

    .line 324
    .line 325
    move/from16 p1, v7

    .line 326
    .line 327
    move/from16 p2, v13

    .line 328
    .line 329
    move-object/from16 p3, v14

    .line 330
    .line 331
    move-object/from16 p4, v1

    .line 332
    .line 333
    move/from16 p5, v0

    .line 334
    .line 335
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 336
    .line 337
    .line 338
    move-result-object v20

    .line 339
    const/4 v0, 0x0

    .line 340
    const/high16 v7, 0x3f800000    # 1.0f

    .line 341
    .line 342
    sget-object v13, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1;

    .line 343
    .line 344
    invoke-static {v13}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    const/4 v14, 0x0

    .line 349
    const-wide/16 v23, 0x0

    .line 350
    .line 351
    const/16 v19, 0x6

    .line 352
    .line 353
    const/16 v21, 0x0

    .line 354
    .line 355
    move-object/from16 p0, v13

    .line 356
    .line 357
    move-object/from16 p1, v14

    .line 358
    .line 359
    move-wide/from16 p2, v23

    .line 360
    .line 361
    move/from16 p4, v19

    .line 362
    .line 363
    move-object/from16 p5, v21

    .line 364
    .line 365
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    or-int/lit16 v14, v15, 0x1b0

    .line 370
    .line 371
    shl-int/lit8 v15, v17, 0x9

    .line 372
    .line 373
    or-int/2addr v14, v15

    .line 374
    move-object/from16 p0, v5

    .line 375
    .line 376
    move/from16 p1, v0

    .line 377
    .line 378
    move/from16 p2, v7

    .line 379
    .line 380
    move-object/from16 p3, v13

    .line 381
    .line 382
    move-object/from16 p4, v1

    .line 383
    .line 384
    move/from16 p5, v14

    .line 385
    .line 386
    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/core/InfiniteTransitionKt;->animateFloat(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 387
    .line 388
    .line 389
    move-result-object v21

    .line 390
    invoke-static {v2}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    sget v5, Landroidx/compose/material3/ProgressIndicatorKt;->LinearIndicatorWidth:F

    .line 395
    .line 396
    sget v7, Landroidx/compose/material3/ProgressIndicatorKt;->LinearIndicatorHeight:F

    .line 397
    .line 398
    invoke-static {v0, v5, v7}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    new-array v5, v12, [Ljava/lang/Object;

    .line 403
    .line 404
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    const/4 v13, 0x0

    .line 409
    aput-object v7, v5, v13

    .line 410
    .line 411
    const/4 v7, 0x1

    .line 412
    aput-object v3, v5, v7

    .line 413
    .line 414
    const/4 v7, 0x2

    .line 415
    aput-object v4, v5, v7

    .line 416
    .line 417
    const/4 v7, 0x3

    .line 418
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 419
    .line 420
    .line 421
    move-result-object v13

    .line 422
    aput-object v13, v5, v7

    .line 423
    .line 424
    const/4 v7, 0x4

    .line 425
    aput-object v20, v5, v7

    .line 426
    .line 427
    const/4 v7, 0x5

    .line 428
    aput-object v21, v5, v7

    .line 429
    .line 430
    const v7, -0x21de6e89

    .line 431
    .line 432
    .line 433
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 434
    .line 435
    .line 436
    const/4 v7, 0x0

    .line 437
    const/4 v13, 0x0

    .line 438
    :goto_b
    if-ge v13, v12, :cond_12

    .line 439
    .line 440
    aget-object v14, v5, v13

    .line 441
    .line 442
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v14

    .line 446
    or-int/2addr v7, v14

    .line 447
    add-int/lit8 v13, v13, 0x1

    .line 448
    .line 449
    goto :goto_b

    .line 450
    :cond_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    if-nez v7, :cond_13

    .line 455
    .line 456
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 457
    .line 458
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    if-ne v5, v7, :cond_14

    .line 463
    .line 464
    :cond_13
    new-instance v5, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$3$1;

    .line 465
    .line 466
    move-object v13, v5

    .line 467
    move-wide v14, v10

    .line 468
    move-object/from16 v16, v3

    .line 469
    .line 470
    move-object/from16 v17, v4

    .line 471
    .line 472
    move-wide/from16 v18, v8

    .line 473
    .line 474
    invoke-direct/range {v13 .. v21}, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$3$1;-><init>(JLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;JLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 475
    .line 476
    .line 477
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :cond_14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 481
    .line 482
    .line 483
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 484
    .line 485
    const/4 v3, 0x0

    .line 486
    invoke-static {v0, v5, v1, v3}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 487
    .line 488
    .line 489
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_a

    .line 494
    .line 495
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 496
    .line 497
    .line 498
    goto/16 :goto_6

    .line 499
    .line 500
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 501
    .line 502
    .line 503
    move-result-object v10

    .line 504
    if-nez v10, :cond_15

    .line 505
    .line 506
    goto :goto_d

    .line 507
    :cond_15
    new-instance v11, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$4;

    .line 508
    .line 509
    move-object v0, v11

    .line 510
    move-object v1, v2

    .line 511
    move-wide v2, v8

    .line 512
    move/from16 v6, p6

    .line 513
    .line 514
    move/from16 v7, p7

    .line 515
    .line 516
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$4;-><init>(Landroidx/compose/ui/Modifier;JJII)V

    .line 517
    .line 518
    .line 519
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 520
    .line 521
    .line 522
    :goto_d
    return-void
.end method

.method public static final LinearProgressIndicator-eaDK9VM(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v7, p7

    .line 2
    .line 3
    const v0, -0x1637364d

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p6

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p8, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v2, v7, 0x6

    .line 17
    .line 18
    move v3, v2

    .line 19
    move v2, p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v2, v7, 0xe

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    move v2, p0

    .line 26
    invoke-interface {v1, p0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v3, v7

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v2, p0

    .line 38
    move v3, v7

    .line 39
    :goto_1
    and-int/lit8 v4, p8, 0x2

    .line 40
    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v5, v7, 0x70

    .line 47
    .line 48
    if-nez v5, :cond_5

    .line 49
    .line 50
    move-object v5, p1

    .line 51
    invoke-interface {v1, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_4

    .line 56
    .line 57
    const/16 v6, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v6, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v3, v6

    .line 63
    goto :goto_4

    .line 64
    :cond_5
    :goto_3
    move-object v5, p1

    .line 65
    :goto_4
    and-int/lit16 v6, v7, 0x380

    .line 66
    .line 67
    if-nez v6, :cond_7

    .line 68
    .line 69
    and-int/lit8 v6, p8, 0x4

    .line 70
    .line 71
    move-wide v8, p2

    .line 72
    if-nez v6, :cond_6

    .line 73
    .line 74
    invoke-interface {v1, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_6

    .line 79
    .line 80
    const/16 v6, 0x100

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_6
    const/16 v6, 0x80

    .line 84
    .line 85
    :goto_5
    or-int/2addr v3, v6

    .line 86
    goto :goto_6

    .line 87
    :cond_7
    move-wide v8, p2

    .line 88
    :goto_6
    and-int/lit16 v6, v7, 0x1c00

    .line 89
    .line 90
    if-nez v6, :cond_9

    .line 91
    .line 92
    and-int/lit8 v6, p8, 0x8

    .line 93
    .line 94
    move-wide/from16 v10, p4

    .line 95
    .line 96
    if-nez v6, :cond_8

    .line 97
    .line 98
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_8

    .line 103
    .line 104
    const/16 v6, 0x800

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_8
    const/16 v6, 0x400

    .line 108
    .line 109
    :goto_7
    or-int/2addr v3, v6

    .line 110
    goto :goto_8

    .line 111
    :cond_9
    move-wide/from16 v10, p4

    .line 112
    .line 113
    :goto_8
    and-int/lit16 v6, v3, 0x16db

    .line 114
    .line 115
    const/16 v12, 0x492

    .line 116
    .line 117
    if-ne v6, v12, :cond_c

    .line 118
    .line 119
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-nez v6, :cond_a

    .line 124
    .line 125
    goto :goto_a

    .line 126
    :cond_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 127
    .line 128
    .line 129
    move-object v4, v5

    .line 130
    :cond_b
    :goto_9
    move-wide v5, v10

    .line 131
    goto/16 :goto_e

    .line 132
    .line 133
    :cond_c
    :goto_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 134
    .line 135
    .line 136
    and-int/lit8 v6, v7, 0x1

    .line 137
    .line 138
    if-eqz v6, :cond_10

    .line 139
    .line 140
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_d

    .line 145
    .line 146
    goto :goto_b

    .line 147
    :cond_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 148
    .line 149
    .line 150
    and-int/lit8 v4, p8, 0x4

    .line 151
    .line 152
    if-eqz v4, :cond_e

    .line 153
    .line 154
    and-int/lit16 v3, v3, -0x381

    .line 155
    .line 156
    :cond_e
    and-int/lit8 v4, p8, 0x8

    .line 157
    .line 158
    if-eqz v4, :cond_f

    .line 159
    .line 160
    and-int/lit16 v3, v3, -0x1c01

    .line 161
    .line 162
    :cond_f
    move-object v4, v5

    .line 163
    goto :goto_d

    .line 164
    :cond_10
    :goto_b
    if-eqz v4, :cond_11

    .line 165
    .line 166
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 167
    .line 168
    goto :goto_c

    .line 169
    :cond_11
    move-object v4, v5

    .line 170
    :goto_c
    and-int/lit8 v5, p8, 0x4

    .line 171
    .line 172
    const/4 v6, 0x6

    .line 173
    if-eqz v5, :cond_12

    .line 174
    .line 175
    sget-object v5, Landroidx/compose/material3/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorDefaults;

    .line 176
    .line 177
    invoke-virtual {v5, v1, v6}, Landroidx/compose/material3/ProgressIndicatorDefaults;->getLinearColor(Landroidx/compose/runtime/Composer;I)J

    .line 178
    .line 179
    .line 180
    move-result-wide v8

    .line 181
    and-int/lit16 v3, v3, -0x381

    .line 182
    .line 183
    :cond_12
    and-int/lit8 v5, p8, 0x8

    .line 184
    .line 185
    if-eqz v5, :cond_13

    .line 186
    .line 187
    sget-object v5, Landroidx/compose/material3/ProgressIndicatorDefaults;->INSTANCE:Landroidx/compose/material3/ProgressIndicatorDefaults;

    .line 188
    .line 189
    invoke-virtual {v5, v1, v6}, Landroidx/compose/material3/ProgressIndicatorDefaults;->getLinearTrackColor(Landroidx/compose/runtime/Composer;I)J

    .line 190
    .line 191
    .line 192
    move-result-wide v5

    .line 193
    and-int/lit16 v3, v3, -0x1c01

    .line 194
    .line 195
    move-wide v10, v5

    .line 196
    :cond_13
    :goto_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 197
    .line 198
    .line 199
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-eqz v5, :cond_14

    .line 204
    .line 205
    const/4 v5, -0x1

    .line 206
    const-string v6, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:71)"

    .line 207
    .line 208
    invoke-static {v0, v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :cond_14
    const/4 v0, 0x0

    .line 212
    const/4 v3, 0x0

    .line 213
    const/4 v5, 0x6

    .line 214
    const/4 v6, 0x0

    .line 215
    move-object p1, v4

    .line 216
    move p2, p0

    .line 217
    move-object/from16 p3, v0

    .line 218
    .line 219
    move/from16 p4, v3

    .line 220
    .line 221
    move/from16 p5, v5

    .line 222
    .line 223
    move-object/from16 p6, v6

    .line 224
    .line 225
    invoke-static/range {p1 .. p6}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics$default(Landroidx/compose/ui/Modifier;FLkotlin/ranges/ClosedFloatingPointRange;IILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    sget v3, Landroidx/compose/material3/ProgressIndicatorKt;->LinearIndicatorWidth:F

    .line 230
    .line 231
    sget v5, Landroidx/compose/material3/ProgressIndicatorKt;->LinearIndicatorHeight:F

    .line 232
    .line 233
    invoke-static {v0, v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    const v12, 0x607fb4c4

    .line 250
    .line 251
    .line 252
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    or-int/2addr v3, v5

    .line 264
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    or-int/2addr v3, v5

    .line 269
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    if-nez v3, :cond_15

    .line 274
    .line 275
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 276
    .line 277
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    if-ne v5, v3, :cond_16

    .line 282
    .line 283
    :cond_15
    new-instance v5, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$1$1;

    .line 284
    .line 285
    move-object p1, v5

    .line 286
    move-wide p2, v10

    .line 287
    move/from16 p4, p0

    .line 288
    .line 289
    move-wide/from16 p5, v8

    .line 290
    .line 291
    invoke-direct/range {p1 .. p6}, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$1$1;-><init>(JFJ)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_16
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 298
    .line 299
    .line 300
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 301
    .line 302
    const/4 v3, 0x0

    .line 303
    invoke-static {v0, v5, v1, v3}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 304
    .line 305
    .line 306
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_b

    .line 311
    .line 312
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_9

    .line 316
    .line 317
    :goto_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    if-nez v10, :cond_17

    .line 322
    .line 323
    goto :goto_f

    .line 324
    :cond_17
    new-instance v11, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2;

    .line 325
    .line 326
    move-object v0, v11

    .line 327
    move v1, p0

    .line 328
    move-object v2, v4

    .line 329
    move-wide v3, v8

    .line 330
    move/from16 v7, p7

    .line 331
    .line 332
    move/from16 v8, p8

    .line 333
    .line 334
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2;-><init>(FLandroidx/compose/ui/Modifier;JJII)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 338
    .line 339
    .line 340
    :goto_f
    return-void
.end method

.method public static final synthetic access$drawDeterminateCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/ProgressIndicatorKt;->drawDeterminateCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$drawIndeterminateCircularIndicator-hrjfTZI(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/ProgressIndicatorKt;->drawIndeterminateCircularIndicator-hrjfTZI(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$drawLinearIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/ProgressIndicatorKt;->drawLinearIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$drawLinearIndicatorTrack-bw27NRU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/ProgressIndicatorKt;->drawLinearIndicatorTrack-bw27NRU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getCircularEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->CircularEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getFirstLineHeadEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->FirstLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getFirstLineTailEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->FirstLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSecondLineHeadEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->SecondLineHeadEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSecondLineTailEasing$p()Landroidx/compose/animation/core/CubicBezierEasing;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/ProgressIndicatorKt;->SecondLineTailEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final drawCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 19

    .line 1
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/ui/graphics/drawscope/Stroke;->getWidth()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    int-to-float v1, v1

    .line 7
    div-float/2addr v0, v1

    .line 8
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    mul-float/2addr v1, v0

    .line 17
    sub-float/2addr v2, v1

    .line 18
    const/4 v8, 0x0

    .line 19
    invoke-static {v0, v0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 20
    .line 21
    .line 22
    move-result-wide v9

    .line 23
    invoke-static {v2, v2}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 24
    .line 25
    .line 26
    move-result-wide v11

    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x340

    .line 32
    .line 33
    const/16 v18, 0x0

    .line 34
    .line 35
    move-object/from16 v3, p0

    .line 36
    .line 37
    move-wide/from16 v4, p3

    .line 38
    .line 39
    move/from16 v6, p1

    .line 40
    .line 41
    move/from16 v7, p2

    .line 42
    .line 43
    move-object/from16 v14, p5

    .line 44
    .line 45
    invoke-static/range {v3 .. v18}, Landroidx/compose/ui/graphics/drawscope/b;->v(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private static final drawDeterminateCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/ProgressIndicatorKt;->drawCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final drawIndeterminateCircularIndicator-hrjfTZI(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V
    .locals 6

    .line 1
    sget v0, Landroidx/compose/material3/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    int-to-float v1, v1

    .line 5
    div-float/2addr v0, v1

    .line 6
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    div-float/2addr p2, v0

    .line 11
    const v0, 0x42652ee1

    .line 12
    .line 13
    .line 14
    mul-float/2addr p2, v0

    .line 15
    const/high16 v0, 0x40000000    # 2.0f

    .line 16
    .line 17
    div-float/2addr p2, v0

    .line 18
    add-float v1, p1, p2

    .line 19
    .line 20
    const p1, 0x3dcccccd    # 0.1f

    .line 21
    .line 22
    .line 23
    invoke-static {p3, p1}, Ljava/lang/Math;->max(FF)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    move-object v0, p0

    .line 28
    move-wide v3, p4

    .line 29
    move-object v5, p6

    .line 30
    invoke-static/range {v0 .. v5}, Landroidx/compose/material3/ProgressIndicatorKt;->drawCircularIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private static final drawLinearIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V
    .locals 20

    .line 1
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x2

    .line 18
    int-to-float v2, v2

    .line 19
    div-float/2addr v1, v2

    .line 20
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 25
    .line 26
    if-ne v2, v3, :cond_0

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x0

    .line 31
    :goto_0
    const/high16 v3, 0x3f800000    # 1.0f

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    move/from16 v4, p1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    sub-float v4, v3, p2

    .line 39
    .line 40
    :goto_1
    mul-float/2addr v4, v0

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    move/from16 v2, p2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    sub-float v2, v3, p1

    .line 47
    .line 48
    :goto_2
    mul-float/2addr v2, v0

    .line 49
    invoke-static {v4, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 50
    .line 51
    .line 52
    move-result-wide v8

    .line 53
    invoke-static {v2, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 54
    .line 55
    .line 56
    move-result-wide v10

    .line 57
    const/4 v13, 0x0

    .line 58
    const/4 v14, 0x0

    .line 59
    const/4 v15, 0x0

    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/16 v18, 0x1f0

    .line 65
    .line 66
    const/16 v19, 0x0

    .line 67
    .line 68
    move-object/from16 v5, p0

    .line 69
    .line 70
    move-wide/from16 v6, p3

    .line 71
    .line 72
    move/from16 v12, p5

    .line 73
    .line 74
    invoke-static/range {v5 .. v19}, Landroidx/compose/ui/graphics/drawscope/b;->C(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method private static final drawLinearIndicatorTrack-bw27NRU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V
    .locals 6

    .line 1
    const/4 v1, 0x0

    .line 2
    const/high16 v2, 0x3f800000    # 1.0f

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-wide v3, p1

    .line 6
    move v5, p3

    .line 7
    invoke-static/range {v0 .. v5}, Landroidx/compose/material3/ProgressIndicatorKt;->drawLinearIndicator-42QJj7c(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final getCircularIndicatorDiameter()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/ProgressIndicatorKt;->CircularIndicatorDiameter:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getLinearIndicatorHeight()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/ProgressIndicatorKt;->LinearIndicatorHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getLinearIndicatorWidth()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/ProgressIndicatorKt;->LinearIndicatorWidth:F

    .line 2
    .line 3
    return v0
.end method
