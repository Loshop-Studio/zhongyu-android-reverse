.class public abstract Lyd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lvc/c;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lkotlinx/coroutines/DispatchException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lkotlinx/coroutines/DispatchException;

    .line 6
    .line 7
    invoke-virtual {p1}, Lkotlinx/coroutines/DispatchException;->getCause()Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p0, v0}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public static final b(Lhd/p;Ljava/lang/Object;Lvc/c;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->b(Lhd/p;Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 10
    .line 11
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1}, Lxd/i;->b(Lvc/c;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    invoke-static {p2, p0}, Lyd/a;->a(Lvc/c;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static final c(Lvc/c;Lvc/c;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 6
    .line 7
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Lxd/i;->b(Lvc/c;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-static {p1, p0}, Lyd/a;->a(Lvc/c;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
