.class public final Lcom/zykj/mistake/feature/notebook/detail/c5;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public a:Landroidx/camera/camera2/interop/d;


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/c5;->a:Landroidx/camera/camera2/interop/d;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v1, v0, Landroidx/camera/camera2/interop/d;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lw4/c;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/camera/camera2/interop/d;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 17
    .line 18
    iget v2, p1, Landroid/os/Message;->what:I

    .line 19
    .line 20
    const/16 v3, 0x67

    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :pswitch_0
    check-cast v1, Lcom/zykj/mistake/activity/MainActivity;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/zykj/mistake/activity/MainActivity;->c()V

    .line 31
    .line 32
    .line 33
    const-string p1, "\u4e0a\u4f20\u5931\u8d25"

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    const-string v2, "UPLOAD_SUCCESS_URL"

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p1, 0x0

    .line 53
    :goto_0
    if-nez p1, :cond_2

    .line 54
    .line 55
    const-string p1, ""

    .line 56
    .line 57
    :cond_2
    check-cast v1, Lcom/zykj/mistake/activity/MainActivity;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/zykj/mistake/activity/MainActivity;->c()V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/m1;

    .line 69
    .line 70
    invoke-direct {v1, p1}, Lcom/zykj/mistake/feature/notebook/detail/m1;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_1
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0xc9
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
