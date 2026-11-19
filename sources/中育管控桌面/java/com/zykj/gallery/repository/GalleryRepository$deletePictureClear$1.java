package com.zykj.gallery.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.repository.GalleryRepository", m7918f = "GalleryRepository.kt", m7919i = {}, m7920l = {50}, m7921m = "deletePictureClear", m7922n = {}, m7923s = {})
/* loaded from: classes2.dex */
public final class GalleryRepository$deletePictureClear$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f5790a;

    /* renamed from: b */
    public final /* synthetic */ GalleryRepository f5791b;

    /* renamed from: c */
    public int f5792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRepository$deletePictureClear$1(GalleryRepository galleryRepository, Continuation continuation) {
        super(continuation);
        this.f5791b = galleryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5790a = obj;
        this.f5792c |= Integer.MIN_VALUE;
        return this.f5791b.m5026d(this);
    }
}
