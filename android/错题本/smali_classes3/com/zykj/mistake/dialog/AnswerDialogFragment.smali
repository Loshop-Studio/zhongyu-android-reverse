.class public final Lcom/zykj/mistake/dialog/AnswerDialogFragment;
.super Lcom/zykj/mistake/dialog/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/dialog/BaseDialogFragment<",
        "Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/mistake/dialog/AnswerDialogFragment;",
        "Lcom/zykj/mistake/dialog/BaseDialogFragment;",
        "Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$color;->app_black:I

    .line 2
    .line 3
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->dialog_fragment_answer:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    return v0
.end method

.method public final j(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;->a:Landroid/widget/ImageView;

    .line 8
    .line 9
    const-string v0, "close"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroidx/navigation/b;

    .line 15
    .line 16
    const/16 v1, 0x11

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lcom/zykj/mistake/utils/e;->e(Landroid/view/View;Lr6/a;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->c:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    sget-object v1, Lb0/o;->b:Lb0/m;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v2, p0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->c:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v2, Lr0/d;

    .line 49
    .line 50
    invoke-direct {v2}, Lr0/a;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lr0/d;

    .line 58
    .line 59
    invoke-virtual {v2}, Lr0/a;->r()Lr0/a;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v2, Ll4/a;

    .line 68
    .line 69
    invoke-direct {v2, p0}, Ll4/a;-><init>(Lcom/zykj/mistake/dialog/AnswerDialogFragment;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2}, Lcom/bumptech/glide/f;->z(Ls0/i;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;->c:Lcom/zykj/mistake/widget/IntrinsicWidthImageView;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    iget-object p1, p0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->d:Ljava/lang/String;

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_2

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object v0, p0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->d:Ljava/lang/String;

    .line 107
    .line 108
    iput-object v0, p1, Lcom/bumptech/glide/f;->w:Ljava/lang/Object;

    .line 109
    .line 110
    const/4 v0, 0x1

    .line 111
    iput-boolean v0, p1, Lcom/bumptech/glide/f;->y:Z

    .line 112
    .line 113
    new-instance v0, Lr0/d;

    .line 114
    .line 115
    invoke-direct {v0}, Lr0/a;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lr0/d;

    .line 123
    .line 124
    invoke-virtual {v0}, Lr0/a;->r()Lr0/a;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    new-instance v0, Ll4/b;

    .line 133
    .line 134
    invoke-direct {v0, p0}, Ll4/b;-><init>(Lcom/zykj/mistake/dialog/AnswerDialogFragment;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->z(Ls0/i;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;

    .line 146
    .line 147
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;->b:Lcom/zykj/mistake/widget/IntrinsicWidthImageView;

    .line 148
    .line 149
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->c:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->d:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p4, p0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->e:Z

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "getSupportFragmentManager(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->k(Landroidx/fragment/app/FragmentManager;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
