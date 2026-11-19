.class public final synthetic Lcom/zykj/view/board/board/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/board/a;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->B(Lcom/zykj/view/board/board/BoardFragment;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->e(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->R(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->N(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->m(Lcom/zykj/view/board/board/BoardFragment;F)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->I(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->Q(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->u(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lcom/zykj/view/board/board/a;->b:Lcom/zykj/view/board/board/BoardFragment;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->h(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
