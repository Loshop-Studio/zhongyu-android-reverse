.class public final Lg7/l;
.super Lkotlinx/coroutines/r;
.source "SourceFile"


# static fields
.field public static final a:Lg7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg7/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg7/l;->a:Lg7/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final dispatch(Lh6/h;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, Lg7/e;->b:Lg7/e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p1, p1, Lg7/h;->a:Lg7/c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, p2, v0, v1}, Lg7/c;->b(Ljava/lang/Runnable;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final dispatchYield(Lh6/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, Lg7/e;->b:Lg7/e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p1, p1, Lg7/h;->a:Lg7/c;

    .line 5
    .line 6
    invoke-virtual {p1, p2, v0, v0}, Lg7/c;->b(Ljava/lang/Runnable;ZZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final limitedParallelism(ILjava/lang/String;)Lkotlinx/coroutines/r;
    .locals 1

    .line 1
    invoke-static {p1}, Le7/a;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lg7/k;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    new-instance p1, Le7/l;

    .line 11
    .line 12
    invoke-direct {p1, p0, p2}, Le7/l;-><init>(Lkotlinx/coroutines/r;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    return-object p0

    .line 17
    :cond_1
    invoke-super {p0, p1, p2}, Lkotlinx/coroutines/r;->limitedParallelism(ILjava/lang/String;)Lkotlinx/coroutines/r;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method
