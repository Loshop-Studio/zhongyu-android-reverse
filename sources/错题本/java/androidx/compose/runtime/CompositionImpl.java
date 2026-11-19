package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.compose.ComposeNavigator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\u00020\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u00020\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\"\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00152\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\"\u0010&\u001a\u00020\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010(\u001a\u00020\u000fH\u0000¢\u0006\u0004\b'\u0010\u001aJ\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u001aJ\u001d\u0010-\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020/2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u000f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u000f2\u0006\u00105\u001a\u00020+H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000f2\u0006\u00105\u001a\u00020+H\u0016¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020/H\u0016¢\u0006\u0004\b9\u0010:J+\u0010?\u001a\u00020\u000f2\u001a\u0010>\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020=\u0012\u0006\u0012\u0004\u0018\u00010=0<0;H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010\u001aJ\u000f\u0010F\u001a\u00020\u000fH\u0016¢\u0006\u0004\bF\u0010\u001aJ\u000f\u0010G\u001a\u00020\u000fH\u0016¢\u0006\u0004\bG\u0010\u001aJ\u000f\u0010H\u001a\u00020\u000fH\u0016¢\u0006\u0004\bH\u0010\u001aJ\u000f\u0010I\u001a\u00020\u000fH\u0016¢\u0006\u0004\bI\u0010\u001aJ\u000f\u0010J\u001a\u00020\u000fH\u0016¢\u0006\u0004\bJ\u0010\u001aJ5\u0010N\u001a\u00028\u0000\"\u0004\b\u0000\u0010K2\b\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010M\u001a\u00020\"2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\bN\u0010OJ\u001b\u0010R\u001a\u0004\u0018\u00010P2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bR\u0010SJ!\u0010X\u001a\u00020W2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bZ\u0010[J%\u0010^\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\\2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000]H\u0016¢\u0006\u0004\b^\u0010_J\u001f\u0010b\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020+2\u0006\u0010U\u001a\u00020TH\u0000¢\u0006\u0004\b`\u0010aJ\u001b\u0010f\u001a\u00020\u000f2\n\u0010B\u001a\u0006\u0012\u0002\b\u00030cH\u0000¢\u0006\u0004\bd\u0010eJ\u000f\u0010g\u001a\u00020\u000fH\u0016¢\u0006\u0004\bg\u0010\u001aJ\u000f\u0010j\u001a\u00020\"H\u0000¢\u0006\u0004\bh\u0010iJ\"\u0010k\u001a\u00020\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0004\bk\u0010\u0013J\u000f\u0010l\u001a\u00020\u000fH\u0002¢\u0006\u0004\bl\u0010\u001aJ\u000f\u0010m\u001a\u00020\u000fH\u0002¢\u0006\u0004\bm\u0010\u001aJ\u000f\u0010n\u001a\u00020\u000fH\u0002¢\u0006\u0004\bn\u0010\u001aJ\u001f\u0010p\u001a\u00020\u000f2\u0006\u00105\u001a\u00020+2\u0006\u0010o\u001a\u00020/H\u0002¢\u0006\u0004\bp\u0010qJ%\u0010p\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010o\u001a\u00020/H\u0002¢\u0006\u0004\bp\u0010rJ\u000f\u0010s\u001a\u00020\u000fH\u0002¢\u0006\u0004\bs\u0010\u001aJ\u0017\u0010t\u001a\u00020\u000f2\u0006\u00105\u001a\u00020+H\u0002¢\u0006\u0004\bt\u00107J\u0017\u0010w\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020uH\u0002¢\u0006\u0004\bw\u0010xJE\u0010}\u001a\u00028\u0000\"\u0004\b\u0000\u0010\\2-\u00102\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020+0z¢\u0006\f\b{\u0012\b\b|\u0012\u0004\b\b(v\u0012\u0004\u0012\u00028\u00000yH\u0082\b¢\u0006\u0004\b}\u0010~J%\u0010\u007f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\\2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0082\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001J$\u0010\u0081\u0001\u001a\u00020/2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J.\u0010\u0085\u0001\u001a\u00020W2\u0006\u0010U\u001a\u00020T2\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\b\u0010V\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J$\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020+0zH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001c\u0010\u008c\u0001\u001a\u00020\u000f2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J'\u0010\u008e\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\\2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0082\b¢\u0006\u0006\b\u008e\u0001\u0010\u0080\u0001J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0005\b\u001d\u0010\u008f\u0001R\u001a\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u000f\n\u0005\b\u0007\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0093\u0001R-\u0010\u0096\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010+0\u0094\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u00010+`\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u0098\u0001\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u0012\u0005\b\u009e\u0001\u0010\u001aR'\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0000X\u0080\u0004¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u009f\u0001\u0012\u0005\b¢\u0001\u0010\u001a\u001a\u0006\b \u0001\u0010¡\u0001R)\u0010£\u0001\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020T0z8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020T0¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020T0¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010§\u0001R-\u0010©\u0001\u001a\u0012\u0012\u0004\u0012\u00020+\u0012\b\u0012\u0006\u0012\u0002\b\u00030c0z8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b©\u0001\u0010¤\u0001R\u0015\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010ª\u0001R\u0017\u0010«\u0001\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010ª\u0001R)\u0010¬\u0001\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020T0z8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b¬\u0001\u0010¤\u0001R+\u0010\u00ad\u0001\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020+0z8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¤\u0001R/\u0010®\u0001\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0006\b®\u0001\u0010¯\u0001\u0012\u0005\b³\u0001\u0010\u001a\u001a\u0005\b°\u0001\u0010:\"\u0006\b±\u0001\u0010²\u0001R\u0019\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010´\u0001R\u001c\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010º\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R \u0010½\u0001\u001a\u00030¼\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Ä\u0001\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001b\u0010Æ\u0001\u001a\u00020/8\u0006¢\u0006\u000f\n\u0006\bÆ\u0001\u0010¯\u0001\u001a\u0005\bÆ\u0001\u0010:R\u0019\u0010Ç\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010¯\u0001R3\u0010È\u0001\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0005\bÌ\u0001\u0010\u0013R\u001d\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020+0*8AX\u0080\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001d\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020+0*8AX\u0080\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Î\u0001R\u001d\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020T0;8AX\u0080\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0013\u0010\u000b\u001a\u00020\n8F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0016\u0010×\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010:R\u0016\u0010Ø\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010:R\u0016\u0010Ú\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010:R\u0016\u0010Ü\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010:R\u0016\u0010Þ\u0001\u001a\u00020/8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010:\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006ß\u0001"}, m5110d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lh6/h;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lh6/h;)V", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lr6/e;)V", "setContentWithReuse", "Landroidx/compose/runtime/PausedComposition;", "setPausableContent", "(Lr6/e;)Landroidx/compose/runtime/PausedComposition;", "setPausableContentWithReuse", "pausedCompositionFinished$runtime_release", "()V", "pausedCompositionFinished", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "(Landroidx/compose/runtime/tooling/CompositionObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "", "key", "invalidateGroupsWithKey", "(I)V", "composeContent", "updateMovingInvalidations$runtime_release", "updateMovingInvalidations", "dispose", "", "", "values", "recordModificationsOf", "(Ljava/util/Set;)V", "", "observesAnyOf", "(Ljava/util/Set;)Z", "block", "prepareCompose", "(Lr6/a;)V", "value", "recordReadOf", "(Ljava/lang/Object;)V", "recordWriteOf", "recompose", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "applyChanges", "applyLateChanges", "changesApplied", "abandonChanges", "invalidateAll", "verifyConsistent", "R", TypedValues.TransitionType.S_TO, "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILr6/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "getAndSetShouldPauseCallback", "(Landroidx/compose/runtime/ShouldPauseCallback;)Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionService", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "deactivate", "composerStacksSizes$runtime_release", "()I", "composerStacksSizes", "composeInitial", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "drainPendingModificationsOutOfBandLocked", "forgetConditionalScopes", "addPendingInvalidationsLocked", "(Ljava/lang/Object;Z)V", "(Ljava/util/Set;Z)V", "cleanUpDerivedStateObservations", "invalidateScopeOfLocked", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "applyChangesInLocked", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/collection/ScopeMap;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "guardInvalidationsLocked", "(Lr6/c;)Ljava/lang/Object;", "guardChanges", "(Lr6/a;)Ljava/lang/Object;", "tryImminentInvalidation", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", "anchor", "invalidateChecked", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "takeInvalidations-afanTW4", "()Landroidx/collection/MutableScatterMap;", "takeInvalidations", "Landroidx/compose/runtime/SlotTable;", "slotTable", "validateRecomposeScopeAnchors", "(Landroidx/compose/runtime/SlotTable;)V", "trackAbandonedValues", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/CompositionContext;", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "lock", "Ljava/lang/Object;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "getAbandonSet$annotations", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "observations", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "invalidatedScopes", "Landroidx/collection/MutableScatterSet;", "conditionallyInvalidatedScopes", "derivedStates", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observationsProcessed", "invalidations", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/PausedCompositionImpl;", "pendingPausedComposition", "Landroidx/compose/runtime/PausedCompositionImpl;", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "_recomposeContext", "Lh6/h;", "isRoot", "disposed", ComposeNavigator.NAME, "Lr6/e;", "getComposable", "()Lr6/e;", "setComposable", "getObservedObjects$runtime_release", "()Ljava/util/Set;", "observedObjects", "getDerivedStateDependencies$runtime_release", "derivedStateDependencies", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionalScopes", "getRecomposeContext", "()Lh6/h;", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "getAreChildrenComposing", "areChildrenComposing", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 7 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 16 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 17 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 18 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 19 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1354:1\n1110#1,2:1407\n1294#1,3:1409\n1100#1,6:1414\n1298#1,4:1421\n1112#1,4:1425\n1100#1,6:1431\n1110#1,2:1934\n1294#1,3:1936\n1100#1,6:1939\n1298#1,4:1946\n1112#1,4:1950\n1110#1,2:1969\n1294#1,3:1971\n1298#1,4:1975\n1112#1,4:1979\n1110#1,2:2075\n1294#1,3:2077\n1298#1,4:2081\n1112#1,4:2085\n1110#1,2:2091\n1294#1,3:2093\n1298#1,4:2097\n1112#1,4:2101\n1110#1,2:2107\n1294#1,3:2109\n1298#1,4:2113\n1112#1,4:2117\n1294#1,3:2121\n1298#1,4:2125\n27#2:1355\n33#2,2:1357\n33#2,2:1394\n33#2,2:1396\n33#2,2:1412\n33#2,2:1429\n33#2,2:1437\n33#2,2:1452\n33#2,2:1454\n33#2,2:1895\n33#2,2:1932\n33#2,2:2073\n33#2,2:2089\n33#2,2:2105\n33#2,2:2129\n33#2,2:2133\n33#2,2:2135\n33#2,2:2137\n33#2,2:2202\n1#3:1356\n1#3:1420\n1#3:1448\n1#3:1945\n1#3:1974\n1#3:1987\n1#3:1998\n1#3:2080\n1#3:2096\n1#3:2112\n1#3:2124\n1#3:2189\n1#3:2211\n48#4,5:1359\n48#4,5:1364\n48#4,5:1369\n48#4,5:1374\n48#4,5:1379\n48#4,5:1384\n48#4,5:1389\n48#4,5:1439\n48#4,5:2196\n90#5,2:1398\n33#5,6:1400\n92#5:1406\n105#5,2:1954\n33#5,6:1956\n107#5:1962\n33#5,4:2192\n38#5:2201\n174#6,4:1444\n179#6,3:1449\n174#6,4:1983\n179#6,3:1988\n174#6,4:1994\n179#6,3:1999\n174#6,4:2207\n179#6,3:2212\n41#7,3:1456\n46#7:1484\n48#7:1487\n41#7,3:1523\n46#7:1585\n48#7:1613\n231#8,3:1459\n200#8,7:1462\n211#8,3:1470\n214#8,9:1474\n234#8:1483\n231#8,3:1494\n200#8,7:1497\n211#8,3:1505\n214#8,9:1509\n234#8:1518\n231#8,3:1526\n200#8,7:1529\n211#8,3:1537\n214#8,2:1541\n231#8,3:1549\n200#8,7:1552\n211#8,3:1560\n214#8,9:1564\n234#8:1573\n217#8,6:1578\n234#8:1584\n231#8,3:1587\n200#8,7:1590\n211#8,3:1598\n214#8,9:1602\n234#8:1611\n200#8,7:1636\n211#8,3:1644\n214#8,2:1648\n217#8,6:1654\n200#8,7:1700\n211#8,3:1708\n214#8,2:1712\n217#8,6:1718\n200#8,16:1764\n217#8,6:1784\n200#8,7:1810\n211#8,3:1818\n214#8,2:1822\n217#8,6:1828\n231#8,3:1866\n200#8,7:1869\n211#8,3:1877\n214#8,9:1881\n234#8:1890\n231#8,3:1903\n200#8,7:1906\n211#8,3:1914\n214#8,9:1918\n234#8:1927\n200#8,16:2028\n217#8,6:2048\n231#8,3:2146\n200#8,7:2149\n211#8,3:2157\n214#8,9:2161\n234#8:2170\n1399#9:1469\n1270#9:1473\n1399#9:1504\n1270#9:1508\n1399#9:1536\n1270#9:1540\n1399#9:1559\n1270#9:1563\n1399#9:1597\n1270#9:1601\n1399#9:1622\n1270#9:1626\n1399#9:1643\n1270#9:1647\n1399#9:1686\n1270#9:1690\n1399#9:1707\n1270#9:1711\n1399#9:1750\n1270#9:1754\n1399#9:1817\n1270#9:1821\n1399#9:1845\n1270#9:1849\n1399#9:1876\n1270#9:1880\n1399#9:1913\n1270#9:1917\n1399#9:2014\n1270#9:2018\n1399#9:2156\n1270#9:2160\n1855#10,2:1485\n1855#10:1586\n1856#10:1612\n67#11,6:1488\n75#11,4:1519\n67#11,6:1543\n75#11,4:1574\n123#11:1614\n124#11,4:1630\n128#11,6:1661\n135#11:1677\n123#11:1678\n124#11,4:1694\n128#11,6:1725\n135#11:1741\n123#11:1742\n124#11,4:1758\n128#11,6:1791\n135#11:1807\n67#11,6:1860\n75#11,4:1891\n67#11,6:1897\n75#11,4:1928\n123#11:2006\n124#11,4:2022\n128#11,6:2055\n135#11:2071\n81#11:2139\n67#11,6:2140\n75#11,8:2171\n842#12:1615\n844#12:1629\n845#12,3:1667\n848#12:1676\n842#12:1679\n844#12:1693\n845#12,3:1731\n848#12:1740\n842#12:1743\n844#12:1757\n845#12,3:1797\n848#12:1806\n842#12:2007\n844#12:2021\n845#12,3:2061\n848#12:2070\n329#13,6:1616\n339#13,3:1623\n342#13,2:1627\n345#13,6:1670\n329#13,6:1680\n339#13,3:1687\n342#13,2:1691\n345#13,6:1734\n329#13,6:1744\n339#13,3:1751\n342#13,2:1755\n345#13,6:1800\n329#13,6:2008\n339#13,3:2015\n342#13,2:2019\n345#13,6:2064\n809#14,2:1634\n812#14,4:1650\n816#14:1660\n809#14,2:1698\n812#14,4:1714\n816#14:1724\n809#14,2:1762\n812#14,4:1780\n816#14:1790\n809#14,2:1808\n812#14,4:1824\n816#14:1834\n809#14,2:2026\n812#14,4:2044\n816#14:2054\n54#15:1835\n54#15:1852\n403#16,3:1836\n367#16,6:1839\n377#16,3:1846\n380#16,2:1850\n383#16,6:1853\n406#16:1859\n4665#17:1963\n4643#17,5:1964\n45#18,3:1991\n49#18:2002\n45#18,3:2003\n49#18:2072\n45#18,3:2204\n49#18:2215\n13309#19,2:2131\n11383#19,9:2179\n13309#19:2188\n13310#19:2190\n11392#19:2191\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n780#1:1407,2\n780#1:1409,3\n783#1:1414,6\n780#1:1421,4\n780#1:1425,4\n802#1:1431,6\n994#1:1934,2\n994#1:1936,3\n995#1:1939,6\n994#1:1946,4\n994#1:1950,4\n1015#1:1969,2\n1015#1:1971,3\n1015#1:1975,4\n1015#1:1979,4\n1066#1:2075,2\n1066#1:2077,3\n1066#1:2081,4\n1066#1:2085,4\n1075#1:2091,2\n1075#1:2093,3\n1075#1:2097,4\n1075#1:2101,4\n1085#1:2107,2\n1085#1:2109,3\n1085#1:2113,4\n1085#1:2117,4\n1111#1:2121,3\n1111#1:2125,4\n452#1:1355\n610#1:1357,2\n682#1:1394,2\n699#1:1396,2\n781#1:1412,2\n800#1:1429,2\n809#1:1437,2\n854#1:1452,2\n877#1:1454,2\n983#1:1895,2\n992#1:1932,2\n1065#1:2073,2\n1074#1:2089,2\n1084#1:2105,2\n1128#1:2129,2\n1132#1:2133,2\n1175#1:2135,2\n1203#1:2137,2\n1320#1:2202,2\n780#1:1420\n840#1:1448\n994#1:1945\n1015#1:1974\n1021#1:1987\n1035#1:1998\n1066#1:2080\n1075#1:2096\n1085#1:2112\n1111#1:2124\n1281#1:2189\n1327#1:2211\n613#1:1359,5\n620#1:1364,5\n631#1:1369,5\n632#1:1374,5\n651#1:1379,5\n652#1:1384,5\n675#1:1389,5\n810#1:1439,5\n1284#1:2196,5\n706#1:1398,2\n706#1:1400,6\n706#1:1406\n1014#1:1954,2\n1014#1:1956,6\n1014#1:1962\n1282#1:2192,4\n1282#1:2201\n840#1:1444,4\n840#1:1449,3\n1021#1:1983,4\n1021#1:1988,3\n1035#1:1994,4\n1035#1:1999,3\n1327#1:2207,4\n1327#1:2212,3\n885#1:1456,3\n885#1:1484\n885#1:1487\n909#1:1523,3\n909#1:1585\n909#1:1613\n885#1:1459,3\n885#1:1462,7\n885#1:1470,3\n885#1:1474,9\n885#1:1483\n894#1:1494,3\n894#1:1497,7\n894#1:1505,3\n894#1:1509,9\n894#1:1518\n909#1:1526,3\n909#1:1529,7\n909#1:1537,3\n909#1:1541,2\n914#1:1549,3\n914#1:1552,7\n914#1:1560,3\n914#1:1564,9\n914#1:1573\n909#1:1578,6\n909#1:1584\n914#1:1587,3\n914#1:1590,7\n914#1:1598,3\n914#1:1602,9\n914#1:1611\n923#1:1636,7\n923#1:1644,3\n923#1:1648,2\n923#1:1654,6\n929#1:1700,7\n929#1:1708,3\n929#1:1712,2\n929#1:1718,6\n936#1:1764,16\n936#1:1784,6\n938#1:1810,7\n938#1:1818,3\n938#1:1822,2\n938#1:1828,6\n974#1:1866,3\n974#1:1869,7\n974#1:1877,3\n974#1:1881,9\n974#1:1890\n988#1:1903,3\n988#1:1906,7\n988#1:1914,3\n988#1:1918,9\n988#1:1927\n1050#1:2028,16\n1050#1:2048,6\n1239#1:2146,3\n1239#1:2149,7\n1239#1:2157,3\n1239#1:2161,9\n1239#1:2170\n885#1:1469\n885#1:1473\n894#1:1504\n894#1:1508\n909#1:1536\n909#1:1540\n914#1:1559\n914#1:1563\n914#1:1597\n914#1:1601\n923#1:1622\n923#1:1626\n923#1:1643\n923#1:1647\n929#1:1686\n929#1:1690\n929#1:1707\n929#1:1711\n936#1:1750\n936#1:1754\n938#1:1817\n938#1:1821\n959#1:1845\n959#1:1849\n974#1:1876\n974#1:1880\n988#1:1913\n988#1:1917\n1050#1:2014\n1050#1:2018\n1239#1:2156\n1239#1:2160\n885#1:1485,2\n909#1:1586\n909#1:1612\n894#1:1488,6\n894#1:1519,4\n914#1:1543,6\n914#1:1574,4\n923#1:1614\n923#1:1630,4\n923#1:1661,6\n923#1:1677\n929#1:1678\n929#1:1694,4\n929#1:1725,6\n929#1:1741\n936#1:1742\n936#1:1758,4\n936#1:1791,6\n936#1:1807\n974#1:1860,6\n974#1:1891,4\n988#1:1897,6\n988#1:1928,4\n1050#1:2006\n1050#1:2022,4\n1050#1:2055,6\n1050#1:2071\n1239#1:2139\n1239#1:2140,6\n1239#1:2171,8\n923#1:1615\n923#1:1629\n923#1:1667,3\n923#1:1676\n929#1:1679\n929#1:1693\n929#1:1731,3\n929#1:1740\n936#1:1743\n936#1:1757\n936#1:1797,3\n936#1:1806\n1050#1:2007\n1050#1:2021\n1050#1:2061,3\n1050#1:2070\n923#1:1616,6\n923#1:1623,3\n923#1:1627,2\n923#1:1670,6\n929#1:1680,6\n929#1:1687,3\n929#1:1691,2\n929#1:1734,6\n936#1:1744,6\n936#1:1751,3\n936#1:1755,2\n936#1:1800,6\n1050#1:2008,6\n1050#1:2015,3\n1050#1:2019,2\n1050#1:2064,6\n923#1:1634,2\n923#1:1650,4\n923#1:1660\n929#1:1698,2\n929#1:1714,4\n929#1:1724\n936#1:1762,2\n936#1:1780,4\n936#1:1790\n938#1:1808,2\n938#1:1824,4\n938#1:1834\n1050#1:2026,2\n1050#1:2044,4\n1050#1:2054\n950#1:1835\n961#1:1852\n959#1:1836,3\n959#1:1839,6\n959#1:1846,3\n959#1:1850,2\n959#1:1853,6\n959#1:1859\n1014#1:1963\n1014#1:1964,5\n1029#1:1991,3\n1029#1:2002\n1048#1:2003,3\n1048#1:2072\n1323#1:2204,3\n1323#1:2215\n1128#1:2131,2\n1281#1:2179,9\n1281#1:2188\n1281#1:2190\n1281#1:2191\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition {
    public static final int $stable = 8;

    @Nullable
    private final InterfaceC5636h _recomposeContext;

    @NotNull
    private final Set<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final ChangeList changes;

    @NotNull
    private InterfaceC6473e composable;

    @NotNull
    private final ComposerImpl composer;

    @NotNull
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    @NotNull
    private final MutableScatterMap<Object, Object> derivedStates;
    private boolean disposed;

    @NotNull
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;

    @Nullable
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;

    @NotNull
    private MutableScatterMap<Object, Object> invalidations;
    private final boolean isRoot;

    @NotNull
    private final ChangeList lateChanges;

    @NotNull
    private final Object lock;

    @NotNull
    private final MutableScatterMap<Object, Object> observations;

    @NotNull
    private final MutableScatterMap<Object, Object> observationsProcessed;

    @NotNull
    private final CompositionObserverHolder observerHolder;

    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @NotNull
    private final AtomicReference<Object> pendingModifications;

    @Nullable
    private PausedCompositionImpl pendingPausedComposition;

    @Nullable
    private ShouldPauseCallback shouldPause;

    @NotNull
    private final SlotTable slotTable;

    public CompositionImpl(@NotNull CompositionContext compositionContext, @NotNull Applier<?> applier, @Nullable InterfaceC5636h interfaceC5636h) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<RememberObserver> setAsMutableSet = new MutableScatterSet(0, 1, null).asMutableSet();
        this.abandonSet = setAsMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.m10209constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.derivedStates = ScopeMap.m10209constructorimpl$default(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.m10209constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m10209constructorimpl$default(null, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, setAsMutableSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = interfaceC5636h;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m10036getLambda1$runtime_release();
    }

    private final void addPendingInvalidationsLocked(Object value, boolean forgetConditionalScopes) {
        Object obj = this.observations.get(value);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
            if (ScopeMap.m10216removeimpl(this.observationsProcessed, value, recomposeScopeImpl) || recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IGNORED) {
                return;
            }
            if (!recomposeScopeImpl.isConditional() || forgetConditionalScopes) {
                this.invalidatedScopes.add(recomposeScopeImpl);
                return;
            } else {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                return;
            }
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
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
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i9];
                        if (!ScopeMap.m10216removeimpl(this.observationsProcessed, value, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(value) != InvalidationResult.IGNORED) {
                            if (!recomposeScopeImpl2.isConditional() || forgetConditionalScopes) {
                                this.invalidatedScopes.add(recomposeScopeImpl2);
                            } else {
                                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                            }
                        }
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

    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList):void");
    }

    private final void cleanUpDerivedStateObservations() {
        char c;
        long j7;
        long j8;
        long j9;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i;
        char c9;
        long j11;
        long j12;
        int i8;
        boolean zIsEmpty;
        long[] jArr3;
        int i9;
        int i10;
        MutableScatterMap<Object, Object> mutableScatterMap = this.derivedStates;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        char c10 = 7;
        long j13 = -9187201950435737472L;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            long j14 = 128;
            while (true) {
                long j15 = jArr4[i12];
                j8 = 255;
                if ((((~j15) << c10) & j15 & j13) != j13) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j15 & 255) < j14) {
                            c9 = c10;
                            int i15 = (i12 << 3) + i14;
                            j11 = j13;
                            Object obj = mutableScatterMap.keys[i15];
                            Object obj2 = mutableScatterMap.values[i15];
                            if (obj2 instanceof MutableScatterSet) {
                                AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr5 = mutableScatterSet.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j12 = j14;
                                    int i16 = 0;
                                    int i17 = i11;
                                    while (true) {
                                        int i18 = length2;
                                        long j16 = jArr5[i16];
                                        j10 = j15;
                                        if ((((~j16) << c9) & j16 & j11) != j11) {
                                            int i19 = 8 - ((~(i16 - i18)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j16 & 255) < j12) {
                                                    jArr3 = jArr4;
                                                    int i21 = (i16 << 3) + i20;
                                                    i9 = i20;
                                                    i10 = i14;
                                                    if (!ScopeMap.m10210containsimpl(this.observations, (DerivedState) objArr[i21])) {
                                                        mutableScatterSet.removeElementAt(i21);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i9 = i20;
                                                    i10 = i14;
                                                }
                                                j16 >>= i17;
                                                i20 = i9 + 1;
                                                i14 = i10;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i = i14;
                                            if (i19 != i17) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i = i14;
                                        }
                                        length2 = i18;
                                        if (i16 == length2) {
                                            break;
                                        }
                                        i16++;
                                        j15 = j10;
                                        i14 = i;
                                        jArr4 = jArr2;
                                        i17 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j10 = j15;
                                    i = i14;
                                    j12 = j14;
                                }
                                zIsEmpty = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr4;
                                j10 = j15;
                                i = i14;
                                j12 = j14;
                                AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zIsEmpty = !ScopeMap.m10210containsimpl(this.observations, (DerivedState) obj2);
                            }
                            if (zIsEmpty) {
                                mutableScatterMap.removeValueAt(i15);
                            }
                            i8 = 8;
                        } else {
                            jArr2 = jArr4;
                            j10 = j15;
                            i = i14;
                            c9 = c10;
                            j11 = j13;
                            j12 = j14;
                            i8 = i11;
                        }
                        j15 = j10 >> i8;
                        i14 = i + 1;
                        i11 = i8;
                        c10 = c9;
                        j13 = j11;
                        j14 = j12;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c = c10;
                    j7 = j13;
                    j9 = j14;
                    if (i13 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c = c10;
                    j7 = j13;
                    j9 = j14;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                c10 = c;
                j13 = j7;
                j14 = j9;
                jArr4 = jArr;
                i11 = 8;
            }
        } else {
            c = 7;
            j7 = -9187201950435737472L;
            j8 = 255;
            j9 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = mutableScatterSet2.elements;
        long[] jArr6 = mutableScatterSet2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i22 = 0;
        while (true) {
            long j17 = jArr6[i22];
            if ((((~j17) << c) & j17 & j7) != j7) {
                int i23 = 8 - ((~(i22 - length3)) >>> 31);
                for (int i24 = 0; i24 < i23; i24++) {
                    if ((j17 & j8) < j9) {
                        int i25 = (i22 << 3) + i24;
                        if (!((RecomposeScopeImpl) objArr2[i25]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i25);
                        }
                    }
                    j17 >>= 8;
                }
                if (i23 != 8) {
                    return;
                }
            }
            if (i22 == length3) {
                return;
            } else {
                i22++;
            }
        }
    }

    private final void composeInitial(InterfaceC6473e content) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (andSet.equals(CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (AbstractC5830k.m5325b(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object andSet = this.pendingModifications.getAndSet(EmptySet.INSTANCE);
        if (AbstractC5830k.m5325b(andSet, CompositionKt.PendingApplyNoModifications) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    private final <T> T guardChanges(InterfaceC6469a block) throws Exception {
        try {
            return (T) block.invoke();
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            }
        }
    }

    private final <T> T guardInvalidationsLocked(InterfaceC6471c block) throws Exception {
        MutableScatterMap<Object, Object> mutableScatterMapM10046takeInvalidationsafanTW4 = m10046takeInvalidationsafanTW4();
        try {
            return (T) block.invoke(ScopeMap.m10206boximpl(mutableScatterMapM10046takeInvalidationsafanTW4));
        } catch (Exception e) {
            this.invalidations = mutableScatterMapM10046takeInvalidationsafanTW4;
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[Catch: all -> 0x001e, EDGE_INSN: B:66:0x00ac->B:51:0x00ac BREAK  A[LOOP:0: B:33:0x0063->B:47:0x00a4], EDGE_INSN: B:67:0x00ac->B:51:0x00ac BREAK  A[LOOP:0: B:33:0x0063->B:47:0x00a4], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0033, B:23:0x003e, B:25:0x0042, B:26:0x004b, B:28:0x0053, B:30:0x0057, B:33:0x0063, B:35:0x0073, B:37:0x007f, B:39:0x0089, B:43:0x0098, B:47:0x00a4, B:48:0x00a7, B:51:0x00ac), top: B:64:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.InvalidationResult invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl r21, androidx.compose.runtime.Anchor r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    private final void invalidateScopeOfLocked(Object value) {
        Object obj = this.observations.get(value);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
            if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                ScopeMap.m10203addimpl(this.observationsProcessed, value, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
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
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i9];
                        if (recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                            ScopeMap.m10203addimpl(this.observationsProcessed, value, recomposeScopeImpl2);
                        }
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

    private final CompositionObserver observer() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder$runtime_release = this.parent.getObserverHolder();
        CompositionObserver observer = observerHolder$runtime_release != null ? observerHolder$runtime_release.getObserver() : null;
        if (!AbstractC5830k.m5325b(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
        }
        return observer;
    }

    /* renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap<Object, Object> m10046takeInvalidationsafanTW4() {
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.m10209constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private final <T> T trackAbandonedValues(InterfaceC6469a block) {
        try {
            return (T) block.invoke();
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th;
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance);
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                PreconditionsKt.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + AbstractC5802q.m5196W(slotTable.getSlots(), recomposeScopeImpl2));
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull InterfaceC6473e content) {
        MutableScatterMap<Object, Object> mutableScatterMapM10046takeInvalidationsafanTW4;
        try {
            synchronized (this.lock) {
                try {
                    drainPendingModificationsForCompositionLocked();
                    mutableScatterMapM10046takeInvalidationsafanTW4 = m10046takeInvalidationsafanTW4();
                    CompositionObserver compositionObserverObserver = observer();
                    if (compositionObserverObserver != null) {
                        Map<RecomposeScope, ? extends Set<? extends Object>> mapM10205asMapimpl = ScopeMap.m10205asMapimpl(mutableScatterMapM10046takeInvalidationsafanTW4);
                        AbstractC5830k.m5328e(mapM10205asMapimpl, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");
                        compositionObserverObserver.onBeginComposition(this, mapM10205asMapimpl);
                    }
                    this.composer.m10041composeContentZbOJvo$runtime_release(mutableScatterMapM10046takeInvalidationsafanTW4, content, this.shouldPause);
                    if (compositionObserverObserver != null) {
                        compositionObserverObserver.onEndComposition(this);
                    }
                } catch (Exception e) {
                    this.invalidations = mutableScatterMapM10046takeInvalidationsafanTW4;
                    throw e;
                } finally {
                }
            }
        } finally {
        }
    }

    public final int composerStacksSizes$runtime_release() {
        return this.composer.stacksSize$runtime_release();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            try {
                boolean z8 = this.slotTable.getGroupsSize() > 0;
                if (z8 || !this.abandonSet.isEmpty()) {
                    Trace trace = Trace.INSTANCE;
                    Object objBeginSection = trace.beginSection("Compose:deactivate");
                    try {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z8) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.deactivateCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                                slotWriterOpenWriter.close(true);
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                        trace.endSection(objBeginSection);
                    } catch (Throwable th2) {
                        Trace.INSTANCE.endSection(objBeginSection);
                        throw th2;
                    }
                }
                ScopeMap.m10207clearimpl(this.observations);
                ScopeMap.m10207clearimpl(this.derivedStates);
                ScopeMap.m10207clearimpl(this.invalidations);
                this.changes.clear();
                this.lateChanges.clear();
                this.composer.deactivate$runtime_release();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@Nullable ControlledComposition to, int groupIndex, @NotNull InterfaceC6469a block) {
        if (to == null || to.equals(this) || groupIndex < 0) {
            return (R) block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return (R) block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.m10037getLambda2$runtime_release();
                    ChangeList deferredChanges$runtime_release = this.composer.getDeferredChanges();
                    if (deferredChanges$runtime_release != null) {
                        applyChangesInLocked(deferredChanges$runtime_release);
                    }
                    boolean z8 = this.slotTable.getGroupsSize() > 0;
                    if (z8 || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z8) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                                slotWriterOpenWriter.close(true);
                                this.applier.clear();
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    }
                    this.composer.dispose$runtime_release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState state) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = state.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            slotWriterOpenWriter.close(true);
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    @Nullable
    public ShouldPauseCallback getAndSetShouldPauseCallback(@Nullable ShouldPauseCallback shouldPause) {
        ShouldPauseCallback shouldPauseCallback = this.shouldPause;
        this.shouldPause = shouldPause;
        return shouldPauseCallback;
    }

    @NotNull
    public final InterfaceC6473e getComposable() {
        return this.composable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    @Nullable
    public <T> T getCompositionService(@NotNull CompositionServiceKey<T> key) {
        if (AbstractC5830k.m5325b(key, CompositionKt.getCompositionImplServiceKey())) {
            return this;
        }
        return null;
    }

    @TestOnly
    @NotNull
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return AbstractC5805t.m5217D0(this.conditionallyInvalidatedScopes.asSet());
    }

    @TestOnly
    @NotNull
    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.asMap().keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z8;
        synchronized (this.lock) {
            z8 = ScopeMap.m10214getSizeimpl(this.invalidations) > 0;
        }
        return z8;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @TestOnly
    @NotNull
    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.asMap().keySet();
    }

    @NotNull
    /* renamed from: getObserverHolder$runtime_release, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    @TestOnly
    @NotNull
    public final CompositionContext getParent() {
        return this.parent;
    }

    /* renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    @NotNull
    public final InterfaceC5636h getRecomposeContext() {
        InterfaceC5636h interfaceC5636h = this._recomposeContext;
        return interfaceC5636h == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : interfaceC5636h;
    }

    @NotNull
    /* renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        int size = references.size();
        boolean z8 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z8 = true;
                break;
            } else if (!AbstractC5830k.m5325b(references.get(i).getFirst().getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (!z8) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        try {
            this.composer.insertMovableContentReferences(references);
        } finally {
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    @NotNull
    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        CompositionImpl compositionImpl;
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (this.slotTable.ownsAnchor(anchor)) {
            return !scope.getCanRecompose() ? InvalidationResult.IGNORED : invalidateChecked(scope, anchor, instance);
        }
        synchronized (this.lock) {
            compositionImpl = this.invalidationDelegate;
        }
        return (compositionImpl == null || !compositionImpl.tryImminentInvalidation(scope, instance)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidateGroupsWithKey(int key) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(key);
        }
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            for (int i = 0; i < size; i++) {
                if (listInvalidateGroupsWithKey$runtime_release.get(i).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    /* renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @NotNull
    public final CompositionObserverHandle observe$runtime_release(@NotNull final CompositionObserver observer) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(observer);
            this.observerHolder.setRoot(true);
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = this.this$0.lock;
                CompositionImpl compositionImpl = this.this$0;
                CompositionObserver compositionObserver = observer;
                synchronized (obj) {
                    if (AbstractC5830k.m5325b(compositionImpl.getObserverHolder().getObserver(), compositionObserver)) {
                        compositionImpl.getObserverHolder().setObserver(null);
                        compositionImpl.getObserverHolder().setRoot(false);
                    }
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean observesAnyOf(@org.jetbrains.annotations.NotNull java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            androidx.compose.runtime.collection.ScatterSetWrapper r15 = (androidx.compose.runtime.collection.ScatterSetWrapper) r15
            androidx.collection.ScatterSet r15 = r15.getSet$runtime_release()
            java.lang.Object[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r11 = r14.observations
            boolean r11 = androidx.compose.runtime.collection.ScopeMap.m10210containsimpl(r11, r10)
            if (r11 != 0) goto L50
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r11 = r14.derivedStates
            boolean r10 = androidx.compose.runtime.collection.ScopeMap.m10210containsimpl(r11, r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r14.observations
            boolean r3 = androidx.compose.runtime.collection.ScopeMap.m10210containsimpl(r3, r0)
            if (r3 != 0) goto L7c
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r14.derivedStates
            boolean r0 = androidx.compose.runtime.collection.ScopeMap.m10210containsimpl(r3, r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    public final void pausedCompositionFinished$runtime_release() {
        this.pendingPausedComposition = null;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull InterfaceC6469a block) {
        this.composer.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zM10042recomposeaFTiNEg$runtime_release;
        synchronized (this.lock) {
            try {
                drainPendingModificationsForCompositionLocked();
                try {
                    MutableScatterMap<Object, Object> mutableScatterMapM10046takeInvalidationsafanTW4 = m10046takeInvalidationsafanTW4();
                    try {
                        CompositionObserver compositionObserverObserver = observer();
                        if (compositionObserverObserver != null) {
                            Map<RecomposeScope, ? extends Set<? extends Object>> mapM10205asMapimpl = ScopeMap.m10205asMapimpl(mutableScatterMapM10046takeInvalidationsafanTW4);
                            AbstractC5830k.m5328e(mapM10205asMapimpl, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");
                            compositionObserverObserver.onBeginComposition(this, mapM10205asMapimpl);
                        }
                        zM10042recomposeaFTiNEg$runtime_release = this.composer.m10042recomposeaFTiNEg$runtime_release(mutableScatterMapM10046takeInvalidationsafanTW4, this.shouldPause);
                        if (!zM10042recomposeaFTiNEg$runtime_release) {
                            drainPendingModificationsLocked();
                        }
                        if (compositionObserverObserver != null) {
                            compositionObserverObserver.onEndComposition(this);
                        }
                    } catch (Exception e) {
                        this.invalidations = mutableScatterMapM10046takeInvalidationsafanTW4;
                        throw e;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zM10042recomposeaFTiNEg$runtime_release;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object obj;
        boolean z8;
        Set<? extends Object> set;
        do {
            obj = this.pendingModifications.get();
            z8 = true;
            if (obj == null ? true : obj.equals(CompositionKt.PendingApplyNoModifications)) {
                set = values;
            } else if (obj instanceof Set) {
                set = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                AbstractC5830k.m5330g(setArr, "<this>");
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = values;
                set = CopyOf;
            }
            AtomicReference<Object> atomicReference = this.pendingModifications;
            while (true) {
                if (atomicReference.compareAndSet(obj, set)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z8 = false;
                    break;
                }
            }
        } while (!z8);
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        int i;
        int i8;
        int i9;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        int i10 = 1;
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(value)) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ((StateObjectImpl) value).m10248recordReadInh_f27i8$runtime_release(ReaderKind.m10231constructorimpl(1));
        }
        ScopeMap.m10203addimpl(this.observations, value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) value;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m10217removeScopeimpl(this.derivedStates, value);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr = dependencies.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j7 = jArr[i11];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j7 & 255) < 128) {
                                i8 = i10;
                                StateObject stateObject = (StateObject) objArr[(i11 << 3) + i14];
                                if (stateObject instanceof StateObjectImpl) {
                                    i9 = i12;
                                    ((StateObjectImpl) stateObject).m10248recordReadInh_f27i8$runtime_release(ReaderKind.m10231constructorimpl(i8));
                                } else {
                                    i9 = i12;
                                }
                                ScopeMap.m10203addimpl(this.derivedStates, stateObject, value);
                            } else {
                                i8 = i10;
                                i9 = i12;
                            }
                            j7 >>= i9;
                            i14++;
                            i10 = i8;
                            i12 = i9;
                        }
                        i = i10;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        i = i10;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i10 = i;
                }
            }
            currentRecomposeScope$runtime_release.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void recordWriteOf(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.lock
            monitor-enter(r0)
            r14.invalidateScopeOfLocked(r15)     // Catch: java.lang.Throwable -> L4f
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r1 = r14.derivedStates     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.get(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof androidx.collection.MutableScatterSet     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            androidx.collection.MutableScatterSet r15 = (androidx.collection.MutableScatterSet) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.elements     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.metadata     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.DerivedState r10 = (androidx.compose.runtime.DerivedState) r10     // Catch: java.lang.Throwable -> L4f
            r14.invalidateScopeOfLocked(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            androidx.compose.runtime.DerivedState r15 = (androidx.compose.runtime.DerivedState) r15     // Catch: java.lang.Throwable -> L4f
            r14.invalidateScopeOfLocked(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordWriteOf(java.lang.Object):void");
    }

    public final void removeDerivedStateObservation$runtime_release(@NotNull DerivedState<?> state) {
        if (ScopeMap.m10210containsimpl(this.observations, state)) {
            return;
        }
        ScopeMap.m10217removeScopeimpl(this.derivedStates, state);
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        ScopeMap.m10216removeimpl(this.observations, instance, scope);
    }

    public final void setComposable(@NotNull InterfaceC6473e interfaceC6473e) {
        this.composable = interfaceC6473e;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull InterfaceC6473e content) {
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        composeInitial(content);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(@NotNull InterfaceC6473e content) {
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        this.composer.startReuseFromRoot();
        composeInitial(content);
        this.composer.endReuseFromRoot();
    }

    @Override // androidx.compose.runtime.PausableComposition
    @NotNull
    public PausedComposition setPausableContent(@NotNull InterfaceC6473e content) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, content, false, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    @Override // androidx.compose.runtime.PausableComposition
    @NotNull
    public PausedComposition setPausableContentWithReuse(@NotNull InterfaceC6473e content) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, content, true, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z8) {
        this.pendingInvalidScopes = z8;
    }

    public final void updateMovingInvalidations$runtime_release() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            MutableScatterMap<Object, Object> mutableScatterMapM10046takeInvalidationsafanTW4 = m10046takeInvalidationsafanTW4();
            try {
                this.composer.m10043updateComposerInvalidationsRY85e9Y(mutableScatterMapM10046takeInvalidationsafanTW4);
            } catch (Exception e) {
                this.invalidations = mutableScatterMapM10046takeInvalidationsafanTW4;
                throw e;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176 A[EDGE_INSN: B:70:0x0176->B:219:0x0113 BREAK  A[LOOP:13: B:60:0x0144->B:71:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, InterfaceC5636h interfaceC5636h, int i, AbstractC5824e abstractC5824e) {
        this(compositionContext, applier, (i & 4) != 0 ? null : interfaceC5636h);
    }
}
