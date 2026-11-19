.class final Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel$removeSelectedCollections$1"
    f = "MistakeCollectionViewModel.kt"
    i = {}
    l = {
        0xb3
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeCollectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n230#2,3:256\n233#2,2:262\n827#3:259\n855#3,2:260\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1\n*L\n181#1:256,3\n181#1:262,2\n182#1:259\n182#1:260,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $collectionIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Ljava/util/List;Ljava/util/Set;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->$collectionIds:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->$selectedIds:Ljava/util/Set;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->$collectionIds:Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->$selectedIds:Ljava/util/Set;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;-><init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Ljava/util/List;Ljava/util/Set;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, Lkotlin/Result;

    .line 18
    .line 19
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1$1;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 38
    .line 39
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->$collectionIds:Ljava/util/List;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v2, v4, v5, v6}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1$1;-><init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Ljava/util/List;Lh6/c;)V

    .line 43
    .line 44
    .line 45
    iput v3, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->label:I

    .line 46
    .line 47
    invoke-static {v2, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-ne v2, v1, :cond_2

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    move-object v1, v2

    .line 55
    :goto_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 56
    .line 57
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->$selectedIds:Ljava/util/Set;

    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_7

    .line 64
    .line 65
    move-object v4, v1

    .line 66
    check-cast v4, Lcom/zykj/mistake/network/ApiResp;

    .line 67
    .line 68
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 69
    .line 70
    :cond_3
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    move-object v6, v5

    .line 75
    check-cast v6, Lcom/zykj/mistake/feature/collection/list/v;

    .line 76
    .line 77
    iget-object v7, v6, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    .line 78
    .line 79
    new-instance v8, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    :cond_4
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_5

    .line 93
    .line 94
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    move-object v10, v9

    .line 99
    check-cast v10, Lcom/zykj/mistake/feature/collection/list/b;

    .line 100
    .line 101
    iget-object v10, v10, Lcom/zykj/mistake/feature/collection/list/b;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-interface {v3, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-nez v10, :cond_4

    .line 108
    .line 109
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    iget v7, v6, Lcom/zykj/mistake/feature/collection/list/v;->b:I

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    sub-int/2addr v7, v9

    .line 120
    if-gez v7, :cond_6

    .line 121
    .line 122
    const/4 v7, 0x0

    .line 123
    :cond_6
    sget-object v15, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 124
    .line 125
    const/16 v16, 0x3f9

    .line 126
    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v12, 0x0

    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    invoke-static/range {v6 .. v16}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-virtual {v4, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_3

    .line 142
    .line 143
    sget-object v3, Lcom/zykj/mistake/feature/collection/list/c;->a:Lcom/zykj/mistake/feature/collection/list/c;

    .line 144
    .line 145
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c(Lcom/zykj/mistake/feature/collection/list/g;)V

    .line 146
    .line 147
    .line 148
    new-instance v3, Lcom/zykj/mistake/feature/collection/list/f;

    .line 149
    .line 150
    const-string v4, "\u5220\u9664\u6210\u529f"

    .line 151
    .line 152
    invoke-direct {v3, v4}, Lcom/zykj/mistake/feature/collection/list/f;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c(Lcom/zykj/mistake/feature/collection/list/g;)V

    .line 156
    .line 157
    .line 158
    :cond_7
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;->this$0:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 159
    .line 160
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eqz v1, :cond_9

    .line 165
    .line 166
    new-instance v3, Lcom/zykj/mistake/feature/collection/list/f;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    if-nez v1, :cond_8

    .line 173
    .line 174
    const-string v1, ""

    .line 175
    .line 176
    :cond_8
    invoke-direct {v3, v1}, Lcom/zykj/mistake/feature/collection/list/f;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c(Lcom/zykj/mistake/feature/collection/list/g;)V

    .line 180
    .line 181
    .line 182
    :cond_9
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 183
    .line 184
    return-object v1
.end method
