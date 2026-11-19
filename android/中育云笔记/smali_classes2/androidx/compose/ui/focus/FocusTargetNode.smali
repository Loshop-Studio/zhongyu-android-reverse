.class public final Landroidx/compose/ui/focus/FocusTargetNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;
.implements Landroidx/compose/ui/focus/FocusTargetModifierNode;
.implements Landroidx/compose/ui/node/ObserverModifierNode;
.implements Landroidx/compose/ui/modifier/ModifierLocalModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;,
        Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

.field private focusability:I

.field private isProcessingCustomEnter:Z

.field private isProcessingCustomExit:Z

.field private final onDispatchEventsCompleted:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final onFocusChange:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private previouslyFocusedChildHash:I

.field private final shouldAutoInvalidate:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILhd/p;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/p;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 5
    iput-object p2, p0, Landroidx/compose/ui/focus/FocusTargetNode;->onFocusChange:Lhd/p;

    .line 6
    iput-object p3, p0, Landroidx/compose/ui/focus/FocusTargetNode;->onDispatchEventsCompleted:Lhd/l;

    .line 7
    iput p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->focusability:I

    return-void
.end method

.method public synthetic constructor <init>(ILhd/p;Lhd/l;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 2
    sget-object p1, Landroidx/compose/ui/focus/Focusability;->Companion:Landroidx/compose/ui/focus/Focusability$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/Focusability$Companion;->getAlways-LCbbffg()I

    move-result p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/ui/focus/FocusTargetNode;-><init>(ILhd/p;Lhd/l;Lkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(ILhd/p;Lhd/l;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/focus/FocusTargetNode;-><init>(ILhd/p;Lhd/l;)V

    return-void
.end method

.method public static final synthetic access$isProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->isProcessingCustomEnter:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$isProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->isProcessingCustomExit:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->isProcessingCustomEnter:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->isProcessingCustomExit:Z

    .line 2
    .line 3
    return-void
.end method

.method private final fetchCustomEnterOrExit-ULY8qGw(ILhd/l;Lhd/p;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;-><init>(ILkotlin/jvm/internal/n;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->getFocusTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v2

    .line 24
    :goto_0
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {v4}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {v4}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-interface {p3, v0, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    :cond_1
    invoke-interface {v4}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v1}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;->isCanceled()Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    if-eqz p3, :cond_2

    .line 54
    .line 55
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    if-ne v3, v2, :cond_4

    .line 66
    .line 67
    sget-boolean p3, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 68
    .line 69
    if-eqz p3, :cond_3

    .line 70
    .line 71
    if-eq v5, p1, :cond_3

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    return-void

    .line 77
    :cond_4
    :goto_1
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method private static final initializeFocusState$hasActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 12

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string/jumbo v1, "visitSubtreeIf called on an unattached node"

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    .line 24
    .line 25
    const/16 v2, 0x10

    .line 26
    .line 27
    new-array v3, v2, [Landroidx/compose/ui/Modifier$Node;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v1, v3, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {v1, p0, v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v1, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_e

    .line 59
    .line 60
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    const/4 v3, 0x1

    .line 65
    sub-int/2addr p0, v3

    .line 66
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Landroidx/compose/ui/Modifier$Node;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    and-int/2addr v5, v0

    .line 77
    if-eqz v5, :cond_d

    .line 78
    .line 79
    move-object v5, p0

    .line 80
    :goto_1
    if-eqz v5, :cond_d

    .line 81
    .line 82
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    and-int/2addr v6, v0

    .line 87
    if-eqz v6, :cond_c

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    move-object v7, v5

    .line 91
    move-object v8, v6

    .line 92
    :goto_2
    if-eqz v7, :cond_c

    .line 93
    .line 94
    instance-of v9, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 95
    .line 96
    if-eqz v9, :cond_5

    .line 97
    .line 98
    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 99
    .line 100
    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->isInitialized$ui_release()Z

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-nez v9, :cond_2

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_2
    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    sget-object v5, Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    aget p0, v5, p0

    .line 118
    .line 119
    if-eq p0, v3, :cond_4

    .line 120
    .line 121
    const/4 v5, 0x2

    .line 122
    if-eq p0, v5, :cond_4

    .line 123
    .line 124
    const/4 v5, 0x3

    .line 125
    if-eq p0, v5, :cond_4

    .line 126
    .line 127
    const/4 v3, 0x4

    .line 128
    if-ne p0, v3, :cond_3

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 132
    .line 133
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_4
    return v3

    .line 138
    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    and-int/2addr v9, v0

    .line 143
    if-eqz v9, :cond_b

    .line 144
    .line 145
    instance-of v9, v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 146
    .line 147
    if-eqz v9, :cond_b

    .line 148
    .line 149
    move-object v9, v7

    .line 150
    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 151
    .line 152
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    move v10, v4

    .line 157
    :goto_3
    if-eqz v9, :cond_a

    .line 158
    .line 159
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    and-int/2addr v11, v0

    .line 164
    if-eqz v11, :cond_9

    .line 165
    .line 166
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    if-ne v10, v3, :cond_6

    .line 169
    .line 170
    move-object v7, v9

    .line 171
    goto :goto_4

    .line 172
    :cond_6
    if-nez v8, :cond_7

    .line 173
    .line 174
    new-instance v8, Landroidx/compose/runtime/collection/MutableVector;

    .line 175
    .line 176
    new-array v11, v2, [Landroidx/compose/ui/Modifier$Node;

    .line 177
    .line 178
    invoke-direct {v8, v11, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    :cond_7
    if-eqz v7, :cond_8

    .line 182
    .line 183
    invoke-virtual {v8, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-object v7, v6

    .line 187
    :cond_8
    invoke-virtual {v8, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    :cond_9
    :goto_4
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    goto :goto_3

    .line 195
    :cond_a
    if-ne v10, v3, :cond_b

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_b
    :goto_5
    invoke-static {v8}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    goto :goto_2

    .line 203
    :cond_c
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    goto :goto_1

    .line 208
    :cond_d
    invoke-static {v1, p0, v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_e
    return v4
.end method

.method private static final initializeFocusState$isInActiveSubTree(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 10

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string/jumbo v1, "visitAncestors called on an unattached node"

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    const/4 v2, 0x0

    .line 36
    if-eqz p0, :cond_e

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    and-int/2addr v3, v0

    .line 51
    const/4 v4, 0x0

    .line 52
    if-eqz v3, :cond_c

    .line 53
    .line 54
    :goto_1
    if-eqz v1, :cond_c

    .line 55
    .line 56
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    and-int/2addr v3, v0

    .line 61
    if-eqz v3, :cond_b

    .line 62
    .line 63
    move-object v3, v1

    .line 64
    move-object v5, v4

    .line 65
    :goto_2
    if-eqz v3, :cond_b

    .line 66
    .line 67
    instance-of v6, v3, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 68
    .line 69
    const/4 v7, 0x1

    .line 70
    if-eqz v6, :cond_4

    .line 71
    .line 72
    check-cast v3, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 73
    .line 74
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->isInitialized$ui_release()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_a

    .line 79
    .line 80
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget-object v0, Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    aget p0, v0, p0

    .line 91
    .line 92
    if-eq p0, v7, :cond_3

    .line 93
    .line 94
    const/4 v0, 0x2

    .line 95
    if-eq p0, v0, :cond_3

    .line 96
    .line 97
    const/4 v0, 0x3

    .line 98
    if-eq p0, v0, :cond_2

    .line 99
    .line 100
    const/4 v0, 0x4

    .line 101
    if-ne p0, v0, :cond_1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 105
    .line 106
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_2
    return v7

    .line 111
    :cond_3
    :goto_3
    return v2

    .line 112
    :cond_4
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    and-int/2addr v6, v0

    .line 117
    if-eqz v6, :cond_a

    .line 118
    .line 119
    instance-of v6, v3, Landroidx/compose/ui/node/DelegatingNode;

    .line 120
    .line 121
    if-eqz v6, :cond_a

    .line 122
    .line 123
    move-object v6, v3

    .line 124
    check-cast v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 125
    .line 126
    invoke-virtual {v6}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    move v8, v2

    .line 131
    :goto_4
    if-eqz v6, :cond_9

    .line 132
    .line 133
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    and-int/2addr v9, v0

    .line 138
    if-eqz v9, :cond_8

    .line 139
    .line 140
    add-int/lit8 v8, v8, 0x1

    .line 141
    .line 142
    if-ne v8, v7, :cond_5

    .line 143
    .line 144
    move-object v3, v6

    .line 145
    goto :goto_5

    .line 146
    :cond_5
    if-nez v5, :cond_6

    .line 147
    .line 148
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    .line 149
    .line 150
    const/16 v9, 0x10

    .line 151
    .line 152
    new-array v9, v9, [Landroidx/compose/ui/Modifier$Node;

    .line 153
    .line 154
    invoke-direct {v5, v9, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    :cond_6
    if-eqz v3, :cond_7

    .line 158
    .line 159
    invoke-virtual {v5, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-object v3, v4

    .line 163
    :cond_7
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    :cond_8
    :goto_5
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    goto :goto_4

    .line 171
    :cond_9
    if-ne v8, v7, :cond_a

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_a
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    goto :goto_2

    .line 179
    :cond_b
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_c
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    if-eqz p0, :cond_d

    .line 190
    .line 191
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-eqz v1, :cond_d

    .line 196
    .line 197
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_d
    move-object v1, v4

    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_e
    return v2
.end method

.method public static synthetic initializeFocusState$ui_release$default(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusTargetNode;->initializeFocusState$ui_release(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final commitFocusState$ui_release()V
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getUncommittedFocusState(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string v0, "committing a node that was not updated in the current transaction"

    .line 15
    .line 16
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 17
    .line 18
    .line 19
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 20
    .line 21
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public final dispatchFocusCallbacks$ui_release()V
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 3
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusTargetNode;->onFocusChange:Lhd/p;

    if-eqz v2, :cond_1

    invoke-interface {v2, v0, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/16 v0, 0x1000

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v0

    const/16 v1, 0x400

    .line 5
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    .line 6
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    or-int v3, v0, v1

    .line 7
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v4

    if-nez v4, :cond_2

    const-string/jumbo v4, "visitAncestors called on an unattached node"

    .line 8
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 9
    :cond_2
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    .line 10
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v5

    :goto_0
    if-eqz v5, :cond_e

    .line 11
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    .line 12
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v6

    and-int/2addr v6, v3

    const/4 v7, 0x0

    if-eqz v6, :cond_c

    :goto_1
    if-eqz v4, :cond_c

    .line 13
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v6

    and-int/2addr v6, v3

    if-eqz v6, :cond_b

    if-eq v4, v2, :cond_3

    .line 14
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_b

    move-object v6, v4

    move-object v8, v7

    :goto_2
    if-eqz v6, :cond_b

    .line 15
    instance-of v9, v6, Landroidx/compose/ui/focus/FocusEventModifierNode;

    if-eqz v9, :cond_4

    .line 16
    check-cast v6, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 17
    invoke-static {v6}, Landroidx/compose/ui/focus/FocusEventModifierNodeKt;->getFocusState(Landroidx/compose/ui/focus/FocusEventModifierNode;)Landroidx/compose/ui/focus/FocusState;

    move-result-object v9

    invoke-interface {v6, v9}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    goto :goto_5

    .line 18
    :cond_4
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_a

    .line 19
    instance-of v9, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v9, :cond_a

    .line 20
    move-object v9, v6

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 21
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    const/4 v10, 0x0

    move v11, v10

    :goto_3
    const/4 v12, 0x1

    if-eqz v9, :cond_9

    .line 22
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v13

    and-int/2addr v13, v0

    if-eqz v13, :cond_8

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v12, :cond_5

    move-object v6, v9

    goto :goto_4

    :cond_5
    if-nez v8, :cond_6

    .line 23
    new-instance v8, Landroidx/compose/runtime/collection/MutableVector;

    const/16 v12, 0x10

    new-array v12, v12, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v8, v12, v10}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    :cond_6
    if-eqz v6, :cond_7

    .line 24
    invoke-virtual {v8, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-object v6, v7

    .line 25
    :cond_7
    invoke-virtual {v8, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_8
    :goto_4
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    goto :goto_3

    :cond_9
    if-ne v11, v12, :cond_a

    goto :goto_2

    .line 27
    :cond_a
    :goto_5
    invoke-static {v8}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    goto :goto_2

    .line 28
    :cond_b
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    goto :goto_1

    .line 29
    :cond_c
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v5

    if-eqz v5, :cond_d

    .line 30
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    goto/16 :goto_0

    :cond_d
    move-object v4, v7

    goto/16 :goto_0

    .line 31
    :cond_e
    :goto_6
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->onDispatchEventsCompleted:Lhd/l;

    if-eqz v0, :cond_f

    invoke-interface {v0, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    return-void
.end method

.method public final dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 32
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    move-result-object v2

    .line 33
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v3

    .line 34
    invoke-static/range {p1 .. p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, v0, Landroidx/compose/ui/focus/FocusTargetNode;->onFocusChange:Lhd/p;

    if-eqz v4, :cond_0

    move-object/from16 v5, p1

    invoke-interface {v4, v5, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/16 v4, 0x1000

    .line 35
    invoke-static {v4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v4

    const/16 v5, 0x400

    .line 36
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v5

    .line 37
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    or-int v7, v4, v5

    .line 38
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v8

    if-nez v8, :cond_1

    const-string/jumbo v8, "visitAncestors called on an unattached node"

    .line 39
    invoke-static {v8}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 40
    :cond_1
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    .line 41
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v9

    :goto_0
    if-eqz v9, :cond_e

    .line 42
    invoke-virtual {v9}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    .line 43
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v7

    if-eqz v10, :cond_c

    :goto_1
    if-eqz v8, :cond_c

    .line 44
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v7

    if-eqz v10, :cond_b

    if-eq v8, v6, :cond_2

    .line 45
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v5

    if-eqz v10, :cond_2

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v4

    if-eqz v10, :cond_b

    move-object v10, v8

    const/4 v12, 0x0

    :goto_2
    if-eqz v10, :cond_b

    .line 46
    instance-of v13, v10, Landroidx/compose/ui/focus/FocusEventModifierNode;

    if-eqz v13, :cond_4

    .line 47
    check-cast v10, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 48
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v13

    if-eq v3, v13, :cond_3

    goto :goto_5

    .line 49
    :cond_3
    invoke-interface {v10, v1}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    goto :goto_5

    .line 50
    :cond_4
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v13

    and-int/2addr v13, v4

    if-eqz v13, :cond_a

    .line 51
    instance-of v13, v10, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v13, :cond_a

    .line 52
    move-object v13, v10

    check-cast v13, Landroidx/compose/ui/node/DelegatingNode;

    .line 53
    invoke-virtual {v13}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v13

    const/4 v14, 0x0

    move v15, v14

    :goto_3
    const/4 v11, 0x1

    if-eqz v13, :cond_9

    .line 54
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v16

    and-int v16, v16, v4

    if-eqz v16, :cond_8

    add-int/lit8 v15, v15, 0x1

    if-ne v15, v11, :cond_5

    move-object v10, v13

    goto :goto_4

    :cond_5
    if-nez v12, :cond_6

    .line 55
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    const/16 v11, 0x10

    new-array v11, v11, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v12, v11, v14}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    :cond_6
    if-eqz v10, :cond_7

    .line 56
    invoke-virtual {v12, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x0

    .line 57
    :cond_7
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_8
    :goto_4
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v13

    goto :goto_3

    :cond_9
    if-ne v15, v11, :cond_a

    goto :goto_2

    .line 59
    :cond_a
    :goto_5
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    goto :goto_2

    .line 60
    :cond_b
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    goto :goto_1

    .line 61
    :cond_c
    invoke-virtual {v9}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v9

    if-eqz v9, :cond_d

    .line 62
    invoke-virtual {v9}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v8

    if-eqz v8, :cond_d

    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    goto/16 :goto_0

    :cond_d
    const/4 v8, 0x0

    goto/16 :goto_0

    .line 63
    :cond_e
    :goto_6
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusTargetNode;->onDispatchEventsCompleted:Lhd/l;

    if-eqz v1, :cond_f

    invoke-interface {v1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    return-void
.end method

.method public final fetchCustomEnter-aToIllA$ui_release(ILhd/l;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$isProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

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
    move-result v4

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    move v4, v1

    .line 36
    :goto_0
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {v5}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {v5}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusProperties;->getOnEnter()Lhd/l;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2, v3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move p1, v1

    .line 63
    :goto_1
    invoke-interface {v5}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v3}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;->isCanceled()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    if-ne v4, p1, :cond_3

    .line 84
    .line 85
    sget-boolean p1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 86
    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    if-eq v6, v2, :cond_4

    .line 90
    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    :cond_3
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 94
    .line 95
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    :cond_4
    :goto_2
    invoke-static {v0}, Lkotlin/jvm/internal/s;->b(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/jvm/internal/s;->a(I)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :goto_3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->b(I)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/jvm/internal/s;->a(I)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_5
    return-void
.end method

.method public final fetchCustomExit-aToIllA$ui_release(ILhd/l;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$isProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

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
    move-result v4

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    move v4, v1

    .line 36
    :goto_0
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {v5}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {v5}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusProperties;->getOnExit()Lhd/l;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2, v3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move p1, v1

    .line 63
    :goto_1
    invoke-interface {v5}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v3}, Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;->isCanceled()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    if-ne v4, p1, :cond_3

    .line 84
    .line 85
    sget-boolean p1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 86
    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    if-eq v6, v2, :cond_4

    .line 90
    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    :cond_3
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 94
    .line 95
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    :cond_4
    :goto_2
    invoke-static {v0}, Lkotlin/jvm/internal/s;->b(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/jvm/internal/s;->a(I)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :goto_3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->b(I)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/jvm/internal/s;->a(I)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_5
    return-void
.end method

.method public final fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;
    .locals 15

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusPropertiesImpl;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusPropertiesImpl;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusability-LCbbffg()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1, p0}, Landroidx/compose/ui/focus/Focusability;->canFocus-impl$ui_release(ILandroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Landroidx/compose/ui/focus/FocusPropertiesImpl;->setCanFocus(Z)V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x800

    .line 18
    .line 19
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v2, 0x400

    .line 24
    .line 25
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    or-int v4, v1, v2

    .line 34
    .line 35
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    const-string/jumbo v5, "visitAncestors called on an unattached node"

    .line 46
    .line 47
    .line 48
    invoke-static {v5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    :goto_0
    if-eqz v6, :cond_c

    .line 60
    .line 61
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    and-int/2addr v7, v4

    .line 74
    const/4 v8, 0x0

    .line 75
    if-eqz v7, :cond_a

    .line 76
    .line 77
    :goto_1
    if-eqz v5, :cond_a

    .line 78
    .line 79
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    and-int/2addr v7, v4

    .line 84
    if-eqz v7, :cond_9

    .line 85
    .line 86
    if-eq v5, v3, :cond_1

    .line 87
    .line 88
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    and-int/2addr v7, v2

    .line 93
    if-eqz v7, :cond_1

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_1
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    and-int/2addr v7, v1

    .line 101
    if-eqz v7, :cond_9

    .line 102
    .line 103
    move-object v7, v5

    .line 104
    move-object v9, v8

    .line 105
    :goto_2
    if-eqz v7, :cond_9

    .line 106
    .line 107
    instance-of v10, v7, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 108
    .line 109
    if-eqz v10, :cond_2

    .line 110
    .line 111
    check-cast v7, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 112
    .line 113
    invoke-interface {v7, v0}, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;->applyFocusProperties(Landroidx/compose/ui/focus/FocusProperties;)V

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_2
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    and-int/2addr v10, v1

    .line 122
    if-eqz v10, :cond_8

    .line 123
    .line 124
    instance-of v10, v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 125
    .line 126
    if-eqz v10, :cond_8

    .line 127
    .line 128
    move-object v10, v7

    .line 129
    check-cast v10, Landroidx/compose/ui/node/DelegatingNode;

    .line 130
    .line 131
    invoke-virtual {v10}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    const/4 v11, 0x0

    .line 136
    move v12, v11

    .line 137
    :goto_3
    const/4 v13, 0x1

    .line 138
    if-eqz v10, :cond_7

    .line 139
    .line 140
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    and-int/2addr v14, v1

    .line 145
    if-eqz v14, :cond_6

    .line 146
    .line 147
    add-int/lit8 v12, v12, 0x1

    .line 148
    .line 149
    if-ne v12, v13, :cond_3

    .line 150
    .line 151
    move-object v7, v10

    .line 152
    goto :goto_4

    .line 153
    :cond_3
    if-nez v9, :cond_4

    .line 154
    .line 155
    new-instance v9, Landroidx/compose/runtime/collection/MutableVector;

    .line 156
    .line 157
    const/16 v13, 0x10

    .line 158
    .line 159
    new-array v13, v13, [Landroidx/compose/ui/Modifier$Node;

    .line 160
    .line 161
    invoke-direct {v9, v13, v11}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    :cond_4
    if-eqz v7, :cond_5

    .line 165
    .line 166
    invoke-virtual {v9, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-object v7, v8

    .line 170
    :cond_5
    invoke-virtual {v9, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_6
    :goto_4
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    goto :goto_3

    .line 178
    :cond_7
    if-ne v12, v13, :cond_8

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_8
    :goto_5
    invoke-static {v9}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    goto :goto_2

    .line 186
    :cond_9
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    goto :goto_1

    .line 191
    :cond_a
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    if-eqz v6, :cond_b

    .line 196
    .line 197
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    if-eqz v5, :cond_b

    .line 202
    .line 203
    invoke-virtual {v5}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_b
    move-object v5, v8

    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_c
    return-object v0
.end method

.method public final getBeyondBoundsLayoutParent()Landroidx/compose/ui/layout/BeyondBoundsLayout;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/layout/BeyondBoundsLayoutKt;->getModifierLocalBeyondBoundsLayout()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, v0}, Landroidx/compose/ui/modifier/ModifierLocalModifierNode;->getCurrent(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/ui/layout/BeyondBoundsLayout;

    .line 10
    .line 11
    return-object v0
.end method

.method public bridge synthetic getFocusState()Landroidx/compose/ui/focus/FocusState;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    return-object v0
.end method

.method public getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;
    .locals 11

    .line 2
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v0, :cond_10

    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    return-object v0

    .line 4
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    return-object v0

    :cond_1
    if-ne p0, v1, :cond_3

    .line 6
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusOwner;->isFocusCaptured()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    return-object v0

    :cond_2
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    return-object v0

    .line 7
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0x400

    .line 8
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v0

    .line 9
    invoke-interface {v1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v2

    if-nez v2, :cond_4

    const-string/jumbo v2, "visitAncestors called on an unattached node"

    .line 10
    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 11
    :cond_4
    invoke-interface {v1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    .line 12
    invoke-static {v1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_f

    .line 13
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    .line 14
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v3

    and-int/2addr v3, v0

    const/4 v4, 0x0

    if-eqz v3, :cond_d

    :goto_1
    if-eqz v2, :cond_d

    .line 15
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_c

    move-object v3, v2

    move-object v5, v4

    :goto_2
    if-eqz v3, :cond_c

    .line 16
    instance-of v6, v3, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v6, :cond_5

    .line 17
    check-cast v3, Landroidx/compose/ui/focus/FocusTargetNode;

    if-ne p0, v3, :cond_b

    .line 18
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    return-object v0

    .line 19
    :cond_5
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_b

    .line 20
    instance-of v6, v3, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v6, :cond_b

    .line 21
    move-object v6, v3

    check-cast v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 22
    invoke-virtual {v6}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_a

    .line 23
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_9

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_6

    move-object v3, v6

    goto :goto_4

    :cond_6
    if-nez v5, :cond_7

    .line 24
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v5, v9, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    :cond_7
    if-eqz v3, :cond_8

    .line 25
    invoke-virtual {v5, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-object v3, v4

    .line 26
    :cond_8
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 27
    :cond_9
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    goto :goto_3

    :cond_a
    if-ne v8, v9, :cond_b

    goto :goto_2

    .line 28
    :cond_b
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    goto :goto_2

    .line 29
    :cond_c
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    goto :goto_1

    .line 30
    :cond_d
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 31
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    goto/16 :goto_0

    :cond_e
    move-object v2, v4

    goto/16 :goto_0

    .line 32
    :cond_f
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    return-object v0

    .line 33
    :cond_10
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->getFocusTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0, p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getUncommittedFocusState(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_5

    :cond_11
    return-object v0

    .line 34
    :cond_12
    :goto_5
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

    if-nez v0, :cond_13

    .line 35
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    :cond_13
    return-object v0
.end method

.method public getFocusability-LCbbffg()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->focusability:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPreviouslyFocusedChildHash()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->previouslyFocusedChildHash:I

    .line 2
    .line 3
    return v0
.end method

.method public getShouldAutoInvalidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->shouldAutoInvalidate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final initializeFocusState$ui_release(Landroidx/compose/ui/focus/FocusStateImpl;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->isInitialized$ui_release()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 8
    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_2

    .line 27
    :cond_0
    :goto_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 28
    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->initializeFocusState$isInActiveSubTree(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->initializeFocusState$hasActiveChild(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    sget-object p1, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    sget-object p1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 48
    .line 49
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :goto_2
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    return-void

    .line 63
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string v0, "Re-initializing focus target node."

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public final invalidateFocus$ui_release()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->isInitialized$ui_release()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, v2, v1, v2}, Landroidx/compose/ui/focus/FocusTargetNode;->initializeFocusState$ui_release$default(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v3, Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    aget v0, v3, v0

    .line 23
    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-eq v0, v3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 31
    .line 32
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v3, Landroidx/compose/ui/focus/FocusTargetNode$invalidateFocus$1;

    .line 36
    .line 37
    invoke-direct {v3, v0, p0}, Landroidx/compose/ui/focus/FocusTargetNode$invalidateFocus$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v3}, Landroidx/compose/ui/node/ObserverModifierNodeKt;->observeReads(Landroidx/compose/ui/Modifier$Node;Lhd/a;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-string v0, "focusProperties"

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object v2, v0

    .line 54
    check-cast v2, Landroidx/compose/ui/focus/FocusProperties;

    .line 55
    .line 56
    :goto_0
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusProperties;->getCanFocus()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0, v1}, Landroidx/compose/ui/focus/FocusManager;->clearFocus(Z)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_1
    return-void
.end method

.method public final isInitialized$ui_release()Z
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return v1

    .line 12
    :cond_1
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public onAttach()V
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->invalidateFocusTarget(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onDetach()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;->$EnumSwitchMapping$1:[I

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
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 24
    .line 25
    if-nez v0, :cond_4

    .line 26
    .line 27
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 44
    .line 45
    .line 46
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :goto_1
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_2
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v2, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getExit-dhqQ-8s()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-interface {v0, v1, v1, v3, v2}, Landroidx/compose/ui/focus/FocusOwner;->clearFocus-I7lrPNg(ZZZI)Z

    .line 77
    .line 78
    .line 79
    sget-boolean v1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 80
    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusOwner;->scheduleInvalidationForOwner()V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->invalidateFocusTarget(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    :goto_2
    const/4 v0, 0x0

    .line 91
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 92
    .line 93
    return-void
.end method

.method public onObservedReadsChanged()V
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->invalidateFocus$ui_release()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->invalidateFocus$ui_release()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public synthetic requestFocus()Z
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->requestFocus-3ESFkO8(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public requestFocus-3ESFkO8(I)Z
    .locals 8

    .line 1
    const-string v0, "FocusTransactions:requestFocus"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getCanFocus()Z

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 18
    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    :try_start_1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    const/4 v3, 0x3

    .line 25
    const/4 v4, 0x2

    .line 26
    const/4 v5, 0x1

    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomRequestFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    aget p1, v0, p1

    .line 40
    .line 41
    if-eq p1, v5, :cond_3

    .line 42
    .line 43
    if-eq p1, v4, :cond_2

    .line 44
    .line 45
    if-eq p1, v3, :cond_a

    .line 46
    .line 47
    if-ne p1, v2, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 51
    .line 52
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_4

    .line 58
    :cond_2
    move v1, v5

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performRequestFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v6, Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;

    .line 70
    .line 71
    invoke-direct {v6, p0}, Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    :try_start_2
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_5

    .line 79
    .line 80
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_1
    move-exception p1

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    :goto_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v7, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomRequestFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    sget-object v6, Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    aget p1, v6, p1

    .line 107
    .line 108
    if-eq p1, v5, :cond_8

    .line 109
    .line 110
    if-eq p1, v4, :cond_7

    .line 111
    .line 112
    if-eq p1, v3, :cond_9

    .line 113
    .line 114
    if-ne p1, v2, :cond_6

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 118
    .line 119
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_7
    move v1, v5

    .line 124
    goto :goto_1

    .line 125
    :cond_8
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performRequestFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 126
    .line 127
    .line 128
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    :cond_9
    :goto_1
    :try_start_3
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 130
    .line 131
    .line 132
    :cond_a
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 133
    .line 134
    .line 135
    return v1

    .line 136
    :goto_3
    :try_start_4
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 137
    .line 138
    .line 139
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 140
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 141
    .line 142
    .line 143
    throw p1
.end method

.method public setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->setUncommittedFocusState(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setFocusability-josRg5g(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->focusability:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/compose/ui/focus/Focusability;->equals-impl0(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->focusability:I

    .line 10
    .line 11
    sget-boolean p1, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Landroidx/compose/ui/focus/FocusOwner;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-ne p0, p1, :cond_1

    .line 34
    .line 35
    iget p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->focusability:I

    .line 36
    .line 37
    invoke-static {p1, p0}, Landroidx/compose/ui/focus/Focusability;->canFocus-impl$ui_release(ILandroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-static {p0, p1, p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->isInitialized$ui_release()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->onObservedReadsChanged()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final setPreviouslyFocusedChildHash(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->previouslyFocusedChildHash:I

    .line 2
    .line 3
    return-void
.end method
