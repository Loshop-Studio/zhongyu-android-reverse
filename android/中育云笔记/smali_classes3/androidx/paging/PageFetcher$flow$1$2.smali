.class final Landroidx/paging/PageFetcher$flow$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PageFetcher$flow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/q;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.PageFetcher$flow$1$2"
    f = "PageFetcher.kt"
    l = {
        0x5a,
        0x6c,
        0x70,
        0xa2,
        0xa8,
        0xd3
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $remoteMediatorAccessor:Landroidx/paging/RemoteMediatorAccessor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/RemoteMediatorAccessor<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/paging/PageFetcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageFetcher<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/RemoteMediatorAccessor;Landroidx/paging/PageFetcher;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/RemoteMediatorAccessor<",
            "TKey;TValue;>;",
            "Landroidx/paging/PageFetcher<",
            "TKey;TValue;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageFetcher$flow$1$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PageFetcher$flow$1$2;->$remoteMediatorAccessor:Landroidx/paging/RemoteMediatorAccessor;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/paging/PageFetcher$GenerationInfo;Landroidx/paging/PageFetcher$LoadRequest;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcher$GenerationInfo<",
            "TKey;TValue;>;",
            "Landroidx/paging/PageFetcher$LoadRequest;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageFetcher$GenerationInfo<",
            "TKey;TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/PageFetcher$flow$1$2;

    iget-object v1, p0, Landroidx/paging/PageFetcher$flow$1$2;->$remoteMediatorAccessor:Landroidx/paging/RemoteMediatorAccessor;

    iget-object v2, p0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-direct {v0, v1, v2, p3}, Landroidx/paging/PageFetcher$flow$1$2;-><init>(Landroidx/paging/RemoteMediatorAccessor;Landroidx/paging/PageFetcher;Lvc/c;)V

    iput-object p1, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    sget-object p1, Lqc/q;->a:Lqc/q;

    invoke-virtual {v0, p1}, Landroidx/paging/PageFetcher$flow$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/paging/PageFetcher$GenerationInfo;

    check-cast p2, Landroidx/paging/PageFetcher$LoadRequest;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/paging/PageFetcher$flow$1$2;->invoke(Landroidx/paging/PageFetcher$GenerationInfo;Landroidx/paging/PageFetcher$LoadRequest;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->label:I

    const/4 v3, 0x0

    const-string v4, "Refresh key "

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/PageFetcher$GenerationInfo;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    return-object v1

    :pswitch_1
    iget-object v1, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$2:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    check-cast v2, Landroidx/paging/PagingSource;

    iget-object v8, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PageFetcher$GenerationInfo;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v10, v8

    move-object/from16 v8, p1

    goto/16 :goto_8

    :pswitch_2
    iget-object v1, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$3:Ljava/lang/Object;

    iget-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$2:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    check-cast v3, Landroidx/paging/PagingSource;

    iget-object v8, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PageFetcher$GenerationInfo;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v9, v3

    move-object/from16 v3, p1

    goto/16 :goto_6

    :pswitch_3
    iget-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$4:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v8, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$3:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v9, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$2:Ljava/lang/Object;

    check-cast v9, Landroidx/paging/PagingSource;

    iget-object v10, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    check-cast v10, Landroidx/paging/PageFetcher$LoadRequest;

    iget-object v11, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/PageFetcher$GenerationInfo;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v12, v8

    move-object v8, v2

    move-object v2, v12

    move-object v12, v10

    move-object v10, v11

    move-object/from16 v11, p1

    goto/16 :goto_2

    :pswitch_4
    iget-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    check-cast v2, Landroidx/paging/PageFetcher$LoadRequest;

    iget-object v8, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PageFetcher$GenerationInfo;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    :cond_0
    move-object v10, v2

    goto/16 :goto_1

    :pswitch_5
    iget-object v1, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    move-object v9, v1

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Landroidx/paging/PageFetcher$GenerationInfo;

    iget-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    check-cast v2, Landroidx/paging/PageFetcher$LoadRequest;

    .line 2
    instance-of v9, v2, Landroidx/paging/PageFetcher$LoadRequest$Refresh;

    if-eqz v9, :cond_16

    .line 3
    move-object v9, v2

    check-cast v9, Landroidx/paging/PageFetcher$LoadRequest$Refresh;

    invoke-virtual {v9}, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->getTriggerRemoteRefresh()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 4
    iget-object v9, v0, Landroidx/paging/PageFetcher$flow$1$2;->$remoteMediatorAccessor:Landroidx/paging/RemoteMediatorAccessor;

    if-eqz v9, :cond_1

    invoke-interface {v9}, Landroidx/paging/RemoteMediatorConnection;->allowRefresh()V

    :cond_1
    if-nez v8, :cond_3

    .line 5
    iget-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-static {v2}, Landroidx/paging/PageFetcher;->access$getInitialKey$p(Landroidx/paging/PageFetcher;)Ljava/lang/Object;

    move-result-object v2

    .line 6
    iget-object v3, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    iput-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    iput v6, v0, Landroidx/paging/PageFetcher$flow$1$2;->label:I

    invoke-static {v3, v7, v0}, Landroidx/paging/PageFetcher;->access$generateNewPagingSource(Landroidx/paging/PageFetcher;Landroidx/paging/PagingSource;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    goto/16 :goto_c

    :cond_2
    move-object v9, v2

    .line 7
    :goto_0
    move-object v10, v3

    check-cast v10, Landroidx/paging/PagingSource;

    .line 8
    iget-object v1, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-static {v1}, Landroidx/paging/PageFetcher;->access$getConfig$p(Landroidx/paging/PageFetcher;)Landroidx/paging/PagingConfig;

    move-result-object v11

    .line 9
    iget-object v1, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-static {v1}, Landroidx/paging/PageFetcher;->access$getRetryEvents$p(Landroidx/paging/PageFetcher;)Landroidx/paging/ConflatedEventBus;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/paging/ConflatedEventBus;->getFlow()Lvd/c;

    move-result-object v12

    .line 10
    new-instance v1, Landroidx/paging/PageFetcher$flow$1$2$1;

    iget-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-direct {v1, v2}, Landroidx/paging/PageFetcher$flow$1$2$1;-><init>(Ljava/lang/Object;)V

    .line 11
    new-instance v8, Landroidx/paging/PageFetcherSnapshot;

    .line 12
    iget-object v14, v0, Landroidx/paging/PageFetcher$flow$1$2;->$remoteMediatorAccessor:Landroidx/paging/RemoteMediatorAccessor;

    const/16 v17, 0x10

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v1

    .line 13
    invoke-direct/range {v8 .. v18}, Landroidx/paging/PageFetcherSnapshot;-><init>(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lvd/c;ILandroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 14
    invoke-static {v7, v6, v7}, Lsd/o1;->b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/v;

    move-result-object v1

    .line 15
    new-instance v2, Landroidx/paging/PageFetcher$GenerationInfo;

    invoke-direct {v2, v8, v7, v1}, Landroidx/paging/PageFetcher$GenerationInfo;-><init>(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PagingState;Lkotlinx/coroutines/g;)V

    return-object v2

    .line 16
    :cond_3
    iget-object v9, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    .line 17
    invoke-virtual {v8}, Landroidx/paging/PageFetcher$GenerationInfo;->getSnapshot()Landroidx/paging/PageFetcherSnapshot;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/paging/PageFetcherSnapshot;->getPagingSource$paging_common()Landroidx/paging/PagingSource;

    move-result-object v10

    .line 18
    iput-object v8, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v0, Landroidx/paging/PageFetcher$flow$1$2;->label:I

    invoke-static {v9, v10, v0}, Landroidx/paging/PageFetcher;->access$generateNewPagingSource(Landroidx/paging/PageFetcher;Landroidx/paging/PagingSource;Lvc/c;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_0

    goto/16 :goto_c

    .line 19
    :goto_1
    check-cast v9, Landroidx/paging/PagingSource;

    .line 20
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {v8}, Landroidx/paging/PageFetcher$GenerationInfo;->getSnapshot()Landroidx/paging/PageFetcherSnapshot;

    move-result-object v11

    iput-object v8, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    iput-object v10, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$4:Ljava/lang/Object;

    iput v5, v0, Landroidx/paging/PageFetcher$flow$1$2;->label:I

    invoke-virtual {v11, v0}, Landroidx/paging/PageFetcherSnapshot;->currentPagingState(Lvc/c;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v1, :cond_4

    goto/16 :goto_c

    :cond_4
    move-object v12, v10

    move-object v10, v8

    move-object v8, v2

    .line 21
    :goto_2
    iput-object v11, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 22
    iget-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PagingState;

    invoke-virtual {v8}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 23
    invoke-virtual {v10}, Landroidx/paging/PageFetcher$GenerationInfo;->getCachedInitialState()Landroidx/paging/PagingState;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v6

    if-ne v8, v6, :cond_5

    .line 24
    invoke-virtual {v10}, Landroidx/paging/PageFetcher$GenerationInfo;->getCachedInitialState()Landroidx/paging/PagingState;

    move-result-object v8

    iput-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 25
    :cond_5
    iget-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PagingState;

    invoke-virtual {v8}, Landroidx/paging/PagingState;->getAnchorPosition()Ljava/lang/Integer;

    move-result-object v8

    if-nez v8, :cond_7

    .line 26
    invoke-virtual {v10}, Landroidx/paging/PageFetcher$GenerationInfo;->getCachedInitialState()Landroidx/paging/PagingState;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Landroidx/paging/PagingState;->getAnchorPosition()Ljava/lang/Integer;

    move-result-object v8

    goto :goto_3

    :cond_6
    move-object v8, v7

    :goto_3
    if-eqz v8, :cond_7

    .line 27
    invoke-virtual {v10}, Landroidx/paging/PageFetcher$GenerationInfo;->getCachedInitialState()Landroidx/paging/PagingState;

    move-result-object v8

    iput-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 28
    :cond_7
    check-cast v12, Landroidx/paging/PageFetcher$LoadRequest$Refresh;

    invoke-virtual {v12}, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->getType()Landroidx/paging/PageFetcher$RefreshType;

    move-result-object v8

    sget-object v11, Landroidx/paging/PageFetcher$RefreshType$Anchor;->INSTANCE:Landroidx/paging/PageFetcher$RefreshType$Anchor;

    invoke-static {v8, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    .line 29
    iget-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PagingState;

    invoke-virtual {v8}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_8

    .line 30
    iget-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PagingState;

    invoke-virtual {v8}, Landroidx/paging/PagingState;->getAnchorPosition()Ljava/lang/Integer;

    move-result-object v8

    if-nez v8, :cond_8

    goto/16 :goto_a

    .line 31
    :cond_8
    invoke-virtual {v12}, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->getType()Landroidx/paging/PageFetcher$RefreshType;

    move-result-object v8

    instance-of v8, v8, Landroidx/paging/PageFetcher$RefreshType$Item;

    if-eqz v8, :cond_f

    .line 32
    invoke-virtual {v12}, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->getType()Landroidx/paging/PageFetcher$RefreshType;

    move-result-object v8

    check-cast v8, Landroidx/paging/PageFetcher$RefreshType$Item;

    invoke-virtual {v8}, Landroidx/paging/PageFetcher$RefreshType$Item;->getItem()Ljava/lang/Object;

    move-result-object v8

    .line 33
    iget-object v11, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/PagingState;

    invoke-virtual {v11}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .line 34
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 35
    invoke-virtual {v13}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    invoke-static {v13, v8}, Lrc/g0;->e0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    goto :goto_4

    :cond_a
    move-object v12, v7

    .line 36
    :goto_4
    check-cast v12, Landroidx/paging/PagingSource$LoadResult$Page;

    if-nez v12, :cond_c

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid Refresh item. Item "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " not found in "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/paging/PagingState;

    invoke-virtual {v2}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/paging/PagingSource$LoadResult$Page;

    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_5

    :cond_b
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " loaded items."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 38
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 39
    :cond_c
    invoke-virtual {v10}, Landroidx/paging/PageFetcher$GenerationInfo;->getSnapshot()Landroidx/paging/PageFetcherSnapshot;

    move-result-object v3

    iput-object v10, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$4:Ljava/lang/Object;

    const/4 v11, 0x4

    iput v11, v0, Landroidx/paging/PageFetcher$flow$1$2;->label:I

    invoke-virtual {v3, v12, v0}, Landroidx/paging/PageFetcherSnapshot;->getLoadKey$paging_common(Landroidx/paging/PagingSource$LoadResult$Page;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_d

    goto/16 :goto_c

    :cond_d
    move-object v1, v8

    move-object v8, v10

    .line 40
    :goto_6
    sget-object v10, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 41
    invoke-virtual {v10, v5}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    move-result v11

    if-eqz v11, :cond_e

    .line 42
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " based around item "

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-virtual {v10, v5, v1, v7}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    :cond_e
    iget-object v1, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-static {v1}, Landroidx/paging/PageFetcher;->access$getConfig$p(Landroidx/paging/PageFetcher;)Landroidx/paging/PagingConfig;

    move-result-object v1

    iget v1, v1, Landroidx/paging/PagingConfig;->initialLoadSize:I

    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v1

    .line 45
    invoke-static {v3, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    :goto_7
    move-object v10, v9

    goto/16 :goto_b

    .line 46
    :cond_f
    invoke-virtual {v12}, Landroidx/paging/PageFetcher$LoadRequest$Refresh;->getType()Landroidx/paging/PageFetcher$RefreshType;

    move-result-object v8

    sget-object v11, Landroidx/paging/PageFetcher$RefreshType$All;->INSTANCE:Landroidx/paging/PageFetcher$RefreshType$All;

    invoke-static {v8, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    .line 47
    invoke-virtual {v10}, Landroidx/paging/PageFetcher$GenerationInfo;->getSnapshot()Landroidx/paging/PageFetcherSnapshot;

    move-result-object v8

    .line 48
    iget-object v11, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/PagingState;

    invoke-virtual {v11}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/paging/PagingSource$LoadResult$Page;

    iput-object v10, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$4:Ljava/lang/Object;

    const/4 v12, 0x5

    iput v12, v0, Landroidx/paging/PageFetcher$flow$1$2;->label:I

    invoke-virtual {v8, v11, v0}, Landroidx/paging/PageFetcherSnapshot;->getLoadKey$paging_common(Landroidx/paging/PagingSource$LoadResult$Page;Lvc/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_10

    goto/16 :goto_c

    :cond_10
    move-object v1, v2

    move-object v2, v9

    .line 49
    :goto_8
    sget-object v9, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 50
    invoke-virtual {v9, v5}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    move-result v11

    if-eqz v11, :cond_11

    .line 51
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " from first item "

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PagingState;

    invoke-virtual {v4}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lrc/g0;->l0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 52
    invoke-virtual {v9, v5, v4, v7}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    :cond_11
    iget-object v4, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PagingState;

    invoke-virtual {v4}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/paging/PagingSource$LoadResult$Page;

    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v3, v5

    goto :goto_9

    :cond_12
    invoke-static {v3}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v3

    .line 54
    invoke-static {v8, v3}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    move-object v8, v10

    move-object v10, v2

    move-object v2, v1

    move-object v1, v3

    goto :goto_b

    .line 55
    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "should not get here"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 56
    :cond_14
    :goto_a
    iget-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/PagingState;

    invoke-virtual {v9, v1}, Landroidx/paging/PagingSource;->getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Object;

    move-result-object v1

    .line 57
    sget-object v3, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 58
    invoke-virtual {v3, v5}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    move-result v8

    if-eqz v8, :cond_15

    .line 59
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " returned from PagingSource "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 60
    invoke-virtual {v3, v5, v4, v7}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    :cond_15
    iget-object v3, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-static {v3}, Landroidx/paging/PageFetcher;->access$getConfig$p(Landroidx/paging/PageFetcher;)Landroidx/paging/PagingConfig;

    move-result-object v3

    iget v3, v3, Landroidx/paging/PagingConfig;->initialLoadSize:I

    invoke-static {v3}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v3

    .line 62
    invoke-static {v1, v3}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    move-object v8, v10

    goto/16 :goto_7

    .line 63
    :goto_b
    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v13

    .line 64
    invoke-virtual {v8}, Landroidx/paging/PageFetcher$GenerationInfo;->getSnapshot()Landroidx/paging/PageFetcherSnapshot;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/paging/PageFetcherSnapshot;->close()V

    .line 65
    invoke-virtual {v8}, Landroidx/paging/PageFetcher$GenerationInfo;->getJob()Lkotlinx/coroutines/g;

    move-result-object v1

    invoke-static {v1, v7, v6, v7}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 66
    new-instance v1, Landroidx/paging/PageFetcher$GenerationInfo;

    .line 67
    iget-object v3, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-static {v3}, Landroidx/paging/PageFetcher;->access$getConfig$p(Landroidx/paging/PageFetcher;)Landroidx/paging/PagingConfig;

    move-result-object v11

    .line 68
    iget-object v3, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-static {v3}, Landroidx/paging/PageFetcher;->access$getRetryEvents$p(Landroidx/paging/PageFetcher;)Landroidx/paging/ConflatedEventBus;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/paging/ConflatedEventBus;->getFlow()Lvd/c;

    move-result-object v12

    .line 69
    new-instance v3, Landroidx/paging/PageFetcher$flow$1$2$7;

    iget-object v4, v0, Landroidx/paging/PageFetcher$flow$1$2;->this$0:Landroidx/paging/PageFetcher;

    invoke-direct {v3, v4}, Landroidx/paging/PageFetcher$flow$1$2$7;-><init>(Ljava/lang/Object;)V

    .line 70
    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    move-object v15, v4

    check-cast v15, Landroidx/paging/PagingState;

    .line 71
    new-instance v8, Landroidx/paging/PageFetcherSnapshot;

    .line 72
    iget-object v14, v0, Landroidx/paging/PageFetcher$flow$1$2;->$remoteMediatorAccessor:Landroidx/paging/RemoteMediatorAccessor;

    move-object/from16 v16, v3

    .line 73
    invoke-direct/range {v8 .. v16}, Landroidx/paging/PageFetcherSnapshot;-><init>(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lvd/c;ILandroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lhd/a;)V

    .line 74
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/paging/PagingState;

    .line 75
    invoke-static {v7, v6, v7}, Lsd/o1;->b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/v;

    move-result-object v3

    .line 76
    invoke-direct {v1, v8, v2, v3}, Landroidx/paging/PageFetcher$GenerationInfo;-><init>(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PagingState;Lkotlinx/coroutines/g;)V

    return-object v1

    :cond_16
    if-eqz v8, :cond_18

    .line 77
    invoke-virtual {v8}, Landroidx/paging/PageFetcher$GenerationInfo;->getSnapshot()Landroidx/paging/PageFetcherSnapshot;

    move-result-object v3

    invoke-virtual {v2}, Landroidx/paging/PageFetcher$LoadRequest;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v2

    iput-object v8, v0, Landroidx/paging/PageFetcher$flow$1$2;->L$0:Ljava/lang/Object;

    const/4 v4, 0x6

    iput v4, v0, Landroidx/paging/PageFetcher$flow$1$2;->label:I

    invoke-virtual {v3, v2, v0}, Landroidx/paging/PageFetcherSnapshot;->forceSetHint(Landroidx/paging/LoadType;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_17

    :goto_c
    return-object v1

    :cond_17
    return-object v8

    .line 78
    :cond_18
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Append or Prepend request should be sent after a Refresh. This error indicates a bug in the Paging library. Please file a bug report in Buganizer."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
