.class public final synthetic Lz4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/i;->a:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz4/i;->a:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->h(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V

    return-void
.end method
