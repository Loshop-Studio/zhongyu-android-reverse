package com.zykj.blackboard.utils;

import android.util.Log;
import com.blankj.utilcode.constant.CacheConstants;
import io.microshow.rxffmpeg.RxFFmpegInvoke;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class AudioUtils {

    /* renamed from: a */
    public static final AudioUtils f9131a = new AudioUtils();

    /* renamed from: com.zykj.blackboard.utils.AudioUtils$a */
    public static final class C7067a implements RxFFmpegInvoke.IFFmpegListener {

        /* renamed from: a */
        public final /* synthetic */ Function1 f9132a;

        public C7067a(Function1 function1) {
            this.f9132a = function1;
        }

        @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
        public void onCancel() {
            Log.i("AudioUtils", "audioCut -> cancel");
        }

        @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
        public void onError(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("audioCut -> onError: ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.i("AudioUtils", sb.toString());
            this.f9132a.invoke(Boolean.FALSE);
        }

        @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
        public void onFinish() {
            Log.i("AudioUtils", "audioCut -> finish");
            this.f9132a.invoke(Boolean.TRUE);
        }

        @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
        public void onProgress(int i9, long j9) {
            Log.i("AudioUtils", "audioCut -> progress: " + i9 + ", progressTime -> " + j9);
        }
    }

    /* renamed from: a */
    public final void m8011a(String path, String startTime, String duration) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(duration, "duration");
        final File file = new File(path);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "srcFile.name");
        String name2 = file.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "srcFile.name");
        String strSubstring = name.substring(StringsKt.indexOf$default((CharSequence) name2, ".", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        final File file2 = new File(file.getParent(), "cache" + strSubstring);
        if (file.renameTo(file2)) {
            String absolutePath = file2.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "cacheFile.absolutePath");
            m8012b(absolutePath, path, startTime, duration, new Function1<Boolean, Unit>() { // from class: com.zykj.blackboard.utils.AudioUtils$audioCut$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z9) {
                    if (z9) {
                        file2.delete();
                    } else {
                        file2.renameTo(file);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void m8012b(String srcPath, String dstPath, String startTime, String duration, Function1 callback) {
        Intrinsics.checkNotNullParameter(srcPath, "srcPath");
        Intrinsics.checkNotNullParameter(dstPath, "dstPath");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object[] array = StringsKt.split$default((CharSequence) ("ffmpeg -y -i " + srcPath + " -ss " + startTime + " -t " + duration + " -acodec copy " + dstPath), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Log.i("AudioUtils", String.valueOf(RxFFmpegInvoke.getInstance().runCommand((String[]) array, new C7067a(callback))));
    }

    /* renamed from: c */
    public final String m8013c(long j9) {
        long j10 = 1000;
        long j11 = j9 % j10;
        long j12 = j9 / j10;
        long j13 = CacheConstants.HOUR;
        long j14 = j12 / j13;
        long j15 = j12 - (j13 * j14);
        long j16 = 60;
        long j17 = j15 / j16;
        long j18 = j15 - (j16 * j17);
        StringBuilder sb = new StringBuilder();
        sb.append(j14);
        sb.append(':');
        sb.append(j17);
        sb.append(':');
        sb.append(j18);
        sb.append('.');
        sb.append(j11);
        return sb.toString();
    }
}
