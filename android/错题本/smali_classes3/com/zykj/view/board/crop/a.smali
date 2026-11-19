.class public final synthetic Lcom/zykj/view/board/crop/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public synthetic constructor <init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/crop/a;->a:I

    iput-object p2, p0, Lcom/zykj/view/board/crop/a;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/crop/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/crop/a;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->v(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/crop/a;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->u(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/crop/a;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->q(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/crop/a;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->r(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcom/zykj/view/board/crop/a;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;

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
