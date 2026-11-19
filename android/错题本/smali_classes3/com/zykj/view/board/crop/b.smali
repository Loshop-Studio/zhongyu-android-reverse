.class public final synthetic Lcom/zykj/view/board/crop/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public synthetic constructor <init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/crop/b;->a:I

    iput-object p2, p0, Lcom/zykj/view/board/crop/b;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/crop/b;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/crop/b;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {p1, v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->c(ILcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/crop/b;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {p1, v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$3;->c(ILcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/crop/b;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {p1, v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->x(ILcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/crop/b;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->t(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/crop/b;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {p1, v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->k(ILcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/crop/b;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {p1, v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->f(ILcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object p1

    return-object p1

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
