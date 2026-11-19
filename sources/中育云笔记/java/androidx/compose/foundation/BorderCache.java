package androidx.compose.foundation;

import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class BorderCache {
    private Path borderPath;
    private Canvas canvas;
    private CanvasDrawScope canvasDrawScope;
    private ImageBitmap imageBitmap;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    private final ImageBitmap component1() {
        return this.imageBitmap;
    }

    private final Canvas component2() {
        return this.canvas;
    }

    private final CanvasDrawScope component3() {
        return this.canvasDrawScope;
    }

    private final Path component4() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache borderCache, ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            imageBitmap = borderCache.imageBitmap;
        }
        if ((i10 & 2) != 0) {
            canvas = borderCache.canvas;
        }
        if ((i10 & 4) != 0) {
            canvasDrawScope = borderCache.canvasDrawScope;
        }
        if ((i10 & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap, canvas, canvasDrawScope, path);
    }

    public final BorderCache copy(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        return new BorderCache(imageBitmap, canvas, canvasDrawScope, path);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.p014ui.graphics.ImageBitmap m26960drawBorderCacheEMwLDEs(androidx.compose.p014ui.draw.CacheDrawScope r26, long r27, int r29, p181hd.InterfaceC9540l r30) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderCache.m26960drawBorderCacheEMwLDEs(androidx.compose.ui.draw.CacheDrawScope, long, int, hd.l):androidx.compose.ui.graphics.ImageBitmap");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        return AbstractC9979u.m20289b(this.imageBitmap, borderCache.imageBitmap) && AbstractC9979u.m20289b(this.canvas, borderCache.canvas) && AbstractC9979u.m20289b(this.canvasDrawScope, borderCache.canvasDrawScope) && AbstractC9979u.m20289b(this.borderPath, borderCache.borderPath);
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.imageBitmap;
        int iHashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        Canvas canvas = this.canvas;
        int iHashCode2 = (iHashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int iHashCode3 = (iHashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.borderPath;
        return iHashCode3 + (path != null ? path.hashCode() : 0);
    }

    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : imageBitmap, (i10 & 2) != 0 ? null : canvas, (i10 & 4) != 0 ? null : canvasDrawScope, (i10 & 8) != 0 ? null : path);
    }
}
