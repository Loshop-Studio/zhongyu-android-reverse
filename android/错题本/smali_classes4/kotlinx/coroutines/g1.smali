.class public final Lkotlinx/coroutines/g1;
.super Lh6/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/w0;


# static fields
.field public static final a:Lkotlinx/coroutines/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/g1;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/v0;->a:Lkotlinx/coroutines/v0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh6/a;-><init>(Lh6/g;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlinx/coroutines/g1;->a:Lkotlinx/coroutines/g1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public final e(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final f()Ljava/util/concurrent/CancellationException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final g(Lkotlinx/coroutines/c1;)Lkotlinx/coroutines/j;
    .locals 0

    .line 1
    sget-object p1, Lkotlinx/coroutines/h1;->a:Lkotlinx/coroutines/h1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final h(Lr6/c;)Lkotlinx/coroutines/g0;
    .locals 0

    .line 1
    sget-object p1, Lkotlinx/coroutines/h1;->a:Lkotlinx/coroutines/h1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final p(ZZLr6/c;)Lkotlinx/coroutines/g0;
    .locals 0

    .line 1
    sget-object p1, Lkotlinx/coroutines/h1;->a:Lkotlinx/coroutines/h1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final start()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonCancellable"

    .line 2
    .line 3
    return-object v0
.end method
