package p020b4;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* renamed from: b4.a2 */
/* loaded from: classes3.dex */
public abstract class AbstractC3113a2 {

    /* renamed from: a */
    public static final Descriptors.Descriptor f1551a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f1552b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f1553c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f1554d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f1555e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f1556f;

    /* renamed from: g */
    public static final Descriptors.FileDescriptor f1557g;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016utils/TouchEvent.proto\"¡\u0002\n\nTouchEvent\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0002 \u0001(\u0005\u0012\t\n\u0001x\u0018\u0003 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0004 \u0001(\u0002\u0012\u0014\n\fpointerCount\u0018\u0005 \u0001(\u0005\u00128\n\u0011pointerProperties\u0018\u0006 \u0003(\u000b2\u001d.TouchEvent.PointerProperties\u00120\n\rpointerCoords\u0018\u0007 \u0003(\u000b2\u0019.TouchEvent.PointerCoords\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\btoolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001f\n\u000ecom.zykj.boardB\rEzyTouchEventb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        f1557g = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f1551a = descriptor;
        f1552b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"EventTime", "Action", "X", "Y", "PointerCount", "PointerProperties", "PointerCoords"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f1553c = descriptor2;
        f1554d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "ToolType"});
        Descriptors.Descriptor descriptor3 = descriptor.getNestedTypes().get(1);
        f1555e = descriptor3;
        f1556f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"X", "Y"});
    }
}
