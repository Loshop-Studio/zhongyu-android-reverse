.class public final synthetic Lcom/zykj/blackboard/core/canvas/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchPlayView;Lr6/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/blackboard/core/canvas/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/c;->b:Lr6/c;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/blackboard/core/canvas/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/c;->b:Lr6/c;

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/c;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/c;->c:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/c;->b:Lr6/c;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->a(Lcom/zykj/blackboard/core/canvas/SketchPlayView;Lr6/c;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/c;->c:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/c;->b:Lr6/c;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->a(Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
