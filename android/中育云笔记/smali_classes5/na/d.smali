.class public final Lna/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lna/d;

.field public static b:Lio/objectbox/BoxStore;

.field public static c:Ljava/lang/String;

.field public static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lna/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lna/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lna/d;->a:Lna/d;

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
    invoke-static {p0}, Lna/d;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lna/d;Ljava/lang/String;Landroid/content/Context;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2}, Lna/d;->b(Ljava/lang/String;Landroid/content/Context;)V

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
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lna/d;->a:Lna/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "builder"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->h:Lio/objectbox/Property;

    .line 33
    .line 34
    invoke-virtual {v1, v3, p0}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v3, "builder.build()"

    .line 42
    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lio/objectbox/query/Query;->n()Ljava/lang/Object;

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
    invoke-static {v4, v6}, Lrc/x;->x(Ljava/lang/Iterable;I)I

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
    invoke-virtual {v0, v1}, Ljc/a;->u(Ljava/lang/Object;)Z

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
    const-string v1, "[board: "

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
    sget-object v4, Lna/d;->a:Lna/d;

    .line 141
    .line 142
    invoke-virtual {v4}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    const-class v7, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 147
    .line 148
    invoke-virtual {v6, v7}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    const-string v7, "boxStore.boxFor(PageEntity::class.java)"

    .line 153
    .line 154
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-static {v6, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    sget-object v7, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->h:Lio/objectbox/Property;

    .line 165
    .line 166
    invoke-virtual {v6, v7, v1}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Lio/objectbox/query/Query;->n()Ljava/lang/Object;

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
    invoke-static {v1, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v1}, Lna/d;->e(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, Lna/d;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lna/d;->c:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-eqz p2, :cond_1

    .line 16
    .line 17
    sget-object v0, Lna/d;->a:Lna/d;

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Lna/d;->g(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Lna/c;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Lna/c;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v0}, Lio/objectbox/BoxStore;->I(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final e(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 8

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->f()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-virtual {v0, v1, v2}, Ljc/a;->t(J)Z

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "[page: "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v2, "] header \u5df2\u88ab\u6e05\u9664"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 91
    .line 92
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const-class v5, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 97
    .line 98
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v4, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :cond_0
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    const-class v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v2, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_2

    .line 143
    .line 144
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 149
    .line 150
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-eqz v5, :cond_1

    .line 163
    .line 164
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 169
    .line 170
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    const-class v7, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 175
    .line 176
    invoke-virtual {v6, v7}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->h()Lio/objectbox/relation/ToMany;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v6, v5}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_1
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    const-class v5, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 193
    .line 194
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v4, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_2
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 211
    .line 212
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v2, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_4

    .line 236
    .line 237
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 242
    .line 243
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_3

    .line 256
    .line 257
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 262
    .line 263
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    const-class v7, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 268
    .line 269
    invoke-virtual {v6, v7}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->b()Lio/objectbox/relation/ToMany;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-virtual {v6, v5}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_3
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    const-class v5, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 286
    .line 287
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v4, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 296
    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_4
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const-class v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 304
    .line 305
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-virtual {v2, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_5

    .line 329
    .line 330
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 335
    .line 336
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    const-class v5, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 341
    .line 342
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-virtual {v4, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_5
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    const-class v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 359
    .line 360
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-virtual {v2, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->h()Lio/objectbox/relation/ToMany;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_6

    .line 384
    .line 385
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 390
    .line 391
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    const-class v5, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 396
    .line 397
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-virtual {v4, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 406
    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_6
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 414
    .line 415
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->h()Lio/objectbox/relation/ToMany;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    invoke-virtual {v2, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    if-eqz v3, :cond_7

    .line 439
    .line 440
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 445
    .line 446
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    const-class v5, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 451
    .line 452
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-virtual {v4, v3}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 461
    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_7
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const-class v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 469
    .line 470
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-virtual {v2, v0}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 479
    .line 480
    .line 481
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 482
    .line 483
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 487
    goto :goto_9

    .line 488
    :goto_8
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 489
    .line 490
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    :goto_9
    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    if-eqz v0, :cond_8

    .line 503
    .line 504
    sget-object v0, Lna/d;->a:Lna/d;

    .line 505
    .line 506
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    const-class v2, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 511
    .line 512
    invoke-virtual {v0, v2}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->f()J

    .line 521
    .line 522
    .line 523
    move-result-wide v2

    .line 524
    invoke-virtual {v0, v2, v3}, Ljc/a;->t(J)Z

    .line 525
    .line 526
    .line 527
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 528
    .line 529
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    const-string v2, "] record \u5df2\u88ab\u6e05\u9664"

    .line 543
    .line 544
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {p0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    const-class v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 563
    .line 564
    invoke-virtual {v0, v2}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->f()J

    .line 569
    .line 570
    .line 571
    move-result-wide v2

    .line 572
    invoke-virtual {v0, v2, v3}, Ljc/a;->t(J)Z

    .line 573
    .line 574
    .line 575
    new-instance v0, Ljava/lang/StringBuilder;

    .line 576
    .line 577
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    const-string p1, "] \u5df2\u5b8c\u5168\u88ab\u6e05\u9664"

    .line 591
    .line 592
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object p1

    .line 599
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    return-void
.end method

.method public final f()Lio/objectbox/BoxStore;
    .locals 2

    .line 1
    sget-object v0, Lna/d;->b:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lna/d;->b:Lio/objectbox/BoxStore;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "BBD: initializing box store : "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/a;->y()Ljc/c;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v0, p1}, Ljc/c;->a(Ljava/lang/Object;)Ljc/c;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-wide/32 v0, 0x800000

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Ljc/c;->l(J)Ljc/c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljc/c;->b()Lio/objectbox/BoxStore;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v0, "builder()\n              \u2026\n                .build()"

    .line 67
    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, Lna/d;->i(Lio/objectbox/BoxStore;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    :goto_0
    monitor-exit p0

    .line 78
    return-void

    .line 79
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw p1
.end method

.method public final declared-synchronized h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "context"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "file"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "BBD:init object box with file: "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lna/d;->b:Lio/objectbox/BoxStore;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->close()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/a;->y()Ljc/c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, Ljava/io/File;

    .line 54
    .line 55
    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljc/c;->f(Ljava/io/File;)Ljc/c;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0, p1}, Ljc/c;->a(Ljava/lang/Object;)Ljc/c;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-wide/32 v0, 0x800000

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0, v1}, Ljc/c;->l(J)Ljc/c;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ljc/c;->b()Lio/objectbox/BoxStore;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string v0, "builder()\n            .d\u2026024)\n            .build()"

    .line 82
    .line 83
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lna/d;->i(Lio/objectbox/BoxStore;)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    sput-boolean p1, Lna/d;->d:Z

    .line 91
    .line 92
    sput-object p2, Lna/d;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    monitor-exit p0

    .line 95
    return-void

    .line 96
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    throw p1
.end method

.method public final i(Lio/objectbox/BoxStore;)V
    .locals 0

    .line 1
    sput-object p1, Lna/d;->b:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    return-void
.end method
