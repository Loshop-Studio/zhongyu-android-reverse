package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface ReceiveContentListener {
    default void onDragEnd() {
    }

    default void onDragEnter() {
    }

    default void onDragExit() {
    }

    default void onDragStart() {
    }

    TransferableContent onReceive(TransferableContent transferableContent);
}
