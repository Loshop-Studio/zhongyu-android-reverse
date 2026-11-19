package com.zykj.mistake.activity;

import android.net.Uri;
import android.widget.ImageView;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.activity.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4480p implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f5928a;

    /* renamed from: b */
    public final /* synthetic */ Object f5929b;

    /* renamed from: c */
    public final /* synthetic */ int f5930c;

    /* renamed from: d */
    public final /* synthetic */ Object f5931d;

    /* renamed from: e */
    public final /* synthetic */ Object f5932e;

    public /* synthetic */ C4480p(int i, int i8, Object obj, Object obj2, Object obj3) {
        this.f5928a = i8;
        this.f5929b = obj;
        this.f5930c = i;
        this.f5931d = obj2;
        this.f5932e = obj3;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        int i = this.f5928a;
        C5443s c5443s = C5443s.f8405a;
        Object obj2 = this.f5932e;
        Object obj3 = this.f5931d;
        Object obj4 = this.f5929b;
        switch (i) {
            case 0:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) obj4;
                Uri uri = (Uri) obj;
                int i8 = MistakeCreateOrEditActivity.f5799u;
                AbstractC5830k.m5330g(uri, "uri");
                int i9 = this.f5930c;
                mistakeCreateOrEditActivity.f5806k.startCrop(uri, new C4480p(i9, 1, mistakeCreateOrEditActivity, (ImageView) obj3, (ImageView) obj2));
                return c5443s;
            case 1:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = (MistakeCreateOrEditActivity) obj4;
                ImageView imageView = (ImageView) obj3;
                ImageView imageView2 = (ImageView) obj2;
                Uri uri2 = (Uri) obj;
                if (uri2 == null) {
                    int i10 = MistakeCreateOrEditActivity.f5799u;
                } else {
                    String str = mistakeCreateOrEditActivity2.f5807l;
                    StringBuilder sb = new StringBuilder();
                    int i11 = this.f5930c;
                    sb.append(i11);
                    sb.append(".jpg");
                    mistakeCreateOrEditActivity2.m3915B(str, sb.toString(), uri2, i11, imageView, imageView2);
                }
                return c5443s;
            case 2:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity3 = (MistakeCreateOrEditActivity) obj4;
                ImageView imageView3 = (ImageView) obj3;
                ImageView imageView4 = (ImageView) obj2;
                Uri uri3 = (Uri) obj;
                if (uri3 == null) {
                    int i12 = MistakeCreateOrEditActivity.f5799u;
                } else {
                    String str2 = mistakeCreateOrEditActivity3.f5807l;
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = this.f5930c;
                    sb2.append(i13);
                    sb2.append(".jpg");
                    mistakeCreateOrEditActivity3.m3915B(str2, sb2.toString(), uri3, i13, imageView3, imageView4);
                }
                return c5443s;
            default:
                return RouteSerializerKt.generateNavArguments$lambda$4$lambda$3((InterfaceC5686b) obj4, this.f5930c, (Map) obj3, (String) obj2, (NavArgumentBuilder) obj);
        }
    }
}
