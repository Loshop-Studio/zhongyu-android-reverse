package androidx.compose.p013ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p013ui.graphics.colorspace.RenderIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m13558d2 = {"Connectors", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "getConnectors", "()Landroidx/collection/MutableIntObjectMap;", "connectorKey", "", "src", "dst", "renderIntent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "connectorKey-YBCOT_4", "(III)I", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n1#1,328:1\n326#1:329\n326#1:330\n326#1:331\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n315#1:329\n317#1:330\n319#1:331\n*E\n"})
/* loaded from: classes2.dex */
public final class ConnectorKt {
    private static final MutableIntObjectMap<Connector> Connectors;

    static {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        int id = colorSpaces.getSrgb().getId();
        int id2 = colorSpaces.getSrgb().getId();
        RenderIntent.Companion companion = RenderIntent.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Connectors = IntObjectMapKt.mutableIntObjectMapOf(id | (id2 << 6) | (companion.m21411getPerceptualuksYyKA() << 12), Connector.INSTANCE.identity$ui_graphics_release(colorSpaces.getSrgb()), colorSpaces.getSrgb().getId() | (colorSpaces.getOklab().getId() << 6) | (companion.m21411getPerceptualuksYyKA() << 12), new Connector(colorSpaces.getSrgb(), colorSpaces.getOklab(), companion.m21411getPerceptualuksYyKA(), defaultConstructorMarker), colorSpaces.getOklab().getId() | (colorSpaces.getSrgb().getId() << 6) | (companion.m21411getPerceptualuksYyKA() << 12), new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion.m21411getPerceptualuksYyKA(), defaultConstructorMarker));
    }

    /* renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m21402connectorKeyYBCOT_4(int i10, int i11, int i12) {
        return i10 | (i11 << 6) | (i12 << 12);
    }

    public static final MutableIntObjectMap<Connector> getConnectors() {
        return Connectors;
    }
}
