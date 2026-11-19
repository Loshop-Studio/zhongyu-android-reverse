.class public final Lf3/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Lf3/z0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lf3/f;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lf3/f;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
