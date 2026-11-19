package com.blankj.utilcode.util;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.ComposerKt;
import com.stormdzh.lame4android.Lame;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import com.zykj.mistake.activity.MistakeCreateOrEditActivity;
import com.zykj.mistake.activity.SketchActivity;
import com.zykj.mistake.databinding.ActivityMistakeCreateOrEditBinding;
import com.zykj.mistake.entity.req.AddPictureNoteReq;
import com.zykj.mistake.entity.req.CreateOrUpdateMistakeReq;
import com.zykj.mistake.entity.req.SetNoteReq;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.MistakeCreateOrEditPresenter;
import com.zykj.mistake.presenter.NotePresenter;
import com.zykj.mistake.presenter.SketchPresenter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5830k;
import p021b5.C3190b;
import p021b5.C3196h;
import p021b5.C3197i;
import p065g3.C5601b;
import p121n1.HandlerThreadC6212c;

/* renamed from: com.blankj.utilcode.util.h */
/* loaded from: classes2.dex */
public final class HandlerC3388h extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f2162a;

    /* renamed from: b */
    public Object f2163b;

    public /* synthetic */ HandlerC3388h() {
        this.f2162a = 1;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        switch (this.f2162a) {
            case 1:
                try {
                    ((Handler) this.f2163b).dispatchMessage(message);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                super.dispatchMessage(message);
                break;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008a -> B:154:0x008d). Please report as a decompilation issue!!! */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws IOException, NumberFormatException {
        String string;
        int i = 2;
        int i8 = 0;
        int i9 = 1;
        switch (this.f2162a) {
            case 0:
                MessengerUtils$ServerService messengerUtils$ServerService = (MessengerUtils$ServerService) this.f2163b;
                ConcurrentHashMap concurrentHashMap = messengerUtils$ServerService.f2107a;
                int i10 = msg.what;
                if (i10 == 0) {
                    concurrentHashMap.put(Integer.valueOf(msg.arg1), msg.replyTo);
                    return;
                }
                if (i10 == 1) {
                    concurrentHashMap.remove(Integer.valueOf(msg.arg1));
                    return;
                }
                if (i10 != 2) {
                    super.handleMessage(msg);
                    return;
                }
                int i11 = MessengerUtils$ServerService.f2106d;
                messengerUtils$ServerService.m2291a(msg);
                Bundle data = msg.getData();
                if (data != null && (string = data.getString("MESSENGER_UTILS")) != null && AbstractC3389i.f2164a.get(string) != null) {
                    throw new ClassCastException();
                }
                return;
            case 1:
                ((Handler) this.f2163b).handleMessage(msg);
                return;
            case 2:
                AbstractC5830k.m5330g(msg, "msg");
                int i12 = msg.what;
                if (i12 != 103) {
                    switch (i12) {
                        case ComposerKt.providerKey /* 201 */:
                            MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) this.f2163b;
                            int i13 = MistakeCreateOrEditActivity.f5799u;
                            ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6019b.setClickable(true);
                            ((MistakeCreateOrEditActivity) this.f2163b).mo3963c();
                            return;
                        case ComposerKt.compositionLocalMapKey /* 202 */:
                            MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = (MistakeCreateOrEditActivity) this.f2163b;
                            int i14 = MistakeCreateOrEditActivity.f5799u;
                            ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity2.m3957p()).f6019b.setClickable(true);
                            ((MistakeCreateOrEditActivity) this.f2163b).mo3963c();
                            return;
                        case ComposerKt.providerValuesKey /* 203 */:
                            MistakeCreateOrEditActivity mistakeCreateOrEditActivity3 = (MistakeCreateOrEditActivity) this.f2163b;
                            int i15 = MistakeCreateOrEditActivity.f5799u;
                            ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity3.m3957p()).f6019b.setClickable(true);
                            ((MistakeCreateOrEditActivity) this.f2163b).mo3963c();
                            return;
                        default:
                            return;
                    }
                }
                Bundle data2 = msg.getData();
                if (data2 != null) {
                    MistakeCreateOrEditActivity mistakeCreateOrEditActivity4 = (MistakeCreateOrEditActivity) this.f2163b;
                    String string2 = data2.getString("UPLOAD_SUCCESS_URL");
                    if (string2 == null) {
                        string2 = "";
                    }
                    String string3 = data2.getString("UPLOAD_DATA");
                    if (string3 != null) {
                        int i16 = Integer.parseInt(string3);
                        int i17 = MistakeCreateOrEditActivity.f5799u;
                        synchronized (mistakeCreateOrEditActivity4) {
                            try {
                                Log.i("uploadImage", "End2: path--->> " + string2 + ", tag--->> " + i16);
                                if (i16 < 2) {
                                    String stemShoot = mistakeCreateOrEditActivity4.f5813r.getStemShoot();
                                    AbstractC5830k.m5327d(stemShoot);
                                    if (stemShoot.length() == 0 || i16 == 0) {
                                        mistakeCreateOrEditActivity4.f5813r.setStemShoot(string2);
                                    }
                                    if (i16 == 0) {
                                        ArrayList<String> extraStems = mistakeCreateOrEditActivity4.f5813r.getExtraStems();
                                        AbstractC5830k.m5327d(extraStems);
                                        extraStems.add(0, string2);
                                    } else {
                                        ArrayList<String> extraStems2 = mistakeCreateOrEditActivity4.f5813r.getExtraStems();
                                        AbstractC5830k.m5327d(extraStems2);
                                        extraStems2.add(string2);
                                    }
                                } else if (i16 == 2) {
                                    ArrayList<String> extraAnswers = mistakeCreateOrEditActivity4.f5813r.getExtraAnswers();
                                    AbstractC5830k.m5327d(extraAnswers);
                                    extraAnswers.add(0, string2);
                                } else {
                                    ArrayList<String> extraAnswers2 = mistakeCreateOrEditActivity4.f5813r.getExtraAnswers();
                                    AbstractC5830k.m5327d(extraAnswers2);
                                    extraAnswers2.add(string2);
                                }
                                mistakeCreateOrEditActivity4.f5812q[i16] = 2;
                                Integer[] numArr = mistakeCreateOrEditActivity4.f5812q;
                                int length = numArr.length;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= length) {
                                        if (mistakeCreateOrEditActivity4.f5810o != null) {
                                            MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter = (MistakeCreateOrEditPresenter) mistakeCreateOrEditActivity4.m3965r();
                                            CreateOrUpdateMistakeReq req = mistakeCreateOrEditActivity4.f5813r;
                                            AbstractC5830k.m5330g(req, "req");
                                            mistakeCreateOrEditPresenter.m3970b(C5088a.m4381b().m4402t(req), new C3190b(mistakeCreateOrEditPresenter, i), false);
                                        } else {
                                            MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter2 = (MistakeCreateOrEditPresenter) mistakeCreateOrEditActivity4.m3965r();
                                            CreateOrUpdateMistakeReq req2 = mistakeCreateOrEditActivity4.f5813r;
                                            AbstractC5830k.m5330g(req2, "req");
                                            C5088a c5088a = C5088a.f7986a;
                                            mistakeCreateOrEditPresenter2.m3970b(C5088a.m4381b().m4394l(req2), new C3190b(mistakeCreateOrEditPresenter2, i9), false);
                                        }
                                    } else if (numArr[i18].intValue() != 1) {
                                        i18++;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                SketchActivity sketchActivity = (SketchActivity) this.f2163b;
                AbstractC5830k.m5330g(msg, "msg");
                int i19 = msg.what;
                if (i19 == 103) {
                    Bundle data3 = msg.getData();
                    if (data3 != null) {
                        String string4 = data3.getString("UPLOAD_SUCCESS_URL");
                        SetNoteReq setNoteReq = sketchActivity.f5864o;
                        if (string4 == null || string4.length() == 0) {
                            string4 = "";
                        }
                        setNoteReq.setNote(string4);
                        SketchPresenter sketchPresenter = (SketchPresenter) sketchActivity.m3965r();
                        SetNoteReq req3 = sketchActivity.f5864o;
                        AbstractC5830k.m5330g(req3, "req");
                        sketchPresenter.m3969a(C5088a.m4381b().m4383a(req3), new C3197i(sketchPresenter, i));
                        sketchActivity.f5866q = true;
                    }
                    sketchActivity.mo3963c();
                    return;
                }
                switch (i19) {
                    case ComposerKt.providerKey /* 201 */:
                        AlertDialog alertDialog = sketchActivity.f5861l;
                        if (alertDialog == null) {
                            AbstractC5830k.m5339p("mSubmitFailedDialog");
                            throw null;
                        }
                        alertDialog.show();
                        sketchActivity.mo3963c();
                        return;
                    case ComposerKt.compositionLocalMapKey /* 202 */:
                        AlertDialog alertDialog2 = sketchActivity.f5861l;
                        if (alertDialog2 == null) {
                            AbstractC5830k.m5339p("mSubmitFailedDialog");
                            throw null;
                        }
                        alertDialog2.show();
                        sketchActivity.mo3963c();
                        return;
                    case ComposerKt.providerValuesKey /* 203 */:
                        sketchActivity.mo3963c();
                        return;
                    default:
                        return;
                }
            case 4:
                WheelView wheelView = (WheelView) this.f2163b;
                int i20 = msg.what;
                if (i20 == 1000) {
                    wheelView.invalidate();
                    return;
                }
                if (i20 != 2000) {
                    if (i20 != 3000) {
                        return;
                    }
                    wheelView.getClass();
                    return;
                }
                wheelView.m3535a();
                int i21 = (int) (((wheelView.f4605p % 0.0f) + 0.0f) % 0.0f);
                wheelView.f4607r = i21;
                float f = i21;
                if (f > 0.0f) {
                    wheelView.f4607r = (int) (0.0f - f);
                } else {
                    wheelView.f4607r = -i21;
                }
                wheelView.f4594e = wheelView.f4593d.scheduleWithFixedDelay(new C5601b(wheelView, wheelView.f4607r), 0L, 10L, TimeUnit.MILLISECONDS);
                return;
            case 5:
                HandlerThreadC6212c handlerThreadC6212c = (HandlerThreadC6212c) this.f2163b;
                if (msg.what == 1) {
                    while (handlerThreadC6212c.m5848a() > 0) {
                    }
                    removeCallbacksAndMessages(null);
                    FileOutputStream fileOutputStream = handlerThreadC6212c.f9942c;
                    byte[] bArr = handlerThreadC6212c.f9941b;
                    int iFlush = Lame.flush(bArr);
                    try {
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (iFlush > 0) {
                        try {
                            try {
                                fileOutputStream.write(bArr, 0, iFlush);
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                            Lame.close();
                        } catch (Throwable th2) {
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e8) {
                                    e8.printStackTrace();
                                }
                            }
                            Lame.close();
                            throw th2;
                        }
                    }
                    handlerThreadC6212c.f9943d.clear();
                    getLooper().quit();
                    return;
                }
                return;
            default:
                NoteFragment noteFragment = (NoteFragment) this.f2163b;
                AbstractC5830k.m5330g(msg, "msg");
                int i22 = msg.what;
                if (i22 != 103) {
                    switch (i22) {
                        case ComposerKt.providerKey /* 201 */:
                        case ComposerKt.compositionLocalMapKey /* 202 */:
                        case ComposerKt.providerValuesKey /* 203 */:
                            noteFragment.m3958b("上传失败");
                            noteFragment.mo3963c();
                            return;
                        default:
                            return;
                    }
                }
                Bundle data4 = msg.getData();
                if (data4 != null) {
                    String string5 = data4.getString("UPLOAD_SUCCESS_URL");
                    if (string5 == null) {
                        string5 = "";
                    }
                    NotePresenter notePresenter = (NotePresenter) noteFragment.m3966h();
                    AddPictureNoteReq addPictureNoteReq = new AddPictureNoteReq(noteFragment.f7783e, string5);
                    C5088a c5088a2 = C5088a.f7986a;
                    notePresenter.m3970b(C5088a.m4381b().m4399q(addPictureNoteReq), new C3196h(notePresenter, string5, i8), false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ HandlerC3388h(ComponentCallbacks componentCallbacks, int i) {
        this.f2162a = i;
        this.f2163b = componentCallbacks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC3388h(Looper looper) {
        super(looper);
        this.f2162a = 5;
    }

    public HandlerC3388h(WheelView wheelView) {
        this.f2162a = 4;
        this.f2163b = wheelView;
    }
}
