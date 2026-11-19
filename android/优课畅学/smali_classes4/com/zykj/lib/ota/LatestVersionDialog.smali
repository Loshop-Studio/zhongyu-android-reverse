.class public final Lcom/zykj/lib/ota/LatestVersionDialog;
.super Lcom/zykj/lib/ota/Hilt_LatestVersionDialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/lib/ota/Hilt_LatestVersionDialog<",
        "Lcom/zykj/lib/ota/databinding/DialogLatestVersionBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/ota/Hilt_LatestVersionDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/lib/ota/LatestVersionDialogArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/lib/ota/LatestVersionDialog$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/lib/ota/LatestVersionDialog$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/lib/ota/LatestVersionDialog;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic g(Lcom/zykj/lib/ota/LatestVersionDialog;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/lib/ota/LatestVersionDialog;->i(Lcom/zykj/lib/ota/LatestVersionDialog;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lcom/zykj/lib/ota/LatestVersionDialog;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public final h()Lcom/zykj/lib/ota/LatestVersionDialogArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/LatestVersionDialog;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/ota/LatestVersionDialogArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/lib/ota/databinding/DialogLatestVersionBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/lib/ota/LatestVersionDialog;->h()Lcom/zykj/lib/ota/LatestVersionDialogArgs;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Lcom/zykj/lib/ota/LatestVersionDialogArgs;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p2}, Lcom/zykj/lib/ota/databinding/DialogLatestVersionBinding;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/zykj/lib/ota/databinding/DialogLatestVersionBinding;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/zykj/lib/ota/databinding/DialogLatestVersionBinding;->a:Landroid/widget/TextView;

    .line 25
    .line 26
    const-string p2, "tvKnow"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance p2, Ls3/f;

    .line 32
    .line 33
    invoke-direct {p2, p0}, Ls3/f;-><init>(Lcom/zykj/lib/ota/LatestVersionDialog;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 40
    .line 41
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/lib/ota/R$layout;->dialog_latest_version:I

    .line 2
    .line 3
    return v0
.end method
