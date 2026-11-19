package com.zykj.blackboard.utils;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class BitmapUtil {
    public static final BitmapUtil INSTANCE = new BitmapUtil();

    private BitmapUtil() {
    }

    public static /* synthetic */ void recycle$default(BitmapUtil bitmapUtil, Bitmap[] bitmapArr, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.blackboard.utils.BitmapUtil.recycle.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27476invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27476invoke();
                    return C8736p.f16368a;
                }
            };
        }
        bitmapUtil.recycle(bitmapArr, interfaceC10559a);
    }

    public final void recycle(Bitmap[] bitmap, InterfaceC10559a onEnd) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        AbstractC9133u.m16133g(onEnd, "onEnd");
        int length = bitmap.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Bitmap bitmap2 = bitmap[i10];
            int i12 = i11 + 1;
            if (bitmap2 != null) {
                if (!bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                if (i11 == AbstractC8801r.m14668B0(bitmap)) {
                    onEnd.invoke();
                }
            }
            i10++;
            i11 = i12;
        }
    }
}
