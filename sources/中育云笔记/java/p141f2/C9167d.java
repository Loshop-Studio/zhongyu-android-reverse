package p141f2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Log;
import anetwork.channel.download.DownloadManager;
import com.friday.common.helper.JudgeException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.AbstractC9979u;
import org.tensorflow.lite.C10588b;
import p265nd.AbstractC10410o;

/* renamed from: f2.d */
/* loaded from: classes3.dex */
public final class C9167d {

    /* renamed from: c */
    public static Context f21409c;

    /* renamed from: d */
    public static C10588b f21410d;

    /* renamed from: e */
    public static boolean f21411e;

    /* renamed from: a */
    public static final C9167d f21407a = new C9167d();

    /* renamed from: b */
    public static String f21408b = "ImageSafetyHelper";

    /* renamed from: f */
    public static final int f21412f = 8;

    /* renamed from: a */
    public final ByteBuffer m18063a(Bitmap bitmap) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(602112);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocateDirect.rewind();
        int[] iArr = new int[50176];
        bitmap.getPixels(iArr, 0, 224, AbstractC10410o.m21752e((bitmap.getHeight() - 224) / 2, 0), AbstractC10410o.m21752e((bitmap.getWidth() - 224) / 2, 0), 224, 224);
        for (int i10 = 0; i10 < 50176; i10++) {
            int i11 = iArr[i10];
            byteBufferAllocateDirect.putFloat(Color.blue(i11) + DownloadManager.ERROR_EXCEPTION_HAPPEN);
            byteBufferAllocateDirect.putFloat(Color.green(i11) - 117);
            byteBufferAllocateDirect.putFloat(Color.red(i11) - 123);
        }
        AbstractC9979u.m20291d(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    /* renamed from: b */
    public final void m18064b(Context app) throws IOException, JudgeException {
        AbstractC9979u.m20294g(app, "app");
        if (f21411e && f21409c == null) {
            f21409c = app;
            C10588b.a aVar = new C10588b.a();
            aVar.m22406a(4);
            try {
                Context context = f21409c;
                AbstractC9979u.m20291d(context);
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd("nsfw.tflite");
                f21410d = new C10588b(new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength()), aVar);
            } catch (FileNotFoundException unused) {
                f21409c = null;
                Log.e(f21408b, "TfLiteJudge initialize failure.");
                throw new JudgeException("Could not load model: nsfw.tflite");
            }
        }
    }

    /* renamed from: c */
    // RE: assets/nsfw.tflite 的输入为 1×224×224×3 float32，输出为两个 float32。
    // 本方法先缩放位图，再交由 m18063a 裁取中心并按蓝、绿、红顺序写入模型输入。
    public final float[] m18065c(Bitmap bitmap) throws JudgeException {
        float[] fArr;
        if (f21409c == null) {
            throw new JudgeException("TfLiteJudge has not initialized yet.");
        }
        C9167d c9167d = f21407a;
        ByteBuffer byteBufferM18063a = c9167d.m18063a(Bitmap.createScaledBitmap(bitmap, 256, 256, true));
        float[][] fArr2 = {new float[2]};
        synchronized (c9167d) {
            try {
                C10588b c10588b = f21410d;
                if (c10588b == null) {
                    AbstractC9979u.m20312y("mInterpreter");
                    c10588b = null;
                }
                c10588b.m22404f(byteBufferM18063a, fArr2);
                fArr = fArr2[0];
            } catch (Throwable th) {
                throw th;
            }
        }
        return fArr;
    }

    /* renamed from: d */
    public final float[] m18066d(String filePath) {
        AbstractC9979u.m20294g(filePath, "filePath");
        if (!f21411e) {
            return new float[]{1.0f, 0.0f};
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(filePath);
        AbstractC9979u.m20293f(bitmapDecodeFile, "decodeFile(...)");
        return m18065c(bitmapDecodeFile);
    }
}
