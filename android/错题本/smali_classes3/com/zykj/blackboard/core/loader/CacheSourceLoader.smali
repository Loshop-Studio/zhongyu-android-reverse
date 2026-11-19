.class public final Lcom/zykj/blackboard/core/loader/CacheSourceLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/loader/SourceLoader;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jt\u0010\u0012\u001a\u0004\u0018\u00018\u0001\"\u0006\u0008\u0000\u0010\u0004\u0018\u0001\"\u0004\u0008\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0018\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b0\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00100\u000fH\u0082\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J-\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u00042\u0006\u0010\u0014\u001a\u00020\u00082\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J!\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J!\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008*\u0010\u0003J\u0017\u0010,\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008,\u0010-R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020.0\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R&\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002010\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00100R&\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002030\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00100R&\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002050\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00100R&\u00108\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002070\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00100R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u00109\u00a8\u0006:"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/loader/CacheSourceLoader;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "<init>",
        "()V",
        "T",
        "N",
        "",
        "sourceFileName",
        "",
        "sourceId",
        "",
        "Ljava/lang/ref/SoftReference;",
        "cacheMap",
        "Lkotlin/Function0;",
        "callForGet",
        "Lkotlin/Function1;",
        "",
        "mapToList",
        "getDataByCache",
        "(Ljava/lang/String;ILjava/util/Map;Lr6/a;Lr6/c;)Ljava/lang/Object;",
        "index",
        "list",
        "getIndexInList",
        "(ILjava/util/List;)Ljava/lang/Object;",
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
        "Ld6/s;",
        "release",
        "pageRootPath",
        "initPath",
        "(Ljava/lang/String;)V",
        "Lcom/zykj/board/EzySource$FileSource;",
        "cacheFileMap",
        "Ljava/util/Map;",
        "Lcom/zykj/board/EzySource$TouchSource;",
        "cacheTouchMap",
        "Lcom/zykj/board/EzySource$MatrixSource;",
        "cacheMatrixMap",
        "Lcom/zykj/board/EzySource$TextSource;",
        "cacheTextMap",
        "Lcom/zykj/board/EzySource$GeometrySource;",
        "cacheGeometryMap",
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
.field private final cacheFileMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference<",
            "Lcom/zykj/board/EzySource$FileSource;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cacheGeometryMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference<",
            "Lcom/zykj/board/EzySource$GeometrySource;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cacheMatrixMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference<",
            "Lcom/zykj/board/EzySource$MatrixSource;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cacheTextMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference<",
            "Lcom/zykj/board/EzySource$TextSource;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cacheTouchMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference<",
            "Lcom/zykj/board/EzySource$TouchSource;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

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
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheFileMap:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheTouchMap:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheMatrixMap:Ljava/util/Map;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheTextMap:Ljava/util/Map;

    .line 31
    .line 32
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheGeometryMap:Ljava/util/Map;

    .line 38
    .line 39
    const-string v0, ""

    .line 40
    .line 41
    iput-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method

