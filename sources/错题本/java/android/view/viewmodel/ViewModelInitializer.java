package android.view.viewmodel;

import android.view.ViewModel;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bB0\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ly6/c;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "initializer", "<init>", "(Ly6/c;Lr6/c;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Lr6/c;)V", "Ly6/c;", "getClazz$lifecycle_viewmodel_release", "()Ly6/c;", "Lr6/c;", "getInitializer$lifecycle_viewmodel_release", "()Lr6/c;", "lifecycle-viewmodel_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ViewModelInitializer<T extends ViewModel> {

    @NotNull
    private final InterfaceC6779c clazz;

    @NotNull
    private final InterfaceC6471c initializer;

    public ViewModelInitializer(@NotNull InterfaceC6779c clazz, @NotNull InterfaceC6471c initializer) {
        AbstractC5830k.m5330g(clazz, "clazz");
        AbstractC5830k.m5330g(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    @NotNull
    /* renamed from: getClazz$lifecycle_viewmodel_release, reason: from getter */
    public final InterfaceC6779c getClazz() {
        return this.clazz;
    }

    @NotNull
    /* renamed from: getInitializer$lifecycle_viewmodel_release, reason: from getter */
    public final InterfaceC6471c getInitializer() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(@NotNull Class<T> clazz, @NotNull InterfaceC6471c initializer) {
        this(AbstractC5832m.m5340a(clazz), initializer);
        AbstractC5830k.m5330g(clazz, "clazz");
        AbstractC5830k.m5330g(initializer, "initializer");
    }
}
