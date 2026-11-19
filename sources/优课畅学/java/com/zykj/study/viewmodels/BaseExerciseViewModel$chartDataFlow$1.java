package com.zykj.study.viewmodels;

import androidx.camera.video.AudioStats;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.exercise.QuestionType;
import com.zykj.study.bean.teach.ChoiceChartData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC9079b;
import kotlin.collections.AbstractC9080a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;
import p322z7.AbstractC10729c;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.BaseExerciseViewModel$chartDataFlow$1", m17801f = "BaseExerciseViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BaseExerciseViewModel$chartDataFlow$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f13894a;

    /* renamed from: b */
    public /* synthetic */ Object f13895b;

    /* renamed from: c */
    public /* synthetic */ Object f13896c;

    public BaseExerciseViewModel$chartDataFlow$1(InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(QuestionBean questionBean, ChoiceChartData choiceChartData, InterfaceC9324c interfaceC9324c) {
        BaseExerciseViewModel$chartDataFlow$1 baseExerciseViewModel$chartDataFlow$1 = new BaseExerciseViewModel$chartDataFlow$1(interfaceC9324c);
        baseExerciseViewModel$chartDataFlow$1.f13895b = questionBean;
        baseExerciseViewModel$chartDataFlow$1.f13896c = choiceChartData;
        return baseExerciseViewModel$chartDataFlow$1.invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        QuestionBean questionBean = (QuestionBean) this.f13895b;
        ChoiceChartData choiceChartData = (ChoiceChartData) this.f13896c;
        AbstractC9434a.m17291f();
        if (this.f13894a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        if (questionBean == null) {
            return AbstractC8809v.m14771n();
        }
        Integer totalNum = questionBean.getTotalNum();
        int iIntValue = totalNum != null ? totalNum.intValue() : 0;
        Map<String, List<String>> answerForStu = questionBean.getAnswerForStu();
        if (answerForStu == null) {
            answerForStu = AbstractC9080a.m15943h();
        }
        List<String> options = questionBean.getOptions();
        if (options == null) {
            options = AbstractC8809v.m14771n();
        }
        List<String> correctAnswers = questionBean.getCorrectAnswers();
        if (correctAnswers == null) {
            correctAnswers = AbstractC8809v.m14771n();
        }
        boolean z10 = questionBean.getQuestionType() != QuestionType.ANSWER;
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(options, 10));
        for (String str : options) {
            String str2 = z10 ? str : AbstractC9133u.m16128b(str, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) ? "对" : "错";
            boolean zContains = z10 ? correctAnswers.contains(str) : AbstractC9133u.m16128b(str, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            List<String> listM14771n = answerForStu.get(str);
            if (listM14771n == null) {
                listM14771n = AbstractC8809v.m14771n();
            }
            Map<String, List<String>> map = answerForStu;
            double d10 = iIntValue;
            arrayList.add(new ChoiceChartData(str2, str, (d10 != AudioStats.AUDIO_AMPLITUDE_NONE && iIntValue > 0) ? AbstractC10729c.m20034c((r15.size() / d10) * 100) : 0, zContains, listM14771n, AbstractC9133u.m16128b(str, choiceChartData != null ? choiceChartData.getName() : null)));
            answerForStu = map;
        }
        return arrayList;
    }
}
