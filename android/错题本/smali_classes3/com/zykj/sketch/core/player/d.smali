.class public final synthetic Lcom/zykj/sketch/core/player/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(IILr6/c;)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/sketch/core/player/d;->a:I

    iput-object p3, p0, Lcom/zykj/sketch/core/player/d;->b:Lr6/c;

    iput p1, p0, Lcom/zykj/sketch/core/player/d;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/player/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/sketch/core/player/d;->b:Lr6/c;

    iget v1, p0, Lcom/zykj/sketch/core/player/d;->c:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->e(Lr6/c;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/d;->b:Lr6/c;

    iget v1, p0, Lcom/zykj/sketch/core/player/d;->c:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->b(Lr6/c;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
