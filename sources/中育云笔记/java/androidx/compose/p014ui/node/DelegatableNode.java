package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;

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
