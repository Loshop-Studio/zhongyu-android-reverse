package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Bounds;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class SidecarAdapter {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = SidecarAdapter.class.getSimpleName();
    private final SpecificationComputer.VerificationMode verificationMode;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final int getRawSidecarDevicePosture(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                    if (objInvoke != null) {
                        return ((Integer) objInvoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int getSidecarDevicePosture$window_release(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(sidecarDeviceState, "sidecarDeviceState");
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final List<SidecarDisplayFeature> getSidecarDisplayFeatures(SidecarWindowLayoutInfo info) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? AbstractC10978w.m24136n() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                    if (objInvoke != null) {
                        return (List) objInvoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return AbstractC10978w.m24136n();
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final void setSidecarDevicePosture(SidecarDeviceState sidecarDeviceState, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final void setSidecarDisplayFeatures(SidecarWindowLayoutInfo info, List<SidecarDisplayFeature> displayFeatures) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(info, "info");
            AbstractC9979u.m20294g(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SidecarAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean isEqualSidecarDisplayFeature(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC9979u.m20289b(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC9979u.m20289b(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean isEqualSidecarDisplayFeatures(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (!isEqualSidecarDisplayFeature(list.get(i10), list2.get(i10))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public final boolean isEqualSidecarDeviceState(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (AbstractC9979u.m20289b(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        Companion companion = Companion;
        return companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2);
    }

    public final boolean isEqualSidecarWindowLayoutInfo(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (AbstractC9979u.m20289b(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        Companion companion = Companion;
        return isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }

    public final List<DisplayFeature> translate(List<SidecarDisplayFeature> sidecarDisplayFeatures, SidecarDeviceState deviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        AbstractC9979u.m20294g(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            DisplayFeature displayFeatureTranslate$window_release = translate$window_release((SidecarDisplayFeature) it.next(), deviceState);
            if (displayFeatureTranslate$window_release != null) {
                arrayList.add(displayFeatureTranslate$window_release);
            }
        }
        return arrayList;
    }

    public final DisplayFeature translate$window_release(SidecarDisplayFeature feature, SidecarDeviceState deviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        AbstractC9979u.m20294g(feature, "feature");
        AbstractC9979u.m20294g(deviceState, "deviceState");
        SpecificationComputer.Companion companion = SpecificationComputer.Companion;
        String TAG2 = TAG;
        AbstractC9979u.m20293f(TAG2, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) SpecificationComputer.Companion.startSpecification$default(companion, feature, TAG2, this.verificationMode, null, 4, null).require("Type must be either TYPE_FOLD or TYPE_HINGE", new InterfaceC9540l() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(SidecarDisplayFeature require) {
                AbstractC9979u.m20294g(require, "$this$require");
                boolean z10 = true;
                if (require.getType() != 1 && require.getType() != 2) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }).require("Feature bounds must not be 0", new InterfaceC9540l() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$2
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(SidecarDisplayFeature require) {
                AbstractC9979u.m20294g(require, "$this$require");
                return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
            }
        }).require("TYPE_FOLD must have 0 area", new InterfaceC9540l() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$3
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(SidecarDisplayFeature require) {
                AbstractC9979u.m20294g(require, "$this$require");
                boolean z10 = true;
                if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }).require("Feature be pinned to either left or top", new InterfaceC9540l() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$4
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(SidecarDisplayFeature require) {
                AbstractC9979u.m20294g(require, "$this$require");
                return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
            }
        }).compute();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.Companion.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        int sidecarDevicePosture$window_release = Companion.getSidecarDevicePosture$window_release(deviceState);
        if (sidecarDevicePosture$window_release == 0 || sidecarDevicePosture$window_release == 1) {
            return null;
        }
        if (sidecarDevicePosture$window_release == 2) {
            state = FoldingFeature.State.HALF_OPENED;
        } else {
            if (sidecarDevicePosture$window_release != 3 && sidecarDevicePosture$window_release == 4) {
                return null;
            }
            state = FoldingFeature.State.FLAT;
        }
        Rect rect = feature.getRect();
        AbstractC9979u.m20293f(rect, "feature.rect");
        return new HardwareFoldingFeature(new Bounds(rect), fold, state);
    }

    public SidecarAdapter(SpecificationComputer.VerificationMode verificationMode) {
        AbstractC9979u.m20294g(verificationMode, "verificationMode");
        this.verificationMode = verificationMode;
    }

    public /* synthetic */ SidecarAdapter(SpecificationComputer.VerificationMode verificationMode, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? SpecificationComputer.VerificationMode.QUIET : verificationMode);
    }

    public final WindowLayoutInfo translate(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(AbstractC10978w.m24136n());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        Companion companion = Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState, companion.getSidecarDevicePosture$window_release(state));
        return new WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState));
    }
}
