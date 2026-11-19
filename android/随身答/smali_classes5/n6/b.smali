.class public final synthetic Ln6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/b;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln6/b;->a:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;

    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;->i(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;)V

    return-void
.end method
