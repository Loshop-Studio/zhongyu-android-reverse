package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class ListPreloader<T> implements AbsListView.OnScrollListener {
    private int lastEnd;
    private int lastStart;
    private final int maxPreload;
    private final PreloadSizeProvider<T> preloadDimensionProvider;
    private final PreloadModelProvider<T> preloadModelProvider;
    private final PreloadTargetQueue preloadTargetQueue;
    private final RequestManager requestManager;
    private int totalItemCount;
    private int lastFirstVisible = -1;
    private boolean isIncreasing = true;

    public interface PreloadModelProvider<U> {
        List<U> getPreloadItems(int i4);

        RequestBuilder<?> getPreloadRequestBuilder(U u3);
    }

    public interface PreloadSizeProvider<T> {
        int[] getPreloadSize(T t3, int i4, int i5);
    }

    private static final class PreloadTarget implements Target<Object> {
        int photoHeight;
        int photoWidth;
        private Request request;

        PreloadTarget() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public Request getRequest() {
            return this.request;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void getSize(SizeReadyCallback sizeReadyCallback) {
            sizeReadyCallback.onSizeReady(this.photoWidth, this.photoHeight);
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onDestroy() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadStarted(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Object obj, Transition<? super Object> transition) {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStop() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void removeCallback(SizeReadyCallback sizeReadyCallback) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void setRequest(Request request) {
            this.request = request;
        }
    }

    private static final class PreloadTargetQueue {
        final Queue<PreloadTarget> queue;

        PreloadTargetQueue(int i4) {
            this.queue = Util.createQueue(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                this.queue.offer(new PreloadTarget());
            }
        }

        public PreloadTarget next(int i4, int i5) {
            PreloadTarget preloadTargetPoll = this.queue.poll();
            this.queue.offer(preloadTargetPoll);
            preloadTargetPoll.photoWidth = i4;
            preloadTargetPoll.photoHeight = i5;
            return preloadTargetPoll;
        }
    }

    public ListPreloader(RequestManager requestManager, PreloadModelProvider<T> preloadModelProvider, PreloadSizeProvider<T> preloadSizeProvider, int i4) {
        this.requestManager = requestManager;
        this.preloadModelProvider = preloadModelProvider;
        this.preloadDimensionProvider = preloadSizeProvider;
        this.maxPreload = i4;
        this.preloadTargetQueue = new PreloadTargetQueue(i4 + 1);
    }

    private void cancelAll() {
        for (int i4 = 0; i4 < this.preloadTargetQueue.queue.size(); i4++) {
            this.requestManager.clear(this.preloadTargetQueue.next(0, 0));
        }
    }

    private void preload(int i4, boolean z3) {
        if (this.isIncreasing != z3) {
            this.isIncreasing = z3;
            cancelAll();
        }
        preload(i4, (z3 ? this.maxPreload : -this.maxPreload) + i4);
    }

    private void preloadAdapterPosition(List<T> list, int i4, boolean z3) {
        int size = list.size();
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                preloadItem(list.get(i5), i4, i5);
            }
            return;
        }
        for (int i6 = size - 1; i6 >= 0; i6--) {
            preloadItem(list.get(i6), i4, i6);
        }
    }

    private void preloadItem(T t3, int i4, int i5) {
        int[] preloadSize;
        RequestBuilder<?> preloadRequestBuilder;
        if (t3 == null || (preloadSize = this.preloadDimensionProvider.getPreloadSize(t3, i4, i5)) == null || (preloadRequestBuilder = this.preloadModelProvider.getPreloadRequestBuilder(t3)) == null) {
            return;
        }
        preloadRequestBuilder.into((RequestBuilder<?>) this.preloadTargetQueue.next(preloadSize[0], preloadSize[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.totalItemCount = i6;
        int i7 = this.lastFirstVisible;
        if (i4 > i7) {
            preload(i5 + i4, true);
        } else if (i4 < i7) {
            preload(i4, false);
        }
        this.lastFirstVisible = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    private void preload(int i4, int i5) {
        int iMin;
        int iMax;
        if (i4 < i5) {
            iMax = Math.max(this.lastEnd, i4);
            iMin = i5;
        } else {
            iMin = Math.min(this.lastStart, i4);
            iMax = i5;
        }
        int iMin2 = Math.min(this.totalItemCount, iMin);
        int iMin3 = Math.min(this.totalItemCount, Math.max(0, iMax));
        if (i4 < i5) {
            for (int i6 = iMin3; i6 < iMin2; i6++) {
                preloadAdapterPosition(this.preloadModelProvider.getPreloadItems(i6), i6, true);
            }
        } else {
            for (int i7 = iMin2 - 1; i7 >= iMin3; i7--) {
                preloadAdapterPosition(this.preloadModelProvider.getPreloadItems(i7), i7, false);
            }
        }
        this.lastStart = iMin3;
        this.lastEnd = iMin2;
    }
}
