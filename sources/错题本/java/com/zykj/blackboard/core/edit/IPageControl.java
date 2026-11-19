package com.zykj.blackboard.core.edit;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.blackboard.listener.GraphDeleteListener;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.IGeometrySelectListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.MicroPhoneListener;
import com.zykj.blackboard.listener.RecordListener;
import com.zykj.blackboard.listener.WithdrawListener;
import com.zykj.board.EzyPositionEnum$PositionEnum;
import com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\u0010JE\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0015J3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020'H&¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\bH&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\bH&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001bH&¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u001b2\u0006\u0010#\u001a\u000202H&¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH&¢\u0006\u0004\b5\u0010,J\u000f\u0010-\u001a\u00020\u001bH&¢\u0006\u0004\b-\u00101J\u000f\u00106\u001a\u00020\u001bH&¢\u0006\u0004\b6\u00101J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H&¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\n2\u0006\u0010A\u001a\u00020@H&¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010DH&¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010GH&¢\u0006\u0004\bH\u0010IJ2\u0010M\u001a\u00020\u001b2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0JH&¢\u0006\u0004\bM\u0010NJ\u0011\u0010O\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\bO\u0010PJ[\u0010Z\u001a\u0004\u0018\u00010\r2\u0006\u0010Q\u001a\u0002072\u0006\u0010R\u001a\u0002072\u0006\u0010S\u001a\u0002072\u0006\u0010T\u001a\u0002072\b\b\u0002\u0010U\u001a\u00020\b2\b\b\u0002\u0010V\u001a\u00020\b2\b\b\u0002\u0010W\u001a\u00020\b2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010XH&¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001bH&¢\u0006\u0004\b\\\u00101J\u000f\u0010]\u001a\u00020\u001bH&¢\u0006\u0004\b]\u00101J\u000f\u0010^\u001a\u00020\bH&¢\u0006\u0004\b^\u0010,J'\u0010b\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020;2\u0006\u0010`\u001a\u00020;2\u0006\u0010a\u001a\u00020;H&¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020;H&¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020@H&¢\u0006\u0004\bf\u0010gJ#\u0010j\u001a\u00020\u001b2\b\u0010h\u001a\u0004\u0018\u00010;2\b\u0010i\u001a\u0004\u0018\u00010;H&¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u001b2\u0006\u0010l\u001a\u000207H&¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u000207H&¢\u0006\u0004\bo\u0010pJ\u001f\u0010s\u001a\u00020\u001b2\u0006\u0010l\u001a\u0002072\u0006\u0010r\u001a\u00020qH&¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020qH&¢\u0006\u0004\bu\u0010vJ\u001b\u0010w\u001a\u00020\u001b2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010XH&¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020\u001b2\u0006\u0010z\u001a\u00020yH&¢\u0006\u0004\b{\u0010|J\u0019\u0010~\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010}H&¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u001bH&¢\u0006\u0005\b\u0080\u0001\u00101J+\u0010\u0083\u0001\u001a\u00020\u001b2\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010;2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010;H&¢\u0006\u0005\b\u0083\u0001\u0010kJ+\u0010\u0084\u0001\u001a\u00020\u001b2\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010;2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010;H&¢\u0006\u0005\b\u0084\u0001\u0010kJ\u0011\u0010\u0085\u0001\u001a\u00020;H&¢\u0006\u0005\b\u0085\u0001\u0010eJ\u0011\u0010\u0086\u0001\u001a\u00020;H&¢\u0006\u0005\b\u0086\u0001\u0010eJ\u001b\u0010\u0088\u0001\u001a\u00020\u001b2\u0007\u0010#\u001a\u00030\u0087\u0001H&¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\u001b2\u0007\u0010#\u001a\u00030\u0087\u0001H&¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J\u0011\u0010\u008b\u0001\u001a\u000207H&¢\u0006\u0005\b\u008b\u0001\u0010pJ\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010XH&¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020\bH&¢\u0006\u0005\b\u008e\u0001\u0010,J\u0011\u0010\u008f\u0001\u001a\u000207H&¢\u0006\u0005\b\u008f\u0001\u0010pJ\u0018\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H&¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0018\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H&¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\bH&¢\u0006\u0005\b\u0093\u0001\u0010,J\u0011\u0010\u0094\u0001\u001a\u00020\bH&¢\u0006\u0005\b\u0094\u0001\u0010,J\u0011\u0010\u0095\u0001\u001a\u00020\u001bH&¢\u0006\u0005\b\u0095\u0001\u00101J\u0011\u0010\u0096\u0001\u001a\u00020\u001bH&¢\u0006\u0005\b\u0096\u0001\u00101J\u001b\u0010\u0098\u0001\u001a\u00020\u001b2\u0007\u0010#\u001a\u00030\u0097\u0001H&¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u001b2\u0007\u0010#\u001a\u00030\u0097\u0001H&¢\u0006\u0006\b\u009a\u0001\u0010\u0099\u0001J1\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\t\b\u0002\u0010\u009c\u0001\u001a\u000207H&¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J!\u0010¡\u0001\u001a\u00020\u001b2\r\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H&¢\u0006\u0006\b¡\u0001\u0010¢\u0001¨\u0006£\u0001"}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/IPageControl;", "", "", "path", "Lcom/zykj/board/EzyPositionEnum$PositionEnum;", RequestParameters.POSITION, "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;", "scaleType", "", "loadWithCameraMatrix", "Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "addImage", "(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "Landroid/graphics/Bitmap;", "bitmap", "isRecycle", "(Landroid/graphics/Bitmap;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "filename", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "addSpecialImage", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "(Landroid/graphics/Bitmap;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "", "pathList", "addImageList", "(Ljava/util/List;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)Ljava/util/List;", "graphId", "Ld6/s;", "selectedGraph", "(Ljava/lang/String;)V", "Lcom/zykj/blackboard/listener/RecordListener;", "recordListener", "setRecordListener", "(Lcom/zykj/blackboard/listener/RecordListener;)V", "Lcom/zykj/blackboard/listener/EventListener;", "listener", "addEventListener", "(Lcom/zykj/blackboard/listener/EventListener;)V", "removeEventListener", "Lcom/zykj/blackboard/core/edit/RenderChangeListener;", "addRenderRectChangeListener", "(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V", "removeRenderRectChangeListener", "isRecording", "()Z", "turnOnMicro", "startRecord", "(Z)V", "stopRecord", "()V", "Lcom/zykj/blackboard/listener/MicroPhoneListener;", "setMicroPhoneListener", "(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V", "isMicroTurnOn", "turnOffMicro", "", TypedValues.Custom.S_COLOR, "changeTextColor", "(I)Z", "", "size", "changeTextSize", "(F)Z", "graph", "Landroid/graphics/RectF;", "newRectF", "changeImageOriginRect", "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Landroid/graphics/RectF;)V", "Lcom/zykj/blackboard/listener/ITextSelectListener;", "setTextSelectListener", "(Lcom/zykj/blackboard/listener/ITextSelectListener;)V", "Lcom/zykj/blackboard/listener/IGeometrySelectListener;", "setGeometrySelectListener", "(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "setGeometryCreateListener", "(Lr6/c;)V", "screenshot", "()Landroid/graphics/Bitmap;", "horizontalOffset", "verticalOffset", "minWidth", "minHeight", "isBoardAsWidth", "isContainLimit", "isBoardAsTop", "Lcom/zykj/blackboard/core/graph/IGraph;", "interruptGraph", "minScreenshot", "(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;", "save", "saveWithContentThumbnail", "canSave", "pointX", "pointY", "scaleNum", "zoomLevel", "(FFF)V", "getZoomLevel", "()F", "getRenderRect", "()Landroid/graphics/RectF;", "progressWidth", "progressHeight", "setVisibleAreaProgress", "(Ljava/lang/Float;Ljava/lang/Float;)V", "backgroundColor", "setBackgroundColor", "(I)V", "getBackgroundColor", "()I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "setBackgroundColorWithLineConfig", "(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "cleanPage", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "Landroid/view/MotionEvent;", "motionEvent", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "setAreaMoveListener", "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V", "areaMoveStart", "horizontalProgress", "verticalProgress", "areaMoving", "areaMoveEnd", "getMoveVerticalProgress", "getMoveHorizontalProgress", "Lcom/zykj/blackboard/listener/GraphDeleteListener;", "addGraphDeleteListener", "(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V", "removeGraphDeleteListener", "getImageGraphCount", "getFirstGraph", "()Lcom/zykj/blackboard/core/graph/IGraph;", "isPageNotEmpty", "getGroupGraphSize", "getPageImagePathList", "()Ljava/util/List;", "getNoRecordImagePathList", "withdraw", "recover", "clearHistoryList", "clearHistoryListWithoutCurrent", "Lcom/zykj/blackboard/listener/WithdrawListener;", "addWithdrawListener", "(Lcom/zykj/blackboard/listener/WithdrawListener;)V", "removeWithdrawListener", "content", TypedValues.CycleType.S_WAVE_OFFSET, "Lcom/zykj/blackboard/core/graph/group/TextGraph;", "addText", "(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lcom/zykj/blackboard/core/graph/group/TextGraph;", "graphIdList", "newSelectGraph", "(Ljava/util/List;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IPageControl {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ ImageGraph addImage$default(IPageControl iPageControl, String str, EzyPositionEnum$PositionEnum ezyPositionEnum$PositionEnum, EzyScaleTypeEnum$ScaleTypeEnum ezyScaleTypeEnum$ScaleTypeEnum, boolean z8, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i & 8) != 0) {
                z8 = false;
            }
            return iPageControl.addImage(str, ezyPositionEnum$PositionEnum, ezyScaleTypeEnum$ScaleTypeEnum, z8);
        }

        public static /* synthetic */ TextGraph addText$default(IPageControl iPageControl, String str, EzyPositionEnum$PositionEnum ezyPositionEnum$PositionEnum, int i, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addText");
            }
            if ((i8 & 4) != 0) {
                i = 0;
            }
            return iPageControl.addText(str, ezyPositionEnum$PositionEnum, i);
        }

        public static /* synthetic */ void areaMoveEnd$default(IPageControl iPageControl, Float f, Float f7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i & 1) != 0) {
                f = null;
            }
            if ((i & 2) != 0) {
                f7 = null;
            }
            iPageControl.areaMoveEnd(f, f7);
        }

        public static /* synthetic */ void areaMoving$default(IPageControl iPageControl, Float f, Float f7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoving");
            }
            if ((i & 1) != 0) {
                f = null;
            }
            if ((i & 2) != 0) {
                f7 = null;
            }
            iPageControl.areaMoving(f, f7);
        }

        public static /* synthetic */ void cleanPage$default(IPageControl iPageControl, IGraph iGraph, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cleanPage");
            }
            if ((i & 1) != 0) {
                iGraph = null;
            }
            iPageControl.cleanPage(iGraph);
        }

        public static /* synthetic */ Bitmap minScreenshot$default(IPageControl iPageControl, int i, int i8, int i9, int i10, boolean z8, boolean z9, boolean z10, IGraph iGraph, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minScreenshot");
            }
            if ((i11 & 16) != 0) {
                z8 = false;
            }
            if ((i11 & 32) != 0) {
                z9 = false;
            }
            if ((i11 & 64) != 0) {
                z10 = false;
            }
            if ((i11 & 128) != 0) {
                iGraph = null;
            }
            return iPageControl.minScreenshot(i, i8, i9, i10, z8, z9, z10, iGraph);
        }

        public static /* synthetic */ ImageGraph addImage$default(IPageControl iPageControl, Bitmap bitmap, EzyPositionEnum$PositionEnum ezyPositionEnum$PositionEnum, EzyScaleTypeEnum$ScaleTypeEnum ezyScaleTypeEnum$ScaleTypeEnum, boolean z8, boolean z9, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i & 8) != 0) {
                z8 = false;
            }
            boolean z10 = z8;
            if ((i & 16) != 0) {
                z9 = true;
            }
            return iPageControl.addImage(bitmap, ezyPositionEnum$PositionEnum, ezyScaleTypeEnum$ScaleTypeEnum, z10, z9);
        }

        public static /* synthetic */ ImageGraph addImage$default(IPageControl iPageControl, Bitmap bitmap, String str, EzyPositionEnum$PositionEnum ezyPositionEnum$PositionEnum, EzyScaleTypeEnum$ScaleTypeEnum ezyScaleTypeEnum$ScaleTypeEnum, boolean z8, boolean z9, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i & 16) != 0) {
                z8 = false;
            }
            boolean z10 = z8;
            if ((i & 32) != 0) {
                z9 = true;
            }
            return iPageControl.addImage(bitmap, str, ezyPositionEnum$PositionEnum, ezyScaleTypeEnum$ScaleTypeEnum, z10, z9);
        }
    }

    void addEventListener(@NotNull EventListener listener);

    void addGraphDeleteListener(@NotNull GraphDeleteListener listener);

    @Nullable
    ImageGraph addImage(@NotNull Bitmap bitmap, @NotNull EzyPositionEnum$PositionEnum position, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType, boolean loadWithCameraMatrix, boolean isRecycle);

    @Nullable
    ImageGraph addImage(@NotNull Bitmap bitmap, @NotNull String filename, @NotNull EzyPositionEnum$PositionEnum position, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType, boolean loadWithCameraMatrix, boolean isRecycle);

    @Nullable
    ImageGraph addImage(@NotNull String path, @NotNull EzyPositionEnum$PositionEnum position, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType, boolean loadWithCameraMatrix);

    @NotNull
    List<ImageGraph> addImageList(@NotNull List<String> pathList, @NotNull EzyPositionEnum$PositionEnum position, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType);

    void addRenderRectChangeListener(@NotNull RenderChangeListener listener);

    @Nullable
    ImageGraph addSpecialImage(@NotNull Bitmap bitmap);

    @Nullable
    ImageGraph addSpecialImage(@NotNull String path);

    @Nullable
    TextGraph addText(@NotNull String content, @NotNull EzyPositionEnum$PositionEnum position, int offset);

    void addWithdrawListener(@NotNull WithdrawListener listener);

    void areaMoveEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress);

    void areaMoveStart();

    void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress);

    boolean canSave();

    void changeImageOriginRect(@NotNull ImageGraph graph, @NotNull RectF newRectF);

    boolean changeTextColor(int color);

    boolean changeTextSize(float size);

    void cleanPage(@Nullable IGraph interruptGraph);

    void clearHistoryList();

    void clearHistoryListWithoutCurrent();

    int getBackgroundColor();

    @NotNull
    BackgroundLineConfig getBackgroundLineConfig();

    @Nullable
    IGraph getFirstGraph();

    int getGroupGraphSize();

    int getImageGraphCount();

    float getMoveHorizontalProgress();

    float getMoveVerticalProgress();

    @NotNull
    List<String> getNoRecordImagePathList();

    @NotNull
    List<String> getPageImagePathList();

    @NotNull
    RectF getRenderRect();

    float getZoomLevel();

    boolean isMicroTurnOn();

    boolean isPageNotEmpty();

    boolean isRecording();

    @Nullable
    Bitmap minScreenshot(int horizontalOffset, int verticalOffset, int minWidth, int minHeight, boolean isBoardAsWidth, boolean isContainLimit, boolean isBoardAsTop, @Nullable IGraph interruptGraph);

    void newSelectGraph(@NotNull List<String> graphIdList);

    void onTouchEvent(@NotNull MotionEvent motionEvent);

    boolean recover();

    void removeEventListener(@NotNull EventListener listener);

    void removeGraphDeleteListener(@NotNull GraphDeleteListener listener);

    void removeRenderRectChangeListener(@NotNull RenderChangeListener listener);

    void removeWithdrawListener(@NotNull WithdrawListener listener);

    void save();

    void saveWithContentThumbnail();

    @Nullable
    Bitmap screenshot();

    void selectedGraph(@NotNull String graphId);

    void setAreaMoveListener(@Nullable IAreaMoveListener listener);

    void setBackgroundColor(int backgroundColor);

    void setBackgroundColorWithLineConfig(int backgroundColor, @NotNull BackgroundLineConfig backgroundLineConfig);

    void setGeometryCreateListener(@NotNull InterfaceC6471c listener);

    void setGeometrySelectListener(@Nullable IGeometrySelectListener listener);

    void setMicroPhoneListener(@NotNull MicroPhoneListener listener);

    void setRecordListener(@NotNull RecordListener recordListener);

    void setTextSelectListener(@Nullable ITextSelectListener listener);

    void setVisibleAreaProgress(@Nullable Float progressWidth, @Nullable Float progressHeight);

    void startRecord(boolean turnOnMicro);

    void stopRecord();

    void turnOffMicro();

    void turnOnMicro();

    boolean withdraw();

    void zoomLevel(float pointX, float pointY, float scaleNum);
}
