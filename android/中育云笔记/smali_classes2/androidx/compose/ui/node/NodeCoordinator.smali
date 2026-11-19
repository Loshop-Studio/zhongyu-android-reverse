.class public abstract Landroidx/compose/ui/node/NodeCoordinator;
.super Landroidx/compose/ui/node/LookaheadCapablePlaceable;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/Measurable;
.implements Landroidx/compose/ui/layout/LayoutCoordinates;
.implements Landroidx/compose/ui/node/OwnerScope;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/node/NodeCoordinator$Companion;,
        Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field public static final Companion:Landroidx/compose/ui/node/NodeCoordinator$Companion;

.field public static final ExpectAttachedLayoutCoordinates:Ljava/lang/String; = "LayoutCoordinate operations are only valid when isAttached is true"

.field private static final PointerInputSource:Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;

.field private static final SemanticsSource:Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;

.field public static final UnmeasuredError:Ljava/lang/String; = "Asking for measurement result of unmeasured layout modifier"

.field private static final graphicsLayerScope:Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;

.field private static final onCommitAffectingLayer:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private static final onCommitAffectingLayerParams:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private static final tmpLayerPositionalProperties:Landroidx/compose/ui/node/LayerPositionalProperties;

.field private static final tmpMatrix:[F


# instance fields
.field private _drawBlock:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private _measureResult:Landroidx/compose/ui/layout/MeasureResult;

.field private _rectCache:Landroidx/compose/ui/geometry/MutableRect;

.field private drawBlockCanvas:Landroidx/compose/ui/graphics/Canvas;

.field private drawBlockParentLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

.field private explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

.field private forceMeasureWithLookaheadConstraints:Z

.field private forcePlaceWithLookaheadOffset:Z

.field private final invalidateParentLayer:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private isClipping:Z

.field private lastLayerAlpha:F

.field private lastLayerDrawingWasSkipped:Z

.field private layer:Landroidx/compose/ui/node/OwnedLayer;

.field private layerBlock:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private layerDensity:Landroidx/compose/ui/unit/Density;

.field private layerLayoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

.field private layerPositionalProperties:Landroidx/compose/ui/node/LayerPositionalProperties;

.field private final layoutNode:Landroidx/compose/ui/node/LayoutNode;

.field private oldAlignmentLines:Landroidx/collection/MutableObjectIntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectIntMap<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            ">;"
        }
    .end annotation
.end field

.field private position:J

.field private released:Z

.field private wrapped:Landroidx/compose/ui/node/NodeCoordinator;

.field private wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

