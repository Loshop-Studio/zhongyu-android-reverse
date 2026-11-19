package com.alibaba.sdk.android.push.channel;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;

@TargetApi(21)
/* loaded from: classes3.dex */
public class KeepChannelService extends JobService {

    /* renamed from: a */
    private static final AmsLogger f4220a = AmsLogger.getLogger("MPS:KeepChannelService");

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        f4220a.m3417d("keepScheduleService start");
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        f4220a.m3417d("keepScheduleService stoped");
        return false;
    }
}
