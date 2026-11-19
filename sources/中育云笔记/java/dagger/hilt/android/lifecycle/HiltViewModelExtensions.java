package dagger.hilt.android.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes6.dex */
public abstract class HiltViewModelExtensions {
    /* renamed from: a */
    public static final CreationExtras m17601a(MutableCreationExtras mutableCreationExtras, final InterfaceC9540l callback) {
        AbstractC9979u.m20294g(mutableCreationExtras, "<this>");
        AbstractC9979u.m20294g(callback, "callback");
        CreationExtras.Key CREATION_CALLBACK_KEY = HiltViewModelFactory.f20983d;
        AbstractC9979u.m20293f(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        mutableCreationExtras.set(CREATION_CALLBACK_KEY, new InterfaceC9540l() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ViewModel invoke(Object obj) {
                return (ViewModel) callback.invoke(obj);
            }
        });
        return mutableCreationExtras;
    }

    /* renamed from: b */
    public static final CreationExtras m17602b(CreationExtras creationExtras, InterfaceC9540l callback) {
        AbstractC9979u.m20294g(creationExtras, "<this>");
        AbstractC9979u.m20294g(callback, "callback");
        return m17601a(new MutableCreationExtras(creationExtras), callback);
    }
}
