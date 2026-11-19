package androidx.compose.p013ui.layout;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
public interface ContentScale {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.p013ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo25620computeScaleFactorH7hwNQA(long j10, long j11) {
                float fM25624computeFillMaxDimensioniLBOSCw = ContentScaleKt.m25624computeFillMaxDimensioniLBOSCw(j10, j11);
                return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(fM25624computeFillMaxDimensioniLBOSCw) << 32) | (4294967295L & Float.floatToRawIntBits(fM25624computeFillMaxDimensioniLBOSCw)));
            }
        };
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.p013ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo25620computeScaleFactorH7hwNQA(long j10, long j11) {
                float fM25625computeFillMinDimensioniLBOSCw = ContentScaleKt.m25625computeFillMinDimensioniLBOSCw(j10, j11);
                return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(fM25625computeFillMinDimensioniLBOSCw) << 32) | (4294967295L & Float.floatToRawIntBits(fM25625computeFillMinDimensioniLBOSCw)));
            }
        };
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.p013ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo25620computeScaleFactorH7hwNQA(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
                return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
            }
        };
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.p013ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo25620computeScaleFactorH7hwNQA(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
            }
        };
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.p013ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo25620computeScaleFactorH7hwNQA(long j10, long j11) {
                if (Float.intBitsToFloat((int) (j10 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j10 & 4294967295L)) <= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                    return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                }
                float fM25625computeFillMinDimensioniLBOSCw = ContentScaleKt.m25625computeFillMinDimensioniLBOSCw(j10, j11);
                return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(fM25625computeFillMinDimensioniLBOSCw) << 32) | (Float.floatToRawIntBits(fM25625computeFillMinDimensioniLBOSCw) & 4294967295L));
            }
        };
        private static final FixedScale None = new FixedScale(1.0f);
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.p013ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo25620computeScaleFactorH7hwNQA(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
                return ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
            }
        };

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        public final FixedScale getNone() {
            return None;
        }
    }

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo25620computeScaleFactorH7hwNQA(long j10, long j11);
}
