package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C0358u;
import androidx.core.widget.NestedScrollView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;
import p015c.C1038a;
import p015c.C1043f;
import p015c.C1047j;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A */
    NestedScrollView f121A;

    /* renamed from: C */
    private Drawable f123C;

    /* renamed from: D */
    private ImageView f124D;

    /* renamed from: E */
    private TextView f125E;

    /* renamed from: F */
    private TextView f126F;

    /* renamed from: G */
    private View f127G;

    /* renamed from: H */
    ListAdapter f128H;

    /* renamed from: J */
    private int f130J;

    /* renamed from: K */
    private int f131K;

    /* renamed from: L */
    int f132L;

    /* renamed from: M */
    int f133M;

    /* renamed from: N */
    int f134N;

    /* renamed from: O */
    int f135O;

    /* renamed from: P */
    private boolean f136P;

    /* renamed from: R */
    Handler f138R;

    /* renamed from: a */
    private final Context f140a;

    /* renamed from: b */
    final DialogC0104e f141b;

    /* renamed from: c */
    private final Window f142c;

    /* renamed from: d */
    private final int f143d;

    /* renamed from: e */
    private CharSequence f144e;

    /* renamed from: f */
    private CharSequence f145f;

    /* renamed from: g */
    ListView f146g;

    /* renamed from: h */
    private View f147h;

    /* renamed from: i */
    private int f148i;

    /* renamed from: j */
    private int f149j;

    /* renamed from: k */
    private int f150k;

    /* renamed from: l */
    private int f151l;

    /* renamed from: m */
    private int f152m;

    /* renamed from: o */
    Button f154o;

    /* renamed from: p */
    private CharSequence f155p;

    /* renamed from: q */
    Message f156q;

    /* renamed from: r */
    private Drawable f157r;

    /* renamed from: s */
    Button f158s;

    /* renamed from: t */
    private CharSequence f159t;

    /* renamed from: u */
    Message f160u;

    /* renamed from: v */
    private Drawable f161v;

    /* renamed from: w */
    Button f162w;

    /* renamed from: x */
    private CharSequence f163x;

    /* renamed from: y */
    Message f164y;

    /* renamed from: z */
    private Drawable f165z;

    /* renamed from: n */
    private boolean f153n = false;

    /* renamed from: B */
    private int f122B = 0;

    /* renamed from: I */
    int f129I = -1;

    /* renamed from: Q */
    private int f137Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f139S = new ViewOnClickListenerC0070a();

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f166a;

        /* renamed from: b */
        private final int f167b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1047j.f6091h2);
            this.f167b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1047j.f6096i2, -1);
            this.f166a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1047j.f6101j2, -1);
        }

        /* renamed from: a */
        public void m154a(boolean z3, boolean z4) {
            if (z4 && z3) {
                return;
            }
            setPadding(getPaddingLeft(), z3 ? getPaddingTop() : this.f166a, getPaddingRight(), z4 ? getPaddingBottom() : this.f167b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class ViewOnClickListenerC0070a implements View.OnClickListener {
        ViewOnClickListenerC0070a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f154o || (message3 = alertController.f156q) == null) ? (view != alertController.f158s || (message2 = alertController.f160u) == null) ? (view != alertController.f162w || (message = alertController.f164y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f138R.obtainMessage(1, alertController2.f141b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0071b implements NestedScrollView.InterfaceC0366b {

        /* renamed from: a */
        final /* synthetic */ View f169a;

        /* renamed from: b */
        final /* synthetic */ View f170b;

        C0071b(View view, View view2) {
            this.f169a = view;
            this.f170b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0366b
        /* renamed from: a */
        public void mo155a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
            AlertController.m130f(nestedScrollView, this.f169a, this.f170b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class RunnableC0072c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f172a;

        /* renamed from: b */
        final /* synthetic */ View f173b;

        RunnableC0072c(View view, View view2) {
            this.f172a = view;
            this.f173b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m130f(AlertController.this.f121A, this.f172a, this.f173b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0073d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f175a;

        /* renamed from: b */
        final /* synthetic */ View f176b;

        C0073d(View view, View view2) {
            this.f175a = view;
            this.f176b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            AlertController.m130f(absListView, this.f175a, this.f176b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class RunnableC0074e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f178a;

        /* renamed from: b */
        final /* synthetic */ View f179b;

        RunnableC0074e(View view, View view2) {
            this.f178a = view;
            this.f179b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m130f(AlertController.this.f146g, this.f178a, this.f179b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0075f {

        /* renamed from: A */
        public int f181A;

        /* renamed from: B */
        public int f182B;

        /* renamed from: C */
        public int f183C;

        /* renamed from: D */
        public int f184D;

        /* renamed from: F */
        public boolean[] f186F;

        /* renamed from: G */
        public boolean f187G;

        /* renamed from: H */
        public boolean f188H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f190J;

        /* renamed from: K */
        public Cursor f191K;

        /* renamed from: L */
        public String f192L;

        /* renamed from: M */
        public String f193M;

        /* renamed from: N */
        public boolean f194N;

        /* renamed from: O */
        public AdapterView.OnItemSelectedListener f195O;

        /* renamed from: P */
        public e f196P;

        /* renamed from: a */
        public final Context f198a;

        /* renamed from: b */
        public final LayoutInflater f199b;

        /* renamed from: d */
        public Drawable f201d;

        /* renamed from: f */
        public CharSequence f203f;

        /* renamed from: g */
        public View f204g;

        /* renamed from: h */
        public CharSequence f205h;

        /* renamed from: i */
        public CharSequence f206i;

        /* renamed from: j */
        public Drawable f207j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f208k;

        /* renamed from: l */
        public CharSequence f209l;

        /* renamed from: m */
        public Drawable f210m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f211n;

        /* renamed from: o */
        public CharSequence f212o;

        /* renamed from: p */
        public Drawable f213p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f214q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f216s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f217t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f218u;

        /* renamed from: v */
        public CharSequence[] f219v;

        /* renamed from: w */
        public ListAdapter f220w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f221x;

        /* renamed from: y */
        public int f222y;

        /* renamed from: z */
        public View f223z;

        /* renamed from: c */
        public int f200c = 0;

        /* renamed from: e */
        public int f202e = 0;

        /* renamed from: E */
        public boolean f185E = false;

        /* renamed from: I */
        public int f189I = -1;

        /* renamed from: Q */
        public boolean f197Q = true;

        /* renamed from: r */
        public boolean f215r = true;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f224a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i4, int i5, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i4, i5, charSequenceArr);
                this.f224a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i4, view, viewGroup);
                boolean[] zArr = C0075f.this.f186F;
                if (zArr != null && zArr[i4]) {
                    this.f224a.setItemChecked(i4, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class b extends CursorAdapter {

            /* renamed from: a */
            private final int f226a;

            /* renamed from: b */
            private final int f227b;

            /* renamed from: c */
            final /* synthetic */ RecycleListView f228c;

            /* renamed from: d */
            final /* synthetic */ AlertController f229d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z3, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z3);
                this.f228c = recycleListView;
                this.f229d = alertController;
                Cursor cursor2 = getCursor();
                this.f226a = cursor2.getColumnIndexOrThrow(C0075f.this.f192L);
                this.f227b = cursor2.getColumnIndexOrThrow(C0075f.this.f193M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f226a));
                this.f228c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f227b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0075f.this.f199b.inflate(this.f229d.f133M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AlertController f231a;

            c(AlertController alertController) {
                this.f231a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                C0075f.this.f221x.onClick(this.f231a.f141b, i4);
                if (C0075f.this.f188H) {
                    return;
                }
                this.f231a.f141b.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f233a;

            /* renamed from: b */
            final /* synthetic */ AlertController f234b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f233a = recycleListView;
                this.f234b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                boolean[] zArr = C0075f.this.f186F;
                if (zArr != null) {
                    zArr[i4] = this.f233a.isItemChecked(i4);
                }
                C0075f.this.f190J.onClick(this.f234b.f141b, i4, this.f233a.isItemChecked(i4));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface e {
            /* renamed from: a */
            void m158a(ListView listView);
        }

        public C0075f(Context context) {
            this.f198a = context;
            this.f199b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m156b(AlertController alertController) {
            ListAdapter c0077h;
            RecycleListView recycleListView = (RecycleListView) this.f199b.inflate(alertController.f132L, (ViewGroup) null);
            if (this.f187G) {
                c0077h = this.f191K == null ? new a(this.f198a, alertController.f133M, R.id.text1, this.f219v, recycleListView) : new b(this.f198a, this.f191K, false, recycleListView, alertController);
            } else {
                int i4 = this.f188H ? alertController.f134N : alertController.f135O;
                if (this.f191K != null) {
                    c0077h = new SimpleCursorAdapter(this.f198a, i4, this.f191K, new String[]{this.f192L}, new int[]{R.id.text1});
                } else {
                    c0077h = this.f220w;
                    if (c0077h == null) {
                        c0077h = new C0077h(this.f198a, i4, R.id.text1, this.f219v);
                    }
                }
            }
            e eVar = this.f196P;
            if (eVar != null) {
                eVar.m158a(recycleListView);
            }
            alertController.f128H = c0077h;
            alertController.f129I = this.f189I;
            if (this.f221x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f190J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f195O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f188H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f187G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f146g = recycleListView;
        }

        /* renamed from: a */
        public void m157a(AlertController alertController) {
            View view = this.f204g;
            if (view != null) {
                alertController.m146l(view);
            } else {
                CharSequence charSequence = this.f203f;
                if (charSequence != null) {
                    alertController.m150q(charSequence);
                }
                Drawable drawable = this.f201d;
                if (drawable != null) {
                    alertController.m148n(drawable);
                }
                int i4 = this.f200c;
                if (i4 != 0) {
                    alertController.m147m(i4);
                }
                int i5 = this.f202e;
                if (i5 != 0) {
                    alertController.m147m(alertController.m140c(i5));
                }
            }
            CharSequence charSequence2 = this.f205h;
            if (charSequence2 != null) {
                alertController.m149o(charSequence2);
            }
            CharSequence charSequence3 = this.f206i;
            if (charSequence3 != null || this.f207j != null) {
                alertController.m145k(-1, charSequence3, this.f208k, null, this.f207j);
            }
            CharSequence charSequence4 = this.f209l;
            if (charSequence4 != null || this.f210m != null) {
                alertController.m145k(-2, charSequence4, this.f211n, null, this.f210m);
            }
            CharSequence charSequence5 = this.f212o;
            if (charSequence5 != null || this.f213p != null) {
                alertController.m145k(-3, charSequence5, this.f214q, null, this.f213p);
            }
            if (this.f219v != null || this.f191K != null || this.f220w != null) {
                m156b(alertController);
            }
            View view2 = this.f223z;
            if (view2 != null) {
                if (this.f185E) {
                    alertController.m153t(view2, this.f181A, this.f182B, this.f183C, this.f184D);
                    return;
                } else {
                    alertController.m152s(view2);
                    return;
                }
            }
            int i6 = this.f222y;
            if (i6 != 0) {
                alertController.m151r(i6);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class HandlerC0076g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f236a;

        public HandlerC0076g(DialogInterface dialogInterface) {
            this.f236a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == -3 || i4 == -2 || i4 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f236a.get(), message.what);
            } else {
                if (i4 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0077h extends ArrayAdapter<CharSequence> {
        public C0077h(Context context, int i4, int i5, CharSequence[] charSequenceArr) {
            super(context, i4, i5, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0104e dialogC0104e, Window window) {
        this.f140a = context;
        this.f141b = dialogC0104e;
        this.f142c = window;
        this.f138R = new HandlerC0076g(dialogC0104e);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C1047j.f5957H, C1038a.f5750n, 0);
        this.f130J = typedArrayObtainStyledAttributes.getResourceId(C1047j.f5962I, 0);
        this.f131K = typedArrayObtainStyledAttributes.getResourceId(C1047j.f5972K, 0);
        this.f132L = typedArrayObtainStyledAttributes.getResourceId(C1047j.f5982M, 0);
        this.f133M = typedArrayObtainStyledAttributes.getResourceId(C1047j.f5987N, 0);
        this.f134N = typedArrayObtainStyledAttributes.getResourceId(C1047j.f5997P, 0);
        this.f135O = typedArrayObtainStyledAttributes.getResourceId(C1047j.f5977L, 0);
        this.f136P = typedArrayObtainStyledAttributes.getBoolean(C1047j.f5992O, true);
        this.f143d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1047j.f5967J, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0104e.supportRequestWindowFeature(1);
    }

    /* renamed from: a */
    static boolean m128a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m128a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m129b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m130f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: i */
    private ViewGroup m131i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m132j() {
        int i4 = this.f131K;
        return i4 == 0 ? this.f130J : this.f137Q == 1 ? i4 : this.f130J;
    }

    /* renamed from: p */
    private void m133p(ViewGroup viewGroup, View view, int i4, int i5) {
        View viewFindViewById = this.f142c.findViewById(C1043f.f5833B);
        View viewFindViewById2 = this.f142c.findViewById(C1043f.f5832A);
        if (Build.VERSION.SDK_INT >= 23) {
            C0358u.m1991G0(view, i4, i5);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        if (viewFindViewById != null && (i4 & 1) == 0) {
            viewGroup.removeView(viewFindViewById);
            viewFindViewById = null;
        }
        if (viewFindViewById2 != null && (i4 & 2) == 0) {
            viewGroup.removeView(viewFindViewById2);
            viewFindViewById2 = null;
        }
        if (viewFindViewById == null && viewFindViewById2 == null) {
            return;
        }
        if (this.f145f != null) {
            this.f121A.setOnScrollChangeListener(new C0071b(viewFindViewById, viewFindViewById2));
            this.f121A.post(new RunnableC0072c(viewFindViewById, viewFindViewById2));
            return;
        }
        ListView listView = this.f146g;
        if (listView != null) {
            listView.setOnScrollListener(new C0073d(viewFindViewById, viewFindViewById2));
            this.f146g.post(new RunnableC0074e(viewFindViewById, viewFindViewById2));
            return;
        }
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* renamed from: u */
    private void m134u(ViewGroup viewGroup) {
        int i4;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f154o = button;
        button.setOnClickListener(this.f139S);
        if (TextUtils.isEmpty(this.f155p) && this.f157r == null) {
            this.f154o.setVisibility(8);
            i4 = 0;
        } else {
            this.f154o.setText(this.f155p);
            Drawable drawable = this.f157r;
            if (drawable != null) {
                int i5 = this.f143d;
                drawable.setBounds(0, 0, i5, i5);
                this.f154o.setCompoundDrawables(this.f157r, null, null, null);
            }
            this.f154o.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f158s = button2;
        button2.setOnClickListener(this.f139S);
        if (TextUtils.isEmpty(this.f159t) && this.f161v == null) {
            this.f158s.setVisibility(8);
        } else {
            this.f158s.setText(this.f159t);
            Drawable drawable2 = this.f161v;
            if (drawable2 != null) {
                int i6 = this.f143d;
                drawable2.setBounds(0, 0, i6, i6);
                this.f158s.setCompoundDrawables(this.f161v, null, null, null);
            }
            this.f158s.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f162w = button3;
        button3.setOnClickListener(this.f139S);
        if (TextUtils.isEmpty(this.f163x) && this.f165z == null) {
            this.f162w.setVisibility(8);
        } else {
            this.f162w.setText(this.f163x);
            Drawable drawable3 = this.f165z;
            if (drawable3 != null) {
                int i7 = this.f143d;
                drawable3.setBounds(0, 0, i7, i7);
                this.f162w.setCompoundDrawables(this.f165z, null, null, null);
            }
            this.f162w.setVisibility(0);
            i4 |= 4;
        }
        if (m139z(this.f140a)) {
            if (i4 == 1) {
                m129b(this.f154o);
            } else if (i4 == 2) {
                m129b(this.f158s);
            } else if (i4 == 4) {
                m129b(this.f162w);
            }
        }
        if (i4 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: v */
    private void m135v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f142c.findViewById(C1043f.f5834C);
        this.f121A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f121A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f126F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f145f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f121A.removeView(this.f126F);
        if (this.f146g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f121A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f121A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f146g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: w */
    private void m136w(ViewGroup viewGroup) {
        View viewInflate = this.f147h;
        if (viewInflate == null) {
            viewInflate = this.f148i != 0 ? LayoutInflater.from(this.f140a).inflate(this.f148i, viewGroup, false) : null;
        }
        boolean z3 = viewInflate != null;
        if (!z3 || !m128a(viewInflate)) {
            this.f142c.setFlags(131072, 131072);
        }
        if (!z3) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f142c.findViewById(C1043f.f5868o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f153n) {
            frameLayout.setPadding(this.f149j, this.f150k, this.f151l, this.f152m);
        }
        if (this.f146g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = IGoodView.DEFAULT_TO_ALPHA;
        }
    }

    /* renamed from: x */
    private void m137x(ViewGroup viewGroup) {
        if (this.f127G != null) {
            viewGroup.addView(this.f127G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f142c.findViewById(C1043f.f5852U).setVisibility(8);
            return;
        }
        this.f124D = (ImageView) this.f142c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f144e)) || !this.f136P) {
            this.f142c.findViewById(C1043f.f5852U).setVisibility(8);
            this.f124D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f142c.findViewById(C1043f.f5864k);
        this.f125E = textView;
        textView.setText(this.f144e);
        int i4 = this.f122B;
        if (i4 != 0) {
            this.f124D.setImageResource(i4);
            return;
        }
        Drawable drawable = this.f123C;
        if (drawable != null) {
            this.f124D.setImageDrawable(drawable);
        } else {
            this.f125E.setPadding(this.f124D.getPaddingLeft(), this.f124D.getPaddingTop(), this.f124D.getPaddingRight(), this.f124D.getPaddingBottom());
            this.f124D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    private void m138y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f142c.findViewById(C1043f.f5879z);
        int i4 = C1043f.f5853V;
        View viewFindViewById4 = viewFindViewById3.findViewById(i4);
        int i5 = C1043f.f5867n;
        View viewFindViewById5 = viewFindViewById3.findViewById(i5);
        int i6 = C1043f.f5865l;
        View viewFindViewById6 = viewFindViewById3.findViewById(i6);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C1043f.f5869p);
        m136w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i4);
        View viewFindViewById8 = viewGroup.findViewById(i5);
        View viewFindViewById9 = viewGroup.findViewById(i6);
        ViewGroup viewGroupM131i = m131i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM131i2 = m131i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM131i3 = m131i(viewFindViewById9, viewFindViewById6);
        m135v(viewGroupM131i2);
        m134u(viewGroupM131i3);
        m137x(viewGroupM131i);
        boolean z3 = viewGroup.getVisibility() != 8;
        boolean z4 = (viewGroupM131i == null || viewGroupM131i.getVisibility() == 8) ? 0 : 1;
        boolean z5 = (viewGroupM131i3 == null || viewGroupM131i3.getVisibility() == 8) ? false : true;
        if (!z5 && viewGroupM131i2 != null && (viewFindViewById2 = viewGroupM131i2.findViewById(C1043f.f5848Q)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z4 != 0) {
            NestedScrollView nestedScrollView = this.f121A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f145f == null && this.f146g == null) ? null : viewGroupM131i.findViewById(C1043f.f5851T);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM131i2 != null && (viewFindViewById = viewGroupM131i2.findViewById(C1043f.f5849R)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f146g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m154a(z4, z5);
        }
        if (!z3) {
            View view = this.f146g;
            if (view == null) {
                view = this.f121A;
            }
            if (view != null) {
                m133p(viewGroupM131i2, view, z4 | (z5 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f146g;
        if (listView2 == null || (listAdapter = this.f128H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i7 = this.f129I;
        if (i7 > -1) {
            listView2.setItemChecked(i7, true);
            listView2.setSelection(i7);
        }
    }

    /* renamed from: z */
    private static boolean m139z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1038a.f5749m, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: c */
    public int m140c(int i4) {
        TypedValue typedValue = new TypedValue();
        this.f140a.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m141d() {
        return this.f146g;
    }

    /* renamed from: e */
    public void m142e() {
        this.f141b.setContentView(m132j());
        m138y();
    }

    /* renamed from: g */
    public boolean m143g(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f121A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: h */
    public boolean m144h(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f121A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: k */
    public void m145k(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f138R.obtainMessage(i4, onClickListener);
        }
        if (i4 == -3) {
            this.f163x = charSequence;
            this.f164y = message;
            this.f165z = drawable;
        } else if (i4 == -2) {
            this.f159t = charSequence;
            this.f160u = message;
            this.f161v = drawable;
        } else {
            if (i4 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f155p = charSequence;
            this.f156q = message;
            this.f157r = drawable;
        }
    }

    /* renamed from: l */
    public void m146l(View view) {
        this.f127G = view;
    }

    /* renamed from: m */
    public void m147m(int i4) {
        this.f123C = null;
        this.f122B = i4;
        ImageView imageView = this.f124D;
        if (imageView != null) {
            if (i4 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f124D.setImageResource(this.f122B);
            }
        }
    }

    /* renamed from: n */
    public void m148n(Drawable drawable) {
        this.f123C = drawable;
        this.f122B = 0;
        ImageView imageView = this.f124D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f124D.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: o */
    public void m149o(CharSequence charSequence) {
        this.f145f = charSequence;
        TextView textView = this.f126F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m150q(CharSequence charSequence) {
        this.f144e = charSequence;
        TextView textView = this.f125E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m151r(int i4) {
        this.f147h = null;
        this.f148i = i4;
        this.f153n = false;
    }

    /* renamed from: s */
    public void m152s(View view) {
        this.f147h = view;
        this.f148i = 0;
        this.f153n = false;
    }

    /* renamed from: t */
    public void m153t(View view, int i4, int i5, int i6, int i7) {
        this.f147h = view;
        this.f148i = 0;
        this.f153n = true;
        this.f149j = i4;
        this.f150k = i5;
        this.f151l = i6;
        this.f152m = i7;
    }
}
