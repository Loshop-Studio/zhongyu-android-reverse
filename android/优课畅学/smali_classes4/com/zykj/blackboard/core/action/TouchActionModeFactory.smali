.class public final Lcom/zykj/blackboard/core/action/TouchActionModeFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/EventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/TouchActionModeFactory$WhenMappings;
    }
.end annotation


# instance fields
.field private final cursorAction:Lcom/zykj/blackboard/core/action/CursorAction;

.field private final eraseWritingAction:Lcom/zykj/blackboard/core/action/EraseWritingAction;

.field private final geometryAction:Lcom/zykj/blackboard/core/action/GeometryAction;

.field private final newSelectAction:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

.field private final seeAction:Lcom/zykj/blackboard/core/action/SeeAction;

.field private final selectAction:Lcom/zykj/blackboard/core/action/SelectAction;

.field private final textAction:Lcom/zykj/blackboard/core/action/TextAction;

.field private final writeBeelineAction:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

.field private final writingAction:Lcom/zykj/blackboard/core/action/WritingAction;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/blackboard/core/action/WritingAction;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/WritingAction;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writingAction:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/WriteBeelineAction;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writeBeelineAction:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 17
    .line 18
    new-instance v0, Lcom/zykj/blackboard/core/action/SelectAction;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/SelectAction;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->selectAction:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 26
    .line 27
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/EraseWritingAction;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->eraseWritingAction:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 31
    .line 32
    new-instance v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 33
    .line 34
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/SeeAction;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->seeAction:Lcom/zykj/blackboard/core/action/SeeAction;

    .line 38
    .line 39
    new-instance v0, Lcom/zykj/blackboard/core/action/TextAction;

    .line 40
    .line 41
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/TextAction;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->textAction:Lcom/zykj/blackboard/core/action/TextAction;

    .line 45
    .line 46
    new-instance v0, Lcom/zykj/blackboard/core/action/CursorAction;

    .line 47
    .line 48
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/CursorAction;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->cursorAction:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 52
    .line 53
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->newSelectAction:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 59
    .line 60
    new-instance v0, Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 61
    .line 62
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/GeometryAction;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->geometryAction:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final create(Lcom/zykj/blackboard/core/action/IActionListener;)Lcom/zykj/blackboard/core/action/ITouchAction;
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMode()Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->geometryAction:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/GeometryAction;->reset()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->geometryAction:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->newSelectAction:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->reset()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->newSelectAction:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->cursorAction:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/CursorAction;->reset()V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->cursorAction:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->textAction:Lcom/zykj/blackboard/core/action/TextAction;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->reset()V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->textAction:Lcom/zykj/blackboard/core/action/TextAction;

    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_4
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->seeAction:Lcom/zykj/blackboard/core/action/SeeAction;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/SeeAction;->reset()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->seeAction:Lcom/zykj/blackboard/core/action/SeeAction;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->eraseWritingAction:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->reset()V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->eraseWritingAction:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_6
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writeBeelineAction:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->reset()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writeBeelineAction:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_7
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writingAction:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->reset()V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writingAction:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_8
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->selectAction:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/SelectAction;->reset()V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->selectAction:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getCurrentAction(Lcom/zykj/blackboard/core/action/IActionListener;)Lcom/zykj/blackboard/core/action/ITouchAction;
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMode()Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->geometryAction:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->newSelectAction:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->cursorAction:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->textAction:Lcom/zykj/blackboard/core/action/TextAction;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_4
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->seeAction:Lcom/zykj/blackboard/core/action/SeeAction;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->eraseWritingAction:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_6
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writeBeelineAction:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_7
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writingAction:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_8
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->selectAction:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 52
    .line 53
    return-object p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getWritingAction$blackboard_release()Lcom/zykj/blackboard/core/action/WritingAction;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writingAction:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 2
    .line 3
    return-object v0
.end method

.method public onEvent(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 1

    const-string v0, "entity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setListener(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writingAction:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writeBeelineAction:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->selectAction:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->eraseWritingAction:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->seeAction:Lcom/zykj/blackboard/core/action/SeeAction;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->textAction:Lcom/zykj/blackboard/core/action/TextAction;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->cursorAction:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->newSelectAction:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->geometryAction:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->setActionListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
