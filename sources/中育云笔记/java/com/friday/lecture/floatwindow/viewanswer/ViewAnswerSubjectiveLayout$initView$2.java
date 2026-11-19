package com.friday.lecture.floatwindow.viewanswer;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.blankj.utilcode.util.FileUtils;
import com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter;
import com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout;
import com.friday.lecture.floatwindow.viewanswer.ViewAnswerSubjectiveLayout;
import com.friday.lecture.floatwindow.viewanswer.ViewAnswerSubjectiveLayout$initView$2;
import com.friday.lecture.model.SubjectiveHomeworkAnswer;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes4.dex */
public final class ViewAnswerSubjectiveLayout$initView$2 extends PagerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewAnswerSubjectiveLayout f8850a;

    public ViewAnswerSubjectiveLayout$initView$2(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout) {
        this.f8850a = viewAnswerSubjectiveLayout;
    }

    /* renamed from: b */
    public static final C10786q m6771b(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout) throws Resources.NotFoundException {
        viewAnswerSubjectiveLayout.f8842s = false;
        viewAnswerSubjectiveLayout.m6767N();
        return C10786q.f26013a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup container, int i10, Object object) {
        AbstractC9979u.m20294g(container, "container");
        AbstractC9979u.m20294g(object, "object");
        container.removeView((SimpleCanvasLayout) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = this.f8850a.f8847x;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        return viewSubjectiveAnswerAdapter.getData().size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup container, int i10) {
        AbstractC9979u.m20294g(container, "container");
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = this.f8850a.f8847x;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        ViewAnswerSubjectiveLayout.C6152a c6152a = viewSubjectiveAnswerAdapter.getData().get(i10);
        SubjectiveHomeworkAnswer subjectiveHomeworkAnswerM6769b = c6152a.m6769b();
        if (FileUtils.isFileExists(subjectiveHomeworkAnswerM6769b.getLocalPath())) {
            c6152a.m6768a().setImage(subjectiveHomeworkAnswerM6769b.getLocalPath());
        } else {
            c6152a.m6768a().setImage(subjectiveHomeworkAnswerM6769b.getRemoteUrl());
        }
        container.addView(c6152a.m6768a());
        SimpleCanvasLayout simpleCanvasLayoutM6768a = c6152a.m6768a();
        final ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout = this.f8850a;
        simpleCanvasLayoutM6768a.setOnClose(new InterfaceC9529a() { // from class: i3.g0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return ViewAnswerSubjectiveLayout$initView$2.m6771b(viewAnswerSubjectiveLayout);
            }
        });
        return c6152a.m6768a();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object object) {
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(object, "object");
        return AbstractC9979u.m20289b(view, object);
    }
}
