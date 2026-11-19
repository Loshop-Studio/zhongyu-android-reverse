package p267v6;

import android.graphics.RectF;
import com.zykj.evaluation.bean.PaperOption;
import com.zykj.evaluation.bean.PaperPoint;
import com.zykj.evaluation.bean.PaperPosition;
import com.zykj.evaluation.bean.PaperQuestion;
import com.zykj.evaluation.bean.PaperSelect;
import com.zykj.evaluation.bean.constant.QuestionTypeEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import p079e7.AnswerCorrectData;
import p079e7.AnswerData;
import p202p7.C8857a;
import p267v6.AbstractC9694l0;
import p287x6.C9860c;
import p287x6.C9861d;

/* renamed from: v6.y */
/* loaded from: classes4.dex */
public abstract class AbstractC9708y {
    /* renamed from: a */
    public static final void m16216a(JSONObject jSONObject, int i10, int i11, AbstractC9696m0 scanQuestionType) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(scanQuestionType, "scanQuestionType");
        C8857a c8857a = C8857a.f15058a;
        JSONObject jSONObjectM14853c = c8857a.m14853c(c8857a.m14852b(c8857a.m14853c(c8857a.m14852b(jSONObject, "Pages"), i10), "Questions"), i11);
        if (jSONObjectM14853c != null) {
            jSONObjectM14853c.put("Type", scanQuestionType.m16209a());
        }
    }

    /* renamed from: b */
    public static final List m16217b(List list) {
        AnswerData answerData;
        boolean z9;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnswerCorrectData answerCorrectData = (AnswerCorrectData) it.next();
            boolean z10 = answerCorrectData.getAnswerData().size() > 1;
            for (AnswerData answerData2 : answerCorrectData.getAnswerData()) {
                if (answerData2.getSelect() != null) {
                    List<PaperOption> options = answerData2.getSelect().getOptions();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
                    for (PaperOption paperOption : options) {
                        arrayList2.add(new C9860c(paperOption.getLabel(), StringsKt.contains$default((CharSequence) answerData2.getAnswer(), (CharSequence) paperOption.getLabel(), false, 2, (Object) null) ? AbstractC9694l0.b.f17006c : AbstractC9694l0.a.f17005c));
                    }
                    int numericalOrder = answerCorrectData.getNumericalOrder();
                    int order = answerData2.getOrder();
                    if (answerCorrectData.getType() != QuestionTypeEnum.MULTIPLE.getType()) {
                        answerData = answerData2;
                        z9 = true;
                    } else {
                        answerData = answerData2;
                        z9 = false;
                    }
                    arrayList.add(new C9861d(z10, numericalOrder, order, z9, arrayList2, answerCorrectData.getQuestionId(), answerData.getUuid()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final boolean m16218c(PaperQuestion paperQuestion) {
        Intrinsics.checkNotNullParameter(paperQuestion, "<this>");
        return paperQuestion.getType() == QuestionTypeEnum.FILLINBLANK.getType();
    }

    /* renamed from: d */
    public static final boolean m16219d(PaperQuestion paperQuestion) {
        Intrinsics.checkNotNullParameter(paperQuestion, "<this>");
        if (paperQuestion.getType() == QuestionTypeEnum.QSTANDANSWER.getType() || paperQuestion.getType() == QuestionTypeEnum.WRITING.getType() || paperQuestion.getType() == QuestionTypeEnum.COMPOSITION.getType()) {
            return true;
        }
        if (paperQuestion.getType() != QuestionTypeEnum.COMPREHENSION.getType()) {
            return false;
        }
        List<PaperSelect> selects = paperQuestion.getSelects();
        return selects == null || selects.isEmpty();
    }

    /* renamed from: e */
    public static final boolean m16220e(PaperQuestion paperQuestion) {
        List<PaperSelect> selects;
        Intrinsics.checkNotNullParameter(paperQuestion, "<this>");
        if (paperQuestion.getType() == QuestionTypeEnum.SINGLE.getType() || paperQuestion.getType() == QuestionTypeEnum.MULTIPLE.getType() || paperQuestion.getType() == QuestionTypeEnum.TRUEORFALSE.getType() || paperQuestion.getType() == QuestionTypeEnum.READING.getType() || paperQuestion.getType() == QuestionTypeEnum.SEVENCHOICESFIVE.getType()) {
            return true;
        }
        return (paperQuestion.getType() != QuestionTypeEnum.COMPREHENSION.getType() || (selects = paperQuestion.getSelects()) == null || selects.isEmpty()) ? false : true;
    }

    /* renamed from: f */
    public static final PaperPosition m16221f(PaperPosition paperPosition, float f10, float f11) {
        Intrinsics.checkNotNullParameter(paperPosition, "<this>");
        return new PaperPosition(new PaperPoint(paperPosition.getStart().getXRate() + f10, paperPosition.getStart().getYRate() + f11), new PaperPoint(paperPosition.getEnd().getXRate() + f10, paperPosition.getEnd().getYRate() + f11));
    }

    /* renamed from: g */
    public static final RectF m16222g(PaperPosition paperPosition) {
        Intrinsics.checkNotNullParameter(paperPosition, "<this>");
        return new RectF(paperPosition.getStart().getXRate(), paperPosition.getStart().getYRate(), paperPosition.getEnd().getXRate(), paperPosition.getEnd().getYRate());
    }
}
