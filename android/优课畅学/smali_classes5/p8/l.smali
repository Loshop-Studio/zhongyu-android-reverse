.class public final Lp8/l;
.super Lkotlinx/coroutines/CoroutineDispatcher;
.source "SourceFile"


# static fields
.field public static final a:Lp8/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp8/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lp8/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp8/l;->a:Lp8/l;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/CoroutineDispatcher;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public dispatch(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, Lp8/b;->g:Lp8/b;

    .line 2
    .line 3
    sget-object v0, Lp8/k;->h:Lp8/h;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, p2, v0, v1}, Lp8/e;->o(Ljava/lang/Runnable;Lp8/h;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public dispatchYield(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, Lp8/b;->g:Lp8/b;

    .line 2
    .line 3
    sget-object v0, Lp8/k;->h:Lp8/h;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, p2, v0, v1}, Lp8/e;->o(Ljava/lang/Runnable;Lp8/h;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public limitedParallelism(I)Lkotlinx/coroutines/CoroutineDispatcher;
    .locals 1

    .line 1
    invoke-static {p1}, Ln8/n;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lp8/k;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lkotlinx/coroutines/CoroutineDispatcher;->limitedParallelism(I)Lkotlinx/coroutines/CoroutineDispatcher;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
