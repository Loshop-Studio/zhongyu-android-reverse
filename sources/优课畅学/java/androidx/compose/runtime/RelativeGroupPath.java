package androidx.compose.runtime;

/* loaded from: classes2.dex */
final class RelativeGroupPath extends SourceInformationGroupPath {
    private final int index;
    private final SourceInformationGroupPath parent;

    public RelativeGroupPath(SourceInformationGroupPath sourceInformationGroupPath, int i10) {
        super(null);
        this.parent = sourceInformationGroupPath;
        this.index = i10;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    public Object getIdentity(SlotTable slotTable) {
        return new SourceInformationSlotTableGroupIdentity(this.parent.getIdentity(slotTable), this.index);
    }

    public final int getIndex() {
        return this.index;
    }

    public final SourceInformationGroupPath getParent() {
        return this.parent;
    }
}
