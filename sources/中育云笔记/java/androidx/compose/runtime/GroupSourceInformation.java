package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class GroupSourceInformation {
    public static final int $stable = 8;
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;
    private ArrayList<Object> groups;
    private final int key;
    private String sourceInformation;

    public GroupSourceInformation(int i10, String str, int i11) {
        this.key = i10;
        this.sourceInformation = str;
        this.dataStartOffset = i11;
    }

    private final void add(Object obj) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(obj);
    }

    private final boolean hasAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (AbstractC9979u.m20289b(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final GroupSourceInformation openInformation() {
        Object obj;
        GroupSourceInformation groupSourceInformationOpenInformation;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).closed) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (groupSourceInformationOpenInformation = groupSourceInformation.openInformation()) == null) ? this : groupSourceInformationOpenInformation;
    }

    public final void addGroupAfter(SlotWriter slotWriter, int i10, int i11) {
        Anchor anchorTryAnchor$runtime_release;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i12 = 0;
        if (i10 >= 0 && (anchorTryAnchor$runtime_release = slotWriter.tryAnchor$runtime_release(i10)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                }
                Object obj = arrayList.get(i12);
                if (AbstractC9979u.m20289b(obj, anchorTryAnchor$runtime_release) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(anchorTryAnchor$runtime_release))) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        arrayList.add(i12, slotWriter.anchor(i11));
    }

    public final void close(int i10) {
        this.closed = true;
        this.dataEndOffset = i10;
    }

    public final void endGrouplessCall(int i10) {
        openInformation().close(i10);
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getDataEndOffset() {
        return this.dataEndOffset;
    }

    public final int getDataStartOffset() {
        return this.dataStartOffset;
    }

    public final ArrayList<Object> getGroups() {
        return this.groups;
    }

    public final int getKey() {
        return this.key;
    }

    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final boolean removeAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (AbstractC9979u.m20289b(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).removeAnchor(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void reportGroup(SlotWriter slotWriter, int i10) {
        openInformation().add(slotWriter.anchor(i10));
    }

    public final void setClosed(boolean z10) {
        this.closed = z10;
    }

    public final void setDataEndOffset(int i10) {
        this.dataEndOffset = i10;
    }

    public final void setGroups(ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }

    public final void setSourceInformation(String str) {
        this.sourceInformation = str;
    }

    public final void startGrouplessCall(int i10, String str, int i11) {
        openInformation().add(new GroupSourceInformation(i10, str, i11));
    }

    public final void reportGroup(SlotTable slotTable, int i10) {
        openInformation().add(slotTable.anchor(i10));
    }
}
