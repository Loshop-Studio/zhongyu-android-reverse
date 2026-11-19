package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;

@NavDestinationDsl
/* loaded from: classes.dex */
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
                    arrayList.add(AbstractC10776g.m22975a(entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        }
        return new NavAction(i10, navOptions, bundleBundleOf);
    }

    public final Map<String, Object> getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void navOptions(InterfaceC9540l optionsBuilder) {
        AbstractC9979u.m20294g(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        this.navOptions = navOptionsBuilder.build$navigation_common_release();
    }

    public final void setDestinationId(int i10) {
        this.destinationId = i10;
    }
}
