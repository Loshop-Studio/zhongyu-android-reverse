package com.zykj.view.board.board;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.ViewModel;
import android.view.ViewModelKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3383c0;
import com.blankj.utilcode.util.AbstractC3387g;
import com.blankj.utilcode.util.C3404x;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.edit.IPageControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.blackboard.enums.SelectGraphEnumKt;
import com.zykj.blackboard.listener.GraphDeleteListener;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.blackboard.proxy.ImageCropView;
import com.zykj.blackboard.proxy.TextEditView;
import com.zykj.board.EzyModeEnum$ModeEnum;
import com.zykj.board.EzyPositionEnum$PositionEnum;
import com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum;
import com.zykj.view.C5280R;
import com.zykj.view.board.board.BoardEvent;
import com.zykj.view.board.board.ExpandStatus;
import com.zykj.view.board.board.GraphType;
import com.zykj.view.board.board.MainToolType;
import com.zykj.view.board.board.MinorToolType;
import com.zykj.view.board.board.PenColor;
import com.zykj.view.board.board.RecordStatus;
import com.zykj.view.board.board.ZoomLevel;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.utils.SPDataKt;
import com.zykj.view.utils.TimeFormatUtils;
import com.zykj.view.utils.ZoomPointSolution;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5911f0;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.flow.C5960z;
import kotlinx.coroutines.flow.InterfaceC5905c0;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import kotlinx.coroutines.flow.InterfaceC5958x;
import kotlinx.coroutines.flow.InterfaceC5959y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016b0.RunnableC3059a;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b&\u0010$J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\f¢\u0006\u0004\b(\u0010$J\u0015\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0003J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u0003J\r\u0010/\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\u0003J\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\u0003J\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u0010\u0003J\r\u00102\u001a\u00020\u0007¢\u0006\u0004\b2\u0010\u0003J\r\u00103\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\u0003J\u0015\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b@\u0010?J\u0015\u0010B\u001a\u00020\u00072\u0006\u0010A\u001a\u00020<¢\u0006\u0004\bB\u0010?J\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010\u0003J\r\u0010D\u001a\u00020\u0007¢\u0006\u0004\bD\u0010\u0003J\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\u0003J\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\u0003J\r\u0010G\u001a\u00020\u0007¢\u0006\u0004\bG\u0010\u0003J\u0015\u0010H\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<¢\u0006\u0004\bH\u0010?J\u0015\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ]\u0010W\u001a\u00020\u00072\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010S\u001a\u00020\f2\b\b\u0002\u0010T\u001a\u00020O2\u0018\b\u0002\u0010V\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020\u0007\u0018\u00010U¢\u0006\u0004\bW\u0010XJ%\u0010[\u001a\u00020\u00072\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020O0Y2\b\b\u0002\u0010S\u001a\u00020\f¢\u0006\u0004\b[\u0010\\J\u0015\u0010^\u001a\u00020\u00072\u0006\u0010]\u001a\u00020O¢\u0006\u0004\b^\u0010_J\u0015\u0010`\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b`\u0010?J\r\u0010a\u001a\u00020\u0007¢\u0006\u0004\ba\u0010\u0003J%\u0010d\u001a\u00020\u00072\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bd\u0010eJ%\u0010f\u001a\u00020\u00072\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bf\u0010eJ\r\u0010g\u001a\u00020\u0007¢\u0006\u0004\bg\u0010\u0003J\u0017\u0010i\u001a\u00020\u00072\b\b\u0002\u0010h\u001a\u00020\f¢\u0006\u0004\bi\u0010$J\r\u0010j\u001a\u00020\u0007¢\u0006\u0004\bj\u0010\u0003J\u0015\u0010l\u001a\u00020\u00072\u0006\u0010k\u001a\u00020\f¢\u0006\u0004\bl\u0010$Jm\u0010u\u001a\u00020\u00072\b\b\u0002\u0010m\u001a\u00020\f2\b\b\u0002\u0010n\u001a\u00020\f2$\b\u0002\u0010s\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020p\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070q\u0012\u0006\u0012\u0004\u0018\u00010r0o2$\b\u0002\u0010t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020O\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070q\u0012\u0006\u0012\u0004\u0018\u00010r0o¢\u0006\u0004\bu\u0010vJ\u0013\u0010w\u001a\b\u0012\u0004\u0012\u00020O0Y¢\u0006\u0004\bw\u0010xJ\u0013\u0010y\u001a\b\u0012\u0004\u0012\u00020O0Y¢\u0006\u0004\by\u0010xJ\r\u0010z\u001a\u00020\u0007¢\u0006\u0004\bz\u0010\u0003J\u0017\u0010}\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0004\b}\u0010~J\u001b\u0010\u0081\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0083\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0082\u0001J\u001b\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0082\u0001J\u001b\u0010\u0086\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0082\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0082\u0001J\u0019\u0010\u0088\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0005\b\u0088\u0001\u0010~J\u0019\u0010\u0089\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0005\b\u0089\u0001\u0010~J\u0019\u0010\u008a\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0005\b\u008a\u0001\u0010~J\u0019\u0010\u008b\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0005\b\u008b\u0001\u0010~J\u0019\u0010\u008c\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0005\b\u008c\u0001\u0010~J\u0019\u0010\u008d\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0005\b\u008d\u0001\u0010~J\u0019\u0010\u008e\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0005\b\u008e\u0001\u0010~J\u0019\u0010\u008f\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020{H\u0002¢\u0006\u0005\b\u008f\u0001\u0010~J\u0011\u0010\u0090\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0003J\u0011\u0010\u0091\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0003J\u0011\u0010\u0092\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0092\u0001\u0010\u0003J\u0011\u0010\u0093\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0093\u0001\u0010\u0003J\u0011\u0010\u0094\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0094\u0001\u0010\u0003J\u0011\u0010\u0095\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0095\u0001\u0010\u0003J\u0011\u0010\u0096\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0003J\u0011\u0010\u0097\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u0003J#\u0010\u0099\u0001\u001a\u00020\u00072\u0007\u0010\u0098\u0001\u001a\u00020\u007f2\u0006\u0010A\u001a\u00020<H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010\u009b\u0001R,\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u001b\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010 \u0001R,\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R,\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R,\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010¶\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R$\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010¿\u00018\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001f\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030Å\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R$\u0010É\u0001\u001a\n\u0012\u0005\u0012\u00030Å\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R\u001f\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030Í\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ç\u0001R$\u0010Ï\u0001\u001a\n\u0012\u0005\u0012\u00030Í\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ê\u0001\u001a\u0006\bÐ\u0001\u0010Ì\u0001R\u001f\u0010Ò\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ç\u0001R$\u0010Ó\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ê\u0001\u001a\u0006\bÔ\u0001\u0010Ì\u0001R\u001f\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010Ç\u0001R$\u0010×\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\b×\u0001\u0010Ê\u0001\u001a\u0006\bØ\u0001\u0010Ì\u0001R\u001f\u0010Ú\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Ç\u0001R$\u0010Û\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ê\u0001\u001a\u0006\bÜ\u0001\u0010Ì\u0001R\u001f\u0010Þ\u0001\u001a\n\u0012\u0005\u0012\u00030Ý\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010Ç\u0001R$\u0010ß\u0001\u001a\n\u0012\u0005\u0012\u00030Ý\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\bß\u0001\u0010Ê\u0001\u001a\u0006\bà\u0001\u0010Ì\u0001R\u001f\u0010â\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010Ç\u0001R$\u0010ã\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\bã\u0001\u0010Ê\u0001\u001a\u0006\bä\u0001\u0010Ì\u0001R\u001f\u0010æ\u0001\u001a\n\u0012\u0005\u0012\u00030å\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010Ç\u0001R$\u0010ç\u0001\u001a\n\u0012\u0005\u0012\u00030å\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010Ê\u0001\u001a\u0006\bè\u0001\u0010Ì\u0001R\u001f\u0010ê\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010Ç\u0001R$\u0010ë\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010È\u00018\u0006¢\u0006\u0010\n\u0006\bë\u0001\u0010Ê\u0001\u001a\u0006\bì\u0001\u0010Ì\u0001R\u001e\u0010í\u0001\u001a\t\u0012\u0004\u0012\u00020\f0Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010Ç\u0001R#\u0010î\u0001\u001a\t\u0012\u0004\u0012\u00020\f0È\u00018\u0006¢\u0006\u0010\n\u0006\bî\u0001\u0010Ê\u0001\u001a\u0006\bï\u0001\u0010Ì\u0001R\u0019\u0010ð\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u0014\u0010ò\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0018\u0010|\u001a\u0004\u0018\u00010{8BX\u0082\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8BX\u0082\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u001d\u0010ú\u0001\u001a\t\u0012\u0005\u0012\u00030ø\u00010Y8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bù\u0001\u0010x¨\u0006û\u0001"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "right", "bottom", "Ld6/s;", "initZoomPointF", "(FF)V", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "boardControl", "", "haveCache", "", TypedValues.TransitionType.S_DURATION, "initBoardControl", "(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V", "Lcom/zykj/view/board/board/BoardViewConfig;", "boardViewConfig", "updateUIByViewConfig", "(Lcom/zykj/view/board/board/BoardViewConfig;)V", "Lcom/zykj/view/board/board/BoardSketchConfig;", "boardSketchConfig", "initSketchConfig", "(Lcom/zykj/view/board/board/BoardSketchConfig;)V", "Lcom/zykj/view/board/board/BoardCallbackConfig;", "boardCallbackConfig", "initCallbackConfig", "(Lcom/zykj/view/board/board/BoardCallbackConfig;)V", "Lcom/zykj/view/board/board/MainToolType;", "mainToolType", "updateModeType", "(Lcom/zykj/view/board/board/MainToolType;)V", "isRecover", "startRevoke", "(Z)V", "isTouchable", "updateTouchable", "isZoomUp", "updateZoomLevel", "Lcom/zykj/view/board/board/MinorToolType;", "minorToolType", "updateMinorToolType", "(Lcom/zykj/view/board/board/MinorToolType;)V", "switchSelectTool", "switchPenTool", "switchEraserTool", "switchGraphTool", "switchBackgroundTool", "cleanPage", "handleExpandClick", "Lcom/zykj/blackboard/enums/SelectGraphEnum;", "selectGraphEnum", "updateSelectTypeByEnum", "(Lcom/zykj/blackboard/enums/SelectGraphEnum;)V", "Lcom/zykj/view/board/board/PenType;", "penType", "updatePenType", "(Lcom/zykj/view/board/board/PenType;)V", "", "level", "updatePenSizeLevel", "(I)V", "updatePenColorLevel", TypedValues.Custom.S_COLOR, "updatePenCustomColor", "dismissCustomColorPalette", "dismissPanelsForCanvasTouch", "dismissPanelsForToolbarClick", "dismissAllPanelsAndSelection", "dismissPanelsForSelectToolbarItemClick", "updateEraserSizeLevel", "Lcom/zykj/view/board/board/GraphType;", "graphType", "updateGraphType", "(Lcom/zykj/view/board/board/GraphType;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "path", "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;", "scaleTypeEnum", "isSelected", "filename", "Lkotlin/Function1;", "imagePathCallback", "addImageGraph", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;)V", "", "pathList", "addBitmapList", "(Ljava/util/List;Z)V", "content", "addText", "(Ljava/lang/String;)V", "updateBackgroundLevel", "areaMoveStart", "horizontalProgress", "verticalProgress", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMoveEnd", "switchRecordState", "isMicroPhoneOn", "updateMicroPhone", "dropDraftCache", "isOpen", "updateExpandState", "needClear", "isContentThumbnail", "Lkotlin/Function2;", "", "Lh6/c;", "", "error", "callback", "getSavePath", "(ZZLr6/e;Lr6/e;)V", "getRecordingImagePathList", "()Ljava/util/List;", "getPathListByImageGraph", "resetRevoke", "Lcom/zykj/blackboard/core/edit/IPageControl;", "pageControl", "initPageControl", "(Lcom/zykj/blackboard/core/edit/IPageControl;)V", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "initEraserSizeLevel", "(Lcom/zykj/blackboard/bean/BoardConfig;)V", "initSelectConfig", "initPenConfig", "initTextConfig", "initBackgroundLevel", "initMoveConfig", "initGraphDeleteListener", "initRecordListener", "initMicroPhoneListener", "initTextChangeListener", "initGeometryColorListener", "initAreaMoveListener", "initEventListener", "initRevokeListener", "reloadBackgroundToUI", "reloadZoomAndMoveToUI", "updateConfigAboutSelect", "switchPenCustomColor", "updateConfigAboutPen", "updateConfigAboutEraser", "applyGeometryStyleFromPenState", "syncGeometryStyleIfInGeometryMode", "config", "setGeometryColorCompat", "(Lcom/zykj/blackboard/bean/BoardConfig;I)V", "Lcom/zykj/view/board/board/BoardSketchConfig;", "value", "Lcom/zykj/view/board/board/BoardCallbackConfig;", "getBoardCallbackConfig", "()Lcom/zykj/view/board/board/BoardCallbackConfig;", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "Lcom/zykj/blackboard/proxy/TextEditView;", "textEditView", "Lcom/zykj/blackboard/proxy/TextEditView;", "getTextEditView", "()Lcom/zykj/blackboard/proxy/TextEditView;", "setTextEditView", "(Lcom/zykj/blackboard/proxy/TextEditView;)V", "Lcom/zykj/blackboard/proxy/ImageCropView;", "imageCropView", "Lcom/zykj/blackboard/proxy/ImageCropView;", "getImageCropView", "()Lcom/zykj/blackboard/proxy/ImageCropView;", "setImageCropView", "(Lcom/zykj/blackboard/proxy/ImageCropView;)V", "Lcom/zykj/blackboard/proxy/CustomColorView;", "customColorView", "Lcom/zykj/blackboard/proxy/CustomColorView;", "getCustomColorView", "()Lcom/zykj/blackboard/proxy/CustomColorView;", "setCustomColorView", "(Lcom/zykj/blackboard/proxy/CustomColorView;)V", "zoomLevelIndex", "I", "Landroid/graphics/PointF;", "zoomPointF", "Landroid/graphics/PointF;", "Lkotlinx/coroutines/flow/x;", "Lcom/zykj/view/board/board/BoardEvent;", "_event", "Lkotlinx/coroutines/flow/x;", "Lkotlinx/coroutines/flow/c0;", NotificationCompat.CATEGORY_EVENT, "Lkotlinx/coroutines/flow/c0;", "getEvent", "()Lkotlinx/coroutines/flow/c0;", "Lkotlinx/coroutines/flow/y;", "Lcom/zykj/view/board/board/MainToolState;", "_mainToolState", "Lkotlinx/coroutines/flow/y;", "Lkotlinx/coroutines/flow/m0;", "mainToolState", "Lkotlinx/coroutines/flow/m0;", "getMainToolState", "()Lkotlinx/coroutines/flow/m0;", "Lcom/zykj/view/board/board/SelectToolState;", "_selectToolState", "selectToolState", "getSelectToolState", "Lcom/zykj/view/board/board/PenToolState;", "_penToolState", "penToolState", "getPenToolState", "Lcom/zykj/view/board/board/EraserToolState;", "_eraserToolState", "eraserToolState", "getEraserToolState", "Lcom/zykj/view/board/board/GraphToolState;", "_graphToolState", "graphToolState", "getGraphToolState", "Lcom/zykj/view/board/board/BackgroundToolState;", "_backgroundToolState", "backgroundToolState", "getBackgroundToolState", "Lcom/zykj/view/board/board/ExtraUIState;", "_extraUIState", "extraUIState", "getExtraUIState", "Lcom/zykj/view/board/board/RecordState;", "_recordState", "recordState", "getRecordState", "Lcom/zykj/view/board/board/ExpandState;", "_expandState", "expandState", "getExpandState", "_loadFinished", "loadFinished", "getLoadFinished", "lastIsMicroPhoneOn", "Z", "isImageOutOfCount", "()Z", "getPageControl", "()Lcom/zykj/blackboard/core/edit/IPageControl;", "getBoardConfig", "()Lcom/zykj/blackboard/bean/BoardConfig;", "Lcom/zykj/view/board/board/ZoomLevel;", "getCurrentZoomLevelList", "currentZoomLevelList", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1494:1\n226#2,5:1495\n226#2,5:1500\n226#2,5:1505\n226#2,5:1510\n226#2,5:1515\n226#2,5:1520\n226#2,5:1525\n226#2,5:1537\n226#2,3:1542\n229#2,2:1547\n226#2,5:1549\n226#2,5:1561\n226#2,3:1566\n229#2,2:1571\n226#2,5:1580\n226#2,5:1585\n226#2,5:1590\n226#2,5:1595\n226#2,5:1600\n226#2,5:1605\n226#2,5:1610\n226#2,5:1615\n226#2,5:1620\n226#2,5:1625\n226#2,5:1630\n226#2,5:1635\n226#2,5:1640\n226#2,5:1645\n226#2,5:1650\n226#2,5:1655\n226#2,5:1660\n226#2,5:1665\n226#2,5:1670\n226#2,5:1675\n226#2,5:1681\n226#2,5:1686\n226#2,5:1691\n226#2,5:1696\n226#2,5:1705\n226#2,5:1710\n226#2,5:1715\n226#2,5:1720\n226#2,5:1725\n226#2,5:1730\n226#2,5:1735\n226#2,5:1740\n226#2,5:1745\n226#2,5:1750\n226#2,5:1755\n226#2,5:1760\n226#2,5:1765\n226#2,5:1770\n360#3,7:1530\n1869#3,2:1545\n360#3,7:1554\n230#3,2:1569\n360#3,7:1573\n1869#3:1701\n1870#3:1704\n1#4:1680\n1310#5,2:1702\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel\n*L\n170#1:1495,5\n173#1:1500,5\n286#1:1505,5\n293#1:1510,5\n300#1:1515,5\n309#1:1520,5\n315#1:1525,5\n349#1:1537,5\n358#1:1542,3\n358#1:1547,2\n389#1:1549,5\n436#1:1561,5\n608#1:1566,3\n608#1:1571,2\n635#1:1580,5\n653#1:1585,5\n656#1:1590,5\n694#1:1595,5\n755#1:1600,5\n767#1:1605,5\n775#1:1610,5\n789#1:1615,5\n799#1:1620,5\n810#1:1625,5\n824#1:1630,5\n838#1:1635,5\n895#1:1640,5\n971#1:1645,5\n980#1:1650,5\n995#1:1655,5\n1011#1:1660,5\n1018#1:1665,5\n1032#1:1670,5\n1043#1:1675,5\n1057#1:1681,5\n1069#1:1686,5\n1107#1:1691,5\n1132#1:1696,5\n1295#1:1705,5\n1308#1:1710,5\n1378#1:1715,5\n1397#1:1720,5\n1399#1:1725,5\n495#1:1730,5\n498#1:1735,5\n501#1:1740,5\n512#1:1745,5\n549#1:1750,5\n557#1:1755,5\n565#1:1760,5\n581#1:1765,5\n591#1:1770,5\n344#1:1530,7\n365#1:1545,2\n431#1:1554,7\n610#1:1569,2\n625#1:1573,7\n1183#1:1701\n1183#1:1704\n1185#1:1702,2\n*E\n"})
/* loaded from: classes3.dex */
public final class BoardViewModel extends ViewModel {

    @NotNull
    private final InterfaceC5959y _backgroundToolState;

    @NotNull
    private final InterfaceC5959y _eraserToolState;

    @NotNull
    private final InterfaceC5958x _event;

    @NotNull
    private final InterfaceC5959y _expandState;

    @NotNull
    private final InterfaceC5959y _extraUIState;

    @NotNull
    private final InterfaceC5959y _graphToolState;

    @NotNull
    private final InterfaceC5959y _loadFinished;

    @NotNull
    private final InterfaceC5959y _mainToolState;

    @NotNull
    private final InterfaceC5959y _penToolState;

    @NotNull
    private final InterfaceC5959y _recordState;

    @NotNull
    private final InterfaceC5959y _selectToolState;

    @NotNull
    private final InterfaceC5944m0 backgroundToolState;

    @Nullable
    private BoardCallbackConfig boardCallbackConfig;

    @Nullable
    private IBoardControl boardControl;

    @Nullable
    private BoardSketchConfig boardSketchConfig;

    @Nullable
    private CustomColorView customColorView;

    @NotNull
    private final InterfaceC5944m0 eraserToolState;

    @NotNull
    private final InterfaceC5905c0 event;

    @NotNull
    private final InterfaceC5944m0 expandState;

    @NotNull
    private final InterfaceC5944m0 extraUIState;

    @NotNull
    private final InterfaceC5944m0 graphToolState;

    @Nullable
    private ImageCropView imageCropView;
    private boolean lastIsMicroPhoneOn;

    @NotNull
    private final InterfaceC5944m0 loadFinished;

    @NotNull
    private final InterfaceC5944m0 mainToolState;

    @NotNull
    private final InterfaceC5944m0 penToolState;

    @NotNull
    private final InterfaceC5944m0 recordState;

    @NotNull
    private final InterfaceC5944m0 selectToolState;

    @Nullable
    private TextEditView textEditView;
    private int zoomLevelIndex = DataStateKt.getZoomLevelList().indexOf(ZoomLevel.Level3.INSTANCE);

    @NotNull
    private final PointF zoomPointF = new PointF();

    @Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ZoomPointSolution.values().length];
            try {
                iArr[ZoomPointSolution.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoomPointSolution.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoomPointSolution.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZoomPointSolution.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZoomPointSolution.CENTER_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZoomPointSolution.CENTER_TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ZoomPointSolution.CENTER_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ZoomPointSolution.CENTER_BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ZoomPointSolution.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
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
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$addBitmapList$1", m5303f = "BoardViewModel.kt", m5304i = {0}, m5305l = {1258}, m5306m = "invokeSuspend", m5307n = {"$this$launch"}, m5308s = {"L$0"})
    @SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addBitmapList$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addBitmapList$1\n*L\n1277#1:1495,5\n*E\n"})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$addBitmapList$1 */
    public static final class C52861 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ List<String> $pathList;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "", "it"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$addBitmapList$1$1", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: com.zykj.view.board.board.BoardViewModel$addBitmapList$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass1(InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5631c);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC5631c<? super Boolean>) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z8 = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                return Boolean.valueOf(z8);
            }

            public final Object invoke(boolean z8, InterfaceC5631c<? super Boolean> interfaceC5631c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z8), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52861(List<String> list, boolean z8, InterfaceC5631c<? super C52861> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$pathList = list;
            this.$isSelected = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C52861 c52861 = BoardViewModel.this.new C52861(this.$pathList, this.$isSelected, interfaceC5631c);
            c52861.L$0 = obj;
            return c52861;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM13956constructorimpl;
            C5946n0 c5946n0;
            Object value;
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC5944m0 loadFinished = BoardViewModel.this.getLoadFinished();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.L$0 = interfaceC6009v;
                this.label = 1;
                if (AbstractC5914h.m5554j(loadFinished, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            IPageControl pageControl = BoardViewModel.this.getPageControl();
            C5443s c5443s = C5443s.f8405a;
            if (pageControl != null) {
                if (BoardViewModel.this.isImageOutOfCount()) {
                    C3404x.m2356a("图片数量已达上限，不可继续插入", new Object[0]);
                    return c5443s;
                }
                try {
                    objM13956constructorimpl = Result.m13956constructorimpl(pageControl.addImageList(this.$pathList, EzyPositionEnum$PositionEnum.CENTER, EzyScaleTypeEnum$ScaleTypeEnum.MODE_ADAPTER_8));
                } catch (Throwable th) {
                    objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
                }
                if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
                    C3404x.m2356a("图片数量超过上限", new Object[0]);
                }
                List list = (List) (Result.m13961isFailureimpl(objM13956constructorimpl) ? null : objM13956constructorimpl);
                if (list != null) {
                    boolean z8 = this.$isSelected;
                    BoardViewModel boardViewModel = BoardViewModel.this;
                    if (z8) {
                        InterfaceC5959y interfaceC5959y = boardViewModel._mainToolState;
                        do {
                            c5946n0 = (C5946n0) interfaceC5959y;
                            value = c5946n0.getValue();
                        } while (!c5946n0.m5569i(value, MainToolState.copy$default((MainToolState) value, false, false, false, false, false, MainToolType.Select.INSTANCE, 31, null)));
                        pageControl.newSelectGraph(AbstractC5806u.m5286y(((ImageGraph) AbstractC5805t.m5235o0(list)).getId()));
                    }
                }
            }
            return c5443s;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52861) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1", m5303f = "BoardViewModel.kt", m5304i = {0}, m5305l = {1207}, m5306m = "invokeSuspend", m5307n = {"$this$launch"}, m5308s = {"L$0"})
    @SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n*L\n1242#1:1495,5\n*E\n"})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$addImageGraph$1 */
    public static final class C52871 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ String $filename;
        final /* synthetic */ InterfaceC6471c $imagePathCallback;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ String $path;
        final /* synthetic */ EzyScaleTypeEnum$ScaleTypeEnum $scaleTypeEnum;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "", "it"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass1(InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5631c);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC5631c<? super Boolean>) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z8 = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                return Boolean.valueOf(z8);
            }

            public final Object invoke(boolean z8, InterfaceC5631c<? super Boolean> interfaceC5631c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z8), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52871(Bitmap bitmap, String str, EzyScaleTypeEnum$ScaleTypeEnum ezyScaleTypeEnum$ScaleTypeEnum, String str2, InterfaceC6471c interfaceC6471c, boolean z8, InterfaceC5631c<? super C52871> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$bitmap = bitmap;
            this.$filename = str;
            this.$scaleTypeEnum = ezyScaleTypeEnum$ScaleTypeEnum;
            this.$path = str2;
            this.$imagePathCallback = interfaceC6471c;
            this.$isSelected = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C52871 c52871 = BoardViewModel.this.new C52871(this.$bitmap, this.$filename, this.$scaleTypeEnum, this.$path, this.$imagePathCallback, this.$isSelected, interfaceC5631c);
            c52871.L$0 = obj;
            return c52871;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM13956constructorimpl;
            C5946n0 c5946n0;
            Object value;
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC5944m0 loadFinished = BoardViewModel.this.getLoadFinished();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.L$0 = interfaceC6009v;
                this.label = 1;
                if (AbstractC5914h.m5554j(loadFinished, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            IPageControl pageControl = BoardViewModel.this.getPageControl();
            C5443s c5443s = C5443s.f8405a;
            if (pageControl != null) {
                if (BoardViewModel.this.isImageOutOfCount()) {
                    C3404x.m2356a("图片数量已达上限，不可继续插入", new Object[0]);
                    return c5443s;
                }
                Bitmap bitmap = this.$bitmap;
                String str = this.$filename;
                EzyScaleTypeEnum$ScaleTypeEnum ezyScaleTypeEnum$ScaleTypeEnum = this.$scaleTypeEnum;
                String str2 = this.$path;
                try {
                    objM13956constructorimpl = Result.m13956constructorimpl(bitmap != null ? IPageControl.DefaultImpls.addImage$default(pageControl, bitmap, str, EzyPositionEnum$PositionEnum.CENTER, ezyScaleTypeEnum$ScaleTypeEnum, false, false, 48, null) : str2 != null ? IPageControl.DefaultImpls.addImage$default(pageControl, str2, EzyPositionEnum$PositionEnum.CENTER, ezyScaleTypeEnum$ScaleTypeEnum, false, 8, null) : null);
                } catch (Throwable th) {
                    objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
                }
                if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
                    C3404x.m2356a("图片数量超过上限", new Object[0]);
                }
                ImageGraph imageGraph = (ImageGraph) (Result.m13961isFailureimpl(objM13956constructorimpl) ? null : objM13956constructorimpl);
                if (imageGraph != null) {
                    InterfaceC6471c interfaceC6471c = this.$imagePathCallback;
                    boolean z8 = this.$isSelected;
                    BoardViewModel boardViewModel = BoardViewModel.this;
                    if (interfaceC6471c != null) {
                        interfaceC6471c.invoke(imageGraph.getFilePath());
                    }
                    if (z8) {
                        InterfaceC5959y interfaceC5959y = boardViewModel._mainToolState;
                        do {
                            c5946n0 = (C5946n0) interfaceC5959y;
                            value = c5946n0.getValue();
                        } while (!c5946n0.m5569i(value, MainToolState.copy$default((MainToolState) value, false, false, false, false, false, MainToolType.Select.INSTANCE, 31, null)));
                        pageControl.newSelectGraph(AbstractC5806u.m5286y(imageGraph.getId()));
                    }
                }
            }
            return c5443s;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52871) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "it", "Ld6/s;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$getSavePath$1", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$getSavePath$1 */
    public static final class C52881 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C52881(InterfaceC5631c<? super C52881> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C52881(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(Throwable th, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52881) create(th, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "it", "Ld6/s;", "<anonymous>", "(Ljava/lang/String;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$getSavePath$2", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$getSavePath$2 */
    public static final class C52892 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C52892(InterfaceC5631c<? super C52892> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C52892(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(String str, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52892) create(str, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {1442}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$getSavePath$3 */
    public static final class C52903 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $callback;
        final /* synthetic */ InterfaceC6473e $error;
        final /* synthetic */ boolean $isContentThumbnail;
        final /* synthetic */ boolean $needClear;
        int label;

        @Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "", "it"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$1", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: com.zykj.view.board.board.BoardViewModel$getSavePath$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass1(InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5631c);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC5631c<? super Boolean>) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z8 = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                return Boolean.valueOf(z8);
            }

            public final Object invoke(boolean z8, InterfaceC5631c<? super Boolean> interfaceC5631c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z8), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52903(boolean z8, boolean z9, InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, InterfaceC5631c<? super C52903> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$needClear = z8;
            this.$isContentThumbnail = z9;
            this.$callback = interfaceC6473e;
            this.$error = interfaceC6473e2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s invokeSuspend$lambda$0(BoardViewModel boardViewModel, InterfaceC6473e interfaceC6473e, String str) {
            InterfaceC6009v viewModelScope = ViewModelKt.getViewModelScope(boardViewModel);
            C5609e c5609e = AbstractC5896f0.f9343a;
            AbstractC6014x.m5651v(viewModelScope, AbstractC5479k.f8471a, null, new BoardViewModel$getSavePath$3$2$1(interfaceC6473e, str, null), 2);
            return C5443s.f8405a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s invokeSuspend$lambda$1(BoardViewModel boardViewModel, InterfaceC6473e interfaceC6473e, Throwable th) {
            InterfaceC6009v viewModelScope = ViewModelKt.getViewModelScope(boardViewModel);
            C5609e c5609e = AbstractC5896f0.f9343a;
            AbstractC6014x.m5651v(viewModelScope, AbstractC5479k.f8471a, null, new BoardViewModel$getSavePath$3$3$1(interfaceC6473e, th, null), 2);
            return C5443s.f8405a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return BoardViewModel.this.new C52903(this.$needClear, this.$isContentThumbnail, this.$callback, this.$error, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC5944m0 loadFinished = BoardViewModel.this.getLoadFinished();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (AbstractC5914h.m5554j(loadFinished, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            IBoardControl iBoardControl = BoardViewModel.this.boardControl;
            if (iBoardControl != null) {
                boolean z8 = this.$needClear;
                boolean z9 = this.$isContentThumbnail;
                BoardViewModel boardViewModel = BoardViewModel.this;
                iBoardControl.save(z8, z9, new C5317o(boardViewModel, this.$callback, 0), new C5317o(boardViewModel, this.$error, 1));
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52903) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$handleExpandClick$1", m5303f = "BoardViewModel.kt", m5304i = {0}, m5305l = {862}, m5306m = "invokeSuspend", m5307n = {"isOpen"}, m5308s = {"Z$0"})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$handleExpandClick$1 */
    public static final class C52911 extends SuspendLambda implements InterfaceC6473e {
        boolean Z$0;
        int label;

        public C52911(InterfaceC5631c<? super C52911> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return BoardViewModel.this.new C52911(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                boolean zM5325b = AbstractC5830k.m5325b(((ExpandState) ((C5946n0) BoardViewModel.this._expandState).getValue()).getExpandStatus(), ExpandStatus.Collapse.INSTANCE);
                InterfaceC5958x interfaceC5958x = BoardViewModel.this._event;
                BoardEvent.ExpandAnimate expandAnimate = new BoardEvent.ExpandAnimate(zM5325b);
                this.Z$0 = zM5325b;
                this.label = 1;
                if (interfaceC5958x.emit(expandAnimate, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52911) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$updateExpandState$1", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updateExpandState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n226#2,5:1500\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updateExpandState$1\n*L\n1418#1:1495,5\n1424#1:1500,5\n*E\n"})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$updateExpandState$1 */
    public static final class C52931 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ boolean $isOpen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52931(boolean z8, InterfaceC5631c<? super C52931> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$isOpen = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return BoardViewModel.this.new C52931(this.$isOpen, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            C5946n0 c5946n02;
            Object value2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC5959y interfaceC5959y = BoardViewModel.this._expandState;
            boolean z8 = this.$isOpen;
            do {
                c5946n0 = (C5946n0) interfaceC5959y;
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, ((ExpandState) value).copy(z8 ? ExpandStatus.Expanded.INSTANCE : ExpandStatus.Collapse.INSTANCE)));
            if (!this.$isOpen) {
                InterfaceC5959y interfaceC5959y2 = BoardViewModel.this._extraUIState;
                do {
                    c5946n02 = (C5946n0) interfaceC5959y2;
                    value2 = c5946n02.getValue();
                } while (!c5946n02.m5569i(value2, ExtraUIState.copy$default((ExtraUIState) value2, MinorToolType.Null.INSTANCE, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52931) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$updatePenSizeLevel$1", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1\n*L\n955#1:1495,5\n*E\n"})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$updatePenSizeLevel$1 */
    public static final class C52941 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ int $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52941(int i, InterfaceC5631c<? super C52941> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$level = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return BoardViewModel.this.new C52941(this.$level, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC5959y interfaceC5959y = BoardViewModel.this._penToolState;
            int i = this.$level;
            do {
                c5946n0 = (C5946n0) interfaceC5959y;
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, PenToolState.copy$default((PenToolState) value, false, false, null, i, null, 0, false, 119, null)));
            BoardViewModel.this.updateConfigAboutPen();
            BoardViewModel.this.syncGeometryStyleIfInGeometryMode();
            SPDataKt.setSpPenSizeLevel(new Integer(this.$level));
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52941) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$updatePenType$1", m5303f = "BoardViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenType$1\n*L\n944#1:1495,5\n*E\n"})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$updatePenType$1 */
    public static final class C52951 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ PenType $penType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52951(PenType penType, InterfaceC5631c<? super C52951> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$penType = penType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return BoardViewModel.this.new C52951(this.$penType, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC5959y interfaceC5959y = BoardViewModel.this._penToolState;
            PenType penType = this.$penType;
            do {
                c5946n0 = (C5946n0) interfaceC5959y;
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, PenToolState.copy$default((PenToolState) value, false, false, penType, 0, null, 0, false, 123, null)));
            BoardViewModel.this.updateConfigAboutPen();
            SPDataKt.setSpPenTypeLevel(new Integer(this.$penType.getOrdinal()));
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52951) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoardViewModel() {
        C5911f0 c5911f0M5545a = AbstractC5914h.m5545a(0, 7, null);
        this._event = c5911f0M5545a;
        this.event = new C5960z(c5911f0M5545a);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new MainToolState(z8, z9, z10, false, z11, null, 63, null));
        this._mainToolState = c5946n0M5546b;
        this.mainToolState = new C5901a0(c5946n0M5546b);
        C5946n0 c5946n0M5546b2 = AbstractC5914h.m5546b(new SelectToolState(z8, z9, z10, 0 == true ? 1 : 0, z11, 31, null));
        this._selectToolState = c5946n0M5546b2;
        this.selectToolState = new C5901a0(c5946n0M5546b2);
        Object[] objArr = 0 == true ? 1 : 0;
        C5946n0 c5946n0M5546b3 = AbstractC5914h.m5546b(new PenToolState(z8, z9, null, objArr, null, 0, false, 127, null));
        this._penToolState = c5946n0M5546b3;
        this.penToolState = new C5901a0(c5946n0M5546b3);
        int i = 1;
        C5946n0 c5946n0M5546b4 = AbstractC5914h.m5546b(new EraserToolState(null, i, 0 == true ? 1 : 0));
        this._eraserToolState = c5946n0M5546b4;
        this.eraserToolState = new C5901a0(c5946n0M5546b4);
        boolean z12 = false;
        Object[] objArr2 = 0 == true ? 1 : 0;
        C5946n0 c5946n0M5546b5 = AbstractC5914h.m5546b(new GraphToolState(z9, z12, objArr2, false, null, 31, null));
        this._graphToolState = c5946n0M5546b5;
        this.graphToolState = new C5901a0(c5946n0M5546b5);
        C5946n0 c5946n0M5546b6 = AbstractC5914h.m5546b(new BackgroundToolState(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this._backgroundToolState = c5946n0M5546b6;
        this.backgroundToolState = new C5901a0(c5946n0M5546b6);
        Object[] objArr3 = 0 == true ? 1 : 0;
        C5946n0 c5946n0M5546b7 = AbstractC5914h.m5546b(new ExtraUIState(null, null, z12, objArr3, 0.0f, 0.0f, false, 0.0f, 0.0f, 511, null));
        this._extraUIState = c5946n0M5546b7;
        this.extraUIState = new C5901a0(c5946n0M5546b7);
        Object[] objArr4 = 0 == true ? 1 : 0;
        C5946n0 c5946n0M5546b8 = AbstractC5914h.m5546b(new RecordState(objArr4, false, null, 7, null));
        this._recordState = c5946n0M5546b8;
        this.recordState = new C5901a0(c5946n0M5546b8);
        C5946n0 c5946n0M5546b9 = AbstractC5914h.m5546b(new ExpandState(0 == true ? 1 : 0, i, 0 == true ? 1 : 0));
        this._expandState = c5946n0M5546b9;
        this.expandState = new C5901a0(c5946n0M5546b9);
        C5946n0 c5946n0M5546b10 = AbstractC5914h.m5546b(Boolean.FALSE);
        this._loadFinished = c5946n0M5546b10;
        this.loadFinished = new C5901a0(c5946n0M5546b10);
        this.lastIsMicroPhoneOn = true;
    }

    public static /* synthetic */ void addBitmapList$default(BoardViewModel boardViewModel, List list, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        boardViewModel.addBitmapList(list, z8);
    }

    public static /* synthetic */ void addImageGraph$default(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum$ScaleTypeEnum ezyScaleTypeEnum$ScaleTypeEnum, boolean z8, String str2, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            ezyScaleTypeEnum$ScaleTypeEnum = EzyScaleTypeEnum$ScaleTypeEnum.MODE_ADAPTER_8;
        }
        if ((i & 8) != 0) {
            z8 = false;
        }
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 32) != 0) {
            interfaceC6471c = null;
        }
        boardViewModel.addImageGraph(bitmap, str, ezyScaleTypeEnum$ScaleTypeEnum, z8, str2, interfaceC6471c);
    }

    private final void applyGeometryStyleFromPenState() {
        PenToolState penToolState = (PenToolState) ((C5946n0) this._penToolState).getValue();
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            float fFloatValue = penToolState.getPenType().getPaintWidthList().get(penToolState.getPenSizeLevel()).floatValue();
            boardConfig.setPaintWidth(fFloatValue);
            boardConfig.setBeelinePaintWidth(fFloatValue);
            Integer spGeometryColor = SPDataKt.getSpGeometryColor();
            setGeometryColorCompat(boardConfig, ExtKt.withAlpha(spGeometryColor != null ? spGeometryColor.intValue() : penToolState.getPenColor().getColor(), penToolState.getPenType().getPaintColorAlpha()));
        }
    }

    public static /* synthetic */ void areaMoveEnd$default(BoardViewModel boardViewModel, Float f, Float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f7 = null;
        }
        boardViewModel.areaMoveEnd(f, f7);
    }

    public static /* synthetic */ void areaMoving$default(BoardViewModel boardViewModel, Float f, Float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f7 = null;
        }
        boardViewModel.areaMoving(f, f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s dropDraftCache$lambda$104(BoardViewModel boardViewModel) {
        IPageControl pageControl = boardViewModel.getPageControl();
        if (pageControl != null) {
            boardViewModel.initPageControl(pageControl);
        } else {
            C3404x.m2356a("画板初始化失败，请退出后重试", new Object[0]);
        }
        return C5443s.f8405a;
    }

    private final BoardConfig getBoardConfig() {
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl != null) {
            return iBoardControl.getBoardConfig();
        }
        return null;
    }

    private final List<ZoomLevel> getCurrentZoomLevelList() {
        BoardSketchConfig boardSketchConfig = this.boardSketchConfig;
        return (boardSketchConfig == null || !boardSketchConfig.getZoomFiveLevel()) ? DataStateKt.getZoomLevelList() : DataStateKt.getZoomLevelList5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPageControl getPageControl() {
        List<IPageControl> pages;
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl == null || (pages = iBoardControl.getPages()) == null) {
            return null;
        }
        return (IPageControl) AbstractC5805t.m5229i0(pages);
    }

    public static /* synthetic */ void getSavePath$default(BoardViewModel boardViewModel, boolean z8, boolean z9, InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, int i, Object obj) {
        if ((i & 1) != 0) {
            BoardSketchConfig boardSketchConfig = boardViewModel.boardSketchConfig;
            z8 = boardSketchConfig != null ? boardSketchConfig.getNeedCommitWithDeleteCache() : true;
        }
        if ((i & 2) != 0) {
            BoardSketchConfig boardSketchConfig2 = boardViewModel.boardSketchConfig;
            z9 = boardSketchConfig2 != null ? boardSketchConfig2.isThumbnailContent() : false;
        }
        if ((i & 4) != 0) {
            interfaceC6473e = new C52881(null);
        }
        if ((i & 8) != 0) {
            interfaceC6473e2 = new C52892(null);
        }
        boardViewModel.getSavePath(z8, z9, interfaceC6473e, interfaceC6473e2);
    }

    private final void initAreaMoveListener(IPageControl pageControl) {
        PageControlExtKt.setAreaMoveListener(pageControl, new C5314l(this, 0), new C5315m(this, 0), new C5314l(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initAreaMoveListener$lambda$43(BoardViewModel boardViewModel) {
        C5946n0 c5946n0;
        Object value;
        InterfaceC5959y interfaceC5959y = boardViewModel._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 439, null)));
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initAreaMoveListener$lambda$45(BoardViewModel boardViewModel, float f, float f7) {
        C5946n0 c5946n0;
        Object value;
        InterfaceC5959y interfaceC5959y = boardViewModel._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, null, null, false, false, f, 0.0f, false, f7, 0.0f, 367, null)));
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initAreaMoveListener$lambda$47(BoardViewModel boardViewModel) {
        C5946n0 c5946n0;
        Object value;
        InterfaceC5959y interfaceC5959y = boardViewModel._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, null, null, false, true, 0.0f, 0.0f, true, 0.0f, 0.0f, 439, null)));
        return C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initBackgroundLevel(com.zykj.blackboard.bean.BoardConfig r9) {
        /*
            r8 = this;
            java.lang.Integer r0 = com.zykj.view.utils.SPDataKt.getSpBackgroundColor()
            r1 = 0
            if (r0 == 0) goto L2e
            int r0 = r0.intValue()
            java.util.List r2 = com.zykj.view.board.board.DataStateKt.getBackgroundTypeList()
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L14:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r2.next()
            com.zykj.view.board.board.BackgroundType r4 = (com.zykj.view.board.board.BackgroundType) r4
            int r4 = r4.getBackgroundColor()
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
            java.util.List r0 = com.zykj.view.board.board.DataStateKt.getBackgroundTypeList()
            java.lang.Object r0 = r0.get(r3)
            com.zykj.view.board.board.BackgroundType r0 = (com.zykj.view.board.board.BackgroundType) r0
            kotlinx.coroutines.flow.y r2 = r8._backgroundToolState
        L3b:
            r3 = r2
            kotlinx.coroutines.flow.n0 r3 = (kotlinx.coroutines.flow.C5946n0) r3
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            com.zykj.view.board.board.BackgroundToolState r5 = (com.zykj.view.board.board.BackgroundToolState) r5
            r6 = 0
            r7 = 1
            com.zykj.view.board.board.BackgroundToolState r5 = com.zykj.view.board.board.BackgroundToolState.copy$default(r5, r1, r0, r7, r6)
            boolean r3 = r3.m5569i(r4, r5)
            if (r3 == 0) goto L3b
            int r1 = r0.getBackgroundColor()
            r9.setBackgroundColor(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig r9 = r9.getBackgroundLineConfig()
            int r1 = r0.getLineColor()
            r9.setLineColor(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig$BackgroundLineType r1 = r0.getLineType()
            r9.setLineType(r1)
            float r0 = r0.getLineSpace()
            r9.setLineSpace(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.initBackgroundLevel(com.zykj.blackboard.bean.BoardConfig):void"); // DEX body: android/错题本/smali_classes3/com/zykj/view/board/board/BoardViewModel.smali:2295
    }

    public static /* synthetic */ void initBoardControl$default(BoardViewModel boardViewModel, IBoardControl iBoardControl, boolean z8, long j7, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            j7 = 0;
        }
        boardViewModel.initBoardControl(iBoardControl, z8, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initBoardControl$lambda$5(BoardViewModel boardViewModel, IPageControl it) {
        InterfaceC6469a onInitFinished;
        AbstractC5830k.m5330g(it, "it");
        boardViewModel.initPageControl(it);
        ((C5946n0) boardViewModel._loadFinished).m5570j(Boolean.TRUE);
        BoardCallbackConfig boardCallbackConfig = boardViewModel.boardCallbackConfig;
        if (boardCallbackConfig != null && (onInitFinished = boardCallbackConfig.getOnInitFinished()) != null) {
            onInitFinished.invoke();
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initBoardControl$lambda$9$lambda$8(BoardViewModel boardViewModel, InterfaceC6471c interfaceC6471c) {
        IPageControl pageControl = boardViewModel.getPageControl();
        if (pageControl != null) {
            interfaceC6471c.invoke(pageControl);
        } else {
            C3404x.m2356a("画板加载失败，请退出后重试", new Object[0]);
        }
        return C5443s.f8405a;
    }

    private final void initEraserSizeLevel(BoardConfig boardConfig) {
        C5946n0 c5946n0;
        Object value;
        Float spEraserSize = SPDataKt.getSpEraserSize();
        int i = 0;
        if (spEraserSize != null) {
            float fFloatValue = spEraserSize.floatValue();
            Iterator<EraserType> it = DataStateKt.getEraserTypeList().iterator();
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i8 = -1;
                    break;
                } else if (it.next().getSize() == fFloatValue) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 != -1) {
                i = i8;
            }
        }
        EraserType eraserType = DataStateKt.getEraserTypeList().get(i);
        InterfaceC5959y interfaceC5959y = this._eraserToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ((EraserToolState) value).copy(eraserType)));
    }

    private final void initEventListener(IPageControl pageControl) {
        PageControlExtKt.addTempEventListener(pageControl, new C5313k(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initEventListener$lambda$49(BoardViewModel boardViewModel, CommandInfoEntity commandInfoEntity) {
        C5946n0 c5946n0;
        Object value;
        AbstractC5830k.m5330g(commandInfoEntity, "<unused var>");
        InterfaceC5959y interfaceC5959y = boardViewModel._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        return C5443s.f8405a;
    }

    private final void initGeometryColorListener(IPageControl pageControl) {
        PageControlExtKt.bindGeometryColorSelectListener(pageControl, new C5313k(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initGeometryColorListener$lambda$41(BoardViewModel boardViewModel, int i) {
        SPDataKt.setSpGeometryColor(Integer.valueOf(i));
        BoardConfig boardConfig = boardViewModel.getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setGeometryStrokeColor(i);
        }
        boardViewModel.syncGeometryStyleIfInGeometryMode();
        return C5443s.f8405a;
    }

    private final void initGraphDeleteListener(IPageControl pageControl) {
        pageControl.addGraphDeleteListener(new GraphDeleteListener() { // from class: com.zykj.view.board.board.BoardViewModel.initGraphDeleteListener.1
            @Override // com.zykj.blackboard.listener.GraphDeleteListener
            public void onGraphDelete(IGraph graph) {
                BoardCallbackConfig boardCallbackConfig;
                InterfaceC6471c onImageDelete;
                AbstractC5830k.m5330g(graph, "graph");
                if (!(graph instanceof ImageGraph) || (boardCallbackConfig = BoardViewModel.this.getBoardCallbackConfig()) == null || (onImageDelete = boardCallbackConfig.getOnImageDelete()) == null) {
                    return;
                }
                String filePath = ((ImageGraph) graph).getFilePath();
                if (filePath == null) {
                    filePath = "";
                }
                onImageDelete.invoke(filePath);
            }
        });
    }

    private final void initMicroPhoneListener(IPageControl pageControl) {
        PageControlExtKt.setMicroPhoneListener(pageControl, new C5313k(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initMicroPhoneListener$lambda$38(BoardViewModel boardViewModel, boolean z8) {
        InterfaceC5959y interfaceC5959y = boardViewModel._recordState;
        while (true) {
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            Object value = c5946n0.getValue();
            boolean z9 = z8;
            if (c5946n0.m5569i(value, RecordState.copy$default((RecordState) value, null, z9, null, 5, null))) {
                return C5443s.f8405a;
            }
            z8 = z9;
        }
    }

    private final void initMoveConfig(BoardConfig boardConfig) {
        BoardSketchConfig boardSketchConfig = this.boardSketchConfig;
        if (boardSketchConfig == null) {
            return;
        }
        if (!boardSketchConfig.getNeedTranslate()) {
            boardConfig.getMoveActionConfig().setMoveActionEnable(false);
            return;
        }
        MoveActionConfig moveActionConfig = boardConfig.getMoveActionConfig();
        moveActionConfig.setMoveActionEnable(true);
        moveActionConfig.setVerticalTranslate(true);
        moveActionConfig.setHorizontalTranslate(true);
        moveActionConfig.setMaxWidthTimes(1);
        moveActionConfig.setMaxHeightTimes(boardSketchConfig.getDefaultMoveRange());
    }

    private final void initPageControl(IPageControl pageControl) {
        AbstractC3387g.m2342e("initPageControl Start");
        initGraphDeleteListener(pageControl);
        initRecordListener(pageControl);
        initMicroPhoneListener(pageControl);
        initTextChangeListener(pageControl);
        initGeometryColorListener(pageControl);
        initAreaMoveListener(pageControl);
        initEventListener(pageControl);
        initRevokeListener(pageControl);
        reloadBackgroundToUI();
        reloadZoomAndMoveToUI();
        AbstractC3387g.m2342e("initPageControl Finished");
    }

    private final void initPenConfig(BoardConfig boardConfig) {
        C5946n0 c5946n0;
        Object value;
        PenToolState penToolState;
        PenColor penColor;
        PenColor penColor2;
        int color;
        PenType penType;
        Integer spPenSizeLevel;
        InterfaceC5959y interfaceC5959y = this._penToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            penToolState = (PenToolState) value;
            Integer spPenColor = SPDataKt.getSpPenColor();
            if (spPenColor == null || (penColor = ExtKt.toPenColor(spPenColor.intValue())) == null) {
                penColor = PenColor.ColorBlack.INSTANCE;
            }
            penColor2 = penColor;
            color = penColor2 instanceof PenColor.ColorCustom ? penColor2.getColor() : new PenColor.ColorCustom(0, 1, null).getColor();
            List<PenType> penTypeList = DataStateKt.getPenTypeList();
            Integer spPenTypeLevel = SPDataKt.getSpPenTypeLevel();
            penType = penTypeList.get(spPenTypeLevel != null ? spPenTypeLevel.intValue() : 0);
            spPenSizeLevel = SPDataKt.getSpPenSizeLevel();
        } while (!c5946n0.m5569i(value, PenToolState.copy$default(penToolState, false, false, penType, spPenSizeLevel != null ? spPenSizeLevel.intValue() : 0, penColor2, color, false, 67, null)));
    }

    private final void initRecordListener(IPageControl pageControl) {
        PageControlExtKt.setRecordListener(pageControl, new C5314l(this, 2), new C5313k(this, 5), new C5314l(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initRecordListener$lambda$32(BoardViewModel boardViewModel) {
        C5946n0 c5946n0;
        Object value;
        InterfaceC5959y interfaceC5959y = boardViewModel._recordState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, RecordState.copy$default((RecordState) value, RecordStatus.Recording.INSTANCE, false, null, 6, null)));
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initRecordListener$lambda$34(BoardViewModel boardViewModel, long j7) {
        C5946n0 c5946n0;
        Object value;
        InterfaceC5959y interfaceC5959y = boardViewModel._recordState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, RecordState.copy$default((RecordState) value, null, false, TimeFormatUtils.INSTANCE.formatTimeWithHour(j7), 3, null)));
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initRecordListener$lambda$36(BoardViewModel boardViewModel) {
        C5946n0 c5946n0;
        Object value;
        InterfaceC5959y interfaceC5959y = boardViewModel._recordState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, RecordState.copy$default((RecordState) value, RecordStatus.Continue.INSTANCE, false, null, 6, null)));
        return C5443s.f8405a;
    }

    private final void initRevokeListener(IPageControl pageControl) {
        PageControlExtKt.addRevokeListener(pageControl, new C5315m(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initRevokeListener$lambda$51(BoardViewModel boardViewModel, boolean z8, boolean z9) {
        InterfaceC5959y interfaceC5959y = boardViewModel._mainToolState;
        while (true) {
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            Object value = c5946n0.getValue();
            boolean z10 = z8;
            boolean z11 = z9;
            if (c5946n0.m5569i(value, MainToolState.copy$default((MainToolState) value, false, false, z10, z11, false, null, 51, null))) {
                boardViewModel.reloadBackgroundToUI();
                return C5443s.f8405a;
            }
            z8 = z10;
            z9 = z11;
        }
    }

    private final void initSelectConfig(BoardConfig boardConfig) {
        C5946n0 c5946n0;
        Object value;
        SelectToolState selectToolState;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        List<SelectGraphEnum> spSelectGraphEnum = SPDataKt.getSpSelectGraphEnum();
        if (spSelectGraphEnum == null) {
            spSelectGraphEnum = SelectGraphEnumKt.getAllSelectGraphEnumList();
        }
        boardConfig.setSelectIncludeGraphEnumListByDrag(spSelectGraphEnum);
        InterfaceC5959y interfaceC5959y = this._selectToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            selectToolState = (SelectToolState) value;
            Iterator<T> it = spSelectGraphEnum.iterator();
            z8 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
            while (it.hasNext()) {
                int i = WhenMappings.$EnumSwitchMapping$1[((SelectGraphEnum) it.next()).ordinal()];
                if (i == 1) {
                    z8 = true;
                } else if (i == 2) {
                    z9 = true;
                } else if (i == 3) {
                    z10 = true;
                } else if (i == 4) {
                    z11 = true;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z12 = true;
                }
            }
        } while (!c5946n0.m5569i(value, selectToolState.copy(z8, z9, z10, z11, z12)));
    }

    private final void initTextChangeListener(IPageControl pageControl) {
        PageControlExtKt.setTextSelectListener(pageControl, new C5313k(this, 6), new C5313k(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initTextChangeListener$lambda$39(BoardViewModel boardViewModel, int i) {
        SPDataKt.setSpTextColor(Integer.valueOf(i));
        BoardConfig boardConfig = boardViewModel.getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setAddTextOriginalTextColor(i);
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initTextChangeListener$lambda$40(BoardViewModel boardViewModel, float f) {
        SPDataKt.setSpTextSize(Float.valueOf(f));
        BoardConfig boardConfig = boardViewModel.getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setAddTextOriginalTextSize(f);
        }
        return C5443s.f8405a;
    }

    private final void initTextConfig(BoardConfig boardConfig) {
        boardConfig.setAddTextOriginalText("");
        Integer spTextColor = SPDataKt.getSpTextColor();
        boardConfig.setAddTextOriginalTextColor(spTextColor != null ? spTextColor.intValue() : ((PenToolState) ((C5946n0) this._penToolState).getValue()).getPenColor().getColor());
        Float spTextSize = SPDataKt.getSpTextSize();
        if (spTextSize != null) {
            boardConfig.setAddTextOriginalTextSize(spTextSize.floatValue());
        }
        boardConfig.getAddTextRectF().right = 600.0f;
        boardConfig.setTextEditView(this.textEditView);
    }

    private final void reloadBackgroundToUI() {
        C5946n0 c5946n0;
        Object value;
        BackgroundToolState backgroundToolState;
        IPageControl pageControl = getPageControl();
        if (pageControl == null) {
            return;
        }
        int backgroundColor = pageControl.getBackgroundColor();
        InterfaceC5959y interfaceC5959y = this._backgroundToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            backgroundToolState = (BackgroundToolState) value;
            for (BackgroundType backgroundType : DataStateKt.getBackgroundTypeList()) {
                if (backgroundType.getBackgroundColor() == backgroundColor) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } while (!c5946n0.m5569i(value, BackgroundToolState.copy$default(backgroundToolState, false, backgroundType, 1, null)));
    }

    private final void reloadZoomAndMoveToUI() {
        BoardConfig boardConfig;
        C5946n0 c5946n0;
        Object value;
        IPageControl pageControl = getPageControl();
        if (pageControl == null || (boardConfig = getBoardConfig()) == null) {
            return;
        }
        float zoomLevel = pageControl.getZoomLevel();
        Iterator<ZoomLevel> it = getCurrentZoomLevelList().iterator();
        int iIndexOf = 0;
        while (true) {
            if (!it.hasNext()) {
                iIndexOf = -1;
                break;
            } else if (it.next().getZoomValue() == zoomLevel) {
                break;
            } else {
                iIndexOf++;
            }
        }
        if (iIndexOf == -1) {
            iIndexOf = getCurrentZoomLevelList().indexOf(ZoomLevel.Level3.INSTANCE);
        }
        this.zoomLevelIndex = iIndexOf;
        float f = 1;
        float maxHeightTimes = f / (boardConfig.getMoveActionConfig().getMaxHeightTimes() * zoomLevel);
        float maxWidthTimes = f / (boardConfig.getMoveActionConfig().getMaxWidthTimes() * zoomLevel);
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, null, null, false, false, pageControl.getMoveVerticalProgress(), maxHeightTimes, false, pageControl.getMoveHorizontalProgress(), maxWidthTimes, 79, null)));
    }

    private final void setGeometryColorCompat(BoardConfig config, int color) {
        Method method;
        C5443s c5443s = C5443s.f8405a;
        int i = color | ViewCompat.MEASURED_STATE_MASK;
        try {
            config.setPaintColor(color);
            Result.m13956constructorimpl(c5443s);
        } catch (Throwable th) {
            Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        try {
            config.setBeelinePaintColor(color);
            Result.m13956constructorimpl(c5443s);
        } catch (Throwable th2) {
            Result.m13956constructorimpl(AbstractC5774b.m5118a(th2));
        }
        try {
            config.setGeometryStrokeColor(i);
            Result.m13956constructorimpl(c5443s);
        } catch (Throwable th3) {
            Result.m13956constructorimpl(AbstractC5774b.m5118a(th3));
        }
        for (String str : AbstractC5806u.m5287z("setGeometryPaintColor", "setGeometryColor", "setGeometryStrokeColor", "setGraphColor", "setShapeColor", "setStrokeColor")) {
            try {
                Method[] methods = config.getClass().getMethods();
                AbstractC5830k.m5329f(methods, "getMethods(...)");
                int length = methods.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i8];
                    if (AbstractC5830k.m5325b(method.getName(), str) && method.getParameterTypes().length == 1 && AbstractC5830k.m5325b(method.getParameterTypes()[0], Integer.TYPE)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                Result.m13956constructorimpl(method != null ? method.invoke(config, Integer.valueOf(i)) : null);
            } catch (Throwable th4) {
                Result.m13956constructorimpl(AbstractC5774b.m5118a(th4));
            }
        }
    }

    private final void switchPenCustomColor() {
        C5946n0 c5946n0;
        Object value;
        InterfaceC5959y interfaceC5959y = this._penToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, PenToolState.copy$default((PenToolState) value, false, false, null, 0, null, 0, !r3.isShowCustomColor(), 63, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncGeometryStyleIfInGeometryMode() {
        boolean zM5325b = AbstractC5830k.m5325b(((MainToolState) ((C5946n0) this._mainToolState).getValue()).getMainToolType(), MainToolType.Graph.INSTANCE);
        boolean zM5325b2 = AbstractC5830k.m5325b(((GraphToolState) ((C5946n0) this._graphToolState).getValue()).getGraphType(), GraphType.Null.INSTANCE);
        if (!zM5325b || zM5325b2) {
            return;
        }
        applyGeometryStyleFromPenState();
    }

    private final void updateConfigAboutEraser() {
        EraserToolState eraserToolState = (EraserToolState) ((C5946n0) this._eraserToolState).getValue();
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_ERASER_WRITING);
            boardConfig.setEraserWidth(eraserToolState.getEraserType().getSize());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfigAboutPen() {
        PenToolState penToolState = (PenToolState) ((C5946n0) this._penToolState).getValue();
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setMode(penToolState.getPenType().getMode());
            BoardConfig.setDottedLine$default(boardConfig, penToolState.getPenType().getIsDotted(), 0.0f, 0.0f, 6, null);
            float fFloatValue = penToolState.getPenType().getPaintWidthList().get(penToolState.getPenSizeLevel()).floatValue();
            boardConfig.setPaintWidth(fFloatValue);
            boardConfig.setBeelinePaintWidth(fFloatValue);
            int iWithAlpha = ExtKt.withAlpha(penToolState.getPenColor().getColor(), penToolState.getPenType().getPaintColorAlpha());
            boardConfig.setPaintColor(iWithAlpha);
            boardConfig.setBeelinePaintColor(iWithAlpha);
            if (SPDataKt.getSpTextColor() == null) {
                boardConfig.setAddTextOriginalTextColor(penToolState.getPenColor().getColor());
            }
            if (SPDataKt.getSpGeometryColor() == null) {
                setGeometryColorCompat(boardConfig, iWithAlpha);
            }
        }
    }

    private final void updateConfigAboutSelect() {
        SelectToolState selectToolState = (SelectToolState) ((C5946n0) this._selectToolState).getValue();
        ArrayList arrayList = new ArrayList();
        if (selectToolState.getPenSelected()) {
            arrayList.add(SelectGraphEnum.STROKE);
        }
        if (selectToolState.getHighlighterSelected()) {
            arrayList.add(SelectGraphEnum.STROKE_HIGHLIGHTER);
        }
        if (selectToolState.getImageSelected()) {
            arrayList.add(SelectGraphEnum.IMAGE);
        }
        if (selectToolState.getTextSelected()) {
            arrayList.add(SelectGraphEnum.TEXT);
        }
        if (selectToolState.getGeometrySelected()) {
            arrayList.add(SelectGraphEnum.GEOMETRY);
        }
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setSelectIncludeGraphEnumListByDrag(arrayList);
        }
        SPDataKt.setSpSelectGraphEnum(arrayList);
    }

    public static /* synthetic */ void updateMicroPhone$default(BoardViewModel boardViewModel, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = !((RecordState) ((C5946n0) boardViewModel._recordState).getValue()).isMicrophoneOn();
        }
        boardViewModel.updateMicroPhone(z8);
    }

    public static /* synthetic */ void updateTouchable$default(BoardViewModel boardViewModel, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = !((MainToolState) ((C5946n0) boardViewModel._mainToolState).getValue()).isTouchable();
        }
        boardViewModel.updateTouchable(z8);
    }

    public final void addBitmapList(@NotNull List<String> pathList, boolean isSelected) {
        AbstractC5830k.m5330g(pathList, "pathList");
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C52861(pathList, isSelected, null), 3);
    }

    public final void addImageGraph(@Nullable Bitmap bitmap, @Nullable String path, @NotNull EzyScaleTypeEnum$ScaleTypeEnum scaleTypeEnum, boolean isSelected, @NotNull String filename, @Nullable InterfaceC6471c imagePathCallback) {
        AbstractC5830k.m5330g(scaleTypeEnum, "scaleTypeEnum");
        AbstractC5830k.m5330g(filename, "filename");
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C52871(bitmap, filename, scaleTypeEnum, path, imagePathCallback, isSelected, null), 3);
    }

    public final void addText(@NotNull String content) {
        TextGraph textGraphAddText$default;
        C5946n0 c5946n0;
        Object value;
        AbstractC5830k.m5330g(content, "content");
        IPageControl pageControl = getPageControl();
        if (pageControl == null || (textGraphAddText$default = IPageControl.DefaultImpls.addText$default(pageControl, content, EzyPositionEnum$PositionEnum.CENTER, 0, 4, null)) == null) {
            return;
        }
        InterfaceC5959y interfaceC5959y = this._mainToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, MainToolState.copy$default((MainToolState) value, false, false, false, false, false, MainToolType.Select.INSTANCE, 31, null)));
        pageControl.newSelectGraph(AbstractC5806u.m5286y(textGraphAddText$default.getId()));
    }

    public final void areaMoveEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        IPageControl pageControl = getPageControl();
        if (pageControl != null) {
            pageControl.areaMoveEnd(horizontalProgress, verticalProgress);
        }
    }

    public final void areaMoveStart() {
        IPageControl pageControl = getPageControl();
        if (pageControl != null) {
            pageControl.areaMoveStart();
        }
    }

    public final void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        IPageControl pageControl = getPageControl();
        if (pageControl != null) {
            pageControl.areaMoving(horizontalProgress, verticalProgress);
        }
    }

    public final void cleanPage() {
        IPageControl pageControl = getPageControl();
        if (pageControl != null) {
            IPageControl.DefaultImpls.cleanPage$default(pageControl, null, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        kotlin.Result.m13956constructorimpl(kotlin.AbstractC5774b.m5118a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dismissAllPanelsAndSelection() {
        /*
            r15 = this;
            r15.dismissCustomColorPalette()
            kotlinx.coroutines.flow.y r0 = r15._extraUIState
        L5:
            r1 = r0
            kotlinx.coroutines.flow.n0 r1 = (kotlinx.coroutines.flow.C5946n0) r1
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.zykj.view.board.board.ExtraUIState r3 = (com.zykj.view.board.board.ExtraUIState) r3
            com.zykj.view.board.board.MinorToolType$Null r4 = com.zykj.view.board.board.MinorToolType.Null.INSTANCE
            r13 = 510(0x1fe, float:7.15E-43)
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.zykj.view.board.board.ExtraUIState r3 = com.zykj.view.board.board.ExtraUIState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = r1.m5569i(r2, r3)
            if (r1 == 0) goto L5
            com.zykj.blackboard.core.edit.IPageControl r0 = r15.getPageControl()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE     // Catch: java.lang.Throwable -> L34
            r0.newSelectGraph(r1)     // Catch: java.lang.Throwable -> L34
            d6.s r0 = p045d6.C5443s.f8405a     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r0 = move-exception
            goto L3b
        L36:
            r0 = 0
        L37:
            kotlin.Result.m13956constructorimpl(r0)     // Catch: java.lang.Throwable -> L34
            return
        L3b:
            kotlin.Result$Failure r0 = kotlin.AbstractC5774b.m5118a(r0)
            kotlin.Result.m13956constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.dismissAllPanelsAndSelection():void"); // DEX body: android/错题本/smali_classes3/com/zykj/view/board/board/BoardViewModel.smali:6683
    }

    public final void dismissCustomColorPalette() {
        C5946n0 c5946n0;
        Object value;
        PenToolState penToolStateCopy$default;
        InterfaceC5959y interfaceC5959y = this._penToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            penToolStateCopy$default = (PenToolState) value;
            if (penToolStateCopy$default.isShowCustomColor()) {
                penToolStateCopy$default = PenToolState.copy$default(penToolStateCopy$default, false, false, null, 0, null, 0, false, 63, null);
            }
        } while (!c5946n0.m5569i(value, penToolStateCopy$default));
    }

    public final void dismissPanelsForCanvasTouch() {
        C5946n0 c5946n0;
        Object value;
        dismissCustomColorPalette();
        if (AbstractC5830k.m5325b(((MainToolState) ((C5946n0) this._mainToolState).getValue()).getMainToolType(), MainToolType.Select.INSTANCE)) {
            return;
        }
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, MinorToolType.Null.INSTANCE, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        kotlin.Result.m13956constructorimpl(kotlin.AbstractC5774b.m5118a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dismissPanelsForSelectToolbarItemClick() {
        /*
            r15 = this;
            r15.dismissCustomColorPalette()
            kotlinx.coroutines.flow.y r0 = r15._extraUIState
        L5:
            r1 = r0
            kotlinx.coroutines.flow.n0 r1 = (kotlinx.coroutines.flow.C5946n0) r1
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.zykj.view.board.board.ExtraUIState r3 = (com.zykj.view.board.board.ExtraUIState) r3
            com.zykj.view.board.board.MinorToolType$Select r4 = com.zykj.view.board.board.MinorToolType.Select.INSTANCE
            r13 = 510(0x1fe, float:7.15E-43)
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.zykj.view.board.board.ExtraUIState r3 = com.zykj.view.board.board.ExtraUIState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = r1.m5569i(r2, r3)
            if (r1 == 0) goto L5
            com.zykj.blackboard.core.edit.IPageControl r0 = r15.getPageControl()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE     // Catch: java.lang.Throwable -> L34
            r0.newSelectGraph(r1)     // Catch: java.lang.Throwable -> L34
            d6.s r0 = p045d6.C5443s.f8405a     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r0 = move-exception
            goto L3b
        L36:
            r0 = 0
        L37:
            kotlin.Result.m13956constructorimpl(r0)     // Catch: java.lang.Throwable -> L34
            return
        L3b:
            kotlin.Result$Failure r0 = kotlin.AbstractC5774b.m5118a(r0)
            kotlin.Result.m13956constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.dismissPanelsForSelectToolbarItemClick():void"); // DEX body: android/错题本/smali_classes3/com/zykj/view/board/board/BoardViewModel.smali:7080
    }

    public final void dismissPanelsForToolbarClick() {
        C5946n0 c5946n0;
        Object value;
        C5443s c5443s;
        dismissCustomColorPalette();
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, MinorToolType.Null.INSTANCE, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        if (AbstractC5830k.m5325b(((MainToolState) ((C5946n0) this._mainToolState).getValue()).getMainToolType(), MainToolType.Select.INSTANCE)) {
            try {
                IPageControl pageControl = getPageControl();
                if (pageControl != null) {
                    pageControl.newSelectGraph(EmptyList.INSTANCE);
                    c5443s = C5443s.f8405a;
                } else {
                    c5443s = null;
                }
                Result.m13956constructorimpl(c5443s);
            } catch (Throwable th) {
                Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
        }
    }

    public final void dropDraftCache() {
        C5946n0 c5946n0;
        Object value;
        C5946n0 c5946n02;
        Object value2;
        IBoardControl iBoardControl = this.boardControl;
        if (iBoardControl == null) {
            return;
        }
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        InterfaceC5959y interfaceC5959y2 = this._recordState;
        do {
            c5946n02 = (C5946n0) interfaceC5959y2;
            value2 = c5946n02.getValue();
        } while (!c5946n02.m5569i(value2, RecordState.copy$default((RecordState) value2, RecordStatus.Init.INSTANCE, false, null, 6, null)));
        IBoardControl.DefaultImpls.deletePage$default(iBoardControl, 0, null, 2, null);
        IBoardControl.DefaultImpls.createPage$default(iBoardControl, false, new C5314l(this, 4), 1, null);
    }

    @NotNull
    public final InterfaceC5944m0 getBackgroundToolState() {
        return this.backgroundToolState;
    }

    @Nullable
    public final BoardCallbackConfig getBoardCallbackConfig() {
        return this.boardCallbackConfig;
    }

    @Nullable
    public final CustomColorView getCustomColorView() {
        return this.customColorView;
    }

    @NotNull
    public final InterfaceC5944m0 getEraserToolState() {
        return this.eraserToolState;
    }

    @NotNull
    public final InterfaceC5905c0 getEvent() {
        return this.event;
    }

    @NotNull
    public final InterfaceC5944m0 getExpandState() {
        return this.expandState;
    }

    @NotNull
    public final InterfaceC5944m0 getExtraUIState() {
        return this.extraUIState;
    }

    @NotNull
    public final InterfaceC5944m0 getGraphToolState() {
        return this.graphToolState;
    }

    @Nullable
    public final ImageCropView getImageCropView() {
        return this.imageCropView;
    }

    @NotNull
    public final InterfaceC5944m0 getLoadFinished() {
        return this.loadFinished;
    }

    @NotNull
    public final InterfaceC5944m0 getMainToolState() {
        return this.mainToolState;
    }

    @NotNull
    public final List<String> getPathListByImageGraph() {
        List<String> noRecordImagePathList;
        if (!((Boolean) this.loadFinished.getValue()).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        IPageControl pageControl = getPageControl();
        return (pageControl == null || (noRecordImagePathList = pageControl.getNoRecordImagePathList()) == null) ? EmptyList.INSTANCE : noRecordImagePathList;
    }

    @NotNull
    public final InterfaceC5944m0 getPenToolState() {
        return this.penToolState;
    }

    @NotNull
    public final InterfaceC5944m0 getRecordState() {
        return this.recordState;
    }

    @NotNull
    public final List<String> getRecordingImagePathList() {
        List<String> pageImagePathList;
        if (!((Boolean) this.loadFinished.getValue()).booleanValue()) {
            return EmptyList.INSTANCE;
        }
        IPageControl pageControl = getPageControl();
        return (pageControl == null || (pageImagePathList = pageControl.getPageImagePathList()) == null) ? EmptyList.INSTANCE : pageImagePathList;
    }

    public final void getSavePath(boolean needClear, boolean isContentThumbnail, @NotNull InterfaceC6473e error, @NotNull InterfaceC6473e callback) {
        AbstractC5830k.m5330g(error, "error");
        AbstractC5830k.m5330g(callback, "callback");
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C52903(needClear, isContentThumbnail, callback, error, null), 3);
    }

    @NotNull
    public final InterfaceC5944m0 getSelectToolState() {
        return this.selectToolState;
    }

    @Nullable
    public final TextEditView getTextEditView() {
        return this.textEditView;
    }

    public final void handleExpandClick() {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C52911(null), 3);
    }

    public final void initBoardControl(@NotNull IBoardControl boardControl, boolean haveCache, long duration) {
        C5946n0 c5946n0;
        Object value;
        C5946n0 c5946n02;
        Object value2;
        AbstractC5830k.m5330g(boardControl, "boardControl");
        AbstractC3387g.m2342e("initBoardControl Start");
        this.boardControl = boardControl;
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, null, null, haveCache, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        if (duration > 0) {
            InterfaceC5959y interfaceC5959y2 = this._recordState;
            do {
                c5946n02 = (C5946n0) interfaceC5959y2;
                value2 = c5946n02.getValue();
            } while (!c5946n02.m5569i(value2, RecordState.copy$default((RecordState) value2, RecordStatus.Continue.INSTANCE, false, TimeFormatUtils.INSTANCE.formatTimeWithHour(duration), 2, null)));
        }
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setSelectIconWidth(48.0f);
            BoardSketchConfig boardSketchConfig = this.boardSketchConfig;
            if (boardSketchConfig != null) {
                boardConfig.setMaxImageSize(boardSketchConfig.getMaxImageCount());
            }
            updateTouchable(!AbstractC5830k.m5325b(SPDataKt.getSpTouchable(), Boolean.FALSE));
            initTextConfig(boardConfig);
            initBackgroundLevel(boardConfig);
            boardConfig.setImageCropView(this.imageCropView);
            initMoveConfig(boardConfig);
            initEraserSizeLevel(boardConfig);
            initPenConfig(boardConfig);
            boardConfig.setSelectCustomColorView(this.customColorView);
            initSelectConfig(boardConfig);
            updateModeType(MainToolType.Pen.INSTANCE);
        }
        final C5313k c5313k = new C5313k(this, 4);
        IPageControl pageControl = getPageControl();
        if (pageControl != null) {
            AbstractC3387g.m2342e("pageControl is not Null");
            c5313k.invoke(pageControl);
        } else {
            AbstractC3387g.m2342e("pageControl is Null");
            IBoardControl.DefaultImpls.createPage$default(boardControl, false, new InterfaceC6469a() { // from class: com.zykj.view.board.board.n
                @Override // p152r6.InterfaceC6469a
                public final Object invoke() {
                    return BoardViewModel.initBoardControl$lambda$9$lambda$8(this.f8247a, c5313k);
                }
            }, 1, null);
        }
        AbstractC3387g.m2342e("initBoardControl Finished");
    }

    public final void initCallbackConfig(@NotNull BoardCallbackConfig boardCallbackConfig) {
        AbstractC5830k.m5330g(boardCallbackConfig, "boardCallbackConfig");
        this.boardCallbackConfig = boardCallbackConfig;
    }

    public final void initSketchConfig(@NotNull BoardSketchConfig boardSketchConfig) {
        AbstractC5830k.m5330g(boardSketchConfig, "boardSketchConfig");
        this.boardSketchConfig = boardSketchConfig;
        this.zoomLevelIndex = getCurrentZoomLevelList().indexOf(ZoomLevel.Level3.INSTANCE);
    }

    public final void initZoomPointF(float right, float bottom) {
        float f = 2;
        float f7 = right / f;
        float f8 = bottom / f;
        PointF pointF = this.zoomPointF;
        BoardSketchConfig boardSketchConfig = this.boardSketchConfig;
        ZoomPointSolution zoomPointSolution = boardSketchConfig != null ? boardSketchConfig.getZoomPointSolution() : null;
        switch (zoomPointSolution == null ? -1 : WhenMappings.$EnumSwitchMapping$0[zoomPointSolution.ordinal()]) {
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
                pointF.set(0.0f, f8);
                break;
            case 6:
                pointF.set(f7, 0.0f);
                break;
            case 7:
                pointF.set(right, f8);
                break;
            case 8:
                pointF.set(f7, bottom);
                break;
            case 9:
                pointF.set(f7, f8);
                break;
            default:
                pointF.set(f7, 0.0f);
                break;
        }
    }

    public final boolean isImageOutOfCount() {
        IPageControl pageControl = getPageControl();
        int imageGraphCount = pageControl != null ? pageControl.getImageGraphCount() : 0;
        BoardSketchConfig boardSketchConfig = this.boardSketchConfig;
        return imageGraphCount >= (boardSketchConfig != null ? boardSketchConfig.getMaxImageCount() : 3);
    }

    public final void resetRevoke() {
        IPageControl pageControl = getPageControl();
        if (pageControl != null) {
            pageControl.clearHistoryListWithoutCurrent();
        }
    }

    public final void setCustomColorView(@Nullable CustomColorView customColorView) {
        this.customColorView = customColorView;
    }

    public final void setImageCropView(@Nullable ImageCropView imageCropView) {
        this.imageCropView = imageCropView;
    }

    public final void setTextEditView(@Nullable TextEditView textEditView) {
        this.textEditView = textEditView;
    }

    public final void startRevoke(boolean isRecover) {
        if (isRecover) {
            IPageControl pageControl = getPageControl();
            if (pageControl != null) {
                pageControl.recover();
                return;
            }
            return;
        }
        IPageControl pageControl2 = getPageControl();
        if (pageControl2 != null) {
            pageControl2.withdraw();
        }
    }

    public final void switchBackgroundTool() {
        C5946n0 c5946n0;
        Object value;
        ExtraUIState extraUIState;
        MinorToolType minorToolType;
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            extraUIState = (ExtraUIState) value;
            MinorToolType minorToolType2 = extraUIState.getMinorToolType();
            minorToolType = MinorToolType.Background.INSTANCE;
            if (AbstractC5830k.m5325b(minorToolType2, minorToolType)) {
                minorToolType = MinorToolType.Null.INSTANCE;
            }
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default(extraUIState, minorToolType, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    public final void switchEraserTool() {
        C5946n0 c5946n0;
        Object value;
        ExtraUIState extraUIState;
        MinorToolType minorToolType;
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            extraUIState = (ExtraUIState) value;
            MinorToolType minorToolType2 = extraUIState.getMinorToolType();
            minorToolType = MinorToolType.Eraser.INSTANCE;
            if (AbstractC5830k.m5325b(minorToolType2, minorToolType)) {
                minorToolType = MinorToolType.Null.INSTANCE;
            }
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default(extraUIState, minorToolType, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    public final void switchGraphTool() {
        C5946n0 c5946n0;
        Object value;
        ExtraUIState extraUIState;
        MinorToolType minorToolType;
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            extraUIState = (ExtraUIState) value;
            MinorToolType minorToolType2 = extraUIState.getMinorToolType();
            minorToolType = MinorToolType.Graph.INSTANCE;
            if (AbstractC5830k.m5325b(minorToolType2, minorToolType)) {
                minorToolType = MinorToolType.Null.INSTANCE;
            }
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default(extraUIState, minorToolType, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    public final void switchPenTool() {
        C5946n0 c5946n0;
        Object value;
        ExtraUIState extraUIState;
        MinorToolType minorToolType;
        C5946n0 c5946n02;
        Object value2;
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            extraUIState = (ExtraUIState) value;
            MinorToolType minorToolType2 = extraUIState.getMinorToolType();
            minorToolType = MinorToolType.Pen.INSTANCE;
            if (AbstractC5830k.m5325b(minorToolType2, minorToolType)) {
                minorToolType = MinorToolType.Null.INSTANCE;
            }
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default(extraUIState, minorToolType, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        InterfaceC5959y interfaceC5959y2 = this._penToolState;
        do {
            c5946n02 = (C5946n0) interfaceC5959y2;
            value2 = c5946n02.getValue();
        } while (!c5946n02.m5569i(value2, PenToolState.copy$default((PenToolState) value2, false, false, null, 0, null, 0, false, 63, null)));
    }

    public final void switchRecordState() {
        IPageControl pageControl = getPageControl();
        if (pageControl == null) {
            return;
        }
        if (!pageControl.isRecording()) {
            pageControl.startRecord(this.lastIsMicroPhoneOn);
        } else {
            this.lastIsMicroPhoneOn = pageControl.isMicroTurnOn();
            pageControl.stopRecord();
        }
    }

    public final void switchSelectTool() {
        C5946n0 c5946n0;
        Object value;
        ExtraUIState extraUIState;
        MinorToolType minorToolType;
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            extraUIState = (ExtraUIState) value;
            MinorToolType minorToolType2 = extraUIState.getMinorToolType();
            minorToolType = MinorToolType.Select.INSTANCE;
            if (AbstractC5830k.m5325b(minorToolType2, minorToolType)) {
                minorToolType = MinorToolType.Null.INSTANCE;
            }
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default(extraUIState, minorToolType, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    public final void updateBackgroundLevel(int level) {
        C5946n0 c5946n0;
        Object value;
        BackgroundType backgroundType = DataStateKt.getBackgroundTypeList().get(level);
        InterfaceC5959y interfaceC5959y = this._backgroundToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, BackgroundToolState.copy$default((BackgroundToolState) value, false, backgroundType, 1, null)));
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig == null) {
            return;
        }
        boardConfig.setBackgroundColor(backgroundType.getBackgroundColor());
        BackgroundLineConfig backgroundLineConfig = boardConfig.getBackgroundLineConfig();
        backgroundLineConfig.setLineColor(backgroundType.getLineColor());
        backgroundLineConfig.setLineType(backgroundType.getLineType());
        backgroundLineConfig.setLineSpace(backgroundType.getLineSpace());
        IPageControl pageControl = getPageControl();
        if (pageControl == null) {
            return;
        }
        if (backgroundType.getBackgroundColor() != pageControl.getBackgroundColor()) {
            pageControl.setBackgroundColorWithLineConfig(backgroundType.getBackgroundColor(), boardConfig.getBackgroundLineConfig());
        }
        SPDataKt.setSpBackgroundColor(Integer.valueOf(backgroundType.getBackgroundColor()));
    }

    public final void updateEraserSizeLevel(int level) {
        C5946n0 c5946n0;
        Object value;
        EraserType eraserType = DataStateKt.getEraserTypeList().get(level);
        InterfaceC5959y interfaceC5959y = this._eraserToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ((EraserToolState) value).copy(eraserType)));
        updateConfigAboutEraser();
        SPDataKt.setSpEraserSize(Float.valueOf(eraserType.getSize()));
    }

    public final void updateExpandState(boolean isOpen) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C52931(isOpen, null), 3);
    }

    public final void updateGraphType(@NotNull GraphType graphType) {
        GraphType graphType2;
        AbstractC5830k.m5330g(graphType, "graphType");
        updateModeType(MainToolType.Graph.INSTANCE);
        InterfaceC5959y interfaceC5959y = this._graphToolState;
        while (true) {
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            Object value = c5946n0.getValue();
            graphType2 = graphType;
            if (c5946n0.m5569i(value, GraphToolState.copy$default((GraphToolState) value, false, false, false, false, graphType2, 15, null))) {
                break;
            } else {
                graphType = graphType2;
            }
        }
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_GEOMETRY);
            boardConfig.setGeometryActionEnum(graphType2.getGeometryActionEnum());
        }
        applyGeometryStyleFromPenState();
    }

    public final void updateMicroPhone(boolean isMicroPhoneOn) {
        boolean z8;
        IPageControl pageControl = getPageControl();
        if (pageControl == null) {
            return;
        }
        InterfaceC5959y interfaceC5959y = this._recordState;
        while (true) {
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            Object value = c5946n0.getValue();
            z8 = isMicroPhoneOn;
            if (c5946n0.m5569i(value, RecordState.copy$default((RecordState) value, null, z8, null, 5, null))) {
                break;
            } else {
                isMicroPhoneOn = z8;
            }
        }
        String str = "toast nothing";
        if (z8) {
            pageControl.turnOnMicro();
            int i = C5280R.string.turn_on_micro_phone;
            C3404x c3404x = C3404x.f2187b;
            String strM2307h = AbstractC3382c.m2307h(i, null);
            if (strM2307h == null) {
                str = "toast null";
            } else if (strM2307h.length() != 0) {
                str = strM2307h;
            }
            AbstractC3383c0.m2328g(new RunnableC3059a(str));
            return;
        }
        pageControl.turnOffMicro();
        int i8 = C5280R.string.turn_off_micro_phone;
        C3404x c3404x2 = C3404x.f2187b;
        String strM2307h2 = AbstractC3382c.m2307h(i8, null);
        if (strM2307h2 == null) {
            str = "toast null";
        } else if (strM2307h2.length() != 0) {
            str = strM2307h2;
        }
        AbstractC3383c0.m2328g(new RunnableC3059a(str));
    }

    public final void updateMinorToolType(@NotNull MinorToolType minorToolType) {
        MinorToolType minorToolType2 = minorToolType;
        AbstractC5830k.m5330g(minorToolType2, "minorToolType");
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        while (true) {
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            Object value = c5946n0.getValue();
            if (c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, minorToolType2, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null))) {
                return;
            } else {
                minorToolType2 = minorToolType;
            }
        }
    }

    public final void updateModeType(@NotNull MainToolType mainToolType) {
        C5946n0 c5946n0;
        Object value;
        C5946n0 c5946n02;
        Object value2;
        AbstractC5830k.m5330g(mainToolType, "mainToolType");
        InterfaceC5959y interfaceC5959y = this._mainToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, MainToolState.copy$default((MainToolState) value, false, false, false, false, false, mainToolType, 31, null)));
        if (!mainToolType.equals(MainToolType.Graph.INSTANCE)) {
            InterfaceC5959y interfaceC5959y2 = this._graphToolState;
            do {
                c5946n02 = (C5946n0) interfaceC5959y2;
                value2 = c5946n02.getValue();
            } while (!c5946n02.m5569i(value2, GraphToolState.copy$default((GraphToolState) value2, false, false, false, false, GraphType.Null.INSTANCE, 15, null)));
        }
        if (mainToolType.equals(MainToolType.Select.INSTANCE)) {
            BoardConfig boardConfig = getBoardConfig();
            if (boardConfig != null) {
                boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_NEW_SELECT);
                return;
            }
            return;
        }
        if (mainToolType.equals(MainToolType.Pen.INSTANCE)) {
            updateConfigAboutPen();
        } else if (mainToolType.equals(MainToolType.Eraser.INSTANCE)) {
            updateConfigAboutEraser();
        } else if (!mainToolType.equals(MainToolType.Graph.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void updatePenColorLevel(int level) {
        C5946n0 c5946n0;
        Object value;
        PenColor penColor;
        C5946n0 c5946n02;
        Object value2;
        PenColor colorCustom = DataStateKt.getPenColorList().get(level);
        if (colorCustom instanceof PenColor.ColorCustom) {
            colorCustom = new PenColor.ColorCustom(((PenToolState) ((C5946n0) this._penToolState).getValue()).getPenCustomColor());
        }
        InterfaceC5959y interfaceC5959y = this._penToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            penColor = colorCustom;
        } while (!c5946n0.m5569i(value, PenToolState.copy$default((PenToolState) value, false, false, null, 0, penColor, 0, false, 111, null)));
        boolean z8 = colorCustom instanceof PenColor.ColorCustom;
        if (z8) {
            switchPenCustomColor();
        } else {
            InterfaceC5959y interfaceC5959y2 = this._penToolState;
            do {
                c5946n02 = (C5946n0) interfaceC5959y2;
                value2 = c5946n02.getValue();
            } while (!c5946n02.m5569i(value2, PenToolState.copy$default((PenToolState) value2, false, false, null, 0, null, 0, false, 63, null)));
        }
        if (z8 && colorCustom.getColor() == 0) {
            return;
        }
        updateConfigAboutPen();
        syncGeometryStyleIfInGeometryMode();
        SPDataKt.setSpPenColor(Integer.valueOf(penColor.getColor()));
    }

    public final void updatePenCustomColor(int color) {
        InterfaceC5959y interfaceC5959y = this._penToolState;
        while (true) {
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            Object value = c5946n0.getValue();
            PenToolState penToolState = (PenToolState) value;
            int i = color;
            if (c5946n0.m5569i(value, PenToolState.copy$default(penToolState, false, false, null, 0, penToolState.getPenColor() instanceof PenColor.ColorCustom ? new PenColor.ColorCustom(color) : penToolState.getPenColor(), i, false, 79, null))) {
                updateConfigAboutPen();
                syncGeometryStyleIfInGeometryMode();
                SPDataKt.setSpPenColor(Integer.valueOf(i));
                return;
            }
            color = i;
        }
    }

    public final void updatePenSizeLevel(int level) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C52941(level, null), 3);
    }

    public final void updatePenType(@NotNull PenType penType) {
        AbstractC5830k.m5330g(penType, "penType");
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C52951(penType, null), 3);
    }

    public final void updateSelectTypeByEnum(@NotNull SelectGraphEnum selectGraphEnum) {
        C5946n0 c5946n0;
        Object value;
        AbstractC5830k.m5330g(selectGraphEnum, "selectGraphEnum");
        SelectToolState selectToolState = (SelectToolState) ((C5946n0) this._selectToolState).getValue();
        boolean penSelected = selectToolState.getPenSelected();
        boolean highlighterSelected = selectToolState.getHighlighterSelected();
        boolean imageSelected = selectToolState.getImageSelected();
        boolean textSelected = selectToolState.getTextSelected();
        boolean geometrySelected = selectToolState.getGeometrySelected();
        int i = WhenMappings.$EnumSwitchMapping$1[selectGraphEnum.ordinal()];
        if (i == 1) {
            penSelected = !penSelected;
        } else if (i == 2) {
            highlighterSelected = !highlighterSelected;
        } else if (i == 3) {
            imageSelected = !imageSelected;
        } else if (i == 4) {
            textSelected = !textSelected;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            geometrySelected = !geometrySelected;
        }
        boolean z8 = geometrySelected;
        boolean z9 = penSelected;
        boolean z10 = highlighterSelected;
        boolean z11 = imageSelected;
        boolean z12 = textSelected;
        if (!z9 && !z10 && !z11 && !z12 && !z8) {
            C3404x.m2356a("最少需要选中一个素材类型", new Object[0]);
            return;
        }
        InterfaceC5959y interfaceC5959y = this._selectToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ((SelectToolState) value).copy(z9, z10, z11, z12, z8)));
        updateConfigAboutSelect();
    }

    public final void updateTouchable(boolean isTouchable) {
        boolean z8;
        InterfaceC5959y interfaceC5959y = this._mainToolState;
        while (true) {
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            Object value = c5946n0.getValue();
            z8 = isTouchable;
            if (c5946n0.m5569i(value, MainToolState.copy$default((MainToolState) value, false, false, false, false, z8, null, 47, null))) {
                break;
            } else {
                isTouchable = z8;
            }
        }
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            boardConfig.setFingerDraw(z8);
        }
        SPDataKt.setSpTouchable(Boolean.valueOf(z8));
    }

    public final void updateUIByViewConfig(@NotNull BoardViewConfig boardViewConfig) {
        C5946n0 c5946n0;
        Object value;
        C5946n0 c5946n02;
        Object value2;
        C5946n0 c5946n03;
        Object value3;
        C5946n0 c5946n04;
        Object value4;
        C5946n0 c5946n05;
        Object value5;
        AbstractC5830k.m5330g(boardViewConfig, "boardViewConfig");
        InterfaceC5959y interfaceC5959y = this._mainToolState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, MainToolState.copy$default((MainToolState) value, boardViewConfig.getNeedRevoke(), boardViewConfig.getNeedZoom(), false, false, false, null, 60, null)));
        InterfaceC5959y interfaceC5959y2 = this._penToolState;
        do {
            c5946n02 = (C5946n0) interfaceC5959y2;
            value2 = c5946n02.getValue();
        } while (!c5946n02.m5569i(value2, PenToolState.copy$default((PenToolState) value2, boardViewConfig.getNeedDot(), boardViewConfig.getNeedPenHighlighter(), null, 0, null, 0, false, 124, null)));
        InterfaceC5959y interfaceC5959y3 = this._graphToolState;
        do {
            c5946n03 = (C5946n0) interfaceC5959y3;
            value3 = c5946n03.getValue();
        } while (!c5946n03.m5569i(value3, GraphToolState.copy$default((GraphToolState) value3, boardViewConfig.getNeedGallery(), boardViewConfig.getNeedCamera(), boardViewConfig.getNeedText(), boardViewConfig.getNeedGraph(), null, 16, null)));
        InterfaceC5959y interfaceC5959y4 = this._backgroundToolState;
        do {
            c5946n04 = (C5946n0) interfaceC5959y4;
            value4 = c5946n04.getValue();
        } while (!c5946n04.m5569i(value4, BackgroundToolState.copy$default((BackgroundToolState) value4, boardViewConfig.getNeedBackgroundLine(), null, 2, null)));
        InterfaceC5959y interfaceC5959y5 = this._extraUIState;
        do {
            c5946n05 = (C5946n0) interfaceC5959y5;
            value5 = c5946n05.getValue();
        } while (!c5946n05.m5569i(value5, ExtraUIState.copy$default((ExtraUIState) value5, null, boardViewConfig.getConfirmButtonType(), false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 509, null)));
    }

    public final void updateZoomLevel(boolean isZoomUp) {
        int i;
        C5946n0 c5946n0;
        Object value;
        int i8 = this.zoomLevelIndex;
        if (isZoomUp && i8 < getCurrentZoomLevelList().size() - 1) {
            this.zoomLevelIndex++;
        } else if (!isZoomUp && (i = this.zoomLevelIndex) > 0) {
            this.zoomLevelIndex = i - 1;
        }
        if (i8 == this.zoomLevelIndex) {
            return;
        }
        float zoomValue = getCurrentZoomLevelList().get(this.zoomLevelIndex).getZoomValue();
        IPageControl pageControl = getPageControl();
        if (pageControl == null) {
            return;
        }
        PointF pointF = this.zoomPointF;
        pageControl.zoomLevel(pointF.x, pointF.y, zoomValue);
        float moveVerticalProgress = pageControl.getMoveVerticalProgress();
        float moveHorizontalProgress = pageControl.getMoveHorizontalProgress();
        float f = moveVerticalProgress > 1.0f ? 1.0f : moveVerticalProgress < 0.0f ? 0.0f : moveVerticalProgress;
        float f7 = moveHorizontalProgress <= 1.0f ? moveHorizontalProgress < 0.0f ? 0.0f : zoomValue <= 1.0f ? 0.5f : moveHorizontalProgress : 1.0f;
        if (f != moveVerticalProgress || f7 != moveHorizontalProgress) {
            pageControl.areaMoveStart();
            pageControl.areaMoveEnd(Float.valueOf(f7), Float.valueOf(f));
        }
        if (getBoardConfig() == null) {
            return;
        }
        float f8 = 1;
        float maxHeightTimes = f8 / (r3.getMoveActionConfig().getMaxHeightTimes() * zoomValue);
        float maxWidthTimes = f8 / (r3.getMoveActionConfig().getMaxWidthTimes() * zoomValue);
        InterfaceC5959y interfaceC5959y = this._extraUIState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, ExtraUIState.copy$default((ExtraUIState) value, null, null, false, false, 0.0f, maxHeightTimes, false, 0.0f, maxWidthTimes, 223, null)));
    }
}
