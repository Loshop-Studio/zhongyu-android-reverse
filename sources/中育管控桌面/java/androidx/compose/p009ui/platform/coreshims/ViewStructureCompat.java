package androidx.compose.p009ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class ViewStructureCompat {
    private final Object mWrappedObj;

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        public static void setClassName(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void setDimens(ViewStructure viewStructure, int i6, int i7, int i8, int i9, int i10, int i11) {
            viewStructure.setDimens(i6, i7, i8, i9, i10, i11);
        }

        public static void setId(ViewStructure viewStructure, int i6, String str, String str2, String str3) {
            viewStructure.setId(i6, str, str2, str3);
        }

        public static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        public static void setTextStyle(ViewStructure viewStructure, float f6, int i6, int i7, int i8) {
            viewStructure.setTextStyle(f6, i6, i7, i8);
        }
    }

    private ViewStructureCompat(ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    @RequiresApi(23)
    public static ViewStructureCompat toViewStructureCompat(ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public Bundle getExtras() {
        return Api23Impl.getExtras((ViewStructure) this.mWrappedObj);
    }

    public void setClassName(String str) {
        Api23Impl.setClassName((ViewStructure) this.mWrappedObj, str);
    }

    public void setContentDescription(CharSequence charSequence) {
        Api23Impl.setContentDescription((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setDimens(int i6, int i7, int i8, int i9, int i10, int i11) {
        Api23Impl.setDimens((ViewStructure) this.mWrappedObj, i6, i7, i8, i9, i10, i11);
    }

    public void setId(int i6, String str, String str2, String str3) {
        Api23Impl.setId((ViewStructure) this.mWrappedObj, i6, str, str2, str3);
    }

    public void setText(CharSequence charSequence) {
        Api23Impl.setText((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setTextStyle(float f6, int i6, int i7, int i8) {
        Api23Impl.setTextStyle((ViewStructure) this.mWrappedObj, f6, i6, i7, i8);
    }

    @RequiresApi(23)
    public ViewStructure toViewStructure() {
        return (ViewStructure) this.mWrappedObj;
    }
}
