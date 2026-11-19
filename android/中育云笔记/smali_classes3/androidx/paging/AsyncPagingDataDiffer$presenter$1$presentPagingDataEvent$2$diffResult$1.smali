.class final Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/AsyncPagingDataDiffer$presenter$1;->presentPagingDataEvent(Landroidx/paging/PagingDataEvent;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1"
    f = "AsyncPagingDataDiffer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $this_apply:Landroidx/paging/PagingDataEvent$Refresh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingDataEvent$Refresh<",
            "TT;>;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Landroidx/paging/AsyncPagingDataDiffer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/AsyncPagingDataDiffer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/PagingDataEvent$Refresh;Landroidx/paging/AsyncPagingDataDiffer;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingDataEvent$Refresh<",
            "TT;>;",
            "Landroidx/paging/AsyncPagingDataDiffer<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->$this_apply:Landroidx/paging/PagingDataEvent$Refresh;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->this$0:Landroidx/paging/AsyncPagingDataDiffer;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->$this_apply:Landroidx/paging/PagingDataEvent$Refresh;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->this$0:Landroidx/paging/AsyncPagingDataDiffer;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;-><init>(Landroidx/paging/PagingDataEvent$Refresh;Landroidx/paging/AsyncPagingDataDiffer;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PlaceholderPaddedDiffResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->$this_apply:Landroidx/paging/PagingDataEvent$Refresh;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/paging/PagingDataEvent$Refresh;->getPreviousList()Landroidx/paging/PlaceholderPaddedList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->$this_apply:Landroidx/paging/PagingDataEvent$Refresh;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/paging/PagingDataEvent$Refresh;->getNewList()Landroidx/paging/PlaceholderPaddedList;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Landroidx/paging/AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1;->this$0:Landroidx/paging/AsyncPagingDataDiffer;

    .line 24
    .line 25
    invoke-static {v1}, Landroidx/paging/AsyncPagingDataDiffer;->access$getDiffCallback$p(Landroidx/paging/AsyncPagingDataDiffer;)Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {p1, v0, v1}, Landroidx/paging/PlaceholderPaddedListDiffHelperKt;->computeDiff(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)Landroidx/paging/PlaceholderPaddedDiffResult;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
