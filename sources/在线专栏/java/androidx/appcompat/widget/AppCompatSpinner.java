package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogC0101b;
import androidx.appcompat.view.menu.InterfaceC0134p;
import androidx.core.view.C0358u;
import p015c.C1038a;
import p073d.C2443a;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* renamed from: i */
    private static final int[] f844i = {R.attr.spinnerMode};

    /* renamed from: a */
    private final C0207d f845a;

    /* renamed from: b */
    private final Context f846b;

    /* renamed from: c */
    private AbstractViewOnTouchListenerC0234t f847c;

    /* renamed from: d */
    private SpinnerAdapter f848d;

    /* renamed from: e */
    private final boolean f849e;

    /* renamed from: f */
    private InterfaceC0167f f850f;

    /* renamed from: g */
    int f851g;

    /* renamed from: h */
    final Rect f852h;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0161a();

        /* renamed from: a */
        boolean f853a;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        class C0161a implements Parcelable.Creator<SavedState> {
            C0161a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.f853a ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f853a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0162a extends AbstractViewOnTouchListenerC0234t {

        /* renamed from: j */
        final /* synthetic */ C0166e f854j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0162a(View view, C0166e c0166e) {
            super(view);
            this.f854j = c0166e;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
        /* renamed from: b */
        public InterfaceC0134p mo413b() {
            return this.f854j;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo414c() {
            if (AppCompatSpinner.this.getInternalPopup().mo624a()) {
                return true;
            }
            AppCompatSpinner.this.m621b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class ViewTreeObserverOnGlobalLayoutListenerC0163b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC0163b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo624a()) {
                AppCompatSpinner.this.m621b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    class DialogInterfaceOnClickListenerC0164c implements InterfaceC0167f, DialogInterface.OnClickListener {

        /* renamed from: a */
        DialogC0101b f857a;

        /* renamed from: b */
        private ListAdapter f858b;

        /* renamed from: c */
        private CharSequence f859c;

        DialogInterfaceOnClickListenerC0164c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: a */
        public boolean mo624a() {
            DialogC0101b dialogC0101b = this.f857a;
            if (dialogC0101b != null) {
                return dialogC0101b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: b */
        public int mo625b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        public void dismiss() {
            DialogC0101b dialogC0101b = this.f857a;
            if (dialogC0101b != null) {
                dialogC0101b.dismiss();
                this.f857a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: e */
        public Drawable mo626e() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: g */
        public void mo627g(CharSequence charSequence) {
            this.f859c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: h */
        public void mo628h(int i4) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: i */
        public void mo629i(int i4) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: j */
        public void mo630j(int i4) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: k */
        public void mo631k(int i4, int i5) {
            if (this.f858b == null) {
                return;
            }
            DialogC0101b.a aVar = new DialogC0101b.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f859c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            DialogC0101b dialogC0101bCreate = aVar.setSingleChoiceItems(this.f858b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f857a = dialogC0101bCreate;
            ListView listViewM271a = dialogC0101bCreate.m271a();
            listViewM271a.setTextDirection(i4);
            listViewM271a.setTextAlignment(i5);
            this.f857a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: l */
        public int mo632l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: m */
        public CharSequence mo633m() {
            return this.f859c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: n */
        public void mo634n(ListAdapter listAdapter) {
            this.f858b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            AppCompatSpinner.this.setSelection(i4);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i4, this.f858b.getItemId(i4));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    private static class C0165d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f861a;

        /* renamed from: b */
        private ListAdapter f862b;

        public C0165d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f861a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f862b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0206c0) {
                    InterfaceC0206c0 interfaceC0206c0 = (InterfaceC0206c0) spinnerAdapter;
                    if (interfaceC0206c0.getDropDownViewTheme() == null) {
                        interfaceC0206c0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f862b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f861a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f861a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i4, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            SpinnerAdapter spinnerAdapter = this.f861a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            SpinnerAdapter spinnerAdapter = this.f861a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i4);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i4) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            return getDropDownView(i4, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f861a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i4) {
            ListAdapter listAdapter = this.f862b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i4);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f861a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f861a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    class C0166e extends ListPopupWindow implements InterfaceC0167f {

        /* renamed from: J */
        private CharSequence f863J;

        /* renamed from: K */
        ListAdapter f864K;

        /* renamed from: L */
        private final Rect f865L;

        /* renamed from: M */
        private int f866M;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AppCompatSpinner f868a;

            a(AppCompatSpinner appCompatSpinner) {
                this.f868a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                AppCompatSpinner.this.setSelection(i4);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0166e c0166e = C0166e.this;
                    AppCompatSpinner.this.performItemClick(view, i4, c0166e.f864K.getItemId(i4));
                }
                C0166e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0166e c0166e = C0166e.this;
                if (!c0166e.m638S(AppCompatSpinner.this)) {
                    C0166e.this.dismiss();
                } else {
                    C0166e.this.m636Q();
                    C0166e.super.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f871a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f871a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f871a);
                }
            }
        }

        public C0166e(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f865L = new Rect();
            m646B(AppCompatSpinner.this);
            m652H(true);
            m656M(0);
            m654J(new a(AppCompatSpinner.this));
        }

        /* renamed from: Q */
        void m636Q() {
            Drawable drawableM660e = m660e();
            int i4 = 0;
            if (drawableM660e != null) {
                drawableM660e.getPadding(AppCompatSpinner.this.f852h);
                i4 = C0226m0.m947b(AppCompatSpinner.this) ? AppCompatSpinner.this.f852h.right : -AppCompatSpinner.this.f852h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f852h;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i5 = appCompatSpinner.f851g;
            if (i5 == -2) {
                int iM620a = appCompatSpinner.m620a((SpinnerAdapter) this.f864K, m660e());
                int i6 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f852h;
                int i7 = (i6 - rect2.left) - rect2.right;
                if (iM620a > i7) {
                    iM620a = i7;
                }
                m648D(Math.max(iM620a, (width - paddingLeft) - paddingRight));
            } else if (i5 == -1) {
                m648D((width - paddingLeft) - paddingRight);
            } else {
                m648D(i5);
            }
            m662j(C0226m0.m947b(AppCompatSpinner.this) ? i4 + (((width - paddingRight) - m671x()) - m637R()) : i4 + paddingLeft + m637R());
        }

        /* renamed from: R */
        public int m637R() {
            return this.f866M;
        }

        /* renamed from: S */
        boolean m638S(View view) {
            return C0358u.m2012U(view) && view.getGlobalVisibleRect(this.f865L);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: g */
        public void mo627g(CharSequence charSequence) {
            this.f863J = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: i */
        public void mo629i(int i4) {
            this.f866M = i4;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: k */
        public void mo631k(int i4, int i5) {
            ViewTreeObserver viewTreeObserver;
            boolean zMo450a = mo450a();
            m636Q();
            m651G(2);
            super.show();
            ListView listViewMo453f = mo453f();
            listViewMo453f.setChoiceMode(1);
            listViewMo453f.setTextDirection(i4);
            listViewMo453f.setTextAlignment(i5);
            m657N(AppCompatSpinner.this.getSelectedItemPosition());
            if (zMo450a || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m653I(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: m */
        public CharSequence mo633m() {
            return this.f863J;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0167f
        /* renamed from: n */
        public void mo634n(ListAdapter listAdapter) {
            super.mo634n(listAdapter);
            this.f864K = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    interface InterfaceC0167f {
        /* renamed from: a */
        boolean mo624a();

        /* renamed from: b */
        int mo625b();

        void dismiss();

        /* renamed from: e */
        Drawable mo626e();

        /* renamed from: g */
        void mo627g(CharSequence charSequence);

        /* renamed from: h */
        void mo628h(int i4);

        /* renamed from: i */
        void mo629i(int i4);

        /* renamed from: j */
        void mo630j(int i4);

        /* renamed from: k */
        void mo631k(int i4, int i5);

        /* renamed from: l */
        int mo632l();

        /* renamed from: m */
        CharSequence mo633m();

        /* renamed from: n */
        void mo634n(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5732K);
    }

    /* renamed from: a */
    int m620a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f852h);
        Rect rect = this.f852h;
        return iMax2 + rect.left + rect.right;
    }

    /* renamed from: b */
    void m621b() {
        this.f850f.mo631k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0207d c0207d = this.f845a;
        if (c0207d != null) {
            c0207d.m770b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0167f interfaceC0167f = this.f850f;
        return interfaceC0167f != null ? interfaceC0167f.mo625b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0167f interfaceC0167f = this.f850f;
        return interfaceC0167f != null ? interfaceC0167f.mo632l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f850f != null ? this.f851g : super.getDropDownWidth();
    }

    final InterfaceC0167f getInternalPopup() {
        return this.f850f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0167f interfaceC0167f = this.f850f;
        return interfaceC0167f != null ? interfaceC0167f.mo626e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f846b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0167f interfaceC0167f = this.f850f;
        return interfaceC0167f != null ? interfaceC0167f.mo633m() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207d c0207d = this.f845a;
        if (c0207d != null) {
            return c0207d.m771c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207d c0207d = this.f845a;
        if (c0207d != null) {
            return c0207d.m772d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0167f interfaceC0167f = this.f850f;
        if (interfaceC0167f == null || !interfaceC0167f.mo624a()) {
            return;
        }
        this.f850f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f850f == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m620a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f853a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0163b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0167f interfaceC0167f = this.f850f;
        savedState.f853a = interfaceC0167f != null && interfaceC0167f.mo624a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0234t abstractViewOnTouchListenerC0234t = this.f847c;
        if (abstractViewOnTouchListenerC0234t == null || !abstractViewOnTouchListenerC0234t.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0167f interfaceC0167f = this.f850f;
        if (interfaceC0167f == null) {
            return super.performClick();
        }
        if (interfaceC0167f.mo624a()) {
            return true;
        }
        m621b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207d c0207d = this.f845a;
        if (c0207d != null) {
            c0207d.m774f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0207d c0207d = this.f845a;
        if (c0207d != null) {
            c0207d.m775g(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        InterfaceC0167f interfaceC0167f = this.f850f;
        if (interfaceC0167f == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            interfaceC0167f.mo629i(i4);
            this.f850f.mo630j(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        InterfaceC0167f interfaceC0167f = this.f850f;
        if (interfaceC0167f != null) {
            interfaceC0167f.mo628h(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f850f != null) {
            this.f851g = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0167f interfaceC0167f = this.f850f;
        if (interfaceC0167f != null) {
            interfaceC0167f.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(C2443a.m8169d(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0167f interfaceC0167f = this.f850f;
        if (interfaceC0167f != null) {
            interfaceC0167f.mo627g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207d c0207d = this.f845a;
        if (c0207d != null) {
            c0207d.m777i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207d c0207d = this.f845a;
        if (c0207d != null) {
            c0207d.m778j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f849e) {
            this.f848d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f850f != null) {
            Context context = this.f846b;
            if (context == null) {
                context = getContext();
            }
            this.f850f.mo634n(new C0165d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(context, attributeSet, i4, i5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.Spinner, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
