.class public abstract Ll8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln8/d0;

.field public static final b:Ln8/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln8/d0;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln8/d0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll8/r;->a:Ln8/d0;

    .line 9
    .line 10
    new-instance v0, Ln8/d0;

    .line 11
    .line 12
    const-string v1, "PENDING"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ln8/d0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ll8/r;->b:Ln8/d0;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Ljava/lang/Object;)Ll8/h;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/StateFlowImpl;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lm8/l;->a:Ln8/d0;

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, Lkotlinx/coroutines/flow/StateFlowImpl;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final synthetic b()Ln8/d0;
    .locals 1

    .line 1
    sget-object v0, Ll8/r;->a:Ln8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()Ln8/d0;
    .locals 1

    .line 1
    sget-object v0, Ll8/r;->b:Ln8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d(Ll8/q;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ll8/c;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, Lkotlinx/coroutines/channels/BufferOverflow;->b:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    invoke-static {p0, p1, p2, p3}, Ll8/m;->e(Ll8/l;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ll8/c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
