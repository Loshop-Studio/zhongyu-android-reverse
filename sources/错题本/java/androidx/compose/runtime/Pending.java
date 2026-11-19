package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)\"\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010$R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R-\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003038FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003098F¢\u0006\u0006\u001a\u0004\b:\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m5110d2 = {"Landroidx/compose/runtime/Pending;", "", "", "Landroidx/compose/runtime/KeyInfo;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "getNext", "(ILjava/lang/Object;)Landroidx/compose/runtime/KeyInfo;", "keyInfo", "", "recordUsed", "(Landroidx/compose/runtime/KeyInfo;)Z", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Ld6/s;", "registerMoveSlot", "(II)V", "count", "registerMoveNode", "(III)V", "insertIndex", "registerInsert", "(Landroidx/compose/runtime/KeyInfo;I)V", "group", "newCount", "updateNodeCount", "(II)Z", "slotPositionOf", "(Landroidx/compose/runtime/KeyInfo;)I", "nodePositionOf", "updatedNodeCountOf", "Ljava/util/List;", "getKeyInfos", "()Ljava/util/List;", "I", "getStartIndex", "()I", "groupIndex", "getGroupIndex", "setGroupIndex", "(I)V", "usedKeys", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/runtime/GroupInfo;", "groupInfos", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/runtime/collection/MultiValueMap;", "keyMap$delegate", "Ld6/e;", "getKeyMap-fVlnmYg", "()Landroidx/collection/MutableScatterMap;", "keyMap", "", "getUsed", "used", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,4891:1\n33#2,5:4892\n397#3,3:4897\n354#3,6:4900\n364#3,3:4907\n367#3,9:4911\n400#3:4920\n397#3,3:4921\n354#3,6:4924\n364#3,3:4931\n367#3,9:4935\n400#3:4944\n397#3,3:4945\n354#3,6:4948\n364#3,3:4955\n367#3,9:4959\n400#3:4968\n397#3,3:4969\n354#3,6:4972\n364#3,3:4979\n367#3,9:4983\n400#3:4992\n397#3,3:4993\n354#3,6:4996\n364#3,3:5003\n367#3,9:5007\n400#3:5016\n1399#4:4906\n1270#4:4910\n1399#4:4930\n1270#4:4934\n1399#4:4954\n1270#4:4958\n1399#4:4978\n1270#4:4982\n1399#4:5002\n1270#4:5006\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n135#1:4892,5\n179#1:4897,3\n179#1:4900,6\n179#1:4907,3\n179#1:4911,9\n179#1:4920\n185#1:4921,3\n185#1:4924,6\n185#1:4931,3\n185#1:4935,9\n185#1:4944\n195#1:4945,3\n195#1:4948,6\n195#1:4955,3\n195#1:4959,9\n195#1:4968\n201#1:4969,3\n201#1:4972,6\n201#1:4979,3\n201#1:4983,9\n201#1:4992\n221#1:4993,3\n221#1:4996,6\n221#1:5003,3\n221#1:5007,9\n221#1:5016\n179#1:4906\n179#1:4910\n185#1:4930\n185#1:4934\n195#1:4954\n195#1:4958\n201#1:4978\n201#1:4982\n221#1:5002\n221#1:5006\n*E\n"})
/* loaded from: classes.dex */
final class Pending {
    private int groupIndex;

    @NotNull
    private final MutableIntObjectMap<GroupInfo> groupInfos;

    @NotNull
    private final List<KeyInfo> keyInfos;

