package com.zykj.view.board.evaluation;

import android.content.Context;
import android.net.Uri;
import android.view.C2764i;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3385e;
import com.zykj.blackboard.proxy.ImageCropView;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"com/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2", "Lcom/zykj/blackboard/proxy/ImageCropView;", "", "imageLocalPath", "Lkotlin/Function1;", "Ld6/s;", "doneCallback", "Lkotlin/Function0;", "cancelCallback", "showCropView", "(Ljava/lang/String;Lr6/c;Lr6/a;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBlackboardEvaluationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1042:1\n1#2:1043\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackboardEvaluationFragment$initBoardConfig$1$2 implements ImageCropView {
    final /* synthetic */ BlackboardEvaluationFragment this$0;

    public BlackboardEvaluationFragment$initBoardConfig$1$2(BlackboardEvaluationFragment blackboardEvaluationFragment) {
        this.this$0 = blackboardEvaluationFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s showCropView$lambda$3(File file, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, Uri uri) {
        String absolutePath;
        if (file != null) {
            AbstractC3385e.m2333e(file);
        }
        if (uri != null) {
            File fileM2317r = AbstractC3382c.m2317r(uri);
            if (fileM2317r == null || (absolutePath = fileM2317r.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            interfaceC6471c.invoke(absolutePath);
        } else {
            interfaceC6469a.invoke();
        }
        return C5443s.f8405a;
    }

    @Override // com.zykj.blackboard.proxy.ImageCropView
    public void showCropView(String imageLocalPath, InterfaceC6471c doneCallback, InterfaceC6469a cancelCallback) throws IOException {
        Uri uriM2302c;
        AbstractC5830k.m5330g(imageLocalPath, "imageLocalPath");
        AbstractC5830k.m5330g(doneCallback, "doneCallback");
        AbstractC5830k.m5330g(cancelCallback, "cancelCallback");
        Context context = this.this$0.getContext();
        if (context == null || AbstractC5855p.m5382P(imageLocalPath)) {
            cancelCallback.invoke();
            return;
        }
        File fileCreateOpaqueCropTempFile = this.this$0.createOpaqueCropTempFile(context, imageLocalPath);
        if (fileCreateOpaqueCropTempFile == null || (uriM2302c = AbstractC3382c.m2302c(fileCreateOpaqueCropTempFile)) == null) {
            uriM2302c = AbstractC3382c.m2302c(new File(imageLocalPath));
        }
        if (uriM2302c != null) {
            this.this$0.imagePicker.startCrop(uriM2302c, new C2764i(fileCreateOpaqueCropTempFile, doneCallback, cancelCallback, 13));
            return;
        }
        if (fileCreateOpaqueCropTempFile != null) {
            AbstractC3385e.m2333e(fileCreateOpaqueCropTempFile);
        }
        cancelCallback.invoke();
    }
}
