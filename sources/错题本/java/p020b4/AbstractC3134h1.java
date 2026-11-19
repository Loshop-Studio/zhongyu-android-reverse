package p020b4;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* renamed from: b4.h1 */
/* loaded from: classes3.dex */
public abstract class AbstractC3134h1 {

    /* renamed from: a */
    public static final Descriptors.Descriptor f1607a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f1608b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f1609c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f1610d;

    static {
        Descriptors.Descriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012RouterRecord.proto\"ó\u0003\n\fRouterRecord\u00128\n\rcommandRecord\u0018\u0001 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u00126\n\u000baudioRecord\u0018\u0002 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012<\n\u0011touchSourceRecord\u0018\u0003 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012=\n\u0012matrixSourceRecord\u0018\u0004 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010fileSourceRecord\u0018\u0005 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010textSourceRecord\u0018\u0006 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012?\n\u0014geometrySourceRecord\u0018\u0007 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u001a9\n\u0013SourceCommandRecord\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bvalidate\u0018\u0002 \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyRouterRecordb\u0006proto3"}, new Descriptors.FileDescriptor[0]).getMessageTypes().get(0);
        f1607a = descriptor;
        f1608b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandRecord", "AudioRecord", "TouchSourceRecord", "MatrixSourceRecord", "FileSourceRecord", "TextSourceRecord", "GeometrySourceRecord"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f1609c = descriptor2;
        f1610d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"FileName", "Validate"});
    }
}
