package androidx.compose.p013ui.tooling.preview;

import p101f8.AbstractC8479q;
import p101f8.InterfaceC8469g;

/* loaded from: classes2.dex */
public interface PreviewParameterProvider<T> {

    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            return PreviewParameterProvider.super.getCount();
        }
    }

    default int getCount() {
        return AbstractC8479q.m13847p(getValues());
    }

    InterfaceC8469g getValues();
}
