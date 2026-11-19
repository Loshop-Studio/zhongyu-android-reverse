package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.p013ui.spatial.RectListKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u001cJ\u000e\u0010=\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u0007J=\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2&\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u0001`0H\u0000¢\u0006\u0002\bBJ\u008f\u0001\u0010>\u001a\u00020?2\u0006\u00109\u001a\u00020C2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0&2\u0006\u0010+\u001a\u00020\u001c2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u0001`02\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\bB\u0010DJ\u0006\u0010E\u001a\u00020?J\u0006\u0010F\u001a\u00020?J\u0006\u0010G\u001a\u00020!J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J\u0012\u0010J\u001a\u0004\u0018\u00010\u00032\u0006\u0010K\u001a\u00020$H\u0016J\u0012\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020\u001cH\u0002J\u0016\u0010O\u001a\u00020!2\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u0007J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J\u001d\u0010R\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010I2\u0006\u0010S\u001a\u00020\u001cH\u0000¢\u0006\u0002\bTJ\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030VH\u0096\u0002J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J\u0006\u0010Y\u001a\u00020AJ\u0006\u0010Z\u001a\u00020CJ\u000e\u0010[\u001a\u00020!2\u0006\u0010;\u001a\u00020\u0007J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001c0IH\u0002J7\u0010]\u001a\u0002H^\"\u0004\b\u0000\u0010^2!\u0010_\u001a\u001d\u0012\u0013\u0012\u00110A¢\u0006\f\ba\u0012\b\bb\u0012\u0004\b\b(@\u0012\u0004\u0012\u0002H^0`H\u0086\b¢\u0006\u0002\u0010cJ\u0087\u0001\u0010d\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0&2\u0006\u0010+\u001a\u00020\u001c2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u0001`02\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\be\u0010fJ\u001f\u0010g\u001a\u0004\u0018\u00010$2\u0006\u0010N\u001a\u00020\u001c2\u0006\u0010h\u001a\u00020\u001cH\u0000¢\u0006\u0002\biJ\u001d\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0I2\u0006\u0010N\u001a\u00020\u001cH\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u0004\u0018\u00010/2\u0006\u0010N\u001a\u00020\u001cJ\u0006\u0010m\u001a\u00020nJ\u0012\u0010o\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020\u001cH\u0002J\u0006\u0010p\u001a\u00020?J7\u0010q\u001a\u0002H^\"\u0004\b\u0000\u0010^2!\u0010_\u001a\u001d\u0012\u0013\u0012\u00110C¢\u0006\f\ba\u0012\b\bb\u0012\u0004\b\b(9\u0012\u0004\u0012\u0002H^0`H\u0086\b¢\u0006\u0002\u0010cJ \u0010r\u001a\u00020\u001c*\u00060sj\u0002`t2\u0006\u0010<\u001a\u00020\u001c2\u0006\u0010u\u001a\u00020\u001cH\u0002R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0&2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0&@BX\u0086\u000e¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u001e\u0010+\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR:\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u0001`0X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"¨\u0006v"}, m13558d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "()V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "getCalledByMap$runtime_release", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime_release", "(Landroidx/collection/MutableIntObjectMap;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "<set-?>", "", "groups", "getGroups", "()[I", "", "groupsSize", "getGroupsSize", "()I", "isEmpty", "", "()Z", "lock", "", "readers", "", "slots", "getSlots", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "writer", "getWriter$runtime_release", "anchor", "index", "anchorIndex", "close", "", "reader", "Landroidx/compose/runtime/SlotReader;", "close$runtime_release", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "collectCalledByInformation", "collectSourceInformation", "containsMark", "dataIndexes", "", "find", "identityToFind", "findEffectiveRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "group", "groupContainsAnchor", "groupIndex", "groupSizes", "invalidateGroupsWithKey", TypedValues.AttributesType.S_TARGET, "invalidateGroupsWithKey$runtime_release", "iterator", "", "keys", "nodes", "openReader", "openWriter", "ownsAnchor", "parentIndexes", "read", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setTo", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "slot", "slotIndex", "slot$runtime_release", "slotsOf", "slotsOf$runtime_release", "sourceInformationOf", "toDebugString", "", "tryAnchor", "verifyWellFormed", "write", "emitGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "level", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n158#1,7:4029\n174#1,4:4036\n179#1,3:4047\n27#2:3964\n33#2,2:4022\n1#3:3965\n1#3:4046\n4643#4,5:3966\n4643#4,5:3971\n4643#4,5:3976\n4643#4,5:3992\n4643#4,5:3997\n4643#4,5:4007\n4643#4,5:4012\n4643#4,5:4017\n33#5,5:3981\n33#5,5:4002\n33#5,5:4024\n48#5,5:4052\n48#5,5:4057\n33#5,5:4066\n33#5,5:4071\n33#5,5:4077\n33#5,5:4082\n48#5,5:4099\n48#5,5:4104\n48#5,5:4109\n48#5,5:4116\n48#5,5:4121\n48#5,5:4126\n48#5,5:4134\n48#5,5:4141\n48#5,5:4147\n48#5,5:4152\n48#5,5:4159\n33#5,5:4168\n33#5,5:4173\n3825#6,6:3986\n3698#6:4050\n3746#6:4051\n3726#6:4087\n3732#6:4088\n3689#6:4089\n3698#6:4090\n3672#6:4091\n3666#6:4092\n3669#6:4093\n3681#6:4094\n3777#6:4095\n3777#6:4096\n3777#6:4097\n3746#6:4098\n3777#6:4114\n3777#6:4115\n3666#6:4131\n3672#6:4132\n3681#6:4133\n3666#6:4139\n3669#6:4140\n3732#6:4146\n3708#6:4157\n3698#6:4158\n3777#6:4179\n33#7,6:4040\n33#7,4:4062\n38#7:4076\n33#7,4:4164\n38#7:4178\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n346#1:4029,7\n382#1:4036,4\n382#1:4047,3\n123#1:3964\n268#1:4022,2\n382#1:4046\n202#1:3966,5\n203#1:3971,5\n219#1:3976,5\n226#1:3992,5\n237#1:3997,5\n254#1:4007,5\n255#1:4012,5\n265#1:4017,5\n220#1:3981,5\n238#1:4002,5\n294#1:4024,5\n493#1:4052,5\n500#1:4057,5\n509#1:4066,5\n512#1:4071,5\n533#1:4077,5\n534#1:4082,5\n434#1:4099,5\n439#1:4104,5\n442#1:4109,5\n448#1:4116,5\n451#1:4121,5\n453#1:4126,5\n458#1:4134,5\n462#1:4141,5\n471#1:4147,5\n476#1:4152,5\n481#1:4159,5\n521#1:4168,5\n522#1:4173,5\n221#1:3986,6\n399#1:4050\n418#1:4051\n588#1:4087\n593#1:4088\n596#1:4089\n599#1:4090\n605#1:4091\n612#1:4092\n613#1:4093\n615#1:4094\n660#1:4095\n661#1:4096\n667#1:4097\n433#1:4098\n446#1:4114\n447#1:4115\n455#1:4131\n456#1:4132\n457#1:4133\n461#1:4139\n462#1:4140\n469#1:4146\n480#1:4157\n481#1:4158\n589#1:4179\n384#1:4040,6\n507#1:4062,4\n507#1:4076\n518#1:4164,4\n518#1:4178\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public static final int $stable = 8;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private final Object lock = new Object();
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i10, int i11) {
        String sourceInformation;
        for (int i12 = 0; i12 < i11; i12++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i10);
        sb.append(")");
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(i10);
        if (groupSourceInformationSourceInformationOf != null && (sourceInformation = groupSourceInformationSourceInformationOf.getSourceInformation()) != null && (StringsKt.startsWith$default(sourceInformation, "C(", false, 2, (Object) null) || StringsKt.startsWith$default(sourceInformation, "CC(", false, 2, (Object) null))) {
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) sourceInformation, "(", 0, false, 6, (Object) null) + 1;
            int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) sourceInformation, ')', 0, false, 6, (Object) null);
            sb.append(" ");
            String strSubstring = sourceInformation.substring(iIndexOf$default, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        int i13 = i10 * 5;
        sb.append(this.groups[i13]);
        int iGroupSize = SlotTableKt.groupSize(this.groups, i10);
        sb.append(", nodes=");
        int i14 = i13 + 1;
        sb.append(this.groups[i14] & RectListKt.Lower26Bits);
        sb.append(", size=");
        sb.append(iGroupSize);
        if ((this.groups[i14] & 134217728) != 0) {
            sb.append(", mark");
        }
        if ((this.groups[i14] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i10);
        int iEmitGroup = i10 + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex < 0 || iEmitGroup$dataIndex > iEmitGroup$dataIndex2 || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if ((this.groups[i14] & 536870912) != 0) {
                sb.append(" objectKey=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.objectKeyIndex(this.groups, i10)]), 10));
            }
            if ((this.groups[i14] & 1073741824) != 0) {
                sb.append(" node=" + SlotTableKt.summarize(String.valueOf(this.slots[this.groups[i13 + 4]]), 10));
            }
            if ((this.groups[i14] & 268435456) != 0) {
                sb.append(" aux=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.auxIndex(this.groups, i10)]), 10));
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i15 = iSlotAnchor; i15 < iEmitGroup$dataIndex2; i15++) {
                    if (i15 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(SlotTableKt.summarize(String.valueOf(this.slots[i15]), 10));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i16 = i10 + iGroupSize;
        while (iEmitGroup < i16) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i11 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i10) {
        return i10 >= slotTable.groupsSize ? slotTable.slotsSize : slotTable.groups[(i10 * 5) + 4];
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        int i10 = group;
        while (i10 > 0) {
            Iterator<Object> it = new DataIterator(this, i10).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i10 != group) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i10 = this.groups[(i10 * 5) + 2];
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader slotReader, MutableIntSet mutableIntSet, List<Anchor> list, Ref.BooleanRef booleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (!mutableIntSet.contains(groupKey)) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$20$scanGroup(slotReader, mutableIntSet, list, booleanRef, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (booleanRef.element) {
            RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrent());
            if (recomposeScopeImplFindEffectiveRecomposeScope2 != null) {
                list2.add(recomposeScopeImplFindEffectiveRecomposeScope2);
                Anchor anchor = recomposeScopeImplFindEffectiveRecomposeScope2.getAnchor();
                if (anchor != null && anchor.getLocation() == slotReader.getCurrent() && (recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                    list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                }
            } else {
                booleanRef.element = false;
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
        int i10;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i10 = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.find(this.anchors, index, i10);
    }

    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i10, int i11) {
        int i12 = intRef.element;
        int i13 = i12 + 1;
        intRef.element = i13;
        int i14 = i12 * 5;
        int i15 = slotTable.groups[i14 + 2];
        if (!(i15 == i10)) {
            PreconditionsKt.throwIllegalStateException("Invalid parent index detected at " + i12 + ", expected parent index to be " + i10 + " found " + i15);
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i12) + i12;
        if (!(iGroupSize <= slotTable.groupsSize)) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i12);
        }
        if (!(iGroupSize <= i11)) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i12);
        }
        int[] iArr = slotTable.groups;
        int i16 = i14 + 4;
        int i17 = iArr[i16];
        int i18 = i12 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : iArr[(i13 * 5) + 4];
        if (!(i18 <= slotTable.slots.length)) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i12 + " extend past the end of the slot table");
        }
        if (!(i17 <= i18)) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i12);
        }
        if (!(SlotTableKt.slotAnchor(slotTable.groups, i12) <= i18)) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i12);
        }
        int i19 = i14 + 1;
        int i20 = slotTable.groups[i19];
        if (!(i18 - i17 >= (((i20 & 1073741824) != 0 ? 1 : 0) + ((536870912 & i20) != 0 ? 1 : 0)) + ((i20 & 268435456) != 0 ? 1 : 0))) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i12);
        }
        int[] iArr2 = slotTable.groups;
        boolean z9 = (iArr2[i19] & 1073741824) != 0;
        if (!((z9 && slotTable.slots[iArr2[i16]] == null) ? false : true)) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i12);
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (intRef.element < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(intRef, slotTable, i12, iGroupSize);
        }
        int[] iArr3 = slotTable.groups;
        int i21 = iArr3[i19] & RectListKt.Lower26Bits;
        int iGroupSize2 = SlotTableKt.groupSize(iArr3, i12);
        if (!(i21 == iVerifyWellFormed$validateGroup)) {
            PreconditionsKt.throwIllegalStateException("Incorrect node count detected at " + i12 + ", expected " + i21 + ", received " + iVerifyWellFormed$validateGroup);
        }
        int i22 = intRef.element - i12;
        if (!(iGroupSize2 == i22)) {
            PreconditionsKt.throwIllegalStateException("Incorrect slot count detected at " + i12 + ", expected " + iGroupSize2 + ", received " + i22);
        }
        int[] iArr4 = slotTable.groups;
        if ((iArr4[i19] & 201326592) != 0) {
            if (!(i12 <= 0 || (iArr4[(i10 * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0)) {
                PreconditionsKt.throwIllegalStateException("Expected group " + i10 + " to record it contains a mark because " + i12 + " does");
            }
        }
        if (z9) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = groups.get(i10);
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

    public final Anchor anchor(int index) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z9 = false;
        if (index >= 0 && index < this.groupsSize) {
            z9 = true;
        }
        if (!z9) {
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

    public final int anchorIndex(Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final void close$runtime_release(SlotReader reader, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
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
                    Unit unit = Unit.INSTANCE;
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
    public CompositionGroup find(Object identityToFind) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime_release() {
        return this.calledByMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

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

    public final boolean groupContainsAnchor(int groupIndex, Anchor anchor) {
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

    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(target);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(target)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$20$scanGroup(slotReaderOpenReader, mutableIntSet2, arrayList, booleanRef, this, arrayList2);
            Unit unit = Unit.INSTANCE;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Anchor anchor = (Anchor) arrayList.get(i10);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashCurrentGroup();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close(true);
                if (booleanRef.element) {
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
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

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

    public final boolean ownsAnchor(Anchor anchor) {
        int iSearch;
        return anchor.getValid() && (iSearch = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(iSearch), anchor);
    }

    public final <T> T read(Function1<? super SlotReader, ? extends T> block) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return block.invoke(slotReaderOpenReader);
        } finally {
            InlineMarker.finallyStart(1);
            slotReaderOpenReader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setCalledByMap$runtime_release(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setSourceInformationMap$runtime_release(HashMap<Anchor, GroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    public final void setTo$runtime_release(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors, HashMap<Anchor, GroupSourceInformation> sourceInformationMap, MutableIntObjectMap<MutableIntSet> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final void setVersion$runtime_release(int i10) {
        this.version = i10;
    }

    public final Object slot$runtime_release(int group, int slotIndex) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i10 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i10 < this.groupsSize ? this.groups[(i10 * 5) + 4] : this.slots.length) - iSlotAnchor) ? Composer.INSTANCE.getEmpty() : this.slots[iSlotAnchor + slotIndex];
    }

    public final List<Object> slotsOf$runtime_release(int group) {
        int[] iArr = this.groups;
        int i10 = iArr[(group * 5) + 4];
        int i11 = group + 1;
        return ArraysKt.toList(this.slots).subList(i10, i11 < this.groupsSize ? iArr[(i11 * 5) + 4] : this.slots.length);
    }

    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor anchorTryAnchor;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor = tryAnchor(group)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor);
    }

    public final String toDebugString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i10 = this.groupsSize;
        if (i10 > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i10) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void verifyWellFormed() {
        int i10;
        int i11;
        Ref.IntRef intRef = new Ref.IntRef();
        int i12 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i10 = intRef.element;
                i11 = this.groupsSize;
                if (i10 >= i11) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(intRef, this, -1, i10 + SlotTableKt.groupSize(this.groups, i10));
                }
            }
            if (!(i10 == i11)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i13 = this.slotsSize; i13 < length; i13++) {
            if (!(this.slots[i13] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i13);
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            int indexFor = arrayList.get(i14).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i12 < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i14++;
            i12 = indexFor;
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

    public final <T> T write(Function1<? super SlotWriter, ? extends T> block) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            T tInvoke = block.invoke(slotWriterOpenWriter);
            InlineMarker.finallyStart(1);
            slotWriterOpenWriter.close(true);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            slotWriterOpenWriter.close(false);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final void close$runtime_release(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors, HashMap<Anchor, GroupSourceInformation> sourceInformationMap, MutableIntObjectMap<MutableIntSet> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }
}
