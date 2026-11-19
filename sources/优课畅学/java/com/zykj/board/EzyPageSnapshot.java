package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.databinding.library.baseAdapters.C3721BR;
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
    public static final Descriptors.Descriptor f9274a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9275b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9276c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9277d;

    /* renamed from: e */
    public static Descriptors.FileDescriptor f9278e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013GraphSnapshot.proto\u001a\u0011utils/RectF.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0012utils/Matrix.proto\u001a\u0015enums/GraphEnum.proto\"\u009a\u0003\n\fPageSnapshot\u0012\u001d\n\fcameraMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u00122\n\rgraphSnapshot\u0018\u0002 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u001a¶\u0002\n\rGraphSnapshot\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0017\n\u0006matrix\u0018\u0004 \u0001(\u000b2\u0007.Matrix\u0012/\n\nchildGraph\u0018\u0005 \u0003(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0016\n\u000esourceFileName\u0018\u0006 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0007 \u0001(\u0005\u0012\u0017\n\u000fbackgroundColor\u0018\b \u0001(\u0005\u0012\u0015\n\u0005paint\u0018\t \u0001(\u000b2\u0006.Paint\u0012\u000f\n\u0007content\u0018\n \u0001(\t\u0012\u001a\n\tpointList\u0018\u000b \u0003(\u000b2\u0007.PointF\u0012\u0010\n\bfilePath\u0018\f \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyPageSnapshotb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyRectF.m8542c(), EzyPaint.m8466c(), EzyPointF.m8508c(), EzyMatrix.m8214c(), EzyGraphEnum.m7984a()});

    public static final class PageSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final PageSnapshot f9279e = new PageSnapshot();

        /* renamed from: f */
        public static final Parser f9280f = new C7229a();

        /* renamed from: a */
        public int f9281a;

        /* renamed from: b */
        public EzyMatrix.Matrix f9282b;

        /* renamed from: c */
        public GraphSnapshot f9283c;

        /* renamed from: d */
        public byte f9284d;

        public static final class GraphSnapshot extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: o */
            public static final GraphSnapshot f9285o = new GraphSnapshot();

            /* renamed from: p */
            public static final Parser f9286p = new C7227a();

            /* renamed from: a */
            public int f9287a;

            /* renamed from: b */
            public volatile Object f9288b;

            /* renamed from: c */
            public int f9289c;

            /* renamed from: d */
            public EzyRectF.RectF f9290d;

            /* renamed from: e */
            public EzyMatrix.Matrix f9291e;

            /* renamed from: f */
            public List f9292f;

            /* renamed from: g */
            public volatile Object f9293g;

            /* renamed from: h */
            public int f9294h;

            /* renamed from: i */
            public int f9295i;

            /* renamed from: j */
            public EzyPaint.Paint f9296j;

            /* renamed from: k */
            public volatile Object f9297k;

            /* renamed from: l */
            public List f9298l;

            /* renamed from: m */
            public volatile Object f9299m;

            /* renamed from: n */
            public byte f9300n;

            /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$GraphSnapshot$a */
            public class C7227a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7228b c7228bM8354L = GraphSnapshot.m8354L();
                    try {
                        c7228bM8354L.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7228bM8354L.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7228bM8354L.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7228bM8354L.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7228bM8354L.buildPartial());
                    }
                }
            }

            /* renamed from: L */
            public static C7228b m8354L() {
                return f9285o.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyPageSnapshot.f9276c;
            }

            public static Parser parser() {
                return f9286p;
            }

            /* renamed from: q */
            public static /* synthetic */ int m8370q(GraphSnapshot graphSnapshot, int i10) {
                int i11 = i10 | graphSnapshot.f9287a;
                graphSnapshot.f9287a = i11;
                return i11;
            }

            /* renamed from: x */
            public static GraphSnapshot m8377x() {
                return f9285o;
            }

            /* renamed from: A */
            public EzyGraphEnum.GraphEnum m8378A() {
                EzyGraphEnum.GraphEnum graphEnumM7985a = EzyGraphEnum.GraphEnum.m7985a(this.f9289c);
                return graphEnumM7985a == null ? EzyGraphEnum.GraphEnum.UNRECOGNIZED : graphEnumM7985a;
            }

            /* renamed from: B */
            public int m8379B() {
                return this.f9289c;
            }

            /* renamed from: C */
            public EzyMatrix.Matrix m8380C() {
                EzyMatrix.Matrix matrix = this.f9291e;
                return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
            }

            /* renamed from: D */
            public EzyRectF.RectF m8381D() {
                EzyRectF.RectF rectF = this.f9290d;
                return rectF == null ? EzyRectF.RectF.m8547e() : rectF;
            }

            /* renamed from: E */
            public EzyPaint.Paint m8382E() {
                EzyPaint.Paint paint = this.f9296j;
                return paint == null ? EzyPaint.Paint.m8473h() : paint;
            }

            /* renamed from: F */
            public int m8383F() {
                return this.f9298l.size();
            }

            /* renamed from: G */
            public List m8384G() {
                return this.f9298l;
            }

            /* renamed from: H */
            public String m8385H() {
                Object obj = this.f9293g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9293g = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: I */
            public int m8386I() {
                return this.f9294h;
            }

            /* renamed from: J */
            public boolean m8387J() {
                return (this.f9287a & 2) != 0;
            }

            /* renamed from: K */
            public boolean m8388K() {
                return (this.f9287a & 4) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: M, reason: merged with bridge method [inline-methods] */
            public C7228b newBuilderForType() {
                return m8354L();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public C7228b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7228b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: O, reason: merged with bridge method [inline-methods] */
            public C7228b toBuilder() {
                return this == f9285o ? new C7228b() : new C7228b().m8397B(this);
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
                if (!getId().equals(graphSnapshot.getId()) || this.f9289c != graphSnapshot.f9289c || hasOutRect() != graphSnapshot.hasOutRect()) {
                    return false;
                }
                if ((hasOutRect() && !m8381D().equals(graphSnapshot.m8381D())) || m8387J() != graphSnapshot.m8387J()) {
                    return false;
                }
                if ((!m8387J() || m8380C().equals(graphSnapshot.m8380C())) && getChildGraphList().equals(graphSnapshot.getChildGraphList()) && m8385H().equals(graphSnapshot.m8385H()) && m8386I() == graphSnapshot.m8386I() && getBackgroundColor() == graphSnapshot.getBackgroundColor() && m8388K() == graphSnapshot.m8388K()) {
                    return (!m8388K() || m8382E().equals(graphSnapshot.m8382E())) && getContent().equals(graphSnapshot.getContent()) && m8384G().equals(graphSnapshot.m8384G()) && m8393z().equals(graphSnapshot.m8393z()) && getUnknownFields().equals(graphSnapshot.getUnknownFields());
                }
                return false;
            }

            public int getBackgroundColor() {
                return this.f9295i;
            }

            public int getChildGraphCount() {
                return this.f9292f.size();
            }

            public List getChildGraphList() {
                return this.f9292f;
            }

            public String getContent() {
                Object obj = this.f9297k;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9297k = stringUtf8;
                return stringUtf8;
            }

            public String getId() {
                Object obj = this.f9288b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9288b = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9286p;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9288b) ? GeneratedMessageV3.computeStringSize(1, this.f9288b) : 0;
                if (this.f9289c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.f9289c);
                }
                if ((1 & this.f9287a) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(3, m8381D());
                }
                if ((this.f9287a & 2) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(4, m8380C());
                }
                for (int i11 = 0; i11 < this.f9292f.size(); i11++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f9292f.get(i11));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9293g)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f9293g);
                }
                int i12 = this.f9294h;
                if (i12 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(7, i12);
                }
                int i13 = this.f9295i;
                if (i13 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(8, i13);
                }
                if ((this.f9287a & 4) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(9, m8382E());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9297k)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.f9297k);
                }
                for (int i14 = 0; i14 < this.f9298l.size(); i14++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(11, (MessageLite) this.f9298l.get(i14));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9299m)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f9299m);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasOutRect() {
                return (this.f9287a & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + this.f9289c;
                if (hasOutRect()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + m8381D().hashCode();
                }
                if (m8387J()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + m8380C().hashCode();
                }
                if (getChildGraphCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getChildGraphList().hashCode();
                }
                int iHashCode2 = (((((((((((iHashCode * 37) + 6) * 53) + m8385H().hashCode()) * 37) + 7) * 53) + m8386I()) * 37) + 8) * 53) + getBackgroundColor();
                if (m8388K()) {
                    iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m8382E().hashCode();
                }
                int iHashCode3 = (((iHashCode2 * 37) + 10) * 53) + getContent().hashCode();
                if (m8383F() > 0) {
                    iHashCode3 = (((iHashCode3 * 37) + 11) * 53) + m8384G().hashCode();
                }
                int iHashCode4 = (((((iHashCode3 * 37) + 12) * 53) + m8393z().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode4;
                return iHashCode4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageSnapshot.f9277d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C7228b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9300n;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9300n = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new GraphSnapshot();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessageV3.isStringEmpty(this.f9288b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9288b);
                }
                if (this.f9289c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                    codedOutputStream.writeEnum(2, this.f9289c);
                }
                if ((this.f9287a & 1) != 0) {
                    codedOutputStream.writeMessage(3, m8381D());
                }
                if ((this.f9287a & 2) != 0) {
                    codedOutputStream.writeMessage(4, m8380C());
                }
                for (int i10 = 0; i10 < this.f9292f.size(); i10++) {
                    codedOutputStream.writeMessage(5, (MessageLite) this.f9292f.get(i10));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9293g)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.f9293g);
                }
                int i11 = this.f9294h;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(7, i11);
                }
                int i12 = this.f9295i;
                if (i12 != 0) {
                    codedOutputStream.writeInt32(8, i12);
                }
                if ((4 & this.f9287a) != 0) {
                    codedOutputStream.writeMessage(9, m8382E());
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9297k)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 10, this.f9297k);
                }
                for (int i13 = 0; i13 < this.f9298l.size(); i13++) {
                    codedOutputStream.writeMessage(11, (MessageLite) this.f9298l.get(i13));
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9299m)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 12, this.f9299m);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public GraphSnapshot getDefaultInstanceForType() {
                return f9285o;
            }

            /* renamed from: z */
            public String m8393z() {
                Object obj = this.f9299m;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9299m = stringUtf8;
                return stringUtf8;
            }

            /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$GraphSnapshot$b */
            public static final class C7228b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9301a;

                /* renamed from: b */
                public Object f9302b;

                /* renamed from: c */
                public int f9303c;

                /* renamed from: d */
                public EzyRectF.RectF f9304d;

                /* renamed from: e */
                public SingleFieldBuilderV3 f9305e;

                /* renamed from: f */
                public EzyMatrix.Matrix f9306f;

                /* renamed from: g */
                public SingleFieldBuilderV3 f9307g;

                /* renamed from: h */
                public List f9308h;

                /* renamed from: i */
                public RepeatedFieldBuilderV3 f9309i;

                /* renamed from: j */
                public Object f9310j;

                /* renamed from: k */
                public int f9311k;

                /* renamed from: l */
                public int f9312l;

                /* renamed from: m */
                public EzyPaint.Paint f9313m;

                /* renamed from: n */
                public SingleFieldBuilderV3 f9314n;

                /* renamed from: o */
                public Object f9315o;

                /* renamed from: p */
                public List f9316p;

                /* renamed from: q */
                public RepeatedFieldBuilderV3 f9317q;

                /* renamed from: r */
                public Object f9318r;

                private SingleFieldBuilderV3 getOutRectFieldBuilder() {
                    if (this.f9305e == null) {
                        this.f9305e = new SingleFieldBuilderV3(m8432t(), getParentForChildren(), isClean());
                        this.f9304d = null;
                    }
                    return this.f9305e;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getOutRectFieldBuilder();
                        m8431s();
                        getChildGraphFieldBuilder();
                        m8395x();
                        m8436y();
                    }
                }

                /* renamed from: x */
                private SingleFieldBuilderV3 m8395x() {
                    if (this.f9314n == null) {
                        this.f9314n = new SingleFieldBuilderV3(m8434v(), getParentForChildren(), isClean());
                        this.f9313m = null;
                    }
                    return this.f9314n;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C7228b mergeFrom(Message message) {
                    if (message instanceof GraphSnapshot) {
                        return m8397B((GraphSnapshot) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: B */
                public C7228b m8397B(GraphSnapshot graphSnapshot) {
                    if (graphSnapshot == GraphSnapshot.m8377x()) {
                        return this;
                    }
                    if (!graphSnapshot.getId().isEmpty()) {
                        this.f9302b = graphSnapshot.f9288b;
                        this.f9301a |= 1;
                        onChanged();
                    }
                    if (graphSnapshot.f9289c != 0) {
                        m8407L(graphSnapshot.m8379B());
                    }
                    if (graphSnapshot.hasOutRect()) {
                        m8399D(graphSnapshot.m8381D());
                    }
                    if (graphSnapshot.m8387J()) {
                        m8398C(graphSnapshot.m8380C());
                    }
                    if (this.f9309i == null) {
                        if (!graphSnapshot.f9292f.isEmpty()) {
                            if (this.f9308h.isEmpty()) {
                                this.f9308h = graphSnapshot.f9292f;
                                this.f9301a &= -17;
                            } else {
                                ensureChildGraphIsMutable();
                                this.f9308h.addAll(graphSnapshot.f9292f);
                            }
                            onChanged();
                        }
                    } else if (!graphSnapshot.f9292f.isEmpty()) {
                        if (this.f9309i.isEmpty()) {
                            this.f9309i.dispose();
                            this.f9309i = null;
                            this.f9308h = graphSnapshot.f9292f;
                            this.f9301a &= -17;
                            this.f9309i = GeneratedMessageV3.alwaysUseFieldBuilders ? getChildGraphFieldBuilder() : null;
                        } else {
                            this.f9309i.addAllMessages(graphSnapshot.f9292f);
                        }
                    }
                    if (!graphSnapshot.m8385H().isEmpty()) {
                        this.f9310j = graphSnapshot.f9293g;
                        this.f9301a |= 32;
                        onChanged();
                    }
                    if (graphSnapshot.m8386I() != 0) {
                        m8414S(graphSnapshot.m8386I());
                    }
                    if (graphSnapshot.getBackgroundColor() != 0) {
                        m8402G(graphSnapshot.getBackgroundColor());
                    }
                    if (graphSnapshot.m8388K()) {
                        m8400E(graphSnapshot.m8382E());
                    }
                    if (!graphSnapshot.getContent().isEmpty()) {
                        this.f9315o = graphSnapshot.f9297k;
                        this.f9301a |= 512;
                        onChanged();
                    }
                    if (this.f9317q == null) {
                        if (!graphSnapshot.f9298l.isEmpty()) {
                            if (this.f9316p.isEmpty()) {
                                this.f9316p = graphSnapshot.f9298l;
                                this.f9301a &= -1025;
                            } else {
                                m8427o();
                                this.f9316p.addAll(graphSnapshot.f9298l);
                            }
                            onChanged();
                        }
                    } else if (!graphSnapshot.f9298l.isEmpty()) {
                        if (this.f9317q.isEmpty()) {
                            this.f9317q.dispose();
                            this.f9317q = null;
                            this.f9316p = graphSnapshot.f9298l;
                            this.f9301a &= -1025;
                            this.f9317q = GeneratedMessageV3.alwaysUseFieldBuilders ? m8436y() : null;
                        } else {
                            this.f9317q.addAllMessages(graphSnapshot.f9298l);
                        }
                    }
                    if (!graphSnapshot.m8393z().isEmpty()) {
                        this.f9318r = graphSnapshot.f9299m;
                        this.f9301a |= 2048;
                        onChanged();
                    }
                    mergeUnknownFields(graphSnapshot.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: C */
                public C7228b m8398C(EzyMatrix.Matrix matrix) {
                    EzyMatrix.Matrix matrix2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9307g;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(matrix);
                    } else if ((this.f9301a & 8) == 0 || (matrix2 = this.f9306f) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                        this.f9306f = matrix;
                    } else {
                        m8430r().m8253o(matrix);
                    }
                    if (this.f9306f != null) {
                        this.f9301a |= 8;
                        onChanged();
                    }
                    return this;
                }

                /* renamed from: D */
                public C7228b m8399D(EzyRectF.RectF rectF) {
                    EzyRectF.RectF rectF2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9305e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(rectF);
                    } else if ((this.f9301a & 4) == 0 || (rectF2 = this.f9304d) == null || rectF2 == EzyRectF.RectF.m8547e()) {
                        this.f9304d = rectF;
                    } else {
                        m8433u().m8565o(rectF);
                    }
                    if (this.f9304d != null) {
                        this.f9301a |= 4;
                        onChanged();
                    }
                    return this;
                }

                /* renamed from: E */
                public C7228b m8400E(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9314n;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f9301a & 256) == 0 || (paint2 = this.f9313m) == null || paint2 == EzyPaint.Paint.m8473h()) {
                        this.f9313m = paint;
                    } else {
                        m8435w().m8495o(paint);
                    }
                    if (this.f9313m != null) {
                        this.f9301a |= 256;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: F, reason: merged with bridge method [inline-methods] */
                public final C7228b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7228b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: G */
                public C7228b m8402G(int i10) {
                    this.f9312l = i10;
                    this.f9301a |= 128;
                    onChanged();
                    return this;
                }

                /* renamed from: H */
                public C7228b m8403H(String str) {
                    str.getClass();
                    this.f9315o = str;
                    this.f9301a |= 512;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: I, reason: merged with bridge method [inline-methods] */
                public C7228b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7228b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: J */
                public C7228b m8405J(String str) {
                    str.getClass();
                    this.f9318r = str;
                    this.f9301a |= 2048;
                    onChanged();
                    return this;
                }

                /* renamed from: K */
                public C7228b m8406K(EzyGraphEnum.GraphEnum graphEnum) {
                    graphEnum.getClass();
                    this.f9301a |= 2;
                    this.f9303c = graphEnum.getNumber();
                    onChanged();
                    return this;
                }

                /* renamed from: L */
                public C7228b m8407L(int i10) {
                    this.f9303c = i10;
                    this.f9301a |= 2;
                    onChanged();
                    return this;
                }

                /* renamed from: M */
                public C7228b m8408M(String str) {
                    str.getClass();
                    this.f9302b = str;
                    this.f9301a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: N */
                public C7228b m8409N(EzyMatrix.Matrix matrix) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9307g;
                    if (singleFieldBuilderV3 == null) {
                        matrix.getClass();
                        this.f9306f = matrix;
                    } else {
                        singleFieldBuilderV3.setMessage(matrix);
                    }
                    this.f9301a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: O */
                public C7228b m8410O(EzyRectF.RectF rectF) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9305e;
                    if (singleFieldBuilderV3 == null) {
                        rectF.getClass();
                        this.f9304d = rectF;
                    } else {
                        singleFieldBuilderV3.setMessage(rectF);
                    }
                    this.f9301a |= 4;
                    onChanged();
                    return this;
                }

                /* renamed from: P */
                public C7228b m8411P(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9314n;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f9313m = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f9301a |= 256;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: Q, reason: merged with bridge method [inline-methods] */
                public C7228b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7228b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                /* renamed from: R */
                public C7228b m8413R(String str) {
                    str.getClass();
                    this.f9310j = str;
                    this.f9301a |= 32;
                    onChanged();
                    return this;
                }

                /* renamed from: S */
                public C7228b m8414S(int i10) {
                    this.f9311k = i10;
                    this.f9301a |= 64;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: T, reason: merged with bridge method [inline-methods] */
                public final C7228b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7228b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: c */
                public C7228b m8416c(C7228b c7228b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9309i;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c7228b.build());
                        return this;
                    }
                    ensureChildGraphIsMutable();
                    this.f9308h.add(c7228b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: e */
                public C7228b m8417e(EzyPointF.PointF pointF) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9317q;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointF);
                        return this;
                    }
                    pointF.getClass();
                    m8427o();
                    this.f9316p.add(pointF);
                    onChanged();
                    return this;
                }

                public final void ensureChildGraphIsMutable() {
                    if ((this.f9301a & 16) == 0) {
                        this.f9308h = new ArrayList(this.f9308h);
                        this.f9301a |= 16;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C7228b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7228b) super.addRepeatedField(fieldDescriptor, obj);
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
                    if (this.f9309i == null) {
                        this.f9309i = new RepeatedFieldBuilderV3(this.f9308h, (this.f9301a & 16) != 0, getParentForChildren(), isClean());
                        this.f9308h = null;
                    }
                    return this.f9309i;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyPageSnapshot.f9276c;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot buildPartial() {
                    GraphSnapshot graphSnapshot = new GraphSnapshot(this);
                    m8422j(graphSnapshot);
                    if (this.f9301a != 0) {
                        m8421i(graphSnapshot);
                    }
                    onBuilt();
                    return graphSnapshot;
                }

                /* renamed from: i */
                public final void m8421i(GraphSnapshot graphSnapshot) {
                    int i10;
                    int i11 = this.f9301a;
                    if ((i11 & 1) != 0) {
                        graphSnapshot.f9288b = this.f9302b;
                    }
                    if ((i11 & 2) != 0) {
                        graphSnapshot.f9289c = this.f9303c;
                    }
                    if ((i11 & 4) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9305e;
                        graphSnapshot.f9290d = singleFieldBuilderV3 == null ? this.f9304d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 8) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9307g;
                        graphSnapshot.f9291e = singleFieldBuilderV32 == null ? this.f9306f : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                        i10 |= 2;
                    }
                    if ((i11 & 32) != 0) {
                        graphSnapshot.f9293g = this.f9310j;
                    }
                    if ((i11 & 64) != 0) {
                        graphSnapshot.f9294h = this.f9311k;
                    }
                    if ((i11 & 128) != 0) {
                        graphSnapshot.f9295i = this.f9312l;
                    }
                    if ((i11 & 256) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9314n;
                        graphSnapshot.f9296j = singleFieldBuilderV33 == null ? this.f9313m : (EzyPaint.Paint) singleFieldBuilderV33.build();
                        i10 |= 4;
                    }
                    if ((i11 & 512) != 0) {
                        graphSnapshot.f9297k = this.f9315o;
                    }
                    if ((i11 & 2048) != 0) {
                        graphSnapshot.f9299m = this.f9318r;
                    }
                    GraphSnapshot.m8370q(graphSnapshot, i10);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyPageSnapshot.f9277d.ensureFieldAccessorsInitialized(GraphSnapshot.class, C7228b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                /* renamed from: j */
                public final void m8422j(GraphSnapshot graphSnapshot) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9309i;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.f9301a & 16) != 0) {
                            this.f9308h = Collections.unmodifiableList(this.f9308h);
                            this.f9301a &= -17;
                        }
                        graphSnapshot.f9292f = this.f9308h;
                    } else {
                        graphSnapshot.f9292f = repeatedFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9317q;
                    if (repeatedFieldBuilderV32 != null) {
                        graphSnapshot.f9298l = repeatedFieldBuilderV32.build();
                        return;
                    }
                    if ((this.f9301a & 1024) != 0) {
                        this.f9316p = Collections.unmodifiableList(this.f9316p);
                        this.f9301a &= -1025;
                    }
                    graphSnapshot.f9298l = this.f9316p;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7228b clear() {
                    super.clear();
                    this.f9301a = 0;
                    this.f9302b = "";
                    this.f9303c = 0;
                    this.f9304d = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9305e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f9305e = null;
                    }
                    this.f9306f = null;
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9307g;
                    if (singleFieldBuilderV32 != null) {
                        singleFieldBuilderV32.dispose();
                        this.f9307g = null;
                    }
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9309i;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f9308h = Collections.EMPTY_LIST;
                    } else {
                        this.f9308h = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f9301a &= -17;
                    this.f9310j = "";
                    this.f9311k = 0;
                    this.f9312l = 0;
                    this.f9313m = null;
                    SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9314n;
                    if (singleFieldBuilderV33 != null) {
                        singleFieldBuilderV33.dispose();
                        this.f9314n = null;
                    }
                    this.f9315o = "";
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9317q;
                    if (repeatedFieldBuilderV32 == null) {
                        this.f9316p = Collections.EMPTY_LIST;
                    } else {
                        this.f9316p = null;
                        repeatedFieldBuilderV32.clear();
                    }
                    this.f9301a &= -1025;
                    this.f9318r = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7228b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7228b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7228b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7228b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7228b mo27381clone() {
                    return (C7228b) super.mo27381clone();
                }

                /* renamed from: o */
                public final void m8427o() {
                    if ((this.f9301a & 1024) == 0) {
                        this.f9316p = new ArrayList(this.f9316p);
                        this.f9301a |= 1024;
                    }
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public GraphSnapshot getDefaultInstanceForType() {
                    return GraphSnapshot.m8377x();
                }

                /* renamed from: q */
                public EzyMatrix.Matrix m8429q() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9307g;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                    }
                    EzyMatrix.Matrix matrix = this.f9306f;
                    return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                }

                /* renamed from: r */
                public EzyMatrix.Matrix.C7219b m8430r() {
                    this.f9301a |= 8;
                    onChanged();
                    return (EzyMatrix.Matrix.C7219b) m8431s().getBuilder();
                }

                /* renamed from: s */
                public final SingleFieldBuilderV3 m8431s() {
                    if (this.f9307g == null) {
                        this.f9307g = new SingleFieldBuilderV3(m8429q(), getParentForChildren(), isClean());
                        this.f9306f = null;
                    }
                    return this.f9307g;
                }

                /* renamed from: t */
                public EzyRectF.RectF m8432t() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9305e;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                    }
                    EzyRectF.RectF rectF = this.f9304d;
                    return rectF == null ? EzyRectF.RectF.m8547e() : rectF;
                }

                /* renamed from: u */
                public EzyRectF.RectF.C7240b m8433u() {
                    this.f9301a |= 4;
                    onChanged();
                    return (EzyRectF.RectF.C7240b) getOutRectFieldBuilder().getBuilder();
                }

                /* renamed from: v */
                public EzyPaint.Paint m8434v() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9314n;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f9313m;
                    return paint == null ? EzyPaint.Paint.m8473h() : paint;
                }

                /* renamed from: w */
                public EzyPaint.Paint.C7233b m8435w() {
                    this.f9301a |= 256;
                    onChanged();
                    return (EzyPaint.Paint.C7233b) m8395x().getBuilder();
                }

                /* renamed from: y */
                public final RepeatedFieldBuilderV3 m8436y() {
                    if (this.f9317q == null) {
                        this.f9317q = new RepeatedFieldBuilderV3(this.f9316p, (this.f9301a & 1024) != 0, getParentForChildren(), isClean());
                        this.f9316p = null;
                    }
                    return this.f9317q;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C7228b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                        this.f9302b = codedInputStream.readStringRequireUtf8();
                                        this.f9301a |= 1;
                                    case 16:
                                        this.f9303c = codedInputStream.readEnum();
                                        this.f9301a |= 2;
                                    case 26:
                                        codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.f9301a |= 4;
                                    case 34:
                                        codedInputStream.readMessage(m8431s().getBuilder(), extensionRegistryLite);
                                        this.f9301a |= 8;
                                    case 42:
                                        GraphSnapshot graphSnapshot = (GraphSnapshot) codedInputStream.readMessage(GraphSnapshot.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9309i;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureChildGraphIsMutable();
                                            this.f9308h.add(graphSnapshot);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(graphSnapshot);
                                        }
                                    case 50:
                                        this.f9310j = codedInputStream.readStringRequireUtf8();
                                        this.f9301a |= 32;
                                    case C3721BR.userInfo /* 56 */:
                                        this.f9311k = codedInputStream.readInt32();
                                        this.f9301a |= 64;
                                    case 64:
                                        this.f9312l = codedInputStream.readInt32();
                                        this.f9301a |= 128;
                                    case 74:
                                        codedInputStream.readMessage(m8395x().getBuilder(), extensionRegistryLite);
                                        this.f9301a |= 256;
                                    case 82:
                                        this.f9315o = codedInputStream.readStringRequireUtf8();
                                        this.f9301a |= 512;
                                    case 90:
                                        EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f9317q;
                                        if (repeatedFieldBuilderV32 == null) {
                                            m8427o();
                                            this.f9316p.add(pointF);
                                        } else {
                                            repeatedFieldBuilderV32.addMessage(pointF);
                                        }
                                    case 98:
                                        this.f9318r = codedInputStream.readStringRequireUtf8();
                                        this.f9301a |= 2048;
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

                public C7228b() {
                    this.f9302b = "";
                    this.f9303c = 0;
                    List list = Collections.EMPTY_LIST;
                    this.f9308h = list;
                    this.f9310j = "";
                    this.f9315o = "";
                    this.f9316p = list;
                    this.f9318r = "";
                    maybeForceBuilderInitialization();
                }

                public C7228b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9302b = "";
                    this.f9303c = 0;
                    List list = Collections.EMPTY_LIST;
                    this.f9308h = list;
                    this.f9310j = "";
                    this.f9315o = "";
                    this.f9316p = list;
                    this.f9318r = "";
                    maybeForceBuilderInitialization();
                }
            }

            public GraphSnapshot(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9288b = "";
                this.f9289c = 0;
                this.f9293g = "";
                this.f9294h = 0;
                this.f9295i = 0;
                this.f9297k = "";
                this.f9299m = "";
                this.f9300n = (byte) -1;
            }

            private GraphSnapshot() {
                this.f9288b = "";
                this.f9289c = 0;
                this.f9293g = "";
                this.f9294h = 0;
                this.f9295i = 0;
                this.f9297k = "";
                this.f9299m = "";
                this.f9300n = (byte) -1;
                this.f9288b = "";
                this.f9289c = 0;
                List list = Collections.EMPTY_LIST;
                this.f9292f = list;
                this.f9293g = "";
                this.f9297k = "";
                this.f9298l = list;
                this.f9299m = "";
            }
        }

        /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$a */
        public class C7229a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PageSnapshot parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7230b c7230bM8345k = PageSnapshot.m8345k();
                try {
                    c7230bM8345k.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7230bM8345k.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7230bM8345k.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7230bM8345k.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7230bM8345k.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static /* synthetic */ int m8343d(PageSnapshot pageSnapshot, int i10) {
            int i11 = i10 | pageSnapshot.f9281a;
            pageSnapshot.f9281a = i11;
            return i11;
        }

        /* renamed from: g */
        public static PageSnapshot m8344g() {
            return f9279e;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyPageSnapshot.f9274a;
        }

        /* renamed from: k */
        public static C7230b m8345k() {
            return f9279e.toBuilder();
        }

        /* renamed from: n */
        public static PageSnapshot m8346n(InputStream inputStream) {
            return (PageSnapshot) GeneratedMessageV3.parseWithIOException(f9280f, inputStream);
        }

        /* renamed from: e */
        public EzyMatrix.Matrix m8347e() {
            EzyMatrix.Matrix matrix = this.f9282b;
            return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
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
            if (m8350j() != pageSnapshot.m8350j()) {
                return false;
            }
            if ((!m8350j() || m8347e().equals(pageSnapshot.m8347e())) && hasGraphSnapshot() == pageSnapshot.hasGraphSnapshot()) {
                return (!hasGraphSnapshot() || m8349i().equals(pageSnapshot.m8349i())) && getUnknownFields().equals(pageSnapshot.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9280f;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = (this.f9281a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m8347e()) : 0;
            if ((this.f9281a & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m8349i());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public PageSnapshot getDefaultInstanceForType() {
            return f9279e;
        }

        public boolean hasGraphSnapshot() {
            return (this.f9281a & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8350j()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8347e().hashCode();
            }
            if (hasGraphSnapshot()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m8349i().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        /* renamed from: i */
        public GraphSnapshot m8349i() {
            GraphSnapshot graphSnapshot = this.f9283c;
            return graphSnapshot == null ? GraphSnapshot.m8377x() : graphSnapshot;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyPageSnapshot.f9275b.ensureFieldAccessorsInitialized(PageSnapshot.class, C7230b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9284d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9284d = (byte) 1;
            return true;
        }

        /* renamed from: j */
        public boolean m8350j() {
            return (this.f9281a & 1) != 0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public C7230b newBuilderForType() {
            return m8345k();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C7230b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7230b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PageSnapshot();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C7230b toBuilder() {
            return this == f9279e ? new C7230b() : new C7230b().m8458u(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.f9281a & 1) != 0) {
                codedOutputStream.writeMessage(1, m8347e());
            }
            if ((this.f9281a & 2) != 0) {
                codedOutputStream.writeMessage(2, m8349i());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyPageSnapshot$PageSnapshot$b */
        public static final class C7230b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9319a;

            /* renamed from: b */
            public EzyMatrix.Matrix f9320b;

            /* renamed from: c */
            public SingleFieldBuilderV3 f9321c;

            /* renamed from: d */
            public GraphSnapshot f9322d;

            /* renamed from: e */
            public SingleFieldBuilderV3 f9323e;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    m8451n();
                    getGraphSnapshotFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C7230b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7230b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public final C7230b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7230b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7230b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7230b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public PageSnapshot build() {
                PageSnapshot pageSnapshotBuildPartial = buildPartial();
                if (pageSnapshotBuildPartial.isInitialized()) {
                    return pageSnapshotBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pageSnapshotBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public PageSnapshot buildPartial() {
                PageSnapshot pageSnapshot = new PageSnapshot(this);
                if (this.f9319a != 0) {
                    m8444g(pageSnapshot);
                }
                onBuilt();
                return pageSnapshot;
            }

            /* renamed from: g */
            public final void m8444g(PageSnapshot pageSnapshot) {
                int i10;
                int i11 = this.f9319a;
                if ((i11 & 1) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9321c;
                    pageSnapshot.f9282b = singleFieldBuilderV3 == null ? this.f9320b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9323e;
                    pageSnapshot.f9283c = singleFieldBuilderV32 == null ? this.f9322d : (GraphSnapshot) singleFieldBuilderV32.build();
                    i10 |= 2;
                }
                PageSnapshot.m8343d(pageSnapshot, i10);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyPageSnapshot.f9274a;
            }

            public final SingleFieldBuilderV3 getGraphSnapshotFieldBuilder() {
                if (this.f9323e == null) {
                    this.f9323e = new SingleFieldBuilderV3(m8453p(), getParentForChildren(), isClean());
                    this.f9322d = null;
                }
                return this.f9323e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7230b clear() {
                super.clear();
                this.f9319a = 0;
                this.f9320b = null;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9321c;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f9321c = null;
                }
                this.f9322d = null;
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9323e;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.f9323e = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7230b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7230b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyPageSnapshot.f9275b.ensureFieldAccessorsInitialized(PageSnapshot.class, C7230b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7230b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7230b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7230b mo27381clone() {
                return (C7230b) super.mo27381clone();
            }

            /* renamed from: l */
            public EzyMatrix.Matrix m8449l() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9321c;
                if (singleFieldBuilderV3 != null) {
                    return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                }
                EzyMatrix.Matrix matrix = this.f9320b;
                return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
            }

            /* renamed from: m */
            public EzyMatrix.Matrix.C7219b m8450m() {
                this.f9319a |= 1;
                onChanged();
                return (EzyMatrix.Matrix.C7219b) m8451n().getBuilder();
            }

            /* renamed from: n */
            public final SingleFieldBuilderV3 m8451n() {
                if (this.f9321c == null) {
                    this.f9321c = new SingleFieldBuilderV3(m8449l(), getParentForChildren(), isClean());
                    this.f9320b = null;
                }
                return this.f9321c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public PageSnapshot getDefaultInstanceForType() {
                return PageSnapshot.m8344g();
            }

            /* renamed from: p */
            public GraphSnapshot m8453p() {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9323e;
                if (singleFieldBuilderV3 != null) {
                    return (GraphSnapshot) singleFieldBuilderV3.getMessage();
                }
                GraphSnapshot graphSnapshot = this.f9322d;
                return graphSnapshot == null ? GraphSnapshot.m8377x() : graphSnapshot;
            }

            /* renamed from: q */
            public GraphSnapshot.C7228b m8454q() {
                this.f9319a |= 2;
                onChanged();
                return (GraphSnapshot.C7228b) getGraphSnapshotFieldBuilder().getBuilder();
            }

            /* renamed from: r */
            public C7230b m8455r(EzyMatrix.Matrix matrix) {
                EzyMatrix.Matrix matrix2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9321c;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(matrix);
                } else if ((this.f9319a & 1) == 0 || (matrix2 = this.f9320b) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                    this.f9320b = matrix;
                } else {
                    m8450m().m8253o(matrix);
                }
                if (this.f9320b != null) {
                    this.f9319a |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7230b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(m8451n().getBuilder(), extensionRegistryLite);
                                    this.f9319a |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getGraphSnapshotFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.f9319a |= 2;
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
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7230b mergeFrom(Message message) {
                if (message instanceof PageSnapshot) {
                    return m8458u((PageSnapshot) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: u */
            public C7230b m8458u(PageSnapshot pageSnapshot) {
                if (pageSnapshot == PageSnapshot.m8344g()) {
                    return this;
                }
                if (pageSnapshot.m8350j()) {
                    m8455r(pageSnapshot.m8347e());
                }
                if (pageSnapshot.hasGraphSnapshot()) {
                    m8459v(pageSnapshot.m8349i());
                }
                mergeUnknownFields(pageSnapshot.getUnknownFields());
                onChanged();
                return this;
            }

            /* renamed from: v */
            public C7230b m8459v(GraphSnapshot graphSnapshot) {
                GraphSnapshot graphSnapshot2;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9323e;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(graphSnapshot);
                } else if ((this.f9319a & 2) == 0 || (graphSnapshot2 = this.f9322d) == null || graphSnapshot2 == GraphSnapshot.m8377x()) {
                    this.f9322d = graphSnapshot;
                } else {
                    m8454q().m8397B(graphSnapshot);
                }
                if (this.f9322d != null) {
                    this.f9319a |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C7230b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7230b) super.mergeUnknownFields(unknownFieldSet);
            }

            /* renamed from: x */
            public C7230b m8461x(EzyMatrix.Matrix matrix) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9321c;
                if (singleFieldBuilderV3 == null) {
                    matrix.getClass();
                    this.f9320b = matrix;
                } else {
                    singleFieldBuilderV3.setMessage(matrix);
                }
                this.f9319a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C7230b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7230b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: z */
            public C7230b m8463z(GraphSnapshot graphSnapshot) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9323e;
                if (singleFieldBuilderV3 == null) {
                    graphSnapshot.getClass();
                    this.f9322d = graphSnapshot;
                } else {
                    singleFieldBuilderV3.setMessage(graphSnapshot);
                }
                this.f9319a |= 2;
                onChanged();
                return this;
            }

            public C7230b() {
                maybeForceBuilderInitialization();
            }

            public C7230b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }
        }

        public PageSnapshot(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9284d = (byte) -1;
        }

        private PageSnapshot() {
            this.f9284d = (byte) -1;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8339e().getMessageTypes().get(0);
        f9274a = descriptor;
        f9275b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CameraMatrix", "GraphSnapshot"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9276c = descriptor2;
        f9277d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "GraphEnum", "OutRect", "Matrix", "ChildGraph", "SourceFileName", "SourceId", "BackgroundColor", "Paint", "Content", "PointList", "FilePath"});
        EzyRectF.m8542c();
        EzyPaint.m8466c();
        EzyPointF.m8508c();
        EzyMatrix.m8214c();
        EzyGraphEnum.m7984a();
    }

    /* renamed from: e */
    public static Descriptors.FileDescriptor m8339e() {
        return f9278e;
    }
}
