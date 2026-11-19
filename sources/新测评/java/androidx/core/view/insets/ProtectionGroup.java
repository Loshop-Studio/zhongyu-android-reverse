package androidx.core.view.insets;

import android.graphics.RectF;
import androidx.core.graphics.Insets;
import androidx.core.view.insets.SystemBarStateMonitor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class ProtectionGroup implements SystemBarStateMonitor.Callback {
    private int mAnimationCount;
    private boolean mDisposed;
    private Insets mInsets;
    private Insets mInsetsIgnoringVisibility;
    private final SystemBarStateMonitor mMonitor;
    private final ArrayList<Protection> mProtections = new ArrayList<>();

    public ProtectionGroup(SystemBarStateMonitor systemBarStateMonitor, List<Protection> list) {
        Insets insets = Insets.NONE;
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets;
        addProtections(list, false);
        addProtections(list, true);
        systemBarStateMonitor.addCallback(this);
        this.mMonitor = systemBarStateMonitor;
    }

    private void addProtections(List<Protection> list, boolean z9) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Protection protection = list.get(i10);
            if (protection.occupiesCorners() == z9) {
                Object controller = protection.getController();
                if (controller != null) {
                    throw new IllegalStateException(protection + " is already controlled by " + controller);
                }
                protection.setController(this);
                this.mProtections.add(protection);
            }
        }
    }

    private void updateInsets() {
        Insets insetsMax = Insets.NONE;
        for (int size = this.mProtections.size() - 1; size >= 0; size--) {
            insetsMax = Insets.max(insetsMax, this.mProtections.get(size).dispatchInsets(this.mInsets, this.mInsetsIgnoringVisibility, insetsMax));
        }
    }

    public void dispose() {
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        this.mMonitor.removeCallback(this);
        for (int size = this.mProtections.size() - 1; size >= 0; size--) {
            this.mProtections.get(size).setController(null);
        }
        this.mProtections.clear();
    }

    public Protection getProtection(int i10) {
        return this.mProtections.get(i10);
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationEnd() {
        int i10 = this.mAnimationCount;
        boolean z9 = i10 > 0;
        int i11 = i10 - 1;
        this.mAnimationCount = i11;
        if (z9 && i11 == 0) {
            updateInsets();
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationProgress(int i10, Insets insets, RectF rectF) {
        Insets insets2 = this.mInsetsIgnoringVisibility;
        for (int size = this.mProtections.size() - 1; size >= 0; size--) {
            Protection protection = this.mProtections.get(size);
            int side = protection.getSide();
            if ((side & i10) != 0) {
                protection.setSystemVisible(true);
                if (side == 1) {
                    int i11 = insets2.left;
                    if (i11 > 0) {
                        protection.setSystemInsetAmount(insets.left / i11);
                    }
                    protection.setSystemAlpha(rectF.left);
                } else if (side == 2) {
                    int i12 = insets2.f18238top;
                    if (i12 > 0) {
                        protection.setSystemInsetAmount(insets.f18238top / i12);
                    }
                    protection.setSystemAlpha(rectF.top);
                } else if (side == 4) {
                    int i13 = insets2.right;
                    if (i13 > 0) {
                        protection.setSystemInsetAmount(insets.right / i13);
                    }
                    protection.setSystemAlpha(rectF.right);
                } else if (side == 8) {
                    int i14 = insets2.bottom;
                    if (i14 > 0) {
                        protection.setSystemInsetAmount(insets.bottom / i14);
                    }
                    protection.setSystemAlpha(rectF.bottom);
                }
            }
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationStart() {
        this.mAnimationCount++;
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onColorHintChanged(int i10) {
        for (int size = this.mProtections.size() - 1; size >= 0; size--) {
            this.mProtections.get(size).dispatchColorHint(i10);
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onInsetsChanged(Insets insets, Insets insets2) {
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets2;
        updateInsets();
    }

    public int size() {
        return this.mProtections.size();
    }
}
