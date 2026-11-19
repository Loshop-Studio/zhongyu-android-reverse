package p000a.p005b.p006c;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.p014h.C0080f0;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.c.d */
/* loaded from: classes.dex */
public class DialogInterfaceC0018d extends DialogC0029o implements DialogInterface {

    /* renamed from: d */
    public final AlertController f57d;

    /* renamed from: a.b.c.d$a */
    public static class a {

        /* renamed from: a */
        public final AlertController.C0457b f58a;

        /* renamed from: b */
        public final int f59b;

        public a(Context context) {
            int iM19d = DialogInterfaceC0018d.m19d(context, 0);
            this.f58a = new AlertController.C0457b(new ContextThemeWrapper(context, DialogInterfaceC0018d.m19d(context, iM19d)));
            this.f59b = iM19d;
        }

        /* renamed from: a */
        public DialogInterfaceC0018d m20a() {
            DialogInterfaceC0018d dialogInterfaceC0018d = new DialogInterfaceC0018d(this.f58a.f2727a, this.f59b);
            AlertController.C0457b c0457b = this.f58a;
            AlertController alertController = dialogInterfaceC0018d.f57d;
            View view = c0457b.f2731e;
            if (view != null) {
                alertController.f2686G = view;
            } else {
                CharSequence charSequence = c0457b.f2730d;
                if (charSequence != null) {
                    alertController.f2702e = charSequence;
                    TextView textView = alertController.f2684E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = c0457b.f2729c;
                if (drawable != null) {
                    alertController.f2682C = drawable;
                    alertController.f2681B = 0;
                    ImageView imageView = alertController.f2683D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f2683D.setImageDrawable(drawable);
                    }
                }
            }
            if (c0457b.f2733g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0457b.f2728b.inflate(alertController.f2691L, (ViewGroup) null);
                int i = c0457b.f2735i ? alertController.f2693N : alertController.f2694O;
                ListAdapter c0459d = c0457b.f2733g;
                if (c0459d == null) {
                    c0459d = new AlertController.C0459d(c0457b.f2727a, i, R.id.text1, null);
                }
                alertController.f2687H = c0459d;
                alertController.f2688I = c0457b.f2736j;
                if (c0457b.f2734h != null) {
                    recycleListView.setOnItemClickListener(new C0017c(c0457b, alertController));
                }
                if (c0457b.f2735i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f2704g = recycleListView;
            }
            Objects.requireNonNull(this.f58a);
            dialogInterfaceC0018d.setCancelable(true);
            Objects.requireNonNull(this.f58a);
            dialogInterfaceC0018d.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.f58a);
            dialogInterfaceC0018d.setOnCancelListener(null);
            Objects.requireNonNull(this.f58a);
            dialogInterfaceC0018d.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.f58a.f2732f;
            if (onKeyListener != null) {
                dialogInterfaceC0018d.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0018d;
        }
    }

