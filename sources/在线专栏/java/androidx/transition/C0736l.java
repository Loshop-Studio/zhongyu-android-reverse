package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: androidx.transition.l */
/* loaded from: classes.dex */
class C0736l {

    /* renamed from: a */
    static final Matrix f4441a = new a();

    /* renamed from: androidx.transition.l$a */
    static class a extends Matrix {
        a() {
        }

        /* renamed from: a */
        void m3902a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f4, float f5, float f6) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f4, float f5, float f6, float f7) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f4, float f5, float f6, float f7) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f4, float f5) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f4, float f5, float f6) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f4, float f5, float f6, float f7) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f4, float f5, float f6, float f7) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f4, float f5) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i4, float[] fArr2, int i5, int i6) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f4, float f5, float f6) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f4, float f5, float f6, float f7) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f4, float f5, float f6, float f7) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f4, float f5, float f6, float f7) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f4, float f5) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f4) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f4, float f5) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f4, float f5) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f4) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f4, float f5) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f4, float f5) {
            m3902a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f4) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f4, float f5) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f4, float f5) {
            m3902a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f4, float f5) {
            m3902a();
        }
    }
}
