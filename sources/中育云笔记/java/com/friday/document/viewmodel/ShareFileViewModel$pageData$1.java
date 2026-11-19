package com.friday.document.viewmodel;

import com.friday.document.model.ShareFile;
import com.friday.document.model.ShareListEntity;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9547s;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;
import p364uc.AbstractC11382b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareFileViewModel$pageData$1", m26211f = "ShareFileViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareFileViewModel$pageData$1 extends SuspendLambda implements InterfaceC9547s {

    /* renamed from: c */
    public int f8309c;

    /* renamed from: d */
    public /* synthetic */ Object f8310d;

    /* renamed from: e */
    public /* synthetic */ Object f8311e;

    /* renamed from: f */
    public /* synthetic */ Object f8312f;

    /* renamed from: g */
    public /* synthetic */ int f8313g;

    /* renamed from: h */
    public final /* synthetic */ ShareFileViewModel f8314h;

    /* renamed from: com.friday.document.viewmodel.ShareFileViewModel$pageData$1$a */
    public static final class C6127a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(((ShareFile) obj2).getUpdateTime(), ((ShareFile) obj).getUpdateTime());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFileViewModel$pageData$1(ShareFileViewModel shareFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(5, interfaceC11588c);
        this.f8314h = shareFileViewModel;
    }

    /* renamed from: p */
    public static final int m6434p(ShareFile shareFile, ShareFile shareFile2) {
        return Collator.getInstance(Locale.CHINA).compare(shareFile.getFileName(), shareFile2.getFileName());
    }

    /* renamed from: t */
    public static final int m6435t(InterfaceC9544p interfaceC9544p, Object obj, Object obj2) {
        return ((Number) interfaceC9544p.invoke(obj, obj2)).intValue();
    }

    @Override // p181hd.InterfaceC9547s
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m6436n((ShareFile) obj, (ShareFile) obj2, (List) obj3, ((Number) obj4).intValue(), (InterfaceC11588c) obj5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listM23914P0;
        ShareFile shareFile = (ShareFile) this.f8310d;
        ShareFile shareFile2 = (ShareFile) this.f8311e;
        List list = (List) this.f8312f;
        int i10 = this.f8313g;
        AbstractC11725a.m25952f();
        if (this.f8309c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (shareFile == null) {
            listM23914P0 = this.f8314h.m6425T(list);
        } else if (i10 == 0) {
            listM23914P0 = AbstractC10947g0.m23914P0(list, new C6127a());
        } else {
            final InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: com.friday.document.viewmodel.b
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(ShareFileViewModel$pageData$1.m6434p((ShareFile) obj2, (ShareFile) obj3));
                }
            };
            listM23914P0 = AbstractC10947g0.m23914P0(list, new Comparator() { // from class: com.friday.document.viewmodel.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ShareFileViewModel$pageData$1.m6435t(interfaceC9544p, obj2, obj3);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM23914P0) {
            if (AbstractC9979u.m20289b(((ShareFile) obj2).getType(), "0")) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<ShareFile> listM23906H0 = AbstractC10947g0.m23906H0((List) pair.m20048a(), (List) pair.m20049c());
        ArrayList arrayList3 = new ArrayList(AbstractC10980x.m24153x(listM23906H0, 10));
        for (ShareFile shareFile3 : listM23906H0) {
            boolean z10 = false;
            boolean z11 = AbstractC9979u.m20289b(shareFile2 != null ? shareFile2.getFileId() : null, shareFile3.getFileId()) && !AbstractC9979u.m20289b(shareFile3.getType(), "0");
            if (shareFile == null) {
                z10 = true;
            }
            arrayList3.add(new ShareListEntity(z11, z10, shareFile3));
        }
        return arrayList3;
    }

    /* renamed from: n */
    public final Object m6436n(ShareFile shareFile, ShareFile shareFile2, List list, int i10, InterfaceC11588c interfaceC11588c) {
        ShareFileViewModel$pageData$1 shareFileViewModel$pageData$1 = new ShareFileViewModel$pageData$1(this.f8314h, interfaceC11588c);
        shareFileViewModel$pageData$1.f8310d = shareFile;
        shareFileViewModel$pageData$1.f8311e = shareFile2;
        shareFileViewModel$pageData$1.f8312f = list;
        shareFileViewModel$pageData$1.f8313g = i10;
        return shareFileViewModel$pageData$1.invokeSuspend(C10786q.f26013a);
    }
}
