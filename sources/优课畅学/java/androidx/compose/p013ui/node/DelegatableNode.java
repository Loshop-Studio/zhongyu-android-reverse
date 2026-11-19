package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Modifier;

/* loaded from: classes2.dex */
public interface DelegatableNode {

    public interface RegistrationHandle {
        void unregister();
    }

    Modifier.Node getNode();

    default void onDensityChange() {
    }

    default void onLayoutDirectionChange() {
    }
}
