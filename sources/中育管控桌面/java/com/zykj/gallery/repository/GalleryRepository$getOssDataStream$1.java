package com.zykj.gallery.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.repository.GalleryRepository", m7918f = "GalleryRepository.kt", m7919i = {0, 0, 0, 0, 0, 0, 0}, m7920l = {97}, m7921m = "getOssDataStream", m7922n = {"userId", "fileType", "fileExt", "fileResource", "date", "uuid", "timeMillis"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0"})
/* loaded from: classes2.dex */
public final class GalleryRepository$getOssDataStream$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f5799a;

    /* renamed from: b */
    public Object f5800b;

    /* renamed from: c */
    public Object f5801c;

    /* renamed from: d */
    public Object f5802d;

    /* renamed from: e */
    public Object f5803e;

    /* renamed from: f */
    public Object f5804f;

    /* renamed from: g */
    public long f5805g;

    /* renamed from: h */
    public /* synthetic */ Object f5806h;

    /* renamed from: i */
    public final /* synthetic */ GalleryRepository f5807i;

    /* renamed from: j */
    public int f5808j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRepository$getOssDataStream$1(GalleryRepository galleryRepository, Continuation continuation) {
        super(continuation);
        this.f5807i = galleryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5806h = obj;
        this.f5808j |= Integer.MIN_VALUE;
        return this.f5807i.m5028f(null, null, null, null, null, null, 0L, this);
    }
}
