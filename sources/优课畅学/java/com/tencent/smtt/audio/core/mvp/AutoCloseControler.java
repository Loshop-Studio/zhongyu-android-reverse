package com.tencent.smtt.audio.core.mvp;

import android.os.Handler;
import android.os.Message;
import com.tencent.smtt.audio.export.AudioLog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: libtbs.audio_base.jar.so:com/tencent/smtt/audio/core/mvp/AutoCloseControler.class */
public class AutoCloseControler {
    private static AutoCloseControler instance = null;
    private static final int MSG_RELEASE_PLAYER = 1;
    AutoCloseTask autoClose = null;
    public Timer timer = null;
    private boolean needResetAutoPlay = false;
    Handler handler = new Handler() { // from class: com.tencent.smtt.audio.core.mvp.AutoCloseControler.1
        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    AudioLog.i("exit by auto close");
                    AudioPresenterImpl.getInstance().exit();
                    break;
            }
            super.handleMessage(msg);
        }
    };

    private AutoCloseControler() {
    }

    public static AutoCloseControler getInstance() {
        synchronized (AutoCloseControler.class) {
            if (instance == null) {
                instance = new AutoCloseControler();
            }
        }
        return instance;
    }

    public void initTimer() {
        this.timer = new Timer();
    }

    /* loaded from: libtbs.audio_base.jar.so:com/tencent/smtt/audio/core/mvp/AutoCloseControler$AutoCloseTask.class */
    class AutoCloseTask extends TimerTask {
        AutoCloseTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AutoCloseControler.this.handler.sendEmptyMessage(1);
        }
    }

    public void destroy() {
        try {
            if (this.timer != null) {
                this.timer.cancel();
            }
            this.timer = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAudioCloseTime(int time) {
        if (this.timer == null) {
            initTimer();
        }
        if (this.autoClose != null) {
            this.autoClose.cancel();
        }
        if (time == -1 || time == 0) {
            return;
        }
        this.autoClose = new AutoCloseTask();
        this.timer.schedule(this.autoClose, time);
    }

    public boolean needResetAutoCloseBtn() {
        if (this.needResetAutoPlay) {
            this.needResetAutoPlay = false;
            return true;
        }
        return true;
    }

    public void resetAutoClostStatus() {
        this.needResetAutoPlay = true;
    }
}
