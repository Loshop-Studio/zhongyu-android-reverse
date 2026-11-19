.class final Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/CourseManageVewModel;->l(JZ)V
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
    c = "com.zykj.study.viewmodels.CourseManageVewModel$setKnowledgeLocked$1"
    f = "CourseManageVewModel.kt"
    l = {
        0x95,
        0x97,
        0x9a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Z

.field public final synthetic c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(ZLcom/zykj/study/viewmodels/CourseManageVewModel;JLm7/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->b:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->d:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->d:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;-><init>(ZLcom/zykj/study/viewmodels/CourseManageVewModel;JLm7/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

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
    iget v2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->a:I

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
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-boolean v2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->b:Z

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    iget-object v2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 45
    .line 46
    invoke-static {v2}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->a(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Lo4/b;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-wide v6, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->d:J

    .line 51
    .line 52
    iput v5, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->a:I

    .line 53
    .line 54
    invoke-interface {v2, v6, v7, v0}, Lo4/b;->z(JLm7/c;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-ne v2, v1, :cond_4

    .line 59
    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_3
    iget-object v2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 63
    .line 64
    invoke-static {v2}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->a(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Lo4/b;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-wide v5, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->d:J

    .line 69
    .line 70
    iput v4, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->a:I

    .line 71
    .line 72
    invoke-interface {v2, v5, v6, v0}, Lo4/b;->c(JLm7/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-ne v2, v1, :cond_4

    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_4
    :goto_0
    iget-object v2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 81
    .line 82
    invoke-static {v2}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->c(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-object v4, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 87
    .line 88
    invoke-static {v4}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->c(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-interface {v4}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Ljava/lang/Iterable;

    .line 97
    .line 98
    iget-wide v5, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->d:J

    .line 99
    .line 100
    iget-boolean v12, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->b:Z

    .line 101
    .line 102
    new-instance v7, Ljava/util/ArrayList;

    .line 103
    .line 104
    const/16 v8, 0xa

    .line 105
    .line 106
    invoke-static {v4, v8}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-eqz v9, :cond_a

    .line 122
    .line 123
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    move-object v13, v9

    .line 128
    check-cast v13, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 129
    .line 130
    invoke-virtual {v13}, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf()Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_5

    .line 135
    .line 136
    invoke-virtual {v13}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getId()J

    .line 137
    .line 138
    .line 139
    move-result-wide v9

    .line 140
    cmp-long v9, v9, v5

    .line 141
    .line 142
    if-nez v9, :cond_5

    .line 143
    .line 144
    const/16 v14, 0x17

    .line 145
    .line 146
    const/4 v15, 0x0

    .line 147
    move v10, v8

    .line 148
    const-wide/16 v8, 0x0

    .line 149
    .line 150
    move v11, v10

    .line 151
    const/4 v10, 0x0

    .line 152
    move/from16 v16, v11

    .line 153
    .line 154
    const/4 v11, 0x0

    .line 155
    move-object/from16 v17, v7

    .line 156
    .line 157
    move-object v7, v13

    .line 158
    const/4 v13, 0x0

    .line 159
    move-object/from16 p1, v4

    .line 160
    .line 161
    move/from16 v4, v16

    .line 162
    .line 163
    move-object/from16 v3, v17

    .line 164
    .line 165
    invoke-static/range {v7 .. v15}, Lcom/zykj/study/bean/course/CatalogLockedBean;->copy$default(Lcom/zykj/study/bean/course/CatalogLockedBean;JLjava/lang/String;ZILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    goto/16 :goto_5

    .line 170
    .line 171
    :cond_5
    move-object/from16 p1, v4

    .line 172
    .line 173
    move-object v3, v7

    .line 174
    move v4, v8

    .line 175
    move-object/from16 v16, v13

    .line 176
    .line 177
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-nez v7, :cond_9

    .line 182
    .line 183
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getChildren()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    if-eqz v7, :cond_8

    .line 188
    .line 189
    new-instance v8, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-static {v7, v4}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v17

    .line 202
    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-eqz v7, :cond_7

    .line 207
    .line 208
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    check-cast v7, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 213
    .line 214
    invoke-virtual {v7}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getId()J

    .line 215
    .line 216
    .line 217
    move-result-wide v9

    .line 218
    cmp-long v9, v9, v5

    .line 219
    .line 220
    if-nez v9, :cond_6

    .line 221
    .line 222
    const/16 v14, 0x17

    .line 223
    .line 224
    const/4 v15, 0x0

    .line 225
    move-object v10, v8

    .line 226
    const-wide/16 v8, 0x0

    .line 227
    .line 228
    move-object v11, v10

    .line 229
    const/4 v10, 0x0

    .line 230
    move-object v13, v11

    .line 231
    const/4 v11, 0x0

    .line 232
    move-object/from16 v18, v13

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    move-object/from16 v4, v18

    .line 236
    .line 237
    invoke-static/range {v7 .. v15}, Lcom/zykj/study/bean/course/CatalogLockedBean;->copy$default(Lcom/zykj/study/bean/course/CatalogLockedBean;JLjava/lang/String;ZILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    goto :goto_3

    .line 242
    :cond_6
    move-object v4, v8

    .line 243
    :goto_3
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-object v8, v4

    .line 247
    const/16 v4, 0xa

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_7
    move-object v4, v8

    .line 251
    move-object/from16 v19, v4

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_8
    const/4 v8, 0x0

    .line 255
    move-object/from16 v19, v8

    .line 256
    .line 257
    :goto_4
    const/16 v20, 0xf

    .line 258
    .line 259
    const/16 v21, 0x0

    .line 260
    .line 261
    const-wide/16 v14, 0x0

    .line 262
    .line 263
    move-object/from16 v7, v16

    .line 264
    .line 265
    const/16 v16, 0x0

    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    const/16 v18, 0x0

    .line 270
    .line 271
    move-object v13, v7

    .line 272
    invoke-static/range {v13 .. v21}, Lcom/zykj/study/bean/course/CatalogLockedBean;->copy$default(Lcom/zykj/study/bean/course/CatalogLockedBean;JLjava/lang/String;ZILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    goto :goto_5

    .line 277
    :cond_9
    move-object/from16 v7, v16

    .line 278
    .line 279
    move-object v13, v7

    .line 280
    :goto_5
    invoke-interface {v3, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-object/from16 v4, p1

    .line 284
    .line 285
    move-object v7, v3

    .line 286
    const/4 v3, 0x3

    .line 287
    const/16 v8, 0xa

    .line 288
    .line 289
    goto/16 :goto_1

    .line 290
    .line 291
    :cond_a
    move v4, v3

    .line 292
    move-object v3, v7

    .line 293
    iput v4, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1;->a:I

    .line 294
    .line 295
    invoke-interface {v2, v3, v0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    if-ne v2, v1, :cond_b

    .line 300
    .line 301
    :goto_6
    return-object v1

    .line 302
    :cond_b
    :goto_7
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 303
    .line 304
    return-object v1
.end method
