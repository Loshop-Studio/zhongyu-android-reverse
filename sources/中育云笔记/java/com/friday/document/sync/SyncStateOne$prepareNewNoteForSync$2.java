package com.friday.document.sync;

import com.blankj.utilcode.util.LogUtils;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.NotePageOrder;
import com.friday.common.util.SyncException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne$prepareNewNoteForSync$2", m26211f = "SyncStateOne.kt", m26212l = {103}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SyncStateOne$prepareNewNoteForSync$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6938c;

    /* renamed from: d */
    public Object f6939d;

    /* renamed from: e */
    public int f6940e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f6941f;

    /* renamed from: g */
    public final /* synthetic */ SyncStateOne f6942g;

    @InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne$prepareNewNoteForSync$2$1", m26211f = "SyncStateOne.kt", m26212l = {104}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.sync.SyncStateOne$prepareNewNoteForSync$2$1 */
    public static final class C59971 extends SuspendLambda implements InterfaceC9540l {

        /* renamed from: c */
        public int f6943c;

        /* renamed from: d */
        public final /* synthetic */ SyncStateOne f6944d;

        /* renamed from: e */
        public final /* synthetic */ FileEntity f6945e;

        /* renamed from: f */
        public final /* synthetic */ File f6946f;

        /* renamed from: g */
        public final /* synthetic */ String f6947g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59971(SyncStateOne syncStateOne, FileEntity fileEntity, File file, String str, InterfaceC11588c interfaceC11588c) {
            super(1, interfaceC11588c);
            this.f6944d = syncStateOne;
            this.f6945e = fileEntity;
            this.f6946f = file;
            this.f6947g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
            return new C59971(this.f6944d, this.f6945e, this.f6946f, this.f6947g, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f6943c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                SyncStateOne syncStateOne = this.f6944d;
                FileEntity fileEntity = this.f6945e;
                File file = this.f6946f;
                String str = this.f6947g;
                AbstractC9979u.m20291d(str);
                this.f6943c = 1;
                if (syncStateOne.m5654y(fileEntity, file, str, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c interfaceC11588c) {
            return ((C59971) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$prepareNewNoteForSync$2(FileEntity fileEntity, SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6941f = fileEntity;
        this.f6942g = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SyncStateOne$prepareNewNoteForSync$2(this.f6941f, this.f6942g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f6940e;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            File file = new File(this.f6941f.getLocalFileUrl());
            if (!file.exists() || !file.isDirectory()) {
                LogUtils.m3887e("页面 SyncStateOne.kt -> prepareNewNoteForSync，新云笔记本地目录不存在，文件id=" + this.f6941f.getFileId() + "，目录=" + this.f6941f.getLocalFileUrl());
                throw new SyncException(SyncException.Kind.f6173d, "新云笔记本地目录不存在");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
            NotePageOrder notePageOrder = NotePageOrder.f6040a;
            String fileId = this.f6941f.getFileId();
            C59971 c59971 = new C59971(this.f6942g, this.f6941f, file, str, null);
            this.f6938c = AbstractC11833h.m26224a(file);
            this.f6939d = AbstractC11833h.m26224a(str);
            this.f6940e = 1;
            if (notePageOrder.m5247e(fileId, c59971, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return AbstractC11826a.m26206a(true);
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SyncStateOne$prepareNewNoteForSync$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
