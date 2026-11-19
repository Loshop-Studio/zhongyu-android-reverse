package com.bumptech.glide.gifdecoder;

/* loaded from: classes.dex */
class GifFrame {
    static final int DISPOSAL_BACKGROUND = 2;
    static final int DISPOSAL_NONE = 1;
    static final int DISPOSAL_PREVIOUS = 3;
    static final int DISPOSAL_UNSPECIFIED = 0;
    int bufferFrameStart;
    int delay;
    int dispose;

    /* renamed from: ih */
    int f6958ih;
    boolean interlace;

    /* renamed from: iw */
    int f6959iw;

    /* renamed from: ix */
    int f6960ix;

    /* renamed from: iy */
    int f6961iy;
    int[] lct;
    int transIndex;
    boolean transparency;

    GifFrame() {
    }
}
