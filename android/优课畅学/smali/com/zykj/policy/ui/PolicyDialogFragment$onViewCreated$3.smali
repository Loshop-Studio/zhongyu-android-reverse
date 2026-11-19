.class final Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


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
        "Lx7/l;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/policy/ui/PolicyDialogFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$3;->a:Lcom/zykj/policy/ui/PolicyDialogFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$3;->invoke(Landroid/view/View;)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$3;->a:Lcom/zykj/policy/ui/PolicyDialogFragment;

    invoke-virtual {p1}, Lcom/zykj/policy/ui/PolicyDialogFragment;->g()Lx7/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$3;->a:Lcom/zykj/policy/ui/PolicyDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    return-void
.end method
