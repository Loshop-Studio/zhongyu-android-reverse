package androidx.navigation.internal;

import android.os.Bundle;
import android.view.Lifecycle;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0010\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\u0006\u0010\u000bJ\u0011\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0000¢\u0006\u0002\b\u0019J8\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u0013\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00060\tj\u0002`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006$"}, m5110d2 = {"Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "", "entry", "Landroidx/navigation/NavBackStackEntry;", "destId", "", "<init>", "(Landroidx/navigation/NavBackStackEntry;I)V", "state", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "(Landroid/os/Bundle;)V", "id", "", "getId$navigation_runtime_release", "()Ljava/lang/String;", "destinationId", "getDestinationId$navigation_runtime_release", "()I", "args", "getArgs$navigation_runtime_release", "()Landroid/os/Bundle;", "savedState", "getSavedState$navigation_runtime_release", "writeToState", "writeToState$navigation_runtime_release", "instantiate", "context", "Landroidx/navigation/internal/NavContext;", "destination", "Landroidx/navigation/NavDestination;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "Companion", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavBackStackEntryStateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryStateImpl.kt\nandroidx/navigation/internal/NavBackStackEntryStateImpl\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,82:1\n27#2:83\n46#2:84\n32#2,4:85\n31#2,7:95\n27#2:109\n46#2:110\n32#2,4:111\n31#2,7:121\n27#2:130\n46#2:131\n32#2,4:132\n31#2,7:142\n126#3:89\n153#3,3:90\n126#3:115\n153#3,3:116\n126#3:136\n153#3,3:137\n37#4,2:93\n37#4,2:119\n37#4,2:140\n1#5:102\n1#5:128\n1#5:149\n106#6:103\n90#6:105\n90#6:106\n90#6:107\n90#6:108\n106#6:129\n106#6:150\n46#7:104\n46#7:151\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntryStateImpl.kt\nandroidx/navigation/internal/NavBackStackEntryStateImpl\n*L\n37#1:83\n37#1:84\n37#1:85,4\n37#1:95,7\n49#1:109\n49#1:110\n49#1:111,4\n49#1:121,7\n52#1:130\n52#1:131\n52#1:132,4\n52#1:142,7\n37#1:89\n37#1:90,3\n49#1:115\n49#1:116,3\n52#1:136\n52#1:137,3\n37#1:93,2\n49#1:119,2\n52#1:140,2\n37#1:102\n49#1:128\n52#1:149\n37#1:103\n42#1:105\n43#1:106\n44#1:107\n45#1:108\n49#1:129\n52#1:150\n37#1:104\n52#1:151\n*E\n"})
/* loaded from: classes2.dex */
public final class NavBackStackEntryStateImpl {

    @NotNull
    public static final String KEY_ARGS = "nav-entry-state:args";

    @NotNull
    public static final String KEY_DESTINATION_ID = "nav-entry-state:destination-id";

    @NotNull
    public static final String KEY_ID = "nav-entry-state:id";

    @NotNull
    public static final String KEY_SAVED_STATE = "nav-entry-state:saved-state";

    @Nullable
    private final Bundle args;
    private final int destinationId;

    @NotNull
    private final String id;

    @NotNull
    private final Bundle savedState;

    public NavBackStackEntryStateImpl(@NotNull NavBackStackEntry entry, int i) {
        Pair[] pairArr;
        AbstractC5830k.m5330g(entry, "entry");
        this.id = entry.getId();
        this.destinationId = i;
        this.args = entry.getArguments();
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM5147A.size());
            for (Map.Entry entry2 : mapM5147A.entrySet()) {
                AbstractC1923c.m1057u((String) entry2.getKey(), entry2.getValue(), arrayList);
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        this.savedState = bundleBundleOf;
        entry.saveState(bundleBundleOf);
    }

    @Nullable
    /* renamed from: getArgs$navigation_runtime_release, reason: from getter */
    public final Bundle getArgs() {
        return this.args;
    }

    /* renamed from: getDestinationId$navigation_runtime_release, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    @NotNull
    /* renamed from: getId$navigation_runtime_release, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: getSavedState$navigation_runtime_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @NotNull
    public final NavBackStackEntry instantiate(@NotNull NavContext context, @NotNull NavDestination destination, @Nullable Bundle args, @NotNull Lifecycle.State hostLifecycleState, @Nullable NavControllerViewModel viewModel) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(destination, "destination");
        AbstractC5830k.m5330g(hostLifecycleState, "hostLifecycleState");
        return NavBackStackEntry.INSTANCE.create(context, destination, args, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    @NotNull
    public final Bundle writeToState$navigation_runtime_release() {
        Pair[] pairArr;
        Pair[] pairArr2;
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
        Bundle bundleM13683constructorimpl = SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        SavedStateWriter.m13716putStringimpl(bundleM13683constructorimpl, KEY_ID, this.id);
        SavedStateWriter.m13700putIntimpl(bundleM13683constructorimpl, KEY_DESTINATION_ID, this.destinationId);
        Bundle bundleBundleOf2 = this.args;
        if (bundleBundleOf2 == null) {
            Map mapM5147A2 = AbstractC5785e0.m5147A();
            if (mapM5147A2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapM5147A2.size());
                for (Map.Entry entry2 : mapM5147A2.entrySet()) {
                    AbstractC1923c.m1057u((String) entry2.getKey(), entry2.getValue(), arrayList2);
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m13683constructorimpl(bundleBundleOf2);
        }
        SavedStateWriter.m13710putSavedStateimpl(bundleM13683constructorimpl, KEY_ARGS, bundleBundleOf2);
        SavedStateWriter.m13710putSavedStateimpl(bundleM13683constructorimpl, KEY_SAVED_STATE, this.savedState);
        return bundleBundleOf;
    }

    public NavBackStackEntryStateImpl(@NotNull Bundle state) {
        AbstractC5830k.m5330g(state, "state");
        this.id = SavedStateReader.m13668getStringimpl(SavedStateReader.m13597constructorimpl(state), KEY_ID);
        this.destinationId = SavedStateReader.m13628getIntimpl(SavedStateReader.m13597constructorimpl(state), KEY_DESTINATION_ID);
        this.args = SavedStateReader.m13654getSavedStateimpl(SavedStateReader.m13597constructorimpl(state), KEY_ARGS);
        this.savedState = SavedStateReader.m13654getSavedStateimpl(SavedStateReader.m13597constructorimpl(state), KEY_SAVED_STATE);
    }
}
