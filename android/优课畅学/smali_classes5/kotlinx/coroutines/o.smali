.class public final Lkotlinx/coroutines/o;
.super Lkotlin/coroutines/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/n;


# static fields
.field public static final a:Lkotlinx/coroutines/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/o;

    invoke-direct {v0}, Lkotlinx/coroutines/o;-><init>()V

    sput-object v0, Lkotlinx/coroutines/o;->a:Lkotlinx/coroutines/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/n;->c0:Lkotlinx/coroutines/n$b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/d$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public e()Ljava/util/concurrent/CancellationException;
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

.method public getParent()Lkotlinx/coroutines/n;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k(Lx7/l;)Li8/k0;
    .locals 0

    .line 1
    sget-object p1, Li8/j1;->a:Li8/j1;

    .line 2
    .line 3
    return-object p1
.end method

.method public n(Lm7/c;)Ljava/lang/Object;
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

.method public p(ZZLx7/l;)Li8/k0;
    .locals 0

    .line 1
    sget-object p1, Li8/j1;->a:Li8/j1;

    .line 2
    .line 3
    return-object p1
.end method

.method public s(Li8/q;)Li8/o;
    .locals 0

    .line 1
    sget-object p1, Li8/j1;->a:Li8/j1;

    .line 2
    .line 3
    return-object p1
.end method

.method public start()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonCancellable"

    .line 2
    .line 3
    return-object v0
.end method
