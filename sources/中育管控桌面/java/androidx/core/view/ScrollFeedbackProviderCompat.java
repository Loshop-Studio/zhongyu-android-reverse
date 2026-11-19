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
        public void onScrollLimit(int i6, int i7, int i8, boolean z6) {
            this.mProvider.onScrollLimit(i6, i7, i8, z6);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int i6, int i7, int i8, int i9) {
            this.mProvider.onScrollProgress(i6, i7, i8, i9);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int i6, int i7, int i8) {
            this.mProvider.onSnapToItem(i6, i7, i8);
        }
    }

    public static class ScrollFeedbackProviderBaseImpl implements ScrollFeedbackProviderImpl {
        private ScrollFeedbackProviderBaseImpl() {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int i6, int i7, int i8, boolean z6) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int i6, int i7, int i8, int i9) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int i6, int i7, int i8) {
        }
    }

    public interface ScrollFeedbackProviderImpl {
        void onScrollLimit(int i6, int i7, int i8, boolean z6);

        void onScrollProgress(int i6, int i7, int i8, int i9);

        void onSnapToItem(int i6, int i7, int i8);
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

    public void onScrollLimit(int i6, int i7, int i8, boolean z6) {
        this.mImpl.onScrollLimit(i6, i7, i8, z6);
    }

    public void onScrollProgress(int i6, int i7, int i8, int i9) {
        this.mImpl.onScrollProgress(i6, i7, i8, i9);
    }

    public void onSnapToItem(int i6, int i7, int i8) {
        this.mImpl.onSnapToItem(i6, i7, i8);
    }
}
