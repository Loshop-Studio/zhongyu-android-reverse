.class public final Lx9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx9/b$a;
    }
.end annotation


# static fields
.field public static final a:Lx9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lx9/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lx9/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx9/b;->a:Lx9/b;

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

.method public static final D(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "$boardEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageRouter$PageRouter;->g()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "pageInfoList"

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast p0, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v2, "[SourceLoad]:loadRecord-> page:"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const-string v0, "it.name"

    .line 73
    .line 74
    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/16 v9, 0x1c

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    const-wide/16 v3, 0x0

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/PageEntity;-><init>(JLjava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/n;)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lx9/b;->a:Lx9/b;

    .line 89
    .line 90
    invoke-virtual {v0, p2, v2}, Lx9/b;->B(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->a()Lio/objectbox/relation/ToOne;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0, p1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->i()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->c()Lio/objectbox/relation/ToMany;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->d()V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lx9/b;->D(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrixSourceRecordList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p3, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "it.fileName"

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "it.validate"

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Lx9/b;->a:Lx9/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1, v4, v0}, Lx9/b;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$MatrixSource;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$MatrixSource;->g()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "this.matrixInfoList"

    .line 84
    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1, v0}, Lx9/b;->y(Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->e()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method

.method public final B(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
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
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "pageEntity"

    .line 11
    .line 12
    move-object/from16 v3, p2

    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lx9/b;->m(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

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
    sget-object v5, Lx9/b;->a:Lx9/b;

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
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v1, v4, v6}, Lx9/b;->s(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

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
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v1, v4, v6}, Lx9/b;->I(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

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
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v1, v4, v6}, Lx9/b;->A(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

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
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v1, v4, v6}, Lx9/b;->u(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

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
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v1, v4, v6}, Lx9/b;->F(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

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
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v1, v4, v6}, Lx9/b;->x(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

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
    invoke-static {v2, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v1, v4, v2}, Lx9/b;->q(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V

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
    invoke-virtual {v2, v4}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Lx9/b;->j(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Header;

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
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5, v2}, Lx9/b;->b(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

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
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

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
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5, v2}, Lx9/b;->e(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

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
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

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
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v2}, Lx9/b;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

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
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

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
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5, v2}, Lx9/b;->c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

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
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

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
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    check-cast v1, Ljava/lang/Iterable;

    .line 298
    .line 299
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_0

    .line 308
    .line 309
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, Lcom/zykj/board/EzyHeader$Author;

    .line 314
    .line 315
    sget-object v4, Lx9/b;->a:Lx9/b;

    .line 316
    .line 317
    const-string v5, "it"

    .line 318
    .line 319
    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v2}, Lx9/b;->b(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->h()V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->m()Lio/objectbox/relation/ToMany;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-virtual {v4, v2}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    goto :goto_0

    .line 337
    :cond_0
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v1, v6}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-void
.end method

.method public final C(Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;
    .locals 4

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v2}, Lcom/zykj/board/EzyPageRouter$PageRouter;->o(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageRouter$PageRouter;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v2, Lna/d;->a:Lna/d;

    .line 42
    .line 43
    invoke-virtual {v2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, Lx9/a;

    .line 48
    .line 49
    invoke-direct {v3, v0, v1, p1}, Lx9/a;-><init>(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->I(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0
.end method

.method public final E(Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;Ljava/util/List;)V
    .locals 10

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 33
    .line 34
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->m()Lcom/zykj/board/EzyPaint$Paint;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->m()Lcom/zykj/board/EzyPaint$Paint;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->m()Lcom/zykj/board/EzyPaint$Paint;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->r()F

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->m()Lcom/zykj/board/EzyPaint$Paint;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->p()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->getContent()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    const-string v1, "it.content"

    .line 73
    .line 74
    invoke-static {v9, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-wide/16 v3, 0x0

    .line 78
    .line 79
    invoke-direct/range {v2 .. v9}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;-><init>(JFIFILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 87
    .line 88
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 93
    .line 94
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final F(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "list"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p3, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "it.fileName"

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "it.validate"

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Lx9/b;->a:Lx9/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1, v4, v0}, Lx9/b;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource;->k()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "this.textInfoList"

    .line 84
    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1, v0}, Lx9/b;->E(Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->e()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->h()Lio/objectbox/relation/ToMany;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method

.method public final G(Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;Ljava/util/List;)V
    .locals 11

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 33
    .line 34
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->p()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->r()F

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    const-wide/16 v3, 0x0

    .line 85
    .line 86
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;-><init>(JFIFFIF)V

    .line 87
    .line 88
    .line 89
    sget-object v3, Lx9/b;->a:Lx9/b;

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v4, "it.touchEventList"

    .line 96
    .line 97
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v2, v1}, Lx9/b;->H(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 108
    .line 109
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 114
    .line 115
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final H(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;Ljava/util/List;)V
    .locals 9

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 33
    .line 34
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    invoke-virtual {v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const-wide/16 v3, 0x0

    .line 49
    .line 50
    invoke-direct/range {v2 .. v8}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;-><init>(JJFF)V

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
    sget-object p2, Lna/d;->a:Lna/d;

    .line 58
    .line 59
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 64
    .line 65
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->h()Lio/objectbox/relation/ToMany;

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

.method public final I(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "touchSourceRecordList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p3, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "it.fileName"

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "it.validate"

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Lx9/b;->a:Lx9/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1, v4, v0}, Lx9/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TouchSource;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource;->k()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "this.touchInfoList"

    .line 84
    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1, v0}, Lx9/b;->G(Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->e()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method

.method public final J(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)[B
    .locals 13

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->k()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lx9/b$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const-string v1, "{\n                val da\u2026ByteArray()\n            }"

    .line 18
    .line 19
    const-string v2, "\uff0clast="

    .line 20
    .line 21
    const-string v3, "\uff0corigin="

    .line 22
    .line 23
    const-string v4, "\uff0clastValid="

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    const-string v6, "data.lastMatrix"

    .line 27
    .line 28
    const-string v7, "data.originMatrix"

    .line 29
    .line 30
    const/4 v8, 0x1

    .line 31
    if-eq v0, v8, :cond_5

    .line 32
    .line 33
    const/4 v9, 0x2

    .line 34
    if-eq v0, v9, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->n()Lcom/google/protobuf/ByteString;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "commandInfo.data.toByteArray()"

    .line 45
    .line 46
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->n()Lcom/google/protobuf/ByteString;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->t(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->v()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera$b;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->k()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-static {v9, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v9}, Lna/n;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->g()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-static {v10, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v10}, Lna/n;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-nez v9, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->k()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 91
    .line 92
    .line 93
    move-result-wide v11

    .line 94
    invoke-virtual {p0, v11, v12}, Lx9/b;->d(J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v0, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera$b;->z(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera$b;

    .line 99
    .line 100
    .line 101
    move v5, v8

    .line 102
    :cond_2
    if-nez v10, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->g()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v5}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v11

    .line 112
    invoke-virtual {p0, v11, v12}, Lx9/b;->d(J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v0, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera$b;->y(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera$b;

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    move v8, v5

    .line 121
    :goto_1
    if-eqz v8, :cond_4

    .line 122
    .line 123
    new-instance v5, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v8, "\u9875\u9762 SourceLoad.kt -> sanitizeCameraCommandData\uff0c\u65e7bin\u8f6cmdb\u65f6\u53d1\u73b0\u975e\u6cd5\u76f8\u673a\u77e9\u9635\uff0c\u5df2\u91cd\u7f6e\uff0c\u547d\u4ee4=ACTION_CAMERA\uff0coriginValid="

    .line 129
    .line 130
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->k()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v3, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v3}, Lx9/b;->K(Lcom/zykj/board/EzyMatrix$Matrix;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->g()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-static {p1, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, p1}, Lx9/b;->K(Lcom/zykj/board/EzyMatrix$Matrix;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_4
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-object p1

    .line 199
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->n()Lcom/google/protobuf/ByteString;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->A(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->D()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->o()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-static {v9, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v9}, Lna/n;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Z

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->n()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    invoke-static {v10, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v10}, Lna/n;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Z

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-nez v9, :cond_6

    .line 234
    .line 235
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->o()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-virtual {v5}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 240
    .line 241
    .line 242
    move-result-wide v11

    .line 243
    invoke-virtual {p0, v11, v12}, Lx9/b;->d(J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {v0, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->z(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 248
    .line 249
    .line 250
    move v5, v8

    .line 251
    :cond_6
    if-nez v10, :cond_7

    .line 252
    .line 253
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->n()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-virtual {v5}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 258
    .line 259
    .line 260
    move-result-wide v11

    .line 261
    invoke-virtual {p0, v11, v12}, Lx9/b;->d(J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {v0, v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->y(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_7
    move v8, v5

    .line 270
    :goto_2
    if-eqz v8, :cond_8

    .line 271
    .line 272
    new-instance v5, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v8, "\u9875\u9762 SourceLoad.kt -> sanitizeCameraCommandData\uff0c\u65e7bin\u8f6cmdb\u65f6\u53d1\u73b0\u975e\u6cd5\u76f8\u673a\u77e9\u9635\uff0c\u5df2\u91cd\u7f6e\uff0c\u547d\u4ee4=ACTION_CAMERA_MATRIX\uff0csource="

    .line 278
    .line 279
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->p()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string v8, "\uff0csourceId="

    .line 290
    .line 291
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->r()I

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v8, "\uff0coriginValid="

    .line 302
    .line 303
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->o()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-static {v3, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0, v3}, Lx9/b;->K(Lcom/zykj/board/EzyMatrix$Matrix;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->n()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-static {p1, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0, p1}, Lx9/b;->K(Lcom/zykj/board/EzyMatrix$Matrix;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    :cond_8
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    return-object p1
.end method

.method public final K(Lcom/zykj/board/EzyMatrix$Matrix;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "eventTime="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", scaleX="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", skewX="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->y()F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", transX="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", skewY="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", scaleY="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, ", transY="

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", perSp0="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->t()F

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", perSp1="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->u()F

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", perSp2="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->v()F

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
.end method

.method public final b(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;
    .locals 9

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->r()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->p()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->y()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->z()Ljava/lang/String;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->v()J

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->m()I

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->n()F

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->o()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const-string p1, "backgroundLineConfig.lineType"

    .line 16
    .line 17
    invoke-static {v5, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;-><init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/n;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final d(J)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->D()Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->p(J)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    .line 8
    const/high16 p1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->v(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->w(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->t(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->d()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "newBuilder().apply {\n   \u2026p2 = 1F\n        }.build()"

    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object p1
.end method

.method public final e(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;
    .locals 10

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->y()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->o()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Z

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->r()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->t()I

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

.method public final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->e:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

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
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource;->p(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource;

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
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->e:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

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
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource;->p(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource;

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
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->e:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

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
    invoke-static {p1}, Lcom/zykj/board/EzySource$FileSource;->p(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$FileSource;

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
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$GeometrySource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->e:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

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
    invoke-static {p1}, Lcom/zykj/board/EzySource$GeometrySource;->o(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$GeometrySource;

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
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final j(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Header;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$MatrixSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->e:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

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
    invoke-static {p1}, Lcom/zykj/board/EzySource$MatrixSource;->o(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$MatrixSource;

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
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final l(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p1}, Lcom/zykj/board/EzyPageRouter$PageRouter;->o(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageRouter$PageRouter;

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
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final m(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->e:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

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
    invoke-static {p1}, Lcom/zykj/board/EzySource$TextSource;->p(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$TextSource;

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
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TouchSource;
    .locals 1

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "validate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    sget-object p2, Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;->e:Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;

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
    invoke-static {p1}, Lcom/zykj/board/EzySource$TouchSource;->p(Ljava/io/InputStream;)Lcom/zykj/board/EzySource$TouchSource;

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
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final p(Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;Ljava/util/List;)V
    .locals 12

    .line 1
    const-string v0, "audioRecordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "audioInfoList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 33
    .line 34
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 41
    .line 42
    .line 43
    move-result-wide v7

    .line 44
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->u()Z

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->k()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    const-string v3, "it.commandEnum"

    .line 53
    .line 54
    invoke-static {v10, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->n()Lcom/google/protobuf/ByteString;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    const-string v1, "it.data.toByteArray()"

    .line 66
    .line 67
    invoke-static {v11, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-wide/16 v3, 0x0

    .line 71
    .line 72
    invoke-direct/range {v2 .. v11}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 80
    .line 81
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    const-class v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 86
    .line 87
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final q(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "list"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p3, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "it.fileName"

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "it.validate"

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Lx9/b;->a:Lx9/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1, v4, v0}, Lx9/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource;->f()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "this.commandInfoList"

    .line 84
    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1, v0}, Lx9/b;->p(Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->e()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method

.method public final r(Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;Ljava/util/List;)V
    .locals 13

    .line 1
    const-string v0, "commandRecordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "commandInfoList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 33
    .line 34
    sget-object v2, Lx9/b;->a:Lx9/b;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lx9/b;->J(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)[B

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 47
    .line 48
    .line 49
    move-result-wide v8

    .line 50
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->u()Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->k()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    const-string v1, "it.commandEnum"

    .line 59
    .line 60
    invoke-static {v11, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-wide/16 v4, 0x0

    .line 64
    .line 65
    invoke-direct/range {v3 .. v12}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 73
    .line 74
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    const-class v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 79
    .line 80
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final s(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sourceCommandRecordList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p3, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "it.fileName"

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "it.validate"

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Lx9/b;->a:Lx9/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1, v4, v0}, Lx9/b;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource;->f()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "this.commandInfoList"

    .line 84
    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1, v0}, Lx9/b;->r(Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->e()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method

.method public final t(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;Ljava/util/List;)V
    .locals 9

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 33
    .line 34
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const-string v3, "it.name"

    .line 41
    .line 42
    invoke-static {v5, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->n()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    const-string v1, "it.validate"

    .line 58
    .line 59
    invoke-static {v8, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-wide/16 v3, 0x0

    .line 63
    .line 64
    invoke-direct/range {v2 .. v8}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;-><init>(JLjava/lang/String;IILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 72
    .line 73
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    const-class v1, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 78
    .line 79
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final u(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "list"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p3, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "it.fileName"

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "it.validate"

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Lx9/b;->a:Lx9/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1, v4, v0}, Lx9/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$FileSource;->k()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "this.fileInfoList"

    .line 84
    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1, v0}, Lx9/b;->t(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->e()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;Ljava/util/List;)V
    .locals 10

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 33
    .line 34
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->r()F

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->r()Lcom/zykj/board/EzyPaint$Paint;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->p()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->p()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    const-wide/16 v3, 0x0

    .line 73
    .line 74
    invoke-direct/range {v2 .. v9}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;-><init>(JFIFII)V

    .line 75
    .line 76
    .line 77
    sget-object v3, Lx9/b;->a:Lx9/b;

    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPointsList()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-string v4, "it.pointsList"

    .line 84
    .line 85
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v2, v1}, Lx9/b;->w(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 96
    .line 97
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    const-class v1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 102
    .line 103
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final w(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;Ljava/util/List;)V
    .locals 6

    .line 1
    const-string v0, "geometryInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzyPointF$PointF;

    .line 33
    .line 34
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/board/EzyPointF$PointF;->getX()F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v1}, Lcom/zykj/board/EzyPointF$PointF;->getY()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const-wide/16 v4, 0x0

    .line 45
    .line 46
    invoke-direct {v2, v4, v5, v3, v1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;-><init>(JFF)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 54
    .line 55
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const-class v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 60
    .line 61
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->d()Lio/objectbox/relation/ToMany;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final x(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recordEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "list"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p3, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "it.fileName"

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "it.validate"

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    invoke-direct {v1, v6, v7, v2, v4}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Lx9/b;->a:Lx9/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p1, v4, v0}, Lx9/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$GeometrySource;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource;->g()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "this.geometryInfoList"

    .line 84
    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1, v0}, Lx9/b;->v(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->e()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->d()Lio/objectbox/relation/ToMany;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method

.method public final y(Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;Ljava/util/List;)V
    .locals 5

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 33
    .line 34
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 35
    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    invoke-direct {v2, v3, v4}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;-><init>(J)V

    .line 39
    .line 40
    .line 41
    sget-object v3, Lx9/b;->a:Lx9/b;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v4, "it.matrixList"

    .line 48
    .line 49
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2, v1}, Lx9/b;->z(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 60
    .line 61
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const-class v1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 66
    .line 67
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2, v0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final z(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;Ljava/util/List;)V
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "event"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "list"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast v0, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 37
    .line 38
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 41
    .line 42
    .line 43
    move-result-wide v7

    .line 44
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->y()F

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->t()F

    .line 69
    .line 70
    .line 71
    move-result v15

    .line 72
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->u()F

    .line 73
    .line 74
    .line 75
    move-result v16

    .line 76
    invoke-virtual {v3}, Lcom/zykj/board/EzyMatrix$Matrix;->v()F

    .line 77
    .line 78
    .line 79
    move-result v17

    .line 80
    const-wide/16 v5, 0x0

    .line 81
    .line 82
    invoke-direct/range {v4 .. v17}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;-><init>(JJFFFFFFFFF)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    sget-object v0, Lna/d;->a:Lna/d;

    .line 90
    .line 91
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-class v3, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0, v1}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->b()Lio/objectbox/relation/ToMany;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->addAll(Ljava/util/Collection;)Z

    .line 109
    .line 110
    .line 111
    return-void
.end method
