.class public final Lm4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm4/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lm4/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm4/b;->a:Lm4/b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final C(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "$boardEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageRouter$PageRouter;->o()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "pageInfoList"

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "[SourceLoad]:loadRecord-> page:"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const-string v0, "it.name"

    .line 71
    .line 72
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/16 v9, 0x1c

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    const-wide/16 v3, 0x0

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/PageEntity;-><init>(JLjava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lm4/b;->a:Lm4/b;

    .line 87
    .line 88
    invoke-virtual {v0, p2, v2}, Lm4/b;->A(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->a()Lio/objectbox/relation/ToOne;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0, p1}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->i()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->c()Lio/objectbox/relation/ToMany;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->d()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lm4/b;->C(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "dir"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "pageEntity"

    .line 11
    .line 12
    move-object/from16 v3, p2

    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ljava/io/File;

    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "pagePath"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lm4/b;->l(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 40
    .line 41
    const-wide/16 v5, 0x0

    .line 42
    .line 43
    invoke-direct {v4, v5, v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;-><init>(J)V

    .line 44
    .line 45
    .line 46
    sget-object v5, Lm4/b;->a:Lm4/b;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->E()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    const-string v7, "commandRecordList"

    .line 53
    .line 54
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v1, v4, v6}, Lm4/b;->r(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->Q()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    const-string v7, "touchSourceRecordList"

    .line 65
    .line 66
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v1, v4, v6}, Lm4/b;->H(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->M()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    const-string v7, "matrixSourceRecordList"

    .line 77
    .line 78
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v1, v4, v6}, Lm4/b;->z(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->I()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    const-string v7, "fileSourceRecordList"

    .line 89
    .line 90
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v1, v4, v6}, Lm4/b;->t(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->O()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    const-string v7, "textSourceRecordList"

    .line 101
    .line 102
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v1, v4, v6}, Lm4/b;->E(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->K()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    const-string v7, "geometrySourceRecordList"

    .line 113
    .line 114
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v1, v4, v6}, Lm4/b;->w(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->C()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const-string v6, "audioRecordList"

    .line 125
    .line 126
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v1, v4, v2}, Lm4/b;->p(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->j()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2, v4}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Lm4/b;->i(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Header;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 147
    .line 148
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->getCreateDate()J

    .line 161
    .line 162
    .line 163
    move-result-wide v12

    .line 164
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->getUpdateDate()J

    .line 165
    .line 166
    .line 167
    move-result-wide v14

    .line 168
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->I()J

    .line 169
    .line 170
    .line 171
    move-result-wide v16

    .line 172
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->D()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-string v4, "this.convertUrl"

    .line 177
    .line 178
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->E()I

    .line 182
    .line 183
    .line 184
    move-result v19

    .line 185
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->J()I

    .line 186
    .line 187
    .line 188
    move-result v20

    .line 189
    const-wide/16 v7, 0x0

    .line 190
    .line 191
    move-object/from16 v18, v2

    .line 192
    .line 193
    invoke-direct/range {v6 .. v20}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;-><init>(JIIIJJJLjava/lang/String;II)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->C()Lcom/zykj/board/EzyHeader$Author;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const-string v4, "this.author"

    .line 201
    .line 202
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5, v2}, Lm4/b;->b(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->h()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->a()Lio/objectbox/relation/ToOne;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->L()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    const-string v4, "moveConfig"

    .line 224
    .line 225
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5, v2}, Lm4/b;->d(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->i()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->k()Lio/objectbox/relation/ToOne;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->F()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const-string v4, "defaultBackgroundLineConfig"

    .line 247
    .line 248
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v2}, Lm4/b;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->e()Lio/objectbox/relation/ToOne;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->K()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const-string v4, "lastBackgroundLineConfig"

    .line 270
    .line 271
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5, v2}, Lm4/b;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->j()Lio/objectbox/relation/ToOne;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1}, Lcom/zykj/board/EzyHeader$Header;->N()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const-string v2, "this.providerList"

    .line 293
    .line 294
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_0

    .line 306
    .line 307
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Lcom/zykj/board/EzyHeader$Author;

    .line 312
    .line 313
    sget-object v4, Lm4/b;->a:Lm4/b;

    .line 314
    .line 315
    const-string v5, "it"

    .line 316
    .line 317
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v4, v2}, Lm4/b;->b(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->h()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->m()Lio/objectbox/relation/ToMany;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    goto :goto_0

    .line 335
    :cond_0
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-virtual {v1, v6}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    return-void
.end method

.method public final B(Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;
    .locals 4

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "page_router.bin"

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    invoke-direct {v1, v2, v3, p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ljava/io/FileInputStream;

    .line 33
    .line 34
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lcom/zykj/board/EzyPageRouter$PageRouter;->t(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageRouter$PageRouter;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v2, Le5/c;->a:Le5/c;

    .line 42
    .line 43
    invoke-virtual {v2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, Lm4/a;

    .line 48
    .line 49
    invoke-direct {v3, v0, v1, p1}, Lm4/a;-><init>(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->G(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->d()V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0
.end method

.method public final D(Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;Ljava/util/List;)V
    .locals 10

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->v()F

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->u()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->getContent()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    const-string v1, "it.content"

    .line 71
    .line 72
    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-wide/16 v3, 0x0

    .line 76
    .line 77
    invoke-direct/range {v2 .. v9}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;-><init>(JFIFILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 85
    .line 86
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 91
    .line 92
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final E(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "list"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "it.fileName"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "it.validate"

    .line 48
    .line 49
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lm4/b;->a:Lm4/b;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1, v4, v0}, Lm4/b;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource;->q()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v3, "this.textInfoList"

    .line 82
    .line 83
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1, v0}, Lm4/b;->D(Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->e()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->h()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method public final F(Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;Ljava/util/List;)V
    .locals 11

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->s()Lcom/zykj/board/EzyPaint$Paint;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->s()Lcom/zykj/board/EzyPaint$Paint;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->s()Lcom/zykj/board/EzyPaint$Paint;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->t()F

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->s()Lcom/zykj/board/EzyPaint$Paint;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->s()F

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->s()Lcom/zykj/board/EzyPaint$Paint;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->u()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->s()Lcom/zykj/board/EzyPaint$Paint;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->v()F

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;-><init>(JFIFFIF)V

    .line 85
    .line 86
    .line 87
    sget-object v3, Lm4/b;->a:Lm4/b;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const-string v4, "it.touchEventList"

    .line 94
    .line 95
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v2, v1}, Lm4/b;->G(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;Ljava/util/List;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 106
    .line 107
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 112
    .line 113
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final G(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;Ljava/util/List;)V
    .locals 9

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    const-wide/16 v3, 0x0

    .line 47
    .line 48
    invoke-direct/range {v2 .. v8}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;-><init>(JJFF)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 56
    .line 57
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 62
    .line 63
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->h()Lio/objectbox/relation/ToMany;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final H(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "touchSourceRecordList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "it.fileName"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "it.validate"

    .line 48
    .line 49
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lm4/b;->a:Lm4/b;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1, v4, v0}, Lm4/b;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TouchSource;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource;->q()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v3, "this.touchInfoList"

    .line 82
    .line 83
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1, v0}, Lm4/b;->F(Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->e()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method public final b(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;
    .locals 9

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->v()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->u()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->z()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->A()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->getStartTime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->y()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    const-wide/16 v1, 0x0

    .line 36
    .line 37
    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public final c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;
    .locals 9

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->r()I

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->s()F

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->t()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const-string p1, "backgroundLineConfig.lineType"

    .line 16
    .line 17
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/16 v7, 0x10

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    const-wide/16 v1, 0x0

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;-><init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final d(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;
    .locals 10

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->z()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->t()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->y()Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->x()Z

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->w()I

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    const-wide/16 v1, 0x0

    .line 32
    .line 33
    invoke-direct/range {v0 .. v9}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;-><init>(JZZZZZII)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 22
    .line 23
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 24
    .line 25
    invoke-virtual {p1, p2, p3, v0}, Lcom/zykj/blackboard/utils/FileValidateUtils;->c(Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;Ljava/lang/String;Ljava/io/File;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource;->u(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 44
    .line 45
    .line 46
    const-string p1, "record"

    .line 47
    .line 48
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 22
    .line 23
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 24
    .line 25
    invoke-virtual {p1, p2, p3, v0}, Lcom/zykj/blackboard/utils/FileValidateUtils;->c(Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;Ljava/lang/String;Ljava/io/File;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource;->u(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 44
    .line 45
    .line 46
    const-string p1, "record"

    .line 47
    .line 48
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 22
    .line 23
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 24
    .line 25
    invoke-virtual {p1, p2, p3, v0}, Lcom/zykj/blackboard/utils/FileValidateUtils;->c(Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;Ljava/lang/String;Ljava/io/File;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/board/EzySource$FileSource;->u(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$FileSource;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 44
    .line 45
    .line 46
    const-string p1, "record"

    .line 47
    .line 48
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$GeometrySource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 22
    .line 23
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 24
    .line 25
    invoke-virtual {p1, p2, p3, v0}, Lcom/zykj/blackboard/utils/FileValidateUtils;->c(Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;Ljava/lang/String;Ljava/io/File;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/board/EzySource$GeometrySource;->t(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$GeometrySource;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 44
    .line 45
    .line 46
    const-string p1, "record"

    .line 47
    .line 48
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public final i(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Header;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "header.bin"

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/io/FileInputStream;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->V(Ljava/io/InputStream;)Lcom/zykj/board/EzyHeader$Header;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 29
    .line 30
    .line 31
    const-string p1, "header"

    .line 32
    .line 33
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$MatrixSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 22
    .line 23
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 24
    .line 25
    invoke-virtual {p1, p2, p3, v0}, Lcom/zykj/blackboard/utils/FileValidateUtils;->c(Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;Ljava/lang/String;Ljava/io/File;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/board/EzySource$MatrixSource;->t(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$MatrixSource;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 44
    .line 45
    .line 46
    const-string p1, "record"

    .line 47
    .line 48
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public final k(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "page_router.bin"

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/io/FileInputStream;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/board/EzyPageRouter$PageRouter;->t(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageRouter$PageRouter;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 29
    .line 30
    .line 31
    const-string p1, "record"

    .line 32
    .line 33
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final l(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "router.bin"

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/io/FileInputStream;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->U(Ljava/io/InputStream;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 29
    .line 30
    .line 31
    const-string p1, "record"

    .line 32
    .line 33
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 22
    .line 23
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 24
    .line 25
    invoke-virtual {p1, p2, p3, v0}, Lcom/zykj/blackboard/utils/FileValidateUtils;->c(Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;Ljava/lang/String;Ljava/io/File;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/board/EzySource$TextSource;->u(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$TextSource;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 44
    .line 45
    .line 46
    const-string p1, "record"

    .line 47
    .line 48
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TouchSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 22
    .line 23
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->c:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

    .line 24
    .line 25
    invoke-virtual {p1, p2, p3, v0}, Lcom/zykj/blackboard/utils/FileValidateUtils;->c(Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;Ljava/lang/String;Ljava/io/File;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/board/EzySource$TouchSource;->u(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$TouchSource;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 44
    .line 45
    .line 46
    const-string p1, "record"

    .line 47
    .line 48
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public final o(Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;Ljava/util/List;)V
    .locals 12

    .line 1
    const-string v0, "audioRecordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "audioInfoList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->v()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->w()J

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->x()Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->q()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    const-string v3, "it.commandEnum"

    .line 51
    .line 52
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    const-string v1, "it.data.toByteArray()"

    .line 64
    .line 65
    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-wide/16 v3, 0x0

    .line 69
    .line 70
    invoke-direct/range {v2 .. v11}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 78
    .line 79
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-class v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 84
    .line 85
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final p(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "list"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "it.fileName"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "it.validate"

    .line 48
    .line 49
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lm4/b;->a:Lm4/b;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1, v4, v0}, Lm4/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource;->m()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v3, "this.commandInfoList"

    .line 82
    .line 83
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1, v0}, Lm4/b;->o(Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->e()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method public final q(Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;Ljava/util/List;)V
    .locals 12

    .line 1
    const-string v0, "commandRecordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "commandInfoList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->v()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->w()J

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->x()Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->q()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    const-string v3, "it.commandEnum"

    .line 51
    .line 52
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    const-string v1, "it.data.toByteArray()"

    .line 64
    .line 65
    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-wide/16 v3, 0x0

    .line 69
    .line 70
    invoke-direct/range {v2 .. v11}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 78
    .line 79
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-class v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 84
    .line 85
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final r(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sourceCommandRecordList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "it.fileName"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "it.validate"

    .line 48
    .line 49
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lm4/b;->a:Lm4/b;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1, v4, v0}, Lm4/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource;->m()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v3, "this.commandInfoList"

    .line 82
    .line 83
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1, v0}, Lm4/b;->q(Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->e()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method public final s(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;Ljava/util/List;)V
    .locals 9

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-string v3, "it.name"

    .line 39
    .line 40
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->s()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    const-string v1, "it.validate"

    .line 56
    .line 57
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    invoke-direct/range {v2 .. v8}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;-><init>(JLjava/lang/String;IILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 70
    .line 71
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const-class v1, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 76
    .line 77
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final t(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "list"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "it.fileName"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "it.validate"

    .line 48
    .line 49
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lm4/b;->a:Lm4/b;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1, v4, v0}, Lm4/b;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$FileSource;->q()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v3, "this.fileInfoList"

    .line 82
    .line 83
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1, v0}, Lm4/b;->s(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->e()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;Ljava/util/List;)V
    .locals 10

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->v()Lcom/zykj/board/EzyPaint$Paint;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->v()Lcom/zykj/board/EzyPaint$Paint;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->v()Lcom/zykj/board/EzyPaint$Paint;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->v()F

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->v()Lcom/zykj/board/EzyPaint$Paint;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->u()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->u()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    const-wide/16 v3, 0x0

    .line 71
    .line 72
    invoke-direct/range {v2 .. v9}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;-><init>(JFIFII)V

    .line 73
    .line 74
    .line 75
    sget-object v3, Lm4/b;->a:Lm4/b;

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPointsList()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v4, "it.pointsList"

    .line 82
    .line 83
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v2, v1}, Lm4/b;->v(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 94
    .line 95
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    const-class v1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 100
    .line 101
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;Ljava/util/List;)V
    .locals 6

    .line 1
    const-string v0, "geometryInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzyPointF$PointF;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/board/EzyPointF$PointF;->getX()F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v1}, Lcom/zykj/board/EzyPointF$PointF;->getY()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    invoke-direct {v2, v4, v5, v3, v1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;-><init>(JFF)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 52
    .line 53
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const-class v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 58
    .line 59
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->d()Lio/objectbox/relation/ToMany;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final w(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "list"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "it.fileName"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "it.validate"

    .line 48
    .line 49
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lm4/b;->a:Lm4/b;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1, v4, v0}, Lm4/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$GeometrySource;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource;->o()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v3, "this.geometryInfoList"

    .line 82
    .line 83
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1, v0}, Lm4/b;->u(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->e()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->d()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method public final x(Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;Ljava/util/List;)V
    .locals 5

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 31
    .line 32
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 33
    .line 34
    const-wide/16 v3, 0x0

    .line 35
    .line 36
    invoke-direct {v2, v3, v4}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;-><init>(J)V

    .line 37
    .line 38
    .line 39
    sget-object v3, Lm4/b;->a:Lm4/b;

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v4, "it.matrixList"

    .line 46
    .line 47
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2, v1}, Lm4/b;->y(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object p2, Le5/c;->a:Le5/c;

    .line 58
    .line 59
    invoke-virtual {p2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const-class v1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 64
    .line 65
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final y(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;Ljava/util/List;)V
    .locals 18

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "list"

    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 35
    .line 36
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->B()F

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->w()F

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->x()F

    .line 71
    .line 72
    .line 73
    move-result v16

    .line 74
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->y()F

    .line 75
    .line 76
    .line 77
    move-result v17

    .line 78
    const-wide/16 v5, 0x0

    .line 79
    .line 80
    invoke-direct/range {v4 .. v17}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;-><init>(JJFFFFFFFFF)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    sget-object v2, Le5/c;->a:Le5/c;

    .line 88
    .line 89
    invoke-virtual {v2}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const-class v3, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2, v0}, Lq8/a;->m(Ljava/util/Collection;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->b()Lio/objectbox/relation/ToMany;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final z(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrixSourceRecordList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "it.fileName"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "it.validate"

    .line 48
    .line 49
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lm4/b;->a:Lm4/b;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1, v4, v0}, Lm4/b;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$MatrixSource;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$MatrixSource;->o()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v3, "this.matrixInfoList"

    .line 82
    .line 83
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1, v0}, Lm4/b;->x(Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->e()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method
