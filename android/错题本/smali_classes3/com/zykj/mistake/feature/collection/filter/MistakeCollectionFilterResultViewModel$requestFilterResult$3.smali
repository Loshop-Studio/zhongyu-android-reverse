.class final Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;
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
    c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestFilterResult$3"
    f = "MistakeCollectionFilterResultViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2
    }
    l = {
        0x146,
        0x147,
        0x16c
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "listDeferred",
        "selectableIdsReq",
        "idsDeferred",
        "$this$launch",
        "listDeferred",
        "selectableIdsReq",
        "idsDeferred",
        "listResult",
        "$this$launch"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeCollectionFilterResultViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,516:1\n1573#2:517\n1604#2,4:518\n1788#2,4:522\n1573#2:531\n1604#2,4:532\n230#3,5:526\n230#3,5:536\n230#3,5:541\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3\n*L\n337#1:517\n337#1:518,4\n345#1:522,4\n367#1:531\n367#1:532,4\n354#1:526,5\n370#1:536,5\n382#1:541,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $isRefresh:Z

.field final synthetic $req:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

.field final synthetic $requestSkipCount:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;


# direct methods
.method public constructor <init>(ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;",
            "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;",
            "I",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$isRefresh:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$req:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 6
    .line 7
    iput p4, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$requestSkipCount:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
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
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$isRefresh:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$req:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$requestSkipCount:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;-><init>(ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILh6/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lkotlinx/coroutines/v;

    .line 6
    .line 7
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->label:I

    .line 10
    .line 11
    const/16 v4, 0xa

    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    const-string v6, ""

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    if-eq v3, v9, :cond_2

    .line 23
    .line 24
    if-eq v3, v7, :cond_1

    .line 25
    .line 26
    if-ne v3, v5, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Lkotlin/Result;

    .line 34
    .line 35
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto/16 :goto_11

    .line 40
    .line 41
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_1
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$4:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$3:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lkotlinx/coroutines/a0;

    .line 54
    .line 55
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$2:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 58
    .line 59
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lkotlinx/coroutines/a0;

    .line 62
    .line 63
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object v3, v1

    .line 67
    move-object/from16 v1, p1

    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_2
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$3:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lkotlinx/coroutines/a0;

    .line 74
    .line 75
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$2:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 78
    .line 79
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v5, Lkotlinx/coroutines/a0;

    .line 82
    .line 83
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object v11, v3

    .line 87
    move-object/from16 v3, p1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$isRefresh:Z

    .line 94
    .line 95
    if-eqz v3, :cond_1c

    .line 96
    .line 97
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3$listDeferred$1;

    .line 98
    .line 99
    iget-object v11, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 100
    .line 101
    iget-object v12, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$req:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 102
    .line 103
    invoke-direct {v3, v11, v12, v10}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3$listDeferred$1;-><init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Lh6/c;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v10, v3, v5}, Lkotlinx/coroutines/x;->d(Lkotlinx/coroutines/v;Ld7/d;Lr6/e;I)Lkotlinx/coroutines/b0;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    iget-object v11, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 111
    .line 112
    iget-object v12, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$req:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 113
    .line 114
    iget-object v11, v11, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 115
    .line 116
    invoke-virtual {v11}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    check-cast v11, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 121
    .line 122
    iget-object v11, v11, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 123
    .line 124
    sget-object v13, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;->EXISTING_COLLECTION_ADD:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 125
    .line 126
    if-eq v11, v13, :cond_4

    .line 127
    .line 128
    invoke-static {v12}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->b(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    goto :goto_0

    .line 133
    :cond_4
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getCurrentCollectionStatus()I

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-ne v11, v7, :cond_5

    .line 138
    .line 139
    move-object v11, v10

    .line 140
    goto :goto_0

    .line 141
    :cond_5
    invoke-static {v12}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->b(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-virtual {v11, v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setCurrentCollectionStatus(I)V

    .line 146
    .line 147
    .line 148
    :goto_0
    if-eqz v11, :cond_6

    .line 149
    .line 150
    iget-object v12, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 151
    .line 152
    new-instance v13, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3$idsDeferred$1$1;

    .line 153
    .line 154
    invoke-direct {v13, v12, v11, v10}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3$idsDeferred$1$1;-><init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Lh6/c;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v10, v13, v5}, Lkotlinx/coroutines/x;->d(Lkotlinx/coroutines/v;Ld7/d;Lr6/e;I)Lkotlinx/coroutines/b0;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    goto :goto_1

    .line 162
    :cond_6
    move-object v1, v10

    .line 163
    :goto_1
    iput-object v10, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$0:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v10, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$1:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v11, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$2:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$3:Ljava/lang/Object;

    .line 170
    .line 171
    iput v9, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->label:I

    .line 172
    .line 173
    invoke-virtual {v3, v0}, Lkotlinx/coroutines/c1;->u(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    if-ne v3, v2, :cond_7

    .line 178
    .line 179
    goto/16 :goto_10

    .line 180
    .line 181
    :cond_7
    :goto_2
    check-cast v3, Lkotlin/Result;

    .line 182
    .line 183
    invoke-virtual {v3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-eqz v1, :cond_9

    .line 188
    .line 189
    iput-object v10, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$0:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v10, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$1:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v11, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$2:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v10, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$3:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$4:Ljava/lang/Object;

    .line 198
    .line 199
    iput v7, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->label:I

    .line 200
    .line 201
    invoke-interface {v1, v0}, Lkotlinx/coroutines/a0;->c(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-ne v1, v2, :cond_8

    .line 206
    .line 207
    goto/16 :goto_10

    .line 208
    .line 209
    :cond_8
    move-object v2, v11

    .line 210
    :goto_3
    check-cast v1, Lkotlin/Result;

    .line 211
    .line 212
    move-object v11, v2

    .line 213
    goto :goto_4

    .line 214
    :cond_9
    move-object v1, v10

    .line 215
    :goto_4
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 216
    .line 217
    invoke-static {v3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    if-nez v5, :cond_a

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_a
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/p;

    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    if-nez v5, :cond_b

    .line 231
    .line 232
    move-object v5, v6

    .line 233
    :cond_b
    invoke-direct {v3, v5}, Lcom/zykj/mistake/feature/collection/filter/p;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f(Lcom/zykj/mistake/feature/collection/filter/q;)V

    .line 237
    .line 238
    .line 239
    move-object v3, v10

    .line 240
    :goto_5
    check-cast v3, Lcom/zykj/mistake/entity/resp/MistakeListResp;

    .line 241
    .line 242
    if-eqz v1, :cond_e

    .line 243
    .line 244
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 249
    .line 250
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    if-nez v5, :cond_c

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_c
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/p;

    .line 258
    .line 259
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    if-nez v5, :cond_d

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_d
    move-object v6, v5

    .line 267
    :goto_6
    invoke-direct {v1, v6}, Lcom/zykj/mistake/feature/collection/filter/p;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f(Lcom/zykj/mistake/feature/collection/filter/q;)V

    .line 271
    .line 272
    .line 273
    move-object v1, v10

    .line 274
    :goto_7
    check-cast v1, Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResp;

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_e
    move-object v1, v10

    .line 278
    :goto_8
    if-eqz v3, :cond_25

    .line 279
    .line 280
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getItems()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    new-instance v5, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-static {v2, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    move v4, v8

    .line 302
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    if-eqz v6, :cond_10

    .line 307
    .line 308
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    add-int/lit8 v7, v4, 0x1

    .line 313
    .line 314
    if-ltz v4, :cond_f

    .line 315
    .line 316
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 317
    .line 318
    invoke-static {v6, v9, v4}, Lcom/zykj/mistake/data/d;->c(Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;II)Lp4/b;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move v4, v7

    .line 326
    goto :goto_9

    .line 327
    :cond_f
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 328
    .line 329
    .line 330
    throw v10

    .line 331
    :cond_10
    if-eqz v1, :cond_11

    .line 332
    .line 333
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResp;->getResult()Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResult;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    if-eqz v2, :cond_11

    .line 338
    .line 339
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResult;->getItemIds()Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    goto :goto_a

    .line 344
    :cond_11
    move-object v2, v10

    .line 345
    :goto_a
    if-nez v2, :cond_12

    .line 346
    .line 347
    sget-object v2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 348
    .line 349
    :cond_12
    invoke-static {v2}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 350
    .line 351
    .line 352
    move-result-object v21

    .line 353
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getTotalCount()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    if-nez v11, :cond_13

    .line 362
    .line 363
    :goto_b
    move v1, v8

    .line 364
    goto :goto_d

    .line 365
    :cond_13
    if-eqz v1, :cond_14

    .line 366
    .line 367
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResp;->getResult()Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResult;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    if-eqz v1, :cond_14

    .line 372
    .line 373
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResult;->getTotalCount()I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    goto :goto_d

    .line 378
    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-eqz v1, :cond_15

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_15
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    move v3, v8

    .line 390
    move v4, v3

    .line 391
    :cond_16
    :goto_c
    if-ge v4, v1, :cond_18

    .line 392
    .line 393
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    add-int/lit8 v4, v4, 0x1

    .line 398
    .line 399
    check-cast v6, Lp4/b;

    .line 400
    .line 401
    iget-boolean v6, v6, Lp4/b;->n:Z

    .line 402
    .line 403
    if-nez v6, :cond_16

    .line 404
    .line 405
    add-int/lit8 v3, v3, 0x1

    .line 406
    .line 407
    if-ltz v3, :cond_17

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_17
    invoke-static {}, Lkotlin/collections/u;->K()V

    .line 411
    .line 412
    .line 413
    throw v10

    .line 414
    :cond_18
    move v1, v3

    .line 415
    :goto_d
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 416
    .line 417
    iget-object v3, v3, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 418
    .line 419
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 424
    .line 425
    iget v3, v3, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    .line 426
    .line 427
    add-int/2addr v3, v1

    .line 428
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 429
    .line 430
    iget-object v4, v4, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 431
    .line 432
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    check-cast v4, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 437
    .line 438
    iget v4, v4, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    .line 439
    .line 440
    if-le v3, v4, :cond_19

    .line 441
    .line 442
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 443
    .line 444
    new-instance v4, Lcom/zykj/mistake/feature/collection/filter/p;

    .line 445
    .line 446
    iget-object v6, v3, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 447
    .line 448
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    check-cast v6, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 453
    .line 454
    iget v6, v6, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    .line 455
    .line 456
    new-instance v7, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    const-string v10, "\u5f53\u524d\u53ef\u65b0\u589e\u9519\u9898\u5171 "

    .line 459
    .line 460
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    const-string v1, " \u9053\uff0c\u5df2\u8d85\u51fa\u5355\u96c6\u4e0a\u9650 "

    .line 467
    .line 468
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    const-string v1, " \u9053\uff0c\u53ef\u5c1d\u8bd5\u7f29\u5c0f\u7b5b\u9009\u8303\u56f4"

    .line 475
    .line 476
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-direct {v4, v1}, Lcom/zykj/mistake/feature/collection/filter/p;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f(Lcom/zykj/mistake/feature/collection/filter/q;)V

    .line 487
    .line 488
    .line 489
    :cond_19
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 490
    .line 491
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 492
    .line 493
    :goto_e
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    move-object v12, v3

    .line 498
    check-cast v12, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 499
    .line 500
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    if-ge v4, v2, :cond_1a

    .line 505
    .line 506
    move/from16 v28, v9

    .line 507
    .line 508
    goto :goto_f

    .line 509
    :cond_1a
    move/from16 v28, v8

    .line 510
    .line 511
    :goto_f
    const v47, -0x81c1

    .line 512
    .line 513
    .line 514
    const/16 v48, 0x3

    .line 515
    .line 516
    const/4 v13, 0x0

    .line 517
    const/4 v14, 0x0

    .line 518
    const/4 v15, 0x0

    .line 519
    const/16 v16, 0x0

    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    const/16 v18, 0x0

    .line 524
    .line 525
    const/16 v22, 0x0

    .line 526
    .line 527
    const/16 v23, 0x0

    .line 528
    .line 529
    const/16 v24, 0x0

    .line 530
    .line 531
    const/16 v25, 0x0

    .line 532
    .line 533
    const/16 v26, 0x0

    .line 534
    .line 535
    const/16 v27, 0x0

    .line 536
    .line 537
    const/16 v29, 0x0

    .line 538
    .line 539
    const/16 v30, 0x0

    .line 540
    .line 541
    const/16 v31, 0x0

    .line 542
    .line 543
    const/16 v32, 0x0

    .line 544
    .line 545
    const/16 v33, 0x0

    .line 546
    .line 547
    const/16 v34, 0x0

    .line 548
    .line 549
    const/16 v35, 0x0

    .line 550
    .line 551
    const/16 v36, 0x0

    .line 552
    .line 553
    const/16 v37, 0x0

    .line 554
    .line 555
    const/16 v38, 0x0

    .line 556
    .line 557
    const/16 v39, 0x0

    .line 558
    .line 559
    const/16 v40, 0x0

    .line 560
    .line 561
    const/16 v41, 0x0

    .line 562
    .line 563
    const/16 v42, 0x0

    .line 564
    .line 565
    const/16 v43, 0x0

    .line 566
    .line 567
    const/16 v44, 0x0

    .line 568
    .line 569
    const/16 v45, 0x0

    .line 570
    .line 571
    const/16 v46, 0x0

    .line 572
    .line 573
    move/from16 v20, v2

    .line 574
    .line 575
    move-object/from16 v19, v5

    .line 576
    .line 577
    invoke-static/range {v12 .. v48}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    invoke-virtual {v1, v3, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    if-eqz v2, :cond_1b

    .line 586
    .line 587
    goto/16 :goto_15

    .line 588
    .line 589
    :cond_1b
    move-object/from16 v5, v19

    .line 590
    .line 591
    move/from16 v2, v20

    .line 592
    .line 593
    goto :goto_e

    .line 594
    :cond_1c
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3$2;

    .line 595
    .line 596
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 597
    .line 598
    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$req:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 599
    .line 600
    invoke-direct {v1, v3, v7, v10}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3$2;-><init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Lh6/c;)V

    .line 601
    .line 602
    .line 603
    iput-object v10, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->L$0:Ljava/lang/Object;

    .line 604
    .line 605
    iput v5, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->label:I

    .line 606
    .line 607
    invoke-static {v1, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    if-ne v1, v2, :cond_1d

    .line 612
    .line 613
    :goto_10
    return-object v2

    .line 614
    :cond_1d
    :goto_11
    iget v2, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->$requestSkipCount:I

    .line 615
    .line 616
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 617
    .line 618
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    if-eqz v5, :cond_22

    .line 623
    .line 624
    move-object v5, v1

    .line 625
    check-cast v5, Lcom/zykj/mistake/entity/resp/MistakeListResp;

    .line 626
    .line 627
    div-int/lit8 v2, v2, 0x14

    .line 628
    .line 629
    add-int/2addr v2, v9

    .line 630
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getItems()Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v5

    .line 638
    new-instance v7, Ljava/util/ArrayList;

    .line 639
    .line 640
    invoke-static {v5, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 641
    .line 642
    .line 643
    move-result v4

    .line 644
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 645
    .line 646
    .line 647
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    move v5, v8

    .line 652
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 653
    .line 654
    .line 655
    move-result v11

    .line 656
    if-eqz v11, :cond_1f

    .line 657
    .line 658
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v11

    .line 662
    add-int/lit8 v12, v5, 0x1

    .line 663
    .line 664
    if-ltz v5, :cond_1e

    .line 665
    .line 666
    check-cast v11, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;

    .line 667
    .line 668
    invoke-static {v11, v2, v5}, Lcom/zykj/mistake/data/d;->c(Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;II)Lp4/b;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move v5, v12

    .line 676
    goto :goto_12

    .line 677
    :cond_1e
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 678
    .line 679
    .line 680
    throw v10

    .line 681
    :cond_1f
    iget-object v2, v3, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 682
    .line 683
    :cond_20
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    move-object v10, v3

    .line 688
    check-cast v10, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 689
    .line 690
    iget-object v4, v10, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    .line 691
    .line 692
    invoke-static {v4, v7}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 693
    .line 694
    .line 695
    move-result-object v17

    .line 696
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    .line 697
    .line 698
    .line 699
    move-result v4

    .line 700
    iget v5, v10, Lcom/zykj/mistake/feature/collection/filter/s0;->h:I

    .line 701
    .line 702
    if-ge v4, v5, :cond_21

    .line 703
    .line 704
    move/from16 v26, v9

    .line 705
    .line 706
    goto :goto_13

    .line 707
    :cond_21
    move/from16 v26, v8

    .line 708
    .line 709
    :goto_13
    const v45, -0x8041

    .line 710
    .line 711
    .line 712
    const/16 v46, 0x3

    .line 713
    .line 714
    const/4 v11, 0x0

    .line 715
    const/4 v12, 0x0

    .line 716
    const/4 v13, 0x0

    .line 717
    const/4 v14, 0x0

    .line 718
    const/4 v15, 0x0

    .line 719
    const/16 v16, 0x0

    .line 720
    .line 721
    const/16 v18, 0x0

    .line 722
    .line 723
    const/16 v19, 0x0

    .line 724
    .line 725
    const/16 v20, 0x0

    .line 726
    .line 727
    const/16 v21, 0x0

    .line 728
    .line 729
    const/16 v22, 0x0

    .line 730
    .line 731
    const/16 v23, 0x0

    .line 732
    .line 733
    const/16 v24, 0x0

    .line 734
    .line 735
    const/16 v25, 0x0

    .line 736
    .line 737
    const/16 v27, 0x0

    .line 738
    .line 739
    const/16 v28, 0x0

    .line 740
    .line 741
    const/16 v29, 0x0

    .line 742
    .line 743
    const/16 v30, 0x0

    .line 744
    .line 745
    const/16 v31, 0x0

    .line 746
    .line 747
    const/16 v32, 0x0

    .line 748
    .line 749
    const/16 v33, 0x0

    .line 750
    .line 751
    const/16 v34, 0x0

    .line 752
    .line 753
    const/16 v35, 0x0

    .line 754
    .line 755
    const/16 v36, 0x0

    .line 756
    .line 757
    const/16 v37, 0x0

    .line 758
    .line 759
    const/16 v38, 0x0

    .line 760
    .line 761
    const/16 v39, 0x0

    .line 762
    .line 763
    const/16 v40, 0x0

    .line 764
    .line 765
    const/16 v41, 0x0

    .line 766
    .line 767
    const/16 v42, 0x0

    .line 768
    .line 769
    const/16 v43, 0x0

    .line 770
    .line 771
    const/16 v44, 0x0

    .line 772
    .line 773
    invoke-static/range {v10 .. v46}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 774
    .line 775
    .line 776
    move-result-object v4

    .line 777
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-result v3

    .line 781
    if-eqz v3, :cond_20

    .line 782
    .line 783
    :cond_22
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 784
    .line 785
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    if-eqz v3, :cond_24

    .line 790
    .line 791
    new-instance v4, Lcom/zykj/mistake/feature/collection/filter/p;

    .line 792
    .line 793
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    if-nez v3, :cond_23

    .line 798
    .line 799
    goto :goto_14

    .line 800
    :cond_23
    move-object v6, v3

    .line 801
    :goto_14
    invoke-direct {v4, v6}, Lcom/zykj/mistake/feature/collection/filter/p;-><init>(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v2, v4}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f(Lcom/zykj/mistake/feature/collection/filter/q;)V

    .line 805
    .line 806
    .line 807
    :cond_24
    invoke-static {v1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 808
    .line 809
    .line 810
    :cond_25
    :goto_15
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 811
    .line 812
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 813
    .line 814
    :cond_26
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    move-object v3, v2

    .line 819
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 820
    .line 821
    const v38, -0x16001

    .line 822
    .line 823
    .line 824
    const/16 v39, 0x3

    .line 825
    .line 826
    const/4 v4, 0x0

    .line 827
    const/4 v5, 0x0

    .line 828
    const/4 v6, 0x0

    .line 829
    const/4 v7, 0x0

    .line 830
    const/4 v8, 0x0

    .line 831
    const/4 v9, 0x0

    .line 832
    const/4 v10, 0x0

    .line 833
    const/4 v11, 0x0

    .line 834
    const/4 v12, 0x0

    .line 835
    const/4 v13, 0x0

    .line 836
    const/4 v14, 0x0

    .line 837
    const/4 v15, 0x0

    .line 838
    const/16 v16, 0x0

    .line 839
    .line 840
    const/16 v17, 0x0

    .line 841
    .line 842
    const/16 v18, 0x0

    .line 843
    .line 844
    const/16 v19, 0x0

    .line 845
    .line 846
    const/16 v20, 0x0

    .line 847
    .line 848
    const/16 v21, 0x0

    .line 849
    .line 850
    const/16 v22, 0x0

    .line 851
    .line 852
    const/16 v23, 0x0

    .line 853
    .line 854
    const/16 v24, 0x0

    .line 855
    .line 856
    const/16 v25, 0x0

    .line 857
    .line 858
    const/16 v26, 0x0

    .line 859
    .line 860
    const/16 v27, 0x0

    .line 861
    .line 862
    const/16 v28, 0x0

    .line 863
    .line 864
    const/16 v29, 0x0

    .line 865
    .line 866
    const/16 v30, 0x0

    .line 867
    .line 868
    const/16 v31, 0x0

    .line 869
    .line 870
    const/16 v32, 0x0

    .line 871
    .line 872
    const/16 v33, 0x0

    .line 873
    .line 874
    const/16 v34, 0x0

    .line 875
    .line 876
    const/16 v35, 0x0

    .line 877
    .line 878
    const/16 v36, 0x0

    .line 879
    .line 880
    const/16 v37, 0x0

    .line 881
    .line 882
    invoke-static/range {v3 .. v39}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 883
    .line 884
    .line 885
    move-result-object v3

    .line 886
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    move-result v2

    .line 890
    if-eqz v2, :cond_26

    .line 891
    .line 892
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 893
    .line 894
    return-object v1
.end method
