package com.zykj.blackboard.core.edit;

// RE note 管理 Blackboard 页面编辑状态及页面快照。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC3387g;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.SingleFieldBuilderV3;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.ITouchAction;
import com.zykj.blackboard.core.action.MoveAction;
import com.zykj.blackboard.core.action.SelectAction;
import com.zykj.blackboard.core.action.TextAction;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.canvas.control.GraphControl;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.record.ITimeRecord;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.blackboard.listener.GraphDeleteListener;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.IGeometrySelectListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.MicroPhoneListener;
import com.zykj.blackboard.listener.RecordListener;
import com.zykj.blackboard.listener.WithdrawListener;
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.OutOfMaxImageCountException;
import com.zykj.blackboard.utils.ProtoFileUtils;
import com.zykj.blackboard.utils.TextGraphUtils;
import com.zykj.board.C4355b0;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyModeEnum$ModeEnum;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import com.zykj.board.EzyPositionEnum$PositionEnum;
import com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p160s6.InterfaceC6560a;
import p160s6.InterfaceC6562c;

@Metadata(m5109d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0018JA\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ3\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020#2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020#2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00100\u001a\u00020#2\u0006\u0010+\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020#2\u0006\u0010+\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020#2\u0006\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020#H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020#2\u0006\u0010+\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u00104J\u000f\u00105\u001a\u00020#H\u0016¢\u0006\u0004\b5\u00109J\u000f\u0010>\u001a\u00020#H\u0016¢\u0006\u0004\b>\u00109J\u0017\u0010A\u001a\u00020\u00102\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00102\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010J\u001a\u00020#2\u0006\u0010G\u001a\u00020\u00122\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010M\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bP\u0010QJ\u0011\u0010R\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bR\u0010SJS\u0010]\u001a\u0004\u0018\u00010\u00152\u0006\u0010T\u001a\u00020?2\u0006\u0010U\u001a\u00020?2\u0006\u0010V\u001a\u00020?2\u0006\u0010W\u001a\u00020?2\u0006\u0010X\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00102\b\u0010\\\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020#H\u0016¢\u0006\u0004\b_\u00109J\u000f\u0010`\u001a\u00020#H\u0016¢\u0006\u0004\b`\u00109J\u000f\u0010a\u001a\u00020\u0010H\u0016¢\u0006\u0004\ba\u00104J'\u0010e\u001a\u00020#2\u0006\u0010b\u001a\u00020C2\u0006\u0010c\u001a\u00020C2\u0006\u0010d\u001a\u00020CH\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020CH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020HH\u0016¢\u0006\u0004\bi\u0010jJ#\u0010m\u001a\u00020#2\b\u0010k\u001a\u0004\u0018\u00010C2\b\u0010l\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020#2\u0006\u0010o\u001a\u00020?H\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020?H\u0016¢\u0006\u0004\br\u0010sJ\u001f\u0010v\u001a\u00020#2\u0006\u0010o\u001a\u00020?2\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020tH\u0016¢\u0006\u0004\bx\u0010yJ\u0019\u0010z\u001a\u00020#2\b\u0010\\\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010~\u001a\u00020#2\u0006\u0010}\u001a\u00020|H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u001d\u0010\u0081\u0001\u001a\u00020#2\t\u0010+\u001a\u0005\u0018\u00010\u0080\u0001H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0011\u0010\u0083\u0001\u001a\u00020#H\u0016¢\u0006\u0005\b\u0083\u0001\u00109J'\u0010\u0086\u0001\u001a\u00020#2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010C2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0005\b\u0086\u0001\u0010nJ'\u0010\u0087\u0001\u001a\u00020#2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010C2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0005\b\u0087\u0001\u0010nJ\u0011\u0010\u0088\u0001\u001a\u00020CH\u0016¢\u0006\u0005\b\u0088\u0001\u0010hJ\u0011\u0010\u0089\u0001\u001a\u00020CH\u0016¢\u0006\u0005\b\u0089\u0001\u0010hJ\u001b\u0010\u008b\u0001\u001a\u00020#2\u0007\u0010+\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001b\u0010\u008d\u0001\u001a\u00020#2\u0007\u0010+\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001J\u0011\u0010\u008e\u0001\u001a\u00020?H\u0016¢\u0006\u0005\b\u008e\u0001\u0010sJ\u0014\u0010\u008f\u0001\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0011\u0010\u0091\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0091\u0001\u00104J\u0011\u0010\u0092\u0001\u001a\u00020?H\u0016¢\u0006\u0005\b\u0092\u0001\u0010sJ\u0018\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u001eH\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0018\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u001eH\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0094\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0096\u0001\u00104J\u0011\u0010\u0097\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0097\u0001\u00104J\u0011\u0010\u0098\u0001\u001a\u00020#H\u0016¢\u0006\u0005\b\u0098\u0001\u00109J\u0011\u0010\u0099\u0001\u001a\u00020#H\u0016¢\u0006\u0005\b\u0099\u0001\u00109J\u001b\u0010\u009b\u0001\u001a\u00020#2\u0007\u0010+\u001a\u00030\u009a\u0001H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001b\u0010\u009d\u0001\u001a\u00020#2\u0007\u0010+\u001a\u00030\u009a\u0001H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009c\u0001J/\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00012\u0007\u0010\u009e\u0001\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0007\u0010\u009f\u0001\u001a\u00020?H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J!\u0010¤\u0001\u001a\u00020#2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u001eH\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J8\u0010©\u0001\u001a\u00020#2$\u0010+\u001a \u0012\u0015\u0012\u00130\n¢\u0006\u000e\b§\u0001\u0012\t\b¨\u0001\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0¦\u0001H\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J%\u0010®\u0001\u001a\u00030\u00ad\u00012\u0007\u0010«\u0001\u001a\u00020C2\u0007\u0010¬\u0001\u001a\u00020CH\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001JR\u0010²\u0001\u001a\u0004\u0018\u00010\u00122\b\u0010±\u0001\u001a\u00030°\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000b\b\u0002\u0010«\u0001\u001a\u0004\u0018\u00010?2\u000b\b\u0002\u0010¬\u0001\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001JL\u0010¹\u0001\u001a\u0004\u0018\u00010\u00122\u0007\u0010´\u0001\u001a\u00020\n2\u0007\u0010µ\u0001\u001a\u00020\n2\u0007\u0010¶\u0001\u001a\u00020C2\u0007\u0010·\u0001\u001a\u00020C2\b\u0010¸\u0001\u001a\u00030\u00ad\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J$\u0010½\u0001\u001a\u00020#2\u0010\u0010¼\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00150»\u0001H\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001b\u0010À\u0001\u001a\u00020C2\u0007\u0010¿\u0001\u001a\u00020CH\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Â\u0001"}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/PageControl;", "Lcom/zykj/blackboard/core/edit/BasePageControl;", "Lcom/zykj/blackboard/core/edit/BoardControl;", "boardControl", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "pageEntity", "<init>", "(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V", "", "path", "Lcom/zykj/board/EzyPositionEnum$PositionEnum;", RequestParameters.POSITION, "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;", "scaleType", "", "loadWithCameraMatrix", "Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "addImage", "(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "Landroid/graphics/Bitmap;", "bitmap", "isRecycle", "(Landroid/graphics/Bitmap;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "filename", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "addSpecialImage", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "(Landroid/graphics/Bitmap;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "", "pathList", "addImageList", "(Ljava/util/List;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)Ljava/util/List;", "graphId", "Ld6/s;", "selectedGraph", "(Ljava/lang/String;)V", "Lcom/zykj/blackboard/listener/RecordListener;", "recordListener", "setRecordListener", "(Lcom/zykj/blackboard/listener/RecordListener;)V", "Lcom/zykj/blackboard/listener/EventListener;", "listener", "addEventListener", "(Lcom/zykj/blackboard/listener/EventListener;)V", "removeEventListener", "Lcom/zykj/blackboard/core/edit/RenderChangeListener;", "addRenderRectChangeListener", "(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V", "removeRenderRectChangeListener", "isRecording", "()Z", "turnOnMicro", "startRecord", "(Z)V", "stopRecord", "()V", "Lcom/zykj/blackboard/listener/MicroPhoneListener;", "setMicroPhoneListener", "(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V", "isMicroTurnOn", "turnOffMicro", "", TypedValues.Custom.S_COLOR, "changeTextColor", "(I)Z", "", "size", "changeTextSize", "(F)Z", "graph", "Landroid/graphics/RectF;", "newRectF", "changeImageOriginRect", "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Landroid/graphics/RectF;)V", "Lcom/zykj/blackboard/listener/ITextSelectListener;", "setTextSelectListener", "(Lcom/zykj/blackboard/listener/ITextSelectListener;)V", "Lcom/zykj/blackboard/listener/IGeometrySelectListener;", "setGeometrySelectListener", "(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V", "screenshot", "()Landroid/graphics/Bitmap;", "horizontalOffset", "verticalOffset", "minWidth", "minHeight", "isBoardAsWidth", "isContainLimit", "isBoardAsTop", "Lcom/zykj/blackboard/core/graph/IGraph;", "interruptGraph", "minScreenshot", "(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;", "save", "saveWithContentThumbnail", "canSave", "pointX", "pointY", "scaleNum", "zoomLevel", "(FFF)V", "getZoomLevel", "()F", "getRenderRect", "()Landroid/graphics/RectF;", "progressWidth", "progressHeight", "setVisibleAreaProgress", "(Ljava/lang/Float;Ljava/lang/Float;)V", "backgroundColor", "setBackgroundColor", "(I)V", "getBackgroundColor", "()I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "setBackgroundColorWithLineConfig", "(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "cleanPage", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "Landroid/view/MotionEvent;", "motionEvent", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "setAreaMoveListener", "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V", "areaMoveStart", "horizontalProgress", "verticalProgress", "areaMoving", "areaMoveEnd", "getMoveVerticalProgress", "getMoveHorizontalProgress", "Lcom/zykj/blackboard/listener/GraphDeleteListener;", "addGraphDeleteListener", "(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V", "removeGraphDeleteListener", "getImageGraphCount", "getFirstGraph", "()Lcom/zykj/blackboard/core/graph/IGraph;", "isPageNotEmpty", "getGroupGraphSize", "getPageImagePathList", "()Ljava/util/List;", "getNoRecordImagePathList", "withdraw", "recover", "clearHistoryList", "clearHistoryListWithoutCurrent", "Lcom/zykj/blackboard/listener/WithdrawListener;", "addWithdrawListener", "(Lcom/zykj/blackboard/listener/WithdrawListener;)V", "removeWithdrawListener", "content", TypedValues.CycleType.S_WAVE_OFFSET, "Lcom/zykj/blackboard/core/graph/group/TextGraph;", "addText", "(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lcom/zykj/blackboard/core/graph/group/TextGraph;", "graphIdList", "newSelectGraph", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "setGeometryCreateListener", "(Lr6/c;)V", "imageWidth", "imageHeight", "Landroid/graphics/Matrix;", "calculateMatrixForSpecial", "(FF)Landroid/graphics/Matrix;", "Ljava/io/File;", "localFile", "addImageGraphFromLocal", "(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "fileName", "validate", "width", "height", "renderMatrix", "buildImageGraph", "(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "Lkotlin/Function0;", "thumbnail", "saveData", "(Lr6/a;)V", "value", "safeCountProgress", "(F)F", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PageControl extends BasePageControl {
    public /* synthetic */ PageControl(BoardControl boardControl, RenderLayer renderLayer, PageEntity pageEntity, int i, AbstractC5824e abstractC5824e) {
        this(boardControl, renderLayer, (i & 4) != 0 ? null : pageEntity);
    }

    private final ImageGraph addImageGraphFromLocal(File localFile, EzyPositionEnum$PositionEnum position, EzyScaleTypeEnum$ScaleTypeEnum scaleType, Integer imageWidth, Integer imageHeight, boolean loadWithCameraMatrix) throws InvalidProtocolBufferException {
        String fileSignature$default = FileValidateUtils.getFileSignature$default(FileValidateUtils.INSTANCE, localFile, null, 2, null);
        if (fileSignature$default == null) {
            return null;
        }
        String absolutePath = localFile.getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "localFile.absolutePath");
        Float[] wHFromLocalByType = PageControlExtKt.getWHFromLocalByType(this, absolutePath, scaleType, imageWidth, imageHeight);
        String name = localFile.getName();
        AbstractC5830k.m5329f(name, "localFile.name");
        ImageGraph imageGraphBuildImageGraph = buildImageGraph(name, fileSignature$default, wHFromLocalByType[0].floatValue(), wHFromLocalByType[1].floatValue(), PageControlExtKt.getTranslateMatrix$default(this, wHFromLocalByType[0].floatValue(), wHFromLocalByType[1].floatValue(), position, 0, 8, null), loadWithCameraMatrix);
        saveSnapshot();
        return imageGraphBuildImageGraph;
    }

    public static /* synthetic */ ImageGraph addImageGraphFromLocal$default(PageControl pageControl, File file, EzyPositionEnum$PositionEnum ezyPositionEnum$PositionEnum, EzyScaleTypeEnum$ScaleTypeEnum ezyScaleTypeEnum$ScaleTypeEnum, Integer num, Integer num2, boolean z8, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            z8 = false;
        }
        return pageControl.addImageGraphFromLocal(file, ezyPositionEnum$PositionEnum, ezyScaleTypeEnum$ScaleTypeEnum, num, num2, z8);
    }

    private final ImageGraph buildImageGraph(String fileName, String validate, float width, float height, Matrix renderMatrix, boolean loadWithCameraMatrix) throws InvalidProtocolBufferException {
        CommandInfoEntity commandInfoEntityAddCommand;
        String strRootGraphId = getGraphControl().rootGraphId();
        if (strRootGraphId == null || (commandInfoEntityAddCommand = getRouterRecord().getCommandRecord().addCommand(strRootGraphId, fileName, EzyGraphEnum$GraphEnum.IMAGE_GRAPH, validate, (int) width, (int) height, System.currentTimeMillis(), getBoardControl().getBoardConfig().getIsImageBackground())) == null) {
            return null;
        }
        EzyCommand$CommandSource.CommandInfo.GraphData graphData = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(commandInfoEntityAddCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC5830k.m5329f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, getSourceLoad());
        if (graph == null) {
            return null;
        }
        Matrix matrix = new Matrix(renderMatrix);
        if (!loadWithCameraMatrix) {
            matrix.postConcat(MatrixExtKt.invert(getMatrixAdapter().getAdapterMatrix()));
        }
        getActionManager().transformGraphEvent(AbstractC5806u.m5267f(graph), AbstractC5806u.m5247A(MatrixExtKt.toEzyMatrix(matrix, System.currentTimeMillis())));
        graph.concatMatrix(matrix);
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.WRITE_NEW_GROUP);
        if (getBoardControl().getBoardConfig().getIsImageBackground()) {
            getGraphControl().addImageGraph((ImageGraph) graph);
        } else {
            getGraphControl().addGraph(graphData.getParentGraphId(), graph);
        }
        String absolutePath = new File(SourceRouterRecord.INSTANCE.getResPath(getPagePath(), DocumentType.IMAGE), fileName).getAbsolutePath();
        if (isRecording()) {
            getRecordingImageList().add(absolutePath);
        } else {
            getNoRecordingImageList().add(absolutePath);
        }
        return (ImageGraph) graph;
    }

    public static /* synthetic */ ImageGraph buildImageGraph$default(PageControl pageControl, String str, String str2, float f, float f7, Matrix matrix, boolean z8, int i, Object obj) {
        if ((i & 32) != 0) {
            z8 = false;
        }
        return pageControl.buildImageGraph(str, str2, f, f7, matrix, z8);
    }

    private final Matrix calculateMatrixForSpecial(float imageWidth, float imageHeight) {
        float fMax;
        List<IGraph> childGraph;
        float fMin = Math.min(imageWidth, getBoardControl().getBoardConfig().getWidth());
        float f = fMin / imageWidth;
        float f7 = (imageHeight * fMin) / imageWidth;
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        matrix.postConcat(PageControlExtKt.getTranslateMatrix$default(this, fMin, f7, EzyPositionEnum$PositionEnum.TOP_CENTER, 0, 8, null));
        IGraph iGraphRootGraph = getGraphControl().getRootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            fMax = 0.0f;
        } else {
            fMax = 0.0f;
            for (IGraph iGraph : childGraph) {
                if (iGraph instanceof ImageGraph) {
                    fMax = Math.max(iGraph.getRenderRectF().bottom, fMax);
                }
            }
        }
        matrix.postTranslate(0.0f, fMax);
        return matrix;
    }

    private final float safeCountProgress(float value) {
        if (value > 1.0f) {
            return 1.0f;
        }
        if (value < 0.0f) {
            return 0.0f;
        }
        return value;
    }

    private final void saveData(InterfaceC6469a thumbnail) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        EzyMatrix$Matrix defaultInstance;
        List<IGraph> childGraph;
        if (isRecording()) {
            stopRecord();
        }
        Bitmap bitmap = (Bitmap) thumbnail.invoke();
        if (bitmap != null) {
            ProtoFileUtils.INSTANCE.createBitmapFile(getPagePath(), BasePageControl.SCREENSHOT_FILE_NAME, bitmap);
        }
        EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshotSnapshot = getGraphControl().snapshot();
        if (graphSnapshotSnapshot != null) {
            C4355b0 c4355b0NewBuilder = EzyPageSnapshot$PageSnapshot.newBuilder();
            c4355b0NewBuilder.m3699k(graphSnapshotSnapshot);
            c4355b0NewBuilder.m3698j(MatrixExtKt.toEzyMatrix(getMatrixAdapter().getCameraMatrix(), 0L));
            StringBuilder sb = new StringBuilder("[PageControl]:saveData -> [");
            sb.append(getFileName());
            sb.append("] s:");
            sb.append(graphSnapshotSnapshot.getChildGraphList().size());
            sb.append(", g:");
            IGraph iGraphRootGraph = getGraphControl().getRootGraph();
            sb.append((iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) ? null : Integer.valueOf(childGraph.size()));
            sb.append("cm:");
            SingleFieldBuilderV3 singleFieldBuilderV3 = c4355b0NewBuilder.f5448c;
            if (singleFieldBuilderV3 == null) {
                defaultInstance = c4355b0NewBuilder.f5447b;
                if (defaultInstance == null) {
                    defaultInstance = EzyMatrix$Matrix.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyMatrix$Matrix) singleFieldBuilderV3.getMessage();
            }
            sb.append(defaultInstance.getScaleX());
            AbstractC3387g.m2342e(sb.toString());
            ProtoFileUtils.INSTANCE.createPageSnapshotFile(getPagePath(), BasePageControl.SNAPSHOT_FILE_NAME, c4355b0NewBuilder.build());
        }
        HeaderEntity target = getPageEntity().getHeaderEntity().getTarget();
        if (target != null) {
            target.setUpdateDate(System.currentTimeMillis());
            target.setDuration(getTimeRecord().getTime(System.currentTimeMillis()));
            target.setDefaultBackgroundColor(getGraphControl().getDefaultBackgroundColor());
            target.setLastBackgroundColor(getGraphControl().getBackgroundColor());
            ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig = target.getDefaultBackgroundLineConfig();
            BackgroundLineConfigEntity entity = ConvertExtKt.toEntity(getGraphControl().getDefaultBackgroundLineConfig());
            entity.put();
            defaultBackgroundLineConfig.setTarget(entity);
            ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig = target.getLastBackgroundLineConfig();
            BackgroundLineConfigEntity entity2 = ConvertExtKt.toEntity(getGraphControl().getBackgroundLineConfig());
            entity2.put();
            lastBackgroundLineConfig.setTarget(entity2);
            ToOne<MoveConfigEntity> moveConfig = target.getMoveConfig();
            MoveConfigEntity entity3 = ConvertExtKt.toEntity(getBoardControl().getBoardConfig().getMoveActionConfig());
            entity3.put();
            moveConfig.setTarget(entity3);
            target.put();
        }
        if (getPageEntity().isChange()) {
            getPageEntity().setChange(false);
            getPageEntity().setCommandFileName("");
            getPageEntity().setCommandIndex(-1);
            getPageEntity().put();
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void addEventListener(@NotNull EventListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getRouterRecord().getCommandRecord().registerEventListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void addGraphDeleteListener(@NotNull GraphDeleteListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getActionManager().getMGraphDeleteListenerList().add(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public ImageGraph addImage(@NotNull String path, @NotNull EzyPositionEnum$PositionEnum position, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType, boolean loadWithCameraMatrix) throws OutOfMaxImageCountException {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(position, "position");
        AbstractC5830k.m5330g(scaleType, "scaleType");
        if (getImageGraphCount() >= getBoardControl().getBoardConfig().getMaxImageSize()) {
            throw new OutOfMaxImageCountException();
        }
        File fileSaveFileToLocal = PageControlExtKt.saveFileToLocal(this, path);
        if (fileSaveFileToLocal == null) {
            return null;
        }
        return addImageGraphFromLocal$default(this, fileSaveFileToLocal, position, scaleType, null, null, loadWithCameraMatrix, 24, null);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @NotNull
    public List<ImageGraph> addImageList(@NotNull List<String> pathList, @NotNull EzyPositionEnum$PositionEnum position, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType) throws OutOfMaxImageCountException {
        String fileSignature$default;
        AbstractC5830k.m5330g(pathList, "pathList");
        EzyPositionEnum$PositionEnum position2 = position;
        AbstractC5830k.m5330g(position2, "position");
        EzyScaleTypeEnum$ScaleTypeEnum scaleType2 = scaleType;
        AbstractC5830k.m5330g(scaleType2, "scaleType");
        ArrayList arrayList = new ArrayList();
        int size = pathList.size();
        int i = 0;
        while (i < size) {
            String str = pathList.get(i);
            if (getImageGraphCount() >= getBoardControl().getBoardConfig().getMaxImageSize()) {
                throw new OutOfMaxImageCountException();
            }
            File fileSaveFileToLocal = PageControlExtKt.saveFileToLocal(this, str);
            if (fileSaveFileToLocal == null || (fileSignature$default = FileValidateUtils.getFileSignature$default(FileValidateUtils.INSTANCE, fileSaveFileToLocal, null, 2, null)) == null) {
                return arrayList;
            }
            String absolutePath = fileSaveFileToLocal.getAbsolutePath();
            AbstractC5830k.m5329f(absolutePath, "newFile.absolutePath");
            Float[] wHFromLocalByType$default = PageControlExtKt.getWHFromLocalByType$default(this, absolutePath, scaleType2, null, null, 12, null);
            Matrix translateMatrix$default = PageControlExtKt.getTranslateMatrix$default(this, wHFromLocalByType$default[0].floatValue(), wHFromLocalByType$default[1].floatValue(), position2, 0, 8, null);
            float multiImageOffset = getBoardControl().getBoardConfig().getMultiImageOffset() * i;
            translateMatrix$default.postTranslate(multiImageOffset, multiImageOffset);
            String name = fileSaveFileToLocal.getName();
            AbstractC5830k.m5329f(name, "newFile.name");
            ImageGraph imageGraphBuildImageGraph$default = buildImageGraph$default(this, name, fileSignature$default, wHFromLocalByType$default[0].floatValue(), wHFromLocalByType$default[1].floatValue(), translateMatrix$default, false, 32, null);
            if (imageGraphBuildImageGraph$default != null) {
                arrayList.add(imageGraphBuildImageGraph$default);
            }
            i++;
            position2 = position;
            scaleType2 = scaleType;
        }
        saveSnapshot();
        return arrayList;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void addRenderRectChangeListener(@NotNull RenderChangeListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getGraphControl().registerRenderRectFChangeListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public ImageGraph addSpecialImage(@NotNull String path) throws OutOfMaxImageCountException {
        String fileSignature$default;
        AbstractC5830k.m5330g(path, "path");
        if (getImageGraphCount() >= getBoardControl().getBoardConfig().getMaxImageSize()) {
            throw new OutOfMaxImageCountException();
        }
        File fileSaveFileToLocal = PageControlExtKt.saveFileToLocal(this, path);
        if (fileSaveFileToLocal == null || (fileSignature$default = FileValidateUtils.getFileSignature$default(FileValidateUtils.INSTANCE, fileSaveFileToLocal, null, 2, null)) == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        float f = options.outWidth;
        float f7 = options.outHeight;
        if (getGraphControl().getRootGraph() == null) {
            return null;
        }
        String name = fileSaveFileToLocal.getName();
        AbstractC5830k.m5329f(name, "newFile.name");
        Matrix matrixCalculateMatrixForSpecial = calculateMatrixForSpecial(f, f7);
        matrixCalculateMatrixForSpecial.postConcat(getMatrixAdapter().getCameraMatrix());
        ImageGraph imageGraphBuildImageGraph$default = buildImageGraph$default(this, name, fileSignature$default, f, f7, matrixCalculateMatrixForSpecial, false, 32, null);
        saveSnapshot();
        return imageGraphBuildImageGraph$default;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public TextGraph addText(@NotNull String content, @NotNull EzyPositionEnum$PositionEnum position, int offset) throws InvalidProtocolBufferException {
        CommandInfoEntity commandInfoEntityAddTextGraphCommand;
        AbstractC5830k.m5330g(content, "content");
        AbstractC5830k.m5330g(position, "position");
        Paint paint = new Paint();
        paint.setColor(getBoardControl().getBoardConfig().getAddTextOriginalTextColor());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(getBoardControl().getBoardConfig().getAddTextOriginalTextSize());
        paint.setDither(true);
        paint.setAntiAlias(true);
        float fWidth = getBoardControl().getBoardConfig().getAddTextRectF().width();
        float fHeight = getBoardControl().getBoardConfig().getAddTextRectF().height();
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * TextGraphUtils.INSTANCE.calculateTextToList(content, paint, fWidth).size();
        float f = size > fHeight ? size : fHeight;
        String strRootGraphId = getGraphControl().rootGraphId();
        if (strRootGraphId == null || (commandInfoEntityAddTextGraphCommand = getRouterRecord().getCommandRecord().addTextGraphCommand(strRootGraphId, fWidth, f, GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand$CommandSource.CommandInfo.GraphData graphData = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(commandInfoEntityAddTextGraphCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC5830k.m5329f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, getSourceLoad());
        if (graph == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(PageControlExtKt.getTranslateMatrix(this, fWidth, f, position, offset));
        matrix.postConcat(MatrixExtKt.invert(getMatrixAdapter().getAdapterMatrix()));
        getActionManager().transformGraphEvent(AbstractC5806u.m5267f(graph), AbstractC5806u.m5247A(MatrixExtKt.toEzyMatrix(matrix, System.currentTimeMillis())));
        graph.concatMatrix(matrix);
        getGraphControl().addGraph(strRootGraphId, graph);
        return (TextGraph) graph;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void addWithdrawListener(@NotNull WithdrawListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getHistoryControl().addWithdrawListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void areaMoveEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof MoveAction) {
            ((MoveAction) currentAction).areaMovEnd(horizontalProgress, verticalProgress);
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void areaMoveStart() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof MoveAction) {
            ((MoveAction) currentAction).areaMoveStart();
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof MoveAction) {
            ((MoveAction) currentAction).areaMoving(horizontalProgress, verticalProgress);
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean canSave() {
        return getActionManager().getModeFactory().getWritingAction().executorsTaskDone() && getRouterRecord().getCanSave();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void changeImageOriginRect(@NotNull ImageGraph graph, @NotNull RectF newRectF) {
        AbstractC5830k.m5330g(graph, "graph");
        AbstractC5830k.m5330g(newRectF, "newRectF");
        IActionListener.DefaultImpls.changeGraph$default(getActionManager(), graph, EzyGraphEnum$GraphEnum.IMAGE_GRAPH, newRectF, null, null, null, null, null, 248, null);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean changeTextColor(int color) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof TextAction) {
            return ((TextAction) currentAction).changeTextColor(color);
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean changeTextSize(float size) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof TextAction) {
            return ((TextAction) currentAction).changeTextSize(size);
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void cleanPage(@Nullable IGraph interruptGraph) {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().getRootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : childGraph) {
            if (!AbstractC5830k.m5325b((IGraph) obj, interruptGraph)) {
                arrayList.add(obj);
            }
        }
        getActionManager().deleteGraphEvent(arrayList, System.currentTimeMillis());
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        GraphControl graphControl = getGraphControl();
        if ((arrayList instanceof InterfaceC6560a) && !(arrayList instanceof InterfaceC6562c)) {
            AbstractC5835p.m5359h(arrayList, "kotlin.collections.MutableList");
            throw null;
        }
        graphControl.delete(arrayList);
        saveSnapshot();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void clearHistoryList() {
        getHistoryControl().clearHistoryList();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void clearHistoryListWithoutCurrent() {
        getHistoryControl().clearHistoryListWithoutCurrent();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public int getBackgroundColor() {
        return getGraphControl().getBackgroundColor();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @NotNull
    public BackgroundLineConfig getBackgroundLineConfig() {
        return getGraphControl().getBackgroundLineConfig();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public IGraph getFirstGraph() {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().getRootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return null;
        }
        return (IGraph) AbstractC5805t.m5229i0(childGraph);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public int getGroupGraphSize() {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().getRootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return 0;
        }
        return childGraph.size();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public int getImageGraphCount() {
        return getGraphControl().getImageGraphCount();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public float getMoveHorizontalProgress() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof MoveAction) {
            return ((MoveAction) currentAction).getHorizontalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public float getMoveVerticalProgress() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        Log.i("MoveProgress", String.valueOf(currentAction));
        if (currentAction instanceof MoveAction) {
            return ((MoveAction) currentAction).getVerticalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @NotNull
    public List<String> getNoRecordImagePathList() {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().getRootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : childGraph) {
            if (obj instanceof ImageGraph) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            ImageGraph imageGraph = (ImageGraph) obj2;
            if (imageGraph.getFilePath() == null) {
                imageGraph.initPath();
            }
            String filePath = imageGraph.getFilePath();
            if (filePath == null) {
                filePath = "";
            }
            arrayList2.add(filePath);
        }
        return arrayList2;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @NotNull
    public List<String> getPageImagePathList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getNoRecordingImageList());
        arrayList.addAll(getRecordingImageList());
        return arrayList;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @NotNull
    public RectF getRenderRect() {
        return getMatrixAdapter().getAdapterRectF();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public float getZoomLevel() {
        return MatrixExtKt.getScaleX(getMatrixAdapter().getCameraMatrix());
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean isMicroTurnOn() {
        return getAudioControl().getIsMicroTurnOn();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean isPageNotEmpty() {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().getRootGraph();
        return (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null || !(childGraph.isEmpty() ^ true)) ? false : true;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean isRecording() {
        return getTimeRecord().getIsRecord();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public Bitmap minScreenshot(int horizontalOffset, int verticalOffset, int minWidth, int minHeight, boolean isBoardAsWidth, boolean isContainLimit, boolean isBoardAsTop, @Nullable IGraph interruptGraph) {
        return getGraphControl().minScreenShot(horizontalOffset, verticalOffset, minWidth, minHeight, isBoardAsWidth, isContainLimit, isBoardAsTop, interruptGraph);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void newSelectGraph(@NotNull List<String> graphIdList) {
        AbstractC5830k.m5330g(graphIdList, "graphIdList");
        getBoardControl().getBoardConfig().setMode(EzyModeEnum$ModeEnum.ACTION_NEW_SELECT);
        ITouchAction currentAction = getActionManager().getCurrentAction();
        AbstractC5830k.m5328e(currentAction, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction");
        ((NewSelectAction) currentAction).selectGraphList(graphIdList);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void onTouchEvent(@NotNull MotionEvent motionEvent) {
        AbstractC5830k.m5330g(motionEvent, "motionEvent");
        getActionManager().handleTouchEvent(motionEvent);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean recover() throws ExecutionException, InterruptedException {
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        HistoryData historyDataRecover = getHistoryControl().recover();
        if (historyDataRecover == null) {
            return false;
        }
        getRouterRecord().getCommandRecord().rebuild(historyDataRecover.getRootGraph(), historyDataRecover.getBackgroundColor(), System.currentTimeMillis());
        return true;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void removeEventListener(@NotNull EventListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getRouterRecord().getCommandRecord().unRegisterEventListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void removeGraphDeleteListener(@NotNull GraphDeleteListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getActionManager().getMGraphDeleteListenerList().remove(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void removeRenderRectChangeListener(@NotNull RenderChangeListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getGraphControl().unRegisterRenderRectFChangeListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void removeWithdrawListener(@NotNull WithdrawListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getHistoryControl().removeWithdrawListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void save() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        saveData(new InterfaceC6469a() { // from class: com.zykj.blackboard.core.edit.PageControl.save.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @Nullable
            public final Bitmap invoke() {
                return PageControl.this.getGraphControl().screenshot();
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void saveWithContentThumbnail() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        saveData(new InterfaceC6469a() { // from class: com.zykj.blackboard.core.edit.PageControl.saveWithContentThumbnail.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @Nullable
            public final Bitmap invoke() {
                return PageControl.this.getGraphControl().contentThumbnail();
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public Bitmap screenshot() {
        return getGraphControl().screenshot();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void selectedGraph(@NotNull String graphId) {
        AbstractC5830k.m5330g(graphId, "graphId");
        getBoardControl().getBoardConfig().setMode(EzyModeEnum$ModeEnum.ACTION_SELECT);
        ITouchAction currentAction = getActionManager().getCurrentAction();
        AbstractC5830k.m5328e(currentAction, "null cannot be cast to non-null type com.zykj.blackboard.core.action.SelectAction");
        ((SelectAction) currentAction).selectGraphList(AbstractC5806u.m5267f(graphId));
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setAreaMoveListener(@Nullable IAreaMoveListener listener) {
        getActionManager().setMAreaMoveListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setBackgroundColor(int backgroundColor) throws ExecutionException, InterruptedException {
        int backgroundColor2 = getGraphControl().getBackgroundColor();
        if (backgroundColor2 != backgroundColor) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        getGraphControl().updateBackgroundColor(backgroundColor);
        getGraphControl().reDrawFixView();
        BackgroundLineConfig backgroundLineConfig = getGraphControl().getBackgroundLineConfig();
        getRouterRecord().getCommandRecord().addConfigCommand(backgroundColor2, backgroundColor, backgroundLineConfig, backgroundLineConfig, System.currentTimeMillis());
        HeaderEntity target = getPageEntity().getHeaderEntity().getTarget();
        if (target != null) {
            target.setLastBackgroundColor(backgroundColor);
            target.put();
        }
        saveSnapshot();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setBackgroundColorWithLineConfig(int backgroundColor, @NotNull BackgroundLineConfig backgroundLineConfig) throws ExecutionException, InterruptedException { // 配置命令两次写入新底色，线条配置分别取修改前和修改后的值。
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        int backgroundColor2 = getGraphControl().getBackgroundColor();
        BackgroundLineConfig backgroundLineConfig2 = getGraphControl().getBackgroundLineConfig();
        if (backgroundColor2 != backgroundColor || !AbstractC5830k.m5325b(backgroundLineConfig2, backgroundLineConfig)) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        getGraphControl().updateBackgroundColor(backgroundColor);
        getGraphControl().updateBackgroundLineConfig(backgroundLineConfig);
        getGraphControl().reDrawFixView();
        getRouterRecord().getCommandRecord().addConfigCommand(backgroundColor, backgroundColor, backgroundLineConfig2, backgroundLineConfig, System.currentTimeMillis());
        HeaderEntity target = getPageEntity().getHeaderEntity().getTarget();
        if (target != null) {
            target.setLastBackgroundColor(backgroundColor);
            ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig = target.getLastBackgroundLineConfig();
            BackgroundLineConfigEntity entity = ConvertExtKt.toEntity(backgroundLineConfig);
            entity.put();
            lastBackgroundLineConfig.setTarget(entity);
            target.put();
        }
        saveSnapshot();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setGeometryCreateListener(@NotNull InterfaceC6471c listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getActionManager().setMGeometryCreateListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setGeometrySelectListener(@Nullable IGeometrySelectListener listener) {
        getActionManager().setMGeometrySelectListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setMicroPhoneListener(@NotNull MicroPhoneListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        getAudioControl().setListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setRecordListener(@NotNull RecordListener recordListener) {
        AbstractC5830k.m5330g(recordListener, "recordListener");
        getTimeRecord().setListener(recordListener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setTextSelectListener(@Nullable ITextSelectListener listener) {
        getActionManager().setMTextSelectListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setVisibleAreaProgress(@Nullable Float progressWidth, @Nullable Float progressHeight) {
        RectF adapterRectF = getMatrixAdapter().getAdapterRectF();
        BoardConfig boardConfig = getBoardControl().getBoardConfig();
        float fWidth = adapterRectF.width() - boardConfig.getWidth();
        float fHeight = adapterRectF.height() - boardConfig.getHeight();
        Float fValueOf = null;
        Float fValueOf2 = (progressWidth == null || adapterRectF.width() <= ((float) boardConfig.getWidth())) ? null : Float.valueOf((safeCountProgress((-adapterRectF.left) / fWidth) - safeCountProgress(progressWidth.floatValue())) * fWidth);
        if (progressHeight != null && adapterRectF.height() > boardConfig.getHeight()) {
            fValueOf = Float.valueOf((safeCountProgress((-adapterRectF.top) / fHeight) - safeCountProgress(progressHeight.floatValue())) * fHeight);
        }
        Matrix cameraMatrix = getMatrixAdapter().getCameraMatrix();
        getMatrixAdapter().postCameraTranslate(fValueOf2, fValueOf);
        setCameraEvent(MatrixExtKt.toEzyMatrix(cameraMatrix, 0L), MatrixExtKt.toEzyMatrix(getMatrixAdapter().getCameraMatrix(), 0L));
        getGraphControl().reDrawFixView();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void startRecord(boolean turnOnMicro) {
        getTimeRecord().startRecord(System.currentTimeMillis());
        if (turnOnMicro) {
            turnOnMicro();
        }
        getRecordingImageList().addAll(getNoRecordingImageList());
        getNoRecordingImageList().clear();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void stopRecord() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (isMicroTurnOn()) {
            turnOffMicro();
        }
        getRouterRecord().getCommandRecord().stopRecord(ITimeRecord.DefaultImpls.getDelayTime$default(getTimeRecord(), System.currentTimeMillis(), false, 2, null));
        getTimeRecord().stopRecord(System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void turnOffMicro() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        getAudioControl().stopRecord(new InterfaceC6473e() { // from class: com.zykj.blackboard.core.edit.PageControl.turnOffMicro.1
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, ((Number) obj2).longValue());
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull String fileName, long j7) {
                AbstractC5830k.m5330g(fileName, "fileName");
                PageControl.this.getRouterRecord().getAudioCommandRecord().updateAudio(fileName, j7);
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void turnOnMicro() {
        if (isRecording()) {
            getAudioControl().startRecord(new InterfaceC6471c() { // from class: com.zykj.blackboard.core.edit.PageControl.turnOnMicro.1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull String fileName) {
                    AbstractC5830k.m5330g(fileName, "fileName");
                    PageControl.this.getRouterRecord().getAudioCommandRecord().addAudio(fileName, 0L, System.currentTimeMillis());
                }
            });
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean withdraw() throws ExecutionException, InterruptedException {
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        HistoryData historyDataWithDraw = getHistoryControl().withDraw();
        if (historyDataWithDraw == null) {
            return false;
        }
        getRouterRecord().getCommandRecord().rebuild(historyDataWithDraw.getRootGraph(), historyDataWithDraw.getBackgroundColor(), System.currentTimeMillis());
        return true;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void zoomLevel(float pointX, float pointY, float scaleNum) {
        Matrix matrix = new Matrix(getMatrixAdapter().getCameraMatrix());
        float scaleX = MatrixExtKt.getScaleX(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.postScale(scaleX, scaleX, pointX, pointY);
        matrix.postConcat(MatrixExtKt.invert(matrix2));
        matrix.postScale(scaleNum, scaleNum, pointX, pointY);
        Matrix cameraMatrix = getMatrixAdapter().getCameraMatrix();
        getMatrixAdapter().setCameraMatrix(matrix);
        setCameraEvent(MatrixExtKt.toEzyMatrix(cameraMatrix, 0L), MatrixExtKt.toEzyMatrix(getMatrixAdapter().getCameraMatrix(), 0L));
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.WRITE_NEW_GROUP);
        getGraphControl().reDrawFixView();
        getGraphControl().updateBackgroundMatrix();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControl(@NotNull BoardControl boardControl, @NotNull RenderLayer renderLayer, @Nullable PageEntity pageEntity) {
        super(boardControl, renderLayer, pageEntity);
        AbstractC5830k.m5330g(boardControl, "boardControl");
        AbstractC5830k.m5330g(renderLayer, "renderLayer");
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public ImageGraph addImage(@NotNull Bitmap bitmap, @NotNull EzyPositionEnum$PositionEnum position, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType, boolean loadWithCameraMatrix, boolean isRecycle) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(position, "position");
        AbstractC5830k.m5330g(scaleType, "scaleType");
        return addImage(bitmap, "", position, scaleType, loadWithCameraMatrix, isRecycle);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public ImageGraph addImage(@NotNull Bitmap bitmap, @NotNull String filename, @NotNull EzyPositionEnum$PositionEnum position, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleType, boolean loadWithCameraMatrix, boolean isRecycle) throws OutOfMaxImageCountException {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(filename, "filename");
        AbstractC5830k.m5330g(position, "position");
        AbstractC5830k.m5330g(scaleType, "scaleType");
        if (getImageGraphCount() < getBoardControl().getBoardConfig().getMaxImageSize()) {
            File fileSaveBitmapToLocal = PageControlExtKt.saveBitmapToLocal(this, bitmap, isRecycle, filename);
            if (fileSaveBitmapToLocal == null) {
                return null;
            }
            return addImageGraphFromLocal(fileSaveBitmapToLocal, position, scaleType, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), loadWithCameraMatrix);
        }
        throw new OutOfMaxImageCountException();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    @Nullable
    public ImageGraph addSpecialImage(@NotNull Bitmap bitmap) throws OutOfMaxImageCountException {
        String fileSignature$default;
        AbstractC5830k.m5330g(bitmap, "bitmap");
        if (getImageGraphCount() < getBoardControl().getBoardConfig().getMaxImageSize()) {
            File fileSaveBitmapToLocal$default = PageControlExtKt.saveBitmapToLocal$default(this, bitmap, false, null, 4, null);
            if (fileSaveBitmapToLocal$default == null || (fileSignature$default = FileValidateUtils.getFileSignature$default(FileValidateUtils.INSTANCE, fileSaveBitmapToLocal$default, null, 2, null)) == null || getGraphControl().getRootGraph() == null) {
                return null;
            }
            String name = fileSaveBitmapToLocal$default.getName();
            AbstractC5830k.m5329f(name, "newFile.name");
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            Matrix matrixCalculateMatrixForSpecial = calculateMatrixForSpecial(bitmap.getWidth(), bitmap.getHeight());
            matrixCalculateMatrixForSpecial.postConcat(getMatrixAdapter().getCameraMatrix());
            ImageGraph imageGraphBuildImageGraph$default = buildImageGraph$default(this, name, fileSignature$default, width, height, matrixCalculateMatrixForSpecial, false, 32, null);
            saveSnapshot();
            return imageGraphBuildImageGraph$default;
        }
        throw new OutOfMaxImageCountException();
    }
}
