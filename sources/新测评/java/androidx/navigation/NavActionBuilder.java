package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@NavDestinationDsl
@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000f\u001a\u00020\u00112\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m13558d2 = {"Landroidx/navigation/NavActionBuilder;", "", "<init>", "()V", "destinationId", "", "getDestinationId", "()I", "setDestinationId", "(I)V", "defaultArguments", "", "", "getDefaultArguments", "()Ljava/util/Map;", "navOptions", "Landroidx/navigation/NavOptions;", "", "optionsBuilder", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "build", "Landroidx/navigation/NavAction;", "build$navigation_common_release", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavDestinationBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.android.kt\nandroidx/navigation/NavActionBuilder\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,221:1\n27#2:222\n46#2:223\n32#2,4:224\n31#2,7:234\n126#3:228\n153#3,3:229\n37#4,2:232\n1#5:241\n106#6:242\n46#7:243\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.android.kt\nandroidx/navigation/NavActionBuilder\n*L\n218#1:222\n218#1:223\n218#1:224,4\n218#1:234,7\n218#1:228\n218#1:229,3\n218#1:232,2\n218#1:241\n218#1:242\n218#1:243\n*E\n"})
/* loaded from: classes3.dex */
public final class NavActionBuilder {
    private final Map<String, Object> defaultArguments = new LinkedHashMap();
    private int destinationId;
    private NavOptions navOptions;

    public final NavAction build$navigation_common_release() {
        Pair[] pairArr;
        Bundle bundleBundleOf;
        int i10 = this.destinationId;
        NavOptions navOptions = this.navOptions;
        if (this.defaultArguments.isEmpty()) {
            bundleBundleOf = null;
        } else {
            Map<String, Object> map = this.defaultArguments;
            if (map.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    arrayList.add(TuplesKt.m13565to(entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m24170constructorimpl(bundleBundleOf);
        }
        return new NavAction(i10, navOptions, bundleBundleOf);
    }

    public final Map<String, Object> getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void navOptions(Function1<? super NavOptionsBuilder, Unit> optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        this.navOptions = navOptionsBuilder.build$navigation_common_release();
    }

    public final void setDestinationId(int i10) {
        this.destinationId = i10;
    }
}
