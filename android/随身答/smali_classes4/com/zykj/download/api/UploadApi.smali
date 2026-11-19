.class public interface abstract Lcom/zykj/download/api/UploadApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ;\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\n\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/zykj/download/api/UploadApi;",
        "",
        "",
        "url",
        "auth",
        "checksum",
        "Ll8/u$c;",
        "file",
        "",
        "gridFs",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll8/u$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "zyFs",
        "download_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract gridFs(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll8/u$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lf9/y;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lf9/i;
            value = "Authorization"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lf9/i;
            value = "Checksum"
        .end annotation
    .end param
    .param p4    # Ll8/u$c;
        .annotation runtime Lf9/q;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ll8/u$c;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lf9/l;
    .end annotation

    .annotation runtime Lf9/o;
    .end annotation
.end method

.method public abstract zyFs(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll8/u$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lf9/y;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lf9/i;
            value = "Authorization"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lf9/i;
            value = "Checksum"
        .end annotation
    .end param
    .param p4    # Ll8/u$c;
        .annotation runtime Lf9/q;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ll8/u$c;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lf9/l;
    .end annotation

    .annotation runtime Lf9/o;
    .end annotation
.end method
