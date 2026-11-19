.class public final Lcom/zykj/study/dialog/ShowBigImageDialog;
.super Lcom/zykj/study/dialog/Hilt_ShowBigImageDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/dialog/Hilt_ShowBigImageDialog<",
        "Lcom/zykj/study/databinding/DialogShowBigImageBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/dialog/Hilt_ShowBigImageDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/dialog/ShowBigImageDialogArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/dialog/ShowBigImageDialog$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/dialog/ShowBigImageDialog$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/dialog/ShowBigImageDialog;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final g()Lcom/zykj/study/dialog/ShowBigImageDialogArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/ShowBigImageDialog;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/dialog/ShowBigImageDialogArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ShowBigImageDialog;->g()Lcom/zykj/study/dialog/ShowBigImageDialogArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/dialog/ShowBigImageDialogArgs;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 p2, 0x2

    .line 10
    const/4 v0, 0x0

    .line 11
    const-string v1, "http"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p1, v1, v2, p2, v0}, Lg8/z;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ShowBigImageDialog;->g()Lcom/zykj/study/dialog/ShowBigImageDialogArgs;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2}, Lcom/zykj/study/dialog/ShowBigImageDialogArgs;->a()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->u(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Lcom/zykj/study/databinding/DialogShowBigImageBinding;

    .line 45
    .line 46
    iget-object p2, p2, Lcom/zykj/study/databinding/DialogShowBigImageBinding;->ivShow:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Le0/j;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance p1, Ljava/io/File;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ShowBigImageDialog;->g()Lcom/zykj/study/dialog/ShowBigImageDialogArgs;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2}, Lcom/zykj/study/dialog/ShowBigImageDialogArgs;->a()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {p2}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/h;->s(Ljava/io/File;)Lcom/bumptech/glide/g;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    new-instance v0, Lg0/b;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 90
    .line 91
    .line 92
    move-result-wide v1

    .line 93
    invoke-static {v1, v2}, Lo7/a;->d(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {v0, p1}, Lg0/b;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v0}, Ld0/a;->d0(Ll/b;)Ld0/a;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lcom/bumptech/glide/g;

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Lcom/zykj/study/databinding/DialogShowBigImageBinding;

    .line 111
    .line 112
    iget-object p2, p2, Lcom/zykj/study/databinding/DialogShowBigImageBinding;->ivShow:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Le0/j;

    .line 115
    .line 116
    .line 117
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Lcom/zykj/study/databinding/DialogShowBigImageBinding;

    .line 122
    .line 123
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogShowBigImageBinding;->ivShow:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;

    .line 124
    .line 125
    new-instance p2, Lcom/zykj/study/dialog/ShowBigImageDialog$a;

    .line 126
    .line 127
    invoke-direct {p2, p0}, Lcom/zykj/study/dialog/ShowBigImageDialog$a;-><init>(Lcom/zykj/study/dialog/ShowBigImageDialog;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnPhotoTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/c$f;)V

    .line 131
    .line 132
    .line 133
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 134
    .line 135
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->dialog_show_big_image:I

    .line 2
    .line 3
    return v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, -0x1

    .line 41
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 42
    .line 43
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method
