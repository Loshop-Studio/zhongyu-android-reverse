package p020b4;

import com.google.protobuf.AnyProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* renamed from: b4.f */
/* loaded from: classes3.dex */
public abstract class AbstractC3126f {

    /* renamed from: a */
    public static final Descriptors.Descriptor f1581a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f1582b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f1583c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f1584d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f1585e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f1586f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f1587g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f1588h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f1589i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f1590j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f1591k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f1592l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f1593m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f1594n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f1595o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f1596p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f1597q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f1598r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f1599s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f1600t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f1601u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f1602v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f1603w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f1604x;

    static {
        Descriptors.Descriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rCommand.proto\u001a\u0019google/protobuf/any.proto\u001a\u0017enums/CommandEnum.proto\u001a\u0015enums/GraphEnum.proto\u001a\u0011utils/RectF.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0013GraphSnapshot.proto\u001a\fHeader.proto\"\u0092\u000b\n\rCommandSource\u0012/\n\u000bcommandInfo\u0018\u0001 \u0003(\u000b2\u001a.CommandSource.CommandInfo\u001aÏ\n\n\u000bCommandInfo\u0012\u0011\n\tdelayTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006isPlay\u0018\u0003 \u0001(\b\u0012!\n\u000bcommandEnum\u0018\u0004 \u0001(\u000e2\f.CommandEnum\u0012\f\n\u0004data\u0018\u0005 \u0001(\f\u001a¥\u0001\n\tGraphData\u0012\u001d\n\tgraphEnum\u0018\u0001 \u0001(\u000e2\n.GraphEnum\u0012\u000f\n\u0007graphId\u0018\u0002 \u0001(\t\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0015\n\rparentGraphId\u0018\u0004 \u0001(\t\u0012\u0016\n\u000esourceFileName\u0018\u0005 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0006 \u0001(\u0005\u0012\u000e\n\u0006extras\u0018\u0007 \u0001(\t\u001aF\n\u000bGraphRemove\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u001a¬\u0001\n\u000bGraphMatrix\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u0012\u001d\n\foriginMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0003 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0004 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0005 \u0001(\u0005\u001aÈ\u0001\n\u000bGraphChange\u0012\u000f\n\u0007graphId\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u000f\n\u0007content\u0018\u0004 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0005 \u0001(\u000b2\u0006.Paint\u0012\u0017\n\u0006points\u0018\u0006 \u0003(\u000b2\u0007.PointF\u0012\u001d\n\frenderMatrix\u0018\u0007 \u0001(\u000b2\u0007.Matrix\u0012\u0010\n\bfilePath\u0018\b \u0001(\t\u001aB\n\nAudioStart\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\u001at\n\fCameraMatrix\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0003 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0004 \u0001(\u0005\u001aD\n\u0006Camera\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u001a®\u0001\n\u0006Config\u0012\u0018\n\u0010originBackground\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000elastBackground\u0018\u0002 \u0001(\u0005\u00129\n\u001aoriginBackgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u0004 \u0001(\u000b2\u0015.BackgroundLineConfig\u001a6\n\nCursorMove\u0012\u0016\n\u000esourceFileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0002 \u0001(\u0005\u001a\u0086\u0001\n\u0007REBUILD\u0012-\n\bsnapshot\u0018\u0001 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0017\n\u000fbackgroundColor\u0018\u0002 \u0001(\u0005\u00123\n\u0014backgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfigB\u001c\n\u000ecom.zykj.boardB\nEzyCommandb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), AbstractC3132h.f1606a, AbstractC3144l.f1618a, AbstractC3122d1.f1580c, AbstractC3121d0.f1577c, AbstractC3163r0.f1645c, AbstractC3178w0.f1699c, AbstractC3148m0.f1623e, AbstractC3183y.f1708i}).getMessageTypes().get(0);
        f1581a = descriptor;
        f1582b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f1583c = descriptor2;
        f1584d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DelayTime", "Duration", "IsPlay", "CommandEnum", "Data"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f1585e = descriptor3;
        f1586f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"GraphEnum", "GraphId", "OutRect", "ParentGraphId", "SourceFileName", "SourceId", "Extras"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        f1587g = descriptor4;
        f1588h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"GraphData"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(2);
        f1589i = descriptor5;
        f1590j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"GraphData", "OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(3);
        f1591k = descriptor6;
        f1592l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"GraphId", "GraphEnum", "OutRect", "Content", "Paint", "Points", "RenderMatrix", "FilePath"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(4);
        f1593m = descriptor7;
        f1594n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"FileName", "Duration", "Validate"});
        Descriptors.Descriptor descriptor8 = descriptor2.getNestedTypes().get(5);
        f1595o = descriptor8;
        f1596p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(6);
        f1597q = descriptor9;
        f1598r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"OriginMatrix", "LastMatrix"});
        Descriptors.Descriptor descriptor10 = descriptor2.getNestedTypes().get(7);
        f1599s = descriptor10;
        f1600t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"OriginBackground", "LastBackground", "OriginBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(8);
        f1601u = descriptor11;
        f1602v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor12 = descriptor2.getNestedTypes().get(9);
        f1603w = descriptor12;
        f1604x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Snapshot", "BackgroundColor", "BackgroundLineConfig"});
        AnyProto.getDescriptor();
    }
}
