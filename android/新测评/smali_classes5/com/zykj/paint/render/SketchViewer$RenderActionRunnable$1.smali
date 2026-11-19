.class Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;->this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;->this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$300(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/concurrent/ScheduledFuture;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;->this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$300(Lcom/zykj/paint/render/SketchViewer;)Ljava/util/concurrent/ScheduledFuture;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;->this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$400(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/player/PlayStatusListener;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;->this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$400(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/player/PlayStatusListener;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Lcom/zykj/paint/player/PlayStatusListener;->onPlayEnd()V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;->this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$400(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/player/PlayStatusListener;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;->this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 57
    .line 58
    iget-object v0, v0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 59
    .line 60
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$400(Lcom/zykj/paint/render/SketchViewer;)Lcom/zykj/paint/player/PlayStatusListener;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable$1;->this$1:Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;

    .line 65
    .line 66
    iget-object v1, v1, Lcom/zykj/paint/render/SketchViewer$RenderActionRunnable;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 67
    .line 68
    invoke-static {v1}, Lcom/zykj/paint/render/SketchViewer;->access$500(Lcom/zykj/paint/render/SketchViewer;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    invoke-interface {v0, v1, v2}, Lcom/zykj/paint/player/PlayStatusListener;->onUpdate(J)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method
