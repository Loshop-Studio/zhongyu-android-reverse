.class public final synthetic Lcom/zykj/view/board/board/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/board/f;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/f;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/board/f;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->y(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/board/f;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->f0(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/board/f;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->X(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/board/f;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->J(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcom/zykj/view/board/board/f;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->o(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lcom/zykj/view/board/board/f;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->z(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lcom/zykj/view/board/board/f;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->E(Lcom/zykj/view/board/board/BoardFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
