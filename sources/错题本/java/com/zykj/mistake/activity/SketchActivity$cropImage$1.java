package com.zykj.mistake.activity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import androidx.navigation.C2856d;
import com.blankj.utilcode.util.AbstractC3382c;
import com.zykj.mistake.R;
import com.zykj.mistake.utils.AbstractC5099d;
import java.io.File;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.activity.SketchActivity$cropImage$1", m5303f = "SketchActivity.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class SketchActivity$cropImage$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ InterfaceC6471c $callback;
    int label;
    final /* synthetic */ SketchActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchActivity$cropImage$1(Bitmap bitmap, InterfaceC6471c interfaceC6471c, SketchActivity sketchActivity, InterfaceC5631c<? super SketchActivity$cropImage$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$bitmap = bitmap;
        this.$callback = interfaceC6471c;
        this.this$0 = sketchActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new SketchActivity$cropImage$1(this.$bitmap, this.$callback, this.this$0, interfaceC5631c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, android.net.Uri] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        Bitmap bitmap = this.$bitmap;
        C5443s c5443s = C5443s.f8405a;
        if (bitmap == null) {
            this.$callback.invoke(null);
            return c5443s;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        File cacheDir = this.this$0.getCacheDir();
        AbstractC5830k.m5327d(cacheDir);
        File file = new File(cacheDir.getAbsolutePath() + "/" + System.currentTimeMillis() + ".jpg");
        Bitmap bitmap2 = this.$bitmap;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        if (AbstractC3382c.m2313n(bitmap2, file)) {
            ref$ObjectRef.element = AbstractC3382c.m2302c(file);
        }
        T t8 = ref$ObjectRef.element;
        if (t8 != 0) {
            this.this$0.f5867r.startCrop((Uri) t8, new C2856d(3, ref$ObjectRef, this.$callback));
            return c5443s;
        }
        this.$callback.invoke(null);
        SketchActivity sketchActivity = this.this$0;
        String string = sketchActivity.getString(R.string.tips_data_insert_err);
        AbstractC5830k.m5329f(string, "getString(...)");
        Toast toast = AbstractC5099d.f8034e;
        if (toast == null) {
            Toast toastMakeText = Toast.makeText(sketchActivity, string, 0);
            toastMakeText.setGravity(81, 0, 220);
            AbstractC5099d.f8034e = toastMakeText;
        } else {
            toast.setText(string);
        }
        Toast toast2 = AbstractC5099d.f8034e;
        AbstractC5830k.m5327d(toast2);
        toast2.show();
        return c5443s;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((SketchActivity$cropImage$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
