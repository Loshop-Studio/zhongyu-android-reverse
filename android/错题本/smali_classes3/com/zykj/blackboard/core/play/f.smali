.class public final synthetic Lcom/zykj/blackboard/core/play/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/play/f;->a:I

    iput-object p2, p0, Lcom/zykj/blackboard/core/play/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/blackboard/core/play/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/play/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/blackboard/core/play/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/blackboard/core/play/PlayPageControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/f;->c:Ljava/lang/Object;

    check-cast v1, Lr6/a;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->b(Lcom/zykj/blackboard/core/play/PlayPageControl;Lr6/a;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/f;->b:Ljava/lang/Object;

    check-cast v0, Lr6/c;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/f;->c:Ljava/lang/Object;

    check-cast v1, Lcom/zykj/blackboard/core/play/PlayControl;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayControl;->d(Lr6/c;Lcom/zykj/blackboard/core/play/PlayControl;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/f;->c:Ljava/lang/Object;

    check-cast v1, Lr6/a;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->a(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Lr6/a;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/f;->b:Ljava/lang/Object;

    check-cast v0, Lr6/c;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/f;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->a(Lr6/c;Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
