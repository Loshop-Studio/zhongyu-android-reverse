.class final Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->g(Lcom/zykj/study/bean/exercise/AuthorizeLesson;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$deauthorizeMember$1"
    f = "AuthorizedLessonViewModel.kt"
    l = {
        0x73,
        0x92
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

.field public final synthetic c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lcom/zykj/study/bean/exercise/AuthorizeLesson;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;-><init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lcom/zykj/study/bean/exercise/AuthorizeLesson;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<com.zykj.study.bean.exercise.AuthorizeLesson>"

    .line 4
    .line 5
    const-string v2, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>"

    .line 6
    .line 7
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget v4, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->a:I

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x1

    .line 15
    if-eqz v4, :cond_2

    .line 16
    .line 17
    if-eq v4, v6, :cond_1

    .line 18
    .line 19
    if-ne v4, v5, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v4, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 42
    .line 43
    invoke-static {v4}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->a(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Lt4/a;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v7, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 48
    .line 49
    invoke-virtual {v7}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getUserId()I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    iget-object v8, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 54
    .line 55
    invoke-virtual {v8}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->l()I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    iput v6, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->a:I

    .line 60
    .line 61
    invoke-virtual {v4, v7, v8, v0}, Lt4/a;->b(IILm7/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-ne v4, v3, :cond_3

    .line 66
    .line 67
    goto/16 :goto_4

    .line 68
    .line 69
    :cond_3
    :goto_0
    iget-object v4, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 70
    .line 71
    invoke-static {v4}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->b(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-interface {v4}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Lcom/zykj/study/bean/UiState;

    .line 80
    .line 81
    iget-object v7, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 82
    .line 83
    iget-object v8, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    :try_start_0
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    move-object v10, v4

    .line 90
    check-cast v10, Lcom/zykj/study/bean/UiState$Success;

    .line 91
    .line 92
    check-cast v4, Lcom/zykj/study/bean/UiState$Success;

    .line 93
    .line 94
    invoke-virtual {v4}, Lcom/zykj/study/bean/UiState$Success;->getT()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-eqz v4, :cond_8

    .line 99
    .line 100
    check-cast v4, Ljava/util/List;

    .line 101
    .line 102
    new-instance v10, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-eqz v11, :cond_5

    .line 116
    .line 117
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    move-object v12, v11

    .line 122
    check-cast v12, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 123
    .line 124
    invoke-virtual {v12}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getUserId()I

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    invoke-virtual {v8}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getUserId()I

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-ne v12, v13, :cond_4

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    move-object v11, v9

    .line 136
    :goto_1
    check-cast v11, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 137
    .line 138
    if-eqz v11, :cond_6

    .line 139
    .line 140
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    :cond_6
    invoke-static {v7}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->b(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    :cond_7
    invoke-interface {v4}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    move-object v8, v7

    .line 156
    check-cast v8, Lcom/zykj/study/bean/UiState;

    .line 157
    .line 158
    new-instance v8, Lcom/zykj/study/bean/UiState$Success;

    .line 159
    .line 160
    invoke-direct {v8, v10}, Lcom/zykj/study/bean/UiState$Success;-><init>(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v4, v7, v8}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_7

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_8
    new-instance v4, Ljava/lang/NullPointerException;

    .line 171
    .line 172
    invoke-direct {v4, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v4
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    :catch_0
    :goto_2
    iget-object v4, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 177
    .line 178
    invoke-static {v4}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->e(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-interface {v4}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    check-cast v4, Lcom/zykj/study/bean/UiState;

    .line 187
    .line 188
    iget-object v7, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 189
    .line 190
    iget-object v8, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 191
    .line 192
    :try_start_1
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    move-object v2, v4

    .line 196
    check-cast v2, Lcom/zykj/study/bean/UiState$Success;

    .line 197
    .line 198
    check-cast v4, Lcom/zykj/study/bean/UiState$Success;

    .line 199
    .line 200
    invoke-virtual {v4}, Lcom/zykj/study/bean/UiState$Success;->getT()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    if-eqz v2, :cond_c

    .line 205
    .line 206
    check-cast v2, Ljava/util/List;

    .line 207
    .line 208
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_a

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    move-object v10, v4

    .line 223
    check-cast v10, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 224
    .line 225
    invoke-virtual {v8}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getName()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    invoke-virtual {v10}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getName()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    invoke-static {v11, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    if-eqz v10, :cond_9

    .line 238
    .line 239
    move-object v9, v4

    .line 240
    :cond_a
    move-object v10, v9

    .line 241
    check-cast v10, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 242
    .line 243
    if-eqz v10, :cond_d

    .line 244
    .line 245
    invoke-interface {v2, v10}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    new-instance v4, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v10}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    invoke-virtual {v10}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getUserName()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    invoke-virtual {v10}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getCreateTime()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    const/16 v16, 0x10

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const/4 v14, 0x0

    .line 271
    const/4 v15, 0x0

    .line 272
    invoke-static/range {v10 .. v17}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->copy$default(Lcom/zykj/study/bean/exercise/AuthorizeLesson;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/Object;)Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {v4, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    invoke-static {v7}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->e(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    :cond_b
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    move-object v7, v2

    .line 288
    check-cast v7, Lcom/zykj/study/bean/UiState;

    .line 289
    .line 290
    new-instance v7, Lcom/zykj/study/bean/UiState$Success;

    .line 291
    .line 292
    invoke-direct {v7, v4}, Lcom/zykj/study/bean/UiState$Success;-><init>(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v1, v2, v7}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_b

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_c
    new-instance v2, Ljava/lang/NullPointerException;

    .line 303
    .line 304
    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw v2
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 308
    :catch_1
    :cond_d
    :goto_3
    iget-object v1, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 309
    .line 310
    invoke-static {v1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->d(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/g;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    new-instance v2, Lcom/zykj/study/bean/UiState$Success;

    .line 315
    .line 316
    invoke-static {v6}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    invoke-direct {v2, v4}, Lcom/zykj/study/bean/UiState$Success;-><init>(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iput v5, v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1;->a:I

    .line 324
    .line 325
    invoke-interface {v1, v2, v0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    if-ne v1, v3, :cond_e

    .line 330
    .line 331
    :goto_4
    return-object v3

    .line 332
    :cond_e
    :goto_5
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 333
    .line 334
    return-object v1
.end method
