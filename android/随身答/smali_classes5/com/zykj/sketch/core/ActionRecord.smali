# RE note 将 Sketch 原生画板事件封装为动作消息并持久化。
.class public final Lcom/zykj/sketch/core/ActionRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/ActionRecord$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0008J\u0014\u0010\u0019\u001a\u00020\u00172\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0015J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0011J\u0010\u0010\u001d\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020$H\u0002J\u0016\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020,2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u0010-\u001a\u00020.2\u0006\u0010\'\u001a\u00020(J\'\u0010/\u001a\u0002002\u0006\u0010\'\u001a\u00020(2\u0008\u00101\u001a\u0004\u0018\u00010\u000c2\u0008\u00102\u001a\u0004\u0018\u000103\u00a2\u0006\u0002\u00104J\u0016\u00105\u001a\u0002062\u0006\u0010\'\u001a\u00020(2\u0006\u00102\u001a\u000207J\u0008\u00108\u001a\u000209H\u0002J>\u0010:\u001a\u00020;2\u0006\u0010\'\u001a\u00020(2\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\u000c2\u0006\u0010>\u001a\u00020\u000c2\u0006\u0010?\u001a\u00020\u000c2\u0006\u0010@\u001a\u00020\u000c2\u0006\u0010A\u001a\u00020\u000cJ\u0016\u0010B\u001a\u00020C2\u0006\u0010\'\u001a\u00020(2\u0006\u0010D\u001a\u00020EJ\u000e\u0010F\u001a\u00020G2\u0006\u0010\'\u001a\u00020(J\u000e\u0010H\u001a\u00020I2\u0006\u0010\'\u001a\u00020(J\u000e\u0010J\u001a\u00020K2\u0006\u0010\'\u001a\u00020(J\u001c\u0010L\u001a\u00020M2\u0006\u0010\'\u001a\u00020(2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020N0\u0015J/\u0010O\u001a\u00020P2\u0006\u0010\'\u001a\u00020(2\u0008\u0010Q\u001a\u0004\u0018\u00010R2\u0008\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010T\u001a\u00020\u000e\u00a2\u0006\u0002\u0010UJ6\u0010V\u001a\u00020W2\u0006\u0010\'\u001a\u00020(2\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\u000c2\u0006\u0010>\u001a\u00020\u000c2\u0006\u0010?\u001a\u00020\u000c2\u0006\u0010@\u001a\u00020\u000cJ6\u0010X\u001a\u00020Y2\u0006\u0010\'\u001a\u00020(2\u0006\u0010Z\u001a\u00020R2\u0006\u0010[\u001a\u00020R2\u0006\u0010\\\u001a\u00020R2\u0006\u0010]\u001a\u00020R2\u0006\u0010T\u001a\u00020\u000eJ\u0006\u0010^\u001a\u00020\u0017J\u0008\u0010_\u001a\u0004\u0018\u00010\u0011J\u0008\u0010`\u001a\u00020\u0017H\u0002J\u0006\u0010a\u001a\u00020\u0017J\u0008\u0010b\u001a\u0004\u0018\u00010\u0011J\u0006\u0010c\u001a\u00020\u0017J\u001e\u0010d\u001a\u00020\u00172\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\u000c2\u0006\u0010>\u001a\u00020\u000cJ\u000e\u0010e\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006g"
    }
    d2 = {
        "Lcom/zykj/sketch/core/ActionRecord;",
        "",
        "actionControl",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "actionFactory",
        "Lcom/zykj/sketch/core/ActionStrategyFactory;",
        "(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V",
        "actionChangeListener",
        "Lcom/zykj/sketch/core/listener/ActionChangeListener;",
        "header",
        "Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;",
        "index",
        "",
        "isRecord",
        "",
        "listIterator",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "nextPrevListener",
        "Lcom/zykj/sketch/core/listener/NextPrevListener;",
        "rendData",
        "",
        "addActionChangeListener",
        "",
        "listener",
        "addHistoryRecord",
        "actionContent",
        "addHistoryRenderGraphSnapshot",
        "graphSnapshot",
        "addNextPrevListener",
        "addRecord",
        "type",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;",
        "message",
        "Lcom/google/protobuf/Message;",
        "buildActionContent",
        "Lcom/google/protobuf/Any;",
        "buildAudioStartEvent",
        "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;",
        "startTime",
        "",
        "fileName",
        "",
        "buildAudioStopEvent",
        "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;",
        "buildClearBoardData",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;",
        "buildDrawConfig",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;",
        "color",
        "config",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
        "(JLjava/lang/Integer;Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;",
        "buildGraphConfig",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;",
        "buildHistoryRendData",
        "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
        "buildImageData",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
        "path",
        "width",
        "height",
        "viewWidth",
        "viewHeight",
        "positionFlag",
        "buildModeConfig",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;",
        "mode",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "buildNextActionData",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;",
        "buildPrevActionData",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;",
        "buildResetMatrix",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;",
        "buildTouch",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "buildTranslation",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;",
        "translateX",
        "",
        "translateY",
        "keep",
        "(JLjava/lang/Float;Ljava/lang/Float;Z)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;",
        "buildWebViewData",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
        "buildZoomActionData",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;",
        "scaleX",
        "scaleY",
        "centerX",
        "centerY",
        "clear",
        "next",
        "notifyListener",
        "onDestroy",
        "prev",
        "reset",
        "saveRecord",
        "setHeader",
        "Lcom/zykj/sketch/EzyDrawBoard$BoardHead;",
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
.field private actionChangeListener:Lcom/zykj/sketch/core/listener/ActionChangeListener;

.field private final actionControl:Lcom/zykj/sketch/core/listener/IControl;

.field private final actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

.field private header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

.field private index:I

.field private isRecord:Z

.field private final listIterator:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation
.end field

.field private nextPrevListener:Lcom/zykj/sketch/core/listener/NextPrevListener;

.field private final rendData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V
    .locals 1

    .line 1
    const-string v0, "actionControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "actionFactory"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/sketch/core/ActionRecord;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 39
    .line 40
    const/4 p1, -0x1

    .line 41
    iput p1, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 42
    .line 43
    sget-object p1, Lcom/zykj/sketch/core/data/BoardDataFactory;->Companion:Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->buildHead()Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 50
    .line 51
    return-void
.end method

.method private final buildActionContent(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setType(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, -0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p2, Lcom/zykj/sketch/core/ActionRecord$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    aget p1, p2, p1

    .line 26
    .line 27
    :goto_0
    const/4 p2, 0x1

    .line 28
    if-eq p1, p2, :cond_3

    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    if-eq p1, v1, :cond_2

    .line 32
    .line 33
    const/4 p2, 0x7

    .line 34
    if-eq p1, p2, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->buildHistoryRendData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    iput-boolean p1, p0, Lcom/zykj/sketch/core/ActionRecord;->isRecord:Z

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->buildHistoryRendData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 53
    .line 54
    .line 55
    iput-boolean p2, p0, Lcom/zykj/sketch/core/ActionRecord;->isRecord:Z

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->buildHistoryRendData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 63
    .line 64
    .line 65
    :goto_1
    iget-boolean p1, p0, Lcom/zykj/sketch/core/ActionRecord;->isRecord:Z

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_START:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 74
    .line 75
    if-ne p1, p2, :cond_9

    .line 76
    .line 77
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 78
    .line 79
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IGraph;->getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 88
    .line 89
    .line 90
    goto/16 :goto_5

    .line 91
    .line 92
    :cond_4
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 97
    .line 98
    if-ne p1, p2, :cond_5

    .line 99
    .line 100
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 101
    .line 102
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IGraph;->getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 111
    .line 112
    .line 113
    goto/16 :goto_5

    .line 114
    .line 115
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_GRAPH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 120
    .line 121
    if-eq p1, p2, :cond_9

    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_DRAW_CONFIG:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 128
    .line 129
    if-eq p1, p2, :cond_9

    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_MODE:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 136
    .line 137
    if-ne p1, p2, :cond_6

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_6
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 141
    .line 142
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IGraph;->getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 151
    .line 152
    .line 153
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->buildHistoryRendData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 158
    .line 159
    .line 160
    :goto_2
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_7

    .line 167
    .line 168
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 169
    .line 170
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_7
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_9

    .line 181
    .line 182
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 183
    .line 184
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 189
    .line 190
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 195
    .line 196
    if-eq p1, p2, :cond_8

    .line 197
    .line 198
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 199
    .line 200
    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    .line 201
    .line 202
    .line 203
    :goto_3
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 204
    .line 205
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_8

    .line 210
    .line 211
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 212
    .line 213
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 218
    .line 219
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    sget-object p2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 224
    .line 225
    if-eq p1, p2, :cond_8

    .line 226
    .line 227
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 228
    .line 229
    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_8
    :goto_4
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 234
    .line 235
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-eqz p1, :cond_9

    .line 240
    .line 241
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 242
    .line 243
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_9
    :goto_5
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    const-string p2, "builder.build()"

    .line 252
    .line 253
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    return-object p1
.end method

.method private final buildHistoryRendData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->buildActionMode()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->setAction(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 15
    .line 16
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->setGraphConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 24
    .line 25
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->setModeConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 33
    .line 34
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getBackgroundColor()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->setBackgroundColor(I)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 42
    .line 43
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->setDrawArea(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "newBuilder.build()"

    .line 57
    .line 58
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method private final notifyListener()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->nextPrevListener:Lcom/zykj/sketch/core/listener/NextPrevListener;

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-interface {v0, v1, v1}, Lcom/zykj/sketch/core/listener/NextPrevListener;->listener(ZZ)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget v0, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v0, v2, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->nextPrevListener:Lcom/zykj/sketch/core/listener/NextPrevListener;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-interface {v0, v1, v3}, Lcom/zykj/sketch/core/listener/NextPrevListener;->listener(ZZ)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v2, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    sub-int/2addr v2, v3

    .line 39
    if-ne v0, v2, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->nextPrevListener:Lcom/zykj/sketch/core/listener/NextPrevListener;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-interface {v0, v3, v1}, Lcom/zykj/sketch/core/listener/NextPrevListener;->listener(ZZ)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->nextPrevListener:Lcom/zykj/sketch/core/listener/NextPrevListener;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {v0, v3, v3}, Lcom/zykj/sketch/core/listener/NextPrevListener;->listener(ZZ)V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method


# virtual methods
.method public final addActionChangeListener(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionChangeListener:Lcom/zykj/sketch/core/listener/ActionChangeListener;

    .line 2
    .line 3
    return-void
.end method

.method public final addHistoryRecord(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "actionContent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 23
    .line 24
    invoke-interface {v1, v0}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public final addHistoryRenderGraphSnapshot(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V
    .locals 3

    .line 1
    const-string v0, "graphSnapshot"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v2, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    if-le v1, v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/16 v0, 0xa

    .line 47
    .line 48
    if-le p1, v0, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    sub-int/2addr v1, v0

    .line 57
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    add-int/lit8 p1, p1, -0x1

    .line 84
    .line 85
    iput p1, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 86
    .line 87
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final addNextPrevListener(Lcom/zykj/sketch/core/listener/NextPrevListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->nextPrevListener:Lcom/zykj/sketch/core/listener/NextPrevListener;

    .line 2
    .line 3
    return-void
.end method

.method public final declared-synchronized addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "type"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "message"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-string v0, "pack(message)"

    .line 17
    .line 18
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/core/ActionRecord;->buildActionContent(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p2, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 26
    .line 27
    invoke-interface {p2, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionRecord;->actionChangeListener:Lcom/zykj/sketch/core/listener/ActionChangeListener;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/ActionChangeListener;->change()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p1
.end method

.method public final buildAudioStartEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;
    .locals 1

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction$Builder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction$Builder;->setFileName(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "newBuilder.build()"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public final buildAudioStopEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;
    .locals 1

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction$Builder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction$Builder;->setFileName(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "newBuilder.build()"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public final buildClearBoardData(J)Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard$Builder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "newBuilder.build()"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public final buildDrawConfig(JLjava/lang/Integer;Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder;

    .line 6
    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder;->setBackgroundColor(I)Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder;

    .line 15
    .line 16
    .line 17
    :cond_0
    if-eqz p4, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, p4}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder;->setDrawArea(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder;

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "newBuilder.build()"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object p1
.end method

.method public final buildGraphConfig(JLcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
    .locals 1

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;->setConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "newBuilder.build()"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public final buildImageData(JLjava/lang/String;IIIII)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setPath(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p4}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setWidth(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p5}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setHeight(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p6}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setViewWidth(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p7}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setViewHeight(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p8}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setPositionFlag(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "newBuilder.build()"

    .line 36
    .line 37
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p1
.end method

.method public final buildModeConfig(JLcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;
    .locals 1

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Builder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Builder;->setMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "newBuilder.build()"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public final buildNextActionData(J)Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction$Builder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "newBuilder.build()"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public final buildPrevActionData(J)Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction$Builder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "newBuilder.build()"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public final buildResetMatrix(J)Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix$Builder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "newBuilder.build()"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public final buildTouch(JLjava/util/List;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
            ">;)",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;"
        }
    .end annotation

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;->addAllTouchEvent(Ljava/lang/Iterable;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "newBuilder.build()"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public final buildTranslation(JLjava/lang/Float;Ljava/lang/Float;Z)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;

    .line 6
    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {}, Lcom/google/protobuf/FloatValue;->newBuilder()Lcom/google/protobuf/FloatValue$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2, p1}, Lcom/google/protobuf/FloatValue$Builder;->setValue(F)Lcom/google/protobuf/FloatValue$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue$Builder;->build()Lcom/google/protobuf/FloatValue;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;->setTransX(Lcom/google/protobuf/FloatValue;)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;

    .line 27
    .line 28
    .line 29
    :cond_0
    if-eqz p4, :cond_1

    .line 30
    .line 31
    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {}, Lcom/google/protobuf/FloatValue;->newBuilder()Lcom/google/protobuf/FloatValue$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2, p1}, Lcom/google/protobuf/FloatValue$Builder;->setValue(F)Lcom/google/protobuf/FloatValue$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue$Builder;->build()Lcom/google/protobuf/FloatValue;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;->setTransY(Lcom/google/protobuf/FloatValue;)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v0, p5}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;->setKeep(Z)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string p2, "newBuilder.build()"

    .line 58
    .line 59
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object p1
.end method

.method public final buildWebViewData(JLjava/lang/String;IIII)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;->setPath(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p4}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;->setWidth(I)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p5}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;->setHeight(I)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p6}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;->setViewWidth(I)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p7}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;->setViewHeight(I)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "newBuilder.build()"

    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method

.method public final buildZoomActionData(JFFFFZ)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setScaleX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p4}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setScaleY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p5}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setCenterX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p6}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setCenterY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p7}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setKeep(Z)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "newBuilder.build()"

    .line 28
    .line 29
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final next()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/lit8 v1, v1, -0x1

    .line 22
    .line 23
    if-le v0, v1, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    iput v0, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 34
    .line 35
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 39
    .line 40
    iget v1, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_0
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 53
    .line 54
    iget v1, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 55
    .line 56
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_1
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    return-object v0
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public final prev()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    add-int/2addr v0, v2

    .line 14
    iput v0, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 15
    .line 16
    if-le v0, v2, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 22
    .line 23
    iget v1, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    iput v2, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 33
    .line 34
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_1
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->rendData:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, -0x1

    .line 26
    iput v0, p0, Lcom/zykj/sketch/core/ActionRecord;->index:I

    .line 27
    .line 28
    invoke-direct {p0}, Lcom/zykj/sketch/core/ActionRecord;->notifyListener()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final declared-synchronized saveRecord(Ljava/lang/String;II)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "path"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p2, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    :goto_0
    invoke-virtual {v0, p2}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setWidth(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object p3, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 35
    .line 36
    invoke-virtual {p3}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    :goto_1
    invoke-virtual {p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setHeight(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 44
    .line 45
    new-instance p3, Ljava/util/Date;

    .line 46
    .line 47
    invoke-direct {p3}, Ljava/util/Date;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    invoke-virtual {p2, v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setUpdateDate(J)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 58
    .line 59
    const/4 p3, 0x5

    .line 60
    invoke-virtual {p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setVersion(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 61
    .line 62
    .line 63
    new-instance p2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    :goto_2
    iget-object p3, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 69
    .line 70
    invoke-interface {p3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_2

    .line 75
    .line 76
    iget-object p3, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 77
    .line 78
    invoke-interface {p3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_4

    .line 84
    :cond_2
    :goto_3
    iget-object p3, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 85
    .line 86
    invoke-interface {p3}, Ljava/util/ListIterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    if-eqz p3, :cond_3

    .line 91
    .line 92
    iget-object p3, p0, Lcom/zykj/sketch/core/ActionRecord;->listIterator:Ljava/util/ListIterator;

    .line 93
    .line 94
    invoke-interface {p3}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    sget-object p3, Lcom/zykj/sketch/utils/ProtoFileUtils;->Companion:Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;

    .line 103
    .line 104
    sget-object v0, Lcom/zykj/sketch/core/data/BoardDataFactory;->Companion:Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;

    .line 105
    .line 106
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 107
    .line 108
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$BoardHead;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v2, "header.build()"

    .line 113
    .line 114
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p2, v1}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->buildCommon(Ljava/util/List;Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p3, p1, p2}, Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;->saveProtoFile(Ljava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;)V

    .line 122
    .line 123
    .line 124
    iget-object p2, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 125
    .line 126
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$BoardHead;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    const-string v1, "header.build()"

    .line 131
    .line 132
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, p2}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->buildCommon(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/SketchHeader$Header;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p3, p1, p2}, Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;->saveProtoFile(Ljava/lang/String;Lcom/zykj/sketch/SketchHeader$Header;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    monitor-exit p0

    .line 143
    return-void

    .line 144
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    throw p1
.end method

.method public final setHeader(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)V
    .locals 3

    .line 1
    const-string v0, "header"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setWidth(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setHeight(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getVersion()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setVersion(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getType()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setType(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getAuthor()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setAuthor(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getCreateDate()J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    invoke-virtual {v0, v1, v2}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setCreateDate(J)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionRecord;->header:Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getUpdateDate()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-virtual {v0, v1, v2}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setUpdateDate(J)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 67
    .line 68
    .line 69
    return-void
.end method
