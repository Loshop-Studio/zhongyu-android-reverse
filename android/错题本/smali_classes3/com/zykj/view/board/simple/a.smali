.class public final synthetic Lcom/zykj/view/board/simple/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/simple/SimpleFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/simple/SimpleFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/simple/a;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/simple/a;->b:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/simple/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/simple/a;->b:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->n(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/simple/a;->b:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->l(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/simple/a;->b:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->h(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/simple/a;->b:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->j(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/zykj/view/board/simple/a;->b:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->p(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lcom/zykj/view/board/simple/a;->b:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->o(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
