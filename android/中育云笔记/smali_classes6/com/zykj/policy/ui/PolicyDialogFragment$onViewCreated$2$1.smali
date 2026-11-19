.class final Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/policy/ui/PolicyDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/policy/ui/PolicyDialogFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$1;->c:Lcom/zykj/policy/ui/PolicyDialogFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    sget-object v0, Lcom/zykj/policy/ui/PolicyDetailActivity;->e:Lcom/zykj/policy/ui/PolicyDetailActivity$a;

    .line 3
    iget-object v1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$1;->c:Lcom/zykj/policy/ui/PolicyDialogFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v2, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$1;->c:Lcom/zykj/policy/ui/PolicyDialogFragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "USER_AGREEMENT_URL"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    const-string v2, ""

    .line 5
    :cond_1
    invoke-virtual {v0, v1, v2}, Lcom/zykj/policy/ui/PolicyDetailActivity$a;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
