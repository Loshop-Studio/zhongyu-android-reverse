package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes3.dex */
public interface ItemTouchUIUtil {
    void clearView(View view);

    void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f6, float f7, int i6, boolean z6);

    void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f6, float f7, int i6, boolean z6);

    void onSelected(View view);
}
