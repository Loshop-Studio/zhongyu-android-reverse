.class public final Landroidx/paging/HintHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/HintHandler$HintFlow;,
        Landroidx/paging/HintHandler$State;,
        Landroidx/paging/HintHandler$WhenMappings;
    }
.end annotation


# instance fields
.field private final state:Landroidx/paging/HintHandler$State;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/paging/HintHandler$State;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/paging/HintHandler$State;-><init>(Landroidx/paging/HintHandler;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/paging/HintHandler;->state:Landroidx/paging/HintHandler$State;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Landroidx/paging/ViewportHint;Landroidx/paging/HintHandler$HintFlow;Landroidx/paging/HintHandler$HintFlow;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/HintHandler;->processHint$lambda$0(Landroidx/paging/ViewportHint;Landroidx/paging/HintHandler$HintFlow;Landroidx/paging/HintHandler$HintFlow;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Landroidx/paging/HintHandler$HintFlow;Landroidx/paging/HintHandler$HintFlow;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/paging/HintHandler;->forceSetHint$lambda$1(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Landroidx/paging/HintHandler$HintFlow;Landroidx/paging/HintHandler$HintFlow;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private static final forceSetHint$lambda$1(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Landroidx/paging/HintHandler$HintFlow;Landroidx/paging/HintHandler$HintFlow;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "prependHint"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appendHint"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 12
    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroidx/paging/HintHandler$HintFlow;->setValue(Landroidx/paging/ViewportHint;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p3, p1}, Landroidx/paging/HintHandler$HintFlow;->setValue(Landroidx/paging/ViewportHint;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p0
.end method

.method private static final processHint$lambda$0(Landroidx/paging/ViewportHint;Landroidx/paging/HintHandler$HintFlow;Landroidx/paging/HintHandler$HintFlow;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "prependHint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appendHint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/paging/HintHandler$HintFlow;->getValue()Landroidx/paging/ViewportHint;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 16
    .line 17
    invoke-static {p0, v0, v1}, Landroidx/paging/HintHandlerKt;->shouldPrioritizeOver(Landroidx/paging/ViewportHint;Landroidx/paging/ViewportHint;Landroidx/paging/LoadType;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Landroidx/paging/HintHandler$HintFlow;->setValue(Landroidx/paging/ViewportHint;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p2}, Landroidx/paging/HintHandler$HintFlow;->getValue()Landroidx/paging/ViewportHint;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 31
    .line 32
    invoke-static {p0, p1, v0}, Landroidx/paging/HintHandlerKt;->shouldPrioritizeOver(Landroidx/paging/ViewportHint;Landroidx/paging/ViewportHint;Landroidx/paging/LoadType;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2, p0}, Landroidx/paging/HintHandler$HintFlow;->setValue(Landroidx/paging/ViewportHint;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 42
    .line 43
    return-object p0
.end method


# virtual methods
.method public final forceSetHint(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)V
    .locals 2

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewportHint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 12
    .line 13
    if-eq p1, v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 16
    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v0, "invalid load type for reset: "

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p2

    .line 47
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/paging/HintHandler;->state:Landroidx/paging/HintHandler$State;

    .line 48
    .line 49
    new-instance v1, Landroidx/paging/s;

    .line 50
    .line 51
    invoke-direct {v1, p1, p2}, Landroidx/paging/s;-><init>(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    invoke-virtual {v0, p1, v1}, Landroidx/paging/HintHandler$State;->modify(Landroidx/paging/ViewportHint$Access;Lhd/p;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final getLastAccessHint()Landroidx/paging/ViewportHint$Access;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/HintHandler;->state:Landroidx/paging/HintHandler$State;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/HintHandler$State;->getLastAccessHint()Landroidx/paging/ViewportHint$Access;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final hintFor(Landroidx/paging/LoadType;)Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/paging/HintHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aget p1, v0, p1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/paging/HintHandler;->state:Landroidx/paging/HintHandler$State;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/paging/HintHandler$State;->getAppendFlow()Lvd/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string v0, "invalid load type for hints"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object p1, p0, Landroidx/paging/HintHandler;->state:Landroidx/paging/HintHandler$State;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/paging/HintHandler$State;->getPrependFlow()Lvd/c;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public final processHint(Landroidx/paging/ViewportHint;)V
    .locals 3

    .line 1
    const-string v0, "viewportHint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/HintHandler;->state:Landroidx/paging/HintHandler$State;

    .line 7
    .line 8
    instance-of v1, p1, Landroidx/paging/ViewportHint$Access;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move-object v1, p1

    .line 13
    check-cast v1, Landroidx/paging/ViewportHint$Access;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    new-instance v2, Landroidx/paging/r;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Landroidx/paging/r;-><init>(Landroidx/paging/ViewportHint;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Landroidx/paging/HintHandler$State;->modify(Landroidx/paging/ViewportHint$Access;Lhd/p;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
