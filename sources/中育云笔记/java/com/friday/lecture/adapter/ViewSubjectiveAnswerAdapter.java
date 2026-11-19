package com.friday.lecture.adapter;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import anet.channel.util.HttpConstant;
import com.blankj.utilcode.util.FileUtils;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.classtest.MqttResponse;
import com.friday.lecture.R$id;
import com.friday.lecture.floatwindow.viewanswer.ViewAnswerSubjectiveLayout;
import com.friday.lecture.model.SubjectiveHomeworkAnswer;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p310qd.AbstractC10819z;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ViewSubjectiveAnswerAdapter extends BaseQuickAdapter<ViewAnswerSubjectiveLayout.C6152a, BaseViewHolder> {
    public ViewSubjectiveAnswerAdapter(int i10) {
        super(i10, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, ViewAnswerSubjectiveLayout.C6152a i10) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(i10, "i");
        SubjectiveHomeworkAnswer subjectiveHomeworkAnswerM6769b = i10.m6769b();
        int i11 = R$id.tv_name;
        MqttResponse.Student student = subjectiveHomeworkAnswerM6769b.getStudent();
        holder.setText(i11, student != null ? student.getStudentName() : null);
        String remoteUrl = subjectiveHomeworkAnswerM6769b.getRemoteUrl();
        if (AbstractC10819z.m23242O(remoteUrl, HttpConstant.HTTP, false, 2, null)) {
            ComponentCallbacks2C5810b.m3946t(getContext()).m4016t(remoteUrl).m3981A0((ImageView) holder.getView(R$id.iv_answer));
        } else if (FileUtils.isFileExists(subjectiveHomeworkAnswerM6769b.getLocalPath())) {
            ComponentCallbacks2C5810b.m3946t(getContext()).m4016t(subjectiveHomeworkAnswerM6769b.getLocalPath()).m3981A0((ImageView) holder.getView(R$id.iv_answer));
        } else {
            AbstractC11117h.m24726d(AbstractC10006d.m20745b(), null, null, new ViewSubjectiveAnswerAdapter$convert$1$1(subjectiveHomeworkAnswerM6769b, this, holder, null), 3, null);
        }
    }
}
