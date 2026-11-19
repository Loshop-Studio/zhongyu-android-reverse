.class public interface abstract Lcom/zykj/blackboard/core/loader/SourceLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getFileCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;
.end method

.method public abstract getGeometryCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
.end method

.method public abstract getMatrixCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;
.end method

.method public abstract getTextCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;
.end method

.method public abstract getTouchCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
.end method

.method public abstract initPath(Ljava/lang/String;)V
.end method

.method public abstract path()Ljava/lang/String;
.end method

.method public abstract release()V
.end method
