package p009a8;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zykj.mistake.activity.C4482r;
import com.zykj.mistake.activity.MistakeCreateOrEditActivity;
import com.zykj.mistake.databinding.ActivityMistakeCreateOrEditBinding;
import com.zykj.mistake.entity.EditMistakeData;
import com.zykj.mistake.entity.resp.SubjectResp;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.angmarch.views.AbstractC6356c;
import org.angmarch.views.NiceSpinner;

/* renamed from: a8.b */
/* loaded from: classes4.dex */
public final class C0024b implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ NiceSpinner f64a;

    public C0024b(NiceSpinner niceSpinner) {
        this.f64a = niceSpinner;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        NiceSpinner niceSpinner = this.f64a;
        if (i >= niceSpinner.f10364b && i < niceSpinner.f10367e.getCount()) {
            i++;
        }
        int i8 = i;
        niceSpinner.f10364b = i8;
        InterfaceC0027e interfaceC0027e = niceSpinner.f10369g;
        if (interfaceC0027e != null) {
            MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) ((C4482r) interfaceC0027e).f5937a;
            SubjectResp.Subject subject = (SubjectResp.Subject) AbstractC5805t.m5230j0(i8, mistakeCreateOrEditActivity.f5800e);
            if (subject != null) {
                long id = subject.getId();
                SharedPreferences.Editor editorEdit = mistakeCreateOrEditActivity.getSharedPreferences("zykjMistake", 0).edit();
                editorEdit.putLong("SP_SUBJECT_ID", id);
                editorEdit.commit();
                EditMistakeData editMistakeData = mistakeCreateOrEditActivity.f5810o;
                if (editMistakeData != null) {
                    long topicId = editMistakeData.getTopicId();
                    AppCompatTextView tvTopicDiffTip = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6039v;
                    AbstractC5830k.m5329f(tvTopicDiffTip, "tvTopicDiffTip");
                    tvTopicDiffTip.setVisibility(topicId != subject.getId() ? 0 : 8);
                }
            }
        }
        AdapterView.OnItemSelectedListener onItemSelectedListener = niceSpinner.f10368f;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i8, j7);
        }
        AbstractC6356c abstractC6356c = niceSpinner.f10367e;
        abstractC6356c.f10392e = i8;
        niceSpinner.setTextInternal(abstractC6356c.mo6023a(i8));
        if (!niceSpinner.f10370h) {
            niceSpinner.m6018c(false);
        }
        niceSpinner.f10366d.dismiss();
    }
}
