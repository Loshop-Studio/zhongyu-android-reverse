package com.friday.paint.view.six;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import androidx.activity.result.ActivityResultLauncher;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$1$1$2$1$1", m26211f = "NewPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$initObserver$1$1$2$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10171c;

    /* renamed from: d */
    public final /* synthetic */ NewPaintFragment f10172d;

    /* renamed from: e */
    public final /* synthetic */ String f10173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$initObserver$1$1$2$1$1(NewPaintFragment newPaintFragment, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10172d = newPaintFragment;
        this.f10173e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$initObserver$1$1$2$1$1(this.f10172d, this.f10173e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10171c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        String strM7668J = this.f10172d.getViewModel().m7668J(this.f10173e);
        if (FileUtils.isFileExists(strM7668J)) {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath() + MqttTopic.TOPIC_LEVEL_SEPARATOR + System.currentTimeMillis() + ".png";
            if (FileUtils.copy(strM7668J, str)) {
                strM7668J = str;
            }
            try {
                ActivityResultLauncher activityResultLauncher = this.f10172d.askLauncher;
                Intent intent = new Intent("com.zykj.dialogue.ask");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(Uri.parse("http://www.zykj.dialogue.ask/"), "share/file");
                intent.putExtra("localFileName", strM7668J);
                intent.putExtra("fromOtherApp", true);
                activityResultLauncher.launch(intent);
            } catch (ActivityNotFoundException unused) {
                ToastUtils.showShort("未检测到随身答应用，无法提问", new Object[0]);
            }
        } else {
            ToastUtils.showShort("截图失败，请稍后再试", new Object[0]);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewPaintFragment$initObserver$1$1$2$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
