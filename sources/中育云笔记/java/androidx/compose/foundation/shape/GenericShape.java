package androidx.compose.foundation.shape;

import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9545q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class GenericShape implements Shape {
    public static final int $stable = 0;
    private final InterfaceC9545q builder;

    public GenericShape(InterfaceC9545q interfaceC9545q) {
        this.builder = interfaceC9545q;
    }

    @Override // androidx.compose.p014ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo27009createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m30694boximpl(j10), layoutDirection);
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
