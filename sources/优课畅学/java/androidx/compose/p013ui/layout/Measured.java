package androidx.compose.p013ui.layout;

/* loaded from: classes2.dex */
public interface Measured {
    int get(AlignmentLine alignmentLine);

    int getMeasuredHeight();

    int getMeasuredWidth();

    default Object getParentData() {
        return null;
    }
}
