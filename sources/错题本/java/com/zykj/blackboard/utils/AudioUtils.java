package com.zykj.blackboard.utils;

import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.microshow.rxffmpeg.RxFFmpegInvoke;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJA\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\t\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/blackboard/utils/AudioUtils;", "", "<init>", "()V", "", "path", "startTime", TypedValues.TransitionType.S_DURATION, "Ld6/s;", "audioCut", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "srcPath", "dstPath", "Lkotlin/Function1;", "", "callback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr6/c;)V", "", "time", "timeFormat", "(J)Ljava/lang/String;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AudioUtils {

    @NotNull
    public static final AudioUtils INSTANCE = new AudioUtils();

    private AudioUtils() {
    }

    public final void audioCut(@NotNull String path, @NotNull String startTime, @NotNull String duration) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(startTime, "startTime");
        AbstractC5830k.m5330g(duration, "duration");
        final File file = new File(path);
        String name = file.getName();
        AbstractC5830k.m5329f(name, "srcFile.name");
        String name2 = file.getName();
        AbstractC5830k.m5329f(name2, "srcFile.name");
        String strSubstring = name.substring(AbstractC5855p.m5380N(name2, ".", 0, false, 6));
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
        final File file2 = new File(file.getParent(), "cache".concat(strSubstring));
        if (file.renameTo(file2)) {
            String absolutePath = file2.getAbsolutePath();
            AbstractC5830k.m5329f(absolutePath, "cacheFile.absolutePath");
            audioCut(absolutePath, path, startTime, duration, new InterfaceC6471c() { // from class: com.zykj.blackboard.utils.AudioUtils.audioCut.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return C5443s.f8405a;
                }

                public final void invoke(boolean z8) {
                    if (z8) {
                        file2.delete();
                    } else {
                        file2.renameTo(file);
                    }
                }
            });
        }
    }

    @NotNull
    public final String timeFormat(long time) {
        long j7 = 1000;
        long j8 = time % j7;
        long j9 = time / j7;
        long j10 = 3600;
        long j11 = j9 / j10;
        long j12 = j9 - (j10 * j11);
        long j13 = 60;
        long j14 = j12 / j13;
        long j15 = j12 - (j13 * j14);
        StringBuilder sb = new StringBuilder();
        sb.append(j11);
        sb.append(':');
        sb.append(j14);
        sb.append(':');
        sb.append(j15);
        sb.append('.');
        sb.append(j8);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.zykj.blackboard.utils.AudioUtils$audioCut$i$1] */
    public final void audioCut(@NotNull String srcPath, @NotNull String dstPath, @NotNull String startTime, @NotNull String duration, @NotNull final InterfaceC6471c callback) {
        int iRunFFmpegCmd;
        AbstractC5830k.m5330g(srcPath, "srcPath");
        AbstractC5830k.m5330g(dstPath, "dstPath");
        AbstractC5830k.m5330g(startTime, "startTime");
        AbstractC5830k.m5330g(duration, "duration");
        AbstractC5830k.m5330g(callback, "callback");
        StringBuilder sb = new StringBuilder("ffmpeg -y -i ");
        AbstractC1923c.m1060x(sb, srcPath, " -ss ", startTime, " -t ");
        Object[] array = AbstractC5855p.m5394b0(AbstractC0037f.m92q(sb, duration, " -acodec copy ", dstPath), new String[]{" "}).toArray(new String[0]);
        AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        if (RxFFmpegInvoke.f8870b == null) {
            synchronized (RxFFmpegInvoke.class) {
                try {
                    if (RxFFmpegInvoke.f8870b == null) {
                        RxFFmpegInvoke.f8870b = new RxFFmpegInvoke();
                    }
                } finally {
                }
            }
        }
        RxFFmpegInvoke rxFFmpegInvoke = RxFFmpegInvoke.f8870b;
        rxFFmpegInvoke.f8871a = new Object() { // from class: com.zykj.blackboard.utils.AudioUtils$audioCut$i$1
            public void onCancel() {
                Log.i("AudioUtils", "audioCut -> cancel");
            }

            public void onError(@Nullable String message) {
                if (message == null) {
                    message = "";
                }
                Log.i("AudioUtils", "audioCut -> onError: ".concat(message));
                callback.invoke(Boolean.FALSE);
            }

            public void onFinish() {
                Log.i("AudioUtils", "audioCut -> finish");
                callback.invoke(Boolean.TRUE);
            }

            public void onProgress(int progress, long progressTime) {
                Log.i("AudioUtils", "audioCut -> progress: " + progress + ", progressTime -> " + progressTime);
            }
        };
        synchronized (RxFFmpegInvoke.class) {
            iRunFFmpegCmd = rxFFmpegInvoke.runFFmpegCmd(strArr);
            if (rxFFmpegInvoke.f8871a != null) {
                rxFFmpegInvoke.f8871a = null;
            }
        }
        Log.i("AudioUtils", String.valueOf(iRunFFmpegCmd));
    }
}
