package com.zykj.view.board.board;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.R$string;
import com.zykj.view.board.board.AbstractC7674q;
import com.zykj.view.board.board.AbstractC7676s;
import com.zykj.view.board.board.AbstractC7677t;
import com.zykj.view.board.board.AbstractC7678u;
import com.zykj.view.board.board.AbstractC7682y;
import com.zykj.view.board.board.AbstractC7683z;
import com.zykj.view.board.board.BoardViewModel;
import com.zykj.view.utils.ZoomPointSolution;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import p025b7.AbstractC5141e2;
import p025b7.C5122a;
import p025b7.C5145f2;
import p025b7.C5154i1;
import p084d5.InterfaceC7751k;
import p117g5.InterfaceC8055c;
import p127h5.C8101d;
import p181m7.AbstractC9026c;
import p181m7.AbstractC9040q;
import p181m7.C9041r;
import p223q5.AbstractC9361a;
import p243s5.InterfaceC9475c;
import p253t5.InterfaceC9615a;
import p253t5.InterfaceC9616b;
import p253t5.InterfaceC9617c;
import p272v4.C9763b;
import p272v4.C9765d;

@Metadata(m13412d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J)\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020.¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020.¢\u0006\u0004\bH\u0010FJ\u0015\u0010J\u001a\u00020\u00062\u0006\u0010I\u001a\u00020.¢\u0006\u0004\bJ\u0010FJ\r\u0010K\u001a\u00020\u0006¢\u0006\u0004\bK\u0010\u0003J\r\u0010L\u001a\u00020\u0006¢\u0006\u0004\bL\u0010\u0003J\r\u0010M\u001a\u00020\u0006¢\u0006\u0004\bM\u0010\u0003J\r\u0010N\u001a\u00020\u0006¢\u0006\u0004\bN\u0010\u0003J\r\u0010O\u001a\u00020\u0006¢\u0006\u0004\bO\u0010\u0003J\r\u0010P\u001a\u00020\u0006¢\u0006\u0004\bP\u0010\u0003J\r\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010\u0003J\u0015\u0010T\u001a\u00020\u00062\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\u00020\u00062\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020#¢\u0006\u0004\b[\u0010\\J\u0015\u0010]\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020#¢\u0006\u0004\b]\u0010\\J\u0015\u0010^\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b^\u0010\\J\r\u0010_\u001a\u00020\u0006¢\u0006\u0004\b_\u0010\u0003J\r\u0010`\u001a\u00020\u0006¢\u0006\u0004\b`\u0010\u0003J\r\u0010a\u001a\u00020\u0006¢\u0006\u0004\ba\u0010\u0003J\r\u0010b\u001a\u00020\u0006¢\u0006\u0004\bb\u0010\u0003J\u0015\u0010c\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020#¢\u0006\u0004\bc\u0010\\J\u0015\u0010f\u001a\u00020\u00062\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ]\u0010r\u001a\u00020\u00062\n\b\u0002\u0010i\u001a\u0004\u0018\u00010h2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j2\b\b\u0002\u0010m\u001a\u00020l2\b\b\u0002\u0010n\u001a\u00020.2\b\b\u0002\u0010o\u001a\u00020j2\u0018\b\u0002\u0010q\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010j\u0012\u0004\u0012\u00020\u0006\u0018\u00010p¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\u00020\u00062\f\u0010u\u001a\b\u0012\u0004\u0012\u00020j0t2\b\b\u0002\u0010n\u001a\u00020.¢\u0006\u0004\bv\u0010wJ\u0015\u0010y\u001a\u00020\u00062\u0006\u0010x\u001a\u00020j¢\u0006\u0004\by\u0010zJ\u0015\u0010{\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020#¢\u0006\u0004\b{\u0010\\J\r\u0010|\u001a\u00020\u0006¢\u0006\u0004\b|\u0010\u0003J&\u0010\u007f\u001a\u00020\u00062\n\b\u0002\u0010}\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010~\u001a\u0004\u0018\u00010'¢\u0006\u0005\b\u007f\u0010\u0080\u0001J(\u0010\u0081\u0001\u001a\u00020\u00062\n\b\u0002\u0010}\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010~\u001a\u0004\u0018\u00010'¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J\u000f\u0010\u0082\u0001\u001a\u00020\u0006¢\u0006\u0005\b\u0082\u0001\u0010\u0003J\u001a\u0010\u0084\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0083\u0001\u001a\u00020.¢\u0006\u0005\b\u0084\u0001\u0010FJ\u000f\u0010\u0085\u0001\u001a\u00020\u0006¢\u0006\u0005\b\u0085\u0001\u0010\u0003J\u0018\u0010\u0087\u0001\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020.¢\u0006\u0005\b\u0087\u0001\u0010FJ{\u0010\u0090\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0088\u0001\u001a\u00020.2\t\b\u0002\u0010\u0089\u0001\u001a\u00020.2)\b\u0002\u0010\u008e\u0001\u001a\"\b\u0001\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u008c\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\u008a\u00012(\b\u0002\u0010\u008f\u0001\u001a!\b\u0001\u0012\u0004\u0012\u00020j\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u008c\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\u008a\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0016\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020j0t¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R-\u0010=\u001a\u0004\u0018\u00010<2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010<8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R,\u0010¤\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R,\u0010¬\u0001\u001a\u0005\u0018\u00010¥\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R,\u0010´\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R\u0018\u0010¶\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010PR\u0018\u0010º\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001f\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R$\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010À\u00018\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001f\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030Ç\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R$\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030Ç\u00010Ë\u00018\u0006¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001f\u0010Ó\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010É\u0001R$\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010Ë\u00018\u0006¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Í\u0001\u001a\u0006\bÕ\u0001\u0010Ï\u0001R\u001f\u0010Ù\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010É\u0001R$\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010Ë\u00018\u0006¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Í\u0001\u001a\u0006\bÛ\u0001\u0010Ï\u0001R\u001f\u0010ß\u0001\u001a\n\u0012\u0005\u0012\u00030Ý\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010É\u0001R$\u0010â\u0001\u001a\n\u0012\u0005\u0012\u00030Ý\u00010Ë\u00018\u0006¢\u0006\u0010\n\u0006\bà\u0001\u0010Í\u0001\u001a\u0006\bá\u0001\u0010Ï\u0001R\u001f\u0010å\u0001\u001a\n\u0012\u0005\u0012\u00030ã\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010É\u0001R$\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030ã\u00010Ë\u00018\u0006¢\u0006\u0010\n\u0006\bæ\u0001\u0010Í\u0001\u001a\u0006\bç\u0001\u0010Ï\u0001R\u001f\u0010ë\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010É\u0001R$\u0010î\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010Ë\u00018\u0006¢\u0006\u0010\n\u0006\bì\u0001\u0010Í\u0001\u001a\u0006\bí\u0001\u0010Ï\u0001R\u001f\u0010ñ\u0001\u001a\n\u0012\u0005\u0012\u00030ï\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010É\u0001R$\u0010ô\u0001\u001a\n\u0012\u0005\u0012\u00030ï\u00010Ë\u00018\u0006¢\u0006\u0010\n\u0006\bò\u0001\u0010Í\u0001\u001a\u0006\bó\u0001\u0010Ï\u0001R\u001e\u0010ö\u0001\u001a\n\u0012\u0005\u0012\u00030õ\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010É\u0001R#\u0010ø\u0001\u001a\n\u0012\u0005\u0012\u00030õ\u00010Ë\u00018\u0006¢\u0006\u000f\n\u0005\br\u0010Í\u0001\u001a\u0006\b÷\u0001\u0010Ï\u0001R\u001f\u0010û\u0001\u001a\n\u0012\u0005\u0012\u00030ù\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0001\u0010É\u0001R#\u0010ý\u0001\u001a\n\u0012\u0005\u0012\u00030ù\u00010Ë\u00018\u0006¢\u0006\u000f\n\u0005\by\u0010Í\u0001\u001a\u0006\bü\u0001\u0010Ï\u0001R\u001d\u0010þ\u0001\u001a\t\u0012\u0004\u0012\u00020.0Æ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010É\u0001R#\u0010\u0080\u0002\u001a\t\u0012\u0004\u0012\u00020.0Ë\u00018\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010Í\u0001\u001a\u0006\bÿ\u0001\u0010Ï\u0001R\u0019\u0010\u0082\u0002\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010Î\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001e\u0010\u0089\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010\u0093\u0001R\u0014\u0010\u008c\u0002\u001a\u00020.8F¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002¨\u0006\u008d\u0002"}, m13413d2 = {"Lcom/zykj/view/board/board/BoardViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Ld5/k;", "pageControl", "", "A0", "(Ld5/k;)V", "Lv4/b;", "boardConfig", "r0", "(Lv4/b;)V", "I0", "B0", "N0", "m0", "z0", "w0", "C0", "x0", "K0", "u0", "i0", "s0", "G0", "Q0", "R0", "i1", "a1", "h1", "g1", "C", "e1", "config", "", TypedValues.Custom.S_COLOR, "T0", "(Lv4/b;I)V", "", "right", "bottom", "O0", "(FF)V", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "boardControl", "", "haveCache", "", TypedValues.TransitionType.S_DURATION, "n0", "(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V", "Lcom/zykj/view/board/board/f;", "boardViewConfig", "w1", "(Lcom/zykj/view/board/board/f;)V", "Lb7/i1;", "boardSketchConfig", "J0", "(Lb7/i1;)V", "Lb7/a;", "boardCallbackConfig", "q0", "(Lb7/a;)V", "Lcom/zykj/view/board/board/s;", "mainToolType", "o1", "(Lcom/zykj/view/board/board/s;)V", "isRecover", "W0", "(Z)V", "isTouchable", "u1", "isZoomUp", "x1", "d1", "b1", "Y0", "Z0", "X0", "I", "h0", "Lcom/zykj/blackboard/enums/SelectGraphEnum;", "selectGraphEnum", "t1", "(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V", "Lcom/zykj/view/board/board/w;", "penType", "s1", "(Lcom/zykj/view/board/board/w;)V", "level", "r1", "(I)V", "p1", "q1", "J", "K", "M", "L", "j1", "Lcom/zykj/view/board/board/q;", "graphType", "l1", "(Lcom/zykj/view/board/board/q;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "path", "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;", "scaleTypeEnum", "isSelected", "filename", "Lkotlin/Function1;", "imagePathCallback", "z", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "pathList", "y", "(Ljava/util/List;Z)V", "content", "B", "(Ljava/lang/String;)V", "f1", "F", "horizontalProgress", "verticalProgress", "G", "(Ljava/lang/Float;Ljava/lang/Float;)V", "D", "c1", "isMicroPhoneOn", "m1", "N", "isOpen", "k1", "needClear", "isContentThumbnail", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "error", "callback", "e0", "(ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "d0", "()Ljava/util/List;", "a", "Lb7/i1;", "value", "b", "Lb7/a;", "Q", "()Lb7/a;", "c", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "Lt5/c;", "d", "Lt5/c;", "getTextEditView", "()Lt5/c;", "V0", "(Lt5/c;)V", "textEditView", "Lt5/b;", "e", "Lt5/b;", "getImageCropView", "()Lt5/b;", "U0", "(Lt5/b;)V", "imageCropView", "Lt5/a;", "f", "Lt5/a;", "getCustomColorView", "()Lt5/a;", "S0", "(Lt5/a;)V", "customColorView", "g", "zoomLevelIndex", "Landroid/graphics/PointF;", "h", "Landroid/graphics/PointF;", "zoomPointF", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/view/board/board/c;", "i", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_event", "Lkotlinx/coroutines/flow/SharedFlow;", "j", "Lkotlinx/coroutines/flow/SharedFlow;", "U", "()Lkotlinx/coroutines/flow/SharedFlow;", NotificationCompat.CATEGORY_EVENT, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/view/board/board/r;", "k", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_mainToolState", "Lkotlinx/coroutines/flow/StateFlow;", "l", "Lkotlinx/coroutines/flow/StateFlow;", "Z", "()Lkotlinx/coroutines/flow/StateFlow;", "mainToolState", "Lb7/f2;", "m", "_selectToolState", "n", "g0", "selectToolState", "Lcom/zykj/view/board/board/v;", "o", "_penToolState", "p", "b0", "penToolState", "Lcom/zykj/view/board/board/k;", "q", "_eraserToolState", "r", ExifInterface.GPS_DIRECTION_TRUE, "eraserToolState", "Lcom/zykj/view/board/board/p;", "s", "_graphToolState", "t", "X", "graphToolState", "Lcom/zykj/view/board/board/a;", "u", "_backgroundToolState", "v", "P", "backgroundToolState", "Lcom/zykj/view/board/board/o;", "w", "_extraUIState", "x", ExifInterface.LONGITUDE_WEST, "extraUIState", "Lcom/zykj/view/board/board/x;", "_recordState", "c0", "recordState", "Lcom/zykj/view/board/board/m;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "_expandState", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "expandState", "_loadFinished", "Y", "loadFinished", ExifInterface.LONGITUDE_EAST, "lastIsMicroPhoneOn", "a0", "()Ld5/k;", "R", "()Lv4/b;", "Lcom/zykj/view/board/board/z;", ExifInterface.LATITUDE_SOUTH, "currentZoomLevelList", "P0", "()Z", "isImageOutOfCount", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1494:1\n226#2,5:1495\n226#2,5:1500\n226#2,5:1505\n226#2,5:1510\n226#2,5:1515\n226#2,5:1520\n226#2,5:1525\n226#2,5:1537\n226#2,3:1542\n229#2,2:1547\n226#2,5:1549\n226#2,5:1561\n226#2,3:1566\n229#2,2:1571\n226#2,5:1580\n226#2,5:1585\n226#2,5:1590\n226#2,5:1595\n226#2,5:1600\n226#2,5:1605\n226#2,5:1610\n226#2,5:1615\n226#2,5:1620\n226#2,5:1625\n226#2,5:1630\n226#2,5:1635\n226#2,5:1640\n226#2,5:1645\n226#2,5:1650\n226#2,5:1655\n226#2,5:1660\n226#2,5:1665\n226#2,5:1670\n226#2,5:1675\n226#2,5:1681\n226#2,5:1686\n226#2,5:1691\n226#2,5:1696\n226#2,5:1705\n226#2,5:1710\n226#2,5:1715\n226#2,5:1720\n226#2,5:1725\n226#2,5:1730\n226#2,5:1735\n226#2,5:1740\n226#2,5:1745\n226#2,5:1750\n226#2,5:1755\n226#2,5:1760\n226#2,5:1765\n226#2,5:1770\n360#3,7:1530\n1869#3,2:1545\n360#3,7:1554\n230#3,2:1569\n360#3,7:1573\n1869#3:1701\n1870#3:1704\n1#4:1680\n1310#5,2:1702\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel\n*L\n170#1:1495,5\n173#1:1500,5\n286#1:1505,5\n293#1:1510,5\n300#1:1515,5\n309#1:1520,5\n315#1:1525,5\n349#1:1537,5\n358#1:1542,3\n358#1:1547,2\n389#1:1549,5\n436#1:1561,5\n608#1:1566,3\n608#1:1571,2\n635#1:1580,5\n653#1:1585,5\n656#1:1590,5\n694#1:1595,5\n755#1:1600,5\n767#1:1605,5\n775#1:1610,5\n789#1:1615,5\n799#1:1620,5\n810#1:1625,5\n824#1:1630,5\n838#1:1635,5\n895#1:1640,5\n971#1:1645,5\n980#1:1650,5\n995#1:1655,5\n1011#1:1660,5\n1018#1:1665,5\n1032#1:1670,5\n1043#1:1675,5\n1057#1:1681,5\n1069#1:1686,5\n1107#1:1691,5\n1132#1:1696,5\n1295#1:1705,5\n1308#1:1710,5\n1378#1:1715,5\n1397#1:1720,5\n1399#1:1725,5\n495#1:1730,5\n498#1:1735,5\n501#1:1740,5\n512#1:1745,5\n549#1:1750,5\n557#1:1755,5\n565#1:1760,5\n581#1:1765,5\n591#1:1770,5\n344#1:1530,7\n365#1:1545,2\n431#1:1554,7\n610#1:1569,2\n625#1:1573,7\n1183#1:1701\n1183#1:1704\n1185#1:1702,2\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardViewModel extends ViewModel {

    /* renamed from: A, reason: from kotlin metadata */
    public final MutableStateFlow _expandState;

    /* renamed from: B, reason: from kotlin metadata */
    public final StateFlow expandState;

    /* renamed from: C, reason: from kotlin metadata */
    public final MutableStateFlow _loadFinished;

    /* renamed from: D, reason: from kotlin metadata */
    public final StateFlow loadFinished;

    /* renamed from: E, reason: from kotlin metadata */
    public boolean lastIsMicroPhoneOn;

    /* renamed from: a, reason: from kotlin metadata */
    public C5154i1 boardSketchConfig;

    /* renamed from: b, reason: from kotlin metadata */
    public C5122a boardCallbackConfig;

    /* renamed from: c, reason: from kotlin metadata */
    public IBoardControl boardControl;

    /* renamed from: d, reason: from kotlin metadata */
    public InterfaceC9617c textEditView;

    /* renamed from: e, reason: from kotlin metadata */
    public InterfaceC9616b imageCropView;

    /* renamed from: f, reason: from kotlin metadata */
    public InterfaceC9615a customColorView;

    /* renamed from: g, reason: from kotlin metadata */
    public int zoomLevelIndex = AbstractC7667j.m11403e().indexOf(AbstractC7683z.d.f12339c);

    /* renamed from: h, reason: from kotlin metadata */
    public final PointF zoomPointF = new PointF();

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableSharedFlow _event;

    /* renamed from: j, reason: from kotlin metadata */
    public final SharedFlow event;

    /* renamed from: k, reason: from kotlin metadata */
    public final MutableStateFlow _mainToolState;

    /* renamed from: l, reason: from kotlin metadata */
    public final StateFlow mainToolState;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableStateFlow _selectToolState;

    /* renamed from: n, reason: from kotlin metadata */
    public final StateFlow selectToolState;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableStateFlow _penToolState;

    /* renamed from: p, reason: from kotlin metadata */
    public final StateFlow penToolState;

    /* renamed from: q, reason: from kotlin metadata */
    public final MutableStateFlow _eraserToolState;

    /* renamed from: r, reason: from kotlin metadata */
    public final StateFlow eraserToolState;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableStateFlow _graphToolState;

    /* renamed from: t, reason: from kotlin metadata */
    public final StateFlow graphToolState;

    /* renamed from: u, reason: from kotlin metadata */
    public final MutableStateFlow _backgroundToolState;

    /* renamed from: v, reason: from kotlin metadata */
    public final StateFlow backgroundToolState;

    /* renamed from: w, reason: from kotlin metadata */
    public final MutableStateFlow _extraUIState;

    /* renamed from: x, reason: from kotlin metadata */
    public final StateFlow extraUIState;

    /* renamed from: y, reason: from kotlin metadata */
    public final MutableStateFlow _recordState;

    /* renamed from: z, reason: from kotlin metadata */
    public final StateFlow recordState;

    /* renamed from: com.zykj.view.board.board.BoardViewModel$a */
    public static final /* synthetic */ class C7653a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12152a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12153b;

        static {
            int[] iArr = new int[ZoomPointSolution.values().length];
            try {
                iArr[ZoomPointSolution.f12913b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoomPointSolution.f12914c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoomPointSolution.f12915d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZoomPointSolution.f12916e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZoomPointSolution.f12918g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZoomPointSolution.f12917f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ZoomPointSolution.f12919h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ZoomPointSolution.f12920i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ZoomPointSolution.f12921j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f12152a = iArr;
            int[] iArr2 = new int[SelectGraphEnum.values().length];
            try {
                iArr2[SelectGraphEnum.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SelectGraphEnum.STROKE_HIGHLIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SelectGraphEnum.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[SelectGraphEnum.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[SelectGraphEnum.GEOMETRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            f12153b = iArr2;
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardViewModel$b */
    public static final class C7656b implements InterfaceC9475c {
        public C7656b() {
        }

        @Override // p243s5.InterfaceC9475c
        /* renamed from: a */
        public void mo11371a(InterfaceC8055c graph) {
            C5122a boardCallbackConfig;
            Function1 function1M2194g;
            Intrinsics.checkNotNullParameter(graph, "graph");
            if (!(graph instanceof ImageGraph) || (boardCallbackConfig = BoardViewModel.this.getBoardCallbackConfig()) == null || (function1M2194g = boardCallbackConfig.m2194g()) == null) {
                return;
            }
            String strM12932H = ((ImageGraph) graph).m12932H();
            if (strM12932H == null) {
                strM12932H = "";
            }
            function1M2194g.invoke(strM12932H);
        }
    }

    public BoardViewModel() {
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._event = mutableSharedFlowMutableSharedFlow$default;
        this.event = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C7675r(false, false, false, false, false, null, 63, null));
        this._mainToolState = MutableStateFlow;
        this.mainToolState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C5145f2(false, false, false, false, false, 31, null));
        this._selectToolState = MutableStateFlow2;
        this.selectToolState = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(new C7679v(false, false, null, 0, null, 0, false, WorkQueueKt.MASK, null));
        this._penToolState = MutableStateFlow3;
        this.penToolState = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(new C7668k(null, 1, null));
        this._eraserToolState = MutableStateFlow4;
        this.eraserToolState = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(new C7673p(false, false, false, false, null, 31, null));
        this._graphToolState = MutableStateFlow5;
        this.graphToolState = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(new C7658a(false, null, 3, null));
        this._backgroundToolState = MutableStateFlow6;
        this.backgroundToolState = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(new C7672o(null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 511, null));
        this._extraUIState = MutableStateFlow7;
        this.extraUIState = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(new C7681x(null, false, null, 7, null));
        this._recordState = MutableStateFlow8;
        this.recordState = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(new C7670m(null, 1, null));
        this._expandState = MutableStateFlow9;
        this.expandState = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._loadFinished = MutableStateFlow10;
        this.loadFinished = FlowKt.asStateFlow(MutableStateFlow10);
        this.lastIsMicroPhoneOn = true;
    }

    /* renamed from: A */
    public static /* synthetic */ void m11243A(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9, String str2, Function1 function1, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bitmap = null;
        }
        if ((i9 & 2) != 0) {
            str = null;
        }
        if ((i9 & 4) != 0) {
            scaleTypeEnum = EzyScaleTypeEnum.ScaleTypeEnum.MODE_ADAPTER_8;
        }
        if ((i9 & 8) != 0) {
            z9 = false;
        }
        if ((i9 & 16) != 0) {
            str2 = "";
        }
        if ((i9 & 32) != 0) {
            function1 = null;
        }
        boardViewModel.m11369z(bitmap, str, scaleTypeEnum, z9, str2, function1);
    }

    /* renamed from: D0 */
    public static final Unit m11244D0(BoardViewModel boardViewModel) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._recordState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7681x.m11467b((C7681x) value, AbstractC7682y.c.f12333f, false, null, 6, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static /* synthetic */ void m11245E(BoardViewModel boardViewModel, Float f10, Float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = null;
        }
        if ((i9 & 2) != 0) {
            f11 = null;
        }
        boardViewModel.m11293D(f10, f11);
    }

    /* renamed from: E0 */
    public static final Unit m11246E0(BoardViewModel boardViewModel, long j9) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._recordState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7681x.m11467b((C7681x) value, null, false, C9041r.f15220a.m14453b(j9), 3, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: F0 */
    public static final Unit m11247F0(BoardViewModel boardViewModel) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._recordState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7681x.m11467b((C7681x) value, AbstractC7682y.a.f12331f, false, null, 6, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static /* synthetic */ void m11248H(BoardViewModel boardViewModel, Float f10, Float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = null;
        }
        if ((i9 & 2) != 0) {
            f11 = null;
        }
        boardViewModel.m11295G(f10, f11);
    }

    /* renamed from: H0 */
    public static final Unit m11249H0(BoardViewModel boardViewModel, boolean z9, boolean z10) {
        MutableStateFlow mutableStateFlow = boardViewModel._mainToolState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z11 = z9;
            boolean z12 = z10;
            if (mutableStateFlow.compareAndSet(value, C7675r.m11434b((C7675r) value, false, false, z11, z12, false, null, 51, null))) {
                boardViewModel.m11311Q0();
                return Unit.INSTANCE;
            }
            z9 = z11;
            z10 = z12;
        }
    }

    /* renamed from: L0 */
    public static final Unit m11250L0(BoardViewModel boardViewModel, int i9) {
        AbstractC9040q.m14449s(Integer.valueOf(i9));
        C9763b c9763bM11312R = boardViewModel.m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16471V(i9);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: M0 */
    public static final Unit m11251M0(BoardViewModel boardViewModel, float f10) {
        AbstractC9040q.m14450t(Float.valueOf(f10));
        C9763b c9763bM11312R = boardViewModel.m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16474Y(f10);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m11252O(BoardViewModel boardViewModel) {
        InterfaceC7751k interfaceC7751kM11330a0 = boardViewModel.m11330a0();
        if (interfaceC7751kM11330a0 != null) {
            boardViewModel.m11288A0(interfaceC7751kM11330a0);
        } else {
            ToastUtils.showShort("画板初始化失败，请退出后重试", new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m11259f0(BoardViewModel boardViewModel, boolean z9, boolean z10, Function2 function2, Function2 function22, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            C5154i1 c5154i1 = boardViewModel.boardSketchConfig;
            z9 = c5154i1 != null ? c5154i1.m2239c() : true;
        }
        if ((i9 & 2) != 0) {
            C5154i1 c5154i12 = boardViewModel.boardSketchConfig;
            z10 = c5154i12 != null ? c5154i12.m2243g() : false;
        }
        if ((i9 & 4) != 0) {
            function2 = new BoardViewModel$getSavePath$1(null);
        }
        if ((i9 & 8) != 0) {
            function22 = new BoardViewModel$getSavePath$2(null);
        }
        boardViewModel.m11338e0(z9, z10, function2, function22);
    }

    /* renamed from: j0 */
    public static final Unit m11264j0(BoardViewModel boardViewModel) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 439, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: k0 */
    public static final Unit m11266k0(BoardViewModel boardViewModel, float f10, float f11) {
        MutableStateFlow mutableStateFlow = boardViewModel._extraUIState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            float f12 = f10;
            float f13 = f11;
            if (mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, null, null, false, false, f12, 0.0f, false, f13, 0.0f, 367, null))) {
                return Unit.INSTANCE;
            }
            f10 = f12;
            f11 = f13;
        }
    }

    /* renamed from: l0 */
    public static final Unit m11268l0(BoardViewModel boardViewModel) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, null, null, false, true, 0.0f, 0.0f, true, 0.0f, 0.0f, 439, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m11271n1(BoardViewModel boardViewModel, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = !((C7681x) boardViewModel._recordState.getValue()).m11471e();
        }
        boardViewModel.m11351m1(z9);
    }

    /* renamed from: o0 */
    public static final Unit m11273o0(BoardViewModel boardViewModel, InterfaceC7751k it) {
        Function0 function0M2195h;
        Intrinsics.checkNotNullParameter(it, "it");
        boardViewModel.m11288A0(it);
        boardViewModel._loadFinished.tryEmit(Boolean.TRUE);
        C5122a c5122a = boardViewModel.boardCallbackConfig;
        if (c5122a != null && (function0M2195h = c5122a.m2195h()) != null) {
            function0M2195h.invoke();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: p0 */
    public static final Unit m11275p0(BoardViewModel boardViewModel, Function1 function1) {
        InterfaceC7751k interfaceC7751kM11330a0 = boardViewModel.m11330a0();
        if (interfaceC7751kM11330a0 != null) {
            function1.invoke(interfaceC7751kM11330a0);
        } else {
            ToastUtils.showShort("画板加载失败，请退出后重试", new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t0 */
    public static final Unit m11280t0(BoardViewModel boardViewModel, CommandInfoEntity commandInfoEntity) {
        Object value;
        Intrinsics.checkNotNullParameter(commandInfoEntity, "<unused var>");
        MutableStateFlow mutableStateFlow = boardViewModel._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: v0 */
    public static final Unit m11283v0(BoardViewModel boardViewModel, int i9) {
        AbstractC9040q.m14444n(Integer.valueOf(i9));
        C9763b c9763bM11312R = boardViewModel.m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16490h0(i9);
        }
        boardViewModel.m11339e1();
        return Unit.INSTANCE;
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m11284v1(BoardViewModel boardViewModel, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = !((C7675r) boardViewModel._mainToolState.getValue()).m11440g();
        }
        boardViewModel.m11363u1(z9);
    }

    /* renamed from: y0 */
    public static final Unit m11287y0(BoardViewModel boardViewModel, boolean z9) {
        MutableStateFlow mutableStateFlow = boardViewModel._recordState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z10 = z9;
            if (mutableStateFlow.compareAndSet(value, C7681x.m11467b((C7681x) value, null, z10, null, 5, null))) {
                return Unit.INSTANCE;
            }
            z9 = z10;
        }
    }

    /* renamed from: A0 */
    public final void m11288A0(InterfaceC7751k pageControl) {
        LogUtils.m2956i("initPageControl Start");
        m11364w0(pageControl);
        m11292C0(pageControl);
        m11366x0(pageControl);
        m11302K0(pageControl);
        m11362u0(pageControl);
        m11345i0(pageControl);
        m11359s0(pageControl);
        m11296G0(pageControl);
        m11311Q0();
        m11313R0();
        LogUtils.m2956i("initPageControl Finished");
    }

    /* renamed from: B */
    public final void m11289B(String content) {
        C8101d c8101dM12099c;
        Object value;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 == null || (c8101dM12099c = InterfaceC7751k.a.m12099c(interfaceC7751kM11330a0, content, EzyPositionEnum.PositionEnum.CENTER, 0, 4, null)) == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this._mainToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7675r.m11434b((C7675r) value, false, false, false, false, false, AbstractC7676s.d.f12289e, 31, null)));
        interfaceC7751kM11330a0.mo7818F(CollectionsKt.listOf(c8101dM12099c.getId()));
    }

    /* renamed from: B0 */
    public final void m11290B0(C9763b boardConfig) {
        Object value;
        C7679v c7679v;
        AbstractC7678u abstractC7678uM14394g;
        AbstractC7678u abstractC7678u;
        int iM11451a;
        AbstractC7680w abstractC7680w;
        Integer numM14435e;
        MutableStateFlow mutableStateFlow = this._penToolState;
        do {
            value = mutableStateFlow.getValue();
            c7679v = (C7679v) value;
            Integer numM14434d = AbstractC9040q.m14434d();
            if (numM14434d == null || (abstractC7678uM14394g = AbstractC9026c.m14394g(numM14434d.intValue())) == null) {
                abstractC7678uM14394g = AbstractC7678u.a.f12303c;
            }
            abstractC7678u = abstractC7678uM14394g;
            iM11451a = abstractC7678u instanceof AbstractC7678u.b ? abstractC7678u.m11451a() : new AbstractC7678u.b(0, 1, null).m11451a();
            List listM11402d = AbstractC7667j.m11402d();
            Integer numM14436f = AbstractC9040q.m14436f();
            abstractC7680w = (AbstractC7680w) listM11402d.get(numM14436f != null ? numM14436f.intValue() : 0);
            numM14435e = AbstractC9040q.m14435e();
        } while (!mutableStateFlow.compareAndSet(value, C7679v.m11453b(c7679v, false, false, abstractC7680w, numM14435e != null ? numM14435e.intValue() : 0, abstractC7678u, iM11451a, false, 67, null)));
    }

    /* renamed from: C */
    public final void m11291C() {
        C7679v c7679v = (C7679v) this._penToolState.getValue();
        C9763b c9763bM11312R = m11312R();
        if (c9763bM11312R != null) {
            float fFloatValue = ((Number) c7679v.m11460h().m11465d().get(c7679v.m11459g())).floatValue();
            c9763bM11312R.m16502n0(fFloatValue);
            c9763bM11312R.m16479b0(fFloatValue);
            Integer numM14433c = AbstractC9040q.m14433c();
            m11317T0(c9763bM11312R, AbstractC9026c.m14395h(numM14433c != null ? numM14433c.intValue() : c7679v.m11457e().m11451a(), c7679v.m11460h().m11464c()));
        }
    }

    /* renamed from: C0 */
    public final void m11292C0(InterfaceC7751k pageControl) {
        AbstractC5141e2.m2216f(pageControl, new Function0() { // from class: b7.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m11244D0(this.f2355a);
            }
        }, new Function1() { // from class: b7.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m11246E0(this.f2358a, ((Long) obj).longValue());
            }
        }, new Function0() { // from class: b7.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m11247F0(this.f2361a);
            }
        });
    }

    /* renamed from: D */
    public final void m11293D(Float horizontalProgress, Float verticalProgress) {
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 != null) {
            interfaceC7751kM11330a0.areaMoveEnd(horizontalProgress, verticalProgress);
        }
    }

    /* renamed from: F */
    public final void m11294F() {
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 != null) {
            interfaceC7751kM11330a0.areaMoveStart();
        }
    }

    /* renamed from: G */
    public final void m11295G(Float horizontalProgress, Float verticalProgress) {
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 != null) {
            interfaceC7751kM11330a0.areaMoving(horizontalProgress, verticalProgress);
        }
    }

    /* renamed from: G0 */
    public final void m11296G0(InterfaceC7751k pageControl) {
        AbstractC5141e2.m2211a(pageControl, new Function2() { // from class: b7.r1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BoardViewModel.m11249H0(this.f2345a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* renamed from: I */
    public final void m11297I() {
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 != null) {
            InterfaceC7751k.a.m12101e(interfaceC7751kM11330a0, null, 1, null);
        }
    }

    /* renamed from: I0 */
    public final void m11298I0(C9763b boardConfig) {
        Object value;
        C5145f2 c5145f2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        List listM14437g = AbstractC9040q.m14437g();
        if (listM14437g == null) {
            listM14437g = AbstractC9361a.m15336b();
        }
        boardConfig.m16510r0(listM14437g);
        MutableStateFlow mutableStateFlow = this._selectToolState;
        do {
            value = mutableStateFlow.getValue();
            c5145f2 = (C5145f2) value;
            Iterator it = listM14437g.iterator();
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            while (it.hasNext()) {
                int i9 = C7653a.f12153b[((SelectGraphEnum) it.next()).ordinal()];
                if (i9 == 1) {
                    z9 = true;
                } else if (i9 == 2) {
                    z10 = true;
                } else if (i9 == 3) {
                    z11 = true;
                } else if (i9 == 4) {
                    z12 = true;
                } else {
                    if (i9 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z13 = true;
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, c5145f2.m2231a(z9, z10, z11, z12, z13)));
    }

    /* renamed from: J */
    public final void m11299J() {
        Object value;
        C7679v c7679vM11453b;
        MutableStateFlow mutableStateFlow = this._penToolState;
        do {
            value = mutableStateFlow.getValue();
            c7679vM11453b = (C7679v) value;
            if (c7679vM11453b.m11461i()) {
                c7679vM11453b = C7679v.m11453b(c7679vM11453b, false, false, null, 0, null, 0, false, 63, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, c7679vM11453b));
    }

    /* renamed from: J0 */
    public final void m11300J0(C5154i1 boardSketchConfig) {
        Intrinsics.checkNotNullParameter(boardSketchConfig, "boardSketchConfig");
        this.boardSketchConfig = boardSketchConfig;
        this.zoomLevelIndex = m11314S().indexOf(AbstractC7683z.d.f12339c);
    }

    /* renamed from: K */
    public final void m11301K() {
        Object value;
        m11299J();
        if (Intrinsics.areEqual(((C7675r) this._mainToolState.getValue()).m11436c(), AbstractC7676s.d.f12289e)) {
            return;
        }
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, AbstractC7677t.d.f12298f, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: K0 */
    public final void m11302K0(InterfaceC7751k pageControl) {
        AbstractC5141e2.m2217g(pageControl, new Function1() { // from class: b7.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m11250L0(this.f2365a, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: b7.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m11251M0(this.f2320a, ((Float) obj).floatValue());
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        kotlin.Result.m24758constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11303L() {
        /*
            r14 = this;
            r14.m11299J()
            kotlinx.coroutines.flow.MutableStateFlow r0 = r14._extraUIState
        L5:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            com.zykj.view.board.board.o r2 = (com.zykj.view.board.board.C7672o) r2
            com.zykj.view.board.board.t$f r3 = com.zykj.view.board.board.AbstractC7677t.f.f12300f
            r12 = 510(0x1fe, float:7.15E-43)
            r13 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.zykj.view.board.board.o r2 = com.zykj.view.board.board.C7672o.m11412b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto L5
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L35
            d5.k r0 = r14.m11330a0()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L35
            r0.mo7818F(r1)     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r0 = move-exception
            goto L3c
        L37:
            r0 = 0
        L38:
            kotlin.Result.m24758constructorimpl(r0)     // Catch: java.lang.Throwable -> L35
            return
        L3c:
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m24758constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.m11303L():void"); // DEX body: android/随身答/smali_classes5/com/zykj/view/board/board/BoardViewModel.smali:3903
    }

    /* renamed from: M */
    public final void m11304M() {
        Object value;
        Unit unit;
        m11299J();
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, AbstractC7677t.d.f12298f, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        if (Intrinsics.areEqual(((C7675r) this._mainToolState.getValue()).m11436c(), AbstractC7676s.d.f12289e)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
                if (interfaceC7751kM11330a0 != null) {
                    interfaceC7751kM11330a0.mo7818F(CollectionsKt.emptyList());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m24758constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m24758constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    /* renamed from: N */
    public final void m11305N() {
        Object value;
        Object value2;
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        MutableStateFlow mutableStateFlow2 = this._recordState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, C7681x.m11467b((C7681x) value2, AbstractC7682y.b.f12332f, false, null, 6, null)));
        IBoardControl.DefaultImpls.m7810b(iBoardControl, 0, null, 2, null);
        IBoardControl.DefaultImpls.m7809a(iBoardControl, false, new Function0() { // from class: b7.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m11252O(this.f2317a);
            }
        }, 1, null);
    }

    /* renamed from: N0 */
    public final void m11306N0(C9763b boardConfig) {
        boardConfig.m16470U("");
        Integer numM14438h = AbstractC9040q.m14438h();
        boardConfig.m16471V(numM14438h != null ? numM14438h.intValue() : ((C7679v) this._penToolState.getValue()).m11457e().m11451a());
        Float fM14439i = AbstractC9040q.m14439i();
        if (fM14439i != null) {
            boardConfig.m16474Y(fM14439i.floatValue());
        }
        boardConfig.m16485f().right = 600.0f;
        boardConfig.m16512s0(this.textEditView);
    }

    /* renamed from: O0 */
    public final void m11307O0(float right, float bottom) {
        float f10 = 2;
        float f11 = right / f10;
        float f12 = bottom / f10;
        PointF pointF = this.zoomPointF;
        C5154i1 c5154i1 = this.boardSketchConfig;
        ZoomPointSolution zoomPointSolutionM2242f = c5154i1 != null ? c5154i1.m2242f() : null;
        switch (zoomPointSolutionM2242f == null ? -1 : C7653a.f12152a[zoomPointSolutionM2242f.ordinal()]) {
            case 1:
                pointF.set(0.0f, 0.0f);
                break;
            case 2:
                pointF.set(right, 0.0f);
                break;
            case 3:
                pointF.set(0.0f, bottom);
                break;
            case 4:
                pointF.set(right, bottom);
                break;
            case 5:
                pointF.set(0.0f, f12);
                break;
            case 6:
                pointF.set(f11, 0.0f);
                break;
            case 7:
                pointF.set(right, f12);
                break;
            case 8:
                pointF.set(f11, bottom);
                break;
            case 9:
                pointF.set(f11, f12);
                break;
            default:
                pointF.set(f11, 0.0f);
                break;
        }
    }

    /* renamed from: P, reason: from getter */
    public final StateFlow getBackgroundToolState() {
        return this.backgroundToolState;
    }

    /* renamed from: P0 */
    public final boolean m11309P0() {
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        int iMo7845y = interfaceC7751kM11330a0 != null ? interfaceC7751kM11330a0.mo7845y() : 0;
        C5154i1 c5154i1 = this.boardSketchConfig;
        return iMo7845y >= (c5154i1 != null ? c5154i1.m2238b() : 3);
    }

    /* renamed from: Q, reason: from getter */
    public final C5122a getBoardCallbackConfig() {
        return this.boardCallbackConfig;
    }

    /* renamed from: Q0 */
    public final void m11311Q0() {
        Object value;
        C7658a c7658a;
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 == null) {
            return;
        }
        int backgroundColor = interfaceC7751kM11330a0.getBackgroundColor();
        MutableStateFlow mutableStateFlow = this._backgroundToolState;
        do {
            value = mutableStateFlow.getValue();
            c7658a = (C7658a) value;
            for (AbstractC7659b abstractC7659b : AbstractC7667j.m11399a()) {
                if (abstractC7659b.m11381a() == backgroundColor) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } while (!mutableStateFlow.compareAndSet(value, C7658a.m11377b(c7658a, false, abstractC7659b, 1, null)));
    }

    /* renamed from: R */
    public final C9763b m11312R() {
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl != null) {
            return iBoardControl.getConfig();
        }
        return null;
    }

    /* renamed from: R0 */
    public final void m11313R0() {
        C9763b c9763bM11312R;
        Object value;
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 == null || (c9763bM11312R = m11312R()) == null) {
            return;
        }
        float fMo7833n = interfaceC7751kM11330a0.mo7833n();
        Iterator it = m11314S().iterator();
        int iIndexOf = 0;
        while (true) {
            if (!it.hasNext()) {
                iIndexOf = -1;
                break;
            } else if (((AbstractC7683z) it.next()).m11476a() == fMo7833n) {
                break;
            } else {
                iIndexOf++;
            }
        }
        if (iIndexOf == -1) {
            iIndexOf = m11314S().indexOf(AbstractC7683z.d.f12339c);
        }
        this.zoomLevelIndex = iIndexOf;
        float f10 = 1;
        float fM16523b = f10 / (c9763bM11312R.m16519z().m16523b() * fMo7833n);
        float fM16524c = f10 / (c9763bM11312R.m16519z().m16524c() * fMo7833n);
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, null, null, false, false, interfaceC7751kM11330a0.getMoveVerticalProgress(), fM16523b, false, interfaceC7751kM11330a0.getMoveHorizontalProgress(), fM16524c, 79, null)));
    }

    /* renamed from: S */
    public final List m11314S() {
        C5154i1 c5154i1 = this.boardSketchConfig;
        return (c5154i1 == null || !c5154i1.m2241e()) ? AbstractC7667j.m11403e() : AbstractC7667j.m11404f();
    }

    /* renamed from: S0 */
    public final void m11315S0(InterfaceC9615a interfaceC9615a) {
        this.customColorView = interfaceC9615a;
    }

    /* renamed from: T, reason: from getter */
    public final StateFlow getEraserToolState() {
        return this.eraserToolState;
    }

    /* renamed from: T0 */
    public final void m11317T0(C9763b config, int color) {
        Method method;
        int i9 = color | ViewCompat.MEASURED_STATE_MASK;
        try {
            Result.Companion companion = Result.INSTANCE;
            config.m16500m0(color);
            Result.m24758constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        try {
            config.m16477a0(color);
            Result.m24758constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m24758constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            config.m16490h0(i9);
            Result.m24758constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m24758constructorimpl(ResultKt.createFailure(th3));
        }
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"setGeometryPaintColor", "setGeometryColor", "setGeometryStrokeColor", "setGraphColor", "setShapeColor", "setStrokeColor"})) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Method[] methods = config.getClass().getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                int length = methods.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i10];
                    if (Intrinsics.areEqual(method.getName(), str) && method.getParameterTypes().length == 1 && Intrinsics.areEqual(method.getParameterTypes()[0], Integer.TYPE)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                Result.m24758constructorimpl(method != null ? method.invoke(config, Integer.valueOf(i9)) : null);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m24758constructorimpl(ResultKt.createFailure(th4));
            }
        }
    }

    /* renamed from: U, reason: from getter */
    public final SharedFlow getEvent() {
        return this.event;
    }

    /* renamed from: U0 */
    public final void m11319U0(InterfaceC9616b interfaceC9616b) {
        this.imageCropView = interfaceC9616b;
    }

    /* renamed from: V, reason: from getter */
    public final StateFlow getExpandState() {
        return this.expandState;
    }

    /* renamed from: V0 */
    public final void m11321V0(InterfaceC9617c interfaceC9617c) {
        this.textEditView = interfaceC9617c;
    }

    /* renamed from: W, reason: from getter */
    public final StateFlow getExtraUIState() {
        return this.extraUIState;
    }

    /* renamed from: W0 */
    public final void m11323W0(boolean isRecover) {
        if (isRecover) {
            InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
            if (interfaceC7751kM11330a0 != null) {
                interfaceC7751kM11330a0.mo7814B();
                return;
            }
            return;
        }
        InterfaceC7751k interfaceC7751kM11330a02 = m11330a0();
        if (interfaceC7751kM11330a02 != null) {
            interfaceC7751kM11330a02.mo7835o();
        }
    }

    /* renamed from: X, reason: from getter */
    public final StateFlow getGraphToolState() {
        return this.graphToolState;
    }

    /* renamed from: X0 */
    public final void m11325X0() {
        Object value;
        C7672o c7672o;
        AbstractC7677t abstractC7677t;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7672o = (C7672o) value;
            AbstractC7677t abstractC7677tM11417f = c7672o.m11417f();
            abstractC7677t = AbstractC7677t.a.f12295f;
            if (Intrinsics.areEqual(abstractC7677tM11417f, abstractC7677t)) {
                abstractC7677t = AbstractC7677t.d.f12298f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b(c7672o, abstractC7677t, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: Y, reason: from getter */
    public final StateFlow getLoadFinished() {
        return this.loadFinished;
    }

    /* renamed from: Y0 */
    public final void m11327Y0() {
        Object value;
        C7672o c7672o;
        AbstractC7677t abstractC7677t;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7672o = (C7672o) value;
            AbstractC7677t abstractC7677tM11417f = c7672o.m11417f();
            abstractC7677t = AbstractC7677t.b.f12296f;
            if (Intrinsics.areEqual(abstractC7677tM11417f, abstractC7677t)) {
                abstractC7677t = AbstractC7677t.d.f12298f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b(c7672o, abstractC7677t, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: Z, reason: from getter */
    public final StateFlow getMainToolState() {
        return this.mainToolState;
    }

    /* renamed from: Z0 */
    public final void m11329Z0() {
        Object value;
        C7672o c7672o;
        AbstractC7677t abstractC7677t;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7672o = (C7672o) value;
            AbstractC7677t abstractC7677tM11417f = c7672o.m11417f();
            abstractC7677t = AbstractC7677t.c.f12297f;
            if (Intrinsics.areEqual(abstractC7677tM11417f, abstractC7677t)) {
                abstractC7677t = AbstractC7677t.d.f12298f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b(c7672o, abstractC7677t, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: a0 */
    public final InterfaceC7751k m11330a0() {
        List listMo7797d;
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl == null || (listMo7797d = iBoardControl.mo7797d()) == null) {
            return null;
        }
        return (InterfaceC7751k) CollectionsKt.firstOrNull(listMo7797d);
    }

    /* renamed from: a1 */
    public final void m11331a1() {
        Object value;
        MutableStateFlow mutableStateFlow = this._penToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7679v.m11453b((C7679v) value, false, false, null, 0, null, 0, !r2.m11461i(), 63, null)));
    }

    /* renamed from: b0, reason: from getter */
    public final StateFlow getPenToolState() {
        return this.penToolState;
    }

    /* renamed from: b1 */
    public final void m11333b1() {
        Object value;
        C7672o c7672o;
        AbstractC7677t abstractC7677t;
        Object value2;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7672o = (C7672o) value;
            AbstractC7677t abstractC7677tM11417f = c7672o.m11417f();
            abstractC7677t = AbstractC7677t.e.f12299f;
            if (Intrinsics.areEqual(abstractC7677tM11417f, abstractC7677t)) {
                abstractC7677t = AbstractC7677t.d.f12298f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b(c7672o, abstractC7677t, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        MutableStateFlow mutableStateFlow2 = this._penToolState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, C7679v.m11453b((C7679v) value2, false, false, null, 0, null, 0, false, 63, null)));
    }

    /* renamed from: c0, reason: from getter */
    public final StateFlow getRecordState() {
        return this.recordState;
    }

    /* renamed from: c1 */
    public final void m11335c1() {
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 == null) {
            return;
        }
        if (!interfaceC7751kM11330a0.mo7844w()) {
            interfaceC7751kM11330a0.mo7840s(this.lastIsMicroPhoneOn);
        } else {
            this.lastIsMicroPhoneOn = interfaceC7751kM11330a0.mo7832m();
            interfaceC7751kM11330a0.stopRecord();
        }
    }

    /* renamed from: d0 */
    public final List m11336d0() {
        List listMo7830l;
        if (!((Boolean) this.loadFinished.getValue()).booleanValue()) {
            return CollectionsKt.emptyList();
        }
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        return (interfaceC7751kM11330a0 == null || (listMo7830l = interfaceC7751kM11330a0.mo7830l()) == null) ? CollectionsKt.emptyList() : listMo7830l;
    }

    /* renamed from: d1 */
    public final void m11337d1() {
        Object value;
        C7672o c7672o;
        AbstractC7677t abstractC7677t;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7672o = (C7672o) value;
            AbstractC7677t abstractC7677tM11417f = c7672o.m11417f();
            abstractC7677t = AbstractC7677t.f.f12300f;
            if (Intrinsics.areEqual(abstractC7677tM11417f, abstractC7677t)) {
                abstractC7677t = AbstractC7677t.d.f12298f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b(c7672o, abstractC7677t, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: e0 */
    public final void m11338e0(boolean needClear, boolean isContentThumbnail, Function2 error, Function2 callback) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$getSavePath$3(this, needClear, isContentThumbnail, callback, error, null), 3, null);
    }

    /* renamed from: e1 */
    public final void m11339e1() {
        boolean zAreEqual = Intrinsics.areEqual(((C7675r) this._mainToolState.getValue()).m11436c(), AbstractC7676s.b.f12287e);
        boolean zAreEqual2 = Intrinsics.areEqual(((C7673p) this._graphToolState.getValue()).m11427e(), AbstractC7674q.a.f12272e);
        if (!zAreEqual || zAreEqual2) {
            return;
        }
        m11291C();
    }

    /* renamed from: f1 */
    public final void m11340f1(int level) {
        Object value;
        AbstractC7659b abstractC7659b = (AbstractC7659b) AbstractC7667j.m11399a().get(level);
        MutableStateFlow mutableStateFlow = this._backgroundToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7658a.m11377b((C7658a) value, false, abstractC7659b, 1, null)));
        C9763b c9763bM11312R = m11312R();
        if (c9763bM11312R == null) {
            return;
        }
        c9763bM11312R.m16475Z(abstractC7659b.m11381a());
        BackgroundLineConfig backgroundLineConfigM16493j = c9763bM11312R.m16493j();
        backgroundLineConfigM16493j.m7073e(abstractC7659b.m11382b());
        backgroundLineConfigM16493j.m7075g(abstractC7659b.m11384d());
        backgroundLineConfigM16493j.m7074f(abstractC7659b.m11383c());
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 == null) {
            return;
        }
        if (abstractC7659b.m11381a() != interfaceC7751kM11330a0.getBackgroundColor()) {
            interfaceC7751kM11330a0.mo7824g(abstractC7659b.m11381a(), c9763bM11312R.m16493j());
        }
        AbstractC9040q.m14442l(Integer.valueOf(abstractC7659b.m11381a()));
    }

    /* renamed from: g0, reason: from getter */
    public final StateFlow getSelectToolState() {
        return this.selectToolState;
    }

    /* renamed from: g1 */
    public final void m11342g1() {
        C7668k c7668k = (C7668k) this._eraserToolState.getValue();
        C9763b c9763bM11312R = m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16498l0(EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING);
            c9763bM11312R.m16484e0(c7668k.m11406b().m11408b());
        }
    }

    /* renamed from: h0 */
    public final void m11343h0() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$handleExpandClick$1(this, null), 3, null);
    }

    /* renamed from: h1 */
    public final void m11344h1() {
        C7679v c7679v = (C7679v) this._penToolState.getValue();
        C9763b c9763bM11312R = m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16498l0(c7679v.m11460h().m11462a());
            C9763b.m16449d0(c9763bM11312R, c7679v.m11460h().m11466e(), 0.0f, 0.0f, 6, null);
            float fFloatValue = ((Number) c7679v.m11460h().m11465d().get(c7679v.m11459g())).floatValue();
            c9763bM11312R.m16502n0(fFloatValue);
            c9763bM11312R.m16479b0(fFloatValue);
            int iM14395h = AbstractC9026c.m14395h(c7679v.m11457e().m11451a(), c7679v.m11460h().m11464c());
            c9763bM11312R.m16500m0(iM14395h);
            c9763bM11312R.m16477a0(iM14395h);
            if (AbstractC9040q.m14438h() == null) {
                c9763bM11312R.m16471V(c7679v.m11457e().m11451a());
            }
            if (AbstractC9040q.m14433c() == null) {
                m11317T0(c9763bM11312R, iM14395h);
            }
        }
    }

    /* renamed from: i0 */
    public final void m11345i0(InterfaceC7751k pageControl) {
        AbstractC5141e2.m2214d(pageControl, new Function0() { // from class: b7.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m11264j0(this.f2326a);
            }
        }, new Function2() { // from class: b7.n1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BoardViewModel.m11266k0(this.f2330a, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, new Function0() { // from class: b7.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m11268l0(this.f2334a);
            }
        });
    }

    /* renamed from: i1 */
    public final void m11346i1() {
        C5145f2 c5145f2 = (C5145f2) this._selectToolState.getValue();
        ArrayList arrayList = new ArrayList();
        if (c5145f2.m2235e()) {
            arrayList.add(SelectGraphEnum.STROKE);
        }
        if (c5145f2.m2233c()) {
            arrayList.add(SelectGraphEnum.STROKE_HIGHLIGHTER);
        }
        if (c5145f2.m2234d()) {
            arrayList.add(SelectGraphEnum.IMAGE);
        }
        if (c5145f2.m2236f()) {
            arrayList.add(SelectGraphEnum.TEXT);
        }
        if (c5145f2.m2232b()) {
            arrayList.add(SelectGraphEnum.GEOMETRY);
        }
        C9763b c9763bM11312R = m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16510r0(arrayList);
        }
        AbstractC9040q.m14448r(arrayList);
    }

    /* renamed from: j1 */
    public final void m11347j1(int level) {
        Object value;
        AbstractC7669l abstractC7669l = (AbstractC7669l) AbstractC7667j.m11400b().get(level);
        MutableStateFlow mutableStateFlow = this._eraserToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((C7668k) value).m11405a(abstractC7669l)));
        m11342g1();
        AbstractC9040q.m14443m(Float.valueOf(abstractC7669l.m11408b()));
    }

    /* renamed from: k1 */
    public final void m11348k1(boolean isOpen) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updateExpandState$1(this, isOpen, null), 3, null);
    }

    /* renamed from: l1 */
    public final void m11349l1(AbstractC7674q graphType) {
        AbstractC7674q abstractC7674q;
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        m11353o1(AbstractC7676s.b.f12287e);
        MutableStateFlow mutableStateFlow = this._graphToolState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            abstractC7674q = graphType;
            if (mutableStateFlow.compareAndSet(value, C7673p.m11423b((C7673p) value, false, false, false, false, abstractC7674q, 15, null))) {
                break;
            } else {
                graphType = abstractC7674q;
            }
        }
        C9763b c9763bM11312R = m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16498l0(EzyModeEnum.ModeEnum.ACTION_GEOMETRY);
            c9763bM11312R.m16488g0(abstractC7674q.m11430a());
        }
        m11291C();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11350m0(p272v4.C9763b r8) {
        /*
            r7 = this;
            java.lang.Integer r0 = p181m7.AbstractC9040q.m14431a()
            r1 = 0
            if (r0 == 0) goto L2e
            int r0 = r0.intValue()
            java.util.List r2 = com.zykj.view.board.board.AbstractC7667j.m11399a()
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L14:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r2.next()
            com.zykj.view.board.board.b r4 = (com.zykj.view.board.board.AbstractC7659b) r4
            int r4 = r4.m11381a()
            if (r4 != r0) goto L28
            goto L2c
        L28:
            int r3 = r3 + 1
            goto L14
        L2b:
            r3 = r5
        L2c:
            if (r3 != r5) goto L2f
        L2e:
            r3 = r1
        L2f:
            java.util.List r0 = com.zykj.view.board.board.AbstractC7667j.m11399a()
            java.lang.Object r0 = r0.get(r3)
            com.zykj.view.board.board.b r0 = (com.zykj.view.board.board.AbstractC7659b) r0
            kotlinx.coroutines.flow.MutableStateFlow r2 = r7._backgroundToolState
        L3b:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.zykj.view.board.board.a r4 = (com.zykj.view.board.board.C7658a) r4
            r5 = 0
            r6 = 1
            com.zykj.view.board.board.a r4 = com.zykj.view.board.board.C7658a.m11377b(r4, r1, r0, r6, r5)
            boolean r3 = r2.compareAndSet(r3, r4)
            if (r3 == 0) goto L3b
            int r1 = r0.m11381a()
            r8.m16475Z(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig r8 = r8.m16493j()
            int r1 = r0.m11382b()
            r8.m7073e(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig$BackgroundLineType r1 = r0.m11384d()
            r8.m7075g(r1)
            float r0 = r0.m11383c()
            r8.m7074f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.m11350m0(v4.b):void"); // DEX body: android/随身答/smali_classes5/com/zykj/view/board/board/BoardViewModel.smali:8179
    }

    /* renamed from: m1 */
    public final void m11351m1(boolean isMicroPhoneOn) {
        boolean z9;
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this._recordState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            z9 = isMicroPhoneOn;
            if (mutableStateFlow.compareAndSet(value, C7681x.m11467b((C7681x) value, null, z9, null, 5, null))) {
                break;
            } else {
                isMicroPhoneOn = z9;
            }
        }
        if (z9) {
            interfaceC7751kM11330a0.mo7820c();
            ToastUtils.showShort(R$string.turn_on_micro_phone);
        } else {
            interfaceC7751kM11330a0.mo7841t();
            ToastUtils.showShort(R$string.turn_off_micro_phone);
        }
    }

    /* renamed from: n0 */
    public final void m11352n0(IBoardControl boardControl, boolean haveCache, long duration) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(boardControl, "boardControl");
        LogUtils.m2956i("initBoardControl Start");
        this.boardControl = boardControl;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, null, null, haveCache, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        if (duration > 0) {
            MutableStateFlow mutableStateFlow2 = this._recordState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7681x.m11467b((C7681x) value2, AbstractC7682y.a.f12331f, false, C9041r.f15220a.m14453b(duration), 2, null)));
        }
        C9763b c9763bM11312R = m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16508q0(48.0f);
            C5154i1 c5154i1 = this.boardSketchConfig;
            if (c5154i1 != null) {
                c9763bM11312R.m16496k0(c5154i1.m2238b());
            }
            m11363u1(!Intrinsics.areEqual(AbstractC9040q.m14440j(), Boolean.FALSE));
            m11306N0(c9763bM11312R);
            m11350m0(c9763bM11312R);
            c9763bM11312R.m16494j0(this.imageCropView);
            m11370z0(c9763bM11312R);
            m11357r0(c9763bM11312R);
            m11290B0(c9763bM11312R);
            c9763bM11312R.m16504o0(this.customColorView);
            m11298I0(c9763bM11312R);
            m11353o1(AbstractC7676s.c.f12288e);
        }
        final Function1 function1 = new Function1() { // from class: b7.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m11273o0(this.f2348a, (InterfaceC7751k) obj);
            }
        };
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 != null) {
            LogUtils.m2956i("pageControl is not Null");
            function1.invoke(interfaceC7751kM11330a0);
        } else {
            LogUtils.m2956i("pageControl is Null");
            IBoardControl.DefaultImpls.m7809a(boardControl, false, new Function0() { // from class: b7.t1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BoardViewModel.m11275p0(this.f2351a, function1);
                }
            }, 1, null);
        }
        LogUtils.m2956i("initBoardControl Finished");
    }

    /* renamed from: o1 */
    public final void m11353o1(AbstractC7676s mainToolType) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        MutableStateFlow mutableStateFlow = this._mainToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7675r.m11434b((C7675r) value, false, false, false, false, false, mainToolType, 31, null)));
        if (!Intrinsics.areEqual(mainToolType, AbstractC7676s.b.f12287e)) {
            MutableStateFlow mutableStateFlow2 = this._graphToolState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7673p.m11423b((C7673p) value2, false, false, false, false, AbstractC7674q.a.f12272e, 15, null)));
        }
        if (Intrinsics.areEqual(mainToolType, AbstractC7676s.d.f12289e)) {
            C9763b c9763bM11312R = m11312R();
            if (c9763bM11312R != null) {
                c9763bM11312R.m16498l0(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(mainToolType, AbstractC7676s.c.f12288e)) {
            m11344h1();
        } else if (Intrinsics.areEqual(mainToolType, AbstractC7676s.a.f12286e)) {
            m11342g1();
        } else if (!Intrinsics.areEqual(mainToolType, AbstractC7676s.b.f12287e)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p1 */
    public final void m11354p1(int level) {
        Object value;
        AbstractC7678u abstractC7678u;
        Object value2;
        Object bVar = AbstractC7667j.m11401c().get(level);
        if (bVar instanceof AbstractC7678u.b) {
            bVar = new AbstractC7678u.b(((C7679v) this._penToolState.getValue()).m11458f());
        }
        MutableStateFlow mutableStateFlow = this._penToolState;
        do {
            value = mutableStateFlow.getValue();
            abstractC7678u = (AbstractC7678u) bVar;
        } while (!mutableStateFlow.compareAndSet(value, C7679v.m11453b((C7679v) value, false, false, null, 0, abstractC7678u, 0, false, 111, null)));
        boolean z9 = bVar instanceof AbstractC7678u.b;
        if (z9) {
            m11331a1();
        } else {
            MutableStateFlow mutableStateFlow2 = this._penToolState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7679v.m11453b((C7679v) value2, false, false, null, 0, null, 0, false, 63, null)));
        }
        if (z9 && ((AbstractC7678u) bVar).m11451a() == 0) {
            return;
        }
        m11344h1();
        m11339e1();
        AbstractC9040q.m14445o(Integer.valueOf(abstractC7678u.m11451a()));
    }

    /* renamed from: q0 */
    public final void m11355q0(C5122a boardCallbackConfig) {
        Intrinsics.checkNotNullParameter(boardCallbackConfig, "boardCallbackConfig");
        this.boardCallbackConfig = boardCallbackConfig;
    }

    /* renamed from: q1 */
    public final void m11356q1(int color) {
        MutableStateFlow mutableStateFlow = this._penToolState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            C7679v c7679v = (C7679v) value;
            int i9 = color;
            if (mutableStateFlow.compareAndSet(value, C7679v.m11453b(c7679v, false, false, null, 0, c7679v.m11457e() instanceof AbstractC7678u.b ? new AbstractC7678u.b(color) : c7679v.m11457e(), i9, false, 79, null))) {
                m11344h1();
                m11339e1();
                AbstractC9040q.m14445o(Integer.valueOf(i9));
                return;
            }
            color = i9;
        }
    }

    /* renamed from: r0 */
    public final void m11357r0(C9763b boardConfig) {
        Object value;
        Float fM14432b = AbstractC9040q.m14432b();
        int i9 = 0;
        if (fM14432b != null) {
            float fFloatValue = fM14432b.floatValue();
            Iterator it = AbstractC7667j.m11400b().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (((AbstractC7669l) it.next()).m11408b() == fFloatValue) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                i9 = i10;
            }
        }
        AbstractC7669l abstractC7669l = (AbstractC7669l) AbstractC7667j.m11400b().get(i9);
        MutableStateFlow mutableStateFlow = this._eraserToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((C7668k) value).m11405a(abstractC7669l)));
    }

    /* renamed from: r1 */
    public final void m11358r1(int level) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenSizeLevel$1(this, level, null), 3, null);
    }

    /* renamed from: s0 */
    public final void m11359s0(InterfaceC7751k pageControl) {
        AbstractC5141e2.m2212b(pageControl, new Function1() { // from class: b7.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m11280t0(this.f2338a, (CommandInfoEntity) obj);
            }
        });
    }

    /* renamed from: s1 */
    public final void m11360s1(AbstractC7680w penType) {
        Intrinsics.checkNotNullParameter(penType, "penType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenType$1(this, penType, null), 3, null);
    }

    /* renamed from: t1 */
    public final void m11361t1(SelectGraphEnum selectGraphEnum) {
        Object value;
        Intrinsics.checkNotNullParameter(selectGraphEnum, "selectGraphEnum");
        C5145f2 c5145f2 = (C5145f2) this._selectToolState.getValue();
        boolean zM2235e = c5145f2.m2235e();
        boolean zM2233c = c5145f2.m2233c();
        boolean zM2234d = c5145f2.m2234d();
        boolean zM2236f = c5145f2.m2236f();
        boolean zM2232b = c5145f2.m2232b();
        int i9 = C7653a.f12153b[selectGraphEnum.ordinal()];
        if (i9 == 1) {
            zM2235e = !zM2235e;
        } else if (i9 == 2) {
            zM2233c = !zM2233c;
        } else if (i9 == 3) {
            zM2234d = !zM2234d;
        } else if (i9 == 4) {
            zM2236f = !zM2236f;
        } else {
            if (i9 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            zM2232b = !zM2232b;
        }
        boolean z9 = zM2232b;
        boolean z10 = zM2235e;
        boolean z11 = zM2233c;
        boolean z12 = zM2234d;
        boolean z13 = zM2236f;
        if (!z10 && !z11 && !z12 && !z13 && !z9) {
            ToastUtils.showShort("最少需要选中一个素材类型", new Object[0]);
            return;
        }
        MutableStateFlow mutableStateFlow = this._selectToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((C5145f2) value).m2231a(z10, z11, z12, z13, z9)));
        m11346i1();
    }

    /* renamed from: u0 */
    public final void m11362u0(InterfaceC7751k pageControl) {
        AbstractC5141e2.m2213c(pageControl, new Function1() { // from class: b7.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m11283v0(this.f2341a, ((Integer) obj).intValue());
            }
        });
    }

    /* renamed from: u1 */
    public final void m11363u1(boolean isTouchable) {
        boolean z9;
        MutableStateFlow mutableStateFlow = this._mainToolState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            z9 = isTouchable;
            if (mutableStateFlow.compareAndSet(value, C7675r.m11434b((C7675r) value, false, false, false, false, z9, null, 47, null))) {
                break;
            } else {
                isTouchable = z9;
            }
        }
        C9763b c9763bM11312R = m11312R();
        if (c9763bM11312R != null) {
            c9763bM11312R.m16486f0(z9);
        }
        AbstractC9040q.m14451u(Boolean.valueOf(z9));
    }

    /* renamed from: w0 */
    public final void m11364w0(InterfaceC7751k pageControl) {
        pageControl.mo7846z(new C7656b());
    }

    /* renamed from: w1 */
    public final void m11365w1(C7663f boardViewConfig) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Intrinsics.checkNotNullParameter(boardViewConfig, "boardViewConfig");
        MutableStateFlow mutableStateFlow = this._mainToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7675r.m11434b((C7675r) value, boardViewConfig.m11394h(), boardViewConfig.m11396j(), false, false, false, null, 60, null)));
        MutableStateFlow mutableStateFlow2 = this._penToolState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, C7679v.m11453b((C7679v) value2, boardViewConfig.m11390d(), boardViewConfig.m11393g(), null, 0, null, 0, false, 124, null)));
        MutableStateFlow mutableStateFlow3 = this._graphToolState;
        do {
            value3 = mutableStateFlow3.getValue();
        } while (!mutableStateFlow3.compareAndSet(value3, C7673p.m11423b((C7673p) value3, boardViewConfig.m11391e(), boardViewConfig.m11389c(), boardViewConfig.m11395i(), boardViewConfig.m11392f(), null, 16, null)));
        MutableStateFlow mutableStateFlow4 = this._backgroundToolState;
        do {
            value4 = mutableStateFlow4.getValue();
        } while (!mutableStateFlow4.compareAndSet(value4, C7658a.m11377b((C7658a) value4, boardViewConfig.m11388b(), null, 2, null)));
        MutableStateFlow mutableStateFlow5 = this._extraUIState;
        do {
            value5 = mutableStateFlow5.getValue();
        } while (!mutableStateFlow5.compareAndSet(value5, C7672o.m11412b((C7672o) value5, null, boardViewConfig.m11387a(), false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 509, null)));
    }

    /* renamed from: x0 */
    public final void m11366x0(InterfaceC7751k pageControl) {
        AbstractC5141e2.m2215e(pageControl, new Function1() { // from class: b7.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m11287y0(this.f2323a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* renamed from: x1 */
    public final void m11367x1(boolean isZoomUp) {
        int i9;
        Object value;
        int i10 = this.zoomLevelIndex;
        if (isZoomUp && i10 < m11314S().size() - 1) {
            this.zoomLevelIndex++;
        } else if (!isZoomUp && (i9 = this.zoomLevelIndex) > 0) {
            this.zoomLevelIndex = i9 - 1;
        }
        if (i10 == this.zoomLevelIndex) {
            return;
        }
        float fM11476a = ((AbstractC7683z) m11314S().get(this.zoomLevelIndex)).m11476a();
        InterfaceC7751k interfaceC7751kM11330a0 = m11330a0();
        if (interfaceC7751kM11330a0 == null) {
            return;
        }
        PointF pointF = this.zoomPointF;
        interfaceC7751kM11330a0.mo7839r(pointF.x, pointF.y, fM11476a);
        float moveVerticalProgress = interfaceC7751kM11330a0.getMoveVerticalProgress();
        float moveHorizontalProgress = interfaceC7751kM11330a0.getMoveHorizontalProgress();
        float f10 = moveVerticalProgress > 1.0f ? 1.0f : moveVerticalProgress < 0.0f ? 0.0f : moveVerticalProgress;
        float f11 = moveHorizontalProgress <= 1.0f ? moveHorizontalProgress < 0.0f ? 0.0f : fM11476a <= 1.0f ? 0.5f : moveHorizontalProgress : 1.0f;
        if (f10 != moveVerticalProgress || f11 != moveHorizontalProgress) {
            interfaceC7751kM11330a0.areaMoveStart();
            interfaceC7751kM11330a0.areaMoveEnd(Float.valueOf(f11), Float.valueOf(f10));
        }
        if (m11312R() == null) {
            return;
        }
        float f12 = 1;
        float fM16523b = f12 / (r3.m16519z().m16523b() * fM11476a);
        float fM16524c = f12 / (r3.m16519z().m16524c() * fM11476a);
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7672o.m11412b((C7672o) value, null, null, false, false, 0.0f, fM16523b, false, 0.0f, fM16524c, 223, null)));
    }

    /* renamed from: y */
    public final void m11368y(List pathList, boolean isSelected) {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$addBitmapList$1(this, pathList, isSelected, null), 3, null);
    }

    /* renamed from: z */
    public final void m11369z(Bitmap bitmap, String path, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean isSelected, String filename, Function1 imagePathCallback) {
        Intrinsics.checkNotNullParameter(scaleTypeEnum, "scaleTypeEnum");
        Intrinsics.checkNotNullParameter(filename, "filename");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$addImageGraph$1(this, bitmap, filename, scaleTypeEnum, path, imagePathCallback, isSelected, null), 3, null);
    }

    /* renamed from: z0 */
    public final void m11370z0(C9763b boardConfig) {
        C5154i1 c5154i1 = this.boardSketchConfig;
        if (c5154i1 == null) {
            return;
        }
        if (!c5154i1.m2240d()) {
            boardConfig.m16519z().m16533l(false);
            return;
        }
        C9765d c9765dM16519z = boardConfig.m16519z();
        c9765dM16519z.m16533l(true);
        c9765dM16519z.m16536o(true);
        c9765dM16519z.m16530i(true);
        c9765dM16519z.m16532k(1);
        c9765dM16519z.m16531j(c5154i1.m2237a());
    }
}
