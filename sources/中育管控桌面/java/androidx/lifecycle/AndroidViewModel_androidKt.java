package androidx.lifecycle;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m7880d2 = {"application", "Landroid/app/Application;", "Landroidx/lifecycle/AndroidViewModel;", "getApplication", "(Landroidx/lifecycle/AndroidViewModel;)Landroid/app/Application;", "lifecycle-viewmodel_release"}, m7881k = 2, m7882mv = {2, 0, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class AndroidViewModel_androidKt {
    public static final Application getApplication(AndroidViewModel androidViewModel) {
        Intrinsics.checkNotNullParameter(androidViewModel, "<this>");
        return androidViewModel.getApplication();
    }
}
