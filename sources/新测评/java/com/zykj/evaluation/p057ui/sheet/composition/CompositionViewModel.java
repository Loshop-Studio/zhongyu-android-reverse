package com.zykj.evaluation.p057ui.sheet.composition;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.bundle.AnswerSheetBundle;
import com.zykj.evaluation.p057ui.sheet.AbstractC6935c;
import com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel;
import com.zykj.evaluation.p057ui.sheet.C6933a;
import com.zykj.evaluation.upload.OssTaskManger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p026b7.C4997c1;
import p267v6.AbstractC9706w;
import p267v6.C9705v;
import p267v6.C9709z;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u0006'"}, m13558d2 = {"Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;", "Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V", "Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;", "answerSheetBundle", "", "H", "(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z", "", "index", "", "q", "(I)V", "Lb7/c1;", "result", "Lkotlin/Function0;", "callback", "G", "(Lb7/c1;Lkotlin/jvm/functions/Function0;)V", "failedCallback", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "Ljava/lang/String;", "d0", "()Ljava/lang/String;", "f0", "(Ljava/lang/String;)V", "mUuid", "s", "c0", "e0", "mPath", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCompositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1563#2:172\n1634#2,3:173\n*S KotlinDebug\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel\n*L\n56#1:172\n56#1:173,3\n*E\n"})
/* loaded from: classes4.dex */
public final class CompositionViewModel extends AnswerSheetViewModel {

    /* renamed from: r, reason: from kotlin metadata */
    public String mUuid;

    /* renamed from: s, reason: from kotlin metadata */
    public String mPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionViewModel(MutableStateFlow userInfo, OssTaskManger ossTaskManger) {
        super(userInfo, ossTaskManger);
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: G */
    public void mo10179G(C4997c1 result, Function0 callback) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new CompositionViewModel$handleSuccessScanned$1(this, result, callback, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: H */
    public boolean mo10180H(AnswerSheetBundle answerSheetBundle) {
        Intrinsics.checkNotNullParameter(answerSheetBundle, "answerSheetBundle");
        if (!super.mo10180H(answerSheetBundle)) {
            return false;
        }
        m10230f0(answerSheetBundle.getUuid());
        m10229e0(answerSheetBundle.getPath());
        m10192T(2.1348898f);
        m10188P(C9705v.m16210b(m10202u(), AbstractC9706w.a.f17031a, 0, 2, null));
        Object[] objArrCopyOf = Arrays.copyOf(getMPicArray(), 3);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        m10191S((String[]) objArrCopyOf);
        C6933a c6933aM10176D = m10176D();
        IntRange intRangeUntil = RangesKt.until(0, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new C9709z(iNextInt, iNextInt == 0 ? AbstractC6935c.a.b.f9962d : AbstractC6935c.c.f9965d));
        }
        m10196X(C6933a.m10208b(c6933aM10176D, null, null, null, null, arrayList, false, 47, null));
        return true;
    }

    /* renamed from: c0 */
    public final String m10227c0() {
        String str = this.mPath;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPath");
        return null;
    }

    /* renamed from: d0 */
    public final String m10228d0() {
        String str = this.mUuid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUuid");
        return null;
    }

    /* renamed from: e0 */
    public final void m10229e0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mPath = str;
    }

    /* renamed from: f0 */
    public final void m10230f0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mUuid = str;
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: q */
    public void mo10199q(int index) {
        m10188P(C9705v.m16210b(m10202u(), null, index, 1, null));
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: r */
    public void mo10200r(Function0 callback, Function0 failedCallback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(failedCallback, "failedCallback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new CompositionViewModel$commit$1(callback, this, null), 31, null);
    }
}
