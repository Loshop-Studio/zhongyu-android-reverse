package anet.channel.fulltrace;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;

/* renamed from: anet.channel.fulltrace.a */
/* loaded from: classes3.dex */
public class C5016a {

    /* renamed from: a */
    private static volatile IFullTraceAnalysis f2434a = new a(null);

    /* renamed from: b */
    private static boolean f2435b = false;

    /* renamed from: anet.channel.fulltrace.a$a */
    public static class a implements IFullTraceAnalysis {

        /* renamed from: a */
        private IFullTraceAnalysis f2436a;

        public a(IFullTraceAnalysis iFullTraceAnalysis) {
            this.f2436a = iFullTraceAnalysis;
            boolean unused = C5016a.f2435b = true;
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public void commitRequest(String str, RequestStatistic requestStatistic) {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (C5016a.f2435b && (iFullTraceAnalysis = this.f2436a) != null) {
                try {
                    iFullTraceAnalysis.commitRequest(str, requestStatistic);
                } catch (Throwable th) {
                    boolean unused = C5016a.f2435b = false;
                    ALog.m2528e("anet.AnalysisFactory", "fulltrace commit fail.", null, th, new Object[0]);
                }
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public String createRequest() {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (C5016a.f2435b && (iFullTraceAnalysis = this.f2436a) != null) {
                try {
                    return iFullTraceAnalysis.createRequest();
                } catch (Throwable th) {
                    boolean unused = C5016a.f2435b = false;
                    ALog.m2528e("anet.AnalysisFactory", "createRequest fail.", null, th, new Object[0]);
                }
            }
            return null;
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public C5017b getSceneInfo() {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (C5016a.f2435b && (iFullTraceAnalysis = this.f2436a) != null) {
                try {
                    return iFullTraceAnalysis.getSceneInfo();
                } catch (Throwable th) {
                    boolean unused = C5016a.f2435b = false;
                    ALog.m2528e("anet.AnalysisFactory", "getSceneInfo fail", null, th, new Object[0]);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IFullTraceAnalysis m2345a() {
        return f2434a;
    }

    /* renamed from: a */
    public static void m2346a(IFullTraceAnalysis iFullTraceAnalysis) {
        f2434a = new a(iFullTraceAnalysis);
    }
}
