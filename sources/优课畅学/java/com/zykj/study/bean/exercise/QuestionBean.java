package com.zykj.study.bean.exercise;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import com.zykj.study.utils.ChoiceList;
import com.zykj.utils.AppUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class QuestionBean implements Parcelable {
    private final String analysis;
    private final String answer;
    private String answerEx;
    private final Map<String, List<String>> answerForStu;

    @SerializedName("answerSubmited")
    private final String answerSubmitString;
    private final String content;
    private final boolean correct;
    private List<String> correctAnswers;
    private final QuestionExtra extra;

    /* renamed from: id */
    @SerializedName(alternate = {"questionId"}, value = "id")
    private final String f11011id;
    private final Integer progress;
    private final QuestionType questionType;

    @SerializedName("options")
    private final List<String> rawOptions;
    private QuestionStatus status;
    private final Integer totalNum;
    public static final Parcelable.Creator<QuestionBean> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<QuestionBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionBean createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Parcel parcel2 = parcel;
            AbstractC9133u.m16133g(parcel2, "parcel");
            String string = parcel2.readString();
            int i10 = 0;
            boolean z10 = parcel2.readInt() != 0;
            String string2 = parcel2.readString();
            QuestionType questionTypeValueOf = parcel2.readInt() == 0 ? null : QuestionType.valueOf(parcel2.readString());
            QuestionStatus questionStatusValueOf = parcel2.readInt() == 0 ? null : QuestionStatus.valueOf(parcel2.readString());
            String string3 = parcel2.readString();
            String string4 = parcel2.readString();
            String string5 = parcel2.readString();
            QuestionExtra questionExtraCreateFromParcel = parcel2.readInt() == 0 ? null : QuestionExtra.CREATOR.createFromParcel(parcel2);
            String string6 = parcel2.readString();
            Integer numValueOf = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            if (parcel2.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel2.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                while (i10 != i11) {
                    linkedHashMap2.put(parcel2.readString(), parcel.createStringArrayList());
                    i10++;
                    parcel2 = parcel;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new QuestionBean(string, z10, string2, questionTypeValueOf, questionStatusValueOf, string3, string4, string5, questionExtraCreateFromParcel, string6, numValueOf, linkedHashMap, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionBean[] newArray(int i10) {
            return new QuestionBean[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionBean(String id, boolean z10, String str, QuestionType questionType, QuestionStatus questionStatus, String str2, String str3, String str4, QuestionExtra questionExtra, String str5, Integer num, Map<String, ? extends List<String>> map, List<String> list, List<String> list2, Integer num2) {
        AbstractC9133u.m16133g(id, "id");
        this.f11011id = id;
        this.correct = z10;
        this.content = str;
        this.questionType = questionType;
        this.status = questionStatus;
        this.answer = str2;
        this.answerEx = str3;
        this.analysis = str4;
        this.extra = questionExtra;
        this.answerSubmitString = str5;
        this.progress = num;
        this.answerForStu = map;
        this.correctAnswers = list;
        this.rawOptions = list2;
        this.totalNum = num2;
    }

    private final List<String> component14() {
        return this.rawOptions;
    }

    private final String component6() {
        return this.answer;
    }

    private final float screenWidthDp() {
        Object systemService = AppUtils.INSTANCE.mo12323a().getSystemService("window");
        AbstractC9133u.m16131e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels / displayMetrics.density;
    }

    public final String component1() {
        return this.f11011id;
    }

    public final String component10() {
        return this.answerSubmitString;
    }

    public final Integer component11() {
        return this.progress;
    }

    public final Map<String, List<String>> component12() {
        return this.answerForStu;
    }

    public final List<String> component13() {
        return this.correctAnswers;
    }

    public final Integer component15() {
        return this.totalNum;
    }

    public final boolean component2() {
        return this.correct;
    }

    public final String component3() {
        return this.content;
    }

    public final QuestionType component4() {
        return this.questionType;
    }

    public final QuestionStatus component5() {
        return this.status;
    }

    public final String component7() {
        return this.answerEx;
    }

    public final String component8() {
        return this.analysis;
    }

    public final QuestionExtra component9() {
        return this.extra;
    }

    public final QuestionBean copy(String id, boolean z10, String str, QuestionType questionType, QuestionStatus questionStatus, String str2, String str3, String str4, QuestionExtra questionExtra, String str5, Integer num, Map<String, ? extends List<String>> map, List<String> list, List<String> list2, Integer num2) {
        AbstractC9133u.m16133g(id, "id");
        return new QuestionBean(id, z10, str, questionType, questionStatus, str2, str3, str4, questionExtra, str5, num, map, list, list2, num2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionBean)) {
            return false;
        }
        QuestionBean questionBean = (QuestionBean) obj;
        return AbstractC9133u.m16128b(this.f11011id, questionBean.f11011id) && this.correct == questionBean.correct && AbstractC9133u.m16128b(this.content, questionBean.content) && this.questionType == questionBean.questionType && this.status == questionBean.status && AbstractC9133u.m16128b(this.answer, questionBean.answer) && AbstractC9133u.m16128b(this.answerEx, questionBean.answerEx) && AbstractC9133u.m16128b(this.analysis, questionBean.analysis) && AbstractC9133u.m16128b(this.extra, questionBean.extra) && AbstractC9133u.m16128b(this.answerSubmitString, questionBean.answerSubmitString) && AbstractC9133u.m16128b(this.progress, questionBean.progress) && AbstractC9133u.m16128b(this.answerForStu, questionBean.answerForStu) && AbstractC9133u.m16128b(this.correctAnswers, questionBean.correctAnswers) && AbstractC9133u.m16128b(this.rawOptions, questionBean.rawOptions) && AbstractC9133u.m16128b(this.totalNum, questionBean.totalNum);
    }

    public final String fetchAdaptAnalysis() {
        return this.analysis + "<style>img{max-width:" + ((screenWidthDp() / 2) * 0.9f) + "px !important;height:auto !important;}p{width:100%;word-break:break-all;overflow-x:hidden;}</style>";
    }

    public final String fetchAdaptContent() {
        return this.content + "<style>img{width:auto !important;max-width:" + ((screenWidthDp() / 2) * 0.9f) + "px !important;}p{width:100%;word-break:break-all;overflow-x:hidden;}</style>";
    }

    public final String getAdaptStandardAnswerStr() {
        if (this.questionType != QuestionType.ANSWER) {
            return getStandardAnswerList().toString();
        }
        return this.answer + "<style>img{max-width:" + ((screenWidthDp() / 2) * 0.9f) + "px !important;height:auto !important;}p{width:100%;word-break:break-all;overflow-x:hidden;}</style>";
    }

    public final String getAnalysis() {
        return this.analysis;
    }

    public final String getAnswerEx() {
        return this.answerEx;
    }

    public final Map<String, List<String>> getAnswerForStu() {
        return this.answerForStu;
    }

    public final ChoiceList getAnswerSubmit() {
        List listM13958I0;
        ChoiceList choiceList = new ChoiceList();
        String str = this.answerSubmitString;
        if (str != null && (listM13958I0 = AbstractC8661c0.m13958I0(str, new String[]{","}, false, 0, 6, null)) != null) {
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM13958I0, 10));
            Iterator it = listM13958I0.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(choiceList.add((String) it.next())));
            }
        }
        return choiceList;
    }

    public final String getAnswerSubmitString() {
        return this.answerSubmitString;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean getCorrect() {
        return this.correct;
    }

    public final List<String> getCorrectAnswers() {
        return this.correctAnswers;
    }

    public final QuestionExtra getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.f11011id;
    }

    public final List<String> getOptions() {
        List<String> list;
        if (this.questionType == QuestionType.ANSWER && ((list = this.rawOptions) == null || list.isEmpty())) {
            return AbstractC8809v.m14774q(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B");
        }
        List<String> list2 = this.rawOptions;
        return list2 == null ? AbstractC8809v.m14771n() : list2;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final QuestionType getQuestionType() {
        return this.questionType;
    }

    public final ChoiceList getStandardAnswerList() {
        String strM14101I;
        String strM14101I2;
        String strM14101I3;
        List listM13958I0;
        ChoiceList choiceList = new ChoiceList();
        String str = this.answer;
        if (str != null && (strM14101I = AbstractC8687z.m14101I(str, "[", "", false, 4, null)) != null && (strM14101I2 = AbstractC8687z.m14101I(strM14101I, "]", "", false, 4, null)) != null && (strM14101I3 = AbstractC8687z.m14101I(strM14101I2, "\"", "", false, 4, null)) != null && (listM13958I0 = AbstractC8661c0.m13958I0(strM14101I3, new String[]{","}, false, 0, 6, null)) != null) {
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM13958I0, 10));
            Iterator it = listM13958I0.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(choiceList.add((String) it.next())));
            }
        }
        return choiceList;
    }

    public final QuestionStatus getStatus() {
        return this.status;
    }

    public final Integer getTotalNum() {
        return this.totalNum;
    }

    public int hashCode() {
        int iHashCode = ((this.f11011id.hashCode() * 31) + Boolean.hashCode(this.correct)) * 31;
        String str = this.content;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        QuestionType questionType = this.questionType;
        int iHashCode3 = (iHashCode2 + (questionType == null ? 0 : questionType.hashCode())) * 31;
        QuestionStatus questionStatus = this.status;
        int iHashCode4 = (iHashCode3 + (questionStatus == null ? 0 : questionStatus.hashCode())) * 31;
        String str2 = this.answer;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.answerEx;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.analysis;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        QuestionExtra questionExtra = this.extra;
        int iHashCode8 = (iHashCode7 + (questionExtra == null ? 0 : questionExtra.hashCode())) * 31;
        String str5 = this.answerSubmitString;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.progress;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, List<String>> map = this.answerForStu;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.correctAnswers;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.rawOptions;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.totalNum;
        return iHashCode13 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setAnswerEx(String str) {
        this.answerEx = str;
    }

    public final void setCorrectAnswers(List<String> list) {
        this.correctAnswers = list;
    }

    public final void setStatus(QuestionStatus questionStatus) {
        this.status = questionStatus;
    }

    public String toString() {
        return "QuestionBean(id=" + this.f11011id + ", correct=" + this.correct + ", content=" + this.content + ", questionType=" + this.questionType + ", status=" + this.status + ", answer=" + this.answer + ", answerEx=" + this.answerEx + ", analysis=" + this.analysis + ", extra=" + this.extra + ", answerSubmitString=" + this.answerSubmitString + ", progress=" + this.progress + ", answerForStu=" + this.answerForStu + ", correctAnswers=" + this.correctAnswers + ", rawOptions=" + this.rawOptions + ", totalNum=" + this.totalNum + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeString(this.f11011id);
        dest.writeInt(this.correct ? 1 : 0);
        dest.writeString(this.content);
        QuestionType questionType = this.questionType;
        if (questionType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(questionType.name());
        }
        QuestionStatus questionStatus = this.status;
        if (questionStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(questionStatus.name());
        }
        dest.writeString(this.answer);
        dest.writeString(this.answerEx);
        dest.writeString(this.analysis);
        QuestionExtra questionExtra = this.extra;
        if (questionExtra == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            questionExtra.writeToParcel(dest, i10);
        }
        dest.writeString(this.answerSubmitString);
        Integer num = this.progress;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Map<String, List<String>> map = this.answerForStu;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeStringList(entry.getValue());
            }
        }
        dest.writeStringList(this.correctAnswers);
        dest.writeStringList(this.rawOptions);
        Integer num2 = this.totalNum;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ QuestionBean(String str, boolean z10, String str2, QuestionType questionType, QuestionStatus questionStatus, String str3, String str4, String str5, QuestionExtra questionExtra, String str6, Integer num, Map map, List list, List list2, Integer num2, int i10, AbstractC9126n abstractC9126n) {
        this(str, z10, str2, questionType, questionStatus, str3, str4, str5, questionExtra, str6, num, (i10 & 2048) != 0 ? AbstractC9080a.m15943h() : map, (i10 & 4096) != 0 ? AbstractC8809v.m14771n() : list, (i10 & 8192) != 0 ? null : list2, (i10 & 16384) != 0 ? 0 : num2);
    }
}
