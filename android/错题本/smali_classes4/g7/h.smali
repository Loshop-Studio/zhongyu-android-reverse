.class public abstract Lg7/h;
.super Lkotlinx/coroutines/p0;
.source "SourceFile"


# instance fields
.field public a:Lg7/c;


# virtual methods
.method public final d()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lg7/h;->a:Lg7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final dispatch(Lh6/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lg7/h;->a:Lg7/c;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-static {p1, p2, v0}, Lg7/c;->c(Lg7/c;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final dispatchYield(Lh6/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lg7/h;->a:Lg7/c;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-static {p1, p2, v0}, Lg7/c;->c(Lg7/c;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
