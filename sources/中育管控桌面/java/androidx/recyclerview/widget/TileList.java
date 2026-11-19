package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
class TileList<T> {
    Tile<T> mLastAccessedTile;
    final int mTileSize;
    private final SparseArray<Tile<T>> mTiles = new SparseArray<>(10);

    public static class Tile<T> {
        public int mItemCount;
        public final T[] mItems;
        Tile<T> mNext;
        public int mStartPosition;

        public Tile(Class<T> cls, int i6) {
            this.mItems = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i6));
        }

        public boolean containsPosition(int i6) {
            int i7 = this.mStartPosition;
            return i7 <= i6 && i6 < i7 + this.mItemCount;
        }

        public T getByPosition(int i6) {
            return this.mItems[i6 - this.mStartPosition];
        }
    }

    public TileList(int i6) {
        this.mTileSize = i6;
    }

    public Tile<T> addOrReplace(Tile<T> tile) {
        int iIndexOfKey = this.mTiles.indexOfKey(tile.mStartPosition);
        if (iIndexOfKey < 0) {
            this.mTiles.put(tile.mStartPosition, tile);
            return null;
        }
        Tile<T> tileValueAt = this.mTiles.valueAt(iIndexOfKey);
        this.mTiles.setValueAt(iIndexOfKey, tile);
        if (this.mLastAccessedTile == tileValueAt) {
            this.mLastAccessedTile = tile;
        }
        return tileValueAt;
    }

    public void clear() {
        this.mTiles.clear();
    }

    public Tile<T> getAtIndex(int i6) {
        if (i6 < 0 || i6 >= this.mTiles.size()) {
            return null;
        }
        return this.mTiles.valueAt(i6);
    }

    public T getItemAt(int i6) {
        Tile<T> tile = this.mLastAccessedTile;
        if (tile == null || !tile.containsPosition(i6)) {
            int iIndexOfKey = this.mTiles.indexOfKey(i6 - (i6 % this.mTileSize));
            if (iIndexOfKey < 0) {
                return null;
            }
            this.mLastAccessedTile = this.mTiles.valueAt(iIndexOfKey);
        }
        return this.mLastAccessedTile.getByPosition(i6);
    }

    public Tile<T> removeAtPos(int i6) {
        Tile<T> tile = this.mTiles.get(i6);
        if (this.mLastAccessedTile == tile) {
            this.mLastAccessedTile = null;
        }
        this.mTiles.delete(i6);
        return tile;
    }

    public int size() {
        return this.mTiles.size();
    }
}
