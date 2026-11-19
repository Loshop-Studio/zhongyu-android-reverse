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
        for (int i10 = 0; i10 < size(); i10++) {
            strArr[i10] = get(i10);
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
            for (int i10 = 0; i10 < strArrBuild.length; i10++) {
                sb.append(strArrBuild[i10]);
                if (i10 < strArrBuild.length - 1) {
                    sb.append(" ");
                }
            }
            Log.e("TAG_FFMPEG", "cmd: " + sb.toString());
        }
        return strArrBuild;
    }
}
