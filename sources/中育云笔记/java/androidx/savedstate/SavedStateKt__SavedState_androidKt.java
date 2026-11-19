package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.AbstractC10776g;
import p309qc.C10786q;

/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    public static final Bundle savedState(Map<String, ? extends Object> initialState, InterfaceC9540l builderAction) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(initialState, "initialState");
        AbstractC9979u.m20294g(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry<String, ? extends Object> entry : initialState.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a(entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(SavedStateWriter.m33908boximpl(SavedStateWriter.m33910constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle savedState$default(Bundle initialState, InterfaceC9540l builderAction, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            builderAction = new InterfaceC9540l() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.3
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m33822invokexApjlu4(((SavedStateWriter) obj2).m33948unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m33822invokexApjlu4(Bundle bundle) {
                    AbstractC9979u.m20294g(bundle, "<this>");
                }
            };
        }
        AbstractC9979u.m20294g(initialState, "initialState");
        AbstractC9979u.m20294g(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m33908boximpl(SavedStateWriter.m33910constructorimpl(bundle)));
        return bundle;
    }

    public static /* synthetic */ Bundle savedState$default(Map initialState, InterfaceC9540l builderAction, int i10, Object obj) {
        Pair[] pairArr;
        if ((i10 & 1) != 0) {
            initialState = AbstractC9925a.m20088h();
        }
        if ((i10 & 2) != 0) {
            builderAction = new InterfaceC9540l() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m33821invokexApjlu4(((SavedStateWriter) obj2).m33948unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m33821invokexApjlu4(Bundle bundle) {
                    AbstractC9979u.m20294g(bundle, "<this>");
                }
            };
        }
        AbstractC9979u.m20294g(initialState, "initialState");
        AbstractC9979u.m20294g(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry entry : initialState.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(SavedStateWriter.m33908boximpl(SavedStateWriter.m33910constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    public static final Bundle savedState(Bundle initialState, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(initialState, "initialState");
        AbstractC9979u.m20294g(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m33908boximpl(SavedStateWriter.m33910constructorimpl(bundle)));
        return bundle;
    }
}
