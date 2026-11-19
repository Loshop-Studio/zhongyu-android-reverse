.class public final Lcom/zykj/sketch/core/ActionStrategyFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/ActionStrategyFactory$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0017\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/zykj/sketch/core/ActionStrategyFactory;",
        "",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "control",
        "<init>",
        "(Lcom/zykj/sketch/core/listener/IControl;)V",
        "",
        "getGraphName",
        "()Ljava/lang/String;",
        "getActionGraphName",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "mode",
        "Lcom/zykj/sketch/core/listener/IAction;",
        "create",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/core/listener/IAction;",
        "Ld6/s;",
        "clearAction",
        "()V",
        "reset",
        "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;",
        "buildActionMode",
        "()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;",
        "actionFactory",
        "parseActionMode",
        "(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;)V",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "Lcom/zykj/sketch/core/action/BaseAction;",
        "action",
        "Lcom/zykj/sketch/core/action/BaseAction;",
        "getAction",
        "()Lcom/zykj/sketch/core/action/BaseAction;",
        "setAction",
        "(Lcom/zykj/sketch/core/action/BaseAction;)V",
        "Lcom/zykj/sketch/core/graph/WritingGroupGraph;",
        "tempGraph",
        "Lcom/zykj/sketch/core/graph/WritingGroupGraph;",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private action:Lcom/zykj/sketch/core/action/BaseAction;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final control:Lcom/zykj/sketch/core/listener/IControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/IControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "control"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    return-void
.end method

.method private final getActionGraphName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/sketch/core/action/WritingAction;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAction"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/sketch/core/action/WritingAction;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/sketch/core/action/WritingAction;->getParentGraphName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    instance-of v1, v0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const-string v1, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAndMoveAction"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast v0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/zykj/sketch/core/action/WritingAndMoveAction;->getParentGraphName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_1
    instance-of v1, v0, Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const-string v1, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAndMoveVerticalAction"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast v0, Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;->getParentGraphName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_2
    const/4 v0, 0x0

    .line 52
    return-object v0
.end method

.method private final getGraphName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getGraphName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method


