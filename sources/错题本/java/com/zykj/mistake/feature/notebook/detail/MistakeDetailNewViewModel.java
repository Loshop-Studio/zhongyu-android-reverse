package com.zykj.mistake.feature.notebook.detail;

import android.app.Application;
import android.view.AndroidViewModel;
import android.view.C2764i;
import android.view.ViewModelKt;
import android.view.compose.C2750a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.C2827b;
import androidx.navigation.C2861i;
import androidx.navigation.internal.C2865d;
import com.zykj.mistake.R;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.data.CollectionLimitException;
import com.zykj.mistake.entity.req.MultiRemoveMistakeReq;
import com.zykj.mistake.entity.req.MultiSetTagsReq;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.feature.review.C5005m;
import com.zykj.mistake.feature.review.C5007o;
import com.zykj.mistake.feature.review.C5009q;
import com.zykj.mistake.feature.review.ReviewContract$PracticePoolType;
import com.zykj.mistake.feature.review.ReviewContract$PracticeScene;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.network.InterfaceC5090c;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.AbstractC5101f;
import com.zykj.mistake.utils.C5100e;
import com.zykj.mistake.utils.C5103h;
import com.zykj.mistake.utils.QuestionType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5904c;
import kotlinx.coroutines.flow.C5946n0;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p068g7.C5609e;
import p068g7.ExecutorC5608d;
import p129o2.C6268a;
import p137p4.C6386e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m5110d2 = {"Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "com/zykj/mistake/feature/notebook/detail/c4", "com/zykj/mistake/feature/notebook/detail/h4", "com/zykj/mistake/feature/notebook/detail/d4", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2474:1\n230#2,5:2475\n230#2,5:2481\n230#2,5:2486\n230#2,5:2491\n230#2,5:2496\n230#2,5:2501\n230#2,5:2506\n230#2,5:2511\n230#2,5:2516\n230#2,5:2521\n230#2,5:2526\n230#2,5:2531\n230#2,5:2536\n230#2,5:2541\n230#2,5:2546\n230#2,3:2551\n233#2,2:2556\n230#2,5:2558\n230#2,5:2563\n230#2,5:2568\n230#2,5:2573\n230#2,5:2578\n230#2,5:2583\n230#2,5:2588\n230#2,5:2593\n230#2,5:2598\n230#2,5:2603\n230#2,5:2616\n230#2,5:2621\n230#2,5:2626\n230#2,5:2631\n230#2,5:2636\n230#2,5:2641\n230#2,5:2646\n230#2,5:2651\n230#2,5:2656\n230#2,5:2661\n230#2,5:2666\n230#2,5:2671\n230#2,5:2676\n230#2,5:2681\n230#2,5:2686\n230#2,5:2691\n230#2,5:2696\n230#2,5:2701\n230#2,5:2944\n230#2,5:2957\n230#2,5:2966\n230#2,5:2982\n230#2,5:2987\n230#2,5:2992\n230#2,3:2997\n233#2,2:3003\n1#3:2480\n1#3:2916\n1#3:2929\n295#4,2:2554\n1573#4:2608\n1604#4,4:2609\n774#4:2613\n865#4,2:2614\n1869#4,2:2706\n1878#4,2:2708\n1878#4,2:2710\n295#4,2:2712\n1880#4:2714\n1880#4:2715\n1869#4:2716\n295#4,2:2717\n1870#4:2719\n1563#4:2720\n1634#4,3:2721\n1563#4:2724\n1634#4,3:2725\n1563#4:2728\n1634#4,3:2729\n1869#4:2732\n1869#4,2:2733\n1870#4:2735\n1563#4:2736\n1634#4,3:2737\n1563#4:2740\n1634#4,3:2741\n295#4,2:2744\n295#4,2:2746\n2746#4,3:2748\n2746#4,3:2751\n1761#4,2:2754\n1761#4,3:2756\n1763#4:2759\n1563#4:2760\n1634#4,3:2761\n774#4:2764\n865#4,2:2765\n1563#4:2767\n1634#4,3:2768\n774#4:2771\n865#4,2:2772\n1563#4:2774\n1634#4,3:2775\n1374#4:2778\n1460#4,5:2779\n1374#4:2784\n1460#4,5:2785\n1573#4:2790\n1604#4,4:2791\n774#4:2795\n865#4,2:2796\n1374#4:2798\n1460#4,2:2799\n1563#4:2801\n1634#4,3:2802\n1462#4,3:2805\n1669#4,8:2808\n1374#4:2816\n1460#4,2:2817\n774#4:2819\n865#4,2:2820\n1563#4:2822\n1634#4,3:2823\n1462#4,3:2826\n1669#4,8:2829\n1374#4:2837\n1460#4,2:2838\n774#4:2840\n865#4,2:2841\n1563#4:2843\n1634#4,3:2844\n1462#4,3:2847\n1669#4,8:2850\n1374#4:2858\n1460#4,2:2859\n1374#4:2861\n1460#4,5:2862\n1462#4,3:2867\n1669#4,8:2870\n1374#4:2878\n1460#4,2:2879\n1374#4:2881\n1460#4,5:2882\n1462#4,3:2887\n1669#4,8:2890\n1573#4:2898\n1604#4,4:2899\n1583#4,11:2903\n1878#4,2:2914\n1880#4:2917\n1594#4:2918\n1617#4,9:2919\n1869#4:2928\n1870#4:2930\n1626#4:2931\n774#4:2932\n865#4,2:2933\n1563#4:2935\n1634#4,3:2936\n774#4:2939\n865#4,2:2940\n295#4,2:2942\n774#4:2949\n865#4,2:2950\n1869#4,2:2952\n774#4:2954\n865#4,2:2955\n1563#4:2962\n1634#4,3:2963\n1563#4:2971\n1634#4,3:2972\n774#4:2975\n865#4,2:2976\n1563#4:2978\n1634#4,3:2979\n827#4:3000\n855#4,2:3001\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel\n*L\n83#1:2475,5\n101#1:2481,5\n181#1:2486,5\n184#1:2491,5\n202#1:2496,5\n209#1:2501,5\n222#1:2506,5\n246#1:2511,5\n252#1:2516,5\n280#1:2521,5\n289#1:2526,5\n292#1:2531,5\n297#1:2536,5\n301#1:2541,5\n308#1:2546,5\n315#1:2551,3\n315#1:2556,2\n333#1:2558,5\n343#1:2563,5\n346#1:2568,5\n357#1:2573,5\n368#1:2578,5\n391#1:2583,5\n403#1:2588,5\n422#1:2593,5\n433#1:2598,5\n858#1:2603,5\n953#1:2616,5\n1002#1:2621,5\n1054#1:2626,5\n1063#1:2631,5\n1128#1:2636,5\n1192#1:2641,5\n1221#1:2646,5\n1249#1:2651,5\n1265#1:2656,5\n1325#1:2661,5\n1350#1:2666,5\n1383#1:2671,5\n1388#1:2676,5\n1445#1:2681,5\n1452#1:2686,5\n1454#1:2691,5\n1462#1:2696,5\n1555#1:2701,5\n2175#1:2944,5\n2277#1:2957,5\n1297#1:2966,5\n1308#1:2982,5\n2228#1:2987,5\n2253#1:2992,5\n2266#1:2997,3\n2266#1:3003,2\n1987#1:2916\n2010#1:2929\n316#1:2554,2\n925#1:2608\n925#1:2609,4\n941#1:2613\n941#1:2614,2\n1607#1:2706,2\n1621#1:2708,2\n1622#1:2710,2\n1626#1:2712,2\n1622#1:2714\n1621#1:2715\n1642#1:2716\n1651#1:2717,2\n1642#1:2719\n1678#1:2720\n1678#1:2721,3\n1698#1:2724\n1698#1:2725,3\n1710#1:2728\n1710#1:2729,3\n1748#1:2732\n1750#1:2733,2\n1748#1:2735\n1757#1:2736\n1757#1:2737,3\n1759#1:2740\n1759#1:2741,3\n1765#1:2744,2\n1774#1:2746,2\n1808#1:2748,3\n1822#1:2751,3\n1883#1:2754,2\n1889#1:2756,3\n1883#1:2759\n1900#1:2760\n1900#1:2761,3\n1907#1:2764\n1907#1:2765,2\n1908#1:2767\n1908#1:2768,3\n1910#1:2771\n1910#1:2772,2\n1911#1:2774\n1911#1:2775,3\n1912#1:2778\n1912#1:2779,5\n1914#1:2784\n1914#1:2785,5\n1915#1:2790\n1915#1:2791,4\n1920#1:2795\n1920#1:2796,2\n1923#1:2798\n1923#1:2799,2\n1924#1:2801\n1924#1:2802,3\n1923#1:2805,3\n1931#1:2808,8\n1933#1:2816\n1933#1:2817,2\n1935#1:2819\n1935#1:2820,2\n1936#1:2822\n1936#1:2823,3\n1933#1:2826,3\n1938#1:2829,8\n1940#1:2837\n1940#1:2838,2\n1942#1:2840\n1942#1:2841,2\n1943#1:2843\n1943#1:2844,3\n1940#1:2847,3\n1945#1:2850,8\n1947#1:2858\n1947#1:2859,2\n1948#1:2861\n1948#1:2862,5\n1947#1:2867,3\n1950#1:2870,8\n1952#1:2878\n1952#1:2879,2\n1953#1:2881\n1953#1:2882,5\n1952#1:2887,3\n1955#1:2890,8\n1956#1:2898\n1956#1:2899,4\n1987#1:2903,11\n1987#1:2914,2\n1987#1:2917\n1987#1:2918\n2010#1:2919,9\n2010#1:2928\n2010#1:2930\n2010#1:2931\n2033#1:2932\n2033#1:2933,2\n2034#1:2935\n2034#1:2936,3\n2073#1:2939\n2073#1:2940,2\n2076#1:2942,2\n2209#1:2949\n2209#1:2950,2\n2210#1:2952,2\n2211#1:2954\n2211#1:2955,2\n1286#1:2962\n1286#1:2963,3\n1306#1:2971\n1306#1:2972,3\n1307#1:2975\n1307#1:2976,2\n1307#1:2978\n1307#1:2979,3\n2267#1:3000\n2267#1:3001,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeDetailNewViewModel extends AndroidViewModel {

    /* renamed from: a */
    public final C4492a f6872a;

    /* renamed from: b */
    public final C6268a f6873b;

    /* renamed from: c */
    public C4784d4 f6874c;

    /* renamed from: d */
    public boolean f6875d;

    /* renamed from: e */
    public final C5946n0 f6876e;

    /* renamed from: f */
    public final C5901a0 f6877f;

    /* renamed from: g */
    public final C5873b f6878g;

    /* renamed from: h */
    public final C5904c f6879h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel(@NotNull Application application) {
        super(application);
        AbstractC5830k.m5330g(application, "application");
        this.f6872a = new C4492a(0);
        this.f6873b = new C6268a(10);
        this.f6875d = true;
        MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode = MistakeDetailNewContract$EntryMode.NORMAL;
        ReviewContract$PracticeScene reviewContract$PracticeScene = ReviewContract$PracticeScene.RECOMMEND;
        EmptyList emptyList = EmptyList.INSTANCE;
        MistakeDetailNewContract$AnswerResult mistakeDetailNewContract$AnswerResult = MistakeDetailNewContract$AnswerResult.NONE;
        MistakeDetailNewContract$DetailTab mistakeDetailNewContract$DetailTab = MistakeDetailNewContract$DetailTab.MY_ANSWER;
        C4843n3 c4843n3 = new C4843n3();
        C4825k3 c4825k3 = new C4825k3(0L, null, null, false, 127);
        C4858q0 c4858q0 = new C4858q0((String) null, (List) null, (List) null, (List) null, 31);
        EmptySet emptySet = EmptySet.INSTANCE;
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C4837m3(0, 0, 0L, mistakeDetailNewContract$EntryMode, "", "", reviewContract$PracticeScene, null, "", "", "", "", emptyList, emptyList, emptyList, false, false, false, emptyList, mistakeDetailNewContract$AnswerResult, false, false, false, null, false, false, false, false, true, mistakeDetailNewContract$DetailTab, emptyList, null, null, c4843n3, c4825k3, c4858q0, false, false, false, null, false, false, 0, emptyList, 0, false, emptyList, emptySet, emptySet, emptySet, false, false, false, false, "", "", false, null, false, false, false, false, false, new C4831l3(0, 0, 0, 0, 0, 0), 0));
        this.f6876e = c5946n0M5546b;
        this.f6877f = new C5901a0(c5946n0M5546b);
        C5873b c5873bM5511a = AbstractC5882k.m5511a(0, 7, null);
        this.f6878g = c5873bM5511a;
        this.f6879h = AbstractC5914h.m5556l(c5873bM5511a);
    }

    /* renamed from: A */
    public static MistakeDetail m4105A(List list) {
        Object next;
        if (list.isEmpty()) {
            return new MistakeDetail();
        }
        MistakeDetail mistakeDetail = (MistakeDetail) list.get(0);
        ArrayList<MistakeDetail.AnswerListBean> arrayList = new ArrayList<>();
        int i = 0;
        for (Object obj : list) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            MistakeDetail mistakeDetail2 = (MistakeDetail) obj;
            ArrayList<MistakeDetail.AnswerListBean> answerInfos = mistakeDetail2.getAnswerInfos();
            int size = answerInfos.size();
            int i9 = 0;
            int i10 = 0;
            while (i10 < size) {
                MistakeDetail.AnswerListBean answerListBean = answerInfos.get(i10);
                i10++;
                int i11 = i9 + 1;
                if (i9 < 0) {
                    AbstractC5806u.m5258L();
                    throw null;
                }
                MistakeDetail.AnswerListBean answerListBean2 = answerListBean;
                answerListBean2.setItemType(mistakeDetail2.getItemType());
                answerListBean2.setParentRevisingAnswerd(Boolean.valueOf(mistakeDetail2.getRevisingAnswerd()));
                Iterator<T> it = mistakeDetail2.getLastRoundRevisingRecords().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC5830k.m5325b(((MistakeDetail.RevisingRecord) next).getUuid(), answerListBean2.getUuid())) {
                        break;
                    }
                }
                answerListBean2.setLastRoundRevisingRecord((MistakeDetail.RevisingRecord) next);
                int number = mistakeDetail2.getNumber();
                Integer numValueOf = Integer.valueOf(number);
                if (number <= 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : i8;
                int number2 = answerListBean2.getNumber();
                Integer numValueOf2 = Integer.valueOf(number2);
                if (number2 <= 0) {
                    numValueOf2 = null;
                }
                answerListBean2.setIndex(mistakeDetail2.getAnswerInfos().size() > 1 ? iIntValue + "." + (numValueOf2 != null ? numValueOf2.intValue() : i11) : String.valueOf(iIntValue));
                arrayList.add(answerListBean2);
                i9 = i11;
            }
            i = i8;
        }
        mistakeDetail.setAnswerInfos(arrayList);
        return mistakeDetail;
    }

    /* renamed from: E */
    public static boolean m4106E(Throwable th) {
        if (th instanceof CollectionLimitException) {
            return true;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return AbstractC5855p.m5372F(message, "单错题集最多包含 100 道错题，请取消后重试", false);
    }

    /* renamed from: F */
    public static boolean m4107F(C4837m3 c4837m3) {
        return c4837m3.f7185z || c4837m3.f7153d == MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND;
    }

    /* renamed from: R */
    public static MistakeDetail.AnswerListBean m4109R(MistakeDetail mistakeDetail) {
        MistakeDetail.AnswerListBean answerListBean;
        ArrayList<MistakeDetail.AnswerListBean> answerInfos = mistakeDetail.getAnswerInfos();
        int size = answerInfos.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                answerListBean = null;
                break;
            }
            answerListBean = answerInfos.get(i);
            i++;
            if (answerListBean.getResult() != 1) {
                break;
            }
        }
        MistakeDetail.AnswerListBean answerListBean2 = answerListBean;
        return answerListBean2 == null ? (MistakeDetail.AnswerListBean) AbstractC5805t.m5229i0(mistakeDetail.getAnswerInfos()) : answerListBean2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    public static boolean m4110V(int i, List list) {
        if (i != QuestionType.TYPE_SINGLE.getType() && i != QuestionType.TYPE_CLOZE.getType() && i != QuestionType.TYPE_MULTIPLE.getType() && i != QuestionType.TYPE_LISTEN.getType() && i != QuestionType.TYPE_SEVEN_CHOICES_FIVE.getType() && i != QuestionType.TYPE_JUDGE.getType()) {
            if (i == QuestionType.TYPE_COMPREHENSION.getType() && (list == null || !list.isEmpty())) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MistakeDetail.AnswerListBean answerListBean = (MistakeDetail.AnswerListBean) it.next();
                    List<String> listM5287z = AbstractC5806u.m5287z(AbstractC5805t.m5229i0(answerListBean.getExamAnswers()), AbstractC5805t.m5229i0(answerListBean.getExamComments()), AbstractC5805t.m5229i0(answerListBean.getRevisingAnswers()), AbstractC5805t.m5229i0(answerListBean.getRevisingComments()));
                    if (listM5287z == null || !listM5287z.isEmpty()) {
                        for (String str : listM5287z) {
                            if (str == null || str.length() != 1 || !AbstractC5802q.m5209v(AbstractC5099d.f8033d, str)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.zykj.mistake.feature.notebook.detail.C4846o0 m4111Z(com.zykj.mistake.entity.resp.MistakeDetail.AnswerListBean r14, com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$AnswerDisplayType r15, boolean r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4111Z(com.zykj.mistake.entity.resp.MistakeDetail$AnswerListBean, com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$AnswerDisplayType, boolean, java.lang.String):com.zykj.mistake.feature.notebook.detail.o0"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:1625
    }

    /* renamed from: a */
    public static final void m4112a(MistakeDetailNewViewModel mistakeDetailNewViewModel, C5005m c5005m) throws Throwable {
        C5005m c5005m2 = c5005m;
        mistakeDetailNewViewModel.getClass();
        List list = c5005m2.f7693c;
        C6386e c6386e = (C6386e) AbstractC5805t.m5229i0(list);
        if (c6386e == null) {
            return;
        }
        C5946n0 c5946n0 = mistakeDetailNewViewModel.f6876e;
        while (true) {
            Object value = c5946n0.getValue();
            List list2 = list;
            C4837m3 c4837m3 = (C4837m3) value;
            String str = c5005m2.f7691a;
            String str2 = c5005m2.f7692b;
            ReviewContract$PracticeScene reviewContract$PracticeScene = c5005m2.f7694d;
            C5009q c5009q = C5009q.f7711a;
            C4831l3 c4831l3M4119d0 = m4119d0(C5009q.m4326f(str));
            EmptySet emptySet = EmptySet.INSTANCE;
            C5946n0 c5946n02 = c5946n0;
            int i = c6386e.f10467a;
            long j7 = c6386e.f10468b;
            EmptyList emptyList = EmptyList.INSTANCE;
            C6386e c6386e2 = c6386e;
            if (c5946n02.m5569i(value, C4837m3.m4207a(c4837m3, 0, i, j7, null, str, str2, reviewContract$PracticeScene, null, "", "", "", "", emptyList, emptyList, emptyList, c6386e.f10473g, c6386e.f10474h, false, emptyList, MistakeDetailNewContract$AnswerResult.NONE, false, false, false, null, false, false, false, false, false, MistakeDetailNewContract$DetailTab.MY_ANSWER, emptyList, null, null, new C4843n3(), new C4825k3(0L, null, null, c4837m3.f7129I.f7082f, 95), new C4858q0((String) null, (List) null, (List) null, (List) null, 31), false, false, false, null, false, false, 0, list2, 0, false, null, emptySet, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, c4831l3M4119d0, 0, 333447305, 401041376, 0))) {
                mistakeDetailNewViewModel.m4138K(c6386e2.f10467a, c6386e2.f10473g, c6386e2.f10474h, true);
                return;
            }
            c5005m2 = c5005m;
            c5946n0 = c5946n02;
            list = list2;
            c6386e = c6386e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[PHI: r4
      0x0045: PHI (r4v7 java.lang.String) = (r4v3 java.lang.String), (r4v4 java.lang.String), (r4v10 java.lang.String) binds: [B:15:0x002d, B:24:0x0044, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.zykj.mistake.feature.notebook.detail.C4819j3 m4113a0(com.zykj.mistake.entity.resp.MistakeDetail.QstMicroLessonBean r7, java.lang.Integer r8, java.lang.Integer r9) {
        /*
            com.zykj.mistake.feature.notebook.detail.j3 r0 = new com.zykj.mistake.feature.notebook.detail.j3
            java.lang.String r1 = r7.getName()
            java.lang.String r2 = r7.getSnapshot()
            java.lang.String r3 = r7.getAddress()
            java.lang.String r4 = r7.getCreationTime()
            r5 = 0
            if (r4 == 0) goto L1f
            boolean r6 = kotlin.text.AbstractC5855p.m5382P(r4)
            if (r6 != 0) goto L1c
            goto L1d
        L1c:
            r4 = r5
        L1d:
            if (r4 != 0) goto L45
        L1f:
            java.lang.String r4 = r7.getCreateTime()
            if (r4 == 0) goto L2c
            boolean r6 = kotlin.text.AbstractC5855p.m5382P(r4)
            if (r6 != 0) goto L2c
            goto L2d
        L2c:
            r4 = r5
        L2d:
            if (r4 != 0) goto L45
            java.lang.String r7 = r7.getTime()
            if (r7 == 0) goto L3c
            boolean r4 = kotlin.text.AbstractC5855p.m5382P(r7)
            if (r4 != 0) goto L3c
            r5 = r7
        L3c:
            if (r5 != 0) goto L44
            java.lang.String r7 = ""
        L40:
            r4 = r7
            r5 = r8
            r6 = r9
            goto L5a
        L44:
            r4 = r5
        L45:
            java.lang.String r7 = "T"
            java.lang.String r7 = kotlin.text.AbstractC5855p.m5399g0(r4, r7)
            java.lang.String r4 = " "
            java.lang.String r7 = kotlin.text.AbstractC5855p.m5399g0(r7, r4)
            java.lang.String r4 = "-"
            java.lang.String r5 = "."
            java.lang.String r7 = kotlin.text.AbstractC5862w.m5407A(r7, r4, r5)
            goto L40
        L5a:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4113a0(com.zykj.mistake.entity.resp.MistakeDetail$QstMicroLessonBean, java.lang.Integer, java.lang.Integer):com.zykj.mistake.feature.notebook.detail.j3"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:3203
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0118, code lost:
    
        if (kotlinx.coroutines.AbstractC6014x.m5626F(r0, r1, r2) == r9) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4114b(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r14, java.lang.String r15, java.lang.String r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4114b(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:3417
    }

    /* renamed from: b0 */
    public static C6386e m4115b0(C4824k2 c4824k2) {
        String str = c4824k2.f7063e;
        String str2 = str == null ? "" : str;
        int i = c4824k2.f7060b;
        long j7 = c4824k2.f7061c;
        String str3 = c4824k2.f7062d;
        String str4 = str3 == null ? "" : str3;
        String str5 = c4824k2.f7064f;
        if (str5 == null) {
            str5 = "";
        }
        if (AbstractC5855p.m5382P(str5)) {
            str5 = c4824k2.f7072n == MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND ? "" : str2;
        }
        String str6 = str5;
        String str7 = c4824k2.f7065g;
        return new C6386e(i, j7, str4, str2, str6, str7 == null ? "" : str7, c4824k2.f7067i, c4824k2.f7068j, c4824k2.f7066h, c4824k2.f7069k, 512);
    }

    /* renamed from: c */
    public static final InterfaceC5090c m4116c(MistakeDetailNewViewModel mistakeDetailNewViewModel) {
        mistakeDetailNewViewModel.getClass();
        return C5088a.f7986a.m4382c();
    }

    /* renamed from: c0 */
    public static ArrayList m4117c0(MistakeDetail.QstAnswerBean qstAnswerBean) {
        String fullname = qstAnswerBean.getFullname();
        if (AbstractC5855p.m5382P(fullname)) {
            fullname = qstAnswerBean.getUserName();
        }
        ArrayList<String> answers = qstAnswerBean.getAnswers();
        ArrayList arrayList = new ArrayList();
        int size = answers.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            String str = answers.get(i8);
            i8++;
            int i9 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            String str2 = str;
            C4849o3 c4849o3 = AbstractC5855p.m5382P(str2) ? null : new C4849o3(fullname, str2, (String) AbstractC5805t.m5230j0(i, qstAnswerBean.getComments()));
            if (c4849o3 != null) {
                arrayList.add(c4849o3);
            }
            i = i9;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4118d(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$resolveCurrentDraftSync$1
            if (r0 == 0) goto L16
            r0 = r7
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$resolveCurrentDraftSync$1 r0 = (com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$resolveCurrentDraftSync$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$resolveCurrentDraftSync$1 r0 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$resolveCurrentDraftSync$1
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r1 = r0.L$1
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC5774b.m5119b(r7)
            goto L8b
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            int r2 = r0.I$0
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.AbstractC5774b.m5119b(r7)
            goto L66
        L48:
            kotlin.AbstractC5774b.m5119b(r7)
            kotlinx.coroutines.flow.n0 r7 = r6.f6876e
            java.lang.Object r7 = r7.getValue()
            com.zykj.mistake.feature.notebook.detail.m3 r7 = (com.zykj.mistake.feature.notebook.detail.C4837m3) r7
            int r2 = r7.f7149b
            java.lang.String r7 = m4128v(r2)
            r0.L$0 = r3
            r0.I$0 = r2
            r0.label = r5
            java.lang.Object r7 = m4129x(r7, r0)
            if (r7 != r1) goto L66
            goto L88
        L66:
            java.io.File r7 = (java.io.File) r7
            if (r7 != 0) goto L71
            com.zykj.mistake.feature.notebook.detail.d4 r6 = r6.f6874c
            if (r6 == 0) goto L9d
            com.zykj.mistake.feature.notebook.detail.e4 r6 = com.zykj.mistake.feature.notebook.detail.C4790e4.f6980a
            return r6
        L71:
            r0.L$0 = r3
            r0.L$1 = r7
            r0.I$0 = r2
            r0.label = r4
            g7.e r4 = kotlinx.coroutines.AbstractC5896f0.f9343a
            g7.d r4 = p068g7.ExecutorC5608d.f8730a
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$toDraftSignature$2 r5 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$toDraftSignature$2
            r5.<init>(r7, r2, r3)
            java.lang.Object r0 = kotlinx.coroutines.AbstractC6014x.m5626F(r4, r5, r0)
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r7 = r0
        L8b:
            com.zykj.mistake.feature.notebook.detail.d4 r7 = (com.zykj.mistake.feature.notebook.detail.C4784d4) r7
            if (r7 != 0) goto L95
            com.zykj.mistake.feature.notebook.detail.g4 r6 = new com.zykj.mistake.feature.notebook.detail.g4
            r6.<init>(r1)
            return r6
        L95:
            com.zykj.mistake.feature.notebook.detail.d4 r6 = r6.f6874c
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto La0
        L9d:
            com.zykj.mistake.feature.notebook.detail.f4 r6 = com.zykj.mistake.feature.notebook.detail.C4796f4.f6992a
            return r6
        La0:
            com.zykj.mistake.feature.notebook.detail.g4 r6 = new com.zykj.mistake.feature.notebook.detail.g4
            r6.<init>(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4118d(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:4438
    }

    /* renamed from: d0 */
    public static C4831l3 m4119d0(C5007o c5007o) {
        return new C4831l3(c5007o.f7704a, c5007o.f7705b, c5007o.f7706c, c5007o.f7707d, c5007o.f7708e, c5007o.f7709f);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4120e(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4120e(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:4836
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (kotlinx.coroutines.AbstractC6014x.m5626F(p068g7.ExecutorC5608d.f8730a, new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$setDraft$2(r14, r2, "", null), r6) == r7) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4121f(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r14, com.zykj.mistake.feature.notebook.detail.AbstractC4808h4 r15, kotlin.coroutines.jvm.internal.ContinuationImpl r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4121f(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel, com.zykj.mistake.feature.notebook.detail.h4, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:5405
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4122g(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel r75, com.zykj.mistake.data.C4494c r76, int r77, kotlin.coroutines.jvm.internal.ContinuationImpl r78) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4122g(com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel, com.zykj.mistake.data.c, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:6020
    }

    /* renamed from: h */
    public static C4846o0 m4123h(MistakeDetail mistakeDetail, String str, String str2) {
        MistakeDetail.AnswerListBean answerListBean;
        ArrayList<MistakeDetail.AnswerListBean> answerInfos = mistakeDetail.getAnswerInfos();
        int size = answerInfos.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                answerListBean = null;
                break;
            }
            answerListBean = answerInfos.get(i);
            i++;
            MistakeDetail.AnswerListBean answerListBean2 = answerListBean;
            if (str == null || str.equals(answerListBean2.getUuid())) {
                break;
            }
        }
        MistakeDetail.AnswerListBean answerListBean3 = answerListBean;
        if (answerListBean3 != null) {
            return m4111Z(answerListBean3, MistakeDetailNewContract$AnswerDisplayType.IMAGE, false, str2);
        }
        return null;
    }

    /* renamed from: h0 */
    public static void m4124h0(MistakeDetailNewViewModel mistakeDetailNewViewModel, int i, MistakeDetail mistakeDetail, List list, int i8) {
        if ((i8 & 4) != 0) {
            EmptyList emptyList = EmptyList.INSTANCE;
        }
    }

    /* renamed from: m */
    public static List m4125m(MistakeDetail mistakeDetail, InterfaceC6471c interfaceC6471c) {
        ListBuilder listBuilderM5278q = AbstractC5806u.m5278q();
        if (mistakeDetail.getItemType() == 0) {
            MistakeDetail.AnswerListBean answerListBean = (MistakeDetail.AnswerListBean) AbstractC5805t.m5229i0(mistakeDetail.getAnswerInfos());
            if (answerListBean != null) {
                listBuilderM5278q.addAll((Collection) interfaceC6471c.invoke(answerListBean));
            }
        } else {
            ArrayList<MistakeDetail.AnswerListBean> answerInfos = mistakeDetail.getAnswerInfos();
            int size = answerInfos.size();
            int i = 0;
            while (i < size) {
                MistakeDetail.AnswerListBean answerListBean2 = answerInfos.get(i);
                i++;
                String str = (String) AbstractC5805t.m5229i0((List) interfaceC6471c.invoke(answerListBean2));
                if (str != null && str.length() != 0 && AbstractC5855p.m5372F(str, "http", false)) {
                    listBuilderM5278q.add(str);
                }
            }
        }
        return listBuilderM5278q.build();
    }

    /* renamed from: s */
    public static void m4126s(MistakeDetailNewViewModel mistakeDetailNewViewModel, String str) {
        mistakeDetailNewViewModel.getClass();
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(mistakeDetailNewViewModel), null, null, new MistakeDetailNewViewModel$createOrEditCustomTag$1(mistakeDetailNewViewModel, str, 0L, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List m4127u(com.zykj.mistake.entity.resp.MistakeDetail.AnswerListBean r4) {
        /*
            java.lang.Integer r0 = r4.getTaskState()
            r1 = 0
            if (r0 == 0) goto Lc
            int r0 = r0.intValue()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r2 = 3
            if (r0 == r2) goto L15
            java.util.ArrayList r4 = r4.getRevisingAnswers()
            return r4
        L15:
            java.lang.Integer r0 = r4.getOriginResult()
            if (r0 == 0) goto L20
            int r0 = r0.intValue()
            goto L24
        L20:
            int r0 = r4.getResult()
        L24:
            r3 = 2
            if (r0 == r3) goto L38
            java.lang.Integer r0 = r4.getOriginResult()
            if (r0 == 0) goto L32
            int r0 = r0.intValue()
            goto L36
        L32:
            int r0 = r4.getResult()
        L36:
            if (r0 != r2) goto L39
        L38:
            r1 = 1
        L39:
            if (r1 == 0) goto L4c
            java.lang.Boolean r0 = r4.getParentRevisingAnswerd()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.AbstractC5830k.m5325b(r0, r1)
            if (r0 == 0) goto L4c
            java.util.ArrayList r4 = r4.getRevisingAnswers()
            return r4
        L4c:
            int r0 = r4.getResult()
            r1 = 4
            if (r0 != r1) goto L58
            java.util.ArrayList r4 = r4.getRevisingAnswers()
            return r4
        L58:
            com.zykj.mistake.entity.resp.MistakeDetail$RevisingRecord r4 = r4.getLastRoundRevisingRecord()
            if (r4 == 0) goto L63
            java.util.ArrayList r4 = r4.getRevisingAnswers()
            goto L64
        L63:
            r4 = 0
        L64:
            if (r4 != 0) goto L68
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4127u(com.zykj.mistake.entity.resp.MistakeDetail$AnswerListBean):java.util.List"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:7639
    }

    /* renamed from: v */
    public static String m4128v(int i) {
        String str = AbstractC5101f.f8039a;
        return AbstractC5101f.m4464b("DrawBoardDraftData/" + i);
    }

    /* renamed from: x */
    public static Object m4129x(String str, ContinuationImpl continuationImpl) {
        C5609e c5609e = AbstractC5896f0.f9343a;
        return AbstractC6014x.m5626F(ExecutorC5608d.f8730a, new MistakeDetailNewViewModel$findLocalStrokeFile$2(str, null), continuationImpl);
    }

    /* renamed from: z */
    public static List m4130z(MistakeDetail mistakeDetail, InterfaceC6471c interfaceC6471c) {
        MistakeDetail.AnswerListBean answerListBean;
        ArrayList<MistakeDetail.AnswerListBean> answerInfos = mistakeDetail.getAnswerInfos();
        int size = answerInfos.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                answerListBean = null;
                break;
            }
            answerListBean = answerInfos.get(i);
            i++;
            String str = (String) AbstractC5805t.m5229i0((List) interfaceC6471c.invoke(answerListBean));
            if (str != null && AbstractC5855p.m5372F(str, "http", false)) {
                break;
            }
        }
        MistakeDetail.AnswerListBean answerListBean2 = answerListBean;
        List list = answerListBean2 != null ? (List) interfaceC6471c.invoke(answerListBean2) : null;
        return list == null ? EmptyList.INSTANCE : list;
    }

    /* renamed from: B */
    public final String m4131B(int i) {
        String string = getApplication().getString(i);
        AbstractC5830k.m5329f(string, "getString(...)");
        return string;
    }

    /* renamed from: C */
    public final void m4132C() {
        Object value;
        C5946n0 c5946n0 = this.f6876e;
        C4837m3 c4837m3 = (C4837m3) c5946n0.getValue();
        MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode = c4837m3.f7153d;
        String str = c4837m3.f7155e;
        if (mistakeDetailNewContract$EntryMode != MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND) {
            m4143Q(MistakeDetailNewContract$DraftNavigation.BACK);
            return;
        }
        C5009q c5009q = C5009q.f7711a;
        C5007o c5007oM4326f = C5009q.m4326f(str);
        if (C5009q.m4326f(str).f7704a <= 0) {
            m4142O(false);
        } else {
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, true, false, false, m4119d0(c5007oM4326f), 0, -1, 1879048191, 1)));
        }
    }

    /* renamed from: D */
    public final void m4133D() {
        Object value;
        C5946n0 c5946n0 = this.f6876e;
        if (((C4837m3) c5946n0.getValue()).f7135O) {
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -257, 1)));
        } else {
            m4149Y();
            m4140M(true);
        }
    }

    /* renamed from: G */
    public final void m4134G() {
        Object value;
        C5946n0 c5946n0 = this.f6876e;
        C4837m3 c4837m3 = (C4837m3) c5946n0.getValue();
        if (c4837m3.f7149b <= 0 || c4837m3.f7146Z || c4837m3.f7148a0) {
            return;
        }
        do {
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, true, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -1048577, 1)));
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$joinReview$2(this, c4837m3, null), 3);
    }

    /* renamed from: H */
    public final void m4135H() {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$loadCameraPermission$1(this, null), 3);
    }

    /* renamed from: I */
    public final void m4136I() {
        C4837m3 c4837m3 = (C4837m3) this.f6876e.getValue();
        if (c4837m3.f7149b <= 0) {
            return;
        }
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$requestApi$2(false, this, new MistakeDetailNewViewModel$loadJoinableCollections$1(this, null), new C2861i(c4837m3, 12), new C2861i(this, 13), null), 3);
    }

    /* renamed from: J */
    public final C4777c4 m4137J(String str) {
        C5946n0 c5946n0;
        Object value;
        C4837m3 c4837m3;
        C4825k3 c4825k3;
        String str2;
        long jLastModified;
        C5103h c5103h = new C5103h(str, null);
        String strM4469d = c5103h.m4469d();
        if (strM4469d == null || !new File(strM4469d).exists()) {
            strM4469d = null;
        }
        boolean z8 = strM4469d != null && c5103h.m4470e();
        C4777c4 c4777c4 = new C4777c4(z8 ? strM4469d : null, z8);
        do {
            c5946n0 = this.f6876e;
            value = c5946n0.getValue();
            c4837m3 = (C4837m3) value;
            c4825k3 = c4837m3.f7129I;
            str2 = c4777c4.f6942a;
            if (str2 == null) {
                jLastModified = 0;
            } else {
                File file = new File(str2);
                jLastModified = file.exists() ? file.lastModified() : System.currentTimeMillis();
            }
        } while (!c5946n0.m5569i(value, C4837m3.m4207a(c4837m3, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, C4825k3.m4202a(c4825k3, str2, jLastModified, null, false, 115), null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -5, 1)));
        return c4777c4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r0 == null) goto L21;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4138K(final int r11, boolean r12, boolean r13, boolean r14) throws java.lang.Throwable {
        /*
            r10 = this;
            kotlinx.coroutines.flow.n0 r1 = r10.f6876e
            java.lang.Object r3 = r1.getValue()
            com.zykj.mistake.feature.notebook.detail.m3 r3 = (com.zykj.mistake.feature.notebook.detail.C4837m3) r3
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$EntryMode r4 = r3.f7153d
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$EntryMode r5 = com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L65
            java.lang.String r3 = r3.f7155e
            com.zykj.mistake.feature.review.q r4 = com.zykj.mistake.feature.review.C5009q.f7711a
            java.util.LinkedHashMap r4 = com.zykj.mistake.feature.review.C5009q.f7713c
            java.lang.String r0 = com.zykj.mistake.feature.review.C5009q.m4325b(r11, r3)
            java.lang.Object r0 = r4.get(r0)
            com.zykj.mistake.feature.review.l r0 = (com.zykj.mistake.feature.review.C5004l) r0
            if (r0 != 0) goto L23
            goto L51
        L23:
            java.util.List r3 = r0.f7690b
            java.lang.Object r1 = r1.getValue()
            com.zykj.mistake.feature.notebook.detail.m3 r1 = (com.zykj.mistake.feature.notebook.detail.C4837m3) r1
            boolean r1 = r1.f7176q
            if (r1 == 0) goto L36
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L36
            r7 = r3
        L36:
            if (r7 != 0) goto L3a
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.INSTANCE
        L3a:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L45
            com.zykj.mistake.entity.resp.MistakeDetail r0 = m4105A(r7)
            goto L5c
        L45:
            com.zykj.mistake.entity.resp.MistakeDetail r0 = r0.f7689a
            if (r0 != 0) goto L5c
            java.lang.Object r0 = kotlin.collections.AbstractC5805t.m5229i0(r3)
            com.zykj.mistake.entity.resp.MistakeDetail r0 = (com.zykj.mistake.entity.resp.MistakeDetail) r0
            if (r0 != 0) goto L5c
        L51:
            com.zykj.mistake.feature.notebook.detail.j1 r0 = new com.zykj.mistake.feature.notebook.detail.j1
            java.lang.String r1 = "暂无错题详情"
            r0.<init>(r1)
            r10.m4144S(r0)
            return
        L5c:
            boolean r1 = r7.isEmpty()
            r1 = r1 ^ r6
            r10.m4155k(r0, r1, r7)
            return
        L65:
            r1 = 14
            r8 = 3
            if (r12 == 0) goto L8a
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$loadAnswerDetail$1 r3 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$loadAnswerDetail$1
            r3.<init>(r10, r11, r7)
            com.zykj.mistake.feature.notebook.detail.z3 r5 = new com.zykj.mistake.feature.notebook.detail.z3
            r4 = 0
            r5.<init>(r10)
            com.zykj.mistake.feature.collection.component.j r4 = new com.zykj.mistake.feature.collection.component.j
            r4.<init>(r1)
            kotlinx.coroutines.v r9 = android.view.ViewModelKt.getViewModelScope(r10)
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$requestApi$2 r0 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$requestApi$2
            r6 = 0
            r2 = r10
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.AbstractC6014x.m5651v(r9, r7, r7, r0, r8)
            return
        L8a:
            if (r13 == 0) goto Lab
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$loadAnswerDetail$3 r3 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$loadAnswerDetail$3
            r3.<init>(r10, r11, r7)
            com.zykj.mistake.feature.notebook.detail.z3 r5 = new com.zykj.mistake.feature.notebook.detail.z3
            r5.<init>(r10)
            com.zykj.mistake.feature.collection.component.j r4 = new com.zykj.mistake.feature.collection.component.j
            r4.<init>(r1)
            kotlinx.coroutines.v r9 = android.view.ViewModelKt.getViewModelScope(r10)
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$requestApi$2 r0 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$requestApi$2
            r6 = 0
            r2 = r10
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.AbstractC6014x.m5651v(r9, r7, r7, r0, r8)
            return
        Lab:
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$loadAnswerDetail$5 r3 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$loadAnswerDetail$5
            r3.<init>(r10, r11, r7)
            com.zykj.mistake.feature.notebook.detail.z3 r5 = new com.zykj.mistake.feature.notebook.detail.z3
            r4 = 2
            r5.<init>(r10)
            com.zykj.mistake.feature.collection.component.j r4 = new com.zykj.mistake.feature.collection.component.j
            r4.<init>(r1)
            kotlinx.coroutines.v r9 = android.view.ViewModelKt.getViewModelScope(r10)
            com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$requestApi$2 r0 = new com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$requestApi$2
            r6 = 0
            r2 = r10
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.AbstractC6014x.m5651v(r9, r7, r7, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4138K(int, boolean, boolean, boolean):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:9908
    }

    /* renamed from: L */
    public final void m4139L() {
        C4837m3 c4837m3 = (C4837m3) this.f6876e.getValue();
        C4825k3 c4825k3 = c4837m3.f7129I;
        long j7 = c4825k3.f7077a;
        String str = c4825k3.f7078b;
        if (j7 == 0) {
            return;
        }
        String str2 = AbstractC5101f.f8039a;
        String strM4464b = AbstractC5101f.m4464b("DrawBoardData/" + j7);
        if (m4137J(strM4464b).f6943b) {
            m4145T(c4837m3);
        } else if (AbstractC5855p.m5382P(str)) {
            m4145T(c4837m3);
        } else {
            m4144S(C4805h1.f7013a);
            new C5103h(strM4464b, str).m4466a(str, new C2750a(this, c4837m3, 5, strM4464b), new C2827b(this, 9));
        }
    }

    /* renamed from: M */
    public final void m4140M(boolean z8) {
        C4825k3 c4825k3 = ((C4837m3) this.f6876e.getValue()).f7129I;
        long j7 = c4825k3.f7077a;
        String str = c4825k3.f7078b;
        if (j7 == 0) {
            return;
        }
        String str2 = AbstractC5101f.f8039a;
        final String strM4464b = AbstractC5101f.m4464b("DrawBoardData/" + j7);
        m4137J(strM4464b);
        if (z8 || AbstractC5855p.m5382P(str)) {
            return;
        }
        final int i = 0;
        final int i8 = 1;
        new C5103h(strM4464b, str).m4466a(str, new InterfaceC6469a(this) { // from class: com.zykj.mistake.feature.notebook.detail.b4

            /* renamed from: b */
            public final /* synthetic */ MistakeDetailNewViewModel f6925b;

            {
                this.f6925b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        String str3 = strM4464b;
                        MistakeDetailNewViewModel mistakeDetailNewViewModel = this.f6925b;
                        if (!mistakeDetailNewViewModel.m4137J(str3).f6944c) {
                            mistakeDetailNewViewModel.m4144S(new C4817j1(mistakeDetailNewViewModel.m4131B(R.string.tips_data_err)));
                        }
                        break;
                    default:
                        String str4 = strM4464b;
                        MistakeDetailNewViewModel mistakeDetailNewViewModel2 = this.f6925b;
                        if (!mistakeDetailNewViewModel2.m4137J(str4).f6944c) {
                            mistakeDetailNewViewModel2.m4144S(new C4817j1(mistakeDetailNewViewModel2.m4131B(R.string.tips_data_err)));
                        }
                        break;
                }
                return C5443s.f8405a;
            }
        }, new InterfaceC6469a(this) { // from class: com.zykj.mistake.feature.notebook.detail.b4

            /* renamed from: b */
            public final /* synthetic */ MistakeDetailNewViewModel f6925b;

            {
                this.f6925b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        String str3 = strM4464b;
                        MistakeDetailNewViewModel mistakeDetailNewViewModel = this.f6925b;
                        if (!mistakeDetailNewViewModel.m4137J(str3).f6944c) {
                            mistakeDetailNewViewModel.m4144S(new C4817j1(mistakeDetailNewViewModel.m4131B(R.string.tips_data_err)));
                        }
                        break;
                    default:
                        String str4 = strM4464b;
                        MistakeDetailNewViewModel mistakeDetailNewViewModel2 = this.f6925b;
                        if (!mistakeDetailNewViewModel2.m4137J(str4).f6944c) {
                            mistakeDetailNewViewModel2.m4144S(new C4817j1(mistakeDetailNewViewModel2.m4131B(R.string.tips_data_err)));
                        }
                        break;
                }
                return C5443s.f8405a;
            }
        });
    }

    /* renamed from: N */
    public final void m4141N(String str) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$requestApiSilent$1(new MistakeDetailNewViewModel$removePictureNote$1(this, ((C4837m3) this.f6876e.getValue()).f7149b, str, null), new C4909y3(this, str, 0), this, null), 3);
    }

    /* renamed from: O */
    public final void m4142O(boolean z8) {
        Object value;
        C5946n0 c5946n0 = this.f6876e;
        if (((C4837m3) c5946n0.getValue()).f7133M) {
            return;
        }
        this.f6875d = z8;
        boolean zM4107F = m4107F((C4837m3) c5946n0.getValue());
        if (!((C4837m3) c5946n0.getValue()).f7132L && !zM4107F) {
            m4163w(z8);
        } else {
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, MistakeDetailNewContract$DraftNavigation.END_REVIEW, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -129, 1)));
        }
    }

    /* renamed from: Q */
    public final void m4143Q(MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation) {
        Object value;
        C5946n0 c5946n0 = this.f6876e;
        if (((C4837m3) c5946n0.getValue()).f7133M) {
            return;
        }
        boolean zM4107F = m4107F((C4837m3) c5946n0.getValue());
        if (!((C4837m3) c5946n0.getValue()).f7132L && !zM4107F) {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$completeNavigation$1(this, false, mistakeDetailNewContract$DraftNavigation, null), 3);
        } else {
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, mistakeDetailNewContract$DraftNavigation, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -129, 1)));
        }
    }

    /* renamed from: S */
    public final void m4144S(AbstractC4823k1 abstractC4823k1) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$sendEffect$1(this, abstractC4823k1, null), 3);
    }

    /* renamed from: T */
    public final void m4145T(C4837m3 c4837m3) {
        C4825k3 c4825k3 = c4837m3.f7129I;
        C4858q0 c4858q0 = c4837m3.f7130J;
        m4144S(new C4906y0(c4825k3.f7077a, c4825k3.f7082f, c4825k3.f7078b, c4858q0.f7261a, c4858q0.f7262b, c4858q0.f7263c, c4858q0.f7264d));
    }

    /* renamed from: U */
    public final void m4146U(C4889v1 c4889v1) {
        C4837m3 c4837m3 = (C4837m3) this.f6876e.getValue();
        MultiSetTagsReq multiSetTagsReq = new MultiSetTagsReq();
        multiSetTagsReq.setBookId(c4837m3.f7147a);
        multiSetTagsReq.getItemIds().add(Integer.valueOf(c4837m3.f7149b));
        multiSetTagsReq.setDiff(c4889v1.f7356a);
        multiSetTagsReq.setAttainedLevel(c4889v1.f7357b);
        multiSetTagsReq.setErrorReason(c4889v1.f7358c);
        multiSetTagsReq.getTagIdList().addAll(c4889v1.f7359d);
        MistakeDetailNewViewModel$setMistakeTags$1 mistakeDetailNewViewModel$setMistakeTags$1 = new MistakeDetailNewViewModel$setMistakeTags$1(this, multiSetTagsReq, null);
        C2764i c2764i = new C2764i(this, c4889v1, 10, c4837m3);
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$requestApi$2(false, this, mistakeDetailNewViewModel$setMistakeTags$1, new C4564j(14), c2764i, null), 3);
    }

    /* renamed from: W */
    public final void m4147W(ReviewContract$PracticeScene reviewContract$PracticeScene, ReviewContract$PracticePoolType reviewContract$PracticePoolType) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$startInitialReviewPractice$1(this, reviewContract$PracticeScene, reviewContract$PracticePoolType, null), 3);
    }

    /* renamed from: X */
    public final boolean m4148X(int i, boolean z8) throws Throwable {
        C5946n0 c5946n0 = this.f6876e;
        C4837m3 c4837m3 = (C4837m3) c5946n0.getValue();
        int i8 = c4837m3.f7139S;
        List list = c4837m3.f7138R;
        int i9 = i8 + i;
        if (i9 < 0) {
            m4144S(new C4817j1("已是第一题"));
            return false;
        }
        if (i9 >= list.size()) {
            m4144S(new C4817j1("已是最后一题"));
            return false;
        }
        C5100e.m4458b(4, "MistakeDetailSwitch", i < 0 ? "上一题" : "下一题");
        C6386e c6386e = (C6386e) list.get(i9);
        boolean z9 = c4837m3.f7185z;
        while (true) {
            Object value = c5946n0.getValue();
            boolean z10 = z9;
            C4837m3 c4837m32 = (C4837m3) value;
            EmptySet emptySet = EmptySet.INSTANCE;
            int i10 = c6386e.f10467a;
            long j7 = c6386e.f10468b;
            String str = c6386e.f10469c;
            String str2 = c6386e.f10470d;
            String str3 = c6386e.f10471e;
            if (AbstractC5855p.m5382P(str3)) {
                str3 = c4837m3.f7153d == MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND ? "" : c6386e.f10470d;
            }
            String str4 = str3;
            String str5 = c6386e.f10472f;
            EmptyList emptyList = EmptyList.INSTANCE;
            C4837m3 c4837m33 = c4837m3;
            boolean z11 = !z10;
            int i11 = i9;
            if (c5946n0.m5569i(value, C4837m3.m4207a(c4837m32, 0, i10, j7, null, null, null, null, null, str, str2, str4, str5, emptyList, emptyList, emptyList, c6386e.f10473g, c6386e.f10474h, false, c6386e.f10477k, MistakeDetailNewContract$AnswerResult.NONE, false, false, false, null, false, false, z11, z11, false, MistakeDetailNewContract$DetailTab.MY_ANSWER, emptyList, null, null, new C4843n3(), new C4825k3(0L, null, null, c4837m32.f7129I.f7082f, 95), new C4858q0((String) null, (List) null, (List) null, (List) null, 31), false, false, false, null, false, false, 0, null, i11, false, null, emptySet, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, 333447417, -1609760, 1))) {
                m4138K(c6386e.f10467a, c6386e.f10473g, c6386e.f10474h, z8);
                return true;
            }
            z9 = z10;
            i9 = i11;
            c4837m3 = c4837m33;
        }
    }

    /* renamed from: Y */
    public final void m4149Y() {
        boolean z8;
        C5946n0 c5946n0 = this.f6876e;
        if (((C4837m3) c5946n0.getValue()).f7153d == MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND) {
            return;
        }
        boolean zM4453c = AbstractC5099d.m4453c(getApplication(), "SP_CONTACT_MODE", false);
        while (true) {
            Object value = c5946n0.getValue();
            C4837m3 c4837m3M4207a = (C4837m3) value;
            if (c4837m3M4207a.f7185z == zM4453c) {
                z8 = zM4453c;
            } else {
                boolean z9 = !zM4453c;
                z8 = zM4453c;
                c4837m3M4207a = C4837m3.m4207a(c4837m3M4207a, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, MistakeDetailNewContract$AnswerResult.NONE, false, false, false, null, false, z8, z9, z9, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -236453889, -1, 1);
            }
            if (c5946n0.m5569i(value, c4837m3M4207a)) {
                return;
            } else {
                zM4453c = z8;
            }
        }
    }

    /* renamed from: e0 */
    public final ArrayList m4150e0(InterfaceC6471c interfaceC6471c) {
        C4837m3 c4837m3 = (C4837m3) this.f6876e.getValue();
        List list = c4837m3.f7138R;
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            C6386e c6386e = (C6386e) obj;
            if (i == c4837m3.f7139S) {
                c6386e = (C6386e) interfaceC6471c.invoke(c6386e);
            }
            arrayList.add(c6386e);
            i = i8;
        }
        return arrayList;
    }

    /* renamed from: f0 */
    public final void m4151f0(int i, String str) {
        if (str == null || AbstractC5855p.m5382P(str)) {
            this.f6874c = null;
        } else {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$updateDraftBaselineAfterDetail$1(this, i, null), 3);
        }
    }

    /* renamed from: g0 */
    public final void m4152g0(List list) {
        MistakeDetailNewViewModel mistakeDetailNewViewModel = this;
        C5946n0 c5946n0 = mistakeDetailNewViewModel.f6876e;
        long j7 = ((C4837m3) c5946n0.getValue()).f7149b;
        List list2 = ((C4837m3) c5946n0.getValue()).f7129I.f7081e;
        List listM5245y0 = AbstractC5805t.m5245y0(((C4837m3) c5946n0.getValue()).f7129I.f7083g, list);
        while (true) {
            Object value = c5946n0.getValue();
            C4837m3 c4837m3 = (C4837m3) value;
            if (c5946n0.m5569i(value, C4837m3.m4207a(c4837m3, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, C4825k3.m4202a(c4837m3.f7129I, null, 0L, listM5245y0, false, 111), null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -5, 1))) {
                AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(mistakeDetailNewViewModel), null, null, new MistakeDetailNewViewModel$updatePictureNotes$2(mistakeDetailNewViewModel, j7, listM5245y0, list2, null), 3);
                return;
            }
            mistakeDetailNewViewModel = this;
        }
    }

    /* renamed from: i */
    public final void m4153i(String str) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$requestApiSilent$1(new MistakeDetailNewViewModel$addPictureNote$1(this, ((C4837m3) this.f6876e.getValue()).f7149b, str, null), new C4909y3(this, str, 1), this, null), 3);
    }

    /* renamed from: j */
    public final void m4154j(MistakeDetailNewContract$AnswerResult mistakeDetailNewContract$AnswerResult, C4831l3 c4831l3, boolean z8, boolean z9) {
        C5946n0 c5946n0;
        Object value;
        C4837m3 c4837m3;
        do {
            c5946n0 = this.f6876e;
            value = c5946n0.getValue();
            c4837m3 = (C4837m3) value;
        } while (!c5946n0.m5569i(value, C4837m3.m4207a(c4837m3, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, mistakeDetailNewContract$AnswerResult, z9, c4837m3.f7181v || z8, false, null, false, false, true, true, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, c4831l3, 0, -204996609, Integer.MAX_VALUE, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0da8  */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.Object] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4155k(com.zykj.mistake.entity.resp.MistakeDetail r96, boolean r97, java.util.List r98) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4155k(com.zykj.mistake.entity.resp.MistakeDetail, boolean, java.util.List):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:14073
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa A[SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4156l(final long r76, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.util.List r81) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4156l(long, java.lang.String, java.lang.String, java.lang.String, java.util.List):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:21421
    }

    /* renamed from: n */
    public final void m4157n() {
        C5946n0 c5946n0;
        Object value;
        EmptySet emptySet;
        do {
            c5946n0 = this.f6876e;
            value = c5946n0.getValue();
            emptySet = EmptySet.INSTANCE;
        } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, emptySet, emptySet, false, false, false, false, "", "", false, null, false, false, false, false, false, null, 0, -1, -65478657, 1)));
    }

    /* renamed from: o */
    public final void m4158o() {
        Object value;
        MistakeDetailNewViewModel mistakeDetailNewViewModel = this;
        C5946n0 c5946n0 = mistakeDetailNewViewModel.f6876e;
        C4837m3 c4837m3 = (C4837m3) c5946n0.getValue();
        String string = AbstractC5855p.m5403k0(c4837m3.f7152c0).toString();
        MistakeDetailNewContract$CreateCollectionEntry mistakeDetailNewContract$CreateCollectionEntry = c4837m3.f7158f0;
        if (AbstractC5855p.m5382P(string)) {
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, "请输入错题集名称", false, null, false, false, false, false, false, null, 0, -1, -8388609, 1)));
        } else {
            if (c4837m3.f7149b <= 0) {
                return;
            }
            while (true) {
                Object value2 = c5946n0.getValue();
                if (c5946n0.m5569i(value2, C4837m3.m4207a((C4837m3) value2, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, "", true, null, false, false, false, false, false, null, 0, -1, -25165825, 1))) {
                    AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(mistakeDetailNewViewModel), null, null, new MistakeDetailNewViewModel$confirmCreateCollectionFromJoin$3(mistakeDetailNewViewModel, string, mistakeDetailNewContract$CreateCollectionEntry, c4837m3, null), 3);
                    return;
                }
                mistakeDetailNewViewModel = this;
            }
        }
    }

    /* renamed from: p */
    public final void m4159p() {
        Object value;
        C5946n0 c5946n0 = this.f6876e;
        C4837m3 c4837m3 = (C4837m3) c5946n0.getValue();
        List listM5217D0 = AbstractC5805t.m5217D0(c4837m3.f7144X);
        if (!(listM5217D0.isEmpty() && c4837m3.f7143W.isEmpty()) && c4837m3.f7149b > 0) {
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, true, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -262145, 1)));
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$confirmJoinCollection$2(this, listM5217D0, c4837m3, null), 3);
        }
    }

    /* renamed from: q */
    public final void m4160q() {
        C4837m3 c4837m3 = (C4837m3) this.f6876e.getValue();
        MultiRemoveMistakeReq multiRemoveMistakeReq = new MultiRemoveMistakeReq();
        multiRemoveMistakeReq.setBookId(c4837m3.f7147a);
        multiRemoveMistakeReq.getItemIds().add(Integer.valueOf(c4837m3.f7149b));
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$confirmRemoveMistake$1(this, multiRemoveMistakeReq, c4837m3, null), 3);
    }

    /* renamed from: r */
    public final void m4161r() {
        String str = ((C4837m3) this.f6876e.getValue()).f7155e;
        if (AbstractC5855p.m5382P(str)) {
            return;
        }
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$continueReviewPractice$1(this, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4162t(com.zykj.mistake.feature.notebook.detail.AbstractC4813i3 r81) {
        /*
            Method dump skipped, instructions count: 4453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel.m4162t(com.zykj.mistake.feature.notebook.detail.i3):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel.smali:23882
    }

    /* renamed from: w */
    public final void m4163w(boolean z8) {
        Long l;
        boolean z9;
        boolean z10;
        Object value;
        C5946n0 c5946n0 = this.f6876e;
        C4837m3 c4837m3 = (C4837m3) c5946n0.getValue();
        if (c4837m3.f7168k0) {
            return;
        }
        String str = c4837m3.f7155e;
        Long lM5411E = AbstractC5862w.m5411E(str);
        if (c4837m3.f7162h0 || c4837m3.f7164i0 || c4837m3.f7166j0) {
            l = lM5411E;
            z9 = true;
            z10 = true;
        } else {
            l = lM5411E;
            z10 = true;
            z9 = false;
        }
        boolean z11 = c4837m3.f7181v;
        boolean z12 = (z11 || c4837m3.f7182w) ? z10 : false;
        if (!z8 || l == null) {
            m4164y(str, z9, z12, z11);
            return;
        }
        do {
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, true, null, 0, -1, -1073741825, 1)));
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$endReviewPractice$2(this, l, str, z9, z12, z11, null), 3);
    }

    /* renamed from: y */
    public final void m4164y(String str, boolean z8, boolean z9, boolean z10) {
        C5946n0 c5946n0;
        Object value;
        if (!AbstractC5855p.m5382P(str)) {
            C5009q.f7712b.remove(str);
            AbstractC5810y.m5295W(C5009q.f7713c.keySet(), new C2865d(str, 3));
        }
        do {
            c5946n0 = this.f6876e;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -2013265921, 1)));
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeDetailNewViewModel$finishReviewPracticeLocally$2(z8, z10, this, z9, null), 3);
    }
}
