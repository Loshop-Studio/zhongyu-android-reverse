package com.zykj.blackboard.core.edit;

import android.media.MediaPlayer;
import android.util.Log;
import com.zykj.blackboard.listener.MicroPhoneListener;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9133u;
import p128i1.C8751a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes4.dex */
public final class AudioControl {
    private File audioFile;
    private String dir;
    private boolean isMicroTurnOn;
    private MicroPhoneListener listener;
    private C8751a mp3Recorder;

    public final void initDirPath(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.dir = path;
    }

    public final boolean isMicroTurnOn() {
        return this.isMicroTurnOn;
    }

    public final void setListener(MicroPhoneListener microPhoneListener) {
        AbstractC9133u.m16133g(microPhoneListener, "microPhoneListener");
        this.listener = microPhoneListener;
    }

    public final void startRecord(InterfaceC10570l callback) {
        AbstractC9133u.m16133g(callback, "callback");
        C8751a c8751a = this.mp3Recorder;
        if (c8751a == null) {
            this.mp3Recorder = new C8751a();
        } else if (c8751a != null) {
            c8751a.m14437n();
        }
        try {
            String str = UUID.randomUUID() + ".mp3";
            String str2 = this.dir;
            if (str2 == null) {
                AbstractC9133u.m16151y("dir");
                str2 = null;
            }
            File file = new File(str2, str);
            this.audioFile = file;
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            C8751a c8751a2 = this.mp3Recorder;
            if (c8751a2 != null) {
                c8751a2.m14436m(-1, this.audioFile);
            }
            this.isMicroTurnOn = true;
            MicroPhoneListener microPhoneListener = this.listener;
            if (microPhoneListener != null) {
                microPhoneListener.turnOnMicroPhone();
            }
            callback.invoke(str);
        } catch (Exception e10) {
            Log.e("SoundRecord", "soundStartRecording Exception " + e10.getMessage());
        }
    }

    public final void stopRecord(InterfaceC10574p callback) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9133u.m16133g(callback, "callback");
        C8751a c8751a = this.mp3Recorder;
        if (c8751a == null) {
            return;
        }
        try {
            AbstractC9133u.m16130d(c8751a);
            if (c8751a.m14435l()) {
                C8751a c8751a2 = this.mp3Recorder;
                AbstractC9133u.m16130d(c8751a2);
                c8751a2.m14437n();
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
                AbstractC9133u.m16132f(name, "it.name");
                callback.invoke(name, Long.valueOf(mediaPlayer.getDuration()));
            }
        } catch (Exception e10) {
            this.mp3Recorder = null;
            File file2 = this.audioFile;
            if (file2 != null && file2.exists()) {
                File file3 = this.audioFile;
                AbstractC9133u.m16130d(file3);
                file3.delete();
            }
            Log.e("SoundRecord", "soundStopRecording Exception " + e10.getMessage());
        }
    }
}
