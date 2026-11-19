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
import com.zykj.blackboard.R$id;
import com.zykj.blackboard.R$layout;
import com.zykj.blackboard.R$style;
import com.zykj.blackboard.widgets.TextDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TextDialog extends Dialog {

    /* renamed from: a */
    public Function1 f9147a;

    /* renamed from: b */
    public Function1 f9148b;

    /* renamed from: c */
    public Function0 f9149c;

    /* renamed from: com.zykj.blackboard.widgets.TextDialog$a */
    public static final class C7069a implements TextWatcher {
        public C7069a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextDialog.this.m8021b().invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDialog(Context context, int i9) {
        super(context, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9147a = new Function1<String, Unit>() { // from class: com.zykj.blackboard.widgets.TextDialog$afterTextChangedCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        };
        this.f9148b = new Function1<String, Unit>() { // from class: com.zykj.blackboard.widgets.TextDialog$doneCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        };
        this.f9149c = new Function0<Unit>() { // from class: com.zykj.blackboard.widgets.TextDialog$cancelCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
    }

    /* renamed from: c */
    public static final void m8020c(TextDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f9148b.invoke(((EditText) this$0.findViewById(R$id.et_input)).getText().toString());
        this$0.dismiss();
    }

    /* renamed from: b */
    public final Function1 m8021b() {
        return this.f9147a;
    }

    /* renamed from: d */
    public final void m8022d(String initText, Function1 afterTextChangeCallback, Function1 doneCallback, Function0 cancelCallback) {
        Intrinsics.checkNotNullParameter(initText, "initText");
        Intrinsics.checkNotNullParameter(afterTextChangeCallback, "afterTextChangeCallback");
        Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
        Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
        this.f9147a = afterTextChangeCallback;
        this.f9148b = doneCallback;
        this.f9149c = cancelCallback;
        show();
        ((EditText) findViewById(R$id.et_input)).setText(initText);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.model_blackboard_dialog_text);
        ((EditText) findViewById(R$id.et_input)).addTextChangedListener(new C7069a());
        ((Button) findViewById(R$id.btn_confirm)).setOnClickListener(new View.OnClickListener() { // from class: v5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextDialog.m8020c(this.f17359a, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i9 != 4) {
            return super.onKeyDown(i9, event);
        }
        this.f9149c.invoke();
        return super.onKeyDown(i9, event);
    }

    @Override // android.app.Dialog
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            Resources resources = getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            window.setLayout(rect.width(), rect.height() - resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android")));
        }
    }

    public /* synthetic */ TextDialog(Context context, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? R$style.AppTheme_Dialog : i9);
    }
}
