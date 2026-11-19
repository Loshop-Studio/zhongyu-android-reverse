.class public final synthetic Lcom/zykj/study/ui/home/find/search/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/find/search/b;->a:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/search/b;->a:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;->c(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Ljava/util/List;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
