package androidx.compose.foundation.lazy.layout;

import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.text.android.LayoutIntrinsics;
import androidx.constraintlayout.core.utils.GridCore;
import java.util.Comparator;
import kotlin.Pair;

/* renamed from: androidx.compose.foundation.lazy.layout.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1148a implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f756a;

    public /* synthetic */ C1148a(int i) {
        this.f756a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f756a) {
            case 0:
                return LazyLayoutMeasuredItemKt.LazyLayoutMeasuredItemIndexComparator$lambda$2((LazyLayoutMeasuredItem) obj, (LazyLayoutMeasuredItem) obj2);
            case 1:
                return LayoutNode.ZComparator$lambda$37((LayoutNode) obj, (LayoutNode) obj2);
            case 2:
                return LayoutIntrinsics.computeMinIntrinsicWidth$lambda$1((Pair) obj, (Pair) obj2);
            case 3:
                return GridCore.lambda$parseSpans$0((String) obj, (String) obj2);
            default:
                return ((Double) obj).compareTo((Double) obj2);
        }
    }
}
