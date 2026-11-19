.class public final Lu5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu5/d;

.field public static b:Lio/objectbox/BoxStore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu5/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lu5/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu5/d;->a:Lu5/d;

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

.method public static synthetic a(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lu5/d;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lu5/d;Ljava/lang/String;Landroid/content/Context;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lu5/d;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final d(Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "$dirName"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu5/d;->a:Lu5/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lb8/a;->n()Lio/objectbox/query/QueryBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "builder"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->f:Lio/objectbox/Property;

    .line 33
    .line 34
    invoke-virtual {v1, v3, p0}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v3, "builder.build()"

    .line 42
    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lio/objectbox/query/Query;->p()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->c()Lio/objectbox/relation/ToMany;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-instance v5, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 v6, 0xa

    .line 61
    .line 62
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_0

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    check-cast v6, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 84
    .line 85
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {v0, v1}, Lb8/a;->t(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v1, "BoardBox.kt -> [board: "

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p0, "] \u5df2\u88ab\u6e05\u9664"

    .line 110
    .line 111
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    const/4 v0, 0x0

    .line 130
    :cond_1
    :goto_1
    if-ge v0, p0, :cond_2

    .line 131
    .line 132
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    add-int/lit8 v0, v0, 0x1

    .line 137
    .line 138
    check-cast v1, Ljava/lang/String;

    .line 139
    .line 140
    sget-object v4, Lu5/d;->a:Lu5/d;

    .line 141
    .line 142
    invoke-virtual {v4}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    const-class v7, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 147
    .line 148
    invoke-virtual {v6, v7}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    const-string v7, "boxStore.boxFor(PageEntity::class.java)"

    .line 153
    .line 154
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Lb8/a;->n()Lio/objectbox/query/QueryBuilder;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    sget-object v7, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->f:Lio/objectbox/Property;

    .line 165
    .line 166
    invoke-virtual {v6, v7, v1}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Lio/objectbox/query/Query;->p()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 181
    .line 182
    if-eqz v1, :cond_1

    .line 183
    .line 184
    const-string v6, "it"

    .line 185
    .line 186
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v1}, Lu5/d;->e(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_2
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "dirName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    sget-object v0, Lu5/d;->a:Lu5/d;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Lu5/d;->g(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Lu5/c;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lu5/c;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lio/objectbox/BoxStore;->G(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final e(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 8

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    const-string v1, "pageEntity"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->n()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-virtual {v1, v2, v3}, Lb8/a;->s(J)Z

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "\u9875\u9762BoardBox.kt -> [page: "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, "] header \u5df2\u88ab\u6e05\u9664"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_0

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 93
    .line 94
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const-class v5, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v4, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception v1

    .line 113
    goto/16 :goto_8

    .line 114
    .line 115
    :cond_0
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const-class v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v2, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_2

    .line 145
    .line 146
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 151
    .line 152
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_1

    .line 165
    .line 166
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 171
    .line 172
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    const-class v7, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 177
    .line 178
    invoke-virtual {v6, v7}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->h()Lio/objectbox/relation/ToMany;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v6, v5}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_1
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    const-class v5, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 195
    .line 196
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v4, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_2
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 213
    .line 214
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v2, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-eqz v3, :cond_4

    .line 238
    .line 239
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 244
    .line 245
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_3

    .line 258
    .line 259
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 264
    .line 265
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    const-class v7, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 270
    .line 271
    invoke-virtual {v6, v7}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->b()Lio/objectbox/relation/ToMany;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-virtual {v6, v5}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_3
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    const-class v5, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 288
    .line 289
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v4, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_4
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    const-class v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 306
    .line 307
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-virtual {v2, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-eqz v3, :cond_5

    .line 331
    .line 332
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 337
    .line 338
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    const-class v5, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 343
    .line 344
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v4, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 353
    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_5
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const-class v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 361
    .line 362
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    invoke-virtual {v2, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->h()Lio/objectbox/relation/ToMany;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-eqz v3, :cond_6

    .line 386
    .line 387
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 392
    .line 393
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    const-class v5, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 398
    .line 399
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-virtual {v4, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 408
    .line 409
    .line 410
    goto :goto_6

    .line 411
    :cond_6
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 416
    .line 417
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->h()Lio/objectbox/relation/ToMany;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    invoke-virtual {v2, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_7

    .line 441
    .line 442
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 447
    .line 448
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    const-class v5, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 453
    .line 454
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    invoke-virtual {v4, v3}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 463
    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_7
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    const-class v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 471
    .line 472
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-virtual {v2, v1}, Lb8/a;->r(Ljava/util/Collection;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-virtual {v1, v0}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->n()J

    .line 496
    .line 497
    .line 498
    move-result-wide v2

    .line 499
    invoke-virtual {v1, v2, v3}, Lb8/a;->s(J)Z

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 511
    goto :goto_9

    .line 512
    :goto_8
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 513
    .line 514
    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    :goto_9
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    if-eqz v2, :cond_8

    .line 527
    .line 528
    new-instance v3, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 531
    .line 532
    .line 533
    const-string v4, "BoardBox.kt -> clearPageData(), delete record failed "

    .line 534
    .line 535
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    :cond_8
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    invoke-virtual {v1, v0}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->n()J

    .line 568
    .line 569
    .line 570
    move-result-wide v1

    .line 571
    invoke-virtual {v0, v1, v2}, Lb8/a;->s(J)Z

    .line 572
    .line 573
    .line 574
    new-instance v0, Ljava/lang/StringBuilder;

    .line 575
    .line 576
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 577
    .line 578
    .line 579
    const-string v1, "[page: "

    .line 580
    .line 581
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    const-string v2, "] record \u5df2\u88ab\u6e05\u9664"

    .line 592
    .line 593
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {p0}, Lu5/d;->f()Lio/objectbox/BoxStore;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    const-class v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 612
    .line 613
    invoke-virtual {v0, v2}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lb8/a;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->f()J

    .line 618
    .line 619
    .line 620
    move-result-wide v2

    .line 621
    invoke-virtual {v0, v2, v3}, Lb8/a;->s(J)Z

    .line 622
    .line 623
    .line 624
    new-instance v0, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    const-string p1, "] \u5df2\u5b8c\u5168\u88ab\u6e05\u9664"

    .line 640
    .line 641
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object p1

    .line 652
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    return-void
.end method

.method public final f()Lio/objectbox/BoxStore;
    .locals 2

    .line 1
    sget-object v0, Lu5/d;->b:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v0, Lkotlin/UninitializedPropertyAccessException;

    .line 10
    .line 11
    const-string v1, "boxStore not init"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lkotlin/UninitializedPropertyAccessException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public final declared-synchronized g(Landroid/content/Context;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "context"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lu5/d;->b:Lio/objectbox/BoxStore;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/a;->y()Lb8/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Lb8/c;->a(Ljava/lang/Object;)Lb8/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-wide/32 v0, 0x200000

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Lb8/c;->k(J)Lb8/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lb8/c;->b()Lio/objectbox/BoxStore;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "builder()\n              \u2026\n                .build()"

    .line 35
    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lu5/d;->h(Lio/objectbox/BoxStore;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1
.end method

.method public final h(Lio/objectbox/BoxStore;)V
    .locals 0

    .line 1
    sput-object p1, Lu5/d;->b:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    return-void
.end method
