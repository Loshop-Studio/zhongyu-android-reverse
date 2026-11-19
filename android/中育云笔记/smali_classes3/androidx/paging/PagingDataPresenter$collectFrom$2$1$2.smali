.class final Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PagingDataPresenter$collectFrom$2$1;->emit(Landroidx/paging/PageEvent;Lvc/c;)Ljava/lang/Object;
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
    c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2"
    f = "PagingDataPresenter.kt"
    l = {
        0x89,
        0x99,
        0xa5,
        0xa8,
        0xdf,
        0xe2
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $event:Landroidx/paging/PageEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageEvent<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $pagingData:Landroidx/paging/PagingData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Landroidx/paging/PagingDataPresenter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingDataPresenter<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/PageEvent;Landroidx/paging/PagingDataPresenter;Landroidx/paging/PagingData;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent<",
            "TT;>;",
            "Landroidx/paging/PagingDataPresenter<",
            "TT;>;",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$pagingData:Landroidx/paging/PagingData;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3
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
    new-instance p1, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$pagingData:Landroidx/paging/PagingData;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;-><init>(Landroidx/paging/PageEvent;Landroidx/paging/PagingDataPresenter;Landroidx/paging/PagingData;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

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
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_b

    :pswitch_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_9

    :pswitch_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_3

    :pswitch_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_2

    :pswitch_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_c

    :pswitch_5
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    instance-of v1, p1, Landroidx/paging/PageEvent$StaticList;

    if-eqz v1, :cond_2

    .line 3
    iget-object v4, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 4
    new-instance p1, Landroidx/paging/TransformablePage;

    iget-object v1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v1, Landroidx/paging/PageEvent$StaticList;

    invoke-virtual {v1}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v3, v1}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 5
    invoke-static {p1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 6
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getPlaceholdersBefore()I

    move-result v6

    .line 7
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getPlaceholdersAfter()I

    move-result v7

    .line 8
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getSourceLoadStates()Landroidx/paging/LoadStates;

    move-result-object p1

    if-nez p1, :cond_1

    .line 9
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v8, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v8, v2

    .line 10
    :goto_1
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getSourceLoadStates()Landroidx/paging/LoadStates;

    move-result-object v9

    .line 11
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    move-result-object v10

    .line 12
    iget-object p1, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$pagingData:Landroidx/paging/PagingData;

    invoke-virtual {p1}, Landroidx/paging/PagingData;->getHintReceiver$paging_common()Landroidx/paging/HintReceiver;

    move-result-object v11

    .line 13
    iput v2, p0, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    move-object v12, p0

    invoke-static/range {v4 .. v12}, Landroidx/paging/PagingDataPresenter;->access$presentNewList(Landroidx/paging/PagingDataPresenter;Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, v12

    if-ne p1, v0, :cond_16

    goto/16 :goto_a

    :cond_2
    move-object v9, p0

    .line 14
    instance-of v1, p1, Landroidx/paging/PageEvent$Insert;

    if-eqz v1, :cond_3

    check-cast p1, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object p1

    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    if-ne p1, v1, :cond_3

    .line 15
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    .line 16
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v2

    .line 17
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    move-result v3

    .line 18
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    move-result v4

    .line 19
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    move-result-object v6

    .line 20
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast p1, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    move-result-object v7

    .line 21
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$pagingData:Landroidx/paging/PagingData;

    invoke-virtual {p1}, Landroidx/paging/PagingData;->getHintReceiver$paging_common()Landroidx/paging/HintReceiver;

    move-result-object v8

    const/4 p1, 0x2

    .line 22
    iput p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    const/4 v5, 0x1

    invoke-static/range {v1 .. v9}, Landroidx/paging/PagingDataPresenter;->access$presentNewList(Landroidx/paging/PagingDataPresenter;Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_16

    goto/16 :goto_a

    .line 23
    :cond_3
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    instance-of v1, p1, Landroidx/paging/PageEvent$Insert;

    if-eqz v1, :cond_12

    .line 24
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getInGetItem$p(Landroidx/paging/PagingDataPresenter;)Lvd/l;

    move-result-object p1

    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x3

    .line 25
    iput p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    invoke-static {p0}, Lsd/p2;->a(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto/16 :goto_a

    .line 26
    :cond_4
    :goto_2
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    move-result-object v1

    iget-object v4, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    invoke-virtual {v1, v4}, Landroidx/paging/PageStore;->processEvent(Landroidx/paging/PageEvent;)Landroidx/paging/PagingDataEvent;

    move-result-object v1

    const/4 v4, 0x4

    iput v4, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    invoke-virtual {p1, v1, p0}, Landroidx/paging/PagingDataPresenter;->presentPagingDataEvent(Landroidx/paging/PagingDataEvent;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_a

    .line 27
    :cond_5
    :goto_3
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;

    move-result-object p1

    .line 28
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v0, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {v0}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    move-result-object v0

    .line 29
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v1, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    move-result-object v1

    .line 30
    invoke-virtual {p1, v0, v1}, Landroidx/paging/MutableCombinedLoadStateCollection;->set(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 31
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/paging/MutableCombinedLoadStateCollection;->getStateFlow()Lvd/u;

    move-result-object p1

    invoke-interface {p1}, Lvd/u;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    move-result-object p1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_11

    .line 32
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    move-result v0

    .line 33
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    move-result p1

    .line 34
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v1, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v1

    sget-object v4, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    if-ne v1, v4, :cond_7

    if-nez v0, :cond_8

    .line 35
    :cond_7
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v0, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {v0}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v0

    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    if-ne v0, v1, :cond_9

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    move p1, v3

    goto :goto_6

    :cond_9
    :goto_5
    move p1, v2

    .line 36
    :goto_6
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v0, Landroidx/paging/PageEvent$Insert;

    invoke-virtual {v0}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 37
    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_a

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_7

    .line 38
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/paging/TransformablePage;

    .line 39
    invoke-virtual {v1}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    move v2, v3

    :cond_c
    :goto_7
    if-nez p1, :cond_d

    .line 40
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1, v3}, Landroidx/paging/PagingDataPresenter;->access$setLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;Z)V

    goto/16 :goto_c

    .line 41
    :cond_d
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;)Z

    move-result p1

    if-nez p1, :cond_e

    if-eqz v2, :cond_16

    :cond_e
    if-nez v2, :cond_10

    .line 42
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getLastAccessedIndex$p(Landroidx/paging/PagingDataPresenter;)I

    move-result p1

    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {v0}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    move-result v0

    if-lt p1, v0, :cond_10

    .line 43
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getLastAccessedIndex$p(Landroidx/paging/PagingDataPresenter;)I

    move-result p1

    .line 44
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {v0}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    move-result v0

    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {v1}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/paging/PageStore;->getDataCount()I

    move-result v1

    add-int/2addr v0, v1

    if-le p1, v0, :cond_f

    goto :goto_8

    .line 45
    :cond_f
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1, v3}, Landroidx/paging/PagingDataPresenter;->access$setLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;Z)V

    goto/16 :goto_c

    .line 46
    :cond_10
    :goto_8
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getHintReceiver$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/HintReceiver;

    move-result-object p1

    if-eqz p1, :cond_16

    .line 47
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {v0}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    move-result-object v0

    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {v1}, Landroidx/paging/PagingDataPresenter;->access$getLastAccessedIndex$p(Landroidx/paging/PagingDataPresenter;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/paging/PageStore;->createAccessHintForIndex(I)Landroidx/paging/ViewportHint$Access;

    move-result-object v0

    .line 48
    invoke-interface {p1, v0}, Landroidx/paging/HintReceiver;->processHint(Landroidx/paging/ViewportHint;)V

    goto/16 :goto_c

    .line 49
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 50
    :cond_12
    instance-of v1, p1, Landroidx/paging/PageEvent$Drop;

    if-eqz v1, :cond_15

    .line 51
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getInGetItem$p(Landroidx/paging/PagingDataPresenter;)Lvd/l;

    move-result-object p1

    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_13

    const/4 p1, 0x5

    .line 52
    iput p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    invoke-static {p0}, Lsd/p2;->a(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    goto :goto_a

    .line 53
    :cond_13
    :goto_9
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;

    move-result-object v1

    iget-object v2, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    invoke-virtual {v1, v2}, Landroidx/paging/PageStore;->processEvent(Landroidx/paging/PageEvent;)Landroidx/paging/PagingDataEvent;

    move-result-object v1

    const/4 v2, 0x6

    iput v2, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->label:I

    invoke-virtual {p1, v1, p0}, Landroidx/paging/PagingDataPresenter;->presentPagingDataEvent(Landroidx/paging/PagingDataEvent;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_14

    :goto_a
    return-object v0

    .line 54
    :cond_14
    :goto_b
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;

    move-result-object p1

    .line 55
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v0, Landroidx/paging/PageEvent$Drop;

    invoke-virtual {v0}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v0

    .line 56
    sget-object v1, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    invoke-virtual {v1}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    move-result-object v1

    .line 57
    invoke-virtual {p1, v0, v3, v1}, Landroidx/paging/MutableCombinedLoadStateCollection;->set(Landroidx/paging/LoadType;ZLandroidx/paging/LoadState;)V

    .line 58
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1, v3}, Landroidx/paging/PagingDataPresenter;->access$setLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;Z)V

    goto :goto_c

    .line 59
    :cond_15
    instance-of p1, p1, Landroidx/paging/PageEvent$LoadStateUpdate;

    if-eqz p1, :cond_16

    .line 60
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;

    move-result-object p1

    .line 61
    iget-object v0, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v0, Landroidx/paging/PageEvent$LoadStateUpdate;

    invoke-virtual {v0}, Landroidx/paging/PageEvent$LoadStateUpdate;->getSource()Landroidx/paging/LoadStates;

    move-result-object v0

    .line 62
    iget-object v1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    check-cast v1, Landroidx/paging/PageEvent$LoadStateUpdate;

    invoke-virtual {v1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    move-result-object v1

    .line 63
    invoke-virtual {p1, v0, v1}, Landroidx/paging/MutableCombinedLoadStateCollection;->set(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 64
    :cond_16
    :goto_c
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->$event:Landroidx/paging/PageEvent;

    instance-of v0, p1, Landroidx/paging/PageEvent$Insert;

    if-nez v0, :cond_17

    instance-of v0, p1, Landroidx/paging/PageEvent$Drop;

    if-nez v0, :cond_17

    instance-of p1, p1, Landroidx/paging/PageEvent$StaticList;

    if-eqz p1, :cond_18

    .line 65
    :cond_17
    iget-object p1, v9, Landroidx/paging/PagingDataPresenter$collectFrom$2$1$2;->this$0:Landroidx/paging/PagingDataPresenter;

    invoke-static {p1}, Landroidx/paging/PagingDataPresenter;->access$getOnPagesUpdatedListeners$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/internal/CopyOnWriteArrayList;

    move-result-object p1

    .line 66
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhd/a;

    .line 67
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    goto :goto_d

    .line 68
    :cond_18
    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
