package androidx.camera.core.impl;

import androidx.camera.core.impl.UseCaseAttachState;

/* renamed from: androidx.camera.core.impl.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0369k implements UseCaseAttachState.AttachStateFilter {

    /* renamed from: a */
    public final /* synthetic */ int f460a;

    public /* synthetic */ C0369k(int i) {
        this.f460a = i;
    }

    @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
    public final boolean filter(UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        switch (this.f460a) {
            case 0:
                return useCaseAttachInfo.getAttached();
            case 1:
                return useCaseAttachInfo.getAttached();
            case 2:
                return useCaseAttachInfo.getAttached();
            default:
                return UseCaseAttachState.lambda$getActiveAndAttachedSessionConfigs$3(useCaseAttachInfo);
        }
    }
}
