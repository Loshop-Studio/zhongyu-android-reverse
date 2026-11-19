.class public final synthetic Lcom/zykj/sketch/core/player/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/sketch/core/player/SketchPlayerView;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lr6/c;

.field public final synthetic e:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/zykj/sketch/core/player/c;->a:I

    iput-object p1, p0, Lcom/zykj/sketch/core/player/c;->b:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/c;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/sketch/core/player/c;->d:Lr6/c;

    iput-object p4, p0, Lcom/zykj/sketch/core/player/c;->e:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/player/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/sketch/core/player/c;->d:Lr6/c;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/c;->e:Lr6/c;

    iget-object v2, p0, Lcom/zykj/sketch/core/player/c;->b:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v3, p0, Lcom/zykj/sketch/core/player/c;->c:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->p(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/c;->d:Lr6/c;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/c;->e:Lr6/c;

    iget-object v2, p0, Lcom/zykj/sketch/core/player/c;->b:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v3, p0, Lcom/zykj/sketch/core/player/c;->c:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->k(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
