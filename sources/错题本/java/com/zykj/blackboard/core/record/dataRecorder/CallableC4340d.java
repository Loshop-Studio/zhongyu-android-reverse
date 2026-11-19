package com.zykj.blackboard.core.record.dataRecorder;

import com.google.protobuf.GeneratedMessageV3;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyRectF$RectF;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.zykj.blackboard.core.record.dataRecorder.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC4340d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f5287a = 0;

    /* renamed from: b */
    public final /* synthetic */ CommandRecord f5288b;

    /* renamed from: c */
    public final /* synthetic */ long f5289c;

    /* renamed from: d */
    public final /* synthetic */ Object f5290d;

    /* renamed from: e */
    public final /* synthetic */ GeneratedMessageV3 f5291e;

    /* renamed from: f */
    public final /* synthetic */ Serializable f5292f;

    public /* synthetic */ CallableC4340d(CommandRecord commandRecord, long j7, EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum, EzyRectF$RectF ezyRectF$RectF, String str) {
        this.f5288b = commandRecord;
        this.f5289c = j7;
        this.f5290d = ezyGraphEnum$GraphEnum;
        this.f5291e = ezyRectF$RectF;
        this.f5292f = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5287a) {
            case 0:
                return CommandRecord.m13799addCommand$lambda1(this.f5288b, this.f5289c, (EzyGraphEnum$GraphEnum) this.f5290d, (EzyRectF$RectF) this.f5291e, (String) this.f5292f);
            default:
                return CommandRecord.m13798addCameraMatrix$lambda15((List) this.f5290d, this.f5288b, this.f5289c, (EzyMatrix$Matrix) this.f5291e, (EzyMatrix$Matrix) this.f5292f);
        }
    }

    public /* synthetic */ CallableC4340d(List list, CommandRecord commandRecord, long j7, EzyMatrix$Matrix ezyMatrix$Matrix, EzyMatrix$Matrix ezyMatrix$Matrix2) {
        this.f5290d = list;
        this.f5288b = commandRecord;
        this.f5289c = j7;
        this.f5291e = ezyMatrix$Matrix;
        this.f5292f = ezyMatrix$Matrix2;
    }
}
