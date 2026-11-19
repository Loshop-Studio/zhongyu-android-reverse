package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* loaded from: classes2.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_DEFAULT = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final Impl mImpl;

    public static class Impl {
        static final int KEY_BEHAVIOR = 356039078;

        public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        public void controlWindowInsetsAnimation(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        public int getSystemBarsBehavior() {
            return 1;
        }

        public void hide(int i10) {
        }

        public boolean isAppearanceLightNavigationBars() {
            return false;
        }

        public boolean isAppearanceLightStatusBars() {
            return false;
        }

        public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        public void setAppearanceLightNavigationBars(boolean z10) {
        }

        public void setAppearanceLightStatusBars(boolean z10) {
        }

        public void setSystemBarsBehavior(int i10) {
        }

        public void show(int i10) {
        }
    }

    @RequiresApi(20)
    public static class Impl20 extends Impl {
        private final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected final Window mWindow;

        public Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mWindow = window;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        private void hideForType(int i10) {
            if (i10 == 1) {
                setSystemUiFlag(4);
            } else if (i10 == 2) {
                setSystemUiFlag(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.mSoftwareKeyboardControllerCompat.hide();
            }
        }

        private void showForType(int i10) {
            if (i10 == 1) {
                unsetSystemUiFlag(4);
                unsetWindowFlag(1024);
            } else if (i10 == 2) {
                unsetSystemUiFlag(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.mSoftwareKeyboardControllerCompat.show();
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void controlWindowInsetsAnimation(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public int getSystemBarsBehavior() {
            Object tag = this.mWindow.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void hide(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    hideForType(i11);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setSystemBarsBehavior(int i10) {
            this.mWindow.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                unsetSystemUiFlag(6144);
                return;
            }
            if (i10 == 1) {
                unsetSystemUiFlag(4096);
                setSystemUiFlag(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                unsetSystemUiFlag(2048);
                setSystemUiFlag(4096);
            }
        }

        public void setSystemUiFlag(int i10) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void setWindowFlag(int i10) {
            this.mWindow.addFlags(i10);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void show(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    showForType(i11);
                }
            }
        }

        public void unsetSystemUiFlag(int i10) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public void unsetWindowFlag(int i10) {
            this.mWindow.clearFlags(i10);
        }
    }

    @RequiresApi(23)
    public static class Impl23 extends Impl20 {
        public Impl23(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            return (this.mWindow.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z10) {
            if (!z10) {
                unsetSystemUiFlag(8192);
                return;
            }
            unsetWindowFlag(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            setWindowFlag(Integer.MIN_VALUE);
            setSystemUiFlag(8192);
        }
    }

    @RequiresApi(26)
    public static class Impl26 extends Impl23 {
        public Impl26(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            return (this.mWindow.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z10) {
            if (!z10) {
                unsetSystemUiFlag(16);
                return;
            }
            unsetWindowFlag(134217728);
            setWindowFlag(Integer.MIN_VALUE);
            setSystemUiFlag(16);
        }
    }

    @RequiresApi(31)
    public static class Impl31 extends Impl30 {
        public Impl31(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        @SuppressLint({"WrongConstant"})
        public int getSystemBarsBehavior() {
            return this.mInsetsController.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setSystemBarsBehavior(int i10) {
            this.mInsetsController.setSystemBarsBehavior(i10);
        }

        public Impl31(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(windowInsetsController, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }
    }

    @RequiresApi(35)
    public static class Impl35 extends Impl31 {
        public Impl35(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            return (this.mInsetsController.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            return (this.mInsetsController.getSystemBarsAppearance() & 8) != 0;
        }

        public Impl35(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(windowInsetsController, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }
    }

    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(WindowInsetsControllerCompat windowInsetsControllerCompat, int i10);
    }

    @RequiresApi(30)
    @Deprecated
    private WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.mImpl = new Impl35(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
        } else {
            this.mImpl = new Impl30(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
        }
    }

    @RequiresApi(30)
    @Deprecated
    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.mImpl.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    public void controlWindowInsetsAnimation(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        this.mImpl.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat);
    }

    @SuppressLint({"WrongConstant"})
    public int getSystemBarsBehavior() {
        return this.mImpl.getSystemBarsBehavior();
    }

    public void hide(int i10) {
        this.mImpl.hide(i10);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.mImpl.isAppearanceLightNavigationBars();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.mImpl.isAppearanceLightStatusBars();
    }

    public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.mImpl.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    public void setAppearanceLightNavigationBars(boolean z10) {
        this.mImpl.setAppearanceLightNavigationBars(z10);
    }

    public void setAppearanceLightStatusBars(boolean z10) {
        this.mImpl.setAppearanceLightStatusBars(z10);
    }

    public void setSystemBarsBehavior(int i10) {
        this.mImpl.setSystemBarsBehavior(i10);
    }

    public void show(int i10) {
        this.mImpl.show(i10);
    }

    @RequiresApi(30)
    public static class Impl30 extends Impl {
        final WindowInsetsControllerCompat mCompatController;
        final WindowInsetsController mInsetsController;
        private final SimpleArrayMap<OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> mListeners;
        final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected Window mWindow;

        public Impl30(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this(window.getInsetsController(), windowInsetsControllerCompat, softwareKeyboardControllerCompat);
            this.mWindow = window;
        }

        /* renamed from: a */
        public static /* synthetic */ void m1622a(Impl30 impl30, OnControllableInsetsChangedListener onControllableInsetsChangedListener, WindowInsetsController windowInsetsController, int i10) {
            if (impl30.mInsetsController == windowInsetsController) {
                onControllableInsetsChangedListener.onControllableInsetsChanged(impl30.mCompatController, i10);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void addOnControllableInsetsChangedListener(final OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            if (this.mListeners.containsKey(onControllableInsetsChangedListener)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener2 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.q2
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
                    WindowInsetsControllerCompat.Impl30.m1622a(this.f1441a, onControllableInsetsChangedListener, windowInsetsController, i10);
                }
            };
            this.mListeners.put(onControllableInsetsChangedListener, onControllableInsetsChangedListener2);
            this.mInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener2);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void controlWindowInsetsAnimation(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, final WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            this.mInsetsController.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new WindowInsetsAnimationControlListener() { // from class: androidx.core.view.WindowInsetsControllerCompat.Impl30.1
                private WindowInsetsAnimationControllerCompat mCompatAnimController = null;

                public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onCancelled(windowInsetsAnimationController == null ? null : this.mCompatAnimController);
                }

                public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onFinished(this.mCompatAnimController);
                }

                public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i11) {
                    WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                    this.mCompatAnimController = windowInsetsAnimationControllerCompat;
                    windowInsetsAnimationControlListenerCompat.onReady(windowInsetsAnimationControllerCompat, i11);
                }
            });
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        @SuppressLint({"WrongConstant"})
        public int getSystemBarsBehavior() {
            Window window = this.mWindow;
            if (window == null) {
                return this.mInsetsController.getSystemBarsBehavior();
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void hide(int i10) {
            if ((i10 & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.hide();
            }
            this.mInsetsController.hide(i10 & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            return (this.mInsetsController.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            return (this.mInsetsController.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void removeOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerM1715a = AbstractC3651o2.m1715a(this.mListeners.remove(onControllableInsetsChangedListener));
            if (onControllableInsetsChangedListenerM1715a != null) {
                this.mInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerM1715a);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z10) {
            if (z10) {
                if (this.mWindow != null) {
                    setSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(16, 16);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z10) {
            if (z10) {
                if (this.mWindow != null) {
                    setSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setSystemBarsBehavior(int i10) {
            Window window = this.mWindow;
            if (window == null) {
                this.mInsetsController.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                unsetSystemUiFlag(6144);
                return;
            }
            if (i10 == 1) {
                unsetSystemUiFlag(4096);
                setSystemUiFlag(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                unsetSystemUiFlag(2048);
                setSystemUiFlag(4096);
            }
        }

        public void setSystemUiFlag(int i10) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void show(int i10) {
            if ((i10 & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.show();
            }
            this.mInsetsController.show(i10 & (-9));
        }

        public void unsetSystemUiFlag(int i10) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public Impl30(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mListeners = new SimpleArrayMap<>();
            this.mInsetsController = windowInsetsController;
            this.mCompatController = windowInsetsControllerCompat;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.mImpl = new Impl35(window, this, softwareKeyboardControllerCompat);
            return;
        }
        if (i10 >= 30) {
            this.mImpl = new Impl30(window, this, softwareKeyboardControllerCompat);
        } else if (i10 >= 26) {
            this.mImpl = new Impl26(window, softwareKeyboardControllerCompat);
        } else {
            this.mImpl = new Impl23(window, softwareKeyboardControllerCompat);
        }
    }
}
