.class public final synthetic Lcom/zykj/view/board/board/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/board/l;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/l;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/l;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/board/l;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardViewModel;->m(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/board/l;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardViewModel;->j(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/board/l;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardViewModel;->o(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/board/l;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardViewModel;->i(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcom/zykj/view/board/board/l;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardViewModel;->f(Lcom/zykj/view/board/board/BoardViewModel;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
