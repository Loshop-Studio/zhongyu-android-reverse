.class public final Landroidx/paging/CombinedLoadStates;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final append:Landroidx/paging/LoadState;

.field private final hasError:Z

.field private final isIdle:Z

.field private final mediator:Landroidx/paging/LoadStates;

.field private final prepend:Landroidx/paging/LoadState;

.field private final refresh:Landroidx/paging/LoadState;

.field private final source:Landroidx/paging/LoadStates;


# direct methods
.method public constructor <init>(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V
    .locals 1

    const-string v0, "refresh"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prepend"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "append"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/paging/CombinedLoadStates;->refresh:Landroidx/paging/LoadState;

    .line 3
    iput-object p2, p0, Landroidx/paging/CombinedLoadStates;->prepend:Landroidx/paging/LoadState;

    .line 4
    iput-object p3, p0, Landroidx/paging/CombinedLoadStates;->append:Landroidx/paging/LoadState;

    .line 5
    iput-object p4, p0, Landroidx/paging/CombinedLoadStates;->source:Landroidx/paging/LoadStates;

    .line 6
    iput-object p5, p0, Landroidx/paging/CombinedLoadStates;->mediator:Landroidx/paging/LoadStates;

    .line 7
    invoke-virtual {p4}, Landroidx/paging/LoadStates;->isIdle()Z

    move-result p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-eqz p1, :cond_1

    if-eqz p5, :cond_0

    invoke-virtual {p5}, Landroidx/paging/LoadStates;->isIdle()Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    if-eqz p1, :cond_1

    move p1, p3

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    iput-boolean p1, p0, Landroidx/paging/CombinedLoadStates;->isIdle:Z

    .line 8
    invoke-virtual {p4}, Landroidx/paging/LoadStates;->hasError()Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz p5, :cond_2

    invoke-virtual {p5}, Landroidx/paging/LoadStates;->hasError()Z

    move-result p1

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    if-eqz p1, :cond_4

    :cond_3
    move p2, p3

    :cond_4
    iput-boolean p2, p0, Landroidx/paging/CombinedLoadStates;->hasError:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;ILkotlin/jvm/internal/n;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Landroidx/paging/CombinedLoadStates;-><init>(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_7

    .line 7
    .line 8
    const-class v2, Landroidx/paging/CombinedLoadStates;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Landroidx/paging/CombinedLoadStates;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/paging/CombinedLoadStates;->refresh:Landroidx/paging/LoadState;

    .line 20
    .line 21
    iget-object v3, p1, Landroidx/paging/CombinedLoadStates;->refresh:Landroidx/paging/LoadState;

    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    iget-object v2, p0, Landroidx/paging/CombinedLoadStates;->prepend:Landroidx/paging/LoadState;

    .line 31
    .line 32
    iget-object v3, p1, Landroidx/paging/CombinedLoadStates;->prepend:Landroidx/paging/LoadState;

    .line 33
    .line 34
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    iget-object v2, p0, Landroidx/paging/CombinedLoadStates;->append:Landroidx/paging/LoadState;

    .line 42
    .line 43
    iget-object v3, p1, Landroidx/paging/CombinedLoadStates;->append:Landroidx/paging/LoadState;

    .line 44
    .line 45
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_4

    .line 50
    .line 51
    return v1

    .line 52
    :cond_4
    iget-object v2, p0, Landroidx/paging/CombinedLoadStates;->source:Landroidx/paging/LoadStates;

    .line 53
    .line 54
    iget-object v3, p1, Landroidx/paging/CombinedLoadStates;->source:Landroidx/paging/LoadStates;

    .line 55
    .line 56
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    return v1

    .line 63
    :cond_5
    iget-object v2, p0, Landroidx/paging/CombinedLoadStates;->mediator:Landroidx/paging/LoadStates;

    .line 64
    .line 65
    iget-object p1, p1, Landroidx/paging/CombinedLoadStates;->mediator:Landroidx/paging/LoadStates;

    .line 66
    .line 67
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_6

    .line 72
    .line 73
    return v1

    .line 74
    :cond_6
    return v0

    .line 75
    :cond_7
    :goto_0
    return v1
.end method

.method public final forEach$paging_common(Lhd/q;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "op"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/CombinedLoadStates;->source:Landroidx/paging/LoadStates;

    .line 7
    .line 8
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-interface {p1, v1, v3, v2}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object v2, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {p1, v2, v3, v4}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {p1, v4, v3, v0}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/paging/CombinedLoadStates;->mediator:Landroidx/paging/LoadStates;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-interface {p1, v1, v5, v3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {p1, v2, v5, v1}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p1, v4, v5, v0}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public final getAppend()Landroidx/paging/LoadState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/CombinedLoadStates;->append:Landroidx/paging/LoadState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMediator()Landroidx/paging/LoadStates;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/CombinedLoadStates;->mediator:Landroidx/paging/LoadStates;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrepend()Landroidx/paging/LoadState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/CombinedLoadStates;->prepend:Landroidx/paging/LoadState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRefresh()Landroidx/paging/LoadState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/CombinedLoadStates;->refresh:Landroidx/paging/LoadState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSource()Landroidx/paging/LoadStates;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/CombinedLoadStates;->source:Landroidx/paging/LoadStates;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hasError()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/CombinedLoadStates;->hasError:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/CombinedLoadStates;->refresh:Landroidx/paging/LoadState;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->prepend:Landroidx/paging/LoadState;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->append:Landroidx/paging/LoadState;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->source:Landroidx/paging/LoadStates;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->mediator:Landroidx/paging/LoadStates;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v1, 0x0

    .line 46
    :goto_0
    add-int/2addr v0, v1

    .line 47
    return v0
.end method

.method public final isIdle()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/CombinedLoadStates;->isIdle:Z

    .line 2
    .line 3
    return v0
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
    const-string v1, "CombinedLoadStates(refresh="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->refresh:Landroidx/paging/LoadState;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", prepend="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->prepend:Landroidx/paging/LoadState;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", append="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->append:Landroidx/paging/LoadState;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", source="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->source:Landroidx/paging/LoadStates;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", mediator="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/paging/CombinedLoadStates;->mediator:Landroidx/paging/LoadStates;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x29

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method
