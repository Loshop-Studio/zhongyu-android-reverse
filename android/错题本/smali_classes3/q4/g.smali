.class public final synthetic Lq4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/mistake/base/BaseFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/base/BaseFragment;Ljava/lang/String;ZLjava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, Lq4/g;->a:I

    iput-object p1, p0, Lq4/g;->e:Lcom/zykj/mistake/base/BaseFragment;

    iput-object p2, p0, Lq4/g;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lq4/g;->c:Z

    iput-object p4, p0, Lq4/g;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Lq4/g;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lq4/g;->e:Lcom/zykj/mistake/base/BaseFragment;

    .line 7
    .line 8
    check-cast p1, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;

    .line 9
    .line 10
    iget-boolean v0, p0, Lq4/g;->c:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lq4/g;->d:Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 22
    .line 23
    invoke-direct {v2}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v3, "requireActivity(...)"

    .line 31
    .line 32
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lq4/g;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, p1, v3, v1, v0}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    iget-object p1, p0, Lq4/g;->e:Lcom/zykj/mistake/base/BaseFragment;

    .line 42
    .line 43
    check-cast p1, Lcom/zykj/mistake/fragment/OriginalAnswerFragment;

    .line 44
    .line 45
    iget-boolean v0, p0, Lq4/g;->c:Z

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Lq4/g;->d:Ljava/lang/String;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    new-instance v2, Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 54
    .line 55
    invoke-direct {v2}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v3, "requireActivity(...)"

    .line 63
    .line 64
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v3, p0, Lq4/g;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v2, p1, v3, v1, v0}, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
