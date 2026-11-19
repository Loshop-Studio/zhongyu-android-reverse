# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public Lcom/zykj/sketch/core/ActionExecute;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/listener/EventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/ActionExecute$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0014\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J?\u0010\u0016\u001a\u00020\u000c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000c0\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000c0\u0014H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010$\u001a\u00020\u000c2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010(\u001a\u00020\u000c2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J-\u0010-\u001a\u00020\u000c2\u0006\u0010+\u001a\u00020*2\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020\u000c0\u0014H\u0016\u00a2\u0006\u0004\u0008-\u0010.J+\u00103\u001a\u00020\u000c2\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000c0\u0014H\u0016\u00a2\u0006\u0004\u00083\u00104J\u0017\u00107\u001a\u00020\u000c2\u0006\u00106\u001a\u000205H\u0016\u00a2\u0006\u0004\u00087\u00108J\u0017\u0010:\u001a\u00020\u000c2\u0006\u00106\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010=\u001a\u00020\u000c2\u0006\u00106\u001a\u00020<H\u0016\u00a2\u0006\u0004\u0008=\u0010>J\u0017\u0010@\u001a\u00020\u000c2\u0006\u00106\u001a\u00020?H\u0016\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010C\u001a\u00020\u000c2\u0006\u00106\u001a\u00020BH\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u0017\u0010G\u001a\u00020F2\u0006\u00106\u001a\u00020EH\u0016\u00a2\u0006\u0004\u0008G\u0010HJ\u0017\u0010J\u001a\u00020F2\u0006\u00106\u001a\u00020IH\u0016\u00a2\u0006\u0004\u0008J\u0010KJ\u0017\u0010M\u001a\u00020\u000c2\u0006\u00106\u001a\u00020LH\u0016\u00a2\u0006\u0004\u0008M\u0010NJ\u0017\u0010Q\u001a\u00020\u000c2\u0006\u0010P\u001a\u00020OH\u0016\u00a2\u0006\u0004\u0008Q\u0010RJ\u001f\u0010V\u001a\u00020\u000c2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020FH\u0016\u00a2\u0006\u0004\u0008V\u0010WJ\u0017\u0010V\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008V\u0010XJ!\u0010Z\u001a\u0004\u0018\u00010\n2\u0008\u0010Y\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008Z\u0010[J\u001b\u0010`\u001a\u00020_2\u000c\u0010^\u001a\u0008\u0012\u0004\u0012\u00020]0\\\u00a2\u0006\u0004\u0008`\u0010aJ\u000f\u0010b\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008b\u0010cJ\u0017\u0010f\u001a\u00020\u000c2\u0006\u0010e\u001a\u00020dH\u0016\u00a2\u0006\u0004\u0008f\u0010gR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010hR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010iR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010jR$\u00106\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00086\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR\u001a\u0010q\u001a\u0008\u0012\u0004\u0012\u00020d0\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010u\u00a8\u0006v"
    }
    d2 = {
        "Lcom/zykj/sketch/core/ActionExecute;",
        "Lcom/zykj/sketch/core/listener/EventListener;",
        "Landroid/view/ViewGroup;",
        "viewGroup",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "control",
        "Lcom/zykj/sketch/core/ActionStrategyFactory;",
        "actionFactory",
        "<init>",
        "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "graph",
        "Ld6/s;",
        "addNewGraph",
        "(Lcom/zykj/sketch/core/graph/Graph;)V",
        "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "graphSnapshot",
        "buildHistoryGraph",
        "(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;",
        "fatherGraph",
        "Lkotlin/Function1;",
        "callBack",
        "setAttribute",
        "(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V",
        "setAttribute2",
        "(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
        "event",
        "onTouchEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;",
        "modeConfig",
        "onActionModeEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;",
        "graphConfig",
        "onGraphConfigEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;",
        "config",
        "onDrawConfigEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
        "imageConfig",
        "Lcom/zykj/sketch/core/graph/ImageGraph;",
        "onAddImageEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lr6/c;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
        "webViewConfig",
        "Lcom/zykj/sketch/core/listener/PPTControl;",
        "viewBack",
        "onAddPPTEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;",
        "action",
        "onPrevActionEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;",
        "onNextActionEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;",
        "onClearBoardEvent",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;",
        "onAudioStartRecord",
        "(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;",
        "onAudioStopRecord",
        "(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;",
        "",
        "onZoom",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;",
        "onTranslation",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;",
        "resetMatrix",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
        "resetData",
        "initConfig",
        "(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "actionContent",
        "updateMode",
        "graphSnapShot",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V",
        "(Lcom/zykj/sketch/GraphSnapshot$GraphData;)V",
        "rootGraph",
        "buildGraph",
        "(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;",
        "",
        "",
        "list",
        "Landroid/graphics/Matrix;",
        "buildMatrix",
        "(Ljava/util/List;)Landroid/graphics/Matrix;",
        "reset",
        "()V",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "viewControl",
        "addViewControl",
        "(Lcom/zykj/sketch/core/listener/ViewControl;)V",
        "Landroid/view/ViewGroup;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "Lcom/zykj/sketch/core/ActionStrategyFactory;",
        "Lcom/zykj/sketch/core/listener/IAction;",
        "Lcom/zykj/sketch/core/listener/IAction;",
        "getAction",
        "()Lcom/zykj/sketch/core/listener/IAction;",
        "setAction",
        "(Lcom/zykj/sketch/core/listener/IAction;)V",
        "viewControlList",
        "Ljava/util/List;",
        "",
        "matrixValue",
        "[F",
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
.field private action:Lcom/zykj/sketch/core/listener/IAction;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final control:Lcom/zykj/sketch/core/listener/IControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final matrixValue:[F
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final viewControlList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/listener/ViewControl;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final viewGroup:Landroid/view/ViewGroup;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/sketch/core/listener/IControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/sketch/core/ActionStrategyFactory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "viewGroup"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "control"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "actionFactory"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->viewGroup:Landroid/view/ViewGroup;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/sketch/core/ActionExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->viewControlList:Ljava/util/List;

    .line 31
    .line 32
    const/16 p1, 0x9

    .line 33
    .line 34
    new-array p1, p1, [F

    .line 35
    .line 36
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 37
    .line 38
    return-void
.end method

.method private final addNewGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/graph/Graph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IGraph;->onMeasure()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 19
    .line 20
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->reset()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final buildHistoryGraph(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;
    .locals 14

    .line 1
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getGraphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v2, Lcom/zykj/sketch/core/ActionExecute$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    aget v1, v2, v1

    .line 16
    .line 17
    :goto_0
    const-string v2, "fileData.fileName"

    .line 18
    .line 19
    const-class v3, Lcom/zykj/sketch/GraphSnapshot$File;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    :pswitch_0
    return-object v4

    .line 26
    :pswitch_1
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-class v2, Lcom/zykj/sketch/GraphSnapshot$Touch;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$Touch;

    .line 37
    .line 38
    new-instance v2, Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 39
    .line 40
    iget-object v3, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 41
    .line 42
    invoke-direct {v2, v3}, Lcom/zykj/sketch/core/graph/StrokeGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Lcom/zykj/sketch/core/ActionExecute$buildHistoryGraph$6$1;

    .line 46
    .line 47
    invoke-direct {v3, v1, v2}, Lcom/zykj/sketch/core/ActionExecute$buildHistoryGraph$6$1;-><init>(Lcom/zykj/sketch/GraphSnapshot$Touch;Lcom/zykj/sketch/core/graph/StrokeGraph;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v2, p1, v3}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute2(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :pswitch_2
    new-instance v1, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 55
    .line 56
    iget-object v2, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 57
    .line 58
    invoke-direct {v1, v2}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x4

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v3, 0x0

    .line 64
    move-object v0, p0

    .line 65
    move-object v2, p1

    .line 66
    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute2$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :pswitch_3
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1, v3}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$File;

    .line 79
    .line 80
    new-instance v3, Lcom/zykj/sketch/core/graph/WebViewGraph;

    .line 81
    .line 82
    iget-object v4, p0, Lcom/zykj/sketch/core/ActionExecute;->viewGroup:Landroid/view/ViewGroup;

    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getFileName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v6, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getHeight()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getViewWidth()I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getViewHeight()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    const/16 v12, 0x80

    .line 110
    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    invoke-direct/range {v3 .. v13}, Lcom/zykj/sketch/core/graph/WebViewGraph;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILr6/c;ILkotlin/jvm/internal/e;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v3

    .line 117
    const/4 v4, 0x4

    .line 118
    const/4 v5, 0x0

    .line 119
    const/4 v3, 0x0

    .line 120
    move-object v0, p0

    .line 121
    move-object v2, p1

    .line 122
    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute2$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    :pswitch_4
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1, v3}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$File;

    .line 135
    .line 136
    new-instance v3, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;

    .line 137
    .line 138
    iget-object v4, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 139
    .line 140
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getWidth()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getHeight()I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getViewWidth()I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getViewHeight()I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getFileName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-direct/range {v3 .. v9}, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    move-object v1, v3

    .line 167
    const/4 v4, 0x4

    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v3, 0x0

    .line 170
    move-object v0, p0

    .line 171
    move-object v2, p1

    .line 172
    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute2$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-object v1

    .line 176
    :pswitch_5
    new-instance v1, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;

    .line 177
    .line 178
    iget-object v2, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 179
    .line 180
    invoke-direct {v1, v2}, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 181
    .line 182
    .line 183
    const/4 v4, 0x4

    .line 184
    const/4 v5, 0x0

    .line 185
    const/4 v3, 0x0

    .line 186
    move-object v0, p0

    .line 187
    move-object v2, p1

    .line 188
    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute2$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    return-object v1

    .line 192
    :pswitch_6
    new-instance v1, Lcom/zykj/sketch/core/graph/UnBoundedContainerGraph;

    .line 193
    .line 194
    iget-object v2, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 195
    .line 196
    invoke-direct {v1, v2}, Lcom/zykj/sketch/core/graph/UnBoundedContainerGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 197
    .line 198
    .line 199
    const/4 v4, 0x4

    .line 200
    const/4 v5, 0x0

    .line 201
    const/4 v3, 0x0

    .line 202
    move-object v0, p0

    .line 203
    move-object v2, p1

    .line 204
    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute2$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    nop

    .line 209
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

.method private final setAttribute(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/graph/Graph;",
            "Lcom/zykj/sketch/core/graph/Graph;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "graphSnapshot.matrixList"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/ActionExecute;->buildMatrix(Ljava/util/List;)Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p2, v0}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixList()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "graphSnapshot.childExtendMatrixList"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/ActionExecute;->buildMatrix(Ljava/util/List;)Landroid/graphics/Matrix;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p2, v0}, Lcom/zykj/sketch/core/graph/Graph;->setChildExtendMatrix(Landroid/graphics/Matrix;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getColor()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getWidth()F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {p2, v0, v1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->initPaint(Lcom/zykj/sketch/core/graph/Graph;IF)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getIsSelect()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p2, v0}, Lcom/zykj/sketch/core/graph/Graph;->setSelect(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getShowDelete()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p2, v0}, Lcom/zykj/sketch/core/graph/Graph;->setShowDelete(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "graphSnapshot.name"

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v0}, Lcom/zykj/sketch/core/graph/Graph;->setName(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Landroid/graphics/RectF;

    .line 71
    .line 72
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getLeft()F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getTop()F

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getRight()F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v4}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getBottom()F

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v0}, Lcom/zykj/sketch/core/graph/Graph;->setOutRect(Landroid/graphics/RectF;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p4, p2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    if-eqz p1, :cond_0

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lcom/zykj/sketch/core/graph/Graph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    invoke-virtual {p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildGraphList()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const-string p3, "graphSnapshot.childGraphList"

    .line 123
    .line 124
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    if-eqz p3, :cond_1

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    check-cast p3, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 142
    .line 143
    const-string p4, "it"

    .line 144
    .line 145
    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p2, p3}, Lcom/zykj/sketch/core/ActionExecute;->buildGraph(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_1
    return-void
.end method

.method public static synthetic setAttribute$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x8

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    sget-object p4, Lcom/zykj/sketch/core/ActionExecute$setAttribute$1;->INSTANCE:Lcom/zykj/sketch/core/ActionExecute$setAttribute$1;

    .line 8
    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: setAttribute"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final setAttribute2(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/graph/Graph;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "graphSnapshot.matrixList"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/ActionExecute;->buildMatrix(Ljava/util/List;)Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixList()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "graphSnapshot.childExtendMatrixList"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/ActionExecute;->buildMatrix(Ljava/util/List;)Landroid/graphics/Matrix;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setChildExtendMatrix(Landroid/graphics/Matrix;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getColor()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getWidth()F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {p1, v0, v1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->initPaint(Lcom/zykj/sketch/core/graph/Graph;IF)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getIsSelect()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setSelect(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getShowDelete()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setShowDelete(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "graphSnapshot.name"

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setName(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Landroid/graphics/RectF;

    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getLeft()F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getTop()F

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getRight()F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v4}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getBottom()F

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/graph/Graph;->setOutRect(Landroid/graphics/RectF;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p3, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildGraphList()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    const-string p3, "graphSnapshot.childGraphList"

    .line 118
    .line 119
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result p3

    .line 130
    if-eqz p3, :cond_1

    .line 131
    .line 132
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    check-cast p3, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 137
    .line 138
    const-string v0, "it"

    .line 139
    .line 140
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-direct {p0, p3}, Lcom/zykj/sketch/core/ActionExecute;->buildHistoryGraph(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    if-eqz p3, :cond_0

    .line 148
    .line 149
    invoke-virtual {p1, p3}, Lcom/zykj/sketch/core/graph/Graph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_1
    return-void
.end method

.method public static synthetic setAttribute2$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x4

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    sget-object p3, Lcom/zykj/sketch/core/ActionExecute$setAttribute2$1;->INSTANCE:Lcom/zykj/sketch/core/ActionExecute$setAttribute2$1;

    .line 8
    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute2(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: setAttribute2"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public addViewControl(Lcom/zykj/sketch/core/listener/ViewControl;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ViewControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "viewControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->viewControlList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final buildGraph(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;
    .locals 16
    .param p1    # Lcom/zykj/sketch/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/sketch/GraphSnapshot$GraphData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    const-string v2, "graphSnapshot"

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getGraphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v4, Lcom/zykj/sketch/core/ActionExecute$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    aget v2, v4, v2

    .line 27
    .line 28
    :goto_0
    const-string v4, "fileData.fileName"

    .line 29
    .line 30
    const-class v5, Lcom/zykj/sketch/GraphSnapshot$File;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    :pswitch_0
    return-object v6

    .line 37
    :pswitch_1
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-class v4, Lcom/zykj/sketch/GraphSnapshot$Touch;

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/zykj/sketch/GraphSnapshot$Touch;

    .line 48
    .line 49
    new-instance v4, Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 50
    .line 51
    iget-object v5, v0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 52
    .line 53
    invoke-direct {v4, v5}, Lcom/zykj/sketch/core/graph/StrokeGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Lcom/zykj/sketch/core/ActionExecute$buildGraph$6$1;

    .line 57
    .line 58
    invoke-direct {v5, v2, v4}, Lcom/zykj/sketch/core/ActionExecute$buildGraph$6$1;-><init>(Lcom/zykj/sketch/GraphSnapshot$Touch;Lcom/zykj/sketch/core/graph/StrokeGraph;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1, v4, v3, v5}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V

    .line 62
    .line 63
    .line 64
    return-object v4

    .line 65
    :pswitch_2
    new-instance v2, Lcom/zykj/sketch/core/graph/WritingGroupGraph;

    .line 66
    .line 67
    iget-object v4, v0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 68
    .line 69
    invoke-direct {v2, v4}, Lcom/zykj/sketch/core/graph/WritingGroupGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 70
    .line 71
    .line 72
    const/16 v5, 0x8

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-static/range {v0 .. v6}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :pswitch_3
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v5}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$File;

    .line 89
    .line 90
    new-instance v2, Lcom/zykj/sketch/core/graph/WebViewGraph;

    .line 91
    .line 92
    iget-object v6, v0, Lcom/zykj/sketch/core/ActionExecute;->viewGroup:Landroid/view/ViewGroup;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getFileName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v8, v0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 102
    .line 103
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getWidth()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getHeight()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getViewWidth()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File;->getViewHeight()I

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    const/16 v14, 0x80

    .line 120
    .line 121
    const/4 v15, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    move-object v5, v2

    .line 124
    invoke-direct/range {v5 .. v15}, Lcom/zykj/sketch/core/graph/WebViewGraph;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILr6/c;ILkotlin/jvm/internal/e;)V

    .line 125
    .line 126
    .line 127
    const/16 v5, 0x8

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    const/4 v4, 0x0

    .line 131
    move-object/from16 v1, p1

    .line 132
    .line 133
    move-object/from16 v3, p2

    .line 134
    .line 135
    invoke-static/range {v0 .. v6}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-object v2

    .line 139
    :pswitch_4
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2, v5}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Lcom/zykj/sketch/GraphSnapshot$File;

    .line 148
    .line 149
    new-instance v5, Lcom/zykj/sketch/core/graph/ImageGraph;

    .line 150
    .line 151
    iget-object v6, v0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 152
    .line 153
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$File;->getWidth()I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$File;->getHeight()I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$File;->getViewWidth()I

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$File;->getViewHeight()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$File;->getFileName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$File;->getPositionFlag()I

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    invoke-direct/range {v5 .. v12}, Lcom/zykj/sketch/core/graph/ImageGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    sget-object v2, Lcom/zykj/sketch/core/ActionExecute$buildGraph$3$1;->INSTANCE:Lcom/zykj/sketch/core/ActionExecute$buildGraph$3$1;

    .line 184
    .line 185
    invoke-direct {v0, v1, v5, v3, v2}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V

    .line 186
    .line 187
    .line 188
    return-object v5

    .line 189
    :pswitch_5
    new-instance v2, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;

    .line 190
    .line 191
    iget-object v4, v0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 192
    .line 193
    invoke-direct {v2, v4}, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 194
    .line 195
    .line 196
    const/16 v5, 0x8

    .line 197
    .line 198
    const/4 v6, 0x0

    .line 199
    const/4 v4, 0x0

    .line 200
    invoke-static/range {v0 .. v6}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    return-object v2

    .line 204
    :pswitch_6
    new-instance v2, Lcom/zykj/sketch/core/graph/UnBoundedContainerGraph;

    .line 205
    .line 206
    iget-object v1, v0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 207
    .line 208
    invoke-direct {v2, v1}, Lcom/zykj/sketch/core/graph/UnBoundedContainerGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 209
    .line 210
    .line 211
    const/16 v5, 0x8

    .line 212
    .line 213
    const/4 v6, 0x0

    .line 214
    const/4 v4, 0x0

    .line 215
    move-object/from16 v1, p1

    .line 216
    .line 217
    move-object/from16 v3, p2

    .line 218
    .line 219
    invoke-static/range {v0 .. v6}, Lcom/zykj/sketch/core/ActionExecute;->setAttribute$default(Lcom/zykj/sketch/core/ActionExecute;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    return-object v2

    .line 223
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

.method public final buildMatrix(Ljava/util/List;)Landroid/graphics/Matrix;
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)",
            "Landroid/graphics/Matrix;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x9

    .line 7
    .line 8
    new-array v0, v0, [F

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    add-int/lit8 v3, v1, 0x1

    .line 26
    .line 27
    if-ltz v1, :cond_0

    .line 28
    .line 29
    check-cast v2, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    aput v2, v0, v1

    .line 36
    .line 37
    move v1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    throw p1

    .line 44
    :cond_1
    new-instance p1, Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method

.method public final getAction()Lcom/zykj/sketch/core/listener/IAction;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 2
    .line 3
    return-object v0
.end method

.method public graphSnapShot(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "actionContent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p2

    const-string v0, "actionContent.graphSnapshot"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p2}, Lcom/zykj/sketch/core/ActionExecute;->buildGraph(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    invoke-interface {v0, p2}, Lcom/zykj/sketch/core/listener/IControl;->setRootGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 3
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasResetData()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    move-result-object p1

    const-string p2, "actionContent.resetData"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->initConfig(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->forceRender()V

    .line 6
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    return-void
.end method

.method public graphSnapShot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/GraphSnapshot$GraphData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "graphSnapshot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/ActionExecute;->buildHistoryGraph(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IControl;->setRootGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->forceRender()V

    return-void
.end method

.method public initConfig(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)V
    .locals 3
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "resetData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getModeConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "resetData.modeConfig"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->setMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "resetData.graphConfig"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->setRecordConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->hasDrawArea()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 45
    .line 46
    invoke-interface {v1, v0}, Lcom/zykj/sketch/core/listener/IControl;->setDrawArea(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->setDrawArea(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getBackgroundColor()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getBackgroundColor()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->setBackgroundColor(I)V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getAction()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v1, "resetData.action"

    .line 78
    .line 79
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->parseActionMode(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public onActionModeEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V
    .locals 2
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "modeConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;->getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;->getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "modeConfig.mode"

    .line 25
    .line 26
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IControl;->setMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 33
    .line 34
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->clearAction()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public onAddImageEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lr6/c;)V
    .locals 9
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "imageConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/sketch/core/graph/ImageGraph;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getViewWidth()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getViewHeight()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getPath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    const-string v0, "imageConfig.path"

    .line 36
    .line 37
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getPositionFlag()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    invoke-direct/range {v1 .. v8}, Lcom/zykj/sketch/core/graph/ImageGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v1}, Lcom/zykj/sketch/core/ActionExecute;->addNewGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p2, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public onAddPPTEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V
    .locals 10
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "webViewConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/sketch/core/graph/WebViewGraph;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/sketch/core/ActionExecute;->viewGroup:Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->getPath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const-string v0, "webViewConfig.path"

    .line 20
    .line 21
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->getViewWidth()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->getViewHeight()I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    move-object v9, p2

    .line 43
    invoke-direct/range {v1 .. v9}, Lcom/zykj/sketch/core/graph/WebViewGraph;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILr6/c;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v1}, Lcom/zykj/sketch/core/ActionExecute;->addNewGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public onAudioStartRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAudioStopRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onClearBoardEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->reset()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onDrawConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V
    .locals 2
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "backgroundColor"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/google/protobuf/Descriptors$Descriptor;->findFieldByName(Ljava/lang/String;)Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;->getBackgroundColor()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->setBackgroundColor(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;->hasDrawArea()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 44
    .line 45
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IControl;->setDrawArea(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 49
    .line 50
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public onGraphConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V
    .locals 2
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graphConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v1, "graphConfig.config"

    .line 13
    .line 14
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IControl;->setRecordConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 21
    .line 22
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->clearAction()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onNextActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPrevActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 3
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_7

    .line 12
    .line 13
    if-eq v0, v1, :cond_5

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v0, v2, :cond_3

    .line 17
    .line 18
    const/4 v2, 0x5

    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IAction;->onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 38
    .line 39
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->setTouch(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 45
    .line 46
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->create(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/core/listener/IAction;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 55
    .line 56
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IAction;->onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IAction;->onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_0
    return-void

    .line 72
    :cond_5
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->setTouch(Z)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IAction;->onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 83
    .line 84
    .line 85
    :cond_6
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 86
    .line 87
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->clearTempPaint()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_7
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 92
    .line 93
    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/IControl;->setTouch(Z)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 97
    .line 98
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 99
    .line 100
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/ActionStrategyFactory;->create(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/core/listener/IAction;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/IAction;->onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 113
    .line 114
    .line 115
    :cond_8
    sget-object p1, Lcom/zykj/sketch/utils/LogUtils;->Companion:Lcom/zykj/sketch/utils/LogUtils$Companion;

    .line 116
    .line 117
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 118
    .line 119
    if-eqz v0, :cond_9

    .line 120
    .line 121
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IAction;->enumType()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_1

    .line 126
    :cond_9
    const/4 v0, 0x0

    .line 127
    :goto_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/utils/LogUtils$Companion;->i(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public onTranslation(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z
    .locals 5
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getKeep()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->hasTransX()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->hasTransY()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getTransX()Lcom/google/protobuf/FloatValue;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/google/protobuf/FloatValue;->getValue()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getTransY()Lcom/google/protobuf/FloatValue;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue;->getValue()F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->hasTransX()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getTransX()Lcom/google/protobuf/FloatValue;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue;->getValue()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {v0, p1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getTransY()Lcom/google/protobuf/FloatValue;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue;->getValue()F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-virtual {v0, v2, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->hasTransX()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/4 v2, 0x5

    .line 95
    const/4 v3, 0x2

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->hasTransY()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getTransX()Lcom/google/protobuf/FloatValue;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4}, Lcom/google/protobuf/FloatValue;->getValue()F

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    aput v4, v1, v3

    .line 115
    .line 116
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getTransY()Lcom/google/protobuf/FloatValue;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue;->getValue()F

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    aput p1, v1, v2

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->hasTransX()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getTransX()Lcom/google/protobuf/FloatValue;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue;->getValue()F

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    aput p1, v1, v3

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_4
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;->getTransY()Lcom/google/protobuf/FloatValue;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Lcom/google/protobuf/FloatValue;->getValue()F

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    aput p1, v1, v2

    .line 159
    .line 160
    :goto_0
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 161
    .line 162
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->setValues([F)V

    .line 163
    .line 164
    .line 165
    :goto_1
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 166
    .line 167
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 168
    .line 169
    .line 170
    const/4 p1, 0x1

    .line 171
    return p1
.end method

.method public onZoom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z
    .locals 4
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getKeep()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleX()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleY()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterX()F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterY()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/sketch/core/ActionExecute;->matrixValue:[F

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    aget v2, v1, v2

    .line 54
    .line 55
    const/4 v3, 0x5

    .line 56
    aget v1, v1, v3

    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleX()F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleY()F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterX()F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterY()F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 78
    .line 79
    .line 80
    :goto_0
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 81
    .line 82
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 83
    .line 84
    .line 85
    const/4 p1, 0x1

    .line 86
    return p1
.end method

.method public reset()V
    .locals 0

    return-void
.end method

.method public resetMatrix(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 20
    .line 21
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->resetStatus()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final setAction(Lcom/zykj/sketch/core/listener/IAction;)V
    .locals 0
    .param p1    # Lcom/zykj/sketch/core/listener/IAction;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/ActionExecute;->action:Lcom/zykj/sketch/core/listener/IAction;

    .line 2
    .line 3
    return-void
.end method
