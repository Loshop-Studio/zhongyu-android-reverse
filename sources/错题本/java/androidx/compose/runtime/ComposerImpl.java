package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import p045d6.C5443s;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0086\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0002Ô\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004ª\u0003«\u0003BI\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001c\u0010\u0018J!\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0017¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010#\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010$\u001a\u00020\u0014H\u0016¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010&\u001a\u00020\u0014H\u0000¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010(\u001a\u00020\u0014H\u0000¢\u0006\u0004\b'\u0010\u0018J\u000f\u0010,\u001a\u00020)H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010\u0018J\u000f\u0010.\u001a\u00020\u0014H\u0016¢\u0006\u0004\b.\u0010\u0018J#\u00102\u001a\u00020\u0014\"\u0004\b\u0000\u0010/2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0014H\u0016¢\u0006\u0004\b4\u0010\u0018J\u000f\u00105\u001a\u00020\u0014H\u0016¢\u0006\u0004\b5\u0010\u0018J!\u00106\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\u0014H\u0016¢\u0006\u0004\b7\u0010\u0018J\u000f\u00108\u001a\u00020\u0014H\u0016¢\u0006\u0004\b8\u0010\u0018J\u000f\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010\u0018J\r\u0010:\u001a\u00020\u0014¢\u0006\u0004\b:\u0010\u0018J\r\u0010;\u001a\u00020\u0014¢\u0006\u0004\b;\u0010\u0018J\u0017\u0010=\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u0010\u0016JB\u0010C\u001a\u00020\u0014\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010/2\u0006\u0010?\u001a\u00028\u00002\u001d\u0010B\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140@¢\u0006\u0002\bAH\u0016¢\u0006\u0004\bC\u0010DJ#\u0010G\u001a\u00020\u001d2\b\u0010E\u001a\u0004\u0018\u00010\u001d2\b\u0010F\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\bG\u0010HJ\u0011\u0010I\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\bI\u0010JJ\u0011\u0010K\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\bK\u0010JJ\u0019\u0010L\u001a\u00020)2\b\u0010?\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020)2\b\u0010?\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\bN\u0010MJ\u0017\u0010L\u001a\u00020)2\u0006\u0010?\u001a\u00020OH\u0017¢\u0006\u0004\bL\u0010PJ\u0017\u0010L\u001a\u00020)2\u0006\u0010?\u001a\u00020QH\u0017¢\u0006\u0004\bL\u0010RJ\u0017\u0010L\u001a\u00020)2\u0006\u0010?\u001a\u00020SH\u0017¢\u0006\u0004\bL\u0010TJ\u0017\u0010L\u001a\u00020)2\u0006\u0010?\u001a\u00020)H\u0017¢\u0006\u0004\bL\u0010UJ\u0017\u0010L\u001a\u00020)2\u0006\u0010?\u001a\u00020VH\u0017¢\u0006\u0004\bL\u0010WJ\u0017\u0010L\u001a\u00020)2\u0006\u0010?\u001a\u00020XH\u0017¢\u0006\u0004\bL\u0010YJ\u0017\u0010L\u001a\u00020)2\u0006\u0010?\u001a\u00020ZH\u0017¢\u0006\u0004\bL\u0010[J\u0017\u0010L\u001a\u00020)2\u0006\u0010?\u001a\u00020\u0012H\u0017¢\u0006\u0004\bL\u0010\\J,\u0010^\u001a\u00028\u0000\"\u0004\b\u0000\u0010/2\u0006\u0010]\u001a\u00020)2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0087\b¢\u0006\u0004\b^\u0010_J\u0019\u0010`\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\b`\u0010aJ\u0019\u0010b\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\bb\u0010aJ\u001d\u0010d\u001a\u00020\u00142\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001400H\u0016¢\u0006\u0004\bd\u00103J\u001b\u0010f\u001a\u00020\u00142\n\u0010?\u001a\u0006\u0012\u0002\b\u00030eH\u0017¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0014H\u0017¢\u0006\u0004\bh\u0010\u0018J#\u0010k\u001a\u00020\u00142\u0012\u0010j\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030e0iH\u0017¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0014H\u0017¢\u0006\u0004\bm\u0010\u0018J#\u0010o\u001a\u00028\u0000\"\u0004\b\u0000\u0010/2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000nH\u0017¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0004H\u0016¢\u0006\u0004\bq\u0010rJ!\u0010x\u001a\u00020)2\u0006\u0010t\u001a\u00020s2\b\u0010u\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\bv\u0010wJ\u000f\u0010{\u001a\u00020\u0012H\u0001¢\u0006\u0004\by\u0010zJ\u000f\u0010|\u001a\u00020\u0014H\u0017¢\u0006\u0004\b|\u0010\u0018J \u0010\u007f\u001a\u00020)2\u0006\u0010}\u001a\u00020)2\u0006\u0010~\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b\u0081\u0001\u0010\u0018J\u001a\u0010\u0082\u0001\u001a\u00020\u00142\u0006\u0010L\u001a\u00020)H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0084\u0001\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0015\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0017¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J*\u0010\u008b\u0001\u001a\u00020\u00142\u000b\u0010?\u001a\u0007\u0012\u0002\b\u00030\u0089\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J3\u0010\u0091\u0001\u001a\u00020\u00142\u001f\u0010\u0090\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00010\u008e\u00010\u008d\u0001H\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001c\u0010\u0094\u0001\u001a\u00020\u00142\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0017¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J$\u0010\u0096\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0017¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b\u0098\u0001\u0010\u0018J\u0011\u0010\u0099\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0099\u0001\u0010\u0018JL\u0010¢\u0001\u001a\u00020\u00142\u0014\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u001d0\u009a\u00012\u0013\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001400¢\u0006\u0003\b\u009c\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001J\u001f\u0010¤\u0001\u001a\u00020\u00142\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001400H\u0000¢\u0006\u0005\b£\u0001\u00103J7\u0010§\u0001\u001a\u00020)2\u0014\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u001d0\u009a\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J)\u0010ª\u0001\u001a\u00020\u00142\u0014\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u001d0\u009a\u0001ø\u0001\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0011\u0010¬\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\b«\u0001\u0010\u0018J\u0011\u0010®\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u00ad\u0001\u0010zJ\u0013\u0010¯\u0001\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b¯\u0001\u0010JJ\u001b\u0010°\u0001\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b°\u0001\u0010aJ\u001b\u0010²\u0001\u001a\u00020\u00142\u0007\u0010t\u001a\u00030±\u0001H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0011\u0010´\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b´\u0001\u0010\u0018J\u0011\u0010µ\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bµ\u0001\u0010\u0018J\u0011\u0010¶\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¶\u0001\u0010\u0018J\u0019\u0010·\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0005\b·\u0001\u0010\u0016J#\u0010·\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0005\b·\u0001\u0010 J\u0011\u0010¸\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¸\u0001\u0010\u0018J\u0011\u0010¹\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¹\u0001\u0010\u0018J\u001b\u0010º\u0001\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0005\bº\u0001\u0010aJ\u0015\u0010¼\u0001\u001a\u0005\u0018\u00010»\u0001H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0013\u0010¿\u0001\u001a\u00030¾\u0001H\u0002¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001c\u0010¿\u0001\u001a\u00030¾\u00012\u0007\u0010Á\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\b¿\u0001\u0010Â\u0001J'\u0010Å\u0001\u001a\u00030¾\u00012\b\u0010Ã\u0001\u001a\u00030¾\u00012\b\u0010Ä\u0001\u001a\u00030¾\u0001H\u0002¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001c\u0010È\u0001\u001a\u00020\u00142\b\u0010Ç\u0001\u001a\u00030¾\u0001H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0011\u0010Ê\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bÊ\u0001\u0010\u0018J\u0011\u0010Ë\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bË\u0001\u0010\u0018J\u0011\u0010Ì\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bÌ\u0001\u0010\u0018J&\u0010Ï\u0001\u001a\u00020\u00142\u0007\u0010Í\u0001\u001a\u00020)2\t\u0010Î\u0001\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J=\u0010Ö\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010Ó\u0001\u001a\u00030Ò\u00012\t\u0010Î\u0001\u001a\u0004\u0018\u00010\u001dH\u0002ø\u0001\u0000¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J'\u0010Ù\u0001\u001a\u00020\u00142\u0007\u0010Í\u0001\u001a\u00020)2\n\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u0001H\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J$\u0010Ý\u0001\u001a\u00020\u00142\u0007\u0010Û\u0001\u001a\u00020\u00122\u0007\u0010Ü\u0001\u001a\u00020)H\u0002¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u001b\u0010ß\u0001\u001a\u00020\u00142\u0007\u0010Í\u0001\u001a\u00020)H\u0002¢\u0006\u0006\bß\u0001\u0010\u0083\u0001J\u0011\u0010à\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bà\u0001\u0010\u0018J\u001b\u0010â\u0001\u001a\u00020\u00122\u0007\u0010á\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bâ\u0001\u0010ã\u0001J$\u0010å\u0001\u001a\u00020\u00142\u0007\u0010Á\u0001\u001a\u00020\u00122\u0007\u0010ä\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bå\u0001\u0010æ\u0001J6\u0010ê\u0001\u001a\u00020\u00122\u0007\u0010ç\u0001\u001a\u00020\u00122\u0007\u0010Á\u0001\u001a\u00020\u00122\u0007\u0010è\u0001\u001a\u00020\u00122\u0007\u0010é\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bê\u0001\u0010ë\u0001J\u001b\u0010ì\u0001\u001a\u00020\u00122\u0007\u0010Á\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bì\u0001\u0010ã\u0001J\u001b\u0010í\u0001\u001a\u00020\u00122\u0007\u0010Á\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bí\u0001\u0010ã\u0001J$\u0010ï\u0001\u001a\u00020\u00142\u0007\u0010Á\u0001\u001a\u00020\u00122\u0007\u0010î\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bï\u0001\u0010æ\u0001J\u0011\u0010ð\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bð\u0001\u0010\u0018J-\u0010ô\u0001\u001a\u00020\u00142\u0007\u0010ñ\u0001\u001a\u00020\u00122\u0007\u0010ò\u0001\u001a\u00020\u00122\u0007\u0010ó\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bô\u0001\u0010õ\u0001J$\u0010÷\u0001\u001a\u00020\u00142\u0007\u0010Á\u0001\u001a\u00020\u00122\u0007\u0010ö\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\b÷\u0001\u0010æ\u0001J-\u0010ù\u0001\u001a\u00020\u00122\u0007\u0010Á\u0001\u001a\u00020\u00122\u0007\u0010è\u0001\u001a\u00020\u00122\u0007\u0010ø\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bù\u0001\u0010ú\u0001J \u0010ü\u0001\u001a\u00020\u0012*\u00030û\u00012\u0007\u0010Á\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bü\u0001\u0010ý\u0001J\u0011\u0010þ\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bþ\u0001\u0010\u0018J\u0011\u0010ÿ\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\bÿ\u0001\u0010\u0018JB\u0010\u0082\u0002\u001a\u00020\u00142\u0010\u0010\u009d\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0089\u00012\b\u0010\u0080\u0002\u001a\u00030¾\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001d2\u0007\u0010\u0081\u0002\u001a\u00020)H\u0002¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J3\u0010\u0084\u0002\u001a\u00020\u00142\u001f\u0010\u0090\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00010\u008e\u00010\u008d\u0001H\u0002¢\u0006\u0006\b\u0084\u0002\u0010\u0092\u0001J2\u0010\u0087\u0002\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0085\u00022\b\u0010\u0086\u0002\u001a\u00030û\u00012\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0082\b¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002Jo\u0010\u008c\u0002\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0085\u00022\u000b\b\u0002\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0002\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u000e2\u000b\b\u0002\u0010á\u0001\u001a\u0004\u0018\u00010\u00122\u001f\b\u0002\u0010\u008b\u0002\u001a\u0018\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020s\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u008e\u00010\u008d\u00012\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0002¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002JB\u0010\u0090\u0002\u001a\u00020\u00142\u0014\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u001d0\u009a\u00012\u0015\u0010\u009d\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u000100¢\u0006\u0003\b\u009c\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\"\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u001d*\u00030û\u00012\u0007\u0010á\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J\u0011\u0010\u0093\u0002\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0093\u0002\u0010\u0018J\u0011\u0010\u0094\u0002\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0094\u0002\u0010\u0018J\u001c\u0010\u0096\u0002\u001a\u00020\u00142\b\u0010\u0095\u0002\u001a\u00030»\u0001H\u0002¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J\u0011\u0010\u0098\u0002\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0098\u0002\u0010\u0018J\u001a\u0010\u009a\u0002\u001a\u00020\u00142\u0007\u0010\u0099\u0002\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u009a\u0002\u0010\u0016J\u0011\u0010\u009b\u0002\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009b\u0002\u0010\u0018J\u0011\u0010\u009c\u0002\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009c\u0002\u0010\u0018J\u0011\u0010\u009d\u0002\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009d\u0002\u0010\u0018J:\u0010 \u0002\u001a\u00020\u00142\u0007\u0010\u009e\u0002\u001a\u00020\u00122\u0007\u0010\u009f\u0002\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\t\u0010Î\u0001\u001a\u0004\u0018\u00010\u001dH\u0082\b¢\u0006\u0006\b \u0002\u0010¡\u0002J%\u0010£\u0002\u001a\u00020\u00142\u0007\u0010¢\u0002\u001a\u00020\u00122\u0007\u0010\u009f\u0002\u001a\u00020\u0012H\u0082\b¢\u0006\u0006\b£\u0002\u0010æ\u0001J:\u0010¤\u0002\u001a\u00020\u00142\u0007\u0010\u009e\u0002\u001a\u00020\u00122\u0007\u0010\u009f\u0002\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\t\u0010Î\u0001\u001a\u0004\u0018\u00010\u001dH\u0082\b¢\u0006\u0006\b¤\u0002\u0010¡\u0002J%\u0010¥\u0002\u001a\u00020\u00142\u0007\u0010\u009e\u0002\u001a\u00020\u00122\u0007\u0010\u009f\u0002\u001a\u00020\u0012H\u0082\b¢\u0006\u0006\b¥\u0002\u0010æ\u0001R!\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010©\u0002R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010ª\u0002R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010«\u0002R\u0017\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010¬\u0002R\u0017\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010¬\u0002R\u001d\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u000f\u0010\u00ad\u0002\u001a\u0006\b®\u0002\u0010¯\u0002R'\u0010±\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010×\u00010°\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\u001c\u0010³\u0002\u001a\u0005\u0018\u00010×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010´\u0002R\u0019\u0010µ\u0002\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u0019\u0010·\u0002\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010¶\u0002R\u0019\u0010\u009f\u0002\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010¶\u0002R\u0018\u0010¹\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u001c\u0010¼\u0002\u001a\u0005\u0018\u00010»\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u001c\u0010¿\u0002\u001a\u0005\u0018\u00010¾\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u0017\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b,\u0010Á\u0002R\u0019\u0010Â\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010Á\u0002R\u0019\u0010Ã\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0002\u0010Á\u0002R\u001f\u0010\u008b\u0002\u001a\n\u0012\u0005\u0012\u00030Å\u00020Ä\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010Æ\u0002R\u0018\u0010Ç\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0002\u0010º\u0002R\u001a\u0010È\u0002\u001a\u00030¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010É\u0002R#\u0010Ë\u0002\u001a\f\u0012\u0005\u0012\u00030¾\u0001\u0018\u00010Ê\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0002\u0010Ì\u0002R\u0019\u0010Í\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0002\u0010Á\u0002R\u0018\u0010Î\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0002\u0010º\u0002R\u0019\u0010Ï\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010Á\u0002R\u0019\u0010Ð\u0002\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0002\u0010¶\u0002R\u0019\u0010Ñ\u0002\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0002\u0010¶\u0002R\u0019\u0010Ò\u0002\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0002\u0010¶\u0002R\u0019\u0010Ó\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0002\u0010Á\u0002R\u0018\u0010Õ\u0002\u001a\u00030Ô\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0002\u0010Ö\u0002R$\u0010×\u0002\u001a\t\u0012\u0004\u0012\u00020s0°\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b×\u0002\u0010²\u0002R)\u0010Ù\u0002\u001a\u00020)2\u0007\u0010Ø\u0002\u001a\u00020)8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bÙ\u0002\u0010Á\u0002\u001a\u0005\bÚ\u0002\u0010+R)\u0010Û\u0002\u001a\u00020)2\u0007\u0010Ø\u0002\u001a\u00020)8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bÛ\u0002\u0010Á\u0002\u001a\u0005\bÜ\u0002\u0010+R*\u0010\u0086\u0002\u001a\u00030û\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0086\u0002\u0010Ý\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002\"\u0006\bà\u0002\u0010á\u0002R)\u0010â\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bâ\u0002\u0010ª\u0002\u001a\u0006\bã\u0002\u0010ä\u0002\"\u0006\bå\u0002\u0010æ\u0002R\u001a\u0010è\u0002\u001a\u00030ç\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0002\u0010é\u0002R\u0019\u0010ê\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0002\u0010Á\u0002R\u001c\u0010ë\u0002\u001a\u0005\u0018\u00010¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0002\u0010É\u0002R+\u0010ì\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bì\u0002\u0010¬\u0002\u001a\u0006\bí\u0002\u0010î\u0002\"\u0006\bï\u0002\u0010ð\u0002R\u0018\u0010ò\u0002\u001a\u00030ñ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0002\u0010ó\u0002R\u001a\u0010ô\u0002\u001a\u00030»\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0002\u0010õ\u0002R\u001a\u0010÷\u0002\u001a\u00030ö\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0002\u0010ø\u0002R\u0019\u0010ù\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0002\u0010Á\u0002R\u001c\u0010ú\u0002\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0002\u0010û\u0002R0\u0010Ü\u0001\u001a\u00020)2\u0007\u0010Ø\u0002\u001a\u00020)8\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\bÜ\u0001\u0010Á\u0002\u0012\u0005\bý\u0002\u0010\u0018\u001a\u0005\bü\u0002\u0010+R0\u0010þ\u0002\u001a\u00020\u00122\u0007\u0010Ø\u0002\u001a\u00020\u00128\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\bþ\u0002\u0010¶\u0002\u0012\u0005\b\u0080\u0003\u0010\u0018\u001a\u0005\bÿ\u0002\u0010zR\u001c\u0010\u0082\u0003\u001a\u0005\u0018\u00010\u0081\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0003\u0010\u0083\u0003R\u0016\u0010\u0085\u0003\u001a\u00020)8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0003\u0010+R\u0016\u0010\u0087\u0003\u001a\u00020)8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0003\u0010+R\u0018\u0010\u008b\u0003\u001a\u00030\u0088\u00038WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0003\u0010\u008a\u0003R\u001d\u0010\u008e\u0003\u001a\u00020)8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u008d\u0003\u0010\u0018\u001a\u0005\b\u008c\u0003\u0010+R\u001d\u0010\u0091\u0003\u001a\u00020)8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0090\u0003\u0010\u0018\u001a\u0005\b\u008f\u0003\u0010+R\u0016\u0010\u0093\u0003\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0003\u0010zR\u0018\u0010\u0096\u0003\u001a\u00030\u0081\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0003\u0010\u0095\u0003R\u0018\u0010\u009a\u0003\u001a\u00030\u0097\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0003\u0010\u0099\u0003R\u0016\u0010\u009c\u0003\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0003\u0010zR\u0019\u0010\u009f\u0003\u001a\u0004\u0018\u00010s8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0003\u0010\u009e\u0003R\u0013\u0010¡\u0003\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b \u0003\u0010+R\u001a\u0010¤\u0003\u001a\u0005\u0018\u00010±\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0003\u0010£\u0003R\u0018\u0010¦\u0003\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0003\u0010JR\u001e\u0010©\u0003\u001a\u0004\u0018\u00010\u001d*\u00030û\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0003\u0010¨\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¬\u0003"}, m5110d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/SlotTable;", "slotTable", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "lateChanges", "Landroidx/compose/runtime/ControlledComposition;", "composition", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V", "", "key", "Ld6/s;", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "startDefaults", "endDefaults", "", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "changesApplied$runtime_release", "changesApplied", "collectParameterInformation", "dispose$runtime_release", "dispose", "deactivate$runtime_release", "deactivate", "", "forceRecomposeScopes$runtime_release", "()Z", "forceRecomposeScopes", "startNode", "startReusableNode", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "factory", "createNode", "(Lr6/a;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "startReuseFromRoot", "endReuseFromRoot", RequestParameters.MARKER, "endToMarker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;Lr6/e;)V", "left", "right", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "nextSlot", "()Ljava/lang/Object;", "nextSlotForCache", "changed", "(Ljava/lang/Object;)Z", "changedInstance", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(Z)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "(I)Z", "invalid", "cache", "(ZLr6/a;)Ljava/lang/Object;", "updateValue", "(Ljava/lang/Object;)V", "updateCachedValue", "effect", "recordSideEffect", "Landroidx/compose/runtime/ProvidedValue;", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "endProvider", "", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "parentKey$runtime_release", "()I", "parentKey", "skipCurrentGroup", "parametersChanged", "flags", "shouldExecute", "(ZI)Z", "skipToGroupEnd", "deactivateToEndGroup", "(Z)V", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "(Ljava/util/List;)V", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "disableSourceInformation", "Landroidx/compose/runtime/collection/ScopeMap;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "composeContent--ZbOJvo$runtime_release", "(Landroidx/collection/MutableScatterMap;Lr6/e;Landroidx/compose/runtime/ShouldPauseCallback;)V", "composeContent", "prepareCompose$runtime_release", "prepareCompose", "recompose-aFTiNEg$runtime_release", "(Landroidx/collection/MutableScatterMap;Landroidx/compose/runtime/ShouldPauseCallback;)Z", "recompose", "updateComposerInvalidations-RY85e9Y", "(Landroidx/collection/MutableScatterMap;)V", "updateComposerInvalidations", "verifyConsistent$runtime_release", "verifyConsistent", "stacksSize$runtime_release", "stacksSize", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "startRoot", "endRoot", "abortRoot", "startGroup", "endGroup", "skipGroup", "updateSlot", "Landroidx/compose/runtime/Anchor;", "rememberObserverAnchor", "()Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "currentCompositionLocalScope", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "group", "(I)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentScope", "currentProviders", "updateProviderMapGroup", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "providers", "recordProviderUpdate", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "ensureWriter", "createFreshInsertTable", "forceFreshInsertTable", "isNode", "data", "startReaderGroup", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/GroupKind;", "kind", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "start", "Landroidx/compose/runtime/Pending;", "newPending", "enterGroup", "(ZLandroidx/compose/runtime/Pending;)V", "expectedNodeCount", "inserting", "exitGroup", "(IZ)V", "end", "recomposeToGroupEnd", "index", "insertedGroupVirtualIndex", "(I)I", "newCount", "updateNodeCountOverrides", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "nodeIndexOf", "(IIII)I", "rGroupIndexOf", "updatedNodeCount", "count", "updateNodeCount", "clearUpdatedNodeCounts", "oldGroup", "newGroup", "commonRoot", "recordUpsAndDowns", "(III)V", "nearestCommonRoot", "doRecordDownsFor", "recomposeKey", "compoundKeyOf", "(III)I", "Landroidx/compose/runtime/SlotReader;", "groupCompoundKeyPart", "(Landroidx/compose/runtime/SlotReader;I)I", "skipReaderToGroupEnd", "addRecomposeScope", "locals", "force", "invokeMovableContentLambda", "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/lang/Object;Z)V", "insertMovableContentGuarded", "R", "reader", "withReader", "(Landroidx/compose/runtime/SlotReader;Lr6/a;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "invalidations", "recomposeMovableContent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lr6/a;)Ljava/lang/Object;", "doCompose-aFTiNEg", "(Landroidx/collection/MutableScatterMap;Lr6/e;)V", "doCompose", "nodeAt", "(Landroidx/compose/runtime/SlotReader;I)Ljava/lang/Object;", "validateNodeExpected", "validateNodeNotExpected", "anchor", "recordInsert", "(Landroidx/compose/runtime/Anchor;)V", "recordDelete", "groupBeingRemoved", "reportFreeMovableContent", "reportAllMovableContent", "finalizeCompose", "cleanUpCompose", "groupKey", "rGroupIndex", "updateCompoundKeyWhenWeEnterGroup", "(IILjava/lang/Object;Ljava/lang/Object;)V", "keyHash", "updateCompoundKeyWhenWeEnterGroupKeyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "Ljava/util/Set;", "Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Ljava/util/ArrayList;", "pending", "Landroidx/compose/runtime/Pending;", "nodeIndex", "I", "groupNodeCount", "Landroidx/compose/runtime/IntStack;", "parentStateStack", "Landroidx/compose/runtime/IntStack;", "", "nodeCountOverrides", "[I", "Landroidx/collection/MutableIntIntMap;", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "Z", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/Invalidation;", "Ljava/util/List;", "entersStack", "parentProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/collection/MutableIntObjectMap;", "providerUpdates", "Landroidx/collection/MutableIntObjectMap;", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "sourceMarkersEnabled", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "derivedStateObserver", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "invalidateStack", "<set-?>", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime_release", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/SlotWriter;", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "deferredChanges", "getDeferredChanges$runtime_release", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime_release", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/changelist/FixupList;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "pausable", "shouldPauseCallback", "Landroidx/compose/runtime/ShouldPauseCallback;", "getInserting", "getInserting$annotations", "compoundKeyHash", "getCompoundKeyHash", "getCompoundKeyHash$annotations", "Landroidx/compose/runtime/tooling/CompositionData;", "_compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Lh6/h;", "getApplyCoroutineContext", "()Lh6/h;", "applyCoroutineContext", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getCurrentMarker", "currentMarker", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "recomposeScopeIdentity", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "node", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 5 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 9 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 10 IntIntMap.kt\nandroidx/collection/IntIntMap\n+ 11 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 12 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 15 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 16 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 17 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 18 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4891:1\n4134#1,10:4900\n4144#1:4911\n4137#1,8:4912\n4134#1,10:4947\n4144#1:4958\n4137#1,8:4959\n4152#1,10:4969\n4162#1:4980\n4155#1,8:4981\n4152#1,10:4989\n4162#1:5000\n4155#1,8:5001\n4134#1,10:5013\n4144#1:5024\n4137#1,8:5025\n4152#1,10:5033\n4162#1:5044\n4155#1,8:5045\n3537#1,8:5081\n3546#1,3:5104\n4143#1:5207\n4144#1:5209\n4143#1:5210\n4144#1:5212\n4143#1:5213\n4144#1:5215\n4143#1:5216\n4144#1:5218\n4161#1:5220\n4162#1:5222\n4161#1:5223\n4162#1:5225\n4161#1:5226\n4162#1:5228\n4161#1:5229\n4162#1:5231\n1#2:4892\n158#3,7:4893\n158#3,7:5071\n158#3,3:5078\n162#3,3:5107\n158#3,3:5188\n162#3,3:5199\n27#4:4910\n27#4:4957\n23#4:4979\n23#4:4999\n27#4:5010\n27#4:5011\n27#4:5012\n27#4:5023\n23#4:5043\n27#4:5208\n27#4:5211\n27#4:5214\n27#4:5217\n27#4:5219\n23#4:5221\n23#4:5224\n23#4:5227\n23#4:5230\n23#4:5232\n45#5,5:4920\n45#5,3:5165\n49#5:5177\n4643#6,5:4925\n4643#6,5:4930\n4665#6:4941\n4643#6,5:4942\n4643#6,5:5053\n4643#6,5:5058\n4643#6,5:5120\n4643#6,5:5125\n4643#6,5:5130\n4643#6,5:5160\n4643#6,5:5178\n4643#6,5:5183\n4643#6,5:5202\n33#7,5:4935\n80#8:4940\n4574#9:4967\n4577#9:4968\n430#10:5009\n173#11,4:5063\n173#11,4:5089\n183#11,8:5093\n178#11,3:5101\n178#11,3:5111\n173#11,8:5191\n33#12,4:5067\n38#12:5110\n33#12,6:5114\n81#12,3:5236\n33#12,6:5239\n84#12:5245\n357#13,4:5135\n329#13,6:5139\n339#13,3:5146\n342#13,9:5150\n361#13:5159\n1399#14:5145\n1270#14:5149\n393#15,6:5168\n399#15,2:5175\n44#16:5174\n53#17:5233\n53#17:5234\n53#17:5235\n1855#18,2:5246\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1508#1:4900,10\n1508#1:4911\n1508#1:4912,8\n2473#1:4947,10\n2473#1:4958\n2473#1:4959,8\n2616#1:4969,10\n2616#1:4980\n2616#1:4981,8\n2624#1:4989,10\n2624#1:5000\n2624#1:5001,8\n3156#1:5013,10\n3156#1:5024\n3156#1:5025,8\n3160#1:5033,10\n3160#1:5044\n3160#1:5045,8\n3500#1:5081,8\n3500#1:5104,3\n4136#1:5207\n4136#1:5209\n4137#1:5210\n4137#1:5212\n4138#1:5213\n4138#1:5215\n4139#1:5216\n4139#1:5218\n4154#1:5220\n4154#1:5222\n4155#1:5223\n4155#1:5225\n4156#1:5226\n4156#1:5228\n4157#1:5229\n4157#1:5231\n1446#1:4893,7\n3443#1:5071,7\n3499#1:5078,3\n3499#1:5107,3\n3926#1:5188,3\n3926#1:5199,3\n1508#1:4910\n2473#1:4957\n2616#1:4979\n2624#1:4999\n3081#1:5010\n3087#1:5011\n3092#1:5012\n3156#1:5023\n3160#1:5043\n4136#1:5208\n4137#1:5211\n4138#1:5214\n4139#1:5217\n4143#1:5219\n4154#1:5221\n4155#1:5224\n4156#1:5227\n4157#1:5230\n4161#1:5232\n1755#1:4920,5\n3673#1:5165,3\n3673#1:5177\n1826#1:4925,5\n1837#1:4930,5\n2445#1:4941\n2445#1:4942,5\n3204#1:5053,5\n3223#1:5058,5\n3613#1:5120,5\n3623#1:5125,5\n3640#1:5130,5\n3672#1:5160,5\n3729#1:5178,5\n3736#1:5183,5\n3938#1:5202,5\n1882#1:4935,5\n2266#1:4940\n2479#1:4967\n2504#1:4968\n2985#1:5009\n3420#1:5063,4\n3505#1:5089,4\n3506#1:5093,8\n3505#1:5101,3\n3420#1:5111,3\n3928#1:5191,8\n3422#1:5067,4\n3422#1:5110\n3564#1:5114,6\n3777#1:5236,3\n3777#1:5239,6\n3777#1:5245\n3658#1:5135,4\n3658#1:5139,6\n3658#1:5146,3\n3658#1:5150,9\n3658#1:5159\n3658#1:5145\n3658#1:5149\n3691#1:5168,6\n3691#1:5175,2\n3691#1:5174\n4166#1:5233\n4168#1:5234\n4170#1:5235\n3857#1:5246,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    public static final int $stable = 8;

    @Nullable
    private CompositionData _compositionData;

    @NotNull
    private final Set<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final ComposerChangeListWriter changeListWriter;

    @NotNull
    private ChangeList changes;
    private int childrenComposing;

    @NotNull
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;

    @Nullable
    private ChangeList deferredChanges;

    @NotNull
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;

    @NotNull
    private Anchor insertAnchor;

    @NotNull
    private FixupList insertFixups;

    @NotNull
    private SlotTable insertTable;
    private boolean inserting;

    @NotNull
    private final ArrayList invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;

    @NotNull
    private ChangeList lateChanges;

    @Nullable
    private int[] nodeCountOverrides;

    @Nullable
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;

    @NotNull
    private final CompositionContext parentContext;
    private boolean pausable;

    @Nullable
    private Pending pending;

    @Nullable
    private PersistentCompositionLocalMap providerCache;

    @Nullable
    private MutableIntObjectMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;

    @NotNull
    private SlotReader reader;
    private boolean reusing;

    @Nullable
    private ShouldPauseCallback shouldPauseCallback;

    @NotNull
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;

    @NotNull
    private SlotWriter writer;
    private boolean writerHasAProvider;

    @NotNull
    private final ArrayList pendingStack = Stack.m10094constructorimpl$default(null, 1, null);

    @NotNull
    private final IntStack parentStateStack = new IntStack();

    @NotNull
    private final List<Invalidation> invalidations = new ArrayList();

    @NotNull
    private final IntStack entersStack = new IntStack();

    @NotNull
    private PersistentCompositionLocalMap parentProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

    @NotNull
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "Ld6/s;", "onRemembered", "()V", "onAbandoned", "onForgotten", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class CompositionContextHolder implements ReusableRememberObserver {
        public static final int $stable = 8;

        @NotNull
        private final CompositionContextImpl ref;

        public CompositionContextHolder(@NotNull CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        @NotNull
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010&\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0002\b\"H\u0010¢\u0006\u0004\b$\u0010%J8\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0)2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0002\b\"H\u0010¢\u0006\u0004\b*\u0010+J3\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0)2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0)H\u0010¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b1\u0010\u0018J\u0017\u00104\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b3\u0010\u001fJ\u000f\u00108\u001a\u000205H\u0010¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u000205¢\u0006\u0004\b9\u0010:J\u001d\u0010@\u001a\u00020\u000b2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0010¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020\u000bH\u0010¢\u0006\u0004\bA\u0010\rJ\u000f\u0010D\u001a\u00020\u000bH\u0010¢\u0006\u0004\bC\u0010\rJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020EH\u0010¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020EH\u0010¢\u0006\u0004\bJ\u0010HJ\u0019\u0010O\u001a\u0004\u0018\u00010L2\u0006\u0010F\u001a\u00020EH\u0010¢\u0006\u0004\bM\u0010NJ+\u0010U\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020E2\u0006\u0010P\u001a\u00020L2\n\u0010R\u001a\u0006\u0012\u0002\b\u00030QH\u0010¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\bV\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010\u0006\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b^\u0010]R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010_\u001a\u0004\b`\u0010aR0\u0010b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010?R\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020g0;8\u0006¢\u0006\f\n\u0004\bh\u0010c\u001a\u0004\bi\u0010eR+\u0010n\u001a\u0002052\u0006\u0010j\u001a\u0002058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\b8\u00107\"\u0004\bm\u0010:R\u0014\u0010p\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bo\u0010]R\u0014\u0010t\u001a\u00020q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001a\u0010w\u001a\u00020q8PX\u0090\u0004¢\u0006\f\u0012\u0004\bv\u0010\r\u001a\u0004\bu\u0010sR\u0014\u0010\u0016\u001a\u00020x8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006{"}, m5110d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "", "compoundHashKey", "", "collectingParameterInformation", "collectingSourceInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "<init>", "(Landroidx/compose/runtime/ComposerImpl;IZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "Ld6/s;", "dispose", "()V", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime_release", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime_release", "unregisterComposer", "Landroidx/compose/runtime/ControlledComposition;", "composition", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "reportPausedScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lr6/e;)V", "composeInitial", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "composeInitialPaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lr6/e;)Landroidx/collection/ScatterSet;", "composeInitialPaused", "invalidScopes", "recomposePaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "recomposePaused", "invalidate$runtime_release", "invalidate", "invalidateScope$runtime_release", "invalidateScope", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope", "updateCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "startComposing$runtime_release", "startComposing", "doneComposing$runtime_release", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", TypedValues.Custom.S_REFERENCE, "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "data", "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "I", "getCompoundHashKey$runtime_release", "()I", "Z", "getCollectingParameterInformation$runtime_release", "()Z", "getCollectingSourceInformation$runtime_release", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "<set-?>", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "setCompositionLocalScope", "compositionLocalScope", "getCollectingCallByInformation$runtime_release", "collectingCallByInformation", "Lh6/h;", "getEffectCoroutineContext", "()Lh6/h;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "getRecomposeCoroutineContext$runtime_release$annotations", "recomposeCoroutineContext", "Landroidx/compose/runtime/Composition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/Composition;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4891:1\n1855#2,2:4892\n85#3:4894\n113#3,2:4895\n1#4:4897\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n4005#1:4892,2\n4074#1:4894\n4074#1:4895,2\n*E\n"})
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;

        @NotNull
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState compositionLocalScope = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
        private final int compoundHashKey;

        @Nullable
        private Set<Set<CompositionData>> inspectionTables;

        @Nullable
        private final CompositionObserverHolder observerHolder;

        public CompositionContextImpl(int i, boolean z8, boolean z9, @Nullable CompositionObserverHolder compositionObserverHolder) {
            this.compoundHashKey = i;
            this.collectingParameterInformation = z8;
            this.collectingSourceInformation = z9;
            this.observerHolder = compositionObserverHolder;
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull InterfaceC6473e content) {
            ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        @NotNull
        public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull InterfaceC6473e content) {
            return ComposerImpl.this.parentContext.composeInitialPaused$runtime_release(composition, shouldPause, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(reference);
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator<Set<CompositionData>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime_release() {
            return ComposerImpl.this.parentContext.getCollectingCallByInformation$runtime_release();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingParameterInformation$runtime_release, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingSourceInformation$runtime_release, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @NotNull
        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public Composition getComposition$runtime_release() {
            return ComposerImpl.this.getComposition();
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCompoundHashKey$runtime_release, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public InterfaceC5636h getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Nullable
        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @Nullable
        /* renamed from: getObserverHolder$runtime_release, reason: from getter */
        public CompositionObserverHolder getObserverHolder() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public InterfaceC5636h getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data, @NotNull Applier<?> applier) {
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(reference, data, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @Nullable
        public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull ScatterSet<RecomposeScopeImpl> invalidScopes) {
            return ComposerImpl.this.parentContext.recomposePaused$runtime_release(composition, shouldPause, invalidScopes);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(@NotNull Composer composer) {
            AbstractC5830k.m5328e(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportPausedScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
            ComposerImpl.this.parentContext.reportPausedScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime_release(composition);
        }

        public final void setInspectionTables(@Nullable Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(@NotNull Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    AbstractC5830k.m5328e(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).slotTable);
                }
            }
            AbstractC5835p.m5352a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        public final void updateCompositionLocalScope(@NotNull PersistentCompositionLocalMap scope) {
            setCompositionLocalScope(scope);
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> set, @NotNull ChangeList changeList, @NotNull ChangeList changeList2, @NotNull ControlledComposition controlledComposition) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.composition = controlledComposition;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation() || compositionContext.getCollectingCallByInformation$runtime_release();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                ComposerImpl composerImpl = this.this$0;
                composerImpl.childrenComposing--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                this.this$0.childrenComposing++;
            }
        };
        this.invalidateStack = Stack.m10094constructorimpl$default(null, 1, null);
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
        } catch (Throwable th) {
            slotReaderOpenReader2.close();
            throw th;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        Stack.m10092clearimpl(this.pendingStack);
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.writer.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addRecomposeScope() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            androidx.compose.runtime.RecomposeScopeImpl r0 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r2 = r4.getComposition()
            kotlin.jvm.internal.AbstractC5830k.m5328e(r2, r1)
            androidx.compose.runtime.CompositionImpl r2 = (androidx.compose.runtime.CompositionImpl) r2
            r0.<init>(r2)
            java.util.ArrayList r1 = r4.invalidateStack
            androidx.compose.runtime.Stack.m10104pushimpl(r1, r0)
            r4.updateValue(r0)
            int r1 = r4.compositionToken
            r0.start(r1)
            return
        L24:
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r4.invalidations
            androidx.compose.runtime.SlotReader r2 = r4.reader
            int r2 = r2.getParent()
            androidx.compose.runtime.Invalidation r0 = androidx.compose.runtime.ComposerKt.access$removeLocation(r0, r2)
            androidx.compose.runtime.SlotReader r2 = r4.reader
            java.lang.Object r2 = r2.next()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r3 = r3.getEmpty()
            boolean r3 = kotlin.jvm.internal.AbstractC5830k.m5325b(r2, r3)
            if (r3 == 0) goto L54
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r3 = r4.getComposition()
            kotlin.jvm.internal.AbstractC5830k.m5328e(r3, r1)
            androidx.compose.runtime.CompositionImpl r3 = (androidx.compose.runtime.CompositionImpl) r3
            r2.<init>(r3)
            r4.updateValue(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r2, r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L5b:
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L6d
            boolean r0 = r2.getForcedRecompose()
            if (r0 == 0) goto L68
            r2.setForcedRecompose(r3)
        L68:
            if (r0 == 0) goto L6b
            goto L6d
        L6b:
            r0 = r3
            goto L6e
        L6d:
            r0 = r1
        L6e:
            r2.setRequiresRecompose(r0)
            java.util.ArrayList r0 = r4.invalidateStack
            androidx.compose.runtime.Stack.m10104pushimpl(r0, r2)
            int r0 = r4.compositionToken
            r2.start(r0)
            boolean r0 = r2.getPaused()
            if (r0 == 0) goto L8c
            r2.setPaused(r3)
            r2.setResuming(r1)
            androidx.compose.runtime.changelist.ComposerChangeListWriter r0 = r4.changeListWriter
            r0.startResumingScope(r2)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.addRecomposeScope():void");
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        Stack.m10092clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        int iRotateLeft;
        int i = 3;
        int iRotateLeft2 = 0;
        int i8 = 0;
        while (group >= 0) {
            if (group == recomposeGroup) {
                iRotateLeft = Integer.rotateLeft(recomposeKey, i8);
            } else {
                int iGroupCompoundKeyPart = groupCompoundKeyPart(this.reader, group);
                if (iGroupCompoundKeyPart == 126665345) {
                    iRotateLeft = Integer.rotateLeft(iGroupCompoundKeyPart, i8);
                } else {
                    iRotateLeft2 = (iRotateLeft2 ^ Integer.rotateLeft(iGroupCompoundKeyPart, i)) ^ Integer.rotateLeft(this.reader.hasObjectKey(group) ? 0 : rGroupIndexOf(group), i8);
                    i = (i + 6) % 32;
                    i8 = (i8 + 6) % 32;
                    group = this.reader.parent(group);
                }
            }
            return iRotateLeft ^ iRotateLeft2;
        }
        return iRotateLeft2;
    }

    private final void createFreshInsertTable() {
        if (!this.writer.getClosed()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        forceFreshInsertTable();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    /* renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m10039doComposeaFTiNEg(MutableScatterMap<Object, Object> invalidationsRequested, InterfaceC6473e content) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            this.providerUpdates = null;
            m10043updateComposerInvalidationsRY85e9Y(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                startRoot();
                Object objNextSlot = nextSlot();
                if (objNextSlot != content && content != null) {
                    updateValue(content);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    mutableVectorDerivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (content != null) {
                        startGroup(200, ComposerKt.getInvocation());
                        Utils_jvmKt.invokeComposable(this, content);
                        endGroup();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objNextSlot == null || objNextSlot.equals(Composer.INSTANCE.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        startGroup(200, ComposerKt.getInvocation());
                        AbstractC5835p.m5354c(2, objNextSlot);
                        Utils_jvmKt.invokeComposable(this, (InterfaceC6473e) objNextSlot);
                        endGroup();
                    }
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    endRoot();
                    this.isComposing = false;
                    this.invalidations.clear();
                    createFreshInsertTable();
                    trace.endSection(objBeginSection);
                } catch (Throwable th) {
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.isComposing = false;
                this.invalidations.clear();
                abortRoot();
                createFreshInsertTable();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th3;
        }
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, group));
        }
    }

    private final void end(boolean isNode) {
        int iHashCode;
        int remainingSlots;
        List<KeyInfo> list;
        List<KeyInfo> list2;
        int iHashCode2;
        int iPeek2 = this.parentStateStack.peek2() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iGroupKey = this.writer.groupKey(parent);
            Object objGroupObjectKey = this.writer.groupObjectKey(parent);
            Object objGroupAux = this.writer.groupAux(parent);
            if (objGroupObjectKey != null) {
                iHashCode2 = Integer.hashCode(objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objGroupAux == null || iGroupKey != 207 || objGroupAux.equals(Composer.INSTANCE.getEmpty())) {
                iHashCode2 = Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iGroupKey);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objGroupAux.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iGroupKey2 = this.reader.groupKey(parent2);
            Object objGroupObjectKey2 = this.reader.groupObjectKey(parent2);
            Object objGroupAux2 = this.reader.groupAux(parent2);
            if (objGroupObjectKey2 != null) {
                iHashCode = Integer.hashCode(objGroupObjectKey2 instanceof Enum ? ((Enum) objGroupObjectKey2).ordinal() : objGroupObjectKey2.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objGroupAux2 == null || iGroupKey2 != 207 || objGroupAux2.equals(Composer.INSTANCE.getEmpty())) {
                iHashCode = Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iGroupKey2);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objGroupAux2.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode, 3);
        }
        int i = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i8 = 0;
            int i9 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i8 < size2) {
                KeyInfo keyInfo = keyInfos.get(i8);
                if (setFastToSet.contains(keyInfo)) {
                    list = keyInfos;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i9 < size) {
                            KeyInfo keyInfo2 = used.get(i9);
                            if (keyInfo2 != keyInfo) {
                                int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                    list2 = used;
                                    this.changeListWriter.moveNode(pending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + pending.getStartIndex(), iUpdatedNodeCountOf2);
                                    pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                } else {
                                    list2 = used;
                                }
                            } else {
                                list2 = used;
                                i8++;
                            }
                            i9++;
                            iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                            keyInfos = list;
                            used = list2;
                        }
                    }
                    keyInfos = list;
                } else {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    list = keyInfos;
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), this.reader.groupSize(keyInfo.getLocation()) + keyInfo.getLocation());
                }
                i8++;
                keyInfos = list;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (remainingSlots = this.reader.getRemainingSlots()) > 0) {
            this.changeListWriter.trimValues(remainingSlots);
        }
        int i10 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i10, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.endNodeInsert();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close(true);
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (isNode) {
                i = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean isNode, Pending newPending) {
        Stack.m10104pushimpl(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        Pending pending = (Pending) Stack.m10103popimpl(this.pendingStack);
        if (pending != null && !inserting) {
            pending.setGroupIndex(pending.getGroupIndex() + 1);
        }
        this.pending = pending;
        this.nodeIndex = this.parentStateStack.pop() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + expectedNodeCount;
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (!Stack.m10099isEmptyimpl(this.pendingStack)) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    private final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i) {
        Object objGroupAux;
        if (!slotReader.hasObjectKey(i)) {
            int iGroupKey = slotReader.groupKey(i);
            return (iGroupKey != 207 || (objGroupAux = slotReader.groupAux(i)) == null || objGroupAux.equals(Composer.INSTANCE.getEmpty())) ? iGroupKey : objGroupAux.hashCode();
        }
        Object objGroupObjectKey = slotReader.groupObjectKey(i);
        if (objGroupObjectKey != null) {
            return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : objGroupObjectKey.hashCode();
        }
        return 0;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) throws Throwable {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        SlotTable slotTable;
        Anchor anchor;
        SlotReader slotReader;
        MutableIntObjectMap mutableIntObjectMap;
        ComposerChangeListWriter composerChangeListWriter3;
        ChangeList changeList3;
        int i;
        int i8;
        SlotTable slotTable2;
        ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
        ChangeList changeList4 = this.lateChanges;
        ChangeList changeList5 = composerChangeListWriter4.getChangeList();
        try {
            composerChangeListWriter4.setChangeList(changeList4);
            this.changeListWriter.resetSlots();
            int size = references.size();
            int i9 = 0;
            int i10 = 0;
            while (i10 < size) {
                try {
                    Pair<MovableContentStateReference, MovableContentStateReference> pair = references.get(i10);
                    final MovableContentStateReference movableContentStateReferenceComponent1 = pair.component1();
                    MovableContentStateReference movableContentStateReferenceComponent2 = pair.component2();
                    Anchor anchor2 = movableContentStateReferenceComponent1.getAnchor();
                    int iAnchorIndex = movableContentStateReferenceComponent1.getSlotTable().anchorIndex(anchor2);
                    IntRef intRef = new IntRef(i9, 1, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor2);
                    if (movableContentStateReferenceComponent2 == null) {
                        if (AbstractC5830k.m5325b(movableContentStateReferenceComponent1.getSlotTable(), this.insertTable)) {
                            createFreshInsertTable();
                        }
                        final SlotReader slotReaderOpenReader = movableContentStateReferenceComponent1.getSlotTable().openReader();
                        try {
                            slotReaderOpenReader.reposition(iAnchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(iAnchorIndex);
                            final ChangeList changeList6 = new ChangeList();
                            recomposeMovableContent$default(this, null, null, null, null, new InterfaceC6469a() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // p152r6.InterfaceC6469a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m10044invoke();
                                    return C5443s.f8405a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m10044invoke() {
                                    ComposerChangeListWriter composerChangeListWriter5 = this.this$0.changeListWriter;
                                    ChangeList changeList7 = changeList6;
                                    ComposerImpl composerImpl = this.this$0;
                                    SlotReader slotReader2 = slotReaderOpenReader;
                                    MovableContentStateReference movableContentStateReference = movableContentStateReferenceComponent1;
                                    ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                    try {
                                        composerChangeListWriter5.setChangeList(changeList7);
                                        SlotReader reader = composerImpl.getReader();
                                        int[] iArr = composerImpl.nodeCountOverrides;
                                        MutableIntObjectMap mutableIntObjectMap2 = composerImpl.providerUpdates;
                                        composerImpl.nodeCountOverrides = null;
                                        composerImpl.providerUpdates = null;
                                        try {
                                            composerImpl.setReader$runtime_release(slotReader2);
                                            ComposerChangeListWriter composerChangeListWriter6 = composerImpl.changeListWriter;
                                            boolean implicitRootStart = composerChangeListWriter6.getImplicitRootStart();
                                            try {
                                                composerChangeListWriter6.setImplicitRootStart(false);
                                                composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
                                            } finally {
                                                composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                            }
                                        } finally {
                                            composerImpl.setReader$runtime_release(reader);
                                            composerImpl.nodeCountOverrides = iArr;
                                            composerImpl.providerUpdates = mutableIntObjectMap2;
                                        }
                                    } finally {
                                        composerChangeListWriter5.setChangeList(changeList8);
                                    }
                                }
                            }, 15, null);
                            this.changeListWriter.includeOperationsIn(changeList6, intRef);
                            slotReaderOpenReader.close();
                            i8 = size;
                            composerChangeListWriter2 = composerChangeListWriter4;
                            changeList2 = changeList5;
                            i = i10;
                        } finally {
                        }
                    } else {
                        MovableContentState movableContentStateMovableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReferenceComponent2);
                        if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null) {
                            slotTable = movableContentStateReferenceComponent2.getSlotTable();
                        }
                        if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable2 = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null || (anchor = slotTable2.anchor(0)) == null) {
                            anchor = movableContentStateReferenceComponent2.getAnchor();
                        }
                        List<? extends Object> listCollectNodesFrom = ComposerKt.collectNodesFrom(slotTable, anchor);
                        if (!listCollectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(listCollectNodesFrom, intRef);
                            if (AbstractC5830k.m5325b(movableContentStateReferenceComponent1.getSlotTable(), this.slotTable)) {
                                int iAnchorIndex2 = this.slotTable.anchorIndex(anchor2);
                                updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateMovableContentStateResolve$runtime_release, this.parentContext, movableContentStateReferenceComponent2, movableContentStateReferenceComponent1);
                        SlotReader slotReaderOpenReader2 = slotTable.openReader();
                        try {
                            SlotReader reader = getReader();
                            int[] iArr = this.nodeCountOverrides;
                            MutableIntObjectMap mutableIntObjectMap2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                setReader$runtime_release(slotReaderOpenReader2);
                                int iAnchorIndex3 = slotTable.anchorIndex(anchor);
                                slotReaderOpenReader2.reposition(iAnchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(iAnchorIndex3);
                                ChangeList changeList7 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                try {
                                    composerChangeListWriter5.setChangeList(changeList7);
                                    slotReader = slotReaderOpenReader2;
                                    try {
                                        ComposerChangeListWriter composerChangeListWriter6 = this.changeListWriter;
                                        i = i10;
                                        boolean implicitRootStart = composerChangeListWriter6.getImplicitRootStart();
                                        i8 = size;
                                        try {
                                            composerChangeListWriter6.setImplicitRootStart(false);
                                            try {
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                composerChangeListWriter2 = composerChangeListWriter4;
                                                changeList2 = changeList5;
                                                changeList3 = changeList8;
                                                composerChangeListWriter3 = composerChangeListWriter5;
                                                try {
                                                    recomposeMovableContent(movableContentStateReferenceComponent2.getComposition(), movableContentStateReferenceComponent1.getComposition(), Integer.valueOf(slotReader.getCurrentGroup()), movableContentStateReferenceComponent2.getInvalidations$runtime_release(), new InterfaceC6469a() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // p152r6.InterfaceC6469a
                                                        public /* bridge */ /* synthetic */ Object invoke() {
                                                            m10045invoke();
                                                            return C5443s.f8405a;
                                                        }

                                                        /* renamed from: invoke, reason: collision with other method in class */
                                                        public final void m10045invoke() {
                                                            this.this$0.invokeMovableContentLambda(movableContentStateReferenceComponent1.getContent$runtime_release(), movableContentStateReferenceComponent1.getLocals(), movableContentStateReferenceComponent1.getParameter(), true);
                                                        }
                                                    });
                                                    try {
                                                        composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                        try {
                                                            composerChangeListWriter3.setChangeList(changeList3);
                                                            this.changeListWriter.includeOperationsIn(changeList7, intRef);
                                                            try {
                                                                setReader$runtime_release(reader);
                                                                this.nodeCountOverrides = iArr;
                                                                this.providerUpdates = mutableIntObjectMap;
                                                                try {
                                                                    slotReader.close();
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    composerChangeListWriter = composerChangeListWriter2;
                                                                    changeList = changeList2;
                                                                    composerChangeListWriter.setChangeList(changeList);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                slotReader.close();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            setReader$runtime_release(reader);
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = mutableIntObjectMap;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        composerChangeListWriter3.setChangeList(changeList3);
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                changeList3 = changeList8;
                                                composerChangeListWriter3 = composerChangeListWriter5;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            composerChangeListWriter3 = composerChangeListWriter5;
                                            changeList3 = changeList8;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        mutableIntObjectMap = mutableIntObjectMap2;
                                        composerChangeListWriter3 = composerChangeListWriter5;
                                        changeList3 = changeList8;
                                        composerChangeListWriter3.setChangeList(changeList3);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    slotReader = slotReaderOpenReader2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                mutableIntObjectMap = mutableIntObjectMap2;
                                slotReader = slotReaderOpenReader2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            slotReader = slotReaderOpenReader2;
                        }
                    }
                    this.changeListWriter.skipToEndOfCurrentGroup();
                    i10 = i + 1;
                    size = i8;
                    composerChangeListWriter4 = composerChangeListWriter2;
                    changeList5 = changeList2;
                    i9 = 0;
                } catch (Throwable th12) {
                    th = th12;
                    composerChangeListWriter2 = composerChangeListWriter4;
                    changeList2 = changeList5;
                }
            }
            ComposerChangeListWriter composerChangeListWriter7 = composerChangeListWriter4;
            ChangeList changeList9 = changeList5;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter7.setChangeList(changeList9);
        } catch (Throwable th13) {
            th = th13;
            composerChangeListWriter = composerChangeListWriter4;
            changeList = changeList5;
        }
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeMovableContentLambda(final MovableContent<Object> content, PersistentCompositionLocalMap locals, final Object parameter, boolean force) {
        startMovableGroup(MovableContentKt.movableContentKey, content);
        updateSlot(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.movableContentKey;
            boolean z8 = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !AbstractC5830k.m5325b(this.reader.getGroupAux(), locals)) {
                z8 = true;
            }
            if (z8) {
                recordProviderUpdate(locals);
            }
            m10040startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m10057getGroupULZAiWs(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                boolean z9 = this.providersInvalid;
                this.providersInvalid = z8;
                Utils_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(316014703, true, new InterfaceC6473e() { // from class: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C5443s.f8405a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i) {
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3386)");
                        }
                        content.getContent().invoke(parameter, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                this.providersInvalid = z9;
            } else {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(content, parameter, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), EmptyList.INSTANCE, currentCompositionLocalScope(), null));
            }
            endGroup();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
        } catch (Throwable th) {
            endGroup();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
            throw th;
        }
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iParent = this.reader.parent(group);
        while (iParent != recomposeGroup && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            recomposeIndex = 0;
        }
        if (iParent == group) {
            return recomposeIndex;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iUpdatedNodeCount && iParent != groupLocation) {
            iParent++;
            while (iParent < groupLocation) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (groupLocation >= iGroupSize) {
                    recomposeIndex += this.reader.isNode(iParent) ? 1 : updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int rGroupIndexOf(int group) {
        int iParent = this.reader.parent(group) + 1;
        int i = 0;
        while (iParent < group) {
            if (!this.reader.hasObjectKey(iParent)) {
                i++;
            }
            iParent += this.reader.groupSize(iParent);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:11:0x002c, B:10:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003f), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <R> R recomposeMovableContent(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.ControlledComposition r8, java.lang.Integer r9, java.util.List<? extends kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> r10, p152r6.InterfaceC6469a r11) {
        /*
            r6 = this;
            boolean r0 = r6.isComposing
            int r1 = r6.nodeIndex
            r2 = 1
            r6.isComposing = r2     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r6.nodeIndex = r2     // Catch: java.lang.Throwable -> L26
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L26
        Le:
            if (r2 >= r3) goto L2f
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L26
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.component1()     // Catch: java.lang.Throwable -> L26
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.component2()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            r6.tryImminentInvalidation$runtime_release(r5, r4)     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            r7 = move-exception
            goto L48
        L28:
            r4 = 0
            r6.tryImminentInvalidation$runtime_release(r5, r4)     // Catch: java.lang.Throwable -> L26
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            if (r7 == 0) goto L3f
            if (r9 == 0) goto L38
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L26
            goto L39
        L38:
            r9 = -1
        L39:
            java.lang.Object r7 = r7.delegateInvalidations(r8, r9, r11)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L43
        L3f:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L26
        L43:
            r6.isComposing = r0
            r6.nodeIndex = r1
            return r7
        L48:
            r6.isComposing = r0
            r6.nodeIndex = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.recomposeMovableContent(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, r6.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            controlledComposition = null;
        }
        if ((i & 2) != 0) {
            controlledComposition2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list = EmptyList.INSTANCE;
        }
        return composerImpl.recomposeMovableContent(controlledComposition, controlledComposition2, num, list, interfaceC6469a);
    }

    private final void recomposeToGroupEnd() {
        boolean z8 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i8 = this.groupNodeCount;
        int i9 = this.rGroupIndex;
        Invalidation invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        int i10 = parent;
        boolean z9 = false;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i10, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.rGroupIndex = rGroupIndexOf(currentGroup);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                boolean z10 = !this.reusing && invalidationFirstInRange.getScope().getReusing();
                if (z10) {
                    this.reusing = true;
                }
                invalidationFirstInRange.getScope().compose(this);
                if (z10) {
                    this.reusing = false;
                }
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i10 = currentGroup;
                z9 = true;
            } else {
                Stack.m10104pushimpl(this.invalidateStack, invalidationFirstInRange.getScope());
                invalidationFirstInRange.getScope().rereadTrackedInstances();
                Stack.m10103popimpl(this.invalidateStack);
            }
            invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        }
        if (z9) {
            recordUpsAndDowns(i10, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + iUpdatedNodeCount;
            this.groupNodeCount = i8 + iUpdatedNodeCount;
            this.rGroupIndex = i9;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z8;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap providers) {
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
            this.providerUpdates = mutableIntObjectMap;
        }
        mutableIntObjectMap.set(this.reader.getCurrentGroup(), providers);
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iNearestCommonRootOf) {
            if (slotReader.isNode(oldGroup)) {
                this.changeListWriter.moveUp();
            }
            oldGroup = slotReader.parent(oldGroup);
        }
        doRecordDownsFor(newGroup, iNearestCommonRootOf);
    }

    private final Anchor rememberObserverAnchor() {
        int i;
        int i8;
        if (getInserting()) {
            if (!ComposerKt.isAfterFirstChild(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int iParent = this.writer.parent(currentGroup);
            while (true) {
                int i9 = iParent;
                i8 = currentGroup;
                currentGroup = i9;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                iParent = this.writer.parent(currentGroup);
            }
            return this.writer.anchor(i8);
        }
        if (!ComposerKt.isAfterFirstChild(this.reader)) {
            return null;
        }
        int currentGroup2 = this.reader.getCurrentGroup() - 1;
        int iParent2 = this.reader.parent(currentGroup2);
        while (true) {
            int i10 = iParent2;
            i = currentGroup2;
            currentGroup2 = i10;
            if (currentGroup2 == this.reader.getParent() || currentGroup2 < 0) {
                break;
            }
            iParent2 = this.reader.parent(currentGroup2);
        }
        return this.reader.anchor(i);
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ControlledComposition composition = getComposition();
            AbstractC5830k.m5328e(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            ((CompositionImpl) composition).updateMovingInvalidations$runtime_release();
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader slotReaderOpenReader = this.slotTable.openReader();
            try {
                this.reader = slotReaderOpenReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                } finally {
                    composerChangeListWriter.setChangeList(changeList2);
                }
            } finally {
                slotReaderOpenReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int groupBeingRemoved) {
        boolean zIsNode = this.reader.isNode(groupBeingRemoved);
        if (zIsNode) {
            this.changeListWriter.endNodeMovement();
            this.changeListWriter.moveDown(this.reader.node(groupBeingRemoved));
        }
        reportFreeMovableContent$reportGroup(this, groupBeingRemoved, groupBeingRemoved, zIsNode, 0);
        this.changeListWriter.endNodeMovement();
        if (zIsNode) {
            this.changeListWriter.moveUp();
        }
    }

    private static final MovableContentStateReference reportFreeMovableContent$createMovableContentReferenceForGroup(ComposerImpl composerImpl, int i, List<MovableContentStateReference> list) {
        Object objGroupObjectKey = composerImpl.reader.groupObjectKey(i);
        AbstractC5830k.m5328e(objGroupObjectKey, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        MovableContent movableContent = (MovableContent) objGroupObjectKey;
        Object objGroupGet = composerImpl.reader.groupGet(i, 0);
        Anchor anchor = composerImpl.reader.anchor(i);
        List listFilterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i, composerImpl.reader.groupSize(i) + i);
        ArrayList arrayList = new ArrayList(listFilterToRange.size());
        int size = listFilterToRange.size();
        for (int i8 = 0; i8 < size; i8++) {
            Invalidation invalidation = (Invalidation) listFilterToRange.get(i8);
            arrayList.add(new Pair(invalidation.getScope(), invalidation.getInstances()));
        }
        return new MovableContentStateReference(movableContent, objGroupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i), list);
    }

    private static final MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor(ComposerImpl composerImpl, int i) {
        int iGroupKey = composerImpl.reader.groupKey(i);
        Object objGroupObjectKey = composerImpl.reader.groupObjectKey(i);
        ArrayList arrayList = null;
        if (iGroupKey != 126665345 || !(objGroupObjectKey instanceof MovableContent)) {
            return null;
        }
        if (composerImpl.reader.containsMark(i)) {
            ArrayList arrayList2 = new ArrayList();
            m1096x4bca748(composerImpl, arrayList2, i);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return reportFreeMovableContent$createMovableContentReferenceForGroup(composerImpl, i, arrayList);
    }

    /* renamed from: reportFreeMovableContent$movableContentReferenceFor$traverseGroups */
    private static final void m1096x4bca748(ComposerImpl composerImpl, List<MovableContentStateReference> list, int i) {
        int iGroupSize = composerImpl.reader.groupSize(i) + i;
        int iGroupSize2 = i + 1;
        while (iGroupSize2 < iGroupSize) {
            if (composerImpl.reader.hasMark(iGroupSize2)) {
                MovableContentStateReference movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(composerImpl, iGroupSize2);
                if (movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor != null) {
                    list.add(movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor);
                }
            } else if (composerImpl.reader.containsMark(iGroupSize2)) {
                m1096x4bca748(composerImpl, list, iGroupSize2);
            }
            iGroupSize2 += composerImpl.reader.groupSize(iGroupSize2);
        }
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i, int i8, boolean z8, int i9) {
        SlotReader slotReader = composerImpl.reader;
        if (!slotReader.hasMark(i8)) {
            if (!slotReader.containsMark(i8)) {
                if (slotReader.isNode(i8)) {
                    return 1;
                }
                return slotReader.nodeCount(i8);
            }
            int iGroupSize = slotReader.groupSize(i8) + i8;
            int iReportFreeMovableContent$reportGroup = 0;
            for (int iGroupSize2 = i8 + 1; iGroupSize2 < iGroupSize; iGroupSize2 += slotReader.groupSize(iGroupSize2)) {
                boolean zIsNode = slotReader.isNode(iGroupSize2);
                if (zIsNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(iGroupSize2));
                }
                iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(composerImpl, i, iGroupSize2, zIsNode || z8, zIsNode ? 0 : i9 + iReportFreeMovableContent$reportGroup);
                if (zIsNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i8)) {
                return 1;
            }
            return iReportFreeMovableContent$reportGroup;
        }
        int iGroupKey = slotReader.groupKey(i8);
        Object objGroupObjectKey = slotReader.groupObjectKey(i8);
        if (iGroupKey == 126665345 && (objGroupObjectKey instanceof MovableContent)) {
            MovableContentStateReference movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(composerImpl, i8);
            if (movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor != null) {
                composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor);
                composerImpl.changeListWriter.recordSlotEditing();
                composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor);
            }
            if (!z8 || i8 == i) {
                return slotReader.nodeCount(i8);
            }
            composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i9, i8);
            return 0;
        }
        if (iGroupKey != 206 || !AbstractC5830k.m5325b(objGroupObjectKey, ComposerKt.getReference())) {
            if (slotReader.isNode(i8)) {
                return 1;
            }
            return slotReader.nodeCount(i8);
        }
        Object objGroupGet = slotReader.groupGet(i8, 0);
        CompositionContextHolder compositionContextHolder = objGroupGet instanceof CompositionContextHolder ? (CompositionContextHolder) objGroupGet : null;
        if (compositionContextHolder != null) {
            for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                composerImpl2.reportAllMovableContent();
                composerImpl.parentContext.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
            }
        }
        return slotReader.nodeCount(i8);
    }

    private final void skipGroup() {
        this.groupNodeCount = this.reader.skipGroup() + this.groupNodeCount;
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* renamed from: start-BaiHCIY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m10040startBaiHCIY(int r11, java.lang.Object r12, int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m10040startBaiHCIY(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void startGroup(int key) {
        m10040startBaiHCIY(key, null, GroupKind.INSTANCE.m10057getGroupULZAiWs(), null);
    }

    private final void startReaderGroup(boolean isNode, Object data) {
        if (isNode) {
            this.reader.startNode();
            return;
        }
        if (data != null && this.reader.getGroupAux() != data) {
            this.changeListWriter.updateAuxData(data);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int groupKey, int rGroupIndex, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                this.compoundKeyHash = Integer.rotateLeft(((Enum) dataKey).ordinal() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
                return;
            } else {
                this.compoundKeyHash = Integer.rotateLeft(dataKey.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
                return;
            }
        }
        if (data == null || groupKey != 207 || data.equals(Composer.INSTANCE.getEmpty())) {
            this.compoundKeyHash = Integer.rotateLeft(groupKey ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ rGroupIndex;
        } else {
            this.compoundKeyHash = Integer.rotateLeft(data.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ rGroupIndex;
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int keyHash, int rGroupIndex) {
        this.compoundKeyHash = Integer.rotateLeft(keyHash ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ rGroupIndex;
    }

    private final void updateCompoundKeyWhenWeExitGroup(int groupKey, int rGroupIndex, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                int iOrdinal = ((Enum) dataKey).ordinal();
                this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(iOrdinal) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                return;
            } else {
                int iHashCode = dataKey.hashCode();
                this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(iHashCode) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                return;
            }
        }
        if (data == null || groupKey != 207 || data.equals(Composer.INSTANCE.getEmpty())) {
            this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(groupKey) ^ Integer.rotateRight(rGroupIndex ^ getCompoundKeyHash(), 3), 3);
        } else {
            int iHashCode2 = data.hashCode();
            this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(iHashCode2) ^ Integer.rotateRight(rGroupIndex ^ getCompoundKeyHash(), 3), 3);
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int groupKey, int rGroupIndex) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(groupKey) ^ Integer.rotateRight(rGroupIndex ^ getCompoundKeyHash(), 3), 3);
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) != count) {
            if (group < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                AbstractC5802q.m5187N(iArr, -1, 0, 6);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int iUpdatedNodeCount = updatedNodeCount(group);
        if (iUpdatedNodeCount != newCount) {
            int i = newCount - iUpdatedNodeCount;
            int iM10097getSizeimpl = Stack.m10097getSizeimpl(this.pendingStack) - 1;
            while (group != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(group) + i;
                updateNodeCount(group, iUpdatedNodeCount2);
                int i8 = iM10097getSizeimpl;
                while (true) {
                    if (-1 < i8) {
                        Pending pending = (Pending) Stack.m10102peekimpl(this.pendingStack, i8);
                        if (pending != null && pending.updateNodeCount(group, iUpdatedNodeCount2)) {
                            iM10097getSizeimpl = i8 - 1;
                            break;
                        }
                        i8--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.isNode(group)) {
                    return;
                } else {
                    group = this.reader.parent(group);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap parentScope, PersistentCompositionLocalMap currentProviders) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder2 = parentScope.builder2();
        builderBuilder2.putAll(currentProviders);
        ?? Build2 = builderBuilder2.build2();
        startGroup(ComposerKt.providerMapsKey, ComposerKt.getProviderMaps());
        updateSlot(Build2);
        updateSlot(currentProviders);
        endGroup();
        return Build2;
    }

    private final void updateSlot(Object value) {
        nextSlot();
        updateValue(value);
    }

    private final int updatedNodeCount(int group) {
        int i;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i = iArr[group]) < 0) ? this.reader.nodeCount(group) : i;
        }
        MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
        if (mutableIntIntMap == null || !mutableIntIntMap.containsKey(group)) {
            return 0;
        }
        return mutableIntIntMap.get(group);
    }

    private final void validateNodeExpected() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final <R> R withReader(SlotReader reader, InterfaceC6469a block) {
        SlotReader reader2 = getReader();
        int[] iArr = this.nodeCountOverrides;
        MutableIntObjectMap mutableIntObjectMap = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            setReader$runtime_release(reader);
            return (R) block.invoke();
        } finally {
            setReader$runtime_release(reader2);
            this.nodeCountOverrides = iArr;
            this.providerUpdates = mutableIntObjectMap;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V value, @NotNull InterfaceC6473e block) {
        if (getInserting()) {
            this.insertFixups.updateNode(value, block);
        } else {
            this.changeListWriter.updateNode(value, block);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        startGroup(ComposerKt.referenceKey, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = objNextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) objNextSlot : null;
        if (compositionContextHolder == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z8 = this.forceRecomposeScopes;
            boolean z9 = this.sourceMarkersEnabled;
            ControlledComposition composition = getComposition();
            CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(compoundKeyHash, z8, z9, compositionImpl != null ? compositionImpl.getObserverHolder() : null));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean invalid, @NotNull InterfaceC6469a block) {
        T t8 = (T) nextSlotForCache();
        if (t8 != Composer.INSTANCE.getEmpty() && !invalid) {
            return t8;
        }
        T t9 = (T) block.invoke();
        updateCachedValue(t9);
        return t9;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@Nullable Object value) {
        if (AbstractC5830k.m5325b(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(@Nullable Object value) {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    /* renamed from: composeContent--ZbOJvo$runtime_release, reason: not valid java name */
    public final void m10041composeContentZbOJvo$runtime_release(@NotNull MutableScatterMap<Object, Object> invalidationsRequested, @NotNull InterfaceC6473e content, @Nullable ShouldPauseCallback shouldPause) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPause;
        try {
            m10039doComposeaFTiNEg(invalidationsRequested, content);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@NotNull CompositionLocal<T> key) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@NotNull InterfaceC6469a factory) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int iPeek = this.parentStateStack.peek();
        SlotWriter slotWriter = this.writer;
        Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(factory, iPeek, anchor);
    }

    public final void deactivate$runtime_release() {
        Stack.m10092clearimpl(this.invalidateStack);
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.changeListWriter.deactivateCurrentGroup();
        ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceMarkersEnabled = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.isDisposed = true;
            trace.endSection(objBeginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProvider() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @Nullable
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.m10100isNotEmptyimpl(this.invalidateStack) ? (RecomposeScopeImpl) Stack.m10103popimpl(this.invalidateStack) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.setRequiresRecompose(false);
            InterfaceC6471c interfaceC6471cEnd = recomposeScopeImpl2.end(this.compositionToken);
            if (interfaceC6471cEnd != null) {
                this.changeListWriter.endCompositionScope(interfaceC6471cEnd, getComposition());
            }
            if (recomposeScopeImpl2.getResuming()) {
                recomposeScopeImpl2.setResuming(false);
                this.changeListWriter.endResumingScope(recomposeScopeImpl2);
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime_release() && (recomposeScopeImpl2.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl2.setAnchor(anchor);
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    public final void endReuseFromRoot() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int marker) {
        if (marker < 0) {
            int i = -marker;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= marker) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @TestOnly
    @NotNull
    public InterfaceC5636h getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.getSize();
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        CompositionData compositionData = this._compositionData;
        if (compositionData != null) {
            return compositionData;
        }
        CompositionDataImpl compositionDataImpl = new CompositionDataImpl(getComposition());
        this._compositionData = compositionDataImpl;
        return compositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Nullable
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        ArrayList arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && Stack.m10100isNotEmptyimpl(arrayList)) {
            return (RecomposeScopeImpl) Stack.m10101peekimpl(arrayList);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return !getSkipping() || this.providersInvalid || ((currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) != null && currentRecomposeScope$runtime_release.getDefaultsInvalid());
    }

    @Nullable
    /* renamed from: getDeferredChanges$runtime_release, reason: from getter */
    public final ChangeList getDeferredChanges() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.changes.isNotEmpty();
    }

    @NotNull
    /* renamed from: getInsertTable$runtime_release, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @NotNull
    /* renamed from: getReader$runtime_release, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(@NotNull MovableContent<?> value, @Nullable Object parameter) {
        AbstractC5830k.m5328e(value, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(value, currentCompositionLocalScope(), parameter, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        try {
            insertMovableContentGuarded(references);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    /* renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Object joinKey(@Nullable Object left, @Nullable Object right) {
        Object key = ComposerKt.getKey(this.reader.getGroupObjectKey(), left, right);
        return key == null ? new JoinedKey(left, right) : key;
    }

    @PublishedApi
    @Nullable
    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next : Composer.INSTANCE.getEmpty();
    }

    @PublishedApi
    @Nullable
    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next : Composer.INSTANCE.getEmpty();
    }

    @TestOnly
    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(@NotNull InterfaceC6469a block) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    /* renamed from: recompose-aFTiNEg$runtime_release, reason: not valid java name */
    public final boolean m10042recomposeaFTiNEg$runtime_release(@NotNull MutableScatterMap<Object, Object> invalidationsRequested, @Nullable ShouldPauseCallback shouldPause) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (ScopeMap.m10214getSizeimpl(invalidationsRequested) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPause;
        try {
            m10039doComposeaFTiNEg(invalidationsRequested, null);
            this.shouldPauseCallback = null;
            return this.changes.isNotEmpty();
        } catch (Throwable th) {
            this.shouldPauseCallback = null;
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull InterfaceC6469a effect) {
        this.changeListWriter.sideEffect(effect);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope scope) {
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    public final void setDeferredChanges$runtime_release(@Nullable ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final void setInsertTable$runtime_release(@NotNull SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    public final void setReader$runtime_release(@NotNull SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean shouldExecute(boolean parametersChanged, int flags) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if ((flags & 1) != 0 || (!getInserting() && !this.reusing)) {
            return parametersChanged || !getSkipping();
        }
        ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
        if (shouldPauseCallback == null || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || !shouldPauseCallback.shouldPause()) {
            return true;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        currentRecomposeScope$runtime_release.setReusing(this.reusing);
        currentRecomposeScope$runtime_release.setPaused(true);
        this.changeListWriter.rememberPausingScope(currentRecomposeScope$runtime_release);
        this.parentContext.reportPausedScope$runtime_release(currentRecomposeScope$runtime_release);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void skipCurrentGroup() {
        /*
            r9 = this;
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r9.invalidations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            r9.skipGroup()
            return
        Lc:
            androidx.compose.runtime.SlotReader r0 = r9.reader
            int r1 = r0.getGroupKey()
            java.lang.Object r2 = r0.getGroupObjectKey()
            java.lang.Object r3 = r0.getGroupAux()
            int r4 = r9.rGroupIndex
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 3
            if (r2 != 0) goto L57
            if (r3 == 0) goto L46
            if (r1 != r5) goto L46
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r7 = r7.getEmpty()
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L46
            int r7 = r3.hashCode()
            int r8 = r9.getCompoundKeyHash()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
            r9.compoundKeyHash = r7
            goto L75
        L46:
            int r7 = r9.getCompoundKeyHash()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r1
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
        L54:
            r9.compoundKeyHash = r7
            goto L75
        L57:
            boolean r7 = r2 instanceof java.lang.Enum
            if (r7 == 0) goto L70
            r7 = r2
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
        L62:
            int r8 = r9.getCompoundKeyHash()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            goto L54
        L70:
            int r7 = r2.hashCode()
            goto L62
        L75:
            boolean r7 = r0.isNode()
            r8 = 0
            r9.startReaderGroup(r7, r8)
            r9.recomposeToGroupEnd()
            r0.endGroup()
            if (r2 != 0) goto Lc3
            if (r3 == 0) goto Lae
            if (r1 != r5) goto Lae
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r0 = r0.getEmpty()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lae
            int r0 = r3.hashCode()
            int r1 = r9.getCompoundKeyHash()
            r1 = r1 ^ r4
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Lae:
            int r0 = r9.getCompoundKeyHash()
            r0 = r0 ^ r4
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Lc3:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Le1
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
            int r1 = r9.getCompoundKeyHash()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Le1:
            int r0 = r2.hashCode()
            int r1 = r9.getCompoundKeyHash()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.skipCurrentGroup():void");
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@NotNull String sourceInformation) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGroupSourceInformation(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int key, @NotNull String sourceInformation) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGrouplessCallSourceInformationStart(key, sourceInformation);
        }
    }

    public final int stacksSize$runtime_release() {
        return Stack.m10097getSizeimpl(this.pendingStack) + Stack.m10097getSizeimpl(this.invalidateStack) + this.entersStack.tos + this.providersInvalidStack.tos + this.parentStateStack.tos;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m10040startBaiHCIY(-127, null, GroupKind.INSTANCE.m10057getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int key, @Nullable Object dataKey) {
        m10040startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m10057getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m10040startBaiHCIY(125, null, GroupKind.INSTANCE.m10058getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProvider(@NotNull ProvidedValue<?> value) {
        ValueHolder<?> valueHolder;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        Object objRememberedValue = rememberedValue();
        if (AbstractC5830k.m5325b(objRememberedValue, Composer.INSTANCE.getEmpty())) {
            valueHolder = null;
        } else {
            AbstractC5830k.m5328e(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder = (ValueHolder) objRememberedValue;
        }
        CompositionLocal<?> compositionLocal = value.getCompositionLocal();
        AbstractC5830k.m5328e(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolder<?> valueHolderUpdatedStateOf$runtime_release = compositionLocal.updatedStateOf$runtime_release(value, valueHolder);
        boolean zM5325b = AbstractC5830k.m5325b(valueHolderUpdatedStateOf$runtime_release, valueHolder);
        if (!zM5325b) {
            updateRememberedValue(valueHolderUpdatedStateOf$runtime_release);
        }
        boolean z8 = true;
        boolean z9 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal)) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime_release);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objGroupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            AbstractC5830k.m5328e(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux;
            if (!(getSkipping() && zM5325b) && (value.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal))) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime_release);
            } else if ((zM5325b && !this.providersInvalid) || !this.providersInvalid) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMap;
            }
            if (!this.reusing && persistentCompositionLocalMap == persistentCompositionLocalMapCurrentCompositionLocalScope) {
                z8 = false;
            }
            z9 = z8;
        }
        if (z9 && !getInserting()) {
            recordProviderUpdate(persistentCompositionLocalMapCurrentCompositionLocalScope);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z9;
        this.providerCache = persistentCompositionLocalMapCurrentCompositionLocalScope;
        m10040startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m10057getGroupULZAiWs(), persistentCompositionLocalMapCurrentCompositionLocalScope);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@NotNull ProvidedValue<?>[] values) {
        PersistentCompositionLocalMap persistentCompositionLocalMapUpdateProviderMapGroup;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        boolean z8 = true;
        boolean z9 = false;
        if (getInserting()) {
            persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(values, persistentCompositionLocalMapCurrentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            AbstractC5830k.m5328e(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            AbstractC5830k.m5328e(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupGet2;
            PersistentCompositionLocalMap persistentCompositionLocalMapUpdateCompositionMap = CompositionLocalMapKt.updateCompositionMap(values, persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMap2);
            if (getSkipping() && !this.reusing && persistentCompositionLocalMap2.equals(persistentCompositionLocalMapUpdateCompositionMap)) {
                skipGroup();
                persistentCompositionLocalMapUpdateProviderMapGroup = persistentCompositionLocalMap;
            } else {
                persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMapUpdateCompositionMap);
                if (!this.reusing && AbstractC5830k.m5325b(persistentCompositionLocalMapUpdateProviderMapGroup, persistentCompositionLocalMap)) {
                    z8 = false;
                }
                z9 = z8;
            }
        }
        if (z9 && !getInserting()) {
            recordProviderUpdate(persistentCompositionLocalMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z9;
        this.providerCache = persistentCompositionLocalMapUpdateProviderMapGroup;
        m10040startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m10057getGroupULZAiWs(), persistentCompositionLocalMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceGroup(int key) {
        if (this.pending != null) {
            m10040startBaiHCIY(key, null, GroupKind.INSTANCE.m10057getGroupULZAiWs(), null);
            return;
        }
        validateNodeNotExpected();
        this.compoundKeyHash = this.rGroupIndex ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ key, 3);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.writer.startGroup(key, Composer.INSTANCE.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == key && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i = this.nodeIndex;
            int currentGroup = slotReader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i, slotReader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(key, Composer.INSTANCE.getEmpty());
        this.insertAnchor = slotWriter.anchor(currentGroup2);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int key) {
        m10040startBaiHCIY(key, null, GroupKind.INSTANCE.m10057getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Composer startRestartGroup(int key) {
        startReplaceGroup(key);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, @Nullable Object dataKey) {
        if (!getInserting() && this.reader.getGroupKey() == key && !AbstractC5830k.m5325b(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m10040startBaiHCIY(key, null, GroupKind.INSTANCE.m10057getGroupULZAiWs(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m10040startBaiHCIY(125, null, GroupKind.INSTANCE.m10059getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    @PublishedApi
    public final void updateCachedValue(@Nullable Object value) {
        if (value instanceof RememberObserver) {
            RememberObserverHolder rememberObserverHolder = new RememberObserverHolder((RememberObserver) value, rememberObserverAnchor());
            if (getInserting()) {
                this.changeListWriter.remember(rememberObserverHolder);
            }
            this.abandonSet.add(value);
            value = rememberObserverHolder;
        }
        updateValue(value);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* renamed from: updateComposerInvalidations-RY85e9Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10043updateComposerInvalidationsRY85e9Y(@org.jetbrains.annotations.NotNull androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Object[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L67
            r6 = 0
        L10:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L62
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L2a:
            if (r11 >= r9) goto L60
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L5c
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            java.lang.String r14 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r13, r14)
            androidx.compose.runtime.RecomposeScopeImpl r13 = (androidx.compose.runtime.RecomposeScopeImpl) r13
            androidx.compose.runtime.Anchor r14 = r13.getAnchor()
            if (r14 == 0) goto L5c
            int r14 = r14.getLocation()
            java.util.List<androidx.compose.runtime.Invalidation> r15 = r0.invalidations
            androidx.compose.runtime.ScopeInvalidated r5 = androidx.compose.runtime.ScopeInvalidated.INSTANCE
            if (r12 != r5) goto L54
            r12 = 0
        L54:
            androidx.compose.runtime.Invalidation r5 = new androidx.compose.runtime.Invalidation
            r5.<init>(r13, r14, r12)
            r15.add(r5)
        L5c:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2a
        L60:
            if (r9 != r10) goto L67
        L62:
            if (r6 == r4) goto L67
            int r6 = r6 + 1
            goto L10
        L67:
            java.util.List<androidx.compose.runtime.Invalidation> r1 = r0.invalidations
            java.util.Comparator r2 = androidx.compose.runtime.ComposerKt.access$getInvalidationLocationAscending$p()
            kotlin.collections.AbstractC5809x.m5289Q(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m10043updateComposerInvalidationsRY85e9Y(androidx.collection.MutableScatterMap):void");
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@Nullable Object value) {
        updateCachedValue(value);
    }

    @PublishedApi
    public final void updateValue(@Nullable Object value) {
        if (getInserting()) {
            this.writer.update(value);
            return;
        }
        if (!this.reader.getHadNext()) {
            ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
            SlotReader slotReader = this.reader;
            composerChangeListWriter.appendValue(slotReader.anchor(slotReader.getParent()), value);
            return;
        }
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        if (!this.changeListWriter.getPastParent()) {
            this.changeListWriter.updateValue(value, groupSlotIndex);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        composerChangeListWriter2.updateAnchoredValue(value, slotReader2.anchor(slotReader2.getParent()), groupSlotIndex);
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(node);
        }
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void startGroup(int key, Object dataKey) {
        m10040startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m10057getGroupULZAiWs(), null);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int group) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && AbstractC5830k.m5325b(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    AbstractC5830k.m5328e(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.groupKey(group) == 202 && AbstractC5830k.m5325b(this.reader.groupObjectKey(group), ComposerKt.getCompositionLocalMap())) {
                    MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = mutableIntObjectMap.get(group)) == null) {
                        Object objGroupAux2 = this.reader.groupAux(group);
                        AbstractC5830k.m5328e(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                group = this.reader.parent(group);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && value == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && value == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && value == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && value == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && value == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && value == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Double) && value == ((Number) objNextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && value == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }
}
