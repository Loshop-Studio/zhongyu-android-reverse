package androidx.compose.foundation.lazy.layout;

import androidx.compose.p014ui.semantics.CollectionInfo;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public interface LazyLayoutSemanticState {
    CollectionInfo collectionInfo();

    int getContentPadding();

    float getMaxScrollOffset();

    float getScrollOffset();

    int getViewport();

    Object scrollToItem(int i10, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
