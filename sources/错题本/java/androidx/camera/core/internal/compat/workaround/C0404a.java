package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.impl.SessionConfig;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import java.util.Comparator;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p204y1.AbstractC6768a;

/* renamed from: androidx.camera.core.internal.compat.workaround.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0404a implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f491a;

    /* renamed from: b */
    public final /* synthetic */ Object f492b;

    public /* synthetic */ C0404a(Object obj, int i) {
        this.f491a = i;
        this.f492b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f491a) {
            case 0:
                return ((SurfaceSorter) this.f492b).lambda$sort$0((SessionConfig.OutputConfig) obj, (SessionConfig.OutputConfig) obj2);
            case 1:
                return SelectionRegistrarImpl.sort$lambda$2((InterfaceC6473e) this.f492b, obj, obj2);
            default:
                for (InterfaceC6471c interfaceC6471c : (InterfaceC6471c[]) this.f492b) {
                    int iM6441f = AbstractC6768a.m6441f((Comparable) interfaceC6471c.invoke(obj), (Comparable) interfaceC6471c.invoke(obj2));
                    if (iM6441f != 0) {
                        return iM6441f;
                    }
                }
                return 0;
        }
    }
}
