package com.zykj.blackboard.core.canvas.control;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionBackgroundRectF;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.core.edit.RenderChangeListener;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010!\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b+\u0010\rJ\u000f\u0010,\u001a\u00020\nH&¢\u0006\u0004\b,\u0010\u000fJ\u0017\u0010-\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b-\u0010\u0013J\u000f\u0010.\u001a\u00020\u0010H&¢\u0006\u0004\b.\u0010\u0015J\u0011\u00100\u001a\u0004\u0018\u00010/H&¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H&¢\u0006\u0004\b3\u00104J\u0011\u00105\u001a\u0004\u0018\u000102H&¢\u0006\u0004\b5\u00104J[\u0010?\u001a\u0004\u0018\u0001022\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\n2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b?\u0010@J9\u0010D\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020:H&¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0007H&¢\u0006\u0004\bF\u0010GJ\u001d\u0010J\u001a\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020 0HH&¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010I\u001a\b\u0012\u0004\u0012\u00020 0HH&¢\u0006\u0004\bL\u0010MJ\u001d\u0010O\u001a\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020 0NH&¢\u0006\u0004\bO\u0010KJ%\u0010P\u001a\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020 0N2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\bP\u0010QJ'\u0010R\u001a\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020 0N2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020\u0007H&¢\u0006\u0004\bS\u0010GJ\u0017\u0010T\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\bT\u0010UJ\u001b\u0010V\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\bV\u0010UJ\u000f\u0010W\u001a\u00020\u0007H&¢\u0006\u0004\bW\u0010GJ\u0017\u0010Y\u001a\u00020\u00072\u0006\u0010!\u001a\u00020XH&¢\u0006\u0004\bY\u0010ZJ+\u0010]\u001a\u00020\u00072\u0006\u0010!\u001a\u00020X2\b\u0010[\u001a\u0004\u0018\u00010\u00022\b\u0010\\\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b]\u0010^J+\u0010_\u001a\u00020\u00072\u0006\u0010!\u001a\u00020X2\b\u0010[\u001a\u0004\u0018\u00010\u00022\b\u0010\\\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b_\u0010^J\u001f\u0010`\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0007H&¢\u0006\u0004\bb\u0010GJ\u000f\u0010c\u001a\u00020\u0007H&¢\u0006\u0004\bc\u0010GJ\u000f\u0010d\u001a\u00020\u0007H&¢\u0006\u0004\bd\u0010GJ\u000f\u0010e\u001a\u00020\u0007H&¢\u0006\u0004\be\u0010GJ\u000f\u0010f\u001a\u00020\u0007H&¢\u0006\u0004\bf\u0010GJ\u0017\u0010g\u001a\u00020\u00072\u0006\u0010)\u001a\u00020 H&¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00072\u0006\u0010i\u001a\u00020:H&¢\u0006\u0004\bi\u0010jJ\u000f\u0010i\u001a\u00020:H&¢\u0006\u0004\bi\u0010kJ\u001f\u0010m\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u0002H&¢\u0006\u0004\bo\u0010\u0004J\u0017\u0010r\u001a\u00020\u00072\u0006\u0010q\u001a\u00020pH&¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00072\u0006\u0010q\u001a\u00020pH&¢\u0006\u0004\bt\u0010sJ\u001d\u0010u\u001a\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020 0NH&¢\u0006\u0004\bu\u0010KJ/\u0010x\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u001e2\u0006\u0010v\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010w\u001a\u00020\u0002H&¢\u0006\u0004\bx\u0010yJ/\u0010|\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u001e2\u0006\u0010w\u001a\u00020\u00022\u0006\u0010z\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001eH&¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u00020\nH&¢\u0006\u0004\b~\u0010\u000fJ5\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020A2\u0007\u0010\u0080\u0001\u001a\u00020A2\u0007\u0010\u0081\u0001\u001a\u00020A2\u0007\u0010\u0082\u0001\u001a\u00020AH&¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J^\u0010\u008f\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020\u00022\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010N2\f\b\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H&¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001Jh\u0010\u0093\u0001\u001a\u00020\u00072\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020\u00022\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010N2\f\b\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H&¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001Jh\u0010\u0095\u0001\u001a\u00020\u00072\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020\u00022\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010N2\f\b\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H&¢\u0006\u0006\b\u0095\u0001\u0010\u0094\u0001J^\u0010\u0096\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020\u00022\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010N2\f\b\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H&¢\u0006\u0006\b\u0096\u0001\u0010\u0090\u0001¨\u0006\u0097\u0001"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "", "Landroid/graphics/RectF;", "getPageRectF", "()Landroid/graphics/RectF;", "getOldPageRectF", "rectF", "Ld6/s;", "setOldPageRectF", "(Landroid/graphics/RectF;)V", "", TypedValues.Custom.S_COLOR, "setDefaultBackgroundColor", "(I)V", "getDefaultBackgroundColor", "()I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "setDefaultBackgroundLineConfig", "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getDefaultBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Matrix;", "matrix", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V", "", "parentId", "Lcom/zykj/blackboard/core/graph/IGraph;", "graph", "addGraph", "(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V", "Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "addImageGraph", "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V", "rootGraphId", "()Ljava/lang/String;", "rootGraph", "()Lcom/zykj/blackboard/core/graph/IGraph;", "updateBackgroundColor", "getBackgroundColor", "updateBackgroundLineConfig", "getBackgroundLineConfig", "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;", "snapshot", "()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;", "Landroid/graphics/Bitmap;", "screenshot", "()Landroid/graphics/Bitmap;", "contentThumbnail", "horizontalOffset", "verticalOffset", "minWidth", "minHeight", "", "isBoardAsWidth", "isContainLimit", "isBoardAsTop", "interruptGraph", "minScreenShot", "(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;", "", "iconWidth", "isSelectAction", "select", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V", "selectCancel", "()V", "", "graphList", RequestParameters.SUBRESOURCE_DELETE, "(Ljava/util/List;)V", "renderRectF", "(Landroid/graphics/RectF;Ljava/util/List;)V", "", "translationStart", "translation", "(Ljava/util/List;Landroid/graphics/Matrix;)V", "translationEnd", "cameraChangeStart", "cameraChanging", "(Landroid/graphics/Matrix;)V", "cameraChangeEnd", "resetCamera", "Lcom/zykj/blackboard/core/graph/group/TextGraph;", "textHandleStart", "(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V", "selectedRectF", "selectedRectFMatrix", "textHandle", "(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V", "textHandleEnd", "concatMatrix", "(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V", "release", "refresh", "reDrawFixView", "updateBackgroundMatrix", "reset", "init", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "isDraw", "(Z)V", "()Z", "graphId", "setGraphMatrix", "(Ljava/lang/String;Landroid/graphics/Matrix;)V", "getRenderRectF", "Lcom/zykj/blackboard/core/edit/RenderChangeListener;", "listener", "registerRenderRectFChangeListener", "(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V", "unRegisterRenderRectFChangeListener", "drawGraphInActive", "content", "originRectF", "changeTextGraph", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V", "renderMatrix", "filePath", "changeImageGraph", "(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V", "getImageGraphCount", "l", "t", "r", "b", "newSelecting", "(FFFF)V", "selectRectF", "selectFunctionRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "functionRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "functionBackgroundRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "typeList", "Landroid/graphics/PointF;", "pointF", "newSelect", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "Lcom/zykj/blackboard/core/graph/group/GroupGraph;", "groupGraph", "newChangeHandleStart", "(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "newChangeHandling", "newChangeHandleEnd", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IGraphControl {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void cameraChangeEnd$default(IGraphControl iGraphControl, Matrix matrix, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cameraChangeEnd");
            }
            if ((i & 1) != 0) {
                matrix = null;
            }
            iGraphControl.cameraChangeEnd(matrix);
        }

        public static /* synthetic */ Bitmap minScreenShot$default(IGraphControl iGraphControl, int i, int i8, int i9, int i10, boolean z8, boolean z9, boolean z10, IGraph iGraph, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minScreenShot");
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
            return iGraphControl.minScreenShot(i, i8, i9, i10, z8, z9, z10, iGraph);
        }

        public static /* synthetic */ void newChangeHandleEnd$default(IGraphControl iGraphControl, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, FunctionBackgroundRectF functionBackgroundRectF, List list, PointF pointF, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleEnd");
            }
            iGraphControl.newChangeHandleEnd(rectF, matrix, rectF2, functionRectF, functionBackgroundRectF, list, (i & 64) != 0 ? null : pointF);
        }

        public static /* synthetic */ void newChangeHandleStart$default(IGraphControl iGraphControl, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, FunctionBackgroundRectF functionBackgroundRectF, List list, PointF pointF, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleStart");
            }
            iGraphControl.newChangeHandleStart(groupGraph, rectF, matrix, rectF2, functionRectF, functionBackgroundRectF, list, (i & 128) != 0 ? null : pointF);
        }

        public static /* synthetic */ void newChangeHandling$default(IGraphControl iGraphControl, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, FunctionBackgroundRectF functionBackgroundRectF, List list, PointF pointF, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandling");
            }
            iGraphControl.newChangeHandling(groupGraph, rectF, matrix, rectF2, functionRectF, functionBackgroundRectF, list, (i & 128) != 0 ? null : pointF);
        }

        public static /* synthetic */ void newSelect$default(IGraphControl iGraphControl, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, FunctionBackgroundRectF functionBackgroundRectF, List list, PointF pointF, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newSelect");
            }
            iGraphControl.newSelect(rectF, matrix, rectF2, functionRectF, functionBackgroundRectF, list, (i & 64) != 0 ? null : pointF);
        }
    }

    void addGraph(@Nullable String parentId, @NotNull IGraph graph);

    void addImageGraph(@NotNull ImageGraph graph);

    void cameraChangeEnd(@Nullable Matrix matrix);

    void cameraChangeStart();

    void cameraChanging(@NotNull Matrix matrix);

    void changeImageGraph(@NotNull String graphId, @NotNull RectF originRectF, @NotNull Matrix renderMatrix, @NotNull String filePath);

    void changeTextGraph(@NotNull String graphId, @NotNull String content, @NotNull Paint paint, @NotNull RectF originRectF);

    void concatMatrix(@NotNull IGraph graph, @NotNull Matrix matrix);

    @Nullable
    Bitmap contentThumbnail();

    void delete(@NotNull List<IGraph> graphList);

    void drawGraphInActive(@NotNull List<? extends IGraph> graphList);

    void drawPath(@NotNull Path path, @NotNull Paint paint, @Nullable Matrix matrix);

    int getBackgroundColor();

    @NotNull
    BackgroundLineConfig getBackgroundLineConfig();

    int getDefaultBackgroundColor();

    @NotNull
    BackgroundLineConfig getDefaultBackgroundLineConfig();

    int getImageGraphCount();

    @NotNull
    RectF getOldPageRectF();

    @NotNull
    RectF getPageRectF();

    @NotNull
    RectF getRenderRectF();

    void init(@NotNull IGraph rootGraph);

    void isDraw(boolean isDraw);

    boolean isDraw();

    @Nullable
    Bitmap minScreenShot(int horizontalOffset, int verticalOffset, int minWidth, int minHeight, boolean isBoardAsWidth, boolean isContainLimit, boolean isBoardAsTop, @Nullable IGraph interruptGraph);

    void newChangeHandleEnd(@NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF);

    void newChangeHandleStart(@NotNull GroupGraph groupGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF);

    void newChangeHandling(@NotNull GroupGraph groupGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF);

    void newSelect(@NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF);

    void newSelecting(float l, float t8, float r, float b6);

    void reDrawFixView();

    void refresh();

    void registerRenderRectFChangeListener(@NotNull RenderChangeListener listener);

    void release();

    void renderRectF(@NotNull RectF rectF, @NotNull List<IGraph> graphList);

    void reset();

    void resetCamera();

    @Nullable
    IGraph rootGraph();

    @Nullable
    String rootGraphId();

    @Nullable
    Bitmap screenshot();

    void select(@NotNull RectF rectF, @NotNull Matrix matrix, @Nullable Paint paint, float iconWidth, boolean isSelectAction);

    void selectCancel();

    void setDefaultBackgroundColor(int color);

    void setDefaultBackgroundLineConfig(@NotNull BackgroundLineConfig backgroundLineConfig);

    void setGraphMatrix(@NotNull String graphId, @NotNull Matrix matrix);

    void setOldPageRectF(@NotNull RectF rectF);

    @Nullable
    EzyPageSnapshot$PageSnapshot.GraphSnapshot snapshot();

    void textHandle(@NotNull TextGraph graph, @Nullable RectF selectedRectF, @Nullable Matrix selectedRectFMatrix);

    void textHandleEnd(@NotNull TextGraph graph, @Nullable RectF selectedRectF, @Nullable Matrix selectedRectFMatrix);

    void textHandleStart(@NotNull TextGraph graph);

    void translation(@NotNull List<? extends IGraph> graphList, @NotNull Matrix matrix);

    void translationEnd(@NotNull List<? extends IGraph> graphList, @Nullable Matrix matrix);

    void translationStart(@NotNull List<? extends IGraph> graphList);

    void unRegisterRenderRectFChangeListener(@NotNull RenderChangeListener listener);

    void updateBackgroundColor(int color);

    void updateBackgroundLineConfig(@NotNull BackgroundLineConfig backgroundLineConfig);

    void updateBackgroundMatrix();
}
