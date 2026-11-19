package android.view;

import android.app.Application;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"application", "Landroid/app/Application;", "Landroidx/lifecycle/AndroidViewModel;", "getApplication", "(Landroidx/lifecycle/AndroidViewModel;)Landroid/app/Application;", "lifecycle-viewmodel_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AndroidViewModel_androidKt {
    @NotNull
    public static final Application getApplication(@NotNull AndroidViewModel androidViewModel) {
        AbstractC5830k.m5330g(androidViewModel, "<this>");
        return androidViewModel.getApplication();
    }
}
