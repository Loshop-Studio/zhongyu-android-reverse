package com.zykj.gallery.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.repository.GalleryRepository", m7918f = "GalleryRepository.kt", m7919i = {0}, m7920l = {41}, m7921m = "moveToRecycleBinAsync", m7922n = {"list"}, m7923s = {"L$0"})
/* loaded from: classes2.dex */
public final class GalleryRepository$moveToRecycleBinAsync$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f5824a;

    /* renamed from: b */
    public /* synthetic */ Object f5825b;

    /* renamed from: c */
    public final /* synthetic */ GalleryRepository f5826c;

    /* renamed from: d */
    public int f5827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRepository$moveToRecycleBinAsync$1(GalleryRepository galleryRepository, Continuation continuation) {
        super(continuation);
        this.f5826c = galleryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5825b = obj;
        this.f5827d |= Integer.MIN_VALUE;
        return this.f5826c.m5030i(null, this);
    }
}
