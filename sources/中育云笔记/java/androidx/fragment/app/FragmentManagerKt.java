package androidx.fragment.app;

import androidx.annotation.MainThread;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class FragmentManagerKt {
    public static final void commit(FragmentManager fragmentManager, boolean z10, InterfaceC9540l interfaceC9540l) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC9540l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC9540l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @MainThread
    public static final void commitNow(FragmentManager fragmentManager, boolean z10, InterfaceC9540l interfaceC9540l) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC9540l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC9540l.invoke(fragmentTransactionBeginTransaction);
        if (z10) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    @InterfaceC10770a
    public static final void transaction(FragmentManager fragmentManager, boolean z10, boolean z11, InterfaceC9540l interfaceC9540l) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC9540l.invoke(fragmentTransactionBeginTransaction);
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

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z10, boolean z11, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        interfaceC9540l.invoke(fragmentTransactionBeginTransaction);
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
