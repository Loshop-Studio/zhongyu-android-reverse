package com.zykj.gallery.oss;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.blankj.utilcode.util.AbstractC4657l0;
import com.blankj.utilcode.util.AbstractC4668s;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p058f5.AbstractC6360c0;
import p058f5.C6356a0;
import p058f5.C6358b0;
import p058f5.C6386y;
import p058f5.C6387z;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u000bJ&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7880d2 = {"Lcom/zykj/gallery/oss/UploadUtils;", "", "<init>", "()V", "SKIP_CHECKSUM", "", "uploadFile", "localPath", "uploadPath", "credential", "Lcom/zykj/gallery/oss/OssToken;", "(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/gallery/oss/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gridFsUpload", "", "zyFsUpload", "ossUpload", "getFileNameFromUrlWithRegex", "url", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class UploadUtils {
    public static final int $stable = 0;
    public static final UploadUtils INSTANCE = new UploadUtils();
    public static final String SKIP_CHECKSUM = "3f4e17759c6b9c6a364211895bbb2abdc0ba62db";

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.oss.UploadUtils$gridFsUpload$2", m7918f = "UploadUtils.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.gallery.oss.UploadUtils$gridFsUpload$2 */
    public static final class C60192 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ C6358b0 $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60192(C6358b0 c6358b0, Continuation<? super C60192> continuation) {
            super(2, continuation);
            this.$request = c6358b0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C60192 c60192 = new C60192(this.$request, continuation);
            c60192.L$0 = obj;
            return c60192;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM17183constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C6358b0 c6358b0 = this.$request;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM17183constructorimpl = Result.m17183constructorimpl(new C6356a0().mo6504a(c6358b0).execute());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM17183constructorimpl = Result.m17183constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM17186exceptionOrNullimpl = Result.m17186exceptionOrNullimpl(objM17183constructorimpl);
            if (thM17186exceptionOrNullimpl != null) {
                String message = thM17186exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                Log.i("UploadDataWork", message);
            }
            return Boxing.boxBoolean(Result.m17190isSuccessimpl(objM17183constructorimpl));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C60192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.oss.UploadUtils$ossUpload$2", m7918f = "UploadUtils.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    @SourceDebugExtension({"SMAP\nUploadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadUtils.kt\ncom/zykj/gallery/oss/UploadUtils$ossUpload$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    /* renamed from: com.zykj.gallery.oss.UploadUtils$ossUpload$2 */
    public static final class C60202 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $localPath;
        final /* synthetic */ OSSClient $ossClient;
        final /* synthetic */ PutObjectRequest $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60202(OSSClient oSSClient, PutObjectRequest putObjectRequest, String str, Continuation<? super C60202> continuation) {
            super(2, continuation);
            this.$ossClient = oSSClient;
            this.$request = putObjectRequest;
            this.$localPath = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C60202 c60202 = new C60202(this.$ossClient, this.$request, this.$localPath, continuation);
            c60202.L$0 = obj;
            return c60202;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM17183constructorimpl;
            String message;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OSSClient oSSClient = this.$ossClient;
            PutObjectRequest putObjectRequest = this.$request;
            String str = this.$localPath;
            try {
                Result.Companion companion = Result.INSTANCE;
                oSSClient.putObject(putObjectRequest);
                AbstractC4668s.m2388t("end ossUpload--->" + str);
                objM17183constructorimpl = Result.m17183constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM17183constructorimpl = Result.m17183constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM17186exceptionOrNullimpl = Result.m17186exceptionOrNullimpl(objM17183constructorimpl);
            if (thM17186exceptionOrNullimpl != null && (message = thM17186exceptionOrNullimpl.getMessage()) != null) {
                AbstractC4668s.m2379k(message);
            }
            return Boxing.boxBoolean(Result.m17190isSuccessimpl(objM17183constructorimpl));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C60202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.oss.UploadUtils", m7918f = "UploadUtils.kt", m7919i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, m7920l = {33, 36, 39}, m7921m = "uploadFile", m7922n = {"localPath", "uploadPath", "credential", "localPath", "uploadPath", "credential", "localPath", "uploadPath", "credential"}, m7923s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: com.zykj.gallery.oss.UploadUtils$uploadFile$1 */
    public static final class C60211 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C60211(Continuation<? super C60211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UploadUtils.this.uploadFile(null, null, null, this);
        }
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.oss.UploadUtils$zyFsUpload$2", m7918f = "UploadUtils.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.gallery.oss.UploadUtils$zyFsUpload$2 */
    public static final class C60222 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ C6358b0 $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60222(C6358b0 c6358b0, Continuation<? super C60222> continuation) {
            super(2, continuation);
            this.$request = c6358b0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C60222 c60222 = new C60222(this.$request, continuation);
            c60222.L$0 = obj;
            return c60222;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM17183constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C6358b0 c6358b0 = this.$request;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM17183constructorimpl = Result.m17183constructorimpl(new C6356a0().mo6504a(c6358b0).execute());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM17183constructorimpl = Result.m17183constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM17186exceptionOrNullimpl = Result.m17186exceptionOrNullimpl(objM17183constructorimpl);
            if (thM17186exceptionOrNullimpl != null) {
                String message = thM17186exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                Log.i("UploadDataWork", message);
            }
            return Boxing.boxBoolean(Result.m17190isSuccessimpl(objM17183constructorimpl));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C60222) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private UploadUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object gridFsUpload(String str, String str2, OssToken ossToken, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C60192(new C6358b0.a().m6611w(ossToken.getEndpoint() + "/" + str2).m6590a(HttpHeaders.AUTHORIZATION, "bearer " + ossToken.getSecurityToken()).m6590a("Checksum", "3f4e17759c6b9c6a364211895bbb2abdc0ba62db").m6606r(new C6387z.a(null, 1, null).m6889e(C6387z.f7995k).m6885a("file", new File(str).getName(), AbstractC6360c0.Companion.m6621g(new File(str), C6386y.f7983e.m6882b("multipart/form-data"))).m6888d()).m6591b(), null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ossUpload(String str, String str2, OssToken ossToken, Continuation<? super Boolean> continuation) {
        AbstractC4668s.m2388t("start ossUpload file:" + str + ", serverPath: " + str2);
        return BuildersKt.withContext(Dispatchers.getIO(), new C60202(new OSSClient(AbstractC4657l0.m2250a(), StringsKt.replace$default(ossToken.getEndpoint(), ossToken.getBucket() + ".", "", false, 4, (Object) null), new OSSStsTokenCredentialProvider(ossToken.getAccessKeyId(), ossToken.getAccessKeySecret(), ossToken.getSecurityToken())), new PutObjectRequest(ossToken.getBucket(), str2, str), str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zyFsUpload(String str, String str2, OssToken ossToken, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C60222(new C6358b0.a().m6611w(ossToken.getEndpoint() + "/" + str2).m6590a(HttpHeaders.AUTHORIZATION, "bearer " + ossToken.getSecurityToken()).m6590a("Checksum", "3f4e17759c6b9c6a364211895bbb2abdc0ba62db").m6606r(new C6387z.a(null, 1, null).m6889e(C6387z.f7995k).m6885a("file", new File(str).getName(), AbstractC6360c0.Companion.m6621g(new File(str), C6386y.f7983e.m6882b("multipart/form-data"))).m6888d()).m6591b(), null), continuation);
    }

    public final String getFileNameFromUrlWithRegex(String url) {
        MatchGroupCollection groups;
        MatchGroup matchGroup;
        Intrinsics.checkNotNullParameter(url, "url");
        MatchResult matchResultFind$default = Regex.find$default(new Regex(".*/(.+)\\..+"), url, 0, 2, null);
        if (matchResultFind$default == null || (groups = matchResultFind$default.getGroups()) == null || (matchGroup = groups.get(1)) == null) {
            return null;
        }
        return matchGroup.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadFile(java.lang.String r7, java.lang.String r8, com.zykj.gallery.oss.OssToken r9, kotlin.coroutines.Continuation<? super java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.oss.UploadUtils.uploadFile(java.lang.String, java.lang.String, com.zykj.gallery.oss.OssToken, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali/com/zykj/gallery/oss/UploadUtils.smali:1044
    }
}
