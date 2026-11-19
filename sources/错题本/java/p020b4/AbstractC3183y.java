package p020b4;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* renamed from: b4.y */
/* loaded from: classes3.dex */
public abstract class AbstractC3183y {

    /* renamed from: a */
    public static final Descriptors.Descriptor f1700a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f1701b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f1702c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f1703d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f1704e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f1705f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f1706g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f1707h;

    /* renamed from: i */
    public static final Descriptors.FileDescriptor f1708i;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fHeader.proto\u001a\u0010PageRouter.proto\u001a\"enums/BackgroundLineTypeEnum.proto\"\u008d\u0003\n\u0006Header\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0012\n\ncreateDate\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nupdateDate\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003\u0012\u0017\n\u0006author\u0018\u0007 \u0001(\u000b2\u0007.Author\u0012\u0012\n\nconvertUrl\u0018\b \u0001(\t\u0012\u0019\n\bprovider\u0018\t \u0003(\u000b2\u0007.Author\u0012\u001e\n\u0016defaultBackgroundColor\u0018\n \u0001(\u0005\u0012\u001b\n\u0013lastBackgroundColor\u0018\u000b \u0001(\u0005\u0012\u001f\n\nmoveConfig\u0018\f \u0001(\u000b2\u000b.MoveConfig\u0012:\n\u001bdefaultBackgroundLineConfig\u0018\r \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u000e \u0001(\u000b2\u0015.BackgroundLineConfig\"¤\u0001\n\nMoveConfig\u0012\u0010\n\bisEnable\u0018\u0001 \u0001(\b\u0012\u0019\n\u0011verticalTranslate\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013horizontalTranslate\u0018\u0003 \u0001(\b\u0012\r\n\u0005scale\u0018\u0004 \u0001(\b\u0012\u000e\n\u0006rotate\u0018\u0005 \u0001(\b\u0012\u0016\n\u000emaxHeightTimes\u0018\u0006 \u0001(\u0005\u0012\u0015\n\rmaxWidthTimes\u0018\u0007 \u0001(\u0005\"z\n\u0014BackgroundLineConfig\u0012\u0011\n\tlineColor\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tlineSpace\u0018\u0002 \u0001(\u0002\u0012)\n\blineType\u0018\u0003 \u0001(\u000e2\u0017.BackgroundLineTypeEnum\u0012\u0011\n\tlineWidth\u0018\u0004 \u0001(\u0002\"r\n\u0006Author\u0012\u0012\n\nauthorName\u0018\u0001 \u0001(\t\u0012\u0010\n\bschoolId\u0018\u0002 \u0001(\t\u0012\u0010\n\bauthorId\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0004 \u0001(\t\u0012\u0011\n\tstartTime\u0018\u0005 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0006 \u0001(\u0003B\u001b\n\u000ecom.zykj.boardB\tEzyHeaderb\u0006proto3"}, new Descriptors.FileDescriptor[]{AbstractC3139j0.f1616e, AbstractC3114b.f1558a});
        f1708i = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f1700a = descriptor;
        f1701b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Version", "Width", "Height", "CreateDate", "UpdateDate", "Duration", "Author", "ConvertUrl", "Provider", "DefaultBackgroundColor", "LastBackgroundColor", "MoveConfig", "DefaultBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor2 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        f1702c = descriptor2;
        f1703d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"IsEnable", "VerticalTranslate", "HorizontalTranslate", "Scale", "Rotate", "MaxHeightTimes", "MaxWidthTimes"});
        Descriptors.Descriptor descriptor3 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(2);
        f1704e = descriptor3;
        f1705f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"LineColor", "LineSpace", "LineType", "LineWidth"});
        Descriptors.Descriptor descriptor4 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(3);
        f1706g = descriptor4;
        f1707h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"AuthorName", "SchoolId", "AuthorId", "Url", "StartTime", "Duration"});
    }
}
