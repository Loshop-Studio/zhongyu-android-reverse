.class final Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


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
        "Lhd/l;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/policy/ui/PolicyDialogFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$4;->c:Lcom/zykj/policy/ui/PolicyDialogFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$4;->invoke(Landroid/view/View;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object p1, Lcom/zykj/policy/ext/PolicyHelper;->a:Lcom/zykj/policy/ext/PolicyHelper$a;

    iget-object v0, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$4;->c:Lcom/zykj/policy/ui/PolicyDialogFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/zykj/policy/ext/PolicyHelper$a;->c(Landroid/content/Context;Z)V

    .line 3
    iget-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$4;->c:Lcom/zykj/policy/ui/PolicyDialogFragment;

    invoke-virtual {p1}, Lcom/zykj/policy/ui/PolicyDialogFragment;->q()Lhd/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$4;->c:Lcom/zykj/policy/ui/PolicyDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    return-void
.end method
