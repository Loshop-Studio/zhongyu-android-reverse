.class public final synthetic Lcom/zykj/view/board/board/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardFragment;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;II)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/view/board/board/c;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/c;->b:Lcom/zykj/view/board/board/BoardFragment;

    iput p2, p0, Lcom/zykj/view/board/board/c;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/board/c;->b:Lcom/zykj/view/board/board/BoardFragment;

    iget v1, p0, Lcom/zykj/view/board/board/c;->c:I

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment;->b0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/board/c;->b:Lcom/zykj/view/board/board/BoardFragment;

    iget v1, p0, Lcom/zykj/view/board/board/c;->c:I

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment;->a0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/board/c;->b:Lcom/zykj/view/board/board/BoardFragment;

    iget v1, p0, Lcom/zykj/view/board/board/c;->c:I

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment;->C(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/board/c;->b:Lcom/zykj/view/board/board/BoardFragment;

    iget v1, p0, Lcom/zykj/view/board/board/c;->c:I

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment;->L(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
