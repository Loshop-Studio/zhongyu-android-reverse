.class public final synthetic Lcom/zykj/view/board/crop/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public synthetic constructor <init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/crop/c;->a:I

    iput-object p2, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/crop/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->d(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->c(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->a(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->e(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->b(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$3;->b(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->m(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lcom/zykj/view/board/crop/c;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
