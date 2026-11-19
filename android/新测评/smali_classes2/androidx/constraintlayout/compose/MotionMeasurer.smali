.class public final Landroidx/constraintlayout/compose/MotionMeasurer;
.super Landroidx/constraintlayout/compose/Measurer2;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/constraintlayout/compose/ExperimentalMotionApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016J4\u0010\u0012\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015J+\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0008\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u001e\u0010%\u001a\u00020\u00082\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0008J.\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0008J8\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020(2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00105J,\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\n2\u0006\u00107\u001a\u0002082\u0008\u00109\u001a\u0004\u0018\u00010:H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008;\u0010<J|\u0010=\u001a\u00020>2\u0006\u00103\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020,2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u000202012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020C0B2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00082\u0006\u0010D\u001a\u0002082\u0008\u00109\u001a\u0004\u0018\u00010:\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010FJb\u0010G\u001a\u00020\u00102\u0006\u00103\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020(2\u0008\u0010\u000b\u001a\u0004\u0018\u00010,2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u000202012\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00082\u0006\u0010H\u001a\u00020\u0006H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008I\u0010JJ(\u0010K\u001a\u00020\u0010*\u00020L2\u0008\u0008\u0002\u0010M\u001a\u00020\u00062\u0008\u0008\u0002\u0010N\u001a\u00020\u00062\u0008\u0008\u0002\u0010O\u001a\u00020\u0006J.\u0010P\u001a\u00020\u0010*\u00020L2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u001fH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008V\u0010WJF\u0010X\u001a\u00020\u0010*\u00020L2\u0006\u0010Y\u001a\u00020\u00082\u0006\u0010Z\u001a\u00020\u00082\u0006\u0010[\u001a\u00020R2\u0006\u0010\\\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u001fH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008]\u0010^J4\u0010N\u001a\u00020\u0010*\u00020L2\u0006\u0010Y\u001a\u00020\u00082\u0006\u0010Z\u001a\u00020\u00082\u0006\u0010[\u001a\u00020R2\u0006\u0010_\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006`"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/MotionMeasurer;",
        "Landroidx/constraintlayout/compose/Measurer2;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "(Landroidx/compose/ui/unit/Density;)V",
        "DEBUG",
        "",
        "lastProgressInInterpolation",
        "",
        "oldConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "transition",
        "Landroidx/constraintlayout/core/state/Transition;",
        "getTransition",
        "()Landroidx/constraintlayout/core/state/Transition;",
        "clearConstraintSets",
        "",
        "computeLayoutResult",
        "encodeKeyFrames",
        "json",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "location",
        "",
        "types",
        "",
        "progress",
        "count",
        "",
        "encodeRoot",
        "getCustomColor",
        "Landroidx/compose/ui/graphics/Color;",
        "id",
        "",
        "name",
        "getCustomColor-XeAY9LY",
        "(Ljava/lang/String;Ljava/lang/String;F)J",
        "getCustomFloat",
        "initWith",
        "start",
        "Landroidx/constraintlayout/compose/ConstraintSet;",
        "end",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "Landroidx/constraintlayout/compose/TransitionImpl;",
        "measureConstraintSet",
        "optimizationLevel",
        "constraintSet",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "measureConstraintSet--hBUhpc",
        "(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V",
        "needsRemeasure",
        "source",
        "Landroidx/constraintlayout/compose/CompositionSource;",
        "invalidateOnConstraintsCallback",
        "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;",
        "needsRemeasure-NN6Ew-U",
        "(JLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)Z",
        "performInterpolationMeasure",
        "Landroidx/compose/ui/unit/IntSize;",
        "constraintSetStart",
        "constraintSetEnd",
        "placeableMap",
        "",
        "Landroidx/compose/ui/layout/Placeable;",
        "compositionSource",
        "performInterpolationMeasure-LzAeyeM",
        "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;Ljava/util/Map;IFLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)J",
        "recalculateInterpolation",
        "remeasure",
        "recalculateInterpolation-36Wf7g4",
        "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;IFZ)V",
        "drawDebug",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "drawBounds",
        "drawPaths",
        "drawKeyPositions",
        "drawFrame",
        "frame",
        "Landroidx/constraintlayout/core/state/WidgetFrame;",
        "pathEffect",
        "Landroidx/compose/ui/graphics/PathEffect;",
        "color",
        "drawFrame-g2O1Hgs",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V",
        "drawFrameDebug",
        "parentWidth",
        "parentHeight",
        "startFrame",
        "endFrame",
        "drawFrameDebug-PE3pjmc",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V",
        "drawPath",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMotionMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionMeasurer.kt\nandroidx/constraintlayout/compose/MotionMeasurer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,581:1\n33#2,6:582\n33#2,6:588\n33#2,6:594\n33#2,6:600\n33#2,4:606\n38#2:617\n128#3,7:610\n1#4:618\n169#5:619\n*S KotlinDebug\n*F\n+ 1 MotionMeasurer.kt\nandroidx/constraintlayout/compose/MotionMeasurer\n*L\n63#1:582,6\n69#1:588,6\n224#1:594,6\n289#1:600,6\n330#1:606,4\n330#1:617\n337#1:610,7\n48#1:619\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final DEBUG:Z

.field private lastProgressInInterpolation:F

.field private oldConstraints:Landroidx/compose/ui/unit/Constraints;

.field private final transition:Landroidx/constraintlayout/core/state/Transition;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/unit/Density;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/Measurer2;-><init>(Landroidx/compose/ui/unit/Density;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/constraintlayout/core/state/Transition;

    .line 5
    .line 6
    new-instance v1, Landroidx/constraintlayout/compose/b;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Landroidx/constraintlayout/compose/b;-><init>(Landroidx/compose/ui/unit/Density;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/state/Transition;-><init>(Landroidx/constraintlayout/core/state/CorePixelDp;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/unit/Density;F)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/constraintlayout/compose/MotionMeasurer;->transition$lambda$1(Landroidx/compose/ui/unit/Density;F)F

    move-result p0

    return p0
.end method

.method public static synthetic drawDebug$default(Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/ui/graphics/drawscope/DrawScope;ZZZILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    move p3, v0

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    move p4, v0

    .line 17
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/compose/MotionMeasurer;->drawDebug(Landroidx/compose/ui/graphics/drawscope/DrawScope;ZZZ)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final drawFrame-g2O1Hgs(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V
    .locals 30

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;->isDefaultTransform()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v10, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 10
    .line 11
    const/16 v8, 0xe

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    const/high16 v3, 0x40400000    # 3.0f

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    move-object/from16 v7, p3

    .line 20
    .line 21
    move-object v2, v10

    .line 22
    invoke-direct/range {v2 .. v9}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    iget v1, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->left:I

    .line 26
    .line 27
    int-to-float v1, v1

    .line 28
    iget v2, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->top:I

    .line 29
    .line 30
    int-to-float v2, v2

    .line 31
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;->width()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-float v1, v1

    .line 40
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;->height()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-float v0, v0

    .line 45
    invoke-static {v1, v0}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 46
    .line 47
    .line 48
    move-result-wide v7

    .line 49
    const/16 v13, 0x68

    .line 50
    .line 51
    const/4 v14, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v11, 0x0

    .line 54
    const/4 v12, 0x0

    .line 55
    move-object/from16 v2, p1

    .line 56
    .line 57
    move-wide/from16 v3, p4

    .line 58
    .line 59
    invoke-static/range {v2 .. v14}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-n-J9OG0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    new-instance v1, Landroid/graphics/Matrix;

    .line 64
    .line 65
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 66
    .line 67
    .line 68
    iget v2, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->rotationZ:F

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_1

    .line 75
    .line 76
    iget v2, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->rotationZ:F

    .line 77
    .line 78
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;->centerX()F

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;->centerY()F

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    .line 87
    .line 88
    .line 89
    :cond_1
    iget v2, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->scaleX:F

    .line 90
    .line 91
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/high16 v3, 0x3f800000    # 1.0f

    .line 96
    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    move v2, v3

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    iget v2, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->scaleX:F

    .line 102
    .line 103
    :goto_0
    iget v4, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->scaleY:F

    .line 104
    .line 105
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_3

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    iget v3, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->scaleY:F

    .line 113
    .line 114
    :goto_1
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;->centerX()F

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;->centerY()F

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Matrix;->preScale(FFFF)Z

    .line 123
    .line 124
    .line 125
    iget v2, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->left:I

    .line 126
    .line 127
    int-to-float v3, v2

    .line 128
    iget v4, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->top:I

    .line 129
    .line 130
    int-to-float v5, v4

    .line 131
    iget v6, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->right:I

    .line 132
    .line 133
    int-to-float v7, v6

    .line 134
    int-to-float v4, v4

    .line 135
    int-to-float v6, v6

    .line 136
    iget v0, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->bottom:I

    .line 137
    .line 138
    int-to-float v8, v0

    .line 139
    int-to-float v2, v2

    .line 140
    int-to-float v0, v0

    .line 141
    const/16 v9, 0x8

    .line 142
    .line 143
    new-array v9, v9, [F

    .line 144
    .line 145
    const/4 v10, 0x0

    .line 146
    aput v3, v9, v10

    .line 147
    .line 148
    const/4 v3, 0x1

    .line 149
    aput v5, v9, v3

    .line 150
    .line 151
    const/4 v5, 0x2

    .line 152
    aput v7, v9, v5

    .line 153
    .line 154
    const/4 v7, 0x3

    .line 155
    aput v4, v9, v7

    .line 156
    .line 157
    const/4 v4, 0x4

    .line 158
    aput v6, v9, v4

    .line 159
    .line 160
    const/4 v6, 0x5

    .line 161
    aput v8, v9, v6

    .line 162
    .line 163
    const/4 v8, 0x6

    .line 164
    aput v2, v9, v8

    .line 165
    .line 166
    const/4 v2, 0x7

    .line 167
    aput v0, v9, v2

    .line 168
    .line 169
    invoke-virtual {v1, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 170
    .line 171
    .line 172
    aget v0, v9, v10

    .line 173
    .line 174
    aget v1, v9, v3

    .line 175
    .line 176
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 177
    .line 178
    .line 179
    move-result-wide v18

    .line 180
    aget v0, v9, v5

    .line 181
    .line 182
    aget v1, v9, v7

    .line 183
    .line 184
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 185
    .line 186
    .line 187
    move-result-wide v20

    .line 188
    const/16 v28, 0x1d0

    .line 189
    .line 190
    const/16 v29, 0x0

    .line 191
    .line 192
    const/high16 v22, 0x40400000    # 3.0f

    .line 193
    .line 194
    const/16 v23, 0x0

    .line 195
    .line 196
    const/16 v25, 0x0

    .line 197
    .line 198
    const/16 v26, 0x0

    .line 199
    .line 200
    const/16 v27, 0x0

    .line 201
    .line 202
    move-object/from16 v15, p1

    .line 203
    .line 204
    move-object/from16 v24, p3

    .line 205
    .line 206
    move-wide/from16 v16, p4

    .line 207
    .line 208
    invoke-static/range {v15 .. v29}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    aget v0, v9, v5

    .line 212
    .line 213
    aget v1, v9, v7

    .line 214
    .line 215
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 216
    .line 217
    .line 218
    move-result-wide v18

    .line 219
    aget v0, v9, v4

    .line 220
    .line 221
    aget v1, v9, v6

    .line 222
    .line 223
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 224
    .line 225
    .line 226
    move-result-wide v20

    .line 227
    invoke-static/range {v15 .. v29}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    aget v0, v9, v4

    .line 231
    .line 232
    aget v1, v9, v6

    .line 233
    .line 234
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 235
    .line 236
    .line 237
    move-result-wide v18

    .line 238
    aget v0, v9, v8

    .line 239
    .line 240
    aget v1, v9, v2

    .line 241
    .line 242
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 243
    .line 244
    .line 245
    move-result-wide v20

    .line 246
    invoke-static/range {v15 .. v29}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    aget v0, v9, v8

    .line 250
    .line 251
    aget v1, v9, v2

    .line 252
    .line 253
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 254
    .line 255
    .line 256
    move-result-wide v18

    .line 257
    aget v0, v9, v10

    .line 258
    .line 259
    aget v1, v9, v3

    .line 260
    .line 261
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 262
    .line 263
    .line 264
    move-result-wide v20

    .line 265
    invoke-static/range {v15 .. v29}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    return-void
.end method

.method private final drawFrameDebug-PE3pjmc(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V
    .locals 21

    .line 1
    move/from16 v6, p2

    .line 2
    .line 3
    move/from16 v7, p3

    .line 4
    .line 5
    move-object/from16 v0, p0

    .line 6
    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    move-object/from16 v2, p4

    .line 10
    .line 11
    move-object/from16 v3, p6

    .line 12
    .line 13
    move-wide/from16 v4, p7

    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Landroidx/constraintlayout/compose/MotionMeasurer;->drawFrame-g2O1Hgs(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V

    .line 16
    .line 17
    .line 18
    move-object v8, v2

    .line 19
    move-object/from16 v2, p5

    .line 20
    .line 21
    invoke-direct/range {v0 .. v5}, Landroidx/constraintlayout/compose/MotionMeasurer;->drawFrame-g2O1Hgs(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 25
    .line 26
    invoke-virtual {v1, v8}, Landroidx/constraintlayout/core/state/Transition;->getNumberKeyPositions(Landroidx/constraintlayout/core/state/WidgetFrame;)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-instance v9, Landroidx/constraintlayout/compose/MotionRenderDebug;

    .line 31
    .line 32
    const/high16 v2, 0x41b80000    # 23.0f

    .line 33
    .line 34
    invoke-direct {v9, v2}, Landroidx/constraintlayout/compose/MotionRenderDebug;-><init>(F)V

    .line 35
    .line 36
    .line 37
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Landroidx/compose/ui/graphics/AndroidCanvas_androidKt;->getNativeCanvas(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    iget-object v2, v0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 50
    .line 51
    iget-object v3, v8, Landroidx/constraintlayout/core/state/WidgetFrame;->widget:Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 52
    .line 53
    iget-object v3, v3, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/core/state/Transition;->getMotion(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/Motion;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    float-to-int v14, v6

    .line 60
    float-to-int v15, v7

    .line 61
    const/16 v12, 0x3e8

    .line 62
    .line 63
    const/4 v13, 0x1

    .line 64
    invoke-virtual/range {v9 .. v15}, Landroidx/constraintlayout/compose/MotionRenderDebug;->draw(Landroid/graphics/Canvas;Landroidx/constraintlayout/core/motion/Motion;IIII)V

    .line 65
    .line 66
    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    new-array v2, v1, [F

    .line 70
    .line 71
    new-array v3, v1, [F

    .line 72
    .line 73
    new-array v4, v1, [F

    .line 74
    .line 75
    iget-object v5, v0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 76
    .line 77
    invoke-virtual {v5, v8, v2, v3, v4}, Landroidx/constraintlayout/core/state/Transition;->fillKeyPositions(Landroidx/constraintlayout/core/state/WidgetFrame;[F[F[F)V

    .line 78
    .line 79
    .line 80
    const/4 v5, 0x1

    .line 81
    sub-int/2addr v1, v5

    .line 82
    if-ltz v1, :cond_0

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    :goto_0
    aget v10, v4, v9

    .line 86
    .line 87
    const/high16 v11, 0x42c80000    # 100.0f

    .line 88
    .line 89
    div-float/2addr v10, v11

    .line 90
    int-to-float v11, v5

    .line 91
    sub-float/2addr v11, v10

    .line 92
    invoke-virtual {v8}, Landroidx/constraintlayout/core/state/WidgetFrame;->width()I

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    int-to-float v12, v12

    .line 97
    mul-float/2addr v12, v11

    .line 98
    invoke-virtual/range {p5 .. p5}, Landroidx/constraintlayout/core/state/WidgetFrame;->width()I

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    int-to-float v13, v13

    .line 103
    mul-float/2addr v13, v10

    .line 104
    add-float/2addr v12, v13

    .line 105
    invoke-virtual {v8}, Landroidx/constraintlayout/core/state/WidgetFrame;->height()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    int-to-float v13, v13

    .line 110
    mul-float/2addr v11, v13

    .line 111
    invoke-virtual/range {p5 .. p5}, Landroidx/constraintlayout/core/state/WidgetFrame;->height()I

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    int-to-float v13, v13

    .line 116
    mul-float/2addr v10, v13

    .line 117
    add-float/2addr v11, v10

    .line 118
    aget v10, v2, v9

    .line 119
    .line 120
    mul-float/2addr v10, v6

    .line 121
    const/high16 v13, 0x40000000    # 2.0f

    .line 122
    .line 123
    div-float/2addr v12, v13

    .line 124
    add-float/2addr v10, v12

    .line 125
    aget v12, v3, v9

    .line 126
    .line 127
    mul-float/2addr v12, v7

    .line 128
    div-float/2addr v11, v13

    .line 129
    add-float/2addr v12, v11

    .line 130
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    const/high16 v13, 0x41a00000    # 20.0f

    .line 135
    .line 136
    sub-float v14, v10, v13

    .line 137
    .line 138
    invoke-interface {v11, v14, v12}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 139
    .line 140
    .line 141
    add-float v14, v12, v13

    .line 142
    .line 143
    invoke-interface {v11, v10, v14}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 144
    .line 145
    .line 146
    add-float v14, v10, v13

    .line 147
    .line 148
    invoke-interface {v11, v14, v12}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 149
    .line 150
    .line 151
    sub-float/2addr v12, v13

    .line 152
    invoke-interface {v11, v10, v12}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v11}, Landroidx/compose/ui/graphics/Path;->close()V

    .line 156
    .line 157
    .line 158
    new-instance v13, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 159
    .line 160
    const/16 v19, 0x1e

    .line 161
    .line 162
    const/16 v20, 0x0

    .line 163
    .line 164
    const/high16 v14, 0x40400000    # 3.0f

    .line 165
    .line 166
    const/4 v15, 0x0

    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/16 v18, 0x0

    .line 172
    .line 173
    invoke-direct/range {v13 .. v20}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 174
    .line 175
    .line 176
    const/16 v17, 0x30

    .line 177
    .line 178
    move-object v14, v13

    .line 179
    const/high16 v13, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/4 v15, 0x0

    .line 182
    move v5, v9

    .line 183
    move-object v10, v11

    .line 184
    move-object/from16 v9, p1

    .line 185
    .line 186
    move-wide/from16 v11, p7

    .line 187
    .line 188
    invoke-static/range {v9 .. v18}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-LG529CI$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    if-eq v5, v1, :cond_0

    .line 192
    .line 193
    add-int/lit8 v9, v5, 0x1

    .line 194
    .line 195
    const/4 v5, 0x1

    .line 196
    goto :goto_0

    .line 197
    :cond_0
    return-void
.end method

.method private final drawPaths(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;ZZ)V
    .locals 8

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/MotionRenderDebug;

    .line 2
    .line 3
    const/high16 v1, 0x41b80000    # 23.0f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/MotionRenderDebug;-><init>(F)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Landroidx/compose/ui/graphics/AndroidCanvas_androidKt;->getNativeCanvas(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object p1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 21
    .line 22
    iget-object p4, p4, Landroidx/constraintlayout/core/state/WidgetFrame;->widget:Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 23
    .line 24
    iget-object p4, p4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, p4}, Landroidx/constraintlayout/core/state/Transition;->getMotion(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/Motion;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    float-to-int v4, p2

    .line 31
    float-to-int v5, p3

    .line 32
    const/16 v3, 0x3e8

    .line 33
    .line 34
    move v6, p5

    .line 35
    move v7, p6

    .line 36
    invoke-virtual/range {v0 .. v7}, Landroidx/constraintlayout/compose/MotionRenderDebug;->basicDraw(Landroid/graphics/Canvas;Landroidx/constraintlayout/core/motion/Motion;IIIZZ)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final encodeKeyFrames(Ljava/lang/StringBuilder;[F[I[II)V
    .locals 6

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string/jumbo v0, "keyTypes : ["

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    move v1, v0

    .line 12
    :goto_0
    const/16 v2, 0x2c

    .line 13
    .line 14
    const/16 v3, 0x20

    .line 15
    .line 16
    if-ge v1, p5, :cond_1

    .line 17
    .line 18
    aget v4, p3, v1

    .line 19
    .line 20
    new-instance v5, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string p3, "],\n"

    .line 45
    .line 46
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string/jumbo p3, "keyPos : ["

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    mul-int/lit8 p3, p5, 0x2

    .line 56
    .line 57
    move v1, v0

    .line 58
    :goto_1
    if-ge v1, p3, :cond_2

    .line 59
    .line 60
    aget v4, p2, v1

    .line 61
    .line 62
    new-instance v5, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const-string p2, "],\n "

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string/jumbo p3, "keyFrames : ["

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :goto_2
    if-ge v0, p5, :cond_3

    .line 98
    .line 99
    aget p3, p4, v0

    .line 100
    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    add-int/lit8 v0, v0, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method private final measureConstraintSet--hBUhpc(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/State;->reset()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p2, v0, p3}, Landroidx/constraintlayout/compose/ConstraintSet;->applyTo(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p2, p3}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->buildMapping(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-virtual {p2, p3}, Landroidx/constraintlayout/core/state/State;->apply(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    const/4 v0, 0x0

    .line 46
    move v1, v0

    .line 47
    :goto_0
    if-ge v1, p3, :cond_0

    .line 48
    .line 49
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setAnimated(Z)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p0, p4, p5}, Landroidx/constraintlayout/compose/Measurer2;->applyRootSize-BRTryo0(J)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->updateHierarchy()V

    .line 70
    .line 71
    .line 72
    iget-boolean p2, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->DEBUG:Z

    .line 73
    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    const-string p3, "ConstraintLayout"

    .line 81
    .line 82
    invoke-virtual {p2, p3}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setDebugName(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    :goto_1
    if-ge v0, p3, :cond_4

    .line 98
    .line 99
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    check-cast p4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 104
    .line 105
    invoke-virtual {p4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p5

    .line 109
    instance-of v1, p5, Landroidx/compose/ui/layout/Measurable;

    .line 110
    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    check-cast p5, Landroidx/compose/ui/layout/Measurable;

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_1
    const/4 p5, 0x0

    .line 117
    :goto_2
    if-eqz p5, :cond_2

    .line 118
    .line 119
    invoke-static {p5}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p5

    .line 123
    if-eqz p5, :cond_2

    .line 124
    .line 125
    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p5

    .line 129
    if-nez p5, :cond_3

    .line 130
    .line 131
    :cond_2
    const-string p5, "NOTAG"

    .line 132
    .line 133
    :cond_3
    invoke-virtual {p4, p5}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setDebugName(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    add-int/lit8 v0, v0, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->setOptimizationLevel(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const/4 v8, 0x0

    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v1, 0x0

    .line 153
    const/4 v2, 0x0

    .line 154
    const/4 v3, 0x0

    .line 155
    const/4 v4, 0x0

    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v6, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    invoke-virtual/range {v0 .. v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->measure(IIIIIIIII)J

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method private final needsRemeasure-NN6Ew-U(JLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/Transition;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getFrameCache()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->oldConstraints:Landroidx/compose/ui/unit/Constraints;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    if-eqz p4, :cond_1

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-interface {p4, v2, v3, p1, p2}, Landroidx/constraintlayout/compose/ShouldInvalidateCallback;->invoke-N9IONVI(JJ)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    return v1

    .line 41
    :cond_1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    if-eqz p4, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p4, v0}, Landroidx/constraintlayout/core/state/State;->sameFixedHeight(I)Z

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    if-eqz p4, :cond_3

    .line 60
    .line 61
    :cond_2
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-eqz p4, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-virtual {p4, p1}, Landroidx/constraintlayout/core/state/State;->sameFixedWidth(I)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    :cond_3
    return v1

    .line 82
    :cond_4
    sget-object p1, Landroidx/constraintlayout/compose/CompositionSource;->Content:Landroidx/constraintlayout/compose/CompositionSource;

    .line 83
    .line 84
    if-ne p3, p1, :cond_5

    .line 85
    .line 86
    return v1

    .line 87
    :cond_5
    const/4 p1, 0x0

    .line 88
    return p1

    .line 89
    :cond_6
    :goto_0
    return v1
.end method

.method private final recalculateInterpolation-36Wf7g4(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;IFZ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Landroidx/constraintlayout/compose/TransitionImpl;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;IFZ)V"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p6

    .line 2
    .line 3
    move/from16 v7, p9

    .line 4
    .line 5
    iput v7, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->lastProgressInInterpolation:F

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    if-eqz p10, :cond_3

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/constraintlayout/core/state/Transition;->clear()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->resetMeasureState$constraintlayout_compose_release()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v2}, Landroidx/constraintlayout/core/state/Dimension;->createFixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->createWrap()Landroidx/constraintlayout/core/state/Dimension;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/core/state/Dimension;->min(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/state/State;->width(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/State;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, Landroidx/constraintlayout/core/state/Dimension;->createFixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->createWrap()Landroidx/constraintlayout/core/state/Dimension;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/core/state/Dimension;->min(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :goto_1
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/state/State;->height(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/State;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1, p1, p2}, Landroidx/constraintlayout/compose/State;->setRootIncomingConstraints-BRTryo0(J)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v2, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 98
    .line 99
    const/4 v9, 0x1

    .line 100
    if-ne p3, v2, :cond_2

    .line 101
    .line 102
    move v2, v9

    .line 103
    goto :goto_2

    .line 104
    :cond_2
    move v2, v8

    .line 105
    :goto_2
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/state/State;->setRtl(Z)V

    .line 106
    .line 107
    .line 108
    move-object v0, p0

    .line 109
    move-wide v4, p1

    .line 110
    move-object v2, p4

    .line 111
    move-object/from16 v3, p7

    .line 112
    .line 113
    move/from16 v1, p8

    .line 114
    .line 115
    invoke-direct/range {v0 .. v5}, Landroidx/constraintlayout/compose/MotionMeasurer;->measureConstraintSet--hBUhpc(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1, v2, v8}, Landroidx/constraintlayout/core/state/Transition;->updateFrom(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;I)V

    .line 125
    .line 126
    .line 127
    move-object v2, p5

    .line 128
    move/from16 v1, p8

    .line 129
    .line 130
    invoke-direct/range {v0 .. v5}, Landroidx/constraintlayout/compose/MotionMeasurer;->measureConstraintSet--hBUhpc(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 134
    .line 135
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v1, v2, v9}, Landroidx/constraintlayout/core/state/Transition;->updateFrom(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;I)V

    .line 140
    .line 141
    .line 142
    if-eqz v6, :cond_4

    .line 143
    .line 144
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 145
    .line 146
    invoke-virtual {v6, v1}, Landroidx/constraintlayout/compose/TransitionImpl;->applyKeyFramesTo(Landroidx/constraintlayout/core/state/Transition;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_3
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    move-object/from16 v3, p7

    .line 155
    .line 156
    invoke-static {v1, v3}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->buildMapping(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    :cond_4
    :goto_3
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 160
    .line 161
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    invoke-virtual {v1, v2, v3, v7}, Landroidx/constraintlayout/core/state/Transition;->interpolate(IIF)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    iget-object v2, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/constraintlayout/core/state/Transition;->getInterpolatedWidth()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setWidth(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iget-object v2, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/constraintlayout/core/state/Transition;->getInterpolatedHeight()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setHeight(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    :goto_4
    const/4 v3, 0x0

    .line 219
    if-ge v8, v2, :cond_8

    .line 220
    .line 221
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 226
    .line 227
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    instance-of v6, v5, Landroidx/compose/ui/layout/Measurable;

    .line 232
    .line 233
    if-eqz v6, :cond_5

    .line 234
    .line 235
    move-object v3, v5

    .line 236
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 237
    .line 238
    :cond_5
    if-nez v3, :cond_6

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_6
    iget-object v5, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 242
    .line 243
    invoke-virtual {v5, v4}, Landroidx/constraintlayout/core/state/Transition;->getInterpolated(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    if-nez v4, :cond_7

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_7
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getPlaceables()Ljava/util/Map;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    sget-object v6, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 255
    .line 256
    invoke-virtual {v4}, Landroidx/constraintlayout/core/state/WidgetFrame;->width()I

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    invoke-virtual {v4}, Landroidx/constraintlayout/core/state/WidgetFrame;->height()I

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    invoke-virtual {v6, v7, v9}, Landroidx/compose/ui/unit/Constraints$Companion;->fixed-JhjzzOo(II)J

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    invoke-interface {v3, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-interface {v5, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getFrameCache()Ljava/util/Map;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-static {v3}, Landroidx/constraintlayout/compose/MeasurerKt;->getAnyOrNullId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    :goto_5
    add-int/lit8 v8, v8, 0x1

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_8
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getLayoutInformationReceiver()Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    if-eqz v1, :cond_9

    .line 294
    .line 295
    invoke-interface {v1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getLayoutInformationMode()Landroidx/constraintlayout/compose/LayoutInfoFlags;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    :cond_9
    sget-object v1, Landroidx/constraintlayout/compose/LayoutInfoFlags;->BOUNDS:Landroidx/constraintlayout/compose/LayoutInfoFlags;

    .line 300
    .line 301
    if-ne v3, v1, :cond_a

    .line 302
    .line 303
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/MotionMeasurer;->computeLayoutResult()V

    .line 304
    .line 305
    .line 306
    :cond_a
    return-void
.end method

.method private static final transition$lambda$1(Landroidx/compose/ui/unit/Density;F)F
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method


# virtual methods
.method public final clearConstraintSets()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/core/state/Transition;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getFrameCache()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public computeLayoutResult()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v2, "{ "

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/MotionMeasurer;->encodeRoot(Ljava/lang/StringBuilder;)V

    .line 15
    .line 16
    .line 17
    const/16 v2, 0x32

    .line 18
    .line 19
    new-array v3, v2, [I

    .line 20
    .line 21
    new-array v4, v2, [I

    .line 22
    .line 23
    const/16 v2, 0x64

    .line 24
    .line 25
    new-array v2, v2, [F

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    const/4 v9, 0x0

    .line 40
    :goto_0
    if-ge v9, v7, :cond_1

    .line 41
    .line 42
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 47
    .line 48
    iget-object v10, v0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 49
    .line 50
    iget-object v11, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v10, v11}, Landroidx/constraintlayout/core/state/Transition;->getStart(Ljava/lang/String;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    iget-object v11, v0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 57
    .line 58
    iget-object v12, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v11, v12}, Landroidx/constraintlayout/core/state/Transition;->getEnd(Ljava/lang/String;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    iget-object v12, v0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 65
    .line 66
    iget-object v13, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v12, v13}, Landroidx/constraintlayout/core/state/Transition;->getInterpolated(Ljava/lang/String;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    iget-object v13, v0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 73
    .line 74
    iget-object v14, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v13, v14}, Landroidx/constraintlayout/core/state/Transition;->getPath(Ljava/lang/String;)[F

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    iget-object v14, v0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 81
    .line 82
    iget-object v15, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v14, v15, v2, v3, v4}, Landroidx/constraintlayout/core/state/Transition;->getKeyFrames(Ljava/lang/String;[F[I[I)I

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    new-instance v15, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const/16 v8, 0x20

    .line 94
    .line 95
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v5, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v5, ": {"

    .line 104
    .line 105
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v5, " interpolated : "

    .line 116
    .line 117
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const/4 v5, 0x1

    .line 121
    invoke-virtual {v12, v1, v5}, Landroidx/constraintlayout/core/state/WidgetFrame;->serialize(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v5, ", start : "

    .line 125
    .line 126
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10, v1}, Landroidx/constraintlayout/core/state/WidgetFrame;->serialize(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v5, ", end : "

    .line 133
    .line 134
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v11, v1}, Landroidx/constraintlayout/core/state/WidgetFrame;->serialize(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    move v5, v14

    .line 141
    invoke-direct/range {v0 .. v5}, Landroidx/constraintlayout/compose/MotionMeasurer;->encodeKeyFrames(Ljava/lang/StringBuilder;[F[I[II)V

    .line 142
    .line 143
    .line 144
    const-string v0, " path : ["

    .line 145
    .line 146
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    array-length v0, v13

    .line 150
    const/4 v5, 0x0

    .line 151
    :goto_1
    if-ge v5, v0, :cond_0

    .line 152
    .line 153
    aget v10, v13, v5

    .line 154
    .line 155
    new-instance v11, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v10, " ,"

    .line 167
    .line 168
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    add-int/lit8 v5, v5, 0x1

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_0
    const-string v0, " ] "

    .line 182
    .line 183
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string/jumbo v0, "}, "

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    add-int/lit8 v9, v9, 0x1

    .line 193
    .line 194
    move-object/from16 v0, p0

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_1
    const-string v0, " }"

    .line 199
    .line 200
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/compose/Measurer2;->getLayoutInformationReceiver()Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-eqz v0, :cond_2

    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-interface {v0, v1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->setLayoutInformation(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_2
    return-void
.end method

.method public final drawDebug(Landroidx/compose/ui/graphics/drawscope/DrawScope;ZZZ)V
    .locals 13

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 2
    .line 3
    const/4 v2, 0x2

    .line 4
    new-array v2, v2, [F

    .line 5
    .line 6
    fill-array-data v2, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-virtual {v0, v2, v3}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect([FF)Landroidx/compose/ui/graphics/PathEffect;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    const/4 v2, 0x0

    .line 27
    move v9, v2

    .line 28
    :goto_0
    if-ge v9, v8, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 35
    .line 36
    iget-object v3, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/Transition;->getStart(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v5, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 43
    .line 44
    invoke-virtual {v5, v2}, Landroidx/constraintlayout/core/state/Transition;->getEnd(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    sget-object v10, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 51
    .line 52
    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getBlue-0d7_KjU()J

    .line 53
    .line 54
    .line 55
    move-result-wide v5

    .line 56
    move-object v1, p0

    .line 57
    move-object v2, p1

    .line 58
    invoke-direct/range {v1 .. v6}, Landroidx/constraintlayout/compose/MotionMeasurer;->drawFrame-g2O1Hgs(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V

    .line 59
    .line 60
    .line 61
    move-object v11, v3

    .line 62
    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getBlue-0d7_KjU()J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    move-object v3, v7

    .line 67
    invoke-direct/range {v1 .. v6}, Landroidx/constraintlayout/compose/MotionMeasurer;->drawFrame-g2O1Hgs(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/high16 v2, 0x40000000    # 2.0f

    .line 79
    .line 80
    invoke-interface {v1, v2, v2}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 81
    .line 82
    .line 83
    const/high16 v12, -0x40000000    # -2.0f

    .line 84
    .line 85
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    move-object v1, p0

    .line 90
    move-object v2, p1

    .line 91
    move-object v3, v11

    .line 92
    invoke-direct/range {v1 .. v6}, Landroidx/constraintlayout/compose/MotionMeasurer;->drawFrame-g2O1Hgs(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V

    .line 93
    .line 94
    .line 95
    move-object v11, v3

    .line 96
    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    move-object v1, p0

    .line 101
    move-object v2, p1

    .line 102
    move-object v3, v7

    .line 103
    invoke-direct/range {v1 .. v6}, Landroidx/constraintlayout/compose/MotionMeasurer;->drawFrame-g2O1Hgs(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    move-object v10, v4

    .line 107
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {v1, v12, v12}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-interface {v1, v12, v12}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_0
    move-object v11, v3

    .line 133
    move-object v10, v4

    .line 134
    :goto_1
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 135
    .line 136
    .line 137
    move-result-wide v1

    .line 138
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 143
    .line 144
    .line 145
    move-result-wide v1

    .line 146
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    move-object v1, p0

    .line 151
    move-object v2, p1

    .line 152
    move/from16 v6, p3

    .line 153
    .line 154
    move/from16 v7, p4

    .line 155
    .line 156
    move-object v5, v11

    .line 157
    invoke-direct/range {v1 .. v7}, Landroidx/constraintlayout/compose/MotionMeasurer;->drawPaths(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;ZZ)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v9, v9, 0x1

    .line 161
    .line 162
    move-object v4, v10

    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_1
    return-void

    .line 166
    nop

    .line 167
    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method public final encodeRoot(Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    const-string v0, "  root: {"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "interpolated: { left:  0,"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v0, "  top:  0,"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "  right:   "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, " ,"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v2, "  bottom:  "

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, " } }"

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final getCustomColor-XeAY9LY(Ljava/lang/String;Ljava/lang/String;F)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/state/Transition;->contains(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    return-wide p1

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v0, v1, v2, p3}, Landroidx/constraintlayout/core/state/Transition;->interpolate(IIF)V

    .line 35
    .line 36
    .line 37
    iget-object p3, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 38
    .line 39
    invoke-virtual {p3, p1}, Landroidx/constraintlayout/core/state/Transition;->getInterpolated(Ljava/lang/String;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/core/state/WidgetFrame;->containsCustom(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-nez p3, :cond_1

    .line 48
    .line 49
    sget-object p1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    return-wide p1

    .line 56
    :cond_1
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/core/state/WidgetFrame;->getCustomColor(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-static {p1}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    return-wide p1
.end method

.method public final getCustomFloat(Ljava/lang/String;Ljava/lang/String;F)F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/state/Transition;->contains(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v0, v1, v2, p3}, Landroidx/constraintlayout/core/state/Transition;->interpolate(IIF)V

    .line 31
    .line 32
    .line 33
    iget-object p3, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 34
    .line 35
    invoke-virtual {p3, p1}, Landroidx/constraintlayout/core/state/Transition;->getInterpolated(Ljava/lang/String;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/core/state/WidgetFrame;->getCustomFloat(Ljava/lang/String;)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1
.end method

.method public final getTransition()Landroidx/constraintlayout/core/state/Transition;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 2
    .line 3
    return-object v0
.end method

.method public final initWith(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/TransitionImpl;F)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/MotionMeasurer;->clearConstraintSets()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne p3, v1, :cond_0

    .line 13
    .line 14
    move p3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p3, v3

    .line 17
    :goto_0
    invoke-virtual {v0, p3}, Landroidx/constraintlayout/core/state/State;->setRtl(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {p1, p3, v0}, Landroidx/constraintlayout/compose/ConstraintSet;->applyTo(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    iget-object p3, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 32
    .line 33
    invoke-interface {p1, p3, v3}, Landroidx/constraintlayout/compose/ConstraintSet;->applyTo(Landroidx/constraintlayout/core/state/Transition;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p3, v0}, Landroidx/constraintlayout/core/state/State;->apply(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;)V

    .line 45
    .line 46
    .line 47
    iget-object p3, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p3, v0, v3}, Landroidx/constraintlayout/core/state/Transition;->updateFrom(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {p1, p3, v0}, Landroidx/constraintlayout/compose/ConstraintSet;->applyTo(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 68
    .line 69
    invoke-interface {p2, p1, v2}, Landroidx/constraintlayout/compose/ConstraintSet;->applyTo(Landroidx/constraintlayout/core/state/Transition;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getState()Landroidx/constraintlayout/compose/State;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/core/state/State;->apply(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p1, p2, v2}, Landroidx/constraintlayout/core/state/Transition;->updateFrom(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 93
    .line 94
    invoke-virtual {p1, v3, v3, p5}, Landroidx/constraintlayout/core/state/Transition;->interpolate(IIF)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->transition:Landroidx/constraintlayout/core/state/Transition;

    .line 98
    .line 99
    invoke-virtual {p4, p1}, Landroidx/constraintlayout/compose/TransitionImpl;->applyAllTo(Landroidx/constraintlayout/core/state/Transition;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final performInterpolationMeasure-LzAeyeM(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;Ljava/util/Map;IFLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Landroidx/constraintlayout/compose/TransitionImpl;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;IF",
            "Landroidx/constraintlayout/compose/CompositionSource;",
            "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p8}, Landroidx/constraintlayout/compose/Measurer2;->setPlaceables(Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p11, p12}, Landroidx/constraintlayout/compose/MotionMeasurer;->needsRemeasure-NN6Ew-U(JLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)Z

    .line 5
    .line 6
    .line 7
    move-result p11

    .line 8
    iget p8, p0, Landroidx/constraintlayout/compose/MotionMeasurer;->lastProgressInInterpolation:F

    .line 9
    .line 10
    cmpg-float p8, p8, p10

    .line 11
    .line 12
    if-nez p8, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getLayoutInformationReceiver()Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 15
    .line 16
    .line 17
    move-result-object p8

    .line 18
    const/high16 p12, -0x80000000

    .line 19
    .line 20
    if-eqz p8, :cond_0

    .line 21
    .line 22
    invoke-interface {p8}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedWidth()I

    .line 23
    .line 24
    .line 25
    move-result p8

    .line 26
    if-ne p8, p12, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getLayoutInformationReceiver()Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 30
    .line 31
    .line 32
    move-result-object p8

    .line 33
    if-eqz p8, :cond_1

    .line 34
    .line 35
    invoke-interface {p8}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedHeight()I

    .line 36
    .line 37
    .line 38
    move-result p8

    .line 39
    if-ne p8, p12, :cond_1

    .line 40
    .line 41
    :goto_0
    if-eqz p11, :cond_2

    .line 42
    .line 43
    :cond_1
    move-object p8, p7

    .line 44
    move-object p7, p6

    .line 45
    move-object p6, p5

    .line 46
    move-object p5, p4

    .line 47
    move-object p4, p3

    .line 48
    move-wide p2, p1

    .line 49
    move-object p1, p0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-wide p2, p1

    .line 52
    move-object p1, p0

    .line 53
    goto :goto_2

    .line 54
    :goto_1
    invoke-direct/range {p1 .. p11}, Landroidx/constraintlayout/compose/MotionMeasurer;->recalculateInterpolation-36Wf7g4(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;IFZ)V

    .line 55
    .line 56
    .line 57
    :goto_2
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/Constraints;->box-impl(J)Landroidx/compose/ui/unit/Constraints;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iput-object p2, p1, Landroidx/constraintlayout/compose/MotionMeasurer;->oldConstraints:Landroidx/compose/ui/unit/Constraints;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer2;->getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-virtual {p3}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    .line 80
    .line 81
    .line 82
    move-result-wide p2

    .line 83
    return-wide p2
.end method
