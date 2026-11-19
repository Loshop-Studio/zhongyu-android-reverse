package com.github.barteksc.pdfviewer.exception;

/* loaded from: classes3.dex */
public class PageRenderingException extends Exception {

    /* renamed from: a */
    public final int f3768a;

    public PageRenderingException(int i10, Throwable th) {
        super(th);
        this.f3768a = i10;
    }

    /* renamed from: a */
    public int m3613a() {
        return this.f3768a;
    }
}
