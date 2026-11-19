package com.zykj.blackboard.core.edit;

import android.media.MediaPlayer;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.listener.MicroPhoneListener;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p121n1.C6210a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000e\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0013\u001a\u00020\u000626\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/AudioControl;", "", "<init>", "()V", "", "path", "Ld6/s;", "initDirPath", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "fileName", "callback", "startRecord", "(Lr6/c;)V", "Lkotlin/Function2;", "", TypedValues.TransitionType.S_DURATION, "stopRecord", "(Lr6/e;)V", "Lcom/zykj/blackboard/listener/MicroPhoneListener;", "microPhoneListener", "setListener", "(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V", "", "<set-?>", "isMicroTurnOn", "Z", "()Z", "Ln1/a;", "mp3Recorder", "Ln1/a;", "Ljava/io/File;", "audioFile", "Ljava/io/File;", "dir", "Ljava/lang/String;", "listener", "Lcom/zykj/blackboard/listener/MicroPhoneListener;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AudioControl {

    @Nullable
    private File audioFile;
    private String dir;
    private boolean isMicroTurnOn;

    @Nullable
    private MicroPhoneListener listener;

    @Nullable
    private C6210a mp3Recorder;

    public final void initDirPath(@NotNull String path) {
        AbstractC5830k.m5330g(path, "path");
        this.dir = path;
    }

    /* renamed from: isMicroTurnOn, reason: from getter */
    public final boolean getIsMicroTurnOn() {
        return this.isMicroTurnOn;
    }

    public final void setListener(@NotNull MicroPhoneListener microPhoneListener) {
        AbstractC5830k.m5330g(microPhoneListener, "microPhoneListener");
        this.listener = microPhoneListener;
    }

    public final void startRecord(@NotNull InterfaceC6471c callback) {
        AbstractC5830k.m5330g(callback, "callback");
        C6210a c6210a = this.mp3Recorder;
        if (c6210a == null) {
            this.mp3Recorder = new C6210a();
        } else {
            Log.d("Mp3Recorder", "stop recording");
            c6210a.m5844a();
        }
        try {
            String str = UUID.randomUUID() + ".mp3";
            String str2 = this.dir;
            if (str2 == null) {
                AbstractC5830k.m5339p("dir");
                throw null;
            }
            File file = new File(str2, str);
            this.audioFile = file;
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            C6210a c6210a2 = this.mp3Recorder;
            if (c6210a2 != null) {
                c6210a2.m5847d(this.audioFile);
            }
            this.isMicroTurnOn = true;
            MicroPhoneListener microPhoneListener = this.listener;
            if (microPhoneListener != null) {
                microPhoneListener.turnOnMicroPhone();
            }
            callback.invoke(str);
        } catch (Exception e) {
            Log.e("SoundRecord", "soundStartRecording Exception " + e.getMessage());
        }
    }

    public final void stopRecord(@NotNull InterfaceC6473e callback) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC5830k.m5330g(callback, "callback");
        C6210a c6210a = this.mp3Recorder;
        if (c6210a == null) {
            return;
        }
        try {
            if (c6210a.m5846c()) {
                C6210a c6210a2 = this.mp3Recorder;
                AbstractC5830k.m5327d(c6210a2);
                Log.d("Mp3Recorder", "stop recording");
                c6210a2.m5844a();
            }
            this.isMicroTurnOn = false;
            MicroPhoneListener microPhoneListener = this.listener;
            if (microPhoneListener != null) {
                microPhoneListener.turnOffMicroPhone();
            }
            this.mp3Recorder = null;
            File file = this.audioFile;
            if (file != null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setDataSource(file.getAbsolutePath());
                mediaPlayer.prepare();
                String name = file.getName();
                AbstractC5830k.m5329f(name, "it.name");
                callback.invoke(name, Long.valueOf(mediaPlayer.getDuration()));
            }
        } catch (Exception e) {
            this.mp3Recorder = null;
            File file2 = this.audioFile;
            if (file2 != null && file2.exists()) {
                File file3 = this.audioFile;
                AbstractC5830k.m5327d(file3);
                file3.delete();
            }
            Log.e("SoundRecord", "soundStopRecording Exception " + e.getMessage());
        }
    }
}
