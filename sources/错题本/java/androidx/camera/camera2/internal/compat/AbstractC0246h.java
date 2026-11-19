package androidx.camera.camera2.internal.compat;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* renamed from: androidx.camera.camera2.internal.compat.h */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0246h {
    /* renamed from: A */
    public static /* bridge */ /* synthetic */ Class m488A() {
        return DeleteGesture.class;
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ Class m489B() {
        return JoinOrSplitGesture.class;
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ Class m490C() {
        return InsertGesture.class;
    }

    /* renamed from: D */
    public static /* bridge */ /* synthetic */ Class m491D() {
        return RemoveSpaceGesture.class;
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ DeleteGesture m501j(Object obj) {
        return (DeleteGesture) obj;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m502k(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m503l(Object obj) {
        return (SelectRangeGesture) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Class m504m() {
        return SelectGesture.class;
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m510s(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ Class m513v() {
        return SelectRangeGesture.class;
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m515x(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ Class m516y() {
        return DeleteRangeGesture.class;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m517z(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }
}
