.class public abstract Lf3/b1;
.super Lf3/z0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf3/z0;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract X()Ljava/lang/Thread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method protected final Y(JLf3/a1$b;)V
    .locals 1
    .param p3    # Lf3/a1$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lf3/m0;->g:Lf3/m0;

    invoke-virtual {v0, p1, p2, p3}, Lf3/a1;->j0(JLf3/a1$b;)V

    return-void
.end method

.method protected final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf3/b1;->X()Ljava/lang/Thread;

    move-result-object v0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    .line 3
    invoke-static {}, Lf3/c;->a()Lf3/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
