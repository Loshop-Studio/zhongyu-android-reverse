# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/utils/BoardBox;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0007\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR$\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00188F@BX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/zykj/blackboard/utils/BoardBox;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ld6/s;",
        "init",
        "(Landroid/content/Context;)V",
        "",
        "dirName",
        "clearLocalData",
        "(Ljava/lang/String;Landroid/content/Context;)V",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "pageEntity",
        "clearPageData",
        "(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V",
        "path",
        "",
        "checkBoardFileExist",
        "(Landroid/content/Context;Ljava/lang/String;)Z",
        "Ljava/io/File;",
        "testFile",
        "(Ljava/io/File;)V",
        "Lio/objectbox/BoxStore;",
        "tempStore",
        "Lio/objectbox/BoxStore;",
        "value",
        "getBoxStore",
        "()Lio/objectbox/BoxStore;",
        "setBoxStore",
        "(Lio/objectbox/BoxStore;)V",
        "boxStore",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static tempStore:Lio/objectbox/BoxStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/utils/BoardBox;

    invoke-direct {v0}, Lcom/zykj/blackboard/utils/BoardBox;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    return-void
.end method

.method private constructor <init>()V
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
    invoke-static {p0}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData$lambda-8(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic clearLocalData$default(Lcom/zykj/blackboard/utils/BoardBox;Ljava/lang/String;Landroid/content/Context;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData(Ljava/lang/String;Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final clearLocalData$lambda-8(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "$dirName"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 23
    .line 24
    invoke-virtual {v1, v2, p0}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Lio/objectbox/query/Query;->c()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getPages()Lio/objectbox/relation/ToMany;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, Ljava/util/ArrayList;

    .line 44
    .line 45
    const/16 v4, 0xa

    .line 46
    .line 47
    invoke-static {v2, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v0, v1}, Lio/objectbox/a;->j(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v1, "BoardBox.kt -> [board: "

    .line 84
    .line 85
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p0, "] \u5df2\u88ab\u6e05\u9664"

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    const/4 v0, 0x0

    .line 112
    :cond_1
    :goto_1
    if-ge v0, p0, :cond_2

    .line 113
    .line 114
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    add-int/lit8 v0, v0, 0x1

    .line 119
    .line 120
    check-cast v1, Ljava/lang/String;

    .line 121
    .line 122
    sget-object v2, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const-class v5, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 129
    .line 130
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v4}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->dirName:Lio/objectbox/Property;

    .line 139
    .line 140
    invoke-virtual {v4, v5, v1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Lio/objectbox/query/Query;->c()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 152
    .line 153
    if-eqz v1, :cond_1

    .line 154
    .line 155
    invoke-virtual {v2, v1}, Lcom/zykj/blackboard/utils/BoardBox;->clearPageData(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    return-void
.end method

.method private final setBoxStore(Lio/objectbox/BoxStore;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/zykj/blackboard/utils/BoardBox;->tempStore:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final checkBoardFileExist(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/utils/BoardBox;->init(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-class v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 29
    .line 30
    invoke-virtual {p1, v0, p2}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p2, "boxStore.boxFor(BlackBoa\u2026r, path)\n        }.find()"

    .line 42
    .line 43
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 61
    .line 62
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getPages()Lio/objectbox/relation/ToMany;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-nez p2, :cond_0

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    return p1

    .line 74
    :cond_1
    const/4 p1, 0x0

    .line 75
    return p1
.end method

.method public final clearLocalData(Ljava/lang/String;Landroid/content/Context;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "dirName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Lcom/zykj/blackboard/utils/BoardBox;->init(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Lcom/zykj/blackboard/utils/a;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p1, v1}, Lcom/zykj/blackboard/utils/a;-><init>(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v0}, Lio/objectbox/BoxStore;->h(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final clearPageData(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 8
    .param p1    # Lcom/zykj/blackboard/core/data/dao/PageEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    const-string v1, "pageEntity"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-virtual {v1, v2, v3}, Lio/objectbox/a;->l(J)Z

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "\u9875\u9762BoardBox.kt -> [page: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, "] header \u5df2\u88ab\u6e05\u9664"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    const-class v5, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 94
    .line 95
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v4, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v1

    .line 108
    goto/16 :goto_8

    .line 109
    .line 110
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-class v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v2, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_2

    .line 140
    .line 141
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 146
    .line 147
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_1

    .line 160
    .line 161
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    const-class v7, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 172
    .line 173
    invoke-virtual {v6, v7}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTouchInfoList()Lio/objectbox/relation/ToMany;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {v6, v5}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    const-class v5, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 190
    .line 191
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v4, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 208
    .line 209
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v2, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getMatrixList()Lio/objectbox/relation/ToMany;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_4

    .line 233
    .line 234
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 239
    .line 240
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-eqz v5, :cond_3

    .line 253
    .line 254
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 259
    .line 260
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    const-class v7, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 265
    .line 266
    invoke-virtual {v6, v7}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->getMatrixInfo()Lio/objectbox/relation/ToMany;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    invoke-virtual {v6, v5}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 275
    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    const-class v5, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 283
    .line 284
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-virtual {v4, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const-class v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 301
    .line 302
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getMatrixList()Lio/objectbox/relation/ToMany;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v2, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getFileList()Lio/objectbox/relation/ToMany;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_5

    .line 326
    .line 327
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 332
    .line 333
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    const-class v5, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 338
    .line 339
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-virtual {v4, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 348
    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const-class v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 356
    .line 357
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getFileList()Lio/objectbox/relation/ToMany;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v2, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTextList()Lio/objectbox/relation/ToMany;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-eqz v3, :cond_6

    .line 381
    .line 382
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 387
    .line 388
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    const-class v5, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 393
    .line 394
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getTextInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-virtual {v4, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 403
    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 411
    .line 412
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTextList()Lio/objectbox/relation/ToMany;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-virtual {v2, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-eqz v3, :cond_7

    .line 436
    .line 437
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 442
    .line 443
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    const-class v5, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 448
    .line 449
    invoke-virtual {v4, v5}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    invoke-virtual {v4, v3}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 458
    .line 459
    .line 460
    goto :goto_7

    .line 461
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const-class v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 466
    .line 467
    invoke-virtual {v2, v3}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v2, v1}, Lio/objectbox/a;->k(Ljava/util/List;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    invoke-virtual {v1, v0}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 491
    .line 492
    .line 493
    move-result-wide v2

    .line 494
    invoke-virtual {v1, v2, v3}, Lio/objectbox/a;->l(J)Z

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 506
    goto :goto_9

    .line 507
    :goto_8
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    :goto_9
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    if-eqz v2, :cond_8

    .line 520
    .line 521
    new-instance v3, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    const-string v4, "BoardBox.kt -> clearPageData(), delete record failed "

    .line 524
    .line 525
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->b([Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    :cond_8
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    invoke-virtual {v1, v0}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 558
    .line 559
    .line 560
    move-result-wide v1

    .line 561
    invoke-virtual {v0, v1, v2}, Lio/objectbox/a;->l(J)Z

    .line 562
    .line 563
    .line 564
    new-instance v0, Ljava/lang/StringBuilder;

    .line 565
    .line 566
    const-string v1, "[page: "

    .line 567
    .line 568
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    const-string v2, "] record \u5df2\u88ab\u6e05\u9664"

    .line 579
    .line 580
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {p0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    const-class v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 599
    .line 600
    invoke-virtual {v0, v2}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getId()J

    .line 605
    .line 606
    .line 607
    move-result-wide v2

    .line 608
    invoke-virtual {v0, v2, v3}, Lio/objectbox/a;->l(J)Z

    .line 609
    .line 610
    .line 611
    new-instance v0, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    const-string p1, "] \u5df2\u5b8c\u5168\u88ab\u6e05\u9664"

    .line 624
    .line 625
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    return-void
.end method

.method public final getBoxStore()Lio/objectbox/BoxStore;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->tempStore:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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

.method public final declared-synchronized init(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->tempStore:Lio/objectbox/BoxStore;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->builder()Lio/objectbox/b;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/objectbox/b;->a(Landroid/content/Context;)V

    const-wide/32 v1, 0x200000

    .line 4
    iput-wide v1, v0, Lio/objectbox/b;->e:J

    .line 5
    invoke-virtual {v0}, Lio/objectbox/b;->b()Lio/objectbox/BoxStore;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/utils/BoardBox;->setBoxStore(Lio/objectbox/BoxStore;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 7
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized init(Ljava/io/File;)V
    .locals 2
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "testFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->tempStore:Lio/objectbox/BoxStore;

    if-nez v0, :cond_3

    .line 9
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->builder()Lio/objectbox/b;

    move-result-object v0

    .line 10
    iget-object v1, v0, Lio/objectbox/b;->d:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 11
    iget-boolean v1, v0, Lio/objectbox/b;->g:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Lio/objectbox/b;->c:Ljava/io/File;

    if-nez v1, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Already has base directory, cannot assign directory"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_1
    :goto_0
    iput-object p1, v0, Lio/objectbox/b;->b:Ljava/io/File;

    .line 14
    invoke-virtual {v0}, Lio/objectbox/b;->b()Lio/objectbox/BoxStore;

    move-result-object p1

    .line 15
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/utils/BoardBox;->setBoxStore(Lio/objectbox/BoxStore;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 16
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Already has name, cannot assign directory"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
