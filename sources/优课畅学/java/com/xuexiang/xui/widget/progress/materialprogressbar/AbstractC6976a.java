package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6976a {

    /* renamed from: a */
    public static final Path f8109a;

    /* renamed from: b */
    public static final Path f8110b;

    /* renamed from: c */
    public static final Path f8111c;

    /* renamed from: d */
    public static final Path f8112d;

    static {
        Path path = new Path();
        f8109a = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        f8110b = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        f8111c = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        f8112d = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 3, list:
          (r1v1 ?? I:android.animation.ObjectAnimator) from 0x000e: INVOKE (r1v1 ?? I:android.animation.ObjectAnimator), (r2v1 ?? I:long) VIRTUAL call: android.animation.ObjectAnimator.setDuration(long):android.animation.ObjectAnimator A[MD:(long):android.animation.ObjectAnimator (c)] (LINE:15)
          (r1v1 ?? I:android.animation.ValueAnimator) from 0x0017: INVOKE (r1v1 ?? I:android.animation.ValueAnimator), (r4v1 ?? I:int) VIRTUAL call: android.animation.ValueAnimator.setRepeatCount(int):void A[MD:(int):void (c)] (LINE:24)
          (r1v1 ?? I:??[OBJECT, ARRAY]) from 0x004f: APUT (r3v1 ?? I:??[OBJECT, ARRAY][]), (r4v2 ?? I:??[int, short, byte, char]), (r1v1 ?? I:??[OBJECT, ARRAY]) (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: a */
    public static android.animation.Animator m7117a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 3, list:
          (r1v1 ?? I:android.animation.ObjectAnimator) from 0x000e: INVOKE (r1v1 ?? I:android.animation.ObjectAnimator), (r2v1 ?? I:long) VIRTUAL call: android.animation.ObjectAnimator.setDuration(long):android.animation.ObjectAnimator A[MD:(long):android.animation.ObjectAnimator (c)] (LINE:15)
          (r1v1 ?? I:android.animation.ValueAnimator) from 0x0017: INVOKE (r1v1 ?? I:android.animation.ValueAnimator), (r4v1 ?? I:int) VIRTUAL call: android.animation.ValueAnimator.setRepeatCount(int):void A[MD:(int):void (c)] (LINE:24)
          (r1v1 ?? I:??[OBJECT, ARRAY]) from 0x004f: APUT (r3v1 ?? I:??[OBJECT, ARRAY][]), (r4v2 ?? I:??[int, short, byte, char]), (r1v1 ?? I:??[OBJECT, ARRAY]) (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 6, list:
          (r0v1 ?? I:android.animation.ObjectAnimator) from 0x000b: INVOKE (r0v1 ?? I:android.animation.ObjectAnimator), (r3v0 ?? I:long) VIRTUAL call: android.animation.ObjectAnimator.setDuration(long):android.animation.ObjectAnimator A[MD:(long):android.animation.ObjectAnimator (c)] (LINE:12)
          (r0v1 ?? I:android.animation.ValueAnimator) from 0x0014: INVOKE (r0v1 ?? I:android.animation.ValueAnimator), (r1v2 ?? I:int) VIRTUAL call: android.animation.ValueAnimator.setRepeatCount(int):void A[MD:(int):void (c)] (LINE:21)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from 0x0024: INVOKE 
          (r7v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$1)
          (r2v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener)
         VIRTUAL call: com.tencent.smtt.audio.core.db.ApnHelper.1.<init>(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void A[MD:(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void (m)] (LINE:37)
          (r0v1 ?? I:boolean) from 0x002c: INVOKE (r1v3 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener), (r0v1 ?? I:boolean) DIRECT call: com.tencent.smtt.audio.core.db.ApnHelper.PlayListApnTypeListener.onResult(boolean):void A[MD:(boolean):void (s)] (LINE:45)
          (r0v1 ?? I:??[OBJECT, ARRAY]) from 0x0033: APUT (r2v3 ?? I:??[OBJECT, ARRAY][]), (r3v1 ?? I:??[int, short, byte, char]), (r0v1 ?? I:??[OBJECT, ARRAY]) (LINE:52)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from CONSTRUCTOR 
          (r1v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener)
         (LINE:17) call: com.tencent.smtt.audio.core.db.ApnHelper.1.<init>(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: b */
    public static android.animation.Animator m7118b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 6, list:
          (r0v1 ?? I:android.animation.ObjectAnimator) from 0x000b: INVOKE (r0v1 ?? I:android.animation.ObjectAnimator), (r3v0 ?? I:long) VIRTUAL call: android.animation.ObjectAnimator.setDuration(long):android.animation.ObjectAnimator A[MD:(long):android.animation.ObjectAnimator (c)] (LINE:12)
          (r0v1 ?? I:android.animation.ValueAnimator) from 0x0014: INVOKE (r0v1 ?? I:android.animation.ValueAnimator), (r1v2 ?? I:int) VIRTUAL call: android.animation.ValueAnimator.setRepeatCount(int):void A[MD:(int):void (c)] (LINE:21)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from 0x0024: INVOKE 
          (r7v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$1)
          (r2v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener)
         VIRTUAL call: com.tencent.smtt.audio.core.db.ApnHelper.1.<init>(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void A[MD:(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void (m)] (LINE:37)
          (r0v1 ?? I:boolean) from 0x002c: INVOKE (r1v3 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener), (r0v1 ?? I:boolean) DIRECT call: com.tencent.smtt.audio.core.db.ApnHelper.PlayListApnTypeListener.onResult(boolean):void A[MD:(boolean):void (s)] (LINE:45)
          (r0v1 ?? I:??[OBJECT, ARRAY]) from 0x0033: APUT (r2v3 ?? I:??[OBJECT, ARRAY][]), (r3v1 ?? I:??[int, short, byte, char]), (r0v1 ?? I:??[OBJECT, ARRAY]) (LINE:52)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from CONSTRUCTOR 
          (r1v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener)
         (LINE:17) call: com.tencent.smtt.audio.core.db.ApnHelper.1.<init>(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 6, list:
          (r0v1 ?? I:android.animation.ObjectAnimator) from 0x000b: INVOKE (r0v1 ?? I:android.animation.ObjectAnimator), (r3v0 ?? I:long) VIRTUAL call: android.animation.ObjectAnimator.setDuration(long):android.animation.ObjectAnimator A[MD:(long):android.animation.ObjectAnimator (c)] (LINE:12)
          (r0v1 ?? I:android.animation.ValueAnimator) from 0x0014: INVOKE (r0v1 ?? I:android.animation.ValueAnimator), (r1v2 ?? I:int) VIRTUAL call: android.animation.ValueAnimator.setRepeatCount(int):void A[MD:(int):void (c)] (LINE:21)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from 0x0024: INVOKE 
          (r7v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$1)
          (r2v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener)
         VIRTUAL call: com.tencent.smtt.audio.core.db.ApnHelper.1.<init>(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void A[MD:(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void (m)] (LINE:37)
          (r0v1 ?? I:boolean) from 0x002c: INVOKE (r1v3 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener), (r0v1 ?? I:boolean) DIRECT call: com.tencent.smtt.audio.core.db.ApnHelper.PlayListApnTypeListener.onResult(boolean):void A[MD:(boolean):void (s)] (LINE:45)
          (r0v1 ?? I:??[OBJECT, ARRAY]) from 0x0033: APUT (r2v3 ?? I:??[OBJECT, ARRAY][]), (r3v1 ?? I:??[int, short, byte, char]), (r0v1 ?? I:??[OBJECT, ARRAY]) (LINE:52)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from CONSTRUCTOR 
          (r1v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener)
         (LINE:17) call: com.tencent.smtt.audio.core.db.ApnHelper.1.<init>(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: c */
    public static android.animation.Animator m7119c(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 6, list:
          (r0v1 ?? I:android.animation.ObjectAnimator) from 0x000b: INVOKE (r0v1 ?? I:android.animation.ObjectAnimator), (r3v0 ?? I:long) VIRTUAL call: android.animation.ObjectAnimator.setDuration(long):android.animation.ObjectAnimator A[MD:(long):android.animation.ObjectAnimator (c)] (LINE:12)
          (r0v1 ?? I:android.animation.ValueAnimator) from 0x0014: INVOKE (r0v1 ?? I:android.animation.ValueAnimator), (r1v2 ?? I:int) VIRTUAL call: android.animation.ValueAnimator.setRepeatCount(int):void A[MD:(int):void (c)] (LINE:21)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from 0x0024: INVOKE 
          (r7v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$1)
          (r2v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener)
         VIRTUAL call: com.tencent.smtt.audio.core.db.ApnHelper.1.<init>(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void A[MD:(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void (m)] (LINE:37)
          (r0v1 ?? I:boolean) from 0x002c: INVOKE (r1v3 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener), (r0v1 ?? I:boolean) DIRECT call: com.tencent.smtt.audio.core.db.ApnHelper.PlayListApnTypeListener.onResult(boolean):void A[MD:(boolean):void (s)] (LINE:45)
          (r0v1 ?? I:??[OBJECT, ARRAY]) from 0x0033: APUT (r2v3 ?? I:??[OBJECT, ARRAY][]), (r3v1 ?? I:??[int, short, byte, char]), (r0v1 ?? I:??[OBJECT, ARRAY]) (LINE:52)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from CONSTRUCTOR 
          (r1v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper)
          (r0v1 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener)
         (LINE:17) call: com.tencent.smtt.audio.core.db.ApnHelper.1.<init>(com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 ??, still in use, count: 3, list:
          (r2v1 ?? I:android.animation.ObjectAnimator) from 0x000e: INVOKE (r2v1 ?? I:android.animation.ObjectAnimator), (r0v2 ?? I:long) VIRTUAL call: android.animation.ObjectAnimator.setDuration(long):android.animation.ObjectAnimator A[MD:(long):android.animation.ObjectAnimator (c)] (LINE:15)
          (r2v1 ?? I:android.animation.ValueAnimator) from 0x0017: INVOKE (r2v1 ?? I:android.animation.ValueAnimator), (r0v4 ?? I:int) VIRTUAL call: android.animation.ValueAnimator.setRepeatCount(int):void A[MD:(int):void (c)] (LINE:24)
          (r2v1 ?? I:android.animation.Animator) from 0x001a: RETURN (r2v1 ?? I:android.animation.Animator) (LINE:27)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: d */
    public static android.animation.Animator m7120d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 ??, still in use, count: 3, list:
          (r2v1 ?? I:android.animation.ObjectAnimator) from 0x000e: INVOKE (r2v1 ?? I:android.animation.ObjectAnimator), (r0v2 ?? I:long) VIRTUAL call: android.animation.ObjectAnimator.setDuration(long):android.animation.ObjectAnimator A[MD:(long):android.animation.ObjectAnimator (c)] (LINE:15)
          (r2v1 ?? I:android.animation.ValueAnimator) from 0x0017: INVOKE (r2v1 ?? I:android.animation.ValueAnimator), (r0v4 ?? I:int) VIRTUAL call: android.animation.ValueAnimator.setRepeatCount(int):void A[MD:(int):void (c)] (LINE:24)
          (r2v1 ?? I:android.animation.Animator) from 0x001a: RETURN (r2v1 ?? I:android.animation.Animator) (LINE:27)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
