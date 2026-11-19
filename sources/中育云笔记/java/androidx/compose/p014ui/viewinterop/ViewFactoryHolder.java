package androidx.compose.p014ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.platform.ViewRootForInspector;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    private final int compositeKeyHash;
    private final NestedScrollDispatcher dispatcher;
    private InterfaceC9540l releaseBlock;
    private InterfaceC9540l resetBlock;
    private SaveableStateRegistry.Entry savableRegistryEntry;
    private final String saveStateKey;
    private final SaveableStateRegistry saveStateRegistry;
    private final T typedView;
    private InterfaceC9540l updateBlock;

    public /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i10, Owner owner, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : compositionContext, view, (i11 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i10, owner);
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new InterfaceC9529a(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder.registerSaveStateProvider.1
                final /* synthetic */ ViewFactoryHolder<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    ((ViewFactoryHolder) this.this$0).typedView.saveHierarchyState(sparseArray);
                    return sparseArray;
                }
            }));
        }
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final InterfaceC9540l getReleaseBlock() {
        return this.releaseBlock;
    }

    public final InterfaceC9540l getResetBlock() {
        return this.resetBlock;
    }

    public final InterfaceC9540l getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.p014ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(InterfaceC9540l interfaceC9540l) {
        this.releaseBlock = interfaceC9540l;
        setRelease(new InterfaceC9529a(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33757invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33757invoke() {
                this.this$0.getReleaseBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
                this.this$0.unregisterSaveStateProvider();
            }
        });
    }

    public final void setResetBlock(InterfaceC9540l interfaceC9540l) {
        this.resetBlock = interfaceC9540l;
        setReset(new InterfaceC9529a(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33758invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33758invoke() {
                this.this$0.getResetBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
            }
        });
    }

    public final void setUpdateBlock(InterfaceC9540l interfaceC9540l) {
        this.updateBlock = interfaceC9540l;
        setUpdate(new InterfaceC9529a(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33759invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33759invoke() {
                this.this$0.getUpdateBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
            }
        });
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t10, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i10, Owner owner) {
        super(context, compositionContext, i10, nestedScrollDispatcher, t10, owner);
        this.typedView = t10;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.compositeKeyHash = i10;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        this.saveStateKey = strValueOf;
        Object objConsumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
        if (sparseArray != null) {
            t10.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, InterfaceC9540l interfaceC9540l, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i10, Owner owner, int i11, AbstractC9972n abstractC9972n) {
        this(context, interfaceC9540l, (i11 & 4) != 0 ? null : compositionContext, saveableStateRegistry, i10, owner);
    }

    public ViewFactoryHolder(Context context, InterfaceC9540l interfaceC9540l, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i10, Owner owner) {
        this(context, compositionContext, (View) interfaceC9540l.invoke(context), null, saveableStateRegistry, i10, owner, 8, null);
    }
}
