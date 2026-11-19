package p000a.p005b.p014h;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import androidx.appcompat.app.AlertController;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.p006c.DialogInterfaceC0018d;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.h.s */
/* loaded from: classes.dex */
public class C0105s extends Spinner {

    /* renamed from: j */
    public static final int[] f760j = {R.attr.spinnerMode};

    /* renamed from: b */
    public final C0077e f761b;

    /* renamed from: c */
    public final Context f762c;

    /* renamed from: d */
    public AbstractViewOnTouchListenerC0078e0 f763d;

    /* renamed from: e */
    public SpinnerAdapter f764e;

    /* renamed from: f */
    public final boolean f765f;

    /* renamed from: g */
    public f f766g;

    /* renamed from: h */
    public int f767h;

    /* renamed from: i */
    public final Rect f768i;

    /* renamed from: a.b.h.s$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C0105s.this.getInternalPopup().mo385a()) {
                C0105s.this.m384b();
            }
            ViewTreeObserver viewTreeObserver = C0105s.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: a.b.h.s$b */
    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: b */
        public DialogInterfaceC0018d f770b;

        /* renamed from: c */
        public ListAdapter f771c;

        /* renamed from: d */
        public CharSequence f772d;

        public b() {
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: a */
        public boolean mo385a() {
            DialogInterfaceC0018d dialogInterfaceC0018d = this.f770b;
            if (dialogInterfaceC0018d != null) {
                return dialogInterfaceC0018d.isShowing();
            }
            return false;
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: c */
        public CharSequence mo386c() {
            return this.f772d;
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: d */
        public void mo387d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // p000a.p005b.p014h.C0105s.f
        public void dismiss() {
            DialogInterfaceC0018d dialogInterfaceC0018d = this.f770b;
            if (dialogInterfaceC0018d != null) {
                dialogInterfaceC0018d.dismiss();
                this.f770b = null;
            }
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: e */
        public int mo388e() {
            return 0;
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: g */
        public void mo389g(int i, int i2) {
            if (this.f771c == null) {
                return;
            }
            DialogInterfaceC0018d.a aVar = new DialogInterfaceC0018d.a(C0105s.this.getPopupContext());
            CharSequence charSequence = this.f772d;
            if (charSequence != null) {
                aVar.f58a.f2730d = charSequence;
            }
            ListAdapter listAdapter = this.f771c;
            int selectedItemPosition = C0105s.this.getSelectedItemPosition();
            AlertController.C0457b c0457b = aVar.f58a;
            c0457b.f2733g = listAdapter;
            c0457b.f2734h = this;
            c0457b.f2736j = selectedItemPosition;
            c0457b.f2735i = true;
            DialogInterfaceC0018d dialogInterfaceC0018dM20a = aVar.m20a();
            this.f770b = dialogInterfaceC0018dM20a;
            ListView listView = dialogInterfaceC0018dM20a.f57d.f2704g;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.f770b.show();
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: i */
        public void mo390i(CharSequence charSequence) {
            this.f772d = charSequence;
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: j */
        public int mo391j() {
            return 0;
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: l */
        public void mo392l(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: m */
        public void mo393m(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: n */
        public Drawable mo394n() {
            return null;
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: o */
        public void mo329o(ListAdapter listAdapter) {
            this.f771c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0105s.this.setSelection(i);
            if (C0105s.this.getOnItemClickListener() != null) {
                C0105s.this.performItemClick(null, i, this.f771c.getItemId(i));
            }
            DialogInterfaceC0018d dialogInterfaceC0018d = this.f770b;
            if (dialogInterfaceC0018d != null) {
                dialogInterfaceC0018d.dismiss();
                this.f770b = null;
            }
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: p */
        public void mo395p(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: a.b.h.s$c */
    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f774b;

        /* renamed from: c */
        public ListAdapter f775c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f774b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f775c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0102q0) {
                    InterfaceC0102q0 interfaceC0102q0 = (InterfaceC0102q0) spinnerAdapter;
                    if (interfaceC0102q0.getDropDownViewTheme() == null) {
                        interfaceC0102q0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f775c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f774b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f774b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f774b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f774b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f774b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f774b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f775c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f774b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f774b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a.b.h.s$d */
    public class d extends C0084h0 implements f {

        /* renamed from: E */
        public CharSequence f776E;

        /* renamed from: F */
        public ListAdapter f777F;

        /* renamed from: G */
        public final Rect f778G;

        /* renamed from: H */
        public int f779H;

        /* renamed from: a.b.h.s$d$a */
        public class a implements AdapterView.OnItemClickListener {
            public a(C0105s c0105s) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0105s.this.setSelection(i);
                if (C0105s.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    C0105s.this.performItemClick(view, i, dVar.f777F.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        /* renamed from: a.b.h.s$d$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                d dVar = d.this;
                C0105s c0105s = C0105s.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                if (!(c0105s.isAttachedToWindow() && c0105s.getGlobalVisibleRect(dVar.f778G))) {
                    d.this.dismiss();
                } else {
                    d.this.m396t();
                    d.this.mo172b();
                }
            }
        }

        /* renamed from: a.b.h.s$d$c */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f783b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f783b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0105s.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f783b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f778G = new Rect();
            this.f660q = C0105s.this;
            m332s(true);
            this.f658o = 0;
            this.f661r = new a(C0105s.this);
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: c */
        public CharSequence mo386c() {
            return this.f776E;
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: g */
        public void mo389g(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ViewTreeObserver viewTreeObserver;
            boolean zMo171a = mo171a();
            m396t();
            this.f644A.setInputMethodMode(2);
            mo172b();
            C0074c0 c0074c0 = this.f647d;
            c0074c0.setChoiceMode(1);
            c0074c0.setTextDirection(i);
            c0074c0.setTextAlignment(i2);
            int selectedItemPosition = C0105s.this.getSelectedItemPosition();
            C0074c0 c0074c02 = this.f647d;
            if (mo171a() && c0074c02 != null) {
                c0074c02.setListSelectionHidden(false);
                c0074c02.setSelection(selectedItemPosition);
                if (c0074c02.getChoiceMode() != 0) {
                    c0074c02.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zMo171a || (viewTreeObserver = C0105s.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.f644A.setOnDismissListener(new c(bVar));
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: i */
        public void mo390i(CharSequence charSequence) {
            this.f776E = charSequence;
        }

        @Override // p000a.p005b.p014h.C0084h0, p000a.p005b.p014h.C0105s.f
        /* renamed from: o */
        public void mo329o(ListAdapter listAdapter) {
            super.mo329o(listAdapter);
            this.f777F = listAdapter;
        }

        @Override // p000a.p005b.p014h.C0105s.f
        /* renamed from: p */
        public void mo395p(int i) {
            this.f779H = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        /* renamed from: t */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m396t() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m328n()
                r1 = 0
                if (r0 == 0) goto L26
                a.b.h.s r1 = p000a.p005b.p014h.C0105s.this
                android.graphics.Rect r1 = r1.f768i
                r0.getPadding(r1)
                a.b.h.s r0 = p000a.p005b.p014h.C0105s.this
                boolean r0 = p000a.p005b.p014h.C0069a1.m281b(r0)
                if (r0 == 0) goto L1d
                a.b.h.s r0 = p000a.p005b.p014h.C0105s.this
                android.graphics.Rect r0 = r0.f768i
                int r0 = r0.right
                goto L24
            L1d:
                a.b.h.s r0 = p000a.p005b.p014h.C0105s.this
                android.graphics.Rect r0 = r0.f768i
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                a.b.h.s r0 = p000a.p005b.p014h.C0105s.this
                android.graphics.Rect r0 = r0.f768i
                r0.right = r1
                r0.left = r1
            L2e:
                a.b.h.s r0 = p000a.p005b.p014h.C0105s.this
                int r0 = r0.getPaddingLeft()
                a.b.h.s r2 = p000a.p005b.p014h.C0105s.this
                int r2 = r2.getPaddingRight()
                a.b.h.s r3 = p000a.p005b.p014h.C0105s.this
                int r3 = r3.getWidth()
                a.b.h.s r4 = p000a.p005b.p014h.C0105s.this
                int r5 = r4.f767h
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f777F
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m328n()
                int r4 = r4.m383a(r5, r6)
                a.b.h.s r5 = p000a.p005b.p014h.C0105s.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                a.b.h.s r6 = p000a.p005b.p014h.C0105s.this
                android.graphics.Rect r6 = r6.f768i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.m331r(r4)
                goto L85
            L82:
                r8.m331r(r5)
            L85:
                a.b.h.s r4 = p000a.p005b.p014h.C0105s.this
                boolean r4 = p000a.p005b.p014h.C0069a1.m281b(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.f649f
                int r3 = r3 - r0
                int r0 = r8.f779H
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.f779H
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.f650g = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0105s.d.m396t():void");
        }
    }

    /* renamed from: a.b.h.s$e */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b */
        public boolean f785b;

        /* renamed from: a.b.h.s$e$a */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f785b = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f785b ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: a.b.h.s$f */
    public interface f {
        /* renamed from: a */
        boolean mo385a();

        /* renamed from: c */
        CharSequence mo386c();

        /* renamed from: d */
        void mo387d(int i);

        void dismiss();

        /* renamed from: e */
        int mo388e();

        /* renamed from: g */
        void mo389g(int i, int i2);

        /* renamed from: i */
        void mo390i(CharSequence charSequence);

        /* renamed from: j */
        int mo391j();

        /* renamed from: l */
        void mo392l(Drawable drawable);

        /* renamed from: m */
        void mo393m(int i);

        /* renamed from: n */
        Drawable mo394n();

        /* renamed from: o */
        void mo329o(ListAdapter listAdapter);

        /* renamed from: p */
        void mo395p(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0105s(android.content.Context r10, android.util.AttributeSet r11, int r12) throws java.lang.Throwable {
        /*
            r9 = this;
            int[] r0 = p000a.p005b.C0014b.f46u
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.f768i = r1
            android.content.Context r1 = r9.getContext()
            p000a.p005b.p014h.C0100p0.m376a(r9, r1)
            r1 = 0
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            a.b.h.e r3 = new a.b.h.e
            r3.<init>(r9)
            r9.f761b = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L2e
            a.b.g.c r4 = new a.b.g.c
            r4.<init>(r10, r3)
            r9.f762c = r4
            goto L30
        L2e:
            r9.f762c = r10
        L30:
            r3 = 0
            r4 = -1
            int[] r5 = p000a.p005b.p014h.C0105s.f760j     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r11, r5, r12, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r6 == 0) goto L58
            int r4 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r10 = move-exception
            r3 = r5
            goto Lce
        L47:
            r6 = move-exception
            goto L4f
        L49:
            r10 = move-exception
            goto Lce
        L4c:
            r5 = move-exception
            r6 = r5
            r5 = r3
        L4f:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L5b
        L58:
            r5.recycle()
        L5b:
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L95
            if (r4 == r6) goto L62
            goto La3
        L62:
            a.b.h.s$d r4 = new a.b.h.s$d
            android.content.Context r7 = r9.f762c
            r4.<init>(r7, r11, r12)
            android.content.Context r7 = r9.f762c
            a.b.h.u0 r0 = p000a.p005b.p014h.C0110u0.m414q(r7, r11, r0, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r0.m425k(r7, r8)
            r9.f767h = r7
            android.graphics.drawable.Drawable r7 = r0.m421g(r6)
            android.widget.PopupWindow r8 = r4.f644A
            r8.setBackgroundDrawable(r7)
            java.lang.String r5 = r2.getString(r5)
            r4.f776E = r5
            android.content.res.TypedArray r0 = r0.f810b
            r0.recycle()
            r9.f766g = r4
            a.b.h.r r0 = new a.b.h.r
            r0.<init>(r9, r9, r4)
            r9.f763d = r0
            goto La3
        L95:
            a.b.h.s$b r0 = new a.b.h.s$b
            r0.<init>()
            r9.f766g = r0
            java.lang.String r4 = r2.getString(r5)
            r0.mo390i(r4)
        La3:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto Lba
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r10, r4, r0)
            r10 = 2131492961(0x7f0c0061, float:1.8609389E38)
            r1.setDropDownViewResource(r10)
            r9.setAdapter(r1)
        Lba:
            r2.recycle()
            r9.f765f = r6
            android.widget.SpinnerAdapter r10 = r9.f764e
            if (r10 == 0) goto Lc8
            r9.setAdapter(r10)
            r9.f764e = r3
        Lc8:
            a.b.h.e r10 = r9.f761b
            r10.m303d(r11, r12)
            return
        Lce:
            if (r3 == 0) goto Ld3
            r3.recycle()
        Ld3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0105s.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public int m383a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
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
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
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
        drawable.getPadding(this.f768i);
        Rect rect = this.f768i;
        return iMax2 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void m384b() {
        this.f766g.mo389g(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.f761b;
        if (c0077e != null) {
            c0077e.m300a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f766g;
        return fVar != null ? fVar.mo388e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f766g;
        return fVar != null ? fVar.mo391j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f766g != null ? this.f767h : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f766g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f766g;
        return fVar != null ? fVar.mo394n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f762c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f766g;
        return fVar != null ? fVar.mo386c() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.f761b;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.f761b;
        if (c0077e != null) {
            return c0077e.m302c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f766g;
        if (fVar == null || !fVar.mo385a()) {
            return;
        }
        this.f766g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f766g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m383a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (!eVar.f785b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f766g;
        eVar.f785b = fVar != null && fVar.mo385a();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0078e0 abstractViewOnTouchListenerC0078e0 = this.f763d;
        if (abstractViewOnTouchListenerC0078e0 == null || !abstractViewOnTouchListenerC0078e0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.f766g;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.mo385a()) {
            return true;
        }
        m384b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f765f) {
            this.f764e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f766g != null) {
            Context context = this.f762c;
            if (context == null) {
                context = getContext();
            }
            this.f766g.mo329o(new c(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0077e c0077e = this.f761b;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.f761b;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.f766g;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            fVar.mo395p(i);
            this.f766g.mo387d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        f fVar = this.f766g;
        if (fVar != null) {
            fVar.mo393m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f766g != null) {
            this.f767h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f766g;
        if (fVar != null) {
            fVar.mo392l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0034a.m129a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f766g;
        if (fVar != null) {
            fVar.mo390i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.f761b;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.f761b;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }
}
