.class public final synthetic Ln6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/e;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln6/e;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->j(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
