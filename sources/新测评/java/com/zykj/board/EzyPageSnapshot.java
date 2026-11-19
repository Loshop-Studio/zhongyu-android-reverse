package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
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

/* loaded from: classes4.dex */
public abstract class EzyPageSnapshot {

    /* renamed from: a */
    public static final Descriptors.Descriptor f8259a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8260b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f8261c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f8262d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f8263e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013GraphSnapshot.proto\u001a\u0011utils/RectF.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0012utils/Matrix.proto\u001a\u0015enums/GraphEnum.proto\"\u009a\u0003\n\fPageSnapshot\u0012\u001d\n\fcameraMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u00122\n\rgraphSnapshot\u0018\u0002 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u001a¶\u0002\n\rGraphSnapshot\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0017\n\u0006matrix\u0018\u0004 \u0001(\u000b2\u0007.Matrix\u0012/\n\nchildGraph\u0018\u0005 \u0003(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0016\n\u000esourceFileName\u0018\u0006 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0007 \u0001(\u0005\u0012\u0017\n\u000fbackgroundColor\u0018\b \u0001(\u0005\u0012\u0015\n\u0005paint\u0018\t \u0001(\u000b2\u0006.Paint\u0012\u000f\n\u0007content\u0018\n \u0001(\t\u0012\u001a\n\tpointList\u0018\u000b \u0003(\u000b2\u0007.PointF\u0012\u0010\n\bfilePath\u0018\f \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyPageSnapshotb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyRectF.m8037c(), EzyPaint.m7960c(), EzyPointF.m8002c(), EzyMatrix.m7709c(), EzyGraphEnum.m7488a()});

    public static final class PageSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final PageSnapshot f8264e = new PageSnapshot();

        /* renamed from: f */
        public static final Parser f8265f = new C6800a();

        /* renamed from: a */
        public int f8266a;

        /* renamed from: b */
        public EzyMatrix.Matrix f8267b;

        /* renamed from: c */
        public GraphSnapshot f8268c;

        /* renamed from: d */
        public byte f8269d;

        public static final class GraphSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: o */
            public static final GraphSnapshot f8270o = new GraphSnapshot();

            /* renamed from: p */
            public static final Parser f8271p = new C6798a();

            /* renamed from: a */
            public int f8272a;

            /* renamed from: b */
            public volatile Object f8273b;

            /* renamed from: c */
            public int f8274c;

            /* renamed from: d */
            public EzyRectF.RectF f8275d;

            /* renamed from: e */
            public EzyMatrix.Matrix f8276e;

            /* renamed from: f */
            public List f8277f;

            /* renamed from: g */
            public volatile Object f8278g;

            /* renamed from: h */
            public int f8279h;

            /* renamed from: i */
            public int f8280i;

            /* renamed from: j */
            public EzyPaint.Paint f8281j;

            /* renamed from: k */
            public volatile Object f8282k;

            /* renamed from: l */
            public List f8283l;

            /* renamed from: m */
            public volatile Object f8284m;

            /* renamed from: n */
            public byte f8285n;

