package androidx.fragment.app;

import androidx.annotation.MainThread;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class FragmentManagerKt {
    public static final void commit(FragmentManager fragmentManager, boolean z10, InterfaceC10570l interfaceC10570l) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC10570l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC10570l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @MainThread
    public static final void commitNow(FragmentManager fragmentManager, boolean z10, InterfaceC10570l interfaceC10570l) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC10570l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC10570l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    @InterfaceC8721a
    public static final void transaction(FragmentManager fragmentManager, boolean z10, boolean z11, InterfaceC10570l interfaceC10570l) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC10570l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            if (z11) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z11) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z10, boolean z11, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC10570l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            if (z11) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z11) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }
}
