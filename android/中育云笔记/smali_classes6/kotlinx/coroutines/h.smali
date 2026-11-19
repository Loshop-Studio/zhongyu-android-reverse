.class public final Lkotlinx/coroutines/h;
.super Lkotlin/coroutines/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/g;


# static fields
.field public static final c:Lkotlinx/coroutines/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/h;

    invoke-direct {v0}, Lkotlinx/coroutines/h;-><init>()V

    sput-object v0, Lkotlinx/coroutines/h;->c:Lkotlinx/coroutines/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/g;->b0:Lkotlinx/coroutines/g$b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/d$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A(Lhd/l;)Lsd/t0;
    .locals 0

    .line 1
    sget-object p1, Lsd/v1;->c:Lsd/v1;

    .line 2
    .line 3
    return-object p1
.end method

.method public cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public g()Ljava/util/concurrent/CancellationException;
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

.method public isCompleted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public start()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t(ZZLhd/l;)Lsd/t0;
    .locals 0

    .line 1
    sget-object p1, Lsd/v1;->c:Lsd/v1;

    .line 2
    .line 3
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonCancellable"

    .line 2
    .line 3
    return-object v0
.end method

.method public v(Lvc/c;)Ljava/lang/Object;
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

.method public y(Lsd/r;)Lsd/p;
    .locals 0

    .line 1
    sget-object p1, Lsd/v1;->c:Lsd/v1;

    .line 2
    .line 3
    return-object p1
.end method
