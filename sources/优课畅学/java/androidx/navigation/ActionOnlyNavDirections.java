package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;

/* loaded from: classes3.dex */
public final class ActionOnlyNavDirections implements NavDirections {
    private final int actionId;
    private final Bundle arguments;

    public ActionOnlyNavDirections(int i10) {
        Pair[] pairArr;
        this.actionId = i10;
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM15943h.size());
            for (Map.Entry entry : mapM15943h.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
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
        return obj != null && AbstractC9133u.m16128b(ActionOnlyNavDirections.class, obj.getClass()) && getActionId() == ((ActionOnlyNavDirections) obj).getActionId();
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
