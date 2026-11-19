package androidx.compose.foundation.lazy.layout;

import androidx.compose.p013ui.semantics.CollectionInfo;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes.dex */
public interface LazyLayoutSemanticState {
    CollectionInfo collectionInfo();

    int getContentPadding();

    float getMaxScrollOffset();

    float getScrollOffset();

    int getViewport();

    Object scrollToItem(int i10, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