    /* renamed from: keyMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e keyMap;
    private final int startIndex;

    @NotNull
    private final List<KeyInfo> usedKeys;

    public Pending(@NotNull List<KeyInfo> list, int i) {
        this.keyInfos = list;
        this.startIndex = i;
        if (!(i >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i8 = 0; i8 < size; i8++) {
            KeyInfo keyInfo = this.keyInfos.get(i8);
            mutableIntObjectMap.set(keyInfo.getLocation(), new GroupInfo(i8, nodes, keyInfo.getNodes()));
            nodes += keyInfo.getNodes();
        }
        this.groupInfos = mutableIntObjectMap;
        this.keyMap = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                return MultiValueMap.m10185boximpl(m10061invokefVlnmYg());
            }

            /* renamed from: invoke-fVlnmYg, reason: not valid java name */
            public final MutableScatterMap<Object, Object> m10061invokefVlnmYg() {
                MutableScatterMap<Object, Object> mutableScatterMapMultiMap = ComposerKt.multiMap(this.this$0.getKeyInfos().size());
                Pending pending = this.this$0;
                int size2 = pending.getKeyInfos().size();
                for (int i9 = 0; i9 < size2; i9++) {
                    KeyInfo keyInfo2 = pending.getKeyInfos().get(i9);
                    MultiValueMap.m10184addimpl(mutableScatterMapMultiMap, ComposerKt.getJoinedKey(keyInfo2), keyInfo2);
                }
                return mutableScatterMapMultiMap;
            }
        });
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    @NotNull
    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    @NotNull
    /* renamed from: getKeyMap-fVlnmYg, reason: not valid java name */
    public final MutableScatterMap<Object, Object> m10060getKeyMapfVlnmYg() {
        return ((MultiValueMap) this.keyMap.getValue()).getMap();
    }

    @Nullable
    public final KeyInfo getNext(int key, @Nullable Object dataKey) {
        return (KeyInfo) MultiValueMap.m10197removeFirstimpl(m10060getKeyMapfVlnmYg(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    @NotNull
    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(@NotNull KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(@NotNull KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(@NotNull KeyInfo keyInfo, int insertIndex) {
        this.groupInfos.set(keyInfo.getLocation(), new GroupInfo(-1, insertIndex, 0));
    }

    public final void registerMoveNode(int from, int to, int count) {
        char c;
        long j7;
        char c9;
        long j8;
        char c10 = 7;
        long j9 = -9187201950435737472L;
        if (from > to) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << c10) & j10 & j9) != j9) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j10 & 255) < 128) {
                            c9 = c10;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i << 3) + i9];
                            j8 = j9;
                            int nodeIndex = groupInfo.getNodeIndex();
                            if (from <= nodeIndex && nodeIndex < from + count) {
                                groupInfo.setNodeIndex((nodeIndex - from) + to);
                            } else if (to <= nodeIndex && nodeIndex < from) {
                                groupInfo.setNodeIndex(nodeIndex + count);
                            }
                        } else {
                            c9 = c10;
                            j8 = j9;
                        }
                        j10 >>= 8;
                        i9++;
                        c10 = c9;
                        j9 = j8;
                    }
                    c = c10;
                    j7 = j9;
                    if (i8 != 8) {
                        return;
                    }
                } else {
                    c = c10;
                    j7 = j9;
                }
                if (i == length) {
                    return;
                }
                i++;
                c10 = c;
                j9 = j7;
            }
        } else {
            if (to <= from) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j11 = jArr2[i10];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j11 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i10 << 3) + i12];
                            int nodeIndex2 = groupInfo2.getNodeIndex();
                            if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                                groupInfo2.setNodeIndex((nodeIndex2 - from) + to);
                            } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to) {
                                groupInfo2.setNodeIndex(nodeIndex2 - count);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length2) {
                    return;
                } else {
                    i10++;
                }
            }
        }
    }

    public final void registerMoveSlot(int from, int to) {
        char c;
        long j7;
        char c9;
        long j8;
        char c10 = 7;
        long j9 = -9187201950435737472L;
        if (from > to) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << c10) & j10 & j9) != j9) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j10 & 255) < 128) {
                            c9 = c10;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i << 3) + i9];
                            j8 = j9;
                            int slotIndex = groupInfo.getSlotIndex();
                            if (slotIndex == from) {
                                groupInfo.setSlotIndex(to);
                            } else if (to <= slotIndex && slotIndex < from) {
                                groupInfo.setSlotIndex(slotIndex + 1);
                            }
                        } else {
                            c9 = c10;
                            j8 = j9;
                        }
                        j10 >>= 8;
                        i9++;
                        c10 = c9;
                        j9 = j8;
                    }
                    c = c10;
                    j7 = j9;
                    if (i8 != 8) {
                        return;
                    }
                } else {
                    c = c10;
                    j7 = j9;
                }
                if (i == length) {
                    return;
                }
                i++;
                c10 = c;
                j9 = j7;
            }
        } else {
            if (to <= from) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j11 = jArr2[i10];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j11 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i10 << 3) + i12];
                            int slotIndex2 = groupInfo2.getSlotIndex();
                            if (slotIndex2 == from) {
                                groupInfo2.setSlotIndex(to);
                            } else if (from + 1 <= slotIndex2 && slotIndex2 < to) {
                                groupInfo2.setSlotIndex(slotIndex2 - 1);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length2) {
                    return;
                } else {
                    i10++;
                }
            }
        }
    }

    public final void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    public final int slotPositionOf(@NotNull KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int group, int newCount) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(group);
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = newCount - groupInfo.getNodeCount();
        groupInfo.setNodeCount(newCount);
        if (nodeCount == 0) {
            return true;
        }
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i << 3) + i9];
                        if (groupInfo2.getNodeIndex() >= nodeIndex2 && !groupInfo2.equals(groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                            groupInfo2.setNodeIndex(nodeIndex);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final int updatedNodeCountOf(@NotNull KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
