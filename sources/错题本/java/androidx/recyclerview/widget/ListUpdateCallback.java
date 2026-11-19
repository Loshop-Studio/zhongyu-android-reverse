package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public interface ListUpdateCallback {
    void onChanged(int i, int i8, @Nullable Object obj);

    void onInserted(int i, int i8);

    void onMoved(int i, int i8);

    void onRemoved(int i, int i8);
}
