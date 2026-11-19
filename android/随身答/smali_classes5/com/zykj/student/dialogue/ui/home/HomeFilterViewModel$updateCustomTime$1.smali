.class final Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->o(ZZLjava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.home.HomeFilterViewModel$updateCustomTime$1"
    f = "HomeFilterViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeFilterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFilterViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,380:1\n1563#2:381\n1634#2,3:382\n1563#2:385\n1634#2,3:386\n1563#2:389\n1634#2,3:390\n*S KotlinDebug\n*F\n+ 1 HomeFilterViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1\n*L\n153#1:381\n153#1:382,3\n168#1:385\n168#1:386,3\n185#1:389\n185#1:390,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

.field public final synthetic g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZILcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->d:Z

    iput p4, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->e:I

    iput-object p5, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    iput-boolean p6, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->g:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->d:Z

    iget v4, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->e:I

    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    iget-boolean v6, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->g:Z

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;-><init>(Ljava/lang/String;Ljava/lang/String;ZILcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;ZLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_17

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->b:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :cond_0
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 37
    :goto_1
    iget-boolean v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->d:Z

    .line 38
    .line 39
    if-nez v2, :cond_16

    .line 40
    .line 41
    iget v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->e:I

    .line 42
    .line 43
    const/16 v3, 0xa

    .line 44
    .line 45
    const-string v4, ""

    .line 46
    .line 47
    if-nez v2, :cond_e

    .line 48
    .line 49
    iget-object v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 50
    .line 51
    iget-boolean v5, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->g:Z

    .line 52
    .line 53
    if-eqz v5, :cond_8

    .line 54
    .line 55
    new-instance v5, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;

    .line 56
    .line 57
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->b:Ljava/lang/String;

    .line 58
    .line 59
    if-nez v6, :cond_3

    .line 60
    .line 61
    move-object v6, v4

    .line 62
    :cond_3
    iget-object v7, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    .line 63
    .line 64
    if-nez v7, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-object v4, v7

    .line 68
    :goto_2
    invoke-direct {v5, v6, v4}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 72
    .line 73
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 78
    .line 79
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4}, Ls6/l0;->l()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    new-instance v9, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_6

    .line 105
    .line 106
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 111
    .line 112
    instance-of v7, v4, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;

    .line 113
    .line 114
    if-eqz v7, :cond_5

    .line 115
    .line 116
    move-object v4, v5

    .line 117
    :cond_5
    invoke-interface {v9, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    if-eqz v1, :cond_7

    .line 122
    .line 123
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialJoinedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    :cond_7
    move-object/from16 v18, v5

    .line 128
    .line 129
    const/16 v22, 0x77fb

    .line 130
    .line 131
    const/16 v23, 0x0

    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v12, 0x0

    .line 138
    const/4 v13, 0x0

    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x0

    .line 141
    const/16 v16, 0x0

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    const/16 v19, 0x0

    .line 146
    .line 147
    const/16 v20, 0x0

    .line 148
    .line 149
    const/16 v21, 0x0

    .line 150
    .line 151
    invoke-static/range {v6 .. v23}, Ls6/l0;->b(Ls6/l0;Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILjava/lang/Object;)Ls6/l0;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    goto :goto_6

    .line 156
    :cond_8
    new-instance v5, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;

    .line 157
    .line 158
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->b:Ljava/lang/String;

    .line 159
    .line 160
    if-nez v6, :cond_9

    .line 161
    .line 162
    move-object v6, v4

    .line 163
    :cond_9
    iget-object v7, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    .line 164
    .line 165
    if-nez v7, :cond_a

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_a
    move-object v4, v7

    .line 169
    :goto_4
    invoke-direct {v5, v6, v4}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 173
    .line 174
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 179
    .line 180
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {v4}, Ls6/l0;->p()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    new-instance v8, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_c

    .line 206
    .line 207
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 212
    .line 213
    instance-of v7, v4, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;

    .line 214
    .line 215
    if-eqz v7, :cond_b

    .line 216
    .line 217
    move-object v4, v5

    .line 218
    :cond_b
    invoke-interface {v8, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_c
    if-eqz v1, :cond_d

    .line 223
    .line 224
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialUpdatedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    :cond_d
    move-object/from16 v19, v5

    .line 229
    .line 230
    const/16 v22, 0x6ffd

    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    const/4 v7, 0x0

    .line 235
    const/4 v9, 0x0

    .line 236
    const/4 v10, 0x0

    .line 237
    const/4 v11, 0x0

    .line 238
    const/4 v12, 0x0

    .line 239
    const/4 v13, 0x0

    .line 240
    const/4 v14, 0x0

    .line 241
    const/4 v15, 0x0

    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const/16 v18, 0x0

    .line 247
    .line 248
    const/16 v20, 0x0

    .line 249
    .line 250
    const/16 v21, 0x0

    .line 251
    .line 252
    invoke-static/range {v6 .. v23}, Ls6/l0;->b(Ls6/l0;Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILjava/lang/Object;)Ls6/l0;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    :goto_6
    invoke-static {v2, v1}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->e(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Ls6/l0;)V

    .line 257
    .line 258
    .line 259
    goto/16 :goto_a

    .line 260
    .line 261
    :cond_e
    new-instance v2, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    .line 262
    .line 263
    iget-object v5, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->b:Ljava/lang/String;

    .line 264
    .line 265
    if-nez v5, :cond_f

    .line 266
    .line 267
    move-object v5, v4

    .line 268
    :cond_f
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    .line 269
    .line 270
    if-nez v6, :cond_10

    .line 271
    .line 272
    move-object v6, v4

    .line 273
    :cond_10
    invoke-direct {v2, v5, v6}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iget-object v5, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 277
    .line 278
    invoke-virtual {v5}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    iget-object v7, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->f:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 283
    .line 284
    invoke-virtual {v7}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-virtual {v7}, Ls6/l0;->k()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    iget-object v8, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->b:Ljava/lang/String;

    .line 293
    .line 294
    iget-object v9, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1;->c:Ljava/lang/String;

    .line 295
    .line 296
    new-instance v10, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-static {v7, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    if-eqz v7, :cond_14

    .line 314
    .line 315
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    check-cast v7, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 320
    .line 321
    instance-of v11, v7, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    .line 322
    .line 323
    if-eqz v11, :cond_13

    .line 324
    .line 325
    new-instance v7, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    .line 326
    .line 327
    if-nez v8, :cond_11

    .line 328
    .line 329
    move-object v11, v4

    .line 330
    goto :goto_8

    .line 331
    :cond_11
    move-object v11, v8

    .line 332
    :goto_8
    if-nez v9, :cond_12

    .line 333
    .line 334
    move-object v12, v4

    .line 335
    goto :goto_9

    .line 336
    :cond_12
    move-object v12, v9

    .line 337
    :goto_9
    invoke-direct {v7, v11, v12}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :cond_13
    invoke-interface {v10, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_14
    if-eqz v1, :cond_15

    .line 345
    .line 346
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialFavoriteTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    :cond_15
    move-object/from16 v20, v2

    .line 351
    .line 352
    const/16 v22, 0x5ff7

    .line 353
    .line 354
    const/16 v23, 0x0

    .line 355
    .line 356
    const/4 v7, 0x0

    .line 357
    const/4 v8, 0x0

    .line 358
    const/4 v9, 0x0

    .line 359
    const/4 v11, 0x0

    .line 360
    const/4 v12, 0x0

    .line 361
    const/4 v13, 0x0

    .line 362
    const/4 v14, 0x0

    .line 363
    const/4 v15, 0x0

    .line 364
    const/16 v16, 0x0

    .line 365
    .line 366
    const/16 v17, 0x0

    .line 367
    .line 368
    const/16 v18, 0x0

    .line 369
    .line 370
    const/16 v19, 0x0

    .line 371
    .line 372
    const/16 v21, 0x0

    .line 373
    .line 374
    invoke-static/range {v6 .. v23}, Ls6/l0;->b(Ls6/l0;Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILjava/lang/Object;)Ls6/l0;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-static {v5, v1}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->e(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Ls6/l0;)V

    .line 379
    .line 380
    .line 381
    :cond_16
    :goto_a
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 382
    .line 383
    return-object v1

    .line 384
    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 385
    .line 386
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 387
    .line 388
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v1
.end method
