package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.compose.p014ui.C2638R;
import androidx.compose.p014ui.platform.AndroidComposeView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionServiceKey;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9962d0;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {
    private Lifecycle addedToLifecycle;
    private boolean disposed;
    private InterfaceC9544p lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m32643getLambda1$ui_release();
    private final Composition original;
    private final AndroidComposeView owner;

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(C2638R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        Composition composition = this.original;
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    public final Composition getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.Composition
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void setContent(final InterfaceC9544p interfaceC9544p) {
        this.owner.setOnViewTreeOwnersAvailable(new InterfaceC9540l() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AndroidComposeView.ViewTreeOwners) obj);
                return C10786q.f26013a;
            }

            public final void invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                if (WrappedComposition.this.disposed) {
                    return;
                }
                Lifecycle lifecycle = viewTreeOwners.getLifecycleOwner().getLifecycle();
                WrappedComposition.this.lastContent = interfaceC9544p;
                if (WrappedComposition.this.addedToLifecycle == null) {
                    WrappedComposition.this.addedToLifecycle = lifecycle;
                    lifecycle.addObserver(WrappedComposition.this);
                } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    Composition original = WrappedComposition.this.getOriginal();
                    final WrappedComposition wrappedComposition = WrappedComposition.this;
                    final InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                    original.setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new InterfaceC9544p() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C10786q.f26013a;
                        }

                        @Composable
                        public final void invoke(Composer composer, int i10) {
                            if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                            }
                            Object tag = wrappedComposition.getOwner().getTag(C2638R.id.inspection_slot_table_set);
                            Set<CompositionData> set = AbstractC9962d0.m20263n(tag) ? (Set) tag : null;
                            if (set == null) {
                                Object parent = wrappedComposition.getOwner().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(C2638R.id.inspection_slot_table_set) : null;
                                set = AbstractC9962d0.m20263n(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(composer.getCompositionData());
                                composer.collectParameterInformation();
                            }
                            AndroidComposeView owner = wrappedComposition.getOwner();
                            boolean zChangedInstance = composer.changedInstance(wrappedComposition);
                            WrappedComposition wrappedComposition2 = wrappedComposition;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new WrappedComposition$setContent$1$1$1$1(wrappedComposition2, null);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            EffectsKt.LaunchedEffect(owner, (InterfaceC9544p) objRememberedValue, composer, 0);
                            AndroidComposeView owner2 = wrappedComposition.getOwner();
                            boolean zChangedInstance2 = composer.changedInstance(wrappedComposition);
                            WrappedComposition wrappedComposition3 = wrappedComposition;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                objRememberedValue2 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition3, null);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            EffectsKt.LaunchedEffect(owner2, (InterfaceC9544p) objRememberedValue2, composer, 0);
                            ProvidedValue<Set<CompositionData>> providedValueProvides = InspectionTablesKt.getLocalInspectionTables().provides(set);
                            final WrappedComposition wrappedComposition4 = wrappedComposition;
                            final InterfaceC9544p interfaceC9544p3 = interfaceC9544p2;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-1193460702, true, new InterfaceC9544p() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // p181hd.InterfaceC9544p
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return C10786q.f26013a;
                                }

                                @Composable
                                public final void invoke(Composer composer2, int i11) {
                                    if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1193460702, i11, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                                    }
                                    AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(wrappedComposition4.getOwner(), interfaceC9544p3, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
            }
        });
    }
}
