package com.github.barteksc.pdfviewer.exception;

/* loaded from: classes3.dex */
public class PageRenderingException extends Exception {

    /* renamed from: a */
    public final int f3381a;

    public PageRenderingException(int i6, Throwable th) {
        super(th);
        this.f3381a = i6;
    }

    /* renamed from: a */
    public int m3431a() {
        return this.f3381a;
    }
}
