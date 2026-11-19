.class public abstract Lsd/e0;
.super Lkotlin/coroutines/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsd/e0$a;
    }
.end annotation


# static fields
.field public static final Key:Lsd/e0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsd/e0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lsd/e0$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lsd/e0;->Key:Lsd/e0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lkotlin/coroutines/c;->a0:Lkotlin/coroutines/c$b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/d$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic limitedParallelism$default(Lsd/e0;ILjava/lang/String;ILjava/lang/Object;)Lsd/e0;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lsd/e0;->limitedParallelism(ILjava/lang/String;)Lsd/e0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: limitedParallelism"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public abstract dispatch(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V
.end method

.method public dispatchYield(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lxd/i;->c(Lsd/e0;Lkotlin/coroutines/d;Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/d$b;",
            ">(",
            "Lkotlin/coroutines/d$c;",
            ")TE;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/c$a;->a(Lkotlin/coroutines/c;Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final interceptContinuation(Lvc/c;)Lvc/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lvc/c<",
            "-TT;>;)",
            "Lvc/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lxd/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lxd/h;-><init>(Lsd/e0;Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public isDispatchNeeded(Lkotlin/coroutines/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public synthetic limitedParallelism(I)Lsd/e0;
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lsd/e0;->limitedParallelism(ILjava/lang/String;)Lsd/e0;

    move-result-object p1

    return-object p1
.end method

.method public limitedParallelism(ILjava/lang/String;)Lsd/e0;
    .locals 1

    .line 1
    invoke-static {p1}, Lxd/l;->a(I)V

    .line 2
    new-instance v0, Lxd/k;

    invoke-direct {v0, p0, p1, p2}, Lxd/k;-><init>(Lsd/e0;ILjava/lang/String;)V

    return-object v0
.end method

.method public minusKey(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d$c;",
            ")",
            "Lkotlin/coroutines/d;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lkotlin/coroutines/c$a;->b(Lkotlin/coroutines/c;Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final plus(Lsd/e0;)Lsd/e0;
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    return-object p1
.end method

.method public final releaseInterceptedContinuation(Lvc/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lxd/h;

    .line 7
    .line 8
    invoke-virtual {p1}, Lxd/h;->s()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lsd/j0;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x40

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lsd/j0;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
