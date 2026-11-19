package com.zykj.study.viewmodels;

import androidx.camera.video.AudioStats;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.study.bean.teach.ChoiceChartData;
import com.zykj.study.bean.teach.GetQuizDetailBean;
import com.zykj.study.bean.teach.StuQuizBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10576r;
import p322z7.AbstractC10729c;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseStatisticsViewModel$chartDataFlow$1", m17801f = "ExerciseStatisticsViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseStatisticsViewModel$chartDataFlow$1 extends SuspendLambda implements InterfaceC10576r {

    /* renamed from: a */
    public int f14075a;

    /* renamed from: b */
    public /* synthetic */ Object f14076b;

    /* renamed from: c */
    public /* synthetic */ Object f14077c;

    /* renamed from: d */
    public /* synthetic */ Object f14078d;

    public ExerciseStatisticsViewModel$chartDataFlow$1(InterfaceC9324c interfaceC9324c) {
        super(4, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10576r
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(GetQuizDetailBean getQuizDetailBean, StuQuizBean stuQuizBean, ChoiceChartData choiceChartData, InterfaceC9324c interfaceC9324c) {
        ExerciseStatisticsViewModel$chartDataFlow$1 exerciseStatisticsViewModel$chartDataFlow$1 = new ExerciseStatisticsViewModel$chartDataFlow$1(interfaceC9324c);
        exerciseStatisticsViewModel$chartDataFlow$1.f14076b = getQuizDetailBean;
        exerciseStatisticsViewModel$chartDataFlow$1.f14077c = stuQuizBean;
        exerciseStatisticsViewModel$chartDataFlow$1.f14078d = choiceChartData;
        return exerciseStatisticsViewModel$chartDataFlow$1.invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        GetQuizDetailBean getQuizDetailBean = (GetQuizDetailBean) this.f14076b;
        StuQuizBean stuQuizBean = (StuQuizBean) this.f14077c;
        ChoiceChartData choiceChartData = (ChoiceChartData) this.f14078d;
        AbstractC9434a.m17291f();
        if (this.f14075a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        if (getQuizDetailBean == null || stuQuizBean == null) {
            return AbstractC8809v.m14771n();
        }
        List<String> options = getQuizDetailBean.getOptions();
        if (options == null) {
            options = AbstractC8809v.m14771n();
        }
        List<String> correctAnswers = getQuizDetailBean.getCorrectAnswers();
        if (correctAnswers == null) {
            correctAnswers = AbstractC8809v.m14771n();
        }
        int totalNum = stuQuizBean.getTotalNum();
        Map<String, List<String>> answerForStu = stuQuizBean.getAnswerForStu();
        boolean choiceOptions = getQuizDetailBean.getChoiceOptions();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(options, 10));
        for (String str : options) {
            String str2 = choiceOptions ? str : AbstractC9133u.m16128b(str, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) ? "对" : "错";
            boolean zContains = correctAnswers.contains(str);
            List<String> listM14771n = answerForStu.get(str);
            if (listM14771n == null) {
                listM14771n = AbstractC8809v.m14771n();
            }
            boolean z10 = choiceOptions;
            double d10 = totalNum;
            arrayList.add(new ChoiceChartData(str2, str, (d10 != AudioStats.AUDIO_AMPLITUDE_NONE && totalNum > 0) ? AbstractC10729c.m20034c((r14.size() / d10) * 100) : 0, zContains, listM14771n, AbstractC9133u.m16128b(str, choiceChartData != null ? choiceChartData.getName() : null)));
            choiceOptions = z10;
        }
        return arrayList;
    }
}
