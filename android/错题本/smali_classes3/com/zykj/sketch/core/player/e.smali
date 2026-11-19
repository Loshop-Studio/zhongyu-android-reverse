.class public final synthetic Lcom/zykj/sketch/core/player/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic c:Lr6/c;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;II)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/zykj/sketch/core/player/e;->a:I

    iput-object p1, p0, Lcom/zykj/sketch/core/player/e;->b:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/e;->c:Lr6/c;

    iput p3, p0, Lcom/zykj/sketch/core/player/e;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/player/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/sketch/core/player/e;->c:Lr6/c;

    iget v1, p0, Lcom/zykj/sketch/core/player/e;->d:I

    iget-object v2, p0, Lcom/zykj/sketch/core/player/e;->b:Lcom/zykj/sketch/core/player/SketchPlayerView;

    invoke-static {v2, v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->n(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/e;->c:Lr6/c;

    iget v1, p0, Lcom/zykj/sketch/core/player/e;->d:I

    iget-object v2, p0, Lcom/zykj/sketch/core/player/e;->b:Lcom/zykj/sketch/core/player/SketchPlayerView;

    invoke-static {v2, v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->a(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
