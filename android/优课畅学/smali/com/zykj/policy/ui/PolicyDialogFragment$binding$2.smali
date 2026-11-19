.class final Lcom/zykj/policy/ui/PolicyDialogFragment$binding$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/policy/ui/PolicyDialogFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/policy/ui/PolicyDialogFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$binding$2;->a:Lcom/zykj/policy/ui/PolicyDialogFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/policy/ui/PolicyDialogFragment$binding$2;->a:Lcom/zykj/policy/ui/PolicyDialogFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->c(Landroid/view/LayoutInflater;)Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment$binding$2;->a()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
