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
import com.zykj.board.EzyGeometryEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyTouchEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EzySource {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9435a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9436b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9437c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9438d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f9439e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f9440f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f9441g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f9442h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f9443i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f9444j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f9445k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f9446l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f9447m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f9448n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f9449o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f9450p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f9451q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f9452r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f9453s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f9454t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f9455u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f9456v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f9457w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f9458x;

    /* renamed from: y */
    public static Descriptors.FileDescriptor f9459y = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fSource.proto\u001a\u0016utils/TouchEvent.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0018enums/GeometryEnum.proto\"}\n\u000bTouchSource\u0012)\n\ttouchInfo\u0018\u0001 \u0003(\u000b2\u0016.TouchSource.TouchInfo\u001aC\n\tTouchInfo\u0012\u001f\n\ntouchEvent\u0018\u0001 \u0003(\u000b2\u000b.TouchEvent\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"c\n\fMatrixSource\u0012,\n\nmatrixInfo\u0018\u0001 \u0003(\u000b2\u0018.MatrixSource.MatrixInfo\u001a%\n\nMatrixInfo\u0012\u0017\n\u0006matrix\u0018\u0001 \u0003(\u000b2\u0007.Matrix\"\u007f\n\nFileSource\u0012&\n\bfileInfo\u0018\u0001 \u0003(\u000b2\u0014.FileSource.FileInfo\u001aI\n\bFileInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bvalidate\u0018\u0004 \u0001(\t\"w\n\u000bAudioSource\u0012)\n\taudioInfo\u0018\u0001 \u0003(\u000b2\u0016.AudioSource.AudioInfo\u001a=\n\tAudioInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\"h\n\nTextSource\u0012&\n\btextInfo\u0018\u0001 \u0003(\u000b2\u0014.TextSource.TextInfo\u001a2\n\bTextInfo\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"©\u0001\n\u000eGeometrySource\u00122\n\fgeometryInfo\u0018\u0001 \u0003(\u000b2\u001c.GeometrySource.GeometryInfo\u001ac\n\fGeometryInfo\u0012#\n\fgeometryType\u0018\u0001 \u0001(\u000e2\r.GeometryEnum\u0012\u0017\n\u0006points\u0018\u0002 \u0003(\u000b2\u0007.PointF\u0012\u0015\n\u0005paint\u0018\u0003 \u0001(\u000b2\u0006.PaintB\u001b\n\u000ecom.zykj.boardB\tEzySourceb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyTouchEvent.m9071g(), EzyMatrix.m8214c(), EzyPaint.m8466c(), EzyPointF.m8508c(), EzyGeometryEnum.m7980a()});

    public static final class FileSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final FileSource f9460c = new FileSource();

        /* renamed from: d */
        public static final Parser f9461d = new C7250a();

        /* renamed from: a */
        public List f9462a;

        /* renamed from: b */
        public byte f9463b;

        public static final class FileInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final FileInfo f9464f = new FileInfo();

            /* renamed from: g */
            public static final Parser f9465g = new C7248a();

            /* renamed from: a */
            public volatile Object f9466a;

            /* renamed from: b */
            public int f9467b;

            /* renamed from: c */
            public int f9468c;

            /* renamed from: d */
            public volatile Object f9469d;

            /* renamed from: e */
            public byte f9470e;

            /* renamed from: com.zykj.board.EzySource$FileSource$FileInfo$a */
            public class C7248a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FileInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7249b c7249bM8730k = FileInfo.m8730k();
                    try {
                        c7249bM8730k.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7249bM8730k.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7249bM8730k.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7249bM8730k.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7249bM8730k.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9445k;
            }

            /* renamed from: h */
            public static FileInfo m8729h() {
                return f9464f;
            }

            /* renamed from: k */
            public static C7249b m8730k() {
                return f9464f.toBuilder();
            }

            public static Parser parser() {
                return f9465g;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FileInfo)) {
                    return super.equals(obj);
                }
                FileInfo fileInfo = (FileInfo) obj;
                return getName().equals(fileInfo.getName()) && getWidth() == fileInfo.getWidth() && getHeight() == fileInfo.getHeight() && m8732j().equals(fileInfo.m8732j()) && getUnknownFields().equals(fileInfo.getUnknownFields());
            }

            public int getHeight() {
                return this.f9468c;
            }

            public String getName() {
                Object obj = this.f9466a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9466a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9465g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9466a) ? GeneratedMessageV3.computeStringSize(1, this.f9466a) : 0;
                int i11 = this.f9467b;
                if (i11 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(2, i11);
                }
                int i12 = this.f9468c;
                if (i12 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(3, i12);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9469d)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f9469d);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getWidth() {
                return this.f9467b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + m8732j().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public FileInfo getDefaultInstanceForType() {
                return f9464f;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9446l.ensureFieldAccessorsInitialized(FileInfo.class, C7249b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9470e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9470e = (byte) 1;
                return true;
            }

            /* renamed from: j */
            public String m8732j() {
                Object obj = this.f9469d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9469d = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7249b newBuilderForType() {
                return m8730k();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7249b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7249b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7249b toBuilder() {
                return this == f9464f ? new C7249b() : new C7249b().m8748o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new FileInfo();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessageV3.isStringEmpty(this.f9466a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9466a);
                }
                int i10 = this.f9467b;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                int i11 = this.f9468c;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(3, i11);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9469d)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9469d);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$FileSource$FileInfo$b */
            public static final class C7249b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9471a;

                /* renamed from: b */
                public Object f9472b;

                /* renamed from: c */
                public int f9473c;

                /* renamed from: d */
                public int f9474d;

                /* renamed from: e */
                public Object f9475e;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C7249b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7249b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public FileInfo build() {
                    FileInfo fileInfoBuildPartial = buildPartial();
                    if (fileInfoBuildPartial.isInitialized()) {
                        return fileInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public FileInfo buildPartial() {
                    FileInfo fileInfo = new FileInfo(this);
                    if (this.f9471a != 0) {
                        m8740g(fileInfo);
                    }
                    onBuilt();
                    return fileInfo;
                }

                /* renamed from: g */
                public final void m8740g(FileInfo fileInfo) {
                    int i10 = this.f9471a;
                    if ((i10 & 1) != 0) {
                        fileInfo.f9466a = this.f9472b;
                    }
                    if ((i10 & 2) != 0) {
                        fileInfo.f9467b = this.f9473c;
                    }
                    if ((i10 & 4) != 0) {
                        fileInfo.f9468c = this.f9474d;
                    }
                    if ((i10 & 8) != 0) {
                        fileInfo.f9469d = this.f9475e;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9445k;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7249b clear() {
                    super.clear();
                    this.f9471a = 0;
                    this.f9472b = "";
                    this.f9473c = 0;
                    this.f9474d = 0;
                    this.f9475e = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7249b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7249b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9446l.ensureFieldAccessorsInitialized(FileInfo.class, C7249b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7249b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7249b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7249b mo27381clone() {
                    return (C7249b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public FileInfo getDefaultInstanceForType() {
                    return FileInfo.m8729h();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7249b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f9472b = codedInputStream.readStringRequireUtf8();
                                        this.f9471a |= 1;
                                    } else if (tag == 16) {
                                        this.f9473c = codedInputStream.readInt32();
                                        this.f9471a |= 2;
                                    } else if (tag == 24) {
                                        this.f9474d = codedInputStream.readInt32();
                                        this.f9471a |= 4;
                                    } else if (tag == 34) {
                                        this.f9475e = codedInputStream.readStringRequireUtf8();
                                        this.f9471a |= 8;
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
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7249b mergeFrom(Message message) {
                    if (message instanceof FileInfo) {
                        return m8748o((FileInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7249b m8748o(FileInfo fileInfo) {
                    if (fileInfo == FileInfo.m8729h()) {
                        return this;
                    }
                    if (!fileInfo.getName().isEmpty()) {
                        this.f9472b = fileInfo.f9466a;
                        this.f9471a |= 1;
                        onChanged();
                    }
                    if (fileInfo.getWidth() != 0) {
                        m8756w(fileInfo.getWidth());
                    }
                    if (fileInfo.getHeight() != 0) {
                        m8751r(fileInfo.getHeight());
                    }
                    if (!fileInfo.m8732j().isEmpty()) {
                        this.f9475e = fileInfo.f9469d;
                        this.f9471a |= 8;
                        onChanged();
                    }
                    mergeUnknownFields(fileInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7249b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7249b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7249b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7249b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C7249b m8751r(int i10) {
                    this.f9474d = i10;
                    this.f9471a |= 4;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C7249b m8752s(String str) {
                    str.getClass();
                    this.f9472b = str;
                    this.f9471a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C7249b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7249b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C7249b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7249b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: v */
                public C7249b m8755v(String str) {
                    str.getClass();
                    this.f9475e = str;
                    this.f9471a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: w */
                public C7249b m8756w(int i10) {
                    this.f9473c = i10;
                    this.f9471a |= 2;
                    onChanged();
                    return this;
                }

                public C7249b() {
                    this.f9472b = "";
                    this.f9475e = "";
                }

                public C7249b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9472b = "";
                    this.f9475e = "";
                }
            }

            public FileInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9466a = "";
                this.f9467b = 0;
                this.f9468c = 0;
                this.f9469d = "";
                this.f9470e = (byte) -1;
            }

            private FileInfo() {
                this.f9466a = "";
                this.f9467b = 0;
                this.f9468c = 0;
                this.f9469d = "";
                this.f9470e = (byte) -1;
                this.f9466a = "";
                this.f9469d = "";
            }
        }

        /* renamed from: com.zykj.board.EzySource$FileSource$a */
        public class C7250a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FileSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7251b c7251bM8715i = FileSource.m8715i();
                try {
                    c7251bM8715i.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7251bM8715i.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7251bM8715i.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7251bM8715i.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7251bM8715i.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static FileSource m8714d() {
            return f9460c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9443i;
        }

        /* renamed from: i */
        public static C7251b m8715i() {
            return f9460c.toBuilder();
        }

        /* renamed from: l */
        public static FileSource m8716l(InputStream inputStream) {
            return (FileSource) GeneratedMessageV3.parseWithIOException(f9461d, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public FileSource getDefaultInstanceForType() {
            return f9460c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileSource)) {
                return super.equals(obj);
            }
            FileSource fileSource = (FileSource) obj;
            return m8719h().equals(fileSource.m8719h()) && getUnknownFields().equals(fileSource.getUnknownFields());
        }

        /* renamed from: g */
        public int m8718g() {
            return this.f9462a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9461d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f9462a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9462a.get(i11));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        /* renamed from: h */
        public List m8719h() {
            return this.f9462a;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8718g() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8719h().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9444j.ensureFieldAccessorsInitialized(FileSource.class, C7251b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9463b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9463b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C7251b newBuilderForType() {
            return m8715i();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7251b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7251b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C7251b toBuilder() {
            return this == f9460c ? new C7251b() : new C7251b().m8774t(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FileSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f9462a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9462a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$FileSource$b */
        public static final class C7251b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9476a;

            /* renamed from: b */
            public List f9477b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9478c;

            /* renamed from: c */
            public C7251b m8758c(FileInfo.C7249b c7249b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9478c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7249b.build());
                    return this;
                }
                m8768n();
                this.f9477b.add(c7249b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public C7251b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7251b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public FileSource build() {
                FileSource fileSourceBuildPartial = buildPartial();
                if (fileSourceBuildPartial.isInitialized()) {
                    return fileSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public FileSource buildPartial() {
                FileSource fileSource = new FileSource(this);
                m8763i(fileSource);
                if (this.f9476a != 0) {
                    m8762h(fileSource);
                }
                onBuilt();
                return fileSource;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9443i;
            }

            /* renamed from: h */
            public final void m8762h(FileSource fileSource) {
            }

            /* renamed from: i */
            public final void m8763i(FileSource fileSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9478c;
                if (repeatedFieldBuilderV3 != null) {
                    fileSource.f9462a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9476a & 1) != 0) {
                    this.f9477b = Collections.unmodifiableList(this.f9477b);
                    this.f9476a &= -2;
                }
                fileSource.f9462a = this.f9477b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9444j.ensureFieldAccessorsInitialized(FileSource.class, C7251b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7251b clear() {
                super.clear();
                this.f9476a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9478c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9477b = Collections.EMPTY_LIST;
                } else {
                    this.f9477b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9476a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7251b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7251b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7251b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7251b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7251b mo27381clone() {
                return (C7251b) super.mo27381clone();
            }

            /* renamed from: n */
            public final void m8768n() {
                if ((this.f9476a & 1) == 0) {
                    this.f9477b = new ArrayList(this.f9477b);
                    this.f9476a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public FileSource getDefaultInstanceForType() {
                return FileSource.m8714d();
            }

            /* renamed from: p */
            public int m8770p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9478c;
                return repeatedFieldBuilderV3 == null ? this.f9477b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m8771q() {
                if (this.f9478c == null) {
                    this.f9478c = new RepeatedFieldBuilderV3(this.f9477b, (this.f9476a & 1) != 0, getParentForChildren(), isClean());
                    this.f9477b = null;
                }
                return this.f9478c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7251b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    FileInfo fileInfo = (FileInfo) codedInputStream.readMessage(FileInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9478c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8768n();
                                        this.f9477b.add(fileInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(fileInfo);
                                    }
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
            public C7251b mergeFrom(Message message) {
                if (message instanceof FileSource) {
                    return m8774t((FileSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7251b m8774t(FileSource fileSource) {
                if (fileSource == FileSource.m8714d()) {
                    return this;
                }
                if (this.f9478c == null) {
                    if (!fileSource.f9462a.isEmpty()) {
                        if (this.f9477b.isEmpty()) {
                            this.f9477b = fileSource.f9462a;
                            this.f9476a &= -2;
                        } else {
                            m8768n();
                            this.f9477b.addAll(fileSource.f9462a);
                        }
                        onChanged();
                    }
                } else if (!fileSource.f9462a.isEmpty()) {
                    if (this.f9478c.isEmpty()) {
                        this.f9478c.dispose();
                        this.f9478c = null;
                        this.f9477b = fileSource.f9462a;
                        this.f9476a &= -2;
                        this.f9478c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8771q() : null;
                    } else {
                        this.f9478c.addAllMessages(fileSource.f9462a);
                    }
                }
                mergeUnknownFields(fileSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7251b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7251b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7251b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7251b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7251b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7251b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7251b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7251b) super.setUnknownFields(unknownFieldSet);
            }

            public C7251b() {
                this.f9477b = Collections.EMPTY_LIST;
            }

            public C7251b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9477b = Collections.EMPTY_LIST;
            }
        }

        public FileSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9463b = (byte) -1;
        }

        private FileSource() {
            this.f9463b = (byte) -1;
            this.f9462a = Collections.EMPTY_LIST;
        }
    }

    public static final class GeometrySource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final GeometrySource f9479c = new GeometrySource();

        /* renamed from: d */
        public static final Parser f9480d = new C7254a();

        /* renamed from: a */
        public List f9481a;

        /* renamed from: b */
        public byte f9482b;

        public static final class GeometryInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final GeometryInfo f9483f = new GeometryInfo();

            /* renamed from: g */
            public static final Parser f9484g = new C7252a();

            /* renamed from: a */
            public int f9485a;

            /* renamed from: b */
            public int f9486b;

            /* renamed from: c */
            public List f9487c;

            /* renamed from: d */
            public EzyPaint.Paint f9488d;

            /* renamed from: e */
            public byte f9489e;

            /* renamed from: com.zykj.board.EzySource$GeometrySource$GeometryInfo$a */
            public class C7252a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public GeometryInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7253b c7253bM8800q = GeometryInfo.m8800q();
                    try {
                        c7253bM8800q.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7253bM8800q.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7253bM8800q.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7253bM8800q.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7253bM8800q.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9457w;
            }

            /* renamed from: h */
            public static /* synthetic */ int m8797h(GeometryInfo geometryInfo, int i10) {
                int i11 = i10 | geometryInfo.f9485a;
                geometryInfo.f9485a = i11;
                return i11;
            }

            /* renamed from: j */
            public static GeometryInfo m8799j() {
                return f9483f;
            }

            public static Parser parser() {
                return f9484g;
            }

            /* renamed from: q */
            public static C7253b m8800q() {
                return f9483f.toBuilder();
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GeometryInfo)) {
                    return super.equals(obj);
                }
                GeometryInfo geometryInfo = (GeometryInfo) obj;
                if (this.f9486b == geometryInfo.f9486b && m8805o().equals(geometryInfo.m8805o()) && m8806p() == geometryInfo.m8806p()) {
                    return (!m8806p() || m8803m().equals(geometryInfo.m8803m())) && getUnknownFields().equals(geometryInfo.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9484g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = this.f9486b != EzyGeometryEnum.GeometryEnum.OVAL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f9486b) : 0;
                for (int i11 = 0; i11 < this.f9487c.size(); i11++) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f9487c.get(i11));
                }
                if ((this.f9485a & 1) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(3, m8803m());
                }
                int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f9486b;
                if (m8804n() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m8805o().hashCode();
                }
                if (m8806p()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + m8803m().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9458x.ensureFieldAccessorsInitialized(GeometryInfo.class, C7253b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9489e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9489e = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public GeometryInfo getDefaultInstanceForType() {
                return f9483f;
            }

            /* renamed from: l */
            public int m8802l() {
                return this.f9486b;
            }

            /* renamed from: m */
            public EzyPaint.Paint m8803m() {
                EzyPaint.Paint paint = this.f9488d;
                return paint == null ? EzyPaint.Paint.m8473h() : paint;
            }

            /* renamed from: n */
            public int m8804n() {
                return this.f9487c.size();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new GeometryInfo();
            }

            /* renamed from: o */
            public List m8805o() {
                return this.f9487c;
            }

            /* renamed from: p */
            public boolean m8806p() {
                return (this.f9485a & 1) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7253b newBuilderForType() {
                return m8800q();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7253b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7253b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7253b toBuilder() {
                return this == f9483f ? new C7253b() : new C7253b().m8832v(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (this.f9486b != EzyGeometryEnum.GeometryEnum.OVAL.getNumber()) {
                    codedOutputStream.writeEnum(1, this.f9486b);
                }
                for (int i10 = 0; i10 < this.f9487c.size(); i10++) {
                    codedOutputStream.writeMessage(2, (MessageLite) this.f9487c.get(i10));
                }
                if ((this.f9485a & 1) != 0) {
                    codedOutputStream.writeMessage(3, m8803m());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$GeometrySource$GeometryInfo$b */
            public static final class C7253b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9490a;

                /* renamed from: b */
                public int f9491b;

                /* renamed from: c */
                public List f9492c;

                /* renamed from: d */
                public RepeatedFieldBuilderV3 f9493d;

                /* renamed from: e */
                public EzyPaint.Paint f9494e;

                /* renamed from: f */
                public SingleFieldBuilderV3 f9495f;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        m8813s();
                        m8812r();
                    }
                }

                /* renamed from: n */
                private void m8811n() {
                    if ((this.f9490a & 2) == 0) {
                        this.f9492c = new ArrayList(this.f9492c);
                        this.f9490a |= 2;
                    }
                }

                /* renamed from: r */
                private SingleFieldBuilderV3 m8812r() {
                    if (this.f9495f == null) {
                        this.f9495f = new SingleFieldBuilderV3(m8828p(), getParentForChildren(), isClean());
                        this.f9494e = null;
                    }
                    return this.f9495f;
                }

                /* renamed from: s */
                private RepeatedFieldBuilderV3 m8813s() {
                    if (this.f9493d == null) {
                        this.f9493d = new RepeatedFieldBuilderV3(this.f9492c, (this.f9490a & 2) != 0, getParentForChildren(), isClean());
                        this.f9492c = null;
                    }
                    return this.f9493d;
                }

                /* renamed from: A */
                public C7253b m8814A(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9495f;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f9494e = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f9490a |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                public C7253b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7253b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public final C7253b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7253b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: c */
                public C7253b m8817c(EzyPointF.PointF pointF) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9493d;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointF);
                        return this;
                    }
                    pointF.getClass();
                    m8811n();
                    this.f9492c.add(pointF);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public C7253b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7253b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public GeometryInfo build() {
                    GeometryInfo geometryInfoBuildPartial = buildPartial();
                    if (geometryInfoBuildPartial.isInitialized()) {
                        return geometryInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometryInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public GeometryInfo buildPartial() {
                    GeometryInfo geometryInfo = new GeometryInfo(this);
                    m8822i(geometryInfo);
                    if (this.f9490a != 0) {
                        m8821h(geometryInfo);
                    }
                    onBuilt();
                    return geometryInfo;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9457w;
                }

                /* renamed from: h */
                public final void m8821h(GeometryInfo geometryInfo) {
                    int i10;
                    int i11 = this.f9490a;
                    if ((i11 & 1) != 0) {
                        geometryInfo.f9486b = this.f9491b;
                    }
                    if ((i11 & 4) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9495f;
                        geometryInfo.f9488d = singleFieldBuilderV3 == null ? this.f9494e : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    GeometryInfo.m8797h(geometryInfo, i10);
                }

                /* renamed from: i */
                public final void m8822i(GeometryInfo geometryInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9493d;
                    if (repeatedFieldBuilderV3 != null) {
                        geometryInfo.f9487c = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f9490a & 2) != 0) {
                        this.f9492c = Collections.unmodifiableList(this.f9492c);
                        this.f9490a &= -3;
                    }
                    geometryInfo.f9487c = this.f9492c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9458x.ensureFieldAccessorsInitialized(GeometryInfo.class, C7253b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7253b clear() {
                    super.clear();
                    this.f9490a = 0;
                    this.f9491b = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9493d;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f9492c = Collections.EMPTY_LIST;
                    } else {
                        this.f9492c = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f9490a &= -3;
                    this.f9494e = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9495f;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f9495f = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7253b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7253b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7253b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7253b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7253b mo27381clone() {
                    return (C7253b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public GeometryInfo getDefaultInstanceForType() {
                    return GeometryInfo.m8799j();
                }

                /* renamed from: p */
                public EzyPaint.Paint m8828p() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9495f;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f9494e;
                    return paint == null ? EzyPaint.Paint.m8473h() : paint;
                }

                /* renamed from: q */
                public EzyPaint.Paint.C7233b m8829q() {
                    this.f9490a |= 4;
                    onChanged();
                    return (EzyPaint.Paint.C7233b) m8812r().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C7253b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f9491b = codedInputStream.readEnum();
                                        this.f9490a |= 1;
                                    } else if (tag == 18) {
                                        EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9493d;
                                        if (repeatedFieldBuilderV3 == null) {
                                            m8811n();
                                            this.f9492c.add(pointF);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(pointF);
                                        }
                                    } else if (tag == 26) {
                                        codedInputStream.readMessage(m8812r().getBuilder(), extensionRegistryLite);
                                        this.f9490a |= 4;
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
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C7253b mergeFrom(Message message) {
                    if (message instanceof GeometryInfo) {
                        return m8832v((GeometryInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: v */
                public C7253b m8832v(GeometryInfo geometryInfo) {
                    if (geometryInfo == GeometryInfo.m8799j()) {
                        return this;
                    }
                    if (geometryInfo.f9486b != 0) {
                        m8836z(geometryInfo.m8802l());
                    }
                    if (this.f9493d == null) {
                        if (!geometryInfo.f9487c.isEmpty()) {
                            if (this.f9492c.isEmpty()) {
                                this.f9492c = geometryInfo.f9487c;
                                this.f9490a &= -3;
                            } else {
                                m8811n();
                                this.f9492c.addAll(geometryInfo.f9487c);
                            }
                            onChanged();
                        }
                    } else if (!geometryInfo.f9487c.isEmpty()) {
                        if (this.f9493d.isEmpty()) {
                            this.f9493d.dispose();
                            this.f9493d = null;
                            this.f9492c = geometryInfo.f9487c;
                            this.f9490a &= -3;
                            this.f9493d = GeneratedMessageV3.alwaysUseFieldBuilders ? m8813s() : null;
                        } else {
                            this.f9493d.addAllMessages(geometryInfo.f9487c);
                        }
                    }
                    if (geometryInfo.m8806p()) {
                        m8833w(geometryInfo.m8803m());
                    }
                    mergeUnknownFields(geometryInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: w */
                public C7253b m8833w(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9495f;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f9490a & 4) == 0 || (paint2 = this.f9494e) == null || paint2 == EzyPaint.Paint.m8473h()) {
                        this.f9494e = paint;
                    } else {
                        m8829q().m8495o(paint);
                    }
                    if (this.f9494e != null) {
                        this.f9490a |= 4;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public final C7253b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7253b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C7253b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7253b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: z */
                public C7253b m8836z(int i10) {
                    this.f9491b = i10;
                    this.f9490a |= 1;
                    onChanged();
                    return this;
                }

                public C7253b() {
                    this.f9491b = 0;
                    this.f9492c = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public C7253b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9491b = 0;
                    this.f9492c = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }
            }

            public GeometryInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9486b = 0;
                this.f9489e = (byte) -1;
            }

            private GeometryInfo() {
                this.f9489e = (byte) -1;
                this.f9486b = 0;
                this.f9487c = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$GeometrySource$a */
        public class C7254a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public GeometrySource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7255b c7255bM8783i = GeometrySource.m8783i();
                try {
                    c7255bM8783i.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7255bM8783i.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7255bM8783i.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7255bM8783i.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7255bM8783i.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static GeometrySource m8782d() {
            return f9479c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9455u;
        }

        /* renamed from: i */
        public static C7255b m8783i() {
            return f9479c.toBuilder();
        }

        /* renamed from: l */
        public static GeometrySource m8784l(InputStream inputStream) {
            return (GeometrySource) GeneratedMessageV3.parseWithIOException(f9480d, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public GeometrySource getDefaultInstanceForType() {
            return f9479c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GeometrySource)) {
                return super.equals(obj);
            }
            GeometrySource geometrySource = (GeometrySource) obj;
            return m8787h().equals(geometrySource.m8787h()) && getUnknownFields().equals(geometrySource.getUnknownFields());
        }

        /* renamed from: g */
        public int m8786g() {
            return this.f9481a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9480d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f9481a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9481a.get(i11));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        /* renamed from: h */
        public List m8787h() {
            return this.f9481a;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8786g() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8787h().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9456v.ensureFieldAccessorsInitialized(GeometrySource.class, C7255b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9482b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9482b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C7255b newBuilderForType() {
            return m8783i();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7255b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7255b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C7255b toBuilder() {
            return this == f9479c ? new C7255b() : new C7255b().m8854t(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GeometrySource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f9481a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9481a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$GeometrySource$b */
        public static final class C7255b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9496a;

            /* renamed from: b */
            public List f9497b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9498c;

            /* renamed from: c */
            public C7255b m8838c(GeometryInfo.C7253b c7253b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9498c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7253b.build());
                    return this;
                }
                m8848n();
                this.f9497b.add(c7253b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public C7255b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7255b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public GeometrySource build() {
                GeometrySource geometrySourceBuildPartial = buildPartial();
                if (geometrySourceBuildPartial.isInitialized()) {
                    return geometrySourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometrySourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public GeometrySource buildPartial() {
                GeometrySource geometrySource = new GeometrySource(this);
                m8843i(geometrySource);
                if (this.f9496a != 0) {
                    m8842h(geometrySource);
                }
                onBuilt();
                return geometrySource;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9455u;
            }

            /* renamed from: h */
            public final void m8842h(GeometrySource geometrySource) {
            }

            /* renamed from: i */
            public final void m8843i(GeometrySource geometrySource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9498c;
                if (repeatedFieldBuilderV3 != null) {
                    geometrySource.f9481a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9496a & 1) != 0) {
                    this.f9497b = Collections.unmodifiableList(this.f9497b);
                    this.f9496a &= -2;
                }
                geometrySource.f9481a = this.f9497b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9456v.ensureFieldAccessorsInitialized(GeometrySource.class, C7255b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7255b clear() {
                super.clear();
                this.f9496a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9498c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9497b = Collections.EMPTY_LIST;
                } else {
                    this.f9497b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9496a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7255b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7255b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7255b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7255b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7255b mo27381clone() {
                return (C7255b) super.mo27381clone();
            }

            /* renamed from: n */
            public final void m8848n() {
                if ((this.f9496a & 1) == 0) {
                    this.f9497b = new ArrayList(this.f9497b);
                    this.f9496a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public GeometrySource getDefaultInstanceForType() {
                return GeometrySource.m8782d();
            }

            /* renamed from: p */
            public int m8850p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9498c;
                return repeatedFieldBuilderV3 == null ? this.f9497b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m8851q() {
                if (this.f9498c == null) {
                    this.f9498c = new RepeatedFieldBuilderV3(this.f9497b, (this.f9496a & 1) != 0, getParentForChildren(), isClean());
                    this.f9497b = null;
                }
                return this.f9498c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7255b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    GeometryInfo geometryInfo = (GeometryInfo) codedInputStream.readMessage(GeometryInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9498c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8848n();
                                        this.f9497b.add(geometryInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(geometryInfo);
                                    }
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
            public C7255b mergeFrom(Message message) {
                if (message instanceof GeometrySource) {
                    return m8854t((GeometrySource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7255b m8854t(GeometrySource geometrySource) {
                if (geometrySource == GeometrySource.m8782d()) {
                    return this;
                }
                if (this.f9498c == null) {
                    if (!geometrySource.f9481a.isEmpty()) {
                        if (this.f9497b.isEmpty()) {
                            this.f9497b = geometrySource.f9481a;
                            this.f9496a &= -2;
                        } else {
                            m8848n();
                            this.f9497b.addAll(geometrySource.f9481a);
                        }
                        onChanged();
                    }
                } else if (!geometrySource.f9481a.isEmpty()) {
                    if (this.f9498c.isEmpty()) {
                        this.f9498c.dispose();
                        this.f9498c = null;
                        this.f9497b = geometrySource.f9481a;
                        this.f9496a &= -2;
                        this.f9498c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8851q() : null;
                    } else {
                        this.f9498c.addAllMessages(geometrySource.f9481a);
                    }
                }
                mergeUnknownFields(geometrySource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7255b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7255b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7255b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7255b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7255b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7255b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7255b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7255b) super.setUnknownFields(unknownFieldSet);
            }

            public C7255b() {
                this.f9497b = Collections.EMPTY_LIST;
            }

            public C7255b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9497b = Collections.EMPTY_LIST;
            }
        }

        public GeometrySource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9482b = (byte) -1;
        }

        private GeometrySource() {
            this.f9482b = (byte) -1;
            this.f9481a = Collections.EMPTY_LIST;
        }
    }

    public static final class MatrixSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final MatrixSource f9499c = new MatrixSource();

        /* renamed from: d */
        public static final Parser f9500d = new C7258a();

        /* renamed from: a */
        public List f9501a;

        /* renamed from: b */
        public byte f9502b;

        public static final class MatrixInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: c */
            public static final MatrixInfo f9503c = new MatrixInfo();

            /* renamed from: d */
            public static final Parser f9504d = new C7256a();

            /* renamed from: a */
            public List f9505a;

            /* renamed from: b */
            public byte f9506b;

            /* renamed from: com.zykj.board.EzySource$MatrixSource$MatrixInfo$a */
            public class C7256a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public MatrixInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7257b c7257bM8874g = MatrixInfo.m8874g();
                    try {
                        c7257bM8874g.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7257bM8874g.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7257bM8874g.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7257bM8874g.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7257bM8874g.buildPartial());
                    }
                }
            }

            /* renamed from: d */
            public static MatrixInfo m8873d() {
                return f9503c;
            }

            /* renamed from: g */
            public static C7257b m8874g() {
                return f9503c.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9441g;
            }

            public static Parser parser() {
                return f9504d;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public MatrixInfo getDefaultInstanceForType() {
                return f9503c;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MatrixInfo)) {
                    return super.equals(obj);
                }
                MatrixInfo matrixInfo = (MatrixInfo) obj;
                return getMatrixList().equals(matrixInfo.getMatrixList()) && getUnknownFields().equals(matrixInfo.getUnknownFields());
            }

            public int getMatrixCount() {
                return this.f9505a.size();
            }

            public List getMatrixList() {
                return this.f9505a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9504d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeMessageSize = 0;
                for (int i11 = 0; i11 < this.f9505a.size(); i11++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9505a.get(i11));
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7257b newBuilderForType() {
                return m8874g();
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getMatrixCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getMatrixList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7257b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7257b(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9442h.ensureFieldAccessorsInitialized(MatrixInfo.class, C7257b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9506b;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9506b = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7257b toBuilder() {
                return this == f9503c ? new C7257b() : new C7257b().m8895s(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new MatrixInfo();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                for (int i10 = 0; i10 < this.f9505a.size(); i10++) {
                    codedOutputStream.writeMessage(1, (MessageLite) this.f9505a.get(i10));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$MatrixSource$MatrixInfo$b */
            public static final class C7257b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9507a;

                /* renamed from: b */
                public List f9508b;

                /* renamed from: c */
                public RepeatedFieldBuilderV3 f9509c;

                /* renamed from: c */
                public C7257b m8880c(EzyMatrix.Matrix.C7219b c7219b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9509c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c7219b.build());
                        return this;
                    }
                    ensureMatrixIsMutable();
                    this.f9508b.add(c7219b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: e */
                public C7257b m8881e(EzyMatrix.Matrix matrix) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9509c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(matrix);
                        return this;
                    }
                    matrix.getClass();
                    ensureMatrixIsMutable();
                    this.f9508b.add(matrix);
                    onChanged();
                    return this;
                }

                public final void ensureMatrixIsMutable() {
                    if ((this.f9507a & 1) == 0) {
                        this.f9508b = new ArrayList(this.f9508b);
                        this.f9507a |= 1;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C7257b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7257b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public MatrixInfo build() {
                    MatrixInfo matrixInfoBuildPartial = buildPartial();
                    if (matrixInfoBuildPartial.isInitialized()) {
                        return matrixInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixInfoBuildPartial);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9441g;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public MatrixInfo buildPartial() {
                    MatrixInfo matrixInfo = new MatrixInfo(this);
                    m8886j(matrixInfo);
                    if (this.f9507a != 0) {
                        m8885i(matrixInfo);
                    }
                    onBuilt();
                    return matrixInfo;
                }

                /* renamed from: i */
                public final void m8885i(MatrixInfo matrixInfo) {
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9442h.ensureFieldAccessorsInitialized(MatrixInfo.class, C7257b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                /* renamed from: j */
                public final void m8886j(MatrixInfo matrixInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9509c;
                    if (repeatedFieldBuilderV3 != null) {
                        matrixInfo.f9505a = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f9507a & 1) != 0) {
                        this.f9508b = Collections.unmodifiableList(this.f9508b);
                        this.f9507a &= -2;
                    }
                    matrixInfo.f9505a = this.f9508b;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7257b clear() {
                    super.clear();
                    this.f9507a = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9509c;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f9508b = Collections.EMPTY_LIST;
                    } else {
                        this.f9508b = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f9507a &= -2;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7257b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7257b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7257b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7257b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7257b mo27381clone() {
                    return (C7257b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public MatrixInfo getDefaultInstanceForType() {
                    return MatrixInfo.m8873d();
                }

                /* renamed from: p */
                public final RepeatedFieldBuilderV3 m8892p() {
                    if (this.f9509c == null) {
                        this.f9509c = new RepeatedFieldBuilderV3(this.f9508b, (this.f9507a & 1) != 0, getParentForChildren(), isClean());
                        this.f9508b = null;
                    }
                    return this.f9509c;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7257b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        EzyMatrix.Matrix matrix = (EzyMatrix.Matrix) codedInputStream.readMessage(EzyMatrix.Matrix.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9509c;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureMatrixIsMutable();
                                            this.f9508b.add(matrix);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(matrix);
                                        }
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
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C7257b mergeFrom(Message message) {
                    if (message instanceof MatrixInfo) {
                        return m8895s((MatrixInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: s */
                public C7257b m8895s(MatrixInfo matrixInfo) {
                    if (matrixInfo == MatrixInfo.m8873d()) {
                        return this;
                    }
                    if (this.f9509c == null) {
                        if (!matrixInfo.f9505a.isEmpty()) {
                            if (this.f9508b.isEmpty()) {
                                this.f9508b = matrixInfo.f9505a;
                                this.f9507a &= -2;
                            } else {
                                ensureMatrixIsMutable();
                                this.f9508b.addAll(matrixInfo.f9505a);
                            }
                            onChanged();
                        }
                    } else if (!matrixInfo.f9505a.isEmpty()) {
                        if (this.f9509c.isEmpty()) {
                            this.f9509c.dispose();
                            this.f9509c = null;
                            this.f9508b = matrixInfo.f9505a;
                            this.f9507a &= -2;
                            this.f9509c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8892p() : null;
                        } else {
                            this.f9509c.addAllMessages(matrixInfo.f9505a);
                        }
                    }
                    mergeUnknownFields(matrixInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C7257b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7257b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C7257b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7257b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C7257b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7257b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public final C7257b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7257b) super.setUnknownFields(unknownFieldSet);
                }

                public C7257b() {
                    this.f9508b = Collections.EMPTY_LIST;
                }

                public C7257b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9508b = Collections.EMPTY_LIST;
                }
            }

            public MatrixInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9506b = (byte) -1;
            }

            private MatrixInfo() {
                this.f9506b = (byte) -1;
                this.f9505a = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$MatrixSource$a */
        public class C7258a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MatrixSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7259b c7259bM8862h = MatrixSource.m8862h();
                try {
                    c7259bM8862h.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7259bM8862h.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7259bM8862h.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7259bM8862h.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7259bM8862h.buildPartial());
                }
            }
        }

        /* renamed from: c */
        public static MatrixSource m8861c() {
            return f9499c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9439e;
        }

        /* renamed from: h */
        public static C7259b m8862h() {
            return f9499c.toBuilder();
        }

        /* renamed from: k */
        public static MatrixSource m8863k(InputStream inputStream) {
            return (MatrixSource) GeneratedMessageV3.parseWithIOException(f9500d, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public MatrixSource getDefaultInstanceForType() {
            return f9499c;
        }

        /* renamed from: e */
        public int m8865e() {
            return this.f9501a.size();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatrixSource)) {
                return super.equals(obj);
            }
            MatrixSource matrixSource = (MatrixSource) obj;
            return m8866g().equals(matrixSource.m8866g()) && getUnknownFields().equals(matrixSource.getUnknownFields());
        }

        /* renamed from: g */
        public List m8866g() {
            return this.f9501a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9500d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f9501a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9501a.get(i11));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8865e() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8866g().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C7259b newBuilderForType() {
            return m8862h();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9440f.ensureFieldAccessorsInitialized(MatrixSource.class, C7259b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9502b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9502b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C7259b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7259b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public C7259b toBuilder() {
            return this == f9499c ? new C7259b() : new C7259b().m8917t(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MatrixSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f9501a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9501a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$MatrixSource$b */
        public static final class C7259b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9510a;

            /* renamed from: b */
            public List f9511b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9512c;

            /* renamed from: c */
            public C7259b m8901c(MatrixInfo matrixInfo) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9512c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(matrixInfo);
                    return this;
                }
                matrixInfo.getClass();
                m8911n();
                this.f9511b.add(matrixInfo);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public C7259b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7259b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public MatrixSource build() {
                MatrixSource matrixSourceBuildPartial = buildPartial();
                if (matrixSourceBuildPartial.isInitialized()) {
                    return matrixSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public MatrixSource buildPartial() {
                MatrixSource matrixSource = new MatrixSource(this);
                m8906i(matrixSource);
                if (this.f9510a != 0) {
                    m8905h(matrixSource);
                }
                onBuilt();
                return matrixSource;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9439e;
            }

            /* renamed from: h */
            public final void m8905h(MatrixSource matrixSource) {
            }

            /* renamed from: i */
            public final void m8906i(MatrixSource matrixSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9512c;
                if (repeatedFieldBuilderV3 != null) {
                    matrixSource.f9501a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9510a & 1) != 0) {
                    this.f9511b = Collections.unmodifiableList(this.f9511b);
                    this.f9510a &= -2;
                }
                matrixSource.f9501a = this.f9511b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9440f.ensureFieldAccessorsInitialized(MatrixSource.class, C7259b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7259b clear() {
                super.clear();
                this.f9510a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9512c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9511b = Collections.EMPTY_LIST;
                } else {
                    this.f9511b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9510a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7259b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7259b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7259b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7259b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7259b mo27381clone() {
                return (C7259b) super.mo27381clone();
            }

            /* renamed from: n */
            public final void m8911n() {
                if ((this.f9510a & 1) == 0) {
                    this.f9511b = new ArrayList(this.f9511b);
                    this.f9510a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public MatrixSource getDefaultInstanceForType() {
                return MatrixSource.m8861c();
            }

            /* renamed from: p */
            public int m8913p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9512c;
                return repeatedFieldBuilderV3 == null ? this.f9511b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m8914q() {
                if (this.f9512c == null) {
                    this.f9512c = new RepeatedFieldBuilderV3(this.f9511b, (this.f9510a & 1) != 0, getParentForChildren(), isClean());
                    this.f9511b = null;
                }
                return this.f9512c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7259b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    MatrixInfo matrixInfo = (MatrixInfo) codedInputStream.readMessage(MatrixInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9512c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8911n();
                                        this.f9511b.add(matrixInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(matrixInfo);
                                    }
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
            public C7259b mergeFrom(Message message) {
                if (message instanceof MatrixSource) {
                    return m8917t((MatrixSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7259b m8917t(MatrixSource matrixSource) {
                if (matrixSource == MatrixSource.m8861c()) {
                    return this;
                }
                if (this.f9512c == null) {
                    if (!matrixSource.f9501a.isEmpty()) {
                        if (this.f9511b.isEmpty()) {
                            this.f9511b = matrixSource.f9501a;
                            this.f9510a &= -2;
                        } else {
                            m8911n();
                            this.f9511b.addAll(matrixSource.f9501a);
                        }
                        onChanged();
                    }
                } else if (!matrixSource.f9501a.isEmpty()) {
                    if (this.f9512c.isEmpty()) {
                        this.f9512c.dispose();
                        this.f9512c = null;
                        this.f9511b = matrixSource.f9501a;
                        this.f9510a &= -2;
                        this.f9512c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8914q() : null;
                    } else {
                        this.f9512c.addAllMessages(matrixSource.f9501a);
                    }
                }
                mergeUnknownFields(matrixSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7259b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7259b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7259b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7259b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7259b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7259b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7259b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7259b) super.setUnknownFields(unknownFieldSet);
            }

            public C7259b() {
                this.f9511b = Collections.EMPTY_LIST;
            }

            public C7259b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9511b = Collections.EMPTY_LIST;
            }
        }

        public MatrixSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9502b = (byte) -1;
        }

        private MatrixSource() {
            this.f9502b = (byte) -1;
            this.f9501a = Collections.EMPTY_LIST;
        }
    }

    public static final class TextSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final TextSource f9513c = new TextSource();

        /* renamed from: d */
        public static final Parser f9514d = new C7262a();

        /* renamed from: a */
        public List f9515a;

        /* renamed from: b */
        public byte f9516b;

        public static final class TextInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: e */
            public static final TextInfo f9517e = new TextInfo();

            /* renamed from: f */
            public static final Parser f9518f = new C7260a();

            /* renamed from: a */
            public int f9519a;

            /* renamed from: b */
            public volatile Object f9520b;

            /* renamed from: c */
            public EzyPaint.Paint f9521c;

            /* renamed from: d */
            public byte f9522d;

            /* renamed from: com.zykj.board.EzySource$TextSource$TextInfo$a */
            public class C7260a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TextInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7261b c7261bM8940k = TextInfo.m8940k();
                    try {
                        c7261bM8940k.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7261bM8940k.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7261bM8940k.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7261bM8940k.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7261bM8940k.buildPartial());
                    }
                }
            }

            /* renamed from: e */
            public static /* synthetic */ int m8938e(TextInfo textInfo, int i10) {
                int i11 = i10 | textInfo.f9519a;
                textInfo.f9519a = i11;
                return i11;
            }

            /* renamed from: g */
            public static TextInfo m8939g() {
                return f9517e;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9453s;
            }

            /* renamed from: k */
            public static C7261b m8940k() {
                return f9517e.toBuilder();
            }

            public static Parser parser() {
                return f9518f;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TextInfo)) {
                    return super.equals(obj);
                }
                TextInfo textInfo = (TextInfo) obj;
                if (getContent().equals(textInfo.getContent()) && m8943j() == textInfo.m8943j()) {
                    return (!m8943j() || m8942i().equals(textInfo.m8942i())) && getUnknownFields().equals(textInfo.getUnknownFields());
                }
                return false;
            }

            public String getContent() {
                Object obj = this.f9520b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9520b = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9518f;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9520b) ? GeneratedMessageV3.computeStringSize(1, this.f9520b) : 0;
                if ((1 & this.f9519a) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(2, m8942i());
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public TextInfo getDefaultInstanceForType() {
                return f9517e;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode();
                if (m8943j()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m8942i().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            /* renamed from: i */
            public EzyPaint.Paint m8942i() {
                EzyPaint.Paint paint = this.f9521c;
                return paint == null ? EzyPaint.Paint.m8473h() : paint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9454t.ensureFieldAccessorsInitialized(TextInfo.class, C7261b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9522d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9522d = (byte) 1;
                return true;
            }

            /* renamed from: j */
            public boolean m8943j() {
                return (this.f9519a & 1) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7261b newBuilderForType() {
                return m8940k();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7261b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7261b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7261b toBuilder() {
                return this == f9517e ? new C7261b() : new C7261b().m8962r(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new TextInfo();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessageV3.isStringEmpty(this.f9520b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9520b);
                }
                if ((this.f9519a & 1) != 0) {
                    codedOutputStream.writeMessage(2, m8942i());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$TextSource$TextInfo$b */
            public static final class C7261b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9523a;

                /* renamed from: b */
                public Object f9524b;

                /* renamed from: c */
                public EzyPaint.Paint f9525c;

                /* renamed from: d */
                public SingleFieldBuilderV3 f9526d;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        m8948o();
                    }
                }

                /* renamed from: o */
                private SingleFieldBuilderV3 m8948o() {
                    if (this.f9526d == null) {
                        this.f9526d = new SingleFieldBuilderV3(m8958m(), getParentForChildren(), isClean());
                        this.f9525c = null;
                    }
                    return this.f9526d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C7261b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7261b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public TextInfo build() {
                    TextInfo textInfoBuildPartial = buildPartial();
                    if (textInfoBuildPartial.isInitialized()) {
                        return textInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) textInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public TextInfo buildPartial() {
                    TextInfo textInfo = new TextInfo(this);
                    if (this.f9523a != 0) {
                        m8952g(textInfo);
                    }
                    onBuilt();
                    return textInfo;
                }

                /* renamed from: g */
                public final void m8952g(TextInfo textInfo) {
                    int i10;
                    int i11 = this.f9523a;
                    if ((i11 & 1) != 0) {
                        textInfo.f9520b = this.f9524b;
                    }
                    if ((i11 & 2) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9526d;
                        textInfo.f9521c = singleFieldBuilderV3 == null ? this.f9525c : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    TextInfo.m8938e(textInfo, i10);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9453s;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7261b clear() {
                    super.clear();
                    this.f9523a = 0;
                    this.f9524b = "";
                    this.f9525c = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9526d;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f9526d = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7261b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7261b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9454t.ensureFieldAccessorsInitialized(TextInfo.class, C7261b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7261b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7261b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7261b mo27381clone() {
                    return (C7261b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public TextInfo getDefaultInstanceForType() {
                    return TextInfo.m8939g();
                }

                /* renamed from: m */
                public EzyPaint.Paint m8958m() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9526d;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f9525c;
                    return paint == null ? EzyPaint.Paint.m8473h() : paint;
                }

                /* renamed from: n */
                public EzyPaint.Paint.C7233b m8959n() {
                    this.f9523a |= 2;
                    onChanged();
                    return (EzyPaint.Paint.C7233b) m8948o().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C7261b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f9524b = codedInputStream.readStringRequireUtf8();
                                        this.f9523a |= 1;
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(m8948o().getBuilder(), extensionRegistryLite);
                                        this.f9523a |= 2;
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
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7261b mergeFrom(Message message) {
                    if (message instanceof TextInfo) {
                        return m8962r((TextInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: r */
                public C7261b m8962r(TextInfo textInfo) {
                    if (textInfo == TextInfo.m8939g()) {
                        return this;
                    }
                    if (!textInfo.getContent().isEmpty()) {
                        this.f9524b = textInfo.f9520b;
                        this.f9523a |= 1;
                        onChanged();
                    }
                    if (textInfo.m8943j()) {
                        m8963s(textInfo.m8942i());
                    }
                    mergeUnknownFields(textInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C7261b m8963s(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9526d;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f9523a & 2) == 0 || (paint2 = this.f9525c) == null || paint2 == EzyPaint.Paint.m8473h()) {
                        this.f9525c = paint;
                    } else {
                        m8959n().m8495o(paint);
                    }
                    if (this.f9525c != null) {
                        this.f9523a |= 2;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C7261b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7261b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: u */
                public C7261b m8965u(String str) {
                    str.getClass();
                    this.f9524b = str;
                    this.f9523a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C7261b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7261b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: w */
                public C7261b m8967w(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9526d;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f9525c = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f9523a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7261b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7261b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public final C7261b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7261b) super.setUnknownFields(unknownFieldSet);
                }

                public C7261b() {
                    this.f9524b = "";
                    maybeForceBuilderInitialization();
                }

                public C7261b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9524b = "";
                    maybeForceBuilderInitialization();
                }
            }

            public TextInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9520b = "";
                this.f9522d = (byte) -1;
            }

            private TextInfo() {
                this.f9520b = "";
                this.f9522d = (byte) -1;
                this.f9520b = "";
            }
        }

        /* renamed from: com.zykj.board.EzySource$TextSource$a */
        public class C7262a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TextSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7263b c7263bM8926i = TextSource.m8926i();
                try {
                    c7263bM8926i.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7263bM8926i.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7263bM8926i.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7263bM8926i.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7263bM8926i.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static TextSource m8925d() {
            return f9513c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9451q;
        }

        /* renamed from: i */
        public static C7263b m8926i() {
            return f9513c.toBuilder();
        }

        /* renamed from: l */
        public static TextSource m8927l(InputStream inputStream) {
            return (TextSource) GeneratedMessageV3.parseWithIOException(f9514d, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public TextSource getDefaultInstanceForType() {
            return f9513c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextSource)) {
                return super.equals(obj);
            }
            TextSource textSource = (TextSource) obj;
            return m8930h().equals(textSource.m8930h()) && getUnknownFields().equals(textSource.getUnknownFields());
        }

        /* renamed from: g */
        public int m8929g() {
            return this.f9515a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9514d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f9515a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9515a.get(i11));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        /* renamed from: h */
        public List m8930h() {
            return this.f9515a;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8929g() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8930h().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9452r.ensureFieldAccessorsInitialized(TextSource.class, C7263b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9516b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9516b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C7263b newBuilderForType() {
            return m8926i();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7263b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7263b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C7263b toBuilder() {
            return this == f9513c ? new C7263b() : new C7263b().m8987t(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TextSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f9515a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9515a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$TextSource$b */
        public static final class C7263b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9527a;

            /* renamed from: b */
            public List f9528b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9529c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7263b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7263b) super.addRepeatedField(fieldDescriptor, obj);
            }

            /* renamed from: e */
            public C7263b m8972e(TextInfo.C7261b c7261b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9529c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7261b.build());
                    return this;
                }
                m8981n();
                this.f9528b.add(c7261b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TextSource build() {
                TextSource textSourceBuildPartial = buildPartial();
                if (textSourceBuildPartial.isInitialized()) {
                    return textSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) textSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public TextSource buildPartial() {
                TextSource textSource = new TextSource(this);
                m8976i(textSource);
                if (this.f9527a != 0) {
                    m8975h(textSource);
                }
                onBuilt();
                return textSource;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9451q;
            }

            /* renamed from: h */
            public final void m8975h(TextSource textSource) {
            }

            /* renamed from: i */
            public final void m8976i(TextSource textSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9529c;
                if (repeatedFieldBuilderV3 != null) {
                    textSource.f9515a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9527a & 1) != 0) {
                    this.f9528b = Collections.unmodifiableList(this.f9528b);
                    this.f9527a &= -2;
                }
                textSource.f9515a = this.f9528b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9452r.ensureFieldAccessorsInitialized(TextSource.class, C7263b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7263b clear() {
                super.clear();
                this.f9527a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9529c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9528b = Collections.EMPTY_LIST;
                } else {
                    this.f9528b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9527a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7263b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7263b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7263b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7263b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7263b mo27381clone() {
                return (C7263b) super.mo27381clone();
            }

            /* renamed from: n */
            public final void m8981n() {
                if ((this.f9527a & 1) == 0) {
                    this.f9528b = new ArrayList(this.f9528b);
                    this.f9527a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public TextSource getDefaultInstanceForType() {
                return TextSource.m8925d();
            }

            /* renamed from: p */
            public int m8983p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9529c;
                return repeatedFieldBuilderV3 == null ? this.f9528b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m8984q() {
                if (this.f9529c == null) {
                    this.f9529c = new RepeatedFieldBuilderV3(this.f9528b, (this.f9527a & 1) != 0, getParentForChildren(), isClean());
                    this.f9528b = null;
                }
                return this.f9529c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7263b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TextInfo textInfo = (TextInfo) codedInputStream.readMessage(TextInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9529c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8981n();
                                        this.f9528b.add(textInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(textInfo);
                                    }
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
            public C7263b mergeFrom(Message message) {
                if (message instanceof TextSource) {
                    return m8987t((TextSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7263b m8987t(TextSource textSource) {
                if (textSource == TextSource.m8925d()) {
                    return this;
                }
                if (this.f9529c == null) {
                    if (!textSource.f9515a.isEmpty()) {
                        if (this.f9528b.isEmpty()) {
                            this.f9528b = textSource.f9515a;
                            this.f9527a &= -2;
                        } else {
                            m8981n();
                            this.f9528b.addAll(textSource.f9515a);
                        }
                        onChanged();
                    }
                } else if (!textSource.f9515a.isEmpty()) {
                    if (this.f9529c.isEmpty()) {
                        this.f9529c.dispose();
                        this.f9529c = null;
                        this.f9528b = textSource.f9515a;
                        this.f9527a &= -2;
                        this.f9529c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8984q() : null;
                    } else {
                        this.f9529c.addAllMessages(textSource.f9515a);
                    }
                }
                mergeUnknownFields(textSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7263b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7263b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7263b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7263b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7263b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7263b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7263b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7263b) super.setUnknownFields(unknownFieldSet);
            }

            public C7263b() {
                this.f9528b = Collections.EMPTY_LIST;
            }

            public C7263b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9528b = Collections.EMPTY_LIST;
            }
        }

        public TextSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9516b = (byte) -1;
        }

        private TextSource() {
            this.f9516b = (byte) -1;
            this.f9515a = Collections.EMPTY_LIST;
        }
    }

    public static final class TouchSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final TouchSource f9530c = new TouchSource();

        /* renamed from: d */
        public static final Parser f9531d = new C7266a();

        /* renamed from: a */
        public List f9532a;

        /* renamed from: b */
        public byte f9533b;

        public static final class TouchInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: e */
            public static final TouchInfo f9534e = new TouchInfo();

            /* renamed from: f */
            public static final Parser f9535f = new C7264a();

            /* renamed from: a */
            public int f9536a;

            /* renamed from: b */
            public List f9537b;

            /* renamed from: c */
            public EzyPaint.Paint f9538c;

            /* renamed from: d */
            public byte f9539d;

            /* renamed from: com.zykj.board.EzySource$TouchSource$TouchInfo$a */
            public class C7264a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TouchInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7265b c7265bM9011l = TouchInfo.m9011l();
                    try {
                        c7265bM9011l.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7265bM9011l.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7265bM9011l.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7265bM9011l.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7265bM9011l.buildPartial());
                    }
                }
            }

            /* renamed from: a */
            public static /* synthetic */ int m9004a(TouchInfo touchInfo, int i10) {
                int i11 = i10 | touchInfo.f9536a;
                touchInfo.f9536a = i11;
                return i11;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9437c;
            }

            /* renamed from: h */
            public static TouchInfo m9010h() {
                return f9534e;
            }

            /* renamed from: l */
            public static C7265b m9011l() {
                return f9534e.toBuilder();
            }

            public static Parser parser() {
                return f9535f;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TouchInfo)) {
                    return super.equals(obj);
                }
                TouchInfo touchInfo = (TouchInfo) obj;
                if (getTouchEventList().equals(touchInfo.getTouchEventList()) && m9014k() == touchInfo.m9014k()) {
                    return (!m9014k() || m9013j().equals(touchInfo.m9013j())) && getUnknownFields().equals(touchInfo.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9535f;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeMessageSize = 0;
                for (int i11 = 0; i11 < this.f9537b.size(); i11++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9537b.get(i11));
                }
                if ((this.f9536a & 1) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m9013j());
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getTouchEventCount() {
                return this.f9537b.size();
            }

            public List getTouchEventList() {
                return this.f9537b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getTouchEventCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTouchEventList().hashCode();
                }
                if (m9014k()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m9013j().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public TouchInfo getDefaultInstanceForType() {
                return f9534e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9438d.ensureFieldAccessorsInitialized(TouchInfo.class, C7265b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9539d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9539d = (byte) 1;
                return true;
            }

            /* renamed from: j */
            public EzyPaint.Paint m9013j() {
                EzyPaint.Paint paint = this.f9538c;
                return paint == null ? EzyPaint.Paint.m8473h() : paint;
            }

            /* renamed from: k */
            public boolean m9014k() {
                return (this.f9536a & 1) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7265b newBuilderForType() {
                return m9011l();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7265b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7265b(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new TouchInfo();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public C7265b toBuilder() {
                return this == f9534e ? new C7265b() : new C7265b().m9037u(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                for (int i10 = 0; i10 < this.f9537b.size(); i10++) {
                    codedOutputStream.writeMessage(1, (MessageLite) this.f9537b.get(i10));
                }
                if ((this.f9536a & 1) != 0) {
                    codedOutputStream.writeMessage(2, m9013j());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$TouchSource$TouchInfo$b */
            public static final class C7265b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9540a;

                /* renamed from: b */
                public List f9541b;

                /* renamed from: c */
                public RepeatedFieldBuilderV3 f9542c;

                /* renamed from: d */
                public EzyPaint.Paint f9543d;

                /* renamed from: e */
                public SingleFieldBuilderV3 f9544e;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getTouchEventFieldBuilder();
                        m9019r();
                    }
                }

                /* renamed from: r */
                private SingleFieldBuilderV3 m9019r() {
                    if (this.f9544e == null) {
                        this.f9544e = new SingleFieldBuilderV3(m9033p(), getParentForChildren(), isClean());
                        this.f9543d = null;
                    }
                    return this.f9544e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public final C7265b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7265b) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C7265b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7265b) super.addRepeatedField(fieldDescriptor, obj);
                }

                /* renamed from: e */
                public C7265b m9022e(EzyTouchEvent.TouchEvent.C7274b c7274b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9542c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c7274b.build());
                        return this;
                    }
                    ensureTouchEventIsMutable();
                    this.f9541b.add(c7274b.build());
                    onChanged();
                    return this;
                }

                public final void ensureTouchEventIsMutable() {
                    if ((this.f9540a & 1) == 0) {
                        this.f9541b = new ArrayList(this.f9541b);
                        this.f9540a |= 1;
                    }
                }

                /* renamed from: f */
                public C7265b m9023f(EzyTouchEvent.TouchEvent touchEvent) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9542c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(touchEvent);
                        return this;
                    }
                    touchEvent.getClass();
                    ensureTouchEventIsMutable();
                    this.f9541b.add(touchEvent);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public TouchInfo build() {
                    TouchInfo touchInfoBuildPartial = buildPartial();
                    if (touchInfoBuildPartial.isInitialized()) {
                        return touchInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchInfoBuildPartial);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9437c;
                }

                public final RepeatedFieldBuilderV3 getTouchEventFieldBuilder() {
                    if (this.f9542c == null) {
                        this.f9542c = new RepeatedFieldBuilderV3(this.f9541b, (this.f9540a & 1) != 0, getParentForChildren(), isClean());
                        this.f9541b = null;
                    }
                    return this.f9542c;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public TouchInfo buildPartial() {
                    TouchInfo touchInfo = new TouchInfo(this);
                    m9027j(touchInfo);
                    if (this.f9540a != 0) {
                        m9026i(touchInfo);
                    }
                    onBuilt();
                    return touchInfo;
                }

                /* renamed from: i */
                public final void m9026i(TouchInfo touchInfo) {
                    int i10;
                    if ((this.f9540a & 2) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9544e;
                        touchInfo.f9538c = singleFieldBuilderV3 == null ? this.f9543d : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    TouchInfo.m9004a(touchInfo, i10);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9438d.ensureFieldAccessorsInitialized(TouchInfo.class, C7265b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                /* renamed from: j */
                public final void m9027j(TouchInfo touchInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9542c;
                    if (repeatedFieldBuilderV3 != null) {
                        touchInfo.f9537b = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f9540a & 1) != 0) {
                        this.f9541b = Collections.unmodifiableList(this.f9541b);
                        this.f9540a &= -2;
                    }
                    touchInfo.f9537b = this.f9541b;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7265b clear() {
                    super.clear();
                    this.f9540a = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9542c;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f9541b = Collections.EMPTY_LIST;
                    } else {
                        this.f9541b = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f9540a &= -2;
                    this.f9543d = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9544e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f9544e = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7265b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7265b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7265b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7265b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7265b mo27381clone() {
                    return (C7265b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public TouchInfo getDefaultInstanceForType() {
                    return TouchInfo.m9010h();
                }

                /* renamed from: p */
                public EzyPaint.Paint m9033p() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9544e;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f9543d;
                    return paint == null ? EzyPaint.Paint.m8473h() : paint;
                }

                /* renamed from: q */
                public EzyPaint.Paint.C7233b m9034q() {
                    this.f9540a |= 2;
                    onChanged();
                    return (EzyPaint.Paint.C7233b) m9019r().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C7265b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) codedInputStream.readMessage(EzyTouchEvent.TouchEvent.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9542c;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureTouchEventIsMutable();
                                            this.f9541b.add(touchEvent);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(touchEvent);
                                        }
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(m9019r().getBuilder(), extensionRegistryLite);
                                        this.f9540a |= 2;
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
                public C7265b mergeFrom(Message message) {
                    if (message instanceof TouchInfo) {
                        return m9037u((TouchInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: u */
                public C7265b m9037u(TouchInfo touchInfo) {
                    if (touchInfo == TouchInfo.m9010h()) {
                        return this;
                    }
                    if (this.f9542c == null) {
                        if (!touchInfo.f9537b.isEmpty()) {
                            if (this.f9541b.isEmpty()) {
                                this.f9541b = touchInfo.f9537b;
                                this.f9540a &= -2;
                            } else {
                                ensureTouchEventIsMutable();
                                this.f9541b.addAll(touchInfo.f9537b);
                            }
                            onChanged();
                        }
                    } else if (!touchInfo.f9537b.isEmpty()) {
                        if (this.f9542c.isEmpty()) {
                            this.f9542c.dispose();
                            this.f9542c = null;
                            this.f9541b = touchInfo.f9537b;
                            this.f9540a &= -2;
                            this.f9542c = GeneratedMessageV3.alwaysUseFieldBuilders ? getTouchEventFieldBuilder() : null;
                        } else {
                            this.f9542c.addAllMessages(touchInfo.f9537b);
                        }
                    }
                    if (touchInfo.m9014k()) {
                        m9038v(touchInfo.m9013j());
                    }
                    mergeUnknownFields(touchInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: v */
                public C7265b m9038v(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9544e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f9540a & 2) == 0 || (paint2 = this.f9543d) == null || paint2 == EzyPaint.Paint.m8473h()) {
                        this.f9543d = paint;
                    } else {
                        m9034q().m8495o(paint);
                    }
                    if (this.f9543d != null) {
                        this.f9540a |= 2;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public final C7265b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7265b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7265b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7265b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: y */
                public C7265b m9041y(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9544e;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f9543d = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f9540a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C7265b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7265b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                public C7265b() {
                    this.f9541b = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public C7265b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9541b = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }
            }

            public TouchInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9539d = (byte) -1;
            }

            private TouchInfo() {
                this.f9539d = (byte) -1;
                this.f9537b = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$TouchSource$a */
        public class C7266a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TouchSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7267b c7267bM8996i = TouchSource.m8996i();
                try {
                    c7267bM8996i.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7267bM8996i.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7267bM8996i.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7267bM8996i.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7267bM8996i.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static TouchSource m8995d() {
            return f9530c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9435a;
        }

        /* renamed from: i */
        public static C7267b m8996i() {
            return f9530c.toBuilder();
        }

        /* renamed from: l */
        public static TouchSource m8997l(InputStream inputStream) {
            return (TouchSource) GeneratedMessageV3.parseWithIOException(f9531d, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public TouchSource getDefaultInstanceForType() {
            return f9530c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TouchSource)) {
                return super.equals(obj);
            }
            TouchSource touchSource = (TouchSource) obj;
            return m9000h().equals(touchSource.m9000h()) && getUnknownFields().equals(touchSource.getUnknownFields());
        }

        /* renamed from: g */
        public int m8999g() {
            return this.f9532a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9531d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f9532a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9532a.get(i11));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        /* renamed from: h */
        public List m9000h() {
            return this.f9532a;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8999g() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m9000h().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9436b.ensureFieldAccessorsInitialized(TouchSource.class, C7267b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9533b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9533b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C7267b newBuilderForType() {
            return m8996i();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7267b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7267b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C7267b toBuilder() {
            return this == f9530c ? new C7267b() : new C7267b().m9060t(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TouchSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f9532a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9532a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$TouchSource$b */
        public static final class C7267b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9545a;

            /* renamed from: b */
            public List f9546b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9547c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7267b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7267b) super.addRepeatedField(fieldDescriptor, obj);
            }

            /* renamed from: e */
            public C7267b m9045e(TouchInfo.C7265b c7265b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9547c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7265b.build());
                    return this;
                }
                m9054n();
                this.f9546b.add(c7265b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TouchSource build() {
                TouchSource touchSourceBuildPartial = buildPartial();
                if (touchSourceBuildPartial.isInitialized()) {
                    return touchSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public TouchSource buildPartial() {
                TouchSource touchSource = new TouchSource(this);
                m9049i(touchSource);
                if (this.f9545a != 0) {
                    m9048h(touchSource);
                }
                onBuilt();
                return touchSource;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9435a;
            }

            /* renamed from: h */
            public final void m9048h(TouchSource touchSource) {
            }

            /* renamed from: i */
            public final void m9049i(TouchSource touchSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9547c;
                if (repeatedFieldBuilderV3 != null) {
                    touchSource.f9532a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9545a & 1) != 0) {
                    this.f9546b = Collections.unmodifiableList(this.f9546b);
                    this.f9545a &= -2;
                }
                touchSource.f9532a = this.f9546b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9436b.ensureFieldAccessorsInitialized(TouchSource.class, C7267b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7267b clear() {
                super.clear();
                this.f9545a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9547c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9546b = Collections.EMPTY_LIST;
                } else {
                    this.f9546b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9545a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7267b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7267b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7267b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7267b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7267b mo27381clone() {
                return (C7267b) super.mo27381clone();
            }

            /* renamed from: n */
            public final void m9054n() {
                if ((this.f9545a & 1) == 0) {
                    this.f9546b = new ArrayList(this.f9546b);
                    this.f9545a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public TouchSource getDefaultInstanceForType() {
                return TouchSource.m8995d();
            }

            /* renamed from: p */
            public int m9056p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9547c;
                return repeatedFieldBuilderV3 == null ? this.f9546b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m9057q() {
                if (this.f9547c == null) {
                    this.f9547c = new RepeatedFieldBuilderV3(this.f9546b, (this.f9545a & 1) != 0, getParentForChildren(), isClean());
                    this.f9546b = null;
                }
                return this.f9547c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7267b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TouchInfo touchInfo = (TouchInfo) codedInputStream.readMessage(TouchInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9547c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m9054n();
                                        this.f9546b.add(touchInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(touchInfo);
                                    }
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
            public C7267b mergeFrom(Message message) {
                if (message instanceof TouchSource) {
                    return m9060t((TouchSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7267b m9060t(TouchSource touchSource) {
                if (touchSource == TouchSource.m8995d()) {
                    return this;
                }
                if (this.f9547c == null) {
                    if (!touchSource.f9532a.isEmpty()) {
                        if (this.f9546b.isEmpty()) {
                            this.f9546b = touchSource.f9532a;
                            this.f9545a &= -2;
                        } else {
                            m9054n();
                            this.f9546b.addAll(touchSource.f9532a);
                        }
                        onChanged();
                    }
                } else if (!touchSource.f9532a.isEmpty()) {
                    if (this.f9547c.isEmpty()) {
                        this.f9547c.dispose();
                        this.f9547c = null;
                        this.f9546b = touchSource.f9532a;
                        this.f9545a &= -2;
                        this.f9547c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9057q() : null;
                    } else {
                        this.f9547c.addAllMessages(touchSource.f9532a);
                    }
                }
                mergeUnknownFields(touchSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7267b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7267b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7267b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7267b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7267b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7267b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7267b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7267b) super.setUnknownFields(unknownFieldSet);
            }

            public C7267b() {
                this.f9546b = Collections.EMPTY_LIST;
            }

            public C7267b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9546b = Collections.EMPTY_LIST;
            }
        }

        public TouchSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9533b = (byte) -1;
        }

        private TouchSource() {
            this.f9533b = (byte) -1;
            this.f9532a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8710u().getMessageTypes().get(0);
        f9435a = descriptor;
        f9436b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"TouchInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9437c = descriptor2;
        f9438d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TouchEvent", "Paint"});
        Descriptors.Descriptor descriptor3 = m8710u().getMessageTypes().get(1);
        f9439e = descriptor3;
        f9440f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MatrixInfo"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        f9441g = descriptor4;
        f9442h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Matrix"});
        Descriptors.Descriptor descriptor5 = m8710u().getMessageTypes().get(2);
        f9443i = descriptor5;
        f9444j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"FileInfo"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        f9445k = descriptor6;
        f9446l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Name", "Width", "Height", "Validate"});
        Descriptors.Descriptor descriptor7 = m8710u().getMessageTypes().get(3);
        f9447m = descriptor7;
        f9448n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AudioInfo"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        f9449o = descriptor8;
        f9450p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Name", "Duration", "Validate"});
        Descriptors.Descriptor descriptor9 = m8710u().getMessageTypes().get(4);
        f9451q = descriptor9;
        f9452r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"TextInfo"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        f9453s = descriptor10;
        f9454t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Content", "Paint"});
        Descriptors.Descriptor descriptor11 = m8710u().getMessageTypes().get(5);
        f9455u = descriptor11;
        f9456v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"GeometryInfo"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        f9457w = descriptor12;
        f9458x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"GeometryType", "Points", "Paint"});
        EzyTouchEvent.m9071g();
        EzyMatrix.m8214c();
        EzyPaint.m8466c();
        EzyPointF.m8508c();
        EzyGeometryEnum.m7980a();
    }

    /* renamed from: u */
    public static Descriptors.FileDescriptor m8710u() {
        return f9459y;
    }
}
