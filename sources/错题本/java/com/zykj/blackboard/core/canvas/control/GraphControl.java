package com.zykj.blackboard.core.canvas.control;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectGraphControl;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionBackgroundRectF;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.edit.RenderChangeListener;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.RectBoardUtils;
import com.zykj.board.C4361d0;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J9\u00103\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\u000f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(07H\u0016¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(07H\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\u00020\u000f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(0=H\u0016¢\u0006\u0004\b>\u0010:J%\u0010?\u001a\u00020\u000f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(0=2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b?\u0010@J'\u0010A\u001a\u00020\u000f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(0=2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\bA\u0010@J\u000f\u0010B\u001a\u00020\u000fH\u0016¢\u0006\u0004\bB\u00106J\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u000fH\u0016¢\u0006\u0004\bF\u00106J\u0017\u0010H\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ+\u0010L\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010\n2\b\u0010K\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\bL\u0010MJ+\u0010N\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010\n2\b\u0010K\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\bN\u0010MJ\u001f\u0010O\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000fH\u0016¢\u0006\u0004\bQ\u00106J\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020(H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u000f2\u0006\u0010U\u001a\u000201H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010U\u001a\u000201H\u0016¢\u0006\u0004\bU\u0010WJ\u001f\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020&2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\nH\u0016¢\u0006\u0004\b[\u0010\fJ\u0017\u0010^\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b`\u0010_J\u000f\u0010a\u001a\u00020\u000fH\u0016¢\u0006\u0004\ba\u00106J\u000f\u0010b\u001a\u00020\u000fH\u0016¢\u0006\u0004\bb\u00106J\u000f\u0010c\u001a\u00020\u000fH\u0016¢\u0006\u0004\bc\u00106J\u0011\u0010d\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bd\u0010eJ\u0011\u0010R\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\bR\u0010fJ\u0017\u0010g\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\bg\u0010\u0015J\u000f\u0010h\u001a\u00020\u0012H\u0016¢\u0006\u0004\bh\u0010\u0017J\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bi\u0010\u001bJ\u000f\u0010j\u001a\u00020\u0018H\u0016¢\u0006\u0004\bj\u0010\u001dJ\u000f\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\bk\u00106J\u0011\u0010m\u001a\u0004\u0018\u00010lH\u0016¢\u0006\u0004\bm\u0010nJ\u0011\u0010p\u001a\u0004\u0018\u00010oH\u0016¢\u0006\u0004\bp\u0010qJ\u0011\u0010r\u001a\u0004\u0018\u00010oH\u0016¢\u0006\u0004\br\u0010qJS\u0010{\u001a\u0004\u0018\u00010o2\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u00122\u0006\u0010v\u001a\u00020\u00122\u0006\u0010w\u001a\u0002012\u0006\u0010x\u001a\u0002012\u0006\u0010y\u001a\u0002012\b\u0010z\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b{\u0010|J\u001d\u0010}\u001a\u00020\u000f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(0=H\u0016¢\u0006\u0004\b}\u0010:J2\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020&2\u0006\u0010~\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u007f\u001a\u00020\nH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J4\u0010\u0084\u0001\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020&2\u0006\u0010\u007f\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\"2\u0007\u0010\u0083\u0001\u001a\u00020&H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0086\u0001\u0010\u0017J6\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u0087\u0001\u001a\u00020/2\u0007\u0010\u0088\u0001\u001a\u00020/2\u0007\u0010\u0089\u0001\u001a\u00020/2\u0007\u0010\u008a\u0001\u001a\u00020/H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\\\u0010\u0097\u0001\u001a\u00020\u000f2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\n2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010=2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001Jf\u0010\u009b\u0001\u001a\u00020\u000f2\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\n2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010=2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001Jf\u0010\u009d\u0001\u001a\u00020\u000f2\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\n2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010=2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009c\u0001J\\\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\n2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010=2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u0098\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u009f\u0001\u00106R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010 \u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010¡\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¢\u0001R\u0019\u0010R\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010£\u0001R\u001a\u0010¥\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010J\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010§\u0001R\u0017\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010¨\u0001R\u0017\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010©\u0001R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010ª\u0001R\u0017\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010«\u0001R\u0017\u0010U\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010©\u0001R\u0019\u0010¬\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0017\u0010®\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R8\u0010±\u0001\u001a\u0011\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f\u0018\u00010°\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010¸\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001¨\u0006º\u0001"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "<init>", "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/bean/BoardConfig;)V", "Landroid/graphics/RectF;", "getPageRectF", "()Landroid/graphics/RectF;", "getOldPageRectF", "rectF", "Ld6/s;", "setOldPageRectF", "(Landroid/graphics/RectF;)V", "", TypedValues.Custom.S_COLOR, "setDefaultBackgroundColor", "(I)V", "getDefaultBackgroundColor", "()I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "setDefaultBackgroundLineConfig", "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getDefaultBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Matrix;", "matrix", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V", "", "parentId", "Lcom/zykj/blackboard/core/graph/IGraph;", "graph", "addGraph", "(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V", "Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "addImageGraph", "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V", "", "iconWidth", "", "isSelectAction", "select", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V", "selectCancel", "()V", "", "graphList", RequestParameters.SUBRESOURCE_DELETE, "(Ljava/util/List;)V", "renderRectF", "(Landroid/graphics/RectF;Ljava/util/List;)V", "", "translationStart", "translation", "(Ljava/util/List;Landroid/graphics/Matrix;)V", "translationEnd", "cameraChangeStart", "cameraChanging", "(Landroid/graphics/Matrix;)V", "cameraChangeEnd", "resetCamera", "Lcom/zykj/blackboard/core/graph/group/TextGraph;", "textHandleStart", "(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V", "selectedRectF", "selectedRectFMatrix", "textHandle", "(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V", "textHandleEnd", "concatMatrix", "(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V", "release", "rootGraph", "init", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "isDraw", "(Z)V", "()Z", "graphId", "setGraphMatrix", "(Ljava/lang/String;Landroid/graphics/Matrix;)V", "getRenderRectF", "Lcom/zykj/blackboard/core/edit/RenderChangeListener;", "listener", "registerRenderRectFChangeListener", "(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V", "unRegisterRenderRectFChangeListener", "refresh", "reDrawFixView", "reset", "rootGraphId", "()Ljava/lang/String;", "()Lcom/zykj/blackboard/core/graph/IGraph;", "updateBackgroundColor", "getBackgroundColor", "updateBackgroundLineConfig", "getBackgroundLineConfig", "updateBackgroundMatrix", "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;", "snapshot", "()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;", "Landroid/graphics/Bitmap;", "screenshot", "()Landroid/graphics/Bitmap;", "contentThumbnail", "horizontalOffset", "verticalOffset", "minWidth", "minHeight", "isBoardAsWidth", "isContainLimit", "isBoardAsTop", "interruptGraph", "minScreenShot", "(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;", "drawGraphInActive", "content", "originRectF", "changeTextGraph", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V", "renderMatrix", "filePath", "changeImageGraph", "(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V", "getImageGraphCount", "l", "t", "r", "b", "newSelecting", "(FFFF)V", "selectRectF", "selectFunctionRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "functionRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "functionBackgroundRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "typeList", "Landroid/graphics/PointF;", "pointF", "newSelect", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "Lcom/zykj/blackboard/core/graph/group/GroupGraph;", "groupGraph", "newChangeHandleStart", "(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "newChangeHandling", "newChangeHandleEnd", "resetBackground", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "Lcom/zykj/blackboard/bean/BoardConfig;", "Lcom/zykj/blackboard/core/graph/IGraph;", "Lcom/zykj/blackboard/core/canvas/control/DrawControl;", "drawControl", "Lcom/zykj/blackboard/core/canvas/control/DrawControl;", "Landroid/graphics/RectF;", "Landroid/graphics/Matrix;", "Z", "Landroid/graphics/Paint;", "F", "defaultBackgroundColor", "I", "defaultBackgroundLineConfig", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "Lkotlin/Function1;", "deleteCallback", "Lr6/c;", "getDeleteCallback", "()Lr6/c;", "setDeleteCallback", "(Lr6/c;)V", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;", "newSelectGraphControl", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphControl implements IGraphControl {

    @NotNull
    private final BoardConfig boardConfig;
    private int defaultBackgroundColor;

    @NotNull
    private final BackgroundLineConfig defaultBackgroundLineConfig;

    @Nullable
    private InterfaceC6471c deleteCallback;

    @NotNull
    private DrawControl drawControl;
    private float iconWidth;
    private boolean isDraw;
    private boolean isSelectAction;

    @NotNull
    private Matrix matrix;

    @NotNull
    private final MatrixAdapter matrixAdapter;

    @NotNull
    private final NewSelectGraphControl newSelectGraphControl;

    @Nullable
    private Paint paint;

    @NotNull
    private final RenderLayer renderLayer;

    @Nullable
    private IGraph rootGraph;

    @Nullable
    private RectF selectedRectF;

    public GraphControl(@NotNull MatrixAdapter matrixAdapter, @NotNull RenderLayer renderLayer, @NotNull BoardConfig boardConfig) {
        AbstractC5830k.m5330g(matrixAdapter, "matrixAdapter");
        AbstractC5830k.m5330g(renderLayer, "renderLayer");
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        this.matrixAdapter = matrixAdapter;
        this.renderLayer = renderLayer;
        this.boardConfig = boardConfig;
        this.drawControl = new DrawControl(boardConfig);
        this.matrix = new Matrix();
        this.isSelectAction = true;
        this.isDraw = true;
        this.defaultBackgroundLineConfig = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        matrixAdapter.setVisibleRectF(renderLayer.getRenderRect());
        this.drawControl.setMatrixAdapter(matrixAdapter);
        this.drawControl.setRenderLayer(renderLayer);
        this.newSelectGraphControl = new NewSelectGraphControl(this.drawControl);
    }

    private final void resetBackground() {
        updateBackgroundColor(this.defaultBackgroundColor);
        updateBackgroundLineConfig(this.defaultBackgroundLineConfig);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void addGraph(@Nullable String parentId, @NotNull IGraph graph) {
        Graph graphFindById;
        AbstractC5830k.m5330g(graph, "graph");
        AbstractC3387g.m2342e("GraphControl:addGraph -> [" + graph.graphType() + "] parentId:" + parentId + ", graphId:" + graph.getId());
        if (parentId == null || AbstractC5855p.m5382P(parentId)) {
            this.rootGraph = graph;
            if (this.isDraw) {
                this.drawControl.add(graph);
                return;
            }
            return;
        }
        IGraph iGraph = this.rootGraph;
        if (iGraph == null || iGraph == null || (graphFindById = iGraph.findById(parentId)) == null) {
            return;
        }
        graphFindById.addGraph(graph);
        if (this.isDraw) {
            this.drawControl.add(graph);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void addImageGraph(@NotNull ImageGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        AbstractC3387g.m2342e("GraphControl:addImageGraph -> graphId:" + graph.getId());
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            if (iGraph != null) {
                iGraph.addImageGraph(graph);
            }
            reDrawFixView();
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void cameraChangeEnd(@Nullable Matrix matrix) {
        AbstractC3387g.m2342e("GraphControl:cameraChangeEnd");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            if (matrix != null) {
                this.matrixAdapter.cameraMatrixConcat(matrix);
            }
            if (this.isDraw) {
                this.drawControl.cameraChangeEnd(iGraph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void cameraChangeStart() {
        IGraph iGraph;
        AbstractC3387g.m2342e("GraphControl:cameraChangeStart ");
        if (this.isDraw && (iGraph = this.rootGraph) != null) {
            this.drawControl.cameraChangeStart(iGraph);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void cameraChanging(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        if (this.isDraw && this.rootGraph != null) {
            DrawControl drawControl = this.drawControl;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(MatrixExtKt.invert(this.matrixAdapter.getScreenMatrix()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.matrixAdapter.getScreenMatrix());
            drawControl.cameraChanging(matrix2);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void changeImageGraph(@NotNull String graphId, @NotNull RectF originRectF, @NotNull Matrix renderMatrix, @NotNull String filePath) {
        List<IGraph> childGraph;
        AbstractC5830k.m5330g(graphId, "graphId");
        AbstractC5830k.m5330g(originRectF, "originRectF");
        AbstractC5830k.m5330g(renderMatrix, "renderMatrix");
        AbstractC5830k.m5330g(filePath, "filePath");
        AbstractC3387g.m2342e("GraphControl:changeImageGraph -> graphId: ".concat(graphId));
        IGraph iGraph = this.rootGraph;
        if (iGraph == null || (childGraph = iGraph.getChildGraph()) == null) {
            return;
        }
        for (IGraph iGraph2 : childGraph) {
            if (AbstractC5830k.m5325b(iGraph2.getId(), graphId) && (iGraph2 instanceof ImageGraph)) {
                ImageGraph imageGraph = (ImageGraph) iGraph2;
                imageGraph.changeOriginalRectF(originRectF);
                imageGraph.changeRenderMatrix(renderMatrix);
                imageGraph.updateFilePath(filePath);
                if (getIsDraw()) {
                    DrawControl drawControl = this.drawControl;
                    ArrayList arrayList = new ArrayList();
                    IGraph iGraph3 = this.rootGraph;
                    if (iGraph3 != null) {
                        arrayList.add(iGraph3);
                    }
                    drawControl.drawGraphInFix(arrayList);
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void changeTextGraph(@NotNull String graphId, @NotNull String content, @NotNull Paint paint, @NotNull RectF originRectF) {
        List<IGraph> childGraph;
        AbstractC5830k.m5330g(graphId, "graphId");
        AbstractC5830k.m5330g(content, "content");
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(originRectF, "originRectF");
        AbstractC3387g.m2342e("GraphControl:changeTextGraph -> graphId: ".concat(graphId));
        IGraph iGraph = this.rootGraph;
        if (iGraph == null || (childGraph = iGraph.getChildGraph()) == null) {
            return;
        }
        for (IGraph iGraph2 : childGraph) {
            if (AbstractC5830k.m5325b(iGraph2.getId(), graphId) && (iGraph2 instanceof TextGraph)) {
                TextGraph textGraph = (TextGraph) iGraph2;
                textGraph.setContent(content);
                textGraph.setPaint(paint);
                textGraph.changeOriginalRectF(originRectF);
                if (getIsDraw()) {
                    DrawControl drawControl = this.drawControl;
                    ArrayList arrayList = new ArrayList();
                    IGraph iGraph3 = this.rootGraph;
                    if (iGraph3 != null) {
                        arrayList.add(iGraph3);
                    }
                    drawControl.drawGraphInFix(arrayList);
                    RectF rectF = this.selectedRectF;
                    if (rectF != null) {
                        Path selectActionRectBoardPath = this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth);
                        this.drawControl.selectCancel();
                        this.drawControl.select(selectActionRectBoardPath, this.paint);
                    }
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void concatMatrix(@NotNull IGraph graph, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "graph");
        AbstractC5830k.m5330g(matrix, "matrix");
        graph.concatMatrix(matrix);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @Nullable
    public Bitmap contentThumbnail() {
        IGraph iGraph;
        if (!getIsDraw() || (iGraph = this.rootGraph) == null) {
            return null;
        }
        return this.drawControl.contentThumbnail(iGraph);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void delete(@NotNull List<IGraph> graphList) {
        IGraph iGraph;
        AbstractC5830k.m5330g(graphList, "graphList");
        if (graphList.isEmpty() || (iGraph = this.rootGraph) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("GraphControl:delete -> root:");
        sb.append(iGraph.getId());
        sb.append(": ");
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(graphList, 10));
        Iterator<T> it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC3387g.m2342e(sb.toString());
        iGraph.deleteGraphList(graphList);
        for (IGraph iGraph2 : graphList) {
            InterfaceC6471c interfaceC6471c = this.deleteCallback;
            if (interfaceC6471c != null) {
                interfaceC6471c.invoke(iGraph2);
            }
        }
        if (this.isDraw) {
            this.drawControl.delete(iGraph);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void drawGraphInActive(@NotNull List<? extends IGraph> graphList) {
        AbstractC5830k.m5330g(graphList, "graphList");
        if (getIsDraw()) {
            this.drawControl.drawGraphInActive(graphList);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void drawPath(@NotNull Path path, @NotNull Paint paint, @Nullable Matrix matrix) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(paint, "paint");
        this.drawControl.drawPath(path, paint, matrix);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public int getBackgroundColor() {
        return this.drawControl.getBackgroundColor();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @NotNull
    public BackgroundLineConfig getBackgroundLineConfig() {
        return this.drawControl.getBackgroundLineConfig();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @NotNull
    public BackgroundLineConfig getDefaultBackgroundLineConfig() {
        return this.defaultBackgroundLineConfig;
    }

    @Nullable
    public final InterfaceC6471c getDeleteCallback() {
        return this.deleteCallback;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public int getImageGraphCount() {
        List<IGraph> childGraph;
        IGraph iGraph = this.rootGraph;
        int i = 0;
        if (iGraph != null && (childGraph = iGraph.getChildGraph()) != null) {
            Iterator<T> it = childGraph.iterator();
            while (it.hasNext()) {
                if (((IGraph) it.next()) instanceof ImageGraph) {
                    i++;
                }
            }
        }
        return i;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @NotNull
    public RectF getOldPageRectF() {
        return new RectF(this.drawControl.getOldPageRectF());
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @NotNull
    public RectF getPageRectF() {
        return new RectF(this.renderLayer.getRenderRect());
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @NotNull
    public RectF getRenderRectF() {
        return this.matrixAdapter.getRenderRectF();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void init(@NotNull IGraph rootGraph) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        StringBuilder sb = new StringBuilder("GraphControl:init -> ");
        sb.append(rootGraph.getId());
        sb.append(": ");
        List<IGraph> childGraph = rootGraph.getChildGraph();
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(childGraph, 10));
        Iterator<T> it = childGraph.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC3387g.m2342e(sb.toString());
        this.rootGraph = rootGraph;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void isDraw(boolean isDraw) {
        this.isDraw = isDraw;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @Nullable
    public Bitmap minScreenShot(int horizontalOffset, int verticalOffset, int minWidth, int minHeight, boolean isBoardAsWidth, boolean isContainLimit, boolean isBoardAsTop, @Nullable IGraph interruptGraph) {
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            return this.drawControl.getMinScreenShot(iGraph, horizontalOffset, verticalOffset, minWidth, minHeight, isBoardAsWidth, isContainLimit, isBoardAsTop, interruptGraph);
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newChangeHandleEnd(@NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            this.newSelectGraphControl.newChangeHandleEnd(iGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newChangeHandleStart(@NotNull GroupGraph groupGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(groupGraph, "groupGraph");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            this.newSelectGraphControl.newChangeHandleStart(iGraph, groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newChangeHandling(@NotNull GroupGraph groupGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(groupGraph, "groupGraph");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        if (this.rootGraph != null) {
            this.newSelectGraphControl.newChangeHandling(groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newSelect(@NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        this.newSelectGraphControl.drawNewSelectRectF(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newSelecting(float l, float t8, float r, float b6) {
        this.newSelectGraphControl.drawNewSelectRectF(l, t8, r, b6);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public synchronized void reDrawFixView() {
        try {
            if (this.isDraw) {
                AbstractC3387g.m2342e("GraphControl:reDrawFixView -> cameraMatrix=" + this.matrixAdapter.getCameraMatrix());
                DrawControl drawControl = this.drawControl;
                ArrayList arrayList = new ArrayList();
                IGraph iGraph = this.rootGraph;
                if (iGraph != null) {
                    arrayList.add(iGraph);
                }
                drawControl.drawGraphInFix(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void refresh() {
        this.drawControl.refresh();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void registerRenderRectFChangeListener(@NotNull RenderChangeListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.matrixAdapter.registerRenderRectFChangeListener(listener);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void release() {
        AbstractC3387g.m2342e("GraphControl:release");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            iGraph.onDestroy();
        }
        this.drawControl.release();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void renderRectF(@NotNull RectF rectF, @NotNull List<IGraph> graphList) {
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(graphList, "graphList");
        if (this.isDraw && !rectF.isEmpty()) {
            this.drawControl.renderRectFInFix(rectF, graphList);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void reset() {
        AbstractC3387g.m2342e("GraphControl:reset");
        resetBackground();
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            iGraph.onDestroy();
        }
        this.rootGraph = null;
        this.drawControl.reset();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void resetCamera() {
        AbstractC3387g.m2342e("GraphControl:resetCamera");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            this.matrixAdapter.resetCamera();
            if (this.isDraw) {
                this.drawControl.cameraChangeEnd(iGraph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @Nullable
    /* renamed from: rootGraph, reason: from getter */
    public IGraph getRootGraph() {
        return this.rootGraph;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @Nullable
    public String rootGraphId() {
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            return iGraph.getId();
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @Nullable
    public Bitmap screenshot() {
        IGraph iGraph;
        if (!getIsDraw() || (iGraph = this.rootGraph) == null) {
            return null;
        }
        return this.drawControl.screenshot(iGraph);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void select(@NotNull RectF rectF, @NotNull Matrix matrix, @Nullable Paint paint, float iconWidth, boolean isSelectAction) {
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        if (this.isDraw) {
            this.selectedRectF = rectF;
            this.paint = paint;
            this.iconWidth = iconWidth;
            this.matrix.set(matrix);
            this.isSelectAction = isSelectAction;
            if (this.rootGraph != null) {
                Path selectActionRectBoardPath = isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, matrix, iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, matrix, iconWidth);
                this.drawControl.selectCancel();
                this.drawControl.select(selectActionRectBoardPath, paint);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void selectCancel() {
        if (this.isDraw) {
            this.selectedRectF = null;
            this.matrix.reset();
            this.drawControl.selectCancel();
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void setDefaultBackgroundColor(int color) {
        this.defaultBackgroundColor = color;
        this.drawControl.setBackgroundColor(color);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void setDefaultBackgroundLineConfig(@NotNull BackgroundLineConfig backgroundLineConfig) {
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        BackgroundLineConfig backgroundLineConfig2 = this.defaultBackgroundLineConfig;
        backgroundLineConfig2.setLineType(backgroundLineConfig.getLineType());
        backgroundLineConfig2.setLineColor(backgroundLineConfig.getLineColor());
        backgroundLineConfig2.setLineSpace(backgroundLineConfig.getLineSpace());
        this.drawControl.setBackgroundLineConfig(backgroundLineConfig);
    }

    public final void setDeleteCallback(@Nullable InterfaceC6471c interfaceC6471c) {
        this.deleteCallback = interfaceC6471c;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void setGraphMatrix(@NotNull String graphId, @NotNull Matrix matrix) {
        Graph graphFindById;
        AbstractC5830k.m5330g(graphId, "graphId");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC3387g.m2342e("GraphControl:setGraphMatrix -> graphId:".concat(graphId));
        IGraph iGraph = this.rootGraph;
        if (iGraph != null && (graphFindById = iGraph.findById(graphId)) != null) {
            graphFindById.initMatrix(matrix);
        }
        reDrawFixView();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void setOldPageRectF(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        this.drawControl.getOldPageRectF().set(rectF);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    @Nullable
    public EzyPageSnapshot$PageSnapshot.GraphSnapshot snapshot() {
        C4361d0 snapshot;
        IGraph iGraph = this.rootGraph;
        if (iGraph == null || (snapshot = iGraph.getSnapshot()) == null) {
            return null;
        }
        return snapshot.build();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void textHandle(@NotNull TextGraph graph, @Nullable RectF selectedRectF, @Nullable Matrix selectedRectFMatrix) {
        Path selectActionRectBoardPath;
        AbstractC5830k.m5330g(graph, "graph");
        if (this.isDraw) {
            if (selectedRectF != null) {
                this.selectedRectF = selectedRectF;
                this.matrix.set(selectedRectFMatrix);
                selectActionRectBoardPath = this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(selectedRectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(selectedRectF, this.matrix, this.iconWidth);
            } else {
                selectActionRectBoardPath = null;
            }
            this.drawControl.textHandle(graph, selectActionRectBoardPath, this.paint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void textHandleEnd(@NotNull TextGraph graph, @Nullable RectF selectedRectF, @Nullable Matrix selectedRectFMatrix) {
        IGraph iGraph;
        Path selectActionRectBoardPath;
        AbstractC5830k.m5330g(graph, "graph");
        AbstractC3387g.m2342e("GraphControl:textHandleEnd");
        if (this.isDraw && (iGraph = this.rootGraph) != null) {
            if (selectedRectF != null) {
                this.selectedRectF = selectedRectF;
                this.matrix.set(selectedRectFMatrix);
                selectActionRectBoardPath = this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(selectedRectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(selectedRectF, this.matrix, this.iconWidth);
            } else {
                selectActionRectBoardPath = null;
            }
            this.drawControl.textHandleEnd(iGraph, selectActionRectBoardPath, this.paint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void textHandleStart(@NotNull TextGraph graph) {
        IGraph iGraph;
        AbstractC5830k.m5330g(graph, "graph");
        AbstractC3387g.m2342e("GraphControl:textHandleStart");
        if (this.isDraw && (iGraph = this.rootGraph) != null) {
            RectF rectF = this.selectedRectF;
            this.drawControl.textHandleStart(iGraph, graph, rectF != null ? this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth) : null, this.paint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void translation(@NotNull List<? extends IGraph> graphList, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graphList, "graphList");
        AbstractC5830k.m5330g(matrix, "matrix");
        if (this.isDraw) {
            DrawControl drawControl = this.drawControl;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(MatrixExtKt.invert(this.matrixAdapter.getAdapterMatrix()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.matrixAdapter.getAdapterMatrix());
            drawControl.transGraph(matrix2);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void translationEnd(@NotNull List<? extends IGraph> graphList, @Nullable Matrix matrix) {
        AbstractC5830k.m5330g(graphList, "graphList");
        StringBuilder sb = new StringBuilder("GraphControl:translationEnd -> matrix:");
        sb.append(matrix);
        sb.append(" graph:");
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(graphList, 10));
        Iterator<T> it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC3387g.m2342e(sb.toString());
        for (IGraph iGraph : graphList) {
            Matrix matrix2 = new Matrix();
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            concatMatrix(iGraph, matrix2);
        }
        if (this.isDraw) {
            if (this.selectedRectF != null) {
                Matrix matrix3 = this.matrix;
                Matrix matrix4 = new Matrix();
                if (matrix != null) {
                    matrix4.postConcat(MatrixExtKt.invert(this.matrixAdapter.getAdapterMatrix()));
                    matrix4.postConcat(matrix);
                    matrix4.postConcat(this.matrixAdapter.getAdapterMatrix());
                }
                matrix3.postConcat(matrix4);
            }
            IGraph iGraph2 = this.rootGraph;
            if (iGraph2 != null) {
                RectF rectF = this.selectedRectF;
                this.drawControl.transGraphEnd(iGraph2, rectF != null ? this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth) : null, this.paint);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void translationStart(@NotNull List<? extends IGraph> graphList) {
        IGraph iGraph;
        AbstractC5830k.m5330g(graphList, "graphList");
        StringBuilder sb = new StringBuilder("GraphControl:translationStart -> graph:");
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(graphList, 10));
        Iterator<T> it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC3387g.m2342e(sb.toString());
        if (this.isDraw && (iGraph = this.rootGraph) != null) {
            RectF rectF = this.selectedRectF;
            this.drawControl.transGraphStart(iGraph, graphList, rectF != null ? this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth) : null, this.paint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void unRegisterRenderRectFChangeListener(@NotNull RenderChangeListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.matrixAdapter.unRegisterRenderRectFChangeListener(listener);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void updateBackgroundColor(int color) {
        AbstractC3387g.m2342e(AbstractC0037f.m81f(color, "GraphControl:updateBackground -> color:"));
        this.drawControl.setBackgroundColor(color);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void updateBackgroundLineConfig(@NotNull BackgroundLineConfig backgroundLineConfig) {
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        this.drawControl.setBackgroundLineConfig(backgroundLineConfig);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void updateBackgroundMatrix() {
        this.drawControl.updateBackgroundMatrix(this.matrixAdapter.getAdapterMatrix());
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    /* renamed from: isDraw, reason: from getter */
    public boolean getIsDraw() {
        return this.isDraw;
    }
}