# virtual methods
.method public final buildActionMode()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IAction;->enumType()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;->setBaseAction(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionStrategyFactory;->getActionGraphName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;->setFactoryActionGraphName(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionStrategyFactory;->getGraphName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;->setFactoryGraphName(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "newBuilder.build()"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public final clearAction()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 3
    .line 4
    return-void
.end method

.method public final create(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/core/listener/IAction;
    .locals 2
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/sketch/core/ActionStrategyFactory$WhenMappings;->$EnumSwitchMapping$0:[I

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
    const/4 v0, 0x0

    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :pswitch_0
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :pswitch_1
    new-instance p1, Lcom/zykj/sketch/core/action/EraseWritingAction;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 33
    .line 34
    invoke-direct {p1, v0}, Lcom/zykj/sketch/core/action/EraseWritingAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :pswitch_2
    new-instance p1, Lcom/zykj/sketch/core/action/EraseViewAction;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 44
    .line 45
    invoke-direct {p1, v1}, Lcom/zykj/sketch/core/action/EraseViewAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :pswitch_3
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 55
    .line 56
    instance-of p1, p1, Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;

    .line 57
    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 61
    .line 62
    if-nez p1, :cond_0

    .line 63
    .line 64
    new-instance p1, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 67
    .line 68
    invoke-direct {p1, v0}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 72
    .line 73
    :cond_0
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    new-instance v0, Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;

    .line 78
    .line 79
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 80
    .line 81
    invoke-direct {v0, v1, p1}, Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_4
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 88
    .line 89
    instance-of p1, p1, Lcom/zykj/sketch/core/action/WritingAndMoveAction;

    .line 90
    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 94
    .line 95
    if-nez p1, :cond_1

    .line 96
    .line 97
    new-instance p1, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 98
    .line 99
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 100
    .line 101
    invoke-direct {p1, v0}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 105
    .line 106
    :cond_1
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    new-instance v0, Lcom/zykj/sketch/core/action/WritingAndMoveAction;

    .line 111
    .line 112
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 113
    .line 114
    invoke-direct {v0, v1, p1}, Lcom/zykj/sketch/core/action/WritingAndMoveAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :pswitch_5
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 121
    .line 122
    instance-of p1, p1, Lcom/zykj/sketch/core/action/WritingAction;

    .line 123
    .line 124
    if-nez p1, :cond_3

    .line 125
    .line 126
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 127
    .line 128
    if-nez p1, :cond_2

    .line 129
    .line 130
    new-instance p1, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 131
    .line 132
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 133
    .line 134
    invoke-direct {p1, v0}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 135
    .line 136
    .line 137
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 138
    .line 139
    :cond_2
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 140
    .line 141
    if-eqz p1, :cond_3

    .line 142
    .line 143
    new-instance v0, Lcom/zykj/sketch/core/action/WritingAction;

    .line 144
    .line 145
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 146
    .line 147
    invoke-direct {v0, v1, p1}, Lcom/zykj/sketch/core/action/WritingAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V

    .line 148
    .line 149
    .line 150
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :pswitch_6
    new-instance p1, Lcom/zykj/sketch/core/action/SelectAction;

    .line 154
    .line 155
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 156
    .line 157
    invoke-direct {p1, v1}, Lcom/zykj/sketch/core/action/SelectAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 158
    .line 159
    .line 160
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 161
    .line 162
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 163
    .line 164
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 165
    .line 166
    return-object p1

    .line 167
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getAction()Lcom/zykj/sketch/core/action/BaseAction;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 2
    .line 3
    return-object v0
.end method

.method public final parseActionMode(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;)V
    .locals 2
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "actionFactory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->getFactoryGraphName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 18
    .line 19
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/core/graph/Graph;->findGraphByName(Ljava/lang/String;)Lcom/zykj/sketch/core/graph/Graph;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    instance-of v1, v0, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    check-cast v0, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->getFactoryActionGraphName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_5

    .line 42
    .line 43
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 44
    .line 45
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/core/graph/Graph;->findGraphByName(Ljava/lang/String;)Lcom/zykj/sketch/core/graph/Graph;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    instance-of v1, v0, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;->getBaseAction()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_1

    .line 64
    .line 65
    const/4 p1, -0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    sget-object v1, Lcom/zykj/sketch/core/ActionStrategyFactory$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    aget p1, v1, p1

    .line 74
    .line 75
    :goto_0
    const/4 v1, 0x2

    .line 76
    if-eq p1, v1, :cond_4

    .line 77
    .line 78
    const/4 v1, 0x3

    .line 79
    if-eq p1, v1, :cond_3

    .line 80
    .line 81
    const/4 v1, 0x4

    .line 82
    if-eq p1, v1, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    new-instance p1, Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;

    .line 86
    .line 87
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 88
    .line 89
    check-cast v0, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 90
    .line 91
    invoke-direct {p1, v1, v0}, Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    new-instance p1, Lcom/zykj/sketch/core/action/WritingAndMoveAction;

    .line 98
    .line 99
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 100
    .line 101
    check-cast v0, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 102
    .line 103
    invoke-direct {p1, v1, v0}, Lcom/zykj/sketch/core/action/WritingAndMoveAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 107
    .line 108
    return-void

    .line 109
    :cond_4
    new-instance p1, Lcom/zykj/sketch/core/action/WritingAction;

    .line 110
    .line 111
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 112
    .line 113
    check-cast v0, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 114
    .line 115
    invoke-direct {p1, v1, v0}, Lcom/zykj/sketch/core/action/WritingAction;-><init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 119
    .line 120
    :cond_5
    :goto_1
    return-void
.end method

.method public final reset()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->tempGraph:Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 5
    .line 6
    return-void
.end method

.method public final setAction(Lcom/zykj/sketch/core/action/BaseAction;)V
    .locals 0
    .param p1    # Lcom/zykj/sketch/core/action/BaseAction;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionStrategyFactory;->action:Lcom/zykj/sketch/core/action/BaseAction;

    .line 2
    .line 3
    return-void
.end method
