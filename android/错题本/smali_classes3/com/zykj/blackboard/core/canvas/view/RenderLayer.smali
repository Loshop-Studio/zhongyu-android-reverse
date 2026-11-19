.class public final Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "",
        "Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;",
        "backgroundLayer",
        "Lcom/zykj/blackboard/core/canvas/view/FixLayer;",
        "fixLayer",
        "Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;",
        "activeLayer",
        "Lcom/zykj/blackboard/core/canvas/view/MaskLayer;",
        "maskLayer",
        "<init>",
        "(Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;Lcom/zykj/blackboard/core/canvas/view/FixLayer;Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;Lcom/zykj/blackboard/core/canvas/view/MaskLayer;)V",
        "Landroid/graphics/Rect;",
        "getRenderRect",
        "()Landroid/graphics/Rect;",
        "Ld6/s;",
        "reset",
        "()V",
        "Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;",
        "getBackgroundLayer",
        "()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;",
        "Lcom/zykj/blackboard/core/canvas/view/FixLayer;",
        "getFixLayer",
        "()Lcom/zykj/blackboard/core/canvas/view/FixLayer;",
        "Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;",
        "getActiveLayer",
        "()Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;",
        "Lcom/zykj/blackboard/core/canvas/view/MaskLayer;",
        "getMaskLayer",
        "()Lcom/zykj/blackboard/core/canvas/view/MaskLayer;",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixLayer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskLayer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;Lcom/zykj/blackboard/core/canvas/view/FixLayer;Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;Lcom/zykj/blackboard/core/canvas/view/MaskLayer;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/canvas/view/FixLayer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/blackboard/core/canvas/view/MaskLayer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "backgroundLayer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fixLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBackgroundLayer()Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFixLayer()Lcom/zykj/blackboard/core/canvas/view/FixLayer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaskLayer()Lcom/zykj/blackboard/core/canvas/view/MaskLayer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRenderRect()Landroid/graphics/Rect;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
