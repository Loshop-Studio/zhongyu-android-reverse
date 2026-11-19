package com.zykj.mistake.feature.notebook.detail;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.camera.camera2.interop.C0304d;
import androidx.compose.runtime.ComposerKt;
import com.zykj.mistake.activity.MainActivity;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p191w4.InterfaceC6718c;

/* renamed from: com.zykj.mistake.feature.notebook.detail.c5 */
/* loaded from: classes3.dex */
public final class HandlerC4778c5 extends Handler {

    /* renamed from: a */
    public C0304d f6945a;

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        AbstractC5830k.m5330g(msg, "msg");
        C0304d c0304d = this.f6945a;
        if (c0304d != null) {
            InterfaceC6718c interfaceC6718c = (InterfaceC6718c) c0304d.f380a;
            MistakeDetailNewViewModel mistakeDetailNewViewModel = (MistakeDetailNewViewModel) c0304d.f381b;
            int i = msg.what;
            if (i != 103) {
                switch (i) {
                    case ComposerKt.providerKey /* 201 */:
                    case ComposerKt.compositionLocalMapKey /* 202 */:
                    case ComposerKt.providerValuesKey /* 203 */:
                        MainActivity mainActivity = (MainActivity) interfaceC6718c;
                        mainActivity.m3908c();
                        mainActivity.m3907b("上传失败");
                        break;
                }
                return;
            }
            Bundle data = msg.getData();
            String string = data != null ? data.getString("UPLOAD_SUCCESS_URL") : null;
            if (string == null) {
                string = "";
            }
            ((MainActivity) interfaceC6718c).m3908c();
            if (AbstractC5855p.m5382P(string)) {
                return;
            }
            mistakeDetailNewViewModel.m4162t(new C4835m1(string));
        }
    }
}
