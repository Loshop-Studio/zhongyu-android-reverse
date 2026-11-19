.class public final Lcom/zykj/lib/ota/DownloadProgressDialog;
.super Lcom/zykj/lib/ota/Hilt_DownloadProgressDialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/lib/ota/Hilt_DownloadProgressDialog<",
        "Lcom/zykj/lib/ota/databinding/DialogDownloadBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/ota/Hilt_DownloadProgressDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/lib/ota/DownloadProgressDialog$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/lib/ota/DownloadProgressDialog$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/lib/ota/DownloadProgressDialog;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final g()Lcom/zykj/lib/ota/DownloadProgressDialogArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/DownloadProgressDialog;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/lib/ota/DownloadProgressDialog;->g()Lcom/zykj/lib/ota/DownloadProgressDialogArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->b()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    xor-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/fragment/app/DialogFragment;->setCancelable(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/lib/ota/DownloadProgressDialog;->g()Lcom/zykj/lib/ota/DownloadProgressDialogArgs;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->a()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/lib/ota/R$layout;->dialog_download:I

    .line 2
    .line 3
    return v0
.end method
