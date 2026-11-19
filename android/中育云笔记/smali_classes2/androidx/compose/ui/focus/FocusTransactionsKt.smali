.class public final Landroidx/compose/ui/focus/FocusTransactionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;
    }
.end annotation


# direct methods
.method public static final captureFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 8

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v6, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    aget v0, v6, v0

    .line 21
    .line 22
    if-eq v0, v5, :cond_3

    .line 23
    .line 24
    if-eq v0, v4, :cond_2

    .line 25
    .line 26
    if-eq v0, v3, :cond_1

    .line 27
    .line 28
    if-ne v0, v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 32
    .line 33
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    return v1

    .line 38
    :cond_2
    return v5

    .line 39
    :cond_3
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0, v5}, Landroidx/compose/ui/focus/FocusOwner;->setFocusCaptured(Z)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 51
    .line 52
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 53
    .line 54
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 55
    .line 56
    .line 57
    return v5

    .line 58
    :cond_4
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_5

    .line 67
    .line 68
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    :goto_1
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    sget-object v7, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    aget v6, v7, v6

    .line 88
    .line 89
    if-eq v6, v5, :cond_8

    .line 90
    .line 91
    if-eq v6, v4, :cond_7

    .line 92
    .line 93
    if-eq v6, v3, :cond_9

    .line 94
    .line 95
    if-ne v6, v2, :cond_6

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 99
    .line 100
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 101
    .line 102
    .line 103
    throw p0

    .line 104
    :cond_7
    :goto_2
    move v1, v5

    .line 105
    goto :goto_3

    .line 106
    :cond_8
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 107
    .line 108
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_9
    :goto_3
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 116
    .line 117
    .line 118
    return v1

    .line 119
    :goto_4
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 120
    .line 121
    .line 122
    throw p0
.end method

