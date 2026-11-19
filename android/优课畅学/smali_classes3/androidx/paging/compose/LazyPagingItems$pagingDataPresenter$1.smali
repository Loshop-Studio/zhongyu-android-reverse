.class public final Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;
.super Landroidx/paging/PagingDataPresenter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/compose/LazyPagingItems;-><init>(Ll8/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataPresenter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/paging/compose/LazyPagingItems;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/compose/LazyPagingItems<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/compose/LazyPagingItems;Lkotlin/coroutines/d;Landroidx/paging/PagingData;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/compose/LazyPagingItems<",
            "TT;>;",
            "Lkotlin/coroutines/d;",
            "Landroidx/paging/PagingData<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;->this$0:Landroidx/paging/compose/LazyPagingItems;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Landroidx/paging/PagingDataPresenter;-><init>(Lkotlin/coroutines/d;Landroidx/paging/PagingData;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public presentPagingDataEvent(Landroidx/paging/PagingDataEvent;Lm7/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingDataEvent<",
            "TT;>;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;->this$0:Landroidx/paging/compose/LazyPagingItems;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/paging/compose/LazyPagingItems;->access$updateItemSnapshotList(Landroidx/paging/compose/LazyPagingItems;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p1
.end method
