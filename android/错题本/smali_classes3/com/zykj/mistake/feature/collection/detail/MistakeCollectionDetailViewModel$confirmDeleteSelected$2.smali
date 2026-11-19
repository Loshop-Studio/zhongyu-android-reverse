.class final Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;
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
    c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$confirmDeleteSelected$2"
    f = "MistakeCollectionDetailViewModel.kt"
    i = {}
    l = {
        0x22a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeCollectionDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,663:1\n230#2,5:664\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2\n*L\n564#1:664,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $collectionId:I

.field final synthetic $itemIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;ILjava/util/List;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->$collectionId:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->$itemIds:Ljava/util/List;

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
    new-instance p1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->$collectionId:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->$itemIds:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;ILjava/util/List;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->label:I

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
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2$1;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 38
    .line 39
    iget v5, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->$collectionId:I

    .line 40
    .line 41
    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->$itemIds:Ljava/util/List;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    invoke-direct {v2, v4, v5, v6, v7}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2$1;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;ILjava/util/List;Lh6/c;)V

    .line 45
    .line 46
    .line 47
    iput v3, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->label:I

    .line 48
    .line 49
    invoke-static {v2, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-ne v2, v1, :cond_2

    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_2
    move-object v1, v2

    .line 57
    :goto_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 58
    .line 59
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->$itemIds:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    move-object v4, v1

    .line 68
    check-cast v4, Lcom/zykj/mistake/network/ApiResp;

    .line 69
    .line 70
    invoke-static {v3}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->g(Ljava/util/Set;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel$confirmDeleteSelected$2;->this$0:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    iget-object v3, v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 86
    .line 87
    :cond_4
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    move-object v5, v4

    .line 92
    check-cast v5, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 93
    .line 94
    const/16 v42, -0x1

    .line 95
    .line 96
    const/16 v43, 0x17

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v9, 0x0

    .line 102
    const/4 v10, 0x0

    .line 103
    const/4 v11, 0x0

    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v13, 0x0

    .line 106
    const/4 v14, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/16 v18, 0x0

    .line 113
    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    const/16 v20, 0x0

    .line 117
    .line 118
    const/16 v21, 0x0

    .line 119
    .line 120
    const/16 v22, 0x0

    .line 121
    .line 122
    const/16 v23, 0x0

    .line 123
    .line 124
    const/16 v24, 0x0

    .line 125
    .line 126
    const/16 v25, 0x0

    .line 127
    .line 128
    const/16 v26, 0x0

    .line 129
    .line 130
    const/16 v27, 0x0

    .line 131
    .line 132
    const/16 v28, 0x0

    .line 133
    .line 134
    const/16 v29, 0x0

    .line 135
    .line 136
    const/16 v30, 0x0

    .line 137
    .line 138
    const/16 v31, 0x0

    .line 139
    .line 140
    const/16 v32, 0x0

    .line 141
    .line 142
    const/16 v33, 0x0

    .line 143
    .line 144
    const/16 v34, 0x0

    .line 145
    .line 146
    const/16 v35, 0x0

    .line 147
    .line 148
    const/16 v36, 0x0

    .line 149
    .line 150
    const/16 v37, 0x0

    .line 151
    .line 152
    const/16 v38, 0x0

    .line 153
    .line 154
    const/16 v39, 0x0

    .line 155
    .line 156
    const/16 v40, 0x0

    .line 157
    .line 158
    const/16 v41, 0x0

    .line 159
    .line 160
    invoke-static/range {v5 .. v43}, Lcom/zykj/mistake/feature/collection/detail/z0;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_4

    .line 169
    .line 170
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/l;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-nez v1, :cond_5

    .line 177
    .line 178
    const-string v1, ""

    .line 179
    .line 180
    :cond_5
    invoke-direct {v3, v1}, Lcom/zykj/mistake/feature/collection/detail/l;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->j(Lcom/zykj/mistake/feature/collection/detail/m;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 187
    .line 188
    return-object v1
.end method
