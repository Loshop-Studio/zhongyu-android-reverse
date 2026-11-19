.class public final Lcom/zykj/mistake/dialog/ImageDialogFragment;
.super Lcom/zykj/mistake/dialog/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/dialog/BaseDialogFragment<",
        "Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/mistake/dialog/ImageDialogFragment;",
        "Lcom/zykj/mistake/dialog/BaseDialogFragment;",
        "Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nImageDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDialogFragment.kt\ncom/zykj/mistake/dialog/ImageDialogFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,55:1\n257#2,2:56\n*S KotlinDebug\n*F\n+ 1 ImageDialogFragment.kt\ncom/zykj/mistake/dialog/ImageDialogFragment\n*L\n33#1:56,2\n*E\n"
    }
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Lr6/a;


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
    sget v0, Lcom/zykj/mistake/R$color;->white:I

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
    sget v0, Lcom/zykj/mistake/R$layout;->dialog_fragment_image:I

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
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;->a:Landroid/widget/ImageView;

    .line 8
    .line 9
    new-instance v0, Ll4/g;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Ll4/g;-><init>(Lcom/zykj/mistake/dialog/ImageDialogFragment;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;->b:Landroid/widget/ImageView;

    .line 25
    .line 26
    const-string v0, "ivDelete"

    .line 27
    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/mistake/dialog/ImageDialogFragment;->d:Lr6/a;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/16 v0, 0x8

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;->b:Landroid/widget/ImageView;

    .line 49
    .line 50
    new-instance v0, Ll4/g;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v0, p0, v1}, Ll4/g;-><init>(Lcom/zykj/mistake/dialog/ImageDialogFragment;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/mistake/dialog/ImageDialogFragment;->c:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget v0, Lcom/zykj/mistake/R$mipmap;->pic_error:I

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lr0/a;->h(I)Lr0/a;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lcom/bumptech/glide/f;

    .line 78
    .line 79
    new-instance v0, Lr0/d;

    .line 80
    .line 81
    invoke-direct {v0}, Lr0/a;-><init>()V

    .line 82
    .line 83
    .line 84
    sget-object v1, Lb0/o;->b:Lb0/m;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lr0/d;

    .line 91
    .line 92
    invoke-virtual {v0}, Lr0/a;->r()Lr0/a;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;

    .line 105
    .line 106
    iget-object v0, v0, Lcom/zykj/mistake/databinding/DialogFragmentImageBinding;->c:Landroid/widget/ImageView;

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 109
    .line 110
    .line 111
    :cond_1
    return-void
.end method

.method public final l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lr6/a;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/mistake/dialog/ImageDialogFragment;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/mistake/dialog/ImageDialogFragment;->d:Lr6/a;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string p2, "getSupportFragmentManager(...)"

    .line 15
    .line 16
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->k(Landroidx/fragment/app/FragmentManager;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
