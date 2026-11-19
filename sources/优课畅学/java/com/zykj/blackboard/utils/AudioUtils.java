package com.zykj.blackboard.utils;

import android.util.Log;
import io.microshow.rxffmpeg.RxFFmpegInvoke;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class AudioUtils {
    public static final AudioUtils INSTANCE = new AudioUtils();

    private AudioUtils() {
    }

    public final void audioCut(String path, String startTime, String duration) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(startTime, "startTime");
        AbstractC9133u.m16133g(duration, "duration");
        final File file = new File(path);
        String name = file.getName();
        AbstractC9133u.m16132f(name, "srcFile.name");
        String name2 = file.getName();
        AbstractC9133u.m16132f(name2, "srcFile.name");
        String strSubstring = name.substring(AbstractC8661c0.m13991f0(name2, ".", 0, false, 6, null));
        AbstractC9133u.m16132f(strSubstring, "this as java.lang.String).substring(startIndex)");
        final File file2 = new File(file.getParent(), "cache" + strSubstring);
        if (file.renameTo(file2)) {
            String absolutePath = file2.getAbsolutePath();
            AbstractC9133u.m16132f(absolutePath, "cacheFile.absolutePath");
            audioCut(absolutePath, path, startTime, duration, new InterfaceC10570l() { // from class: com.zykj.blackboard.utils.AudioUtils.audioCut.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return C8736p.f16368a;
                }

                public final void invoke(boolean z10) {
                    if (z10) {
                        file2.delete();
                    } else {
                        file2.renameTo(file);
                    }
                }
            });
        }
    }

    public final String timeFormat(long j10) {
        long j11 = 1000;
        long j12 = j10 % j11;
        long j13 = j10 / j11;
        long j14 = 3600;
        long j15 = j13 / j14;
        long j16 = j13 - (j14 * j15);
        long j17 = 60;
        long j18 = j16 / j17;
        long j19 = j16 - (j17 * j18);
        StringBuilder sb = new StringBuilder();
        sb.append(j15);
        sb.append(':');
        sb.append(j18);
        sb.append(':');
        sb.append(j19);
        sb.append('.');
        sb.append(j12);
        return sb.toString();
    }

    public final void audioCut(String srcPath, String dstPath, String startTime, String duration, final InterfaceC10570l callback) {
        AbstractC9133u.m16133g(srcPath, "srcPath");
        AbstractC9133u.m16133g(dstPath, "dstPath");
        AbstractC9133u.m16133g(startTime, "startTime");
        AbstractC9133u.m16133g(duration, "duration");
        AbstractC9133u.m16133g(callback, "callback");
        Object[] array = AbstractC8661c0.m13958I0("ffmpeg -y -i " + srcPath + " -ss " + startTime + " -t " + duration + " -acodec copy " + dstPath, new String[]{" "}, false, 0, 6, null).toArray(new String[0]);
        AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Log.i("AudioUtils", String.valueOf(RxFFmpegInvoke.getInstance().runCommand((String[]) array, new RxFFmpegInvoke.IFFmpegListener() { // from class: com.zykj.blackboard.utils.AudioUtils$audioCut$i$1
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
                callback.invoke(Boolean.FALSE);
            }

            @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
            public void onFinish() {
                Log.i("AudioUtils", "audioCut -> finish");
                callback.invoke(Boolean.TRUE);
            }

            @Override // io.microshow.rxffmpeg.RxFFmpegInvoke.IFFmpegListener
            public void onProgress(int i10, long j10) {
                Log.i("AudioUtils", "audioCut -> progress: " + i10 + ", progressTime -> " + j10);
            }
        })));
    }
}
