.class final Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/CourseManageVewModel;->j(JZ)V
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
    c = "com.zykj.study.viewmodels.CourseManageVewModel$setChapterLocked$1"
    f = "CourseManageVewModel.kt"
    l = {
        0x7c,
        0x7e,
        0x81
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Z

.field public final synthetic f:J


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;Ljava/util/List;ZJLm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->d:Ljava/util/List;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->e:Z

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->f:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->d:Ljava/util/List;

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->e:Z

    .line 8
    .line 9
    iget-wide v4, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->f:J

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;-><init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;Ljava/util/List;ZJLm7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->b:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v5, :cond_1

    .line 15
    .line 16
    if-eq v2, v4, :cond_1

    .line 17
    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    iget-object v1, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lcom/zykj/study/bean/course/BatchCatalogReq;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    iget-object v2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lcom/zykj/study/bean/course/BatchCatalogReq;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Lcom/zykj/study/bean/course/BatchCatalogReq;

    .line 49
    .line 50
    iget-object v6, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 51
    .line 52
    invoke-static {v6}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->b(Lcom/zykj/study/viewmodels/CourseManageVewModel;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    iget-object v8, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->d:Ljava/util/List;

    .line 57
    .line 58
    invoke-direct {v2, v6, v7, v8}, Lcom/zykj/study/bean/course/BatchCatalogReq;-><init>(JLjava/util/List;)V

    .line 59
    .line 60
    .line 61
    iget-boolean v6, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->e:Z

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    iget-object v4, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 66
    .line 67
    invoke-static {v4}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->a(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Lo4/b;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    iput-object v6, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iput v5, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->b:I

    .line 78
    .line 79
    invoke-interface {v4, v2, v0}, Lo4/b;->f(Lcom/zykj/study/bean/course/BatchCatalogReq;Lm7/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-ne v4, v1, :cond_4

    .line 84
    .line 85
    goto/16 :goto_5

    .line 86
    .line 87
    :cond_3
    iget-object v5, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 88
    .line 89
    invoke-static {v5}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->a(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Lo4/b;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iput-object v6, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->a:Ljava/lang/Object;

    .line 98
    .line 99
    iput v4, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->b:I

    .line 100
    .line 101
    invoke-interface {v5, v2, v0}, Lo4/b;->o(Lcom/zykj/study/bean/course/BatchCatalogReq;Lm7/c;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-ne v4, v1, :cond_4

    .line 106
    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :cond_4
    :goto_0
    iget-object v4, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 110
    .line 111
    invoke-static {v4}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->c(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    iget-object v5, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 116
    .line 117
    invoke-static {v5}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->c(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-interface {v5}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Ljava/lang/Iterable;

    .line 126
    .line 127
    iget-wide v6, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->f:J

    .line 128
    .line 129
    iget-boolean v13, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->e:Z

    .line 130
    .line 131
    new-instance v8, Ljava/util/ArrayList;

    .line 132
    .line 133
    const/16 v9, 0xa

    .line 134
    .line 135
    invoke-static {v5, v9}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-eqz v10, :cond_8

    .line 151
    .line 152
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    move-object/from16 v17, v10

    .line 157
    .line 158
    check-cast v17, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 159
    .line 160
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getChildren()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    if-eqz v10, :cond_7

    .line 165
    .line 166
    new-instance v11, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-static {v10, v9}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v18

    .line 179
    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-eqz v10, :cond_6

    .line 184
    .line 185
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    check-cast v10, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 190
    .line 191
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getId()J

    .line 192
    .line 193
    .line 194
    move-result-wide v14

    .line 195
    cmp-long v12, v14, v6

    .line 196
    .line 197
    if-nez v12, :cond_5

    .line 198
    .line 199
    const/16 v15, 0x17

    .line 200
    .line 201
    const/16 v16, 0x0

    .line 202
    .line 203
    move-object v12, v8

    .line 204
    move v14, v9

    .line 205
    move-object v8, v10

    .line 206
    const-wide/16 v9, 0x0

    .line 207
    .line 208
    move-object/from16 v19, v11

    .line 209
    .line 210
    const/4 v11, 0x0

    .line 211
    move-object/from16 v20, v12

    .line 212
    .line 213
    const/4 v12, 0x0

    .line 214
    move/from16 v21, v14

    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    move-object/from16 p1, v2

    .line 218
    .line 219
    move-object/from16 v3, v19

    .line 220
    .line 221
    move-object/from16 v2, v20

    .line 222
    .line 223
    move/from16 v23, v21

    .line 224
    .line 225
    invoke-static/range {v8 .. v16}, Lcom/zykj/study/bean/course/CatalogLockedBean;->copy$default(Lcom/zykj/study/bean/course/CatalogLockedBean;JLjava/lang/String;ZILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    goto :goto_3

    .line 230
    :cond_5
    move-object/from16 p1, v2

    .line 231
    .line 232
    move-object v2, v8

    .line 233
    move/from16 v23, v9

    .line 234
    .line 235
    move-object v8, v10

    .line 236
    move-object v3, v11

    .line 237
    :goto_3
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-object v8, v2

    .line 241
    move-object v11, v3

    .line 242
    move/from16 v9, v23

    .line 243
    .line 244
    const/4 v3, 0x3

    .line 245
    move-object/from16 v2, p1

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_6
    move-object/from16 p1, v2

    .line 249
    .line 250
    move-object v2, v8

    .line 251
    move/from16 v23, v9

    .line 252
    .line 253
    move-object v3, v11

    .line 254
    move-object/from16 v20, v3

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_7
    move-object/from16 p1, v2

    .line 258
    .line 259
    move-object v2, v8

    .line 260
    move/from16 v23, v9

    .line 261
    .line 262
    const/4 v11, 0x0

    .line 263
    move-object/from16 v20, v11

    .line 264
    .line 265
    :goto_4
    const/16 v21, 0xf

    .line 266
    .line 267
    const/16 v22, 0x0

    .line 268
    .line 269
    const-wide/16 v15, 0x0

    .line 270
    .line 271
    move-object/from16 v14, v17

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    const/16 v18, 0x0

    .line 276
    .line 277
    const/16 v19, 0x0

    .line 278
    .line 279
    invoke-static/range {v14 .. v22}, Lcom/zykj/study/bean/course/CatalogLockedBean;->copy$default(Lcom/zykj/study/bean/course/CatalogLockedBean;JLjava/lang/String;ZILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-object v8, v2

    .line 287
    move/from16 v9, v23

    .line 288
    .line 289
    const/4 v3, 0x3

    .line 290
    move-object/from16 v2, p1

    .line 291
    .line 292
    goto/16 :goto_1

    .line 293
    .line 294
    :cond_8
    move-object/from16 p1, v2

    .line 295
    .line 296
    move-object v2, v8

    .line 297
    invoke-static/range {p1 .. p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    iput-object v3, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->a:Ljava/lang/Object;

    .line 302
    .line 303
    const/4 v3, 0x3

    .line 304
    iput v3, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1;->b:I

    .line 305
    .line 306
    invoke-interface {v4, v2, v0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    if-ne v2, v1, :cond_9

    .line 311
    .line 312
    :goto_5
    return-object v1

    .line 313
    :cond_9
    :goto_6
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 314
    .line 315
    return-object v1
.end method
