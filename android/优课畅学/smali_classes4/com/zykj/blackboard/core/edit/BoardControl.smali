# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/edit/BoardControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/edit/IBoardControl;


# instance fields
.field private boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

.field private boardDirPath:Ljava/lang/String;

.field private currentPageIndex:I

.field private errorListener:Lcom/zykj/blackboard/listener/ErrorListener;

.field private final pageList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/edit/IEditPageControl;",
            ">;"
        }
    .end annotation
.end field

.field private pageListener:Lcom/zykj/blackboard/listener/PageListener;

.field private final renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

.field private final singleExecutor$delegate:Lh7/d;


# direct methods
.method public constructor <init>(IILcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    .locals 1

    .line 1
    const-string v0, "renderLayer"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 10
    .line 11
    new-instance p3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 17
    .line 18
    new-instance p3, Lcom/zykj/blackboard/bean/BoardConfig;

    .line 19
    .line 20
    invoke-direct {p3, p1, p2}, Lcom/zykj/blackboard/bean/BoardConfig;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardDirPath:Ljava/lang/String;

    .line 31
    .line 32
    sget-object p1, Lcom/zykj/blackboard/core/edit/BoardControl$singleExecutor$2;->INSTANCE:Lcom/zykj/blackboard/core/edit/BoardControl$singleExecutor$2;

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->singleExecutor$delegate:Lh7/d;

    .line 39
    .line 40
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->release$lambda-17(Lcom/zykj/blackboard/core/edit/BoardControl;)V

    return-void
.end method

.method public static final synthetic access$getPageList$p(Lcom/zykj/blackboard/core/edit/BoardControl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;ZLx7/l;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/edit/BoardControl;->save$lambda-9(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;ZLx7/l;Z)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/p;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->loadDir$lambda-14(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/p;Lx7/l;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->drop$lambda-10(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;)V

    return-void
.end method

.method private static final drop$lambda-10(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-static {v0, v1, v2, v3, v2}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData$default(Lcom/zykj/blackboard/utils/BoardBox;Ljava/lang/String;Landroid/content/Context;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p1, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private final getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method private final getSingleExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->singleExecutor$delegate:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    return-object v0
.end method

.method private final initDir(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardDirPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method private final initPageControl(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getPages()Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 20
    .line 21
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 24
    .line 25
    invoke-direct {v1, p0, v2, v0}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/listener/PageListener;->addPage(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method private static final loadDir$lambda-14(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/p;Lx7/l;)V
    .locals 9

    .line 1
    const-string v0, "$dirPath"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$callback"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$error"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "[BoardControl]:loadDir -> dirPath:"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, " \u7ebf\u7a0b\u5f00\u59cb"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->d(Ljava/lang/Class;)Lio/objectbox/a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/objectbox/a;->n()Lio/objectbox/query/QueryBuilder;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "builder"

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 77
    .line 78
    invoke-virtual {v0, v1, p0}, Lio/objectbox/query/QueryBuilder;->c(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "builder.build()"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lio/objectbox/query/Query;->l()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 95
    .line 96
    const-wide/16 v1, 0x0

    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    const/4 v4, 0x0

    .line 100
    if-eqz v0, :cond_0

    .line 101
    .line 102
    const-string p0, "[BoardControl]:loadDir -> \u4ece\u6570\u636e\u5e93\u52a0\u8f7d\u6570\u636e"

    .line 103
    .line 104
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->initPageControl(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    move p0, v3

    .line 115
    goto :goto_1

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 120
    .line 121
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_1

    .line 129
    .line 130
    new-instance v0, Ljava/io/File;

    .line 131
    .line 132
    const-string v5, "page_router.bin"

    .line 133
    .line 134
    invoke-direct {v0, p0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_1

    .line 142
    .line 143
    const-string v0, "[BoardControl]:loadDir -> \u4ece\u672c\u5730\u6587\u4ef6\u52a0\u8f7d\u6570\u636e"

    .line 144
    .line 145
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Lcom/zykj/blackboard/core/data/SourceLoad;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceLoad;

    .line 153
    .line 154
    invoke-virtual {v0, p0}, Lcom/zykj/blackboard/core/data/SourceLoad;->loadRecord(Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-direct {p1, p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->initPageControl(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_1
    const-string v0, "[BoardControl]:loadDir -> \u65b0\u5efaboard"

    .line 163
    .line 164
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 172
    .line 173
    invoke-direct {v0, v1, v2, p0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->put()V

    .line 177
    .line 178
    .line 179
    invoke-direct {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->initPageControl(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 180
    .line 181
    .line 182
    move p0, v4

    .line 183
    :goto_1
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_5

    .line 190
    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v1, "[BoardControl]:loadDir, \u52a0\u8f7d\u6570\u636e\u52a0\u8f7d\u5b8c\u6bd5"

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    iget-object v1, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 202
    .line 203
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    move v2, v4

    .line 208
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_3

    .line 213
    .line 214
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    add-int/lit8 v6, v2, 0x1

    .line 219
    .line 220
    if-gez v2, :cond_2

    .line 221
    .line 222
    invoke-static {}, Li7/v;->w()V

    .line 223
    .line 224
    .line 225
    :cond_2
    check-cast v5, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 226
    .line 227
    new-instance v7, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const/16 v8, 0x5b

    .line 233
    .line 234
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v2, "]: "

    .line 241
    .line 242
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-interface {v5}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->getFileName()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v2, "  "

    .line 253
    .line 254
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    move v2, v6

    .line 265
    goto :goto_2

    .line 266
    :cond_3
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :goto_3
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 280
    .line 281
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-le v0, v3, :cond_4

    .line 286
    .line 287
    new-instance v0, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string v1, "[BoardControl]:loadDir -> \u5220\u9664\u4e86\u4e00\u4e2a"

    .line 293
    .line 294
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    iget-object v1, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 298
    .line 299
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 304
    .line 305
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->getFileName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 324
    .line 325
    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_4
    new-instance v0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;

    .line 330
    .line 331
    invoke-direct {v0, p2, p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;-><init>(Lx7/p;ZLcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p1, v4, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPage(ILx7/a;)Z

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :cond_5
    const-string p0, "[BoardControl]:loadDir -> \u6570\u636e\u52a0\u8f7d\u5b8c\u6bd5, \u6570\u636e\u7a7a"

    .line 339
    .line 340
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-static {p0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 348
    .line 349
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-interface {p2, p0, p1}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 358
    .line 359
    .line 360
    new-instance p1, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 363
    .line 364
    .line 365
    const-string p2, "[BoardControl]:loadDir -> \u6570\u636e\u52a0\u8f7d\u5931\u8d25\uff0ce: "

    .line 366
    .line 367
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p2

    .line 374
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->k([Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    invoke-interface {p3, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    return-void
.end method

.method private static final release$lambda-17(Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->release()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->errorListener:Lcom/zykj/blackboard/listener/ErrorListener;

    .line 37
    .line 38
    return-void
.end method

.method private final renderPage(ILx7/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lx7/a;",
            ")Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/listener/PageListener;->changPage(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0, p2}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->show(Lx7/a;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1
.end method

.method private static final save$lambda-9(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;ZLx7/l;Z)V
    .locals 8

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$error"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$callback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const-string v2, "[BoardControl]:save -> ["

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, "]\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u8be5\u9875\u9762\u5df2\u7ecf\u88ab\u56de\u6536"

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    sget-object v1, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-class v3, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Lio/objectbox/BoxStore;->d(Ljava/lang/Class;)Lio/objectbox/a;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v3, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lio/objectbox/a;->n()Lio/objectbox/query/QueryBuilder;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v3, "builder"

    .line 80
    .line 81
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v1, v3, v4}, Lio/objectbox/query/QueryBuilder;->c(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v3, "builder.build()"

    .line 98
    .line 99
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lio/objectbox/query/Query;->l()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 107
    .line 108
    if-nez v1, :cond_1

    .line 109
    .line 110
    new-instance p1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string p0, "]\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u8be5\u9875\u9762\u6570\u636e\u5e93\u5df2\u88ab\u6e05\u7406"

    .line 126
    .line 127
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_2

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_4

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    check-cast v4, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 164
    .line 165
    invoke-interface {v4}, Lcom/zykj/blackboard/core/edit/IPageControl;->canSave()Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-nez v4, :cond_3

    .line 170
    .line 171
    new-instance p2, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string p0, "]\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u6709\u6570\u636e\u6b63\u5728\u4fdd\u5b58\u5230\u6570\u636e\u5e93"

    .line 187
    .line 188
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-static {p0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    new-instance p0, Ljava/lang/Exception;

    .line 203
    .line 204
    const-string p2, "\u6b63\u5728\u4fdd\u5b58\u6570\u636e\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 205
    .line 206
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p1, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_4
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string v4, "]\u6b63\u5728\u4fdd\u5b58"

    .line 229
    .line 230
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-static {v3}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    const/4 v4, 0x0

    .line 249
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-eqz v5, :cond_7

    .line 254
    .line 255
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    add-int/lit8 v6, v4, 0x1

    .line 260
    .line 261
    if-gez v4, :cond_5

    .line 262
    .line 263
    invoke-static {}, Li7/v;->w()V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :catch_0
    move-exception p0

    .line 268
    goto/16 :goto_5

    .line 269
    .line 270
    :cond_5
    :goto_2
    check-cast v5, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 271
    .line 272
    new-instance v7, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v4, "]["

    .line 284
    .line 285
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-interface {v5}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->getFileName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v4, "]\u51c6\u5907\u4fdd\u5b58"

    .line 296
    .line 297
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-static {v4}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    if-eqz p4, :cond_6

    .line 312
    .line 313
    invoke-interface {v5}, Lcom/zykj/blackboard/core/edit/IPageControl;->saveWithContentThumbnail()V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_6
    invoke-interface {v5}, Lcom/zykj/blackboard/core/edit/IPageControl;->save()V

    .line 318
    .line 319
    .line 320
    :goto_3
    move v4, v6

    .line 321
    goto :goto_1

    .line 322
    :cond_7
    sget-object p4, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 323
    .line 324
    new-instance v3, Ljava/util/ArrayList;

    .line 325
    .line 326
    const/16 v4, 0xa

    .line 327
    .line 328
    invoke-static {v0, v4}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-eqz v4, :cond_8

    .line 344
    .line 345
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    check-cast v4, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 350
    .line 351
    invoke-interface {v4}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->getFileName()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_4

    .line 359
    :cond_8
    invoke-virtual {p4, v1, v3}, Lcom/zykj/blackboard/core/data/SourceSave;->saveRecord(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V

    .line 360
    .line 361
    .line 362
    if-eqz p2, :cond_9

    .line 363
    .line 364
    new-instance p2, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p4

    .line 376
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string p4, "]\u6e05\u9664\u6570\u636e\u5e93"

    .line 380
    .line 381
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p2

    .line 388
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p2

    .line 392
    invoke-static {p2}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    sget-object p2, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 396
    .line 397
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object p4

    .line 401
    const/4 v0, 0x2

    .line 402
    const/4 v1, 0x0

    .line 403
    invoke-static {p2, p4, v1, v0, v1}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData$default(Lcom/zykj/blackboard/utils/BoardBox;Ljava/lang/String;Landroid/content/Context;ILjava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p4

    .line 418
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string p4, "]\u4fdd\u5b58\u7ed3\u675f"

    .line 422
    .line 423
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object p2

    .line 430
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p2

    .line 434
    invoke-static {p2}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    invoke-interface {p3, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 442
    .line 443
    .line 444
    return-void

    .line 445
    :goto_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 446
    .line 447
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 448
    .line 449
    .line 450
    const-string p3, "\u6570\u636e\u4fdd\u5b58\u5931\u8d25 -> error: "

    .line 451
    .line 452
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object p2

    .line 462
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object p2

    .line 466
    invoke-static {p2}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    invoke-interface {p1, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    return-void
.end method


# virtual methods
.method public createPage(ZLx7/a;)Lcom/zykj/blackboard/core/edit/IPageControl;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lx7/a;",
            ")",
            "Lcom/zykj/blackboard/core/edit/IPageControl;"
        }
    .end annotation

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 17
    .line 18
    iget v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 25
    .line 26
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->hide()V

    .line 27
    .line 28
    .line 29
    :cond_0
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    move-object v2, p0

    .line 37
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/n;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object v0, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/listener/PageListener;->addPage(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    if-eqz p1, :cond_2

    .line 53
    .line 54
    iget-object p1, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->renderPage(ILx7/a;)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    return-object v1
.end method

.method public currentPage(ILx7/a;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lx7/a;",
            ")Z"
        }
    .end annotation

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    if-ltz v0, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v0, v2, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->hide()V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->renderPage(ILx7/a;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_2
    return v1
.end method

.method public deletePage(ILx7/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    add-int/lit8 v1, p1, -0x1

    .line 22
    .line 23
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->onDelete()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->release()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-interface {v2, v0}, Lcom/zykj/blackboard/listener/PageListener;->removePage(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 46
    .line 47
    if-ne v0, p1, :cond_3

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->renderPage(ILx7/a;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {p1, v1}, Li7/f0;->q0(Ljava/util/List;Ljava/lang/Object;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 67
    .line 68
    return-void
.end method

.method public drop(Lx7/l;Lx7/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Ljava/lang/Thread;

    .line 12
    .line 13
    new-instance v0, Lcom/zykj/blackboard/core/edit/f;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/edit/f;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public getBoardDirPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardDirPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCurrentPage()Lcom/zykj/blackboard/core/edit/IPageControl;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getCurrentPageIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public final getErrorListener()Lcom/zykj/blackboard/listener/ErrorListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->errorListener:Lcom/zykj/blackboard/listener/ErrorListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPageListener()Lcom/zykj/blackboard/listener/PageListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadDir(Ljava/lang/String;Lx7/p;Lx7/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx7/p;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "error"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "[BoardControl]:loadDir -> dirPath:"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->initDir(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getSingleExecutor()Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Lcom/zykj/blackboard/core/edit/d;

    .line 48
    .line 49
    invoke-direct {v1, p1, p0, p2, p3}, Lcom/zykj/blackboard/core/edit/d;-><init>(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/p;Lx7/l;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final loadPathForTest(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->initDir(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final release()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getSingleExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/edit/e;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/zykj/blackboard/core/edit/e;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public save(ZZLx7/l;Lx7/l;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getSingleExecutor()Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/blackboard/core/edit/c;

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    move v4, p1

    .line 19
    move v6, p2

    .line 20
    move-object v5, p3

    .line 21
    move-object v3, p4

    .line 22
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/edit/c;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;ZLx7/l;Z)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setErrorListener(Lcom/zykj/blackboard/listener/ErrorListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->errorListener:Lcom/zykj/blackboard/listener/ErrorListener;

    .line 2
    .line 3
    return-void
.end method

.method public setPageListener(Lcom/zykj/blackboard/listener/PageListener;)V
    .locals 1

    .line 1
    const-string v0, "pageListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 7
    .line 8
    return-void
.end method
