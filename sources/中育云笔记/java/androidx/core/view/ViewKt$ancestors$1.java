package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
