.class public final synthetic Lcom/zykj/merge/sketch/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lr6/c;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/merge/sketch/view/a;->a:I

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/a;->b:Lr6/c;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/merge/sketch/view/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/a;->b:Lr6/c;

    invoke-static {v1, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->j(Lr6/c;Ljava/lang/Exception;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/a;->c:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/blackboard/core/play/IPlayPageControl;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/a;->b:Lr6/c;

    invoke-static {v1, v0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->a(Lr6/c;Lcom/zykj/blackboard/core/play/IPlayPageControl;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
