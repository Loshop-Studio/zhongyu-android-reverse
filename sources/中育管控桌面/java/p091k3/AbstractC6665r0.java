package p091k3;

import android.app.Activity;
import com.dylanc.longan.ActivityKt;
import com.zykj.gallery.p034ui.activity.GalleryActivity;
import com.zykj.gallery.p034ui.gallery.screenList.GalleryViewModel;
import com.zykj.gallery.p034ui.gallery.screenList.ScreenState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p070h3.AbstractC6459c0;

/* renamed from: k3.r0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6665r0 {

    /* renamed from: k3.r0$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8782a;

        static {
            int[] iArr = new int[ScreenState.values().length];
            try {
                iArr[ScreenState.f5889a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenState.f5890b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenState.f5892d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenState.f5891c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8782a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m7664a(ScreenState currentScreenState, Activity activity, GalleryViewModel viewModel) {
        Intrinsics.checkNotNullParameter(currentScreenState, "currentScreenState");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        int i6 = a.f8782a[currentScreenState.ordinal()];
        if (i6 == 1) {
            ActivityKt.m3322a(GalleryActivity.class);
            return;
        }
        if (i6 == 2) {
            viewModel.m5116r(ScreenState.f5889a, false);
            viewModel.m5118t();
        } else if (i6 == 3) {
            viewModel.m5116r(ScreenState.f5889a, true);
        } else {
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            viewModel.m5116r(ScreenState.f5892d, false);
            viewModel.m5118t();
        }
    }

    /* renamed from: b */
    public static final AbstractC6459c0 m7665b(ScreenState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i6 = a.f8782a[state.ordinal()];
        return i6 != 1 ? i6 != 2 ? AbstractC6459c0.c.f8223g : AbstractC6459c0.d.f8224g : AbstractC6459c0.b.f8222g;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p091k3.AbstractC6667s0 m7666c(com.zykj.gallery.p034ui.gallery.screenList.ScreenState r20, int r21, int r22, androidx.compose.runtime.Composer r23, int r24, int r25) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p091k3.AbstractC6665r0.m7666c(com.zykj.gallery.ui.gallery.screenList.ScreenState, int, int, androidx.compose.runtime.Composer, int, int):k3.s0");
    }

    /* renamed from: d */
    public static final void m7667d(ScreenState screenState, GalleryViewModel viewModel, List selectList, Function1 onShowDeleteDialog) {
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(selectList, "selectList");
        Intrinsics.checkNotNullParameter(onShowDeleteDialog, "onShowDeleteDialog");
        int i6 = a.f8782a[screenState.ordinal()];
        if (i6 == 1) {
            viewModel.m5116r(ScreenState.f5892d, true);
            return;
        }
        if (i6 != 2) {
            if (i6 == 3) {
                onShowDeleteDialog.invoke(CollectionsKt.emptyList());
                return;
            } else if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        onShowDeleteDialog.invoke(selectList);
    }
}
