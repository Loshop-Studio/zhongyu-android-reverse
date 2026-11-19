package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import p181hd.InterfaceC9540l;

@RequiresApi(33)
/* loaded from: classes.dex */
final class PreferKeepClearNode extends RectListNode {
    public PreferKeepClearNode(InterfaceC9540l interfaceC9540l) {
        super(interfaceC9540l);
    }

    @Override // androidx.compose.foundation.RectListNode
    public MutableVector<Rect> currentRects() {
        MutableVector<Rect> mutableVector = new MutableVector<>(new Rect[16], 0);
        mutableVector.addAll(mutableVector.getSize(), getView().getPreferKeepClearRects());
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public void updateRects(MutableVector<Rect> mutableVector) {
        getView().setPreferKeepClearRects(mutableVector.asMutableList());
    }
}
