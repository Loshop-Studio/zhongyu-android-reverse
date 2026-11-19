.class public final Lcom/zykj/http/progress/ProgressRequestBodyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final asProgressRequestBody(Ljava/io/File;Lje/t;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/http/progress/ProgressRequestBody;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2}, Lcom/zykj/http/progress/ProgressRequestBody;-><init>(Ljava/io/File;Lje/t;Lcom/zykj/http/listener/UploadProgressListener;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
