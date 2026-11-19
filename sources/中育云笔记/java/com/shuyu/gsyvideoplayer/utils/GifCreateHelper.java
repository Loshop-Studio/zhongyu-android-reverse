package com.shuyu.gsyvideoplayer.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p236l7.InterfaceC10153c;
import p236l7.InterfaceC10156f;

/* loaded from: classes5.dex */
public class GifCreateHelper {
    private int mDelay;
    private int mFrequencyCount;
    private InterfaceC10153c mGSYVideoGifSaveListener;
    private List<String> mPicList;
    private StandardGSYVideoPlayer mPlayer;
    private int mSampleSize;
    private boolean mSaveShotBitmapSuccess;
    private int mScaleSize;
    private Timer mTimer;
    private TaskLocal mTimerTask;
    private File mTmpPath;

    public class TaskLocal extends TimerTask {
        private TaskLocal() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (GifCreateHelper.this.mSaveShotBitmapSuccess) {
                GifCreateHelper.this.mSaveShotBitmapSuccess = false;
                GifCreateHelper.this.startSaveBitmap();
            }
        }
    }

    public GifCreateHelper(StandardGSYVideoPlayer standardGSYVideoPlayer, InterfaceC10153c interfaceC10153c) {
        this(standardGSYVideoPlayer, interfaceC10153c, 0, 1, 5, 50);
    }

    public static /* synthetic */ InterfaceC10153c access$500(GifCreateHelper gifCreateHelper) {
        gifCreateHelper.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSaveBitmap() {
        this.mPlayer.saveFrame(new File(this.mTmpPath, "GSY-TMP-FRAME" + System.currentTimeMillis() + ".tmp"), new InterfaceC10156f() { // from class: com.shuyu.gsyvideoplayer.utils.GifCreateHelper.2
            @Override // p236l7.InterfaceC10156f
            public void result(boolean z10, File file) {
                GifCreateHelper.this.mSaveShotBitmapSuccess = true;
                if (z10) {
                    Debuger.printfError(" SUCCESS CREATE FILE " + file.getAbsolutePath());
                    GifCreateHelper.this.mPicList.add(file.getAbsolutePath());
                }
            }
        });
    }

    public void cancelTask() {
        TaskLocal taskLocal = this.mTimerTask;
        if (taskLocal != null) {
            taskLocal.cancel();
            this.mTimerTask = null;
        }
    }

    public void createGif(File file, List<String> list, int i10, int i11, int i12, InterfaceC10153c interfaceC10153c) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AnimatedGifEncoder animatedGifEncoder = new AnimatedGifEncoder();
        animatedGifEncoder.start(byteArrayOutputStream);
        animatedGifEncoder.setRepeat(0);
        animatedGifEncoder.setDelay(i10);
        int i13 = 0;
        while (i13 < list.size()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i11;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(list.get(i13), options);
            double d10 = i12;
            double d11 = options.outWidth / d10;
            double d12 = options.outHeight / d10;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(list.get(i13), options);
            Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmapDecodeFile, (int) d11, (int) d12);
            animatedGifEncoder.addFrame(bitmapExtractThumbnail);
            bitmapDecodeFile.recycle();
            bitmapExtractThumbnail.recycle();
            i13++;
            interfaceC10153c.m21194a(i13, list.size());
        }
        animatedGifEncoder.finish();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.flush();
            fileOutputStream.flush();
            byteArrayOutputStream.close();
            fileOutputStream.close();
            interfaceC10153c.result(true, file);
        } catch (IOException e10) {
            e10.printStackTrace();
            interfaceC10153c.result(false, file);
        }
    }

    public void startGif(File file) {
        this.mTmpPath = file;
        cancelTask();
        this.mPicList.clear();
        TaskLocal taskLocal = new TaskLocal();
        this.mTimerTask = taskLocal;
        this.mTimer.schedule(taskLocal, 0L, this.mFrequencyCount);
    }

    public void stopGif(final File file) {
        cancelTask();
        this.mSaveShotBitmapSuccess = true;
        new Thread(new Runnable() { // from class: com.shuyu.gsyvideoplayer.utils.GifCreateHelper.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                if (GifCreateHelper.this.mPicList.size() <= 2) {
                    GifCreateHelper.access$500(GifCreateHelper.this);
                    throw null;
                }
                GifCreateHelper gifCreateHelper = GifCreateHelper.this;
                File file2 = file;
                List<String> list = gifCreateHelper.mPicList;
                int i10 = GifCreateHelper.this.mDelay;
                int i11 = GifCreateHelper.this.mSampleSize;
                int i12 = GifCreateHelper.this.mScaleSize;
                GifCreateHelper.access$500(GifCreateHelper.this);
                gifCreateHelper.createGif(file2, list, i10, i11, i12, null);
            }
        }).start();
    }

    public GifCreateHelper(StandardGSYVideoPlayer standardGSYVideoPlayer, InterfaceC10153c interfaceC10153c, int i10, int i11, int i12, int i13) {
        this.mSaveShotBitmapSuccess = true;
        this.mTimer = new Timer();
        this.mPicList = new ArrayList();
        this.mPlayer = standardGSYVideoPlayer;
        this.mDelay = i10;
        this.mSampleSize = i11;
        this.mScaleSize = i12;
        this.mFrequencyCount = i13;
    }
}
