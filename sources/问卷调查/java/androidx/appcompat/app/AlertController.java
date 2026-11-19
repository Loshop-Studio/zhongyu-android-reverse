package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import p000a.p005b.C0014b;
import p000a.p005b.p006c.DialogC0029o;

/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f2680A;

    /* renamed from: C */
    public Drawable f2682C;

    /* renamed from: D */
    public ImageView f2683D;

    /* renamed from: E */
    public TextView f2684E;

    /* renamed from: F */
    public TextView f2685F;

    /* renamed from: G */
    public View f2686G;

    /* renamed from: H */
    public ListAdapter f2687H;

    /* renamed from: J */
    public int f2689J;

    /* renamed from: K */
    public int f2690K;

    /* renamed from: L */
    public int f2691L;

    /* renamed from: M */
    public int f2692M;

    /* renamed from: N */
    public int f2693N;

    /* renamed from: O */
    public int f2694O;

    /* renamed from: P */
    public boolean f2695P;

    /* renamed from: Q */
    public Handler f2696Q;

    /* renamed from: a */
    public final Context f2698a;

    /* renamed from: b */
    public final DialogC0029o f2699b;

    /* renamed from: c */
    public final Window f2700c;

    /* renamed from: d */
    public final int f2701d;

    /* renamed from: e */
    public CharSequence f2702e;

    /* renamed from: f */
    public CharSequence f2703f;

    /* renamed from: g */
    public ListView f2704g;

    /* renamed from: h */
    public View f2705h;

    /* renamed from: i */
    public int f2706i;

    /* renamed from: j */
    public int f2707j;

    /* renamed from: k */
    public int f2708k;

    /* renamed from: l */
    public int f2709l;

    /* renamed from: m */
    public int f2710m;

    /* renamed from: o */
    public Button f2712o;

    /* renamed from: p */
    public CharSequence f2713p;

    /* renamed from: q */
    public Message f2714q;

    /* renamed from: r */
    public Drawable f2715r;

    /* renamed from: s */
    public Button f2716s;

    /* renamed from: t */
    public CharSequence f2717t;

    /* renamed from: u */
    public Message f2718u;

    /* renamed from: v */
    public Drawable f2719v;

    /* renamed from: w */
    public Button f2720w;

    /* renamed from: x */
    public CharSequence f2721x;

    /* renamed from: y */
    public Message f2722y;

    /* renamed from: z */
    public Drawable f2723z;

    /* renamed from: n */
    public boolean f2711n = false;

    /* renamed from: B */
    public int f2681B = 0;

    /* renamed from: I */
    public int f2688I = -1;

    /* renamed from: R */
    public final View.OnClickListener f2697R = new ViewOnClickListenerC0456a();

    public static class RecycleListView extends ListView {

        /* renamed from: b */
        public final int f2724b;

        /* renamed from: c */
        public final int f2725c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014b.f44s);
            this.f2725c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f2724b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0456a implements View.OnClickListener {
        public ViewOnClickListenerC0456a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f2712o || (message2 = alertController.f2714q) == null) && (view != alertController.f2716s || (message2 = alertController.f2718u) == null)) ? (view != alertController.f2720w || (message = alertController.f2722y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f2696Q.obtainMessage(1, alertController2.f2699b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0457b {

        /* renamed from: a */
        public final Context f2727a;

        /* renamed from: b */
        public final LayoutInflater f2728b;

        /* renamed from: c */
        public Drawable f2729c;

        /* renamed from: d */
        public CharSequence f2730d;

        /* renamed from: e */
        public View f2731e;

        /* renamed from: f */
        public DialogInterface.OnKeyListener f2732f;

        /* renamed from: g */
        public ListAdapter f2733g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f2734h;

        /* renamed from: i */
        public boolean f2735i;

        /* renamed from: j */
        public int f2736j = -1;

        public C0457b(Context context) {
            this.f2727a = context;
            this.f2728b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0458c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f2737a;

        public HandlerC0458c(DialogInterface dialogInterface) {
            this.f2737a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f2737a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0459d extends ArrayAdapter<CharSequence> {
        public C0459d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0029o dialogC0029o, Window window) {
        this.f2698a = context;
        this.f2699b = dialogC0029o;
        this.f2700c = window;
        this.f2696Q = new HandlerC0458c(dialogC0029o);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0014b.f30e, C1088R.attr.alertDialogStyle, 0);
        this.f2689J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f2690K = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f2691L = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f2692M = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f2693N = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f2694O = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f2695P = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f2701d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0029o.m98a().mo49t(1);
    }

    /* renamed from: a */
    public static boolean m1559a(View view) {
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
            if (m1559a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m1560c(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: b */
    public final void m1561b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final ViewGroup m1562d(View view, View view2) {
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
}
