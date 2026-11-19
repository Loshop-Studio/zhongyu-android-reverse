package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* loaded from: classes.dex */
public interface ResourceDecoder<T, Z> {
    Resource<Z> decode(T t3, int i4, int i5, Options options) throws IOException;

    boolean handles(T t3, Options options) throws IOException;
}
