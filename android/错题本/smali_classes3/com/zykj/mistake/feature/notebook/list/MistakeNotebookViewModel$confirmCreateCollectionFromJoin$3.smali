.class final Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;
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
    c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3"
    f = "MistakeNotebookViewModel.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x1bd,
        0x1cb
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-onSuccess-MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3$3"
    }
    s = {
        "L$1",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,845:1\n230#2,5:846\n230#2,5:851\n230#2,5:856\n230#2,5:861\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3\n*L\n462#1:846,5\n476#1:851,5\n478#1:856,5\n480#1:861,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $entry:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

.field final synthetic $name:Ljava/lang/String;

.field final synthetic $selectedItemIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;Ljava/util/List;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "Ljava/lang/String;",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$name:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$entry:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$selectedItemIds:Ljava/util/List;

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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$name:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$entry:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$selectedItemIds:Ljava/util/List;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;Ljava/util/List;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->label:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v6, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->L$1:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lcom/zykj/mistake/data/c;

    .line 20
    .line 21
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v2, p1

    .line 39
    .line 40
    check-cast v2, Lkotlin/Result;

    .line 41
    .line 42
    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3$1;

    .line 51
    .line 52
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 53
    .line 54
    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$name:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v2, v7, v8, v5}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/lang/String;Lh6/c;)V

    .line 57
    .line 58
    .line 59
    new-instance v7, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    invoke-direct {v7, v8}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iput v4, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->label:I

    .line 66
    .line 67
    invoke-static {v2, v7, v0}, Lcom/zykj/mistake/data/e;->b(Lr6/c;Lr6/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-ne v2, v1, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :goto_0
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 75
    .line 76
    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$entry:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 77
    .line 78
    iget-object v9, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->$selectedItemIds:Ljava/util/List;

    .line 79
    .line 80
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-eqz v10, :cond_8

    .line 85
    .line 86
    move-object v10, v2

    .line 87
    check-cast v10, Lcom/zykj/mistake/data/c;

    .line 88
    .line 89
    sget-object v11, Lcom/zykj/mistake/feature/notebook/list/l;->a:Lcom/zykj/mistake/feature/notebook/list/l;

    .line 90
    .line 91
    invoke-virtual {v7, v11}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 92
    .line 93
    .line 94
    sget-object v11, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;->EMPTY_DIRECT:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 95
    .line 96
    if-ne v8, v11, :cond_5

    .line 97
    .line 98
    iput-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->L$1:Ljava/lang/Object;

    .line 101
    .line 102
    iput v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->I$0:I

    .line 103
    .line 104
    iput v6, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->label:I

    .line 105
    .line 106
    invoke-static {v7, v10, v9, v0}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->a(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/data/c;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-ne v4, v1, :cond_4

    .line 111
    .line 112
    :goto_1
    return-object v1

    .line 113
    :cond_4
    move-object v1, v2

    .line 114
    :goto_2
    move-object v2, v1

    .line 115
    goto :goto_4

    .line 116
    :cond_5
    new-instance v8, Lcom/zykj/mistake/feature/notebook/list/a;

    .line 117
    .line 118
    iget-object v9, v10, Lcom/zykj/mistake/data/c;->a:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v1, v10, Lcom/zykj/mistake/data/c;->b:Ljava/lang/String;

    .line 121
    .line 122
    iget v11, v10, Lcom/zykj/mistake/data/c;->c:I

    .line 123
    .line 124
    iget v12, v10, Lcom/zykj/mistake/data/c;->d:I

    .line 125
    .line 126
    if-lt v11, v12, :cond_6

    .line 127
    .line 128
    move v13, v4

    .line 129
    goto :goto_3

    .line 130
    :cond_6
    move v13, v3

    .line 131
    :goto_3
    iget-boolean v14, v10, Lcom/zykj/mistake/data/c;->e:Z

    .line 132
    .line 133
    move-object v10, v1

    .line 134
    invoke-direct/range {v8 .. v14}, Lcom/zykj/mistake/feature/notebook/list/a;-><init>(Ljava/lang/String;Ljava/lang/String;IIZZ)V

    .line 135
    .line 136
    .line 137
    iget-object v1, v7, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 138
    .line 139
    :cond_7
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    move-object v9, v4

    .line 144
    check-cast v9, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 145
    .line 146
    invoke-static {v8}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    iget-object v6, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    .line 151
    .line 152
    invoke-static {v5, v6}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 153
    .line 154
    .line 155
    move-result-object v23

    .line 156
    iget-object v5, v9, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    .line 157
    .line 158
    iget-object v6, v8, Lcom/zykj/mistake/feature/notebook/list/a;->a:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v5, v6}, Lkotlin/collections/j0;->y(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 161
    .line 162
    .line 163
    move-result-object v25

    .line 164
    const/16 v32, 0x0

    .line 165
    .line 166
    const v33, 0x1053fff

    .line 167
    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    const/4 v11, 0x0

    .line 171
    const/4 v12, 0x0

    .line 172
    const/4 v13, 0x0

    .line 173
    const/4 v14, 0x0

    .line 174
    const/4 v15, 0x0

    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const/16 v19, 0x0

    .line 182
    .line 183
    const/16 v20, 0x0

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    const/16 v22, 0x1

    .line 188
    .line 189
    const/16 v24, 0x0

    .line 190
    .line 191
    const/16 v26, 0x0

    .line 192
    .line 193
    const/16 v27, 0x0

    .line 194
    .line 195
    const-string v28, ""

    .line 196
    .line 197
    const-string v29, ""

    .line 198
    .line 199
    const/16 v30, 0x0

    .line 200
    .line 201
    const/16 v31, 0x0

    .line 202
    .line 203
    invoke-static/range {v9 .. v33}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-virtual {v1, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eqz v4, :cond_7

    .line 212
    .line 213
    :cond_8
    :goto_4
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 214
    .line 215
    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-eqz v2, :cond_10

    .line 220
    .line 221
    iget-object v4, v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 222
    .line 223
    :cond_9
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    move-object v6, v5

    .line 228
    check-cast v6, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 229
    .line 230
    const/16 v29, 0x0

    .line 231
    .line 232
    const v30, 0x1bfffff

    .line 233
    .line 234
    .line 235
    const/4 v7, 0x0

    .line 236
    const/4 v8, 0x0

    .line 237
    const/4 v9, 0x0

    .line 238
    const/4 v10, 0x0

    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v12, 0x0

    .line 241
    const/4 v13, 0x0

    .line 242
    const/4 v14, 0x0

    .line 243
    const/4 v15, 0x0

    .line 244
    const/16 v16, 0x0

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const/16 v18, 0x0

    .line 249
    .line 250
    const/16 v19, 0x0

    .line 251
    .line 252
    const/16 v20, 0x0

    .line 253
    .line 254
    const/16 v21, 0x0

    .line 255
    .line 256
    const/16 v22, 0x0

    .line 257
    .line 258
    const/16 v23, 0x0

    .line 259
    .line 260
    const/16 v24, 0x0

    .line 261
    .line 262
    const/16 v25, 0x0

    .line 263
    .line 264
    const/16 v26, 0x0

    .line 265
    .line 266
    const/16 v27, 0x0

    .line 267
    .line 268
    const/16 v28, 0x0

    .line 269
    .line 270
    invoke-static/range {v6 .. v30}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-virtual {v4, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-eqz v5, :cond_9

    .line 279
    .line 280
    invoke-static {v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d(Ljava/lang/Throwable;)Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-eqz v5, :cond_b

    .line 285
    .line 286
    :cond_a
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    move-object v5, v1

    .line 291
    check-cast v5, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 292
    .line 293
    const/16 v28, 0x1

    .line 294
    .line 295
    const v29, 0xffffff

    .line 296
    .line 297
    .line 298
    const/4 v6, 0x0

    .line 299
    const/4 v7, 0x0

    .line 300
    const/4 v8, 0x0

    .line 301
    const/4 v9, 0x0

    .line 302
    const/4 v10, 0x0

    .line 303
    const/4 v11, 0x0

    .line 304
    const/4 v12, 0x0

    .line 305
    const/4 v13, 0x0

    .line 306
    const/4 v14, 0x0

    .line 307
    const/4 v15, 0x0

    .line 308
    const/16 v16, 0x0

    .line 309
    .line 310
    const/16 v17, 0x0

    .line 311
    .line 312
    const/16 v18, 0x0

    .line 313
    .line 314
    const/16 v19, 0x0

    .line 315
    .line 316
    const/16 v20, 0x0

    .line 317
    .line 318
    const/16 v21, 0x0

    .line 319
    .line 320
    const/16 v22, 0x0

    .line 321
    .line 322
    const/16 v23, 0x0

    .line 323
    .line 324
    const/16 v24, 0x0

    .line 325
    .line 326
    const/16 v25, 0x0

    .line 327
    .line 328
    const/16 v26, 0x0

    .line 329
    .line 330
    const/16 v27, 0x0

    .line 331
    .line 332
    invoke-static/range {v5 .. v29}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-virtual {v4, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-eqz v1, :cond_a

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    const-string v6, ""

    .line 348
    .line 349
    if-nez v5, :cond_c

    .line 350
    .line 351
    move-object v5, v6

    .line 352
    :cond_c
    const-string v7, "\u8be5\u540d\u79f0\u5df2\u5b58\u5728"

    .line 353
    .line 354
    invoke-static {v5, v7, v3}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-eqz v3, :cond_e

    .line 359
    .line 360
    :cond_d
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    move-object v5, v1

    .line 365
    check-cast v5, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 366
    .line 367
    const/16 v28, 0x0

    .line 368
    .line 369
    const v29, 0x1dfffff

    .line 370
    .line 371
    .line 372
    const/4 v6, 0x0

    .line 373
    const/4 v7, 0x0

    .line 374
    const/4 v8, 0x0

    .line 375
    const/4 v9, 0x0

    .line 376
    const/4 v10, 0x0

    .line 377
    const/4 v11, 0x0

    .line 378
    const/4 v12, 0x0

    .line 379
    const/4 v13, 0x0

    .line 380
    const/4 v14, 0x0

    .line 381
    const/4 v15, 0x0

    .line 382
    const/16 v16, 0x0

    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const/16 v18, 0x0

    .line 387
    .line 388
    const/16 v19, 0x0

    .line 389
    .line 390
    const/16 v20, 0x0

    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const/16 v22, 0x0

    .line 395
    .line 396
    const/16 v23, 0x0

    .line 397
    .line 398
    const/16 v24, 0x0

    .line 399
    .line 400
    const-string v25, "\u8be5\u540d\u79f0\u5df2\u5b58\u5728"

    .line 401
    .line 402
    const/16 v26, 0x0

    .line 403
    .line 404
    const/16 v27, 0x0

    .line 405
    .line 406
    invoke-static/range {v5 .. v29}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v4, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-eqz v1, :cond_d

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_e
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    if-nez v2, :cond_f

    .line 424
    .line 425
    goto :goto_5

    .line 426
    :cond_f
    move-object v6, v2

    .line 427
    :goto_5
    invoke-direct {v3, v6}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 431
    .line 432
    .line 433
    :cond_10
    :goto_6
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 434
    .line 435
    return-object v1
.end method
