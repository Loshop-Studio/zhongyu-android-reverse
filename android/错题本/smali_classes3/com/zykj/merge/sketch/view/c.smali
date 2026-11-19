.class public final synthetic Lcom/zykj/merge/sketch/view/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;

.field public final synthetic c:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lr6/c;Ljava/lang/Throwable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/merge/sketch/view/c;->a:I

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/c;->b:Lr6/c;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/c;->c:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/merge/sketch/view/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/c;->b:Lr6/c;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/c;->c:Ljava/lang/Throwable;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$2;->a(Lr6/c;Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/c;->b:Lr6/c;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/c;->c:Ljava/lang/Throwable;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$2;->a(Lr6/c;Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
