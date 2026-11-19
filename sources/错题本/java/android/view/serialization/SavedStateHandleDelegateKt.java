package android.view.serialization;

import android.view.SavedStateHandle;
import android.view.serialization.SavedStateConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6469a;
import p177u6.InterfaceC6624c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m5110d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/SavedStateHandle;", "", "key", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "Lkotlin/Function0;", "init", "Lu6/c;", "saved", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lr6/a;)Lu6/c;", "Li7/b;", "serializer", "(Landroidx/lifecycle/SavedStateHandle;Li7/b;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lr6/a;)Lu6/c;", "lifecycle-viewmodel-savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SavedStateHandleDelegateKt {
    public static final <T> InterfaceC6624c saved(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration configuration, InterfaceC6469a init) {
        AbstractC5830k.m5330g(savedStateHandle, "<this>");
        AbstractC5830k.m5330g(configuration, "configuration");
        AbstractC5830k.m5330g(init, "init");
        configuration.getSerializersModule();
        AbstractC5830k.m5338o();
        throw null;
    }

    public static InterfaceC6624c saved$default(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration configuration, InterfaceC6469a init, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC5830k.m5330g(savedStateHandle, "<this>");
        AbstractC5830k.m5330g(configuration, "configuration");
        AbstractC5830k.m5330g(init, "init");
        configuration.getSerializersModule();
        AbstractC5830k.m5338o();
        throw null;
    }

    @NotNull
    public static final <T> InterfaceC6624c saved(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC5686b serializer, @Nullable String str, @NotNull SavedStateConfiguration configuration, @NotNull InterfaceC6469a init) {
        AbstractC5830k.m5330g(savedStateHandle, "<this>");
        AbstractC5830k.m5330g(serializer, "serializer");
        AbstractC5830k.m5330g(configuration, "configuration");
        AbstractC5830k.m5330g(init, "init");
        return new SavedStateHandleDelegate(savedStateHandle, serializer, str, configuration, init);
    }

    public static /* synthetic */ InterfaceC6624c saved$default(SavedStateHandle savedStateHandle, InterfaceC5686b interfaceC5686b, String str, SavedStateConfiguration savedStateConfiguration, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return saved(savedStateHandle, interfaceC5686b, str, savedStateConfiguration, interfaceC6469a);
    }
}
