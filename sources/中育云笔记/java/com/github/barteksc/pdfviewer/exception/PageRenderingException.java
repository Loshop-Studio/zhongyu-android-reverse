package com.github.barteksc.pdfviewer.exception;

/* loaded from: classes5.dex */
public class PageRenderingException extends Exception {

    /* renamed from: c */
    public final int f10849c;

    public PageRenderingException(int i10, Throwable th) {
        super(th);
        this.f10849c = i10;
    }

    /* renamed from: a */
    public int m7904a() {
        return this.f10849c;
    }
}
