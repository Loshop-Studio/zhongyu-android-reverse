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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u0006."
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/TouchActionModeFactory;",
        "Lcom/zykj/blackboard/listener/EventListener;",
        "<init>",
        "()V",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "entity",
        "Ld6/s;",
        "onEvent",
        "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "listener",
        "setListener",
        "(Lcom/zykj/blackboard/core/action/IActionListener;)V",
        "Lcom/zykj/blackboard/core/action/ITouchAction;",
        "create",
        "(Lcom/zykj/blackboard/core/action/IActionListener;)Lcom/zykj/blackboard/core/action/ITouchAction;",
        "getCurrentAction",
        "Lcom/zykj/blackboard/core/action/WritingAction;",
        "writingAction",
        "Lcom/zykj/blackboard/core/action/WritingAction;",
        "getWritingAction$blackboard_release",
        "()Lcom/zykj/blackboard/core/action/WritingAction;",
        "Lcom/zykj/blackboard/core/action/WriteBeelineAction;",
        "writeBeelineAction",
        "Lcom/zykj/blackboard/core/action/WriteBeelineAction;",
        "Lcom/zykj/blackboard/core/action/SelectAction;",
        "selectAction",
        "Lcom/zykj/blackboard/core/action/SelectAction;",
        "Lcom/zykj/blackboard/core/action/EraseWritingAction;",
        "eraseWritingAction",
        "Lcom/zykj/blackboard/core/action/EraseWritingAction;",
        "Lcom/zykj/blackboard/core/action/SeeAction;",
        "seeAction",
        "Lcom/zykj/blackboard/core/action/SeeAction;",
        "Lcom/zykj/blackboard/core/action/TextAction;",
        "textAction",
        "Lcom/zykj/blackboard/core/action/TextAction;",
        "Lcom/zykj/blackboard/core/action/CursorAction;",
        "cursorAction",
        "Lcom/zykj/blackboard/core/action/CursorAction;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;",
        "newSelectAction",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;",
        "Lcom/zykj/blackboard/core/action/GeometryAction;",
        "geometryAction",
        "Lcom/zykj/blackboard/core/action/GeometryAction;",
        "blackboard_release"
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
.field private final cursorAction:Lcom/zykj/blackboard/core/action/CursorAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final eraseWritingAction:Lcom/zykj/blackboard/core/action/EraseWritingAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final geometryAction:Lcom/zykj/blackboard/core/action/GeometryAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final newSelectAction:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final seeAction:Lcom/zykj/blackboard/core/action/SeeAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final selectAction:Lcom/zykj/blackboard/core/action/SelectAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final textAction:Lcom/zykj/blackboard/core/action/TextAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final writeBeelineAction:Lcom/zykj/blackboard/core/action/WriteBeelineAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final writingAction:Lcom/zykj/blackboard/core/action/WritingAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


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
    .param p1    # Lcom/zykj/blackboard/core/action/IActionListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/blackboard/core/action/IActionListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->writingAction:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 2
    .line 3
    return-object v0
.end method

.method public onEvent(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "entity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setListener(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/action/IActionListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
