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
import com.p071uc.crashsdk.export.ExitType;
import com.taobao.sophix.PatchStatus;
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
    public static final Descriptors.Descriptor f9547a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9548b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9549c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9550d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f9551e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013GraphSnapshot.proto\u001a\u0011utils/RectF.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0012utils/Matrix.proto\u001a\u0015enums/GraphEnum.proto\"\u009a\u0003\n\fPageSnapshot\u0012\u001d\n\fcameraMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u00122\n\rgraphSnapshot\u0018\u0002 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u001a¶\u0002\n\rGraphSnapshot\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0017\n\u0006matrix\u0018\u0004 \u0001(\u000b2\u0007.Matrix\u0012/\n\nchildGraph\u0018\u0005 \u0003(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0016\n\u000esourceFileName\u0018\u0006 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0007 \u0001(\u0005\u0012\u0017\n\u000fbackgroundColor\u0018\b \u0001(\u0005\u0012\u0015\n\u0005paint\u0018\t \u0001(\u000b2\u0006.Paint\u0012\u000f\n\u0007content\u0018\n \u0001(\t\u0012\u001a\n\tpointList\u0018\u000b \u0003(\u000b2\u0007.PointF\u0012\u0010\n\bfilePath\u0018\f \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyPageSnapshotb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyRectF.m9169c(), EzyPaint.m9092c(), EzyPointF.m9134c(), EzyMatrix.m8838c(), EzyGraphEnum.m8608a()});

    public static final class PageSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final PageSnapshot f9552e = new PageSnapshot();

        /* renamed from: f */
        public static final Parser f9553f = new C7119a();

        /* renamed from: a */
        public int f9554a;

        /* renamed from: b */
        public EzyMatrix.Matrix f9555b;

        /* renamed from: c */
        public GraphSnapshot f9556c;

        /* renamed from: d */
        public byte f9557d;

        public static final class GraphSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: o */
            public static final GraphSnapshot f9558o = new GraphSnapshot();

            /* renamed from: p */
            public static final Parser f9559p = new C7117a();

            /* renamed from: a */
            public int f9560a;

            /* renamed from: b */
            public volatile Object f9561b;

            /* renamed from: c */
            public int f9562c;

            /* renamed from: d */
            public EzyRectF.RectF f9563d;

            /* renamed from: e */
            public EzyMatrix.Matrix f9564e;

            /* renamed from: f */
            public List f9565f;

            /* renamed from: g */
            public volatile Object f9566g;

            /* renamed from: h */
            public int f9567h;

            /* renamed from: i */
            public int f9568i;

            /* renamed from: j */
            public EzyPaint.Paint f9569j;

            /* renamed from: k */
            public volatile Object f9570k;

            /* renamed from: l */
            public List f9571l;

            /* renamed from: m */
            public volatile Object f9572m;

            /* renamed from: n */
            public byte f9573n;

            /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$GraphSnapshot$a */
            public class C7117a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7118b c7118bM8989Y = GraphSnapshot.m8989Y();
                    try {
                        c7118bM8989Y.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7118bM8989Y.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7118bM8989Y.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7118bM8989Y.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7118bM8989Y.buildPartial());
                    }
                }
            }

            /* renamed from: C */
            public static /* synthetic */ int m8981C(GraphSnapshot graphSnapshot, int i9) {
                int i10 = i9 | graphSnapshot.f9560a;
                graphSnapshot.f9560a = i10;
                return i10;
            }

            /* renamed from: J */
            public static GraphSnapshot m8988J() {
                return f9558o;
            }

            /* renamed from: Y */
            public static C7118b m8989Y() {
                return f9558o.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyPageSnapshot.f9549c;
            }

            public static Parser parser() {
                return f9559p;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: K, reason: merged with bridge method [inline-methods] */
            public GraphSnapshot getDefaultInstanceForType() {
                return f9558o;
            }

            /* renamed from: L */
            public String m9004L() {
                Object obj = this.f9572m;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9572m = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: M */
            public EzyGraphEnum.GraphEnum m9005M() {
                EzyGraphEnum.GraphEnum graphEnumM8610c = EzyGraphEnum.GraphEnum.m8610c(this.f9562c);
                return graphEnumM8610c == null ? EzyGraphEnum.GraphEnum.UNRECOGNIZED : graphEnumM8610c;
            }

            /* renamed from: N */
            public int m9006N() {
                return this.f9562c;
            }

            /* renamed from: O */
            public String m9007O() {
                Object obj = this.f9561b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9561b = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: P */
            public EzyMatrix.Matrix m9008P() {
                EzyMatrix.Matrix matrix = this.f9564e;
                return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
            }

            /* renamed from: Q */
            public EzyRectF.RectF m9009Q() {
                EzyRectF.RectF rectF = this.f9563d;
                return rectF == null ? EzyRectF.RectF.m9174n() : rectF;
            }

            /* renamed from: R */
            public EzyPaint.Paint m9010R() {
                EzyPaint.Paint paint = this.f9569j;
                return paint == null ? EzyPaint.Paint.m9099t() : paint;
            }

            /* renamed from: S */
            public int m9011S() {
                return this.f9571l.size();
            }

            /* renamed from: T */
            public List m9012T() {
                return this.f9571l;
            }

            /* renamed from: U */
            public String m9013U() {
                Object obj = this.f9566g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9566g = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: V */
            public int m9014V() {
                return this.f9567h;
            }

            /* renamed from: W */
            public boolean m9015W() {
                return (this.f9560a & 2) != 0;
            }

            /* renamed from: X */
            public boolean m9016X() {
                return (this.f9560a & 4) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public C7118b newBuilderForType() {
                return m8989Y();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: a0, reason: merged with bridge method [inline-methods] */
            public C7118b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7118b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: b0, reason: merged with bridge method [inline-methods] */
            public C7118b toBuilder() {
                return this == f9558o ? new C7118b() : new C7118b().m9023B(this);
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
                if (!m9007O().equals(graphSnapshot.m9007O()) || this.f9562c != graphSnapshot.f9562c || hasOutRect() != graphSnapshot.hasOutRect()) {
                    return false;
                }
                if ((hasOutRect() && !m9009Q().equals(graphSnapshot.m9009Q())) || m9015W() != graphSnapshot.m9015W()) {
                    return false;
                }
                if ((!m9015W() || m9008P().equals(graphSnapshot.m9008P())) && getChildGraphList().equals(graphSnapshot.getChildGraphList()) && m9013U().equals(graphSnapshot.m9013U()) && m9014V() == graphSnapshot.m9014V() && getBackgroundColor() == graphSnapshot.getBackgroundColor() && m9016X() == graphSnapshot.m9016X()) {
                    return (!m9016X() || m9010R().equals(graphSnapshot.m9010R())) && getContent().equals(graphSnapshot.getContent()) && m9012T().equals(graphSnapshot.m9012T()) && m9004L().equals(graphSnapshot.m9004L()) && getUnknownFields().equals(graphSnapshot.getUnknownFields());
                }
                return false;
            }

            public int getBackgroundColor() {
                return this.f9568i;
            }

            public int getChildGraphCount() {
                return this.f9565f.size();
            }

            public List getChildGraphList() {
                return this.f9565f;
            }

            public String getContent() {
                Object obj = this.f9570k;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9570k = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9559p;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9561b) ? GeneratedMessageV3.computeStringSize(1, this.f9561b) : 0;
                if (this.f9562c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.f9562c);
                }
                if ((1 & this.f9560a) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(3, m9009Q());
                }
                if ((this.f9560a & 2) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(4, m9008P());
                }
                for (int i10 = 0; i10 < this.f9565f.size(); i10++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f9565f.get(i10));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9566g)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f9566g);
                }
                int i11 = this.f9567h;
                if (i11 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(7, i11);
                }
                int i12 = this.f9568i;
                if (i12 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(8, i12);
                }
                if ((this.f9560a & 4) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(9, m9010R());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9570k)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.f9570k);
                }
                for (int i13 = 0; i13 < this.f9571l.size(); i13++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(11, (MessageLite) this.f9571l.get(i13));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9572m)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f9572m);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasOutRect() {
                return (this.f9560a & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m9007O().hashCode()) * 37) + 2) * 53) + this.f9562c;
                if (hasOutRect()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + m9009Q().hashCode();
                }
                if (m9015W()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + m9008P().hashCode();
                }
                if (getChildGraphCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getChildGraphList().hashCode();
                }
                int iHashCode2 = (((((((((((iHashCode * 37) + 6) * 53) + m9013U().hashCode()) * 37) + 7) * 53) + m9014V()) * 37) + 8) * 53) + getBackgroundColor();
                if (m9016X()) {
                    iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m9010R().hashCode();
                }
                int iHashCode3 = (((iHashCode2 * 37) + 10) * 53) + getContent().hashCode();
                if (m9011S() > 0) {
                    iHashCode3 = (((iHashCode3 * 37) + 11) * 53) + m9012T().hashCode();
                }
                int iHashCode4 = (((((iHashCode3 * 37) + 12) * 53) + m9004L().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode4;
                return iHashCode4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageSnapshot.f9550d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C7118b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9573n;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9573n = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new GraphSnapshot();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f9561b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9561b);
                }
                if (this.f9562c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    codedOutputStream.writeEnum(2, this.f9562c);
                }
                if ((this.f9560a & 1) != 0) {
                    codedOutputStream.writeMessage(3, m9009Q());
                }
                if ((this.f9560a & 2) != 0) {
                    codedOutputStream.writeMessage(4, m9008P());
                }
                for (int i9 = 0; i9 < this.f9565f.size(); i9++) {
                    codedOutputStream.writeMessage(5, (MessageLite) this.f9565f.get(i9));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9566g)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.f9566g);
                }
                int i10 = this.f9567h;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(7, i10);
                }
                int i11 = this.f9568i;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(8, i11);
                }
                if ((4 & this.f9560a) != 0) {
                    codedOutputStream.writeMessage(9, m9010R());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9570k)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 10, this.f9570k);
                }
                for (int i12 = 0; i12 < this.f9571l.size(); i12++) {
                    codedOutputStream.writeMessage(11, (MessageLite) this.f9571l.get(i12));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9572m)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 12, this.f9572m);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$GraphSnapshot$b */
            public static final class C7118b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9574a;

                /* renamed from: b */
                public Object f9575b;

                /* renamed from: c */
                public int f9576c;

                /* renamed from: d */
                public EzyRectF.RectF f9577d;

                /* renamed from: e */
                public SingleFieldBuilderV3 f9578e;

                /* renamed from: f */
                public EzyMatrix.Matrix f9579f;

                /* renamed from: g */
                public SingleFieldBuilderV3 f9580g;

                /* renamed from: h */
                public List f9581h;

                /* renamed from: i */
                public RepeatedFieldBuilderV3 f9582i;

                /* renamed from: j */
                public Object f9583j;

                /* renamed from: k */
                public int f9584k;

                /* renamed from: l */
                public int f9585l;

                /* renamed from: m */
                public EzyPaint.Paint f9586m;

                /* renamed from: n */
                public SingleFieldBuilderV3 f9587n;

                /* renamed from: o */
                public Object f9588o;

                /* renamed from: p */
                public List f9589p;

                /* renamed from: q */
                public RepeatedFieldBuilderV3 f9590q;

                /* renamed from: r */
                public Object f9591r;

                private SingleFieldBuilderV3 getOutRectFieldBuilder() {
                    if (this.f9578e == null) {
                        this.f9578e = new SingleFieldBuilderV3(m9058t(), getParentForChildren(), isClean());
                        this.f9577d = null;
                    }
                    return this.f9578e;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getOutRectFieldBuilder();
                        m9057s();
                        getChildGraphFieldBuilder();
                        m9021x();
                        m9062y();
                    }
                }

                /* renamed from: x */
                private SingleFieldBuilderV3 m9021x() {
                    if (this.f9587n == null) {
                        this.f9587n = new SingleFieldBuilderV3(m9060v(), getParentForChildren(), isClean());
                        this.f9586m = null;
                    }
                    return this.f9587n;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C7118b mergeFrom(Message message) {
                    if (message instanceof GraphSnapshot) {
                        return m9023B((GraphSnapshot) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: B */
                public C7118b m9023B(GraphSnapshot graphSnapshot) {
                    if (graphSnapshot == GraphSnapshot.m8988J()) {
                        return this;
                    }
                    if (!graphSnapshot.m9007O().isEmpty()) {
                        this.f9575b = graphSnapshot.f9561b;
                        this.f9574a |= 1;
                        onChanged();
                    }
                    if (graphSnapshot.f9562c != 0) {
                        m9033L(graphSnapshot.m9006N());
                    }
                    if (graphSnapshot.hasOutRect()) {
                        m9025D(graphSnapshot.m9009Q());
                    }
                    if (graphSnapshot.m9015W()) {
                        m9024C(graphSnapshot.m9008P());
                    }
                    if (this.f9582i == null) {
                        if (!graphSnapshot.f9565f.isEmpty()) {
                            if (this.f9581h.isEmpty()) {
                                this.f9581h = graphSnapshot.f9565f;
                                this.f9574a &= -17;
                            } else {
                                ensureChildGraphIsMutable();
                                this.f9581h.addAll(graphSnapshot.f9565f);
                            }
                            onChanged();
                        }
                    } else if (!graphSnapshot.f9565f.isEmpty()) {
                        if (this.f9582i.isEmpty()) {
                            this.f9582i.dispose();
                            this.f9582i = null;
                            this.f9581h = graphSnapshot.f9565f;
                            this.f9574a &= -17;
                            this.f9582i = GeneratedMessageV3.alwaysUseFieldBuilders ? getChildGraphFieldBuilder() : null;
                        } else {
                            this.f9582i.addAllMessages(graphSnapshot.f9565f);
                        }
                    }
                    if (!graphSnapshot.m9013U().isEmpty()) {
                        this.f9583j = graphSnapshot.f9566g;
                        this.f9574a |= 32;
                        onChanged();
                    }
                    if (graphSnapshot.m9014V() != 0) {
                        m9040S(graphSnapshot.m9014V());
                    }
                    if (graphSnapshot.getBackgroundColor() != 0) {
                        m9028G(graphSnapshot.getBackgroundColor());
                    }
                    if (graphSnapshot.m9016X()) {
                        m9026E(graphSnapshot.m9010R());
                    }
                    if (!graphSnapshot.getContent().isEmpty()) {
                        this.f9588o = graphSnapshot.f9570k;
                        this.f9574a |= 512;
                        onChanged();
                    }
                    if (this.f9590q == null) {
                        if (!graphSnapshot.f9571l.isEmpty()) {
                            if (this.f9589p.isEmpty()) {
                                this.f9589p = graphSnapshot.f9571l;
                                this.f9574a &= -1025;
                            } else {
                                m9053o();
                                this.f9589p.addAll(graphSnapshot.f9571l);
                            }
                            onChanged();
                        }
                    } else if (!graphSnapshot.f9571l.isEmpty()) {
                        if (this.f9590q.isEmpty()) {
                            this.f9590q.dispose();
                            this.f9590q = null;
                            this.f9589p = graphSnapshot.f9571l;
                            this.f9574a &= -1025;
                            this.f9590q = GeneratedMessageV3.alwaysUseFieldBuilders ? m9062y() : null;
                        } else {
                            this.f9590q.addAllMessages(graphSnapshot.f9571l);
                        }
                    }
                    if (!graphSnapshot.m9004L().isEmpty()) {
                        this.f9591r = graphSnapshot.f9572m;
                        this.f9574a |= 2048;
                        onChanged();
                    }
                    mergeUnknownFields(graphSnapshot.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: C */
                public C7118b m9024C(EzyMatrix.Matrix matrix) {
                    EzyMatrix.Matrix matrix2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9580g;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(matrix);
                    } else if ((this.f9574a & 8) == 0 || (matrix2 = this.f9579f) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                        this.f9579f = matrix;
                    } else {
                        m9056r().m8877o(matrix);
                    }
                    if (this.f9579f != null) {
                        this.f9574a |= 8;
                        onChanged();
                    }
                    return this;
                }

                /* renamed from: D */
                public C7118b m9025D(EzyRectF.RectF rectF) {
                    EzyRectF.RectF rectF2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9578e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(rectF);
                    } else if ((this.f9574a & 4) == 0 || (rectF2 = this.f9577d) == null || rectF2 == EzyRectF.RectF.m9174n()) {
                        this.f9577d = rectF;
                    } else {
                        m9059u().m9192o(rectF);
                    }
                    if (this.f9577d != null) {
                        this.f9574a |= 4;
                        onChanged();
                    }
                    return this;
                }

                /* renamed from: E */
                public C7118b m9026E(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9587n;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f9574a & 256) == 0 || (paint2 = this.f9586m) == null || paint2 == EzyPaint.Paint.m9099t()) {
                        this.f9586m = paint;
                    } else {
                        m9061w().m9121o(paint);
                    }
                    if (this.f9586m != null) {
                        this.f9574a |= 256;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: F, reason: merged with bridge method [inline-methods] */
                public final C7118b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7118b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: G */
                public C7118b m9028G(int i9) {
                    this.f9585l = i9;
                    this.f9574a |= 128;
                    onChanged();
                    return this;
                }

                /* renamed from: H */
                public C7118b m9029H(String str) {
                    str.getClass();
                    this.f9588o = str;
                    this.f9574a |= 512;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: I, reason: merged with bridge method [inline-methods] */
                public C7118b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7118b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: J */
                public C7118b m9031J(String str) {
                    str.getClass();
                    this.f9591r = str;
                    this.f9574a |= 2048;
                    onChanged();
                    return this;
                }

                /* renamed from: K */
                public C7118b m9032K(EzyGraphEnum.GraphEnum graphEnum) {
                    graphEnum.getClass();
                    this.f9574a |= 2;
                    this.f9576c = graphEnum.getNumber();
                    onChanged();
                    return this;
                }

                /* renamed from: L */
                public C7118b m9033L(int i9) {
                    this.f9576c = i9;
                    this.f9574a |= 2;
                    onChanged();
                    return this;
                }

                /* renamed from: M */
                public C7118b m9034M(String str) {
                    str.getClass();
                    this.f9575b = str;
                    this.f9574a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: N */
                public C7118b m9035N(EzyMatrix.Matrix matrix) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9580g;
                    if (singleFieldBuilderV3 == null) {
                        matrix.getClass();
                        this.f9579f = matrix;
                    } else {
                        singleFieldBuilderV3.setMessage(matrix);
                    }
                    this.f9574a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: O */
                public C7118b m9036O(EzyRectF.RectF rectF) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9578e;
                    if (singleFieldBuilderV3 == null) {
                        rectF.getClass();
                        this.f9577d = rectF;
                    } else {
                        singleFieldBuilderV3.setMessage(rectF);
                    }
                    this.f9574a |= 4;
                    onChanged();
                    return this;
                }

                /* renamed from: P */
                public C7118b m9037P(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9587n;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f9586m = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f9574a |= 256;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: Q, reason: merged with bridge method [inline-methods] */
                public C7118b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7118b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                /* renamed from: R */
                public C7118b m9039R(String str) {
                    str.getClass();
                    this.f9583j = str;
                    this.f9574a |= 32;
                    onChanged();
                    return this;
                }

                /* renamed from: S */
                public C7118b m9040S(int i9) {
                    this.f9584k = i9;
                    this.f9574a |= 64;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: T, reason: merged with bridge method [inline-methods] */
                public final C7118b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7118b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: b */
                public C7118b m9042b(C7118b c7118b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9582i;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c7118b.build());
                        return this;
                    }
                    ensureChildGraphIsMutable();
                    this.f9581h.add(c7118b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: d */
                public C7118b m9043d(EzyPointF.PointF pointF) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9590q;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointF);
                        return this;
                    }
                    pointF.getClass();
                    m9053o();
                    this.f9589p.add(pointF);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public C7118b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7118b) super.addRepeatedField(fieldDescriptor, obj);
                }

                public final void ensureChildGraphIsMutable() {
                    if ((this.f9574a & 16) == 0) {
                        this.f9581h = new ArrayList(this.f9581h);
                        this.f9574a |= 16;
                    }
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot build() {
                    GraphSnapshot graphSnapshotBuildPartial = buildPartial();
                    if (graphSnapshotBuildPartial.isInitialized()) {
                        return graphSnapshotBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphSnapshotBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot buildPartial() {
                    GraphSnapshot graphSnapshot = new GraphSnapshot(this);
                    m9048i(graphSnapshot);
                    if (this.f9574a != 0) {
                        m9047h(graphSnapshot);
                    }
                    onBuilt();
                    return graphSnapshot;
                }

                public final RepeatedFieldBuilderV3 getChildGraphFieldBuilder() {
                    if (this.f9582i == null) {
                        this.f9582i = new RepeatedFieldBuilderV3(this.f9581h, (this.f9574a & 16) != 0, getParentForChildren(), isClean());
                        this.f9581h = null;
                    }
                    return this.f9582i;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyPageSnapshot.f9549c;
                }

                /* renamed from: h */
                public final void m9047h(GraphSnapshot graphSnapshot) {
                    int i9;
                    int i10 = this.f9574a;
                    if ((i10 & 1) != 0) {
                        graphSnapshot.f9561b = this.f9575b;
                    }
                    if ((i10 & 2) != 0) {
                        graphSnapshot.f9562c = this.f9576c;
                    }
                    if ((i10 & 4) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9578e;
                        graphSnapshot.f9563d = singleFieldBuilderV3 == null ? this.f9577d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    if ((i10 & 8) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9580g;
                        graphSnapshot.f9564e = singleFieldBuilderV32 == null ? this.f9579f : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                        i9 |= 2;
                    }
                    if ((i10 & 32) != 0) {
                        graphSnapshot.f9566g = this.f9583j;
                    }
                    if ((i10 & 64) != 0) {
                        graphSnapshot.f9567h = this.f9584k;
                    }
                    if ((i10 & 128) != 0) {
                        graphSnapshot.f9568i = this.f9585l;
                    }
                    if ((i10 & 256) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9587n;
                        graphSnapshot.f9569j = singleFieldBuilderV33 == null ? this.f9586m : (EzyPaint.Paint) singleFieldBuilderV33.build();
                        i9 |= 4;
                    }
                    if ((i10 & 512) != 0) {
                        graphSnapshot.f9570k = this.f9588o;
                    }
                    if ((i10 & 2048) != 0) {
                        graphSnapshot.f9572m = this.f9591r;
                    }
                    GraphSnapshot.m8981C(graphSnapshot, i9);
                }

                /* renamed from: i */
                public final void m9048i(GraphSnapshot graphSnapshot) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9582i;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.f9574a & 16) != 0) {
                            this.f9581h = Collections.unmodifiableList(this.f9581h);
                            this.f9574a &= -17;
                        }
                        graphSnapshot.f9565f = this.f9581h;
                    } else {
                        graphSnapshot.f9565f = repeatedFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9590q;
                    if (repeatedFieldBuilderV32 != null) {
                        graphSnapshot.f9571l = repeatedFieldBuilderV32.build();
                        return;
                    }
                    if ((this.f9574a & 1024) != 0) {
                        this.f9589p = Collections.unmodifiableList(this.f9589p);
                        this.f9574a &= -1025;
                    }
                    graphSnapshot.f9571l = this.f9589p;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyPageSnapshot.f9550d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C7118b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7118b clear() {
                    super.clear();
                    this.f9574a = 0;
                    this.f9575b = "";
                    this.f9576c = 0;
                    this.f9577d = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9578e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f9578e = null;
                    }
                    this.f9579f = null;
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9580g;
                    if (singleFieldBuilderV32 != null) {
                        singleFieldBuilderV32.dispose();
                        this.f9580g = null;
                    }
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9582i;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f9581h = Collections.EMPTY_LIST;
                    } else {
                        this.f9581h = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f9574a &= -17;
                    this.f9583j = "";
                    this.f9584k = 0;
                    this.f9585l = 0;
                    this.f9586m = null;
                    SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9587n;
                    if (singleFieldBuilderV33 != null) {
                        singleFieldBuilderV33.dispose();
                        this.f9587n = null;
                    }
                    this.f9588o = "";
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9590q;
                    if (repeatedFieldBuilderV32 == null) {
                        this.f9589p = Collections.EMPTY_LIST;
                    } else {
                        this.f9589p = null;
                        repeatedFieldBuilderV32.clear();
                    }
                    this.f9574a &= -1025;
                    this.f9591r = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7118b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7118b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7118b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7118b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7118b mo24685clone() {
                    return (C7118b) super.mo24685clone();
                }

                /* renamed from: o */
                public final void m9053o() {
                    if ((this.f9574a & 1024) == 0) {
                        this.f9589p = new ArrayList(this.f9589p);
                        this.f9574a |= 1024;
                    }
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot getDefaultInstanceForType() {
                    return GraphSnapshot.m8988J();
                }

                /* renamed from: q */
                public EzyMatrix.Matrix m9055q() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9580g;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                    }
                    EzyMatrix.Matrix matrix = this.f9579f;
                    return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                }

                /* renamed from: r */
                public EzyMatrix.Matrix.C7109b m9056r() {
                    this.f9574a |= 8;
                    onChanged();
                    return (EzyMatrix.Matrix.C7109b) m9057s().getBuilder();
                }

                /* renamed from: s */
                public final SingleFieldBuilderV3 m9057s() {
                    if (this.f9580g == null) {
                        this.f9580g = new SingleFieldBuilderV3(m9055q(), getParentForChildren(), isClean());
                        this.f9579f = null;
                    }
                    return this.f9580g;
                }

                /* renamed from: t */
                public EzyRectF.RectF m9058t() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9578e;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                    }
                    EzyRectF.RectF rectF = this.f9577d;
                    return rectF == null ? EzyRectF.RectF.m9174n() : rectF;
                }

                /* renamed from: u */
                public EzyRectF.RectF.C7130b m9059u() {
                    this.f9574a |= 4;
                    onChanged();
                    return (EzyRectF.RectF.C7130b) getOutRectFieldBuilder().getBuilder();
                }

                /* renamed from: v */
                public EzyPaint.Paint m9060v() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9587n;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f9586m;
                    return paint == null ? EzyPaint.Paint.m9099t() : paint;
                }

                /* renamed from: w */
                public EzyPaint.Paint.C7123b m9061w() {
                    this.f9574a |= 256;
                    onChanged();
                    return (EzyPaint.Paint.C7123b) m9021x().getBuilder();
                }

                /* renamed from: y */
                public final RepeatedFieldBuilderV3 m9062y() {
                    if (this.f9590q == null) {
                        this.f9590q = new RepeatedFieldBuilderV3(this.f9589p, (this.f9574a & 1024) != 0, getParentForChildren(), isClean());
                        this.f9589p = null;
                    }
                    return this.f9590q;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C7118b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                        this.f9575b = codedInputStream.readStringRequireUtf8();
                                        this.f9574a |= 1;
                                    case 16:
                                        this.f9576c = codedInputStream.readEnum();
                                        this.f9574a |= 2;
                                    case 26:
                                        codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.f9574a |= 4;
                                    case 34:
                                        codedInputStream.readMessage(m9057s().getBuilder(), extensionRegistryLite);
                                        this.f9574a |= 8;
                                    case 42:
                                        GraphSnapshot graphSnapshot = (GraphSnapshot) codedInputStream.readMessage(GraphSnapshot.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9582i;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureChildGraphIsMutable();
                                            this.f9581h.add(graphSnapshot);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(graphSnapshot);
                                        }
                                    case 50:
                                        this.f9583j = codedInputStream.readStringRequireUtf8();
                                        this.f9574a |= 32;
                                    case 56:
                                        this.f9584k = codedInputStream.readInt32();
                                        this.f9574a |= 64;
                                    case 64:
                                        this.f9585l = codedInputStream.readInt32();
                                        this.f9574a |= 128;
                                    case PatchStatus.CODE_LOAD_COPY_FILE /* 74 */:
                                        codedInputStream.readMessage(m9021x().getBuilder(), extensionRegistryLite);
                                        this.f9574a |= 256;
                                    case PatchStatus.CODE_LOAD_FIND_CLASS /* 82 */:
                                        this.f9588o = codedInputStream.readStringRequireUtf8();
                                        this.f9574a |= 512;
                                    case 90:
                                        EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9590q;
                                        if (repeatedFieldBuilderV32 == null) {
                                            m9053o();
                                            this.f9589p.add(pointF);
                                        } else {
                                            repeatedFieldBuilderV32.addMessage(pointF);
                                        }
                                    case ExitType.UNEXP_BACKGROUND_CRASH /* 98 */:
                                        this.f9591r = codedInputStream.readStringRequireUtf8();
                                        this.f9574a |= 2048;
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

                public C7118b() {
                    this.f9575b = "";
                    this.f9576c = 0;
                    List list = Collections.EMPTY_LIST;
                    this.f9581h = list;
                    this.f9583j = "";
                    this.f9588o = "";
                    this.f9589p = list;
                    this.f9591r = "";
                    maybeForceBuilderInitialization();
                }

                public C7118b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9575b = "";
                    this.f9576c = 0;
                    List list = Collections.EMPTY_LIST;
                    this.f9581h = list;
                    this.f9583j = "";
                    this.f9588o = "";
                    this.f9589p = list;
                    this.f9591r = "";
                    maybeForceBuilderInitialization();
                }
            }

            public GraphSnapshot(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9561b = "";
                this.f9562c = 0;
                this.f9566g = "";
                this.f9567h = 0;
                this.f9568i = 0;
                this.f9570k = "";
                this.f9572m = "";
                this.f9573n = (byte) -1;
            }

            private GraphSnapshot() {
                this.f9561b = "";
                this.f9562c = 0;
                this.f9566g = "";
                this.f9567h = 0;
                this.f9568i = 0;
                this.f9570k = "";
                this.f9572m = "";
                this.f9573n = (byte) -1;
                this.f9561b = "";
                this.f9562c = 0;
                List list = Collections.EMPTY_LIST;
                this.f9565f = list;
                this.f9566g = "";
                this.f9570k = "";
                this.f9571l = list;
                this.f9572m = "";
            }
        }

        /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$a */
        public class C7119a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PageSnapshot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7120b c7120bM8970w = PageSnapshot.m8970w();
                try {
                    c7120bM8970w.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7120bM8970w.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7120bM8970w.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7120bM8970w.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7120bM8970w.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPageSnapshot.f9547a;
        }

        /* renamed from: k */
        public static /* synthetic */ int m8968k(PageSnapshot pageSnapshot, int i9) {
            int i10 = i9 | pageSnapshot.f9554a;
            pageSnapshot.f9554a = i10;
            return i10;
        }

        /* renamed from: q */
        public static PageSnapshot m8969q() {
            return f9552e;
        }

        /* renamed from: w */
        public static C7120b m8970w() {
            return f9552e.toBuilder();
        }

        /* renamed from: z */
        public static PageSnapshot m8971z(InputStream inputStream) {
            return (PageSnapshot) GeneratedMessageV3.parseWithIOException(f9553f, inputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public C7120b toBuilder() {
            return this == f9552e ? new C7120b() : new C7120b().m9084u(this);
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
            if (m8976v() != pageSnapshot.m8976v()) {
                return false;
            }
            if ((!m8976v() || m8973n().equals(pageSnapshot.m8973n())) && hasGraphSnapshot() == pageSnapshot.hasGraphSnapshot()) {
                return (!hasGraphSnapshot() || m8975u().equals(pageSnapshot.m8975u())) && getUnknownFields().equals(pageSnapshot.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9553f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = (this.f9554a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m8973n()) : 0;
            if ((this.f9554a & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m8975u());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean hasGraphSnapshot() {
            return (this.f9554a & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8976v()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8973n().hashCode();
            }
            if (hasGraphSnapshot()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m8975u().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPageSnapshot.f9548b.ensureFieldAccessorsInitialized(PageSnapshot.class, C7120b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9557d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9557d = (byte) 1;
            return true;
        }

        /* renamed from: n */
        public EzyMatrix.Matrix m8973n() {
            EzyMatrix.Matrix matrix = this.f9555b;
            return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageSnapshot();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public PageSnapshot getDefaultInstanceForType() {
            return f9552e;
        }

        /* renamed from: u */
        public GraphSnapshot m8975u() {
            GraphSnapshot graphSnapshot = this.f9556c;
            return graphSnapshot == null ? GraphSnapshot.m8988J() : graphSnapshot;
        }

        /* renamed from: v */
        public boolean m8976v() {
            return (this.f9554a & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f9554a & 1) != 0) {
                codedOutputStream.writeMessage(1, m8973n());
            }
            if ((this.f9554a & 2) != 0) {
                codedOutputStream.writeMessage(2, m8975u());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C7120b newBuilderForType() {
            return m8970w();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C7120b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7120b(builderParent);
        }

        /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$b */
        public static final class C7120b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9592a;

            /* renamed from: b */
            public EzyMatrix.Matrix f9593b;

            /* renamed from: c */
            public SingleFieldBuilderV3 f9594c;

            /* renamed from: d */
            public GraphSnapshot f9595d;

            /* renamed from: e */
            public SingleFieldBuilderV3 f9596e;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    m9077n();
                    getGraphSnapshotFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C7120b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7120b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public final C7120b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7120b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7120b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7120b) super.addRepeatedField(fieldDescriptor, obj);
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
                if (this.f9592a != 0) {
                    m9070f(pageSnapshot);
                }
                onBuilt();
                return pageSnapshot;
            }

            /* renamed from: f */
            public final void m9070f(PageSnapshot pageSnapshot) {
                int i9;
                int i10 = this.f9592a;
                if ((i10 & 1) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9594c;
                    pageSnapshot.f9555b = singleFieldBuilderV3 == null ? this.f9593b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                if ((i10 & 2) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9596e;
                    pageSnapshot.f9556c = singleFieldBuilderV32 == null ? this.f9595d : (GraphSnapshot) singleFieldBuilderV32.build();
                    i9 |= 2;
                }
                PageSnapshot.m8968k(pageSnapshot, i9);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7120b clear() {
                super.clear();
                this.f9592a = 0;
                this.f9593b = null;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9594c;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f9594c = null;
                }
                this.f9595d = null;
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9596e;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.f9596e = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPageSnapshot.f9547a;
            }

            public final SingleFieldBuilderV3 getGraphSnapshotFieldBuilder() {
                if (this.f9596e == null) {
                    this.f9596e = new SingleFieldBuilderV3(m9079p(), getParentForChildren(), isClean());
                    this.f9595d = null;
                }
                return this.f9596e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7120b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7120b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7120b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7120b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageSnapshot.f9548b.ensureFieldAccessorsInitialized(PageSnapshot.class, C7120b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7120b mo24685clone() {
                return (C7120b) super.mo24685clone();
            }

            /* renamed from: l */
            public EzyMatrix.Matrix m9075l() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9594c;
                if (singleFieldBuilderV3 != null) {
                    return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                }
                EzyMatrix.Matrix matrix = this.f9593b;
                return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
            }

            /* renamed from: m */
            public EzyMatrix.Matrix.C7109b m9076m() {
                this.f9592a |= 1;
                onChanged();
                return (EzyMatrix.Matrix.C7109b) m9077n().getBuilder();
            }

            /* renamed from: n */
            public final SingleFieldBuilderV3 m9077n() {
                if (this.f9594c == null) {
                    this.f9594c = new SingleFieldBuilderV3(m9075l(), getParentForChildren(), isClean());
                    this.f9593b = null;
                }
                return this.f9594c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public PageSnapshot getDefaultInstanceForType() {
                return PageSnapshot.m8969q();
            }

            /* renamed from: p */
            public GraphSnapshot m9079p() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9596e;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot) singleFieldBuilderV3.getMessage();
                }
                GraphSnapshot graphSnapshot = this.f9595d;
                return graphSnapshot == null ? GraphSnapshot.m8988J() : graphSnapshot;
            }

            /* renamed from: q */
            public GraphSnapshot.C7118b m9080q() {
                this.f9592a |= 2;
                onChanged();
                return (GraphSnapshot.C7118b) getGraphSnapshotFieldBuilder().getBuilder();
            }

            /* renamed from: r */
            public C7120b m9081r(EzyMatrix.Matrix matrix) {
                EzyMatrix.Matrix matrix2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9594c;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(matrix);
                } else if ((this.f9592a & 1) == 0 || (matrix2 = this.f9593b) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                    this.f9593b = matrix;
                } else {
                    m9076m().m8877o(matrix);
                }
                if (this.f9593b != null) {
                    this.f9592a |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7120b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(m9077n().getBuilder(), extensionRegistryLite);
                                    this.f9592a |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getGraphSnapshotFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.f9592a |= 2;
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
            public C7120b mergeFrom(Message message) {
                if (message instanceof PageSnapshot) {
                    return m9084u((PageSnapshot) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: u */
            public C7120b m9084u(PageSnapshot pageSnapshot) {
                if (pageSnapshot == PageSnapshot.m8969q()) {
                    return this;
                }
                if (pageSnapshot.m8976v()) {
                    m9081r(pageSnapshot.m8973n());
                }
                if (pageSnapshot.hasGraphSnapshot()) {
                    m9085v(pageSnapshot.m8975u());
                }
                mergeUnknownFields(pageSnapshot.getUnknownFields());
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7120b m9085v(GraphSnapshot graphSnapshot) {
                GraphSnapshot graphSnapshot2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9596e;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(graphSnapshot);
                } else if ((this.f9592a & 2) == 0 || (graphSnapshot2 = this.f9595d) == null || graphSnapshot2 == GraphSnapshot.m8988J()) {
                    this.f9595d = graphSnapshot;
                } else {
                    m9080q().m9023B(graphSnapshot);
                }
                if (this.f9595d != null) {
                    this.f9592a |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C7120b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7120b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: x */
            public C7120b m9087x(EzyMatrix.Matrix matrix) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9594c;
                if (singleFieldBuilderV3 == null) {
                    matrix.getClass();
                    this.f9593b = matrix;
                } else {
                    singleFieldBuilderV3.setMessage(matrix);
                }
                this.f9592a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C7120b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7120b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: z */
            public C7120b m9089z(GraphSnapshot graphSnapshot) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9596e;
                if (singleFieldBuilderV3 == null) {
                    graphSnapshot.getClass();
                    this.f9595d = graphSnapshot;
                } else {
                    singleFieldBuilderV3.setMessage(graphSnapshot);
                }
                this.f9592a |= 2;
                onChanged();
                return this;
            }

            public C7120b() {
                maybeForceBuilderInitialization();
            }

            public C7120b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }
        }

        public PageSnapshot(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9557d = (byte) -1;
        }

        private PageSnapshot() {
            this.f9557d = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8964e().getMessageTypes().get(0);
        f9547a = descriptor;
        f9548b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CameraMatrix", "GraphSnapshot"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9549c = descriptor2;
        f9550d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "GraphEnum", "OutRect", "Matrix", "ChildGraph", "SourceFileName", "SourceId", "BackgroundColor", "Paint", "Content", "PointList", "FilePath"});
        EzyRectF.m9169c();
        EzyPaint.m9092c();
        EzyPointF.m9134c();
        EzyMatrix.m8838c();
        EzyGraphEnum.m8608a();
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m8964e() {
        return f9551e;
    }
}
