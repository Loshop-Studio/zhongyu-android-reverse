.class public interface abstract Lcom/zykj/blackboard/core/loader/SourceLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "",
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


# virtual methods
.method public abstract getFileCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getGeometryCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMatrixCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getTextCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getTouchCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract initPath(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract path()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract release()V
.end method