.field private zIndex:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/node/NodeCoordinator$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/node/NodeCoordinator$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->Companion:Landroidx/compose/ui/node/NodeCoordinator$Companion;

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator$Companion$onCommitAffectingLayerParams$1;->INSTANCE:Landroidx/compose/ui/node/NodeCoordinator$Companion$onCommitAffectingLayerParams$1;

    .line 10
    .line 11
    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->onCommitAffectingLayerParams:Lhd/l;

    .line 12
    .line 13
    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator$Companion$onCommitAffectingLayer$1;->INSTANCE:Landroidx/compose/ui/node/NodeCoordinator$Companion$onCommitAffectingLayer$1;

    .line 14
    .line 15
    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->onCommitAffectingLayer:Lhd/l;

    .line 16
    .line 17
    new-instance v0, Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;

    .line 18
    .line 19
    invoke-direct {v0}, Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->graphicsLayerScope:Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;

    .line 23
    .line 24
    new-instance v0, Landroidx/compose/ui/node/LayerPositionalProperties;

    .line 25
    .line 26
    invoke-direct {v0}, Landroidx/compose/ui/node/LayerPositionalProperties;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->tmpLayerPositionalProperties:Landroidx/compose/ui/node/LayerPositionalProperties;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-static {v1, v0, v1}, Landroidx/compose/ui/graphics/Matrix;->constructor-impl$default([FILkotlin/jvm/internal/n;)[F

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->tmpMatrix:[F

    .line 37
    .line 38
    new-instance v0, Landroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1;

    .line 39
    .line 40
    invoke-direct {v0}, Landroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1;-><init>()V

    .line 41
    .line 42
    .line 43
    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->PointerInputSource:Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;

    .line 44
    .line 45
    new-instance v0, Landroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1;

    .line 46
    .line 47
    invoke-direct {v0}, Landroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->SemanticsSource:Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerDensity:Landroidx/compose/ui/unit/Density;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerLayoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 25
    .line 26
    const p1, 0x3f4ccccd    # 0.8f

    .line 27
    .line 28
    .line 29
    iput p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->lastLayerAlpha:F

    .line 30
    .line 31
    sget-object p1, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iput-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->position:J

    .line 38
    .line 39
    new-instance p1, Landroidx/compose/ui/node/NodeCoordinator$invalidateParentLayer$1;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Landroidx/compose/ui/node/NodeCoordinator$invalidateParentLayer$1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->invalidateParentLayer:Lhd/a;

    .line 45
    .line 46
    return-void
.end method

.method public static final synthetic access$drawContainedDrawModifiers(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->drawContainedDrawModifiers(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getDrawBlockCanvas$p(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/graphics/Canvas;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/node/NodeCoordinator;->drawBlockCanvas:Landroidx/compose/ui/graphics/Canvas;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getDrawBlockParentLayer$p(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/node/NodeCoordinator;->drawBlockParentLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getGraphicsLayerScope$cp()Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator;->graphicsLayerScope:Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getOnCommitAffectingLayer$cp()Lhd/l;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator;->onCommitAffectingLayer:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getPointerInputSource$cp()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator;->PointerInputSource:Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSemanticsSource$cp()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator;->SemanticsSource:Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSnapshotObserver(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/OwnerSnapshotObserver;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$headNode(Landroidx/compose/ui/node/NodeCoordinator;Z)Landroidx/compose/ui/Modifier$Node;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->headNode(Z)Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$outOfBoundsHit-8NAm7pk(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Landroidx/compose/ui/node/NodeCoordinator;->outOfBoundsHit-8NAm7pk(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setDrawBlockCanvas$p(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/graphics/Canvas;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->drawBlockCanvas:Landroidx/compose/ui/graphics/Canvas;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setDrawBlockParentLayer$p(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->drawBlockParentLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLastLayerDrawingWasSkipped$p(Landroidx/compose/ui/node/NodeCoordinator;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->lastLayerDrawingWasSkipped:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setMeasurementConstraints-BRTryo0(Landroidx/compose/ui/node/NodeCoordinator;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/Placeable;->setMeasurementConstraints-BRTryo0(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final ancestorToLocal(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->ancestorToLocal(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    invoke-direct {p0, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->fromParentRect(Landroidx/compose/ui/geometry/MutableRect;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final ancestorToLocal-S_NoaFU(Landroidx/compose/ui/node/NodeCoordinator;JZ)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/ui/node/NodeCoordinator;->ancestorToLocal-S_NoaFU(Landroidx/compose/ui/node/NodeCoordinator;JZ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2, p4}, Landroidx/compose/ui/node/NodeCoordinator;->fromParentPosition-8S9VItk(JZ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3, p4}, Landroidx/compose/ui/node/NodeCoordinator;->fromParentPosition-8S9VItk(JZ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method private final drawContainedDrawModifiers(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->head-H91voCI(I)Landroidx/compose/ui/Modifier$Node;

    .line 7
    .line 8
    .line 9
    move-result-object v6

    .line 10
    if-nez v6, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->performDraw(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getMDrawScope$ui_release()Landroidx/compose/ui/node/LayoutNodeDrawScope;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntSizeKt;->toSize-ozmzZPI(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    move-object v5, p0

    .line 33
    move-object v2, p1

    .line 34
    move-object v7, p2

    .line 35
    invoke-virtual/range {v1 .. v7}, Landroidx/compose/ui/node/LayoutNodeDrawScope;->draw-eZhPAX0$ui_release(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic fromParentPosition-8S9VItk$default(Landroidx/compose/ui/node/NodeCoordinator;JZILjava/lang/Object;)J
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->fromParentPosition-8S9VItk(JZ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    return-wide p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final fromParentRect(Landroidx/compose/ui/geometry/MutableRect;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->getLeft()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v0, v0

    .line 14
    sub-float/2addr v1, v0

    .line 15
    invoke-virtual {p1, v1}, Landroidx/compose/ui/geometry/MutableRect;->setLeft(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->getRight()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-float/2addr v1, v0

    .line 23
    invoke-virtual {p1, v1}, Landroidx/compose/ui/geometry/MutableRect;->setRight(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->getTop()F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    invoke-virtual {p1, v1}, Landroidx/compose/ui/geometry/MutableRect;->setTop(F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->getBottom()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sub-float/2addr v1, v0

    .line 48
    invoke-virtual {p1, v1}, Landroidx/compose/ui/geometry/MutableRect;->setBottom(F)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-interface {v0, p1, v1}, Landroidx/compose/ui/node/OwnedLayer;->mapBounds(Landroidx/compose/ui/geometry/MutableRect;Z)V

    .line 57
    .line 58
    .line 59
    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->isClipping:Z

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    const/16 p2, 0x20

    .line 70
    .line 71
    shr-long/2addr v0, p2

    .line 72
    long-to-int p2, v0

    .line 73
    int-to-float p2, p2

    .line 74
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    const-wide v2, 0xffffffffL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long/2addr v0, v2

    .line 84
    long-to-int v0, v0

    .line 85
    int-to-float v0, v0

    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {p1, v1, v1, p2, v0}, Landroidx/compose/ui/geometry/MutableRect;->intersect(FFFF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    :cond_0
    return-void
.end method

.method private final getDrawBlock()Lhd/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->_drawBlock:Lhd/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/node/NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/compose/ui/node/NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroidx/compose/ui/node/NodeCoordinator$drawBlock$1;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0}, Landroidx/compose/ui/node/NodeCoordinator$drawBlock$1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;Lhd/a;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->_drawBlock:Lhd/p;

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    return-object v0
.end method

.method private final getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method private final hasNode-H91voCI(I)Z
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/node/NodeKindKt;->getIncludeSelfInTraversal-H91voCI(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->headNode(Z)Landroidx/compose/ui/Modifier$Node;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0, p1}, Landroidx/compose/ui/node/DelegatableNodeKt;->has-64DMado(Landroidx/compose/ui/node/DelegatableNode;I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    return v1
.end method

.method private final headNode(Z)Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    return-object v0

    .line 43
    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_3
    return-object v0
.end method

.method private final hit-5ShdDok(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->hitTestChild-qzLsGqo(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    move-object v1, p2

    .line 14
    move-wide v2, p3

    .line 15
    move-object v4, p5

    .line 16
    move v5, p6

    .line 17
    move v6, p7

    .line 18
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getHitDepth$p(Landroidx/compose/ui/node/HitTestResult;)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getHitDepth$p(Landroidx/compose/ui/node/HitTestResult;)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    add-int/lit8 p3, p3, 0x1

    .line 27
    .line 28
    invoke-virtual {v4}, Landroidx/compose/ui/node/HitTestResult;->size()I

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    invoke-static {v4, p3, p4}, Landroidx/compose/ui/node/HitTestResult;->access$removeNodesInRange(Landroidx/compose/ui/node/HitTestResult;II)V

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getHitDepth$p(Landroidx/compose/ui/node/HitTestResult;)I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    add-int/lit8 p3, p3, 0x1

    .line 40
    .line 41
    invoke-static {v4, p3}, Landroidx/compose/ui/node/HitTestResult;->access$setHitDepth$p(Landroidx/compose/ui/node/HitTestResult;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getValues$p(Landroidx/compose/ui/node/HitTestResult;)Landroidx/collection/MutableObjectList;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-virtual {p3, p1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getDistanceFromEdgeAndFlags$p(Landroidx/compose/ui/node/HitTestResult;)Landroidx/collection/MutableLongList;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    const/high16 p4, -0x40800000    # -1.0f

    .line 56
    .line 57
    const/4 p5, 0x0

    .line 58
    invoke-static {p4, v6, p5}, Landroidx/compose/ui/node/HitTestResultKt;->access$DistanceAndFlags(FZZ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p4

    .line 62
    invoke-virtual {p3, p4, p5}, Landroidx/collection/MutableLongList;->add(J)Z

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;->entityType-OLwlOKw()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    const/4 p4, 0x2

    .line 70
    invoke-static {p4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 71
    .line 72
    .line 73
    move-result p4

    .line 74
    invoke-static {p1, p3, p4}, Landroidx/compose/ui/node/NodeCoordinatorKt;->access$nextUntil-hw7D004(Landroidx/compose/ui/node/DelegatableNode;II)Landroidx/compose/ui/Modifier$Node;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    move-object v0, p0

    .line 79
    move v7, v6

    .line 80
    move v6, v5

    .line 81
    move-object v5, v4

    .line 82
    move-wide v3, v2

    .line 83
    move-object v2, v1

    .line 84
    move-object v1, p1

    .line 85
    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/node/NodeCoordinator;->hit-5ShdDok(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V

    .line 86
    .line 87
    .line 88
    move-object v4, v5

    .line 89
    invoke-static {v4, p2}, Landroidx/compose/ui/node/HitTestResult;->access$setHitDepth$p(Landroidx/compose/ui/node/HitTestResult;I)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method private final hitNear-Fh5PU_I(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->hitTestChild-qzLsGqo(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move-object/from16 v4, p5

    .line 17
    .line 18
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getHitDepth$p(Landroidx/compose/ui/node/HitTestResult;)I

    .line 19
    .line 20
    .line 21
    move-result v10

    .line 22
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getHitDepth$p(Landroidx/compose/ui/node/HitTestResult;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    invoke-virtual {v4}, Landroidx/compose/ui/node/HitTestResult;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v4, v0, v1}, Landroidx/compose/ui/node/HitTestResult;->access$removeNodesInRange(Landroidx/compose/ui/node/HitTestResult;II)V

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getHitDepth$p(Landroidx/compose/ui/node/HitTestResult;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    invoke-static {v4, v0}, Landroidx/compose/ui/node/HitTestResult;->access$setHitDepth$p(Landroidx/compose/ui/node/HitTestResult;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getValues$p(Landroidx/compose/ui/node/HitTestResult;)Landroidx/collection/MutableObjectList;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-static {v4}, Landroidx/compose/ui/node/HitTestResult;->access$getDistanceFromEdgeAndFlags$p(Landroidx/compose/ui/node/HitTestResult;)Landroidx/collection/MutableLongList;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const/4 v1, 0x0

    .line 56
    move/from16 v7, p7

    .line 57
    .line 58
    move/from16 v8, p8

    .line 59
    .line 60
    invoke-static {v8, v7, v1}, Landroidx/compose/ui/node/HitTestResultKt;->access$DistanceAndFlags(FZZ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    invoke-virtual {v0, v1, v2}, Landroidx/collection/MutableLongList;->add(J)Z

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;->entityType-OLwlOKw()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x2

    .line 72
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {p1, v0, v1}, Landroidx/compose/ui/node/NodeCoordinatorKt;->access$nextUntil-hw7D004(Landroidx/compose/ui/node/DelegatableNode;II)Landroidx/compose/ui/Modifier$Node;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/4 v9, 0x1

    .line 81
    move-object v0, p0

    .line 82
    move-object v2, p2

    .line 83
    move/from16 v6, p6

    .line 84
    .line 85
    move-object v5, v4

    .line 86
    move-wide v3, p3

    .line 87
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/node/NodeCoordinator;->outOfBoundsHit-8NAm7pk(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V

    .line 88
    .line 89
    .line 90
    move-object v4, v5

    .line 91
    invoke-static {v4, v10}, Landroidx/compose/ui/node/HitTestResult;->access$setHitDepth$p(Landroidx/compose/ui/node/HitTestResult;I)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method private final isInExpandedTouchBounds-ThD-n1k(Landroidx/compose/ui/Modifier$Node;JI)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getStylus-T8wyACA()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {p4, v2}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getEraser-T8wyACA()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p4, v1}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    if-nez p4, :cond_1

    .line 26
    .line 27
    return v0

    .line 28
    :cond_1
    const/16 p4, 0x10

    .line 29
    .line 30
    invoke-static {p4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v3, v2

    .line 36
    :goto_0
    if-eqz p1, :cond_a

    .line 37
    .line 38
    instance-of v4, p1, Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    check-cast p1, Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 44
    .line 45
    invoke-interface {p1}, Landroidx/compose/ui/node/PointerInputModifierNode;->getTouchBoundsExpansion-RZrCHBk()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    const/16 p1, 0x20

    .line 50
    .line 51
    shr-long v3, p2, p1

    .line 52
    .line 53
    long-to-int p1, v3

    .line 54
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result p4

    .line 58
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v1, v2, v3}, Landroidx/compose/ui/node/TouchBoundsExpansion;->computeLeft-impl$ui_release(JLandroidx/compose/ui/unit/LayoutDirection;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    neg-int v3, v3

    .line 67
    int-to-float v3, v3

    .line 68
    cmpl-float p4, p4, v3

    .line 69
    .line 70
    if-ltz p4, :cond_2

    .line 71
    .line 72
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredWidth()I

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v1, v2, v3}, Landroidx/compose/ui/node/TouchBoundsExpansion;->computeRight-impl$ui_release(JLandroidx/compose/ui/unit/LayoutDirection;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    add-int/2addr p4, v3

    .line 89
    int-to-float p4, p4

    .line 90
    cmpg-float p1, p1, p4

    .line 91
    .line 92
    if-gez p1, :cond_2

    .line 93
    .line 94
    const-wide v3, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    and-long p1, p2, v3

    .line 100
    .line 101
    long-to-int p1, p1

    .line 102
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    invoke-static {v1, v2}, Landroidx/compose/ui/node/TouchBoundsExpansion;->getTop-impl(J)I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    neg-int p3, p3

    .line 111
    int-to-float p3, p3

    .line 112
    cmpl-float p2, p2, p3

    .line 113
    .line 114
    if-ltz p2, :cond_2

    .line 115
    .line 116
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredHeight()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-static {v1, v2}, Landroidx/compose/ui/node/TouchBoundsExpansion;->getBottom-impl(J)I

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    add-int/2addr p2, p3

    .line 129
    int-to-float p2, p2

    .line 130
    cmpg-float p1, p1, p2

    .line 131
    .line 132
    if-gez p1, :cond_2

    .line 133
    .line 134
    return v5

    .line 135
    :cond_2
    return v0

    .line 136
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    and-int/2addr v4, v1

    .line 141
    if-eqz v4, :cond_9

    .line 142
    .line 143
    instance-of v4, p1, Landroidx/compose/ui/node/DelegatingNode;

    .line 144
    .line 145
    if-eqz v4, :cond_9

    .line 146
    .line 147
    move-object v4, p1

    .line 148
    check-cast v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 149
    .line 150
    invoke-virtual {v4}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    move v6, v0

    .line 155
    :goto_1
    if-eqz v4, :cond_8

    .line 156
    .line 157
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    and-int/2addr v7, v1

    .line 162
    if-eqz v7, :cond_7

    .line 163
    .line 164
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    if-ne v6, v5, :cond_4

    .line 167
    .line 168
    move-object p1, v4

    .line 169
    goto :goto_2

    .line 170
    :cond_4
    if-nez v3, :cond_5

    .line 171
    .line 172
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 173
    .line 174
    new-array v7, p4, [Landroidx/compose/ui/Modifier$Node;

    .line 175
    .line 176
    invoke-direct {v3, v7, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    :cond_5
    if-eqz p1, :cond_6

    .line 180
    .line 181
    invoke-virtual {v3, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-object p1, v2

    .line 185
    :cond_6
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :cond_7
    :goto_2
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    goto :goto_1

    .line 193
    :cond_8
    if-ne v6, v5, :cond_9

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_9
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_a
    return v0
.end method

.method private final offsetFromEdge-MK-Hz9U(J)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    cmpg-float v3, v1, v2

    .line 12
    .line 13
    if-gez v3, :cond_0

    .line 14
    .line 15
    neg-float v1, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredWidth()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-float v3, v3

    .line 22
    sub-float/2addr v1, v3

    .line 23
    :goto_0
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const-wide v3, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr p1, v3

    .line 33
    long-to-int p1, p1

    .line 34
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    cmpg-float p2, p1, v2

    .line 39
    .line 40
    if-gez p2, :cond_1

    .line 41
    .line 42
    neg-float p1, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredHeight()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    int-to-float p2, p2

    .line 49
    sub-float/2addr p1, p2

    .line 50
    :goto_1
    invoke-static {v2, p1}, Ljava/lang/Math;->max(FF)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    int-to-long v1, p2

    .line 59
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    int-to-long p1, p1

    .line 64
    shl-long v0, v1, v0

    .line 65
    .line 66
    and-long/2addr p1, v3

    .line 67
    or-long/2addr p1, v0

    .line 68
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide p1

    .line 72
    return-wide p1
.end method

.method private final outOfBoundsHit-8NAm7pk(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->hitTestChild-qzLsGqo(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move/from16 v7, p6

    .line 17
    .line 18
    invoke-direct {p0, p1, p3, p4, v7}, Landroidx/compose/ui/node/NodeCoordinator;->isInExpandedTouchBounds-ThD-n1k(Landroidx/compose/ui/Modifier$Node;JI)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    new-instance v0, Landroidx/compose/ui/node/NodeCoordinator$outOfBoundsHit$1;

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    move-object v2, p1

    .line 28
    move-object v3, p2

    .line 29
    move-wide v4, p3

    .line 30
    move-object/from16 v6, p5

    .line 31
    .line 32
    move/from16 v8, p7

    .line 33
    .line 34
    move/from16 v9, p8

    .line 35
    .line 36
    move/from16 v10, p9

    .line 37
    .line 38
    invoke-direct/range {v0 .. v10}, Landroidx/compose/ui/node/NodeCoordinator$outOfBoundsHit$1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, p1, v8, v0}, Landroidx/compose/ui/node/HitTestResult;->hitExpandedTouchBounds(Landroidx/compose/ui/Modifier$Node;ZLhd/a;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    move-object/from16 v6, p5

    .line 46
    .line 47
    move/from16 v8, p7

    .line 48
    .line 49
    if-eqz p9, :cond_2

    .line 50
    .line 51
    invoke-direct/range {p0 .. p8}, Landroidx/compose/ui/node/NodeCoordinator;->hitNear-Fh5PU_I(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    invoke-direct/range {p0 .. p8}, Landroidx/compose/ui/node/NodeCoordinator;->speculativeHit-Fh5PU_I(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method private final placeSelf-MLgxB_4(JFLhd/l;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JF",
            "Lhd/l;",
            "Landroidx/compose/ui/graphics/layer/GraphicsLayer;",
            ")V"
        }
    .end annotation

    .line 1
    move-object v5, p5

    .line 2
    const/4 v3, 0x2

    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    if-eqz v5, :cond_3

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-nez p4, :cond_0

    .line 9
    .line 10
    move v2, v9

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v4

    .line 13
    :goto_0
    if-nez v2, :cond_1

    .line 14
    .line 15
    const-string v2, "both ways to create layers shouldn\'t be used together"

    .line 16
    .line 17
    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 21
    .line 22
    if-eq v2, v5, :cond_2

    .line 23
    .line 24
    iput-object v6, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 25
    .line 26
    invoke-static {p0, v6, v4, v3, v6}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerBlock$default(Landroidx/compose/ui/node/NodeCoordinator;Lhd/l;ZILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object v5, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 30
    .line 31
    :cond_2
    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 32
    .line 33
    if-nez v2, :cond_5

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getDrawBlock()Lhd/p;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v4, p0, Landroidx/compose/ui/node/NodeCoordinator;->invalidateParentLayer:Lhd/a;

    .line 48
    .line 49
    const/16 v7, 0x8

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/node/Owner;->createLayer$default(Landroidx/compose/ui/node/Owner;Lhd/p;Lhd/a;Landroidx/compose/ui/graphics/layer/GraphicsLayer;ZILjava/lang/Object;)Landroidx/compose/ui/node/OwnedLayer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredSize-YbymL2g()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    invoke-interface {v2, v3, v4}, Landroidx/compose/ui/node/OwnedLayer;->resize-ozmzZPI(J)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v2, p1, p2}, Landroidx/compose/ui/node/OwnedLayer;->move--gyyYBs(J)V

    .line 65
    .line 66
    .line 67
    iput-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2, v9}, Landroidx/compose/ui/node/LayoutNode;->setInnerLayerCoordinatorIsDirty$ui_release(Z)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->invalidateParentLayer:Lhd/a;

    .line 77
    .line 78
    invoke-interface {v2}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget-object v5, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    iput-object v6, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 87
    .line 88
    invoke-static {p0, v6, v4, v3, v6}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerBlock$default(Landroidx/compose/ui/node/NodeCoordinator;Lhd/l;ZILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    invoke-static {p0, p4, v4, v3, v6}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerBlock$default(Landroidx/compose/ui/node/NodeCoordinator;Lhd/l;ZILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    invoke-static {v2, v3, p1, p2}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_8

    .line 103
    .line 104
    invoke-virtual/range {p0 .. p2}, Landroidx/compose/ui/node/NodeCoordinator;->setPosition--gyyYBs(J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDelegate$ui_release()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, Landroidx/compose/ui/node/MeasurePassDelegate;->notifyChildrenUsingCoordinatesWhilePlacing()V

    .line 120
    .line 121
    .line 122
    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 123
    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-interface {v2, p1, p2}, Landroidx/compose/ui/node/OwnedLayer;->move--gyyYBs(J)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 131
    .line 132
    if-eqz v0, :cond_7

    .line 133
    .line 134
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->invalidateLayer()V

    .line 135
    .line 136
    .line 137
    :cond_7
    :goto_2
    invoke-virtual {p0, p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->invalidateAlignmentLinesFromPositionChange(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getOwner$ui_release()Landroidx/compose/ui/node/Owner;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_8

    .line 149
    .line 150
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-interface {v0, v1}, Landroidx/compose/ui/node/Owner;->onLayoutChange(Landroidx/compose/ui/node/LayoutNode;)V

    .line 155
    .line 156
    .line 157
    :cond_8
    iput p3, p0, Landroidx/compose/ui/node/NodeCoordinator;->zIndex:F

    .line 158
    .line 159
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacingForAlignment$ui_release()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_9

    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getMeasureResult$ui_release()Landroidx/compose/ui/layout/MeasureResult;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->captureRulers$ui_release(Landroidx/compose/ui/layout/MeasureResult;)V

    .line 170
    .line 171
    .line 172
    :cond_9
    return-void
.end method

.method public static synthetic rectInParent$ui_release$default(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;ZZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x4

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->rectInParent$ui_release(Landroidx/compose/ui/geometry/MutableRect;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: rectInParent"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private final speculativeHit-Fh5PU_I(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move/from16 v5, p6

    .line 8
    .line 9
    move/from16 v6, p7

    .line 10
    .line 11
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->hitTestChild-qzLsGqo(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p2, p1}, Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;->interceptOutOfBoundsChildEvents(Landroidx/compose/ui/Modifier$Node;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Landroidx/compose/ui/node/NodeCoordinator$speculativeHit$1;

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-object v3, p2

    .line 26
    move-wide v4, p3

    .line 27
    move-object v6, p5

    .line 28
    move/from16 v7, p6

    .line 29
    .line 30
    move/from16 v8, p7

    .line 31
    .line 32
    move/from16 v9, p8

    .line 33
    .line 34
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/node/NodeCoordinator$speculativeHit$1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V

    .line 35
    .line 36
    .line 37
    move v7, v8

    .line 38
    move v8, v9

    .line 39
    invoke-virtual {p5, p1, v8, v7, v0}, Landroidx/compose/ui/node/HitTestResult;->speculativeHit(Landroidx/compose/ui/Modifier$Node;FZLhd/a;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    move/from16 v7, p7

    .line 44
    .line 45
    move/from16 v8, p8

    .line 46
    .line 47
    invoke-interface {p2}, Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;->entityType-OLwlOKw()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {p1, v0, v1}, Landroidx/compose/ui/node/NodeCoordinatorKt;->access$nextUntil-hw7D004(Landroidx/compose/ui/node/DelegatableNode;II)Landroidx/compose/ui/Modifier$Node;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v9, 0x0

    .line 61
    move-object v0, p0

    .line 62
    move-object v2, p2

    .line 63
    move-wide v3, p3

    .line 64
    move-object v5, p5

    .line 65
    move/from16 v6, p6

    .line 66
    .line 67
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/node/NodeCoordinator;->outOfBoundsHit-8NAm7pk(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private final toCoordinator(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;->getCoordinator()Landroidx/compose/ui/node/NodeCoordinator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v0

    .line 20
    :cond_2
    :goto_1
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast p1, Landroidx/compose/ui/node/NodeCoordinator;

    .line 26
    .line 27
    return-object p1
.end method

.method public static synthetic toParentPosition-8S9VItk$default(Landroidx/compose/ui/node/NodeCoordinator;JZILjava/lang/Object;)J
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->toParentPosition-8S9VItk(JZ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    return-wide p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final transformFromAncestor-EL8BTi8(Landroidx/compose/ui/node/NodeCoordinator;[F)V
    .locals 6

    .line 1
    invoke-static {p1, p0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->transformFromAncestor-EL8BTi8(Landroidx/compose/ui/node/NodeCoordinator;[F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sget-object p1, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator;->tmpMatrix:[F

    .line 32
    .line 33
    invoke-static {v0}, Landroidx/compose/ui/graphics/Matrix;->reset-impl([F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    int-to-float p1, p1

    .line 45
    neg-float v1, p1

    .line 46
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    int-to-float p1, p1

    .line 55
    neg-float v2, p1

    .line 56
    const/4 v4, 0x4

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/graphics/Matrix;->translate-impl$default([FFFFILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2, v0}, Landroidx/compose/ui/graphics/Matrix;->timesAssign-58bKbWc([F[F)V

    .line 63
    .line 64
    .line 65
    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    invoke-interface {p1, p2}, Landroidx/compose/ui/node/OwnedLayer;->inverseTransform-58bKbWc([F)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method private final transformToAncestor-EL8BTi8(Landroidx/compose/ui/node/NodeCoordinator;[F)V
    .locals 10

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v1, p2}, Landroidx/compose/ui/node/OwnedLayer;->transform-58bKbWc([F)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    sget-object v3, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    sget-object v4, Landroidx/compose/ui/node/NodeCoordinator;->tmpMatrix:[F

    .line 32
    .line 33
    invoke-static {v4}, Landroidx/compose/ui/graphics/Matrix;->reset-impl([F)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-float v5, v3

    .line 41
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-float v6, v1

    .line 46
    const/4 v8, 0x4

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-static/range {v4 .. v9}, Landroidx/compose/ui/graphics/Matrix;->translate-impl$default([FFFFILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v4}, Landroidx/compose/ui/graphics/Matrix;->timesAssign-58bKbWc([F[F)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method public static synthetic updateLayerBlock$default(Landroidx/compose/ui/node/NodeCoordinator;Lhd/l;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerBlock(Lhd/l;Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: updateLayerBlock"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private final updateLayerParameters(Z)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 8
    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    sget-object v2, Landroidx/compose/ui/node/NodeCoordinator;->graphicsLayerScope:Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;->reset()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;->setGraphicsDensity$ui_release(Landroidx/compose/ui/unit/Density;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;->setLayoutDirection$ui_release(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSizeKt;->toSize-ozmzZPI(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    invoke-virtual {v2, v3, v4}, Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;->setSize-uvyYCjk(J)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    sget-object v4, Landroidx/compose/ui/node/NodeCoordinator;->onCommitAffectingLayerParams:Lhd/l;

    .line 58
    .line 59
    new-instance v5, Landroidx/compose/ui/node/NodeCoordinator$updateLayerParameters$1;

    .line 60
    .line 61
    invoke-direct {v5, v1}, Landroidx/compose/ui/node/NodeCoordinator$updateLayerParameters$1;-><init>(Lhd/l;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, p0, v4, v5}, Landroidx/compose/ui/node/OwnerSnapshotObserver;->observeReads$ui_release(Landroidx/compose/ui/node/OwnerScope;Lhd/l;Lhd/a;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerPositionalProperties:Landroidx/compose/ui/node/LayerPositionalProperties;

    .line 68
    .line 69
    if-nez v1, :cond_1

    .line 70
    .line 71
    new-instance v1, Landroidx/compose/ui/node/LayerPositionalProperties;

    .line 72
    .line 73
    invoke-direct {v1}, Landroidx/compose/ui/node/LayerPositionalProperties;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerPositionalProperties:Landroidx/compose/ui/node/LayerPositionalProperties;

    .line 77
    .line 78
    :cond_1
    sget-object v3, Landroidx/compose/ui/node/NodeCoordinator;->tmpLayerPositionalProperties:Landroidx/compose/ui/node/LayerPositionalProperties;

    .line 79
    .line 80
    invoke-virtual {v3, v1}, Landroidx/compose/ui/node/LayerPositionalProperties;->copyFrom(Landroidx/compose/ui/node/LayerPositionalProperties;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroidx/compose/ui/node/LayerPositionalProperties;->copyFrom(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v2}, Landroidx/compose/ui/node/OwnedLayer;->updateLayerProperties(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V

    .line 87
    .line 88
    .line 89
    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->isClipping:Z

    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;->getClip()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    iput-boolean v4, p0, Landroidx/compose/ui/node/NodeCoordinator;->isClipping:Z

    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;->getAlpha()F

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    iput v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->lastLayerAlpha:F

    .line 102
    .line 103
    invoke-virtual {v3, v1}, Landroidx/compose/ui/node/LayerPositionalProperties;->hasSameValuesAs(Landroidx/compose/ui/node/LayerPositionalProperties;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    xor-int/lit8 v2, v1, 0x1

    .line 108
    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    if-eqz v1, :cond_2

    .line 112
    .line 113
    iget-boolean p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->isClipping:Z

    .line 114
    .line 115
    if-eq v0, p1, :cond_3

    .line 116
    .line 117
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getOwner$ui_release()Landroidx/compose/ui/node/Owner;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {p1, v0}, Landroidx/compose/ui/node/Owner;->onLayoutChange(Landroidx/compose/ui/node/LayoutNode;)V

    .line 132
    .line 133
    .line 134
    :cond_3
    return v2

    .line 135
    :cond_4
    const-string/jumbo p1, "updateLayerParameters requires a non-null layerBlock"

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 139
    .line 140
    .line 141
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 142
    .line 143
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_5
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 148
    .line 149
    if-nez p1, :cond_6

    .line 150
    .line 151
    const/4 p1, 0x1

    .line 152
    goto :goto_0

    .line 153
    :cond_6
    move p1, v1

    .line 154
    :goto_0
    if-nez p1, :cond_7

    .line 155
    .line 156
    const-string p1, "null layer with a non-null layerBlock"

    .line 157
    .line 158
    invoke-static {p1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_7
    return v1
.end method

.method public static synthetic updateLayerParameters$default(Landroidx/compose/ui/node/NodeCoordinator;ZILjava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    and-int/2addr p2, p3

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    move p1, p3

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerParameters(Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: updateLayerParameters"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public final calculateMinimumTouchTargetPadding-E7KxVPU(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    sub-float/2addr v1, v2

    .line 16
    const-wide v2, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v2

    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    int-to-float p2, p2

    .line 32
    sub-float/2addr p1, p2

    .line 33
    const/high16 p2, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v1, p2

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    div-float/2addr p1, p2

    .line 42
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    int-to-long v4, p2

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long p1, p1

    .line 56
    shl-long v0, v4, v0

    .line 57
    .line 58
    and-long/2addr p1, v2

    .line 59
    or-long/2addr p1, v0

    .line 60
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    return-wide p1
.end method

.method public final distanceInMinimumTouchTarget-tz77jQw(JJ)F
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p3, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    and-long v5, p3, v3

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpl-float v0, v0, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-virtual {p0, p3, p4}, Landroidx/compose/ui/node/NodeCoordinator;->calculateMinimumTouchTargetPadding-E7KxVPU(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    shr-long v5, p3, v1

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    and-long/2addr p3, v3

    .line 55
    long-to-int p3, p3

    .line 56
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->offsetFromEdge-MK-Hz9U(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    const/4 p4, 0x0

    .line 65
    cmpl-float v5, v0, p4

    .line 66
    .line 67
    if-gtz v5, :cond_1

    .line 68
    .line 69
    cmpl-float p4, p3, p4

    .line 70
    .line 71
    if-lez p4, :cond_2

    .line 72
    .line 73
    :cond_1
    shr-long v5, p1, v1

    .line 74
    .line 75
    long-to-int p4, v5

    .line 76
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    cmpg-float p4, p4, v0

    .line 81
    .line 82
    if-gtz p4, :cond_2

    .line 83
    .line 84
    and-long v0, p1, v3

    .line 85
    .line 86
    long-to-int p4, v0

    .line 87
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    cmpg-float p3, p4, p3

    .line 92
    .line 93
    if-gtz p3, :cond_2

    .line 94
    .line 95
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getDistanceSquared-impl(J)F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    return p1

    .line 100
    :cond_2
    return v2
.end method

.method public final draw(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/node/OwnedLayer;->drawLayer(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/Canvas;->translate(FF)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->drawContainedDrawModifiers(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 31
    .line 32
    .line 33
    neg-float p2, v0

    .line 34
    neg-float v0, v1

    .line 35
    invoke-interface {p1, p2, v0}, Landroidx/compose/ui/graphics/Canvas;->translate(FF)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final drawBorder(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredSize-YbymL2g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    int-to-float v0, v0

    .line 10
    const/high16 v1, 0x3f000000    # 0.5f

    .line 11
    .line 12
    sub-float v5, v0, v1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredSize-YbymL2g()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    const-wide v6, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v2, v6

    .line 24
    long-to-int v0, v2

    .line 25
    int-to-float v0, v0

    .line 26
    sub-float v6, v0, v1

    .line 27
    .line 28
    const/high16 v3, 0x3f000000    # 0.5f

    .line 29
    .line 30
    const/high16 v4, 0x3f000000    # 0.5f

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    move-object v7, p2

    .line 34
    invoke-interface/range {v2 .. v7}, Landroidx/compose/ui/graphics/Canvas;->drawRect(FFFFLandroidx/compose/ui/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public abstract ensureLookaheadDelegateCreated()V
.end method

.method public final findCommonAncestor$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-interface {v1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    const-string/jumbo v3, "visitLocalAncestors called on an unattached node"

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-interface {v1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :goto_0
    if-eqz v1, :cond_7

    .line 49
    .line 50
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    and-int/2addr v3, v2

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    if-ne v1, v0, :cond_1

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    :goto_1
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-le v2, v3, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    :goto_2
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-le v2, v3, :cond_4

    .line 92
    .line 93
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    :goto_3
    if-eq v0, v1, :cond_6

    .line 102
    .line 103
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 117
    .line 118
    const-string v0, "layouts are not part of the same hierarchy"

    .line 119
    .line 120
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_6
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    if-ne v1, v2, :cond_8

    .line 129
    .line 130
    :cond_7
    return-object p0

    .line 131
    :cond_8
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-ne v0, v1, :cond_9

    .line 136
    .line 137
    :goto_4
    return-object p1

    .line 138
    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getInnerCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1
.end method

.method public fromParentPosition-8S9VItk(JZ)J
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacedUnderMotionFrameOfReference()Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {p1, p2, v0, v1}, Landroidx/compose/ui/unit/IntOffsetKt;->minus-Nv-tHpc(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    :goto_0
    iget-object p3, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-interface {p3, p1, p2, v0}, Landroidx/compose/ui/node/OwnedLayer;->mapOffset-8S9VItk(JZ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    :cond_1
    return-wide p1
.end method

.method public getAlignmentLinesOwner()Landroidx/compose/ui/node/AlignmentLinesOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDelegate$ui_release()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;->getAlignmentLinesOwner$ui_release()Landroidx/compose/ui/node/AlignmentLinesOwner;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public getChild()Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrapped:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 0

    return-object p0
.end method

.method public getDensity()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public getFontScale()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroidx/compose/ui/unit/FontScaling;->getFontScale()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final getForceMeasureWithLookaheadConstraints$ui_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->forceMeasureWithLookaheadConstraints:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getForcePlaceWithLookaheadOffset$ui_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->forcePlaceWithLookaheadOffset:Z

    .line 2
    .line 3
    return v0
.end method

.method public getHasMeasureResult()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->_measureResult:Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public getIntroducesMotionFrameOfReference()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacedUnderMotionFrameOfReference()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final getLastLayerDrawingWasSkipped$ui_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->lastLayerDrawingWasSkipped:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getLastMeasurementConstraints-msEJaDk$ui_release()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasurementConstraints-msEJaDk()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final getLayer()Landroidx/compose/ui/node/OwnedLayer;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLayerBlock()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getLayoutNode()Landroidx/compose/ui/node/LayoutNode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract getLookaheadDelegate()Landroidx/compose/ui/node/LookaheadDelegate;
.end method

.method public getMeasureResult$ui_release()Landroidx/compose/ui/layout/MeasureResult;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->_measureResult:Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final getMinimumTouchTargetSize-NH-jbRc()J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerDensity:Landroidx/compose/ui/unit/Density;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Landroidx/compose/ui/platform/ViewConfiguration;->getMinimumTouchTargetSize-MYxV2XQ()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/unit/Density;->toSize-XkaWNTQ(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
.end method

.method public getParent()Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParentCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->onCoordinatesUsed$ui_release()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 16
    .line 17
    return-object v0
.end method

.method public getParentData()Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x40

    .line 10
    .line 11
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0, v2}, Landroidx/compose/ui/node/NodeChain;->has-H91voCI$ui_release(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_9

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 26
    .line 27
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_0
    if-eqz v3, :cond_8

    .line 43
    .line 44
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    and-int/2addr v4, v5

    .line 53
    if-eqz v4, :cond_7

    .line 54
    .line 55
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    move-object v6, v2

    .line 60
    move-object v5, v3

    .line 61
    :goto_1
    if-eqz v5, :cond_7

    .line 62
    .line 63
    instance-of v7, v5, Landroidx/compose/ui/node/ParentDataModifierNode;

    .line 64
    .line 65
    if-eqz v7, :cond_0

    .line 66
    .line 67
    check-cast v5, Landroidx/compose/ui/node/ParentDataModifierNode;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    iget-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-interface {v5, v7, v8}, Landroidx/compose/ui/node/ParentDataModifierNode;->modifyParentData(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iput-object v5, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_0
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    and-int/2addr v7, v4

    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    instance-of v7, v5, Landroidx/compose/ui/node/DelegatingNode;

    .line 94
    .line 95
    if-eqz v7, :cond_6

    .line 96
    .line 97
    move-object v7, v5

    .line 98
    check-cast v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 99
    .line 100
    invoke-virtual {v7}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    const/4 v8, 0x0

    .line 105
    move v9, v8

    .line 106
    :goto_2
    const/4 v10, 0x1

    .line 107
    if-eqz v7, :cond_5

    .line 108
    .line 109
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    and-int/2addr v11, v4

    .line 114
    if-eqz v11, :cond_4

    .line 115
    .line 116
    add-int/lit8 v9, v9, 0x1

    .line 117
    .line 118
    if-ne v9, v10, :cond_1

    .line 119
    .line 120
    move-object v5, v7

    .line 121
    goto :goto_3

    .line 122
    :cond_1
    if-nez v6, :cond_2

    .line 123
    .line 124
    new-instance v6, Landroidx/compose/runtime/collection/MutableVector;

    .line 125
    .line 126
    const/16 v10, 0x10

    .line 127
    .line 128
    new-array v10, v10, [Landroidx/compose/ui/Modifier$Node;

    .line 129
    .line 130
    invoke-direct {v6, v10, v8}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    :cond_2
    if-eqz v5, :cond_3

    .line 134
    .line 135
    invoke-virtual {v6, v5}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-object v5, v2

    .line 139
    :cond_3
    invoke-virtual {v6, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :cond_4
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    goto :goto_2

    .line 147
    :cond_5
    if-ne v9, v10, :cond_6

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    :goto_4
    invoke-static {v6}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    goto :goto_1

    .line 155
    :cond_7
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    goto :goto_0

    .line 160
    :cond_8
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 161
    .line 162
    return-object v0

    .line 163
    :cond_9
    return-object v2
.end method

.method public final getParentLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->onCoordinatesUsed$ui_release()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 24
    .line 25
    return-object v0
.end method

.method public getPosition-nOcc-ac()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->position:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getProvidedAlignmentLines()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, p0

    .line 3
    move-object v2, v0

    .line 4
    :goto_0
    if-eqz v1, :cond_3

    .line 5
    .line 6
    iget-object v3, v1, Landroidx/compose/ui/node/NodeCoordinator;->_measureResult:Landroidx/compose/ui/layout/MeasureResult;

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    invoke-interface {v3}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    move-object v3, v0

    .line 16
    :goto_1
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x1

    .line 23
    xor-int/2addr v4, v5

    .line 24
    if-ne v4, v5, :cond_2

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/util/Collection;

    .line 38
    .line 39
    invoke-interface {v2, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->wrapped:Landroidx/compose/ui/node/NodeCoordinator;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    if-nez v2, :cond_4

    .line 46
    .line 47
    invoke-static {}, Lrc/y0;->f()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :cond_4
    return-object v2
.end method

.method public final getRectCache()Landroidx/compose/ui/geometry/MutableRect;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->_rectCache:Landroidx/compose/ui/geometry/MutableRect;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/geometry/MutableRect;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1, v1, v1, v1}, Landroidx/compose/ui/geometry/MutableRect;-><init>(FFFF)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->_rectCache:Landroidx/compose/ui/geometry/MutableRect;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final getSize-YbymL2g()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredSize-YbymL2g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public abstract getTail()Landroidx/compose/ui/Modifier$Node;
.end method

.method public final getWrapped$ui_release()Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrapped:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getZIndex()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->zIndex:F

    .line 2
    .line 3
    return v0
.end method

.method public final head-H91voCI(I)Landroidx/compose/ui/Modifier$Node;
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/node/NodeKindKt;->getIncludeSelfInTraversal-H91voCI(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_0
    invoke-static {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->access$headNode(Landroidx/compose/ui/node/NodeCoordinator;Z)Landroidx/compose/ui/Modifier$Node;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_1
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    and-int/2addr v2, p1

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    and-int/2addr v2, p1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    if-eq v0, v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_2
    const/4 p1, 0x0

    .line 48
    return-object p1
.end method

.method public final hitTest-qzLsGqo(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V
    .locals 13

    .line 1
    move-wide v3, p2

    .line 2
    move-object/from16 v5, p4

    .line 3
    .line 4
    move/from16 v6, p5

    .line 5
    .line 6
    invoke-interface {p1}, Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;->entityType-OLwlOKw()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->head-H91voCI(I)Landroidx/compose/ui/Modifier$Node;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v3, v4}, Landroidx/compose/ui/node/NodeCoordinator;->withinLayerBounds-k-4lQ0M(J)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 20
    .line 21
    const v10, 0x7fffffff

    .line 22
    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    sget-object v0, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getTouch-T8wyACA()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v6, v0}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getMinimumTouchTargetSize-NH-jbRc()J

    .line 39
    .line 40
    .line 41
    move-result-wide v11

    .line 42
    invoke-virtual {p0, v3, v4, v11, v12}, Landroidx/compose/ui/node/NodeCoordinator;->distanceInMinimumTouchTarget-tz77jQw(JJ)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    and-int/2addr v2, v10

    .line 51
    if-ge v2, v9, :cond_0

    .line 52
    .line 53
    invoke-virtual {v5, v0, v8}, Landroidx/compose/ui/node/HitTestResult;->isHitInMinimumTouchTargetBetter(FZ)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    move-object v2, p1

    .line 61
    move v8, v0

    .line 62
    move-object v0, p0

    .line 63
    invoke-direct/range {v0 .. v8}, Landroidx/compose/ui/node/NodeCoordinator;->hitNear-Fh5PU_I(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void

    .line 67
    :cond_1
    if-nez v1, :cond_2

    .line 68
    .line 69
    invoke-virtual/range {p0 .. p6}, Landroidx/compose/ui/node/NodeCoordinator;->hitTestChild-qzLsGqo(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-virtual {p0, v3, v4}, Landroidx/compose/ui/node/NodeCoordinator;->isPointerInBounds-k-4lQ0M(J)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    move-object v0, p0

    .line 80
    move-object v2, p1

    .line 81
    move-object/from16 v5, p4

    .line 82
    .line 83
    move/from16 v6, p5

    .line 84
    .line 85
    move/from16 v7, p6

    .line 86
    .line 87
    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/node/NodeCoordinator;->hit-5ShdDok(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    move-object/from16 v5, p4

    .line 92
    .line 93
    move/from16 v6, p5

    .line 94
    .line 95
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getTouch-T8wyACA()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-static {v6, v2}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_4

    .line 106
    .line 107
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getMinimumTouchTargetSize-NH-jbRc()J

    .line 111
    .line 112
    .line 113
    move-result-wide v11

    .line 114
    invoke-virtual {p0, v3, v4, v11, v12}, Landroidx/compose/ui/node/NodeCoordinator;->distanceInMinimumTouchTarget-tz77jQw(JJ)F

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    and-int/2addr v7, v10

    .line 123
    if-ge v7, v9, :cond_6

    .line 124
    .line 125
    move/from16 v7, p6

    .line 126
    .line 127
    invoke-virtual {v5, v2, v7}, Landroidx/compose/ui/node/HitTestResult;->isHitInMinimumTouchTargetBetter(FZ)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_5

    .line 132
    .line 133
    const/4 v8, 0x1

    .line 134
    :cond_5
    :goto_1
    move-object v0, p0

    .line 135
    move v9, v8

    .line 136
    move v8, v2

    .line 137
    move-object v2, p1

    .line 138
    goto :goto_2

    .line 139
    :cond_6
    move/from16 v7, p6

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :goto_2
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/node/NodeCoordinator;->outOfBoundsHit-8NAm7pk(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public hitTestChild-qzLsGqo(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrapped:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-wide v1, p2

    .line 9
    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->fromParentPosition-8S9VItk$default(Landroidx/compose/ui/node/NodeCoordinator;JZILjava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    move-object v1, p1

    .line 14
    move-object v4, p4

    .line 15
    move v5, p5

    .line 16
    move v6, p6

    .line 17
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->hitTest-qzLsGqo(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public invalidateLayer()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/node/OwnedLayer;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->invalidateLayer()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public isAttached()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final isPointerInBounds-k-4lQ0M(J)Z
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-wide v1, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p1, v1

    .line 16
    long-to-int p1, p1

    .line 17
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 p2, 0x0

    .line 22
    cmpl-float v1, v0, p2

    .line 23
    .line 24
    if-ltz v1, :cond_0

    .line 25
    .line 26
    cmpl-float p2, p1, p2

    .line 27
    .line 28
    if-ltz p2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredWidth()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    int-to-float p2, p2

    .line 35
    cmpg-float p2, v0, p2

    .line 36
    .line 37
    if-gez p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredHeight()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    int-to-float p2, p2

    .line 44
    cmpg-float p1, p1, p2

    .line 45
    .line 46
    if-gez p1, :cond_0

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    return p1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1
.end method

.method public final isTransparent()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->lastLayerAlpha:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->isTransparent()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public isValidOwnerScope()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->released:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->isAttached()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public localBoundingBoxOf(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "LayoutCoordinates "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, " is not attached!"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->toCoordinator(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->onCoordinatesUsed$ui_release()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->findCommonAncestor$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getRectCache()Landroidx/compose/ui/geometry/MutableRect;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-virtual {v3, v2}, Landroidx/compose/ui/geometry/MutableRect;->setLeft(F)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v2}, Landroidx/compose/ui/geometry/MutableRect;->setTop(F)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    const/16 v2, 0x20

    .line 70
    .line 71
    shr-long/2addr v4, v2

    .line 72
    long-to-int v2, v4

    .line 73
    int-to-float v2, v2

    .line 74
    invoke-virtual {v3, v2}, Landroidx/compose/ui/geometry/MutableRect;->setRight(F)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    const-wide v6, 0xffffffffL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long/2addr v4, v6

    .line 87
    long-to-int p1, v4

    .line 88
    int-to-float p1, p1

    .line 89
    invoke-virtual {v3, p1}, Landroidx/compose/ui/geometry/MutableRect;->setBottom(F)V

    .line 90
    .line 91
    .line 92
    move-object v2, v0

    .line 93
    :goto_0
    if-eq v2, v1, :cond_3

    .line 94
    .line 95
    const/4 v6, 0x4

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v5, 0x0

    .line 98
    move v4, p2

    .line 99
    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/node/NodeCoordinator;->rectInParent$ui_release$default(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;ZZILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Landroidx/compose/ui/geometry/MutableRect;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_2

    .line 107
    .line 108
    sget-object p1, Landroidx/compose/ui/geometry/Rect;->Companion:Landroidx/compose/ui/geometry/Rect$Companion;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect$Companion;->getZero()Landroidx/compose/ui/geometry/Rect;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_2
    iget-object v2, v2, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 116
    .line 117
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move p2, v4

    .line 121
    goto :goto_0

    .line 122
    :cond_3
    move v4, p2

    .line 123
    invoke-direct {p0, v1, v3, v4}, Landroidx/compose/ui/node/NodeCoordinator;->ancestorToLocal(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V

    .line 124
    .line 125
    .line 126
    invoke-static {v3}, Landroidx/compose/ui/geometry/MutableRectKt;->toRect(Landroidx/compose/ui/geometry/MutableRect;)Landroidx/compose/ui/geometry/Rect;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
.end method

.method public localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/compose/ui/node/NodeCoordinator;->localPositionOf-S_NoaFU(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J

    .line 3
    .line 4
    .line 5
    move-result-wide p1

    .line 6
    return-wide p1
.end method

.method public localPositionOf-S_NoaFU(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;->getCoordinator()Landroidx/compose/ui/node/NodeCoordinator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->onCoordinatesUsed$ui_release()V

    .line 13
    .line 14
    .line 15
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    xor-long/2addr p2, v0

    .line 21
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide p2

    .line 25
    invoke-interface {p1, p0, p2, p3, p4}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-S_NoaFU(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    xor-long/2addr p1, v0

    .line 30
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    return-wide p1

    .line 35
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->toCoordinator(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->onCoordinatesUsed$ui_release()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->findCommonAncestor$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    if-eq p1, v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1, p2, p3, p4}, Landroidx/compose/ui/node/NodeCoordinator;->toParentPosition-8S9VItk(JZ)J

    .line 49
    .line 50
    .line 51
    move-result-wide p2

    .line 52
    iget-object p1, p1, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-direct {p0, v0, p2, p3, p4}, Landroidx/compose/ui/node/NodeCoordinator;->ancestorToLocal-S_NoaFU(Landroidx/compose/ui/node/NodeCoordinator;JZ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    return-wide p1
.end method

.method public localToRoot-MK-Hz9U(J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->onCoordinatesUsed$ui_release()V

    .line 13
    .line 14
    .line 15
    move-object v1, p0

    .line 16
    move-wide v2, p1

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->toParentPosition-8S9VItk$default(Landroidx/compose/ui/node/NodeCoordinator;JZILjava/lang/Object;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-wide v2
.end method

.method public localToScreen-MK-Hz9U(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->localToRoot-MK-Hz9U(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/input/pointer/PositionCalculator;->localToScreen-MK-Hz9U(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method public localToWindow-MK-Hz9U(J)J
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->localToRoot-MK-Hz9U(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/node/Owner;->calculatePositionInWindow-MK-Hz9U(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    return-wide p1
.end method

.method public final onAttach()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getDrawBlock()Lhd/p;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->invalidateParentLayer:Lhd/a;

    .line 22
    .line 23
    iget-object v4, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 24
    .line 25
    const/16 v6, 0x8

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/node/Owner;->createLayer$default(Landroidx/compose/ui/node/Owner;Lhd/p;Lhd/a;Landroidx/compose/ui/graphics/layer/GraphicsLayer;ZILjava/lang/Object;)Landroidx/compose/ui/node/OwnedLayer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredSize-YbymL2g()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/node/OwnedLayer;->resize-ozmzZPI(J)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/node/OwnedLayer;->move--gyyYBs(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Landroidx/compose/ui/node/OwnedLayer;->invalidate()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public final onCoordinatesUsed$ui_release()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDelegate$ui_release()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;->onCoordinatesUsed()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onDetach()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/node/OwnedLayer;->destroy()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 10
    .line 11
    return-void
.end method

.method public onLayoutModifierNodeChanged()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/node/OwnedLayer;->invalidate()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onLayoutNodeAttach()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerBlock(Lhd/l;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/compose/ui/node/OwnedLayer;->invalidate()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onMeasureResultChanged(II)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    int-to-long v4, p1

    .line 13
    shl-long/2addr v4, v3

    .line 14
    int-to-long v6, p2

    .line 15
    and-long/2addr v6, v1

    .line 16
    or-long/2addr v4, v6

    .line 17
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    invoke-interface {v0, v4, v5}, Landroidx/compose/ui/node/OwnedLayer;->resize-ozmzZPI(J)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->isPlaced()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->invalidateLayer()V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    int-to-long v4, p1

    .line 43
    shl-long v3, v4, v3

    .line 44
    .line 45
    int-to-long p1, p2

    .line 46
    and-long/2addr p1, v1

    .line 47
    or-long/2addr p1, v3

    .line 48
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/Placeable;->setMeasuredSize-ozmzZPI(J)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-direct {p0, p2}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerParameters(Z)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    const/4 p1, 0x4

    .line 64
    invoke-static {p1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p1}, Landroidx/compose/ui/node/NodeKindKt;->getIncludeSelfInTraversal-H91voCI(I)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_4
    :goto_1
    invoke-static {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->access$headNode(Landroidx/compose/ui/node/NodeCoordinator;Z)Landroidx/compose/ui/Modifier$Node;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_2
    if-eqz v0, :cond_d

    .line 92
    .line 93
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    and-int/2addr v2, p1

    .line 98
    if-eqz v2, :cond_d

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    and-int/2addr v2, p1

    .line 105
    if-eqz v2, :cond_c

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    move-object v3, v0

    .line 109
    move-object v4, v2

    .line 110
    :goto_3
    if-eqz v3, :cond_c

    .line 111
    .line 112
    instance-of v5, v3, Landroidx/compose/ui/node/DrawModifierNode;

    .line 113
    .line 114
    if-eqz v5, :cond_5

    .line 115
    .line 116
    check-cast v3, Landroidx/compose/ui/node/DrawModifierNode;

    .line 117
    .line 118
    invoke-interface {v3}, Landroidx/compose/ui/node/DrawModifierNode;->onMeasureResultChanged()V

    .line 119
    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_5
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    and-int/2addr v5, p1

    .line 127
    if-eqz v5, :cond_b

    .line 128
    .line 129
    instance-of v5, v3, Landroidx/compose/ui/node/DelegatingNode;

    .line 130
    .line 131
    if-eqz v5, :cond_b

    .line 132
    .line 133
    move-object v5, v3

    .line 134
    check-cast v5, Landroidx/compose/ui/node/DelegatingNode;

    .line 135
    .line 136
    invoke-virtual {v5}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    move v6, p2

    .line 141
    :goto_4
    const/4 v7, 0x1

    .line 142
    if-eqz v5, :cond_a

    .line 143
    .line 144
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    and-int/2addr v8, p1

    .line 149
    if-eqz v8, :cond_9

    .line 150
    .line 151
    add-int/lit8 v6, v6, 0x1

    .line 152
    .line 153
    if-ne v6, v7, :cond_6

    .line 154
    .line 155
    move-object v3, v5

    .line 156
    goto :goto_5

    .line 157
    :cond_6
    if-nez v4, :cond_7

    .line 158
    .line 159
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 160
    .line 161
    const/16 v7, 0x10

    .line 162
    .line 163
    new-array v7, v7, [Landroidx/compose/ui/Modifier$Node;

    .line 164
    .line 165
    invoke-direct {v4, v7, p2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    :cond_7
    if-eqz v3, :cond_8

    .line 169
    .line 170
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-object v3, v2

    .line 174
    :cond_8
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :cond_9
    :goto_5
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    goto :goto_4

    .line 182
    :cond_a
    if-ne v6, v7, :cond_b

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_b
    :goto_6
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    goto :goto_3

    .line 190
    :cond_c
    if-eq v0, v1, :cond_d

    .line 191
    .line 192
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    goto :goto_2

    .line 197
    :cond_d
    :goto_7
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getOwner$ui_release()Landroidx/compose/ui/node/Owner;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    if-eqz p1, :cond_e

    .line 206
    .line 207
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-interface {p1, p2}, Landroidx/compose/ui/node/Owner;->onLayoutChange(Landroidx/compose/ui/node/LayoutNode;)V

    .line 212
    .line 213
    .line 214
    :cond_e
    return-void
.end method

.method public final onMeasured()V
    .locals 15

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->hasNode-H91voCI(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_c

    .line 12
    .line 13
    sget-object v1, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lhd/l;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v4, v3

    .line 28
    :goto_0
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    :try_start_0
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->getIncludeSelfInTraversal-H91voCI(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto/16 :goto_8

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-nez v7, :cond_2

    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_2
    :goto_1
    invoke-static {p0, v6}, Landroidx/compose/ui/node/NodeCoordinator;->access$headNode(Landroidx/compose/ui/node/NodeCoordinator;Z)Landroidx/compose/ui/Modifier$Node;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    :goto_2
    if-eqz v6, :cond_b

    .line 67
    .line 68
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    and-int/2addr v8, v0

    .line 73
    if-eqz v8, :cond_b

    .line 74
    .line 75
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    and-int/2addr v8, v0

    .line 80
    if-eqz v8, :cond_a

    .line 81
    .line 82
    move-object v9, v3

    .line 83
    move-object v8, v6

    .line 84
    :goto_3
    if-eqz v8, :cond_a

    .line 85
    .line 86
    instance-of v10, v8, Landroidx/compose/ui/node/LayoutAwareModifierNode;

    .line 87
    .line 88
    if-eqz v10, :cond_3

    .line 89
    .line 90
    check-cast v8, Landroidx/compose/ui/node/LayoutAwareModifierNode;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredSize-YbymL2g()J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    invoke-interface {v8, v10, v11}, Landroidx/compose/ui/node/LayoutAwareModifierNode;->onRemeasured-ozmzZPI(J)V

    .line 97
    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_3
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    and-int/2addr v10, v0

    .line 105
    if-eqz v10, :cond_9

    .line 106
    .line 107
    instance-of v10, v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 108
    .line 109
    if-eqz v10, :cond_9

    .line 110
    .line 111
    move-object v10, v8

    .line 112
    check-cast v10, Landroidx/compose/ui/node/DelegatingNode;

    .line 113
    .line 114
    invoke-virtual {v10}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    const/4 v11, 0x0

    .line 119
    move v12, v11

    .line 120
    :goto_4
    const/4 v13, 0x1

    .line 121
    if-eqz v10, :cond_8

    .line 122
    .line 123
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    and-int/2addr v14, v0

    .line 128
    if-eqz v14, :cond_7

    .line 129
    .line 130
    add-int/lit8 v12, v12, 0x1

    .line 131
    .line 132
    if-ne v12, v13, :cond_4

    .line 133
    .line 134
    move-object v8, v10

    .line 135
    goto :goto_5

    .line 136
    :cond_4
    if-nez v9, :cond_5

    .line 137
    .line 138
    new-instance v9, Landroidx/compose/runtime/collection/MutableVector;

    .line 139
    .line 140
    const/16 v13, 0x10

    .line 141
    .line 142
    new-array v13, v13, [Landroidx/compose/ui/Modifier$Node;

    .line 143
    .line 144
    invoke-direct {v9, v13, v11}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    :cond_5
    if-eqz v8, :cond_6

    .line 148
    .line 149
    invoke-virtual {v9, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-object v8, v3

    .line 153
    :cond_6
    invoke-virtual {v9, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_7
    :goto_5
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    goto :goto_4

    .line 161
    :cond_8
    if-ne v12, v13, :cond_9

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_9
    :goto_6
    invoke-static {v9}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    goto :goto_3

    .line 169
    :cond_a
    if-eq v6, v7, :cond_b

    .line 170
    .line 171
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    goto :goto_2

    .line 176
    :cond_b
    :goto_7
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    invoke-virtual {v1, v2, v5, v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lhd/l;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :goto_8
    invoke-virtual {v1, v2, v5, v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lhd/l;)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :cond_c
    return-void
.end method

.method public final onPlaced()V
    .locals 11

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->getIncludeSelfInTraversal-H91voCI(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-static {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->access$headNode(Landroidx/compose/ui/node/NodeCoordinator;Z)Landroidx/compose/ui/Modifier$Node;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_1
    if-eqz v1, :cond_a

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    and-int/2addr v3, v0

    .line 37
    if-eqz v3, :cond_a

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    and-int/2addr v3, v0

    .line 44
    if-eqz v3, :cond_9

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v4, v1

    .line 48
    move-object v5, v3

    .line 49
    :goto_2
    if-eqz v4, :cond_9

    .line 50
    .line 51
    instance-of v6, v4, Landroidx/compose/ui/node/LayoutAwareModifierNode;

    .line 52
    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    check-cast v4, Landroidx/compose/ui/node/LayoutAwareModifierNode;

    .line 56
    .line 57
    invoke-interface {v4, p0}, Landroidx/compose/ui/node/LayoutAwareModifierNode;->onPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 58
    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    and-int/2addr v6, v0

    .line 66
    if-eqz v6, :cond_8

    .line 67
    .line 68
    instance-of v6, v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 69
    .line 70
    if-eqz v6, :cond_8

    .line 71
    .line 72
    move-object v6, v4

    .line 73
    check-cast v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 74
    .line 75
    invoke-virtual {v6}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const/4 v7, 0x0

    .line 80
    move v8, v7

    .line 81
    :goto_3
    const/4 v9, 0x1

    .line 82
    if-eqz v6, :cond_7

    .line 83
    .line 84
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    and-int/2addr v10, v0

    .line 89
    if-eqz v10, :cond_6

    .line 90
    .line 91
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    if-ne v8, v9, :cond_3

    .line 94
    .line 95
    move-object v4, v6

    .line 96
    goto :goto_4

    .line 97
    :cond_3
    if-nez v5, :cond_4

    .line 98
    .line 99
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    .line 100
    .line 101
    const/16 v9, 0x10

    .line 102
    .line 103
    new-array v9, v9, [Landroidx/compose/ui/Modifier$Node;

    .line 104
    .line 105
    invoke-direct {v5, v9, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    :cond_4
    if-eqz v4, :cond_5

    .line 109
    .line 110
    invoke-virtual {v5, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-object v4, v3

    .line 114
    :cond_5
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_3

    .line 122
    :cond_7
    if-ne v8, v9, :cond_8

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_8
    :goto_5
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    goto :goto_2

    .line 130
    :cond_9
    if-eq v1, v2, :cond_a

    .line 131
    .line 132
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    goto :goto_1

    .line 137
    :cond_a
    :goto_6
    return-void
.end method

.method public final onRelease()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->released:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->invalidateParentLayer:Lhd/a;

    .line 5
    .line 6
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->releaseLayer()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onUnplaced()V
    .locals 11

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->hasNode-H91voCI(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_a

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->getIncludeSelfInTraversal-H91voCI(I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-static {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->access$headNode(Landroidx/compose/ui/node/NodeCoordinator;Z)Landroidx/compose/ui/Modifier$Node;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_1
    if-eqz v1, :cond_a

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    and-int/2addr v3, v0

    .line 47
    if-eqz v3, :cond_a

    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    and-int/2addr v3, v0

    .line 54
    if-eqz v3, :cond_9

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    move-object v4, v1

    .line 58
    move-object v5, v3

    .line 59
    :goto_2
    if-eqz v4, :cond_9

    .line 60
    .line 61
    instance-of v6, v4, Landroidx/compose/ui/node/OnUnplacedModifierNode;

    .line 62
    .line 63
    if-eqz v6, :cond_2

    .line 64
    .line 65
    check-cast v4, Landroidx/compose/ui/node/OnUnplacedModifierNode;

    .line 66
    .line 67
    invoke-interface {v4}, Landroidx/compose/ui/node/OnUnplacedModifierNode;->onUnplaced()V

    .line 68
    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    and-int/2addr v6, v0

    .line 76
    if-eqz v6, :cond_8

    .line 77
    .line 78
    instance-of v6, v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 79
    .line 80
    if-eqz v6, :cond_8

    .line 81
    .line 82
    move-object v6, v4

    .line 83
    check-cast v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 84
    .line 85
    invoke-virtual {v6}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const/4 v7, 0x0

    .line 90
    move v8, v7

    .line 91
    :goto_3
    const/4 v9, 0x1

    .line 92
    if-eqz v6, :cond_7

    .line 93
    .line 94
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    and-int/2addr v10, v0

    .line 99
    if-eqz v10, :cond_6

    .line 100
    .line 101
    add-int/lit8 v8, v8, 0x1

    .line 102
    .line 103
    if-ne v8, v9, :cond_3

    .line 104
    .line 105
    move-object v4, v6

    .line 106
    goto :goto_4

    .line 107
    :cond_3
    if-nez v5, :cond_4

    .line 108
    .line 109
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    .line 110
    .line 111
    const/16 v9, 0x10

    .line 112
    .line 113
    new-array v9, v9, [Landroidx/compose/ui/Modifier$Node;

    .line 114
    .line 115
    invoke-direct {v5, v9, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    :cond_4
    if-eqz v4, :cond_5

    .line 119
    .line 120
    invoke-virtual {v5, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-object v4, v3

    .line 124
    :cond_5
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    goto :goto_3

    .line 132
    :cond_7
    if-ne v8, v9, :cond_8

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_8
    :goto_5
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    goto :goto_2

    .line 140
    :cond_9
    if-eq v1, v2, :cond_a

    .line 141
    .line 142
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    goto :goto_1

    .line 147
    :cond_a
    :goto_6
    return-void
.end method

.method public performDraw(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrapped:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->draw(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final performingMeasure-K40F9xA(JLhd/a;)Landroidx/compose/ui/layout/Placeable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lhd/a;",
            ")",
            "Landroidx/compose/ui/layout/Placeable;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->access$setMeasurementConstraints-BRTryo0(Landroidx/compose/ui/node/NodeCoordinator;J)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroidx/compose/ui/layout/Placeable;

    .line 9
    .line 10
    return-object p1
.end method

.method public placeAt-f8xVGno(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 11

    .line 4
    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->forcePlaceWithLookaheadOffset:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLookaheadDelegate()Landroidx/compose/ui/node/LookaheadDelegate;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/compose/ui/node/LookaheadDelegate;->getPosition-nOcc-ac()J

    move-result-wide v1

    const/4 v4, 0x0

    move-object v0, p0

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->placeSelf-MLgxB_4(JFLhd/l;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    return-void

    :cond_0
    move v3, p3

    move-object v5, p4

    const/4 v9, 0x0

    move-wide v6, p1

    move v8, v3

    move-object v10, v5

    move-object v5, p0

    .line 6
    invoke-direct/range {v5 .. v10}, Landroidx/compose/ui/node/NodeCoordinator;->placeSelf-MLgxB_4(JFLhd/l;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    return-void
.end method

.method public placeAt-f8xVGno(JFLhd/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JF",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iget-boolean v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->forcePlaceWithLookaheadOffset:Z

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLookaheadDelegate()Landroidx/compose/ui/node/LookaheadDelegate;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroidx/compose/ui/node/LookaheadDelegate;->getPosition-nOcc-ac()J

    move-result-wide v1

    const/4 v5, 0x0

    move-object v0, p0

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->placeSelf-MLgxB_4(JFLhd/l;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    return-void

    :cond_0
    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    .line 3
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->placeSelf-MLgxB_4(JFLhd/l;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    return-void
.end method

.method public final placeSelfApparentToRealOffset-MLgxB_4(JFLhd/l;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JF",
            "Lhd/l;",
            "Landroidx/compose/ui/graphics/layer/GraphicsLayer;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getApparentToRealOffset-nOcc-ac()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1, p2, v0, v1}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    move-object v2, p0

    .line 10
    move v5, p3

    .line 11
    move-object v6, p4

    .line 12
    move-object v7, p5

    .line 13
    invoke-direct/range {v2 .. v7}, Landroidx/compose/ui/node/NodeCoordinator;->placeSelf-MLgxB_4(JFLhd/l;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final rectInParent$ui_release(Landroidx/compose/ui/geometry/MutableRect;ZZ)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-boolean v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->isClipping:Z

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    const-wide v1, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/16 v3, 0x20

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getMinimumTouchTargetSize-NH-jbRc()J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    shr-long v4, p2, v3

    .line 23
    .line 24
    long-to-int v4, v4

    .line 25
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/high16 v5, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr v4, v5

    .line 32
    and-long/2addr p2, v1

    .line 33
    long-to-int p2, p2

    .line 34
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    div-float/2addr p2, v5

    .line 39
    neg-float p3, v4

    .line 40
    neg-float v5, p2

    .line 41
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    shr-long/2addr v6, v3

    .line 46
    long-to-int v3, v6

    .line 47
    int-to-float v3, v3

    .line 48
    add-float/2addr v3, v4

    .line 49
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    and-long/2addr v1, v6

    .line 54
    long-to-int v1, v1

    .line 55
    int-to-float v1, v1

    .line 56
    add-float/2addr v1, p2

    .line 57
    invoke-virtual {p1, p3, v5, v3, v1}, Landroidx/compose/ui/geometry/MutableRect;->intersect(FFFF)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    if-eqz p2, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    .line 64
    .line 65
    .line 66
    move-result-wide p2

    .line 67
    shr-long/2addr p2, v3

    .line 68
    long-to-int p2, p2

    .line 69
    int-to-float p2, p2

    .line 70
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    and-long/2addr v1, v3

    .line 75
    long-to-int p3, v1

    .line 76
    int-to-float p3, p3

    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1, v1, v1, p2, p3}, Landroidx/compose/ui/geometry/MutableRect;->intersect(FFFF)V

    .line 79
    .line 80
    .line 81
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    const/4 p2, 0x0

    .line 89
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/node/OwnedLayer;->mapBounds(Landroidx/compose/ui/geometry/MutableRect;Z)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 93
    .line 94
    .line 95
    move-result-wide p2

    .line 96
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->getLeft()F

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    int-to-float p2, p2

    .line 105
    add-float/2addr p3, p2

    .line 106
    invoke-virtual {p1, p3}, Landroidx/compose/ui/geometry/MutableRect;->setLeft(F)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->getRight()F

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    add-float/2addr p3, p2

    .line 114
    invoke-virtual {p1, p3}, Landroidx/compose/ui/geometry/MutableRect;->setRight(F)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 118
    .line 119
    .line 120
    move-result-wide p2

    .line 121
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->getTop()F

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    int-to-float p2, p2

    .line 130
    add-float/2addr p3, p2

    .line 131
    invoke-virtual {p1, p3}, Landroidx/compose/ui/geometry/MutableRect;->setTop(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/MutableRect;->getBottom()F

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    add-float/2addr p3, p2

    .line 139
    invoke-virtual {p1, p3}, Landroidx/compose/ui/geometry/MutableRect;->setBottom(F)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final releaseLayer()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v1, v2, v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerBlock$default(Landroidx/compose/ui/node/NodeCoordinator;Lhd/l;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-static {v0, v2, v3, v1}, Landroidx/compose/ui/node/LayoutNode;->requestRelayout$ui_release$default(Landroidx/compose/ui/node/LayoutNode;ZILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public replace$ui_release()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->zIndex:F

    .line 10
    .line 11
    invoke-virtual {p0, v1, v2, v3, v0}, Landroidx/compose/ui/node/NodeCoordinator;->placeAt-f8xVGno(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->zIndex:F

    .line 20
    .line 21
    iget-object v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/compose/ui/node/NodeCoordinator;->placeAt-f8xVGno(JFLhd/l;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public screenToLocal-MK-Hz9U(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/input/pointer/PositionCalculator;->screenToLocal-MK-Hz9U(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    return-wide p1
.end method

.method public final setForceMeasureWithLookaheadConstraints$ui_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->forceMeasureWithLookaheadConstraints:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setForcePlaceWithLookaheadOffset$ui_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->forcePlaceWithLookaheadOffset:Z

    .line 2
    .line 3
    return-void
.end method

.method public abstract setLookaheadDelegate(Landroidx/compose/ui/node/LookaheadDelegate;)V
.end method

.method public setMeasureResult$ui_release(Landroidx/compose/ui/layout/MeasureResult;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->_measureResult:Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    if-eq p1, v0, :cond_5

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->_measureResult:Landroidx/compose/ui/layout/MeasureResult;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eq v1, v0, :cond_1

    .line 28
    .line 29
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-interface {p1}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->onMeasureResultChanged(II)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->oldAlignmentLines:Landroidx/collection/MutableObjectIntMap;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/collection/ObjectIntMap;->isNotEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    :cond_2
    invoke-interface {p1}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->oldAlignmentLines:Landroidx/collection/MutableObjectIntMap;

    .line 64
    .line 65
    invoke-interface {p1}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v0, v1}, Landroidx/compose/ui/node/NodeCoordinatorKt;->access$compareEquals(Landroidx/collection/MutableObjectIntMap;Ljava/util/Map;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getAlignmentLinesOwner()Landroidx/compose/ui/node/AlignmentLinesOwner;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, Landroidx/compose/ui/node/AlignmentLinesOwner;->getAlignmentLines()Landroidx/compose/ui/node/AlignmentLines;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Landroidx/compose/ui/node/AlignmentLines;->onAlignmentsChanged()V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->oldAlignmentLines:Landroidx/collection/MutableObjectIntMap;

    .line 87
    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    invoke-static {}, Landroidx/collection/ObjectIntMapKt;->mutableObjectIntMapOf()Landroidx/collection/MutableObjectIntMap;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->oldAlignmentLines:Landroidx/collection/MutableObjectIntMap;

    .line 95
    .line 96
    :cond_4
    invoke-virtual {v0}, Landroidx/collection/MutableObjectIntMap;->clear()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Ljava/util/Map$Entry;

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-virtual {v0, v2, v1}, Landroidx/collection/MutableObjectIntMap;->set(Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_5
    return-void
.end method

.method public setPosition--gyyYBs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->position:J

    .line 2
    .line 3
    return-void
.end method

.method public final setWrapped$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrapped:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    return-void
.end method

.method public final setWrappedBy$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    return-void
.end method

.method public final setZIndex(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->zIndex:F

    .line 2
    .line 3
    return-void
.end method

.method public final shouldSharePointerInputWithSiblings()Z
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKindKt;->getIncludeSelfInTraversal-H91voCI(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->headNode(Z)Landroidx/compose/ui/Modifier$Node;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_a

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-interface {v1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    const-string/jumbo v4, "visitLocalDescendants called on an unattached node"

    .line 40
    .line 41
    .line 42
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {v1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    and-int/2addr v4, v3

    .line 54
    if-eqz v4, :cond_a

    .line 55
    .line 56
    :goto_0
    if-eqz v1, :cond_a

    .line 57
    .line 58
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    and-int/2addr v4, v3

    .line 63
    if-eqz v4, :cond_9

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    move-object v5, v1

    .line 67
    move-object v6, v4

    .line 68
    :goto_1
    if-eqz v5, :cond_9

    .line 69
    .line 70
    instance-of v7, v5, Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 71
    .line 72
    const/4 v8, 0x1

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    check-cast v5, Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 76
    .line 77
    invoke-interface {v5}, Landroidx/compose/ui/node/PointerInputModifierNode;->sharePointerInputWithSiblings()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_8

    .line 82
    .line 83
    return v8

    .line 84
    :cond_2
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    and-int/2addr v7, v3

    .line 89
    if-eqz v7, :cond_8

    .line 90
    .line 91
    instance-of v7, v5, Landroidx/compose/ui/node/DelegatingNode;

    .line 92
    .line 93
    if-eqz v7, :cond_8

    .line 94
    .line 95
    move-object v7, v5

    .line 96
    check-cast v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 97
    .line 98
    invoke-virtual {v7}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    move v9, v2

    .line 103
    :goto_2
    if-eqz v7, :cond_7

    .line 104
    .line 105
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    and-int/2addr v10, v3

    .line 110
    if-eqz v10, :cond_6

    .line 111
    .line 112
    add-int/lit8 v9, v9, 0x1

    .line 113
    .line 114
    if-ne v9, v8, :cond_3

    .line 115
    .line 116
    move-object v5, v7

    .line 117
    goto :goto_3

    .line 118
    :cond_3
    if-nez v6, :cond_4

    .line 119
    .line 120
    new-instance v6, Landroidx/compose/runtime/collection/MutableVector;

    .line 121
    .line 122
    new-array v10, v0, [Landroidx/compose/ui/Modifier$Node;

    .line 123
    .line 124
    invoke-direct {v6, v10, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 125
    .line 126
    .line 127
    :cond_4
    if-eqz v5, :cond_5

    .line 128
    .line 129
    invoke-virtual {v6, v5}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-object v5, v4

    .line 133
    :cond_5
    invoke-virtual {v6, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    :cond_6
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    goto :goto_2

    .line 141
    :cond_7
    if-ne v9, v8, :cond_8

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_8
    invoke-static {v6}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    goto :goto_1

    .line 149
    :cond_9
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    goto :goto_0

    .line 154
    :cond_a
    return v2
.end method

.method public toParentPosition-8S9VItk(JZ)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, p1, p2, v1}, Landroidx/compose/ui/node/OwnedLayer;->mapOffset-8S9VItk(JZ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    :cond_0
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacedUnderMotionFrameOfReference()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    return-wide p1

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {p1, p2, v0, v1}, Landroidx/compose/ui/unit/IntOffsetKt;->plus-Nv-tHpc(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1
.end method

.method public final touchBoundsInRoot()Landroidx/compose/ui/geometry/Rect;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/ui/geometry/Rect;->Companion:Landroidx/compose/ui/geometry/Rect$Companion;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect$Companion;->getZero()Landroidx/compose/ui/geometry/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getRectCache()Landroidx/compose/ui/geometry/MutableRect;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getMinimumTouchTargetSize-NH-jbRc()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-virtual {p0, v2, v3}, Landroidx/compose/ui/node/NodeCoordinator;->calculateMinimumTouchTargetPadding-E7KxVPU(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    shr-long v4, v2, v4

    .line 33
    .line 34
    long-to-int v4, v4

    .line 35
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    neg-float v5, v5

    .line 40
    invoke-virtual {v1, v5}, Landroidx/compose/ui/geometry/MutableRect;->setLeft(F)V

    .line 41
    .line 42
    .line 43
    const-wide v5, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v2, v5

    .line 49
    long-to-int v2, v2

    .line 50
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    neg-float v3, v3

    .line 55
    invoke-virtual {v1, v3}, Landroidx/compose/ui/geometry/MutableRect;->setTop(F)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    int-to-float v3, v3

    .line 63
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    add-float/2addr v3, v4

    .line 68
    invoke-virtual {v1, v3}, Landroidx/compose/ui/geometry/MutableRect;->setRight(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredHeight()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    int-to-float v3, v3

    .line 76
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    add-float/2addr v3, v2

    .line 81
    invoke-virtual {v1, v3}, Landroidx/compose/ui/geometry/MutableRect;->setBottom(F)V

    .line 82
    .line 83
    .line 84
    move-object v2, p0

    .line 85
    :goto_0
    if-eq v2, v0, :cond_2

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x1

    .line 89
    invoke-virtual {v2, v1, v3, v4}, Landroidx/compose/ui/node/NodeCoordinator;->rectInParent$ui_release(Landroidx/compose/ui/geometry/MutableRect;ZZ)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/MutableRect;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_1

    .line 97
    .line 98
    sget-object v0, Landroidx/compose/ui/geometry/Rect;->Companion:Landroidx/compose/ui/geometry/Rect$Companion;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect$Companion;->getZero()Landroidx/compose/ui/geometry/Rect;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0

    .line 105
    :cond_1
    iget-object v2, v2, Landroidx/compose/ui/node/NodeCoordinator;->wrappedBy:Landroidx/compose/ui/node/NodeCoordinator;

    .line 106
    .line 107
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    invoke-static {v1}, Landroidx/compose/ui/geometry/MutableRectKt;->toRect(Landroidx/compose/ui/geometry/MutableRect;)Landroidx/compose/ui/geometry/Rect;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method

.method public transformFrom-EL8BTi8(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->toCoordinator(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->onCoordinatesUsed$ui_release()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->findCommonAncestor$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p2}, Landroidx/compose/ui/graphics/Matrix;->reset-impl([F)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0, p2}, Landroidx/compose/ui/node/NodeCoordinator;->transformToAncestor-EL8BTi8(Landroidx/compose/ui/node/NodeCoordinator;[F)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0, p2}, Landroidx/compose/ui/node/NodeCoordinator;->transformFromAncestor-EL8BTi8(Landroidx/compose/ui/node/NodeCoordinator;[F)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public transformToScreen-58bKbWc([F)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->toCoordinator(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {p0, v1, p1}, Landroidx/compose/ui/node/NodeCoordinator;->transformToAncestor-EL8BTi8(Landroidx/compose/ui/node/NodeCoordinator;[F)V

    .line 18
    .line 19
    .line 20
    instance-of v2, v0, Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    check-cast v0, Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;->localToScreen-58bKbWc([F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionOnScreen(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide v2, 0x7fffffff7fffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v2, v0

    .line 40
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    cmp-long v2, v2, v4

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    const/16 v2, 0x20

    .line 50
    .line 51
    shr-long v2, v0, v2

    .line 52
    .line 53
    long-to-int v2, v2

    .line 54
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const-wide v3, 0xffffffffL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v0, v3

    .line 64
    long-to-int v0, v0

    .line 65
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-static {p1, v2, v0, v1}, Landroidx/compose/ui/graphics/Matrix;->translate-impl([FFFF)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public final updateLayerBlock(Lhd/l;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Z)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->explicitLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move v2, v1

    .line 13
    :goto_1
    if-nez v2, :cond_2

    .line 14
    .line 15
    const-string v2, "layerBlock can\'t be provided when explicitLayer is provided"

    .line 16
    .line 17
    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez p2, :cond_4

    .line 25
    .line 26
    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 27
    .line 28
    if-ne p2, p1, :cond_4

    .line 29
    .line 30
    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerDensity:Landroidx/compose/ui/unit/Density;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {p2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_4

    .line 41
    .line 42
    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerLayoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 43
    .line 44
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eq p2, v3, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move p2, v0

    .line 52
    goto :goto_3

    .line 53
    :cond_4
    :goto_2
    move p2, v1

    .line 54
    :goto_3
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iput-object v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerDensity:Landroidx/compose/ui/unit/Density;

    .line 59
    .line 60
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iput-object v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerLayoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->isAttached()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    const/4 v4, 0x0

    .line 71
    if-eqz v3, :cond_7

    .line 72
    .line 73
    if-eqz p1, :cond_7

    .line 74
    .line 75
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 76
    .line 77
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    invoke-static {v2}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getDrawBlock()Lhd/p;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    iget-object v7, p0, Landroidx/compose/ui/node/NodeCoordinator;->invalidateParentLayer:Lhd/a;

    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getForceUseOldLayers()Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    const/4 v10, 0x4

    .line 96
    const/4 v11, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/node/Owner;->createLayer$default(Landroidx/compose/ui/node/Owner;Lhd/p;Lhd/a;Landroidx/compose/ui/graphics/layer/GraphicsLayer;ZILjava/lang/Object;)Landroidx/compose/ui/node/OwnedLayer;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getMeasuredSize-YbymL2g()J

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    invoke-interface {p1, v5, v6}, Landroidx/compose/ui/node/OwnedLayer;->resize-ozmzZPI(J)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    invoke-interface {p1, v5, v6}, Landroidx/compose/ui/node/OwnedLayer;->move--gyyYBs(J)V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 117
    .line 118
    invoke-static {p0, v0, v1, v4}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerParameters$default(Landroidx/compose/ui/node/NodeCoordinator;ZILjava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v1}, Landroidx/compose/ui/node/LayoutNode;->setInnerLayerCoordinatorIsDirty$ui_release(Z)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->invalidateParentLayer:Lhd/a;

    .line 125
    .line 126
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_5
    if-eqz p2, :cond_6

    .line 131
    .line 132
    invoke-static {p0, v0, v1, v4}, Landroidx/compose/ui/node/NodeCoordinator;->updateLayerParameters$default(Landroidx/compose/ui/node/NodeCoordinator;ZILjava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    invoke-static {v2}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getRectManager()Landroidx/compose/ui/spatial/RectManager;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1, v2}, Landroidx/compose/ui/spatial/RectManager;->onLayoutLayerPositionalPropertiesChanged(Landroidx/compose/ui/node/LayoutNode;)V

    .line 147
    .line 148
    .line 149
    :cond_6
    return-void

    .line 150
    :cond_7
    iput-object v4, p0, Landroidx/compose/ui/node/NodeCoordinator;->layerBlock:Lhd/l;

    .line 151
    .line 152
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 153
    .line 154
    if-eqz p1, :cond_8

    .line 155
    .line 156
    invoke-interface {p1}, Landroidx/compose/ui/node/OwnedLayer;->destroy()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v1}, Landroidx/compose/ui/node/LayoutNode;->setInnerLayerCoordinatorIsDirty$ui_release(Z)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->invalidateParentLayer:Lhd/a;

    .line 163
    .line 164
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_8

    .line 172
    .line 173
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->isPlaced()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_8

    .line 178
    .line 179
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getOwner$ui_release()Landroidx/compose/ui/node/Owner;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-eqz p1, :cond_8

    .line 184
    .line 185
    invoke-interface {p1, v2}, Landroidx/compose/ui/node/Owner;->onLayoutChange(Landroidx/compose/ui/node/LayoutNode;)V

    .line 186
    .line 187
    .line 188
    :cond_8
    iput-object v4, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 189
    .line 190
    iput-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->lastLayerDrawingWasSkipped:Z

    .line 191
    .line 192
    return-void
.end method

.method public final visitNodes(IZLhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    :goto_0
    invoke-static {p0, p2}, Landroidx/compose/ui/node/NodeCoordinator;->access$headNode(Landroidx/compose/ui/node/NodeCoordinator;Z)Landroidx/compose/ui/Modifier$Node;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_1
    if-eqz p2, :cond_4

    .line 20
    .line 21
    invoke-virtual {p2}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    and-int/2addr v1, p1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-virtual {p2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    and-int/2addr v1, p1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {p3, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_3
    if-eq p2, v0, :cond_4

    .line 40
    .line 41
    invoke-virtual {p2}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    goto :goto_1

    .line 46
    :cond_4
    :goto_2
    return-void
.end method

.method public final synthetic visitNodes-aLcG6gQ(ILhd/l;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/node/NodeKindKt;->getIncludeSelfInTraversal-H91voCI(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getTail()Landroidx/compose/ui/Modifier$Node;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_1
    :goto_0
    invoke-static {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->access$headNode(Landroidx/compose/ui/node/NodeCoordinator;Z)Landroidx/compose/ui/Modifier$Node;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_1
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    and-int/2addr v2, p1

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    and-int/2addr v2, p1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    move-object v2, v0

    .line 40
    :goto_2
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    const-string v4, "T"

    .line 44
    .line 45
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p2, v2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    if-eq v0, v1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_3
    return-void
.end method

.method public windowToLocal-MK-Hz9U(J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Landroidx/compose/ui/node/LayoutNodeKt;->requireOwner(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1, p1, p2}, Landroidx/compose/ui/node/Owner;->calculateLocalPosition-MK-Hz9U(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {p1, p2, v1, v2}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    invoke-virtual {p0, v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    return-wide p1
.end method

.method public final withPositionTranslation(Landroidx/compose/ui/graphics/Canvas;Lhd/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/graphics/Canvas;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-float v1, v1

    .line 19
    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/Canvas;->translate(FF)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    neg-float p2, v0

    .line 26
    neg-float v0, v1

    .line 27
    invoke-interface {p1, p2, v0}, Landroidx/compose/ui/graphics/Canvas;->translate(FF)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final withinLayerBounds-k-4lQ0M(J)Z
    .locals 4

    .line 1
    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long v2, p1, v0

    .line 7
    .line 8
    xor-long/2addr v0, v2

    .line 9
    const-wide v2, 0x100000001L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v0, v2

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->layer:Landroidx/compose/ui/node/OwnedLayer;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->isClipping:Z

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/node/OwnedLayer;->isInLayer-k-4lQ0M(J)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return v1

    .line 44
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_2
    return v1
.end method
