package com.zykj.gallery.repository;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.repository.GalleryRepository", m7918f = "GalleryRepository.kt", m7919i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m7920l = {128, 129}, m7921m = "addPictureAsync", m7922n = {HintConstants.AUTOFILL_HINT_NAME, "picture", "size", "appName", "entity", HintConstants.AUTOFILL_HINT_NAME, "picture", "size", "appName", "entity"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes2.dex */
public final class GalleryRepository$addPictureAsync$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f5778a;

    /* renamed from: b */
    public Object f5779b;

    /* renamed from: c */
    public Object f5780c;

    /* renamed from: d */
    public Object f5781d;

    /* renamed from: e */
    public Object f5782e;

    /* renamed from: f */
    public /* synthetic */ Object f5783f;

    /* renamed from: g */
    public final /* synthetic */ GalleryRepository f5784g;

    /* renamed from: h */
    public int f5785h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRepository$addPictureAsync$1(GalleryRepository galleryRepository, Continuation continuation) {
        super(continuation);
        this.f5784g = galleryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5783f = obj;
        this.f5785h |= Integer.MIN_VALUE;
        return this.f5784g.m5024b(null, null, null, null, this);
    }
}
