package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.p013ui.spatial.RectListKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\bM\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Î\u00012\u00020\u0001:\u0002Î\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\rJ\u0010\u0010G\u001a\u00020\u00072\b\b\u0002\u0010H\u001a\u00020\rJ\u000e\u0010I\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u0007J\u0018\u0010J\u001a\u00020E2\u0006\u0010G\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0006\u0010L\u001a\u00020EJ\u0006\u0010M\u001a\u00020EJ\u0010\u0010N\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\rH\u0002J\u0010\u0010P\u001a\u0004\u0018\u00010\u00012\u0006\u0010Q\u001a\u00020\rJ\b\u0010R\u001a\u00020EH\u0002J\u000e\u0010S\u001a\u00020E2\u0006\u0010T\u001a\u00020\u0011J\u0010\u0010U\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\rH\u0002J\u0010\u0010V\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\rH\u0002J \u0010W\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010Y\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0002J\u0010\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\rH\u0002J(\u0010[\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010]\u001a\u00020\rJ\u0006\u0010^\u001a\u00020EJ\u000e\u0010_\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0007J\u000e\u0010_\u001a\u00020E2\u0006\u0010H\u001a\u00020\rJ \u0010`\u001a\u00020E2\u0006\u0010.\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r2\u0006\u0010a\u001a\u00020\rH\u0002JK\u0010b\u001a\u00020E2\u0006\u0010O\u001a\u00020\r28\u0010c\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(H\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020E0dH\u0086\bJ5\u0010h\u001a\u00020E2\u0006\u0010i\u001a\u00020\r2\u0006\u0010j\u001a\u00020\r2\u001a\u0010c\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020E0dH\u0086\bJ\u0010\u0010k\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\rJ\u0010\u0010l\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0002J\u000e\u0010m\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u0010\u0010n\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\rJ\u000e\u0010o\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u000e\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010qJ\u001c\u0010r\u001a\u0004\u0018\u00010?2\u0006\u0010.\u001a\u00020\r2\b\u0010s\u001a\u0004\u0018\u00010tH\u0002J\u000e\u0010u\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\rJ\u0016\u0010v\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rJ\u000e\u0010w\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\rJ\u0010\u0010x\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0010\u0010y\u001a\u00020E2\u0006\u00103\u001a\u00020\rH\u0002J\u0018\u0010z\u001a\u00020E2\u0006\u00103\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rH\u0002J\u000e\u0010+\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\rJ\u000e\u0010{\u001a\b\u0012\u0004\u0012\u00020\r0|H\u0002J\u0010\u0010}\u001a\u00020E2\b\b\u0002\u0010O\u001a\u00020\rJ!\u0010~\u001a\u00020E2\u0006\u0010\u007f\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\r2\u0006\u00103\u001a\u00020\rH\u0002J(\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070|2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\r2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0011J\u0010\u0010\u0083\u0001\u001a\u00020E2\u0007\u0010\u0084\u0001\u001a\u00020\rJ\u0011\u0010\u0085\u0001\u001a\u00020E2\u0006\u0010H\u001a\u00020\rH\u0002J&\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070|2\u0007\u0010\u0084\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\rJ\u0019\u0010\u0087\u0001\u001a\u00020E2\u0006\u0010H\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rH\u0002J'\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070|2\u0006\u0010G\u001a\u00020\u00072\u0007\u0010\u0084\u0001\u001a\u00020\r2\u0007\u0010\u0089\u0001\u001a\u00020\u0000J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020\u0007J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u000e\u0010.\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u0007J\u000e\u0010.\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u0011\u0010\u008b\u0001\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0002J\u0019\u0010\u008c\u0001\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\rH\u0002J\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u008e\u0001\u001a\u00020EH\u0002J\u000f\u0010\u008f\u0001\u001a\u00020E2\u0006\u0010s\u001a\u00020tJ\u0007\u0010\u0090\u0001\u001a\u00020EJ\u0018\u0010\u0091\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\u0006\u0010K\u001a\u00020tJA\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2&\u0010=\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?\u0018\u00010>j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?\u0018\u0001`@H\u0002J\u0007\u0010\u0094\u0001\u001a\u00020\u0011J\u001b\u0010\u0095\u0001\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020\r2\u0007\u0010\u0097\u0001\u001a\u00020\rH\u0002J#\u0010\u0098\u0001\u001a\u00020E2\u0007\u0010\u0096\u0001\u001a\u00020\r2\u0007\u0010\u0097\u0001\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rH\u0002J\u0007\u0010\u0099\u0001\u001a\u00020EJ\t\u0010\u009a\u0001\u001a\u00020\rH\u0002J\t\u0010\u009b\u0001\u001a\u00020EH\u0002J\u000f\u0010\u009c\u0001\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0007J\u0011\u0010\u009d\u0001\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u001e\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u0086\bJ#\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u009f\u0001\u001a\u00020\rJ\u0007\u0010 \u0001\u001a\u00020EJ\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\rJ\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010i\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u0017\u0010¢\u0001\u001a\u00020\r2\u0006\u0010O\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u0017\u0010£\u0001\u001a\u00020\r2\u0006\u0010i\u001a\u00020\rH\u0000¢\u0006\u0003\b¤\u0001J\u0017\u0010¥\u0001\u001a\u00020\r2\u0006\u0010i\u001a\u00020\rH\u0000¢\u0006\u0003\b¦\u0001J\u0017\u0010§\u0001\u001a\u00020\r2\u0006\u0010i\u001a\u00020\rH\u0000¢\u0006\u0003\b¨\u0001J\u0013\u0010©\u0001\u001a\u0004\u0018\u00010?2\u0006\u0010O\u001a\u00020\rH\u0002J\u001b\u0010ª\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001J&\u0010ª\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u00ad\u0001\u001a\u00020EJ\u0010\u0010\u00ad\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\rJ\u001b\u0010\u00ad\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010®\u0001\u001a\u0004\u0018\u00010\u0001J0\u0010\u00ad\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u00112\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\u001b\u0010¯\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u0001J&\u0010¯\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010°\u0001\u001a\u00020tJ\t\u0010±\u0001\u001a\u00020tH\u0016J\u000f\u0010²\u0001\u001a\u00020E2\u0006\u0010j\u001a\u00020\rJ\u0019\u0010³\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010O\u001a\u00020\rH\u0000¢\u0006\u0003\b´\u0001J\u0013\u0010µ\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u001b\u0010¶\u0001\u001a\u00020E2\u0007\u0010·\u0001\u001a\u00020\r2\u0007\u0010¸\u0001\u001a\u00020\rH\u0002J\u0011\u0010¹\u0001\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0011\u0010º\u0001\u001a\u00020E2\u0006\u0010O\u001a\u00020\rH\u0002J&\u0010»\u0001\u001a\u00020E2\u0006\u0010O\u001a\u00020\r2\u0007\u0010\u009d\u0001\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0019\u0010¾\u0001\u001a\u00020E2\u0006\u0010G\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0011\u0010¾\u0001\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u001b\u0010¿\u0001\u001a\u00020E2\u0006\u0010H\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u0002J\u0011\u0010À\u0001\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0007\u0010Á\u0001\u001a\u00020EJ\u000f\u0010Â\u0001\u001a\u00020EH\u0000¢\u0006\u0003\bÃ\u0001J\u000f\u0010Ä\u0001\u001a\u00020EH\u0000¢\u0006\u0003\bÅ\u0001J\u0016\u0010Æ\u0001\u001a\u00020\r*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\rH\u0002J\u0015\u0010Y\u001a\u00020\r*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\rH\u0002J\u0013\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020\r0|*\u00020(H\u0002J\u001b\u0010É\u0001\u001a\u00020E*\b0Ê\u0001j\u0003`Ë\u00012\u0006\u0010H\u001a\u00020\rH\u0002J\u0016\u0010Ì\u0001\u001a\u00020\r*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\rH\u0002J\u0014\u0010.\u001a\u00020\r*\u00020(2\u0006\u0010H\u001a\u00020\rH\u0002J\u0015\u0010Q\u001a\u00020\r*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\rH\u0002J\u001e\u0010Í\u0001\u001a\u00020E*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\rH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u001e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u000e\u0010\u001f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014R\u0011\u0010+\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010\u0014R\u000e\u0010,\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000fR\u0018\u00100\u001a\u0004\u0018\u000101X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00102R\u0014\u00103\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u000fR\u0018\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000106X\u0082\u000e¢\u0006\u0004\n\u0002\u00107R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010;\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b<\u0010\u000fR.\u0010=\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?\u0018\u00010>j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?\u0018\u0001`@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ï\u0001"}, m13558d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "collectingCalledInformation", "getCollectingCalledInformation", "collectingSourceInformation", "getCollectingSourceInformation", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "currentGroupSlotIndex", "getCurrentGroupSlotIndex", "currentSlot", "currentSlotEnd", "deferredSlotWrites", "Landroidx/collection/MutableObjectList;", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "Landroidx/collection/MutableIntList;", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", "amount", "anchor", "index", "anchorIndex", "appendSlot", "value", "bashCurrentGroup", "beginInsert", "childContainsAnyMarks", "group", "clear", "slotIndex", "clearSlotGap", "close", "normalClose", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "forAllData", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", "forEachTailSlot", "groupIndex", "count", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupSourceInformationFor", "sourceInformation", "", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "insertGroups", "insertSlots", "keys", "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "removeSourceGroup", "moveGroup", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "rawUpdate", "recalculateMarks", "recordGroupSourceInformation", "recordGrouplessCallSourceInformationEnd", "recordGrouplessCallSourceInformationStart", "key", "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "slotIndexOfGroupSlotIndex", "slotsEndAllIndex", "slotsEndAllIndex$runtime_release", "slotsEndIndex", "slotsEndIndex$runtime_release", "slotsStartIndex", "slotsStartIndex$runtime_release", "sourceInformationOf", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toDebugString", "toString", "trimTailSlots", "tryAnchor", "tryAnchor$runtime_release", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateContainsMarkNow-XpTMRCE", "(ILandroidx/collection/MutableIntList;)V", "updateNode", "updateNodeOfGroup", "updateParentNode", "updateToTableMaps", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "address", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "updateDataIndex", "Companion", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n+ 10 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 11 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 12 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3666#2:3964\n3666#2:3965\n3732#2:3966\n3726#2:3967\n3672#2:3968\n3681#2:3969\n3666#2:3970\n3681#2:3997\n3681#2:4008\n3732#2:4067\n3666#2:4068\n3732#2:4080\n3732#2:4081\n3666#2:4082\n3666#2:4093\n3732#2:4094\n3666#2:4146\n3732#2:4147\n3825#2,6:4182\n3689#2:4188\n3698#2:4189\n3698#2:4190\n3708#2:4191\n3698#2:4192\n3708#2:4193\n3749#2,2:4194\n3746#2:4202\n3749#2,2:4203\n3777#2:4209\n3780#2,2:4215\n3777#2:4217\n3780#2,2:4223\n3780#2,2:4225\n3666#2:4231\n3746#2:4243\n3726#2:4244\n3732#2:4245\n3777#2:4246\n3746#2:4247\n3666#2:4248\n3777#2:4249\n3746#2:4265\n3746#2:4271\n3746#2:4282\n3777#2:4283\n3780#2,2:4284\n3663#2:4286\n3723#2:4287\n82#3:3971\n53#3:4056\n4643#4,5:3972\n4643#4,5:3980\n4665#4:3985\n4643#4,5:3986\n4665#4:3991\n4643#4,5:3992\n4643#4,5:3998\n4643#4,5:4003\n4643#4,5:4009\n4643#4,5:4026\n4643#4,5:4031\n4643#4,5:4036\n4643#4,5:4046\n4643#4,5:4057\n4643#4,5:4062\n4643#4,5:4075\n4643#4,5:4083\n4643#4,5:4088\n4643#4,5:4095\n4643#4,5:4100\n4643#4,5:4105\n4643#4,5:4110\n4643#4,5:4117\n4665#4:4122\n4643#4,5:4123\n4665#4:4128\n4643#4,5:4129\n4665#4:4134\n4643#4,5:4135\n4665#4:4140\n4643#4,5:4141\n4665#4:4148\n4643#4,5:4149\n4665#4:4154\n4643#4,5:4155\n4665#4:4168\n4643#4,5:4169\n4665#4:4196\n4643#4,5:4197\n4643#4,5:4210\n4643#4,5:4218\n4643#4,5:4232\n1#5:3977\n1#5:3979\n1#5:4164\n1#5:4178\n679#6:3978\n48#7,5:4014\n48#7,5:4041\n48#7,5:4051\n48#7,5:4250\n48#7,5:4255\n48#7,5:4260\n48#7,5:4266\n48#7,5:4272\n48#7,5:4277\n372#8,7:4019\n287#9,6:4069\n27#10,2:4115\n27#10,2:4205\n27#10,2:4207\n27#10,2:4227\n27#10,2:4229\n174#11,4:4160\n179#11,3:4165\n174#11,4:4174\n179#11,3:4179\n33#12,6:4237\n81#12,3:4288\n33#12,6:4291\n84#12:4297\n222#12,3:4298\n63#12,6:4301\n225#12:4307\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1328#1:3964\n1339#1:3965\n1342#1:3966\n1345#1:3967\n1350#1:3968\n1359#1:3969\n1390#1:3970\n1511#1:3997\n1527#1:4008\n1869#1:4067\n1887#1:4068\n1909#1:4080\n1944#1:4081\n1947#1:4082\n1996#1:4093\n1996#1:4094\n2405#1:4146\n2407#1:4147\n2519#1:4182,6\n2525#1:4188\n2527#1:4189\n2535#1:4190\n2538#1:4191\n2561#1:4192\n2573#1:4193\n2611#1:4194,2\n2656#1:4202\n2660#1:4203,2\n2706#1:4209\n2710#1:4215,2\n2718#1:4217\n2722#1:4223,2\n2800#1:4225,2\n2916#1:4231\n3056#1:4243\n3058#1:4244\n3060#1:4245\n3062#1:4246\n3064#1:4247\n3065#1:4248\n3097#1:4249\n3122#1:4265\n3128#1:4271\n3157#1:4282\n3163#1:4283\n3170#1:4284,2\n3179#1:4286\n3179#1:4287\n1418#1:3971\n1751#1:4056\n1443#1:3972,5\n1477#1:3980,5\n1495#1:3985\n1495#1:3986,5\n1500#1:3991\n1500#1:3992,5\n1511#1:3998,5\n1524#1:4003,5\n1527#1:4009,5\n1606#1:4026,5\n1620#1:4031,5\n1710#1:4036,5\n1715#1:4046,5\n1751#1:4057,5\n1760#1:4062,5\n1906#1:4075,5\n1968#1:4083,5\n1973#1:4088,5\n2001#1:4095,5\n2057#1:4100,5\n2058#1:4105,5\n2069#1:4110,5\n2159#1:4117,5\n2378#1:4122\n2378#1:4123,5\n2379#1:4128\n2379#1:4129,5\n2380#1:4134\n2380#1:4135,5\n2383#1:4140\n2383#1:4141,5\n2412#1:4148\n2412#1:4149,5\n2428#1:4154\n2428#1:4155,5\n2498#1:4168\n2498#1:4169,5\n2654#1:4196\n2654#1:4197,5\n2707#1:4210,5\n2719#1:4218,5\n2916#1:4232,5\n1462#1:3979\n2464#1:4164\n2506#1:4178\n1462#1:3978\n1537#1:4014,5\n1711#1:4041,5\n1749#1:4051,5\n3099#1:4250,5\n3103#1:4255,5\n3107#1:4260,5\n3123#1:4266,5\n3131#1:4272,5\n3135#1:4277,5\n1577#1:4019,7\n1892#1:4069,6\n2126#1:4115,2\n2680#1:4205,2\n2688#1:4207,2\n2834#1:4227,2\n2840#1:4229,2\n2464#1:4160,4\n2464#1:4165,3\n2506#1:4174,4\n2506#1:4179,3\n3012#1:4237,6\n3189#1:4288,3\n3189#1:4291,6\n3189#1:4297\n3193#1:4298,3\n3193#1:4301,6\n3193#1:4307\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotWriter {
    private ArrayList<Anchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private MutableIntList pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    @Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, m13558d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n27#2,2:3964\n3749#3,2:3966\n3746#3:3969\n3749#3,2:3970\n3780#3,2:3972\n3666#3:3985\n3732#3:3986\n1#4:3968\n33#5,6:3974\n4643#6,5:3980\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2210#1:3964,2\n2220#1:3966,2\n2230#1:3969\n2231#1:3970,2\n2250#1:3972,2\n2353#1:3985\n2353#1:3986\n2289#1:3974,6\n2349#1:3980,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zRemoveGroups;
            List<Anchor> listEmptyList;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i10 = fromIndex + iGroupSize;
            int iDataIndex = fromWriter.dataIndex(fromIndex);
            int iDataIndex2 = fromWriter.dataIndex(i10);
            int i11 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(iGroupSize);
            toWriter.insertSlots(i11, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i10) {
                fromWriter.moveGroupGapTo(i10);
            }
            if (fromWriter.slotsGapStart < iDataIndex2) {
                fromWriter.moveSlotGapTo(iDataIndex2, i10);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            int i12 = currentGroup * 5;
            ArraysKt.copyInto(fromWriter.groups, iArr, i12, fromIndex * 5, i10 * 5);
            Object[] objArr = toWriter.slots;
            int i13 = toWriter.currentSlot;
            System.arraycopy(fromWriter.slots, iDataIndex, objArr, i13, i11);
            int parent = toWriter.getParent();
            iArr[i12 + 2] = parent;
            int i14 = currentGroup - fromIndex;
            int i15 = currentGroup + iGroupSize;
            int iDataIndex3 = i13 - toWriter.dataIndex(iArr, currentGroup);
            int i16 = toWriter.slotsGapOwner;
            int i17 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i18 = i16;
            int i19 = currentGroup;
            while (true) {
                zRemoveGroups = false;
                if (i19 >= i15) {
                    break;
                }
                if (i19 != currentGroup) {
                    int i20 = (i19 * 5) + 2;
                    iArr[i20] = iArr[i20] + i14;
                }
                int[] iArr2 = iArr;
                int i21 = currentGroup;
                iArr2[(i19 * 5) + 4] = toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i19) + iDataIndex3, i18 >= i19 ? toWriter.slotsGapStart : 0, i17, length);
                if (i19 == i18) {
                    i18++;
                }
                i19++;
                currentGroup = i21;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            toWriter.slotsGapOwner = i18;
            int iLocationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i10, fromWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i22 = iLocationOf; i22 < iLocationOf2; i22++) {
                    Anchor anchor = (Anchor) arrayList.get(i22);
                    anchor.setLocation$runtime_release(anchor.getLocation() + i14);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime_release()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (!listEmptyList.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = listEmptyList.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        Anchor anchor2 = listEmptyList.get(i23);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            GroupSourceInformation groupSourceInformationSourceInformationOf = toWriter.sourceInformationOf(parent);
            if (groupSourceInformationSourceInformationOf != null) {
                int iGroupSize2 = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i24 = -1;
                while (iGroupSize2 < currentGroup2) {
                    i24 = iGroupSize2;
                    iGroupSize2 = SlotTableKt.groupSize(toWriter.groups, iGroupSize2) + iGroupSize2;
                }
                groupSourceInformationSourceInformationOf.addGroupAfter(toWriter, i24, currentGroup2);
            }
            int iParent = fromWriter.parent(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z9 = iParent >= 0;
                    if (z9) {
                        fromWriter.startGroup();
                        fromWriter.advanceBy(iParent - fromWriter.getCurrentGroup());
                        fromWriter.startGroup();
                    }
                    fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                    boolean zRemoveGroup = fromWriter.removeGroup();
                    if (z9) {
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                    }
                    zRemoveGroups = zRemoveGroup;
                } else {
                    zRemoveGroups = fromWriter.removeGroups(fromIndex, iGroupSize);
                    fromWriter.removeSlots(iDataIndex, i11, fromIndex - 1);
                }
            }
            if (zRemoveGroups) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int i25 = toWriter.nodeCount;
            int i26 = iArr3[i12 + 1];
            toWriter.nodeCount = i25 + ((1073741824 & i26) == 0 ? i26 & RectListKt.Lower26Bits : 1);
            if (updateToCursor) {
                toWriter.currentGroup = i15;
                toWriter.currentSlot = i13 + i11;
            }
            if (zContainsAnyGroupMarks) {
                toWriter.updateContainsMark(parent);
            }
            return listEmptyList;
        }

        public static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i10, SlotWriter slotWriter2, boolean z9, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z11 = true;
            }
            return companion.moveGroup(slotWriter, i10, slotWriter2, z9, z10, z11);
        }

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m13558d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    /* renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1 */
    public static final class C25141 implements Iterator<Object>, KMappedMarker {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        public C25141(int i10, int i11, SlotWriter slotWriter) {
            this.$end = i11;
            this.this$0 = slotWriter;
            this.current = i10;
        }

        public final int getCurrent() {
            return this.current;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i10 = this.current;
            this.current = i10 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i10)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.calledByMap = slotTable.getCalledByMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i10);
    }

    private final int auxIndex(int[] iArr, int i10) {
        return dataIndex(iArr, i10) + Integer.bitCount(iArr[(i10 * 5) + 1] >> 29);
    }

    private final boolean childContainsAnyMarks(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = group + groupSize(group);
        while (iGroupSize < iGroupSize2) {
            if ((this.groups[(groupIndexToAddress(iGroupSize) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    private final void clearSlotGap() {
        int i10 = this.slotsGapStart;
        ArraysKt.fill(this.slots, (Object) null, i10, this.slotsGapLen + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && (this.groups[(groupIndexToAddress(group) * 5) + 1] & 201326592) != 0;
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && (this.groups[(groupIndexToAddress(group) * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex + (this.slotsGapLen * (dataIndex < this.slotsGapStart ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.slice(listDataAnchors$default, RangesKt.until(0, this.groupGapStart)), (Iterable) CollectionsKt.slice(listDataAnchors$default, RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listPlus.size());
        int size = listPlus.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listPlus.get(i10)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int iParentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            this.groups[(groupIndexToAddress(firstChild) * 5) + 2] = iParentIndexToAnchor;
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(firstChild)) + firstChild;
            fixParentAnchorsFor(firstChild, iGroupSize, firstChild + 1);
            firstChild = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int getCurrentGroupSlotIndex() {
        MutableObjectList<Object> mutableObjectList;
        int iSlotsStartIndex$runtime_release = this.currentSlot - slotsStartIndex$runtime_release(this.parent);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        return iSlotsStartIndex$runtime_release + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(this.parent)) == null) ? 0 : mutableObjectList.getSize());
    }

    private final void groupAsString(StringBuilder sb, int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        sb.append("Group(");
        if (i10 < 10) {
            sb.append(' ');
        }
        if (i10 < 100) {
            sb.append(' ');
        }
        if (i10 < 1000) {
            sb.append(' ');
        }
        sb.append(i10);
        if (iGroupIndexToAddress != i10) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        sb.append('^');
        int i11 = iGroupIndexToAddress * 5;
        int i12 = i11 + 2;
        sb.append(parentAnchorToIndex(this.groups[i12]));
        sb.append(": key=");
        sb.append(this.groups[i11]);
        sb.append(", nodes=");
        int i13 = i11 + 1;
        sb.append(this.groups[i13] & RectListKt.Lower26Bits);
        sb.append(", dataAnchor=");
        sb.append(this.groups[i11 + 4]);
        sb.append(", parentAnchor=");
        sb.append(this.groups[i12]);
        if ((this.groups[i13] & 1073741824) != 0) {
            sb.append(", node=" + SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]), 10));
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i10 + 1));
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i14 = iSlotIndex; i14 < iDataIndex; i14++) {
                if (i14 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(i14)]), 10));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int index) {
        return index + (this.groupGapLen * (index < this.groupGapStart ? 0 : 1));
    }

    private final GroupSourceInformation groupSourceInformationFor(int parent, String sourceInformation) {
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null) {
            return null;
        }
        Anchor anchor = anchor(parent);
        GroupSourceInformation groupSourceInformation = map.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, sourceInformation, 0);
            if (sourceInformation == null) {
                int iGroupSize = parent + 1;
                int i10 = this.currentGroup;
                while (iGroupSize < i10) {
                    groupSourceInformation.reportGroup(this, iGroupSize);
                    iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
                }
            }
            map.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int size) {
        if (size > 0) {
            int i10 = this.currentGroup;
            moveGroupGapTo(i10);
            int i11 = this.groupGapStart;
            int i12 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < size) {
                int iMax = Math.max(Math.max(length * 2, i13 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i11 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i11 + i14) * 5, (i12 + i11) * 5, length * 5);
                this.groups = iArr2;
                i12 = i14;
            }
            int i15 = this.currentGroupEnd;
            if (i15 >= i11) {
                this.currentGroupEnd = i15 + size;
            }
            int i16 = i11 + size;
            this.groupGapStart = i16;
            this.groupGapLen = i12 - size;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i13 > 0 ? dataIndex(i10 + size) : 0, this.slotsGapOwner >= i11 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i17 = i11; i17 < i16; i17++) {
                this.groups[(i17 * 5) + 4] = iDataIndexToDataAnchor;
            }
            int i18 = this.slotsGapOwner;
            if (i18 >= i11) {
                this.slotsGapOwner = i18 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i10 = this.slotsGapStart;
            int i11 = this.slotsGapLen;
            if (i11 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i12 = length - i11;
                int iMax = Math.max(Math.max(length * 2, i12 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i13 = 0; i13 < iMax; i13++) {
                    objArr2[i13] = null;
                }
                int i14 = iMax - i12;
                int i15 = i11 + i10;
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(objArr, i15, objArr2, i10 + i14, length - i15);
                this.slots = objArr2;
                i11 = i14;
            }
            int i16 = this.currentSlotEnd;
            if (i16 >= i10) {
                this.currentSlotEnd = i16 + size;
            }
            this.slotsGapStart = i10 + size;
            this.slotsGapLen = i11 - size;
        }
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listKeys$default.get(i10);
            ((Number) obj).intValue();
            int i11 = this.groupGapStart;
            if (i10 < i11 || i10 >= i11 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.parent;
        }
        slotWriter.markGroup(i10);
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        Anchor anchor;
        int iAnchorIndex;
        int i10 = size + originalLocation;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, originalLocation, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size() && (iAnchorIndex = anchorIndex((anchor = this.anchors.get(iLocationOf)))) >= originalLocation && iAnchorIndex < i10) {
                arrayList.add(anchor);
                this.anchors.remove(iLocationOf);
            }
        }
        int i11 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Anchor anchor2 = (Anchor) arrayList.get(i12);
            int iAnchorIndex2 = anchorIndex(anchor2) + i11;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor2);
        }
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z9 = true;
        }
        return slotWriter.moveFrom(slotTable, i10, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int index) {
        int i10 = this.groupGapLen;
        int i11 = this.groupGapStart;
        if (i11 != index) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i11, index);
            }
            if (i10 > 0) {
                int[] iArr = this.groups;
                int i12 = index * 5;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                if (index < i11) {
                    ArraysKt.copyInto(iArr, iArr, i13 + i12, i12, i14);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i14, i14 + i13, i12 + i13);
                }
            }
            if (index < i11) {
                i11 = index + i10;
            }
            int capacity = getCapacity();
            if (!(i11 < capacity)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i11 < capacity) {
                int i15 = (i11 * 5) + 2;
                int i16 = this.groups[i15];
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i16), index);
                if (iParentIndexToAnchor != i16) {
                    this.groups[i15] = iParentIndexToAnchor;
                }
                i11++;
                if (i11 == index) {
                    i11 += i10;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int index, int group) {
        int i10 = this.slotsGapLen;
        int i11 = this.slotsGapStart;
        int i12 = this.slotsGapOwner;
        if (i11 != index) {
            Object[] objArr = this.slots;
            if (index < i11) {
                System.arraycopy(objArr, index, objArr, index + i10, i11 - index);
            } else {
                int i13 = i11 + i10;
                System.arraycopy(objArr, i13, objArr, i11, (index + i10) - i13);
            }
        }
        int iMin = Math.min(group + 1, getSize$runtime_release());
        if (i12 != iMin) {
            int length = this.slots.length - i10;
            if (iMin < i12) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i12);
                int i14 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int i15 = (iGroupIndexToAddress * 5) + 4;
                    int i16 = this.groups[i15];
                    if (!(i16 >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i15] = -((length - i16) + 1);
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i14) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i12);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int i17 = (iGroupIndexToAddress3 * 5) + 4;
                    int i18 = this.groups[i17];
                    if (!(i18 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i17] = i18 + length + 1;
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final int nodeIndex(int[] iArr, int i10) {
        return dataIndex(iArr, i10);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : (getSize$runtime_release() + index) - (-2);
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime_release() - index) + 2);
    }

    private final Object rawUpdate(Object value) {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    private final void recalculateMarks() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m20385isNotEmptyimpl(mutableIntList)) {
                m20399updateContainsMarkNowXpTMRCE(PrioritySet.m20387takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    private final boolean removeAnchors(int gapStart, int size, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        int i10 = size + gapStart;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i10, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i11 = iLocationOf + 1;
        int i12 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            int iAnchorIndex = anchorIndex(anchor);
            if (iAnchorIndex < gapStart) {
                break;
            }
            if (iAnchorIndex < i10) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(anchor);
                }
                if (i12 == 0) {
                    i12 = iLocationOf + 1;
                }
                i11 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z9 = i11 < i12;
        if (z9) {
            this.anchors.subList(i11, i12).clear();
        }
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            zRemoveAnchors = arrayList.isEmpty() ? false : removeAnchors(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i10 = this.slotsGapOwner;
            if (i10 > start) {
                this.slotsGapOwner = Math.max(start, i10 - len);
            }
            int i11 = this.currentGroupEnd;
            if (i11 >= this.groupGapStart) {
                this.currentGroupEnd = i11 - len;
            }
            int i12 = this.parent;
            if (containsGroupMark(i12)) {
                updateContainsMark(i12);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int start, int len, int group) {
        if (len > 0) {
            int i10 = this.slotsGapLen;
            int i11 = start + len;
            moveSlotGapTo(i11, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i10 + len;
            ArraysKt.fill(this.slots, (Object) null, start, i11);
            int i12 = this.currentSlotEnd;
            if (i12 >= start) {
                this.currentSlotEnd = i12 - len;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i10) {
        return i10 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor anchorTryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(group)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor$runtime_release);
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        Anchor anchor;
        int location$runtime_release;
        Anchor anchor2;
        int location$runtime_release2;
        int i10;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, newGapStart, capacity); iLocationOf < this.anchors.size() && (location$runtime_release = (anchor = this.anchors.get(iLocationOf)).getLocation()) >= 0; iLocationOf++) {
                anchor.setLocation$runtime_release(-(capacity - location$runtime_release));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, previousGapStart, capacity); iLocationOf2 < this.anchors.size() && (location$runtime_release2 = (anchor2 = this.anchors.get(iLocationOf2)).getLocation()) < 0 && (i10 = location$runtime_release2 + capacity) < newGapStart; iLocationOf2++) {
            anchor2.setLocation$runtime_release(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int group) {
        if (group >= 0) {
            MutableIntList mutableIntListM20380constructorimpl$default = this.pendingRecalculateMarks;
            if (mutableIntListM20380constructorimpl$default == null) {
                mutableIntListM20380constructorimpl$default = PrioritySet.m20380constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = mutableIntListM20380constructorimpl$default;
            }
            PrioritySet.m20377addimpl(mutableIntListM20380constructorimpl$default, group);
        }
    }

    /* renamed from: updateContainsMarkNow-XpTMRCE, reason: not valid java name */
    private final void m20399updateContainsMarkNowXpTMRCE(int group, MutableIntList set) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(group);
        int[] iArr = this.groups;
        if (((iArr[(iGroupIndexToAddress * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(group);
            if (iParent >= 0) {
                PrioritySet.m20377addimpl(set, iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = dataIndexToDataAnchor(i11, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateNodeOfGroup(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.groupIndexToAddress(r5)
            int[] r1 = r4.groups
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Updating the node of a group at "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r5)
        L31:
            java.lang.Object[] r5 = r4.slots
            int[] r1 = r4.groups
            int r0 = r4.nodeIndex(r1, r0)
            int r0 = r4.dataIndexToDataAddress(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int amount) {
        boolean z9 = false;
        if (!(amount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i10 = this.currentGroup + amount;
        if (i10 >= this.parent && i10 <= this.currentGroupEnd) {
            z9 = true;
        }
        if (!z9) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i10;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i10));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, getSize$runtime_release());
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        if (index > this.groupGapStart) {
            index = -(getSize$runtime_release() - index);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(Anchor anchor) {
        int location$runtime_release = anchor.getLocation();
        return location$runtime_release < 0 ? getSize$runtime_release() + location$runtime_release : location$runtime_release;
    }

    public final void appendSlot(Anchor anchor, Object value) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i10 = this.currentSlot;
        int i11 = this.currentSlotEnd;
        int iAnchorIndex = anchorIndex(anchor);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iAnchorIndex + 1));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
        insertSlots(1, iAnchorIndex);
        if (i10 >= iDataIndex) {
            i10++;
            i11++;
        }
        this.slots[iDataIndex] = value;
        this.currentSlot = i10;
        this.currentSlotEnd = i11;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i10 = this.insertCount;
        this.insertCount = i10 + 1;
        if (i10 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final Object clear(int slotIndex) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndex);
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = Composer.INSTANCE.getEmpty();
        return obj;
    }

    public final void close(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int endGroup() {
        MutableObjectList<Object> mutableObjectList;
        boolean z9 = this.insertCount > 0;
        int i10 = this.currentGroup;
        int i11 = this.currentGroupEnd;
        int i12 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i12);
        int i13 = this.nodeCount;
        int i14 = i10 - i12;
        int i15 = (iGroupIndexToAddress * 5) + 1;
        boolean z10 = (this.groups[i15] & 1073741824) != 0;
        if (z9) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i12)) != null) {
                Object[] objArr = mutableObjectList.content;
                int i16 = mutableObjectList._size;
                for (int i17 = 0; i17 < i16; i17++) {
                    rawUpdate(objArr[i17]);
                }
                mutableIntObjectMap.remove(i12);
            }
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i14);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i13);
            this.nodeCount = this.nodeCountStack.pop() + (z10 ? 1 : i13);
            int iParent = parent(this.groups, i12);
            this.parent = iParent;
            int size$runtime_release = iParent < 0 ? getSize$runtime_release() : groupIndexToAddress(iParent + 1);
            int iDataIndex = size$runtime_release >= 0 ? dataIndex(this.groups, size$runtime_release) : 0;
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return i13;
        }
        if (!(i10 == i11)) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        int[] iArr = this.groups;
        int i18 = iArr[i15] & RectListKt.Lower26Bits;
        SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, i14);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i13);
        int iPop = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = iPop;
        int iParent2 = parent(this.groups, i12);
        int iPop2 = this.nodeCountStack.pop();
        this.nodeCount = iPop2;
        if (iParent2 == iPop) {
            this.nodeCount = iPop2 + (z10 ? 0 : i13 - i18);
            return i13;
        }
        int i19 = i14 - iGroupSize;
        int i20 = z10 ? 0 : i13 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iParent2 != 0 && iParent2 != iPop && (i20 != 0 || i19 != 0)) {
                int iGroupIndexToAddress2 = groupIndexToAddress(iParent2);
                if (i19 != 0) {
                    SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i19);
                }
                if (i20 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress2, (iArr2[(iGroupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits) + i20);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(iGroupIndexToAddress2 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                iParent2 = parent(iArr3, iParent2);
            }
        }
        this.nodeCount += i20;
        return i13;
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i10 = this.insertCount - 1;
        this.insertCount = i10;
        if (i10 == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void ensureStarted(int index) {
        boolean z9 = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.parent;
        if (i10 != index) {
            if (index >= i10 && index < this.currentGroupEnd) {
                z9 = true;
            }
            if (!z9) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + index + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.currentGroup;
            int i12 = this.currentSlot;
            int i13 = this.currentSlotEnd;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i11;
            this.currentSlot = i12;
            this.currentSlotEnd = i13;
        }
    }

    public final void forAllData(int group, Function2<? super Integer, Object, Unit> block) {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(getCurrentGroup() + groupSize(getCurrentGroup())));
        for (int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(group)); iDataIndex2 < iDataIndex; iDataIndex2++) {
            block.invoke(Integer.valueOf(iDataIndex2), this.slots[dataIndexToDataAddress(iDataIndex2)]);
        }
    }

    public final void forEachTailSlot(int groupIndex, int count, Function2<? super Integer, Object, Unit> block) {
        int iSlotsStartIndex$runtime_release = slotsStartIndex$runtime_release(groupIndex);
        int iSlotsEndIndex$runtime_release = slotsEndIndex$runtime_release(groupIndex);
        for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - count); iMax < iSlotsEndIndex$runtime_release; iMax++) {
            block.invoke(Integer.valueOf(iMax), this.slots[dataIndexToDataAddress(iMax)]);
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    /* renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        return (iArr[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0 ? this.slots[auxIndex(iArr, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(int index) {
        return this.groups[groupIndexToAddress(index) * 5];
    }

    public final Object groupObjectKey(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
    }

    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i10 = this.currentGroup;
        return new C25141(iDataIndex, dataIndex(iArr, groupIndexToAddress(i10 + groupSize(i10))), this);
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int iIndexOf;
        int capacity;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (group <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(group)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(group);
            capacity = iGroupSize + group;
        }
        return index > group && index < capacity;
    }

    public final boolean indexInParent(int index) {
        int i10 = this.parent;
        if (index <= i10 || index >= this.currentGroupEnd) {
            return i10 == 0 && index == 0;
        }
        return true;
    }

    public final void insertAux(Object value) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i10 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        if ((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i10);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i11 = this.currentSlot;
        if (i11 > iAuxIndex) {
            int i12 = i11 - iAuxIndex;
            if (!(i12 < 3)) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i12 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = value;
        this.currentSlot++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i10 = this.currentGroup;
        return i10 < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void markGroup(int group) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        int[] iArr = this.groups;
        int i10 = (iGroupIndexToAddress * 5) + 1;
        if ((iArr[i10] & 134217728) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, iGroupIndexToAddress, true);
        if ((this.groups[i10] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            return;
        }
        updateContainsMark(parent(group));
    }

    public final List<Anchor> moveFrom(SlotTable table, int index, boolean removeSourceGroup) {
        if (!(this.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || SlotTableKt.groupSize(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterOpenWriter = table.openWriter();
            try {
                List<Anchor> listMoveGroup = INSTANCE.moveGroup(slotWriterOpenWriter, index, this, true, true, removeSourceGroup);
                slotWriterOpenWriter.close(true);
                return listMoveGroup;
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = table.getSourceInformationMap$runtime_release();
        MutableIntObjectMap<MutableIntSet> calledByMap$runtime_release = table.getCalledByMap$runtime_release();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        this.sourceInformationMap = sourceInformationMap$runtime_release;
        this.calledByMap = calledByMap$runtime_release;
        table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
        return this.anchors;
    }

    public final void moveGroup(int offset) {
        boolean z9 = true;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i10 = this.currentGroup;
        int i11 = this.parent;
        int i12 = this.currentGroupEnd;
        int iGroupSize = i10;
        for (int i13 = offset; i13 > 0; i13--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (!(iGroupSize <= i12)) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i14 = iGroupSize + iGroupSize2;
        int iDataIndex3 = dataIndex(this.groups, groupIndexToAddress(i14));
        int i15 = iDataIndex3 - iDataIndex2;
        insertSlots(i15, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i14) * 5;
        ArraysKt.copyInto(iArr, iArr, groupIndexToAddress(i10) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i15 > 0) {
            Object[] objArr = this.slots;
            int iDataIndexToDataAddress = dataIndexToDataAddress(iDataIndex2 + i15);
            System.arraycopy(objArr, iDataIndexToDataAddress, objArr, iDataIndex, dataIndexToDataAddress(iDataIndex3 + i15) - iDataIndexToDataAddress);
        }
        int i16 = iDataIndex2 + i15;
        int i17 = i16 - iDataIndex;
        int i18 = this.slotsGapStart;
        int i19 = this.slotsGapLen;
        int length = this.slots.length;
        int i20 = this.slotsGapOwner;
        int i21 = i10 + iGroupSize2;
        int i22 = i10;
        while (i22 < i21) {
            boolean z10 = z9;
            int iGroupIndexToAddress2 = groupIndexToAddress(i22);
            int i23 = i22;
            int i24 = i17;
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, iGroupIndexToAddress2) - i17, i20 < iGroupIndexToAddress2 ? 0 : i18, i19, length));
            i22 = i23 + 1;
            z9 = z10;
            i17 = i24;
        }
        moveAnchors(i14, i10, iGroupSize2);
        if (removeGroups(i14, iGroupSize2)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i11, this.currentGroupEnd, i10);
        if (i15 > 0) {
            removeSlots(i16, i15, i14 - 1);
        }
    }

    public final List<Anchor> moveIntoGroupFrom(int offset, SlotTable table, int index) {
        if (!(this.insertCount <= 0 && groupSize(this.currentGroup + offset) == 1)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int i12 = this.currentSlotEnd;
        advanceBy(offset);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = table.openWriter();
        try {
            List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, slotWriterOpenWriter, index, this, false, true, false, 32, null);
            slotWriterOpenWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i10;
            this.currentSlot = i11;
            this.currentSlotEnd = i12;
            return listMoveGroup$default;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public final List<Anchor> moveTo(Anchor anchor, int offset, SlotWriter writer) {
        if (!(writer.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!anchor.getValid()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int iAnchorIndex = anchorIndex(anchor) + offset;
        int i10 = this.currentGroup;
        if (!(i10 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, this, iAnchorIndex, writer, false, false, false, 32, null);
        updateContainsMark(iParent);
        boolean z9 = iNodeCount > 0;
        while (iParent >= i10) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z9) {
                int[] iArr2 = this.groups;
                int i11 = iArr2[(iGroupIndexToAddress * 5) + 1];
                if ((1073741824 & i11) != 0) {
                    z9 = false;
                } else {
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, (i11 & RectListKt.Lower26Bits) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z9) {
            if (!(this.nodeCount >= iNodeCount)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup$default;
    }

    public final Object node(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & 1073741824) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, iGroupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int index) {
        return this.groups[(groupIndexToAddress(index) * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final void recordGroupSourceInformation(String sourceInformation) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, sourceInformation);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GroupSourceInformation groupSourceInformationGroupSourceInformationFor;
        if (this.insertCount <= 0 || (groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationGroupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    public final void recordGrouplessCallSourceInformationStart(int key, String value) {
        if (this.insertCount > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            if (mutableIntObjectMap != null) {
                SlotTableKt.add(mutableIntObjectMap, key, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (groupSourceInformationGroupSourceInformationFor != null) {
                groupSourceInformationGroupSourceInformationFor.startGrouplessCall(key, value, getCurrentGroupSlotIndex());
            }
        }
    }

    public final boolean removeGroup() {
        Anchor anchorTryAnchor$runtime_release;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i10));
        int iSkipGroup = skipGroup();
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(this.parent);
        if (groupSourceInformationSourceInformationOf != null && (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i10)) != null) {
            groupSourceInformationSourceInformationOf.removeAnchor(anchorTryAnchor$runtime_release);
        }
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m20385isNotEmptyimpl(mutableIntList) && PrioritySet.m20386peekimpl(mutableIntList) >= i10) {
                PrioritySet.m20387takeMaximpl(mutableIntList);
            }
        }
        boolean zRemoveGroups = removeGroups(i10, this.currentGroup - i10);
        removeSlots(iDataIndex, this.currentSlot - iDataIndex, i10 - 1);
        this.currentGroup = i10;
        this.currentSlot = i11;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = value;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i10 = this.currentSlot;
        this.currentSlot = i10 + 1;
        return objArr[dataIndexToDataAddress(i10)];
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i10 = this.groups[(iGroupIndexToAddress * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & RectListKt.Lower26Bits;
    }

    public final void skipToGroupEnd() {
        int i10 = this.currentGroupEnd;
        this.currentGroup = i10;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i10));
    }

    public final Object slot(Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final int slotIndexOfGroupSlotIndex(int group, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int i10 = iSlotIndex + index;
        if (!(i10 >= iSlotIndex && i10 < dataIndex(this.groups, groupIndexToAddress(group + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + index + " for group " + group);
        }
        return i10;
    }

    public final int slotsEndAllIndex$runtime_release(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupIndex + groupSize(groupIndex)));
    }

    public final int slotsEndIndex$runtime_release(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
    }

    public final int slotsStartIndex$runtime_release(int groupIndex) {
        return slotIndex(this.groups, groupIndexToAddress(groupIndex));
    }

    public final void startData(int key, Object objectKey, Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startNode(int key, Object objectKey) {
        startGroup(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("  parent:    " + this.parent);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("  current:   " + this.currentGroup);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("  gap owner: ");
        sb2.append(this.slotsGapOwner);
        sb.append(sb2.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        int size$runtime_release = getSize$runtime_release();
        for (int i10 = 0; i10 < size$runtime_release; i10++) {
            groupAsString(sb, i10);
            sb.append('\n');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void trimTailSlots(int count) {
        if (!(count > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i10 = this.parent;
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i10));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i10 + 1)) - count;
        if (!(iDataIndex >= iSlotIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(iDataIndex, count, i10);
        int i11 = this.currentSlot;
        if (i11 >= iSlotIndex) {
            this.currentSlot = i11 - count;
        }
    }

    public final Anchor tryAnchor$runtime_release(int group) {
        if (group < 0 || group >= getSize$runtime_release()) {
            return null;
        }
        return SlotTableKt.find(this.anchors, group, getSize$runtime_release());
    }

    public final Object update(Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return rawUpdate(value);
        }
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i10 = 1;
        int i11 = 0;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(i11, i10, defaultConstructorMarker);
        }
        this.deferredSlotWrites = mutableIntObjectMap;
        int i12 = this.parent;
        MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i12);
        if (mutableObjectList == null) {
            mutableObjectList = new MutableObjectList<>(i11, i10, defaultConstructorMarker);
            mutableIntObjectMap.set(i12, mutableObjectList);
        }
        mutableObjectList.add(value);
        return Composer.INSTANCE.getEmpty();
    }

    public final void updateAux(Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = value;
    }

    public final void updateNode(Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateParentNode(Object value) {
        updateNodeOfGroup(this.parent, value);
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime_release();
        this.calledByMap = this.table.getCalledByMap$runtime_release();
    }

    public final void verifyDataAnchors$runtime_release() {
        int i10 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i11 = 0;
        int i12 = 0;
        boolean z9 = false;
        while (i11 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i11);
            int[] iArr = this.groups;
            int i13 = iArr[(iGroupIndexToAddress * 5) + 4];
            int iDataIndex = dataIndex(iArr, iGroupIndexToAddress);
            if (!(iDataIndex >= i12)) {
                PreconditionsKt.throwIllegalStateException("Data index out of order at " + i11 + ", previous = " + i12 + ", current = " + iDataIndex);
            }
            if (!(iDataIndex <= length)) {
                PreconditionsKt.throwIllegalStateException("Data index, " + iDataIndex + ", out of bound at " + i11);
            }
            if (i13 < 0 && !z9) {
                if (!(i10 == i11)) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i10 + " found gap at " + i11);
                }
                z9 = true;
            }
            i11++;
            i12 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i10 = this.groupGapStart;
        int i11 = this.groupGapLen;
        int capacity = getCapacity();
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                break;
            }
            if (!(this.groups[(i12 * 5) + 2] > -2)) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i12);
            }
            i12++;
        }
        for (int i13 = i11 + i10; i13 < capacity; i13++) {
            int i14 = this.groups[(i13 * 5) + 2];
            if (parentAnchorToIndex(i14) < i10) {
                if (!(i14 > -2)) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i13);
                }
            } else if (!(i14 <= -2)) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i10) {
        return i10 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i10 * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    public final int parent(Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final Object slot(int groupIndex, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int i10 = index + iSlotIndex;
        if (iSlotIndex > i10 || i10 >= iDataIndex) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i10)];
    }

    public final void startData(int key, Object aux) {
        startGroup(key, Composer.INSTANCE.getEmpty(), false, aux);
    }

    public final void startNode(int key, Object objectKey, Object node) {
        startGroup(key, objectKey, true, node);
    }

    public final void updateNode(Anchor anchor, Object value) {
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    private final int parent(int[] iArr, int i10) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i10) * 5) + 2]);
    }

    public final boolean isNode(int index) {
        return (this.groups[(groupIndexToAddress(index) * 5) + 1] & 1073741824) != 0;
    }

    public final Object set(int index, Object value) {
        return set(getCurrentGroup(), index, value);
    }

    public final void startGroup(int key) {
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(key, companion.getEmpty(), false, companion.getEmpty());
    }

    public final Object node(Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final Object set(int group, int index, Object value) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = value;
        return obj;
    }

    public final void startGroup(int key, Object dataKey) {
        startGroup(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
        int iGroupSize;
        GroupSourceInformation groupSourceInformationSourceInformationOf;
        int i10 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            int i11 = this.currentGroup;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i11));
            insertGroups(1);
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            int iGroupIndexToAddress = groupIndexToAddress(i11);
            Composer.Companion companion = Composer.INSTANCE;
            ?? r12 = objectKey != companion.getEmpty() ? 1 : 0;
            ?? r13 = (isNode || aux == companion.getEmpty()) ? 0 : 1;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(iDataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iDataIndexToDataAnchor >= 0 && this.slotsGapOwner < i11) {
                iDataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - iDataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, key, isNode, r12, r13, this.parent, iDataIndexToDataAnchor);
            int i12 = (isNode ? 1 : 0) + r12 + r13;
            if (i12 > 0) {
                insertSlots(i12, i11);
                Object[] objArr2 = this.slots;
                int i13 = this.currentSlot;
                if (isNode) {
                    objArr2[i13] = aux;
                    i13++;
                }
                if (r12 != 0) {
                    objArr2[i13] = objectKey;
                    i13++;
                }
                if (r13 != 0) {
                    objArr2[i13] = aux;
                    i13++;
                }
                this.currentSlot = i13;
            }
            this.nodeCount = 0;
            iGroupSize = i11 + 1;
            this.parent = i11;
            this.currentGroup = iGroupSize;
            if (i10 >= 0 && (groupSourceInformationSourceInformationOf = sourceInformationOf(i10)) != null) {
                groupSourceInformationSourceInformationOf.reportGroup(this, i11);
            }
        } else {
            this.startStack.push(i10);
            saveCurrentGroupEnd();
            int i14 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i14);
            if (!Intrinsics.areEqual(aux, Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iGroupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits;
            this.parent = i14;
            this.currentGroup = i14 + 1;
            iGroupSize = i14 + SlotTableKt.groupSize(iArr, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final void ensureStarted(Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }
}
