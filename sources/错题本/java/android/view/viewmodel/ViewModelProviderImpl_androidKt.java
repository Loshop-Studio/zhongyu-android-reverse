package android.view.viewmodel;

import android.view.ViewModel;
import android.view.ViewModelProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Ly6/c;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "createViewModel", "(Landroidx/lifecycle/ViewModelProvider$Factory;Ly6/c;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ViewModelProviderImpl_androidKt {
    @NotNull
    public static final <VM extends ViewModel> VM createViewModel(@NotNull ViewModelProvider.Factory factory, @NotNull InterfaceC6779c modelClass, @NotNull CreationExtras extras) {
        AbstractC5830k.m5330g(factory, "factory");
        AbstractC5830k.m5330g(modelClass, "modelClass");
        AbstractC5830k.m5330g(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(AbstractC6675d.m6349m(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(AbstractC6675d.m6349m(modelClass), extras);
        }
    }
}