    public DialogInterfaceC0018d(Context context, int i) {
        super(context, m19d(context, i));
        this.f57d = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: d */
    public static int m19d(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1088R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000a.p005b.p006c.DialogC0029o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View view;
        ListAdapter listAdapter;
        View viewFindViewById;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.f57d;
        int i2 = alertController.f2690K;
        alertController.f2699b.setContentView(alertController.f2689J);
        View viewFindViewById2 = alertController.f2700c.findViewById(C1088R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(C1088R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(C1088R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(C1088R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(C1088R.id.customPanel);
        View viewInflate = alertController.f2705h;
        if (viewInflate == null) {
            viewInflate = alertController.f2706i != 0 ? LayoutInflater.from(alertController.f2698a).inflate(alertController.f2706i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.m1559a(viewInflate)) {
            alertController.f2700c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f2700c.findViewById(C1088R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f2711n) {
                frameLayout.setPadding(alertController.f2707j, alertController.f2708k, alertController.f2709l, alertController.f2710m);
            }
            if (alertController.f2704g != null) {
                ((LinearLayout.LayoutParams) ((C0080f0.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(C1088R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(C1088R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(C1088R.id.buttonPanel);
        ViewGroup viewGroupM1562d = alertController.m1562d(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM1562d2 = alertController.m1562d(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM1562d3 = alertController.m1562d(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f2700c.findViewById(C1088R.id.scrollView);
        alertController.f2680A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f2680A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM1562d2.findViewById(R.id.message);
        alertController.f2685F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f2703f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f2680A.removeView(alertController.f2685F);
                if (alertController.f2704g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f2680A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.f2680A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f2704g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM1562d2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupM1562d3.findViewById(R.id.button1);
        alertController.f2712o = button2;
        button2.setOnClickListener(alertController.f2697R);
        if (TextUtils.isEmpty(alertController.f2713p) && alertController.f2715r == null) {
            alertController.f2712o.setVisibility(8);
            i = 0;
        } else {
            alertController.f2712o.setText(alertController.f2713p);
            Drawable drawable = alertController.f2715r;
            if (drawable != null) {
                int i3 = alertController.f2701d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.f2712o.setCompoundDrawables(alertController.f2715r, null, null, null);
            }
            alertController.f2712o.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM1562d3.findViewById(R.id.button2);
        alertController.f2716s = button3;
        button3.setOnClickListener(alertController.f2697R);
        if (TextUtils.isEmpty(alertController.f2717t) && alertController.f2719v == null) {
            alertController.f2716s.setVisibility(8);
        } else {
            alertController.f2716s.setText(alertController.f2717t);
            Drawable drawable2 = alertController.f2719v;
            if (drawable2 != null) {
                int i4 = alertController.f2701d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.f2716s.setCompoundDrawables(alertController.f2719v, null, null, null);
            }
            alertController.f2716s.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) viewGroupM1562d3.findViewById(R.id.button3);
        alertController.f2720w = button4;
        button4.setOnClickListener(alertController.f2697R);
        if (TextUtils.isEmpty(alertController.f2721x) && alertController.f2723z == null) {
            alertController.f2720w.setVisibility(8);
            view = null;
        } else {
            alertController.f2720w.setText(alertController.f2721x);
            Drawable drawable3 = alertController.f2723z;
            if (drawable3 != null) {
                int i5 = alertController.f2701d;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.f2720w.setCompoundDrawables(alertController.f2723z, null, null, null);
            } else {
                view = null;
            }
            alertController.f2720w.setVisibility(0);
            i |= 4;
        }
        Context context = alertController.f2698a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1088R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                button = alertController.f2712o;
            } else if (i == 2) {
                button = alertController.f2716s;
            } else if (i == 4) {
                button = alertController.f2720w;
            }
            alertController.m1561b(button);
        }
        if (!(i != 0)) {
            viewGroupM1562d3.setVisibility(8);
        }
        if (alertController.f2686G != null) {
            viewGroupM1562d.addView(alertController.f2686G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f2700c.findViewById(C1088R.id.title_template).setVisibility(8);
        } else {
            alertController.f2683D = (ImageView) alertController.f2700c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f2702e)) && alertController.f2695P) {
                TextView textView2 = (TextView) alertController.f2700c.findViewById(C1088R.id.alertTitle);
                alertController.f2684E = textView2;
                textView2.setText(alertController.f2702e);
                int i6 = alertController.f2681B;
                if (i6 != 0) {
                    alertController.f2683D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.f2682C;
                    if (drawable4 != null) {
                        alertController.f2683D.setImageDrawable(drawable4);
                    } else {
                        alertController.f2684E.setPadding(alertController.f2683D.getPaddingLeft(), alertController.f2683D.getPaddingTop(), alertController.f2683D.getPaddingRight(), alertController.f2683D.getPaddingBottom());
                        alertController.f2683D.setVisibility(8);
                    }
                }
            } else {
                alertController.f2700c.findViewById(C1088R.id.title_template).setVisibility(8);
                alertController.f2683D.setVisibility(8);
                viewGroupM1562d.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i7 = (viewGroupM1562d == null || viewGroupM1562d.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM1562d3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM1562d2.findViewById(C1088R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f2680A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f2703f == null && alertController.f2704g == null) ? view : viewGroupM1562d.findViewById(C1088R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM1562d2.findViewById(C1088R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f2704g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z3 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f2724b, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.f2725c);
            }
        }
        if (!z2) {
            View view2 = alertController.f2704g;
            if (view2 == null) {
                view2 = alertController.f2680A;
            }
            if (view2 != null) {
                int i8 = z3 ? 2 : 0;
                View viewFindViewById11 = alertController.f2700c.findViewById(C1088R.id.scrollIndicatorUp);
                View viewFindViewById12 = alertController.f2700c.findViewById(C1088R.id.scrollIndicatorDown);
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                view2.setScrollIndicators(i7 | i8, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM1562d2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM1562d2.removeView(viewFindViewById12);
                }
            }
        }
        ListView listView2 = alertController.f2704g;
        if (listView2 == null || (listAdapter = alertController.f2687H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i9 = alertController.f2688I;
        if (i9 > -1) {
            listView2.setItemChecked(i9, true);
            listView2.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f57d.f2680A;
        if (nestedScrollView != null && nestedScrollView.m1710j(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f57d.f2680A;
        if (nestedScrollView != null && nestedScrollView.m1710j(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p000a.p005b.p006c.DialogC0029o, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f57d;
        alertController.f2702e = charSequence;
        TextView textView = alertController.f2684E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
