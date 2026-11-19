.class public final synthetic Lcom/zykj/blackboard/core/canvas/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/blackboard/core/canvas/view/MaskView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/view/MaskView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/blackboard/core/canvas/view/a;->a:I

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/a;->b:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/a;->b:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    invoke-static {v0}, Lcom/zykj/blackboard/core/canvas/view/MaskView;->b(Lcom/zykj/blackboard/core/canvas/view/MaskView;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/a;->b:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    invoke-static {v0}, Lcom/zykj/blackboard/core/canvas/view/MaskView;->a(Lcom/zykj/blackboard/core/canvas/view/MaskView;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
