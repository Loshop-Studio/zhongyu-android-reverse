.class public final Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/loader/SourceLoader;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "recordEntity",
        "<init>",
        "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V",
        "",
        "sourceFileName",
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
        "pageRootPath",
        "Ld6/s;",
        "initPath",
        "(Ljava/lang/String;)V",
        "release",
        "()V",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "Ljava/lang/String;",
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
.field private pageRootPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/data/dao/RecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "recordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getFileCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;
    .locals 4
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getFileList()Lio/objectbox/relation/ToMany;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v2

    .line 42
    :goto_0
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->fileInfoConvertEzyFileInfo(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    return-object v2
.end method

.method public getGeometryCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 4
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getGeometryList()Lio/objectbox/relation/ToMany;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getFileName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v2

    .line 42
    :goto_0
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->getGeometryInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->geometryInfoConvertEzyGeometryInfo(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    return-object v2
.end method

.method public getMatrixCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;
    .locals 4
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getMatrixList()Lio/objectbox/relation/ToMany;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v2

    .line 42
    :goto_0
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->matrixEventConvertEzyMatrixInfo(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    return-object v2
.end method

.method public getTextCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;
    .locals 4
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTextList()Lio/objectbox/relation/ToMany;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v2

    .line 42
    :goto_0
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getTextInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->textInfoConvertEzyTextInfo(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    return-object v2
.end method

.method public getTouchCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 4
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v2

    .line 42
    :goto_0
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    sget-object p1, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->touchInfoConvertEzyTouchInfo(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    return-object v2
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public path()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public release()V
    .locals 0

    return-void
.end method
