.class public final Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

.field private final backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

.field private final fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixLayer;

.field private final maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskLayer;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;Lcom/zykj/blackboard/core/canvas/view/FixLayer;Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;Lcom/zykj/blackboard/core/canvas/view/MaskLayer;)V
    .locals 1

    .line 1
    const-string v0, "backgroundLayer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fixLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskLayer;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final getActiveLayer()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFixLayer()Lcom/zykj/blackboard/core/canvas/view/FixLayer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaskLayer()Lcom/zykj/blackboard/core/canvas/view/MaskLayer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRenderRect()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/FixLayer;->rect()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/FixLayer;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;->clear()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
