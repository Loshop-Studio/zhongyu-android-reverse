package androidx.compose.foundation.gestures;

/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    T anchorAt(int i10);

    T closestAnchor(float f10);

    T closestAnchor(float f10, boolean z10);

    int getSize();

    boolean hasPositionFor(T t10);

    float maxPosition();

    float minPosition();

    float positionAt(int i10);

    float positionOf(T t10);
}
