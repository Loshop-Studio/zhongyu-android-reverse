package android.view.serialization;

import android.os.Bundle;
import android.view.SavedStateWriter;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p084i7.InterfaceC5689e;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, m5110d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "value", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "encodeToSavedState", "(Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "Li7/e;", "serializer", "(Li7/e;Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSavedStateEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoderKt\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,281:1\n27#2:282\n46#2:283\n32#2,4:284\n31#2,7:294\n126#3:288\n153#3,3:289\n37#4,2:292\n1#5:301\n106#6:302\n46#7:303\n*S KotlinDebug\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoderKt\n*L\n67#1:282\n67#1:283\n67#1:284,4\n67#1:294,7\n67#1:288\n67#1:289,3\n67#1:292,2\n67#1:301\n67#1:302\n67#1:303\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateEncoderKt {
    @JvmOverloads
    @NotNull
    public static final <T> Bundle encodeToSavedState(@NotNull InterfaceC5689e serializer, @NotNull T value) {
        AbstractC5830k.m5330g(serializer, "serializer");
        AbstractC5830k.m5330g(value, "value");
        return encodeToSavedState$default(serializer, value, null, 4, null);
    }

    public static Bundle encodeToSavedState$default(Object value, SavedStateConfiguration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC5830k.m5330g(value, "value");
        AbstractC5830k.m5330g(configuration, "configuration");
        configuration.getSerializersModule();
        AbstractC5830k.m5338o();
        throw null;
    }

    public static final <T> Bundle encodeToSavedState(T value, SavedStateConfiguration configuration) {
        AbstractC5830k.m5330g(value, "value");
        AbstractC5830k.m5330g(configuration, "configuration");
        configuration.getSerializersModule();
        AbstractC5830k.m5338o();
        throw null;
    }

    @JvmOverloads
    @NotNull
    public static final <T> Bundle encodeToSavedState(@NotNull InterfaceC5689e serializer, @NotNull T value, @NotNull SavedStateConfiguration configuration) {
        Pair[] pairArr;
        AbstractC5830k.m5330g(serializer, "serializer");
        AbstractC5830k.m5330g(value, "value");
        AbstractC5830k.m5330g(configuration, "configuration");
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        new SavedStateEncoder(bundleBundleOf, configuration).encodeSerializableValue(serializer, value);
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(InterfaceC5689e interfaceC5689e, Object obj, SavedStateConfiguration savedStateConfiguration, int i, Object obj2) {
        if ((i & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedState(interfaceC5689e, obj, savedStateConfiguration);
    }
}
