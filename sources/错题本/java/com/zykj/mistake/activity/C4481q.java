package com.zykj.mistake.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import p145q5.InterfaceC6435f;

/* renamed from: com.zykj.mistake.activity.q */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4481q {

    /* renamed from: a */
    public final /* synthetic */ MistakeCreateOrEditActivity f5933a;

    /* renamed from: b */
    public final /* synthetic */ Uri f5934b;

    /* renamed from: c */
    public final /* synthetic */ String f5935c;

    /* renamed from: d */
    public final /* synthetic */ String f5936d;

    public /* synthetic */ C4481q(MistakeCreateOrEditActivity mistakeCreateOrEditActivity, Uri uri, String str, String str2) {
        this.f5933a = mistakeCreateOrEditActivity;
        this.f5934b = uri;
        this.f5935c = str;
        this.f5936d = str2;
    }

    /* renamed from: a */
    public final void m3946a(InterfaceC6435f interfaceC6435f) throws IOException {
        String absolutePath;
        String str = this.f5935c;
        int i = MistakeCreateOrEditActivity.f5799u;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f5933a.getContentResolver().openInputStream(this.f5934b));
        AbstractC5830k.m5329f(bitmapDecodeStream, "decodeStream(...)");
        String fileName = this.f5936d;
        AbstractC5830k.m5330g(fileName, "fileName");
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str, fileName);
            if (file2.exists()) {
                file2.delete();
            } else {
                file2.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.close();
            bitmapDecodeStream.recycle();
            absolutePath = file2.getAbsolutePath();
            AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            absolutePath = "";
            interfaceC6435f.onNext(absolutePath);
            interfaceC6435f.onComplete();
        } catch (IOException e4) {
            e4.printStackTrace();
            absolutePath = "";
            interfaceC6435f.onNext(absolutePath);
            interfaceC6435f.onComplete();
        }
        interfaceC6435f.onNext(absolutePath);
        interfaceC6435f.onComplete();
    }
}
