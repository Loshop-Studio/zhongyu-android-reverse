package com.zykj.view.dialog;

import android.app.Activity;
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
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.navigation.C2827b;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.C3404x;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import com.zykj.view.C5280R;
import com.zykj.view.board.play.C5353b;
import com.zykj.view.databinding.ViewDialogTextEditBinding;
import com.zykj.view.widget.LimitEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010%\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010,R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010-R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/¨\u00061"}, m5110d2 = {"Lcom/zykj/view/dialog/TextEditDialog;", "Landroid/app/Dialog;", "Landroid/content/Context;", "activity", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Ld6/s;", "setWindow", "()V", "calculateStatusBarHeight", "Landroid/view/View;", "activeView", "forceCloseKeyboard", "(Landroid/view/View;)V", "Landroid/app/Activity;", "showSoftInputForce", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "keyCode", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "", "initText", "Lkotlin/Function1;", "afterTextChangeCallback", "doneCallback", "Lkotlin/Function0;", "cancelCallback", "showDialog", "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V", "Landroid/content/Context;", "Lcom/zykj/view/databinding/ViewDialogTextEditBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewDialogTextEditBinding;", "afterTextChangedCallback", "Lr6/c;", "Lr6/a;", "statusBarHeight", "I", "keyboardHeight", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TextEditDialog extends Dialog {

    @NotNull
    private final Context activity;

    @NotNull
    private InterfaceC6471c afterTextChangedCallback;

    @NotNull
    private InterfaceC6469a cancelCallback;

    @NotNull
    private InterfaceC6471c doneCallback;
    private int keyboardHeight;
    private ViewDialogTextEditBinding mBinding;
    private int statusBarHeight;

    public /* synthetic */ TextEditDialog(Context context, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? C5280R.style.AppTheme_Dialog : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s afterTextChangedCallback$lambda$0(String str) {
        AbstractC5830k.m5330g(str, "<unused var>");
        return C5443s.f8405a;
    }

    private final void calculateStatusBarHeight() {
        Resources resources = getContext().getResources();
        AbstractC5830k.m5329f(resources, "getResources(...)");
        this.statusBarHeight = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s doneCallback$lambda$1(String str) {
        AbstractC5830k.m5330g(str, "<unused var>");
        return C5443s.f8405a;
    }

    private final void forceCloseKeyboard(View activeView) {
        Object systemService = activeView.getContext().getSystemService("input_method");
        AbstractC5830k.m5328e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activeView.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(TextEditDialog textEditDialog, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = textEditDialog.mBinding;
        AbstractC5824e abstractC5824e = null;
        if (viewDialogTextEditBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        LimitEditText limitEditText = viewDialogTextEditBinding.etInput;
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC3382c.m2303d().getSystemService("input_method");
        int i = 0;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(limitEditText.getWindowToken(), 0);
        }
        new CommonTipDialog(textEditDialog.activity, i, 2, abstractC5824e).showDialog("是否取消此次编辑", true, new C2827b(textEditDialog, 11), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s onCreate$lambda$4$lambda$3(TextEditDialog textEditDialog) {
        textEditDialog.cancelCallback.invoke();
        textEditDialog.dismiss();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(TextEditDialog textEditDialog, View view) {
        ViewDialogTextEditBinding viewDialogTextEditBinding = textEditDialog.mBinding;
        if (viewDialogTextEditBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        String strValueOf = String.valueOf(viewDialogTextEditBinding.etInput.getText());
        if (strValueOf.length() == 0) {
            C3404x.m2356a("内容不能为空", new Object[0]);
            return;
        }
        textEditDialog.doneCallback.invoke(strValueOf);
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = textEditDialog.mBinding;
        if (viewDialogTextEditBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        LimitEditText limitEditText = viewDialogTextEditBinding2.etInput;
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC3382c.m2303d().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(limitEditText.getWindowToken(), 0);
        }
        textEditDialog.dismiss();
    }

    private final void setWindow() {
        final Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zykj.view.dialog.c
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    TextEditDialog.setWindow$lambda$9$lambda$8(window, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWindow$lambda$9$lambda$8(Window window, TextEditDialog textEditDialog) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        int height = window.getDecorView().getHeight();
        if (i / height >= 0.8d || i == 0) {
            ViewDialogTextEditBinding viewDialogTextEditBinding = textEditDialog.mBinding;
            if (viewDialogTextEditBinding != null) {
                viewDialogTextEditBinding.viewSolid.setVisibility(8);
                return;
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
        textEditDialog.keyboardHeight = Math.max(height - i, textEditDialog.keyboardHeight);
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = textEditDialog.mBinding;
        if (viewDialogTextEditBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        View view = viewDialogTextEditBinding2.viewSolid;
        if (viewDialogTextEditBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = textEditDialog.keyboardHeight;
        view.setLayoutParams(layoutParams);
        Log.i("TextEditDialog", "keyboardHeight-> " + textEditDialog.keyboardHeight);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = textEditDialog.mBinding;
        if (viewDialogTextEditBinding3 != null) {
            viewDialogTextEditBinding3.viewSolid.setVisibility(0);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    private final void showSoftInputForce(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 0);
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setWindow();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(this.activity), C5280R.layout.view_dialog_text_edit, null, false);
        AbstractC5830k.m5329f(viewDataBindingInflate, "inflate(...)");
        ViewDialogTextEditBinding viewDialogTextEditBinding = (ViewDialogTextEditBinding) viewDataBindingInflate;
        this.mBinding = viewDialogTextEditBinding;
        setContentView(viewDialogTextEditBinding.root);
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = this.mBinding;
        if (viewDialogTextEditBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewDialogTextEditBinding2.etInput.addTextChangedListener(new TextWatcher() { // from class: com.zykj.view.dialog.TextEditDialog.onCreate.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s8) {
                TextEditDialog.this.afterTextChangedCallback.invoke(String.valueOf(s8));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s8, int start, int before, int count) {
            }
        });
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.mBinding;
        if (viewDialogTextEditBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewDialogTextEditBinding3.etInput.addTextChangedListener(new TextWatcher() { // from class: com.zykj.view.dialog.TextEditDialog.onCreate.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s8) {
                String string;
                ViewDialogTextEditBinding viewDialogTextEditBinding4 = TextEditDialog.this.mBinding;
                if (viewDialogTextEditBinding4 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                Button button = viewDialogTextEditBinding4.btnConfirm;
                if (s8 == null || (string = s8.toString()) == null) {
                    string = "";
                }
                button.setEnabled(string.length() > 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s8, int start, int before, int count) {
            }
        });
        ViewDialogTextEditBinding viewDialogTextEditBinding4 = this.mBinding;
        if (viewDialogTextEditBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i = 0;
        viewDialogTextEditBinding4.btnCancel.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.dialog.b

            /* renamed from: b */
            public final /* synthetic */ TextEditDialog f8320b;

            {
                this.f8320b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        TextEditDialog.onCreate$lambda$4(this.f8320b, view);
                        break;
                    default:
                        TextEditDialog.onCreate$lambda$5(this.f8320b, view);
                        break;
                }
            }
        });
        ViewDialogTextEditBinding viewDialogTextEditBinding5 = this.mBinding;
        if (viewDialogTextEditBinding5 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i8 = 1;
        viewDialogTextEditBinding5.btnConfirm.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.dialog.b

            /* renamed from: b */
            public final /* synthetic */ TextEditDialog f8320b;

            {
                this.f8320b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        TextEditDialog.onCreate$lambda$4(this.f8320b, view);
                        break;
                    default:
                        TextEditDialog.onCreate$lambda$5(this.f8320b, view);
                        break;
                }
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        this.cancelCallback.invoke();
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            calculateStatusBarHeight();
            window.setLayout(rect.width(), rect.height() - this.statusBarHeight);
        }
    }

    public final void showDialog(@NotNull String initText, @NotNull InterfaceC6471c afterTextChangeCallback, @NotNull InterfaceC6471c doneCallback, @NotNull InterfaceC6469a cancelCallback) {
        AbstractC5830k.m5330g(initText, "initText");
        AbstractC5830k.m5330g(afterTextChangeCallback, "afterTextChangeCallback");
        AbstractC5830k.m5330g(doneCallback, "doneCallback");
        AbstractC5830k.m5330g(cancelCallback, "cancelCallback");
        this.afterTextChangedCallback = afterTextChangeCallback;
        this.doneCallback = doneCallback;
        this.cancelCallback = cancelCallback;
        show();
        ViewDialogTextEditBinding viewDialogTextEditBinding = this.mBinding;
        if (viewDialogTextEditBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewDialogTextEditBinding.etInput.setText(initText);
        ViewDialogTextEditBinding viewDialogTextEditBinding2 = this.mBinding;
        if (viewDialogTextEditBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        AbstractC3382c.m2314o(viewDialogTextEditBinding2.etInput);
        ViewDialogTextEditBinding viewDialogTextEditBinding3 = this.mBinding;
        if (viewDialogTextEditBinding3 != null) {
            viewDialogTextEditBinding3.etInput.requestFocus();
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextEditDialog(@NotNull Context activity, int i) {
        super(activity, i);
        AbstractC5830k.m5330g(activity, "activity");
        this.activity = activity;
        this.afterTextChangedCallback = new C4959k1(22);
        this.doneCallback = new C4959k1(23);
        this.cancelCallback = new C5353b(3);
    }
}
