package com.friday.user.work;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.PathUtils;
import com.friday.common.helper.C5962b;
import com.google.gson.reflect.TypeToken;
import com.taobao.sophix.PatchStatus;
import java.io.File;
import java.util.ArrayList;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p220k7.C9827c;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ClearCacheWork extends CoroutineWorker {

    /* renamed from: a */
    public static final C6332a f10737a = new C6332a(null);

    /* renamed from: b */
    public static final int f10738b = 8;

    /* renamed from: c */
    public static final String f10739c;

    /* renamed from: com.friday.user.work.ClearCacheWork$a */
    public static final class C6332a {
        public /* synthetic */ C6332a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6332a() {
        }
    }

    /* renamed from: com.friday.user.work.ClearCacheWork$b */
    public static final class C6333b extends TypeToken<ArrayList<String>> {
    }

    @InterfaceC11829d(m26210c = "com.friday.user.work.ClearCacheWork", m26211f = "ClearCacheWork.kt", m26212l = {44, 46, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, 54, Opcodes.ASTORE, PatchStatus.CODE_LOAD_JIT_CLEAR, PatchStatus.CODE_LOAD_FIND_CLASS}, m26213m = "doWork")
    /* renamed from: com.friday.user.work.ClearCacheWork$doWork$1 */
    public static final class C63341 extends ContinuationImpl {

        /* renamed from: c */
        public long f10755c;

        /* renamed from: d */
        public Object f10756d;

        /* renamed from: e */
        public Object f10757e;

        /* renamed from: f */
        public Object f10758f;

        /* renamed from: g */
        public Object f10759g;

        /* renamed from: h */
        public Object f10760h;

        /* renamed from: i */
        public Object f10761i;

        /* renamed from: j */
        public Object f10762j;

        /* renamed from: k */
        public Object f10763k;

        /* renamed from: l */
        public Object f10764l;

        /* renamed from: m */
        public Object f10765m;

        /* renamed from: n */
        public Object f10766n;

        /* renamed from: o */
        public int f10767o;

        /* renamed from: p */
        public int f10768p;

        /* renamed from: q */
        public /* synthetic */ Object f10769q;

        /* renamed from: s */
        public int f10771s;

        public C63341(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10769q = obj;
            this.f10771s |= Integer.MIN_VALUE;
            return ClearCacheWork.this.doWork(this);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.user.work.ClearCacheWork$doWork$4", m26211f = "ClearCacheWork.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.user.work.ClearCacheWork$doWork$4 */
    public static final class C63354 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10772c;

        public C63354(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return ClearCacheWork.this.new C63354(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f10772c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            C9827c.m19926q().m19913d(ClearCacheWork.this.getApplicationContext());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C63354) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    static {
        String externalAppDataPath = PathUtils.getExternalAppDataPath();
        String str = File.separator;
        f10739c = externalAppDataPath + str + "share" + str + C5962b.f6082a.m5299a().m5292t();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearCacheWork(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(workerParams, "workerParams");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x019d -> B:38:0x01a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01ad -> B:39:0x01ab). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7835c(com.friday.common.MyDataBase r19, java.lang.String r20, java.lang.String r21, vc.InterfaceC11588c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.user.work.ClearCacheWork.m7835c(com.friday.common.MyDataBase, java.lang.String, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes5/com/friday/user/work/ClearCacheWork.smali:189
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x03d6, code lost:
    
        if (sd.AbstractC11109f.m24709g(r5, r12, r2) != r3) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0176 A[Catch: Exception -> 0x03e9, TryCatch #0 {Exception -> 0x03e9, blocks: (B:13:0x0047, B:85:0x03d9, B:16:0x0078, B:56:0x023c, B:58:0x0242, B:60:0x0259, B:65:0x02be, B:68:0x02ce, B:73:0x02e2, B:75:0x02ef, B:77:0x0339, B:69:0x02d3, B:71:0x02d9, B:72:0x02de, B:82:0x0394, B:19:0x00a6, B:22:0x00c1, B:51:0x021e, B:53:0x0222, B:55:0x022b, B:25:0x00dc, B:48:0x01f6, B:28:0x0105, B:38:0x0170, B:40:0x0176, B:44:0x01c3, B:31:0x011e, B:37:0x015f, B:34:0x0125), top: B:90:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0242 A[Catch: Exception -> 0x03e9, TryCatch #0 {Exception -> 0x03e9, blocks: (B:13:0x0047, B:85:0x03d9, B:16:0x0078, B:56:0x023c, B:58:0x0242, B:60:0x0259, B:65:0x02be, B:68:0x02ce, B:73:0x02e2, B:75:0x02ef, B:77:0x0339, B:69:0x02d3, B:71:0x02d9, B:72:0x02de, B:82:0x0394, B:19:0x00a6, B:22:0x00c1, B:51:0x021e, B:53:0x0222, B:55:0x022b, B:25:0x00dc, B:48:0x01f6, B:28:0x0105, B:38:0x0170, B:40:0x0176, B:44:0x01c3, B:31:0x011e, B:37:0x015f, B:34:0x0125), top: B:90:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3 A[SYNTHETIC] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(vc.InterfaceC11588c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.user.work.ClearCacheWork.doWork(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes5/com/friday/user/work/ClearCacheWork.smali:1608
    }
}
