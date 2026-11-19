package androidx.compose.material3.internal;

/* loaded from: classes2.dex */
public interface DraggableAnchors<T> {
    T closestAnchor(float f10);

    T closestAnchor(float f10, boolean z10);

    int getSize();

    boolean hasAnchorFor(T t10);

    float maxAnchor();

    float minAnchor();

    float positionOf(T t10);
}
