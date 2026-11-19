package com.zykj.mistake.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LifecycleOwnerKt;
import android.view.View;
import android.view.result.ActivityResultLauncher;
import android.widget.Toast;
import com.zykj.message.client.MessageClient;
import com.zykj.mistake.R;
import com.zykj.view.board.board.BoardFragment;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC6014x;
import p045d6.C5443s;
import p106l4.DialogC6053d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.activity.c0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4463c0 implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f5884a;

    /* renamed from: b */
    public final /* synthetic */ SketchActivity f5885b;

    public /* synthetic */ C4463c0(SketchActivity sketchActivity, int i) {
        this.f5884a = i;
        this.f5885b = sketchActivity;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) throws Resources.NotFoundException {
        Object objM13956constructorimpl;
        int i = this.f5884a;
        int i8 = 0;
        C5443s c5443s = C5443s.f8405a;
        SketchActivity sketchActivity = this.f5885b;
        switch (i) {
            case 0:
                int i9 = SketchActivity.f5853v;
                AbstractC6014x.m5651v(LifecycleOwnerKt.getLifecycleScope(sketchActivity), null, null, new SketchActivity$cropImage$1((Bitmap) obj, new C4463c0(sketchActivity, 1), sketchActivity, null), 3);
                return c5443s;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    int i10 = SketchActivity.f5853v;
                    Log.i("SketchActivity", "题干加载失败");
                } else {
                    BoardFragment boardFragment = sketchActivity.f5859j;
                    if (boardFragment == null) {
                        AbstractC5830k.m5339p("mSketchFragment");
                        throw null;
                    }
                    BoardFragment.addBitmap$default(boardFragment, null, str, null, true, null, 21, null);
                }
                return c5443s;
            case 2:
                View view = (View) obj;
                int i11 = SketchActivity.f5853v;
                AbstractC5830k.m5330g(view, "view");
                view.setEnabled(false);
                String str2 = sketchActivity.f5865p;
                if (str2 != null) {
                    sketchActivity.m3945w(str2, new C4461b0(view, i8));
                    return c5443s;
                }
                AbstractC5830k.m5339p("mUploadDataPath");
                throw null;
            case 3:
                InterfaceC6469a it = (InterfaceC6469a) obj;
                int i12 = SketchActivity.f5853v;
                AbstractC5830k.m5330g(it, "it");
                if (sketchActivity.f5868s) {
                    it.invoke();
                } else {
                    DialogC6053d dialogC6053d = sketchActivity.f5869t;
                    if (dialogC6053d != null) {
                        dialogC6053d.show();
                    }
                }
                return c5443s;
            default:
                int i13 = SketchActivity.f5853v;
                AbstractC5830k.m5330g((InterfaceC6469a) obj, "it");
                try {
                    ActivityResultLauncher activityResultLauncher = sketchActivity.f5870u;
                    Intent intent = new Intent();
                    intent.setClassName(MessageClient.serverPackageName, "com.zykj.gallery.ui.share.ShareActivity");
                    activityResultLauncher.launch(intent);
                    objM13956constructorimpl = Result.m13956constructorimpl(c5443s);
                } catch (Throwable th) {
                    objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
                }
                if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
                    Toast toastMakeText = Toast.makeText(sketchActivity, R.string.open_gallery_failure, 0);
                    toastMakeText.setGravity(81, 0, 220);
                    toastMakeText.show();
                }
                return c5443s;
        }
    }
}
