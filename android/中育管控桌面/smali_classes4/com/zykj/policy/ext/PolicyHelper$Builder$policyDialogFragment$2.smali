.class final Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/zykj/policy/ui/PolicyDialogFragment;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/zykj/policy/ui/PolicyDialogFragment;",
        "a",
        "()Lcom/zykj/policy/ui/PolicyDialogFragment;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/policy/ext/PolicyHelper$Builder;


# direct methods
.method public constructor <init>(Lcom/zykj/policy/ext/PolicyHelper$Builder;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;->a:Lcom/zykj/policy/ext/PolicyHelper$Builder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/policy/ui/PolicyDialogFragment;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/policy/ui/PolicyDialogFragment;->d:Lcom/zykj/policy/ui/PolicyDialogFragment$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/policy/ext/PolicyHelper$Builder$policyDialogFragment$2;->a:Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->a(Lcom/zykj/policy/ext/PolicyHelper$Builder;)Ln4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/policy/ui/PolicyDialogFragment$a;->a(Ln4/a;)Lcom/zykj/policy/ui/PolicyDialogFragment;

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
