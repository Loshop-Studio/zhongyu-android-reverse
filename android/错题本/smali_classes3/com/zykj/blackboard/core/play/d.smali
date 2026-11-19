.class public final synthetic Lcom/zykj/blackboard/core/play/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;

.field public final synthetic c:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lr6/c;Ljava/lang/Exception;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/blackboard/core/play/d;->a:I

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/d;->b:Lr6/c;

    iput-object p2, p0, Lcom/zykj/blackboard/core/play/d;->c:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/play/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/blackboard/core/play/d;->b:Lr6/c;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/d;->c:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayControl;->c(Lr6/c;Ljava/lang/Exception;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/d;->b:Lr6/c;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/d;->c:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayControl;->a(Lr6/c;Ljava/lang/Exception;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
