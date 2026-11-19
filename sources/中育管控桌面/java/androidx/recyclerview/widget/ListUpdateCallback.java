package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ListUpdateCallback {
    void onChanged(int i6, int i7, @Nullable Object obj);

    void onInserted(int i6, int i7);

    void onMoved(int i6, int i7);

    void onRemoved(int i6, int i7);
}
