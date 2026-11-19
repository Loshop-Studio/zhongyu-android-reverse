.class public abstract Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008&\u0018\u0000 \u00a0\u00012\u00020\u0001:\u0002\u00a0\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u000eJ\u001f\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u000eJ\u001f\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u000eJ\u001f\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u000eJ\u001f\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\'\u0010\"\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\"\u0010#J\u001d\u0010$\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008$\u0010%J\u001d\u0010(\u001a\u00020\u00062\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0\u0012H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\r\u0010*\u001a\u00020\u000f\u00a2\u0006\u0004\u0008*\u0010\u0011J\u000f\u0010+\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008+\u0010\u0008J\u000f\u0010,\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008,\u0010\u0008J\u0017\u0010.\u001a\u00020\u00062\u0008\u0008\u0002\u0010-\u001a\u00020\u000c\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\u00080\u0010\u0008J;\u00106\u001a\u00020\u000c2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t04H\u0004\u00a2\u0006\u0004\u00086\u00107J\u000f\u00108\u001a\u00020\u000fH\u0004\u00a2\u0006\u0004\u00088\u0010\u0011J\u001f\u00109\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u00089\u0010%J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008:\u0010%J\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008;\u0010%JO\u0010D\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008D\u0010EJ\u001f\u0010F\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008F\u0010GJ\u0017\u0010H\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008H\u0010IR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010J\u001a\u0004\u0008K\u0010LR\u001a\u0010N\u001a\u00020M8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010QR\u001a\u0010S\u001a\u00020R8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010VR\u001a\u0010X\u001a\u00020W8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[R\u001a\u0010\\\u001a\u00020\u001e8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_R\u001a\u0010`\u001a\u00020\u001e8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008`\u0010]\u001a\u0004\u0008a\u0010_R\u001a\u00102\u001a\u00020\u000f8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u00082\u0010b\u001a\u0004\u0008c\u0010\u0011R\u001a\u0010d\u001a\u00020\u000f8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008d\u0010b\u001a\u0004\u0008e\u0010\u0011R.\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t048\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008f\u0010g\u001a\u0004\u0008h\u0010i\"\u0004\u0008j\u0010kR\"\u0010l\u001a\u00020\u000c8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008l\u0010m\u001a\u0004\u0008l\u0010n\"\u0004\u0008o\u0010/R*\u0010r\u001a\u0012\u0012\u0004\u0012\u00020&0pj\u0008\u0012\u0004\u0012\u00020&`q8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008r\u0010s\u001a\u0004\u0008t\u0010uR\"\u0010w\u001a\u00020v8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008w\u0010x\u001a\u0004\u0008y\u0010z\"\u0004\u0008{\u0010|R%\u00101\u001a\u00020}8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0015\n\u0004\u00081\u0010~\u001a\u0005\u0008\u007f\u0010\u0080\u0001\"\u0006\u0008\u0081\u0001\u0010\u0082\u0001R*\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u0086\u0001\u0010\u0087\u0001\"\u0006\u0008\u0088\u0001\u0010\u0089\u0001R)\u0010\u008a\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001\u001a\u0006\u0008\u008c\u0001\u0010\u008d\u0001\"\u0006\u0008\u008e\u0001\u0010\u008f\u0001R)\u0010\u0090\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0090\u0001\u0010\u008b\u0001\u001a\u0006\u0008\u0091\u0001\u0010\u008d\u0001\"\u0006\u0008\u0092\u0001\u0010\u008f\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0093\u0001\u0010mR\u001f\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0096\u0001\u0010\u0097\u0001R+\u0010\u0098\u0001\u001a\u0004\u0018\u00010 8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001\"\u0006\u0008\u009c\u0001\u0010\u009d\u0001R\u0016\u0010\u009f\u0001\u001a\u00020\u001e8DX\u0084\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009e\u0001\u0010_\u00a8\u0006\u00a1\u0001"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;",
        "",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "listener",
        "<init>",
        "(Lcom/zykj/blackboard/core/action/IActionListener;)V",
        "Ld6/s;",
        "updateFunctionRectF",
        "()V",
        "",
        "x",
        "y",
        "",
        "isClickInSelectFunction",
        "(FF)Z",
        "Landroid/graphics/RectF;",
        "getMaxFunctionRectF",
        "()Landroid/graphics/RectF;",
        "",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "getCurrentFunctionTypeList",
        "()Ljava/util/List;",
        "handleMoveStart",
        "handleMoving",
        "handleMoveEnd",
        "handleClick",
        "handleDoubleClick",
        "rectF",
        "setSelectRectF",
        "(Landroid/graphics/RectF;)V",
        "Landroid/graphics/Matrix;",
        "matrix",
        "Landroid/graphics/PointF;",
        "pointF",
        "setSingleGraphData",
        "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V",
        "setFirstPoint",
        "(FF)V",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "graphList",
        "setSelectGraphList",
        "(Ljava/util/List;)V",
        "getSelectRectFAfterTransform",
        "initForFunctionTouch",
        "reset",
        "needUpdateLocation",
        "showSelectRectF",
        "(Z)V",
        "updateFunctionBackgroundRectF",
        "functionRectF",
        "selectRectF",
        "limitRectF",
        "Lkotlin/Pair;",
        "pair",
        "getFunctionRectFBySelectRectF",
        "(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z",
        "getLimitRectFInPage",
        "handleRotate",
        "handleScale",
        "handleTranslate",
        "x1",
        "y1",
        "x2",
        "y2",
        "x3",
        "y3",
        "x4",
        "y4",
        "calculateScaleOffset",
        "(FFFFFFFF)F",
        "calculateRadians",
        "(FF)F",
        "getAdapterMatrix",
        "(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "getListener",
        "()Lcom/zykj/blackboard/core/action/IActionListener;",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "graphControl",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "getGraphControl",
        "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "boardConfig",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "getBoardConfig",
        "()Lcom/zykj/blackboard/bean/BoardConfig;",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "getMatrixAdapter",
        "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "transformMatrix",
        "Landroid/graphics/Matrix;",
        "getTransformMatrix",
        "()Landroid/graphics/Matrix;",
        "singleMatrix",
        "getSingleMatrix",
        "Landroid/graphics/RectF;",
        "getSelectRectF",
        "selectFunctionRectF",
        "getSelectFunctionRectF",
        "selectSizePair",
        "Lkotlin/Pair;",
        "getSelectSizePair",
        "()Lkotlin/Pair;",
        "setSelectSizePair",
        "(Lkotlin/Pair;)V",
        "isDirectionLeft",
        "Z",
        "()Z",
        "setDirectionLeft",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "selectGraphList",
        "Ljava/util/ArrayList;",
        "getSelectGraphList",
        "()Ljava/util/ArrayList;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;",
        "currentFunctionMode",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;",
        "getCurrentFunctionMode",
        "()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;",
        "setCurrentFunctionMode",
        "(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
        "getFunctionRectF",
        "()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
        "setFunctionRectF",
        "(Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;)V",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
        "functionBackgroundRectF",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
        "getFunctionBackgroundRectF",
        "()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
        "setFunctionBackgroundRectF",
        "(Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;)V",
        "firstX",
        "F",
        "getFirstX",
        "()F",
        "setFirstX",
        "(F)V",
        "firstY",
        "getFirstY",
        "setFirstY",
        "isTransforming",
        "",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "matrixList",
        "Ljava/util/List;",
        "trianglePointF",
        "Landroid/graphics/PointF;",
        "getTrianglePointF",
        "()Landroid/graphics/PointF;",
        "setTrianglePointF",
        "(Landroid/graphics/PointF;)V",
        "getCurrentMatrix",
        "currentMatrix",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final colorSpace:F = 23.0f

