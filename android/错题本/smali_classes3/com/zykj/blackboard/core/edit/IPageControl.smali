.class public interface abstract Lcom/zykj/blackboard/core/edit/IPageControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00cc\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ=\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000b\u0010\u0010JE\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000b\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u0013\u0010\u0015J3\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH&\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H&\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H&\u00a2\u0006\u0004\u0008&\u0010%J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\'H&\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\'H&\u00a2\u0006\u0004\u0008*\u0010)J\u000f\u0010+\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010.\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\u001bH&\u00a2\u0006\u0004\u00080\u00101J\u0017\u00103\u001a\u00020\u001b2\u0006\u0010#\u001a\u000202H&\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\u0008H&\u00a2\u0006\u0004\u00085\u0010,J\u000f\u0010-\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008-\u00101J\u000f\u00106\u001a\u00020\u001bH&\u00a2\u0006\u0004\u00086\u00101J\u0017\u00109\u001a\u00020\u00082\u0006\u00108\u001a\u000207H&\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010=\u001a\u00020\u00082\u0006\u0010<\u001a\u00020;H&\u00a2\u0006\u0004\u0008=\u0010>J\u001f\u0010B\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\n2\u0006\u0010A\u001a\u00020@H&\u00a2\u0006\u0004\u0008B\u0010CJ\u0019\u0010E\u001a\u00020\u001b2\u0008\u0010#\u001a\u0004\u0018\u00010DH&\u00a2\u0006\u0004\u0008E\u0010FJ\u0019\u0010H\u001a\u00020\u001b2\u0008\u0010#\u001a\u0004\u0018\u00010GH&\u00a2\u0006\u0004\u0008H\u0010IJ2\u0010M\u001a\u00020\u001b2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\u000c\u0008K\u0012\u0008\u0008L\u0012\u0004\u0008\u0008(\u001a\u0012\u0004\u0012\u00020\u001b0JH&\u00a2\u0006\u0004\u0008M\u0010NJ\u0011\u0010O\u001a\u0004\u0018\u00010\rH&\u00a2\u0006\u0004\u0008O\u0010PJ[\u0010Z\u001a\u0004\u0018\u00010\r2\u0006\u0010Q\u001a\u0002072\u0006\u0010R\u001a\u0002072\u0006\u0010S\u001a\u0002072\u0006\u0010T\u001a\u0002072\u0008\u0008\u0002\u0010U\u001a\u00020\u00082\u0008\u0008\u0002\u0010V\u001a\u00020\u00082\u0008\u0008\u0002\u0010W\u001a\u00020\u00082\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u00010XH&\u00a2\u0006\u0004\u0008Z\u0010[J\u000f\u0010\\\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\\\u00101J\u000f\u0010]\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008]\u00101J\u000f\u0010^\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008^\u0010,J\'\u0010b\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020;2\u0006\u0010`\u001a\u00020;2\u0006\u0010a\u001a\u00020;H&\u00a2\u0006\u0004\u0008b\u0010cJ\u000f\u0010d\u001a\u00020;H&\u00a2\u0006\u0004\u0008d\u0010eJ\u000f\u0010f\u001a\u00020@H&\u00a2\u0006\u0004\u0008f\u0010gJ#\u0010j\u001a\u00020\u001b2\u0008\u0010h\u001a\u0004\u0018\u00010;2\u0008\u0010i\u001a\u0004\u0018\u00010;H&\u00a2\u0006\u0004\u0008j\u0010kJ\u0017\u0010m\u001a\u00020\u001b2\u0006\u0010l\u001a\u000207H&\u00a2\u0006\u0004\u0008m\u0010nJ\u000f\u0010o\u001a\u000207H&\u00a2\u0006\u0004\u0008o\u0010pJ\u001f\u0010s\u001a\u00020\u001b2\u0006\u0010l\u001a\u0002072\u0006\u0010r\u001a\u00020qH&\u00a2\u0006\u0004\u0008s\u0010tJ\u000f\u0010u\u001a\u00020qH&\u00a2\u0006\u0004\u0008u\u0010vJ\u001b\u0010w\u001a\u00020\u001b2\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u00010XH&\u00a2\u0006\u0004\u0008w\u0010xJ\u0017\u0010{\u001a\u00020\u001b2\u0006\u0010z\u001a\u00020yH&\u00a2\u0006\u0004\u0008{\u0010|J\u0019\u0010~\u001a\u00020\u001b2\u0008\u0010#\u001a\u0004\u0018\u00010}H&\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u001bH&\u00a2\u0006\u0005\u0008\u0080\u0001\u00101J+\u0010\u0083\u0001\u001a\u00020\u001b2\u000b\u0008\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010;2\u000b\u0008\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010;H&\u00a2\u0006\u0005\u0008\u0083\u0001\u0010kJ+\u0010\u0084\u0001\u001a\u00020\u001b2\u000b\u0008\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010;2\u000b\u0008\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010;H&\u00a2\u0006\u0005\u0008\u0084\u0001\u0010kJ\u0011\u0010\u0085\u0001\u001a\u00020;H&\u00a2\u0006\u0005\u0008\u0085\u0001\u0010eJ\u0011\u0010\u0086\u0001\u001a\u00020;H&\u00a2\u0006\u0005\u0008\u0086\u0001\u0010eJ\u001b\u0010\u0088\u0001\u001a\u00020\u001b2\u0007\u0010#\u001a\u00030\u0087\u0001H&\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\u001b2\u0007\u0010#\u001a\u00030\u0087\u0001H&\u00a2\u0006\u0006\u0008\u008a\u0001\u0010\u0089\u0001J\u0011\u0010\u008b\u0001\u001a\u000207H&\u00a2\u0006\u0005\u0008\u008b\u0001\u0010pJ\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010XH&\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020\u0008H&\u00a2\u0006\u0005\u0008\u008e\u0001\u0010,J\u0011\u0010\u008f\u0001\u001a\u000207H&\u00a2\u0006\u0005\u0008\u008f\u0001\u0010pJ\u0018\u0010\u0090\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016H&\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J\u0018\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016H&\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0091\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u0008H&\u00a2\u0006\u0005\u0008\u0093\u0001\u0010,J\u0011\u0010\u0094\u0001\u001a\u00020\u0008H&\u00a2\u0006\u0005\u0008\u0094\u0001\u0010,J\u0011\u0010\u0095\u0001\u001a\u00020\u001bH&\u00a2\u0006\u0005\u0008\u0095\u0001\u00101J\u0011\u0010\u0096\u0001\u001a\u00020\u001bH&\u00a2\u0006\u0005\u0008\u0096\u0001\u00101J\u001b\u0010\u0098\u0001\u001a\u00020\u001b2\u0007\u0010#\u001a\u00030\u0097\u0001H&\u00a2\u0006\u0006\u0008\u0098\u0001\u0010\u0099\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u001b2\u0007\u0010#\u001a\u00030\u0097\u0001H&\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u0099\u0001J1\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\t\u0008\u0002\u0010\u009c\u0001\u001a\u000207H&\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001J!\u0010\u00a1\u0001\u001a\u00020\u001b2\r\u0010\u00a0\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016H&\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001\u00a8\u0006\u00a3\u0001"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/edit/IPageControl;",
        "",
        "",
        "path",
        "Lcom/zykj/board/EzyPositionEnum$PositionEnum;",
        "position",
        "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;",
        "scaleType",
        "",
        "loadWithCameraMatrix",
        "Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "addImage",
        "(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "isRecycle",
        "(Landroid/graphics/Bitmap;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "filename",
        "(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "addSpecialImage",
        "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "(Landroid/graphics/Bitmap;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
        "",
        "pathList",
        "addImageList",
        "(Ljava/util/List;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)Ljava/util/List;",
        "graphId",
        "Ld6/s;",
        "selectedGraph",
        "(Ljava/lang/String;)V",
        "Lcom/zykj/blackboard/listener/RecordListener;",
        "recordListener",
        "setRecordListener",
        "(Lcom/zykj/blackboard/listener/RecordListener;)V",
        "Lcom/zykj/blackboard/listener/EventListener;",
        "listener",
        "addEventListener",
        "(Lcom/zykj/blackboard/listener/EventListener;)V",
        "removeEventListener",
        "Lcom/zykj/blackboard/core/edit/RenderChangeListener;",
        "addRenderRectChangeListener",
        "(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V",
        "removeRenderRectChangeListener",
        "isRecording",
        "()Z",
        "turnOnMicro",
        "startRecord",
        "(Z)V",
        "stopRecord",
        "()V",
        "Lcom/zykj/blackboard/listener/MicroPhoneListener;",
        "setMicroPhoneListener",
        "(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V",
        "isMicroTurnOn",
        "turnOffMicro",
        "",
        "color",
        "changeTextColor",
        "(I)Z",
        "",
        "size",
        "changeTextSize",
        "(F)Z",
        "graph",
        "Landroid/graphics/RectF;",
        "newRectF",
        "changeImageOriginRect",
        "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Landroid/graphics/RectF;)V",
        "Lcom/zykj/blackboard/listener/ITextSelectListener;",
        "setTextSelectListener",
        "(Lcom/zykj/blackboard/listener/ITextSelectListener;)V",
        "Lcom/zykj/blackboard/listener/IGeometrySelectListener;",
        "setGeometrySelectListener",
        "(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "setGeometryCreateListener",
        "(Lr6/c;)V",
        "screenshot",
        "()Landroid/graphics/Bitmap;",
        "horizontalOffset",
        "verticalOffset",
        "minWidth",
        "minHeight",
        "isBoardAsWidth",
        "isContainLimit",
        "isBoardAsTop",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "interruptGraph",
        "minScreenshot",
        "(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;",
        "save",
        "saveWithContentThumbnail",
        "canSave",
        "pointX",
        "pointY",
        "scaleNum",
        "zoomLevel",
        "(FFF)V",
        "getZoomLevel",
        "()F",
        "getRenderRect",
        "()Landroid/graphics/RectF;",
        "progressWidth",
        "progressHeight",
        "setVisibleAreaProgress",
        "(Ljava/lang/Float;Ljava/lang/Float;)V",
        "backgroundColor",
        "setBackgroundColor",
        "(I)V",
        "getBackgroundColor",
        "()I",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "backgroundLineConfig",
        "setBackgroundColorWithLineConfig",
        "(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V",
        "getBackgroundLineConfig",
        "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "cleanPage",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "setAreaMoveListener",
        "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V",
        "areaMoveStart",
        "horizontalProgress",
        "verticalProgress",
        "areaMoving",
        "areaMoveEnd",
        "getMoveVerticalProgress",
        "getMoveHorizontalProgress",
        "Lcom/zykj/blackboard/listener/GraphDeleteListener;",
        "addGraphDeleteListener",
        "(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V",
        "removeGraphDeleteListener",
        "getImageGraphCount",
        "getFirstGraph",
        "()Lcom/zykj/blackboard/core/graph/IGraph;",
        "isPageNotEmpty",
        "getGroupGraphSize",
        "getPageImagePathList",
        "()Ljava/util/List;",
        "getNoRecordImagePathList",
        "withdraw",
        "recover",
        "clearHistoryList",
        "clearHistoryListWithoutCurrent",
        "Lcom/zykj/blackboard/listener/WithdrawListener;",
        "addWithdrawListener",
        "(Lcom/zykj/blackboard/listener/WithdrawListener;)V",
        "removeWithdrawListener",
        "content",
        "offset",
        "Lcom/zykj/blackboard/core/graph/group/TextGraph;",
        "addText",
        "(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lcom/zykj/blackboard/core/graph/group/TextGraph;",
        "graphIdList",
        "newSelectGraph",
        "(Ljava/util/List;)V",
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
.method public abstract addEventListener(Lcom/zykj/blackboard/listener/EventListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/EventListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract addGraphDeleteListener(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/GraphDeleteListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract addImage(Landroid/graphics/Bitmap;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyPositionEnum$PositionEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract addImage(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyPositionEnum$PositionEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract addImage(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyPositionEnum$PositionEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract addImageList(Ljava/util/List;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)Ljava/util/List;
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyPositionEnum$PositionEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/zykj/board/EzyPositionEnum$PositionEnum;",
            "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract addRenderRectChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .param p1    # Lcom/zykj/blackboard/core/edit/RenderChangeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract addSpecialImage(Landroid/graphics/Bitmap;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract addSpecialImage(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract addText(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lcom/zykj/blackboard/core/graph/group/TextGraph;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyPositionEnum$PositionEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/WithdrawListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract areaMoveStart()V
.end method

.method public abstract areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract canSave()Z
.end method

.method public abstract changeImageOriginRect(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Landroid/graphics/RectF;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/group/ImageGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract changeTextColor(I)Z
.end method

.method public abstract changeTextSize(F)Z
.end method

.method public abstract cleanPage(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract clearHistoryList()V
.end method

.method public abstract clearHistoryListWithoutCurrent()V
.end method

.method public abstract getBackgroundColor()I
.end method

.method public abstract getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getFirstGraph()Lcom/zykj/blackboard/core/graph/IGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getGroupGraphSize()I
.end method

.method public abstract getImageGraphCount()I
.end method

.method public abstract getMoveHorizontalProgress()F
.end method

.method public abstract getMoveVerticalProgress()F
.end method

.method public abstract getNoRecordImagePathList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getPageImagePathList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getRenderRect()Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getZoomLevel()F
.end method

.method public abstract isMicroTurnOn()Z
.end method

.method public abstract isPageNotEmpty()Z
.end method

.method public abstract isRecording()Z
.end method

.method public abstract minScreenshot(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
    .param p8    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract newSelectGraph(Ljava/util/List;)V
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
.end method

.method public abstract onTouchEvent(Landroid/view/MotionEvent;)V
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract recover()Z
.end method

.method public abstract removeEventListener(Lcom/zykj/blackboard/listener/EventListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/EventListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract removeGraphDeleteListener(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/GraphDeleteListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract removeRenderRectChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .param p1    # Lcom/zykj/blackboard/core/edit/RenderChangeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract removeWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/WithdrawListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract save()V
.end method

.method public abstract saveWithContentThumbnail()V
.end method

.method public abstract screenshot()Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract selectedGraph(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/IAreaMoveListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setBackgroundColor(I)V
.end method

.method public abstract setBackgroundColorWithLineConfig(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .param p2    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setGeometryCreateListener(Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setGeometrySelectListener(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/IGeometrySelectListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setMicroPhoneListener(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/MicroPhoneListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setRecordListener(Lcom/zykj/blackboard/listener/RecordListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/RecordListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setTextSelectListener(Lcom/zykj/blackboard/listener/ITextSelectListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/ITextSelectListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setVisibleAreaProgress(Ljava/lang/Float;Ljava/lang/Float;)V
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract startRecord(Z)V
.end method

.method public abstract stopRecord()V
.end method

.method public abstract turnOffMicro()V
.end method

.method public abstract turnOnMicro()V
.end method

.method public abstract withdraw()Z
.end method

.method public abstract zoomLevel(FFF)V
.end method
