package p144q4;

import android.net.Uri;
import com.blankj.utilcode.util.AbstractC3382c;
import com.zykj.mistake.fragment.NoteFragment;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: q4.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6420d implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f10533a;

    /* renamed from: b */
    public final /* synthetic */ NoteFragment f10534b;

    public /* synthetic */ C6420d(NoteFragment noteFragment, int i) {
        this.f10533a = i;
        this.f10534b = noteFragment;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f10533a) {
            case 0:
                AbstractC5830k.m5330g(uri, "uri");
                NoteFragment noteFragment = this.f10534b;
                noteFragment.f7786h.startCrop(uri, new C6420d(noteFragment, 2));
                break;
            case 1:
                if (uri != null) {
                    NoteFragment noteFragment2 = this.f10534b;
                    noteFragment2.mo3964d(true);
                    String absolutePath = AbstractC3382c.m2317r(uri).getAbsolutePath();
                    AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
                    noteFragment2.m4339l(absolutePath);
                }
                break;
            default:
                if (uri != null) {
                    NoteFragment noteFragment3 = this.f10534b;
                    noteFragment3.mo3964d(true);
                    String absolutePath2 = AbstractC3382c.m2317r(uri).getAbsolutePath();
                    AbstractC5830k.m5329f(absolutePath2, "getAbsolutePath(...)");
                    noteFragment3.m4339l(absolutePath2);
                }
                break;
        }
        return C5443s.f8405a;
    }
}
