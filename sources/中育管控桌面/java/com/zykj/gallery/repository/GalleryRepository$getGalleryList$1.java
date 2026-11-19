package com.zykj.gallery.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.repository.GalleryRepository", m7918f = "GalleryRepository.kt", m7919i = {0, 0, 0}, m7920l = {33}, m7921m = "getGalleryList", m7922n = {"skipCount", "maxResultCount", "isRecycleBin"}, m7923s = {"I$0", "I$1", "Z$0"})
/* loaded from: classes2.dex */
public final class GalleryRepository$getGalleryList$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f5793a;

    /* renamed from: b */
    public int f5794b;

    /* renamed from: c */
    public boolean f5795c;

    /* renamed from: d */
    public /* synthetic */ Object f5796d;

    /* renamed from: e */
    public final /* synthetic */ GalleryRepository f5797e;

    /* renamed from: f */
    public int f5798f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRepository$getGalleryList$1(GalleryRepository galleryRepository, Continuation continuation) {
        super(continuation);
        this.f5797e = galleryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5796d = obj;
        this.f5798f |= Integer.MIN_VALUE;
        return this.f5797e.m5027e(0, 0, false, this);
    }
}
