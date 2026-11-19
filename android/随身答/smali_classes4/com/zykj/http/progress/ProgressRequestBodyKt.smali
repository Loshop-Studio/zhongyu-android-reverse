.class public final Lcom/zykj/http/progress/ProgressRequestBodyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ljava/io/File;",
        "Ll8/t;",
        "contentType",
        "Lcom/zykj/http/listener/UploadProgressListener;",
        "listener",
        "Lcom/zykj/http/progress/ProgressRequestBody;",
        "asProgressRequestBody",
        "(Ljava/io/File;Ll8/t;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;",
        "http_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final asProgressRequestBody(Ljava/io/File;Ll8/t;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/http/progress/ProgressRequestBody;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2}, Lcom/zykj/http/progress/ProgressRequestBody;-><init>(Ljava/io/File;Ll8/t;Lcom/zykj/http/listener/UploadProgressListener;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
