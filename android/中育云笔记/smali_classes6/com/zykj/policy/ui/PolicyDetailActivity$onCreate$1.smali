.class final Lcom/zykj/policy/ui/PolicyDetailActivity$onCreate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/policy/ui/PolicyDetailActivity;->onCreate(Landroid/os/Bundle;)V
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
.field public final synthetic c:Lcom/zykj/policy/ui/PolicyDetailActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/policy/ui/PolicyDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/policy/ui/PolicyDetailActivity$onCreate$1;->c:Lcom/zykj/policy/ui/PolicyDetailActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/zykj/policy/ui/PolicyDetailActivity$onCreate$1;->invoke(Landroid/view/View;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/policy/ui/PolicyDetailActivity$onCreate$1;->c:Lcom/zykj/policy/ui/PolicyDetailActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
