.class public Lcom/zykj/paint/render/SketchViewer$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/render/SketchViewer;->u()V
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
    iput-object p1, p0, Lcom/zykj/paint/render/SketchViewer$b;->a:Lcom/zykj/paint/render/SketchViewer;

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
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer$b;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/paint/render/SketchViewer;->d(Lcom/zykj/paint/render/SketchViewer;)Landroid/media/MediaPlayer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/paint/render/SketchViewer$b;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/paint/render/SketchViewer;->d(Lcom/zykj/paint/render/SketchViewer;)Landroid/media/MediaPlayer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-virtual {p1, v0, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