            /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$GraphSnapshot$a */
            public class C6798a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6799b c6799bM7855U = GraphSnapshot.m7855U();
                    try {
                        c6799bM7855U.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6799bM7855U.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6799bM7855U.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6799bM7855U.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6799bM7855U.buildPartial());
                    }
                }
            }

            /* renamed from: G */
            public static GraphSnapshot m7854G() {
                return f8270o;
            }

            /* renamed from: U */
            public static C6799b m7855U() {
                return f8270o.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyPageSnapshot.f8261c;
            }

            public static Parser parser() {
                return f8271p;
            }

            /* renamed from: z */
            public static /* synthetic */ int m7871z(GraphSnapshot graphSnapshot, int i10) {
                int i11 = i10 | graphSnapshot.f8272a;
                graphSnapshot.f8272a = i11;
                return i11;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            public GraphSnapshot getDefaultInstanceForType() {
                return f8270o;
            }

            /* renamed from: I */
            public String m7873I() {
                Object obj = this.f8284m;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8284m = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: J */
            public EzyGraphEnum.GraphEnum m7874J() {
                EzyGraphEnum.GraphEnum graphEnumM7490f = EzyGraphEnum.GraphEnum.m7490f(this.f8274c);
                return graphEnumM7490f == null ? EzyGraphEnum.GraphEnum.UNRECOGNIZED : graphEnumM7490f;
            }

            /* renamed from: K */
            public int m7875K() {
                return this.f8274c;
            }

            /* renamed from: L */
            public String m7876L() {
                Object obj = this.f8273b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8273b = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: M */
            public EzyMatrix.Matrix m7877M() {
                EzyMatrix.Matrix matrix = this.f8276e;
                return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
            }

            /* renamed from: N */
            public EzyRectF.RectF m7878N() {
                EzyRectF.RectF rectF = this.f8275d;
                return rectF == null ? EzyRectF.RectF.m8042m() : rectF;
            }

            /* renamed from: O */
            public EzyPaint.Paint m7879O() {
                EzyPaint.Paint paint = this.f8281j;
                return paint == null ? EzyPaint.Paint.m7967q() : paint;
            }

            /* renamed from: P */
            public int m7880P() {
                return this.f8283l.size();
            }

            /* renamed from: Q */
            public List m7881Q() {
                return this.f8283l;
            }

            /* renamed from: R */
            public String m7882R() {
                Object obj = this.f8278g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8278g = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: S */
            public int m7883S() {
                return this.f8279h;
            }

            /* renamed from: T */
            public boolean m7884T() {
                return (this.f8272a & 2) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: V, reason: merged with bridge method [inline-methods] */
            public C6799b newBuilderForType() {
                return m7855U();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: W, reason: merged with bridge method [inline-methods] */
            public C6799b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6799b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: X, reason: merged with bridge method [inline-methods] */
            public C6799b toBuilder() {
                return this == f8270o ? new C6799b() : new C6799b().m7891B(this);
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
                if (!m7876L().equals(graphSnapshot.m7876L()) || this.f8274c != graphSnapshot.f8274c || hasOutRect() != graphSnapshot.hasOutRect()) {
                    return false;
                }
                if ((hasOutRect() && !m7878N().equals(graphSnapshot.m7878N())) || m7884T() != graphSnapshot.m7884T()) {
                    return false;
                }
                if ((!m7884T() || m7877M().equals(graphSnapshot.m7877M())) && getChildGraphList().equals(graphSnapshot.getChildGraphList()) && m7882R().equals(graphSnapshot.m7882R()) && m7883S() == graphSnapshot.m7883S() && getBackgroundColor() == graphSnapshot.getBackgroundColor() && hasPaint() == graphSnapshot.hasPaint()) {
                    return (!hasPaint() || m7879O().equals(graphSnapshot.m7879O())) && getContent().equals(graphSnapshot.getContent()) && m7881Q().equals(graphSnapshot.m7881Q()) && m7873I().equals(graphSnapshot.m7873I()) && getUnknownFields().equals(graphSnapshot.getUnknownFields());
                }
                return false;
            }

            public int getBackgroundColor() {
                return this.f8280i;
            }

            public int getChildGraphCount() {
                return this.f8277f.size();
            }

            public List getChildGraphList() {
                return this.f8277f;
            }

            public String getContent() {
                Object obj = this.f8282k;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8282k = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8271p;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8273b) ? GeneratedMessageV3.computeStringSize(1, this.f8273b) : 0;
                if (this.f8274c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.f8274c);
                }
                if ((1 & this.f8272a) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(3, m7878N());
                }
                if ((this.f8272a & 2) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(4, m7877M());
                }
                for (int i11 = 0; i11 < this.f8277f.size(); i11++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f8277f.get(i11));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8278g)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f8278g);
                }
                int i12 = this.f8279h;
                if (i12 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(7, i12);
                }
                int i13 = this.f8280i;
                if (i13 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(8, i13);
                }
                if ((this.f8272a & 4) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(9, m7879O());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8282k)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.f8282k);
                }
                for (int i14 = 0; i14 < this.f8283l.size(); i14++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(11, (MessageLite) this.f8283l.get(i14));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8284m)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f8284m);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasOutRect() {
                return (this.f8272a & 1) != 0;
            }

            public boolean hasPaint() {
                return (this.f8272a & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7876L().hashCode()) * 37) + 2) * 53) + this.f8274c;
                if (hasOutRect()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + m7878N().hashCode();
                }
                if (m7884T()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + m7877M().hashCode();
                }
                if (getChildGraphCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getChildGraphList().hashCode();
                }
                int iHashCode2 = (((((((((((iHashCode * 37) + 6) * 53) + m7882R().hashCode()) * 37) + 7) * 53) + m7883S()) * 37) + 8) * 53) + getBackgroundColor();
                if (hasPaint()) {
                    iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m7879O().hashCode();
                }
                int iHashCode3 = (((iHashCode2 * 37) + 10) * 53) + getContent().hashCode();
                if (m7880P() > 0) {
                    iHashCode3 = (((iHashCode3 * 37) + 11) * 53) + m7881Q().hashCode();
                }
                int iHashCode4 = (((((iHashCode3 * 37) + 12) * 53) + m7873I().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode4;
                return iHashCode4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageSnapshot.f8262d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C6799b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8285n;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8285n = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new GraphSnapshot();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f8273b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8273b);
                }
                if (this.f8274c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    codedOutputStream.writeEnum(2, this.f8274c);
                }
                if ((this.f8272a & 1) != 0) {
                    codedOutputStream.writeMessage(3, m7878N());
                }
                if ((this.f8272a & 2) != 0) {
                    codedOutputStream.writeMessage(4, m7877M());
                }
                for (int i10 = 0; i10 < this.f8277f.size(); i10++) {
                    codedOutputStream.writeMessage(5, (MessageLite) this.f8277f.get(i10));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8278g)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.f8278g);
                }
                int i11 = this.f8279h;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(7, i11);
                }
                int i12 = this.f8280i;
                if (i12 != 0) {
                    codedOutputStream.writeInt32(8, i12);
                }
                if ((4 & this.f8272a) != 0) {
                    codedOutputStream.writeMessage(9, m7879O());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8282k)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 10, this.f8282k);
                }
                for (int i13 = 0; i13 < this.f8283l.size(); i13++) {
                    codedOutputStream.writeMessage(11, (MessageLite) this.f8283l.get(i13));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8284m)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 12, this.f8284m);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$GraphSnapshot$b */
            public static final class C6799b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8286a;

                /* renamed from: b */
                public Object f8287b;

                /* renamed from: c */
                public int f8288c;

                /* renamed from: d */
                public EzyRectF.RectF f8289d;

                /* renamed from: e */
                public SingleFieldBuilderV3 f8290e;

                /* renamed from: f */
                public EzyMatrix.Matrix f8291f;

                /* renamed from: g */
                public SingleFieldBuilderV3 f8292g;

                /* renamed from: h */
                public List f8293h;

                /* renamed from: i */
                public RepeatedFieldBuilderV3 f8294i;

                /* renamed from: j */
                public Object f8295j;

                /* renamed from: k */
                public int f8296k;

                /* renamed from: l */
                public int f8297l;

                /* renamed from: m */
                public EzyPaint.Paint f8298m;

                /* renamed from: n */
                public SingleFieldBuilderV3 f8299n;

                /* renamed from: o */
                public Object f8300o;

                /* renamed from: p */
                public List f8301p;

                /* renamed from: q */
                public RepeatedFieldBuilderV3 f8302q;

                /* renamed from: r */
                public Object f8303r;

                private SingleFieldBuilderV3 getOutRectFieldBuilder() {
                    if (this.f8290e == null) {
                        this.f8290e = new SingleFieldBuilderV3(m7926t(), getParentForChildren(), isClean());
                        this.f8289d = null;
                    }
                    return this.f8290e;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getOutRectFieldBuilder();
                        m7925s();
                        getChildGraphFieldBuilder();
                        m7889x();
                        m7930y();
                    }
                }

                /* renamed from: x */
                private SingleFieldBuilderV3 m7889x() {
                    if (this.f8299n == null) {
                        this.f8299n = new SingleFieldBuilderV3(m7928v(), getParentForChildren(), isClean());
                        this.f8298m = null;
                    }
                    return this.f8299n;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C6799b mergeFrom(Message message) {
                    if (message instanceof GraphSnapshot) {
                        return m7891B((GraphSnapshot) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: B */
                public C6799b m7891B(GraphSnapshot graphSnapshot) {
                    if (graphSnapshot == GraphSnapshot.m7854G()) {
                        return this;
                    }
                    if (!graphSnapshot.m7876L().isEmpty()) {
                        this.f8287b = graphSnapshot.f8273b;
                        this.f8286a |= 1;
                        onChanged();
                    }
                    if (graphSnapshot.f8274c != 0) {
                        m7901L(graphSnapshot.m7875K());
                    }
                    if (graphSnapshot.hasOutRect()) {
                        m7893D(graphSnapshot.m7878N());
                    }
                    if (graphSnapshot.m7884T()) {
                        m7892C(graphSnapshot.m7877M());
                    }
                    if (this.f8294i == null) {
                        if (!graphSnapshot.f8277f.isEmpty()) {
                            if (this.f8293h.isEmpty()) {
                                this.f8293h = graphSnapshot.f8277f;
                                this.f8286a &= -17;
                            } else {
                                ensureChildGraphIsMutable();
                                this.f8293h.addAll(graphSnapshot.f8277f);
                            }
                            onChanged();
                        }
                    } else if (!graphSnapshot.f8277f.isEmpty()) {
                        if (this.f8294i.isEmpty()) {
                            this.f8294i.dispose();
                            this.f8294i = null;
                            this.f8293h = graphSnapshot.f8277f;
                            this.f8286a &= -17;
                            this.f8294i = GeneratedMessageV3.alwaysUseFieldBuilders ? getChildGraphFieldBuilder() : null;
                        } else {
                            this.f8294i.addAllMessages(graphSnapshot.f8277f);
                        }
                    }
                    if (!graphSnapshot.m7882R().isEmpty()) {
                        this.f8295j = graphSnapshot.f8278g;
                        this.f8286a |= 32;
                        onChanged();
                    }
                    if (graphSnapshot.m7883S() != 0) {
                        m7908S(graphSnapshot.m7883S());
                    }
                    if (graphSnapshot.getBackgroundColor() != 0) {
                        m7896G(graphSnapshot.getBackgroundColor());
                    }
                    if (graphSnapshot.hasPaint()) {
                        m7894E(graphSnapshot.m7879O());
                    }
                    if (!graphSnapshot.getContent().isEmpty()) {
                        this.f8300o = graphSnapshot.f8282k;
                        this.f8286a |= 512;
                        onChanged();
                    }
                    if (this.f8302q == null) {
                        if (!graphSnapshot.f8283l.isEmpty()) {
                            if (this.f8301p.isEmpty()) {
                                this.f8301p = graphSnapshot.f8283l;
                                this.f8286a &= -1025;
                            } else {
                                m7921n();
                                this.f8301p.addAll(graphSnapshot.f8283l);
                            }
                            onChanged();
                        }
                    } else if (!graphSnapshot.f8283l.isEmpty()) {
                        if (this.f8302q.isEmpty()) {
                            this.f8302q.dispose();
                            this.f8302q = null;
                            this.f8301p = graphSnapshot.f8283l;
                            this.f8286a &= -1025;
                            this.f8302q = GeneratedMessageV3.alwaysUseFieldBuilders ? m7930y() : null;
                        } else {
                            this.f8302q.addAllMessages(graphSnapshot.f8283l);
                        }
                    }
                    if (!graphSnapshot.m7873I().isEmpty()) {
                        this.f8303r = graphSnapshot.f8284m;
                        this.f8286a |= 2048;
                        onChanged();
                    }
                    mergeUnknownFields(graphSnapshot.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: C */
                public C6799b m7892C(EzyMatrix.Matrix matrix) {
                    EzyMatrix.Matrix matrix2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8292g;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(matrix);
                    } else if ((this.f8286a & 8) == 0 || (matrix2 = this.f8291f) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                        this.f8291f = matrix;
                    } else {
                        m7924r().m7748n(matrix);
                    }
                    if (this.f8291f != null) {
                        this.f8286a |= 8;
                        onChanged();
                    }
                    return this;
                }

                /* renamed from: D */
                public C6799b m7893D(EzyRectF.RectF rectF) {
                    EzyRectF.RectF rectF2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8290e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(rectF);
                    } else if ((this.f8286a & 4) == 0 || (rectF2 = this.f8289d) == null || rectF2 == EzyRectF.RectF.m8042m()) {
                        this.f8289d = rectF;
                    } else {
                        m7927u().m8060n(rectF);
                    }
                    if (this.f8289d != null) {
                        this.f8286a |= 4;
                        onChanged();
                    }
                    return this;
                }

                /* renamed from: E */
                public C6799b m7894E(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8299n;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f8286a & 256) == 0 || (paint2 = this.f8298m) == null || paint2 == EzyPaint.Paint.m7967q()) {
                        this.f8298m = paint;
                    } else {
                        m7929w().m7989n(paint);
                    }
                    if (this.f8298m != null) {
                        this.f8286a |= 256;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: F, reason: merged with bridge method [inline-methods] */
                public final C6799b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6799b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: G */
                public C6799b m7896G(int i10) {
                    this.f8297l = i10;
                    this.f8286a |= 128;
                    onChanged();
                    return this;
                }

                /* renamed from: H */
                public C6799b m7897H(String str) {
                    str.getClass();
                    this.f8300o = str;
                    this.f8286a |= 512;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: I, reason: merged with bridge method [inline-methods] */
                public C6799b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6799b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: J */
                public C6799b m7899J(String str) {
                    str.getClass();
                    this.f8303r = str;
                    this.f8286a |= 2048;
                    onChanged();
                    return this;
                }

                /* renamed from: K */
                public C6799b m7900K(EzyGraphEnum.GraphEnum graphEnum) {
                    graphEnum.getClass();
                    this.f8286a |= 2;
                    this.f8288c = graphEnum.getNumber();
                    onChanged();
                    return this;
                }

                /* renamed from: L */
                public C6799b m7901L(int i10) {
                    this.f8288c = i10;
                    this.f8286a |= 2;
                    onChanged();
                    return this;
                }

                /* renamed from: M */
                public C6799b m7902M(String str) {
                    str.getClass();
                    this.f8287b = str;
                    this.f8286a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: N */
                public C6799b m7903N(EzyMatrix.Matrix matrix) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8292g;
                    if (singleFieldBuilderV3 == null) {
                        matrix.getClass();
                        this.f8291f = matrix;
                    } else {
                        singleFieldBuilderV3.setMessage(matrix);
                    }
                    this.f8286a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: O */
                public C6799b m7904O(EzyRectF.RectF rectF) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8290e;
                    if (singleFieldBuilderV3 == null) {
                        rectF.getClass();
                        this.f8289d = rectF;
                    } else {
                        singleFieldBuilderV3.setMessage(rectF);
                    }
                    this.f8286a |= 4;
                    onChanged();
                    return this;
                }

                /* renamed from: P */
                public C6799b m7905P(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8299n;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f8298m = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f8286a |= 256;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: Q, reason: merged with bridge method [inline-methods] */
                public C6799b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6799b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                /* renamed from: R */
                public C6799b m7907R(String str) {
                    str.getClass();
                    this.f8295j = str;
                    this.f8286a |= 32;
                    onChanged();
                    return this;
                }

                /* renamed from: S */
                public C6799b m7908S(int i10) {
                    this.f8296k = i10;
                    this.f8286a |= 64;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: T, reason: merged with bridge method [inline-methods] */
                public final C6799b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6799b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: b */
                public C6799b m7910b(C6799b c6799b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8294i;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c6799b.build());
                        return this;
                    }
                    ensureChildGraphIsMutable();
                    this.f8293h.add(c6799b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: c */
                public C6799b m7911c(EzyPointF.PointF pointF) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8302q;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointF);
                        return this;
                    }
                    pointF.getClass();
                    m7921n();
                    this.f8301p.add(pointF);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public C6799b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6799b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot build() {
                    GraphSnapshot graphSnapshotBuildPartial = buildPartial();
                    if (graphSnapshotBuildPartial.isInitialized()) {
                        return graphSnapshotBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphSnapshotBuildPartial);
                }

                public final void ensureChildGraphIsMutable() {
                    if ((this.f8286a & 16) == 0) {
                        this.f8293h = new ArrayList(this.f8293h);
                        this.f8286a |= 16;
                    }
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot buildPartial() {
                    GraphSnapshot graphSnapshot = new GraphSnapshot(this);
                    m7916h(graphSnapshot);
                    if (this.f8286a != 0) {
                        m7915g(graphSnapshot);
                    }
                    onBuilt();
                    return graphSnapshot;
                }

                /* renamed from: g */
                public final void m7915g(GraphSnapshot graphSnapshot) {
                    int i10;
                    int i11 = this.f8286a;
                    if ((i11 & 1) != 0) {
                        graphSnapshot.f8273b = this.f8287b;
                    }
                    if ((i11 & 2) != 0) {
                        graphSnapshot.f8274c = this.f8288c;
                    }
                    if ((i11 & 4) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8290e;
                        graphSnapshot.f8275d = singleFieldBuilderV3 == null ? this.f8289d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 8) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8292g;
                        graphSnapshot.f8276e = singleFieldBuilderV32 == null ? this.f8291f : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                        i10 |= 2;
                    }
                    if ((i11 & 32) != 0) {
                        graphSnapshot.f8278g = this.f8295j;
                    }
                    if ((i11 & 64) != 0) {
                        graphSnapshot.f8279h = this.f8296k;
                    }
                    if ((i11 & 128) != 0) {
                        graphSnapshot.f8280i = this.f8297l;
                    }
                    if ((i11 & 256) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f8299n;
                        graphSnapshot.f8281j = singleFieldBuilderV33 == null ? this.f8298m : (EzyPaint.Paint) singleFieldBuilderV33.build();
                        i10 |= 4;
                    }
                    if ((i11 & 512) != 0) {
                        graphSnapshot.f8282k = this.f8300o;
                    }
                    if ((i11 & 2048) != 0) {
                        graphSnapshot.f8284m = this.f8303r;
                    }
                    GraphSnapshot.m7871z(graphSnapshot, i10);
                }

                public final RepeatedFieldBuilderV3 getChildGraphFieldBuilder() {
                    if (this.f8294i == null) {
                        this.f8294i = new RepeatedFieldBuilderV3(this.f8293h, (this.f8286a & 16) != 0, getParentForChildren(), isClean());
                        this.f8293h = null;
                    }
                    return this.f8294i;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyPageSnapshot.f8261c;
                }

                /* renamed from: h */
                public final void m7916h(GraphSnapshot graphSnapshot) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8294i;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.f8286a & 16) != 0) {
                            this.f8293h = Collections.unmodifiableList(this.f8293h);
                            this.f8286a &= -17;
                        }
                        graphSnapshot.f8277f = this.f8293h;
                    } else {
                        graphSnapshot.f8277f = repeatedFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8302q;
                    if (repeatedFieldBuilderV32 != null) {
                        graphSnapshot.f8283l = repeatedFieldBuilderV32.build();
                        return;
                    }
                    if ((this.f8286a & 1024) != 0) {
                        this.f8301p = Collections.unmodifiableList(this.f8301p);
                        this.f8286a &= -1025;
                    }
                    graphSnapshot.f8283l = this.f8301p;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6799b clear() {
                    super.clear();
                    this.f8286a = 0;
                    this.f8287b = "";
                    this.f8288c = 0;
                    this.f8289d = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8290e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f8290e = null;
                    }
                    this.f8291f = null;
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8292g;
                    if (singleFieldBuilderV32 != null) {
                        singleFieldBuilderV32.dispose();
                        this.f8292g = null;
                    }
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8294i;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f8293h = Collections.EMPTY_LIST;
                    } else {
                        this.f8293h = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f8286a &= -17;
                    this.f8295j = "";
                    this.f8296k = 0;
                    this.f8297l = 0;
                    this.f8298m = null;
                    SingleFieldBuilderV3 singleFieldBuilderV33 = this.f8299n;
                    if (singleFieldBuilderV33 != null) {
                        singleFieldBuilderV33.dispose();
                        this.f8299n = null;
                    }
                    this.f8300o = "";
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8302q;
                    if (repeatedFieldBuilderV32 == null) {
                        this.f8301p = Collections.EMPTY_LIST;
                    } else {
                        this.f8301p = null;
                        repeatedFieldBuilderV32.clear();
                    }
                    this.f8286a &= -1025;
                    this.f8303r = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyPageSnapshot.f8262d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C6799b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C6799b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6799b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6799b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6799b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C6799b mo24228clone() {
                    return (C6799b) super.mo24228clone();
                }

                /* renamed from: n */
                public final void m7921n() {
                    if ((this.f8286a & 1024) == 0) {
                        this.f8301p = new ArrayList(this.f8301p);
                        this.f8286a |= 1024;
                    }
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot getDefaultInstanceForType() {
                    return GraphSnapshot.m7854G();
                }

                /* renamed from: q */
                public EzyMatrix.Matrix m7923q() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8292g;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                    }
                    EzyMatrix.Matrix matrix = this.f8291f;
                    return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                }

                /* renamed from: r */
                public EzyMatrix.Matrix.C6790b m7924r() {
                    this.f8286a |= 8;
                    onChanged();
                    return (EzyMatrix.Matrix.C6790b) m7925s().getBuilder();
                }

                /* renamed from: s */
                public final SingleFieldBuilderV3 m7925s() {
                    if (this.f8292g == null) {
                        this.f8292g = new SingleFieldBuilderV3(m7923q(), getParentForChildren(), isClean());
                        this.f8291f = null;
                    }
                    return this.f8292g;
                }

                /* renamed from: t */
                public EzyRectF.RectF m7926t() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8290e;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                    }
                    EzyRectF.RectF rectF = this.f8289d;
                    return rectF == null ? EzyRectF.RectF.m8042m() : rectF;
                }

                /* renamed from: u */
                public EzyRectF.RectF.C6811b m7927u() {
                    this.f8286a |= 4;
                    onChanged();
                    return (EzyRectF.RectF.C6811b) getOutRectFieldBuilder().getBuilder();
                }

                /* renamed from: v */
                public EzyPaint.Paint m7928v() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8299n;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f8298m;
                    return paint == null ? EzyPaint.Paint.m7967q() : paint;
                }

                /* renamed from: w */
                public EzyPaint.Paint.C6804b m7929w() {
                    this.f8286a |= 256;
                    onChanged();
                    return (EzyPaint.Paint.C6804b) m7889x().getBuilder();
                }

                /* renamed from: y */
                public final RepeatedFieldBuilderV3 m7930y() {
                    if (this.f8302q == null) {
                        this.f8302q = new RepeatedFieldBuilderV3(this.f8301p, (this.f8286a & 1024) != 0, getParentForChildren(), isClean());
                        this.f8301p = null;
                    }
                    return this.f8302q;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C6799b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        z9 = true;
                                    case 10:
                                        this.f8287b = codedInputStream.readStringRequireUtf8();
                                        this.f8286a |= 1;
                                    case 16:
                                        this.f8288c = codedInputStream.readEnum();
                                        this.f8286a |= 2;
                                    case 26:
                                        codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.f8286a |= 4;
                                    case 34:
                                        codedInputStream.readMessage(m7925s().getBuilder(), extensionRegistryLite);
                                        this.f8286a |= 8;
                                    case 42:
                                        GraphSnapshot graphSnapshot = (GraphSnapshot) codedInputStream.readMessage(GraphSnapshot.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8294i;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureChildGraphIsMutable();
                                            this.f8293h.add(graphSnapshot);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(graphSnapshot);
                                        }
                                    case 50:
                                        this.f8295j = codedInputStream.readStringRequireUtf8();
                                        this.f8286a |= 32;
                                    case 56:
                                        this.f8296k = codedInputStream.readInt32();
                                        this.f8286a |= 64;
                                    case 64:
                                        this.f8297l = codedInputStream.readInt32();
                                        this.f8286a |= 128;
                                    case 74:
                                        codedInputStream.readMessage(m7889x().getBuilder(), extensionRegistryLite);
                                        this.f8286a |= 256;
                                    case 82:
                                        this.f8300o = codedInputStream.readStringRequireUtf8();
                                        this.f8286a |= 512;
                                    case 90:
                                        EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f8302q;
                                        if (repeatedFieldBuilderV32 == null) {
                                            m7921n();
                                            this.f8301p.add(pointF);
                                        } else {
                                            repeatedFieldBuilderV32.addMessage(pointF);
                                        }
                                    case 98:
                                        this.f8303r = codedInputStream.readStringRequireUtf8();
                                        this.f8286a |= 2048;
                                    default:
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                            z9 = true;
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

                public C6799b() {
                    this.f8287b = "";
                    this.f8288c = 0;
                    List list = Collections.EMPTY_LIST;
                    this.f8293h = list;
                    this.f8295j = "";
                    this.f8300o = "";
                    this.f8301p = list;
                    this.f8303r = "";
                    maybeForceBuilderInitialization();
                }

                public C6799b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8287b = "";
                    this.f8288c = 0;
                    List list = Collections.EMPTY_LIST;
                    this.f8293h = list;
                    this.f8295j = "";
                    this.f8300o = "";
                    this.f8301p = list;
                    this.f8303r = "";
                    maybeForceBuilderInitialization();
                }
            }

            public GraphSnapshot(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8273b = "";
                this.f8274c = 0;
                this.f8278g = "";
                this.f8279h = 0;
                this.f8280i = 0;
                this.f8282k = "";
                this.f8284m = "";
                this.f8285n = (byte) -1;
            }

            private GraphSnapshot() {
                this.f8273b = "";
                this.f8274c = 0;
                this.f8278g = "";
                this.f8279h = 0;
                this.f8280i = 0;
                this.f8282k = "";
                this.f8284m = "";
                this.f8285n = (byte) -1;
                this.f8273b = "";
                this.f8274c = 0;
                List list = Collections.EMPTY_LIST;
                this.f8277f = list;
                this.f8278g = "";
                this.f8282k = "";
                this.f8283l = list;
                this.f8284m = "";
            }
        }

        /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$a */
        public class C6800a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PageSnapshot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6801b c6801bM7839t = PageSnapshot.m7839t();
                try {
                    c6801bM7839t.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6801bM7839t.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6801bM7839t.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6801bM7839t.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6801bM7839t.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPageSnapshot.f8259a;
        }

        /* renamed from: k */
        public static /* synthetic */ int m7837k(PageSnapshot pageSnapshot, int i10) {
            int i11 = i10 | pageSnapshot.f8266a;
            pageSnapshot.f8266a = i11;
            return i11;
        }

        /* renamed from: o */
        public static PageSnapshot m7838o() {
            return f8264e;
        }

        /* renamed from: t */
        public static C6801b m7839t() {
            return f8264e.toBuilder();
        }

        /* renamed from: w */
        public static PageSnapshot m7840w(InputStream inputStream) {
            return (PageSnapshot) GeneratedMessageV3.parseWithIOException(f8265f, inputStream);
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
            if (m7844s() != pageSnapshot.m7844s()) {
                return false;
            }
            if ((!m7844s() || m7841m().equals(pageSnapshot.m7841m())) && hasGraphSnapshot() == pageSnapshot.hasGraphSnapshot()) {
                return (!hasGraphSnapshot() || m7843r().equals(pageSnapshot.m7843r())) && getUnknownFields().equals(pageSnapshot.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8265f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = (this.f8266a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m7841m()) : 0;
            if ((this.f8266a & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m7843r());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean hasGraphSnapshot() {
            return (this.f8266a & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m7844s()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m7841m().hashCode();
            }
            if (hasGraphSnapshot()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m7843r().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPageSnapshot.f8260b.ensureFieldAccessorsInitialized(PageSnapshot.class, C6801b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8269d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8269d = (byte) 1;
            return true;
        }

        /* renamed from: m */
        public EzyMatrix.Matrix m7841m() {
            EzyMatrix.Matrix matrix = this.f8267b;
            return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageSnapshot();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public PageSnapshot getDefaultInstanceForType() {
            return f8264e;
        }

        /* renamed from: r */
        public GraphSnapshot m7843r() {
            GraphSnapshot graphSnapshot = this.f8268c;
            return graphSnapshot == null ? GraphSnapshot.m7854G() : graphSnapshot;
        }

        /* renamed from: s */
        public boolean m7844s() {
            return (this.f8266a & 1) != 0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C6801b newBuilderForType() {
            return m7839t();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C6801b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6801b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f8266a & 1) != 0) {
                codedOutputStream.writeMessage(1, m7841m());
            }
            if ((this.f8266a & 2) != 0) {
                codedOutputStream.writeMessage(2, m7843r());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C6801b toBuilder() {
            return this == f8264e ? new C6801b() : new C6801b().m7952u(this);
        }

        /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$b */
        public static final class C6801b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8304a;

            /* renamed from: b */
            public EzyMatrix.Matrix f8305b;

            /* renamed from: c */
            public SingleFieldBuilderV3 f8306c;

            /* renamed from: d */
            public GraphSnapshot f8307d;

            /* renamed from: e */
            public SingleFieldBuilderV3 f8308e;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    m7945m();
                    getGraphSnapshotFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C6801b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6801b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public final C6801b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6801b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6801b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6801b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public PageSnapshot build() {
                PageSnapshot pageSnapshotBuildPartial = buildPartial();
                if (pageSnapshotBuildPartial.isInitialized()) {
                    return pageSnapshotBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageSnapshotBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public PageSnapshot buildPartial() {
                PageSnapshot pageSnapshot = new PageSnapshot(this);
                if (this.f8304a != 0) {
                    m7938e(pageSnapshot);
                }
                onBuilt();
                return pageSnapshot;
            }

            /* renamed from: e */
            public final void m7938e(PageSnapshot pageSnapshot) {
                int i10;
                int i11 = this.f8304a;
                if ((i11 & 1) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8306c;
                    pageSnapshot.f8267b = singleFieldBuilderV3 == null ? this.f8305b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8308e;
                    pageSnapshot.f8268c = singleFieldBuilderV32 == null ? this.f8307d : (GraphSnapshot) singleFieldBuilderV32.build();
                    i10 |= 2;
                }
                PageSnapshot.m7837k(pageSnapshot, i10);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public C6801b clear() {
                super.clear();
                this.f8304a = 0;
                this.f8305b = null;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8306c;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f8306c = null;
                }
                this.f8307d = null;
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8308e;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.f8308e = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6801b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6801b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPageSnapshot.f8259a;
            }

            public final SingleFieldBuilderV3 getGraphSnapshotFieldBuilder() {
                if (this.f8308e == null) {
                    this.f8308e = new SingleFieldBuilderV3(m7947p(), getParentForChildren(), isClean());
                    this.f8307d = null;
                }
                return this.f8308e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6801b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6801b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6801b mo24228clone() {
                return (C6801b) super.mo24228clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageSnapshot.f8260b.ensureFieldAccessorsInitialized(PageSnapshot.class, C6801b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: k */
            public EzyMatrix.Matrix m7943k() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8306c;
                if (singleFieldBuilderV3 != null) {
                    return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                }
                EzyMatrix.Matrix matrix = this.f8305b;
                return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
            }

            /* renamed from: l */
            public EzyMatrix.Matrix.C6790b m7944l() {
                this.f8304a |= 1;
                onChanged();
                return (EzyMatrix.Matrix.C6790b) m7945m().getBuilder();
            }

            /* renamed from: m */
            public final SingleFieldBuilderV3 m7945m() {
                if (this.f8306c == null) {
                    this.f8306c = new SingleFieldBuilderV3(m7943k(), getParentForChildren(), isClean());
                    this.f8305b = null;
                }
                return this.f8306c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public PageSnapshot getDefaultInstanceForType() {
                return PageSnapshot.m7838o();
            }

            /* renamed from: p */
            public GraphSnapshot m7947p() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8308e;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot) singleFieldBuilderV3.getMessage();
                }
                GraphSnapshot graphSnapshot = this.f8307d;
                return graphSnapshot == null ? GraphSnapshot.m7854G() : graphSnapshot;
            }

            /* renamed from: q */
            public GraphSnapshot.C6799b m7948q() {
                this.f8304a |= 2;
                onChanged();
                return (GraphSnapshot.C6799b) getGraphSnapshotFieldBuilder().getBuilder();
            }

            /* renamed from: r */
            public C6801b m7949r(EzyMatrix.Matrix matrix) {
                EzyMatrix.Matrix matrix2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8306c;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(matrix);
                } else if ((this.f8304a & 1) == 0 || (matrix2 = this.f8305b) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                    this.f8305b = matrix;
                } else {
                    m7944l().m7748n(matrix);
                }
                if (this.f8305b != null) {
                    this.f8304a |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C6801b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(m7945m().getBuilder(), extensionRegistryLite);
                                    this.f8304a |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getGraphSnapshotFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.f8304a |= 2;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z9 = true;
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
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6801b mergeFrom(Message message) {
                if (message instanceof PageSnapshot) {
                    return m7952u((PageSnapshot) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: u */
            public C6801b m7952u(PageSnapshot pageSnapshot) {
                if (pageSnapshot == PageSnapshot.m7838o()) {
                    return this;
                }
                if (pageSnapshot.m7844s()) {
                    m7949r(pageSnapshot.m7841m());
                }
                if (pageSnapshot.hasGraphSnapshot()) {
                    m7953v(pageSnapshot.m7843r());
                }
                mergeUnknownFields(pageSnapshot.getUnknownFields());
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C6801b m7953v(GraphSnapshot graphSnapshot) {
                GraphSnapshot graphSnapshot2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8308e;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(graphSnapshot);
                } else if ((this.f8304a & 2) == 0 || (graphSnapshot2 = this.f8307d) == null || graphSnapshot2 == GraphSnapshot.m7854G()) {
                    this.f8307d = graphSnapshot;
                } else {
                    m7948q().m7891B(graphSnapshot);
                }
                if (this.f8307d != null) {
                    this.f8304a |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C6801b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6801b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: x */
            public C6801b m7955x(EzyMatrix.Matrix matrix) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8306c;
                if (singleFieldBuilderV3 == null) {
                    matrix.getClass();
                    this.f8305b = matrix;
                } else {
                    singleFieldBuilderV3.setMessage(matrix);
                }
                this.f8304a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C6801b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6801b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: z */
            public C6801b m7957z(GraphSnapshot graphSnapshot) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8308e;
                if (singleFieldBuilderV3 == null) {
                    graphSnapshot.getClass();
                    this.f8307d = graphSnapshot;
                } else {
                    singleFieldBuilderV3.setMessage(graphSnapshot);
                }
                this.f8304a |= 2;
                onChanged();
                return this;
            }

            public C6801b() {
                maybeForceBuilderInitialization();
            }

            public C6801b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }
        }

        public PageSnapshot(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8269d = (byte) -1;
        }

        private PageSnapshot() {
            this.f8269d = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m7833e().getMessageTypes().get(0);
        f8259a = descriptor;
        f8260b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CameraMatrix", "GraphSnapshot"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f8261c = descriptor2;
        f8262d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "GraphEnum", "OutRect", "Matrix", "ChildGraph", "SourceFileName", "SourceId", "BackgroundColor", "Paint", "Content", "PointList", "FilePath"});
        EzyRectF.m8037c();
        EzyPaint.m7960c();
        EzyPointF.m8002c();
        EzyMatrix.m7709c();
        EzyGraphEnum.m7488a();
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m7833e() {
        return f8263e;
    }
}