.field public static final colorWidth:F = 38.0f

.field public static final funcHorizontalPadding:F = 15.0f

.field public static final funcRectHorizontalPadding:F = 8.0f

.field public static final funcSize:F = 25.0f

.field public static final spaceHeight:F = 13.0f

.field public static final spaceWidth:F = 13.0f

.field public static final textPadding:F = 32.0f

.field public static final textSpaceWidth:F = 2.0f

.field public static final textWidth:F = 24.0f

.field public static final writeCircleFirstWidth:F = 8.0f

.field public static final writeCircleHorizontalPadding:F = 19.0f

.field public static final writeCircleWidthStep:F = 3.0f

.field public static final writeRectFHorizontalPadding:F = 16.0f


# instance fields
.field private final boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private currentFunctionMode:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private firstX:F

.field private firstY:F

.field private functionBackgroundRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private functionRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isDirectionLeft:Z

.field private isTransforming:Z

.field private final listener:Lcom/zykj/blackboard/core/action/IActionListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final matrixList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final selectFunctionRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final selectGraphList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final selectRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private selectSizePair:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final singleMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final transformMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private trianglePointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->Companion:Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 13
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 10
    .line 11
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 16
    .line 17
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 22
    .line 23
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 28
    .line 29
    new-instance p1, Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 35
    .line 36
    new-instance p1, Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 42
    .line 43
    new-instance p1, Landroid/graphics/RectF;

    .line 44
    .line 45
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 49
    .line 50
    new-instance p1, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectFunctionRectF:Landroid/graphics/RectF;

    .line 56
    .line 57
    new-instance p1, Lkotlin/Pair;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p1, v0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectSizePair:Lkotlin/Pair;

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isDirectionLeft:Z

    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 78
    .line 79
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;

    .line 80
    .line 81
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->currentFunctionMode:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 82
    .line 83
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 84
    .line 85
    const/16 v11, 0x3ff

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v1, 0x0

    .line 89
    const/4 v2, 0x0

    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v4, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    invoke-direct/range {v0 .. v12}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;-><init>(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;ILkotlin/jvm/internal/e;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 102
    .line 103
    new-instance v1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 104
    .line 105
    const/16 v7, 0x1f

    .line 106
    .line 107
    invoke-direct/range {v1 .. v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;-><init>(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;ILkotlin/jvm/internal/e;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionBackgroundRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 111
    .line 112
    new-instance p1, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixList:Ljava/util/List;

    .line 118
    .line 119
    return-void
.end method

.method private final calculateRadians(FF)F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v1, p1, v0

    .line 3
    .line 4
    if-lez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-wide v1, 0x4066800000000000L    # 180.0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    double-to-float v1, v1

    .line 18
    :goto_0
    cmpl-float v0, p2, v0

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, -0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    :goto_1
    div-float/2addr p2, p1

    .line 26
    float-to-double p1, p2

    .line 27
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    double-to-float p1, p1

    .line 32
    int-to-float p2, v0

    .line 33
    mul-float/2addr v1, p2

    .line 34
    add-float/2addr v1, p1

    .line 35
    return v1
.end method

.method private final calculateScaleOffset(FFFFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    invoke-direct {p0, p3, p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->calculateRadians(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sub-float/2addr p7, p5

    .line 8
    sub-float/2addr p8, p6

    .line 9
    invoke-direct {p0, p7, p8}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->calculateRadians(FF)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    sub-float/2addr p1, p2

    .line 14
    mul-float/2addr p7, p7

    .line 15
    mul-float/2addr p8, p8

    .line 16
    add-float/2addr p8, p7

    .line 17
    float-to-double p2, p8

    .line 18
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    double-to-float p2, p2

    .line 23
    float-to-double p3, p1

    .line 24
    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    double-to-float p1, p3

    .line 29
    mul-float/2addr p1, p2

    .line 30
    return p1
.end method

.method private final getAdapterMatrix(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method private final handleRotate(FF)V
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 22
    .line 23
    sub-float/2addr p1, v1

    .line 24
    iget v1, v0, Landroid/graphics/PointF;->y:F

    .line 25
    .line 26
    sub-float/2addr p2, v1

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->calculateRadians(FF)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstX:F

    .line 32
    .line 33
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    sub-float/2addr p2, v1

    .line 36
    iget v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstY:F

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    sub-float/2addr v1, v2

    .line 41
    invoke-direct {p0, p2, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->calculateRadians(FF)F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    sub-float/2addr p1, p2

    .line 46
    float-to-double p1, p1

    .line 47
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    double-to-float p1, p1

    .line 52
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 53
    .line 54
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 55
    .line 56
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 57
    .line 58
    invoke-virtual {p2, p1, v1, v0}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private final handleScale(FF)V
    .locals 11

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 22
    .line 23
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-virtual {v0, v3, v2, v4}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 36
    .line 37
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 38
    .line 39
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 40
    .line 41
    iget v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstX:F

    .line 42
    .line 43
    iget v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstY:F

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    move v9, p1

    .line 47
    move v10, p2

    .line 48
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->calculateScaleOffset(FFFFFFFF)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget p2, v1, Landroid/graphics/PointF;->x:F

    .line 53
    .line 54
    iget v3, v0, Landroid/graphics/PointF;->x:F

    .line 55
    .line 56
    sub-float/2addr p2, v3

    .line 57
    float-to-double v3, p2

    .line 58
    const/4 p2, 0x2

    .line 59
    int-to-double v5, p2

    .line 60
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    double-to-float v3, v3

    .line 65
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 66
    .line 67
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 68
    .line 69
    sub-float/2addr v4, v0

    .line 70
    float-to-double v7, v4

    .line 71
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    double-to-float v0, v4

    .line 76
    add-float/2addr v3, v0

    .line 77
    float-to-double v3, v3

    .line 78
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    double-to-float v0, v3

    .line 83
    add-float/2addr p1, v0

    .line 84
    iget-object v3, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 85
    .line 86
    iget-object v4, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    iget-object v5, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 93
    .line 94
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    iget-object v4, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 107
    .line 108
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    mul-float/2addr v4, v0

    .line 113
    int-to-float p2, p2

    .line 114
    mul-float/2addr v4, p2

    .line 115
    div-float/2addr v4, v3

    .line 116
    cmpg-float p2, p1, v4

    .line 117
    .line 118
    if-gez p2, :cond_0

    .line 119
    .line 120
    move p1, v4

    .line 121
    :cond_0
    div-float/2addr p1, v0

    .line 122
    iget-object p2, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 123
    .line 124
    iget v0, v1, Landroid/graphics/PointF;->x:F

    .line 125
    .line 126
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 127
    .line 128
    invoke-virtual {p2, p1, p1, v0, v1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method private final handleTranslate(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstX:F

    .line 4
    .line 5
    sub-float/2addr p1, v1

    .line 6
    iget v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstY:F

    .line 7
    .line 8
    sub-float/2addr p2, v1

    .line 9
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic showSelectRectF$default(Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    and-int/2addr p2, p3

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    move p1, p3

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: showSelectRectF"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method


# virtual methods
.method public final getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->currentFunctionMode:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract getCurrentFunctionTypeList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final getCurrentMatrix()Landroid/graphics/Matrix;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final getFirstX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstX:F

    .line 2
    .line 3
    return v0
.end method

.method public final getFirstY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstY:F

    .line 2
    .line 3
    return v0
.end method

.method public final getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionBackgroundRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFunctionRectFBySelectRectF(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z
    .locals 4
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/Pair;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "functionRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "limitRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "pair"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 22
    .line 23
    iget v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 24
    .line 25
    const/high16 v2, 0x41600000    # 14.0f

    .line 26
    .line 27
    add-float/2addr v1, v2

    .line 28
    iget v3, p3, Landroid/graphics/RectF;->bottom:F

    .line 29
    .line 30
    invoke-virtual {p4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    check-cast p4, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    sub-float/2addr v3, p4

    .line 41
    cmpl-float p4, v1, v3

    .line 42
    .line 43
    if-lez p4, :cond_0

    .line 44
    .line 45
    iget p4, p2, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    sub-float/2addr p4, v1

    .line 54
    sub-float v1, p4, v2

    .line 55
    .line 56
    :cond_0
    iget p4, p3, Landroid/graphics/RectF;->top:F

    .line 57
    .line 58
    cmpg-float v2, v1, p4

    .line 59
    .line 60
    if-gez v2, :cond_1

    .line 61
    .line 62
    move v1, p4

    .line 63
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    cmpg-float v2, p4, v2

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    if-gez v2, :cond_3

    .line 75
    .line 76
    iget p2, p2, Landroid/graphics/RectF;->right:F

    .line 77
    .line 78
    iget v2, p3, Landroid/graphics/RectF;->right:F

    .line 79
    .line 80
    cmpl-float p2, p2, v2

    .line 81
    .line 82
    if-lez p2, :cond_2

    .line 83
    .line 84
    sub-float v0, v2, p4

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    :cond_2
    iget p2, p3, Landroid/graphics/RectF;->left:F

    .line 88
    .line 89
    cmpg-float p3, v0, p2

    .line 90
    .line 91
    if-gez p3, :cond_3

    .line 92
    .line 93
    move v0, p2

    .line 94
    :cond_3
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 95
    .line 96
    iput v1, p1, Landroid/graphics/RectF;->top:F

    .line 97
    .line 98
    iget p2, p1, Landroid/graphics/RectF;->right:F

    .line 99
    .line 100
    add-float/2addr p2, v0

    .line 101
    iput p2, p1, Landroid/graphics/RectF;->right:F

    .line 102
    .line 103
    iget p2, p1, Landroid/graphics/RectF;->bottom:F

    .line 104
    .line 105
    add-float/2addr p2, v1

    .line 106
    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    .line 107
    .line 108
    return v3
.end method

.method public final getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLimitRectFInPage()Landroid/graphics/RectF;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->getPageRectF()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    new-instance v2, Landroid/graphics/RectF;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    int-to-float v4, v4

    .line 41
    mul-float/2addr v3, v4

    .line 42
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    int-to-float v4, v4

    .line 57
    mul-float/2addr v0, v4

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-direct {v2, v4, v4, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 72
    .line 73
    .line 74
    :cond_0
    return-object v1
.end method

.method public final getListener()Lcom/zykj/blackboard/core/action/IActionListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract getMaxFunctionRectF()Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final getSelectFunctionRectF()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectFunctionRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectGraphList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectRectF()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectRectFAfterTransform()Landroid/graphics/RectF;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final getSelectSizePair()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectSizePair:Lkotlin/Pair;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSingleMatrix()Landroid/graphics/Matrix;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransformMatrix()Landroid/graphics/Matrix;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTrianglePointF()Landroid/graphics/PointF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->trianglePointF:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object v0
.end method

.method public handleClick(FF)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public handleDoubleClick(FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public handleMoveEnd(FF)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->currentFunctionMode:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleRotate(FF)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleScale(FF)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleTranslate(FF)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 40
    .line 41
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getAdapterMatrix(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 58
    .line 59
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-interface {p2, v0, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translationEnd(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 62
    .line 63
    .line 64
    iput-boolean v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isTransforming:Z

    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-static {p0, v2, v0, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF$default(Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;ZILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixList:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    invoke-static {p1, v1, v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 85
    .line 86
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixList:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {p1, p2, v1}, Lcom/zykj/blackboard/core/action/IActionListener;->transformGraphEvent(Ljava/util/List;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->listener:Lcom/zykj/blackboard/core/action/IActionListener;

    .line 94
    .line 95
    invoke-interface {p1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 96
    .line 97
    .line 98
    return v0

    .line 99
    :cond_2
    return v2
.end method

.method public handleMoveStart(FF)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public handleMoving(FF)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->currentFunctionMode:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleRotate(FF)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleScale(FF)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleTranslate(FF)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isTransforming:Z

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 44
    .line 45
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translationStart(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    iput-boolean p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isTransforming:Z

    .line 56
    .line 57
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getAdapterMatrix(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixList:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    invoke-static {p1, v1, v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-interface {v0, v1, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translation(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 81
    .line 82
    .line 83
    return p2

    .line 84
    :cond_3
    const/4 p1, 0x0

    .line 85
    return p1
.end method

.method public initForFunctionTouch()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->matrixList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public abstract isClickInSelectFunction(FF)Z
.end method

.method public final isDirectionLeft()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isDirectionLeft:Z

    .line 2
    .line 3
    return v0
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->singleMatrix:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->currentFunctionMode:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->trianglePointF:Landroid/graphics/PointF;

    .line 27
    .line 28
    return-void
.end method

.method public final setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->currentFunctionMode:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 7
    .line 8
    return-void
.end method

.method public final setDirectionLeft(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isDirectionLeft:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFirstPoint(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstX:F

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstY:F

    .line 4
    .line 5
    return-void
.end method

.method public final setFirstX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstX:F

    .line 2
    .line 3
    return-void
.end method

.method public final setFirstY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->firstY:F

    .line 2
    .line 3
    return-void
.end method

.method public final setFunctionBackgroundRectF(Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionBackgroundRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 7
    .line 8
    return-void
.end method

.method public final setFunctionRectF(Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 7
    .line 8
    return-void
.end method

.method public setSelectGraphList(Ljava/util/List;)V
    .locals 1
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectGraphList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setSelectRectF(Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setSelectSizePair(Lkotlin/Pair;)V
    .locals 1
    .param p1    # Lkotlin/Pair;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectSizePair:Lkotlin/Pair;

    .line 7
    .line 8
    return-void
.end method

.method public final setSingleGraphData(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->transformMatrix:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 19
    .line 20
    .line 21
    iput-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->trianglePointF:Landroid/graphics/PointF;

    .line 22
    .line 23
    return-void
.end method

.method public final setTrianglePointF(Landroid/graphics/PointF;)V
    .locals 0
    .param p1    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->trianglePointF:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-void
.end method

.method public final showSelectRectF(Z)V
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectFunctionRectF:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getMaxFunctionRectF()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectFunctionRectF:Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectFAfterTransform()Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getLimitRectFInPage()Landroid/graphics/RectF;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectSizePair:Lkotlin/Pair;

    .line 23
    .line 24
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectFBySelectRectF(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isDirectionLeft:Z

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->updateFunctionRectF()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->updateFunctionBackgroundRectF()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->trianglePointF:Landroid/graphics/PointF;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, p1, v1}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    move-object v7, p1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 p1, 0x0

    .line 53
    goto :goto_0

    .line 54
    :goto_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectRectF:Landroid/graphics/RectF;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->selectFunctionRectF:Landroid/graphics/RectF;

    .line 63
    .line 64
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 65
    .line 66
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionBackgroundRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionTypeList()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-interface/range {v0 .. v7}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->newSelect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final updateFunctionBackgroundRectF()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->functionBackgroundRectF:Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getEditRectF()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Landroid/graphics/RectF;->setEmpty()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextEdit()Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getGeometryStroke()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getImageCrop()Landroid/graphics/RectF;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 45
    .line 46
    .line 47
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 48
    .line 49
    const/high16 v4, 0x41000000    # 8.0f

    .line 50
    .line 51
    sub-float/2addr v3, v4

    .line 52
    iput v3, v2, Landroid/graphics/RectF;->left:F

    .line 53
    .line 54
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 55
    .line 56
    add-float/2addr v3, v4

    .line 57
    iput v3, v2, Landroid/graphics/RectF;->right:F

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_0

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getWriteStrokeRectF()Landroid/graphics/RectF;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v2}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Landroid/graphics/RectF;

    .line 78
    .line 79
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 80
    .line 81
    const/high16 v5, 0x41800000    # 16.0f

    .line 82
    .line 83
    sub-float/2addr v4, v5

    .line 84
    invoke-static {v2}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, Landroid/graphics/RectF;

    .line 89
    .line 90
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Landroid/graphics/RectF;

    .line 97
    .line 98
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 99
    .line 100
    add-float/2addr v7, v5

    .line 101
    invoke-static {v2}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Landroid/graphics/RectF;

    .line 106
    .line 107
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 108
    .line 109
    invoke-virtual {v3, v4, v6, v7, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 110
    .line 111
    .line 112
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getTextSizeRectF()Landroid/graphics/RectF;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 139
    .line 140
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_1

    .line 152
    .line 153
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 154
    .line 155
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    const/high16 v3, 0x42180000    # 38.0f

    .line 160
    .line 161
    sub-float/2addr v2, v3

    .line 162
    const/4 v3, 0x2

    .line 163
    int-to-float v3, v3

    .line 164
    div-float/2addr v2, v3

    .line 165
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getColorRectF()Landroid/graphics/RectF;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-static {v4}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Landroid/graphics/RectF;

    .line 178
    .line 179
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 180
    .line 181
    const/high16 v5, 0x41b80000    # 23.0f

    .line 182
    .line 183
    sub-float/2addr v4, v5

    .line 184
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-static {v6}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    check-cast v6, Landroid/graphics/RectF;

    .line 193
    .line 194
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 195
    .line 196
    sub-float/2addr v6, v2

    .line 197
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-static {v7}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    check-cast v7, Landroid/graphics/RectF;

    .line 206
    .line 207
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 208
    .line 209
    add-float/2addr v7, v5

    .line 210
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-static {v5}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    check-cast v5, Landroid/graphics/RectF;

    .line 219
    .line 220
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 221
    .line 222
    add-float/2addr v5, v2

    .line 223
    invoke-virtual {v3, v4, v6, v7, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 224
    .line 225
    .line 226
    :cond_1
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getCustomColorRectF()Landroid/graphics/RectF;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 235
    .line 236
    .line 237
    return-void
.end method

.method public abstract updateFunctionRectF()V
.end method
