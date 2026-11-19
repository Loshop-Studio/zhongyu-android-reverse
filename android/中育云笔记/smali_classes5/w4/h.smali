.class public abstract Lw4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lx4/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lx4/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lx4/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw4/h;->a:Lx4/e;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lw4/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lw4/h;->a:Lx4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lw4/e;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lx4/e;->a(Lw4/e;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance v1, Lx4/e$a;

    .line 28
    .line 29
    invoke-direct {v1}, Lx4/e$a;-><init>()V

    .line 30
    .line 31
    .line 32
    move-object v2, p0

    .line 33
    check-cast v2, Lx4/d;

    .line 34
    .line 35
    invoke-static {}, Lw4/g;->a()Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3, v1}, Lx4/d;->i(Ljava/util/concurrent/Executor;Lw4/d;)Lw4/e;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2, v1}, Lw4/e;->a(Lw4/c;)Lw4/e;

    .line 44
    .line 45
    .line 46
    iget-object v1, v1, Lx4/e$a;->a:Ljava/util/concurrent/CountDownLatch;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Lx4/e;->a(Lw4/e;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "await must not be called on the UI thread"

    .line 59
    .line 60
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0
.end method
