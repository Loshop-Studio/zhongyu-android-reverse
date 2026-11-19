.class public abstract Lkotlinx/coroutines/a;
.super Lkotlinx/coroutines/c1;
.source "SourceFile"

# interfaces
.implements Lh6/c;
.implements Lkotlinx/coroutines/v;


# instance fields
.field public final c:Lh6/h;


# direct methods
.method public constructor <init>(Lh6/h;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lkotlinx/coroutines/c1;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lkotlinx/coroutines/v0;->a:Lkotlinx/coroutines/v0;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lkotlinx/coroutines/w0;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/c1;->K(Lkotlinx/coroutines/w0;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lh6/h;->plus(Lh6/h;)Lh6/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lkotlinx/coroutines/a;->c:Lh6/h;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final J(Lkotlinx/coroutines/CompletionHandlerException;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/a;->c:Lh6/h;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlinx/coroutines/x;->p(Lh6/h;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final S(Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lkotlinx/coroutines/p;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lkotlinx/coroutines/p;

    .line 6
    .line 7
    iget-object v0, p1, Lkotlinx/coroutines/p;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    sget-object v1, Lkotlinx/coroutines/p;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-virtual {p0, v1, v0}, Lkotlinx/coroutines/a;->a0(ZLjava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/a;->b0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public a0(ZLjava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final getContext()Lh6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/a;->c:Lh6/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCoroutineContext()Lh6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/a;->c:Lh6/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lkotlinx/coroutines/p;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v1, v0}, Lkotlinx/coroutines/p;-><init>(ZLjava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/c1;->O(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lkotlinx/coroutines/x;->e:Le7/r;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/a;->t(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final y()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, " was cancelled"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
