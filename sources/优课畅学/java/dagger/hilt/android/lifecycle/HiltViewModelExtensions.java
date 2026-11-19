package dagger.hilt.android.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public abstract class HiltViewModelExtensions {
    /* renamed from: a */
    public static final CreationExtras m13543a(MutableCreationExtras mutableCreationExtras, final InterfaceC10570l callback) {
        AbstractC9133u.m16133g(mutableCreationExtras, "<this>");
        AbstractC9133u.m16133g(callback, "callback");
        CreationExtras.Key CREATION_CALLBACK_KEY = HiltViewModelFactory.f15818d;
        AbstractC9133u.m16132f(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        mutableCreationExtras.set(CREATION_CALLBACK_KEY, new InterfaceC10570l() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ViewModel invoke(Object obj) {
                return (ViewModel) callback.invoke(obj);
            }
        });
        return mutableCreationExtras;
    }

    /* renamed from: b */
    public static final CreationExtras m13544b(CreationExtras creationExtras, InterfaceC10570l callback) {
        AbstractC9133u.m16133g(creationExtras, "<this>");
        AbstractC9133u.m16133g(callback, "callback");
        return m13543a(new MutableCreationExtras(creationExtras), callback);
    }
}
