.class final Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;
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
    c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$confirmJoinCollection$3"
    f = "MistakeNotebookViewModel.kt"
    i = {}
    l = {
        0x19b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,845:1\n230#2,5:846\n230#2,5:851\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3\n*L\n421#1:846,5\n423#1:851,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $collectionIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedItemIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/util/List;Ljava/util/List;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->$collectionIds:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->$selectedItemIds:Ljava/util/List;

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
    new-instance p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->$collectionIds:Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->$selectedItemIds:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/util/List;Ljava/util/List;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->label:I

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
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3$1;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 38
    .line 39
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->$collectionIds:Ljava/util/List;

    .line 40
    .line 41
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->$selectedItemIds:Ljava/util/List;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    invoke-direct {v2, v4, v5, v6, v7}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3$1;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Ljava/util/List;Ljava/util/List;Lh6/c;)V

    .line 45
    .line 46
    .line 47
    iput v3, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->label:I

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
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    move-object v3, v1

    .line 66
    check-cast v3, Lcom/zykj/mistake/network/ApiResp;

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->b()V

    .line 69
    .line 70
    .line 71
    sget-object v3, Lcom/zykj/mistake/feature/notebook/list/l;->a:Lcom/zykj/mistake/feature/notebook/list/l;

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 74
    .line 75
    .line 76
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 77
    .line 78
    const-string v4, "\u5df2\u52a0\u5165\u9519\u9898\u96c6"

    .line 79
    .line 80
    invoke-direct {v3, v4}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$confirmJoinCollection$3;->this$0:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 87
    .line 88
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-eqz v1, :cond_8

    .line 93
    .line 94
    iget-object v3, v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 95
    .line 96
    :cond_4
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    move-object v5, v4

    .line 101
    check-cast v5, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 102
    .line 103
    const/16 v28, 0x0

    .line 104
    .line 105
    const v29, 0x1fbffff

    .line 106
    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    const/4 v14, 0x0

    .line 117
    const/4 v15, 0x0

    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    const/16 v19, 0x0

    .line 125
    .line 126
    const/16 v20, 0x0

    .line 127
    .line 128
    const/16 v21, 0x0

    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    const/16 v23, 0x0

    .line 133
    .line 134
    const/16 v24, 0x0

    .line 135
    .line 136
    const/16 v25, 0x0

    .line 137
    .line 138
    const/16 v26, 0x0

    .line 139
    .line 140
    const/16 v27, 0x0

    .line 141
    .line 142
    invoke-static/range {v5 .. v29}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d(Ljava/lang/Throwable;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_6

    .line 157
    .line 158
    iget-object v3, v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->d:Lkotlinx/coroutines/flow/n0;

    .line 159
    .line 160
    :cond_5
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    move-object v4, v1

    .line 165
    check-cast v4, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 166
    .line 167
    const/16 v27, 0x1

    .line 168
    .line 169
    const v28, 0xffffff

    .line 170
    .line 171
    .line 172
    const/4 v5, 0x0

    .line 173
    const/4 v6, 0x0

    .line 174
    const/4 v7, 0x0

    .line 175
    const/4 v8, 0x0

    .line 176
    const/4 v9, 0x0

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    const/4 v12, 0x0

    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    const/16 v17, 0x0

    .line 186
    .line 187
    const/16 v18, 0x0

    .line 188
    .line 189
    const/16 v19, 0x0

    .line 190
    .line 191
    const/16 v20, 0x0

    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    const/16 v22, 0x0

    .line 196
    .line 197
    const/16 v23, 0x0

    .line 198
    .line 199
    const/16 v24, 0x0

    .line 200
    .line 201
    const/16 v25, 0x0

    .line 202
    .line 203
    const/16 v26, 0x0

    .line 204
    .line 205
    invoke-static/range {v4 .. v28}, Lcom/zykj/mistake/feature/notebook/list/e1;->a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v3, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_5

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_6
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/x;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-nez v1, :cond_7

    .line 223
    .line 224
    const-string v1, ""

    .line 225
    .line 226
    :cond_7
    invoke-direct {v3, v1}, Lcom/zykj/mistake/feature/notebook/list/x;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->h(Lcom/zykj/mistake/feature/notebook/list/y;)V

    .line 230
    .line 231
    .line 232
    :cond_8
    :goto_1
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 233
    .line 234
    return-object v1
.end method
