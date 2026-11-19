package com.zykj.gallery.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.repository.GalleryRepository", m7918f = "GalleryRepository.kt", m7919i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m7920l = {83}, m7921m = "getOssTokenFlow", m7922n = {"userId", "fileType", "fileExt", "fileResource", "date", "uuid", "modulePath", "resPath", "reqStr", "sign", "tokenReq", "timeMillis"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "J$0"})
/* loaded from: classes2.dex */
public final class GalleryRepository$getOssTokenFlow$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f5809a;

    /* renamed from: b */
    public Object f5810b;

    /* renamed from: c */
    public Object f5811c;

    /* renamed from: d */
    public Object f5812d;

    /* renamed from: e */
    public Object f5813e;

    /* renamed from: f */
    public Object f5814f;

    /* renamed from: g */
    public Object f5815g;

    /* renamed from: h */
    public Object f5816h;

    /* renamed from: i */
    public Object f5817i;

    /* renamed from: j */
    public Object f5818j;

    /* renamed from: k */
    public Object f5819k;

    /* renamed from: l */
    public long f5820l;

    /* renamed from: m */
    public /* synthetic */ Object f5821m;

    /* renamed from: n */
    public final /* synthetic */ GalleryRepository f5822n;

    /* renamed from: o */
    public int f5823o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRepository$getOssTokenFlow$1(GalleryRepository galleryRepository, Continuation continuation) {
        super(continuation);
        this.f5822n = galleryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5821m = obj;
        this.f5823o |= Integer.MIN_VALUE;
        return this.f5822n.m5029h(null, null, null, null, null, null, 0L, this);
    }
}
