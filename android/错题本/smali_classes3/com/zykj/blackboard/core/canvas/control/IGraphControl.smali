.class public interface abstract Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/canvas/control/IGraphControl$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00072\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010!\u001a\u00020$H&\u00a2\u0006\u0004\u0008%\u0010&J\u0011\u0010\'\u001a\u0004\u0018\u00010\u001eH&\u00a2\u0006\u0004\u0008\'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010 H&\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008+\u0010\rJ\u000f\u0010,\u001a\u00020\nH&\u00a2\u0006\u0004\u0008,\u0010\u000fJ\u0017\u0010-\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008-\u0010\u0013J\u000f\u0010.\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008.\u0010\u0015J\u0011\u00100\u001a\u0004\u0018\u00010/H&\u00a2\u0006\u0004\u00080\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H&\u00a2\u0006\u0004\u00083\u00104J\u0011\u00105\u001a\u0004\u0018\u000102H&\u00a2\u0006\u0004\u00085\u00104J[\u0010?\u001a\u0004\u0018\u0001022\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\n2\u0008\u0008\u0002\u0010;\u001a\u00020:2\u0008\u0008\u0002\u0010<\u001a\u00020:2\u0008\u0008\u0002\u0010=\u001a\u00020:2\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010 H&\u00a2\u0006\u0004\u0008?\u0010@J9\u0010D\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020:H&\u00a2\u0006\u0004\u0008D\u0010EJ\u000f\u0010F\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008F\u0010GJ\u001d\u0010J\u001a\u00020\u00072\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020 0HH&\u00a2\u0006\u0004\u0008J\u0010KJ%\u0010L\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020 0HH&\u00a2\u0006\u0004\u0008L\u0010MJ\u001d\u0010O\u001a\u00020\u00072\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020 0NH&\u00a2\u0006\u0004\u0008O\u0010KJ%\u0010P\u001a\u00020\u00072\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020 0N2\u0006\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008P\u0010QJ\'\u0010R\u001a\u00020\u00072\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020 0N2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&\u00a2\u0006\u0004\u0008R\u0010QJ\u000f\u0010S\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008S\u0010GJ\u0017\u0010T\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008T\u0010UJ\u001b\u0010V\u001a\u00020\u00072\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&\u00a2\u0006\u0004\u0008V\u0010UJ\u000f\u0010W\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008W\u0010GJ\u0017\u0010Y\u001a\u00020\u00072\u0006\u0010!\u001a\u00020XH&\u00a2\u0006\u0004\u0008Y\u0010ZJ+\u0010]\u001a\u00020\u00072\u0006\u0010!\u001a\u00020X2\u0008\u0010[\u001a\u0004\u0018\u00010\u00022\u0008\u0010\\\u001a\u0004\u0018\u00010\u001aH&\u00a2\u0006\u0004\u0008]\u0010^J+\u0010_\u001a\u00020\u00072\u0006\u0010!\u001a\u00020X2\u0008\u0010[\u001a\u0004\u0018\u00010\u00022\u0008\u0010\\\u001a\u0004\u0018\u00010\u001aH&\u00a2\u0006\u0004\u0008_\u0010^J\u001f\u0010`\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008`\u0010aJ\u000f\u0010b\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008b\u0010GJ\u000f\u0010c\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008c\u0010GJ\u000f\u0010d\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008d\u0010GJ\u000f\u0010e\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008e\u0010GJ\u000f\u0010f\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008f\u0010GJ\u0017\u0010g\u001a\u00020\u00072\u0006\u0010)\u001a\u00020 H&\u00a2\u0006\u0004\u0008g\u0010hJ\u0017\u0010i\u001a\u00020\u00072\u0006\u0010i\u001a\u00020:H&\u00a2\u0006\u0004\u0008i\u0010jJ\u000f\u0010i\u001a\u00020:H&\u00a2\u0006\u0004\u0008i\u0010kJ\u001f\u0010m\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008m\u0010nJ\u000f\u0010o\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008o\u0010\u0004J\u0017\u0010r\u001a\u00020\u00072\u0006\u0010q\u001a\u00020pH&\u00a2\u0006\u0004\u0008r\u0010sJ\u0017\u0010t\u001a\u00020\u00072\u0006\u0010q\u001a\u00020pH&\u00a2\u0006\u0004\u0008t\u0010sJ\u001d\u0010u\u001a\u00020\u00072\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020 0NH&\u00a2\u0006\u0004\u0008u\u0010KJ/\u0010x\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u001e2\u0006\u0010v\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010w\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008x\u0010yJ/\u0010|\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u001e2\u0006\u0010w\u001a\u00020\u00022\u0006\u0010z\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001eH&\u00a2\u0006\u0004\u0008|\u0010}J\u000f\u0010~\u001a\u00020\nH&\u00a2\u0006\u0004\u0008~\u0010\u000fJ5\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020A2\u0007\u0010\u0080\u0001\u001a\u00020A2\u0007\u0010\u0081\u0001\u001a\u00020A2\u0007\u0010\u0082\u0001\u001a\u00020AH&\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J^\u0010\u008f\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020\u00022\u0008\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010N2\u000c\u0008\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H&\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001Jh\u0010\u0093\u0001\u001a\u00020\u00072\u0008\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020\u00022\u0008\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010N2\u000c\u0008\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H&\u00a2\u0006\u0006\u0008\u0093\u0001\u0010\u0094\u0001Jh\u0010\u0095\u0001\u001a\u00020\u00072\u0008\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020\u00022\u0008\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010N2\u000c\u0008\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H&\u00a2\u0006\u0006\u0008\u0095\u0001\u0010\u0094\u0001J^\u0010\u0096\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020\u00022\u0008\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010N2\u000c\u0008\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H&\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0090\u0001\u00a8\u0006\u0097\u0001"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "",
        "Landroid/graphics/RectF;",
        "getPageRectF",
        "()Landroid/graphics/RectF;",
        "getOldPageRectF",
        "rectF",
        "Ld6/s;",
        "setOldPageRectF",
        "(Landroid/graphics/RectF;)V",
        "",
        "color",
        "setDefaultBackgroundColor",
        "(I)V",
        "getDefaultBackgroundColor",
        "()I",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "backgroundLineConfig",
        "setDefaultBackgroundLineConfig",
        "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V",
        "getDefaultBackgroundLineConfig",
        "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "Landroid/graphics/Path;",
        "path",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Matrix;",
        "matrix",
        "drawPath",
        "(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V",
        "",
        "parentId",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "graph",
        "addGraph",
        "(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "addImageGraph",
        "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V",
        "rootGraphId",
        "()Ljava/lang/String;",
        "rootGraph",
        "()Lcom/zykj/blackboard/core/graph/IGraph;",
        "updateBackgroundColor",
        "getBackgroundColor",
        "updateBackgroundLineConfig",
        "getBackgroundLineConfig",
        "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
        "snapshot",
        "()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
        "Landroid/graphics/Bitmap;",
        "screenshot",
        "()Landroid/graphics/Bitmap;",
        "contentThumbnail",
        "horizontalOffset",
        "verticalOffset",
        "minWidth",
        "minHeight",
        "",
        "isBoardAsWidth",
        "isContainLimit",
        "isBoardAsTop",
        "interruptGraph",
        "minScreenShot",
        "(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;",
        "",
        "iconWidth",
        "isSelectAction",
        "select",
        "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V",
        "selectCancel",
        "()V",
        "",
        "graphList",
        "delete",
        "(Ljava/util/List;)V",
        "renderRectF",
        "(Landroid/graphics/RectF;Ljava/util/List;)V",
        "",
        "translationStart",
        "translation",
        "(Ljava/util/List;Landroid/graphics/Matrix;)V",
        "translationEnd",
        "cameraChangeStart",
        "cameraChanging",
        "(Landroid/graphics/Matrix;)V",
        "cameraChangeEnd",
        "resetCamera",
        "Lcom/zykj/blackboard/core/graph/group/TextGraph;",
        "textHandleStart",
        "(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V",
        "selectedRectF",
        "selectedRectFMatrix",
        "textHandle",
        "(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V",
        "textHandleEnd",
        "concatMatrix",
        "(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V",
        "release",
        "refresh",
        "reDrawFixView",
        "updateBackgroundMatrix",
        "reset",
        "init",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "isDraw",
        "(Z)V",
        "()Z",
        "graphId",
        "setGraphMatrix",
        "(Ljava/lang/String;Landroid/graphics/Matrix;)V",
        "getRenderRectF",
        "Lcom/zykj/blackboard/core/edit/RenderChangeListener;",
        "listener",
        "registerRenderRectFChangeListener",
        "(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V",
        "unRegisterRenderRectFChangeListener",
        "drawGraphInActive",
        "content",
        "originRectF",
        "changeTextGraph",
        "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V",
        "renderMatrix",
        "filePath",
        "changeImageGraph",
        "(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V",
        "getImageGraphCount",
        "l",
        "t",
        "r",
        "b",
        "newSelecting",
        "(FFFF)V",
        "selectRectF",
        "selectFunctionRectF",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
        "functionRectF",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
        "functionBackgroundRectF",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "typeList",
        "Landroid/graphics/PointF;",
        "pointF",
        "newSelect",
        "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V",
        "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
        "groupGraph",
        "newChangeHandleStart",
        "(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V",
        "newChangeHandling",
        "newChangeHandleEnd",
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


