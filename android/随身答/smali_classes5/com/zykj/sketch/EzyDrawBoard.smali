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

    .line 2
    .line 3
    const-string v8, "ionEnum\u0012\u0010\n\u000cACTION_TOUCH\u0010\u0000\u0012\u000f\n\u000bACTION_MODE\u0010\u0001\u0012\u0010\n\u000cACTION_GRAPH\u0010\u0002\u0012\u000e\n\nACTION_WEB\u0010\u0003\u0012\u0010\n\u000cACTION_IMAGE\u0010\u0004\u0012\u0011\n\rACTION_FILTER\u0010\u0005\u0012\u0016\n\u0012ACTION_CLEAR_BOARD\u0010\u0006\u0012\u000f\n\u000bACTION_NEXT\u0010\u0007\u0012\u000f\n\u000bACTION_PREV\u0010\u0008\u0012\u0016\n\u0012ACTION_AUDIO_START\u0010\t\u0012\u0015\n\u0011ACTION_AUDIO_STOP\u0010\n\u0012\u000f\n\u000bACTION_ZOOM\u0010\u000b\u0012\u0010\n\u000cACTION_TRANS\u0010\u000c\u0012\u0016\n\u0012ACTION_DRAW_CONFIG\u0010\r\u0012\u0017\n\u0013ACTION_RESET_MATRIX\u0010\u000eB\u001f\n\u000fcom.zykj.sketchB\u000cEzyDrawBoardb\u0006proto3"

    .line 4
    .line 5
    const-string v0, "\n\u000fDrawBoard.proto\u001a\u0019google/protobuf/any.proto\u001a\u001egoogle/protobuf/wrappers.proto\u001a\u0019SketchGraphSnapshot.proto\"I\n\tDrawBoard\u0012\u001d\n\tboardHead\u0018\u0001 \u0001(\u000b2\n.BoardHead\u0012\u001d\n\tboardBody\u0018\u0002 \u0001(\u000b2\n.BoardBody\"O\n\u000bDrawBoardV1\u0012\u001d\n\tboardHead\u0018\u0001 \u0001(\u000b2\n.BoardHead\u0012!\n\u000bboardBodyV1\u0018\u0002 \u0001(\u000b2\u000c.BoardBodyV1\"\u0081\u0001\n\tBoardHead\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0004 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0005 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0006 \u0001(\u0003\u0012\u000e\n\u0006author\u0018\u0007 \u0001(\t\u0012\u000c\n\u0004type\u0018\u0008 \u0001(\u0005\"2\n\tBoard"

    .line 6
    .line 7
    const-string v1, "Body\u0012%\n\rActionContent\u0018\u0001 \u0003(\u000b2\u000e.ActionContent\":\n\u000bBoardBodyV1\u0012+\n\rActionContent\u0018\u0001 \u0003(\u000b2\u0014.google.protobuf.Any\"\u0097\u0001\n\rActionContent\u0012\u0019\n\u0004type\u0018\u0001 \u0001(\u000e2\u000b.ActionEnum\u0012$\n\u0006action\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.Any\u0012!\n\rgraphSnapshot\u0018\u0003 \u0001(\u000b2\n.GraphData\u0012\"\n\tresetData\u0018\u0005 \u0001(\u000b2\u000f.GraphResetData\"\u00bc\u0003\n\u0010ActionTouchEvent\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007endTime\u0018\u0003 \u0001(\u0003\u00120\n\ntouchEvent\u0018\u0004 \u0003(\u000b2\u001c.ActionTouchEvent.TouchEvent\u001a\u00c3\u0002\n\nTouchEvent\u0012\u0011\n\teve"

    .line 8
    .line 9
    const-string v2, "ntTime\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0003 \u0001(\u0005\u0012\u0014\n\u000cpointerCount\u0018\u0004 \u0001(\u0005\u0012I\n\u0011pointerProperties\u0018\u0005 \u0003(\u000b2..ActionTouchEvent.TouchEvent.PointerProperties\u0012A\n\rpointerCoords\u0018\u0006 \u0003(\u000b2*.ActionTouchEvent.TouchEvent.PointerCoords\u0012\t\n\u0001x\u0018\u000f \u0001(\u0002\u0012\t\n\u0001y\u0018\u0010 \u0001(\u0002\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\u0008toolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002\"\u009e\u0001\n\u0011ActionImageConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\u000c\n\u0004path\u0018\u0003 \u0001(\t\u0012\r\n\u0005width\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0005"

    .line 10
    .line 11
    const-string v3, " \u0001(\u0005\u0012\u0011\n\tviewWidth\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nviewHeight\u0018\u0007 \u0001(\u0005\u0012\u0014\n\u000cpositionFlag\u0018\u0008 \u0001(\u0005\"\u008a\u0001\n\u0013ActionWebViewConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\u000c\n\u0004path\u0018\u0003 \u0001(\t\u0012\r\n\u0005width\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0005 \u0001(\u0005\u0012\u0011\n\tviewWidth\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nviewHeight\u0018\u0007 \u0001(\u0005\"\u0091\u0001\n\u0011ActionGraphConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012.\n\u0006config\u0018\u0004 \u0001(\u000b2\u001e.ActionGraphConfig.GraphConfig\u001a+\n\u000bGraphConfig\u0012\r\n\u0005width\u0018\u0001 \u0001(\u0002\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\"i\n\u0010ActionDrawConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTim"

    .line 12
    .line 13
    const-string v4, "e\u0018\u0002 \u0001(\u0003\u0012\u0017\n\u000fbackgroundColor\u0018\u0003 \u0001(\u0005\u0012\u001b\n\u0008drawArea\u0018\u0004 \u0001(\u000b2\t.DrawArea\"\\\n\u0008DrawArea\u0012\u001d\n\u000cleftTopPoint\u0018\u0001 \u0001(\u000b2\u0007.PointF\u0012!\n\u0010rightBottomPoint\u0018\u0002 \u0001(\u000b2\u0007.PointF\u0012\u000e\n\u0006matrix\u0018\u0003 \u0003(\u0002\"\u00ba\u0002\n\u0010ActionModeConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012$\n\u0004mode\u0018\u0004 \u0001(\u000e2\u0016.ActionModeConfig.Mode\"\u00de\u0001\n\u0004Mode\u0012\u0011\n\rACTION_SELECT\u0010\u0000\u0012\u0012\n\u000eACTION_WRITING\u0010\u0001\u0012\u0017\n\u0013ACTION_SHAPE_CIRCLE\u0010\u0002\u0012\u0015\n\u0011ACTION_SHAPE_RECT\u0010\u0003\u0012\u0016\n\u0012ACTION_ERASER_VIEW\u0010\u0005\u0012\u0019\n\u0015ACTION_ERASER_WRITING\u0010\u0006\u0012\u0011\n\rAC"

    .line 14
    .line 15
    const-string v5, "TION_DELETE\u0010\u0007\u0012\u0017\n\u0013ACTION_WRITING_MOVE\u0010\u0008\u0012 \n\u001cACTION_WRITING_MOVE_VERTICAL\u0010\t\"~\n\u0012ActionFitterConfig\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012\r\n\u0005scale\u0018\u0003 \u0001(\u0002\u0012\u000f\n\u0007centerX\u0018\u0004 \u0001(\u0005\u0012\u000f\n\u0007centerY\u0018\u0005 \u0001(\u0005\u0012\n\n\u0002px\u0018\u0006 \u0001(\u0005\u0012\n\n\u0002py\u0018\u0007 \u0001(\u0005\"3\n\u0010ActionClearBoard\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"3\n\u0010ActionPrevAction\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"3\n\u0010ActionNextAction\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\"}\n\nActionZoom\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime"

    .line 16
    .line 17
    const-string v6, "\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006scaleX\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006scaleY\u0018\u0004 \u0001(\u0002\u0012\u000f\n\u0007centerX\u0018\u0005 \u0001(\u0002\u0012\u000f\n\u0007centerY\u0018\u0006 \u0001(\u0002\u0012\u000c\n\u0004keep\u0018\u0007 \u0001(\u0008\"\u009c\u0001\n\u0011ActionTranslation\u0012\u000c\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0001(\u0003\u0012+\n\u0006transX\u0018\u0003 \u0001(\u000b2\u001b.google.protobuf.FloatValue\u0012+\n\u0006transY\u0018\u0004 \u0001(\u000b2\u001b.google.protobuf.FloatValue\u0012\u000c\n\u0004keep\u0018\u0005 \u0001(\u0008\"&\n\u0011ActionResetMatrix\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\"7\n\u0010AudioStartAction\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\u0008fileName\u0018\u0002 \u0001(\t\"6\n\u000fAudioStopAction\u0012\u0011\n\tstartTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\u0008fileName\u0018\u0002 \u0001(\t\"\u0087"

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lcom/zykj/sketch/EzyDrawBoard$1;

    .line 24
    .line 25
    invoke-direct {v1}, Lcom/zykj/sketch/EzyDrawBoard$1;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {}, Lcom/google/protobuf/WrappersProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    filled-new-array {v2, v3, v4}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v0, v2, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;Lcom/google/protobuf/Descriptors$FileDescriptor$InternalDescriptorAssigner;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 61
    .line 62
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoard_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 63
    .line 64
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 65
    .line 66
    const-string v3, "BoardBody"

    .line 67
    .line 68
    const-string v4, "BoardHead"

    .line 69
    .line 70
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoard_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 78
    .line 79
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v2, 0x1

    .line 88
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 93
    .line 94
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoardV1_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 95
    .line 96
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 97
    .line 98
    const-string v5, "BoardBodyV1"

    .line 99
    .line 100
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-direct {v3, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawBoardV1_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 108
    .line 109
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const/4 v3, 0x2

    .line 118
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 123
    .line 124
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardHead_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 125
    .line 126
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 127
    .line 128
    const-string v9, "Author"

    .line 129
    .line 130
    const-string v10, "Type"

    .line 131
    .line 132
    const-string v4, "Version"

    .line 133
    .line 134
    const-string v5, "Width"

    .line 135
    .line 136
    const-string v6, "Height"

    .line 137
    .line 138
    const-string v7, "CreateDate"

    .line 139
    .line 140
    const-string v8, "UpdateDate"

    .line 141
    .line 142
    filled-new-array/range {v4 .. v10}, [Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-direct {v3, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardHead_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 150
    .line 151
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const/4 v3, 0x3

    .line 160
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 165
    .line 166
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBody_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 167
    .line 168
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 169
    .line 170
    const-string v4, "ActionContent"

    .line 171
    .line 172
    filled-new-array {v4}, [Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-direct {v3, v0, v5}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBody_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 180
    .line 181
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const/4 v3, 0x4

    .line 190
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 195
    .line 196
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBodyV1_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 197
    .line 198
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 199
    .line 200
    filled-new-array {v4}, [Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-direct {v3, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_BoardBodyV1_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 208
    .line 209
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const/4 v3, 0x5

    .line 218
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 223
    .line 224
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionContent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 225
    .line 226
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 227
    .line 228
    const-string v4, "GraphSnapshot"

    .line 229
    .line 230
    const-string v5, "ResetData"

    .line 231
    .line 232
    const-string v6, "Type"

    .line 233
    .line 234
    const-string v7, "Action"

    .line 235
    .line 236
    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-direct {v3, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionContent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 244
    .line 245
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    const/4 v3, 0x6

    .line 254
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 259
    .line 260
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 261
    .line 262
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 263
    .line 264
    const-string v4, "EndTime"

    .line 265
    .line 266
    const-string v5, "TouchEvent"

    .line 267
    .line 268
    const-string v7, "StartTime"

    .line 269
    .line 270
    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-direct {v3, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 278
    .line 279
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 288
    .line 289
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 290
    .line 291
    new-instance v3, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 292
    .line 293
    const-string v13, "X"

    .line 294
    .line 295
    const-string v14, "Y"

    .line 296
    .line 297
    const-string v8, "EventTime"

    .line 298
    .line 299
    const-string v9, "Action"

    .line 300
    .line 301
    const-string v10, "PointerCount"

    .line 302
    .line 303
    const-string v11, "PointerProperties"

    .line 304
    .line 305
    const-string v12, "PointerCoords"

    .line 306
    .line 307
    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-direct {v3, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 315
    .line 316
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    check-cast v3, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 325
    .line 326
    sput-object v3, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerProperties_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 327
    .line 328
    new-instance v4, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 329
    .line 330
    const-string v5, "Id"

    .line 331
    .line 332
    const-string v8, "ToolType"

    .line 333
    .line 334
    filled-new-array {v5, v8}, [Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-direct {v4, v3, v5}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    sput-object v4, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerProperties_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 342
    .line 343
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 352
    .line 353
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerCoords_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 354
    .line 355
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 356
    .line 357
    const-string v3, "X"

    .line 358
    .line 359
    const-string v4, "Y"

    .line 360
    .line 361
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTouchEvent_TouchEvent_PointerCoords_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 369
    .line 370
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const/4 v2, 0x7

    .line 379
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 384
    .line 385
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionImageConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 386
    .line 387
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 388
    .line 389
    const-string v14, "ViewHeight"

    .line 390
    .line 391
    const-string v15, "PositionFlag"

    .line 392
    .line 393
    const-string v8, "Type"

    .line 394
    .line 395
    const-string v9, "StartTime"

    .line 396
    .line 397
    const-string v10, "Path"

    .line 398
    .line 399
    const-string v11, "Width"

    .line 400
    .line 401
    const-string v12, "Height"

    .line 402
    .line 403
    const-string v13, "ViewWidth"

    .line 404
    .line 405
    filled-new-array/range {v8 .. v15}, [Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionImageConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 413
    .line 414
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    const/16 v2, 0x8

    .line 423
    .line 424
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 429
    .line 430
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionWebViewConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 431
    .line 432
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 433
    .line 434
    const-string v13, "ViewWidth"

    .line 435
    .line 436
    const-string v14, "ViewHeight"

    .line 437
    .line 438
    const-string v8, "Type"

    .line 439
    .line 440
    const-string v9, "StartTime"

    .line 441
    .line 442
    const-string v10, "Path"

    .line 443
    .line 444
    const-string v11, "Width"

    .line 445
    .line 446
    const-string v12, "Height"

    .line 447
    .line 448
    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionWebViewConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 456
    .line 457
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    const/16 v2, 0x9

    .line 466
    .line 467
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 472
    .line 473
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 474
    .line 475
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 476
    .line 477
    const-string v3, "Config"

    .line 478
    .line 479
    filled-new-array {v6, v7, v3}, [Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 487
    .line 488
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 497
    .line 498
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_GraphConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 499
    .line 500
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 501
    .line 502
    const-string v3, "Width"

    .line 503
    .line 504
    const-string v4, "Color"

    .line 505
    .line 506
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionGraphConfig_GraphConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 514
    .line 515
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    const/16 v2, 0xa

    .line 524
    .line 525
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 530
    .line 531
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionDrawConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 532
    .line 533
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 534
    .line 535
    const-string v3, "BackgroundColor"

    .line 536
    .line 537
    const-string v4, "DrawArea"

    .line 538
    .line 539
    filled-new-array {v6, v7, v3, v4}, [Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionDrawConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 547
    .line 548
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    const/16 v2, 0xb

    .line 557
    .line 558
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 563
    .line 564
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawArea_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 565
    .line 566
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 567
    .line 568
    const-string v3, "RightBottomPoint"

    .line 569
    .line 570
    const-string v4, "Matrix"

    .line 571
    .line 572
    const-string v5, "LeftTopPoint"

    .line 573
    .line 574
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_DrawArea_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 582
    .line 583
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    const/16 v2, 0xc

    .line 592
    .line 593
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 598
    .line 599
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionModeConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 600
    .line 601
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 602
    .line 603
    const-string v3, "Mode"

    .line 604
    .line 605
    filled-new-array {v6, v7, v3}, [Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionModeConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 613
    .line 614
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    const/16 v2, 0xd

    .line 623
    .line 624
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 629
    .line 630
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionFitterConfig_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 631
    .line 632
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 633
    .line 634
    const-string v13, "Px"

    .line 635
    .line 636
    const-string v14, "Py"

    .line 637
    .line 638
    const-string v8, "Type"

    .line 639
    .line 640
    const-string v9, "StartTime"

    .line 641
    .line 642
    const-string v10, "Scale"

    .line 643
    .line 644
    const-string v11, "CenterX"

    .line 645
    .line 646
    const-string v12, "CenterY"

    .line 647
    .line 648
    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionFitterConfig_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 656
    .line 657
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    const/16 v2, 0xe

    .line 666
    .line 667
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 672
    .line 673
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionClearBoard_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 674
    .line 675
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 676
    .line 677
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionClearBoard_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 685
    .line 686
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    const/16 v2, 0xf

    .line 695
    .line 696
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 701
    .line 702
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionPrevAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 703
    .line 704
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 705
    .line 706
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionPrevAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 714
    .line 715
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    const/16 v2, 0x10

    .line 724
    .line 725
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 730
    .line 731
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionNextAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 732
    .line 733
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 734
    .line 735
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v3

    .line 739
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionNextAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 743
    .line 744
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    const/16 v2, 0x11

    .line 753
    .line 754
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 759
    .line 760
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionZoom_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 761
    .line 762
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 763
    .line 764
    const-string v13, "CenterY"

    .line 765
    .line 766
    const-string v14, "Keep"

    .line 767
    .line 768
    const-string v8, "Type"

    .line 769
    .line 770
    const-string v9, "StartTime"

    .line 771
    .line 772
    const-string v10, "ScaleX"

    .line 773
    .line 774
    const-string v11, "ScaleY"

    .line 775
    .line 776
    const-string v12, "CenterX"

    .line 777
    .line 778
    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionZoom_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 786
    .line 787
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    const/16 v2, 0x12

    .line 796
    .line 797
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 802
    .line 803
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTranslation_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 804
    .line 805
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 806
    .line 807
    const-string v3, "TransY"

    .line 808
    .line 809
    const-string v4, "Keep"

    .line 810
    .line 811
    const-string v5, "TransX"

    .line 812
    .line 813
    filled-new-array {v6, v7, v5, v3, v4}, [Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v3

    .line 817
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionTranslation_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 821
    .line 822
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    const/16 v2, 0x13

    .line 831
    .line 832
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 837
    .line 838
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionResetMatrix_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 839
    .line 840
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 841
    .line 842
    filled-new-array {v7}, [Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_ActionResetMatrix_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 850
    .line 851
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    const/16 v2, 0x14

    .line 860
    .line 861
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 866
    .line 867
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStartAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 868
    .line 869
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 870
    .line 871
    const-string v3, "FileName"

    .line 872
    .line 873
    filled-new-array {v7, v3}, [Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v4

    .line 877
    invoke-direct {v2, v0, v4}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStartAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 881
    .line 882
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    const/16 v2, 0x15

    .line 891
    .line 892
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 897
    .line 898
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStopAction_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 899
    .line 900
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 901
    .line 902
    filled-new-array {v7, v3}, [Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_AudioStopAction_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 910
    .line 911
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    const/16 v2, 0x16

    .line 920
    .line 921
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 926
    .line 927
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 928
    .line 929
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 930
    .line 931
    const-string v8, "BackgroundColor"

    .line 932
    .line 933
    const-string v9, "DrawArea"

    .line 934
    .line 935
    const-string v3, "FactoryGraphName"

    .line 936
    .line 937
    const-string v4, "FactoryActionGraphName"

    .line 938
    .line 939
    const-string v5, "Action"

    .line 940
    .line 941
    const-string v6, "GraphConfig"

    .line 942
    .line 943
    const-string v7, "ModeConfig"

    .line 944
    .line 945
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    sput-object v2, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 953
    .line 954
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 963
    .line 964
    sput-object v0, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_ActionFactory_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 965
    .line 966
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 967
    .line 968
    const-string v2, "FactoryGraphName"

    .line 969
    .line 970
    const-string v3, "FactoryActionGraphName"

    .line 971
    .line 972
    const-string v4, "BaseAction"

    .line 973
    .line 974
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    sput-object v1, Lcom/zykj/sketch/EzyDrawBoard;->internal_static_GraphResetData_ActionFactory_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 982
    .line 983
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 984
    .line 985
    .line 986
    invoke-static {}, Lcom/google/protobuf/WrappersProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 987
    .line 988
    .line 989
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 990
    .line 991
    .line 992
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
