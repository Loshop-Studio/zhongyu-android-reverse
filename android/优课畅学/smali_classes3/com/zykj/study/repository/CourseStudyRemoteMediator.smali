.class public final Lcom/zykj/study/repository/CourseStudyRemoteMediator;
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
        Lcom/zykj/study/repository/CourseStudyRemoteMediator$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/RemoteMediator<",
        "Ljava/lang/Integer;",
        "Lcom/zykj/study/data/CourseStudyEntity;",
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
    iput-object p1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->a:Lcom/zykj/study/data/AppDatabase;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->b:Lo4/b;

    .line 17
    .line 18
    iput p3, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->c:I

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/repository/CourseStudyRemoteMediator;)Lcom/zykj/study/data/AppDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->a:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;Landroidx/paging/PagingState;Lcom/zykj/study/data/CourseStudyKeyEntity;)V
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
    invoke-virtual {p3, v1}, Lcom/zykj/study/data/CourseStudyKeyEntity;->setNextPage(Ljava/lang/Integer;)V

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
    move-result p1

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
    if-ne p1, p2, :cond_1

    .line 23
    .line 24
    invoke-virtual {p3}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getPageIndex()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p3, p1}, Lcom/zykj/study/data/CourseStudyKeyEntity;->setNextPage(Ljava/lang/Integer;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p3, v1}, Lcom/zykj/study/data/CourseStudyKeyEntity;->setNextPage(Ljava/lang/Integer;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final c(Ljava/util/List;Landroidx/paging/LoadType;Lcom/zykj/study/data/CourseStudyKeyEntity;Lm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->a:Lcom/zykj/study/data/AppDatabase;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;

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
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;-><init>(Landroidx/paging/LoadType;Lcom/zykj/study/repository/CourseStudyRemoteMediator;Lcom/zykj/study/data/CourseStudyKeyEntity;Ljava/util/List;Lm7/c;)V

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
    .locals 8

    .line 1
    instance-of v0, p3, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->g:I

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
    iput v1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;-><init>(Lcom/zykj/study/repository/CourseStudyRemoteMediator;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/util/List;

    .line 47
    .line 48
    iget-object p1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 51
    .line 52
    iget-object p2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p2, Landroidx/paging/PagingState;

    .line 55
    .line 56
    iget-object p2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, Landroidx/paging/LoadType;

    .line 59
    .line 60
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :catch_0
    move-exception p1

    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_2
    iget-object p1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 79
    .line 80
    iget-object p2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Landroidx/paging/PagingState;

    .line 83
    .line 84
    iget-object v2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Landroidx/paging/LoadType;

    .line 87
    .line 88
    :try_start_1
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 89
    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_3
    iget-object p1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 94
    .line 95
    move-object p2, p1

    .line 96
    check-cast p2, Landroidx/paging/PagingState;

    .line 97
    .line 98
    iget-object p1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Landroidx/paging/LoadType;

    .line 101
    .line 102
    :try_start_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :try_start_3
    iget-object p3, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->a:Lcom/zykj/study/data/AppDatabase;

    .line 110
    .line 111
    invoke-virtual {p3}, Lcom/zykj/study/data/AppDatabase;->courseStudyKeyEntityDao()Lcom/zykj/study/data/CourseStudyKeyEntityDao;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    iget v2, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->c:I

    .line 116
    .line 117
    iput-object p1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object p2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 120
    .line 121
    iput v5, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->g:I

    .line 122
    .line 123
    invoke-interface {p3, v2, v0}, Lcom/zykj/study/data/CourseStudyKeyEntityDao;->getKeyById(ILm7/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-ne p3, v1, :cond_5

    .line 128
    .line 129
    goto/16 :goto_4

    .line 130
    .line 131
    :cond_5
    :goto_1
    check-cast p3, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 132
    .line 133
    invoke-virtual {p3, v5}, Lcom/zykj/study/data/CourseStudyKeyEntity;->setPageIndex(I)V

    .line 134
    .line 135
    .line 136
    sget-object v2, Lcom/zykj/study/repository/CourseStudyRemoteMediator$a;->a:[I

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    aget v2, v2, v6

    .line 143
    .line 144
    if-eq v2, v5, :cond_9

    .line 145
    .line 146
    if-eq v2, v4, :cond_8

    .line 147
    .line 148
    if-ne v2, v3, :cond_7

    .line 149
    .line 150
    invoke-virtual {p3}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getNextPage()Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-nez v2, :cond_6

    .line 155
    .line 156
    new-instance p1, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 157
    .line 158
    invoke-direct {p1, v5}, Landroidx/paging/RemoteMediator$MediatorResult$Success;-><init>(Z)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_6
    invoke-virtual {p3}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getNextPage()Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    if-eqz v2, :cond_9

    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    invoke-virtual {p3, v2}, Lcom/zykj/study/data/CourseStudyKeyEntity;->setPageIndex(I)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 177
    .line 178
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_8
    new-instance p1, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 183
    .line 184
    invoke-direct {p1, v5}, Landroidx/paging/RemoteMediator$MediatorResult$Success;-><init>(Z)V

    .line 185
    .line 186
    .line 187
    return-object p1

    .line 188
    :cond_9
    :goto_2
    iget-object v2, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->b:Lo4/b;

    .line 189
    .line 190
    invoke-virtual {p3}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getPageIndex()I

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    iput-object p1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object p2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object p3, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 199
    .line 200
    iput v4, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->g:I

    .line 201
    .line 202
    invoke-interface {v2, v6, v0}, Lo4/b;->d(ILm7/c;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    if-ne v2, v1, :cond_a

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_a
    move-object v7, v2

    .line 210
    move-object v2, p1

    .line 211
    move-object p1, p3

    .line 212
    move-object p3, v7

    .line 213
    :goto_3
    check-cast p3, Ljava/util/List;

    .line 214
    .line 215
    invoke-virtual {p0, p3, p2, p1}, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->b(Ljava/util/List;Landroidx/paging/PagingState;Lcom/zykj/study/data/CourseStudyKeyEntity;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    iput-object v4, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 223
    .line 224
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    iput-object p2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->b:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object p1, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 231
    .line 232
    invoke-static {p3}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    iput-object p2, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->d:Ljava/lang/Object;

    .line 237
    .line 238
    iput v3, v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$load$1;->g:I

    .line 239
    .line 240
    invoke-virtual {p0, p3, v2, p1, v0}, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->c(Ljava/util/List;Landroidx/paging/LoadType;Lcom/zykj/study/data/CourseStudyKeyEntity;Lm7/c;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    if-ne p2, v1, :cond_b

    .line 245
    .line 246
    :goto_4
    return-object v1

    .line 247
    :cond_b
    :goto_5
    new-instance p2, Landroidx/paging/RemoteMediator$MediatorResult$Success;

    .line 248
    .line 249
    invoke-virtual {p1}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getNextPage()Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    if-nez p1, :cond_c

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_c
    const/4 v5, 0x0

    .line 257
    :goto_6
    invoke-direct {p2, v5}, Landroidx/paging/RemoteMediator$MediatorResult$Success;-><init>(Z)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 258
    .line 259
    .line 260
    return-object p2

    .line 261
    :goto_7
    new-instance p2, Landroidx/paging/RemoteMediator$MediatorResult$Error;

    .line 262
    .line 263
    invoke-direct {p2, p1}, Landroidx/paging/RemoteMediator$MediatorResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 264
    .line 265
    .line 266
    return-object p2
.end method
