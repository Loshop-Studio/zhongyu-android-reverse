package com.zykj.mistake.activity;

import android.content.Intent;
import android.os.Messenger;
import com.blankj.utilcode.util.AbstractC3385e;
import com.blankj.utilcode.util.HandlerC3388h;
import com.zykj.mistake.service.UploadFolderIntentService;
import com.zykj.view.board.board.BoardFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "it", "Ld6/s;", "<anonymous>", "(Ljava/lang/String;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.activity.SketchActivity$saveData$2", m5303f = "SketchActivity.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class SketchActivity$saveData$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $dataPath;
    final /* synthetic */ InterfaceC6469a $saveSuccess;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SketchActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchActivity$saveData$2(SketchActivity sketchActivity, InterfaceC6469a interfaceC6469a, String str, InterfaceC5631c<? super SketchActivity$saveData$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = sketchActivity;
        this.$saveSuccess = interfaceC6469a;
        this.$dataPath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        SketchActivity$saveData$2 sketchActivity$saveData$2 = new SketchActivity$saveData$2(this.this$0, this.$saveSuccess, this.$dataPath, interfaceC5631c);
        sketchActivity$saveData$2.L$0 = obj;
        return sketchActivity$saveData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        C5443s c5443s = C5443s.f8405a;
        if (str == null) {
            return c5443s;
        }
        BoardFragment boardFragment = this.this$0.f5859j;
        if (boardFragment == null) {
            AbstractC5830k.m5339p("mSketchFragment");
            throw null;
        }
        List<String> pathListByImageGraph = boardFragment.getPathListByImageGraph();
        File[] fileArrListFiles = new File(str, "res/image").listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (File file : fileArrListFiles) {
                if (!pathListByImageGraph.contains(file.getAbsolutePath())) {
                    arrayList.add(file);
                }
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                AbstractC3385e.m2333e((File) obj2);
            }
        }
        this.$saveSuccess.invoke();
        String str2 = this.$dataPath;
        File fileM2335g = AbstractC3385e.m2335g(str);
        File fileM2335g2 = AbstractC3385e.m2335g(str2);
        if (fileM2335g != null) {
            if (fileM2335g.isDirectory()) {
                AbstractC3385e.m2329a(fileM2335g, fileM2335g2);
            } else {
                AbstractC3385e.m2330b(fileM2335g, fileM2335g2);
            }
        }
        SketchActivity sketchActivity = this.this$0;
        String str3 = this.$dataPath;
        sketchActivity.getClass();
        Intent intent = new Intent(sketchActivity, (Class<?>) UploadFolderIntentService.class);
        intent.putExtra("UPLOAD_PATH", str3);
        intent.putExtra("UPLOAD_MESSENGER", new Messenger(new HandlerC3388h(sketchActivity, 3)));
        sketchActivity.startService(intent);
        return c5443s;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(String str, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((SketchActivity$saveData$2) create(str, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
