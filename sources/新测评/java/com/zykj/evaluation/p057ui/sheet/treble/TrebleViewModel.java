package com.zykj.evaluation.p057ui.sheet.treble;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.zykj.evaluation.bean.bundle.AnswerSheetBundle;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.evaluation.upload.OssTaskManger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p200p5.InterfaceC8843j;
import p200p5.InterfaceC8844k;
import p267v6.AbstractC9706w;
import p267v6.C9705v;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m13558d2 = {"Lcom/zykj/evaluation/ui/sheet/treble/TrebleViewModel;", "Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lp5/k;", "configService", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Lp5/j;Lp5/k;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V", "Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;", "answerSheetBundle", "", "H", "(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class TrebleViewModel extends NormalViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrebleViewModel(InterfaceC8843j service, InterfaceC8844k configService, MutableStateFlow userInfo, OssTaskManger ossTaskManger, SubmitTaskManger submitTaskManger, AppDatabase database) {
        super(service, configService, userInfo, ossTaskManger, submitTaskManger, database);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        Intrinsics.checkNotNullParameter(database, "database");
    }

    @Override // com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel, com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: H */
    public boolean mo10180H(AnswerSheetBundle answerSheetBundle) {
        Intrinsics.checkNotNullParameter(answerSheetBundle, "answerSheetBundle");
        if (!super.mo10180H(answerSheetBundle)) {
            return false;
        }
        m10192T(2.1348898f);
        m10188P(C9705v.m16210b(m10202u(), AbstractC9706w.d.f17034a, 0, 2, null));
        return true;
    }
}
