package androidx.compose.runtime.livedata;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m13558d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "R", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt$observeAsState$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,70:1\n64#2,5:71\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt$observeAsState$1$1\n*L\n66#1:71,5\n*E\n"})
/* loaded from: classes2.dex */
public final class LiveDataAdapterKt$observeAsState$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ MutableState<R> $state;
    final /* synthetic */ LiveData<T> $this_observeAsState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataAdapterKt$observeAsState$1$1(LiveData<T> liveData, LifecycleOwner lifecycleOwner, MutableState<R> mutableState) {
        super(1);
        this.$this_observeAsState = liveData;
        this.$lifecycleOwner = lifecycleOwner;
        this.$state = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final MutableState<R> mutableState = this.$state;
        final Observer observer = new Observer() { // from class: androidx.compose.runtime.livedata.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                mutableState.setValue(obj);
            }
        };
        this.$this_observeAsState.observe(this.$lifecycleOwner, observer);
        final LiveData<T> liveData = this.$this_observeAsState;
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                liveData.removeObserver(observer);
            }
        };
    }
}
