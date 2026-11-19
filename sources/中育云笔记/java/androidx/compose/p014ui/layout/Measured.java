package androidx.compose.p014ui.layout;

/* loaded from: classes2.dex */
public interface Measured {
    int get(AlignmentLine alignmentLine);

    int getMeasuredHeight();

    int getMeasuredWidth();

    default Object getParentData() {
        return null;
    }
}
