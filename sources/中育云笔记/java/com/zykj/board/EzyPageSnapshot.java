package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.alibaba.fastjson.asm.Opcodes;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EzyPageSnapshot {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19095a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19096b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f19097c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f19098d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f19099e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013GraphSnapshot.proto\u001a\u0011utils/RectF.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0012utils/Matrix.proto\u001a\u0015enums/GraphEnum.proto\"\u009a\u0003\n\fPageSnapshot\u0012\u001d\n\fcameraMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u00122\n\rgraphSnapshot\u0018\u0002 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u001a¶\u0002\n\rGraphSnapshot\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0017\n\u0006matrix\u0018\u0004 \u0001(\u000b2\u0007.Matrix\u0012/\n\nchildGraph\u0018\u0005 \u0003(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0016\n\u000esourceFileName\u0018\u0006 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0007 \u0001(\u0005\u0012\u0017\n\u000fbackgroundColor\u0018\b \u0001(\u0005\u0012\u0015\n\u0005paint\u0018\t \u0001(\u000b2\u0006.Paint\u0012\u000f\n\u0007content\u0018\n \u0001(\t\u0012\u001a\n\tpointList\u0018\u000b \u0003(\u000b2\u0007.PointF\u0012\u0010\n\bfilePath\u0018\f \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyPageSnapshotb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyRectF.m15787c(), EzyPaint.m15711c(), EzyPointF.m15753c(), EzyMatrix.m15454c(), EzyGraphEnum.m15225a()});

    public static final class PageSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: g */
        public static final PageSnapshot f19100g = new PageSnapshot();

        /* renamed from: h */
        public static final Parser f19101h = new C8497a();

        /* renamed from: c */
        public int f19102c;

        /* renamed from: d */
        public EzyMatrix.Matrix f19103d;

        /* renamed from: e */
        public GraphSnapshot f19104e;

        /* renamed from: f */
        public byte f19105f;

        public static final class GraphSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: q */
            public static final GraphSnapshot f19106q = new GraphSnapshot();

            /* renamed from: r */
            public static final Parser f19107r = new C8495a();

            /* renamed from: c */
            public int f19108c;

            /* renamed from: d */
            public volatile Object f19109d;

            /* renamed from: e */
            public int f19110e;

            /* renamed from: f */
            public EzyRectF.RectF f19111f;

            /* renamed from: g */
            public EzyMatrix.Matrix f19112g;

            /* renamed from: h */
            public List f19113h;

            /* renamed from: i */
            public volatile Object f19114i;

            /* renamed from: j */
            public int f19115j;

            /* renamed from: k */
            public int f19116k;

            /* renamed from: l */
            public EzyPaint.Paint f19117l;

            /* renamed from: m */
            public volatile Object f19118m;

            /* renamed from: n */
            public List f19119n;

            /* renamed from: o */
            public volatile Object f19120o;

            /* renamed from: p */
            public byte f19121p;

            /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$GraphSnapshot$a */
            public class C8495a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8496b c8496bM15601V = GraphSnapshot.m15601V();
                    try {
                        c8496bM15601V.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8496bM15601V.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8496bM15601V.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8496bM15601V.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8496bM15601V.buildPartial());
                    }
                }
            }

            /* renamed from: G */
            public static GraphSnapshot m15600G() {
                return f19106q;
            }

            /* renamed from: V */
            public static C8496b m15601V() {
                return f19106q.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyPageSnapshot.f19097c;
            }

            public static Parser parser() {
                return f19107r;
            }

            /* renamed from: y */
            public static /* synthetic */ int m15617y(GraphSnapshot graphSnapshot, int i10) {
                int i11 = i10 | graphSnapshot.f19108c;
                graphSnapshot.f19108c = i11;
                return i11;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            public GraphSnapshot getDefaultInstanceForType() {
                return f19106q;
            }

            /* renamed from: I */
            public String m15620I() {
                Object obj = this.f19120o;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19120o = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: J */
            public EzyGraphEnum.GraphEnum m15621J() {
                EzyGraphEnum.GraphEnum graphEnumM15226a = EzyGraphEnum.GraphEnum.m15226a(this.f19110e);
                return graphEnumM15226a == null ? EzyGraphEnum.GraphEnum.UNRECOGNIZED : graphEnumM15226a;
            }

            /* renamed from: K */
            public int m15622K() {
                return this.f19110e;
            }

            /* renamed from: L */
            public String m15623L() {
                Object obj = this.f19109d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19109d = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: M */
            public EzyMatrix.Matrix m15624M() {
                EzyMatrix.Matrix matrix = this.f19112g;
                return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
            }

            /* renamed from: N */
            public EzyRectF.RectF m15625N() {
                EzyRectF.RectF rectF = this.f19111f;
                return rectF == null ? EzyRectF.RectF.m15792f() : rectF;
            }

            /* renamed from: O */
            public EzyPaint.Paint m15626O() {
                EzyPaint.Paint paint = this.f19117l;
                return paint == null ? EzyPaint.Paint.m15718k() : paint;
            }

            /* renamed from: P */
            public int m15627P() {
                return this.f19119n.size();
            }

            /* renamed from: Q */
            public List m15628Q() {
                return this.f19119n;
            }

            /* renamed from: R */
            public String m15629R() {
                Object obj = this.f19114i;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19114i = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: S */
            public int m15630S() {
                return this.f19115j;
            }

            /* renamed from: T */
            public boolean m15631T() {
                return (this.f19108c & 2) != 0;
            }

            /* renamed from: U */
            public boolean m15632U() {
                return (this.f19108c & 4) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: W, reason: merged with bridge method [inline-methods] */
            public C8496b newBuilderForType() {
                return m15601V();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: X, reason: merged with bridge method [inline-methods] */
            public C8496b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8496b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: Y, reason: merged with bridge method [inline-methods] */
            public C8496b toBuilder() {
                return this == f19106q ? new C8496b() : new C8496b().m15641D(this);
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GraphSnapshot)) {
                    return super.equals(obj);
                }
                GraphSnapshot graphSnapshot = (GraphSnapshot) obj;
                if (!m15623L().equals(graphSnapshot.m15623L()) || this.f19110e != graphSnapshot.f19110e || hasOutRect() != graphSnapshot.hasOutRect()) {
                    return false;
                }
                if ((hasOutRect() && !m15625N().equals(graphSnapshot.m15625N())) || m15631T() != graphSnapshot.m15631T()) {
                    return false;
                }
                if ((!m15631T() || m15624M().equals(graphSnapshot.m15624M())) && getChildGraphList().equals(graphSnapshot.getChildGraphList()) && m15629R().equals(graphSnapshot.m15629R()) && m15630S() == graphSnapshot.m15630S() && getBackgroundColor() == graphSnapshot.getBackgroundColor() && m15632U() == graphSnapshot.m15632U()) {
                    return (!m15632U() || m15626O().equals(graphSnapshot.m15626O())) && getContent().equals(graphSnapshot.getContent()) && m15628Q().equals(graphSnapshot.m15628Q()) && m15620I().equals(graphSnapshot.m15620I()) && getUnknownFields().equals(graphSnapshot.getUnknownFields());
                }
                return false;
            }

            public int getBackgroundColor() {
                return this.f19116k;
            }

            public int getChildGraphCount() {
                return this.f19113h.size();
            }

            public List getChildGraphList() {
                return this.f19113h;
            }

            public String getContent() {
                Object obj = this.f19118m;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19118m = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19107r;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f19109d) ? GeneratedMessage.computeStringSize(1, this.f19109d) : 0;
                if (this.f19110e != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.f19110e);
                }
                if ((1 & this.f19108c) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(3, m15625N());
                }
                if ((this.f19108c & 2) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(4, m15624M());
                }
                for (int i11 = 0; i11 < this.f19113h.size(); i11++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f19113h.get(i11));
                }
                if (!GeneratedMessage.isStringEmpty(this.f19114i)) {
                    iComputeStringSize += GeneratedMessage.computeStringSize(6, this.f19114i);
                }
                int i12 = this.f19115j;
                if (i12 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(7, i12);
                }
                int i13 = this.f19116k;
                if (i13 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(8, i13);
                }
                if ((this.f19108c & 4) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(9, m15626O());
                }
                if (!GeneratedMessage.isStringEmpty(this.f19118m)) {
                    iComputeStringSize += GeneratedMessage.computeStringSize(10, this.f19118m);
                }
                for (int i14 = 0; i14 < this.f19119n.size(); i14++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(11, (MessageLite) this.f19119n.get(i14));
                }
                if (!GeneratedMessage.isStringEmpty(this.f19120o)) {
                    iComputeStringSize += GeneratedMessage.computeStringSize(12, this.f19120o);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasOutRect() {
                return (this.f19108c & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m15623L().hashCode()) * 37) + 2) * 53) + this.f19110e;
                if (hasOutRect()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + m15625N().hashCode();
                }
                if (m15631T()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + m15624M().hashCode();
                }
                if (getChildGraphCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getChildGraphList().hashCode();
                }
                int iHashCode2 = (((((((((((iHashCode * 37) + 6) * 53) + m15629R().hashCode()) * 37) + 7) * 53) + m15630S()) * 37) + 8) * 53) + getBackgroundColor();
                if (m15632U()) {
                    iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m15626O().hashCode();
                }
                int iHashCode3 = (((iHashCode2 * 37) + 10) * 53) + getContent().hashCode();
                if (m15627P() > 0) {
                    iHashCode3 = (((iHashCode3 * 37) + 11) * 53) + m15628Q().hashCode();
                }
                int iHashCode4 = (((((iHashCode3 * 37) + 12) * 53) + m15620I().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode4;
                return iHashCode4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageSnapshot.f19098d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C8496b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19121p;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19121p = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new GraphSnapshot();
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessage.isStringEmpty(this.f19109d)) {
                    GeneratedMessage.writeString(codedOutputStream, 1, this.f19109d);
                }
                if (this.f19110e != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    codedOutputStream.writeEnum(2, this.f19110e);
                }
                if ((this.f19108c & 1) != 0) {
                    codedOutputStream.writeMessage(3, m15625N());
                }
                if ((this.f19108c & 2) != 0) {
                    codedOutputStream.writeMessage(4, m15624M());
                }
                for (int i10 = 0; i10 < this.f19113h.size(); i10++) {
                    codedOutputStream.writeMessage(5, (MessageLite) this.f19113h.get(i10));
                }
                if (!GeneratedMessage.isStringEmpty(this.f19114i)) {
                    GeneratedMessage.writeString(codedOutputStream, 6, this.f19114i);
                }
                int i11 = this.f19115j;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(7, i11);
                }
                int i12 = this.f19116k;
                if (i12 != 0) {
                    codedOutputStream.writeInt32(8, i12);
                }
                if ((4 & this.f19108c) != 0) {
                    codedOutputStream.writeMessage(9, m15626O());
                }
                if (!GeneratedMessage.isStringEmpty(this.f19118m)) {
                    GeneratedMessage.writeString(codedOutputStream, 10, this.f19118m);
                }
                for (int i13 = 0; i13 < this.f19119n.size(); i13++) {
                    codedOutputStream.writeMessage(11, (MessageLite) this.f19119n.get(i13));
                }
                if (!GeneratedMessage.isStringEmpty(this.f19120o)) {
                    GeneratedMessage.writeString(codedOutputStream, 12, this.f19120o);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$GraphSnapshot$b */
            public static final class C8496b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19122c;

                /* renamed from: d */
                public Object f19123d;

                /* renamed from: e */
                public int f19124e;

                /* renamed from: f */
                public EzyRectF.RectF f19125f;

                /* renamed from: g */
                public SingleFieldBuilderV3 f19126g;

                /* renamed from: h */
                public EzyMatrix.Matrix f19127h;

                /* renamed from: i */
                public SingleFieldBuilderV3 f19128i;

                /* renamed from: j */
                public List f19129j;

                /* renamed from: k */
                public RepeatedFieldBuilderV3 f19130k;

                /* renamed from: l */
                public Object f19131l;

                /* renamed from: m */
                public int f19132m;

                /* renamed from: n */
                public int f19133n;

                /* renamed from: o */
                public EzyPaint.Paint f19134o;

                /* renamed from: p */
                public SingleFieldBuilderV3 f19135p;

                /* renamed from: q */
                public Object f19136q;

                /* renamed from: r */
                public List f19137r;

                /* renamed from: s */
                public RepeatedFieldBuilderV3 f19138s;

                /* renamed from: t */
                public Object f19139t;

                private SingleFieldBuilderV3 getOutRectFieldBuilder() {
                    if (this.f19126g == null) {
                        this.f19126g = new SingleFieldBuilderV3(m15678u(), getParentForChildren(), isClean());
                        this.f19125f = null;
                    }
                    return this.f19126g;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getOutRectFieldBuilder();
                        m15677t();
                        getChildGraphFieldBuilder();
                        m15637y();
                        m15682z();
                    }
                }

                /* renamed from: y */
                private SingleFieldBuilderV3 m15637y() {
                    if (this.f19135p == null) {
                        this.f19135p = new SingleFieldBuilderV3(m15680w(), getParentForChildren(), isClean());
                        this.f19134o = null;
                    }
                    return this.f19135p;
                }

                /* renamed from: A */
                public String m15638A() {
                    Object obj = this.f19131l;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f19131l = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                public C8496b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        z10 = true;
                                    case 10:
                                        this.f19123d = codedInputStream.readStringRequireUtf8();
                                        this.f19122c |= 1;
                                    case 16:
                                        this.f19124e = codedInputStream.readEnum();
                                        this.f19122c |= 2;
                                    case 26:
                                        codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.f19122c |= 4;
                                    case 34:
                                        codedInputStream.readMessage(m15677t().getBuilder(), extensionRegistryLite);
                                        this.f19122c |= 8;
                                    case 42:
                                        GraphSnapshot graphSnapshot = (GraphSnapshot) codedInputStream.readMessage(GraphSnapshot.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19130k;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureChildGraphIsMutable();
                                            this.f19129j.add(graphSnapshot);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(graphSnapshot);
                                        }
                                    case 50:
                                        this.f19131l = codedInputStream.readStringRequireUtf8();
                                        this.f19122c |= 32;
                                    case Opcodes.FSTORE /* 56 */:
                                        this.f19132m = codedInputStream.readInt32();
                                        this.f19122c |= 64;
                                    case 64:
                                        this.f19133n = codedInputStream.readInt32();
                                        this.f19122c |= 128;
                                    case PatchStatus.CODE_LOAD_COPY_FILE /* 74 */:
                                        codedInputStream.readMessage(m15637y().getBuilder(), extensionRegistryLite);
                                        this.f19122c |= 256;
                                    case PatchStatus.CODE_LOAD_FIND_CLASS /* 82 */:
                                        this.f19136q = codedInputStream.readStringRequireUtf8();
                                        this.f19122c |= 512;
                                    case C7843ab.b.API_MYNA_INIT /* 90 */:
                                        EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19138s;
                                        if (repeatedFieldBuilderV32 == null) {
                                            m15673p();
                                            this.f19137r.add(pointF);
                                        } else {
                                            repeatedFieldBuilderV32.addMessage(pointF);
                                        }
                                    case 98:
                                        this.f19139t = codedInputStream.readStringRequireUtf8();
                                        this.f19122c |= 2048;
                                    default:
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                            z10 = true;
                                        }
                                }
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public C8496b mergeFrom(Message message) {
                    if (message instanceof GraphSnapshot) {
                        return m15641D((GraphSnapshot) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: D */
                public C8496b m15641D(GraphSnapshot graphSnapshot) {
                    if (graphSnapshot == GraphSnapshot.m15600G()) {
                        return this;
                    }
                    if (!graphSnapshot.m15623L().isEmpty()) {
                        this.f19123d = graphSnapshot.f19109d;
                        this.f19122c |= 1;
                        onChanged();
                    }
                    if (graphSnapshot.f19110e != 0) {
                        m15651N(graphSnapshot.m15622K());
                    }
                    if (graphSnapshot.hasOutRect()) {
                        m15643F(graphSnapshot.m15625N());
                    }
                    if (graphSnapshot.m15631T()) {
                        m15642E(graphSnapshot.m15624M());
                    }
                    if (this.f19130k == null) {
                        if (!graphSnapshot.f19113h.isEmpty()) {
                            if (this.f19129j.isEmpty()) {
                                this.f19129j = graphSnapshot.f19113h;
                                this.f19122c &= -17;
                            } else {
                                ensureChildGraphIsMutable();
                                this.f19129j.addAll(graphSnapshot.f19113h);
                            }
                            onChanged();
                        }
                    } else if (!graphSnapshot.f19113h.isEmpty()) {
                        if (this.f19130k.isEmpty()) {
                            this.f19130k.dispose();
                            this.f19130k = null;
                            this.f19129j = graphSnapshot.f19113h;
                            this.f19122c &= -17;
                            this.f19130k = GeneratedMessage.alwaysUseFieldBuilders ? getChildGraphFieldBuilder() : null;
                        } else {
                            this.f19130k.addAllMessages(graphSnapshot.f19113h);
                        }
                    }
                    if (!graphSnapshot.m15629R().isEmpty()) {
                        this.f19131l = graphSnapshot.f19114i;
                        this.f19122c |= 32;
                        onChanged();
                    }
                    if (graphSnapshot.m15630S() != 0) {
                        m15658U(graphSnapshot.m15630S());
                    }
                    if (graphSnapshot.getBackgroundColor() != 0) {
                        m15646I(graphSnapshot.getBackgroundColor());
                    }
                    if (graphSnapshot.m15632U()) {
                        m15644G(graphSnapshot.m15626O());
                    }
                    if (!graphSnapshot.getContent().isEmpty()) {
                        this.f19136q = graphSnapshot.f19118m;
                        this.f19122c |= 512;
                        onChanged();
                    }
                    if (this.f19138s == null) {
                        if (!graphSnapshot.f19119n.isEmpty()) {
                            if (this.f19137r.isEmpty()) {
                                this.f19137r = graphSnapshot.f19119n;
                                this.f19122c &= -1025;
                            } else {
                                m15673p();
                                this.f19137r.addAll(graphSnapshot.f19119n);
                            }
                            onChanged();
                        }
                    } else if (!graphSnapshot.f19119n.isEmpty()) {
                        if (this.f19138s.isEmpty()) {
                            this.f19138s.dispose();
                            this.f19138s = null;
                            this.f19137r = graphSnapshot.f19119n;
                            this.f19122c &= -1025;
                            this.f19138s = GeneratedMessage.alwaysUseFieldBuilders ? m15682z() : null;
                        } else {
                            this.f19138s.addAllMessages(graphSnapshot.f19119n);
                        }
                    }
                    if (!graphSnapshot.m15620I().isEmpty()) {
                        this.f19139t = graphSnapshot.f19120o;
                        this.f19122c |= 2048;
                        onChanged();
                    }
                    mergeUnknownFields(graphSnapshot.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: E */
                public C8496b m15642E(EzyMatrix.Matrix matrix) {
                    EzyMatrix.Matrix matrix2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19128i;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(matrix);
                    } else if ((this.f19122c & 8) == 0 || (matrix2 = this.f19127h) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                        this.f19127h = matrix;
                    } else {
                        m15676s().m15492n(matrix);
                    }
                    if (this.f19127h != null) {
                        this.f19122c |= 8;
                        onChanged();
                    }
                    return this;
                }

                /* renamed from: F */
                public C8496b m15643F(EzyRectF.RectF rectF) {
                    EzyRectF.RectF rectF2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19126g;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(rectF);
                    } else if ((this.f19122c & 4) == 0 || (rectF2 = this.f19125f) == null || rectF2 == EzyRectF.RectF.m15792f()) {
                        this.f19125f = rectF;
                    } else {
                        m15679v().m15810n(rectF);
                    }
                    if (this.f19125f != null) {
                        this.f19122c |= 4;
                        onChanged();
                    }
                    return this;
                }

                /* renamed from: G */
                public C8496b m15644G(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19135p;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f19122c & 256) == 0 || (paint2 = this.f19134o) == null || paint2 == EzyPaint.Paint.m15718k()) {
                        this.f19134o = paint;
                    } else {
                        m15681x().m15740n(paint);
                    }
                    if (this.f19134o != null) {
                        this.f19122c |= 256;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: H, reason: merged with bridge method [inline-methods] */
                public final C8496b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8496b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: I */
                public C8496b m15646I(int i10) {
                    this.f19133n = i10;
                    this.f19122c |= 128;
                    onChanged();
                    return this;
                }

                /* renamed from: J */
                public C8496b m15647J(String str) {
                    str.getClass();
                    this.f19136q = str;
                    this.f19122c |= 512;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: K, reason: merged with bridge method [inline-methods] */
                public C8496b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8496b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: L */
                public C8496b m15649L(String str) {
                    str.getClass();
                    this.f19139t = str;
                    this.f19122c |= 2048;
                    onChanged();
                    return this;
                }

                /* renamed from: M */
                public C8496b m15650M(EzyGraphEnum.GraphEnum graphEnum) {
                    graphEnum.getClass();
                    this.f19122c |= 2;
                    this.f19124e = graphEnum.getNumber();
                    onChanged();
                    return this;
                }

                /* renamed from: N */
                public C8496b m15651N(int i10) {
                    this.f19124e = i10;
                    this.f19122c |= 2;
                    onChanged();
                    return this;
                }

                /* renamed from: O */
                public C8496b m15652O(String str) {
                    str.getClass();
                    this.f19123d = str;
                    this.f19122c |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: P */
                public C8496b m15653P(EzyMatrix.Matrix matrix) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19128i;
                    if (singleFieldBuilderV3 == null) {
                        matrix.getClass();
                        this.f19127h = matrix;
                    } else {
                        singleFieldBuilderV3.setMessage(matrix);
                    }
                    this.f19122c |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: Q */
                public C8496b m15654Q(EzyRectF.RectF rectF) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19126g;
                    if (singleFieldBuilderV3 == null) {
                        rectF.getClass();
                        this.f19125f = rectF;
                    } else {
                        singleFieldBuilderV3.setMessage(rectF);
                    }
                    this.f19122c |= 4;
                    onChanged();
                    return this;
                }

                /* renamed from: R */
                public C8496b m15655R(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19135p;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f19134o = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f19122c |= 256;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: S, reason: merged with bridge method [inline-methods] */
                public C8496b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8496b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                /* renamed from: T */
                public C8496b m15657T(String str) {
                    str.getClass();
                    this.f19131l = str;
                    this.f19122c |= 32;
                    onChanged();
                    return this;
                }

                /* renamed from: U */
                public C8496b m15658U(int i10) {
                    this.f19132m = i10;
                    this.f19122c |= 64;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: V, reason: merged with bridge method [inline-methods] */
                public final C8496b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8496b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: b */
                public C8496b m15660b(Iterable iterable) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19130k;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensureChildGraphIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.f19129j);
                    onChanged();
                    return this;
                }

                /* renamed from: d */
                public C8496b m15661d(C8496b c8496b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19130k;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c8496b.build());
                        return this;
                    }
                    ensureChildGraphIsMutable();
                    this.f19129j.add(c8496b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: e */
                public C8496b m15662e(EzyPointF.PointF pointF) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19138s;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointF);
                        return this;
                    }
                    pointF.getClass();
                    m15673p();
                    this.f19137r.add(pointF);
                    onChanged();
                    return this;
                }

                public final void ensureChildGraphIsMutable() {
                    if ((this.f19122c & 16) == 0) {
                        this.f19129j = new ArrayList(this.f19129j);
                        this.f19122c |= 16;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C8496b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8496b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot build() {
                    GraphSnapshot graphSnapshotBuildPartial = buildPartial();
                    if (graphSnapshotBuildPartial.isInitialized()) {
                        return graphSnapshotBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphSnapshotBuildPartial);
                }

                public final RepeatedFieldBuilderV3 getChildGraphFieldBuilder() {
                    if (this.f19130k == null) {
                        this.f19130k = new RepeatedFieldBuilderV3(this.f19129j, (this.f19122c & 16) != 0, getParentForChildren(), isClean());
                        this.f19129j = null;
                    }
                    return this.f19130k;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyPageSnapshot.f19097c;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot buildPartial() {
                    GraphSnapshot graphSnapshot = new GraphSnapshot(this);
                    m15667j(graphSnapshot);
                    if (this.f19122c != 0) {
                        m15666i(graphSnapshot);
                    }
                    onBuilt();
                    return graphSnapshot;
                }

                /* renamed from: i */
                public final void m15666i(GraphSnapshot graphSnapshot) {
                    int i10;
                    int i11 = this.f19122c;
                    if ((i11 & 1) != 0) {
                        graphSnapshot.f19109d = this.f19123d;
                    }
                    if ((i11 & 2) != 0) {
                        graphSnapshot.f19110e = this.f19124e;
                    }
                    if ((i11 & 4) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19126g;
                        graphSnapshot.f19111f = singleFieldBuilderV3 == null ? this.f19125f : (EzyRectF.RectF) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 8) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f19128i;
                        graphSnapshot.f19112g = singleFieldBuilderV32 == null ? this.f19127h : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                        i10 |= 2;
                    }
                    if ((i11 & 32) != 0) {
                        graphSnapshot.f19114i = this.f19131l;
                    }
                    if ((i11 & 64) != 0) {
                        graphSnapshot.f19115j = this.f19132m;
                    }
                    if ((i11 & 128) != 0) {
                        graphSnapshot.f19116k = this.f19133n;
                    }
                    if ((i11 & 256) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f19135p;
                        graphSnapshot.f19117l = singleFieldBuilderV33 == null ? this.f19134o : (EzyPaint.Paint) singleFieldBuilderV33.build();
                        i10 |= 4;
                    }
                    if ((i11 & 512) != 0) {
                        graphSnapshot.f19118m = this.f19136q;
                    }
                    if ((i11 & 2048) != 0) {
                        graphSnapshot.f19120o = this.f19139t;
                    }
                    GraphSnapshot.m15617y(graphSnapshot, i10);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyPageSnapshot.f19098d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C8496b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                /* renamed from: j */
                public final void m15667j(GraphSnapshot graphSnapshot) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19130k;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.f19122c & 16) != 0) {
                            this.f19129j = Collections.unmodifiableList(this.f19129j);
                            this.f19122c &= -17;
                        }
                        graphSnapshot.f19113h = this.f19129j;
                    } else {
                        graphSnapshot.f19113h = repeatedFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19138s;
                    if (repeatedFieldBuilderV32 != null) {
                        graphSnapshot.f19119n = repeatedFieldBuilderV32.build();
                        return;
                    }
                    if ((this.f19122c & 1024) != 0) {
                        this.f19137r = Collections.unmodifiableList(this.f19137r);
                        this.f19122c &= -1025;
                    }
                    graphSnapshot.f19119n = this.f19137r;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C8496b clear() {
                    super.clear();
                    this.f19122c = 0;
                    this.f19123d = "";
                    this.f19124e = 0;
                    this.f19125f = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19126g;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f19126g = null;
                    }
                    this.f19127h = null;
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f19128i;
                    if (singleFieldBuilderV32 != null) {
                        singleFieldBuilderV32.dispose();
                        this.f19128i = null;
                    }
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19130k;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f19129j = Collections.EMPTY_LIST;
                    } else {
                        this.f19129j = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f19122c &= -17;
                    this.f19131l = "";
                    this.f19132m = 0;
                    this.f19133n = 0;
                    this.f19134o = null;
                    SingleFieldBuilderV3 singleFieldBuilderV33 = this.f19135p;
                    if (singleFieldBuilderV33 != null) {
                        singleFieldBuilderV33.dispose();
                        this.f19135p = null;
                    }
                    this.f19136q = "";
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f19138s;
                    if (repeatedFieldBuilderV32 == null) {
                        this.f19137r = Collections.EMPTY_LIST;
                    } else {
                        this.f19137r = null;
                        repeatedFieldBuilderV32.clear();
                    }
                    this.f19122c &= -1025;
                    this.f19139t = "";
                    return this;
                }

                /* renamed from: l */
                public C8496b m15669l() {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19130k;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.f19129j = Collections.EMPTY_LIST;
                    this.f19122c &= -17;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C8496b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8496b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C8496b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8496b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public C8496b mo33979clone() {
                    return (C8496b) super.mo33979clone();
                }

                /* renamed from: p */
                public final void m15673p() {
                    if ((this.f19122c & 1024) == 0) {
                        this.f19137r = new ArrayList(this.f19137r);
                        this.f19122c |= 1024;
                    }
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot getDefaultInstanceForType() {
                    return GraphSnapshot.m15600G();
                }

                /* renamed from: r */
                public EzyMatrix.Matrix m15675r() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19128i;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                    }
                    EzyMatrix.Matrix matrix = this.f19127h;
                    return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                }

                /* renamed from: s */
                public EzyMatrix.Matrix.C8487b m15676s() {
                    this.f19122c |= 8;
                    onChanged();
                    return (EzyMatrix.Matrix.C8487b) m15677t().getBuilder();
                }

                /* renamed from: t */
                public final SingleFieldBuilderV3 m15677t() {
                    if (this.f19128i == null) {
                        this.f19128i = new SingleFieldBuilderV3(m15675r(), getParentForChildren(), isClean());
                        this.f19127h = null;
                    }
                    return this.f19128i;
                }

                /* renamed from: u */
                public EzyRectF.RectF m15678u() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19126g;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                    }
                    EzyRectF.RectF rectF = this.f19125f;
                    return rectF == null ? EzyRectF.RectF.m15792f() : rectF;
                }

                /* renamed from: v */
                public EzyRectF.RectF.C8508b m15679v() {
                    this.f19122c |= 4;
                    onChanged();
                    return (EzyRectF.RectF.C8508b) getOutRectFieldBuilder().getBuilder();
                }

                /* renamed from: w */
                public EzyPaint.Paint m15680w() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19135p;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f19134o;
                    return paint == null ? EzyPaint.Paint.m15718k() : paint;
                }

                /* renamed from: x */
                public EzyPaint.Paint.C8501b m15681x() {
                    this.f19122c |= 256;
                    onChanged();
                    return (EzyPaint.Paint.C8501b) m15637y().getBuilder();
                }

                /* renamed from: z */
                public final RepeatedFieldBuilderV3 m15682z() {
                    if (this.f19138s == null) {
                        this.f19138s = new RepeatedFieldBuilderV3(this.f19137r, (this.f19122c & 1024) != 0, getParentForChildren(), isClean());
                        this.f19137r = null;
                    }
                    return this.f19138s;
                }

                public C8496b() {
                    this.f19123d = "";
                    this.f19124e = 0;
                    List list = Collections.EMPTY_LIST;
                    this.f19129j = list;
                    this.f19131l = "";
                    this.f19136q = "";
                    this.f19137r = list;
                    this.f19139t = "";
                    maybeForceBuilderInitialization();
                }

                public C8496b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f19123d = "";
                    this.f19124e = 0;
                    List list = Collections.EMPTY_LIST;
                    this.f19129j = list;
                    this.f19131l = "";
                    this.f19136q = "";
                    this.f19137r = list;
                    this.f19139t = "";
                    maybeForceBuilderInitialization();
                }
            }

            public GraphSnapshot(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19109d = "";
                this.f19110e = 0;
                this.f19114i = "";
                this.f19115j = 0;
                this.f19116k = 0;
                this.f19118m = "";
                this.f19120o = "";
                this.f19121p = (byte) -1;
            }

            private GraphSnapshot() {
                this.f19109d = "";
                this.f19110e = 0;
                this.f19114i = "";
                this.f19115j = 0;
                this.f19116k = 0;
                this.f19118m = "";
                this.f19120o = "";
                this.f19121p = (byte) -1;
                this.f19109d = "";
                this.f19110e = 0;
                List list = Collections.EMPTY_LIST;
                this.f19113h = list;
                this.f19114i = "";
                this.f19118m = "";
                this.f19119n = list;
                this.f19120o = "";
            }
        }

        /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$a */
        public class C8497a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PageSnapshot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8498b c8498bM15586o = PageSnapshot.m15586o();
                try {
                    c8498bM15586o.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8498bM15586o.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8498bM15586o.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8498bM15586o.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8498bM15586o.buildPartial());
                }
            }
        }

        /* renamed from: e */
        public static /* synthetic */ int m15584e(PageSnapshot pageSnapshot, int i10) {
            int i11 = i10 | pageSnapshot.f19102c;
            pageSnapshot.f19102c = i11;
            return i11;
        }

        /* renamed from: g */
        public static PageSnapshot m15585g() {
            return f19100g;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPageSnapshot.f19095a;
        }

        /* renamed from: o */
        public static C8498b m15586o() {
            return f19100g.toBuilder();
        }

        /* renamed from: t */
        public static PageSnapshot m15587t(InputStream inputStream) {
            return (PageSnapshot) GeneratedMessage.parseWithIOException(f19101h, inputStream);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PageSnapshot)) {
                return super.equals(obj);
            }
            PageSnapshot pageSnapshot = (PageSnapshot) obj;
            if (m15591n() != pageSnapshot.m15591n()) {
                return false;
            }
            if ((!m15591n() || m15588f().equals(pageSnapshot.m15588f())) && hasGraphSnapshot() == pageSnapshot.hasGraphSnapshot()) {
                return (!hasGraphSnapshot() || m15590m().equals(pageSnapshot.m15590m())) && getUnknownFields().equals(pageSnapshot.getUnknownFields());
            }
            return false;
        }

        /* renamed from: f */
        public EzyMatrix.Matrix m15588f() {
            EzyMatrix.Matrix matrix = this.f19103d;
            return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19101h;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = (this.f19102c & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m15588f()) : 0;
            if ((this.f19102c & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m15590m());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean hasGraphSnapshot() {
            return (this.f19102c & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m15591n()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m15588f().hashCode();
            }
            if (hasGraphSnapshot()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m15590m().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPageSnapshot.f19096b.ensureFieldAccessorsInitialized(PageSnapshot.class, C8498b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19105f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19105f = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public PageSnapshot getDefaultInstanceForType() {
            return f19100g;
        }

        /* renamed from: m */
        public GraphSnapshot m15590m() {
            GraphSnapshot graphSnapshot = this.f19104e;
            return graphSnapshot == null ? GraphSnapshot.m15600G() : graphSnapshot;
        }

        /* renamed from: n */
        public boolean m15591n() {
            return (this.f19102c & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageSnapshot();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C8498b newBuilderForType() {
            return m15586o();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C8498b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8498b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C8498b toBuilder() {
            return this == f19100g ? new C8498b() : new C8498b().m15702t(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.f19102c & 1) != 0) {
                codedOutputStream.writeMessage(1, m15588f());
            }
            if ((this.f19102c & 2) != 0) {
                codedOutputStream.writeMessage(2, m15590m());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$b */
        public static final class C8498b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19140c;

            /* renamed from: d */
            public EzyMatrix.Matrix f19141d;

            /* renamed from: e */
            public SingleFieldBuilderV3 f19142e;

            /* renamed from: f */
            public GraphSnapshot f19143f;

            /* renamed from: g */
            public SingleFieldBuilderV3 f19144g;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    m15695m();
                    getGraphSnapshotFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public final C8498b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8498b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8498b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8498b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public PageSnapshot build() {
                PageSnapshot pageSnapshotBuildPartial = buildPartial();
                if (pageSnapshotBuildPartial.isInitialized()) {
                    return pageSnapshotBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageSnapshotBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public PageSnapshot buildPartial() {
                PageSnapshot pageSnapshot = new PageSnapshot(this);
                if (this.f19140c != 0) {
                    m15688f(pageSnapshot);
                }
                onBuilt();
                return pageSnapshot;
            }

            /* renamed from: f */
            public final void m15688f(PageSnapshot pageSnapshot) {
                int i10;
                int i11 = this.f19140c;
                if ((i11 & 1) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19142e;
                    pageSnapshot.f19103d = singleFieldBuilderV3 == null ? this.f19141d : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f19144g;
                    pageSnapshot.f19104e = singleFieldBuilderV32 == null ? this.f19143f : (GraphSnapshot) singleFieldBuilderV32.build();
                    i10 |= 2;
                }
                PageSnapshot.m15584e(pageSnapshot, i10);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C8498b clear() {
                super.clear();
                this.f19140c = 0;
                this.f19141d = null;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19142e;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f19142e = null;
                }
                this.f19143f = null;
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f19144g;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.f19144g = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPageSnapshot.f19095a;
            }

            public final SingleFieldBuilderV3 getGraphSnapshotFieldBuilder() {
                if (this.f19144g == null) {
                    this.f19144g = new SingleFieldBuilderV3(m15697o(), getParentForChildren(), isClean());
                    this.f19143f = null;
                }
                return this.f19144g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C8498b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8498b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8498b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8498b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageSnapshot.f19096b.ensureFieldAccessorsInitialized(PageSnapshot.class, C8498b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8498b mo33979clone() {
                return (C8498b) super.mo33979clone();
            }

            /* renamed from: k */
            public EzyMatrix.Matrix m15693k() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19142e;
                if (singleFieldBuilderV3 != null) {
                    return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                }
                EzyMatrix.Matrix matrix = this.f19141d;
                return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
            }

            /* renamed from: l */
            public EzyMatrix.Matrix.C8487b m15694l() {
                this.f19140c |= 1;
                onChanged();
                return (EzyMatrix.Matrix.C8487b) m15695m().getBuilder();
            }

            /* renamed from: m */
            public final SingleFieldBuilderV3 m15695m() {
                if (this.f19142e == null) {
                    this.f19142e = new SingleFieldBuilderV3(m15693k(), getParentForChildren(), isClean());
                    this.f19141d = null;
                }
                return this.f19142e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public PageSnapshot getDefaultInstanceForType() {
                return PageSnapshot.m15585g();
            }

            /* renamed from: o */
            public GraphSnapshot m15697o() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19144g;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot) singleFieldBuilderV3.getMessage();
                }
                GraphSnapshot graphSnapshot = this.f19143f;
                return graphSnapshot == null ? GraphSnapshot.m15600G() : graphSnapshot;
            }

            /* renamed from: p */
            public GraphSnapshot.C8496b m15698p() {
                this.f19140c |= 2;
                onChanged();
                return (GraphSnapshot.C8496b) getGraphSnapshotFieldBuilder().getBuilder();
            }

            /* renamed from: q */
            public C8498b m15699q(EzyMatrix.Matrix matrix) {
                EzyMatrix.Matrix matrix2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19142e;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(matrix);
                } else if ((this.f19140c & 1) == 0 || (matrix2 = this.f19141d) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                    this.f19141d = matrix;
                } else {
                    m15694l().m15492n(matrix);
                }
                if (this.f19141d != null) {
                    this.f19140c |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C8498b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(m15695m().getBuilder(), extensionRegistryLite);
                                    this.f19140c |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getGraphSnapshotFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.f19140c |= 2;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C8498b mergeFrom(Message message) {
                if (message instanceof PageSnapshot) {
                    return m15702t((PageSnapshot) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C8498b m15702t(PageSnapshot pageSnapshot) {
                if (pageSnapshot == PageSnapshot.m15585g()) {
                    return this;
                }
                if (pageSnapshot.m15591n()) {
                    m15699q(pageSnapshot.m15588f());
                }
                if (pageSnapshot.hasGraphSnapshot()) {
                    m15703u(pageSnapshot.m15590m());
                }
                mergeUnknownFields(pageSnapshot.getUnknownFields());
                onChanged();
                return this;
            }

            /* renamed from: u */
            public C8498b m15703u(GraphSnapshot graphSnapshot) {
                GraphSnapshot graphSnapshot2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19144g;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(graphSnapshot);
                } else if ((this.f19140c & 2) == 0 || (graphSnapshot2 = this.f19143f) == null || graphSnapshot2 == GraphSnapshot.m15600G()) {
                    this.f19143f = graphSnapshot;
                } else {
                    m15698p().m15641D(graphSnapshot);
                }
                if (this.f19143f != null) {
                    this.f19140c |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C8498b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8498b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: w */
            public C8498b m15705w(EzyMatrix.Matrix matrix) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19142e;
                if (singleFieldBuilderV3 == null) {
                    matrix.getClass();
                    this.f19141d = matrix;
                } else {
                    singleFieldBuilderV3.setMessage(matrix);
                }
                this.f19140c |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public C8498b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8498b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: y */
            public C8498b m15707y(GraphSnapshot graphSnapshot) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19144g;
                if (singleFieldBuilderV3 == null) {
                    graphSnapshot.getClass();
                    this.f19143f = graphSnapshot;
                } else {
                    singleFieldBuilderV3.setMessage(graphSnapshot);
                }
                this.f19140c |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C8498b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8498b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public C8498b() {
                maybeForceBuilderInitialization();
            }

            public C8498b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }
        }

        public PageSnapshot(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19105f = (byte) -1;
        }

        private PageSnapshot() {
            this.f19105f = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15580e().getMessageTypes().get(0);
        f19095a = descriptor;
        f19096b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CameraMatrix", "GraphSnapshot"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f19097c = descriptor2;
        f19098d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "GraphEnum", "OutRect", "Matrix", "ChildGraph", "SourceFileName", "SourceId", "BackgroundColor", "Paint", "Content", "PointList", "FilePath"});
        EzyRectF.m15787c();
        EzyPaint.m15711c();
        EzyPointF.m15753c();
        EzyMatrix.m15454c();
        EzyGraphEnum.m15225a();
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m15580e() {
        return f19099e;
    }
}
