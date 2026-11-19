.class public final Lcom/zykj/study/repository/PageKeyedRemoteMediator;
.super Landroidx/paging/RemoteMediator;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/paging/ExperimentalPagingApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/repository/PageKeyedRemoteMediator$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/RemoteMediator<",
        "Ljava/lang/Integer;",
        "Lcom/zykj/study/data/MyCourseEntity;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/data/AppDatabase;

.field public final b:Lo4/b;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/data/AppDatabase;Lo4/b;I)V
    .locals 1

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "api"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/paging/RemoteMediator;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->a:Lcom/zykj/study/data/AppDatabase;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->b:Lo4/b;

    .line 17
    .line 18
    iput p3, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->c:I

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/repository/PageKeyedRemoteMediator;)Lcom/zykj/study/data/AppDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->a:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;Landroidx/paging/PagingState;Lcom/zykj/study/data/MyCourseKeyEntity;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p3, v1}, Lcom/zykj/study/data/MyCourseKeyEntity;->setNextStartId(Ljava/lang/Integer;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p2}, Landroidx/paging/PagingState;->getConfig()Landroidx/paging/PagingConfig;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget p2, p2, Landroidx/paging/PagingConfig;->pageSize:I

    .line 21
    .line 22
    if-ne v0, p2, :cond_1

    .line 23
    .line 24
    invoke-static {p1}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/zykj/study/data/MyCourseEntity;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p3, p1}, Lcom/zykj/study/data/MyCourseKeyEntity;->setNextStartId(Ljava/lang/Integer;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {p3, v1}, Lcom/zykj/study/data/MyCourseKeyEntity;->setNextStartId(Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final c(Ljava/util/List;Landroidx/paging/LoadType;Lcom/zykj/study/data/MyCourseKeyEntity;Lm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->a:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v3, p0

    .line 7
    move-object v5, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v4, p3

    .line 10
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;-><init>(Landroidx/paging/LoadType;Lcom/zykj/study/repository/PageKeyedRemoteMediator;Lcom/zykj/study/data/MyCourseKeyEntity;Ljava/util/List;Lm7/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p4}, Landroidx/room/RoomDatabaseKt;->withTransaction(Landroidx/room/RoomDatabase;Lx7/l;Lm7/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 25
    .line 26
    return-object p1
.end method

.method public load(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lm7/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;-><init>(Lcom/zykj/study/repository/PageKeyedRemoteMediator;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/List;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 52
    .line 53
    iget-object p2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p2, Landroidx/paging/PagingState;

    .line 56
    .line 57
    iget-object p2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroidx/paging/LoadType;

    .line 60
    .line 61
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :catch_0
    move-exception p1

    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_2
    iget-object p1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 80
    .line 81
    iget-object p2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Landroidx/paging/PagingState;

    .line 84
    .line 85
    iget-object v2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Landroidx/paging/LoadType;

    .line 88
    .line 89
    :try_start_1
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    .line 91
    .line 92
    goto/16 :goto_3

    .line 93
    .line 94
    :cond_3
    iget-object p1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 95
    .line 96
    move-object p2, p1

    .line 97
    check-cast p2, Landroidx/paging/PagingState;

    .line 98
    .line 99
    iget-object p1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Landroidx/paging/LoadType;

    .line 102
    .line 103
    :try_start_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :try_start_3
    iget-object p3, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->a:Lcom/zykj/study/data/AppDatabase;

    .line 111
    .line 112
    invoke-virtual {p3}, Lcom/zykj/study/data/AppDatabase;->myCourseKeyEntityDao()Lcom/zykj/study/data/MyCourseKeyEntityDao;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    iget v2, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->c:I

    .line 117
    .line 118
    iput-object p1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 121
    .line 122
    iput v6, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->g:I

    .line 123
    .line 124
    invoke-interface {p3, v2, v0}, Lcom/zykj/study/data/MyCourseKeyEntityDao;->getKeyById(ILm7/c;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    if-ne p3, v1, :cond_5

    .line 129
    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :cond_5
    :goto_1
    check-cast p3, Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 133
    .line 134
    invoke-virtual {p3, v3}, Lcom/zykj/study/data/MyCourseKeyEntity;->setStartId(I)V

    .line 135
    .line 136
    .line 137
    sget-object v2, Lcom/zykj/study/repository/PageKeyedRemoteMediator$a;->a:[I

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    aget v2, v2, v7

    .line 144
    .line 145
    if-eq v2, v6, :cond_9

    .line 146
    .line 147
    if-eq v2, v5, :cond_8

    .line 148
    .line 149
    if-ne v2, v4, :cond_7

    .line 150
    .line 151
    invoke-virtual {p3}, Lcom/zykj/study/data/MyCourseKeyEntity;->getNextStartId()Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-nez v2, :cond_6

    .line 156
    .line 157
    new-instance p1, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 158
    .line 159
    invoke-direct {p1, v6}, Landroidx/paging/RemoteMediator$MediatorResult$Success;-><init>(Z)V

    .line 160
    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_6
    invoke-virtual {p3}, Lcom/zykj/study/data/MyCourseKeyEntity;->getNextStartId()Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    if-eqz v2, :cond_9

    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    invoke-virtual {p3, v2}, Lcom/zykj/study/data/MyCourseKeyEntity;->setStartId(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 178
    .line 179
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_8
    new-instance p1, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 184
    .line 185
    invoke-direct {p1, v6}, Landroidx/paging/RemoteMediator$MediatorResult$Success;-><init>(Z)V

    .line 186
    .line 187
    .line 188
    return-object p1

    .line 189
    :cond_9
    :goto_2
    iget-object v2, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->b:Lo4/b;

    .line 190
    .line 191
    new-instance v7, Lcom/zykj/study/bean/Paging;

    .line 192
    .line 193
    invoke-virtual {p3}, Lcom/zykj/study/data/MyCourseKeyEntity;->getStartId()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    invoke-virtual {p3}, Lcom/zykj/study/data/MyCourseKeyEntity;->getTake()I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    invoke-direct {v7, v8, v9}, Lcom/zykj/study/bean/Paging;-><init>(II)V

    .line 202
    .line 203
    .line 204
    iput-object p1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object p2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object p3, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 209
    .line 210
    iput v5, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->g:I

    .line 211
    .line 212
    invoke-interface {v2, v7, v0}, Lo4/b;->i(Lcom/zykj/study/bean/Paging;Lm7/c;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    if-ne v2, v1, :cond_a

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_a
    move-object v10, v2

    .line 220
    move-object v2, p1

    .line 221
    move-object p1, p3

    .line 222
    move-object p3, v10

    .line 223
    :goto_3
    check-cast p3, Ljava/util/List;

    .line 224
    .line 225
    invoke-virtual {p0, p3, p2, p1}, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->b(Ljava/util/List;Landroidx/paging/PagingState;Lcom/zykj/study/data/MyCourseKeyEntity;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    iput-object v5, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 233
    .line 234
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    iput-object p2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object p1, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 241
    .line 242
    invoke-static {p3}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    iput-object p2, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->d:Ljava/lang/Object;

    .line 247
    .line 248
    iput v4, v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$load$1;->g:I

    .line 249
    .line 250
    invoke-virtual {p0, p3, v2, p1, v0}, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->c(Ljava/util/List;Landroidx/paging/LoadType;Lcom/zykj/study/data/MyCourseKeyEntity;Lm7/c;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    if-ne p2, v1, :cond_b

    .line 255
    .line 256
    :goto_4
    return-object v1

    .line 257
    :cond_b
    :goto_5
    new-instance p2, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 258
    .line 259
    invoke-virtual {p1}, Lcom/zykj/study/data/MyCourseKeyEntity;->getNextStartId()Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    if-nez p1, :cond_c

    .line 264
    .line 265
    move v3, v6

    .line 266
    :cond_c
    invoke-direct {p2, v3}, Landroidx/paging/RemoteMediator$MediatorResult$Success;-><init>(Z)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 267
    .line 268
    .line 269
    return-object p2

    .line 270
    :goto_6
    new-instance p2, Landroidx/paging/RemoteMediator$MediatorResult$Error;

    .line 271
    .line 272
    invoke-direct {p2, p1}, Landroidx/paging/RemoteMediator$MediatorResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    return-object p2
.end method
