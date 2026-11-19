.class public final Lcom/zykj/http/progress/ProgressRequestBodyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final asProgressRequestBody(Ljava/io/File;Lokhttp3/MediaType;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lokhttp3/MediaType;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/http/listener/UploadProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/http/progress/ProgressRequestBody;

    invoke-direct {v0, p0, p1, p2}, Lcom/zykj/http/progress/ProgressRequestBody;-><init>(Ljava/io/File;Lokhttp3/MediaType;Lcom/zykj/http/listener/UploadProgressListener;)V

    return-object v0
.end method
