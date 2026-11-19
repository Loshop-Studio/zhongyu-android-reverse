package com.zykj.blackboard.core.record.dataRecorder;

import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPaint$Paint;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.zykj.blackboard.core.record.dataRecorder.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC4343g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f5307a;

    /* renamed from: b */
    public final /* synthetic */ CommandRecord f5308b;

    /* renamed from: c */
    public final /* synthetic */ long f5309c;

    /* renamed from: d */
    public final /* synthetic */ Object f5310d;

    /* renamed from: e */
    public final /* synthetic */ Object f5311e;

    public /* synthetic */ CallableC4343g(CommandRecord commandRecord, long j7, EzyMatrix$Matrix ezyMatrix$Matrix, EzyMatrix$Matrix ezyMatrix$Matrix2) {
        this.f5307a = 1;
        this.f5308b = commandRecord;
        this.f5309c = j7;
        this.f5310d = ezyMatrix$Matrix;
        this.f5311e = ezyMatrix$Matrix2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5307a) {
            case 0:
                return CommandRecord.m13804addGraphMatrix$lambda13((List) this.f5310d, this.f5308b, this.f5309c, (List) this.f5311e);
            case 1:
                return CommandRecord.m13797addCamera$lambda17(this.f5308b, this.f5309c, (EzyMatrix$Matrix) this.f5310d, (EzyMatrix$Matrix) this.f5311e);
            default:
                return CommandRecord.m13807moveCursor$lambda25((List) this.f5310d, this.f5308b, this.f5309c, (EzyPaint$Paint) this.f5311e);
        }
    }

    public /* synthetic */ CallableC4343g(List list, CommandRecord commandRecord, long j7, Object obj, int i) {
        this.f5307a = i;
        this.f5310d = list;
        this.f5308b = commandRecord;
        this.f5309c = j7;
        this.f5311e = obj;
    }
}
