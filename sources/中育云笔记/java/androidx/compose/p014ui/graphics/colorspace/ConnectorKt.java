package androidx.compose.p014ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p014ui.graphics.colorspace.RenderIntent;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class ConnectorKt {
    private static final MutableIntObjectMap<Connector> Connectors;

    static {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        int id$ui_graphics_release = colorSpaces.getSrgb().getId$ui_graphics_release();
        int id$ui_graphics_release2 = colorSpaces.getSrgb().getId$ui_graphics_release();
        RenderIntent.Companion companion = RenderIntent.Companion;
        AbstractC9972n abstractC9972n = null;
        Connectors = IntObjectMapKt.mutableIntObjectMapOf(id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (companion.m31313getPerceptualuksYyKA() << 12), Connector.Companion.identity$ui_graphics_release(colorSpaces.getSrgb()), colorSpaces.getSrgb().getId$ui_graphics_release() | (colorSpaces.getOklab().getId$ui_graphics_release() << 6) | (companion.m31313getPerceptualuksYyKA() << 12), new Connector(colorSpaces.getSrgb(), colorSpaces.getOklab(), companion.m31313getPerceptualuksYyKA(), abstractC9972n), colorSpaces.getOklab().getId$ui_graphics_release() | (colorSpaces.getSrgb().getId$ui_graphics_release() << 6) | (companion.m31313getPerceptualuksYyKA() << 12), new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion.m31313getPerceptualuksYyKA(), abstractC9972n));
    }

    /* renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m31304connectorKeyYBCOT_4(int i10, int i11, int i12) {
        return i10 | (i11 << 6) | (i12 << 12);
    }

    public static final MutableIntObjectMap<Connector> getConnectors() {
        return Connectors;
    }
}
