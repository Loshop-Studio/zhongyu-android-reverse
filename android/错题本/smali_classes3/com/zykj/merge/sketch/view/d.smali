.class public final synthetic Lcom/zykj/merge/sketch/view/d;
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
    iput p2, p0, Lcom/zykj/merge/sketch/view/d;->a:I

    iput-object p3, p0, Lcom/zykj/merge/sketch/view/d;->b:Lr6/c;

    iput p1, p0, Lcom/zykj/merge/sketch/view/d;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/merge/sketch/view/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/d;->b:Lr6/c;

    iget v1, p0, Lcom/zykj/merge/sketch/view/d;->c:I

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->d(Lr6/c;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/d;->b:Lr6/c;

    iget v1, p0, Lcom/zykj/merge/sketch/view/d;->c:I

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->a(Lr6/c;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
