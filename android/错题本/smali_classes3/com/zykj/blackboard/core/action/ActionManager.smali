.class public final Lcom/zykj/blackboard/core/action/ActionManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/action/IActionListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J?\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0019\u001a\u00020\u00182\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008&\u0010\'J+\u0010,\u001a\u00020\u00122\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020%0\u001a2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0)H\u0016\u00a2\u0006\u0004\u0008,\u0010-J-\u00100\u001a\u00020\u00122\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020*2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0)H\u0016\u00a2\u0006\u0004\u00080\u00101J%\u00104\u001a\u00020\u00122\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020%0\u001a2\u0006\u00103\u001a\u000202H\u0016\u00a2\u0006\u0004\u00084\u00105JU\u0010?\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010\u001e\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001f2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008?\u0010@Jc\u0010E\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010B\u001a\u00020A2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020C0\u001a2\u0006\u0010\u001e\u001a\u00020;2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008E\u0010FJa\u0010O\u001a\u00020\u00122\u0006\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020\u00182\u0008\u0010J\u001a\u0004\u0018\u00010I2\u0008\u0010<\u001a\u0004\u0018\u00010\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010;2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\u001a2\u0008\u0010M\u001a\u0004\u0018\u00010L2\u0008\u0010N\u001a\u0004\u0018\u00010\u001fH\u0016\u00a2\u0006\u0004\u0008O\u0010PJ%\u0010Q\u001a\u00020\u00122\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008Q\u0010RJ\u0011\u0010T\u001a\u0004\u0018\u00010SH\u0016\u00a2\u0006\u0004\u0008T\u0010UJ\u0011\u0010W\u001a\u0004\u0018\u00010VH\u0016\u00a2\u0006\u0004\u0008W\u0010XJ\u0011\u0010Z\u001a\u0004\u0018\u00010YH\u0016\u00a2\u0006\u0004\u0008Z\u0010[J\u000f\u0010]\u001a\u00020\\H\u0016\u00a2\u0006\u0004\u0008]\u0010^J\u000f\u0010_\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008_\u0010`J\u000f\u0010a\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008a\u0010bJ\u000f\u0010c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008c\u0010dJ\u000f\u0010e\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008e\u0010fJ\u001d\u0010h\u001a\u00020\u00122\u000c\u0010g\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001aH\u0016\u00a2\u0006\u0004\u0008h\u0010iJ\u001d\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008j\u0010kJ!\u0010m\u001a\u00020\u00122\u0008\u0010l\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008m\u0010nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010oR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010pR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010qR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010rR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010sR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\u0017\u0010x\u001a\u00020w8\u0006\u00a2\u0006\u000c\n\u0004\u0008x\u0010y\u001a\u0004\u0008z\u0010{R%\u0010|\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0013\n\u0004\u0008|\u0010}\u001a\u0004\u0008~\u0010U\"\u0005\u0008\u007f\u0010\u0080\u0001R*\u0010\u0081\u0001\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001\u001a\u0005\u0008\u0083\u0001\u0010X\"\u0006\u0008\u0084\u0001\u0010\u0085\u0001R*\u0010\u0086\u0001\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u001a\u0005\u0008\u0088\u0001\u0010[\"\u0006\u0008\u0089\u0001\u0010\u008a\u0001R=\u0010\u008e\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u0001j\n\u0012\u0005\u0012\u00030\u008c\u0001`\u008d\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u0090\u0001\u0010\u0091\u0001\"\u0006\u0008\u0092\u0001\u0010\u0093\u0001RG\u0010\u0096\u0001\u001a!\u0012\u0015\u0012\u00130\u001f\u00a2\u0006\u000e\u0008\u0094\u0001\u0012\t\u0008\u0095\u0001\u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\u0012\u0018\u00010=8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0096\u0001\u0010\u0097\u0001\u001a\u0005\u0008\u0098\u0001\u0010k\"\u0006\u0008\u0099\u0001\u0010\u009a\u0001\u00a8\u0006\u009b\u0001"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/ActionManager;",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "graphControl",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "boardConfig",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "sourceLoader",
        "Lcom/zykj/blackboard/core/record/SourceRouterRecord;",
        "routerRecord",
        "Lcom/zykj/blackboard/core/edit/HistoryControl;",
        "historyControl",
        "<init>",
        "(Lcom/zykj/blackboard/core/canvas/control/GraphControl;Lcom/zykj/blackboard/bean/BoardConfig;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/record/SourceRouterRecord;Lcom/zykj/blackboard/core/edit/HistoryControl;)V",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "Ld6/s;",
        "handleTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "Lcom/zykj/blackboard/core/action/ITouchAction;",
        "getCurrentAction",
        "()Lcom/zykj/blackboard/core/action/ITouchAction;",
        "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "graphType",
        "",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "eventList",
        "Lcom/zykj/board/EzyPaint$Paint;",
        "paint",
        "",
        "parentGraphId",
        "graphId",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "writingGraphEvent",
        "(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "groupGraphEvent",
        "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/IGraph;",
        "graphList",
        "",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "matrixList",
        "transformGraphEvent",
        "(Ljava/util/List;Ljava/util/List;)V",
        "originMatrix",
        "lastMatrix",
        "transformCameraEvent",
        "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V",
        "",
        "currentTime",
        "deleteGraphEvent",
        "(Ljava/util/List;J)V",
        "",
        "width",
        "height",
        "x",
        "y",
        "Landroid/graphics/Paint;",
        "content",
        "Lkotlin/Function1;",
        "callback",
        "textGraphEvent",
        "(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lr6/c;)V",
        "",
        "geometryType",
        "Landroid/graphics/PointF;",
        "pointList",
        "geometryGraphEvent",
        "(FFFFILjava/util/List;Landroid/graphics/Paint;Lr6/c;)V",
        "graph",
        "graphEnum",
        "Landroid/graphics/RectF;",
        "originRectF",
        "points",
        "Landroid/graphics/Matrix;",
        "renderMatrix",
        "filePath",
        "changeGraph",
        "(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;)V",
        "moveCursor",
        "(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V",
        "Lcom/zykj/blackboard/listener/ITextSelectListener;",
        "getTextSelectListener",
        "()Lcom/zykj/blackboard/listener/ITextSelectListener;",
        "Lcom/zykj/blackboard/listener/IGeometrySelectListener;",
        "getGeometrySelectListener",
        "()Lcom/zykj/blackboard/listener/IGeometrySelectListener;",
        "Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "getAreaMoveListener",
        "()Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "getGraphControl",
        "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "getBoardConfig",
        "()Lcom/zykj/blackboard/bean/BoardConfig;",
        "getMatrixAdapter",
        "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "getSourceLoader",
        "()Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "saveSnapshot",
        "()V",
        "graphIdList",
        "newSelectGraph",
        "(Ljava/util/List;)V",
        "getGeometryCreateListener",
        "()Lr6/c;",
        "mode",
        "handleNewSelectTouchEvent",
        "(Lcom/zykj/blackboard/core/action/ITouchAction;Landroid/view/MotionEvent;)V",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "Lcom/zykj/blackboard/core/record/SourceRouterRecord;",
        "Lcom/zykj/blackboard/core/edit/HistoryControl;",
        "actionMode",
        "Lcom/zykj/blackboard/core/action/ITouchAction;",
        "Lcom/zykj/blackboard/core/action/TouchActionModeFactory;",
        "modeFactory",
        "Lcom/zykj/blackboard/core/action/TouchActionModeFactory;",
        "getModeFactory",
        "()Lcom/zykj/blackboard/core/action/TouchActionModeFactory;",
        "mTextSelectListener",
        "Lcom/zykj/blackboard/listener/ITextSelectListener;",
        "getMTextSelectListener",
        "setMTextSelectListener",
        "(Lcom/zykj/blackboard/listener/ITextSelectListener;)V",
        "mGeometrySelectListener",
        "Lcom/zykj/blackboard/listener/IGeometrySelectListener;",
        "getMGeometrySelectListener",
        "setMGeometrySelectListener",
        "(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V",
        "mAreaMoveListener",
        "Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "getMAreaMoveListener",
        "setMAreaMoveListener",
        "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/blackboard/listener/GraphDeleteListener;",
        "Lkotlin/collections/ArrayList;",
        "mGraphDeleteListenerList",
        "Ljava/util/ArrayList;",
        "getMGraphDeleteListenerList",
        "()Ljava/util/ArrayList;",
        "setMGraphDeleteListenerList",
        "(Ljava/util/ArrayList;)V",
        "Lkotlin/ParameterName;",
        "name",
        "mGeometryCreateListener",
        "Lr6/c;",
        "getMGeometryCreateListener",
        "setMGeometryCreateListener",
        "(Lr6/c;)V",
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
.field private actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mAreaMoveListener:Lcom/zykj/blackboard/listener/IAreaMoveListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mGeometryCreateListener:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mGeometrySelectListener:Lcom/zykj/blackboard/listener/IGeometrySelectListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mGraphDeleteListenerList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/listener/GraphDeleteListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mTextSelectListener:Lcom/zykj/blackboard/listener/ITextSelectListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final modeFactory:Lcom/zykj/blackboard/core/action/TouchActionModeFactory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/control/GraphControl;Lcom/zykj/blackboard/bean/BoardConfig;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/record/SourceRouterRecord;Lcom/zykj/blackboard/core/edit/HistoryControl;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/canvas/control/GraphControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/bean/BoardConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/blackboard/core/loader/SourceLoader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/record/SourceRouterRecord;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/zykj/blackboard/core/edit/HistoryControl;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "graphControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "boardConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrixAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceLoader"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/ActionManager;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 4
    iput-object p3, p0, Lcom/zykj/blackboard/core/action/ActionManager;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 5
    iput-object p4, p0, Lcom/zykj/blackboard/core/action/ActionManager;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 6
    iput-object p5, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 7
    iput-object p6, p0, Lcom/zykj/blackboard/core/action/ActionManager;->historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 8
    new-instance p1, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    invoke-direct {p1}, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->modeFactory:Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    .line 9
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGraphDeleteListenerList:Ljava/util/ArrayList;

    .line 10
    invoke-virtual {p1, p0}, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->setListener(Lcom/zykj/blackboard/core/action/IActionListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/control/GraphControl;Lcom/zykj/blackboard/bean/BoardConfig;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/record/SourceRouterRecord;Lcom/zykj/blackboard/core/edit/HistoryControl;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p8, p7, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_1

    move-object p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p7, p6

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/zykj/blackboard/core/action/ActionManager;-><init>(Lcom/zykj/blackboard/core/canvas/control/GraphControl;Lcom/zykj/blackboard/bean/BoardConfig;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/record/SourceRouterRecord;Lcom/zykj/blackboard/core/edit/HistoryControl;)V

    return-void
.end method

.method private final handleNewSelectTouchEvent(Lcom/zykj/blackboard/core/action/ITouchAction;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->onTouchEvent(Landroid/view/MotionEvent;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public changeGraph(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;)V
    .locals 15
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyGraphEnum$GraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
            "Landroid/graphics/RectF;",
            "Ljava/lang/String;",
            "Landroid/graphics/Paint;",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Matrix;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    move-object/from16 v2, p7

    .line 6
    .line 7
    const-string v3, "graph"

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "graphEnum"

    .line 15
    .line 16
    move-object/from16 v6, p2

    .line 17
    .line 18
    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 22
    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_5

    .line 30
    .line 31
    invoke-interface {v4}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz p3, :cond_0

    .line 37
    .line 38
    invoke-static/range {p3 .. p3}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyRectF(Landroid/graphics/RectF;)Lcom/zykj/board/EzyRectF$RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v7, v4

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const/high16 v8, 0x3f800000    # 1.0f

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    invoke-static {v0, v8, v9}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPaint(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v9, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v9, v4

    .line 56
    :goto_1
    if-eqz v1, :cond_3

    .line 57
    .line 58
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 v8, 0xa

    .line 61
    .line 62
    invoke-static {v1, v8}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Landroid/graphics/PointF;

    .line 84
    .line 85
    invoke-static {v8}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPointF(Landroid/graphics/PointF;)Lcom/zykj/board/EzyPointF$PointF;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    move-object v10, v0

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    move-object v10, v4

    .line 96
    :goto_3
    if-eqz v2, :cond_4

    .line 97
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    invoke-static {v2, v0, v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    :cond_4
    move-object v11, v4

    .line 107
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 108
    .line 109
    .line 110
    move-result-wide v13

    .line 111
    move-object/from16 v8, p4

    .line 112
    .line 113
    move-object/from16 v12, p8

    .line 114
    .line 115
    move-object v4, v3

    .line 116
    invoke-virtual/range {v4 .. v14}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->changeGraph(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 117
    .line 118
    .line 119
    :cond_5
    return-void
.end method

.method public deleteGraphEvent(Ljava/util/List;J)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;J)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {p1, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 42
    .line 43
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getGraphData()Lcom/zykj/board/q;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Lcom/zykj/board/q;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v0, v1, p2, p3}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->removeGraphList(Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 73
    .line 74
    iget-object p3, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGraphDeleteListenerList:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v1, 0x0

    .line 81
    :goto_1
    if-ge v1, v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    check-cast v2, Lcom/zykj/blackboard/listener/GraphDeleteListener;

    .line 90
    .line 91
    invoke-interface {v2, p2}, Lcom/zykj/blackboard/listener/GraphDeleteListener;->onGraphDelete(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    return-void
.end method

.method public geometryGraphEvent(FFFFILjava/util/List;Landroid/graphics/Paint;Lr6/c;)V
    .locals 12
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFFI",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Paint;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    const-string v2, "pointList"

    .line 6
    .line 7
    move-object/from16 v8, p6

    .line 8
    .line 9
    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "paint"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/ActionManager;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraphId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const/high16 v2, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v0, v2, v5}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPaint(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v10

    .line 46
    move v5, p1

    .line 47
    move v6, p2

    .line 48
    move/from16 v7, p5

    .line 49
    .line 50
    invoke-virtual/range {v3 .. v11}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addGeometryGraphCommand(Ljava/lang/String;FFILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object p2, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 65
    .line 66
    const-string v0, "graphData"

    .line 67
    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 72
    .line 73
    invoke-virtual {p2, p1, v0}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_0

    .line 78
    .line 79
    const/4 p2, 0x2

    .line 80
    new-array p2, p2, [F

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    aput p3, p2, v0

    .line 84
    .line 85
    const/4 p3, 0x1

    .line 86
    aput p4, p2, p3

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/ActionManager;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2, p2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 101
    .line 102
    .line 103
    new-instance v2, Landroid/graphics/Matrix;

    .line 104
    .line 105
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 106
    .line 107
    .line 108
    aget v0, p2, v0

    .line 109
    .line 110
    aget p2, p2, p3

    .line 111
    .line 112
    invoke-virtual {v2, v0, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 120
    .line 121
    .line 122
    move-result-wide v3

    .line 123
    invoke-static {v2, v3, v4}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    filled-new-array {p3}, [Lcom/zykj/board/EzyMatrix$Matrix;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-static {p3}, Lkotlin/collections/u;->A([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    invoke-virtual {p0, p2, p3}, Lcom/zykj/blackboard/core/action/ActionManager;->transformGraphEvent(Ljava/util/List;Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v2}, Lcom/zykj/blackboard/core/graph/Graph;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 139
    .line 140
    .line 141
    if-eqz v1, :cond_0

    .line 142
    .line 143
    invoke-interface {v1, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_0
    return-void
.end method

.method public getAreaMoveListener()Lcom/zykj/blackboard/listener/IAreaMoveListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mAreaMoveListener:Lcom/zykj/blackboard/listener/IAreaMoveListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->modeFactory:Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->getCurrentAction(Lcom/zykj/blackboard/core/action/IActionListener;)Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getGeometryCreateListener()Lr6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGeometryCreateListener:Lr6/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGeometrySelectListener()Lcom/zykj/blackboard/listener/IGeometrySelectListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGeometrySelectListener:Lcom/zykj/blackboard/listener/IGeometrySelectListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMAreaMoveListener()Lcom/zykj/blackboard/listener/IAreaMoveListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mAreaMoveListener:Lcom/zykj/blackboard/listener/IAreaMoveListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMGeometryCreateListener()Lr6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGeometryCreateListener:Lr6/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMGeometrySelectListener()Lcom/zykj/blackboard/listener/IGeometrySelectListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGeometrySelectListener:Lcom/zykj/blackboard/listener/IGeometrySelectListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMGraphDeleteListenerList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/listener/GraphDeleteListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGraphDeleteListenerList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mTextSelectListener:Lcom/zykj/blackboard/listener/ITextSelectListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModeFactory()Lcom/zykj/blackboard/core/action/TouchActionModeFactory;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->modeFactory:Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSourceLoader()Lcom/zykj/blackboard/core/loader/SourceLoader;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mTextSelectListener:Lcom/zykj/blackboard/listener/ITextSelectListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public groupGraphEvent(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/IGraph;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->GROUP_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 17
    .line 18
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->newBuilder()Lb4/b1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lb4/b1;->c()Lcom/zykj/board/EzyRectF$RectF;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    move-object v2, p1

    .line 31
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 46
    .line 47
    const-string v1, "graphData"

    .line 48
    .line 49
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 53
    .line 54
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getParentGraphId()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v1, p1, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_0
    const/4 p1, 0x0

    .line 71
    return-object p1
.end method

.method public final handleTouchEvent(Landroid/view/MotionEvent;)V
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/blackboard/utils/EventConvert;->INSTANCE:Lcom/zykj/blackboard/utils/EventConvert;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/EventConvert;->motionEventConvertTouchEvent(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_5

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-eq v1, v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    if-eq v1, v2, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    if-eq v1, v2, :cond_1

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 42
    .line 43
    if-eqz v1, :cond_6

    .line 44
    .line 45
    invoke-interface {v1, v0}, Lcom/zykj/blackboard/core/action/ITouchAction;->onTouchPointerUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 50
    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-interface {v1, v0}, Lcom/zykj/blackboard/core/action/ITouchAction;->onTouchPointerDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 58
    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    invoke-interface {v1, v0}, Lcom/zykj/blackboard/core/action/ITouchAction;->onTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 66
    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    invoke-interface {v1, v0}, Lcom/zykj/blackboard/core/action/ITouchAction;->onTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 73
    .line 74
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/ActionManager;->handleNewSelectTouchEvent(Lcom/zykj/blackboard/core/action/ITouchAction;Landroid/view/MotionEvent;)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->modeFactory:Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    .line 82
    .line 83
    invoke-virtual {v1, p0}, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->create(Lcom/zykj/blackboard/core/action/IActionListener;)Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 88
    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    invoke-interface {v1, v0}, Lcom/zykj/blackboard/core/action/ITouchAction;->onTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->actionMode:Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 95
    .line 96
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/ActionManager;->handleNewSelectTouchEvent(Lcom/zykj/blackboard/core/action/ITouchAction;Landroid/view/MotionEvent;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public moveCursor(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "eventList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->moveCursor(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public newSelectGraph(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    sget-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_NEW_SELECT:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public saveSnapshot()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/graph/Graph;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/ActionManager;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundColor()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/ActionManager;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v0, v2, v3}, Lcom/zykj/blackboard/core/edit/HistoryControl;->saveSnapshot(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final setMAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/listener/IAreaMoveListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mAreaMoveListener:Lcom/zykj/blackboard/listener/IAreaMoveListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setMGeometryCreateListener(Lr6/c;)V
    .locals 0
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGeometryCreateListener:Lr6/c;

    .line 2
    .line 3
    return-void
.end method

.method public final setMGeometrySelectListener(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/listener/IGeometrySelectListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGeometrySelectListener:Lcom/zykj/blackboard/listener/IGeometrySelectListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setMGraphDeleteListenerList(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/listener/GraphDeleteListener;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mGraphDeleteListenerList:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setMTextSelectListener(Lcom/zykj/blackboard/listener/ITextSelectListener;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/listener/ITextSelectListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/ActionManager;->mTextSelectListener:Lcom/zykj/blackboard/listener/ITextSelectListener;

    .line 2
    .line 3
    return-void
.end method

.method public textGraphEvent(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lr6/c;)V
    .locals 11
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF",
            "Landroid/graphics/Paint;",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    const-string v2, "paint"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "content"

    .line 11
    .line 12
    move-object/from16 v8, p6

    .line 13
    .line 14
    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/ActionManager;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraphId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const/high16 v2, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v0, v2, v5}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPaint(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    move v5, p1

    .line 47
    move v6, p2

    .line 48
    invoke-virtual/range {v3 .. v10}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addTextGraphCommand(Ljava/lang/String;FFLcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object p2, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 63
    .line 64
    const-string v0, "graphData"

    .line 65
    .line 66
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 70
    .line 71
    invoke-virtual {p2, p1, v0}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_0

    .line 76
    .line 77
    const/4 p2, 0x2

    .line 78
    new-array p2, p2, [F

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    aput p3, p2, v0

    .line 82
    .line 83
    const/4 p3, 0x1

    .line 84
    aput p4, p2, p3

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/ActionManager;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-static {p4}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    invoke-virtual {p4, p2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 99
    .line 100
    .line 101
    new-instance p4, Landroid/graphics/Matrix;

    .line 102
    .line 103
    invoke-direct {p4}, Landroid/graphics/Matrix;-><init>()V

    .line 104
    .line 105
    .line 106
    aget v0, p2, v0

    .line 107
    .line 108
    aget p2, p2, p3

    .line 109
    .line 110
    invoke-virtual {p4, v0, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    invoke-static {p4, v2, v3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    filled-new-array {p3}, [Lcom/zykj/board/EzyMatrix$Matrix;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-static {p3}, Lkotlin/collections/u;->A([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-virtual {p0, p2, p3}, Lcom/zykj/blackboard/core/action/ActionManager;->transformGraphEvent(Ljava/util/List;Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p4}, Lcom/zykj/blackboard/core/graph/Graph;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 137
    .line 138
    .line 139
    if-eqz v1, :cond_0

    .line 140
    .line 141
    invoke-interface {v1, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_0
    return-void
.end method

.method public transformCameraEvent(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V
    .locals 7
    .param p1    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "originMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "matrixList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    move-object v2, p1

    .line 31
    move-object v3, p2

    .line 32
    move-object v4, p3

    .line 33
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCameraMatrix(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public transformGraphEvent(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    invoke-static {p1, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 47
    .line 48
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getGraphData()Lcom/zykj/board/q;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Lcom/zykj/board/q;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    invoke-virtual {v0, v1, p2, v2, v3}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addGraphMatrix(Ljava/util/List;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public writingGraphEvent(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;
    .locals 9
    .param p1    # Lcom/zykj/board/EzyGraphEnum$GraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/zykj/blackboard/core/graph/Graph;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "graphType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "paint"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "parentGraphId"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "graphId"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/ActionManager;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    move-object v3, p1

    .line 41
    move-object v4, p2

    .line 42
    move-object v5, p3

    .line 43
    move-object v2, p4

    .line 44
    move-object v6, p5

    .line 45
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object p2, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 60
    .line 61
    const-string p3, "graphData"

    .line 62
    .line 63
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p3, p0, Lcom/zykj/blackboard/core/action/ActionManager;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 67
    .line 68
    invoke-virtual {p2, p1, p3}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_0
    const/4 p1, 0x0

    .line 74
    return-object p1
.end method
