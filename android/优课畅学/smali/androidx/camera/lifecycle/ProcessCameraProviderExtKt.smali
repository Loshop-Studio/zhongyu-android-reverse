.class public final Landroidx/camera/lifecycle/ProcessCameraProviderExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final awaitInstance(Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;Landroid/content/Context;Lm7/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;",
            "Landroid/content/Context;",
            "Lm7/c<",
            "-",
            "Landroidx/camera/lifecycle/ProcessCameraProvider;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;->getInstance(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p2}, Landroidx/concurrent/futures/ListenableFutureKt;->await(Lcom/google/common/util/concurrent/ListenableFuture;Lm7/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
