.class public final synthetic Lcom/zykj/mistake/activity/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/SketchPlayerActivity;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/SketchPlayerActivity;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/g0;->a:Lcom/zykj/mistake/activity/SketchPlayerActivity;

    iput p2, p0, Lcom/zykj/mistake/activity/g0;->b:I

    iput p3, p0, Lcom/zykj/mistake/activity/g0;->c:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    sget v0, Lcom/zykj/mistake/activity/SketchPlayerActivity;->g:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/g0;->a:Lcom/zykj/mistake/activity/SketchPlayerActivity;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 6
    .line 7
    .line 8
    sget v1, Lcom/zykj/mistake/R$string;->tips_play_err:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getString(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/16 v3, 0x51

    .line 25
    .line 26
    const/16 v4, 0xdc

    .line 27
    .line 28
    invoke-virtual {v1, v3, v2, v4}, Landroid/widget/Toast;->setGravity(III)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 32
    .line 33
    .line 34
    iget v1, p0, Lcom/zykj/mistake/activity/g0;->b:I

    .line 35
    .line 36
    const/4 v3, -0x1

    .line 37
    if-eq v1, v3, :cond_0

    .line 38
    .line 39
    iget v4, p0, Lcom/zykj/mistake/activity/g0;->c:I

    .line 40
    .line 41
    if-eq v4, v3, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/zykj/mistake/presenter/SketchPlayerPresenter;

    .line 48
    .line 49
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v3, v1, v4}, Lcom/zykj/mistake/network/b;->c(II)Lq5/e;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v3, Lb5/i;

    .line 58
    .line 59
    const/4 v4, 0x1

    .line 60
    invoke-direct {v3, v0, v4}, Lb5/i;-><init>(Lcom/zykj/mistake/base/BasePresenter;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v3, v2}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 64
    .line 65
    .line 66
    :cond_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 67
    .line 68
    return-object v0
.end method
