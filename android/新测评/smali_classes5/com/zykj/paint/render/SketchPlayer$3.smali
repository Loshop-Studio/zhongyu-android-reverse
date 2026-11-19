.class Lcom/zykj/paint/render/SketchPlayer$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/player/PlayStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/render/SketchPlayer;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/render/SketchPlayer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$3;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPlayEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer$3;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchPlayer;->pausePlayer()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer$3;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/paint/render/SketchPlayer;->access$300(Lcom/zykj/paint/render/SketchPlayer;)Lcom/zykj/paint/render/SketchViewer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->reset()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onPlayPause()V
    .locals 0

    return-void
.end method

.method public onPlayStart()V
    .locals 0

    return-void
.end method

.method public onUpdate(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer$3;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/paint/render/SketchPlayer;->access$600(Lcom/zykj/paint/render/SketchPlayer;)Landroid/widget/SeekBar;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    long-to-int p1, p1

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/zykj/paint/render/SketchPlayer$3;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 12
    .line 13
    invoke-static {p2}, Lcom/zykj/paint/render/SketchPlayer;->access$400(Lcom/zykj/paint/render/SketchPlayer;)Landroid/widget/TextView;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1}, Lcom/zykj/paint/util/TimeUtils;->formatTime(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
