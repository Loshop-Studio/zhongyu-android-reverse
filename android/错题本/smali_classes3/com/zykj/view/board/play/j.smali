.class public final synthetic Lcom/zykj/view/board/play/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/play/j;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/play/j;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/j;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/play/j;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->c(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/play/j;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->e(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/play/j;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->b(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/play/j;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->a(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
