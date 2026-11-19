package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(33)
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\r"}, m13558d2 = {"Landroidx/compose/foundation/PreferKeepClearNode;", "Landroidx/compose/foundation/RectListNode;", "rect", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function1;)V", "currentRects", "Landroidx/compose/runtime/collection/MutableVector;", "Landroid/graphics/Rect;", "updateRects", "", "rects", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPreferKeepClear.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClearNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,107:1\n1101#2:108\n1083#2,2:109\n136#3:111\n*S KotlinDebug\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClearNode\n*L\n98#1:108\n98#1:109,2\n99#1:111\n*E\n"})
/* loaded from: classes.dex */
final class PreferKeepClearNode extends RectListNode {
    public PreferKeepClearNode(Function1<? super LayoutCoordinates, Rect> function1) {
        super(function1);
    }

    @Override // androidx.compose.foundation.RectListNode
    public MutableVector<android.graphics.Rect> currentRects() {
        MutableVector<android.graphics.Rect> mutableVector = new MutableVector<>(new android.graphics.Rect[16], 0);
        mutableVector.addAll(mutableVector.getSize(), getView().getPreferKeepClearRects());
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public void updateRects(MutableVector<android.graphics.Rect> rects) {
        getView().setPreferKeepClearRects(rects.asMutableList());
    }
}
