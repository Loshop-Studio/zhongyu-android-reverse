package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0497f0;
import androidx.lifecycle.C0499g0;
import androidx.lifecycle.InterfaceC0504l;
import androidx.lifecycle.InterfaceC0512t;
import androidx.savedstate.C0652d;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0454c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private InterfaceC0512t<InterfaceC0504l> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterfaceOnCancelListenerC0454c.this.mOnDismissListener.onDismiss(DialogInterfaceOnCancelListenerC0454c.this.mDialog);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0454c.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC0454c dialogInterfaceOnCancelListenerC0454c = DialogInterfaceOnCancelListenerC0454c.this;
                dialogInterfaceOnCancelListenerC0454c.onCancel(dialogInterfaceOnCancelListenerC0454c.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0454c.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC0454c dialogInterfaceOnCancelListenerC0454c = DialogInterfaceOnCancelListenerC0454c.this;
                dialogInterfaceOnCancelListenerC0454c.onDismiss(dialogInterfaceOnCancelListenerC0454c.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    class d implements InterfaceC0512t<InterfaceC0504l> {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC0512t
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2584a(InterfaceC0504l interfaceC0504l) {
            if (interfaceC0504l == null || !DialogInterfaceOnCancelListenerC0454c.this.mShowsDialog) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC0454c.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC0454c.this.mDialog != null) {
                if (FragmentManager.m2388H0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0454c.this.mDialog);
                }
                DialogInterfaceOnCancelListenerC0454c.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    class e extends AbstractC0456e {

        /* renamed from: a */
        final /* synthetic */ AbstractC0456e f3165a;

        e(AbstractC0456e abstractC0456e) {
            this.f3165a = abstractC0456e;
        }

        @Override // androidx.fragment.app.AbstractC0456e
        /* renamed from: c */
        public View mo2371c(int i4) {
            return this.f3165a.mo2372d() ? this.f3165a.mo2371c(i4) : DialogInterfaceOnCancelListenerC0454c.this.onFindViewById(i4);
        }

        @Override // androidx.fragment.app.AbstractC0456e
        /* renamed from: d */
        public boolean mo2372d() {
            return this.f3165a.mo2372d() || DialogInterfaceOnCancelListenerC0454c.this.onHasView();
        }
    }

    public DialogInterfaceOnCancelListenerC0454c() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z3, boolean z4) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z4) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            getParentFragmentManager().m2464Y0(this.mBackStackId, 1);
            this.mBackStackId = -1;
            return;
        }
        AbstractC0470s abstractC0470sM2489m = getParentFragmentManager().m2489m();
        abstractC0470sM2489m.mo2557p(this);
        if (z3) {
            abstractC0470sM2489m.mo2551i();
        } else {
            abstractC0470sM2489m.mo2550h();
        }
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    AbstractC0456e createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.m2388H0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        dismissInternal(true, true);
    }

    View onFindViewById(int i4) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (FragmentManager.m2388H0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.m2388H0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i4 = this.mStyle;
        if (i4 != 0) {
            bundle.putInt(SAVED_STYLE, i4);
        }
        int i5 = this.mTheme;
        if (i5 != 0) {
            bundle.putInt(SAVED_THEME, i5);
        }
        boolean z3 = this.mCancelable;
        if (!z3) {
            bundle.putBoolean(SAVED_CANCELABLE, z3);
        }
        boolean z4 = this.mShowsDialog;
        if (!z4) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z4);
        }
        int i6 = this.mBackStackId;
        if (i6 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            C0497f0.m2875a(decorView, this);
            C0499g0.m2878a(decorView, this);
            C0652d.m3667a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z3) {
        this.mCancelable = z3;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z3);
        }
    }

    public void setShowsDialog(boolean z3) {
        this.mShowsDialog = z3;
    }

    public void setStyle(int i4, int i5) {
        if (FragmentManager.m2388H0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i4 + ", " + i5);
        }
        this.mStyle = i4;
        if (i4 == 2 || i4 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i5 != 0) {
            this.mTheme = i5;
        }
    }

    public void setupDialog(Dialog dialog, int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC0470s abstractC0470sM2489m = fragmentManager.m2489m();
        abstractC0470sM2489m.m2702e(this, str);
        abstractC0470sM2489m.mo2550h();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC0470s abstractC0470sM2489m = fragmentManager.m2489m();
        abstractC0470sM2489m.m2702e(this, str);
        abstractC0470sM2489m.mo2552j();
    }

    public int show(AbstractC0470s abstractC0470s, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC0470s.m2702e(this, str);
        this.mViewDestroyed = false;
        int iMo2550h = abstractC0470s.mo2550h();
        this.mBackStackId = iMo2550h;
        return iMo2550h;
    }

    public DialogInterfaceOnCancelListenerC0454c(int i4) {
        super(i4);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }
}