.method private static final clearChildFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTraversalKt;->getActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static synthetic clearChildFocus$default(Landroidx/compose/ui/focus/FocusTargetNode;ZZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static final clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq v0, v2, :cond_8

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-eq v0, v3, :cond_5

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x4

    .line 24
    if-ne v0, p0, :cond_0

    .line 25
    .line 26
    return v2

    .line 27
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 28
    .line 29
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_4

    .line 38
    .line 39
    sget-boolean p1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    if-eqz p2, :cond_3

    .line 44
    .line 45
    sget-object p1, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 46
    .line 47
    sget-object p2, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    sget-object p1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 56
    .line 57
    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    .line 61
    .line 62
    .line 63
    :cond_3
    :goto_0
    return v2

    .line 64
    :cond_4
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_5
    if-eqz p1, :cond_7

    .line 67
    .line 68
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 69
    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0, v1}, Landroidx/compose/ui/focus/FocusOwner;->setActiveFocusTargetNode(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 81
    .line 82
    .line 83
    if-eqz p2, :cond_7

    .line 84
    .line 85
    sget-object p2, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 86
    .line 87
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 88
    .line 89
    invoke-virtual {p0, p2, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 90
    .line 91
    .line 92
    return p1

    .line 93
    :cond_6
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 96
    .line 97
    .line 98
    if-eqz p2, :cond_7

    .line 99
    .line 100
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    .line 101
    .line 102
    .line 103
    :cond_7
    return p1

    .line 104
    :cond_8
    sget-boolean p1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 105
    .line 106
    if-eqz p1, :cond_9

    .line 107
    .line 108
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-interface {p1, v1}, Landroidx/compose/ui/focus/FocusOwner;->setActiveFocusTargetNode(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 117
    .line 118
    .line 119
    if-eqz p2, :cond_a

    .line 120
    .line 121
    sget-object p1, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 122
    .line 123
    sget-object p2, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 124
    .line 125
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_9
    sget-object p1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 130
    .line 131
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 132
    .line 133
    .line 134
    if-eqz p2, :cond_a

    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    .line 137
    .line 138
    .line 139
    :cond_a
    :goto_1
    return v2
.end method

.method public static synthetic clearFocus$default(Landroidx/compose/ui/focus/FocusTargetNode;ZZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static final freeFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 8

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v6, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    aget v0, v6, v0

    .line 21
    .line 22
    if-eq v0, v5, :cond_3

    .line 23
    .line 24
    if-eq v0, v3, :cond_2

    .line 25
    .line 26
    if-eq v0, v2, :cond_1

    .line 27
    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 32
    .line 33
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    return v4

    .line 38
    :cond_2
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0, v4}, Landroidx/compose/ui/focus/FocusOwner;->setFocusCaptured(Z)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 50
    .line 51
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 52
    .line 53
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    return v5

    .line 57
    :cond_4
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_5

    .line 66
    .line 67
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_3

    .line 73
    :cond_5
    :goto_1
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    sget-object v7, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    aget v6, v7, v6

    .line 87
    .line 88
    if-eq v6, v5, :cond_8

    .line 89
    .line 90
    if-eq v6, v3, :cond_7

    .line 91
    .line 92
    if-eq v6, v2, :cond_9

    .line 93
    .line 94
    if-ne v6, v1, :cond_6

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 98
    .line 99
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p0

    .line 103
    :cond_7
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 104
    .line 105
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    :cond_8
    move v4, v5

    .line 112
    :cond_9
    :goto_2
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 113
    .line 114
    .line 115
    return v4

    .line 116
    :goto_3
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 117
    .line 118
    .line 119
    throw p0
.end method

.method private static final grantFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusTransactionsKt$grantFocus$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/ui/focus/FocusTransactionsKt$grantFocus$1;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroidx/compose/ui/node/ObserverModifierNodeKt;->observeReads(Landroidx/compose/ui/Modifier$Node;Lhd/a;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0, p0}, Landroidx/compose/ui/focus/FocusOwner;->setActiveFocusTargetNode(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    const/4 p0, 0x1

    .line 50
    return p0
.end method

.method public static final performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_5

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_4

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x4

    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 27
    .line 28
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requireActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Landroidx/compose/ui/focus/CustomDestinationResult;->None:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 41
    .line 42
    if-ne v0, v1, :cond_2

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    :cond_2
    if-nez v0, :cond_3

    .line 46
    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomExit-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_3
    return-object v0

    .line 53
    :cond_4
    sget-object p0, Landroidx/compose/ui/focus/CustomDestinationResult;->Cancelled:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_5
    :goto_0
    sget-object p0, Landroidx/compose/ui/focus/CustomDestinationResult;->None:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 57
    .line 58
    return-object p0
.end method

.method private static final performCustomEnter-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;
    .locals 8

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$isProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, p1, v4}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;-><init>(ILkotlin/jvm/internal/n;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->getFocusTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_0
    move v5, v1

    .line 37
    :goto_0
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-interface {v6}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-interface {v6}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusProperties;->getOnEnter()Lhd/l;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v2, v3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move p1, v1

    .line 64
    :goto_1
    invoke-interface {v6}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v3}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;->isCanceled()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_5

    .line 73
    .line 74
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-ne v2, v3, :cond_2

    .line 85
    .line 86
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Cancelled:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_2
    :try_start_1
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne v2, p1, :cond_3

    .line 97
    .line 98
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Redirected:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    .line 100
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_3
    :try_start_2
    invoke-static {v2, v1, v0, v4}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8$default(Landroidx/compose/ui/focus/FocusRequester;IILjava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_4

    .line 109
    .line 110
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Redirected:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->RedirectCancelled:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    .line 115
    :goto_2
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 116
    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_5
    if-ne v5, p1, :cond_7

    .line 120
    .line 121
    :try_start_3
    sget-boolean p1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    if-eq v7, v2, :cond_6

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_7
    :goto_3
    :try_start_4
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 135
    .line 136
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-ne v2, v3, :cond_8

    .line 145
    .line 146
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Cancelled:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 147
    .line 148
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 149
    .line 150
    .line 151
    return-object p1

    .line 152
    :cond_8
    :try_start_5
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-ne v2, p1, :cond_9

    .line 157
    .line 158
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Redirected:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 159
    .line 160
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 161
    .line 162
    .line 163
    return-object p1

    .line 164
    :cond_9
    :try_start_6
    invoke-static {v2, v1, v0, v4}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8$default(Landroidx/compose/ui/focus/FocusRequester;IILjava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_a

    .line 169
    .line 170
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Redirected:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_a
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->RedirectCancelled:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 174
    .line 175
    :goto_4
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 176
    .line 177
    .line 178
    return-object p1

    .line 179
    :goto_5
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_b
    :goto_6
    sget-object p0, Landroidx/compose/ui/focus/CustomDestinationResult;->None:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 184
    .line 185
    return-object p0
.end method

.method private static final performCustomExit-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;
    .locals 8

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$isProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, p1, v4}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;-><init>(ILkotlin/jvm/internal/n;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->getFocusTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_0
    move v5, v1

    .line 37
    :goto_0
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-interface {v6}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-interface {v6}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusProperties;->getOnExit()Lhd/l;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v2, v3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move p1, v1

    .line 64
    :goto_1
    invoke-interface {v6}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v3}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;->isCanceled()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_5

    .line 73
    .line 74
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-ne v2, v3, :cond_2

    .line 85
    .line 86
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Cancelled:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_2
    :try_start_1
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne v2, p1, :cond_3

    .line 97
    .line 98
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Redirected:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    .line 100
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_3
    :try_start_2
    invoke-static {v2, v1, v0, v4}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8$default(Landroidx/compose/ui/focus/FocusRequester;IILjava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_4

    .line 109
    .line 110
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Redirected:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->RedirectCancelled:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    .line 115
    :goto_2
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 116
    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_5
    if-ne v5, p1, :cond_7

    .line 120
    .line 121
    :try_start_3
    sget-boolean p1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    if-eq v7, v2, :cond_6

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_7
    :goto_3
    :try_start_4
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 135
    .line 136
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-ne v2, v3, :cond_8

    .line 145
    .line 146
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Cancelled:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 147
    .line 148
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 149
    .line 150
    .line 151
    return-object p1

    .line 152
    :cond_8
    :try_start_5
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-ne v2, p1, :cond_9

    .line 157
    .line 158
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Redirected:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 159
    .line 160
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 161
    .line 162
    .line 163
    return-object p1

    .line 164
    :cond_9
    :try_start_6
    invoke-static {v2, v1, v0, v4}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8$default(Landroidx/compose/ui/focus/FocusRequester;IILjava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_a

    .line 169
    .line 170
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->Redirected:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_a
    sget-object p1, Landroidx/compose/ui/focus/CustomDestinationResult;->RedirectCancelled:Landroidx/compose/ui/focus/CustomDestinationResult;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 174
    .line 175
    :goto_4
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 176
    .line 177
    .line 178
    return-object p1

    .line 179
    :goto_5
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_b
    :goto_6
    sget-object p0, Landroidx/compose/ui/focus/CustomDestinationResult;->None:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 184
    .line 185
    return-object p0
.end method

.method public static final performCustomRequestFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_15

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_15

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    if-eq v0, v3, :cond_14

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    if-ne v0, v4, :cond_13

    .line 24
    .line 25
    const/16 v0, 0x400

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    const-string/jumbo v5, "visitAncestors called on an unattached node"

    .line 42
    .line 43
    .line 44
    invoke-static {v5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :goto_0
    const/4 v6, 0x0

    .line 60
    if-eqz p0, :cond_b

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v7}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    and-int/2addr v7, v0

    .line 75
    if-eqz v7, :cond_9

    .line 76
    .line 77
    :goto_1
    if-eqz v5, :cond_9

    .line 78
    .line 79
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    and-int/2addr v7, v0

    .line 84
    if-eqz v7, :cond_8

    .line 85
    .line 86
    move-object v7, v5

    .line 87
    move-object v8, v6

    .line 88
    :goto_2
    if-eqz v7, :cond_8

    .line 89
    .line 90
    instance-of v9, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 91
    .line 92
    if-eqz v9, :cond_1

    .line 93
    .line 94
    goto/16 :goto_5

    .line 95
    .line 96
    :cond_1
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    and-int/2addr v9, v0

    .line 101
    if-eqz v9, :cond_7

    .line 102
    .line 103
    instance-of v9, v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 104
    .line 105
    if-eqz v9, :cond_7

    .line 106
    .line 107
    move-object v9, v7

    .line 108
    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 109
    .line 110
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    const/4 v10, 0x0

    .line 115
    move v11, v10

    .line 116
    :goto_3
    if-eqz v9, :cond_6

    .line 117
    .line 118
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    and-int/2addr v12, v0

    .line 123
    if-eqz v12, :cond_5

    .line 124
    .line 125
    add-int/lit8 v11, v11, 0x1

    .line 126
    .line 127
    if-ne v11, v1, :cond_2

    .line 128
    .line 129
    move-object v7, v9

    .line 130
    goto :goto_4

    .line 131
    :cond_2
    if-nez v8, :cond_3

    .line 132
    .line 133
    new-instance v8, Landroidx/compose/runtime/collection/MutableVector;

    .line 134
    .line 135
    const/16 v12, 0x10

    .line 136
    .line 137
    new-array v12, v12, [Landroidx/compose/ui/Modifier$Node;

    .line 138
    .line 139
    invoke-direct {v8, v12, v10}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    :cond_3
    if-eqz v7, :cond_4

    .line 143
    .line 144
    invoke-virtual {v8, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-object v7, v6

    .line 148
    :cond_4
    invoke-virtual {v8, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_5
    :goto_4
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    goto :goto_3

    .line 156
    :cond_6
    if-ne v11, v1, :cond_7

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_7
    invoke-static {v8}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    goto :goto_2

    .line 164
    :cond_8
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    goto :goto_1

    .line 169
    :cond_9
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    if-eqz p0, :cond_a

    .line 174
    .line 175
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    if-eqz v5, :cond_a

    .line 180
    .line 181
    invoke-virtual {v5}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    goto :goto_0

    .line 186
    :cond_a
    move-object v5, v6

    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_b
    move-object v7, v6

    .line 190
    :goto_5
    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 191
    .line 192
    if-nez v7, :cond_c

    .line 193
    .line 194
    sget-object p0, Landroidx/compose/ui/focus/CustomDestinationResult;->None:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 195
    .line 196
    return-object p0

    .line 197
    :cond_c
    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    sget-object v0, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    aget p0, v0, p0

    .line 208
    .line 209
    if-eq p0, v1, :cond_12

    .line 210
    .line 211
    if-eq p0, v2, :cond_11

    .line 212
    .line 213
    if-eq p0, v3, :cond_10

    .line 214
    .line 215
    if-ne p0, v4, :cond_f

    .line 216
    .line 217
    invoke-static {v7, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomRequestFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    sget-object v0, Landroidx/compose/ui/focus/CustomDestinationResult;->None:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 222
    .line 223
    if-ne p0, v0, :cond_d

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_d
    move-object v6, p0

    .line 227
    :goto_6
    if-nez v6, :cond_e

    .line 228
    .line 229
    invoke-static {v7, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomEnter-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :cond_e
    return-object v6

    .line 235
    :cond_f
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 236
    .line 237
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 238
    .line 239
    .line 240
    throw p0

    .line 241
    :cond_10
    invoke-static {v7, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomRequestFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    return-object p0

    .line 246
    :cond_11
    sget-object p0, Landroidx/compose/ui/focus/CustomDestinationResult;->Cancelled:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 247
    .line 248
    return-object p0

    .line 249
    :cond_12
    invoke-static {v7, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomEnter-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0

    .line 254
    :cond_13
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 255
    .line 256
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 257
    .line 258
    .line 259
    throw p0

    .line 260
    :cond_14
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requireActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    return-object p0

    .line 269
    :cond_15
    sget-object p0, Landroidx/compose/ui/focus/CustomDestinationResult;->None:Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 270
    .line 271
    return-object p0
.end method

.method public static final performRequestFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performRequestFocusOptimized(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performRequestFocusLegacy(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private static final performRequestFocusLegacy(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq v0, v2, :cond_10

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-eq v0, v3, :cond_10

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eq v0, v3, :cond_f

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    if-ne v0, v3, :cond_e

    .line 26
    .line 27
    const/16 v0, 0x400

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    const-string/jumbo v3, "visitAncestors called on an unattached node"

    .line 44
    .line 45
    .line 46
    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    :goto_0
    if-eqz v5, :cond_b

    .line 62
    .line 63
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    and-int/2addr v6, v0

    .line 76
    if-eqz v6, :cond_9

    .line 77
    .line 78
    :goto_1
    if-eqz v3, :cond_9

    .line 79
    .line 80
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    and-int/2addr v6, v0

    .line 85
    if-eqz v6, :cond_8

    .line 86
    .line 87
    move-object v7, v1

    .line 88
    move-object v6, v3

    .line 89
    :goto_2
    if-eqz v6, :cond_8

    .line 90
    .line 91
    instance-of v8, v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 92
    .line 93
    if-eqz v8, :cond_1

    .line 94
    .line 95
    goto/16 :goto_5

    .line 96
    .line 97
    :cond_1
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    and-int/2addr v8, v0

    .line 102
    if-eqz v8, :cond_7

    .line 103
    .line 104
    instance-of v8, v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 105
    .line 106
    if-eqz v8, :cond_7

    .line 107
    .line 108
    move-object v8, v6

    .line 109
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 110
    .line 111
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    move v9, v4

    .line 116
    :goto_3
    if-eqz v8, :cond_6

    .line 117
    .line 118
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    and-int/2addr v10, v0

    .line 123
    if-eqz v10, :cond_5

    .line 124
    .line 125
    add-int/lit8 v9, v9, 0x1

    .line 126
    .line 127
    if-ne v9, v2, :cond_2

    .line 128
    .line 129
    move-object v6, v8

    .line 130
    goto :goto_4

    .line 131
    :cond_2
    if-nez v7, :cond_3

    .line 132
    .line 133
    new-instance v7, Landroidx/compose/runtime/collection/MutableVector;

    .line 134
    .line 135
    const/16 v10, 0x10

    .line 136
    .line 137
    new-array v10, v10, [Landroidx/compose/ui/Modifier$Node;

    .line 138
    .line 139
    invoke-direct {v7, v10, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    :cond_3
    if-eqz v6, :cond_4

    .line 143
    .line 144
    invoke-virtual {v7, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-object v6, v1

    .line 148
    :cond_4
    invoke-virtual {v7, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_5
    :goto_4
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    goto :goto_3

    .line 156
    :cond_6
    if-ne v9, v2, :cond_7

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_7
    invoke-static {v7}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    goto :goto_2

    .line 164
    :cond_8
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    goto :goto_1

    .line 169
    :cond_9
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-eqz v5, :cond_a

    .line 174
    .line 175
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    if-eqz v3, :cond_a

    .line 180
    .line 181
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    goto :goto_0

    .line 186
    :cond_a
    move-object v3, v1

    .line 187
    goto :goto_0

    .line 188
    :cond_b
    move-object v6, v1

    .line 189
    :goto_5
    check-cast v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 190
    .line 191
    if-eqz v6, :cond_c

    .line 192
    .line 193
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v6, p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForChild(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_10

    .line 202
    .line 203
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    if-eq v0, v3, :cond_10

    .line 208
    .line 209
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_c
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForOwner(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_d

    .line 218
    .line 219
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_d

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_d
    move v2, v4

    .line 227
    goto :goto_6

    .line 228
    :cond_e
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 229
    .line 230
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 231
    .line 232
    .line 233
    throw p0

    .line 234
    :cond_f
    invoke-static {p0, v4, v4, v3, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus$default(Landroidx/compose/ui/focus/FocusTargetNode;ZZILjava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_d

    .line 239
    .line 240
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_d

    .line 245
    .line 246
    :cond_10
    :goto_6
    if-eqz v2, :cond_12

    .line 247
    .line 248
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isViewFocusFixEnabled:Z

    .line 249
    .line 250
    if-eqz v0, :cond_11

    .line 251
    .line 252
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getInteropView()Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-nez v0, :cond_11

    .line 261
    .line 262
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    sget-object v3, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 271
    .line 272
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getNext-dhqQ-8s()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    invoke-static {v3}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-interface {v0, v3, v1}, Landroidx/compose/ui/focus/FocusOwner;->requestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z

    .line 281
    .line 282
    .line 283
    :cond_11
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    .line 284
    .line 285
    .line 286
    :cond_12
    return v2
.end method

.method private static final performRequestFocusOptimized(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-ne v2, v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v3, v3}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 23
    .line 24
    .line 25
    return v4

    .line 26
    :cond_0
    const/4 v5, 0x0

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForOwner(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-nez v6, :cond_1

    .line 34
    .line 35
    return v5

    .line 36
    :cond_1
    const-string/jumbo v6, "visitAncestors called on an unattached node"

    .line 37
    .line 38
    .line 39
    const/16 v7, 0x400

    .line 40
    .line 41
    const/16 v8, 0x10

    .line 42
    .line 43
    if-eqz v2, :cond_e

    .line 44
    .line 45
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 46
    .line 47
    new-array v11, v8, [Landroidx/compose/ui/focus/FocusTargetNode;

    .line 48
    .line 49
    invoke-direct {v10, v11, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v7}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    if-nez v12, :cond_2

    .line 65
    .line 66
    invoke-static {v6}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    :goto_0
    if-eqz v13, :cond_d

    .line 82
    .line 83
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 84
    .line 85
    .line 86
    move-result-object v14

    .line 87
    invoke-virtual {v14}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    and-int/2addr v14, v11

    .line 96
    if-eqz v14, :cond_b

    .line 97
    .line 98
    :goto_1
    if-eqz v12, :cond_b

    .line 99
    .line 100
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    and-int/2addr v14, v11

    .line 105
    if-eqz v14, :cond_a

    .line 106
    .line 107
    move-object v14, v12

    .line 108
    const/4 v15, 0x0

    .line 109
    :goto_2
    if-eqz v14, :cond_a

    .line 110
    .line 111
    move/from16 v16, v7

    .line 112
    .line 113
    instance-of v7, v14, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 114
    .line 115
    if-eqz v7, :cond_3

    .line 116
    .line 117
    check-cast v14, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 118
    .line 119
    invoke-virtual {v10, v14}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_3
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    and-int/2addr v7, v11

    .line 128
    if-eqz v7, :cond_9

    .line 129
    .line 130
    instance-of v7, v14, Landroidx/compose/ui/node/DelegatingNode;

    .line 131
    .line 132
    if-eqz v7, :cond_9

    .line 133
    .line 134
    move-object v7, v14

    .line 135
    check-cast v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 136
    .line 137
    invoke-virtual {v7}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    move v9, v5

    .line 142
    :goto_3
    if-eqz v7, :cond_8

    .line 143
    .line 144
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 145
    .line 146
    .line 147
    move-result v17

    .line 148
    and-int v17, v17, v11

    .line 149
    .line 150
    if-eqz v17, :cond_7

    .line 151
    .line 152
    add-int/lit8 v9, v9, 0x1

    .line 153
    .line 154
    if-ne v9, v4, :cond_4

    .line 155
    .line 156
    move-object v14, v7

    .line 157
    goto :goto_4

    .line 158
    :cond_4
    if-nez v15, :cond_5

    .line 159
    .line 160
    new-instance v15, Landroidx/compose/runtime/collection/MutableVector;

    .line 161
    .line 162
    new-array v4, v8, [Landroidx/compose/ui/Modifier$Node;

    .line 163
    .line 164
    invoke-direct {v15, v4, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    :cond_5
    if-eqz v14, :cond_6

    .line 168
    .line 169
    invoke-virtual {v15, v14}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    :cond_6
    invoke-virtual {v15, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    :cond_7
    :goto_4
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    const/4 v4, 0x1

    .line 181
    goto :goto_3

    .line 182
    :cond_8
    if-ne v9, v4, :cond_9

    .line 183
    .line 184
    move/from16 v7, v16

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_9
    :goto_5
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    move/from16 v7, v16

    .line 192
    .line 193
    const/4 v4, 0x1

    .line 194
    goto :goto_2

    .line 195
    :cond_a
    move/from16 v16, v7

    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    move/from16 v7, v16

    .line 202
    .line 203
    const/4 v4, 0x1

    .line 204
    goto :goto_1

    .line 205
    :cond_b
    move/from16 v16, v7

    .line 206
    .line 207
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    if-eqz v13, :cond_c

    .line 212
    .line 213
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    if-eqz v4, :cond_c

    .line 218
    .line 219
    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    move-object v12, v4

    .line 224
    goto :goto_6

    .line 225
    :cond_c
    const/4 v12, 0x0

    .line 226
    :goto_6
    move/from16 v7, v16

    .line 227
    .line 228
    const/4 v4, 0x1

    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_d
    :goto_7
    move/from16 v16, v7

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_e
    const/4 v10, 0x0

    .line 235
    goto :goto_7

    .line 236
    :goto_8
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 237
    .line 238
    new-array v7, v8, [Landroidx/compose/ui/focus/FocusTargetNode;

    .line 239
    .line 240
    invoke-direct {v4, v7, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 241
    .line 242
    .line 243
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-nez v9, :cond_f

    .line 256
    .line 257
    invoke-static {v6}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :cond_f
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    const/4 v11, 0x1

    .line 273
    :goto_9
    if-eqz v9, :cond_1d

    .line 274
    .line 275
    invoke-virtual {v9}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 276
    .line 277
    .line 278
    move-result-object v12

    .line 279
    invoke-virtual {v12}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    and-int/2addr v12, v7

    .line 288
    if-eqz v12, :cond_1b

    .line 289
    .line 290
    :goto_a
    if-eqz v6, :cond_1b

    .line 291
    .line 292
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    and-int/2addr v12, v7

    .line 297
    if-eqz v12, :cond_1a

    .line 298
    .line 299
    move-object v13, v6

    .line 300
    const/4 v12, 0x0

    .line 301
    :goto_b
    if-eqz v13, :cond_1a

    .line 302
    .line 303
    instance-of v14, v13, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 304
    .line 305
    if-eqz v14, :cond_13

    .line 306
    .line 307
    check-cast v13, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 308
    .line 309
    if-eqz v10, :cond_10

    .line 310
    .line 311
    invoke-virtual {v10, v13}, Landroidx/compose/runtime/collection/MutableVector;->remove(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v14

    .line 315
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    goto :goto_c

    .line 320
    :cond_10
    const/4 v14, 0x0

    .line 321
    :goto_c
    if-eqz v14, :cond_11

    .line 322
    .line 323
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    if-nez v14, :cond_12

    .line 328
    .line 329
    :cond_11
    invoke-virtual {v4, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    :cond_12
    if-ne v13, v2, :cond_19

    .line 333
    .line 334
    move v11, v5

    .line 335
    goto :goto_10

    .line 336
    :cond_13
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    and-int/2addr v14, v7

    .line 341
    if-eqz v14, :cond_19

    .line 342
    .line 343
    instance-of v14, v13, Landroidx/compose/ui/node/DelegatingNode;

    .line 344
    .line 345
    if-eqz v14, :cond_19

    .line 346
    .line 347
    move-object v14, v13

    .line 348
    check-cast v14, Landroidx/compose/ui/node/DelegatingNode;

    .line 349
    .line 350
    invoke-virtual {v14}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    move v15, v5

    .line 355
    :goto_d
    if-eqz v14, :cond_18

    .line 356
    .line 357
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 358
    .line 359
    .line 360
    move-result v16

    .line 361
    and-int v16, v16, v7

    .line 362
    .line 363
    if-eqz v16, :cond_17

    .line 364
    .line 365
    add-int/lit8 v15, v15, 0x1

    .line 366
    .line 367
    const/4 v5, 0x1

    .line 368
    if-ne v15, v5, :cond_14

    .line 369
    .line 370
    move-object v13, v14

    .line 371
    goto :goto_e

    .line 372
    :cond_14
    if-nez v12, :cond_15

    .line 373
    .line 374
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 375
    .line 376
    new-array v5, v8, [Landroidx/compose/ui/Modifier$Node;

    .line 377
    .line 378
    const/4 v8, 0x0

    .line 379
    invoke-direct {v12, v5, v8}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 380
    .line 381
    .line 382
    :cond_15
    if-eqz v13, :cond_16

    .line 383
    .line 384
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    const/4 v13, 0x0

    .line 388
    :cond_16
    invoke-virtual {v12, v14}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    :cond_17
    :goto_e
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 392
    .line 393
    .line 394
    move-result-object v14

    .line 395
    const/4 v5, 0x0

    .line 396
    const/16 v8, 0x10

    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_18
    const/4 v5, 0x1

    .line 400
    if-ne v15, v5, :cond_19

    .line 401
    .line 402
    :goto_f
    const/4 v5, 0x0

    .line 403
    const/16 v8, 0x10

    .line 404
    .line 405
    goto :goto_b

    .line 406
    :cond_19
    :goto_10
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 407
    .line 408
    .line 409
    move-result-object v13

    .line 410
    goto :goto_f

    .line 411
    :cond_1a
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    const/4 v5, 0x0

    .line 416
    const/16 v8, 0x10

    .line 417
    .line 418
    goto/16 :goto_a

    .line 419
    .line 420
    :cond_1b
    invoke-virtual {v9}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    if-eqz v9, :cond_1c

    .line 425
    .line 426
    invoke-virtual {v9}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    if-eqz v5, :cond_1c

    .line 431
    .line 432
    invoke-virtual {v5}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    move-object v6, v5

    .line 437
    goto :goto_11

    .line 438
    :cond_1c
    const/4 v6, 0x0

    .line 439
    :goto_11
    const/4 v5, 0x0

    .line 440
    const/16 v8, 0x10

    .line 441
    .line 442
    goto/16 :goto_9

    .line 443
    .line 444
    :cond_1d
    if-eqz v11, :cond_1e

    .line 445
    .line 446
    if-eqz v2, :cond_1e

    .line 447
    .line 448
    const/4 v5, 0x0

    .line 449
    const/4 v6, 0x1

    .line 450
    const/4 v8, 0x0

    .line 451
    invoke-static {v2, v8, v6, v6, v5}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus$default(Landroidx/compose/ui/focus/FocusTargetNode;ZZILjava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    if-nez v7, :cond_1f

    .line 456
    .line 457
    return v8

    .line 458
    :cond_1e
    const/4 v6, 0x1

    .line 459
    :cond_1f
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 460
    .line 461
    .line 462
    if-eqz v10, :cond_21

    .line 463
    .line 464
    invoke-virtual {v10}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    sub-int/2addr v5, v6

    .line 469
    iget-object v6, v10, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 470
    .line 471
    array-length v7, v6

    .line 472
    if-ge v5, v7, :cond_21

    .line 473
    .line 474
    :goto_12
    if-ltz v5, :cond_21

    .line 475
    .line 476
    aget-object v7, v6, v5

    .line 477
    .line 478
    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 479
    .line 480
    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    if-eq v8, v0, :cond_20

    .line 485
    .line 486
    const/16 v16, 0x0

    .line 487
    .line 488
    return v16

    .line 489
    :cond_20
    sget-object v8, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 490
    .line 491
    sget-object v9, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 492
    .line 493
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 494
    .line 495
    .line 496
    add-int/lit8 v5, v5, -0x1

    .line 497
    .line 498
    goto :goto_12

    .line 499
    :cond_21
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 500
    .line 501
    .line 502
    move-result v5

    .line 503
    const/16 v17, 0x1

    .line 504
    .line 505
    add-int/lit8 v5, v5, -0x1

    .line 506
    .line 507
    iget-object v4, v4, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 508
    .line 509
    array-length v6, v4

    .line 510
    if-ge v5, v6, :cond_24

    .line 511
    .line 512
    :goto_13
    if-ltz v5, :cond_24

    .line 513
    .line 514
    aget-object v6, v4, v5

    .line 515
    .line 516
    check-cast v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 517
    .line 518
    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    if-eq v7, v0, :cond_22

    .line 523
    .line 524
    const/16 v16, 0x0

    .line 525
    .line 526
    return v16

    .line 527
    :cond_22
    if-ne v6, v2, :cond_23

    .line 528
    .line 529
    sget-object v7, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 530
    .line 531
    goto :goto_14

    .line 532
    :cond_23
    sget-object v7, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 533
    .line 534
    :goto_14
    sget-object v8, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 535
    .line 536
    invoke-virtual {v6, v7, v8}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 537
    .line 538
    .line 539
    add-int/lit8 v5, v5, -0x1

    .line 540
    .line 541
    goto :goto_13

    .line 542
    :cond_24
    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    if-eq v2, v0, :cond_25

    .line 547
    .line 548
    const/16 v16, 0x0

    .line 549
    .line 550
    return v16

    .line 551
    :cond_25
    const/16 v16, 0x0

    .line 552
    .line 553
    sget-object v2, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 554
    .line 555
    invoke-virtual {v0, v3, v2}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 556
    .line 557
    .line 558
    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    if-eq v1, v0, :cond_26

    .line 563
    .line 564
    return v16

    .line 565
    :cond_26
    sget-boolean v1, Landroidx/compose/ui/ComposeUiFlags;->isViewFocusFixEnabled:Z

    .line 566
    .line 567
    if-eqz v1, :cond_27

    .line 568
    .line 569
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getInteropView()Landroid/view/View;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    if-nez v1, :cond_27

    .line 578
    .line 579
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    sget-object v1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 588
    .line 589
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getNext-dhqQ-8s()I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    invoke-static {v1}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    const/4 v5, 0x0

    .line 598
    invoke-interface {v0, v1, v5}, Landroidx/compose/ui/focus/FocusOwner;->requestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z

    .line 599
    .line 600
    .line 601
    :cond_27
    const/16 v17, 0x1

    .line 602
    .line 603
    return v17
.end method

.method private static final requestFocusForChild(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 14

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string/jumbo v3, "visitAncestors called on an unattached node"

    .line 16
    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {p1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :goto_0
    const/16 v5, 0x10

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v4, :cond_b

    .line 41
    .line 42
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    invoke-virtual {v9}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    and-int/2addr v9, v1

    .line 55
    if-eqz v9, :cond_9

    .line 56
    .line 57
    :goto_1
    if-eqz v2, :cond_9

    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    and-int/2addr v9, v1

    .line 64
    if-eqz v9, :cond_8

    .line 65
    .line 66
    move-object v9, v2

    .line 67
    move-object v10, v8

    .line 68
    :goto_2
    if-eqz v9, :cond_8

    .line 69
    .line 70
    instance-of v11, v9, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 71
    .line 72
    if-eqz v11, :cond_1

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_1
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    and-int/2addr v11, v1

    .line 80
    if-eqz v11, :cond_7

    .line 81
    .line 82
    instance-of v11, v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 83
    .line 84
    if-eqz v11, :cond_7

    .line 85
    .line 86
    move-object v11, v9

    .line 87
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 88
    .line 89
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    move v12, v7

    .line 94
    :goto_3
    if-eqz v11, :cond_6

    .line 95
    .line 96
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    and-int/2addr v13, v1

    .line 101
    if-eqz v13, :cond_5

    .line 102
    .line 103
    add-int/lit8 v12, v12, 0x1

    .line 104
    .line 105
    if-ne v12, v6, :cond_2

    .line 106
    .line 107
    move-object v9, v11

    .line 108
    goto :goto_4

    .line 109
    :cond_2
    if-nez v10, :cond_3

    .line 110
    .line 111
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 112
    .line 113
    new-array v13, v5, [Landroidx/compose/ui/Modifier$Node;

    .line 114
    .line 115
    invoke-direct {v10, v13, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    :cond_3
    if-eqz v9, :cond_4

    .line 119
    .line 120
    invoke-virtual {v10, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-object v9, v8

    .line 124
    :cond_4
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    :cond_5
    :goto_4
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    if-ne v12, v6, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    goto :goto_2

    .line 140
    :cond_8
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    goto :goto_1

    .line 145
    :cond_9
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    if-eqz v4, :cond_a

    .line 150
    .line 151
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-eqz v2, :cond_a

    .line 156
    .line 157
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    goto :goto_0

    .line 162
    :cond_a
    move-object v2, v8

    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_b
    move-object v9, v8

    .line 166
    :goto_5
    invoke-static {v9, p0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_22

    .line 171
    .line 172
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    sget-object v2, Landroidx/compose/ui/focus/FocusTransactionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    aget v1, v2, v1

    .line 183
    .line 184
    if-eq v1, v6, :cond_20

    .line 185
    .line 186
    const/4 v2, 0x2

    .line 187
    if-eq v1, v2, :cond_1f

    .line 188
    .line 189
    const/4 v2, 0x3

    .line 190
    if-eq v1, v2, :cond_1e

    .line 191
    .line 192
    const/4 v2, 0x4

    .line 193
    if-ne v1, v2, :cond_1d

    .line 194
    .line 195
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_c

    .line 208
    .line 209
    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :cond_c
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    :goto_6
    if-eqz v2, :cond_17

    .line 225
    .line 226
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    and-int/2addr v3, v0

    .line 239
    if-eqz v3, :cond_15

    .line 240
    .line 241
    :goto_7
    if-eqz v1, :cond_15

    .line 242
    .line 243
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    and-int/2addr v3, v0

    .line 248
    if-eqz v3, :cond_14

    .line 249
    .line 250
    move-object v3, v1

    .line 251
    move-object v4, v8

    .line 252
    :goto_8
    if-eqz v3, :cond_14

    .line 253
    .line 254
    instance-of v9, v3, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 255
    .line 256
    if-eqz v9, :cond_d

    .line 257
    .line 258
    move-object v8, v3

    .line 259
    goto :goto_b

    .line 260
    :cond_d
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    and-int/2addr v9, v0

    .line 265
    if-eqz v9, :cond_13

    .line 266
    .line 267
    instance-of v9, v3, Landroidx/compose/ui/node/DelegatingNode;

    .line 268
    .line 269
    if-eqz v9, :cond_13

    .line 270
    .line 271
    move-object v9, v3

    .line 272
    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 273
    .line 274
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    move v10, v7

    .line 279
    :goto_9
    if-eqz v9, :cond_12

    .line 280
    .line 281
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    and-int/2addr v11, v0

    .line 286
    if-eqz v11, :cond_11

    .line 287
    .line 288
    add-int/lit8 v10, v10, 0x1

    .line 289
    .line 290
    if-ne v10, v6, :cond_e

    .line 291
    .line 292
    move-object v3, v9

    .line 293
    goto :goto_a

    .line 294
    :cond_e
    if-nez v4, :cond_f

    .line 295
    .line 296
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 297
    .line 298
    new-array v11, v5, [Landroidx/compose/ui/Modifier$Node;

    .line 299
    .line 300
    invoke-direct {v4, v11, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 301
    .line 302
    .line 303
    :cond_f
    if-eqz v3, :cond_10

    .line 304
    .line 305
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-object v3, v8

    .line 309
    :cond_10
    invoke-virtual {v4, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_11
    :goto_a
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    goto :goto_9

    .line 317
    :cond_12
    if-ne v10, v6, :cond_13

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_13
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    goto :goto_8

    .line 325
    :cond_14
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    goto :goto_7

    .line 330
    :cond_15
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    if-eqz v2, :cond_16

    .line 335
    .line 336
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    if-eqz v1, :cond_16

    .line 341
    .line 342
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    goto :goto_6

    .line 347
    :cond_16
    move-object v1, v8

    .line 348
    goto :goto_6

    .line 349
    :cond_17
    :goto_b
    check-cast v8, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 350
    .line 351
    if-nez v8, :cond_19

    .line 352
    .line 353
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForOwner(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_19

    .line 358
    .line 359
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    if-eqz p1, :cond_18

    .line 364
    .line 365
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 366
    .line 367
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 368
    .line 369
    .line 370
    :cond_18
    return p1

    .line 371
    :cond_19
    if-eqz v8, :cond_1c

    .line 372
    .line 373
    invoke-static {v8, p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForChild(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_1c

    .line 378
    .line 379
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requestFocusForChild(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 388
    .line 389
    if-ne p0, v0, :cond_1b

    .line 390
    .line 391
    if-eqz p1, :cond_1a

    .line 392
    .line 393
    invoke-virtual {v8}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    .line 394
    .line 395
    .line 396
    :cond_1a
    return p1

    .line 397
    :cond_1b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 398
    .line 399
    const-string p1, "Deactivated node is focused"

    .line 400
    .line 401
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw p0

    .line 405
    :cond_1c
    return v7

    .line 406
    :cond_1d
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 407
    .line 408
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 409
    .line 410
    .line 411
    throw p0

    .line 412
    :cond_1e
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->requireActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 413
    .line 414
    .line 415
    invoke-static {p0, v7, v7, v2, v8}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearChildFocus$default(Landroidx/compose/ui/focus/FocusTargetNode;ZZILjava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-eqz p0, :cond_1f

    .line 420
    .line 421
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 422
    .line 423
    .line 424
    move-result p0

    .line 425
    if-eqz p0, :cond_1f

    .line 426
    .line 427
    return v6

    .line 428
    :cond_1f
    return v7

    .line 429
    :cond_20
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->grantFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    if-eqz p1, :cond_21

    .line 434
    .line 435
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 436
    .line 437
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 438
    .line 439
    .line 440
    :cond_21
    return p1

    .line 441
    :cond_22
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 442
    .line 443
    const-string p1, "Non child node cannot request focus."

    .line 444
    .line 445
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw p0
.end method

.method private static final requestFocusForOwner(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-interface {p0, v0, v0}, Landroidx/compose/ui/focus/FocusOwner;->requestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private static final requireActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTraversalKt;->getActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v0, "ActiveParent with no focused child"

    .line 11
    .line 12
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method
