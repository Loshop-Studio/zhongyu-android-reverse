package p119g7;

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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g7.l */
/* loaded from: classes5.dex */
public final class DialogC8078l extends Dialog {

    /* renamed from: a */
    public final Context f13774a;

    /* renamed from: b */
    public ViewDialogTextEditBinding f13775b;

    /* renamed from: c */
    public Function1 f13776c;

    /* renamed from: d */
    public Function1 f13777d;

    /* renamed from: e */
    public Function0 f13778e;

    /* renamed from: f */
    public int f13779f;

    /* renamed from: g */
    public int f13780g;

    public /* synthetic */ DialogC8078l(Context context, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? R$style.AppTheme_Dialog : i9);
    }

    /* renamed from: j */
    public static final Unit m12888j(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m12889l() {
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m12890m(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final void m12891n(final DialogC8078l dialogC8078l, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = dialogC8078l.f13775b;
        if (viewDialogTextEditBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding = null;
        }
        KeyboardUtils.hideSoftInput(viewDialogTextEditBinding.f12575c);
        new DialogC8070d(dialogC8078l.f13774a, 0, 2, null).m12878g("是否取消此次编辑", true, new Function0() { // from class: g7.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC8078l.m12892o(this.f13773a);
            }
        }, true);
    }

    /* renamed from: o */
    public static final Unit m12892o(DialogC8078l dialogC8078l) {
        dialogC8078l.f13778e.invoke();
        dialogC8078l.dismiss();
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final void m12893p(DialogC8078l dialogC8078l, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = dialogC8078l.f13775b;
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = null;
        if (viewDialogTextEditBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding = null;
        }
        String strValueOf = String.valueOf(viewDialogTextEditBinding.f12575c.getText());
        if (strValueOf.length() == 0) {
            ToastUtils.showShort("内容不能为空", new Object[0]);
            return;
        }
        dialogC8078l.f13777d.invoke(strValueOf);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = dialogC8078l.f13775b;
        if (viewDialogTextEditBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogTextEditBinding2 = viewDialogTextEditBinding3;
        }
        KeyboardUtils.hideSoftInput(viewDialogTextEditBinding2.f12575c);
        dialogC8078l.dismiss();
    }

    /* renamed from: r */
    public static final void m12894r(Window window, DialogC8078l dialogC8078l) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i9 = rect.bottom - rect.top;
        int height = window.getDecorView().getHeight();
        ViewDialogTextEditBinding viewDialogTextEditBinding = null;
        if (i9 / height >= 0.8d || i9 == 0) {
            ViewDialogTextEditBinding viewDialogTextEditBinding2 = dialogC8078l.f13775b;
            if (viewDialogTextEditBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewDialogTextEditBinding = viewDialogTextEditBinding2;
            }
            viewDialogTextEditBinding.f12578f.setVisibility(8);
            return;
        }
        dialogC8078l.f13780g = Math.max(height - i9, dialogC8078l.f13780g);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = dialogC8078l.f13775b;
        if (viewDialogTextEditBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        View view = viewDialogTextEditBinding3.f12578f;
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = dialogC8078l.f13775b;
        if (viewDialogTextEditBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding4 = null;
        }
        ViewGroup.LayoutParams layoutParams = viewDialogTextEditBinding4.f12578f.getLayoutParams();
        layoutParams.height = dialogC8078l.f13780g;
        view.setLayoutParams(layoutParams);
        Log.i("TextEditDialog", "keyboardHeight-> " + dialogC8078l.f13780g);
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = dialogC8078l.f13775b;
        if (viewDialogTextEditBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogTextEditBinding = viewDialogTextEditBinding5;
        }
        viewDialogTextEditBinding.f12578f.setVisibility(0);
    }

    /* renamed from: k */
    public final void m12895k() {
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.f13779f = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12896q();
        ViewDialogTextEditBinding viewDialogTextEditBinding = null;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(this.f13774a), R$layout.view_dialog_text_edit, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "inflate(...)");
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = (ViewDialogTextEditBinding) viewDataBindingInflate;
        this.f13775b = viewDialogTextEditBinding2;
        if (viewDialogTextEditBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding2 = null;
        }
        setContentView(viewDialogTextEditBinding2.f12577e);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.f13775b;
        if (viewDialogTextEditBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        viewDialogTextEditBinding3.f12575c.addTextChangedListener(new a());
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.f13775b;
        if (viewDialogTextEditBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding4 = null;
        }
        viewDialogTextEditBinding4.f12575c.addTextChangedListener(new b());
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = this.f13775b;
        if (viewDialogTextEditBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding5 = null;
        }
        viewDialogTextEditBinding5.f12573a.setOnClickListener(new View.OnClickListener() { // from class: g7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8078l.m12891n(this.f13769a, view);
            }
        });
        ViewDialogTextEditBinding viewDialogTextEditBinding6 = this.f13775b;
        if (viewDialogTextEditBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogTextEditBinding = viewDialogTextEditBinding6;
        }
        viewDialogTextEditBinding.f12574b.setOnClickListener(new View.OnClickListener() { // from class: g7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8078l.m12893p(this.f13770a, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i9 != 4) {
            return super.onKeyDown(i9, event);
        }
        this.f13778e.invoke();
        return super.onKeyDown(i9, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            m12895k();
            window.setLayout(rect.width(), rect.height() - this.f13779f);
        }
    }

    /* renamed from: q */
    public final void m12896q() {
        final Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: g7.j
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    DialogC8078l.m12894r(window, this);
                }
            });
        }
    }

    /* renamed from: s */
    public final void m12897s(String initText, Function1 afterTextChangeCallback, Function1 doneCallback, Function0 cancelCallback) {
        Intrinsics.checkNotNullParameter(initText, "initText");
        Intrinsics.checkNotNullParameter(afterTextChangeCallback, "afterTextChangeCallback");
        Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
        Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
        this.f13776c = afterTextChangeCallback;
        this.f13777d = doneCallback;
        this.f13778e = cancelCallback;
        show();
        ViewDialogTextEditBinding viewDialogTextEditBinding = this.f13775b;
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = null;
        if (viewDialogTextEditBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding = null;
        }
        viewDialogTextEditBinding.f12575c.setText(initText);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.f13775b;
        if (viewDialogTextEditBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        KeyboardUtils.showSoftInput(viewDialogTextEditBinding3.f12575c);
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.f13775b;
        if (viewDialogTextEditBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogTextEditBinding2 = viewDialogTextEditBinding4;
        }
        viewDialogTextEditBinding2.f12575c.requestFocus();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC8078l(Context activity, int i9) {
        super(activity, i9);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f13774a = activity;
        this.f13776c = new Function1() { // from class: g7.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC8078l.m12888j((String) obj);
            }
        };
        this.f13777d = new Function1() { // from class: g7.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC8078l.m12890m((String) obj);
            }
        };
        this.f13778e = new Function0() { // from class: g7.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC8078l.m12889l();
            }
        };
    }

    /* renamed from: g7.l$a */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            DialogC8078l.this.f13776c.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }
    }

    /* renamed from: g7.l$b */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            ViewDialogTextEditBinding viewDialogTextEditBinding = DialogC8078l.this.f13775b;
            if (viewDialogTextEditBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewDialogTextEditBinding = null;
            }
            Button button = viewDialogTextEditBinding.f12574b;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            button.setEnabled(string.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }
    }
}
