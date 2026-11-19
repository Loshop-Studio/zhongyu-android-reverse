package com.zykj.view.board.board;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.R$string;
import com.zykj.view.board.board.AbstractC7225l;
import com.zykj.view.board.board.AbstractC7227n;
import com.zykj.view.board.board.AbstractC7228o;
import com.zykj.view.board.board.AbstractC7229p;
import com.zykj.view.board.board.AbstractC7233t;
import com.zykj.view.board.board.AbstractC7234u;
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
import p007a5.AbstractC0022a;
import p027b8.AbstractC5046c;
import p027b8.AbstractC5065v;
import p027b8.C5066w;
import p035c5.InterfaceC5120c;
import p066d5.InterfaceC7289a;
import p066d5.InterfaceC7290b;
import p066d5.InterfaceC7291c;
import p177n4.InterfaceC8629i;
import p210q4.InterfaceC8888c;
import p213q7.AbstractC8899a;
import p213q7.AbstractC8906b2;
import p213q7.C8910c2;
import p221r4.C9008d;

@Metadata(m13557d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J)\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020.¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00062\b\b\u0002\u0010;\u001a\u00020.¢\u0006\u0004\b<\u0010:J\u0015\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020.¢\u0006\u0004\b>\u0010:J\r\u0010?\u001a\u00020\u0006¢\u0006\u0004\b?\u0010\u0003J\r\u0010@\u001a\u00020\u0006¢\u0006\u0004\b@\u0010\u0003J\r\u0010A\u001a\u00020\u0006¢\u0006\u0004\bA\u0010\u0003J\r\u0010B\u001a\u00020\u0006¢\u0006\u0004\bB\u0010\u0003J\r\u0010C\u001a\u00020\u0006¢\u0006\u0004\bC\u0010\u0003J\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010\u0003J\r\u0010E\u001a\u00020\u0006¢\u0006\u0004\bE\u0010\u0003J\u0015\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00062\u0006\u0010N\u001a\u00020#¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u00062\u0006\u0010N\u001a\u00020#¢\u0006\u0004\bQ\u0010PJ\u0015\u0010R\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bR\u0010PJ\r\u0010S\u001a\u00020\u0006¢\u0006\u0004\bS\u0010\u0003J\r\u0010T\u001a\u00020\u0006¢\u0006\u0004\bT\u0010\u0003J\r\u0010U\u001a\u00020\u0006¢\u0006\u0004\bU\u0010\u0003J\r\u0010V\u001a\u00020\u0006¢\u0006\u0004\bV\u0010\u0003J\u0015\u0010W\u001a\u00020\u00062\u0006\u0010N\u001a\u00020#¢\u0006\u0004\bW\u0010PJ\u0015\u0010Z\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J]\u0010f\u001a\u00020\u00062\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010^2\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010b\u001a\u00020.2\b\b\u0002\u0010c\u001a\u00020^2\u0018\b\u0002\u0010e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010^\u0012\u0004\u0012\u00020\u0006\u0018\u00010d¢\u0006\u0004\bf\u0010gJ\u0015\u0010i\u001a\u00020\u00062\u0006\u0010h\u001a\u00020^¢\u0006\u0004\bi\u0010jJ\u0015\u0010k\u001a\u00020\u00062\u0006\u0010N\u001a\u00020#¢\u0006\u0004\bk\u0010PJ\r\u0010l\u001a\u00020\u0006¢\u0006\u0004\bl\u0010\u0003J%\u0010o\u001a\u00020\u00062\n\b\u0002\u0010m\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010'¢\u0006\u0004\bo\u0010pJ%\u0010q\u001a\u00020\u00062\n\b\u0002\u0010m\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010'¢\u0006\u0004\bq\u0010pJ\r\u0010r\u001a\u00020\u0006¢\u0006\u0004\br\u0010\u0003J\u0017\u0010t\u001a\u00020\u00062\b\b\u0002\u0010s\u001a\u00020.¢\u0006\u0004\bt\u0010:J\r\u0010u\u001a\u00020\u0006¢\u0006\u0004\bu\u0010\u0003J\u0015\u0010w\u001a\u00020\u00062\u0006\u0010v\u001a\u00020.¢\u0006\u0004\bw\u0010:R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR&\u0010\u0081\u0001\u001a\u0004\u0018\u00010z8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R,\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0093\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010TR\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R$\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u009d\u00018\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u001f\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R$\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010¨\u00018\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u001f\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010¦\u0001R$\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010¨\u00018\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010ª\u0001\u001a\u0006\b²\u0001\u0010¬\u0001R\u001f\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030´\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¦\u0001R$\u0010¹\u0001\u001a\n\u0012\u0005\u0012\u00030´\u00010¨\u00018\u0006¢\u0006\u0010\n\u0006\b·\u0001\u0010ª\u0001\u001a\u0006\b¸\u0001\u0010¬\u0001R\u001f\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u00030º\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¦\u0001R$\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u00030º\u00010¨\u00018\u0006¢\u0006\u0010\n\u0006\b½\u0001\u0010ª\u0001\u001a\u0006\b¾\u0001\u0010¬\u0001R\u001f\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030À\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010¦\u0001R$\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030À\u00010¨\u00018\u0006¢\u0006\u0010\n\u0006\bÃ\u0001\u0010ª\u0001\u001a\u0006\bÄ\u0001\u0010¬\u0001R\u001f\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030Æ\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010¦\u0001R$\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030Æ\u00010¨\u00018\u0006¢\u0006\u0010\n\u0006\bÉ\u0001\u0010ª\u0001\u001a\u0006\bÊ\u0001\u0010¬\u0001R\u001f\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030Ì\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010¦\u0001R$\u0010Ñ\u0001\u001a\n\u0012\u0005\u0012\u00030Ì\u00010¨\u00018\u0006¢\u0006\u0010\n\u0006\bÏ\u0001\u0010ª\u0001\u001a\u0006\bÐ\u0001\u0010¬\u0001R\u001f\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030Ò\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010¦\u0001R#\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030Ò\u00010¨\u00018\u0006¢\u0006\u000f\n\u0005\bf\u0010ª\u0001\u001a\u0006\bÕ\u0001\u0010¬\u0001R\u001f\u0010Ù\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010¦\u0001R#\u0010Û\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010¨\u00018\u0006¢\u0006\u000f\n\u0005\bi\u0010ª\u0001\u001a\u0006\bÚ\u0001\u0010¬\u0001R\u001d\u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020.0£\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010¦\u0001R\"\u0010Þ\u0001\u001a\t\u0012\u0004\u0012\u00020.0¨\u00018\u0006¢\u0006\u000f\n\u0005\bq\u0010ª\u0001\u001a\u0006\bÝ\u0001\u0010¬\u0001R\u0019\u0010à\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010¸\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u001f\u0010é\u0001\u001a\n\u0012\u0005\u0012\u00030æ\u00010å\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001R0\u0010ì\u0001\u001a\u0005\u0018\u00010ê\u00012\n\u0010ë\u0001\u001a\u0005\u0018\u00010ê\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R\u0014\u0010ò\u0001\u001a\u00020.8F¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001¨\u0006ó\u0001"}, m13558d2 = {"Lcom/zykj/view/board/board/BoardViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Ln4/i;", "pageControl", "", "u0", "(Ln4/i;)V", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "l0", "(Lcom/zykj/blackboard/bean/BoardConfig;)V", "C0", "v0", "G0", "h0", "t0", "q0", "w0", "r0", "D0", "o0", "d0", "m0", "A0", "J0", "K0", "b1", "T0", "a1", "Z0", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "X0", "config", "", TypedValues.Custom.S_COLOR, "M0", "(Lcom/zykj/blackboard/bean/BoardConfig;I)V", "", "right", "bottom", "H0", "(FF)V", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "boardControl", "", "haveCache", "", TypedValues.TransitionType.S_DURATION, "i0", "(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V", "Lcom/zykj/view/board/board/n;", "mainToolType", "h1", "(Lcom/zykj/view/board/board/n;)V", "isRecover", "P0", "(Z)V", "isTouchable", "n1", "isZoomUp", "p1", "W0", "U0", "R0", "S0", "Q0", "G", "c0", "Lcom/zykj/blackboard/enums/SelectGraphEnum;", "selectGraphEnum", "m1", "(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V", "Lcom/zykj/view/board/board/r;", "penType", "l1", "(Lcom/zykj/view/board/board/r;)V", "level", "k1", "(I)V", "i1", "j1", "H", "I", "K", "J", "c1", "Lcom/zykj/view/board/board/l;", "graphType", "e1", "(Lcom/zykj/view/board/board/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "path", "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;", "scaleTypeEnum", "isSelected", "filename", "Lkotlin/Function1;", "imagePathCallback", "x", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "content", "z", "(Ljava/lang/String;)V", "Y0", "D", "horizontalProgress", "verticalProgress", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/Float;Ljava/lang/Float;)V", "B", "V0", "isMicroPhoneOn", "f1", "L", "isOpen", "d1", "a", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "Ld5/c;", "b", "Ld5/c;", "getTextEditView", "()Ld5/c;", "O0", "(Ld5/c;)V", "textEditView", "Ld5/b;", "c", "Ld5/b;", "getImageCropView", "()Ld5/b;", "N0", "(Ld5/b;)V", "imageCropView", "Ld5/a;", "d", "Ld5/a;", "getCustomColorView", "()Ld5/a;", "L0", "(Ld5/a;)V", "customColorView", "e", "zoomLevelIndex", "Landroid/graphics/PointF;", "f", "Landroid/graphics/PointF;", "zoomPointF", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/view/board/board/c;", "g", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_event", "Lkotlinx/coroutines/flow/SharedFlow;", "h", "Lkotlinx/coroutines/flow/SharedFlow;", ExifInterface.LATITUDE_SOUTH, "()Lkotlinx/coroutines/flow/SharedFlow;", NotificationCompat.CATEGORY_EVENT, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/view/board/board/m;", "i", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_mainToolState", "Lkotlinx/coroutines/flow/StateFlow;", "j", "Lkotlinx/coroutines/flow/StateFlow;", "X", "()Lkotlinx/coroutines/flow/StateFlow;", "mainToolState", "Lq7/c2;", "k", "_selectToolState", "l", "b0", "selectToolState", "Lcom/zykj/view/board/board/q;", "m", "_penToolState", "n", "Z", "penToolState", "Lcom/zykj/view/board/board/f;", "o", "_eraserToolState", "p", "R", "eraserToolState", "Lcom/zykj/view/board/board/k;", "q", "_graphToolState", "r", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "graphToolState", "Lcom/zykj/view/board/board/a;", "s", "_backgroundToolState", "t", "N", "backgroundToolState", "Lcom/zykj/view/board/board/j;", "u", "_extraUIState", "v", "U", "extraUIState", "Lcom/zykj/view/board/board/s;", "w", "_recordState", "a0", "recordState", "Lcom/zykj/view/board/board/h;", "y", "_expandState", ExifInterface.GPS_DIRECTION_TRUE, "expandState", "_loadFinished", ExifInterface.LONGITUDE_WEST, "loadFinished", "C", "lastIsMicroPhoneOn", "Y", "()Ln4/i;", "P", "()Lcom/zykj/blackboard/bean/BoardConfig;", "", "Lcom/zykj/view/board/board/u;", "Q", "()Ljava/util/List;", "currentZoomLevelList", "Lq7/a;", "value", "boardCallbackConfig", "Lq7/a;", "O", "()Lq7/a;", "I0", "()Z", "isImageOutOfCount", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1494:1\n226#2,5:1495\n226#2,5:1500\n226#2,5:1505\n226#2,5:1510\n226#2,5:1515\n226#2,5:1520\n226#2,5:1525\n226#2,5:1537\n226#2,3:1542\n229#2,2:1547\n226#2,5:1549\n226#2,5:1561\n226#2,3:1566\n229#2,2:1571\n226#2,5:1580\n226#2,5:1585\n226#2,5:1590\n226#2,5:1595\n226#2,5:1600\n226#2,5:1605\n226#2,5:1610\n226#2,5:1615\n226#2,5:1620\n226#2,5:1625\n226#2,5:1630\n226#2,5:1635\n226#2,5:1640\n226#2,5:1645\n226#2,5:1650\n226#2,5:1655\n226#2,5:1660\n226#2,5:1665\n226#2,5:1670\n226#2,5:1675\n226#2,5:1681\n226#2,5:1686\n226#2,5:1691\n226#2,5:1696\n226#2,5:1705\n226#2,5:1710\n226#2,5:1715\n226#2,5:1720\n226#2,5:1725\n226#2,5:1730\n226#2,5:1735\n226#2,5:1740\n226#2,5:1745\n226#2,5:1750\n226#2,5:1755\n226#2,5:1760\n226#2,5:1765\n226#2,5:1770\n360#3,7:1530\n1869#3,2:1545\n360#3,7:1554\n230#3,2:1569\n360#3,7:1573\n1869#3:1701\n1870#3:1704\n1#4:1680\n1310#5,2:1702\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel\n*L\n170#1:1495,5\n173#1:1500,5\n286#1:1505,5\n293#1:1510,5\n300#1:1515,5\n309#1:1520,5\n315#1:1525,5\n349#1:1537,5\n358#1:1542,3\n358#1:1547,2\n389#1:1549,5\n436#1:1561,5\n608#1:1566,3\n608#1:1571,2\n635#1:1580,5\n653#1:1585,5\n656#1:1590,5\n694#1:1595,5\n755#1:1600,5\n767#1:1605,5\n775#1:1610,5\n789#1:1615,5\n799#1:1620,5\n810#1:1625,5\n824#1:1630,5\n838#1:1635,5\n895#1:1640,5\n971#1:1645,5\n980#1:1650,5\n995#1:1655,5\n1011#1:1660,5\n1018#1:1665,5\n1032#1:1670,5\n1043#1:1675,5\n1057#1:1681,5\n1069#1:1686,5\n1107#1:1691,5\n1132#1:1696,5\n1295#1:1705,5\n1308#1:1710,5\n1378#1:1715,5\n1397#1:1720,5\n1399#1:1725,5\n495#1:1730,5\n498#1:1735,5\n501#1:1740,5\n512#1:1745,5\n549#1:1750,5\n557#1:1755,5\n565#1:1760,5\n581#1:1765,5\n591#1:1770,5\n344#1:1530,7\n365#1:1545,2\n431#1:1554,7\n610#1:1569,2\n625#1:1573,7\n1183#1:1701\n1183#1:1704\n1185#1:1702,2\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardViewModel extends ViewModel {

    /* renamed from: A, reason: from kotlin metadata */
    public final MutableStateFlow _loadFinished;

    /* renamed from: B, reason: from kotlin metadata */
    public final StateFlow loadFinished;

    /* renamed from: C, reason: from kotlin metadata */
    public boolean lastIsMicroPhoneOn;

    /* renamed from: a, reason: from kotlin metadata */
    public IBoardControl boardControl;

    /* renamed from: b, reason: from kotlin metadata */
    public InterfaceC7291c textEditView;

    /* renamed from: c, reason: from kotlin metadata */
    public InterfaceC7290b imageCropView;

    /* renamed from: d, reason: from kotlin metadata */
    public InterfaceC7289a customColorView;

    /* renamed from: e, reason: from kotlin metadata */
    public int zoomLevelIndex = AbstractC7218e.m10974e().indexOf(AbstractC7234u.d.f11120c);

    /* renamed from: f, reason: from kotlin metadata */
    public final PointF zoomPointF = new PointF();

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableSharedFlow _event;

    /* renamed from: h, reason: from kotlin metadata */
    public final SharedFlow event;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableStateFlow _mainToolState;

    /* renamed from: j, reason: from kotlin metadata */
    public final StateFlow mainToolState;

    /* renamed from: k, reason: from kotlin metadata */
    public final MutableStateFlow _selectToolState;

    /* renamed from: l, reason: from kotlin metadata */
    public final StateFlow selectToolState;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableStateFlow _penToolState;

    /* renamed from: n, reason: from kotlin metadata */
    public final StateFlow penToolState;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableStateFlow _eraserToolState;

    /* renamed from: p, reason: from kotlin metadata */
    public final StateFlow eraserToolState;

    /* renamed from: q, reason: from kotlin metadata */
    public final MutableStateFlow _graphToolState;

    /* renamed from: r, reason: from kotlin metadata */
    public final StateFlow graphToolState;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableStateFlow _backgroundToolState;

    /* renamed from: t, reason: from kotlin metadata */
    public final StateFlow backgroundToolState;

    /* renamed from: u, reason: from kotlin metadata */
    public final MutableStateFlow _extraUIState;

    /* renamed from: v, reason: from kotlin metadata */
    public final StateFlow extraUIState;

    /* renamed from: w, reason: from kotlin metadata */
    public final MutableStateFlow _recordState;

    /* renamed from: x, reason: from kotlin metadata */
    public final StateFlow recordState;

    /* renamed from: y, reason: from kotlin metadata */
    public final MutableStateFlow _expandState;

    /* renamed from: z, reason: from kotlin metadata */
    public final StateFlow expandState;

    /* renamed from: com.zykj.view.board.board.BoardViewModel$a */
    public static final /* synthetic */ class C7211a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10976a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f10977b;

        static {
            int[] iArr = new int[ZoomPointSolution.values().length];
            try {
                iArr[ZoomPointSolution.f11604b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoomPointSolution.f11605c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoomPointSolution.f11606d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZoomPointSolution.f11607e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZoomPointSolution.f11609g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZoomPointSolution.f11608f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ZoomPointSolution.f11610h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ZoomPointSolution.f11611i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ZoomPointSolution.f11612j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f10976a = iArr;
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
            f10977b = iArr2;
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardViewModel$b */
    public static final class C7213b implements InterfaceC5120c {
        public C7213b() {
        }

        @Override // p035c5.InterfaceC5120c
        /* renamed from: a */
        public void mo2775a(InterfaceC8888c graph) {
            Intrinsics.checkNotNullParameter(graph, "graph");
            if (graph instanceof ImageGraph) {
                BoardViewModel.this.m10903O();
            }
        }
    }

    public BoardViewModel() {
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._event = mutableSharedFlowMutableSharedFlow$default;
        this.event = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C7226m(false, false, false, false, false, null, 63, null));
        this._mainToolState = MutableStateFlow;
        this.mainToolState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C8910c2(false, false, false, false, false, 31, null));
        this._selectToolState = MutableStateFlow2;
        this.selectToolState = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(new C7230q(false, false, null, 0, null, 0, false, 127, null));
        this._penToolState = MutableStateFlow3;
        this.penToolState = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(new C7219f(null, 1, null));
        this._eraserToolState = MutableStateFlow4;
        this.eraserToolState = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(new C7224k(false, false, false, false, null, 31, null));
        this._graphToolState = MutableStateFlow5;
        this.graphToolState = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(new C7214a(false, null, 3, null));
        this._backgroundToolState = MutableStateFlow6;
        this.backgroundToolState = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(new C7223j(null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 511, null));
        this._extraUIState = MutableStateFlow7;
        this.extraUIState = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(new C7232s(null, false, null, 7, null));
        this._recordState = MutableStateFlow8;
        this.recordState = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(new C7221h(null, 1, null));
        this._expandState = MutableStateFlow9;
        this.expandState = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._loadFinished = MutableStateFlow10;
        this.loadFinished = FlowKt.asStateFlow(MutableStateFlow10);
        this.lastIsMicroPhoneOn = true;
    }

    /* renamed from: B0 */
    public static final Unit m10838B0(BoardViewModel boardViewModel, boolean z9, boolean z10) {
        MutableStateFlow mutableStateFlow = boardViewModel._mainToolState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z11 = z9;
            boolean z12 = z10;
            if (mutableStateFlow.compareAndSet(value, C7226m.m11004b((C7226m) value, false, false, z11, z12, false, null, 51, null))) {
                boardViewModel.m10895J0();
                return Unit.INSTANCE;
            }
            z9 = z11;
            z10 = z12;
        }
    }

    /* renamed from: C */
    public static /* synthetic */ void m10839C(BoardViewModel boardViewModel, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        boardViewModel.m10883B(f10, f11);
    }

    /* renamed from: E0 */
    public static final Unit m10840E0(BoardViewModel boardViewModel, int i10) {
        AbstractC5065v.m2600s(Integer.valueOf(i10));
        BoardConfig boardConfigM10905P = boardViewModel.m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setAddTextOriginalTextColor(i10);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static /* synthetic */ void m10841F(BoardViewModel boardViewModel, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        boardViewModel.m10887E(f10, f11);
    }

    /* renamed from: F0 */
    public static final Unit m10842F0(BoardViewModel boardViewModel, float f10) {
        AbstractC5065v.m2601t(Float.valueOf(f10));
        BoardConfig boardConfigM10905P = boardViewModel.m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setAddTextOriginalTextSize(f10);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final Unit m10843M(BoardViewModel boardViewModel) {
        InterfaceC8629i interfaceC8629iM10923Y = boardViewModel.m10923Y();
        if (interfaceC8629iM10923Y != null) {
            boardViewModel.m10953u0(interfaceC8629iM10923Y);
        } else {
            ToastUtils.showShort("画板初始化失败，请退出后重试", new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e0 */
    public static final Unit m10849e0(BoardViewModel boardViewModel) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 439, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: f0 */
    public static final Unit m10851f0(BoardViewModel boardViewModel, float f10, float f11) {
        MutableStateFlow mutableStateFlow = boardViewModel._extraUIState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            float f12 = f10;
            float f13 = f11;
            if (mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, null, null, false, false, f12, 0.0f, false, f13, 0.0f, 367, null))) {
                return Unit.INSTANCE;
            }
            f10 = f12;
            f11 = f13;
        }
    }

    /* renamed from: g0 */
    public static final Unit m10853g0(BoardViewModel boardViewModel) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, null, null, false, true, 0.0f, 0.0f, true, 0.0f, 0.0f, 439, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: g1 */
    public static /* synthetic */ void m10854g1(BoardViewModel boardViewModel, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = !((C7232s) boardViewModel._recordState.getValue()).m11041e();
        }
        boardViewModel.m10936f1(z9);
    }

    /* renamed from: j0 */
    public static final Unit m10858j0(BoardViewModel boardViewModel, InterfaceC8629i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boardViewModel.m10953u0(it);
        boardViewModel._loadFinished.tryEmit(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* renamed from: k0 */
    public static final Unit m10860k0(BoardViewModel boardViewModel, Function1 function1) {
        InterfaceC8629i interfaceC8629iM10923Y = boardViewModel.m10923Y();
        if (interfaceC8629iM10923Y != null) {
            function1.invoke(interfaceC8629iM10923Y);
        } else {
            ToastUtils.showShort("画板加载失败，请退出后重试", new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: n0 */
    public static final Unit m10864n0(BoardViewModel boardViewModel, CommandInfoEntity commandInfoEntity) {
        Object value;
        Intrinsics.checkNotNullParameter(commandInfoEntity, "<unused var>");
        MutableStateFlow mutableStateFlow = boardViewModel._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m10866o1(BoardViewModel boardViewModel, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = !((C7226m) boardViewModel._mainToolState.getValue()).m11010g();
        }
        boardViewModel.m10947n1(z9);
    }

    /* renamed from: p0 */
    public static final Unit m10868p0(BoardViewModel boardViewModel, int i10) {
        AbstractC5065v.m2595n(Integer.valueOf(i10));
        BoardConfig boardConfigM10905P = boardViewModel.m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setGeometryStrokeColor(i10);
        }
        boardViewModel.m10922X0();
        return Unit.INSTANCE;
    }

    /* renamed from: s0 */
    public static final Unit m10872s0(BoardViewModel boardViewModel, boolean z9) {
        MutableStateFlow mutableStateFlow = boardViewModel._recordState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z10 = z9;
            if (mutableStateFlow.compareAndSet(value, C7232s.m11037b((C7232s) value, null, z10, null, 5, null))) {
                return Unit.INSTANCE;
            }
            z9 = z10;
        }
    }

    /* renamed from: x0 */
    public static final Unit m10877x0(BoardViewModel boardViewModel) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._recordState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7232s.m11037b((C7232s) value, AbstractC7233t.c.f11114f, false, null, 6, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static /* synthetic */ void m10878y(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z9, String str2, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            scaleTypeEnum = EzyScaleTypeEnum.ScaleTypeEnum.MODE_ADAPTER_8;
        }
        if ((i10 & 8) != 0) {
            z9 = false;
        }
        if ((i10 & 16) != 0) {
            str2 = "";
        }
        if ((i10 & 32) != 0) {
            function1 = null;
        }
        boardViewModel.m10956x(bitmap, str, scaleTypeEnum, z9, str2, function1);
    }

    /* renamed from: y0 */
    public static final Unit m10879y0(BoardViewModel boardViewModel, long j10) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._recordState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7232s.m11037b((C7232s) value, null, false, C5066w.f2629a.m2604b(j10), 3, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: z0 */
    public static final Unit m10880z0(BoardViewModel boardViewModel) {
        Object value;
        MutableStateFlow mutableStateFlow = boardViewModel._recordState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7232s.m11037b((C7232s) value, AbstractC7233t.a.f11112f, false, null, 6, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public final void m10881A() {
        C7230q c7230q = (C7230q) this._penToolState.getValue();
        BoardConfig boardConfigM10905P = m10905P();
        if (boardConfigM10905P != null) {
            float fFloatValue = ((Number) c7230q.m11030h().m11035d().get(c7230q.m11029g())).floatValue();
            boardConfigM10905P.setPaintWidth(fFloatValue);
            boardConfigM10905P.setBeelinePaintWidth(fFloatValue);
            Integer numM2584c = AbstractC5065v.m2584c();
            m10900M0(boardConfigM10905P, AbstractC5046c.m2532h(numM2584c != null ? numM2584c.intValue() : c7230q.m11027e().m11021a(), c7230q.m11030h().m11034c()));
        }
    }

    /* renamed from: A0 */
    public final void m10882A0(InterfaceC8629i pageControl) {
        AbstractC8906b2.m15021a(pageControl, new Function2() { // from class: q7.o1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BoardViewModel.m10838B0(this.f15279a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* renamed from: B */
    public final void m10883B(Float horizontalProgress, Float verticalProgress) {
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y != null) {
            interfaceC8629iM10923Y.areaMoveEnd(horizontalProgress, verticalProgress);
        }
    }

    /* renamed from: C0 */
    public final void m10884C0(BoardConfig boardConfig) {
        Object value;
        C8910c2 c8910c2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        List<? extends SelectGraphEnum> listM2588g = AbstractC5065v.m2588g();
        if (listM2588g == null) {
            listM2588g = AbstractC0022a.m63b();
        }
        boardConfig.setSelectIncludeGraphEnumListByDrag(listM2588g);
        MutableStateFlow mutableStateFlow = this._selectToolState;
        do {
            value = mutableStateFlow.getValue();
            c8910c2 = (C8910c2) value;
            Iterator<T> it = listM2588g.iterator();
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            while (it.hasNext()) {
                int i10 = C7211a.f10977b[((SelectGraphEnum) it.next()).ordinal()];
                if (i10 == 1) {
                    z9 = true;
                } else if (i10 == 2) {
                    z10 = true;
                } else if (i10 == 3) {
                    z11 = true;
                } else if (i10 == 4) {
                    z12 = true;
                } else {
                    if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z13 = true;
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, c8910c2.m15028a(z9, z10, z11, z12, z13)));
    }

    /* renamed from: D */
    public final void m10885D() {
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y != null) {
            interfaceC8629iM10923Y.areaMoveStart();
        }
    }

    /* renamed from: D0 */
    public final void m10886D0(InterfaceC8629i pageControl) {
        AbstractC8906b2.m15027g(pageControl, new Function1() { // from class: q7.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m10840E0(this.f15300a, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: q7.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m10842F0(this.f15255a, ((Float) obj).floatValue());
            }
        });
    }

    /* renamed from: E */
    public final void m10887E(Float horizontalProgress, Float verticalProgress) {
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y != null) {
            interfaceC8629iM10923Y.areaMoving(horizontalProgress, verticalProgress);
        }
    }

    /* renamed from: G */
    public final void m10888G() {
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y != null) {
            InterfaceC8629i.a.m14209e(interfaceC8629iM10923Y, null, 1, null);
        }
    }

    /* renamed from: G0 */
    public final void m10889G0(BoardConfig boardConfig) {
        boardConfig.setAddTextOriginalText("");
        Integer numM2589h = AbstractC5065v.m2589h();
        boardConfig.setAddTextOriginalTextColor(numM2589h != null ? numM2589h.intValue() : ((C7230q) this._penToolState.getValue()).m11027e().m11021a());
        Float fM2590i = AbstractC5065v.m2590i();
        if (fM2590i != null) {
            boardConfig.setAddTextOriginalTextSize(fM2590i.floatValue());
        }
        boardConfig.getAddTextRectF().right = 600.0f;
        boardConfig.setTextEditView(this.textEditView);
    }

    /* renamed from: H */
    public final void m10890H() {
        Object value;
        C7230q c7230qM11023b;
        MutableStateFlow mutableStateFlow = this._penToolState;
        do {
            value = mutableStateFlow.getValue();
            c7230qM11023b = (C7230q) value;
            if (c7230qM11023b.m11031i()) {
                c7230qM11023b = C7230q.m11023b(c7230qM11023b, false, false, null, 0, null, 0, false, 63, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, c7230qM11023b));
    }

    /* renamed from: H0 */
    public final void m10891H0(float right, float bottom) {
        this.zoomPointF.set(right / 2, 0.0f);
    }

    /* renamed from: I */
    public final void m10892I() {
        Object value;
        m10890H();
        if (Intrinsics.areEqual(((C7226m) this._mainToolState.getValue()).m11006c(), AbstractC7227n.d.f11070e)) {
            return;
        }
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, AbstractC7228o.d.f11079f, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: I0 */
    public final boolean m10893I0() {
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        return (interfaceC8629iM10923Y != null ? interfaceC8629iM10923Y.mo6734y() : 0) >= 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        kotlin.Result.m24299constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10894J() {
        /*
            r14 = this;
            r14.m10890H()
            kotlinx.coroutines.flow.MutableStateFlow r0 = r14._extraUIState
        L5:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            com.zykj.view.board.board.j r2 = (com.zykj.view.board.board.C7223j) r2
            com.zykj.view.board.board.o$f r3 = com.zykj.view.board.board.AbstractC7228o.f.f11081f
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
            com.zykj.view.board.board.j r2 = com.zykj.view.board.board.C7223j.m10982b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto L5
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L35
            n4.i r0 = r14.m10923Y()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L35
            r0.mo6708E(r1)     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r0 = move-exception
            goto L3c
        L37:
            r0 = 0
        L38:
            kotlin.Result.m24299constructorimpl(r0)     // Catch: java.lang.Throwable -> L35
            return
        L3c:
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m24299constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.m10894J():void"); // DEX body: android/新测评/smali_classes5/com/zykj/view/board/board/BoardViewModel.smali:3360
    }

    /* renamed from: J0 */
    public final void m10895J0() {
        Object value;
        C7214a c7214a;
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y == null) {
            return;
        }
        int backgroundColor = interfaceC8629iM10923Y.getBackgroundColor();
        MutableStateFlow mutableStateFlow = this._backgroundToolState;
        do {
            value = mutableStateFlow.getValue();
            c7214a = (C7214a) value;
            for (AbstractC7215b abstractC7215b : AbstractC7218e.m10970a()) {
                if (abstractC7215b.m10962a() == backgroundColor) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } while (!mutableStateFlow.compareAndSet(value, C7214a.m10958b(c7214a, false, abstractC7215b, 1, null)));
    }

    /* renamed from: K */
    public final void m10896K() {
        Object value;
        Unit unit;
        m10890H();
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, AbstractC7228o.d.f11079f, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        if (Intrinsics.areEqual(((C7226m) this._mainToolState.getValue()).m11006c(), AbstractC7227n.d.f11070e)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
                if (interfaceC8629iM10923Y != null) {
                    interfaceC8629iM10923Y.mo6708E(CollectionsKt.emptyList());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m24299constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m24299constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    /* renamed from: K0 */
    public final void m10897K0() {
        BoardConfig boardConfigM10905P;
        Object value;
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y == null || (boardConfigM10905P = m10905P()) == null) {
            return;
        }
        float fMo6725o = interfaceC8629iM10923Y.mo6725o();
        Iterator it = m10907Q().iterator();
        int iIndexOf = 0;
        while (true) {
            if (!it.hasNext()) {
                iIndexOf = -1;
                break;
            } else if (((AbstractC7234u) it.next()).m11046a() == fMo6725o) {
                break;
            } else {
                iIndexOf++;
            }
        }
        if (iIndexOf == -1) {
            iIndexOf = m10907Q().indexOf(AbstractC7234u.d.f11120c);
        }
        this.zoomLevelIndex = iIndexOf;
        float f10 = 1;
        float fM11994b = f10 / (boardConfigM10905P.getMoveActionConfig().m11994b() * fMo6725o);
        float fM11995c = f10 / (boardConfigM10905P.getMoveActionConfig().m11995c() * fMo6725o);
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, null, null, false, false, interfaceC8629iM10923Y.getMoveVerticalProgress(), fM11994b, false, interfaceC8629iM10923Y.getMoveHorizontalProgress(), fM11995c, 79, null)));
    }

    /* renamed from: L */
    public final void m10898L() {
        Object value;
        Object value2;
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        MutableStateFlow mutableStateFlow2 = this._recordState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, C7232s.m11037b((C7232s) value2, AbstractC7233t.b.f11113f, false, null, 6, null)));
        IBoardControl.DefaultImpls.m6701b(iBoardControl, 0, null, 2, null);
        IBoardControl.DefaultImpls.m6700a(iBoardControl, false, new Function0() { // from class: q7.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m10843M(this.f15252a);
            }
        }, 1, null);
    }

    /* renamed from: L0 */
    public final void m10899L0(InterfaceC7289a interfaceC7289a) {
        this.customColorView = interfaceC7289a;
    }

    /* renamed from: M0 */
    public final void m10900M0(BoardConfig config, int color) {
        Method method;
        int i10 = color | ViewCompat.MEASURED_STATE_MASK;
        try {
            Result.Companion companion = Result.INSTANCE;
            config.setPaintColor(color);
            Result.m24299constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        try {
            config.setBeelinePaintColor(color);
            Result.m24299constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m24299constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            config.setGeometryStrokeColor(i10);
            Result.m24299constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m24299constructorimpl(ResultKt.createFailure(th3));
        }
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"setGeometryPaintColor", "setGeometryColor", "setGeometryStrokeColor", "setGraphColor", "setShapeColor", "setStrokeColor"})) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Method[] methods = config.getClass().getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                int length = methods.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i11];
                    if (Intrinsics.areEqual(method.getName(), str) && method.getParameterTypes().length == 1 && Intrinsics.areEqual(method.getParameterTypes()[0], Integer.TYPE)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                Result.m24299constructorimpl(method != null ? method.invoke(config, Integer.valueOf(i10)) : null);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m24299constructorimpl(ResultKt.createFailure(th4));
            }
        }
    }

    /* renamed from: N, reason: from getter */
    public final StateFlow getBackgroundToolState() {
        return this.backgroundToolState;
    }

    /* renamed from: N0 */
    public final void m10902N0(InterfaceC7290b interfaceC7290b) {
        this.imageCropView = interfaceC7290b;
    }

    /* renamed from: O */
    public final AbstractC8899a m10903O() {
        return null;
    }

    /* renamed from: O0 */
    public final void m10904O0(InterfaceC7291c interfaceC7291c) {
        this.textEditView = interfaceC7291c;
    }

    /* renamed from: P */
    public final BoardConfig m10905P() {
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl != null) {
            return iBoardControl.getConfig();
        }
        return null;
    }

    /* renamed from: P0 */
    public final void m10906P0(boolean isRecover) {
        if (isRecover) {
            InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
            if (interfaceC8629iM10923Y != null) {
                interfaceC8629iM10923Y.mo6735z();
                return;
            }
            return;
        }
        InterfaceC8629i interfaceC8629iM10923Y2 = m10923Y();
        if (interfaceC8629iM10923Y2 != null) {
            interfaceC8629iM10923Y2.mo6727q();
        }
    }

    /* renamed from: Q */
    public final List m10907Q() {
        return AbstractC7218e.m10974e();
    }

    /* renamed from: Q0 */
    public final void m10908Q0() {
        Object value;
        C7223j c7223j;
        AbstractC7228o abstractC7228o;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7223j = (C7223j) value;
            AbstractC7228o abstractC7228oM10987f = c7223j.m10987f();
            abstractC7228o = AbstractC7228o.a.f11076f;
            if (Intrinsics.areEqual(abstractC7228oM10987f, abstractC7228o)) {
                abstractC7228o = AbstractC7228o.d.f11079f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b(c7223j, abstractC7228o, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: R, reason: from getter */
    public final StateFlow getEraserToolState() {
        return this.eraserToolState;
    }

    /* renamed from: R0 */
    public final void m10910R0() {
        Object value;
        C7223j c7223j;
        AbstractC7228o abstractC7228o;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7223j = (C7223j) value;
            AbstractC7228o abstractC7228oM10987f = c7223j.m10987f();
            abstractC7228o = AbstractC7228o.b.f11077f;
            if (Intrinsics.areEqual(abstractC7228oM10987f, abstractC7228o)) {
                abstractC7228o = AbstractC7228o.d.f11079f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b(c7223j, abstractC7228o, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: S, reason: from getter */
    public final SharedFlow getEvent() {
        return this.event;
    }

    /* renamed from: S0 */
    public final void m10912S0() {
        Object value;
        C7223j c7223j;
        AbstractC7228o abstractC7228o;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7223j = (C7223j) value;
            AbstractC7228o abstractC7228oM10987f = c7223j.m10987f();
            abstractC7228o = AbstractC7228o.c.f11078f;
            if (Intrinsics.areEqual(abstractC7228oM10987f, abstractC7228o)) {
                abstractC7228o = AbstractC7228o.d.f11079f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b(c7223j, abstractC7228o, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: T, reason: from getter */
    public final StateFlow getExpandState() {
        return this.expandState;
    }

    /* renamed from: T0 */
    public final void m10914T0() {
        Object value;
        MutableStateFlow mutableStateFlow = this._penToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7230q.m11023b((C7230q) value, false, false, null, 0, null, 0, !r2.m11031i(), 63, null)));
    }

    /* renamed from: U, reason: from getter */
    public final StateFlow getExtraUIState() {
        return this.extraUIState;
    }

    /* renamed from: U0 */
    public final void m10916U0() {
        Object value;
        C7223j c7223j;
        AbstractC7228o abstractC7228o;
        Object value2;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7223j = (C7223j) value;
            AbstractC7228o abstractC7228oM10987f = c7223j.m10987f();
            abstractC7228o = AbstractC7228o.e.f11080f;
            if (Intrinsics.areEqual(abstractC7228oM10987f, abstractC7228o)) {
                abstractC7228o = AbstractC7228o.d.f11079f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b(c7223j, abstractC7228o, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        MutableStateFlow mutableStateFlow2 = this._penToolState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, C7230q.m11023b((C7230q) value2, false, false, null, 0, null, 0, false, 63, null)));
    }

    /* renamed from: V, reason: from getter */
    public final StateFlow getGraphToolState() {
        return this.graphToolState;
    }

    /* renamed from: V0 */
    public final void m10918V0() {
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y == null) {
            return;
        }
        if (!interfaceC8629iM10923Y.mo6733w()) {
            interfaceC8629iM10923Y.mo6730t(this.lastIsMicroPhoneOn);
        } else {
            this.lastIsMicroPhoneOn = interfaceC8629iM10923Y.mo6724n();
            interfaceC8629iM10923Y.stopRecord();
        }
    }

    /* renamed from: W, reason: from getter */
    public final StateFlow getLoadFinished() {
        return this.loadFinished;
    }

    /* renamed from: W0 */
    public final void m10920W0() {
        Object value;
        C7223j c7223j;
        AbstractC7228o abstractC7228o;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
            c7223j = (C7223j) value;
            AbstractC7228o abstractC7228oM10987f = c7223j.m10987f();
            abstractC7228o = AbstractC7228o.f.f11081f;
            if (Intrinsics.areEqual(abstractC7228oM10987f, abstractC7228o)) {
                abstractC7228o = AbstractC7228o.d.f11079f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b(c7223j, abstractC7228o, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: X, reason: from getter */
    public final StateFlow getMainToolState() {
        return this.mainToolState;
    }

    /* renamed from: X0 */
    public final void m10922X0() {
        boolean zAreEqual = Intrinsics.areEqual(((C7226m) this._mainToolState.getValue()).m11006c(), AbstractC7227n.b.f11068e);
        boolean zAreEqual2 = Intrinsics.areEqual(((C7224k) this._graphToolState.getValue()).m10997e(), AbstractC7225l.a.f11053e);
        if (!zAreEqual || zAreEqual2) {
            return;
        }
        m10881A();
    }

    /* renamed from: Y */
    public final InterfaceC8629i m10923Y() {
        List listMo6689d;
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl == null || (listMo6689d = iBoardControl.mo6689d()) == null) {
            return null;
        }
        return (InterfaceC8629i) CollectionsKt.firstOrNull(listMo6689d);
    }

    /* renamed from: Y0 */
    public final void m10924Y0(int level) {
        Object value;
        AbstractC7215b abstractC7215b = (AbstractC7215b) AbstractC7218e.m10970a().get(level);
        MutableStateFlow mutableStateFlow = this._backgroundToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7214a.m10958b((C7214a) value, false, abstractC7215b, 1, null)));
        BoardConfig boardConfigM10905P = m10905P();
        if (boardConfigM10905P == null) {
            return;
        }
        boardConfigM10905P.setBackgroundColor(abstractC7215b.m10962a());
        BackgroundLineConfig backgroundLineConfig = boardConfigM10905P.getBackgroundLineConfig();
        backgroundLineConfig.m5978e(abstractC7215b.m10963b());
        backgroundLineConfig.m5980g(abstractC7215b.m10965d());
        backgroundLineConfig.m5979f(abstractC7215b.m10964c());
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y == null) {
            return;
        }
        if (abstractC7215b.m10962a() != interfaceC8629iM10923Y.getBackgroundColor()) {
            interfaceC8629iM10923Y.mo6718j(abstractC7215b.m10962a(), boardConfigM10905P.getBackgroundLineConfig());
        }
        AbstractC5065v.m2593l(Integer.valueOf(abstractC7215b.m10962a()));
    }

    /* renamed from: Z, reason: from getter */
    public final StateFlow getPenToolState() {
        return this.penToolState;
    }

    /* renamed from: Z0 */
    public final void m10926Z0() {
        C7219f c7219f = (C7219f) this._eraserToolState.getValue();
        BoardConfig boardConfigM10905P = m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setMode(EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING);
            boardConfigM10905P.setEraserWidth(c7219f.m10976b().m10978b());
        }
    }

    /* renamed from: a0, reason: from getter */
    public final StateFlow getRecordState() {
        return this.recordState;
    }

    /* renamed from: a1 */
    public final void m10928a1() {
        C7230q c7230q = (C7230q) this._penToolState.getValue();
        BoardConfig boardConfigM10905P = m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setMode(c7230q.m11030h().m11032a());
            BoardConfig.setDottedLine$default(boardConfigM10905P, c7230q.m11030h().m11036e(), 0.0f, 0.0f, 6, null);
            float fFloatValue = ((Number) c7230q.m11030h().m11035d().get(c7230q.m11029g())).floatValue();
            boardConfigM10905P.setPaintWidth(fFloatValue);
            boardConfigM10905P.setBeelinePaintWidth(fFloatValue);
            int iM2532h = AbstractC5046c.m2532h(c7230q.m11027e().m11021a(), c7230q.m11030h().m11034c());
            boardConfigM10905P.setPaintColor(iM2532h);
            boardConfigM10905P.setBeelinePaintColor(iM2532h);
            if (AbstractC5065v.m2589h() == null) {
                boardConfigM10905P.setAddTextOriginalTextColor(c7230q.m11027e().m11021a());
            }
            if (AbstractC5065v.m2584c() == null) {
                m10900M0(boardConfigM10905P, iM2532h);
            }
        }
    }

    /* renamed from: b0, reason: from getter */
    public final StateFlow getSelectToolState() {
        return this.selectToolState;
    }

    /* renamed from: b1 */
    public final void m10930b1() {
        C8910c2 c8910c2 = (C8910c2) this._selectToolState.getValue();
        ArrayList arrayList = new ArrayList();
        if (c8910c2.m15032e()) {
            arrayList.add(SelectGraphEnum.STROKE);
        }
        if (c8910c2.m15030c()) {
            arrayList.add(SelectGraphEnum.STROKE_HIGHLIGHTER);
        }
        if (c8910c2.m15031d()) {
            arrayList.add(SelectGraphEnum.IMAGE);
        }
        if (c8910c2.m15033f()) {
            arrayList.add(SelectGraphEnum.TEXT);
        }
        if (c8910c2.m15029b()) {
            arrayList.add(SelectGraphEnum.GEOMETRY);
        }
        BoardConfig boardConfigM10905P = m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setSelectIncludeGraphEnumListByDrag(arrayList);
        }
        AbstractC5065v.m2599r(arrayList);
    }

    /* renamed from: c0 */
    public final void m10931c0() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$handleExpandClick$1(this, null), 3, null);
    }

    /* renamed from: c1 */
    public final void m10932c1(int level) {
        Object value;
        AbstractC7220g abstractC7220g = (AbstractC7220g) AbstractC7218e.m10971b().get(level);
        MutableStateFlow mutableStateFlow = this._eraserToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((C7219f) value).m10975a(abstractC7220g)));
        m10926Z0();
        AbstractC5065v.m2594m(Float.valueOf(abstractC7220g.m10978b()));
    }

    /* renamed from: d0 */
    public final void m10933d0(InterfaceC8629i pageControl) {
        AbstractC8906b2.m15024d(pageControl, new Function0() { // from class: q7.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m10849e0(this.f15262a);
            }
        }, new Function2() { // from class: q7.k1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BoardViewModel.m10851f0(this.f15265a, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, new Function0() { // from class: q7.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m10853g0(this.f15268a);
            }
        });
    }

    /* renamed from: d1 */
    public final void m10934d1(boolean isOpen) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updateExpandState$1(this, isOpen, null), 3, null);
    }

    /* renamed from: e1 */
    public final void m10935e1(AbstractC7225l graphType) {
        AbstractC7225l abstractC7225l;
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        m10938h1(AbstractC7227n.b.f11068e);
        MutableStateFlow mutableStateFlow = this._graphToolState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            abstractC7225l = graphType;
            if (mutableStateFlow.compareAndSet(value, C7224k.m10993b((C7224k) value, false, false, false, false, abstractC7225l, 15, null))) {
                break;
            } else {
                graphType = abstractC7225l;
            }
        }
        BoardConfig boardConfigM10905P = m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setMode(EzyModeEnum.ModeEnum.ACTION_GEOMETRY);
            boardConfigM10905P.setGeometryActionEnum(abstractC7225l.m11000a());
        }
        m10881A();
    }

    /* renamed from: f1 */
    public final void m10936f1(boolean isMicroPhoneOn) {
        boolean z9;
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this._recordState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            z9 = isMicroPhoneOn;
            if (mutableStateFlow.compareAndSet(value, C7232s.m11037b((C7232s) value, null, z9, null, 5, null))) {
                break;
            } else {
                isMicroPhoneOn = z9;
            }
        }
        if (z9) {
            interfaceC8629iM10923Y.mo6712e();
            ToastUtils.showShort(R$string.turn_on_micro_phone);
        } else {
            interfaceC8629iM10923Y.mo6731u();
            ToastUtils.showShort(R$string.turn_off_micro_phone);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10937h0(com.zykj.blackboard.bean.BoardConfig r8) {
        /*
            r7 = this;
            java.lang.Integer r0 = p027b8.AbstractC5065v.m2582a()
            r1 = 0
            if (r0 == 0) goto L2e
            int r0 = r0.intValue()
            java.util.List r2 = com.zykj.view.board.board.AbstractC7218e.m10970a()
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L14:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r2.next()
            com.zykj.view.board.board.b r4 = (com.zykj.view.board.board.AbstractC7215b) r4
            int r4 = r4.m10962a()
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
            java.util.List r0 = com.zykj.view.board.board.AbstractC7218e.m10970a()
            java.lang.Object r0 = r0.get(r3)
            com.zykj.view.board.board.b r0 = (com.zykj.view.board.board.AbstractC7215b) r0
            kotlinx.coroutines.flow.MutableStateFlow r2 = r7._backgroundToolState
        L3b:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.zykj.view.board.board.a r4 = (com.zykj.view.board.board.C7214a) r4
            r5 = 0
            r6 = 1
            com.zykj.view.board.board.a r4 = com.zykj.view.board.board.C7214a.m10958b(r4, r1, r0, r6, r5)
            boolean r3 = r2.compareAndSet(r3, r4)
            if (r3 == 0) goto L3b
            int r1 = r0.m10962a()
            r8.setBackgroundColor(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig r8 = r8.getBackgroundLineConfig()
            int r1 = r0.m10963b()
            r8.m5978e(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig$BackgroundLineType r1 = r0.m10965d()
            r8.m5980g(r1)
            float r0 = r0.m10964c()
            r8.m5979f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.m10937h0(com.zykj.blackboard.bean.BoardConfig):void"); // DEX body: android/新测评/smali_classes5/com/zykj/view/board/board/BoardViewModel.smali:7166
    }

    /* renamed from: h1 */
    public final void m10938h1(AbstractC7227n mainToolType) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        MutableStateFlow mutableStateFlow = this._mainToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7226m.m11004b((C7226m) value, false, false, false, false, false, mainToolType, 31, null)));
        if (!Intrinsics.areEqual(mainToolType, AbstractC7227n.b.f11068e)) {
            MutableStateFlow mutableStateFlow2 = this._graphToolState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7224k.m10993b((C7224k) value2, false, false, false, false, AbstractC7225l.a.f11053e, 15, null)));
        }
        if (Intrinsics.areEqual(mainToolType, AbstractC7227n.d.f11070e)) {
            BoardConfig boardConfigM10905P = m10905P();
            if (boardConfigM10905P != null) {
                boardConfigM10905P.setMode(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(mainToolType, AbstractC7227n.c.f11069e)) {
            m10928a1();
        } else if (Intrinsics.areEqual(mainToolType, AbstractC7227n.a.f11067e)) {
            m10926Z0();
        } else if (!Intrinsics.areEqual(mainToolType, AbstractC7227n.b.f11068e)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: i0 */
    public final void m10939i0(IBoardControl boardControl, boolean haveCache, long duration) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(boardControl, "boardControl");
        LogUtils.m3239i("initBoardControl Start");
        this.boardControl = boardControl;
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, null, null, haveCache, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        if (duration > 0) {
            MutableStateFlow mutableStateFlow2 = this._recordState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7232s.m11037b((C7232s) value2, AbstractC7233t.a.f11112f, false, C5066w.f2629a.m2604b(duration), 2, null)));
        }
        BoardConfig boardConfigM10905P = m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setSelectIconWidth(48.0f);
            m10947n1(!Intrinsics.areEqual(AbstractC5065v.m2591j(), Boolean.FALSE));
            m10889G0(boardConfigM10905P);
            m10937h0(boardConfigM10905P);
            boardConfigM10905P.setImageCropView(this.imageCropView);
            m10952t0(boardConfigM10905P);
            m10943l0(boardConfigM10905P);
            m10954v0(boardConfigM10905P);
            boardConfigM10905P.setSelectCustomColorView(this.customColorView);
            m10884C0(boardConfigM10905P);
            m10938h1(AbstractC7227n.c.f11069e);
        }
        final Function1 function1 = new Function1() { // from class: q7.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m10858j0(this.f15283a, (InterfaceC8629i) obj);
            }
        };
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y != null) {
            LogUtils.m3239i("pageControl is not Null");
            function1.invoke(interfaceC8629iM10923Y);
        } else {
            LogUtils.m3239i("pageControl is Null");
            IBoardControl.DefaultImpls.m6700a(boardControl, false, new Function0() { // from class: q7.q1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BoardViewModel.m10860k0(this.f15286a, function1);
                }
            }, 1, null);
        }
        LogUtils.m3239i("initBoardControl Finished");
    }

    /* renamed from: i1 */
    public final void m10940i1(int level) {
        Object value;
        AbstractC7229p abstractC7229p;
        Object value2;
        Object bVar = AbstractC7218e.m10972c().get(level);
        if (bVar instanceof AbstractC7229p.b) {
            bVar = new AbstractC7229p.b(((C7230q) this._penToolState.getValue()).m11028f());
        }
        MutableStateFlow mutableStateFlow = this._penToolState;
        do {
            value = mutableStateFlow.getValue();
            abstractC7229p = (AbstractC7229p) bVar;
        } while (!mutableStateFlow.compareAndSet(value, C7230q.m11023b((C7230q) value, false, false, null, 0, abstractC7229p, 0, false, 111, null)));
        boolean z9 = bVar instanceof AbstractC7229p.b;
        if (z9) {
            m10914T0();
        } else {
            MutableStateFlow mutableStateFlow2 = this._penToolState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7230q.m11023b((C7230q) value2, false, false, null, 0, null, 0, false, 63, null)));
        }
        if (z9 && ((AbstractC7229p) bVar).m11021a() == 0) {
            return;
        }
        m10928a1();
        m10922X0();
        AbstractC5065v.m2596o(Integer.valueOf(abstractC7229p.m11021a()));
    }

    /* renamed from: j1 */
    public final void m10941j1(int color) {
        MutableStateFlow mutableStateFlow = this._penToolState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            C7230q c7230q = (C7230q) value;
            int i10 = color;
            if (mutableStateFlow.compareAndSet(value, C7230q.m11023b(c7230q, false, false, null, 0, c7230q.m11027e() instanceof AbstractC7229p.b ? new AbstractC7229p.b(color) : c7230q.m11027e(), i10, false, 79, null))) {
                m10928a1();
                m10922X0();
                AbstractC5065v.m2596o(Integer.valueOf(i10));
                return;
            }
            color = i10;
        }
    }

    /* renamed from: k1 */
    public final void m10942k1(int level) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenSizeLevel$1(this, level, null), 3, null);
    }

    /* renamed from: l0 */
    public final void m10943l0(BoardConfig boardConfig) {
        Object value;
        Float fM2583b = AbstractC5065v.m2583b();
        int i10 = 0;
        if (fM2583b != null) {
            float fFloatValue = fM2583b.floatValue();
            Iterator it = AbstractC7218e.m10971b().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (((AbstractC7220g) it.next()).m10978b() == fFloatValue) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                i10 = i11;
            }
        }
        AbstractC7220g abstractC7220g = (AbstractC7220g) AbstractC7218e.m10971b().get(i10);
        MutableStateFlow mutableStateFlow = this._eraserToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((C7219f) value).m10975a(abstractC7220g)));
    }

    /* renamed from: l1 */
    public final void m10944l1(AbstractC7231r penType) {
        Intrinsics.checkNotNullParameter(penType, "penType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenType$1(this, penType, null), 3, null);
    }

    /* renamed from: m0 */
    public final void m10945m0(InterfaceC8629i pageControl) {
        AbstractC8906b2.m15022b(pageControl, new Function1() { // from class: q7.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m10864n0(this.f15271a, (CommandInfoEntity) obj);
            }
        });
    }

    /* renamed from: m1 */
    public final void m10946m1(SelectGraphEnum selectGraphEnum) {
        Object value;
        Intrinsics.checkNotNullParameter(selectGraphEnum, "selectGraphEnum");
        C8910c2 c8910c2 = (C8910c2) this._selectToolState.getValue();
        boolean zM15032e = c8910c2.m15032e();
        boolean zM15030c = c8910c2.m15030c();
        boolean zM15031d = c8910c2.m15031d();
        boolean zM15033f = c8910c2.m15033f();
        boolean zM15029b = c8910c2.m15029b();
        int i10 = C7211a.f10977b[selectGraphEnum.ordinal()];
        if (i10 == 1) {
            zM15032e = !zM15032e;
        } else if (i10 == 2) {
            zM15030c = !zM15030c;
        } else if (i10 == 3) {
            zM15031d = !zM15031d;
        } else if (i10 == 4) {
            zM15033f = !zM15033f;
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            zM15029b = !zM15029b;
        }
        boolean z9 = zM15029b;
        boolean z10 = zM15032e;
        boolean z11 = zM15030c;
        boolean z12 = zM15031d;
        boolean z13 = zM15033f;
        if (!z10 && !z11 && !z12 && !z13 && !z9) {
            ToastUtils.showShort("最少需要选中一个素材类型", new Object[0]);
            return;
        }
        MutableStateFlow mutableStateFlow = this._selectToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((C8910c2) value).m15028a(z10, z11, z12, z13, z9)));
        m10930b1();
    }

    /* renamed from: n1 */
    public final void m10947n1(boolean isTouchable) {
        boolean z9;
        MutableStateFlow mutableStateFlow = this._mainToolState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            z9 = isTouchable;
            if (mutableStateFlow.compareAndSet(value, C7226m.m11004b((C7226m) value, false, false, false, false, z9, null, 47, null))) {
                break;
            } else {
                isTouchable = z9;
            }
        }
        BoardConfig boardConfigM10905P = m10905P();
        if (boardConfigM10905P != null) {
            boardConfigM10905P.setFingerDraw(z9);
        }
        AbstractC5065v.m2602u(Boolean.valueOf(z9));
    }

    /* renamed from: o0 */
    public final void m10948o0(InterfaceC8629i pageControl) {
        AbstractC8906b2.m15023c(pageControl, new Function1() { // from class: q7.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m10868p0(this.f15275a, ((Integer) obj).intValue());
            }
        });
    }

    /* renamed from: p1 */
    public final void m10949p1(boolean isZoomUp) {
        int i10;
        Object value;
        int i11 = this.zoomLevelIndex;
        if (isZoomUp && i11 < m10907Q().size() - 1) {
            this.zoomLevelIndex++;
        } else if (!isZoomUp && (i10 = this.zoomLevelIndex) > 0) {
            this.zoomLevelIndex = i10 - 1;
        }
        if (i11 == this.zoomLevelIndex) {
            return;
        }
        float fM11046a = ((AbstractC7234u) m10907Q().get(this.zoomLevelIndex)).m11046a();
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y == null) {
            return;
        }
        PointF pointF = this.zoomPointF;
        interfaceC8629iM10923Y.mo6729s(pointF.x, pointF.y, fM11046a);
        float moveVerticalProgress = interfaceC8629iM10923Y.getMoveVerticalProgress();
        float moveHorizontalProgress = interfaceC8629iM10923Y.getMoveHorizontalProgress();
        float f10 = moveVerticalProgress > 1.0f ? 1.0f : moveVerticalProgress < 0.0f ? 0.0f : moveVerticalProgress;
        float f11 = moveHorizontalProgress <= 1.0f ? moveHorizontalProgress < 0.0f ? 0.0f : fM11046a <= 1.0f ? 0.5f : moveHorizontalProgress : 1.0f;
        if (f10 != moveVerticalProgress || f11 != moveHorizontalProgress) {
            interfaceC8629iM10923Y.areaMoveStart();
            interfaceC8629iM10923Y.areaMoveEnd(Float.valueOf(f11), Float.valueOf(f10));
        }
        if (m10905P() == null) {
            return;
        }
        float f12 = 1;
        float fM11994b = f12 / (r3.getMoveActionConfig().m11994b() * fM11046a);
        float fM11995c = f12 / (r3.getMoveActionConfig().m11995c() * fM11046a);
        MutableStateFlow mutableStateFlow = this._extraUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7223j.m10982b((C7223j) value, null, null, false, false, 0.0f, fM11994b, false, 0.0f, fM11995c, 223, null)));
    }

    /* renamed from: q0 */
    public final void m10950q0(InterfaceC8629i pageControl) {
        pageControl.mo6711d(new C7213b());
    }

    /* renamed from: r0 */
    public final void m10951r0(InterfaceC8629i pageControl) {
        AbstractC8906b2.m15025e(pageControl, new Function1() { // from class: q7.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m10872s0(this.f15259a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* renamed from: t0 */
    public final void m10952t0(BoardConfig boardConfig) {
    }

    /* renamed from: u0 */
    public final void m10953u0(InterfaceC8629i pageControl) {
        LogUtils.m3239i("initPageControl Start");
        m10950q0(pageControl);
        m10955w0(pageControl);
        m10951r0(pageControl);
        m10886D0(pageControl);
        m10948o0(pageControl);
        m10933d0(pageControl);
        m10945m0(pageControl);
        m10882A0(pageControl);
        m10895J0();
        m10897K0();
        LogUtils.m3239i("initPageControl Finished");
    }

    /* renamed from: v0 */
    public final void m10954v0(BoardConfig boardConfig) {
        Object value;
        C7230q c7230q;
        AbstractC7229p abstractC7229pM2531g;
        AbstractC7229p abstractC7229p;
        int iM11021a;
        AbstractC7231r abstractC7231r;
        Integer numM2586e;
        MutableStateFlow mutableStateFlow = this._penToolState;
        do {
            value = mutableStateFlow.getValue();
            c7230q = (C7230q) value;
            Integer numM2585d = AbstractC5065v.m2585d();
            if (numM2585d == null || (abstractC7229pM2531g = AbstractC5046c.m2531g(numM2585d.intValue())) == null) {
                abstractC7229pM2531g = AbstractC7229p.a.f11084c;
            }
            abstractC7229p = abstractC7229pM2531g;
            iM11021a = abstractC7229p instanceof AbstractC7229p.b ? abstractC7229p.m11021a() : new AbstractC7229p.b(0, 1, null).m11021a();
            List listM10973d = AbstractC7218e.m10973d();
            Integer numM2587f = AbstractC5065v.m2587f();
            abstractC7231r = (AbstractC7231r) listM10973d.get(numM2587f != null ? numM2587f.intValue() : 0);
            numM2586e = AbstractC5065v.m2586e();
        } while (!mutableStateFlow.compareAndSet(value, C7230q.m11023b(c7230q, false, false, abstractC7231r, numM2586e != null ? numM2586e.intValue() : 0, abstractC7229p, iM11021a, false, 67, null)));
    }

    /* renamed from: w0 */
    public final void m10955w0(InterfaceC8629i pageControl) {
        AbstractC8906b2.m15026f(pageControl, new Function0() { // from class: q7.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m10877x0(this.f15291a);
            }
        }, new Function1() { // from class: q7.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardViewModel.m10879y0(this.f15294a, ((Long) obj).longValue());
            }
        }, new Function0() { // from class: q7.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardViewModel.m10880z0(this.f15297a);
            }
        });
    }

    /* renamed from: x */
    public final void m10956x(Bitmap bitmap, String path, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean isSelected, String filename, Function1 imagePathCallback) {
        Intrinsics.checkNotNullParameter(scaleTypeEnum, "scaleTypeEnum");
        Intrinsics.checkNotNullParameter(filename, "filename");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$addImageGraph$1(this, bitmap, filename, scaleTypeEnum, path, imagePathCallback, isSelected, null), 3, null);
    }

    /* renamed from: z */
    public final void m10957z(String content) {
        C9008d c9008dM14207c;
        Object value;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC8629i interfaceC8629iM10923Y = m10923Y();
        if (interfaceC8629iM10923Y == null || (c9008dM14207c = InterfaceC8629i.a.m14207c(interfaceC8629iM10923Y, content, EzyPositionEnum.PositionEnum.CENTER, 0, 4, null)) == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this._mainToolState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7226m.m11004b((C7226m) value, false, false, false, false, false, AbstractC7227n.d.f11070e, 31, null)));
        interfaceC8629iM10923Y.mo6708E(CollectionsKt.listOf(c9008dM14207c.getId()));
    }
}
