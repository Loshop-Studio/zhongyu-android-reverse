package com.zykj.mistake.feature.notebook.detail;

import android.net.Uri;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.feature.notebook.list.C4943f0;
import com.zykj.mistake.feature.notebook.list.C4946g0;
import com.zykj.mistake.feature.notebook.list.C4948h;
import com.zykj.mistake.feature.notebook.list.C4989y0;
import com.zykj.mistake.main.C5066p;
import com.zykj.mistake.main.drawer.C5032c;
import com.zykj.view.utils.ImagePicker;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.notebook.detail.m4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4838m4 implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f7186a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f7187b;

    public /* synthetic */ C4838m4(InterfaceC6471c interfaceC6471c, int i) {
        this.f7186a = i;
        this.f7187b = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f7186a) {
            case 0:
                String it = (String) obj;
                AbstractC5830k.m5330g(it, "it");
                this.f7187b.invoke(new C4890v2(it));
                return C5443s.f8405a;
            case 1:
                List it2 = (List) obj;
                AbstractC5830k.m5330g(it2, "it");
                this.f7187b.invoke(new C4914z2(it2));
                return C5443s.f8405a;
            case 2:
                LayoutCoordinates it3 = (LayoutCoordinates) obj;
                AbstractC5830k.m5330g(it3, "it");
                this.f7187b.invoke(LayoutCoordinatesKt.boundsInRoot(it3));
                return C5443s.f8405a;
            case 3:
                String itemId = (String) obj;
                AbstractC5830k.m5330g(itemId, "itemId");
                this.f7187b.invoke(new C4946g0(itemId));
                return C5443s.f8405a;
            case 4:
                String it4 = (String) obj;
                AbstractC5830k.m5330g(it4, "it");
                this.f7187b.invoke(new C4989y0(it4));
                return C5443s.f8405a;
            case 5:
                String it5 = (String) obj;
                AbstractC5830k.m5330g(it5, "it");
                this.f7187b.invoke(new C4943f0(it5));
                return C5443s.f8405a;
            case 6:
                CustomTagInfo tag = (CustomTagInfo) obj;
                AbstractC5830k.m5330g(tag, "tag");
                this.f7187b.invoke(new C5032c(tag, 0));
                return C5443s.f8405a;
            case 7:
                this.f7187b.invoke(new C4948h(((Long) obj).longValue(), 1));
                return C5443s.f8405a;
            case 8:
                final int iIntValue = ((Integer) obj).intValue();
                final int i = 1;
                this.f7187b.invoke(new InterfaceC6471c() { // from class: com.zykj.mistake.main.drawer.a
                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj2) {
                        C5066p draft = (C5066p) obj2;
                        switch (i) {
                            case 0:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, null, null, AbstractC5034e.m4363b(iIntValue), false, null, 3583);
                            case 1:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, AbstractC5034e.m4363b(iIntValue), null, null, false, null, 3967);
                            default:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, null, AbstractC5034e.m4363b(iIntValue), null, false, null, 3839);
                        }
                    }
                });
                return C5443s.f8405a;
            case 9:
                final int iIntValue2 = ((Integer) obj).intValue();
                final int i8 = 2;
                this.f7187b.invoke(new InterfaceC6471c() { // from class: com.zykj.mistake.main.drawer.a
                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj2) {
                        C5066p draft = (C5066p) obj2;
                        switch (i8) {
                            case 0:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, null, null, AbstractC5034e.m4363b(iIntValue2), false, null, 3583);
                            case 1:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, AbstractC5034e.m4363b(iIntValue2), null, null, false, null, 3967);
                            default:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, null, AbstractC5034e.m4363b(iIntValue2), null, false, null, 3839);
                        }
                    }
                });
                return C5443s.f8405a;
            case 10:
                final int iIntValue3 = ((Integer) obj).intValue();
                final int i9 = 0;
                this.f7187b.invoke(new InterfaceC6471c() { // from class: com.zykj.mistake.main.drawer.a
                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj2) {
                        C5066p draft = (C5066p) obj2;
                        switch (i9) {
                            case 0:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, null, null, AbstractC5034e.m4363b(iIntValue3), false, null, 3583);
                            case 1:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, AbstractC5034e.m4363b(iIntValue3), null, null, false, null, 3967);
                            default:
                                AbstractC5830k.m5330g(draft, "draft");
                                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, null, AbstractC5034e.m4363b(iIntValue3), null, false, null, 3839);
                        }
                    }
                });
                return C5443s.f8405a;
            default:
                return ImagePicker.startCrop$lambda$13(this.f7187b, (Uri) obj);
        }
    }
}
