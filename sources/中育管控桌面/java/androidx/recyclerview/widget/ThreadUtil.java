package androidx.recyclerview.widget;

import androidx.recyclerview.widget.TileList;

/* loaded from: classes3.dex */
interface ThreadUtil<T> {

    public interface BackgroundCallback<T> {
        void loadTile(int i6, int i7);

        void recycleTile(TileList.Tile<T> tile);

        void refresh(int i6);

        void updateRange(int i6, int i7, int i8, int i9, int i10);
    }

    public interface MainThreadCallback<T> {
        void addTile(int i6, TileList.Tile<T> tile);

        void removeTile(int i6, int i7);

        void updateItemCount(int i6, int i7);
    }

    BackgroundCallback<T> getBackgroundProxy(BackgroundCallback<T> backgroundCallback);

    MainThreadCallback<T> getMainThreadProxy(MainThreadCallback<T> mainThreadCallback);
}
