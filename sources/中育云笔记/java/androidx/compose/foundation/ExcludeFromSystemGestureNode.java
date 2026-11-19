package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import p181hd.InterfaceC9540l;

@RequiresApi(29)
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureNode extends RectListNode {
    public ExcludeFromSystemGestureNode(InterfaceC9540l interfaceC9540l) {
        super(interfaceC9540l);
    }

    @Override // androidx.compose.foundation.RectListNode
    public MutableVector<Rect> currentRects() {
        MutableVector<Rect> mutableVector = new MutableVector<>(new Rect[16], 0);
        mutableVector.addAll(mutableVector.getSize(), getView().getSystemGestureExclusionRects());
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public void updateRects(MutableVector<Rect> mutableVector) {
        getView().setSystemGestureExclusionRects(mutableVector.asMutableList());
    }
}
