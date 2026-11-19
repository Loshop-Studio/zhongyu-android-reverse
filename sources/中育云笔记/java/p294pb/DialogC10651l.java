package p294pb;

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
import anet.channel.strategy.dispatch.DispatchConstants;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.view.R$layout;
import com.zykj.view.R$style;
import com.zykj.view.databinding.ViewDialogTextEditBinding;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* renamed from: pb.l */
/* loaded from: classes6.dex */
public final class DialogC10651l extends Dialog {

    /* renamed from: c */
    public final Context f25670c;

    /* renamed from: d */
    public ViewDialogTextEditBinding f25671d;

    /* renamed from: e */
    public InterfaceC9540l f25672e;

    /* renamed from: f */
    public InterfaceC9540l f25673f;

    /* renamed from: g */
    public InterfaceC9529a f25674g;

    /* renamed from: h */
    public int f25675h;

    /* renamed from: i */
    public int f25676i;

    public /* synthetic */ DialogC10651l(Context context, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? R$style.AppTheme_Dialog : i10);
    }

    /* renamed from: j */
    public static final C10786q m22527j(String str) {
        AbstractC9979u.m20294g(str, "<unused var>");
        return C10786q.f26013a;
    }

    /* renamed from: l */
    public static final C10786q m22528l() {
        return C10786q.f26013a;
    }

    /* renamed from: m */
    public static final C10786q m22529m(String str) {
        AbstractC9979u.m20294g(str, "<unused var>");
        return C10786q.f26013a;
    }

    /* renamed from: n */
    public static final void m22530n(final DialogC10651l dialogC10651l, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = dialogC10651l.f25671d;
        if (viewDialogTextEditBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding = null;
        }
        KeyboardUtils.hideSoftInput(viewDialogTextEditBinding.f20540e);
        new DialogC10643d(dialogC10651l.f25670c, 0, 2, null).m22517g("是否取消此次编辑", true, new InterfaceC9529a() { // from class: pb.k
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return DialogC10651l.m22531o(this.f25669c);
            }
        }, true);
    }

    /* renamed from: o */
    public static final C10786q m22531o(DialogC10651l dialogC10651l) {
        dialogC10651l.f25674g.invoke();
        dialogC10651l.dismiss();
        return C10786q.f26013a;
    }

    /* renamed from: p */
    public static final void m22532p(DialogC10651l dialogC10651l, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = dialogC10651l.f25671d;
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = null;
        if (viewDialogTextEditBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding = null;
        }
        String strValueOf = String.valueOf(viewDialogTextEditBinding.f20540e.getText());
        if (strValueOf.length() == 0) {
            ToastUtils.showShort("内容不能为空", new Object[0]);
            return;
        }
        dialogC10651l.f25673f.invoke(strValueOf);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = dialogC10651l.f25671d;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewDialogTextEditBinding2 = viewDialogTextEditBinding3;
        }
        KeyboardUtils.hideSoftInput(viewDialogTextEditBinding2.f20540e);
        dialogC10651l.dismiss();
    }

    /* renamed from: r */
    public static final void m22533r(Window window, DialogC10651l dialogC10651l) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i10 = rect.bottom - rect.top;
        int height = window.getDecorView().getHeight();
        ViewDialogTextEditBinding viewDialogTextEditBinding = null;
        if (i10 / height >= 0.8d || i10 == 0) {
            ViewDialogTextEditBinding viewDialogTextEditBinding2 = dialogC10651l.f25671d;
            if (viewDialogTextEditBinding2 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewDialogTextEditBinding = viewDialogTextEditBinding2;
            }
            viewDialogTextEditBinding.f20543h.setVisibility(8);
            return;
        }
        dialogC10651l.f25676i = Math.max(height - i10, dialogC10651l.f25676i);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = dialogC10651l.f25671d;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        View view = viewDialogTextEditBinding3.f20543h;
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = dialogC10651l.f25671d;
        if (viewDialogTextEditBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding4 = null;
        }
        ViewGroup.LayoutParams layoutParams = viewDialogTextEditBinding4.f20543h.getLayoutParams();
        layoutParams.height = dialogC10651l.f25676i;
        view.setLayoutParams(layoutParams);
        Log.i("TextEditDialog", "keyboardHeight-> " + dialogC10651l.f25676i);
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = dialogC10651l.f25671d;
        if (viewDialogTextEditBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewDialogTextEditBinding = viewDialogTextEditBinding5;
        }
        viewDialogTextEditBinding.f20543h.setVisibility(0);
    }

    /* renamed from: k */
    public final void m22534k() {
        Resources resources = getContext().getResources();
        AbstractC9979u.m20293f(resources, "getResources(...)");
        this.f25675h = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m22535q();
        ViewDialogTextEditBinding viewDialogTextEditBinding = null;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(this.f25670c), R$layout.view_dialog_text_edit, null, false);
        AbstractC9979u.m20293f(viewDataBindingInflate, "inflate(...)");
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = (ViewDialogTextEditBinding) viewDataBindingInflate;
        this.f25671d = viewDialogTextEditBinding2;
        if (viewDialogTextEditBinding2 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding2 = null;
        }
        setContentView(viewDialogTextEditBinding2.f20542g);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.f25671d;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        viewDialogTextEditBinding3.f20540e.addTextChangedListener(new a());
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.f25671d;
        if (viewDialogTextEditBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding4 = null;
        }
        viewDialogTextEditBinding4.f20540e.addTextChangedListener(new b());
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = this.f25671d;
        if (viewDialogTextEditBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding5 = null;
        }
        viewDialogTextEditBinding5.f20538c.setOnClickListener(new View.OnClickListener() { // from class: pb.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC10651l.m22530n(this.f25665c, view);
            }
        });
        ViewDialogTextEditBinding viewDialogTextEditBinding6 = this.f25671d;
        if (viewDialogTextEditBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewDialogTextEditBinding = viewDialogTextEditBinding6;
        }
        viewDialogTextEditBinding.f20539d.setOnClickListener(new View.OnClickListener() { // from class: pb.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC10651l.m22532p(this.f25666c, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (i10 != 4) {
            return super.onKeyDown(i10, event);
        }
        this.f25674g.invoke();
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            m22534k();
            window.setLayout(rect.width(), rect.height() - this.f25675h);
        }
    }

    /* renamed from: q */
    public final void m22535q() {
        final Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: pb.j
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    DialogC10651l.m22533r(window, this);
                }
            });
        }
    }

    /* renamed from: s */
    public final void m22536s(String initText, InterfaceC9540l afterTextChangeCallback, InterfaceC9540l doneCallback, InterfaceC9529a cancelCallback) {
        AbstractC9979u.m20294g(initText, "initText");
        AbstractC9979u.m20294g(afterTextChangeCallback, "afterTextChangeCallback");
        AbstractC9979u.m20294g(doneCallback, "doneCallback");
        AbstractC9979u.m20294g(cancelCallback, "cancelCallback");
        this.f25672e = afterTextChangeCallback;
        this.f25673f = doneCallback;
        this.f25674g = cancelCallback;
        show();
        ViewDialogTextEditBinding viewDialogTextEditBinding = this.f25671d;
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = null;
        if (viewDialogTextEditBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding = null;
        }
        viewDialogTextEditBinding.f20540e.setText(initText);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.f25671d;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        KeyboardUtils.showSoftInput(viewDialogTextEditBinding3.f20540e);
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.f25671d;
        if (viewDialogTextEditBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewDialogTextEditBinding2 = viewDialogTextEditBinding4;
        }
        viewDialogTextEditBinding2.f20540e.requestFocus();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC10651l(Context activity, int i10) {
        super(activity, i10);
        AbstractC9979u.m20294g(activity, "activity");
        this.f25670c = activity;
        this.f25672e = new InterfaceC9540l() { // from class: pb.g
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return DialogC10651l.m22527j((String) obj);
            }
        };
        this.f25673f = new InterfaceC9540l() { // from class: pb.h
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return DialogC10651l.m22529m((String) obj);
            }
        };
        this.f25674g = new InterfaceC9529a() { // from class: pb.i
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return DialogC10651l.m22528l();
            }
        };
    }

    /* renamed from: pb.l$a */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            DialogC10651l.this.f25672e.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: pb.l$b */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            ViewDialogTextEditBinding viewDialogTextEditBinding = DialogC10651l.this.f25671d;
            if (viewDialogTextEditBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewDialogTextEditBinding = null;
            }
            Button button = viewDialogTextEditBinding.f20539d;
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
