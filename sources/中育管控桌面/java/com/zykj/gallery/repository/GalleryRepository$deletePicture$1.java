package com.zykj.gallery.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.repository.GalleryRepository", m7918f = "GalleryRepository.kt", m7919i = {0}, m7920l = {46}, m7921m = "deletePicture", m7922n = {"list"}, m7923s = {"L$0"})
/* loaded from: classes2.dex */
public final class GalleryRepository$deletePicture$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f5786a;

    /* renamed from: b */
    public /* synthetic */ Object f5787b;

    /* renamed from: c */
    public final /* synthetic */ GalleryRepository f5788c;

    /* renamed from: d */
    public int f5789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRepository$deletePicture$1(GalleryRepository galleryRepository, Continuation continuation) {
        super(continuation);
        this.f5788c = galleryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5787b = obj;
        this.f5789d |= Integer.MIN_VALUE;
        return this.f5788c.m5025c(null, this);
    }
}
