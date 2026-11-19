package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.compose.ComposeNavigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5871c1;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.C6010v0;
import kotlinx.coroutines.C6015x0;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC5983n;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.flow.C5949p;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import kotlinx.coroutines.flow.InterfaceC5959y;
import kotlinx.coroutines.flow.internal.C5931m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p092j6.InterfaceC5748a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p185v7.AbstractC6683l;
import p214z6.C6831i;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 \u0082\u00022\u00020\u0001:\n\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0018\u0010\u000bJ*\u0010 \u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0002\b\u001cH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0002\b\u001cH\u0010¢\u0006\u0004\b%\u0010&J3\u0010+\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020$0#H\u0010¢\u0006\u0004\b)\u0010*J\u0017\u0010/\u001a\u00020\t2\u0006\u0010,\u001a\u00020$H\u0010¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\tH\u0086@¢\u0006\u0004\b0\u0010\u000bJ\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u0016J\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u0016J\u001d\u00108\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0010¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b<\u0010:J\u0017\u0010?\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b>\u0010:J\u0017\u0010A\u001a\u00020\t2\u0006\u0010,\u001a\u00020$H\u0010¢\u0006\u0004\b@\u0010.J\u0017\u0010F\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0010¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0010¢\u0006\u0004\bG\u0010EJ+\u0010O\u001a\u00020\t2\u0006\u0010C\u001a\u00020B2\u0006\u0010J\u001a\u00020I2\n\u0010L\u001a\u0006\u0012\u0002\b\u00030KH\u0010¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\bP\u0010:J\u0019\u0010T\u001a\u0004\u0018\u00010I2\u0006\u0010C\u001a\u00020BH\u0010¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010UH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ$\u0010Y\u001a\u00020\t2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0[H\u0082\b¢\u0006\u0004\bY\u0010]J\u0017\u0010`\u001a\u00020\t2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ-\u0010f\u001a\u00020\t2\u0006\u0010c\u001a\u00020b2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010e\u001a\u00020XH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\tH\u0002¢\u0006\u0004\bh\u0010\u0016J\u0017\u0010i\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bi\u0010:J\u0017\u0010j\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bj\u0010:J\u0011\u0010l\u001a\u0004\u0018\u00010kH\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\tH\u0002¢\u0006\u0004\bn\u0010\u0016J\u0017\u0010o\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bo\u0010:J \u0010t\u001a\u00020\t2\u0006\u0010q\u001a\u00020p2\u0006\u0010s\u001a\u00020rH\u0082@¢\u0006\u0004\bt\u0010uJ\u0010\u0010v\u001a\u00020\tH\u0082@¢\u0006\u0004\bv\u0010\u000bJO\u0010\u007f\u001a\u00020\t2<\u0010~\u001a8\b\u0001\u0012\u0004\u0012\u00020x\u0012\u0013\u0012\u00110p¢\u0006\f\by\u0012\b\bz\u0012\u0004\b\b(q\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0{\u0012\u0006\u0012\u0004\u0018\u00010|0w¢\u0006\u0002\b}H\u0082@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0081\u0001\u0010:J.\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0083\u0001\u001a\u000b\u0012\u0004\u0012\u00020|\u0018\u00010\u0082\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J;\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u0086\u00012\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020B0\u0086\u00012\u0010\u0010\u0083\u0001\u001a\u000b\u0012\u0004\u0012\u00020|\u0018\u00010\u0082\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u0016J&\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\t0[2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J8\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\t0[2\u0006\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0083\u0001\u001a\u000b\u0012\u0004\u0012\u00020|\u0018\u00010\u0082\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001JB\u0010\u0090\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u008f\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0083\u0001\u001a\u000b\u0012\u0004\u0012\u00020|\u0018\u00010\u0082\u00012\f\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\b¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001c\u0010\u0094\u0001\u001a\u00020\t2\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001R,\u0010\u0098\u0001\u001a\u00030\u0096\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0017\u0010\u009f\u0001\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\"\u0010¨\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010§\u0001R \u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020|0\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001e\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001e\u0010®\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010§\u0001R\u001e\u0010¯\u0001\u001a\t\u0012\u0004\u0012\u00020B0¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010§\u0001R3\u0010²\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010|0±\u0001\u0012\u0004\u0012\u00020B0°\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0018\u0010µ\u0001\u001a\u00030´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R$\u0010¸\u0001\u001a\u000f\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020I0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010³\u0001R*\u0010¹\u0001\u001a\u000f\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0°\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b¹\u0001\u0010³\u0001R\"\u0010º\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0019\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010§\u0001R!\u0010»\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R!\u0010½\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010À\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Â\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001b\u0010Ä\u0001\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010Æ\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ã\u0001R\u001f\u0010É\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R'\u0010Ì\u0001\u001a\u0012\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020$\u0018\u00010\u0082\u00010Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ï\u0001\u001a\u00030Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R)\u0010Õ\u0001\u001a\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010Ô\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\bÕ\u0001\u0010Ö\u0001\u0012\u0005\b×\u0001\u0010\u0016R\u001c\u0010Ù\u0001\u001a\u00070Ø\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0016\u0010\u0012\u001a\u00020\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ó\u0001R&\u0010à\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010Ü\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bß\u0001\u0010\u0016\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u001c\u0010ä\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010á\u00018F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0013\u0010æ\u0001\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\bå\u0001\u0010ZR\u0018\u0010é\u0001\u001a\u00030¿\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001R\u0016\u0010ë\u0001\u001a\u00020X8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bê\u0001\u0010ZR\u0016\u0010í\u0001\u001a\u00020X8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bì\u0001\u0010ZR\u0016\u0010ï\u0001\u001a\u00020X8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bî\u0001\u0010ZR\u0019\u0010\u001a\u001a\u0005\u0018\u00010ð\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u001e\u0010õ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u0086\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010ô\u0001R\u0016\u0010÷\u0001\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bö\u0001\u0010ZR\u0016\u0010ù\u0001\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u0010ZR\u0016\u0010û\u0001\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bú\u0001\u0010ZR\u0016\u0010ý\u0001\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bü\u0001\u0010ZR\u0016\u0010ÿ\u0001\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bþ\u0001\u0010ZR\u0016\u0010\u0081\u0002\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0002"}, m5110d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lh6/h;", "effectCoroutineContext", "<init>", "(Lh6/h;)V", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "()Landroidx/compose/runtime/RecomposerInfo;", "Ld6/s;", "runRecomposeAndApplyChanges", "(Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "addCompositionRegistrationObserver$runtime_release", "(Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "addCompositionRegistrationObserver", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lh6/h;Lh6/c;)Ljava/lang/Object;", "cancel", "()V", "close", "join", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lr6/e;)V", "composeInitial", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "composeInitialPaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lr6/e;)Landroidx/collection/ScatterSet;", "composeInitialPaused", "invalidScopes", "recomposePaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "recomposePaused", "scope", "reportPausedScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "awaitIdle", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "invalidateScope$runtime_release", "invalidateScope", "Landroidx/compose/runtime/MovableContentStateReference;", TypedValues.Custom.S_REFERENCE, "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "Lkotlinx/coroutines/f;", "deriveStateLocked", "()Lkotlinx/coroutines/f;", "", "recordComposerModifications", "()Z", "Lkotlin/Function1;", "onEachInvalidComposition", "(Lr6/c;)V", "Lkotlinx/coroutines/w0;", "callingJob", "registerRunnerJob", "(Lkotlinx/coroutines/w0;)V", "", "e", "failedInitialComposition", "recoverable", "processCompositionError", "(Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;Z)V", "clearKnownCompositionsLocked", "removeKnownCompositionLocked", "addKnownCompositionLocked", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "recordFailedCompositionLocked", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lh6/c;)Ljava/lang/Object;", "awaitWorkAvailable", "Lkotlin/Function3;", "Lkotlinx/coroutines/v;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "block", "recompositionRunner", "(Lr6/f;Lh6/c;)Ljava/lang/Object;", "performInitialMovableContentInserts", "Landroidx/collection/MutableScatterSet;", "modifiedValues", "performRecompose", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;", "", "references", "performInsertValues", "(Ljava/util/List;Landroidx/collection/MutableScatterSet;)Ljava/util/List;", "discardUnusedMovableContentState", "readObserverOf", "(Landroidx/compose/runtime/ControlledComposition;)Lr6/c;", "writeObserverOf", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Lr6/c;", ExifInterface.GPS_DIRECTION_TRUE, "composing", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;Lr6/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "", "<set-?>", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/w0;", "closeCause", "Ljava/lang/Throwable;", "", "_knownCompositions", "Ljava/util/List;", "_knownCompositionsCache", "snapshotInvalidations", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionsAwaitingApply", "movableContentAwaitingInsert", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContent;", "movableContentRemoved", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/NestedContentMap;", "movableContentNestedStatesAvailable", "Landroidx/compose/runtime/NestedContentMap;", "Landroidx/collection/MutableScatterMap;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "compositionsRemoved", "Ljava/util/Set;", "workContinuation", "Lkotlinx/coroutines/f;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "frameClockPaused", "Lkotlinx/coroutines/flow/y;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lkotlinx/coroutines/flow/y;", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "pausedScopes", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Lkotlinx/coroutines/n;", "effectJob", "Lkotlinx/coroutines/n;", "Lh6/h;", "getEffectCoroutineContext", "()Lh6/h;", "Landroidx/collection/MutableObjectList;", "registrationObservers", "Landroidx/collection/MutableObjectList;", "getRegistrationObservers$annotations", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getRecomposeCoroutineContext$runtime_release", "Lkotlinx/coroutines/flow/f;", "getState", "()Lkotlinx/coroutines/flow/f;", "getState$annotations", "state", "Lkotlinx/coroutines/flow/m0;", "getCurrentState", "()Lkotlinx/coroutines/flow/m0;", "currentState", "getHasPendingWork", "hasPendingWork", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingCallByInformation$runtime_release", "collectingCallByInformation", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "Landroidx/compose/runtime/Composition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/Composition;", "getKnownCompositions", "()Ljava/util/List;", "knownCompositions", "getHasBroadcastFrameClockAwaitersLocked", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaiters", "getShouldKeepRecomposing", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 11 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 12 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 13 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 14 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 15 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 16 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 17 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 18 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1791:1\n1404#1,3:1906\n1403#1,7:1909\n1411#1:1921\n1404#1,3:1947\n1403#1,7:1950\n1411#1:1962\n1404#1,3:1989\n1403#1,7:1992\n1411#1:2068\n27#2:1792\n33#2,2:1796\n33#2,2:1800\n33#2,2:1804\n33#2,2:1806\n33#2,2:1814\n33#2,2:1816\n33#2,2:1818\n33#2,2:1820\n33#2,2:1837\n33#2,2:1839\n33#2,2:1841\n33#2,2:1843\n33#2,2:1864\n33#2,2:1874\n33#2,2:1876\n33#2,2:1878\n33#2,2:1886\n33#2,2:1898\n33#2,2:1902\n33#2,2:1904\n33#2,2:1922\n33#2,2:1936\n33#2,2:2002\n33#2,2:2055\n33#2,2:2069\n33#2,2:2092\n33#2,2:2096\n33#2,2:2098\n33#2,2:2100\n33#2,2:2104\n33#2,2:2108\n33#2,2:2110\n33#2,2:2112\n33#2,2:2114\n33#2,2:2141\n33#2,2:2143\n33#2,2:2145\n1101#3:1793\n1083#3,2:1794\n519#4:1798\n423#4,9:1828\n519#4:1888\n519#4:2094\n519#4:2095\n646#4,2:2102\n641#4,2:2106\n1#5:1799\n1#5:2052\n1247#6,2:1802\n33#7,6:1808\n33#7,6:1822\n33#7,6:1868\n33#7,6:1880\n90#7,2:1938\n33#7,6:1940\n92#7:1946\n113#7,3:1963\n33#7,4:1966\n116#7,2:1970\n118#7,2:1979\n38#7:1981\n120#7:1982\n81#7,3:2004\n33#7,6:2007\n84#7:2013\n90#7,2:2014\n33#7,6:2016\n92#7:2022\n105#7,2:2027\n33#7,6:2029\n107#7:2035\n105#7,2:2036\n33#7,6:2038\n107#7:2044\n203#7,3:2045\n33#7,4:2048\n38#7:2053\n206#7:2054\n222#7,3:2057\n63#7,6:2060\n225#7:2066\n33#7,6:2147\n287#8,4:1845\n292#8:1851\n287#8,6:1852\n287#8,6:1858\n287#8,4:2073\n292#8:2079\n287#8,6:2081\n1855#9,2:1849\n1549#9:2023\n1620#9,3:2024\n919#10,2:1866\n919#10,2:2077\n314#11,9:1889\n323#11,2:1900\n148#12,5:1916\n148#12,5:1957\n148#12,3:1999\n152#12:2067\n148#12,5:2087\n311#13,6:1924\n311#13,6:1930\n372#14,7:1972\n4665#15:1983\n4643#15,5:1984\n23#16,2:2071\n25#16:2080\n357#17,4:2116\n329#17,6:2120\n339#17,3:2127\n342#17,9:2131\n361#17:2140\n1399#18:2126\n1270#18:2130\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1132#1:1906,3\n1132#1:1909,7\n1132#1:1921\n1258#1:1947,3\n1258#1:1950,7\n1258#1:1962\n1281#1:1989,3\n1281#1:1992,7\n1281#1:2068\n211#1:1792\n315#1:1796,2\n366#1:1800,2\n450#1:1804,2\n456#1:1806,2\n468#1:1814,2\n475#1:1816,2\n478#1:1818,2\n490#1:1820,2\n503#1:1837,2\n511#1:1839,2\n743#1:1841,2\n770#1:1843,2\n815#1:1864,2\n837#1:1874,2\n850#1:1876,2\n866#1:1878,2\n1005#1:1886,2\n1017#1:1898,2\n1102#1:1902,2\n1117#1:1904,2\n1143#1:1922,2\n1222#1:1936,2\n1285#1:2002,2\n1343#1:2055,2\n1365#1:2069,2\n1435#1:2092,2\n1472#1:2096,2\n1485#1:2098,2\n1518#1:2100,2\n1526#1:2104,2\n1536#1:2108,2\n1544#1:2110,2\n1552#1:2112,2\n1575#1:2114,2\n1588#1:2141,2\n1599#1:2143,2\n1228#1:2145,2\n230#1:1793\n230#1:1794,2\n349#1:1798\n501#1:1828,9\n1007#1:1888\n1437#1:2094\n1444#1:2095\n1520#1:2102,2\n1528#1:2106,2\n1340#1:2052\n366#1:1802,2\n460#1:1808,6\n497#1:1822,6\n823#1:1868,6\n867#1:1880,6\n1223#1:1938,2\n1223#1:1940,6\n1223#1:1946\n1278#1:1963,3\n1278#1:1966,4\n1278#1:1970,2\n1278#1:1979,2\n1278#1:1981\n1278#1:1982\n1287#1:2004,3\n1287#1:2007,6\n1287#1:2013\n1299#1:2014,2\n1299#1:2016,6\n1299#1:2022\n1332#1:2027,2\n1332#1:2029,6\n1332#1:2035\n1332#1:2036,2\n1332#1:2038,6\n1332#1:2044\n1340#1:2045,3\n1340#1:2048,4\n1340#1:2053\n1340#1:2054\n1346#1:2057,3\n1346#1:2060,6\n1346#1:2066\n1557#1:2147,6\n787#1:1845,4\n787#1:1851\n800#1:1852,6\n808#1:1858,6\n1372#1:2073,4\n1372#1:2079\n1377#1:2081,6\n788#1:1849,2\n1308#1:2023\n1308#1:2024,3\n822#1:1866,2\n1372#1:2077,2\n1016#1:1889,9\n1016#1:1900,2\n1132#1:1916,5\n1258#1:1957,5\n1281#1:1999,3\n1281#1:2067\n1409#1:2087,5\n1179#1:1924,6\n1196#1:1930,6\n1278#1:1972,7\n1280#1:1983\n1280#1:1984,5\n1372#1:2071,2\n1372#1:2080\n1580#1:2116,4\n1580#1:2120,6\n1580#1:2127,3\n1580#1:2131,9\n1580#1:2140\n1580#1:2126\n1580#1:2130\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {

    @NotNull
    private final List<ControlledComposition> _knownCompositions;

    @Nullable
    private List<? extends ControlledComposition> _knownCompositionsCache;

    @NotNull
    private final InterfaceC5959y _state;

    @NotNull
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;

    @Nullable
    private Throwable closeCause;

    @NotNull
    private final MutableVector<ControlledComposition> compositionInvalidations;

    @NotNull
    private final List<ControlledComposition> compositionsAwaitingApply;

    @Nullable
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;

    @NotNull
    private final InterfaceC5636h effectCoroutineContext;

    @NotNull
    private final InterfaceC5983n effectJob;

    @Nullable
    private RecomposerErrorState errorState;

    @Nullable
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;

    @NotNull
    private final List<MovableContentStateReference> movableContentAwaitingInsert;

    @NotNull
    private final MutableScatterMap<Object, Object> movableContentNestedExtractionsPending;

    @NotNull
    private final NestedContentMap movableContentNestedStatesAvailable;

    @NotNull
    private final MutableScatterMap<Object, Object> movableContentRemoved;

    @NotNull
    private final MutableScatterMap<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;

    @NotNull
    private final SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> pausedScopes;

    @NotNull
    private final RecomposerInfoImpl recomposerInfo;

    @Nullable
    private MutableObjectList<CompositionRegistrationObserver> registrationObservers;

    @Nullable
    private InterfaceC6013w0 runnerJob;

    @NotNull
    private MutableScatterSet<Object> snapshotInvalidations;

    @NotNull
    private final Object stateLock;

    @Nullable
    private InterfaceC5895f workContinuation;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final InterfaceC5959y _runningRecomposers = AbstractC5914h.m5546b(ExtensionsKt.persistentSetOf());

    @NotNull
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    @Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u0007H\u0000¢\u0006\u0004\b&\u0010\u0003R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R4\u0010/\u001a\"\u0012\f\u0012\n -*\u0004\u0018\u00010\u00100\u00100,j\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00100\u0010`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00103\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u000502018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m5110d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "info", "Ld6/s;", "addRunning", "(Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V", "removeRunning", "", "Landroidx/compose/runtime/RecomposerInfo;", "currentRunningRecomposers$runtime_release", "()Ljava/util/Set;", "currentRunningRecomposers", "", "value", "setHotReloadEnabled$runtime_release", "(Z)V", "setHotReloadEnabled", "saveStateAndDisposeForHotReload$runtime_release", "()Ljava/lang/Object;", "saveStateAndDisposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "(Ljava/lang/Object;)V", "loadStateAndComposeForHotReload", "", "key", "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime_release", "clearErrors", "Lkotlinx/coroutines/flow/m0;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/m0;", "runningRecomposers", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/y;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lkotlinx/coroutines/flow/y;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1791:1\n1360#2:1792\n1446#2,5:1793\n1855#2,2:1798\n1855#2,2:1812\n1855#2,2:1814\n1603#2,9:1816\n1855#2:1825\n1856#2:1827\n1612#2:1828\n1603#2,9:1829\n1855#2:1838\n1856#2:1840\n1612#2:1841\n33#3,6:1800\n33#3,6:1806\n1#4:1826\n1#4:1839\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1654#1:1792\n1654#1:1793,5\n1662#1:1798,2\n1668#1:1812,2\n1673#1:1814,2\n1687#1:1816,9\n1687#1:1825\n1687#1:1827\n1687#1:1828\n1690#1:1829,9\n1690#1:1838\n1690#1:1840\n1690#1:1841\n1665#1:1800,6\n1666#1:1806,6\n1687#1:1826\n1690#1:1839\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) ((C5946n0) Recomposer._runningRecomposers).getValue();
                persistentSetAdd = persistentSet.add((PersistentSet) info);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!((C5946n0) Recomposer._runningRecomposers).m5569i(persistentSet, persistentSetAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) ((C5946n0) Recomposer._runningRecomposers).getValue();
                persistentSetRemove = persistentSet.remove((PersistentSet) info);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!((C5946n0) Recomposer._runningRecomposers).m5569i(persistentSet, persistentSetRemove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) ((C5946n0) Recomposer._runningRecomposers).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState recomposerErrorStateResetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (recomposerErrorStateResetErrorState != null) {
                    arrayList.add(recomposerErrorStateResetErrorState);
                }
            }
        }

        @NotNull
        public final Set<RecomposerInfo> currentRunningRecomposers$runtime_release() {
            return (Set) ((C5946n0) Recomposer._runningRecomposers).getValue();
        }

        @NotNull
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) ((C5946n0) Recomposer._runningRecomposers).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        @NotNull
        public final InterfaceC5944m0 getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int key) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) ((C5946n0) Recomposer._runningRecomposers).getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(key);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@NotNull Object token) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) ((C5946n0) Recomposer._runningRecomposers).getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            AbstractC5830k.m5328e(token, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) token;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((HotReloadable) list.get(i)).resetContent();
            }
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((HotReloadable) list.get(i8)).recompose();
            }
            Iterator it2 = ((Iterable) ((C5946n0) Recomposer._runningRecomposers).getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        @NotNull
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) ((C5946n0) Recomposer._runningRecomposers).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC5810y.m5291S(((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload(), arrayList);
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean value) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(value));
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR!\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "Landroidx/compose/runtime/CompositionImpl;", "composition", "<init>", "(Landroidx/compose/runtime/CompositionImpl;)V", "Ld6/s;", "clearContent", "()V", "resetContent", "recompose", "Landroidx/compose/runtime/CompositionImpl;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ComposeNavigator.NAME, "Lr6/e;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class HotReloadable {

        @NotNull
        private InterfaceC6473e composable;

        @NotNull
        private final CompositionImpl composition;

        public HotReloadable(@NotNull CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m10038getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "", "(ZLjava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getRecoverable", "()Z", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class RecomposerErrorState implements RecomposerErrorInfo {

        @NotNull
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z8, @NotNull Throwable th) {
            this.recoverable = z8;
            this.cause = th;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        @NotNull
        public Throwable getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    @Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m5110d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "", "key", "Ld6/s;", "invalidateGroupsWithKey", "(I)V", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "saveStateAndDisposeForHotReload", "()Ljava/util/List;", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "()V", "Lkotlinx/coroutines/flow/f;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/f;", "state", "", "getHasPendingWork", "()Z", "hasPendingWork", "", "getChangeCount", "()J", "changeCount", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "currentError", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1794\n33#2,2:1812\n203#3,3:1796\n33#3,4:1799\n38#3:1804\n206#3:1805\n33#3,6:1806\n203#3,3:1814\n33#3,4:1817\n38#3:1822\n206#3:1823\n81#3,3:1824\n33#3,4:1827\n38#3:1832\n84#3:1833\n1#4:1803\n1#4:1821\n1#4:1831\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n390#1:1792,2\n394#1:1794,2\n402#1:1812,2\n396#1:1796,3\n396#1:1799,4\n396#1:1804\n396#1:1805\n397#1:1806,6\n404#1:1814,3\n404#1:1817,4\n404#1:1822\n404#1:1823\n405#1:1824,3\n405#1:1827,4\n405#1:1832\n405#1:1833\n396#1:1803\n404#1:1821\n*E\n"})
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @Nullable
        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        @NotNull
        public InterfaceC5910f getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int key) {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((CompositionImpl) arrayList.get(i8)).invalidateGroupsWithKey(key);
            }
        }

        @Nullable
        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        @NotNull
        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i8));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class State {
        private static final /* synthetic */ InterfaceC5748a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = AbstractC5817a.m5310a(stateArr$values);
        }

        private State(String str, int i) {
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m5110d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.runtime.Recomposer$awaitIdle$2", m5303f = "Recomposer.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2 */
    public static final class C20042 extends SuspendLambda implements InterfaceC6473e {
        /* synthetic */ Object L$0;
        int label;

        public C20042(InterfaceC5631c<? super C20042> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C20042 c20042 = new C20042(interfaceC5631c);
            c20042.L$0 = obj;
            return c20042;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(State state, InterfaceC5631c<? super Boolean> interfaceC5631c) {
            return ((C20042) create(state, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return Boolean.valueOf(((State) this.L$0).compareTo(State.Idle) > 0);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m5110d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.runtime.Recomposer$join$2", m5303f = "Recomposer.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$join$2 */
    public static final class C20052 extends SuspendLambda implements InterfaceC6473e {
        /* synthetic */ Object L$0;
        int label;

        public C20052(InterfaceC5631c<? super C20052> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C20052 c20052 = new C20052(interfaceC5631c);
            c20052.L$0 = obj;
            return c20052;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(State state, InterfaceC5631c<? super Boolean> interfaceC5631c) {
            return ((C20052) create(state, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return Boolean.valueOf(((State) this.L$0) == State.ShutDown);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m5303f = "Recomposer.kt", m5304i = {0, 0}, m5305l = {1072}, m5306m = "invokeSuspend", m5307n = {"callingJob", "unregisterApplyObserver"}, m5308s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1800\n33#3,6:1794\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n1070#1:1792,2\n1075#1:1800,2\n1070#1:1794,6\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2 */
    public static final class C20072 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6474f $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", m5303f = "Recomposer.kt", m5304i = {}, m5305l = {1072}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6474f $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(InterfaceC6474f interfaceC6474f, MonotonicFrameClock monotonicFrameClock, InterfaceC5631c<? super AnonymousClass3> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$block = interfaceC6474f;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, interfaceC5631c);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                    InterfaceC6474f interfaceC6474f = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (interfaceC6474f.invoke(interfaceC6009v, monotonicFrameClock, this) == coroutineSingletons) {
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
                return ((AnonymousClass3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20072(InterfaceC6474f interfaceC6474f, MonotonicFrameClock monotonicFrameClock, InterfaceC5631c<? super C20072> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$block = interfaceC6474f;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C20072 c20072 = Recomposer.this.new C20072(this.$block, this.$parentFrameClock, interfaceC5631c);
            c20072.L$0 = obj;
            return c20072;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C20072.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C20072) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.runtime.Recomposer", m5303f = "Recomposer.kt", m5304i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m5305l = {942, 949}, m5306m = "runFrameLoop", m5307n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1 */
    public static final class C20081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C20081(InterfaceC5631c<? super C20081> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Recomposer.this.runFrameLoop(null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;Landroidx/compose/runtime/MonotonicFrameClock;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m5303f = "Recomposer.kt", m5304i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m5305l = {580, 591}, m5306m = "invokeSuspend", m5307n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1875\n33#3,6:1794\n33#3,6:1877\n231#4,3:1800\n200#4,7:1803\n211#4,3:1811\n214#4,9:1815\n234#4:1824\n231#4,3:1825\n200#4,7:1828\n211#4,3:1836\n214#4,9:1840\n234#4:1849\n231#4,3:1850\n200#4,7:1853\n211#4,3:1861\n214#4,9:1865\n234#4:1874\n1399#5:1810\n1270#5:1814\n1399#5:1835\n1270#5:1839\n1399#5:1860\n1270#5:1864\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n542#1:1792,2\n573#1:1875,2\n546#1:1794,6\n574#1:1877,6\n552#1:1800,3\n552#1:1803,7\n552#1:1811,3\n552#1:1815,9\n552#1:1824\n558#1:1825,3\n558#1:1828,7\n558#1:1836,3\n558#1:1840,9\n558#1:1849\n563#1:1850,3\n563#1:1853,7\n563#1:1861,3\n563#1:1865,9\n563#1:1874\n552#1:1810\n552#1:1814\n558#1:1835\n558#1:1839\n563#1:1860\n563#1:1864\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 */
    public static final class C20102 extends SuspendLambda implements InterfaceC6474f {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        public C20102(InterfaceC5631c<? super C20102> interfaceC5631c) {
            super(3, interfaceC5631c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer r22, java.util.List<androidx.compose.runtime.ControlledComposition> r23, java.util.List<androidx.compose.runtime.MovableContentStateReference> r24, java.util.List<androidx.compose.runtime.ControlledComposition> r25, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r26, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r27, androidx.collection.MutableScatterSet<java.lang.Object> r28, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r29) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C20102.invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                try {
                    List list2 = recomposer.movableContentAwaitingInsert;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        list.add((MovableContentStateReference) list2.get(i));
                    }
                    recomposer.movableContentAwaitingInsert.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ff -> B:24:0x0107). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010d -> B:12:0x00aa). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C20102.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6474f
        public final Object invoke(InterfaceC6009v interfaceC6009v, MonotonicFrameClock monotonicFrameClock, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C20102 c20102 = Recomposer.this.new C20102(interfaceC5631c);
            c20102.L$0 = monotonicFrameClock;
            return c20102.invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;Landroidx/compose/runtime/MonotonicFrameClock;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", m5303f = "Recomposer.kt", m5304i = {0, 0, 0, 1}, m5305l = {911, 931, 932}, m5306m = "invokeSuspend", m5307n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, m5308s = {"L$0", "L$1", "L$2", "L$0"})
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1791:1\n33#2,5:1792\n490#3:1797\n491#3,5:1800\n489#3,9:1805\n498#3,2:1818\n501#3:1821\n502#3,7:1833\n33#4,2:1798\n33#4,2:1828\n33#4,2:1840\n33#5,4:1814\n38#5:1820\n423#6,6:1822\n429#6,3:1830\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n902#1:1792,5\n914#1:1797\n914#1:1800,5\n914#1:1805,9\n914#1:1818,2\n914#1:1821\n914#1:1833,7\n914#1:1798,2\n915#1:1828,2\n926#1:1840,2\n914#1:1814,4\n914#1:1820\n914#1:1822,6\n914#1:1830,3\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 */
    public static final class C20112 extends SuspendLambda implements InterfaceC6474f {
        final /* synthetic */ InterfaceC5636h $recomposeCoroutineContext;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20112(InterfaceC5636h interfaceC5636h, Recomposer recomposer, InterfaceC5631c<? super C20112> interfaceC5631c) {
            super(3, interfaceC5631c);
            this.$recomposeCoroutineContext = interfaceC5636h;
            this.this$0 = recomposer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
        
            if (r10.awaitWorkAvailable(r17) == r0) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0191, code lost:
        
            if (kotlinx.coroutines.AbstractC6014x.m5636g(r2, r17) != r0) goto L82;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b1 -> B:25:0x00b5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 407
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C20112.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6474f
        public final Object invoke(InterfaceC6009v interfaceC6009v, MonotonicFrameClock monotonicFrameClock, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C20112 c20112 = new C20112(this.$recomposeCoroutineContext, this.this$0, interfaceC5631c);
            c20112.L$0 = interfaceC6009v;
            c20112.L$1 = monotonicFrameClock;
            return c20112.invokeSuspend(C5443s.f8405a);
        }
    }

    public Recomposer(@NotNull InterfaceC5636h interfaceC5636h) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new InterfaceC6469a() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m10076invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10076invoke() {
                InterfaceC5895f interfaceC5895fDeriveStateLocked;
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    interfaceC5895fDeriveStateLocked = recomposer.deriveStateLocked();
                    if (((Recomposer.State) ((C5946n0) recomposer._state).getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        Throwable th = recomposer.closeCause;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (interfaceC5895fDeriveStateLocked != null) {
                    interfaceC5895fDeriveStateLocked.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m10188constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m10188constructorimpl$default(null, 1, null);
        this._state = AbstractC5914h.m5546b(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        C6015x0 c6015x0 = new C6015x0((InterfaceC6013w0) interfaceC5636h.get(C6010v0.f9513a));
        c6015x0.mo5459h(new InterfaceC6471c() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5443s.f8405a;
            }

            public final void invoke(final Throwable th) {
                InterfaceC5895f interfaceC5895f;
                InterfaceC5895f interfaceC5895f2;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                Object obj = this.this$0.stateLock;
                final Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    try {
                        InterfaceC6013w0 interfaceC6013w0 = recomposer.runnerJob;
                        interfaceC5895f = null;
                        if (interfaceC6013w0 != null) {
                            ((C5946n0) recomposer._state).m5570j(Recomposer.State.ShuttingDown);
                            if (recomposer.isClosed) {
                                if (recomposer.workContinuation != null) {
                                    interfaceC5895f2 = recomposer.workContinuation;
                                }
                                recomposer.workContinuation = null;
                                interfaceC6013w0.mo5459h(new InterfaceC6471c() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p152r6.InterfaceC6471c
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((Throwable) obj2);
                                        return C5443s.f8405a;
                                    }

                                    public final void invoke(Throwable th2) {
                                        Object obj2 = recomposer.stateLock;
                                        Recomposer recomposer2 = recomposer;
                                        Throwable th3 = th;
                                        synchronized (obj2) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                try {
                                                    if (th2 instanceof CancellationException) {
                                                        th2 = null;
                                                    }
                                                    if (th2 != null) {
                                                        AbstractC5806u.m5266e(th3, th2);
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            ((C5946n0) recomposer2._state).m5570j(Recomposer.State.ShutDown);
                                        }
                                    }
                                });
                                interfaceC5895f = interfaceC5895f2;
                            } else {
                                interfaceC6013w0.cancel(cancellationException);
                            }
                            interfaceC5895f2 = null;
                            recomposer.workContinuation = null;
                            interfaceC6013w0.mo5459h(new InterfaceC6471c() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p152r6.InterfaceC6471c
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((Throwable) obj2);
                                    return C5443s.f8405a;
                                }

                                public final void invoke(Throwable th2) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th3 = th;
                                    synchronized (obj2) {
                                        if (th3 == null) {
                                            th3 = null;
                                        } else if (th2 != null) {
                                            try {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    AbstractC5806u.m5266e(th3, th2);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        recomposer2.closeCause = th3;
                                        ((C5946n0) recomposer2._state).m5570j(Recomposer.State.ShutDown);
                                    }
                                }
                            });
                            interfaceC5895f = interfaceC5895f2;
                        } else {
                            recomposer.closeCause = cancellationException;
                            ((C5946n0) recomposer._state).m5570j(Recomposer.State.ShutDown);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (interfaceC5895f != null) {
                    interfaceC5895f.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                }
            }
        });
        this.effectJob = c6015x0;
        this.effectCoroutineContext = interfaceC5636h.plus(broadcastFrameClock).plus(c6015x0);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i8 = 0; i8 < i; i8++) {
                ((CompositionRegistrationObserver) objArr[i8]).onCompositionRegistered(this, composition);
            }
        }
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(InterfaceC5631c<? super C5443s> interfaceC5631c) {
        C5961g c5961g;
        if (getHasSchedulingWork()) {
            return C5443s.f8405a;
        }
        C5961g c5961g2 = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g2.m5584u();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                c5961g = c5961g2;
            } else {
                this.workContinuation = c5961g2;
                c5961g = null;
            }
        }
        if (c5961g != null) {
            c5961g.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
        }
        Object objM5583t = c5961g2.m5583t();
        return objM5583t == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5583t : C5443s.f8405a;
    }

    private final void clearKnownCompositionsLocked() {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i8 = 0; i8 < i; i8++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i8];
                Iterator<T> it = getKnownCompositions().iterator();
                while (it.hasNext()) {
                    compositionRegistrationObserver.onCompositionUnregistered(this, (ControlledComposition) it.next());
                }
            }
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = EmptyList.INSTANCE;
    }

    private final <T> T composing(ControlledComposition composition, MutableScatterSet<Object> modifiedValues, InterfaceC6469a block) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            try {
                return (T) block.invoke();
            } finally {
                mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    private static final void deletedMovableContent$lambda$73$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List<MovableContentStateReference> nestedReferences$runtime_release = movableContentStateReference2.getNestedReferences$runtime_release();
        if (nestedReferences$runtime_release != null) {
            int size = nestedReferences$runtime_release.size();
            for (int i = 0; i < size; i++) {
                MovableContentStateReference movableContentStateReference3 = nestedReferences$runtime_release.get(i);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent$runtime_release(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$73$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5895f deriveStateLocked() {
        State state;
        int i = 0;
        int i8 = 1;
        AbstractC5824e abstractC5824e = null;
        if (((State) ((C5946n0) this._state).getValue()).compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet<>(i, i8, abstractC5824e);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            InterfaceC5895f interfaceC5895f = this.workContinuation;
            if (interfaceC5895f != null) {
                interfaceC5895f.mo4965i(null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet<>(i, i8, abstractC5824e);
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.isNotEmpty() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked()) ? State.Idle : State.PendingWork;
        }
        ((C5946n0) this._state).m5570j(state);
        if (state != State.PendingWork) {
            return null;
        }
        InterfaceC5895f interfaceC5895f2 = this.workContinuation;
        this.workContinuation = null;
        return interfaceC5895f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i;
        ObjectList objectListEmptyObjectList;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.m10196isNotEmptyimpl(this.movableContentRemoved)) {
                    ObjectList objectListM10201valuesimpl = MultiValueMap.m10201valuesimpl(this.movableContentRemoved);
                    MultiValueMap.m10186clearimpl(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.clear();
                    MultiValueMap.m10186clearimpl(this.movableContentNestedExtractionsPending);
                    MutableObjectList mutableObjectList = new MutableObjectList(objectListM10201valuesimpl.getSize());
                    Object[] objArr = objectListM10201valuesimpl.content;
                    int i8 = objectListM10201valuesimpl._size;
                    for (int i9 = 0; i9 < i8; i9++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i9];
                        mutableObjectList.add(new Pair(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.clear();
                    objectListEmptyObjectList = mutableObjectList;
                } else {
                    objectListEmptyObjectList = ObjectListKt.emptyObjectList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = objectListEmptyObjectList.content;
        int i10 = objectListEmptyObjectList._size;
        for (i = 0; i < i10; i++) {
            Pair pair = (Pair) objArr2[i];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasSchedulingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            androidx.collection.MutableScatterSet<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.getSize()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L14
            goto L1f
        L14:
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
            goto L1f
        L1b:
            r1 = 0
            goto L20
        L1d:
            r1 = move-exception
            goto L22
        L1f:
            r1 = 1
        L20:
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasSchedulingWork():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> getKnownCompositions() {
        List arrayList = this._knownCompositionsCache;
        if (arrayList == null) {
            List<ControlledComposition> list = this._knownCompositions;
            arrayList = list.isEmpty() ? EmptyList.INSTANCE : new ArrayList(list);
            this._knownCompositionsCache = arrayList;
        }
        return arrayList;
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, r6.e] */
    public final boolean getShouldKeepRecomposing() {
        boolean z8;
        synchronized (this.stateLock) {
            z8 = this.isClosed;
        }
        if (!z8) {
            return true;
        }
        C6831i c6831iM6376p = AbstractC6683l.m6376p((RestrictedSuspendLambda) ((C5871c1) this.effectJob).m5438D().f9198b);
        while (c6831iM6376p.hasNext()) {
            if (((InterfaceC6013w0) c6831iM6376p.next()).isActive()) {
                return true;
            }
        }
        return false;
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (AbstractC5830k.m5325b(list.get(i).getComposition(), composition)) {
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.movableContentAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (AbstractC5830k.m5325b(next.getComposition(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0143, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0148, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0154, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).getSecond() == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0167, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0169, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0173, code lost:
    
        if (r11.getSecond() != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0175, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
    
        if (r11 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0181, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0187, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        kotlin.collections.AbstractC5810y.m5291S(r3, r16.movableContentAwaitingInsert);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019e, code lost:
    
        if (r9 >= r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ab, code lost:
    
        if (((kotlin.Pair) r11).getSecond() == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ad, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b0, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b3, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> performInsertValues(java.util.List<androidx.compose.runtime.MovableContentStateReference> r17, androidx.collection.MutableScatterSet<java.lang.Object> r18) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInsertValues(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition composition, final MutableScatterSet<Object> modifiedValues) {
        Set<ControlledComposition> set;
        if (composition.isComposing() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.isNotEmpty()) {
                        composition.prepareCompose(new InterfaceC6469a() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m10077invoke();
                                return C5443s.f8405a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m10077invoke() {
                                MutableScatterSet<Object> mutableScatterSet = modifiedValues;
                                ControlledComposition controlledComposition = composition;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    return;
                                }
                                int i = 0;
                                while (true) {
                                    long j7 = jArr[i];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i - length)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((255 & j7) < 128) {
                                                controlledComposition.recordWriteOf(objArr[(i << 3) + i9]);
                                            }
                                            j7 >>= 8;
                                        }
                                        if (i8 != 8) {
                                            return;
                                        }
                                    }
                                    if (i == length) {
                                        return;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            }
            boolean zRecompose = composition.recompose();
            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            if (zRecompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    private final void processCompositionError(Throwable e, ControlledComposition failedInitialComposition, boolean recoverable) throws Throwable {
        int i = 0;
        if (!_hotReloadEnabled.get().booleanValue() || (e instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, e);
            }
            throw e;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", e);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet<>(i, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m10186clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(recoverable, e);
                if (failedInitialComposition != null) {
                    recordFailedCompositionLocked(failedInitialComposition);
                }
                deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z8, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z8 = false;
        }
        recomposer.processCompositionError(th, controlledComposition, z8);
    }

    private final InterfaceC6471c readObserverOf(final ControlledComposition composition) {
        return new InterfaceC6471c() { // from class: androidx.compose.runtime.Recomposer.readObserverOf.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10078invoke(obj);
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10078invoke(Object obj) {
                composition.recordReadOf(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(InterfaceC6474f interfaceC6474f, InterfaceC5631c<? super C5443s> interfaceC5631c) throws Throwable {
        Object objM5626F = AbstractC6014x.m5626F(this.broadcastFrameClock, new C20072(interfaceC6474f, MonotonicFrameClockKt.getMonotonicFrameClock(interfaceC5631c.getContext()), null), interfaceC5631c);
        return objM5626F == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5626F : C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            AbstractC5824e abstractC5824e = null;
            int i = 1;
            int i8 = 0;
            this.snapshotInvalidations = new MutableScatterSet<>(i8, i, abstractC5824e);
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i9 = 0; i9 < size; i9++) {
                    knownCompositions.get(i9).recordModificationsOf(setWrapIntoSet);
                    if (((State) ((C5946n0) this._state).getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new MutableScatterSet<>(i8, i, abstractC5824e);
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(setWrapIntoSet);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        removeKnownCompositionLocked(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(InterfaceC6013w0 callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (((State) ((C5946n0) this._state).getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
            if (mutableObjectList != null) {
                Object[] objArr = mutableObjectList.content;
                int i = mutableObjectList._size;
                for (int i8 = 0; i8 < i; i8++) {
                    ((CompositionRegistrationObserver) objArr[i8]).onCompositionUnregistered(this, composition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                ControlledComposition controlledComposition = (ControlledComposition) AbstractC5810y.m5300b0(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        int size = list.size();
                        while (i < size) {
                            recordFailedCompositionLocked(list.get(i));
                            i++;
                        }
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            int size2 = list.size();
            while (i < size2) {
                recordFailedCompositionLocked(list.get(i));
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        if (r5.withFrameNanos(r10, r0) != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a0 -> B:13:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, p075h6.InterfaceC5631c<? super p045d6.C5443s> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer.C20081
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer.C20081) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L63
            if (r2 == r4) goto L4b
            if (r2 != r3) goto L43
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.AbstractC5774b.m5119b(r10)
        L3d:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L71
        L43:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4b:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.AbstractC5774b.m5119b(r10)
            goto L8b
        L63:
            kotlin.AbstractC5774b.m5119b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L71:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L86
            goto La2
        L86:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8b:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3d
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, h6.c):java.lang.Object");
    }

    private final InterfaceC6471c writeObserverOf(final ControlledComposition composition, final MutableScatterSet<Object> modifiedValues) {
        return new InterfaceC6471c() { // from class: androidx.compose.runtime.Recomposer.writeObserverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10079invoke(obj);
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10079invoke(Object obj) {
                composition.recordWriteOf(obj);
                MutableScatterSet<Object> mutableScatterSet = modifiedValues;
                if (mutableScatterSet != null) {
                    mutableScatterSet.add(obj);
                }
            }
        };
    }

    @ExperimentalComposeRuntimeApi
    @NotNull
    public final CompositionObserverHandle addCompositionRegistrationObserver$runtime_release(@NotNull final CompositionRegistrationObserver observer) {
        synchronized (this.stateLock) {
            try {
                MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
                int i = 0;
                if (mutableObjectList == null) {
                    mutableObjectList = new MutableObjectList<>(i, 1, null);
                    this.registrationObservers = mutableObjectList;
                }
                mutableObjectList.add(observer);
                List<ControlledComposition> list = this._knownCompositions;
                int size = list.size();
                while (i < size) {
                    observer.onCompositionRegistered(this, list.get(i));
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.Recomposer$addCompositionRegistrationObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                CompositionRegistrationObserver compositionRegistrationObserver = observer;
                synchronized (obj) {
                    MutableObjectList mutableObjectList2 = recomposer.registrationObservers;
                    if (mutableObjectList2 != null) {
                        mutableObjectList2.remove(compositionRegistrationObserver);
                    }
                }
            }
        };
    }

    @NotNull
    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    @Nullable
    public final Object awaitIdle(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objCollect = new C5949p(getCurrentState(), new C20042(null)).collect(C5931m.f9405a, interfaceC5631c);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5443s c5443s = C5443s.f8405a;
        if (objCollect != coroutineSingletons) {
            objCollect = c5443s;
        }
        return objCollect == coroutineSingletons ? objCollect : c5443s;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (((State) ((C5946n0) this._state).getValue()).compareTo(State.Idle) >= 0) {
                ((C5946n0) this._state).m5570j(State.ShuttingDown);
            }
        }
        ((C5871c1) this.effectJob).cancel(null);
    }

    public final void close() {
        if (((C6015x0) this.effectJob).m5446N(C5443s.f8405a)) {
            synchronized (this.stateLock) {
                this.isClosed = true;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull InterfaceC6473e content) throws Throwable {
        Throwable th;
        boolean zIsComposing = composition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    composition.composeContent(content);
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                    if (!zIsComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (((State) ((C5946n0) this._state).getValue()).compareTo(State.ShuttingDown) > 0) {
                                try {
                                    if (!getKnownCompositions().contains(composition)) {
                                        addKnownCompositionLocked(composition);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                performInitialMovableContentInserts(composition);
                                try {
                                    composition.applyChanges();
                                    composition.applyLateChanges();
                                    if (zIsComposing) {
                                        return;
                                    }
                                    companion.notifyObjectsInitialized();
                                } catch (Throwable th3) {
                                    processCompositionError$default(this, th3, null, false, 6, null);
                                }
                            } catch (Throwable th4) {
                                processCompositionError(th4, composition, true);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        Throwable th8 = th;
                        try {
                            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                            throw th8;
                        } catch (Throwable th9) {
                            th = th9;
                            processCompositionError(th, composition, true);
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull InterfaceC6473e content) {
        try {
            ShouldPauseCallback andSetShouldPauseCallback = composition.getAndSetShouldPauseCallback(shouldPause);
            try {
                composeInitial$runtime_release(composition, content);
                ScatterSet<RecomposeScopeImpl> scatterSetEmptyScatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSetEmptyScatterSet == null) {
                    scatterSetEmptyScatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSetEmptyScatterSet;
            } finally {
                composition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        synchronized (this.stateLock) {
            MultiValueMap.m10184addimpl(this.movableContentRemoved, reference.getContent$runtime_release(), reference);
            if (reference.getNestedReferences$runtime_release() != null) {
                deletedMovableContent$lambda$73$recordNestedStatesOf(this, reference, reference);
            }
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCollectingParameterInformation$runtime_release */
    public boolean getCollectingParameterInformation() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCollectingSourceInformation$runtime_release */
    public boolean getCollectingSourceInformation() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @Nullable
    public Composition getComposition$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCompoundHashKey$runtime_release */
    public int getCompoundHashKey() {
        return 1000;
    }

    @NotNull
    public final InterfaceC5944m0 getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public InterfaceC5636h getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasPendingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            androidx.collection.MutableScatterSet<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L2b
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L29
            int r1 = r1.getSize()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L14
            goto L2b
        L14:
            int r1 = r2.concurrentCompositionsOutstanding     // Catch: java.lang.Throwable -> L29
            if (r1 > 0) goto L2b
            java.util.List<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionsAwaitingApply     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L27
            goto L2b
        L27:
            r1 = 0
            goto L2c
        L29:
            r1 = move-exception
            goto L2e
        L2b:
            r1 = 1
        L2c:
            monitor-exit(r0)
            return r1
        L2e:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasPendingWork():boolean");
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public InterfaceC5636h getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @NotNull
    public final InterfaceC5910f getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        InterfaceC5895f interfaceC5895fDeriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            interfaceC5895fDeriveStateLocked = deriveStateLocked();
        }
        if (interfaceC5895fDeriveStateLocked != null) {
            interfaceC5895fDeriveStateLocked.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
        InterfaceC5895f interfaceC5895fDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                interfaceC5895fDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(composition);
                interfaceC5895fDeriveStateLocked = deriveStateLocked();
            }
        }
        if (interfaceC5895fDeriveStateLocked != null) {
            interfaceC5895fDeriveStateLocked.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
        InterfaceC5895f interfaceC5895fDeriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(scope);
            interfaceC5895fDeriveStateLocked = deriveStateLocked();
        }
        if (interfaceC5895fDeriveStateLocked != null) {
            interfaceC5895fDeriveStateLocked.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
        }
    }

    @Nullable
    public final Object join(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5554j = AbstractC5914h.m5554j(getCurrentState(), new C20052(null), interfaceC5631c);
        return objM5554j == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5554j : C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    @Override // androidx.compose.runtime.CompositionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void movableContentStateReleased$runtime_release(@org.jetbrains.annotations.NotNull androidx.compose.runtime.MovableContentStateReference r18, @org.jetbrains.annotations.NotNull androidx.compose.runtime.MovableContentState r19, @org.jetbrains.annotations.NotNull androidx.compose.runtime.Applier<?> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.Object r3 = r1.stateLock
            monitor-enter(r3)
            androidx.collection.MutableScatterMap<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState> r4 = r1.movableContentStatesAvailable     // Catch: java.lang.Throwable -> L63
            r4.set(r0, r2)     // Catch: java.lang.Throwable -> L63
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r4 = r1.movableContentNestedExtractionsPending     // Catch: java.lang.Throwable -> L63
            androidx.collection.ObjectList r0 = androidx.compose.runtime.collection.MultiValueMap.m10193getimpl(r4, r0)     // Catch: java.lang.Throwable -> L63
            boolean r4 = r0.isNotEmpty()     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L70
            r4 = r20
            androidx.collection.ScatterMap r0 = r2.extractNestedStates$runtime_release(r4, r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r2 = r0.keys     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r4 = r0.values     // Catch: java.lang.Throwable -> L63
            long[] r0 = r0.metadata     // Catch: java.lang.Throwable -> L63
            int r5 = r0.length     // Catch: java.lang.Throwable -> L63
            int r5 = r5 + (-2)
            if (r5 < 0) goto L70
            r6 = 0
            r7 = r6
        L2d:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L63
            long r10 = ~r8     // Catch: java.lang.Throwable -> L63
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6b
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L63
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L47:
            if (r12 >= r10) goto L69
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L65
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L63
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L63
            androidx.compose.runtime.MovableContentState r13 = (androidx.compose.runtime.MovableContentState) r13     // Catch: java.lang.Throwable -> L63
            androidx.compose.runtime.MovableContentStateReference r14 = (androidx.compose.runtime.MovableContentStateReference) r14     // Catch: java.lang.Throwable -> L63
            androidx.collection.MutableScatterMap<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState> r15 = r1.movableContentStatesAvailable     // Catch: java.lang.Throwable -> L63
            r15.set(r14, r13)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r0 = move-exception
            goto L72
        L65:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L47
        L69:
            if (r10 != r11) goto L70
        L6b:
            if (r7 == r5) goto L70
            int r7 = r7 + 1
            goto L2d
        L70:
            monitor-exit(r3)
            return
        L72:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.movableContentStateReleased$runtime_release(androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState, androidx.compose.runtime.Applier):void");
    }

    @Override // androidx.compose.runtime.CompositionContext
    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.movableContentStatesAvailable.remove(reference);
        }
        return movableContentStateRemove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull ScatterSet<RecomposeScopeImpl> invalidScopes) {
        try {
            recordComposerModifications();
            composition.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(invalidScopes));
            ShouldPauseCallback andSetShouldPauseCallback = composition.getAndSetShouldPauseCallback(shouldPause);
            try {
                ControlledComposition controlledCompositionPerformRecompose = performRecompose(composition, null);
                if (controlledCompositionPerformRecompose != null) {
                    performInitialMovableContentInserts(composition);
                    controlledCompositionPerformRecompose.applyChanges();
                    controlledCompositionPerformRecompose.applyLateChanges();
                }
                ScatterSet<RecomposeScopeImpl> scatterSetEmptyScatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSetEmptyScatterSet == null) {
                    scatterSetEmptyScatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSetEmptyScatterSet;
            } finally {
                composition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSetMutableScatterSetOf = this.pausedScopes.get();
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.pausedScopes.set(mutableScatterSetMutableScatterSetOf);
        }
        mutableScatterSetMutableScatterSetOf.add(scope);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(@NotNull ControlledComposition composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        InterfaceC5895f interfaceC5895fDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                interfaceC5895fDeriveStateLocked = deriveStateLocked();
            } else {
                interfaceC5895fDeriveStateLocked = null;
            }
        }
        if (interfaceC5895fDeriveStateLocked != null) {
            interfaceC5895fDeriveStateLocked.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
        }
    }

    @Nullable
    public final Object runRecomposeAndApplyChanges(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) throws Throwable {
        Object objRecompositionRunner = recompositionRunner(new C20102(null), interfaceC5631c);
        return objRecompositionRunner == CoroutineSingletons.COROUTINE_SUSPENDED ? objRecompositionRunner : C5443s.f8405a;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull InterfaceC5636h interfaceC5636h, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) throws Throwable {
        Object objRecompositionRunner = recompositionRunner(new C20112(interfaceC5636h, this, null), interfaceC5631c);
        return objRecompositionRunner == CoroutineSingletons.COROUTINE_SUSPENDED ? objRecompositionRunner : C5443s.f8405a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
        }
    }

    private final void recordComposerModifications(InterfaceC6471c onEachInvalidComposition) {
        MutableScatterSet mutableScatterSet;
        int i;
        synchronized (this.stateLock) {
            mutableScatterSet = this.snapshotInvalidations;
            i = 0;
            if (mutableScatterSet.isNotEmpty()) {
                this.snapshotInvalidations = new MutableScatterSet(i, 1, null);
            }
        }
        Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
        if (!setWrapIntoSet.isEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((ControlledComposition) knownCompositions.get(i8)).recordModificationsOf(setWrapIntoSet);
            }
        }
        MutableVector mutableVector = this.compositionInvalidations;
        Object[] objArr = mutableVector.content;
        int size2 = mutableVector.getSize();
        while (i < size2) {
            onEachInvalidComposition.invoke(objArr[i]);
            i++;
        }
        this.compositionInvalidations.clear();
        synchronized (this.stateLock) {
            if (deriveStateLocked() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
            }
        }
    }
}
