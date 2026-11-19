package com.friday.main.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FullScreenViewModel extends BaseViewModel {

    /* renamed from: b */
    public final FileDao f9577b;

    /* renamed from: c */
    public final ResourceDao f9578c;

    /* renamed from: d */
    public final InterfaceC5250g2 f9579d;

    /* renamed from: e */
    public final MutableLiveData f9580e;

    /* renamed from: f */
    public final MutableLiveData f9581f;

    /* renamed from: g */
    public final MutableLiveData f9582g;

    /* renamed from: h */
    public final LiveData f9583h;

    public FullScreenViewModel(FileDao fileDao, ResourceDao resourceDao, InterfaceC5250g2 shareCacheDao) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(shareCacheDao, "shareCacheDao");
        this.f9577b = fileDao;
        this.f9578c = resourceDao;
        this.f9579d = shareCacheDao;
        this.f9580e = new MutableLiveData();
        this.f9581f = new MutableLiveData();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f9582g = mutableLiveData;
        this.f9583h = mutableLiveData;
    }

    /* renamed from: h */
    public final MutableLiveData m7234h() {
        return this.f9581f;
    }

    /* renamed from: i */
    public final MutableLiveData m7235i() {
        return this.f9580e;
    }

    /* renamed from: j */
    public final void m7236j(String noteId) {
        AbstractC9979u.m20294g(noteId, "noteId");
        BaseViewModel.m4802c(this, new FullScreenViewModel$getNoteItem$1(this, noteId, null), new FullScreenViewModel$getNoteItem$2(this, null), null, 4, null);
    }

    /* renamed from: k */
    public final void m7237k(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        BaseViewModel.m4802c(this, new FullScreenViewModel$getPreviewList$1(this, fileEntity, null), new FullScreenViewModel$getPreviewList$2(this, null), null, 4, null);
    }

    /* renamed from: l */
    public final void m7238l(FileEntity data) {
        AbstractC9979u.m20294g(data, "data");
        BaseViewModel.m4802c(this, new FullScreenViewModel$getPreviewNewNoteList$1(this, data, null), new FullScreenViewModel$getPreviewNewNoteList$2(this, null), null, 4, null);
    }

    /* renamed from: m */
    public final LiveData m7239m() {
        return this.f9583h;
    }

    /* renamed from: n */
    public final void m7240n(String fileId) {
        AbstractC9979u.m20294g(fileId, "fileId");
        BaseViewModel.m4802c(this, new FullScreenViewModel$getStudentSharePreviewList$1(this, fileId, null), new FullScreenViewModel$getStudentSharePreviewList$2(this, null), null, 4, null);
    }
}
