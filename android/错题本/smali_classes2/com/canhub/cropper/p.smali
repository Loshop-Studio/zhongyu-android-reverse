.class public final synthetic Lcom/canhub/cropper/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/canhub/cropper/p;->a:I

    iput-object p1, p0, Lcom/canhub/cropper/p;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/canhub/cropper/p;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/p;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 9
    .line 10
    invoke-static {v1, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->m(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast v1, Lr6/c;

    .line 15
    .line 16
    sget p1, Lcom/canhub/cropper/CropImageActivity;->h:I

    .line 17
    .line 18
    const-string p1, "$openSource"

    .line 19
    .line 20
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    sget-object p1, Lcom/canhub/cropper/CropImageActivity$Source;->CAMERA:Lcom/canhub/cropper/CropImageActivity$Source;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Lcom/canhub/cropper/CropImageActivity$Source;->GALLERY:Lcom/canhub/cropper/CropImageActivity$Source;

    .line 29
    .line 30
    :goto_0
    invoke-interface {v1, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
