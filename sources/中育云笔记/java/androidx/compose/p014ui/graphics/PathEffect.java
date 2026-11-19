package androidx.compose.p014ui.graphics;

/* loaded from: classes2.dex */
public interface PathEffect {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PathEffect dashPathEffect$default(Companion companion, float[] fArr, float f10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            return companion.dashPathEffect(fArr, f10);
        }

        public final PathEffect chainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
            return AndroidPathEffect_androidKt.actualChainPathEffect(pathEffect, pathEffect2);
        }

        public final PathEffect cornerPathEffect(float f10) {
            return AndroidPathEffect_androidKt.actualCornerPathEffect(f10);
        }

        public final PathEffect dashPathEffect(float[] fArr, float f10) {
            return AndroidPathEffect_androidKt.actualDashPathEffect(fArr, f10);
        }

        /* renamed from: stampedPathEffect-7aD1DOk, reason: not valid java name */
        public final PathEffect m31152stampedPathEffect7aD1DOk(Path path, float f10, float f11, int i10) {
            return AndroidPathEffect_androidKt.m30774actualStampedPathEffect7aD1DOk(path, f10, f11, i10);
        }
    }
}
