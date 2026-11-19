package okio.internal;

import kotlin.jvm.internal.Ref$ObjectRef;
import okio.BufferedSource;
import p152r6.InterfaceC6473e;

/* renamed from: okio.internal.a */
/* loaded from: classes4.dex */
public final /* synthetic */ class C6352a implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f10350a = 1;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f10351b;

    /* renamed from: c */
    public final /* synthetic */ BufferedSource f10352c;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f10353d;

    /* renamed from: e */
    public final /* synthetic */ Ref$ObjectRef f10354e;

    public /* synthetic */ C6352a(Ref$ObjectRef ref$ObjectRef, BufferedSource bufferedSource, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.f10351b = ref$ObjectRef;
        this.f10352c = bufferedSource;
        this.f10353d = ref$ObjectRef2;
        this.f10354e = ref$ObjectRef3;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f10350a;
        int iIntValue = ((Integer) obj).intValue();
        long jLongValue = ((Long) obj2).longValue();
        switch (i) {
            case 0:
                return ZipFilesKt.readOrSkipLocalHeader$lambda$10(this.f10352c, this.f10351b, this.f10353d, this.f10354e, iIntValue, jLongValue);
            default:
                return ZipFilesKt.readCentralDirectoryZipEntry$lambda$8$lambda$7(this.f10351b, this.f10352c, this.f10353d, this.f10354e, iIntValue, jLongValue);
        }
    }

    public /* synthetic */ C6352a(BufferedSource bufferedSource, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.f10352c = bufferedSource;
        this.f10351b = ref$ObjectRef;
        this.f10353d = ref$ObjectRef2;
        this.f10354e = ref$ObjectRef3;
    }
}
