package com.zykj.view.board.play;

import android.os.Handler;
import android.os.Looper;
import android.view.compose.LocalSavedStateRegistryOwnerKt;
import coil3.network.okhttp.internal.C3326a;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract$EntryMode;
import com.zykj.mistake.feature.mistake.model.MistakeTagType;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$EntryMode;
import com.zykj.mistake.feature.review.ReviewContract$PracticeScene;
import com.zykj.mistake.network.C5088a;
import com.zykj.view.board.simple.SimpleFragment;
import okhttp3.C6338z;
import p045d6.C5443s;
import p106l4.DialogC6053d;
import p106l4.DialogC6054e;
import p118m7.AbstractC6191y0;
import p118m7.C6127d;
import p125n7.C6231f;
import p125n7.C6242q;
import p125n7.C6244s;
import p125n7.C6248w;
import p125n7.C6251z;
import p137p4.C6388g;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.view.board.play.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5353b implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f8283a;

    public /* synthetic */ C5353b(int i) {
        this.f8283a = i;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        int i = this.f8283a;
        C5443s c5443s = C5443s.f8405a;
        switch (i) {
            case 0:
                return C5443s.f8405a;
            case 1:
                return SimpleFragment.mViewModel_delegate$lambda$0();
            case 2:
                return C5443s.f8405a;
            case 3:
                return C5443s.f8405a;
            case 4:
                return new Handler(Looper.getMainLooper());
            case 5:
                return C5088a.f7986a.m4382c();
            case 6:
                return C5088a.f7986a.m4382c();
            case 7:
                return LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner$lambda$3$lambda$2();
            case 9:
                int i8 = DialogC6053d.f9647b;
            case 8:
                return c5443s;
            case 10:
                int i9 = DialogC6054e.f9649b;
                return c5443s;
            case 11:
                return SearchMistakeCollectionReq._childSerializers$_anonymous_();
            case 12:
                return SearchMistakeCollectionReq._childSerializers$_anonymous_$0();
            case 13:
                return SearchMistakeCollectionReq._childSerializers$_anonymous_$1();
            case 14:
                return SearchMistakeCollectionReq._childSerializers$_anonymous_$2();
            case 15:
                return SearchMistakeCollectionReq._childSerializers$_anonymous_$3();
            case 16:
                return C6251z.f10000b;
            case 17:
                return C6244s.f9992b;
            case 18:
                return C6242q.f9990b;
            case 19:
                return C6248w.f9998b;
            case 20:
                return C6231f.f9974b;
            case 21:
                return new C6127d(C6388g.f10478a, 0);
            case 22:
                return AbstractC6191y0.m5835e("com.zykj.mistake.feature.mistake.model.MistakeTagType", MistakeTagType.values());
            case 23:
                return MistakeTagType.Companion.serializer();
            case 24:
                return new C3326a(new C6338z());
            case 25:
                throw new IllegalStateException("MainNavController not provided");
            case 26:
                return AbstractC6191y0.m5835e("com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract.EntryMode", MistakeCollectionDetailContract$EntryMode.values());
            case 27:
                return new C6127d(C6388g.f10478a, 0);
            case 28:
                return AbstractC6191y0.m5835e("com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract.EntryMode", MistakeDetailNewContract$EntryMode.values());
            default:
                return AbstractC6191y0.m5835e("com.zykj.mistake.feature.review.ReviewContract.PracticeScene", ReviewContract$PracticeScene.values());
        }
    }
}
