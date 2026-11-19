package dagger.hilt.android.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class HiltViewModelExtensions {
    /* renamed from: a */
    public static final CreationExtras m6348a(MutableCreationExtras mutableCreationExtras, final Function1 callback) {
        Intrinsics.checkNotNullParameter(mutableCreationExtras, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CreationExtras.Key CREATION_CALLBACK_KEY = HiltViewModelFactory.f7558d;
        Intrinsics.checkNotNullExpressionValue(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        mutableCreationExtras.set(CREATION_CALLBACK_KEY, new Function1<Object, ViewModel>() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ViewModel invoke(Object obj) {
                return (ViewModel) callback.invoke(obj);
            }
        });
        return mutableCreationExtras;
    }

    /* renamed from: b */
    public static final CreationExtras m6349b(CreationExtras creationExtras, Function1 callback) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return m6348a(new MutableCreationExtras(creationExtras), callback);
    }
}
