package com.friday.paint.view;

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

@InterfaceC11829d(m26210c = "com.friday.paint.view.TheSketchFragment$initData$8$1$1$1", m26211f = "TheSketchFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TheSketchFragment$initData$8$1$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10058c;

    /* renamed from: d */
    public final /* synthetic */ String f10059d;

    /* renamed from: e */
    public final /* synthetic */ TheSketchFragment f10060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheSketchFragment$initData$8$1$1$1(String str, TheSketchFragment theSketchFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10059d = str;
        this.f10060e = theSketchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TheSketchFragment$initData$8$1$1$1(this.f10059d, this.f10060e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10058c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        String str = this.f10059d + "/thumbnail.jpg";
        if (FileUtils.isFileExists(str)) {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath() + MqttTopic.TOPIC_LEVEL_SEPARATOR + System.currentTimeMillis() + ".png";
            if (FileUtils.copy(str, str2)) {
                str = str2;
            }
            try {
                ActivityResultLauncher activityResultLauncher = this.f10060e.f10024m;
                Intent intent = new Intent("com.zykj.dialogue.ask");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setDataAndType(Uri.parse("http://www.zykj.dialogue.ask/"), "share/file");
                intent.putExtra("localFileName", str);
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
        return ((TheSketchFragment$initData$8$1$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
