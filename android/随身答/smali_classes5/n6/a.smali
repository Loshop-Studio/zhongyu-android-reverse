.class public final synthetic Ln6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/a;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln6/a;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->k(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;

    move-result-object v0

    return-object v0
.end method
