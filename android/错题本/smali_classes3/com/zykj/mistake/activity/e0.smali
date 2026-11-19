.class public final synthetic Lcom/zykj/mistake/activity/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/SketchActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/SketchActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/e0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/e0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget p2, p0, Lcom/zykj/mistake/activity/e0;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/e0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p2, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 9
    .line 10
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-boolean p1, v0, Lcom/zykj/mistake/activity/SketchActivity;->q:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/zykj/mistake/presenter/SketchPresenter;

    .line 26
    .line 27
    iget-object p2, v0, Lcom/zykj/mistake/activity/SketchActivity;->o:Lcom/zykj/mistake/entity/req/SetNoteReq;

    .line 28
    .line 29
    const-string v0, "req"

    .line 30
    .line 31
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0, p2}, Lcom/zykj/mistake/network/b;->a(Lcom/zykj/mistake/entity/req/SetNoteReq;)Lq5/e;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    new-instance v0, Lb5/i;

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-direct {v0, p1, v1}, Lb5/i;-><init>(Lcom/zykj/mistake/base/BasePresenter;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2, v0}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object p1, v0, Lcom/zykj/mistake/activity/SketchActivity;->p:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    new-instance p2, Landroidx/lifecycle/k;

    .line 57
    .line 58
    const/16 v1, 0xc

    .line 59
    .line 60
    invoke-direct {p2, v1}, Landroidx/lifecycle/k;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1, p2}, Lcom/zykj/mistake/activity/SketchActivity;->w(Ljava/lang/String;Lr6/a;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-void

    .line 67
    :cond_1
    const-string p1, "mUploadDataPath"

    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    throw p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
