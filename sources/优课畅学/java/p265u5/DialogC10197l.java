package p265u5;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.view.R$layout;
import com.zykj.view.R$style;
import com.zykj.view.databinding.ViewDialogTextEditBinding;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: u5.l */
/* loaded from: classes5.dex */
public final class DialogC10197l extends Dialog {

    /* renamed from: a */
    public final Context f20332a;

    /* renamed from: b */
    public ViewDialogTextEditBinding f20333b;

    /* renamed from: c */
    public InterfaceC10570l f20334c;

    /* renamed from: d */
    public InterfaceC10570l f20335d;

    /* renamed from: e */
    public InterfaceC10559a f20336e;

    /* renamed from: f */
    public int f20337f;

    /* renamed from: g */
    public int f20338g;

    public /* synthetic */ DialogC10197l(Context context, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? R$style.AppTheme_Dialog : i10);
    }

    /* renamed from: j */
    public static final C8736p m19059j(String str) {
        AbstractC9133u.m16133g(str, "<unused var>");
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public static final C8736p m19060l() {
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final C8736p m19061m(String str) {
        AbstractC9133u.m16133g(str, "<unused var>");
        return C8736p.f16368a;
    }

    /* renamed from: n */
    public static final void m19062n(final DialogC10197l dialogC10197l, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = dialogC10197l.f20333b;
        if (viewDialogTextEditBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding = null;
        }
        KeyboardUtils.m2344c(viewDialogTextEditBinding.f15329c);
        new DialogC10189d(dialogC10197l.f20332a, 0, 2, null).m19049g("是否取消此次编辑", true, new InterfaceC10559a() { // from class: u5.k
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return DialogC10197l.m19063o(this.f20331a);
            }
        }, true);
    }

    /* renamed from: o */
    public static final C8736p m19063o(DialogC10197l dialogC10197l) {
        dialogC10197l.f20336e.invoke();
        dialogC10197l.dismiss();
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final void m19064p(DialogC10197l dialogC10197l, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = dialogC10197l.f20333b;
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = null;
        if (viewDialogTextEditBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding = null;
        }
        String strValueOf = String.valueOf(viewDialogTextEditBinding.f15329c.getText());
        if (strValueOf.length() == 0) {
            ToastUtils.m2403s("内容不能为空", new Object[0]);
            return;
        }
        dialogC10197l.f20335d.invoke(strValueOf);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = dialogC10197l.f20333b;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewDialogTextEditBinding2 = viewDialogTextEditBinding3;
        }
        KeyboardUtils.m2344c(viewDialogTextEditBinding2.f15329c);
        dialogC10197l.dismiss();
    }

    /* renamed from: r */
    public static final void m19065r(Window window, DialogC10197l dialogC10197l) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i10 = rect.bottom - rect.top;
        int height = window.getDecorView().getHeight();
        ViewDialogTextEditBinding viewDialogTextEditBinding = null;
        if (i10 / height >= 0.8d || i10 == 0) {
            ViewDialogTextEditBinding viewDialogTextEditBinding2 = dialogC10197l.f20333b;
            if (viewDialogTextEditBinding2 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewDialogTextEditBinding = viewDialogTextEditBinding2;
            }
            viewDialogTextEditBinding.f15332f.setVisibility(8);
            return;
        }
        dialogC10197l.f20338g = Math.max(height - i10, dialogC10197l.f20338g);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = dialogC10197l.f20333b;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        View view = viewDialogTextEditBinding3.f15332f;
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = dialogC10197l.f20333b;
        if (viewDialogTextEditBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding4 = null;
        }
        ViewGroup.LayoutParams layoutParams = viewDialogTextEditBinding4.f15332f.getLayoutParams();
        layoutParams.height = dialogC10197l.f20338g;
        view.setLayoutParams(layoutParams);
        Log.i("TextEditDialog", "keyboardHeight-> " + dialogC10197l.f20338g);
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = dialogC10197l.f20333b;
        if (viewDialogTextEditBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewDialogTextEditBinding = viewDialogTextEditBinding5;
        }
        viewDialogTextEditBinding.f15332f.setVisibility(0);
    }

    /* renamed from: k */
    public final void m19066k() {
        Resources resources = getContext().getResources();
        AbstractC9133u.m16132f(resources, "getResources(...)");
        this.f20337f = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m19067q();
        ViewDialogTextEditBinding viewDialogTextEditBinding = null;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(this.f20332a), R$layout.view_dialog_text_edit, null, false);
        AbstractC9133u.m16132f(viewDataBindingInflate, "inflate(...)");
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = (ViewDialogTextEditBinding) viewDataBindingInflate;
        this.f20333b = viewDialogTextEditBinding2;
        if (viewDialogTextEditBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding2 = null;
        }
        setContentView(viewDialogTextEditBinding2.f15331e);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.f20333b;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        viewDialogTextEditBinding3.f15329c.addTextChangedListener(new a());
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.f20333b;
        if (viewDialogTextEditBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding4 = null;
        }
        viewDialogTextEditBinding4.f15329c.addTextChangedListener(new b());
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = this.f20333b;
        if (viewDialogTextEditBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding5 = null;
        }
        viewDialogTextEditBinding5.f15327a.setOnClickListener(new View.OnClickListener() { // from class: u5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC10197l.m19062n(this.f20327a, view);
            }
        });
        ViewDialogTextEditBinding viewDialogTextEditBinding6 = this.f20333b;
        if (viewDialogTextEditBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewDialogTextEditBinding = viewDialogTextEditBinding6;
        }
        viewDialogTextEditBinding.f15328b.setOnClickListener(new View.OnClickListener() { // from class: u5.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC10197l.m19064p(this.f20328a, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (i10 != 4) {
            return super.onKeyDown(i10, event);
        }
        this.f20336e.invoke();
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            m19066k();
            window.setLayout(rect.width(), rect.height() - this.f20337f);
        }
    }

    /* renamed from: q */
    public final void m19067q() {
        final Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u5.j
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    DialogC10197l.m19065r(window, this);
                }
            });
        }
    }

    /* renamed from: s */
    public final void m19068s(String initText, InterfaceC10570l afterTextChangeCallback, InterfaceC10570l doneCallback, InterfaceC10559a cancelCallback) {
        AbstractC9133u.m16133g(initText, "initText");
        AbstractC9133u.m16133g(afterTextChangeCallback, "afterTextChangeCallback");
        AbstractC9133u.m16133g(doneCallback, "doneCallback");
        AbstractC9133u.m16133g(cancelCallback, "cancelCallback");
        this.f20334c = afterTextChangeCallback;
        this.f20335d = doneCallback;
        this.f20336e = cancelCallback;
        show();
        ViewDialogTextEditBinding viewDialogTextEditBinding = this.f20333b;
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = null;
        if (viewDialogTextEditBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding = null;
        }
        viewDialogTextEditBinding.f15329c.setText(initText);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.f20333b;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        KeyboardUtils.m2345d(viewDialogTextEditBinding3.f15329c);
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.f20333b;
        if (viewDialogTextEditBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewDialogTextEditBinding2 = viewDialogTextEditBinding4;
        }
        viewDialogTextEditBinding2.f15329c.requestFocus();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC10197l(Context activity, int i10) {
        super(activity, i10);
        AbstractC9133u.m16133g(activity, "activity");
        this.f20332a = activity;
        this.f20334c = new InterfaceC10570l() { // from class: u5.g
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return DialogC10197l.m19059j((String) obj);
            }
        };
        this.f20335d = new InterfaceC10570l() { // from class: u5.h
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return DialogC10197l.m19061m((String) obj);
            }
        };
        this.f20336e = new InterfaceC10559a() { // from class: u5.i
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return DialogC10197l.m19060l();
            }
        };
    }

    /* renamed from: u5.l$a */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            DialogC10197l.this.f20334c.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: u5.l$b */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            ViewDialogTextEditBinding viewDialogTextEditBinding = DialogC10197l.this.f20333b;
            if (viewDialogTextEditBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewDialogTextEditBinding = null;
            }
            Button button = viewDialogTextEditBinding.f15328b;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            button.setEnabled(string.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
