package com.friday.main.viewmodel;

import com.blankj.utilcode.util.FileUtils;
import com.friday.common.entity.FileEntity;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$copyNote$1", m26211f = "FolderMoveViewModel.kt", m26212l = {224, 231, 235, 243, 253, 433, 453, 469, 474, 457, 485, 490, 492}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$copyNote$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: A */
    public final /* synthetic */ FolderMoveViewModel f9468A;

    /* renamed from: B */
    public final /* synthetic */ FileEntity f9469B;

    /* renamed from: C */
    public final /* synthetic */ List f9470C;

    /* renamed from: c */
    public int f9471c;

    /* renamed from: d */
    public int f9472d;

    /* renamed from: e */
    public int f9473e;

    /* renamed from: f */
    public int f9474f;

    /* renamed from: g */
    public int f9475g;

    /* renamed from: h */
    public int f9476h;

    /* renamed from: i */
    public Object f9477i;

    /* renamed from: j */
    public Object f9478j;

    /* renamed from: k */
    public Object f9479k;

    /* renamed from: l */
    public Object f9480l;

    /* renamed from: m */
    public Object f9481m;

    /* renamed from: n */
    public Object f9482n;

    /* renamed from: o */
    public Object f9483o;

    /* renamed from: p */
    public Object f9484p;

    /* renamed from: q */
    public Object f9485q;

    /* renamed from: r */
    public Object f9486r;

    /* renamed from: s */
    public Object f9487s;

    /* renamed from: t */
    public Object f9488t;

    /* renamed from: u */
    public Object f9489u;

    /* renamed from: v */
    public Object f9490v;

    /* renamed from: w */
    public Object f9491w;

    /* renamed from: x */
    public Object f9492x;

    /* renamed from: y */
    public Object f9493y;

    /* renamed from: z */
    public int f9494z;

    @InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$copyNote$1$1", m26211f = "FolderMoveViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.viewmodel.FolderMoveViewModel$copyNote$1$1 */
    public static final class C62201 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9495c;

        /* renamed from: d */
        public final /* synthetic */ String f9496d;

        /* renamed from: e */
        public final /* synthetic */ String f9497e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62201(String str, String str2, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9496d = str;
            this.f9497e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C62201(this.f9496d, this.f9497e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f9495c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(FileUtils.copy(this.f9496d, this.f9497e));
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62201) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$copyNote$1(FolderMoveViewModel folderMoveViewModel, FileEntity fileEntity, List list, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9468A = folderMoveViewModel;
        this.f9469B = fileEntity;
        this.f9470C = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderMoveViewModel$copyNote$1(this.f9468A, this.f9469B, this.f9470C, interfaceC11588c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x051e A[Catch: Exception -> 0x0035, TryCatch #6 {Exception -> 0x0035, blocks: (B:8:0x002f, B:13:0x0052, B:16:0x0072, B:19:0x00c8, B:137:0x05ad, B:22:0x012b, B:25:0x0164, B:133:0x0578, B:127:0x0508, B:128:0x0516, B:130:0x051e, B:135:0x057b, B:36:0x0201, B:73:0x034b, B:75:0x0359, B:136:0x0584, B:40:0x0212, B:69:0x02d8, B:41:0x021a, B:63:0x02a3, B:42:0x021f, B:48:0x0245, B:49:0x0255, B:51:0x025b, B:53:0x026c, B:54:0x0270, B:56:0x0278, B:58:0x0283, B:60:0x028b, B:65:0x02a6, B:45:0x0228), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x057b A[Catch: Exception -> 0x0035, TryCatch #6 {Exception -> 0x0035, blocks: (B:8:0x002f, B:13:0x0052, B:16:0x0072, B:19:0x00c8, B:137:0x05ad, B:22:0x012b, B:25:0x0164, B:133:0x0578, B:127:0x0508, B:128:0x0516, B:130:0x051e, B:135:0x057b, B:36:0x0201, B:73:0x034b, B:75:0x0359, B:136:0x0584, B:40:0x0212, B:69:0x02d8, B:41:0x021a, B:63:0x02a3, B:42:0x021f, B:48:0x0245, B:49:0x0255, B:51:0x025b, B:53:0x026c, B:54:0x0270, B:56:0x0278, B:58:0x0283, B:60:0x028b, B:65:0x02a6, B:45:0x0228), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0584 A[Catch: Exception -> 0x0035, TryCatch #6 {Exception -> 0x0035, blocks: (B:8:0x002f, B:13:0x0052, B:16:0x0072, B:19:0x00c8, B:137:0x05ad, B:22:0x012b, B:25:0x0164, B:133:0x0578, B:127:0x0508, B:128:0x0516, B:130:0x051e, B:135:0x057b, B:36:0x0201, B:73:0x034b, B:75:0x0359, B:136:0x0584, B:40:0x0212, B:69:0x02d8, B:41:0x021a, B:63:0x02a3, B:42:0x021f, B:48:0x0245, B:49:0x0255, B:51:0x025b, B:53:0x026c, B:54:0x0270, B:56:0x0278, B:58:0x0283, B:60:0x028b, B:65:0x02a6, B:45:0x0228), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0779 A[Catch: Exception -> 0x0774, TryCatch #7 {Exception -> 0x0774, blocks: (B:171:0x07cf, B:172:0x07da, B:162:0x0768, B:167:0x0779), top: B:200:0x0768 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x025b A[Catch: Exception -> 0x0035, TryCatch #6 {Exception -> 0x0035, blocks: (B:8:0x002f, B:13:0x0052, B:16:0x0072, B:19:0x00c8, B:137:0x05ad, B:22:0x012b, B:25:0x0164, B:133:0x0578, B:127:0x0508, B:128:0x0516, B:130:0x051e, B:135:0x057b, B:36:0x0201, B:73:0x034b, B:75:0x0359, B:136:0x0584, B:40:0x0212, B:69:0x02d8, B:41:0x021a, B:63:0x02a3, B:42:0x021f, B:48:0x0245, B:49:0x0255, B:51:0x025b, B:53:0x026c, B:54:0x0270, B:56:0x0278, B:58:0x0283, B:60:0x028b, B:65:0x02a6, B:45:0x0228), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0278 A[Catch: Exception -> 0x0035, TryCatch #6 {Exception -> 0x0035, blocks: (B:8:0x002f, B:13:0x0052, B:16:0x0072, B:19:0x00c8, B:137:0x05ad, B:22:0x012b, B:25:0x0164, B:133:0x0578, B:127:0x0508, B:128:0x0516, B:130:0x051e, B:135:0x057b, B:36:0x0201, B:73:0x034b, B:75:0x0359, B:136:0x0584, B:40:0x0212, B:69:0x02d8, B:41:0x021a, B:63:0x02a3, B:42:0x021f, B:48:0x0245, B:49:0x0255, B:51:0x025b, B:53:0x026c, B:54:0x0270, B:56:0x0278, B:58:0x0283, B:60:0x028b, B:65:0x02a6, B:45:0x0228), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0283 A[Catch: Exception -> 0x0035, TryCatch #6 {Exception -> 0x0035, blocks: (B:8:0x002f, B:13:0x0052, B:16:0x0072, B:19:0x00c8, B:137:0x05ad, B:22:0x012b, B:25:0x0164, B:133:0x0578, B:127:0x0508, B:128:0x0516, B:130:0x051e, B:135:0x057b, B:36:0x0201, B:73:0x034b, B:75:0x0359, B:136:0x0584, B:40:0x0212, B:69:0x02d8, B:41:0x021a, B:63:0x02a3, B:42:0x021f, B:48:0x0245, B:49:0x0255, B:51:0x025b, B:53:0x026c, B:54:0x0270, B:56:0x0278, B:58:0x0283, B:60:0x028b, B:65:0x02a6, B:45:0x0228), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0359 A[Catch: Exception -> 0x0035, TRY_LEAVE, TryCatch #6 {Exception -> 0x0035, blocks: (B:8:0x002f, B:13:0x0052, B:16:0x0072, B:19:0x00c8, B:137:0x05ad, B:22:0x012b, B:25:0x0164, B:133:0x0578, B:127:0x0508, B:128:0x0516, B:130:0x051e, B:135:0x057b, B:36:0x0201, B:73:0x034b, B:75:0x0359, B:136:0x0584, B:40:0x0212, B:69:0x02d8, B:41:0x021a, B:63:0x02a3, B:42:0x021f, B:48:0x0245, B:49:0x0255, B:51:0x025b, B:53:0x026c, B:54:0x0270, B:56:0x0278, B:58:0x0283, B:60:0x028b, B:65:0x02a6, B:45:0x0228), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03d4 A[Catch: all -> 0x01b4, TryCatch #10 {all -> 0x01b4, blocks: (B:28:0x01a9, B:33:0x01e3, B:80:0x03ba, B:81:0x03ce, B:83:0x03d4, B:85:0x03e1, B:86:0x03e5), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03fb A[Catch: all -> 0x04ea, TRY_LEAVE, TryCatch #4 {all -> 0x04ea, blocks: (B:88:0x03f5, B:90:0x03fb), top: B:195:0x03f5 }] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v46, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v72, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0718 -> B:154:0x072f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0756 -> B:200:0x0768). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.FolderMoveViewModel$copyNote$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1.smali:196
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderMoveViewModel$copyNote$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
