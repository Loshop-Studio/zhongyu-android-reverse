package io.microshow.rxffmpeg;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class RxFFmpegCommandList extends ArrayList<String> {
    public RxFFmpegCommandList() {
        add("ffmpeg");
        add("-y");
    }

    public RxFFmpegCommandList append(String str) {
        add(str);
        return this;
    }

    public String[] build() {
        String[] strArr = new String[size()];
        for (int i9 = 0; i9 < size(); i9++) {
            strArr[i9] = get(i9);
        }
        return strArr;
    }

    public RxFFmpegCommandList clearCommands() {
        clear();
        return this;
    }

    public String[] build(boolean z9) {
        String[] strArrBuild = build();
        if (z9) {
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < strArrBuild.length; i9++) {
                sb.append(strArrBuild[i9]);
                if (i9 < strArrBuild.length - 1) {
                    sb.append(" ");
                }
            }
            Log.e("TAG_FFMPEG", "cmd: " + sb.toString());
        }
        return strArrBuild;
    }
}
