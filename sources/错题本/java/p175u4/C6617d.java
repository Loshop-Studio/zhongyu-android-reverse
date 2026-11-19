package p175u4;

import com.zykj.mistake.feature.review.ReviewContract$PracticePoolType;
import p118m7.AbstractC6191y0;
import p152r6.InterfaceC6469a;

/* renamed from: u4.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6617d implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f11069a;

    public /* synthetic */ C6617d(int i) {
        this.f11069a = i;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f11069a) {
            case 0:
                return AbstractC6191y0.m5835e("com.zykj.mistake.feature.review.ReviewContract.PracticePoolType", ReviewContract$PracticePoolType.values());
            case 1:
                throw new IllegalStateException("PlatformBridge not provided");
            case 2:
                throw new IllegalStateException("AskMaterialRouteEnvironment not provided");
            case 3:
                throw new IllegalStateException("CollectionRouteEnvironment not provided");
            case 4:
                throw new IllegalStateException("DetailRouteEnvironment not provided");
            default:
                throw new IllegalStateException("HomeRouteEnvironment not provided");
        }
    }
}
