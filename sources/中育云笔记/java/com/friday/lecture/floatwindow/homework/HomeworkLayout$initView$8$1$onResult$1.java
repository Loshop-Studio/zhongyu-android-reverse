package com.friday.lecture.floatwindow.homework;

import android.graphics.Bitmap;
import com.alibaba.fastjson.asm.Opcodes;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.floatwindow.homework.HomeworkLayout$initView$8$1$onResult$1", m26211f = "HomeworkLayout.kt", m26212l = {Opcodes.GETSTATIC}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeworkLayout$initView$8$1$onResult$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8758c;

    /* renamed from: d */
    public Object f8759d;

    /* renamed from: e */
    public Object f8760e;

    /* renamed from: f */
    public int f8761f;

    /* renamed from: g */
    public int f8762g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f8763h;

    /* renamed from: i */
    public final /* synthetic */ HomeworkLayout f8764i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeworkLayout$initView$8$1$onResult$1(ArrayList arrayList, HomeworkLayout homeworkLayout, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8763h = arrayList;
        this.f8764i = homeworkLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeworkLayout$initView$8$1$onResult$1(this.f8763h, this.f8764i, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HomeworkLayout homeworkLayout;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8762g;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ArrayList arrayList = this.f8763h;
            if (arrayList == null || arrayList.isEmpty()) {
                C6148b.f8768d.m6626a().m6625i();
            } else {
                String strM9377j = ((LocalMedia) this.f8763h.get(0)).m9377j();
                if (strM9377j == null && (strM9377j = ((LocalMedia) this.f8763h.get(0)).m9403z()) == null) {
                    strM9377j = ((LocalMedia) this.f8763h.get(0)).m9401x();
                }
                if (strM9377j != null) {
                    HomeworkLayout homeworkLayout2 = this.f8764i;
                    AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
                    HomeworkLayout$initView$8$1$onResult$1$1$1 homeworkLayout$initView$8$1$onResult$1$1$1 = new HomeworkLayout$initView$8$1$onResult$1$1$1(strM9377j, null);
                    this.f8758c = AbstractC11833h.m26224a(strM9377j);
                    this.f8759d = AbstractC11833h.m26224a(strM9377j);
                    this.f8760e = homeworkLayout2;
                    this.f8761f = 0;
                    this.f8762g = 1;
                    obj = AbstractC11109f.m24709g(abstractC11106e0M24799b, homeworkLayout$initView$8$1$onResult$1$1$1, this);
                    if (obj == objM25952f) {
                        return objM25952f;
                    }
                    homeworkLayout = homeworkLayout2;
                } else {
                    C6148b.f8768d.m6626a().m6625i();
                }
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        homeworkLayout = (HomeworkLayout) this.f8760e;
        AbstractC9924b.m20071b(obj);
        homeworkLayout.m6612y((Bitmap) obj);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeworkLayout$initView$8$1$onResult$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
