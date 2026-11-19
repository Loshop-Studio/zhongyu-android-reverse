package android.view;

import android.os.Bundle;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a>\u0010\u000b\u001a\u00060\tj\u0002`\n2\n\u0010\u0003\u001a\u00060\tj\u0002`\n2\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\r*\n\u0010\u000e\"\u00020\t2\u00020\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m5110d2 = {"", "", "", "initialState", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateWriter;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "(Ljava/util/Map;Lr6/c;)Landroid/os/Bundle;", "(Landroid/os/Bundle;Lr6/c;)Landroid/os/Bundle;", "SavedState", "savedstate_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/savedstate/SavedStateKt")
@SourceDebugExtension({"SMAP\nSavedState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,46:1\n126#2:47\n153#2,3:48\n37#3,2:51\n1#4:53\n106#5:54\n106#5:55\n*S KotlinDebug\n*F\n+ 1 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n*L\n35#1:47\n35#1:48,3\n35#1:51,2\n37#1:54\n44#1:55\n*E\n"})
/* loaded from: classes2.dex */
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    @NotNull
    public static final Bundle savedState(@NotNull Map<String, ? extends Object> initialState, @NotNull InterfaceC6471c builderAction) {
        Pair[] pairArr;
        AbstractC5830k.m5330g(initialState, "initialState");
        AbstractC5830k.m5330g(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry<String, ? extends Object> entry : initialState.entrySet()) {
                AbstractC1923c.m1057u(entry.getKey(), entry.getValue(), arrayList);
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(SavedStateWriter.m13681boximpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle savedState$default(Bundle initialState, InterfaceC6471c builderAction, int i, Object obj) {
        if ((i & 2) != 0) {
            builderAction = new InterfaceC6471c() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.3
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m13595invokexApjlu4(((SavedStateWriter) obj2).getSource());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m13595invokexApjlu4(Bundle bundle) {
                    AbstractC5830k.m5330g(bundle, "<this>");
                }
            };
        }
        AbstractC5830k.m5330g(initialState, "initialState");
        AbstractC5830k.m5330g(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m13681boximpl(SavedStateWriter.m13683constructorimpl(bundle)));
        return bundle;
    }

    public static Bundle savedState$default(Map initialState, InterfaceC6471c builderAction, int i, Object obj) {
        Pair[] pairArr;
        if ((i & 1) != 0) {
            initialState = AbstractC5785e0.m5147A();
        }
        if ((i & 2) != 0) {
            builderAction = new InterfaceC6471c() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m13594invokexApjlu4(((SavedStateWriter) obj2).getSource());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m13594invokexApjlu4(Bundle bundle) {
                    AbstractC5830k.m5330g(bundle, "<this>");
                }
            };
        }
        AbstractC5830k.m5330g(initialState, "initialState");
        AbstractC5830k.m5330g(builderAction, "builderAction");
        if (initialState.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(initialState.size());
            for (Map.Entry entry : initialState.entrySet()) {
                AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        builderAction.invoke(SavedStateWriter.m13681boximpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    @NotNull
    public static final Bundle savedState(@NotNull Bundle initialState, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(initialState, "initialState");
        AbstractC5830k.m5330g(builderAction, "builderAction");
        Bundle bundle = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m13681boximpl(SavedStateWriter.m13683constructorimpl(bundle)));
        return bundle;
    }
}
