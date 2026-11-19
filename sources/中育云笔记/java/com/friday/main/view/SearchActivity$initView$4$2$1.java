package com.friday.main.view;

import com.friday.common.entity.FileEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.view.SearchActivity$initView$4$2$1", m26211f = "SearchActivity.kt", m26212l = {164, 208, 227}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SearchActivity$initView$4$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9430c;

    /* renamed from: d */
    public int f9431d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f9432e;

    /* renamed from: f */
    public final /* synthetic */ SearchActivity f9433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchActivity$initView$4$2$1(FileEntity fileEntity, SearchActivity searchActivity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9432e = fileEntity;
        this.f9433f = searchActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SearchActivity$initView$4$2$1(this.f9432e, this.f9433f, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r2 == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        if (r2.equals("9") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        if (r2.equals("8") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        com.friday.common.helper.C5963c.m5306s(com.friday.common.helper.C5963c.f6084a, r17.f9432e.getFileName(), r17.f9432e.getRealOssUrl(), false, null, 0, 28, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0192, code lost:
    
        if (r2 == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cc, code lost:
    
        if (r2 == r1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.view.SearchActivity$initView$4$2$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/view/SearchActivity$initView$4$2$1.smali:132
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SearchActivity$initView$4$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
