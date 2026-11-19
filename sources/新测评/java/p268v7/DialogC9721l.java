package p268v7;

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

/* renamed from: v7.l */
/* loaded from: classes5.dex */
public final class DialogC9721l extends Dialog {

    /* renamed from: a */
    public final Context f17051a;

    /* renamed from: b */
    public ViewDialogTextEditBinding f17052b;

    /* renamed from: c */
    public Function1 f17053c;

    /* renamed from: d */
    public Function1 f17054d;

    /* renamed from: e */
    public Function0 f17055e;

    /* renamed from: f */
    public int f17056f;

    /* renamed from: g */
    public int f17057g;

    public /* synthetic */ DialogC9721l(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? R$style.AppTheme_Dialog : i10);
    }

    /* renamed from: j */
    public static final Unit m16243j(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m16244l() {
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m16245m(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final void m16246n(final DialogC9721l dialogC9721l, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = dialogC9721l.f17052b;
        if (viewDialogTextEditBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding = null;
        }
        KeyboardUtils.hideSoftInput(viewDialogTextEditBinding.f11331c);
        new DialogC9713d(dialogC9721l.f17051a, 0, 2, null).m16233g("是否取消此次编辑", true, new Function0() { // from class: v7.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC9721l.m16247o(this.f17050a);
            }
        }, true);
    }

    /* renamed from: o */
    public static final Unit m16247o(DialogC9721l dialogC9721l) {
        dialogC9721l.f17055e.invoke();
        dialogC9721l.dismiss();
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final void m16248p(DialogC9721l dialogC9721l, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = dialogC9721l.f17052b;
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = null;
        if (viewDialogTextEditBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding = null;
        }
        String strValueOf = String.valueOf(viewDialogTextEditBinding.f11331c.getText());
        if (strValueOf.length() == 0) {
            ToastUtils.showShort("内容不能为空", new Object[0]);
            return;
        }
        dialogC9721l.f17054d.invoke(strValueOf);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = dialogC9721l.f17052b;
        if (viewDialogTextEditBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogTextEditBinding2 = viewDialogTextEditBinding3;
        }
        KeyboardUtils.hideSoftInput(viewDialogTextEditBinding2.f11331c);
        dialogC9721l.dismiss();
    }

    /* renamed from: r */
    public static final void m16249r(Window window, DialogC9721l dialogC9721l) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i10 = rect.bottom - rect.top;
        int height = window.getDecorView().getHeight();
        ViewDialogTextEditBinding viewDialogTextEditBinding = null;
        if (i10 / height >= 0.8d || i10 == 0) {
            ViewDialogTextEditBinding viewDialogTextEditBinding2 = dialogC9721l.f17052b;
            if (viewDialogTextEditBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewDialogTextEditBinding = viewDialogTextEditBinding2;
            }
            viewDialogTextEditBinding.f11334f.setVisibility(8);
            return;
        }
        dialogC9721l.f17057g = Math.max(height - i10, dialogC9721l.f17057g);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = dialogC9721l.f17052b;
        if (viewDialogTextEditBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        View view = viewDialogTextEditBinding3.f11334f;
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = dialogC9721l.f17052b;
        if (viewDialogTextEditBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding4 = null;
        }
        ViewGroup.LayoutParams layoutParams = viewDialogTextEditBinding4.f11334f.getLayoutParams();
        layoutParams.height = dialogC9721l.f17057g;
        view.setLayoutParams(layoutParams);
        Log.i("TextEditDialog", "keyboardHeight-> " + dialogC9721l.f17057g);
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = dialogC9721l.f17052b;
        if (viewDialogTextEditBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogTextEditBinding = viewDialogTextEditBinding5;
        }
        viewDialogTextEditBinding.f11334f.setVisibility(0);
    }

    /* renamed from: k */
    public final void m16250k() {
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.f17056f = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16251q();
        ViewDialogTextEditBinding viewDialogTextEditBinding = null;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(this.f17051a), R$layout.view_dialog_text_edit, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "inflate(...)");
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = (ViewDialogTextEditBinding) viewDataBindingInflate;
        this.f17052b = viewDialogTextEditBinding2;
        if (viewDialogTextEditBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding2 = null;
        }
        setContentView(viewDialogTextEditBinding2.f11333e);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.f17052b;
        if (viewDialogTextEditBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        viewDialogTextEditBinding3.f11331c.addTextChangedListener(new a());
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.f17052b;
        if (viewDialogTextEditBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding4 = null;
        }
        viewDialogTextEditBinding4.f11331c.addTextChangedListener(new b());
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = this.f17052b;
        if (viewDialogTextEditBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding5 = null;
        }
        viewDialogTextEditBinding5.f11329a.setOnClickListener(new View.OnClickListener() { // from class: v7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC9721l.m16246n(this.f17046a, view);
            }
        });
        ViewDialogTextEditBinding viewDialogTextEditBinding6 = this.f17052b;
        if (viewDialogTextEditBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogTextEditBinding = viewDialogTextEditBinding6;
        }
        viewDialogTextEditBinding.f11330b.setOnClickListener(new View.OnClickListener() { // from class: v7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC9721l.m16248p(this.f17047a, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 != 4) {
            return super.onKeyDown(i10, event);
        }
        this.f17055e.invoke();
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            m16250k();
            window.setLayout(rect.width(), rect.height() - this.f17056f);
        }
    }

    /* renamed from: q */
    public final void m16251q() {
        final Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: v7.j
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    DialogC9721l.m16249r(window, this);
                }
            });
        }
    }

    /* renamed from: s */
    public final void m16252s(String initText, Function1 afterTextChangeCallback, Function1 doneCallback, Function0 cancelCallback) {
        Intrinsics.checkNotNullParameter(initText, "initText");
        Intrinsics.checkNotNullParameter(afterTextChangeCallback, "afterTextChangeCallback");
        Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
        Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
        this.f17053c = afterTextChangeCallback;
        this.f17054d = doneCallback;
        this.f17055e = cancelCallback;
        show();
        ViewDialogTextEditBinding viewDialogTextEditBinding = this.f17052b;
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = null;
        if (viewDialogTextEditBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding = null;
        }
        viewDialogTextEditBinding.f11331c.setText(initText);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.f17052b;
        if (viewDialogTextEditBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogTextEditBinding3 = null;
        }
        KeyboardUtils.showSoftInput(viewDialogTextEditBinding3.f11331c);
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.f17052b;
        if (viewDialogTextEditBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogTextEditBinding2 = viewDialogTextEditBinding4;
        }
        viewDialogTextEditBinding2.f11331c.requestFocus();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC9721l(Context activity, int i10) {
        super(activity, i10);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f17051a = activity;
        this.f17053c = new Function1() { // from class: v7.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC9721l.m16243j((String) obj);
            }
        };
        this.f17054d = new Function1() { // from class: v7.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC9721l.m16245m((String) obj);
            }
        };
        this.f17055e = new Function0() { // from class: v7.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC9721l.m16244l();
            }
        };
    }

    /* renamed from: v7.l$a */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            DialogC9721l.this.f17053c.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: v7.l$b */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            ViewDialogTextEditBinding viewDialogTextEditBinding = DialogC9721l.this.f17052b;
            if (viewDialogTextEditBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewDialogTextEditBinding = null;
            }
            Button button = viewDialogTextEditBinding.f11330b;
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
