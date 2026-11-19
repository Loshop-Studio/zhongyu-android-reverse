.class public final Lb5/i;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/base/BasePresenter;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/base/BasePresenter;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb5/i;->a:I

    iput-object p1, p0, Lb5/i;->b:Lcom/zykj/mistake/base/BasePresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lb5/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lb5/i;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 12
    .line 13
    check-cast p1, Lcom/zykj/mistake/presenter/SketchPresenter;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lcom/zykj/mistake/activity/SketchActivity;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p1, Lcom/zykj/mistake/activity/SketchActivity;->l:Landroidx/appcompat/app/AlertDialog;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p1, "mSubmitFailedDialog"

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    throw p1

    .line 36
    :cond_1
    :goto_0
    return-void

    .line 37
    :pswitch_0
    const-string v0, "e"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lb5/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/network/ApiResp;

    .line 7
    .line 8
    const-string v0, "resp"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lb5/i;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 14
    .line 15
    check-cast p1, Lcom/zykj/mistake/presenter/SketchPresenter;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Lcom/zykj/mistake/activity/SketchActivity;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/mistake/activity/SketchActivity;->v()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/network/ApiResp;

    .line 36
    .line 37
    const-string v0, "resp"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lb5/i;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 43
    .line 44
    check-cast p1, Lcom/zykj/mistake/presenter/SketchPlayerPresenter;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lcom/zykj/mistake/activity/SketchPlayerActivity;

    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    check-cast p1, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;

    .line 52
    .line 53
    const-string v0, "resp"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lb5/i;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 59
    .line 60
    check-cast v0, Lcom/zykj/mistake/presenter/NotePresenter;

    .line 61
    .line 62
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lcom/zykj/mistake/fragment/NoteFragment;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;->getResult()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iput-boolean v1, v0, Lcom/zykj/mistake/fragment/NoteFragment;->k:Z

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v2, "SP_CAN_OPEN_CAMERA"

    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;->getResult()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-static {v1, v2, p1}, Lcom/zykj/mistake/utils/d;->e(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string v0, "SP_NEED_SHOW_CAMERA_DIALOG"

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    invoke-static {p1, v0, v1}, Lcom/zykj/mistake/utils/d;->e(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    :cond_1
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
