package androidx.compose.runtime;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.p011ui.spatial.RectListKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p160s6.InterfaceC6560a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J?\u0010*\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\b2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%H\u0000¢\u0006\u0004\b(\u0010)J\u008f\u0001\u0010*\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00162\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001a\u00020\u00162\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`32&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0000¢\u0006\u0004\b(\u00108J\u0087\u0001\u0010;\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00162\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001a\u00020\u00162\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`32&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0000¢\u0006\u0004\b9\u0010:J\u001f\u0010A\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=2\u0006\u0010<\u001a\u00020\u0016H\u0000¢\u0006\u0004\b?\u0010@J\r\u0010B\u001a\u00020\u001d¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u0004\u0018\u00010$2\u0006\u0010D\u001a\u00020\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020'¢\u0006\u0004\bG\u0010\u0005J\r\u0010H\u001a\u00020'¢\u0006\u0004\bH\u0010\u0005J\r\u0010I\u001a\u00020'¢\u0006\u0004\bI\u0010\u0005J\r\u0010K\u001a\u00020J¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0=2\u0006\u0010D\u001a\u00020\u0016H\u0000¢\u0006\u0004\bM\u0010@J!\u0010R\u001a\u0004\u0018\u00010/2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u0016H\u0000¢\u0006\u0004\bP\u0010QJ\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030SH\u0096\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u0004\u0018\u00010\u00032\u0006\u0010V\u001a\u00020/H\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Y\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bY\u0010\u001aJ\u0019\u0010Z\u001a\u0004\u0018\u00010>2\u0006\u0010D\u001a\u00020\u0016H\u0002¢\u0006\u0004\bZ\u0010[J'\u0010_\u001a\u00020\u0016*\u00060\\j\u0002`]2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u0016H\u0002¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\ba\u0010bJ\u0015\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\bc\u0010bJ\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\bd\u0010bJ\u0015\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\be\u0010bJ\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\bf\u0010bR$\u0010,\u001a\u00020+2\u0006\u0010g\u001a\u00020+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010h\u001a\u0004\bi\u0010jR$\u0010-\u001a\u00020\u00162\u0006\u0010g\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010k\u001a\u0004\bl\u0010mR4\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u000e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010n\u001a\u0004\bo\u0010pR$\u00101\u001a\u00020\u00162\u0006\u0010g\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010k\u001a\u0004\bq\u0010mR\u0016\u0010r\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010kR\u0014\u0010s\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR$\u0010\u0010\u001a\u00020\u001d2\u0006\u0010g\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0010\u0010u\u001a\u0004\bv\u0010CR\"\u0010w\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010k\u001a\u0004\bx\u0010m\"\u0004\by\u0010zR2\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`38\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fRG\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b&\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R/\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b7\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010CR\u001d\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008e\u0001"}, m5110d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "reader", "block", "read", "(Lr6/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "writer", "write", "openReader", "()Landroidx/compose/runtime/SlotReader;", "openWriter", "()Landroidx/compose/runtime/SlotWriter;", "", "index", "Landroidx/compose/runtime/Anchor;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "", "ownsAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "groupIndex", "groupContainsAnchor", "(ILandroidx/compose/runtime/Anchor;)Z", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "Ld6/s;", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V", "close", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "setTo", TypedValues.AttributesType.S_TARGET, "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "containsMark", "()Z", "group", "sourceInformationOf", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "verifyWellFormed", "collectCalledByInformation", "collectSourceInformation", "", "toDebugString", "()Ljava/lang/String;", "slotsOf$runtime_release", "slotsOf", "slotIndex", "slot$runtime_release", "(II)Ljava/lang/Object;", "slot", "", "iterator", "()Ljava/util/Iterator;", "identityToFind", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", "tryAnchor", "findEffectiveRecomposeScope", "(I)Landroidx/compose/runtime/RecomposeScopeImpl;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "level", "emitGroup", "(Ljava/lang/StringBuilder;II)I", "keys", "()Ljava/util/List;", "nodes", "parentIndexes", "dataIndexes", "groupSizes", "<set-?>", "[I", "getGroups", "()[I", "I", "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "getSlotsSize", "readers", "lock", "Ljava/lang/Object;", "Z", "getWriter$runtime_release", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "Landroidx/collection/MutableIntObjectMap;", "getCalledByMap$runtime_release", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime_release", "(Landroidx/collection/MutableIntObjectMap;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n158#1,7:4029\n174#1,4:4036\n179#1,3:4047\n27#2:3964\n33#2,2:4022\n1#3:3965\n1#3:4046\n4643#4,5:3966\n4643#4,5:3971\n4643#4,5:3976\n4643#4,5:3992\n4643#4,5:3997\n4643#4,5:4007\n4643#4,5:4012\n4643#4,5:4017\n33#5,5:3981\n33#5,5:4002\n33#5,5:4024\n48#5,5:4052\n48#5,5:4057\n33#5,5:4066\n33#5,5:4071\n33#5,5:4077\n33#5,5:4082\n48#5,5:4099\n48#5,5:4104\n48#5,5:4109\n48#5,5:4116\n48#5,5:4121\n48#5,5:4126\n48#5,5:4134\n48#5,5:4141\n48#5,5:4147\n48#5,5:4152\n48#5,5:4159\n33#5,5:4168\n33#5,5:4173\n3825#6,6:3986\n3698#6:4050\n3746#6:4051\n3726#6:4087\n3732#6:4088\n3689#6:4089\n3698#6:4090\n3672#6:4091\n3666#6:4092\n3669#6:4093\n3681#6:4094\n3777#6:4095\n3777#6:4096\n3777#6:4097\n3746#6:4098\n3777#6:4114\n3777#6:4115\n3666#6:4131\n3672#6:4132\n3681#6:4133\n3666#6:4139\n3669#6:4140\n3732#6:4146\n3708#6:4157\n3698#6:4158\n3777#6:4179\n33#7,6:4040\n33#7,4:4062\n38#7:4076\n33#7,4:4164\n38#7:4178\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n346#1:4029,7\n382#1:4036,4\n382#1:4047,3\n123#1:3964\n268#1:4022,2\n382#1:4046\n202#1:3966,5\n203#1:3971,5\n219#1:3976,5\n226#1:3992,5\n237#1:3997,5\n254#1:4007,5\n255#1:4012,5\n265#1:4017,5\n220#1:3981,5\n238#1:4002,5\n294#1:4024,5\n493#1:4052,5\n500#1:4057,5\n509#1:4066,5\n512#1:4071,5\n533#1:4077,5\n534#1:4082,5\n434#1:4099,5\n439#1:4104,5\n442#1:4109,5\n448#1:4116,5\n451#1:4121,5\n453#1:4126,5\n458#1:4134,5\n462#1:4141,5\n471#1:4147,5\n476#1:4152,5\n481#1:4159,5\n521#1:4168,5\n522#1:4173,5\n221#1:3986,6\n399#1:4050\n418#1:4051\n588#1:4087\n593#1:4088\n596#1:4089\n599#1:4090\n605#1:4091\n612#1:4092\n613#1:4093\n615#1:4094\n660#1:4095\n661#1:4096\n667#1:4097\n433#1:4098\n446#1:4114\n447#1:4115\n455#1:4131\n456#1:4132\n457#1:4133\n461#1:4139\n462#1:4140\n469#1:4146\n480#1:4157\n481#1:4158\n589#1:4179\n384#1:4040,6\n507#1:4062,4\n507#1:4076\n518#1:4164,4\n518#1:4178\n*E\n"})
/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, InterfaceC6560a {
    public static final int $stable = 8;

    @Nullable
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;

    @Nullable
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;

    @NotNull
    private int[] groups = new int[0];

    @NotNull
    private Object[] slots = new Object[0];

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i, int i8) {
        String sourceInformation;
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(")");
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(i);
        if (groupSourceInformationSourceInformationOf != null && (sourceInformation = groupSourceInformationSourceInformationOf.getSourceInformation()) != null && (AbstractC5862w.m5409C(sourceInformation, "C(", false) || AbstractC5862w.m5409C(sourceInformation, "CC(", false))) {
            int iM5380N = AbstractC5855p.m5380N(sourceInformation, "(", 0, false, 6) + 1;
            int iM5379M = AbstractC5855p.m5379M(sourceInformation, ')', 0, 6);
            sb.append(" ");
            String strSubstring = sourceInformation.substring(iM5380N, iM5379M);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        int i10 = i * 5;
        sb.append(this.groups[i10]);
        int iGroupSize = SlotTableKt.groupSize(this.groups, i);
        sb.append(", nodes=");
        int i11 = i10 + 1;
        sb.append(this.groups[i11] & RectListKt.Lower26Bits);
        sb.append(", size=");
        sb.append(iGroupSize);
        if ((this.groups[i11] & 134217728) != 0) {
            sb.append(", mark");
        }
        if ((this.groups[i11] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int iEmitGroup = i + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex < 0 || iEmitGroup$dataIndex > iEmitGroup$dataIndex2 || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if ((this.groups[i11] & 536870912) != 0) {
                sb.append(" objectKey=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.objectKeyIndex(this.groups, i)]), 10));
            }
            if ((this.groups[i11] & BasicMeasure.EXACTLY) != 0) {
                sb.append(" node=" + SlotTableKt.summarize(String.valueOf(this.slots[this.groups[i10 + 4]]), 10));
            }
            if ((this.groups[i11] & 268435456) != 0) {
                sb.append(" aux=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.auxIndex(this.groups, i)]), 10));
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i12 = iSlotAnchor; i12 < iEmitGroup$dataIndex2; i12++) {
                    if (i12 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(SlotTableKt.summarize(String.valueOf(this.slots[i12]), 10));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i13 = i + iGroupSize;
        while (iEmitGroup < i13) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i8 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i) {
        return i >= slotTable.groupsSize ? slotTable.slotsSize : slotTable.groups[(i * 5) + 4];
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        int i = group;
        while (i > 0) {
            Iterator<Object> it = new DataIterator(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i != group) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i = this.groups[(i * 5) + 2];
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader slotReader, MutableIntSet mutableIntSet, List<Anchor> list, Ref$BooleanRef ref$BooleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (!mutableIntSet.contains(groupKey)) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$20$scanGroup(slotReader, mutableIntSet, list, ref$BooleanRef, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (ref$BooleanRef.element) {
            RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (recomposeScopeImplFindEffectiveRecomposeScope2 != null) {
                list2.add(recomposeScopeImplFindEffectiveRecomposeScope2);
                Anchor anchor = recomposeScopeImplFindEffectiveRecomposeScope2.getAnchor();
                if (anchor != null && anchor.getLocation() == slotReader.getCurrentGroup() && (recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                    list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                }
            } else {
                ref$BooleanRef.element = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final Anchor tryAnchor(int index) {
        int i;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.find(this.anchors, index, i);
    }

    private static final int verifyWellFormed$validateGroup(Ref$IntRef ref$IntRef, SlotTable slotTable, int i, int i8) {
        int i9 = ref$IntRef.element;
        int i10 = i9 + 1;
        ref$IntRef.element = i10;
        int i11 = i9 * 5;
        int i12 = slotTable.groups[i11 + 2];
        if (!(i12 == i)) {
            StringBuilder sbM99x = AbstractC0037f.m99x("Invalid parent index detected at ", ", expected parent index to be ", i9, " found ", i);
            sbM99x.append(i12);
            PreconditionsKt.throwIllegalStateException(sbM99x.toString());
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i9) + i9;
        if (!(iGroupSize <= slotTable.groupsSize)) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i9);
        }
        if (!(iGroupSize <= i8)) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i9);
        }
        int[] iArr = slotTable.groups;
        int i13 = i11 + 4;
        int i14 = iArr[i13];
        int i15 = i9 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : iArr[(i10 * 5) + 4];
        if (!(i15 <= slotTable.slots.length)) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i9 + " extend past the end of the slot table");
        }
        if (!(i14 <= i15)) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i9);
        }
        if (!(SlotTableKt.slotAnchor(slotTable.groups, i9) <= i15)) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i9);
        }
        int i16 = i11 + 1;
        int i17 = slotTable.groups[i16];
        if (!(i15 - i14 >= (((i17 & BasicMeasure.EXACTLY) != 0 ? 1 : 0) + ((536870912 & i17) != 0 ? 1 : 0)) + ((i17 & 268435456) != 0 ? 1 : 0))) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i9);
        }
        int[] iArr2 = slotTable.groups;
        boolean z8 = (iArr2[i16] & BasicMeasure.EXACTLY) != 0;
        if (!((z8 && slotTable.slots[iArr2[i13]] == null) ? false : true)) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i9);
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (ref$IntRef.element < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(ref$IntRef, slotTable, i9, iGroupSize);
        }
        int[] iArr3 = slotTable.groups;
        int i18 = iArr3[i16] & RectListKt.Lower26Bits;
        int iGroupSize2 = SlotTableKt.groupSize(iArr3, i9);
        if (!(i18 == iVerifyWellFormed$validateGroup)) {
            StringBuilder sbM99x2 = AbstractC0037f.m99x("Incorrect node count detected at ", ", expected ", i9, ", received ", i18);
            sbM99x2.append(iVerifyWellFormed$validateGroup);
            PreconditionsKt.throwIllegalStateException(sbM99x2.toString());
        }
        int i19 = ref$IntRef.element - i9;
        if (!(iGroupSize2 == i19)) {
            StringBuilder sbM99x3 = AbstractC0037f.m99x("Incorrect slot count detected at ", ", expected ", i9, ", received ", iGroupSize2);
            sbM99x3.append(i19);
            PreconditionsKt.throwIllegalStateException(sbM99x3.toString());
        }
        int[] iArr4 = slotTable.groups;
        if ((iArr4[i16] & 201326592) != 0) {
            if (!(i9 <= 0 || (iArr4[(i * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0)) {
                PreconditionsKt.throwIllegalStateException("Expected group " + i + " to record it contains a mark because " + i9 + " does");
            }
        }
        if (z8) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i = 0; i < size; i++) {
                Object obj = groups.get(i);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    @NotNull
    public final Anchor anchor(int index) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z8 = false;
        if (index >= 0 && index < this.groupsSize) {
            z8 = true;
        }
        if (!z8) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, this.groupsSize);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final void close$runtime_release(@NotNull SlotReader reader, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this.lock) {
                try {
                    HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new MutableIntObjectMap<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && (this.groups[1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public CompositionGroup find(@NotNull Object identityToFind) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @Nullable
    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime_release() {
        return this.calledByMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @NotNull
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    @Nullable
    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    /* renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int groupIndex, @NotNull Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (ownsAnchor(anchor)) {
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndex) + groupIndex;
            int location$runtime_release = anchor.getLocation();
            if (groupIndex <= location$runtime_release && location$runtime_release < iGroupSize) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(target);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(target)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$20$scanGroup(slotReaderOpenReader, mutableIntSet2, arrayList, ref$BooleanRef, this, arrayList2);
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Anchor anchor = (Anchor) arrayList.get(i);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashCurrentGroup();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close(true);
                if (ref$BooleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            slotReaderOpenReader.close();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @NotNull
    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    @NotNull
    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor) {
        int iSearch;
        return anchor.getValid() && (iSearch = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && AbstractC5830k.m5325b(this.anchors.get(iSearch), anchor);
    }

    public final <T> T read(@NotNull InterfaceC6471c block) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return (T) block.invoke(slotReaderOpenReader);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setCalledByMap$runtime_release(@Nullable MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setSourceInformationMap$runtime_release(@Nullable HashMap<Anchor, GroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap, @Nullable MutableIntObjectMap<MutableIntSet> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final void setVersion$runtime_release(int i) {
        this.version = i;
    }

    @Nullable
    public final Object slot$runtime_release(int group, int slotIndex) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i = group + 1;
        return (slotIndex < 0 || slotIndex >= (i < this.groupsSize ? this.groups[(i * 5) + 4] : this.slots.length) - iSlotAnchor) ? Composer.INSTANCE.getEmpty() : this.slots[iSlotAnchor + slotIndex];
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int group) {
        int[] iArr = this.groups;
        int i = iArr[(group * 5) + 4];
        int i8 = group + 1;
        return AbstractC5802q.m5204e0(this.slots).subList(i, i8 < this.groupsSize ? iArr[(i8 * 5) + 4] : this.slots.length);
    }

    @Nullable
    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor anchorTryAnchor;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor = tryAnchor(group)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor);
    }

    @NotNull
    public final String toDebugString() {
        if (this.writer) {
            return toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        int i = this.groupsSize;
        if (i > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    public final void verifyWellFormed() {
        int i;
        int i8;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int i9 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i = ref$IntRef.element;
                i8 = this.groupsSize;
                if (i >= i8) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(ref$IntRef, this, -1, SlotTableKt.groupSize(this.groups, i) + i);
                }
            }
            if (!(i == i8)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + ref$IntRef.element + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i10 = this.slotsSize; i10 < length; i10++) {
            if (!(this.slots[i10] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i10);
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int indexFor = arrayList.get(i11).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i9 < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i11++;
            i9 = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : map.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    public final <T> T write(@NotNull InterfaceC6471c block) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            T t8 = (T) block.invoke(slotWriterOpenWriter);
            slotWriterOpenWriter.close(true);
            return t8;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap, @Nullable MutableIntObjectMap<MutableIntSet> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }
}
