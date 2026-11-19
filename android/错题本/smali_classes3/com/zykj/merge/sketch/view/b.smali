.class public final synthetic Lcom/zykj/merge/sketch/view/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lr6/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/merge/sketch/view/b;->a:I

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/b;->b:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/merge/sketch/view/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/b;->b:Lr6/c;

    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b(Lr6/c;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/b;->b:Lr6/c;

    invoke-static {v0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->a(Lr6/c;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/b;->b:Lr6/c;

    invoke-static {v0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$2;->a(Lr6/c;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
