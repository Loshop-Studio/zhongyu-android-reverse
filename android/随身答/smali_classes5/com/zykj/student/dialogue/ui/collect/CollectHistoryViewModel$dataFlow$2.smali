.class final Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;-><init>(Lk6/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/paging/PagingData<",
        "Lcom/zykj/student/dialogue/bean/resp/CollectSession;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/student/dialogue/ui/collect/b;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Landroidx/paging/PagingData<",
        "Lcom/zykj/student/dialogue/bean/resp/CollectSession;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroidx/paging/PagingData;",
        "Lcom/zykj/student/dialogue/bean/resp/CollectSession;",
        "pagingData",
        "",
        "Lcom/zykj/student/dialogue/ui/collect/b;",
        "modifications",
        "<anonymous>",
        "(Landroidx/paging/PagingData;Ljava/util/List;)Landroidx/paging/PagingData;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$dataFlow$2"
    f = "CollectHistoryViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCollectHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectHistoryViewModel.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1803#2,3:133\n*S KotlinDebug\n*F\n+ 1 CollectHistoryViewModel.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2\n*L\n74#1:133,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->d:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/paging/PagingData;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->d:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;

    invoke-direct {v0, v1, p3}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;-><init>(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->c:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/paging/PagingData;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->a(Landroidx/paging/PagingData;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/paging/PagingData;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->a:I

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel$dataFlow$2;->d:Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lcom/zykj/student/dialogue/ui/collect/b;

    .line 36
    .line 37
    invoke-static {p1, v0, v2}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;->m(Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;Landroidx/paging/PagingData;Lcom/zykj/student/dialogue/ui/collect/b;)Landroidx/paging/PagingData;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-object v0

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method
