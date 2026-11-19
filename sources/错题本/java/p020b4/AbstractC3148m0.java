package p020b4;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* renamed from: b4.m0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3148m0 {

    /* renamed from: a */
    public static final Descriptors.Descriptor f1619a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f1620b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f1621c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f1622d;

    /* renamed from: e */
    public static final Descriptors.FileDescriptor f1623e;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013GraphSnapshot.proto\u001a\u0011utils/RectF.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0012utils/Matrix.proto\u001a\u0015enums/GraphEnum.proto\"\u009a\u0003\n\fPageSnapshot\u0012\u001d\n\fcameraMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u00122\n\rgraphSnapshot\u0018\u0002 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u001a¶\u0002\n\rGraphSnapshot\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0017\n\u0006matrix\u0018\u0004 \u0001(\u000b2\u0007.Matrix\u0012/\n\nchildGraph\u0018\u0005 \u0003(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0016\n\u000esourceFileName\u0018\u0006 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0007 \u0001(\u0005\u0012\u0017\n\u000fbackgroundColor\u0018\b \u0001(\u0005\u0012\u0015\n\u0005paint\u0018\t \u0001(\u000b2\u0006.Paint\u0012\u000f\n\u0007content\u0018\n \u0001(\t\u0012\u001a\n\tpointList\u0018\u000b \u0003(\u000b2\u0007.PointF\u0012\u0010\n\bfilePath\u0018\f \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyPageSnapshotb\u0006proto3"}, new Descriptors.FileDescriptor[]{AbstractC3122d1.f1580c, AbstractC3163r0.f1645c, AbstractC3178w0.f1699c, AbstractC3121d0.f1577c, AbstractC3144l.f1618a});
        f1623e = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f1619a = descriptor;
        f1620b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CameraMatrix", "GraphSnapshot"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f1621c = descriptor2;
        f1622d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "GraphEnum", "OutRect", "Matrix", "ChildGraph", "SourceFileName", "SourceId", "BackgroundColor", "Paint", "Content", "PointList", "FilePath"});
    }
}
