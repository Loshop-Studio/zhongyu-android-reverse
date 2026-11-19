package com.zykj.blackboard.widgets;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.navigation.ViewOnClickListenerC2869j;
import com.zykj.blackboard.C4228R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0004\b\u001c\u0010\u001dR.\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, m5110d2 = {"Lcom/zykj/blackboard/widgets/TextDialog;", "Landroid/app/Dialog;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "savedInstanceState", "Ld6/s;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "keyCode", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "", "initText", "Lkotlin/Function1;", "afterTextChangeCallback", "doneCallback", "Lkotlin/Function0;", "cancelCallback", "showDialog", "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V", "afterTextChangedCallback", "Lr6/c;", "getAfterTextChangedCallback", "()Lr6/c;", "setAfterTextChangedCallback", "(Lr6/c;)V", "getDoneCallback", "setDoneCallback", "Lr6/a;", "getCancelCallback", "()Lr6/a;", "setCancelCallback", "(Lr6/a;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TextDialog extends Dialog {

    @NotNull
    private InterfaceC6471c afterTextChangedCallback;

    @NotNull
    private InterfaceC6469a cancelCallback;

    @NotNull
    private InterfaceC6471c doneCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDialog(@NotNull Context context, int i) {
        super(context, i);
        AbstractC5830k.m5330g(context, "context");
        this.afterTextChangedCallback = new InterfaceC6471c() { // from class: com.zykj.blackboard.widgets.TextDialog$afterTextChangedCallback$1
            public final void invoke(@NotNull String str) {
                AbstractC5830k.m5330g(str, "<anonymous parameter 0>");
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C5443s.f8405a;
            }
        };
        this.doneCallback = new InterfaceC6471c() { // from class: com.zykj.blackboard.widgets.TextDialog$doneCallback$1
            public final void invoke(@NotNull String str) {
                AbstractC5830k.m5330g(str, "<anonymous parameter 0>");
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C5443s.f8405a;
            }
        };
        this.cancelCallback = new InterfaceC6469a() { // from class: com.zykj.blackboard.widgets.TextDialog$cancelCallback$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13815invoke() {
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13815invoke();
                return C5443s.f8405a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m13814onCreate$lambda0(TextDialog this$0, View view) {
        AbstractC5830k.m5330g(this$0, "this$0");
        this$0.doneCallback.invoke(((EditText) this$0.findViewById(C4228R.id.et_input)).getText().toString());
        this$0.dismiss();
    }

    @NotNull
    public final InterfaceC6471c getAfterTextChangedCallback() {
        return this.afterTextChangedCallback;
    }

    @NotNull
    public final InterfaceC6469a getCancelCallback() {
        return this.cancelCallback;
    }

    @NotNull
    public final InterfaceC6471c getDoneCallback() {
        return this.doneCallback;
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C4228R.layout.model_blackboard_dialog_text);
        ((EditText) findViewById(C4228R.id.et_input)).addTextChangedListener(new TextWatcher() { // from class: com.zykj.blackboard.widgets.TextDialog.onCreate.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s8) {
                TextDialog.this.getAfterTextChangedCallback().invoke(String.valueOf(s8));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence s8, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence s8, int start, int before, int count) {
            }
        });
        ((Button) findViewById(C4228R.id.btn_confirm)).setOnClickListener(new ViewOnClickListenerC2869j(this, 2));
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
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            Resources resources = getContext().getResources();
            AbstractC5830k.m5329f(resources, "context.resources");
            window.setLayout(rect.width(), rect.height() - resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android")));
        }
    }

    public final void setAfterTextChangedCallback(@NotNull InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(interfaceC6471c, "<set-?>");
        this.afterTextChangedCallback = interfaceC6471c;
    }

    public final void setCancelCallback(@NotNull InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(interfaceC6469a, "<set-?>");
        this.cancelCallback = interfaceC6469a;
    }

    public final void setDoneCallback(@NotNull InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(interfaceC6471c, "<set-?>");
        this.doneCallback = interfaceC6471c;
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
        ((EditText) findViewById(C4228R.id.et_input)).setText(initText);
    }

    public /* synthetic */ TextDialog(Context context, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? C4228R.style.AppTheme_Dialog : i);
    }
}
