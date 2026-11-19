.class public final Lcom/zykj/sketch/core/ActionRecordExecute;
.super Lcom/zykj/sketch/core/ActionExecute;
.source "SourceFile"


# instance fields
.field private final actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

.field private final actionRecord:Lcom/zykj/sketch/core/ActionRecord;

.field private final control:Lcom/zykj/sketch/core/listener/IControl;

.field private isRecord:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionRecord;Lcom/zykj/sketch/core/ActionStrategyFactory;)V
    .locals 1

    .line 1
    const-string v0, "viewGroup"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "control"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "actionRecord"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "actionFactory"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2, p4}, Lcom/zykj/sketch/core/ActionExecute;-><init>(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 27
    .line 28
    iput-object p4, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->isRecord:Z

    .line 32
    .line 33
    return-void
.end method

.method private final addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->isRecord:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/core/ActionRecord;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public onActionModeEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V
    .locals 1

    .line 1
    const-string v0, "modeConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onActionModeEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_MODE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onAddImageEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lx7/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "imageConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Lcom/zykj/sketch/core/ActionExecute;->onAddImageEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lx7/l;)V

    .line 12
    .line 13
    .line 14
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_IMAGE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 15
    .line 16
    invoke-direct {p0, p2, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onAddPPTEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lx7/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "webViewConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Lcom/zykj/sketch/core/ActionExecute;->onAddPPTEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lx7/l;)V

    .line 12
    .line 13
    .line 14
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_WEB:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 15
    .line 16
    invoke-direct {p0, p2, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onAudioStartRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onAudioStartRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_START:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onAudioStopRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onAudioStopRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onClearBoardEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onClearBoardEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_CLEAR_BOARD:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/sketch/core/ActionRecord;->clear()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onDrawConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V
    .locals 1

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onDrawConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_DRAW_CONFIG:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onGraphConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V
    .locals 1

    .line 1
    const-string v0, "graphConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onGraphConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_GRAPH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onNextActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V
    .locals 2

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onNextActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/sketch/core/ActionRecord;->next()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 18
    .line 19
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->reset()V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p0, v0, v1}, Lcom/zykj/sketch/core/ActionExecute;->graphSnapShot(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_NEXT:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 32
    .line 33
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onPrevActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V
    .locals 2

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onPrevActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/sketch/core/ActionRecord;->prev()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 18
    .line 19
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->reset()V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p0, v0, v1}, Lcom/zykj/sketch/core/ActionExecute;->graphSnapShot(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 33
    .line 34
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->reset()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/zykj/sketch/core/ActionStrategyFactory;->reset()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 43
    .line 44
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_PREV:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 48
    .line 49
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public onTouchEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onTouchEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x1

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/sketch/core/ActionExecute;->getAction()Lcom/zykj/sketch/core/listener/IAction;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IAction;->isRecord()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IAction;->getTouchEventList()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 35
    .line 36
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IAction;->getTouchStartTime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-virtual {v2, v3, v4, v0}, Lcom/zykj/sketch/core/ActionRecord;->buildTouch(JLjava/util/List;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p0, v1, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public onTranslation(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onTranslation(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TRANS:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1
.end method

.method public onZoom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->onZoom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_ZOOM:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1
.end method

.method public reset()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/ActionExecute;->reset()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecordExecute;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/zykj/sketch/core/ActionRecord;->reset()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public resetMatrix(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->resetMatrix(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_RESET_MATRIX:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