.method private final synthetic getDataByCache(Ljava/lang/String;ILjava/util/Map;Lr6/a;Lr6/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "N:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference<",
            "TT;>;>;",
            "Lr6/a;",
            "Lr6/c;",
            ")TN;"
        }
    .end annotation

    .line 1
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-nez v0, :cond_4

    .line 17
    .line 18
    :try_start_0
    invoke-interface {p4}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    invoke-static {p4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p4

    .line 28
    invoke-static {p4}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    invoke-static {p4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    :goto_1
    invoke-static {p4}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    const-string v0, "CacheSourceLoader:getDataByCache ["

    .line 43
    .line 44
    const-string v2, "] \u6587\u4ef6\u8f6c\u5316\u6570\u636e\u5931\u8d25"

    .line 45
    .line 46
    invoke-static {v0, p1, v2}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-static {p4}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    move-object p4, v1

    .line 64
    :cond_2
    if-eqz p4, :cond_3

    .line 65
    .line 66
    new-instance v0, Ljava/lang/ref/SoftReference;

    .line 67
    .line 68
    invoke-direct {v0, p4}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-interface {p5, p4}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Ljava/util/List;

    .line 79
    .line 80
    invoke-direct {p0, p2, p1}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->getIndexInList(ILjava/util/List;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :cond_3
    return-object v1

    .line 86
    :cond_4
    invoke-interface {p5, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/util/List;

    .line 91
    .line 92
    invoke-direct {p0, p2, p1}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->getIndexInList(ILjava/util/List;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1
.end method

.method private final getIndexInList(ILjava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/util/List<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method


# virtual methods
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheFileMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v2

    .line 23
    :goto_0
    const-string v3, "it.fileInfoList"

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    :try_start_0
    sget-object v1, Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord$Companion;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v4, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord$Companion;->getFileSource(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const-string v4, "CacheSourceLoader:getDataByCache ["

    .line 56
    .line 57
    const-string v5, "] \u6587\u4ef6\u8f6c\u5316\u6570\u636e\u5931\u8d25"

    .line 58
    .line 59
    invoke-static {v4, p1, v5}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    move-object v1, v2

    .line 77
    :cond_2
    if-eqz v1, :cond_4

    .line 78
    .line 79
    new-instance v2, Ljava/lang/ref/SoftReference;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    check-cast v1, Lcom/zykj/board/EzySource$FileSource;

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$FileSource;->getFileInfoList()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, p2, p1}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->getIndexInList(ILjava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    check-cast v1, Lcom/zykj/board/EzySource$FileSource;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    :goto_3
    check-cast v2, Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 105
    .line 106
    return-object v2
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheGeometryMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v2

    .line 23
    :goto_0
    const-string v3, "it.geometryInfoList"

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    :try_start_0
    sget-object v1, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord$Companion;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v4, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord$Companion;->getGeometrySource(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$GeometrySource;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const-string v4, "CacheSourceLoader:getDataByCache ["

    .line 56
    .line 57
    const-string v5, "] \u6587\u4ef6\u8f6c\u5316\u6570\u636e\u5931\u8d25"

    .line 58
    .line 59
    invoke-static {v4, p1, v5}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    move-object v1, v2

    .line 77
    :cond_2
    if-eqz v1, :cond_4

    .line 78
    .line 79
    new-instance v2, Ljava/lang/ref/SoftReference;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    check-cast v1, Lcom/zykj/board/EzySource$GeometrySource;

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$GeometrySource;->getGeometryInfoList()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, p2, p1}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->getIndexInList(ILjava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    check-cast v1, Lcom/zykj/board/EzySource$GeometrySource;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    :goto_3
    check-cast v2, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 105
    .line 106
    return-object v2
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheMatrixMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v2

    .line 23
    :goto_0
    const-string v3, "it.matrixInfoList"

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    :try_start_0
    sget-object v1, Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord$Companion;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v4, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord$Companion;->getMatrixSource(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$MatrixSource;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const-string v4, "CacheSourceLoader:getDataByCache ["

    .line 56
    .line 57
    const-string v5, "] \u6587\u4ef6\u8f6c\u5316\u6570\u636e\u5931\u8d25"

    .line 58
    .line 59
    invoke-static {v4, p1, v5}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    move-object v1, v2

    .line 77
    :cond_2
    if-eqz v1, :cond_4

    .line 78
    .line 79
    new-instance v2, Ljava/lang/ref/SoftReference;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    check-cast v1, Lcom/zykj/board/EzySource$MatrixSource;

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$MatrixSource;->getMatrixInfoList()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, p2, p1}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->getIndexInList(ILjava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    check-cast v1, Lcom/zykj/board/EzySource$MatrixSource;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    :goto_3
    check-cast v2, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 105
    .line 106
    return-object v2
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheTextMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v2

    .line 23
    :goto_0
    const-string v3, "it.textInfoList"

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    :try_start_0
    sget-object v1, Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord$Companion;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v4, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord$Companion;->getTextSource(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const-string v4, "CacheSourceLoader:getDataByCache ["

    .line 56
    .line 57
    const-string v5, "] \u6587\u4ef6\u8f6c\u5316\u6570\u636e\u5931\u8d25"

    .line 58
    .line 59
    invoke-static {v4, p1, v5}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    move-object v1, v2

    .line 77
    :cond_2
    if-eqz v1, :cond_4

    .line 78
    .line 79
    new-instance v2, Ljava/lang/ref/SoftReference;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    check-cast v1, Lcom/zykj/board/EzySource$TextSource;

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TextSource;->getTextInfoList()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, p2, p1}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->getIndexInList(ILjava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    check-cast v1, Lcom/zykj/board/EzySource$TextSource;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    :goto_3
    check-cast v2, Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 105
    .line 106
    return-object v2
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheTouchMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v2

    .line 23
    :goto_0
    const-string v3, "it.touchInfoList"

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    :try_start_0
    sget-object v1, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord$Companion;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v4, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord$Companion;->getTouchSource(Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TouchSource;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const-string v4, "CacheSourceLoader:getDataByCache ["

    .line 56
    .line 57
    const-string v5, "] \u6587\u4ef6\u8f6c\u5316\u6570\u636e\u5931\u8d25"

    .line 58
    .line 59
    invoke-static {v4, p1, v5}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    move-object v1, v2

    .line 77
    :cond_2
    if-eqz v1, :cond_4

    .line 78
    .line 79
    new-instance v2, Ljava/lang/ref/SoftReference;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    check-cast v1, Lcom/zykj/board/EzySource$TouchSource;

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1}, Lcom/zykj/board/EzySource$TouchSource;->getTouchInfoList()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, p2, p1}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->getIndexInList(ILjava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    check-cast v1, Lcom/zykj/board/EzySource$TouchSource;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    :goto_3
    check-cast v2, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 105
    .line 106
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public path()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->pageRootPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheTouchMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheFileMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheMatrixMap:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheTextMap:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->cacheGeometryMap:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
