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
    public static final Descriptors.Descriptor f9708a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9709b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9710c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9711d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f9712e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f9713f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f9714g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f9715h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f9716i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f9717j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f9718k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f9719l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f9720m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f9721n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f9722o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f9723p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f9724q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f9725r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f9726s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f9727t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f9728u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f9729v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f9730w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f9731x;

    /* renamed from: y */
    public static Descriptors.FileDescriptor f9732y = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fSource.proto\u001a\u0016utils/TouchEvent.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0018enums/GeometryEnum.proto\"}\n\u000bTouchSource\u0012)\n\ttouchInfo\u0018\u0001 \u0003(\u000b2\u0016.TouchSource.TouchInfo\u001aC\n\tTouchInfo\u0012\u001f\n\ntouchEvent\u0018\u0001 \u0003(\u000b2\u000b.TouchEvent\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"c\n\fMatrixSource\u0012,\n\nmatrixInfo\u0018\u0001 \u0003(\u000b2\u0018.MatrixSource.MatrixInfo\u001a%\n\nMatrixInfo\u0012\u0017\n\u0006matrix\u0018\u0001 \u0003(\u000b2\u0007.Matrix\"\u007f\n\nFileSource\u0012&\n\bfileInfo\u0018\u0001 \u0003(\u000b2\u0014.FileSource.FileInfo\u001aI\n\bFileInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bvalidate\u0018\u0004 \u0001(\t\"w\n\u000bAudioSource\u0012)\n\taudioInfo\u0018\u0001 \u0003(\u000b2\u0016.AudioSource.AudioInfo\u001a=\n\tAudioInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\"h\n\nTextSource\u0012&\n\btextInfo\u0018\u0001 \u0003(\u000b2\u0014.TextSource.TextInfo\u001a2\n\bTextInfo\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"©\u0001\n\u000eGeometrySource\u00122\n\fgeometryInfo\u0018\u0001 \u0003(\u000b2\u001c.GeometrySource.GeometryInfo\u001ac\n\fGeometryInfo\u0012#\n\fgeometryType\u0018\u0001 \u0001(\u000e2\r.GeometryEnum\u0012\u0017\n\u0006points\u0018\u0002 \u0003(\u000b2\u0007.PointF\u0012\u0015\n\u0005paint\u0018\u0003 \u0001(\u000b2\u0006.PaintB\u001b\n\u000ecom.zykj.boardB\tEzySourceb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyTouchEvent.m9694g(), EzyMatrix.m8838c(), EzyPaint.m9092c(), EzyPointF.m9134c(), EzyGeometryEnum.m8603a()});

    public static final class FileSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final FileSource f9733c = new FileSource();

        /* renamed from: d */
        public static final Parser f9734d = new C7140a();

        /* renamed from: a */
        public List f9735a;

        /* renamed from: b */
        public byte f9736b;

        public static final class FileInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final FileInfo f9737f = new FileInfo();

            /* renamed from: g */
            public static final Parser f9738g = new C7138a();

            /* renamed from: a */
            public volatile Object f9739a;

            /* renamed from: b */
            public int f9740b;

            /* renamed from: c */
            public int f9741c;

            /* renamed from: d */
            public volatile Object f9742d;

            /* renamed from: e */
            public byte f9743e;

            /* renamed from: com.zykj.board.EzySource$FileSource$FileInfo$a */
            public class C7138a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FileInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7139b c7139bM9358w = FileInfo.m9358w();
                    try {
                        c7139bM9358w.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7139bM9358w.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7139bM9358w.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7139bM9358w.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7139bM9358w.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9718k;
            }

            public static Parser parser() {
                return f9738g;
            }

            /* renamed from: t */
            public static FileInfo m9357t() {
                return f9737f;
            }

            /* renamed from: w */
            public static C7139b m9358w() {
                return f9737f.toBuilder();
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
                return getName().equals(fileInfo.getName()) && getWidth() == fileInfo.getWidth() && getHeight() == fileInfo.getHeight() && m9360v().equals(fileInfo.m9360v()) && getUnknownFields().equals(fileInfo.getUnknownFields());
            }

            public int getHeight() {
                return this.f9741c;
            }

            public String getName() {
                Object obj = this.f9739a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9739a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9738g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9739a) ? GeneratedMessageV3.computeStringSize(1, this.f9739a) : 0;
                int i10 = this.f9740b;
                if (i10 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(2, i10);
                }
                int i11 = this.f9741c;
                if (i11 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(3, i11);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9742d)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f9742d);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getWidth() {
                return this.f9740b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + m9360v().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9719l.ensureFieldAccessorsInitialized(FileInfo.class, C7139b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9743e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9743e = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new FileInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public FileInfo getDefaultInstanceForType() {
                return f9737f;
            }

            /* renamed from: v */
            public String m9360v() {
                Object obj = this.f9742d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9742d = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f9739a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9739a);
                }
                int i9 = this.f9740b;
                if (i9 != 0) {
                    codedOutputStream.writeInt32(2, i9);
                }
                int i10 = this.f9741c;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(3, i10);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f9742d)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9742d);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public C7139b newBuilderForType() {
                return m9358w();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C7139b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7139b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C7139b toBuilder() {
                return this == f9737f ? new C7139b() : new C7139b().m9376o(this);
            }

            /* renamed from: com.zykj.board.EzySource$FileSource$FileInfo$b */
            public static final class C7139b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9744a;

                /* renamed from: b */
                public Object f9745b;

                /* renamed from: c */
                public int f9746c;

                /* renamed from: d */
                public int f9747d;

                /* renamed from: e */
                public Object f9748e;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C7139b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7139b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public FileInfo build() {
                    FileInfo fileInfoBuildPartial = buildPartial();
                    if (fileInfoBuildPartial.isInitialized()) {
                        return fileInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public FileInfo buildPartial() {
                    FileInfo fileInfo = new FileInfo(this);
                    if (this.f9744a != 0) {
                        m9368f(fileInfo);
                    }
                    onBuilt();
                    return fileInfo;
                }

                /* renamed from: f */
                public final void m9368f(FileInfo fileInfo) {
                    int i9 = this.f9744a;
                    if ((i9 & 1) != 0) {
                        fileInfo.f9739a = this.f9745b;
                    }
                    if ((i9 & 2) != 0) {
                        fileInfo.f9740b = this.f9746c;
                    }
                    if ((i9 & 4) != 0) {
                        fileInfo.f9741c = this.f9747d;
                    }
                    if ((i9 & 8) != 0) {
                        fileInfo.f9742d = this.f9748e;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C7139b clear() {
                    super.clear();
                    this.f9744a = 0;
                    this.f9745b = "";
                    this.f9746c = 0;
                    this.f9747d = 0;
                    this.f9748e = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9718k;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7139b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7139b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7139b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7139b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9719l.ensureFieldAccessorsInitialized(FileInfo.class, C7139b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7139b mo24685clone() {
                    return (C7139b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public FileInfo getDefaultInstanceForType() {
                    return FileInfo.m9357t();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7139b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f9745b = codedInputStream.readStringRequireUtf8();
                                        this.f9744a |= 1;
                                    } else if (tag == 16) {
                                        this.f9746c = codedInputStream.readInt32();
                                        this.f9744a |= 2;
                                    } else if (tag == 24) {
                                        this.f9747d = codedInputStream.readInt32();
                                        this.f9744a |= 4;
                                    } else if (tag == 34) {
                                        this.f9748e = codedInputStream.readStringRequireUtf8();
                                        this.f9744a |= 8;
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
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7139b mergeFrom(Message message) {
                    if (message instanceof FileInfo) {
                        return m9376o((FileInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7139b m9376o(FileInfo fileInfo) {
                    if (fileInfo == FileInfo.m9357t()) {
                        return this;
                    }
                    if (!fileInfo.getName().isEmpty()) {
                        this.f9745b = fileInfo.f9739a;
                        this.f9744a |= 1;
                        onChanged();
                    }
                    if (fileInfo.getWidth() != 0) {
                        m9384w(fileInfo.getWidth());
                    }
                    if (fileInfo.getHeight() != 0) {
                        m9379r(fileInfo.getHeight());
                    }
                    if (!fileInfo.m9360v().isEmpty()) {
                        this.f9748e = fileInfo.f9742d;
                        this.f9744a |= 8;
                        onChanged();
                    }
                    mergeUnknownFields(fileInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7139b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7139b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7139b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7139b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C7139b m9379r(int i9) {
                    this.f9747d = i9;
                    this.f9744a |= 4;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C7139b m9380s(String str) {
                    str.getClass();
                    this.f9745b = str;
                    this.f9744a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C7139b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7139b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C7139b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7139b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: v */
                public C7139b m9383v(String str) {
                    str.getClass();
                    this.f9748e = str;
                    this.f9744a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: w */
                public C7139b m9384w(int i9) {
                    this.f9746c = i9;
                    this.f9744a |= 2;
                    onChanged();
                    return this;
                }

                public C7139b() {
                    this.f9745b = "";
                    this.f9748e = "";
                }

                public C7139b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9745b = "";
                    this.f9748e = "";
                }
            }

            public FileInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9739a = "";
                this.f9740b = 0;
                this.f9741c = 0;
                this.f9742d = "";
                this.f9743e = (byte) -1;
            }

            private FileInfo() {
                this.f9739a = "";
                this.f9740b = 0;
                this.f9741c = 0;
                this.f9742d = "";
                this.f9743e = (byte) -1;
                this.f9739a = "";
                this.f9742d = "";
            }
        }

        /* renamed from: com.zykj.board.EzySource$FileSource$a */
        public class C7140a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FileSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7141b c7141bM9343u = FileSource.m9343u();
                try {
                    c7141bM9343u.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7141bM9343u.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7141bM9343u.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7141bM9343u.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7141bM9343u.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9716i;
        }

        /* renamed from: k */
        public static FileSource m9342k() {
            return f9733c;
        }

        /* renamed from: u */
        public static C7141b m9343u() {
            return f9733c.toBuilder();
        }

        /* renamed from: x */
        public static FileSource m9344x(InputStream inputStream) {
            return (FileSource) GeneratedMessageV3.parseWithIOException(f9734d, inputStream);
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
            return m9347t().equals(fileSource.m9347t()) && getUnknownFields().equals(fileSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9734d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = 0;
            for (int i10 = 0; i10 < this.f9735a.size(); i10++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9735a.get(i10));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m9346q() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m9347t().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9717j.ensureFieldAccessorsInitialized(FileSource.class, C7141b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9736b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9736b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public FileSource getDefaultInstanceForType() {
            return f9733c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FileSource();
        }

        /* renamed from: q */
        public int m9346q() {
            return this.f9735a.size();
        }

        /* renamed from: t */
        public List m9347t() {
            return this.f9735a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7141b newBuilderForType() {
            return m9343u();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public C7141b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7141b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i9 = 0; i9 < this.f9735a.size(); i9++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9735a.get(i9));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C7141b toBuilder() {
            return this == f9733c ? new C7141b() : new C7141b().m9402t(this);
        }

        /* renamed from: com.zykj.board.EzySource$FileSource$b */
        public static final class C7141b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9749a;

            /* renamed from: b */
            public List f9750b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9751c;

            /* renamed from: b */
            public C7141b m9386b(FileInfo.C7139b c7139b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9751c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7139b.build());
                    return this;
                }
                m9396n();
                this.f9750b.add(c7139b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C7141b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7141b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public FileSource build() {
                FileSource fileSourceBuildPartial = buildPartial();
                if (fileSourceBuildPartial.isInitialized()) {
                    return fileSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public FileSource buildPartial() {
                FileSource fileSource = new FileSource(this);
                m9391h(fileSource);
                if (this.f9749a != 0) {
                    m9390g(fileSource);
                }
                onBuilt();
                return fileSource;
            }

            /* renamed from: g */
            public final void m9390g(FileSource fileSource) {
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9716i;
            }

            /* renamed from: h */
            public final void m9391h(FileSource fileSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9751c;
                if (repeatedFieldBuilderV3 != null) {
                    fileSource.f9735a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9749a & 1) != 0) {
                    this.f9750b = Collections.unmodifiableList(this.f9750b);
                    this.f9749a &= -2;
                }
                fileSource.f9735a = this.f9750b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7141b clear() {
                super.clear();
                this.f9749a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9751c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9750b = Collections.EMPTY_LIST;
                } else {
                    this.f9750b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9749a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9717j.ensureFieldAccessorsInitialized(FileSource.class, C7141b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7141b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7141b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7141b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7141b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7141b mo24685clone() {
                return (C7141b) super.mo24685clone();
            }

            /* renamed from: n */
            public final void m9396n() {
                if ((this.f9749a & 1) == 0) {
                    this.f9750b = new ArrayList(this.f9750b);
                    this.f9749a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public FileSource getDefaultInstanceForType() {
                return FileSource.m9342k();
            }

            /* renamed from: p */
            public int m9398p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9751c;
                return repeatedFieldBuilderV3 == null ? this.f9750b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m9399q() {
                if (this.f9751c == null) {
                    this.f9751c = new RepeatedFieldBuilderV3(this.f9750b, (this.f9749a & 1) != 0, getParentForChildren(), isClean());
                    this.f9750b = null;
                }
                return this.f9751c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7141b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    FileInfo fileInfo = (FileInfo) codedInputStream.readMessage(FileInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9751c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m9396n();
                                        this.f9750b.add(fileInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(fileInfo);
                                    }
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
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7141b mergeFrom(Message message) {
                if (message instanceof FileSource) {
                    return m9402t((FileSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7141b m9402t(FileSource fileSource) {
                if (fileSource == FileSource.m9342k()) {
                    return this;
                }
                if (this.f9751c == null) {
                    if (!fileSource.f9735a.isEmpty()) {
                        if (this.f9750b.isEmpty()) {
                            this.f9750b = fileSource.f9735a;
                            this.f9749a &= -2;
                        } else {
                            m9396n();
                            this.f9750b.addAll(fileSource.f9735a);
                        }
                        onChanged();
                    }
                } else if (!fileSource.f9735a.isEmpty()) {
                    if (this.f9751c.isEmpty()) {
                        this.f9751c.dispose();
                        this.f9751c = null;
                        this.f9750b = fileSource.f9735a;
                        this.f9749a &= -2;
                        this.f9751c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9399q() : null;
                    } else {
                        this.f9751c.addAllMessages(fileSource.f9735a);
                    }
                }
                mergeUnknownFields(fileSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7141b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7141b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7141b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7141b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7141b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7141b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7141b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7141b) super.setUnknownFields(unknownFieldSet);
            }

            public C7141b() {
                this.f9750b = Collections.EMPTY_LIST;
            }

            public C7141b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9750b = Collections.EMPTY_LIST;
            }
        }

        public FileSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9736b = (byte) -1;
        }

        private FileSource() {
            this.f9736b = (byte) -1;
            this.f9735a = Collections.EMPTY_LIST;
        }
    }

    public static final class GeometrySource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final GeometrySource f9752c = new GeometrySource();

        /* renamed from: d */
        public static final Parser f9753d = new C7144a();

        /* renamed from: a */
        public List f9754a;

        /* renamed from: b */
        public byte f9755b;

        public static final class GeometryInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final GeometryInfo f9756f = new GeometryInfo();

            /* renamed from: g */
            public static final Parser f9757g = new C7142a();

            /* renamed from: a */
            public int f9758a;

            /* renamed from: b */
            public int f9759b;

            /* renamed from: c */
            public List f9760c;

            /* renamed from: d */
            public EzyPaint.Paint f9761d;

            /* renamed from: e */
            public byte f9762e;

            /* renamed from: com.zykj.board.EzySource$GeometrySource$GeometryInfo$a */
            public class C7142a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public GeometryInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7143b c7143bM9418A = GeometryInfo.m9418A();
                    try {
                        c7143bM9418A.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7143bM9418A.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7143bM9418A.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7143bM9418A.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7143bM9418A.buildPartial());
                    }
                }
            }

            /* renamed from: A */
            public static C7143b m9418A() {
                return f9756f.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9730w;
            }

            public static Parser parser() {
                return f9757g;
            }

            /* renamed from: t */
            public static /* synthetic */ int m9425t(GeometryInfo geometryInfo, int i9) {
                int i10 = i9 | geometryInfo.f9758a;
                geometryInfo.f9758a = i10;
                return i10;
            }

            /* renamed from: v */
            public static GeometryInfo m9427v() {
                return f9756f;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public C7143b newBuilderForType() {
                return m9418A();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public C7143b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7143b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public C7143b toBuilder() {
                return this == f9756f ? new C7143b() : new C7143b().m9453t(this);
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
                if (this.f9759b == geometryInfo.f9759b && getPointsList().equals(geometryInfo.getPointsList()) && m9434z() == geometryInfo.m9434z()) {
                    return (!m9434z() || m9433y().equals(geometryInfo.m9433y())) && getUnknownFields().equals(geometryInfo.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9757g;
            }

            public int getPointsCount() {
                return this.f9760c.size();
            }

            public List getPointsList() {
                return this.f9760c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeEnumSize = this.f9759b != EzyGeometryEnum.GeometryEnum.OVAL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f9759b) : 0;
                for (int i10 = 0; i10 < this.f9760c.size(); i10++) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f9760c.get(i10));
                }
                if ((this.f9758a & 1) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(3, m9433y());
                }
                int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f9759b;
                if (getPointsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getPointsList().hashCode();
                }
                if (m9434z()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + m9433y().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9731x.ensureFieldAccessorsInitialized(GeometryInfo.class, C7143b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9762e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9762e = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new GeometryInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public GeometryInfo getDefaultInstanceForType() {
                return f9756f;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.f9759b != EzyGeometryEnum.GeometryEnum.OVAL.getNumber()) {
                    codedOutputStream.writeEnum(1, this.f9759b);
                }
                for (int i9 = 0; i9 < this.f9760c.size(); i9++) {
                    codedOutputStream.writeMessage(2, (MessageLite) this.f9760c.get(i9));
                }
                if ((this.f9758a & 1) != 0) {
                    codedOutputStream.writeMessage(3, m9433y());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: x */
            public int m9432x() {
                return this.f9759b;
            }

            /* renamed from: y */
            public EzyPaint.Paint m9433y() {
                EzyPaint.Paint paint = this.f9761d;
                return paint == null ? EzyPaint.Paint.m9099t() : paint;
            }

            /* renamed from: z */
            public boolean m9434z() {
                return (this.f9758a & 1) != 0;
            }

            /* renamed from: com.zykj.board.EzySource$GeometrySource$GeometryInfo$b */
            public static final class C7143b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9763a;

                /* renamed from: b */
                public int f9764b;

                /* renamed from: c */
                public List f9765c;

                /* renamed from: d */
                public RepeatedFieldBuilderV3 f9766d;

                /* renamed from: e */
                public EzyPaint.Paint f9767e;

                /* renamed from: f */
                public SingleFieldBuilderV3 f9768f;

                private void ensurePointsIsMutable() {
                    if ((this.f9763a & 2) == 0) {
                        this.f9765c = new ArrayList(this.f9765c);
                        this.f9763a |= 2;
                    }
                }

                private RepeatedFieldBuilderV3 getPointsFieldBuilder() {
                    if (this.f9766d == null) {
                        this.f9766d = new RepeatedFieldBuilderV3(this.f9765c, (this.f9763a & 2) != 0, getParentForChildren(), isClean());
                        this.f9765c = null;
                    }
                    return this.f9766d;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getPointsFieldBuilder();
                        m9436q();
                    }
                }

                /* renamed from: q */
                private SingleFieldBuilderV3 m9436q() {
                    if (this.f9768f == null) {
                        this.f9768f = new SingleFieldBuilderV3(m9449o(), getParentForChildren(), isClean());
                        this.f9767e = null;
                    }
                    return this.f9768f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public final C7143b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7143b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: b */
                public C7143b m9438b(EzyPointF.PointF pointF) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9766d;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointF);
                        return this;
                    }
                    pointF.getClass();
                    ensurePointsIsMutable();
                    this.f9765c.add(pointF);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public C7143b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7143b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public GeometryInfo build() {
                    GeometryInfo geometryInfoBuildPartial = buildPartial();
                    if (geometryInfoBuildPartial.isInitialized()) {
                        return geometryInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometryInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public GeometryInfo buildPartial() {
                    GeometryInfo geometryInfo = new GeometryInfo(this);
                    m9443h(geometryInfo);
                    if (this.f9763a != 0) {
                        m9442g(geometryInfo);
                    }
                    onBuilt();
                    return geometryInfo;
                }

                /* renamed from: g */
                public final void m9442g(GeometryInfo geometryInfo) {
                    int i9;
                    int i10 = this.f9763a;
                    if ((i10 & 1) != 0) {
                        geometryInfo.f9759b = this.f9764b;
                    }
                    if ((i10 & 4) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9768f;
                        geometryInfo.f9761d = singleFieldBuilderV3 == null ? this.f9767e : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    GeometryInfo.m9425t(geometryInfo, i9);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9730w;
                }

                /* renamed from: h */
                public final void m9443h(GeometryInfo geometryInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9766d;
                    if (repeatedFieldBuilderV3 != null) {
                        geometryInfo.f9760c = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f9763a & 2) != 0) {
                        this.f9765c = Collections.unmodifiableList(this.f9765c);
                        this.f9763a &= -3;
                    }
                    geometryInfo.f9760c = this.f9765c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7143b clear() {
                    super.clear();
                    this.f9763a = 0;
                    this.f9764b = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9766d;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f9765c = Collections.EMPTY_LIST;
                    } else {
                        this.f9765c = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f9763a &= -3;
                    this.f9767e = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9768f;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f9768f = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9731x.ensureFieldAccessorsInitialized(GeometryInfo.class, C7143b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7143b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7143b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7143b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7143b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7143b mo24685clone() {
                    return (C7143b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public GeometryInfo getDefaultInstanceForType() {
                    return GeometryInfo.m9427v();
                }

                /* renamed from: o */
                public EzyPaint.Paint m9449o() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9768f;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f9767e;
                    return paint == null ? EzyPaint.Paint.m9099t() : paint;
                }

                /* renamed from: p */
                public EzyPaint.Paint.C7123b m9450p() {
                    this.f9763a |= 4;
                    onChanged();
                    return (EzyPaint.Paint.C7123b) m9436q().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C7143b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f9764b = codedInputStream.readEnum();
                                        this.f9763a |= 1;
                                    } else if (tag == 18) {
                                        EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9766d;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensurePointsIsMutable();
                                            this.f9765c.add(pointF);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(pointF);
                                        }
                                    } else if (tag == 26) {
                                        codedInputStream.readMessage(m9436q().getBuilder(), extensionRegistryLite);
                                        this.f9763a |= 4;
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
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C7143b mergeFrom(Message message) {
                    if (message instanceof GeometryInfo) {
                        return m9453t((GeometryInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: t */
                public C7143b m9453t(GeometryInfo geometryInfo) {
                    if (geometryInfo == GeometryInfo.m9427v()) {
                        return this;
                    }
                    if (geometryInfo.f9759b != 0) {
                        m9457x(geometryInfo.m9432x());
                    }
                    if (this.f9766d == null) {
                        if (!geometryInfo.f9760c.isEmpty()) {
                            if (this.f9765c.isEmpty()) {
                                this.f9765c = geometryInfo.f9760c;
                                this.f9763a &= -3;
                            } else {
                                ensurePointsIsMutable();
                                this.f9765c.addAll(geometryInfo.f9760c);
                            }
                            onChanged();
                        }
                    } else if (!geometryInfo.f9760c.isEmpty()) {
                        if (this.f9766d.isEmpty()) {
                            this.f9766d.dispose();
                            this.f9766d = null;
                            this.f9765c = geometryInfo.f9760c;
                            this.f9763a &= -3;
                            this.f9766d = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
                        } else {
                            this.f9766d.addAllMessages(geometryInfo.f9760c);
                        }
                    }
                    if (geometryInfo.m9434z()) {
                        m9454u(geometryInfo.m9433y());
                    }
                    mergeUnknownFields(geometryInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C7143b m9454u(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9768f;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f9763a & 4) == 0 || (paint2 = this.f9767e) == null || paint2 == EzyPaint.Paint.m9099t()) {
                        this.f9767e = paint;
                    } else {
                        m9450p().m9121o(paint);
                    }
                    if (this.f9767e != null) {
                        this.f9763a |= 4;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public final C7143b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7143b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C7143b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7143b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: x */
                public C7143b m9457x(int i9) {
                    this.f9764b = i9;
                    this.f9763a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: y */
                public C7143b m9458y(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9768f;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f9767e = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f9763a |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C7143b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7143b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                public C7143b() {
                    this.f9764b = 0;
                    this.f9765c = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public C7143b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9764b = 0;
                    this.f9765c = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }
            }

            public GeometryInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9759b = 0;
                this.f9762e = (byte) -1;
            }

            private GeometryInfo() {
                this.f9762e = (byte) -1;
                this.f9759b = 0;
                this.f9760c = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$GeometrySource$a */
        public class C7144a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public GeometrySource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7145b c7145bM9410t = GeometrySource.m9410t();
                try {
                    c7145bM9410t.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7145bM9410t.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7145bM9410t.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7145bM9410t.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7145bM9410t.buildPartial());
                }
            }
        }

        /* renamed from: g */
        public static GeometrySource m9409g() {
            return f9752c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9728u;
        }

        /* renamed from: t */
        public static C7145b m9410t() {
            return f9752c.toBuilder();
        }

        /* renamed from: w */
        public static GeometrySource m9411w(InputStream inputStream) {
            return (GeometrySource) GeneratedMessageV3.parseWithIOException(f9753d, inputStream);
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
            return m9414q().equals(geometrySource.m9414q()) && getUnknownFields().equals(geometrySource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9753d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = 0;
            for (int i10 = 0; i10 < this.f9754a.size(); i10++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9754a.get(i10));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m9413n() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m9414q().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9729v.ensureFieldAccessorsInitialized(GeometrySource.class, C7145b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9755b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9755b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public GeometrySource getDefaultInstanceForType() {
            return f9752c;
        }

        /* renamed from: n */
        public int m9413n() {
            return this.f9754a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GeometrySource();
        }

        /* renamed from: q */
        public List m9414q() {
            return this.f9754a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C7145b newBuilderForType() {
            return m9410t();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7145b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7145b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i9 = 0; i9 < this.f9754a.size(); i9++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9754a.get(i9));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C7145b toBuilder() {
            return this == f9752c ? new C7145b() : new C7145b().m9477t(this);
        }

        /* renamed from: com.zykj.board.EzySource$GeometrySource$b */
        public static final class C7145b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9769a;

            /* renamed from: b */
            public List f9770b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9771c;

            /* renamed from: b */
            public C7145b m9461b(GeometryInfo.C7143b c7143b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9771c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7143b.build());
                    return this;
                }
                m9471n();
                this.f9770b.add(c7143b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C7145b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7145b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public GeometrySource build() {
                GeometrySource geometrySourceBuildPartial = buildPartial();
                if (geometrySourceBuildPartial.isInitialized()) {
                    return geometrySourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometrySourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public GeometrySource buildPartial() {
                GeometrySource geometrySource = new GeometrySource(this);
                m9466h(geometrySource);
                if (this.f9769a != 0) {
                    m9465g(geometrySource);
                }
                onBuilt();
                return geometrySource;
            }

            /* renamed from: g */
            public final void m9465g(GeometrySource geometrySource) {
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9728u;
            }

            /* renamed from: h */
            public final void m9466h(GeometrySource geometrySource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9771c;
                if (repeatedFieldBuilderV3 != null) {
                    geometrySource.f9754a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9769a & 1) != 0) {
                    this.f9770b = Collections.unmodifiableList(this.f9770b);
                    this.f9769a &= -2;
                }
                geometrySource.f9754a = this.f9770b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7145b clear() {
                super.clear();
                this.f9769a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9771c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9770b = Collections.EMPTY_LIST;
                } else {
                    this.f9770b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9769a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9729v.ensureFieldAccessorsInitialized(GeometrySource.class, C7145b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7145b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7145b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7145b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7145b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7145b mo24685clone() {
                return (C7145b) super.mo24685clone();
            }

            /* renamed from: n */
            public final void m9471n() {
                if ((this.f9769a & 1) == 0) {
                    this.f9770b = new ArrayList(this.f9770b);
                    this.f9769a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public GeometrySource getDefaultInstanceForType() {
                return GeometrySource.m9409g();
            }

            /* renamed from: p */
            public int m9473p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9771c;
                return repeatedFieldBuilderV3 == null ? this.f9770b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m9474q() {
                if (this.f9771c == null) {
                    this.f9771c = new RepeatedFieldBuilderV3(this.f9770b, (this.f9769a & 1) != 0, getParentForChildren(), isClean());
                    this.f9770b = null;
                }
                return this.f9771c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7145b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    GeometryInfo geometryInfo = (GeometryInfo) codedInputStream.readMessage(GeometryInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9771c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m9471n();
                                        this.f9770b.add(geometryInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(geometryInfo);
                                    }
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
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7145b mergeFrom(Message message) {
                if (message instanceof GeometrySource) {
                    return m9477t((GeometrySource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7145b m9477t(GeometrySource geometrySource) {
                if (geometrySource == GeometrySource.m9409g()) {
                    return this;
                }
                if (this.f9771c == null) {
                    if (!geometrySource.f9754a.isEmpty()) {
                        if (this.f9770b.isEmpty()) {
                            this.f9770b = geometrySource.f9754a;
                            this.f9769a &= -2;
                        } else {
                            m9471n();
                            this.f9770b.addAll(geometrySource.f9754a);
                        }
                        onChanged();
                    }
                } else if (!geometrySource.f9754a.isEmpty()) {
                    if (this.f9771c.isEmpty()) {
                        this.f9771c.dispose();
                        this.f9771c = null;
                        this.f9770b = geometrySource.f9754a;
                        this.f9769a &= -2;
                        this.f9771c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9474q() : null;
                    } else {
                        this.f9771c.addAllMessages(geometrySource.f9754a);
                    }
                }
                mergeUnknownFields(geometrySource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7145b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7145b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7145b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7145b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7145b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7145b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7145b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7145b) super.setUnknownFields(unknownFieldSet);
            }

            public C7145b() {
                this.f9770b = Collections.EMPTY_LIST;
            }

            public C7145b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9770b = Collections.EMPTY_LIST;
            }
        }

        public GeometrySource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9755b = (byte) -1;
        }

        private GeometrySource() {
            this.f9755b = (byte) -1;
            this.f9754a = Collections.EMPTY_LIST;
        }
    }

    public static final class MatrixSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final MatrixSource f9772c = new MatrixSource();

        /* renamed from: d */
        public static final Parser f9773d = new C7148a();

        /* renamed from: a */
        public List f9774a;

        /* renamed from: b */
        public byte f9775b;

        public static final class MatrixInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: c */
            public static final MatrixInfo f9776c = new MatrixInfo();

            /* renamed from: d */
            public static final Parser f9777d = new C7146a();

            /* renamed from: a */
            public List f9778a;

            /* renamed from: b */
            public byte f9779b;

            /* renamed from: com.zykj.board.EzySource$MatrixSource$MatrixInfo$a */
            public class C7146a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public MatrixInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7147b c7147bM9497q = MatrixInfo.m9497q();
                    try {
                        c7147bM9497q.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7147bM9497q.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7147bM9497q.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7147bM9497q.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7147bM9497q.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9714g;
            }

            /* renamed from: k */
            public static MatrixInfo m9496k() {
                return f9776c;
            }

            public static Parser parser() {
                return f9777d;
            }

            /* renamed from: q */
            public static C7147b m9497q() {
                return f9776c.toBuilder();
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
                return this.f9778a.size();
            }

            public List getMatrixList() {
                return this.f9778a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9777d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeMessageSize = 0;
                for (int i10 = 0; i10 < this.f9778a.size(); i10++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9778a.get(i10));
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
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
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9715h.ensureFieldAccessorsInitialized(MatrixInfo.class, C7147b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9779b;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9779b = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public MatrixInfo getDefaultInstanceForType() {
                return f9776c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new MatrixInfo();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C7147b newBuilderForType() {
                return m9497q();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7147b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7147b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7147b toBuilder() {
                return this == f9776c ? new C7147b() : new C7147b().m9518s(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i9 = 0; i9 < this.f9778a.size(); i9++) {
                    codedOutputStream.writeMessage(1, (MessageLite) this.f9778a.get(i9));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$MatrixSource$MatrixInfo$b */
            public static final class C7147b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9780a;

                /* renamed from: b */
                public List f9781b;

                /* renamed from: c */
                public RepeatedFieldBuilderV3 f9782c;

                /* renamed from: b */
                public C7147b m9503b(EzyMatrix.Matrix.C7109b c7109b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9782c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c7109b.build());
                        return this;
                    }
                    ensureMatrixIsMutable();
                    this.f9781b.add(c7109b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: d */
                public C7147b m9504d(EzyMatrix.Matrix matrix) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9782c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(matrix);
                        return this;
                    }
                    matrix.getClass();
                    ensureMatrixIsMutable();
                    this.f9781b.add(matrix);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public C7147b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7147b) super.addRepeatedField(fieldDescriptor, obj);
                }

                public final void ensureMatrixIsMutable() {
                    if ((this.f9780a & 1) == 0) {
                        this.f9781b = new ArrayList(this.f9781b);
                        this.f9780a |= 1;
                    }
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public MatrixInfo build() {
                    MatrixInfo matrixInfoBuildPartial = buildPartial();
                    if (matrixInfoBuildPartial.isInitialized()) {
                        return matrixInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public MatrixInfo buildPartial() {
                    MatrixInfo matrixInfo = new MatrixInfo(this);
                    m9509i(matrixInfo);
                    if (this.f9780a != 0) {
                        m9508h(matrixInfo);
                    }
                    onBuilt();
                    return matrixInfo;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9714g;
                }

                /* renamed from: h */
                public final void m9508h(MatrixInfo matrixInfo) {
                }

                /* renamed from: i */
                public final void m9509i(MatrixInfo matrixInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9782c;
                    if (repeatedFieldBuilderV3 != null) {
                        matrixInfo.f9778a = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f9780a & 1) != 0) {
                        this.f9781b = Collections.unmodifiableList(this.f9781b);
                        this.f9780a &= -2;
                    }
                    matrixInfo.f9778a = this.f9781b;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9715h.ensureFieldAccessorsInitialized(MatrixInfo.class, C7147b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7147b clear() {
                    super.clear();
                    this.f9780a = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9782c;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f9781b = Collections.EMPTY_LIST;
                    } else {
                        this.f9781b = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f9780a &= -2;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7147b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7147b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7147b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7147b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7147b mo24685clone() {
                    return (C7147b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public MatrixInfo getDefaultInstanceForType() {
                    return MatrixInfo.m9496k();
                }

                /* renamed from: p */
                public final RepeatedFieldBuilderV3 m9515p() {
                    if (this.f9782c == null) {
                        this.f9782c = new RepeatedFieldBuilderV3(this.f9781b, (this.f9780a & 1) != 0, getParentForChildren(), isClean());
                        this.f9781b = null;
                    }
                    return this.f9782c;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7147b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        EzyMatrix.Matrix matrix = (EzyMatrix.Matrix) codedInputStream.readMessage(EzyMatrix.Matrix.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9782c;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureMatrixIsMutable();
                                            this.f9781b.add(matrix);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(matrix);
                                        }
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
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C7147b mergeFrom(Message message) {
                    if (message instanceof MatrixInfo) {
                        return m9518s((MatrixInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: s */
                public C7147b m9518s(MatrixInfo matrixInfo) {
                    if (matrixInfo == MatrixInfo.m9496k()) {
                        return this;
                    }
                    if (this.f9782c == null) {
                        if (!matrixInfo.f9778a.isEmpty()) {
                            if (this.f9781b.isEmpty()) {
                                this.f9781b = matrixInfo.f9778a;
                                this.f9780a &= -2;
                            } else {
                                ensureMatrixIsMutable();
                                this.f9781b.addAll(matrixInfo.f9778a);
                            }
                            onChanged();
                        }
                    } else if (!matrixInfo.f9778a.isEmpty()) {
                        if (this.f9782c.isEmpty()) {
                            this.f9782c.dispose();
                            this.f9782c = null;
                            this.f9781b = matrixInfo.f9778a;
                            this.f9780a &= -2;
                            this.f9782c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9515p() : null;
                        } else {
                            this.f9782c.addAllMessages(matrixInfo.f9778a);
                        }
                    }
                    mergeUnknownFields(matrixInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C7147b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7147b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C7147b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7147b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C7147b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7147b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public final C7147b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7147b) super.setUnknownFields(unknownFieldSet);
                }

                public C7147b() {
                    this.f9781b = Collections.EMPTY_LIST;
                }

                public C7147b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9781b = Collections.EMPTY_LIST;
                }
            }

            public MatrixInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9779b = (byte) -1;
            }

            private MatrixInfo() {
                this.f9779b = (byte) -1;
                this.f9778a = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$MatrixSource$a */
        public class C7148a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MatrixSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7149b c7149bM9485t = MatrixSource.m9485t();
                try {
                    c7149bM9485t.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7149bM9485t.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7149bM9485t.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7149bM9485t.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7149bM9485t.buildPartial());
                }
            }
        }

        /* renamed from: g */
        public static MatrixSource m9484g() {
            return f9772c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9712e;
        }

        /* renamed from: t */
        public static C7149b m9485t() {
            return f9772c.toBuilder();
        }

        /* renamed from: w */
        public static MatrixSource m9486w(InputStream inputStream) {
            return (MatrixSource) GeneratedMessageV3.parseWithIOException(f9773d, inputStream);
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
            return m9489q().equals(matrixSource.m9489q()) && getUnknownFields().equals(matrixSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9773d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = 0;
            for (int i10 = 0; i10 < this.f9774a.size(); i10++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9774a.get(i10));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m9488n() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m9489q().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9713f.ensureFieldAccessorsInitialized(MatrixSource.class, C7149b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9775b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9775b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public MatrixSource getDefaultInstanceForType() {
            return f9772c;
        }

        /* renamed from: n */
        public int m9488n() {
            return this.f9774a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MatrixSource();
        }

        /* renamed from: q */
        public List m9489q() {
            return this.f9774a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C7149b newBuilderForType() {
            return m9485t();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7149b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7149b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i9 = 0; i9 < this.f9774a.size(); i9++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9774a.get(i9));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C7149b toBuilder() {
            return this == f9772c ? new C7149b() : new C7149b().m9540t(this);
        }

        /* renamed from: com.zykj.board.EzySource$MatrixSource$b */
        public static final class C7149b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9783a;

            /* renamed from: b */
            public List f9784b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9785c;

            /* renamed from: b */
            public C7149b m9524b(MatrixInfo matrixInfo) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9785c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(matrixInfo);
                    return this;
                }
                matrixInfo.getClass();
                m9534n();
                this.f9784b.add(matrixInfo);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C7149b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7149b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public MatrixSource build() {
                MatrixSource matrixSourceBuildPartial = buildPartial();
                if (matrixSourceBuildPartial.isInitialized()) {
                    return matrixSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public MatrixSource buildPartial() {
                MatrixSource matrixSource = new MatrixSource(this);
                m9529h(matrixSource);
                if (this.f9783a != 0) {
                    m9528g(matrixSource);
                }
                onBuilt();
                return matrixSource;
            }

            /* renamed from: g */
            public final void m9528g(MatrixSource matrixSource) {
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9712e;
            }

            /* renamed from: h */
            public final void m9529h(MatrixSource matrixSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9785c;
                if (repeatedFieldBuilderV3 != null) {
                    matrixSource.f9774a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9783a & 1) != 0) {
                    this.f9784b = Collections.unmodifiableList(this.f9784b);
                    this.f9783a &= -2;
                }
                matrixSource.f9774a = this.f9784b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7149b clear() {
                super.clear();
                this.f9783a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9785c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9784b = Collections.EMPTY_LIST;
                } else {
                    this.f9784b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9783a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9713f.ensureFieldAccessorsInitialized(MatrixSource.class, C7149b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7149b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7149b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7149b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7149b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7149b mo24685clone() {
                return (C7149b) super.mo24685clone();
            }

            /* renamed from: n */
            public final void m9534n() {
                if ((this.f9783a & 1) == 0) {
                    this.f9784b = new ArrayList(this.f9784b);
                    this.f9783a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public MatrixSource getDefaultInstanceForType() {
                return MatrixSource.m9484g();
            }

            /* renamed from: p */
            public int m9536p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9785c;
                return repeatedFieldBuilderV3 == null ? this.f9784b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m9537q() {
                if (this.f9785c == null) {
                    this.f9785c = new RepeatedFieldBuilderV3(this.f9784b, (this.f9783a & 1) != 0, getParentForChildren(), isClean());
                    this.f9784b = null;
                }
                return this.f9785c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7149b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    MatrixInfo matrixInfo = (MatrixInfo) codedInputStream.readMessage(MatrixInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9785c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m9534n();
                                        this.f9784b.add(matrixInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(matrixInfo);
                                    }
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
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7149b mergeFrom(Message message) {
                if (message instanceof MatrixSource) {
                    return m9540t((MatrixSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7149b m9540t(MatrixSource matrixSource) {
                if (matrixSource == MatrixSource.m9484g()) {
                    return this;
                }
                if (this.f9785c == null) {
                    if (!matrixSource.f9774a.isEmpty()) {
                        if (this.f9784b.isEmpty()) {
                            this.f9784b = matrixSource.f9774a;
                            this.f9783a &= -2;
                        } else {
                            m9534n();
                            this.f9784b.addAll(matrixSource.f9774a);
                        }
                        onChanged();
                    }
                } else if (!matrixSource.f9774a.isEmpty()) {
                    if (this.f9785c.isEmpty()) {
                        this.f9785c.dispose();
                        this.f9785c = null;
                        this.f9784b = matrixSource.f9774a;
                        this.f9783a &= -2;
                        this.f9785c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9537q() : null;
                    } else {
                        this.f9785c.addAllMessages(matrixSource.f9774a);
                    }
                }
                mergeUnknownFields(matrixSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7149b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7149b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7149b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7149b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7149b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7149b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7149b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7149b) super.setUnknownFields(unknownFieldSet);
            }

            public C7149b() {
                this.f9784b = Collections.EMPTY_LIST;
            }

            public C7149b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9784b = Collections.EMPTY_LIST;
            }
        }

        public MatrixSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9775b = (byte) -1;
        }

        private MatrixSource() {
            this.f9775b = (byte) -1;
            this.f9774a = Collections.EMPTY_LIST;
        }
    }

    public static final class TextSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final TextSource f9786c = new TextSource();

        /* renamed from: d */
        public static final Parser f9787d = new C7152a();

        /* renamed from: a */
        public List f9788a;

        /* renamed from: b */
        public byte f9789b;

        public static final class TextInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: e */
            public static final TextInfo f9790e = new TextInfo();

            /* renamed from: f */
            public static final Parser f9791f = new C7150a();

            /* renamed from: a */
            public int f9792a;

            /* renamed from: b */
            public volatile Object f9793b;

            /* renamed from: c */
            public EzyPaint.Paint f9794c;

            /* renamed from: d */
            public byte f9795d;

            /* renamed from: com.zykj.board.EzySource$TextSource$TextInfo$a */
            public class C7150a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TextInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7151b c7151bM9563w = TextInfo.m9563w();
                    try {
                        c7151bM9563w.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7151bM9563w.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7151bM9563w.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7151bM9563w.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7151bM9563w.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9726s;
            }

            /* renamed from: n */
            public static /* synthetic */ int m9561n(TextInfo textInfo, int i9) {
                int i10 = i9 | textInfo.f9792a;
                textInfo.f9792a = i10;
                return i10;
            }

            public static Parser parser() {
                return f9791f;
            }

            /* renamed from: q */
            public static TextInfo m9562q() {
                return f9790e;
            }

            /* renamed from: w */
            public static C7151b m9563w() {
                return f9790e.toBuilder();
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
                if (getContent().equals(textInfo.getContent()) && m9566v() == textInfo.m9566v()) {
                    return (!m9566v() || m9565u().equals(textInfo.m9565u())) && getUnknownFields().equals(textInfo.getUnknownFields());
                }
                return false;
            }

            public String getContent() {
                Object obj = this.f9793b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f9793b = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9791f;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9793b) ? GeneratedMessageV3.computeStringSize(1, this.f9793b) : 0;
                if ((1 & this.f9792a) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(2, m9565u());
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode();
                if (m9566v()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m9565u().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9727t.ensureFieldAccessorsInitialized(TextInfo.class, C7151b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9795d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9795d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new TextInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public TextInfo getDefaultInstanceForType() {
                return f9790e;
            }

            /* renamed from: u */
            public EzyPaint.Paint m9565u() {
                EzyPaint.Paint paint = this.f9794c;
                return paint == null ? EzyPaint.Paint.m9099t() : paint;
            }

            /* renamed from: v */
            public boolean m9566v() {
                return (this.f9792a & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f9793b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9793b);
                }
                if ((this.f9792a & 1) != 0) {
                    codedOutputStream.writeMessage(2, m9565u());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public C7151b newBuilderForType() {
                return m9563w();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C7151b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7151b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C7151b toBuilder() {
                return this == f9790e ? new C7151b() : new C7151b().m9585r(this);
            }

            /* renamed from: com.zykj.board.EzySource$TextSource$TextInfo$b */
            public static final class C7151b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9796a;

                /* renamed from: b */
                public Object f9797b;

                /* renamed from: c */
                public EzyPaint.Paint f9798c;

                /* renamed from: d */
                public SingleFieldBuilderV3 f9799d;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        m9571o();
                    }
                }

                /* renamed from: o */
                private SingleFieldBuilderV3 m9571o() {
                    if (this.f9799d == null) {
                        this.f9799d = new SingleFieldBuilderV3(m9581m(), getParentForChildren(), isClean());
                        this.f9798c = null;
                    }
                    return this.f9799d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C7151b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7151b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public TextInfo build() {
                    TextInfo textInfoBuildPartial = buildPartial();
                    if (textInfoBuildPartial.isInitialized()) {
                        return textInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) textInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public TextInfo buildPartial() {
                    TextInfo textInfo = new TextInfo(this);
                    if (this.f9796a != 0) {
                        m9575f(textInfo);
                    }
                    onBuilt();
                    return textInfo;
                }

                /* renamed from: f */
                public final void m9575f(TextInfo textInfo) {
                    int i9;
                    int i10 = this.f9796a;
                    if ((i10 & 1) != 0) {
                        textInfo.f9793b = this.f9797b;
                    }
                    if ((i10 & 2) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9799d;
                        textInfo.f9794c = singleFieldBuilderV3 == null ? this.f9798c : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    TextInfo.m9561n(textInfo, i9);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C7151b clear() {
                    super.clear();
                    this.f9796a = 0;
                    this.f9797b = "";
                    this.f9798c = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9799d;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f9799d = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9726s;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7151b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7151b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7151b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7151b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9727t.ensureFieldAccessorsInitialized(TextInfo.class, C7151b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7151b mo24685clone() {
                    return (C7151b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public TextInfo getDefaultInstanceForType() {
                    return TextInfo.m9562q();
                }

                /* renamed from: m */
                public EzyPaint.Paint m9581m() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9799d;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f9798c;
                    return paint == null ? EzyPaint.Paint.m9099t() : paint;
                }

                /* renamed from: n */
                public EzyPaint.Paint.C7123b m9582n() {
                    this.f9796a |= 2;
                    onChanged();
                    return (EzyPaint.Paint.C7123b) m9571o().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C7151b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f9797b = codedInputStream.readStringRequireUtf8();
                                        this.f9796a |= 1;
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(m9571o().getBuilder(), extensionRegistryLite);
                                        this.f9796a |= 2;
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
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7151b mergeFrom(Message message) {
                    if (message instanceof TextInfo) {
                        return m9585r((TextInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: r */
                public C7151b m9585r(TextInfo textInfo) {
                    if (textInfo == TextInfo.m9562q()) {
                        return this;
                    }
                    if (!textInfo.getContent().isEmpty()) {
                        this.f9797b = textInfo.f9793b;
                        this.f9796a |= 1;
                        onChanged();
                    }
                    if (textInfo.m9566v()) {
                        m9586s(textInfo.m9565u());
                    }
                    mergeUnknownFields(textInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C7151b m9586s(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9799d;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f9796a & 2) == 0 || (paint2 = this.f9798c) == null || paint2 == EzyPaint.Paint.m9099t()) {
                        this.f9798c = paint;
                    } else {
                        m9582n().m9121o(paint);
                    }
                    if (this.f9798c != null) {
                        this.f9796a |= 2;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C7151b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7151b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: u */
                public C7151b m9588u(String str) {
                    str.getClass();
                    this.f9797b = str;
                    this.f9796a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C7151b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7151b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: w */
                public C7151b m9590w(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9799d;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f9798c = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f9796a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7151b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7151b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public final C7151b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7151b) super.setUnknownFields(unknownFieldSet);
                }

                public C7151b() {
                    this.f9797b = "";
                    maybeForceBuilderInitialization();
                }

                public C7151b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9797b = "";
                    maybeForceBuilderInitialization();
                }
            }

            public TextInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9793b = "";
                this.f9795d = (byte) -1;
            }

            private TextInfo() {
                this.f9793b = "";
                this.f9795d = (byte) -1;
                this.f9793b = "";
            }
        }

        /* renamed from: com.zykj.board.EzySource$TextSource$a */
        public class C7152a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TextSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7153b c7153bM9549u = TextSource.m9549u();
                try {
                    c7153bM9549u.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7153bM9549u.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7153bM9549u.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7153bM9549u.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7153bM9549u.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9724q;
        }

        /* renamed from: k */
        public static TextSource m9548k() {
            return f9786c;
        }

        /* renamed from: u */
        public static C7153b m9549u() {
            return f9786c.toBuilder();
        }

        /* renamed from: x */
        public static TextSource m9550x(InputStream inputStream) {
            return (TextSource) GeneratedMessageV3.parseWithIOException(f9787d, inputStream);
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
            return m9553t().equals(textSource.m9553t()) && getUnknownFields().equals(textSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9787d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = 0;
            for (int i10 = 0; i10 < this.f9788a.size(); i10++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9788a.get(i10));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m9552q() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m9553t().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9725r.ensureFieldAccessorsInitialized(TextSource.class, C7153b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9789b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9789b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public TextSource getDefaultInstanceForType() {
            return f9786c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TextSource();
        }

        /* renamed from: q */
        public int m9552q() {
            return this.f9788a.size();
        }

        /* renamed from: t */
        public List m9553t() {
            return this.f9788a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7153b newBuilderForType() {
            return m9549u();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public C7153b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7153b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i9 = 0; i9 < this.f9788a.size(); i9++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9788a.get(i9));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C7153b toBuilder() {
            return this == f9786c ? new C7153b() : new C7153b().m9610t(this);
        }

        /* renamed from: com.zykj.board.EzySource$TextSource$b */
        public static final class C7153b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9800a;

            /* renamed from: b */
            public List f9801b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9802c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7153b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7153b) super.addRepeatedField(fieldDescriptor, obj);
            }

            /* renamed from: d */
            public C7153b m9595d(TextInfo.C7151b c7151b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9802c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7151b.build());
                    return this;
                }
                m9604n();
                this.f9801b.add(c7151b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public TextSource build() {
                TextSource textSourceBuildPartial = buildPartial();
                if (textSourceBuildPartial.isInitialized()) {
                    return textSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) textSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TextSource buildPartial() {
                TextSource textSource = new TextSource(this);
                m9599h(textSource);
                if (this.f9800a != 0) {
                    m9598g(textSource);
                }
                onBuilt();
                return textSource;
            }

            /* renamed from: g */
            public final void m9598g(TextSource textSource) {
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9724q;
            }

            /* renamed from: h */
            public final void m9599h(TextSource textSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9802c;
                if (repeatedFieldBuilderV3 != null) {
                    textSource.f9788a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9800a & 1) != 0) {
                    this.f9801b = Collections.unmodifiableList(this.f9801b);
                    this.f9800a &= -2;
                }
                textSource.f9788a = this.f9801b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7153b clear() {
                super.clear();
                this.f9800a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9802c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9801b = Collections.EMPTY_LIST;
                } else {
                    this.f9801b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9800a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9725r.ensureFieldAccessorsInitialized(TextSource.class, C7153b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7153b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7153b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7153b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7153b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7153b mo24685clone() {
                return (C7153b) super.mo24685clone();
            }

            /* renamed from: n */
            public final void m9604n() {
                if ((this.f9800a & 1) == 0) {
                    this.f9801b = new ArrayList(this.f9801b);
                    this.f9800a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public TextSource getDefaultInstanceForType() {
                return TextSource.m9548k();
            }

            /* renamed from: p */
            public int m9606p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9802c;
                return repeatedFieldBuilderV3 == null ? this.f9801b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m9607q() {
                if (this.f9802c == null) {
                    this.f9802c = new RepeatedFieldBuilderV3(this.f9801b, (this.f9800a & 1) != 0, getParentForChildren(), isClean());
                    this.f9801b = null;
                }
                return this.f9802c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7153b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TextInfo textInfo = (TextInfo) codedInputStream.readMessage(TextInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9802c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m9604n();
                                        this.f9801b.add(textInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(textInfo);
                                    }
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
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7153b mergeFrom(Message message) {
                if (message instanceof TextSource) {
                    return m9610t((TextSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7153b m9610t(TextSource textSource) {
                if (textSource == TextSource.m9548k()) {
                    return this;
                }
                if (this.f9802c == null) {
                    if (!textSource.f9788a.isEmpty()) {
                        if (this.f9801b.isEmpty()) {
                            this.f9801b = textSource.f9788a;
                            this.f9800a &= -2;
                        } else {
                            m9604n();
                            this.f9801b.addAll(textSource.f9788a);
                        }
                        onChanged();
                    }
                } else if (!textSource.f9788a.isEmpty()) {
                    if (this.f9802c.isEmpty()) {
                        this.f9802c.dispose();
                        this.f9802c = null;
                        this.f9801b = textSource.f9788a;
                        this.f9800a &= -2;
                        this.f9802c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9607q() : null;
                    } else {
                        this.f9802c.addAllMessages(textSource.f9788a);
                    }
                }
                mergeUnknownFields(textSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7153b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7153b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7153b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7153b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7153b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7153b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7153b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7153b) super.setUnknownFields(unknownFieldSet);
            }

            public C7153b() {
                this.f9801b = Collections.EMPTY_LIST;
            }

            public C7153b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9801b = Collections.EMPTY_LIST;
            }
        }

        public TextSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9789b = (byte) -1;
        }

        private TextSource() {
            this.f9789b = (byte) -1;
            this.f9788a = Collections.EMPTY_LIST;
        }
    }

    public static final class TouchSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final TouchSource f9803c = new TouchSource();

        /* renamed from: d */
        public static final Parser f9804d = new C7156a();

        /* renamed from: a */
        public List f9805a;

        /* renamed from: b */
        public byte f9806b;

        public static final class TouchInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: e */
            public static final TouchInfo f9807e = new TouchInfo();

            /* renamed from: f */
            public static final Parser f9808f = new C7154a();

            /* renamed from: a */
            public int f9809a;

            /* renamed from: b */
            public List f9810b;

            /* renamed from: c */
            public EzyPaint.Paint f9811c;

            /* renamed from: d */
            public byte f9812d;

            /* renamed from: com.zykj.board.EzySource$TouchSource$TouchInfo$a */
            public class C7154a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TouchInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7155b c7155bM9634x = TouchInfo.m9634x();
                    try {
                        c7155bM9634x.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7155bM9634x.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7155bM9634x.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7155bM9634x.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7155bM9634x.buildPartial());
                    }
                }
            }

            /* renamed from: a */
            public static /* synthetic */ int m9627a(TouchInfo touchInfo, int i9) {
                int i10 = i9 | touchInfo.f9809a;
                touchInfo.f9809a = i10;
                return i10;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f9710c;
            }

            public static Parser parser() {
                return f9808f;
            }

            /* renamed from: t */
            public static TouchInfo m9633t() {
                return f9807e;
            }

            /* renamed from: x */
            public static C7155b m9634x() {
                return f9807e.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C7155b toBuilder() {
                return this == f9807e ? new C7155b() : new C7155b().m9660u(this);
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
                if (getTouchEventList().equals(touchInfo.getTouchEventList()) && m9638w() == touchInfo.m9638w()) {
                    return (!m9638w() || m9637v().equals(touchInfo.m9637v())) && getUnknownFields().equals(touchInfo.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9808f;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                int iComputeMessageSize = 0;
                for (int i10 = 0; i10 < this.f9810b.size(); i10++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9810b.get(i10));
                }
                if ((this.f9809a & 1) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m9637v());
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getTouchEventCount() {
                return this.f9810b.size();
            }

            public List getTouchEventList() {
                return this.f9810b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getTouchEventCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTouchEventList().hashCode();
                }
                if (m9638w()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m9637v().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9711d.ensureFieldAccessorsInitialized(TouchInfo.class, C7155b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9812d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9812d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new TouchInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public TouchInfo getDefaultInstanceForType() {
                return f9807e;
            }

            /* renamed from: v */
            public EzyPaint.Paint m9637v() {
                EzyPaint.Paint paint = this.f9811c;
                return paint == null ? EzyPaint.Paint.m9099t() : paint;
            }

            /* renamed from: w */
            public boolean m9638w() {
                return (this.f9809a & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i9 = 0; i9 < this.f9810b.size(); i9++) {
                    codedOutputStream.writeMessage(1, (MessageLite) this.f9810b.get(i9));
                }
                if ((this.f9809a & 1) != 0) {
                    codedOutputStream.writeMessage(2, m9637v());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C7155b newBuilderForType() {
                return m9634x();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C7155b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7155b(builderParent);
            }

            /* renamed from: com.zykj.board.EzySource$TouchSource$TouchInfo$b */
            public static final class C7155b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9813a;

                /* renamed from: b */
                public List f9814b;

                /* renamed from: c */
                public RepeatedFieldBuilderV3 f9815c;

                /* renamed from: d */
                public EzyPaint.Paint f9816d;

                /* renamed from: e */
                public SingleFieldBuilderV3 f9817e;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getTouchEventFieldBuilder();
                        m9642r();
                    }
                }

                /* renamed from: r */
                private SingleFieldBuilderV3 m9642r() {
                    if (this.f9817e == null) {
                        this.f9817e = new SingleFieldBuilderV3(m9656p(), getParentForChildren(), isClean());
                        this.f9816d = null;
                    }
                    return this.f9817e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public final C7155b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7155b) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C7155b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7155b) super.addRepeatedField(fieldDescriptor, obj);
                }

                /* renamed from: d */
                public C7155b m9645d(EzyTouchEvent.TouchEvent.C7164b c7164b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9815c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c7164b.build());
                        return this;
                    }
                    ensureTouchEventIsMutable();
                    this.f9814b.add(c7164b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: e */
                public C7155b m9646e(EzyTouchEvent.TouchEvent touchEvent) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9815c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(touchEvent);
                        return this;
                    }
                    touchEvent.getClass();
                    ensureTouchEventIsMutable();
                    this.f9814b.add(touchEvent);
                    onChanged();
                    return this;
                }

                public final void ensureTouchEventIsMutable() {
                    if ((this.f9813a & 1) == 0) {
                        this.f9814b = new ArrayList(this.f9814b);
                        this.f9813a |= 1;
                    }
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public TouchInfo build() {
                    TouchInfo touchInfoBuildPartial = buildPartial();
                    if (touchInfoBuildPartial.isInitialized()) {
                        return touchInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public TouchInfo buildPartial() {
                    TouchInfo touchInfo = new TouchInfo(this);
                    m9650i(touchInfo);
                    if (this.f9813a != 0) {
                        m9649h(touchInfo);
                    }
                    onBuilt();
                    return touchInfo;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f9710c;
                }

                public final RepeatedFieldBuilderV3 getTouchEventFieldBuilder() {
                    if (this.f9815c == null) {
                        this.f9815c = new RepeatedFieldBuilderV3(this.f9814b, (this.f9813a & 1) != 0, getParentForChildren(), isClean());
                        this.f9814b = null;
                    }
                    return this.f9815c;
                }

                /* renamed from: h */
                public final void m9649h(TouchInfo touchInfo) {
                    int i9;
                    if ((this.f9813a & 2) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9817e;
                        touchInfo.f9811c = singleFieldBuilderV3 == null ? this.f9816d : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    TouchInfo.m9627a(touchInfo, i9);
                }

                /* renamed from: i */
                public final void m9650i(TouchInfo touchInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9815c;
                    if (repeatedFieldBuilderV3 != null) {
                        touchInfo.f9810b = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f9813a & 1) != 0) {
                        this.f9814b = Collections.unmodifiableList(this.f9814b);
                        this.f9813a &= -2;
                    }
                    touchInfo.f9810b = this.f9814b;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f9711d.ensureFieldAccessorsInitialized(TouchInfo.class, C7155b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7155b clear() {
                    super.clear();
                    this.f9813a = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9815c;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f9814b = Collections.EMPTY_LIST;
                    } else {
                        this.f9814b = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f9813a &= -2;
                    this.f9816d = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9817e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f9817e = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7155b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7155b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7155b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7155b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7155b mo24685clone() {
                    return (C7155b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public TouchInfo getDefaultInstanceForType() {
                    return TouchInfo.m9633t();
                }

                /* renamed from: p */
                public EzyPaint.Paint m9656p() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9817e;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f9816d;
                    return paint == null ? EzyPaint.Paint.m9099t() : paint;
                }

                /* renamed from: q */
                public EzyPaint.Paint.C7123b m9657q() {
                    this.f9813a |= 2;
                    onChanged();
                    return (EzyPaint.Paint.C7123b) m9642r().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C7155b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) codedInputStream.readMessage(EzyTouchEvent.TouchEvent.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9815c;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureTouchEventIsMutable();
                                            this.f9814b.add(touchEvent);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(touchEvent);
                                        }
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(m9642r().getBuilder(), extensionRegistryLite);
                                        this.f9813a |= 2;
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
                public C7155b mergeFrom(Message message) {
                    if (message instanceof TouchInfo) {
                        return m9660u((TouchInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: u */
                public C7155b m9660u(TouchInfo touchInfo) {
                    if (touchInfo == TouchInfo.m9633t()) {
                        return this;
                    }
                    if (this.f9815c == null) {
                        if (!touchInfo.f9810b.isEmpty()) {
                            if (this.f9814b.isEmpty()) {
                                this.f9814b = touchInfo.f9810b;
                                this.f9813a &= -2;
                            } else {
                                ensureTouchEventIsMutable();
                                this.f9814b.addAll(touchInfo.f9810b);
                            }
                            onChanged();
                        }
                    } else if (!touchInfo.f9810b.isEmpty()) {
                        if (this.f9815c.isEmpty()) {
                            this.f9815c.dispose();
                            this.f9815c = null;
                            this.f9814b = touchInfo.f9810b;
                            this.f9813a &= -2;
                            this.f9815c = GeneratedMessageV3.alwaysUseFieldBuilders ? getTouchEventFieldBuilder() : null;
                        } else {
                            this.f9815c.addAllMessages(touchInfo.f9810b);
                        }
                    }
                    if (touchInfo.m9638w()) {
                        m9661v(touchInfo.m9637v());
                    }
                    mergeUnknownFields(touchInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: v */
                public C7155b m9661v(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9817e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f9813a & 2) == 0 || (paint2 = this.f9816d) == null || paint2 == EzyPaint.Paint.m9099t()) {
                        this.f9816d = paint;
                    } else {
                        m9657q().m9121o(paint);
                    }
                    if (this.f9816d != null) {
                        this.f9813a |= 2;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public final C7155b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7155b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7155b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7155b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: y */
                public C7155b m9664y(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9817e;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f9816d = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f9813a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C7155b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7155b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                public C7155b() {
                    this.f9814b = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public C7155b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9814b = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }
            }

            public TouchInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9812d = (byte) -1;
            }

            private TouchInfo() {
                this.f9812d = (byte) -1;
                this.f9810b = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$TouchSource$a */
        public class C7156a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TouchSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7157b c7157bM9619u = TouchSource.m9619u();
                try {
                    c7157bM9619u.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7157bM9619u.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7157bM9619u.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7157bM9619u.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7157bM9619u.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f9708a;
        }

        /* renamed from: k */
        public static TouchSource m9618k() {
            return f9803c;
        }

        /* renamed from: u */
        public static C7157b m9619u() {
            return f9803c.toBuilder();
        }

        /* renamed from: x */
        public static TouchSource m9620x(InputStream inputStream) {
            return (TouchSource) GeneratedMessageV3.parseWithIOException(f9804d, inputStream);
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
            return m9623t().equals(touchSource.m9623t()) && getUnknownFields().equals(touchSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9804d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = 0;
            for (int i10 = 0; i10 < this.f9805a.size(); i10++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9805a.get(i10));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m9622q() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m9623t().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f9709b.ensureFieldAccessorsInitialized(TouchSource.class, C7157b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9806b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9806b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public TouchSource getDefaultInstanceForType() {
            return f9803c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TouchSource();
        }

        /* renamed from: q */
        public int m9622q() {
            return this.f9805a.size();
        }

        /* renamed from: t */
        public List m9623t() {
            return this.f9805a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7157b newBuilderForType() {
            return m9619u();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public C7157b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7157b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i9 = 0; i9 < this.f9805a.size(); i9++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9805a.get(i9));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C7157b toBuilder() {
            return this == f9803c ? new C7157b() : new C7157b().m9683t(this);
        }

        /* renamed from: com.zykj.board.EzySource$TouchSource$b */
        public static final class C7157b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9818a;

            /* renamed from: b */
            public List f9819b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9820c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C7157b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7157b) super.addRepeatedField(fieldDescriptor, obj);
            }

            /* renamed from: d */
            public C7157b m9668d(TouchInfo.C7155b c7155b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9820c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7155b.build());
                    return this;
                }
                m9677n();
                this.f9819b.add(c7155b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public TouchSource build() {
                TouchSource touchSourceBuildPartial = buildPartial();
                if (touchSourceBuildPartial.isInitialized()) {
                    return touchSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TouchSource buildPartial() {
                TouchSource touchSource = new TouchSource(this);
                m9672h(touchSource);
                if (this.f9818a != 0) {
                    m9671g(touchSource);
                }
                onBuilt();
                return touchSource;
            }

            /* renamed from: g */
            public final void m9671g(TouchSource touchSource) {
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f9708a;
            }

            /* renamed from: h */
            public final void m9672h(TouchSource touchSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9820c;
                if (repeatedFieldBuilderV3 != null) {
                    touchSource.f9805a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9818a & 1) != 0) {
                    this.f9819b = Collections.unmodifiableList(this.f9819b);
                    this.f9818a &= -2;
                }
                touchSource.f9805a = this.f9819b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7157b clear() {
                super.clear();
                this.f9818a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9820c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9819b = Collections.EMPTY_LIST;
                } else {
                    this.f9819b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9818a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f9709b.ensureFieldAccessorsInitialized(TouchSource.class, C7157b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7157b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7157b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7157b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7157b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7157b mo24685clone() {
                return (C7157b) super.mo24685clone();
            }

            /* renamed from: n */
            public final void m9677n() {
                if ((this.f9818a & 1) == 0) {
                    this.f9819b = new ArrayList(this.f9819b);
                    this.f9818a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public TouchSource getDefaultInstanceForType() {
                return TouchSource.m9618k();
            }

            /* renamed from: p */
            public int m9679p() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9820c;
                return repeatedFieldBuilderV3 == null ? this.f9819b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: q */
            public final RepeatedFieldBuilderV3 m9680q() {
                if (this.f9820c == null) {
                    this.f9820c = new RepeatedFieldBuilderV3(this.f9819b, (this.f9818a & 1) != 0, getParentForChildren(), isClean());
                    this.f9819b = null;
                }
                return this.f9820c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7157b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TouchInfo touchInfo = (TouchInfo) codedInputStream.readMessage(TouchInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9820c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m9677n();
                                        this.f9819b.add(touchInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(touchInfo);
                                    }
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
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7157b mergeFrom(Message message) {
                if (message instanceof TouchSource) {
                    return m9683t((TouchSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7157b m9683t(TouchSource touchSource) {
                if (touchSource == TouchSource.m9618k()) {
                    return this;
                }
                if (this.f9820c == null) {
                    if (!touchSource.f9805a.isEmpty()) {
                        if (this.f9819b.isEmpty()) {
                            this.f9819b = touchSource.f9805a;
                            this.f9818a &= -2;
                        } else {
                            m9677n();
                            this.f9819b.addAll(touchSource.f9805a);
                        }
                        onChanged();
                    }
                } else if (!touchSource.f9805a.isEmpty()) {
                    if (this.f9820c.isEmpty()) {
                        this.f9820c.dispose();
                        this.f9820c = null;
                        this.f9819b = touchSource.f9805a;
                        this.f9818a &= -2;
                        this.f9820c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9680q() : null;
                    } else {
                        this.f9820c.addAllMessages(touchSource.f9805a);
                    }
                }
                mergeUnknownFields(touchSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7157b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7157b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7157b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7157b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7157b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7157b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7157b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7157b) super.setUnknownFields(unknownFieldSet);
            }

            public C7157b() {
                this.f9819b = Collections.EMPTY_LIST;
            }

            public C7157b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9819b = Collections.EMPTY_LIST;
            }
        }

        public TouchSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9806b = (byte) -1;
        }

        private TouchSource() {
            this.f9806b = (byte) -1;
            this.f9805a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m9338u().getMessageTypes().get(0);
        f9708a = descriptor;
        f9709b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"TouchInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9710c = descriptor2;
        f9711d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TouchEvent", "Paint"});
        Descriptors.Descriptor descriptor3 = m9338u().getMessageTypes().get(1);
        f9712e = descriptor3;
        f9713f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MatrixInfo"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        f9714g = descriptor4;
        f9715h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Matrix"});
        Descriptors.Descriptor descriptor5 = m9338u().getMessageTypes().get(2);
        f9716i = descriptor5;
        f9717j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"FileInfo"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        f9718k = descriptor6;
        f9719l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Name", "Width", "Height", "Validate"});
        Descriptors.Descriptor descriptor7 = m9338u().getMessageTypes().get(3);
        f9720m = descriptor7;
        f9721n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AudioInfo"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        f9722o = descriptor8;
        f9723p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Name", "Duration", "Validate"});
        Descriptors.Descriptor descriptor9 = m9338u().getMessageTypes().get(4);
        f9724q = descriptor9;
        f9725r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"TextInfo"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        f9726s = descriptor10;
        f9727t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Content", "Paint"});
        Descriptors.Descriptor descriptor11 = m9338u().getMessageTypes().get(5);
        f9728u = descriptor11;
        f9729v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"GeometryInfo"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        f9730w = descriptor12;
        f9731x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"GeometryType", "Points", "Paint"});
        EzyTouchEvent.m9694g();
        EzyMatrix.m8838c();
        EzyPaint.m9092c();
        EzyPointF.m9134c();
        EzyGeometryEnum.m8603a();
    }

    /* renamed from: u */
    public static Descriptors.FileDescriptor m9338u() {
        return f9732y;
    }
}
