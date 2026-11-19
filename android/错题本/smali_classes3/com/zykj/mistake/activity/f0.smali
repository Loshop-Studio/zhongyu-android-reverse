.class public final synthetic Lcom/zykj/mistake/activity/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/SketchPlayerActivity;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/SketchPlayerActivity;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/f0;->a:Lcom/zykj/mistake/activity/SketchPlayerActivity;

    iput-object p2, p0, Lcom/zykj/mistake/activity/f0;->b:Ljava/lang/String;

    iput p3, p0, Lcom/zykj/mistake/activity/f0;->c:I

    iput p4, p0, Lcom/zykj/mistake/activity/f0;->d:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    sget v0, Lcom/zykj/mistake/activity/SketchPlayerActivity;->g:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/f0;->a:Lcom/zykj/mistake/activity/SketchPlayerActivity;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcom/zykj/mistake/activity/SketchPlayerActivity;->e:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const/16 v7, 0x1e

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    iget-object v2, p0, Lcom/zykj/mistake/activity/f0;->b:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-static/range {v1 .. v8}, Lcom/zykj/view/board/play/SketchPlayFragment;->play$default(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;IZLr6/c;Lr6/c;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget v1, p0, Lcom/zykj/mistake/activity/f0;->c:I

    .line 25
    .line 26
    const/4 v2, -0x1

    .line 27
    if-eq v1, v2, :cond_0

    .line 28
    .line 29
    iget v3, p0, Lcom/zykj/mistake/activity/f0;->d:I

    .line 30
    .line 31
    if-eq v3, v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/zykj/mistake/presenter/SketchPlayerPresenter;

    .line 38
    .line 39
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2, v1, v3}, Lcom/zykj/mistake/network/b;->c(II)Lq5/e;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Lb5/i;

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    invoke-direct {v2, v0, v3}, Lb5/i;-><init>(Lcom/zykj/mistake/base/BasePresenter;I)V

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 55
    .line 56
    .line 57
    :cond_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    const-string v0, "mSketchPlayFragment"

    .line 61
    .line 62
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    throw v0
.end method