# virtual methods
.method public abstract addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract addImageGraph(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/group/ImageGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract cameraChangeEnd(Landroid/graphics/Matrix;)V
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract cameraChangeStart()V
.end method

.method public abstract cameraChanging(Landroid/graphics/Matrix;)V
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract changeImageGraph(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract changeTextGraph(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract concatMatrix(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract contentThumbnail()Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract delete(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract drawGraphInActive(Ljava/util/List;)V
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
.end method

.method public abstract drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract getBackgroundColor()I
.end method

.method public abstract getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getDefaultBackgroundColor()I
.end method

.method public abstract getDefaultBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getImageGraphCount()I
.end method

.method public abstract getOldPageRectF()Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getPageRectF()Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getRenderRectF()Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract init(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract isDraw(Z)V
.end method

.method public abstract isDraw()Z
.end method

.method public abstract minScreenShot(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
    .param p8    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract newChangeHandleEnd(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newChangeHandleStart(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/group/GroupGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newChangeHandling(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/group/GroupGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newSelect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newSelecting(FFFF)V
.end method

.method public abstract reDrawFixView()V
.end method

.method public abstract refresh()V
.end method

.method public abstract registerRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .param p1    # Lcom/zykj/blackboard/core/edit/RenderChangeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract release()V
.end method

.method public abstract renderRectF(Landroid/graphics/RectF;Ljava/util/List;)V
    .param p1    # Landroid/graphics/RectF;
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
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract reset()V
.end method

.method public abstract resetCamera()V
.end method

.method public abstract rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract rootGraphId()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract screenshot()Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract select(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract selectCancel()V
.end method

.method public abstract setDefaultBackgroundColor(I)V
.end method

.method public abstract setDefaultBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .param p1    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setGraphMatrix(Ljava/lang/String;Landroid/graphics/Matrix;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setOldPageRectF(Landroid/graphics/RectF;)V
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract snapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract textHandle(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/group/TextGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract textHandleEnd(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/group/TextGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract textHandleStart(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/group/TextGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract translation(Ljava/util/List;Landroid/graphics/Matrix;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
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
            "Landroid/graphics/Matrix;",
            ")V"
        }
    .end annotation
.end method

.method public abstract translationEnd(Ljava/util/List;Landroid/graphics/Matrix;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")V"
        }
    .end annotation
.end method

.method public abstract translationStart(Ljava/util/List;)V
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
.end method

.method public abstract unRegisterRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .param p1    # Lcom/zykj/blackboard/core/edit/RenderChangeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract updateBackgroundColor(I)V
.end method

.method public abstract updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .param p1    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract updateBackgroundMatrix()V
.end method
