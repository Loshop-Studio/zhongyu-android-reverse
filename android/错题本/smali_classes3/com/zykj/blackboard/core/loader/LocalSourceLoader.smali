# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/loader/LocalSourceLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/loader/SourceLoader;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JJ\u0010\u000b\u001a\u00020\t\"\u0006\u0008\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0007H\u0082\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008 \u0010\u0003J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010$\u001a\u00020\t\u00a2\u0006\u0004\u0008$\u0010\u0003R\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010%R4\u0010)\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\'0&j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\'`(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u001a\u0004\u0008,\u0010.\"\u0004\u0008/\u00100\u00a8\u00061"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/loader/LocalSourceLoader;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "<init>",
        "()V",
        "T",
        "",
        "sourceFileName",
        "Lkotlin/Function1;",
        "callForGet",
        "Ld6/s;",
        "callForHandle",
        "handleRecordEntity",
        "(Ljava/lang/String;Lr6/c;Lr6/c;)V",
        "",
        "sourceId",
        "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;",
        "getTouchCache",
        "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;",
        "Lcom/zykj/board/EzySource$FileSource$FileInfo;",
        "getFileCache",
        "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;",
        "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;",
        "getMatrixCache",
        "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;",
        "Lcom/zykj/board/EzySource$TextSource$TextInfo;",
        "getTextCache",
        "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;",
        "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;",
        "getGeometryCache",
        "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;",
        "path",
        "()Ljava/lang/String;",
        "release",
        "pageRootPath",
        "initPath",
        "(Ljava/lang/String;)V",
        "cleanCache",
        "Ljava/lang/String;",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "cacheHashMap",
        "Ljava/util/HashMap;",
        "",
        "isCacheAble",
        "Z",
        "()Z",
        "setCacheAble",
        "(Z)V",
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


# instance fields
.field private final cacheHashMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isCacheAble:Z

.field private pageRootPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method private final handleRecordEntity(Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->isCacheAble:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-interface {p2, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-interface {p3, p2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    iget-object p2, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    throw p1
.end method


# virtual methods
.method public final cleanCache()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getFileCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "sourceFileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->isCacheAble:Z

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "BoardBox.boxStore.boxFor\u2026                 }.find()"

    .line 12
    .line 13
    const-class v4, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v0, v0, [Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 41
    .line 42
    const-string p2, "null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.FileInfoEntity?>"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 63
    .line 64
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 93
    .line 94
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move-object v0, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 121
    .line 122
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 141
    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 151
    .line 152
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :goto_1
    if-eqz v0, :cond_4

    .line 161
    .line 162
    iget-object v1, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    array-length p1, v0

    .line 168
    if-ge p2, p1, :cond_4

    .line 169
    .line 170
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 171
    .line 172
    aget-object p2, v0, p2

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->fileInfoConvertEzyFileInfo(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :cond_4
    return-object v5
.end method

.method public getGeometryCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "sourceFileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->isCacheAble:Z

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "BoardBox.boxStore.boxFor\u2026                 }.find()"

    .line 12
    .line 13
    const-class v4, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v0, v0, [Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 41
    .line 42
    const-string p2, "null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.GeometryInfoEntity?>"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 63
    .line 64
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 93
    .line 94
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move-object v0, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 121
    .line 122
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 141
    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 151
    .line 152
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :goto_1
    if-eqz v0, :cond_4

    .line 161
    .line 162
    iget-object v1, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    array-length p1, v0

    .line 168
    if-ge p2, p1, :cond_4

    .line 169
    .line 170
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 171
    .line 172
    aget-object p2, v0, p2

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->geometryInfoConvertEzyGeometryInfo(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :cond_4
    return-object v5
.end method

.method public getMatrixCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "sourceFileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->isCacheAble:Z

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "BoardBox.boxStore.boxFor\u2026                 }.find()"

    .line 12
    .line 13
    const-class v4, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v0, v0, [Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 41
    .line 42
    const-string p2, "null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.MatrixEventEntity?>"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 63
    .line 64
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 93
    .line 94
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move-object v0, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 121
    .line 122
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 141
    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 151
    .line 152
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :goto_1
    if-eqz v0, :cond_4

    .line 161
    .line 162
    iget-object v1, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    array-length p1, v0

    .line 168
    if-ge p2, p1, :cond_4

    .line 169
    .line 170
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 171
    .line 172
    aget-object p2, v0, p2

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->matrixEventConvertEzyMatrixInfo(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :cond_4
    return-object v5
.end method

.method public getTextCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "sourceFileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->isCacheAble:Z

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "BoardBox.boxStore.boxFor\u2026                 }.find()"

    .line 12
    .line 13
    const-class v4, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v0, v0, [Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 41
    .line 42
    const-string p2, "null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TextInfoEntity?>"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 63
    .line 64
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getTextInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 93
    .line 94
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move-object v0, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 121
    .line 122
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 141
    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getTextInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 151
    .line 152
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :goto_1
    if-eqz v0, :cond_4

    .line 161
    .line 162
    iget-object v1, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    array-length p1, v0

    .line 168
    if-ge p2, p1, :cond_4

    .line 169
    .line 170
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 171
    .line 172
    aget-object p2, v0, p2

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->textInfoConvertEzyTextInfo(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :cond_4
    return-object v5
.end method

.method public getTouchCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "sourceFileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->isCacheAble:Z

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "BoardBox.boxStore.boxFor\u2026                 }.find()"

    .line 12
    .line 13
    const-class v4, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v0, v0, [Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 41
    .line 42
    const-string p2, "null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TouchEventEntity?>"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 63
    .line 64
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 93
    .line 94
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    check-cast v0, [Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move-object v0, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0, v4}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 121
    .line 122
    invoke-virtual {v0, v4, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lio/objectbox/query/Query;->b()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 141
    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    new-array v2, v2, [Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 151
    .line 152
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :goto_1
    if-eqz v0, :cond_4

    .line 161
    .line 162
    iget-object v1, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cacheHashMap:Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    array-length p1, v0

    .line 168
    if-ge p2, p1, :cond_4

    .line 169
    .line 170
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 171
    .line 172
    aget-object p2, v0, p2

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->touchInfoConvertEzyTouchInfo(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :cond_4
    return-object v5
.end method

.method public initPath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pageRootPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final isCacheAble()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->isCacheAble:Z

    .line 2
    .line 3
    return v0
.end method

.method public path()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public final setCacheAble(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->isCacheAble:Z

    .line 2
    .line 3
    return-void
.end method
