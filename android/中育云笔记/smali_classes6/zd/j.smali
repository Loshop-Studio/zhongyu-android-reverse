.class public final Lzd/j;
.super Lsd/e0;
.source "SourceFile"


# static fields
.field public static final c:Lzd/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzd/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lzd/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzd/j;->c:Lzd/j;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lsd/e0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public dispatch(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, Lzd/b;->i:Lzd/b;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, p2, v0, v1}, Lzd/e;->k(Ljava/lang/Runnable;ZZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public dispatchYield(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, Lzd/b;->i:Lzd/b;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, p2, v0, v0}, Lzd/e;->k(Ljava/lang/Runnable;ZZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public limitedParallelism(ILjava/lang/String;)Lsd/e0;
    .locals 1

    .line 1
    invoke-static {p1}, Lxd/l;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lzd/i;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0, p2}, Lxd/l;->b(Lsd/e0;Ljava/lang/String;)Lsd/e0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-super {p0, p1, p2}, Lsd/e0;->limitedParallelism(ILjava/lang/String;)Lsd/e0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method
