package com.friday.document.service;

import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ResourceEntity;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$newDownload$2", m26211f = "FileManager.kt", m26212l = {484, 490, 494, 495}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$newDownload$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6821c;

    /* renamed from: d */
    public Object f6822d;

    /* renamed from: e */
    public Object f6823e;

    /* renamed from: f */
    public int f6824f;

    /* renamed from: g */
    public long f6825g;

    /* renamed from: h */
    public int f6826h;

    /* renamed from: i */
    public final /* synthetic */ FileEntity f6827i;

    /* renamed from: j */
    public final /* synthetic */ FileManager f6828j;

    /* renamed from: k */
    public final /* synthetic */ List f6829k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$newDownload$2(FileEntity fileEntity, FileManager fileManager, List list, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6827i = fileEntity;
        this.f6828j = fileManager;
        this.f6829k = list;
    }

    /* renamed from: m */
    public static final CharSequence m5623m(ResourceEntity resourceEntity) {
        return "id=" + resourceEntity.getId() + "，url=" + resourceEntity.getOssImageUrl();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$newDownload$2(this.f6827i, this.f6828j, this.f6829k, interfaceC11588c);
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0054: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:85), block:B:19:0x0054 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0212  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager$newDownload$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager$newDownload$2.smali:230
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileManager$newDownload$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
