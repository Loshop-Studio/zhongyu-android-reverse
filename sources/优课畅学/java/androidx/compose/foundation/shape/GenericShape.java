package androidx.compose.foundation.shape;

import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class GenericShape implements Shape {
    public static final int $stable = 0;
    private final InterfaceC10575q builder;

    public GenericShape(InterfaceC10575q interfaceC10575q) {
        this.builder = interfaceC10575q;
    }

    @Override // androidx.compose.p013ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo20407createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m24092boximpl(j10), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        return (genericShape != null ? genericShape.builder : null) == this.builder;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
