.class public final synthetic Ln6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/c;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln6/c;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, p1, p2}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->h(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
