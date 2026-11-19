.class final Lcom/zykj/policy/ui/PolicyCheckView$setData$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/policy/ui/PolicyCheckView;->setData(Lj4/a;)V
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
.field public final synthetic a:Lj4/a;

.field public final synthetic b:Lcom/zykj/policy/ui/PolicyCheckView;


# direct methods
.method public constructor <init>(Lj4/a;Lcom/zykj/policy/ui/PolicyCheckView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/policy/ui/PolicyCheckView$setData$1$1;->a:Lj4/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/policy/ui/PolicyCheckView$setData$1$1;->b:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyCheckView$setData$1$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/zykj/policy/ui/PolicyCheckView$setData$1$1;->a:Lj4/a;

    invoke-virtual {v0}, Lj4/a;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    sget-object v0, Lcom/zykj/policy/ui/PolicyDetailActivity;->c:Lcom/zykj/policy/ui/PolicyDetailActivity$a;

    .line 4
    iget-object v1, p0, Lcom/zykj/policy/ui/PolicyCheckView$setData$1$1;->b:Lcom/zykj/policy/ui/PolicyCheckView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v2, p0, Lcom/zykj/policy/ui/PolicyCheckView$setData$1$1;->a:Lj4/a;

    invoke-virtual {v2}, Lj4/a;->k()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/zykj/policy/ui/PolicyDetailActivity$a;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
