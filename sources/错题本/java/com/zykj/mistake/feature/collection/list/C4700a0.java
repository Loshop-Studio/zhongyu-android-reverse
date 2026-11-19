package com.zykj.mistake.feature.collection.list;

import com.zykj.mistake.feature.notebook.list.C4935c1;
import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.utils.C5098c;
import com.zykj.mistake.utils.RunnableC5097b;
import com.zykj.mistake.widget.StemWebView;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C5961g;
import p045d6.C5443s;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.collection.list.a0 */
/* loaded from: classes3.dex */
public final class C4700a0 implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f6741a;

    /* renamed from: b */
    public final /* synthetic */ Object f6742b;

    /* renamed from: c */
    public final /* synthetic */ Object f6743c;

    /* renamed from: d */
    public final /* synthetic */ Object f6744d;

    /* renamed from: e */
    public final /* synthetic */ Object f6745e;

    public C4700a0(StemWebView stemWebView, C5961g c5961g, Ref$ObjectRef ref$ObjectRef, C5098c c5098c) {
        this.f6741a = 2;
        this.f6744d = stemWebView;
        this.f6742b = c5961g;
        this.f6743c = ref$ObjectRef;
        this.f6745e = c5098c;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f6741a) {
            case 0:
                String str = ((C4701b) this.f6745e).f6746a;
                if (((C4723v) this.f6744d).f6784k) {
                    ((InterfaceC6471c) this.f6742b).invoke(new C4721t(str));
                } else {
                    ((InterfaceC6471c) this.f6743c).invoke(str);
                }
                break;
            case 1:
                String str2 = ((C6383b) this.f6745e).f10446a;
                if (((C4941e1) this.f6744d).f7509i) {
                    ((InterfaceC6471c) this.f6742b).invoke(new C4935c1(str2));
                } else {
                    ((InterfaceC6471c) this.f6743c).invoke(str2);
                }
                break;
            default:
                StemWebView stemWebView = (StemWebView) this.f6744d;
                stemWebView.postDelayed(new RunnableC5097b(stemWebView, (C5961g) this.f6742b, (Ref$ObjectRef) this.f6743c, (C5098c) this.f6745e), 300L);
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4700a0(Object obj, InterfaceC6471c interfaceC6471c, Object obj2, InterfaceC6471c interfaceC6471c2, int i) {
        this.f6741a = i;
        this.f6744d = obj;
        this.f6742b = interfaceC6471c;
        this.f6745e = obj2;
        this.f6743c = interfaceC6471c2;
    }
}
