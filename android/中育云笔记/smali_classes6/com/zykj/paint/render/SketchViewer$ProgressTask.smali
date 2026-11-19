.class public Lcom/zykj/paint/render/SketchViewer$ProgressTask;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/render/SketchViewer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProgressTask"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/render/SketchViewer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchViewer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer$ProgressTask;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$ProgressTask;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->access$000(Lcom/zykj/paint/render/SketchViewer;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$ProgressTask;->this$0:Lcom/zykj/paint/render/SketchViewer;

    .line 10
    .line 11
    new-instance v1, Lcom/zykj/paint/render/SketchViewer$ProgressTask$1;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchViewer$ProgressTask$1;-><init>(Lcom/zykj/paint/render/SketchViewer$ProgressTask;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
