# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;,
        Lcom/zykj/sketch/EzyDrawBoard$GraphResetDataOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;,
        Lcom/zykj/sketch/EzyDrawBoard$AudioStopActionOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;,
        Lcom/zykj/sketch/EzyDrawBoard$AudioStartActionOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrixOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionTranslationOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionZoomOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionNextActionOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionPrevActionOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoardOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfig;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionFitterConfigOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfigOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$DrawArea;,
        Lcom/zykj/sketch/EzyDrawBoard$DrawAreaOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfigOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfigOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfigOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfigOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEventOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionContent;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$BoardBodyV1;,
        Lcom/zykj/sketch/EzyDrawBoard$BoardBodyV1OrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$BoardBody;,
        Lcom/zykj/sketch/EzyDrawBoard$BoardBodyOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$BoardHead;,
        Lcom/zykj/sketch/EzyDrawBoard$BoardHeadOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$DrawBoardV1;,
        Lcom/zykj/sketch/EzyDrawBoard$DrawBoardV1OrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;,
        Lcom/zykj/sketch/EzyDrawBoard$DrawBoardOrBuilder;,
        Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
    }
.end annotation


# static fields
.field private static descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

.field private static final internal_static_ActionClearBoard_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionClearBoard_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionContent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionContent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionDrawConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionDrawConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionFitterConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionFitterConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionGraphConfig_GraphConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionGraphConfig_GraphConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionGraphConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionGraphConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionImageConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionImageConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionModeConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionModeConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionNextAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionNextAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionPrevAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionPrevAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionResetMatrix_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionResetMatrix_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionTouchEvent_TouchEvent_PointerCoords_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionTouchEvent_TouchEvent_PointerCoords_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionTouchEvent_TouchEvent_PointerProperties_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionTouchEvent_TouchEvent_PointerProperties_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionTouchEvent_TouchEvent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionTouchEvent_TouchEvent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionTouchEvent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionTouchEvent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionTranslation_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionTranslation_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionWebViewConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionWebViewConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_ActionZoom_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_ActionZoom_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_AudioStartAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_AudioStartAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_AudioStopAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_AudioStopAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_BoardBodyV1_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_BoardBodyV1_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_BoardBody_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_BoardBody_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_BoardHead_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_BoardHead_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_DrawArea_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_DrawArea_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_DrawBoardV1_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_DrawBoardV1_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_DrawBoard_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_DrawBoard_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_GraphResetData_ActionFactory_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_GraphResetData_ActionFactory_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field private static final internal_static_GraphResetData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private static final internal_static_GraphResetData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    const-string v7, "\u0003\n\u000eGraphResetData\u0012\u0018\n\u0010factoryGraphName\u0018\u0001 \u0001(\t\u0012\u001e\n\u0016factoryActionGraphName\u0018\u0002 \u0001(\t\u0012-\n\u0006action\u0018\u0005 \u0001(\u000b2\u001d.GraphResetData.ActionFactory\u00123\n\u000bgraphConfig\u0018\u0006 \u0001(\u000b2\u001e.ActionGraphConfig.GraphConfig\u0012*\n\nmodeConfig\u0018\u0007 \u0001(\u000e2\u0016.ActionModeConfig.Mode\u0012\u0017\n\u000fbackgroundColor\u0018\u0008 \u0001(\u0005\u0012\u001b\n\u0008drawArea\u0018\t \u0001(\u000b2\t.DrawArea\u001au\n\rActionFactory\u0012*\n\nbaseAction\u0018\u0001 \u0001(\u000e2\u0016.ActionModeConfig.Mode\u0012\u0018\n\u0010factoryGraphName\u0018\u0002 \u0001(\t\u0012\u001e\n\u0016factoryActionGraphName\u0018\u0003 \u0001(\t*\u00b3\u0002\n\nAct"

    const-string v8, "ionEnum\u0012\u0010\n\u000cACTION_TOUCH\u0010\u0000\u0012\u000f\n\u000bACTION_MODE\u0010\u0001\u0012\u0010\n\u000cACTION_GRAPH\u0010\u0002\u0012\u000e\n\nACTION_WEB\u0010\u0003\u0012\u0010\n\u000cACTION_IMAGE\u0010\u0004\u0012\u0011\n\rACTION_FILTER\u0010\u0005\u0012\u0016\n\u0012ACTION_CLEAR_BOARD\u0010\u0006\u0012\u000f\n\u000bACTION_NEXT\u0010\u0007\u0012\u000f\n\u000bACTION_PREV\u0010\u0008\u0012\u0016\n\u0012ACTION_AUDIO_START\u0010\t\u0012\u0015\n\u0011ACTION_AUDIO_STOP\u0010\n\u0012\u000f\n\u000bACTION_ZOOM\u0010\u000b\u0012\u0010\n\u000cACTION_TRANS\u0010\u000c\u0012\u0016\n\u0012ACTION_DRAW_CONFIG\u0010\r\u0012\u0017\n\u0013ACTION_RESET_MATRIX\u0010\u000eB\u001f\n\u000fcom.zykj.sketchB\u000cEzyDrawBoardb\u0006proto3"

    const-string v0, "\n\u000fDrawBoard.proto\u001a\u0019google/protobuf/any.proto\u001a\u001egoogle/protobuf/wrappers.proto\u001a\u0019SketchGraphSnapshot.proto\"I\n\tDrawBoard\u0012\u001d\n\tboardHead\u0018\u0001 \u0001(\u000b2\n.BoardHead\u0012\u001d\n\tboardBody\u0018\u0002 \u0001(\u000b2\n.BoardBody\"O\n\u000bDrawBoardV1\u0012\u001d\n\tboardHead\u0018\u0001 \u0001(\u000b2\n.BoardHead\u0012!\n\u000bboardBodyV1\u0018\u0002 \u0001(\u000b2\u000c.BoardBodyV1\"\u0081\u0001\n\tBoardHead\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0004 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0005 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0006 \u0001(\u0003\u0012\u000e\n\u0006author\u0018\u0007 \u0001(\t\u0012\u000c\n\u0004type\u0018\u0008 \u0001(\u0005\"2\n\tBoard"

    const-string v1, "Body\u0012%\n\rActionContent\u0018\u0001 \u0003(\u000b2\u000e.ActionContent\":\n\u000bBoardBodyV1\u0012+\n\rActionContent\u0018\u0001 \u0003(\u000b2\u0014.google.protobuf.Any\"\u0097\u0001\n\rActionContent\u0012\u0019\n\u0004type\u0018\u0001 \u0001(\u000e2\u000b.ActionEnum\u0012$\n\u0006action\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.Any\u0012!\n\rgraphSnapshot\u0018\u0003 \u0001(\u000b2\n.GraphData\u0012\"\n\tresetData\u0018\u0005 \u0001(\u000b2\u000f.GraphResetData\"\u00bc\u0003\n\u0010ActionTouchEvent\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007endTime\u0018\u0003 \u0001(\u0003\u00120\n\ntouchEvent\u0018\u0004 \u0003(\u000b2\u001c.ActionTouchEvent.TouchEvent\u001a\u00c3\u0002\n\nTouchEvent\u0012\u0011\n\teve"

    const-string v2, "ntTime\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0003 \u0001(\u0005\u0012\u0014\n\u000cpointerCount\u0018\u0004 \u0001(\u0005\u0012I\n\u0011pointerProperties\u0018\u0005 \u0003(\u000b2..ActionTouchEvent.TouchEvent.PointerProperties\u0012A\n\rpointerCoords\u0018\u0006 \u0003(\u000b2*.ActionTouchEvent.TouchEvent.PointerCoords\u0012\t\n\u0001x\u0018\u000f \u0001(\u0002\u0012\t\n\u0001y\u0018\u0010 \u0001(\u0002\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\u0008toolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\"\u009e\u0001\n\u0011ActionImageConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\u000c\n\u0004path\u0018\u0003 \u0001(\t\u0012\r\n\u0005width\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0005"

    const-string v3, " \u0001(\u0005\u0012\u0011\n\tviewWidth\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nviewHeight\u0018\u0007 \u0001(\u0005\u0012\u0014\n\u000cpositionFlag\u0018\u0008 \u0001(\u0005\"\u008a\u0001\n\u0013ActionWebViewConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\u000c\n\u0004path\u0018\u0003 \u0001(\t\u0012\r\n\u0005width\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0005 \u0001(\u0005\u0012\u0011\n\tviewWidth\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nviewHeight\u0018\u0007 \u0001(\u0005\"\u0091\u0001\n\u0011ActionGraphConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012.\n\u0006config\u0018\u0004 \u0001(\u000b2\u001e.ActionGraphConfig.GraphConfig\u001a+\n\u000bGraphConfig\u0012\r\n\u0005width\u0018\u0001 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\"i\n\u0010ActionDrawConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTim"

    const-string v4, "e\u0018\u0002 \u0001(\u0003\u0012\u0017\n\u000fbackgroundColor\u0018\u0003 \u0001(\u0005\u0012\u001b\n\u0008drawArea\u0018\u0004 \u0001(\u000b2\t.DrawArea\"\\\n\u0008DrawArea\u0012\u001d\n\u000cleftTopPoint\u0018\u0001 \u0001(\u000b2\u0007.PointF\u0012!\n\u0010rightBottomPoint\u0018\u0002 \u0001(\u000b2\u0007.PointF\u0012\u000e\n\u0006matrix\u0018\u0003 \u0003(\u0002\"\u00ba\u0002\n\u0010ActionModeConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012$\n\u0004mode\u0018\u0004 \u0001(\u000e2\u0016.ActionModeConfig.Mode\"\u00de\u0001\n\u0004Mode\u0012\u0011\n\rACTION_SELECT\u0010\u0000\u0012\u0012\n\u000eACTION_WRITING\u0010\u0001\u0012\u0017\n\u0013ACTION_SHAPE_CIRCLE\u0010\u0002\u0012\u0015\n\u0011ACTION_SHAPE_RECT\u0010\u0003\u0012\u0016\n\u0012ACTION_ERASER_VIEW\u0010\u0005\u0012\u0019\n\u0015ACTION_ERASER_WRITING\u0010\u0006\u0012\u0011\n\rAC"

    const-string v5, "TION_DELETE\u0010\u0007\u0012\u0017\n\u0013ACTION_WRITING_MOVE\u0010\u0008\u0012 \n\u001cACTION_WRITING_MOVE_VERTICAL\u0010\t\"~\n\u0012ActionFitterConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\r\n\u0005scale\u0018\u0003 \u0001(\u0002\u0012\u000f\n\u0007centerX\u0018\u0004 \u0001(\u0005\u0012\u000f\n\u0007centerY\u0018\u0005 \u0001(\u0005\u0012\n\n\u0002px\u0018\u0006 \u0001(\u0005\u0012\n\n\u0002py\u0018\u0007 \u0001(\u0005\"3\n\u0010ActionClearBoard\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"3\n\u0010ActionPrevAction\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"3\n\u0010ActionNextAction\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"}\n\nActionZoom\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime"

    const-string v6, "\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006scaleX\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006scaleY\u0018\u0004 \u0001(\u0002\u0012\u000f\n\u0007centerX\u0018\u0005 \u0001(\u0002\u0012\u000f\n\u0007centerY\u0018\u0006 \u0001(\u0002\u0012\u000c\n\u0004keep\u0018\u0007 \u0001(\u0008\"\u009c\u0001\n\u0011ActionTranslation\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012+\n\u0006transX\u0018\u0003 \u0001(\u000b2\u001b.google.protobuf.FloatValue\u0012+\n\u0006transY\u0018\u0004 \u0001(\u000b2\u001b.google.protobuf.FloatValue\u0012\u000c\n\u0004keep\u0018\u0005 \u0001(\u0008\"&\n\u0011ActionResetMatrix\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\"7\n\u0010AudioStartAction\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\u0008fileName\u0018\u0002 \u0001(\t\"6\n\u000fAudioStopAction\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\u0008fileName\u0018\u0002 \u0001(\t\"\u0087"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/zykj/sketch/EzyDrawBoard$1;

    invoke-direct {v1}, Lcom/zykj/sketch/EzyDrawBoard$1;-><init>()V

    .line 3
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    move-result-object v2

    .line 4
    invoke-static {}, Lcom/google/protobuf/WrappersProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    move-result-object v3

    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    move-result-object v2

    .line 6
    invoke-static {v0, v2, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;Lcom/google/protobuf/Descriptors$FileDescriptor$InternalDescriptorAssigner;)V

    const/4 v0, 0x0

    .line 7
    invoke-static {v0}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 8
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoard_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 9
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "BoardBody"

    const-string v4, "BoardHead"

    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoard_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/4 v1, 0x1

    .line 10
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v2

    .line 11
    check-cast v2, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoardV1_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 12
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v5, "BoardBodyV1"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoardV1_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/4 v2, 0x2

    .line 13
    invoke-static {v2}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v2

    .line 14
    check-cast v2, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardHead_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 15
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v9, "Author"

    const-string v10, "Type"

    const-string v4, "Version"

    const-string v5, "Width"

    const-string v6, "Height"

    const-string v7, "CreateDate"

    const-string v8, "UpdateDate"

    filled-new-array/range {v4 .. v10}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardHead_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/4 v2, 0x3

    .line 16
    invoke-static {v2}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v2

    .line 17
    check-cast v2, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBody_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 18
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v4, "ActionContent"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v2, v5}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBody_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/4 v2, 0x4

    .line 19
    invoke-static {v2}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v2

    .line 20
    check-cast v2, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBodyV1_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 21
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBodyV1_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/4 v2, 0x5

    .line 22
    invoke-static {v2}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v2

    .line 23
    check-cast v2, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionContent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 24
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v4, "GraphSnapshot"

    const-string v5, "ResetData"

    const-string v6, "Type"

    const-string v7, "Action"

    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionContent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/4 v2, 0x6

    .line 25
    invoke-static {v2}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v2

    .line 26
    check-cast v2, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 27
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v4, "EndTime"

    const-string v5, "TouchEvent"

    const-string v7, "StartTime"

    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 28
    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 29
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v13, "X"

    const-string v14, "Y"

    const-string v8, "EventTime"

    const-string v9, "Action"

    const-string v10, "PointerCount"

    const-string v11, "PointerProperties"

    const-string v12, "PointerCoords"

    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 30
    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerProperties_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 31
    new-instance v4, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v5, "Id"

    const-string v8, "ToolType"

    filled-new-array {v5, v8}, [Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v4, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerProperties_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 32
    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerCoords_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 33
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "X"

    const-string v4, "Y"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerCoords_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/4 v1, 0x7

    .line 34
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 35
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionImageConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 36
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v14, "ViewHeight"

    const-string v15, "PositionFlag"

    const-string v8, "Type"

    const-string v9, "StartTime"

    const-string v10, "Path"

    const-string v11, "Width"

    const-string v12, "Height"

    const-string v13, "ViewWidth"

    filled-new-array/range {v8 .. v15}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionImageConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x8

    .line 37
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 38
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionWebViewConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 39
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v13, "ViewWidth"

    const-string v14, "ViewHeight"

    const-string v8, "Type"

    const-string v9, "StartTime"

    const-string v10, "Path"

    const-string v11, "Width"

    const-string v12, "Height"

    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionWebViewConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x9

    .line 40
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 41
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 42
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "Config"

    filled-new-array {v6, v7, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 43
    invoke-virtual {v1}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_GraphConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 44
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "Width"

    const-string v4, "Color"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_GraphConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0xa

    .line 45
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 46
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionDrawConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 47
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "BackgroundColor"

    const-string v4, "DrawArea"

    filled-new-array {v6, v7, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionDrawConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0xb

    .line 48
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 49
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawArea_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 50
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "RightBottomPoint"

    const-string v4, "Matrix"

    const-string v5, "LeftTopPoint"

    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawArea_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0xc

    .line 51
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 52
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionModeConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 53
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "Mode"

    filled-new-array {v6, v7, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionModeConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0xd

    .line 54
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 55
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionFitterConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 56
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v13, "Px"

    const-string v14, "Py"

    const-string v8, "Type"

    const-string v9, "StartTime"

    const-string v10, "Scale"

    const-string v11, "CenterX"

    const-string v12, "CenterY"

    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionFitterConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0xe

    .line 57
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 58
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionClearBoard_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 59
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionClearBoard_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0xf

    .line 60
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 61
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionPrevAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 62
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionPrevAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x10

    .line 63
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 64
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionNextAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 65
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionNextAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x11

    .line 66
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 67
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionZoom_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 68
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v13, "CenterY"

    const-string v14, "Keep"

    const-string v8, "Type"

    const-string v9, "StartTime"

    const-string v10, "ScaleX"

    const-string v11, "ScaleY"

    const-string v12, "CenterX"

    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionZoom_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x12

    .line 69
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 70
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTranslation_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 71
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "TransY"

    const-string v4, "Keep"

    const-string v5, "TransX"

    filled-new-array {v6, v7, v5, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTranslation_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x13

    .line 72
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 73
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionResetMatrix_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 74
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionResetMatrix_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x14

    .line 75
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 76
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStartAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 77
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v3, "FileName"

    filled-new-array {v7, v3}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v1, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStartAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x15

    .line 78
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 79
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStopAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 80
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    filled-new-array {v7, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStopAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const/16 v1, 0x16

    .line 81
    invoke-static {v1}, Landroidx/compose/material3/c;->B(I)Ljava/lang/Object;

    move-result-object v1

    .line 82
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 83
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v8, "BackgroundColor"

    const-string v9, "DrawArea"

    const-string v3, "FactoryGraphName"

    const-string v4, "FactoryActionGraphName"

    const-string v5, "Action"

    const-string v6, "GraphConfig"

    const-string v7, "ModeConfig"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 84
    invoke-virtual {v1}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_ActionFactory_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 85
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-string v2, "FactoryGraphName"

    const-string v3, "FactoryActionGraphName"

    const-string v4, "BaseAction"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_ActionFactory_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 86
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 87
    invoke-static {}, Lcom/google/protobuf/WrappersProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 88
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$000()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoard_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoard_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1000()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoardV1_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoardV1_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$12000()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionImageConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$12100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionImageConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$13700()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionWebViewConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$13800()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionWebViewConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$15300()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$15400()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$15500()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_GraphConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$15600()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_GraphConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$17400()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionDrawConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$17500()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionDrawConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$18600()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawArea_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$18700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawArea_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$19800()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionModeConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$19900()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionModeConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2000()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardHead_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$20900()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionFitterConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardHead_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$21000()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionFitterConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$22400()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionClearBoard_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$22500()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionClearBoard_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$23400()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionPrevAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$23500()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionPrevAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$24400()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionNextAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$24500()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionNextAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$25400()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionZoom_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$25500()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionZoom_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$26900()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTranslation_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$27000()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTranslation_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$28200()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionResetMatrix_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$28300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionResetMatrix_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$29100()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStartAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$29200()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStartAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$30200()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStopAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$30300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStopAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$31300()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$31400()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$31500()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_ActionFactory_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$31600()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_ActionFactory_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$34302(Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 0

    .line 1
    sput-object p0, Lcom/zykj/sketch/EzyDrawBoard;->descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$3600()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBody_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$3700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBody_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4600()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBodyV1_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$4700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBodyV1_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$5600()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionContent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$5700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionContent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$6800()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$6900()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$7000()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$7100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$7200()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerProperties_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$7300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerProperties_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$8200()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerCoords_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$8300()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerCoords_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard;->descriptor:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static registerAllExtensions(Lcom/google/protobuf/ExtensionRegistry;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/zykj/sketch/EzyDrawBoard;->registerAllExtensions(Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method public static registerAllExtensions(Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 0

    .line 1
    return-void
.end method
