package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    public static final Bundle savedState(Map<String, ? extends Object> initialState, InterfaceC10570l builderAction) {
        Pair[] pairArr;
        AbstractC9133u.m16133g(initialState, "initialState");
        AbstractC9133u.m16133g(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry<String, ? extends Object> entry : initialState.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a(entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(SavedStateWriter.m27313boximpl(SavedStateWriter.m27315constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle savedState$default(Bundle initialState, InterfaceC10570l builderAction, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            builderAction = new InterfaceC10570l() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.3
                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m27227invokexApjlu4(((SavedStateWriter) obj2).m27353unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m27227invokexApjlu4(Bundle bundle) {
                    AbstractC9133u.m16133g(bundle, "<this>");
                }
            };
        }
        AbstractC9133u.m16133g(initialState, "initialState");
        AbstractC9133u.m16133g(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m27313boximpl(SavedStateWriter.m27315constructorimpl(bundle)));
        return bundle;
    }

    public static /* synthetic */ Bundle savedState$default(Map initialState, InterfaceC10570l builderAction, int i10, Object obj) {
        Pair[] pairArr;
        if ((i10 & 1) != 0) {
            initialState = AbstractC9080a.m15943h();
        }
        if ((i10 & 2) != 0) {
            builderAction = new InterfaceC10570l() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.1
                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m27226invokexApjlu4(((SavedStateWriter) obj2).m27353unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m27226invokexApjlu4(Bundle bundle) {
                    AbstractC9133u.m16133g(bundle, "<this>");
                }
            };
        }
        AbstractC9133u.m16133g(initialState, "initialState");
        AbstractC9133u.m16133g(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry entry : initialState.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(SavedStateWriter.m27313boximpl(SavedStateWriter.m27315constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    public static final Bundle savedState(Bundle initialState, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(initialState, "initialState");
        AbstractC9133u.m16133g(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m27313boximpl(SavedStateWriter.m27315constructorimpl(bundle)));
        return bundle;
    }
}
