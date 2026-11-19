package okio;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSource buffer(Source source) {
        AbstractC9133u.m16133g(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final <T extends Closeable, R> R use(T t10, InterfaceC10570l block) throws Throwable {
        Object obj;
        AbstractC9133u.m16133g(block, "block");
        Throwable th = (R) null;
        try {
            Object objInvoke = block.invoke(t10);
            AbstractC9131s.m16125b(1);
            Throwable th2 = th;
            if (t10 != null) {
                try {
                    t10.close();
                    th2 = th;
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    java.lang.String r0 = "block"
                    kotlin.jvm.internal.AbstractC9133u.m16133g(r4, r0)
                    r0 = 1
                    r1 = 0
                    java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L1c
                    kotlin.jvm.internal.AbstractC9131s.m16125b(r0)
                    if (r3 == 0) goto L15
                    r3.close()     // Catch: java.lang.Throwable -> L14
                    goto L15
                L14:
                    r1 = move-exception
                L15:
                    kotlin.jvm.internal.AbstractC9131s.m16124a(r0)
                    r2 = r1
                    r1 = r4
                    r4 = r2
                    goto L2d
                L1c:
                    r4 = move-exception
                    kotlin.jvm.internal.AbstractC9131s.m16125b(r0)
                    if (r3 == 0) goto L2a
                    r3.close()     // Catch: java.lang.Throwable -> L26
                    goto L2a
                L26:
                    r3 = move-exception
                    p123h7.AbstractC8722b.m14228a(r4, r3)
                L2a:
                    kotlin.jvm.internal.AbstractC9131s.m16124a(r0)
                L2d:
                    if (r4 != 0) goto L30
                    return r1
                L30:
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: okio.Okio__OkioKt.use(java.io.Closeable, x7.l):java.lang.Object");
            }

            public static final BufferedSink buffer(Sink sink) {
                AbstractC9133u.m16133g(sink, "<this>");
                return new RealBufferedSink(sink);
            }
        }
