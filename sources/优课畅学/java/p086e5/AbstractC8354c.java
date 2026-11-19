package p086e5;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.blankj.utilcode.util.AbstractC5362f0;
import com.bumptech.glide.C5396g;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.tencent.smtt.sdk.TbsListener;
import com.xuexiang.xui.widget.button.switchbutton.SwitchButton;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;
import com.zykj.message.client.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$string;
import com.zykj.study.bean.course.CourseType;
import com.zykj.study.bean.exercise.ChoiceStatus;
import com.zykj.study.bean.exercise.QuestionType;
import com.zykj.study.view.CustomX5WebView;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import p069d0.C8272d;
import p259u.C10135b0;
import p300x7.InterfaceC10570l;

/* renamed from: e5.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8354c {

    /* renamed from: e5.c$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15874a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15875b;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.SINGLE_CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionType.MULTIPLE_CHOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionType.ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15874a = iArr;
            int[] iArr2 = new int[ChoiceStatus.values().length];
            try {
                iArr2[ChoiceStatus.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChoiceStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChoiceStatus.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChoiceStatus.SELECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ChoiceStatus.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f15875b = iArr2;
        }
    }

    /* renamed from: b */
    public static final void m13599b(View view, boolean z10) {
        AbstractC9133u.m16133g(view, "<this>");
        view.setEnabled(z10);
    }

    /* renamed from: c */
    public static final void m13600c(SuperTextView superTextView, boolean z10) {
        AbstractC9133u.m16133g(superTextView, "<this>");
        if (z10) {
            superTextView.m7228F(superTextView.getContext().getString(R$string.course_public));
        } else {
            superTextView.m7228F(superTextView.getContext().getString(R$string.course_private));
        }
    }

    /* renamed from: d */
    public static final void m13601d(ImageView imageView, String str) {
        AbstractC9133u.m16133g(imageView, "<this>");
        if (str != null) {
            ComponentCallbacks2C5391b.m2739u(imageView).m2809u(str).mo2777c(((C8272d) new C8272d().m13377X(R$drawable.ic_student_avatar)).m13388g()).m2790w0(imageView);
        }
    }

    /* renamed from: e */
    public static final void m13602e(ImageView imageView, String str) {
        AbstractC9133u.m16133g(imageView, "<this>");
        if (str != null) {
            ComponentCallbacks2C5391b.m2739u(imageView).m2809u(str).mo2777c(((C8272d) new C8272d().m13377X(R$drawable.ic_teacher_avatar)).m13388g()).m2790w0(imageView);
        }
    }

    /* renamed from: f */
    public static final void m13603f(ImageView imageView, String str) {
        AbstractC9133u.m16133g(imageView, "<this>");
        if (str != null) {
            ((C5396g) ((C5396g) ((C5396g) ComponentCallbacks2C5391b.m2739u(imageView).m2809u(str).m13392i0(new C10135b0(10))).m13397l(R$drawable.ic_image_error)).m13377X(R$drawable.ic_loading)).m2790w0(imageView);
        }
    }

    /* renamed from: g */
    public static final void m13604g(SuperTextView superTextView, String textString) {
        AbstractC9133u.m16133g(superTextView, "<this>");
        AbstractC9133u.m16133g(textString, "textString");
        superTextView.m7228F(textString);
    }

    /* renamed from: h */
    public static final void m13605h(SwitchButton switchButton, boolean z10) {
        AbstractC9133u.m16133g(switchButton, "<this>");
        switchButton.setCheckedImmediately(z10);
    }

    /* renamed from: i */
    public static final void m13606i(TextView textView, ChoiceStatus choiceStatus) {
        AbstractC9133u.m16133g(textView, "<this>");
        if (choiceStatus != null) {
            int i10 = a.f15875b[choiceStatus.ordinal()];
            if (i10 == 1) {
                textView.setTextColor(textView.getResources().getColor(R$color.gray_hint_text));
                textView.setBackgroundResource(R$drawable.shape_white_frame_gray_2);
                return;
            }
            if (i10 == 2) {
                textView.setTextColor(textView.getResources().getColor(com.zykj.study.R$color.white));
                textView.setBackgroundResource(R$drawable.shape_red_2);
                return;
            }
            if (i10 == 3) {
                textView.setTextColor(textView.getResources().getColor(com.zykj.study.R$color.white));
                textView.setBackgroundResource(R$drawable.shape_green_2);
            } else if (i10 == 4) {
                textView.setTextColor(textView.getResources().getColor(com.zykj.study.R$color.white));
                textView.setBackgroundResource(R$drawable.shape_blue_2);
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setTextColor(textView.getResources().getColor(com.zykj.study.R$color.white));
                textView.setBackgroundResource(R$drawable.shape_option_null_2);
            }
        }
    }

    /* renamed from: j */
    public static final void m13607j(SuperTextView superTextView, String str) {
        AbstractC9133u.m16133g(superTextView, "<this>");
        if (str == null || str.length() != 0) {
            superTextView.m7228F(str);
        } else {
            superTextView.m7228F(superTextView.getContext().getString(R$string.please_choice_catalog));
        }
    }

    /* renamed from: k */
    public static final void m13608k(TextView textView, boolean z10) {
        AbstractC9133u.m16133g(textView, "<this>");
        textView.setText(z10 ? textView.getContext().getString(R$string.course_public) : textView.getContext().getString(R$string.course_private));
    }

    /* renamed from: l */
    public static final void m13609l(TextView textView, CourseType type) {
        AbstractC9133u.m16133g(textView, "<this>");
        AbstractC9133u.m16133g(type, "type");
        if (type == CourseType.UNDERCARRIAGE) {
            textView.setText(textView.getContext().getString(R$string.course_status_undercarriage));
            textView.setTextColor(textView.getResources().getColor(com.zykj.study.R$color.text_gray));
        } else if (type != CourseType.DELETE) {
            textView.setText(textView.getContext().getString(R$string.grounding));
        } else {
            textView.setText(textView.getContext().getString(R$string.course_status_delete));
            textView.setTextColor(textView.getResources().getColor(com.zykj.study.R$color.text_warn));
        }
    }

    /* renamed from: m */
    public static final void m13610m(TextView textView, CourseType courseType) {
        AbstractC9133u.m16133g(textView, "<this>");
        if (courseType == CourseType.UNDERCARRIAGE) {
            textView.setText(textView.getContext().getString(R$string.course_status_undercarriage));
        } else if (courseType == CourseType.DELETE) {
            textView.setText(textView.getContext().getString(R$string.course_status_delete));
        } else {
            textView.setText(textView.getContext().getString(R$string.grounding));
        }
    }

    /* renamed from: n */
    public static final void m13611n(TextView textView, Date date) {
        AbstractC9133u.m16133g(textView, "<this>");
        if (date != null) {
            textView.setText("习题组完成时间：" + AbstractC5362f0.m2459a(date));
        }
    }

    /* renamed from: o */
    public static final void m13612o(CustomX5WebView customX5WebView, String str) {
        AbstractC9133u.m16133g(customX5WebView, "<this>");
        if (str == null) {
            str = "";
        }
        customX5WebView.loadData(str, "text/html; charset=UTF-8", null);
    }

    /* renamed from: p */
    public static final void m13613p(CustomX5WebView customX5WebView, float f10) {
        AbstractC9133u.m16133g(customX5WebView, "<this>");
        customX5WebView.setMaxHeight((int) f10);
    }

    /* renamed from: q */
    public static final void m13614q(TextView textView, QuestionType questionType) {
        String string;
        AbstractC9133u.m16133g(textView, "<this>");
        if (questionType != null) {
            int i10 = a.f15874a[questionType.ordinal()];
            if (i10 == 1) {
                string = textView.getContext().getString(R$string.single_question);
            } else if (i10 == 2) {
                string = textView.getContext().getString(R$string.multiple_question);
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string = textView.getContext().getString(R$string.answer_question);
            }
            textView.setText(string);
        }
    }

    /* renamed from: r */
    public static final void m13615r(View view, final InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(view, "<this>");
        final Long[] lArr = {0L, 0L};
        view.setOnClickListener(new View.OnClickListener() { // from class: e5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8354c.m13616s(lArr, interfaceC10570l, view2);
            }
        });
    }

    /* renamed from: s */
    public static final void m13616s(Long[] lArr, InterfaceC10570l interfaceC10570l, View view) {
        System.arraycopy(lArr, 1, lArr, 0, lArr.length - 1);
        lArr[lArr.length - 1] = Long.valueOf(SystemClock.uptimeMillis());
        if (lArr[0].longValue() >= SystemClock.uptimeMillis() - TbsListener.ErrorCode.INFO_CODE_MINIQB || interfaceC10570l == null) {
            return;
        }
        AbstractC9133u.m16130d(view);
        interfaceC10570l.invoke(view);
    }

    /* renamed from: t */
    public static final void m13617t(View view, Boolean bool) {
        AbstractC9133u.m16133g(view, "<this>");
        int i10 = 4;
        if (bool != null && bool.booleanValue()) {
            i10 = 0;
        }
        view.setVisibility(i10);
    }
}
