package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.entity.CreateNoteInput;
import com.friday.common.entity.FileEntity;
import com.friday.document.R$string;
import com.friday.document.viewmodel.TxtEditViewModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TxtEditViewModel extends BaseViewModel {

    /* renamed from: b */
    public final FileDao f8414b;

    /* renamed from: c */
    public final MutableLiveData f8415c;

    /* renamed from: d */
    public final MutableLiveData f8416d;

    /* renamed from: e */
    public final MutableLiveData f8417e;

    public TxtEditViewModel(FileDao fileDao) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        this.f8414b = fileDao;
        this.f8415c = new MutableLiveData();
        this.f8416d = new MutableLiveData();
        this.f8417e = new MutableLiveData();
    }

    /* renamed from: i */
    public static final C10786q m6480i(TxtEditViewModel txtEditViewModel, FileEntity fileEntity) {
        txtEditViewModel.f8415c.postValue(fileEntity);
        AbstractC11958b.m26587h(R$string.save_success);
        return C10786q.f26013a;
    }

    /* renamed from: o */
    public static final C10786q m6481o() {
        AbstractC11958b.m26587h(R$string.save_success);
        return C10786q.f26013a;
    }

    /* renamed from: h */
    public final void m6482h(CreateNoteInput note) {
        AbstractC9979u.m20294g(note, "note");
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
        String noteId = note.getNoteId();
        long userId = note.getUserId();
        String noteName = note.getNoteName();
        String localPath = note.getLocalPath();
        String fileType = note.getFileType();
        String parentId = note.getParentId();
        AbstractC9979u.m20291d(str);
        final FileEntity fileEntity = new FileEntity(noteId, userId, noteName, "", localPath, fileType, parentId, str, str, 1, false, 0, false, null, 0, null, true, 0L, false, 450560, null);
        m4804b(new TxtEditViewModel$createNewNote$1(this, fileEntity, null), new TxtEditViewModel$createNewNote$2(this, null), new InterfaceC9529a() { // from class: z2.w0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return TxtEditViewModel.m6480i(this.f28382c, fileEntity);
            }
        });
    }

    /* renamed from: j */
    public final void m6483j(String fileId) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new TxtEditViewModel$findItem$1(this, fileId, null), 3, null);
    }

    /* renamed from: k */
    public final MutableLiveData m6484k() {
        return this.f8415c;
    }

    /* renamed from: l */
    public final MutableLiveData m6485l() {
        return this.f8416d;
    }

    /* renamed from: m */
    public final MutableLiveData m6486m() {
        return this.f8417e;
    }

    /* renamed from: n */
    public final void m6487n(String noteId, String name, int i10) {
        AbstractC9979u.m20294g(noteId, "noteId");
        AbstractC9979u.m20294g(name, "name");
        m4804b(new TxtEditViewModel$updateNote$1(this, noteId, name, i10, null), new TxtEditViewModel$updateNote$2(this, null), new InterfaceC9529a() { // from class: z2.x0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return TxtEditViewModel.m6481o();
            }
        });
    }
}
