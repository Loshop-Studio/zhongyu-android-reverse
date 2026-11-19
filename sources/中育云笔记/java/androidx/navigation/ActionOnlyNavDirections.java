package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10776g;

/* loaded from: classes.dex */
public final class ActionOnlyNavDirections implements NavDirections {
    private final int actionId;
    private final Bundle arguments;

    public ActionOnlyNavDirections(int i10) {
        Pair[] pairArr;
        this.actionId = i10;
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20088h.size());
            for (Map.Entry entry : mapM20088h.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        this.arguments = bundleBundleOf;
    }

    public static /* synthetic */ ActionOnlyNavDirections copy$default(ActionOnlyNavDirections actionOnlyNavDirections, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = actionOnlyNavDirections.actionId;
        }
        return actionOnlyNavDirections.copy(i10);
    }

    public final int component1() {
        return this.actionId;
    }

    public final ActionOnlyNavDirections copy(int i10) {
        return new ActionOnlyNavDirections(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && AbstractC9979u.m20289b(ActionOnlyNavDirections.class, obj.getClass()) && getActionId() == ((ActionOnlyNavDirections) obj).getActionId();
    }

    @Override // androidx.navigation.NavDirections
    public int getActionId() {
        return this.actionId;
    }

    @Override // androidx.navigation.NavDirections
    public Bundle getArguments() {
        return this.arguments;
    }

    public int hashCode() {
        return 31 + getActionId();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ')';
    }
}
