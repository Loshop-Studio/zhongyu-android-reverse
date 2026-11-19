.class public Lcom/zykj/paint/render/SketchViewer$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/render/SketchViewer;->B(I)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/paint/render/SketchViewer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchViewer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer$a;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer$a;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/paint/render/SketchViewer;->d(Lcom/zykj/paint/render/SketchViewer;)Landroid/media/MediaPlayer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-virtual {p1, v0, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer$a;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/zykj/paint/render/SketchViewer;->d(Lcom/zykj/paint/render/SketchViewer;)Landroid/media/MediaPlayer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lcom/zykj/paint/render/SketchViewer$a;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/zykj/paint/render/SketchViewer;->k(Lcom/zykj/paint/render/SketchViewer;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    long-to-int v0, v0

    .line 25
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
