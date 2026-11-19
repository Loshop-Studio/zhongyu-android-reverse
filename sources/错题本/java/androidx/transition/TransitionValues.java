package androidx.transition;

import android.annotation.SuppressLint;
import android.support.v4.media.AbstractC0037f;
import android.view.View;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class TransitionValues {

    @SuppressLint({"UnknownNullness"})
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder sbM98w = AbstractC0037f.m98w("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM98w.append(this.view);
        sbM98w.append(SignParameters.NEW_LINE);
        String strM74C = AbstractC0037f.m74C(sbM98w.toString(), "    values:");
        for (String str : this.values.keySet()) {
            strM74C = strM74C + "    " + str + ": " + this.values.get(str) + SignParameters.NEW_LINE;
        }
        return strM74C;
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }
}
