.class public final Landroidx/paging/MutableLoadStateCollection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/MutableLoadStateCollection$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0006\"\u0004\u0008\u000b\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u0006\"\u0004\u0008\u000e\u0010\u0008\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/paging/MutableLoadStateCollection;",
        "",
        "()V",
        "append",
        "Landroidx/paging/LoadState;",
        "getAppend",
        "()Landroidx/paging/LoadState;",
        "setAppend",
        "(Landroidx/paging/LoadState;)V",
        "prepend",
        "getPrepend",
        "setPrepend",
        "refresh",
        "getRefresh",
        "setRefresh",
        "get",
        "loadType",
        "Landroidx/paging/LoadType;",
        "set",
        "",
        "states",
        "Landroidx/paging/LoadStates;",
        "type",
        "state",
        "snapshot",
        "paging-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private append:Landroidx/paging/LoadState;

.field private prepend:Landroidx/paging/LoadState;

.field private refresh:Landroidx/paging/LoadState;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Landroidx/paging/MutableLoadStateCollection;->refresh:Landroidx/paging/LoadState;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Landroidx/paging/MutableLoadStateCollection;->prepend:Landroidx/paging/LoadState;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Landroidx/paging/MutableLoadStateCollection;->append:Landroidx/paging/LoadState;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;
    .locals 1

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/paging/MutableLoadStateCollection$WhenMappings;->$EnumSwitchMapping$0:[I

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
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/paging/MutableLoadStateCollection;->prepend:Landroidx/paging/LoadState;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 27
    .line 28
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget-object p1, p0, Landroidx/paging/MutableLoadStateCollection;->append:Landroidx/paging/LoadState;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_2
    iget-object p1, p0, Landroidx/paging/MutableLoadStateCollection;->refresh:Landroidx/paging/LoadState;

    .line 36
    .line 37
    return-object p1
.end method

.method public final getAppend()Landroidx/paging/LoadState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/MutableLoadStateCollection;->append:Landroidx/paging/LoadState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrepend()Landroidx/paging/LoadState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/MutableLoadStateCollection;->prepend:Landroidx/paging/LoadState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRefresh()Landroidx/paging/LoadState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/MutableLoadStateCollection;->refresh:Landroidx/paging/LoadState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final set(Landroidx/paging/LoadStates;)V
    .locals 1

    const-string v0, "states"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    move-result-object v0

    iput-object v0, p0, Landroidx/paging/MutableLoadStateCollection;->refresh:Landroidx/paging/LoadState;

    .line 6
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    move-result-object v0

    iput-object v0, p0, Landroidx/paging/MutableLoadStateCollection;->append:Landroidx/paging/LoadState;

    .line 7
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/MutableLoadStateCollection;->prepend:Landroidx/paging/LoadState;

    return-void
.end method

.method public final set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Landroidx/paging/MutableLoadStateCollection$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 2
    iput-object p2, p0, Landroidx/paging/MutableLoadStateCollection;->prepend:Landroidx/paging/LoadState;

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 3
    :cond_1
    iput-object p2, p0, Landroidx/paging/MutableLoadStateCollection;->append:Landroidx/paging/LoadState;

    return-void

    .line 4
    :cond_2
    iput-object p2, p0, Landroidx/paging/MutableLoadStateCollection;->refresh:Landroidx/paging/LoadState;

    return-void
.end method

.method public final setAppend(Landroidx/paging/LoadState;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/paging/MutableLoadStateCollection;->append:Landroidx/paging/LoadState;

    .line 7
    .line 8
    return-void
.end method

.method public final setPrepend(Landroidx/paging/LoadState;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/paging/MutableLoadStateCollection;->prepend:Landroidx/paging/LoadState;

    .line 7
    .line 8
    return-void
.end method

.method public final setRefresh(Landroidx/paging/LoadState;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/paging/MutableLoadStateCollection;->refresh:Landroidx/paging/LoadState;

    .line 7
    .line 8
    return-void
.end method

.method public final snapshot()Landroidx/paging/LoadStates;
    .locals 4

    .line 1
    new-instance v0, Landroidx/paging/LoadStates;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/paging/MutableLoadStateCollection;->refresh:Landroidx/paging/LoadState;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/paging/MutableLoadStateCollection;->prepend:Landroidx/paging/LoadState;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/paging/MutableLoadStateCollection;->append:Landroidx/paging/LoadState;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Landroidx/paging/LoadStates;-><init>(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
