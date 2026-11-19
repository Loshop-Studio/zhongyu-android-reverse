package androidx.compose.runtime;

/* loaded from: classes2.dex */
final class AnchoredGroupPath extends SourceInformationGroupPath {
    private final int group;

    public AnchoredGroupPath(int i10) {
        super(null);
        this.group = i10;
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    public Object getIdentity(SlotTable slotTable) {
        return slotTable.anchor(this.group);
    }
}
