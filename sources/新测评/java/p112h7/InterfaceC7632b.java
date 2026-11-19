package p112h7;

import com.blankj.utilcode.util.AppUtils;
import com.zykj.evaluation.version.VersionResp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p112h7.AbstractC7631a;
import p259u9.InterfaceC9602f;
import p259u9.InterfaceC9616t;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m13558d2 = {"Lh7/b;", "", "", "packageName", "", "version", "appType", "Lcom/zykj/evaluation/version/VersionResp;", "b", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* renamed from: h7.b */
/* loaded from: classes4.dex */
public interface InterfaceC7632b {
    /* renamed from: a */
    static /* synthetic */ Object m12617a(InterfaceC7632b interfaceC7632b, String str, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkVersion");
        }
        if ((i12 & 1) != 0) {
            str = AppUtils.getAppPackageName();
            Intrinsics.checkNotNullExpressionValue(str, "getAppPackageName(...)");
        }
        if ((i12 & 2) != 0) {
            i10 = AppUtils.getAppVersionCode();
        }
        if ((i12 & 4) != 0) {
            i11 = AbstractC7631a.a.f12838b.m12616a();
        }
        return interfaceC7632b.m12618b(str, i10, i11, continuation);
    }

    @InterfaceC9602f("/api/services/app/AppStore/CheckUpdateAsync")
    /* renamed from: b */
    Object m12618b(@InterfaceC9616t("packageName") String str, @InterfaceC9616t("version") int i10, @InterfaceC9616t("appType") int i11, Continuation<? super VersionResp> continuation);
}
