.class public final Lcom/friday/common/widget/dialog/WPSDownloadDialog;
.super Landroidx/fragment/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public d:Lcom/friday/common/databinding/DialogDownloadWpsBinding;

.field public final e:Ljava/lang/String;

.field public final f:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "https://ezy-upgrade.oss-cn-shanghai.aliyuncs.com/moffice_13.13.0_2052_cn00563_multidex_3a64542a409.apk"

    .line 5
    .line 6
    const-string v1, "utf-8"

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->e:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v0, Ll2/v;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ll2/v;-><init>(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->f:Lqc/d;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic o(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->t(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->u(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->v(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic r(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/databinding/DialogDownloadWpsBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->d:Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final t(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->e:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0}, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;-><init>(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method public static final u(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Ld7/e;->n()Ld7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ld7/e;->k(Ljava/lang/String;)Lcom/lzy/okgo/model/Progress;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->e:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1}, Lb7/a;->a(Ljava/lang/String;)Lcom/lzy/okgo/request/GetRequest;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lg7/a;->f(Ljava/lang/String;Lcom/lzy/okgo/request/base/Request;)Lh7/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    :goto_0
    invoke-virtual {p1, v0}, Lh7/b;->d(Ljava/lang/String;)Lh7/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v0, "WPS.apk"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lh7/b;->c(Ljava/lang/String;)Lh7/b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lh7/b;->n()Lh7/b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->s()Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, Lh7/b;->l(Lh7/a;)Lh7/b;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Lh7/b;->o()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    iget-object v0, p1, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget v0, p1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 78
    .line 79
    const/4 v1, 0x5

    .line 80
    if-ne v0, v1, :cond_2

    .line 81
    .line 82
    iget-object p1, p1, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p1}, Lcom/blankj/utilcode/util/AppUtils;->installApp(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    invoke-static {p1}, Lg7/a;->g(Lcom/lzy/okgo/model/Progress;)Lh7/b;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->s()Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p1, p0}, Lh7/b;->l(Lh7/a;)Lh7/b;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Lh7/b;->o()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    invoke-static {p1}, Lg7/a;->g(Lcom/lzy/okgo/model/Progress;)Lh7/b;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->s()Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p1, p0}, Lh7/b;->l(Lh7/a;)Lh7/b;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Lh7/b;->m()V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public static final v(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->d:Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const-string v1, "dataBinding"

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iget-object p1, p1, Lcom/friday/common/databinding/DialogDownloadWpsBinding;->c:Landroidx/cardview/widget/CardView;

    .line 16
    .line 17
    const-string v2, "cvGotIt"

    .line 18
    .line 19
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Ll2/t;

    .line 23
    .line 24
    invoke-direct {v2, p0}, Ll2/t;-><init>(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)V

    .line 25
    .line 26
    .line 27
    const-wide/16 v3, 0x1f4

    .line 28
    .line 29
    invoke-static {p1, v3, v4, v2}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->d:Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, p1

    .line 41
    :goto_0
    iget-object p1, v0, Lcom/friday/common/databinding/DialogDownloadWpsBinding;->d:Landroid/widget/TextView;

    .line 42
    .line 43
    new-instance v0, Ll2/u;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Ll2/u;-><init>(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    sget v0, Lcom/friday/common/R$style;->airPlayDialog:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/DialogFragment;->setStyle(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget p3, Lcom/friday/common/R$layout;->dialog_download_wps:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "inflate(...)"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast p1, Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->d:Lcom/friday/common/databinding/DialogDownloadWpsBinding;

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const-string p1, "dataBinding"

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    :cond_0
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string p2, "getRoot(...)"

    .line 35
    .line 36
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ld7/e;->n()Ld7/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->e:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ld7/e;->k(Ljava/lang/String;)Lcom/lzy/okgo/model/Progress;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Lg7/a;->g(Lcom/lzy/okgo/model/Progress;)Lh7/b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lh7/b;->e()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lh7/b;->p(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sget v2, Lcom/friday/common/R$dimen;->view_189:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    float-to-int v1, v1

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget v3, Lcom/friday/common/R$dimen;->view_123:I

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    float-to-int v2, v2

    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final s()Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->f:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/widget/dialog/WPSDownloadDialog$a;

    .line 8
    .line 9
    return-object v0
.end method

.method public show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "manager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
