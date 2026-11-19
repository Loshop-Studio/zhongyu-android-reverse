package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public class ScrollFeedbackProviderCompat {
    private final ScrollFeedbackProviderImpl mImpl;

    @RequiresApi(35)
    public static class ScrollFeedbackProviderApi35Impl implements ScrollFeedbackProviderImpl {
        private final ScrollFeedbackProvider mProvider;

        public ScrollFeedbackProviderApi35Impl(View view) {
            this.mProvider = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int i10, int i11, int i12, boolean z9) {
            this.mProvider.onScrollLimit(i10, i11, i12, z9);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.mProvider.onScrollProgress(i10, i11, i12, i13);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int i10, int i11, int i12) {
            this.mProvider.onSnapToItem(i10, i11, i12);
        }
    }

    public static class ScrollFeedbackProviderBaseImpl implements ScrollFeedbackProviderImpl {
        private ScrollFeedbackProviderBaseImpl() {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int i10, int i11, int i12, boolean z9) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int i10, int i11, int i12) {
        }
    }

    public interface ScrollFeedbackProviderImpl {
        void onScrollLimit(int i10, int i11, int i12, boolean z9);

        void onScrollProgress(int i10, int i11, int i12, int i13);

        void onSnapToItem(int i10, int i11, int i12);
    }

    private ScrollFeedbackProviderCompat(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.mImpl = new ScrollFeedbackProviderApi35Impl(view);
        } else {
            this.mImpl = new ScrollFeedbackProviderBaseImpl();
        }
    }

    public static ScrollFeedbackProviderCompat createProvider(View view) {
        return new ScrollFeedbackProviderCompat(view);
    }

    public void onScrollLimit(int i10, int i11, int i12, boolean z9) {
        this.mImpl.onScrollLimit(i10, i11, i12, z9);
    }

    public void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.mImpl.onScrollProgress(i10, i11, i12, i13);
    }

    public void onSnapToItem(int i10, int i11, int i12) {
        this.mImpl.onSnapToItem(i10, i11, i12);
    }
}
