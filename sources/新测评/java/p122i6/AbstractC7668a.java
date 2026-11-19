package p122i6;

import androidx.collection.ArrayMap;
import com.zykj.evaluation.bean.CommitAnswer;
import com.zykj.evaluation.bean.CommitTaskAnswer;
import com.zykj.evaluation.bean.GuideGroup;
import com.zykj.evaluation.bean.GuideNoStemQuestion;
import com.zykj.evaluation.bean.GuideSubQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p122i6.AbstractC7699p0;

/* renamed from: i6.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7668a {
    /* renamed from: a */
    public static final List m12805a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7670b c7670b = (C7670b) it.next();
            ArrayMap arrayMap = new ArrayMap();
            for (C7690l c7690l : c7670b.m12811e()) {
                if (!arrayMap.containsKey(Long.valueOf(c7690l.m12873f()))) {
                    arrayMap.put(Long.valueOf(c7690l.m12873f()), new CommitTaskAnswer(c7690l.m12873f(), null, null, 6, null));
                }
                Long lValueOf = Long.valueOf(c7690l.m12873f());
                Object obj = arrayMap.get(Long.valueOf(c7690l.m12873f()));
                Intrinsics.checkNotNull(obj);
                CommitTaskAnswer commitTaskAnswer = (CommitTaskAnswer) obj;
                ArrayList arrayList2 = new ArrayList();
                Object obj2 = arrayMap.get(Long.valueOf(c7690l.m12873f()));
                Intrinsics.checkNotNull(obj2);
                arrayList2.addAll(((CommitTaskAnswer) obj2).getAnswers());
                arrayList2.add(new CommitAnswer(c7690l.m12876i(), (c7690l.m12874g() == AbstractC7699p0.c.a.f13056b.m12881a() || c7690l.m12874g() == AbstractC7699p0.a.f13054b.m12881a()) ? CollectionsKt.emptyList() : c7690l.m12871d()));
                Unit unit = Unit.INSTANCE;
                arrayMap.put(lValueOf, CommitTaskAnswer.copy$default(commitTaskAnswer, 0L, null, arrayList2, 3, null));
            }
            arrayList.addAll(arrayMap.values());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List m12806b(List list, boolean z9, Map localAnswerMap) {
        Iterator it;
        String str;
        Iterator it2;
        boolean z10;
        List<GuideSubQuestion> subQuestions;
        Iterator it3;
        String str2;
        String string;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(localAnswerMap, "localAnswerMap");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            GuideGroup guideGroup = (GuideGroup) it4.next();
            String title = guideGroup.getTitle();
            String str3 = "（共" + guideGroup.getQstCount() + "题" + (z9 ? "，共" + guideGroup.getScore() + "分）" : "）");
            String description = guideGroup.getDescription();
            if (description == null) {
                description = "";
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = guideGroup.getQuestions().iterator();
            while (it5.hasNext()) {
                GuideNoStemQuestion guideNoStemQuestion = (GuideNoStemQuestion) it5.next();
                if (guideNoStemQuestion.getAnswerWithQuestion()) {
                    GuideSubQuestion guideSubQuestion = (GuideSubQuestion) CollectionsKt.firstOrNull((List) guideNoStemQuestion.getQstFlows());
                    if (guideSubQuestion == null || (string = guideSubQuestion.getUuid()) == null) {
                        string = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    }
                    String str4 = string;
                    long id = guideNoStemQuestion.getId();
                    boolean askForHelp = guideNoStemQuestion.getAskForHelp();
                    int iM12881a = AbstractC7699p0.c.a.f13056b.m12881a();
                    String title2 = guideNoStemQuestion.getTitle();
                    GuideSubQuestion guideSubQuestion2 = (GuideSubQuestion) CollectionsKt.firstOrNull((List) guideNoStemQuestion.getQstFlows());
                    List listEmptyList = (List) localAnswerMap.get(guideSubQuestion2 != null ? guideSubQuestion2.getUuid() : null);
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    arrayList2.add(new C7690l(str4, id, true, askForHelp, iM12881a, title2, null, listEmptyList, 64, null));
                } else {
                    boolean z11 = guideNoStemQuestion.getQstFlows().size() > 1;
                    boolean z12 = true;
                    for (GuideSubQuestion guideSubQuestion3 : guideNoStemQuestion.getQstFlows()) {
                        String title3 = guideNoStemQuestion.getTitle();
                        if (z11) {
                            it = it4;
                            str = "." + guideSubQuestion3.getNumber();
                        } else {
                            it = it4;
                            str = "";
                        }
                        String str5 = title3 + str;
                        if (guideSubQuestion3.getType() != 0 || (subQuestions = guideSubQuestion3.getSubQuestions()) == null || subQuestions.isEmpty()) {
                            it2 = it5;
                            String uuid = guideSubQuestion3.getUuid();
                            long id2 = guideNoStemQuestion.getId();
                            Unit unit = Unit.INSTANCE;
                            boolean askForHelp2 = guideNoStemQuestion.getAskForHelp();
                            int qstType = guideSubQuestion3.getQstType();
                            List<String> options = guideSubQuestion3.getOptions();
                            if (options == null) {
                                options = CollectionsKt.emptyList();
                            }
                            List<String> list2 = options;
                            List listEmptyList2 = (List) localAnswerMap.get(guideSubQuestion3.getUuid());
                            if (listEmptyList2 == null) {
                                listEmptyList2 = CollectionsKt.emptyList();
                            }
                            z10 = true;
                            arrayList2.add(new C7690l(uuid, id2, z12, askForHelp2, qstType, str5, list2, listEmptyList2));
                            z12 = false;
                        } else {
                            boolean z13 = true;
                            boolean z14 = guideSubQuestion3.getSubQuestions().size() > 1;
                            boolean z15 = z12;
                            for (GuideSubQuestion guideSubQuestion4 : guideSubQuestion3.getSubQuestions()) {
                                if (z14) {
                                    it3 = it5;
                                    str2 = "." + guideSubQuestion4.getNumber();
                                } else {
                                    it3 = it5;
                                    str2 = "";
                                }
                                String str6 = str5 + str2;
                                String uuid2 = guideSubQuestion4.getUuid();
                                long id3 = guideNoStemQuestion.getId();
                                Unit unit2 = Unit.INSTANCE;
                                boolean askForHelp3 = guideNoStemQuestion.getAskForHelp();
                                int qstType2 = guideSubQuestion4.getQstType();
                                List<String> options2 = guideSubQuestion4.getOptions();
                                if (options2 == null) {
                                    options2 = CollectionsKt.emptyList();
                                }
                                List<String> list3 = options2;
                                List listEmptyList3 = (List) localAnswerMap.get(guideSubQuestion4.getUuid());
                                if (listEmptyList3 == null) {
                                    listEmptyList3 = CollectionsKt.emptyList();
                                }
                                arrayList2.add(new C7690l(uuid2, id3, z15, askForHelp3, qstType2, str6, list3, listEmptyList3));
                                it5 = it3;
                                z13 = true;
                                z15 = false;
                            }
                            it2 = it5;
                            z10 = z13;
                            z12 = z15;
                        }
                        it4 = it;
                        it5 = it2;
                    }
                }
                it4 = it4;
                it5 = it5;
            }
            arrayList.add(new C7670b(title, str3, description, arrayList2));
            it4 = it4;
        }
        return arrayList;
    }
}
