.class final Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/policy/ext/PolicyHelper$Builder;-><init>(Landroid/content/Context;)V
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
.field public final synthetic c:Lcom/zykj/policy/ext/PolicyHelper$Builder;


# direct methods
.method public constructor <init>(Lcom/zykj/policy/ext/PolicyHelper$Builder;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;->c:Lcom/zykj/policy/ext/PolicyHelper$Builder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/policy/ui/PolicyDialogFragment;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/policy/ui/PolicyDialogFragment;->g:Lcom/zykj/policy/ui/PolicyDialogFragment$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;->c:Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->a(Lcom/zykj/policy/ext/PolicyHelper$Builder;)Lfb/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/policy/ui/PolicyDialogFragment$a;->a(Lfb/a;)Lcom/zykj/policy/ui/PolicyDialogFragment;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;->a()Lcom/zykj/policy/ui/PolicyDialogFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
