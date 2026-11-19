.class public abstract synthetic Lvd/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhd/l;

.field public static final b:Lhd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lvd/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lvd/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvd/j;->a:Lhd/l;

    .line 7
    .line 8
    new-instance v0, Lvd/i;

    .line 9
    .line 10
    invoke-direct {v0}, Lvd/i;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lvd/j;->b:Lhd/p;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvd/j;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lvd/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static final e(Lvd/c;)Lvd/c;
    .locals 2

    .line 1
    instance-of v0, p0, Lvd/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object v0, Lvd/j;->a:Lhd/l;

    .line 7
    .line 8
    sget-object v1, Lvd/j;->b:Lhd/p;

    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Lvd/j;->h(Lvd/c;Lhd/l;Lhd/p;)Lvd/c;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final f(Lvd/c;Lhd/p;)Lvd/c;
    .locals 2

    .line 1
    sget-object v0, Lvd/j;->a:Lhd/l;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-static {p1, v1}, Lkotlin/jvm/internal/d0;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lhd/p;

    .line 14
    .line 15
    invoke-static {p0, v0, p1}, Lvd/j;->h(Lvd/c;Lhd/l;Lhd/p;)Lvd/c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final g(Lvd/c;Lhd/l;)Lvd/c;
    .locals 1

    .line 1
    sget-object v0, Lvd/j;->b:Lhd/p;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lvd/j;->h(Lvd/c;Lhd/l;Lhd/p;)Lvd/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final h(Lvd/c;Lhd/l;Lhd/p;)Lvd/c;
    .locals 2

    .line 1
    instance-of v0, p0, Lkotlinx/coroutines/flow/DistinctFlowImpl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/DistinctFlowImpl;

    .line 7
    .line 8
    iget-object v1, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl;->d:Lhd/l;

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lkotlinx/coroutines/flow/DistinctFlowImpl;->e:Lhd/p;

    .line 13
    .line 14
    if-ne v0, p2, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/DistinctFlowImpl;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1, p2}, Lkotlinx/coroutines/flow/DistinctFlowImpl;-><init>(Lvd/c;Lhd/l;Lhd/p;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
