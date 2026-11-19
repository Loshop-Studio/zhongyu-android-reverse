.class public final Landroidx/paging/MutableCombinedLoadStateCollectionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final computeHelperState(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)Landroidx/paging/LoadState;
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    instance-of p2, p0, Landroidx/paging/LoadState$Loading;

    .line 5
    .line 6
    if-eqz p2, :cond_3

    .line 7
    .line 8
    instance-of p1, p1, Landroidx/paging/LoadState$NotLoading;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    instance-of p1, p3, Landroidx/paging/LoadState$NotLoading;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    return-object p3

    .line 17
    :cond_1
    instance-of p1, p3, Landroidx/paging/LoadState$Error;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    return-object p3

    .line 22
    :cond_2
    return-object p0

    .line 23
    :cond_3
    return-object p3
.end method

.method public static final computeNewState(Landroidx/paging/CombinedLoadStates;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/CombinedLoadStates;
    .locals 11

    .line 1
    const-string v0, "newSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    sget-object v0, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x0

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p2}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object v4, v3

    .line 37
    :goto_0
    invoke-static {v0, v1, v2, v4}, Landroidx/paging/MutableCombinedLoadStateCollectionKt;->computeHelperState(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)Landroidx/paging/LoadState;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/paging/CombinedLoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    :cond_3
    sget-object v0, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_4
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eqz p2, :cond_5

    .line 64
    .line 65
    invoke-virtual {p2}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    move-object v4, v3

    .line 71
    :goto_1
    invoke-static {v0, v1, v2, v4}, Landroidx/paging/MutableCombinedLoadStateCollectionKt;->computeHelperState(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)Landroidx/paging/LoadState;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    if-eqz p0, :cond_6

    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/paging/CombinedLoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-nez p0, :cond_7

    .line 82
    .line 83
    :cond_6
    sget-object p0, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :cond_7
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-eqz p2, :cond_8

    .line 98
    .line 99
    invoke-virtual {p2}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :cond_8
    invoke-static {p0, v0, v1, v3}, Landroidx/paging/MutableCombinedLoadStateCollectionKt;->computeHelperState(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)Landroidx/paging/LoadState;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    new-instance v5, Landroidx/paging/CombinedLoadStates;

    .line 108
    .line 109
    move-object v9, p1

    .line 110
    move-object v10, p2

    .line 111
    invoke-direct/range {v5 .. v10}, Landroidx/paging/CombinedLoadStates;-><init>(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 112
    .line 113
    .line 114
    return-object v5
.end method
