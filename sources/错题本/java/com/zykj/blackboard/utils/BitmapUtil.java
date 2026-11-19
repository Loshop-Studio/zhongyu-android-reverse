package com.zykj.blackboard.utils;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\b2\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Lcom/zykj/blackboard/utils/BitmapUtil;", "", "<init>", "()V", "", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function0;", "Ld6/s;", "onEnd", "recycle", "([Landroid/graphics/Bitmap;Lr6/a;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BitmapUtil {

    @NotNull
    public static final BitmapUtil INSTANCE = new BitmapUtil();

    private BitmapUtil() {
    }

    public static /* synthetic */ void recycle$default(BitmapUtil bitmapUtil, Bitmap[] bitmapArr, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: com.zykj.blackboard.utils.BitmapUtil.recycle.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13812invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13812invoke();
                    return C5443s.f8405a;
                }
            };
        }
        bitmapUtil.recycle(bitmapArr, interfaceC6469a);
    }

    public final void recycle(@NotNull Bitmap[] bitmap, @NotNull InterfaceC6469a onEnd) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(onEnd, "onEnd");
        int length = bitmap.length;
        int i = 0;
        int i8 = 0;
        while (i < length) {
            Bitmap bitmap2 = bitmap[i];
            int i9 = i8 + 1;
            if (bitmap2 != null) {
                if (!bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                if (i8 == bitmap.length - 1) {
                    onEnd.invoke();
                }
            }
            i++;
            i8 = i9;
        }
    }
}
