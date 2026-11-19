package com.zykj.gallery.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.utils.Coil3ImageCacheUtil", m7918f = "Coil3ImageCacheUtil.kt", m7919i = {0, 0, 0, 0}, m7920l = {61}, m7921m = "getOrDownloadImageFile", m7922n = {"context", "data", "imageLoader", "request"}, m7923s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes4.dex */
public final class Coil3ImageCacheUtil$getOrDownloadImageFile$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f5943a;

    /* renamed from: b */
    public Object f5944b;

    /* renamed from: c */
    public Object f5945c;

    /* renamed from: d */
    public Object f5946d;

    /* renamed from: e */
    public /* synthetic */ Object f5947e;

    /* renamed from: f */
    public final /* synthetic */ Coil3ImageCacheUtil f5948f;

    /* renamed from: g */
    public int f5949g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Coil3ImageCacheUtil$getOrDownloadImageFile$1(Coil3ImageCacheUtil coil3ImageCacheUtil, Continuation continuation) {
        super(continuation);
        this.f5948f = coil3ImageCacheUtil;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5947e = obj;
        this.f5949g |= Integer.MIN_VALUE;
        return this.f5948f.m5203b(null, null, this);
    }
}
